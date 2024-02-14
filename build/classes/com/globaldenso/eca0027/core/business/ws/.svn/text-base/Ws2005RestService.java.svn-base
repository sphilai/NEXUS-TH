/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;

/**
 * Interface for the Web Call Service (WS2005) <br />
 * Webサービス(WS2005)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws2005RestService {

    /**
     * <p>Get the Orders Allowance Information using the (WS2005) Web Services <br />
     * Webサービス(WS2005)を使用して、受注引当の情報を登録します。</p>
     *
     * @param compCd - COMPANY CODE
     * @param nightFlg - night Flag (Y: night / N: daytime)
     * @param ws2005ParamDomain - Parameter domain of WS2005 Web Service (Include a list of order information)
     * @return Result Domain
     * @throws ApplicationException - If an error occurs in the Web Services
     */
    public ResultDomain createRcvOdrAlloc(String compCd, String nightFlg,
        Ws2005ParamDomain ws2005ParamDomain) throws ApplicationException;

}
