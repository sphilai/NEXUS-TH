/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_LOADING_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_CLP_VOLUME_UNIT_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_CLP_WEIGHT_UNIT_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_COMMAND_DIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_COMMAND_NAME_NO_EXT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_COMPLETE_DIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_ATTCTL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_CMLITEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_CTNR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_INV;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_INVITEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_DATA_FILE_SHPACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_FTM_SEND_DIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_INPUT_CTL_TYP_NEXUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROCESSING_DIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_ALL_DOC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_BILLD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_CLP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_SHIPPING_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_REQ_ID_FILE_PREFIX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_RESOURCE_KEY_FTM_FILE_ID;
import static java.math.BigDecimal.ONE;
import static java.math.RoundingMode.UP;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

import com.globaldenso.ai.aijb.core.business.domain.QueueInfDomain;
import com.globaldenso.ai.aijb.library.business.service.MessageLogFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService;
import com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao;
import com.globaldenso.eca0027.core.business.domain.T0400F010InvDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F020CmlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F030CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F040InvItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F050CtnrDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F060ShpActDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F070AttCtlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F7007ClpDomain;
import com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.TmResourcesDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmResourcesService;
import com.globaldenso.gscm.framework.util.ResourcesFactory;


/**
 * This is Service of Job for Transferring Shipping Documents to GINV.
 * <br />船積書類GINV送信ジョブのサービスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14069 $
 */
