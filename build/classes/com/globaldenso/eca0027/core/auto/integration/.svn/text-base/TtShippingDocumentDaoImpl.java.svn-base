/*
 * PROJECT：eca0027
 * 
 * TtShippingDocument のDAO実装クラス
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

import com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain;


/**
 * TtShippingDocument のDAO実装クラスです。<BR>
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
public class TtShippingDocumentDaoImpl extends SqlMapClientDaoSupport implements TtShippingDocumentDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TtShippingDocumentDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain searchByKey(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingDocumentDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingDocument.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingDocumentDomain> searchByCondition(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingDocumentDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingDocument.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtShippingDocumentDomain> searchByConditionForPaging(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (List<TtShippingDocumentDomain>)getSqlMapClientTemplate()
                    .queryForList("TtShippingDocument.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int searchCount(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TtShippingDocument.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain searchByKeyForChange(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingDocumentDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingDocument.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain lockByKey(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingDocumentDomain)getSqlMapClientTemplate()
                    .queryForObject("TtShippingDocument.LockByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public TtShippingDocumentDomain lockByKeyNoWait(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return (TtShippingDocumentDomain)getSqlMapClientTemplate()
                .queryForObject("TtShippingDocument.LockByKeyNoWait", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#create(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain)
     */
    public void create(TtShippingDocumentDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("TtShippingDocument.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#update(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain)
     */
    public int update(TtShippingDocumentDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("TtShippingDocument.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int updateByCondition(TtShippingDocumentDomain domain, TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(domain, criteria);
        return getSqlMapClientTemplate()
                .update("TtShippingDocument.UpdateByCondition", updateByConditionMap);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int delete(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingDocument.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtShippingDocumentDao#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain)
     */
    public int deleteByCondition(TtShippingDocumentCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("TtShippingDocument.DeleteByCondition", criteria);
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
