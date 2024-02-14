/*
 * PROJECT：eca0027
 * 
 * TmServer のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmServerDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain;


/**
 * TmServer のDAO実装クラスです。<BR>
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
public class TmServerDaoImpl extends SqlMapClientDaoSupport implements TmServerDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmServerDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain searchByKey(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (TmServerDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServer.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmServerDomain> searchByCondition(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (List<TmServerDomain>)getSqlMapClientTemplate()
                    .queryForList("TmServer.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmServerDomain> searchByConditionForPaging(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (List<TmServerDomain>)getSqlMapClientTemplate()
                    .queryForList("TmServer.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int searchCount(TmServerCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmServer.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain searchByKeyForChange(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (TmServerDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServer.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain lockByKey(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (TmServerDomain)getSqlMapClientTemplate()
                    .queryForObject("TmServer.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public TmServerDomain lockByKeyNoWait(TmServerCriteriaDomain criteria) throws ApplicationException {
        return (TmServerDomain)getSqlMapClientTemplate()
                .queryForObject("TmServer.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain)
     */
    public void create(TmServerDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmServer.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain)
     */
    public int update(TmServerDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmServer.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmServerDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int updateByCondition(TmServerDomain domain, TmServerCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmServer.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int delete(TmServerCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmServer.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmServerDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerCriteriaDomain)
     */
    public int deleteByCondition(TmServerCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmServer.DeleteByCondition", criteria);
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
