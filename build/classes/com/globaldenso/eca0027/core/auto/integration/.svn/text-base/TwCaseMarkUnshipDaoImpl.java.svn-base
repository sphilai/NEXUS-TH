/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkUnship のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain;


/**
 * TwCaseMarkUnship のDAO実装クラスです。<BR>
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
public class TwCaseMarkUnshipDaoImpl extends SqlMapClientDaoSupport implements TwCaseMarkUnshipDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwCaseMarkUnshipDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain searchByKey(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkUnshipDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkUnship.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkUnshipDomain> searchByCondition(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkUnshipDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkUnship.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwCaseMarkUnshipDomain> searchByConditionForPaging(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (List<TwCaseMarkUnshipDomain>)getSqlMapClientTemplate()
                    .queryForList("TwCaseMarkUnship.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int searchCount(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkUnship.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain searchByKeyForChange(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkUnshipDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkUnship.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain lockByKey(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkUnshipDomain)getSqlMapClientTemplate()
                    .queryForObject("TwCaseMarkUnship.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public TwCaseMarkUnshipDomain lockByKeyNoWait(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return (TwCaseMarkUnshipDomain)getSqlMapClientTemplate()
                .queryForObject("TwCaseMarkUnship.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain)
     */
    public void create(TwCaseMarkUnshipDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwCaseMarkUnship.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain)
     */
    public int update(TwCaseMarkUnshipDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwCaseMarkUnship.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkUnshipDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int updateByCondition(TwCaseMarkUnshipDomain domain, TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwCaseMarkUnship.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int delete(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCaseMarkUnship.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwCaseMarkUnshipDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkUnshipCriteriaDomain)
     */
    public int deleteByCondition(TwCaseMarkUnshipCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwCaseMarkUnship.DeleteByCondition", criteria);
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
