/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;

/**
 * The DAO implementation class of Agent MA.
 * <br />Agent MA DAOの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W9002AgentMaDaoImpl extends SqlMapClientDaoSupport implements W9002AgentMaDao {
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9002AgentMaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao#searchCountTmAgent(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTmAgent(W9002AgentMaCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9002AgentMa.SearchCountTmAgent", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao#searchTmAgent(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9002AgentMaItemDomain> searchTmAgent(W9002AgentMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9002AgentMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9002AgentMa.SearchTmAgent", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao#lockByNoWaitTtUserAuthMgt(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9002AgentMaDomain> lockByNoWaitTtUserAuthMgt(W9002AgentMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9002AgentMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9002AgentMa.LockByNoWaitTtUserAuthMgt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao#deleteTtUserAuthMgt(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int deleteTtUserAuthMgt(W9002AgentMaCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
            .delete("W9002AgentMa.DeleteTtUserAuthMgt", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao#searchCountTtUserAuthMgt(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public int searchCountTtUserAuthMgt(W9002AgentMaCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9002AgentMa.SearchCountTtUserAuthMgt", criteria);
    }
}
