/*
 * PROJECT：eca0027
 * 
 * TwStgAct のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain;


/**
 * TwStgAct のDAO実装クラスです。<BR>
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
public class TwStgActDaoImpl extends SqlMapClientDaoSupport implements TwStgActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwStgActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain searchByKey(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (TwStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgAct.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwStgActDomain> searchByCondition(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<TwStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("TwStgAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwStgActDomain> searchByConditionForPaging(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<TwStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("TwStgAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int searchCount(TwStgActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwStgAct.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain searchByKeyForChange(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (TwStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgAct.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain lockByKey(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (TwStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TwStgAct.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public TwStgActDomain lockByKeyNoWait(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return (TwStgActDomain)getSqlMapClientTemplate()
                .queryForObject("TwStgAct.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain)
     */
    public void create(TwStgActDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwStgAct.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain)
     */
    public int update(TwStgActDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwStgAct.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int updateByCondition(TwStgActDomain domain, TwStgActCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwStgAct.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int delete(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwStgAct.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwStgActDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain)
     */
    public int deleteByCondition(TwStgActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwStgAct.DeleteByCondition", criteria);
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
