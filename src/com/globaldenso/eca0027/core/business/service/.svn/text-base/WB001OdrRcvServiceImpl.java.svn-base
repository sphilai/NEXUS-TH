/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0037;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT_FOR_WB003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_WB001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_WB001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_ORDER_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_PACKED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_SHIPPED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultSubItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB011ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsB001RestService;
import com.globaldenso.eca0027.core.business.ws.WsB002RestService;
import com.globaldenso.eca0027.core.business.ws.WsB003RestService;
import com.globaldenso.eca0027.core.business.ws.WsB004RestService;
import com.globaldenso.eca0027.core.business.ws.WsB005RestService;
import com.globaldenso.eca0027.core.business.ws.WsB006RestService;
import com.globaldenso.eca0027.core.business.ws.WsB007RestService;
import com.globaldenso.eca0027.core.business.ws.WsB008RestService;
import com.globaldenso.eca0027.core.business.ws.WsB010RestService;
import com.globaldenso.eca0027.core.business.ws.WsB011RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * This is an implement class of ordering registration service.
 * <br />受注登録サービスの実装クラスです。
 *
 * @author $Author$
 * @version $Revision$
 */
public class WB001OdrRcvServiceImpl implements WB001OdrRcvService {

    /**
     * Processing mode (insertion)
     * <br />処理モード(挿入)
     */
    static final String PROCESS_TYPE_REGISTER = "1";
    
    /**
     * Processing mode (update)
     * <br />処理モード(更新)
     */
    static final String PROCESS_TYPE_UPDATE = "2";
    
    /**
     * Processing mode (delete)
     * <br />処理モード(削除)
     */
    static final String PROCESS_TYPE_DELETE = "3";
    
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
     * Ordering business DAO
     * <br />受注業務DAO
     */
    protected WB001OdrRcvDao wb001OdrRcvDao;
    
    /**
     * TmNxsComp operation service
     * <br />TmNxsComp操作サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * TmExpFormalitiItemNo operation service
     * <br />TmExpFormalitiItemNo操作サービス
     */
    protected TmExpFormalitiItemNoService tmExpFormalitiItemNoService;
    
    /**
     * TmCigmaShipToXre operation service
     * <br />TmCigmaShipToXre操作サービス
     */
    protected TmCigmaShipToXrefService tmCigmaShipToXrefService;
    
    /**
     * TmNxsShipTo operation service
     * <br />TmNxsShipTo操作サービス
     */
    protected TmNxsShipToService tmNxsShipToService;
    
    /**
     * TtExpRcvOdr operation service
     * <br />TtExpRcvOdr操作サービス
     */
    protected TtExpRcvOdrService ttExpRcvOdrService;

    /**
     * tmExpItemNoSpInfo operation service
     * <br />tmExpItemNoSpInfo操作サービス
     */
    protected TmExpItemNoSpInfoService tmExpItemNoSpInfoService;
    
    /**
     * Web service call service (WSB001)
     * <br />Webサービス呼出しサービス (WSB001)
     */
    protected WsB001RestService wsB001RestService;

    /**
     * Web service call service (WSB002)
     * <br />Webサービス呼出しサービス (WSB002)
     */
    protected WsB002RestService wsB002RestService;

    /**
     * Web service call service (WSB003)
     * <br />Webサービス呼出しサービス (WSB003)
     */
    protected WsB003RestService wsB003RestService;

    /**
     * Web service call service (WSB004)
     * <br />Webサービス呼出しサービス (WSB004)
     */
    protected WsB004RestService wsB004RestService;

    /**
     * Web service call service (WSB005)
     * <br />Webサービス呼出しサービス (WSB005)
     */
    protected WsB005RestService wsB005RestService;

    /**
     * Web service call service (WSB006)
     * <br />Webサービス呼出しサービス (WSB006)
     */
    protected WsB006RestService wsB006RestService;

    /**
     * Web service call service (WSB007)
     * <br />Webサービス呼出しサービス (WSB007)
     */
    protected WsB007RestService wsB007RestService;

    /**
     * Web service call service (WSB008)
     * <br />Webサービス呼出しサービス (WSB008)
     */
    protected WsB008RestService wsB008RestService;

    /**
     * Web service call service (WSB010)
     * <br />Webサービス呼出しサービス (WSB010)
     */
    protected WsB010RestService wsB010RestService;
    
