/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501CmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501ItemNoListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * The interface for BHT WebService Transfer Service class.<BR>
 * </p>
 * 
 * @version 1.00
 */
public interface WsBhtTransferService {

    /**
     * <p>
     * Search User Information from TM_USER
     * </p>
     * 
     * @param criteria TmUserCriteriaDomain
     * @return TmUserDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public TmUserDomain searchUserInfo(TmUserCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Update TR_STATUS of TT_TRANSFER
     * </p>
     * 
     * @param updateDomain TtTransferDomain
     * @return TmUserDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public int updateTrStatus(TtTransferDomain updateDomain)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Search Transfer Report of TT_TRANSFER
     * </p>
     * 
     * @param criteria TtTransferCriteriaDomain
     * @return TtTransferDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public TtTransferDomain searchTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Search WebService(WS3001) Parameter for Cml
     * </p>
     * 
     * @param criteria Ws3505SearchCriteriaDomain
     * @return List of WsBhtTransferDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForCml(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException;

    /**
     * <p>
     * Search WebService(WS3001) Parameter for Parts
     * </p>
     * 
     * @param criteria Ws3505SearchCriteriaDomain
     * @return List of WsBhtTransferDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForParts(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException;

    /**
     * <p>
     * Call WebService(WS3001)
     * </p>
     * 
     * @param criteria List of WsBhtTransferDomain
     * @param UsrNm String
     * @return ResultDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public ResultDomain callWs3001Rest(List<WsBhtTransferDomain> criteria,
        String UsrNm) throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Search Transfer Report of TT_TRANSFER
     * </p>
     * 
     * @param criteria TtTransferCriteriaDomain
     * @return int count
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public int searchCountTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException;
    
    /**
     * <p>
     * Check TR NO existsing In TT_TRANSFER
     * </p>
     * 
     * @param criteria List of TtTransferCriteriaDomain
     * @return boolean
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public boolean validateDatabaseTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Get data for return result from DB
     * </p>
     * 
     * @param criteria WsBhtTransferCriteriaDomain
     * @return List of Ws3501CmlListItemDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public List<Ws3501CmlListItemDomain> searchTransferInfoDetailByCml(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Get data for return result from DB
     * </p>
     * 
     * @param criteria WsBhtTransferCriteriaDomain
     * @return List of Ws3501ItemNoListItemDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public List<Ws3501ItemNoListItemDomain> searchTransferInfoDetailByItemNo(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * validateDatabaseMainMarkByCaseMark
     * </p>
     * 
     * @param ttPltzCriteriaDomain ttPltzCriteriaDomain
     * @return boolean
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public TtPltzDomain searchCmlListFromTtPltz(TtPltzCriteriaDomain ttPltzCriteriaDomain)
        throws GscmApplicationException, ApplicationException;
    
    /**
     * <p>
     * transactSequence
     * </p>
     * 
     * @param seqKey sequence key 採番キー
     * @param seqTyp sequence type 採番区分
     * @param num the number of sequence to get 取得する連番の個数
     * @param funcId function ID 機能ID
     * @return List<String> sequence number by padding with '0' 0埋めされた連番
     * @throws ApplicationException in case of no data in TM_SEQ 採番原単位から連番が取得できない場合
     */
    public List<String> transactSequence(String seqKey, String seqTyp, int num, String funcId) 
        throws ApplicationException;
    
    /**
     * <p>
     * insertTtTransfer
     * </p>
     * 
     * @param domain TtTransferDomain
     * @throws ApplicationException ApplicationException
     */
    public void insertTtTransfer(TtTransferDomain domain) throws ApplicationException;
    
