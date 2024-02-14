/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB011ResultDomain;

/**
 * Interface for the Web Call Service (WsB011)
 * <br />Webサービス(WsB011)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB011RestService {

    /**
     * Customer and Shipper will be determined whether the EDI support subsidiary in each other by using the (WSB010) Web Services
     * <br />Webサービス(WsB011)を使用して、Shipper、Customerが相互にEDI対応拠点であるかを判定します。
     * 
     * @param compCd - COMPANY CODE
     * @param customerSubsidiaryCode - CUSTOMER SUBSIDIARY CODE
     * @param shipToNoLegacy - SHIP TO CODE
     * @return result domain of WsB011
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB011ResultDomain searchEdiSupport(String compCd, String customerSubsidiaryCode, String shipToNoLegacy)
        throws ApplicationException;

}