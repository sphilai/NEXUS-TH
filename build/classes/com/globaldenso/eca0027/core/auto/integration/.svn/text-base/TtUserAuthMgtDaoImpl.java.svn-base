/*
 * PROJECT：eca0027
 * 
 * TtUserAuthMgt のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain;


/**
 * TtUserAuthMgt のDAO実装クラスです。<BR>
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
public class TtUserAuthMgtDaoImpl extends SqlMapClientDaoSupport implements TtUserAuthMgtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtUserAuthMgtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain searchByKey(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtUserAuthMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtUserAuthMgt.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtUserAuthMgtDomain> searchByCondition(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtUserAuthMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtUserAuthMgt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtUserAuthMgtDomain> searchByConditionForPaging(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (List<TtUserAuthMgtDomain>)getSqlMapClientTemplate()
                    .queryForList("TtUserAuthMgt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int searchCount(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtUserAuthMgt.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain searchByKeyForChange(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtUserAuthMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtUserAuthMgt.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain lockByKey(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtUserAuthMgtDomain)getSqlMapClientTemplate()
                    .queryForObject("TtUserAuthMgt.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public TtUserAuthMgtDomain lockByKeyNoWait(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return (TtUserAuthMgtDomain)getSqlMapClientTemplate()
                .queryForObject("TtUserAuthMgt.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain)
     */
    public void create(TtUserAuthMgtDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtUserAuthMgt.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain)
     */
    public int update(TtUserAuthMgtDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtUserAuthMgt.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int updateByCondition(TtUserAuthMgtDomain domain, TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtUserAuthMgt.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int delete(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtUserAuthMgt.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtUserAuthMgtDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain)
     */
    public int deleteByCondition(TtUserAuthMgtCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtUserAuthMgt.DeleteByCondition", criteria);
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