    /**
     * Web service call service (WSB011)
     * <br />Webサービス呼出しサービス (WSB011)
     */
    protected WsB011RestService wsB011RestService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001OdrRcvServiceImpl() {
        
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
     * Setter method for wb001OdrRcvDao.
     *
     * @param wb001OdrRcvDao Set for wb001OdrRcvDao
     */
    public void setWb001OdrRcvDao(WB001OdrRcvDao wb001OdrRcvDao) {
        this.wb001OdrRcvDao = wb001OdrRcvDao;
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
     * Setter method for tmExpFormalitiItemNoService.
     *
     * @param tmExpFormalitiItemNoService Set for tmExpFormalitiItemNoService
     */
    public void setTmExpFormalitiItemNoService(
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService) {
        this.tmExpFormalitiItemNoService = tmExpFormalitiItemNoService;
    }

    /**
     * Setter method for tmCigmaShipToXrefService.
     *
     * @param tmCigmaShipToXrefService Set for tmCigmaShipToXrefService
     */
    public void setTmCigmaShipToXrefService(
        TmCigmaShipToXrefService tmCigmaShipToXrefService) {
        this.tmCigmaShipToXrefService = tmCigmaShipToXrefService;
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
     * Setter method for ttExpRcvOdrService.
     *
     * @param ttExpRcvOdrService Set for ttExpRcvOdrService
     */
    public void setTtExpRcvOdrService(TtExpRcvOdrService ttExpRcvOdrService) {
        this.ttExpRcvOdrService = ttExpRcvOdrService;
    }

    /**
     * Setter method for tmExpItemNoSpInfoService.
     *
     * @param tmExpItemNoSpInfoService Set for tmExpItemNoSpInfoService
     */
    public void setTmExpItemNoSpInfoService(
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService) {
        this.tmExpItemNoSpInfoService = tmExpItemNoSpInfoService;
    }

    /**
     * Setter method for wsB001RestService.
     *
     * @param wsB001RestService Set for wsB001RestService
     */
    public void setWsB001RestService(WsB001RestService wsB001RestService) {
        this.wsB001RestService = wsB001RestService;
    }

    /**
     * Setter method for wsB002RestService.
     *
     * @param wsB002RestService Set for wsB002RestService
     */
    public void setWsB002RestService(WsB002RestService wsB002RestService) {
        this.wsB002RestService = wsB002RestService;
    }

    /**
     * Setter method for wsB003RestService.
     *
     * @param wsB003RestService Set for wsB003RestService
     */
    public void setWsB003RestService(WsB003RestService wsB003RestService) {
        this.wsB003RestService = wsB003RestService;
    }

    /**
     * Setter method for wsB004RestService.
     *
     * @param wsB004RestService Set for wsB004RestService
     */
    public void setWsB004RestService(WsB004RestService wsB004RestService) {
        this.wsB004RestService = wsB004RestService;
    }

    /**
     * Setter method for wsB005RestService.
     *
     * @param wsB005RestService Set for wsB005RestService
     */
    public void setWsB005RestService(WsB005RestService wsB005RestService) {
        this.wsB005RestService = wsB005RestService;
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
     * Setter method for wsB010RestService.
     *
     * @param wsB010RestService Set for wsB010RestService
     */
    public void setWsB010RestService(WsB010RestService wsB010RestService) {
        this.wsB010RestService = wsB010RestService;
    }

    /**
     * Setter method for wsB011RestService.
     *
     * @param wsB011RestService Set for wsB011RestService
     */
    public void setWsB011RestService(WsB011RestService wsB011RestService) {
        this.wsB011RestService = wsB011RestService;
    }

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyAllocQtyCustomerPartNo(java.math.BigDecimal, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAllocQtyCustomerPartNo(BigDecimal allocQty, String customerPartNo, String customerPartNoOrg){
        return allocQty.compareTo(BigDecimal.ZERO) == 0 || StringUtils.equals(customerPartNo, customerPartNoOrg);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyAllocQtyCustomerPoNo(java.math.BigDecimal, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAllocQtyCustomerPoNo(BigDecimal allocQty, String customerPoNo, String customerPoNoOrg){
        return allocQty.compareTo(BigDecimal.ZERO) == 0 || StringUtils.equals(customerPoNo, customerPoNoOrg);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyAllocQtySalesPoNo(java.math.BigDecimal, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAllocQtySalesPoNo(BigDecimal allocQty, String salesPoNo, String salesPoNoOrg){
        return allocQty.compareTo(BigDecimal.ZERO) == 0 || StringUtils.equals(salesPoNo, salesPoNoOrg);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyDateReceivingDate(java.util.Date, java.util.Date)
     */
    public boolean validateConsistencyDateReceivingDate(Date dueDate, Date receivingDate){
        if (dueDate == null){
            return true;
        }
        return validateReceivingDateBetweenHalfYear(dueDate, receivingDate);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyDueDateReceivingDate(java.util.Date, java.util.Date)
     */
    public boolean validateConsistencyDueDateReceivingDate(Date date, Date receivingDate){
        if (date == null){
            return true;
        }
        return validateReceivingDateBetweenHalfYear(date, receivingDate);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyFirmQtyAllocQty(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyFirmQtyAllocQty(BigDecimal firmQty, BigDecimal allocQty){
        return firmQty.compareTo(allocQty) >= 0;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyFirmQtyForecastQty(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyFirmQtyForecastQty(BigDecimal firmQty, BigDecimal forecastQty){
        return !(firmQty.compareTo(BigDecimal.ZERO) != 0 && forecastQty.compareTo(BigDecimal.ZERO) != 0);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyNewQtyAllocQty(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyNewQtyAllocQty(BigDecimal newQty, BigDecimal allocQty){
        return newQty.compareTo(allocQty) >= 0;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyNewQtyOrderQty(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyNewQtyOrderQty(BigDecimal newQty, BigDecimal orderQty){
        return newQty.compareTo(orderQty) == 0;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyNewQtyOrderQtyHidden(boolean)
     */
    public boolean validateConsistencyNewQtyOrderQtyHidden(boolean modInfoFlg) {
        return modInfoFlg;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyNewQtyQtyCarton(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyNewQtyQtyCarton(BigDecimal newQty, BigDecimal qtyCarton){
        return (newQty.remainder(qtyCarton)).compareTo(BigDecimal.ZERO) == 0;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyOrderQtyFirmQtyForecastQty(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal hiddenorderQty, BigDecimal firmQty, BigDecimal forecastQty){
        return !(hiddenorderQty.compareTo(BigDecimal.ZERO) == 0 && firmQty.compareTo(BigDecimal.ZERO) == 0 && forecastQty.compareTo(BigDecimal.ZERO) == 0);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyPkgCd(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyPkgCd(String pkgCd, String itemNoGrp){
        return commonService.validatePkgCd(pkgCd, itemNoGrp);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException {
        
        if (userAuthService.hasRegisterAll()) {
            return true;
        } else {
            return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_WB001R, shipperCd, plntCd);
        }
    }

    // --------------------------------- Database check method validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, java.lang.String)
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException{
        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseProcessingDateOnMultiPoRegister(java.lang.String, java.util.Date)
     */
    public boolean validateDatabaseProcessingDateOnMultiPoRegister(String compCd, Date dueDate)
        throws ApplicationException{
        return compareDueDate(compCd, dueDate);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseProcessingDateOnRegister(java.lang.String, java.util.Date)
     */
    public boolean validateDatabaseProcessingDateOnRegister(String compCd, Date dueDate) throws ApplicationException{
        if (dueDate == null){
            return true;
        }
        return compareDueDate(compCd, dueDate);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(java.lang.String, java.lang.String, java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException{
        return this.validateExistLgcyChipTo(lgcyLibCompCd, customerCd, lgcyShipTo, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(java.lang.String, java.lang.String, java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException{
        return this.validateExistLgcyChipTo(lgcyLibCompCd, customerCd, lgcyShipTo, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(java.lang.String, java.lang.String, java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException{
        return this.validateExistLgcyChipTo(lgcyLibCompCd, customerCd, lgcyShipTo, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(java.lang.String, java.lang.String, java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException{
        return this.validateExistLgcyChipTo(lgcyLibCompCd, customerCd, lgcyShipTo, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnRegister(java.lang.String, java.lang.String, java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnRegister(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException{
        return this.validateExistLgcyChipTo(lgcyLibCompCd, customerCd, lgcyShipTo, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfo(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmExpItemNoSpInfo(
        String compCd, String itemNo, String pkgCd, String customerCd, String lgcyShipTo, Date aplyStrtDt, 
        WB001OdrRcvDomain tmpDomain)
        throws ApplicationException {

        TmExpItemNoSpInfoCriteriaDomain tmExpItemNoSpInfoCriteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
        
        tmExpItemNoSpInfoCriteriaDomain.setCompCd(compCd);
        tmExpItemNoSpInfoCriteriaDomain.setItemNo(itemNo);
        tmExpItemNoSpInfoCriteriaDomain.setPkgCd(pkgCd);
        tmExpItemNoSpInfoCriteriaDomain.setCustomerCd(customerCd);
        tmExpItemNoSpInfoCriteriaDomain.setLgcyShipTo(lgcyShipTo);
        tmExpItemNoSpInfoCriteriaDomain.setAplyStrtDtLessThanEqual(aplyStrtDt);
        tmExpItemNoSpInfoCriteriaDomain.setRowNumFrom(1);
        tmExpItemNoSpInfoCriteriaDomain.setRowNumTo(1);
        tmExpItemNoSpInfoCriteriaDomain.setPreferredOrder("APLY_STRT_DT desc");
        
        List<TmExpItemNoSpInfoDomain> searchByConditionForPagingresultList = tmExpItemNoSpInfoService.searchByConditionForPaging(tmExpItemNoSpInfoCriteriaDomain);

        if (searchByConditionForPagingresultList != null && searchByConditionForPagingresultList.size() > 0) {
            if (tmpDomain != null) {
                TmExpItemNoSpInfoDomain resultDomain = searchByConditionForPagingresultList.get(0);
                tmpDomain.setShippingLot(resultDomain.getShippingLot());
            }
            return true;
        }
        return false;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNo(java.lang.String, java.lang.String, java.util.Date, com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmExpFormalitiItemNo(String compCd, String itemNo, Date aplyStrtDt, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException {

        TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteriaDomain = new TmExpFormalitiItemNoCriteriaDomain();
        
        tmExpFormalitiItemNoCriteriaDomain.setCompCd(compCd);
        tmExpFormalitiItemNoCriteriaDomain.setItemNo(itemNo);
        tmExpFormalitiItemNoCriteriaDomain.setAplyStrtDtLessThanEqual(aplyStrtDt);
        tmExpFormalitiItemNoCriteriaDomain.setRowNumFrom(1);
        tmExpFormalitiItemNoCriteriaDomain.setRowNumTo(1);
        tmExpFormalitiItemNoCriteriaDomain.setPreferredOrder("APLY_STRT_DT desc");
        
        List<TmExpFormalitiItemNoDomain>  searchByConditionForPagingResultList = tmExpFormalitiItemNoService.searchByConditionForPaging(tmExpFormalitiItemNoCriteriaDomain);
        
        if (searchByConditionForPagingResultList != null && searchByConditionForPagingResultList.size() > 0) {
            if (tmpDomain != null) {
                tmpDomain.setItemDescription(searchByConditionForPagingResultList.get(0).getItemDescription());
            }
            return true;
        }
        return false;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(BigDecimal firmQty, BigDecimal shippingLot){
        return validateRemainder(firmQty, shippingLot);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(BigDecimal firmQty, BigDecimal shippingLot){
        return validateRemainder(firmQty, shippingLot);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(BigDecimal  firmQty, BigDecimal shippingLot) {
        if (BigDecimal.ZERO.equals(firmQty)) {
            return true;
        }
        return validateRemainder(firmQty, shippingLot);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(java.math.BigDecimal, java.math.BigDecimal)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(BigDecimal firmQty, BigDecimal shippingLot) {
        if (BigDecimal.ZERO.equals(firmQty)) {
            return true;
        }
        return validateRemainder(firmQty, shippingLot);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmNxsCompOnHeaderMoveToRegister(java.lang.String, com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmNxsCompOnHeaderMoveToRegister(String compCd, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException {
        return validateCompCdExist(compCd, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmNxsComp(java.lang.String, com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmNxsComp(String compCd, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException {
        return validateCompCdExist(compCd, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmNxsCompOnLstDgtChgRegister(java.lang.String, WB001OdrRcvDomain)
     */
    public boolean validateDatabaseTmNxsCompOnLstDgtChgRegister(String compCd, WB001OdrRcvDomain tmpDomain) throws ApplicationException {
        return validateCompCdExist(compCd, tmpDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmNxsCompOnMultiPoRegister(java.lang.String)
     */
    public boolean validateDatabaseTmNxsCompOnMultiPoRegister(String compCd) throws ApplicationException {
        return validateCompCdExist(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTmNxsCompOnRegister(java.lang.String)
     */
    public boolean validateDatabaseTmNxsCompOnRegister(String compCd) throws ApplicationException {
        return validateCompCdExist(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(int, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, java.util.List)
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(int index, TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before,
        List<? extends WB001OdrRcvDomain> odrRcvList)
        throws ApplicationException {
        
        for (WB001OdrRcvDomain odrRcv : odrRcvList){
            String CustomerItemNo = odrRcv.getCustomerItemNo();
            String CustomerPoNo = odrRcv.getCustomerPoNo();
            
            if (after.getCustomerItemNo().equals(CustomerItemNo) && after.getCustomerPoNo().equals(CustomerPoNo)
                && index != odrRcv.getIndex()){
                return false;
            }
        }
        
        
        return validateDatabaseTtExpRcvOdrByDuplication(after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(java.math.BigDecimal, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(BigDecimal firmQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException {
        
        return validateDatabaseTtExpRcvOdrByFirmQty(firmQty, after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(java.math.BigDecimal, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(BigDecimal forecastQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before) 
        throws ApplicationException {
        
        return validateDatabaseTtExpRcvOdrByForecastQty(forecastQty, after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByDuplication(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByDuplication(TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException {
        
        return validateDatabaseTtExpRcvOdrByDuplication(after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(java.math.BigDecimal, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(BigDecimal firmQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before) throws ApplicationException {
        
        return validateDatabaseTtExpRcvOdrByFirmQty(firmQty, after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(java.math.BigDecimal, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(BigDecimal forecastQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException {
        
        return validateDatabaseTtExpRcvOdrByForecastQty(forecastQty, after, before);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB001OnHeaderMoveToRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain)
     */
    public boolean validateDatabaseWsB001OnHeaderMoveToRegister(String rcvOdrCompCd, String customerCd, String lgcyShipTo, 
        String itemNo, String pkgCd, Date etdDueDt, WsB001ResultDomain result) throws ApplicationException {

        // 戻り値
        boolean methodResult = true;
        
        // Webサービス呼び出し
        WsB001ResultDomain wsResult = wsB001RestService.searchOdrEntryHdrOnHand(rcvOdrCompCd, customerCd, lgcyShipTo, itemNo, pkgCd, etdDueDt);
        // 結果コードの取得
        String resultCode = wsResult.getResultCode();
        
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            methodResult = false;
        }
        
        // 取得値設定
        result.setResultCode(wsResult.getResultCode());
        result.setDateList(wsResult.getDateList());
        result.setErrorList(wsResult.getErrorList());
        result.setPartName(wsResult.getPartName());
        result.setPlantCodeLegacy(wsResult.getPlantCodeLegacy());
        result.setSupplierCode(wsResult.getSupplierCode());
        
        return methodResult;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB002OnMultiPoRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain)
     */
    public boolean validateDatabaseWsB002OnMultiPoRegister(
        String compCd, String customerCd, String lgcyShipTo, String itemNo, String pkgCd, String trnsCd, 
        List<String> indexList, List<Date> etdDueDtList, List<String> customerItemNoList, WsB002ResultDomain result)
        throws ApplicationException {

        // 戻り値
        boolean methodResult = true;
        
        // Webサービス呼び出し
        WsB002ResultDomain wsResult = wsB002RestService.searchOdrEntryDtlOnHand(compCd, customerCd, lgcyShipTo, itemNo, pkgCd, trnsCd, indexList, etdDueDtList, customerItemNoList);
        
        // 結果コードの取得
        String resultCode = wsResult.getResultCode();
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            methodResult = false;
        }
        
        // 取得値設定
        result.setCustomerOrderList(wsResult.getCustomerOrderList());
        result.setErrorList(wsResult.getErrorList());
        result.setResultCode(wsResult.getResultCode());
        
        return methodResult;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB002OnRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain)
     */
    public boolean validateDatabaseWsB002OnRegister(String compCd, String customerCd, String lgcyShipTo, 
        String itemNo, String pkgCd, String trnsCd, List<String> indexList, List<Date> etdDueDtList, List<String> customerItemNoList, WsB002ResultDomain result)
        throws ApplicationException {

        // 戻り値
        boolean methodResult = true;

        // Webサービス呼び出し
        WsB002ResultDomain wsResult = wsB002RestService.searchOdrEntryDtlOnHand(compCd, customerCd, lgcyShipTo, itemNo, pkgCd, trnsCd, indexList, etdDueDtList, customerItemNoList);

        // 結果コードの取得
        String resultCode = wsResult.getResultCode();
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            methodResult = false;
        }
        
        // 取得値設定
        result.setCustomerOrderList(wsResult.getCustomerOrderList());
        result.setErrorList(wsResult.getErrorList());
        result.setResultCode(wsResult.getResultCode());
        
        return methodResult;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB003OnLstDgtChgRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String)
     */
    public List<String> validateDatabaseWsB003OnLstDgtChgRegister(
        String compCd, String customerCd, String lgcyShipTo, String trnsCd, Date shippingDt, String itemNoOrg, String pkgCd) 
        throws ApplicationException {
        
        // Webサービス呼び出し
        ResultDomain result = wsB003RestService.searchEdiOdrLastDigChgHdr(compCd, customerCd, lgcyShipTo, trnsCd, shippingDt, itemNoOrg, pkgCd);
        
        // 結果コードの取得
        String resultCode = result.getResultCode();
        
        // エラーコードリストの設定
        List<String> errList = new ArrayList<String>();
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            for (ErrorListItemDomain err :  result.getErrorList()) {
                errList.add(err.getErrorCode());
            }
        }
        
        return errList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB005OnLstDgtChgRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.List, java.util.List, com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain)
     */
    public List<String> validateDatabaseWsB005OnLstDgtChgRegister(
        String compCd, String customerCd, String lgcyShipTo, String trnsCd, Date shippingDt, 
        List<String> indexList, List<String> itemNoList, WsB005ResultDomain result) throws ApplicationException {
        
        // Webサービス呼び出し
        WsB005ResultDomain wsResult = 
            wsB005RestService.searchEdiOdrLastDigChgDtl(compCd, customerCd, lgcyShipTo, shippingDt, indexList, itemNoList);
        
        // 結果コードの取得
        String resultCode = wsResult.getResultCode();
        
        // エラーコードリストの設定
        List<String> errCdList = new ArrayList<String>();
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            for (WsB005ResultItemDomain customerOrder : wsResult.getCustomerOrderList()){
                if (customerOrder.getErrorList() != null && customerOrder.getErrorList().size() > 0) {
                    for (WsB005ResultSubItemDomain error : customerOrder.getErrorList()){
                        String errCd = error.getCode();
                        errCdList.add(errCd);
                    }
                }
            }
        }
        
        // 取得値設定
        result.setResultCode(wsResult.getResultCode());
        result.setCustomerOrderList(wsResult.getCustomerOrderList());
        result.setErrorList(wsResult.getErrorList());
        
        return errCdList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB011OnHeaderMoveToRegister(java.lang.String, java.lang.String, java.lang.String)
     */
    public List<String> validateDatabaseWsB011OnHeaderMoveToRegister(String compCd, String customerCd, String lgcyShipTo)
        throws ApplicationException {
        // 戻り値
        List<String> resultErrorList = new ArrayList<String>();
        
        // Webサービス呼び出し
        WsB011ResultDomain result = wsB011RestService.searchEdiSupport(compCd, customerCd, lgcyShipTo);
        // 結果コードの取得
        String resultCode = result.getResultCode();
        
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            List<ErrorListItemDomain> errorList = result.getErrorList();
            for(Iterator<ErrorListItemDomain> i = errorList.iterator(); i.hasNext();) {
                ErrorListItemDomain itemDomain = i.next();
                resultErrorList.add(itemDomain.getErrorCode());
            }
        }
        
        if (StringUtils.equals(result.getFlag(), FLAG_Y)){
            resultErrorList.add(NXS_E7_0036);
        }
        
        return resultErrorList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#validateDatabaseWsB011OnLstDgtChgMainSearch(java.lang.String, java.lang.String, java.lang.String)
     */
    public List<String> validateDatabaseWsB011OnLstDgtChgMainSearch(String compCd, String customerCd, String lgcyShipTo)
        throws ApplicationException {
        // 戻り値
        List<String> resultErrorList = new ArrayList<String>();
        
        // Webサービス呼び出し
        WsB011ResultDomain result = wsB011RestService.searchEdiSupport(compCd, customerCd, lgcyShipTo);
        
        // 結果コードの取得
        String resultCode = result.getResultCode();
        
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            // WsB011の結果でエラーが戻ってくることはないが念のために実装
            List<ErrorListItemDomain> errorList = result.getErrorList();
            for(Iterator<ErrorListItemDomain> i = errorList.iterator(); i.hasNext();) {
                ErrorListItemDomain itemDomain = i.next();
                resultErrorList.add(itemDomain.getErrorCode());
            }
        }
        
        if (StringUtils.equals(result.getFlag(), FLAG_N)){
            resultErrorList.add(NXS_E7_0037);
        }
        
        return resultErrorList;
    }


    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    
    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchForPagingOnDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingOnDetailInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException {
        
        int resultCount = wb001OdrRcvDao.searchCountTtExpRcvOdrByDetailInit(criteria);
        setPageInfo(criteria.getPageInfoCreator(), resultCount, criteria);

        return wb001OdrRcvDao.searchForPagingTtExpRcvOdrByDetailInit(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchForPagingOnLstDgtChgMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingOnLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException {
        
        if (!userAuthService.hasRegisterAll()) {
            criteria.setUserAuthList(userAuthService.getUserAuthList(PERMIT_FUNC_ID_WB001R));
        }
        int resultCount = wb001OdrRcvDao.searchCountTtExpRcvOdrByLstDgtChgMainSearch(criteria);
        
        // 検索範囲の設定
        setPageInfo(criteria.getPageInfoCreator(), resultCount, criteria);
        
        return wb001OdrRcvDao.searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingOnMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException {

        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(criteria.getRcvOdrCompCd());
        TmNxsCompDomain tmNxsCompResultDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        
        if (tmNxsCompResultDomain != null && !StringUtils.isEmpty(tmNxsCompResultDomain.getCompNm())) {
            criteria.setRcvOdrCompNm(tmNxsCompResultDomain.getCompNm());
            Date cigmaAds = commonService.searchCigmaAds(criteria.getRcvOdrCompCd());
            
            TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteriaDomain = new TmExpFormalitiItemNoCriteriaDomain();
            tmExpFormalitiItemNoCriteriaDomain.setCompCd(criteria.getRcvOdrCompCd());
            tmExpFormalitiItemNoCriteriaDomain.setItemNo(criteria.getItemNo());
            tmExpFormalitiItemNoCriteriaDomain.setAplyStrtDtLessThanEqual(cigmaAds);
            tmExpFormalitiItemNoCriteriaDomain.setRowNumFrom(1);
            tmExpFormalitiItemNoCriteriaDomain.setRowNumTo(1);
            tmExpFormalitiItemNoCriteriaDomain.setPreferredOrder("APLY_STRT_DT desc");
            
            List<TmExpFormalitiItemNoDomain> tmExpFormalitiItemNoDomainList = tmExpFormalitiItemNoService.searchByConditionForPaging(tmExpFormalitiItemNoCriteriaDomain);
            if (tmExpFormalitiItemNoDomainList != null && tmExpFormalitiItemNoDomainList.size() > 0) {
                criteria.setItemNm(tmExpFormalitiItemNoDomainList.get(0).getItemDescription());
            }
        }
        
        if (!userAuthService.hasBrowseAll() && !userAuthService.hasRegisterAll()){
            criteria.setUserAuthList(userAuthService.getUserAuthList(PERMIT_FUNC_ID_WB001B, PERMIT_FUNC_ID_WB001R));
        }
        
        int resultCount = wb001OdrRcvDao.searchCountTtExpRcvOdrByMainSearch(criteria);
        
        List<? extends WB001OdrRcvDomain> searchResultList = new ArrayList<WB001OdrRcvDomain>();
        
        if (new Integer(resultCount) != null && resultCount != 0){
            // ページ情報の取得
            PageInfoCreator pageInfoCreator = criteria.getPageInfoCreator();
            PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(resultCount, null, null, criteria.getLocale());

            // 検索条件ドメインに開始・終了位置を設定
            criteria.setRowNumFrom(pageInfoData.getFromCount());
            criteria.setRowNumTo(pageInfoData.getToCount());

            searchResultList = wb001OdrRcvDao.searchForPagingTtExpRcvOdrByMainSearch(criteria);
        }
        
        return searchResultList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchOnHeaderInit(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public WB001OdrRcvDomain searchOnHeaderInit(WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        // パラメータの取得
        String compCd = criteria.getOwnerCompCd();
        
        Date cigmaAds = commonService.searchCigmaAds(compCd);
        WB001OdrRcvDomain resultDomain = new WB001OdrRcvDomain();
        resultDomain.setEtdDueDt(cigmaAds);
        
        return resultDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchOnLstDgtChgRegisterInit(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public WB001OdrRcvDomain searchOnLstDgtChgRegisterInit(WB001OdrRcvDomain odrRcv)
        throws ApplicationException {
        
        // 輸出受注、輸出出荷品目番号原単位の検索 ※1
        WB001OdrRcvCriteriaDomain orgItemCriteria = new WB001OdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(orgItemCriteria, odrRcv);
        
        List<? extends WB001OdrRcvDomain> orgItemList = wb001OdrRcvDao.searchTtExpRcvOdrByLstDgtChgRegisterInit(orgItemCriteria);
        
        if (!(orgItemList != null && orgItemList.size() > 0)) {
            // 前画面WB006で参照できているオリジナルのitemが存在しないのはおかしい
            // 別のユーザーに削除された可能性がある
            throw new ApplicationException(GSCM_E0_0001);
        }
        
        // 品番末尾以外が一致し、過去1ヶ月間に受注が存在する品目番号を検索 ※2
        WB001OdrRcvCriteriaDomain lastDigitChangeCriteria = new WB001OdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(lastDigitChangeCriteria, odrRcv);
        
        Date cigmaAds = commonService.searchCigmaAds(odrRcv.getRcvOdrCompCd());
        lastDigitChangeCriteria.setEtdDueDt(cigmaAds);
        Calendar oneMonthBefore = Calendar.getInstance();
        oneMonthBefore.setTime(cigmaAds);
        oneMonthBefore.add(Calendar.MONTH, -1);
        lastDigitChangeCriteria.setOneMonthBefore(oneMonthBefore.getTime());
        
        // 品目番号の13桁目を置換
        StringBuffer itemNoOrgSb = new StringBuffer(lastDigitChangeCriteria.getItemNoOrg());
        itemNoOrgSb.replace(12, 13, "_");
        lastDigitChangeCriteria.setItemNoOrg(itemNoOrgSb.toString());
        
        List<? extends WB001OdrRcvDomain> lastDigitChangeItemList = wb001OdrRcvDao.searchTtExpRcvOdrByLstDgtChgRegisterInitPost(lastDigitChangeCriteria);
        
        // 品番末尾以外が一致し、在庫がある品目番号を検索 ※3
        WsB004ResultDomain wsB004Result = wsB004RestService.searchEdiOdrLastDigChgCandidate(odrRcv.getRcvOdrCompCd(), odrRcv.getItemNoOrg());
        
        // WsB004でエラーがあれば、処理を中断
        String resultCode = wsB004Result.getResultCode();
        if (!StringUtils.equals(resultCode, WS_RESULT_SUCCESS)) {
            // システムエラーしかない為、ApplicationExceptionとする
            throw new ApplicationException(GSCM_E0_0010);
        }
        
        // Webサービスの結果を取得
        List<String> wsB004PartList = wsB004Result.getPartList();
        
        // Webサービスの結果分、輸出出荷品目番号原単位に存在する品目番号を検索
        List<TmExpItemNoSpInfoDomain> stockItemList = new ArrayList<TmExpItemNoSpInfoDomain>();
        for(Iterator<String> i = wsB004PartList.iterator(); i.hasNext();) {
            String wsResultPartNo = i.next();
            
            // 輸出出荷品目番号原単位の検索
            TmExpItemNoSpInfoCriteriaDomain tmExpItemNoSpInfoCriteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
            tmExpItemNoSpInfoCriteriaDomain.setCompCd(odrRcv.getRcvOdrCompCd());
            tmExpItemNoSpInfoCriteriaDomain.setItemNo(wsResultPartNo);
            tmExpItemNoSpInfoCriteriaDomain.setPkgCd(odrRcv.getPkgCd());
            tmExpItemNoSpInfoCriteriaDomain.setCustomerCd(odrRcv.getCustomerCd());
            tmExpItemNoSpInfoCriteriaDomain.setLgcyShipTo(odrRcv.getLgcyShipTo());
            tmExpItemNoSpInfoCriteriaDomain.setAplyStrtDtLessThanEqual(orgItemList.get(0).getEtdDueDt());
            tmExpItemNoSpInfoCriteriaDomain.setPreferredOrder("APLY_STRT_DT desc");
            tmExpItemNoSpInfoCriteriaDomain.setRowNumFrom(1);
            tmExpItemNoSpInfoCriteriaDomain.setRowNumTo(1);
            
            List<TmExpItemNoSpInfoDomain> tmExpItemNoSpInfoList = tmExpItemNoSpInfoService.searchByConditionForPaging(tmExpItemNoSpInfoCriteriaDomain);
            
            // 輸出出荷品目番号原単位に存在しない品目番号は候補としない
            if (tmExpItemNoSpInfoList != null && tmExpItemNoSpInfoList.size() > 0) {
                stockItemList.add(tmExpItemNoSpInfoList.get(0));
            }
        }
        
        // 輸出受注ドメインの設定
        List<WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        
        // 輸出受注ドメインに※1の追加
        for (Iterator<? extends WB001OdrRcvDomain> i = orgItemList.iterator(); i.hasNext();) {
            WB001OdrRcvDomain orgItem = i.next();
            orgItem.setCustomerItemNoHidden(orgItem.getCustomerItemNo());
            orgItem.setOdrQtyHidden(orgItem.getOdrQty());
            orgItem.setUpdateTimestamp(orgItem.getComUpdateTimestamp());

            resultList.add(orgItem);
        }
        
        // 輸出受注ドメインに※2の追加(重複は省く)
        boolean duplicateFlg = false;
        if (lastDigitChangeItemList != null && lastDigitChangeItemList.size() > 0) {
            for (Iterator<? extends WB001OdrRcvDomain> i = lastDigitChangeItemList.iterator(); i.hasNext();) {
                WB001OdrRcvDomain lastDigitChangeItem = i.next();
                
                for (Iterator<? extends WB001OdrRcvDomain> j = resultList.iterator(); j.hasNext();) {
                    WB001OdrRcvDomain resultListDomain = j.next();
                    
                    if (resultListDomain.getItemNo().equals(lastDigitChangeItem.getItemNo())) {
                        duplicateFlg = true;
                        break;
                    }
                }
                
                if (!duplicateFlg) {
                    lastDigitChangeItem.setOdrCtrlNo(resultList.get(0).getOdrCtrlNo());
                    lastDigitChangeItem.setEtdDueDt(resultList.get(0).getEtdDueDt());
                    lastDigitChangeItem.setCustomerPoNo(resultList.get(0).getCustomerPoNo());
                    lastDigitChangeItem.setCustomerItemNoHidden(resultList.get(0).getCustomerItemNo());
                    lastDigitChangeItem.setCustomerItemNoOrg(resultList.get(0).getCustomerItemNoOrg());
                    lastDigitChangeItem.setSalesCompPoNo(resultList.get(0).getSalesCompPoNo());
                    lastDigitChangeItem.setSalesCompPoNoHidden(resultList.get(0).getSalesCompPoNo());
                    lastDigitChangeItem.setSupplierCd(resultList.get(0).getSupplierCd());
                    lastDigitChangeItem.setCustomerDueDt(resultList.get(0).getCustomerDueDt());
                    lastDigitChangeItem.setRevisionNo(resultList.get(0).getRevisionNo());
                    lastDigitChangeItem.setRevisionNoEis(resultList.get(0).getRevisionNoEis());
                    lastDigitChangeItem.setPlntCd(resultList.get(0).getPlntCd());
                    
                    lastDigitChangeItem.setPltzAllocQty(new BigDecimal(0));
                    lastDigitChangeItem.setOdrQty(new BigDecimal(0));
                    lastDigitChangeItem.setOdrQtyHidden(new BigDecimal(0));
                    lastDigitChangeItem.setUpdateTimestamp(null);
                    resultList.add(lastDigitChangeItem);
                }
                duplicateFlg = false;
            }
        }
        
        // 輸出受注ドメインに※3の追加(重複は省く)
        duplicateFlg = false;
        if (stockItemList != null && stockItemList.size() > 0) {
            for (Iterator<TmExpItemNoSpInfoDomain> i = stockItemList.iterator(); i.hasNext();) {
                TmExpItemNoSpInfoDomain stockItem = i.next();
                
                for (Iterator<? extends WB001OdrRcvDomain> j = resultList.iterator(); j.hasNext();) {
                    WB001OdrRcvDomain resultListDomain = j.next();
                    
                    if (resultListDomain.getItemNo().equals(stockItem.getItemNo())) {
                        duplicateFlg = true;
                        break;
                    }
                }
                
                if (!duplicateFlg) {
                    WB001OdrRcvDomain stockOdrRcv = new WB001OdrRcvDomain();
                    
                    stockOdrRcv.setOdrCtrlNo(resultList.get(0).getOdrCtrlNo());
                    stockOdrRcv.setEtdDueDt(resultList.get(0).getEtdDueDt());
                    stockOdrRcv.setCustomerPoNo(resultList.get(0).getCustomerPoNo());
                    stockOdrRcv.setCustomerItemNoHidden(resultList.get(0).getCustomerItemNo());
                    stockOdrRcv.setCustomerItemNoOrg(resultList.get(0).getCustomerItemNoOrg());
                    stockOdrRcv.setSalesCompPoNo(resultList.get(0).getSalesCompPoNo());
                    stockOdrRcv.setSupplierCd(resultList.get(0).getSupplierCd());
                    stockOdrRcv.setCustomerDueDt(resultList.get(0).getCustomerDueDt());
                    stockOdrRcv.setRevisionNo(resultList.get(0).getRevisionNo());
                    stockOdrRcv.setRevisionNoEis(resultList.get(0).getRevisionNoEis());
                    stockOdrRcv.setPlntCd(resultList.get(0).getPlntCd());
                    
                    stockOdrRcv.setItemNo(stockItem.getItemNo());
                    stockOdrRcv.setShippingLot(stockItem.getShippingLot());
                    stockOdrRcv.setPltzAllocQty(new BigDecimal(0));
                    stockOdrRcv.setOdrQty(new BigDecimal(0));
                    stockOdrRcv.setOdrQtyHidden(new BigDecimal(0));
                    stockOdrRcv.setUpdateTimestamp(null);
                    resultList.add(stockOdrRcv);
                }
                duplicateFlg = false;
            }
        }
        
        // ソート後結果リスト
        List<WB001OdrRcvDomain> resultSortedList = new ArrayList<WB001OdrRcvDomain>();
        
        // itemNoのリストを作成しソート
        List<String> itemNoList = new ArrayList<String>();
        for (WB001OdrRcvDomain result : resultList){
            itemNoList.add(result.getItemNo());
        }
        Collections.sort(itemNoList);
        
        // 結果リストをソート
        for (String itemNo : itemNoList){
            for (WB001OdrRcvDomain result : resultList){
                if (StringUtils.equals(itemNo, result.getItemNo())){
                    resultSortedList.add(result);
                    break;
                }
            }
        }
        
        // 戻り値に設定
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        result.setCountUpdData(odrRcv.getCountUpdData());
        result.setOdrRcvDomainList(resultSortedList);
        
        return result;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#searchOnRegisterInit(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public WB001OdrRcvDomain searchOnRegisterInit(WB001OdrRcvDomain odrRcv)
        throws ApplicationException {
        
        // 輸出受注（親）ドメインの設定
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 輸出受注（子）ドメインの検索
        List<? extends WB001OdrRcvDomain> childOdrRcvList = wb001OdrRcvDao.searchTtExpRcvOdrByRegisterInit(parentOdrRcv);
        
        // 親子関係の紐づけ
        parentOdrRcv.setOdrRcvDomainList(childOdrRcvList);
        
        // 月別合計数量の算出と設定
        setTotalQtyOfMonthly(parentOdrRcv);
        
        // 稼働日情報と輸出受注情報のマージ
        mergeWorkDayAndOdrRcvList(parentOdrRcv);
        
        return parentOdrRcv;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public List<? extends WB001OdrRcvDomain> serchOnMultiPoRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException {

        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        
        // 検索条件を設定(先頭から20件のみ取得)
        ttExpRcvOdrCriteria.setRcvOdrCompCd(odrRcv.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(odrRcv.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(odrRcv.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(odrRcv.getItemNo());
        ttExpRcvOdrCriteria.setPkgCd(odrRcv.getPkgCd());
        ttExpRcvOdrCriteria.setTrnsCd(odrRcv.getTrnsCd());
        ttExpRcvOdrCriteria.setEtdDueDt(odrRcv.getEtdDueDt());
        ttExpRcvOdrCriteria.setRowNumFrom(1);
        ttExpRcvOdrCriteria.setRowNumTo(PAGE_MAX_COUNT_FOR_WB003);
        
        // ソート順指定
        ttExpRcvOdrCriteria.setPreferredOrder("CUSTOMER_DUE_DT asc, CUSTOMER_ITEM_NO asc, CUSTOMER_PO_NO asc");
        
        // 検索結果を取得
        List<? extends TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByConditionForPaging(ttExpRcvOdrCriteria);
        
        List<WB001OdrRcvDomain> resultOdrRcvList = new ArrayList<WB001OdrRcvDomain>();

        if (ttExpRcvOdrList != null && ttExpRcvOdrList.size() > 0) {
            for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList) {
                if (ttExpRcvOdr != null ) {
                    WB001OdrRcvDomain resultOdrRcv = new WB001OdrRcvDomain();
                    CommonUtil.copyPropertiesDomainToDomain(resultOdrRcv, ttExpRcvOdr);
                    
                    // 受注確定フラグ
                    String odrFirmFlg = ttExpRcvOdr.getOdrFirmFlg();
                    // 注文数量
                    BigDecimal odrQty = ttExpRcvOdr.getOdrQty();
                    
                    // DECODE処理(FirmQty)
                    if (FLAG_Y.equals(odrFirmFlg)) {
                        resultOdrRcv.setFirmQty(odrQty);
                    } else {
                        resultOdrRcv.setFirmQty(BigDecimal.ZERO);
                    }
                    
                    // DECODE処理(ForecastQty)
                    if (FLAG_N.equals(odrFirmFlg)) {
                        resultOdrRcv.setForecastQty(odrQty);
                    } else {
                        resultOdrRcv.setForecastQty(BigDecimal.ZERO);
                    }
                    
                    resultOdrRcvList.add(resultOdrRcv);
                }
            }
        }
        return resultOdrRcvList;
    }
    
    // --------------------------------- Update system method update -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- Delete system method delete -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    
    // -------------------------------- Transaction system method transact ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public WB001OdrRcvDomain transactOnLstDgtChgRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException{
        
        // 処理タイプ
        String processType = "";
        
        // 検索条件部分ドメイン(親)
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 明細部分ドメイン(子)
        List<? extends WB001OdrRcvDomain> childrenOdrRcv = odrRcv.getOdrRcvDomainList();
        
        // CIGMA直納受注反映用リスト
        List<WsB007ParamItemDomain> wsB007ParamItemList = new ArrayList<WsB007ParamItemDomain>();
        
        // 使用項目の設定
        String rcvOdrCompCd = parentOdrRcv.getRcvOdrCompCd();
        
        // カウンターの初期化
        int countIns = 0;
        int countUpd = 0;
        int countDel = 0;
        
        for (WB001OdrRcvDomain childOdrRcv : childrenOdrRcv) {
            // 使用項目の設定
            String itemNo = childOdrRcv.getItemNo();
            Date etdDueDt = childOdrRcv.getEtdDueDt();
            BigDecimal odrQty = convertNullToZero(childOdrRcv.getOdrQty());
            BigDecimal odrQtyHidden = childOdrRcv.getOdrQtyHidden();
            String partName = childOdrRcv.getPartName();
            
            // 注文数量が変更された行のみ、更新処理を実施する。
            if (odrQty.compareTo(odrQtyHidden) != 0) {
                // 処理モードの判定
                if (!existsOdrRcv(parentOdrRcv, childOdrRcv)) {
                    processType = PROCESS_TYPE_REGISTER;
                    countIns++;
                } else if(odrQty.compareTo(BigDecimal.ZERO) != 0) {
                    processType = PROCESS_TYPE_UPDATE;
                    countUpd++;
                } else {
                    processType = PROCESS_TYPE_DELETE;
                    countDel++;
                }
                
                //  輸出受注ロック結果格納ドメイン
                TtExpRcvOdrDomain lockOdrRcv = new TtExpRcvOdrDomain();
                
                // 処理モード(新規の場合)
                if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
                    insertOdrRcv(SCREEN_ID_WB007, parentOdrRcv, childOdrRcv);
                } else {
                    // 輸出受注のロック
                    lockOdrRcv = lockOdrRcv(SCREEN_ID_WB007, parentOdrRcv, childOdrRcv);
                    
                    // 処理モード(更新の場合)
                    if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
                        updateOdrRcv(SCREEN_ID_WB007, parentOdrRcv, childOdrRcv, lockOdrRcv);
                    // 処理モード(削除の場合)
                    } else if (StringUtils.equals(processType, PROCESS_TYPE_DELETE)) {
                        deleteOdrRcv(SCREEN_ID_WB007, parentOdrRcv, childOdrRcv);
                    }
                }
                
                // 輸出手続品目番号原単位の品目名称更新
                updateItemDexcription(SCREEN_ID_WB007, rcvOdrCompCd, itemNo, etdDueDt, partName);
                
                // CIGMA直納受注反映用リストに設定
                wsB007ParamItemList.add(setWsB007Param(SCREEN_ID_WB007, processType, parentOdrRcv, childOdrRcv, lockOdrRcv));
            }
        }
        
        // CIGMA直納受注反映
        if (0 < wsB007ParamItemList.size()) {
            WsB007ParamDomain wsB007Param = new WsB007ParamDomain();
            wsB007Param.setReceivingCompanyCode(rcvOdrCompCd);
            wsB007Param.setExpRcvOdrUpdateList(wsB007ParamItemList);
            
            ResultDomain wsb007Result = wsB007RestService.reflectToCusOdr(rcvOdrCompCd, wsB007Param);
            if (!WS_RESULT_SUCCESS.equals(wsb007Result.getResultCode())){
                throw new GscmApplicationException(NXS_91_0001);
            }
        }
        
        // 更新結果の件数をActionに渡す為にDomainに設定
        int[] count = {countIns, countDel, countUpd};
        parentOdrRcv.setCountUpdData(count);
        
        // 再検索のため、初期処理を呼び出し
        return searchOnLstDgtChgRegisterInit(parentOdrRcv);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public List<? extends WB001OdrRcvDomain> transactOnMultiPoRegister(WB001OdrRcvDomain odrRcv) throws ApplicationException {
        
        // 処理タイプ
        String processType = "";
        
        // 検索条件部分ドメイン(親)
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 明細部分ドメイン(子)
        List<? extends WB001OdrRcvDomain> childrenOdrRcv = odrRcv.getOdrRcvDomainList();
        
        // CIGMA直納受注反映用リスト
        List<WsB007ParamItemDomain> wsB007ParamItemList = new ArrayList<WsB007ParamItemDomain>();
        
        // 使用する項目の取得と設定
        String rcvOdrCompCd = parentOdrRcv.getRcvOdrCompCd();
        String itemNo = parentOdrRcv.getItemNo();
        Date etdDueDt = parentOdrRcv.getEtdDueDt();
        String partName = parentOdrRcv.getPartName();
        
        for (WB001OdrRcvDomain childOdrRcv : childrenOdrRcv) {
            // 確定数量、内示数量の取得
            BigDecimal firmQty = convertNullToZero(childOdrRcv.getFirmQty());
            BigDecimal forecastQty = convertNullToZero(childOdrRcv.getForecastQty());
            
            // 元の受注数を設定
            BigDecimal HiddenOdrQty = childOdrRcv.getOdrQty();
            childOdrRcv.setOdrQtyHidden(HiddenOdrQty);
            
            // 受注数量、受注確定フラグをドメイン（子）に設定
            setOdrFirm(firmQty, forecastQty, childOdrRcv);
            
            // 受注数量
            BigDecimal odrQty = childOdrRcv.getOdrQty();
            
            // 得意先品目番号(Hidden)
            String customerItemNoHidden = childOdrRcv.getCustomerItemNoHidden();
            
            // 処理モードの判定
            if (StringUtils.isBlank(customerItemNoHidden)) {
                processType = PROCESS_TYPE_REGISTER;
            } else if(odrQty.compareTo(BigDecimal.ZERO) != 0) {
                processType = PROCESS_TYPE_UPDATE;
            } else {
                processType = PROCESS_TYPE_DELETE;
            }
            
            // 輸出受注ロック結果格納ドメイン
            TtExpRcvOdrDomain lockOdrRcv = new TtExpRcvOdrDomain();
            
            // 処理モード(新規の場合)
            if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
                //try {
                insertOdrRcv(SCREEN_ID_WB003, parentOdrRcv, childOdrRcv);
                //} catch (Exception e) {
                //    // 一意制約違反をcatch。画面の明細に同じ値をセットした場合に発生しうる。
                //    throw new ApplicationException(e);
                //}
            } else {
                // 輸出受注のロック
                lockOdrRcv = lockOdrRcv(SCREEN_ID_WB003, parentOdrRcv, childOdrRcv);
                
                // 処理モード(更新の場合)
                if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
                    updateOdrRcv(SCREEN_ID_WB003, parentOdrRcv, childOdrRcv, lockOdrRcv);
                // 処理モード(削除の場合)
                } else if (StringUtils.equals(processType, PROCESS_TYPE_DELETE)) {
                    deleteOdrRcv(SCREEN_ID_WB003, parentOdrRcv, childOdrRcv);
                }
            }
            
            // 輸出手続品目番号原単位の品目名称更新
            updateItemDexcription(SCREEN_ID_WB003, rcvOdrCompCd, itemNo, etdDueDt, partName);
            
            // CIGMA直納受注反映用リストに設定
            wsB007ParamItemList.add(setWsB007Param(SCREEN_ID_WB003, processType, parentOdrRcv, childOdrRcv, lockOdrRcv));
        }
        
        // CIGMA直納受注反映
        if (0 < wsB007ParamItemList.size()) {
            WsB007ParamDomain wsB007Param = new WsB007ParamDomain();
            wsB007Param.setReceivingCompanyCode(rcvOdrCompCd);
            wsB007Param.setExpRcvOdrUpdateList(wsB007ParamItemList);
            
            ResultDomain wsb007Result = wsB007RestService.reflectToCusOdr(rcvOdrCompCd, wsB007Param);
            if (!WS_RESULT_SUCCESS.equals(wsb007Result.getResultCode())){
                throw new GscmApplicationException(NXS_91_0001);
            }
        }
        
        // 再検索のため、初期処理を呼び出し
        return serchOnMultiPoRegister(parentOdrRcv);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WB001OdrRcvService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    public WB001OdrRcvDomain transactOnRegister(WB001OdrRcvDomain odrRcv) throws ApplicationException {
        
        // 処理タイプ
        String processType = "";
        
        // 検索条件部分ドメイン(親)
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 明細部分ドメイン(子)
        List<? extends WB001OdrRcvDomain> childrenOdrRcv = odrRcv.getOdrRcvDomainList();
        
        // CIGMA直納受注反映用リスト
        List<WsB007ParamItemDomain> wsB007ParamItemList = new ArrayList<WsB007ParamItemDomain>();
        
        // 使用する項目の取得と設定
        String rcvOdrCompCd = parentOdrRcv.getRcvOdrCompCd();
        String itemNo = parentOdrRcv.getItemNo();
        String partName = parentOdrRcv.getPartName();
        
        for (WB001OdrRcvDomain childOdrRcv : childrenOdrRcv) {
            // 使用する項目の取得と設定
            
            // 船積期限の取得
            Date etdDueDt = childOdrRcv.getEtdDueDt();
            
            // 確定数量、内示数量の取得
            BigDecimal firmQty = convertNullToZero(childOdrRcv.getFirmQty());
            BigDecimal forecastQty = convertNullToZero(childOdrRcv.getForecastQty());
            
            // 元の受注数を設定
            BigDecimal HiddenOdrQty = childOdrRcv.getOdrQty();
            childOdrRcv.setOdrQtyHidden(HiddenOdrQty);
            
            // 受注数量、受注確定フラグをドメイン（子）に設定
            setOdrFirm(firmQty, forecastQty, childOdrRcv);
            
            // 受注数量の取得
            BigDecimal odrQty = childOdrRcv.getOdrQty();
            
            // 得意先品目番号(Hidden)
            String customerItemNoHidden = childOdrRcv.getCustomerItemNoHidden();
            
            // 処理モードの判定
            if (StringUtils.isBlank(customerItemNoHidden)) {
                processType = PROCESS_TYPE_REGISTER;
            } else if(odrQty.compareTo(BigDecimal.ZERO) != 0) {
                processType = PROCESS_TYPE_UPDATE;
            } else {
                processType = PROCESS_TYPE_DELETE;
            }
            
            // 輸出受注ロック結果格納ドメイン
            TtExpRcvOdrDomain lockOdrRcv = new TtExpRcvOdrDomain();
            
            // 処理モード(新規の場合)
            if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
                insertOdrRcv(SCREEN_ID_WB002, parentOdrRcv, childOdrRcv);
            } else {
                // 輸出受注のロック
                lockOdrRcv = lockOdrRcv(SCREEN_ID_WB002, parentOdrRcv, childOdrRcv);
                
                // 処理モード(更新の場合)
                if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
                    updateOdrRcv(SCREEN_ID_WB002, parentOdrRcv, childOdrRcv, lockOdrRcv);
                // 処理モード(削除の場合)
                } else if (StringUtils.equals(processType, PROCESS_TYPE_DELETE)) {
                    deleteOdrRcv(SCREEN_ID_WB002, parentOdrRcv, childOdrRcv);
                }
            }
            
            // 輸出手続品目番号原単位の品目名称更新
            updateItemDexcription(SCREEN_ID_WB002, rcvOdrCompCd, itemNo, etdDueDt, partName);
            
            // CIGMA直納受注反映用リストに設定
            wsB007ParamItemList.add(setWsB007Param(SCREEN_ID_WB002, processType, parentOdrRcv, childOdrRcv, lockOdrRcv));
        }
        
        // CIGMA直納受注反映
        if (0 < wsB007ParamItemList.size()) {
            WsB007ParamDomain wsB007Param = new WsB007ParamDomain();
            wsB007Param.setReceivingCompanyCode(rcvOdrCompCd);
            wsB007Param.setExpRcvOdrUpdateList(wsB007ParamItemList);
            
            ResultDomain wsb007Result = wsB007RestService.reflectToCusOdr(rcvOdrCompCd, wsB007Param);
            if (!WS_RESULT_SUCCESS.equals(wsb007Result.getResultCode())){
                throw new GscmApplicationException(NXS_91_0001);
            }
        }
        
        // 再検索のため、初期処理を呼び出し
        return searchOnRegisterInit(parentOdrRcv);
    }
    
    // -------------------------------- Print system method print ---------------------------------------------------------
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
    
    // --------------------------------- Hereinafter, a protected method ----------------------------------
    // --------------------------------- 以下、protected メソッド ----------------------------------
    
    /**
     * The utility method which judges whether receivingDate of the 2nd argument is settled in the range for less than six months from date of the 1st argument
     * <br />第2引数のreceivingDateが、第1引数のdateから6ヶ月以内の範囲に収まるかを判定するユーティリティメソッド
     *
     * @param date Date<br />Date
     * @param receivingDate Date<br />Date
     * @return check result (true or false)<br />check result (true or false)
     */
    protected boolean validateReceivingDateBetweenHalfYear(Date date, Date receivingDate) {
        final int MONTH_SPAN = 6;
        final int DECEMBER = 12;
        final List<Integer> monthOf30Days = Arrays.asList(4, 6, 9, 11);
        final int END_OF_MONTH_REFERENCE_DATE = 30;
        final int FEBRUARY = 2;
        final int END_OF_FEBURUARY_DATE = 28;
        
        Date compareDateFrom = date;
        
        // after 6 month
        Calendar compareDateToCal = Calendar.getInstance();
        compareDateToCal.setTime(date);
        int toYear = compareDateToCal.get(Calendar.YEAR);
        int toMonth = compareDateToCal.get(Calendar.MONTH) + 1;
        int toDay = compareDateToCal.get(Calendar.DAY_OF_MONTH);
        Date compareDateTo = null;
        
        toMonth += MONTH_SPAN;
        if (toMonth > DECEMBER) {
            toMonth -= DECEMBER;
            toYear++;
        }
        
        if (monthOf30Days.contains(toMonth)) {
            if (toDay > END_OF_MONTH_REFERENCE_DATE) {
                toDay = END_OF_MONTH_REFERENCE_DATE;
            }
        } else if (toMonth == FEBRUARY) {
            if (toDay > END_OF_FEBURUARY_DATE) {
                toDay = END_OF_FEBURUARY_DATE;
                // うるうどし判定をして、うるう年であればtoDateに1を加算する
                if ((toYear % 4 == 0 && toYear % 100 != 0) || (toYear % 400 == 0)) {
                    toDay++;
                }
            }
        }
        
        compareDateToCal.set(toYear, toMonth - 1, toDay);
        compareDateTo = compareDateToCal.getTime();
        
        if (receivingDate.compareTo(compareDateFrom) >= 0 && receivingDate.compareTo(compareDateTo) <= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Acquire the date n-month after the date of the 1st argument.
     * <br />第1引数の日付のnヵ月後の日付を取得します。
     *
     * @param date Date<br />Date
     * @param n  A specified n months after<br />nヵ月後の指定
     * @return Date of n-month after<br />nヵ月後のDate
     */
    /*
    protected Date getAnyMonthAfter(Date date, int n) {
        final int DECEMBER = 12;
        final List<Integer> monthOf30Days = Arrays.asList(4, 6, 9, 11);
        final int END_OF_MONTH_REFERENCE_DATE = 30;
        final int FEBRUARY = 2;
        final int END_OF_FEBURUARY_DATE = 28;
        
        Calendar compareDateToCal = Calendar.getInstance();
        compareDateToCal.setTime(date);
        int toYear = compareDateToCal.get(Calendar.YEAR);
        int toMonth = compareDateToCal.get(Calendar.MONTH) + 1;
        int toDay = compareDateToCal.get(Calendar.DAY_OF_MONTH);
        
        toMonth += n;
        if (toMonth > DECEMBER) {
            toMonth -= DECEMBER;
            toYear++;
        } else if (toMonth < 1) {
            toMonth += DECEMBER;
            toYear--;
        }
        
        if (monthOf30Days.contains(toMonth)) {
            if (toDay > END_OF_MONTH_REFERENCE_DATE) {
                toDay = END_OF_MONTH_REFERENCE_DATE;
            }
        } else if (toMonth == FEBRUARY) {
            if (toDay > END_OF_FEBURUARY_DATE) {
                toDay = END_OF_FEBURUARY_DATE;
                // うるうどし判定をして、うるう年であればtoDateに1を加算する
                if ((toYear % 4 == 0 && toYear % 100 != 0) || (toYear % 400 == 0)) {
                    toDay++;
                }
            }
        }
        
        compareDateToCal.set(toYear, toMonth - 1, toDay);
        return compareDateToCal.getTime();
    }
    */

    /**
     * Search cigmaAds of compCd and compare with dueDate.
     * <br />In before cigmaAds, return true, and dueDate returns false, when that is not right.
     * <br />compCdのcigmaAdsを検索し、dueDateと比較します。
     * <br />dueDateがcigmaAdsよりも前の場合はtrueを返し、そうでない場合はfalseを返します。
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param dueDate ETD DUE DATE<br />船積期限
     * @return check result (true or false)<br />check result (true or false)
     * @throws ApplicationException When an error occurs<br />エラーが発生した場合
     */
    protected boolean compareDueDate(String compCd, Date dueDate) throws ApplicationException {
        Date cigmaAds = commonService.searchCigmaAds(compCd);
        
        return dueDate.compareTo(cigmaAds) > 0;
    }

    /**
     * Search a SHIP TO NAME from a COMPANY CODE, a CUSTOMER CODE, and a LEGACY SHIP TO,
     * <br />When it does not exist, return true, and when that is not right, return false.
     * <br />会社コード、得意先コード、LEGACY送荷先から送荷先名称を検索し、
     * <br />存在しない場合はtrue、そうでない場合はfalseを返します。
     *
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain WB001OdrRcvDomain<br />送荷先名称
     * @return check result (true or false)
     * @throws ApplicationException When an error occurs<br />エラーが発生した場合
     */
    protected boolean validateExistLgcyChipTo(String lgcyLibCompCd, String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain) throws ApplicationException {
        TmNxsShipToDomain tmNxsShipToDomain = new TmNxsShipToDomain();
        TmCigmaShipToXrefCriteriaDomain cigmaCriteria = new TmCigmaShipToXrefCriteriaDomain();
        cigmaCriteria.setLgcyLibCompCd(lgcyLibCompCd);
        cigmaCriteria.setCustomerCd(customerCd);
        cigmaCriteria.setLgcyShipTo(lgcyShipTo);
        
        TmCigmaShipToXrefDomain cigmaDomain = tmCigmaShipToXrefService.searchByKey(cigmaCriteria);
        
        if (cigmaDomain != null) {
            TmNxsShipToCriteriaDomain tmNxsShipToCriteria = new TmNxsShipToCriteriaDomain();
            tmNxsShipToCriteria.setShipToCd(cigmaDomain.getShipToCd());
            tmNxsShipToDomain = tmNxsShipToService.searchByKey(tmNxsShipToCriteria);
            
            if (tmNxsShipToDomain != null) {
                if (tmpDomain != null) {
                    tmpDomain.setShipToNm(tmNxsShipToDomain.getShipToNm());
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Calculate a surplus with the 1st argument and the 2nd argument.
     * <br />When a surplus is 0, return true and false which cannot be accepted (when it can be businesslike).
     * <br />第1引数、第2引数との剰余を計算します。
     * <br />剰余が0の場合(割り切れる場合)true、割り切れないfalseを返します。
     *
     * @param qty QUANTITY<br />数量
     * @param lot Lot<br />ロット
     * @return check result (true or false)
     */
    protected boolean validateRemainder(BigDecimal qty, BigDecimal lot) {
        return (qty.remainder(lot)).compareTo(BigDecimal.ZERO) == 0;
    }

    /**
     * Acquire an ordering company name and an ITEM NO GROUP from a NEXUS Company Master.
     * <br />NEXUS会社原単位より、受注会社名、品目番号グループを取得します。
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param tmpDomain WB001OdrRcvDomain<br />送荷先名称 ※戻り値設定用ドメイン
     * @return check result (true or false)
     * @throws ApplicationException When an error occurs<br />エラーが発生した場合
     */
    protected boolean validateCompCdExist(String compCd, WB001OdrRcvDomain tmpDomain) throws ApplicationException {
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(compCd);
        
        TmNxsCompDomain domain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        
        if (domain != null) {
            // String itemNoGrp = domain.getItemNoGrp(); // 設計書上取得しているが使用箇所なし。
            tmpDomain.setCompNm(domain.getCompNm());
            tmpDomain.setItemNoGrp(domain.getItemNoGrp());
            return true;
        } else {
            return false;
        }
    }

    /**
     * Acquire an ordering company name from a NEXUS Company Master.
     * <br />NEXUS会社原単位より、受注会社名を取得する。
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @return check result (true or false)
     * @throws ApplicationException When an error occurs<br />エラーが発生した場合
     */
    protected boolean validateCompCdExist(String compCd) throws ApplicationException{
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(compCd);
        
        TmNxsCompDomain domain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        
        if (domain != null) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Compute the search range.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param wB001OdrRcvCriteriaDomain The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, WB001OdrRcvCriteriaDomain wB001OdrRcvCriteriaDomain) 
        throws ApplicationException {
        
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, wB001OdrRcvCriteriaDomain.getLocale());
        
        // 検索条件ドメインに開始・終了位置を設定
        wB001OdrRcvCriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        wB001OdrRcvCriteriaDomain.setRowNumTo(pageInfoData.getToCount());
    }
    
    /**
     * When this is zero affair at the time of authority acquisition, create the domain added to an authorization list.
     * <br />権限取得時に0件だった場合に権限リストに追加するドメインを作成します。
     * 
     * @return userAuthDomain(authority:blank, ownerCompCd:blank, procMfgDivCd:blank, permitFuncId:blank)
     */
    /*
    protected UserAuthDomain getBlankAuthDomain() {
        UserAuthDomain userAuthDomain = new UserAuthDomain();

        userAuthDomain.setAuthority("");
        userAuthDomain.setOwnerCompCd("");
        userAuthDomain.setProcMfgDivCd("");
        userAuthDomain.setPermitFuncId("");
        
        return userAuthDomain;
    }
    */
    
    /**
     * Export-Receive-Order existence check
     * <br />輸出受注存在チェック
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @return This is false, when an Export Receive Order exists and this is except true.<br />輸出受注が存在する場合true、以外の場合false
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    protected boolean existsOdrRcv(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, parent);
        criteria.setItemNo(child.getItemNo());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNo());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        
        // 輸出受注検索
        TtExpRcvOdrDomain expRcvOdr = ttExpRcvOdrService.searchByKey(criteria);
        
        // 存在チェック
        if (expRcvOdr == null) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Export-Receive-Order lock
     * <br />輸出受注ロック
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @return The locked Export Receive Order<br />ロックした輸出受注
     * @throws ApplicationException When function ID besides a target is specified as an argument and an Export Receive Order cannot be referred to
     *                              <br />対象外の機能IDが引数に指定された場合、輸出受注が参照できない場合
     */
    protected TtExpRcvOdrDomain lockOdrRcv(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        if (SCREEN_ID_WB002.equals(funcId)){
            return lockOdrRcvByWb002(parent, child);
        } else if (SCREEN_ID_WB003.equals(funcId)){
            return lockOdrRcvByWb003(parent, child);
        } else {
            // if (SCREEN_ID_WB007.equals(funcId))
            return lockOdrRcvByWb007(parent, child);
        }
    }
    
    /**
     * Export-Receive-Order lock (for WB002)
     * <br />輸出受注ロック（WB002用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @return The locked Export Receive Order<br />ロックした輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    protected TtExpRcvOdrDomain lockOdrRcvByWb002(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(parent.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        
        // 輸出受注ロック
        return ttExpRcvOdrService.lockByKeyNoWait(criteria);
    }
    
    /**
     * Export-Receive-Order lock (for WB003)
     * <br />輸出受注ロック（WB003用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @return The locked Export Receive Order<br />ロックした輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    protected TtExpRcvOdrDomain lockOdrRcvByWb003(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定    
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(parent.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(parent.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        
        // 輸出受注ロック
        return ttExpRcvOdrService.lockByKeyNoWait(criteria);
    }
    
    /**
     * Export-Receive-Order lock (for WB007)
     * <br />輸出受注ロック（WB007用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @return The locked Export Receive Order<br />ロックした輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    protected TtExpRcvOdrDomain lockOdrRcvByWb007(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, parent);
        criteria.setItemNo(child.getItemNo());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNo());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        
        // 輸出受注ロック
        return ttExpRcvOdrService.lockByKeyNoWait(criteria);
    }
    
    /**
     * Export-Receive-Order insertion
     * <br />輸出受注挿入
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When function ID besides a target is specified as an argument and an Export Receive Order cannot be inserted
     *                              <br />対象外の機能IDが引数に指定された場合、輸出受注を挿入できない場合
     */
    protected void insertOdrRcv(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        if (SCREEN_ID_WB002.equals(funcId)){
            insertOdrRcvByWb002(funcId, parent, child);
        } else if (SCREEN_ID_WB003.equals(funcId)){
            insertOdrRcvByWb003(funcId, parent, child);
        } else if (SCREEN_ID_WB007.equals(funcId)){
            insertOdrRcvByWb007(funcId, parent, child);
        }
    }
    
    /**
     * Export-Receive-Order insertion (for WB002)
     * <br />輸出受注挿入（WB002用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be inserted<br />輸出受注を挿入できない場合
     */
    protected void insertOdrRcvByWb002(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // Domainの設定
        TtExpRcvOdrDomain createDomain = new TtExpRcvOdrDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(createDomain, parent);
        createDomain.setEtdDueDt(child.getEtdDueDt());
        createDomain.setCustomerPoNo(child.getCustomerPoNo());
        createDomain.setCustomerItemNo(child.getCustomerItemNo());
        createDomain.setCustomerItemNoOrg(child.getCustomerItemNo());
        createDomain.setOdrCtrlNo(new BigDecimal(0));
        createDomain.setRevisionNo(new BigDecimal(0));
        createDomain.setRevisionNoEis(new BigDecimal(0));
        createDomain.setCustomerDueDt(child.getCustomerDueDt());
        createDomain.setItemNoOrg(parent.getItemNo());
        createDomain.setOdrQtyOrg(child.getOdrQty());
        createDomain.setOdrQty(child.getOdrQty());
        createDomain.setPltzAllocQty(new BigDecimal(0));
        createDomain.setShippedQty(new BigDecimal(0));
        createDomain.setShippingDt(child.getShippingDt());
        createDomain.setPartialDelivCnt(new BigDecimal(0));
        createDomain.setOdrFirmFlg(child.getOdrFirmFlg());
        createDomain.setSalesCompPoNo(child.getSalesCompPoNo());
        createDomain.setLastFigureChgFlg(FLAG_N);
        createDomain.setSupplierCd(parent.getSupplierCd());
        createDomain.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        commonService.setCommonPropertyForRegist(createDomain, funcId);
        
        // 輸出受注登録
        ttExpRcvOdrService.create(createDomain);
    }
    
    /**
     * Export-Receive-Order insertion (for WB003)
     * <br />輸出受注挿入（WB003用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be inserted<br />輸出受注を挿入できない場合
     */
    protected void insertOdrRcvByWb003(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // Domainの設定
        TtExpRcvOdrDomain odrRcv = new TtExpRcvOdrDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(odrRcv, parent);
        odrRcv.setCustomerPoNo(child.getCustomerPoNo());
        odrRcv.setCustomerItemNo(child.getCustomerItemNo());
        odrRcv.setCustomerItemNoOrg(child.getCustomerItemNo());
        odrRcv.setOdrCtrlNo(new BigDecimal(0));
        odrRcv.setRevisionNo(new BigDecimal(0));
        odrRcv.setRevisionNoEis(new BigDecimal(0));
        odrRcv.setCustomerDueDt(child.getCustomerDueDt());
        odrRcv.setItemNoOrg(parent.getItemNo());
        odrRcv.setOdrQtyOrg(child.getOdrQty());
        odrRcv.setOdrQty(child.getOdrQty());
        odrRcv.setPltzAllocQty(new BigDecimal(0));
        odrRcv.setShippedQty(new BigDecimal(0));
        odrRcv.setShippingDt(child.getShippingDt());
        odrRcv.setPartialDelivCnt(new BigDecimal(0));
        odrRcv.setOdrFirmFlg(child.getOdrFirmFlg());
        odrRcv.setSalesCompPoNo(child.getSalesCompPoNo());
        odrRcv.setLastFigureChgFlg(FLAG_N);
        odrRcv.setSupplierCd(parent.getSupplierCd());
        odrRcv.setPlntCd(parent.getPlntCd());
        odrRcv.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        commonService.setCommonPropertyForRegist(odrRcv, funcId);
        
        // 輸出受注登録
        ttExpRcvOdrService.create(odrRcv);
    }
    
    /**
     * Export-Receive-Order insertion (for WB007)
     * <br />輸出受注挿入（WB007用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be inserted<br />輸出受注を挿入できない場合
     */
    protected void insertOdrRcvByWb007(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // Domainの設定
        TtExpRcvOdrDomain expRcvOdr = new TtExpRcvOdrDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(expRcvOdr, parent);
        expRcvOdr.setItemNo(child.getItemNo());
        expRcvOdr.setEtdDueDt(child.getEtdDueDt());
        expRcvOdr.setCustomerItemNo(child.getCustomerItemNo());
        expRcvOdr.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        expRcvOdr.setOdrCtrlNo(child.getOdrCtrlNo());
        expRcvOdr.setRevisionNo(child.getRevisionNo());
        expRcvOdr.setRevisionNoEis(child.getRevisionNoEis());
        expRcvOdr.setCustomerDueDt(child.getCustomerDueDt());
        expRcvOdr.setOdrQty(child.getOdrQty());
        expRcvOdr.setOdrQtyOrg(child.getOdrQty());
        expRcvOdr.setPltzAllocQty(new BigDecimal(0));
        expRcvOdr.setShippedQty(new BigDecimal(0));
        expRcvOdr.setPartialDelivCnt(new BigDecimal(0));
        expRcvOdr.setOdrFirmFlg(FLAG_Y);
        expRcvOdr.setSalesCompPoNo(child.getSalesCompPoNo());
        expRcvOdr.setLastFigureChgFlg(FLAG_Y);
        expRcvOdr.setSupplierCd(child.getSupplierCd());
        expRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        expRcvOdr.setPlntCd(child.getPlntCd());
        commonService.setCommonPropertyForRegist(expRcvOdr, funcId);
        
        // 輸出受注登録
        ttExpRcvOdrService.create(expRcvOdr);
    }
    
    /**
     * Export Receive Order Update
     * <br />輸出受注更新
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @throws ApplicationException When function ID besides a target is specified as an argument and an Export Receive Order cannot be updated
     *                              <br />対象外の機能IDが引数に指定された場合、輸出受注を更新できない場合
     */
    protected void updateOdrRcv(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv)
        throws ApplicationException{
        
        if (SCREEN_ID_WB002.equals(funcId)){
            updateOdrRcvByWb002(funcId, parent, child, lockOdrRcv);
        } else if (SCREEN_ID_WB003.equals(funcId)){
            updateOdrRcvByWb003(funcId, parent, child, lockOdrRcv);
        } else if (SCREEN_ID_WB007.equals(funcId)){
            updateOdrRcvByWb007(funcId, parent, child, lockOdrRcv);
        }
    }
    
    /**
     * Export Receive Order Update (for WB002)
     * <br />輸出受注更新（WB002用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be updated<br />輸出受注を更新できない場合
     */
    protected void updateOdrRcvByWb002(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv)
        throws ApplicationException{
        
        // 項目取得
        BigDecimal lockOdrRcvPltzAllocQty = lockOdrRcv.getPltzAllocQty();
        BigDecimal lockOdrRcvShippedQty = lockOdrRcv.getShippedQty();
        BigDecimal odrQty = child.getOdrQty();
        
        // Domainの設定
        TtExpRcvOdrDomain expRcvOdr = new TtExpRcvOdrDomain();
        
        expRcvOdr.setCustomerPoNo(child.getCustomerPoNo());
        expRcvOdr.setCustomerItemNo(child.getCustomerItemNo());
        expRcvOdr.setCustomerItemNoOrg(child.getCustomerItemNo());
        expRcvOdr.setCustomerDueDt(child.getCustomerDueDt());
        expRcvOdr.setOdrQty(odrQty);
        if (lockOdrRcvPltzAllocQty.equals(BigDecimal.ZERO) && lockOdrRcvShippedQty.equals(BigDecimal.ZERO)) {
            expRcvOdr.setShippingDt(child.getShippingDt());
        }
        expRcvOdr.setOdrFirmFlg(child.getOdrFirmFlg());
        expRcvOdr.setSalesCompPoNo(child.getSalesCompPoNo());
        
        if (lockOdrRcvShippedQty.compareTo(odrQty) == 0){
            expRcvOdr.setShippedTyp(SHIPPED_TYP_SHIPPED);
        } else if (lockOdrRcvPltzAllocQty.compareTo(odrQty) == 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
        } else if (lockOdrRcvPltzAllocQty.compareTo(odrQty) < 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        }
        commonService.setCommonPropertyForUpdate(expRcvOdr, funcId);
        
        // Key項目の設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(child.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注更新
        ttExpRcvOdrService.updateByCondition(expRcvOdr, criteria);
    }
    
    /**
     * Export Receive Order Update (for WB003)
     * <br />輸出受注更新（WB003用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be updated<br />輸出受注を更新できない場合
     */
    protected void updateOdrRcvByWb003(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv)
        throws ApplicationException{
        
        // 項目取得
        BigDecimal lockOdrRcvPltzAllocQty = lockOdrRcv.getPltzAllocQty();
        BigDecimal lockOdrRcvShippedQty = lockOdrRcv.getShippedQty();
        BigDecimal odrQty = child.getOdrQty();
        
        // Domainの設定
        TtExpRcvOdrDomain expRcvOdr = new TtExpRcvOdrDomain();
        
        expRcvOdr.setCustomerPoNo(child.getCustomerPoNo());
        expRcvOdr.setCustomerItemNo(child.getCustomerItemNo());
        expRcvOdr.setCustomerItemNoOrg(child.getCustomerItemNo());
        expRcvOdr.setCustomerDueDt(child.getCustomerDueDt());
        expRcvOdr.setOdrQty(odrQty);
        if (lockOdrRcvPltzAllocQty.equals(BigDecimal.ZERO) && lockOdrRcvShippedQty.equals(BigDecimal.ZERO)) {
            expRcvOdr.setShippingDt(child.getShippingDt());
        }
        expRcvOdr.setOdrFirmFlg(child.getOdrFirmFlg());
        expRcvOdr.setSalesCompPoNo(child.getSalesCompPoNo());
        
        if (lockOdrRcvShippedQty.compareTo(odrQty) == 0){
            expRcvOdr.setShippedTyp(SHIPPED_TYP_SHIPPED);
        } else if (lockOdrRcvPltzAllocQty.compareTo(odrQty) == 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
        } else if (lockOdrRcvPltzAllocQty.compareTo(odrQty) < 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        }
        commonService.setCommonPropertyForUpdate(expRcvOdr, funcId);
        
        // Key項目の設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(parent.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(parent.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注更新
        ttExpRcvOdrService.updateByCondition(expRcvOdr, criteria);
    }

    /**
     * Export Receive Order Update (for WB007)
     * <br />輸出受注更新（WB007用）
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @throws ApplicationException When an Export Receive Order cannot be updated<br />輸出受注を更新できない場合
     */
    protected void updateOdrRcvByWb007(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv)
        throws ApplicationException{
        
        // 項目取得
        BigDecimal odrQty = child.getOdrQty();
        BigDecimal pltzAllocQty = lockOdrRcv.getPltzAllocQty();
        BigDecimal ShippedQty = lockOdrRcv.getShippedQty();
        
        // Domainの設定
        TtExpRcvOdrDomain expRcvOdr = new TtExpRcvOdrDomain();
        
        expRcvOdr.setCustomerItemNo(child.getCustomerItemNo());
        expRcvOdr.setOdrQty(child.getOdrQty());
        expRcvOdr.setLastFigureChgFlg(FLAG_Y);
        
        if (ShippedQty.compareTo(odrQty) == 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_SHIPPED);
        } else if (pltzAllocQty.compareTo(odrQty) == 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_PACKED);
        } else if (pltzAllocQty.compareTo(odrQty) < 0) {
            expRcvOdr.setShippedTyp(SHIPPED_TYP_ORDER_CREATED);
        }
        commonService.setCommonPropertyForUpdate(expRcvOdr, funcId);
        
        // Key項目の設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(child.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNo());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注更新
        ttExpRcvOdrService.updateByCondition(expRcvOdr, criteria);
    }
    
    /**
     * Export-Receive-Order delete
     * <br />輸出受注削除
     *
     * @param funcId Function ID<br />機能ID
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When function ID besides a target is specified as an argument and an Export Receive Order cannot be deleted
     *                              <br />対象外の機能IDが引数に指定された場合、輸出受注を削除できない場合
     */
    protected void deleteOdrRcv(String funcId, WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        if (SCREEN_ID_WB002.equals(funcId)){
            deleteOdrRcvByWb002(parent, child);
        } else if (SCREEN_ID_WB003.equals(funcId)){
            deleteOdrRcvByWb003(parent, child);
        } else if (SCREEN_ID_WB007.equals(funcId)){
            deleteOdrRcvByWb007(parent, child);
        }
    }
    
    /**
     * Export-Receive-Order delete (for WB002)
     * <br />輸出受注削除（WB002用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be deleted<br />輸出受注を削除できない場合
     */
    protected void deleteOdrRcvByWb002(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(parent.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注削除
        ttExpRcvOdrService.delete(criteria);
    }
    
    /**
     * Export-Receive-Order delete (for WB003)
     * <br />輸出受注削除（WB003用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be deleted<br />輸出受注を削除できない場合
     */
    protected void deleteOdrRcvByWb003(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        criteria.setRcvOdrCompCd(parent.getRcvOdrCompCd());
        criteria.setCustomerCd(parent.getCustomerCd());
        criteria.setLgcyShipTo(parent.getLgcyShipTo());
        criteria.setItemNo(parent.getItemNo());
        criteria.setPkgCd(parent.getPkgCd());
        criteria.setTrnsCd(parent.getTrnsCd());
        criteria.setEtdDueDt(parent.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNoHidden());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注削除
        ttExpRcvOdrService.delete(criteria);
    }
    
    /**
     * Export-Receive-Order delete (for WB007)
     * <br />輸出受注削除（WB007用）
     *
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be deleted<br />輸出受注を削除できない場合
     */
    protected void deleteOdrRcvByWb007(WB001OdrRcvDomain parent, WB001OdrRcvDomain child) throws ApplicationException{
        // CriteriaDomainの設定
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, parent);
        criteria.setItemNo(child.getItemNo());
        criteria.setEtdDueDt(child.getEtdDueDt());
        criteria.setCustomerPoNo(child.getCustomerPoNo());
        criteria.setCustomerItemNo(child.getCustomerItemNoHidden());
        criteria.setCustomerItemNoOrg(child.getCustomerItemNoOrg());
        criteria.setOdrCtrlNo(child.getOdrCtrlNo());
        criteria.setComUpdateTimestamp(child.getUpdateTimestamp());
        
        // 輸出受注削除
        ttExpRcvOdrService.delete(criteria);
    }
    
    /**
     * The update of an ITEM DESCRIPTION of an export procedure ITEM NO
     * <br />輸出手続品目番号の品目名称更新
     *
     * @param funcId Function ID<br />機能ID
     * @param rcvOdrCompCd RECEIVE ORDER COMPANY CODE<br />受注会社コード
     * @param itemNo ITEM NO<br />品目番号
     * @param etdDueDt ETD DUE DATE<br />船積期限
     * @param afterItemDescription Front [ update ] ITEM DESCRIPTION<br />更新前品目名称
     * @throws ApplicationException When an export procedure ITEM NO cannot be referred to<br />輸出手続品目番号を参照できない場合
     */
    protected void updateItemDexcription(String funcId, String rcvOdrCompCd, String itemNo, Date etdDueDt, String afterItemDescription)
        throws ApplicationException{
        if (!StringUtils.isEmpty(afterItemDescription)){
            // 輸出手続品目番号原単位の適用開始日取得
            TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteria = new TmExpFormalitiItemNoCriteriaDomain();

            tmExpFormalitiItemNoCriteria.setCompCd(rcvOdrCompCd);
            tmExpFormalitiItemNoCriteria.setItemNo(itemNo);
            tmExpFormalitiItemNoCriteria.setAplyStrtDtLessThanEqual(etdDueDt);
            tmExpFormalitiItemNoCriteria.setRowNumFrom(1);
            tmExpFormalitiItemNoCriteria.setRowNumTo(1);
            tmExpFormalitiItemNoCriteria.setPreferredOrder("APLY_STRT_DT desc");

            List<TmExpFormalitiItemNoDomain> tmExpFormalitiItemNoList = tmExpFormalitiItemNoService.searchByConditionForPaging(tmExpFormalitiItemNoCriteria);

            if (tmExpFormalitiItemNoList != null && tmExpFormalitiItemNoList.size() > 0) {
                // 適用開始日
                Date aplyStrtDt = tmExpFormalitiItemNoList.get(0).getAplyStrtDt();

                // 輸出手続品目番号原単位のロック
                tmExpFormalitiItemNoCriteria =  new TmExpFormalitiItemNoCriteriaDomain();
                tmExpFormalitiItemNoCriteria.setCompCd(rcvOdrCompCd);
                tmExpFormalitiItemNoCriteria.setItemNo(itemNo);
                tmExpFormalitiItemNoCriteria.setAplyStrtDt(aplyStrtDt);

                TmExpFormalitiItemNoDomain tmExpFormalitiItemNo = tmExpFormalitiItemNoService.lockByKeyNoWait(tmExpFormalitiItemNoCriteria);

                if (tmExpFormalitiItemNo != null) {
                    // 更新用品目名称
                    String beforeItemDescription = tmExpFormalitiItemNo.getItemDescription();

                    // 輸出手続品目番号原単位の更新(上記の結果と、引数の品目名称が異なる場合のみ)
                    if (!StringUtils.equals(afterItemDescription, beforeItemDescription)) {
                        tmExpFormalitiItemNo = new TmExpFormalitiItemNoDomain();
                        tmExpFormalitiItemNo.setItemDescription(afterItemDescription);
                        commonService.setCommonPropertyForUpdate(tmExpFormalitiItemNo, funcId);

                        tmExpFormalitiItemNoService.updateByCondition(tmExpFormalitiItemNo, tmExpFormalitiItemNoCriteria);
                    }
                }
            }
        }
    }
    
    /**
     * Set a VALUE to the parameter domain of WsB007.
     * <br />WsB007のパラメータドメインに値を設定します。
     *
     * @param funcId Function ID<br />機能ID
     * @param processType Processing mode<br />処理モード
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @return The parameter domain of WsB007<br />WsB007のパラメータドメイン
     */
    protected WsB007ParamItemDomain setWsB007Param(String funcId, String processType, 
        WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv) {
        
        if (SCREEN_ID_WB002.equals(funcId)) {
            return setWsB007ParamByWb002(processType, parent, child, lockOdrRcv);
        } else if (SCREEN_ID_WB003.equals(funcId)){
            return setWsB007ParamByWb003(processType, parent, child, lockOdrRcv);
        } else {
            // if (SCREEN_ID_WB007.equals(funcId)) 
            return setWsB007ParamByWb007(processType, parent, child, lockOdrRcv);
        }
    }
    
    /**
     * Set a VALUE to the parameter domain of WsB007.(For WB002)
     * <br />WsB007のパラメータドメインに値を設定します。(WB002用)
     *
     * @param processType Processing mode<br />処理モード
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @return The parameter domain of WsB007<br />WsB007のパラメータドメイン
     */
    protected WsB007ParamItemDomain setWsB007ParamByWb002(String processType, 
        WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv) {
        
        WsB007ParamItemDomain wsB007ParamItem  = new WsB007ParamItemDomain();
        
        if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
            // 登録処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty("0");
            wsB007ParamItem.setShippedQty("0");
            wsB007ParamItem.setNumberOfShipInstr("0");
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate("");
            wsB007ParamItem.setOldOrderQty("");
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo("");
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo("");
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode(StringUtil.getEmptyToBlank(parent.getTrnsCd()));
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(StringUtil.getEmptyToBlank(child.getOdrFirmFlg()));
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
            
        } else if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
            // 更新処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty(convertNullToBlank(child.getPltzAllocQtyHidden()));
            wsB007ParamItem.setShippedQty(convertNullToBlank(child.getShippedQty()));
            wsB007ParamItem.setNumberOfShipInstr(convertNullToBlank(child.getPartialDelivCnt()));
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNoHidden()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(StringUtil.getEmptyToBlank(child.getOdrFirmFlg()));
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
            
        } else {
            // 削除処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty(convertNullToBlank(child.getPltzAllocQtyHidden()));
            wsB007ParamItem.setShippedQty(convertNullToBlank(child.getShippedQty()));
            wsB007ParamItem.setNumberOfShipInstr(convertNullToBlank(child.getPartialDelivCnt()));
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo("");
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNoHidden()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate("");
            wsB007ParamItem.setNewOrderQty("");
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo("");
            wsB007ParamItem.setNewOrderFirmFlag("");
            wsB007ParamItem.setNewCustomerPartNo("");
        }

        return wsB007ParamItem;
    }
    
    /**
     * Set a VALUE to the parameter domain of WsB007.(For WB003)
     * <br />WsB007のパラメータドメインに値を設定します。(WB003用)
     *
     * @param processType Processing mode<br />処理モード
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @return The parameter domain of WsB007<br />WsB007のパラメータドメイン
     */
    protected WsB007ParamItemDomain setWsB007ParamByWb003(String processType, 
        WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv) {
        
        WsB007ParamItemDomain wsB007ParamItem  = new WsB007ParamItemDomain();
        
        if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
            // 登録処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty("0");
            wsB007ParamItem.setShippedQty("0");
            wsB007ParamItem.setNumberOfShipInstr("0");
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate("");
            wsB007ParamItem.setOldOrderQty("");
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo("");
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo("");
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(parent.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode(StringUtil.getEmptyToBlank(parent.getTrnsCd()));
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(StringUtil.getEmptyToBlank(child.getOdrFirmFlg()));
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
            
        } else if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
            // 更新処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty(convertNullToBlank(child.getPltzAllocQtyHidden()));
            wsB007ParamItem.setShippedQty(convertNullToBlank(child.getShippedQty()));
            wsB007ParamItem.setNumberOfShipInstr(convertNullToBlank(child.getPartialDelivCnt()));
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(parent.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNoHidden()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(parent.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(StringUtil.getEmptyToBlank(child.getOdrFirmFlg()));
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
            
        } else {
            // 削除処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(parent.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(child.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty(convertNullToBlank(child.getPltzAllocQtyHidden()));
            wsB007ParamItem.setShippedQty(convertNullToBlank(child.getShippedQty()));
            wsB007ParamItem.setNumberOfShipInstr(convertNullToBlank(child.getPartialDelivCnt()));
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo("");
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(parent.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNoHidden()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate("");
            wsB007ParamItem.setNewOrderQty("");
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo("");
            wsB007ParamItem.setNewOrderFirmFlag("");
            wsB007ParamItem.setNewCustomerPartNo("");
        }
        
        return wsB007ParamItem;
    }
    
    /**
     * Set a VALUE to the parameter domain of WsB007.(For WB007)
     * <br />WsB007のパラメータドメインに値を設定します。(WB007用)
     *
     * @param processType Processing mode<br />処理モード
     * @param parent RcvOdr parent domain<br />RcvOdr親ドメイン
     * @param child RcvOdr sub domain<br />RcvOdr子ドメイン
     * @param lockOdrRcv The locked Export Receive Order<br />ロックしている輸出受注
     * @return The parameter domain of WsB007<br />WsB007のパラメータドメイン
     */
    protected WsB007ParamItemDomain setWsB007ParamByWb007(String processType, 
        WB001OdrRcvDomain parent, WB001OdrRcvDomain child, TtExpRcvOdrDomain lockOdrRcv) {
        
        WsB007ParamItemDomain wsB007ParamItem  = new WsB007ParamItemDomain();
        
        if (StringUtils.equals(processType, PROCESS_TYPE_REGISTER)) {
            // 登録処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(child.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(parent.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty("0");
            wsB007ParamItem.setShippedQty("0");
            wsB007ParamItem.setNumberOfShipInstr("0");
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate("");
            wsB007ParamItem.setOldOrderQty("");
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo("");
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo("");
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode(StringUtil.getEmptyToBlank(parent.getTrnsCd()));
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(FLAG_Y);
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
        } else if (StringUtils.equals(processType, PROCESS_TYPE_UPDATE)) {
            // 更新処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(child.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(parent.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty("");
            wsB007ParamItem.setShippedQty("");
            wsB007ParamItem.setNumberOfShipInstr("");
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(lockOdrRcv.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo(StringUtil.getEmptyToBlank(child.getSalesCompPoNo()));
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setNewOrderQty(convertNullToBlank(child.getOdrQty()));
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setNewOrderFirmFlag(FLAG_Y);
            wsB007ParamItem.setNewCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNo()));
        } else {
            // 削除処理の場合
            wsB007ParamItem.setCustomerSubsidiaryCode("");
            wsB007ParamItem.setTransmissionDate("");
            wsB007ParamItem.setOrderType("");
            wsB007ParamItem.setSerialNo("");
            wsB007ParamItem.setCustomerNoLegacy(StringUtil.getEmptyToBlank(parent.getCustomerCd()));
            wsB007ParamItem.setShiptoNoLegacy(StringUtil.getEmptyToBlank(parent.getLgcyShipTo()));
            wsB007ParamItem.setPartNo(StringUtil.getEmptyToBlank(child.getItemNo()));
            wsB007ParamItem.setPkgCode(StringUtil.getEmptyToBlank(parent.getPkgCd()));
            wsB007ParamItem.setShippingDueDate(convertNullToBlank(parent.getShippingDt()));
            wsB007ParamItem.setShipInstrAllocQty("");
            wsB007ParamItem.setShippedQty("");
            wsB007ParamItem.setNumberOfShipInstr("");
            wsB007ParamItem.setOrderQtyOrg(convertNullToBlank(lockOdrRcv.getOdrQtyOrg()));
            wsB007ParamItem.setSalesCompanyPoNo("");
            wsB007ParamItem.setUpdateType(processType);
            wsB007ParamItem.setOldCustomerDueDate("");
            wsB007ParamItem.setOldEtdDueDate(convertNullToBlank(child.getEtdDueDt()));
            wsB007ParamItem.setOldOrderQty(convertNullToBlank(child.getOdrQtyHidden()));
            wsB007ParamItem.setOldTransportationCode("");
            wsB007ParamItem.setOldCustomerPoNo(StringUtil.getEmptyToBlank(child.getCustomerPoNo()));
            wsB007ParamItem.setOldOrderFirmFlag("");
            wsB007ParamItem.setOldCustomerPartNo(StringUtil.getEmptyToBlank(child.getCustomerItemNoHidden()));
            wsB007ParamItem.setNewCustomerDueDate("");
            wsB007ParamItem.setNewEtdDueDate("");
            wsB007ParamItem.setNewOrderQty("");
            wsB007ParamItem.setNewTransportationCode("");
            wsB007ParamItem.setNewCustomerPoNo("");
            wsB007ParamItem.setNewOrderFirmFlag("");
            wsB007ParamItem.setNewCustomerPartNo("");
        }
        return wsB007ParamItem;
    }
    
    /**
     * Compute a moon separate shipment ORDER QUANTITY.
     * <br />月別送注文数量を算出します。
     *
     * @param odrRcv Export-Receive-Order domain<br />輸出受注ドメイン
     */
    protected void setTotalQtyOfMonthly(WB001OdrRcvDomain odrRcv){
        List<String> monthNmList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar", "Apr", "May", "Jun");
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        
        // 輸出受注（親）ドメインの取得
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 輸出受注（子）ドメインリストの取得
        List<? extends WB001OdrRcvDomain> odrRcvList = parentOdrRcv.getOdrRcvDomainList();
        
        // 開始月の算出
        Date startDate = parentOdrRcv.getDateList().get(0);
        int startMonth = Integer.parseInt(sdf.format(startDate));
        
        // 月リスト作成
        List<String> monthList = new ArrayList<String>();
        for (int i = startMonth - 1; i < (startMonth - 1) + 6; i++) {
            String monthName = monthNmList.get(i);
            monthList.add(monthName);
        }
        
        // 月別総注文数量リスト作成
        List<BigDecimal> totalQtyList = Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
        for (Iterator<? extends WB001OdrRcvDomain> i = odrRcvList.iterator(); i.hasNext();) {
            WB001OdrRcvDomain childOdrRcv = i.next();
            
            // 子ドメインの月を取得
            int month = Integer.parseInt(sdf.format(childOdrRcv.getEtdDueDt()));
            
            // 月別の累積数量を取得
            BigDecimal totalQty = totalQtyList.get((month + 12 - startMonth) % 12);
            
            // 月別累積数量に現在の子ドメインの数量を加算
            if (childOdrRcv.getOdrQty() != null) {
                totalQty = totalQty.add(childOdrRcv.getOdrQty());
            }
            
            totalQtyList.set((month + 12 - startMonth) % 12, totalQty);
        }
        
        // 親ドメインに設定
        parentOdrRcv.setMonth(monthList);
        parentOdrRcv.setTotalQty(totalQtyList);
    }
    
    /**
     * Merge an operating-days information and an Export-Receive-Order information.
     * <br />稼働日情報と輸出受注情報をマージします。
     *
     * @param odrRcv Export-Receive-Order domain<br />輸出受注ドメイン
     */
    protected void mergeWorkDayAndOdrRcvList(WB001OdrRcvDomain odrRcv){
        // 輸出受注（親）ドメインの取得
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // 輸出受注（子）ドメインリストの取得
        List<? extends WB001OdrRcvDomain> childOdrRcvList = parentOdrRcv.getOdrRcvDomainList();
        
        // 輸出受注（子）ドメインリストをマップに変換
        Map<Date, WB001OdrRcvDomain> childOdrRcvMap = convertListToMap(childOdrRcvList);
        
        // 稼働日情報と輸出受注情報のマージ後の輸出受注（子）ドメインリスト
        List<WB001OdrRcvDomain> resultOdrRcvList = new ArrayList<WB001OdrRcvDomain>();
        
        // 日付リスト、稼働日フラグリスト、CUSTOMER PART NO.リストの取得
        List<Date> dateList = parentOdrRcv.getDateList();
        List<String> workDayFlagList = parentOdrRcv.getWorkDayFlgList();
        List<String> customerPartsNoList = parentOdrRcv.getCustomerPartNoList();
        
        // 稼働日情報と輸出受注情報のマージ 
        for (int i = 0; i < dateList.size(); i++) {
            // 日付、稼働日フラグ、CUSTOMER PART NO.の取得
            Date etdDueDate = dateList.get(i);
            String workDayFlg = workDayFlagList.get(i);
            String customerPartsNo = customerPartsNoList.get(i);
            
            // 稼働日情報と輸出受注情報マージ後の輸出受注（子）ドメイン
            WB001OdrRcvDomain resultChildOdrRcv = new WB001OdrRcvDomain();
            
            // マージ
            if (childOdrRcvMap.containsKey(etdDueDate)) {
                // 輸出受注が存在する場合、稼働日フラグのみ設定
                CommonUtil.copyPropertiesDomainToDomain(resultChildOdrRcv, childOdrRcvMap.get(etdDueDate));
                resultChildOdrRcv.setWorkDayFlg(workDayFlg);
                
            } else {
                // 輸出受注が存在しない場合
                resultChildOdrRcv.setEtdDueDt(etdDueDate);
                resultChildOdrRcv.setWorkDayFlg(workDayFlg);
                resultChildOdrRcv.setCustomerItemNo(customerPartsNo);
                resultChildOdrRcv.setCustomerPoNo(parentOdrRcv.getCustomerPoNo());
            }
            
            resultOdrRcvList.add(resultChildOdrRcv);
        }
        
        // 輸出受注（親）ドメインにマージ後の輸出受注（子）ドメインを設定
        parentOdrRcv.setOdrRcvDomainList(resultOdrRcvList);
    }
    
    /**
     * Change List of an argument into Map.
     * <br />引数のListをMapに変換します。
     *
     * @param odrRcvList The list of Export-Receive-Order domains<br />輸出受注ドメインのリスト
     * @return The map of an Export-Receive-Order domain<br />輸出受注ドメインのマップ
     */
    protected Map<Date, WB001OdrRcvDomain> convertListToMap(List<? extends WB001OdrRcvDomain> odrRcvList){
        // Mapの宣言
        Map<Date, WB001OdrRcvDomain> resultMap = new LinkedHashMap<Date, WB001OdrRcvDomain>();
        
        // ListからMapに変換
        for(Iterator<? extends WB001OdrRcvDomain> i = odrRcvList.iterator(); i.hasNext();){
            WB001OdrRcvDomain odrRcv = (WB001OdrRcvDomain)i.next();
            resultMap.put(odrRcv.getEtdDueDt() , odrRcv);
        }
        return resultMap;
    }
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when an unofficial announcement order received exists by definite QUANTITY >0 in addition to an object record).
     * <br />確定・内示数チェック(確定数量>0で対象レコード以外に内示受注が存在する場合エラー)を行います。
     *
     * @param firmQty Firm QTY<br />Firm QTY
     * @param after Export-Receive-Order search-condition domain  ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain  ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when Firm QTY is 0.
     *         <br />If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />Firm QTYが0の場合、true
     *         <br />上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    protected boolean validateDatabaseTtExpRcvOdrByFirmQty(BigDecimal firmQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before) 
        throws ApplicationException {
        
        if (BigDecimal.ZERO.equals(firmQty)) {
            return true;
        }
        
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        
        ttExpRcvOdrCriteria.setRcvOdrCompCd(after.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(after.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(after.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(after.getItemNo());
        ttExpRcvOdrCriteria.setPkgCd(after.getPkgCd());
        if (after.getPkgCd().compareTo("") == 0) {
            ttExpRcvOdrCriteria.setPkgCd(" ");
        } else {
            ttExpRcvOdrCriteria.setPkgCd(after.getPkgCd());
        }
        ttExpRcvOdrCriteria.setEtdDueDt(after.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(after.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(after.getCustomerItemNo());
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_N);
        
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
        
        if (StringUtils.isEmpty(before.getCustomerItemNo())) {
            if (ttExpRcvOdrList == null || ttExpRcvOdrList.isEmpty() || ttExpRcvOdrList.size() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (ttExpRcvOdrList != null && !ttExpRcvOdrList.isEmpty()){
                for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){
                    if (!(StringUtils.equals(before.getTrnsCd(), ttExpRcvOdr.getTrnsCd()))) {
                        return false;
                    }
                    if ((before.getEtdDueDt()).compareTo(ttExpRcvOdr.getEtdDueDt()) != 0){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerPoNo(), ttExpRcvOdr.getCustomerPoNo()))){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerItemNo(), ttExpRcvOdr.getCustomerItemNo()))){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerItemNoOrg(), ttExpRcvOdr.getCustomerItemNoOrg()))){
                        return false;
                    }
                    if (before.getOdrCtrlNo().compareTo(ttExpRcvOdr.getOdrCtrlNo()) != 0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when a firm order receipt exists in addition to the object record of amount of Forecast QTYs >0).
     * <br />確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)を行います。
     *
     * @param forecastQty Forecast QTY<br />Forecast QTY
     * @param after Export-Receive-Order search-condition domain  ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain  ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when Firm QTY is 0.
     *         <br />If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />Firm QTYが0の場合、true
     *         <br />上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrByForecastQty(BigDecimal forecastQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before) 
        throws ApplicationException {

        if (BigDecimal.ZERO.equals(forecastQty)) {
            return true;
        }

        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();

        ttExpRcvOdrCriteria.setRcvOdrCompCd(after.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(after.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(after.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(after.getItemNo());
        if (after.getPkgCd().compareTo("") == 0) {
            ttExpRcvOdrCriteria.setPkgCd(" ");
        } else {
            ttExpRcvOdrCriteria.setPkgCd(after.getPkgCd());
        }
        ttExpRcvOdrCriteria.setEtdDueDt(after.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(after.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(after.getCustomerItemNo());
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);

        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);

        if (StringUtils.isEmpty(before.getCustomerItemNo())) {
            if (ttExpRcvOdrList == null || ttExpRcvOdrList.isEmpty() || ttExpRcvOdrList.size() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (ttExpRcvOdrList != null && !ttExpRcvOdrList.isEmpty()) {
                for (TtExpRcvOdrDomain ttExpRcvOdr : ttExpRcvOdrList){

                    if (!(StringUtils.equals(before.getTrnsCd(), ttExpRcvOdr.getTrnsCd()))) {
                        return false;
                    }
                    if ((before.getEtdDueDt()).compareTo(ttExpRcvOdr.getEtdDueDt()) != 0){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerPoNo(), ttExpRcvOdr.getCustomerPoNo()))){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerItemNo(), ttExpRcvOdr.getCustomerItemNo()))){
                        return false;
                    }
                    if (!(StringUtils.equals(before.getCustomerItemNoOrg(), ttExpRcvOdr.getCustomerItemNoOrg()))){
                        return false;
                    }
                    if (before.getOdrCtrlNo().compareTo(ttExpRcvOdr.getOdrCtrlNo()) != 0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
    
    /**
     * Perform a duplication check (Export Receive Order).
     * <br />重複チェック（輸出受注）を行います。
     *
     * @param after Export-Receive-Order search-condition domain  ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain  ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when the following items of before and after are in agreement.
     *         <br />If there is no data of relevance, they will be true, otherwise, false.
     *         <br />beforeとafterの以下の項目が一致している場合、true
     *         <br />該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrByDuplication(TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException {
        
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        
        ttExpRcvOdrCriteria.setRcvOdrCompCd(after.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(after.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(after.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(after.getItemNo());
        if (after.getPkgCd().compareTo("") == 0) {
            ttExpRcvOdrCriteria.setPkgCd(" ");
        } else {
            ttExpRcvOdrCriteria.setPkgCd(after.getPkgCd());
        }
        ttExpRcvOdrCriteria.setTrnsCd(after.getTrnsCd());
        ttExpRcvOdrCriteria.setEtdDueDt(after.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(after.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(after.getCustomerItemNo());
        ttExpRcvOdrCriteria.setCustomerItemNoOrg(after.getCustomerItemNoOrg());
        ttExpRcvOdrCriteria.setOdrCtrlNo(after.getOdrCtrlNo());
        
        TtExpRcvOdrDomain ttExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
        
        if (StringUtils.isEmpty(before.getCustomerItemNo())) {
            if (ttExpRcvOdr == null) {
                return true;
            } else {
                return false;
            }
        } else {
            if (ttExpRcvOdr != null ) {
                if (!(StringUtils.equals(before.getCustomerPoNo(), ttExpRcvOdr.getCustomerPoNo()))){
                    return false;
                }
                if (!(StringUtils.equals(before.getCustomerItemNo(), ttExpRcvOdr.getCustomerItemNo()))){
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Return "", when an argument is blank, and in except, return an argument.
     * <br />引数がblankの場合""を返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In null, this is a VALUE of an argument except 0.<br />nullの場合0、以外は引数の値
     */
    protected String convertNullToBlank(Object val){
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        if (val == null){
            return "";
        } else if (val.getClass().getName().equals("java.util.Date")) {
            return df.format(val);
        } else {
            // if (val.getClass().getName().equals("java.math.BigDecimal"))
            return String.valueOf(val);
        }
    }
    
    /**
     * Return 0, when an argument is null, and in except, return an argument.
     * <br />引数がnullの場合0を返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In null, this is a VALUE of an argument except 0.<br />nullの場合0、以外は引数の値
     */
    protected BigDecimal convertNullToZero(BigDecimal val){
        if (val == null){
            return BigDecimal.ZERO;
        } else {
            return val;
        }
    }
    
    /**
     * Judge an ordering QUANTITY and ordering decision and set to an Export-Receive-Order domain.
     * <br />受注数量、受注確定を判定し、輸出受注ドメインに設定します。
     *
     * @param firmQty A definite QUANTITY<br />確定数量
     * @param forecastQty The amount of Forecast QTYs<br />内示数量
     * @param odrRcv Export-Receive-Order domain  *For return VALUEs<br />輸出受注ドメイン ※戻り値用
     */
    protected void setOdrFirm(BigDecimal firmQty, BigDecimal forecastQty, WB001OdrRcvDomain odrRcv){
        if (firmQty.compareTo(BigDecimal.ZERO) > 0) {
            odrRcv.setOdrQty(firmQty);
            odrRcv.setOdrFirmFlg(FLAG_Y);
        } else if (forecastQty.compareTo(BigDecimal.ZERO) > 0) {
            odrRcv.setOdrQty(forecastQty);
            odrRcv.setOdrFirmFlg(FLAG_N);
        } else {
            odrRcv.setOdrQty(BigDecimal.ZERO);
            odrRcv.setOdrFirmFlg(FLAG_N);
        }
    }
}
