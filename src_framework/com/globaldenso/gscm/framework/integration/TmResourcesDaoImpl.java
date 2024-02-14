/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmResources のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.gscm.framework.business.dao.TmResourcesDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmResourcesDomain;


/**
 * TmResources のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmResourcesDaoImpl extends SqlMapClientDaoSupport implements TmResourcesDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmResourcesDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#searchByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain searchByKey(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (TmResourcesDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmResources.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#searchByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmResourcesDomain> searchByCondition(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (List<TmResourcesDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmResources.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#searchByConditionForPaging(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmResourcesDomain> searchByConditionForPaging(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (List<TmResourcesDomain>)getSqlMapClientTemplate()
                    .queryForList("GscmTmResources.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#searchCount(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int searchCount(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("GscmTmResources.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#searchByKeyForChange(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain searchByKeyForChange(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (TmResourcesDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmResources.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#lockByKey(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain lockByKey(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (TmResourcesDomain)getSqlMapClientTemplate()
                    .queryForObject("GscmTmResources.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#lockByKeyNoWait(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public TmResourcesDomain lockByKeyNoWait(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return (TmResourcesDomain)getSqlMapClientTemplate()
                .queryForObject("GscmTmResources.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#create(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain)
     */
    public void create(TmResourcesDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("GscmTmResources.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#update(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain)
     */
    public int update(TmResourcesDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("GscmTmResources.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#updateByCondition(com.globaldenso.gscm.framework.business.domain.TmResourcesDomain, com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int updateByCondition(TmResourcesDomain domain, TmResourcesCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("GscmTmResources.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#delete(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int delete(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmResources.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.dao.TmResourcesDao#deleteByCondition(com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain)
     */
    public int deleteByCondition(TmResourcesCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("GscmTmResources.DeleteByCondition", criteria);
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