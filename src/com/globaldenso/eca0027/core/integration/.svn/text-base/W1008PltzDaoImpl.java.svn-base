/*
 * PROJECT：eca0027
 * 
 * W1008Pltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/06/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1008PltzDao;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;


/**
 * W1008Pltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/06/05 16:25:47<BR>
 * 
 * テーブル定義から2558/06/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1008PltzDaoImpl extends SqlMapClientDaoSupport implements W1008PltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1008PltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public W1008PltzDomain searchByKey(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return (W1008PltzDomain)getSqlMapClientTemplate()
                    .queryForObject("W1008Pltz.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzDomain> searchByCondition(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008Pltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzDomain> searchByConditionForPaging(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008Pltz.SearchByConditionForPaging", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchByPalletNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzDomain> searchByPalletNo(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008Pltz.SearchByPalletNo", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchCountDistinct(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public int searchCountDistinct(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1008Pltz.SearchCountDistinct", criteria);
        return cnt;
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchRunningNo()
     */
    public String searchRunningNo() throws ApplicationException {
        return (String)getSqlMapClientTemplate()
                    .queryForObject("W1008Pltz.SearchRunningNo");
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#create(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzDomain)
     */
    public void create(W1008PltzDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("W1008Pltz.Create", domain);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public int delete(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("W1008Pltz.Delete", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#searchByConditionWithOuterCD(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzDomain> searchByConditionWithOuterCD(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008Pltz.SearchByConditionWithOuterCD", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzDomain)
     */
    public int update(W1008PltzDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1008Pltz.Update", domain);
    }
}
