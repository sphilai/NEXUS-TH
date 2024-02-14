/*
 * PROJECT：eca0027
 * 
 * TmCmlInvPattern のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain;


/**
 * TmCmlInvPattern のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCmlInvPatternDaoImpl extends SqlMapClientDaoSupport implements TmCmlInvPatternDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCmlInvPatternDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain searchByKey(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (TmCmlInvPatternDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCmlInvPattern.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCmlInvPatternDomain> searchByCondition(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCmlInvPatternDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCmlInvPattern.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCmlInvPatternDomain> searchByConditionForPaging(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCmlInvPatternDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCmlInvPattern.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int searchCount(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCmlInvPattern.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain searchByKeyForChange(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (TmCmlInvPatternDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCmlInvPattern.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain lockByKey(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (TmCmlInvPatternDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCmlInvPattern.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public TmCmlInvPatternDomain lockByKeyNoWait(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return (TmCmlInvPatternDomain)getSqlMapClientTemplate()
                .queryForObject("TmCmlInvPattern.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain)
     */
    public void create(TmCmlInvPatternDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCmlInvPattern.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain)
     */
    public int update(TmCmlInvPatternDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCmlInvPattern.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCmlInvPatternDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int updateByCondition(TmCmlInvPatternDomain domain, TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCmlInvPattern.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int delete(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCmlInvPattern.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCmlInvPatternDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCmlInvPatternCriteriaDomain)
     */
    public int deleteByCondition(TmCmlInvPatternCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCmlInvPattern.DeleteByCondition", criteria);
    }

    /**
     * 条件付更新パラメーターMapを生成するメソッドです。<br>
     * 
     * @param domain 更新対象Domain
     * @param criteria 更新条件Domain
     * @return 条件付更新パラメーターMap
     */
    private Map<String, Object> getUpdateByConditionMap(Object domain, Object criteria) {
        
        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();
        
        // 更新項目をマップに設定する
        updateByConditionMap.put("condition", criteria);
        // 更新条件をマップに設定する
        updateByConditionMap.put("domain", domain);
        
        return updateByConditionMap;
    }

}
