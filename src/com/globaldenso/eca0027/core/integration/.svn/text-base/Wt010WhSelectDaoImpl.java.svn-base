/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2021 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.integration.TmNxsWhDaoImpl;

/**
 * The search dao implementation class of W/H Select Screen.
 * Expanded SACT DAO.
 * <br />
 * W/H Select画面のDAO実装クラスです。
 * SACTのDAOを拡張。
 * 
 * NL040 ADD
 *
 * @author $Author$
 * @version $Revision$
 */
public class Wt010WhSelectDaoImpl extends TmNxsWhDaoImpl {

    /**
     * constructor.
     */
    public Wt010WhSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsWhDomain> searchByConditionForPaging(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsWhDomain>)getSqlMapClientTemplate()
            .queryForList("TmNxsWh.SearchByConditionForPagingWt010", criteria);
    }

    /**
     * {@inheritDoc}.
     */
    public int searchCount(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
            .queryForObject("TmNxsWh.SearchCountWt010", criteria);
        return cnt;
    }
}
