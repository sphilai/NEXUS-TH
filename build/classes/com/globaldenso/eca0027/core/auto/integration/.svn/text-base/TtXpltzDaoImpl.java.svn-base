/*
 * PROJECT：eca0027
 * 
 * TtXpltz のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;


/**
 * TtXpltz のDAO実装クラスです。<BR>
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
public class TtXpltzDaoImpl extends SqlMapClientDaoSupport implements TtXpltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtXpltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain searchByKey(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TtXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtXpltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtXpltzDomain> searchByCondition(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtXpltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtXpltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtXpltzDomain> searchByConditionForPaging(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (List<TtXpltzDomain>)getSqlMapClientTemplate()
                    .queryForList("TtXpltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int searchCount(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtXpltz.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain searchByKeyForChange(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TtXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtXpltz.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain lockByKey(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TtXpltzDomain)getSqlMapClientTemplate()
                    .queryForObject("TtXpltz.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public TtXpltzDomain lockByKeyNoWait(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return (TtXpltzDomain)getSqlMapClientTemplate()
                .queryForObject("TtXpltz.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain)
     */
    public void create(TtXpltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtXpltz.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain)
     */
    public int update(TtXpltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtXpltz.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int updateByCondition(TtXpltzDomain domain, TtXpltzCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtXpltz.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int delete(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtXpltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtXpltzDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain)
     */
    public int deleteByCondition(TtXpltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtXpltz.DeleteByCondition", criteria);
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
