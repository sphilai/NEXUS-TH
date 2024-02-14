/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.T0400F010InvDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F020CmlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F030CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F040InvItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F050CtnrDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F060ShpActDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F070AttCtlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F7007ClpDomain;
import com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain;


/**
 * DAO Interface For The Batches Of EDI Orders For Registration
 * <br />船積書類GINV送信バッチのDAOインタフェースです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14032 $
 */
public interface JbTransferToGinvDao {

    /**
     * Search data for editing file of F010INV.
     * <br />未処理のTT_ONLINE_REQ_JOB_PARAMを検索します。
     *
     * L005 ADD
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400TransferToGinvDomain> searchReequstParam(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Update the target TT_ONLINE_REQ_JOB_PARAM to completion.
     * <br />対象のTT_ONLINE_REQ_JOB_PARAMを処理済みに更新します。
     *
     * L005 ADD
     *
     * @param t0400TransferToGinvDomainList parameter domain list
     * @return update count
     * @throws ApplicationException business exception
     */
    public int updateReequstParamComplate(List<? extends T0400TransferToGinvDomain> t0400TransferToGinvDomainList)
        throws ApplicationException;

    /**
     * Search data for editing file of F010INV
     * <br />F010INVファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F010InvDomain> searchT0400F010Inv(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F020CML
     * <br />F020CMLファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F020CmlDomain> searchT0400F020Cml(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F030CMLITEM
     * <br />F030CMLITEMファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F030CmlItemDomain> searchT0400F030CmlItem(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F040INVITEM
     * <br />F040INVITEMファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F040InvItemDomain> searchT0400F040InvItem(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F050CTNR
     * <br />F050CTNRファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F050CtnrDomain> searchT0400F050Ctnr(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F060SHPACT
     * <br />F060SHPACTファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F060ShpActDomain> searchT0400F060ShpAct(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F070ATTCTL when Invoice send
     * <br />インボイス送信時にF070ATTCTLファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenInvoice(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search B/L file ID and file name
     * <br />BLのファイルID、ファイル名を検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchBlldFileSummary(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F070ATTCTL when B/L send
     * <br />B/L送信時にF070ATTCTLファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenBilld(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F070ATTCTL when CLP send
     * <br />CLP送信時にF070ATTCTLファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenClp(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing CLP file.
     * <br />CLPファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F7007ClpDomain> searchClp(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search Other Shipping Doc. file ID and file name
     * <br />その他船積み書類のファイルID、ファイル名を検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchOtherDocFileSummary(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;

    /**
     * Search data for editing file of F070ATTCTL when Other Shipping Doc. send.
     * <br />その他船積み書類送信時にF070ATTCTLファイル編集用のデータを検索します。
     *
     * @param t0400TransferToGinvDomain parameter domain
     * @return search result list
     * @throws ApplicationException business exception
     */
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenOtherDoc(T0400TransferToGinvDomain t0400TransferToGinvDomain)
        throws ApplicationException;
}
