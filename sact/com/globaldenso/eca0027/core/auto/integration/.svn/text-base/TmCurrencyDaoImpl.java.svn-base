/*
 * PROJECT：eca0027
 * 
 * TmCurrency のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain;


/**
 * TmCurrency のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/28 13:48:44<BR>
 * 
 * テーブル定義から2014/04/28に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmCurrencyDaoImpl extends SqlMapClientDaoSupport implements TmCurrencyDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCurrencyDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain searchByKey(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (TmCurrencyDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCurrency.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCurrencyDomain> searchByCondition(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCurrencyDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCurrency.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCurrencyDomain> searchByConditionForPaging(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCurrencyDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCurrency.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int searchCount(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCurrency.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain searchByKeyForChange(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (TmCurrencyDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCurrency.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain lockByKey(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (TmCurrencyDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCurrency.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public TmCurrencyDomain lockByKeyNoWait(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return (TmCurrencyDomain)getSqlMapClientTemplate()
                .queryForObject("TmCurrency.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain)
     */
    public void create(TmCurrencyDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCurrency.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain)
     */
    public int update(TmCurrencyDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCurrency.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int updateByCondition(TmCurrencyDomain domain, TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCurrency.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int delete(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCurrency.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCurrencyDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCurrencyCriteriaDomain)
     */
    public int deleteByCondition(TmCurrencyCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCurrency.DeleteByCondition", criteria);
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
