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
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;

/**
 * Interface for the Web Call Service (WsB002) <br />
 * Webサービス(WsB002)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB002RestService {

    /**
     * Get the check result and supplement result by using the (WsB002) Web Services
     * <br />Webサービス(WsB002)を使用して、チェック結果、補完結果を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param customerNoLegacy - CUSTOMER CODE
     * @param shipToNoLegacy - LEGACY SHIP TO
     * @param partNo - Item No.
     * @param pkgCode - PACKAGE CODE
     * @param transportationCode - TRANSPORT CODE
     * @param indexList - Detail line index
     * @param etdDueDtList - The shipping deadline
     * @param customerItemNoList - CUSTOMER ITEM NO
     * @return result domain of WsB002
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB002ResultDomain searchOdrEntryDtlOnHand(
        String compCd, 
        String customerNoLegacy, 
        String shipToNoLegacy,
        String partNo, 
        String pkgCode, 
        String transportationCode, 
        List<String> indexList,
        List<Date> etdDueDtList,
        List<String> customerItemNoList) throws ApplicationException;

}