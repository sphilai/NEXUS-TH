/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS6002)
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10171 $
 */
public class Ws6002AsiaRestServiceImpl implements Ws6002AsiaRestService {

    /**
     * common service
     */
    private CommonService commonService;

    /**
     * constructor. 
     */
    public Ws6002AsiaRestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws6002AsiaRestService#cancelSalesOdrInvntry(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public ResultDomain cancelSalesOdrInvntry(String compCd
        , String normalInvoiceNo
        , String cancelInvoiceNo
        , Date invoiceIssueDt
        , String libPgm
        , String jobHost
        , String jobUser
        , String jobPassword
        , String jobDescription
        , String cancelReInvoiceNo) throws ApplicationException {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        String webServicePath = "ws6002";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        wsCallerRestDomain.setParamMap("normalInvoiceNo", normalInvoiceNo);
        wsCallerRestDomain.setParamMap("cancelInvoiceNo", cancelInvoiceNo);
        if (invoiceIssueDt != null) {
            wsCallerRestDomain.setParamMap("invoiceIssueDt", df.format(invoiceIssueDt));
        }
        wsCallerRestDomain.setParamMap("libPgm", libPgm);
        wsCallerRestDomain.setParamMap("jobHost", jobHost);
        wsCallerRestDomain.setParamMap("jobUser", jobUser);
        wsCallerRestDomain.setParamMap("jobPassword", jobPassword);
        wsCallerRestDomain.setParamMap("jobDescription", jobDescription);
        wsCallerRestDomain.setParamMap("cancelReInvoiceNo", cancelReInvoiceNo);

        try {
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
