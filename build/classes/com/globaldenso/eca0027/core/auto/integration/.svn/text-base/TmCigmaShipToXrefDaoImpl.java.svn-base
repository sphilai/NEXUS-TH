/*
 * PROJECT：eca0027
 * 
 * TmCigmaShipToXref のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;


/**
 * TmCigmaShipToXref のDAO実装クラスです。<BR>
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
public class TmCigmaShipToXrefDaoImpl extends SqlMapClientDaoSupport implements TmCigmaShipToXrefDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmCigmaShipToXrefDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain searchByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaShipToXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaShipToXref.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaShipToXrefDomain> searchByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaShipToXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaShipToXref.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmCigmaShipToXrefDomain> searchByConditionForPaging(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (List<TmCigmaShipToXrefDomain>)getSqlMapClientTemplate()
                    .queryForList("TmCigmaShipToXref.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int searchCount(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaShipToXref.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain searchByKeyForChange(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaShipToXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaShipToXref.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain lockByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaShipToXrefDomain)getSqlMapClientTemplate()
                    .queryForObject("TmCigmaShipToXref.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public TmCigmaShipToXrefDomain lockByKeyNoWait(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return (TmCigmaShipToXrefDomain)getSqlMapClientTemplate()
                .queryForObject("TmCigmaShipToXref.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain)
     */
    public void create(TmCigmaShipToXrefDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmCigmaShipToXref.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain)
     */
    public int update(TmCigmaShipToXrefDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmCigmaShipToXref.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int updateByCondition(TmCigmaShipToXrefDomain domain, TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmCigmaShipToXref.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int delete(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaShipToXref.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmCigmaShipToXrefDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain)
     */
    public int deleteByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmCigmaShipToXref.DeleteByCondition", criteria);
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
