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
import com.globaldenso.eca0027.core.business.domain.WsB005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
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
 * The implementation class for the Web Call Service (WSB005) <br />
 * Webサービス(WSB005)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB005RestServiceImpl implements WsB005RestService {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.  <br />
     * デフォルトコンストラクタです。
     */
    public WsB005RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB005RestService#searchEdiOdrLastDigChgDtl(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.List, java.util.List)
     */
    public WsB005ResultDomain searchEdiOdrLastDigChgDtl(String compCd, 
        String customerNoLegacy,
        String shipToNoLegacy,
        Date shippingDateDate,
        List<String> indexList,
        List<String> partNoList) throws ApplicationException {
        
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        String shippingDate = df.format(shippingDateDate);
        
        //ドメインの作成
        WsB005ParamDomain wsB005ParamDomain = new WsB005ParamDomain();
        wsB005ParamDomain.setCustomerNoLegacy(customerNoLegacy);
        wsB005ParamDomain.setShipToNoLegacy(shipToNoLegacy);
        wsB005ParamDomain.setShippingDate(shippingDate);
        
        // ドメインアイテムの作成
        List<WsB005ParamItemDomain> lastDigitChangeDetailList = new ArrayList<WsB005ParamItemDomain>();
        for (int i = 0; i < indexList.size(); i++) {
            WsB005ParamItemDomain itemDomain = new WsB005ParamItemDomain();
            
            String index = indexList.get(i);
            String partNo = partNoList.get(i);
            
            itemDomain.setIndex(index);
            itemDomain.setPartNo(partNo);
            
            lastDigitChangeDetailList.add(itemDomain);
        }
        
        wsB005ParamDomain.setLastDigitChangeDetailList(lastDigitChangeDetailList);
        
        final String webServicePath = "wsb005";
        
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("wsb005Param", XmlUtil.marshal(wsB005ParamDomain));

        try {
            // Webサービスを呼び出す
            WsB005ResultDomain resultDomain
                = (WsB005ResultDomain)WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<WsB005ResultDomain>(){});
            
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
