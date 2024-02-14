/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamDomain;

/**
 * Interface for the Web Call Service (WS7003)
 * <br />Webサービス(WS7003)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws7003RestService {

    /**
     * Update the Shipping Actuality in a file on CIGMA by using the (WS7003) Web Services
     * <br />Webサービス(WS7003)を使用して、CIGMA上のファイルの船積実績を更新します。
     *
     * @param compCd - COMPANY CODE
     * @param param - Invoice information
     * @return result domain of WS7003
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain updateShippingAct(String compCd, Ws7003ParamDomain param) throws ApplicationException;

}
