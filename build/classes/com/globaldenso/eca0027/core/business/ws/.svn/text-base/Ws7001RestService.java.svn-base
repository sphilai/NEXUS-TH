/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain;

/**
 * Interface for the Web Call Service (WS7001)
 * <br />Webサービス(WS7001)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws7001RestService {

    /**
     * Register the Shipping Actuality in a file on CIGMA by using the (WS7001) Web Services
     * <br />Webサービス(WS7001)を使用して、CIGMA上のファイルに船積実績を登録します。
     *
     * @param compCd - COMPANY CODE
     * @param param - information of Shipping Actuality
     * @return result domain of WS7001
     * @throws ApplicationException - If can not get the working day
     */
    public ResultDomain createShippingAct(String compCd, Ws7001ParamDomain param) throws ApplicationException;

}
