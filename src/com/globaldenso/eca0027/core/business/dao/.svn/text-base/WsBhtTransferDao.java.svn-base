/*
 * PROJECT：NEXUS
 *
 * VtShippfirmMain のServiceインターフェース
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws3501CmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501ItemNoListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;

/**
 * <p>
 * Interface DAO class of selecting the update data of Update Transfer Report Status for activate.<BR>
 * </p>
 *
 * @version 1.00
 */
public interface WsBhtTransferDao {

    /**
     * <p>
     * Search the update data if TR_ITEM_TYP is CML.<BR>
     * </p>
     *
     * @param criteria
     *            WsBhtTransferCriteriaDomain
     * @return List of WsBhtTransferDomain
     * @throws ApplicationException
     *             Application error
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForCml(
            WsBhtTransferCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * <p>
     * Search the update data if TR_ITEM_TYP is Parts.<BR>
     * </p>
     *
     * @param criteria
     *            WsBhtTransferCriteriaDomain
     * @return List of WsBhtTransferDomain
     * @throws ApplicationException
     *             Application error
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForParts(
            WsBhtTransferCriteriaDomain criteria) throws ApplicationException;

    // ********** SNT Add Start **********//
    /**
     * <p>
     * Get data for return result from DB By Cml.<BR>
     * </p>
     *
     * @param criteria WsBhtTransferCriteriaDomain
     * @return List of Ws3501CmlListItemDomain
     * @throws ApplicationException Application error
     */
    public List<Ws3501CmlListItemDomain> searchTransferInfoDetailByCml(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException;    

    /**
     * <p>
     * Get data for return result from DB By Item No.<BR>
     * </p>
     *
     * @param criteria WsBhtTransferCriteriaDomain
     * @return List of Ws3501ItemNoListItemDomain
     * @throws ApplicationException Application error
     */
    public List<Ws3501ItemNoListItemDomain> searchTransferInfoDetailByItemNo(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException;  
    /**
     * <p>
     * Get Main Mark list.<BR>
     * </p>
     *
     * @param domain WsBhtTransferDomain
     * @return List of Ws3506UpdateDomain
     * @throws ApplicationException Application error
     */
    public List<Ws3506UpdateDomain> searchMainMarkList(
        WsBhtTransferDomain domain) throws ApplicationException;  

    /**
     * <p>
     * Get Main Mark list.<BR>
     * </p>
     *
     * @param domain WsBhtTransferDomain
     * @return List of Ws3504ValidateResultDomain
     * @throws ApplicationException Application error
     */
    public List<Ws3504SearchResultDomain> searchTransferListByItemNo(
        Ws3504CriteriaDomain domain) throws ApplicationException;  
    // ********** SNT Add End **********//
}
