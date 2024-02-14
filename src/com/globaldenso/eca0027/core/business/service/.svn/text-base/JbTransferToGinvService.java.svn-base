/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.aijb.core.business.domain.QueueInfDomain;
import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * This is Service of Job for Transferring Shipping Documents to GINV.
 * <br />船積書類GINV送信ジョブのサービスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14069 $
 */
public interface JbTransferToGinvService {

    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * Main process.
     * メイン処理。
     *
     * @param queueInfDomain Queue info domain
     * @return Only true
     * @throws ApplicationException Business exception
     */
    public boolean transactRequest(QueueInfDomain queueInfDomain) throws ApplicationException;
}
