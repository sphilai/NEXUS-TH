/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;


/**
 * TtExpRequestDtl のDAO実装クラスです。<BR>
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
public class TtExpRequestDtlDaoImpl extends SqlMapClientDaoSupport implements TtExpRequestDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain searchByKey(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlDomain> searchByCondition(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlDomain> searchByConditionForPaging(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtExpRequestDtl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int searchCount(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtl.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain searchByKeyForChange(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtl.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain lockByKey(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtExpRequestDtl.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public TtExpRequestDtlDomain lockByKeyNoWait(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (TtExpRequestDtlDomain)getSqlMapClientTemplate()
                .queryForObject("TtExpRequestDtl.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain)
     */
    public void create(TtExpRequestDtlDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtExpRequestDtl.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain)
     */
    public int update(TtExpRequestDtlDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtl.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int updateByCondition(TtExpRequestDtlDomain domain, TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtExpRequestDtl.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int delete(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtl.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtExpRequestDtlDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    public int deleteByCondition(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtExpRequestDtl.DeleteByCondition", criteria);
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
