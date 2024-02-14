/*
 * PROJECT：eca0027
 * 
 * TmSeq のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain;


/**
 * TmSeq のDAO実装クラスです。<BR>
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
public class TmSeqDaoImpl extends SqlMapClientDaoSupport implements TmSeqDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmSeqDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain searchByKey(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSeq.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSeqDomain> searchByCondition(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSeqDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSeq.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmSeqDomain> searchByConditionForPaging(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (List<TmSeqDomain>)getSqlMapClientTemplate()
                    .queryForList("TmSeq.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int searchCount(TmSeqCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmSeq.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain searchByKeyForChange(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSeq.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain lockByKey(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmSeq.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public TmSeqDomain lockByKeyNoWait(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmSeqDomain)getSqlMapClientTemplate()
                .queryForObject("TmSeq.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain)
     */
    public void create(TmSeqDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmSeq.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain)
     */
    public int update(TmSeqDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmSeq.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int updateByCondition(TmSeqDomain domain, TmSeqCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmSeq.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int delete(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSeq.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmSeqDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain)
     */
    public int deleteByCondition(TmSeqCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmSeq.DeleteByCondition", criteria);
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
