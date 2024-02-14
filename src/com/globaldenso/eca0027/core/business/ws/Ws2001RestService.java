/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;

/**
 * Interface for the web call service (WS2001) <br />
 * Webサービス(WS2001)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws2001RestService {

    /**
     * <p>Get a working day in the specified range with the (WS2001) Web service <br />
     * Webサービス(WS2001)を使用して、指定された範囲の稼働日を取得します。</p>
     *
     * @param compCd - COMPANY CODE
     * @param baseDate - base date
     * @param beforeDays - number of working days to get before the base date
     * @param afterDays - number of working days to get after the base date
     * @return result domain of W2001
     * @throws ApplicationException - if the working day is not acquired
     */
    public Ws2001ResultDomain searchWorkingDay(String compCd, Date baseDate, int beforeDays,
        int afterDays) throws ApplicationException;

}
