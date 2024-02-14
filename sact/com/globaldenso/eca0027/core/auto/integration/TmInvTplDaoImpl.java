/*
 * PROJECT：eca0027
 * 
 * TmInvTpl のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;


/**
 * TmInvTpl のDAO実装クラスです。<BR>
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
public class TmInvTplDaoImpl extends SqlMapClientDaoSupport implements TmInvTplDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmInvTplDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain searchByKey(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTpl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvTplDomain> searchByCondition(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvTplDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvTpl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmInvTplDomain> searchByConditionForPaging(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (List<TmInvTplDomain>)getSqlMapClientTemplate()
                    .queryForList("TmInvTpl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int searchCount(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmInvTpl.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain searchByKeyForChange(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTpl.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain lockByKey(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplDomain)getSqlMapClientTemplate()
                    .queryForObject("TmInvTpl.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public TmInvTplDomain lockByKeyNoWait(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return (TmInvTplDomain)getSqlMapClientTemplate()
                .queryForObject("TmInvTpl.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain)
     */
    public void create(TmInvTplDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmInvTpl.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain)
     */
    public int update(TmInvTplDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmInvTpl.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int updateByCondition(TmInvTplDomain domain, TmInvTplCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmInvTpl.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int delete(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvTpl.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmInvTplDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)
     */
    public int deleteByCondition(TmInvTplCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmInvTpl.DeleteByCondition", criteria);
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