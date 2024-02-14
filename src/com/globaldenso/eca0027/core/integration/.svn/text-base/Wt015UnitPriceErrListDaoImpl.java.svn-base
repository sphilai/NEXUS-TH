/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt015UnitPriceErrListDao;
import com.globaldenso.eca0027.core.business.domain.Wt015UnitPriceErrListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt015UnitPriceErrListCriteriaDomain;

/**
 * The search dao implementation class of Unit Price Error List Sub Screen.
 * <br />
 * 売価登録なし品番表示子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt015UnitPriceErrListDaoImpl extends SqlMapClientDaoSupport implements
    Wt015UnitPriceErrListDao {

    /**
     * Default constructor.
     */
    public Wt015UnitPriceErrListDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the unit Price Error information.
     * 売価登録なし品番情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt015UnitPriceErrListDomain> searchByCondition(
        Wt015UnitPriceErrListCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt015UnitPriceErrListDomain>)getSqlMapClientTemplate()
            .queryForList("Wt015UnitPriceErrList.SearchByCondition", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the unit Price Error information.
     * 売価登録なし品番情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     */
    public int searchCount(Wt015UnitPriceErrListCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt015UnitPriceErrList.SearchCount", criteria);
        return cnt;
    }

}