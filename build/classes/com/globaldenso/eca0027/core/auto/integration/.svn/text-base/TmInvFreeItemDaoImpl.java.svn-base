/*
 * PROJECT：eca0027
 * 
 * TmInvFreeItem のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;


/**
 * TmInvFreeItem のDAO実装クラスです。<BR>
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
public class TmInvFreeItemDaoImpl extends SqlMapClientDaoSupport implements TmInvFreeItemDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvFreeItemDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain searchByKey(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (TmInvFreeItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvFreeItem.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvFreeItemDomain> searchByCondition(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvFreeItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvFreeItem.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvFreeItemDomain> searchByConditionForPaging(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvFreeItemDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvFreeItem.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int searchCount(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmInvFreeItem.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain searchByKeyForChange(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (TmInvFreeItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvFreeItem.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain lockByKey(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (TmInvFreeItemDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvFreeItem.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public TmInvFreeItemDomain lockByKeyNoWait(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return (TmInvFreeItemDomain)getSqlMapClientTemplate()
                .queryForObject("TmInvFreeItem.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain)
     */
    public void create(TmInvFreeItemDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmInvFreeItem.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain)
     */
    public int update(TmInvFreeItemDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmInvFreeItem.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int updateByCondition(TmInvFreeItemDomain domain, TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmInvFreeItem.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int delete(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvFreeItem.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvFreeItemDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain)
     */
    public int deleteByCondition(TmInvFreeItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvFreeItem.DeleteByCondition", criteria);
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
