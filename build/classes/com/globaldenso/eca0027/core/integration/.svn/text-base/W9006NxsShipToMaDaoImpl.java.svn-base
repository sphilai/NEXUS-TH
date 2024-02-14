/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9006NxsShipToMaDao;
import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;

/**
 * The search dao implementation class of NEXUS Ship to MA Inquiry Screen.
 * <br />
 * NEXUS Ship to MA Inquiry画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9006NxsShipToMaDaoImpl extends SqlMapClientDaoSupport implements 
    W9006NxsShipToMaDao {

    /**
     * Default constructor.
     */
    public W9006NxsShipToMaDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the NEXUS Ship to MA information.
     * NEXUS Ship to MA情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    @SuppressWarnings("unchecked")
    public List<W9006NxsShipToMaDomain> searchByConditionForPaging(
        W9006NxsShipToMaCriteriaDomain criteria) throws ApplicationException {
        return (List<W9006NxsShipToMaDomain>)getSqlMapClientTemplate()
            .queryForList("W9006NxsShipToMa.SearchByConditionForPaging",
                criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the NEXUS Ship to MA information.
     * NEXUS Ship to MA情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    public int searchCount(W9006NxsShipToMaCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "W9006NxsShipToMa.SearchCount", criteria);
        return cnt;
    }

}
