/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_WARNING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_05;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_06;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_09;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_12;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_21;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_22;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_23;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_24;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_25;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_27;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_29;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_30;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_CSV_NEWLINE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_ERROR_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_JOB_ID_ABB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_PROC_TYP_ADD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_PROC_TYP_CHG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_REQ_STATUS_CIGMA_NB;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_REQ_STATUS_COMPLETE_WARN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_REQ_STATUS_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ODR_UPLOAD_TITLE_ERROR_INFO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain;
import com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService;
import com.globaldenso.ai.aijb.library.business.service.MessageLogFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwOdrUploadUpdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwOdrUploadUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtOdrUploadReqMgtService;
import com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadService;
import com.globaldenso.eca0027.core.auto.business.service.TwOdrUploadUpdService;
import com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadOdrDomain;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB012ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB012ResultDomain;
import com.globaldenso.eca0027.core.business.ws.WsB007RestService;
import com.globaldenso.eca0027.core.business.ws.WsB012RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmResourcesService;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;


/**
 * This is the order upload job service
 * <br />受注アップロードジョブのサービス。
 *
 * <pre>
 * This Service is performed as a Request Job(Resident Ver) called by Resident Job(for Request).
 * このサービスは、常駐リクエストジョブから呼び出されるリクエストジョブ（常駐版）として実行される。
 * </pre>
 *
 * MGT575 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14033 $
 */
public class JbOdrUploadServiceImpl implements ResidentRequestApplicationService {

    /**
     * Log class<br />
     * ログクラス
     */
    protected static final Log LOG = LogFactory.getLog(JbOdrUploadServiceImpl.class);

    /**
     * Common service
     * <br />共通サービス。
     */
    protected CommonService commonService;

    /**
     * User conf service
     * <br />ユーザー設定サービス。
     */
    protected TmUserConfService tmUserConfService;

    /**
     * Resource Service
     * <br />リソース サービス。
     */
    protected TmResourcesService tmResourcesService;

    /**
     * File Manager
     * <br />ファイルマネージャ。
     */
    protected FileManagementService fileManagerServiceForStream;

    /**
     * A.I. Artificial Intelligence-JB message log registration parts
     * <br />AI-JB メッセージログ登録部品。
     */
    protected MessageLogFacadeService messageLogFacadeService;

    /**
     * TtOdrUploadReqMgtService.
     */
    protected TtOdrUploadReqMgtService ttOdrUploadReqMgtService;

    /**
     * TwOdrUploadService.
     */
    protected TwOdrUploadService twOdrUploadService;

    /**
     * TwOdrUploadUpdService.
     */
    protected TwOdrUploadUpdService twOdrUploadUpdService;

    /**
     * Order Upload DAO
     * <br />受注アップロードDAO。
     */
    protected JbOdrUploadDao jbOdrUploadDao;

    /**
     * The Web service client of WSB012
     * <br />WSB012のWebサービスクライアント。
     */
    protected WsB012RestService wsB012RestService;

    /**
     * The Web service client of WSB007
     * <br />WSB007のWebサービスクライアント。
     */
    protected WsB007RestService wsB007RestService;

    // Initialize resource.
    static {
        ResourcesFactory factory = new ResourcesFactory();
        factory.createResources("AijbLogMessages");
    }

    // ------------------- Setter of dependent services / Dao -------------------
    // ------------------- 依存サービス・DaoのSetter -------------------

