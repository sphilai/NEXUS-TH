/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS6003)
 * <br />Webサービス(WS6003)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class Ws6003RestServiceImpl implements Ws6003RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public Ws6003RestServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6003RestService#getShippingDocInfo(java.lang.String, java.lang.String)
     */
    public Ws6003ResultDomain getShippingDocInfo(String compCd, String customerNoLegacy) throws ApplicationException {

        String webServicePath = "ws6003";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("customerNoLegacy", customerNoLegacy);

        try {
            // Webサービスを呼び出す
            Ws6003ResultDomain resultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws6003ResultDomain>(){});
            
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                    throw new SystemException(NXS_E1_0058);
                } else {
                    if (!CollectionUtils.isEmpty(resultDomain.getErrorList())) {
                        ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                        
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

            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}
