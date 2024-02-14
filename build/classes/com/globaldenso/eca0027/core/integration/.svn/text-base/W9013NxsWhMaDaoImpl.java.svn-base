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
 * The search dao implementation class of NEXUS W/H MA Inquiry Screen.
 * Expanded SACT DAO.
 * <br />
 * NEXUS W/H MA Inquiry画面のDAO実装クラスです。
 * SACTのDAOを拡張。
 * 
 * NL040 ADD
 *
 * @author $Author$
 * @version $Revision$
 */
public class W9013NxsWhMaDaoImpl extends TmNxsWhDaoImpl {

    /**
     * constructor.
     */
    public W9013NxsWhMaDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsWhDomain> searchByConditionForPaging(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsWhDomain>)getSqlMapClientTemplate()
            .queryForList("TmNxsWh.SearchByConditionForPagingW9013", criteria);
    }

    /**
     * {@inheritDoc}.
     */
    public int searchCount(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
            .queryForObject("TmNxsWh.SearchCountW9013", criteria);
        return cnt;
    }
}
