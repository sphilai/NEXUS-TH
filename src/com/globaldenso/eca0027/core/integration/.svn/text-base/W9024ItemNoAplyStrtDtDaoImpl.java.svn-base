/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9024ItemNoAplyStrtDtDao;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;

/**
 * The DAO implementation class of Item No. Apply Start Date Refer & Register.
 * <br />Item No. Apply Start Date Refer & Register DAOの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W9024ItemNoAplyStrtDtDaoImpl extends SqlMapClientDaoSupport implements W9024ItemNoAplyStrtDtDao {

    /**
     * Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W9024ItemNoAplyStrtDtDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9024ItemNoAplyStrtDtDao#searchTmPkgSpecRev(com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W9024ItemNoAplyStrtDtItemDomain searchTmPkgSpecRev(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException {
        return (W9024ItemNoAplyStrtDtItemDomain) getSqlMapClientTemplate()
            .queryForObject("W9024ItemNoAplyStrtDt.SearchTmPkgSpecRev", criteria);
    }

        /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9024ItemNoAplyStrtDtDao#serachTmPkgSpecRevHis(com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int serachTmPkgSpecRevHis(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9024ItemNoAplyStrtDt.SerachTmPkgSpecRevHis", criteria);
    }
}