    /**
     * <p>
     * insertTtTransferItemPltz
     * </p>
     * 
     * @param domain TtTransferItemPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public void insertTtTransferItemPltz(TtTransferItemPltzDomain domain) throws ApplicationException;
    
    /**
     * <p>
     * updateTtPltz
     * </p>
     * 
     * @param domain TtPltzDomain
     * @param criteria TtPltzCriteriaDomain
     * @return update count
     * @throws ApplicationException ApplicationException
     */
    public int updateTtPltz(TtPltzDomain domain, TtPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <p>
     * updateTtPltzByKey
     * </p>
     * 
     * @param domain TtPltzDomain
     * @return update count
     * @throws ApplicationException ApplicationException
     */
    public int updateTtPltzByKey(TtPltzDomain domain) throws ApplicationException;

    /**
     * <p>
     * updateTtTransfer
     * </p>
     * 
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @return update count
     * @throws ApplicationException ApplicationException
     */
    public int updateTtTransfer(TtTransferDomain domain,
        TtTransferCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * <p>
     * Get data for return result from DB
     * </p>
     * 
     * @param domain WsBhtTransferDomain
     * @return List of Ws3506UpdateDomain
     * @throws GscmApplicationException Business error (業務エラー)
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public List<Ws3506UpdateDomain> searchMainMarkList(
        WsBhtTransferDomain domain) throws GscmApplicationException,
        ApplicationException;

    //kimura change return parameter as void
    /**
     * <p>
     * Call L3003 generation function
     * </p>
     * 
     * @param trNo Transfer No
     * @param printerId PrinterId
     * @param noOfPrint No of Print 
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public void callPrintByCml(String trNo , String printerId , String noOfPrint) throws ApplicationException;

    //kimura change return parameter as void
    /**
     * <p>
     * Call L3004 generation function
     * </p>
     * 
     * @param trNo Transfer No
     * @param printerId PrinterId
     * @param noOfPrint No of Print 
     * @throws ApplicationException Application error (アプリケーションエラー)
     */
    public void callPrintByItemNo(String trNo , String printerId, String noOfPrint) throws ApplicationException;

    /**
     * <p>
     * validateDatabaseTransferListByItemNo
     * </p>
     * 
     * @param domain Ws3504CriteriaDomain
     * @return List of Ws3504ValidateResultDomain
     * @throws ApplicationException ApplicationException
     */
    public List<Ws3504SearchResultDomain> searchTransferListByItemNo(Ws3504CriteriaDomain domain) throws ApplicationException;
    
    /**
     * <p>
     * getTmCigmaWhXref
     * </p>
     * 
     * @param domain TmCigmaWhXrefCriteriaDomain
     * @return List of TmCigmaWhXrefDomain
     * @throws ApplicationException ApplicationException
     */
    public List<TmCigmaWhXrefDomain> getTmCigmaWhXref(TmCigmaWhXrefCriteriaDomain domain) throws ApplicationException;
    
    /**
     * <p>
     * Call Ws3003RestService to get Inventory Information
     * </p>
     * 
     * @param compCd Company Code
     * @param ws3003ParamDomain Ws3003ParamDomain
     * @return List<String[]> inventory information from CIGMA
     * @throws ApplicationException ApplicationException
     */
    public List<String[]> getInventoryInfo(String compCd, Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException;
    
    /**
     * <p>
     * get ODR_CONFIRM_FLG from TM_NXS_WH
     * </p>
     * 
     * @param tmNxsWhCriteriaDomain TmNxsWhCriteriaDomain
     * @return TmNxsWhDomain
     * @throws ApplicationException ApplicationException
     */
    public TmNxsWhDomain getTmNxsWh(
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain)
        throws ApplicationException;
    
    /**
     * <p>
     * combine a List to another List by Condition
     * 
     * @param validateResultList List<Ws3504ValidateResultDomain>
     * @param webServiceList List<String[]>
     * @return List<Ws3504ValidateResultDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<Ws3504SearchResultDomain> combineConnectDataForWs3504(
        List<Ws3504SearchResultDomain> validateResultList, List<String[]> webServiceList)
        throws ApplicationException;
    
    /**
     * <p>
     * insertTtTransferItemItemNo
     * </p>
     * 
     * @param domainList List<TtTransferItemItemNoDomain>
     * @throws ApplicationException ApplicationException
     */
    public void insertTtTransferItemItemNo(List<TtTransferItemItemNoDomain> domainList) throws ApplicationException;
    
    /**
     * <p>Update TT_TMP_STOCK on Activate</p>
     *
     * @param domain TtTransferDomain
     * @throws  ApplicationException exception
     */
    public void updateTtTmpStock(TtTransferDomain domain) throws ApplicationException;

    /**
     * <p>Check TmExpItemNoSpInfoDomain</p>
     *
     * @param item TmExpItemNoSpInfoCriteriaDomain
     * @return count int
     * @throws ApplicationException
     */
    public List<TmExpItemNoSpInfoDomain> searchItemSpecialInfo(TmExpItemNoSpInfoCriteriaDomain item) throws ApplicationException; 
}
