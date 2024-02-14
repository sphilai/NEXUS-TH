/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Service (Ws6007)
 * 
 * @author $Author: A.Chonthicha $
 * @version $Revision: $
 */
public interface Ws6007AsiaRestService {

    /**
     * Submit DIAS Re-invoice job by using the Ws6007 Web Services
     *
     * @param compCd - COMPANY CODE
     * @param invoiceNo - Invoice No. for re-invoice job parameter
     * @return result domain of WS6007
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain submitReInvoiceJob(String compCd
        , String invoiceNo) throws ApplicationException;
}

