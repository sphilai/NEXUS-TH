/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9016ExpShippingItemSpInfoMaDao;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;

/**
 * The DAO implementation class of Export  Shipping Item Sp Info MA.
 * <br />Exp Shipping Item Sp Info MA DAOの実装クラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9016ExpShippingItemSpInfoMaDaoImpl extends SqlMapClientDaoSupport implements W9016ExpShippingItemSpInfoMaDao {

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9016ExpShippingItemSpInfoMaDaoImpl(){
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9016ExpShippingItemSpInfoMaDao#searchCountTmExpItemNoSpInfo(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public int searchCountTmExpItemNoSpInfo(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9016ExpShippingItemSpInfoMa.SearchCountTmExpItemNoSpInfo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9016ExpShippingItemSpInfoMaDao#searchForPagingTmExpItemNoSpInfo(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9016ExpShippingItemSpInfoMaItemDomain> searchForPagingTmExpItemNoSpInfo(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9016ExpShippingItemSpInfoMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9016ExpShippingItemSpInfoMa.SearchForPagingTmExpItemNoSpInfo", criteria);
    }

}
