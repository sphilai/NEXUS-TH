/*
 * PROJECT：eca0027
 * 
 * TwInvoice のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;


/**
 * TwInvoice のDAO実装クラスです。<BR>
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
public class TwInvoiceDaoImpl extends SqlMapClientDaoSupport implements TwInvoiceDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvoiceDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain searchByKey(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvoice.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvoiceDomain> searchByCondition(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvoice.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TwInvoiceDomain> searchByConditionForPaging(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TwInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TwInvoice.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int searchCount(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TwInvoice.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain searchByKeyForChange(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvoice.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain lockByKey(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TwInvoice.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public TwInvoiceDomain lockByKeyNoWait(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TwInvoiceDomain)getSqlMapClientTemplate()
                .queryForObject("TwInvoice.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain)
     */
    public void create(TwInvoiceDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TwInvoice.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#update(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain)
     */
    public int update(TwInvoiceDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TwInvoice.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int updateByCondition(TwInvoiceDomain domain, TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TwInvoice.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int delete(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvoice.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TwInvoiceDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TwInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TwInvoice.DeleteByCondition", criteria);
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
