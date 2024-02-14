/*
 * PROJECT：eca0027
 * 
 * W1008PltzItem のDAO実装クラス
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
import com.globaldenso.eca0027.core.business.dao.W1008PltzItemDao;
import com.globaldenso.eca0027.core.business.domain.W1008PltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzItemCriteriaDomain;


/**
 * W1008PltzItem のDAO実装クラスです。<BR>
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
public class W1008PltzItemDaoImpl extends SqlMapClientDaoSupport implements W1008PltzItemDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1008PltzItemDaoImpl() {
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#searchW1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzItemDomain> searchW1008ByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008PltzItem.SearchW1008ByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzItemDomain> searchByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008PltzItem.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#create(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzItemDomain)
     */
    public void create(W1008PltzItemDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("W1008PltzItem.Create", domain);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public int delete(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("W1008PltzItem.Delete", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#SearchSumNoOFBoxByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzItemDomain> searchSumNoOFBoxByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008PltzItem.SearchSumNoOFBoxByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1008PltzItemDao#searchRegisterParentCmlW1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1008PltzItemDomain> searchRegisterParentCmlW1008ByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return (List<W1008PltzItemDomain>)getSqlMapClientTemplate()
                    .queryForList("W1008PltzItem.SearchRegisterParentCmlW1008ByCondition", criteria);
    }
}
