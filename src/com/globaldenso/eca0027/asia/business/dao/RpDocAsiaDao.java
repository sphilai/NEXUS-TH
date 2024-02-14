/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.asia.business.domain.L6008TtPackingAttachedByHeaderAndAsiaDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.asia.business.domain.criteria.L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain;

/**
 * The DAO interface for creating a form of L6000 series.
 * <pre>
 * bean id:rpDocAsiaDao
 * </pre>
 * 
 * @author $Author: DCS $
 */
public interface RpDocAsiaDao {

    /**
     * Get the Invoice Attached items.
     * <pre>
     * - Search The Invoice Attached
     *   an argument criteriaDomain, call the searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     *
     * @param criteria L6003TtInvoiceAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtInvoiceAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get each item Invoice, Packing Header, Packing Attached CML, of Packing Attached Item No.
     * <pre>
     * - Search by binding Invoice, Packing Header, Packing Attached CML, the Packing Attached Item No
     *   an argument criteriaDomain, call RpDocDao # searchPackingAttachedMainInfo(L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     *
     * @param criteria L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain 
     * @return List<L6008TtPackingAttachedByHeaderAndAsiaDetailDomain>
     * @throws ApplicationException application exception
     */
    List<L6008TtPackingAttachedByHeaderAndAsiaDetailDomain> searchPackAtchedForMain(L6008TtPackingAttachedByHeaderAndAsiaDetailCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the Sales Contract Attached items.
     * <pre>
     * - Search Sales Contract Attached
     *   an argument criteriaDomain, call the searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - Return the data retrieved.
     * </pre>
     *
     * @param criteria L6003TtScAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtScAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtScAttachedBySumQtyDomain> searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the Packing Attached items.
     * <pre>
     * - Search The Packing Attached
     *   an argument criteriaDomain, call the searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     *
     * @param criteria L6003TtInvoiceAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtInvoiceAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;
    
}