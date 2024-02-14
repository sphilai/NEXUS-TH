/*
 * PROJECT：eca0027
 * 
 * TtBhtWorkErr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/14  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain;


/**
 * TtBhtWorkErr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/14 15:07:43<BR>
 * 
 * テーブル定義から2014/06/14に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtBhtWorkErrDaoImpl extends SqlMapClientDaoSupport implements TtBhtWorkErrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtBhtWorkErrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain searchByKey(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkErrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkErr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkErrDomain> searchByCondition(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkErrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkErr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtBhtWorkErrDomain> searchByConditionForPaging(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtBhtWorkErrDomain>)getSqlMapClientTemplate()
                    .queryForList("TtBhtWorkErr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int searchCount(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkErr.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain searchByKeyForChange(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkErrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkErr.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain lockByKey(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkErrDomain)getSqlMapClientTemplate()
                    .queryForObject("TtBhtWorkErr.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public TtBhtWorkErrDomain lockByKeyNoWait(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return (TtBhtWorkErrDomain)getSqlMapClientTemplate()
                .queryForObject("TtBhtWorkErr.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain)
     */
    public void create(TtBhtWorkErrDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtBhtWorkErr.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain)
     */
    public int update(TtBhtWorkErrDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtBhtWorkErr.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int updateByCondition(TtBhtWorkErrDomain domain, TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtBhtWorkErr.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int delete(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkErr.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtBhtWorkErrDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain)
     */
    public int deleteByCondition(TtBhtWorkErrCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtBhtWorkErr.DeleteByCondition", criteria);
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
