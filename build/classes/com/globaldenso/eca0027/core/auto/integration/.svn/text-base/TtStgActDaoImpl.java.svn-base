/*
 * PROJECT：eca0027
 * 
 * TtStgAct のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain;


/**
 * TtStgAct のDAO実装クラスです。<BR>
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
public class TtStgActDaoImpl extends SqlMapClientDaoSupport implements TtStgActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtStgActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain searchByKey(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (TtStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgAct.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtStgActDomain> searchByCondition(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<TtStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("TtStgAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtStgActDomain> searchByConditionForPaging(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<TtStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("TtStgAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int searchCount(TtStgActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtStgAct.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain searchByKeyForChange(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (TtStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgAct.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain lockByKey(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (TtStgActDomain)getSqlMapClientTemplate()
                    .queryForObject("TtStgAct.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public TtStgActDomain lockByKeyNoWait(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return (TtStgActDomain)getSqlMapClientTemplate()
                .queryForObject("TtStgAct.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain)
     */
    public void create(TtStgActDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtStgAct.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain)
     */
    public int update(TtStgActDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtStgAct.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int updateByCondition(TtStgActDomain domain, TtStgActCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtStgAct.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int delete(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtStgAct.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtStgActDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain)
     */
    public int deleteByCondition(TtStgActCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtStgAct.DeleteByCondition", criteria);
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
