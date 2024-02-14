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
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;

/**
 * Interface for the Web Call Service (WsB005)
 * <br />Webサービス(WsB005)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB005RestService {

    /**
     * Get the check result and supplement result by using the (WsB005) Web Services
     * <br />Webサービス(WsB005)を使用して、チェック結果、補完結果を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param customerNoLegacy - CUSTOMER CODE
     * @param shipToNoLegacy - SHIP TO
     * @param shippingDateDate - SHIPPING DATE
     * @param indexList - index list
     * @param partNoList - list of item No.
     * @return result domain of WsB005
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB005ResultDomain searchEdiOdrLastDigChgDtl(String compCd, 
        String customerNoLegacy,
        String shipToNoLegacy,
        Date shippingDateDate,
        List<String> indexList,
        List<String> partNoList) throws ApplicationException;

}