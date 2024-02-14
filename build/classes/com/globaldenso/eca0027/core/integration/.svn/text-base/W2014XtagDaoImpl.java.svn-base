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
import com.globaldenso.eca0027.core.business.dao.W2014XtagDao;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;

/**
 * This is an implement class of X Palletize DAO.
 * <br />まとめパレタイズDAOの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9618 $
 */
public class W2014XtagDaoImpl extends SqlMapClientDaoSupport implements W2014XtagDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2014XtagDaoImpl() {
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#deleteTwXpltz(java.util.List)
     */
    public int deleteTwXpltz(List<? extends W2014PltzDomain> pltzList) throws ApplicationException {
        
        return getSqlMapClientTemplate()
            .delete("W2014Xtag.DeleteTwXpltz", pltzList);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#lockTtPltz(java.util.List)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> lockTtPltz(List<? extends W2014PltzDomain> pltzList)
        throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.LockTtPltz", pltzList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchCountTtpltz(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    public int searchCountTtpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException {
        
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W2014Xtag.SearchCountTtpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchCountTtXpltz(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    public int searchCountTtXpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException {
        
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W2014Xtag.SearchCountTtXpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchForPagingTtpltz(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> searchForPagingTtpltz(
        W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchForPagingTtpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchForPagingTtXpltz(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014XtagDomain> searchForPagingTtXpltz(
        W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        return (List<W2014XtagDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchForPagingTtXpltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTmPkgSetDtl(com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> searchTmPkgSetDtl(W2014PltzCriteriaDomain criteria)
        throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchTmPkgSetDtl", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTmPkgSetDtlByRtTyp(com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> searchTmPkgSetDtlByRtTyp(W2014PltzCriteriaDomain criteria)
        throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchTmPkgSetDtlByRtTyp", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTtPltzByTotalShipper(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> searchTtPltzByTotalShipper(
        W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchTtPltzByTotalShipper", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTtPltzByWeight(com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2014PltzDomain> searchTtPltzByWeight(
        W2014PltzCriteriaDomain criteria) throws ApplicationException {
        
        return (List<W2014PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W2014Xtag.SearchTtPltzByWeight", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTtXpltzByMain(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W2014XtagDomain searchTtXpltzByMain(
        W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        return (W2014XtagDomain) getSqlMapClientTemplate()
            .queryForObject("W2014Xtag.SearchTtXpltzByMain", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#searchTwXpltzByCleate(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    public W2014XtagDomain searchTwXpltzByCleate(
        W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        return (W2014XtagDomain) getSqlMapClientTemplate()
            .queryForObject("W2014Xtag.SearchTwXpltzByCleate", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2014XtagDao#updateTtPltzByXmainMark(com.globaldenso.eca0027.core.business.domain.W2014PltzDomain, java.util.List)
     */
    
    public int updateTtPltzByXmainMark(W2014PltzDomain domain, List<? extends W2014PltzCriteriaDomain> criteriaList)
        throws ApplicationException {
        
        Map<String, Object> pltzListMap = getUpdateByConditionMap(domain, criteriaList);
        return getSqlMapClientTemplate()
            .update("W2014Xtag.UpdateTtPltzByXmainMark", pltzListMap);
    }
    
    /**
     * This is a method which generates the conditional update parameter Map.
     * <br />条件付更新パラメーターMapを生成するメソッドです。
     * 
     * @param domain update object Domain<br />更新対象Domain
     * @param criteriaList update condition Domain<br />更新条件Domain
     * @return conditional update parameter Map<br />条件付更新パラメーターMap
     */
    protected Map<String, Object> getUpdateByConditionMap(Object domain, Object criteriaList) {
        
        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();
        
        // update item is set as a map.
        // 更新項目をマップに設定する
        updateByConditionMap.put("domain", domain);
        // update conditions are set as a map.
        // 更新条件をマップに設定する
        updateByConditionMap.put("condition", criteriaList);
        
        return updateByConditionMap;
    }
}
