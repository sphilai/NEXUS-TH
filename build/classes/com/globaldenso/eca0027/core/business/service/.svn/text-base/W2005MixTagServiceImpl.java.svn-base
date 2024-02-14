/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CURRENCY_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DEFAULT_BOX_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0049;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_ORDER_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_MIX_TAG_ITEM_NO_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagService;
import com.globaldenso.eca0027.core.business.dao.W2005MixTagDao;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2002ReportCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of Multiple Item No. in 1Box PKG service.
 * <br />小箱内多品サービスの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13648 $
 */
public class W2005MixTagServiceImpl implements W2005MixTagService  {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected TtPltzInstrService ttPltzInstrService;
    
    /**
     * Mix-Tag service
     * <br />MIXED現品票サービス
     */
    protected TtMixtagService ttMixtagService;
    
    /**
     * MIXED-ITEM-NO service
     * <br />MIXED品目番号サービス
     */
    protected TtMixtagItemNoService ttMixtagItemNoService;
    
    /**
     * Mix-Tag-Receive-Order service
     * <br />MIXED品目番号受注情報サービス
     */
    protected TtMixtagOdrService ttMixtagOdrService;
    
    /**
     * Mix-Tag-RT service
     * <br />MIXED用RT材サービス
     */
    protected TtMixtagRtService ttMixtagRtService;
    
    /**
     * Mix-Tag-Item-No work service
     * <br />MIXED品番ワークサービス
     */
    protected TwMixtagService twMixtagService;
    
    /**
     * Mix-Tag-RT-Work service
     * <br />MIXED用RT材ワークサービス
     */
    protected TwMixtagRtService twMixtagRtService;
    
    /**
     * PKG-Materials-MA service
     * <br />包装材原単位サービス
     */
    protected TmPkgMtrlService tmPkgMtrlService;
    
    /**
     * CIGMA-Warehouse-Cross-Reference-Master service
     * <br />倉庫クロスリファレンス原単位サービス
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;
    
    /**
     * Measure Unit Master/Measure Unit Master   Service
     * <br />Measure Unit Master/計量単位原単位 サービス
     */
    protected TmMeasureUnitService tmMeasureUnitService;
    
    /**
     * Export-Receive-Order service
     * <br />輸出受注サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;
    
    /**
     * Temp-Stock service
     * <br />仮在庫サービス
     */
    protected TtTmpStockService ttTmpStockService;
    
