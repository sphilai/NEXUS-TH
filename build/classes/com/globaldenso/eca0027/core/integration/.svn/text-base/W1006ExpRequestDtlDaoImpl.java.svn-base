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
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDtlDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain;


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
public class W1006ExpRequestDtlDaoImpl extends SqlMapClientDaoSupport implements W1006ExpRequestDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1006ExpRequestDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchPrintByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1006ExpRequestDtlDomain> searchPrintByKey(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<W1006ExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1006ExpRequestDtl.SearchPrintByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1006ExpRequestDtlDomain> searchByCondition(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<W1006ExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1006ExpRequestDtl.SearchByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchKitByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1006ExpRequestDtlDomain> searchKitByCondition(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<W1006ExpRequestDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("W1006ExpRequestDtl.SearchByConditionKIT", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public int searchCount(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequestDtl.SearchCount", criteria);
        return cnt;
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchCountUnionKit(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public int searchCountUnionKit(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequestDtl.SearchCountUnionKit", criteria);
        return cnt;
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlDao#searchByDscId(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public String searchByDscId(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        String name = (String)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequestDtl.searchByDscId", criteria);
        return name;
    }

}
