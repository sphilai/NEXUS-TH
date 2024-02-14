/*
 * PROJECT：eca0027
 * 
 * TwShippingActInvoice のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;


/**
 * TwShippingActInvoice のDAO実装クラスです。<BR>
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
public class TwShippingActInvoiceDaoImpl extends SqlMapClientDaoSupport implements TwShippingActInvoiceDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwShippingActInvoiceDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain searchByKey(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwShippingActInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwShippingActInvoice.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwShippingActInvoiceDomain> searchByCondition(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TwShippingActInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TwShippingActInvoice.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwShippingActInvoiceDomain> searchByConditionForPaging(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TwShippingActInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TwShippingActInvoice.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int searchCount(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwShippingActInvoice.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain searchByKeyForChange(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwShippingActInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwShippingActInvoice.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain lockByKey(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwShippingActInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwShippingActInvoice.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public TwShippingActInvoiceDomain lockByKeyNoWait(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwShippingActInvoiceDomain)getSqlMapClientTemplate()
                .queryForObject("TwShippingActInvoice.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain)
     */
    public void create(TwShippingActInvoiceDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwShippingActInvoice.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain)
     */
    public int update(TwShippingActInvoiceDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwShippingActInvoice.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int updateByCondition(TwShippingActInvoiceDomain domain, TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwShippingActInvoice.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int delete(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwShippingActInvoice.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwShippingActInvoiceDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TwShippingActInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwShippingActInvoice.DeleteByCondition", criteria);
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
