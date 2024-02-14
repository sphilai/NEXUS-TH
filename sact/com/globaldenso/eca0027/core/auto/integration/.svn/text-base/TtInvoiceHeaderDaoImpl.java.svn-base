/*
 * PROJECT：eca0027
 * 
 * TtInvoiceHeader のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;


/**
 * TtInvoiceHeader のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/03/31 14:43:17<BR>
 * 
 * テーブル定義から2015/03/31に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TtInvoiceHeaderDaoImpl extends SqlMapClientDaoSupport implements TtInvoiceHeaderDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceHeaderDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain searchByKey(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceHeader.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceHeaderDomain> searchByCondition(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoiceHeader.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtInvoiceHeaderDomain> searchByConditionForPaging(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<TtInvoiceHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("TtInvoiceHeader.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int searchCount(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceHeader.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain searchByKeyForChange(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceHeader.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain lockByKey(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceHeaderDomain)getSqlMapClientTemplate()
                    .queryForObject("TtInvoiceHeader.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public TtInvoiceHeaderDomain lockByKeyNoWait(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return (TtInvoiceHeaderDomain)getSqlMapClientTemplate()
                .queryForObject("TtInvoiceHeader.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain)
     */
    public void create(TtInvoiceHeaderDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtInvoiceHeader.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain)
     */
    public int update(TtInvoiceHeaderDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtInvoiceHeader.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int updateByCondition(TtInvoiceHeaderDomain domain, TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtInvoiceHeader.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int delete(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoiceHeader.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtInvoiceHeaderDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain)
     */
    public int deleteByCondition(TtInvoiceHeaderCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtInvoiceHeader.DeleteByCondition", criteria);
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
