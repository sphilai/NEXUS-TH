/*
 * PROJECT：eca0027
 * 
 * TwXpltz のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain;


/**
 * TwXpltz のDAO実装クラスです。<BR>
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
public class TwXpltzDaoImpl extends SqlMapClientDaoSupport implements TwXpltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwXpltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain searchByKey(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TwXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwXpltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwXpltzDomain> searchByCondition(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwXpltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwXpltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwXpltzDomain> searchByConditionForPaging(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TwXpltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TwXpltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int searchCount(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwXpltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain searchByKeyForChange(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TwXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwXpltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain lockByKey(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TwXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TwXpltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public TwXpltzDomain lockByKeyNoWait(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TwXpltzDomain)getSqlMapClientTemplate()
                .queryForObject("TwXpltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain)
     */
    public void create(TwXpltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwXpltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain)
     */
    public int update(TwXpltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwXpltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int updateByCondition(TwXpltzDomain domain, TwXpltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwXpltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int delete(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwXpltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwXpltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain)
     */
    public int deleteByCondition(TwXpltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwXpltz.DeleteByCondition", criteria);
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
