/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt015UnitPriceErrListDao;
import com.globaldenso.eca0027.core.business.domain.Wt015UnitPriceErrListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt015UnitPriceErrListCriteriaDomain;

/**
 * The search service implementation class of Unit Price Error List Sub Screen.
 *  <br />売価登録なし品番表示子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt015UnitPriceErrListServiceImpl implements
    Wt015UnitPriceErrListService {

    /**
     * wt015UnitPriceErrListDao
     */
    private Wt015UnitPriceErrListDao wt015UnitPriceErrListDao;

    /**
     * Default constructor.
     */
    public Wt015UnitPriceErrListServiceImpl() {
    }

    /**
     * <p>Setter method for wt015UnitPriceErrListDao.</p>
     *
     * @param wt015UnitPriceErrListDao Set for wt015UnitPriceErrListDao
     */
    public void setWt015UnitPriceErrListDao(Wt015UnitPriceErrListDao wt015UnitPriceErrListDao) {
        this.wt015UnitPriceErrListDao = wt015UnitPriceErrListDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the Unit Price Error List information.
     * 売価登録なし品番情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     */
    public List<Wt015UnitPriceErrListDomain> searchByCondition(
        Wt015UnitPriceErrListCriteriaDomain criteria) throws ApplicationException {
        return wt015UnitPriceErrListDao.searchByCondition(criteria);
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the dao to search count for the Unit Price Error List information.
     * 売価登録なし品番情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     */
    public int searchCount(Wt015UnitPriceErrListCriteriaDomain criteria)
        throws ApplicationException {
        return wt015UnitPriceErrListDao.searchCount(criteria);
    }

}