    /**
     * MIX article KANBAN service
     * <br />MIX品かんばんサービス
     */
    protected TtMixKanbanService ttMixKanbanService;
    
    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * List service (L2002)  
     * <br />帳票サービス (L2002)
     */
    protected L2002ReportService l2002ReportService;
    
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
     * Multiple Item No. in 1Box PKG DAO
     * <br />小箱内多品DAO
     */
    protected W2005MixTagDao w2005MixTagDao;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W2005MixTagServiceImpl() {
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
     * Setter method for ttPltzInstrService.
     *
     * @param ttPltzInstrService Set for ttPltzInstrService
     */
    public void setTtPltzInstrService(TtPltzInstrService ttPltzInstrService) {
        this.ttPltzInstrService = ttPltzInstrService;
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
     * Setter method for ttMixtagOdrService.
     *
     * @param ttMixtagOdrService Set for ttMixtagOdrService
     */
    public void setTtMixtagOdrService(TtMixtagOdrService ttMixtagOdrService) {
        this.ttMixtagOdrService = ttMixtagOdrService;
    }

    /**
     * Setter method for ttMixtagRtService.
     *
     * @param ttMixtagRtService Set for ttMixtagRtService
     */
    public void setTtMixtagRtService(TtMixtagRtService ttMixtagRtService) {
        this.ttMixtagRtService = ttMixtagRtService;
    }

    /**
     * Setter method for twMixtagService.
     *
     * @param twMixtagService Set for twMixtagService
     */
    public void setTwMixtagService(TwMixtagService twMixtagService) {
        this.twMixtagService = twMixtagService;
    }

    /**
     * Setter method for twMixtagRtService.
     *
     * @param twMixtagRtService Set for twMixtagRtService
     */
    public void setTwMixtagRtService(TwMixtagRtService twMixtagRtService) {
        this.twMixtagRtService = twMixtagRtService;
    }

    /**
     * Setter method for tmPkgMtrlService.
     *
     * @param tmPkgMtrlService Set for tmPkgMtrlService
     */
    public void setTmPkgMtrlService(TmPkgMtrlService tmPkgMtrlService) {
        this.tmPkgMtrlService = tmPkgMtrlService;
    }

    /**
     * Setter method for tmCigmaWhXrefService.
     *
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * Setter method for tmMeasureUnitService.
     *
     * @param tmMeasureUnitService Set for tmMeasureUnitService
     */
    public void setTmMeasureUnitService(TmMeasureUnitService tmMeasureUnitService) {
        this.tmMeasureUnitService = tmMeasureUnitService;
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
     * Setter method for ttTmpStockService.
     *
     * @param ttTmpStockService Set for ttTmpStockService
     */
    public void setTtTmpStockService(TtTmpStockService ttTmpStockService) {
        this.ttTmpStockService = ttTmpStockService;
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for l2002ReportService.
     *
     * @param reportService Set for l2002ReportService
     */
    public void setL2002ReportService(L2002ReportService reportService) {
        l2002ReportService = reportService;
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
     * Setter method for w2005MixTagDao.
     *
     * @param mixTagDao Set for w2005MixTagDao
     */
    public void setW2005MixTagDao(W2005MixTagDao mixTagDao) {
        w2005MixTagDao = mixTagDao;
    }

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyFmIssueDateToIssueDate(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String dateFormat,
        String fromDate, String toDate) {

        // Correlation check of a MixTag creation date (FROM-TO) (common specifications [No10])  
        // MixTag作成日(FROM-TO)の相関チェック (共通仕様【No10】)
        return commonService.validateFromToDate(dateFormat, fromDate, toDate);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyQty(java.math.BigDecimal)
     */
    public boolean validateConsistencyQty(BigDecimal qty) {
        
        // QUANTITY check QTY < the case of 1 error (00 and 000 grades regard it as 0)
        // 数量チェック QTY <  1の場合 (00、000等は0とみなす)エラー
        if (qty != null) {
            if (qty.intValue() < 1) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyAllSame(java.util.List)
     */
    public boolean validateConsistencyAllSame(List<String> inputList) {
        
        // This is confirmed whether all the selected data are the same.
        // 選択された全データが同一かどうかチェックする
        if (inputList != null && inputList.size() > 0) {
            String pre = "";
            boolean isCheck = false;
            for (String inputStr : inputList) {
                // It checks henceforth [ 2 line ].
                // 2行目以降でチェックを実施する
                if (pre != null){
                    if (isCheck && !pre.equals(inputStr)) {
                        return false;
                    }
                }else{
                    if (isCheck && null != inputStr) {
                        return false;
                    }
                }
                isCheck = true;
                pre = inputStr;
            }
        }
        
        return true;
        
    }
        
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyBlankOrNull(java.lang.String)
     */
    public boolean validateConsistencyBlankOrNull(String input) {
        
        // In input value ="", an error is made.
        // 入力値 = "" の場合はエラー
        if (CheckUtil.isBlankOrNull(input)) {
            return false;
        }
        
        return true;
        
    }
        
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyCurrencyCdQtyUnitPlantCd(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyCurrencyCdQtyUnitPlantCd(String currencycd, String qtyunit, String plantcd) {
        
        // CIGMA information acquisition check   A CURRENCY CODE, a QUANTITY UNIT, PLANT CODE   When "" exists in either   Error
        // CIGMA情報取得チェック 通貨コード、数量単位、製造部工場区分 のいずれかに""が存在する場合 エラー
        if (CheckUtil.isBlankOrNull(currencycd) || CheckUtil.isBlankOrNull(qtyunit) || CheckUtil.isBlankOrNull(plantcd)) {
            return false;
        }
        
        return true;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyInstrQtyInstrPKGedQtyOver(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyInstrQtyInstrPKGedQtyOver(String pltzInstrNo, 
        BigDecimal actualPkgQty, BigDecimal instrQty, BigDecimal instrPkgedQty) {
        
        // (when a Palletize Instr. No. is inputted (when this is a Packaging Instruction (=Pull)))  
        // (梱包指示Noが入力された場合(梱包指示の場合))
        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
            // directions over check    QUANTITY > (number packed [ number of Packaging Instruction (=Pull)s -  ] up) a case -- error
            // 指示超えチェック  数量 > (梱包指示数 - 梱包済数) の場合エラー
            if (actualPkgQty != null && instrQty != null && instrPkgedQty != null) {
                // It checks in QUANTITY > (number packed [ number of Packaging Instruction (=Pull)s -  ] up).
                // 数量 > (梱包指示数 - 梱包済数)かチェック
                if (actualPkgQty.compareTo(instrQty.subtract(instrPkgedQty)) > 0) {
                    return false;
                }
            }
        }

        return true;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyLdCd(java.util.List)
     */
    public boolean validateConsistencyLdCd(List<String> ldCdList) {
        
        // loading position code check
        // An error is made when "D" (Door) and "B" (Back) are intermingled in selected loading position code of all the data (*"F" (Free) can be intermingled [ other CDs and ]).  
        // 荷積み位置コードチェック
        //  選択された全データの荷積み位置コードに"D"（Door）と"B"（Back）が混在している場合エラー(※"F"（Free）は他コードと混在可)
        if (ldCdList != null && ldCdList.size() > 0) {
            if (ldCdList.contains(LOADING_CD_DOOR) && ldCdList.contains(LOADING_CD_BACK)) {
                return false;
            }
        }
        
        return true;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyOrderQtyOver(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyOrderQtyOver(BigDecimal actualPkgQty, BigDecimal orderQty) {
        
        // order over check   QUANTITY > the number of Export-Receive-Order orders a case error
        // オーダー超えチェック 数量 > 輸出受注オーダー数 の場合エラー
        if (actualPkgQty != null && orderQty != null) {
            if (actualPkgQty.compareTo(orderQty) > 0) {
                return false;
            }
        }

        return true;

    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyPakageItemNo(java.util.Map, java.util.List)
     */
    public boolean validateConsistencyPakageItemNo(Map<Integer, String> pakageItemNoMap, List<Integer> pkgItemList) {
        // Unique check ofPacking material    When a same ITEM NO exists in inputted Pakage Item No.   Error
        // 包装材のユニークチェック  入力したPakage Item No.に同じ品番が存在する場合 エラー
        HashSet<String> set = new HashSet<String>();
        HashSet<String> valueList = new HashSet<String>();        
        
        if (pakageItemNoMap != null && pakageItemNoMap.size() > 0) {

            for (String val : pakageItemNoMap.values()) {

                // When same ITEM NO exists   Error
                // 同じ品番が存在する場合 エラー
                if (set.contains(val)) {
                    valueList.add(val);
                }else{
                    set.add(val);
                }    
            }

            if(!valueList.isEmpty()){
                for(String value : valueList){
                    for(Map.Entry<Integer, String> map : pakageItemNoMap.entrySet()) {
                        int indexNo = map.getKey();
                        String pkgItemNo = map.getValue();
                        if (value.equals(pkgItemNo)) {
                            pkgItemList.add(indexNo);
                        }
                    }
                }   
            }
        }
        
        if(0 < pkgItemList.size()){
            return false;
        }
        return true;       
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyPkgIp(java.lang.String)
     */
    public boolean validateConsistencyPkgIp(String pkgIp) {
        
        // An error is made when Mix Tag RT does not exist.
        // MIXED用RT材が存在しない場合エラー
        if (FLAG_N.equals(pkgIp)) {
            return false;
        }
        return true;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyPltzTargetRecordActualTagQty(int, java.math.BigDecimal)
     */
    public boolean validateConsistencyPltzTargetRecordActualTagQty(int count, BigDecimal actualTagQty) {
        
        // The minimum PKG check
        // PKG object record = in the case of one affair and Actual Tag QTY < 2, an error is made.
        // 最小梱包チェック
        // 梱包対象レコード = 1件かつActual Tag QTY < 2の場合エラー
        if(actualTagQty != null){
            if (count == 1 && actualTagQty.intValue() < 2) {
                return false;
            }
        }
        return true;
        
    }
        
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyShipLotOver(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyShipLotOver(BigDecimal actualPkgQty, BigDecimal actualTagQty, BigDecimal shipLot) {
        
        // SHIPPING-LOT over check (QUANTITY/TAG QUANTITY) > SHIPPING LOT   a case -- error
        // 出荷ロット超えチェック (数量 / タグ数) > 出荷ロット の場合エラー
        if (actualPkgQty != null && actualTagQty != null && shipLot != null) {
            if (actualTagQty.intValue() == 0) {
                return false;
            } else {
                if (actualPkgQty.divide(actualTagQty, 1, BigDecimal.ROUND_UP).compareTo(shipLot) > 0) { // ST980 MOD
                    return false;
                }
            }
        }            
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateConsistencyWarningFlgIgnoreWarnings(java.util.List, java.lang.String)
     */
    public boolean validateConsistencyWarningFlgIgnoreWarnings(List<String> warningFlgList, String ignoreWarnings) {
        
        // At least one warningFlg ="1" of a Warning check check hidden item is contained, and this is ignore Warnings.
        // An error is made when there is no check in.
        // Warning確認チェック hidden項目のwarningFlg = "1" が1件でも含まれるかつ、ignore Warnings
        // にチェックがない場合はエラー
        if (warningFlgList != null && warningFlgList.contains(FLAG_ON)
            && (CheckUtil.isBlankOrNull(ignoreWarnings) || CHECK_OFF.equals(ignoreWarnings))) {
            return false;
        }
        return true;        
    }
    
    // --------------------------------- Database check method validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseCigmaAvailable(boolean, java.lang.String)
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException{
        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseCompWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException{
        return commonService.validateCompWh(compCd, whCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException{
        return commonService.validateShipper(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseShipperCustomerShipTo(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperCustomerShipTo(String lgcyLibCompCd, String customerCd, String lgcyShipToCd)
        throws ApplicationException{
        return commonService.validateShipperCustomerShipTo(lgcyLibCompCd, customerCd, lgcyShipToCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperPlantAuth(String shipperCd, String plntCd)
        throws ApplicationException{        
        return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2005R, shipperCd, plntCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseShipperWhPlant(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseShipperWhPlant(String lgcyLibCompCd, String lgcyWhCd, String plantCd)
        throws ApplicationException{
        return commonService.validateShipperWhPlant(lgcyLibCompCd, lgcyWhCd, plantCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String[], java.lang.String)
     */
    public boolean validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(
        String lgcyLibCompCd, String[] lgcyWhCd, String plntCd, String[] compCd, String[] whCd, String serverId)
        throws ApplicationException{
        
        // The NEXUS warehouse information acquisition check at the time of "CIGMA" selection
        // "CIGMA"選択時のNEXUS倉庫情報取得チェック
        if (CheckUtil.isBlankOrNull(compCd[0])) {
            // CIGMA Warehouse Cross Reference Master: A create of a search-condition domain
            // 倉庫クロスリファレンス原単位:検索条件ドメインの作成
            TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
            criteria.setLgcyLibCompCd(lgcyLibCompCd);
            criteria.setLgcyWhCd(lgcyWhCd[0]);
            criteria.setPlntCd(plntCd);
            // CIGMA Warehouse Cross Reference Master
            // 倉庫クロスリファレンス原単位
            TmCigmaWhXrefDomain tmCigmaWhXrefDomain = tmCigmaWhXrefService.searchByKey(criteria);
            // In the case of 0 affair
            // 0件の場合
            if (tmCigmaWhXrefDomain == null) {
                return false;
            }
            // acquired data is set up (for session storage).  
            // 取得データを設定(セッション保管用)
            compCd[0] = tmCigmaWhXrefDomain.getCompCd();
            whCd[0] = tmCigmaWhXrefDomain.getWhCd();
        } else {
            // The CIGMA warehouse information check at the time of "NEXUS" selection
            // "NEXUS"選択時のCIGMA倉庫情報チェック    
            W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
            
            // Authority information is acquired (update authority).  
            // 権限情報を取得(更新権限)
            List<? extends UserAuthDomain> userList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2005R);
            if (userAuthService.hasRegisterAll()) {
                userList = null;
            }
            criteria.setUserAuthList(userList);
            criteria.setCompCd(compCd[0]);
            criteria.setWhCd(whCd[0]);
            criteria.setShipperCd(lgcyLibCompCd);
            criteria.setServerId(serverId);
            // CIGMA Warehouse Cross Reference Master
            // 倉庫クロスリファレンス原単位
            List<? extends W2005MixTagDomain> list = w2005MixTagDao.searchTmCigmaWhXrefByAuth(criteria);
            // In the case of 0 affair
            // 0件の場合
            if (CollectionUtils.isEmpty(list)) {
                return false;
            }
            // The VALUE of leading record is set up (for session storage).  
            // 先頭レコードの値を設定(セッション保管用)
            lgcyWhCd[0] = list.get(0).getLgcyWhCd();
        }
        
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTmPkgMaterialsOnDetailSave(java.lang.String, java.lang.String, java.lang.String, TmPkgMtrlDomain)
     */
    public boolean validateDatabaseTmPkgMaterialsOnDetailSave(String ownerComp, String pkgItemNo, TmPkgMtrlDomain mtrlDomain)
        throws ApplicationException{
        // PKG Materials MA: A create of a search-condition domain
        // 包装材原単位:検索条件ドメインの作成
        TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
        criteria.setOwnerComp(ownerComp);
        criteria.setPkgItemNo(pkgItemNo);
        
        // PKG Materials MA
        // 包装材原単位
        TmPkgMtrlDomain tmPkgMtrlDomain = w2005MixTagDao.searchPkgMaterials(criteria);
        // In the case of 0 affair
        // 0件の場合
        if (tmPkgMtrlDomain == null) {
            return false;
        }
        // acquired contents are kept in a PKG-Materials-MA domain.
        // 取得した内容を包装材原単位ドメインに保管する
        CommonUtil.copyPropertiesDomainToDomain(mtrlDomain, tmPkgMtrlDomain);

        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtMixtagItemNoOnRegister(java.lang.String, java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTtMixtagItemNoOnRegister(String pltzInstrNo, String itemNo, String pkgCd, BigDecimal actualPkgQty, BigDecimal instrQty)
        throws ApplicationException{

        // Only when Packaging Instruction (=Pull) document No is set up
        // 梱包指示書Noが設定されてる場合のみ
        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
            
            // Create of a search-condition domain
            // 検索条件ドメインの作成
            W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);
            criteria.setPkgCd(pkgCd);
            criteria.setItemNo(itemNo);
            
            // Directions over check list
            // 指示超えチェックリスト
            List<? extends W2005MixTagItemDomain> qtyList = w2005MixTagDao.searchTtMixtagItemNoByActualQtyOver(criteria);
            for (W2005MixTagItemDomain w2005MixTagItemDomain : qtyList) {
                if ((instrQty.subtract(w2005MixTagItemDomain.getInstrPkgedQty()).subtract(w2005MixTagItemDomain.getQty())).compareTo(actualPkgQty) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtMixtagOnRegisterCancel(java.lang.String)
     */
    public String validateDatabaseTtMixtagOnRegisterCancel(String mixTagNo)
        throws ApplicationException{
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
        criteria.setMixTagNo(mixTagNo);
        // A lock is acquired.
        // ロックを取得
        TtMixtagDomain ttMixTag = ttMixtagService.lockByKeyNoWait(criteria);
        // Existence check
        // 存在チェック
        if (ttMixTag == null) {
            return GSCM_E0_0010;
        }
        
        String ttMixTagStatus = ttMixTag.getMixTagStatus();
        // In other than Status check 10:Issue Mix tag, an error is made.
        // ステータスチェック 10:Issue Mix tag以外の場合エラー
        if (!MIX_TAG_STATUS_MIXTAG.equals(ttMixTagStatus)) {
            return NXS_E1_0011;
        }
        return null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtPltzInstrOnRegister(java.lang.String)
     */
    public boolean validateDatabaseTtPltzInstrOnRegister(String pltzInstrNo)
        throws ApplicationException{
        
        if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
            // Create of a search-condition domain
            // 検索条件ドメインの作成
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);
            
            TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.lockByKeyNoWait(criteria);
            // In the case of 0 affair
            // 0件の場合
            if (ttPltzInstrDomain == null) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreate(W2005MixTagDomain, W2005MixTagCriteriaDomain)
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreate(W2005MixTagDomain mixTag, W2005MixTagCriteriaDomain mixTagCriteria)
        throws ApplicationException{

        // Only when Packaging Instruction (=Pull) document No is set up
        // 梱包指示書Noが設定されてる場合のみ
        if (!CheckUtil.isBlankOrNull(mixTagCriteria.getPltzInstrNo())) {
            // Packaging Instruction (=Pull), and CIGMA Warehouse Cross Reference Master's existence check
            // 梱包指示、倉庫クロスリファレンス原単位の存在チェック
            List<? extends W2005MixTagDomain> mixTaglist = w2005MixTagDao.searchTtPltzInstrOnHeaderMoveToCreate(mixTagCriteria);
            // An error is made if the number of corresponding data is zero.
            // 該当データが0件ならエラー
            if (CollectionUtils.isEmpty(mixTaglist)) {
                return false;
            }
            // It copies to Mix-Tag domain.
            // MIXED現品票ドメインへコピー
            CommonUtil.copyPropertiesDomainToDomain(mixTag, mixTaglist.get(0));
        }
        
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(java.lang.String)
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(String compCd) {
        
        // NEXUS warehouse information acquisition check
        // NEXUS倉庫情報取得チェック
        if (CheckUtil.isBlankOrNull(compCd)) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(java.lang.String)
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(String pltzInstrStatus) {
        
        // Check completed [ PKG ]
        // 梱包完了済みチェック
        if (PLTZ_INSTR_STATUS_ALL_CML_CREATE.equals(pltzInstrStatus) 
            || PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT.equals(pltzInstrStatus)) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(java.lang.String)
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(String pltzInstrStatus) {
        
        // Packaging Instruction (=Pull) document printing check
        // 梱包指示書印刷チェック
        if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.equals(pltzInstrStatus)) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTwMixtagOnCreateMoveToRegister(java.lang.String)
     */
    public boolean validateDatabaseTwMixtagOnCreateMoveToRegister(String dscId) throws ApplicationException {
        
        if(CheckUtil.isBlankOrNull(dscId)){
            return false;
        }
        
        // Create of a condition domain
        // 条件ドメインの作成
        TwMixtagCriteriaDomain twMixtagCriteria = new TwMixtagCriteriaDomain();
        twMixtagCriteria.setDscId(dscId);
        twMixtagCriteria.setSearchCountCheckFlg(false);
        
        // The number of Mix Tag Work is checked.
        // MIXED品目番号ワークの件数をチェック
        if (0 < twMixtagService.searchCount(twMixtagCriteria)) {
            return true;
        }
        return false;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCondition(java.lang.String, java.util.List, java.util.List)
     */
    public boolean validateDatabaseTwMixtagOnCreateUpdateByCondition(
        String dscId, List<W2005MixTagItemDomain> domainList, List<String> paramsList)throws ApplicationException{
        
        boolean errFlg = false;
        
        // Create of a condition domain
        // 条件ドメインの作成
        TwMixtagCriteriaDomain criteria = new TwMixtagCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(1);
        
        List<TwMixtagDomain> mixTagRtList = twMixtagService.searchByConditionForPaging(criteria);
        
        if(mixTagRtList.isEmpty()){
            return true;
        }
        
        // Correlation check list
        // 相関チェックリスト
        List<String> ContSortKeyList = new ArrayList<String>();
        List<String> clList = new ArrayList<String>();
        List<String> invSetKeyList = new ArrayList<String>();
        List<String> ccTypeList = new ArrayList<String>();
        List<String> currencycdList = new ArrayList<String>();
        
        String loadingCd = LOADING_CD_FREE;
        
        boolean firstFlg = true;
        
        // Item list of screen   Since finishing [ the item of a screen / a check ] already,
        // It checks with a top VALUE except LD CD.
        // 画面の項目リスト 画面の項目はすでにチェック済みの為、
        // LD CD以外は先頭の値でチェック
        for (int i = 0; i < domainList.size(); i++) {
            W2005MixTagItemDomain listDomain = domainList.get(i); 
            
            if(firstFlg){
                ContSortKeyList.add(listDomain.getContainerSortingKey());
                clList.add(listDomain.getContainerLooseTyp());
                invSetKeyList.add(listDomain.getInvoiceKey());
                ccTypeList.add(listDomain.getCustomTimingTyp());
                currencycdList.add(listDomain.getCurrCd());
            }
            if(LOADING_CD_DOOR.equals(listDomain.getLoadingCd())){
                loadingCd = LOADING_CD_DOOR;
            }
            if(LOADING_CD_BACK.equals(listDomain.getLoadingCd())){
                loadingCd = LOADING_CD_BACK;
            }
            firstFlg = false;
        }
        
        // Multiple Item No. in 1Box PKG number of the same condition check
        // 同一小箱内多品番条件チェック
        TwMixtagDomain mixTagRt = mixTagRtList.get(0);
        ContSortKeyList.add(mixTagRt.getContainerSortingKey());
        clList.add(mixTagRt.getContainerLooseTyp());
        invSetKeyList.add(mixTagRt.getInvoiceKey());
        ccTypeList.add(mixTagRt.getCustomTimingTyp());
        currencycdList.add(mixTagRt.getCurrCd());
        
        if (!validateConsistencyAllSame(ContSortKeyList)) {
            paramsList.add("label.containerSortingKey");
            errFlg = true;
        }
        // An error will be made if check"D" (Door) and "B" (Back) of LD CD are intermingled.
        // LD CDのチェック "D"（Door）と"B"（Back）が混在していたらエラー
        if(!LOADING_CD_FREE.equals(loadingCd)){
            TwMixtagCriteriaDomain searchCriteria = new TwMixtagCriteriaDomain();
            searchCriteria.setDscId(dscId);
            if(LOADING_CD_DOOR.equals(loadingCd)){
                searchCriteria.setLoadingCd(LOADING_CD_BACK);
            }
            if(LOADING_CD_BACK.equals(loadingCd)){
                searchCriteria.setLoadingCd(LOADING_CD_DOOR);
            }
            searchCriteria.setSearchCountCheckFlg(false);
            int count = twMixtagService.searchCount(searchCriteria);
            if(count > 0){
                paramsList.add("label.loadingCd");
                errFlg = true;
            }
        }
        
        if (!validateConsistencyAllSame(clList)) {
            paramsList.add("label.containerLooseTyp");
            errFlg = true;
        }
        if (!validateConsistencyAllSame(invSetKeyList)) {
            paramsList.add("label.invoiceKey");
            errFlg = true;
        }
        if (!validateConsistencyAllSame(ccTypeList)) {
            paramsList.add("label.customTimingTyp");
            errFlg = true;
        }
        if (!validateConsistencyAllSame(currencycdList)) {
//          paramsList.add("label.currCd");
            paramsList.add(CURRENCY_CODE);
            errFlg = true;
        }
        
        if(errFlg){
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#validateDatabaseTwMixtagOnCreateUpdateByCount(java.lang.String, int)
     */
    public boolean validateDatabaseTwMixtagOnCreateUpdateByCount(String dscId, int registerNum) 
        throws ApplicationException {
        
        // The registration number check
        // 登録件数チェック
        TwMixtagCriteriaDomain criteria = new TwMixtagCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        int count = twMixtagService.searchCount(criteria);
        // The number-of-cases + registration number <= maximum registration number of Mix Tag Work   If it is, it will be [ true and ] false except it.
        // MIXED品目番号ワークの件数 + 登録件数 <= 最大登録件数 であればtrue、それ以外はfalse
        if (count + registerNum <= TW_MIX_TAG_ITEM_NO_MAX_COUNT) {
            return true;
        }
        return false;
    }
    
    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    
    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return w2005MixTagDao.searchCountTtMixtag(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchForPagingOnCreateSearchByNonInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain, java.util.List)
     */
    public List<? extends W2005MixTagItemDomain> searchForPagingOnCreateSearchByNonInstr(W2005MixTagItemCriteriaDomain criteria, List<String> errMessages)
        throws ApplicationException{
        
        // Web service domain
        // Webサービスドメイン
        Ws2004ResultDomain wsResultDomain = new Ws2004ResultDomain();
        List<String> plantCdList = new ArrayList<String>();
        String whCd = criteria.getLgcyWhCd();
        List<String> itemNoList = new ArrayList<String>();
        String customerCd = criteria.getCustomerCd();
        String compCd = criteria.getShipperCd();
        
        // Acquisition of search data
        // 検索データの取得
        List<? extends W2005MixTagItemDomain> ttExpRcvOdrList = w2005MixTagDao.searchTtExpRcvOdr(criteria);

        for (int i = 0; i < ttExpRcvOdrList.size(); i++ ) {
            W2005MixTagItemDomain mixTagItemDomain = ttExpRcvOdrList.get(i);
            itemNoList.add(mixTagItemDomain.getItemNo());

            // :disabledFlg:0 when Mix-Tag-Work .QTY is Null(s)
            // MIXED品目番号ワーク.QTYがNullの場合：disabledFlg:0
            if (mixTagItemDomain.getQty() == null) {
                mixTagItemDomain.setDisabledFlg(FLAG_N);
            }else{
                mixTagItemDomain.setDisabledFlg(FLAG_Y);
            }
        } 
        
        // When the W/H CD of NEXUS is chosen
        // NEXUSの倉庫コードを選択した場合
        if (CheckUtil.isBlankOrNull(criteria.getPlntCd())) {
            
            W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
            // Authority information is acquired (update authority).  
            // 権限情報を取得(更新権限)
            List<? extends UserAuthDomain> userList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2005R);
            if (userAuthService.hasRegisterAll()) {
                userList = null;
            }
            mixTagCriteria.setUserAuthList(userList);
            mixTagCriteria.setCompCd(criteria.getCompCd());
            mixTagCriteria.setWhCd(criteria.getWhCd());
            mixTagCriteria.setShipperCd(criteria.getShipperCd());
            mixTagCriteria.setServerId(criteria.getServerId());
            // CIGMA Warehouse Cross Reference Master
            // 倉庫クロスリファレンス原単位
            List<? extends W2005MixTagDomain> plntCdList = w2005MixTagDao.searchTmCigmaWhXrefByAuth(mixTagCriteria);
            // In the case of 0 affair
            // 0件の場合
            if (CollectionUtils.isEmpty(plntCdList)) {
                throw new GscmApplicationException(NXS_E1_0049);
            }else{
                for (int i = 0; i < plntCdList.size(); i++ ) {
                    W2005MixTagDomain domain = plntCdList.get(i);
                    plantCdList.add(domain.getPlntCd());
                }
            }
        }else{
            // When the W/H CD of CIGMA is chosen
            // CIGMAの倉庫コードを選択した場合
            plantCdList.add(criteria.getPlntCd());
        }
        
        // Web service (WS2004)  
        // Webサービス(WS2004)
        wsResultDomain = ws2004RestService.searchItemInfoForCml(compCd, plantCdList, whCd, itemNoList, customerCd);
        
        // The check of the Status of Web service
        // Webサービスのステータスの確認
        if (!WS_RESULT_SUCCESS.equals(wsResultDomain.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        }
        
        // Converted of a QUANTITY UNIT
        // An ITEM-NO information is changed into MAP from // CIGMA.
        // 数量単位の変換
        // CIGMAから品目番号情報をMAPに変換
        Map<String, Ws2004ResultItemDomain> ws2004ResultMap = new HashMap<String, Ws2004ResultItemDomain>();
        if (wsResultDomain != null && !wsResultDomain.getItemList().isEmpty()) {

            // Map acquisition of a QUANTITY UNIT
            // 数量単位のMap取得
            TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
            List<TmMeasureUnitDomain> unitList = tmMeasureUnitService
                .searchByCondition(tmMeasureUnitCriteriaDomain);
            Map<String, String> unitMap = new HashMap<String, String>();
            for (int k = 0; k < unitList.size(); k++ ) {
                unitMap.put(unitList.get(k).getLgcyUnitCd(), unitList.get(k).getUnitCd());
            }

            // QUANTITY UNIT is replaced and it stores in Map.
            // 数量単位を置換えて、Mapに格納
            List<? extends Ws2004ResultItemDomain> ws2004ResultList = wsResultDomain.getItemList();
            for (int m = 0; m < ws2004ResultList.size(); m++ ) {
                Ws2004ResultItemDomain domain = ws2004ResultList.get(m);
                domain.setUnmsr(unitMap.get(domain.getUnmsr()));
                ws2004ResultMap.put(domain.getItnbr(), domain);
            }
        }
        
        // Combination of data
        // データの結合
        
        List<W2005MixTagItemDomain> resultList = new ArrayList<W2005MixTagItemDomain>();
        
        for (int i = 0; i < ttExpRcvOdrList.size(); i++) {
            W2005MixTagItemDomain itemDomain = ttExpRcvOdrList.get(i);
        
            String itemNo = itemDomain.getItemNo();
            // ITEM NO = Item No
            // 品目番号=Item No
            if (ws2004ResultMap.containsKey(itemNo)) {
                
                Ws2004ResultItemDomain wsDomain = ws2004ResultMap.get(itemNo);
                BigDecimal stockQty = convertNullToZero(itemDomain.getStockQty());
                itemDomain.setLotSize(convertNullToZero(itemDomain.getLotSize()));
                itemDomain.setOdr(convertNullToZero(itemDomain.getOdr()));
                itemDomain.setBo(convertNullToZero(itemDomain.getBo()));
                itemDomain.setShippingLot(itemDomain.getLotSize());
                itemDomain.setOrderQty(itemDomain.getOdr());
                itemDomain.setBoQty(itemDomain.getBo());
                BigDecimal onHandTotalQty = new BigDecimal(wsDomain.getMohtq());
                // Inventory-figures -  Temp-Stock .QTY
                // 在庫数 - 仮在庫.QTY
                itemDomain.setOnHandQty(onHandTotalQty.subtract(stockQty));
                itemDomain.setHiddenPlntCd(wsDomain.getPackc());
                itemDomain.setCurrCd(wsDomain.getCurr3());
                itemDomain.setQtyUnit(wsDomain.getUnmsr());
                resultList.add(itemDomain);
                
            }
        }
        return resultList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchForPagingOnCreateSearchByPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain, java.util.List)
     */
    public List<? extends W2005MixTagItemDomain> searchForPagingOnCreateSearchByPltzInstr(W2005MixTagItemCriteriaDomain criteria, List<String> errMessages)
        throws ApplicationException{
        
        // Web service domain
        // Webサービスドメイン
        Ws2004ResultDomain wsResultDomain = new Ws2004ResultDomain();
        List<String> plantCdList = new ArrayList<String>();
        plantCdList.add(criteria.getPlntCd());
        String whCd = criteria.getLgcyWhCd();
        List<String> itemNoList = new ArrayList<String>();
        String customerCd = criteria.getCustomerCd();
        String compCd = criteria.getShipperCd();
        
        // Acquisition of search data
        // 検索データの取得
        List<? extends W2005MixTagItemDomain> ttPltzInstrList = w2005MixTagDao.searchTtPltzInstr(criteria);

        for (int i = 0; i < ttPltzInstrList.size(); i++ ) {
            W2005MixTagItemDomain mixTagItemDomain = ttPltzInstrList.get(i);
            itemNoList.add(mixTagItemDomain.getItemNo());
        } 
        
        // Web service (WS2004)  
        // Webサービス(WS2004)
        wsResultDomain = ws2004RestService.searchItemInfoForCml(compCd, plantCdList, whCd, itemNoList, customerCd);
        
        // The check of the Status of Web service
        // Webサービスのステータスの確認
        if (!WS_RESULT_SUCCESS.equals(wsResultDomain.getResultCode())) {
            throw new SystemException(NXS_91_0001);
        }
        
        // Converted of a QUANTITY UNIT
        // An ITEM-NO information is changed into MAP from CIGMA.
        // 数量単位の変換
        // CIGMAから品目番号情報をMAPに変換
        Map<String, Ws2004ResultItemDomain> ws2004ResultMap = new HashMap<String, Ws2004ResultItemDomain>();
        if (wsResultDomain != null && !wsResultDomain.getItemList().isEmpty()) {

            // Map acquisition of a QUANTITY UNIT
            // 数量単位のMap取得
            TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain = new TmMeasureUnitCriteriaDomain();
            List<TmMeasureUnitDomain> unitList = tmMeasureUnitService
                .searchByCondition(tmMeasureUnitCriteriaDomain);
            Map<String, String> unitMap = new HashMap<String, String>();
            for (int k = 0; k < unitList.size(); k++ ) {
                unitMap.put(unitList.get(k).getLgcyUnitCd(), unitList.get(k).getUnitCd());
            }

            // QUANTITY UNIT is replaced and it stores in Map.
            // 数量単位を置換えて、Mapに格納
            List<? extends Ws2004ResultItemDomain> ws2004ResultList = wsResultDomain.getItemList();
            for (int m = 0; m < ws2004ResultList.size(); m++ ) {
                Ws2004ResultItemDomain domain = ws2004ResultList.get(m);
                domain.setUnmsr(unitMap.get(domain.getUnmsr()));
                ws2004ResultMap.put(domain.getItnbr(), domain);
            }
        }
        
        // Combination of data
        // データの結合
        
        List<W2005MixTagItemDomain> resultList = new ArrayList<W2005MixTagItemDomain>();
        
        for (int i = 0; i < ttPltzInstrList.size(); i++) {
            W2005MixTagItemDomain itemDomain = ttPltzInstrList.get(i);
            
            // :disabledFlg:0 when Mix-Tag-Work .QTY is Null(s)
            // MIXED品目番号ワーク.QTYがNullの場合：disabledFlg:0
            if (itemDomain.getQty() == null) {
                itemDomain.setDisabledFlg(FLAG_N);
            }else{
                itemDomain.setDisabledFlg(FLAG_Y);
            }
            // A setting of INSTR PKGED QTY
            // INSTR PKGED QTYの設定
            BigDecimal packedQty = convertNullToZero(itemDomain.getPackedQty());
            BigDecimal sumQty = itemDomain.getSumQty();
            itemDomain.setInstrPkgedQty(packedQty.add(sumQty));
            BigDecimal stockQty = convertNullToZero(itemDomain.getStockQty());
            itemDomain.setInstrQty(convertNullToZero(itemDomain.getInstrQty()));
            itemDomain.setOdr(convertNullToZero(itemDomain.getOdr()));
            itemDomain.setBo(convertNullToZero(itemDomain.getBo()));
            itemDomain.setShippingLot(itemDomain.getLotSize());
            itemDomain.setOrderQty(itemDomain.getOdr());
            itemDomain.setBoQty(itemDomain.getBo());
            
            String itemNo = itemDomain.getItemNo();
            // ITEM NO = Item No
            // 品目番号=Item No
            if (ws2004ResultMap.containsKey(itemNo)) {
                
                Ws2004ResultItemDomain wsDomain = ws2004ResultMap.get(itemNo);

                BigDecimal onHandTotalQty = new BigDecimal(wsDomain.getMohtq());
                // Inventory-figures -  Temp-Stock .QTY
                // 在庫数 - 仮在庫.QTY
                itemDomain.setOnHandQty(onHandTotalQty.subtract(stockQty));
                itemDomain.setHiddenPlntCd(wsDomain.getPackc());
                itemDomain.setCurrCd(wsDomain.getCurr3());
                itemDomain.setQtyUnit(wsDomain.getUnmsr());
                resultList.add(itemDomain);
                
            }
            
        }
        return resultList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    public List<? extends W2005MixTagDomain> searchForPagingOnMainSearch(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return w2005MixTagDao.searchForPagingTtMixtag(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchOnDetailInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain)
     */
    public List<? extends W2005MixTagRtDomain> searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException{
        
        // Search-results return list
        // 検索結果返却リスト
        List<W2005MixTagRtDomain> resultList = new ArrayList<W2005MixTagRtDomain>();
        
        // Mix Tag RT Work is searched.
        // MIXED用RT材ワークを検索
        TwMixtagRtCriteriaDomain twMixTagRtCriteria = new TwMixtagRtCriteriaDomain();
        twMixTagRtCriteria.setDscId(criteria.getLoginUserDscId());
        twMixTagRtCriteria.setPreferredOrder("BOX_FLG desc, PKG_ITEM_NO");
        List<TwMixtagRtDomain> searchList = twMixtagRtService.searchByCondition(twMixTagRtCriteria);
        
        if (searchList != null && searchList.size() > 0) {
            // It copies to a return list from search results list.
            // 検索結果リストから返却リストへコピー
            for (int i = 0; i < searchList.size(); i++ ) {
                TwMixtagRtDomain itemDomain = searchList.get(i);
                W2005MixTagRtDomain resultDomain = new W2005MixTagRtDomain ();
                CommonUtil.copyPropertiesDomainToDomain(resultDomain, itemDomain);
                resultList.add(resultDomain);
            }
        }
        return resultList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchOnDetailInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain)
     */
    public List<? extends W2005MixTagRtDomain> searchOnDetailInitByFromMain(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException{
        
        // Search-results return list
        // 検索結果返却リスト
        List<W2005MixTagRtDomain> resultList = new ArrayList<W2005MixTagRtDomain>();
        
        // Mix Tag RT is searched.
        // MIXED用RT材を検索
        TtMixtagRtCriteriaDomain ttMixTagRtCriteria = new TtMixtagRtCriteriaDomain();
        ttMixTagRtCriteria.setMixTagNo(criteria.getMixTagNo());
        ttMixTagRtCriteria.setPreferredOrder("BOX_FLG desc, PKG_ITEM_NO");
        List<TtMixtagRtDomain> searchList = ttMixtagRtService.searchByCondition(ttMixTagRtCriteria);
        
        if (searchList != null && searchList.size() > 0) {
            // It copies to a return list from search results list.
            // 検索結果リストから返却リストへコピー
            for (int i = 0; i < searchList.size(); i++ ) {
                TtMixtagRtDomain itemDomain = searchList.get(i);
                
                W2005MixTagRtDomain resultDomain = new W2005MixTagRtDomain();
                CommonUtil.copyPropertiesDomainToDomain(resultDomain, itemDomain);
                resultList.add(resultDomain);
            }
        }
         
        return resultList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    public W2005MixTagDomain searchOnRegisterInitByFromCreate(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        
        // Return list
        // 返却リスト
        W2005MixTagDomain mixTagDomain = new W2005MixTagDomain();
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        
        // Mix-Tag-Item-No work is searched.
        // MIXED品番ワークを検索
        TwMixtagCriteriaDomain twMixTagCriteria = new TwMixtagCriteriaDomain();
        twMixTagCriteria.setDscId(criteria.getLoginUserDscId());
        twMixTagCriteria.setPreferredOrder("ITEM_NO, PKG_CD");
        List<TwMixtagDomain> searchList = twMixtagService.searchByCondition(twMixTagCriteria);
        
        // Shipper's weight unit
        String shipperWeightUnit = commonService.searchWeightUnit(criteria.getShipperCd());
        
        // N/W calculation
        // N/W計算
        if (searchList != null && searchList.size() > 0) {
            Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
            // It copies to a return list from search results list.
            // 検索結果リストから返却リストへコピー
            for (int i = 0; i < searchList.size(); i++ ) {
                TwMixtagDomain itemDomain = searchList.get(i);
                W2005MixTagItemDomain resultDomain = new W2005MixTagItemDomain();
                CommonUtil.copyPropertiesDomainToDomain(resultDomain, itemDomain);
                
                // WarningFlg [62]:Actual PKG QTY /[63]:Actual Tag QTY -- < case [ of [60]:Ship Lot ]: -- one
                // WarningFlg 【62】:Actual PKG QTY / 【63】:Actual Tag QTY) < 【60】:Ship Lotの場合：1
                if ((resultDomain.getQty().divide(resultDomain.getTagQty(), 1, BigDecimal.ROUND_DOWN)).compareTo(
                    resultDomain.getShippingLot()) < 0 ) {
                        // ST980 MOD
                    resultDomain.setWarningFlg(FLAG_ON);
                }else{
                    resultDomain.setWarningFlg(FLAG_OFF);
                }
                
                resultDomain.setHiddenPlntCd(itemDomain.getPlntCd());
                mixTagItemList.add(resultDomain);
                
                // Calculation of N/W (each Weight unit)
                // N/W(重量単位ごと) の計算
                BigDecimal weight = weightMap.get(itemDomain.getWeightUnit());
                if (weight == null) {
                    weight = BigDecimal.ZERO;
                }
                
                weight = weight.add(itemDomain.getItemWeight().multiply(itemDomain.getQty()));
                weightMap.put(itemDomain.getWeightUnit(), weight);
            }
            
            // Calculation of N/W inclusive sum
            // N/W総合計 の計算
            BigDecimal netWeight = BigDecimal.ZERO;
            for (Map.Entry<String, BigDecimal> entry : weightMap.entrySet()) {
                String weightUnit = entry.getKey();
                BigDecimal weight = commonService.convertWeightUnit(entry.getValue(), weightUnit, shipperWeightUnit);
                if (weight == null) {
                    mixTagDomain.setNetWeightOverflow(true);
                } else {
                    netWeight = netWeight.add(weight);
                }
            }
            
            if (!mixTagDomain.isNetWeightOverflow()) {
                mixTagDomain.setNetWeightOverflow(commonService.isWeightOverflow(netWeight));
            }
            
            // A N/W inclusive sum is set.
            // N/W総合計をセット
            if (!mixTagDomain.isNetWeightOverflow() && !BigDecimal.ZERO.equals(netWeight)) {
                mixTagDomain.setNetWeight(netWeight);
            } else {
                mixTagDomain.setNetWeight(null);
            }
            
            mixTagDomain.setInvoiceKey(searchList.get(0).getInvoiceKey());
            mixTagDomain.setContainerSortingKey(searchList.get(0).getContainerSortingKey());
            mixTagDomain.setLoadingCd(searchList.get(0).getLoadingCd());
            mixTagDomain.setContainerLooseTyp(searchList.get(0).getContainerLooseTyp());
            mixTagDomain.setCustomTimingTyp(searchList.get(0).getCustomTimingTyp());
            mixTagDomain.setWeightUnit(searchList.get(0).getWeightUnit());
        }
        
        // This is confirmed whether Mix Tag RT Work is registered.
        // MIXED用RT材ワークが登録済みかをチェック
        TwMixtagRtCriteriaDomain twMixTagRtCriteria = new TwMixtagRtCriteriaDomain();
        twMixTagRtCriteria.setDscId(criteria.getLoginUserDscId());
        List<TwMixtagRtDomain> twMixtagRtList = twMixtagRtService.searchByCondition(twMixTagRtCriteria);
        
        // PKG I/P
        String pkg = "";
        // :N when there is not Mix Tag RT Work
        // MIXED用RT材ワークがない場合：N
        if (twMixtagRtList.isEmpty()) {
            pkg = FLAG_N;
        // in the cases of other than the above: Y
        // 上記以外の場合：Y
        } else {
            pkg = FLAG_Y;
            
            // G/W calculation
            // G/W 計算
            Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
            for (TwMixtagRtDomain twMixtagRtDomain : twMixtagRtList) {
                // Calculation of G/W (each Weight unit)
                // G/W(重量単位ごと) の計算
                BigDecimal weight = weightMap.get(twMixtagRtDomain.getWeightUnit());
                if (weight == null) {
                    weight = BigDecimal.ZERO;
                }
                
                weight = weight.add(twMixtagRtDomain.getPkgWeight());
                weightMap.put(twMixtagRtDomain.getWeightUnit(), weight);
            }
            
            // Calculation of G/W inclusive sum
            // G/W総合計 の計算
            BigDecimal grossWeight = BigDecimal.ZERO;
            for (Map.Entry<String, BigDecimal> entry : weightMap.entrySet()) {
                String weightUnit = entry.getKey();
                BigDecimal weight = commonService.convertWeightUnit(entry.getValue(), weightUnit, shipperWeightUnit);
                if (weight == null) {
                    mixTagDomain.setGrossWeightOverflow(true);
                } else {
                    grossWeight = grossWeight.add(weight);
                }
            }
            
            if (mixTagDomain.getNetWeight() != null) {
                grossWeight = grossWeight.add(mixTagDomain.getNetWeight());
            }
            
            if (!mixTagDomain.isGrossWeightOverflow()) {
                mixTagDomain.setGrossWeightOverflow(commonService.isWeightOverflow(grossWeight));
            }
            
            // A G/W inclusive sum is set.
            // G/W総合計をセット
            if (!mixTagDomain.isGrossWeightOverflow() && !BigDecimal.ZERO.equals(grossWeight)) {
                mixTagDomain.setGrossWeight(grossWeight);
            } else {
                mixTagDomain.setGrossWeight(null);
            }
        }
        
        // PKG I/P is set.
        // PKG I/Pをセット
        mixTagDomain.setPkgIp(pkg);
        
        // Setting of an initial value
        // 初期値の設定
        mixTagDomain.setShipperCd(criteria.getShipperCd());
        mixTagDomain.setCustomerCd(criteria.getCustomerCd());
        mixTagDomain.setLgcyShipTo(criteria.getLgcyShipTo());
        mixTagDomain.setTrnsCd(criteria.getTrnsCd());
        mixTagDomain.setPlntCd(criteria.getPlntCd());
        mixTagDomain.setLgcyWhCd(criteria.getLgcyWhCd());
        mixTagDomain.setPltzInstrNo(criteria.getPltzInstrNo());
        mixTagDomain.setWhCompCd(criteria.getWhCompCd());
        mixTagDomain.setWhCd(criteria.getWhCd());
        mixTagDomain.setMixTagItemDomainList(mixTagItemList);
        
        return mixTagDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#searchOnRegisterInitByFromMain(W2005MixTagCriteriaDomain)
     */
    public List<? extends W2005MixTagDomain> searchOnRegisterInitByFromMain(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        
        List<? extends W2005MixTagDomain> searchList = w2005MixTagDao.searchTtMixtagItemNo(criteria);
        
        if(searchList != null && 0 < searchList.size()){
            W2005MixTagDomain w2005MixTagDomain = searchList.get(0);
            if (w2005MixTagDomain != null) {
                List<? extends W2005MixTagItemDomain> list = w2005MixTagDomain.getMixTagItemDomainList();
                if (list.size() > 0) {
                    for (W2005MixTagItemDomain domain : list) {
                        if (domain.getAuth() == null || AUTH_EMPTY_NUMERIC.equals(domain.getAuth())) {
                            // In Browse All or Register All, it overwrites.
                            // Browse All または、 Register All の場合上書き
                            domain.setAuth(criteria.getBaseAuthFlg());
                        }
                    }
                }
            }
        }
        return searchList;
        
    }

    // --------------------------------- Update system method update
    // -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update
    // -----------------------------------------------------------

    // --------------------------------- Delete system method delete
    // -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete
    // -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#deleteOnDetailDelete(java.util.List)
     */
    public List<? extends W2005MixTagRtDomain> deleteOnDetailDelete(List<? extends W2005MixTagRtCriteriaDomain> mixTagRtCriteriaList)
        throws ApplicationException{
        
        for (W2005MixTagRtCriteriaDomain mixTagRt : mixTagRtCriteriaList) {
            // Create of a condition domain
            // 条件ドメインの作成 
            TwMixtagRtCriteriaDomain mixTagRtCriteria = new TwMixtagRtCriteriaDomain();
            mixTagRtCriteria.setDscId(mixTagRt.getLoginUserDscId());
            mixTagRtCriteria.setPkgItemNo(mixTagRt.getPkgItemNo());
            mixTagRtCriteria.setSearchCountCheckFlg(false);
            // The target number of Mix-Tag-Item-No work
            // MIXED品番ワークの対象件数
            int twMixTagRtCount = twMixtagRtService.searchCount(mixTagRtCriteria);
                   
            if (0 < twMixTagRtCount) {
                // A delete of Mix-Tag-Item-No work
                // MIXED品番ワークの削除
                twMixtagRtService.deleteByCondition(mixTagRtCriteria);
            }
        }
        
        String userId = mixTagRtCriteriaList.get(0).getLoginUserDscId();
        
        // Mix Tag RT Work is searched.
        // MIXED用RT材ワークを検索
        TwMixtagRtCriteriaDomain twMixTagRtCriteria = new TwMixtagRtCriteriaDomain();
        twMixTagRtCriteria.setDscId(userId);
        twMixTagRtCriteria.setPreferredOrder("BOX_FLG desc, PKG_ITEM_NO");
        List<TwMixtagRtDomain> searchList = twMixtagRtService.searchByCondition(twMixTagRtCriteria);
        
        if(searchList.size() > 0 ){
            if(!FLAG_Y.equals(searchList.get(0).getBoxFlg())){
                TwMixtagRtDomain twMixtagRtDomain = new TwMixtagRtDomain();
                CommonUtil.copyPropertiesDomainToDomain(twMixtagRtDomain, searchList.get(0));
                twMixtagRtDomain.setBoxFlg(FLAG_Y);
                twMixtagRtService.update(twMixtagRtDomain);
            }
        }
        
        // Re retrieval
        // 再検索
        W2005MixTagRtCriteriaDomain mixTagSearchRtCriteria = new W2005MixTagRtCriteriaDomain();
        mixTagSearchRtCriteria.setLoginUserDscId(userId);

        return searchOnDetailInitByFromCreate(mixTagSearchRtCriteria);
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    public List<Integer> deleteOnHeaderInit(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        
        // The delete number list
        // 削除件数リスト
        List<Integer> deleteCountList = new ArrayList<Integer>();
        
        // The hard delete of Mix-Tag-Item-No work
        // Create of a condition domain
        // MIXED品番ワークの物理削除
        // 条件ドメインの作成
        TwMixtagCriteriaDomain twMixTagCriteria = new TwMixtagCriteriaDomain();
        twMixTagCriteria.setDscId(criteria.getLoginUserDscId());
        twMixTagCriteria.setSearchCountCheckFlg(false);
        // The target number of Mix-Tag-Item-No work
        // MIXED品番ワークの対象件数
        int twMixTagCount = twMixtagService.searchCount(twMixTagCriteria);
        // A delete of Mix-Tag-Item-No work
        // MIXED品番ワークの削除        
        if (0 < twMixTagCount) {
            deleteCountList.add(twMixTagCount);
            twMixtagService.deleteByCondition(twMixTagCriteria);
        }
        
        // The hard delete of Mix-Tag-Item-No RT material work
        // Create of a condition domain
        // MIXED品番RT材ワークの物理削除
        // 条件ドメインの作成
        TwMixtagRtCriteriaDomain twMixTagRtCriteria = new TwMixtagRtCriteriaDomain();
        twMixTagRtCriteria.setDscId(criteria.getLoginUserDscId());
        twMixTagRtCriteria.setSearchCountCheckFlg(false);
        // The target number of Mix-Tag-Item-No RT material work
        // MIXED品番RT材ワークの対象件数
        int twMixTagRtCount = twMixtagRtService.searchCount(twMixTagRtCriteria);
        // A delete of Mix Tag RT Work
        // MIXED用RT材ワークの削除
        if (0 < twMixTagRtCount) {
            deleteCountList.add(twMixTagRtCount);
            // A delete of Mix Tag RT Work
            // MIXED用RT材ワークの削除
            twMixtagRtService.deleteByCondition(twMixTagRtCriteria);
        }
        return deleteCountList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#deleteOnRegisterDelete(java.util.List)
     */
    public W2005MixTagDomain deleteOnRegisterDelete(List<? extends W2005MixTagItemDomain> mixTagItemList)
        throws ApplicationException{
        
        for (W2005MixTagItemDomain mixTagItem : mixTagItemList) {
            // Create of a condition domain
            // 条件ドメインの作成 
            TwMixtagCriteriaDomain mixTagCriteria = new TwMixtagCriteriaDomain();
            mixTagCriteria.setDscId(mixTagItem.getLoginUserDscId());
            mixTagCriteria.setItemNo(mixTagItem.getItemNo());
            mixTagCriteria.setPkgCd(mixTagItem.getPkgCd());
            mixTagCriteria.setSearchCountCheckFlg(false);
            // The target number of Mix-Tag-Item-No work
            // MIXED品番ワークの対象件数
            int twMixTagCount = twMixtagService.searchCount(mixTagCriteria);
            // A delete of Mix-Tag-Item-No work
            // MIXED品番ワークの削除
            if (0 < twMixTagCount) {
                twMixtagService.deleteByCondition(mixTagCriteria);
            }
        }
        // Re retrieval
        // 再検索
        W2005MixTagCriteriaDomain mixTagSearchCriteria = new W2005MixTagCriteriaDomain();
        mixTagSearchCriteria.setLoginUserDscId(mixTagItemList.get(0).getLoginUserDscId());
        mixTagSearchCriteria.setShipperCd(mixTagItemList.get(0).getShipperCd());

        return searchOnRegisterInitByFromCreate(mixTagSearchCriteria);
    }

    // -------------------------------- Transaction system method transact
    // ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact
    // ----------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#transactOnCreateUpdate(java.util.List)
     */
    public void transactOnCreateUpdate(List<? extends W2005MixTagItemDomain> mixTagItemList)
        throws ApplicationException{
        
        for (W2005MixTagItemDomain mixTagItem : mixTagItemList) {
            
            // Update
            // 更新
            if (FLAG_Y.equals(mixTagItem.getDisabledFlg())) {
                TwMixtagDomain mixTagItemNo = convertToMixTagItemNoDomain(mixTagItem);
                TwMixtagCriteriaDomain criteria = prepareMixTagItemNoCriteria(mixTagItem);
                
                twMixtagService.updateByCondition(mixTagItemNo, criteria);
            // Registration
            // 登録
            } else {
                TwMixtagDomain mixTagItemNo = convertToMixTagItemNoDomain(mixTagItem);
                
                twMixtagService.create(mixTagItemNo);
            }
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#transactOnDetailSave(java.util.List)
     */
    public List<? extends W2005MixTagRtDomain> transactOnDetailSave(List<? extends W2005MixTagRtDomain> mixTagRtList)
        throws ApplicationException{
        
        String useId = mixTagRtList.get(0).getLoginUserDscId();
        
        // A delete of Mix Tag RT Work
        // MIXED用RT材ワークの削除
        deleteTwMixtagRt(useId);
        
        // Registration of Mix Tag RT Work
        // MIXED用RT材ワークの登録
        createTwMixtagRt(mixTagRtList);

        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2005MixTagRtCriteriaDomain criteria = new W2005MixTagRtCriteriaDomain();
        criteria.setLoginUserDscId(useId);
        
        // Re retrieval of Mix Tag RT Work (this is the same as the time of the changes from a Create screen)  
        // MIXED用RT材ワークの再検索 (Create画面からの遷移時と同じ)
        return searchOnDetailInitByFromCreate(criteria);
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#transactOnRegister(W2005MixTagDomain)
     */
    public List<? extends W2005MixTagDomain> transactOnRegister(W2005MixTagDomain mixTag)
        throws ApplicationException{
        
        // It carries out, only when Palletize Instr. No. is not set up.
        // Palletize Instr. No.が設定されていない場合のみ実施
        if (CheckUtil.isBlankOrNull(mixTag.getPltzInstrNo())) {
            // Firm-order-receipt alloc processing
            // 確定受注引当処理
            updateTtExpRcvOdrOnRegister(mixTag);
        }
        // Registration of Mix Tag
        // MIXED現品票の登録
        createTtMixTag(mixTag);
        
        // Registration of MIXED ITEM NO
        // MIXED品目番号の登録
        createTtMixTagItemNo(mixTag);
        
        // It carries out, only when Palletize Instr. No. is not set up.
        // Palletize Instr. No.が設定されていない場合のみ実施
        if (CheckUtil.isBlankOrNull(mixTag.getPltzInstrNo())) {
            // Registration of Mix Tag Receive Order
            // MIXED品目番号受注情報の登録
            createMixTagOdr(mixTag);
        }
        
        // A delete of Mix Tag Work
        // MIXED品目番号ワークの削除
        deleteTwMixTagNo(mixTag);
        
        // Registration of Mix Tag RT
        // MIXED用RT材の登録
        createTtMixTagRt(mixTag);
        
        // A delete of Mix Tag RT Work
        // MIXED用RT材ワークの削除
        deleteTwMixtagRt(mixTag.getLoginUserDscId());
        
        // It carries out, only when Palletize Instr. No. is not set up.
        // Palletize Instr. No.が設定されていない場合のみ実施
        if (CheckUtil.isBlankOrNull(mixTag.getPltzInstrNo())) {
            // An update and registration of a Temp Stock
            // 仮在庫の更新・登録
            transactTtTmpStock(mixTag, true);
        
            // Registration of ordering alloc track record (starting of Web service)  
            // 受注引当実績の登録（Webサービスの起動）
            createRcvOdrAlloc(mixTag);
        }
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        
        // Authority information is set up.
        // 権限情報を設定
        String baseAuthFlg = AUTH_EMPTY_NUMERIC;
        if (userAuthService.hasBrowseAll()) {
            // Browse All
            baseAuthFlg = AUTH_BROWSE_NUMERIC;
        }
        if (userAuthService.hasRegisterAll()) {
            // In Register All, it overwrites.
            // Register All の場合、上書き。
            baseAuthFlg = AUTH_REGISTER_NUMERIC;
        }
        criteria.setBaseAuthFlg(baseAuthFlg);
        
        if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
            // In the case of Register All
            // Register Allの場合
            criteria.setUserAuthList(null);
        
        } else {
            // When this is not Register All
            // Register Allでない場合
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2005R, PERMIT_FUNC_ID_W2005B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            if (userAuthList.size() == 0 && AUTH_EMPTY_NUMERIC.equals(baseAuthFlg)) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteria.setUserAuthList(userAuthList);
        }

        criteria.setServerId(mixTag.getServerId());
        
        // Re retrieval of Packaging Instruction (=Pull) (this is the same as the time of the changes from a Main screen)  
        // 梱包指示の再検索 (Main画面からの遷移時と同じ)
        return searchOnRegisterInitByFromMain(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#transactOnRegisterCancel(W2005MixTagDomain)
     */
    public void transactOnRegisterCancel(W2005MixTagDomain mixTag)
        throws ApplicationException{
        
        // Acquisition of Mix Tag Receive Order
        // MIXED品目番号受注情報の取得
        List<TtMixtagOdrDomain> ttMixTagOdrList = searchTtMixTagOdr(mixTag);
        
        // Update of an Export Receive Order
        // 輸出受注の更新
        updateTtExpRcvOdrOnRegisterCancel(ttMixTagOdrList, mixTag);
        
        // The hard delete of Mix Tag
        // MIXED現品票の物理削除
        deleteTtMixTag(mixTag);
        
        // The hard delete of MIXED ITEM NO
        // MIXED品目番号の物理削除
        deleteTtMixTagItemNo(mixTag);
        
        // The hard delete of Mix Tag Receive Order
        // MIXED品目番号受注情報の物理削除
        deleteTtMixTagOdr(mixTag);
        
        // The hard delete of Mix Tag KANBAN
        // MIX品かんばん情報の物理削除
        deleteTtMixKanban(mixTag);
        
        // The hard delete of Mix Tag RT
        // MIXED用RT材の物理削除
        deleteTtMixTagRt(mixTag);
        
        // It carries out, only when Palletize Instr. No. is not set up.
        // Palletize Instr. No.が設定されていない場合のみ実施
        if (CheckUtil.isBlankOrNull(mixTag.getPltzInstrNo())) {
            // Update of a Temp Stock
            // 仮在庫の更新
            transactTtTmpStock(mixTag, false);
        
            // Registration of ordering alloc track record (starting of Web service)  
            // 受注引当実績の登録（Webサービスの起動）
            createRcvOdrAlloc(mixTag);
        
        }
    }

    // -------------------------------- Print system method print
    // ---------------------------------------------------------
    // -------------------------------- プリント系メソッド print
    // ---------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2005MixTagService#printOnRegisterPrintTag(W2005MixTagDomain, String)
     */
    public File printOnRegisterPrintTag(W2005MixTagDomain mixTagN, String reportDateFormat)
        throws ApplicationException{
        
        L2002ReportCriteriaDomain criteria = new L2002ReportCriteriaDomain();
        criteria.setMixTagNo(mixTagN.getMixTagNo());
        
        return l2002ReportService.searchMixTag(criteria.getMixTagNo(), reportDateFormat);
        
    }

    // --------------------------------- Hereinafter, a protected method
    // ----------------------------------
    // --------------------------------- 以下、protected メソッド
    // ----------------------------------

    /**
     * Create the condition domain for locking a Mix Tag Work.
     * <br />MIXED品目番号ワークをロックするための条件ドメインを作成します。
     *
     * @param mixTagItem The Mix Tag Work for a lock<br />ロック対象のMIXED品目番号ワーク
     * @return Condition domain<br />条件ドメイン
     */
    protected TwMixtagCriteriaDomain prepareMixTagItemNoCriteria(W2005MixTagItemDomain mixTagItem) {
        
        TwMixtagCriteriaDomain criteria = new TwMixtagCriteriaDomain();
        
        criteria.setDscId(mixTagItem.getLoginUserDscId());
        criteria.setItemNo(mixTagItem.getItemNo());
        criteria.setPkgCd(mixTagItem.getPkgCd());
        
        return criteria;
    }

    /**
     * It changes into {@link TwMixtagDomain} from {@link W2005MixTagItemDomain}.
     * <br />{@link W2005MixTagItemDomain}から{@link TwMixtagDomain}に変換します。
     *
     * @param mixTagItem The object of a changing agency<br />変換元のオブジェクト
     * @return The object after a converted<br />変換後のオブジェクト
     */
    protected TwMixtagDomain convertToMixTagItemNoDomain(W2005MixTagItemDomain mixTagItem) {
        TwMixtagDomain mixTagItemno = new TwMixtagDomain();

        // Acquisition of an item value
        // 項目値の取得
        String dscId = mixTagItem.getLoginUserDscId();
        String itemNo = mixTagItem.getItemNo();
        String pkgCd = mixTagItem.getPkgCd();
        String itemNm = mixTagItem.getItemDescription();
        BigDecimal lotSize = mixTagItem.getShippingLot();
        BigDecimal instrQty = mixTagItem.getInstrQty();
        BigDecimal actualPkgQty = mixTagItem.getQty();
        BigDecimal actualTagQty = mixTagItem.getTagQty();
        String contSortKey = mixTagItem.getContainerSortingKey();
        String ldCd = mixTagItem.getLoadingCd();
        String cL = mixTagItem.getContainerLooseTyp();
        String invSetKey = mixTagItem.getInvoiceKey();
        String cCType = mixTagItem.getCustomTimingTyp();
        BigDecimal nWShipLot = mixTagItem.getItemWeight();
        String weightUnit = mixTagItem.getWeightUnit();
        String qtyUnit = mixTagItem.getQtyUnit();
        String hiddenPlantCd = mixTagItem.getHiddenPlntCd();
        String currencyCd = mixTagItem.getCurrCd();
        String originCountryCd = mixTagItem.getOriginCntryCd();
        String expLimitTyp = mixTagItem.getExpLimitTyp();
        String dngrItemFlg = mixTagItem.getDngrItemFlg();
        
        
        // A setting of key item
        // キー項目の設定
        mixTagItemno.setDscId(dscId);
        mixTagItemno.setItemNo(itemNo);
        mixTagItemno.setPkgCd(pkgCd);
        
        // At the time of an update
        // 更新時
        if (FLAG_Y.equals(mixTagItem.getDisabledFlg())) {
            // Setting of an update item
            // 更新項目の設定
            mixTagItemno.setQty(actualPkgQty);
            mixTagItemno.setTagQty(actualTagQty);

            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(mixTagItemno, SCREEN_ID_W2007);

        // At the time of registration
        // 登録時
        } else {
            // Setting of a registration item
            // 登録項目の設定
            mixTagItemno.setItemDescription(itemNm);
            mixTagItemno.setItemTyp(" ");
            mixTagItemno.setShippingLot(lotSize);
            mixTagItemno.setInstrQty(instrQty);
            mixTagItemno.setQty(actualPkgQty);
            mixTagItemno.setTagQty(actualTagQty);
            mixTagItemno.setContainerSortingKey(contSortKey);
            mixTagItemno.setLoadingCd(ldCd);
            mixTagItemno.setContainerLooseTyp(cL);
            mixTagItemno.setInvoiceKey(invSetKey);
            mixTagItemno.setCustomTimingTyp(cCType);
            mixTagItemno.setItemWeight(nWShipLot);
            mixTagItemno.setWeightUnit(weightUnit);
            mixTagItemno.setQtyUnit(qtyUnit);
            mixTagItemno.setPlntCd(hiddenPlantCd);
            mixTagItemno.setCurrCd(currencyCd);
            mixTagItemno.setOriginCntryCd(originCountryCd);
            mixTagItemno.setExpLimitTyp(expLimitTyp);
            mixTagItemno.setDngrItemFlg(dngrItemFlg);
            
            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(mixTagItemno, SCREEN_ID_W2007);
        }
        
        return mixTagItemno;
    }

    /**
     * Delete a Mix Tag RT Work.
     * <br />MIXED用RT材ワークを削除します。
     *
     * @param userId Login DSC-ID<br />ログインDSC-ID
     * @throws ApplicationException When a Mix Tag RT Work is not able to be deleted<br />MIXED用RT材ワークが削除できなかった場合
     */
    protected void deleteTwMixtagRt(String userId) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TwMixtagRtCriteriaDomain criteria = new TwMixtagRtCriteriaDomain();
        criteria.setDscId(userId);
        // It will delete, if this is not 0 affair.
        // 0件でなければ、削除する
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix Tag RT Work
        // MIXED用RT材ワークの削除
        if (twMixtagRtService.searchCount(criteria) != 0) {
            twMixtagRtService.deleteByCondition(criteria);
        }
    }

    /**
     * Register a Mix Tag RT Work.
     * <br />MIXED用RT材ワークを登録します。
     *
     * @param mixTagRtList Mix-Tag-RT list<br />MIXED用RT材リスト
     * @throws ApplicationException When a Mix Tag RT Work is not able to be registered<br />MIXED用RT材ワークが登録できなかった場合
     */
    protected void createTwMixtagRt(List<? extends W2005MixTagRtDomain> mixTagRtList) throws ApplicationException {
        
        List<? extends TwMixtagRtDomain> mixTagRtCreateList = convertToMixTagRtDomain(mixTagRtList);
        
        if (mixTagRtCreateList != null && mixTagRtCreateList.size() > 0) {
            for (TwMixtagRtDomain mixTagRtDomain : mixTagRtCreateList) {
                twMixtagRtService.create(mixTagRtDomain);
            }
        }
        
    }

    /**
     * It changes into {@link TwMixtagRtDomain} from the list of {@link W2005MixTagRtDomain}.
     * <br />{@link W2005MixTagRtDomain}のリストから{@link TwMixtagRtDomain}に変換します。
     *
     * @param mixTagRtList The object of a changing agency<br />変換元のオブジェクト
     * @return The object after a converted<br />変換後のオブジェクト
     */
    protected List<? extends TwMixtagRtDomain> convertToMixTagRtDomain(List<? extends W2005MixTagRtDomain> mixTagRtList) {
        List<TwMixtagRtDomain> mixTagRtCreateList = new ArrayList<TwMixtagRtDomain>();

        if (mixTagRtList != null && mixTagRtList.size() > 0) {
            // It copies to a registration list from search results list.
            // 検索結果リストから登録リストへコピー
            for (int i = 0; i < mixTagRtList.size(); i++ ) {
                W2005MixTagRtDomain itemDomain = mixTagRtList.get(i);
                
                TwMixtagRtDomain createDomain = new TwMixtagRtDomain();
                CommonUtil.copyPropertiesDomainToDomain(createDomain, itemDomain);
                createDomain.setDscId(itemDomain.getLoginUserDscId());
                commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W2018);
                // Only leading record is "Y."
                // 先頭レコードのみ"Y"
                if (i == 0) {
                    createDomain.setBoxFlg(FLAG_Y);
                }else{
                    createDomain.setBoxFlg(FLAG_N);
                }
                mixTagRtCreateList.add(createDomain);
            }
        }
        
        return mixTagRtCreateList;
    }

    /**
     * Calculation of G/W.
     * <br /> G/Wの計算。
     *
     * @param mixTag MixTag domain<br />MixTagドメイン
     * @throws ApplicationException When this is not able to search<br />検索できなかった場合
     */
    protected void getGrossWeight(W2005MixTagDomain mixTag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        W2005MixTagRtCriteriaDomain criteria = new W2005MixTagRtCriteriaDomain();
        // Setting of property
        // プロパティの設定
        criteria.setDscId(mixTag.getLoginUserDscId());
        // data acquisition
        // データ取得
        List<? extends W2005MixTagRtDomain> list = w2005MixTagDao.searchTwMixtagRt(criteria);
        
        // G/W
        BigDecimal gw = BigDecimal.ZERO;

        for ( W2005MixTagRtDomain pltz : list ) {
            
            String itemWeightUnit = pltz.getWeightUnit();
            BigDecimal itemNetWeight = pltz.getVolume();

            BigDecimal dispWeight = commonService.convertWeightUnit(itemNetWeight, itemWeightUnit, mixTag.getWeightUnit());
            // check for overflow
            if (dispWeight == null) {
                Object[] params = { commonService.getResource(criteria.getLocale(), "label.grossWeight") };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            gw = gw.add(dispWeight);

        }

        // They are netWeight/NET WEIGHT of +mixTag as a result of a unit converted of the G/W = above.
        // G/W = 上記の単位変換の結果 + mixTagのnetWeight/ネット重量
        gw = gw.add(mixTag.getNetWeight());
        if (commonService.isWeightOverflow(gw)) {
            // check for overflow
            Object[] params = { commonService.getResource(criteria.getLocale(), "label.grossWeight") };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        
        mixTag.setGrossWeight(gw);
        
    }

    /**
     * Register a Mix Tag.
     * <br />MIXED現品票を登録します。
     * 
     * @param mixTag The domain holding the information on a Mix Tag<br />MIXED現品票の情報を保持するドメイン
     * @throws ApplicationException When a Mix Tag is not able to be registered<br />MIXED現品票が登録できなかった場合
     */
    protected void createTtMixTag(W2005MixTagDomain mixTag) throws ApplicationException {
        
        // The domain for registration is generated.
        // 登録用ドメインを生成
        TtMixtagDomain ttMixTag = new TtMixtagDomain();
        
        // This is a property copy to the domain for registration.
        // 登録用ドメインへプロパティコピー
        CommonUtil.copyPropertiesDomainToDomain(ttMixTag, mixTag);

        // Acquisition of Mix Tag No.
        // Mix Tag No.の取得
        String mixTagNo = getMixTagNo(mixTag);
        
        // Calculation of G/W
        // G/Wの計算
        getGrossWeight(mixTag);
        
        // Setting of a registration condition
        // 登録条件の設定
        ttMixTag.setMixTagNo(mixTagNo);
        // MULTI ITEM NO IN BOX STATUS ("10" fixation)  
        // 小箱内多品ステータス("10"固定)
        ttMixTag.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
        ttMixTag.setMixTagIssuerId(mixTag.getLoginUserDscId());
        ttMixTag.setMixTagIssuer(mixTag.getDscNm());
        ttMixTag.setGrossWeight(mixTag.getGrossWeight());
        // BOX NO ("0001" fixation)  
        // BOX NO("0001"固定)
        ttMixTag.setBoxNo(DEFAULT_BOX_NO);
        ttMixTag.setCurrCd(mixTag.getMixTagItemDomainList().get(0).getCurrCd());
        
        SimpleDateFormat df = new SimpleDateFormat(mixTag.getDateFormat());
        // The system date of Shipper is acquired.
        // Shipperのシステム日付を取得
        String timezoneId = commonService.searchTimezone(mixTag.getShipperCd());
        Date d = DateUtil.convertTime(new Date(), timezoneId);
        try {
            ttMixTag.setMixTagIssueDt(df.parse(df.format(d)));
        }  catch (ParseException e) {
            throw new SystemException(NXS_91_0001, e);
        }
        ttMixTag.setPlntCd(convertBlankOrNullToSpace(ttMixTag.getPlntCd()));
        
        // Setting of a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttMixTag, SCREEN_ID_W2008);

        // Registration of Mix Tag
        // MIXED現品票の登録
        ttMixtagService.create(ttMixTag);
        
        // Mix Tag No is set as a Mix-Tag domain.
        // Mix Tag NoをMIXED現品票ドメインに設定
        mixTag.setMixTagNo(mixTagNo);
    }

    /**
     * Register a MIXED ITEM NO.
     * <br />MIXED品目番号を登録します。
     * 
     * @param mixTag The domain holding the information on MixTag<br />MixTagの情報を保持するドメイン
     * @throws ApplicationException When a MIXED ITEM NO is not able to be registered<br />MIXED品目番号が登録できなかった場合
     */
    protected void createTtMixTagItemNo(W2005MixTagDomain mixTag) throws ApplicationException {
        
        for (W2005MixTagItemDomain mixTagItem : mixTag.getMixTagItemDomainList()) {
            // The domain for registration is generated.
            // 登録用ドメインを生成
            TtMixtagItemNoDomain ttMixTagItemNo = new TtMixtagItemNoDomain();

            // Setting of property
            // プロパティの設定
            CommonUtil.copyPropertiesDomainToDomain(ttMixTagItemNo, mixTagItem);

            // Setting of a registration condition
            // 登録条件の設定
            ttMixTagItemNo.setMixTagNo(mixTag.getMixTagNo());
            ttMixTagItemNo.setItemTyp(null);
            ttMixTagItemNo.setCustomerItemNo(null);

            if(!CheckUtil.isBlankOrNull(mixTagItem.getHiddenPlntCd())){
                ttMixTagItemNo.setPlntCd(mixTagItem.getHiddenPlntCd());
            }else{
                ttMixTagItemNo.setPlntCd(convertBlankOrNullToSpace(mixTag.getPlntCd()));
            }

            // Setting of a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(ttMixTagItemNo, SCREEN_ID_W2008);
            
            // Registration of MIXED ITEM NO
            // MIXED品目番号の登録
            ttMixtagItemNoService.create(ttMixTagItemNo);
        }
    }

    /**
     * Register a Mix Tag Receive Order.
     * <br />MIXED品目番号受注情報を登録します。
     * 
     * @param mixTag The domain holding the information on MixTag<br />MixTagの情報を保持するドメイン
     * @throws ApplicationException When a Mix Tag Receive Order is not able to be registered<br />MIXED品目番号受注情報が登録できなかった場合
     */
    protected void createMixTagOdr(W2005MixTagDomain mixTag) throws ApplicationException {
        
        for (W2005MixTagItemDomain mixTagItem : mixTag.getMixTagItemDomainList()) {
            for (W2005MixTagOdrDomain mixTagOdr : mixTagItem.getMixTagOdrDomainList()) {
                TtMixtagOdrDomain ttMixtagOdr = new TtMixtagOdrDomain();
                
                // Setting of property
                // プロパティの設定
                CommonUtil.copyPropertiesDomainToDomain(ttMixtagOdr, mixTagItem);
                CommonUtil.copyPropertiesDomainToDomain(ttMixtagOdr, mixTagOdr);

                // Setting of a registration condition
                // 登録条件の設定
                ttMixtagOdr.setMixTagNo(mixTag.getMixTagNo());
            
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(ttMixtagOdr, SCREEN_ID_W2008);
                
                // Registration of// MIXED ITEM NO
                // 梱包指示品目番号受注情報の登録
                ttMixtagOdrService.create(ttMixtagOdr);
            }
        }
    }

    /**
     * Delete the Mix Tag Work relevant to MixTag.
     * <br />MixTagに関連するMIXED品目番号ワークを削除します。
     *
     * @param mixTag The target MixTag<br />対象のMixTag
     * @throws ApplicationException When a Mix Tag Work is not able to be deleted<br />MIXED品目番号ワークが削除できなかった場合
     */
    protected void deleteTwMixTagNo(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TwMixtagCriteriaDomain criteria = new TwMixtagCriteriaDomain();
        criteria.setDscId(mixTag.getLoginUserDscId());
        // It will delete, if this is not 0 affair.
        // 0件でなければ、削除する
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix Tag Work
        // MIXED品目番号ワークの削除
        if (twMixtagService.searchCount(criteria) != 0) {
            twMixtagService.deleteByCondition(criteria);
        }
    }

    /**
     * Register a Mix Tag RT.
     * <br />MIXED用RT材を登録します。
     * 
     * @param mixTag The domain holding the information on MixTag<br />MixTagの情報を保持するドメイン
     * @throws ApplicationException When a Mix Tag RT is not able to be registered<br />MIXED用RT材が登録できなかった場合
     */
    protected void createTtMixTagRt(W2005MixTagDomain mixTag) throws ApplicationException {
        
        // Domain of a registration condition
        // 登録条件のドメイン
        TtMixtagRtDomain createDomain = new TtMixtagRtDomain();
        // Create of a condition domain
        // 条件ドメインの作成
        TwMixtagRtCriteriaDomain criteria = new TwMixtagRtCriteriaDomain();
        criteria.setDscId(mixTag.getLoginUserDscId());
        // search results list
        // 検索結果リスト
        List<TwMixtagRtDomain> list = twMixtagRtService.searchByCondition(criteria);
        
        if (list != null && list.size() > 0) {
            // It copies to a registration list from search results list.
            // 検索結果リストから登録リストへコピー
            for (int i = 0; i < list.size(); i++ ) {
                TwMixtagRtDomain itemDomain = list.get(i);
                CommonUtil.copyPropertiesDomainToDomain(createDomain, itemDomain);
                // MixTagNo is set up.
                // MixTagNoを設定
                createDomain.setMixTagNo(mixTag.getMixTagNo());
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W2008);
                // Registration of Mix Tag RT
                // MIXED用RT材の登録
                ttMixtagRtService.create(createDomain);
            }
        }
    }

    /**
     * Publish Mix Tag No.
     * <br />Mix Tag Noを発行します。
     *
     * @param mixTag Mix-Tag domain<br />MIXED現品票ドメイン
     * @return Published Mix Tag No<br />発行したMix Tag No
     * @throws ApplicationException When Mix Tag No is not able to be published<br />Mix Tag Noが発行できなかった場合
     */
    @SuppressWarnings("deprecation")
    protected String getMixTagNo(W2005MixTagDomain mixTag) throws ApplicationException {
        
        String shipperCd = mixTag.getShipperCd();
        String whCd = mixTag.getWhCd();
        
        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd));
        
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
        
        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String mixTagNoSeqKey 
            = String.format("%s%s%s%s", "M", shipperCd, whCd, format.format(sysdate).substring(1, 6));
        
        // Consecutive acquisition
        // 連番の取得
        String mixTagNoSeq
            = commonService.transactSequence(mixTagNoSeqKey, SEQ_TYP_MIX_TAG_NO, 1, SCREEN_ID_W2008).get(0);
        
        String mixTagNo = mixTagNoSeqKey + mixTagNoSeq;
        
        // A return of Mix Tag No
        // Mix Tag Noの返却
        return mixTagNo;
    }

    /**
     * Perform firm-order-receipt alloc processing.
     * <br />確定受注引当処理を行います。
     * 
     * @param mixTag The domain holding the information on a Mix Tag<br />MIXED現品票の情報を保持するドメイン
     * @throws ApplicationException When alloc processing is not completed<br />引当処理ができなかった場合
     */
    protected void updateTtExpRcvOdrOnRegister(W2005MixTagDomain mixTag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        TtExpRcvOdrCriteriaDomain searchCriteria = new TtExpRcvOdrCriteriaDomain();

        // A setting of the search condition of Export Receive Order
        // 輸出受注の検索条件の設定
        CommonUtil.copyPropertiesDomainToDomain(searchCriteria, mixTag);
        searchCriteria.setRcvOdrCompCd(mixTag.getShipperCd());
        searchCriteria.setOdrFirmFlg(FLAG_Y);
        searchCriteria.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        
        for (W2005MixTagItemDomain mixTagItem : mixTag.getMixTagItemDomainList()) {
            // A setting of the search condition of Export Receive Order
            // 輸出受注の検索条件の設定
            searchCriteria.setItemNo(mixTagItem.getItemNo());
            searchCriteria.setPkgCd(mixTagItem.getPkgCd());
            searchCriteria.setPreferredOrder("ETD_DUE_DT, CUSTOMER_PO_NO, ODR_CTRL_NO");
            
            // Search of an Export Receive Order (lock)  
            // 輸出受注の検索 (ロック)
            List<? extends TtExpRcvOdrDomain> ttExpRcvOdrList = w2005MixTagDao.lockTtExpRcvOdr(searchCriteria);

            // Mix-Tag-Receive-Order list create
            // MIXED品目番号受注情報リスト作成
            List<W2005MixTagOdrDomain> mixTagOdrList = new ArrayList<W2005MixTagOdrDomain>();
            
            // A setting of ALLOC QUANTITY (remaining)
            // 引当数量(残)の設定
            BigDecimal actualPkgQty = mixTagItem.getQty();

            // This is an alloc from a part for the past.
            // 過去分より引当
            for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList) {
                // Calculation of a Shipment remaining
                // 出荷残の算出
                BigDecimal restQty = ttExpRcvOdr.getOdrQty().subtract(ttExpRcvOdr.getPltzAllocQty());

                // Determination of an ALLOC QUANTITY
                // 引当数量の決定
                BigDecimal allocQty = BigDecimal.ZERO;
                if (0 < actualPkgQty.compareTo(restQty)) {
                    allocQty = restQty;
                } else {
                    allocQty = actualPkgQty;
                }

                // The update of ALLOC QUANTITY (remaining)
                // 引当数量(残)の更新
                actualPkgQty = actualPkgQty.subtract(allocQty);
                
                // A setting of INSTRUCTION QUANTITY, and a SHIPPED TYPE
                // 梱包指示数量、出荷済み区分の設定
                ttExpRcvOdr.setPltzAllocQty(ttExpRcvOdr.getPltzAllocQty().add(allocQty));
                if (ttExpRcvOdr.getOdrQty().equals(ttExpRcvOdr.getPltzAllocQty())) {
                    ttExpRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
                }
                
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttExpRcvOdr, SCREEN_ID_W2008);
                
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
                
                // An export information is set to Mix-Tag-Receive-Order domain.
                // MIXED品目番号受注情報ドメインに輸出情報をセット
                W2005MixTagOdrDomain mixTagOdr = new W2005MixTagOdrDomain();
                CommonUtil.copyPropertiesDomainToDomain(mixTagOdr, ttExpRcvOdr);

                // Setting of an ALLOC QUANTITY
                // 引当数量の設定
                mixTagOdr.setAllocQty(allocQty);
                
                // It sets to Mix-Tag-Receive-Order list.
                // MIXED品目番号受注情報リストにセット
                mixTagOdrList.add(mixTagOdr);
                
                // When ALLOC QUANTITY (remaining) does not remain
                // 引当数量(残)が残っていない場合
                if (actualPkgQty.compareTo(BigDecimal.ZERO) == 0) {
                    break;
                }
            }
            
            // When ALLOC QUANTITY (remaining) remains
            // 引当数量(残)が残っている場合
            if (0 < actualPkgQty.compareTo(BigDecimal.ZERO)) {
                throw new GscmApplicationException(NXS_E1_0008);
            }
            
            // A setting of Mix-Tag-Receive-Order list
            // MIXED品目番号受注情報リストの設定
            mixTagItem.setMixTagOdrDomainList(mixTagOdrList);
        }
    }

    /**
     * Update or register a Temp Stock.
     * <br />仮在庫を更新または登録します。
     * 
     * @param mixTag The domain holding the information on MixTag<br />MixTagの情報を保持するドメイン
     * @param isRegister When using from registration processing, this is true, and this is false except it (when using from cancellation processing).<br />登録処理から利用する場合はtrue、それ以外(キャンセル処理から利用する場合)はfalse
     * @throws ApplicationException At the time of generating, such as DB error<br />DBエラー等発生時
     */
    protected void transactTtTmpStock(W2005MixTagDomain mixTag, boolean isRegister) throws ApplicationException {
        
        for (W2005MixTagItemDomain mixTagItem : mixTag.getMixTagItemDomainList()) {
            TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();

            // Setting of a condition domain
            // 条件ドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(criteria, mixTag);
            CommonUtil.copyPropertiesDomainToDomain(criteria, mixTagItem);
            
            // Lock of a Temp Stock
            // 仮在庫のロック
            TtTmpStockDomain ttTmpStock = ttTmpStockService.lockByKeyNoWait(criteria);
            
            // When update place does not exist, it updates insertion and except it.
            // 更新先が存在しない場合は挿入、それ以外は更新
            if (isRegister && ttTmpStock == null) {
                ttTmpStock = new TtTmpStockDomain();
                
                // Setting of property
                // プロパティの設定
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStock, mixTag);
                CommonUtil.copyPropertiesDomainToDomain(ttTmpStock, mixTagItem);
                
                // Setting of a QUANTITY
                // 数量の設定
                ttTmpStock.setQty(mixTagItem.getQty());

                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(ttTmpStock, SCREEN_ID_W2008);
                
                // Registration of a Temp Stock
                // 仮在庫の登録
                ttTmpStockService.create(ttTmpStock);
            } else {
                // Setting of a QUANTITY
                // 数量の設定
                if (isRegister) {
                    ttTmpStock.setQty(ttTmpStock.getQty().add(mixTagItem.getQty()));
                } else {
                    ttTmpStock.setQty(ttTmpStock.getQty().subtract(mixTagItem.getQty()));
                }
                
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttTmpStock, SCREEN_ID_W2008);
                
                // Update of a Temp Stock
                // 仮在庫の更新
                ttTmpStockService.update(ttTmpStock);
            }
        }
    }

    /**
     * Register an ordering alloc track record. (Starting of WS2005)
     * <br />受注引当実績を登録します。（WS2005の起動）
     * 
     * @param mixTag The domain holding the information on MixTag<br />MixTagの情報を保持するドメイン
     * @throws ApplicationException When an ordering alloc track record is not able to be registered<br />受注引当実績が登録できなかった場合
     */
    protected void createRcvOdrAlloc(W2005MixTagDomain mixTag) throws ApplicationException {

        // The parameter of Web service
        // Webサービスのパラメータ
        String shipperCd = mixTag.getShipperCd();
        String nightFlg = commonService.searchCigmaNightFlg(mixTag.getShipperCd());
        Ws2005ParamDomain param = createWs2005Param(mixTag.getMixTagItemDomainList());

        // The call of Web service
        // Webサービスの呼出し
        ws2005RestService.createRcvOdrAlloc(shipperCd, nightFlg, param);
    }

    /**
     * Create the parameter of WS2005 from a MIXED ITEM NO (and Mix Tag Receive Order).
     * <br />MIXED品目番号(およびMIXED品目番号受注情報)からWS2005のパラメータを作成します。
     *
     * @param mixTagItemDomainList The list of MIXED ITEM NOs<br />MIXED品目番号のリスト 
     * @return The parameter of WS2005<br />WS2005のパラメータ
     */
    protected Ws2005ParamDomain createWs2005Param(List<? extends W2005MixTagItemDomain> mixTagItemDomainList) {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        List<Ws2005ParamItemDomain> paramItemList = new ArrayList<Ws2005ParamItemDomain>();
        for (W2005MixTagItemDomain mixTagItem : mixTagItemDomainList) {
            for (W2005MixTagOdrDomain mixTagOdr : mixTagItem.getMixTagOdrDomainList()) {
                Ws2005ParamItemDomain paramItem = new Ws2005ParamItemDomain();
                
                paramItem.setCustomerNo(mixTagOdr.getCustomerCd());
                paramItem.setShipTo(mixTagOdr.getLgcyShipTo());
                paramItem.setPN(mixTagOdr.getItemNo());
                paramItem.setTransWayCd(mixTagOdr.getTrnsCd());
                paramItem.setEtdDueDt(df.format(mixTagOdr.getEtdDueDt()));
                paramItem.setCustomerPoNo(mixTagOdr.getCustomerPoNo());
                paramItem.setCustomerPn(mixTagOdr.getCustomerItemNo());
                paramItem.setOdrCtrlNo(mixTagOdr.getOdrCtrlNo().toPlainString());
                paramItem.setCustomerPnOrg(mixTagOdr.getCustomerItemNoOrg());
                paramItem.setShipInstrAllocQty(mixTagOdr.getPltzAllocQty().toPlainString());
                
                paramItemList.add(paramItem);
            }
        }
        
        Ws2005ParamDomain param = new Ws2005ParamDomain();
        param.setDetailList(paramItemList);
        
        return param;
    }

    /**
     * Acquire the Mix Tag Receive Order corresponding to MixTagNO.
     * <br />MixTagNOに対応するMIXED品目番号受注情報を取得します。
     *
     * @param mixTag The target MixTag<br />対象のMixTag
     * @return Mix Tag Receive Order<br />MIXED品目番号受注情報
     * @throws ApplicationException When data is unacquirable<br />データが取得できない場合
     */
    protected List<TtMixtagOdrDomain> searchTtMixTagOdr(W2005MixTagDomain mixTag) 
        throws ApplicationException {
        
        // Create of search-condition domain (since it sorts in order of * major key, a specified of a sort order is omitted)  
        // 検索条件ドメインの作成 (※主キーの順でソートされるので、ソート順の指定は省略)
        TtMixtagOdrCriteriaDomain criteria = new TtMixtagOdrCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        
        // Acquisition of Mix Tag Receive Order
        // MIXED品目番号受注情報の取得
        List<TtMixtagOdrDomain> ttMixTagOdrList =  ttMixtagOdrService.searchByCondition(criteria);
        
        return ttMixTagOdrList;
    }

    /**
     * Update an Export Receive Order based on a Mix Tag Receive Order. <br />
     * MIXED品目番号受注情報をもとに輸出受注を更新します。
     * 
     * @param ttMixTagOdrList MixTag ITEM-NO ordering information<br />MixTag品目番号受注情報
     * @param mixTag The target MixTag<br />対象のMixTag
     * @throws ApplicationException When an Export Receive Order is not able to be updated<br />輸出受注が更新できなかった場合
     */
    protected void updateTtExpRcvOdrOnRegisterCancel(List<TtMixtagOdrDomain> ttMixTagOdrList, W2005MixTagDomain mixTag)
        throws ApplicationException {

        for (W2005MixTagItemDomain mixTagItem : mixTag.getMixTagItemDomainList()) {
            List<W2005MixTagOdrDomain> mixTagOdrList = new ArrayList<W2005MixTagOdrDomain>();
            for (TtMixtagOdrDomain ttMixTagOdr : ttMixTagOdrList) {
                if (mixTagItem.getItemNo().equals(ttMixTagOdr.getItemNo())
                    && mixTagItem.getPkgCd().equals(ttMixTagOdr.getPkgCd())) {
                    TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
                    // Setting of a condition domain
                    // 条件ドメインの設定
                    criteria.setRcvOdrCompCd(ttMixTagOdr.getRcvOdrCompCd());
                    criteria.setCustomerCd(ttMixTagOdr.getCustomerCd());
                    criteria.setLgcyShipTo(ttMixTagOdr.getLgcyShipTo());
                    criteria.setItemNo(ttMixTagOdr.getItemNo());
                    criteria.setPkgCd(ttMixTagOdr.getPkgCd());
                    criteria.setTrnsCd(ttMixTagOdr.getTrnsCd());
                    criteria.setEtdDueDt(ttMixTagOdr.getEtdDueDt());
                    criteria.setCustomerPoNo(ttMixTagOdr.getCustomerPoNo());
                    criteria.setCustomerItemNo(ttMixTagOdr.getCustomerItemNo());
                    criteria.setCustomerItemNoOrg(ttMixTagOdr.getCustomerItemNoOrg());
                    criteria.setOdrCtrlNo(ttMixTagOdr.getOdrCtrlNo());

                    // Acquisition of an Export Receive Order
                    // 輸出受注の取得
                    TtExpRcvOdrDomain ttExpRcvOdr = ttExpRcvOdrService.searchByKey(criteria);

                    // Calculation of an Alloc QTY
                    // 梱包引当数量の計算
                    BigDecimal pltzAllocQty = ttExpRcvOdr.getPltzAllocQty().subtract(ttMixTagOdr.getAllocQty());

                    // A setting of Alloc QTY, and a SHIPPED TYPE
                    // 梱包引当数量、出荷済み区分の設定
                    ttExpRcvOdr.setPltzAllocQty(pltzAllocQty);
                    ttExpRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);

                    // Setting of a common column
                    // 共通カラムの設定
                    commonService.setCommonPropertyForUpdate(ttExpRcvOdr, SCREEN_ID_W2008);

                    // Update of an Export Receive Order
                    // 輸出受注の更新
                    ttExpRcvOdrService.updateByCondition(ttExpRcvOdr, criteria);

                    // mixTagOdr is created from Mix Tag Receive Order.
                    // MIXED品目番号受注情報からmixTagOdrを作成
                    W2005MixTagOdrDomain mixTagOdr = new W2005MixTagOdrDomain();

                    // Setting of property
                    // プロパティの設定
                    CommonUtil.copyPropertiesDomainToDomain(mixTagOdr, ttMixTagOdr);

                    // Setting of an ALLOC QUANTITY
                    // 引当数量の設定
                    mixTagOdr.setAllocQty(mixTagOdr.getAllocQty().negate());
                    mixTagOdr.setPltzAllocQty(pltzAllocQty);

                    mixTagOdrList.add(mixTagOdr);

                }
            }
            mixTagItem.setMixTagOdrDomainList(mixTagOdrList);
        }
    }

    /**
     * Delete a Mix Tag.
     * <br />MIXED現品票を削除します。
     *
     * @param mixTag The target multiple p/n packaged in box<br />対象の小箱内多品番梱包
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtMixTag(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix Tag
        // MIXED現品票の削除
        int count = ttMixtagService.searchCount(criteria);
        if(count > 0){
            ttMixtagService.deleteByCondition(criteria);
        }
        
    }

    /**
     * Delete a MIXED ITEM NO.
     * <br />MIXED品目番号を削除します。
     *
     * @param mixTag The target multiple p/n packaged in box<br />対象の小箱内多品番梱包
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtMixTagItemNo(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtMixtagItemNoCriteriaDomain criteria = new TtMixtagItemNoCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        criteria.setSearchCountCheckFlg(false);
        // A delete of MIXED ITEM NO
        // MIXED品目番号の削除
        int count = ttMixtagItemNoService.searchCount(criteria);
        if(count > 0){
            ttMixtagItemNoService.deleteByCondition(criteria);
        }
    }

    /**
     * Delete a Mix Tag Receive Order.
     * <br />MIXED品目番号受注情報を削除します。
     *
     * @param mixTag The target multiple p/n packaged in box<br />対象の小箱内多品番梱包
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtMixTagOdr(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtMixtagOdrCriteriaDomain criteria = new TtMixtagOdrCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix Tag Receive Order
        // MIXED品目番号受注情報の削除
        int count = ttMixtagOdrService.searchCount(criteria);
        if(count > 0){
            ttMixtagOdrService.deleteByCondition(criteria);
        }
    }

    /**
     * Delete a Mix Tag KANBAN.
     * <br />MIX品かんばん情報を削除します。
     *
     * @param mixTag The target multiple p/n packaged in box<br />対象の小箱内多品番梱包
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtMixKanban(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtMixKanbanCriteriaDomain criteria = new TtMixKanbanCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix Tag KANBAN
        // MIX品かんばん情報の削除
        int count = ttMixKanbanService.searchCount(criteria);
        if(count > 0){
            ttMixKanbanService.deleteByCondition(criteria);
        }
    }

    /**
     * Delete a Mix-Tag-RT information.
     * <br />MIXED用RT材情報を削除します。
     *
     * @param mixTag The target multiple p/n packaged in box<br />対象の小箱内多品番梱包
     * @throws ApplicationException When data is not able to be deleted<br />データが削除できなかった場合
     */
    protected void deleteTtMixTagRt(W2005MixTagDomain mixTag) throws ApplicationException {
        // Create of a condition domain
        // 条件ドメインの作成
        TtMixtagRtCriteriaDomain criteria = new TtMixtagRtCriteriaDomain();
        criteria.setMixTagNo(mixTag.getMixTagNo());
        criteria.setSearchCountCheckFlg(false);
        // A delete of Mix-Tag-RT information
        // MIXED用RT材情報の削除
        int count = ttMixtagRtService.searchCount(criteria);
        if(count > 0){
            ttMixtagRtService.deleteByCondition(criteria);
        }
    }

    /**
     * Replace Null to Zero
     * <br />NullをZeroに置き換えます。
     *
     * @param v original value<br />変換元
     * @return new value <br />変換先
     */
    protected BigDecimal convertNullToZero(BigDecimal v){
        if (v == null){
            return BigDecimal.ZERO;
        } else {
            return v;
        }
    }

    /**
     * Replace blank and null to white space
     * <br />Blank又はNullをSpaceに置き換えます。
     *
     * @param v original value<br />変換元
     * @return new value<br />変換先
     */
    protected String convertBlankOrNullToSpace(String v){
        if (CheckUtil.isBlankOrNull(v)){
            return new String(" ");
        } else {
            return v;
        }
    }
}
