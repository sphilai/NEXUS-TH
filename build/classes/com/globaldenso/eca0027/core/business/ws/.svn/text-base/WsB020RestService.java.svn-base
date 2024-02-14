/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Call Service (WSB020)
 * <br />Webサービス(WSB020)呼出しサービスのインタフェースです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public interface WsB020RestService {

    /**
     * Notify to nightly batch processing of CIGMA that the batch EDI orders registration ended.
     * <br />CIGMA夜間バッチに、EDI受注登録バッチの終了を通知します。
     * 
     * @param rcvOdrCompCd - Code between bases of RECEIVE ORDER COMPANY
     * @param jobStatus - job status
     * @param callerJobId - source job ID
     * @return Execution result of the Web service
     * @throws ApplicationException - If an error occurs in the Web Services
     */
    public ResultDomain updateEdiRcvOdrStatus(String rcvOdrCompCd, String jobStatus, String callerJobId)
        throws ApplicationException;
}