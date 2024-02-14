/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_C;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_L;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TYMING_TYP_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TYMING_TYP_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TYMING_TYP_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_ACCTIVE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_LOADING_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_WORKED_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_ISSUE_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtPltzStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtTrnsTypStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtXpltzStgActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgActService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.auto.business.service.VtPltzStgInstrService;
import com.globaldenso.eca0027.core.auto.business.service.VtTrnsTypStgActService;
import com.globaldenso.eca0027.core.auto.business.service.VtXpltzStgActService;
import com.globaldenso.eca0027.core.business.dao.WsBhtStgDao;
import com.globaldenso.eca0027.core.business.domain.ECA0027_WS_4501Domain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.L4002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4502UpdateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4502WsUpdateStgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4503CreateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4503MainMarkDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4504ProcessFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByMainMarkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtXpltzByXMainMarkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4503CreateFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4504ProcessFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.service.L4002ReportService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;


/**
 * <p>
 * Implement Class of Service(W4)
 * Ws4サービス実装クラス
 * </p>
 * 
 * @version 1.00
 */
public class WsBhtStgServiceImpl implements WsBhtStgService {
    /**
     * <p>
     * Field of wsBhtStgDao
     * 
     * wsBhtStgDaoのフィールド。
     * </p>
     */
    private WsBhtStgDao wsBhtStgDao;

    /**
     * <p>
     * Field of TtStgInstrService
     * 
     * TtStgInstrServiceフィールド
     * </p>
     */
    private TtStgInstrService ttStgInstrService;

    /**
     * <p>
     * Field of TtPltzService
     * 
     * TtPltzServiceフィールド
     * </p>
     */
    private TtPltzService ttPltzService;
    /**
     * <p>
     * Field of TtStgActService
     * 
     * TtStgActServiceフィールド
     * </p>
     */
    private TtStgActService ttStgActService;
    /**
     * Field of CommonService
     * 
     * CommonServiceのフィールドです
     */
    private CommonService commonService;

    /**
     * Field of VmUserInfoService
     * 
     * VmUserInfoServiceのフィールドです
     */
    private VmUserInfoService vmUserInfoService;

    /**
     * Field of vtTrnsTypStgActService
     * 
     * vtTrnsTypStgActServiceのフィールドです
     */
    private VtTrnsTypStgActService vtTrnsTypStgActService;

    /**Field of vtXpltzStgActService
     * 
     * vtXpltzStgActServiceのフィールドです
     */
    private VtXpltzStgActService vtXpltzStgActService;

    /**
     * Field of TmPrinterService
     * 
     * TmPrinterServiceフィールドです
     */
    private TmPrinterService tmPrinterService;

    /**
     * Field of VtPltzStgInstrService
     * 
     * VtPltzStgInstrServiceのフィールドです
     */
    private VtPltzStgInstrService vtPltzStgInstrService;

    /**
     * Field of L4002ReportService
     * 
     * L4002ReportServiceのフィールドです
     */
    private L4002ReportService l4002ReportService;
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタ
     * </p>
     */
    WsBhtStgServiceImpl() {
    }
    
    /**
     * <p>
     * Setter method for TtStgInstrService
     * </p>
     * 
     * @param ttStgInstrService Set for TtStgInstrService
     */
    public void setTtStgInstrService(TtStgInstrService ttStgInstrService) {
        this.ttStgInstrService = ttStgInstrService;
    }

    /**
     * <p>
     * Setter method for TtPltzService
     * </p>
     * 
     * @param ttPltzService Set for TtPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * <p>
     * Setter method for VmUserInfoService
     * </p>
     * 
     * @param vmUserInfoService Set for VmUserInfoService
     */
    public void setVmUserInfoService(VmUserInfoService vmUserInfoService) {
        this.vmUserInfoService = vmUserInfoService;
    }

    /**
     * <p>
     * Setter method for VtPltzStgInstrService
     * </p>
     * 
     * @param vtPltzStgInstrService Set for VtPltzStgInstrService
     */
    public void setVtPltzStgInstrService(VtPltzStgInstrService vtPltzStgInstrService) {
        this.vtPltzStgInstrService = vtPltzStgInstrService;
    }

    /**
     * <p>
     * Setter method for CommonService
     * </p>
     * 
     * @param commonService Set for CommonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>
     * Setter method for VtTrnsTypStgActService
     * </p>
     * 
     * @param vtTrnsTypStgActService Set for VtTrnsTypStgActService
     */
    public void setVtTrnsTypStgActService(VtTrnsTypStgActService vtTrnsTypStgActService) {
        this.vtTrnsTypStgActService = vtTrnsTypStgActService;
    }

    /**
     * <p>
     * Setter method for VtXpltzStgActService
     * </p>
     * 
     * @param vtXpltzStgActService Set for VtXpltzStgActService
     */
    public void setVtXpltzStgActService(VtXpltzStgActService vtXpltzStgActService) {
        this.vtXpltzStgActService = vtXpltzStgActService;
    }

    /**
     * <p>
     * Setter method for CommonService
     * </p>
     * 
     * @param tmPrinterService Set for CommonService
     */
    public void setTmPrinterService(TmPrinterService tmPrinterService) {
        this.tmPrinterService = tmPrinterService;
    }

    /**
     * <p>
     * Setter method for WsBhtStgDao
     * </p>
     * 
     * @param wsBhtStgDao Set for WsBhtStgDao
     */
    public void setWsBhtStgDao(WsBhtStgDao wsBhtStgDao) {
        this.wsBhtStgDao = wsBhtStgDao;
    }