    /**
     * constructor
     * <br />コンストラクタ。
     */
    public JbOdrUploadServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for tmUserConfService.
     *
     * @param tmUserConfService Set for tmUserConfService
     */
    public void setTmUserConfService(TmUserConfService tmUserConfService) {
        this.tmUserConfService = tmUserConfService;
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

    /**
     * Setter method for ttOdrUploadReqMgtService.
     *
     * @param ttOdrUploadReqMgtService Set for ttOdrUploadReqMgtService
     */
    public void setTtOdrUploadReqMgtService(
        TtOdrUploadReqMgtService ttOdrUploadReqMgtService) {
        this.ttOdrUploadReqMgtService = ttOdrUploadReqMgtService;
    }

    /**
     * Setter method for twOdrUploadService.
     *
     * @param twOdrUploadService Set for twOdrUploadService
     */
    public void setTwOdrUploadService(TwOdrUploadService twOdrUploadService) {
        this.twOdrUploadService = twOdrUploadService;
    }

    /**
     * Setter method for twOdrUploadUpdService.
     *
     * @param twOdrUploadUpdService Set for twOdrUploadUpdService
     */
    public void setTwOdrUploadUpdService(TwOdrUploadUpdService twOdrUploadUpdService) {
        this.twOdrUploadUpdService = twOdrUploadUpdService;
    }

    /**
     * Setter method for jbOdrUploadDao.
     *
     * @param jbOdrUploadDao Set for jbOdrUploadDao
     */
    public void setJbOdrUploadDao(JbOdrUploadDao jbOdrUploadDao) {
        this.jbOdrUploadDao = jbOdrUploadDao;
    }

    /**
     * Setter method for wsB012RestService.
     *
     * @param wsB012RestService Set for wsB012RestService
     */
    public void setWsB012RestService(WsB012RestService wsB012RestService) {
        this.wsB012RestService = wsB012RestService;
    }

    /**
     * Setter method for wsB007RestService.
     *
     * @param wsB007RestService Set for wsB007RestService
     */
    public void setWsB007RestService(WsB007RestService wsB007RestService) {
        this.wsB007RestService = wsB007RestService;
    }

    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * {@inheritDoc}
     *
     * <pre>
     * Main process.
     * メイン処理。
     * </pre>
     *
     * @see com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService#transactRequest(com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain)
     */
    public boolean transactRequest(ResidentRequestDomain req) throws ApplicationException {

        Date startTimeTransactRequest = outputStartLog("transactRequest.");

        try {
            // Search request management that the screen has registered.
            // 画面が登録したリクエスト管理を検索する。
            B0200OdrUploadReqDomain odrUploadReqDomain = searchReqMgt(req.getRequestId());
            outputLog(
                "requestId=" + odrUploadReqDomain.getRequestId() + " uploadFileLineCnt=" + odrUploadReqDomain.getUploadFileLineCnt()
                    + " fcstReplaceFlg=" + odrUploadReqDomain.getFcstReplaceFlg()
                        + " rcvOdrCompCd=" + odrUploadReqDomain.getRcvOdrCompCd()
            );

            // Get local date of request user.
            // リクエスト者のローカル日付を取得する。
            Date localDt = getLocalDateOfRequestUser(odrUploadReqDomain.getUploadUserId());
            odrUploadReqDomain.setRequestLocalDt(localDt);

            // Clear work table.
            // ワークテーブルをクリアする。
            clearWorkTables(odrUploadReqDomain);

            // Register the uploaded order information into the work table.
            // アップロードされた受注情報をワークテーブルに登録する。
            outputLog("Regist to work table.");
            B0200OdrUploadReqDomain countInfo = registerWorkFromFileManager(odrUploadReqDomain);
            odrUploadReqDomain.setExpectedCountInsert(countInfo.getExpectedCountInsert());
            odrUploadReqDomain.setExpectedCountUpdate(countInfo.getExpectedCountUpdate());
            odrUploadReqDomain.setExpectedCountDelete(countInfo.getExpectedCountDelete());

            //###################### Check the order for import ########################
            //###################### 受注情報の取込チェック ########################

            // Check CIGMA night batch is not in progress. In case of error, it ends.
            // CIGMA夜間処理中でないことをチェックする。エラーの場合は終了。
            if (!commonService.searchCigmaAvailable(false, odrUploadReqDomain.getRcvOdrCompCd())) {
                odrUploadReqDomain.setStatusCd(ODR_UPLOAD_REQ_STATUS_CIGMA_NB);
                terminateRequest(odrUploadReqDomain);

                return true;
            }

            // Uniqueness check in file.
            // ファイル内のユニーク性をチェックする。
            outputLog("Uniqueness check in file.");
            checkUniquenessInsideFile(odrUploadReqDomain);

            // Check relation & item completion in CIGMA side. Use Web service.
            // CIGMA側関連チェック & 項目補完を行う。Webサービスを利用する。
            outputLog("Check relation & item completion in CIGMA side.");
            checkRelationCigmaSide(odrUploadReqDomain);

            // Check relation in NEXUS side.
            // NEXUS側関連チェック。
            outputLog("Check relation in NEXUS side.");
            checkRelationNexusSide(odrUploadReqDomain);

            // Fix the status. In case of error, it ends.
            // ステータスを確定する。エラーの場合は終了。
            odrUploadReqDomain.setStatusCd(jbOdrUploadDao.searchStatusSummary(odrUploadReqDomain));
            outputLog("statusCd=" + odrUploadReqDomain.getStatusCd());
            if (ODR_UPLOAD_REQ_STATUS_ERROR.equals(odrUploadReqDomain.getStatusCd())) {
                terminateRequest(odrUploadReqDomain);

                return true;
            }

            //###################### register the add ########################
            //###################### 追加分登録 ########################

            // If  forecast replace is specified.
            // 内示洗い替え指示の場合
            if ("Y".equals(odrUploadReqDomain.getFcstReplaceFlg())) {
                // Register the deletion target record in the order upload update work.
                // 除対象レコードを受注アップロード更新ワークへ登録する。
                outputLog("Forecast replace is specified. Register the deletion target record in the order upload update work.");
                jbOdrUploadDao.createOdrUploadUpdForFcstReplace(odrUploadReqDomain);

                // Delete forecast orders from export orders.
                // 輸出受注から内示を削除する。
                outputLog("Delete forecast orders from export orders.");
                jbOdrUploadDao.deleteExpOdrForFcstReplace(odrUploadReqDomain);
            }

            // Register the record to be registered to the order upload update work.
            // 登録対象レコードを受注アップロード更新ワークへ登録する。
            outputLog("Register the record to be registered to the order upload update work.");
            jbOdrUploadDao.createExpOdrUpdForAdd(odrUploadReqDomain);

            // Register to export orders.
            // 輸出受注へ登録する。
            outputLog("Register to export orders.");
            int actualCountInsert = jbOdrUploadDao.createExpOdrForAdd(odrUploadReqDomain);
            outputLog("actualCountInsert=" + actualCountInsert);
            if (actualCountInsert != odrUploadReqDomain.getExpectedCountInsert()) {
                throw new ApplicationException(
                    "Insert count differs from expected. expect=" + odrUploadReqDomain.getExpectedCountInsert()
                    + " actual=" + actualCountInsert
                );
            }

            // Update item name of export formality item No master.
            // 輸出手続品目番号原単位の品目名称を最新化する。
            outputLog("Update item name of export formality item No master.");
            jbOdrUploadDao.updateMaItemName(odrUploadReqDomain);

            //###################### update the change ########################
            //###################### 変更分登録 ########################

            // Register the changing target record in the order upload update work.
            // 変更対象レコードを受注アップロード更新ワークへ登録する。
            outputLog("Register the changing target record in the order upload update work.");
            jbOdrUploadDao.createOdrUploadUpdForChg(odrUploadReqDomain);

            // Update to export orders.
            // 輸出受注へ更新する。
            outputLog("Update to export orders.");
            int actualCountUpdate = jbOdrUploadDao.updateExpOdrForChg(odrUploadReqDomain);
            outputLog("actualCountUpdate=" + actualCountUpdate);
            if (actualCountUpdate != odrUploadReqDomain.getExpectedCountUpdate()) {
                throw new ApplicationException(
                    "Update count differs from expected. expect=" + odrUploadReqDomain.getExpectedCountUpdate()
                    + " actual=" + actualCountUpdate
                );
            }

            // Delete records of export orders that have become quantity 0.
            // 数量0となった輸出受注のレコードを削除する。
            outputLog("Delete records of export orders that have become quantity 0.");
            int actualCountDelete = jbOdrUploadDao.deleteExpOdrZeroQty(odrUploadReqDomain);
            outputLog("actualCountDelete=" + actualCountDelete);
            if (actualCountDelete != odrUploadReqDomain.getExpectedCountDelete()) {
                throw new ApplicationException(
                    "Delete count differs from expected. expect=" + odrUploadReqDomain.getExpectedCountDelete()
                    + " actual=" + actualCountDelete
                );
            }

            //###################### Refrect to CIGMA Customer Order ########################
            //###################### CIGMA直納受注反映 ########################
            // Reflect to CIGMA Customer Order. Use the web service.
            // CIGMA直納受注反映。Webサービスを利用する。
            Date startTimeRefrectCigmaCustomerOdr = outputStartLog("Reflect to CIGMA Customer Order.");
            refrectCigmaCustomerOdr(odrUploadReqDomain);
            outputEndLog("Reflect to CIGMA Customer Order.", startTimeRefrectCigmaCustomerOdr);

            terminateRequest(odrUploadReqDomain);

        } catch (ApplicationException e) {
            // Output an error in the system log. Resident job is not interrupted.
            // システムログにエラーを出力する。常駐ジョブは中断しない。
            throw e;

        } catch (Throwable t) {
            // Message log: "An unexpected error has occurred."
            // メッセージログ: 「予期しないエラーが発生しました。」
            messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(
                req.getRequestId(), "ECA0027E10024", t, req.getJobId()
            );

            // Output an error in the system log. Resident job is not interrupted.
            // システムログにエラーを出力する。常駐ジョブは中断しない。
            throw new ApplicationException(NXS_91_0001, t);
        }

        outputEndLog("transactRequest", startTimeTransactRequest);

        return true;
    }

    //--------------------------------- Below, protected method ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Search request management
     * <br />リクエスト管理を検索する。
     *
     * @param requestId request ID
     * @return search result
     * @throws ApplicationException system error
     */
    protected B0200OdrUploadReqDomain searchReqMgt(final String requestId) throws ApplicationException {

        TtOdrUploadReqMgtCriteriaDomain ttOdrUploadReqMgtCriteriaDomain1 = new TtOdrUploadReqMgtCriteriaDomain();
        ttOdrUploadReqMgtCriteriaDomain1.setRequestId(requestId);
        List<TtOdrUploadReqMgtDomain> ttOdrUploadReqMgtResultDomainList
            = ttOdrUploadReqMgtService.searchByCondition(ttOdrUploadReqMgtCriteriaDomain1);
        if (ttOdrUploadReqMgtResultDomainList.size() != 1) {
            throw new ApplicationException("Request ID not exists.");
        }
        TtOdrUploadReqMgtDomain ttOdrUploadReqMgtResultDomain = ttOdrUploadReqMgtResultDomainList.get(0);

        B0200OdrUploadReqDomain odrUploadReqDomain = new B0200OdrUploadReqDomain();
        odrUploadReqDomain.setRequestId(ttOdrUploadReqMgtResultDomain.getRequestId());
        odrUploadReqDomain.setRequestDt(ttOdrUploadReqMgtResultDomain.getRequestDt());
        odrUploadReqDomain.setUploadFileId(ttOdrUploadReqMgtResultDomain.getUploadFileId());
        odrUploadReqDomain.setUploadFileNm(ttOdrUploadReqMgtResultDomain.getUploadFileNm());
        odrUploadReqDomain.setUploadFileLineCnt(ttOdrUploadReqMgtResultDomain.getUploadFileLineCnt());
        odrUploadReqDomain.setUploadUserId(ttOdrUploadReqMgtResultDomain.getUploadUserId());
        odrUploadReqDomain.setStatusCd(ttOdrUploadReqMgtResultDomain.getStatus());
        odrUploadReqDomain.setErrFileId(ttOdrUploadReqMgtResultDomain.getErrFileId());
        odrUploadReqDomain.setErrFileNm(ttOdrUploadReqMgtResultDomain.getErrFileNm());
        odrUploadReqDomain.setFcstReplaceFlg(ttOdrUploadReqMgtResultDomain.getFcstReplaceFlg());
        odrUploadReqDomain.setRcvOdrCompCd(ttOdrUploadReqMgtResultDomain.getRcvOdrCompCd());

        return odrUploadReqDomain;
    }

    /**
     * Get the local date of the user who requested processing
     * <br />処理をリクエストしたユーザーのローカル日付を取得する。
     *
     * @param dscId DSC-ID
     * @return local date which was truncated time
     * @throws ApplicationException system error
     */
    protected Date getLocalDateOfRequestUser(final String dscId) throws ApplicationException {

        TmUserConfCriteriaDomain mUserConfCriteriaDomain = new TmUserConfCriteriaDomain();
        mUserConfCriteriaDomain.setDscId(dscId);
        List<TmUserConfDomain> tmUserConfResultDomainList = tmUserConfService.searchByCondition(mUserConfCriteriaDomain);
        String TimeZoneId = tmUserConfResultDomainList.get(0).getTimezoneId();
        Date localDateTime = DateUtil.convertTime(new Date(), TimeZoneId);
        Date localDate = DateUtils.truncate(localDateTime, Calendar.DATE);

        return localDate;
    }

    /**
     * Acquires the CSV file from the file manager, and registers the analysis result in the work table
     * <br />ファイルマネージャーからCSVファイルを取得し、解析結果をワークテーブルに登録する。
     *
     * @param odrUploadReqDomain request info domain
     * @return count infomation
     * @throws ApplicationException system error
     */
    protected B0200OdrUploadReqDomain registerWorkFromFileManager(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException
    {
        List<List<String>> csvListList = null;
        int expectedCountInsert = 0;
        int expectedCountUpdate = 0;
        int expectedCountDelete = 0;

        // Acquire the CSV file from the file manager and analyze it.
        // ファイルマネージャーからCSVファイルを取得し、解析する。
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            fileManagerServiceForStream.searchFileDownload(odrUploadReqDomain.getUploadFileId(), true, outputStream);
            String csvTextdata = outputStream.toString(CHAR_SET_UTF8);
            outputStream.flush();
            outputStream.close();
            csvListList = CsvListConversion.getList(csvTextdata);
            // Remove a header.
            if (0 < csvListList.size()) {
                csvListList.remove(0);
            }
        } catch (Exception e) {
            throw new ApplicationException(e);
        }

        // Register the analysis result in the work table.
        // 解析結果をワークテーブルに登録する。
        List<B0200OdrUploadOdrDomain> odrUploadOdrDomainList = new ArrayList<B0200OdrUploadOdrDomain>();
        int line = 0;
        for (List<String> csvList : csvListList) {
            B0200OdrUploadOdrDomain odrUploadOdrDomain = new B0200OdrUploadOdrDomain();
            odrUploadOdrDomain.setRequestId(odrUploadReqDomain.getRequestId());
            odrUploadOdrDomain.setUploadFileLine(new BigDecimal(++line));
            odrUploadOdrDomain.setFcstReplaceFlg(csvList.get(0));
            odrUploadOdrDomain.setProcessTyp(csvList.get(1));
            odrUploadOdrDomain.setRcvOdrCompCd(csvList.get(2));
            odrUploadOdrDomain.setCustomerCd(csvList.get(3));
            odrUploadOdrDomain.setLgcyShipTo(StringUtils.leftPad(csvList.get(4), 2, '0'));
            odrUploadOdrDomain.setCustomerItemNo(csvList.get(5));
            odrUploadOdrDomain.setTrnsCd(csvList.get(6));
            odrUploadOdrDomain.setEtdDueDt(DateUtil.parseDate(csvList.get(7), WS_CIGMA_DATE_FORMAT));
            odrUploadOdrDomain.setCustomerPoNo(csvList.get(8));
            odrUploadOdrDomain.setNewTrnsCd(csvList.get(6));
            if (StringUtils.isNotEmpty(csvList.get(9))) {
                odrUploadOdrDomain.setNewTrnsCd(csvList.get(9));
            }
            odrUploadOdrDomain.setNewEtdDueDt(DateUtil.parseDate(csvList.get(7), WS_CIGMA_DATE_FORMAT));
            if (StringUtils.isNotEmpty(csvList.get(10))) {
                odrUploadOdrDomain.setNewEtdDueDt(DateUtil.parseDate(csvList.get(10), WS_CIGMA_DATE_FORMAT));
            }
            odrUploadOdrDomain.setNewCustomerPoNo(csvList.get(8));
            if (StringUtils.isNotEmpty(csvList.get(11))) {
                odrUploadOdrDomain.setNewCustomerPoNo(csvList.get(11));
            }
            odrUploadOdrDomain.setOdrQty(new BigDecimal(csvList.get(12)));
            odrUploadOdrDomain.setCustomerDueDt(DateUtil.parseDate(csvList.get(13), WS_CIGMA_DATE_FORMAT));
            odrUploadOdrDomain.setOdrFirmFlg(csvList.get(14));
            odrUploadOdrDomain.setSalesCompPoNo(csvList.get(15));
            odrUploadOdrDomain.setItemNo(null);
            odrUploadOdrDomain.setPkgCd(" ");
            odrUploadOdrDomain.setItemDescription(null);
            odrUploadOdrDomain.setPlntCd(null);
            odrUploadOdrDomain.setShippingDt(null);
            odrUploadOdrDomain.setLvl1ErrCdList(null);
            odrUploadOdrDomain.setLvl2ErrCdList(null);
            odrUploadOdrDomain.setLvl3ErrCdList(null);
            odrUploadOdrDomain.setLvl3WarnCdList(null);
            odrUploadOdrDomain.setErrorTyp("0");
            odrUploadOdrDomainList.add(odrUploadOdrDomain);

            // Forecast the number of additions, changes, deletions subjects to self check after registration.
            // 登録後自己チェックするため追加、変更、削除対象件数を予測する。
            if (Eca0027Constants.ODR_UPLOAD_PROC_TYP_ADD.equals(odrUploadOdrDomain.getProcessTyp())) {
                expectedCountInsert++;
            }
            if (Eca0027Constants.ODR_UPLOAD_PROC_TYP_CHG.equals(odrUploadOdrDomain.getProcessTyp())) {
                expectedCountUpdate++;
            }
            if (BigDecimal.ZERO.equals(odrUploadOdrDomain.getOdrQty())) {
                expectedCountDelete++;
            }
        }
        if (expectedCountInsert + expectedCountUpdate != line) {
            throw new ApplicationException(
                "Mismatch process type. All=" + line + " Add=" + expectedCountInsert + " Chg=" + expectedCountUpdate
            );
        }
        jbOdrUploadDao.createOdrUploadWork(odrUploadOdrDomainList);

        // Returns the number of additions, modifications and deletions.
        // 追加、変更、削除対象件数を返す。

        B0200OdrUploadReqDomain odrUploadResultReqDomain = new B0200OdrUploadReqDomain();
        odrUploadResultReqDomain.setExpectedCountInsert(expectedCountInsert);
        odrUploadResultReqDomain.setExpectedCountUpdate(expectedCountUpdate);
        odrUploadResultReqDomain.setExpectedCountDelete(expectedCountDelete);

        return odrUploadResultReqDomain;
    }

    /**
     * Common processing at the end of job
     * <br />ジョブ終了時の共通処理
     *
     * Update the status of request management and clear the work.
     * If it is an error, create an error file and register it in the file manager.
     * リクエスト管理のステータスを更新して、ワークをクリアする。
     * エラーの場合はエラーファイルを作成し、ファイルマネージャーに登録する。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void terminateRequest(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        // In th case of Complate (Warning) or Error.
        // 完了（警告あり）またはエラーの場合
        if (
            ODR_UPLOAD_REQ_STATUS_COMPLETE_WARN.equals(odrUploadReqDomain.getStatusCd())
            ||  ODR_UPLOAD_REQ_STATUS_ERROR.equals(odrUploadReqDomain.getStatusCd())
        )
        {
            // Search order upload work.
            // 受注アップロードワークを検索する。
            TwOdrUploadCriteriaDomain twOdrUploadCriteriaDomain = new TwOdrUploadCriteriaDomain();
            twOdrUploadCriteriaDomain.setRequestId(odrUploadReqDomain.getRequestId());
            twOdrUploadCriteriaDomain.setSearchCountCheckFlg(false);
            List<TwOdrUploadDomain> twOdrUploadResultDomainList
                = twOdrUploadService.searchByCondition(twOdrUploadCriteriaDomain);
            try {
                // Get text data from file manager.
                // ファイルマネージャーからテキストデータを取得する。
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                fileManagerServiceForStream.searchFileDownload(odrUploadReqDomain.getUploadFileId(), true, outputStream);
                String textData = outputStream.toString(CHAR_SET_UTF8);
                outputStream.flush();
                outputStream.close();

                // Prepare Reader, Writer.
                // Reader、Writer準備
                BufferedReader reader = new BufferedReader(new StringReader(textData)); 
                StringWriter writer = new StringWriter();

                // Add an error code column to the end of each line.
                // 各行の末尾にエラーコード列を付加する。
                writer.write(reader.readLine() + "," + ODR_UPLOAD_TITLE_ERROR_INFO + ODR_UPLOAD_CSV_NEWLINE); // header
                for (TwOdrUploadDomain twOdrUploadResultDomain : twOdrUploadResultDomainList) {
                    String errorInfo = "";
                    if (!ODR_UPLOAD_ERROR_TYP_NORMAL.equals(twOdrUploadResultDomain.getErrorTyp())) {
                        String joinedErrorCodes = StringUtils.join(new String[] {
                            twOdrUploadResultDomain.getLvl1ErrCdList(), twOdrUploadResultDomain.getLvl2ErrCdList(),
                                twOdrUploadResultDomain.getLvl3ErrCdList(), twOdrUploadResultDomain.getLvl3WarnCdList()
                        }, ",");
                        String[] errorCodes = StringUtils.split(joinedErrorCodes, ",");
                        Arrays.sort(errorCodes);
                        errorInfo = StringUtils.join(errorCodes, ";");
                    }
                    writer.write(reader.readLine() + "," + errorInfo + ODR_UPLOAD_CSV_NEWLINE);
                }

                // Register the reorganized text data in the file manager.
                // 再編成したテキストデータをファイルマネージャーに登録する。
                InputStream fileData = new ByteArrayInputStream(writer.toString().getBytes(CHAR_SET_UTF8));
                String errFileId = fileManagerServiceForStream.createFileUpload(fileData,
                    makeErrFileNm(odrUploadReqDomain), DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), "0");
                odrUploadReqDomain.setErrFileId(errFileId);

            } catch (Exception e) {
                throw new ApplicationException(e);
            }

        // In the case of Error (CIGMA N/B).
        // CIGMA夜間バッチ中エラーの場合
        } else if (ODR_UPLOAD_REQ_STATUS_CIGMA_NB.equals(odrUploadReqDomain.getStatusCd())) {
            // If it is an error during night batch, the upload file is used as it is as an error file.
            // 夜間バッチ中エラーの場合はアップロードファイルをそのままエラーファイルとする。
            odrUploadReqDomain.setErrFileId(odrUploadReqDomain.getUploadFileId());
            odrUploadReqDomain.setErrFileNm(odrUploadReqDomain.getUploadFileNm());

        // Complate
        } else {
            // Do not create an error file in case of Complete.
            // 完了の場合はエラーファイルを作成しない。
        }

        // Update request management status.
        // リクエスト管理のステータスを更新
        TtOdrUploadReqMgtDomain ttOdrUploadReqMgtDomain = new TtOdrUploadReqMgtDomain();
        ttOdrUploadReqMgtDomain.setStatus(odrUploadReqDomain.getStatusCd());
        ttOdrUploadReqMgtDomain.setErrFileId(odrUploadReqDomain.getErrFileId());
        ttOdrUploadReqMgtDomain.setErrFileNm(odrUploadReqDomain.getErrFileNm());
        ttOdrUploadReqMgtDomain.setStatus(odrUploadReqDomain.getStatusCd());
        commonService.setCommonPropertyForUpdate(ttOdrUploadReqMgtDomain, ODR_UPLOAD_JOB_ID_ABB);
        TtOdrUploadReqMgtCriteriaDomain ttOdrUploadReqMgtCriteriaDomain1 = new TtOdrUploadReqMgtCriteriaDomain();
        ttOdrUploadReqMgtCriteriaDomain1.setRequestId(odrUploadReqDomain.getRequestId());
        ttOdrUploadReqMgtService.updateByCondition(ttOdrUploadReqMgtDomain, ttOdrUploadReqMgtCriteriaDomain1);

        // Clear the work tables.
        // ワークをクリア
        clearWorkTables(odrUploadReqDomain);
    }

    /**
     * Clear the work tables
     * <br />ワークテーブルをクリアする。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void clearWorkTables(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        TwOdrUploadCriteriaDomain twOdrUploadCriteriaDomain = new TwOdrUploadCriteriaDomain();
        twOdrUploadCriteriaDomain.setRequestId(odrUploadReqDomain.getRequestId());
        twOdrUploadService.deleteByCondition(twOdrUploadCriteriaDomain);

        TwOdrUploadUpdCriteriaDomain twOdrUploadUpdCriteriaDomain = new TwOdrUploadUpdCriteriaDomain();
        twOdrUploadUpdCriteriaDomain.setRequestId(odrUploadReqDomain.getRequestId());
        twOdrUploadUpdService.deleteByCondition(twOdrUploadUpdCriteriaDomain);
    }

    /**
     * Create an error file name based on the file name
     * <br />ファイル名を元にエラーファイル名を作成する。
     *
     * @param odrUploadReqDomain request info domain
     * @return error file name
     */
    protected String makeErrFileNm(final B0200OdrUploadReqDomain odrUploadReqDomain) {

        String fileNm = odrUploadReqDomain.getUploadFileNm();
        if (ODR_UPLOAD_REQ_STATUS_COMPLETE_WARN.equals(odrUploadReqDomain.getStatusCd())) {
            fileNm = fileNm.replaceFirst("\\.(csv|CSV)$", "_Warn.csv");
        } else if (ODR_UPLOAD_REQ_STATUS_ERROR.equals(odrUploadReqDomain.getStatusCd())) {
            fileNm = fileNm.replaceFirst("\\.(csv|CSV)$", "_Error.csv");
        } else {
            // No case
        }

        return fileNm;
    }

    /**
     * Check the uniqueness of records in the file
     * <br />ファイル内レコード同志のユニーク性をチェックする。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void checkUniquenessInsideFile(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList
            = jbOdrUploadDao.searchCheckUniquenessInsideFile(odrUploadReqDomain);
        if (0 < odrUploadOdrDomainList.size()) {
            jbOdrUploadDao.updateOdrUploadWorkByUniquenessInsideFileCheckResults(odrUploadOdrDomainList);
        }
    }

    /**
     * Check the input on the CIGMA side
     * <br />CIGMA側で入力をチェックする。
     *
     * The result of the check is updated to the work.
     * チェックの結果はワークに更新する。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void checkRelationCigmaSide(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        // Search the data to be checked
        // チェック対象のデータを検索
        List<? extends B0200OdrUploadOdrDomain> odrUploadOdrResultDomainList
            = jbOdrUploadDao.searchCheckRelationCigmaSide(odrUploadReqDomain);
        if (CollectionUtils.isEmpty(odrUploadOdrResultDomainList)) {
            return;
        }

        // Set parameters and invoke web service.
        // パラメータを設定しWebサービスを呼出す。
        WsB012ParamDomain wsb012ParamDomain = new WsB012ParamDomain();
        wsb012ParamDomain.setRequestId(odrUploadReqDomain.getRequestId());
        wsb012ParamDomain.setRequestLocalDt(formatDateForCigma(odrUploadReqDomain.getRequestLocalDt()));
        wsb012ParamDomain.setOdrList(odrUploadOdrResultDomainList);
        WsB012ResultDomain wsB012ResultDomain
            = wsB012RestService.checkEdiOdrEntry(odrUploadReqDomain.getRcvOdrCompCd(), wsb012ParamDomain);
        if (WS_RESULT_ERROR.equals(wsB012ResultDomain.getResultCode())) {
            throw new GscmApplicationException(wsB012ResultDomain.getErrorList().get(0).getErrorCode(), 
                wsB012ResultDomain.getErrorList().get(0).getErrorParamList().toArray());
        }

        // Reflect the result to work.
        // 結果をワークに反映
        jbOdrUploadDao.updateOdrUploadWorkByCigmaSideCheckResults(wsB012ResultDomain.getOdrList());
    }

    /**
     * Check the input on the NEXUS side
     * <br />NEXUS側で入力をチェックする。
     * 
     * The result of the check is updated to the work.
     * チェックの結果はワークに更新する。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void checkRelationNexusSide(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        // Search the data to be checked
        // チェック対象のデータを検索
        List<? extends B0200OdrUploadOdrDomain> odrUploadOdrResultDomainList 
            = jbOdrUploadDao.searchCheckRelationNexusSide(odrUploadReqDomain);
        if (CollectionUtils.isEmpty(odrUploadOdrResultDomainList)) {
            return;
        }

        // Search results line-by-line processing
        // 検索結果行単位処理
        for (B0200OdrUploadOdrDomain domain : odrUploadOdrResultDomainList) {

            StringBuffer lvl1ErrBuf = new StringBuffer();
            StringBuffer lvl2ErrBuf = new StringBuffer();
            StringBuffer lvl3ErrBuf = new StringBuffer();
            StringBuffer lvl3WarnBuf = new StringBuffer();

            // For Add order
            // 発注追加の場合
            if (ODR_UPLOAD_PROC_TYP_ADD.equals(domain.getProcessTyp())) {

                if (domain.getItemNo() != null) {

                    // If the Export Shipping Item No Special Information Master does not exist
                    // 輸出出荷品目番号原単位に存在しない場合
                    if (!FLAG_Y.equals(domain.getExistItemSpInfoFlg())) {
                        lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_05).append(",");
                    }

                    // If the Export Formality Item No Master does not exist
                    // 輸出手続品番原単位に存在しない場合
                    if (!FLAG_Y.equals(domain.getExistFormalitiItemFlg())) {
                        lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_06).append(",");
                    }
                }

                // If the trans. code does not exist Code Master.
                // 輸送区分がコード原単位に存在しない場合
                if (!FLAG_Y.equals(domain.getExistNewTrnsFlg())) {
                    lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_09).append(",");
                }

                // If it already exists in export orders
                // 既に輸出受注に存在する場合
                if (FLAG_Y.equals(domain.getExistNewExpRcvOdrFlg())) {
                    lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_29).append(",");
                }

                if (domain.getShippingLot() != null && !BigDecimal.ZERO.equals(domain.getShippingLot())) {
                    BigDecimal mod = domain.getOdrQty().remainder(domain.getShippingLot());
                    // If the number of orders is not a multiple of the lot
                    // 受注数がロット倍数でない場合
                    if (!BigDecimal.ZERO.equals(mod)) { 
                        lvl3WarnBuf.append(EDI_RCV_ODR_ERR_CD_12).append(",");
                    }
                }

            // For orders Change
            // 発注変更の場合
            } else if (ODR_UPLOAD_PROC_TYP_CHG.equals(domain.getProcessTyp())) {

                // If you change the subject does not exist in export orders
                // 変更対象が輸出受注に存在しない場合
                if (!FLAG_Y.equals(domain.getExistOldExpRcvOdrFlg())) {
                    lvl1ErrBuf.append(EDI_RCV_ODR_ERR_CD_30).append(",");
                }

                if (FLAG_Y.equals(domain.getExistOldExpRcvOdrFlg())) {
                    // If the order number change
                    // 発注数変更の場合
                    if (!domain.getOdrQty().equals(domain.getOldOdrQty())) {
                        // If the shipment is complete
                        // 出荷が完了している場合
                        if (domain.getPltzAllocQty().equals(domain.getOldOdrQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_21).append(",");
                        } else {
                            // If you are below the packing number of allowances
                            // 梱包引当数を下回る場合
                            if (domain.getOdrQty().compareTo(domain.getPltzAllocQty()) < 0) {
                                lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_22).append(",");
                            }
                        }
                    }

                    // In the case of firm → forecast change
                    // 確定→内示変更の場合
                    if (FLAG_Y.equals(domain.getOldOdrFirmFlg()) && FLAG_N.equals(domain.getOdrFirmFlg())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_23).append(",");

                        }
                    }

                    // In the case of ETD change
                    // ETD変更の場合
                    if (!domain.getNewEtdDueDt().equals(domain.getEtdDueDt())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_24).append(",");
                        }
                    }

                    // If transportation code change
                    // 輸送区分変更の場合
                    if (!domain.getNewTrnsCd().equals(domain.getTrnsCd())) {

                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_25).append(",");
                        }

                        // If the trans. code does not exist Code Master.
                        // 輸送区分がコード原単位に存在しない場合
                        if (!FLAG_Y.equals(domain.getExistNewTrnsFlg())) {
                            lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_09).append(",");
                        }
                    }

                    // If a Customer PO No. change
                    // 得意先PO No.変更の場合
                    if (!domain.getNewCustomerPoNo().equals(domain.getCustomerPoNo())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_27).append(",");
                        }
                    }

                    // If the changed key already exists in the export order.
                    // 変更後のキーが既に輸出受注に存在する場合
                    if (FLAG_Y.equals(domain.getExistNewExpRcvOdrFlg())) {
                        lvl3ErrBuf.append(EDI_RCV_ODR_ERR_CD_29).append(",");
                    }

                    if (domain.getShippingLot() != null && !BigDecimal.ZERO.equals(domain.getShippingLot())) {
                        BigDecimal mod = domain.getOdrQty().remainder(domain.getShippingLot());
                        // If the number of orders is not a multiple of the lot
                        // 受注数がロット倍数でない場合
                        if (!BigDecimal.ZERO.equals(mod)) { 
                            lvl3WarnBuf.append(EDI_RCV_ODR_ERR_CD_12).append(",");
                        }
                    }
                }
            }

            // Error code re-set
            // Results and merge of CIGAM side check
            // エラーコード整理
            // CIGAM側チェックの結果とマージ

            if (domain.getLvl1ErrCdList() != null) {
                lvl1ErrBuf.append(domain.getLvl1ErrCdList()).append(",");
            }
            if (domain.getLvl2ErrCdList() != null) {
                lvl2ErrBuf.append(domain.getLvl2ErrCdList()).append(",");
            }
            if (domain.getLvl3ErrCdList() != null) {
                lvl3ErrBuf.append(domain.getLvl3ErrCdList()).append(",");
            }
            if (domain.getLvl3WarnCdList() != null) {
                lvl3WarnBuf.append(domain.getLvl3WarnCdList()).append(",");
            }

            // Clear error of the lower-level
            // 下位レベルのエラーはクリア
            domain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_NORMAL);
            if (0 < lvl1ErrBuf.length()) {
                domain.setLvl1ErrCdList(lvl1ErrBuf.deleteCharAt(lvl1ErrBuf.length() - 1).toString());
                domain.setLvl2ErrCdList(null);
                domain.setLvl3ErrCdList(null);
                domain.setLvl3WarnCdList(null);
                domain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_ERROR);
            } else if (0 < lvl2ErrBuf.length()) {
                domain.setLvl2ErrCdList(lvl2ErrBuf.deleteCharAt(lvl2ErrBuf.length() - 1).toString());
                domain.setLvl3ErrCdList(null);
                domain.setLvl3WarnCdList(null);
                domain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_ERROR);
            } else {
                if (0 < lvl3ErrBuf.length()) {
                    domain.setLvl3ErrCdList(lvl3ErrBuf.deleteCharAt(lvl3ErrBuf.length() - 1).toString());
                    domain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_ERROR);
                }
                if (0 < lvl3WarnBuf.length()) {
                    domain.setLvl3WarnCdList(lvl3WarnBuf.deleteCharAt(lvl3WarnBuf.length() - 1).toString());
                    if (!EDI_RCV_ODR_ERROR_TYP_ERROR.equals(domain.getErrorTyp())) {
                        domain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_WARNING);
                    }
                }
            }
        }
        // Reflect the check result to order upload work.
        // チェック結果を受注アップロードワークに反映
        jbOdrUploadDao.updateOdrUploadWorkByNexusSideCheckResults(odrUploadOdrResultDomainList);
    }

    /**
     * Also reflect the contents of registration to export orders in CIGMA direct delivery orders
     * <br />輸出受注への登録内容をCIGMA直納受注にも反映する。
     *
     * @param odrUploadReqDomain request info domain
     * @throws ApplicationException system error
     */
    protected void refrectCigmaCustomerOdr(final B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        // Search the data to be refrected.
        // 反映対象のデータを検索
        TwOdrUploadUpdCriteriaDomain twOdrUploadUpdCriteriaDomain = new TwOdrUploadUpdCriteriaDomain();
        twOdrUploadUpdCriteriaDomain.setRequestId(odrUploadReqDomain.getRequestId());
        twOdrUploadUpdCriteriaDomain.setPreferredOrder("BRCH");
        List<TwOdrUploadUpdDomain> twOdrUploadUpdResultDomainList
            = twOdrUploadUpdService.searchByCondition(twOdrUploadUpdCriteriaDomain);
        if (twOdrUploadUpdResultDomainList.size() == 0) {
            return;
        }

        // Set parameters and invoke web service.
        // パラメータを設定しWebサービスを呼出す。
        List<WsB007ParamItemDomain> wsB007ParamItemDomainList = new ArrayList<WsB007ParamItemDomain>();
        for (TwOdrUploadUpdDomain twOdrUploadUpdResultDomain : twOdrUploadUpdResultDomainList) {
            WsB007ParamItemDomain wsB007ParamItemDomain = new WsB007ParamItemDomain();
            wsB007ParamItemDomain.setOrderType(twOdrUploadUpdResultDomain.getUpdateTyp());
            wsB007ParamItemDomain.setCustomerNoLegacy(twOdrUploadUpdResultDomain.getCustomerCd());
            wsB007ParamItemDomain.setShiptoNoLegacy(twOdrUploadUpdResultDomain.getLgcyShipTo());
            wsB007ParamItemDomain.setPartNo(twOdrUploadUpdResultDomain.getItemNo());
            wsB007ParamItemDomain.setPkgCode(" ");
            wsB007ParamItemDomain.setShippingDueDate(formatDateForCigma(twOdrUploadUpdResultDomain.getShippingDt()));
            wsB007ParamItemDomain.setShipInstrAllocQty(toPlainString(twOdrUploadUpdResultDomain.getPltzAllocQty()));
            wsB007ParamItemDomain.setShippedQty(toPlainString(twOdrUploadUpdResultDomain.getShippedQty()));
            wsB007ParamItemDomain.setNumberOfShipInstr("0");
            wsB007ParamItemDomain.setOrderQtyOrg(twOdrUploadUpdResultDomain.getOdrQtyOrg().toPlainString());
            wsB007ParamItemDomain.setSalesCompanyPoNo(" ");
            if (StringUtils.isNotEmpty(twOdrUploadUpdResultDomain.getSalesCompPoNo())) {
                wsB007ParamItemDomain.setSalesCompanyPoNo(twOdrUploadUpdResultDomain.getSalesCompPoNo());
            }
            wsB007ParamItemDomain.setUpdateType(twOdrUploadUpdResultDomain.getUpdateTyp());
            wsB007ParamItemDomain.setOldCustomerDueDate(formatDateForCigma(twOdrUploadUpdResultDomain.getOldCustomerDueDt()));
            wsB007ParamItemDomain.setOldEtdDueDate(formatDateForCigma(twOdrUploadUpdResultDomain.getOldEtdDueDt()));
            wsB007ParamItemDomain.setOldOrderQty(toPlainString(twOdrUploadUpdResultDomain.getOldOdrQty()));
            wsB007ParamItemDomain.setOldTransportationCode(twOdrUploadUpdResultDomain.getOldTrnsCd());
            wsB007ParamItemDomain.setOldCustomerPoNo(twOdrUploadUpdResultDomain.getOldCustomerPoNo());
            wsB007ParamItemDomain.setOldOrderFirmFlag(twOdrUploadUpdResultDomain.getOldOdrFirmFlg());
            wsB007ParamItemDomain.setOldCustomerPartNo(twOdrUploadUpdResultDomain.getCustomerItemNo());
            wsB007ParamItemDomain.setNewCustomerDueDate(formatDateForCigma(twOdrUploadUpdResultDomain.getNewCustomerDueDt()));
            wsB007ParamItemDomain.setNewEtdDueDate(formatDateForCigma(twOdrUploadUpdResultDomain.getNewEtdDueDt()));
            wsB007ParamItemDomain.setNewOrderQty(toPlainString(twOdrUploadUpdResultDomain.getNewOdrQty()));
            wsB007ParamItemDomain.setNewTransportationCode(twOdrUploadUpdResultDomain.getNewTrnsCd());
            wsB007ParamItemDomain.setNewCustomerPoNo(twOdrUploadUpdResultDomain.getNewCustomerPoNo());
            wsB007ParamItemDomain.setNewOrderFirmFlag(twOdrUploadUpdResultDomain.getNewOdrFirmFlg());
            wsB007ParamItemDomain.setNewCustomerPartNo(twOdrUploadUpdResultDomain.getCustomerItemNo());
            wsB007ParamItemDomainList.add(wsB007ParamItemDomain);
        }
        WsB007ParamDomain wsB007ParamDomain = new WsB007ParamDomain();
        wsB007ParamDomain.setReceivingCompanyCode(odrUploadReqDomain.getRcvOdrCompCd());
        wsB007ParamDomain.setExpRcvOdrUpdateList(wsB007ParamItemDomainList);
        ResultDomain resultDomain
            = wsB007RestService.reflectToCusOdr(odrUploadReqDomain.getRcvOdrCompCd(), wsB007ParamDomain);
        if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
            throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode(), 
                resultDomain.getErrorList().get(0).getErrorParamList().toArray());
        }
    }

    /**
     * Format the date
     * <br />日付をフォーマットする。
     *
     * @param date date object
     * @return formatted result
     */
    protected String formatDateForCigma(final Date date) {

        if (date == null) {
            return null;
        }

        return new SimpleDateFormat(WS_CIGMA_DATE_FORMAT).format(date);
    }

    /**
     * Change BigDecimal into a string
     * <br />BigDecimalを文字列に変換する。
     *
     * @param value bigDecimal object
     * @return converted result
     */
    protected String toPlainString(final BigDecimal value) {

        if (value == null) {
            return null;
        }

        return value.toPlainString();
    }

    // Below, Progress information log output support.

    /**
     * Progress information log output.
     *
     * @param message message
     */
    protected void outputLog(String message) {

        LOG.info("##OdrUpload " + message);
    }

    /**
     * Progress information start log output.
     *
     * @param message message
     * @return start time
     */
    protected Date outputStartLog(String message) {

        LOG.info("##OdrUpload Start. " + message);

        return new Date();
    }
    
    /**
     * Progress information end log output.
     *
     * @param message message
     * @param startTime start time
     */
    protected void outputEndLog(String message, Date startTime) {

        Date endTime = new Date();
        String diffTime = DurationFormatUtils.formatPeriod(
            startTime.getTime(), endTime.getTime(), "HH:mm:ss"
        );
        LOG.info("##OdrUpload End. " + message + " Execution Time: [" + diffTime + "]");
    }
}
