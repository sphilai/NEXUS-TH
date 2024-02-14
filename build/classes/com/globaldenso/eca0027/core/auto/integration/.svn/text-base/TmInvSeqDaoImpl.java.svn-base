/*
 * PROJECT：eca0027
 * 
 * TmInvSeq のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain;


/**
 * TmInvSeq のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/17 23:10:14<BR>
 * 
 * テーブル定義から2014/04/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmInvSeqDaoImpl extends SqlMapClientDaoSupport implements TmInvSeqDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvSeqDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain searchByKey(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmInvSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvSeq.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvSeqDomain> searchByCondition(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvSeqDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvSeq.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvSeqDomain> searchByConditionForPaging(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvSeqDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvSeq.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int searchCount(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmInvSeq.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain searchByKeyForChange(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmInvSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvSeq.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain lockByKey(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmInvSeqDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvSeq.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public TmInvSeqDomain lockByKeyNoWait(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return (TmInvSeqDomain)getSqlMapClientTemplate()
                .queryForObject("TmInvSeq.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain)
     */
    public void create(TmInvSeqDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmInvSeq.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain)
     */
    public int update(TmInvSeqDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmInvSeq.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int updateByCondition(TmInvSeqDomain domain, TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmInvSeq.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int delete(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvSeq.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvSeqDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain)
     */
    public int deleteByCondition(TmInvSeqCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvSeq.DeleteByCondition", criteria);
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
