/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2021 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.integration.TmPortDaoImpl;

/**
 * The search dao implementation class of WT008 Port Select Screen.
 * Expanded SACT DAO.
 * <br />
 * WT008 Port Select画面のDAO実装クラスです。
 * SACTのDAOを拡張。
 * 
 * NL040 ADD
 *
 * @author $Author$
 * @version $Revision$
 */
public class Wt008PortSelectDaoImpl extends TmPortDaoImpl {

    /**
     * constructor.
     */
    public Wt008PortSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     */
    @SuppressWarnings("unchecked")
    public List<TmPortDomain> searchByConditionForPaging(TmPortCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPortDomain>)getSqlMapClientTemplate()
            .queryForList("TmPort.SearchByConditionForPagingWt008", criteria);
    }

    /**
     * {@inheritDoc}.
     */
    public int searchCount(TmPortCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
            .queryForObject("TmPort.SearchCountWt008", criteria);
        return cnt;
    }
}
