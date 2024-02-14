/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.asia.business.dao.RpDocAsiaDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.asia.business.domain.L6008TtPackingAttachedByHeaderAndAsiaDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.asia.business.domain.criteria.L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of L6000 series.<br />
 *
 * @version $Revision: 10963 $
 */
public class RpDocAsiaDaoImpl extends SqlMapClientDaoSupport implements RpDocAsiaDao {

    /**
     * Default constructor.<br />
     */
    public RpDocAsiaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.asia.business.dao.RpDocAsiaDao#searchTtInvoiceAttachedBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtInvoiceAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDocAsia.SearchTtInvoiceAttachedBySumQty", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.asia.business.dao.RpDocAsiaDao#searchPackAtchedForMain(com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6008TtPackingAttachedByHeaderAndAsiaDetailDomain> searchPackAtchedForMain(L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6008TtPackingAttachedByHeaderAndAsiaDetailDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDocAsia.SearchTtPackingAttachedByHeaderAndDetail", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.asia.business.dao.RpDocAsiaDao#searchTtScAttachedBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtScAttachedBySumQtyDomain> searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtScAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDocAsia.SearchTtScAttachedBySumQty", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.asia.business.dao.RpDocAsiaDao#searchTtPackingAttachedItemBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtInvoiceAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDocAsia.SearchTtPackingAttachedItemBySumQty", criteria);
    }

}