public class JbTransferToGinvServiceImpl implements JbTransferToGinvService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * Transferring Shipping Documents to GINV DAO
     * <br />船積書類GINV送信DAO
     */
    protected JbTransferToGinvDao jbTransferToGinvDao;

    /**
     * Resource   Service
     * <br />リソース サービス
     */
    protected TmResourcesService tmResourcesService;

    /**
     * TT_ONLINE_REQ_JOB_PARAM service
     * <br />TT_ONLINE_REQ_JOB_PARAMサービス
     */
    protected TtOnlineReqJobParamService ttOnlineReqJobParamService;

    /**
     * File Manager
     * <br />ファイルマネージャ
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * A.I. Artificial Intelligence-JB message log registration parts
     * <br />AI-JB メッセージログ登録部品
     */
    protected MessageLogFacadeService messageLogFacadeService;

    // Initialize resource.
    static {
        ResourcesFactory factory = new ResourcesFactory();
        factory.createResources("AijbLogMessages");
    }

    /**
     * constructor
     * <br />コンストラクタです。
     *
     */
    public JbTransferToGinvServiceImpl() {
    }

    // ------------------- Setter of dependent services / Dao -------------------
    // ------------------- 依存サービス・DaoのSetter -------------------

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for jbTransferToGinvDao.
     *
     * @param jbTransferToGinvDao Set for jbTransferToGinvDao
     */
    public void setJbTransferToGinvDao(JbTransferToGinvDao jbTransferToGinvDao) {
        this.jbTransferToGinvDao = jbTransferToGinvDao;
    }

    /**
     * Setter method for tmResourcesService.
     *
     * @param tmResourcesService Set for tmResourcesService
     */
    public void setTmResourcesService(TmResourcesService tmResourcesService) {
        this.tmResourcesService = tmResourcesService;
    }

    /**
     * Setter method for ttOnlineReqJobParamService.
     *
     * @param ttOnlineReqJobParamService Set for ttOnlineReqJobParamService
     */
    public void setTtOnlineReqJobParamService(
        TtOnlineReqJobParamService ttOnlineReqJobParamService) {
        this.ttOnlineReqJobParamService = ttOnlineReqJobParamService;
    }

    /**
     * Setter method for fileManagerServiceForStream.
     *
     * @param fileManagerServiceForStream Set for fileManagerServiceForStream
     */
    public void setFileManagerServiceForStream(
        FileManagementService fileManagerServiceForStream) {
        this.fileManagerServiceForStream = fileManagerServiceForStream;
    }

    /**
     * Setter method for messageLogFacadeService.
     *
     * @param messageLogFacadeService Set for messageLogFacadeService
     */
    public void setMessageLogFacadeService(
        MessageLogFacadeService messageLogFacadeService) {
        this.messageLogFacadeService = messageLogFacadeService;
    }

    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * {@inheritDoc}
     *
     * L005 CHANGE
     *
     * @see com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService#transactRequest(com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain)
     */
    public boolean transactRequest(QueueInfDomain queueInfDomain) throws ApplicationException {

        // Set common information for job processing.
        // ジョブの処理に必要な共通情報を設定。
        T0400TransferToGinvDomain t0400TransferToGinvDomain = new T0400TransferToGinvDomain();
        t0400TransferToGinvDomain.setProcessingDirectory(new File(TRANS_GINV_PROCESSING_DIR)); // /data/app/snd/ginv/processing
        t0400TransferToGinvDomain.setCompleteDirectory(new File(TRANS_GINV_COMPLETE_DIR)); // /data/app/snd/ginv/complete
        t0400TransferToGinvDomain.setFtmSendDirectory(new File(TRANS_GINV_FTM_SEND_DIR)); // /TACTICS/FTM/SND
        t0400TransferToGinvDomain.setCommandDirectory(new File(TRANS_GINV_COMMAND_DIR)); // /data/app/batch/service
        t0400TransferToGinvDomain.setCommandFileNameNoExt(TRANS_GINV_COMMAND_NAME_NO_EXT); // send2ginv
        String ftmFileId = getResourceValue(TRANS_GINV_RESOURCE_KEY_FTM_FILE_ID); // =TACTICS ID e.g. C164RAA0
        t0400TransferToGinvDomain.setFtmFileId(ftmFileId);
        t0400TransferToGinvDomain.setFtmSendHostCode(StringUtils.left(ftmFileId, 2));

        // When there is a file in a working directory, nothing done normally.
        // 作業ディレクトリにファイルが存在している場合、何もせず空振り。
        File[] anyFlesInWorkDirectory = t0400TransferToGinvDomain.getProcessingDirectory().listFiles();
        if (anyFlesInWorkDirectory == null) {
            throw new SystemException(NXS_91_0001);
        }
        if (0 < anyFlesInWorkDirectory.length) {
            return true;
        }

        // When there is a file in a FTM send directory, nothing done normally.
        // FTM送信ディレクトリにファイルが存在している場合、何もせず空振り。
        File[] anyFlesInFtmSendDirectory = t0400TransferToGinvDomain.getFtmSendDirectory().listFiles();
        if (anyFlesInFtmSendDirectory == null) {
            throw new SystemException(NXS_91_0001);
        }
        if (0 < anyFlesInFtmSendDirectory.length) {
            return true;
        }

        // Get unprocessed multiple requests from parameter table.
        // パラメータテーブルより未処理の複数リクエストを取得する。
        List<? extends T0400TransferToGinvDomain> resultRequestDomainList
            = jbTransferToGinvDao.searchReequstParam(t0400TransferToGinvDomain);
        if (resultRequestDomainList.size() == 0) {
            return true;
        }
        // Repeat request (= 1 operation) unit.
        // リクエスト（=1操作）単位の繰り返し。
        for (T0400TransferToGinvDomain resultRequestDomain : resultRequestDomainList) {
            t0400TransferToGinvDomain.setRequestId(resultRequestDomain.getRequestId());
            t0400TransferToGinvDomain.setProcessTyp(resultRequestDomain.getProcessTyp());

            // Create a working directory for 1 request.
            // 1リクエスト用の作業ディレクトリを作成する。
            String requestDirectoryBaseName
                = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Timestamp(System.currentTimeMillis()));
            t0400TransferToGinvDomain.setRequestDirectory(
                new File(t0400TransferToGinvDomain.getProcessingDirectory(),
                    t0400TransferToGinvDomain.getFtmFileId() + requestDirectoryBaseName
                )
            );
            t0400TransferToGinvDomain.getRequestDirectory().mkdir();

            // Make Request ID naming file in work directory.
            // 作業ディレクトリにリクエストID名のファイルを作成。
            File requestIdFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_REQ_ID_FILE_PREFIX + t0400TransferToGinvDomain.getRequestId());
            try {
                if (!requestIdFile.createNewFile()) {
                    throw new SystemException(NXS_91_0001);
                }
            } catch (Exception e) {
                throw new SystemException(NXS_91_0001, e);
            }

            // Create Invoice I/F file
            // インボイス連携ファイル作成
            if (TRANS_GINV_PROC_TYP_INVOICE.equals(t0400TransferToGinvDomain.getProcessTyp())) {
                makeWorkFileForInvoice(t0400TransferToGinvDomain);
            // Create Shipping ACT I/F file
            // 船積実績連携ファイル作成
            } else if (TRANS_GINV_PROC_TYP_SHIPPING_ACT.equals(t0400TransferToGinvDomain.getProcessTyp())) {
                makeWorkFileForShpingActCommon(t0400TransferToGinvDomain);
                makeWorkFileForShippingActSpecial(t0400TransferToGinvDomain);
            // Create B/L I/F file
            // B/L連携ファイル作成
            } else if (TRANS_GINV_PROC_TYP_BILLD.equals(t0400TransferToGinvDomain.getProcessTyp())) {
                makeWorkFileForShpingActCommon(t0400TransferToGinvDomain);
                makeWorkFileForBilldSpecial(t0400TransferToGinvDomain);
            // Create CLP I/F file
            // CLP連携ファイル作成
            } else if (TRANS_GINV_PROC_TYP_CLP.equals(t0400TransferToGinvDomain.getProcessTyp())) {
                makeWorkFileForShpingActCommon(t0400TransferToGinvDomain);
                makeWorkFileForClpSpecial(t0400TransferToGinvDomain);
            // Create Other Doc. I/F file
            // その他書類連携ファイル作成
            } else if (TRANS_GINV_PROC_TYP_ALL_DOC.equals(t0400TransferToGinvDomain.getProcessTyp())) {
                makeWorkFileForShpingActCommon(t0400TransferToGinvDomain);
                makeWorkFileForOtherDocSpecial(t0400TransferToGinvDomain);
            } else {
                throw new SystemException(NXS_91_0001, t0400TransferToGinvDomain.getProcessTyp());
            }
        }

        // Call the shell for zip&request transmission to the FTM asynchronously.
        // ZIP化&FTMへの送信要求シェルの非同期呼び出し。
        sendZipFileToGinv(t0400TransferToGinvDomain);

        // Update the target request in the parameter table to processed.
        // パラメータテーブルの対象リクエストを処理済みに更新する。
        jbTransferToGinvDao.updateReequstParamComplate(resultRequestDomainList);

        return true;
    }

    //--------------------------------- Below, protected method ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Get resource value
     * <br />リソース定義値取得。
     *
     * @param key resource key
     * @return resource value
     * @throws ApplicationException business exception
     */
    protected String getResourceValue(String key) throws ApplicationException {

        TmResourcesCriteriaDomain tmResourcesCriteriaDomain = new TmResourcesCriteriaDomain();
        tmResourcesCriteriaDomain.setLocaleKey("default");
        tmResourcesCriteriaDomain.setResourceKey(key);
        TmResourcesDomain tmResourcesResultDomain = tmResourcesService.searchByKey(tmResourcesCriteriaDomain);
        if (tmResourcesResultDomain == null) {
            throw new SystemException(NXS_91_0001, key);
        }

        return tmResourcesResultDomain.getValue();
    }

    /**
     * Searching process type
     * <br />処理区分取得。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @return process type
     * @throws ApplicationException business exception
     */
    protected String searchProcessTyp(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        TtOnlineReqJobParamCriteriaDomain ttOnlineReqJobParamCriteriaDomain
            = new TtOnlineReqJobParamCriteriaDomain();
        ttOnlineReqJobParamCriteriaDomain.setRequestId(t0400TransferToGinvDomain.getRequestId());
        ttOnlineReqJobParamCriteriaDomain.setBrch(ONE);
        TtOnlineReqJobParamDomain ttOnlineReqJobParamResultDomain
            = ttOnlineReqJobParamService.searchByKey(ttOnlineReqJobParamCriteriaDomain);
        if (ttOnlineReqJobParamResultDomain == null) {
            throw new SystemException(NXS_91_0001);
        }

        return ttOnlineReqJobParamResultDomain.getParamValue01();
    }

    /**
     * Making work file for transfer invoice
     * <br />インボイス送信用の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForInvoice(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract invoice data and output CSV file.
        // インボイスデータを抽出しCSVファイルに出力する。

        List<? extends T0400F010InvDomain> f010InvResultDomainList
            = jbTransferToGinvDao.searchT0400F010Inv(t0400TransferToGinvDomain);
        if (f010InvResultDomainList.size() == 0) {
            return;
        }
        List<List<String>> f010InvCsvRecordList = new ArrayList<List<String>>();
        for (T0400F010InvDomain f010InvResultDomain : f010InvResultDomainList) {
            List<String> f010InvCsvFieldList = new ArrayList<String>();
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getInvoiceNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getInvoiceIssueDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getInvoiceClass());
            f010InvCsvFieldList.add(f010InvResultDomain.getCancelFlg());
            f010InvCsvFieldList.add(f010InvResultDomain.getCancelTyp());
            f010InvCsvFieldList.add(f010InvResultDomain.getCancelInvoiceNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getCancelInvoiceIssueDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getParInvoiceShipperCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getParInvoiceNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getParInvoiceIssueDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getRelateInvoiceShipperCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getRelateInvoiceNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getRelateInvoiceIssueDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToCompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getCustomerCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getLgcyShipTo());
            f010InvCsvFieldList.add(f010InvResultDomain.getInvoiceCtgry());
            f010InvCsvFieldList.add(f010InvResultDomain.getInvoiceCtgryNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getShippedDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getTrnsCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getTrnsNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getEtd());
            f010InvCsvFieldList.add(f010InvResultDomain.getEta());
            f010InvCsvFieldList.add(f010InvResultDomain.getLPortCntryCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getLoadingPortCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getLoadingPortNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getDPortCntryCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getDischargePortCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getDischargePortNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getDlivPoint());
            f010InvCsvFieldList.add(f010InvResultDomain.getCarrierCompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getCarrierCompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getForwarderCompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getForwarderCompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getVessel());
            f010InvCsvFieldList.add(f010InvResultDomain.getBookingNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getFreightResponsibleCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getFreightResponsibleNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getPriceTerms());
            f010InvCsvFieldList.add(f010InvResultDomain.getTradeTerms());
            f010InvCsvFieldList.add(f010InvResultDomain.getTermsPoint());
            f010InvCsvFieldList.add(f010InvResultDomain.getPayTerms());
            f010InvCsvFieldList.add(f010InvResultDomain.getPayMeth());
            f010InvCsvFieldList.add(f010InvResultDomain.getPayMethNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemLcTyp());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemBankNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemBankAddress1());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemBankAddress2());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemBankAddress3());
            f010InvCsvFieldList.add(f010InvResultDomain.getRemBankAccountNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getLcNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getLcDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getLcBankNm1());
            f010InvCsvFieldList.add(f010InvResultDomain.getLcBankNm2());
            f010InvCsvFieldList.add(f010InvResultDomain.getCurrCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getNetAmount());
            f010InvCsvFieldList.add(f010InvResultDomain.getFreight());
            f010InvCsvFieldList.add(f010InvResultDomain.getInsurance());
            f010InvCsvFieldList.add(f010InvResultDomain.getSubTotal());
            f010InvCsvFieldList.add(f010InvResultDomain.getVatRatio());
            f010InvCsvFieldList.add(f010InvResultDomain.getVat());
            f010InvCsvFieldList.add(f010InvResultDomain.getHandlingCharge());
            f010InvCsvFieldList.add(f010InvResultDomain.getAdditionalChargeCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getAdditionalChargeNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getAdditionalCharge());
            f010InvCsvFieldList.add(f010InvResultDomain.getTotalInvoiceAmount());
            f010InvCsvFieldList.add(f010InvResultDomain.getNoCharge());
            f010InvCsvFieldList.add(f010InvResultDomain.getPltzItemQty());
            f010InvCsvFieldList.add(f010InvResultDomain.getWeightUnit());
            f010InvCsvFieldList.add(f010InvResultDomain.getWeightUnitDisp());
            f010InvCsvFieldList.add(f010InvResultDomain.getTotalNetWeight());
            f010InvCsvFieldList.add(f010InvResultDomain.getTotalGrossWeight());
            f010InvCsvFieldList.add(f010InvResultDomain.getVolumeUnit());
            f010InvCsvFieldList.add(f010InvResultDomain.getVolumeUnitDisp());
            f010InvCsvFieldList.add(f010InvResultDomain.getTotalVolume());
            f010InvCsvFieldList.add(f010InvResultDomain.getFree1ColNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getFree2ColNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getFree3ColNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getFree4ColNm());
            f010InvCsvFieldList.add(f010InvResultDomain.getSpInfo());
            f010InvCsvFieldList.add(f010InvResultDomain.getContainerLooseTyp());
            f010InvCsvFieldList.add(f010InvResultDomain.getContainerSortingKey());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty1CompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty1CompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty1Nm());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty1Addr());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty2CompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty2CompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty2Nm());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty2Addr());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty3CompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty3CompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty3Nm());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty3Addr());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty4CompCd());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty4CompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty4Nm());
            f010InvCsvFieldList.add(f010InvResultDomain.getNotifyParty4Addr());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompNm1());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompNm2());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompAddr1());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompAddr2());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompAddr3());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompAddr4());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompTel());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperCompFax());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipperTaxIdNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompNm1());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompNm2());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompAddr1());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompAddr2());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompAddr3());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompAddr4());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompTel());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeCompFax());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeTaxIdNo());
            f010InvCsvFieldList.add(f010InvResultDomain.getConsigneeAttn());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToNm1());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToNm2());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToAddr1());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToAddr2());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToAddr3());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToAddr4());
            f010InvCsvFieldList.add(f010InvResultDomain.getShipToCompNmAbb());
            f010InvCsvFieldList.add(f010InvResultDomain.getContainerNo1());
            f010InvCsvFieldList.add(f010InvResultDomain.getContainerNo2());
            f010InvCsvFieldList.add(f010InvResultDomain.getContainerNo3());
            f010InvCsvFieldList.add(f010InvResultDomain.getManualInvoiceIssueDt());
            f010InvCsvFieldList.add(f010InvResultDomain.getReinvoiceNeedFlg());
            f010InvCsvFieldList.add(t0400TransferToGinvDomain.getFtmSendHostCode());
            f010InvCsvFieldList.add(TRANS_GINV_INPUT_CTL_TYP_NEXUS);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add(null);
            f010InvCsvFieldList.add("N");
            f010InvCsvRecordList.add(f010InvCsvFieldList);
        }
        // Convert to CSV and output file.
        // CSVに変換してファイルに書き出す。
        String f010InvCsvString = CsvListConversion.getCsv(f010InvCsvRecordList);
        File f010InvFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
            TRANS_GINV_DATA_FILE_INV);
        writeNewFile(f010InvFile, f010InvCsvString);

        // Extract CML data and output CSV file.
        // CMLデータを抽出しCSVファイルに出力する。

        List<? extends T0400F020CmlDomain> f020CmlResultDomainList
            = jbTransferToGinvDao.searchT0400F020Cml(t0400TransferToGinvDomain);
        if (0 < f020CmlResultDomainList.size()) {
            List<List<String>> f020CmlCsvRecordList = new ArrayList<List<String>>();
            for (T0400F020CmlDomain f020CmlResultDomain : f020CmlResultDomainList) {
                List<String> f020CmlCsvFieldList = new ArrayList<String>();
                f020CmlCsvFieldList.add(f020CmlResultDomain.getShipperCd());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getInvoiceNo());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getInvoiceIssueDt());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getMainMark());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getReturnStyleCd());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getNetWeight());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getGrossWeight());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getNetWeightUnit());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getWeightUnitDisp());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getVolume());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getVolumeUnit());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getVolumeUnitDisp());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getPalletCartonTyp());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getPalletCartonTypNm());
                f020CmlCsvFieldList.add(f020CmlResultDomain.getContainerNo());
                f020CmlCsvFieldList.add(null);
                f020CmlCsvFieldList.add(null);
                f020CmlCsvFieldList.add(null);
                f020CmlCsvFieldList.add(null);
                f020CmlCsvFieldList.add(null);
                f020CmlCsvRecordList.add(f020CmlCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f020CmlCsvString = CsvListConversion.getCsv(f020CmlCsvRecordList);
            File f020CmlFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_CML);
            writeNewFile(f020CmlFile, f020CmlCsvString);
        }

        // Extract CML Item data and output CSV file.
        // CML Itemデータを抽出しCSVファイルに出力する。

        List<? extends T0400F030CmlItemDomain> f030CmlItemResultDomainList
            = jbTransferToGinvDao.searchT0400F030CmlItem(t0400TransferToGinvDomain);
        if (0 < f030CmlItemResultDomainList.size()) {
            List<List<String>> f030CmlItemCsvRecordList = new ArrayList<List<String>>();
            for (T0400F030CmlItemDomain f030CmlItemResultDomain : f030CmlItemResultDomainList) {
                List<String> f030CmlItemCsvFieldList = new ArrayList<String>();
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getShipperCd());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getInvoiceNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getInvoiceIssueDt());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getMainMark());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getRecordNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getCustomerPoNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getCustomerItemNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getItemNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getPkgCd());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getItemDescription());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getModelCd());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getKitFlg());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getExpRequestNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getLineNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getKitBrch());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getParFlg());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getKitParItemNo());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getQty());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getQtyUnit());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getQtyUnitDisp());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getItemWeight());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getItemWeightUnit());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getItemWeightUnitDisp());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getNetWeight());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getNetWeightUnit());
                f030CmlItemCsvFieldList.add(f030CmlItemResultDomain.getNetWeightUnitDisp());
                f030CmlItemCsvFieldList.add(null);
                f030CmlItemCsvFieldList.add(null);
                f030CmlItemCsvFieldList.add(null);
                f030CmlItemCsvFieldList.add(null);
                f030CmlItemCsvFieldList.add(null);
                f030CmlItemCsvRecordList.add(f030CmlItemCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f030CmlItemCsvString = CsvListConversion.getCsv(f030CmlItemCsvRecordList);
            File f030CmlItemFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_CMLITEM);
            writeNewFile(f030CmlItemFile, f030CmlItemCsvString);
        }

        // Extract Invoice Item data and output CSV file.
        // Invoice Itemデータを抽出しCSVファイルに出力する。

        List<? extends T0400F040InvItemDomain> f040InvItemResultDomainList
            = jbTransferToGinvDao.searchT0400F040InvItem(t0400TransferToGinvDomain);
        if (0 < f040InvItemResultDomainList.size()) {
            List<List<String>> f040InvItemCsvRecordList = new ArrayList<List<String>>();
            for (T0400F040InvItemDomain f040InvItemResultDomain : f040InvItemResultDomainList) {
                List<String> f040InvItemCsvFieldList = new ArrayList<String>();
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getShipperCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getInvoiceNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getInvoiceIssueDt());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getRecordNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getCustomerPoNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getCustomerItemNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getItemNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getPkgCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getItemDescription());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getModelCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getKitFlg());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getExpRequestNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getLineNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getKitBrch());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getParFlg());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getKitParItemNo());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getOriginCntryCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getOriginCntryNm());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getFree_1Dtl());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getFree_2Dtl());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getFree_3Dtl());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getHsCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getUnitPrice());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getUnitPriceCurrCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getQty());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getQtyUnit());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getQtyUnitDisp());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getAmount());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getAmountCurrCd());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getItemWeight());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getItemWeightUnit());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getItemWeightUnitDisp());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getNetWeight());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getNetWeightUnit());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getNetWeightUnitDisp());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getLength());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getWidth());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getHeight());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getLengthUnit());
                f040InvItemCsvFieldList.add(f040InvItemResultDomain.getLengthUnitDisp());
                f040InvItemCsvFieldList.add(null);
                f040InvItemCsvFieldList.add(null);
                f040InvItemCsvFieldList.add(null);
                f040InvItemCsvFieldList.add(null);
                f040InvItemCsvFieldList.add(null);
                f040InvItemCsvRecordList.add(f040InvItemCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f040InvItemCsvString = CsvListConversion.getCsv(f040InvItemCsvRecordList);
            File f040InvItemFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_INVITEM);
            writeNewFile(f040InvItemFile, f040InvItemCsvString);
        }


        // Extract Attach control data and output CSV file.
        // Output image file for attach.
        // Attach controlデータを抽出しCSVファイルに出力する。
        // また添付イメージファイルを出力する。

        List<? extends T0400F070AttCtlDomain> f070AttCtlResultDomainList
            = jbTransferToGinvDao.searchT0400F070AttCtlWhenInvoice(t0400TransferToGinvDomain);
        if (0 < f070AttCtlResultDomainList.size()) {
            List<List<String>> f070AttCtlCsvRecordList = new ArrayList<List<String>>();
            for (T0400F070AttCtlDomain f070AttCtlResultDomain : f070AttCtlResultDomainList) {
                List<String> f070AttCtlCsvFieldList = new ArrayList<String>();
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getShipperCd());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceNo());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceIssueDt());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocGrp());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocId());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getZipEntryNm());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getOriginalFileNm());
                f070AttCtlCsvRecordList.add(f070AttCtlCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f070AttCtlCsvString = CsvListConversion.getCsv(f070AttCtlCsvRecordList);
            File f070AttCtlFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_ATTCTL);
            writeNewFile(f070AttCtlFile, f070AttCtlCsvString);

            // Output image file for attach.
            // 添付イメージファイルを出力する。
            for (T0400F070AttCtlDomain f070AttCtlResultDomain : f070AttCtlResultDomainList) {
                if (f070AttCtlResultDomain.getFileId() != null) {
                    File outputFile
                        = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                            f070AttCtlResultDomain.getZipEntryNm());
                    writeNewFileFromFileManager(outputFile, f070AttCtlResultDomain.getFileId());
                }
            }
        }
    }

    /**
     * Making common work file for transfer shipping ACT.
     * <br />船積実績送信用共通の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForShpingActCommon(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract Shipping ACT data.
        // Shipping ACTデータを抽出する。
        List<? extends T0400F060ShpActDomain> f060ShpActResultDomainList
            = jbTransferToGinvDao.searchT0400F060ShpAct(t0400TransferToGinvDomain);
        if (f060ShpActResultDomainList.size() == 0) {
            return;
        }
        List<List<String>> f060ShpActCsvRecordList = new ArrayList<List<String>>();
        for (T0400F060ShpActDomain f060ShpActResultDomain : f060ShpActResultDomainList) {
            List<String> f060ShpActCsvFieldList = new ArrayList<String>();
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getShipperCd());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getInvoiceNo());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getInvoiceIssueDt());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getInvoiceStatus());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getBilldNo());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getVessel());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getAtd());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getEta());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getCarrierCompCd());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getCarrierCompNmAbb());
            f060ShpActCsvFieldList.add(f060ShpActResultDomain.getContainerLooseTyp());
            f060ShpActCsvRecordList.add(f060ShpActCsvFieldList);
        }
        // Convert to CSV and output file.
        // CSVに変換してファイルに書き出す。
        String f060ShpActCsvString = CsvListConversion.getCsv(f060ShpActCsvRecordList);
        File f060ShpActFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
            TRANS_GINV_DATA_FILE_SHPACT);
        writeNewFile(f060ShpActFile, f060ShpActCsvString);
    }

    /**
     * Making special work file for transfer shipping ACT.
     * <br />船積実績送信用固有の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForShippingActSpecial(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract container data.
        // Containerデータを抽出する。
        List<? extends T0400F050CtnrDomain> f050CtnrResultDomainList
            = jbTransferToGinvDao.searchT0400F050Ctnr(t0400TransferToGinvDomain);
        if (0 < f050CtnrResultDomainList.size()) {
            List<List<String>> f050CtnrCsvRecordList = new ArrayList<List<String>>();
            for (T0400F050CtnrDomain f050CtnrResultDomain : f050CtnrResultDomainList) {
                List<String> f050CtnrCsvFieldList = new ArrayList<String>();
                f050CtnrCsvFieldList.add(f050CtnrResultDomain.getShipperCd());
                f050CtnrCsvFieldList.add(f050CtnrResultDomain.getInvoiceNo());
                f050CtnrCsvFieldList.add(f050CtnrResultDomain.getInvoiceIssueDt());
                f050CtnrCsvFieldList.add(f050CtnrResultDomain.getMainMark());
                f050CtnrCsvFieldList.add(f050CtnrResultDomain.getContainerNo());
                f050CtnrCsvRecordList.add(f050CtnrCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f050CtnrCsvString = CsvListConversion.getCsv(f050CtnrCsvRecordList);
            File f050CtnrFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_CTNR);
            writeNewFile(f050CtnrFile, f050CtnrCsvString);
        }
    }

    /**
     * Making special work file for transfer B/L
     * <br />B/L送信用固有の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForBilldSpecial(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract B/L Attach control data.
        // B/L Attach controlデータを抽出する。
        List<? extends T0400F070AttCtlDomain> f070AttCtlResultDomainList
            = jbTransferToGinvDao.searchT0400F070AttCtlWhenBilld(t0400TransferToGinvDomain);
        if (f070AttCtlResultDomainList.size() == 0) {
            return;
        }
        List<List<String>> f070AttCtlCsvRecordList = new ArrayList<List<String>>();
        for (T0400F070AttCtlDomain f070AttCtlResultDomain : f070AttCtlResultDomainList) {
            List<String> f070AttCtlCsvFieldList = new ArrayList<String>();
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getShipperCd());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceNo());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceIssueDt());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocGrp());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocId());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getZipEntryNm());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getOriginalFileNm());
            f070AttCtlCsvRecordList.add(f070AttCtlCsvFieldList);
        }
        // Convert to CSV and output file.
        // CSVに変換してファイルに書き出す。
        String f070AttCtlCsvString = CsvListConversion.getCsv(f070AttCtlCsvRecordList);
        File f070AttCtlFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
            TRANS_GINV_DATA_FILE_ATTCTL);
        writeNewFile(f070AttCtlFile, f070AttCtlCsvString);

        // Output B/L image file.
        // B/Lイメージファイルを出力する。
        List<? extends T0400F070AttCtlDomain> billdFileSummaryResultDomainList
            = jbTransferToGinvDao.searchBlldFileSummary(t0400TransferToGinvDomain);
        for (T0400F070AttCtlDomain billdFuleSummaryResultDomain : billdFileSummaryResultDomainList) {
            if (billdFuleSummaryResultDomain.getFileId() != null) {
                File outputFile
                    = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                        billdFuleSummaryResultDomain.getZipEntryNm());
                writeNewFileFromFileManager(outputFile, billdFuleSummaryResultDomain.getFileId());
            }
        }
    }

    /**
     * Making special work file for transfer CLP
     * <br />CLP送信用固有の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForClpSpecial(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract CLP Attach control data.
        // CLP Attach controlデータを抽出する。
        List<? extends T0400F070AttCtlDomain> f070AttCtlResultDomainList
            = jbTransferToGinvDao.searchT0400F070AttCtlWhenClp(t0400TransferToGinvDomain);
        if (f070AttCtlResultDomainList.size() == 0) {
            return;
        }
        List<List<String>> f070AttCtlCsvRecordList = new ArrayList<List<String>>();
        for (T0400F070AttCtlDomain f070AttCtlResultDomain : f070AttCtlResultDomainList) {
            List<String> f070AttCtlCsvFieldList = new ArrayList<String>();
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getShipperCd());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceNo());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceIssueDt());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocGrp());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocId());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getZipEntryNm());
            f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getOriginalFileNm());
            f070AttCtlCsvRecordList.add(f070AttCtlCsvFieldList);
        }
        // Convert to CSV and output file.
        // CSVに変換してファイルに書き出す。
        String f070AttCtlCsvString = CsvListConversion.getCsv(f070AttCtlCsvRecordList);
        File f070AttCtlFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
            TRANS_GINV_DATA_FILE_ATTCTL);
        writeNewFile(f070AttCtlFile, f070AttCtlCsvString);

        // Extract CLP data.
        // CLPデータを抽出する。
        List<? extends T0400F7007ClpDomain> f7007ClpResultDomainList
            = jbTransferToGinvDao.searchClp(t0400TransferToGinvDomain);
        List<List<String>> f7007ClpCsvRecordList = new ArrayList<List<String>>();
        List<String> f7007ClpCsvFieldTitleList = new ArrayList<String>();
        f7007ClpCsvFieldTitleList.add("TRANSPORT NAME");
        f7007ClpCsvFieldTitleList.add("VESSEL");
        f7007ClpCsvFieldTitleList.add("ATD");
        f7007ClpCsvFieldTitleList.add("ETA");
        f7007ClpCsvFieldTitleList.add("LOADING PORT CODE (POL)");
        f7007ClpCsvFieldTitleList.add("DISCHARGE PORT CODE (POD)");
        f7007ClpCsvFieldTitleList.add("CARRIER COMP NAME");
        f7007ClpCsvFieldTitleList.add("NO OF CONTAINER IN VESSEL");
        f7007ClpCsvFieldTitleList.add("CONTAINER LOOSE TYPE");
        f7007ClpCsvFieldTitleList.add("CONTAINER NO");
        f7007ClpCsvFieldTitleList.add("TRANS TYP NAME");
        f7007ClpCsvFieldTitleList.add("LOAD EFF.");
        f7007ClpCsvFieldTitleList.add("NO OF BL IN VESSEL");
        f7007ClpCsvFieldTitleList.add("BL NO");
        f7007ClpCsvFieldTitleList.add("FREIGHT RESPONSIBLE CD");
        f7007ClpCsvFieldTitleList.add("SHIPPER COM NAME");
        f7007ClpCsvFieldTitleList.add("SHIP TO COM NAME");
        f7007ClpCsvFieldTitleList.add("SHIP TO NAME");
        f7007ClpCsvFieldTitleList.add("CONSIGNEE COM NAME");
        f7007ClpCsvFieldTitleList.add("NO OF INVOICE IN VESSEL");
        f7007ClpCsvFieldTitleList.add("NO OF INVOICE IN SHIPPER");
        f7007ClpCsvFieldTitleList.add("INV NO");
        f7007ClpCsvFieldTitleList.add("INV CLASS ");
        f7007ClpCsvFieldTitleList.add("NO OF FRT INV IN MAIN INV");
        f7007ClpCsvFieldTitleList.add("NO OF CML IN INV");
        f7007ClpCsvFieldTitleList.add("TOTAL GROSS WEIGHT PER BL");
        f7007ClpCsvFieldTitleList.add("TOTAL GROSS WEIGHT PER CONTAINER");
        f7007ClpCsvFieldTitleList.add("TOTAL GROSS WEIGHT PER INV");
        f7007ClpCsvFieldTitleList.add("UNIT OF WEIGHT");
        f7007ClpCsvFieldTitleList.add("TOTAL VOL OF BL");
        f7007ClpCsvFieldTitleList.add("TOTAL VOL OF CONTAINER");
        f7007ClpCsvFieldTitleList.add("TOTAL VOL OF INV");
        f7007ClpCsvFieldTitleList.add("UNIT OF VOL");
        f7007ClpCsvFieldTitleList.add("XMAIN MARK");
        f7007ClpCsvFieldTitleList.add("MAIN MARK");
        f7007ClpCsvFieldTitleList.add("MIX TAG NO");
        f7007ClpCsvFieldTitleList.add("CUSTOMER ITEM NO");
        f7007ClpCsvFieldTitleList.add("PLTZ ITEM NO");
        f7007ClpCsvFieldTitleList.add("QTY");
        f7007ClpCsvFieldTitleList.add("UNIT OF QTY");
        f7007ClpCsvFieldTitleList.add("CML GROSS WEIGHT");
        f7007ClpCsvFieldTitleList.add("CML VOL");
        f7007ClpCsvFieldTitleList.add("PKG FORM TYP");
        f7007ClpCsvFieldTitleList.add("RETURN STYLE CODE");
        f7007ClpCsvFieldTitleList.add("NO OF CML IN CONTAINER");
        f7007ClpCsvFieldTitleList.add("NO OF CML IN BL");
        f7007ClpCsvFieldTitleList.add("CONTAINER SORTING KEY");
        f7007ClpCsvFieldTitleList.add("SITE TYP");
        f7007ClpCsvFieldTitleList.add("PACKAGE TYPE");
        f7007ClpCsvFieldTitleList.add("MAIN INVOICE NO OF FRT");
        f7007ClpCsvFieldTitleList.add("REGISTER DT (UTC)");
        f7007ClpCsvRecordList.add(f7007ClpCsvFieldTitleList);
        for (T0400F7007ClpDomain f7007ClpResultDomain : f7007ClpResultDomainList) {
            List<String> f7007ClpCsvFieldList = new ArrayList<String>();
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getTrnsNm());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getVessel());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getAtd());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getEta());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getLoadingPortCd());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getDischargePortCd());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getCarrierCompNmAbb());
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfContainerInVessel()));
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getContainerLooseTyp());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getContainerNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getTrnsTypNm());
            String loadingRatio = null;
            if (f7007ClpResultDomain.getLoadingRatio() != null) {
                loadingRatio = f7007ClpResultDomain.getLoadingRatio()
                    .setScale(MAX_SCALE_LOADING_RATIO, UP).toPlainString();
            }
            f7007ClpCsvFieldList.add(loadingRatio);
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfBlInVessel()));
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getBilldNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getFreightResponsibleCd());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getShipperCompNmAbb());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getShipToCompNmAbb());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getShipToNmAbb());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getConsigneeCompNmAbb());
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfInvoiceInVessel()));
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfInvoiceInShipper()));
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getInvoiceNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getInvoiceClass());
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfFrtInvInMainInv()));
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfCmlInInv()));
            String strConvertedTotalGrossWeightPerBl = null;
            if (f7007ClpResultDomain.getTotalGrossWeightPerBl() != null) {
                BigDecimal bdConvertedTotalGrossWeightPerBl = commonService.convertWeightUnit(
                    f7007ClpResultDomain.getTotalGrossWeightPerBl(), f7007ClpResultDomain.getInvoiceWeightUnit(),
                        TRANS_GINV_CLP_WEIGHT_UNIT_CD
                );
                if (bdConvertedTotalGrossWeightPerBl != null) {
                    strConvertedTotalGrossWeightPerBl = bdConvertedTotalGrossWeightPerBl
                        .setScale(MAX_SCALE_WEIGHT_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalGrossWeightPerBl);
            String strConvertedTotalGrossWeightPerCtnr = null;
            if (f7007ClpResultDomain.getTotalGrossWeightPerCtnr() != null) {
                BigDecimal bdConvertedTotalGrossWeightPerCtnr = commonService.convertWeightUnit(
                    f7007ClpResultDomain.getTotalGrossWeightPerCtnr(), f7007ClpResultDomain.getContainerWeightUnit(),
                        TRANS_GINV_CLP_WEIGHT_UNIT_CD
                );
                if (bdConvertedTotalGrossWeightPerCtnr != null) {
                    strConvertedTotalGrossWeightPerCtnr = bdConvertedTotalGrossWeightPerCtnr
                        .setScale(MAX_SCALE_WEIGHT_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalGrossWeightPerCtnr);
            String strConvertedTotalGrossWeightPerInv = null;
            if (f7007ClpResultDomain.getTotalGrossWeightPerInv() != null) {
                BigDecimal bdConvertedTotalGrossWeightPerInv = commonService.convertWeightUnit(
                    f7007ClpResultDomain.getTotalGrossWeightPerInv(), f7007ClpResultDomain.getInvoiceWeightUnit(),
                        TRANS_GINV_CLP_WEIGHT_UNIT_CD
                );
                if (bdConvertedTotalGrossWeightPerInv != null) {
                    strConvertedTotalGrossWeightPerInv = bdConvertedTotalGrossWeightPerInv
                        .setScale(MAX_SCALE_WEIGHT_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalGrossWeightPerInv);
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getWeightUnitDisp());
            String strConvertedTotalVolumeOfBl = null;
            if (f7007ClpResultDomain.getTotalVolumeOfBl() != null) {
                BigDecimal bdConvertedTotalVolumeOfBl = commonService.convertVolumeUnit(
                    f7007ClpResultDomain.getTotalVolumeOfBl(), f7007ClpResultDomain.getInvoiceVolumeUnit(),
                        TRANS_GINV_CLP_VOLUME_UNIT_CD
                );
                if (bdConvertedTotalVolumeOfBl != null) {
                    strConvertedTotalVolumeOfBl = bdConvertedTotalVolumeOfBl
                        .setScale(MAX_SCALE_VOLUME_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalVolumeOfBl);
            String strConvertedTotalVolumeOfContainer = null;
            if (f7007ClpResultDomain.getTotalVolumeOfContainer() != null) {
                BigDecimal bdConvertedTotalVolumeOfContainer = commonService.convertVolumeUnit(
                    f7007ClpResultDomain.getTotalVolumeOfContainer(), f7007ClpResultDomain.getContainerVolumeUnit(),
                        TRANS_GINV_CLP_VOLUME_UNIT_CD
                );
                if (bdConvertedTotalVolumeOfContainer != null) {
                    strConvertedTotalVolumeOfContainer = bdConvertedTotalVolumeOfContainer
                        .setScale(MAX_SCALE_VOLUME_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalVolumeOfContainer);
            String strConvertedTotalVolumeOfInv = null;
            if (f7007ClpResultDomain.getTotalVolumeOfInv() != null) {
                BigDecimal bdConvertedTotalVolumeOfInv = commonService.convertVolumeUnit(
                    f7007ClpResultDomain.getTotalVolumeOfInv(), f7007ClpResultDomain.getInvoiceVolumeUnit(),
                        TRANS_GINV_CLP_VOLUME_UNIT_CD
                );
                if (bdConvertedTotalVolumeOfInv != null) {
                    strConvertedTotalVolumeOfInv = bdConvertedTotalVolumeOfInv
                        .setScale(MAX_SCALE_VOLUME_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedTotalVolumeOfInv);
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getVolumeUnitDisp());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getXmainMark());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getMainMark());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getMixTagNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getCustomerItemNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getPltzItemNo());
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getQty()));
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getQtyUnitDisp());
            String strConvertedPltzGrossWeight = null;
            if (f7007ClpResultDomain.getPltzGrossWeight() != null) {
                BigDecimal bdConvertedPltzGrossWeight = commonService.convertWeightUnit(
                    f7007ClpResultDomain.getPltzGrossWeight(), f7007ClpResultDomain.getPltzWeightUnit(),
                        TRANS_GINV_CLP_WEIGHT_UNIT_CD
                );
                if (bdConvertedPltzGrossWeight != null) {
                    strConvertedPltzGrossWeight = bdConvertedPltzGrossWeight
                        .setScale(MAX_SCALE_WEIGHT_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedPltzGrossWeight);
            String strConvertedPltzVolume = null;
            if (f7007ClpResultDomain.getPltzVolume() != null) {
                BigDecimal bdConvertedPltzVolume = commonService.convertWeightUnit(
                    f7007ClpResultDomain.getPltzVolume(), f7007ClpResultDomain.getPltzVolumeUnit(),
                        TRANS_GINV_CLP_VOLUME_UNIT_CD
                );
                if (bdConvertedPltzVolume != null) {
                    strConvertedPltzVolume = bdConvertedPltzVolume
                        .setScale(MAX_SCALE_VOLUME_UNIT, UP).toPlainString();
                }
            }
            f7007ClpCsvFieldList.add(strConvertedPltzVolume);
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getPkgFormTyp());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getReturnStyleCd());
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfCmlInContainer()));
            f7007ClpCsvFieldList.add(integerToString(f7007ClpResultDomain.getNoOfCmlInBl()));
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getContainerSortingKey());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getSiteTyp());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getPalletCartonTyp());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getParInvoiceNo());
            f7007ClpCsvFieldList.add(f7007ClpResultDomain.getRegisterDt());
            f7007ClpCsvRecordList.add(f7007ClpCsvFieldList);
        }
        // Convert to CSV and output file.
        // CSVに変換してファイルに書き出す。
        if (f070AttCtlResultDomainList.get(0).getZipEntryNm() != null) {
            String f7007ClpCsvString = CsvListConversion.getCsv(f7007ClpCsvRecordList);
            File f7007ClpFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                f070AttCtlResultDomainList.get(0).getZipEntryNm());
            writeNewFile(f7007ClpFile, f7007ClpCsvString);
        }
    }

    /**
     * Making special work file for transfer Other Doc.
     * <br />その他書類送信用固有の作業ファイル作成。
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void makeWorkFileForOtherDocSpecial(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        // Extract Other Doc. Attach control data.
        // その他書類 Attach controlデータを抽出する。
        List<? extends T0400F070AttCtlDomain> f070AttCtlResultDomainList
            = jbTransferToGinvDao.searchT0400F070AttCtlWhenOtherDoc(t0400TransferToGinvDomain);
        if (f070AttCtlResultDomainList.size() != 0) {
            List<List<String>> f070AttCtlCsvRecordList = new ArrayList<List<String>>();
            for (T0400F070AttCtlDomain f070AttCtlResultDomain : f070AttCtlResultDomainList) {
                List<String> f070AttCtlCsvFieldList = new ArrayList<String>();
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getShipperCd());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceNo());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getInvoiceIssueDt());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocGrp());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getDocId());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getZipEntryNm());
                f070AttCtlCsvFieldList.add(f070AttCtlResultDomain.getOriginalFileNm());
                f070AttCtlCsvRecordList.add(f070AttCtlCsvFieldList);
            }
            // Convert to CSV and output file.
            // CSVに変換してファイルに書き出す。
            String f070AttCtlCsvString = CsvListConversion.getCsv(f070AttCtlCsvRecordList);
            File f070AttCtlFile = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                TRANS_GINV_DATA_FILE_ATTCTL);
            writeNewFile(f070AttCtlFile, f070AttCtlCsvString);
    
            // Output Other Doc. image file.
            // その他書類イメージファイルを出力する。
            List<? extends T0400F070AttCtlDomain> otherDocFileSummaryResultDomainList
                = jbTransferToGinvDao.searchOtherDocFileSummary(t0400TransferToGinvDomain);
            for (T0400F070AttCtlDomain otherDocFileSummaryResultDomain : otherDocFileSummaryResultDomainList) {
                if (otherDocFileSummaryResultDomain.getFileId() != null) {
                    File outputFile
                        = new File(t0400TransferToGinvDomain.getRequestDirectory(),
                            otherDocFileSummaryResultDomain.getZipEntryNm());
                    writeNewFileFromFileManager(outputFile, otherDocFileSummaryResultDomain.getFileId());
                }
            }
        }
    }

    /**
     * Make a new file from File Manager.
     * File Managerからファイルを作成します。
     *
     * @param file output file
     * @param fileId file ID of File Manager
     * @throws ApplicationException business exception
     */
    protected void writeNewFileFromFileManager(File file, String fileId) throws ApplicationException {

        ByteArrayOutputStream fileManagerOutputStream = null;
        BufferedOutputStream fileOutputStream = null;
        try {
            fileManagerOutputStream = new ByteArrayOutputStream();
            fileManagerServiceForStream.searchFileDownload(fileId, true, fileManagerOutputStream);
            byte[] data = fileManagerOutputStream.toByteArray();
            fileManagerOutputStream.flush();
            fileManagerOutputStream.close();

            fileOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            fileOutputStream.write(data);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        } finally {
            if (fileManagerOutputStream != null) {
                try {
                    fileManagerOutputStream.close();
                } catch (Exception e) {}
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {}
            }
        }
    }

    /**
     * Make a new file and write text data
     * <br />ファイルを作成しテキストデータを書き出します。
     *
     * @param file output file
     * @param data string data for output
     * @throws ApplicationException business exception
     */
    protected void writeNewFile(File file, String data) throws ApplicationException {

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(data);

        } catch(Exception e) {
            throw new SystemException(NXS_91_0001, e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (Exception e) {}
            }
        }
    }

