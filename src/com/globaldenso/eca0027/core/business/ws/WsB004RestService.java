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
import com.globaldenso.eca0027.core.business.domain.WsB004ResultDomain;

/**
 * Interface for the Web Call Service (WsB004) <br />
 * Webサービス(WsB004)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB004RestService {

    /**
     * Get the check result and supplement result by using the (WsB004) Web Services <br />
     * Webサービス(WsB004)を使用して、チェック結果、補完結果を取得します。 <br />
     * 
     * <pre>
     * (1)Get the list of item No. at the end different from CIGMA inventory file, and returns to the service using side.
     * (1)CIGMA在庫ファイルから末尾違いの品目番号リストを取得し、サービス利用側へ返す。
     * </pre>
     * 
     * @param compCd - COMPANY CODE
     * @param partNo - item No.
     * @return result domain of WsB004
     * @throws ApplicationException - If an error occurs in the Web Services
     */
    public WsB004ResultDomain searchEdiOdrLastDigChgCandidate(String compCd, String partNo)
        throws ApplicationException;

}