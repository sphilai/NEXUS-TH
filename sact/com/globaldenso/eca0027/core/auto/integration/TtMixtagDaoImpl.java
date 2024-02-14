/*
 * PROJECT：eca0027
 * 
 * TtMixtag のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;


/**
 * TtMixtag のDAO実装クラスです。<BR>
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
public class TtMixtagDaoImpl extends SqlMapClientDaoSupport implements TtMixtagDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtMixtagDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain searchByKey(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtag.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagDomain> searchByCondition(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtag.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtMixtagDomain> searchByConditionForPaging(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<TtMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("TtMixtag.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int searchCount(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtMixtag.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain searchByKeyForChange(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtag.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain lockByKey(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TtMixtag.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public TtMixtagDomain lockByKeyNoWait(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TtMixtagDomain)getSqlMapClientTemplate()
                .queryForObject("TtMixtag.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain)
     */
    public void create(TtMixtagDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtMixtag.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain)
     */
    public int update(TtMixtagDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtMixtag.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int updateByCondition(TtMixtagDomain domain, TtMixtagCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtMixtag.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int delete(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtag.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtMixtagDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain)
     */
    public int deleteByCondition(TtMixtagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtMixtag.DeleteByCondition", criteria);
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
