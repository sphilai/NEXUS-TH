/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;

/**
 * The DAO implementation class of User Id MA.
 * <br /> User Id MA DAOの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9004UserIdMaDaoImpl extends SqlMapClientDaoSupport implements W9004UserIdMaDao {
    
    /**
     * constructor.
     *
     */
    public W9004UserIdMaDaoImpl(){
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchCountForPagingTmUserId(W9004UserIdMaCriteriaDomain)
     */
    public int searchCountForPagingTmUserId(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9004UserIdMa.SearchCountForPagingTmUserId", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchForPagingTmUserId(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaItemDomain> searchForPagingTmUserId(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchForPagingTmUserId", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#lockByNoWaitTmUser(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> lockByNoWaitTmUser(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.LockByNoWaitTmUser", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTmUser(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public W9004UserIdMaDomain searchTmUser(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException{
        return (W9004UserIdMaDomain) getSqlMapClientTemplate()
            .queryForObject("W9004UserIdMa.SearchTmUser", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchCountTmUser(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public int searchCountTmUser(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9004UserIdMa.SearchCountTmUser", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTmNxsCompByPlant(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTmNxsCompByPlant", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtByArea(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtByArea", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgt(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtReferMode(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtReferModeByCompany(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtReferModeByCompany", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtReferModeByPlant(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtReferModeByPlant(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtReferModeByPlant", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtByComp(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByComp(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtByComp", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtByPlant(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtByPlant", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#lockByNoWaitTtUserAuthMgtByDscId(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> lockByNoWaitTtUserAuthMgtByDscId(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.LockByNoWaitTtUserAuthMgtByDscId", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#updateTmUser(W9004UserIdMaDomain, W9004UserIdMaCriteriaDomain)
     */
    public int updateTmUser(W9004UserIdMaDomain domain, W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
            .update("W9004UserIdMa.UpdateTmUser", updateByConditionMap);
    }
    
    /**
     * Create conditionalupdate parameter Map.
     * <br />条件付更新パラメーターMapを生成するメソッドです。<br />
     * 
     * @param domain update domain
     * <br />更新対象Domain
     * @param criteria criteria domain
     * <br />更新条件Domain
     * @return Conditional update parameter Map
     * <br />条件付更新パラメーターMap
     */
    protected Map<String, Object> getUpdateByConditionMap(Object domain, Object criteria) {
        
        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();
        
        updateByConditionMap.put("condition", criteria);
        updateByConditionMap.put("domain", domain);
        
        return updateByConditionMap;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchTtUserAuthMgtByPlantAuth(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByPlantAuth (W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W9004UserIdMaDomain>) getSqlMapClientTemplate()
            .queryForList("W9004UserIdMa.SearchTtUserAuthMgtByPlantAuth", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao#searchCountTmUserByDscId(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public int searchCountTmUserByDscId (W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9004UserIdMa.SearchCountTmUserByDscId", criteria);
    }
}
