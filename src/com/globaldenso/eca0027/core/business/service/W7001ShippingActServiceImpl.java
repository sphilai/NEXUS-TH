/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_FULL_CONTAINER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_CO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_NON_WOODEN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_OTHERS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.KEY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0026;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0028;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0043;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0046;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W7001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKQ_QTY_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROCESS_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_SHIPPING_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_ALL_DOC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_BILLD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_CLP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_SHIPPING_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_REQ_REC_STATUS_NOT_YET;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_TRUCK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_SHIPPING_ACT_INVOICE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_PARAM_DELIM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.FileManagementException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementCriterionDomain;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtOnlineReqJobParamService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService;
import com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService;
import com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActItemDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws7001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws7002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws7003RestService;
import com.globaldenso.eca0027.core.business.ws.Ws7004RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * 
 * Implement class of Shipping Actuality service.
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15139 $
 */
public class W7001ShippingActServiceImpl implements W7001ShippingActService {

    /**
     * Shipping Actuality Dao.<br />
     * 船積実績Dao
     */
    protected W7001ShippingActDao w7001ShippingActDao;
    
    /**
     * common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * User function use authorization service.<br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected TtShippingActService ttShippingActService;
    
    /**
     * Invoice Service.<br />
     * インボイス サービス
     */
    protected TtInvoiceService ttInvoiceService;
    
    /**
     * Shipping Actuality Invoice Work Service.<br />
     * 船積実績対象インボイスワーク サービス
     */
    protected TwShippingActInvoiceService twShippingActInvoiceService;
    
    /**
     * Shipping Document Service.<br />
     * 船積書類 サービス
     */
    protected TtShippingDocumentService ttShippingDocumentService;
    
    /**
     * Shipping Actuality Receive Order Service.<br />
     * 船積実績対象品受注情報 サービス
     */
    protected TtShippingActOdrService ttShippingActOdrService;
    
    /**
     * Service form (L7001).<br />
     * 帳票サービス（L7001）
     */
    protected L7001ReportService l7001ReportService;
    
    /**
     * File Manage Service.<br />
     * ファイル管理 サービス
     */
    protected FileManagementService fileManagerServiceForStream;
    
    /**
     * Web Service (W7001) call service.<br />
     * Webサービス（W7001）呼出しサービス
     */
    protected Ws7001RestService ws7001RestService;
    
    /**
     * Web Service (W7002) call service.<br />
     * Webサービス（W7002）呼出しサービス
     */
    protected Ws7002RestService ws7002RestService;
    
    /**
     * Web Service (W7003) call service.<br />
     * Webサービス（W7003）呼出しサービス
     */
    protected Ws7003RestService ws7003RestService;
    
    /**
     * Web Service (W7004) call service.<br />
     * Webサービス（W7004）呼出しサービス
     */
    protected Ws7004RestService ws7004RestService;
    
    /**
     * Nexus Company Service.<br />
     * NEXUS会社マスタ サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Palletize Service.<br />
     * パレタイズ サービス
     */
    protected TtPltzService ttPltzService;
    
    /**
     * TtOnlineReqJobParam Service<br />
     * TtOnlineReqJobParam サービス
     */
    protected TtOnlineReqJobParamService ttOnlineReqJobParamService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActServiceImpl() {
        super();
    }
    