// L005 DEL START
//    /**
//     * ZIP archive files in work directory
//     * <br />作業ディレクトリのファイルをZIP化します。
//     * 
//     * <pre>
//     * - Extract files from work directory.
//     * - ZIP archive the file extracted to FTM send directory.
//     * - Cleanup work directory.
//     * - 業ディレクトリからファイルを抽出する。
//     * - 抽出したファイルをFTM送信ディレクトリにZIP化する。
//     * - 作業ディレクトリをクリーンアップする。
//     * </pre>
//     *
//     * @param t0400TransferToGinvDomain Common domain of this job
//     * @return ZIP file
//     * @throws ApplicationException business exception
//     */
//    protected File zipArchiveFromWorkFiles(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {
//
//        File[] sourceFiles = t0400TransferToGinvDomain.getWorkDirectory().listFiles();
//        if (sourceFiles.length == 0) {
//            throw new SystemException(NXS_91_0001);
//        }
//
//        // File#renameTo() can not move across the partition.
//        // File#renameTo()はパーティションをまたぐ移動ができない。
//        // Ex. /tmp->/TACTICS/...
//        // For this reason ZIP temporary file is created in /TACTICS/... .
//        // このためZIP一時ファイルは最初から/TACTICS/...に作成する。
//        File temporaryZipFile = zipArchive(Arrays.asList(sourceFiles), t0400TransferToGinvDomain.getFtmSendDirectory());
//        if (temporaryZipFile == null) {
//            throw new SystemException(NXS_91_0001);
//        }
//
//        File zipFile = new File(t0400TransferToGinvDomain.getFtmSendDirectory(),
//            t0400TransferToGinvDomain.getFtmFileId() + ".zip");
//        if (!temporaryZipFile.renameTo(zipFile)) {
//            throw new SystemException(NXS_91_0001);
//        }
//
//        for (File sourceFile : sourceFiles) {
//            if (!sourceFile.delete()) {
//                throw new SystemException(NXS_91_0001);
//            }
//        }
//
//        return zipFile;
//    }
//
//    /**
//     * Make ZIP archive file from source file list.
//     *
//     * @param souceFileList source file list for ZIP entry
//     * @param dstDirectory destination directory
//     * @return temporary ZIP file
//     * @throws ApplicationException business exception
//     */
//    protected File zipArchive(List<File> souceFileList, File dstDirectory) throws ApplicationException {
//
//        File temporaryZipFile = null;
//        InputStream souceFileInputStream = null;
//        ZipOutputStream zipFileOutputStream = null;
//        try {
//            temporaryZipFile = File.createTempFile("ZIPTEMP", ".zip", dstDirectory);
//            temporaryZipFile.deleteOnExit();
//            OutputStream temporaryZipFileOutputStream
//                = new BufferedOutputStream(new FileOutputStream(temporaryZipFile));
//            zipFileOutputStream = new ZipOutputStream(temporaryZipFileOutputStream);
//
//            for (File souceFile : souceFileList) {
//                ZipEntry zipEntry = new ZipEntry(souceFile.getName());
//                zipFileOutputStream.putNextEntry(zipEntry);
//                souceFileInputStream = new BufferedInputStream(new FileInputStream(souceFile));
//                int length;
//                byte[] buffer = new byte[1024];
//                while ((length = souceFileInputStream.read(buffer)) != -1) {
//                    zipFileOutputStream.write(buffer, 0, length);
//                }
//                souceFileInputStream.close();
//                zipFileOutputStream.closeEntry();
//            }
//
//        } catch (IOException e) {
//            throw new SystemException(NXS_91_0001, e);
//        } finally {
//            if (souceFileInputStream != null) {
//                try {
//                    souceFileInputStream.close();
//                } catch (Exception e) {}
//            }
//            if (zipFileOutputStream != null) {
//                try {
//                    zipFileOutputStream.flush();
//                    zipFileOutputStream.close();
//                } catch (Exception e) {}
//            }
//        }
//
//        return temporaryZipFile;
//    }
//
//    /**
//     * Request FTM to send ZIP file
//     * <br />FTMへZIPファイル送信を要求します。
//     *
//     * <pre>
//     * Execute system command in synchronization.
//     * The -z option also zips to the transmission directory of files in the processing directory.
//     * 外部コマンドを同期実行する。
//     * -zオプションは、処理中ディレクトリ内ファイルの送信ディレクトリへのzip化も行う。
//     * </pre>
//     *
//     * @param t0400TransferToGinvDomain common domain of this job
//     * @return utlsend result code
//     * @throws ApplicationException business exception
//     */
//    protected int sendZipFileToGinv(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {
//
//        String commandDirectory = t0400TransferToGinvDomain.getCommandDirectory().getAbsolutePath();
//        String commandFileNameNoExt = t0400TransferToGinvDomain.getCommandFileNameNoExt();
//        String commandFileExt = "sh";
//        String commandOption1 = "-z"; // Also zip/zipも実施。
//        if (SystemUtils.IS_OS_WINDOWS) {
//            commandFileExt = "bat";
//            commandOption1 = "";
//        }
//        String commandFilePath = commandDirectory + File.separator + commandFileNameNoExt + "." + commandFileExt;
//        ExecuteCommandResultDomain executeCommandResultDomain = null;
//        try {
//            executeCommandResultDomain = new ExecuteCommandCaller().execute(commandFilePath, commandOption1);
//
//        } catch (ApplicationException e) {
//            throw new SystemException(NXS_91_0001, e);
//        }
//
//        return executeCommandResultDomain.getExitValue();
//    }
// L005 DEL END

    /**
     * Request FTM to send ZIP file
     * <br />FTMへZIPファイル送信を要求します。
     *
     * <pre>
     * Execute system commands asynchronously.
     * It also zips to the transmission directory of the file in the processing directory.
     * 外部コマンドを非同期実行する。
     * 処理中ディレクトリ内ファイルの送信ディレクトリへのzip化も行う。
     * </pre>
     *
     * @param t0400TransferToGinvDomain common domain of this job
     * @throws ApplicationException business exception
     */
    protected void sendZipFileToGinv(T0400TransferToGinvDomain t0400TransferToGinvDomain) throws ApplicationException {

        String commandDirectory = t0400TransferToGinvDomain.getCommandDirectory().getAbsolutePath();
        String commandFileNameNoExt = t0400TransferToGinvDomain.getCommandFileNameNoExt();
        String[] commandTokens = new String[] {
            "sh", commandDirectory + File.separator + commandFileNameNoExt + ".sh", "-z"
        };
        // for loacal test
        if (SystemUtils.IS_OS_WINDOWS) {
            commandTokens = new String[] {
                "cmd", "/c", commandDirectory + File.separator + commandFileNameNoExt + ".bat"
            };
        }
        try {
            // In case of synchronous invocation
            // 同期呼び出しする場合
            //Process process = Runtime.getRuntime().exec(commandTokens);
            //int commandResult = process.waitFor();

            // In case of asynchronous invocation
            // 非同期に呼び出す場合
            Runtime.getRuntime().exec(commandTokens);

        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
    }

    /**
     * Convert Integer -> String
     *
     * @param i Integer object
     * @return String
     */
    protected static String integerToString(Integer i) {
        if (i == null) {
            return null;
        }
        return String.valueOf(i);
    }
}
