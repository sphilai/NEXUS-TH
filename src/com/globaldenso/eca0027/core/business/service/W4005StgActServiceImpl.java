/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_RECEIVED_AT_TO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAIN_MARK_TYP_MAIN_MARK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_LOADING_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_LOADING_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0065;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0066;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4005R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_INSTR_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_ACT_PLTZ_MAX_COUNT;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmTrnsTypVolumeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmTrnsTypVolumeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmTrnsTypVolumeService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgActService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TwStgActService;
import com.globaldenso.eca0027.core.business.dao.W4005StgActDao;
import com.globaldenso.eca0027.core.business.domain.L4002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Implementation class of service that provides a Staging Actuality function
 * <br />山作り実績機能を提供するサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12959 $
 */
public class W4005StgActServiceImpl implements W4005StgActService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Function authority service.
     */
    protected UserAuthService userAuthService;

    /**
     * Staging actuality DAO.
     */
    protected W4005StgActDao w4005StgActDao;

    /**
     * TwStgAct service.
     */
    protected TwStgActService twStgActService;

    /**
     * TtStgActService service.
     */
    protected TtStgActService ttStgActService;

    /**
     * TtPltzService service.
     */
    protected TtPltzService ttPltzService;

    /**
     * TtStgInstrService service.
     */
    protected TtStgInstrService ttStgInstrService;

    /**
     * TmTrnsTypService service.
     */
    protected TmTrnsTypService tmTrnsTypService;

    /**
     * TmTrnsTypVolumeService service.
     */
    protected TmTrnsTypVolumeService tmTrnsTypVolumeService;

    /**
     * L4002ReportService service.
     */
    protected L4002ReportService l4002ReportService;

    /**
     * Constructor.
     */
    public W4005StgActServiceImpl() {
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for w4005StgActDao.
     *
     * @param stgActDao Set for w4005StgActDao
     */
    public void setW4005StgActDao(W4005StgActDao stgActDao) {
        w4005StgActDao = stgActDao;
    }

    /**
     * Setter method for twStgActService.
     *
     * @param twStgActService Set for twStgActService
     */
    public void setTwStgActService(TwStgActService twStgActService) {
        this.twStgActService = twStgActService;
    }

    /**
     * Setter method for ttStgActService.
     *
     * @param ttStgActService Set for ttStgActService
     */
    public void setTtStgActService(TtStgActService ttStgActService) {
        this.ttStgActService = ttStgActService;
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
     * Setter method for ttStgInstrService.
     *
     * @param ttStgInstrService Set for ttStgInstrService
     */
    public void setTtStgInstrService(TtStgInstrService ttStgInstrService) {
        this.ttStgInstrService = ttStgInstrService;
    }

    /**
     * Setter method for tmTrnsTypService.
     *
     * @param tmTrnsTypService Set for tmTrnsTypService
     */
    public void setTmTrnsTypService(TmTrnsTypService tmTrnsTypService) {
        this.tmTrnsTypService = tmTrnsTypService;
    }

    /**
     * Setter method for tmTrnsTypVolumeService.
     *
     * @param tmTrnsTypVolumeService Set for tmTrnsTypVolumeService
     */
    public void setTmTrnsTypVolumeService(
        TmTrnsTypVolumeService tmTrnsTypVolumeService) {
        this.tmTrnsTypVolumeService = tmTrnsTypVolumeService;
    }

    /**
     * Setter method for l4002ReportService.
     *
     * @param reportService Set for l4002ReportService
     */
    public void setL4002ReportService(L4002ReportService reportService) {
        l4002ReportService = reportService;
    }

    //--------------------------------- Parameter check method - validateConsistency ----------------------------------
    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateConsistencyFmInstrDateToInstrDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFmInstrDateToInstrDate(
        String instrDtFrom, String instrDtTo, String dateFormat) {

        if (CheckUtil.isBlankOrNull(instrDtFrom) || CheckUtil.isBlankOrNull(instrDtTo)) {
            return true;
        }
        return commonService.validateFromToDate(dateFormat, instrDtFrom, instrDtTo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateConsistencyShipperAuth(java.lang.String)
     */
    public boolean validateConsistencyShipperAuth(String shipperCd)
        throws ApplicationException {

        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W4005R, shipperCd);
    }

    //--------------------------------- Check database method - validateDatabase ----------------------------------
    //--------------------------------- データベースチェックメソッド validateDatabase ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseAfterDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseAfterDate(String date, String dateFormat, String loginUserTimezoneId)
        throws ApplicationException {

        return commonService.validateAfterDate(date, dateFormat, loginUserTimezoneId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseCarrier(java.lang.String)
     */
    public boolean validateDatabaseCarrier(String compCd)
        throws ApplicationException {

        return commonService.validateCarrier(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTwStgActOnCreateMoveToRegister(java.lang.String)
     */
    public boolean validateDatabaseTwStgActOnCreateMoveToRegister(String loginUserDscId)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgActCriteriaDomain twStgActCriteriaDomain = new TwStgActCriteriaDomain();
        twStgActCriteriaDomain.setDscId(loginUserDscId);
        twStgActCriteriaDomain.setSearchCountCheckFlg(false);
        // If 0 Listings staging actuality work
        // 山作り実績ワーク0件の場合
        if (twStgActService.searchCount(twStgActCriteriaDomain) == 0) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTwStgActOnCreateUpdateByCount(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public boolean validateDatabaseTwStgActOnCreateUpdateByCount(String loginUserDscId, int countNew)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgActCriteriaDomain twStgActCriteriaDomain = new TwStgActCriteriaDomain();
        twStgActCriteriaDomain.setDscId(loginUserDscId);
        twStgActCriteriaDomain.setSearchCountCheckFlg(false);
        // Number of acquisition
        // 件数取得
        int countResult = twStgActService.searchCount(twStgActCriteriaDomain);
        // If the limit is exceeded
        // 上限を超過する場合
        if (STG_ACT_PLTZ_MAX_COUNT < countResult + countNew) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseWhCompanyWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd)
        throws ApplicationException {

        return commonService.validateCompWh(compCd, whCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtPltzOnRegister(java.util.List, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegister(List<? extends W4005PltzDomain> pltzDomainList,
        List<String[]> paramsList) throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4005PltzDomain> resultPltzDomainList
            = (List<W4005PltzDomain>)w4005StgActDao.lockTtPltzByMainMarkListNoWait(pltzDomainList);

        // If palletize has been removed to others
        // パレタイズが他者に削除されている場合
        if (resultPltzDomainList.size() < pltzDomainList.size()) {
            paramsList.add(null);
            return GSCM_E0_0010;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4005PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If instruction palletizing
            // 指示品の場合
            if (FLAG_Y.equals(resultPltzDomain.getStgInstrItemFlg())) {
                // If custom timing typ is "A" or "b"
                // 通関タイミング区分が"A"または"B"の場合
                if (
                        CUSTOM_TIMING_TYPE_A.equals(resultPltzDomain.getCustomTimingTyp())
                    ||  CUSTOM_TIMING_TYPE_B.equals(resultPltzDomain.getCustomTimingTyp())
                )
                {
                    // If palletize status is not "30"(staging instruction worked done)
                    // パレタイズステータスが"30"(荷揃え実績)以外の場合
                    if (!PLTZ_STATUS_STG_INSTR_WORKED_DONE.equals(resultPltzDomain.getPltzStatus())) {
                        paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
                    }

                // If custom timing typ is "Z"
                // 通関タイミング区分が"Z"の場合
                } else {
                    // If palletize status is not "40"(customs clearance)
                    // パレタイズステータスが"40"(通関)以外の場合
                    if (!PLTZ_STATUS_CUSTOMS_CLEARANCE_Z.equals(resultPltzDomain.getPltzStatus())) {
                        paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
                    }
                }

            // If non instruction palletizing
            // 成行品の場合
            } else {
                // パレタイズステータスが"10"(パレタイズ)以外の場合
                if (!PLTZ_STATUS_PLTZ.equals(resultPltzDomain.getPltzStatus())) {
                    paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
                }
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0062;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4005PltzDomain resultPltzDomain : resultPltzDomainList) {
            // Last TR status is not "10"(Blank) or "40"(Received at To)
            // 搬出入ステータスが"10"(ブランク)、"40"(受入)以外の場合
            if (
                !CARRY_OUT_IN_BLANK.equals(resultPltzDomain.getLastTrStatus())
                    &&  !CARRY_OUT_IN_RECEIVED_AT_TO.equals(resultPltzDomain.getLastTrStatus())
            )
            {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0063;
        }
        
        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4005PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize instruction status is "10"(Instruction Created)-"40"(All CML Create) other than
            // 梱包指示ステータスが"10"(Instruction Created)～"40"(All CML Create)の場合
            if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.equals(resultPltzDomain.getPltzInstrStatus())
                || PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(resultPltzDomain.getPltzInstrStatus())
                    || PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE.equals(resultPltzDomain.getPltzInstrStatus())
                        || PLTZ_INSTR_STATUS_ALL_CML_CREATE.equals(resultPltzDomain.getPltzInstrStatus())) 
            {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0009;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtPltzOnRegisterByStgInstr(java.lang.String)
     */
    public boolean validateDatabaseTtPltzOnRegisterByStgInstr(String loginUserDscId)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        List<String> resultMainMarkList = w4005StgActDao.searchTtPltzByStgInstr(loginUserDscId);
        if (0 < resultMainMarkList.size()) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtStgInstrOnRegister(java.util.List)
     */
    public boolean validateDatabaseTtStgInstrOnRegister(List<String> stgInstrNoList) throws ApplicationException {

        // Record lock
        // 行ロック
        List<String> resultStgInstrNoList = w4005StgActDao.lockTtStgInstrByStgInstrNoListNoWait(stgInstrNoList);
        // If the lock count is incorrect
        // ロック件数が正しくない場合
        if (resultStgInstrNoList.size() != stgInstrNoList.size()) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTmTrnsTyp(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTmTrnsTyp(String trnsCd, String trnsTypCd)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TmTrnsTypCriteriaDomain tmTrnsTypCriteriaDomain = new TmTrnsTypCriteriaDomain();
        tmTrnsTypCriteriaDomain.setTrnsCd(trnsCd);
        tmTrnsTypCriteriaDomain.setTrnsTypCd(trnsTypCd);
        // If 0 Listings
        // 0件の場合
        if (tmTrnsTypService.searchByKey(tmTrnsTypCriteriaDomain) == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtStgActOnRegister(java.lang.String)
     */
    public boolean validateDatabaseTtStgActOnRegister(String stgActNo)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TtStgActCriteriaDomain ttStgActCriteriaDomain = new TtStgActCriteriaDomain();
        ttStgActCriteriaDomain.setStgActNo(stgActNo);
        // Record lock
        // 行ロック
        TtStgActDomain resultTtStgActDomain = ttStgActService.lockByKeyNoWait(ttStgActCriteriaDomain);
        // If 0 Listings
        // 0件の場合
        if (resultTtStgActDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtPltzOnRegisterUpdate(java.lang.String, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegisterUpdate(String stgActNo, List<String[]> paramsList)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4005PltzDomain> resultPltzDomainList
            = (List<W4005PltzDomain>)w4005StgActDao.lockTtPltzByStgActNoNoWait(stgActNo);

        // If palletize has been removed to others
        // パレタイズが他者に削除されている場合
        if (resultPltzDomainList.size() == 0) {
            paramsList.add(null);
            return GSCM_E0_0010;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4005PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize status is "50"(staging actuality) other than
            // パレタイズステータスが"50"(山作り実績)以外の場合
            if (!PLTZ_STATUS_STG_ACT.equals(resultPltzDomain.getPltzStatus())) {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0062;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#validateDatabaseTtStgInstrOnRegisterUpdate(java.lang.String)
     */
    public boolean validateDatabaseTtStgInstrOnRegisterUpdate(String stgActNo) throws ApplicationException {

        // Record lock
        // 行ロック
        List<String> resultStgInstrNoList = w4005StgActDao.lockTtStgInstrByStgActNoNoWait(stgActNo);
        // If 0 Listings
        // 0件の場合
        if (resultStgInstrNoList.size() == 0) {
            return false;
        }

        return true;
    }

    //--------------------------------- Search methods - search  ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return w4005StgActDao.searchCountForPagingOnMainSearch(stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public List<? extends W4005StgActDomain> searchForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return w4005StgActDao.searchForPagingOnMainSearch(stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException {

        return w4005StgActDao.searchCountForPagingOnCreateSearch(pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain)
     */
    public List<? extends W4005PltzDomain> searchForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4005PltzDomain> resultPltzDomainList
            = (List<W4005PltzDomain>)w4005StgActDao.searchForPagingOnCreateSearch(pltzCriteriaDomain);

        // Conversion to a login's unit
        // ログイン者単位への換算
        covertWeightUnitPltzList(resultPltzDomainList,
            pltzCriteriaDomain.getWeightUnit(), false, pltzCriteriaDomain.getLocale());
        covertVolumeUnitPltzList(resultPltzDomainList,
            pltzCriteriaDomain.getVolumeUnit(), false, pltzCriteriaDomain.getLocale());

        return resultPltzDomainList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchCountOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public int searchCountOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return w4005StgActDao.searchCountOnRegisterInitByFromMain(stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public W4005StgActDomain searchOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // Loading ratio number format
        // パレタイズ検索
        // 積載率数値フォーマット
        W4005StgActDomain resultStgActDomain
            = w4005StgActDao.searchOnRegisterInitByFromMain(stgActCriteriaDomain);
        BigDecimal loadingRatio
            = resultStgActDomain.getLoadingRatio().setScale(MAX_SCALE_LOADING_RATIO, RoundingMode.UP);
        resultStgActDomain.setLoadingRatio(loadingRatio);

        // If 0 Listings (others deleted)
        // 0件の場合（他者削除）
        if (resultStgActDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Conversion to a login's unit - header
        // ログイン者単位への換算 - ヘッダ
        covertWeightUnitStgAct(resultStgActDomain,
            stgActCriteriaDomain.getWeightUnit(), stgActCriteriaDomain.getLocale());
        covertVolumeUnitStgAct(resultStgActDomain,
            stgActCriteriaDomain.getVolumeUnit(), stgActCriteriaDomain.getLocale());

        // Conversion to a login's unit - detail
        // ログイン者単位への換算 - 明細
        covertWeightUnitPltzList(resultStgActDomain.getPltzDomainList(),
            stgActCriteriaDomain.getWeightUnit(), false, stgActCriteriaDomain.getLocale());
        covertVolumeUnitPltzList(resultStgActDomain.getPltzDomainList(),
            stgActCriteriaDomain.getVolumeUnit(), false, stgActCriteriaDomain.getLocale());

        return resultStgActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public W4005StgActDomain searchOnRegisterInitByFromCreate(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索

        List<? extends W4005PltzDomain> resultPltzDomainList
            = w4005StgActDao.searchOnRegisterInitByFromCreate(stgActCriteriaDomain);
        // If 0 Listings (others deleted)
        // 0件の場合（他者削除）
        if (resultPltzDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Add a header in the search results
        // 検索結果にヘッダを付加
        W4005StgActDomain resultStgActDomain = new W4005StgActDomain();
        // BL domain -> BL domain transfer
        // BLドメイン→BLドメイン移送
        CommonUtil.copyPropertiesDomainToDomain(resultStgActDomain, stgActCriteriaDomain);
        resultStgActDomain.setPkgQty(resultPltzDomainList.size());
        resultStgActDomain.setPltzDomainList(resultPltzDomainList);

        // Conversion to a login's unit - header
        // ログイン者単位への換算 - ヘッダ

        // Palletize unit G / W Search
        // パレタイズ単位G/W検索
        List<? extends W4005PltzDomain> resultWeightSummaryPltzDomainList
            = w4005StgActDao.searchOnRegisterInitByWeightSummary(stgActCriteriaDomain.getLoginUserDscId());
        // Weight unit conversion
        // 重量単位換算
        BigDecimal totalGrossWeight = covertWeightUnitPltzList(resultWeightSummaryPltzDomainList,
            stgActCriteriaDomain.getWeightUnit(), true, stgActCriteriaDomain.getLocale());
        resultStgActDomain.setGrossWeight(totalGrossWeight);
        resultStgActDomain.setWeightUnit(stgActCriteriaDomain.getWeightUnit());

        // Palletize unit Volume Search
        // パレタイズ単位Volume検索
        List<? extends W4005PltzDomain> resultVolumeSummaryPltzDomainList
            = w4005StgActDao.searchOnRegisterInitByVolumeSummary(stgActCriteriaDomain.getLoginUserDscId());
        // Volume unit conversion
        // 容積単位換算
        BigDecimal totalVolume = covertVolumeUnitPltzList(resultVolumeSummaryPltzDomainList,
            stgActCriteriaDomain.getVolumeUnit(), true, stgActCriteriaDomain.getLocale());
        resultStgActDomain.setVolume(totalVolume);
        resultStgActDomain.setVolumeUnit(stgActCriteriaDomain.getVolumeUnit());

        // Set loading ratio
        // 積載率を設定
        TmTrnsTypVolumeDomain resultTmTrnsTypVolumeDomain = searchTrnsTypVolume(stgActCriteriaDomain);
        // UT446 MOD START
        BigDecimal loadingRatio = calcLoadingRatio(totalVolume,
            resultTmTrnsTypVolumeDomain.getVolume(), stgActCriteriaDomain.getLocale());
        resultStgActDomain.setLoadingRatio(loadingRatio);
        // UT446 MOD END

        // Conversion to a login's unit - detail
        // ログイン者単位への換算 - 明細

        // Weight unit conversion
        // 重量単位換算
        covertWeightUnitPltzList(resultStgActDomain.getPltzDomainList(),
            stgActCriteriaDomain.getWeightUnit(), false, stgActCriteriaDomain.getLocale());
        // Volume unit conversion
        // 容積単位換算
        covertVolumeUnitPltzList(resultStgActDomain.getPltzDomainList(),
            stgActCriteriaDomain.getVolumeUnit(), false, stgActCriteriaDomain.getLocale());

        return resultStgActDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#printStgAct(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public File printStgAct(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        // BL domain -> document domain transfer
        // BLドメイン→帳票ドメイン移送
        L4002ReportDomain l4002ReportCriteriaDomain = new L4002ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l4002ReportCriteriaDomain, stgActCriteriaDomain);
        // 検索
        File file = l4002ReportService.searchTtStgAct(l4002ReportCriteriaDomain);

        return file;
    }


    //--------------------------------- Registration method - create  ----------------------------------
    //--------------------------------- 登録系メソッド create ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#createOnCreateUpdate(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public void createOnCreateUpdate(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        List<TwStgActDomain> twStgActDomainList = new ArrayList<TwStgActDomain>();
        for (W4005PltzDomain pltzDomain : stgActDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TwStgActDomain twStgActDomain = new TwStgActDomain();
            CommonUtil.copyPropertiesDomainToDomain(twStgActDomain, pltzDomain);
            twStgActDomain.setMainMark(pltzDomain.getMainMarkOrXmainMark());
            twStgActDomain.setDscId(stgActDomain.getLoginUserDscId());
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(twStgActDomain, SCREEN_ID_W4007);

            twStgActDomainList.add(twStgActDomain);
        }
        // Registration to work
        // ワークへ登録
        twStgActService.create(twStgActDomainList);
    }

    //--------------------------------- Update method - update  ----------------------------------
    //--------------------------------- 更新系メソッド update ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#updateOnRegisterUpdateEtdCarrier(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public int updateOnRegisterUpdateEtdCarrier(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        // UT446 ADD START
        // Re-calculation loading ratio
        // Volume and the volume unit of stgActDomain is modified to a unit of the logged-in user in the initial display.
        // 積載率を再計算
        // stgActDomainの容積、容積単位は初期表示でログインユーザーの単位に変更済み。
        W4005StgActCriteriaDomain stgActCriteriaDomain = new W4005StgActCriteriaDomain();
        stgActCriteriaDomain.setTrnsCd(stgActDomain.getTrnsCd());
        stgActCriteriaDomain.setTrnsTypCd(stgActDomain.getTrnsTypCd());
        stgActCriteriaDomain.setVolumeUnit(stgActDomain.getVolumeUnit());
        TmTrnsTypVolumeDomain resultTmTrnsTypVolumeDomain = searchTrnsTypVolume(stgActCriteriaDomain);
        BigDecimal loadingRatio
            = calcLoadingRatio(stgActDomain.getVolume(), resultTmTrnsTypVolumeDomain.getVolume(), stgActDomain.getLocale());
        // UT446 ADD END

        // SACT domain transfer
        // SACTドメイン移送
        TtStgActDomain ttStgActDomain = new TtStgActDomain();
        ttStgActDomain.setStgActNo(stgActDomain.getStgActNo());
        ttStgActDomain.setEtd(stgActDomain.getEtd());
        ttStgActDomain.setCarrierCompCd(stgActDomain.getCarrierCompCd());
        ttStgActDomain.setLoadingRatio(loadingRatio); // UT446 ADD
        ttStgActDomain.setTrnsTypCd(stgActDomain.getTrnsTypCd()); // UT446 ADD
        ttStgActDomain.setComUpdateTimestamp(stgActDomain.getComUpdateTimestamp());
        // Setting a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(ttStgActDomain, SCREEN_ID_W4008);
        // Update staging actuality
        // 山作り実績更新
        int updateCount = ttStgActService.update(ttStgActDomain);

        return updateCount;
    }

    //--------------------------------- Delete method - delete ----------------------------------
    //--------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public int deleteOnHeaderInit(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgActCriteriaDomain twStgActCriteriaDomain = new TwStgActCriteriaDomain();
        twStgActCriteriaDomain.setDscId(stgActDomain.getLoginUserDscId());
        twStgActCriteriaDomain.setSearchCountCheckFlg(false);
        // If the information in the staging actuality work there
        // 山作り実績ワークの情報が存在する場合
        if (0 < twStgActService.searchCount(twStgActCriteriaDomain)) {
            // Delete information staging actuality work
            // 山作り実績ワークの情報削除
            return twStgActService.deleteByCondition(twStgActCriteriaDomain);
        }

        return 0;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#deleteOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public int deleteOnRegisterDelete(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        int deleteCount = 0;

        for (W4005PltzDomain pltzDomain : stgActDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TwStgActCriteriaDomain twStgActCriteriaDomain = new TwStgActCriteriaDomain();
            twStgActCriteriaDomain.setDscId(stgActDomain.getLoginUserDscId());
            twStgActCriteriaDomain.setMainMark(pltzDomain.getMainMarkOrXmainMark());
            // Removed from the work
            // ワークから削除
            deleteCount += twStgActService.deleteByCondition(twStgActCriteriaDomain);
        }

        return deleteCount;
    }

    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public String transactOnRegister(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        // Time zone conversion date of login user
        // ログイン者のタイムゾーン変換日付
        Date localDate = DateUtil.convertTime(new Date(), stgActDomain.getTimeZone());

        // Numbering of staging actuality No.
        // 山作り実績No.の採番

        // Creating numbering key
        // 採番キーの作成
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyMMdd");
        String stgActNoSeqKey
            = stgActDomain.getWhCompCd() + "SA" + DateFormat.format(localDate).substring(1);
        // Get staging actuality No.
        // 山作り実績No.の取得
        String stgActNo = stgActNoSeqKey
            + commonService.transactSequence(stgActNoSeqKey, SEQ_TYP_STG_ACTUALITY_NO, 1, SCREEN_ID_W4008).get(0);

        // Registration of staging actuality
        // 山作り実績の登録

        // SACT domain transfer
        // SACTドメイン移送
        TtStgActDomain ttStgActDomain = new TtStgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttStgActDomain, stgActDomain);
        ttStgActDomain.setStgActNo(stgActNo);
        // To be in effect here if you need to register by removing the time information. 
        // I registered in time with information in the current specification.
        // 時刻情報を削除して登録する必要がある場合はこちらを有効にすること。
        // 現仕様では時刻情報付きでの登録とする。
        //ttStgActDomain.setStgActDt(DateUtils.truncate(localDate, Calendar.DATE));
        ttStgActDomain.setStgActDt(localDate);
        // Danger item whether or not judgment
        // 危険品有無判断
        String dngrItemFlg = w4005StgActDao.searchTtPltzByDngrItem(stgActDomain.getLoginUserDscId());
        ttStgActDomain.setDngrItemFlg(dngrItemFlg);
        // Setting a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttStgActDomain, SCREEN_ID_W4008);
        // register
        // 登録
        ttStgActService.create(ttStgActDomain);

        // Delete staging actuality work
        // 山作り実績ワークの削除

        // SACT domain transfer
        // SACTドメイン移送
        TwStgActCriteriaDomain twStgActCriteriaDomain = new TwStgActCriteriaDomain();
        twStgActCriteriaDomain.setDscId(stgActDomain.getLoginUserDscId());
        // delete
        // 削除
        twStgActService.deleteByCondition(twStgActCriteriaDomain);

        // Update palletize
        // パレタイズの更新

        // SACT domain transfer
        // SACTドメイン移送
        List<TtPltzDomain> ttPltzDomainList = new ArrayList<TtPltzDomain>();
        List<TtPltzCriteriaDomain> ttPltzCriteriaDomainList = new ArrayList<TtPltzCriteriaDomain>();
        for (W4005PltzDomain w4005PltzDomain : stgActDomain.getPltzDomainList()) {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            if (MAIN_MARK_TYP_MAIN_MARK.equals(w4005PltzDomain.getMainMarkTyp())) {
                ttPltzCriteriaDomain.setMainMark(w4005PltzDomain.getMainMarkOrXmainMark());
            } else {
                ttPltzCriteriaDomain.setXmainMark(w4005PltzDomain.getMainMarkOrXmainMark());
            }
            ttPltzCriteriaDomainList.add(ttPltzCriteriaDomain);
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setPltzStatus(PLTZ_STATUS_STG_ACT);
            ttPltzDomain.setStgActNo(stgActNo);
            ttPltzDomainList.add(ttPltzDomain);
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzDomain, SCREEN_ID_W4008);
        }
        // update
        // 更新
        ttPltzService.updateByCondition(ttPltzDomainList, ttPltzCriteriaDomainList);

        // Update staging instruction
        // 荷揃え指示の更新

        HashSet<String> stgInstrNoSet = new HashSet<String>();
        for (W4005PltzDomain w4005PltzDomain : stgActDomain.getPltzDomainList()) {
            if (!CheckUtil.isBlankOrNull(w4005PltzDomain.getStgInstrNo())) {
                stgInstrNoSet.add(w4005PltzDomain.getStgInstrNo());
            }
        }
        if (0 < stgInstrNoSet.size()) {
            // SACT domain transfer
            // SACTドメイン移送
            List<TtStgInstrDomain> ttStgInstrDomainList = new ArrayList<TtStgInstrDomain>();
            List<TtStgInstrCriteriaDomain> ttStgInstrCriteriaDomainList = new ArrayList<TtStgInstrCriteriaDomain>();
            for (String stgInstrNo : stgInstrNoSet) {
                TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
                ttStgInstrCriteriaDomain.setStgInstrNo(stgInstrNo);
                ttStgInstrCriteriaDomainList.add(ttStgInstrCriteriaDomain);
                TtStgInstrDomain ttStgInstrDomain = new TtStgInstrDomain();
                ttStgInstrDomain.setStgActNo(stgActNo);
                ttStgInstrDomainList.add(ttStgInstrDomain);
                // Setting a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(ttStgInstrDomain, SCREEN_ID_W4008);
            }
            // update
            // 更新
            ttStgInstrService.updateByCondition(ttStgInstrDomainList, ttStgInstrCriteriaDomainList);
        }

        return stgActNo;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4005StgActService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W4005StgActDomain)
     */
    public int transactOnRegisterCancel(W4005StgActDomain stgActDomain)
        throws ApplicationException {

        int transactCount = 0;

        // Delete staging actuality
        // 山作り実績の削除

        // SACT domain transfer
        // SACTドメイン移送
        TtStgActCriteriaDomain ttStgActCriteriaDomain = new TtStgActCriteriaDomain();
        ttStgActCriteriaDomain.setStgActNo(stgActDomain.getStgActNo());
        ttStgActCriteriaDomain.setComUpdateTimestamp(stgActDomain.getComUpdateTimestamp());
        // delte
        // 削除
        transactCount += ttStgActService.delete(ttStgActCriteriaDomain);

        // Update palletize
        // パレタイズの更新

        // Update data domain transfer
        // 更新情報ドメイン移送
        W4005PltzDomain pltzDomain = new W4005PltzDomain();
        pltzDomain.setStgActNo(stgActDomain.getStgActNo());
        // Setting a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(pltzDomain, SCREEN_ID_W4008);
        // update
        // 更新
        transactCount += w4005StgActDao.updateTtPltzOnRegisterCancel(pltzDomain);

        // Update staging instruction
        // 荷揃え指示の更新

        // SACT domain transfer
        // SACTドメイン移送
        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgActNo(stgActDomain.getStgActNo());
        ttStgInstrCriteriaDomain.setSearchCountCheckFlg(false);
        // If the information in the staging instruction there
        // 荷揃え指示の情報が存在する場合
        if (0 < ttStgInstrService.searchCount(ttStgInstrCriteriaDomain)) {
            TtStgInstrDomain ttStgInstrDomain = new TtStgInstrDomain();
            ttStgInstrDomain.setStgActNo("");
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttStgInstrDomain, SCREEN_ID_W4008);
            // update
            // 更新
            transactCount += ttStgInstrService.updateByCondition(ttStgInstrDomain, ttStgInstrCriteriaDomain);
        }

        return transactCount;
    }

    //--------------------------------- Below, protected method ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Search transportation type volume master 
     * <br />輸送手段種別容積原単位を検索します。
     *
     * @param stgActCriteriaDomain Parameter domain
     * @return Search result
     * @throws ApplicationException If Transportation type volume master can not browse
     */
    protected TmTrnsTypVolumeDomain searchTrnsTypVolume(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TmTrnsTypVolumeCriteriaDomain tmTrnsTypVolumeCriteriaDomain = new TmTrnsTypVolumeCriteriaDomain();
        tmTrnsTypVolumeCriteriaDomain.setTrnsCd(stgActCriteriaDomain.getTrnsCd());
        tmTrnsTypVolumeCriteriaDomain.setTrnsTypCd(stgActCriteriaDomain.getTrnsTypCd());
        tmTrnsTypVolumeCriteriaDomain.setVolumeUnit(stgActCriteriaDomain.getVolumeUnit());
        // search
        // 検索
        TmTrnsTypVolumeDomain resultTmTrnsTypVolumeDomain
            = tmTrnsTypVolumeService.searchByKey(tmTrnsTypVolumeCriteriaDomain);
        if (resultTmTrnsTypVolumeDomain == null) {
            // UT446 MOD START
            //throw new GscmBusinessException(NXS_E7_0066,
            //    new String[] { stgActCriteriaDomain.getVolumeUnit() });
            throw new GscmApplicationException(NXS_E7_0065,
                new String[] { stgActCriteriaDomain.getTrnsCd(), stgActCriteriaDomain.getTrnsTypCd() });
            // UT446 MOD END
        }
        if (BigDecimal.ZERO.equals(resultTmTrnsTypVolumeDomain.getVolume())) {
            throw new GscmApplicationException(NXS_E7_0066,
                new String[] { stgActCriteriaDomain.getVolumeUnit() });
        }

        return resultTmTrnsTypVolumeDomain;
    }

    /**
     * Make the weight unit conversion to the target staging instruction domain
     * <br />山作り実績ドメインを対象に重量単位換算を行います。
     *
     * @param stgActDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertWeightUnitStgAct(W4005StgActDomain stgActDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal weight = stgActDomain.getGrossWeight();
        // If the weight of the unit staging instruction is different from the unit specified
        // 山作り実績の重量単位が指定の単位と異なる場合
        if (!dstUnit.equals(stgActDomain.getWeightUnit())) {
            weight = commonService.convertWeightUnit(weight, stgActDomain.getWeightUnit(), dstUnit);
            // In the case of overflow the integer part
            // 整数部桁あふれの場合
            if (weight == null) {
                Object[] params = {
                    commonService.getResource(locale, "label.totalGrossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        // Number format
        // 数値フォーマット
        stgActDomain.setGrossWeight(weight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
        stgActDomain.setWeightUnit(dstUnit);
    }

    /**
     * Make the volume unit conversion to the target staging instruction domain
     * <br />山作り実績ドメインを対象に容積単位換算を行います。
     *
     * @param stgActDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertVolumeUnitStgAct(W4005StgActDomain stgActDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal volume = stgActDomain.getVolume();
        // If the volume of the unit staging instruction is different from the unit specified
        // 山作り実績の容積単位が指定の単位と異なる場合
        if (!dstUnit.equals(stgActDomain.getVolumeUnit())) {
            volume = commonService.convertVolumeUnit(volume, stgActDomain.getVolumeUnit(), dstUnit);
            // In the case of overflow the integer part
            // 整数部桁あふれの場合
            if (volume == null) {
                Object[] params = {
                    commonService.getResource(locale, "label.totalVolume")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        // Number format
        // 数値フォーマット
        stgActDomain.setVolume(volume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
        stgActDomain.setVolumeUnit(dstUnit);
    }

    /**
     * Make the weight unit conversion to target a list of staging instruction domain
     * <br />山作り実績ドメインのリストを対象に重量単位換算を行います。
     *
     * @param pltzDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param isForTotal true if the total calculation. If false otherwise
     * @param locale Locale
     * @return Total weight after conversion
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected BigDecimal covertWeightUnitPltzList(List<? extends W4005PltzDomain> pltzDomainList, String dstUnit,
        boolean isForTotal, Locale locale) throws ApplicationException {

        String label = "label.grossWeight";
        if (isForTotal) {
            label = "label.totalGrossWeight";
        }

        BigDecimal totalWeight = BigDecimal.ZERO;
        for (W4005PltzDomain pltzDomain : pltzDomainList) {
            BigDecimal pltzWeight = pltzDomain.getGrossWeight();
            // If the weight of the unit palletize is different from the unit specified
            // パレタイズの重量単位が指定の単位と異なる場合
            if (!dstUnit.equals(pltzDomain.getWeightUnit())) {
                pltzWeight = commonService.convertWeightUnit(pltzWeight,
                    pltzDomain.getWeightUnit(), dstUnit);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (pltzWeight == null) {
                    Object[] params = {
                        commonService.getResource(locale, label)
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            // Number format
            // 数値フォーマット
            pltzDomain.setGrossWeight(pltzWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
            pltzDomain.setWeightUnit(dstUnit);

            if (isForTotal) {
                totalWeight = totalWeight.add(pltzWeight);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (MAX_PRECISION_WEIGHT_UNIT < totalWeight.precision() - totalWeight.scale()) {
                    Object[] params = {
                        commonService.getResource(locale, label)
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
        }
        // Number format
        // 数値フォーマット
        totalWeight = totalWeight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP);

        return totalWeight;
    }

    /**
     * Make the volume unit conversion to target a list of staging instruction domain
     * <br />山作り実績ドメインのリストを対象に容積単位換算を行います。
     *
     * @param pltzDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param isForTotal true if the total calculation. If false otherwise
     * @param locale Locale
     * @return Total volume after conversion
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected BigDecimal covertVolumeUnitPltzList(List<? extends W4005PltzDomain> pltzDomainList, String dstUnit,
        boolean isForTotal, Locale locale) throws ApplicationException {

        String label = "label.volume";
        if (isForTotal) {
            label = "label.totalVolume";
        }

        BigDecimal totalVolume = BigDecimal.ZERO;
        for (W4005PltzDomain pltzDomain : pltzDomainList) {
            BigDecimal pltzVolume = pltzDomain.getVolume();
            // If the volume of the unit palletize is different from the unit specified
            // パレタイズの容積単位が指定の単位と異なる場合
            if (!dstUnit.equals(pltzDomain.getVolumeUnit())) {
                pltzVolume = commonService.convertVolumeUnit(pltzVolume,
                    pltzDomain.getVolumeUnit(), dstUnit);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (pltzVolume == null) {
                    Object[] params = {
                        commonService.getResource(locale, label)
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
            // Number format
            // 数値フォーマット
            pltzDomain.setVolume(pltzVolume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
            pltzDomain.setVolumeUnit(dstUnit);

            if (isForTotal) {
                totalVolume = totalVolume.add(pltzVolume);
                // In the case of overflow the integer part
                // 整数部桁あふれの場合
                if (MAX_PRECISION_VOLUME_UNIT < totalVolume.precision() - totalVolume.scale()) {
                    Object[] params = {
                        commonService.getResource(locale, label)
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
            }
        }
        // Number format
        // 数値フォーマット
        totalVolume = totalVolume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP);

        return totalVolume;
    }

    /**
     * Calculate the loading ratio
     * 積載率を計算する。
     *
     * @param volume Total volume of palletize
     * @param trnsTypVolume Container volume
     * @param locale Locale
     * @return Loading ration
     * @throws ApplicationException Business exception
     */
    protected BigDecimal calcLoadingRatio(BigDecimal volume, BigDecimal trnsTypVolume, Locale locale)
        throws ApplicationException {

        BigDecimal loadingRatio = volume.multiply(new BigDecimal(100))
            .divide(trnsTypVolume, MAX_SCALE_LOADING_RATIO, BigDecimal.ROUND_HALF_UP);
        // In the case of overflow the integer part
        // 整数部桁あふれの場合
        if (MAX_PRECISION_LOADING_RATIO < loadingRatio.precision() - loadingRatio.scale()) {
            Object[] params = {
                commonService.getResource(locale, "label.loadingRatio")
            };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }

        return loadingRatio;
    }
}
