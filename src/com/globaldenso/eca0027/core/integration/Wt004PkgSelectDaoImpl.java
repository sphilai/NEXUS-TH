/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt004PkgSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;

/**
 * The search dao implementation class of Package Search Sub Screen.
 * <br />
 * 包装材選択子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt004PkgSelectDaoImpl extends SqlMapClientDaoSupport implements
    Wt004PkgSelectDao {

    /**
     * Default constructor.
     */
    public Wt004PkgSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the outer package information.
     * 包装材情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Wt004PkgSelectDomain> searchByConditionForPaging(
        Wt004PkgSelectCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt004PkgSelectDomain>)getSqlMapClientTemplate()
            .queryForList("Wt004PkgSelect.SearchByConditionForPaging",
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
    public int searchCount(Wt004PkgSelectCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt004PkgSelect.SearchCount", criteria);
        return cnt;
    }

}
