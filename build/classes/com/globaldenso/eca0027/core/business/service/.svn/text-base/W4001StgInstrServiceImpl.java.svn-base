/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_VOLUME_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_SCALE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0021;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_INSTR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_INSTR_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_PLTZ_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_ISSUE_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WORKED_METH_TYP_INSTR;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TwStgInstrService;
import com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao;
import com.globaldenso.eca0027.core.business.domain.L4001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Implementation class of service that provides a Staging Instruction function
 * <br />荷揃え指示機能を提供するサービスの実装クラスです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 13346 $
 */
public class W4001StgInstrServiceImpl implements W4001StgInstrService {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Function authority service.
     */
    protected UserAuthService userAuthService;

    /**
     * Staging instruction DAO.
     */
    protected W4001StgInstrDao w4001StgInstrDao;

    /**
     * TwStgInstr service.
     */
    protected TwStgInstrService twStgInstrService;

    /**
     * TtStgInstrService service.
     */
    protected TtStgInstrService ttStgInstrService;

    /**
     * TtPltzService service.
     */
    protected TtPltzService ttPltzService;

    /**
     * L4001ReportService service.
     */
    protected L4001ReportService l4001ReportService;

    /**
     * Constructor.
     */
    public W4001StgInstrServiceImpl() {
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
     * Setter method for w4001StgInstrDao.
     *
     * @param stgInstrDao Set for w4001StgInstrDao
     */
    public void setW4001StgInstrDao(W4001StgInstrDao stgInstrDao) {
        w4001StgInstrDao = stgInstrDao;
    }

    /**
     * Setter method for twStgInstrService.
     *
     * @param twStgInstrService Set for twStgInstrService
     */
    public void setTwStgInstrService(TwStgInstrService twStgInstrService) {
        this.twStgInstrService = twStgInstrService;
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
     * Setter method for l4001ReportService.
     *
     * @param reportService Set for l4001ReportService
     */
    public void setL4001ReportService(L4001ReportService reportService) {
        l4001ReportService = reportService;
    }

    //--------------------------------- Parameter check method - validateConsistency ----------------------------------
    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateConsistencyFmInstrDateToInstrDate(java.lang.String, java.lang.String, java.lang.String)
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
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateConsistencyShipperAuth(java.lang.String)
     */
    public boolean validateConsistencyShipperAuth(String shipperCd)
        throws ApplicationException {

        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W4001R, shipperCd);
    }

    //--------------------------------- Check database method - validateDatabase ----------------------------------
    //--------------------------------- データベースチェックメソッド validateDatabase ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseAfterDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseAfterDateComp(String date, String dateFormat, String compCd)
        throws ApplicationException {

        return commonService.validateAfterDateComp(date, dateFormat, compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseCarrier(java.lang.String)
     */
    public boolean validateDatabaseCarrier(String compCd)
        throws ApplicationException {

        return commonService.validateCarrier(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException {

        return commonService.validateShipper(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTwStgInstrOnCreateMoveToRegister(java.lang.String)
     */
    public boolean validateDatabaseTwStgInstrOnCreateMoveToRegister(String loginUserDscId)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgInstrCriteriaDomain twStgInstrCriteriaDomain = new TwStgInstrCriteriaDomain();
        twStgInstrCriteriaDomain.setDscId(loginUserDscId);
        twStgInstrCriteriaDomain.setSearchCountCheckFlg(false);
        // If 0 Listings staging instruction work
        // 荷揃え指示ワーク0件の場合
        if (twStgInstrService.searchCount(twStgInstrCriteriaDomain) == 0) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTwStgInstrOnCreateUpdateByCount(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public boolean validateDatabaseTwStgInstrOnCreateUpdateByCount(String loginUserDscId, int countNew)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgInstrCriteriaDomain twStgInstrCriteriaDomain = new TwStgInstrCriteriaDomain();
        twStgInstrCriteriaDomain.setDscId(loginUserDscId);
        twStgInstrCriteriaDomain.setSearchCountCheckFlg(false);
        // Number of acquisition
        // 件数取得
        int countResult = twStgInstrService.searchCount(twStgInstrCriteriaDomain);
        // If the limit is exceeded
        // 上限を超過する場合
        if (STG_INSTR_PLTZ_MAX_COUNT < countResult + countNew) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTwStgInstrOnCreateUpdateByShipTo(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public boolean validateDatabaseTwStgInstrOnCreateUpdateByShipTo(String loginUserDscId, String shipToCd)
        throws ApplicationException {

        List<String> shipToCdList = w4001StgInstrDao.searchTwStgInstrByShipToSummary(loginUserDscId);
        if (shipToCdList.size() == 0) {
            return true;
        }
        // If there are multiple types of Ship to code of work
        // ワークのShip to codeが複数種類ある場合
        if (1 < shipToCdList.size()) {
            return false;
        }
        // If Ship to code different
        // Ship to codeが異なる場合
        if (!shipToCd.equals(shipToCdList.get(0))) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseWhCompanyWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd)
        throws ApplicationException {

        return commonService.validateCompWh(compCd, whCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTtPltzOnRegister(java.util.List, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegister(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4001PltzDomain> resultPltzDomainList
            = (List<W4001PltzDomain>)w4001StgInstrDao.lockTtPltzByMainMarkListNoWait(mainMarkList);

        // If palletize has been removed to others
        // パレタイズが他者に削除されている場合
        if (resultPltzDomainList.size() != mainMarkList.size()) {
            paramsList.add(null);
            return GSCM_E0_0010;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize status is "10"(palletize) other than
            // パレタイズステータスが"10"(パレタイズ)以外の場合
            if (!PLTZ_STATUS_PLTZ.equals(resultPltzDomain.getPltzStatus())) {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0062;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If last TR status is "20"(issue TR) other than
            // 搬出入ステータスが"20"(送荷書発行)の場合
            if (CARRY_OUT_IN_ISSUE_TR.equals(resultPltzDomain.getLastTrStatus())) {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0063;
        }
        
        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize instruction status is "10"(Instruction Created)-"40"(All CML Create) other than
            // 梱包指示ステータスが"10"(Instruction Created)～"40"(All CML Create)の場合
            if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED.equals(resultPltzDomain.getPltzInstrStatus())
                || PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(resultPltzDomain.getPltzInstrStatus())
                    || PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE.equals(resultPltzDomain.getPltzInstrStatus())
                        || PLTZ_INSTR_STATUS_ALL_CML_CREATE.equals(resultPltzDomain.getPltzInstrStatus())) {
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
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTtPltzOnRegisterByExpReq(java.lang.String, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegisterByExpReq(String loginUserDscId, List<String[]> paramsList)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4001PltzDomain> resultPltzDomainList
            = (List<W4001PltzDomain>)w4001StgInstrDao.searchTtPltzByExpReq(loginUserDscId);

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If there are issues of CML middle
            // CML発行途中のものがある場合
            if (!FLAG_Y.equals(resultPltzDomain.getExpRequestAllCmlIssuedFlg())) {
                paramsList.add(new String[]{ resultPltzDomain.getExpRequestNo() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0048;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // In the case of Partial shipments NG
            // 分割船積NGの場合
            if (!FLAG_Y.equals(resultPltzDomain.getCreateFlg())) {
                paramsList.add(new String[]{ resultPltzDomain.getExpRequestNo() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0021;
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTtStgInstrOnRegister(java.lang.String)
     */
    public boolean validateDatabaseTtStgInstrOnRegister(String stgInstrNo)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgInstrNo(stgInstrNo);
        // Record lock
        // 行ロック
        TtStgInstrDomain resultTtStgInstrDomain = ttStgInstrService.lockByKeyNoWait(ttStgInstrCriteriaDomain);
        // If 0 Listings
        // 0件の場合
        if (resultTtStgInstrDomain == null) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTtPltzOnRegisterWorking(java.util.List, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegisterWorking(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4001PltzDomain> resultPltzDomainList
            = (List<W4001PltzDomain>)w4001StgInstrDao.lockTtPltzByMainMarkListNoWait(mainMarkList);

        // If palletize has been removed to others
        // パレタイズが他者に削除されている場合
        if (resultPltzDomainList.size() != mainMarkList.size()) {
            paramsList.add(null);
            return GSCM_E0_0010;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize status is "20"(staging instruction) other than
            // パレタイズステータスが"20"(荷揃え指示)以外の場合
            if (!PLTZ_STATUS_STG_INSTR.equals(resultPltzDomain.getPltzStatus())) {
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
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#validateDatabaseTtPltzOnRegisterCancel(java.util.List, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegisterCancel(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索
        @SuppressWarnings("unchecked")
        List<W4001PltzDomain> resultPltzDomainList
            = (List<W4001PltzDomain>)w4001StgInstrDao.lockTtPltzByMainMarkListNoWait(mainMarkList);

        // If palletize has been removed to others
        // パレタイズが他者に削除されている場合
        if (resultPltzDomainList.size() != mainMarkList.size()) {
            paramsList.add(null);
            return GSCM_E0_0010;
        }

        // Is repeated several minutes palletize search results
        // パレタイズ検索結果数分繰り返し
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            // If palletize status is "20"(staging instruction) or "30"(staging instruction worked done) other than
            // パレタイズステータスが"20"(荷揃え指示)、"30"(荷揃え実績)以外の場合
            if (
                !PLTZ_STATUS_STG_INSTR.equals(resultPltzDomain.getPltzStatus())
                    &&  !PLTZ_STATUS_STG_INSTR_WORKED_DONE.equals(resultPltzDomain.getPltzStatus())
            )
            {
                paramsList.add(new String[]{ resultPltzDomain.getMainMark() });
            }
        }
        if (0 < paramsList.size()) {
            return NXS_E1_0062;
        }

        return null;
    }

    //--------------------------------- Search methods - search  ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return w4001StgInstrDao.searchCountForPagingOnMainSearch(stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public List<? extends W4001StgInstrDomain> searchForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return w4001StgInstrDao.searchForPagingOnMainSearch(stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException {

        return w4001StgInstrDao.searchCountForPagingOnCreateSearch(pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain)
     */
    public List<? extends W4001PltzDomain> searchForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索

        @SuppressWarnings("unchecked")
        List<W4001PltzDomain> resultPltzDomainList
            = (List<W4001PltzDomain>)w4001StgInstrDao.searchForPagingOnCreateSearch(pltzCriteriaDomain);

        // Conversion to a shipper unit
        // Shipper単位への換算

        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(pltzCriteriaDomain.getShipperCd());

        // Weight unit conversion
        // 重量単位換算
        covertWeightUnitPltzList(resultPltzDomainList,
            vtCompMeasureUnitDomain.getWeightUnit(), false, pltzCriteriaDomain.getLocale());
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            resultPltzDomain.setWeightUnitDisp(vtCompMeasureUnitDomain.getWeightUnitDisp());
        }
        // Volume unit conversion
        // 容積単位換算
        covertVolumeUnitPltzList(resultPltzDomainList,
            vtCompMeasureUnitDomain.getVolumeUnit(), false, pltzCriteriaDomain.getLocale());
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {
            resultPltzDomain.setVolumeUnitDisp(vtCompMeasureUnitDomain.getVolumeUnitDisp());
        }

        return resultPltzDomainList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchCountOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public int searchCountOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return w4001StgInstrDao.searchCountOnRegisterInitByFromMain(stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索

        W4001StgInstrDomain resultStgInstrDomain
            = w4001StgInstrDao.searchOnRegisterInitByFromMain(stgInstrCriteriaDomain);
        // If 0 Listings (others deleted)
        // 0件の場合（他者削除）
        if (resultStgInstrDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Conversion to a shipper unit
        // Shipper単位への換算

        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(resultStgInstrDomain.getShipperCd());

        // Conversion to a shipper unit - header
        // Shipper単位への換算 - ヘッダ
        covertWeightUnitStgInstr(resultStgInstrDomain,
            vtCompMeasureUnitDomain.getWeightUnit(), stgInstrCriteriaDomain.getLocale());
        resultStgInstrDomain.setWeightUnitDisp(vtCompMeasureUnitDomain.getWeightUnitDisp());
        covertVolumeUnitStgInstr(resultStgInstrDomain,
            vtCompMeasureUnitDomain.getVolumeUnit(), stgInstrCriteriaDomain.getLocale());
        resultStgInstrDomain.setVolumeUnitDisp(vtCompMeasureUnitDomain.getVolumeUnitDisp());

        // Conversion to a shipper unit - detail
        // Shipper単位への換算 - 明細
        covertWeightUnitPltzList(resultStgInstrDomain.getPltzDomainList(),
            vtCompMeasureUnitDomain.getWeightUnit(), false, stgInstrCriteriaDomain.getLocale());
        covertVolumeUnitPltzList(resultStgInstrDomain.getPltzDomainList(),
            vtCompMeasureUnitDomain.getVolumeUnit(), false, stgInstrCriteriaDomain.getLocale());

        return resultStgInstrDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromCreate(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        // Search palletize
        // パレタイズ検索

        List<? extends W4001PltzDomain> resultPltzDomainList
            = w4001StgInstrDao.searchOnRegisterInitByFromCreate(stgInstrCriteriaDomain);
        // If 0 Listings (others deleted)
        // 0件の場合（他者削除）
        if (resultPltzDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Add a header in the search results
        // 検索結果にヘッダを付加
        W4001StgInstrDomain resultStgInstrDomain = new W4001StgInstrDomain();
        // BL domain -> BL domain transfer
        // BLドメイン→BLドメイン移送
        CommonUtil.copyPropertiesDomainToDomain(resultStgInstrDomain, stgInstrCriteriaDomain);
        resultStgInstrDomain.setPkgQty(resultPltzDomainList.size());
        resultStgInstrDomain.setPltzDomainList(resultPltzDomainList);

        // Conversion to a shipper unit
        // Shipper単位への換算

        VtCompMeasureUnitDomain vtCompMeasureUnitDomain
            = commonService.searchMeasureUnit(resultStgInstrDomain.getShipperCd());

        // Conversion to a shipper unit - header
        // Shipper単位への換算 - ヘッダ

        // Palletize unit G / W Search
        // パレタイズ単位G/W検索
        List<? extends W4001PltzDomain> resultWeightSummaryPltzDomainList
            = w4001StgInstrDao.searchOnRegisterInitByWeightSummary(stgInstrCriteriaDomain.getLoginUserDscId());
        // Weight unit conversion
        // 重量単位換算
        BigDecimal totalGrossWeight = covertWeightUnitPltzList(resultWeightSummaryPltzDomainList,
            vtCompMeasureUnitDomain.getWeightUnit(), true, stgInstrCriteriaDomain.getLocale());
        resultStgInstrDomain.setGrossWeight(totalGrossWeight);
        resultStgInstrDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
        resultStgInstrDomain.setWeightUnitDisp(vtCompMeasureUnitDomain.getWeightUnitDisp());

        // Palletize unit Volume Search
        // パレタイズ単位Volume検索
        List<? extends W4001PltzDomain> resultVolumeSummaryPltzDomainList
            = w4001StgInstrDao.searchOnRegisterInitByVolumeSummary(stgInstrCriteriaDomain.getLoginUserDscId());
        // Volume unit conversion
        // 容積単位換算
        BigDecimal totalVolume = covertVolumeUnitPltzList(resultVolumeSummaryPltzDomainList,
            vtCompMeasureUnitDomain.getVolumeUnit(), true, stgInstrCriteriaDomain.getLocale());
        resultStgInstrDomain.setVolume(totalVolume);
        resultStgInstrDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnit());
        resultStgInstrDomain.setVolumeUnitDisp(vtCompMeasureUnitDomain.getVolumeUnitDisp());

        // Conversion to a shipper unit - detail
        // Shipper単位への換算 - 明細

        // Weight unit conversion
        // 重量単位換算
        covertWeightUnitPltzList(resultStgInstrDomain.getPltzDomainList(),
            vtCompMeasureUnitDomain.getWeightUnit(), false, stgInstrCriteriaDomain.getLocale());
        // Volume unit conversion
        // 容積単位換算
        covertVolumeUnitPltzList(resultStgInstrDomain.getPltzDomainList(),
            vtCompMeasureUnitDomain.getVolumeUnit(), false, stgInstrCriteriaDomain.getLocale());

        return resultStgInstrDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#printStgInstr(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public File printStgInstr(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        // BL domain -> document domain transfer
        // BLドメイン→帳票ドメイン移送
        L4001ReportDomain l4001ReportCriteriaDomain = new L4001ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l4001ReportCriteriaDomain, stgInstrCriteriaDomain);
        // 検索
        File file = l4001ReportService.searchTtStgInstr(l4001ReportCriteriaDomain);

        return file;
    }


    //--------------------------------- Registration method - create  ----------------------------------
    //--------------------------------- 登録系メソッド create ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#createOnCreateUpdate(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public void createOnCreateUpdate(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        List<TwStgInstrDomain> twStgInstrDomainList = new ArrayList<TwStgInstrDomain>();
        for (W4001PltzDomain pltzDomain : stgInstrDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TwStgInstrDomain twStgInstrDomain = new TwStgInstrDomain();
            CommonUtil.copyPropertiesDomainToDomain(twStgInstrDomain, pltzDomain);
            twStgInstrDomain.setDscId(stgInstrDomain.getLoginUserDscId());
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(twStgInstrDomain, SCREEN_ID_W4003);

            twStgInstrDomainList.add(twStgInstrDomain);
        }
        // Registration to work
        // ワークへ登録
        twStgInstrService.create(twStgInstrDomainList);
    }

    //--------------------------------- Update method - update  ----------------------------------
    //--------------------------------- 更新系メソッド update ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#updateOnRegisterWorking(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public int updateOnRegisterWorking(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        int updateCount = 0;

        // Time zone conversion date of Shipper
        // Shipperのタイムゾーン変換日付
        Date localDate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(stgInstrDomain.getShipperCd()));

        // Update staging instruction
        // 荷揃え指示の更新

        // SACT domain transfer
        // SACTドメイン移送
        TtStgInstrDomain ttStgInstrDomain = new TtStgInstrDomain();
        ttStgInstrDomain.setStgInstrNo(stgInstrDomain.getStgInstrNo());
        ttStgInstrDomain.setStgInstrStatus(STG_INSTR_STATUS_WORKED_DONE);
        // To be in effect here if you need to register by removing the time information. 
        // I registered in time with information in the current specification.
        // 時刻情報を削除して登録する必要がある場合はこちらを有効にすること。
        // 現仕様では時刻情報付きでの登録とする。
        //ttStgInstrDomain.setWorkedDt(DateUtils.truncate(localDate, Calendar.DATE));
        ttStgInstrDomain.setWorkedDt(localDate);
        ttStgInstrDomain.setWorkedId(stgInstrDomain.getWorkedId());
        ttStgInstrDomain.setWorkedIssuerNm(stgInstrDomain.getWorkedIssuerNm());
        ttStgInstrDomain.setWorkedMethTyp(WORKED_METH_TYP_INSTR);
        ttStgInstrDomain.setComUpdateTimestamp(stgInstrDomain.getComUpdateTimestamp());
        // Setting a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(ttStgInstrDomain, SCREEN_ID_W4004);
        // update
        // 更新
        updateCount += ttStgInstrService.update(ttStgInstrDomain);

        // Update palletize
        // パレタイズスの更新

        List<TtPltzDomain> ttPltzDomainList = new ArrayList<TtPltzDomain>();
        for (W4001PltzDomain w4001PltzDomain : stgInstrDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setMainMark(w4001PltzDomain.getMainMark());
            ttPltzDomain.setPltzStatus(PLTZ_STATUS_STG_INSTR_WORKED_DONE);
            ttPltzDomain.setComUpdateTimestamp(w4001PltzDomain.getComUpdateTimestamp());
            ttPltzDomainList.add(ttPltzDomain);
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzDomain, SCREEN_ID_W4004);
        }
        // update
        // 更新
        updateCount += ttPltzService.update(ttPltzDomainList);

        return updateCount;
    }

    //--------------------------------- Delete method - delete ----------------------------------
    //--------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public int deleteOnHeaderInit(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        // SACT domain transfer
        // SACTドメイン移送
        TwStgInstrCriteriaDomain twStgInstrCriteriaDomain = new TwStgInstrCriteriaDomain();
        twStgInstrCriteriaDomain.setDscId(stgInstrDomain.getLoginUserDscId());
        twStgInstrCriteriaDomain.setSearchCountCheckFlg(false);
        // If the information in the staging instruction work there
        // 荷揃え指示ワークの情報が存在する場合
        if (0 < twStgInstrService.searchCount(twStgInstrCriteriaDomain)) {
            // Delete information staging instruction work
            // 荷揃え指示ワークの情報削除
            return twStgInstrService.deleteByCondition(twStgInstrCriteriaDomain);
        }

        return 0;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#deleteOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public int deleteOnRegisterDelete(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        int deleteCount = 0;

        for (W4001PltzDomain pltzDomain : stgInstrDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TwStgInstrCriteriaDomain twStgInstrCriteriaDomain = new TwStgInstrCriteriaDomain();
            twStgInstrCriteriaDomain.setDscId(stgInstrDomain.getLoginUserDscId());
            twStgInstrCriteriaDomain.setMainMark(pltzDomain.getMainMark());
            // Removed from the work
            // ワークから削除
            deleteCount += twStgInstrService.deleteByCondition(twStgInstrCriteriaDomain);
        }

        return deleteCount;
    }

    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public String transactOnRegister(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        // Time zone conversion date of Shipper
        // Shipperのタイムゾーン変換日付
        Date localDate
            = DateUtil.convertTime(new Date(), commonService.searchTimezone(stgInstrDomain.getShipperCd()));

        // Numbering of staging instruction No.
        // 荷揃え指示No.の採番

        // Creating numbering key
        // 採番キーの作成
        // MGT-No.566 MOD START
        // 2016/12/31 -> SI6Z31
        final String[] monthChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "Y", "Z" };
        String monthChar = monthChars[Integer.valueOf(new SimpleDateFormat("MM").format(localDate)) - 1];
        String stgInstrNoSeqKey = stgInstrDomain.getWhCompCd() + "SI"
            + new SimpleDateFormat("yy'" + monthChar + "'dd").format(localDate).substring(1);
        // MGT-No.566 MOD END

        // Get staging instruction No.
        // 荷揃え指示No.の取得
        String stgInstrNo = stgInstrNoSeqKey
            + commonService.transactSequence(stgInstrNoSeqKey, SEQ_TYP_STG_INSTR_NO, 1, SCREEN_ID_W4004).get(0);

        // Registration of staging instruction
        // 荷揃え指示の登録

        // SACT domain transfer
        // SACTドメイン移送
        TtStgInstrDomain ttStgInstrDomain = new TtStgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(ttStgInstrDomain, stgInstrDomain);
        ttStgInstrDomain.setStgInstrNo(stgInstrNo);
        ttStgInstrDomain.setStgInstrStatus(STG_INSTR_STATUS_ISSUE_LIST);
        // To be in effect here if you need to register by removing the time information. 
        // I registered in time with information in the current specification.
        // 時刻情報を削除して登録する必要がある場合はこちらを有効にすること。
        // 現仕様では時刻情報付きでの登録とする。
        //ttStgInstrDomain.setStgInstrDt(DateUtils.truncate(localDate, Calendar.DATE));
        ttStgInstrDomain.setStgInstrDt(localDate);
        // Setting a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttStgInstrDomain, SCREEN_ID_W4004);
        // register
        // 登録
        ttStgInstrService.create(ttStgInstrDomain);

        // Delete staging instruction work
        // 荷揃え指示ワークの削除

        // SACT domain transfer
        // SACTドメイン移送
        TwStgInstrCriteriaDomain twStgInstrCriteriaDomain = new TwStgInstrCriteriaDomain();
        twStgInstrCriteriaDomain.setDscId(stgInstrDomain.getLoginUserDscId());
        // delete
        // 削除
        twStgInstrService.deleteByCondition(twStgInstrCriteriaDomain);

        // Update palletize
        // パレタイズの更新

        List<TtPltzDomain> ttPltzDomainList = new ArrayList<TtPltzDomain>();
        for (W4001PltzDomain w4001PltzDomain : stgInstrDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setMainMark(w4001PltzDomain.getMainMark());
            ttPltzDomain.setPltzStatus(PLTZ_STATUS_STG_INSTR);
            ttPltzDomain.setStgInstrNo(stgInstrNo);
            ttPltzDomain.setComUpdateTimestamp(w4001PltzDomain.getComUpdateTimestamp());
            ttPltzDomainList.add(ttPltzDomain);
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzDomain, SCREEN_ID_W4004);
        }
        // update
        // 更新
        ttPltzService.update(ttPltzDomainList);

        return stgInstrNo;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W4001StgInstrService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    public int transactOnRegisterCancel(W4001StgInstrDomain stgInstrDomain)
        throws ApplicationException {

        int transactCount = 0;

        // Delete staging instruction
        // 荷揃え指示の削除

        // SACT domain transfer
        // SACTドメイン移送
        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgInstrNo(stgInstrDomain.getStgInstrNo());
        ttStgInstrCriteriaDomain.setComUpdateTimestamp(stgInstrDomain.getComUpdateTimestamp());
        // delte
        // 削除
        transactCount += ttStgInstrService.delete(ttStgInstrCriteriaDomain);

        // Update palletize
        // パレタイズの更新

        List<TtPltzDomain> ttPltzDomainList = new ArrayList<TtPltzDomain>();
        for (W4001PltzDomain w4001PltzDomain : stgInstrDomain.getPltzDomainList()) {
            // SACT domain transfer
            // SACTドメイン移送
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setMainMark(w4001PltzDomain.getMainMark());
            ttPltzDomain.setPltzStatus(PLTZ_STATUS_PLTZ);
            ttPltzDomain.setStgInstrNo("");
            ttPltzDomain.setComUpdateTimestamp(w4001PltzDomain.getComUpdateTimestamp());
            ttPltzDomainList.add(ttPltzDomain);
            // Setting a common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(ttPltzDomain, SCREEN_ID_W4004);
        }
        // update
        // 更新
        transactCount += ttPltzService.update(ttPltzDomainList);

        return transactCount;
    }

    //--------------------------------- Below, protected method ----------------------------------
    //--------------------------------- 以下、protected メソッド ----------------------------------

    /**
     * Make the weight unit conversion to the target staging instruction domain
     * <br />荷揃え指示ドメインを対象に重量単位換算を行います。
     *
     * @param stgInstrDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertWeightUnitStgInstr(W4001StgInstrDomain stgInstrDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal weight = stgInstrDomain.getGrossWeight();
        // If the weight of the unit staging instruction is different from the unit specified
        // 荷揃え指示の重量単位が指定の単位と異なる場合
        if (!dstUnit.equals(stgInstrDomain.getWeightUnit())) {
            weight = commonService.convertWeightUnit(weight, stgInstrDomain.getWeightUnit(), dstUnit);
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
        stgInstrDomain.setGrossWeight(weight.setScale(MAX_SCALE_WEIGHT_UNIT, RoundingMode.UP));
        stgInstrDomain.setWeightUnit(dstUnit);
    }

    /**
     * Make the volume unit conversion to the target staging instruction domain
     * <br />荷揃え指示ドメインを対象に容積単位換算を行います。
     *
     * @param stgInstrDomain Updated domain
     * @param dstUnit Unit after conversion
     * @param locale Locale
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected void covertVolumeUnitStgInstr(W4001StgInstrDomain stgInstrDomain, String dstUnit, Locale locale)
        throws ApplicationException {

        BigDecimal volume = stgInstrDomain.getVolume();
        // If the volume of the unit staging instruction is different from the unit specified
        // 荷揃え指示の容積単位が指定の単位と異なる場合
        if (!dstUnit.equals(stgInstrDomain.getVolumeUnit())) {
            volume = commonService.convertVolumeUnit(volume, stgInstrDomain.getVolumeUnit(), dstUnit);
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
        stgInstrDomain.setVolume(volume.setScale(MAX_SCALE_VOLUME_UNIT, RoundingMode.UP));
        stgInstrDomain.setVolumeUnit(dstUnit);
    }

    /**
     * Make the weight unit conversion to target a list of staging instruction domain
     * <br />荷揃え指示ドメインのリストを対象に重量単位換算を行います。
     *
     * @param pltzDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param isForTotal true if the total calculation. If false otherwise
     * @param locale Locale
     * @return Total weight after conversion
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected BigDecimal covertWeightUnitPltzList(List<? extends W4001PltzDomain> pltzDomainList, String dstUnit,
        boolean isForTotal, Locale locale) throws ApplicationException {

        String label = "label.grossWeight";
        if (isForTotal) {
            label = "label.totalGrossWeight";
        }

        BigDecimal totalWeight = BigDecimal.ZERO;
        for (W4001PltzDomain pltzDomain : pltzDomainList) {
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
     * <br />荷揃え指示ドメインのリストを対象に容積単位換算を行います。
     *
     * @param pltzDomainList Updated domain list
     * @param dstUnit Unit after conversion
     * @param isForTotal true if the total calculation. If false otherwise
     * @param locale Locale
     * @return Total volume after conversion
     * @throws ApplicationException If Measure Unit Master can not browse
     */
    protected BigDecimal covertVolumeUnitPltzList(List<? extends W4001PltzDomain> pltzDomainList, String dstUnit,
        boolean isForTotal, Locale locale) throws ApplicationException {

        String label = "label.volume";
        if (isForTotal) {
            label = "label.totalVolume";
        }

        BigDecimal totalVolume = BigDecimal.ZERO;
        for (W4001PltzDomain pltzDomain : pltzDomainList) {
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
}
