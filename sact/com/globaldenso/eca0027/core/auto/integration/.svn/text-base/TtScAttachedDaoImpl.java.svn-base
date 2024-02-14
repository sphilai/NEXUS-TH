/*
 * PROJECT：eca0027
 * 
 * TtScAttached のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain;


/**
 * TtScAttached のDAO実装クラスです。<BR>
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
public class TtScAttachedDaoImpl extends SqlMapClientDaoSupport implements TtScAttachedDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtScAttachedDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain searchByKey(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtScAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScAttached.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtScAttachedDomain> searchByCondition(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (List<TtScAttachedDomain>)getSqlMapClientTemplate()
                    .queryForList("TtScAttached.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtScAttachedDomain> searchByConditionForPaging(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (List<TtScAttachedDomain>)getSqlMapClientTemplate()
                    .queryForList("TtScAttached.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int searchCount(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtScAttached.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain searchByKeyForChange(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtScAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScAttached.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain lockByKey(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtScAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtScAttached.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public TtScAttachedDomain lockByKeyNoWait(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtScAttachedDomain)getSqlMapClientTemplate()
                .queryForObject("TtScAttached.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain)
     */
    public void create(TtScAttachedDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtScAttached.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain)
     */
    public int update(TtScAttachedDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtScAttached.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int updateByCondition(TtScAttachedDomain domain, TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtScAttached.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int delete(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtScAttached.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtScAttachedDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScAttachedCriteriaDomain)
     */
    public int deleteByCondition(TtScAttachedCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtScAttached.DeleteByCondition", criteria);
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
