/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ECA0027E10009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERROR_TYP_WARNING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_05;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_06;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_12;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_21;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_22;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_23;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_24;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_25;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_26;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_27;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_29;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_30;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ERR_CD_91;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_ADD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_CHANGE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_DELETE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_TYP_ORIGINAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOB_ID_B0100;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOB_STATUS_ABEND;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOB_STATUS_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain;
import com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService;
import com.globaldenso.ai.aijb.library.business.service.MessageLogFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBatchReqParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryService;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdService;
import com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao;
import com.globaldenso.eca0027.core.business.domain.B0100EdiRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultItemDomain;
import com.globaldenso.eca0027.core.business.ws.WsB006RestService;
import com.globaldenso.eca0027.core.business.ws.WsB007RestService;
import com.globaldenso.eca0027.core.business.ws.WsB008RestService;
import com.globaldenso.eca0027.core.business.ws.WsB020RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.TmResourcesDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmResourcesService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;
import com.globaldenso.gscm.framework.util.StringUtil;


/**
 * This is service of an EDI-Receive-Order registration batch.
 * <br />EDI受注登録バッチのサービスです。
 * <pre>
 * This service is performed as a request job (the permanent residence version) of a permanent residence request job.
 * </pre>
 * <pre>
 * このサービスは、常駐リクエストジョブのリクエストジョブ（常駐版）として実行されます。
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class JbEdiRcvOdrServiceImpl implements ResidentRequestApplicationService {

    /**
     * Log class<br />
     * ログクラス
     */
    protected static final Log LOG = LogFactory.getLog(JbEdiRcvOdrServiceImpl.class);

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Batch Request Parameter   Service
     * <br />バッチリクエストパラメータ サービス
     */
    protected TtBatchReqParamService ttBatchReqParamService;
    
    /**
     * NEXUS-Company-Master service
     * <br />NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Resource   Service
     * <br />リソース サービス
     */
    protected TmResourcesService tmResourcesService;
    
    /**
     * EDI-Receive-Order service
     * <br />EDI受注サービス
     */
    protected TtEdiRcvOdrService ttEdiRcvOdrService;
    
    /**
     * EDI Receive Order Error Report   Service
     * <br />EDI受注エラーレポート サービス
     */
    protected TtEdiRcvOdrReportService ttEdiRcvOdrReportService;

    /**
     * Export-Receive-Order-Update service
     * <br />輸出受注更新サービス
     */
    protected TtExpRcvOdrUpdService ttExpRcvOdrUpdService;
    
    /**
     * EDI Receive Order Error Report   Service
     * <br />EDI受注エラーレポート サービス
     */
    protected LB001ReportService lb001ReportService;
    
    /**
     * The Web service client of WSB006
     * <br />WSB006のWebサービスクライアント
     */
    protected WsB006RestService wsB006RestService;
    
    /**
     * The Web service client of WSB007
     * <br />WSB007のWebサービスクライアント
     */
    protected WsB007RestService wsB007RestService;

    /**
     * The Web service client of WSB008
     * <br />WSB008のWebサービスクライアント
     */
    protected WsB008RestService wsB008RestService;
    
    /**
     * The Web service client of WSB020
     * <br />WSB020のWebサービスクライアント
     */
    protected WsB020RestService wsB020RestService;
    
    /**
     * A.I. Artificial Intelligence-JB message log registration parts
     * <br />AI-JB メッセージログ登録部品
     */
    protected MessageLogFacadeService messageLogFacadeService;
    
    /**
     * EDI-Receive-Order registration DAO
     * <br />EDI受注登録DAO
     */
    protected JbEdiRcvOdrDao jbEdiRcvOdrDao;
    
    static {
        // Initialize TM_RESOURCES
        // TM_RESOURCESの初期化
        ResourcesFactory factory = new ResourcesFactory();
        factory.createResources("AijbLogMessages");
    }
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     *
     */
    public JbEdiRcvOdrServiceImpl() {
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
     * Setter method for ttBatchReqParamService.
     *
     * @param ttBatchReqParamService Set for ttBatchReqParamService
     */
    public void setTtBatchReqParamService(TtBatchReqParamService ttBatchReqParamService) {
        this.ttBatchReqParamService = ttBatchReqParamService;
    }

    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
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
     * Setter method for ttEdiRcvOdrService.
     *
     * @param ttEdiRcvOdrService Set for ttEdiRcvOdrService
     */
    public void setTtEdiRcvOdrService(TtEdiRcvOdrService ttEdiRcvOdrService) {
        this.ttEdiRcvOdrService = ttEdiRcvOdrService;
    }

    /**
     * Setter method for ttEdiRcvOdrReportService.
     *
     * @param ttEdiRcvOdrReportService Set for ttEdiRcvOdrReportService
     */
    public void setTtEdiRcvOdrReportService(TtEdiRcvOdrReportService ttEdiRcvOdrReportService) {
        this.ttEdiRcvOdrReportService = ttEdiRcvOdrReportService;
    }

    /**
     * Setter method for ttExpRcvOdrUpdService.
     *
     * @param ttExpRcvOdrUpdService Set for ttExpRcvOdrUpdService
     */
    public void setTtExpRcvOdrUpdService(TtExpRcvOdrUpdService ttExpRcvOdrUpdService) {
        this.ttExpRcvOdrUpdService = ttExpRcvOdrUpdService;
    }

    /**
     * Setter method for lb001ReportService.
     *
     * @param lb001ReportService Set for lb001ReportService
     */
    public void setLb001ReportService(LB001ReportService lb001ReportService) {
        this.lb001ReportService = lb001ReportService;
    }

    /**
     * Setter method for wsB006RestService.
     *
     * @param wsB006RestService Set for wsB006RestService
     */
    public void setWsB006RestService(WsB006RestService wsB006RestService) {
        this.wsB006RestService = wsB006RestService;
    }

    /**
     * Setter method for wsB007RestService.
     *
     * @param wsB007RestService Set for wsB007RestService
     */
    public void setWsB007RestService(WsB007RestService wsB007RestService) {
        this.wsB007RestService = wsB007RestService;
    }

    /**
     * Setter method for wsB008RestService.
     *
     * @param wsB008RestService Set for wsB008RestService
     */
    public void setWsB008RestService(WsB008RestService wsB008RestService) {
        this.wsB008RestService = wsB008RestService;
    }

    /**
     * Setter method for wsB020RestService.
     *
     * @param wsB020RestService Set for wsB020RestService
     */
    public void setWsB020RestService(WsB020RestService wsB020RestService) {
        this.wsB020RestService = wsB020RestService;
    }

    /**
     * Setter method for messageLogFacadeService.
     *
     * @param messageLogFacadeService Set for messageLogFacadeService
     */
    public void setMessageLogFacadeService(MessageLogFacadeService messageLogFacadeService) {
        this.messageLogFacadeService = messageLogFacadeService;
    }

    /**
     * Setter method for jbEdiRcvOdrDao.
     *
     * @param jbEdiRcvOdrDao Set for jbEdiRcvOdrDao
     */
    public void setJbEdiRcvOdrDao(JbEdiRcvOdrDao jbEdiRcvOdrDao) {
        this.jbEdiRcvOdrDao = jbEdiRcvOdrDao;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Acquisition of a batch parameter
     *     The following conditions are specified and {@link TtBatchReqParamService#searchByCondition (TtBatchReqParamCriteriaDomain)} is called,
     *     A parameter is acquired.
     *       - REQUEST ID ({@link ResidentRequestDomain#getRequestId()})
     *
     * - CIGMA ordering extraction
     *     Clearance of - EDI-Receive-Order T
     *       {@link #deleteEdiRcvOdrOnCigmaDataExtraction} is called and the EDI-Receive-Order data of an ordering company is deleted.
     *
     *     Acquisition of the ordering information from - CIGMA
     *       Acquisition of - NEW LINC SUBSIDIARY CODE
     *         {@link #searchNewLincSubsidaryCdOnCigmaDataExtraction} is called and a new LINK base CD of an ordering company is acquired.
     *
     *       - Web service call
     *         The following is made into a parameter and this is a call about {@link WsB008RestService#getEdiOdrLincData}.
     *           - RECEIVE ORDER COMPANY CODE
     *           - NEW LINC SUBSIDIARY CODE
     *
     *       Reflection of - Web service call result
     *         The information acquired from CIGMA is reflected in the following table.
     *           -EDI-Receive-OrderT ({@link TtEdiRcvOdrService#create (List)} is used)
     *
     * - Ordering registration
     *     - Pretreatment
     *       The following table data of an ordering company is deleted.
     *         - EDI Receive Order Error Report ({@link TtEdiRcvOdrReportService#deleteByCondition (TtEdiRcvOdrReportCriteriaDomain)} is used)  
     *         - Export Receive Order Update ({@link TtExpRcvOdrUpdService#deleteByCondition (TtExpRcvOdrUpdCriteriaDomain)} is used)
     *
     *     - carrying-about ordering registration
     *       Clearance of the error code of - EDI-Receive-Order carrying about
     *       This is an invoke about * {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)},
     *         The error code and ERROR TYPE of each LEVEL are cleared.
     *
     *       - EDI-Receive-Order common check (NEXUS side)
     *         An invoke and EDI-Receive-Order carrying about are acquired for * {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrRtryForCreateEdiRcvOdrRtry(B0100EdiRcvOdrCriteriaDomain)}.
     *         An EDI-Receive-Order common check (NEXUS side) is performed.
     * {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)} An invoke,
     *         A checked result is updated to EDI-Receive-Order carrying-about T.
     *
     *       - EDI-Receive-Order common check (CIGMA side)  
     *         An invoke and EDI-Receive-Order carrying about are acquired for * {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrRtryForCreateEdiRcvOdrRtry(B0100EdiRcvOdrCriteriaDomain)}.
     *         An EDI-Receive-Order common check (CIGMA side) is performed.
     * {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)} An invoke,
     *         A checked result is updated to EDI-Receive-Order carrying-about T.
     *
     *       - Registration of an error report information
     *         In the case of 1 (there being only warning) and 2 (those with an error), an EDI-Receive-Order carrying-about . ERROR TYPE is,
     *         The outputting information to an invoke and an error report is registered for {@link TtEdiRcvOdrReportService#create (TtEdiRcvOdrReportDomain)}.
     *
     *       - Registration of an Export Receive Order
     *         According to the state of - EDI-Receive-Order carrying about, the registration or the update of an Export Receive Order is performed.
     *           - ORDER TYPE = in the case of "1" (Original) or ORDER-TYPE =" 2 "(Change) ORDER-CHANGE-TYPE =" 1" (Add)
     *             An invoke and registration are performed for {@link TtExpRcvOdrService#create (TtExpRcvOdrDomain)}.
     *           - ORDER TYPE = in the case of "2" (Change) and ORDER-CHANGE-TYPE =" 2" (Change)
     *             An invoke and an update are performed for * {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *         Delete of - EDI-Receive-Order carrying about
     *           This is an invoke about {@link TtEdiRcvOdrRtryService#deleteByCondition (TtEdiRcvOdrRtryCriteriaDomain)},
     *           The EDI carrying-about order received under current processing is deleted.
     *
     *         - Update of an ITEM DESCRIPTION
     *           An invoke and a lock are acquired for * {@link JbEdiRcvOdrDao#lockTmExpFormalitiItemNoForUpdateItemNo(TmExpFormalitiItemNoCriteriaDomain)}.
     *           When a lock is able to be acquired, an invoke and an ITEM DESCRIPTION are updated for {@link TmExpFormalitiItemNoService#update (TmExpFormalitiItemNoDomain)}.
     *
     *     - erase of Forcast
     *         - Delete of the unofficial announcement data of an Export Receive Order
     *           - Acquisition of unofficial announcement data
     *             ORDER-TYPE ="1": Original, an ORDER FIRM FLAG = "N": Acquire the Export Receive Order of an unofficial announcement.
     *
     *           - Delete of an Export Receive Order
     *              An invoke and a lock are acquired for {@link JbEdiRcvOdrDao#lockTtExpRcvOdrForDeleteForecastRcvOdr (TtExpRcvOdrCriteriaDomain)} to the acquired Export Receive Order.
     *             When a lock is able to be acquired, an invoke and an Export Receive Order are deleted for {@link TtExpRcvOdrService#deleteByCondition (TtExpRcvOdrCriteriaDomain)}.
     *
     *           - Registration of an Export Receive Order Update
     *             An invoke and an Export Receive Order Update are registered for {@link TtExpRcvOdrUpdService#create (TtExpRcvOdrUpdDomain)}.
     *
     *         Delete of - EDI-Receive-Order carrying about
     *             This is an invoke about * {@link JbEdiRcvOdrDao#deleteTtEdiRcvOdrRtryForDeleteForecastRcvOdr(B0100EdiRcvOdrCriteriaDomain)},
     *           ORDER-TYPE ="1": Original, an ORDER FIRM FLAG = "N": Delete EDI-Receive-Order carrying about of an unofficial announcement.
     *
     *     - Ordering registration
     *       - Clearance of an error code
     *         This is an invoke about {@link TtEdiRcvOdrService#updateByCondition (TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)},
     *         The error code of an EDI Receive Order is cleared.
     *
     *       - EDI-Receive-Order common check (NEXUS side)
     *         An invoke and an EDI Receive Order are acquired for {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry (B0100EdiRcvOdrCriteriaDomain)}.
     *         An EDI-Receive-Order common check (NEXUS side) is performed.
     *         {@link TtEdiRcvOdrService#updateByCondition (TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)} is updated to an invoke, and a checked result is updated to EDI-Receive-Order T.
     *
     *       - An invoke and an EDI Receive Order are acquired for {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry (B0100EdiRcvOdrCriteriaDomain)}.
     *         An EDI-Receive-Order common check (CIGMA side) is performed.
     *         {@link TtEdiRcvOdrService#updateByCondition (TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)} is updated to an invoke, and a checked result is updated to EDI-Receive-Order T.
     *
     *       - Error record processing
     *         The EDI Receive Order of an invoke and an ordering company is acquired for {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry (B0100EdiRcvOdrCriteriaDomain)}.
     *         A carrying-about judging is performed.
     *         When a judgment result is taken round, an invoke and EDI-Receive-Order carrying about are registered for {@link TtEdiRcvOdrRtryService#create (TtEdiRcvOdrRtryDomainch)}.
     *         EDI-Receive-Order carrying about of a delete of {@link TtEdiRcvOdrRtryService#deleteByCondition (TtEdiRcvOdrRtryCriteriaDomain)} of an invoke and a receiving form is deleted.
     *
     *       - Outputting information create to an error report
     *         The EDI Receive Order of an invoke and an ordering company is acquired for {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry (B0100EdiRcvOdrCriteriaDomain)}.
     *         An invoke and an EDI Receive Order Error Report are registered for {@link TtEdiRcvOdrReportService#create (TtEdiRcvOdrReportDomain)}.
     *
     *       - Registration of an Export Receive Order
     *         - Acquisition of ordering data
     *           The EDI Receive Order of an invoke and an ordering company is acquired for {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry (B0100EdiRcvOdrCriteriaDomain)}.
     *         - Change of an Export Receive Order
     *           According to the state of an EDI Receive Order, registration, update, and delete of an Export Receive Order are performed.
     *           - ORDER-TYPE ="1" (original) or ORDER-TYPE ="2" (change), ORDER-CHANGE-TYPE ="1" (addition)
     *             An invoke and an Export Receive Order are registered for {@link TtExpRcvOdrService#create (TtExpRcvOdrDomain)}.
     *             An invoke and an Export Receive Order Update are registered for {@link TtExpRcvOdrUpdService#create (TtExpRcvOdrUpdDomain)}.
     *           - ORDER TYPE = "2" (Change) and ORDER-CHANGE-TYPE =" 2" (Change)
     *             An invoke and an Export Receive Order are updated for {@link TtExpRcvOdrService#update (TtExpRcvOdrDomain)}.
     *             An invoke and an Export Receive Order Update are registered for {@link TtExpRcvOdrUpdService#create (TtExpRcvOdrUpdDomain)}.
     *           - ORDER-TYPE ="2" (Change), ORDER-CHANGE-TYPE ="3" (Delete)
     *             An invoke and an Export Receive Order are deleted for {@link TtExpRcvOdrService#deleteByCondition (TtExpRcvOdrCriteriaDomain)}.
     *             An invoke and an Export Receive Order Update are registered for {@link TtExpRcvOdrUpdService#create (TtExpRcvOdrUpdDomain)}.
     *         - Update of an Export-Formality-Item-No master
     *             An invoke and a lock are acquired for * {@link JbEdiRcvOdrDao#lockTmExpFormalitiItemNoForUpdateItemNo(TmExpFormalitiItemNoCriteriaDomain)}.
     *           When a lock is able to be acquired, an invoke and an ITEM DESCRIPTION are updated for {@link TmExpFormalitiItemNoService#update (TmExpFormalitiItemNoDomain)}.
     *
     *     - CIGMA direct delivery ordering reflection
     *       An invoke and an Export Receive Order Update are acquired for {@link TtExpRcvOdrUpdService#searchByCondition (TtExpRcvOdrUpdCriteriaDomain)}.
     *       The direct delivery order received F of an invoke and CIGMA is updated for {@link WsB007RestService#reflectToCusOdr (String, WsB007ParamDomain)}.
     *
     *     - Error report output
     *       An invoke and the record number are acquired for {@link TtEdiRcvOdrReportService#searchCount (TtEdiRcvOdrReportCriteriaDomain)}.
     *       When a record exists, an invoke and an error report are created for {@link LB001ReportService#searchOdrRcv (String, Date, String)}.
     *       The printer of an invoke and an output destination change is acquired for {@link JbEdiRcvOdrDao#searchPrinterForErrReport (String)}.
     *       {@link CommonService#printPdf (File, int, String)} is outputted to an invoke, and an error report is outputted to a target printer.
     *
     *     - Unofficial announcement ordering reexamination
     *       An invoke and an Export Receive Order are locked for {@link JbEdiRcvOdrDao#lockTtExpRcvOdrForReviseOdrQty (TtExpRcvOdrCriteriaDomain)}.
     *.
     *       When a lock is able to be acquired, {@link JbEdiRcvOdrDao#updateTtExpRcvOdrForReviseOdrQty(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)} An invoke,
     *       An Export Receive Order is updated.
     *
     *     - Job terminating notice
     *       The end of a job is notified for {@link WsB020RestService#updateEdiRcvOdrStatus (String, String)} to an invoke and a CIGMA night batch.
     *
     *
     * </pre>
     * <pre>
     * - バッチパラメータの取得
     *   下記条件を指定して、{@link TtBatchReqParamService#searchByCondition(TtBatchReqParamCriteriaDomain)}を呼出し、
     *   パラメータを取得する
     *     ・リクエストID ({@link ResidentRequestDomain#getRequestId()})
     *     
     * - CIGMA受注抽出
     *   - EDI受注Tのクリア
     *     {@link #deleteEdiRcvOdrOnCigmaDataExtraction}を呼出し、受注会社のEDI受注データを削除する
     *     
     *   - CIGMAからの受注情報の取得
     *     - 新LINC拠点コードの取得
     *       {@link #searchNewLincSubsidaryCdOnCigmaDataExtraction}を呼出し、受注会社の新LINK拠点コードを取得する
     *       
     *     - Webサービス呼出し
     *       以下をパラメータにして、{@link WsB008RestService#getEdiOdrLincData}を呼び出す
     *         ・受注会社コード
     *         ・新LINC拠点コード
     *         
     *     - Webサービス呼出し結果の反映
     *       CIGMAより取得した情報を下記テーブルに反映する
     *         ・EDI受注T ({@link TtEdiRcvOdrService#create(List)}を使用)
     *             
     * - 受注登録
     *   - 前処理
     *     受注会社の下記テーブルデータを削除する
     *       ・EDI受注エラーレポート ({@link TtEdiRcvOdrReportService#deleteByCondition(TtEdiRcvOdrReportCriteriaDomain)}を使用)
     *       ・輸出受注更新 ({@link TtExpRcvOdrUpdService#deleteByCondition(TtExpRcvOdrUpdCriteriaDomain)}を使用)
     *       
     *   - 持ち回り受注登録
     *     - EDI受注持ち回りのエラーコードのクリア
     *       {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)}を呼び出し、
     *       各レベルのエラーコードとエラー区分をクリアする
     *       
     *     - EDI受注共通チェック(NEXUS側)
     *       {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrRtryForCreateEdiRcvOdrRtry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、EDI受注持ち回りを取得する
     *       EDI受注共通チェック(NEXUS側)を行う
     *       {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)}を呼び出し、チェック結果をEDI受注持ち回りTに更新する。
     *       
     *     - EDI受注共通チェック (CIGMA側)
     *       {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrRtryForCreateEdiRcvOdrRtry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、EDI受注持ち回りを取得する
     *       EDI受注共通チェック(CIGMA側)を行う
     *       {@link TtEdiRcvOdrRtryService#updateByCondition(TtEdiRcvOdrRtryDomain, TtEdiRcvOdrRtryCriteriaDomain)}を呼び出し、チェック結果をEDI受注持ち回りTに更新する。
     *       
     *     - エラーレポート情報の登録
     *       EDI受注持ち回り.エラー区分が1(警告のみあり)、2(エラーあり)の場合、
     *       {@link TtEdiRcvOdrReportService#create(TtEdiRcvOdrReportDomain)}を呼び出し、エラーレポートへの出力情報を登録する
     *       
     *     - 輸出受注の登録
     *       - EDI受注持ち回りの状態に応じて、輸出受注の登録または更新を行う。
     *         - 発注区分="1"(Original)または発注区分="2"(Change)、発注変更区分 = "1"(Add)の場合
     *           {@link TtExpRcvOdrService#create(TtExpRcvOdrDomain)}を呼び出し、登録を行う
     *         - 発注区分="2"(Change)、発注変更区分="2"(Change)の場合
     *           {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼び出し、更新を行う
     *       - EDI受注持ち回りの削除
     *         {@link TtEdiRcvOdrRtryService#deleteByCondition(TtEdiRcvOdrRtryCriteriaDomain)}を呼び出し、
     *         現在処理中のEDI持ち回り受注を削除する
     *       
     *       - 品目名称の更新
     *         {@link JbEdiRcvOdrDao#lockTmExpFormalitiItemNoForUpdateItemNo(TmExpFormalitiItemNoCriteriaDomain)}を呼び出し、ロックを取得する
     *         ロックが取得できた場合、{@link TmExpFormalitiItemNoService#update(TmExpFormalitiItemNoDomain)}を呼び出し、品目名称を更新する
     *       
     *   - 内示消し込み
     *       - 輸出受注の内示データの削除
     *         - 内示データの取得
     *           発注区分="1":オリジナル、受注確定フラグ="N":内示の輸出受注を取得する
     *         
     *         - 輸出受注の削除
     *           取得した輸出受注に対して、{@link JbEdiRcvOdrDao#lockTtExpRcvOdrForDeleteForecastRcvOdr(TtExpRcvOdrCriteriaDomain)}を呼び出し、ロックを取得する
     *           ロックが取得できた場合、{@link TtExpRcvOdrService#deleteByCondition(TtExpRcvOdrCriteriaDomain)}を呼び出し、輸出受注を削除する
     *         
     *         - 輸出受注更新の登録
     *           {@link TtExpRcvOdrUpdService#create(TtExpRcvOdrUpdDomain)}を呼び出し、輸出受注更新を登録する
     *         
     *       - EDI受注持ち回りの削除
     *         {@link JbEdiRcvOdrDao#deleteTtEdiRcvOdrRtryForDeleteForecastRcvOdr(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、
     *         発注区分="1"：オリジナル、受注確定フラグ="N":内示のEDI受注持ち回りを削除する 
     *   
     *   - 受注登録
     *     - エラーコードのクリア
     *       {@link TtEdiRcvOdrService#updateByCondition(TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)}を呼び出し、
     *       EDI受注のエラーコードをクリアする
     *       
     *     - EDI受注共通チェック (NEXUS側)
     *       {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、EDI受注を取得する
     *       EDI受注共通チェック(NEXUS側)を行う
     *       {@link TtEdiRcvOdrService#updateByCondition(TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)}を呼び出し、チェック結果をEDI受注Tに更新する
     *       
     *     - {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、EDI受注を取得する
     *       EDI受注共通チェック(CIGMA側)を行う
     *       {@link TtEdiRcvOdrService#updateByCondition(TtEdiRcvOdrDomain, TtEdiRcvOdrCriteriaDomain)}を呼び出し、チェック結果をEDI受注Tに更新する
     *     
     *     - エラーレコード処理
     *       {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、受注会社のEDI受注を取得する
     *       持ち回り判定を行う
     *       判定結果が持ち回りとなった場合、{@link TtEdiRcvOdrRtryService#create(TtEdiRcvOdrRtryDomain)}を呼び出し、EDI受注持ち回りを登録する
     *       {@link TtEdiRcvOdrRtryService#deleteByCondition(TtEdiRcvOdrRtryCriteriaDomain)}を呼び出し、受信形態が削除のEDI受注持ち回りを削除する
     *     
     *     - エラーレポートへの出力情報作成
     *       {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、受注会社のEDI受注を取得する
     *       {@link TtEdiRcvOdrReportService#create(TtEdiRcvOdrReportDomain)}を呼び出し、EDI受注エラーレポートを登録する
     *       
     *     - 輸出受注の登録
     *       - 受注データの取得
     *         {@link JbEdiRcvOdrDao#searchTtEdiRcvOdrForCreateOderEntry(B0100EdiRcvOdrCriteriaDomain)}を呼び出し、受注会社のEDI受注を取得する
     *       - 輸出受注の変更
     *         EDI受注の状態に応じて、輸出受注の登録・更新・削除を行う
     *         - 発注区分="1"(オリジナル)または発注区分="2"(変更)、発注変更区分="1"(追加)
     *           {@link TtExpRcvOdrService#create(TtExpRcvOdrDomain)}を呼び出し、輸出受注を登録する
     *           {@link TtExpRcvOdrUpdService#create(TtExpRcvOdrUpdDomain)}を呼び出し、輸出受注更新を登録する
     *         - 発注区分="2"(Change)、発注変更区分="2"(Change)の
     *           {@link TtExpRcvOdrService#update(TtExpRcvOdrDomain)}を呼び出し、輸出受注を更新する
     *           {@link TtExpRcvOdrUpdService#create(TtExpRcvOdrUpdDomain)}を呼び出し、輸出受注更新を登録する
     *         - 発注区分="2"(Change)、発注変更区分="3"(Delete)
     *           {@link TtExpRcvOdrService#deleteByCondition(TtExpRcvOdrCriteriaDomain)}を呼び出し、輸出受注を削除する
     *           {@link TtExpRcvOdrUpdService#create(TtExpRcvOdrUpdDomain)}を呼び出し、輸出受注更新を登録する
     *       - 輸出手続品番原単位の更新  
     *         {@link JbEdiRcvOdrDao#lockTmExpFormalitiItemNoForUpdateItemNo(TmExpFormalitiItemNoCriteriaDomain)}を呼び出し、ロックを取得する
     *         ロックが取得できた場合、{@link TmExpFormalitiItemNoService#update(TmExpFormalitiItemNoDomain)}を呼び出し、品目名称を更新する
     *     
     *   - CIGMA直納受注反映
     *     {@link TtExpRcvOdrUpdService#searchByCondition(TtExpRcvOdrUpdCriteriaDomain)}を呼び出し、輸出受注更新を取得する
     *     {@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}を呼び出し、CIGMAの直納受注Fを更新する
     *     
     *   - エラーレポート出力
     *     {@link TtEdiRcvOdrReportService#searchCount(TtEdiRcvOdrReportCriteriaDomain)}を呼び出し、レコード件数を取得する
     *     レコードが存在する場合、{@link LB001ReportService#searchOdrRcv(String, Date, String)}を呼び出し、エラーレポートを作成する
     *     {@link JbEdiRcvOdrDao#searchPrinterForErrReport(String)}を呼び出し、出力先のプリンタを取得する
     *     {@link CommonService#printPdf(File, int, String)}を呼び出し、エラーレポートを対象プリンタに出力する
     *     
     *   - 内示受注見直し
     *     {@link JbEdiRcvOdrDao#lockTtExpRcvOdrForReviseOdrQty(TtExpRcvOdrCriteriaDomain)}を呼び出し、輸出受注をロックする
     *     ロックが取得できた場合、{@link JbEdiRcvOdrDao#updateTtExpRcvOdrForReviseOdrQty(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼び出し、輸出受注を更新する
     *     
     *   - ジョブ終了通知
     *     {@link WsB020RestService#updateEdiRcvOdrStatus(String, String)}を呼び出し、CIGMA夜間バッチにジョブの終了を通知する
     *     
     * 
     * </pre>
     * 
     * @see com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService#transactRequest(com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain)
     */
    public boolean transactRequest(ResidentRequestDomain req) throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting main process. requestId=" + req.getRequestId());

        // Acquisition of a parameter
        // パラメータの取得
        Map<String, String> paramMap = searchBatchReqParam(req);
        String rcvOdrCompCd = paramMap.get("receivingCompanyCode");
        Date cigmaAds = parseDate(paramMap.get("ads"), WS_CIGMA_DATE_FORMAT);
        String callerJobId = "E213"; // default
        if (paramMap.containsKey("callerJobId")) {
            callerJobId = paramMap.get("callerJobId");
        }
        int step = 0; // For unit test. Usually 0.
        writeProgre("rcvOdrCompCd=" + rcvOdrCompCd + ", cigmaAds=" + new SimpleDateFormat("yyyy/MM/dd").format(cigmaAds)
            + ", callerJobId=" + callerJobId);

        try {
            // STEP1: CIGMA ordering extraction
            // STEP1: CIGMA受注抽出
            if (step == 0 || step == 1) {
                try {
                    transactCigmaLincDataExtraction(req, rcvOdrCompCd, cigmaAds, callerJobId);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10001, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP2: Pretreatment
            // STEP2: 前処理
            if (step == 0 || step == 2) {
                try {
                    preprocessOnTransactOderEntry(req, rcvOdrCompCd, cigmaAds);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10002, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP3: carrying-about ordering registration
            // STEP3: 持ち回り分受注登録
            if (step == 0 || step == 3) {
                try {
                    registOrder(req, rcvOdrCompCd, cigmaAds, FLAG_Y);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10005, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP4: Ordering registration
            // STEP4: 当日分受注登録
            if (step == 0 || step == 4) {
                try {
                    registOrder(req, rcvOdrCompCd, cigmaAds, FLAG_N);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10005, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP5: CIGMA direct delivery ordering reflection
            // STEP5: CIGMA直納受注反映
            if (step == 0 || step == 5) {
                try {
                    updateToCigmaOnTransactOderEntry(req, rcvOdrCompCd, cigmaAds);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10006, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP6: Error report output
            // STEP6: エラーレポート出力
            if (step == 0 || step == 6) {
                try {
                    transactErrReportOutput(req, rcvOdrCompCd, cigmaAds);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10007, t, JOB_ID_B0100);
                    throw t;
                }
            }
            // STEP7: The number reexamination of unofficial announcement orders received
            // STEP7: 内示受注数見直し
            if (step == 0 || step == 7) {
                // E060 is executed in pairs only in the case of E213.
                // *E060 is the job that truncation forecast QTY of CIGMA customer order.
                // E213の場合のみE060がペアで実施される。
                // ※E060はCIGMA直納受注の内示数量切り捨てを行うジョブ。
                if ("E213".equals(callerJobId)) { // IN176 ADD if
                    try {
                        transactOdrQtyRevise(req, rcvOdrCompCd, cigmaAds);
                    } catch (Throwable t) {
                        messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                            ECA0027E10008, t, JOB_ID_B0100);
                        throw t;
                    }
                }
            }
            // STEP8: Job terminating notice (Normal)
            // STEP8: ジョブ終了通知（正常）
            if (step == 0 || step == 8) {
                try {
                    transactJobEndNotice(req, rcvOdrCompCd, JOB_STATUS_NORMAL, callerJobId);
                } catch (Throwable t) {
                    messageLogFacadeService.aijbCreateMessageLogFromResidentRequest(req.getRequestId(),
                        ECA0027E10009, t, JOB_ID_B0100);
                    throw t;
                }
            }

        } catch (Throwable t) {
            // STEP8: Job terminating notice (ABEND)
            // STEP8: ジョブ終了通知（異常）
            try {
                transactJobEndNotice(req, rcvOdrCompCd, JOB_STATUS_ABEND, callerJobId);
            } catch (Throwable t2) {
                throw new ApplicationException(NXS_91_0001, t);
            }
            throw new ApplicationException(NXS_91_0001, t);
        }

        writeProgreEnd("Main process ended. requestId=" + req.getRequestId(), startTime1);
        return true;
    }
    
    /******************************************************************************************************
     * CIGMA ordering extraction<br />
     * CIGMA受注抽出 
     ******************************************************************************************************/
    
    /**
     *   [CIGMA ordering extraction] CIGMA ordering extraction is performed.
     * <br />【CIGMA受注抽出】CIGMA受注抽出を行います。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @param cigmaAds CIGMA ADS<br />CIGMA ADS
     * @param callerJobId source job IS<br />呼び出し元ジョブID
     * @throws ApplicationException 業務例外
     */
    protected void transactCigmaLincDataExtraction(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds, String callerJobId)
        throws ApplicationException {

        // A delete of EDI Receive Order
        // EDI受注の削除
        deleteEdiRcvOdrOnCigmaDataExtraction(rcvOdrCompCd);

        // Acquisition of NEW LINC SUBSIDIARY CODE
        // 新LINC拠点コードの取得
        String newLincSubsidaryCd = searchNewLincSubsidaryCdOnCigmaDataExtraction(rcvOdrCompCd);

        // The call of Web service (WSB0008)
        // Webサービス(WSB0008)の呼出し
        Date startTime1 = writeProgreStart("Starting LINC extraction.");
        WsB008ResultDomain result = searchEdiOdrLincDataOnCigmaDataExtraction(rcvOdrCompCd, newLincSubsidaryCd, callerJobId);
        int recordCount = 0;
        if (result != null) {
            if (result.getEdiReceivingOrderList() != null) {
                recordCount = result.getEdiReceivingOrderList().size();
            }
        }
        writeProgreEnd("LINC extraction ended. recordCount=" + recordCount, startTime1);

        if (!CollectionUtils.isEmpty(result.getEdiReceivingOrderList())) {
            // Registration of EDI Receive Order
            // EDI受注の登録
            Date startTime2 = writeProgreStart("Starting registration work table.");
            createEdiRcvOdrOnCigmaDataExtraction(result);
            writeProgreEnd("Registration work table ended.", startTime2);
        }
    }
    
    /**
     *   A [CIGMA ordering extraction (1)] EDI Receive Order is deleted.
     * <br />【CIGMA受注抽出 (1)】EDI受注を削除します。
     *
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @throws ApplicationException When an EDI Receive Order is not able to be deleted<br />EDI受注が削除できなかった場合
     */
    protected void deleteEdiRcvOdrOnCigmaDataExtraction(String rcvOdrCompCd) throws ApplicationException {
        TtEdiRcvOdrCriteriaDomain criteria = new TtEdiRcvOdrCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setSearchCountCheckFlg(false);
        
        if (0 < ttEdiRcvOdrService.searchCount(criteria)) {
            ttEdiRcvOdrService.deleteByCondition(criteria);
        }
    }
    
    /**
     *   A [CIGMA ordering extraction] (2.1) NEW LINC SUBSIDIARY CODE is acquired.
     * <br />【CIGMA受注抽出 (2.1)】新LINC拠点コードを取得します。
     *
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @return NEW LINC SUBSIDIARY CODE<br />新LINC拠点コード
     * @throws ApplicationException When a NEW LINC SUBSIDIARY CODE is not able to be acquired<br />新LINC拠点コードが取得できなかった場合
     */
    protected String searchNewLincSubsidaryCdOnCigmaDataExtraction(String rcvOdrCompCd) throws ApplicationException {
        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(rcvOdrCompCd);
        
        return tmNxsCompService.searchByKey(criteria).getNewLincSubsidiaryCd();
    }
    
    /**
     *   [CIGMA ordering extraction] (2.2) Web service (WS_B008) is called, and an EDI-Receive-Order information is acquired.
     * <br />【CIGMA受注抽出 (2.2)】Webサービス(WS_B008)を呼出し、EDI受注情報を取得します。
     *
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @param newLincSubsidaryCd NEW LINC SUBSIDIARY CODE<br />新LINC拠点コード
     * @param callerJobId source job ID<br />呼び出し元ジョブID
     * @return EDI-Receive-Order information<br />EDI受注情報
     * @throws ApplicationException When an error occurs in the invoke of Web service<br />Webサービスの呼び出しでエラーが発生した場合
     */
    protected WsB008ResultDomain searchEdiOdrLincDataOnCigmaDataExtraction(
        String rcvOdrCompCd, String newLincSubsidaryCd, String callerJobId) throws ApplicationException {
        
        WsB008ResultDomain result = wsB008RestService.getEdiOdrLincData(rcvOdrCompCd, newLincSubsidaryCd, callerJobId);
        
        if (WS_RESULT_ERROR.equals(result.getResultCode())) {
            throw asGscmApplicationException(result.getErrorList().get(0));
        }
        
        return result;
    }
    
    /**
     *   A [CIGMA ordering extraction] (2.5) EDI Receive Order is registered.
     * <br />【CIGMA受注抽出 (2.5)】EDI受注を登録します。
     *
     * @param result The call result of WSB008<br />WSB008の呼出し結果
     * @throws ApplicationException When an EDI Receive Order is not able to be registered<br />EDI受注が登録できなかった場合
     */
    protected void createEdiRcvOdrOnCigmaDataExtraction(WsB008ResultDomain result) throws ApplicationException {
        
        List<B0100EdiRcvOdrDomain> ediRcvOdrDomainList = new ArrayList<B0100EdiRcvOdrDomain>();
        for (WsB008ResultItemDomain resultEdiRcvOdrDomain : result.getEdiReceivingOrderList()) {
            B0100EdiRcvOdrDomain ediRcvOdrDomain = new B0100EdiRcvOdrDomain();
            
            // Setting of property
            // プロパティの設定
            // IN152 MOD START
            //CommonUtil.copyProperties(ediRcvOdrDomain, resultEdiRcvOdrDomain, WS_CIGMA_DATE_FORMAT);
            ediRcvOdrDomain.setCustomerSubsidiaryCd(resultEdiRcvOdrDomain.getCustomerSubsidiaryCd());
            ediRcvOdrDomain.setTransmissionDt(      DateUtil.parseDate(resultEdiRcvOdrDomain.getTransmissionDt(), WS_CIGMA_DATE_FORMAT));
            ediRcvOdrDomain.setOdrTyp(              resultEdiRcvOdrDomain.getOdrTyp());
            ediRcvOdrDomain.setSerialNo(            toBigDecimal(resultEdiRcvOdrDomain.getSerialNo()));
            ediRcvOdrDomain.setCustomerCd(          resultEdiRcvOdrDomain.getCustomerCd());
            ediRcvOdrDomain.setLgcyShipTo(          resultEdiRcvOdrDomain.getLgcyShipTo());
            ediRcvOdrDomain.setCustomerItemNoOrg(   resultEdiRcvOdrDomain.getCustomerItemNoOrg());
            ediRcvOdrDomain.setOdrCtrlNo(           toBigDecimal(resultEdiRcvOdrDomain.getOdrCtrlNo()));
            ediRcvOdrDomain.setRevisionNo(          toBigDecimal(resultEdiRcvOdrDomain.getRevisionNo()));
            ediRcvOdrDomain.setRevisionNoEis(       toBigDecimal(resultEdiRcvOdrDomain.getRevisionNoEis()));
            ediRcvOdrDomain.setOdrChgTyp(           resultEdiRcvOdrDomain.getOdrChgTyp());
            ediRcvOdrDomain.setCustomerPoNo(        resultEdiRcvOdrDomain.getCustomerPoNo());
            ediRcvOdrDomain.setCustomerDueDt(       DateUtil.parseDate(resultEdiRcvOdrDomain.getCustomerDueDt(), WS_CIGMA_DATE_FORMAT));
            ediRcvOdrDomain.setEtdDueDt(            DateUtil.parseDate(resultEdiRcvOdrDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
            ediRcvOdrDomain.setOdrFirmFlg(          resultEdiRcvOdrDomain.getOdrFirmFlg());
            ediRcvOdrDomain.setOdrQty(              toBigDecimal(resultEdiRcvOdrDomain.getOdrQty()));
            ediRcvOdrDomain.setSupplierCd(          resultEdiRcvOdrDomain.getSupplierCd());
            // IN152 MOD END

            // The original order change indicator "1":add.
            // オリジナルの発注変更区分を"1"：追加にする。
            if (EDI_RCV_ODR_ODR_TYP_ORIGINAL.equals(resultEdiRcvOdrDomain.getOdrTyp())) {
                ediRcvOdrDomain.setOdrChgTyp(EDI_RCV_ODR_ODR_CHG_TYP_ADD);
            }
            
            // A setting of TRNS CD
            // 輸送手段コードの設定
            ediRcvOdrDomain.setTrnsCd(resultEdiRcvOdrDomain.getTransCd());
            
            // A setting of RECEIVE ORDER COMPANY CODE, and an ERROR TYPE
            // 受注会社コード、エラー区分の設定
            ediRcvOdrDomain.setRcvOdrCompCd(result.getRcvOdrCompCd());
            ediRcvOdrDomain.setErrorTyp(EDI_RCV_ODR_ERROR_TYP_NORMAL);
            
            // A setting of CUSTOMER PLANT CODE
            // 得意先工場コードの設定
            ediRcvOdrDomain.setCustomerPlntCd(resultEdiRcvOdrDomain.getCustomerPlantCode());
            
            // Setting of common property
            // 共通プロパティの設定
            commonService.setCommonPropertyForRegist(ediRcvOdrDomain, JOB_ID_B0100);
            
            // Registration of EDI Receive Order
            // EDI受注の登録
            ediRcvOdrDomainList.add(ediRcvOdrDomain);
        }
        jbEdiRcvOdrDao.createEdiOdrByBulk(ediRcvOdrDomainList);
    }
    
    /******************************************************************************************************
     * Ordering registration / pretreatment<br />
     * 受注登録／前処理
     ******************************************************************************************************/

    /**
     *   A [ordering registration] pretreatment is performed.
     * <br />【受注登録】前処理を行います。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @param cigmaAds Business date (CIGMA ADS)<br />業務日付(CIGMA ADS)
     * @throws ApplicationException Business exception<br />業務例外
     */
    protected void preprocessOnTransactOderEntry(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds)
        throws ApplicationException {

        // A delete of EDI Receive Order Error Report
        // EDI受注エラーレポートの削除
        deleteTtEdiRcvOdrReportOnPreprocess(rcvOdrCompCd);

        // Delete of an Export Receive Order Update
        // 輸出受注更新の削除
        deleteTtExpRcvOdrUpdOnPreprocess(rcvOdrCompCd);
    }
    
    /**
     *   [ordering registration / pretreatment (1)] EDI Receive Order Error Report is deleted.
     * <br />【受注登録／前処理 (1)】EDI受注エラーレポートを削除します。
     *
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @throws ApplicationException When an EDI Receive Order Error Report is not able to be deleted<br />EDI受注エラーレポートが削除できなかった場合
     */
    protected void deleteTtEdiRcvOdrReportOnPreprocess(String rcvOdrCompCd) throws ApplicationException {
        // Setting of deletion conditions
        // 削除条件の設定
        TtEdiRcvOdrReportCriteriaDomain criteria = new TtEdiRcvOdrReportCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setSearchCountCheckFlg(false);
        
        // A delete of EDI Receive Order Error Report
        // EDI受注エラーレポートの削除
        if (0 < ttEdiRcvOdrReportService.searchCount(criteria)) {
            ttEdiRcvOdrReportService.deleteByCondition(criteria);
        }
    }
    
    /**
     *   [ordering registration / pretreatment (1)] Export Receive Order Update is deleted
     * <br />【受注登録／前処理 (1)】輸出受注更新を削除します。
     *
     * @param rcvOdrCompCd The COMPANY CODE between bases of an ordering company<br />受注会社の拠点間会社コード
     * @throws ApplicationException When an Export Receive Order Update is not able to be deleted<br />輸出受注更新が削除できなかった場合
     */
    protected void deleteTtExpRcvOdrUpdOnPreprocess(String rcvOdrCompCd) throws ApplicationException {
        // Setting of deletion conditions
        // 削除条件の設定
        TtExpRcvOdrUpdCriteriaDomain criteria = new TtExpRcvOdrUpdCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setSearchCountCheckFlg(false);
        
        // Delete of an Export Receive Order Update
        // 輸出受注更新の削除
        if (0 < ttExpRcvOdrUpdService.searchCount(criteria)) {
            ttExpRcvOdrUpdService.deleteByCondition(criteria);
        }
    }
    
    /******************************************************************************************************
     * Ordering registration / ordering carrying-about registration<br />
     * 当日分受注登録／受注持ち回り分登録共通
     ******************************************************************************************************/

    /**
     * Ordering registration / ordering carrying-about registration<br />
     * 当日分受注登録／受注持ち回り分登録共通
     *
     * @param req Resident request parameter domain
     * @param rcvOdrCompCd Receiving order company code
     * @param cigmaAds CIGMA ADS
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    protected void registOrder(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds, String rtryFlg)
        throws ApplicationException {

        // Clear error code
        // エラーコードのクリア
        jbEdiRcvOdrDao.updateClearErrorEdiOdr(rcvOdrCompCd, rtryFlg);

        //
        //
        // To control the processing order information transmission date,
        // add / change classification (ODR_TYP = 1 || ODR_CHG_TYP = 1 / other).
        // Such as long-term Renkyuake, corresponding in the case of LINC is accumulated.
        // 情報送信日、追加/変更区分（ODR_TYP=1||ODR_CHG_TYP=1/other）で処理順を制御する。
        // 長期連休明けなど、LINCが溜まっている場合の対応。
        //
        //
        for (Map<String, Object> rec : jbEdiRcvOdrDao.searchEdiOdrTransmissionDt(rcvOdrCompCd, rtryFlg)) {

            Date transmissionDt = (Date)rec.get("transmissionDt");
            String addOrChgTyp = (String)rec.get("addOrChgTyp");
            writeProgre("rtryFlg=" + rtryFlg + ", transmissionDt=" + new SimpleDateFormat("yyyy/MM/dd").format(transmissionDt)
                + ", addOrChgTyp=" + addOrChgTyp);

            // Delete forecast order
            // 内示消し込み
            if (FLAG_N.equals(rtryFlg) && "ADD".equals(addOrChgTyp)) {
                // Register the deleted record to export orders update
                // 削除対象レコードを輸出受注更新へ登録
                jbEdiRcvOdrDao.createExpOdrUpdByForecastEdi(rcvOdrCompCd, transmissionDt);
                // Delete forecast order from export order
                // 輸出受注から内示削除
                jbEdiRcvOdrDao.deleteExpOdrForecastByOrgEdi(rcvOdrCompCd, transmissionDt);
                // Delete forecast order from re-try
                // 持ち回りからも削除
                jbEdiRcvOdrDao.deleteEdiOdrRtryForecastByOrgEdi(rcvOdrCompCd, transmissionDt);
            }

            //
            //
            // Receive check
            // 受信チェック
            //
            //

            // Receive check (CIGMA side)
            // 受信チェック（CIGMA側）
            WsB006ResultDomain wsB006ResultDomain
                = checkEdiOdrCigmaSide(rcvOdrCompCd, transmissionDt, addOrChgTyp, rtryFlg, cigmaAds);
            // To reflect the check result
            // チェック結果を反映
            updateEdiOdrByCigmaSideCheckResults(wsB006ResultDomain, rtryFlg);

            // Receive check (NEXUS side)
            // 受信チェック（NEXUS側）
            List<? extends B0100EdiRcvOdrDomain> b0100EdiRcvOdrDomainList = null;
            if ("ADD".equals(addOrChgTyp)) {
                b0100EdiRcvOdrDomainList
                    = jbEdiRcvOdrDao.searchCheckEdiOdrAddTypNxsSide(rcvOdrCompCd, transmissionDt, rtryFlg);
            } else {
                b0100EdiRcvOdrDomainList
                    = jbEdiRcvOdrDao.searchCheckEdiOdrChgTypNxsSide(rcvOdrCompCd, transmissionDt, rtryFlg);
            }
            // To reflect the check result
            // チェック結果を反映
            updateEdiOdrByNxsSideCheckResults(b0100EdiRcvOdrDomainList, rtryFlg);

            //
            //
            // Processing of error records
            // エラーレコードの処理
            //
            //

            // Register the error records to the error report
            // エラーレコードをエラーレポートへ登録
            jbEdiRcvOdrDao.createErrorReportByErrorEdi(rcvOdrCompCd, transmissionDt, addOrChgTyp, rtryFlg);

            // If it is not from re-try only
            // 持ち回りからでない場合のみ
            if (FLAG_N.equals(rtryFlg)) {
                // Register the error record to re-try
                // エラーレコードを持ち回りへ登録
                jbEdiRcvOdrDao.createEdiOdrRtryByErrorEdi(rcvOdrCompCd, transmissionDt, addOrChgTyp);
            }

            //
            //
            // Processing of normal record
            // 正常レコードの処理
            //
            //

            // Register the normal record to export order update
            // 正常レコードを輸出受注更新へ登録
            jbEdiRcvOdrDao.createExpOdrUpdBySuccessEdi(rcvOdrCompCd, transmissionDt, addOrChgTyp, rtryFlg);

            if ("ADD".equals(addOrChgTyp)) {
                // Original or Add:Registered to export order
                // オリジナル・追加：輸出受注へ登録
                jbEdiRcvOdrDao.createExpOdrByAddEdi(rcvOdrCompCd, transmissionDt, rtryFlg);
                // Update Export Formality Item No Master
                // 輸出手続品目番号原単位の品目名称を最新化
                jbEdiRcvOdrDao.updateMaItemNameByAddEdi(rcvOdrCompCd, transmissionDt, rtryFlg, cigmaAds);

            } else {
                // Order change:Update to export order
                // 発注変更：輸出受注へ更新
                jbEdiRcvOdrDao.updateExpOdrByChgEdi(rcvOdrCompCd, transmissionDt, rtryFlg);
                // Record deletion if that became the quantity 0
                // 数量0となった場合レコード削除
                jbEdiRcvOdrDao.deleteExpOdrZeroQty(rcvOdrCompCd, transmissionDt, rtryFlg);

                // Delete from re-try is not.
                // 持ち回り由来の削除はない。
                if (FLAG_N.equals(rtryFlg)) {
                    // Order delete:Delete from export order
                    // 削除：輸出受注から削除
                    jbEdiRcvOdrDao.deleteExpOdrByDelEdi(rcvOdrCompCd, transmissionDt);
                    // Delete from re-try
                    // 持ち回りからも削除
                    jbEdiRcvOdrDao.deleteEdiOdrRtryByDelEdi(rcvOdrCompCd, transmissionDt);
                }
            }

            // If from re-try only
            // 持ち回りからの場合のみ
            if (FLAG_Y.equals(rtryFlg)) {
                // Remove the normal record from re-try
                // 正常レコードを持ち回りから削除
                jbEdiRcvOdrDao.deleteEdiOdrRtryBySuccessEdi(rcvOdrCompCd, transmissionDt, addOrChgTyp);
            }
        }
    }

    /**
     * Reflection of the NEXUS side check result
     * NEXUS側チェック結果の反映
     *
     * @param b0100EdiRcvOdrDomainList Check result list
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    protected void updateEdiOdrByNxsSideCheckResults(List<? extends B0100EdiRcvOdrDomain> b0100EdiRcvOdrDomainList, String rtryFlg)
        throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting reflection result of receiving check NEXUS side.");

        // Search results line-by-line processing
        // 検索結果行単位処理
        for (B0100EdiRcvOdrDomain domain : b0100EdiRcvOdrDomainList) {

            StringBuffer lvl1ErrBuf = new StringBuffer();
            StringBuffer lvl2ErrBuf = new StringBuffer();
            StringBuffer lvl3ErrBuf = new StringBuffer();
            StringBuffer lvl3WarnBuf = new StringBuffer();

            // For Original or Add order
            // オリジナル・発注追加の場合
            if (EDI_RCV_ODR_ODR_CHG_TYP_ADD.equals(domain.getOdrChgTyp())) {

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

                // If it already exists in export orders
                // すでに輸出受注に存在する場合
                if (FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
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
            } else if (EDI_RCV_ODR_ODR_CHG_TYP_CHANGE.equals(domain.getOdrChgTyp())) {

                // If last digit change
                // 末尾変更されている場合
                if (FLAG_Y.equals(domain.getLastDigitChgFlg())) {
                    lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_26).append(",");
                } else {
                    // If you change the subject does not exist in export orders
                    // 変更対象が輸出受注に存在しない場合
                    if (!FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
                        lvl1ErrBuf.append(EDI_RCV_ODR_ERR_CD_30).append(",");
                    }
                }

                if (FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
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
                    if (!domain.getEtdDueDt().equals(domain.getOldEtdDueDt())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_24).append(",");
                        }
                    }

                    // If transportation code change
                    // 輸送区分変更の場合
                    if (!domain.getTrnsCd().equals(domain.getOldTrnsCd())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_25).append(",");
                        }
                    }

                    // If a Customer PO No. change
                    // 得意先PO No.変更の場合
                    if (!domain.getCustomerPoNo().equals(domain.getOldCustomerPoNo())) {
                        // If packing is not the unallocated
                        // 梱包未引当(梱包引当数=出荷数=ゼロ)でない場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())
                            || !BigDecimal.ZERO.equals(domain.getShippedQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_27).append(",");
                        }
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

            // For orders Delete
            // 発注削除の場合
            } else if (EDI_RCV_ODR_ODR_CHG_TYP_DELETE.equals(domain.getOdrChgTyp())) {

                // If last digit change
                // 末尾変更されている場合
                if (FLAG_Y.equals(domain.getLastDigitChgFlg())) {
                    lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_26).append(",");
                } else {
                    // If you deleted does not exist in export orders
                    // 削除対象が輸出受注に存在しない場合
                    if (!FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
                        lvl1ErrBuf.append(EDI_RCV_ODR_ERR_CD_30).append(",");
                    }
                }

                if (FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
                    // If the shipment is complete
                    // 出荷が完了している場合
                    if (domain.getPltzAllocQty().equals(domain.getOldOdrQty())) {
                        lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_21).append(",");
                    } else {
                        // If it is packed provision
                        // 梱包引当されている場合
                        if (!BigDecimal.ZERO.equals(domain.getPltzAllocQty())) {
                            lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_22).append(",");
                        }
                    }
                }

            // In the case of emergency treatment
            // 緊急処理の場合
            } else if (EDI_RCV_ODR_ODR_CHG_TYP_ERROR.equals(domain.getOdrChgTyp())) {

                // If the export orders exists
                // 輸出受注に存在する場合
                if (FLAG_Y.equals(domain.getExistExpRcvOdrFlg())) {
                    // If the received information does not match
                    // 受信した情報と一致しない場合
                    if (!(
                            domain.getCustomerPoNo().equals(domain.getOldCustomerPoNo())
                        &&  domain.getTrnsCd().equals(domain.getOldTrnsCd())
                        &&  domain.getEtdDueDt().equals(domain.getOldEtdDueDt())
                        &&  domain.getOdrFirmFlg().equals(domain.getOldOdrFirmFlg())
                        &&  domain.getOdrQty().equals(domain.getOldOdrQty())
                        &&  domain.getCustomerDueDt().equals(domain.getOldCustomerDueDt()))
                    )
                    {
                        lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_91).append(",");
                    }

                // If the export orders does not exist
                // 輸出受注に存在しない場合
                } else {
                    // 受信数量が0でない場合
                    if (!BigDecimal.ZERO.equals(domain.getOdrQty())) {
                        lvl2ErrBuf.append(EDI_RCV_ODR_ERR_CD_91).append(",");
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

            domain.setRtryFlg(rtryFlg);
        }
        // To reflect the check result to EDI re-try order or EDI order
        // チェック結果を持ち回りまたはEDI受注に反映
        jbEdiRcvOdrDao.updateEdiOdrByNxsSideCheckResults(b0100EdiRcvOdrDomainList);

        writeProgreEnd("Reflection result of receiving check NEXUS side ended.", startTime1);
    }

    /******************************************************************************************************
     * EDI-Receive-Order common check (CIGMA side)  <br />
     * EDI受注共通チェック (CIGMA側) 
     ******************************************************************************************************/
    
    /**
     *   The CIGMA side check of a [EDI-Receive-Order common check] (CIGMA) EDI Receive Order is performed.
     * <br />【EDI受注共通チェック (CIGMA)】EDI受注のCIGMA側チェックを行います。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間会社コード
     * @param transmissionDt TRANSMISSION DATE<br />情報送信日
     * @param addOrChgTyp Add or change type<br />追加・変更区分
     * @param rtryFlg Re-try flag<br/>trueの場合はEDI受注持ち回り、falseの場合はEDI受注をチェックする
     * @param cigmaAds Business date (CIGMA ADS)<br />業務日付(CIGMA ADS)
     * @return Check result
     * @throws ApplicationException When an error occurs in the invoke of Web service<br />Webサービスの呼び出しでエラーが発生した場合
     */
    protected WsB006ResultDomain checkEdiOdrCigmaSide(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg, Date cigmaAds) 
        throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting receiving check CIGMA side.");
        
        SimpleDateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // Search the data to be checked
        // チェック対象のデータを検索
        List<? extends B0100EdiRcvOdrDomain> ediOdrForCheckList 
            = jbEdiRcvOdrDao.searchCheckEdiOdrCigmaSide(rcvOdrCompCd, transmissionDt, addOrChgTyp, rtryFlg);
        
        // Parameter (details) setting
        // パラメータ(明細)の設定
        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
        for (B0100EdiRcvOdrDomain ediRcvOdr : ediOdrForCheckList) {
            WsB006ParamItemDomain paramItem = new WsB006ParamItemDomain();
            
            paramItem.setCustomerSubsidiaryCode(ediRcvOdr.getCustomerSubsidiaryCd());
            paramItem.setTransmissionDate(df.format(ediRcvOdr.getTransmissionDt()));
            paramItem.setOrderType(ediRcvOdr.getOdrTyp());
            paramItem.setSerialNo(ediRcvOdr.getSerialNo().toPlainString());
            paramItem.setCustomerNoLegacy(ediRcvOdr.getCustomerCd());
            paramItem.setShiptoNoLegacy(ediRcvOdr.getLgcyShipTo());
            paramItem.setCustomerPartNoOrg(ediRcvOdr.getCustomerItemNoOrg());
            paramItem.setOrderControlNo(ediRcvOdr.getOdrCtrlNo().toPlainString());
            paramItem.setRevisionNo(ediRcvOdr.getRevisionNo().toPlainString());
            paramItem.setRevisionNoEis(ediRcvOdr.getRevisionNoEis().toPlainString());
            paramItem.setOrderChangeType(ediRcvOdr.getOdrChgTyp());
            paramItem.setCustomerPoNo(ediRcvOdr.getCustomerPoNo());
            paramItem.setTransportationCode(ediRcvOdr.getTrnsCd());
            paramItem.setCustomerDueDate(df.format(ediRcvOdr.getCustomerDueDt()));
            paramItem.setEtdDueDate(df.format(ediRcvOdr.getEtdDueDt()));
            paramItem.setOrderFirmFlag(ediRcvOdr.getOdrFirmFlg());
            paramItem.setOrderQty(ediRcvOdr.getOdrQty().toPlainString());
            paramItem.setSupplierCode(ediRcvOdr.getSupplierCd());
            paramItem.setCustomerPlantCode(ediRcvOdr.getCustomerPlntCd());
            paramItem.setLevel1ErrorCodeList(ediRcvOdr.getLvl1ErrCdList());
            paramItem.setLevel2ErrorCodeList(ediRcvOdr.getLvl2ErrCdList());
            paramItem.setLevel3ErrorCodeList(ediRcvOdr.getLvl3ErrCdList());
            paramItem.setLevel3WarningCodeList(ediRcvOdr.getLvl3WarnCdList());
            paramItem.setErrorType("");
            
            paramItemList.add(paramItem);
        }
        
        if (!CollectionUtils.isEmpty(paramItemList)) {
            // Parameter setting
            // パラメータの設定
            WsB006ParamDomain param = new WsB006ParamDomain();
            param.setReceivingCompanyCode(rcvOdrCompCd);
            param.setCigmaAds(df.format(cigmaAds));
            param.setOrderEntryDetailList(paramItemList);
            param.setRtryFlg(rtryFlg);
            
            // The call ofWeb service
            // Webサービスの呼出し
            WsB006ResultDomain result = wsB006RestService.checkEdiOdrEntry(param);
            
            if (WS_RESULT_ERROR.equals(result.getResultCode())) {
                throw asGscmApplicationException(result.getErrorList().get(0));
            }
            
            writeProgreEnd("Receiving check CIGMA side ended.", startTime1);
            return result;
        }
        
        writeProgreEnd("Receiving check CIGMA side ended.", startTime1);
        return null;
    }
    
    /**
     * To reflect the CIGMA side check result
     * CIGMA側チェック結果を反映
     *
     * @param result Check result
     * @param rtryFlg Re-try flag
     * @throws ApplicationException Business exception
     */
    protected void updateEdiOdrByCigmaSideCheckResults(WsB006ResultDomain result, String rtryFlg)
        throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting reflection result of receiving check CIGMA side.");

        if (result == null) {
            return;
        }
        if (result.getEdiReceivingOrderList() == null) {
            return;
        }

        // checked result is reflected.
        // チェック結果を反映
        List<B0100EdiRcvOdrDomain> b0100EdiRcvOdrDomainList = new ArrayList<B0100EdiRcvOdrDomain>();
        for (WsB006ResultItemDomain resultItem : result.getEdiReceivingOrderList()) {
            B0100EdiRcvOdrDomain ediRcvOdr = new B0100EdiRcvOdrDomain();
            
            // Setting of property
            // プロパティの設定
            ediRcvOdr.setRcvOdrCompCd(result.getReceivingCompanyCode());
            ediRcvOdr.setCustomerSubsidiaryCd(resultItem.getCustomerSubsidiaryCode());
            ediRcvOdr.setTransmissionDt(parseDate(resultItem.getTransmissionDate(), WS_CIGMA_DATE_FORMAT));
            ediRcvOdr.setOdrTyp(resultItem.getOrderType());
            ediRcvOdr.setSerialNo(new BigDecimal(resultItem.getSerialNo()));
            
            ediRcvOdr.setLvl1ErrCdList(resultItem.getLevel1ErrorCodeList());
            ediRcvOdr.setLvl2ErrCdList(resultItem.getLevel2ErrorCodeList());
            ediRcvOdr.setLvl3ErrCdList(resultItem.getLevel3ErrorCodeList());
            ediRcvOdr.setLvl3WarnCdList(resultItem.getLevel3WarningCodeList());
            ediRcvOdr.setErrorTyp(resultItem.getErrorTyp());
            
            ediRcvOdr.setCustomerCd(resultItem.getCustomerNoLegacy());
            ediRcvOdr.setLgcyShipTo(resultItem.getShiptoNoLegacy());
            
            ediRcvOdr.setItemNo(resultItem.getPartNo());
            ediRcvOdr.setPkgCd(getPkgCd(resultItem.getPkgCode()));
            ediRcvOdr.setItemDescription(resultItem.getPartName());
            ediRcvOdr.setPlntCd(resultItem.getPlantCodeLegacy());
            ediRcvOdr.setShippingDt(parseDate(resultItem.getShippingDueDate(), WS_CIGMA_DATE_FORMAT));
            
            ediRcvOdr.setRtryFlg(rtryFlg);
            
            b0100EdiRcvOdrDomainList.add(ediRcvOdr);
        }
        // To reflect the check result to EDI re-try order or EDI order
        // チェック結果を持ち回りまたはEDI受注に反映
        jbEdiRcvOdrDao.updateEdiOdrByCigmaSideCheckResults(b0100EdiRcvOdrDomainList);

        writeProgreEnd("Reflection result of receiving check CIGMA side ended.", startTime1);
    }

    /******************************************************************************************************
     * ordering registration / CIGMA direct delivery ordering reflection
     * 受注登録／CIGMA直納受注反映
     ******************************************************************************************************/

    /**
     *   ordering registration / [CIGMA direct delivery ordering reflection] Export Receive Order Update is updated to the direct delivery order received F of CIGMA.
     * <br />【受注登録／CIGMA直納受注反映】輸出受注更新をCIGMAの直納受注Fに更新します。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param cigmaAds Business date (CIGMA ADS)<br />業務日付(CIGMA ADS)
     * @exception ApplicationException Business exception
     */
    protected void updateToCigmaOnTransactOderEntry(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds)
        throws ApplicationException {

        // Acquisition of an Export Receive Order Update
        // 輸出受注更新の取得
        List<? extends TtExpRcvOdrUpdDomain> expRcvOdrUpdList = searchTtExpRcvOdrUpdOnUpdateToCigma(rcvOdrCompCd);

        // Reflection to a CIGMA direct delivery order received
        // CIGMA直納受注への反映
        Date startTime1 = writeProgreStart("Starting reflection CIGMA customer order. recordCount=" + expRcvOdrUpdList.size());
        reflectToCustOdrOnUpdateToCigma(rcvOdrCompCd, expRcvOdrUpdList);
        writeProgreEnd("Reflection CIGMA customer order ended.", startTime1);
    }
    
    /**
     *   ordering registration / [CIGMA direct delivery ordering reflection (1)] Export Receive Order Update is acquired.
     * <br />【受注登録／CIGMA直納受注反映 (1)】輸出受注更新を取得します。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @return Export Receive Order Update<br />輸出受注更新
     * @throws ApplicationException When an Export Receive Order Update is not able to be acquired<br />輸出受注更新が取得できなかった場合
     */
    protected List<? extends TtExpRcvOdrUpdDomain> searchTtExpRcvOdrUpdOnUpdateToCigma(String rcvOdrCompCd)
        throws ApplicationException {
        
        TtExpRcvOdrUpdCriteriaDomain criteria = new TtExpRcvOdrUpdCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setPreferredOrder("TRANSMISSION_DT, CUSTOMER_SUBSIDIARY_CD nulls first, ODR_TYP, SERIAL_NO");
        
        return ttExpRcvOdrUpdService.searchByCondition(criteria);
    }
    
    /**
     *   The direct delivery order received F of [ordering registration / CIGMA direct delivery ordering reflection (2)] CIGMA is updated.
     * <br />【受注登録／CIGMA直納受注反映 (2)】CIGMAの直納受注Fを更新します。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param ttExpRcvOdrUpdList Export Receive Order Update<br />輸出受注更新
     * @throws ApplicationException When this is a Web service offer side and an error occurs<br />Webサービス提供側でエラーが発生した場合
     */
    protected void reflectToCustOdrOnUpdateToCigma(String rcvOdrCompCd, List<? extends TtExpRcvOdrUpdDomain> ttExpRcvOdrUpdList)
        throws ApplicationException {

        List<WsB007ParamItemDomain> paramItemList = new ArrayList<WsB007ParamItemDomain>();
        
        // Create of a parameter (details)
        // パラメータ(明細)の作成
        for (TtExpRcvOdrUpdDomain ttExpRcvOdrUpd : ttExpRcvOdrUpdList) {
            WsB007ParamItemDomain paramItem = new WsB007ParamItemDomain();
            
            // Detailed setting (ordering information)  
            // 明細の設定 (受注情報)
            paramItem.setCustomerSubsidiaryCode(ttExpRcvOdrUpd.getCustomerSubsidiaryCd());
            paramItem.setTransmissionDate(formatDate(ttExpRcvOdrUpd.getTransmissionDt()));
            paramItem.setOrderType(ttExpRcvOdrUpd.getOdrTyp());
            paramItem.setSerialNo(toPlainString(ttExpRcvOdrUpd.getSerialNo()));
            paramItem.setCustomerNoLegacy(ttExpRcvOdrUpd.getCustomerCd());
            paramItem.setShiptoNoLegacy(ttExpRcvOdrUpd.getLgcyShipTo());
            paramItem.setPartNo(ttExpRcvOdrUpd.getItemNo());
            paramItem.setPkgCode(ttExpRcvOdrUpd.getPkgCd());
            paramItem.setShippingDueDate(formatDate(ttExpRcvOdrUpd.getShippingDt()));
            paramItem.setShipInstrAllocQty(toPlainString(ttExpRcvOdrUpd.getPltzAllocQty()));
            paramItem.setShippedQty(toPlainString(ttExpRcvOdrUpd.getShippedQty()));
            paramItem.setNumberOfShipInstr(toPlainString(ttExpRcvOdrUpd.getPartialDelivCnt()));
            paramItem.setOrderQtyOrg(ttExpRcvOdrUpd.getOdrQtyOrg().toPlainString());
            paramItem.setSalesCompanyPoNo("");
            paramItem.setUpdateType(ttExpRcvOdrUpd.getUpdateTyp());
            
            // Detailed setting (front [ change ] information) 
            // 明細の設定 (変更前情報)
            paramItem.setOldCustomerDueDate(formatDate(ttExpRcvOdrUpd.getOldCustomerDueDt()));
            paramItem.setOldEtdDueDate(formatDate(ttExpRcvOdrUpd.getOldEtdDueDt()));
            paramItem.setOldOrderQty(toPlainString(ttExpRcvOdrUpd.getOldOdrQty()));
            paramItem.setOldTransportationCode(ttExpRcvOdrUpd.getOldTrnsCd());
            paramItem.setOldCustomerPoNo(ttExpRcvOdrUpd.getOldCustomerPoNo());
            paramItem.setOldOrderFirmFlag(ttExpRcvOdrUpd.getOldOdrFirmFlg());
            paramItem.setOldCustomerPartNo(ttExpRcvOdrUpd.getOldCustomerItemNo());
            
            // Detailed setting (after-change information) 
            // 明細の設定 (変更後情報)
            paramItem.setNewCustomerDueDate(formatDate(ttExpRcvOdrUpd.getNewCustomerDueDt()));
            paramItem.setNewEtdDueDate(formatDate(ttExpRcvOdrUpd.getNewEtdDueDt()));
            paramItem.setNewOrderQty(toPlainString(ttExpRcvOdrUpd.getNewOdrQty()));
            paramItem.setNewTransportationCode(ttExpRcvOdrUpd.getNewTrnsCd());
            paramItem.setNewCustomerPoNo(ttExpRcvOdrUpd.getNewCustomerPoNo());
            paramItem.setNewOrderFirmFlag(ttExpRcvOdrUpd.getNewOdrFirmFlg());
            paramItem.setNewCustomerPartNo(ttExpRcvOdrUpd.getNewCustomerItemNo());
            
            paramItemList.add(paramItem);
        }
        
        if (!CollectionUtils.isEmpty(paramItemList)) {
            // Create of a parameter
            // パラメータの作成
            WsB007ParamDomain param = new WsB007ParamDomain();
            param.setReceivingCompanyCode(rcvOdrCompCd);
            param.setExpRcvOdrUpdateList(paramItemList);
            
            // The invoke of Web service
            // Webサービスの呼び出し
            ResultDomain result = wsB007RestService.reflectToCusOdr(rcvOdrCompCd, param);
            
            if (WS_RESULT_ERROR.equals(result.getResultCode())) {
                throw asGscmApplicationException(result.getErrorList().get(0));
            }
        }
    }
    
    /******************************************************************************************************
     * Error report output<br />
     * エラーレポート出力 
     ******************************************************************************************************/
    
    /**
     *   An error detailed list is outputted about the order received which became an error with the [error report output] registration check.
     * <br />【エラーレポート出力】登録チェックでエラーとなった受注について、エラー明細帳票を出力します。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param cigmaAds Business date (CIGMA ADS)<br />業務日付(CIGMA ADS)
     * @exception ApplicationException Business exception
     */
    protected void transactErrReportOutput(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds)
        throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting creation error report PDF.");

        int fileCount = 0;
        int recordCount = searchCountErrorOnTransactErrReportOutput(rcvOdrCompCd);
        // When there is an EDI-Receive-Order error
        // EDI受注エラーがある場合
        if (0 < recordCount) {
            // 得意先、LEGACY送荷先、製造部工場区分、情報発信日単位でエラーレポートを印刷
            for (TtEdiRcvOdrReportDomain header : searchEdiRcvOdrReportHeader(rcvOdrCompCd)) {
                // A create of EDI Receive Order Error Report
                // EDI受注エラーレポートの作成
                File pdf = lb001ReportService.searchOdrRcv(
                    rcvOdrCompCd,
                    header.getCustomerSubsidiaryCd(),
                    header.getTransmissionDt(),
                    header.getCustomerCd(),
                    header.getLgcyShipTo(),
                    header.getPlntCd(),
                    cigmaAds,
                    searchResource(rcvOdrCompCd, REPORT_DATE_FORMAT)
                );

                // Rename.
                // リネーム
                File destPdf = new File(pdf.getParent(),
                    String.format(
                        "LB001%s%s%s%s%s.pdf",
                        rcvOdrCompCd,
                        StringUtil.rPad(StringUtil.getEmptyToBlank(header.getPlntCd()), 2, '_'),
                        StringUtil.rPad(StringUtil.getEmptyToBlank(header.getCustomerCd()), 8, '_'),
                        StringUtil.rPad(StringUtil.getEmptyToBlank(header.getLgcyShipTo()), 2, '_'),
                        new SimpleDateFormat("'D'yyMMdd'T'HHmmssSSS").format(new Date())
                    )
                );
                if (!pdf.renameTo(destPdf)) {
                    throw new ApplicationException(NXS_91_0001);
                }

                // The output of EDI Receive Order Error Report
                // EDI受注エラーレポートの出力
                for (String printerNm : jbEdiRcvOdrDao.searchPrinterForErrReport(rcvOdrCompCd, header.getPlntCd())) {
                    commonService.printPdf(destPdf, 1, printerNm);
                }

                fileCount++;
            }
        }

        writeProgreEnd("Creation error report PDF ended. recordCount=" + recordCount
            + " fileCount=" + fileCount, startTime1);
    }
    
    /**
     *   The number of a [error report output (1)] EDI Receive Order Error Report is acquired.
     * <br />【エラーレポート出力 (1)】EDI受注エラーレポートの件数を取得します。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @return The number of an EDI Receive Order Error Report<br />EDI受注エラーレポートの件数
     * @throws ApplicationException When the number of an EDI Receive Order Error Report is unacquirable<br/> EDI受注エラーレポートの件数が取得できない場合
     */
    protected int searchCountErrorOnTransactErrReportOutput(String rcvOdrCompCd) throws ApplicationException {
        TtEdiRcvOdrReportCriteriaDomain criteria = new TtEdiRcvOdrReportCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setSearchCountCheckFlg(false);
        
        return ttEdiRcvOdrReportService.searchCount(criteria);
    }
    
    /**
     * [error report output (2)] Get EDI Error Report Header
     * <br />【エラーレポート出力 (2)】EDI受注エラーレポートのヘッダ情報を取得します。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @return EDI Error Report Header<br />EDI受注エラーレポートのヘッダ
     * @throws ApplicationException When EDI Error Report Header is not able to be acquired<br/> EDI受注エラーレポートのヘッダ情報が取得できない場合
     */
    protected List<? extends TtEdiRcvOdrReportDomain> searchEdiRcvOdrReportHeader(String rcvOdrCompCd) throws ApplicationException {
        TtEdiRcvOdrReportCriteriaDomain criteria = new TtEdiRcvOdrReportCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        
        return jbEdiRcvOdrDao.searchEdiRcvOdrReportHeader(criteria);
    }
    
    /******************************************************************************************************
     * Unofficial announcement ordering reexamination<br />
     * 内示受注見直し 
     ******************************************************************************************************/
    
    /**
     *   The number of unofficial announcement orders received which passed over the [number reexamination of unofficial announcement orders received] SHIPPING DATE is set to 0.
     * <br />【内示受注数見直し】出荷予定日を過ぎた内示受注数を0にします。
     *
     * @param req  Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param cigmaAds Business date (CIGMA ADS)<br />業務日付(CIGMA ADS)
     * @exception ApplicationException Business exception
     */
    protected void transactOdrQtyRevise(ResidentRequestDomain req, String rcvOdrCompCd, Date cigmaAds)
        throws ApplicationException {

        Date startTime1 = writeProgreStart("Starting adjustment forecast QTY.");

        // Setting of a search condition
        // 検索条件の設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        criteria.setRcvOdrCompCd(rcvOdrCompCd);
        criteria.setOdrFirmFlg(FLAG_N);
        criteria.setPltzAllocQty(BigDecimal.ZERO);
        criteria.setShippedQty(BigDecimal.ZERO);
        criteria.setShippingDtLessThanEqual(cigmaAds);

        // Setting of an Export Receive Order
        // 輸出受注の設定
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setOdrQty(BigDecimal.ZERO);

        // Setting of common property
        // 共通プロパティの設定
        commonService.setCommonPropertyForUpdate(ttExpRcvOdr, JOB_ID_B0100);

        // Update of an Export Receive Order
        // 輸出受注の更新
        jbEdiRcvOdrDao.updateTtExpRcvOdrForReviseOdrQty(ttExpRcvOdr, criteria);

        writeProgreEnd("Adjustment forecast QTY ended.", startTime1);
    }
    
    /******************************************************************************************************
     * Job terminating notice<br />
     * ジョブ終了通知 
     ******************************************************************************************************/
    
    /**
     *   The end of a job is notified to a [job terminating notice] CIGMA night batch.
     * <br />【ジョブ終了通知】CIGMA夜間バッチにジョブの終了を通知します。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param jobStatus Job status<br />ジョブステータス
     * @param callerJobId source job ID<br />呼び出し元ジョブID
     * @throws ApplicationException When an error occurs in a terminating notice<br />終了通知でエラーが発生した場合
     */
    protected void transactJobEndNotice(ResidentRequestDomain req, String rcvOdrCompCd, String jobStatus, String callerJobId) 
        throws ApplicationException {
        
        Date startTime1 = writeProgreStart("Starting notification of job status. jobStatus=" + jobStatus);

        ResultDomain result = wsB020RestService.updateEdiRcvOdrStatus(rcvOdrCompCd, jobStatus, callerJobId);

        if (WS_RESULT_ERROR.equals(result.getResultCode())) {
            throw asGscmApplicationException(result.getErrorList().get(0));
        }

        writeProgreEnd("Notification of job status ended.", startTime1);
    }
    
    /******************************************************************************************************
     * In addition to this<br />
     * その他 
     ******************************************************************************************************/
    
    /**
     * Analyze the date.
     * <br />日付の解析を行います。
     *
     * @param date The date character string of an analytical object<br />解析対象の日付文字列
     * @param format Date format<br />日付フォーマット
     * @return Analysis result<br />解析結果
     * @throws ApplicationException When the analysis of the date goes wrong<br />日付の解析に失敗した場合
     */
    protected Date parseDate(String date, String format) throws ApplicationException {
        try {
            if (date == null) {
                return null;
            }
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            throw new ApplicationException(NXS_91_0001, e);
        }
    }
    
    /**
     * Acquire the batch parameter to a REQUEST ID.
     * <br />リクエストIDに対するバッチパラメータを取得します。
     *
     * @param req Request information of a request batch (the permanent residence version)<br />リクエストバッチ（常駐版）のリクエスト情報
     * @return Batch parameter map<br />バッチパラメータのマップ
     * @throws ApplicationException When a batch parameter is unacquirable<br />バッチパラメータを取得できない場合
     */
    protected Map<String, String> searchBatchReqParam(ResidentRequestDomain req) throws ApplicationException {
        
        // Setting of a search condition
        // 検索条件の設定
        TtBatchReqParamCriteriaDomain criteria = new TtBatchReqParamCriteriaDomain();
        criteria.setRequestId(req.getRequestId());
        criteria.setPreferredOrder("PARAM_NO");
        
        // Acquisition of a search condition
        // 検索条件の取得
        //return ttBatchReqParamService.searchByCondition(criteria);
        List<TtBatchReqParamDomain> resultDomainList = ttBatchReqParamService.searchByCondition(criteria);
        Map<String, String> paramMap = new HashMap<String, String>();
        for (TtBatchReqParamDomain resultDomain : resultDomainList) {
            paramMap.put(resultDomain.getParamNm(), resultDomain.getParamVal());
        }
        return paramMap;
    }
    
    /**
     * Create GscmApplicationException from the error of Web service.
     * <br />WebサービスのエラーからGscmApplicationExceptionを作成します。
     *
     * @param errorListItem The error of Web service<br />Webサービスのエラー
     * @return Created GscmApplicationException<br />作成したGscmApplicationException
     */
    protected GscmApplicationException asGscmApplicationException(ErrorListItemDomain errorListItem) {
        return new GscmApplicationException(
            errorListItem.getErrorCode(), 
            errorListItem.getErrorParamList().toArray());
    }
    
    /**
     * Acquire a packing CD.
     * <br />包装コードを取得します。
     *
     * @param pkgCd Packing CD<br />包装コード
     * @return Packing CD (this is one space when pkgCd is a blank (""))  <br />包装コード (pkgCdがブランク("")の場合、スペース1つ)
     */
    protected String getPkgCd(String pkgCd) {
        if (StringUtils.isEmpty(pkgCd)) {
            return " ";
        } else {
            return pkgCd;
        }
    }
    
    /**
     * Acquire a LOCALE KEY from the NXS company master of an ordering company.
     * <br />受注会社のNXS会社原単位からロケールキーを取得します。
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @return The LOCALE KEY of an ordering company<br />受注会社のロケールキー
     * @throws ApplicationException When a NXS company master is not able to be acquired<br />NXS会社原単位が取得できなかった場合
     */
    protected String searchLocale(String rcvOdrCompCd) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(rcvOdrCompCd);
        
        // Acquisition of a NXS company master
        // NXS会社原単位の取得
        TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(criteria);
        
        // Create of a LOCALE KEY
        // ロケールキーの作成
        return tmNxsComp.getLngCd() + "_" + tmNxsComp.getCntryCd();
    }
    
    /**
     * Acquire the resource value of an ordering company.
     * <br />受注会社のリソース値を取得します
     *
     * @param rcvOdrCompCd The CD between bases of an ordering company<br />受注会社の拠点間コード
     * @param resourceKey RESOURCE KEY<br />リソースキー
     * @return Acquired resource value (if there is nothing null) <br />取得したリソース値 (なければnull)
     * @throws ApplicationException When a resource master is not able to be acquired<br />リソースマスタが取得できなかった場合
     */
    protected String searchResource(String rcvOdrCompCd, String resourceKey) throws ApplicationException {

        for (String localeKey : new String[] { searchLocale(rcvOdrCompCd), "default" } ) {
            TmResourcesCriteriaDomain tmResourcesCriteria = new TmResourcesCriteriaDomain();
            tmResourcesCriteria.setLocaleKey(localeKey);
            tmResourcesCriteria.setResourceKey(resourceKey);
            
            TmResourcesDomain tmResources = tmResourcesService.searchByKey(tmResourcesCriteria);
            
            if (tmResources != null) {
                return tmResources.getValue();
            }
        }
        return null;
    }

    /**
     * Format the date by {@link Eca0027Constants#WS_CIGMA_DATE_FORMAT}.
     * <br />日付を{@link Eca0027Constants#WS_CIGMA_DATE_FORMAT}でフォーマットします。
     *
     * @param date The date for a format<br />フォーマット対象の日付
     * @return The result of a format (this is null in the case of date == null)<br />フォーマットの結果 (date == nullの場合はnull)
     */
    protected String formatDate(Date date) {
        if (date == null) {
            return null;
        } else {
            return new SimpleDateFormat(WS_CIGMA_DATE_FORMAT).format(date);
        }
    }
    
    /**
     * Change BigDecimal into a string.
     * <br />BigDecimalを文字列に変換します。
     *
     * @param value The VALUE for a converted<br />変換対象の値
     * @return Result changed into the string (this is null in the case of value == null) <br />文字列に変換した結果 (value == nullの場合はnull)
     */
    protected String toPlainString(BigDecimal value) {
        if (value == null) {
            return null;
        } else {
            return value.toPlainString();
        }
    }
    
    /**
     * String to BigDecimal.
     *
     * IN152 ADD
     *
     * @param s number string
     * @return if parameter is null then null, else parsing parameter.
     */
    protected BigDecimal toBigDecimal(String s) {
        if (CheckUtil.isBlankOrNull(s)) {
            return null;
        }
        return new BigDecimal(s);
    }
    
    // Below, Progress information log output support.
    
    /**
     * Progress information log output.
     *
     * @param message message
     */
    protected void writeProgre(String message) {
        LOG.info("##Progre " + message);
    }

    /**
     * Progress information start log output.
     *
     * @param message message
     * @return start time
     */
    protected Date writeProgreStart(String message) {
        Date startTime = new Date();
        LOG.info("##Progre start. " + message);
        return startTime;
    }
    
    /**
     * Progress information end log output.
     *
     * @param message message
     * @param startTime start time
     */
    protected void writeProgreEnd(String message, Date startTime) {
        Date endTime = new Date();
        String diffTime = DurationFormatUtils.formatPeriod(startTime.getTime(), endTime.getTime(), "HH:mm:ss");
        LOG.info("##Progre end. Execution Time: [" + diffTime + "] " + message);
    }
}
