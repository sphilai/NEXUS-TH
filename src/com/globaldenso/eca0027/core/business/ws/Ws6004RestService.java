/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultDomain;

/**
 * Interface for the Web Call Service (WS6004)
 * <br />Webサービス(WS6004)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws6004RestService {

    /**
     * Get the Unit price information MA by using the (WS6004) Web Services
     * <br />Webサービス(WS6004)を使用して、単価情報MAの情報を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param param - Item No. Information
     * @return result domain of WS6004
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws6004ResultDomain getSalesPriceInfo(String compCd, Ws6004ParamDomain param) throws ApplicationException;

}
