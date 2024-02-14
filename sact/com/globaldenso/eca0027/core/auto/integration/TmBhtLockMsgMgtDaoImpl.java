/*
 * PROJECT：eca0027
 * 
 * TmBhtLockMsgMgt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain;


/**
 * TmBhtLockMsgMgt のDAO実装クラスです。<BR>
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
public class TmBhtLockMsgMgtDaoImpl extends SqlMapClientDaoSupport implements TmBhtLockMsgMgtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtLockMsgMgtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain searchByKey(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtLockMsgMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtLockMsgMgt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtLockMsgMgtDomain> searchByCondition(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtLockMsgMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtLockMsgMgt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmBhtLockMsgMgtDomain> searchByConditionForPaging(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TmBhtLockMsgMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TmBhtLockMsgMgt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int searchCount(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmBhtLockMsgMgt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain searchByKeyForChange(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtLockMsgMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtLockMsgMgt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain lockByKey(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtLockMsgMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TmBhtLockMsgMgt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public TmBhtLockMsgMgtDomain lockByKeyNoWait(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return (TmBhtLockMsgMgtDomain)getSqlMapClientTemplate()
                .queryForObject("TmBhtLockMsgMgt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain)
     */
    public void create(TmBhtLockMsgMgtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmBhtLockMsgMgt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain)
     */
    public int update(TmBhtLockMsgMgtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmBhtLockMsgMgt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int updateByCondition(TmBhtLockMsgMgtDomain domain, TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmBhtLockMsgMgt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int delete(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtLockMsgMgt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmBhtLockMsgMgtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain)
     */
    public int deleteByCondition(TmBhtLockMsgMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmBhtLockMsgMgt.DeleteByCondition", criteria);
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
