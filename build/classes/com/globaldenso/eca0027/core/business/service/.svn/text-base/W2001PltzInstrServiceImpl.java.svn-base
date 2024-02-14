/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService;
import com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0023;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0059;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_ORDER_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_PALLETIZE_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

/**
 * This is an implement class of Packaging Instruction (=Pull) service.
 * <br />梱包指示サービスの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2001PltzInstrServiceImpl implements W2001PltzInstrService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Palletize Instruction Item No Work   Service
     * <br />梱包指示品目番号ワーク サービス
     */
    protected TwPltzInstrItemNoService twPltzInstrItemNoService;
    
    /**
     * Customer QR pattern (header) service
     * <br />得意先QRパターン(ヘッダ)サービス
     */
    protected TmCustomerQrPatternHdrService tmCustomerQrPatternHdrService;
    
    /**
     * Customer QR pattern (details) service
     * <br />得意先QRパターン(明細)サービス
     */
    protected TmCustomerQrPatternDtlService tmCustomerQrPatternDtlService;

    /**
     * Export-Receive-Order service
     * <br />輸出受注サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;
    
    /**
     * Mix-Tag service
     * <br />MIXED現品票サービス
     */
    protected TtMixtagService ttMixtagService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected TtPltzInstrService ttPltzInstrService;
    
    /**
     * Palletize-Instruction-Item-No service
     * <br />梱包指示品目番号サービス
     */
    protected TtPltzInstrItemNoService ttPltzInstrItemNoService;
    
    /**
     * Palletize-Instruction-Receive-Order service
     * <br />梱包指示品目番号受注情報サービス
     */
    protected TtPltzInstrOdrService ttPltzInstrOdrService;
    
    /**
     * Temp-Stock service
     * <br />仮在庫サービス
     */
    protected TtTmpStockService ttTmpStockService;

    /**
     * Web service call service (WS2001)  
     * <br />Webサービス呼出しサービス (WS2001)
     */
    protected Ws2001RestService ws2001RestService;
    
    /**
     * Web service call service (WS2002)  
     * <br />Webサービス呼出しサービス (WS2002)
     */
    protected Ws2002RestService ws2002RestService;
    
    /**
     * Web service call service (WS2005)  
     * <br />Webサービス呼出しサービス (WS2005)
     */
    protected Ws2005RestService ws2005RestService;
    
    /**
     * List service (L2001)  
     * <br />帳票サービス (L2001)
     */
    protected L2001ReportService l2001ReportService;
    
    /**
     * List service (L2003)  
     * <br />帳票サービス (L2003)
     */
    protected L2003ReportService l2003ReportService;
    
    
    /**
     * Packaging Instruction (=Pull) DAO
     * <br />梱包指示DAO
     */
    protected W2001PltzInstrDao w2001PltzInstrDao;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W2001PltzInstrServiceImpl() {
    }

    // ------------------- Getter /Setter of dependence service and Dao -------------------
    // ------------------- 依存サービス・DaoのGetter / Setter -------------------

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
     * Setter method for twPltzInstrItemNoService.
     *
     * @param twPltzInstrItemNoService Set for twPltzInstrItemNoService
     */
    public void setTwPltzInstrItemNoService(
        TwPltzInstrItemNoService twPltzInstrItemNoService) {
        this.twPltzInstrItemNoService = twPltzInstrItemNoService;
    }

    /**
     * Setter method for tmCustomerQrPatternHdrService.
     *
     * @param tmCustomerQrPatternHdrService Set for tmCustomerQrPatternHdrService
     */
    public void setTmCustomerQrPatternHdrService(
        TmCustomerQrPatternHdrService tmCustomerQrPatternHdrService) {
        this.tmCustomerQrPatternHdrService = tmCustomerQrPatternHdrService;
    }

    /**
     * Setter method for tmCustomerQrPatternDtlService.
     *
     * @param tmCustomerQrPatternDtlService Set for tmCustomerQrPatternDtlService
     */
    public void setTmCustomerQrPatternDtlService(
        TmCustomerQrPatternDtlService tmCustomerQrPatternDtlService) {
        this.tmCustomerQrPatternDtlService = tmCustomerQrPatternDtlService;
    }

    /**
     * Setter method for ttExpRcvOdrService.
     *
     * @param ttExpRcvOdrService Set for ttExpRcvOdrService
     */
    public void setTtExpRcvOdrService(TtExpRcvOdrService ttExpRcvOdrService) {
        this.ttExpRcvOdrService = ttExpRcvOdrService;
    }

    /**
     * Setter method for ttMixtagService.
     *
     * @param ttMixtagService Set for ttMixtagService
     */
    public void setTtMixtagService(TtMixtagService ttMixtagService) {
        this.ttMixtagService = ttMixtagService;
    }

    /**
     * Setter method for ttPltzInstrService.
     *
     * @param ttPltzInstrService Set for ttPltzInstrService
     */
    public void setTtPltzInstrService(TtPltzInstrService ttPltzInstrService) {
        this.ttPltzInstrService = ttPltzInstrService;
    }

    /**
     * Setter method for ttPltzInstrItemNoService.
     *
     * @param ttPltzInstrItemNoService Set for ttPltzInstrItemNoService
     */
    public void setTtPltzInstrItemNoService(
        TtPltzInstrItemNoService ttPltzInstrItemNoService) {
        this.ttPltzInstrItemNoService = ttPltzInstrItemNoService;
    }

    /**
     * Setter method for ttPltzInstrOdrService.
     *
     * @param ttPltzInstrOdrService Set for ttPltzInstrOdrService
     */
    public void setTtPltzInstrOdrService(TtPltzInstrOdrService ttPltzInstrOdrService) {
        this.ttPltzInstrOdrService = ttPltzInstrOdrService;
    }

    /**
     * Setter method for ttTmpStockService.
     *
     * @param ttTmpStockService Set for ttTmpStockService
     */
    public void setTtTmpStockService(TtTmpStockService ttTmpStockService) {
        this.ttTmpStockService = ttTmpStockService;
    }

    /**
     * Setter method for ws2001RestService.
     *
     * @param ws2001RestService Set for ws2001RestService
     */
    public void setWs2001RestService(Ws2001RestService ws2001RestService) {
        this.ws2001RestService = ws2001RestService;
    }

    /**
     * Setter method for ws2002RestService.
     *
     * @param ws2002RestService Set for ws2002RestService
     */
    public void setWs2002RestService(Ws2002RestService ws2002RestService) {
        this.ws2002RestService = ws2002RestService;
    }

    /**
     * Setter method for ws2005RestService.
     *
     * @param ws2005RestService Set for ws2005RestService
     */
    public void setWs2005RestService(Ws2005RestService ws2005RestService) {
        this.ws2005RestService = ws2005RestService;
    }

    /**
     * Setter method for l2001ReportService.
     *
     * @param reportService Set for l2001ReportService
     */
    public void setL2001ReportService(L2001ReportService reportService) {
        l2001ReportService = reportService;
    }

    /**
     * Setter method for l2003ReportService.
     *
     * @param reportService Set for l2003ReportService
     */
    public void setL2003ReportService(L2003ReportService reportService) {
        l2003ReportService = reportService;
    }

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * Setter method for w2001PltzInstrDao.
     *
     * @param pltzInstrDao Set for w2001PltzInstrDao
     */
    public void setW2001PltzInstrDao(W2001PltzInstrDao pltzInstrDao) {
        w2001PltzInstrDao = pltzInstrDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyFmDateToDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFmDateToDate(String fromDt, String toDt, String dateFormat) {

        if (!CheckUtil.isBlankOrNull(fromDt) && !CheckUtil.isBlankOrNull(toDt)) {
            return commonService.validateFromToDate(dateFormat, fromDt, toDt);
        } else {
            return true;
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException {
        return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2001R, shipperCd, plntCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyInstrActQty(int)
     */
    public boolean validateConsistencyInstrActQty(int instrQty) {
        return 0 < instrQty;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyInstrActQtyOver(int, int)
     */
    public boolean validateConsistencyInstrActQtyOver(int instrQty, int sumQty) {
        return instrQty <= sumQty;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyItemNm(java.lang.String)
     */
    public boolean validateConsistencyItemNm(String itemNm) {
        return !StringUtils.isEmpty(itemNm);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyLotSize(java.lang.String)
     */
    public boolean validateConsistencyLotSize(String itemLotSize) {
        return !(StringUtils.isEmpty(itemLotSize) || itemLotSize.matches("0(\\.0+)?"));
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyShipLot(java.lang.String)
     */
    public boolean validateConsistencyShipLot(String shipLot) {
        return !StringUtils.isEmpty(shipLot);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyShipLot(java.lang.String)
     */
    public boolean validateConsistencyWarningIgnoreWarnings(String ignoreWarnings, int instrQty, int onHandQty) {
        if(onHandQty < instrQty) {
            if (!CHECK_ON.equals(ignoreWarnings)) {
                return false;
            }
        }
        return true;
    }

    // --------------------------------- Database check method validateDatabase ----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseAfterDateComp(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseAfterDateComp(String date, String dateFormat, String compCd)
        throws ApplicationException {
        return commonService.validateAfterDateComp(date, dateFormat, compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, java.lang.String)
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc,
        String compCd) throws ApplicationException {
        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseShipperCustomerShipTo(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperCustomerShipTo(String shipperCd,
        String customerCd, String lgcyShipTo) throws ApplicationException {
        return commonService.validateShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseShipperWhPlant(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperWhPlant(String shipperCd,
        String lgcyWhCd, String plntCd) throws ApplicationException {
        return commonService.validateShipperWhPlant(shipperCd, lgcyWhCd, plntCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister(java.lang.String)
     */
    public boolean validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister(String dscId) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TwPltzInstrItemNoCriteriaDomain pltzInstrItemNoCriteria = new TwPltzInstrItemNoCriteriaDomain();
        pltzInstrItemNoCriteria.setDscId(dscId);
        pltzInstrItemNoCriteria.setSearchCountCheckFlg(false);
        
        // The number of Palletize Instruction Item No Work is checked.
        // 梱包指示品目番号ワークの件数をチェック
        return 0 < twPltzInstrItemNoService.searchCount(pltzInstrItemNoCriteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTwPltzInstrItemNoOnCreateUpdate(java.lang.String, int)
     */
    public boolean validateDatabaseTwPltzInstrItemNoOnCreateUpdate(String dscId, int registerNum) 
        throws ApplicationException {

        TwPltzInstrItemNoCriteriaDomain criteria = new TwPltzInstrItemNoCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        int count = twPltzInstrItemNoService.searchCount(criteria);
        
        return count + registerNum <= TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterCancel(java.lang.String)
     */
    public String validateDatabaseTtPltzInstrOnRegisterCancel(String pltzInstrNo) 
        throws ApplicationException {
        
        // A lock is acquired.
        // ロックを取得
        TtPltzInstrDomain ttPltzInstr = lockTtPltzInstr(pltzInstrNo);
        
        // Existence check
        // 存在チェック
        if (ttPltzInstr == null) {
            return GSCM_E0_0010;
        }
        
        String pltzInstrStatus = ttPltzInstr.getPltzInstrStatus();
        
        // Status check
        // ステータスチェック
        if (PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE.compareTo(pltzInstrStatus) <= 0
                && 0 <= PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.compareTo(pltzInstrStatus)) {
            return NXS_E1_0011;
        }
        
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintInstr(java.lang.String)
     */
    public boolean validateDatabaseTtPltzInstrOnRegisterPrintInstr(String pltzInstrNo) 
        throws ApplicationException {
        return lockTtPltzInstr(pltzInstrNo) != null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(java.lang.String)
     */
    public String validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(String pltzInstrNo) 
        throws ApplicationException {

        // A lock is acquired.
        // ロックを取得
        TtPltzInstrDomain ttPltzInstr = lockTtPltzInstr(pltzInstrNo);

        // Existence check
        // 存在チェック
        if (ttPltzInstr == null) {
            return GSCM_E0_0010;
        }

        String pltzInstrStatus = ttPltzInstr.getPltzInstrStatus();
        
        // The check of PALLETIZE INSTRUCTION STATUS
        // 梱包指示ステータスのチェック
        if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.compareTo(pltzInstrStatus) <= 0
                && 0 <= PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE.compareTo(pltzInstrStatus)) {
            return NXS_E1_0013;
        }
        
        return null;
    }
    

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateDatabaseTtMixTagOnRegisterCancel(java.lang.String)
     */
    public boolean validateDatabaseTtMixTagOnRegisterCancel(String pltzInstrNo)
        throws ApplicationException {
        
        TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
        
        criteria.setPltzInstrNo(pltzInstrNo);
        criteria.setSearchCountCheckFlg(false);
        
        return ttMixtagService.searchCount(criteria) == 0;
    }


    // --------------------------------- Search system method search ----------------------------------
    // --------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException {
        return w2001PltzInstrDao.searchCountTtPltzInstr(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    public List<? extends W2001PltzInstrDomain> searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException {
        return w2001PltzInstrDao.searchForPagingTtPltzInstr(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain)
     */
    public List<? extends W2001PltzInstrItemDomain> searchForPagingOnCreateSearch(W2001PltzInstrItemCriteriaDomain criteria) 
        throws ApplicationException {
        
        // Acquisition of operating days
        // 稼働日の取得
        List<Date> workingDayList = getWorkingDay(criteria.getShipperCd(), criteria.getPltzInstrDt(), 2, 4);
        
        // Setting of operating days (search condition)
        // 稼働日の設定 (検索条件)
        criteria.setWorkingDayList(workingDayList);
        
        // A search of Palletize Instruction Item No Work (an Export Receive Order is included)
        // 梱包指示品目番号ワーク(輸出受注を含む)の検索
        List<? extends W2001PltzInstrItemDomain> pltzInstrItemList = w2001PltzInstrDao.searchTtExpRcvOdr(criteria);
        
        // Setting of operating days (result domain)  
        // 稼働日の設定 (結果ドメイン)
        setWorkingDayList(pltzInstrItemList, workingDayList);
        
        // Acquisition of item information
        // 品目情報の取得
        Ws2002ResultDomain itemInfo = getItemInfo(criteria, pltzInstrItemList);
        
        // Combination of data
        // データの結合
        pltzInstrItemList = joinExpRcvOdrItem(pltzInstrItemList, itemInfo);
        
        // COLLATE METHOD TYPE's existence check
        // 照合方式区分の存在確認
        checkCollateMethTyp(criteria.getShipperCd(), itemInfo);
        
        return pltzInstrItemList;
    }
    

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    public W2001PltzInstrDomain searchOnRegisterInitByFromMain(W2001PltzInstrCriteriaDomain criteria) 
        throws ApplicationException {
        return w2001PltzInstrDao.searchTtPltzInstrItemNo(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain)
     */
    public List<? extends W2001PltzInstrItemDomain> searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain criteria) 
        throws ApplicationException {
        return w2001PltzInstrDao.searchTwPltzInstrItemNo(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#updatePrintCml(com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain, java.lang.String)
     */
    public File updatePrintCml(W2001PltzInstrDomain pltzInstr, String reportDateFormat)
        throws ApplicationException {

        // The update of PALLETIZE INSTRUCTION STATUS
        // 梱包指示ステータスの更新
        if (PLTZ_INSTR_STATUS_ALL_CML_CREATE.equals(pltzInstr.getPltzInstrStatus())) {
            // The system date of Shipper is acquired.
            // Shipperのシステム日付を取得
            String timezoneId = commonService.searchTimezone(pltzInstr.getShipperCd());
            Date cmlPrintOutDt = DateUtil.convertTime(new Date(), timezoneId);

            // Create of a search condition
            // 検索条件の作成
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
            
            // A create of TtPltzInstrDomain
            // TtPltzInstrDomainの作成
            TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttPltzInstr, pltzInstr);
            ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
            ttPltzInstr.setCmlPrintOutDt(cmlPrintOutDt);
            
            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzInstr, SCREEN_ID_W2004);
            
            // Update
            // 更新
            ttPltzInstrService.updateByCondition(ttPltzInstr, criteria);
            
            // The update of the Packaging Instruction (=Pull) of invoke origin
            // 呼び出し元の梱包指示の更新
            pltzInstr.setPltzInstrStatus(ttPltzInstr.getPltzInstrStatus());
            pltzInstr.setCmlPrintOutDt(ttPltzInstr.getCmlPrintOutDt());
        }

        // A create of PDF list
        // PDF帳票の作成
        return l2003ReportService.searchCml(pltzInstr.getPltzInstrNo(), null, reportDateFormat);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#updatePrintInstr(com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain, java.lang.String)
     */
    public File updatePrintInstr(W2001PltzInstrDomain pltzInstr, String reportDateFormat) throws ApplicationException {
        // The update of PALLETIZE INSTRUCTION STATUS
        // 梱包指示ステータスの更新
        if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.equals(pltzInstr.getPltzInstrStatus())) {
            // Create of a search condition
            // 検索条件の作成
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());

            // A create of TtPltzInstrDomain
            // TtPltzInstrDomainの作成
            TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttPltzInstr, pltzInstr);
            ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
            
            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzInstr, SCREEN_ID_W2004);
            
            // Update
            // 更新
            ttPltzInstrService.updateByCondition(ttPltzInstr, criteria);
            
            // The update of the Packaging Instruction (=Pull) of call origin
            // 呼出し元の梱包指示の更新
            pltzInstr.setPltzInstrStatus(ttPltzInstr.getPltzInstrStatus());
        }
        
        // A create of PDF list
        // PDF帳票の作成
        return l2001ReportService.searchPltzInstr(pltzInstr.getPltzInstrNo(), reportDateFormat);
    }
    
    // --------------------------------- Delete system method delete ----------------------------------
    // --------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain)
     */
    public int deleteOnHeaderInit(W2001PltzInstrItemCriteriaDomain criteria) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TwPltzInstrItemNoCriteriaDomain pltzInstrItemNoCriteira = new TwPltzInstrItemNoCriteriaDomain();
        pltzInstrItemNoCriteira.setDscId(criteria.getDscId());
        pltzInstrItemNoCriteira.setSearchCountCheckFlg(false);
        
        // Delete of Palletize Instruction Item No Work (if it is)  
        // 梱包指示品目番号ワークの削除 (あれば)
        if (0 < twPltzInstrItemNoService.searchCount(pltzInstrItemNoCriteira)) {
            // A delete of Palletize Instruction Item No Work
            // 梱包指示品目番号ワークの削除
            return twPltzInstrItemNoService.deleteByCondition(pltzInstrItemNoCriteira);
        }

        return 0;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#deleteOnRegisterDelete(java.util.List)
     */
    public List<? extends W2001PltzInstrItemDomain> deleteOnRegisterDelete(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList)
        throws ApplicationException {
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            // Create of a condition domain
            // 条件ドメインの作成
            TwPltzInstrItemNoCriteriaDomain criteria = prepareTwPltzInstrItemNoCriteria(pltzInstrItem);
            
            // A delete of Palletize Instruction Item No Work
            // 梱包指示品目番号ワークの削除
            twPltzInstrItemNoService.deleteByCondition(criteria);
        }
        
        // Create of a condition domain
        // 条件ドメインの作成
        W2001PltzInstrItemCriteriaDomain criteria = new W2001PltzInstrItemCriteriaDomain();
        criteria.setDscId(pltzInstrItemList.get(0).getLoginUserDscId());
        
        // Re retrieval of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの再検索
        return searchOnRegisterInitByFromCreate(criteria);
    }

    // --------------------------------- Transaction system method transactOn ----------------------------------
    // --------------------------------- トランザクション系メソッド transactOn ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain)
     */
    public W2001PltzInstrDomain transactOnRegister(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        
        // Alloc of a firm order receipt
        // 確定受注の引当
        updateTtExpRcvOdrOnRegister(pltzInstr);
        
        // Registration of a Packaging Instruction (=Pull)
        // 梱包指示の登録
        createTtPltzInstr(pltzInstr);
        
        // Registration of a Palletize Instruction Item No
        // 梱包指示品目番号の登録
        createTtPltzInstrItemNo(pltzInstr);
        
        // Registration of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報の登録
        createTtPltzInstrOdr(pltzInstr);
        
        // A delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        deleteTwPltzInstrItemNo(pltzInstr);
        
        // An update and registration of a Temp Stock
        // 仮在庫の更新・登録
        transactTtTmpStock(pltzInstr, true);

        // Registration of ordering alloc track record (starting of Web service)  
        // 受注引当実績の登録（Webサービスの起動）
        createRcvOdrAlloc(pltzInstr);

        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2001PltzInstrCriteriaDomain criteria = new W2001PltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
        
        // Re retrieval of Packaging Instruction (=Pull) (this is the same as the time of the changes from a Main screen)  
        // 梱包指示の再検索 (Main画面からの遷移時と同じ)
        return searchOnRegisterInitByFromMain(criteria);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain)
     */
    public void transactOnRegisterCancel(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        // Acquisition of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報の取得
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = searchTtPltzInstrOdr(pltzInstr);
        
        // Update of an Export Receive Order
        // 輸出受注の更新
        updateTtExpRcvOdrOnRegisterCancel(ttPltzInstrOdrList, pltzInstr);
        
        // Delete of a Packaging Instruction (=Pull)
        // 梱包指示の削除
        deleteTtPltzInstr(pltzInstr);
        
        // Delete of a Palletize Instruction Item No
        // 梱包指示品目番号の削除
        deleteTtPltzInstrItemNo(pltzInstr);
        
        // Delete of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報の削除
        deleteTtPltzInstrOdr(pltzInstr);
        
        // Update of a Temp Stock
        // 仮在庫の更新
        transactTtTmpStock(pltzInstr, false);
        
        // Registration of ordering alloc track record (starting of Web service)  
        // 受注引当実績の登録（Webサービスの起動）
        createRcvOdrAlloc(pltzInstr);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#transactOnCreateUpdate(String, List)
     */
    public void transactOnCreateUpdate(String shipperCd, List<? extends W2001PltzInstrItemDomain> pltzInstrItemList)
        throws ApplicationException {
        
        // Shipper's weight unit
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(shipperCd);
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            
            // Update
            // 更新
            if (FLAG_Y.equals(pltzInstrItem.getDisabledFlg())) {
                TwPltzInstrItemNoDomain twPltzInstrItemNo = convertToTwPltzInstrItemNoDomain(pltzInstrItem, shipperWeightUnit);
                TwPltzInstrItemNoCriteriaDomain criteria = prepareTwPltzInstrItemNoCriteria(pltzInstrItem);
                
                twPltzInstrItemNoService.updateByCondition(twPltzInstrItemNo, criteria);
            // Registration
            // 登録
            } else {
                TwPltzInstrItemNoDomain twPltzInstrItemNo = convertToTwPltzInstrItemNoDomain(pltzInstrItem, shipperWeightUnit);
                
                twPltzInstrItemNoService.create(twPltzInstrItemNo);
            }
        }
    }

    // --------------------------------- Hereinafter, a protected method
    // ----------------------------------
    // --------------------------------- 以下、protected メソッド
    // ----------------------------------

    /**
     * It checks that the COLLATE METHOD TYPE is registered into the customer QR pattern master (a header, details).
     * <br />得意先QRパターン原単位(ヘッダ、明細)に照合方式区分が登録されていることを確認します。
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param itemInfo ITEM-NO information<br />品目番号情報
     * @throws ApplicationException When collation classification is not registered<br />照合区分が登録されていない場合
     */
    protected void checkCollateMethTyp(String compCd, Ws2002ResultDomain itemInfo) throws ApplicationException {
        if (!StringUtils.isBlank(itemInfo.getDcdiv())) {
            // Search condition of a customer QR pattern (header)
            // 得意先QRパターン(ヘッダ)の検索条件
            TmCustomerQrPatternHdrCriteriaDomain hdrCriteria = new TmCustomerQrPatternHdrCriteriaDomain();
            hdrCriteria.setCompCd(compCd);
            hdrCriteria.setCollateMethTyp(itemInfo.getDcdiv());
            hdrCriteria.setSearchCountCheckFlg(false);
            
            // COLLATE METHOD TYPE's existence check
            // 照合方式区分の存在チェック
            if (tmCustomerQrPatternHdrService.searchCount(hdrCriteria) == 0) {
                throw new GscmApplicationException(NXS_E1_0059);
            }
            
            // Search condition of a customer QR pattern (details)
            // 得意先QRパターン(明細)の検索条件
            TmCustomerQrPatternDtlCriteriaDomain dtlCriteria = new TmCustomerQrPatternDtlCriteriaDomain();
            dtlCriteria.setCompCd(compCd);
            dtlCriteria.setCollateMethTyp(itemInfo.getDcdiv());
            dtlCriteria.setSearchCountCheckFlg(false);
            
            if (tmCustomerQrPatternDtlService.searchCount(dtlCriteria) == 0) {
                throw new GscmApplicationException(NXS_E1_0059);
            }
        }
    }

    /**
     * A Packaging Instruction (=Pull) is registered.
     * <br />梱包指示を登録します。
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) is not able to be registered<br />梱包指示が登録できなかった場合
     */
    protected void createTtPltzInstr(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        
        // The domain for registration is generated.
        // 登録用ドメインを生成
        TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
        
        // This is a property copy to the domain for registration.
        // 登録用ドメインへプロパティコピー
        CommonUtil.copyPropertiesDomainToDomain(ttPltzInstr, pltzInstr);

        // Acquisition of Packaging Instruction (=Pull) NO
        // 梱包指示NOの取得
        String pltzInstrNo = getPltzInstrNo(pltzInstr.getShipperCd());
        
        // A setting of Packaging Instruction (=Pull) NO, and a PALLETIZE INSTRUCTION STATUS
        // 梱包指示NO、梱包指示ステータスの設定
        ttPltzInstr.setPltzInstrNo(pltzInstrNo);
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);

        // COLLATE_METHOD TYPE is blank, set to NULL
        // 照会方式区分がブランクの場合は、NULLをセット
        if (StringUtils.isBlank(pltzInstr.getCollateMethTyp())) {
            ttPltzInstr.setCollateMethTyp(null);
        }
        
        // Setting of a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttPltzInstr, SCREEN_ID_W2004);

        // Registration of a Packaging Instruction (=Pull)
        // 梱包指示の登録
        ttPltzInstrService.create(ttPltzInstr);
        
        // Packaging Instruction (=Pull) NO is set as a Packaging Instruction (=Pull) domain.
        // 梱包指示NOを梱包指示ドメインに設定
        pltzInstr.setPltzInstrNo(pltzInstrNo);
    }

    /**
     * A Palletize Instruction Item No is registered.
     * <br />梱包指示品目番号を登録します。
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @throws ApplicationException When a Palletize Instruction Item No is not able to be registered<br />梱包指示品目番号が登録できなかった場合
     */
    protected void createTtPltzInstrItemNo(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            // The domain for registration is generated.
            // 登録用ドメインを生成
            TtPltzInstrItemNoDomain ttPltzInstrItemNo = new TtPltzInstrItemNoDomain();

            // Setting of property
            // プロパティの設定
            CommonUtil.copyPropertiesDomainToDomain(ttPltzInstrItemNo, pltzInstrItem);

            // PACKAGE CODE, Packaging Instruction (=Pull) NO, a PACKED QUANTITY
            // 包装区分、梱包指示NO、梱包済数量
            ttPltzInstrItemNo.setPkgCd(getPkgCd(pltzInstrItem.getPkgCd()));
            ttPltzInstrItemNo.setPltzInstrNo(pltzInstr.getPltzInstrNo());
            ttPltzInstrItemNo.setPackedQty(BigDecimal.ZERO);

            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(ttPltzInstrItemNo, SCREEN_ID_W2004);
            
            // Registration of a Palletize Instruction Item No
            // 梱包指示品目番号の登録
            ttPltzInstrItemNoService.create(ttPltzInstrItemNo);
        }
    }

    /**
     * A Palletize Instruction Receive Order is registered.
     * <br />梱包指示品目番号受注情報を登録します。
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @throws ApplicationException When a Palletize Instruction Receive Order is not able to be registered<br />梱包指示品目番号受注情報が登録できなかった場合
     */
    protected void createTtPltzInstrOdr(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            for (W2001PltzInstrOdrDomain pltzInstrOdr : pltzInstrItem.getPltzInstrOdrList()) {
                TtPltzInstrOdrDomain ttPltzInstrOdr = new TtPltzInstrOdrDomain();
                
                // Setting of property
                // プロパティの設定
                CommonUtil.copyPropertiesDomainToDomain(ttPltzInstrOdr, pltzInstrItem);
                CommonUtil.copyPropertiesDomainToDomain(ttPltzInstrOdr, pltzInstrOdr);

                // A setting of Packaging Instruction (=Pull) NO, a PACKED QUANTITY, and a PACKED FLAG
                // 梱包指示NO、梱包済数量、梱包済フラグの設定
                ttPltzInstrOdr.setPltzInstrNo(pltzInstr.getPltzInstrNo());
                ttPltzInstrOdr.setPackedQty(BigDecimal.ZERO);
                ttPltzInstrOdr.setPackedFlg(FLAG_N);
            
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(ttPltzInstrOdr, SCREEN_ID_W2004);
                
                // Registration of a Palletize Instruction Receive Order
                // 梱包指示品目番号受注情報の登録
                ttPltzInstrOdrService.create(ttPltzInstrOdr);
            }
        }
    }

    /**
     * An ordering alloc track record is registered. (Starting of WS2005)
     * <br />受注引当実績を登録します。（WS2005の起動）
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @throws ApplicationException When an ordering alloc track record is not able to be registered<br />受注引当実績が登録できなかった場合
     */
    protected void createRcvOdrAlloc(W2001PltzInstrDomain pltzInstr) throws ApplicationException {

        // The parameter of Web service
        // Webサービスのパラメータ
        String shipperCd = pltzInstr.getShipperCd();
        String nightFlg = commonService.searchCigmaNightFlg(pltzInstr.getShipperCd());
        Ws2005ParamDomain param = createWs2005Param(pltzInstr.getPltzInstrItemList());

        // The call of Web service
        // Webサービスの呼出し
        ws2005RestService.createRcvOdrAlloc(shipperCd, nightFlg, param);
    }

    /**
     * The parameter of WS2005 is created from Packaging Instruction (=Pull) item watch (and Palletize Instruction Receive Order).
     * <br />梱包指示品目番(および梱包指示品目番号受注情報)からWS2005のパラメータを作成します。
     *
     * @param pltzInstrItemList The list of Packaging Instruction (=Pull) item watch<br />梱包指示品目番のリスト 
     * @return The parameter of WS2005<br />WS2005のパラメータ
     */
    protected Ws2005ParamDomain createWs2005Param(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList) {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        List<Ws2005ParamItemDomain> paramItemList = new ArrayList<Ws2005ParamItemDomain>();
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            for (W2001PltzInstrOdrDomain pltzInstrOdr : pltzInstrItem.getPltzInstrOdrList()) {
                Ws2005ParamItemDomain paramItem = new Ws2005ParamItemDomain();
                
                paramItem.setCustomerNo(pltzInstrOdr.getCustomerCd());
                paramItem.setShipTo(pltzInstrOdr.getLgcyShipTo());
                paramItem.setPN(pltzInstrItem.getItemNo());
                paramItem.setTransWayCd(pltzInstrOdr.getTrnsCd());
                paramItem.setEtdDueDt(df.format(pltzInstrOdr.getEtdDueDt()));
                paramItem.setCustomerPoNo(pltzInstrOdr.getCustomerPoNo());
                paramItem.setCustomerPn(pltzInstrOdr.getCustomerItemNo());
                paramItem.setOdrCtrlNo(pltzInstrOdr.getOdrCtrlNo().toPlainString());
                paramItem.setCustomerPnOrg(pltzInstrOdr.getCustomerItemNoOrg());
                paramItem.setShipInstrAllocQty(pltzInstrOdr.getPltzAllocQty().toPlainString());
                
                paramItemList.add(paramItem);
            }
        }
        
        Ws2005ParamDomain param = new Ws2005ParamDomain();
        param.setDetailList(paramItemList);
        
        return param;
    }

    /**
     * It changes into {@link TwPltzInstrItemNoDomain} from {@link W2001PltzInstrItemDomain}.
     * <br />{@link W2001PltzInstrItemDomain}から{@link TwPltzInstrItemNoDomain}に変換します。
     *
     * @param pltzInstrItem The object of a changing agency<br />変換元のオブジェクト
     * @param shipperWeightUnit Shipper's weight unit<br />Shipperの重量単位
     * @return The object after a converted<br />変換後のオブジェクト
     * @throws ApplicationException When conversion failed<br />変換に失敗した場合
     */
    protected TwPltzInstrItemNoDomain convertToTwPltzInstrItemNoDomain(W2001PltzInstrItemDomain pltzInstrItem,
        String shipperWeightUnit) throws ApplicationException {
        
        TwPltzInstrItemNoDomain twPltzInstrItemNo = new TwPltzInstrItemNoDomain();

        // Acquisition of an item value
        // 項目値の取得
        String dscId = pltzInstrItem.getLoginUserDscId();
        String itemNo = pltzInstrItem.getItemNo();
        String pkgCd = pltzInstrItem.getPkgCd();
        String itemDescription = pltzInstrItem.getItemDescription();
        BigDecimal shippingLot = pltzInstrItem.getShippingLot();
        BigDecimal instrQty = pltzInstrItem.getInstrQty();
        String itemWeight = pltzInstrItem.getNetWeightA();
        String itemWeightUnit = pltzInstrItem.getWeightUnit();
        BigDecimal boxLotQty = pltzInstrItem.getBoxLotQty();
        String whStkLocation = pltzInstrItem.getWhStkLocation();
        String collateMethTyp = pltzInstrItem.getCollateMethTyp();
        String pkgFormTyp = pltzInstrItem.getPkgFormTyp();
        
        // A setting of key item
        // キー項目の設定
        twPltzInstrItemNo.setDscId(dscId);
        twPltzInstrItemNo.setItemNo(itemNo);
        twPltzInstrItemNo.setPkgCd(getPkgCd(pkgCd));
        
        // Locale
        // ロケール
        Locale locale = pltzInstrItem.getLocale();
        
        // At the time of an update
        // 更新時
        if (FLAG_Y.equals(pltzInstrItem.getDisabledFlg())) {
            // Setting of an update item
            // 更新項目の設定
            twPltzInstrItemNo.setInstrQty(instrQty);
            twPltzInstrItemNo.setBoxQty(getBoxQty(instrQty, boxLotQty));
            twPltzInstrItemNo.setTotalNetWeight(getTotalNetWeight(instrQty, itemWeight, itemWeightUnit, shipperWeightUnit, locale));

            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(twPltzInstrItemNo, SCREEN_ID_W2003);

        // At the time of registration
        // 登録時
        } else {
            // Setting of a registration item
            // 登録項目の設定
            twPltzInstrItemNo.setItemDescription(itemDescription);
            twPltzInstrItemNo.setShippingLot(shippingLot);
            twPltzInstrItemNo.setInstrQty(instrQty);
            twPltzInstrItemNo.setBoxQty(getBoxQty(instrQty, boxLotQty));
            twPltzInstrItemNo.setTotalNetWeight(getTotalNetWeight(instrQty, itemWeight, itemWeightUnit, shipperWeightUnit, locale));
            twPltzInstrItemNo.setBoxLotQty(boxLotQty);
            twPltzInstrItemNo.setWhStkLocation(whStkLocation);
            twPltzInstrItemNo.setCollateMethTyp(collateMethTyp);
            twPltzInstrItemNo.setPkgFormTyp(pkgFormTyp);

            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(twPltzInstrItemNo, SCREEN_ID_W2003);
        }
        
        return twPltzInstrItemNo;
    }

    /**
     * A Packaging Instruction (=Pull) is deleted.
     * <br />梱包指示を削除します。
     *
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtPltzInstr(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
        
        // Delete of a Packaging Instruction (=Pull)
        // 梱包指示の削除
        ttPltzInstrService.deleteByCondition(criteria);
    }

    /**
     * The Palletize Instruction Item No relevant to a Packaging Instruction (=Pull) is deleted.
     * <br />梱包指示に関連する梱包指示品目番号を削除します。
     *
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtPltzInstrItemNo(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtPltzInstrItemNoCriteriaDomain criteria = new TtPltzInstrItemNoCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
        
        // Delete of a Palletize Instruction Item No
        // 梱包指示品目番号の削除
        ttPltzInstrItemNoService.deleteByCondition(criteria);
    }

    /**
     * The Palletize Instruction Receive Order relevant to a Packaging Instruction (=Pull) is deleted.
     * <br />梱包指示に関連する梱包指示品目番号受注情報を削除します。
     *
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtPltzInstrOdr(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtPltzInstrOdrCriteriaDomain criteria = new TtPltzInstrOdrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
        
        // Delete of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報の削除
        ttPltzInstrOdrService.deleteByCondition(criteria);
    }

    /**
     * The Palletize Instruction Item No Work relevant to a Packaging Instruction (=Pull) is deleted.
     * <br />梱包指示に関連する梱包指示品目番号ワークを削除します。
     *
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @throws ApplicationException When a Palletize Instruction Item No Work is not able to be deleted<br />梱包指示品目番号ワークが削除できなかった場合
     */
    protected void deleteTwPltzInstrItemNo(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TwPltzInstrItemNoCriteriaDomain criteria = new TwPltzInstrItemNoCriteriaDomain();
        criteria.setDscId(pltzInstr.getPltzInstrIssuerId());

        // A delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        twPltzInstrItemNoService.deleteByCondition(criteria);
    }

    /**
     * A BOX QUANTITY is acquired.
     * <br />箱数を取得します。
     *
     * @param instrQty INSTRUCTION QUANTITY<br />梱包指示数量
     * @param itemLotSize The number of lots of a small box<br />小箱のロット数
     * @return instrQty / itemLogSize (this is upvaluation about a 1st decimal place) <br />itemLogSize (小数第1位を切り上げ)
     */
    protected BigDecimal getBoxQty(BigDecimal instrQty, BigDecimal itemLotSize) {
        return instrQty.divide(itemLotSize, 0, BigDecimal.ROUND_UP);
    }

    /**
     * Using Web service (WS2002), item information is acquired.     
     * <br />Webサービス(WS2002)を使用して、品目情報を取得します。
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzInstrItemList The Palletize Instruction Item No Work of search results<br />検索結果の梱包指示品目番号ワーク
     * @return Item information<br />品目情報
     * @throws ApplicationException When item information is unacquirable<br />品目情報が取得できない場合
     */
    protected Ws2002ResultDomain getItemInfo(W2001PltzInstrItemCriteriaDomain criteria, List<? extends W2001PltzInstrItemDomain> pltzInstrItemList)
        throws ApplicationException {

        // The parameter of Web service
        // Webサービスのパラメータ
        String shipperCd = criteria.getShipperCd();
        String plntCd = criteria.getPlntCd();
        String lgcyWhCd = criteria.getLgcyWhCd();
        String customerCd = criteria.getCustomerCd();
        String lgcyShipTo = criteria.getLgcyShipTo();
        
        List<String> itemNoList = new ArrayList<String>();
        
        // Setting of an ITEM NO
        // 品目番号の設定
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            itemNoList.add(pltzInstrItem.getItemNo());
        }
        
        // The call of Web service
        // Webサービスの呼出し
        Ws2002ResultDomain result
            = ws2002RestService.getItemInfoForPltzIns(shipperCd, plntCd, lgcyWhCd, itemNoList, customerCd, lgcyShipTo);
        
        // The check of the number of ITEM-NO information
        // 品目番号情報の件数のチェック
        if (CollectionUtils.isEmpty(result.getItemList())) {
            throw new GscmApplicationException(NXS_E1_0024);
        }
        
        // Check of a COLLATE METHOD TYPE
        // 照合方式区分のチェック
        if (NO_DATA.equals(result.getDcdiv())) {
            throw new GscmApplicationException(NXS_E1_0015);
        }
        
        // COLLATE_METHOD TYPE is blank, set to NULL
        // 照会方式区分が半角ブランクの場合は、NULLをセット
        if (StringUtils.isBlank(result.getDcdiv())){
            result.setDcdiv(null);
        }
        
        return result;
    }

    /**
     * A PACKAGE CODE is acquired.
     * <br />包装区分を取得します。
     *
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @return PACKAGE CODE (in the case of empty one en space)  <br />包装区分 (空の場合、半角スペース1つ)
     */
    protected String getPkgCd(String pkgCd) {
        if (!StringUtils.isEmpty(pkgCd)) {
            return pkgCd;
        } else {
            return " ";
        }
    }

    /**
     * Packaging Instruction (=Pull) NO is published.
     * <br />梱包指示NOを発行します。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @return Published Packaging Instruction (=Pull) NO<br />発行した梱包指示NO
     * @throws ApplicationException When Packaging Instruction (=Pull) NO is not able to be published<br />梱包指示NOが発行できなかった場合
     */
    protected String getPltzInstrNo(String shipperCd) throws ApplicationException {
        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate 
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));
        
        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String pltzInstrNoSeqKey 
            = shipperCd + new SimpleDateFormat(SEQ_KEY_DATE_FORMAT).format(sysdate);

        // Consecutive acquisition
        // 連番の取得
        String pltzInstrNoSeq 
            = commonService.transactSequence(pltzInstrNoSeqKey, SEQ_TYP_PALLETIZE_INSTR_NO, 1, SCREEN_ID_W2004).get(0);
        
        // Return of Packaging Instruction (=Pull) NO
        // 梱包指示NOの返却
        return pltzInstrNoSeqKey + pltzInstrNoSeq;
    }

    /**
     * A TOTAL NET WEIGHT is acquired.
     * <br />ネット総重量を取得します。
     *
     * @param instrQty INSTRUCTION QUANTITY<br />梱包指示数量
     * @param itemWeight Survey NET WEIGHT<br />実測ネット重量
     * @param itemWeightUnit WEIGHT UNIT<br />重量単位
     * @param shipperWeightUnit Shipper's weight unit<br />Shipperの重量単位
     * @param locale locale<br />ロケール
     * @return itemWeight When itemWeght is null, this is null, and this is instrQty except it.<br />itemWeghtがnullの場合はnull、それ以外はinstrQty
     * @throws ApplicationException When total net weight is overflow<br />ネット総重量が桁溢れした場合
     */
    protected BigDecimal getTotalNetWeight(BigDecimal instrQty, String itemWeight, String itemWeightUnit,
        String shipperWeightUnit, Locale locale) throws ApplicationException {
        
        if (StringUtils.isEmpty(itemWeight)) {
            return null;
        } else {
            BigDecimal totalNetWeight = instrQty.multiply(new BigDecimal(itemWeight));
            totalNetWeight = commonService.convertWeightUnit(totalNetWeight, itemWeightUnit, shipperWeightUnit);
            
            if (totalNetWeight == null) {
                Object[] params = {
                    commonService.getResource(locale, "label.totalNetWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            
            return totalNetWeight;
        }
    }

    /**
     * Web service (WS2001) is used and the specified operating days of the range are acquired.
     * <br />Webサービス(WS2001)を使用して、指定された範囲の稼働日を取得します。
     *
     * @param shipperCd The COMPANY CODE of Shipper<br />Shipperの会社コード
     * @param baseDate Date of record<br />基準日
     * @param beforeDays The number of acquisition of the operating days before a date of record<br />基準日より前の稼働日の取得数
     * @param afterDays The number of acquisition of the operating days after a date of record<br />基準日より後の稼働日の取得数
     * @return Acquired operating days<br>取得した稼働日
     * @throws ApplicationException When operating days are unacquirable<br />稼働日が取得できない場合
     */
    @SuppressWarnings("deprecation")
    protected List<Date> getWorkingDay(String shipperCd, Date baseDate, int beforeDays, int afterDays)
        throws ApplicationException {

        // Acquisition of operating days
        // 稼働日の取得
        Ws2001ResultDomain result = ws2001RestService.searchWorkingDay(shipperCd, baseDate, beforeDays, afterDays);
        
        // Check of a Status
        // ステータスの確認
        if (WS_RESULT_ERROR.equals(result.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        }
        
        List<String> workingDayList = result.getWorkingDayList();
        
        // Check of operating days
        // 稼働日の確認
        if (workingDayList.contains(null) || workingDayList.contains("")) {
            throw new GscmApplicationException(NXS_E1_0023);
        }

        List<Date> resultWorkingDayList = new ArrayList<Date>();

        // String->Date converted
        // String→Date変換
        try {
            SimpleDateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
            
            for (String workingDay : workingDayList) {
                resultWorkingDayList.add(df.parse(workingDay));
            }
        } catch (ParseException e) {
            throw new SystemException(NXS_91_0001, e);
        }
        
        return resultWorkingDayList;
    }

    /**
     * Search results and an ITEM-NO information are combined.
     * <br />検索結果と品目番号情報を結合します。
     *
     * @param pltzInstrItemList The list of search-results domains<br />検索結果ドメインのリスト
     * @param itemInfo ITEM-NO information<br />品目番号情報
     * @return resultList The list of search-results domains after combination<br />結合後の検索結果ドメインのリスト
     */
    protected List<W2001PltzInstrItemDomain> joinExpRcvOdrItem(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList, Ws2002ResultDomain itemInfo) {
        // Result list
        // 結果リスト
        List<W2001PltzInstrItemDomain> resultList = new ArrayList<W2001PltzInstrItemDomain>();
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            for (Ws2002ResultItemDomain item : itemInfo.getItemList()) {
                if (pltzInstrItem.getItemNo().equals(item.getItnbr())) {
                    // Setting of an ITEM-NO information
                    // 品目番号情報の設定
                    pltzInstrItem.setBoxLotQty(new BigDecimal(item.getLotsz()));
                    pltzInstrItem.setWhStkLocation(StringUtils.substring(item.getWhslc(), 0, 5));
                    pltzInstrItem.setCollateMethTyp(itemInfo.getDcdiv());
                    BigDecimal totalQty = new BigDecimal(item.getMohtq());
                    pltzInstrItem.setOnHandQty(totalQty.subtract(pltzInstrItem.getTmpQty()));
                    
                    // It adds to a result list.
                    // 結果リストへ追加
                    resultList.add(pltzInstrItem);
                    
                    break;
                }
            }
        }
        
        return resultList;
    }

    /**
     * Packaging Instruction (=Pull) data is locked.
     * <br />梱包指示データをロックします。
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @return Locked {@link TtPltzInstrDomain} object<br />ロックした{@link TtPltzInstrDomain}オブジェクト
     * @throws ApplicationException When a lock is unacquirable<br />ロックが取得できない場合
     */
    protected TtPltzInstrDomain lockTtPltzInstr(String pltzInstrNo) throws ApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstrNo);
        
        // A lock is acquired.
        // ロックを取得
        return ttPltzInstrService.lockByKeyNoWait(criteria);
    }

    /**
     * The condition domain for locking a Palletize Instruction Item No Work is created.
     * <br />梱包指示品目番号ワークをロックするための条件ドメインを作成します。
     *
     * @param pltzInstrItem The Palletize Instruction Item No Work for a lock<br />ロック対象の梱包指示品目番号ワーク
     * @return Condition domain<br />条件ドメイン
     */
    protected TwPltzInstrItemNoCriteriaDomain prepareTwPltzInstrItemNoCriteria(W2001PltzInstrItemDomain pltzInstrItem) {
        
        TwPltzInstrItemNoCriteriaDomain criteria = new TwPltzInstrItemNoCriteriaDomain();
        
        criteria.setDscId(pltzInstrItem.getLoginUserDscId());
        criteria.setItemNo(pltzInstrItem.getItemNo());
        criteria.setPkgCd(pltzInstrItem.getPkgCd());
        
        return criteria;
    }

    /**
     * The Palletize Instruction Receive Order corresponding to Packaging Instruction (=Pull) NO is acquired.
     * <br />梱包指示NOに対応する梱包指示品目番号受注情報を取得します。
     *
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @return Palletize Instruction Receive Order<br />梱包指示品目番号受注情報
     * @throws ApplicationException When data is unacquirable<br />データが取得できない場合
     */
    protected List<TtPltzInstrOdrDomain> searchTtPltzInstrOdr(W2001PltzInstrDomain pltzInstr) 
        throws ApplicationException {
        
        // Create of search-condition domain (since it sorts in order of * major key, a specified of a sort order is omitted)  
        // 検索条件ドメインの作成 (※主キーの順でソートされるので、ソート順の指定は省略)
        TtPltzInstrOdrCriteriaDomain criteria = new TtPltzInstrOdrCriteriaDomain();
        criteria.setPltzInstrNo(pltzInstr.getPltzInstrNo());
        
        // Acquisition of a Palletize Instruction Receive Order
        // 梱包指示品目番号受注情報の取得
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList =  ttPltzInstrOdrService.searchByCondition(criteria);
        
        return ttPltzInstrOdrList;
    }

    /**
     * Operating days are set to the specified Palletize Instruction Item No Work.
     * <br />指定された梱包指示品目番号ワークに稼働日を設定します。
     *
     * @param pltzInstrItemList The Palletize Instruction Item No Work which sets up operating days<br />稼働日を設定する梱包指示品目番号ワーク
     * @param workingDayList Operating days<br />稼働日
     */
    protected void setWorkingDayList(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList, List<Date> workingDayList) {
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            pltzInstrItem.setWorkingDayList(workingDayList);
        }
    }

    /**
     * A Temp Stock is updated or registered.
     * <br />仮在庫を更新または登録します。
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @param isRegister When using from registration processing, this is true, and this is false except it (when using from cancellation processing). <br />登録処理から利用する場合はtrue、それ以外(キャンセル処理から利用する場合)はfalse
     * @throws ApplicationException When a Temp Stock is not able to register or update<br />仮在庫が登録または更新できなかった場合
     */
    protected void transactTtTmpStock(W2001PltzInstrDomain pltzInstr, boolean isRegister) throws ApplicationException {
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();

            // Setting of a condition domain
            // 条件ドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(criteria, pltzInstr);
            CommonUtil.copyPropertiesDomainToDomain(criteria, pltzInstrItem);
            
            // Lock of a Temp Stock
            // 仮在庫のロック
            TtTmpStockDomain ttTmpStock = ttTmpStockService.lockByKeyNoWait(criteria);
            
            // When update place does not exist, it updates insertion and except it.
            // 更新先が存在しない場合は挿入、それ以外は更新
            if (isRegister && ttTmpStock == null) {
                ttTmpStock = new TtTmpStockDomain();
                
                // Setting of property
                // プロパティの設定
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStock, pltzInstr);
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStock, pltzInstrItem);
                
                // Setting of a QUANTITY
                // 数量の設定
                ttTmpStock.setQty(pltzInstrItem.getInstrQty());

                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(ttTmpStock, SCREEN_ID_W2004);
                
                // Registration of a Temp Stock
                // 仮在庫の登録
                ttTmpStockService.create(ttTmpStock);
            } else {
                // Setting of a QUANTITY
                // 数量の設定
                if (isRegister) {
                    ttTmpStock.setQty(ttTmpStock.getQty().add(pltzInstrItem.getInstrQty()));
                } else {
                    ttTmpStock.setQty(ttTmpStock.getQty().subtract(pltzInstrItem.getInstrQty()));
                }
                
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttTmpStock, SCREEN_ID_W2004);
                
                // Update of a Temp Stock
                // 仮在庫の更新
                ttTmpStockService.updateByCondition(ttTmpStock, criteria);
            }
        }
    }

    /**
     * Firm-order-receipt alloc processing is performed.
     * <br />確定受注引当処理を行います。
     * 
     * @param pltzInstr The domain holding the information on a Packaging Instruction (=Pull)<br />梱包指示の情報を保持するドメイン
     * @throws ApplicationException When alloc processing is not completed<br />引当処理ができなかった場合
     */
    protected void updateTtExpRcvOdrOnRegister(W2001PltzInstrDomain pltzInstr) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        TtExpRcvOdrCriteriaDomain searchCriteria = new TtExpRcvOdrCriteriaDomain();

        // A setting of the search condition of Export Receive Order
        // 輸出受注の検索条件の設定
        CommonUtil.copyPropertiesDomainToDomain(searchCriteria, pltzInstr);
        searchCriteria.setRcvOdrCompCd(pltzInstr.getShipperCd());
        searchCriteria.setOdrFirmFlg(FLAG_Y);
        searchCriteria.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        searchCriteria.setEtdDueDtGreaterThanEqual(pltzInstr.getPoDueDtFrom());
        searchCriteria.setEtdDueDtLessThanEqual(pltzInstr.getPoDueDtTo());
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            // A setting of the search condition of Export Receive Order
            // 輸出受注の検索条件の設定
            searchCriteria.setItemNo(pltzInstrItem.getItemNo());
            searchCriteria.setPkgCd(pltzInstrItem.getPkgCd());
            searchCriteria.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");
            
            // Search of an Export Receive Order (lock)  
            // 輸出受注の検索 (ロック)
            List<? extends TtExpRcvOdrDomain> ttExpRcvOdrList = w2001PltzInstrDao.lockTtExpRcvOdr(searchCriteria);

            // Palletize-Instruction-Receive-Order list create
            // 梱包指示品目番号受注情報リスト作成
            List<W2001PltzInstrOdrDomain> pltzInstrOdrList = new ArrayList<W2001PltzInstrOdrDomain>();
            
            // A setting of ALLOC QUANTITY (remaining)
            // 引当数量(残)の設定
            BigDecimal instrActQty = pltzInstrItem.getInstrQty();

            // This is an alloc from a part for the past.
            // 過去分より引当
            for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){
                // Calculation of a Shipment remaining
                // 出荷残の算出
                BigDecimal restQty = ttExpRcvOdr.getOdrQty().subtract(ttExpRcvOdr.getPltzAllocQty());

                // Determination of an ALLOC QUANTITY
                // 引当数量の決定
                BigDecimal allocQty = BigDecimal.ZERO;
                if (0 < instrActQty.compareTo(restQty)) {
                    allocQty = restQty;
                } else {
                    allocQty = instrActQty;
                }

                // The update of ALLOC QUANTITY (remaining)
                // 引当数量(残)の更新
                instrActQty = instrActQty.subtract(allocQty);
                
                // A setting of INSTRUCTION QUANTITY, and a SHIPPED TYPE
                // 梱包指示数量、出荷済み区分の設定
                ttExpRcvOdr.setPltzAllocQty(ttExpRcvOdr.getPltzAllocQty().add(allocQty));
                if (ttExpRcvOdr.getOdrQty().equals(ttExpRcvOdr.getPltzAllocQty())) {
                    ttExpRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
                }
                
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttExpRcvOdr, SCREEN_ID_W2004);
                
                // Generation of an update condition domain
                // 更新条件ドメインの生成
                TtExpRcvOdrCriteriaDomain updateCriteria = new TtExpRcvOdrCriteriaDomain();
                
                // Setting of an update condition domain
                // 更新条件ドメインの設定
                updateCriteria.setRcvOdrCompCd(ttExpRcvOdr.getRcvOdrCompCd());
                updateCriteria.setCustomerCd(ttExpRcvOdr.getCustomerCd());
                updateCriteria.setLgcyShipTo(ttExpRcvOdr.getLgcyShipTo());
                updateCriteria.setItemNo(ttExpRcvOdr.getItemNo());
                updateCriteria.setPkgCd(ttExpRcvOdr.getPkgCd());
                updateCriteria.setTrnsCd(ttExpRcvOdr.getTrnsCd());
                updateCriteria.setEtdDueDt(ttExpRcvOdr.getEtdDueDt());
                updateCriteria.setCustomerPoNo(ttExpRcvOdr.getCustomerPoNo());
                updateCriteria.setCustomerItemNo(ttExpRcvOdr.getCustomerItemNo());
                updateCriteria.setCustomerItemNoOrg(ttExpRcvOdr.getCustomerItemNoOrg());
                updateCriteria.setOdrCtrlNo(ttExpRcvOdr.getOdrCtrlNo());

                // Update of an Export Receive Order
                // 輸出受注の更新
                ttExpRcvOdrService.updateByCondition(ttExpRcvOdr, updateCriteria);
                
                // Setting of an ALLOC QUANTITY
                // 梱包指示品目番号受注情報ドメインに輸出情報をセット
                W2001PltzInstrOdrDomain pltzInstrOdr = new W2001PltzInstrOdrDomain();
                CommonUtil.copyPropertiesDomainToDomain(pltzInstrOdr, ttExpRcvOdr);

                // It sets to Palletize-Instruction-Receive-Order list.
                // 引当数量の設定
                pltzInstrOdr.setAllocQty(allocQty);
                
                // It sets to Palletize-Instruction-Receive-Order list.
                // 梱包指示品目番号受注情報リストにセット
                pltzInstrOdrList.add(pltzInstrOdr);
                
                // When ALLOC QUANTITY (remaining) does not remain
                // 引当数量(残)が残っていない場合
                if (instrActQty.compareTo(BigDecimal.ZERO) == 0) {
                    break;
                }
            }
            
            // When ALLOC QUANTITY (remaining) remains
            // 引当数量(残)が残っている場合
            if (0 < instrActQty.compareTo(BigDecimal.ZERO)) {
                throw new GscmApplicationException(NXS_E1_0008);
            }
            
            // Setting of a Palletize-Instruction-Receive-Order list
            // 梱包指示品目番号受注情報リストの設定
            pltzInstrItem.setPltzInstrOdrList(pltzInstrOdrList);
        }
    }

    /**
     * An Export Receive Order is updated based on a Palletize Instruction Receive Order.
     * <br />梱包指示品目番号受注情報をもとに輸出受注を更新します。
     *
     * @param ttPltzInstrOdrList Palletize Instruction Receive Order<br />梱包指示品目番号受注情報
     * @param pltzInstr The target Packaging Instruction (=Pull)<br />対象の梱包指示
     * @throws ApplicationException When an Export Receive Order is not able to be updated<br />輸出受注が更新できなかった場合
     */
    protected void updateTtExpRcvOdrOnRegisterCancel(List<TtPltzInstrOdrDomain> ttPltzInstrOdrList, W2001PltzInstrDomain pltzInstr)
        throws ApplicationException {

        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            List<W2001PltzInstrOdrDomain> pltzInstrOdrList = new ArrayList<W2001PltzInstrOdrDomain>();
            for (TtPltzInstrOdrDomain ttPltzInstrOdr : ttPltzInstrOdrList) {
                if (pltzInstrItem.getItemNo().equals(ttPltzInstrOdr.getItemNo())
                    && pltzInstrItem.getPkgCd().equals(ttPltzInstrOdr.getPkgCd())) {
                    TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();

                    // Setting of a condition domain
                    // 条件ドメインの設定
                    criteria.setRcvOdrCompCd(ttPltzInstrOdr.getRcvOdrCompCd());
                    criteria.setCustomerCd(ttPltzInstrOdr.getCustomerCd());
                    criteria.setLgcyShipTo(ttPltzInstrOdr.getLgcyShipTo());
                    criteria.setItemNo(ttPltzInstrOdr.getItemNo());
                    criteria.setPkgCd(ttPltzInstrOdr.getPkgCd());
                    criteria.setTrnsCd(ttPltzInstrOdr.getTrnsCd());
                    criteria.setEtdDueDt(ttPltzInstrOdr.getEtdDueDt());
                    criteria.setCustomerPoNo(ttPltzInstrOdr.getCustomerPoNo());
                    criteria.setCustomerItemNo(ttPltzInstrOdr.getCustomerItemNo());
                    criteria.setCustomerItemNoOrg(ttPltzInstrOdr.getCustomerItemNoOrg());
                    criteria.setOdrCtrlNo(ttPltzInstrOdr.getOdrCtrlNo());

                    // Acquisition of an Export Receive Order
                    // 輸出受注の取得
                    TtExpRcvOdrDomain ttExpRcvOdr = ttExpRcvOdrService.searchByKey(criteria);

                    // Calculation of an Alloc QTY
                    // 梱包引当数量の計算
                    BigDecimal pltzAllocQty = ttExpRcvOdr.getPltzAllocQty().subtract(ttPltzInstrOdr.getAllocQty());

                    // A setting of Alloc QTY, and a SHIPPED TYPE
                    // 梱包引当数量、出荷済み区分の設定
                    ttExpRcvOdr.setPltzAllocQty(pltzAllocQty);
                    ttExpRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);

                    // Setting of a common column
                    // 共通カラムの設定
                    commonService.setCommonPropertyForUpdate(ttExpRcvOdr, SCREEN_ID_W2004);

                    // Update of an Export Receive Order
                    // 輸出受注の更新
                    ttExpRcvOdrService.updateByCondition(ttExpRcvOdr, criteria);

                    // PltzInstrOdr is created from Palletize Instruction
                    // Receive Order.
                    // 梱包指示品目番号受注情報からPltzInstrOdrを作成
                    W2001PltzInstrOdrDomain pltzInstrOdr = new W2001PltzInstrOdrDomain();

                    // Setting of property
                    // プロパティの設定
                    CommonUtil.copyPropertiesDomainToDomain(pltzInstrOdr, ttPltzInstrOdr);

                    // Setting of an ALLOC QUANTITY
                    // 引当数量の設定
                    pltzInstrOdr.setAllocQty(pltzInstrOdr.getAllocQty().negate());
                    pltzInstrOdr.setPltzAllocQty(pltzAllocQty);

                    pltzInstrOdrList.add(pltzInstrOdr);
                }
            }
            pltzInstrItem.setPltzInstrOdrList(pltzInstrOdrList);
        }
    }
}
