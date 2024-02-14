/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INPUT_METH_TYP_AUTO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_TYP_PKG_MATERIALS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_LENGTH_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0025;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0027;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0049;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0050;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0051;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0086;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0092;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0101;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0102;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0103;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0104;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0105;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0106;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0107;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0108;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0147;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0155;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0156;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MANUAL_REG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_OUTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QTY_UNIT_EA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RT_TYP_1WAY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_ORDER_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmUomCnvDecDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzItemPkgDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUomCnvDecCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmUomCnvDecService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService;
import com.globaldenso.eca0027.core.business.dao.W2009CmlDao;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of CML service.
 * <br />CMLサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2009CmlServiceImpl implements W2009CmlService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * Measure Unit Master/Measure Unit Master   Service
     * <br />Measure Unit Master/計量単位原単位 サービス
     */
    protected TmMeasureUnitService tmMeasureUnitService;

    /**
     * PKG Material MA/PKG Material MA   Service
     * <br />PKG Material MA/包装材原単位 サービス
     */
    protected TmPkgMtrlService tmPkgMtrlService;

    /**
     * PKG Set MA (Header)/PKG Set MA(Header)   Service
     * <br />PKG Set MA（Header）/包装組み合わせ原単位(ヘッダ) サービス
     */
    protected TmPkgSetHdrService tmPkgSetHdrService;

    /**
     * Export Receive Order/Export Receive Order   Service
     * <br />Export Receive Order/輸出受注 サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;

    /**
     * Mix Tag KANBAN/Mix Tag KANBAN   Service
     * <br />Mix Tag KANBAN/MIX品かんばん情報 サービス
     */
    protected TtMixKanbanService ttMixKanbanService;

    /**
     * Mix Tag Receive Order/Mix Tag Receive Order   Service
     * <br />Mix Tag Receive Order/MIXED品目番号受注情報 サービス
     */
    protected TtMixtagOdrService ttMixtagOdrService;

    /**
     * Mix Tag/Mix Tag   Service
     * <br />Mix Tag/MIXED現品票 サービス
     */
    protected TtMixtagService ttMixtagService;
    
    /**
     * Mix Tag/MIXED thing   Service
     * <br />Mix Tag/MIXED現品 サービス
     */
    protected TtMixtagItemNoService ttMixtagItemNoService;

    /**
     * Palletize Instruction Item No/Palletize Instruction Item No   Service
     * <br />Palletize Instruction Item No/梱包指示品目番号 サービス
     */
    protected TtPltzInstrItemNoService ttPltzInstrItemNoService;

    /**
     * Palletize Instruction Receive Order/Palletize Instruction Receive Order   Service
     * <br />Palletize Instruction Receive Order/梱包指示品目番号受注情報 サービス
     */
    protected TtPltzInstrOdrService ttPltzInstrOdrService;

    /**
     * Palletize Instruction/Packaging Instruction (=Pull)   Service
     * <br />Palletize Instruction/梱包指示 サービス
     */
    protected TtPltzInstrService ttPltzInstrService;

    /**
     * Palletize Item Receive Order/Palletize Item Receive Order   Service
     * <br />Palletize Item Receive Order/パレタイズ対象品受注情報 サービス
     */
    protected TtPltzItemOdrService ttPltzItemOdrService;

    /**
     * Palletize Item/Palletize Item   Service
     * <br />Palletize Item/パレタイズ対象品 サービス
     */
    protected TtPltzItemService ttPltzItemService;

    /**
     * Palletize Item KANBAN/Palletize Item KANBAN   Service
     * <br />Palletize Item KANBAN/パレタイズ対象品かんばん情報 サービス
     */
    protected TtPltzKanbanService ttPltzKanbanService;

    /**
     * Palletize/Palletize   Service
     * <br />Palletize/パレタイズ サービス
     */
    protected TtPltzService ttPltzService;

    /**
     * Temp Stock/Temp Stock   Service
     * <br />Temp Stock/仮在庫 サービス
     */
    protected TtTmpStockService ttTmpStockService;

    /**
     * Palletize Item Work/Palletize Item Work
     * <br />Palletize Item Work/パレタイズ対象品ワーク
     */
    protected TwPltzItemItemNoService twPltzItemItemNoService;

    /**
     * Palletize Item Package Work/Palletize Item Package Work   Service
     * <br />Palletize Item Package Work/パレタイズ対象品PKGワーク サービス
     */
    protected TwPltzItemPkgService twPltzItemPkgService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * CMLDAO
     */
    protected W2009CmlDao w2009CmlDao;

    /**
     * Web service call service (WS2004)
     * <br />Webサービス呼出しサービス (WS2004)
     */
    protected Ws2004RestService ws2004RestService;

    /**
     * Web service call service (WS2005)
     * <br />Webサービス呼出しサービス (WS2005)
     */
    protected Ws2005RestService ws2005RestService;
    
    /**
     * List service (L2003)
     * <br />帳票サービス (L2003)
     */
    protected L2003ReportService l2003ReportService;

    /**
     * service of the Of Measure Conversion Master <br />
     * 計量単位換算原単位(小数用)サービス
     * UT304 MULTI LABEL ADD
     */
    protected TmUomCnvDecService tmUomCnvDecService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2009CmlServiceImpl() {
    }

    // -------------------Getter /Setter of dependence service and Dao -------------------
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
     * Setter method for tmMeasureUnitService.
     * 
     * @param tmMeasureUnitService Set for tmMeasureUnitService
     */
    public void setTmMeasureUnitService(
        TmMeasureUnitService tmMeasureUnitService) {
        this.tmMeasureUnitService = tmMeasureUnitService;
    }

    /**
     * Setter method for tmPkgMtrlService.
     * 
     * @param tmPkgMtrlService Set for tmPkgMtrlService
     */
    public void setTmPkgMtrlService(
        TmPkgMtrlService tmPkgMtrlService) {
        this.tmPkgMtrlService = tmPkgMtrlService;
    }

    /**
     * Setter method for tmPkgSetHdrService.
     * 
     * @param tmPkgSetHdrService Set for tmPkgSetHdrService
     */
    public void setTmPkgSetHdrService(TmPkgSetHdrService tmPkgSetHdrService) {
        this.tmPkgSetHdrService = tmPkgSetHdrService;
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
     * Setter method for ttMixKanbanService.
     * 
     * @param ttMixKanbanService Set for ttMixKanbanService
     */
    public void setTtMixKanbanService(TtMixKanbanService ttMixKanbanService) {
        this.ttMixKanbanService = ttMixKanbanService;
    }

    /**
     * Setter method for ttMixtagOdrService.
     * 
     * @param ttMixtagOdrService Set for ttMixtagOdrService
     */
    public void setTtMixtagOdrService(TtMixtagOdrService ttMixtagOdrService) {
        this.ttMixtagOdrService = ttMixtagOdrService;
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
     * Setter method for ttMixtagItemNoService.
     *
     * @param ttMixtagItemNoService Set for ttMixtagItemNoService
     */
    public void setTtMixtagItemNoService(TtMixtagItemNoService ttMixtagItemNoService) {
        this.ttMixtagItemNoService = ttMixtagItemNoService;
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
    public void setTtPltzInstrOdrService(
        TtPltzInstrOdrService ttPltzInstrOdrService) {
        this.ttPltzInstrOdrService = ttPltzInstrOdrService;
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
     * Setter method for ttPltzItemOdrService.
     * 
     * @param ttPltzItemOdrService Set for ttPltzItemOdrService
     */
    public void setTtPltzItemOdrService(
        TtPltzItemOdrService ttPltzItemOdrService) {
        this.ttPltzItemOdrService = ttPltzItemOdrService;
    }

    /**
     * Setter method for ttPltzItemService.
     * 
     * @param ttPltzItemService Set for ttPltzItemService
     */
    public void setTtPltzItemService(TtPltzItemService ttPltzItemService) {
        this.ttPltzItemService = ttPltzItemService;
    }

    /**
     * Setter method for ttPltzKanbanService.
     * 
     * @param ttPltzKanbanService Set for ttPltzKanbanService
     */
    public void setTtPltzKanbanService(TtPltzKanbanService ttPltzKanbanService) {
        this.ttPltzKanbanService = ttPltzKanbanService;
    }

    /**
     * Setter method for ttPltzService.
     * 
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
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
     * Setter method for twPltzItemItemNoService.
     * 
     * @param twPltzItemItemNoService Set for twPltzItemItemNoService
     */
    public void setTwPltzItemItemNoService(
        TwPltzItemItemNoService twPltzItemItemNoService) {
        this.twPltzItemItemNoService = twPltzItemItemNoService;
    }

    /**
     * Setter method for twPltzItemPkgService.
     * 
     * @param twPltzItemPkgService Set for twPltzItemPkgService
     */
    public void setTwPltzItemPkgService(
        TwPltzItemPkgService twPltzItemPkgService) {
        this.twPltzItemPkgService = twPltzItemPkgService;
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
     * Setter method for w2009CmlDao.
     * 
     * @param cmlDao Set for w2009CmlDao
     */
    public void setW2009CmlDao(W2009CmlDao cmlDao) {
        w2009CmlDao = cmlDao;
    }

    /**
     * Setter method for ws2004RestService.
     * 
     * @param ws2004RestService Set for ws2004RestService
     */
    public void setWs2004RestService(Ws2004RestService ws2004RestService) {
        this.ws2004RestService = ws2004RestService;
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
     * Setter method for l2003ReportService.
     *
     * @param reportService Set for l2003ReportService
     */
    public void setL2003ReportService(L2003ReportService reportService) {
        l2003ReportService = reportService;
    }

    /**
     * Setter method for tmUomCnvDecService.
     *
     * @param tmUomCnvDecService Set for tmUomCnvDecService
     */
    public void setTmUomCnvDecService(TmUomCnvDecService tmUomCnvDecService) {
        this.tmUomCnvDecService = tmUomCnvDecService;
    }

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyActualQty(java.lang.String)
     */
    public boolean validateConsistencyActualQty(String input) {

        if (!CheckUtil.isBlankOrNull(input)) {
            if (!CheckUtil.isNumeric(input)) {
                return false;      
            } else {
                BigDecimal inputVal = new BigDecimal(input);
                if (inputVal.intValue() < 1) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyAllSame(java.util.List)
     */
    public boolean validateConsistencyAllSame(List<String> inputList) {

        // All the contents of the list are true(s) when the same. This is false when not the same.
        // リストの内容がすべて同一の場合、true　同一でない場合には false
        if (inputList != null && inputList.size() > 0) {
            String pre = "";
            boolean isCheck = false;
            for (String str : inputList) {
                // null is replaced and compared with an empty string.
                // null は、空文字に置換して比較
                String convVal = "";
                if (str != null) {
                    convVal = str;
                }
                
                // It checks henceforth [ 2 line ].
                // 2行目以降でチェックを実施する
                if (isCheck && !pre.equals(convVal)) {
                    return false;
                }
                isCheck = true;
                pre = convVal;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyDetailPackageItemNoQTY(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyDetailPackageItemNoQTY(
        String pkgItemNo, String qty, String mixTagNo) {

        // (it checks, only when Mix Tag No. is "")
        // (Mix Tag No. が "" の場合のみチェックを行う)
        if (CheckUtil.isBlankOrNull(mixTagNo)) {
            // An error is made when only one of Package Item No. and the QTY(s) is inputted.
            // Package Item No. と QTY のどちらかしか入力されていない場合はエラー
            if (CheckUtil.isBlankOrNull(pkgItemNo)) {
                // In the case of kitParItemNo un-inputting, they are those with a qty input.
                // kitParItemNo 未入力の際に、qty 入力あり
                if (!CheckUtil.isBlankOrNull(qty)) {
                    return false;
                }
            } else {
                // In the case of [ with a kitParItemNo input ], this is qty un-inputting.
                // kitParItemNo 入力ありの際に、 qty 未入力
                if (CheckUtil.isBlankOrNull(qty)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyDetailQTY(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyDetailQTY(String qty, String mixTagNo) {

        // (it checks, only when Mix Tag No. is "")
        // (Mix Tag No. が "" の場合のみチェックを行う)
        if (CheckUtil.isBlankOrNull(mixTagNo)) {
            // In in minimum QUANTITY check QTY < 1 (00 and 000 grades regard it as 0), an error is made.
            // 最少数量チェック QTY < 1 の場合(00、000等は0とみなす)の場合はエラー
            return validateConsistencyActualQty(qty);
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyDetailQTYMax(java.math.BigDecimal)
     */
    public boolean validateConsistencyDetailQTYMax(BigDecimal qty) {

        // amount check QTY of maximum numbers > In the case of 9999999, an error is made.
        // 最大数量チェック QTY > 9999999 の場合はエラー
        if (qty != null && qty.intValue() > 9999999) {
            return false;
        }

        return true;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyFmIssueDateToIssueDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String dateFormat,
        String fromDate, String toDate) {

        return commonService.validateFromToDate(dateFormat, fromDate, toDate);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyGetCigmaInfo(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyGetCigmaInfo(String currCd,
        String qtyUnit, String plntCd) {

        if (CheckUtil.isBlankOrNull(currCd) || CheckUtil.isBlankOrNull(qtyUnit)
            || CheckUtil.isBlankOrNull(plntCd)) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyBlankOrNull(java.lang.String)
     */
    public boolean validateConsistencyBlankOrNull(String input) {

        if (CheckUtil.isBlankOrNull(input)) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyOfRegister(java.util.List,
     *      java.lang.String)
     */
    public boolean validateConsistencyOfRegister(List<String> warningFlgList,
        String ignoreWarnings) {

        if (warningFlgList.contains(FLAG_Y)
            && !CHECK_ON.equals(ignoreWarnings)) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyOfRegisterPkgMtrial(java.lang.String, java.lang.String, java.util.List)
     */
    public boolean validateConsistencyOfRegisterPkgMtrial(String outrPkgCd,
        String pkgFormTyp, List<String> warningFlgList) {
        
        if (CheckUtil.isBlankOrNull(outrPkgCd)) {
            if (PKG_FORM_TYP_MULTI.equals(pkgFormTyp)) {
                return false;
            }
            if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp)) {
                if (warningFlgList != null && !warningFlgList.isEmpty()) {
                    for (String flg : warningFlgList) {
                        if (FLAG_Y.equals(flg)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyOverInstr(java.math.BigDecimal,
     *      java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyOverInstr(BigDecimal qty,
        BigDecimal instrQty, BigDecimal instrPkgedQty) {

        if (qty != null && instrQty != null && instrPkgedQty != null) {
            if (qty.compareTo(instrQty.subtract(instrPkgedQty)) > 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyOver(java.math.BigDecimal,
     *      java.math.BigDecimal)
     */
    public boolean validateConsistencyOver(BigDecimal qty,
        BigDecimal orderQty) {

        if (qty != null && orderQty != null) {
            if (qty.compareTo(orderQty) > 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyOverShipLotMultiple(java.math.BigDecimal,
     *      java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyOverShipLotMultiple(BigDecimal qty,
        BigDecimal tagQty, BigDecimal shipperLog) {

        if (qty != null && tagQty != null && shipperLog != null) {
            if (tagQty.intValue() == 0) {
                return false;
            } else {
                if (qty.divide(tagQty, 1, BigDecimal.ROUND_UP).compareTo(shipperLog) > 0) { // ST980 MOD
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyRegistPkg(java.lang.String)
     */
    public boolean validateConsistencyRegistPkg(String packagingConfirmedFlg) {

        if (!CheckUtil.isBlankOrNull(packagingConfirmedFlg)
            && packagingConfirmedFlg.equals(FLAG_N)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyRegisterAuthByTransPkgRevise(java.lang.String)
     */
    public boolean validateConsistencyRegisterAuthByTransPkgRevise(
        String authFlg) {

        if (AUTH_REGISTER_NUMERIC.equals(authFlg)) {
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException {

        return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2009R, shipperCd, plntCd);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencySingleItemNo(java.util.List)
     */
    public boolean validateConsistencySingleItemNo(
        List<String> pkgFormTypHiddenList) {

        // single article ITEM-NO check is performed.
        // When the data of "S" exists in the data beyond 2 つ which data selection is made and was chosen in a PKG Form TYPE (hidden)   Error
        // 単品品目番号チェックを行います。
        // 2つ以上のデータ選択されているかつ、選択したデータ内に梱包形態区分(hidden)が"S"のデータが存在する場合 エラー
        if (pkgFormTypHiddenList != null && pkgFormTypHiddenList.size() >= 2
            && pkgFormTypHiddenList.contains("S")) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateConsistencyStagingCd(java.util.List)
     */
    public boolean validateConsistencyStagingCd(List<String> loadingCdList) {

        // loading position code check
        // An error is made when "D" (Door) and "B" (Back) are intermingled in selected loading position code of all the data (*"F" (Free) can be intermingled [ other CDs and ]).
        // 荷積み位置コードチェック
        // 選択された全データの荷積み位置コードに"D"（Door）と"B"（Back）が混在している場合エラー(※"F"（Free）は他コードと混在可)
        if (loadingCdList != null && loadingCdList.size() > 0) {
            if (loadingCdList.contains("D") && loadingCdList.contains("B")) {
                return false;
            }
        }

        return true;
    }

    // ------------------------------------------------------------------------
    // Database check method validateDatabase
    // データベースチェックメソッド validateDatabase
    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseCigmaAvailable(boolean,
     *      java.lang.String)
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc,
        String compCd) throws ApplicationException {

        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseShipperCustomerShipTo(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperCustomerShipTo(
        String lgcyLibCompCd, String customerCd, String lgcyShipToCd)
        throws ApplicationException {

        return commonService.validateShipperCustomerShipTo(lgcyLibCompCd,
            customerCd, lgcyShipToCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseShipperOnHeaderMoveToCreate(java.lang.String)
     */
    public boolean validateDatabaseShipperOnHeaderMoveToCreate(String compCode)
        throws ApplicationException {

        return commonService.validateShipper(compCode);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseShipperWhPlantOnRegister(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperWhPlantOnRegister(
        String lgcyLibCompCd, String lgcyWhCd, String plantCd)
        throws ApplicationException {

        return commonService.validateShipperWhPlant(lgcyLibCompCd, lgcyWhCd,
            plantCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(java.lang.String, java.lang.String)
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(
        String shipperCd, String customerCd) throws ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        criteria.setShipperCd(shipperCd);
        criteria.setCustomerCd(customerCd);
        
        return w2009CmlDao.searchTmCigmaCustomerToXref(criteria);

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(java.lang.String, java.lang.String, com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(
        String shipperCd, String outerCd, W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        // The following processings are performed only when exterior sign existence is set up.
        // 外装記号存在が設定されている場合のみ以下の処理を行う。
        if (!CheckUtil.isBlankOrNull(outerCd)) {
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp(shipperCd); 
            tmPkgSetHdrCriteria.setOuterPkgCd(outerCd);

            TmPkgSetHdrDomain tmPkgSetHdrDomain = tmPkgSetHdrService
                .searchByKey(tmPkgSetHdrCriteria);

            // When the data number is zero affair
            // データ件数が0件の場合
            if (tmPkgSetHdrDomain == null) {
                return NXS_E7_0147;

            } else {
                // Does un-setting up exist?
                // 未設定が存在するか
                if (CheckUtil.isBlankOrNull(tmPkgSetHdrDomain.getVolumeUnit())
                    || tmPkgSetHdrDomain.getVolume() == null
                    || CheckUtil.isBlankOrNull(tmPkgSetHdrDomain.getLengthUnit())
                    || tmPkgSetHdrDomain.getLength() == null
                    || tmPkgSetHdrDomain.getWidth() == null
                    || tmPkgSetHdrDomain.getHeight() == null) {
                    return NXS_E7_0156;
                }
                
                // When there is not error, a return VALUE is set to {@link W2009CmlCriteriaDomain} of an argument.
                // エラーがなかった場合は、引数の{@link W2009CmlCriteriaDomain}に、戻り値を設定する。
                criteria.setWkVolumeUnit(tmPkgSetHdrDomain.getVolumeUnit());
                criteria.setWkVolume(tmPkgSetHdrDomain.getVolume());
                criteria.setWkLengthUnit(tmPkgSetHdrDomain.getLengthUnit());
                criteria.setWkLength(tmPkgSetHdrDomain.getLength());
                criteria.setWkHeight(tmPkgSetHdrDomain.getHeight());
                criteria.setWkWidth(tmPkgSetHdrDomain.getWidth());
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(java.lang.String, java.lang.String, java.lang.String)
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(
        String shipperCd, String customerCd, String lgcyShipTo) throws ApplicationException {

        // Ship-to existence check
        // 送荷先存在チェック
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setCustomerCd(customerCd);
        criteria.setLgcyShipTo(lgcyShipTo);
        String shipToCd = w2009CmlDao.searchTmCigmaShipToXref(criteria);
        
        return shipToCd;

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister(java.lang.String,
     *      java.lang.String)
     */
    public String validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister(
        String shipperCd, String changeOuterCd) throws ApplicationException {

        // A method is changed into a call form for the check of argument of W2009CmlCriteriaDomain.
        // W2009CmlCriteriaDomainの引数あるなしのため、メソッドを呼び出す形に変更する
        return this.validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(shipperCd, changeOuterCd, new W2009CmlCriteriaDomain());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public List<? extends W2009CmlDomain> validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {

        return w2009CmlDao.searchTmCigmaWhXrefByAuthList(criteria);
        
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmPkgMaterialsOnDetail(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTmPkgMaterialsOnDetail(String shipperCd,
        String pkgItemNo) throws ApplicationException {

        TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
        criteria.setOwnerComp(shipperCd);
        criteria.setPkgItemNo(pkgItemNo);
        criteria.setSearchCountCheckFlg(false);
        if (tmPkgMtrlService.searchCount(criteria) > 0) {
            return true;
        }

        return false;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTmPkgSpecificationDtlOnRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public String validateDatabaseTmPkgSpecificationDtlOnRegister(
        String shipperCd, String trnsCd, String pltzItemNo, String pkgCd, W2009CmlCriteriaDomain wkDomain)
        throws ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setTrnsCd(trnsCd);
        criteria.setPkgCd(pkgCd);
        criteria.setPltzItemNo(pltzItemNo);

        List<? extends W2009CmlDomain> domainList = w2009CmlDao
            .searchTmPkgSpecificationDtl(criteria);
        if (domainList == null || domainList.size() == 0) {
            // The applicable number of cases is zero affair.
            // 該当件数が0件
            return NXS_E7_0155;
        }
        
        // VOLUME information registration check
        // 容積情報登録チェック
        W2009CmlDomain domain = domainList.get(0);
        if (CheckUtil.isBlankOrNull(domain.getVolumeUnit())
            || domain.getVolume() == null
            || CheckUtil.isBlankOrNull(domain.getLengthUnit())
            || domain.getLength() == null || domain.getWidth() == null
            || domain.getHeight() == null) {

            return NXS_E7_0155;
        } else {
            // The VALUE handed over in order to use a VALUE by CML Register screen Register processing is set up.
            // CML Register画面 Register処理で値を利用するため引渡す値を設定する。
            wkDomain.setWkVolumeUnit(domain.getVolumeUnit());
            wkDomain.setWkLengthUnit(domain.getLengthUnit());
            wkDomain.setWkLengthPalletize(domain.getLength());
            wkDomain.setWkHeightPalletize(domain.getHeight());
            wkDomain.setWkWidthPalletize(domain.getWidth());
            wkDomain.setWkVolumePalletize(domain.getVolume());
        }
        
        return null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtMixedtagAuthOnCreateUpdate(java.lang.String, java.util.List)
     */
    public boolean validateDatabaseTtMixedtagAuthOnCreateUpdate(
        String mixTagNo, List<? extends UserAuthDomain> userAuthList)
        throws ApplicationException {
        
        List<String> authPlantList = new ArrayList<String>();
        for (UserAuthDomain domain : userAuthList) {
            authPlantList.add(domain.getProcMfgDivCd());
        }
        
        // Link items are acquired to MixtagNo.
        // MixtagNoに紐づく品目を取得
        TtMixtagItemNoCriteriaDomain criteria = new TtMixtagItemNoCriteriaDomain();
        criteria.setMixTagNo(mixTagNo);
        List<? extends TtMixtagItemNoDomain>  ttMixItems = ttMixtagItemNoService.searchByCondition(criteria);
        
        if (ttMixItems != null && ttMixItems.size() > 0) {
            for (TtMixtagItemNoDomain item : ttMixItems) {
                String plntCd = item.getPlntCd();
                
                // This is an authority error when there is at least one item of a factory code without authority in items which were acquired.
                // 取得した品目の中に1件でも権限のない工場コードの品目がある場合は権限エラー
                if (!authPlantList.contains(plntCd)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtMixedTagOnRegister(java.lang.String, java.lang.String)
     */
    public String validateDatabaseTtMixedTagOnRegister(String mixTagFlg,
        String mixTagNo) throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(mixTagFlg) && FLAG_Y.equals(mixTagFlg)) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setMixTagNo(mixTagNo);

            TtMixtagDomain ttMixtagDomain = ttMixtagService.lockByKeyNoWait(criteria);
            if (ttMixtagDomain == null) {
                // When the acquisition number is zero affair
                // 取得件数が0件の場合
                return GSCM_E0_0010;
            } else {
                // Status check
                // ステータスチェック
                if (MIX_TAG_STATUS_CML.equals(ttMixtagDomain.getMixTagStatus())) {
                    return NXS_E1_0029;
                }
            }

        }
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegister(java.lang.String)
     */
    public boolean validateDatabaseTtPltzInstrItemNoOnRegister(
        String pltzInstrNo) throws ApplicationException {

        // Only in pltzInstrNo !="", it checks.
        // pltzInstrNo ≠ "" の場合のみチェックを行います。
        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {

            // pltzInstrNo is set to search condition.
            // 検索条件に pltzInstrNo を設定する
            W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);

            // Lock of a Palletize Instruction Item No
            // 梱包指示品目番号のロック
            List<String> list = w2009CmlDao.searchTtPltzInstrItemNoLockBypltzInstrNoNowait(criteria);

            // An error is made when the number of acquisition results is zero.
            // 取得結果が0件の場合は、エラー
            if (list == null || list.size() == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String,
     *      java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(
        String pltzInstrNo, String mixTagFlg, String mixTagNo, String pkgCd,
        BigDecimal instrQty, BigDecimal qt) throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(pltzInstrNo) && FLAG_N.equals(mixTagFlg)) {
            W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);
            criteria.setMixTagNo(mixTagNo);
            criteria.setPkgCd(pkgCd);

            List<? extends W2009CmlItemDomain> w2009CmlDomainList = w2009CmlDao.searchTtPltzInstrItemNo(criteria);
            
            for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlDomainList) {
                if ((instrQty.subtract(w2009CmlItemDomain.getInstrPkgedQty()).subtract(w2009CmlItemDomain.getQty())).compareTo(qt) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrOnRegister(java.lang.String)
     */
    public String validateDatabaseTtPltzInstrOnRegister(
        String PltzInstrNo) throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(PltzInstrNo)) {
            TtPltzInstrCriteriaDomain tt = new TtPltzInstrCriteriaDomain();
            tt.setPltzInstrNo(PltzInstrNo);
            // Lock of a Packaging Instruction (=Pull)
            // 梱包指示のロック
            TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.lockByKeyNoWait(tt);
            
            if (ttPltzInstrDomain == null) {
                // An error is made when there are zero information (MSGID :  GSCM-E 0-0010).
                // 情報が0件の場合はエラー (MSGID : GSCM-E0-0010)
                return GSCM_E0_0010;
            } else {
                String pltzInstrStatus = ttPltzInstrDomain.getPltzInstrStatus();
                if (PLTZ_INSTR_STATUS_ALL_CML_CREATE.equals(pltzInstrStatus)
                    || PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.equals(pltzInstrStatus)) {
                    // An error is made when PALLETIZE INSTRUCTION STATUS is 40 and 50.    (MSGID :  NXS-E 1-0027)
                    // 梱包指示ステータスが40 また 50の場合、エラー  (MSGID : NXS-E1-0027)
                    return NXS_E1_0027;
                }
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrOnRegisterCancel(java.lang.String)
     */
    public String validateDatabaseTtPltzInstrOnRegisterCancel(String pltzInstrNo)
        throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);

            TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService
                .lockByKeyNoWait(criteria);
            if (ttPltzInstrDomain == null) {
                return GSCM_E0_0010;
            }

            W2009CmlCriteriaDomain criteria2 = new W2009CmlCriteriaDomain();
            criteria2.setPltzInstrNo(pltzInstrNo);
            List<String> list = w2009CmlDao.searchTtPltzInstrItemNoLockBypltzInstrNoNowait(criteria2);
            if (list == null || list.size() == 0) {
                return GSCM_E0_0010;
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrPrintCml(java.lang.String)
     */
    public boolean validateDatabaseTtPltzInstrPrintCml(
        String pltzInstrNo) throws ApplicationException {

        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);
            TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(criteria);
            // Status check
            // ステータスチェック
            if (ttPltzInstrDomain == null || !PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.equals(ttPltzInstrDomain.getPltzInstrStatus())) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrOnTransRevisePrintCml(java.lang.String)
     */
    public boolean validateDatabaseTtPltzInstrOnTransRevisePrintCml(
        String mainMark) throws ApplicationException {

        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        criteria.setMainMark(mainMark);
        TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(criteria);

        if (ttPltzDomain != null
            && !CheckUtil.isBlankOrNull(ttPltzDomain.getPltzInstrNo())) {
            TtPltzInstrCriteriaDomain ttPltzInstrCriteriaDomain = new TtPltzInstrCriteriaDomain();
            ttPltzInstrCriteriaDomain.setPltzInstrNo(ttPltzDomain
                .getPltzInstrNo());
            TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService
                .searchByKey(ttPltzInstrCriteriaDomain);
            if (ttPltzInstrDomain != null
                && !CheckUtil.isBlankOrNull(ttPltzInstrDomain
                    .getPltzInstrStatus())
                && !ttPltzInstrDomain.getPltzInstrStatus().equals(
                    PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT)) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain,
     *      com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)
     */
    public List<String> validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(
        W2009CmlCriteriaDomain criteria, TtPltzInstrDomain ttPltzInstrDomain)
        throws ApplicationException {

        List<String> errmsgs = new ArrayList<String>();
        
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrRequired()) && criteria.getPltzInstrRequired().equals(FLAG_Y)) {
            // Packaging Instruction (=Pull) information check
            // 梱包指示情報チェック
            W2009CmlDomain w2009CmlDomain = w2009CmlDao.searchTtPltzInstr(criteria);
            if (w2009CmlDomain == null) {
                errmsgs.add(NXS_E7_0047);
            } else {
                String status = w2009CmlDomain.getPltzInstrStatus();
                
                // search results are set to ttPltzInstrDomain (for an error display).
                // 検索結果をttPltzInstrDomainへセット(エラー表示のため)
                ttPltzInstrDomain.setShipperCd(w2009CmlDomain.getShipperCd());
                ttPltzInstrDomain.setPlntCd(w2009CmlDomain.getPlntCd());
                ttPltzInstrDomain.setLgcyWhCd(w2009CmlDomain.getLgcyWhCd());
                
                // acquisition VALUE is set to the item Wk of CriteriaDomain (for the storage to a session).
                // 取得値をCriteriaDomainのWk項目へ設定(セッションへの保管のため)
                criteria.setWkPltzInstrNo(criteria.getPltzInstrNo());
                criteria.setWkShipperCd(w2009CmlDomain.getShipperCd());
                criteria.setWkCustomerCd(w2009CmlDomain.getCustomerCd());
                criteria.setWkLgcyShipTo(w2009CmlDomain.getLgcyShipTo());
                criteria.setWkTrnsCd(w2009CmlDomain.getTrnsCd());
                criteria.setWkPlntCd(w2009CmlDomain.getPlntCd());
                criteria.setWkLgcyWhCd(w2009CmlDomain.getLgcyWhCd());
                criteria.setWkPackingWhCompCd(w2009CmlDomain.getCompCd());
                criteria.setWkPackingWhCd(w2009CmlDomain.getWhCd() );
                
                // Packaging Instruction (=Pull) document printing check (in the case of 10, an error is made)
                // 梱包指示書印刷チェック (10の場合エラー)
                if (!CheckUtil.isBlankOrNull(status) && status.equals(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED)) {
                    errmsgs.add(NXS_E7_0086);
                }
                
                // check completed [ PKG ]     (in the case of 40 or 50, an error is made)
                // 梱包完了済みチェック   (40 or 50の場合エラー)
                if (!CheckUtil.isBlankOrNull(status)
                        && (status.equals(PLTZ_INSTR_STATUS_ALL_CML_CREATE) || status.equals(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT))) {
                    errmsgs.add(NXS_E7_0048);
                }
                
                // NEXUS warehouse information acquisition
                // NEXUS倉庫情報取得
                if (CheckUtil.isBlankOrNull(w2009CmlDomain.getCompCd())) {
                    errmsgs.add(GSCM_E0_0030);
                }
            }
        }
        
        if (errmsgs.size() > 0) {
            return errmsgs;
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzItemOnTransReviseRegister(java.lang.String)
     */
    public String validateDatabaseTtPltzItemOnTransReviseRegister(
        String mainMark) throws ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setMainMark(mainMark);

        if (w2009CmlDao.searchTtPltzItemLockByMainMarkNowait(criteria).size() == 0) {
            return GSCM_E0_0010;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzOnMainTransPkgRevise(java.lang.String)
     */
    public List<String> validateDatabaseTtPltzOnMainTransPkgRevise(
        String mainMark) throws ApplicationException {

        List<String> errmsgs = new ArrayList<String>();
        
        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        criteria.setMainMark(mainMark);
        
        TtPltzDomain ttPltzDomain = ttPltzService.lockByKeyNoWait(criteria);

        // Number-of-cases check
        // 件数チェック
        if (ttPltzDomain == null) {
            errmsgs.add(GSCM_E0_0010);
        } else {
            
            // Palletize Status check
            // In the case of pltzStatus !=10, an error is made (MSGID :  NXS-E 1-0006).
            // パレタイズステータスチェック 
            // pltzStatus ≠10 の場合はエラー (MSGID : NXS-E1-0006)
            if (!PLTZ_STATUS_PLTZ.equals(ttPltzDomain.getPltzStatus())) {
                // Palletize Status check
                // パレタイズステータスチェック
                errmsgs.add(NXS_E1_0006);
            }

            // In X-Palletize check xmainMark !="", an error is made (MSGID :  NXS-E 1-0006).
            // まとめパレタイズチェック xmainMark ≠ "" の場合はエラー (MSGID : NXS-E1-0006)
            if (!CheckUtil.isBlankOrNull(ttPltzDomain.getXmainMark())) {
                // X-Palletize check
                // まとめパレタイズチェック
                errmsgs.add(NXS_E1_0006);
            }

            // Check of a Carry-Out and a Carry-In
            // In lastTrStatus = "20" or lastTrStatus ="30", an error is made (MSGID :  NXS-E 1-0030).
            // 搬出・搬入のチェック
            // lastTrStatus = "20" または lastTrStatus = "30" の場合はエラー (MSGID : NXS-E1-0030)
 
            if (CARRY_OUT_IN_ISSUE_TR.equals(ttPltzDomain.getLastTrStatus())
                    || CARRY_OUT_IN_ACTIVATE_TR.equals(ttPltzDomain.getLastTrStatus())) {
                errmsgs.add(NXS_E1_0030);
            }

            // Shift CML check
            // 移行CMLチェック
            if (!CheckUtil.isBlankOrNull(ttPltzDomain.getMigrationFlg()) && ttPltzDomain.getMigrationFlg().equals(FLAG_Y)) {
                errmsgs.add(NXS_E1_0025);
            }
        }
        
        if (errmsgs.size() > 0) {
            return errmsgs;
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzOnRegisterCancel(java.lang.String)
     */
    public List<String> validateDatabaseTtPltzOnRegisterCancel(String mainMark)
        throws ApplicationException {

        // Palletize check
        // パレタイズチェック
        List<String> errmsgs = new ArrayList<String>();

        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        criteria.setMainMark(mainMark);

        TtPltzDomain ttPltzDomain = ttPltzService.lockByKeyNoWait(criteria);

        // Number-of-cases check
        // 件数チェック
        if (ttPltzDomain == null) {
            errmsgs.add(GSCM_E0_0010);
        } else {
            
            // Palletize Status check
            // In the case of pltzStatus != 10, an error is made (MSGID :  NXS-E 1-0006).
            // パレタイズステータスチェック
            // pltzStatus ≠ 10 の場合はエラー (MSGID : NXS-E1-0006)
            if (!PLTZ_STATUS_PLTZ.equals(ttPltzDomain.getPltzStatus())) {
                errmsgs.add(NXS_E1_0006);
            }

            // In X-Palletize check xmainMark !="", an error is made (MSGID :  NXS-E 1-0006).
            // まとめパレタイズチェック xmainMark ≠ "" の場合はエラー (MSGID : NXS-E1-0006) 
            if (!CheckUtil.isBlankOrNull(ttPltzDomain.getXmainMark())) {
                errmsgs.add(NXS_E1_0006);
            }
            
            // The check of Carry-Out, and a Carry-In
            // In lastTrStatus = "20" or lastTrStatus ="30", an error is made (MSGID :  NXS-E 1-0047).
            // 搬出・搬入のチェック
            // lastTrStatus = "20" または lastTrStatus = "30" の場合はエラー (MSGID : NXS-E1-0047)
            if (CARRY_OUT_IN_ISSUE_TR.equals(ttPltzDomain.getLastTrStatus())
                || CARRY_OUT_IN_ACTIVATE_TR.equals(ttPltzDomain.getLastTrStatus())) {
                errmsgs.add(NXS_E1_0047);
            }
            
            // 現在倉庫チェック
            // 現在倉庫が、梱包倉庫と異なる場合はエラー
            if(!ttPltzDomain.getPackingWhCompCd().equals(ttPltzDomain.getCurWhCompCd())
                || !ttPltzDomain.getPackingWhCd().equals(ttPltzDomain.getCurWhCd())) {
                errmsgs.add(NXS_E1_0001);
            }
            
            // CriteriaDomain for lock acquisition is created.
            // ロック取得用のCriteriaDomainを作成
            W2009CmlCriteriaDomain mainMarkCriteria = new W2009CmlCriteriaDomain();
            mainMarkCriteria.setMainMark(mainMark);
            
            // Palletize-Item check -
            // An error is made, when MAIN MARK is used as a key and the target information cannot be acquired (MSGID :  GSCM-E 0-0010).
            // パレタイズ対象品チェック -
            //   メインマークをキーにして対象の情報が取得できない場合はエラー(MSGID : GSCM-E0-0010)
            List<String> mainMarks = w2009CmlDao.searchTtPltzItemLockByMainMarkNowait(mainMarkCriteria);
            if (mainMarks == null || mainMarks.isEmpty()) {
                errmsgs.add(GSCM_E0_0010);
            }
            
            // Palletize-Item-Receive-Order check
            // An error is made, when MAIN MARK is used as a key and the target information cannot be acquired (MSGID :  GSCM-E 0-0010).
            // パレタイズ対象品受注情報チェック
            //   メインマークをキーにして対象の情報が取得できない場合はエラー(MSGID : GSCM-E0-0010)
            mainMarks = w2009CmlDao.searchTtPltzItemOdrLockByMainMarkNowait(mainMarkCriteria);
            if (mainMarks == null || mainMarks.isEmpty()) {
                errmsgs.add(GSCM_E0_0010);
            }
            
            // The lock of Palletize-Item-KANBAN check - Palletize Item KANBAN is acquired.
            // In the registration from * WEB, since a KANBAN information may not be registered, only acquisition of a lock is performed.
            // パレタイズ対象品かんばん情報チェック - パレタイズ対象品かんばん情報のロックを取得
            // ※ WEBからの登録では、かんばん情報が登録されないことがある為、ロックの取得のみを行う。
            mainMarks = w2009CmlDao.searchTtPltzKanbanLockByMainMarkNowait(mainMarkCriteria);

        }

        if (errmsgs.size() > 0) {
            return errmsgs;
        } else {
            return null;
        }

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTtPltzOnTransReviseRegister(java.lang.String, com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public boolean validateDatabaseTtPltzOnTransReviseRegister(String mainMark, W2009CmlCriteriaDomain reCriteria, List<MessageDomain> errorMessages)
        throws ApplicationException {

        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        criteria.setMainMark(mainMark);
        TtPltzDomain ttPltzDomain = ttPltzService.lockByKeyNoWait(criteria);

        if (ttPltzDomain == null) {
            // Number-of-cases check error (MSGID :  GSCM-E 0-0010)
            // 件数チェックエラー　(MSGID : GSCM-E0-0010)
            errorMessages.add(new MessageDomain(null, GSCM_E0_0010, null));
        } else {
            if (!PLTZ_STATUS_PLTZ.equals(ttPltzDomain.getPltzStatus())) {
                // In the case of Palletize Status check pltzStatus != 10, an error is made (MSGID :  NXS-E 1-0006).
                // パレタイズステータスチェック pltzStatus ≠ 10 の場合はエラー　(MSGID : NXS-E1-0006)
                errorMessages.add(new MessageDomain(null, NXS_E1_0006, null));
            }

            if (!CheckUtil.isBlankOrNull(ttPltzDomain.getXmainMark())) {
                // In X-Palletize check xmainMark !="", an error is made (MSGID :  NXS-E 1-0006).
                // まとめパレタイズチェック xmainMark ≠ "" の場合はエラー　(MSGID : NXS-E1-0006)
                errorMessages.add(new MessageDomain(null, NXS_E1_0006, null));
            }

            if (CARRY_OUT_IN_ISSUE_TR.equals(ttPltzDomain.getLastTrStatus())
                || CARRY_OUT_IN_ACTIVATE_TR.equals(ttPltzDomain.getLastTrStatus())) {
                // Check of a Carry-Out and a Carry-In
                // lastTrStatus = 20 or lastTrStatus = in the case of 30, an error is made (MSGID :  NXS-E 1-0030).
                // 搬出・搬入のチェック
                // lastTrStatus = 20 または lastTrStatus = 30 の場合はエラー (MSGID : NXS-E1-0030)
                errorMessages.add(new MessageDomain(null, NXS_E1_0030, null));
            }
            reCriteria.setWkPltzInstrNo(ttPltzDomain.getPltzInstrNo());
            // UT110 TRIAL SHIPMENT/号試品対応 ADD
            // For not in case of manual registration, Return the TT_PLTZ.LENGTH_UNIT.
            // マニュアル登録でない場合の変換用にパレタイズの長さ単位を返す。
            reCriteria.setLengthUnit(ttPltzDomain.getLengthUnit());
        }
        return errorMessages.isEmpty();
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTwPltzItemItemNoOnCreateMoveToRegister(java.lang.String)
     */
    public boolean validateDatabaseTwPltzItemItemNoOnCreateMoveToRegister(
        String dscId) throws ApplicationException {

        // An error is made when there are zero Palletize-Item-Work information.
        // パレタイズ対象品ワーク情報が0件の場合はエラー
        TwPltzItemItemNoCriteriaDomain criteria = new TwPltzItemItemNoCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        int count = twPltzItemItemNoService.searchCount(criteria);
        if (count == 0) {
            return false;
        }

        return true;
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseTwPltzItemItemNoOnCreateUpdate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public List<String> validateDatabaseTwPltzItemItemNoOnCreateUpdate(W2009CmlCriteriaDomain criteria, List<? extends W2009CmlItemDomain> itemDomainList) throws ApplicationException {
        
        List<String> errmsgs = new ArrayList<String>();
        
        // List for a correlation check
        // 相関チェック用リスト
        List<String> countSortKeyList = new ArrayList<String>();
        List<String> invoiceKeyList = new ArrayList<String>();
        List<String> stgInstrItemFlgList = new ArrayList<String>();
        List<String> ccTypeList = new ArrayList<String>();
        List<String> clList = new ArrayList<String>();
        List<String> pkgFormTypList = new ArrayList<String>();
        List<String> currCdList = new ArrayList<String>();
        List<String> pltzItemNoList = new ArrayList<String>();

        String loadingCd = LOADING_CD_FREE;

        // Domain for a single article ITEM-NO check
        // * PkgFormTyp = -- in "S", only one affair can be chosen -- as
        //    Since the check is contained in the timing of ValidateContendency
        //    Only one affair of the check OK
        // 単品品目番号チェック用ドメイン
        // ※ PkgFormTyp = "S" の場合は、1件しか選択できないように、
        //    ValidateContendency のタイミングでチェックが入っている為
        //    チェックOKの1件のみ
        W2009CmlItemDomain domain = null;
        
        // The variable which holds the additional number of cases on registration number check
        // 登録件数チェック用に追加件数を保持する変数
        int newItemCount = 0;
        
        for (int i = 0; i < itemDomainList.size(); i++) {
            W2009CmlItemDomain listDomain = itemDomainList.get(i); 
            // CONTAINER-SORTING-KEY check - currency check   までは
            // It checks only to a top line in// selected line.
            // コンテナ層別キーチェック～通貨チェック までは、
            // 選択された行の中で先頭の行に対してのみチェックする
            if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getDisableFlg())) {
                if (domain == null) {
                    domain = listDomain;
                    
                    // A VALUE is set to the list for a correlation check.
                    // 相関チェック用のリストに値を設定
                    countSortKeyList.add(listDomain.getContainerSortingKey());
                    invoiceKeyList.add(listDomain.getInvoiceKey());
                    stgInstrItemFlgList.add(listDomain.getStgInstrItemFlg());
                    ccTypeList.add(listDomain.getCustomTimingTyp());
                    clList.add(listDomain.getContainerLooseTyp());
                    pkgFormTypList.add(listDomain.getPkgFormTyp());
                    currCdList.add(listDomain.getCurrCd());
                    pltzItemNoList.add(listDomain.getPltzItemNo());
                }
                
                if (LOADING_CD_FREE.equals(loadingCd) && !LOADING_CD_FREE.equals(listDomain.getLoadingCd())) {
                    loadingCd = listDomain.getLoadingCd();
                }
                
                if (FLAG_N.equals(listDomain.getDisableFlg())) {
                    newItemCount = newItemCount + 1;
                }
            }
        }

        // The same Palletize condition check
        // 同一パレタイズ条件チェック
        TwPltzItemItemNoCriteriaDomain twPltzItemItemNoCriteria = new TwPltzItemItemNoCriteriaDomain();
        twPltzItemItemNoCriteria.setDscId(criteria.getLoginUserDscId());
        twPltzItemItemNoCriteria.setPreferredOrder("DSC_ID, BRCH");
        List<TwPltzItemItemNoDomain> twPltzItemItemList = twPltzItemItemNoService.searchByCondition(twPltzItemItemNoCriteria);
        
        if ( twPltzItemItemList.size() == 0) {
            // With no check
            // チェックなし
        } else {
        
            TwPltzItemItemNoDomain twPltzItemItemNoDomain = twPltzItemItemList.get(0);
    
            // CONTAINER-SORTING-KEY check
            // コンテナ層別キーチェック
            List<String> keys = new ArrayList<String>();
            keys.add(twPltzItemItemNoDomain.getContainerSortingKey());
            keys.addAll(countSortKeyList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0101);
            }
            
            // Inv. Key check
            // インボイスキーチェック
            keys.clear();
            keys.add(twPltzItemItemNoDomain.getInvoiceKey());
            keys.addAll(invoiceKeyList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0103);
            }
            
            // staging-instruction flag check
            // 荷揃え指示フラグチェック
            keys.clear();
            keys.add(twPltzItemItemNoDomain.getStgInstrItemFlg());
            keys.addAll(stgInstrItemFlgList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0104);
            }
            
            // CUSTOM-TIMING-TYPE check
            // 通関タイミング区分チェック
            keys.clear();
            keys.add(twPltzItemItemNoDomain.getCustomTimingTyp());
            keys.addAll(ccTypeList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0105);
            }
            
            // C/L check
            // コンテナルーズチェック
            keys.clear();
            keys.add(twPltzItemItemNoDomain.getContainerLooseTyp());
            keys.addAll(clList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0106);
            }
            
            // UT110 TRIAL SHIPMENT/号試品対応 ADD if
            if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                // PACKAGE-FORM-TYPE check
                // 梱包形態チェック
                keys.clear();
                keys.add(twPltzItemItemNoDomain.getPkgFormTyp());
                keys.addAll(pkgFormTypList);
                if (!validateConsistencyAllSame(keys)) {
                    errmsgs.add(NXS_E7_0107);
                }
            }
            
            // Currency check
            // 通貨チェック
            keys.clear();
            keys.add(twPltzItemItemNoDomain.getCurrCd());
            keys.addAll(currCdList);
            if (!validateConsistencyAllSame(keys)) {
                errmsgs.add(NXS_E7_0108);
            }
        }
        
        // loading position code check
        // 荷積み位置コードチェック
        W2009CmlCriteriaDomain w2009CmlCriteria = new W2009CmlCriteriaDomain();
        w2009CmlCriteria.setLoginUserDscId(criteria.getLoginUserDscId());
        w2009CmlCriteria.setLoadingCd(loadingCd);
        w2009CmlCriteria.setSearchCountCheckFlg(false);
        int count = w2009CmlDao.searchTwPltzItemItemNoForChkOnCreate(w2009CmlCriteria);
        if (count > 0) {
            errmsgs.add(NXS_E7_0102);
        }
        
        // Single article ITEM-NO check
        // 単品品目番号チェック
        for (int i = 0; i < itemDomainList.size(); i++) {
            W2009CmlItemDomain itemDomain = itemDomainList.get(i);
            if (PKG_FORM_TYP_SINGLE.equals(itemDomain.getPkgFormTyp())) {
                W2009CmlCriteriaDomain w2009CmlSingleChkCriteria = new W2009CmlCriteriaDomain();
                w2009CmlSingleChkCriteria.setLoginUserDscId(criteria.getLoginUserDscId());
                w2009CmlSingleChkCriteria.setPltzItemNo(itemDomain.getPltzItemNo());
                w2009CmlSingleChkCriteria.setPkgCd(itemDomain.getPkgCd());
                w2009CmlSingleChkCriteria.setSearchCountCheckFlg(false);
                int result = w2009CmlDao.searchCountTwPltzItemItemNoForSingleChkOnCreate(w2009CmlSingleChkCriteria);
                if (result > 0) {
                    errmsgs.add(NXS_E7_0051);
                    break;
                }
            }
        }
       
        // The registration number check
        // 登録件数チェック
        W2009CmlCriteriaDomain w2009CmlRegChkCriteria = new W2009CmlCriteriaDomain();
        w2009CmlRegChkCriteria.setLoginUserDscId(criteria.getLoginUserDscId());
        w2009CmlRegChkCriteria.setSearchCountCheckFlg(false);
        int regCount = w2009CmlDao.searchCountTwPltzItemItemNoForLimitNumChkOnCreate(w2009CmlRegChkCriteria);
        regCount = regCount + newItemCount;
        if (regCount > 999) {
            errmsgs.add(NXS_E7_0050);
        }

        // A result is returned.
        // 結果を返す
        if (errmsgs.size() > 0) {
            return errmsgs;
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#validateDatabaseWhCompanyWh(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateDatabaseWhCompanyWh(
        String packingWhCompCd, String packingWhCd) throws ApplicationException {

        return commonService.validateCompWh(packingWhCompCd, packingWhCd);
    }

    // --------------------------------- Registration system method create ---------------------------------
    // --------------------------------- 登録系メソッド create ---------------------------------

    // --------------------------------- Search system method search ---------------------------------
    // --------------------------------- 検索系メソッド search ---------------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {

        // Palletize, the search number acquisition of a Palletize Item
        // パレタイズ、パレタイズ対象品の検索件数取得
        int count = w2009CmlDao.searchCountTtPltzByCml(criteria);

        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchCountOnRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountOnRegister(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        int count = 0;
        // Exception is made not to be thrown at least 0 affair.
        // 0件でもExceptionがthrowされないようにする。
        criteria.setSearchCountCheckFlg(false);
        if (W2009_CML_MODE_EDIT.equals(criteria.getFunctionMode())) {
            // In the case of for an update
            // 更新用の場合
            count = w2009CmlDao.searchCountTwPltzItemItemNo(criteria);
        } else {
            // In the case of the business of reference
            // 参照の用の場合
            count = w2009CmlDao.searchCountTtPltzByMainMarkMixTagNo(criteria);
        }
        return count;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchCountOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountOnRegisterDelete(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        // Exception is made not to be thrown at least 0 affair.
        // 0件でもExceptionがthrowされないようにする。
        criteria.setSearchCountCheckFlg(false);
        int count = w2009CmlDao.searchCountTwPltzItemItemNo(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnCreateSearch(
        W2009CmlCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {

        String pkgFormTyp = criteria.getPkgFormTyp();
        String stgInstrFlg = criteria.getStgInstrItemFlg();
        String mixTagNo = criteria.getMixTagNo();

        if ((PKG_FORM_TYP_SINGLE.equals(pkgFormTyp) || FLAG_Y.equals(stgInstrFlg)) && !StringUtils.isEmpty(mixTagNo)) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }

        // An information is acquired.
        // 情報を取得する
        List<? extends W2009CmlItemDomain> list;
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            // When Palletize Instr. No is not ""
            // Palletize Instr. No が "" でない場合
            list = w2009CmlDao.searchMixTagItemNoOnCreate(criteria);
        } else {
            // When Palletize Instr. No is ""
            // Palletize Instr. No が "" の場合
            list = w2009CmlDao.searchNonInstructionItemNoOnCreate(criteria);
        }

        // Information on MixTagFlg = N   The list of itemNo is acquired.
        // MixTagFlg = N の情報 のitemNo のリストを取得
        List<String> itemNoList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++ ) {
            W2009CmlItemDomain itemDomain = list.get(i);
            if ("N".equals(itemDomain.getMixTagFlg())) {
                itemNoList.add(itemDomain.getPltzItemNo());
            }
        }

        // About the information on MixTagFlg = N, an ITEM NO is acquired from CIGMA.
        // MixTagFlg = N の情報について、CIGMAから品目番号を取得する
        // Domain into which the result of WEB service is put
        // WEBサービスの結果を入れるドメイン
        Ws2004ResultDomain wsResultDomain = null;

        if (itemNoList.size() > 0) {
            // It was inputted on the Header screen. Shipper
            // Header 画面で入力された Shipper
            String compCd = criteria.getShipperCd();
            // W/H inputted on the Header screen
            //  Header 画面で入力された W/H
            String whCd = criteria.getLgcyWhCd();
            // It was inputted on the Header screen. Cust. No.
            // Header 画面で入力された Cust. No.
            String customerCd = criteria.getCustomerCd();

            List<String> plantCdList = null;

            if (!CheckUtil.isBlankOrNull(criteria.getPlntCd())) {
                // When a CIGMA W/H CD is chosen
                // CIGMA倉庫コードを選択した場合
                // Plant inputted on the Header screen CD
                // Header 画面で入力された Plant CD
                plantCdList = new ArrayList<String>();

                plantCdList.add(criteria.getPlntCd());
                wsResultDomain = ws2004RestService.searchItemInfoForCml(compCd,
                    plantCdList, whCd, itemNoList, customerCd);
            } else {
                // When a NEXUS W/H CD is chosen
                // NEXUS倉庫コードを選択した場合
                plantCdList = w2009CmlDao.searchTmCigmaWhXrefByAuth(criteria);

                if (plantCdList.size() == 0) {
                    // An error is made when the number of corresponding data is zero.
                    // 該当データが0件の場合はエラー
                    throw new GscmApplicationException(NXS_E1_0049);
                } else {
                    wsResultDomain = ws2004RestService.searchItemInfoForCml(
                        compCd, plantCdList, whCd, itemNoList, customerCd);
                }
            }

            // The check of the Status of Web service
            // Webサービスのステータスの確認
            if (WS_RESULT_ERROR.equals(wsResultDomain.getResultCode())) {
                throw new SystemException(NXS_91_0001);
            }
        }

        // An ITEM-NO information is changed into MAP from CIGMA.
        // CIGMAから品目番号情報をMAPに変換
        Map<String, Ws2004ResultItemDomain> ws2004ResultMap = new HashMap<String, Ws2004ResultItemDomain>();
        if (wsResultDomain != null && !wsResultDomain.getItemList().isEmpty()) {

            // Map acquisition of a QUANTITY UNIT
            // 数量単位のMap取得
            TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
            List<? extends TmMeasureUnitDomain> unitList = tmMeasureUnitService
                .searchByCondition(tmMeasureUnitCriteriaDomain);
            Map<String, String> unitMap = new HashMap<String, String>();
            for (int k = 0; k < unitList.size(); k++ ) {
                unitMap.put(unitList.get(k).getLgcyUnitCd(), unitList.get(k)
                    .getUnitCd());
            }

            // QUANTITY UNIT is replaced and it stores in Map.
            // 数量単位を置換えて、Mapに格納
            List<? extends Ws2004ResultItemDomain> ws2004ResultList = wsResultDomain
                .getItemList();
            for (int m = 0; m < ws2004ResultList.size(); m++ ) {
                Ws2004ResultItemDomain domain = ws2004ResultList.get(m);
                domain.setUnmsr(unitMap.get(domain.getUnmsr()));
                ws2004ResultMap.put(domain.getItnbr(), domain);
            }
        }

        // Combination of data
        // データの結合
        List<W2009CmlItemDomain> resultList = new ArrayList<W2009CmlItemDomain>();
        for (int n = 0; n < list.size(); n++ ) {
            W2009CmlItemDomain itemDomain = list.get(n);
            if ("N".equals(itemDomain.getMixTagFlg())) {
                String itemNo = itemDomain.getPltzItemNo();
                if (ws2004ResultMap.containsKey(itemNo)) {
                    Ws2004ResultItemDomain wsDomain = ws2004ResultMap
                        .get(itemNo);
                    BigDecimal totalQty = new BigDecimal(wsDomain.getMohtq());
                    itemDomain.setOnHandQty(totalQty.subtract(itemDomain
                        .getTmpQty()));
                    itemDomain.setCurrCd(wsDomain.getCurr3());
                    itemDomain.setPlntCd(wsDomain.getPackc());
                    itemDomain.setQtyUnit(wsDomain.getUnmsr());
                    resultList.add(itemDomain);
                }
            } else {
                resultList.add(itemDomain);
            }
        }

        // Number-of-cases check
        // 件数チェック
        if (resultList.size() == 0) {
            // 0 affair error
            // 0件エラー
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        if (SEARCH_MAX_COUNT < resultList.size()) {
            // The maximum number excess error
            // 最大件数超過エラー
            Object[] params = {
                resultList.size(),
                SEARCH_MAX_COUNT
            };
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }

        // The list of results is returned.
        // 結果の一覧を返却
        return resultList;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public List<? extends W2009CmlDomain> searchForPagingOnMainSearch(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        // Acquisition of Palletize, and a Palletize Item
        // パレタイズ、パレタイズ対象品の取得
        List<? extends W2009CmlDomain> list = w2009CmlDao
            .searchForPagingTtPltzByCml(criteria);
        
        String baseAuthFlg = criteria.getBaseAuthFlg();
        
        // In the case of the data of RALL and BALL, the case of authFlg = null,
        // since it may be, null or in the case of 0, it overwrites with the VALUE of baseAuthFlg.
        // RALL,BALL のデータの場合は、authFlg = null の場合が
        // あり得るため、null または 0 の場合は、baseAuthFlg の値で上書きする。
        for (W2009CmlDomain domain : list) {
            if (domain.getAuthFlg() == null || AUTH_EMPTY_NUMERIC.equals(domain.getAuthFlg())) {
                domain.setAuthFlg(baseAuthFlg);
            }
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchOnRegisterDelete(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        return this.searchOnRegisterInitByFromCreate(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchForPagingOnTransReviseInit(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.lang.String)
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnTransReviseInit(
        W2009CmlCriteriaDomain criteria, String callScreenID) throws ApplicationException {

        List<W2009CmlItemDomain> list = new ArrayList<W2009CmlItemDomain>();

        // Palletize, and a Measure Unit Master are acquired.
        // パレタイズ、計量単位原単位を取得する
        W2009CmlDomain unitDomain = w2009CmlDao.searchTmMeasureUnit(criteria);
        
        // Acquisition of a MAIN MARK
        // メインマークの取得
        String mainMark = criteria.getMainMark();
        
        // In the case of the changes from a CML Main Screen
        // CML Main Screen画面からの遷移の場合
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMark(criteria.getMainMark());
        TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(ttPltzCriteriaDomain);
        if (ttPltzDomain == null) {
            return list;
        }
        
        // QUANTITY-UNIT master acquisition
        // 数量単位原単位取得
        // VolumeUnit
        TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getVolumeUnit());
        TmMeasureUnitDomain volumeUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (volumeUnitDomain == null) {
            return list;
        }
        // WeightUnit
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getWeightUnit());
        TmMeasureUnitDomain wightUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (wightUnitDomain == null) {
            return list;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        // LengthUnit
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getLengthUnit());
        TmMeasureUnitDomain lengthUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (lengthUnitDomain == null) {
            return list;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        if (SCREEN_ID_W2009.equals(callScreenID)) {

            // A setting of the VALUE of search-condition area
            // 検索条件エリアの値の設定
            criteria.setShipperCd(ttPltzDomain.getShipperCd());
            criteria.setCustomerCd(ttPltzDomain.getCustomerCd());
            criteria.setLgcyShipTo(ttPltzDomain.getLgcyShipTo());
            criteria.setTrnsCd(ttPltzDomain.getTrnsCd());
            criteria.setPlntCd(ttPltzDomain.getPlntCd());
            criteria.setLgcyWhCd(ttPltzDomain.getLgcyWhCd());
            criteria.setPkgFormTyp(ttPltzDomain.getPkgFormTyp());
            criteria.setOriginalOuterPkgCd(ttPltzDomain.getOuterPkgCd());
            criteria.setReviseFlg(ttPltzDomain.getReviseFlg());
            criteria.setPackagingConfirmedFlg(FLAG_N);
            criteria.setVolume(ttPltzDomain.getVolume());
            criteria.setVolumeUnit(volumeUnitDomain.getUnitDisp());
            criteria.setNetWeight(ttPltzDomain.getNetWeight());
            criteria.setWeightUnit(wightUnitDomain.getUnitDisp());
            criteria.setGrossWeight(ttPltzDomain.getGrossWeight());
            criteria.setComUpdateTimestamp(ttPltzDomain.getComUpdateTimestamp());
            // UT110 TRIAL SHIPMENT/号試品対応 ADD START
            criteria.setLength(ttPltzDomain.getLength());
            criteria.setWidth(ttPltzDomain.getWidth());
            criteria.setHeight(ttPltzDomain.getHeight());
            criteria.setLengthUnit(lengthUnitDomain.getUnitDisp());
            if (PKG_FORM_TYP_MANUAL_REG.equals(ttPltzDomain.getPkgFormTyp())) {
                criteria.setManualRegFlg(FLAG_Y);
            } else {
                criteria.setManualRegFlg(FLAG_N);
            }
            // UT110 TRIAL SHIPMENT/号試品対応 ADD END
            criteria.setPalletCartonTyp(ttPltzDomain.getPalletCartonTyp()); // UT420 ADD
            criteria.setPalletNo(ttPltzDomain.getPalletNo()); // UT420 ADD

        } else if (SCREEN_ID_W2013.equals(callScreenID)) {

            BigDecimal dispLength = null;
            BigDecimal dispWidth = null;
            BigDecimal dispHeight = null;
            BigDecimal dispVolume = null;
            BigDecimal dispGrossWeight = null;

            if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                
                // UT110 TRIAL SHIPMENT/号試品対応 ADD START
                dispLength = ttPltzDomain.getLength();
                dispWidth = ttPltzDomain.getWidth();
                dispHeight = ttPltzDomain.getHeight();
                // UT110 TRIAL SHIPMENT/号試品対応 ADD END
                
                // In the case of the changes from a CML PKG Detail screen
                // VOLUME for a display
                // CML PKG Detail 画面からの遷移の場合
                // 表示用容積
                dispVolume = ttPltzDomain.getVolume();
                
                // A VOLUME is acquired when Change Outer CD has been set up.
                // Change Outer CDが未設定でない場合、容積を取得する
                if (!CheckUtil.isBlankOrNull(criteria.getOuterPkgCd())) {
                    
                    // PKG combination master (header) is searched.
                    // 梱包組合せ原単位（ヘッダ）を検索
                    TmPkgSetHdrCriteriaDomain pkcriteria = new TmPkgSetHdrCriteriaDomain();
                    pkcriteria.setOwnerComp(criteria.getShipperCd());
                    pkcriteria.setOuterPkgCd(criteria.getOuterPkgCd());
                    TmPkgSetHdrDomain tmPGKset = tmPkgSetHdrService.searchByKey(pkcriteria);
                    
                    if (!tmPGKset.getVolumeUnit().equals(ttPltzDomain.getVolumeUnit())) {
                        Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
                        dispVolume = convertVolumeUnit(tmPGKset.getVolume(), tmPGKset.getVolumeUnit(), ttPltzDomain.getVolumeUnit(), params);
                    } else {
                        dispVolume = tmPGKset.getVolume();
                    }
                }
                
                // Acquisition of G/W
                // G/Wの取得
                W2009CmlCriteriaDomain searchCriteria = new W2009CmlCriteriaDomain();
                searchCriteria.setLoginUserDscId(criteria.getLoginUserDscId());
                List<? extends W2009CmlDomain> cmlDomainList = w2009CmlDao.searchTwPltzItemPkgByDscId(searchCriteria);
                
                // Measurement unit of a Palletize
                // パレタイズの計量単位
                String dispWeightUnit = unitDomain.getWeightUnit();
                
                // G/W for a display
                // 表示用G/W
                dispGrossWeight = BigDecimal.ZERO;
                dispGrossWeight = dispGrossWeight.add(ttPltzDomain.getNetWeight());
                Object[] paramsForGross = { commonService.getResource(criteria.getLocale(), "label.grossWeight") };
                if (!CollectionUtils.isEmpty(cmlDomainList)) {
                    for (W2009CmlDomain cmlDomain : cmlDomainList) {
                        String weightUnit = cmlDomain.getWeightUnit();
                        BigDecimal netWeight = cmlDomain.getNetWeight();
                        
                        Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                        netWeight = convertWeightUnit(netWeight, weightUnit, dispWeightUnit, params);

                        dispGrossWeight = dispGrossWeight.add(netWeight);
                        if (commonService.isWeightOverflow(dispGrossWeight)) {
                            throw new GscmApplicationException(NXS_E7_0157, paramsForGross);
                        }
                    }
                }

            // UT110 TRIAL SHIPMENT/号試品対応 ADD
            // In the case of manual registration, displays the screen information.
            // マニュアル登録の場合画面情報をそのまま表示
            } else {
                dispLength = criteria.getLength();
                dispWidth = criteria.getWidth();
                dispHeight = criteria.getHeight();
                dispVolume = criteria.getVolume();
                dispGrossWeight = criteria.getGrossWeight();
            }

            // W2019CriteriaDomain which received screen header item is restuffed.
            // 画面ヘッダ項目を受け取ったW2019CriteriaDomainに詰めなおす
            criteria.setShipperCd(ttPltzDomain.getShipperCd());
            criteria.setCustomerCd(ttPltzDomain.getCustomerCd());
            criteria.setLgcyShipTo(ttPltzDomain.getLgcyShipTo());
            criteria.setTrnsCd(ttPltzDomain.getTrnsCd());
            criteria.setPlntCd(ttPltzDomain.getPlntCd());
            criteria.setLgcyWhCd(ttPltzDomain.getLgcyWhCd());
            criteria.setPkgFormTyp(ttPltzDomain.getPkgFormTyp());
            criteria.setOriginalOuterPkgCd(ttPltzDomain.getOuterPkgCd());
            criteria.setReviseFlg(criteria.getReviseFlg());
            criteria.setPackagingConfirmedFlg(FLAG_Y);
            criteria.setVolume(dispVolume);
            criteria.setVolumeUnit(volumeUnitDomain.getUnitDisp());
            criteria.setNetWeight(ttPltzDomain.getNetWeight());
            criteria.setWeightUnit(wightUnitDomain.getUnitDisp());
            criteria.setGrossWeight(dispGrossWeight);
            criteria.setComUpdateTimestamp(ttPltzDomain.getComUpdateTimestamp());
            // UT110 TRIAL SHIPMENT/号試品対応 ADD START
            criteria.setLength(dispLength);
            criteria.setWidth(dispWidth);
            criteria.setHeight(dispHeight);
            criteria.setLengthUnit(lengthUnitDomain.getUnitDisp());
            // Setting of manualRegFlg is unnecessary.
            // Because it has already screen information stack when W2009->W2019 transition.
            // 既にW2009→W2019遷移時の画面情報スタックで持ち回っているためmanualRegFlgの設定は不要。
            //if (PKG_FORM_TYP_MANUAL_REG.equals(ttPltzDomain.getPkgFormTyp())) {
            //    criteria.setManualRegFlg(FLAG_Y);
            //} else {
            //    criteria.setManualRegFlg(FLAG_N);
            //}
            // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        }

        // A link Palletize Item is acquired to MAIN MARK.
        // メインマークに紐づくパレタイズ対象品を取得する。
        W2009CmlCriteriaDomain criteriaForPltzItem = new W2009CmlCriteriaDomain();
        criteriaForPltzItem.setMainMark(mainMark);
        List<? extends W2009CmlItemDomain> ttPltzItemNoList = w2009CmlDao.searchTtPltzInstrItemNoTransPkg(criteriaForPltzItem);
        if (ttPltzItemNoList == null || ttPltzItemNoList.isEmpty()) {
            return list;
        }
        
        return ttPltzItemNoList;
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchForPagingOnTransReviseRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnTransReviseRegister(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {

        List<W2009CmlItemDomain> list = new ArrayList<W2009CmlItemDomain>();

        // In the case of the changes from a CML Main Screen
        // CML Main Screen画面からの遷移の場合
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMark(criteria.getMainMark());
        TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(ttPltzCriteriaDomain);
        if (ttPltzDomain == null) {
            return list;
        }
        
        // QUANTITY-UNIT master acquisition
        // 数量単位原単位取得
        // VolumeUnit
        TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getVolumeUnit());
        TmMeasureUnitDomain volumeUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (volumeUnitDomain == null) {
            return list;
        }
        // WeightUnit
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getWeightUnit());
        TmMeasureUnitDomain wightUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (wightUnitDomain == null) {
            return list;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        // LengthUnit
        tmMeasureUnitCriteriaDomain.setUnitCd(ttPltzDomain.getLengthUnit());
        TmMeasureUnitDomain lengthUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (lengthUnitDomain == null) {
            return list;
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        // A setting of the VALUE of search-condition area
        // 検索条件エリアの値の設定
        criteria.setShipperCd(ttPltzDomain.getShipperCd());
        criteria.setCustomerCd(ttPltzDomain.getCustomerCd());
        criteria.setLgcyShipTo(ttPltzDomain.getLgcyShipTo());
        criteria.setTrnsCd(ttPltzDomain.getTrnsCd());
        criteria.setPlntCd(ttPltzDomain.getPlntCd());
        criteria.setLgcyWhCd(ttPltzDomain.getLgcyWhCd());
        criteria.setPkgFormTyp(ttPltzDomain.getPkgFormTyp());
        criteria.setOriginalOuterPkgCd(ttPltzDomain.getOuterPkgCd());
        criteria.setOuterPkgCd("");
        criteria.setReviseFlg(ttPltzDomain.getReviseFlg());
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setVolume(ttPltzDomain.getVolume());
        criteria.setVolumeUnit(volumeUnitDomain.getUnitDisp());
        criteria.setNetWeight(ttPltzDomain.getNetWeight());
        criteria.setWeightUnit(wightUnitDomain.getUnitDisp());
        criteria.setGrossWeight(ttPltzDomain.getGrossWeight());
        criteria.setComUpdateTimestamp(ttPltzDomain.getComUpdateTimestamp());
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        criteria.setLength(ttPltzDomain.getLength());
        criteria.setWidth(ttPltzDomain.getWidth());
        criteria.setHeight(ttPltzDomain.getHeight());
        criteria.setLengthUnit(lengthUnitDomain.getUnitDisp());
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        criteria.setPalletCartonTyp(ttPltzDomain.getPalletCartonTyp()); // UT420 ADD

        // A Palletize Item and a Palletize Instruction Item No are searched to a MIX tag unit and a unit of ITEM NO.
        // MIXタグ単位、品番単位にパレタイズ対象品、梱包指示品番を検索する
        List<? extends W2009CmlItemDomain> ttPltzItemNoList = w2009CmlDao.searchTtPltzInstrItemNoTransPkg(criteria);
        if (ttPltzItemNoList == null || ttPltzItemNoList.isEmpty()) {
            return list;
        }

        // detailed portion is refilled in list.
        // 明細部分をlistに詰めなおす
        for (W2009CmlItemDomain obj : ttPltzItemNoList) {
            W2009CmlItemDomain result = new W2009CmlItemDomain();
            CommonUtil.copyPropertiesDomainToDomain(result, obj);
            list.add(result);                
        }
        
        return list;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.lang.String)
     */
    public W2009CmlDomain searchOnDetailInit(
        W2009CmlCriteriaDomain criteria, String originalScreenId) throws ApplicationException {
        
        W2009CmlDomain dispDomain = new W2009CmlDomain();
        
        String functionMode = criteria.getFunctionMode();

        if (SCREEN_ID_W2019.equals(originalScreenId)) {
            // When changing from a CML Trans/PKG Revise screen
            // CML Trans / PKG Revise画面から遷移する場合
            TtPltzCriteriaDomain pkCriteria = new TtPltzCriteriaDomain();
            pkCriteria.setMainMark(criteria.getMainMark());
            TtPltzDomain ttPltz = ttPltzService.searchByKey(pkCriteria);
            
            CommonUtil.copyPropertiesDomainToDomain(dispDomain, ttPltz);
            
            // UT110 TRIAL SHIPMENT/号試品対応 ADD if
            // If not manual registration.
            // マニュアル登録の場合を除く。
            if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                // 0 affair, the maximum number check
                // 0件、上限件数チェック
                w2009CmlDao.searchCountTwPltzItemPkg(criteria);
            }

            // data acquisition
            // データ取得
            List<? extends W2009CmlItemDomain> initList = w2009CmlDao.searchForPagingTwPltzItemPkg(criteria);
            dispDomain.setCmlItemDomainList(initList);

        } else {
            if (W2009_CML_MODE_EDIT.equals(functionMode)) {
                // changes origin is a case from a CML Register screen.
                // changes from a CML Register screen   and --   Case of register mode
                // This is 取得す about data from Palletize-Item work table.
             // 遷移元が CML Register画面からの場合
                // CML Register画面からの遷移　かつ　登録モードの場合
                // パレタイズ対象品ワークテーブルよりデータを取得す
                
                // UT110 TRIAL SHIPMENT/号試品対応 ADD if
                // If not manual registration.
                // マニュアル登録の場合を除く。
                if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                    // 0 affair, the maximum number check
                    // 0件、上限件数チェック
                    w2009CmlDao.searchCountTwPltzItemPkg(criteria);
                }
                
                // data acquisition
                // データ取得
                List<? extends W2009CmlItemDomain> initList = w2009CmlDao.searchForPagingTwPltzItemPkg(criteria);
                dispDomain.setCmlItemDomainList(initList);

                
            } else if (W2009_CML_MODE_REF.equals(functionMode)) {
                // changes from a CML Register screen   and --   Case of reference mode
                // CML Register画面からの遷移　かつ　参照モードの場合
                
                // 0 affair, the maximum number check
                // 0件、上限件数チェック
                w2009CmlDao.searchCountTtPltz(criteria);
                
                // data acquisition
                // データ取得
                dispDomain = w2009CmlDao.searchForPagingTtPltz(criteria);

            }
        }
        
        return dispDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchOnRegisterInitByFromCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        // Initial-display-information acquisition in the case of having changed from a CML Register screen CML Create screen (for registration)
        // (also in the changes from a CML Pkg Info Detail screen, it contains)
        // CML Register画面 CML Create画面から遷移してきた場合の初期表示情報取得(登録用)
        // (CML Pkg Info Detail画面からの遷移の場合も含む)

        // 5.1.Acquisition of WEIGHT, a Unit of Vol., a WEIGHT, and the VOLUME notation
        // 5.1.重量、容積単位、重量・容積表記の取得
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain = commonService.searchMeasureUnit(criteria.getShipperCd());

        // WEIGHT UNIT for a display
        // 表示用重量単位
        String dispWeightUnit = vtCompMeasureUnitDomain.getWeightUnit(); // UT110 TRIAL SHIPMENT/号試品対応 MOD
        BigDecimal dispNetWeight = BigDecimal.ZERO;
        BigDecimal dispGrossWeight = null;
        
        // Unit of Vol. for a display
        // 表示用容積単位
        String dispVolumeUnit = vtCompMeasureUnitDomain.getVolumeUnit(); // UT110 TRIAL SHIPMENT/号試品対応 MOD
        BigDecimal dispVolume = null;
        
        // Overflow flag
        // 桁あふれフラグ
        boolean volumeOverflow = false;
        boolean netWeightOverflow = false;
        boolean grossWeightOverflow = false;
        
        // 5.2.The information for registration is acquired from Palletize-Item work table.
        // 5.2.パレタイズ対象品ワークテーブルから登録用の情報を取得する。
        List<? extends W2009CmlItemDomain> pltzItemList = w2009CmlDao.searchTwPltzItemItemNo(criteria);

        // 5.3.A setting of VOLUME
        // 5.3.容積の設定
        if (!FLAG_Y.equals(criteria.getManualRegFlg())) { // UT110 TRIAL SHIPMENT/号試品対応 ADD
            if (!CheckUtil.isBlankOrNull(criteria.getOuterPkgCd())) {
                // When the exterior sign is set up on screen
                //   - 5.3.1.2.It acquires from exterior sign.
                // 画面上で外装記号が設定されている場合
                //   - 5.3.1.2.外装記号から取得
                TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteriaDomain = new TmPkgSetHdrCriteriaDomain();
                tmPkgSetHdrCriteriaDomain.setOwnerComp(criteria.getShipperCd());
                tmPkgSetHdrCriteriaDomain.setOuterPkgCd(criteria.getOuterPkgCd());
                TmPkgSetHdrDomain tmPkgSetHdrDomain = tmPkgSetHdrService
                    .searchByKey(tmPkgSetHdrCriteriaDomain);

                String tmPkgSetHdrVolumeUnit = tmPkgSetHdrDomain.getVolumeUnit();
                BigDecimal tmPkgSetHdrVolume = tmPkgSetHdrDomain.getVolume();

                // 5.3.1.2.3.A converted of unit
                // 5.3.1.2.3.単位の変換
                try {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
                    dispVolume = convertVolumeUnit(tmPkgSetHdrVolume, tmPkgSetHdrVolumeUnit, dispVolumeUnit, params);
                } catch (GscmApplicationException e) {
                    if (NXS_E7_0157.equals(e.getCode())) {
                        volumeOverflow = true;
                    } else {
                        throw e;
                    }
                }

            } else{
                // Judgment whether it acquires from ITEM NO
                // 品目番号から取得するか否かの判断
                int size = pltzItemList.size();
                boolean hasWarningFlgAllN = true;
                String pkgFormTyp = null;
                
                for (int i = 0; i < size; i++ ) {
                    W2009CmlItemDomain domain = pltzItemList.get(i);
                    if (pkgFormTyp == null) {
                        pkgFormTyp = domain.getPkgFormTyp();
                    }
                    if (FLAG_Y.equals(domain.getWarningFlg())) {
                        hasWarningFlgAllN = false;
                        break;
                    }
                }
               
                if (PKG_FORM_TYP_SINGLE.equals(pkgFormTyp) && !hasWarningFlgAllN ) {
                    
                    // 5.3.1.3.When acquiring from ITEM NO
                    // 5.3.1.3.品目番号から取得する場合
                    
                    // In the case of pkgFormType = S
                    // Since all of pltzItemNo and pkgCd are the same (finishing of a check in Update of a Create screen),
                    // A VOLUME and a Unit of Vol. are acquired by pltzItemNo of head line, and pkgCd.
                    // pkgFormType = S の場合
                    // pltzItemNo、pkgCd は、全て同じ(Create画面のUpdateでチェック済)為、
                    // 先頭行のpltzItemNo、pkgCdで容積、容積単位を取得する。
                    String pkgCd = pltzItemList.get(0).getPkgCd();
                    String pltzItemNo = pltzItemList.get(0).getPltzItemNo();
                    
                    W2009CmlCriteriaDomain cmlCriteria = new W2009CmlCriteriaDomain();
                    cmlCriteria.setShipperCd(criteria.getShipperCd());
                    cmlCriteria.setPltzItemNo(pltzItemNo);
                    cmlCriteria.setPkgCd(pkgCd);
                    cmlCriteria.setTrnsCd(criteria.getTrnsCd());
                    List<? extends W2009CmlDomain> tmPkgSpecificationDtlList = w2009CmlDao.searchTmPkgSpecificationDtl(cmlCriteria);
                    if ( tmPkgSpecificationDtlList != null &&  tmPkgSpecificationDtlList.size() > 0) {                
                        W2009CmlDomain tmPkgSpecificationDomain = tmPkgSpecificationDtlList.get(0);

                        String tmPkgSetHdrVolumeUnit = tmPkgSpecificationDomain.getVolumeUnit();
                        BigDecimal tmPkgSetHdrVolume = tmPkgSpecificationDomain.getVolume();

                        // 5.3.1.3.3.A converted of unit
                        // 5.3.1.3.3.単位の変換
                        try {
                            Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
                            dispVolume = convertVolumeUnit(tmPkgSetHdrVolume, tmPkgSetHdrVolumeUnit, dispVolumeUnit, params);
                        } catch (GscmApplicationException e) {
                            if (NXS_E7_0157.equals(e.getCode())) {
                                volumeOverflow = true;
                            } else {
                                throw e;
                            }
                        }
                    }
                }
            }

        }

        // 5.4.A setting of N/W
        // 5.4.N/Wの設定
        for (W2009CmlDomain netWeightDomain : w2009CmlDao.searchTwPltzItemItemNoByDscId(criteria)) {
            String weightUnit = netWeightDomain.getWeightUnit();
            BigDecimal netWeight = netWeightDomain.getNetWeight();
            Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
            
            // 5.4.3Converted of unit (unit converted)
            // 5.4.3単位の変換 (単位変換)
            try {
                netWeight = convertWeightUnit(netWeight, weightUnit, dispWeightUnit, params);
            } catch (GscmApplicationException e) {
                if (NXS_E7_0157.equals(e.getCode())) {
                    netWeightOverflow = true;
                } else {
                    throw e;
                }
            }

            // 5.4.3Converted of unit (total)
            // 5.4.3単位の変換 (合算)
            dispNetWeight = dispNetWeight.add(netWeight);
            if (commonService.isWeightOverflow(dispNetWeight)) {
                netWeightOverflow = true;
            }
        }
        
        // 5.5.A setting of G/W
        // 5.5.G/Wの設定
        if (!FLAG_Y.equals(criteria.getManualRegFlg())) { // UT110 TRIAL SHIPMENT/号試品対応 ADD
            if (FLAG_Y.equals(criteria.getPackagingConfirmedFlg())) {
                dispGrossWeight = BigDecimal.ZERO;
                dispGrossWeight = dispGrossWeight.add(dispNetWeight);
                for (W2009CmlDomain netWeightDomain : w2009CmlDao.searchTwPltzItemPkgByDscId(criteria)) {
                    String weightUnit = netWeightDomain.getWeightUnit();
                    BigDecimal netWeight = netWeightDomain.getNetWeight();
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };

                    // 5.5.3.A converted of unit
                    // 5.5.3.単位の変換
                    try {
                        netWeight = convertWeightUnit(netWeight, weightUnit, dispWeightUnit, params);
                    } catch (GscmApplicationException e) {
                        if (NXS_E7_0157.equals(e.getCode())) {
                            grossWeightOverflow = true;
                        } else {
                            throw e;
                        }
                    }

                    
                    // 5.5.3Converted of unit (total)
                    // 5.5.3単位の変換 (合算)
                    dispGrossWeight = dispGrossWeight.add(netWeight);
                    if (commonService.isWeightOverflow(dispGrossWeight)) {
                        grossWeightOverflow = true;
                    }
                }
            }
        }
        
        // Setting of a returned value
        // The VALUE 1 affair displayed is set up.
        // 返却値の設定
        // 1件目に表示する値を設定する。
        W2009CmlDomain cmlDomain = new W2009CmlDomain();
        CommonUtil.copyPropertiesDomainToDomain(cmlDomain, criteria);
        cmlDomain.setContainerSortingKey(pltzItemList.get(0).getContainerSortingKey());
        cmlDomain.setLoadingCd(pltzItemList.get(0).getLoadingCd());
        cmlDomain.setPkgFormTyp(pltzItemList.get(0).getPkgFormTyp());
        cmlDomain.setInvoiceKey(pltzItemList.get(0).getInvoiceKey());
        cmlDomain.setStgInstrItemFlg(pltzItemList.get(0).getStgInstrItemFlg());
        cmlDomain.setCustomTimingTyp(pltzItemList.get(0).getCustomTimingTyp());
        cmlDomain.setRtUseFlg("");
        cmlDomain.setPalletNo("");
        cmlDomain.setMainMark("");
        if (!netWeightOverflow) {
            cmlDomain.setNetWeight(dispNetWeight);
        } else {
            cmlDomain.setNetWeight(null);
        }
        if (!FLAG_Y.equals(criteria.getManualRegFlg())) { // UT110 TRIAL SHIPMENT/号試品対応 ADD
            if (!volumeOverflow) {
                cmlDomain.setVolume(dispVolume);
            } else {
                cmlDomain.setVolume(null);
            }
            if (dispGrossWeight != null && !grossWeightOverflow) {
                cmlDomain.setGrossWeight(dispGrossWeight);
            } else {
                cmlDomain.setGrossWeight(null);
            }
        }
        cmlDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnitDisp()); // UT110 TRIAL SHIPMENT/号試品対応 MOD
        cmlDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnitDisp()); // UT110 TRIAL SHIPMENT/号試品対応 MOD
        cmlDomain.setLengthUnit(vtCompMeasureUnitDomain.getLengthUnitDisp()); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        cmlDomain.setCmlItemDomainList(pltzItemList);
        cmlDomain.setVolumeOverflow(volumeOverflow);
        cmlDomain.setNetWeightOverflow(netWeightOverflow);
        cmlDomain.setGrossWeightOverflow(grossWeightOverflow);

        return cmlDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchOnRegisterInitByFromMain(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        W2009CmlDomain w2009CmlDomain = w2009CmlDao.searchTtPltzByMainMarkMixTagNo(criteria);

        if (w2009CmlDomain != null) {
            w2009CmlDomain.setMainMark(criteria.getMainMark());
            w2009CmlDomain.setPackagingConfirmedFlg(criteria.getPackagingConfirmedFlg());
            // UT110 TRIAL SHIPMENT/号試品対応 ADD START
            // Common processing of the return from the W2013.
            // W2013からの戻りとの共通処理。
            if (PKG_FORM_TYP_MANUAL_REG.equals(w2009CmlDomain.getPkgFormTyp())) {
                w2009CmlDomain.setManualRegFlg(FLAG_Y);
            } else {
                w2009CmlDomain.setManualRegFlg(FLAG_N);
            }
            // UT110 TRIAL SHIPMENT/号試品対応 ADD END
            List<? extends W2009CmlItemDomain> list = w2009CmlDomain.getCmlItemDomainList();
            if (list.size() > 0) {
                for (W2009CmlItemDomain domain : list) {
                    if (domain.getAuthFlg() == null || AUTH_EMPTY_NUMERIC.equals(domain.getAuthFlg())) {
                        // In Browse All or Register All, it overwrites.
                        // Browse All または、 Register All の場合上書き
                        domain.setAuthFlg(criteria.getBaseAuthFlg());
                    }
                }
            }
        }
        return w2009CmlDomain;
    }

    // --------------------------------- Update system method update ---------------------------------
    // --------------------------------- 更新系メソッド update ---------------------------------

    // --------------------------------- Delete system method delete ---------------------------------
    // --------------------------------- 削除系メソッド delete ---------------------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#deleteOnInit(java.lang.String)
     */
    public void deleteOnInit(String dscId) throws ApplicationException {
        TwPltzItemPkgCriteriaDomain criteria = new TwPltzItemPkgCriteriaDomain();
        criteria.setDscId(dscId);
       
        // It will delete, if this is not 0 affair.
        // 0件でなければ、削除する
        criteria.setSearchCountCheckFlg(false);
        if (twPltzItemPkgService.searchCount(criteria) != 0) {
            twPltzItemPkgService.deleteByCondition(criteria);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#deleteOnHeaderInit(java.lang.String)
     */
    public void deleteOnHeaderInit(String dscId) throws ApplicationException {
        TwPltzItemItemNoCriteriaDomain criteria = new TwPltzItemItemNoCriteriaDomain();
        criteria.setDscId(dscId);
        
        // It will delete, if this is not 0 affair.
        // 0件でなければ、削除する
        criteria.setSearchCountCheckFlg(false);
        if (twPltzItemItemNoService.searchCount(criteria) != 0) {
            twPltzItemItemNoService.deleteByCondition(criteria);
        }
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#deleteOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public void deleteOnRegisterDelete(
        W2009CmlCriteriaDomain criteria, List<? extends W2009CmlItemDomain> w2012List) throws ApplicationException {

        for (int i = 0; i < w2012List.size(); i++) {
            W2009CmlItemDomain domain = w2012List.get(i);
            if (CHECK_ON.equals(domain.getSelected())) {
                if (FLAG_Y.equals(domain.getMixTagFlg())) {
                    // When Mix Tag Flg is "Y"
                    // Mix Tag Flg が "Y" の場合
                    TwPltzItemItemNoCriteriaDomain delCriteria = new TwPltzItemItemNoCriteriaDomain();
                    delCriteria.setDscId(criteria.getLoginUserDscId());
                    delCriteria.setMixTagNo(domain.getPltzItemNo());
                    delCriteria.setMixTagFlg(FLAG_Y);
                    twPltzItemItemNoService.deleteByCondition(delCriteria);
                } else {
                    // When Mix Tag Flg is "N"
                    // Mix Tag Flg が "N" の場合
                    TwPltzItemItemNoCriteriaDomain delCriteria = new TwPltzItemItemNoCriteriaDomain();
                    delCriteria.setDscId(criteria.getLoginUserDscId());
                    delCriteria.setPltzItemNo(domain.getPltzItemNo());
                    delCriteria.setPkgCd(domain.getPkgCd());
                    delCriteria.setMixTagFlg(FLAG_N);
                    twPltzItemItemNoService.deleteByCondition(delCriteria);
                }
            }
        }
    }

    // --------------------------------- Transaction system method transact ---------------------------------
    // --------------------------------- トランザクション系メソッド transact --------------------------------- 
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnCreateUpdate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain,
     *      java.util.List)
     */
    public void transactOnCreateUpdate(W2009CmlCriteriaDomain criteria,
        List<W2009CmlItemDomain> w2011DispList) throws ApplicationException {

        // The greatest BRANCH acquisition
        // 最大の枝番取得
        BigDecimal brch = w2009CmlDao.searchTwPltzItemItemNoByBrch(criteria);

        if (brch == null) {
            brch = new BigDecimal(0);
        }

        // the selected registration and update of data
        // list of informations to register
        // 選択したデータの登録・更新
        // 登録する情報のリスト
        List<TwPltzItemItemNoDomain> createList = new ArrayList<TwPltzItemItemNoDomain>();
        // list of informations to update
        // 更新する情報のリスト
        List<TwPltzItemItemNoDomain> updateList = new ArrayList<TwPltzItemItemNoDomain>();
        List<TwPltzItemItemNoCriteriaDomain> updateConditionList = new ArrayList<TwPltzItemItemNoCriteriaDomain>();
        for (int i = 0; i < w2011DispList.size(); i++ ) {
            W2009CmlItemDomain domain = w2011DispList.get(i);
            String mixTagFlg = domain.getMixTagFlg();
            String disableFlg = domain.getDisableFlg();

            if (!CHECK_ON.equals(domain.getSelected())) {
                continue;
            }

            if (FLAG_N.equals(mixTagFlg) && FLAG_N.equals(disableFlg)) {

                brch = brch.add(new BigDecimal(1));

                domain.setDisableFlg(FLAG_Y);

                // ITEM-NO registration processing
                // 品目番号登録処理
                TwPltzItemItemNoDomain createDomain = new TwPltzItemItemNoDomain();
                commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W2011);
                
                createDomain.setDscId(criteria.getLoginUserDscId());
                createDomain.setBrch(brch);
                createDomain.setPltzItemNo(domain.getPltzItemNo());
                createDomain.setPkgCd(domain.getPkgCd());
                createDomain.setItemDescription(domain.getItemDescription());
                createDomain.setQty(domain.getQty());
                createDomain.setInstrQty(domain.getInstrQty());
                createDomain.setShippingLot(domain.getShippingLot());
                createDomain.setTagQty(domain.getTagQty());
                if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                    createDomain.setPkgFormTyp(domain.getPkgFormTyp());
                // UT110 TRIAL SHIPMENT/号試品対応 ADD
                } else {
                    createDomain.setPkgFormTyp(PKG_FORM_TYP_MANUAL_REG);
                }
                createDomain.setMixTagNo("");
                createDomain.setMixTagFlg(FLAG_N);
                BigDecimal netWeight = domain.getItemWeight().multiply(domain.getQty());
                if (commonService.isWeightOverflow(netWeight)) {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                createDomain.setNetWeight(netWeight);
                createDomain.setItemWeight(domain.getItemWeight());
                createDomain.setWeightUnit(domain.getWeightUnit());
                createDomain.setExpLimitTyp(domain.getExpLimitTyp());
                createDomain.setDngrItemFlg(domain.getDngrItemFlg());
                createDomain.setOriginCntryCd(domain.getOriginCntryCd());
                createDomain.setQtyUnit(domain.getQtyUnit());
                createDomain.setItemTyp("");
                createDomain.setCurrCd(domain.getCurrCd());
                createDomain.setPlntCd(domain.getPlntCd());
                createDomain.setContainerSortingKey(domain.getContainerSortingKey());
                createDomain.setLoadingCd(domain.getLoadingCd());
                createDomain.setInvoiceKey(domain.getInvoiceKey());
                createDomain.setContainerLooseTyp(domain.getContainerLooseTyp());
                createDomain.setStgInstrItemFlg(domain.getStgInstrItemFlg());
                createDomain.setCustomTimingTyp(domain.getCustomTimingTyp());

                createList.add(createDomain);

            } else if (FLAG_N.equals(mixTagFlg) && FLAG_Y.equals(disableFlg)) {
                // ITEM-NO update process
                // Update item setting
                // 品目番号更新処理
                // 更新項目設定
                TwPltzItemItemNoDomain updateDomain = new TwPltzItemItemNoDomain();
                commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2011);
                updateDomain.setQty(domain.getQty());
                updateDomain.setTagQty(domain.getTagQty());
                BigDecimal netWeight = domain.getItemWeight().multiply(domain.getQty());
                if (commonService.isWeightOverflow(netWeight)) {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                updateDomain.setNetWeight(netWeight);
                
                // Update conditioning
                // 更新条件設定
                TwPltzItemItemNoCriteriaDomain updateCriteria = new TwPltzItemItemNoCriteriaDomain();
                updateCriteria.setDscId(domain.getLoginUserDscId());
                updateCriteria.setPltzItemNo(domain.getPltzItemNo());
                updateCriteria.setPkgCd(domain.getPkgCd());
                updateCriteria.setMixTagFlg(FLAG_N);

                updateList.add(updateDomain);
                updateConditionList.add(updateCriteria);

            } else if (FLAG_Y.equals(mixTagFlg) && FLAG_N.equals(disableFlg)) {

                // MIX tag registration processing
                // MIXタグ登録処理
                domain.setDisableFlg(FLAG_Y);
                W2009CmlCriteriaDomain mixtagItemCriteria = new W2009CmlCriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(mixtagItemCriteria, criteria);
                mixtagItemCriteria.setMixTagNo(domain.getMixTagNo());
                List<? extends W2009CmlItemDomain> cmlItemList = w2009CmlDao.searchTtMixtagItemNo(mixtagItemCriteria);
                if (cmlItemList.isEmpty()) {
                    throw new GscmApplicationException(GSCM_E0_0010);
                }
                for (int j = 0; j < cmlItemList.size(); j++ ) {

                    W2009CmlItemDomain mixTagItemInfo = cmlItemList.get(j);

                    brch = brch.add(new BigDecimal(1));

                    TwPltzItemItemNoDomain createDomain = new TwPltzItemItemNoDomain();
                    commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W2011);
                    createDomain.setDscId(criteria.getLoginUserDscId());
                    createDomain.setBrch(brch);
                    createDomain.setPltzItemNo(mixTagItemInfo.getItemNo());
                    createDomain.setPkgCd(mixTagItemInfo.getPkgCd());
                    createDomain.setItemDescription(mixTagItemInfo.getItemDescription());
                    createDomain.setQty(mixTagItemInfo.getQty());
                    createDomain.setInstrQty(null);
                    createDomain.setShippingLot(mixTagItemInfo.getShippingLot());
                    createDomain.setTagQty(null);
                    createDomain.setPkgFormTyp(PKG_FORM_TYP_MULTI);
                    createDomain.setMixTagNo(mixTagItemInfo.getMixTagNo());
                    createDomain.setMixTagFlg(FLAG_Y);
                    BigDecimal netWeight = mixTagItemInfo.getItemWeight().multiply(mixTagItemInfo.getQty());
                    if (commonService.isWeightOverflow(netWeight)) {
                        Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    createDomain.setNetWeight(netWeight);
                    createDomain.setItemWeight(mixTagItemInfo.getItemWeight());
                    createDomain.setWeightUnit(mixTagItemInfo.getWeightUnit());
                    createDomain.setExpLimitTyp(mixTagItemInfo.getExpLimitTyp());
                    createDomain.setDngrItemFlg(mixTagItemInfo.getDngrItemFlg());
                    createDomain.setOriginCntryCd(mixTagItemInfo.getOriginCntryCd());
                    createDomain.setQtyUnit(mixTagItemInfo.getQtyUnit());
                    createDomain.setItemTyp("");
                    createDomain.setCurrCd(domain.getCurrCd());
                    createDomain.setPlntCd(mixTagItemInfo.getPlntCd());
                    createDomain.setContainerSortingKey(domain.getContainerSortingKey());
                    createDomain.setLoadingCd(domain.getLoadingCd());
                    createDomain.setInvoiceKey(domain.getInvoiceKey());
                    createDomain.setContainerLooseTyp(domain.getContainerLooseTyp());
                    createDomain.setStgInstrItemFlg(FLAG_N);
                    createDomain.setCustomTimingTyp(domain.getCustomTimingTyp());

                    createList.add(createDomain);
                }
            } else if (FLAG_Y.equals(mixTagFlg) && FLAG_Y.equals(disableFlg)) {
                // No Action
                // 処理なし
            }
        }
        
        // Registration
        // 登録
        if (createList.size() > 0) {
            twPltzItemItemNoService.create(createList);
        }
        // Update
        // 更新
        if (updateList.size() > 0) {
            twPltzItemItemNoService.updateByCondition(
                updateList, updateConditionList);
        }
    }

    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnDetailDelete(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public void transactOnDetailDelete(W2009CmlCriteriaDomain criteria, List<String> brchList)
        throws ApplicationException {
        
        TwPltzItemPkgCriteriaDomain tpcriteria = new TwPltzItemPkgCriteriaDomain();
        // Setting of DSC-ID
        // DSC_IDの設定
        tpcriteria.setDscId(criteria.getLoginUserDscId());
        
        if (!brchList.isEmpty()) {
            for (String brch : brchList) {
                // Setting of Brch
                // Brchの設定
                tpcriteria.setBrch(new BigDecimal(brch));
                
                // The hard delete of Palletize Item Package Work
                // パレタイズ対象品PKGワークの物理削除
                twPltzItemPkgService.deleteByCondition(tpcriteria);
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnDetailSaveMoveTo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public void transactOnDetailSaveMoveTo(
        W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> w2009CmlItemDomainList) throws ApplicationException {
        
        List<TwPltzItemPkgDomain> registList = new ArrayList<TwPltzItemPkgDomain>();
        
        // 2.3 A Palletize Item Package Work is deleted on condition of DSC-ID.
        // 2.3 DSC-IDを条件にパレタイズ対象品PKGワークを削除する。
        TwPltzItemPkgCriteriaDomain tpcriteria = new TwPltzItemPkgCriteriaDomain();
        // Setting of DSC-ID
        // DSC_IDの設定
        tpcriteria.setDscId(criteria.getLoginUserDscId());
        tpcriteria.setSearchCountCheckFlg(false);
        int count = twPltzItemPkgService.searchCount(tpcriteria);
        if (count > 0 ) {
            twPltzItemPkgService.deleteByCondition(tpcriteria);
        }
            
        // SEQUENCE-NO initialize
        // 連番初期化
        BigDecimal brch = new BigDecimal(1);
        
        // When the VALUE of Brch is set up :2.4.2 Registration of packing specification data
        // When the VALUE of Brch has not been set up :2.4.3 Registration of an additional Packing material
        // Brchの値が設定されている場合：2.4.2 包装仕様データの登録
        // Brchの値が未設定の場合：2.4.3 追加包装材の登録
        if (!w2009CmlItemDomainList.isEmpty()) {
            for (W2009CmlItemDomain w2009CmlItemDomain : w2009CmlItemDomainList) {
                TwPltzItemPkgDomain tpiDomain = new TwPltzItemPkgDomain();
                commonService.setCommonPropertyForRegist(tpiDomain, SCREEN_ID_W2013);
                tpiDomain.setDscId(tpiDomain.getComCreateUserId());

                if (CheckUtil.isBlankOrNull(w2009CmlItemDomain.getPkgItemNo())) {
                    continue;
                }
                
                if (w2009CmlItemDomain.getBrch() != null) {
                    // 2.4.2 Registration of packing specification data
                    // 2.4.2 包装仕様データの登録
                    
                    BigDecimal netWeight = w2009CmlItemDomain.getQty().multiply(w2009CmlItemDomain.getPkgWeight());
                    if (commonService.isWeightOverflow(netWeight)) {
                        Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    
                    tpiDomain.setBrch(brch);
                    tpiDomain.setPltzItemNo(w2009CmlItemDomain.getPkgItemNo());
                    tpiDomain.setItemDescription(w2009CmlItemDomain.getItemDescription());
                    tpiDomain.setModelCd(w2009CmlItemDomain.getModelCd());
                    tpiDomain.setQty(w2009CmlItemDomain.getQty());
                    tpiDomain.setPkgTyp(w2009CmlItemDomain.getPkgTypHidden());
                    tpiDomain.setRtFlg(w2009CmlItemDomain.getRtFlg());
                    tpiDomain.setNetWeight(netWeight);
                    tpiDomain.setPkgWeight(w2009CmlItemDomain.getPkgWeight());
                    tpiDomain.setWeightUnit(w2009CmlItemDomain.getWeightUnit());
                    tpiDomain.setOriginCntryCd(w2009CmlItemDomain.getOriginCntryCd());
                    tpiDomain.setCurrCd(w2009CmlItemDomain.getCurrCd());
                    tpiDomain.setMixTagNo(w2009CmlItemDomain.getMixTagNo());
                    // QA:No.467 Correspond
                    // QA:No.467 対応
                    tpiDomain.setInputMethTyp(w2009CmlItemDomain.getInputMethTyp());
                } else {
                    // 2.4.2 Registration of packing specification data
                    // 2.4.2 包装仕様データの登録
                    
                    // 2.2.5.1 A Packing material is acquired.
                    // 2.2.5.1 包装材を取得する
                    TmPkgMtrlCriteriaDomain tmPkgcriteria = new TmPkgMtrlCriteriaDomain();
                    tmPkgcriteria.setOwnerComp(criteria.getShipperCd());
                    tmPkgcriteria.setPkgItemNo(w2009CmlItemDomain.getPkgItemNo());
                    TmPkgMtrlDomain tpmDomain = tmPkgMtrlService.searchByKey(tmPkgcriteria);
                    
                    // Setting of a registration domain
                    // 登録ドメインの設定
                    
                    BigDecimal netWeight = w2009CmlItemDomain.getQty().multiply(tpmDomain.getPkgWeight());
                    if (commonService.isWeightOverflow(netWeight)) {
                        Object[] params = { commonService.getResource(criteria.getLocale(), "label.netWeight") };
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    
                    tpiDomain.setBrch(brch);
                    tpiDomain.setPltzItemNo(w2009CmlItemDomain.getPkgItemNo());
                    tpiDomain.setItemDescription(tpmDomain.getPkgMtrlNm());
                    tpiDomain.setModelCd(tpmDomain.getModelCd());
                    tpiDomain.setQty(w2009CmlItemDomain.getQty());
                    tpiDomain.setPkgTyp(w2009CmlItemDomain.getPkgTypHidden());
                    if (RT_TYP_1WAY.equals(tpmDomain.getRtTyp())) {
                        tpiDomain.setRtFlg(FLAG_N);
                    } else {
                        tpiDomain.setRtFlg(FLAG_Y);
                    }
                    tpiDomain.setNetWeight(netWeight);
                    tpiDomain.setPkgWeight(tpmDomain.getPkgWeight());
                    tpiDomain.setWeightUnit(tpmDomain.getWeightUnit());
                    tpiDomain.setOriginCntryCd(tpmDomain.getOriginCntryCd());
                    tpiDomain.setCurrCd(tpmDomain.getCurrCd());
                    tpiDomain.setMixTagNo("");
                    // QA:No.467 Correspond
                    // QA:No.467 対応
                    tpiDomain.setInputMethTyp(w2009CmlItemDomain.getInputMethTyp());
                }
                
                // A SEQUENCE NO is added.
                // 連番を加算
                brch = brch.add(new BigDecimal(1));
                
                // information to register is added to a list.
                // 登録する情報をリストに追加
                registList.add(tpiDomain);
            }
        }
        
        // Palletize-Item-Package-Work registration
        // パレタイズ対象品PKGワーク登録
        if (registList.size() > 0) {
            twPltzItemPkgService.create(registList);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List, java.util.List)
     */
    public void transactOnRegister(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> w2012List, List<MessageDomain> errorMessages)
        throws ApplicationException {
        // 3.Acquisition of work information
        // 3.1.Acquisition of Palletize Item Work
        // 3.ワーク情報の取得
        // 3.1.パレタイズ対象品ワークの取得
        TwPltzItemItemNoCriteriaDomain twPltzItemNoCriteria = new TwPltzItemItemNoCriteriaDomain();
        twPltzItemNoCriteria.setDscId(criteria.getLoginUserDscId());
        List<TwPltzItemItemNoDomain> twPltzItemNoList = twPltzItemItemNoService.searchByCondition(twPltzItemNoCriteria);

        // 3.2.Acquisition of Palletize Item Package Work
        // 3.2.パレタイズ対象品PKGワークの取得
        TwPltzItemPkgCriteriaDomain twPltzItemPkgCriteria = new TwPltzItemPkgCriteriaDomain();
        twPltzItemPkgCriteria.setDscId(criteria.getLoginUserDscId());
        List<TwPltzItemPkgDomain> twPltzItemPkgList = twPltzItemPkgService.searchByCondition(twPltzItemPkgCriteria);
        
        // 4.Acquisition of MainMark
        // 4.MainMarkの取得
        String mainMark = getMainMark(criteria.getShipperCd(), criteria.getPackingWhCd());
        criteria.setMainMark(mainMark);

        // 5.The update of firm-order-receipt mortgage processing, and an Export Receive Order, Palletize-Item-Receive-Order registration
        // 5.確定受注引き当て処理と輸出受注の更新、パレタイズ対象品受注情報登録
        List<TtPltzItemOdrDomain> pltzInstrItemListForCigma = updateTtExpRcvOdrOnRegister(criteria, twPltzItemNoList, mainMark, w2012List, errorMessages);
        if (errorMessages.size() > 0) {
            return ;
        }

        // 6.The update of Palletize-Instruction-Receive-Order alloc, and a Palletize Instruction Receive Order, Palletize-Item-Receive-Order registration
        // 6.梱包指示品目番号受注情報引当と梱包指示品目番号受注情報の更新、パレタイズ対象品受注情報登録
        updateTtPltzInstrOdrOnRegister(criteria, twPltzItemNoList, mainMark, w2012List, errorMessages);
        if (errorMessages.size() > 0) {
            return ;
        }
        
        // 7.Registration of Palletize-Item order number (copy registration of an order received of finishing [ tag / MIX / an alloc ])
        // 7.パレタイズ対象品受注番号の登録(MIXタグに引当済みの受注のコピー登録)
        registTtPltzItemOdrOnRegisterForMixTag(criteria, twPltzItemNoList, mainMark);
        
        // 8.Palletize data is registered.
        // 8.パレタイズデータを登録
        registTtPltzOnRegister(criteria, twPltzItemNoList, twPltzItemPkgList, mainMark);

        // 9.Registration of Palletize-Item data
        // 9.パレタイズ対象品データの登録
        registTtPltzItemOnRegister(criteria, twPltzItemNoList, twPltzItemPkgList, mainMark);

        // 10.Packaging Instruction (=Pull) update process
        // 10.梱包指示更新処理
        updateTtPltzInstrOnRegister(criteria, twPltzItemNoList);
        
        // 11.MIXED thing information update processing
        // 11.MIXED現品情報更新処理
        updateTtPltzInstrForMixTagOnRegister(twPltzItemNoList);
        
        // 12.Temp Stock is updated and registered.
        // 12.仮在庫を更新・登録する
        updateAndRegistTtTmpStockOnRegister(criteria, twPltzItemNoList);
        
        // 13. This is registration of a link KANBAN information to MIXTAG.
        // 13.MIXTAGに紐づくかんばん情報の登録
        registTtPltzKanbanForMixtagOnRegister(twPltzItemNoList, mainMark);

        // 14.A delete of work information
        // 14.ワーク情報の削除
        dleteWkTablesOnRegist(criteria.getLoginUserDscId());

        // 15.Registration of ordering mortgage track record
        // 15.受注引き当て実績の登録
        registRevOdeAllocOnRegister(criteria, pltzInstrItemListForCigma);

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public void transactOnRegisterCancel(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {

        // 3.Cancellation of ordering alloc
        // 3.受注引当のキャンセル
        List<? extends W2009CmlPltzItemOdrDomain> pltzItemOdrList = updateTtExpRcvOdrOnRegisterCancel(criteria);

        // 4.Palletize-Instruction-Item-No ordering alloc cancellation
        // 4.梱包指示品目番号受注引当キャンセル
        updateTtPltzInstrOdrOnRegisterCancel(criteria);

        // 5.Acquisition of Palletize Item
        // 5.パレタイズ対象品の取得
        TtPltzItemCriteriaDomain ttPltzItemCriteriaDomain = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteriaDomain.setMainMark(criteria.getMainMark());
        List<? extends W2009CmlItemDomain> pltzItemList = w2009CmlDao
            .searchTtPltzItemByMainMark(criteria);

        // 6.The update of PACKED QUANTITY
        // 6.梱包済数量の更新
        updateTtPltzInstrItemNoOnRegisterCancel(criteria, pltzItemList);

        // 7.The update of PALLETIZE INSTRUCTION STATUS
        // 7.梱包指示ステータスの更新
        updateTtPltzInstrOnRegisterCancel(criteria);

        // 8.The update of Multiple Item No. in 1Box PKG number Status
        // 8.小箱内多品番ステータスの更新
        updateTtMixtagrOnRegisterCancel(criteria, pltzItemList);

        // 9.The update of Temp Stock
        // 9.仮在庫の更新
        updateTtTmpStockOnRegisterCancel(criteria, pltzItemList);

        // 10.A delete of Palletize data
        // 10.パレタイズデータの削除
        deletePltzInfoOnRegisterCancel(criteria, pltzItemList);

        // 11.Registration of ordering alloc track record (starting of Web service)
        // 11.受注引当実績の登録(Webサービスの起動)
        cancelWsRcvOdrAllocOnRegisterCancel(criteria, pltzItemOdrList);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnRegisterPkgMaterials(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List, java.util.List)
     */
    public void transactOnRegisterPkgMaterials(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> w2012List, List<MessageDomain> errMessages)
        throws ApplicationException {
        
        // processing mode is registration (convert). And only when Packing Confirmed Flg is "N", it carries out.
        // 処理モードが登録(編集) かつ Packing Confirmed Flg が "N" の場合のみ実施
        if (W2009_CML_MODE_EDIT.equals(criteria.getFunctionMode()) && FLAG_N.equals(criteria.getPackagingConfirmedFlg())) {
            
            // The information on work table is deleted.
            // ワークテーブルの情報を削除
            TwPltzItemPkgCriteriaDomain delCriteria = new TwPltzItemPkgCriteriaDomain();
            delCriteria.setDscId(criteria.getLoginUserDscId());
            delCriteria.setSearchCountCheckFlg(false);
            int count = twPltzItemPkgService.searchCount(delCriteria);
            if (count > 0) {
                twPltzItemPkgService.deleteByCondition(delCriteria);
            }
            
            // List for registration
            // 登録用リスト
            List<TwPltzItemPkgDomain> twPltzItemPkgList = new ArrayList<TwPltzItemPkgDomain>();
            BigDecimal brch = new BigDecimal(1);
            
            // 3.1.Distribution of processing
            // 3.1.処理の振り分け
            boolean hasWarningY = false;
            for (int i = 0; i < w2012List.size(); i++) {
                if (FLAG_Y.equals(w2012List.get(i).getWarningFlg())) {
                    hasWarningY = true;
                    break;
                }
            }

            if (PKG_FORM_TYP_SINGLE.equals(criteria.getPkgFormTyp()) && !hasWarningY) {
                // When single-palletize lot crack has not occurred
                // When the data of PKG Form Type = "S" and hidden Warning Flg =" Y" does not exist
                // 3.2.Palletize Item Package Work is registered (registration by an ITEM NO).
                // 3.2.1.Acquisition of packing specification
                // 3.2.4.packing specification's existence check
                // 単品パレタイズロット割れが発生していない場合
                // PKG Form Type = "S" かつ hidden Warning Flg = "Y" のデータが存在しない場合
                // 3.2.パレタイズ対象品PKGワークの登録(品目番号による登録)を実施
                // 3.2.1.包装仕様の取得
                // 3.2.4.包装仕様の存在チェック
                List<? extends W2009CmlItemDomain> tmPkgSpecificationDtlList = w2009CmlDao.searchTmPkgSpecificationDtlByAuto(criteria);
                List<String> pltzItemNos = new ArrayList<String>();
                for (int x = 0; x < tmPkgSpecificationDtlList.size(); x++ ) {
                    String pltzItemNo = tmPkgSpecificationDtlList.get(x).getPltzItemNo();
                    if (!pltzItemNos.contains(pltzItemNo)) {
                        pltzItemNos.add(pltzItemNo);
                    }
                }
                for (int y = 0; y < w2012List.size(); y++ ) {
                    if (!pltzItemNos.contains(w2012List.get(y).getPltzItemNo())) {
                        // An error is made when the information on ITEM NO cannot be acquired (MSGID:NXS-E7-0126 argument: MixTagNo).
                        // pltzItemNo of error line is displayed in a red character.
                        // 品目番号の情報が取得できない場合は、エラー(MSGID:NXS-E7-0126 引数：MixTagNo)
                        // エラー行のpltzItemNoを赤文字で表示する。
                        String indexId = String.valueOf(y);
                        String errorParam = "listDomainList[" + indexId + "].pltzItemNo";
                        String[] msgParam = {w2012List.get(y).getPltzItemNo()};
                        errMessages.add(new MessageDomain(errorParam, "NXS-E7-0126", msgParam));
                    }
                }
                if (errMessages.size() != 0) {
                    return;
                }

                // 3.2.5.A calculation of Packing-material USE QUANTITY
                // 3.2.6.The total of Packing-material USE QUANTITY
                // 3.2.5.包装材使用数の算出
                // 3.2.6.包装材使用数の合算
                Map<String, W2009CmlItemDomain> distinctPkgSpecificationDtlMap = new LinkedHashMap<String, W2009CmlItemDomain>();
                for (int j = 0; j < tmPkgSpecificationDtlList.size(); j++ ) {
                    // Packing-material USE-QUANTITY = (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) * Joint packing specification .QTY
                    // * Below the decimal point of (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) is upvaluation.
                    // 包装材使用数 = (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE) * 結合包装仕様.QTY
                    // ※ (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE)の小数点以下は切り上げ
                    W2009CmlItemDomain domain = tmPkgSpecificationDtlList.get(j);
                    BigDecimal useQty = (domain.getQty().divide(domain.getLotSize(), 0, BigDecimal.ROUND_UP)).multiply(domain.getUseQty());

                    String pkgItemNo = domain.getPkgItemNo();
                    if (!distinctPkgSpecificationDtlMap.containsKey(pkgItemNo)) {
                        domain.setUseQty(useQty);
                        distinctPkgSpecificationDtlMap.put(pkgItemNo, domain);
                    } else {
                        W2009CmlItemDomain cmlItemDomain = distinctPkgSpecificationDtlMap.get(pkgItemNo);
                        cmlItemDomain.setUseQty(cmlItemDomain.getUseQty().add(useQty));
                    }
                }
                // 3.2.7.contents of registration are added to a list.
                // 3.2.7.登録内容をリストに追加
                Set<String> keySet = distinctPkgSpecificationDtlMap.keySet();
                Iterator<String> keyIte = keySet.iterator();
                while (keyIte.hasNext()) {
                    String mapKey = keyIte.next();
                    W2009CmlItemDomain cmlItemDom = (W2009CmlItemDomain) distinctPkgSpecificationDtlMap.get(mapKey);
                    TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                    commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                    regDomain.setDscId(criteria.getLoginUserDscId());
                    regDomain.setBrch(brch);
                    regDomain.setPltzItemNo(cmlItemDom.getPkgItemNo());
                    regDomain.setItemDescription(cmlItemDom.getPkgNm());
                    regDomain.setModelCd(cmlItemDom.getModelCd());
                    regDomain.setQty(cmlItemDom.getUseQty());
                    regDomain.setPkgTyp(cmlItemDom.getInnerOuterTyp());
                    if (RT_TYP_1WAY.equals(cmlItemDom.getRtTyp())) {
                        regDomain.setRtFlg(FLAG_N);
                    } else {
                        regDomain.setRtFlg(FLAG_Y);
                    }
                    regDomain.setNetWeight(null);
                    regDomain.setPkgWeight(cmlItemDom.getPkgWeight());
                    regDomain.setWeightUnit(cmlItemDom.getWeightUnit());
                    regDomain.setOriginCntryCd(cmlItemDom.getOriginCntryCd());
                    regDomain.setCurrCd(cmlItemDom.getCurrCd());
                    regDomain.setMixTagNo("");
                    regDomain.setInputMethTyp("1");
                    twPltzItemPkgList.add(regDomain);

                    // A SEQUENCE NO is added one time.
                    // 連番を1追加
                    brch = brch.add(new BigDecimal(1));
                }
            } else {
                // When that is not right
                // 3.3. Palletize Item Package Work is registered (registration with an ITEM NO and an exterior sign).
                // 3.3.1. This is registration of a link Packing material to ITEM NO.
                // 3.3.1.1.Acquisition of packing specification
                // 3.3.1.4. packing specification's existence check
                // そうでない場合   
                // 3.3.パレタイズ対象品PKGワークの登録(品目番号・外装記号による登録)を実施
                // 3.3.1.品目番号に紐づく包装材の登録
                // 3.3.1.1.包装仕様の取得
                // 3.3.1.4.包装仕様の存在チェック
                List<? extends W2009CmlItemDomain> tmPkgSpecificationDtlByInnerList = w2009CmlDao.searchTmPkgSpecificationDtlByInner(criteria);
                List<String> pltzItemNos = new ArrayList<String>();
                for (int x = 0; x < tmPkgSpecificationDtlByInnerList.size(); x++) {
                    String pltzItemNo = tmPkgSpecificationDtlByInnerList.get(x).getPltzItemNo();
                    if (!pltzItemNos.contains(pltzItemNo)) {
                        pltzItemNos.add(pltzItemNo);
                    }
                }
                
                Map<String, W2009CmlItemDomain> distinctPkgSpecificationDtlByInnerMap = new LinkedHashMap<String, W2009CmlItemDomain>();
                for (int k = 0; k < tmPkgSpecificationDtlByInnerList.size(); k++) {
                    // Packing-material USE-QUANTITY = (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) * Joint packing specification .QTY
                    // * Below the decimal point of (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) is upvaluation.
                    // 包装材使用数 = (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE) * 結合包装仕様.QTY
                    // ※ (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE)の小数点以下は切り上げ
                    W2009CmlItemDomain domain = tmPkgSpecificationDtlByInnerList.get(k);
                    BigDecimal useQty = (domain.getQty().divide(domain.getLotSize(), 0, BigDecimal.ROUND_UP)).multiply(domain.getUseQty());
                    
                    String pkgItemNo = domain.getPkgItemNo();
                    if (!distinctPkgSpecificationDtlByInnerMap.containsKey(pkgItemNo)) {
                        domain.setUseQty(useQty);
                        distinctPkgSpecificationDtlByInnerMap.put(pkgItemNo, domain);
                    } else {
                        W2009CmlItemDomain cmlItemDomain = distinctPkgSpecificationDtlByInnerMap.get(pkgItemNo);
                        cmlItemDomain.setUseQty(cmlItemDomain.getUseQty().add(useQty));
                    }
                }
                // 3.3.1.7.contents of registration are added to a list.
                // 3.3.1.7.登録内容をリストに追加
                Set <String>keySet = distinctPkgSpecificationDtlByInnerMap.keySet();  
                Iterator <String>keyIte = keySet.iterator();
                while(keyIte.hasNext()) {
                    String mapKey = keyIte.next();
                    W2009CmlItemDomain cmlItemDom = (W2009CmlItemDomain)distinctPkgSpecificationDtlByInnerMap.get(mapKey);  
                    TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                    commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                    regDomain.setDscId(criteria.getLoginUserDscId());
                    regDomain.setBrch(brch);
                    regDomain.setPltzItemNo(cmlItemDom.getPkgItemNo());
                    regDomain.setItemDescription(cmlItemDom.getPkgNm());
                    regDomain.setModelCd(cmlItemDom.getModelCd());
                    regDomain.setQty(cmlItemDom.getUseQty());
                    regDomain.setPkgTyp("1");
                    if (RT_TYP_1WAY.equals(cmlItemDom.getRtTyp())) {
                        regDomain.setRtFlg(FLAG_N);
                    } else {
                        regDomain.setRtFlg(FLAG_Y);
                    }
                    regDomain.setNetWeight(null);
                    regDomain.setPkgWeight(cmlItemDom.getPkgWeight());
                    regDomain.setWeightUnit(cmlItemDom.getWeightUnit());
                    regDomain.setOriginCntryCd(cmlItemDom.getOriginCntryCd());
                    regDomain.setCurrCd(cmlItemDom.getCurrCd());
                    regDomain.setMixTagNo("");
                    regDomain.setInputMethTyp("1");
                    twPltzItemPkgList.add(regDomain);
                    // A SEQUENCE NO is added one time.
                    // 連番を1追加
                    brch = brch.add(new BigDecimal(1));
                }

                // 3.3.2. This is registration of a link Packing material to MIX tag.
                // 3.3.2.1.Acquisition of information
                // 3.3.2.3.contents of registration are added to a list.
                // 3.3.2.MIXタグに紐づく包装材の登録
                // 3.3.2.1.情報の取得
                // 3.3.2.3.登録内容をリストに追加
                List<? extends W2009CmlItemDomain> ttMixtagRtList = w2009CmlDao.searchTtMixtagRt(criteria);
                for (int m = 0; m < ttMixtagRtList.size(); m++) {
                    W2009CmlItemDomain cmlItemDom = (W2009CmlItemDomain)ttMixtagRtList.get(m);  
                    TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                    commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                    regDomain.setDscId(criteria.getLoginUserDscId());
                    regDomain.setBrch(brch);
                    regDomain.setPltzItemNo(cmlItemDom.getPkgItemNo());
                    regDomain.setItemDescription(cmlItemDom.getPkgNm());
                    regDomain.setModelCd(cmlItemDom.getModelCd());
                    regDomain.setQty(cmlItemDom.getQty());
                    regDomain.setPkgTyp("1");
                    regDomain.setRtFlg(cmlItemDom.getRtFlg());
                    regDomain.setNetWeight(null);
                    regDomain.setPkgWeight(cmlItemDom.getPkgWeight());
                    regDomain.setWeightUnit(cmlItemDom.getWeightUnit());
                    regDomain.setOriginCntryCd(cmlItemDom.getOriginCntryCd());
                    regDomain.setCurrCd(cmlItemDom.getCurrCd());
                    regDomain.setMixTagNo(cmlItemDom.getMixTagNo());
                    regDomain.setInputMethTyp("1");
                    twPltzItemPkgList.add(regDomain);
                    // A SEQUENCE NO is added one time.
                    // 連番を1追加
                    brch = brch.add(new BigDecimal(1));
                }
                
                // 3.3.3. This is registration of a link Packing material to exterior sign.
                // 3.3.3.1.Acquisition of information
                // 3.3.3.2.The check of acquisition number
                // 3.3.3.外装記号に紐づく包装材の登録
                // 3.3.3.1.情報の取得
                // 3.3.3.2.取得件数のチェック
                criteria.setSearchCountCheckFlg(false);
                if (w2009CmlDao.searchCountTmPkgSetDtl(criteria) == 0) {
                    // In the case of 0 affair, an error is made (MSGID:NXS-E 7-0147).
                    // In error, the background color of Outer CD is displayed in red.
                    // 0件の場合は、エラー(MSGID:NXS-E7-0147)
                    // エラーの場合は、Outer CD の背景色を赤色で表示
                    errMessages.add(new MessageDomain("w2012CriteriaDomain.outerPkgCd", NXS_E7_0147, null));
                    return ;
                }
                List<? extends W2009CmlItemDomain> tmPkgSetDtlList = w2009CmlDao.searchTmPkgSetDtl(criteria);
                
                // 3.3.2.4.contents of registration are added to a list.
                // 3.3.2.4.登録内容をリストに追加
                for (int n = 0; n < tmPkgSetDtlList.size(); n++) {
                    W2009CmlItemDomain cmlItemDom = tmPkgSetDtlList.get(n);
                    TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                    commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                    regDomain.setDscId(criteria.getLoginUserDscId());
                    regDomain.setBrch(brch);
                    regDomain.setPltzItemNo(cmlItemDom.getPkgItemNo());
                    regDomain.setItemDescription(cmlItemDom.getPkgNm());
                    regDomain.setModelCd(cmlItemDom.getModelCd());
                    regDomain.setQty(cmlItemDom.getUseQty());
                    regDomain.setPkgTyp("2");
                    if (RT_TYP_1WAY.equals(cmlItemDom.getRtTyp())) {
                        regDomain.setRtFlg(FLAG_N);
                    } else {
                        regDomain.setRtFlg(FLAG_Y);
                    }
                    regDomain.setNetWeight(null);
                    regDomain.setPkgWeight(cmlItemDom.getPkgWeight());
                    regDomain.setWeightUnit(cmlItemDom.getWeightUnit());
                    regDomain.setOriginCntryCd(cmlItemDom.getOriginCntryCd());
                    regDomain.setCurrCd(cmlItemDom.getCurrCd());
                    regDomain.setMixTagNo("");
                    regDomain.setInputMethTyp("1");
                    twPltzItemPkgList.add(regDomain);
                    // A SEQUENCE NO is added one time.
                    // 連番を1追加
                    brch = brch.add(new BigDecimal(1));
                }
            }
            
            // An information is registered into work table.
            // ワークテーブルに情報を登録
            twPltzItemPkgService.create(twPltzItemPkgList);
        }

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnTransRevisePkgMaterials(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public void transactOnTransRevisePkgMaterials(
        W2009CmlCriteriaDomain criteria, List<MessageDomain> errorMessages) throws ApplicationException {
        
        // The information on work table is deleted.
        // ワークテーブルの情報を削除
        TwPltzItemPkgCriteriaDomain delCriteria = new TwPltzItemPkgCriteriaDomain();
        delCriteria.setDscId(criteria.getLoginUserDscId());
        delCriteria.setSearchCountCheckFlg(false);
        int count = twPltzItemPkgService.searchCount(delCriteria);
        if (count > 0) {
            twPltzItemPkgService.deleteByCondition(delCriteria);
        }
        
        // List for registration
        // 登録用リスト
        List<TwPltzItemPkgDomain> twPltzItemPkgList = new ArrayList<TwPltzItemPkgDomain>();
        
        // search important point
        // 検索要
        W2009CmlCriteriaDomain searchCriteria = new W2009CmlCriteriaDomain();
        // 3.1.Distribution of processing
        // When Change Outer CD is ""
        // 3.1.処理の振り分け
        // Change Outer CDが""の場合
        if (CheckUtil.isBlankOrNull(criteria.getOuterPkgCd())) {

            searchCriteria.setMainMark(criteria.getMainMark());
            searchCriteria.setOuterPkgCd(null); // UT110 TRIAL SHIPMENT/号試品対応 MOD
            List<? extends W2009CmlItemDomain> tmPkgSetDtlList = w2009CmlDao.searchTtPltzItemOnTransRevise(searchCriteria);
            // When the acquisition number is zero affair
            // 取得件数が0件の場合
            // UT110 TRIAL SHIPMENT/号試品対応 MOD if
            if (tmPkgSetDtlList.size() == 0 && !FLAG_Y.equals(criteria.getManualRegFlg())) {
                // An error message is displayed.
                // エラーメッセージを表示する
                errorMessages.add(new MessageDomain(null, "GSCM-E0-0010", null));
                return;
            }
            
            // the contents of registration are added to a list.
            // 登録内容をリストに追加
            for (int n = 0; n < tmPkgSetDtlList.size(); n++) {
                W2009CmlItemDomain itemDomain = tmPkgSetDtlList.get(n);
                TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2019);
                
                regDomain.setDscId(criteria.getLoginUserDscId());
                regDomain.setBrch(itemDomain.getBrch());
                regDomain.setPltzItemNo(itemDomain.getPltzItemNo());
                regDomain.setItemDescription(itemDomain.getItemDescription());
                regDomain.setModelCd(itemDomain.getModelCd());
                regDomain.setQty(itemDomain.getQty());
                regDomain.setPkgTyp(itemDomain.getPkgTyp());
                regDomain.setRtFlg(itemDomain.getRtFlg());
                regDomain.setNetWeight(null);
                regDomain.setPkgWeight(itemDomain.getItemWeight());
                regDomain.setWeightUnit(itemDomain.getWeightUnit());
                regDomain.setOriginCntryCd(itemDomain.getOriginCntryCd());
                regDomain.setCurrCd(itemDomain.getCurrCd());
                regDomain.setMixTagNo(itemDomain.getMixTagNo());
                regDomain.setInputMethTyp(itemDomain.getInputMethTyp());
                
                twPltzItemPkgList.add(regDomain);
                
            }
        
        } else {
        
            
            BigDecimal brch = new BigDecimal(1);
            
            // 3.3.1.Registration of Dunnage
            // 3.3.1.内材の登録
            searchCriteria.setMainMark(criteria.getMainMark());
            searchCriteria.setOuterPkgCd(criteria.getOuterPkgCd()); // UT110 TRIAL SHIPMENT/号試品対応 MOD
            List<? extends W2009CmlItemDomain> tmPkgSetDtlList = w2009CmlDao.searchTtPltzItemOnTransRevise(searchCriteria);
            
            // the contents of registration are added to a list.
            // 登録内容をリストに追加
            for (int n = 0; n < tmPkgSetDtlList.size(); n++) {
                W2009CmlItemDomain itemDomain = tmPkgSetDtlList.get(n);
                TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2019);
                
                regDomain.setDscId(criteria.getLoginUserDscId());
                regDomain.setBrch(itemDomain.getBrch());
                regDomain.setPltzItemNo(itemDomain.getPltzItemNo());
                regDomain.setItemDescription(itemDomain.getItemDescription());
                regDomain.setModelCd(itemDomain.getModelCd());
                regDomain.setQty(itemDomain.getQty());
                regDomain.setPkgTyp(itemDomain.getPkgTyp());
                regDomain.setRtFlg(itemDomain.getRtFlg());
                regDomain.setNetWeight(null);
                regDomain.setPkgWeight(itemDomain.getItemWeight());
                regDomain.setWeightUnit(itemDomain.getWeightUnit());
                regDomain.setOriginCntryCd(itemDomain.getOriginCntryCd());
                regDomain.setCurrCd(itemDomain.getCurrCd());
                regDomain.setMixTagNo(itemDomain.getMixTagNo());
                regDomain.setInputMethTyp(itemDomain.getInputMethTyp());
                
                twPltzItemPkgList.add(regDomain);
                // the greatest CD is acquired.
                // 最大のコードを取得する
                brch = itemDomain.getBrch();
            }
            
            // 3.3.2.Registration of imported wood
            // 3.3.2.外材の登録
            List<? extends W2009CmlItemDomain> tmPkgSetDtlOutList = w2009CmlDao.searchTmPkgSetDtl(criteria);
            // When the acquisition number is zero affair
            // 取得件数が0件の場合
            if (tmPkgSetDtlOutList.size() == 0) {
                // An error message is displayed.
                // エラーメッセージを表示する
                errorMessages.add(new MessageDomain("w2019CriteriaDomain.outerPkgCd", NXS_E7_0147, null));
                return;
            }
            
            // A SEQUENCE NO is added one time.
            // 連番を1追加
            brch = brch.add(new BigDecimal(1));
        
            // 3.3.2.4.contents of registration are added to a list.
            // 3.3.2.4.登録内容をリストに追加
            for (int n = 0; n < tmPkgSetDtlOutList.size(); n++) {
                W2009CmlItemDomain outItemDomain = tmPkgSetDtlOutList.get(n);
                TwPltzItemPkgDomain regDomain = new TwPltzItemPkgDomain();
                commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2019);
                
                regDomain.setDscId(criteria.getLoginUserDscId());
                regDomain.setBrch(brch);
                regDomain.setPltzItemNo(outItemDomain.getPkgItemNo());
                regDomain.setItemDescription(outItemDomain.getPkgNm());
                regDomain.setModelCd(outItemDomain.getModelCd());
                regDomain.setQty(outItemDomain.getUseQty());
                regDomain.setPkgTyp(PKG_TYP_OUTER);
                if (RT_TYP_1WAY.equals(outItemDomain.getRtTyp())) {
                    regDomain.setRtFlg(FLAG_N);
                } else {
                    regDomain.setRtFlg(FLAG_Y);
                }
                regDomain.setNetWeight(null);
                regDomain.setPkgWeight(outItemDomain.getPkgWeight());
                regDomain.setWeightUnit(outItemDomain.getWeightUnit());
                regDomain.setOriginCntryCd(outItemDomain.getOriginCntryCd());
                regDomain.setCurrCd(outItemDomain.getCurrCd());
                regDomain.setMixTagNo("");
                regDomain.setInputMethTyp(INPUT_METH_TYP_AUTO);
                
                twPltzItemPkgList.add(regDomain);
                // A SEQUENCE NO is added one time.
                // 連番を1追加
                brch = brch.add(new BigDecimal(1));
            }
        }
        
        // - An information is registered into work table.
        //  - ワークテーブルに情報を登録
        twPltzItemPkgService.create(twPltzItemPkgList);
        
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#transactOnTransReviseRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.util.List)
     */
    public void transactOnTransReviseRegister(W2009CmlCriteriaDomain criteria, List<MessageDomain> errorMessages)
        throws ApplicationException {

        // 3.1.Acquisition of LENGTH UNIT
        // 3.1.長さ単位の取得
        //String dispLengthUnit = commonService.searchLengthUnit(criteria.getShipperCd());
        String dispLengthUnit = criteria.getLengthUnit(); // UT110 TRIAL SHIPMENT/号試品対応 MOD
            // Get unit of length of TT_PLTZ.
            // Because convert unit of LWH of outer package that is registered in the TM_PKG_SET_HDR to unit of TT_PLTZ,
            // When change outer of not trial shipment item.
            // パレタイズの長さ単位
            // 通常流動品の外装変更時、包装組合せ原単位に登録されている外装LWH単位→パレタイズの単位変換用
        
        // 3.2.update process (Palletize)
        // 3.2.1.the contents of the update of
        // 3.2.更新処理（パレタイズ）
        // 3.2.1.更新内容
        TtPltzDomain updateDomain = new TtPltzDomain();
        // When Change Trans. To Air is "Y"
        // Change Trans. To Airが"Y"の場合
        if (FLAG_Y.equals(criteria.getReviseFlg())) {
            updateDomain.setTrnsCd(TRNS_CD_AIR);
        }
        updateDomain.setReviseFlg(criteria.getReviseFlg());
        // Change Outer CD -- "" -- the case where this is except
        // Change Outer CDが""以外の場合
        if (!CheckUtil.isBlankOrNull(criteria.getOuterPkgCd())) {
            updateDomain.setOuterPkgCd(criteria.getOuterPkgCd());
            
            // The LENGTH UNIT of TM_PKG_SET_HDR
            // 包装組合せ原単位の長さ単位
            String wkLengthUnit = criteria.getWkLengthUnit();

            // When LENGTH UNIT is in agreement
            // 長さ単位が一致する場合
            if (dispLengthUnit.equals(wkLengthUnit)) { 
                updateDomain.setLength(criteria.getWkLength());
                updateDomain.setWidth(criteria.getWkWidth());
                updateDomain.setHeight(criteria.getWkHeight());
            
            } else {
                // When LENGTH UNIT is not in agreement
                // 長さ単位が一致しない場合
                BigDecimal dispLength = null;
                BigDecimal dispWidth = null;
                BigDecimal dispHeight = null;
                Object[] paramsLength = { commonService.getResource(criteria.getLocale(), "label.length") };
                Object[] paramsWidth = { commonService.getResource(criteria.getLocale(), "label.width") };
                Object[] paramsHeight = { commonService.getResource(criteria.getLocale(), "label.height") };
                dispLength = convertLengthUnit(criteria.getWkLength(), wkLengthUnit, dispLengthUnit, paramsLength);
                dispWidth = convertLengthUnit(criteria.getWkWidth(), wkLengthUnit, dispLengthUnit, paramsWidth);
                dispHeight = convertLengthUnit(criteria.getWkHeight(), wkLengthUnit, dispLengthUnit, paramsHeight);
                updateDomain.setLength(dispLength);
                updateDomain.setWidth(dispWidth);
                updateDomain.setHeight(dispHeight);
            }
        }
        updateDomain.setVolume(criteria.getVolume());
        updateDomain.setGrossWeight(criteria.getGrossWeight());
        // When Change Trans. To Air is "Y"
        // Change Trans. To Airが"Y"の場合
        if (FLAG_Y.equals(criteria.getReviseFlg())) {
            updateDomain.setContainerLooseTyp(CONTAINER_LOOSE_TYP_LOOSE);
            updateDomain.setCustomTimingTyp(CUSTOM_TIMING_TYPE_Z);
            updateDomain.setStgInstrItemFlg(FLAG_Y);
        }

        // 4.2.Acquisition of Palletize Item Work
        // 4.2.パレタイズ対象品ワークの取得
        TwPltzItemPkgCriteriaDomain searchCriteria = new TwPltzItemPkgCriteriaDomain();
        searchCriteria.setDscId(criteria.getLoginUserDscId());
        List<? extends TwPltzItemPkgDomain> twPltzItemPkgListt = twPltzItemPkgService.searchByCondition(searchCriteria);

        // パレタイズ対象品ワークの中にRT_FLGが"Y"のデータが1件以上ある場合、パレタイズのRT_FLGを"Y"とする。
        String rtUseFlg = FLAG_N;
        for (TwPltzItemPkgDomain domain : twPltzItemPkgListt) {
            if (FLAG_Y.equals(domain.getRtFlg())) {
                rtUseFlg = FLAG_Y;
                break;
            }
        }
        updateDomain.setRtUseFlg(rtUseFlg);

        // Update process
        // 更新処理
        TtPltzCriteriaDomain updateCriteria = new TtPltzCriteriaDomain();
        updateCriteria.setMainMark(criteria.getMainMark());
        updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        if (FLAG_Y.equals(criteria.getManualRegFlg())) {
            updateDomain.setLength(criteria.getLength());
            updateDomain.setWidth(criteria.getWidth());
            updateDomain.setHeight(criteria.getHeight());
            updateDomain.setVolume(criteria.getVolume());
            updateDomain.setGrossWeight(criteria.getGrossWeight());
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        // UT420 ADD START
        // Pallet/Carton Type
        updateDomain.setPalletCartonTyp(criteria.getPalletCartonTyp());
        // Pallet No.
        // Replace the head of the Pallet/Carton Type.
        // 先頭のパレット・カートン区分を差し替える。
        String workPalletNo = criteria.getPalletNo();
        if (StringUtils.defaultString(workPalletNo).length() == 4) {
            workPalletNo = criteria.getPalletCartonTyp() + StringUtils.right(workPalletNo, 3);
            updateDomain.setPalletNo(workPalletNo);
        }
        // UT420 ADD END
        ttPltzService.updateByCondition(updateDomain, updateCriteria);
        
        // 4.1A delete of existing information
        // 4.1既存情報の削除
        W2009CmlCriteriaDomain delCriteria = new W2009CmlCriteriaDomain();
        delCriteria.setMainMark(criteria.getMainMark());
        int count = w2009CmlDao.searhcCountTtPltzItemOnTransReviseRegister(delCriteria);
        if (count > 0) {
            w2009CmlDao.deleteTtPltzItemOnTransReviseRegister(delCriteria);
        }

        // 4.3.BRANCH acquisition of maximum
        // 4.3.最大の枝番取得
        BigDecimal brch = w2009CmlDao.searchTtPltzItemByBrch(criteria);
        if (brch == null) {
            brch = new BigDecimal(1);
        } else {
            brch = brch.add(new BigDecimal(1));
        }
        
        // 4.4.Registration of Palletize Item
        // 4.4.パレタイズ対象品の登録
        List<TtPltzItemDomain> itemDomains = new ArrayList<TtPltzItemDomain>();
        
        // the contents of registration are added to a list.
        // 登録内容をリストに追加
        for (int n = 0; n < twPltzItemPkgListt.size(); n++) {
            TwPltzItemPkgDomain itemDomain = twPltzItemPkgListt.get(n);
            TtPltzItemDomain regDomain = new TtPltzItemDomain();
            commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2019);
            
            regDomain.setMainMark(criteria.getMainMark());
            regDomain.setBrch(brch);
            regDomain.setPltzItemNo(itemDomain.getPltzItemNo());
            regDomain.setPkgCd(" ");
            regDomain.setItemDescription(itemDomain.getItemDescription());
            regDomain.setQty(itemDomain.getQty());
            regDomain.setQtyUnit(QTY_UNIT_EA);
            regDomain.setTagQty(null);
            regDomain.setItemTyp(ITEM_TYP_PKG_MATERIALS);
            regDomain.setNetWeight(itemDomain.getNetWeight());
            regDomain.setItemWeight(itemDomain.getPkgWeight());
            regDomain.setWeightUnit(itemDomain.getWeightUnit());
            regDomain.setShippingLot(null);
            regDomain.setPkgTyp(itemDomain.getPkgTyp());
            regDomain.setModelCd(itemDomain.getModelCd());
            regDomain.setExpLimitTyp("");
            regDomain.setDngrItemFlg(FLAG_N);
            regDomain.setOriginCntryCd(itemDomain.getOriginCntryCd());
            regDomain.setCurrCd(itemDomain.getCurrCd());
            regDomain.setPlntCd("");
            regDomain.setRtFlg(itemDomain.getRtFlg());
            regDomain.setKitFlg(FLAG_N);
            regDomain.setExpRequestNo("");
            regDomain.setLineNo(null);
            regDomain.setKitBrch(null);
            regDomain.setMixTagNo(itemDomain.getMixTagNo());
            regDomain.setPltzInstrNo(criteria.getWkPltzInstrNo());
            regDomain.setParFlg(FLAG_Y);
            regDomain.setKitParItemNo(itemDomain.getPltzItemNo());
            regDomain.setCustomerPoNo("");
            regDomain.setCustomerItemNo("");
            regDomain.setUnitPrice(null);
            regDomain.setHsCd("");
            regDomain.setInputMethTyp(itemDomain.getInputMethTyp());
            
            itemDomains.add(regDomain);
            // A SEQUENCE NO is added one time.
            // 連番を1追加
            brch = brch.add(new BigDecimal(1));
        }
        
        // Registration processing is performed.
        // 登録処理を行う
        ttPltzItemService.create(itemDomains);
        
        // 5.work information is deleted.
        // 5.ワーク情報を削除する
        TwPltzItemPkgCriteriaDomain twDelCriteria = new TwPltzItemPkgCriteriaDomain();
        twDelCriteria.setDscId(criteria.getLoginUserDscId());
        twDelCriteria.setSearchCountCheckFlg(false);
        int twCount = twPltzItemPkgService.searchCount(twDelCriteria);
        if (twCount > 0) {
            twPltzItemPkgService.deleteByCondition(twDelCriteria);
        }
    }

    /**
     * {@inheritDoc}.
     *
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnMultiLabelRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     *
     * UT304 MULTI LABEL ADD
     */
    public W2009CmlDomain searchOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain) throws ApplicationException {

        //
        // Search order and master.
        // オーダーおよび原単位検索。
        //

        // Get local date of the shipper(time is truncated)
        // シッパーのローカル日付を取得（時刻は切り捨て）
        String timezoneId = commonService.searchTimezone(cmlCriteriaDomain.getShipperCd());
        Date shipperLocalDate = DateUtil.convertTime(new Date(), timezoneId);
        shipperLocalDate = DateUtils.truncate(shipperLocalDate, Calendar.DAY_OF_MONTH);
        cmlCriteriaDomain.setShipperTimezoneDt(shipperLocalDate);

        // Search order and header information. If result 0, Display the message.
        // オーダーおよびヘッダ情報検索。結果が0件ならメッセージを表示する。
        W2009CmlDomain resultCmlDomain = w2009CmlDao.searchOnMultiLabelRegister(cmlCriteriaDomain);
        if (resultCmlDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0001);
        } else if  (resultCmlDomain.getCmlItemDomainList() == null) {
            throw new GscmApplicationException(GSCM_E0_0001);
        } else if (resultCmlDomain.getCmlItemDomainList().size() < 1) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        W2009CmlItemDomain resultCmlItemDomain = resultCmlDomain.getCmlItemDomainList().get(0);
        // If not the trial item
        // 号試品でない場合
        if (!FLAG_Y.equals(cmlCriteriaDomain.getManualRegFlg())) {
            // If there is no PKG spec of the single item.
            // 単品の包装仕様がない場合
            if (!PKG_FORM_TYP_SINGLE.equals(resultCmlDomain.getPkgFormTyp())) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            // If there is no registration of volume information.
            // 包装仕様に容積情報の登録がない場合
            if (resultCmlDomain.getLength() == null || resultCmlDomain.getWidth() == null
                || resultCmlDomain.getHeight() == null ||  resultCmlDomain.getVolume() == null
                    || resultCmlDomain.getLengthUnit() == null || resultCmlDomain.getVolumeUnit() == null)
            {
                throw new GscmApplicationException(NXS_E7_0155, new String[]{ cmlCriteriaDomain.getPltzItemNo() });
            }
        }

        //
        // Get Part information from SIGMA.
        // CIGMAからの品番情報取得。
        //

        Ws2004ResultDomain ws2004ResultDomain
            = ws2004RestService.searchItemInfoForCml(
                cmlCriteriaDomain.getShipperCd(),
                Arrays.asList(new String[]{ cmlCriteriaDomain.getPlntCd() }),
                cmlCriteriaDomain.getLgcyWhCd(),
                Arrays.asList(new String[]{ cmlCriteriaDomain.getPltzItemNo() }),
                cmlCriteriaDomain.getCustomerCd()
            );
        if (!WS_RESULT_SUCCESS.equals(ws2004ResultDomain.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        } else if (ws2004ResultDomain.getItemList() == null) {
            throw new GscmApplicationException(NXS_E7_0092, new Object[]{ cmlCriteriaDomain.getPltzItemNo() });
        } else if (ws2004ResultDomain.getItemList().size() < 1) {
            throw new GscmApplicationException(NXS_E7_0092, new Object[]{ cmlCriteriaDomain.getPltzItemNo() });
        }
        // SIGMA information acquisition check
        // CIGMA情報取得チェック
        Ws2004ResultItemDomain ws2004ResultItemDomain = ws2004ResultDomain.getItemList().get(0);
        if (CheckUtil.isBlankOrNull(ws2004ResultItemDomain.getPackc()) ||  CheckUtil.isBlankOrNull(ws2004ResultItemDomain.getCurr3())
            ||  CheckUtil.isBlankOrNull(ws2004ResultItemDomain.getUnmsr()))
        {
            throw new GscmApplicationException(NXS_E7_0092, new Object[]{ cmlCriteriaDomain.getPltzItemNo() });
        }
        resultCmlItemDomain.setPlntCd(ws2004ResultItemDomain.getPackc());
        resultCmlItemDomain.setCurrCd(ws2004ResultItemDomain.getCurr3());
        // QTY unit
        TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
        tmMeasureUnitCriteriaDomain.setUnitCd(ws2004ResultItemDomain.getUnmsr());
        TmMeasureUnitDomain tmMeasureUnitDomain = tmMeasureUnitService.searchByKey(tmMeasureUnitCriteriaDomain);
        if (tmMeasureUnitDomain == null) {
            throw new GscmApplicationException(NXS_E1_0031,
                new Object[]{ "Measure Unit Master", ws2004ResultItemDomain.getUnmsr() });
        }
        resultCmlItemDomain.setQtyUnit(tmMeasureUnitDomain.getUnitCd());

        // Stock quantity calculation
        // 在庫数量計算
        BigDecimal onHandQty = BigDecimal.ZERO;
        if (NumberUtils.isDigits(ws2004ResultItemDomain.getMohtq())) {
            onHandQty = new BigDecimal(ws2004ResultItemDomain.getMohtq());
        }
        resultCmlItemDomain.setOnHandQty(onHandQty.subtract(resultCmlItemDomain.getTmpQty()));

        //
        // Size, weight calculation (with conversion to the unit of sipper).
        // 大きさ、重量計算（シッパーの単位への変換を伴う）。
        //

        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain resultVtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(cmlCriteriaDomain.getShipperCd());

        List<String> overflowFieldList = new ArrayList<String>();
        // If not the trial item
        // 号試品でない場合
        if (!FLAG_Y.equals(cmlCriteriaDomain.getManualRegFlg())) {
            // L
            BigDecimal covertedLength
                = commonService.convertLengthUnit(resultCmlDomain.getLength(),
                    resultCmlDomain.getLengthUnit(), resultVtCompMeasureUnitDomain.getLengthUnit());
            if (covertedLength == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.length"));
            }
            resultCmlDomain.setLength(covertedLength.setScale(MAX_SCALE_LENGTH_UNIT, RoundingMode.UP));
            // W
            BigDecimal covertedWidth
                = commonService.convertLengthUnit(resultCmlDomain.getWidth(),
                    resultCmlDomain.getLengthUnit(), resultVtCompMeasureUnitDomain.getLengthUnit());
            if (covertedWidth == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.width"));
            }
            resultCmlDomain.setWidth(covertedWidth.setScale(MAX_SCALE_LENGTH_UNIT, RoundingMode.UP));
            // H
            BigDecimal covertedHeight
                = commonService.convertLengthUnit(resultCmlDomain.getHeight(),
                    resultCmlDomain.getLengthUnit(), resultVtCompMeasureUnitDomain.getLengthUnit());
            if (covertedHeight == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.height"));
            }
            resultCmlDomain.setHeight(covertedHeight.setScale(MAX_SCALE_LENGTH_UNIT, RoundingMode.UP));
            // Volume
            BigDecimal covertedVolume
                = commonService.convertVolumeUnit(resultCmlDomain.getVolume(),
                    resultCmlDomain.getVolumeUnit(), resultVtCompMeasureUnitDomain.getVolumeUnit());
            if (covertedVolume == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.volume"));
            }
            resultCmlDomain.setVolume(covertedVolume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
        }
        // Item Weight
        if (StringUtils.equals(resultCmlItemDomain.getOriginalItemWeightUnit(), resultVtCompMeasureUnitDomain.getWeightUnit())) {
            resultCmlItemDomain.setItemWeight(resultCmlItemDomain.getOriginalItemWeight());
        } else {
            // Sipper unit. No rounding order to reduce the error of the issue as Sample N/W calculated by the J/S.
            // シッパー単位。J/Sによる号試品N/W計算の誤差を少なくするため丸めなし。
            TmUomCnvDecCriteriaDomain tmUomCnvDecCriteriaDomain = new TmUomCnvDecCriteriaDomain();
            tmUomCnvDecCriteriaDomain.setUomCdConvSrc(resultCmlItemDomain.getOriginalItemWeightUnit());
            tmUomCnvDecCriteriaDomain.setUomCdConvTrgt(resultVtCompMeasureUnitDomain.getWeightUnit());
            TmUomCnvDecDomain tmUomCnvDecDomain = tmUomCnvDecService.searchByKey(tmUomCnvDecCriteriaDomain);
            if (tmUomCnvDecDomain == null) {
                throw new SystemException(GSCM_E0_0001);
            }
            BigDecimal itemWeight = resultCmlItemDomain.getOriginalItemWeight().multiply(tmUomCnvDecDomain.getUomCdConvFactor());
            if (commonService.isWeightOverflow(itemWeight)) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.netWeight"));
                itemWeight = null;
            }
            resultCmlItemDomain.setItemWeight(itemWeight);
        }
        // N/W
        if (resultCmlItemDomain.getOriginalItemWeight() != null && resultCmlItemDomain.getShippingLot() != null) {
            BigDecimal originalNetWeight = resultCmlItemDomain.getOriginalItemWeight().multiply(resultCmlItemDomain.getShippingLot());
            BigDecimal covertedNetWeight = commonService.convertWeightUnit(originalNetWeight,
                resultCmlItemDomain.getOriginalItemWeightUnit(), resultVtCompMeasureUnitDomain.getWeightUnit());
            if (covertedNetWeight == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.netWeight"));
            }
            resultCmlDomain.setNetWeight(covertedNetWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
        }
        resultCmlDomain.setLengthUnit(resultVtCompMeasureUnitDomain.getLengthUnit());
        resultCmlDomain.setLengthUnitDisp(resultVtCompMeasureUnitDomain.getLengthUnitDisp());
        resultCmlDomain.setVolumeUnit(resultVtCompMeasureUnitDomain.getVolumeUnit());
        resultCmlDomain.setVolumeUnitDisp(resultVtCompMeasureUnitDomain.getVolumeUnitDisp());
        resultCmlDomain.setWeightUnit(resultVtCompMeasureUnitDomain.getWeightUnit());
        resultCmlDomain.setWeightUnitDisp(resultVtCompMeasureUnitDomain.getWeightUnitDisp());

        //
        // PKG work registration and calculate the G/W.
        // PKGワーク登録およびG/W計算。
        //

        // PKG work clear.
        // PKGワーククリア。
        TwPltzItemPkgCriteriaDomain twPltzItemPkgCriteriaDomain = new TwPltzItemPkgCriteriaDomain();
        twPltzItemPkgCriteriaDomain.setDscId(cmlCriteriaDomain.getLoginUserDscId());
        twPltzItemPkgCriteriaDomain.setSearchCountCheckFlg(false);
        int deleteCount = twPltzItemPkgService.searchCount(twPltzItemPkgCriteriaDomain);
        if (0 < deleteCount) {
            twPltzItemPkgService.deleteByCondition(twPltzItemPkgCriteriaDomain);
        }
        resultCmlDomain.setRtUseFlg(FLAG_N);

        // If not the trial item
        // 号試品でない場合
        if (!FLAG_Y.equals(cmlCriteriaDomain.getManualRegFlg())) {
            // Register the PKG work.
            // PKGワークの登録。
            commonService.setCommonPropertyForRegist(cmlCriteriaDomain, SCREEN_ID_W2020);
            w2009CmlDao.createTwPltzItemPkgOnMultiLabelRegister(cmlCriteriaDomain);
            // RT Flag
            twPltzItemPkgCriteriaDomain = new TwPltzItemPkgCriteriaDomain();
            twPltzItemPkgCriteriaDomain.setDscId(cmlCriteriaDomain.getLoginUserDscId());
            twPltzItemPkgCriteriaDomain.setRtFlg(FLAG_Y);
            twPltzItemPkgCriteriaDomain.setSearchCountCheckFlg(false);
            int resultRtCount = twPltzItemPkgService.searchCount(twPltzItemPkgCriteriaDomain);
            if (0 < resultRtCount) {
                resultCmlDomain.setRtUseFlg(FLAG_Y);
            }

            // Calculate the packaging material weight from PKG work.
            // PKGワークより包装材重量を計算
            BigDecimal convertedPkgWeight
                = calculateTotalPkgWeightFromPkgWork(cmlCriteriaDomain, resultVtCompMeasureUnitDomain.getWeightUnit());
            if (convertedPkgWeight == null) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.grossWeight"));
            }
            // G/W
            if (resultCmlDomain.getNetWeight() != null && convertedPkgWeight != null) {
                BigDecimal convertedGrossWeight = resultCmlDomain.getNetWeight().add(convertedPkgWeight);
                if (commonService.isWeightOverflow(convertedGrossWeight)) {
                    overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.grossWeight"));
                }
                resultCmlDomain.setGrossWeight(convertedGrossWeight);
            }
        }

        resultCmlDomain.setOverflowFieldList(overflowFieldList);

        return resultCmlDomain;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#registerOnMultiLabelRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     *
     * UT304 MULTI LABEL ADD
     */
    public W2009CmlDomain registerOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain) throws ApplicationException {

        // Get local date of the shipper(time is truncated)
        // シッパーのローカル日付を取得（時刻は切り捨て）
        String timezoneId = commonService.searchTimezone(cmlCriteriaDomain.getShipperCd());
        Date shipperLocalDateTime = DateUtil.convertTime(new Date(), timezoneId);
        Date shipperLocalDate = DateUtils.truncate(shipperLocalDateTime, Calendar.DAY_OF_MONTH);

        // Numbering of the main mark
        // メインマークの採番
        String mainMarkKey
            = String.format("%s%s%s%s", "A", cmlCriteriaDomain.getShipperCd(),
                cmlCriteriaDomain.getPackingWhCd(), DateUtil.formatDate(shipperLocalDate, "yyMMdd").substring(1));
        List<String> mainMarkSeqList
            = commonService.transactSequence(mainMarkKey, SEQ_TYP_CML_NO_DN, cmlCriteriaDomain.getCmlQty().intValue(), SCREEN_ID_W2020);
        List<String> mainMarkList = new ArrayList<String>();
        for (String mainMarkSeq : mainMarkSeqList) {
            mainMarkList.add(mainMarkKey + mainMarkSeq);
        }

        // Search and lock the allocatable orders.
        // 引当可能な受注をロックして検索
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteriaDomain = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteriaDomain.setRcvOdrCompCd(cmlCriteriaDomain.getShipperCd());
        ttExpRcvOdrCriteriaDomain.setCustomerCd(cmlCriteriaDomain.getCustomerCd());
        ttExpRcvOdrCriteriaDomain.setLgcyShipTo(cmlCriteriaDomain.getLgcyShipTo());
        ttExpRcvOdrCriteriaDomain.setTrnsCd(cmlCriteriaDomain.getTrnsCd());
        ttExpRcvOdrCriteriaDomain.setItemNo(cmlCriteriaDomain.getPltzItemNo());
        ttExpRcvOdrCriteriaDomain.setPkgCd(cmlCriteriaDomain.getPkgCd());
        ttExpRcvOdrCriteriaDomain.setCustomerPoNo(cmlCriteriaDomain.getCustomerPoNo());
        ttExpRcvOdrCriteriaDomain.setOdrFirmFlg(FLAG_Y);
        ttExpRcvOdrCriteriaDomain.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        ttExpRcvOdrCriteriaDomain.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");
        List<? extends TtExpRcvOdrDomain> resultOdrList = w2009CmlDao.lockTtExpRcvOdr(ttExpRcvOdrCriteriaDomain);

        int shippingLot = cmlCriteriaDomain.getShippingLot().intValue();
        List<TtExpRcvOdrDomain> allocOdrList = new ArrayList<TtExpRcvOdrDomain>();
        List<TtPltzItemOdrDomain> ttPltzItemOdrCreateDomainList = new ArrayList<TtPltzItemOdrDomain>();

        // Allocate orders
        // 受注の引当
        for (String mainMark : mainMarkList) {
            int totalQtyInMainMark = 0;
            while (totalQtyInMainMark < shippingLot && 0 < resultOdrList.size()) {

                TtExpRcvOdrDomain resultOdr = resultOdrList.get(0);
                int odrQty = resultOdr.getOdrQty().intValue();
                int odrAllocQty = resultOdr.getPltzAllocQty().intValue();
                int allocatableQty = odrQty - odrAllocQty;
                int allocQty = Math.min(shippingLot - totalQtyInMainMark, allocatableQty);
                resultOdr.setPltzAllocQty(new BigDecimal(odrAllocQty + allocQty));
                totalQtyInMainMark += allocQty;

                // List of orders that allocated
                // 引き当てた受注のリスト
                if (!allocOdrList.contains(resultOdr)) {
                    allocOdrList.add(resultOdr);
                }

                // Registration information list of TT_PLTZ_ITEM
                // パレタイズ対象品の登録情報リスト
                TtPltzItemOdrDomain ttPltzItemOdrCreateDomain = new TtPltzItemOdrDomain();
                CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdrCreateDomain, resultOdr);
                ttPltzItemOdrCreateDomain.setMainMark(mainMark);
                ttPltzItemOdrCreateDomain.setBrch(BigDecimal.ONE);
                ttPltzItemOdrCreateDomain.setAllocQty(new BigDecimal(allocQty));
                commonService.setCommonPropertyForRegist(ttPltzItemOdrCreateDomain, SCREEN_ID_W2020);
                ttPltzItemOdrCreateDomainList.add(ttPltzItemOdrCreateDomain);

                if (resultOdr.getPltzAllocQty().intValue() == odrQty) {
                    resultOdrList.remove(0);
                }
            }
            // If order QTY is not enough
            // 受注数が足りない場合
            if (totalQtyInMainMark < shippingLot) {
                throw new GscmApplicationException(NXS_E7_0089, new String[]{ cmlCriteriaDomain.getPltzItemNo() });
            }
        }

        // Update TT_EXP_RCV_ODR
        // 輸出受注の更新
        for (TtExpRcvOdrDomain allocOdr : allocOdrList) {

            TtExpRcvOdrDomain ttExpRcvOdrUpdateDomain = new TtExpRcvOdrDomain();
            ttExpRcvOdrUpdateDomain.setPltzAllocQty(allocOdr.getPltzAllocQty());
            if (allocOdr.getOdrQty().compareTo(allocOdr.getPltzAllocQty()) == 0) {
                ttExpRcvOdrUpdateDomain.setShippedTyp(SHIPPED_TYP_PACKED);
            }
            commonService.setCommonPropertyForUpdate(ttExpRcvOdrUpdateDomain, SCREEN_ID_W2020);

            TtExpRcvOdrCriteriaDomain ttExpRcvOdrUpdateCriteriaDomain = new TtExpRcvOdrCriteriaDomain();
            ttExpRcvOdrUpdateCriteriaDomain.setRcvOdrCompCd(allocOdr.getRcvOdrCompCd());
            ttExpRcvOdrUpdateCriteriaDomain.setCustomerCd(allocOdr.getCustomerCd());
            ttExpRcvOdrUpdateCriteriaDomain.setLgcyShipTo(allocOdr.getLgcyShipTo());
            ttExpRcvOdrUpdateCriteriaDomain.setItemNo(allocOdr.getItemNo());
            ttExpRcvOdrUpdateCriteriaDomain.setPkgCd(allocOdr.getPkgCd());
            ttExpRcvOdrUpdateCriteriaDomain.setTrnsCd(allocOdr.getTrnsCd());
            ttExpRcvOdrUpdateCriteriaDomain.setEtdDueDt(allocOdr.getEtdDueDt());
            ttExpRcvOdrUpdateCriteriaDomain.setCustomerPoNo(allocOdr.getCustomerPoNo());
            ttExpRcvOdrUpdateCriteriaDomain.setCustomerItemNo(allocOdr.getCustomerItemNo());
            ttExpRcvOdrUpdateCriteriaDomain.setCustomerItemNoOrg(allocOdr.getCustomerItemNoOrg());
            ttExpRcvOdrUpdateCriteriaDomain.setOdrCtrlNo(allocOdr.getOdrCtrlNo());

            ttExpRcvOdrService.updateByCondition(ttExpRcvOdrUpdateDomain, ttExpRcvOdrUpdateCriteriaDomain);
        }

        // Update TT_PLTZ_ITEM_ODR
        // パレタイズ対象品受注情報の登録。
        ttPltzItemOdrService.create(ttPltzItemOdrCreateDomainList);

        int palletNoSeq = 1;
        for (String mainMark : mainMarkList) {

            // TT_PLTZ registration
            // パレタイズ登録

            // The earliest ETD in order that allocated
            // 引き当てた受注の中で最も早いETD
            Date etdDueDate = null;
            for (TtPltzItemOdrDomain ttPltzItemOdrDomain : ttPltzItemOdrCreateDomainList) {
                if (mainMark.equals(ttPltzItemOdrDomain.getMainMark())) {
                    etdDueDate = ttPltzItemOdrDomain.getEtdDueDt();
                    break;
                }
            }
            // PKG FORM TYPE
            String pkgFormTyp = cmlCriteriaDomain.getPkgFormTyp();
            if (FLAG_Y.equals(cmlCriteriaDomain.getManualRegFlg())) {
                pkgFormTyp = PKG_FORM_TYP_MANUAL_REG;
            }

            TtPltzDomain ttPltzCreateDomain = new TtPltzDomain();
            ttPltzCreateDomain.setMainMark(mainMark);
            ttPltzCreateDomain.setPalletNo(cmlCriteriaDomain.getPalletCartonTyp() + String.format("%03d", palletNoSeq++));
            ttPltzCreateDomain.setShipperCd(cmlCriteriaDomain.getShipperCd());
            ttPltzCreateDomain.setShipToCd(cmlCriteriaDomain.getShipToCd());
            ttPltzCreateDomain.setCustomerCd(cmlCriteriaDomain.getCustomerCd());
            ttPltzCreateDomain.setLgcyShipTo(cmlCriteriaDomain.getLgcyShipTo());
            ttPltzCreateDomain.setTrnsCd(cmlCriteriaDomain.getTrnsCd());
            ttPltzCreateDomain.setTrnsCdOrg(cmlCriteriaDomain.getTrnsCd());
            ttPltzCreateDomain.setReviseFlg(FLAG_N);
            ttPltzCreateDomain.setPlntCd(cmlCriteriaDomain.getPlntCd());
            ttPltzCreateDomain.setLgcyWhCd(cmlCriteriaDomain.getLgcyWhCd());
            ttPltzCreateDomain.setCurLgcyWhCd(cmlCriteriaDomain.getLgcyWhCd());
            ttPltzCreateDomain.setPkgFormTyp(pkgFormTyp);
            ttPltzCreateDomain.setInvoiceKey(cmlCriteriaDomain.getInvoiceKey());
            ttPltzCreateDomain.setContainerSortingKey(cmlCriteriaDomain.getContainerSortingKey());
            ttPltzCreateDomain.setContainerLooseTyp(cmlCriteriaDomain.getContainerLooseTyp());
            ttPltzCreateDomain.setReturnStyleCd(null);
            ttPltzCreateDomain.setVariantFlg(FLAG_N);
            ttPltzCreateDomain.setRtUseFlg(cmlCriteriaDomain.getRtUseFlg());
            ttPltzCreateDomain.setWeightUnit(cmlCriteriaDomain.getWeightUnit());
            ttPltzCreateDomain.setNetWeight(cmlCriteriaDomain.getNetWeight());
            ttPltzCreateDomain.setGrossWeight(cmlCriteriaDomain.getGrossWeight());
            ttPltzCreateDomain.setLengthUnit(cmlCriteriaDomain.getLengthUnit());
            ttPltzCreateDomain.setLength(cmlCriteriaDomain.getLength());
            ttPltzCreateDomain.setWidth(cmlCriteriaDomain.getWidth());
            ttPltzCreateDomain.setHeight(cmlCriteriaDomain.getHeight());
            ttPltzCreateDomain.setVolumeUnit(cmlCriteriaDomain.getVolumeUnit());
            ttPltzCreateDomain.setVolume(cmlCriteriaDomain.getVolume());
            ttPltzCreateDomain.setSupplierMainMark(null);
            ttPltzCreateDomain.setCmlTyp(CML_TYPE_CIGMA);
            ttPltzCreateDomain.setOuterPkgCd(cmlCriteriaDomain.getOuterPkgCd());
            ttPltzCreateDomain.setExpPackingDt(shipperLocalDate);
            ttPltzCreateDomain.setExpPackingIssuerId(cmlCriteriaDomain.getLoginUserDscId());
            ttPltzCreateDomain.setExpPackingIssuerNm(cmlCriteriaDomain.getUsrNmEn());
            ttPltzCreateDomain.setDueDt(etdDueDate);
            ttPltzCreateDomain.setStgInstrItemFlg(cmlCriteriaDomain.getStgInstrItemFlg());
            ttPltzCreateDomain.setConsigneeCd(cmlCriteriaDomain.getConsigneeCd());
            ttPltzCreateDomain.setCommercialFlg(FLAG_Y);
            ttPltzCreateDomain.setTradeTerms(null);
            ttPltzCreateDomain.setCurrCd(cmlCriteriaDomain.getCurrCd());
            ttPltzCreateDomain.setPltzStatus(PLTZ_STATUS_PLTZ);
            ttPltzCreateDomain.setPackingWhCompCd(cmlCriteriaDomain.getPackingWhCompCd());
            ttPltzCreateDomain.setPackingWhCd(cmlCriteriaDomain.getPackingWhCd());
            ttPltzCreateDomain.setCurWhCompCd(cmlCriteriaDomain.getPackingWhCompCd());
            ttPltzCreateDomain.setCurWhCd(cmlCriteriaDomain.getPackingWhCd());
            ttPltzCreateDomain.setXmainMark(null);
            ttPltzCreateDomain.setInvoiceNo(null);
            ttPltzCreateDomain.setInvoiceIssueDt(null);
            ttPltzCreateDomain.setLoadingCd(cmlCriteriaDomain.getLoadingCd());
            ttPltzCreateDomain.setSiteTyp(null);
            ttPltzCreateDomain.setExpLimitFlg(cmlCriteriaDomain.getExpLimitFlg());
            ttPltzCreateDomain.setDngrItemFlg(cmlCriteriaDomain.getDngrItemFlg());
            ttPltzCreateDomain.setStgInstrNo(null);
            ttPltzCreateDomain.setStgActNo(null);
            ttPltzCreateDomain.setShippingFirmNo(null);
            ttPltzCreateDomain.setCustomTimingTyp(cmlCriteriaDomain.getCustomTimingTyp());
            ttPltzCreateDomain.setLastTrStatus(LAST_TR_STATUS_BLANK);
            ttPltzCreateDomain.setLastTrRcvDt(null);
            ttPltzCreateDomain.setPltzInstrNo(null);
            ttPltzCreateDomain.setExpRequestNo(null);
            ttPltzCreateDomain.setExpRequestAllCmlIssuedFlg(FLAG_N);
            ttPltzCreateDomain.setSplitShippingNgFlg(FLAG_N);
            ttPltzCreateDomain.setShipperCompNmAbb(null);
            ttPltzCreateDomain.setShipperCompNm1(null);
            ttPltzCreateDomain.setShipperCompNm2(null);
            ttPltzCreateDomain.setShipperCompAddr1(null);
            ttPltzCreateDomain.setShipperCompAddr2(null);
            ttPltzCreateDomain.setShipperCompAddr3(null);
            ttPltzCreateDomain.setShipperCompAddr4(null);
            ttPltzCreateDomain.setShipperCompTel(null);
            ttPltzCreateDomain.setShipperCompFax(null);
            ttPltzCreateDomain.setConsigneeCompNm1(null);
            ttPltzCreateDomain.setConsigneeCompNm2(null);
            ttPltzCreateDomain.setConsigneeCompAddr1(null);
            ttPltzCreateDomain.setConsigneeCompAddr2(null);
            ttPltzCreateDomain.setConsigneeCompAddr3(null);
            ttPltzCreateDomain.setConsigneeCompAddr4(null);
            ttPltzCreateDomain.setConsigneeCompTel(null);
            ttPltzCreateDomain.setConsigneeCompFax(null);
            ttPltzCreateDomain.setConsigneeAttn(null);
            ttPltzCreateDomain.setShipToNm1(null);
            ttPltzCreateDomain.setShipToNm2(null);
            ttPltzCreateDomain.setShipToAddr1(null);
            ttPltzCreateDomain.setShipToAddr2(null);
            ttPltzCreateDomain.setShipToAddr3(null);
            ttPltzCreateDomain.setShipToAddr4(null);
            ttPltzCreateDomain.setShipToTel(null);
            ttPltzCreateDomain.setInvoiceCtgry("C");
            ttPltzCreateDomain.setPriceTerms(null);
            ttPltzCreateDomain.setTermsPoint(null);
            ttPltzCreateDomain.setPayTerms(null);
            ttPltzCreateDomain.setPayMeth(null);
            ttPltzCreateDomain.setReExpGoodsFlg(FLAG_N);
            ttPltzCreateDomain.setSupplierInvoiceNo(null);
            ttPltzCreateDomain.setImpInvoiceNo1(null);
            ttPltzCreateDomain.setImpInvoiceNo2(null);
            ttPltzCreateDomain.setFreightResponsibleCd(null);
            ttPltzCreateDomain.setMigrationFlg(FLAG_N);
            ttPltzCreateDomain.setOldQrMixTyp(null);
            ttPltzCreateDomain.setOldQrContainerGrpCd(null);
            ttPltzCreateDomain.setPalletCartonTyp(cmlCriteriaDomain.getPalletCartonTyp());
            commonService.setCommonPropertyForRegist(ttPltzCreateDomain, SCREEN_ID_W2020);
            ttPltzService.create(ttPltzCreateDomain);

            // TT_PLTZ_ITEM registration(parts)
            // パレタイズ対象品登録（品番）

            List<TtPltzItemDomain> ttPltzItemCreateDomainList = new ArrayList<TtPltzItemDomain>();
            TtPltzItemDomain ttPltzItemCreateDomain = null;
            int pltzItemBrch = 1;

            ttPltzItemCreateDomain = new TtPltzItemDomain();
            ttPltzItemCreateDomain.setMainMark(mainMark);
            ttPltzItemCreateDomain.setBrch(new BigDecimal(pltzItemBrch++));
            ttPltzItemCreateDomain.setPltzItemNo(cmlCriteriaDomain.getPltzItemNo());
            ttPltzItemCreateDomain.setPkgCd(StringUtils.rightPad(cmlCriteriaDomain.getPkgCd(), 1));
            ttPltzItemCreateDomain.setItemDescription(cmlCriteriaDomain.getItemDescription());
            ttPltzItemCreateDomain.setQty(cmlCriteriaDomain.getShippingLot());
            ttPltzItemCreateDomain.setQtyUnit(cmlCriteriaDomain.getQtyUnit());
            ttPltzItemCreateDomain.setTagQty(null);
            ttPltzItemCreateDomain.setItemTyp(null);
            ttPltzItemCreateDomain.setNetWeight(cmlCriteriaDomain.getOriginalItemWeight().multiply(cmlCriteriaDomain.getShippingLot()));
            ttPltzItemCreateDomain.setItemWeight(cmlCriteriaDomain.getOriginalItemWeight());
            ttPltzItemCreateDomain.setWeightUnit(cmlCriteriaDomain.getOriginalItemWeightUnit());
            ttPltzItemCreateDomain.setShippingLot(cmlCriteriaDomain.getShippingLot());
            ttPltzItemCreateDomain.setPkgTyp(null);
            ttPltzItemCreateDomain.setModelCd(null);
            ttPltzItemCreateDomain.setExpLimitTyp(cmlCriteriaDomain.getExpLimitTyp());
            ttPltzItemCreateDomain.setDngrItemFlg(cmlCriteriaDomain.getDngrItemFlg());
            ttPltzItemCreateDomain.setOriginCntryCd(cmlCriteriaDomain.getOriginCntryCd());
            ttPltzItemCreateDomain.setCurrCd(cmlCriteriaDomain.getCurrCd());
            ttPltzItemCreateDomain.setPlntCd(cmlCriteriaDomain.getPlntCd());
            ttPltzItemCreateDomain.setRtFlg(FLAG_N);
            ttPltzItemCreateDomain.setKitFlg(FLAG_N);
            ttPltzItemCreateDomain.setExpRequestNo(null);
            ttPltzItemCreateDomain.setLineNo(null);
            ttPltzItemCreateDomain.setKitBrch(null);
            ttPltzItemCreateDomain.setMixTagNo(null);
            ttPltzItemCreateDomain.setPltzInstrNo(null);
            ttPltzItemCreateDomain.setParFlg(FLAG_Y);
            ttPltzItemCreateDomain.setKitParItemNo(cmlCriteriaDomain.getPltzItemNo());
            ttPltzItemCreateDomain.setCustomerPoNo(null);
            ttPltzItemCreateDomain.setCustomerItemNo(null);
            ttPltzItemCreateDomain.setUnitPrice(null);
            ttPltzItemCreateDomain.setHsCd(null);
            ttPltzItemCreateDomain.setInputMethTyp(null);
            commonService.setCommonPropertyForRegist(ttPltzItemCreateDomain, SCREEN_ID_W2020);
            ttPltzItemCreateDomainList.add(ttPltzItemCreateDomain);

            // TT_PLTZ_ITEM registration(PKG)
            // パレタイズ対象品登録（包装材）

            // Search TW_PLTZ_ITEM_PKG
            // パレタイズ対象品PKGワークの検索
            TwPltzItemPkgCriteriaDomain twPltzItemPkgCriteriaDomain = new TwPltzItemPkgCriteriaDomain();
            twPltzItemPkgCriteriaDomain.setDscId(cmlCriteriaDomain.getLoginUserDscId());
            List<TwPltzItemPkgDomain> resultTwPltzItemPkgDomainList = twPltzItemPkgService.searchByCondition(twPltzItemPkgCriteriaDomain);
            for (TwPltzItemPkgDomain resultTwPltzItemPkgDomain : resultTwPltzItemPkgDomainList) {
                ttPltzItemCreateDomain = new TtPltzItemDomain();
                ttPltzItemCreateDomain.setMainMark(mainMark);
                ttPltzItemCreateDomain.setBrch(new BigDecimal(pltzItemBrch++));
                ttPltzItemCreateDomain.setPltzItemNo(resultTwPltzItemPkgDomain.getPltzItemNo());
                ttPltzItemCreateDomain.setPkgCd(" ");
                ttPltzItemCreateDomain.setItemDescription(resultTwPltzItemPkgDomain.getItemDescription());
                ttPltzItemCreateDomain.setQty(resultTwPltzItemPkgDomain.getQty());
                ttPltzItemCreateDomain.setQtyUnit(QTY_UNIT_EA);
                ttPltzItemCreateDomain.setTagQty(null);
                ttPltzItemCreateDomain.setItemTyp(ITEM_TYP_PKG_MATERIALS);
                ttPltzItemCreateDomain.setNetWeight(resultTwPltzItemPkgDomain.getNetWeight());
                ttPltzItemCreateDomain.setItemWeight(resultTwPltzItemPkgDomain.getPkgWeight());
                ttPltzItemCreateDomain.setWeightUnit(resultTwPltzItemPkgDomain.getWeightUnit());
                ttPltzItemCreateDomain.setShippingLot(null);
                ttPltzItemCreateDomain.setPkgTyp(resultTwPltzItemPkgDomain.getPkgTyp());
                ttPltzItemCreateDomain.setModelCd(resultTwPltzItemPkgDomain.getModelCd());
                ttPltzItemCreateDomain.setExpLimitTyp(null);
                ttPltzItemCreateDomain.setDngrItemFlg(FLAG_N);
                ttPltzItemCreateDomain.setOriginCntryCd(resultTwPltzItemPkgDomain.getOriginCntryCd());
                ttPltzItemCreateDomain.setCurrCd(resultTwPltzItemPkgDomain.getCurrCd());
                ttPltzItemCreateDomain.setPlntCd(null);
                ttPltzItemCreateDomain.setRtFlg(resultTwPltzItemPkgDomain.getRtFlg());
                ttPltzItemCreateDomain.setKitFlg(FLAG_N);
                ttPltzItemCreateDomain.setExpRequestNo(null);
                ttPltzItemCreateDomain.setLineNo(null);
                ttPltzItemCreateDomain.setKitBrch(null);
                ttPltzItemCreateDomain.setMixTagNo(null);
                ttPltzItemCreateDomain.setPltzInstrNo(null);
                ttPltzItemCreateDomain.setParFlg(FLAG_Y);
                ttPltzItemCreateDomain.setKitParItemNo(resultTwPltzItemPkgDomain.getPltzItemNo());
                ttPltzItemCreateDomain.setCustomerPoNo(null);
                ttPltzItemCreateDomain.setCustomerItemNo(null);
                ttPltzItemCreateDomain.setUnitPrice(null);
                ttPltzItemCreateDomain.setHsCd(null);
                ttPltzItemCreateDomain.setInputMethTyp(resultTwPltzItemPkgDomain.getInputMethTyp());
                commonService.setCommonPropertyForRegist(ttPltzItemCreateDomain, SCREEN_ID_W2020);
                ttPltzItemCreateDomainList.add(ttPltzItemCreateDomain);
            }

            ttPltzItemService.create(ttPltzItemCreateDomainList);
        }

        // TT_TMP_STOCK registration
        // Update if there is a record. If not, registration.
        // 仮在庫の登録
        // レコードがあれば更新なければ登録
        TtTmpStockCriteriaDomain ttTmpStockCriteriaDomain = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteriaDomain.setShipperCd(cmlCriteriaDomain.getShipperCd());
        ttTmpStockCriteriaDomain.setLgcyWhCd(cmlCriteriaDomain.getLgcyWhCd());
        ttTmpStockCriteriaDomain.setItemNo(cmlCriteriaDomain.getPltzItemNo());
        ttTmpStockCriteriaDomain.setPkgCd(StringUtils.rightPad(cmlCriteriaDomain.getPkgCd(), 1));
        TtTmpStockDomain resultTtTmpStockDomain = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteriaDomain);
        if (resultTtTmpStockDomain != null) {
            commonService.setCommonPropertyForUpdate(resultTtTmpStockDomain, SCREEN_ID_W2020);
            resultTtTmpStockDomain.setQty(resultTtTmpStockDomain.getQty().add(cmlCriteriaDomain.getTotalQty()));
            ttTmpStockService.update(resultTtTmpStockDomain);
        } else {
            TtTmpStockDomain ttTmpStockCreteDomain = new TtTmpStockDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttTmpStockCreteDomain, ttTmpStockCriteriaDomain);
            commonService.setCommonPropertyForRegist(ttTmpStockCreteDomain, SCREEN_ID_W2020);
            ttTmpStockCreteDomain.setQty(cmlCriteriaDomain.getTotalQty());
            ttTmpStockService.create(ttTmpStockCreteDomain);
        }

        // CIGMA I/F
        // CIGMA連携
        List<TtPltzItemOdrDomain> ttPltzItemOdrDomainList = new ArrayList<TtPltzItemOdrDomain>();
        for (TtExpRcvOdrDomain allocOdr : allocOdrList) {
            TtPltzItemOdrDomain ttPltzItemOdrDomain = new TtPltzItemOdrDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdrDomain, allocOdr);
            ttPltzItemOdrDomain.setAllocQty(allocOdr.getPltzAllocQty());
            ttPltzItemOdrDomainList.add(ttPltzItemOdrDomain);
        }
        registRevOdeAllocOnRegister(cmlCriteriaDomain, ttPltzItemOdrDomainList);

        // Return value
        // 戻り値
        W2009CmlDomain cmlDomain = new W2009CmlDomain();
        if (0 < mainMarkList.size()) {
            cmlDomain.setFromMainMark(mainMarkList.get(0));
            cmlDomain.setToMainMark(mainMarkList.get(mainMarkList.size() - 1));
            cmlDomain.setExpPackingDt(shipperLocalDate);
            cmlDomain.setExpPackingIssuerNm(cmlCriteriaDomain.getUsrNmEn());
        }

        return cmlDomain;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#searchOnMultiLabelPkgMaterialsReturn(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     *
     * UT304 MULTI LABEL ADD
     */
    public W2009CmlDomain searchOnMultiLabelPkgMaterialsReturn(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException
    {
        W2009CmlDomain cmlDomain = new W2009CmlDomain();

        // RT material use the presence or absence of TW_PLTZ_ITEM_PKG
        // PKGワークのRT材使用有無
        TwPltzItemPkgCriteriaDomain twPltzItemPkgCriteriaDomain = new TwPltzItemPkgCriteriaDomain();
        twPltzItemPkgCriteriaDomain.setDscId(cmlCriteriaDomain.getLoginUserDscId());
        twPltzItemPkgCriteriaDomain.setRtFlg(FLAG_Y);
        twPltzItemPkgCriteriaDomain.setSearchCountCheckFlg(false);
        cmlDomain.setRtUseFlg(FLAG_N);
        int resultCount = twPltzItemPkgService.searchCount(twPltzItemPkgCriteriaDomain);
        if (0 < resultCount) {
            cmlDomain.setRtUseFlg(FLAG_Y);
        }

        List<String> overflowFieldList = new ArrayList<String>();
        cmlDomain.setOverflowFieldList(overflowFieldList);
        // Calculate the packaging material weight from PKG work.
        // PKGワークより包装材重量を計算
        BigDecimal convertedPkgWeight
            = calculateTotalPkgWeightFromPkgWork(cmlCriteriaDomain, cmlCriteriaDomain.getWeightUnit());
        if (convertedPkgWeight == null) {
            overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.grossWeight"));
        }
        // G/W
        if (cmlCriteriaDomain.getNetWeight() != null && convertedPkgWeight != null) {
            BigDecimal convertedGrossWeight = cmlCriteriaDomain.getNetWeight().add(convertedPkgWeight);
            if (commonService.isWeightOverflow(convertedGrossWeight)) {
                overflowFieldList.add(commonService.getResource(cmlCriteriaDomain.getLocale(), "label.grossWeight"));
            }
            cmlDomain.setGrossWeight(convertedGrossWeight);
        }

        return cmlDomain;
    }

    /**
     * Calculate the G/W from PKG work.
     * PKGワークから包装材の合計重量を取得する。（単位ごとグループ化方式）
     *
     * UT304 MULTI LABEL ADD
     *
     * @param cmlCriteriaDomain Search criteria
     * @param resultUnitCd Conversion to
     * @return result. If null then overfow.
     * @throws ApplicationException Business Exception
     */
    protected BigDecimal calculateTotalPkgWeightFromPkgWork(W2009CmlCriteriaDomain cmlCriteriaDomain, String resultUnitCd)
        throws ApplicationException
    {
        BigDecimal convertedTotalPkdWeight = BigDecimal.ZERO;
        for (W2009CmlDomain resultCmlDomain : w2009CmlDao.searchTwPltzItemPkgByDscId(cmlCriteriaDomain)) {
            BigDecimal convertedPkdWeight
                = commonService.convertWeightUnit(resultCmlDomain.getNetWeight(), resultCmlDomain.getWeightUnit(), resultUnitCd);
            if (convertedPkdWeight == null) {
                return null;
            }
            convertedTotalPkdWeight = convertedTotalPkdWeight.add(convertedPkdWeight);
        }
        return convertedTotalPkdWeight;
    }

    // --------------------------------- Print system method ---------------------------------
    // --------------------------------- プリント系メソッド --------------------------------- 
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#printCml(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.lang.String)
     */
    public File printCml(W2009CmlCriteriaDomain criteria, String reportDateFormat)
        throws ApplicationException {

        // A create of PDF list
        // PDF帳票の作成
        return l2003ReportService.searchCml(criteria.getPltzInstrNo() , criteria.getMainMark(), reportDateFormat);

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2009CmlService#printMultiCml(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain, java.lang.String)
     * UT414 ADD
     */
    public File printMultiCml(W2009CmlCriteriaDomain criteria, String reportDateFormat) throws ApplicationException {
        List<File> pdfFileList = new ArrayList<File>();
        for (String mainMark : criteria.getMainMarkList()) {
            File pdfFile = l2003ReportService.searchCml(null, mainMark, reportDateFormat);
            pdfFileList.add(pdfFile);
        }
        // UT304 MULTI LABEL MOD STAR 
        //File mergedPdfFile = mergePdf(pdfFileList);
        File mergedPdfFile = commonService.mergePdf("PDFTEMP", (File[])pdfFileList.toArray(new File[0]));
        // UT304 MULTI LABEL MOD END

        return mergedPdfFile;
    }

    // --------------------------------- Internal method ---------------------------------
    // --------------------------------- 内部メソッド --------------------------------- 

    // --------------------------------- CML Register screen Register ---------------------------------
    // --------------------------------- CML Register画面 Register ---------------------------------
    /**
     * CML Register screen Register / A MAIN MARK (CML No.) is published.
     * <br />CML Register画面 Register / メインマーク(CML No.)を発行します。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param whCd W/H CD<br />倉庫コード
     * @return It publishes and is a MAIN MARK.<br />発行しメインマーク
     * @throws ApplicationException When a MAIN MARK is not able to be published<br />メインマークが発行できなかった場合
     */
    protected String getMainMark(String shipperCd, String whCd) throws ApplicationException {

        // The time zone converted date of Shipper is acquired (time is omission).
        // Shipperのタイムゾーン変換日付を取得 (時刻は切り捨て)
        Date sysdate = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));
        String ymd = DateUtil.formatDate(sysdate, "yyMMdd");
        
        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String mainMarkSeqKey = String.format("%s%s%s%s", "D", shipperCd, whCd, ymd.substring(1));

        // Consecutive acquisition
        // 連番の取得
        String mainMarkSeq = commonService.transactSequence(mainMarkSeqKey, SEQ_TYP_CML_NO_DN, 1, SCREEN_ID_W2009).get(0);
        
        // Return of a MAIN MARK
        // メインマークの返却
        String mainMark = mainMarkSeqKey + mainMarkSeq;
        
        return mainMark;
    }

    /**
     * CML Register screen Register / The mortgage of a firm order receipt, and update of a firm-order-receipt information
     * <br />CML Register画面 Register / 確定受注の引き当てと確定受注情報の更新
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param twPltzItemItemNoList The list of Palletize Items<br />パレタイズ対象品のリスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @param w2012List Search-results list<br />検索結果一覧
     * @param errorMessages Error message list<br />エラーメッセージリスト
     * @return Ordering information list<br />受注情報リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected List<TtPltzItemOdrDomain>  updateTtExpRcvOdrOnRegister(W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList, String mainMark,
        List<W2009CmlItemDomain> w2012List, List<MessageDomain> errorMessages) throws ApplicationException {
        
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            // No Action
            // 処理なし
            return null;
        }
        
        // Search condition of Export-Receive-Order information (information setting of all the record commons)
        // 輸出受注情報の検索条件(全レコード共通の情報設定)
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd(criteria.getShipperCd());
        ttExpRcvOdrCriteria.setCustomerCd(criteria.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(criteria.getLgcyShipTo());
        ttExpRcvOdrCriteria.setTrnsCd(criteria.getTrnsCd());
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
        ttExpRcvOdrCriteria.setShippedTyp("1");
        ttExpRcvOdrCriteria.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");
        
        // Palletize Item Receive Order
        // パレタイズ対象品受注情報
        List<TtPltzItemOdrDomain> pltzItemOdrList = new ArrayList<TtPltzItemOdrDomain>();
        
        // - 5.1.Mortgage of firm order receipt
        //   - A part for the number of cases of cmlItemDomainList of {@link W2009CmlItemDomain} and the following are repeated.
        // - 5.1.確定受注の引き当て
        //   - {@link W2009CmlItemDomain}のcmlItemDomainListの件数分、以下を繰り返す
        for (int i = 0 ; i < twPltzItemItemNoList.size(); i++) {
            TwPltzItemItemNoDomain domain = twPltzItemItemNoList.get(i);
            if (FLAG_N.equals(domain.getMixTagFlg())) {
                
                // The search condition of each line is set up.
                // 各行の検索条件を設定
                ttExpRcvOdrCriteria.setItemNo(domain.getPltzItemNo());
                ttExpRcvOdrCriteria.setPkgCd(domain.getPkgCd());

                // Search of an Export Receive Order (lock)
                // 輸出受注の検索 (ロック)
                List<? extends TtExpRcvOdrDomain> ttExpRcvOdrList = w2009CmlDao.lockTtExpRcvOdr(ttExpRcvOdrCriteria);
                
                // A setting of ALLOC QUANTITY (remaining)
                // 引当数量(残)の設定
                BigDecimal qty = domain.getQty();

                // This is an alloc from a part for the past.
                // 過去分より引当
                for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){
                    // Calculation of a Shipment remaining
                    // 出荷残の算出
                    BigDecimal restQty = ttExpRcvOdr.getOdrQty().subtract(ttExpRcvOdr.getPltzAllocQty());

                    // Determination of an ALLOC QUANTITY
                    // 引当数量の決定
                    BigDecimal allocQty = BigDecimal.ZERO;
                    if (0 < qty.compareTo(restQty)) {
                        allocQty = restQty;
                    } else {
                        allocQty = qty;
                    }

                    // The update of ALLOC QUANTITY (remaining)
                    // 引当数量(残)の更新
                    qty = qty.subtract(allocQty);
                    
                    // A setting of INSTRUCTION QUANTITY, and a SHIPPED TYPE
                    // 梱包指示数量、出荷済み区分の設定
                    ttExpRcvOdr.setPltzAllocQty(ttExpRcvOdr.getPltzAllocQty().add(allocQty));
                    if (ttExpRcvOdr.getOdrQty().compareTo(ttExpRcvOdr.getPltzAllocQty()) == 0) {
                        ttExpRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
                    }
                    
                    // Setting of a common column
                    // 共通カラムの設定
                    commonService.setCommonPropertyForUpdate(ttExpRcvOdr, SCREEN_ID_W2012);
                    
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
                    
                    // An export information is set to Palletize-Item-Receive-Order domain.
                    // パレタイズ対象品受注情報ドメインに輸出情報をセット
                    TtPltzItemOdrDomain ttPltzItemOdrDomain = new TtPltzItemOdrDomain();
                    ttPltzItemOdrDomain.setMainMark(mainMark);
                    ttPltzItemOdrDomain.setBrch(domain.getBrch());
                    CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdrDomain, ttExpRcvOdr);
                    commonService.setCommonPropertyForRegist(ttPltzItemOdrDomain, SCREEN_ID_W2012);

                    // Setting of an ALLOC QUANTITY
                    // 引当数量の設定
                    ttPltzItemOdrDomain.setAllocQty(allocQty);

                    // - 5.2.Palletize-Item-Receive-Order registration
                    // - 5.2.パレタイズ対象品受注情報登録
                    ttPltzItemOdrService.create(ttPltzItemOdrDomain);
                    
                    // 2015/11/25 update
                    ttPltzItemOdrDomain.setAllocQty(ttExpRcvOdr.getPltzAllocQty());
                    
                    // It sets to Palletize-Instruction-Receive-Order list.
                    // 梱包指示品目番号受注情報リストにセット
                    pltzItemOdrList.add(ttPltzItemOdrDomain);
                    
                    // When ALLOC QUANTITY (remaining) does not remain
                    // 引当数量(残)が残っていない場合
                    if (qty.compareTo(BigDecimal.ZERO) == 0) {
                        break;
                    }
                }
                
                // When ALLOC QUANTITY (remaining) remains
                // 引当数量(残)が残っている場合
                if (0 < qty.compareTo(BigDecimal.ZERO)) {
                    for (int n = 0; n < w2012List.size(); n++) {
                        if (domain.getPltzItemNo().equals(w2012List.get(n).getPltzItemNo()) && domain.getPkgCd().equals(w2012List.get(n).getPkgCd())) {
                            MessageDomain message = new MessageDomain("listDomainList[" + String.valueOf(n) + "].qty", NXS_E7_0089, new String[] {domain.getPltzItemNo()});
                            errorMessages.add(message);
                        }
                    }
                }
            }
        }
        
        if (errorMessages.size() > 0) {
            return null;
        }
        
        return pltzItemOdrList;
    }
    
    /**
     * CML Register screen Register / Palletize-Instruction-Receive-Order alloc
     * <br />CML Register画面 Register / 梱包指示品目番号受注情報引当
     *
     * @param criteria Search condition<br />検索条件
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @param w2012List Search-results list<br />検索結果一覧
     * @param errorMessages Error message<br />エラーメッセージ
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrOdrOnRegister(
        W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList, String mainMark,
        List<W2009CmlItemDomain> w2012List, List<MessageDomain> errorMessages) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            // No Action
            // 処理なし
            return;
        }
        
        // 6.1.Palletize-Instruction-Receive-Order alloc
        // Search condition of Palletize Instruction Receive Order (information setting of all the record commons)
        // 6.1.梱包指示品目番号受注情報引当
        // 梱包指示品目番号受注情報の検索条件(全レコード共通の情報設定)
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(criteria.getPltzInstrNo());
        ttPltzInstrOdrCriteria.setPackedFlg("N");
        ttPltzInstrOdrCriteria.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");
        
        // Palletize Item Receive Order
        // パレタイズ対象品受注情報
        List<TtPltzItemOdrDomain> pltzItemOdrList = new ArrayList<TtPltzItemOdrDomain>();

        for (int i = 0; i < twPltzItemItemNoList.size(); i++) {
        
            // An Alloc QTY is drawn and updated from the data of 1 watch past.
            // 一番過去のデータより梱包引当数量を引き当て更新する
            TwPltzItemItemNoDomain domain = twPltzItemItemNoList.get(i);
            ttPltzInstrOdrCriteria.setItemNo(domain.getPltzItemNo());
            ttPltzInstrOdrCriteria.setPkgCd(domain.getPkgCd());

            // Search of a Palletize Instruction Receive Order (lock)
            // 梱包指示品目番号受注情報の検索 (ロック)
            List<? extends TtPltzInstrOdrDomain> ttPltzInstrOdrList = w2009CmlDao.lockTtPltzInstrOrd(ttPltzInstrOdrCriteria);
            
            // A setting of ALLOC QUANTITY (remaining)
            // 引当数量(残)の設定
            BigDecimal qty = domain.getQty();

            // This is an alloc from a part for the past.
            // 過去分より引当
            for (TtPltzInstrOdrDomain ttPltzInstrOdr : ttPltzInstrOdrList){
                // Calculation of a Shipment remaining
                // 出荷残の算出
                BigDecimal restQty = ttPltzInstrOdr.getAllocQty().subtract(ttPltzInstrOdr.getPackedQty());

                // Determination of an ALLOC QUANTITY
                // 引当数量の決定
                BigDecimal packedQty = BigDecimal.ZERO;
                if (0 < qty.compareTo(restQty)) {
                    packedQty = restQty;
                } else {
                    packedQty = qty;
                }

                // The update of ALLOC QUANTITY (remaining)
                // 引当数量(残)の更新
                qty = qty.subtract(packedQty);
                
                // Setting of update values
                // 更新値の設定
                BigDecimal  newPackedQty = ttPltzInstrOdr.getPackedQty().add(packedQty);
                ttPltzInstrOdr.setPackedQty(newPackedQty);
                if (ttPltzInstrOdr.getAllocQty().compareTo(newPackedQty) == 0) {
                    ttPltzInstrOdr.setPackedFlg(FLAG_Y);
                }
                
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttPltzInstrOdr, SCREEN_ID_W2012);

                // Update of a Palletize Instruction Receive Order
                // 梱包指示品目番号受注情報の更新
                ttPltzInstrOdrService.update(ttPltzInstrOdr);
                
                // An export information is set to Palletize-Item-Receive-Order domain.
                // パレタイズ対象品受注情報ドメインに輸出情報をセット
                TtPltzItemOdrDomain ttPltzItemOdrDomain = new TtPltzItemOdrDomain();
                ttPltzItemOdrDomain.setMainMark(mainMark);
                ttPltzItemOdrDomain.setBrch(domain.getBrch());
                CommonUtil.copyPropertiesDomainToDomain(ttPltzItemOdrDomain, ttPltzInstrOdr);
                commonService.setCommonPropertyForRegist(ttPltzItemOdrDomain, SCREEN_ID_W2012);

                // Setting of an ALLOC QUANTITY
                // 引当数量の設定
                ttPltzItemOdrDomain.setAllocQty(packedQty);
                
                // It sets to Palletize-Instruction-Receive-Order list.
                // 梱包指示品目番号受注情報リストにセット
                pltzItemOdrList.add(ttPltzItemOdrDomain);
                
                // When ALLOC QUANTITY (remaining) does not remain
                // 引当数量(残)が残っていない場合
                if (qty.compareTo(BigDecimal.ZERO) == 0) {
                    break;
                }
            }
            
            // When ALLOC QUANTITY (remaining) remains
            // 引当数量(残)が残っている場合
            if (0 < qty.compareTo(BigDecimal.ZERO)) {
                for (int n = 0; n < w2012List.size(); n++) {
                    if (domain.getPltzItemNo().equals(w2012List.get(n).getPltzItemNo()) && domain.getPkgCd().equals(w2012List.get(n).getPkgCd())) {
                        MessageDomain message = new MessageDomain("listDomainList[" + String.valueOf(n) + "].qty", NXS_E7_0090, new String[] {domain.getPltzItemNo()});
                        errorMessages.add(message);
                    }
                }
            }
        }
        
        // 6.2.Registration of Palletize Item Receive Order
        // drawn Palletize-Instruction-Item-No information is registered into a Palletize Item Receive Order.
        // 6.2.パレタイズ対象品受注情報の登録
        // 引き当てた梱包指示品目番号情報をパレタイズ対象品受注情報に登録する。
        if (pltzItemOdrList.size() > 0) {
            ttPltzItemOdrService.create(pltzItemOdrList);
        }
    }
    
    /**
     * Registration of CML Register screen Register / Palletize-Item order number (copy registration of an order received of finishing [ tag / MIX / an alloc ])
     * <br />CML Register画面 Register / パレタイズ対象品受注番号の登録(MIXタグに引当済みの受注のコピー登録) 
     *
     * @param criteria Search condition<br />検索条件
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void registTtPltzItemOdrOnRegisterForMixTag(
        W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList, String mainMark) throws ApplicationException {
        
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            // No Action
            // 処理なし
            return;
        }
        // The following processings are performed to all the records of MixTagFlg ="Y" in the record acquired by 3.1.
        // 3.1で取得したレコードの中で MixTagFlg = "Y" の全てのレコードに対して以下の処理を行う
        List<TtPltzItemOdrDomain> ttPltzItemOdrList = new ArrayList<TtPltzItemOdrDomain>();
        
        for (TwPltzItemItemNoDomain twPltzItemItemNoDomain : twPltzItemItemNoList) {
            if (FLAG_Y.equals(twPltzItemItemNoDomain.getMixTagFlg())) {
                TtMixtagOdrCriteriaDomain ttMixtagOdrCriteria = new TtMixtagOdrCriteriaDomain();
                ttMixtagOdrCriteria.setMixTagNo(twPltzItemItemNoDomain.getMixTagNo());
                ttMixtagOdrCriteria.setItemNo(twPltzItemItemNoDomain.getPltzItemNo());
                ttMixtagOdrCriteria.setPkgCd(twPltzItemItemNoDomain.getPkgCd());
                // 7.1.Acquisition of Mix Tag Receive Order
                // 7.1.MIXED品目番号受注情報の取得
                List<TtMixtagOdrDomain> ttMixtagOdrDomainList = ttMixtagOdrService.searchByCondition(ttMixtagOdrCriteria);
                for (TtMixtagOdrDomain ttMixtagOdrDomain : ttMixtagOdrDomainList) {
                    TtPltzItemOdrDomain ttPltzInstrOdr = new TtPltzItemOdrDomain();
                    CommonUtil.copyPropertiesDomainToDomain(ttPltzInstrOdr, ttMixtagOdrDomain);
                    
                    // Setting of a common column
                    // 共通カラムの設定
                    commonService.setCommonPropertyForRegist(ttPltzInstrOdr, SCREEN_ID_W2012);
                    ttPltzInstrOdr.setMainMark(mainMark);
                    ttPltzInstrOdr.setBrch(twPltzItemItemNoDomain.getBrch());
                    
                    // It adds to the list for registration.
                    // 登録用リストに追加
                    ttPltzItemOdrList.add(ttPltzInstrOdr);
                }
            }
        }
        
        // 7.3.Registration of Palletize Item Receive Order
        // 7.3.パレタイズ対象品受注情報の登録
        if (ttPltzItemOdrList.size() > 0) {
            ttPltzItemOdrService.create(ttPltzItemOdrList);
        }
    }
    
    /**
     * CML Register screen Register / Palletize data is registered.
     * <br />CML Register画面 Register / パレタイズデータを登録
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @param twPltzItemPkgList Palletize-Item PKG list<br />パレタイズ対象品PKGリスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void registTtPltzOnRegister(W2009CmlCriteriaDomain criteria, List<TwPltzItemItemNoDomain> twPltzItemItemNoList,
        List<TwPltzItemPkgDomain> twPltzItemPkgList,
        String mainMark) throws ApplicationException {
        
        // 8.1.The unit of WEIGHT, a VOLUME, and length is acquired.
        // 8.1.重量・容積・長さの単位を取得
        String volumeUnit = commonService.searchVolumeUnit(criteria.getShipperCd());
        String weightUnit = commonService.searchWeightUnit(criteria.getShipperCd());
        String lengthUnit = commonService.searchLengthUnit(criteria.getShipperCd());
        
        // 2.3.9
        // 2.3.9 より
        String shipToCd = criteria.getWkPltzShipToCode();
        // 2.3.10
        // 2.3.10 より
        String consigneeCd = criteria.getWkPltzConsigneeCd();
        
        // 
        BigDecimal length = BigDecimal.ZERO;
        BigDecimal width = BigDecimal.ZERO;
        BigDecimal height = BigDecimal.ZERO;
        BigDecimal volume = BigDecimal.ZERO;
        
        if (!CheckUtil.isBlankOrNull(criteria.getOuterPkgCd())) {
            // 2.3.11
            if (lengthUnit.equals(criteria.getWkLengthUnit())) {
                length = criteria.getWkLength();
                width = criteria.getWkWidth();
                height = criteria.getWkHeight();
            } else {
                Object[] paramsLength = { commonService.getResource(criteria.getLocale(), "label.length") };
                Object[] paramsWidth = { commonService.getResource(criteria.getLocale(), "label.width") };
                Object[] paramsHeight = { commonService.getResource(criteria.getLocale(), "label.height") };
                length = convertLengthUnit(criteria.getWkLength(), criteria.getWkLengthUnit(), lengthUnit, paramsLength);
                width = convertLengthUnit(criteria.getWkWidth(), criteria.getWkLengthUnit(), lengthUnit, paramsWidth);
                height = convertLengthUnit(criteria.getWkHeight(), criteria.getWkLengthUnit(), lengthUnit, paramsHeight);
            }
            
            if (volumeUnit.equals(criteria.getWkVolumeUnit())){
                volume = criteria.getWkVolume();
            } else {
                Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
                volume = convertVolumeUnit(criteria.getWkVolume(), criteria.getWkVolumeUnit(), volumeUnit, params);
            }
        } else {
            if (!FLAG_Y.equals(criteria.getManualRegFlg())) {
                // 2.3.12
                if (lengthUnit.equals(criteria.getWkLengthUnit())) {
                    length = criteria.getWkLengthPalletize();
                    width = criteria.getWkWidthPalletize();
                    height = criteria.getWkHeightPalletize();
                } else {
                    Object[] paramsLength = { commonService.getResource(criteria.getLocale(), "label.length") };
                    Object[] paramsWidth = { commonService.getResource(criteria.getLocale(), "label.width") };
                    Object[] paramsHeight = { commonService.getResource(criteria.getLocale(), "label.height") };
                    length = convertLengthUnit(criteria.getWkLengthPalletize(), criteria.getWkLengthUnit(), lengthUnit, paramsLength);
                    width = convertLengthUnit(criteria.getWkWidthPalletize(), criteria.getWkLengthUnit(), lengthUnit, paramsWidth);
                    height = convertLengthUnit(criteria.getWkHeightPalletize(), criteria.getWkLengthUnit(), lengthUnit, paramsHeight);
                }
                
                if (volumeUnit.equals(criteria.getWkVolumeUnit())){
                    volume = criteria.getWkVolumePalletize();
                } else {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.volume") };
                    volume = convertVolumeUnit(criteria.getWkVolumePalletize(), criteria.getWkVolumeUnit(), volumeUnit, params);
                }

            // UT110 TRIAL SHIPMENT/号試品対応 ADD
            // In the case of manual registration, No unit conversion.
            // マニュアル登録の場合単位変換なし
            } else {
                length = criteria.getLength();
                width = criteria.getWidth();
                height = criteria.getHeight();
                volume = criteria.getVolume();
            }
        }

        String plantCd = twPltzItemItemNoList.get(0).getPlntCd();
        String expLimitFlg = FLAG_N;
        String dngrItemFlg = FLAG_N;
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            if (plantCd != null && !plantCd.equals(domain.getPlntCd())) {
                plantCd = null;
            }
            if (!CheckUtil.isBlankOrNull(domain.getExpLimitTyp())) {
                expLimitFlg = FLAG_Y;
            }
            
            if (FLAG_Y.equals(domain.getDngrItemFlg())) {
                dngrItemFlg = FLAG_Y;
            }
        }
        
        String rtUseFlg = FLAG_N;
        for (TwPltzItemPkgDomain domain : twPltzItemPkgList) {
            if (FLAG_Y.equals(domain.getRtFlg())) {
                rtUseFlg = FLAG_Y;
                break;
            }
        }
        
        String loadingCd = LOADING_CD_FREE;
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            // This is B if the number of the things of B is also one.
            // Bのものが、1件でもあればB
            if (LOADING_CD_BACK.equals(domain.getLoadingCd())) {
                loadingCd = LOADING_CD_BACK;
                break;
            }
        }
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            // This is D if the number of the things of D is also one.
            // Dのものが、1件でもあればD
            if (LOADING_CD_DOOR.equals(domain.getLoadingCd())) {
                loadingCd = LOADING_CD_DOOR;
                break;
            }
        }

        // The system date of Shipper is acquired (time is omission).
        // Shipperのシステム日付を取得 (時刻は切り捨て)
        String timezoneId = commonService.searchTimezone(criteria.getShipperCd());
        Date expPackingDt = DateUtil.convertTime(new Date(), timezoneId);
        expPackingDt = DateUtils.truncate(expPackingDt, Calendar.DAY_OF_MONTH);
        
        // 8.2.Acquisition of palette No
        // 8.2.パレットNoの取得
        // UT420 MOD START
        int next = 1;
        // If instruction packing, It will be the serial number in the palletize instruction number.
        // 指示梱包では梱包指示番号内で連番とする。
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            String result = w2009CmlDao.searchTtPltzByPalletNo(criteria);
            if (StringUtils.isNumeric(result)) {
                next = Integer.parseInt(result) + 1;
            }
        }
        String palletNo = criteria.getPalletCartonTyp() + String.format("%03d", next);
        // UT420 MOD END
        
        // 8.3.Acquisition of DUE DATE
        // 8.3.納期の取得
        Date etdDueDate = w2009CmlDao.searchTtPltzItemOdrByPalletNo(criteria);

        // 8.4.registration processing (Palletize)
        // 8.4.登録処理(パレタイズ)
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        
        // Setting of a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttPltzDomain, SCREEN_ID_W2012);
        
        TwPltzItemItemNoDomain twItemDomain = twPltzItemItemNoList.get(0);
        
        // Setting of a registration item
        // 登録項目の設定
        ttPltzDomain.setMainMark(mainMark);
        ttPltzDomain.setPalletNo(palletNo);
        ttPltzDomain.setShipperCd(criteria.getShipperCd());
        ttPltzDomain.setShipToCd(shipToCd);
        ttPltzDomain.setCustomerCd(criteria.getCustomerCd());
        ttPltzDomain.setLgcyShipTo(criteria.getLgcyShipTo());
        ttPltzDomain.setTrnsCd(criteria.getTrnsCd());
        ttPltzDomain.setTrnsCdOrg(criteria.getTrnsCd());
        ttPltzDomain.setReviseFlg(FLAG_N);
        ttPltzDomain.setPlntCd(plantCd);
        ttPltzDomain.setLgcyWhCd(criteria.getLgcyWhCd());
        ttPltzDomain.setCurLgcyWhCd(criteria.getLgcyWhCd());
        ttPltzDomain.setPkgFormTyp(twItemDomain.getPkgFormTyp());
        ttPltzDomain.setInvoiceKey(twItemDomain.getInvoiceKey());
        ttPltzDomain.setContainerSortingKey(twItemDomain.getContainerSortingKey());
        ttPltzDomain.setContainerLooseTyp(twItemDomain.getContainerLooseTyp());
        ttPltzDomain.setReturnStyleCd("");
        ttPltzDomain.setVariantFlg(FLAG_N);
        ttPltzDomain.setRtUseFlg(rtUseFlg);
        ttPltzDomain.setWeightUnit(weightUnit);
        ttPltzDomain.setNetWeight(criteria.getNetWeight());
        ttPltzDomain.setGrossWeight(criteria.getGrossWeight());
        ttPltzDomain.setLengthUnit(lengthUnit);
        ttPltzDomain.setLength(length);
        ttPltzDomain.setWidth(width);
        ttPltzDomain.setHeight(height);
        ttPltzDomain.setVolumeUnit(volumeUnit);
        ttPltzDomain.setVolume(volume);
        ttPltzDomain.setSupplierMainMark("");
        ttPltzDomain.setCmlTyp("1");
        ttPltzDomain.setOuterPkgCd(criteria.getOuterPkgCd());
        ttPltzDomain.setExpPackingDt(expPackingDt);
        ttPltzDomain.setExpPackingIssuerId(criteria.getLoginUserDscId());
        ttPltzDomain.setExpPackingIssuerNm(criteria.getUsrNmEn());
        ttPltzDomain.setDueDt(etdDueDate);
        ttPltzDomain.setStgInstrItemFlg(twItemDomain.getStgInstrItemFlg());
        ttPltzDomain.setConsigneeCd(consigneeCd);
        ttPltzDomain.setCommercialFlg(FLAG_Y);
        ttPltzDomain.setTradeTerms("");
        ttPltzDomain.setCurrCd(twItemDomain.getCurrCd());
        ttPltzDomain.setPltzStatus("10");
        ttPltzDomain.setPackingWhCompCd(criteria.getPackingWhCompCd());
        ttPltzDomain.setPackingWhCd(criteria.getPackingWhCd());
        ttPltzDomain.setCurWhCompCd(criteria.getPackingWhCompCd());
        ttPltzDomain.setCurWhCd(criteria.getPackingWhCd());
        ttPltzDomain.setXmainMark("");
        ttPltzDomain.setInvoiceNo("");
        ttPltzDomain.setInvoiceIssueDt(null);
        ttPltzDomain.setLoadingCd(loadingCd);
        ttPltzDomain.setSiteTyp("");
        ttPltzDomain.setExpLimitFlg(expLimitFlg);
        ttPltzDomain.setDngrItemFlg(dngrItemFlg);
        ttPltzDomain.setStgInstrNo("");
        ttPltzDomain.setStgActNo("");
        ttPltzDomain.setShippingFirmNo("");
        ttPltzDomain.setCustomTimingTyp(twItemDomain.getCustomTimingTyp());
        ttPltzDomain.setLastTrStatus("10");
        ttPltzDomain.setLastTrRcvDt(null);
        ttPltzDomain.setPltzInstrNo(criteria.getPltzInstrNo());
        ttPltzDomain.setExpRequestNo("");
        ttPltzDomain.setExpRequestAllCmlIssuedFlg(FLAG_N);
        ttPltzDomain.setSplitShippingNgFlg(FLAG_N);
        ttPltzDomain.setShipperCompNmAbb("");
        ttPltzDomain.setShipperCompNm1("");
        ttPltzDomain.setShipperCompNm2("");
        ttPltzDomain.setShipperCompAddr1("");
        ttPltzDomain.setShipperCompAddr2("");
        ttPltzDomain.setShipperCompAddr3("");
        ttPltzDomain.setShipperCompAddr4("");
        ttPltzDomain.setShipperCompTel("");
        ttPltzDomain.setShipperCompFax("");
        ttPltzDomain.setConsigneeCompNm1("");
        ttPltzDomain.setConsigneeCompNm2("");
        ttPltzDomain.setConsigneeCompAddr1("");
        ttPltzDomain.setConsigneeCompAddr2("");
        ttPltzDomain.setConsigneeCompAddr3("");
        ttPltzDomain.setConsigneeCompAddr4("");
        ttPltzDomain.setConsigneeCompTel("");
        ttPltzDomain.setConsigneeCompFax("");
        ttPltzDomain.setConsigneeAttn("");
        ttPltzDomain.setShipToNm1("");
        ttPltzDomain.setShipToNm2("");
        ttPltzDomain.setShipToAddr1("");
        ttPltzDomain.setShipToAddr2("");
        ttPltzDomain.setShipToAddr3("");
        ttPltzDomain.setShipToAddr4("");
        ttPltzDomain.setShipToTel("");
        ttPltzDomain.setInvoiceCtgry("C");
        ttPltzDomain.setPriceTerms("");
        ttPltzDomain.setTermsPoint("");
        ttPltzDomain.setPayTerms("");
        ttPltzDomain.setPayMeth("");
        ttPltzDomain.setReExpGoodsFlg(FLAG_N);
        ttPltzDomain.setSupplierInvoiceNo("");
        ttPltzDomain.setImpInvoiceNo1("");
        ttPltzDomain.setImpInvoiceNo2("");
        ttPltzDomain.setFreightResponsibleCd("");
        ttPltzDomain.setMigrationFlg(FLAG_N);
        ttPltzDomain.setOldQrMixTyp("");
        ttPltzDomain.setOldQrContainerGrpCd("");
        ttPltzDomain.setPalletCartonTyp(criteria.getPalletCartonTyp()); // UT420 ADD
        
        // Registration processing
        // 登録処理
        ttPltzService.create(ttPltzDomain);
    }
    
    /**
     * Registration of CML Register screen Register / Palletize-Item data
     * <br />CML Register画面 Register / パレタイズ対象品データの登録
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @param twPltzItemPkgList Palletize-Item PKG list<br />パレタイズ対象品PKGリスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void registTtPltzItemOnRegister(W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList,
        List<TwPltzItemPkgDomain> twPltzItemPkgList, String mainMark) throws ApplicationException {
        
        List<TtPltzItemDomain> registList = new ArrayList<TtPltzItemDomain>();
        
        // Registration of items
        // 品目の登録
        BigDecimal brch = BigDecimal.ZERO;
        if (twPltzItemItemNoList.size() > 0) {
            for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
                TtPltzItemDomain regDomain = new TtPltzItemDomain();
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                regDomain.setMainMark(mainMark);
                regDomain.setBrch(domain.getBrch());
                regDomain.setPltzItemNo(domain.getPltzItemNo());
                regDomain.setPkgCd(domain.getPkgCd());
                regDomain.setItemDescription(domain.getItemDescription());
                regDomain.setQty(domain.getQty());
                regDomain.setQtyUnit(domain.getQtyUnit());
                regDomain.setTagQty(domain.getTagQty());
                regDomain.setItemTyp("");
                regDomain.setNetWeight(domain.getNetWeight());
                regDomain.setItemWeight(domain.getItemWeight());
                regDomain.setWeightUnit(domain.getWeightUnit());
                regDomain.setShippingLot(domain.getShippingLot());
                regDomain.setPkgTyp("");
                regDomain.setModelCd("");
                regDomain.setExpLimitTyp(domain.getExpLimitTyp());
                regDomain.setDngrItemFlg(domain.getDngrItemFlg());
                regDomain.setOriginCntryCd(domain.getOriginCntryCd());
                regDomain.setCurrCd(domain.getCurrCd());
                regDomain.setPlntCd(domain.getPlntCd());
                regDomain.setRtFlg(FLAG_N);
                regDomain.setKitFlg(FLAG_N);
                regDomain.setExpRequestNo("");
                regDomain.setLineNo(null);
                regDomain.setKitBrch(null);
                regDomain.setMixTagNo(domain.getMixTagNo());
                regDomain.setPltzInstrNo(criteria.getPltzInstrNo());
                regDomain.setParFlg(FLAG_Y);
                regDomain.setKitParItemNo(domain.getPltzItemNo());
                regDomain.setCustomerPoNo("");
                regDomain.setCustomerItemNo("");
                regDomain.setUnitPrice(null);
                regDomain.setHsCd("");
                regDomain.setInputMethTyp("");
                registList.add(regDomain);
                
                brch = brch.max(domain.getBrch());
            }
        }
        
        // Registration of a Packing material
        // 包装材の登録
        
        if (twPltzItemPkgList.size() > 0) {
            for (TwPltzItemPkgDomain domain : twPltzItemPkgList) {
                TtPltzItemDomain regDomain = new TtPltzItemDomain();

                commonService.setCommonPropertyForRegist(regDomain, SCREEN_ID_W2012);
                
                brch = brch.add(new BigDecimal(1));
                
                regDomain.setMainMark(mainMark);
                regDomain.setBrch(brch);
                regDomain.setPltzItemNo(domain.getPltzItemNo());
                regDomain.setPkgCd(" ");
                regDomain.setItemDescription(domain.getItemDescription());
                regDomain.setQty(domain.getQty());
                regDomain.setQtyUnit(QTY_UNIT_EA);
                regDomain.setTagQty(null);
                regDomain.setItemTyp("3");
                regDomain.setNetWeight(domain.getNetWeight());
                regDomain.setItemWeight(domain.getPkgWeight());
                regDomain.setWeightUnit(domain.getWeightUnit());
                regDomain.setShippingLot(null);
                regDomain.setPkgTyp(domain.getPkgTyp());
                regDomain.setModelCd(domain.getModelCd());
                regDomain.setExpLimitTyp("");
                regDomain.setDngrItemFlg(FLAG_N);
                regDomain.setOriginCntryCd(domain.getOriginCntryCd());
                regDomain.setCurrCd(domain.getCurrCd());
                regDomain.setPlntCd("");
                regDomain.setRtFlg(domain.getRtFlg());
                regDomain.setKitFlg(FLAG_N);
                regDomain.setExpRequestNo("");
                regDomain.setLineNo(null);
                regDomain.setKitBrch(null);
                regDomain.setMixTagNo(domain.getMixTagNo());
                regDomain.setPltzInstrNo(criteria.getPltzInstrNo());
                regDomain.setParFlg(FLAG_Y);
                regDomain.setKitParItemNo(domain.getPltzItemNo());
                regDomain.setCustomerPoNo("");
                regDomain.setCustomerItemNo("");
                regDomain.setUnitPrice(null);
                regDomain.setHsCd("");
                regDomain.setInputMethTyp(domain.getInputMethTyp());

                registList.add(regDomain);
            }
        }
        // Registration
        // 登録
        if (registList.size() > 0) {
            ttPltzItemService.create(registList);
        }
        
    }
    
    /**
     * CML Register screen Register / Packaging Instruction (=Pull) update process
     * <br />CML Register画面 Register / 梱包指示更新処理
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrOnRegister(W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList) throws ApplicationException {
        
        // It carries out, only when Palletize Instr. No. is specified.
        // 梱包指示Noが指定されている場合のみ実施
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        // 10.Packaging Instruction (=Pull) update process
        // update of the QUANTITY packed [ 10.1. ] up
        // 10.梱包指示更新処理
        // 10.1.梱包済み数量更新
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteriaDomain = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteriaDomain.setPltzInstrNo(criteria.getPltzInstrNo());
        
        if (twPltzItemItemNoList.size() > 0) {
            for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
                ttPltzInstrItemNoCriteriaDomain.setItemNo(domain.getPltzItemNo());
                ttPltzInstrItemNoCriteriaDomain.setPkgCd(domain.getPkgCd());
                TtPltzInstrItemNoDomain updateDomain =  ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteriaDomain);
                
                commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
                updateDomain.setPackedQty(updateDomain.getPackedQty().add(domain.getQty()));
                ttPltzInstrItemNoService.update(updateDomain);
            }
        }
        
        // 10.2.update of PALLETIZE INSTRUCTION STATUS
        // 10.2.梱包指示ステータス更新
        W2009CmlCriteriaDomain updCriteria = new W2009CmlCriteriaDomain();
        updCriteria.setPltzInstrNo(criteria.getPltzItemNo());
        commonService.setCommonPropertyForUpdate(updCriteria, SCREEN_ID_W2012);
        w2009CmlDao.updateTtPltzInstrStatusByPltzInstrNo(criteria);
    }
    
    /**
     * CML Register screen Register/MIXED thing information update processing
     * <br />CML Register画面 Register / MIXED現品情報更新処理
     *
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrForMixTagOnRegister(
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList) throws ApplicationException {
        
        List<String> updatedMixTagNos = new ArrayList<String>();
        List<TtMixtagDomain> updateDomainList = new ArrayList<TtMixtagDomain>();
        List<TtMixtagCriteriaDomain> criteriaDomainList = new ArrayList<TtMixtagCriteriaDomain>();
        
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            if (FLAG_Y.equals(domain.getMixTagFlg())) {
                if (!updatedMixTagNos.contains(domain.getMixTagNo())) {
                    updatedMixTagNos.add(domain.getMixTagNo());
                    // Setting of update values
                    // 更新値の設定
                    TtMixtagDomain upDomain = new TtMixtagDomain();
                    commonService.setCommonPropertyForUpdate(upDomain, SCREEN_ID_W2012);
                    upDomain.setMixTagStatus(MIX_TAG_STATUS_CML);
                    // Setting of update conditions
                    // 更新条件の設定
                    TtMixtagCriteriaDomain upCriteriaDomain = new TtMixtagCriteriaDomain();
                    upCriteriaDomain.setMixTagNo(domain.getMixTagNo());
                    
                    updateDomainList.add(upDomain);
                    criteriaDomainList.add(upCriteriaDomain);
                }
            }
        }
        
        // Update
        // 更新
        if (updateDomainList.size() > 0) {
            ttMixtagService.updateByCondition(updateDomainList, criteriaDomainList);
        }
        
    }
    
    /**
     * CML Register screen Register / A Temp Stock is updated and registered.
     * <br />CML Register画面 Register / 仮在庫を更新・登録する
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateAndRegistTtTmpStockOnRegister(W2009CmlCriteriaDomain criteria,
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList) throws ApplicationException {
        
        // It carries out, only when this is not Packaging Instruction (=Pull).
        // 梱包指示でない場合のみ実施
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        TtTmpStockCriteriaDomain ttTmpStockCriteriaDomain = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteriaDomain.setShipperCd(criteria.getShipperCd());
        ttTmpStockCriteriaDomain.setLgcyWhCd(criteria.getLgcyWhCd());
        
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            if (FLAG_N.equals(domain.getMixTagFlg())) {
                // 12.1.Acquisition of Temp Stock
                // 12.2.2.The judgment of registration update processing of Temp Stock
                // 12.1.仮在庫の取得
                // 12.2.2.仮在庫の登録更新処理の判定
                ttTmpStockCriteriaDomain.setItemNo(domain.getPltzItemNo());
                ttTmpStockCriteriaDomain.setPkgCd(domain.getPkgCd());
                TtTmpStockDomain stockDom = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteriaDomain);
                
                if (stockDom != null) {
                    // 12.2.3.The update process of Temp Stock
                    // When data is able to be acquired by 12.2.2
                    // 12.2.3.仮在庫の更新処理
                    // 12.2.2 でデータが取得できた場合
                    commonService.setCommonPropertyForUpdate(stockDom, SCREEN_ID_W2012);
                    stockDom.setQty(stockDom.getQty().add(domain.getQty()));
                    ttTmpStockService.update(stockDom);
                } else {
                    // 12.2.4.Registration processing of Temp Stock
                    // When data is not able to be acquired by 12.2.2
                    // 12.2.4.仮在庫の登録処理
                    // 12.2.2 でデータが取得できなかった場合
                    TtTmpStockDomain newStockDom = new TtTmpStockDomain();
                    CommonUtil.copyPropertiesDomainToDomain(newStockDom, ttTmpStockCriteriaDomain);
                    commonService.setCommonPropertyForRegist(newStockDom, SCREEN_ID_W2012);
                    newStockDom.setQty(domain.getQty());
                    ttTmpStockService.create(newStockDom);
                }
            }
        }
    }
    
    /**
     * This is registration of a link KANBAN information to CML Register screen Register/MIXTAG.
     * <br />CML Register画面 Register / MIXTAGに紐づくかんばん情報の登録
     *
     * @param twPltzItemItemNoList Palletize-Item list<br />パレタイズ対象品リスト
     * @param mainMark MAIN MARK<br />メインマーク
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void registTtPltzKanbanForMixtagOnRegister(
        List<TwPltzItemItemNoDomain> twPltzItemItemNoList, String mainMark) throws ApplicationException {
        // Acquisition of an information
        // 情報の取得
        TtMixKanbanCriteriaDomain ttMixKanbanCriteriaDomain = new TtMixKanbanCriteriaDomain();
        
        List<TtPltzKanbanDomain> createList = new ArrayList<TtPltzKanbanDomain>();
        
        for (TwPltzItemItemNoDomain domain : twPltzItemItemNoList) {
            if (FLAG_Y.equals(domain.getMixTagFlg())) {
                ttMixKanbanCriteriaDomain.setMixTagNo(domain.getMixTagNo());
                ttMixKanbanCriteriaDomain.setItemNo(domain.getPltzItemNo());
                ttMixKanbanCriteriaDomain.setPkgCd(domain.getPkgCd());
                
                List<? extends TtMixKanbanDomain> ttMixKanbanDomainList = ttMixKanbanService.searchByCondition(ttMixKanbanCriteriaDomain);
                if (ttMixKanbanDomainList.size() > 0) {

                    for (TtMixKanbanDomain ttMixKanbanDomain : ttMixKanbanDomainList) {
                        TtPltzKanbanDomain regDomamin = new TtPltzKanbanDomain();
                        CommonUtil.copyPropertiesDomainToDomain(regDomamin, ttMixKanbanDomain);
                        commonService.setCommonPropertyForRegist(regDomamin, SCREEN_ID_W2012);
                        regDomamin.setMainMark(mainMark);
                        regDomamin.setBrch(domain.getBrch());
                        createList.add(regDomamin);
                    }
                }
            }
        }
        // Registration of Palletize Item KANBAN
        // パレタイズ対象品かんばん情報の登録
        if (createList.size() > 0) {
            ttPltzKanbanService.create(createList);
        }
    }
    
    /**
     * CML Register screen Register / Delete of a work information
     * <br />CML Register画面 Register / ワーク情報の削除
     *
     * @param loginUserDscId A login user's DSC-ID<br />ログインユーザのDSC-ID
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void dleteWkTablesOnRegist(String loginUserDscId) throws ApplicationException {
        // 14.1.Palletize-Item-Work delete
        // 14.1.パレタイズ対象品ワーク削除
        TwPltzItemItemNoCriteriaDomain twPltzItemItemNoCriteriaDomain = new TwPltzItemItemNoCriteriaDomain();
        twPltzItemItemNoCriteriaDomain.setDscId(loginUserDscId);
        twPltzItemItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        int count = twPltzItemItemNoService.searchCount(twPltzItemItemNoCriteriaDomain);
        if (count > 0 ) {
            twPltzItemItemNoService.deleteByCondition(twPltzItemItemNoCriteriaDomain);
        }

        // 14.2.Palletize-Item-Package-Work delete
        // 14.2.パレタイズ対象品PKGワーク削除
        TwPltzItemPkgCriteriaDomain twPltzItemPkgCriteriaDomain = new TwPltzItemPkgCriteriaDomain();
        twPltzItemPkgCriteriaDomain.setDscId(loginUserDscId);
        twPltzItemPkgCriteriaDomain.setSearchCountCheckFlg(false);
        count = twPltzItemPkgService.searchCount(twPltzItemPkgCriteriaDomain);
        if (count > 0 ) {
            twPltzItemPkgService.deleteByCondition(twPltzItemPkgCriteriaDomain);
        }
    }
    
    /**
     * CML Register screen Register / Registration of an ordering mortgage track record
     * <br />CML Register画面 Register / 受注引き当て実績の登録
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzInstrItemListForCigma The elegance list for a Packaging Instruction (=Pull)<br />梱包指示対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void registRevOdeAllocOnRegister(W2009CmlCriteriaDomain criteria,
        List<TtPltzItemOdrDomain> pltzInstrItemListForCigma) throws ApplicationException {
        
        // This is a No Action when Palletize Instr. No. . is "."
        // 梱包指示No.が""の場合は、処理なし
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        // The following processings are performed only when there is Palletize Instr. No. .
        // 梱包指示No.がある場合のみ以下の処理を行う。
        String shipperCd = criteria.getShipperCd();
        String nightFlg = commonService.searchCigmaNightFlg(shipperCd);
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // List create of an ordering information
        // 受注情報のリスト作成
        List<Ws2005ParamItemDomain> detailList = new ArrayList<Ws2005ParamItemDomain>();
        for (TtPltzItemOdrDomain domain : pltzInstrItemListForCigma ) {
            Ws2005ParamItemDomain item = new Ws2005ParamItemDomain();

            item.setCustomerNo(domain.getCustomerCd());
            item.setShipTo(domain.getLgcyShipTo());
            item.setPN(domain.getItemNo());
            item.setTransWayCd(domain.getTrnsCd());
            item.setEtdDueDt(df.format(domain.getEtdDueDt()));
            item.setCustomerPoNo(domain.getCustomerPoNo());
            item.setCustomerPn(domain.getCustomerItemNo());
            item.setOdrCtrlNo(String.valueOf(domain.getOdrCtrlNo()));
            item.setCustomerPnOrg(domain.getCustomerItemNoOrg());
            item.setShipInstrAllocQty(domain.getAllocQty().toPlainString());
            detailList.add(item);
        }
        
        // An ordering information is set to Ws2005ParamDomain.
        // Ws2005ParamDomain に受注情報を設定
        Ws2005ParamDomain ws2005ParamDomain = new Ws2005ParamDomain();
        ws2005ParamDomain.setDetailList(detailList);
        
        // Web service call
        // Webサービス呼出し
        ResultDomain wsResultDomain = ws2005RestService.createRcvOdrAlloc(shipperCd, nightFlg, ws2005ParamDomain);
        if (WS_RESULT_ERROR.equals(wsResultDomain.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        }

    }
    
    // --------------------------------- CML Register screen Cancel ---------------------------------
    // --------------------------------- CML Register画面 Cancel ---------------------------------
    
    /**
     * CML Register screen Cancel / Cancellation of an ordering alloc
     * <br />CML Register画面 Cancel / 受注引当のキャンセル
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     * @return Ordering information list<br />受注情報リスト
     */
    protected List<? extends W2009CmlPltzItemOdrDomain> updateTtExpRcvOdrOnRegisterCancel(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        List<? extends W2009CmlPltzItemOdrDomain> pltzItemOdrList = new ArrayList<W2009CmlPltzItemOdrDomain>();
        
        // It carries out, only when this is not Packaging Instruction (=Pull).
        // 梱包指示でない場合のみ実施
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return pltzItemOdrList;
        }
        
        // 3.1.A target is acquired from Palletize Item Receive Order.
        // 3.1.パレタイズ対象品受注情報から対象を取得
        pltzItemOdrList = w2009CmlDao.searchTtPltzItemOdr(criteria);
        
        // 3.2.the number of orders received is returned.
        // 3.2.受注数を戻す
        for (W2009CmlPltzItemOdrDomain domain : pltzItemOdrList) {
            TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttExpRcvOdrCriteria, domain);
            TtExpRcvOdrDomain updateDomain = ttExpRcvOdrService.lockByKeyNoWait(ttExpRcvOdrCriteria);
            updateDomain.setPltzAllocQty(updateDomain.getPltzAllocQty().subtract(domain.getAllocQty()));
            updateDomain.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
            commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
            ttExpRcvOdrService.update(updateDomain);
            domain.setPltzAllocQty(updateDomain.getPltzAllocQty());
        }
        return pltzItemOdrList;
    }
    
    /**
     * CML Register screen Cancel / Palletize-Instruction-Item-No ordering alloc cancellation
     * <br />CML Register画面 Cancel / 梱包指示品目番号受注引当キャンセル
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrOdrOnRegisterCancel(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }

        // 4.1.A target is acquired from Palletize Item Receive Order.
        // 4.1.パレタイズ対象品受注情報から対象を取得
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(criteria.getMainMark());
        ttPltzItemOdrCriteria
            .setPreferredOrder("RCV_ODR_COMP_CD, CUSTOMER_CD, LGCY_SHIP_TO, ITEM_NO, PKG_CD, "
                + "TRNS_CD, ETD_DUE_DT, CUSTOMER_PO_NO, CUSTOMER_ITEM_NO, CUSTOMER_ITEM_NO_ORG, ODR_CTRL_NO");
        List<TtPltzItemOdrDomain> ttPltzItemOdrList = ttPltzItemOdrService.searchByCondition(ttPltzItemOdrCriteria);
        
        // number packed [ 4.2. ] up is returned.
        // 4.2.梱包済数を戻す
        for (TtPltzItemOdrDomain domain : ttPltzItemOdrList) {
            TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(ttPltzInstrOdrCriteria, domain);
            ttPltzInstrOdrCriteria.setPltzInstrNo(criteria.getPltzInstrNo());
            TtPltzInstrOdrDomain updateDomain = ttPltzInstrOdrService.lockByKeyNoWait(ttPltzInstrOdrCriteria);
            updateDomain.setPltzInstrNo(criteria.getPltzInstrNo());
            updateDomain.setPackedFlg(FLAG_N);
            updateDomain.setPackedQty(updateDomain.getPackedQty().subtract(domain.getAllocQty()));
            commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
            ttPltzInstrOdrService.update(updateDomain);
        }
    }
    
    /**
     * CML Register screen Cancel / Update of a PACKED QUANTITY
     * <br />CML Register画面 Cancel / 梱包済数量の更新
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzItemList Palletize Item<br />パレタイズ対象品
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrItemNoOnRegisterCancel(
        W2009CmlCriteriaDomain criteria,
        List<? extends W2009CmlItemDomain> pltzItemList) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }

        for (W2009CmlItemDomain domain : pltzItemList) {
            TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
            ttPltzInstrItemNoCriteria.setPltzInstrNo(criteria.getPltzInstrNo());
            ttPltzInstrItemNoCriteria.setItemNo(domain.getPltzItemNo());
            ttPltzInstrItemNoCriteria.setPkgCd(domain.getPkgCd());
            TtPltzInstrItemNoDomain updateDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
            updateDomain.setPackedQty(updateDomain.getPackedQty().subtract(domain.getQty()));
            commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
            ttPltzInstrItemNoService.update(updateDomain);
        }
    }
    
    /**
     * The update of CML Register screen Cancel / PALLETIZE INSTRUCTION STATUS
     * <br />CML Register画面 Cancel / 梱包指示ステータスの更新
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtPltzInstrOnRegisterCancel(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        
        if (CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        int sumPackedQty = w2009CmlDao.searchTtPltzInstrItemNoByPltzInstrNo(criteria);
        
        TtPltzInstrCriteriaDomain ttPltzInstrCriteriaDomain = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteriaDomain.setPltzInstrNo(criteria.getPltzInstrNo());
        TtPltzInstrDomain domain = ttPltzInstrService.searchByKey(ttPltzInstrCriteriaDomain);
        commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W2012);

        if (sumPackedQty == 0) {
            domain.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        } else {
            domain.setPltzInstrStatus(PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE);
        }
        
        ttPltzInstrService.update(domain);
    }
    
    /**
     * CML Register screen Cancel / Update of a Multiple Item No. in 1Box PKG number Status
     * <br />CML Register画面 Cancel / 小箱内多品番ステータスの更新
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzItemList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtMixtagrOnRegisterCancel(
        W2009CmlCriteriaDomain criteria,
        List<? extends W2009CmlItemDomain> pltzItemList) throws ApplicationException {
        
        List<String> updateMixTagNos = new ArrayList<String>();
        List<TtMixtagDomain> updateList = new ArrayList<TtMixtagDomain>();
        for (W2009CmlItemDomain domain : pltzItemList) {
            if (!CheckUtil.isBlankOrNull(domain.getMixTagNo())) {
                if (!updateMixTagNos.contains(domain.getMixTagNo())) {
 
                    TtMixtagCriteriaDomain ttMixtagCriteriaDomain = new TtMixtagCriteriaDomain();
                    ttMixtagCriteriaDomain.setMixTagNo(domain.getMixTagNo());
                    TtMixtagDomain updateDomain = ttMixtagService.lockByKeyNoWait(ttMixtagCriteriaDomain);
                    updateDomain.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
                    commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
                    updateList.add(updateDomain);
                    
                    updateMixTagNos.add(domain.getMixTagNo());
                }
            }
        }
        // Update
        // 更新
        if (updateList.size() > 0) {
            ttMixtagService.update(updateList);
        }
    }
    
    /**
     * CML Register screen Cancel / Update of a Temp Stock
     * <br />CML Register画面 Cancel / 仮在庫の更新
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzItemList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void updateTtTmpStockOnRegisterCancel(
        W2009CmlCriteriaDomain criteria,
        List<? extends W2009CmlItemDomain> pltzItemList) throws ApplicationException {
        
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        for (W2009CmlItemDomain domain : pltzItemList) {
            if (CheckUtil.isBlankOrNull(domain.getMixTagNo())) {
                
                TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
                ttTmpStockCriteria.setShipperCd(criteria.getShipperCd());
                ttTmpStockCriteria.setLgcyWhCd(criteria.getLgcyWhCd());
                ttTmpStockCriteria.setItemNo(domain.getPltzItemNo());
                ttTmpStockCriteria.setPkgCd(domain.getPkgCd());
                
                TtTmpStockDomain updateDomain = ttTmpStockService.lockByKeyNoWait(ttTmpStockCriteria);
                updateDomain.setQty(updateDomain.getQty().subtract(domain.getQty()));
                commonService.setCommonPropertyForUpdate(updateDomain, SCREEN_ID_W2012);
                ttTmpStockService.update(updateDomain);
                
            }
        }
    }
    
    /**
     * CML Register screen Cancel / Delete of Palletize data
     * <br />CML Register画面 Cancel / パレタイズデータの削除
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzItemList Palletize-Item list<br />パレタイズ対象品リスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void deletePltzInfoOnRegisterCancel(
        W2009CmlCriteriaDomain criteria,
        List<? extends W2009CmlItemDomain> pltzItemList) throws ApplicationException {
        String mainMark = criteria.getMainMark();
        boolean searchCountCheckFlg = false;
        // 10.1.Palletize delete
        // 10.1.パレタイズ削除
        TtPltzCriteriaDomain tTpltzCriteria = new TtPltzCriteriaDomain();
        tTpltzCriteria.setMainMark(mainMark);
        tTpltzCriteria.setSearchCountCheckFlg(searchCountCheckFlg);
        int count = ttPltzService.searchCount(tTpltzCriteria);
        if (count > 0) {
            ttPltzService.deleteByCondition(tTpltzCriteria);
        }
        // 10.2.Palletize-Item delete
        // 10.2.パレタイズ対象品削除
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(searchCountCheckFlg);
        count = ttPltzItemService.searchCount(ttPltzItemCriteria);
        if (count > 0) {
            ttPltzItemService.deleteByCondition(ttPltzItemCriteria);
        }
        
        // 10.3.A delete of Palletize Item Receive Order
        // 10.3.パレタイズ対象品受注情報の削除
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(searchCountCheckFlg);
        count = ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria);
        if (count > 0) {
            ttPltzItemOdrService.deleteByCondition(ttPltzItemOdrCriteria);
        }
        
        // 10.4.A delete of Palletize Item KANBAN
        // 10.4.パレタイズ対象品かんばん情報の削除
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(searchCountCheckFlg);
        count = ttPltzKanbanService.searchCount(ttPltzKanbanCriteria);
        if (count > 0) {
            ttPltzKanbanService.deleteByCondition(ttPltzKanbanCriteria);
        }
    }
    
    /**
     * CML Register screen Cancel / Registration of an ordering alloc track record (starting of Web service)
     * <br />CML Register画面 Cancel / 受注引当実績の登録(Webサービスの起動)
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param pltzItemOdrList Ordering information domain list<br />受注情報ドメインリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    protected void cancelWsRcvOdrAllocOnRegisterCancel(
        W2009CmlCriteriaDomain criteria,
        List<? extends W2009CmlPltzItemOdrDomain> pltzItemOdrList) throws ApplicationException {
        
        if (!CheckUtil.isBlankOrNull(criteria.getPltzInstrNo())) {
            return;
        }
        
        String shipperCd = criteria.getShipperCd();
        String nightFlg = commonService.searchCigmaNightFlg(shipperCd);
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // List create of an ordering information
        // 受注情報のリスト作成
        List<Ws2005ParamItemDomain> detailList = new ArrayList<Ws2005ParamItemDomain>();
        for (W2009CmlPltzItemOdrDomain domain : pltzItemOdrList ) {
            Ws2005ParamItemDomain item = new Ws2005ParamItemDomain();

            item.setCustomerNo(domain.getCustomerCd());
            item.setShipTo(domain.getLgcyShipTo());
            item.setPN(domain.getItemNo());
            item.setTransWayCd(domain.getTrnsCd());
            item.setEtdDueDt(df.format(domain.getEtdDueDt()));
            item.setCustomerPoNo(domain.getCustomerPoNo());
            item.setCustomerPn(domain.getCustomerItemNo());
            item.setOdrCtrlNo(String.valueOf(domain.getOdrCtrlNo()));
            item.setCustomerPnOrg(domain.getCustomerItemNoOrg());
            item.setShipInstrAllocQty(domain.getPltzAllocQty().toPlainString());
            detailList.add(item);
        }
        
        // An ordering information is set to Ws2005ParamDomain.
        // Ws2005ParamDomain に受注情報を設定
        Ws2005ParamDomain ws2005ParamDomain = new Ws2005ParamDomain();
        ws2005ParamDomain.setDetailList(detailList);
        
        // Web service call
        // Webサービス呼出し
        ResultDomain wsResultDomain = ws2005RestService.createRcvOdrAlloc(shipperCd, nightFlg, ws2005ParamDomain);
        if (WS_RESULT_ERROR.equals(wsResultDomain.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        }
    }

    /**
     * Conversion unit (volume)
     * <br />単位変換(容量)
     *
     * @param value original volume<br />容量
     * @param fromUnitCd original volume unit<br />元の容量単位
     * @param toUnitCd new volume unit<br />変換したい容量単位
     * @param params Parameters for the error message<br />エラーメッセージ用のパラメータ
     * @return the volume which is converted<br />単位変換後の容量
     * @throws ApplicationException Error in the case of the conversion failed<br />変換に失敗した場合
     */
    protected BigDecimal convertVolumeUnit(BigDecimal value, String fromUnitCd, String toUnitCd, Object[] params) throws ApplicationException {
        
        BigDecimal result = commonService.convertVolumeUnit(value, fromUnitCd, toUnitCd);
        if (result == null) {
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        return result;
    }
    

    /**
     * Conversion unit (weight)
     * <br />単位変換(重量)
     *
     * @param value original weight<br />元の重量
     * @param fromUnitCd original weight unit<br />元の重量単位
     * @param toUnitCd new weight unit<br />変換したい重量単位
     * @return the weight which is converted<br />単位変換後の重量
     * @param params Parameters for the error message<br />エラーメッセージ用のパラメータ
     * @throws ApplicationException Error in the case of the conversion failed<br />変換に失敗した場合
     */
    protected BigDecimal convertWeightUnit(BigDecimal value, String fromUnitCd, String toUnitCd, Object[] params) throws ApplicationException {
        
        BigDecimal result = commonService.convertWeightUnit(value, fromUnitCd, toUnitCd);
        if (result == null) {
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        return result;
    }
    
    /**
     * Conversion unit (length)
     * <br />単位変換(長さ)
     *
     * @param value original length<br />長さ
     * @param fromUnitCd original length unit<br />元の長さ単位
     * @param toUnitCd new length unit<br />変換したい長さ単位
     * @return the length which is converted<br />単位変換後の長さ
     * @param params Parameters for the error message<br />エラーメッセージ用のパラメータ
     * @throws ApplicationException Error in the case of the conversion failed<br />変換に失敗した場合
     */
    protected BigDecimal convertLengthUnit(BigDecimal value, String fromUnitCd, String toUnitCd, Object[] params) throws ApplicationException{
        
        BigDecimal result = commonService.convertLengthUnit(value, fromUnitCd, toUnitCd);
        if (result == null) {
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        return result;
    }

// UT304 MULTI LABEL DEL START
//    /**
//     * merge PDF file<br />
//     * PDFファイル連結。
//     *
//     * UT414 ADD
//     *
//     * @param pdfFileList PDF files for merge/連結するPDFファイル
//     * @return path of the PDF file/PDFファイル
//     * @throws ApplicationException business exception/業務例外
//     */
//    protected File mergePdf(List<File> pdfFileList) throws ApplicationException {
//
//        if (pdfFileList.size() == 0) {
//            return null;
//        }
//
//        List<InputStream> pdfInputStreamList = new ArrayList<InputStream>();
//        try {
//            for (File pdfFile : pdfFileList) {
//                try {
//                    pdfInputStreamList.add(new FileInputStream(pdfFile));
//                } catch (Exception e) {
//                    throw new SystemException(NXS_91_0001, e);
//                }
//            }
//            File mergedPdfFile
//                = commonService.mergePdf("PDFTEMP", (InputStream[])pdfInputStreamList.toArray(new InputStream[0]));
//            return mergedPdfFile;
//
//        } finally {
//            for (InputStream pdfInputStream : pdfInputStreamList) {
//                try {
//                    pdfInputStream.close();
//                } catch (Exception e) {}
//            }
//        }
//    }
// UT304 MULTI LABEL DEL END
}
