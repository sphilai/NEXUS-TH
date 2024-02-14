/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamDomain;

/**
 * Interface for the Web Call Service (WS6005)
 * <br />Webサービス(WS6005)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws6005RestService {

    /**
     * Update the invoiceDB interface table of CIGMA by using the (WS6005) Web Services
     * <br />Webサービス(WS6005)を使用して、CIGMAのInvoiceDB用のテーブルの更新を行います。
     *
     * @param compCd - COMPANY CODE
     * @param param - Part of specification information units belonging to one invoice
     * @return result domain of WS6005
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain registInvoiceDb(String compCd, Ws6005ParamDomain param) throws ApplicationException;

}