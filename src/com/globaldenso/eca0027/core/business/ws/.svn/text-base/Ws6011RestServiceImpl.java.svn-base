/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws6011ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6011ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS6011)
 * <br />Webサービス(Ws6011)呼出しサービスの実装クラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public class Ws6011RestServiceImpl implements Ws6011RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     */
    public Ws6011RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws6011RestService#getCustomerItemInfo(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws6011ParamDomain)
     */
    public Ws6011ResultDomain getCustomerItemInfo(String compCd, Ws6011ParamDomain param) throws ApplicationException {

        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, "ws6011");
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(param));
        try {
            // Call web service.
            Ws6011ResultDomain ws6011ResultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws6011ResultDomain>(){});
            if (WS_RESULT_ERROR_SYSTEM.equals(ws6011ResultDomain.getResultCode())) {
                throw new SystemException(NXS_91_0001); // NXS-91-0001 : System side trouble has occur.
            } else if (WS_RESULT_ERROR.equals(ws6011ResultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(ws6011ResultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060); // NXS-E1-0060 : Function will be limited during CIGMA Night Batch.
                } else if (!ws6011ResultDomain.getErrorList().isEmpty()) {
                    throw new GscmApplicationException(ws6011ResultDomain.getErrorList().get(0).getErrorCode());
                } else {
                    throw new SystemException(NXS_91_0001); // NXS-91-0001 : System side trouble has occur.
                }
            }
            return ws6011ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
