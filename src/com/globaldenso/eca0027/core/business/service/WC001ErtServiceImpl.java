/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_TYP_PKG_MATERIALS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0080;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0081;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0128;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0129;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0130;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0131;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0149;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_WC001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QTY_UNIT_EA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RT_TYP_1WAY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.dao.WC001ErtDao;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of Empty RT materials service.
 * <br />Empty RT materialsサービスの実装クラスです。
 *
 * @author $Author: 10088DS01133 $
 * @version $Revision: 15438 $
 */
public class WC001ErtServiceImpl implements WC001ErtService {

    /**
     * Export-Ship-To-Shipping-Master service
     * <br />輸出送荷先出荷原単位サービス
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;
    
    /**
     * NEXUS-Company-Master service
     * <br />NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * PKG-Materials-MA service
     * <br />包装材原単位サービス
     */
    protected TmPkgMtrlService tmPkgMtrlService;

    /**
     * NEXUS-Ship-To-Master service
     * <br />NEXUS送荷先原単位サービス
     */
    protected TmNxsShipToService tmNxsShipToService;
    
    /**
     * Palletize service
     * <br />パレタイズサービス
     */
    protected TtPltzService ttPltzService;
    
    /**
     * Palletize-Item service
     * <br />パレタイズ対象品サービス
     */
    protected TtPltzItemService ttPltzItemService;
    
    /**
     * Elegance service for LC001
     * <br />LC001対象品サービス
     */
    protected LC001ReportService lc001ReportService;

    /**
     * User authentication service
     * <br />ユーザ認証サービス
     */
    protected UserAuthService userAuthService;

    /**
     * WS9002Rest service
     * <br />WS9002Restサービス
     */
    protected Ws9002RestService ws9002RestService;

    /**
     * WC001ErtDao service
     * <br />WC001ErtDaoサービス
     */
    protected WC001ErtDao wc001ErtDao;
      

    /**
     * Common service
     * <br />共通サービス
     */
    private CommonService commonService;
    