    /**
     * <p>
     * Setter method for L4002ReportService
     * </p>
     * 
     * @param reportService Set for L4002ReportService
     */
    public void setL4002ReportService(L4002ReportService reportService) {
        l4002ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for TtStgActService
     * </p>
     * 
     * @param ttStgActService Set for TtstgActService
     */
    public void setTtStgActService(TtStgActService ttStgActService) {
        this.ttStgActService = ttStgActService;
    }

    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#validateDatabaseTtStgInstrOnStgInstr(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain)
     */
    public TtStgInstrDomain validateDatabaseTtStgInstrOnStgInstr(
        TtStgInstrCriteriaDomain inputDomain) throws ApplicationException {
        return ttStgInstrService.lockByKeyNoWait(inputDomain);
    }


    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#searchStgInstr(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain)
     */
    public List<ECA0027_WS_4501Domain> searchStgInstr(
        WS4501TtStgInstrByStgInstrNoCriteriaDomain inputDomain) throws ApplicationException {
        return wsBhtStgDao.searchTtStgInstrByCondition(inputDomain);
    }

    // ws4502
    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#validateDatabaseTtPltzOnStgInstr(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain)
     */
    public List<ECA0027_WS_4501Domain> validateDatabaseTtPltzOnStgInstr(
        WS4501TtPltzByConditionCriteriaDomain inputDomain) throws ApplicationException {

        return wsBhtStgDao.lockTtPltzByConditionNoWait(inputDomain);
    }

    // ws4502
    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#updateStgInstr(com.globaldenso.eca0027.core.business.domain.Ws4502WsUpdateStgInstrDomain)
     */
    public Ws4502UpdateFacadeServiceResultDomain updateStgInstr(Ws4502WsUpdateStgInstrDomain inputDomain)
        throws ApplicationException {
        // User Information Get Condition Domain ユーザー情報取得条件ドメイン
        VmUserInfoCriteriaDomain userInputInfo = new VmUserInfoCriteriaDomain();
        // User Information Get Domain ユーザー情報取得用ドメイン
        List<VmUserInfoDomain> userResultInfo = new ArrayList<VmUserInfoDomain>();
        // Staging Information Update Domain 荷揃え情報更新用ドメイン
        TtStgInstrDomain criteriaInstr = new TtStgInstrDomain();
        // Palletize Information Domain パレタイズ情報更新用ドメイン
        List<TtPltzDomain> criteriaPltz = new ArrayList<TtPltzDomain>();
        // Error Message List エラーメッセージ格納用ドメインリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        // Staging Information Update Domain 荷揃え指示情報のロック結果格納用ドメイン
        TtStgInstrDomain resultLockInstr = new TtStgInstrDomain();
        // Staging Information Lock Condition Domain 荷揃え指示情報のロック 検索条件格納用ドメイン
        TtStgInstrCriteriaDomain criteriaLockInstr = new TtStgInstrCriteriaDomain();
        // Palletize Lock Result Domain パレタイズ情報のロック結果格納用ドメイン
        List<ECA0027_WS_4501Domain> resultLockPltz = new ArrayList<ECA0027_WS_4501Domain>();
        // Palletize Lock Condition Domain パレタイズ情報のロック検索条件格納用ドメイン
        WS4501TtPltzByConditionCriteriaDomain criteriaLockPltz = new WS4501TtPltzByConditionCriteriaDomain();
        Ws4502UpdateFacadeServiceResultDomain resultDomain = null;
        
        // Get User Information  ユーザ情報取得
        userInputInfo.setDscId(inputDomain.getWorkedId());
        userResultInfo = vmUserInfoService.searchByCondition(userInputInfo);
        // Check Get User Information ユーザ情報取得判定
        if(userResultInfo != null || userResultInfo.size() > 0){
            // Lock Staging Instruction Information 荷揃え指示情報のロック
            criteriaLockInstr.setStgInstrNo(inputDomain.getStgInstrNo());
            resultLockInstr = validateDatabaseTtStgInstrOnStgInstr(criteriaLockInstr);
            // Lock Palletize パレタイズ情報のロック
            criteriaLockPltz.setStgInstrNo(inputDomain.getStgInstrNo());
            resultLockPltz = validateDatabaseTtPltzOnStgInstr(criteriaLockPltz);
            // Confirm Staging Instruction Status of Staging Instruction Table is 10(Issue List) 荷揃え指示ステータスが'10'(Issue List)以外の場合
            if (!resultLockInstr.getStgInstrStatus().equals(STG_INSTR_STATUS_ISSUE_LIST)) {
                errorList.addAll(getErrorList(NXS_E1_5011, inputDomain.getStgInstrNo()));
            }
            // Confirm Palletize Status of Palletize Table is 20(Staging Instruction) パレタイズステータスが'20'(荷揃え指示)以外の場合
            for (int i = 0; i < resultLockPltz.size(); i++){
                if (!resultLockPltz.get(i).getPltzStatus().equals(STG_INSTR_STATUS_WORKED_DONE)) {
                    errorList.addAll(getErrorList(NXS_E1_5029, resultLockPltz.get(i).getMainMark()));
                }
            }
            // In Case Error 1 or more Errors エラーが1件以上ある場合
            if (errorList.size() > 0) {
                resultDomain = new Ws4502UpdateFacadeServiceResultDomain(WS_RESULT_ERROR, errorList);
            }
            else{
                resultDomain = new Ws4502UpdateFacadeServiceResultDomain(WS_RESULT_SUCCESS);
                String timeZoneId = userResultInfo.get(0).getTimezoneId();
                Date workedDate = DateUtil.convertTime(new Date(), timeZoneId);
                criteriaInstr.setStgInstrStatus(inputDomain.getStgInstrStatus());
                criteriaInstr.setWorkedDt(workedDate);
                criteriaInstr.setWorkedMethTyp(inputDomain.getWorkedMethTyp());
                criteriaInstr.setWorkedId(inputDomain.getWorkedId());
                criteriaInstr.setWorkedIssuerNm(userResultInfo.get(0).getUsrNmEn());
                criteriaInstr.setStgInstrNo(inputDomain.getStgInstrNo());
                criteriaInstr.setComUpdateUserId(inputDomain.getDscId());
                criteriaInstr.setComUpdateFuncId(inputDomain.getScreenId());
                criteriaInstr.setComUpdateTimestamp(resultLockInstr.getComUpdateTimestamp());
                
                // Update Staging Information 荷揃え情報更新
                ttStgInstrService.update(criteriaInstr);
                // Creating  Palletize Update Domain パレタイズ更新ドメインの作成
                for(int i = 0; i < resultLockPltz.size(); i++){
                    TtPltzDomain setDomain = new TtPltzDomain();
                    setDomain.setMainMark(resultLockPltz.get(i).getMainMark());
                    setDomain.setPltzStatus(inputDomain.getPltzStatus());
                    setDomain.setComUpdateUserId(inputDomain.getDscId());
                    setDomain.setComUpdateFuncId(inputDomain.getScreenId());
                    setDomain.setComUpdateTimestamp(resultLockPltz.get(i).getComUpdateTimestamp());
                    criteriaPltz.add(setDomain);
                }
                // Update Palletize パレタイズ更新
                ttPltzService.update(criteriaPltz);
            }
        }
        return resultDomain;
    }

    // Ws4503
    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#createStgAct(com.globaldenso.eca0027.core.business.domain.criteria.Ws4503CreateFacadeServiceInputDomain)
     */
    public Ws4503CreateFacadeServiceResultDomain createStgAct(
        Ws4503CreateFacadeServiceInputDomain inputDomain) throws ApplicationException {
        // Result Domain 結果用ドメイン
        Ws4503CreateFacadeServiceResultDomain resultDomain = null;
        // Result Code 結果コード
        String resultCd = WS_RESULT_SUCCESS;
        // Main Mark List(for Registration) メインマークリスト(登録用)
        List<Ws4503MainMarkDomain> mainMarkList = new ArrayList<Ws4503MainMarkDomain>();
        // Staging Instruction No. List 荷揃指示Noリスト
        List<String> stgInstrNoList = new ArrayList<String>();
        // PKG Quantity PKG数量
        BigDecimal pkg = new BigDecimal("0");
        // Staging Actuality No. 山作り実績NO
        String stgActNo = "";
        // Danger Item Flag 危険品フラグ
        String dengerItemFlg = FLAG_N;
        //format of timeStamp 日付フォーマット
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        BigDecimal weightPerA = new BigDecimal("0");
        BigDecimal weightPerB = new BigDecimal("0");
        BigDecimal weightPerC = new BigDecimal("0");
        BigDecimal weightPerD = new BigDecimal("0");
        BigDecimal loadingRatio = new BigDecimal("0");
        // Pattern of First Character Judgement of Main Mark メインマーク先頭文字判定パターン
        Pattern Xptrn = Pattern.compile("^X");

        // Get User Information  ユーザ情報取得
        VmUserInfoCriteriaDomain VmUserInfoinputDomain = new VmUserInfoCriteriaDomain();
        VmUserInfoinputDomain.setDscId(inputDomain.getDscId());
        List<VmUserInfoDomain> VmUserInfoList = vmUserInfoService
        .searchByCondition(VmUserInfoinputDomain);
        // Check Get User Information ユーザ情報取得判定
        if (VmUserInfoList == null || VmUserInfoList.size() == 0 ) {
            resultCd = WS_RESULT_ERROR;
            errorList.addAll(getErrorList("NXS_E1_5031", inputDomain.getDscId()));
        } else {
            String weightUnit = VmUserInfoList.get(0).getWeightUnit();
            String volumeUnit = VmUserInfoList.get(0).getVolumeUnit();
            String usrNmEn = VmUserInfoList.get(0).getUsrNmEn();
            String timeZoneId = VmUserInfoList.get(0).getTimezoneId();
            Date stgActDate = DateUtil.convertTime(new Date(), timeZoneId);

            // Beginning of Main Mark loop メインマークループはじめ
            for (int i = 0; i < inputDomain.getMainMark().size(); i++ ) {
                // Staging Instruction No. List Add Flag 荷揃え指示Noリスト追加フラグ
                int inInstrflg = 0;
                // For Judgement of Custom Timing Type 通関タイミング区分判定用
                String tmpCusutomTimingType = "";
                // Main Mark Flag メインマークフラグ
                String mainMarkFlg = "";
                // First Character of Main Mark is 'S' or 'D' メインマーク一文字目判定SまたはD
                String tmpMainMark = inputDomain.getMainMark().get(i);
                // First Character of Main Mark is 'X' メインマーク一文字目判定X
                if (Xptrn.matcher(tmpMainMark).find()) {
                    mainMarkFlg = "X";
                    VtXpltzStgActCriteriaDomain vtXpltzStgActInputDomain = new VtXpltzStgActCriteriaDomain();
                    vtXpltzStgActInputDomain.setXmainMark(tmpMainMark);
                    List<VtXpltzStgActDomain> xMainMarkList = vtXpltzStgActService
                    .searchByCondition(vtXpltzStgActInputDomain);

                    // In case of 0, Set Message 0件の場合メッセージセット
                    if (xMainMarkList == null || xMainMarkList.size() == 0) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5002", vtXpltzStgActInputDomain.getXmainMark()));
                        continue;
                    } else {
                        int maxPS = 0;

                        for (int l = 0; l < xMainMarkList.size(); l++ ) {
                            if (maxPS < Integer.valueOf(xMainMarkList.get(l).getPltzStatus())) {
                                maxPS = Integer.valueOf(xMainMarkList.get(l).getPltzStatus());
                            }
                        }
                        Ws4503MainMarkDomain setXMainMark = new Ws4503MainMarkDomain();
                        setXMainMark.setMainMark(xMainMarkList.get(0).getXmainMark());
                        setXMainMark.setTrnsCd(xMainMarkList.get(0).getTrnsCd());
                        setXMainMark.setContainerSortingKey(xMainMarkList.get(0)
                            .getContainerSortingKey());
                        setXMainMark.setContainerLooseTyp(xMainMarkList.get(0)
                            .getContainerLooseTyp());
                        setXMainMark.setInstrFlg(FLAG_N);
                        setXMainMark.setPltzStatus(String.valueOf(maxPS));
                        setXMainMark.setCurWhCompCd(xMainMarkList.get(0).getCurWhCompCd());
                        setXMainMark.setCurWhCd(xMainMarkList.get(0).getCurWhCd());
                        setXMainMark.setDngrItemFlg(xMainMarkList.get(0).getDngrItemFlg());
                        setXMainMark.setComUpdateTimestamp(xMainMarkList.get(0).getComUpdateTimestamp());  
                        mainMarkList.add(setXMainMark);
                    }
                } else {
                    mainMarkFlg = "S";
                    // Palletize Check パレタイズチェック
                    TtPltzCriteriaDomain inputTtpltz = new TtPltzCriteriaDomain();
                    inputTtpltz.setMainMark(tmpMainMark);
                    TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(inputTtpltz);

                    if (ttPltzDomain == null || ttPltzDomain.getMainMark() == null) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5001", inputTtpltz.getMainMark()));
                        continue;
                    }

                    else if (ttPltzDomain.getXmainMark() != null) {
                        continue;
                    }

                    // Add Main Mark List メインマークリスト追加
                    tmpCusutomTimingType = ttPltzDomain.getCustomTimingTyp();
                    Ws4503MainMarkDomain setMainMark = new Ws4503MainMarkDomain();
                    setMainMark.setMainMark(ttPltzDomain.getMainMark());
                    setMainMark.setTrnsCd(ttPltzDomain.getTrnsCd());
                    setMainMark.setContainerSortingKey(ttPltzDomain.getContainerSortingKey());
                    setMainMark.setContainerLooseTyp(ttPltzDomain.getContainerLooseTyp());
                    setMainMark.setInstrFlg(ttPltzDomain.getStgInstrItemFlg());
                    setMainMark.setPltzStatus(ttPltzDomain.getPltzStatus());
                    setMainMark.setCurWhCompCd(ttPltzDomain.getCurWhCompCd());
                    setMainMark.setCurWhCd(ttPltzDomain.getCurWhCd());
                    setMainMark.setDngrItemFlg(ttPltzDomain.getDngrItemFlg());
                    setMainMark.setLastTrStatus(ttPltzDomain.getLastTrStatus());
                    setMainMark.setComUpdateTimestamp(ttPltzDomain.getComUpdateTimestamp());
                    mainMarkList.add(setMainMark);
                    // Add Staging Instruction No. List 荷揃え指示NOリスト追加
                    // --- 2014/09/29 荷揃え指示NoがNULLの場合は比較・追加処理をスキップ ---
                    String stgInstrNo = ttPltzDomain.getStgInstrNo();
                    if (stgInstrNo != null) {
                        for (int j = 0; j < stgInstrNoList.size(); j++ ) {
                            if (stgInstrNoList.get(j).equals(stgInstrNo)) {
                                inInstrflg++ ;
                            }
                        }
                        if (inInstrflg == 0) {
                            stgInstrNoList.add(stgInstrNo);
                        }
                    }
                }

                // Warehouse Company Code Check 倉庫会社コードチェック
                if (!inputDomain.getCurWhCompCd().equals(
                    mainMarkList.get(mainMarkList.size() - 1).getCurWhCompCd())) {
                    resultCd = WS_RESULT_ERROR;
                    errorList.addAll(getErrorList("NXS_E1_5019", mainMarkList.get(
                        mainMarkList.size() - 1).getCurWhCompCd()));
                }
                // Warehouse Code Check 倉庫コードチェック
                if (!inputDomain.getCurWhCd().equals(
                    mainMarkList.get(mainMarkList.size() - 1).getCurWhCd())) {
                    resultCd = WS_RESULT_ERROR;
                    errorList.addAll(getErrorList("NXS_E1_5020", mainMarkList.get(
                        mainMarkList.size() - 1).getCurWhCd()));
                }
                // Latest Sheet Check 帳票最新チェック
                if (!inputDomain.getTrnsCd().equals(
                    mainMarkList.get(mainMarkList.size() - 1).getTrnsCd())
                    || !inputDomain.getContainerSortingKey().equals(
                        mainMarkList.get(mainMarkList.size() - 1).getContainerSortingKey())
                        || mainMarkList.get(mainMarkList.size() - 1).getContainerLooseTyp().equals(CONTAINER_LOOSE_TYP_L)) {
                    
                    // In Case of X-TAG まとめメインマークの場合
                    if (Xptrn.matcher(mainMarkList.get(mainMarkList.size() - 1).getMainMark())
                        .find()) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5022", mainMarkList.get(
                            mainMarkList.size() - 1).getMainMark()));
                    }
                    // In Case of Main Mark メインマークの場合
                    else {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5021", mainMarkList.get(
                            mainMarkList.size() - 1).getMainMark()));
                    }
                }
                // Palletize Status Check 5.2.4パレタイズステータスチェック
                if (pltzStatusCheck(mainMarkList.get(mainMarkList.size() - 1).getInstrFlg(),
                    tmpCusutomTimingType, mainMarkList.get(mainMarkList.size() - 1)
                        .getContainerLooseTyp(), mainMarkList.get(mainMarkList.size() - 1)
                        .getPltzStatus())) {
                    if (mainMarkFlg.equals("S")) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5023", mainMarkList.get(
                            mainMarkList.size() - 1).getMainMark()));
                    }
                    if (mainMarkFlg.equals("X")) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5024", mainMarkList.get(
                            mainMarkList.size() - 1).getMainMark()));
                    }
                }
                // Latest Transfer Status Check 最終搬出入ステータスチェック
                if (!Xptrn.matcher(mainMarkList.get(mainMarkList.size() - 1).getMainMark()).find()) {

                    if (mainMarkList.get(mainMarkList.size() - 1).getLastTrStatus().equals(
                        LAST_TR_STATUS_ISSUE_TR)
                        || mainMarkList.get(mainMarkList.size() - 1).getLastTrStatus().equals(
                            LAST_TR_STATUS_ACCTIVE_TR)) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5025", mainMarkList.get(
                            mainMarkList.size() - 1).getMainMark()));
                    }
                }
                // If Result Code is 0(normal termination), Set Registration Information 内部変数.結果コードが'0'(正常終了)の場合、登録情報を設定する。
                if (resultCd.equals(WS_RESULT_SUCCESS)) {
                    pkg = pkg.add(new BigDecimal("1"));
                    if (mainMarkList.get(mainMarkList.size() - 1).getDngrItemFlg().equals(FLAG_Y)) {
                        dengerItemFlg = "Y";
                    }
                }
            }// End Main Mark Loop メインマークループ終了

            // Staging Actuality Registeration Check 5.4山作り実績登録対象チェック（登録情報チェック）
            if (resultCd.equals(WS_RESULT_SUCCESS)) {
                
                for (int k = 0; k < stgInstrNoList.size(); k++ ) {
                    VtPltzStgInstrCriteriaDomain vtPltzStgInstrCriteriaDomain = new VtPltzStgInstrCriteriaDomain();
                    vtPltzStgInstrCriteriaDomain.setStgInstrNo(stgInstrNoList.get(k));
                    //パレタイズ情報取得
                    List<VtPltzStgInstrDomain> domainList = vtPltzStgInstrService.searchByCondition(vtPltzStgInstrCriteriaDomain);
                    
                    //取得したメインマークがメインマークリスト(登録用)に存在することをチェックし、1つでも存在しないものがある場合はエラーメッセージを設定する。
                    for(int l = 0; l < domainList.size(); l++){ 
                        
                        boolean isFound = false;
                        
                        //メインマークリスト(登録用)から探す
                        for(int m = 0; m < mainMarkList.size(); m++){ 
                            if(domainList.get(l).getMainMark().equals(mainMarkList.get(m).getMainMark())){
                                isFound = true;
                                break;
                            }
                        }
                        if (!isFound){
                            resultCd = WS_RESULT_ERROR;
                            errorList.addAll(getErrorList("NXS_E1_5026", stgInstrNoList.get(k)));
                            break;
                        }
                    }
                }
                
                // If Result Code is 0(normal termination), 
                // Check That Main Mark List(for registration) is 1 or More. 5.5内部変数.結果コードが'0'(正常終了)の場合、メインマークリスト(登録用)が1件以上存在することをチェックする。
                if (resultCd.equals(WS_RESULT_SUCCESS) && (mainMarkList == null || mainMarkList.size() == 0)) {
                    resultCd = WS_RESULT_ERROR;
                    errorList.addAll(getErrorList("NXS_E1_5027"));
                }

                // Transport Type Check 5.6輸送手段種別情報存在チェック（登録情報チェック）
                VtTrnsTypStgActCriteriaDomain vtTrnsTypStgActCriteriaInputDomain = new VtTrnsTypStgActCriteriaDomain();
                vtTrnsTypStgActCriteriaInputDomain.setTrnsCd(inputDomain.getTrnsCd());
                vtTrnsTypStgActCriteriaInputDomain.setTrnsTypCd(inputDomain.getTransTypCd());
                vtTrnsTypStgActCriteriaInputDomain.setVolumeUnit(volumeUnit);
                List<VtTrnsTypStgActDomain> vtTrnsTypStgActDomainList = vtTrnsTypStgActService
                .searchByCondition(vtTrnsTypStgActCriteriaInputDomain);
                if (vtTrnsTypStgActDomainList == null || vtTrnsTypStgActDomainList.size() == 0) {
                    resultCd = WS_RESULT_ERROR;
                    errorList.addAll(getErrorList("NXS_E1_5028", inputDomain.getTrnsCd() ,
                        inputDomain.getTransTypCd()));
                }
                for (int m = 0; m < vtTrnsTypStgActDomainList.size(); m++ ) {
                    if (vtTrnsTypStgActDomainList.get(m).getVolume() == null) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_5034", volumeUnit));
                    }
                }

                if (resultCd.equals(WS_RESULT_SUCCESS)) {
                    //Calculate Weight  重量算出
                    //Calculate Volume  容積算出
                    List<Ws4503MainMarkDomain> sumMainMarkList = new ArrayList<Ws4503MainMarkDomain>();
                    List<Ws4503MainMarkDomain> sumXmainMarkList = new ArrayList<Ws4503MainMarkDomain>();
                    for (int m = 0; m < mainMarkList.size(); m++ ) {
                        Ws4503MainMarkDomain selMainMark = mainMarkList.get(m);
                        if (Xptrn.matcher(selMainMark.getMainMark()).find()) {
                            sumXmainMarkList.add(selMainMark);
                        } else {
                            sumMainMarkList.add(selMainMark);
                        }
                    }
                    WS4501TtPltzByMainMarkCriteriaDomain selMainMarkList = new WS4501TtPltzByMainMarkCriteriaDomain();
                    selMainMarkList.setMainMarkList(sumMainMarkList);
                    WS4501TtXpltzByXMainMarkCriteriaDomain selXmainMarkList = new WS4501TtXpltzByXMainMarkCriteriaDomain();
                    selXmainMarkList.setMainMarkList(sumXmainMarkList);

                    // Call Weight and Volume 重量、容積呼び出し
                    BigDecimal sumWeight = new BigDecimal("0");
                    BigDecimal sumVolume = new BigDecimal("0");
                    List<ECA0027_WS_4501Domain> mainWVList = new ArrayList<ECA0027_WS_4501Domain>();
                    List<ECA0027_WS_4501Domain> xmainWVList = new ArrayList<ECA0027_WS_4501Domain>();
                    if (selMainMarkList.getMainMarkList().size() > 0) {
                        mainWVList = wsBhtStgDao.searchTtPltzByKeys(selMainMarkList);
                    }
                    if (selXmainMarkList.getMainMarkList().size() > 0) {
                        xmainWVList = wsBhtStgDao.searchTtXpltzByKeys(selXmainMarkList);
                    }
                    for (int n = 0; n < mainWVList.size(); n++ ) {
                        mainWVList.get(n).setGrossWeight(commonService.convertWeightUnit(mainWVList.get(n)
                            .getGrossWeight(), mainWVList.get(n).getWeightUnit(), weightUnit));
                        mainWVList.get(n).setVolume(commonService.convertVolumeUnit(mainWVList.get(n)
                            .getVolume(), mainWVList.get(n).getVolumeUnit(), volumeUnit));
                        if (!mainWVList.get(n).getGrossWeight().equals(new BigDecimal("0"))) {
                            sumWeight = sumWeight.add(mainWVList.get(n).getGrossWeight());
                        }
                        if (!mainWVList.get(n).getVolume().equals(new BigDecimal("0"))) {
                            sumVolume = sumVolume.add(mainWVList.get(n).getVolume());
                        }
                    }
                    for (int n = 0; n < xmainWVList.size(); n++ ) {
                        xmainWVList.get(n).setGrossWeight(commonService.convertWeightUnit(xmainWVList.get(n)
                            .getGrossWeight(), xmainWVList.get(n).getWeightUnit(), weightUnit));
                        xmainWVList.get(n).setVolume(commonService.convertVolumeUnit(xmainWVList.get(n)
                            .getVolume(), xmainWVList.get(n).getVolumeUnit(), volumeUnit));
                        if (!xmainWVList.get(n).getGrossWeight().equals(new BigDecimal("0"))) {
                            sumWeight = sumWeight.add(xmainWVList.get(n).getGrossWeight());
                        }
                        if (!xmainWVList.get(n).getVolume().equals(new BigDecimal("0"))) {
                            sumVolume = sumVolume.add(xmainWVList.get(n).getVolume());
                        }
                    }
                    // Set Site Type and Calculate Weight Percent 8.位置区分の設定、重量割合の算出
                    // Loading Ratio: Round off 2nd Decimal Point 積載率 小数第二位を四捨五入する
                    if (vtTrnsTypStgActDomainList.get(0).getVolume().equals(new BigDecimal("0"))) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_0034", "TTPLTZ.VOLUME"));
                    }
                    else{
                        loadingRatio = sumVolume.divide(vtTrnsTypStgActDomainList
                            .get(0).getVolume(), 3, BigDecimal.ROUND_HALF_UP);
                        loadingRatio = loadingRatio.multiply(new BigDecimal("100")).setScale(1,
                            BigDecimal.ROUND_HALF_UP);
                        // In the case of overflow the integer part
                        // 整数部桁あふれの場合
                        if (MAX_PRECISION_LOADING_RATIO < loadingRatio.precision() - loadingRatio.scale()) {
                            resultCd = WS_RESULT_ERROR;
                            errorList.addAll(getErrorList("NXS_E1_5071", "Loading Ratio"));
                        }
                    }
                    // Add Weight and Volume to Main Mark List 重量、容積をメインマークリストに追加
                    int p = 0;
                    int q = 0;
                    for (int o = 0; o < mainMarkList.size(); o++ ) {
                        Ws4503MainMarkDomain selMainMark = mainMarkList.get(o);
                        if(Xptrn.matcher(selMainMark.getMainMark()).find()) {
                            mainMarkList.get(o).setWeight(xmainWVList.get(q).getGrossWeight());
                            mainMarkList.get(o).setVolume(xmainWVList.get(q).getVolume());
                            q++ ;
                        }
                        else {
                            mainMarkList.get(o).setWeight(mainWVList.get(p).getGrossWeight());
                            mainMarkList.get(o).setVolume(mainWVList.get(p).getVolume());
                            p++ ;
                        }
                    }
                    // Measure Divide By 0 
                    if (sumWeight.equals(new BigDecimal("0"))) {
                        resultCd = WS_RESULT_ERROR;
                        errorList.addAll(getErrorList("NXS_E1_0034", "sumWeight"));
                    } else {
                        // Calculate Weight Percent 重量割合の算出
                        BigDecimal countValue = new BigDecimal("0");
                        for (int r = 0; r < mainMarkList.size(); r++ ) {
                            countValue = countValue.add(mainMarkList.get(r).getVolume());

                            if (countValue.doubleValue() <= sumVolume.multiply(
                                new BigDecimal("0.25")).doubleValue()) {
                                mainMarkList.get(r).setSiteTyp("A");
                                weightPerA = weightPerA.add(mainMarkList.get(r).getWeight());
                            } else if (countValue.doubleValue() <= sumVolume.multiply(
                                new BigDecimal("0.5")).doubleValue()) {
                                mainMarkList.get(r).setSiteTyp("B");
                                weightPerB = weightPerB.add(mainMarkList.get(r).getWeight());
                            } else if (countValue.doubleValue() <= sumVolume.multiply(
                                new BigDecimal("0.75")).doubleValue()) {
                                mainMarkList.get(r).setSiteTyp("C");
                                weightPerC = weightPerC.add(mainMarkList.get(r).getWeight());
                            } else {
                                mainMarkList.get(r).setSiteTyp("D");
                            }
                        }
                        weightPerA = weightPerA.divide(sumWeight, 3, BigDecimal.ROUND_HALF_UP);
                        weightPerA = weightPerA.multiply(new BigDecimal("100")).setScale(1,
                            BigDecimal.ROUND_HALF_UP);
                        weightPerB = weightPerB.divide(sumWeight, 3, BigDecimal.ROUND_HALF_UP);
                        weightPerB = weightPerB.multiply(new BigDecimal("100")).setScale(1,
                            BigDecimal.ROUND_HALF_UP);
                        weightPerC = weightPerC.divide(sumWeight, 3, BigDecimal.ROUND_HALF_UP);
                        weightPerC = weightPerC.multiply(new BigDecimal("100")).setScale(1,
                            BigDecimal.ROUND_HALF_UP);
                        weightPerD = weightPerD.add(new BigDecimal("100"));
                        weightPerD = weightPerD.subtract(weightPerA);
                        weightPerD = weightPerD.subtract(weightPerB);
                        weightPerD = weightPerD.subtract(weightPerC).setScale(1,
                            BigDecimal.ROUND_HALF_UP);
                    }

                    if (resultCd.equals(WS_RESULT_SUCCESS)) {
                        // Get Staging Actuality No.9山作り実績情報の登録
                        SimpleDateFormat DateFormat = new SimpleDateFormat("yyMMdd");

                        String transKey = inputDomain.getCurWhCompCd()
                            + "SA" + DateFormat.format(stgActDate).substring(1);
                        String transactSequence = commonService.transactSequence(transKey, SEQ_TYP_STG_ACTUALITY_NO,
                            1, "WS4503").get(0);
                        stgActNo = transKey + transactSequence;

                        // Create Staging Actuality DomainCreate Staging Actuality Domain 山作り実績登録用ドメイン 作成
                        TtStgActDomain insertStgActDomain = new TtStgActDomain();
                        insertStgActDomain.setStgActNo(stgActNo);
                        insertStgActDomain.setWhCompCd(inputDomain.getCurWhCompCd());
                        insertStgActDomain.setWhCd(inputDomain.getCurWhCd());
                        insertStgActDomain.setTrnsCd(inputDomain.getTrnsCd());
                        insertStgActDomain.setTrnsTypCd(inputDomain.getTransTypCd());
                        insertStgActDomain.setContainerSortingKey(inputDomain.getContainerSortingKey());
                        insertStgActDomain.setPkgQty(pkg);
                        insertStgActDomain.setGrossWeight(sumWeight);
                        insertStgActDomain.setWeightUnit(weightUnit);
                        insertStgActDomain.setVolume(sumVolume);
                        insertStgActDomain.setVolumeUnit(volumeUnit);
                        insertStgActDomain.setLoadingRatio(loadingRatio);
                        insertStgActDomain.setDngrItemFlg(dengerItemFlg);
                        insertStgActDomain.setWeightPerA(weightPerA);
                        insertStgActDomain.setWeightPerB(weightPerB);
                        insertStgActDomain.setWeightPerC(weightPerC);
                        insertStgActDomain.setWeightPerD(weightPerD);
                        insertStgActDomain.setStgActDt(stgActDate);
                        insertStgActDomain.setStgActIssuerId(inputDomain.getDscId());
                        insertStgActDomain.setStgActIssuerNm(usrNmEn);
                        insertStgActDomain.setComCreateUserId(inputDomain.getDscId());
                        insertStgActDomain.setComCreateFuncId(inputDomain.getScreenId());
                        insertStgActDomain.setComUpdateUserId(inputDomain.getDscId());
                        insertStgActDomain.setComUpdateFuncId(inputDomain.getScreenId());
                        insertStgActDomain.setCarrierCompCd(inputDomain.getCurWhCompCd());
                        insertStgActDomain.setEtd(null);
                        insertStgActDomain.setCarrierCompCd(null);
                        // Do Registration 山作り実績の登録 
                        ttStgActService.create(insertStgActDomain);
                        
                        // Update Palletize Informatation パレタイズ情報の更新 
                        // Repeat the number of items update process list of the main mark メインマークリスト(登録用)の件数分更新処理を繰り返す。 
                        for(int s = 0; s < mainMarkList.size(); s++){
                            TtPltzDomain ttPltzUpdateDomain = new TtPltzDomain();
                            ttPltzUpdateDomain.setPltzStatus("50");
                            ttPltzUpdateDomain.setStgActNo(stgActNo);
                            ttPltzUpdateDomain.setComUpdateUserId(inputDomain.getDscId());
                            ttPltzUpdateDomain.setComUpdateFuncId(inputDomain.getScreenId());
                            ttPltzUpdateDomain.setSiteTyp(mainMarkList.get(s).getSiteTyp());
                            ttPltzUpdateDomain.setComUpdateTimestamp(mainMarkList.get(s).getComUpdateTimestamp());
                            if(Xptrn.matcher(mainMarkList.get(s).getMainMark()).find()){
                                TtPltzCriteriaDomain criteira = new TtPltzCriteriaDomain();
                                criteira.setXmainMark(mainMarkList.get(s).getMainMark());
                                ttPltzService.updateByCondition(ttPltzUpdateDomain, criteira);
                            }
                            else{
                                ttPltzUpdateDomain.setMainMark(mainMarkList.get(s).getMainMark());
                                ttPltzService.update(ttPltzUpdateDomain);
                            }
                        }
                        
                        // MGTNo.570 ADD
                        // Update TT_STG_INSTR.STG_ACT_NO.
                        Map<String, Object> inputMap = new HashMap<String, Object>();
                        inputMap.put("stgActNo", stgActNo);
                        inputMap.put("comUpdateFuncId", inputDomain.getScreenId());
                        inputMap.put("comUpdateUserId", inputDomain.getDscId());
                        wsBhtStgDao.updStgInstrIncludedInStgAct(inputMap);
                    }
                }
            }
        }
        if(resultCd.equals(WS_RESULT_SUCCESS)) {
//            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_SUCCESS);
//            Ws4503StgActNoDomain stgActDomain = new Ws4503StgActNoDomain();
//            stgActDomain.setStgActNo(stgActNo);
//            resultDomain.setWs4503StgActNoDomain(stgActDomain);
            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_SUCCESS);
            resultDomain.getWs4503StgActNoDomain().setStgActNo(stgActNo);
        } else {
            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_ERROR, errorList);
        }
        return resultDomain;
    }


    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtStgService#printStgAct(com.globaldenso.eca0027.core.business.domain.criteria.Ws4504ProcessFacadeServiceInputDomain)
     */
    public Ws4504ProcessFacadeServiceResultDomain printStgAct(
        Ws4504ProcessFacadeServiceInputDomain inputDomain) throws ApplicationException {
        // Result Code 結果コード
        String resultCd = WS_RESULT_SUCCESS;
        // Error List エラー-リスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        Ws4504ProcessFacadeServiceResultDomain resultDomain = new Ws4504ProcessFacadeServiceResultDomain();
        // Get User Information ユーザ情報取得
        VmUserInfoCriteriaDomain VmUserInfoinputDomain = new VmUserInfoCriteriaDomain();
        VmUserInfoinputDomain.setDscId(inputDomain.getDscId());
        List<VmUserInfoDomain> vmUserInfoList = vmUserInfoService
            .searchByCondition(VmUserInfoinputDomain);
        if (vmUserInfoList == null || vmUserInfoList.size() == 0) {
            resultCd = WS_RESULT_ERROR;
            errorList.addAll(getErrorList("NXS_E1_5031", inputDomain.getDscId()));
        }else{
            // Get Printer Information プリンタ情報取得
            TmPrinterCriteriaDomain tmPrinterInputDomain = new TmPrinterCriteriaDomain();
            tmPrinterInputDomain.setCompCd(inputDomain.getCompCd());
            tmPrinterInputDomain.setPrinterId(inputDomain.getPrinterId());
            TmPrinterDomain tmPrinterResultDomain = tmPrinterService.searchByKey(tmPrinterInputDomain);
            if (tmPrinterResultDomain == null) {
                resultCd = WS_RESULT_ERROR;
                errorList.addAll(getErrorList("NXS_E1_5018", inputDomain.getCompCd(), inputDomain
                    .getPrinterId()));
            }else{
                // L4002ReportService searchStgAct CommonService printPdf を実行する 
                L4002ReportDomain reportDomain = new L4002ReportDomain();
                CommonUtil.copyPropertiesDomainToDomain(reportDomain, vmUserInfoList.get(0));
                reportDomain.setStgActNo(inputDomain.getStgActNo());   
                // NL021 MOD START
                //reportDomain.setReportDateFormat(REPORT_DETAIL_DATE_FORMAT);
                String reportDateFormat =  commonService.getResource(inputDomain.getLocale(), REPORT_DATE_FORMAT);
                reportDomain.setReportDateFormat(reportDateFormat);
                // NL021 MOD END
                reportDomain.setTimeZone(vmUserInfoList.get(0).getTimezoneId());
                File pdfFile = l4002ReportService.searchTtStgAct(reportDomain);    
                commonService.printPdf(pdfFile, 3, tmPrinterResultDomain.getPrinterNm());
            }
        }
        resultDomain.setErrorList(errorList);
        resultDomain.setResultCode(resultCd);
        return resultDomain; 
    }

    /**
     * <p>
     * Return Error Results That Contain The Specified Content.
     * </p>
     * 
     * @param errorCode エラーコード
     * @param params メッセージ・パラメータ
     * @return ErrorListItemDomain エラー結果ドメイン
     */
    private List<ErrorListItemDomain> getErrorList(String errorCode, String... params) {
        return Arrays.asList(new ErrorListItemDomain(errorCode, getParamList(params)));
    }

    /**
     * <p>
     * Return  List of Message Parameters, Including The Specified Value. 指定された値を含むメッセージ・パラメータのリストを返します。
     * </p>
     * 
     * @param params メッセージ・パラメータ
     * @return メッセージ・パラメータのリスト
     */
    private List<ErrorParamListItemDomain> getParamList(String... params) {
        List<ErrorParamListItemDomain> paramList = new ArrayList<ErrorParamListItemDomain>();

        for (String param : params) {
            paramList.add(new ErrorParamListItemDomain(param));
        }

        return paramList;
    }

    /**
     * <p>
     * Check that it is in a state of XCML or CML can be making a mountain, 
     * to set the error message if it is not ready for mountain building.
     * 
     * CMLまたはXCMLが山作りできる状態であることをチェックし、山作りできる状態でない場合はエラーメッセージを設定する。
     * </p>
     *
     * @param instrflg 指示フラグ
     * @param cusutomTimingType 通関タイミング区分
     * @param containerLooseTyp コンテナルーズ区分
     * @param pltzStatus パレタイズステータス
     * @return result チェック結果
     */
    private boolean pltzStatusCheck(String instrflg, String cusutomTimingType,
        String containerLooseTyp, String pltzStatus) {

        boolean result = true;

        if (instrflg.equals(FLAG_Y)) {
            if (cusutomTimingType.equals(CUSTOM_TYMING_TYP_A)) {
                if (containerLooseTyp.equals(CONTAINER_LOOSE_TYP_C)) {
                    if (pltzStatus.equals(PLTZ_STATUS_WORKED_ACT)) {
                        result = false;
                    }
                }
            } else if (cusutomTimingType.equals(CUSTOM_TYMING_TYP_B)) {
                if (containerLooseTyp.equals(CONTAINER_LOOSE_TYP_C)) {
                    if (pltzStatus.equals(PLTZ_STATUS_WORKED_ACT)) {
                        result = false;
                    }
                }
            } else if (cusutomTimingType.equals(CUSTOM_TYMING_TYP_Z)) {
                if (containerLooseTyp.equals(CONTAINER_LOOSE_TYP_C)) {
                    if (pltzStatus.equals(PLTZ_STATUS_CUSTOM)) {
                        result = false;
                    }
                } else if (containerLooseTyp.equals(CONTAINER_LOOSE_TYP_L)) {
                    result = false;
                }
            }
        } else if (instrflg.equals(FLAG_N)) {
            if (pltzStatus.equals(PLTZ_STATUS_PLTZ)) {
                result = false;
            }
        }

        return result;
    }
}