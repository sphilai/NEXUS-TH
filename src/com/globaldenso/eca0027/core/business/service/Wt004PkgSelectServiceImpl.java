/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt004PkgSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;

/**
 * The search service implementation class of Package Search Sub Screen.
 * <br />
 * 包装材選択子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */

public class Wt004PkgSelectServiceImpl implements Wt004PkgSelectService {

    /**
     * Wt004PkgSelectDao
     */
    private Wt004PkgSelectDao wt004PkgSelectDao;

    /**
     * Default constructor.
     */
    public Wt004PkgSelectServiceImpl() {
    }

    /**
     * <p>Setter method for wt004PkgSelectDao.</p>
     *
     * @param wt004PkgSelectDao Set for wt004PkgSelectDao
     */
    public void setWt004PkgSelectDao(Wt004PkgSelectDao wt004PkgSelectDao) {
        this.wt004PkgSelectDao = wt004PkgSelectDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the package information.
     * 包装材情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.Wt004PkgSelectDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.Wt004PkgSelectCriteriaDomain)
     */
    public List<Wt004PkgSelectDomain> searchByConditionForPaging(
        Wt004PkgSelectCriteriaDomain criteria) throws ApplicationException {

        List<Wt004PkgSelectDomain> resultList = wt004PkgSelectDao
            .searchByConditionForPaging(criteria);

        return resultList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search count for the package information.
     * 包装材情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     * 
     */
    public int searchCount(Wt004PkgSelectCriteriaDomain criteria)
        throws ApplicationException {
        return wt004PkgSelectDao.searchCount(criteria);
    }

}
