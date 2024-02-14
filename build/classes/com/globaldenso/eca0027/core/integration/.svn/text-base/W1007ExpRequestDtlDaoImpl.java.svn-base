/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDtlDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain;


/**
 * TtExpRequestDtl のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/28 16:15:38<BR>
 * 
 * テーブル定義から2558/04/28に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007ExpRequestDtlDaoImpl extends SqlMapClientDaoSupport implements W1007ExpRequestDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public W1007ExpRequestDtlDomain searchByKey(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (W1007ExpRequestDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("W1007ExpRequestDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlDao#searchParentKitByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007ExpRequestDtlDomain> searchParentKitByCondition(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007ExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007ExpRequestDtl.SearchParentKitByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007ExpRequestDtlDomain> searchByCondition(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007ExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007ExpRequestDtl.SearchByCondition", criteria);
    }
    

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDtlDomain)
     */
    public int update(W1007ExpRequestDtlDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1007ExpRequestDtl.Update", domain);
    }

    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public int searchCount(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1007ExpRequestDtl.SearchCount", criteria);
        return cnt;
    }
    

}
