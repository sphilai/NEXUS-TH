/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt016UnregHsCdListDao;
import com.globaldenso.eca0027.core.business.domain.Wt016UnregHsCdListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt016UnregHsCdListCriteriaDomain;

/**
 * The search dao implementation class of Unregistered HS CODE List Sub Screen.
 * <br />
 * HS CODE登録なし品番表示子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt016UnregHsCdListDaoImpl extends SqlMapClientDaoSupport implements
    Wt016UnregHsCdListDao {

    /**
     * Default constructor.
     */
    public Wt016UnregHsCdListDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the unregistered HS CODE information.
     * HS CODE登録なし品番情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt016UnregHsCdListDomain> searchByCondition(
        Wt016UnregHsCdListCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt016UnregHsCdListDomain>)getSqlMapClientTemplate()
            .queryForList("Wt016UnregHsCdList.SearchByCondition", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the unregistered HS CODE information.
     * HS CODE登録なし品番情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     */
    public int searchCount(Wt016UnregHsCdListCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt016UnregHsCdList.SearchCount", criteria);
        return cnt;
    }

}
