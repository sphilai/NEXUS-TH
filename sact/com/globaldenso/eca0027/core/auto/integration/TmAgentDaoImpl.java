/*
 * PROJECT：eca0027
 * 
 * TmAgent のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;


/**
 * TmAgent のDAO実装クラスです。<BR>
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
public class TmAgentDaoImpl extends SqlMapClientDaoSupport implements TmAgentDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmAgentDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain searchByKey(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (TmAgentDomain)getSqlMapClientTemplate()
                    .queryForObject("TmAgent.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmAgentDomain> searchByCondition(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (List<TmAgentDomain>)getSqlMapClientTemplate()
                    .queryForList("TmAgent.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmAgentDomain> searchByConditionForPaging(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (List<TmAgentDomain>)getSqlMapClientTemplate()
                    .queryForList("TmAgent.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int searchCount(TmAgentCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmAgent.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain searchByKeyForChange(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (TmAgentDomain)getSqlMapClientTemplate()
                    .queryForObject("TmAgent.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain lockByKey(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (TmAgentDomain)getSqlMapClientTemplate()
                    .queryForObject("TmAgent.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public TmAgentDomain lockByKeyNoWait(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return (TmAgentDomain)getSqlMapClientTemplate()
                .queryForObject("TmAgent.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain)
     */
    public void create(TmAgentDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmAgent.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain)
     */
    public int update(TmAgentDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmAgent.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int updateByCondition(TmAgentDomain domain, TmAgentCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmAgent.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int delete(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmAgent.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmAgentDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain)
     */
    public int deleteByCondition(TmAgentCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmAgent.DeleteByCondition", criteria);
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
