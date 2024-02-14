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
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;

/**
 * Interface for the Web Call Service (WsB001) <br />
 * Webサービス(WsB001)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB001RestService {

    /**
     * Get the check result and supplement result by using the (WsB001) Web Services <br />
     * Webサービス(WsB001)を使用して、チェック結果、補完結果を取得します。
     * 
     * <pre>
     * (1) Check the header portion of the order information from the non-EDI customer entered on the screen
     * (2) Returned check result and supplement to the service using side.
     * 
     * (1)画面上で入力された非EDI得意先からの受注情報のうちヘッダ部分をチェックする。
     * (2)チェック結果、補完結果をサービス利用側へ返す。
     * </pre>
     * 
     * @param compCd - COMPANY CODE
     * @param customerNoLegacy - CUSTOMER CODE
     * @param shipToNoLegacy - SHIP TO CODE
     * @param partNo - Item No.
     * @param pkgCode - PACKAGE CODE
     * @param startDt date of the start acquisition of ETD candidate
     * @return result domain of WsB001
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB001ResultDomain searchOdrEntryHdrOnHand(String compCd, String customerNoLegacy, 
        String shipToNoLegacy, String partNo, String pkgCode, Date startDt) throws ApplicationException;

}