/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;

/**
 * <p>
 * Interface of the service that provides a Transfer Transaction data function
 * </p>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public interface W3TransferService {

    /**
     * <p>
     * Search count with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCount(W3TransferCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Update transfer header
     * </p>
     * 
     * @param listUpdateDomain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateTransfer(List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException;

    /**
     * Cancel activate service
     * 
     * @param domain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void cancelActivateTR(W3TransferDomain domain)
        throws ApplicationException;

    /**
     * <p>
     * Validate status for Activate TR.
     * </p>
     * 
     * @param trNo String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateTrStatusForActivate(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * Validate status for Cancel TR.
     * </p>
     * 
     * @param trNo String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateTrStatusForCancel(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_MM, TT_PLTZ, TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecieveCmlTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search count with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search and return count for CarryOutMainSearch Screen
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException;
     */
    public int searchCountForPagingOnCarryOutMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnCarryOutMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Update transfer header
     * </p>
     * 
     * @param listUpdateDomain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnCarryOutMainScreenActivate(
        List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException;

    /**
     * <p>
     * Update transfer header
     * </p>
     * 
     * @param listUpdateDomain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnCarryInMainScreenReceive(
        List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException;

    /**
     * Cancel activate service
     * 
     * @param domain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnCarryoutMainScreenCancel(W3TransferDomain domain)
        throws ApplicationException;

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param trNo String
     * @param dscId String
     * @param funcId String
     * @throws ApplicationException ApplicationException
     */
    public void updateTtTmpStockOnCarryOutMainScreenActivate(String trNo,
        String dscId, String funcId) throws ApplicationException;

    /**
     * <p>
     * Update TT_TMP_STOCK when activate.
     * </p>
     * 
     * @param trNo String
     * @param dscId String
     * @param funcId String
     * @throws ApplicationException ApplicationException
     */
    // TODO
    public void updateTtTmpStockOnCarryOutMainScreenCancel(String trNo,
        String dscId, String funcId) throws ApplicationException;

    /**
     * <p>
     * Validate status for Activate TR.
     * </p>
     * 
     * @param trNo String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTtTransferOnCarryOutMainActivate(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * Validate status for Cancel TR.
     * </p>
     * 
     * @param trNo String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTtTransferOnCarryOutMainCancel(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * validateConsistency for FmTrRcvDate and ToTrRcvDate
     * </p>
     * 
     * @param lastTrRcvDtFrom String
     * @param lastTrRcvDtTo String
     * @param dateFormat String
     * @return Status Boolean
     */
    public boolean validateConsistencyFmTrRcvDateToTrRcvDate(
        String lastTrRcvDtFrom, String lastTrRcvDtTo, String dateFormat);

    /**
     * <p>
     * validateConsistency for FmIssueDate and ToIssueDate
     * </p>
     * 
     * @param fmIssueDate fmIssueDate
     * @param toIssueDate toIssueDate
     * @param dateFormat dateFormat
     * @return boolean boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(
        String fmIssueDate, String toIssueDate, String dateFormat)
        throws ApplicationException;

    /**
     * <p>
     * validateConsistency for FmActivateDate and ToActivateDate
     * </p>
     * 
     * @param fmActDate fmActDate
     * @param toActDate toActDate
     * @param dateFormat dateFormat
     * @return boolean boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateConsistencyFmActivateDateToActivateDate(
        String fmActDate, String toActDate, String dateFormat)
        throws ApplicationException;

    /**
     * <p>
     * validateDatabase for TtTransfer CarryInMainReceive process
     * </p>
     * 
     * @param trNo String
     * @return boolean boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTtTransferOnCarryInMainReceive(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * Validate status for validateDatabaseWhCompanyWh
     * </p>
     * 
     * @param compCd String
     * @param whCd String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd)
        throws ApplicationException;

    /**
     * <p>
     * Validate status for Shipper
     * </p>
     * 
     * @param shipper String
     * @return Status Boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseShipper(String shipper)
        throws ApplicationException;
    /**
     * <p>
     * Validate Combination Company Code ,W/H Code ,Shipper
     * </p>
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException;
    /**
     * <p>
     * Search count with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search count with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for Pltz
     * </p>
     * 
     * @param criteria TtPltzCriteriaDomain
     * @return TtPltzDomain TtPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public TtPltzDomain validateDatabasePltz(TtPltzCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Insert Delete for CarryOutListPltz
     * </p>
     * 
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnPrintCarryOutListByCmlUpdate(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Insert for TwTransferItemPltzDomain
     * </p>
     * 
     * @param criteria TwTransferItemPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnCmlTranseferReportUpdate(
        TwTransferItemPltzDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for CarryOutListPltz
     * </p>
     * 
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for TransferItemPltz
     * </p>
     * 
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return count int
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search for TransferItemItemNo
     * </p>
     * 
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return count int
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Print for PrintForUpdate
     * </p>
     * 
     * @param l3001ReportDomain L3001ReportDomain
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printCarryOutListByCml(L3001ReportDomain l3001ReportDomain)
        throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ, TT_PLTZ,
     * TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> validateDatabaseTrStatus(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ, TT_PLTZ,
     * TT_PLTZ_ITEM.
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<TtTransferDomain> validateDatabaseTrStatus(
        TtTransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * w3010 receive function : update TT_TRANSFER
     * </p>
     * 
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnReceiveCmlTransferReportReceive(
        TtTransferDomain domain, TtTransferCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Print TR
     * </p>
     * 
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File createPrintTrByCml(String trNo) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ, TT_PLTZ,
     * TT_PLTZ_ITEM. W3006 (transferred from W3005)
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromCreateTrInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ, TT_PLTZ,
     * TT_PLTZ_ITEM. W3006 (transferred from W3001 Confirm Detail)
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainConfirmInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ, TT_PLTZ,
     * TT_PLTZ_ITEM. W3006 (transferred from W3001 Edit TR)
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainEditInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search count with criteria W3007
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search data from TT_TRANSFER, TT_TRANSFER_ITEM_PLTZ,
     * TT_TRANSFER_ITEM_ITEM_NO, TT_PLTZ_ITEM,TT_EXP_RCV_ODR. W3007
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * insert into TW_TRANSFER_ITEM_ITEM_NO W3007 update function
     * </p>
     * 
     * @param criteria TwTransferItemItemNoDomain
     * @throws ApplicationException ApplicationException
     */
    public void createOnCreateCreatePartsTransferReportUpdate(
        TwTransferItemItemNoDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Print for Print TR
     * </p>
     * 
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printTransferReportByCml(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * Search TT_PLTZ.
     * </p>
     * 
     * @param criteria TtPltzCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTrStatus(TtPltzCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search TwTransferItemPltz.
     * </p>
     * 
     * @param criteria TwTransferItemPltz
     * @return search result
     * @throws ApplicationException ApplicationException
     */
    public TwTransferItemPltzDomain validateDatabaseDeleteAllMainMarksInWk(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Update TtTransfer.
     * </p>
     * 
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @return search result
     * @throws ApplicationException ApplicationException
     */
    public int transactOnRegisterPartsTransferReportCancelTr(
        TtTransferDomain domain, TtTransferCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * delete TtTransfer.
     * </p>
     * 
     * @param domain TwTransferItemPltzCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void deleteOnRegisterCmlTransferReportDelete(
        TwTransferItemPltzCriteriaDomain domain) throws ApplicationException;

    /**
     * <p>
     * update delete TtTransfer.
     * </p>
     * 
     * @param w3008UpdateDomain W3008UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void transactOnRegisterPartsTransferReportEditRegister(
        W3008UpdateDomain w3008UpdateDomain) throws ApplicationException;

    /**
     * <p>
     * UPDATE INSET DELETE
     * </p>
     * 
     * @param w3006UpdateDomain W3006UpdateDomain
     * @return trNo, updateCnt W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public W3TransferDomain transactOnRegisterCmlTransferReportRegister(
        W3006UpdateDomain w3006UpdateDomain) throws ApplicationException;

    /**
     * <p>
     * UPDATE DELETE
     * </p>
     * 
     * @param w3006UpdateDomain W3006UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void transactOnRegisterCmlTransferReportEditRegister(
        W3006UpdateDomain w3006UpdateDomain) throws ApplicationException;

    /**
     * <p>
     * UPDATE TT_TRANSFER on W3006 Cancel TR
     * </p>
     * 
     * @param criteria W3006UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void updateTtTransferOnRegisterCmlTransferReportCancelTr(
        W3006ListDomain criteria) throws ApplicationException;

    /**
     * <p>
     * UPDATE TT_PLTZ on W3006 Cancel TR
     * </p>
     * 
     * @param criteria W3006UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void updateTtPltzOnRegisterCmlTransferReportCancelTr(
        W3006ListDomain criteria) throws ApplicationException;
    /**
     * <p>
     * Get Legacy WH Code from Xref
     * </p>
     * 
     * @param tmCigmaWhXrefCriteriaDomain TmCigmaWhXrefCriteriaDomain
     * @return Legacy WH Code
     * @throws ApplicationException ApplicationException
     */
    public List<TmCigmaWhXrefDomain> getTmCigmaWhXref(
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain)
        throws ApplicationException;

    /**
     * <p>
     * combine a List to another List by Condition
     * </p>
     * 
     * @param w3007List List<W3007ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3007ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3007ListDomain> combineConnectDataForW3007(
        List<? extends W3007ListDomain> w3007List, List<String[]> webServiceList)
        throws ApplicationException;

    /**
     * <p>
     * get ODR_CONFIRM_FLG from TM_NXS_WH
     * </p>
     * 
     * @param tmNxsWhCriteriaDomain TmNxsWhCriteriaDomain
     * @return TmNxsWhDomain
     * @throws ApplicationException ApplicationException
     */
    public TmNxsWhDomain getTmNxsWh(TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain)
        throws ApplicationException;

    /**
     * <p>
     * Search list from TT_TRANSFER, TT_TRANSFER_ITEM_ITEM_NO
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecievePartsTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Print TR
     * </p>
     * 
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File createPrintTrByParts(String trNo) throws ApplicationException;

    /**
     * <p>
     * searchRegisterPartsTransferReportFromMainConfirmInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainConfirmInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * searchRegisterPartsTransferReportFromMainEditInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainEditInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * searchRegisterPartsTransferReportFromCreateTrInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromCreateTrInit(
        W3008CriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * delete records from TwTransferItemItemNo
     * </p>
     * 
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void deleteOnRegisterPartsTransferReportDelete(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Print for Print TR
     * </p>
     * 
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printTransferReportByItemNo(String trNo)
        throws ApplicationException;

    /**
     * <p>
     * combine a List to another List by Condition
     * </p>
     * 
     * @param w3008List List<W3008ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3008ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3008ListDomain> combineConnectDataForW3008(
        List<? extends W3008ListDomain> w3008List, List<String[]> webServiceList)
        throws ApplicationException;

    /**
     * <p>
     * Insert Delete for
     * TT_TRANSFER_ITEM_ITEM_NO,TT_TRANSFER,TW_TRANSFER_ITEM_ITEM_NO
     * </p>
     * 
     * @param w3008UpdateDomain W3008UpdateDomain
     * @return trNO String
     * @throws ApplicationException ApplicationException
     */
    public String transactOnRegisterPartsTransferReportRegister(
        W3008UpdateDomain w3008UpdateDomain) throws ApplicationException;

    /**
     * <p>
     * check parameter
     * </p>
     * 
     * @param w3008UpdateDomain W3008UpdateDomain
     * @throws ApplicationException ApplicationException
     */
    public void validateConsistencyCheckQty(W3008UpdateDomain w3008UpdateDomain)
        throws ApplicationException;

    /**
     * <p>
     * check parameter
     * </p>
     * 
     * @param criteria TtTransferCriteriaDomain
     * @return TtTransferDomain
     * @throws ApplicationException ApplicationException
     */
    public TtTransferDomain validateDatabaseTrStatusByKey(
        TtTransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * </p>
     * 
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnReceiveCmlTransferReportReceiveTtPltz(
        TtPltzDomain domain, TtPltzCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Delete records in TW_CARRY_OUT_LIST_PLTZ
     * </p>
     * 
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int deleteTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Delete records in TW_CARRY_OUT_LIST_ITEM_NO
     * </p>
     * 
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int deleteTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Delete records in TW_TRANSFER_ITEM_PLTZ
     * </p>
     * 
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int deleteTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Delete records in TW_TRANSFER_ITEM_ITEM_NO
     * </p>
     * 
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int deleteTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search Count in TW_CARRY_OUT_LIST_PLTZ
     * </p>
     * 
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search Count in TW_CARRY_OUT_LIST_ITEM_NO
     * </p>
     * 
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search Count in TW_TRANSFER_ITEM_PLTZ
     * </p>
     * 
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search Count in TW_TRANSFER_ITEM_ITEM_NO
     * </p>
     * 
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Search count with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Search result for paging with criteria
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * Shipper authority check <br />
     * Shipper権限チェックを行います。
     * 
     * <pre>
     * - The Shipper that you specify, and check that there is an update privileges for this function to log in person
     *     - Call of userAuthService.hasUserAuthForComp an argument permitFuncId and shipperCd
     *         For details, common specifications xls: see &quot;access common specifications refer to and update authority&quot;.
     * 
     * - 指定したShipperで、ログイン者にこの機能の更新権限があることをチェック
     *     - permitFuncId, shipperCdを引数にuserAuthService.hasUserAuthForCompの呼び出し
     *         詳細は共通仕様.xls「アクセス権限共通仕様：参照・更新権限」を参照
     * </pre>
     * 
     * @param permitFuncId Permit Function ID
     * @param shipperCd Company code
     * @return True, false and otherwise if there is a function use rights to
     *         the company code specified
     * @throws ApplicationException If the authorization check can not be
     */
    public boolean validateConsistencyShipperAuth(String permitFuncId,
        String shipperCd) throws ApplicationException;

    /**
     * <p>
     * Call Ws3003RestService to get Inventory Information
     * </p>
     * 
     * @param compCd Company Code
     * @param ws3003ParamDomain Ws3003ParamDomain
     * @return List<String[]>
     * @throws ApplicationException ApplicationException
     */
    public List<String[]> getInventoryInfo(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException;

    /**
     * <p>
     * combine a List to another List by Condition
     * </p>
     * 
     * @param w3004List List<W3004ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3004ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3004ListDomain> combineConnectDataForW3004(
        List<? extends W3004ListDomain> w3004List, List<String[]> webServiceList)
        throws ApplicationException;

    /**
     * <p>
     * Insert Delete for TwCarryOutListItemNo
     * </p>
     * 
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnPrintCarryOutListByPartsUpdate(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Print for PrintForAll
     * </p>
     * 
     * @param l3002ReportDomain L3002ReportDomain
     * @return PDF帳票 File
     * @throws ApplicationException ApplicationException
     */
    public File printCarryOutListByParts(L3002ReportDomain l3002ReportDomain)
        throws ApplicationException;

    /**
     * <p>
     * Search for TW_CARRY_OUT_LIST_ITEM_NO
     * </p>
     * 
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Issue Inventory Transaction for Activate.
     * </p>
     * 
     * @param shipperCd String
     * @param trNo String
     * @param userName String
     * @param trItemTyp String
     * @throws ApplicationException ApplicationException
     */
    public void transactCigmaInventoryOnCarryOutMainByActivate(
        String shipperCd, String trNo, String userName, String trItemTyp)
        throws ApplicationException;

    /**
     * <p>
     * Issue Inventory Transaction for Cancel Activate.
     * </p>
     * 
     * @param shipperCd String
     * @param trNo String
     * @param userName String
     * @param trItemTyp String
     * @throws ApplicationException ApplicationException
     */
    public void transactCigmaInventoryOnCarryOutMainByCancelActivate(
        String shipperCd, String trNo, String userName, String trItemTyp)
        throws ApplicationException;

    /**
     * <p>
     * Validate authority check for CarryOutMain Screen
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseAuthorityCheckOnCarryOutMain(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * Validate authority check for CarryInMain Screen
     * </p>
     * 
     * @param criteria W3TransferCriteriaDomain
     * @return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseAuthorityCheckOnCarryInMain(
        W3TransferCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * search UserName ByKey
     * </p>
     * 
     * @param criteria TmUserCriteriaDomain
     * @return TmUserDomain
     * @throws ApplicationException ApplicationException
     */
    public TmUserDomain searchUserNameByKey(TmUserCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <p>
     * Update TT_PLTZ table on activate
     * </p>
     * 
     * @param updateDomain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateTtPltzOnActivate(W3TransferDomain updateDomain)
        throws ApplicationException;

    /**
     * <p>
     * Update TT_PLTZ table on cancel activate
     * </p>
     * 
     * @param updateDomain W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateTtPltzOnCancelActivate(W3TransferDomain updateDomain)
        throws ApplicationException;
}
