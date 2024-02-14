/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.th.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.eca0027.th.business.domain.Ws6008ThParamDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class of Web Service (Ws6008)
 * 
 * @author $Author: A.Chonthicha $
 * @version $Revision: 7289 $
 */
public class Ws6008ThRestServiceImpl implements Ws6008ThRestService {

    /**
     * common service
     */
    private CommonService commonService;

    /**
     * <p>tmCigmaEnvService</p>
     */
    private TmCigmaEnvService tmCigmaEnvService;

    /**
     * Default constructor. 
     */
    public Ws6008ThRestServiceImpl() {
    }

    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>Setter method for tmCigmaEnvService.</p>
     *
     * @param tmCigmaEnvService tmCigmaEnvService 
     */
    public void setTmCigmaEnvService(TmCigmaEnvService tmCigmaEnvService) {
        this.tmCigmaEnvService = tmCigmaEnvService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6008ThRestService#registerExciseTax(java.lang.String, java.lang.String)
     */
    public ResultDomain registerExciseTax(String compCd, String normalInvoiceNo) 
        throws ApplicationException {

        String webServicePath = "ws6008";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        Ws6008ThParamDomain ws6008ThParam = new Ws6008ThParamDomain();
        ws6008ThParam.setInvoiceNo(normalInvoiceNo);

        TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
        criteria.setCompCd(compCd);
        TmCigmaEnvDomain result = tmCigmaEnvService.searchByKey(criteria);
        ws6008ThParam.setLibPgm(result.getLibPgm());
        ws6008ThParam.setJobDesc(result.getJobDescription());
        ws6008ThParam.setJobHost(result.getJobHost());
        ws6008ThParam.setJobUser(result.getJobUser());
        ws6008ThParam.setJobPassword(result.getJobPassword());

        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(ws6008ThParam));

        try {
            // Call Web Service Ws6008
            ResultDomain resultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<ResultDomain>(){});

            if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(resultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }

            if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }

            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}