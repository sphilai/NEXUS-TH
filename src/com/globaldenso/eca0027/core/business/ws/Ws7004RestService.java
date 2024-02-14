/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Call Service (WS7004)
 * <br />Webサービス(WS7004)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws7004RestService {

    /**
     * Delete the Shipping Actuality in a file on CIGMA by using the (WS7004) Web Services
     * <br />Webサービス(WS7004)を使用して、CIGMA上のファイルの船積実績を削除します。
     *
     * @param compCd - COMPANY CODE
     * @param invoiceNoDelete - Invoice No.
     * @return result domain of WS7004
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain deleteShippingAct(String compCd, String invoiceNoDelete) throws ApplicationException;

}
