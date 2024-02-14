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
import com.globaldenso.eca0027.core.business.domain.WsB010ResultDomain;

/**
 * Interface for the Web Call Service (WSB010)
 * <br />Webサービス(WSB010)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB010RestService {

    /**
     * Get information of CUSTOMER SUBSIDIARY by using the (WSB010) Web Services
     * <br />Webサービス(WSB010)を使用して、得意先輸出入拠点情報を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param customerSubsidiaryCode - CUSTOMER SUBSIDIARY CODE
     * @return result domain of WsB010
     * @throws ApplicationException - If an error occurs in the Web Services
     */
    public WsB010ResultDomain getCusSubInfo(String compCd, String customerSubsidiaryCode) throws ApplicationException;

}