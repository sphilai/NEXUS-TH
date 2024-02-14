/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;

/**
 * Interface for the Web Call Service (WS6001)
 * <br />Webサービス(WS6001)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws6001RestService {

    /**
     * Update the sales, orders and stock of CIGMA by using the (WS6001) Web Services
     * <br />Webサービス(WS6001)を使用して、CIGMAの売上・受注・在庫の更新を行います。
     *
     * @param compCd - COMPANY CODE
     * @param param - Part of specification information units belonging to one invoice
     * @return result domain of WS6001
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain registSalesOdrInvntry(String compCd, Ws6001ParamDomain param) throws ApplicationException;

}
