/*
 * PROJECT：eca0027
 * 
 * TmNxsWh のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;


/**
 * TmNxsWh のDAO実装クラスです。<BR>
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
public class TmNxsWhDaoImpl extends SqlMapClientDaoSupport implements TmNxsWhDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsWhDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain searchByKey(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsWhDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsWh.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsWhDomain> searchByCondition(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsWhDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsWh.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsWhDomain> searchByConditionForPaging(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsWhDomain>)getSqlMapClientTemplate()
                    .queryForList("TmNxsWh.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int searchCount(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmNxsWh.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain searchByKeyForChange(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsWhDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsWh.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain lockByKey(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsWhDomain)getSqlMapClientTemplate()
                    .queryForObject("TmNxsWh.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public TmNxsWhDomain lockByKeyNoWait(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return (TmNxsWhDomain)getSqlMapClientTemplate()
                .queryForObject("TmNxsWh.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain)
     */
    public void create(TmNxsWhDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmNxsWh.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain)
     */
    public int update(TmNxsWhDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmNxsWh.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int updateByCondition(TmNxsWhDomain domain, TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmNxsWh.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int delete(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsWh.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     */
    public int deleteByCondition(TmNxsWhCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmNxsWh.DeleteByCondition", criteria);
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
