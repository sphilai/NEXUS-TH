/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;

/**
 * <p>
 * Dao for Transfer
 * </p>
 * 
 * @author DIAT Chonthicha.A
 * @version 1.00
 */

public interface W3TransferCarryOutListDao {

    /**
     * <p> Search the total number of record for L3001 report. </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return int count
     * @throws ApplicationException ApplicationException
     */
    public int searchCountCarryOutListByCml(W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p> Search for L3001 report </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p> Search the total number of record for L3002 report. </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return int count
     * @throws ApplicationException ApplicationException
     */
    public int searchCountCarryOutByItemNo(W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p> Search for L3002 report </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria) throws ApplicationException;
}