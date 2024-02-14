/*
 * PROJECT：eca0027
 * 
 * TtInvoice のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;


/**
 * TtInvoice のDAO実装クラスです。<BR>
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
public class TtInvoiceDaoImpl extends SqlMapClientDaoSupport implements TtInvoiceDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain searchByKey(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoice.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceDomain> searchByCondition(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoice.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceDomain> searchByConditionForPaging(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoice.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int searchCount(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtInvoice.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain searchByKeyForChange(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoice.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain lockByKey(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoice.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public TtInvoiceDomain lockByKeyNoWait(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceDomain)getSqlMapClientTemplate()
                .queryForObject("TtInvoice.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain)
     */
    public void create(TtInvoiceDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtInvoice.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain)
     */
    public int update(TtInvoiceDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtInvoice.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceDomain domain, TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtInvoice.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int delete(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoice.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoice.DeleteByCondition", criteria);
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
