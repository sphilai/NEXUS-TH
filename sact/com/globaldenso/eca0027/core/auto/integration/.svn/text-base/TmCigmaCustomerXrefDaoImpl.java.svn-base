/*
 * PROJECT：eca0027
 * 
 * TmCigmaCustomerXref のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;


/**
 * TmCigmaCustomerXref のDAO実装クラスです。<BR>
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
public class TmCigmaCustomerXrefDaoImpl extends SqlMapClientDaoSupport implements TmCigmaCustomerXrefDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaCustomerXrefDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain searchByKey(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaCustomerXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaCustomerXref.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaCustomerXrefDomain> searchByCondition(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaCustomerXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaCustomerXref.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaCustomerXrefDomain> searchByConditionForPaging(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaCustomerXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaCustomerXref.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaCustomerXref.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain searchByKeyForChange(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaCustomerXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaCustomerXref.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain lockByKey(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaCustomerXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaCustomerXref.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public TmCigmaCustomerXrefDomain lockByKeyNoWait(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaCustomerXrefDomain)getSqlMapClientTemplate()
                .queryForObject("TmCigmaCustomerXref.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain)
     */
    public void create(TmCigmaCustomerXrefDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCigmaCustomerXref.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain)
     */
    public int update(TmCigmaCustomerXrefDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCigmaCustomerXref.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaCustomerXrefDomain domain, TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCigmaCustomerXref.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int delete(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaCustomerXref.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaCustomerXrefDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaCustomerXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaCustomerXref.DeleteByCondition", criteria);
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
