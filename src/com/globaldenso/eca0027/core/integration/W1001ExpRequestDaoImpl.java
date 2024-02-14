/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.W1001ExpRequestDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;


/**
 * W1001ExpRequest のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/27 14:08:11<BR>
 * 
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1001ExpRequestDaoImpl extends SqlMapClientDaoSupport implements W1001ExpRequestDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1001ExpRequestDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1001ExpRequestDomain> searchByConditionForPaging(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (List<W1001ExpRequestDomain>)getSqlMapClientTemplate()
                    .queryForList("W1001ExpRequest.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public int searchCount(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1001ExpRequest.SearchCount", criteria);
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public W1001ExpRequestDomain searchByKeyForChange(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1001ExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("W1001ExpRequest.SearchByKeyForChange", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#create(com.globaldenso.eca0027.core.auto.business.domain.W1001ExpRequestDomain)
     */
    public void create(W1001ExpRequestDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("W1001ExpRequest.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1001ExpRequestDomain)
     */
    public int update(W1001ExpRequestDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1001ExpRequest.Update", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchByContSort(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W1001ExpRequestDomain searchByContSort(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1001ExpRequestDomain)getSqlMapClientTemplate()
                .queryForObject("W1001ExpRequest.SearchByContSort", criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public W1001ExpRequestDomain searchByKeyForInit(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1001ExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("W1001ExpRequest.SearchByKeyForInit", criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchQtyForDtl(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlDomain> searchQtyForDtl(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1001ExpRequest.SearchQtyForDtl", criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1001ExpRequestDao#searchAmountForDtl(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TtExpRequestDtlDomain> searchAmountForDtl(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1001ExpRequest.SearchAmountForDtl", criteria);
    }

}
