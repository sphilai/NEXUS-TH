/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS7002)
 * <br />Webサービス(WS7002)呼出しサービスの実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 14351 $
 */
public class Ws7002RestServiceImpl implements Ws7002RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public Ws7002RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws7002RestService#getShippingActStat(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain)
     */
    public Ws7002ResultDomain getShippingActStat(String compCd, Ws7002ParamDomain param) throws ApplicationException {

        String webServicePath = "ws7002";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(param));

        try {
            // Webサービスを呼び出す
            // NL006 CHG get->put
            Ws7002ResultDomain ws7002ResultDomain
                = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws7002ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(ws7002ResultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(ws7002ResultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(ws7002ResultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }

            return ws7002ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}
