/*
 * Project : NEXUS_EXPORT
 *
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;

/**
 * <p>
 * Interface of the service for Carry Out List function
 * </p>
 * 
 * @author DIAT Chonthicha.A
 * @version 1.00
 */
public interface W3TransferCarryOutListService {

    /**
     * <p>
     * Search count with criteria for Carry Out List by CML Report
     * </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search for Carry Out List Report by CML from TT_PLTZ,
     * TW_CARRY_OUT_LIST_PLTZ, TT_PLTZ_ITEM, TT_TRANSFER_ITEM_PLTZ, TT_TRANSFER,
     * TM_NXS_COMP
     * </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search count with criteria for Carry Out List by Item No Report
     * </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search for Carry Out List Report by Item No from TT_EXP_RCV_ODR,
     * TT_TRANSFER_ITEM_ITEM_NO, TT_TRANSFER, TW_CARRY_OUT_LIST_ITEM_NO,
     * TT_PLTZ_ITEM, TT_PLTZ, TM_EXP_ITEM_NO_SP_INFO, TT_EXP_RCV_ODR,
     * TM_NXS_COMP 
     * - get on hand quantity from ws3003RestService 
     * - get transferable quantity from calculation of 
     *    SumExpQty() - SumCarryOutQty() - SumQty() - OnHandQty()
     * </p>
     * 
     * @param criteria W3TransferCarryOutListCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException;
}
