/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ResultDomain;

/**
 * Interface for the Web Call Service (WS7002)
 * <br />Webサービス(WS7002)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws7002RestService {

    /**
     * Get the status of Shipping Actuality on CIGMA by using the (WS7002) Web Services
     * <br />Webサービス(WS7002)を使用して、CIGMA上の船積実績データのステータスを取得します。
     *
     * @param compCd - COMPANY CODE
     * @param param - Invoice to be checked
     * @return result domain of WS7002
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws7002ResultDomain getShippingActStat(String compCd, Ws7002ParamDomain param) throws ApplicationException;

}
