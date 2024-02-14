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
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;

/**
 * Interface for the Web Call Service (WSB008)
 * <br />Webサービス(WSB008)呼出しサービスのインタフェースです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public interface WsB008RestService {

    /**
     * Get the new LINC information in EDI Receive Order by using the (WSB008) Web Services
     * <br />Webサービス(WSB008)を使用して、EDI受注の新LINC情報を取得します。
     * 
     * @param receivingCompanyCode - inter-DENSO COMPANY CODE of RECEIVE ORDER COMPANY
     * @param newLincSubsidiaryCode - NEW LINC SUBSIDIARY CODE
     * @param callerJobId - source job ID
     * @return result domain of WsB008
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB008ResultDomain getEdiOdrLincData(String receivingCompanyCode, String newLincSubsidiaryCode, String callerJobId)
        throws ApplicationException;
}