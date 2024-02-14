/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.WsB002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

/**
 * The implementation class for the Web Call Service (WSB002) <br />
 * Webサービス(WSB002)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB002RestServiceImpl implements WsB002RestService {

    /**
      * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.  <br />
     * デフォルトコンストラクタです。
     */
    public WsB002RestServiceImpl() {
    }

    /**
     * Setter method for commonService <br />
     * commonService のセッターメソッドです。
     *
     * @param commonService - set to commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB002RestService#searchOdrEntryDtlOnHand(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List)
     */
    public WsB002ResultDomain searchOdrEntryDtlOnHand(
        String compCd,
        String customerNoLegacy, 
        String shipToNoLegacy, 
        String partNo, 
        String pkgCode, 
        String transportationCode, 
        List<String> indexList,
        List<Date> etdDueDtList,
        List<String> customerItemNoList) throws ApplicationException {
        
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        // ドメイン作成
        WsB002ParamDomain wsB002ParamDomain = new WsB002ParamDomain();
        wsB002ParamDomain.setCustomerNoLegacy(customerNoLegacy);
        wsB002ParamDomain.setShipToNoLegacy(shipToNoLegacy);
        wsB002ParamDomain.setPartNo(partNo);
        wsB002ParamDomain.setPkgCode(pkgCode);
        wsB002ParamDomain.setTransportationCode(transportationCode);
        
        //ドメインアイテムリスト作成
        List<WsB002ParamItemDomain> detailList = new ArrayList<WsB002ParamItemDomain>();
        for (int i = 0; i < indexList.size(); i++) {
            String index = indexList.get(i);
            Date etdDueDtDate = etdDueDtList.get(i);
            String etdDueDt = df.format(etdDueDtDate);
            String customerItemNo = customerItemNoList.get(i);
            
            WsB002ParamItemDomain itemDomain = new WsB002ParamItemDomain();
            itemDomain.setIndex(index);
            itemDomain.setEtd(etdDueDt);
            itemDomain.setCustomerPartNo(customerItemNo);
            
            detailList.add(itemDomain);
        }
        
        wsB002ParamDomain.setDetailList(detailList);
        
        // 検索処理
        final String webServicePath = "wsb002";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("wsb002Param", XmlUtil.marshal(wsB002ParamDomain));

        try {
            // Webサービスを呼び出す
            WsB002ResultDomain resultDomain
                = (WsB002ResultDomain)WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<WsB002ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(resultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(resultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