    /**
     * Type in the functional overview of the constructor.
     */
    public WC001ErtServiceImpl() {
        super();
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
     * Setter method for tmExpShipToShippingService.
     *
     * @param tmExpShipToShippingService Set for tmExpShipToShippingService
     */
    public void setTmExpShipToShippingService(
        TmExpShipToShippingService tmExpShipToShippingService) {
        this.tmExpShipToShippingService = tmExpShipToShippingService;
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
     * Setter method for tmPkgMtrlService.
     *
     * @param tmPkgMtrlService Set for tmPkgMtrlService
     */
    public void setTmPkgMtrlService(TmPkgMtrlService tmPkgMtrlService) {
        this.tmPkgMtrlService = tmPkgMtrlService;
    }
    
    /**
     * Setter method for tmNxsShipToService.
     *
     * @param tmNxsShipToService Set for tmNxsShipToService
     */
    public void setTmNxsShipToService(TmNxsShipToService tmNxsShipToService) {
        this.tmNxsShipToService = tmNxsShipToService;
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
     * Setter method for ttPltzItemService.
     *
     * @param ttPltzItemService Set for ttPltzItemService
     */
    public void setTtPltzItemService(TtPltzItemService ttPltzItemService) {
        this.ttPltzItemService = ttPltzItemService;
    }

    /**
     * Setter method for lC001ReportService.
     *
     * @param reportService Set for lC001ReportService
     */
    public void setLc001ReportService(LC001ReportService reportService) {
        lc001ReportService = reportService;
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
     * Setter method for wC001ErtDao.
     *
     * @param ertDao Set for wC001ErtDao
     */
    public void setWc001ErtDao(WC001ErtDao ertDao) {
        wc001ErtDao = ertDao;
    }

    /**
     * Setter method for ws9002RestService.
     *
     * @param ws9002RestService Set for ws9002RestService
     */
    public void setWs9002RestService(Ws9002RestService ws9002RestService) {
        this.ws9002RestService = ws9002RestService;
    }

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyAfterDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String timezoneId){

        if (StringUtils.isEmpty(date)) {
            return true;
        }
        
        if (dateFormat == null) {
            // Acquisition of Date format
            // 日付フォーマットの取得
            WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
            CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
            dateFormat =  commonService.getResource(commonInfo.getLocale(), REPORT_DATE_FORMAT);
        }
        
        // past day check
        // 過去日チェック
        return commonService.validateAfterDate(date, dateFormat, timezoneId);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyCmlNoFromCmlNoTo(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyCmlNoFromCmlNoTo(String fromCmlNo, String toCmlNo){
        
        if (!StringUtils.isEmpty(fromCmlNo) && !StringUtils.isEmpty(toCmlNo)) {
            if (fromCmlNo.compareTo(toCmlNo) > 0) {
                // When FROM is larger
                // FROMの方が大きい場合
                return false;
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyCmlNoFromCmlNoToInput(java.lang.String,java.lang.String)
     */
    public boolean validateConsistencyCmlNoFromCmlNoToInput(String fromCmlNo, String toCmlNo){

        // Only TO is specified.
        // TOのみ指定
        if (StringUtils.isEmpty(fromCmlNo) && !StringUtils.isEmpty(toCmlNo)) {
            return false;
        }
        return true;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyContents(java.util.List, java.util.List, java.util.List)
     */
    public boolean validateConsistencyContents(List<String> itemNoList, List<String> modelCdList, List<String> qtyList){
        // PACKAGE-ITEM-NO input check
        // 包装材品番入力チェック
        boolean blPltzItemNoInput = false;
        for (int i = 0; i < itemNoList.size(); i++) {
            if (!StringUtils.isEmpty(itemNoList.get(i))) {
                blPltzItemNoInput = true;
                break;
            }
        }
        return blPltzItemNoInput;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyContentsQty(java.lang.String)
     */
    public boolean validateConsistencyContentsQty(String contentsQty){

        if (StringUtils.isEmpty(contentsQty)) {
            return true;
        }
        
        // When there is nothing even numerically
        // 数値ですらない場合
        if (!CheckUtil.isNumericalNumber(contentsQty)) {
            return false;
        }
        // input value < 1
        // 入力値 < 1
        BigDecimal bdPalletQty = new BigDecimal(contentsQty);
        if (bdPalletQty.compareTo(new BigDecimal(1)) < 0) {
            return false;
        }
        return true;
    
    }
     
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyGw(java.lang.String)
     */
    public boolean validateConsistencyGw(String gw){

        if (StringUtils.isEmpty(gw)) {
            return false;
        }
        
        // When there is nothing even numerically
        // 数値ですらない場合
        if (!CheckUtil.isNumericalNumber(gw)) {
            return false;
        }
        // input value <= 0
        // 入力値 <= 0
        BigDecimal bdGw = new BigDecimal(gw);
        if (bdGw.compareTo(new BigDecimal(0)) <= 0) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyLengthWidthHeight(java.lang.String)
     */
    public boolean validateConsistencyLengthWidthHeight(String value){

        if (StringUtils.isEmpty(value)) {
            return false;
        }
        
        // When there is nothing even numerically
        // 数値ですらない場合
        if (!CheckUtil.isNumericalNumber(value)) {
            return false;
        }
        // input value <= 0
        // 入力値 <= 0
        BigDecimal bdValue = new BigDecimal(value);
        if (bdValue.compareTo(new BigDecimal(0)) <= 0) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyPalletQty(java.lang.String)
     */
    public boolean validateConsistencyPalletQty(String palletQty){

        if (StringUtils.isEmpty(palletQty)) {
            return false;
        }
        
        // When there is nothing even numerically
        // 数値ですらない場合
        if (!CheckUtil.isNumericalNumber(palletQty)) {
            return false;
        }
        // input value < 1
        // 入力値 < 1
        BigDecimal bdPalletQty = new BigDecimal(palletQty);
        if (bdPalletQty.compareTo(new BigDecimal(1)) < 0) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyPkgItemNoQty(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyPkgItemNoQty(String itemNo, String qty){
        // A PACKAGE ITEM NO and QUANTITY related check
        // 包装材品番・数量関連チェック
        if ((!StringUtils.isEmpty(itemNo) && StringUtils.isEmpty(qty))
            || (StringUtils.isEmpty(itemNo) && !StringUtils.isEmpty(qty))
        ) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd)
        throws ApplicationException{
        // Authority check
        // 権限チェック
        return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_WC001R, shipperCd, plntCd);
    }
    
    // --------------------------------- Database check method validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseCompWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException{
        return commonService.validateCompWh(compCd, whCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException{

        return commonService.validateShipper(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseShipTo(java.lang.String)
     */
    public boolean validateDatabaseShipTo(String shipTo)
        throws ApplicationException{
        
        return commonService.validateShipTo(shipTo);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(String, List, List, String)
     */
    public List<String> validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(String shipperCdHidden, List<String> pltzItemNoList, List<Integer> resultPartList, String languageCd)
        throws ApplicationException{
        
        List<String> returnList = new ArrayList<String>();
        WC001ErtCriteriaDomain criteria = new WC001ErtCriteriaDomain();

        // OWNER_COMP         This screen [92] : Shipper_h
        // OWNER_COMP       本画面【92】：Shipper_h
        criteria.setOwnerComp(shipperCdHidden);

        String firstCurrCd = "";
        boolean firstFlg = false;

        for (int i = 0; i < pltzItemNoList.size(); i++) {
            if (!StringUtils.isEmpty(pltzItemNoList.get(i))) {

                // PKG_MATERIAL_PN    This screen [42]:Contents1_PKG_Item_No (*)  
                // PKG_MATERIAL_PN  本画面【42】：Contents1_PKG_Item_No（※）
                criteria.setPkgItemNo(pltzItemNoList.get(i));
                WC001ErtDomain domain = wc001ErtDao.searchTmPkgMtrlByKey(criteria);
                if (domain == null) {
                    returnList.add(NXS_E7_0149);
                    resultPartList.add(i);
                    continue;
                }
                
                // The CURRENCY CODE of the PACKAGE ITEM NO of head is made positive.
                // 先頭の包装材品番の通貨コードを正とする
                if (firstFlg == false) {
                    firstCurrCd = domain.getCurrCd();
                    firstFlg = true;
                }
                // RT_TYP = 1 of corresponding data (1WAY)  
                // 該当データのRT_TYP = 1 (1WAY)
                if (RT_TYP_1WAY.equals(domain.getRtTyp())) {
                    returnList.add(NXS_E7_0080);
                    resultPartList.add(i);
                }
                // When CURRENCY_CD of corresponding data is not unique
                // 該当データのCURRENCY_CDが一意でない場合
                if (domain.getCurrCd() != null){
                    if (!domain.getCurrCd().equals(firstCurrCd)) {
                        returnList.add(NXS_E7_0081);
                        resultPartList.add(i);
                    }
                } else {
                    returnList.add(NXS_E7_0081);
                    resultPartList.add(i);
                }
            }
        }
        return returnList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseTtPltzOnContensOfABoxCancelByAuth(WC001ErtCriteriaDomain)
     */
    public String[] validateDatabaseTtPltzOnContensOfABoxCancelByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        String[] retArray = {"", ""};

        // Acquisition of object data
        // 対象データの取得
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMarkGreaterThanEqual(criteria.getFromMainMark());
        ttPltzCriteriaDomain.setMainMarkLessThanEqual(criteria.getToMainMark());
        List<TtPltzDomain> list = ttPltzService.searchByCondition(ttPltzCriteriaDomain);

        if (list == null || list.size() == 0) {
            // When the acquisition number is zero affair
            // 取得件数が0件の場合
            retArray[0] = NXS_E7_0129;
            retArray[1] = criteria.getFromMainMark();
            return retArray;
            
        } else if (list.size() >= 100) {
            // When acquisition result is 100 or more affairs
            // 取得結果が100件以上の場合
            retArray[0] = GSCM_E0_0038;
            retArray[1] = criteria.getFromMainMark();
            return retArray;
        } else {
            for (int i = 0; i < list.size(); i++) {
                TtPltzCriteriaDomain ttPltzCriteriaDomain2 = new TtPltzCriteriaDomain();
                ttPltzCriteriaDomain2.setMainMark(list.get(i).getMainMark());
                TtPltzDomain ttPltzDomain = ttPltzService.lockByKeyNoWait(ttPltzCriteriaDomain2);
                
                if (ttPltzDomain == null) {
                    // Exclusion check
                    // When deleted before a  *[89]:Print CML (button) click by the others
                    // 排他チェック
                    // ※【89】：Print CML(button)クリック前に他者により、削除された場合
                    retArray[0] = NXS_E7_0129;
                    retArray[1] = list.get(i).getMainMark();
                    return retArray;
                    

                } else if (!ttPltzDomain.getCmlTyp().equals(CML_TYPE_ERT)) {
                    // When at least one CML_TYP is except "2" in object record
                    // (when the inputted MAIN MARK is not E-RT)
                    // 対象レコードが1件でもCML_TYPが"2"以外の場合
                    // （入力したメインマークがE-RTでない場合）
                    retArray[0] = NXS_E7_0130;
                    retArray[1] = ttPltzDomain.getMainMark();
                    return retArray;

                } else if (!ttPltzDomain.getPltzStatus().equals(PLTZ_STATUS_PLTZ)) {
                    // When at least one PALLETIZE_STATUS_CD is except "10" in object record
                    // 対象レコードが1件でもPALLETIZE_STATUS_CDが"10"以外の場合
                    retArray[0] = NXS_E7_0131;
                    retArray[1] = ttPltzDomain.getMainMark();
                    return retArray;
                    
                } else if(!ttPltzDomain.getPackingWhCompCd().equals(ttPltzDomain.getCurWhCompCd())
                    || !ttPltzDomain.getPackingWhCd().equals(ttPltzDomain.getCurWhCd())) {
                    // 現在倉庫が、梱包倉庫と異なる場合はエラー
                    retArray[0] = NXS_E1_0004;
                    retArray[1] = ttPltzDomain.getMainMark();
                    return retArray;
                }

            }
        }

        // Authority check ----------------------------------------------------------------------------------------------
        // 権限チェック ----------------------------------------------------------------------------------------------
        if (userAuthService.hasRegisterAll()) {
            return retArray;
        }
        
        // - Acquisition of authority information
        //      An item is set to {@link UserAuthDomain}, {@link UserAuthService#getUserAuthCompList (UserAuthDomain)} is called, and search data is acquired.
        // - 権限情報の取得
        //     {@link UserAuthDomain}に項目を設定し、{@link UserAuthService#getUserAuthCompList(UserAuthDomain)}を呼出し、検索データを取得する
        // 
        List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_WC001R);

        // An error will be made if details (details whose update authority flag created by Search action is not ON) without update authority exist.
        // 更新権限のない明細(Searchアクションで作成した更新権限フラグがオンでない明細)が存在すればエラー
        criteria.setUserAuthList(userAuthList);
        List<? extends WC001ErtDomain> authList = wc001ErtDao.searchTtPltzByAuth(criteria);
        
        // In registerAuthFlg !="1", an error is made.
        // registerAuthFlg ≠ "1" の場合はエラー
        for (WC001ErtDomain domain : authList) {

            String registerAuthFlg = domain.getAuth();
            if (CheckUtil.isBlankOrNull(registerAuthFlg) || FLAG_OFF.equals(registerAuthFlg)) {
                retArray[0] = GSCM_I0_0009;
                retArray[1] = domain.getMainMark();
                return retArray;
            }
        }
        return retArray;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(WC001ErtCriteriaDomain)
     */
    public String[] validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        String[] retArray = {"", ""};

        // Acquisition of object data
        // 対象データの取得
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMarkGreaterThanEqual(criteria.getFromMainMark());
        ttPltzCriteriaDomain.setMainMarkLessThanEqual(criteria.getToMainMark());
        List<TtPltzDomain> list = ttPltzService.searchByCondition(ttPltzCriteriaDomain);

        if (list == null || list.size() == 0) {
            // When the acquisition number is zero affair
            // 取得件数が0件の場合
            retArray[0] = NXS_E7_0129;
            retArray[1] = criteria.getFromMainMark();
            return retArray;
            
        } else if (list.size() >= 100) {
            // When acquisition result is 100 or more affairs
            // 取得結果が100件以上の場合
            retArray[0] = GSCM_E0_0038;
            retArray[1] = criteria.getFromMainMark();
            return retArray;
        } else {

            for (int i = 0; i < list.size(); i++) {
                TtPltzCriteriaDomain ttPltzCriteriaDomain2 = new TtPltzCriteriaDomain();
                ttPltzCriteriaDomain2.setMainMark(list.get(i).getMainMark());
                TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(ttPltzCriteriaDomain2);
                
                if (ttPltzDomain == null) {
                    // Exclusion check
                    // When deleted before a *[89]:Print CML (button) click by the others
                    // 排他チェック
                    // ※【89】：Print CML(button)クリック前に他者により、削除された場合
                    retArray[0] = NXS_E7_0129;
                    retArray[1] = list.get(i).getMainMark();
                    return retArray;
                    

                } else if (!ttPltzDomain.getCmlTyp().equals(CML_TYPE_ERT)) {
                    // When at least one CML_TYP is except "2" in object record
                    // (when the inputted MAIN MARK is not E-RT)
                    // 対象レコードが1件でもCML_TYPが"2"以外の場合
                    // （入力したメインマークがE-RTでない場合）
                    retArray[0] = NXS_E7_0130;
                    retArray[1] = ttPltzDomain.getMainMark();
                    return retArray;
                    
                }

            }
        }

        // Authority check ----------------------------------------------------------------------------------------------
        // 権限チェック ----------------------------------------------------------------------------------------------
        if (userAuthService.hasRegisterAll()) {
            return retArray;
        }
        
        // - Acquisition of authority information
        //      An item is set to {@link UserAuthDomain}, {@link UserAuthService#getUserAuthCompList (UserAuthDomain)} is called, and search data is acquired.
        // - 権限情報の取得
        //     {@link UserAuthDomain}に項目を設定し、{@link UserAuthService#getUserAuthCompList(UserAuthDomain)}を呼出し、検索データを取得する
        // 
        List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_WC001R);

        // An error will be made if details (details whose update authority flag created by Search action is not ON) without update authority exist.
        // 更新権限のない明細(Searchアクションで作成した更新権限フラグがオンでない明細)が存在すればエラー
        criteria.setUserAuthList(userAuthList);
        List<? extends WC001ErtDomain> authList = wc001ErtDao.searchTtPltzByAuth(criteria);
        
        // In registerAuthFlg !="1", an error is made.
        // registerAuthFlg ≠ "1" の場合はエラー
        for (WC001ErtDomain domain : authList) {

            String registerAuthFlg = domain.getAuth();
            if (CheckUtil.isBlankOrNull(registerAuthFlg) || FLAG_OFF.equals(registerAuthFlg)) {
                retArray[0] = GSCM_I0_0009;
                retArray[1] = domain.getMainMark();
                return retArray;
            }
        }
        return retArray;
    }
    
    // ST987 DEL START
    ///**
    // * {@inheritDoc}
    // * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#validateDatabaseWs9002OnContensOfABoxRegister(java.lang.String, java.lang.String)
    // */
    //public boolean validateDatabaseWs9002OnContensOfABoxRegister(String shipperCd, String plntCd)
    //    throws ApplicationException{
    //    Ws9002ResultDomain result = ws9002RestService.validateDatabasePlant(shipperCd, plntCd);
    //    boolean flg = false;
    //    
    //    if (WS_RESULT_SUCCESS.equals(result.getResultCode())
    //        && result.getPlantInfo() != null && !CheckUtil.isBlankOrNull(result.getPlantInfo().getPlantCd())) {
    //        flg = true;
    //    }
    //    return flg;
    //}
    // ST987 DEL END
    
    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#createOnContensOfABoxRegister(com.globaldenso.eca0027.core.business.domain.WC001ErtDomain)
     */
    public List<? extends WC001ErtDomain> createOnContensOfABoxRegister(WC001ErtDomain ert)
        throws ApplicationException{

        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // A time zone converted date is acquired.
        // タイムゾーン変換日付を取得
        Date sysdate = getTimeZoneDt(ert.getShipperCd());

        // Palletize Item
        // パレタイズ対象品
        List<TtPltzItemDomain> ttPltzItemList = new ArrayList<TtPltzItemDomain>();

        // This is acquisition of an acquisition -  consignee and Ship-to-name about a Ship-to information.
        // Ship-to情報を取得 - コンサイニと送荷先名称の取得
        TmNxsShipToCriteriaDomain tmNxsShipToCriteria = new TmNxsShipToCriteriaDomain();
        tmNxsShipToCriteria.setShipToCd(ert.getShipToCd());
        TmNxsShipToDomain tmNxsShipTo = tmNxsShipToService.searchByKey(tmNxsShipToCriteria);
        if(tmNxsShipTo != null) {
            ert.setShipToNmDisp(tmNxsShipTo.getShipToNm());
        }

        // Acquisition of CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE, and a CUSTOM TIMING TYPE
        // コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得
        WC001ErtCriteriaDomain tmExpShipToShippingCriteria = new WC001ErtCriteriaDomain();
        tmExpShipToShippingCriteria.setCompCd(ert.getShipperCd());
        tmExpShipToShippingCriteria.setShipToCd(ert.getShipToCd());
        tmExpShipToShippingCriteria.setAplyStrtDt(sysdate);
        WC001ErtDomain tmExpShipToShipping = wc001ErtDao.searchTmExpShipToShippingByKey(tmExpShipToShippingCriteria);
        // Existence check
        // 存在チェック
        if (tmExpShipToShipping == null || tmExpShipToShipping.getCompCd() == null || tmExpShipToShipping.getCompCd().equals("")) {
            Object[] params = {
                commonService.getResource(ert.getLocale(), "label.shipToCd")
            };
            errList.add(new MessageDomain("criteriaDomain.shipToCd", NXS_E7_0128, params));
            throw new ValidationException(errList);
            
        }
        
        // Screen return
        // 画面返却
        ert.setContainerSortingKey(tmExpShipToShipping.getContainerSortingKey());
        ert.setCustomTimingTyp(tmExpShipToShipping.getCustomTimingTyp());
        ert.setContainerLooseTyp(tmExpShipToShipping.getContainerLooseTyp());
        
        // - Assignment of order numbers of - Main Mark ----------------------------------------------------------------------
        // - Main Markの採番 ----------------------------------------------------------------------
        TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteria.setCompCd(ert.getShipperCd());
        TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteria);
        ert.setLengthUnit(tmNxsComp.getLengthUnit());   // [33]Length UNIT（Length）
        ert.setWeightUnit(tmNxsComp.getWeightUnit());   // [36]Volume UNIT
        ert.setVolumeUnit(tmNxsComp.getVolumeUnit());   // [37]Weight UNIT(N/W)
        ert.setLengthUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getLengthUnit()));
        ert.setWeightUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getWeightUnit()));
        ert.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getVolumeUnit()));
        
        // Create of an assignment-of-order-numbers key
        // Consecutive acquisition
        // 採番キーの作成
        // 連番の取得
        List<String> listMainMark = new ArrayList<String>();
        String seqKey = "";
        String seqChild = "";
        
        // Year (lower 1 figure)  
        // 年(下1桁)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        String keyY = sdf1.format(sysdate).substring(3, 4);
        
        // Days and months
        // 月日
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMdd");
        String keyMmdd = sdf2.format(sysdate);
        
        int intPalletQty = ert.getPalletQty().intValue();
        for (int i = 0; i < intPalletQty; i++) {
            if (tmNxsComp.getDnBaseFlg().equals("Y")) {
                seqKey = String.format("%s%s%s%s%s", "D", ert.getShipperCd(), ert.getPackingWhCd(), keyY, keyMmdd);
                seqChild = commonService.transactSequence(seqKey, SEQ_TYP_CML_NO_DN, 1, SCREEN_ID_WC001).get(0);
            } else {
                seqKey = String.format("%s%s%s%s", "S", ert.getShipperCd(), keyY, keyMmdd);
                seqChild = commonService.transactSequence(seqKey, SEQ_TYP_CML_NO_DN, 1, SCREEN_ID_WC001).get(0);
            }
            
            String strMainMark = seqKey + seqChild;
            
            if (i == 0) {
            }
            listMainMark.add(strMainMark);
        
        }
        ert.setFromMainMark(listMainMark.get(0));
        ert.setToMainMark(listMainMark.get(listMainMark.size() - 1));

        List<WC001ErtItemDomain> ertItemDomainList = ert.getErtItemDomainList();
        // WEIGHT of a Packing-material information ----------------------------------------------
        // 包装材情報のWEIGHT ----------------------------------------------

        List<WC001ErtDomain> tmPkgMtrlList = new ArrayList<WC001ErtDomain>();
        List<BigDecimal> pkgNetWeightList = new ArrayList<BigDecimal>();
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
        for (WC001ErtItemDomain ertItem : ertItemDomainList) {

            if (StringUtils.isEmpty(ertItem.getPltzItemNo())) {
                continue;
            }
            
            // Acquisition of a Packing-material information
            // 包装材情報の取得

            // * - Acquisition of a MODEL CODE -*
            // * - 型式コードの取得 -*
            WC001ErtCriteriaDomain tmPkgMtrlCriteria = new WC001ErtCriteriaDomain();
            // OWNER_COMP         This screen [92] : Shipper_h
            // OWNER_COMP       本画面【92】：Shipper_h
            tmPkgMtrlCriteria.setOwnerComp(ert.getShipperCd());
            // PKG_MATERIAL_PN    This screen [42]:Contents1_PKG_Item_No (*)  
            // PKG_MATERIAL_PN  本画面【42】：Contents1_PKG_Item_No（※）
            tmPkgMtrlCriteria.setPkgItemNo(ertItem.getPltzItemNo());
            WC001ErtDomain tmPkgMtrl = wc001ErtDao.searchTmPkgMtrlByKey(tmPkgMtrlCriteria);
            // [42] Contents1_Model CD
            // [42] Contents1_Model CD
            if (tmPkgMtrl != null) {
                ertItem.setModelCd(tmPkgMtrl.getModelCd());
            }

            // Calculation of a WEIGHT (N/W) ----------------------------------------------
            // NET WEIGHT = inputted Qty applicable to a Packing-material * PACKAGE ITEM NO
            // 重量（N/W）の算出 ----------------------------------------------
            // ネット重量 = 包装材 * 包装材品番に該当する入力されたQty
            if (tmPkgMtrl != null && tmPkgMtrl.getPkgWeight() != null) {
                BigDecimal weight = weightMap.get(tmPkgMtrl.getWeightUnit());
                if (weight == null) {
                    weight = BigDecimal.ZERO;
                }
                
                BigDecimal pkgNetWeight = tmPkgMtrl.getPkgWeight().multiply(ertItem.getQty());
                if (commonService.isWeightOverflow(pkgNetWeight)) { 
                    ert.setNetWeightOverflow(true); 
                } 
                pkgNetWeightList.add(pkgNetWeight);
                
                weight = weight.add(pkgNetWeight);
                weightMap.put(tmPkgMtrl.getWeightUnit(), weight);
            }

            tmPkgMtrlList.add(tmPkgMtrl);
        }

        // Calculation of a WEIGHT (N/W)
        // 重量（N/W）の算出
        BigDecimal netWeight = BigDecimal.ZERO;
        for (Map.Entry<String, BigDecimal> entry : weightMap.entrySet()) {
            String weightUnit = entry.getKey();
            BigDecimal weight = commonService.convertWeightUnit(entry.getValue(), weightUnit, tmNxsComp.getWeightUnit());
            if (weight == null) {
                ert.setNetWeightOverflow(true);
            } else {
                netWeight = netWeight.add(weight);
            }
        }

        if (!ert.isNetWeightOverflow()) {
            ert.setNetWeightOverflow(commonService.isWeightOverflow(netWeight));
        }

        if (!ert.isNetWeightOverflow() && !BigDecimal.ZERO.equals(netWeight)) {
            ert.setNetWeight(netWeight);
        } else {
            ert.setNetWeight(null);
        }

        // Overflow
        // 桁あふれ
        if (ert.isNetWeightOverflow()) {
            List<WC001ErtDomain> ertList = new ArrayList<WC001ErtDomain>();
            ertList.add(ert);
            return ertList;
        }

        if (ert.getGrossWeight().compareTo(ert.getNetWeight()) == -1) {
            Object[] params = {
                commonService.getResource(ert.getLocale(), "label.netWeight")
            };
            errList.add(new MessageDomain("criteriaDomain.netWeight", NXS_E7_0082, params));
            throw new ValidationException(errList);
        }

        // Processing about PalletQty
        // PalletQty についての処理
        for (int i = 0; i < listMainMark.size(); i++) { // UT420 MOD
            String mainMarkSeq = listMainMark.get(i);
            // Registration processing of a Palletize
            // パレタイズの登録処理
            TtPltzDomain ttPltz = setTtPltzDomain(ert, commonInfo, tmNxsShipTo, tmExpShipToShipping, tmPkgMtrlList.get(0), mainMarkSeq, i);
                // UT420 MOD
            ttPltzService.create(ttPltz);
                    
            // Registration processing of Palletize Item
            // パレタイズ対象品の登録処理
            for (int j = 0; j < ertItemDomainList.size(); j++) { // UT420 MOD
                WC001ErtItemDomain ertItem = ertItemDomainList.get(j);
                if (StringUtils.isEmpty(ertItem.getPltzItemNo())) {
                    continue;
                }
                
                TtPltzItemDomain ttPltzItemDomain = setTtPltzItemDomain(
                    j, 
                    ert, 
                    ertItem, 
                    tmPkgMtrlList.get(j), 
                    commonInfo, 
                    pkgNetWeightList.get(j), 
                    mainMarkSeq
                );
                ttPltzItemList.add(ttPltzItemDomain);
            }
        }
        
        ttPltzItemService.create(ttPltzItemList);
        
        // Setting of a returned value
        // 返却値の設定
        List<WC001ErtDomain> ertList = new ArrayList<WC001ErtDomain>();
        ertList.add(ert);
        return ertList;
    }
    
    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#searchOnContensOfABoxDisplay(com.globaldenso.eca0027.core.business.domain.WC001ErtDomain)
     */
    public WC001ErtDomain searchOnContensOfABoxDisplay(WC001ErtDomain ert)
        throws ApplicationException{
        
        // 1. Acquisition of CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE, and a CUSTOM TIMING TYPE
        // Acquisition of an export Ship-to shipment master
        // 1.コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得 -----------------------
        // 輸出送荷先出荷マスタの取得
        WC001ErtDomain tmExpShipToShipping = null;
        
        if (!CheckUtil.isBlankOrNull(ert.getShipperCd()) && !CheckUtil.isBlankOrNull(ert.getShipToCd())) {
            WC001ErtCriteriaDomain tmExpShipToShippingCriteria = new WC001ErtCriteriaDomain();
            tmExpShipToShippingCriteria.setCompCd(ert.getShipperCd());
            tmExpShipToShippingCriteria.setShipToCd(ert.getShipToCd());
            tmExpShipToShippingCriteria.setAplyStrtDt(getTimeZoneDt(ert.getShipperCd()));
            tmExpShipToShipping = wc001ErtDao.searchTmExpShipToShippingByKey(tmExpShipToShippingCriteria);
        } 
        
        if (tmExpShipToShipping != null) {
            ert.setContainerSortingKey(tmExpShipToShipping.getContainerSortingKey());
            ert.setLoadingCd(tmExpShipToShipping.getLoadingCd());
            ert.setCustomTimingTyp(tmExpShipToShipping.getCustomTimingTyp());
        } else {
            ert.setContainerSortingKey(null);
            ert.setLoadingCd(LOADING_CD_FREE);
            ert.setCustomTimingTyp(null);
        }
        
        // 2. Acquisition of LENGTH UNIT
        // 2. 長さ単位の取得 ----------------------------------------------------------------------
        TmNxsCompDomain tmNxsComp = null;
        
        if (!CheckUtil.isBlankOrNull(ert.getShipperCd())) {
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            // 2.2. How to narrow down acquired data
            // 2.2.取得データの絞込み方法
            tmNxsCompCriteria.setCompCd(ert.getShipperCd());     // [92]Shipper_h 
            
            // Acquisition of a NEXUS company master
            // NEXUS会社マスタの取得
            tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteria);
        }
        
        if (tmNxsComp != null) {
            ert.setLengthUnit(tmNxsComp.getLengthUnit());
            ert.setWeightUnit(tmNxsComp.getWeightUnit());
            ert.setVolumeUnit(tmNxsComp.getVolumeUnit());
            ert.setLengthUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getLengthUnit()));
            ert.setWeightUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getWeightUnit()));
            ert.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(tmNxsComp.getVolumeUnit()));
        } else {
            ert.setLengthUnit(null);
            ert.setWeightUnit(null);
            ert.setVolumeUnit(null);
            ert.setLengthUnitDisp(null);
            ert.setWeightUnitDisp(null);
            ert.setVolumeUnitDisp(null);
        }
        
        // 3. A calculation of Palletize VOLUME (VOLUME)
        // VOLUME = [27]:Length * [28]:Width * [29] : Height
        // 3.パレタイズ容積（VOLUME）の算出 -------------------------------------------------------
        // 容積 = 【27】：Length * 【28】：Width * 【29】：Height
        if (ert.getLength() != null && ert.getWidth() != null && ert.getHeight() != null) {
            BigDecimal volume = ert.getLength().multiply(ert.getWidth()).multiply(ert.getHeight());
            if (!commonService.isVolumeOverflow(volume)) {
                DecimalFormat volumeFormat = new DecimalFormat("0.###");
                double volumeDouble = volume.setScale(3, BigDecimal.ROUND_UP).doubleValue();
                ert.setVolume(new BigDecimal(volumeFormat.format(volumeDouble)));
            } else {
                ert.setVolume(null);
                ert.setVolumeOverflow(true);
            }
        }

        // 5. Acquisition of MODEL CODE
        // 5.型式コードの取得 ---------------------------------------------------------------------
        List<WC001ErtItemDomain> ertItemDomainList = ert.getErtItemDomainList();
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
        for (WC001ErtItemDomain ertItem : ertItemDomainList) {

            ertItem.setModelCd("");
            if (CheckUtil.isBlankOrNull(ertItem.getKitParItemNo())
                || CheckUtil.isBlankOrNull(ert.getShipperCd())) {
                continue;
            }
            
            // * - Acquisition of a MODEL CODE - *
            // * - 型式コードの取得 -*
            TmPkgMtrlCriteriaDomain tmPkgMtrlCriteria = new TmPkgMtrlCriteriaDomain();
            tmPkgMtrlCriteria.setOwnerComp(ert.getShipperCd());
            tmPkgMtrlCriteria.setPkgItemNo(ertItem.getKitParItemNo());
            // Acquisition of a PKG Materials MA
            // 包装材原単位の取得
            TmPkgMtrlDomain tmPkgMtrl = tmPkgMtrlService.searchByKey(tmPkgMtrlCriteria);
            // ST967 ADD START
            if (tmPkgMtrl == null) {
                tmPkgMtrlCriteria.setPkgItemNo("  " + ertItem.getKitParItemNo().replace("-", ""));
                tmPkgMtrl = tmPkgMtrlService.searchByKey(tmPkgMtrlCriteria);    
            }
            //ST967 ADD END

            // 4. A calculation of WEIGHT (N/W)
            // 4.1. A calculation of WEIGHT (N/W)
            // NET WEIGHT = inputted Qty applicable to a 5. PKG-Materials-MA .PKG_WEIGHT x PACKAGE ITEM NO
            // 4.重量（N/W）の算出 ----------------------------------------------------------------
            // 4.1.重量（N/W）の算出
            // ネット重量 = 5.包装材原単位.PKG_WEIGHT × 包装材品番に該当する入力されたQty
            if (tmNxsComp != null && tmPkgMtrl != null && tmPkgMtrl.getPkgWeight() != null && ertItem.getQty() != null) {
                BigDecimal weight = weightMap.get(tmPkgMtrl.getWeightUnit());
                if (weight == null) {
                    weight = BigDecimal.ZERO;
                }
                
                BigDecimal pkgNetWeight = tmPkgMtrl.getPkgWeight().multiply(ertItem.getQty());
                
                weight = weight.add(pkgNetWeight);
                weightMap.put(tmPkgMtrl.getWeightUnit(), weight);
            }
            
            // -------------------------------------------------------------------------------------
            // [42] Contents1_Model CD
            if (tmPkgMtrl != null) {
                ertItem.setModelCd(tmPkgMtrl.getModelCd());
            }
        }

        // Calculation of a WEIGHT (N/W)
        // 重量（N/W）の算出
        // 4.2. A converted of WEIGHT (N/W)
        // 4.2.重量（N/W）の変換
        BigDecimal netWeight = BigDecimal.ZERO;
        for (Map.Entry<String, BigDecimal> entry : weightMap.entrySet()) {
            String weightUnit = entry.getKey();
            BigDecimal weight = commonService.convertWeightUnit(entry.getValue(), weightUnit, tmNxsComp.getWeightUnit());
            if (weight == null) {
                ert.setNetWeightOverflow(true);
            } else {
                netWeight = netWeight.add(weight);
            }
        }

        if (!ert.isNetWeightOverflow()) {
            ert.setNetWeightOverflow(commonService.isWeightOverflow(netWeight));
        }

        if (!ert.isNetWeightOverflow() && !BigDecimal.ZERO.equals(netWeight)) {
            ert.setNetWeight(netWeight);
        } else {
            ert.setNetWeight(null);
        }
        
        // This is acquisition of an acquisition -  Ship-to-name about a Ship-to information.
        // Ship-to情報を取得 - 送荷先名称の取得
        if (!CheckUtil.isBlankOrNull(ert.getShipToCd())) {
            TmNxsShipToCriteriaDomain tmNxsShipToCriteria = new TmNxsShipToCriteriaDomain();
            tmNxsShipToCriteria.setShipToCd(ert.getShipToCd());
            TmNxsShipToDomain tmNxsShipTo = tmNxsShipToService.searchByKey(tmNxsShipToCriteria);
            if(tmNxsShipTo != null) {
                ert.setShipToNmDisp(tmNxsShipTo.getShipToNm());
            }
        }
        
        return ert;
    }
    
    // --------------------------------- Update system method update -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- Delete system method delete -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#deleteOnContensOfABoxCancel(com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain)
     */
    public Integer deleteOnContensOfABoxCancel(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        // 2.3. select data is locked.
        // 2.3.選択データをロック
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMarkGreaterThanEqual(criteria.getFromMainMark());
        ttPltzCriteria.setMainMarkLessThanEqual(criteria.getToMainMark());
        
        List<TtPltzDomain> list = ttPltzService.searchByCondition(ttPltzCriteria);
        
        // When the acquisition number is 100 affairs
        // 取得件数が100件の場合
        if (list.size() >= 100) {
            throw new GscmApplicationException(GSCM_E0_0038);
        }

        for (TtPltzDomain ttPltz : list) {

            TtPltzCriteriaDomain ttPltzLockCriteria = new TtPltzCriteriaDomain();
            ttPltzLockCriteria.setMainMark(ttPltz.getMainMark());
            TtPltzDomain ttpltzLock = ttPltzService.lockByKeyNoWait(ttPltzLockCriteria);

            // When the acquisition number is zero affair
            // 取得件数が0件の場合
            if (ttpltzLock == null) {
                Object[] params = {ttPltz.getMainMark()};
                throw new GscmApplicationException(NXS_E7_0129, params);
            }
            
            // When CML_TYP is except "2"
            // CML_TYPが"2"以外の場合
            if (!ttpltzLock.getCmlTyp().equals("2")) {
                Object[] params = {ttPltz.getMainMark()};
                throw new GscmApplicationException(NXS_E7_0130, params);
            }
            
            // When PALLETIZE_STATUS_CD is except "10"
            // PALLETIZE_STATUS_CDが"10"以外の場合
            if (!ttpltzLock.getPltzStatus().equals("10")) {
                Object[] params = {ttPltz.getMainMark()};
                throw new GscmApplicationException(NXS_E7_0131, params);
            }
            // The check of Carry-Out, and a Carry-In
            // In lastTrStatus = "20" or lastTrStatus ="30", an error is made (MSGID :  NXS-E1-0047).
            // 搬出・搬入のチェック
            // lastTrStatus = "20" または lastTrStatus = "30" の場合はエラー (MSGID : NXS-E1-0047)
            if (CARRY_OUT_IN_ISSUE_TR.equals(ttpltzLock.getLastTrStatus())
                || CARRY_OUT_IN_ACTIVATE_TR.equals(ttpltzLock.getLastTrStatus())) {
                Object[] params = {ttPltz.getMainMark()};
                throw new GscmApplicationException(NXS_E1_0047, params);
            }
        }
        
        
        // A delete of 3.1 Palletize
        // 3.1パレタイズの削除
        ttPltzCriteria.setSearchCountCheckFlg(false);
        ttPltzService.deleteByCondition(ttPltzCriteria);

        // A delete of 3.2 Palletize Items
        // 3.2パレタイズ対象品の削除
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        ttPltzItemCriteria.setMainMarkGreaterThanEqual(criteria.getFromMainMark());
        ttPltzItemCriteria.setMainMarkLessThanEqual(criteria.getToMainMark());
        ttPltzItemService.deleteByCondition(ttPltzItemCriteria);
        
        return list.size();
        
    }
    
    // -------------------------------- Transaction system method transact ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    
    // -------------------------------- Print system method print ---------------------------------------------------------
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WC001ErtService#printErt(com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain)
     */
    public File printErt(WC001ErtCriteriaDomain criteria)
        throws ApplicationException{

        // Acquisition of Date format
        // 日付フォーマットの取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        String formatDate =  commonService.getResource(commonInfo.getLocale(), REPORT_DATE_FORMAT);
        
        // A create of 2. returned-packing-style Case Mark Label (PDF)
        // 2.返却荷姿ケースマークラベル（PDF）の作成 
        File pdf = lc001ReportService.searchErt(criteria.getFromMainMark(), criteria.getToMainMark(), formatDate);
        
        return pdf;
    }
    

    // -------------------------------- The other methods others ---------------------------------------------------------
    // -------------------------------- その他メソッド others ---------------------------------------------------------


    /**
     * Set of a Palletize information
     * <br />パレタイズ情報のセット
     * 
     * @param ert                 WC001ErtDomain
     * @param commonInfo          CommonInfoDomain
     * @param tmNxsShipTo         TmNxsShipToDomain
     * @param tmExpShipToShipping WC001ErtDomain
     * @param tmPkgMtrl           WC001ErtDomain
     * @param mainMarkSeq         MAIN MARK<br />メインマーク
     * @param count               CML Counter - 0 start<br />CMLカウンタ - 0始まり
     * @return Result domain<br />結果ドメイン
     * @throws ApplicationException Exception<br />例外
     */
    protected TtPltzDomain setTtPltzDomain(
        WC001ErtDomain       ert, 
        CommonInfoDomain     commonInfo, 
        TmNxsShipToDomain    tmNxsShipTo, 
        WC001ErtDomain       tmExpShipToShipping, 
        WC001ErtDomain       tmPkgMtrl, 
        String               mainMarkSeq,
        int                  count
    ) throws ApplicationException {

        TtPltzDomain ttPltz = new TtPltzDomain();
        // MAIN_MARK
        ttPltz.setMainMark(mainMarkSeq);
        // PALLET_NO
        //ttPltz.setPalletNo("S001");
        // UT420 MOD
        ttPltz.setPalletNo(
            ert.getPalletCartonTyp() + String.format("%03d", count + 1)
        );
        // SHIPPER_CD
        ttPltz.setShipperCd(ert.getShipperCd());
        // NXS_SHIP_TO_CD
        ttPltz.setShipToCd(ert.getShipToCd());
        // LEGACY_CUSTOMER_NO = " "
        ttPltz.setCustomerCd(" ");
        // LEGACY_SHIP_TO = ""
        ttPltz.setLgcyShipTo("");
        // TRNS_WAY_CD
        ttPltz.setTrnsCd(ert.getTrnsCd());
        // TRNS_WAY_CD_ORG
        ttPltz.setTrnsCdOrg(ert.getTrnsCd());
        // REVISE_FLG = "N"
        ttPltz.setReviseFlg(FLAG_N);
        // LEGACY_PLANT_CD
        ttPltz.setPlntCd(ert.getPlntCd());
        // LEGACY_WH_CD = " "
        ttPltz.setLgcyWhCd(" ");
        // PKG_FORM = "S"
        ttPltz.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        // INVOICE_KEY = ""
        ttPltz.setInvoiceKey("");
        // CONTAINER_SORTING_KEY
        ttPltz.setContainerSortingKey(tmExpShipToShipping.getContainerSortingKey());
        // CONTAINER_LOOSE_TYP
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // In a (air transportation subject), this is "L."
            // A（航空輸送主体）の場合、"L"
            ttPltz.setContainerLooseTyp(CONTAINER_LOOSE_TYP_LOOSE);
            ert.setContainerLooseTyp(CONTAINER_LOOSE_TYP_LOOSE);
        } else {
            ttPltz.setContainerLooseTyp(ert.getContainerLooseTyp());
        }
        // RETURN_STYLE_CD
        ttPltz.setReturnStyleCd(ert.getReturnStyleCd());
        // VARIANT_FLG = "N"
        ttPltz.setVariantFlg(FLAG_N);
        // RT_USE_FLG = "Y"
        ttPltz.setRtUseFlg(FLAG_Y);
        // WEIGHT_UNIT
        ttPltz.setWeightUnit(ert.getWeightUnit());
        // NET_WEIGHT
        ttPltz.setNetWeight(ert.getNetWeight());
        // GROSS_WEIGHT
        ttPltz.setGrossWeight(ert.getGrossWeight());
        // LENGTH_UNIT
        ttPltz.setLengthUnit(ert.getLengthUnit());
        // LENGTH
        ttPltz.setLength(ert.getLength());
        // WIDTH
        ttPltz.setWidth(ert.getWidth());
        // HEIGHT
        ttPltz.setHeight(ert.getHeight());
        // VOLUME_UNIT
        ttPltz.setVolumeUnit(ert.getVolumeUnit());
        // VOLUME
        ttPltz.setVolume(ert.getVolume());
        // SUPPLIER_MAIN_MARK = ""
        ttPltz.setSupplierMainMark("");
        // CML_TYP = "2"（E-RT）
        ttPltz.setCmlTyp(CML_TYPE_ERT);
        // OUTER_PKG_CD = ""
        ttPltz.setOuterPkgCd("");
        // EXP_PACKING_DT = time zone converted date
        // EXP_PACKING_DT = タイムゾーン変換日付
        Date expPackingDt = getTimeZoneDt(ert.getShipperCd());
        expPackingDt = DateUtils.truncate(expPackingDt, Calendar.DAY_OF_MONTH);
        ttPltz.setExpPackingDt(expPackingDt);
        // EXP_PACKING_ISSUER_ID = login DSC-ID
        // EXP_PACKING_ISSUER_ID = ログインDSC-ID
        ttPltz.setExpPackingIssuerId(commonInfo.getLoginUserDscId());
        // EXP_PACKING_ISSUER_NM = login person name
        // EXP_PACKING_ISSUER_NM = ログイン者名
        ttPltz.setExpPackingIssuerNm(commonInfo.getUserName());
        // DUE_DT
        ttPltz.setDueDt(ert.getDueDt());
        // INSTR_FLG = N
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // In a (air transportation subject), this is "Y."
            // A（航空輸送主体）の場合、"Y"
            ttPltz.setStgInstrItemFlg(FLAG_Y);
            ert.setStgInstrItemFlg(FLAG_Y);
        } else {
            ttPltz.setStgInstrItemFlg(FLAG_N);
        }
        // CONSIGNEE_CD
        ttPltz.setConsigneeCd(tmNxsShipTo.getCompCd());
        // COMMERCIAL_FLG = N fixation
        // COMMERCIAL_FLG = N固定
        ttPltz.setCommercialFlg(FLAG_N);
        // TRADE_TERMS = ""
        ttPltz.setTradeTerms("");
        // CURRENCY_CD
        ttPltz.setCurrCd(tmPkgMtrl.getCurrCd());
        // PALLETIZE_STATUS_CD ="10" (Palletize)  
        // PALLETIZE_STATUS_CD = "10"（パレタイズ）
        ttPltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        // PACKED_WH_COMP_CD
        ttPltz.setPackingWhCompCd(ert.getPackingWhCompCd());
        // PACKED_WH_CD
        ttPltz.setPackingWhCd(ert.getPackingWhCd());
        // CUR_WH_COMP_CD
        ttPltz.setCurWhCompCd(ert.getPackingWhCompCd());
        // CUR_WH_CD
        ttPltz.setCurWhCd(ert.getPackingWhCd());
        // X_MAIN_MARK = ""
        ttPltz.setXmainMark("");
        // INVOICE_NO = ""
        ttPltz.setInvoiceNo("");
        // INVOICE_ISSUE_DT = ""
        ttPltz.setInvoiceIssueDt(null);
        // LOADING_CD
        ttPltz.setLoadingCd(ert.getLoadingCd());
        // SITE_TYP = ""
        ttPltz.setSiteTyp("");
        // EXP_LIMIT_FLG = "N"
        ttPltz.setExpLimitFlg(FLAG_N);
        // DNGR_ITEM_FLG = "N"
        ttPltz.setDngrItemFlg(FLAG_N);
        // STG_INSTR_NO = ""
        ttPltz.setStgInstrNo("");
        // STG_ACT_NO = ""
        ttPltz.setStgActNo("");
        // SHIPPING_CONFIRM_NO = ""
        ttPltz.setShippingFirmNo("");
        // CUSTOM_TIMING_TYP
        if (ert.getTrnsCd().equals(TRNS_CD_AIR)) {
            // The case   of [13]:Trans = A (air transportation subject), "Z"
            // 【13】：Trans = A（航空輸送主体）の場合 、"Z"
            ttPltz.setCustomTimingTyp(CUSTOM_TIMING_TYPE_Z);
            ert.setCustomTimingTyp(CUSTOM_TIMING_TYPE_Z);
        } else {
            ttPltz.setCustomTimingTyp(ert.getCustomTimingTyp());
        }
        // LAST_TR_STATUS = "10"
        ttPltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        // LAST_TR_RCV_DT = ""
        ttPltz.setLastTrRcvDt(ert.getLastTrRcvDt());
        // PALLETIZE_INSTR_NO = ""
        ttPltz.setPltzInstrNo("");
        // EXP_REQUEST_NO = ""
        ttPltz.setExpRequestNo("");
        // EXP_REQUEST_ALL_CML_ISSUED_FLG = "N"
        ttPltz.setExpRequestAllCmlIssuedFlg(FLAG_N);
        // SPLIT_SHIPMENT_FLG = "N"
        ttPltz.setSplitShippingNgFlg(FLAG_N);
        // INVOICE_CATEGORY = "N" fixation
        // INVOICE_CATEGORY = "N"固定
        ttPltz.setInvoiceCtgry(FLAG_N);
        // PRICE_TERMS
        ttPltz.setPriceTerms(ert.getPriceTerms());
        // RE_EXP_GOODS_FLG = "N"
        ttPltz.setReExpGoodsFlg(FLAG_N);
        // FREIGHT_RESPONSIBLE_CD
        ttPltz.setFreightResponsibleCd(ert.getFreightResponsibleCd());
        // MIGRATION_FLG = "N"
        ttPltz.setMigrationFlg(FLAG_N);
        // PALLET_CARTON_TYP UT420 ADD
        ttPltz.setPalletCartonTyp(ert.getPalletCartonTyp());
        // A setting of common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttPltz, SCREEN_ID_WC001);

        return ttPltz;
    }

