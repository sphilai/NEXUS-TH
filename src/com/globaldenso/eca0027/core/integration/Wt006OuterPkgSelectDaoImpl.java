/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt006OuterPkgSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;

/**
 * The search dao implementation class of Outer Package Search Sub Screen.
 * <br />
 * 外装選択子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt006OuterPkgSelectDaoImpl extends SqlMapClientDaoSupport implements
    Wt006OuterPkgSelectDao {

    /**
     * Default constructor.
     */
    public Wt006OuterPkgSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the outer package information.
     * 外装情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Wt006OuterPkgSelectDomain> searchByConditionForPaging(
        Wt006OuterPkgSelectCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt006OuterPkgSelectDomain>)getSqlMapClientTemplate()
            .queryForList("Wt006OuterPkgSelect.SearchByConditionForPaging",
                criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the outer package information.
     * 外装情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    public int searchCount(Wt006OuterPkgSelectCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt006OuterPkgSelect.SearchCount", criteria);
        return cnt;
    }

}
