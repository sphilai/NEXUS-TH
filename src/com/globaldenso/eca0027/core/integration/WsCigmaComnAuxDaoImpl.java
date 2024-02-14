/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WsCigmaComnAuxDao;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;

/**
 * The DAO implementation class for the Web service to notify the CIGMA night batch state to NEXUS.
 * <br />NEXUSへCIGMA夜間バッチ状態を通知するWebサービスのDAO実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class WsCigmaComnAuxDaoImpl extends SqlMapClientDaoSupport implements WsCigmaComnAuxDao {

    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsCigmaComnAuxDaoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsCigmaComnAuxDao#updateTmCigmaEnv(WsCigmaComnAuxCriteriaDomain)
     */
    public int updateTmCigmaEnv(WsCigmaComnAuxCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("WsCigmaComnAux.UpdateTmCigmaEnv", criteria);
    }
}
