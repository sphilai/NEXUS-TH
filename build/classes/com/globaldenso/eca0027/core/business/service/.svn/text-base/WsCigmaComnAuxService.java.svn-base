/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;


import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;
/**
 * Interface of the Service WsNotifyNightBatchStatus.
 * <br />WsNotifyNightBatchStatus のServiceのインタフェースです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface WsCigmaComnAuxService {

    /**
     * Update the CIGMA Environment Master.
     * <br />CIGMA環境原単位の更新します。
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not update the CIGMA Environment Master<br />
     * CIGMA環境原単位の更新ができない場合
     */
    public int updateNightBatStat(WsCigmaComnAuxCriteriaDomain criteria) 
        throws ApplicationException;
    
}
