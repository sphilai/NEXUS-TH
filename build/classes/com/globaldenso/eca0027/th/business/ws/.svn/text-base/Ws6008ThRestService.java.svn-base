/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.th.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Service (Ws6008)
 * 
 * @author $Author: A.Chonthicha $
 * @version $Revision: $
 */
public interface Ws6008ThRestService {

    /**
     * Register Excise Tax table in CIGMA by using the Ws6008 Web Services
     *
     * @param compCd - COMPANY CODE
     * @param normalInvoiceNo - Normal Invoice No. object of cancellation
     * @return result domain of WS6006
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain registerExciseTax(String compCd
        , String normalInvoiceNo) throws ApplicationException;
}

