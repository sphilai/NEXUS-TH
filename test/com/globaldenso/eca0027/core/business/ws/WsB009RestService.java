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
 * Webサービス(WsB009)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB009RestService {

    /**
     * Webサービス(WsB009)を使用して、CIGMAからNEXUSのAI-JBジョブであるEDI受注登録を実行します。
     *
     * 
     * @param rcvOdrCompCd 会社コード
     * @param cigmaAds 業務日付 (CIGMA ADS)
     * @return 結果ドメイン
     * @throws ApplicationException Webサービス提供側でエラーが発生した場合
     */
    public ResultDomain callEdiOdrEntryJob(String rcvOdrCompCd, Date cigmaAds)
        throws ApplicationException;

}