    /**
     * Set of a Palletize-Item information
     * <br />パレタイズ対象品情報のセット
     * @param serialNumber   SEQUENCE NO<br />連番
     * @param ert            WC001ErtDomain domain<br />WC001ErtDomainドメイン
     * @param ertItem        WC001ErtItemDomain domain<br />WC001ErtItemDomainドメイン
     * @param tmPkgMtrl      WC001ErtDomain domain<br />WC001ErtDomainドメイン
     * @param commonInfo     CommonInfoDomain domain<br />CommonInfoDomainドメイン
     * @param netWeight    Net WEIGHT<br />Net重量
     * @param mainMarkSeq    MAIN MARK<br />メインマーク
     * @return Result domain<br />結果ドメイン
     * @throws ApplicationException Exception<br />例外
     */
    protected TtPltzItemDomain setTtPltzItemDomain(
            int serialNumber, 
            WC001ErtDomain       ert, 
            WC001ErtItemDomain   ertItem, 
            WC001ErtDomain       tmPkgMtrl, 
            CommonInfoDomain     commonInfo, 
            BigDecimal           netWeight,
            String               mainMarkSeq
    )
        throws ApplicationException {
        
        TtPltzItemDomain ttPltzItemDomain = new TtPltzItemDomain();
        // MAIN_MARK
        ttPltzItemDomain.setMainMark(mainMarkSeq);
        // BRCH_NO
        ttPltzItemDomain.setBrch(new BigDecimal(serialNumber));
        // PALLETIZE_PN
        ttPltzItemDomain.setPltzItemNo(tmPkgMtrl.getPkgItemNo());
        // PKG_CD = " "
        ttPltzItemDomain.setPkgCd(" ");
        // ITEM_NM
        ttPltzItemDomain.setItemDescription(tmPkgMtrl.getPkgMtrlNm());
        // QTY
        ttPltzItemDomain.setQty(ertItem.getQty());
        // MEASURE_UNIT
        ttPltzItemDomain.setQtyUnit(QTY_UNIT_EA);
        // TAG_QTY = ""
        ttPltzItemDomain.setTagQty(null); 
        // ITEM_TYP ="3" Packing material
        // ITEM_TYP = "3" 包装材
        ttPltzItemDomain.setItemTyp(ITEM_TYP_PKG_MATERIALS);
        // NET_WEIGHT
        ttPltzItemDomain.setNetWeight(netWeight);
        // ITEM_WEIGHT
        ttPltzItemDomain.setItemWeight(tmPkgMtrl.getPkgWeight());
        // WEIGHT_UNIT
        ttPltzItemDomain.setWeightUnit(tmPkgMtrl.getWeightUnit());
        // SHIP_LOT_QTY = ""
        ttPltzItemDomain.setShippingLot(null);
        // PKG_TYP ="4" Recommendation packing style
        // PKG_TYP = "4" 推奨荷姿
        ttPltzItemDomain.setPkgTyp(PKG_TYP_ERT);
        // MODEL_CD
        ttPltzItemDomain.setModelCd(tmPkgMtrl.getModelCd());
        // EXP_LIMIT_TYP = ""
        ttPltzItemDomain.setExpLimitTyp("");
        // DNGR_ITEM_FLG = "N"
        ttPltzItemDomain.setDngrItemFlg(FLAG_N);
        // ORIGIN_CNTRY_CD
        ttPltzItemDomain.setOriginCntryCd(tmPkgMtrl.getOriginCntryCd());
        // CURRENCY_CD
        ttPltzItemDomain.setCurrCd(tmPkgMtrl.getCurrCd());
        // LEGACY_PLANT_CD
        ttPltzItemDomain.setPlntCd(ert.getPlntCd());
        // RT_TYP
        ttPltzItemDomain.setRtFlg(FLAG_Y);
        // KIT_FLG = "N"
        ttPltzItemDomain.setKitFlg(FLAG_N);
        // EXP_REQUEST_NO = ""
        ttPltzItemDomain.setExpRequestNo("");
        // LINE_NO = ""
        ttPltzItemDomain.setLineNo(null);
        // KIT_BRCH = ""
        ttPltzItemDomain.setKitBrch(null);
        // MIX_TAG = ""
        ttPltzItemDomain.setMixTagNo("");
        // PALLETIZE_INSTR_NO = ""
        ttPltzItemDomain.setPltzInstrNo("");
        // PAR_FLG = "Y"
        ttPltzItemDomain.setParFlg(FLAG_Y);
        // KIT_PAR_ITEM_NO = ""
        ttPltzItemDomain.setKitParItemNo("");
        // CUSTOMER_PO_NO = ""
        ttPltzItemDomain.setCustomerPoNo("");
        // CUSTOMER_ITEM_NO = "" 
        ttPltzItemDomain.setCustomerItemNo("");
        // UNIT_PRICE = ""
        ttPltzItemDomain.setUnitPrice(null);
        // HS_CD = ""
        ttPltzItemDomain.setHsCd("");
        // INPUT_METH_TYP = ""
        ttPltzItemDomain.setInputMethTyp("");

        // Setting of a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttPltzItemDomain, SCREEN_ID_WC001);
        return ttPltzItemDomain;
        
    }
    
    /**
     * Acquire time zone converted time from a MAIN MARK.
     * メインマークからタイムゾーン変換日時を取得します。
     *
     * @param shipperCd SHIPPER CD
     * @return Time zone converted time<br />タイムゾーン変換日時
     * @throws ApplicationException When a time zone converted cannot be carried out<br />タイムゾーン変換できなかった場合
     */
    protected Date getTimeZoneDt(String shipperCd) throws ApplicationException {
        String timezoneId = commonService.searchTimezone(shipperCd);
        Date timezoneDateDt = getTimeZoneDtVal(timezoneId);
        return timezoneDateDt;
    }

    /**
     * Type in the functional overview of the method.
     *
     * @param timezoneId TIMEZONE ID<br />タイムゾーンID
     * @return Time zone converted time<br />タイムゾーン変換日時
     */
    protected Date getTimeZoneDtVal(String timezoneId) {
        return DateUtil.convertTime(new Date(), timezoneId);
    }

}
