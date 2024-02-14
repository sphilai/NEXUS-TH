/*
 * PROJECT：eca0027
 * 
 * TmActualItemWeight のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/11/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain;


/**
 * TmActualItemWeight のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/11/05 17:39:47<BR>
 * 
 * テーブル定義から2014/11/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmActualItemWeightDaoImpl extends SqlMapClientDaoSupport implements TmActualItemWeightDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmActualItemWeightDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain searchByKey(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (TmActualItemWeightDomain)getSqlMapClientTemplate()
                    .queryForObject("TmActualItemWeight.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmActualItemWeightDomain> searchByCondition(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (List<TmActualItemWeightDomain>)getSqlMapClientTemplate()
                    .queryForList("TmActualItemWeight.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmActualItemWeightDomain> searchByConditionForPaging(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (List<TmActualItemWeightDomain>)getSqlMapClientTemplate()
                    .queryForList("TmActualItemWeight.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int searchCount(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmActualItemWeight.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain searchByKeyForChange(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (TmActualItemWeightDomain)getSqlMapClientTemplate()
                    .queryForObject("TmActualItemWeight.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain lockByKey(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (TmActualItemWeightDomain)getSqlMapClientTemplate()
                    .queryForObject("TmActualItemWeight.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public TmActualItemWeightDomain lockByKeyNoWait(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return (TmActualItemWeightDomain)getSqlMapClientTemplate()
                .queryForObject("TmActualItemWeight.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain)
     */
    public void create(TmActualItemWeightDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmActualItemWeight.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain)
     */
    public int update(TmActualItemWeightDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmActualItemWeight.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int updateByCondition(TmActualItemWeightDomain domain, TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmActualItemWeight.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int delete(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmActualItemWeight.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmActualItemWeightDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain)
     */
    public int deleteByCondition(TmActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmActualItemWeight.DeleteByCondition", criteria);
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
