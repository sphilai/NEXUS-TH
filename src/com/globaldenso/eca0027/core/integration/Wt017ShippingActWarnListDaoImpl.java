/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt017ShippingActWarnListDao;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;

/**
 * The search dao implementation class of Shipping Actuality Warning List Sub
 * Screen. <br />
 * 船積実績ワーニングリスト表示子画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt017ShippingActWarnListDaoImpl extends SqlMapClientDaoSupport implements
    Wt017ShippingActWarnListDao {

    /**
     * Default constructor.
     */
    public Wt017ShippingActWarnListDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the shipper time zone information.
     * 荷主のタイムゾーン情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt017ShippingActWarnListDomain> searchByConditionTmNxsComp(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt017ShippingActWarnListDomain>) getSqlMapClientTemplate().queryForList(
            "Wt017ShippingActWarnList.SearchByConditionTmNxsComp", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the shipper time zone information.
     * 荷主のタイムゾーン情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     */
    public int searchCountTmNxsComp(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer) getSqlMapClientTemplate().queryForObject(
            "Wt017ShippingActWarnList.SearchCountTmNxsComp", criteria);
        return cnt;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search for the shipping actuality warning information.
     * 船積実績ワーニングリスト情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public List<Wt017ShippingActWarnListDomain> searchByConditionForPagingTtInvoice(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt017ShippingActWarnListDomain>) getSqlMapClientTemplate().queryForList(
            "Wt017ShippingActWarnList.SearchByConditionForPagingTtInvoice", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the SqlMap to search count for the shipping actuality warning information.
     * 船積実績ワーニングリスト情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     */
    public int searchCountTtInvoice(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer) getSqlMapClientTemplate().queryForObject(
            "Wt017ShippingActWarnList.SearchCountTtInvoice", criteria);
        return cnt;
    }
}
