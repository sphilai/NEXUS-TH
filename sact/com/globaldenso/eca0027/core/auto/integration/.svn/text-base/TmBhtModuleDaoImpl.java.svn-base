/*
 * PROJECT：eca0027
 * 
 * TmBhtModule のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain;


/**
 * TmBhtModule のDAO実装クラスです。<BR>
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
public class TmBhtModuleDaoImpl extends SqlMapClientDaoSupport implements TmBhtModuleDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtModuleDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain searchByKey(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtModuleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtModule.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtModuleDomain> searchByCondition(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtModuleDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtModule.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtModuleDomain> searchByConditionForPaging(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtModuleDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtModule.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int searchCount(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmBhtModule.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain searchByKeyForChange(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtModuleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtModule.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain lockByKey(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtModuleDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtModule.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public TmBhtModuleDomain lockByKeyNoWait(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtModuleDomain)getSqlMapClientTemplate()
                .queryForObject("TmBhtModule.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain)
     */
    public void create(TmBhtModuleDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmBhtModule.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain)
     */
    public int update(TmBhtModuleDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmBhtModule.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int updateByCondition(TmBhtModuleDomain domain, TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmBhtModule.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int delete(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtModule.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtModuleDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain)
     */
    public int deleteByCondition(TmBhtModuleCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtModule.DeleteByCondition", criteria);
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
