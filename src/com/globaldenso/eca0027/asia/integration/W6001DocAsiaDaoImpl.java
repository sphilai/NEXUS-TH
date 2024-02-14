/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.integration;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.asia.business.dao.W6001DocAsiaDao;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.integration.W6001DocDaoImpl;

/**
 * The DAO implementation class of Documentation.
 * <br />DocumentationのDAO実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12132 $
 */
public class W6001DocAsiaDaoImpl extends W6001DocDaoImpl implements W6001DocAsiaDao {
    
    /**
     * Default constructor
     */
    public W6001DocAsiaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderRegisterAsia(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByHeaderRegisterAsia", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByEDT46PRRegisterAsia(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByHeaderRegisterAsia", criteria);
    }

}