/*
 * PROJECT：eca0027
 * 
 * TmExpShipToShipping のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;


/**
 * TmExpShipToShipping のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/12/18 16:26:47<BR>
 * 
 * テーブル定義から2017/12/18に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class TmExpShipToShippingDaoImpl extends SqlMapClientDaoSupport implements TmExpShipToShippingDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpShipToShippingDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (TmExpShipToShippingDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpShipToShipping.SearchByKey", criteria);
    }

    /**
     *  Export Request
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchContainerKeyByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchContainerKeyByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (TmExpShipToShippingDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpShipToShipping.SearchContainerKeyByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpShipToShippingDomain> searchByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpShipToShippingDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpShipToShipping.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmExpShipToShippingDomain> searchByConditionForPaging(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (List<TmExpShipToShippingDomain>)getSqlMapClientTemplate()
                    .queryForList("TmExpShipToShipping.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int searchCount(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmExpShipToShipping.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchByKeyForChange(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (TmExpShipToShippingDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpShipToShipping.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain lockByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (TmExpShipToShippingDomain)getSqlMapClientTemplate()
                    .queryForObject("TmExpShipToShipping.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public TmExpShipToShippingDomain lockByKeyNoWait(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return (TmExpShipToShippingDomain)getSqlMapClientTemplate()
                .queryForObject("TmExpShipToShipping.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain)
     */
    public void create(TmExpShipToShippingDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TmExpShipToShipping.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#update(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain)
     */
    public int update(TmExpShipToShippingDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TmExpShipToShipping.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int updateByCondition(TmExpShipToShippingDomain domain, TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TmExpShipToShipping.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int delete(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpShipToShipping.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmExpShipToShippingDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain)
     */
    public int deleteByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TmExpShipToShipping.DeleteByCondition", criteria);
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
