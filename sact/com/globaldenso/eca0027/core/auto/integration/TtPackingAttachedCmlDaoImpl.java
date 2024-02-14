/*
 * PROJECT：eca0027
 * 
 * TtPackingAttachedCml のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/03/31  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;


/**
 * TtPackingAttachedCml のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 10:26:05<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtPackingAttachedCmlDaoImpl extends SqlMapClientDaoSupport implements TtPackingAttachedCmlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtPackingAttachedCmlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain searchByKey(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingAttachedCmlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingAttachedCml.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackingAttachedCmlDomain> searchByCondition(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackingAttachedCmlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackingAttachedCml.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtPackingAttachedCmlDomain> searchByConditionForPaging(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPackingAttachedCmlDomain>)getSqlMapClientTemplate()
                    .queryForList("TtPackingAttachedCml.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int searchCount(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtPackingAttachedCml.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain searchByKeyForChange(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingAttachedCmlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingAttachedCml.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain lockByKey(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingAttachedCmlDomain)getSqlMapClientTemplate()
                    .queryForObject("TtPackingAttachedCml.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public TtPackingAttachedCmlDomain lockByKeyNoWait(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return (TtPackingAttachedCmlDomain)getSqlMapClientTemplate()
                .queryForObject("TtPackingAttachedCml.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain)
     */
    public void create(TtPackingAttachedCmlDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtPackingAttachedCml.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain)
     */
    public int update(TtPackingAttachedCmlDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtPackingAttachedCml.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int updateByCondition(TtPackingAttachedCmlDomain domain, TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtPackingAttachedCml.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int delete(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackingAttachedCml.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPackingAttachedCmlDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain)
     */
    public int deleteByCondition(TtPackingAttachedCmlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtPackingAttachedCml.DeleteByCondition", criteria);
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
