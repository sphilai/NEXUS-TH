/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS2004) <br />
 * Webサービス(WS2004)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class Ws2004RestServiceImpl implements Ws2004RestService  {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。
     */
    public Ws2004RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws2004RestService#searchItemInfoForCml(java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String)
     */
    public Ws2004ResultDomain searchItemInfoForCml(String compCd, List<String> plantCdList,
        String whCd, List<String> itemNoList, String customerCd) throws ApplicationException {

        String webServicePath = "ws2004";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // リストをカンマ区切り文字列に変換する
        String plantCd = "";
        if (plantCdList != null) {
            plantCd = StringUtils.join(plantCdList.iterator(), ",");
        }
        String itemNo = "";
        if (itemNoList != null) {
            itemNo = StringUtils.join(itemNoList.iterator(), ",");
        }

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("plantCd", plantCd);
        wsCallerRestDomain.setParamMap("whCd", whCd);
        wsCallerRestDomain.setParamMap("itemNo", itemNo);
        wsCallerRestDomain.setParamMap("customerCd", customerCd);

        try {
            // Webサービスを呼び出す
            Ws2004ResultDomain ws2004ResultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2004ResultDomain>(){});
            
            if (!WS_RESULT_SUCCESS.equals(ws2004ResultDomain.getResultCode())) {
                if (WS_RESULT_ERROR_SYSTEM.equals(ws2004ResultDomain.getResultCode())) {
                    throw new SystemException(NXS_E1_0058);
                } else {
                    if (!CollectionUtils.isEmpty(ws2004ResultDomain.getErrorList())) {
                        ErrorListItemDomain errorListItem = ws2004ResultDomain.getErrorList().get(0);
                        
                        if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                            List<Object> params = new ArrayList<Object>();
                            for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                                params.add(param.getParam());
                            }
                            throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                        } else {
                            throw new GscmApplicationException(errorListItem.getErrorCode());
                        }
                    } else {
                        throw new SystemException(NXS_E1_0058);
                    }
                }
            }

            return ws2004ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
