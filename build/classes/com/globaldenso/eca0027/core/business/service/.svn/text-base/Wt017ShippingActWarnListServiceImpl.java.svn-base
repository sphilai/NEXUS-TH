/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt017ShippingActWarnListDao;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;

/**
 * The search service implementation class of Shipping Actuality Warning List Sub Screen.
 *  <br />船積実績ワーニングリスト子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt017ShippingActWarnListServiceImpl implements
    Wt017ShippingActWarnListService {

    /**
     * wt017ShippingActWarnListDao
     */
    private Wt017ShippingActWarnListDao wt017ShippingActWarnListDao;

    /**
     * Default constructor.
     */
    public Wt017ShippingActWarnListServiceImpl() {
    }

    /**
     * <p>Setter method for wt017ShippingActWarnListDao.</p>
     *
     * @param wt017ShippingActWarnListDao Set for wt017ShippingActWarnListDao
     */
    public void setWt017ShippingActWarnListDao(Wt017ShippingActWarnListDao wt017ShippingActWarnListDao) {
        this.wt017ShippingActWarnListDao = wt017ShippingActWarnListDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the shipper time zone information.
     * 荷主のタイムゾーン情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.Wt017ShippingActWarnListDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.Wt017ShippingActWarnListCriteriaDomain)
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionTmNxsComp(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException {

        List<Wt017ShippingActWarnListDomain> resultList = wt017ShippingActWarnListDao
            .searchByConditionTmNxsComp(criteria);
        return resultList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the dao to search count for the shipper time zone information.
     * 荷主のタイムゾーン情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     */
    public int searchCountTmNxsComp(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException {
        return wt017ShippingActWarnListDao.searchCountTmNxsComp(criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the Shipping Actuality Warning information.
     * 船積実績ワーニング情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     * - The conversion to owner company format a ETD date.
     * 
     * - ETD日付を責任会社のフォーマットに変換する
     * @see com.globaldenso.eca0027.core.auto.business.service.Wt017ShippingActWarnListDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.Wt017ShippingActWarnListCriteriaDomain)
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionForPagingTtInvoice(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException {

        List<Wt017ShippingActWarnListDomain> resultList = wt017ShippingActWarnListDao
            .searchByConditionForPagingTtInvoice(criteria);

        return resultList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the dao to search count for the Shipping Actuality Warning information.
     * 船積実績ワーニング情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     */
    public int searchCountTtInvoice(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException {
        return wt017ShippingActWarnListDao.searchCountTtInvoice(criteria);
    }
}
