/*
 * PROJECT：eca0027
 * 
 * TmItemTypXref のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain;


/**
 * TmItemTypXref のDAO実装クラスです。<BR>
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
public class TmItemTypXrefDaoImpl extends SqlMapClientDaoSupport implements TmItemTypXrefDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmItemTypXrefDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain searchByKey(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmItemTypXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmItemTypXref.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmItemTypXrefDomain> searchByCondition(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmItemTypXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmItemTypXref.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmItemTypXrefDomain> searchByConditionForPaging(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmItemTypXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmItemTypXref.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int searchCount(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmItemTypXref.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain searchByKeyForChange(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmItemTypXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmItemTypXref.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain lockByKey(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmItemTypXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmItemTypXref.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public TmItemTypXrefDomain lockByKeyNoWait(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmItemTypXrefDomain)getSqlMapClientTemplate()
                .queryForObject("TmItemTypXref.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain)
     */
    public void create(TmItemTypXrefDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmItemTypXref.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain)
     */
    public int update(TmItemTypXrefDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmItemTypXref.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmItemTypXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int updateByCondition(TmItemTypXrefDomain domain, TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmItemTypXref.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int delete(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmItemTypXref.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmItemTypXrefDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmItemTypXrefCriteriaDomain)
     */
    public int deleteByCondition(TmItemTypXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmItemTypXref.DeleteByCondition", criteria);
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
