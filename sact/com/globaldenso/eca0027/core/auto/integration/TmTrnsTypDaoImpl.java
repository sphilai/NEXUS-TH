/*
 * PROJECT：eca0027
 * 
 * TmTrnsTyp のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain;


/**
 * TmTrnsTyp のDAO実装クラスです。<BR>
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
public class TmTrnsTypDaoImpl extends SqlMapClientDaoSupport implements TmTrnsTypDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmTrnsTypDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain searchByKey(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTyp.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmTrnsTypDomain> searchByCondition(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmTrnsTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmTrnsTyp.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmTrnsTypDomain> searchByConditionForPaging(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (List<TmTrnsTypDomain>)getSqlMapClientTemplate()
                    .queryForList("TmTrnsTyp.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int searchCount(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTyp.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain searchByKeyForChange(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTyp.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain lockByKey(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypDomain)getSqlMapClientTemplate()
                    .queryForObject("TmTrnsTyp.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public TmTrnsTypDomain lockByKeyNoWait(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return (TmTrnsTypDomain)getSqlMapClientTemplate()
                .queryForObject("TmTrnsTyp.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain)
     */
    public void create(TmTrnsTypDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmTrnsTyp.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain)
     */
    public int update(TmTrnsTypDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmTrnsTyp.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int updateByCondition(TmTrnsTypDomain domain, TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmTrnsTyp.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int delete(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmTrnsTyp.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmTrnsTypDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain)
     */
    public int deleteByCondition(TmTrnsTypCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmTrnsTyp.DeleteByCondition", criteria);
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
