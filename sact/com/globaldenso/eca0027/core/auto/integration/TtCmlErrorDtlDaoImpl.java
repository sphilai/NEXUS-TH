/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorDtl のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;


/**
 * TtCmlErrorDtl のDAO実装クラスです。<BR>
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
public class TtCmlErrorDtlDaoImpl extends SqlMapClientDaoSupport implements TtCmlErrorDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtCmlErrorDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain searchByKey(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtCmlErrorDtlDomain> searchByCondition(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtCmlErrorDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtCmlErrorDtl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtCmlErrorDtlDomain> searchByConditionForPaging(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtCmlErrorDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtCmlErrorDtl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int searchCount(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorDtl.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain searchByKeyForChange(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorDtl.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain lockByKey(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtCmlErrorDtl.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public TtCmlErrorDtlDomain lockByKeyNoWait(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtCmlErrorDtlDomain)getSqlMapClientTemplate()
                .queryForObject("TtCmlErrorDtl.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain)
     */
    public void create(TtCmlErrorDtlDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtCmlErrorDtl.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain)
     */
    public int update(TtCmlErrorDtlDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtCmlErrorDtl.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int updateByCondition(TtCmlErrorDtlDomain domain, TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtCmlErrorDtl.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int delete(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtCmlErrorDtl.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtCmlErrorDtlDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain)
     */
    public int deleteByCondition(TtCmlErrorDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtCmlErrorDtl.DeleteByCondition", criteria);
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
