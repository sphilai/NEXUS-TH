/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;

/**
 * DAO interface of the Web service to notify the CIGMA night batch state to NEXUS.
 * <br />NEXUSへCIGMA夜間バッチ状態を通知するWebサービスのDAOインタフェースです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface WsCigmaComnAuxDao {

    /**
     * Update of CIGMA Environment Master NIGHT_BAT_START_TIME.
     * <br />CIGMA環境原単位 NIGHT_BAT_START_TIME の更新
     * 
     * @param criteria The domain of search criteria<br />検索条件ドメイン
     * @return Update Counts<br />更新件数
     * @throws ApplicationException Search failed.<br />検索に失敗した場合
     */
    public int updateTmCigmaEnv (WsCigmaComnAuxCriteriaDomain criteria) 
        throws ApplicationException;
}