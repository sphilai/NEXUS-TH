/*
 * PROJECT：eca0027
 * 
 * TtInvoiceAttached のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;


/**
 * TtInvoiceAttached のDAO実装クラスです。<BR>
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
public class TtInvoiceAttachedDaoImpl extends SqlMapClientDaoSupport implements TtInvoiceAttachedDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceAttachedDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain searchByKey(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceAttached.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceAttachedDomain> searchByCondition(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceAttachedDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoiceAttached.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceAttachedDomain> searchByConditionForPaging(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceAttachedDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoiceAttached.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int searchCount(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceAttached.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain searchByKeyForChange(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceAttached.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain lockByKey(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceAttachedDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceAttached.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public TtInvoiceAttachedDomain lockByKeyNoWait(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceAttachedDomain)getSqlMapClientTemplate()
                .queryForObject("TtInvoiceAttached.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain)
     */
    public void create(TtInvoiceAttachedDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtInvoiceAttached.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain)
     */
    public int update(TtInvoiceAttachedDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtInvoiceAttached.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceAttachedDomain domain, TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtInvoiceAttached.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int delete(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoiceAttached.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceAttachedDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceAttachedCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoiceAttached.DeleteByCondition", criteria);
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
