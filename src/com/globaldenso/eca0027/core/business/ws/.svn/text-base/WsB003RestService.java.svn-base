/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Call Service (WsB003)
 * <br />Webサービス(WsB003)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB003RestService {

    /**
     * Get the check result and supplement result by using the (WsB003) Web Services
     * <br />Webサービス(WsB003)を使用して、チェック結果、補完結果を取得します。
     * 
     * @param compCd - COMPANY CODE
     * @param customerNoLegacy - CUSTOMER CODE
     * @param shipToNoLegacy - SHIP TO
     * @param transportationCode - TRANSPORT CODE
     * @param shippingDate - SHIPPING DATE
     * @param partNoOrg - CUSTOMER ITEM NO ORIGINAL
     * @param pkgCode - PACKAGE CODE
     * @return result domain
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain searchEdiOdrLastDigChgHdr(
        String compCd,
        String customerNoLegacy, 
        String shipToNoLegacy,
        String transportationCode, 
        Date shippingDate, 
        String partNoOrg,
        String pkgCode) throws ApplicationException;

}