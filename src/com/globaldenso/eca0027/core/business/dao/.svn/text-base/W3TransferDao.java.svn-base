/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;

/**
 * <p>Dao for Transfer</p>
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */

public interface W3TransferDao {

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTtTransfer(W3TransferCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Search for paging with criteria</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingTtTransfer(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Search to get update data on carry out</p>
     *
     * @param trNo String
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends TtTmpStockDomain> searchForUpdateTtTmpStockCarryOutWh(
        String trNo) throws ApplicationException;

    /**
     * <p>Search to get update data on carry in</p>
     *
     * @param trNo String
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends TtTmpStockDomain> searchForUpdateTtTmpStockCarryInWh(
        String trNo) throws ApplicationException;

    /**
     * Cancel activate TR status
     * 
     * @param domain W3TransferDomain
     * @param criteria W3TransferCriteriaDomain
     * @return update Integer
     * @throws ApplicationException ApplicationException
     */
    public int updateForCancelActivateTtTransfer(W3TransferDomain domain,
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTransfer(W3TransferCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>Search for paging with criteria</p>
     *
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingTransfer(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * Cancel activate TR status
     * 
     * @param domain W3TransferDomain
     * @param criteria W3TransferCriteriaDomain
     * @return update Integer
     * @throws ApplicationException ApplicationException
     */
    public int cancelActivateTR(W3TransferDomain domain,
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_MM, TT_PLTZ, TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecieveCmlTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for paging with criteria
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for paging with criteria
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for PagingCreatePartsTransferReport
     * </p>
     * 
     * @param criteria criteria
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_MM, TT_PLTZ, TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainConfirmInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_MM, TT_PLTZ, TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainEditInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TW_TRANSFER_ITEM_PLTZ, TT_PLTZ_ITEM, TT_PLTZ, TT_TRANSFER_ITEM_PLTZ,TT_TRANSFER
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromCreateTrInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_ITEM_NO
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecievePartsTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_ITEM_NO, TM_CIGMA_WH_XREF
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainConfirmInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_ITEM_NO, TM_CIGMA_WH_XREF,TT_PLTZ_ITEM,TT_PLTZ,TT_EXP_RCV_ODR
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainEditInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_ITEM_NO, TM_CIGMA_WH_XREF,TT_PLTZ_ITEM,TT_PLTZ,TT_EXP_RCV_ODR
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromCreateTrInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search count with criteria before search data
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public int searchCountOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for paging with criteria
     * </p>
     * 
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Search for CIGMA inventory transaction by CML.</p>
     *
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> SearchForCreateCigmaTransactionOnCarryoutMainByCml(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Search for CIGMA inventory transaction by ITEM NO</p>
     *
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> SearchForCreateCigmaTransactionOnCarryoutMainByItem(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Search count for validate activate</p>
     *
     * @param criteria W3TransferCriteriaDomaincriteria
     * @return int count
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForValidateActivateOnCarryOutMainScreen(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Get list plant_cd on CML</p>
     *
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain 
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPlantCdForValidateCheckByCml(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>Get list plant_cd on Item</p>
     *
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain 
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchPlantCdForValidateCheckByItemNo(
        W3TransferCriteriaDomain criteria) throws ApplicationException;
}