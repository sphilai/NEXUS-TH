/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt016UnregHsCdListDao;
import com.globaldenso.eca0027.core.business.domain.Wt016UnregHsCdListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt016UnregHsCdListCriteriaDomain;

/**
 * The search service implementation class of Unregistered HS CODE List Sub
 * Screen.
 * <br />HS CODE登録なし品番表示子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt016UnregHsCdListServiceImpl implements
    Wt016UnregHsCdListService {

    /**
     * wt016UnregHsCdListDao
     */
    private Wt016UnregHsCdListDao wt016UnregHsCdListDao;

    /**
     * Default constructor.
     */
    public Wt016UnregHsCdListServiceImpl() {
    }

    /**
     * <p>Setter method for wt016UnregHsCdListDao.</p>
     *
     * @param wt016UnregHsCdListDao Set for wt016UnregHsCdListDao
     */
    public void setWt016UnregHsCdListDao(Wt016UnregHsCdListDao wt016UnregHsCdListDao) {
        this.wt016UnregHsCdListDao = wt016UnregHsCdListDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the Unregistered HS CODE List information.
     * HS CODE登録なし品番情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     */
    public List<Wt016UnregHsCdListDomain> searchByCondition(
        Wt016UnregHsCdListCriteriaDomain criteria) throws ApplicationException {
        return wt016UnregHsCdListDao.searchByCondition(criteria);
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the dao to search count for the Unregistered HS CODE List information.
     * HS CODE登録なし品番情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     */
    public int searchCount(Wt016UnregHsCdListCriteriaDomain criteria)
        throws ApplicationException {
        return wt016UnregHsCdListDao.searchCount(criteria);
    }

}