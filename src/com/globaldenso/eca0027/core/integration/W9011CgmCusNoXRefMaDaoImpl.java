/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9011CgmCusNoXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;

/**
 * The search dao implementation class of Outer Package Search Sub Screen.
 * <br />
 * CIGMA Customer No. X-Reference MA画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011CgmCusNoXRefMaDaoImpl extends SqlMapClientDaoSupport 
    implements W9011CgmCusNoXRefMaDao{

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011CgmCusNoXRefMaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the SqlMap to search count for the consignee information.
     * 荷受人情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * @see com.globaldenso.eca0027.core.business.dao.W9011CgmCusNoXRefMaDao#searchCount(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    public int searchCount(W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "W9011CgmCusNoXRefMa.SearchCount", criteria);
        return cnt;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the SqlMap to search for the consignee information.
     * 荷受人情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * @see com.globaldenso.eca0027.core.business.dao.W9011CgmCusNoXRefMaDao
     *      #searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9011CgmCusNoXRefMaDomain> searchByConditionForPaging(
        W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        return (List<W9011CgmCusNoXRefMaDomain>)getSqlMapClientTemplate()
            .queryForList("W9011CgmCusNoXRefMa.SearchByConditionForPaging",
                criteria);
    }

}
