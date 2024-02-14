/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt001CompSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt001CompSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt001CompSelectCriteriaDomain;

/**
 * The search dao implementation class of Company Search Sub Screen.
 * <br />
 * 会社選択子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7347 $
 */
public class Wt001CompSelectDaoImpl extends SqlMapClientDaoSupport implements
    Wt001CompSelectDao {

    /**
     * Default constructor.
     */
    public Wt001CompSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the Company information.
     * 会社情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Wt001CompSelectDomain> searchByConditionForPaging(
        Wt001CompSelectCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt001CompSelectDomain>)getSqlMapClientTemplate()
            .queryForList("Wt001CompSelect.SearchByConditionForPaging",
                criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the outer package information.
     * 包装材情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    public int searchCount(Wt001CompSelectCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt001CompSelect.SearchCount", criteria);
        return cnt;
    }

}
