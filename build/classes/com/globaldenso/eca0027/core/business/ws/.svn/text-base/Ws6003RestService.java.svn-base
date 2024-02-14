/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;

/**
 * Interface for the Web Call Service (WS6003)
 * <br />Webサービス(WS6003)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws6003RestService {

    /**
     * Get the information of shipping documents MA by using the (WS6003) Web Services
     * <br />Webサービス(WS6003)を使用して、出荷書類MAの情報を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param customerNoLegacy - Customers NO
     * @return result domain of WS6003
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws6003ResultDomain getShippingDocInfo(String compCd, String customerNoLegacy) throws ApplicationException;

}
