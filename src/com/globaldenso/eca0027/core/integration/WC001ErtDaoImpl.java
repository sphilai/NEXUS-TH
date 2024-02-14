/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WC001ErtDao;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;

/**
 * This is an implement class of Empty RT materials DAO.
 * <br />Empty RT materials DAOの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class WC001ErtDaoImpl extends SqlMapClientDaoSupport implements WC001ErtDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001ErtDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WC001ErtDao#searchTtPltzByAuth(WC001ErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WC001ErtDomain> searchTtPltzByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        return (List<WC001ErtDomain>) getSqlMapClientTemplate()
            .queryForList("WC001Ert.SearchTtPltzByAuth", criteria);

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WC001ErtDao#searchTmExpShipToShippingByKey(WC001ErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public WC001ErtDomain searchTmExpShipToShippingByKey(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        return (WC001ErtDomain) getSqlMapClientTemplate()
            .queryForObject("WC001Ert.SearchTmExpShipToShippingByKey", criteria);

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WC001ErtDao#searchTmExpShipToShippingByKey(WC001ErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public WC001ErtDomain searchTmPkgMtrlByKey(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        return (WC001ErtDomain) getSqlMapClientTemplate()
            .queryForObject("WC001Ert.SearchTmPkgMtrlByKey", criteria);

    }

}

