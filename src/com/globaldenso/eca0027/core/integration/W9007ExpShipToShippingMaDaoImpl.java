/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;

/**
 * The DAO implementation class of Export Ship To Shipping MA.
 * <br />Exp Ship To Shipping MA DAOの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6748 $
 */
public class W9007ExpShipToShippingMaDaoImpl extends SqlMapClientDaoSupport implements W9007ExpShipToShippingMaDao {
    
    /**
     * constructor.
     *
     */
    public W9007ExpShipToShippingMaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao#searchCountTmExpShipToShipping(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    public int searchCountTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9007ExpShipToShippingMa.SearchCountTmExpShipToShipping", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao#searchForPagingTmExpShipToShipping(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9007ExpShipToShippingMaItemDomain> searchForPagingTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9007ExpShipToShippingMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9007ExpShipToShippingMa.SearchForPagingTmExpShipToShipping", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao#lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9007ExpShipToShippingMaItemDomain> lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9007ExpShipToShippingMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9007ExpShipToShippingMa.LockByNoWaitTmInvTplShipTo", criteria);
    }
}
