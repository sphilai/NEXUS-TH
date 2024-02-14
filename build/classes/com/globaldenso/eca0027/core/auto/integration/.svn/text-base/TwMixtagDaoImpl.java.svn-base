/*
 * PROJECT：eca0027
 * 
 * TwMixtag のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain;


/**
 * TwMixtag のDAO実装クラスです。<BR>
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
public class TwMixtagDaoImpl extends SqlMapClientDaoSupport implements TwMixtagDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwMixtagDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain searchByKey(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtag.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwMixtagDomain> searchByCondition(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<TwMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("TwMixtag.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwMixtagDomain> searchByConditionForPaging(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<TwMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("TwMixtag.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int searchCount(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwMixtag.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain searchByKeyForChange(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtag.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain lockByKey(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagDomain)getSqlMapClientTemplate()
                    .queryForObject("TwMixtag.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public TwMixtagDomain lockByKeyNoWait(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return (TwMixtagDomain)getSqlMapClientTemplate()
                .queryForObject("TwMixtag.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain)
     */
    public void create(TwMixtagDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwMixtag.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain)
     */
    public int update(TwMixtagDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwMixtag.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int updateByCondition(TwMixtagDomain domain, TwMixtagCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwMixtag.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int delete(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwMixtag.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwMixtagDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain)
     */
    public int deleteByCondition(TwMixtagCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwMixtag.DeleteByCondition", criteria);
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
