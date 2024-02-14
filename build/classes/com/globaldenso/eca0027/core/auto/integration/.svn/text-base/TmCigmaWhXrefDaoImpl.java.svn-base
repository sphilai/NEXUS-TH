/*
 * PROJECT：eca0027
 * 
 * TmCigmaWhXref のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;


/**
 * TmCigmaWhXref のDAO実装クラスです。<BR>
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
public class TmCigmaWhXrefDaoImpl extends SqlMapClientDaoSupport implements TmCigmaWhXrefDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaWhXrefDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain searchByKey(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaWhXref.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaWhXrefDomain> searchByCondition(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaWhXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaWhXref.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaWhXrefDomain> searchByConditionForPaging(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaWhXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaWhXref.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaWhXref.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain searchByKeyForChange(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaWhXref.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain lockByKey(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaWhXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaWhXref.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public TmCigmaWhXrefDomain lockByKeyNoWait(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaWhXrefDomain)getSqlMapClientTemplate()
                .queryForObject("TmCigmaWhXref.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain)
     */
    public void create(TmCigmaWhXrefDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCigmaWhXref.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain)
     */
    public int update(TmCigmaWhXrefDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCigmaWhXref.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaWhXrefDomain domain, TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCigmaWhXref.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int delete(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaWhXref.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaWhXrefDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaWhXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaWhXref.DeleteByCondition", criteria);
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
