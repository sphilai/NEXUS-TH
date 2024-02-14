/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws6011ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6011ResultDomain;

/**
 * Interface for the Web Call Service (WS6011)
 * <br />Webサービス(WS6011)呼出しサービスのインタフェースです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public interface Ws6011RestService {

    /**
     * Get the item information by using the (WS6011) Web Services
     * <br />Webサービス(WS6011)を使用して品番の情報を取得します。
     *
     * @param compCd - shipper company code
     * @param param - parameter domain
     * @return result domain of Ws6011
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public Ws6011ResultDomain getCustomerItemInfo(String compCd, Ws6011ParamDomain param) throws ApplicationException;

}