    /**
     * Setter method for w7001ShippingActDao.
     *
     * @param shippingActDao Set for w7001ShippingActDao
     */
    public void setW7001ShippingActDao(W7001ShippingActDao shippingActDao) {
        w7001ShippingActDao = shippingActDao;
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for ttShippingActService.
     *
     * @param ttShippingActService Set for ttShippingActService
     */
    public void setTtShippingActService(TtShippingActService ttShippingActService) {
        this.ttShippingActService = ttShippingActService;
    }

    /**
     * Setter method for ttInvoiceService.
     *
     * @param ttInvoiceService Set for ttInvoiceService
     */
    public void setTtInvoiceService(TtInvoiceService ttInvoiceService) {
        this.ttInvoiceService = ttInvoiceService;
    }

    /**
     * Setter method for twShippingActInvoiceService.
     *
     * @param twShippingActInvoiceService Set for twShippingActInvoiceService
     */
    public void setTwShippingActInvoiceService(
        TwShippingActInvoiceService twShippingActInvoiceService) {
        this.twShippingActInvoiceService = twShippingActInvoiceService;
    }

    /**
     * Setter method for ttShippingDocumentService.
     *
     * @param ttShippingDocumentService Set for ttShippingDocumentService
     */
    public void setTtShippingDocumentService(
        TtShippingDocumentService ttShippingDocumentService) {
        this.ttShippingDocumentService = ttShippingDocumentService;
    }

    /**
     * Setter method for ttShippingActOdrService.
     *
     * @param ttShippingActOdrService Set for ttShippingActOdrService
     */
    public void setTtShippingActOdrService(
        TtShippingActOdrService ttShippingActOdrService) {
        this.ttShippingActOdrService = ttShippingActOdrService;
    }

    /**
     * Setter method for l7001ReportService.
     *
     * @param reportService Set for l7001ReportService
     */
    public void setL7001ReportService(L7001ReportService reportService) {
        l7001ReportService = reportService;
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
     * Setter method for ws7001RestService.
     *
     * @param ws7001RestService Set for ws7001RestService
     */
    public void setWs7001RestService(Ws7001RestService ws7001RestService) {
        this.ws7001RestService = ws7001RestService;
    }

    /**
     * Setter method for ws7002RestService.
     *
     * @param ws7002RestService Set for ws7002RestService
     */
    public void setWs7002RestService(Ws7002RestService ws7002RestService) {
        this.ws7002RestService = ws7002RestService;
    }

    /**
     * Setter method for ws7003RestService.
     *
     * @param ws7003RestService Set for ws7003RestService
     */
    public void setWs7003RestService(Ws7003RestService ws7003RestService) {
        this.ws7003RestService = ws7003RestService;
    }

    /**
     * Setter method for ws7004RestService.
     *
     * @param ws7004RestService Set for ws7004RestService
     */
    public void setWs7004RestService(Ws7004RestService ws7004RestService) {
        this.ws7004RestService = ws7004RestService;
    }
    
    /**
     * <p>tmNxsCompService のセッターメソッドです。</p>
     *
     * @param tmNxsCompService tmNxsCompService に設定する
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * <p>ttPltzService のセッターメソッドです。</p>
     *
     * @param ttPltzService ttPltzService に設定する
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * <p>ttOnlineReqJobParamService のセッターメソッドです。</p>
     *
     * @param ttOnlineReqJobParamService ttOnlineReqJobParamService に設定する
     */
    public void setTtOnlineReqJobParamService(
        TtOnlineReqJobParamService ttOnlineReqJobParamService) {
        this.ttOnlineReqJobParamService = ttOnlineReqJobParamService;
    }

    // --- parameter check methods --
    // --- パラメータチェックメソッド validateConsistency ------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyAtdEta(String, String, String)
     */
    public boolean validateConsistencyAtdEta(String atd, String etd, String dateFormat) {
        if (!CheckUtil.isBlankOrNull(atd) && !CheckUtil.isBlankOrNull(etd)) {
            return commonService.validateFromToDate(dateFormat, atd, etd);
        } else {
            return true;
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyFileExistence(int)
     */
    public boolean validateConsistencyFileExistence(int fileSize) {
        if (fileSize == 0) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyFilePathInput(String)
     */
    public boolean validateConsistencyFilePathInput(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            return false;
        }
        return true;  
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyFileSize(int)
     */
    public boolean validateConsistencyFileSize(int fileSize) {
        if (FILE_SIZE_MAX < fileSize) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyFileName(String)
     */
    public boolean validateConsistencyFileName(String fileName)
        throws ApplicationException {
        try {
            if (fileName.getBytes("UTF-8").length == fileName.length()) {
                return true;
            }
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001, e);
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateConsistencyShipperAuth(String)
     */
    public boolean validateConsistencyShipperAuth(String compCd) throws ApplicationException {
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W7001R, compCd);
    }
    // --- database check methods ---
    // --- データベースチェックメソッド validateDatabase -------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseCigmaAvailable(boolean, String, String, Date, String)
     */
    public String  validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String shipperCd, String invoiceNo, Date invoiceIssueDt, String dateFormat)
        throws ApplicationException {
// UT453 DEL START
//        try {
//            commonService.searchCigmaNightFlg(shipperCd);
//            //SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//            TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
//            ttInvoiceCriteria.setShipperCd(shipperCd);
//            ttInvoiceCriteria.setInvoiceNo(invoiceNo);
//            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
//            //try {
//            //    ttInvoiceCriteria.setInvoiceIssueDt(sdf.parse(invoiceIssueDt));
//            //} catch (ParseException e) {
//            //    return NXS_E1_0060;
//            //}
//            ttInvoiceCriteria.setInvoiceIssueDt(invoiceIssueDt);
//            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
//            ttInvoiceCriteria.setCmlTyp(CML_TYPE_CIGMA);
//            
//            List<? extends TtInvoiceDomain> ttInvoiceDomainList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);
//            // Check list size as zero
//            if (0 == ttInvoiceDomainList.size()) {
//                return null;
//            }
//            
//            if (!commonService.searchCigmaAvailable(isShipping24hFunc, shipperCd)) {
//                return NXS_E1_0060;
//            } else {
//                return null;
//            }
//        } catch (SystemException e) {
//            if (e.getCode().equals(GSCM_E0_0001)){
//                return NXS_E7_0075;
//            }
//            throw e;
//        }
// UT453 DEL END

        // UT453 ADD START
        // The return value of this method are as follows.
        // Not CIGMA parts: null(Check OK)
        // During CIGMA night batch: "NXS-E1-0060"(check NG)
        // Other than the above: null(Check OK)
        // このメソッドの戻り値は次のとおり。
        // CIGMA品でない：：null（チェックOK）
        // CIGMA夜間バッチ中："NXS-E1-0060"（チェックNG）
        // 上記以外：null（チェックOK）

        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setShipperCd(shipperCd);
        ttInvoiceCriteria.setInvoiceNo(invoiceNo);
        ttInvoiceCriteria.setInvoiceIssueDt(invoiceIssueDt);
        ttInvoiceCriteria.setCmlTyp(CML_TYPE_CIGMA);
        List<? extends TtInvoiceDomain> ttInvoiceDomainList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);
        if (ttInvoiceDomainList.size() == 0) {
            return null;
        }

        if (!commonService.searchCigmaAvailable(isShipping24hFunc, shipperCd)) {
            return NXS_E1_0060;
        }

        return null;
        // UT453 ADD END
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseCarrier(java.lang.String)
     */
    public boolean validateDatabaseCarrier(String compCd) throws ApplicationException {
        return commonService.validateCarrier(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException {
        return commonService.validateShipper(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseCompCd(java.lang.String)
     */
    public boolean validateDatabaseCompCd(String compCd) throws ApplicationException {
        return commonService.validateCompCd(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseConsignee(java.lang.String)
     */
    public boolean validateDatabaseConsignee(String compCd)
        throws ApplicationException {
        return commonService.validateConsignee(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseFileManager(String, FileManagementDomain)
     */
    public boolean validateDatabaseFileManager(String fileId, FileManagementDomain fileDomain)
        throws ApplicationException {
        
        // Get data linked the file id.
        // ファイル管理からファイルIDに紐付くデータを取得
        FileManagementDomain domain;
        try {
            domain = fileManagerServiceForStream.searchFileDownload(fileId, false, null);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileDomain == null){
            return false;
        }

        fileDomain.setFileId(domain.getFileId());
        fileDomain.setLastUpdateDate(domain.getLastUpdateDate());
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)
     */
    public boolean validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain docDomain) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActDocCriteria = new W7001ShippingActCriteriaDomain();
        shippingActDocCriteria.setFileId(docDomain.getFileId());
        // Get FILE ID corresponding to the search criteria. 
        // 船積書類件数チェック
        if (w7001ShippingActDao.searchTtShippingDocumentByFileId(shippingActDocCriteria).isEmpty()) {
            // 他の船積書類に紐付いているため、ファイル管理テーブルの削除対象外
            return true;
        } else {
            docDomain.setDeleteFlag(FLAG_Y);
        }
        
        FileManagementDomain fileDomain;
        try {
            fileDomain = fileManagerServiceForStream.searchFileDownload(docDomain.getFileId(), false, null);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileDomain == null){
            return false;
        }
        
        docDomain.setComUpdateTimestamp(fileDomain.getLastUpdateDate());
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseOfRegisterPringClp(String, OutputStream)
     */
    public boolean validateDatabaseOfRegisterPringClp(String shippingActNo, OutputStream fileData) 
        throws ApplicationException {

        String preferredOrder = "CLP_FILE_ID";
        // Get Shipping Actuality. 
        // 船積実績検索
        List<? extends TtShippingActDomain> shippingActList = getShippingActDomain(shippingActNo, preferredOrder);
        if (shippingActList.isEmpty() || StringUtils.isEmpty(shippingActList.get(0).getClpFileId())) {
            return false;
        }

        try {
            fileManagerServiceForStream.searchFileDownload(shippingActList.get(0).getClpFileId(), true, fileData);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e1) {
            return false;
        }
  
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseShippingActStatus(boolean, String, String, String, String, StringBuffer)
     */
    public String validateDatabaseShippingActStatus(boolean isShipping24hFunc, String compCd, String trnsCd, String dscId, String procMode, StringBuffer cigmaEdiStatus) 
        throws ApplicationException {
        // Get Invoice corresponding to the search criteria. 
        // 更新対象インボイスNoの取得
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setDscId(dscId);
        List<? extends W7001ShippingActInvoiceDomain> resultList = w7001ShippingActDao.searchTtInvoice(shippingActCriteria);
        // Check-through if you do not include CIGMA items.
        // CIGMA品を含まない場合チェックスルー。
        if(resultList.isEmpty()) {
            return null;
        }
        // It examines whether it includes a deletion instruction.
        // 削除指示を含むかを調査しておく。
        // 20170314 ADD
        String containsDelFlg = FLAG_N;
        for (W7001ShippingActInvoiceDomain invoice : resultList) {
            if (FLAG_Y.equals(invoice.getInvoiceDelFlg())) {
                containsDelFlg = FLAG_Y;
                break;
            }
        }

        // UT453 DEL START
        // Get the availability of CIGMA.
        // CIGMAの夜間バッチ中チェック
        //if (commonService.searchCigmaAds(compCd) == null) {
        //    return NXS_E7_0075;
        //}
        //if (!commonService.searchCigmaAvailable(isShipping24hFunc, compCd)) {
        //    return NXS_E1_0060;
        //}
        // UT453 DEL END

        // UT453 ADD START
        // The return value of this method are as follows.
        // Supplier shipper (TM_CIGMA_ENV does not exist): null(Check OK)
        // During CIGMA night batch: "NXS-E1-0060"(check NG)
        // Shipping Actuality data that has been already sent to importer: "NXS-E1-0016"(check NG)
        // Other than the above: null(Check OK)
        // このメソッドの戻り値は次のとおり。
        // 仕入れ先シッパー（TM_CIGMA_ENVが存在しない）：null（チェックOK）
        // CIGMA夜間バッチ中："NXS-E1-0060"（チェックNG）
        // EDI連携済み："NXS-E1-0016"（チェックNG）
        // 上記以外：null（チェックOK）
        boolean accessOk = false;
        try {
            accessOk = commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E7_0075)) {
                return null;
            }
        }
        if (!accessOk) {
            return NXS_E1_0060;
        }
        // UT453 ADD END

        // Call Web service cooperation to CIGMA (CIGMA SHIPPING ACTUALITY STATUS check). 
        // Webサービス「CIGMA船積実績ステータスチェック」の呼び出し
        if(MODE_EDIT.equals(procMode)) {
            //return callWebService7002(compCd, resultList, trnsCd);
            String resultCigmaEdiStatus = callWebService7002(compCd, resultList, trnsCd);
            if (cigmaEdiStatus != null) {
                cigmaEdiStatus.append(resultCigmaEdiStatus);
            }
            // Includes deletion instruction but it is an error if EDI linkage is already done.
            // 削除指示を含むが既にEDI連携済みの場合エラーとする。
            // 20170314 ADD
            if (FLAG_Y.equals(containsDelFlg) && "2".equals(resultCigmaEdiStatus)) {
                return NXS_E1_0016;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtInvoice(String, String, Date)
     */
    public boolean validateDatabaseTtInvoice(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        // Lock the Invoice in the search condition and gets the data. 
        // インボイスをロック
        List<? extends W7001ShippingActInvoiceDomain> invoiceList;
        try {
            invoiceList = w7001ShippingActDao.lockByNoWaitTtInvoice(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (invoiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtInvoiceOnRegister(String, String, Date, String[])
     */
    public boolean validateDatabaseTtInvoiceOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] cmlTyp) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActCriteria.setCancelFlg(FLAG_N);
        // Lock the Invoice in the search condition and gets the data. 
        // インボイスをロック
        List<? extends W7001ShippingActInvoiceDomain> invoiceList ;
        try {
            invoiceList = w7001ShippingActDao.lockByNoWaitTtInvoice(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (invoiceList.isEmpty()) {
            return false;
        }
        
        cmlTyp[0] = invoiceList.get(0).getCmlTyp();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterCancel(W7001ShippingActCriteriaDomain)
     */
    public boolean validateDatabaseTtInvoiceOnRegisterCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        // Lock the Invoice in the search condition and gets the data. 
        // インボイスをロック
        List<? extends W7001ShippingActInvoiceDomain> invoiceList;
        try {
            invoiceList = w7001ShippingActDao.lockByNoWaitTtInvoice(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (invoiceList.isEmpty()) {
            return false;
        }
        criteria.setShippingActInvoiceList(invoiceList);
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterChangeStatus(String, String)
     */
    public boolean validateDatabaseTtInvoiceOnRegisterChangeStatus(String shipperCd, String invoiceNo) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        // Lock the Invoice in the search condition and gets the data. 
        // インボイスをロック
        List<? extends W7001ShippingActInvoiceDomain> invoiceList;
        try {
            invoiceList = w7001ShippingActDao.lockByNoWaitTtInvoice(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (invoiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOdrOnRegister(String, String, String, Date, boolean, String[])
     */
    public boolean validateDatabaseTtShippingActOdrOnRegister(String shippingActNo, String shipperCd, String invoiceNo, Date invoiceIssueDt, boolean checkCount, String[] lockFlag) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(shippingActNo);
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        // Lock the Shipping Actuality Receive Order in the search condition and gets the data. 
        // 船積実績対象品受注情報をロック

        List<? extends W7001ShippingActOdrDomain> shippingActOdrList =  w7001ShippingActDao.lockByNoWaitTtShippingActOdr(shippingActCriteria);
        if (checkCount && shippingActOdrList.isEmpty()) {
            return false;
        }
        lockFlag[0] = FLAG_Y;
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOdrOnRegisterCancel(String, boolean, String[])
     */
    public boolean validateDatabaseTtShippingActOdrOnRegisterCancel(String shippingActNo, boolean checkCount, String[] lockFlag) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(shippingActNo);
        // Lock the Shipping Actuality Receive Order in the search condition and gets the data. 
        // 船積実績対象品受注情報をロック
        List<? extends W7001ShippingActOdrDomain> shippingActOdrList = w7001ShippingActDao.lockByNoWaitTtShippingActOdr(shippingActCriteria);

        if (checkCount && shippingActOdrList.isEmpty()) {
            return false;
        }
        if (shippingActOdrList.isEmpty()) {
            lockFlag[0] = FLAG_N;
        } else {
            lockFlag[0] = FLAG_Y;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnBlUpload(String)
     */
    public boolean validateDatabaseTtShippingActOnBlUpload(String shippingActNo)
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(shippingActNo);
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
        List<? extends W7001ShippingActDomain> resultDomainList;
        
        try {
            resultDomainList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (resultDomainList.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnBlUploadCancel(W7001ShippingActCriteriaDomain)
     */
    public boolean validateDatabaseTtShippingActOnBlUploadCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        shippingActCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
        List<? extends W7001ShippingActDomain> resultDomainList;

        try {
            resultDomainList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (resultDomainList.isEmpty()) {
            return false;
        }

        List<String> billdFileIdList = new ArrayList<String>();
        for(W7001ShippingActDomain resultDomain : resultDomainList) {
            billdFileIdList.add(resultDomain.getBilldFileId());
        }
        
        criteria.setBilldFileIdList(billdFileIdList);
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnBlUploadView(String, OutputStream)
     */
    public boolean validateDatabaseTtShippingActOnBlUploadView(String shippingActNo, OutputStream fileData)
        throws ApplicationException {
        // Get Shipping Actuality. 
        // 船積実績の検索
        List<? extends TtShippingActDomain> shippingActList = getShippingActDomain(shippingActNo, null);
        if(shippingActList.isEmpty()) {
            return false;
        }
        
        try {
            fileManagerServiceForStream.searchFileDownload(shippingActList.get(0).getBilldFileId(), true, fileData);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileData == null) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(String)
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
        List<? extends W7001ShippingActDomain> resultDomainList;
        try {
            resultDomainList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        
        if (resultDomainList.isEmpty()) {
            return false;
        }
        List<String> billdFileIdList = new ArrayList<String>();
        for(W7001ShippingActDomain resultDomain : resultDomainList) {
            if (!StringUtils.isEmpty(resultDomain.getBilldFileId())) {
                billdFileIdList.add(resultDomain.getBilldFileId());
            }
        }
        criteria.setBilldFileIdList(billdFileIdList);
        criteria.setClpGroup(resultDomainList.get(0).getClpGroup());
        criteria.setContainerLooseTyp(resultDomainList.get(0).getContainerLooseTyp());
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel(String, String, Date, String[])
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] fileId) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActCriteria.setDocTyp(DOC_TYP_CO);
        shippingActCriteria.setBrch(new BigDecimal(1));
        // Lock the Shipping Document in the search condition and gets the data. 
        // 検索結果
        List<? extends W7001ShippingActDocDomain> resultList;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingDocument(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (resultList.isEmpty()) {
            return false;
        }

        fileId[0] = resultList.get(0).getFileId();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(String, String, Date, OutputStream)
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(String shipperCd, String invoiceNo, Date invoiceIssueDt, OutputStream fileData) 
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain ttShippingDocCriteria = new TtShippingDocumentCriteriaDomain();
        ttShippingDocCriteria.setShipperCd(shipperCd);
        ttShippingDocCriteria.setInvoiceNo(invoiceNo);
        ttShippingDocCriteria.setInvoiceIssueDt(invoiceIssueDt);
        ttShippingDocCriteria.setDocTyp(DOC_TYP_CO);
        ttShippingDocCriteria.setBrch(new BigDecimal(1));
        // Get shipping document data.
        // 船積書類の検索
        List<? extends TtShippingDocumentDomain> resultList = ttShippingDocumentService.searchByCondition(ttShippingDocCriteria);
        if (resultList.isEmpty()) {
            return false;
        }
        
        try {
            fileManagerServiceForStream.searchFileDownload(resultList.get(0).getFileId(), true, fileData);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileData == null) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel(String, String, Date, String[])
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] fileId) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActCriteria.setDocTyp(DOC_TYP_NON_WOODEN);
        shippingActCriteria.setBrch(new BigDecimal(1));
        // Lock the Shipping Document in the search condition and gets the data. 
        // 検索結果
        List<? extends W7001ShippingActDocDomain> resultList;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingDocument(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (resultList.isEmpty()) {
            return false;
        }

        fileId[0] = resultList.get(0).getFileId();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView(String, String, Date, OutputStream)
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView(String shipperCd, String invoiceNo, Date invoiceIssueDt, OutputStream fileData)
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain ttShippingDocCriteria = new TtShippingDocumentCriteriaDomain();
        ttShippingDocCriteria.setShipperCd(shipperCd);
        ttShippingDocCriteria.setInvoiceNo(invoiceNo);
        ttShippingDocCriteria.setInvoiceIssueDt(invoiceIssueDt);
        ttShippingDocCriteria.setDocTyp(DOC_TYP_NON_WOODEN);
        ttShippingDocCriteria.setBrch(new BigDecimal(1));
        // Get shipping document data.
        // 船積書類の検索
        List<? extends TtShippingDocumentDomain> resultList = ttShippingDocumentService.searchByCondition(ttShippingDocCriteria);
        if (resultList.isEmpty()) {
            return false;
        }
        
        try {
            fileManagerServiceForStream.searchFileDownload(resultList.get(0).getFileId(), true, fileData);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileData == null) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(String, String, Date, BigDecimal, String[])
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(String shipperCd
        , String invoiceNo, Date invoiceIssueDt, BigDecimal brch, String[] fileId) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActCriteria.setDocTyp(DOC_TYP_OTHERS);
        shippingActCriteria.setBrch(brch);
        // Lock the Shipping Document in the search condition and gets the data. 
        // 検索結果
        List<? extends W7001ShippingActDocDomain> resultList;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingDocument(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if (resultList.isEmpty()) {
            return false;
        }

        fileId[0] = resultList.get(0).getFileId();
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(String, String, Date, BigDecimal, OutputStream)
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(
        String shipperCd, String invoiceNo, Date invoiceIssueDt, BigDecimal brch, OutputStream fileData) 
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain ttShippingDocCriteria = new TtShippingDocumentCriteriaDomain();
        ttShippingDocCriteria.setShipperCd(shipperCd);
        ttShippingDocCriteria.setInvoiceNo(invoiceNo);
        ttShippingDocCriteria.setInvoiceIssueDt(invoiceIssueDt);
        ttShippingDocCriteria.setDocTyp(DOC_TYP_OTHERS);
        ttShippingDocCriteria.setBrch(brch);
        // Get shipping document data.
        // 船積書類の検索
        List<? extends TtShippingDocumentDomain> resultList = ttShippingDocumentService.searchByCondition(ttShippingDocCriteria);
        if (resultList.isEmpty()) {
            return false;
        }
        
        try {
            fileManagerServiceForStream.searchFileDownload(resultList.get(0).getFileId(), true, fileData);
        } catch (FileManagementException e1) {
            return false;
        } catch (UnsupportedEncodingException e1) {
            return false;
        } catch (IOException e) {
            return false;
        }
        if (fileData == null) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnRegister(W7001ShippingActCriteriaDomain)
     */
    public boolean validateDatabaseTtShippingActOnRegister(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
        List<? extends W7001ShippingActDomain> resultList;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }
        if(resultList.isEmpty()) {
            return false;
        }

        List<String> clpFileIdList = new ArrayList<String>();
        for(W7001ShippingActDomain resultDomain : resultList) {
            clpFileIdList.add(resultDomain.getClpFileId());
        }
        criteria.setClpFileIdList(clpFileIdList);
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnRegisterCancel(W7001ShippingActCriteriaDomain)
     */
    public boolean validateDatabaseTtShippingActOnRegisterCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
        List<? extends W7001ShippingActDomain> resultList ;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }          
        
        if(resultList.isEmpty()) {
            return false;
        }
        
        List<String> clpFileIdList = new ArrayList<String>();
        List<String> billdFileIdList = new ArrayList<String>();
        for(W7001ShippingActDomain resultDomain : resultList) {
            if (!StringUtils.isEmpty(resultDomain.getClpFileId())) {
                clpFileIdList.add(resultDomain.getClpFileId());
            }
            if (!StringUtils.isEmpty(resultDomain.getBilldFileId())) {
                billdFileIdList.add(resultDomain.getBilldFileId());
            }
        }
        criteria.setClpFileIdList(clpFileIdList);
        criteria.setBilldFileIdList(billdFileIdList);
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnRegisterChangeStatus(String)
     */
    public boolean validateDatabaseTtShippingActOnRegisterChangeStatus(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        // Lock the Shipping Actuality in the search condition and gets the data. 
        // 船積実績をロック
         
        List<? extends W7001ShippingActDomain> resultList ;
        try {
            resultList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
        } catch (ApplicationException e) {
            return false;
        }          
        
        if(resultList.isEmpty()) {
            return false;
        }
        
        List<String> billdFileIdList = new ArrayList<String>();
        for(W7001ShippingActDomain resultDomain : resultList) {
            if (!StringUtils.isEmpty(resultDomain.getBilldFileId())) {
                billdFileIdList.add(resultDomain.getBilldFileId());
            }
        }
        criteria.setBilldFileIdList(billdFileIdList);
        criteria.setClpGroup(resultList.get(0).getClpGroup());
        criteria.setContainerLooseTyp(resultList.get(0).getContainerLooseTyp());
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload(String, String, Date)
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain shippingActDocCriteria = new TtShippingDocumentCriteriaDomain();
        shippingActDocCriteria.setShipperCd(shipperCd);
        shippingActDocCriteria.setInvoiceNo(invoiceNo);
        shippingActDocCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActDocCriteria.setDocTyp(DOC_TYP_CO);
        shippingActDocCriteria.setBrch(new BigDecimal(1));
        shippingActDocCriteria.setDeleteFlg(FLAG_N);
        // Get shipping document data.
        // 船積書類検索
        List<? extends TtShippingDocumentDomain> resultList 
            = ttShippingDocumentService.searchByCondition(shippingActDocCriteria);

        if(!resultList.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload(String, String, Date)
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload(
        String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain shippingActDocCriteria = new TtShippingDocumentCriteriaDomain();
        shippingActDocCriteria.setShipperCd(shipperCd);
        shippingActDocCriteria.setInvoiceNo(invoiceNo);
        shippingActDocCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActDocCriteria.setDocTyp(DOC_TYP_NON_WOODEN);
        shippingActDocCriteria.setBrch(new BigDecimal(1));
        shippingActDocCriteria.setDeleteFlg(FLAG_N);
        // Get shipping document data.
        // 船積書類検索
        List<? extends TtShippingDocumentDomain> resultList 
            = ttShippingDocumentService.searchByCondition(shippingActDocCriteria);

        if(!resultList.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(String, String, Date)
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShipperCd(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        shippingActCriteria.setDocTyp(DOC_TYP_OTHERS);
        // Get the number of SHIPPER CODE corresponding to the search criteria. 
        // 船積書類検索
        W7001ShippingActInvoiceDomain invoiceDomain 
            = w7001ShippingActDao.searchCountTtShippingDocumentByShipper(shippingActCriteria);

        if(invoiceDomain != null && invoiceDomain.getCountShipperCd() >= 10) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingDocumentOnRegister(String, String, Date, List, boolean)
     */
    public boolean validateDatabaseTtShippingDocumentOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, List<W7001ShippingActDocDomain> shippingActDocList, boolean checkCount) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setShippingActNo(shipperCd);
        shippingActCriteria.setInvoiceNo(invoiceNo);
        shippingActCriteria.setInvoiceIssueDt(invoiceIssueDt);
        // Lock the Shipping Document in the search condition and gets the data. 
        // 船積書類をロック
        List<? extends W7001ShippingActDocDomain> newShippingActDocList = w7001ShippingActDao.lockByNoWaitTtShippingDocument(shippingActCriteria);
     
        if (checkCount && newShippingActDocList.isEmpty()) {
            return false;
        }

        for (W7001ShippingActDocDomain docDomain : newShippingActDocList) {
            shippingActDocList.add(docDomain);
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister(String)
     */
    public boolean validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister(String dscId) 
        throws ApplicationException {

        TwShippingActInvoiceCriteriaDomain criteria = new TwShippingActInvoiceCriteriaDomain();
        criteria.setDscId(dscId);

        if (twShippingActInvoiceService.searchByCondition(criteria).isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTwShippingActInvoiceOnCreateUpdate(String, int, int, String[])
     */
    public String validateDatabaseTwShippingActInvoiceOnCreateUpdate(String dscId, int activeCheckedCnt, int activePkgQty, String[] params) 
        throws ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setDscId(dscId);
        // Get the Shipping Actuality Invoice Work corresponding to the search criteria. 
        // 船積実績対象インボイスワーク検索
        W7001ShippingActInvoiceDomain invoiceDomain = w7001ShippingActDao.searchTwShippingActInvoiceByCount(shippingActCriteria);
        if(invoiceDomain.getPkgQty() == null) {
            throw new SystemException(NXS_91_0001);
        }
        
        if(invoiceDomain.getCountInvoiceNo() + activeCheckedCnt > TW_SHIPPING_ACT_INVOICE_MAX_COUNT) {
            params[0] = "Invoice";
            params[1] = "99";
            return GSCM_E0_0038;
        }
        if(invoiceDomain.getPkgQty().intValue() + activePkgQty > PKQ_QTY_MAX) {
            params[0] = "PKG QTY";
            params[1] = "9999";
            return GSCM_E0_0038;
        }
        
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)
     */
    public boolean validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        TwShippingActInvoiceCriteriaDomain shippingActInvoiceCriteria = new TwShippingActInvoiceCriteriaDomain();
        shippingActInvoiceCriteria.setDscId(criteria.getDscId());
        shippingActInvoiceCriteria.setDelFlg(FLAG_Y);
        // Get ShippingActInvoice work data.
        // 船積実績対象インボイスワークを検索
        List<? extends TwShippingActInvoiceDomain> resultList = twShippingActInvoiceService.searchByCondition(shippingActInvoiceCriteria);
        
        if(resultList.isEmpty()) {
            return false;
        }
        List<W7001ShippingActInvoiceDomain> shippingActInvoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        

        for(TwShippingActInvoiceDomain resultDomain : resultList) {
            W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
            invoiceDomain.setShipperCd(resultDomain.getShipperCd());
            invoiceDomain.setInvoiceNo(resultDomain.getInvoiceNo());
            invoiceDomain.setInvoiceIssueDt(resultDomain.getInvoiceIssueDt());
            
            shippingActInvoiceList.add(invoiceDomain);
        }
        criteria.setShippingActInvoiceList(shippingActInvoiceList);
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen(String)
     */
    public boolean validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen(String dscId)
        throws ApplicationException {

        TwShippingActInvoiceCriteriaDomain invoiceCriteria = new TwShippingActInvoiceCriteriaDomain();
        invoiceCriteria.setDscId(dscId);
        invoiceCriteria.setDelFlg(FLAG_Y);
        invoiceCriteria.setSearchCountCheckFlg(false);

        if(twShippingActInvoiceService.searchCount(invoiceCriteria) == 0) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtPltzOnRegister(java.lang.String, java.lang.StringBuffer)
     */
    public boolean validateDatabaseTtPltzOnRegister(String dscId, StringBuffer invoiceNo) throws ApplicationException {
        List<String> errorInvoiceNoList = w7001ShippingActDao.searchTtPltzByInvoice(dscId);
        if (0 < errorInvoiceNoList.size()) {
            invoiceNo.append(errorInvoiceNoList.get(0));
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnUpdateRegister(W7001ShippingActCriteriaDomain)
     */
    public String validateDatabaseTtShippingActOnUpdateRegister(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(criteria.getShippingActNo());

        TtShippingActDomain result = ttShippingActService.searchByKey(ttShippingActCriteria);
        if (result == null) {
            return GSCM_E0_0010;
        } else if (!StringUtils.isEmpty(result.getClpGroup())){
            return NXS_E1_0018;
        } else if(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(result.getShippingActStatus())) {
            return NXS_E1_0028;
        }

        return null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnClpCancel(W7001UpdateDomain)
     */
    public boolean validateDatabaseTtShippingActOnClpCancel(W7001UpdateDomain updateDomain) 
        throws ApplicationException {
        TtShippingActCriteriaDomain criteriaDomain = new TtShippingActCriteriaDomain();
        criteriaDomain.setClpGroup(updateDomain.getListDomainList().get(0).getClpGroup());
        criteriaDomain.setDeleteFlg(FLAG_N);
        List<TtShippingActDomain> result = ttShippingActService.searchByCondition(criteriaDomain);
        if(result.size() > updateDomain.getListDomainList().size()) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtInvoiceOnClpCancel(W7001UpdateDomain)
     */
    public boolean validateDatabaseTtInvoiceOnClpCancel(W7001UpdateDomain updateDomain) 
        throws ApplicationException {
        TtShippingActCriteriaDomain criteriaDomain = new TtShippingActCriteriaDomain();
        for(W7001ListDomain domain : updateDomain.getListDomainList()) {
            criteriaDomain.setShippingActNo(domain.getShippingActNo());
            TtShippingActDomain result = ttShippingActService.searchByKey(criteriaDomain);
            if(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(result.getShippingActStatus())) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtShippingActOnClpRegister(W7001UpdateDomain)
     */
    public String validateDatabaseTtShippingActOnClpRegister(W7001UpdateDomain updateDomain) 
        throws ApplicationException {
        
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        List<? extends W7001ShippingActDomain> resultList;
        TmNxsCompDomain resultTmNxsCompDomain = new TmNxsCompDomain();
        
        String baseTrans = updateDomain.getListDomainList().get(0).getTrnsCd();
        String baseVessel = updateDomain.getListDomainList().get(0).getVessel();
        String baseAtd = updateDomain.getListDomainList().get(0).getAtd();
        String baseEta = updateDomain.getListDomainList().get(0).getEta();
        String baseCarrierCompCd = updateDomain.getListDomainList().get(0).getCarrierCompCd();
        
        for(W7001ListDomain listDomain : updateDomain.getListDomainList()) {
            // 初期化
            tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            shippingActCriteria = new W7001ShippingActCriteriaDomain();
            resultTmNxsCompDomain = new TmNxsCompDomain();
            shippingActCriteria.setShippingActNo(listDomain.getShippingActNo());
            // Lock the Shipping Actuality in the search condition and gets the data. 
            // 船積実績をロック
            try {
                resultList = w7001ShippingActDao.lockByNoWaitTtShippingAct(shippingActCriteria);
            } catch (ApplicationException e) {
                return GSCM_E0_0010;
            }          
            if(resultList.isEmpty()) {
                return GSCM_E0_0010;
            }
            // 仕入れ先シッパー判定
            tmNxsCompCriteriaDomain.setCompCd(listDomain.getShipperCd());
            resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            
            // B/Lアップロードチェック
            if(FLAG_N.equals(resultTmNxsCompDomain.getDnBaseFlg())
                || TRNS_CD_TRUCK.equals(listDomain.getTrnsCd())) {
                //no check
            } else {
                if(StringUtils.isEmpty(resultList.get(0).getBilldFileId())) {
                    return NXS_E1_0026;
                }
            }
            
            // 複数船チェック
            if(!baseTrans.equals(listDomain.getTrnsCd())
                || !baseVessel.equals(listDomain.getVessel())
                || !baseAtd.equals(listDomain.getAtd())
                || !baseEta.equals(listDomain.getEta())
                || !baseCarrierCompCd.equals(listDomain.getCarrierCompCd())) {
                return NXS_E7_0046;
            }
        }
        
        // 同一船情報取得
        TtShippingActCriteriaDomain criteria = new TtShippingActCriteriaDomain();
        criteria.setVessel(baseVessel);
        criteria.setCarrierCompCd(baseCarrierCompCd);
        criteria.setTrnsCd(baseTrans);
        // NL021 MOD START
        //criteria.setAtd(DateUtil.parseDate(DateUtil.formatDate(baseAtd, "dd/MM/yy", CONVERT_DATE_FORMAT), CONVERT_DATE_FORMAT));
        //criteria.setEta(DateUtil.parseDate(DateUtil.formatDate(baseEta, "dd/MM/yy", CONVERT_DATE_FORMAT), CONVERT_DATE_FORMAT));
        criteria.setAtd(DateUtil.parseDate(baseAtd, updateDomain.getScreenDateFormat()));
        criteria.setEta(DateUtil.parseDate(baseEta, updateDomain.getScreenDateFormat()));
        // NL021 MOD END
        List<TtShippingActDomain> resultVesselList = ttShippingActService.searchByCondition(criteria);
        
        if(resultVesselList.size() != updateDomain.getListDomainList().size()) {
            return NXS_E1_0043;
        }
        
        return null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseTtPltzOnClpRegister(W7001UpdateDomain)
     */
    public void validateDatabaseTtPltzOnClpRegister(W7001UpdateDomain updateDomain) 
        throws ApplicationException {
        
        // 選択している船積実績のメインマークと出荷確認No.を取得
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        List<W7001ShippingActDomain> margeResult = new ArrayList<W7001ShippingActDomain>();
        for(W7001ListDomain domain : updateDomain.getListDomainList()) {
            criteria.setShippingActNo(domain.getShippingActNo());
            List<? extends W7001ShippingActDomain> result = w7001ShippingActDao.searchTtShippingActByShippingFirmNo(criteria);
            for(W7001ShippingActDomain resultDomain : result) {
                margeResult.add(resultDomain);
            }
        }
        
        // 出荷確認No.の重複を削除する
        Set<String> hash = new HashSet<String>();
        for(W7001ShippingActDomain domain : margeResult) {
            if(!hash.contains(domain.getShippingFirmNo())) {
                hash.add(domain.getShippingFirmNo());
            }
        }
        
        // 出荷確認No.に紐づくメインマークを検索する
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        List<TtPltzDomain> margePltzResult = new ArrayList<TtPltzDomain>();
        for(String shippingFirmNo : hash) {
            ttPltzCriteria.setShippingFirmNo(shippingFirmNo);
            List<TtPltzDomain> result = ttPltzService.searchByCondition(ttPltzCriteria);
            for(TtPltzDomain resultDomain : result) {
                margePltzResult.add(resultDomain);
            }
        }
        
        if(margeResult.size() != margePltzResult.size()) {
            throw new GscmApplicationException(NXS_E1_0043);
        }
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#validateDatabaseShippingActStatusForCancel(boolean, java.lang.String, java.lang.String, java.lang.String)
     */
    public String validateDatabaseShippingActStatusForCancel(boolean isShipping24hFunc, String compCd, String trnsCd, String dscId)
        throws ApplicationException
    {
        // Acquisition of CIGMA item invoice included in this shipping result.
        // 0 is check-through as there is no need to link with CIGMA.
        // この船積実績に含まれるCIGMA品インボイスの取得。0件はCIGMAに連携する必要がないためチェックスルー。
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        shippingActCriteria.setDscId(dscId);
        List<? extends W7001ShippingActInvoiceDomain> resultList = w7001ShippingActDao.searchTtInvoice(shippingActCriteria);
        if(resultList.isEmpty()) {
            return null; // check OK.
        }

        // It is an error during the CIGMA night batch.
        // CIGMA夜間バッチ中はエラーとする。
        boolean accessOk = commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
        if (!accessOk) {
            return NXS_E1_0060;
        }

        // If the shipping result has already been linked to the import side system by EDI, it is an error.
        // 既に船積実績が輸入側システムにEDI連携されている場合、エラーとする。
        String resultCigmaEdiStatus = callWebService7002(compCd, resultList, trnsCd);
        if ("2".equals(resultCigmaEdiStatus)) {
            return NXS_E1_0016;
        }

        return null;
    }

    // --- searching methods ---
    // --- 検索系メソッド search -------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchForPagingOnCreateSearch(W7001ShippingActCriteriaDomain)
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingOnCreateSearch(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        int count = 0;
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            count = w7001ShippingActDao.searchCountTtInvoice(criteria);
        } else {
            count = w7001ShippingActDao.searchCountTtInvoiceByNoPltz(criteria);
        }

        PageInfoData pageInfoData = criteria.getPageInfoCreator().createPageInfoData(count, null, null, criteria.getLocale());
        
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
        
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // Get Invoice corresponding to the search criteria. 
            return  w7001ShippingActDao.searchForPagingTtInvoice(criteria);
        } else {
            // Get an invoice corresponding to the search criteria. 
            return  w7001ShippingActDao.searchForPagingTtInvoiceByNoPltz(criteria);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchForPagingOnMainSearch(W7001ShippingActCriteriaDomain)
     */
    public List<? extends W7001ShippingActDomain> searchForPagingOnMainSearch(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        
        int count = w7001ShippingActDao.searchCountTtShippingAct(criteria);
        
        PageInfoData pageInfoData = criteria.getPageInfoCreator().createPageInfoData(count, null, null, criteria.getLocale());
        
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
        // Get the Shipping Actuality corresponding to the search criteria. 
        // 検索データの取得
        return w7001ShippingActDao.searchForPagingTtShippingAct(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchOnBlUploadInit(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDocDomain searchOnBlUploadInit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        W7001ShippingActDocDomain resultDomain = new W7001ShippingActDocDomain();
        
        String preferredOrder = "BILLD_FILE_ID";
        
        List<? extends TtShippingActDomain> shippingActList = getShippingActDomain(criteria.getShippingActNo(), preferredOrder);
        if(shippingActList.isEmpty()) {
            return resultDomain;
        }
        resultDomain.setComUpdateTimestamp(shippingActList.get(0).getComUpdateTimestamp());
        
        if (!CheckUtil.isBlankOrNull(shippingActList.get(0).getBilldFileId())) {
            FileManagementDomain fileMngDomain = null;
            // Get file name from FileManeger
            try {
                fileMngDomain = getFileManagementDomain(shippingActList.get(0).getBilldFileId());
            } catch (FileManagementException e) {
                return resultDomain;
            } catch (UnsupportedEncodingException e) {
                return resultDomain;
            }
            if(fileMngDomain == null) {
                return resultDomain;
            }
            resultDomain.setFileName(fileMngDomain.getFileName());
        }
        return resultDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        List<? extends TtShippingActDomain> ttShippingActList = getShippingActDomain(criteria.getShippingActNo(), null);
        if(ttShippingActList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        // Get invoice data.
        // インボイスのステータス・最終更新日時の取得
        List<? extends TtInvoiceDomain> ttinvoiceList 
            = getShippingActInvoiceDomain(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
        if (ttinvoiceList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        
        W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
        invoiceDomain.setShippingActStatus(ttinvoiceList.get(0).getShippingActStatus());
        invoiceDomain.setComUpdateTimestamp(ttinvoiceList.get(0).getComUpdateTimestamp());
        
        List<W7001ShippingActInvoiceDomain> shippingActInvoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        shippingActInvoiceList.add(invoiceDomain);
        // Get the Shipping Document information.(DOC_TYP_CO).
        // 船積書類情報の取得(ドキュメント種別：C/O）
        List<? extends W7001ShippingActDocDomain> shippingActDocListForCo 
            = getShippingActDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_CO);
        // Get the Shipping Document information.(DOC_TYP_NON_WOODEN).
        // 船積書類情報の取得（ドキュメント種別：Non Wooden）
        List<? extends W7001ShippingActDocDomain> shippingActDocListForNonWooden 
            = getShippingActDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_NON_WOODEN);
        // Get the Shipping Document information.(DOC_TYP_OTHERS).
        // 船積書類情報の取得（ドキュメント種別：Others）
        List<? extends W7001ShippingActDocDomain> shippingActDocListForOthers 
            = getShippingActDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_OTHERS);
        // Merge data.
        // C/O, Non Wooden, Othersの順にマージ
        List<W7001ShippingActDocDomain> shippingActDocList = new ArrayList<W7001ShippingActDocDomain>();
        shippingActDocList.addAll(shippingActDocListForCo);
        shippingActDocList.addAll(shippingActDocListForNonWooden);
        shippingActDocList.addAll(shippingActDocListForOthers);
        
        W7001ShippingActDomain resultDomain = new W7001ShippingActDomain();
        resultDomain.setComUpdateTimestamp(ttShippingActList.get(0).getComUpdateTimestamp());
        resultDomain.setShippingActInvoiceList(shippingActInvoiceList);
        resultDomain.setShippingActDocList(shippingActDocList);

        return resultDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setShippingActNo(criteria.getShippingActNo());
        ttInvoiceCriteria.setDeleteFlg(FLAG_N);
        ttInvoiceCriteria.setSearchCountCheckFlg(false);
        
        ttInvoiceCriteria.setPreferredOrder("INVOICE_NO");
        // Get invoice data.
        // インボイスを検索
        List<TtInvoiceDomain> ttInvoiceList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);
        

        List<W7001ShippingActInvoiceDomain> shippingActInvoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        for(TtInvoiceDomain ttInvoiceDomain : ttInvoiceList) {
            W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(shippingActInvoiceDomain, ttInvoiceDomain);
            
            shippingActInvoiceList.add(shippingActInvoiceDomain);
        }
        
        return shippingActInvoiceList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        // Get the number of Shipping Actuality Invoice Work corresponding to the search criteria. 
        // 検索データ件数の取得
        criteria.setSearchCountCheckFlg(false);
        int count = w7001ShippingActDao.searchCountTwShippingActInvoice(criteria);
        if (count == 0) {
            // no data.
            // 検索結果なし            
            return null;
        }
        if (TW_SHIPPING_ACT_INVOICE_MAX_COUNT < count) {
            Object[] params = {
                count,
                TW_SHIPPING_ACT_INVOICE_MAX_COUNT
            };
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }
        // Get the Shipping Actuality Invoice Work corresponding to the search criteria. 
        // 明細部分のデータ取得
        List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList = w7001ShippingActDao
            .searchForPagingTwShippingActInvoice(criteria);
        // Get the NUMBER OF CONTAINER corresponding to the search criteria when the Auto Invoice Register is 'Y'. 
        // 船積実績に含まれているコンテナ数取得（Auto Invoice Registerが'Y'の場合のみ）
        W7001ShippingActPltzDomain shippingActPltz = null;
        if(FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            shippingActPltz = w7001ShippingActDao.searchTtShippingFirm(criteria);
        }
        // Record a PACKAGE QUANTITY corresponding to the search criteria. 
        // 船積実績に含まれるケースマークの数を取得
        W7001ShippingActInvoiceDomain pkgQtyDomain = w7001ShippingActDao.searchTwShippingActInvoiceBySumPkgQty(criteria);
        // Get initial VALUE of input items Shipping Actuality Register screen. 
        // 入力項目の初期取得
        W7001ShippingActInvoiceDomain inputInitDomain =  getRegisterScreenByInit(criteria.getDscId());
        
        // Set header data.
        // 検索結果を画面に設定
        // ヘッダ部分
        W7001ShippingActDomain shippingActDomain = new W7001ShippingActDomain();
        CommonUtil.copyPropertiesDomainToDomain(shippingActDomain, criteria);

        shippingActDomain.setNoOfInvoice(Integer.toString(shippingActInvoiceList.size()));
        if(FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg()) && shippingActPltz != null) {
            shippingActDomain.setNoOfContainer(shippingActPltz.getCountContainerNo());
        }
        shippingActDomain.setPkgQty(pkgQtyDomain.getPkgQty());
        shippingActDomain.setShippingActStatus("");
        shippingActDomain.setRegisterDt(null);
        shippingActDomain.setAtd(inputInitDomain.getEtd());
        shippingActDomain.setEta(inputInitDomain.getEta());
        shippingActDomain.setCarrierCompCd(inputInitDomain.getCarrierCompCd());
        shippingActDomain.setVessel(inputInitDomain.getVessel());
        shippingActDomain.setBilldNo("");
        shippingActDomain.setContainerLooseTyp(inputInitDomain.getContainerLooseTyp());
        shippingActDomain.setComUpdateTimestamp(null);
        
        // Set detail data.
        // 明細部
        shippingActDomain.setShippingActInvoiceList(shippingActInvoiceList);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        W7001ShippingActDomain shippingActDomain = new W7001ShippingActDomain();
        
        if (!FLAG_N.equals(criteria.getCreateTwShippingActInvoiceFlag())) {
            // Create the Shipping Actuality Invoice Work. 
            // 船積実績対象インボイスワーテーブルへの登録処理
            createTwShippingActInvoiceForRegister(criteria.getDscId(), criteria.getShippingActNo(), criteria.getScreenId());
            criteria.setCreateTwShippingActInvoiceFlag(FLAG_Y);
        }
        
        // Get the number of result data count.
        // 検索データ件数の取得
        criteria.setSearchCountCheckFlg(false);
        int count = w7001ShippingActDao.searchCountTwShippingActInvoice(criteria);
        if (count == 0) {
            // no data.
            // 検索結果なし            
            return shippingActDomain;
        }
        if (TW_SHIPPING_ACT_INVOICE_MAX_COUNT < count) {
            Object[] params = {
                count,
                TW_SHIPPING_ACT_INVOICE_MAX_COUNT
            };
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }
        
        // Get header data.
        // ヘッダ部データの取得
        TtShippingActCriteriaDomain ttshippingActCriteria = new TtShippingActCriteriaDomain();
        ttshippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        List<TtShippingActDomain> ttShippingActList = ttShippingActService.searchByCondition(ttshippingActCriteria);
        // Get detail data.
        // 明細部分のデータ取得
        List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList = w7001ShippingActDao
            .searchForPagingTwShippingActInvoice(criteria);
        if (shippingActInvoiceList == null) {
            shippingActInvoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        }
        // Get the NUMBER OF CONTAINER corresponding to the search criteria. when the Auto Invoice Register is 'Y'.
        // 船積実績に含まれているコンテナ数取得（Auto Invoice Registerが'Y'の場合のみ）
        W7001ShippingActPltzDomain shippingActPltz = null;
        if(FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            shippingActPltz = w7001ShippingActDao.searchTtShippingFirm(criteria);
        }
        // Get record the PACKAGE QUANTITY corresponding to the search criteria. 
        // 船積実績に含まれるケースマークの数を取得
        W7001ShippingActInvoiceDomain pkgQtyDomain = w7001ShippingActDao.searchTwShippingActInvoiceBySumPkgQty(criteria);
        
        // Set header data.
        // 検索結果を画面に返す
        // ヘッダ部
        CommonUtil.copyPropertiesDomainToDomain(shippingActDomain, ttShippingActList.get(0));
        
        shippingActDomain.setNoOfInvoice(Integer.toString(shippingActInvoiceList.size()));
        if(FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg()) && shippingActPltz != null) {
            shippingActDomain.setNoOfContainer(shippingActPltz.getCountContainerNo());
        }
        shippingActDomain.setPkgQty(pkgQtyDomain.getPkgQty());
        // Set detail data.
        // 明細部
        shippingActDomain.setShippingActInvoiceList(shippingActInvoiceList);
        
        return shippingActDomain;
    }
    // --- registration methods ---
    // --- 登録系メソッド create -------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnCreateUpdate(List)
     */
    public int createOnCreateUpdate(List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList)
        throws ApplicationException {
        
        List<TwShippingActInvoiceDomain> twShippingActInvoiceList = new ArrayList<TwShippingActInvoiceDomain>();
        for (W7001ShippingActInvoiceDomain shippingActInvoice : shippingActInvoiceList) {

            TwShippingActInvoiceDomain twShippingActInvoice = new TwShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(twShippingActInvoice, shippingActInvoice);
            
            twShippingActInvoice.setPkgQty(shippingActInvoice.getPltzItemQty());
            twShippingActInvoice.setShippingActStatus(null);
            twShippingActInvoice.setDelFlg(FLAG_N);

            commonService.setCommonPropertyForRegist(twShippingActInvoice, SCREEN_ID_W7003);
            
            twShippingActInvoiceList.add(twShippingActInvoice);
        }
        // Create Shipping Actuality Invoice Work. 
        // 船積実績対象インボイスワークへの登録
        createTwShippingActInvoice(twShippingActInvoiceList);
        
        return twShippingActInvoiceList.size();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadIndividualCoUpload(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualCoUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = createTtShippingDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_CO, new BigDecimal(1), fileId, SCREEN_ID_W7006);
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadIndividualNonWoodenUpload(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualNonWoodenUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = createTtShippingDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_NON_WOODEN, new BigDecimal(1), fileId, SCREEN_ID_W7006);
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadIndividualOthersUpload(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualOthersUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // Get BRANCH corresponding to the search criteria. 
        // 枝番の採番
        W7001ShippingActDocDomain shippingACtDocDomain = w7001ShippingActDao.searchTtShippingDocumentByBrch(criteria);
        BigDecimal brch = shippingACtDocDomain.getBrch().add(new BigDecimal(1));
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = createTtShippingDocument(criteria.getShipperCd(), criteria.getInvoiceNo(), criteria.getInvoiceIssueDt(), DOC_TYP_OTHERS, brch, fileId, SCREEN_ID_W7006);
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadSummaryCoUpload(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryCoUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException{

        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = 0;
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            createCount += createTtShippingDocument(criteria.getShipperCd(), invoiceDomain.getInvoiceNo()
                , invoiceDomain.getInvoiceIssueDt(), DOC_TYP_CO, new BigDecimal(1), fileId, SCREEN_ID_W7007);
        }
        
        List<? extends W7001ShippingActInvoiceDomain> invoiceList = searchOnOtherDocUploadSummary(criteria);
        
        W7001ShippingActDomain shippingActDomain = new W7001ShippingActDomain();
        shippingActDomain.setShippingActInvoiceList(invoiceList);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadSummaryNonWoodenUpload(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryNonWoodenUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = 0;
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            createCount += createTtShippingDocument(criteria.getShipperCd(), invoiceDomain.getInvoiceNo()
                , invoiceDomain.getInvoiceIssueDt(), DOC_TYP_NON_WOODEN, new BigDecimal(1), fileId, SCREEN_ID_W7007);
        }

        List<? extends W7001ShippingActInvoiceDomain> invoiceList = searchOnOtherDocUploadSummary(criteria);
        
        W7001ShippingActDomain shippingActDomain = new W7001ShippingActDomain();
        shippingActDomain.setShippingActInvoiceList(invoiceList);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#createOnOtherDocUploadSummaryOthersUpload(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryOthersUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException{

        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());
        // ST184 INVOICE ISSUE DATE/インボイス発行日 DEL START
        // Get BRANCH corresponding to the search criteria. 
        // 枝番の採番
        //W7001ShippingActDocDomain shippingACtDocDomain = w7001ShippingActDao.searchTtShippingDocumentByBrch(criteria);
        //BigDecimal brch = shippingACtDocDomain.getBrch().add(new BigDecimal("1"));
        // ST184 INVOICE ISSUE DATE/インボイス発行日 DEL END
        // Create shipping document.
        // 船積書類に登録するデータの設定
        int createCount = 0;
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {

            // ST184 INVOICE ISSUE DATE/インボイス発行日 ADD START
            // Get BRANCH corresponding to the search criteria. 
            // 枝番の採番
            W7001ShippingActCriteriaDomain invoiceCriteria = new W7001ShippingActCriteriaDomain();
            invoiceCriteria.setShipperCd(criteria.getShipperCd());
            invoiceCriteria.setInvoiceNo(invoiceDomain.getInvoiceNo());
            invoiceCriteria.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
            W7001ShippingActDocDomain shippingACtDocDomain
                = w7001ShippingActDao.searchTtShippingDocumentByBrch(invoiceCriteria);
            BigDecimal brch = shippingACtDocDomain.getBrch().add(new BigDecimal("1"));
            // ST184 INVOICE ISSUE DATE/インボイス発行日 ADD END

            createCount += createTtShippingDocument(criteria.getShipperCd(), invoiceDomain.getInvoiceNo()
                , invoiceDomain.getInvoiceIssueDt(), DOC_TYP_OTHERS, brch, fileId, SCREEN_ID_W7007);
        }

        List<? extends W7001ShippingActInvoiceDomain> invoiceList = searchOnOtherDocUploadSummary(criteria);
        
        W7001ShippingActDomain shippingActDomain = new W7001ShippingActDomain();
        shippingActDomain.setShippingActInvoiceList(invoiceList);
        shippingActDomain.setUpdateCount(createCount);
        
        return shippingActDomain;
    }
    // --- Updating methods ---
    // --- 更新系メソッド update -------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#updateOnOtherDocUploadIndividualChangeStatus(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain updateOnOtherDocUploadIndividualChangeStatus(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException{

        String shippingActStatus = criteria.getShippingActInvoiceList().get(0).getShippingActStatus();
        // Set ShippingActStatus data.
        //インボイスの船積実績ステータス更新内容の設定
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        if(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH.equals(shippingActStatus)) {
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmNxsCompDomain resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            if(FLAG_N.equals(resultTmNxsCompDomain.getDnBaseFlg())
                || TRNS_CD_TRUCK.equals(criteria.getTrnsCd())) {
                //no check
            } else {
                if(criteria.getBilldFileIdList().size() == 0) {
                    throw new GscmApplicationException(NXS_E1_0026);
                }
            }
            ttInvoiceDomain.setShippingActStatus(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH);
        } else {
            ttInvoiceDomain.setShippingActStatus(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH);
        }

        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, SCREEN_ID_W7006);

        TtInvoiceCriteriaDomain updateTtInvoiceCriteria = new TtInvoiceCriteriaDomain();
        updateTtInvoiceCriteria.setShipperCd(criteria.getShipperCd());
        updateTtInvoiceCriteria.setInvoiceNo(criteria.getInvoiceNo());
        updateTtInvoiceCriteria.setInvoiceIssueDt(criteria.getInvoiceIssueDt());
        updateTtInvoiceCriteria.setComUpdateTimestamp(criteria.getShippingActInvoiceList().get(0).getComUpdateTimestamp());
        
        // Update Invoice table.
        // インボイスの船積実績ステータスの更新
        int updateCount = ttInvoiceService.updateByCondition(ttInvoiceDomain, updateTtInvoiceCriteria);
        
        TtInvoiceCriteriaDomain searchInvoiceCriteria = new TtInvoiceCriteriaDomain();
        searchInvoiceCriteria.setShippingActNo(criteria.getShippingActNo());
        List<TtInvoiceDomain> ttInvoiceList = ttInvoiceService.searchByCondition(searchInvoiceCriteria);
        
        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        if (checkShippingActStatus(ttInvoiceList)) {
            if(!CONTAINER_LOOSE_TYP_LOOSE.equals(criteria.getContainerLooseTyp())
                && StringUtils.isEmpty(criteria.getClpGroup())) {
                throw new GscmApplicationException(NXS_E1_0039);
            }
            ttShippingActDomain.setShippingActStatus(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH);
        } else {
            ttShippingActDomain.setShippingActStatus(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH);
        }
        
        commonService.setCommonPropertyForUpdate(ttShippingActDomain, SCREEN_ID_W7006);
        
        TtShippingActCriteriaDomain updateShippingActCriteria = new TtShippingActCriteriaDomain();
        updateShippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        updateShippingActCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());

        // Update ShippingAct table.
        // 船積実績の船積実績ステータス更新
        ttShippingActService.updateByCondition(ttShippingActDomain, updateShippingActCriteria);
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(updateCount);
        
        // AI-JB キュー登録
        if(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(ttShippingActDomain.getShippingActStatus())) {
            String requestId = commonService.createRequestJob(SCREEN_ID_W7006);
            List<TtOnlineReqJobParamDomain> reqJobList
                = new ArrayList<TtOnlineReqJobParamDomain>();
            TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
                = new TtOnlineReqJobParamDomain();
            // 1件目
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
            ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
            ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_ALL_DOC);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7006);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            // 2件目
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(2));
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShippingActNo());
            ttOnlineReqJobParamcriteria.setParamValue02(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7006);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            ttOnlineReqJobParamService.create(reqJobList);
        }
        
        return shippingActDomain;
    }

    // --- Deleting methods ---
    // --- 削除系メソッド delete -------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnCreateInit(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public void deleteOnCreateInit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        // Delete the data of Shipping Actuality Invoice Work for deletion associated with their login DSC-ID. 
        // 船積実績対象インボイスワーク削除
        deleteTwShippingActInvoiceForDelete(criteria.getDscId());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public void deleteOnHeaderInit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        // Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID. 
        // 船積実績対象インボイスワーク削除
        deleteTwShippingActInvoice(criteria.getDscId());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnMainInit(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public void deleteOnMainInit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        // Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID. 
        // 船積実績対象インボイスワーク削除
        deleteTwShippingActInvoice(criteria.getDscId());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnOtherDocUploadIndividualCoCancel(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualCoCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        W7001ShippingActDocDomain docDomain = criteria.getShippingActDocList().get(0);
        // Delete file data when it's ComUpdateTimeStamp exists.
        // 最終更新日時を取得していれば、ファイル管理からデータを削除します。
        if (null != docDomain.getComUpdateTimestamp()) {
            deleteFileManage(docDomain.getFileId(), docDomain.getComUpdateTimestamp(), criteria.getDscId());
        }
        // Delete Shipping Document data. 
        // 船積書類の削除処理
        int deleteCount = deleteTtShippingDocument(criteria, DOC_TYP_CO, new BigDecimal("1"));
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(deleteCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnOtherDocUploadIndividualNonWoodenCancel(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualNonWoodenCancel(W7001ShippingActCriteriaDomain criteria)  
        throws ApplicationException {
        W7001ShippingActDocDomain docDomain = criteria.getShippingActDocList().get(0);
        // Delete file data when it's ComUpdateTimeStamp exists.
        // 最終更新日時を取得していれば、ファイル管理からデータを削除します。
        if (null != docDomain.getComUpdateTimestamp()) {
            deleteFileManage(docDomain.getFileId(), docDomain.getComUpdateTimestamp(), criteria.getDscId());
        }
        // Delete Shipping Document data. 
        // 船積書類の削除処理
        int deleteCount = deleteTtShippingDocument(criteria, DOC_TYP_NON_WOODEN, new BigDecimal("1"));

        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(deleteCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnOtherDocUploadIndividualOthersCancel(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualOthersCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        W7001ShippingActDocDomain docDomain = criteria.getShippingActDocList().get(0);
        // Delete file data when it's ComUpdateTimeStamp exists.
        // 最終更新日時を取得していれば、ファイル管理からデータを削除します。
        if (null != docDomain.getComUpdateTimestamp()) {
            deleteFileManage(docDomain.getFileId(), docDomain.getComUpdateTimestamp(), criteria.getDscId());
        }
        // Delete Shipping Document data. 
        // 船積書類の削除処理
        int deleteCount = deleteTtShippingDocument(criteria, DOC_TYP_OTHERS, criteria.getBrch());
        
        W7001ShippingActDomain shippingActDomain = searchOnOtherDocUploadIndividualInit(criteria);
        shippingActDomain.setUpdateCount(deleteCount);
        
        return shippingActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#deleteOnRegisterDelete(String, W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain deleteOnRegisterDelete(String procMode, W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException{
        
        List<TwShippingActInvoiceDomain> updateDomainList = new ArrayList<TwShippingActInvoiceDomain>();
        List<TwShippingActInvoiceCriteriaDomain> updateCriteriaList = new ArrayList<TwShippingActInvoiceCriteriaDomain>();

        TwShippingActInvoiceDomain updateDomain = new TwShippingActInvoiceDomain();
        updateDomain.setDelFlg(FLAG_Y);
        
        commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W7004);
        
        for (W7001ShippingActInvoiceDomain checkedDomain : criteria.getShippingActInvoiceList()) {
            TwShippingActInvoiceCriteriaDomain updateCriteria = new TwShippingActInvoiceCriteriaDomain();
            
            updateCriteria.setDscId(checkedDomain.getDscId());
            updateCriteria.setShipperCd(checkedDomain.getShipperCd());
            updateCriteria.setInvoiceNo(checkedDomain.getInvoiceNo());
            updateCriteria.setInvoiceIssueDt(checkedDomain.getInvoiceIssueDt());
            
            updateDomainList.add(updateDomain);
            updateCriteriaList.add(updateCriteria);
        }
        // Update ShippingActInvoice data.
        // 船積実績対象インボイスワークの更新
        int updateCount = 0;
        if (updateDomainList.size() > 0) {
            updateCount = twShippingActInvoiceService.updateByCondition(updateDomainList, updateCriteriaList);
        }
        // Redraw the display.
        // 画面の再表示
        W7001ShippingActDomain shippingActDomain = null;
        if(MODE_EDIT.equals(procMode)) {
            // update mode
            // 修正モード
            criteria.setCreateTwShippingActInvoiceFlag(FLAG_N);
            shippingActDomain = searchOnRegisterInitByFromMain(criteria);
        } else {
            // create new mode
            // 新規モード
            shippingActDomain = searchOnRegisterInitByFromCreate(criteria);
        }
        if (null == shippingActDomain) {
            shippingActDomain = new W7001ShippingActDomain();
        }
        shippingActDomain.setUpdateCount(updateCount);
        
        return shippingActDomain;
    }

    // --- Transaction methods ---
    // --- トランザクション系メソッド transact -----------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnBlUpload(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDocDomain transactOnBlUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        
        String fileId = createFileUpload(criteria.getFileData(), criteria.getFileName(), criteria.getDscId());

        TtShippingActDomain updateDomain = new TtShippingActDomain();
        updateDomain.setBilldFileId(fileId);
        
        commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W7005);
        
        TtShippingActCriteriaDomain criteriaDomain = new TtShippingActCriteriaDomain();
        criteriaDomain.setShippingActNo(criteria.getShippingActNo());
        criteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        
        // Update ShippingAct table.
        // 船積実績へのファイルID更新
        int updateCount = ttShippingActService.updateByCondition(updateDomain, criteriaDomain);
        
        W7001ShippingActDocDomain docDommain = searchOnBlUploadInit(criteria);
        docDommain.setUpdateCount(updateCount);
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7005);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_BILLD);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7005);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(2));
        ttOnlineReqJobParamcriteria.setParamNm(KEY);
        ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShippingActNo());
        ttOnlineReqJobParamcriteria.setParamValue02(FLAG_N);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7005);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        ttOnlineReqJobParamService.create(reqJobList);
        
        return docDommain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnBlUploadCancel(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDocDomain transactOnBlUploadCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        //Delete file data linked the file id.
        // ファイル管理からファイルIDに紐付く情報を削除
        W7001ShippingActDocDomain docCriteria = criteria.getShippingActDocList().get(0);
        deleteFileManage(docCriteria.getFileId(), docCriteria.getComUpdateTimestamp(), criteria.getDscId());
        
        TtShippingActDomain updateDomain = new TtShippingActDomain();
        updateDomain.setBilldFileId("");
        
        commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W7005);
        
        TtShippingActCriteriaDomain criteriaDomain = new TtShippingActCriteriaDomain();
        criteriaDomain.setShippingActNo(criteria.getShippingActNo());
        // Update ShippingAct table.
        int updateCount = ttShippingActService.updateByCondition(updateDomain, criteriaDomain);
        
        W7001ShippingActDocDomain docDomain = searchOnBlUploadInit(criteria);
        docDomain.setUpdateCount(updateCount);
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7005);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_BILLD);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7005);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(2));
        ttOnlineReqJobParamcriteria.setParamNm(KEY);
        ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShippingActNo());
        ttOnlineReqJobParamcriteria.setParamValue02(FLAG_Y);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7005);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        ttOnlineReqJobParamService.create(reqJobList);
        
        return docDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnRegisterByFromCreate(W7001ShippingActCriteriaDomain, String)
     */
    public W7001ShippingActDomain transactOnRegisterByFromCreate(W7001ShippingActCriteriaDomain criteria, String reportDateFormat) 
        throws ApplicationException{
        // Get Shipping Actuality No. 
        // 船積実績Noの採番
        String shippingActNo = getShippingActNo(criteria.getShipperCd());
        // Register Shipping Actuality (Register screen). 
        // 船積実績の登録
        createTtShippingActOnRegister(shippingActNo, criteria);
        // Update Invoice (Register screen). 
        // インボイスの更新
        updateTtInvoiceOnRegisterByCreate(shippingActNo, criteria);
        // Create a sales information of the part number that is included in the Invoice Shipping Actuality Receive Order table when the Auto Invoice Register is 'Y'.
        // Auto Invoice Registerが'Y'の場合
        List<? extends TtShippingActOdrDomain> ttShippingActOdrList = null;
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // 船積実績対象品受注情報テーブルにインボイスに含まれる品番の受注情報を登録
            ttShippingActOdrList = createTwShippingActInvoiceOnRegister(shippingActNo, criteria);
        }
        
        if (CONTAINER_LOOSE_TYP_FULL_CONTAINER.equals(criteria.getContainerLooseTyp())
            && FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // Get the form output information to generate a document [Container Loading Plan]. 
            // PDFファイルを作成
            File pdfFile = l7001ReportService.searchShippingAct(shippingActNo, criteria.getShipperCd(), reportDateFormat);
            
            String fileId;
            InputStream fileStream = null;
            try {
                fileStream = new FileInputStream(pdfFile);
                fileId = createFileUpload(fileStream, shippingActNo, criteria.getDscId());
            } catch (FileNotFoundException e) {
                throw new SystemException(NXS_91_0001);
            } finally {
                try {
                    if (fileStream != null) {
                        fileStream.close();
                    }
                } catch (IOException e) {
                    throw new SystemException(NXS_91_0001);
                }
            }
            // Update FILE ID to Shipping Actuality (Register screen). 
            // 船積実績へのファイルID更新処理
            updateTtShippingActOnRegister(fileId, shippingActNo);
        }
        
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 START >>>>>
//        // Check AutoInvoiceRegisterFlg.
//        // インボイス自動作成フラグが'Y'
//        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
//            // Call Web service cooperation to CIGMA (Shipping Actuality registration). 
//            // Webサービス「船積実績登録」呼出し
//            callWebService7001(criteria, ttShippingActOdrList, shippingActNo);
//        }

        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7004);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_SHIPPING_ACT);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        BigDecimal brch = new BigDecimal(2);
        for(W7001ShippingActInvoiceDomain invoice : criteria.getShippingActInvoiceList()) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(invoice.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(invoice.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
        // Check AutoInvoiceRegisterFlg and CIGMA item.
        // インボイス自動作成フラグが'Y' かつ 受注情報がある（＝CIGMA品）
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg()) && !ttShippingActOdrList.isEmpty()) {
            // Call Web service cooperation to CIGMA (Shipping Actuality registration). 
            // Webサービス「船積実績登録」呼出し
            callWebService7001(criteria, ttShippingActOdrList, shippingActNo);
        }
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 END <<<<<
        
        // Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID. 
        // 削除対象データを船積実績対象インボイスワークテーブルから削除
        deleteTwShippingActInvoice(criteria.getDscId());
        
        criteria.setShippingActNo(shippingActNo);

        W7001ShippingActDomain shippingAct = searchOnRegisterInitByFromMain(criteria);
        shippingAct.setUpdateCount(1);
        
        return shippingAct;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnRegisterByFromMain(W7001ShippingActCriteriaDomain, String)
     */
    public W7001ShippingActDomain transactOnRegisterByFromMain(W7001ShippingActCriteriaDomain criteria, String reportDateFormat)  
        throws ApplicationException{
        // Update the Shipping Actuality (Register screen). 
        // 船積実績の更新
        int updateCount = updateTtShippingActOnRegister(criteria);
        // Update string pickled released update of Invoice data. 
        // インボイスデータの紐づけ解除更新（削除チェックがオンのもの）
        updateTtInvoiceOnRegisterByEdit(criteria);
        // Update of Shipping Actuality Receive Order.
        // 船積実績対象品受注情報の更新
        deleteTtShippingActOdrOnRegister(criteria);
        // Update Shipping Document data.
        // 船積書類データの更新
        deleteTtShippingDocumentOnRegister(criteria);
        
        // ファイルIdをファイル管理情報から削除
        for (W7001ShippingActDocDomain docDomain : criteria.getShippingActDocList()) {
            deleteFileManage(docDomain.getFileId(), docDomain.getComUpdateTimestamp(), criteria.getDscId());
        }

        if (CONTAINER_LOOSE_TYP_FULL_CONTAINER.equals(criteria.getContainerLooseTyp())
            && FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // Get the form output information to generate a document [Container Loading Plan]. 
            // PDFファイルを作成
            File pdfFile = l7001ReportService.searchShippingAct(criteria.getShippingActNo(), criteria.getShipperCd(), reportDateFormat);
            
            FileManagementDomain fileMng;
            try {
                // Get the File Manage from FILE ID. 
                fileMng = getFileManagementDomain(criteria.getClpFileIdList().get(0));
            } catch (FileManagementException e1) {
                throw new GscmApplicationException(e1.getErrorCode());
            } catch (UnsupportedEncodingException e1) {
                throw new SystemException(NXS_91_0001);
            }
            // Update FILE DATA. 
            // ファイルデータ更新
            try {
                uploadFileData(criteria.getClpFileIdList().get(0), pdfFile, criteria.getShippingActNo(), criteria.getDscId(), fileMng.getLastUpdateDate());
            } catch (FileManagementException e) {
                throw new GscmApplicationException(e.getErrorCode());
            } catch (IOException e) {
                throw new SystemException(NXS_91_0001);
            }
        }
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7004);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_SHIPPING_ACT);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        TwShippingActInvoiceCriteriaDomain twShippingActInvoiceCriteriaDomain
            = new TwShippingActInvoiceCriteriaDomain();
        twShippingActInvoiceCriteriaDomain.setDscId(criteria.getDscId());
        List<TwShippingActInvoiceDomain> resultList
            = twShippingActInvoiceService.searchByCondition(twShippingActInvoiceCriteriaDomain);
        BigDecimal brch = new BigDecimal(2);
        for(TwShippingActInvoiceDomain invoice : resultList) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(invoice.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(invoice.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(invoice.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(invoice.getDelFlg());
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
        // Check AutoInvoiceRegisterFlg.
        // インボイス自動作成フラグが'Y'
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // In case of EDI unlinked.
            // EDI未連係の場合
            // 20170314 ADD if
            if ("1".equals(criteria.getCigmaEdiStatus())) {
                // Call Web service cooperation to CIGMA (Shipping Actuality update). 
                // Webサービス「船積実績更新」呼出し
                callWebService7003(criteria);
            }
        }
        
        // Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID. 
        // 船積実績対象インボイスワークテーブルから削除
        deleteTwShippingActInvoice(criteria.getDscId());

        W7001ShippingActDomain shippingAct = searchOnRegisterInitByFromMain(criteria);
        shippingAct.setUpdateCount(updateCount);

        return shippingAct;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnRegisterCancel(W7001ShippingActCriteriaDomain)
     */
    public int transactOnRegisterCancel(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        // Delete data from Shipping Actuality. 
        // 船積実績の更新
        int updateCount = deleteTtShippigActOnRegisterForDelete(criteria.getShippingActNo(), criteria.getComUpdateTimestamp());
        // Make pegging cancellation of Invoice data. 
        // インボイスデータの紐付け解除更新
        updateTtInvoiceForDelete(criteria);
        // Update of Shipping Actuality Receive Order. 
        // 船積実績対象品受注情報データの更新
        deleteTtShippingActOdrOnRegisterByCancel(criteria);
        // Update Shipping Document data.
        // 船積書類データ更新
        deleteTtShippingDocumentOnRegister(criteria);
        // Get BoldFileId list.
        // ファイル管理データ削除
        for (String billdFileId : criteria.getBilldFileIdList()) {
            // Delete B/L file id from file manager.
            // B/LファイルIdをファイル管理情報から削除
            deleteFileManage(billdFileId, criteria.getDscId());
        }
        // Get ClpFileId list.
        for (String clpFileId : criteria.getClpFileIdList()) {
            // Delete CLP file id from file manager.
            // CLPファイルIDをファイル管理情報から削除
            deleteFileManage(clpFileId, criteria.getDscId());
        }
        // Delete file id from file manager.
        // ファイルIdをファイル管理情報から削除
        for (W7001ShippingActDocDomain docDomain : criteria.getShippingActDocList()) {
            deleteFileManage(docDomain.getFileId(), docDomain.getComUpdateTimestamp(), criteria.getDscId());
        }
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7004);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_SHIPPING_ACT);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        BigDecimal brch = new BigDecimal(2);
        for(W7001ShippingActInvoiceDomain invoice : criteria.getShippingActInvoiceList()) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(invoice.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(invoice.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(invoice.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(FLAG_Y);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
        // Check AutoInvoiceRegisterFlg.
        // インボイス自動作成フラグが'Y'
        if (FLAG_Y.equals(criteria.getAutoInvoiceRegisterFlg())) {
            // Call Web service cooperation to CIGMA (Shipping Actuality update). 
            // 船積実績削除Webサービスの呼び出し
            callWebService7004(criteria);
        }
        
        return updateCount;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnRegisterChangeStatus(W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDomain transactOnRegisterChangeStatus(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        // Update STATUS of Invoice. 
        // インボイスのステータス更新
        int updateCount = updateTtInvoiceByChangeStatus(criteria);
        
        TtInvoiceCriteriaDomain invoiceCriteria = new TtInvoiceCriteriaDomain();
        invoiceCriteria.setShippingActNo(criteria.getShippingActNo());
        invoiceCriteria.setDeleteFlg(FLAG_N);

        List<? extends TtInvoiceDomain> invoiceDomainList = ttInvoiceService.searchByCondition(invoiceCriteria);
        // Set ShiipingActStatus.
        // 船積実績ステータスの判定
        String updateStatus = StringUtils.EMPTY;
        for (TtInvoiceDomain invoiceDomain : invoiceDomainList) {
            if (!SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(invoiceDomain.getShippingActStatus())) {
                updateStatus = SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH;
                break;
            }
            updateStatus = SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH;
        }
        if (StringUtils.isEmpty(updateStatus)) {
            updateStatus = SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH;
        }
        if(!CONTAINER_LOOSE_TYP_LOOSE.equals(criteria.getContainerLooseTyp())) {
            if(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(updateStatus)
                && StringUtils.isEmpty(criteria.getClpGroup())) {
                throw new GscmApplicationException(NXS_E1_0039);
            }
        }
        
        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        ttShippingActDomain.setShippingActStatus(updateStatus);

        commonService.setCommonPropertyForUpdate(ttShippingActDomain, SCREEN_ID_W7004);

        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        ttShippingActCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        ttShippingActCriteria.setDeleteFlg(FLAG_N);
        
        // Update ShippingActInvoice table.
        // 船積実績のステータス更新
        ttShippingActService.updateByCondition(ttShippingActDomain, ttShippingActCriteria);
        // Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID. 
        // 船積実績対象インボイスワークの削除
        deleteTwShippingActInvoice(criteria.getDscId());
        
        W7001ShippingActDomain shippingAct = searchOnRegisterInitByFromMain(criteria);
        shippingAct.setUpdateCount(updateCount);
        
        // AI-JB キュー登録
        if(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(ttShippingActDomain.getShippingActStatus())) {
            String requestId = commonService.createRequestJob(SCREEN_ID_W7004);
            List<TtOnlineReqJobParamDomain> reqJobList
                = new ArrayList<TtOnlineReqJobParamDomain>();
            TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
                = new TtOnlineReqJobParamDomain();
            // 1件目
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
            ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
            ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_ALL_DOC);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            // 2件目
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(2));
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(criteria.getShippingActNo());
            ttOnlineReqJobParamcriteria.setParamValue02(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7004);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            ttOnlineReqJobParamService.create(reqJobList);
        }
        
        return shippingAct;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnUpdateCancel(W7001ShippingActCriteriaDomain)
     */
    public void transactOnUpdateCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        
        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        
        for(W7001ListDomain domain : criteria.getListDomainList()) {
            ttShippingActCriteria = new TtShippingActCriteriaDomain();
            ttShippingActDomain = new TtShippingActDomain();
            
            ttShippingActCriteria.setShippingActNo(domain.getShippingActNo());
            
            TtShippingActDomain result = ttShippingActService.lockByKeyNoWait(ttShippingActCriteria);
            if (result == null) {
                throw new GscmApplicationException(GSCM_E0_0010);
            }
            
            ttShippingActCriteria.setComUpdateTimestamp(domain.getComUpdateTimestamp());
            
            ttShippingActDomain.setClpGroup("");
            commonService.setCommonPropertyForUpdate(ttShippingActDomain, SCREEN_ID_W7001);
            
            ttShippingActService.updateByCondition(ttShippingActDomain, ttShippingActCriteria);
        }
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7001);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_CLP);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7001);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        BigDecimal brch = new BigDecimal(2);
        for(W7001ListDomain domain : criteria.getListDomainList()) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(domain.getShippingActNo());
            ttOnlineReqJobParamcriteria.setParamValue02(FLAG_Y);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7001);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W7001ShippingActService#transactOnRegisterClpGroup(W7001ShippingActCriteriaDomain)
     */
    public int transactOnRegisterClpGroup(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        
        // CLP Groupの取得
        String clpGroup = w7001ShippingActDao.getClpGroupSeqNextValue();
        
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        int totalUpdateCount = 0;
        
        // CLP Groupの登録
        for(W7001ListDomain domain : criteria.getListDomainList()) {
            shippingActCriteria = new W7001ShippingActCriteriaDomain();
            
            shippingActCriteria.setShippingActNo(domain.getShippingActNo());
            shippingActCriteria.setComUpdateTimestamp(domain.getComUpdateTimestamp());
            shippingActCriteria.setClpGroup(clpGroup);
            
            commonService.setCommonPropertyForUpdate(shippingActCriteria, SCREEN_ID_W7001);
            
            int updateCount = w7001ShippingActDao.updateTtShippingAct(shippingActCriteria);
            totalUpdateCount += updateCount;
        }
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W7001);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_CLP);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7001);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        BigDecimal brch = new BigDecimal(2);
        for(W7001ListDomain domain : criteria.getListDomainList()) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(domain.getShippingActNo());
            ttOnlineReqJobParamcriteria.setParamValue02(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W7001);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);
        
        return totalUpdateCount;
        
    }
    
    /**
     * Get Shipping Actuality.
     * <br />船積実績を取得します。
     * <pre>
     * - Search Shipping Actuality
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐船積実績の検索
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param preferredOrder Sort<br />
     * ソート
     * @return List of Shipping Actuality domain that has been acquired<br />
     * 取得した船積実績ドメインのリスト
     * @throws ApplicationException failed to get Shipping Actuality.<br />
     * 船積実績の取得に失敗した場合
     */
    protected List<? extends TtShippingActDomain> getShippingActDomain (String shippingActNo, String preferredOrder) 
        throws ApplicationException {

        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(shippingActNo);
        ttShippingActCriteria.setDeleteFlg(FLAG_N);

        if (!StringUtils.isEmpty(preferredOrder)) {
            ttShippingActCriteria.setPreferredOrder(preferredOrder);
        }
        
        List<TtShippingActDomain> ttShippingActList = ttShippingActService.searchByCondition(ttShippingActCriteria);

        return ttShippingActList;
    }
    
    /**
     * Get Invoice.
     * <br />インボイスを取得します。
     * <pre>
     * - Get Invoice
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐インボイスの検索
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Invoice list of domain<br />
     * インボイスドメインのリスト
     * @throws ApplicationException can not get a STATUS or LAST UPDATE DATE of Invoice.<br />
     * インボイスのステータス・最終更新日時を取得が出来ない場合。
     */
    protected List<? extends TtInvoiceDomain> getShippingActInvoiceDomain(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {

        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setShipperCd(shipperCd);
        ttInvoiceCriteria.setInvoiceNo(invoiceNo);
        ttInvoiceCriteria.setInvoiceIssueDt(invoiceIssueDt);
        ttInvoiceCriteria.setDeleteFlg(FLAG_N);
        
        List<TtInvoiceDomain> ttinvoiceList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);

        return ttinvoiceList;
    }
    
    /**
     * 
     * Get the Shipping Document information.
     * <br />船積書類情報を取得します。
     * <pre>
     * Get information from classified documents File Manage and Shipping Document, BRANCH, of FILE NAME.
     * - Get Shipping Document information
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)} .
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     * 
     * - File Manage Search
     *   Call getFileManagementDomain(String) with FILE ID that get from the Shipping Document.
     * 
     * - Set of search results to {@link W7001ShippingActDocDomain}.
     * </pre>
     * <pre>
     * 船積書類とファイル管理から書類区分、枝番、ファイル名の情報を取得します。
     * ‐船積書類情報の取得
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     *       
     * ‐ファイル管理検索
     *     船積書類から取得したファイルIDを引数に、{@link #getFileManagementDomain(String)}を呼び出します。
     * 
     * ‐検索結果の設定
     *     検索結果を{@link W7001ShippingActDocDomain}に設定して返します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param docTyp DOCUMENT TYPE<br />
     * ドキュメント種別
     * @return Shipping Document information domain<br />
     * 船積書類情報ドメイン
     * @throws ApplicationException can not get a Shipping Document information.<br />
     * 船積書類情報を取得が出来ない場合。
     */
    protected List<? extends W7001ShippingActDocDomain> getShippingActDocument(String shipperCd, String invoiceNo, Date invoiceIssueDt, String docTyp) 
        throws ApplicationException {

        TtShippingDocumentCriteriaDomain docCriteria = new TtShippingDocumentCriteriaDomain();
        docCriteria.setShipperCd(shipperCd);
        docCriteria.setInvoiceNo(invoiceNo);
        docCriteria.setInvoiceIssueDt(invoiceIssueDt);
        docCriteria.setDeleteFlg(FLAG_N);
        docCriteria.setDocTyp(docTyp);
        docCriteria.setSearchCountCheckFlg(false);
        
        String preferredOrder = "BRCH";
        docCriteria.setPreferredOrder(preferredOrder);
        
        List<TtShippingDocumentDomain> docList = ttShippingDocumentService.searchByCondition(docCriteria);
        if(docList.isEmpty()) {
            return new ArrayList<W7001ShippingActDocDomain>();
        }
        
        List<W7001ShippingActDocDomain> shippingACtDocList = new ArrayList<W7001ShippingActDocDomain>();
        for (TtShippingDocumentDomain docDomain : docList) {
            FileManagementDomain fileMngDomain;
            try {
                // Get the File Manage from FILE ID. 
                fileMngDomain = getFileManagementDomain(docDomain.getFileId());
            } catch (FileManagementException e) {
                return new ArrayList<W7001ShippingActDocDomain>();
            } catch (UnsupportedEncodingException e) {
                return new ArrayList<W7001ShippingActDocDomain>();
            }

            if(null == fileMngDomain) {
                return new ArrayList<W7001ShippingActDocDomain>();
            }
            
            W7001ShippingActDocDomain shippigActDocDomain = new W7001ShippingActDocDomain();
            shippigActDocDomain.setDocTyp(docDomain.getDocTyp());
            shippigActDocDomain.setBrch(docDomain.getBrch());
            shippigActDocDomain.setFileName(fileMngDomain.getFileName());
            
            shippingACtDocList.add(shippigActDocDomain);
        }
        return shippingACtDocList;
    }
    
    /**
     * 
     * Get the File Manage from FILE ID.
     * <br />ファイルIDからファイル管理を取得します。
     * <pre>
     * - File Manage Search
     *   Set the following items {@link FileManagementCriterionDomain},
     *    and call {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}.
     *     - FILE ID
     * </pre>
     * <pre>
     * ‐ファイル管理検索
     *     {@link FileManagementCriterionDomain}に以下の項目を設定し、
     *     {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}を呼び出します。
     *       ‐ファイルID
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @return File Manage domain<br />
     * ファイル管理ドメイン
     * @throws ApplicationException can not get the File Manage information<br />
     * ファイル管理情報を取得できない場合
     * @throws UnsupportedEncodingException can not get the File Manage information<br />
     * ファイル管理情報を取得できない場合
     * @throws FileManagementException can not get the File Manage information.<br />
     * ファイル管理情報を取得できない場合
     */
    protected FileManagementDomain getFileManagementDomain(String fileId) throws ApplicationException, FileManagementException, UnsupportedEncodingException {

        FileManagementCriterionDomain fileCriteria = new FileManagementCriterionDomain();
        fileCriteria.setFileId(fileId);

        List<FileManagementDomain> fileList = fileManagerServiceForStream.searchFileInfo(fileCriteria);
        if (fileList.isEmpty()) {
            return null;
        }
        return fileList.get(0);
    }
    
    /**
     * Update FILE DATA.
     * <br />ファイルデータを更新します。
     * <pre>
     * Update FILE DATA
     *   Allow to update the FILE DATA with an argument.
     *   STORED LIMIT sets the 12/31/9999.
     *   Call {@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)} .
     * </pre>
     * <pre>
     * ファイルデータの更新
     *    引数を使用してファイルデータの更新をします。
     *    保存期限は9999/12/31を設定します。
     *    {@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)}を呼び出します。
     * </pre>
     * 
     * @param fileId FILE ID<br />
     * ファイルID
     * @param file FILE DATA<br />
     * ファイルデータ
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param lastUpdateDate LAST UPDATE DATE<br />
     * 最終更新日
     * @throws FileManagementException can not update the FILE DATA<br />
     * ファイルデータの更新ができない場合
     * @throws IOException input and output exception occurs.<br />
     * 入出力例外が発生した場合
     */
    protected void uploadFileData(String fileId, File file, String shippingActNo, String dscId, Timestamp lastUpdateDate) throws FileManagementException, IOException {

        InputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            fileManagerServiceForStream.updateFileData(fileId, fileStream, shippingActNo, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId, lastUpdateDate);
        } catch (FileManagementException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } finally {
            if (fileStream != null) {
                fileStream.close();
            }
        }
    }
    
    /**
     * Search by DISPLAY ORDER specified the Shipping Actuality Invoice Work, and get first one.
     * <br />船積実績対象インボイスワークを指定した表示順で検索し、先頭1件のみを取得します。
     * <pre>
     * - Search Shipping Actuality versus Invoice Work
     *   Set the following items that were passed as an argument to {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     Refiners
     *       - Login DSC-ID
     *       - Display flag
     *     Setting the DISPLAY ORDER
     *  
     * - Set of search results
     *   Return the top 1.
     * </pre>
     * <pre>
     * ‐船積実績対インボイスワークの検索
     *     {@link TwShippingActInvoiceCriteriaDomain}に引数で渡された以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞り込み条件
     *         ‐ログインDSC-ID
     *         ‐表示フラグ
     *       表示順の設定
     * 
     * ‐検索結果の設定
     *     先頭1件を返します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param delFlg DELETE FLAG<br />
     * 削除フラグ
     * @param preferredOrder DISPLAY ORDER<br />
     * 表示順
     * @return 1 head of Shipping Actuality versus Invoice Work acquired<br />
     * 取得した船積実績対インボイスワークの先頭1件
     * @throws ApplicationException If the acquisition of the Shipping Actuality versus Invoice Work can not be.<br />
     * 船積実績対インボイスワークの取得ができない場合
     */
    protected TwShippingActInvoiceDomain getTwShippingActInvoiceBySort(String dscId, String delFlg, String preferredOrder) 
        throws ApplicationException {
        TwShippingActInvoiceCriteriaDomain criteria = new TwShippingActInvoiceCriteriaDomain();
        
        criteria.setDscId(dscId);
        criteria.setDelFlg(delFlg);
        criteria.setSearchCountCheckFlg(false);
        
        criteria.setPreferredOrder(preferredOrder);
        
        List<TwShippingActInvoiceDomain> resultList = twShippingActInvoiceService.searchByCondition(criteria);
        if(resultList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        return resultList.get(0);
    }
    
    /**
     * Search by DISPLAY ORDER have specified the Shipping Actuality Invoice Work and get first one.
     * <br />船積実績対象インボイスワークを指定した表示順で検索し、先頭1件のみを取得します。
     * <pre>
     * - Search Shipping Actuality versus Invoice Work
     *   Set the following items that were passed as an argument to {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     Refiners
     *       - Login DSC-ID
     *       - ETD
     *       - Display flag
     *     Setting the DISPLAY ORDER
     * 
     * - Set of search results
     *    Return first one.
     * </pre>
     * <pre>
     * ‐船積実績対インボイスワークの検索
     *     {@link TwShippingActInvoiceCriteriaDomain}に引数で渡された以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞り込み条件
     *         ‐ログインDSC-ID
     *         ‐ETD
     *         ‐表示フラグ
     *       表示順の設定
     * 
     * ‐検索結果の設定
     *     先頭1件を返します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param etd ETD<br />
     * ETD
     * @param delFlg ELETE FLAG<br />
     * 削除フラグ
     * @param preferredOrder DISPLAY ORDER<br />
     * 表示順
     * @return 1 head of Shipping Actuality versus Invoice Work acquired<br />
     * 取得した船積実績対インボイスワークの先頭1件
     * @throws ApplicationException If the acquisition of the Shipping Actuality versus Invoice Work can not be.<br />
     * 船積実績対インボイスワークの取得ができない場合
     */
    protected TwShippingActInvoiceDomain getTwShippingActInvoiceBySort(String dscId, Date etd, String delFlg, String preferredOrder) 
        throws ApplicationException {
        TwShippingActInvoiceCriteriaDomain criteria = new TwShippingActInvoiceCriteriaDomain();
        
        criteria.setDscId(dscId);
        criteria.setEtd(etd);
        criteria.setDelFlg(delFlg);
        
        criteria.setPreferredOrder(preferredOrder);
        
        List<TwShippingActInvoiceDomain> resultList = twShippingActInvoiceService.searchByCondition(criteria);
        if(resultList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        return resultList.get(0);
    }
    
    /**
     * Get initial VALUE of input items Shipping Actuality Register screen.
     * <br />船積実績Register画面の入力項目の初期値を取得します。
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Shipping Actuality Invoice Work (Invoice domain)<br />
     * 船積実績対象インボイスワーク（インボイスドメイン）
     * @throws ApplicationException If the initial VALUE of input items Shipping Actuality Register screen can not be obtained.<br />
     * 船積実績Register画面の入力項目の初期値が取得できない場合
     */
    protected W7001ShippingActInvoiceDomain getRegisterScreenByInit(String dscId) throws ApplicationException {

        W7001ShippingActInvoiceDomain resultDomain = new W7001ShippingActInvoiceDomain();
        // Get a record of the Shipping Actuality Invoice Work table specified by 'ETD' as a display order.
        // ETDの取得
        TwShippingActInvoiceDomain etdDomain = getTwShippingActInvoiceBySort(dscId, FLAG_N, "ETD");
        Date etd = etdDomain.getEtd();
        resultDomain.setEtd(etd);
        // Get a record of the Shipping Actuality Invoice Work table specified by 'CONTAINER_LOOSE_TYP' as a display order.
        // Cont.Loosの取得
        TwShippingActInvoiceDomain clDomain = getTwShippingActInvoiceBySort(dscId, FLAG_N, "CONTAINER_LOOSE_TYP");
        resultDomain.setContainerLooseTyp(clDomain.getContainerLooseTyp());
        // Get a record of the Shipping Actuality Invoice Work table specified by 'ETA DESC' as a display order.
        // ETAの取得
        TwShippingActInvoiceDomain etaDomain = getTwShippingActInvoiceBySort(dscId, etd, FLAG_N, "ETA DESC");
        resultDomain.setEta(etaDomain.getEta());
        // Get a record of the Shipping Actuality Invoice Work table specified by 'CARRIER_COMP_CD' as a display order.
        // Carrierの取得
        TwShippingActInvoiceDomain carrierDomain = getTwShippingActInvoiceBySort(dscId, etd, FLAG_N, "CARRIER_COMP_CD");
        resultDomain.setCarrierCompCd(carrierDomain.getCarrierCompCd());
        // Get a record of the Shipping Actuality Invoice Work table specified by 'VESSEL' as a display order.
        // Vesselの取得
        TwShippingActInvoiceDomain vesselDomain = getTwShippingActInvoiceBySort(dscId, etd, FLAG_N, "VESSEL");
        resultDomain.setVessel(vesselDomain.getVessel());
        
        return resultDomain;
    }
    
    /**
     * Register on the work table to get the Invoice associated with their Shipping Actuality No.
     * <br />指定した船積実績Noに紐付くインボイスを取得してワークテーブルに登録します。
     * <pre>
     * - Search Invoice table.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    Call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)} 
     *     - Shipping Actuality No
     * 
     * - Registration to the Shipping Actuality Invoice Work.
     *    Call {@link TwShippingActInvoiceService#create}.
     * </pre>
     * <pre>
     * ‐インボイステーブルの検索
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します
     *       ‐船積実績No
     * 
     * ‐船積実績対象インボイスワークへの登録
     *     {@link TwShippingActInvoiceService#create}を呼び出します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param screenId SCREEN ID<br />
     * 画面ID
     * @throws ApplicationException If the registration to the work table could not be.<br />
     * ワークテーブルへの登録ができなかった場合
     */
    protected void createTwShippingActInvoiceForRegister(String dscId, String shippingActNo, String screenId) 
        throws ApplicationException {
        
        // Delete Shipping Actuality Invoice Work Data for DSC-ID.
        TwShippingActInvoiceCriteriaDomain deleteCriteria = new TwShippingActInvoiceCriteriaDomain();
        deleteCriteria.setDscId(dscId);
        deleteCriteria.setSearchCountCheckFlg(false);
        if (twShippingActInvoiceService.searchCount(deleteCriteria) > 0) {
            twShippingActInvoiceService.deleteByCondition(deleteCriteria);
        }
        
        // Search Invoice Data for the Shipping Actuality No selected.
        TtInvoiceCriteriaDomain invoiceCriteria = new TtInvoiceCriteriaDomain();
        invoiceCriteria.setShippingActNo(shippingActNo);
        List<? extends TtInvoiceDomain> invoiceDomainList = ttInvoiceService.searchByCondition(invoiceCriteria); 
        
        // Create Shipping Actuality Invoice Work Data.
        List<TwShippingActInvoiceDomain> createDomainList = new ArrayList<TwShippingActInvoiceDomain>();
        for(TtInvoiceDomain invDomain : invoiceDomainList) {
            TwShippingActInvoiceDomain createCriteria = new TwShippingActInvoiceDomain();

            createCriteria.setDscId(dscId);
            createCriteria.setShipperCd(invDomain.getShipperCd());
            createCriteria.setInvoiceNo(invDomain.getInvoiceNo());
            createCriteria.setInvoiceIssueDt(invDomain.getInvoiceIssueDt());
            createCriteria.setPkgQty(invDomain.getPltzItemQty());
            createCriteria.setShippingActStatus(invDomain.getShippingActStatus());
            createCriteria.setDelFlg(FLAG_N);
            createCriteria.setComUpdateTimestamp(invDomain.getComUpdateTimestamp());
            commonService.setCommonPropertyForRegist(createCriteria, screenId);
            
            createDomainList.add(createCriteria);
        }
        createTwShippingActInvoice(createDomainList);
    }
    
    /**
     * Upload FILE DATA.
     * <br />ファイルデータをアップロードします。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *   Call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出します。
     * </pre>
     * 
     * @param fileData FILE DATA<br />
     * ファイルデータ
     * @param fileName FILE NAME<br />
     * ファイル名
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return FILE ID<br />
     * ファイルID
     * @throws ApplicationException can not upload FILE DATA.<br />
     * ファイルデータのアップロードができない場合
     */
    protected String createFileUpload(InputStream fileData, String fileName, String dscId)
        throws ApplicationException {
        
        String fileId;
        try {
            fileId = fileManagerServiceForStream.createFileUpload(fileData, fileName, DateUtil.getSaveLimitTerm(DateUtil.PERMANENT, null), dscId);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return fileId;
    }
    
    /**
     * Register Shipping Document.
     * <br />船積書類を登録します。
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param docTyp DOCUMENT TYPE<br />
     * ドキュメント種別
     * @param brch BRANCH<br />
     * 枝番
     * @param fileId FILE ID<br />
     * ファイルID
     * @param screenId SCREEN ID<br />
     * 画面ID
     * @return create count
     * @throws ApplicationException If the registration of Shipping Document can not be.<br />
     * 船積書類の登録ができない場合
     */
    protected int createTtShippingDocument(String shipperCd, String invoiceNo, Date invoiceIssueDt, String docTyp, BigDecimal brch, String fileId, String screenId) 
        throws ApplicationException {

        TtShippingDocumentDomain ttShippingDoc = new TtShippingDocumentDomain();
        ttShippingDoc.setShipperCd(shipperCd);
        ttShippingDoc.setInvoiceNo(invoiceNo);
        ttShippingDoc.setInvoiceIssueDt(invoiceIssueDt);
        ttShippingDoc.setDocTyp(docTyp);
        ttShippingDoc.setBrch(brch);
        ttShippingDoc.setFileId(fileId);
        ttShippingDoc.setDeleteFlg(FLAG_N);
        
        commonService.setCommonPropertyForRegist(ttShippingDoc, screenId);
        
        // Set Shipping Document data.
        // 船積書類の登録
        try {
            ttShippingDocumentService.create(ttShippingDoc);
        } catch (IntegrationLayerException e) {
            if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                throw new GscmApplicationException(GSCM_E0_0020);
            }
            throw e;
        }
        return 1;
    }
    
    /**
     * Check SHIPPING ACTUALITY STATUS.
     * <br />船積実績ステータス更新判定
     * <pre>
     * - Check SHIPPING ACTUALITY STATUS of parameter's Invoice domain list are '20':Complete Doc attach.
     * </pre>
     * <pre>
     * ‐引数で渡されたインボイスドメインリストの船積実績ステータスが
     *   すべて'20'：Complete Doc attachか判定します。
     * </pre>
     * 
     * @param invoiceList Invoice domain list<br />
     * インボイスドメインﾘｽﾄ
     * @return SHIPPING ACTUALITY STATUS is '20 'all: true, false otherwise case of Complete Doc attach<br />
     * 船積実績ステータスがすべて'20'：Complete Doc attachの場合true、それ以外false
     */
    protected boolean checkShippingActStatus(List<TtInvoiceDomain> invoiceList) {
        for (TtInvoiceDomain invoiceDomain : invoiceList) {
            if (!SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(invoiceDomain.getShippingActStatus())) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID.
     * <br />ログインDSC-IDに紐付く船積実績対象インボイスワークのデータを削除します。
     * <pre>
     * - Delete the Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Delete number<br />
     * 削除件数
     * @throws ApplicationException can not remove from the Shipping Actuality Invoice Work.<br />
     * 船積実績対象インボイスワークから削除できない場合
     */
    protected int deleteTwShippingActInvoice(String dscId) throws ApplicationException {

        TwShippingActInvoiceCriteriaDomain shippingActInvoiceCriteria = new TwShippingActInvoiceCriteriaDomain();
        shippingActInvoiceCriteria.setDscId(dscId);
        shippingActInvoiceCriteria.setSearchCountCheckFlg(false);
        // Delete Shipping Actuality Invoice data when target data exists.
        // 船積実績対象インボイスワーク削除（あれば）
        if (0 < twShippingActInvoiceService.searchCount(shippingActInvoiceCriteria)) {
            return twShippingActInvoiceService.deleteByCondition(shippingActInvoiceCriteria);
        }
        return 0;
    }
    
    /**
     * Delete the data of Shipping Actuality Invoice Work for deletion associated with their login DSC-ID.
     * <br />ログインDSC-IDに紐付く削除対象の船積実績対象インボイスワークのデータを削除します。
     * <pre>
     * - Delete the Shipping Actuality Invoice Work
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     - Login DSC-ID
     *     - DELETE FLAG: 'Y'
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐削除フラグ：'Y'
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @throws ApplicationException can not remove from the Shipping Actuality Invoice Work.<br />
     * 船積実績対象インボイスワークから削除できない場合
     */
    protected void deleteTwShippingActInvoiceForDelete(String dscId)  throws ApplicationException {

        TwShippingActInvoiceCriteriaDomain shippingActInvoiceCriteria = new TwShippingActInvoiceCriteriaDomain();
        shippingActInvoiceCriteria.setDscId(dscId);
        shippingActInvoiceCriteria.setDelFlg(FLAG_Y);
        shippingActInvoiceCriteria.setSearchCountCheckFlg(false);
        // Delete Shipping Actuality Invoice data when target data exists.
        // 船積実績対象インボイスワーク削除（あれば）
        if (0 < twShippingActInvoiceService.searchCount(shippingActInvoiceCriteria)) {
            twShippingActInvoiceService.deleteByCondition(shippingActInvoiceCriteria);
        }
    }
    
    /**
     * Delete Shipping Document data.
     * <br />船積書類データを削除します。
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param docTyp DOCUMENT TYPE<br />
     * ドキュメント種別
     * @param brch BRANCH<br />
     * 枝番
     * @return Delete number<br />
     * 削除件数
     * @throws ApplicationException can not delete the Shipping Document data.<br />
     * 船積書類データの削除ができない場合
     */
    protected int deleteTtShippingDocument(W7001ShippingActCriteriaDomain criteria, String docTyp, BigDecimal brch)
        throws ApplicationException {
        
        TtShippingDocumentCriteriaDomain ttShippingDocCriteria = new TtShippingDocumentCriteriaDomain();
        ttShippingDocCriteria.setShipperCd(criteria.getShipperCd());
        ttShippingDocCriteria.setInvoiceNo(criteria.getInvoiceNo());
        ttShippingDocCriteria.setInvoiceIssueDt(criteria.getInvoiceIssueDt());
        ttShippingDocCriteria.setDocTyp(docTyp);
        ttShippingDocCriteria.setBrch(brch);
        ttShippingDocCriteria.setDeleteFlg(FLAG_N);
        // Delete Shipping Document data.
        // 削除処理
        return ttShippingDocumentService.deleteByCondition(ttShippingDocCriteria);
    }
    
    /**
     * Delete FILE DATA.
     * <br />ファイルデータを削除します。
     * <pre>
     * Get LAST UPDATE DATE of target data and delete it.
     * 削除対象データの最終更新日を取得して、削除を行います。
     * </pre>
     * 
     * @param fileId FILE ID to be deleted<br />
     * 削除するファイルID
     * @param dscId Login DSC-ID to be deleted<br />
     * 削除するログインDSC-ID
     * @return Number of deleted<br />
     * 削除したレコード数
     * @throws ApplicationException can not delete FILE DATA.<br />
     * ファイルデータを削除できなかった場合
     */
    protected int deleteFileManage(String fileId, String dscId) throws ApplicationException {

        FileManagementDomain fileMng;
        try {
            fileMng = getFileManagementDomain(fileId);
        } catch (FileManagementException e) {
            return 0;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
        
        return deleteFileManage(fileId, fileMng.getLastUpdateDate(), dscId);
    }
    
    /**
     * Remove FILE DATA.
     * <br />ファイルデータを削除します。
     * 
     * @param fileId FILE ID to be deleted<br />
     * ファイルID
     * @param comUpdateTimestamp LAST UPDATE DATE<br />
     * 最終更新日時
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return  Number of deleted<br />
     * 削除したレコード数
     * @throws ApplicationException can not delete FILE DATA.<br />
     * ファイルデータを削除できなかった場合
     */
    protected int deleteFileManage(String fileId, Timestamp comUpdateTimestamp, String dscId) 
        throws ApplicationException {
        int cnt;
        
        try {
            cnt = fileManagerServiceForStream.deleteFile(fileId, comUpdateTimestamp, dscId);
        } catch (FileManagementException e) {
            throw new GscmApplicationException(e.getErrorCode());
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return cnt;
    }
    
    // --- Register画面関連のメソッド --------------------------------------------------------------
    /**
     * Get the time zone conversion date of Shipper.
     * <br />Shipperのタイムゾーン変換日付を取得します。
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Date obtained<br />
     * 取得した日付
     * @throws ApplicationException can not time zone conversion process of shipper.<br />
     * shipperのタイムゾーン変換処理が出来ない場合
     */
    protected Date getShipperSysTime(String shipperCd) throws ApplicationException {
        return DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.DAY_OF_MONTH);
    }
    
    /**
     * Get Shipping Actuality No.
     * <br />船積実績Noを採番します。
     * 
     * @param shipperCd (Use the time zone acquisition date) SHIPPER CODE<br />
     * 荷主コード（タイムゾーン日付取得に使用）
     * @return Shipping Actuality No that have trial<br />
     * 採番した船積実績No
     * @throws ApplicationException can not get Shipping Actuality No.<br />
     * 船積実績Noの採番が出来ない場合
     */
    protected String getShippingActNo(String shipperCd) throws ApplicationException {
        // Get the time zone conversion date of Shipper. 
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate = getShipperSysTime(shipperCd);
        
        String seqKey = String.format("M%s%s", shipperCd, DateUtil.formatDate(sysdate, "yyMM"));
        
        // Get a value of sequentially numbered in accordance with a key from the Sequence Master.
        // 連番の取得
        String pltzInstrNoSeq = commonService.transactSequence(seqKey, SEQ_TYP_SHIPPING_ACTUALITY_NO, 1, SCREEN_ID_W7004).get(0);
        
        return String.format("%s%s", seqKey, pltzInstrNoSeq);
    }
    
    /**
     * Register Shipping Actuality (Register screen).
     * <br />船積実績の登録をします（Register画面）。
     * <pre>
     * - Register of Shipping Actuality.
     *   Set the contents of the search conditions in domain {@link TtShippingActDomain},
     *    and call {@link TtShippingActService#create(TtShippingActDomain)}.
     * </pre>
     * <pre>
     * ‐船積実績の登録
     *     {@link TtShippingActDomain}に検索条件ドメインの内容を設定し、
     *     {@link TtShippingActService#create(TtShippingActDomain)}を呼び出します。
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No that have numbered<br />
     * 採番した船積実績No
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not regist Shipping Actuality.<br />
     * 船積実績の登録ができない場合
     */
    protected void createTtShippingActOnRegister(String shippingActNo, W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {

        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttShippingActDomain, criteria);
        ttShippingActDomain.setShippingActNo(shippingActNo);
        ttShippingActDomain.setRegisterDt(getShipperSysTime(criteria.getShipperCd()));
        ttShippingActDomain.setShippingActStatus(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH);
        ttShippingActDomain.setDeleteFlg(FLAG_N);

        commonService.setCommonPropertyForRegist(ttShippingActDomain, SCREEN_ID_W7004);
        // Set Shipping Actuality data.
        // 船積実績の登録
        ttShippingActService.create(ttShippingActDomain);
    }
    
    /**
     * 
     * Update the Shipping Actuality (Register screen).
     * <br />船積実績を更新します（Register画面）。
     * <pre>
     * - Update Shipping Actuality.
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - The contents of the search criteria area of ​​the screen
     *     Narrowing conditions
     *       - Shipping Actuality No area of search criteria
     *       - LAST UPDATE DATE area of search criteria
     * </pre>
     * <pre>
     * ‐船積実績の更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐画面の検索条件エリアの内容
     *       絞込条件
     *         ‐検索条件エリアの船積実績No
     *         ‐検索条件エリアの最終更新日時
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not update the Shipping Actuality.<br />
     * 船積実績を更新できない場合
     */
    protected int updateTtShippingActOnRegister(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        
        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttShippingActDomain, criteria);
        ttShippingActDomain.setRegisterDt(getShipperSysTime(criteria.getShipperCd()));

        commonService.setCommonPropertyForUpdate(ttShippingActDomain, SCREEN_ID_W7004);
        
        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(criteria.getShippingActNo());
        ttShippingActCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        // Update Shipping Actuality data.
        // 船積実績の更新
        return ttShippingActService.updateByCondition(ttShippingActDomain, ttShippingActCriteria);
    }
    
    /**
     * Update FILE ID to Shipping Actuality (Register screen).
     * <br />船積実績へのファイルIDを更新します（Register画面）。
     * <pre>
     * - FILE ID update process to Shipping Actuality
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - CLP FILE ID: FILE ID that obtained in FILE DATA registration
     *     Narrowing conditions
     *       - Shipping Actuality No: Shipping Actuality No of screen
     * </pre>
     * <pre>
     * ‐船積実績へのファイルID更新処理
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐CLPファイルID：ファイルデータ登録で取得したファイルID
     *       絞込条件
     *         ‐船積実績No：画面の船積実績No
     * </pre>
     * 
     * @param clpFileId CLP FILE ID (updates)<br />
     * CLPファイルID（更新内容）
     * @param shippingActNo Shipping Actuality No (narrowing-down condition)<br />
     * 船積実績No（絞込条件）
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not update the FILE ID to Shipping Actuality.<br />
     * 船積実績へのファイルIDを更新できない場合
     */
    protected int updateTtShippingActOnRegister(String clpFileId, String shippingActNo) throws ApplicationException {

        TtShippingActDomain ttShippingActDomain = new TtShippingActDomain();
        ttShippingActDomain.setClpFileId(clpFileId);

        commonService.setCommonPropertyForUpdate(ttShippingActDomain, SCREEN_ID_W7004);
        
        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(shippingActNo);
        // Update Shipping Actuality data.
        // 船積実績の更新
        return ttShippingActService.updateByCondition(ttShippingActDomain, ttShippingActCriteria);
    }
    
    /**
     * Soft delete data from Shipping Actuality.
     * <br />船積実績から削除対象データを削除します。
     * <pre>
     * - Update Shipping Actuality.
     *   Set the {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#deleteByCondition(TtShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐船積実績の更新
     *     {@link TtShippingActCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActService#deleteByCondition(TtShippingActCriteriaDomain)}を呼出します。
     *     
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param comUpdateTimestamp LAST UPDATE DATE<br />
     * 最終更新日時
     * @return Number of delete count<br />
     * 削除件数
     * @throws ApplicationException can not delete a logical target data from Shipping Actuality.<br />
     * 船積実績から削除対象データを削除出来ない場合
     */
    protected int deleteTtShippigActOnRegisterForDelete(String shippingActNo, Timestamp comUpdateTimestamp) 
        throws ApplicationException {

        TtShippingActCriteriaDomain ttShippingActCriteria = new TtShippingActCriteriaDomain();
        ttShippingActCriteria.setShippingActNo(shippingActNo);
        ttShippingActCriteria.setSearchCountCheckFlg(false);
        
        // Delete Shipping Actuality
        int count = 0;
        if (ttShippingActService.searchCount(ttShippingActCriteria) > 0) {
            ttShippingActCriteria.setComUpdateTimestamp(comUpdateTimestamp);
            count = ttShippingActService.deleteByCondition(ttShippingActCriteria);
        }
        return count;
    }
    
    /**
     * Make pegging cancellation of Invoice data.
     * <br />インボイスデータの紐付解除を行います。
     * <pre>
     * - Pegging released update of Invoice data.
     *   Set the narrowing-down condition updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐インボイスデータの紐付解除更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞込条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteriaDomain criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not de-pegging of Invoice data.<br />
     * インボイスデータの紐付解除ができない場合
     */
    protected int updateTtInvoiceForDelete(W7001ShippingActCriteriaDomain criteriaDomain) 
        throws ApplicationException {

        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setShippingActNo("");
        ttInvoiceDomain.setShippingActStatus("");
  
        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, SCREEN_ID_W7004);
 
        W7001ShippingActInvoiceDomain invoice = criteriaDomain.getShippingActInvoiceList().get(0);
        
        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setShippingActNo(criteriaDomain.getShippingActNo());
        ttInvoiceCriteria.setComUpdateTimestamp(invoice.getComUpdateTimestamp());
        
        // Update Invoice data.
        // インボイスの更新
        return ttInvoiceService.updateByCondition(ttInvoiceDomain, ttInvoiceCriteria);
    }
    
    /**
     * Update Invoice (Register screen).
     * <br />インボイスの更新をします（Register画面）。
     * <pre>
     * - Update of Invoice.
     *   Set the refiners updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content
     *       - The Shipping Actuality No: Shipping Actuality No that numbered
     *       - SHIPPING ACTUALITY STATUS: '10 '(. Imcomplete Doc Attach)
     *     Narrowing conditions
     *       - SHIPPER CODE
     *       - Invoice No of the target data
     *       - INVOICE ISSUE DATE of the target data
     *       - LAST UPDATE DATE of the target data
     * </pre>
     * <pre>
     * ‐インボイスの更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐船積実績No：採番した船積実績No
     *         ‐船積実績ステータス：'10'（Incomplete Doc. Attach）
     *       絞込条件
     *         ‐荷主コード
     *         ‐対象データのインボイスNo
     *         ‐対象データのインボイス発行日
     *         ‐対象データの最終更新日時
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No that have numbered<br />
     * 採番した船積実績No
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not update Invoice.<br />
     * インボイスの更新が出来ない場合
     */
    protected int updateTtInvoiceOnRegisterByCreate(String shippingActNo, W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {

        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setShippingActNo(shippingActNo);
        ttInvoiceDomain.setShippingActStatus(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH);

        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, SCREEN_ID_W7004);
        
        List<TtInvoiceDomain> updateList = new ArrayList<TtInvoiceDomain>();
        List<TtInvoiceCriteriaDomain> criteriaList = new ArrayList<TtInvoiceCriteriaDomain>();
        
        for (W7001ShippingActInvoiceDomain invoice : criteria.getShippingActInvoiceList()) {
            TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
            
            ttInvoiceCriteria.setShipperCd(criteria.getShipperCd());
            ttInvoiceCriteria.setInvoiceNo(invoice.getInvoiceNo());
            ttInvoiceCriteria.setInvoiceIssueDt(invoice.getInvoiceIssueDt());
            ttInvoiceCriteria.setComUpdateTimestamp(invoice.getComUpdateTimestamp());
        
            updateList.add(ttInvoiceDomain);
            criteriaList.add(ttInvoiceCriteria);
        }
        // Update Invoice data.
        // インボイスの更新
        return ttInvoiceService.updateByCondition(updateList, criteriaList);
    }
    
    /**
     * Update STATUS of Invoice.
     * <br />インボイスのステータスを更新します。
     * <pre>
     * - STATUS update of Invoice.
     *   Set the narrowing-down condition updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content
     *       - SHIPPING ACTUALITY STATUS
     *         In the case of 10, SHIPPING ACTUALITY STATUS of the screen 20
     *         In the case of 20, SHIPPING ACTUALITY STATUS of the screen 10
     *     Narrowing conditions
     *       - SHIPPER CODE screen
     *       - Invoice No to be updated
     *       - LAST UPDATE DATE to be updated
     *       - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐インボイスのステータス更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞込条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐船積実績ステータス
     *             画面の船積実績ステータスが10の場合、20
     *             画面の船積実績ステータスが20の場合、10
     *       絞込条件
     *         ‐画面の荷主コード
     *         ‐更新対象のインボイスNo
     *         ‐更新対象の最終更新日時
     *         ‐削除フラグ：'N'
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not update the STATUS of Invoice.<br />
     * インボイスのステータスを更新できない場合
     */
    protected int updateTtInvoiceByChangeStatus(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        W7001ShippingActInvoiceDomain invoiceDomain = criteria.getShippingActInvoiceList().get(0);
        
        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        if(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH.equals(invoiceDomain.getShippingActStatus())) {
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmNxsCompDomain resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            if(FLAG_N.equals(resultTmNxsCompDomain.getDnBaseFlg())
                || TRNS_CD_TRUCK.equals(criteria.getTrnsCd())) {
                //no check
            } else {
                if(criteria.getBilldFileIdList().size() == 0) {
                    throw new GscmApplicationException(NXS_E1_0026);
                }
            }
            ttInvoiceDomain.setShippingActStatus(SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH);
        } else {
            ttInvoiceDomain.setShippingActStatus(SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH);
        }

        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, SCREEN_ID_W7004);
        
        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setShipperCd(criteria.getShipperCd());
        
        ttInvoiceCriteria.setInvoiceNo(invoiceDomain.getInvoiceNo());
        ttInvoiceCriteria.setComUpdateTimestamp(invoiceDomain.getComUpdateTimestamp());
        ttInvoiceCriteria.setDeleteFlg(FLAG_N);
        // Update Invoice data.
        // インボイスの更新
        return ttInvoiceService.updateByCondition(ttInvoiceDomain, ttInvoiceCriteria);
    }
    
    /**
     * Create a sales information of the part number that is included in the Invoice Shipping Actuality Receive Order table.
     * <br />船積実績対象品受注情報テーブルにインボイスに含まれる品番の受注情報を登録します。
     * <pre>
     * - Data acquisition to be registered in the Shipping Actuality Receive Order,
     *   Specify the search criteria argument domain of the screen,
     *    and call {@link W7001ShippingActDao#searchTwShippingActInvoice(W7001ShippingActCriteriaDomain)}.
     * 
     * - Register of Shipping Actuality order entry information,
     *   Is set to TtShippingActOdrDomain registration data acquired,
     *    Call {@link TtShippingActOdrService#create(TtShippingActOdrDomain)}.
     * </pre>
     * <pre>
     * ‐船積実績対象品受注情報に登録するデータ取得
     *     画面の検索条件ドメインを引数に指定して、
     *     {@link W7001ShippingActDao#searchTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐船積実績商品受注情報の登録
     *     取得した登録データを{@link TtShippingActOdrDomain}に設定し、
     *     {@link TtShippingActOdrService#create(TtShippingActOdrDomain)}を呼び出します。
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No that have numbered<br />
     * 採番した船積実績No
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return List of Shipping Actuality Receive Order registered<br />
     * 登録した船積実績対象品受注情報のリスト
     * @throws ApplicationException can not create a sales information of the part number that is included in the Invoice Shipping Actuality Receive Order table.<br />
     * 船積実績対象品受注情報テーブルにインボイスに含まれる品番の受注情報を登録出来なかった場合
     */
    protected  List<TtShippingActOdrDomain> createTwShippingActInvoiceOnRegister(String shippingActNo, W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        // Get the order information corresponding to the search condition. 
        // 船積実績対象品受注情報に登録するデータ取得
        List<? extends W7001ShippingActInvoiceDomain> invoiceList = w7001ShippingActDao.searchTwShippingActInvoice(criteria);
        
        List<TtShippingActOdrDomain> ttShippingActOdrList = new ArrayList<TtShippingActOdrDomain>();
        if(!invoiceList.isEmpty()) {
            for(W7001ShippingActInvoiceDomain invoiceDomain : invoiceList) {
                for (W7001ShippingActPltzDomain pltzDomain : invoiceDomain.getShippingActPltzList()) {
                    for (W7001ShippingActItemDomain itemDomain : pltzDomain.getShippingActItemList()) {
                        TtShippingActOdrDomain createDomain = new TtShippingActOdrDomain();
                        
                        createDomain.setShippingActNo(shippingActNo);
                        createDomain.setShipperCd(invoiceDomain.getShipperCd());
                        createDomain.setInvoiceNo(invoiceDomain.getInvoiceNo());
                        createDomain.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
                        createDomain.setContainerNo(pltzDomain.getContainerNo());
                        createDomain.setMainMark(pltzDomain.getMainMark());
                        createDomain.setItemNo(itemDomain.getItemNo());
                        createDomain.setPkgCd(itemDomain.getPkgCd());
                        createDomain.setCustomerItemNo(itemDomain.getCustomerItemNo());
                        createDomain.setCustomerPoNo(itemDomain.getCustomerPoNo());
                        createDomain.setEtdDueDt(itemDomain.getEtdDueDt());
                        createDomain.setCustomerItemNoOrg(itemDomain.getCustomerItemNoOrg());
                        createDomain.setOdrCtrlNo(itemDomain.getOdrCtrlNo());
                        createDomain.setShippedQty(itemDomain.getAllocQty());
                        createDomain.setSalesCompPoNo(itemDomain.getSalesCompPoNo());
                        createDomain.setShippingLot(itemDomain.getShippingLot());
                        createDomain.setPlntCd(pltzDomain.getPlntCd());
                        createDomain.setCartonQty(itemDomain.getCartonQty());
                        createDomain.setDeleteFlg(FLAG_N);
                        
                        commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W7004);
                            
                        ttShippingActOdrList.add(createDomain);
                    }
                }
            }
        }
        // Set Shipping Actuality Receive Order data.
        // 船積実績対象品受注情報の登録
        ttShippingActOdrService.create(ttShippingActOdrList);
        
        return ttShippingActOdrList;
    }
    
    /**
     * Update string pickled released update of Invoice data.
     * <br />インボイスデータの紐づけ解除更新
     * <pre>
     * - String pickled released update of Invoice data.
     *   Set the Filter information updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(List, List)}.
     *     Updated content
     *       - Shipping Actuality No: NULL
     *       - SHIPPING ACTUALITY STATUS: NULL
     *     Narrowing conditions
     *       - {@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}
     *         SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     *       - LAST UPDATE DATE of the screen
     * </pre>
     * <pre>
     * ‐インボイスデータの紐づけ解除更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞り込み情報を設定し、
     *     {@link TtInvoiceService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         ‐船積実績No：NULL
     *         ‐船積実績ステータス：NULL
     *       絞込条件
     *         ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *           荷主コード、インボイスNo、インボイス発行日
     *         ‐画面の最終更新日時
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException can not string pickled released update of Invoice data.<br />
     * インボイスデータの紐づけ解除更新が出来ない場合
     */
    protected int updateTtInvoiceOnRegisterByEdit(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        List<TtInvoiceDomain> updateList = new ArrayList<TtInvoiceDomain>();
        List<TtInvoiceCriteriaDomain> criteriaList = new ArrayList<TtInvoiceCriteriaDomain>();
        

        TtInvoiceDomain ttInvoiceDomain = new TtInvoiceDomain();
        ttInvoiceDomain.setShippingActNo("");
        ttInvoiceDomain.setShippingActStatus("");

        commonService.setCommonPropertyForUpdate(ttInvoiceDomain, SCREEN_ID_W7004);
        
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            // Set update data.
            TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
            ttInvoiceCriteria.setShipperCd(invoiceDomain.getShipperCd());
            ttInvoiceCriteria.setInvoiceNo(invoiceDomain.getInvoiceNo());
            ttInvoiceCriteria.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
            ttInvoiceCriteria.setComUpdateTimestamp(invoiceDomain.getComUpdateTimestamp());
            
            criteriaList.add(ttInvoiceCriteria);
            updateList.add(ttInvoiceDomain);
        }
        // Update Invoice data.
        // インボイスの更新
        int count = 0;
        if (updateList.size() > 0) {
            count = ttInvoiceService.updateByCondition(updateList, criteriaList);
        }
        
        return count;
    }
    
    /**
     * Delete for Shipping Actuality Receive Order 
     * <br />船積実績対象品受注情報データの削除
     * <pre>
     * Set {@link TtShippingActOdrCriteriaDomain},
     * and call {@link TtShippingActOdrService#deleteByCondition(TtShippingActOdrCriteriaDomain)}.
     *   Conditions
     *      - Shipping Actuality No of screen
     *      - {@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}
     *        SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * {@link TtShippingActOdrCriteriaDomain}に絞り込み条件を設定し、
     * {@link TtShippingActOdrService#deleteByCondition(TtShippingActOdrCriteriaDomain)}を呼び出します。
     *   更新内容
     *     ‐削除フラグ：'Y'
     *   絞込条件
     *     ‐画面の船積実績No
     *     ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *       荷主コード、インボイスNo、インボイス発行日
     * </pre>
     * 
     * @param criteria criteria Search conditions domain
     * <br />検索条件ドメイン
     * @return Number of delete count.
     * <br />削除件数
     * @throws ApplicationException can not delete the Shipping Actuality Receive Order.<br />
     * 船積実績対象品受注情報の削除が出来なかった場合
     */
    protected int deleteTtShippingActOdrOnRegister(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        int count = 0;
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            if (FLAG_Y.equals(invoiceDomain.getDeleteFlagForOdr())) {
                TtShippingActOdrCriteriaDomain criteriaDomain = new TtShippingActOdrCriteriaDomain();
                criteriaDomain.setShippingActNo(criteria.getShippingActNo());
                criteriaDomain.setShipperCd(invoiceDomain.getShipperCd());
                criteriaDomain.setInvoiceNo(invoiceDomain.getInvoiceNo());
                criteriaDomain.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
                criteriaDomain.setSearchCountCheckFlg(false);
                
                // Delete Shipping Actuality Receive Order 
                if (ttShippingActOdrService.searchCount(criteriaDomain) > 0) {
                    count += ttShippingActOdrService.deleteByCondition(criteriaDomain);
                }
            }
        }
        return count;
    }
    
    /**
     * Update of Shipping Actuality Receive Order
     * <br />船積実績対象品受注情報の更新
     * <pre>
     * Set the {@link TtShippingActOdrCriteriaDomain},
     *  and call {@link TtShippingActOdrService#deleteByCondition(TtShippingActOdrCriteriaDomain)}.
     *   Narrowing conditions
     *     - Shipping Actuality No of screen
     * </pre>
     * <pre>
     * {@link TtShippingActOdrCriteriaDomain}に絞り込み条件を設定し、
     * {@link TtShippingActOdrService#deleteByCondition(TtShippingActOdrCriteriaDomain)}を呼び出します。
     *   絞込条件
     *     ‐画面の船積実績No
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Number of delete count.<br />
     * 削除件数
     * @throws ApplicationException can not update the Shipping Actuality Receive Order.<br />
     * 船積実績対象品受注情報の削除が出来なかった場合
     */
    protected int deleteTtShippingActOdrOnRegisterByCancel(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        
        if (!FLAG_Y.equals(criteria.getLockFlagForOdr())) {
            return 0;
        }
        TtShippingActOdrCriteriaDomain criteriaDomain = new TtShippingActOdrCriteriaDomain();
        criteriaDomain.setShippingActNo(criteria.getShippingActNo());
        criteriaDomain.setSearchCountCheckFlg(false);
        
        // Delete Shipping Actuality Receive Order 
        int count = 0;
        if (ttShippingActOdrService.searchCount(criteriaDomain) > 0) {
            count = ttShippingActOdrService.deleteByCondition(criteriaDomain);
        }
        return count;
    }
    
    /**
     * Delete Shipping Document.
     * <br />船積書類データの更新
     * <pre>
     * Set the {@link TtShippingDocumentCriteriaDomain},
     *  and call {@link TtShippingDocumentService#deleteByCondition(TtShippingDocumentCriteriaDomain)}.
     *   Narrowing conditions
     *     - {@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}
     *       SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * {@link TtShippingDocumentCriteriaDomain}に絞り込み条件を設定し、
     * {@link TtShippingDocumentService#deleteByCondition(TtShippingDocumentCriteriaDomain)}を呼出します。
     *   絞込条件
     *     ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *       荷主コード、インボイスNo、インボイス発行日
     * </pre>
     * 
     * @param criteria criteria Search conditions domain
     * <br />検索条件ドメイン
     * @return Number of delete count.
     * <br />削除件数
     * @throws ApplicationException can not update the Shipping Document data.<br />
     * 船積書類データの削除ができない場合
     */
    protected int deleteTtShippingDocumentOnRegister(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        int count = 0;
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {

            if (FLAG_Y.equals(invoiceDomain.getDeleteFlagForDoc())) {
                TtShippingDocumentCriteriaDomain criteriaDomain = new TtShippingDocumentCriteriaDomain();
                
                criteriaDomain.setShipperCd(invoiceDomain.getShipperCd());
                criteriaDomain.setInvoiceNo(invoiceDomain.getInvoiceNo());
                criteriaDomain.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
                criteriaDomain.setSearchCountCheckFlg(false);
                // UT205 CML ATTACH CSV ADD START
                // It does not delete CML attach CSV from TT_SHIPPING_DOCUMENT when shipping actuality cancellation.
                // Substituted by "<=" because it does not correspond to the conditions "!=", SACT. If you want to add a DOC_TYP must be careful.
                // 船積み実績キャンセル時に船積み書類からCMLアタッチCSVが削除されないようにする。
                // SACTでは!=条件に対応していないため<=で代用。ドキュメント種別を追加する場合は注意が必要。
                criteriaDomain.setDocTypLessThanEqual(DOC_TYP_OTHERS);
                // UT205 CML ATTACH CSV ADD END
                
                // Delete Shipping document
                if (ttShippingDocumentService.searchCount(criteriaDomain) > 0) {
                    count += ttShippingDocumentService.deleteByCondition(criteriaDomain);
                }
                
            }
        }
        return count;
    }
    
    /**
     * Call Web service cooperation to CIGMA (Shipping Actuality registration).
     * <br />CIGMAへの連携Webサービスを呼び出します（船積実績登録）。
     * <pre>
     * - (Acquisition CUSTOMER_CD, of LGCY_SHIP_TO) acquisition of data to be set to the argument.
     *   The argument to the search criteria domain of the screen,
     *    and call {@link W7001ShippingActDao#searchTtPltz(W7001ShippingActCriteriaDomain)}.
     * 
     * - (Invoice No. acquisition of interest) acquisition of data to be set to the argument.
     *   The argument to the search criteria domain of the screen,
     *    and call {@link W7001ShippingActDao#searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain)}.
     * 
     * - Call of Shipping Actuality registration Web Service.
     *   Set the following items {@link Ws7001ParamDomain},
     *    and call {@link Ws7001RestService#createShippingAct(String, Ws7001ParamDomain)}.
     *     - Search conditions domain of the screen
     *     - Argument Configuration data values ​​(CUSTOMER_CD, LGCY_SHIP_TO, Invoice No.)
     *     - Number of order information that is included in the Invoice that registered with the Shipping Actuality Receive Order table
     * </pre>
     * <pre>
     * ‐引数へ設定するデータの取得（CUSTOMER_CD、LGCY_SHIP_TOの取得）
     *     画面の検索条件ドメインを引数にし、
     *     {@link W7001ShippingActDao#searchTtPltz(W7001ShippingActCriteriaDomain)}を呼び出します。
     *     
     * ‐引数へ設定するデータの取得（対象のインボイスNo.取得）
     *     画面の検索条件ドメインを引数にし、
     *     {@link W7001ShippingActDao#searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐船積実績登録Webサービスの呼び出し
     *     {@link Ws7001ParamDomain}に以下の項目を設定し、
     *     {@link Ws7001RestService#createShippingAct(String, Ws7001ParamDomain)}を呼び出します。
     *       ‐画面の検索条件ドメイン
     *       ‐取得した引数設定データ（CUSTOMER_CD、LGCY_SHIP_TO、インボイスNo.）
     *       ‐船積実績対象品受注情報テーブルに登録したインボイスに含まれる品番の受注情報
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param ttShippingActOdrList Shipping Actuality Receive Order<br />
     * 船積実績対象品受注情報
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @throws ApplicationException Part of order information that is included in the Invoice which was registered in the table.<br />
     * CIGMAへの連携Webサービスを呼び出しが出来ない場合
     */
    protected void callWebService7001 (W7001ShippingActCriteriaDomain criteria, List<? extends TtShippingActOdrDomain> ttShippingActOdrList, String shippingActNo) 
        throws ApplicationException {
        
        List<? extends W7001ShippingActPltzDomain> pltzList = w7001ShippingActDao.searchTtPltz(criteria);
        
        W7001ShippingActCriteriaDomain criteriaForInvoiceNo = new W7001ShippingActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteriaForInvoiceNo, criteria);
        criteriaForInvoiceNo.setShippingActNo(shippingActNo);
        
        List<? extends W7001ShippingActOdrDomain> odrList = w7001ShippingActDao.searchTtShippingActOdrByInvoiceNo(criteriaForInvoiceNo);
        // Create Web Services (Ws7001) call parameters. 
        // Webサービス呼び出し用パラメータの作成
        Ws7001ParamDomain paramDomain = createWs7001ParamDomain(criteria, pltzList, odrList, ttShippingActOdrList);
        // Register the Shipping Actuality in a file on CIGMA by using the (WS7001) Web Services 
        // 船積実績登録Webサービスの呼出し
        ResultDomain resultDomain =  ws7001RestService.createShippingAct(criteria.getShipperCd(), paramDomain);
        if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
            if (resultDomain.getErrorList().isEmpty()) {
                throw new SystemException(NXS_91_0001);
            } else {
                throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode());
            }
        }
    }
    
    /**
     * Create Web Services (Ws7001) call parameters.
     * <br />Webサービス（Ws7001）呼び出し用パラメータの作成
     * 
     * @param criteria Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @param pltzList CUSTOMER_CD to the acquired list of LGCY_SHIP_TO<br />
     * 取得したCUSTOMER_CD、LGCY_SHIP_TOのリスト
     * @param odrList List of Invoice No to the acquired<br />
     * 取得したインボイスNoのリスト
     * @param ttShippingActOdrList Shipping Actuality Receive Order<br />
     * 船積実績対象品受注情報
     * @return Web Service (Ws7001) call parameters<br />
     * Webサービス（Ws7001）呼び出し用パラメータ
     */
    protected Ws7001ParamDomain createWs7001ParamDomain(W7001ShippingActCriteriaDomain criteria
        , List<? extends W7001ShippingActPltzDomain> pltzList, List<? extends W7001ShippingActOdrDomain> odrList
        , List<? extends TtShippingActOdrDomain> ttShippingActOdrList) {
        // Convert type to String from date.
        // Date → String変換用
        SimpleDateFormat sdf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        String vesselName = criteria.getVessel();
        if (vesselName.length() > 15) {
            vesselName = vesselName.substring(0, 15);
        }
        
        Ws7001ParamDomain paramDomain = new Ws7001ParamDomain();
        paramDomain.setVesselName(vesselName);
        paramDomain.setAtd(StringUtils.defaultString(sdf.format(criteria.getAtd())));
        paramDomain.setEta(StringUtils.defaultString(sdf.format(criteria.getEta())));
        paramDomain.setStatusFlg("1");
        // Set target Invoice data.
        // 登録対象インボイス配列
        List<Ws7001ParamItemDomain> invoiceList = new ArrayList<Ws7001ParamItemDomain>();
        for(W7001ShippingActPltzDomain pltzDomain : pltzList) {
            Ws7001ParamItemDomain invoiceDomain = new Ws7001ParamItemDomain();
            
            invoiceDomain.setInvoiceNoHeader(StringUtils.defaultString(pltzDomain.getInvoiceNo()));
            invoiceDomain.setCustomerNo(StringUtils.defaultString(pltzDomain.getCustomerCd()));
            invoiceDomain.setShipToNo(StringUtils.defaultString(pltzDomain.getLgcyShipTo()));
            invoiceDomain.setTransportationCode(StringUtils.defaultString(pltzDomain.getTrnsCdOrg()));
            invoiceDomain.setInvoiceIssueDt(sdf.format(pltzDomain.getInvoiceIssueDt())); // UT380 ADD
            
            invoiceList.add(invoiceDomain);
        }
        paramDomain.setInvoiceDetailList(invoiceList);
        // Set target ShippincAct data.
        // 登録対象出荷確認配列
        List<Ws7001ParamItemDomain> shippingFirmList = new ArrayList<Ws7001ParamItemDomain>();
        for(W7001ShippingActOdrDomain odrDomain : odrList) {
            Ws7001ParamItemDomain shippingFirmDomain = new Ws7001ParamItemDomain();
            
            shippingFirmDomain.setInvoiceNoTruck(StringUtils.defaultString(odrDomain.getInvoiceNo()));
            shippingFirmDomain.setTruckNoTruck("0");
            
            shippingFirmList.add(shippingFirmDomain);
        }
        paramDomain.setShippingFirmDetailList(shippingFirmList);
        // Set target ItemNo data.
        // 登録対象品番配列
        List<Ws7001ParamItemDomain> itemNoList = new ArrayList<Ws7001ParamItemDomain>();
        for(TtShippingActOdrDomain ttOdrDomain : ttShippingActOdrList) {
            Ws7001ParamItemDomain itemNoDomain = new Ws7001ParamItemDomain();
            
            itemNoDomain.setInvoiceNoPart(StringUtils.defaultString(ttOdrDomain.getInvoiceNo()));
            itemNoDomain.setTruckNoPart("0");
            itemNoDomain.setContainerNo(StringUtils.defaultString(ttOdrDomain.getContainerNo()));
            itemNoDomain.setCaseMark(StringUtils.defaultString(ttOdrDomain.getMainMark()));
            itemNoDomain.setPartNo(StringUtils.defaultString(ttOdrDomain.getItemNo()));
            itemNoDomain.setCustomerPartNo(StringUtils.defaultString(ttOdrDomain.getCustomerItemNo()));
            itemNoDomain.setCustomerPoNo(StringUtils.defaultString(ttOdrDomain.getCustomerPoNo()));
            itemNoDomain.setEtd(StringUtils.defaultString(sdf.format(ttOdrDomain.getEtdDueDt())));
            itemNoDomain.setCustomerPartNoOrg(StringUtils.defaultString(ttOdrDomain.getCustomerItemNoOrg()));
            itemNoDomain.setOrderControlNo(ttOdrDomain.getOdrCtrlNo().toPlainString());
            itemNoDomain.setShippedQty(ttOdrDomain.getShippedQty().toPlainString());
            itemNoDomain.setSalesCompanyPoNo(StringUtils.defaultString(ttOdrDomain.getSalesCompPoNo()));
            itemNoDomain.setShippingLotSize(StringUtil.getEmptyToBlank(NumberUtil.format(ttOdrDomain.getShippingLot(), "#")));
            itemNoDomain.setPlantCode(StringUtils.defaultString(ttOdrDomain.getPlntCd()));
            itemNoDomain.setCartonQty(ttOdrDomain.getCartonQty().toPlainString());
            
            itemNoList.add(itemNoDomain);
        }
        paramDomain.setItemNoDetailList(itemNoList);
        
        return paramDomain;
    }
    
    /**
     * Call Web service cooperation to CIGMA (CIGMA SHIPPING ACTUALITY STATUS check).
     * <br />CIGMAへの連携Webサービスを呼び出します（CIGMA船積実績ステータスチェック）。
     * <pre>
     * - Call of CIGMA SHIPPING ACTUALITY STATUS Check Web Service.
     *   Set the following items {@link Ws7002ParamDomain},
     *    and call {@link Ws7002RestService#getShippingActStat(String, Ws7002ParamDomain)}.
     * </pre>
     * <pre>
     * ‐CIGMA船積実績ステータスチェックWebサービスの呼び出し
     *     {@link Ws7002ParamDomain}に以下の項目を設定し、
     *     {@link Ws7002RestService#getShippingActStat(String, Ws7002ParamDomain)}を呼び出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE (SHIPPER CODE)<br />
     * 会社コード（荷主コード）
     * @param invoiceList Invoice No to be updated<br />
     * 更新対象のインボイスNo
     * @param trnsCd Trns Code that set in the header screen<br />
     * ヘッダ画面で設定したTrns Code
     * @return Error error message CD, null normally<br />
     * エラー時エラーメッセージコード、正常にnull
     * @throws ApplicationException can not call collaboration Web service to CIGMA.<br />
     * CIGMAへの連携Webサービスを呼び出しが出来ない場合
     */
    protected String callWebService7002(String compCd, List<? extends W7001ShippingActInvoiceDomain> invoiceList, String trnsCd)
        throws ApplicationException {
        // Create Web Services (Ws7002) call parameters. 
        // Webサービス呼び出し用パラメータの作成
        Ws7002ParamDomain paramDomain = createWs7002ParamDomain(invoiceList, trnsCd);
        // Get the status of Shipping Actuality on CIGMA by using the (WS7002) Web Services 
        // CIGMA船積実績ステータスチェックWebサービスの呼出し
        Ws7002ResultDomain resultDomain = ws7002RestService.getShippingActStat(compCd, paramDomain);
        if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
            if (resultDomain.getErrorList().isEmpty()) {
                throw new SystemException(NXS_91_0001);
            } else {
                throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode());
            }
        }
        // Check status.
        // ステータスの確認（EDI連携済みか）
        //if ("2".equals(resultDomain.getStatusFlgList().get(0))) {
        //    return NXS_E1_0016;
        //}
        //return null;

        return resultDomain.getStatusFlgList().get(0); // 20170314 ADD
    }
    
    /**
     * Create Web Services (Ws7002) call parameters.
     * <br />Webサービス（Ws7002）呼び出し用パラメータの作成
     * 
     * @param invoiceList Invoice No to be updated<br />
     * 更新対象のインボイスNo
     * @param trnsCd Trns Code that set in the header screen<br />
     * ヘッダ画面で設定したTrns Code
     * @return Web Service (Ws7002) call parameters<br />
     * Webサービス（Ws7002）呼び出し用パラメータ
     */
    protected Ws7002ParamDomain createWs7002ParamDomain (List<? extends W7001ShippingActInvoiceDomain> invoiceList, String trnsCd) {
        Ws7002ParamDomain paramDomain = new Ws7002ParamDomain();
        List<Ws7002ParamItemDomain> paramItemlList = new ArrayList<Ws7002ParamItemDomain>();
        
        for(W7001ShippingActInvoiceDomain invoiceDomain : invoiceList) {
            Ws7002ParamItemDomain paramItem = new Ws7002ParamItemDomain();
            
            paramItem.setCustomerNo(invoiceDomain.getCustomerCd());
            paramItem.setShipToNo(invoiceDomain.getLgcyShipTo());
            // 2015/11/26 update
            paramItem.setTransportationCode(invoiceDomain.getTrnsCdOrg());
            paramItem.setInvoiceNoHeader(invoiceDomain.getInvoiceNo());
            
            paramItemlList.add(paramItem);
        }
        paramDomain.setInvoiceDetailList(paramItemlList);
        
        return paramDomain;
    }
    
    /**
     * Call Web service cooperation to CIGMA (Shipping Actuality update).
     * <br />CIGMAへの連携Webサービスを呼び出します（船積実績更新）。
     * <pre>
     * - Call of Shipping Actuality Update Web service.
     *   Set the following items {@link Ws7003ParamDomain},
     *    and call {@link Ws7003RestService#updateShippingAct(String, Ws7003ParamDomain)}.
     *    - Search conditions domain of the screen
     *    - Argument Configuration data values ​​(CUSTOMER_CD, LGCY_SHIP_TO)
     *    - Invoice No to be deleted
     * </pre>
     * <pre>
     * ‐船積実績更新Webサービスの呼び出し
     *     {@link Ws7003ParamDomain}に以下の項目を設定し、
     *     {@link Ws7003RestService#updateShippingAct(String, Ws7003ParamDomain)}を呼び出します。
     *       ‐画面の検索条件ドメイン
     *       ‐取得した引数設定データ（CUSTOMER_CD、LGCY_SHIP_TO）
     *       ‐削除対象のインボイスNo
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not be collaboration Web service to CIGMA.<br />
     * CIGMAへの連携Webサービスを呼び出しが出来ない場合
     */
    protected void callWebService7003(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        // Get Palletize corresponding to the search criteria. 
        //引数へ設定するデータの取得（CUSTOMER_CD、LGCY_SHIP_TOの取得）
        List<? extends W7001ShippingActPltzDomain> pltzList = w7001ShippingActDao.searchTtPltz(criteria);
        // Create Web Services (Ws7003) call parameters. 
        // Webサービス呼び出し用パラメータの作成
        Ws7003ParamDomain paramDomain = createW7003ParamDomain(criteria, pltzList);
        
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 START >>>>>
        // Check CIGMA item.
        // CIGMA品の場合、WebServiceの呼び出しを行う（＝更新対象のCIGMA品インボイスがある、または削除対象のCIGMA品インボイスがある）
        if (0 < paramDomain.getUpdateInvoiceList().size() || 0 < paramDomain.getDeleteInvoiceList().size() ) {
        
            // Update the Shipping Actuality in a file on CIGMA by using the (WS7003) Web Services.
            // 船積実績登録Webサービスの呼出し
            ResultDomain resultDomain = ws7003RestService.updateShippingAct(criteria.getShipperCd(), paramDomain);
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                if (resultDomain.getErrorList().isEmpty()) {
                    throw new SystemException(NXS_91_0001);
                } else {
                    throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode());
                }
            }
        }
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 END <<<<<
    }
    
    /**
     * Create Web Services (Ws7003) call parameters.
     * <br />Webサービス（Ws7003）呼び出し用パラメータの作成
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param pltzList CUSTOMER_CD to the acquired list of LGCY_SHIP_TO<br />
     * 取得したCUSTOMER_CD、LGCY_SHIP_TOのリスト
     * @return Web Service (Ws7003) call parameters<br />
     * Webサービス（Ws7003）呼び出し用パラメータ
     */
    protected Ws7003ParamDomain createW7003ParamDomain (W7001ShippingActCriteriaDomain criteria, List<? extends W7001ShippingActPltzDomain> pltzList) {
        // Convert type to string from date.
        // Date → String変換用
        SimpleDateFormat sdf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        Ws7003ParamDomain paramDomain = new Ws7003ParamDomain();
        
        if (criteria.getVessel().length() > 15) {
            paramDomain.setVesselName(criteria.getVessel().substring(0, 15));
        }
        else {
            paramDomain.setVesselName(StringUtils.defaultString(criteria.getVessel()));
        }
        paramDomain.setAtd(StringUtils.defaultString(sdf.format(criteria.getAtd())));
        paramDomain.setEta(StringUtils.defaultString(sdf.format(criteria.getEta())));
        paramDomain.setStatusFlg("1");
        
        List<Ws7003ParamItemDomain> updateList = new ArrayList<Ws7003ParamItemDomain>();
        for(W7001ShippingActPltzDomain pltzDomain : pltzList) {
            Ws7003ParamItemDomain updateDomain = new Ws7003ParamItemDomain();
            
            updateDomain.setInvoiceNoHeader(StringUtils.defaultString(pltzDomain.getInvoiceNo()));
            updateDomain.setCustomerNo(StringUtils.defaultString(pltzDomain.getCustomerCd()));
            updateDomain.setShipToNo(StringUtils.defaultString(pltzDomain.getLgcyShipTo()));
            updateDomain.setTransportationCode(StringUtils.defaultString(pltzDomain.getTrnsCdOrg()));
            
            updateList.add(updateDomain);
        }
        paramDomain.setUpdateInvoiceList(updateList);
        // Set invoice data for delete.
        // 削除対象インボイスデータ
        List<Ws7003ParamItemDomain> deleteList = new ArrayList<Ws7003ParamItemDomain>();
        for(W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            // Check the CmlTyp as CML_TYPE_CIGMA.
            // CML TYPが1:CIGMAになっているインボイスNoを設定します
            if (CML_TYPE_CIGMA.equals(invoiceDomain.getCmlTyp())) {
                Ws7003ParamItemDomain deleteDomain = new Ws7003ParamItemDomain();
                
                deleteDomain.setInvoiceNoDelete(invoiceDomain.getInvoiceNo());
                
                deleteList.add(deleteDomain);
            }
        }
        paramDomain.setDeleteInvoiceList(deleteList);
        
        return paramDomain;
    }
   
    /**
     * Call Web service cooperation to CIGMA (Shipping Actuality update).
     * <br />CIGMAへの連携Webサービスを呼び出します（船積実績更新）。
     * <pre>
     * - Call of Shipping Actuality Delete Web Service.
     *     call {@link Ws7004RestService#deleteShippingAct(String, String)}.
     *     - Invoice No to be deleted
     * </pre>
     * <pre>
     * ‐船積実績削除Webサービスの呼び出し
     *     {@link Ws7004RestService#deleteShippingAct(String, String)}を呼び出します。
     *       ‐削除対象のインボイスNo
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not be collaboration Web service to CIGMA.<br />
     * CIGMAへの連携Webサービスを呼び出しが出来ない場合
     */
    protected void callWebService7004(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        
        StringBuffer invoiceNoList = new StringBuffer();
        
        for (W7001ShippingActInvoiceDomain invoiceDomain : criteria.getShippingActInvoiceList()) {
            // Check the CmlTyp as CML_TYPE_CIGMA.
            // CML TYPが1:CIGMAになっているインボイスNoを設定します
            if (CML_TYPE_CIGMA.equals(invoiceDomain.getCmlTyp())) {
                // Add the delemiter when a letter exists.
                // 文字列が既にあれば末尾にカンマ追加
                if (0 < invoiceNoList.length()) {
                    invoiceNoList.append(WS_PARAM_DELIM);
                }
                invoiceNoList.append(invoiceDomain.getInvoiceNo());
            }
        }
        
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 START >>>>>
        // Check CIGMA item.
        // CIGMA品の場合、WebServiceの呼び出しを行う
        if (0 < invoiceNoList.length()) {
        
            // Delete the Shipping Actuality in a file on CIGMA by using the (WS7004) Web Services 
            // 船積実績登録Webサービスの呼出し
            ResultDomain resultDomain = ws7004RestService.deleteShippingAct(criteria.getShipperCd(), invoiceNoList.toString());
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                if (resultDomain.getErrorList().isEmpty()) {
                    throw new SystemException(NXS_91_0001);
                } else {
                    throw new GscmApplicationException(resultDomain.getErrorList().get(0).getErrorCode());
                }
            }
        
        }
        // 2016/3/08 DNJP.Kawamura 設計書とのアンマッチ対応 END <<<<<
        
    }
    
    /**
     * Create Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークを登録します。
     * 
     * @param domains List of Shipping Actuality Invoice Work<br />
     * 船積実績対象インボイスワークのリスト
     * @throws ApplicationException If the registration of Shipping Actuality Invoice Work can not be.<br />
     * 船積実績対象インボイスワークの登録ができない場合
     */
    protected void createTwShippingActInvoice(List<TwShippingActInvoiceDomain> domains) 
        throws ApplicationException {
        for(TwShippingActInvoiceDomain domain : domains) {
            w7001ShippingActDao.createTwShippingActInvoice(domain);
        }
    }
}
