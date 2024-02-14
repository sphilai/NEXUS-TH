/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9014CgmWhXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;

/**
 * The search dao implementation class of CIGMA W/H X-Reference MA Inquiry Screen.
 * <br />
 * CIGMA W/H X-Reference MA Inquiry 画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014CgmWhXRefMaDaoImpl extends SqlMapClientDaoSupport implements
    W9014CgmWhXRefMaDao {

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014CgmWhXRefMaDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the W/H information.
     * 倉庫情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W9014CgmWhXRefMaDao#searchCount(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public int searchCount(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "W9014CgmWhXRefMa.SearchCount", w9014CgmWhXRefMaCriteriaDomain);
        return cnt;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the SqlMap to search for the W/H information.
     * 倉庫情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W9014CgmWhXRefMaDao#searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9014CgmWhXRefMaDomain> searchByConditionForPaging(
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException {
        return (List<W9014CgmWhXRefMaDomain>)getSqlMapClientTemplate()
            .queryForList("W9014CgmWhXRefMa.SearchByConditionForPaging",
                w9014CgmWhXRefMaCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the W/H information.
     * 倉庫情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W9014CgmWhXRefMaDao#searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public int searchCountTmCigmaWhXref(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "W9014CgmWhXRefMa.SearchCountTmCigmaWhXref", w9014CgmWhXRefMaCriteriaDomain);
        return cnt;
    }

}
