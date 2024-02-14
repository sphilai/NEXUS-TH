/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DEFAULT_PALLET_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PRECISION_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0066;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2014B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2014R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RT_TYP_1WAY;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwXpltzService;
import com.globaldenso.eca0027.core.business.dao.W2014XtagDao;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.time.DateUtils;

/**
 * the implement class of X-Palletize service.
 * <br />まとめパレタイズサービスの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W2014XtagServiceImpl implements W2014XtagService {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * List service
     * <br />帳票サービス (L2004)
     */
    protected L2004ReportService l2004ReportService;
    
    /**
     * PKG Set MA（Header Service)
     * <br /> 包装組み合わせ原単位(ヘッダ) サービス
     */
    protected TmPkgSetHdrService tmPkgSetHdrService;
    
    /**
     * X Palletize Service
     * <br /> まとめパレタイズ サービス
     */
    protected TtXpltzService ttXpltzService;
    
    /**
     * X Palletize Work Service
     * <br /> まとめパレタイズワーク サービス
     */
    protected TwXpltzService twXpltzService;

    /**
     * User function use authorization service
     * <br /> ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * W2014XtagDao
     */
    protected W2014XtagDao w2014XtagDao;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W2014XtagServiceImpl() {
    }
    
    
    // -------------------------------- Getter / Setter of dependence service and Dao ----------------------------------------------
    // -------------------------------- 依存サービス・DaoのGetter / Setter ----------------------------------------------
    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    
    /**
     * Setter method for l2004ReportService.
     *
     * @param reportService Set for l2004ReportService
     */
    public void setL2004ReportService(L2004ReportService reportService) {
        l2004ReportService = reportService;
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
     * Setter method for ttXpltzService.
     *
     * @param ttXpltzService Set for ttXpltzService
     */
    public void setTtXpltzService(TtXpltzService ttXpltzService) {
        this.ttXpltzService = ttXpltzService;
    }
    
    /**
     * Setter method for twXpltzService.
     *
     * @param twXpltzService Set for twXpltzService
     */
    public void setTwXpltzService(TwXpltzService twXpltzService) {
        this.twXpltzService = twXpltzService;
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
     * Setter method for w2014XtagDao.
     *
     * @param xtagDao Set for w2014XtagDao
     */
    public void setW2014XtagDao(W2014XtagDao xtagDao) {
        w2014XtagDao = xtagDao;
    }
    
    // --------------------------------- Parameter check method validateConsistency validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateConsistencyCcType(java.util.List, java.util.List)
     */
    public boolean validateConsistencyCcType(List<? extends W2014PltzDomain> pltzList, List<String> errCcTypeList) {
        
        Map<String, String> ccTypMap = new HashMap<String, String>();
        
        if (pltzList == null || pltzList.isEmpty()) {
            return true;
        }
        
        for (int i = 0; i < pltzList.size() ; i++) {
            String customTimingTyp = pltzList.get(i).getCustomTimingTyp();
            if (!CheckUtil.isBlankOrNull(customTimingTyp) && !ccTypMap.containsKey(customTimingTyp)) {
                ccTypMap.put(customTimingTyp, customTimingTyp);
            }
        }
        
        if (ccTypMap.size() == 1)  {
            // When all the data are equal
            // 全データが等しい場合
            return true;
        } else {
            Set<String> keys = ccTypMap.keySet();
            Iterator<String> itr = keys.iterator();
            while(itr.hasNext()) {
                errCcTypeList.add(itr.next());
            }
            return false;
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateConsistencyCmlCount(java.util.List)
     */
    public boolean validateConsistencyCmlCount(List<? extends W2014PltzDomain> pltzDomainList) {
        
        if (pltzDomainList.size() < 2) {
            return false;
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateConsistencyFromToDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFromToDate(String dateFormat, String issueFromDate, String issueToDate) {
        
        if (!CheckUtil.isBlankOrNull(issueFromDate) && !CheckUtil.isBlankOrNull(issueToDate)) {
            return commonService.validateFromToDate(dateFormat, issueFromDate, issueToDate);
        } else {
            return true;
        }
    }
    
    // --------------------------------- Database check method validateDatabase validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseCompCd(java.lang.String)
     */
    public boolean validateDatabaseCompCd(String shipToCompCd) throws ApplicationException {
        return commonService.validateCompCd(shipToCompCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseCompWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd) throws ApplicationException {
        return commonService.validateCompWh(compCd, whCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTtPltzOnRegister(java.util.List, java.lang.String, java.util.List, java.util.List)
     */
    
    public List<String> validateDatabaseTtPltzOnRegister(List<String> mainMarkList, String trnsCd
        , List<String> pltzStatusErrList, List<String> lastTrStatusErrList) throws ApplicationException {
        
        // List create of a Palletize domain
        // パレタイズドメインのリスト作成
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        for (String mainMark : mainMarkList) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            pltz.setMainMark(mainMark);
            pltzList.add(pltz);
        }
        
        // Palletize acquisition
        // パレタイズ取得
        List<? extends W2014PltzDomain> pltzResultList = w2014XtagDao.lockTtPltz(pltzList);
        
        // variable declaration for return VALUEs
        // 戻り値用変数宣言
        List<String> errMsg = new ArrayList<String>();
        
        // Error flag declaration
        // エラーフラグ宣言
        Boolean chkFlg = false;
        
        // The acquisition number check   Exclusion check
        // 取得件数チェック 排他チェック
        if (pltzResultList == null || pltzResultList.isEmpty() || mainMarkList.size() != pltzResultList.size()) {
            errMsg.add(GSCM_E0_0010);
            return errMsg;
        }
        
        // The check of and other detailed units
        // その他の明細単位のチェック
        for (W2014PltzDomain pltz : pltzResultList) {
            // This is confirmed whether the mountain of the CML of target is made.
            // 対象のCMLが山作りされていないかをチェック
            if (!PLTZ_STATUS_PLTZ.equals(pltz.getPltzStatus())) {
                pltzStatusErrList.add(pltz.getMainMark());
            }
            
            // The transfer document is published for CML of target, or it checks for nothing under Carry-Out.
            // 対象のCMLが送荷書が発行されている、または、搬出中のものがないかをチェック
            if (CARRY_OUT_IN_ISSUE_TR.equals(pltz.getLastTrStatus())
                || CARRY_OUT_IN_ACTIVATE_TR.equals(pltz.getLastTrStatus())) {
                lastTrStatusErrList.add(pltz.getMainMark());
            }
            // This is already checked a X-TAG for CML of target.
            // 対象のCMLが既にまとめCMLになっていないかをチェック
            if (!CheckUtil.isBlankOrNull(pltz.getXmainMark())) {
                chkFlg = true;
            }
            
            // This is confirmed whether CML of target is changing the Transport.
            // 対象のCMLが輸送手段の付け替えを行っていないかをチェック
            if (!trnsCd.equals(pltz.getTrnsCd())) {
                chkFlg = true;
            }
        }
        
        // Setting of an error message
        // エラーメッセージの設定
        // The mountain of the CML of target is made.
        // 対象のCMLが山作りされている
        if (!pltzStatusErrList.isEmpty()) {
            errMsg.add(NXS_E1_0062);
        }
        // The transfer document is published or CML of target is taking out.
        // 対象のCMLが送荷書が発行されている、または、搬出中である
        if (!lastTrStatusErrList.isEmpty()) {
            errMsg.add(NXS_E1_0063);
        }
        // CML of target has already become or changed the Transport for the X-TAG.
        // 対象のCMLが既にまとめCMLになっている、または、輸送手段の付け替えを行っている
        if (chkFlg) {
            errMsg.add(GSCM_E0_0010);
        }
        
        if (errMsg.isEmpty()){
            return null;
        } else {
            return errMsg;
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTtPltzOnRegisterCancel(java.util.List, java.util.List)
     */
    public String validateDatabaseTtPltzOnRegisterCancel(List<String> mainMarkList, List<String> mainMarkErrList) throws ApplicationException {
        
        // List create of a Palletize domain
        // パレタイズドメインのリスト作成
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        for (String mainMark : mainMarkList) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            pltz.setMainMark(mainMark);
            pltzList.add(pltz);
        }
        
        // A call of TtPltzService
        // TtPltzServiceの呼出
        List<? extends W2014PltzDomain> pltzResultList = w2014XtagDao.lockTtPltz(pltzList);
        
        // Exclusion check
        // 排他チェック
        if (pltzResultList == null || pltzResultList.isEmpty()) {
            return GSCM_E0_0010;
        }
        
        // This is confirmed whether the mountain of the CML of target is made.
        // 対象のCMLが山作りされていないかをチェック
        for (W2014PltzDomain pltz : pltzResultList) {
            if (!PLTZ_STATUS_PLTZ.equals(pltz.getPltzStatus())) {
                mainMarkErrList.add(pltz.getMainMark());
            }
        }
        if (mainMarkErrList.size() > 0){
            return NXS_E1_0062;
        }
        
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTtXpltzOnRegisterCancel(java.lang.String)
     */
    
    public boolean validateDatabaseTtXpltzOnRegisterCancel(String xmainMark) throws ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TtXpltzCriteriaDomain criteria = new TtXpltzCriteriaDomain();
        criteria.setXmainMark(xmainMark);
        
        // A call of TtPltzService
        // TtPltzServiceの呼出
        TtXpltzDomain ttXpltz = new TtXpltzDomain();
        ttXpltz = ttXpltzService.lockByKeyNoWait(criteria);
        
        // Exclusion check
        // 排他チェック
        if (ttXpltz == null) {
            return false;
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTwXpltzOnCreateMoveToRegister(java.lang.String)
     */
    
    public boolean validateDatabaseTwXpltzOnCreateMoveToRegister(String dscId) throws ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TwXpltzCriteriaDomain criteria = new TwXpltzCriteriaDomain();
        criteria.setDscId(dscId);
        
        // A call of TtPltzService
        // TtPltzServiceの呼出
        List<TwXpltzDomain> twXpltzList = new ArrayList<TwXpltzDomain>();
        twXpltzList = twXpltzService.searchByCondition(criteria);
        
        // Exclusion check
        // 排他チェック
        if (twXpltzList == null || twXpltzList.isEmpty()) {
            return false;
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCml(java.lang.String, java.lang.String)
     */
    
    public boolean validateDatabaseTwXpltzOnCreateUpdateByCml(String dscId, String customTimingTyp) throws ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TwXpltzCriteriaDomain criteria = new TwXpltzCriteriaDomain();
        criteria.setDscId(dscId);
        
        // The 1st affair is acquired by the function of paging.
        // ページングの機能で1件目を取得
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(1);
        
        // A call of TtPltzService
        // TtPltzServiceの呼出
        List<TwXpltzDomain> twXpltzList = new ArrayList<TwXpltzDomain>();
        twXpltzList = twXpltzService.searchByConditionForPaging(criteria);
        
        // The same X-TAG condition check
        // 同一まとめCML条件チェック
        if (twXpltzList != null && !twXpltzList.isEmpty() && customTimingTyp.compareTo(twXpltzList.get(0).getCustomTimingTyp()) != 0) {
            return false;
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#validateDatabaseTwXpltzOnCreateUpdateByCount(java.lang.String, int)
     */
    
    public boolean validateDatabaseTwXpltzOnCreateUpdateByCount(String dscId, int newRec) throws ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TwXpltzCriteriaDomain criteria = new TwXpltzCriteriaDomain();
        criteria.setDscId(dscId);
        
        // A call of TtPltzService
        // TtPltzServiceの呼出
        criteria.setSearchCountCheckFlg(false);
        int cnt = twXpltzService.searchCount(criteria);
        
        // COUNT (DSC-ID)+ new registration record count ([51]:CK.=ON and [55] : when disabledFlg (hidden) is N) > An error is made when this is 99.
        // COUNT(DSC_ID)　＋新規登録レコード数（【51】:CK.＝ON　かつ【55】:disabledFlg(hidden)がNの場合）＞　99　の場合エラー
        if ((cnt + newRec) > 99) {
            return false;
        }
        
        return true;
    }
    
    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#createOnCreateUpdate(java.util.List)
     */
    public void createOnCreateUpdate(List<? extends W2014PltzDomain> pltzList) throws ApplicationException {
        
        for (W2014PltzDomain pltz : pltzList) {
            
            // disabledFlg (hidden) is N, this is considered as the target for X-Palletize registration.
            // disabledFlg(hidden)がNの場合、まとめパレタイズ登録対象とする
            if (FLAG_N.equals(pltz.getDisabledFlg())) {
                TwXpltzDomain twXpltz = new TwXpltzDomain();
                // A domain is copied.
                // ドメインをコピー
                CommonUtil.copyPropertiesDomainToDomain(twXpltz, pltz);
                // A setting of login ID
                // ログインIDの設定
                twXpltz.setDscId(pltz.getLoginUserDscId());
                // Setting of a common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(twXpltz, SCREEN_ID_W2016);
                
                // X-Palletize-Work registration
                // まとめパレタイズワーク登録
                twXpltzService.create(twXpltz);
            }
        }
    }
    
    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searcCountOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public int searcCountOnCreateSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException {

        // Property setting (an access permission is set up)  
        // プロパティ設定(アクセス権限を設定)
        if (userAuthService.hasRegisterAll()) {
            criteria.setUserAuthList(null);
        } else {
            criteria.setUserAuthList(userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2014R));
        }

        // Palletize, a X Palletize Work, number-of-cases acquisition of a NEXUS Ship To Master
        // パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位の件数取得
        return w2014XtagDao.searchCountTtpltz(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searchCountOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public int searchCountOnMainSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        // Property setting (an access permission is set up)
        // プロパティ設定(アクセス権限を設定)
        if (userAuthService.hasBrowseAll() || userAuthService.hasRegisterAll()) {
            criteria.setUserAuthList(null);
        } else {
            criteria.setUserAuthList(userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2014B, PERMIT_FUNC_ID_W2014R));
        }
        
        // Number-of-cases acquisition of X Palletize, and a Palletize
        // まとめパレタイズ、パレタイズの件数取得
        return w2014XtagDao.searchCountTtXpltz(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public List<? extends W2014PltzDomain> searchForPagingOnCreateSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        // Property setting (an access permission is set up)  
        // プロパティ設定(アクセス権限を設定)
        // Finishing of the setting by searcCountOnCreateSearch (W2014XtagCriteriaDomain)
        // searcCountOnCreateSearch(W2014XtagCriteriaDomain)で設定済み
        
        // Palletize, a X Palletize Work, a NEXUS-Ship-To-Master search
        // パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位検索
        List<? extends W2014PltzDomain> pltzList = w2014XtagDao.searchForPagingTtpltz(criteria);
        
        // It changes into the WEIGHT UNIT of login person.
        // ログイン者の重量単位に変換
        for (W2014PltzDomain pltz : pltzList) {
            if (!pltz.getWeightUnit().equals(criteria.getWeightUnit())) {
                pltz.setGrossWeight(commonService.convertWeightUnit(pltz.getGrossWeight(), pltz.getWeightUnit(), criteria.getWeightUnit()));
                pltz.setWeightUnit(criteria.getWeightUnitDisplay());
                
                // An error is made when the digit number of integer part exceeds a maximum.
                // 整数部の桁数が上限を超えた場合はエラー
                if (pltz.getGrossWeight() == null) {
                    throw new GscmApplicationException(NXS_E7_0157);
                }
            }
        }
        
        return pltzList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public List<? extends W2014XtagDomain> searchForPagingOnMainSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        // Property setting (an access permission is set up)
        // プロパティ設定(アクセス権限を設定)
        // Finishing of the setting by searchCountOnMainSearch (W2014XtagCriteriaDomain)
        // searchCountOnMainSearch(W2014XtagCriteriaDomain)で設定済み
        
        // X Palletize, a Palletize search
        // まとめパレタイズ、パレタイズ検索
        return w2014XtagDao.searchForPagingTtXpltz(criteria);
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public W2014XtagDomain searchOnRegisterInitByFromCreate(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        W2014XtagDomain xtag = new W2014XtagDomain();
        
        // X Palletize Work, a Palletize search
        // まとめパレタイズワーク、パレタイズ検索
        xtag = w2014XtagDao.searchTwXpltzByCleate(criteria);
        
        if (xtag == null) {
            return xtag;
        }
        
        // A unit converted of GROSS WEIGHT
        // グロス重量の単位変換
        for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
            // GROSS WEIGHT is changed into a login person's WEIGHT UNIT.
            // グロス重量をログイン者の重量単位に変換
            pltz.setGrossWeight(commonService.convertWeightUnit(pltz.getGrossWeight(), pltz.getWeightUnit(), criteria.getWeightUnit()));
            if (pltz.getGrossWeight() == null){
                // An error is made when the digit number of integer part exceeds a maximum.
                // 整数部の桁数が上限を超えた場合はエラー
                Object[] params = {
                    commonService.getResource(pltz.getLocale(), "label.grossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        
        // Total Shipper acquisition
        // Total Shipper取得
        List<? extends W2014PltzDomain> pltzList = w2014XtagDao.searchTtPltzByTotalShipper(criteria);
        
        xtag.setTotalShipper(BigDecimal.valueOf(pltzList.size()));
        
        // For Shipper Code List
        // Shipper Code List用
        StringBuffer shipperCdList = new StringBuffer();
        
        // Counter
        // カウンター
        int cnt = 0;
        
        // Shipper Code List create
        // Shipper Code List作成
        for (W2014PltzDomain pltz : pltzList) {
            if (cnt != 0) {
                shipperCdList.append(",");
            }
            shipperCdList.append(pltz.getShipperCd());
            
            cnt++;
        }
        
        xtag.setShipperCdList(shipperCdList.toString());
        
        return xtag;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public W2014XtagDomain searchOnRegisterInitByFromMain(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        W2014XtagDomain xtag = new W2014XtagDomain();
        
        // authorization list setting
        // 権限リスト設定
        criteria.setUserAuthList(userAuthService.getUserAuthList(PERMIT_FUNC_ID_W2014B, PERMIT_FUNC_ID_W2014R));
        
        // A setting of Browse All
        // Browse Allの設定
        if (userAuthService.hasBrowseAll()) {
            criteria.setBrowseAll("1");
        }
        
        // A setting of Register All
        // Register Allの設定
        if (userAuthService.hasRegisterAll()) {
            criteria.setRegisterAll("2");
        }
        
        // X Palletize, a Palletize search
        // まとめパレタイズ、パレタイズ検索
        xtag = w2014XtagDao.searchTtXpltzByMain(criteria);
        
        if (xtag != null) {
            // VOLUME is changed into a login person's Unit of Vol.
            // 容積をログイン者の容積単位に変換
            xtag.setVolume(commonService.convertVolumeUnit(xtag.getVolume(), xtag.getVolumeUnit(), criteria.getVolumeUnit()));
            if (xtag.getVolume() == null) {
                // An error is made when the digit number of integer part exceeds a maximum.
                // 整数部の桁数が上限を超えた場合はエラー
                Object[] params = {
                    commonService.getResource(xtag.getLocale(), "label.volume")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            
            // The Unit-of-Vol. notation of login person is set up.
            // ログイン者の容積単位表記を設定
            xtag.setVolumeUnitDisplay(criteria.getVolumeUnitDisplay());
            
            // GROSS WEIGHT is changed into a login person's WEIGHT UNIT.
            // グロス重量をログイン者の重量単位に変換
            xtag.setGrossWeight(commonService.convertWeightUnit(xtag.getGrossWeight(), xtag.getWeightUnit(), criteria.getWeightUnit()));
            if (xtag.getGrossWeight() == null) {
                Object[] params = {
                    commonService.getResource(xtag.getLocale(), "label.grossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
            
            // A login person's WEIGHT-UNIT notation is set up.
            // ログイン者の重量単位表記を設定
            xtag.setWeightUnitDisplay(criteria.getWeightUnitDisplay());
            
            for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
                // GROSS WEIGHT is changed into a login person's WEIGHT UNIT.
                // グロス重量をログイン者の重量単位に変換
                pltz.setGrossWeight(commonService.convertWeightUnit(pltz.getGrossWeight(), pltz.getWeightUnit(), criteria.getWeightUnit()));
                if (pltz.getGrossWeight() == null){
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    Object[] params = {
                        commonService.getResource(pltz.getLocale(), "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                // A login person's WEIGHT-UNIT notation is set up.
                // ログイン者の重量単位表記を設定
                pltz.setWeightUnitDisplay(criteria.getWeightUnitDisplay());
            }
        }
        return xtag;
    }

    // --------------------------------- Update system method update -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- Delete system method delete -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#deleteOnHeaderInit(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public int deleteOnHeaderInit(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        
        // Create of a condition domain
        // 条件ドメインの作成
        TwXpltzCriteriaDomain twXpltzCriteria = new TwXpltzCriteriaDomain();
        twXpltzCriteria.setDscId(criteria.getLoginUserDscId());
        twXpltzCriteria.setSearchCountCheckFlg(false);
        
        // Delete of X Palletize Work (if it is)  
        // まとめパレタイズワークの削除 (あれば)
        if (0 < twXpltzService.searchCount(twXpltzCriteria)) {
            // A delete of Palletize Instruction Item No Work
            // 梱包指示品目番号ワークの削除
            return twXpltzService.deleteByCondition(twXpltzCriteria);
        }
        
        return 0;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#deleteOnRegisterDelete(com.globaldenso.eca0027.core.business.domain.W2014XtagDomain)
     */
    public W2014XtagDomain deleteOnRegisterDelete(W2014XtagDomain xtag) throws ApplicationException {
        
        // X-Palletize-Work hard delete
        // まとめパレタイズワーク物理削除
        w2014XtagDao.deleteTwXpltz(xtag.getPltzDomainList());
        
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, xtag);
        criteria.setLoginUserDscId(xtag.getPltzDomainList().get(0).getLoginUserDscId());
        
        // Re retrieval
        // 再検索
        return searchOnRegisterInitByFromCreate(criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#deletePltzList(java.util.List)
     */
    public int deletePltzList(List<? extends W2014PltzDomain> pltzList)
        throws ApplicationException {
        return w2014XtagDao.deleteTwXpltz(pltzList);
    }

    // -------------------------------- Transaction system method transact ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W2014XtagDomain)
     */
    
    public W2014XtagDomain transactOnRegister(W2014XtagDomain argXtag) throws ApplicationException {
        
        // Generation of an ERROR CODE LIST
        // エラーコードリストの生成
        List<String> errCdList = new ArrayList<String>();
        
        W2014XtagDomain resultXtag = new W2014XtagDomain();
        
        // Acquisition of X-Palletize No.
        // まとめパレタイズNo.の取得
        String xTagNo = getXtagNo(argXtag.getCompCd(), argXtag.getCurWhCompCd(), argXtag.getCurWhCd(), argXtag.getScreenDateFormat());
        argXtag.setXmainMark(xTagNo);
        
        // N/W of CML, acquisition of G/W
        // CMLのN/W、G/Wの取得
        List<? extends W2014PltzDomain> cmlWeightList = getGwAndNwWeight(argXtag);
        
        // Acquisition of the WEIGHT of exterior cases
        // 外装材の重量の取得
        List<? extends W2014PltzDomain> outerPkgWeightList = getOuterPkgWeight(argXtag);
        if (outerPkgWeightList == null || outerPkgWeightList.isEmpty()) {
            errCdList.add(NXS_E1_0066);
            resultXtag.setErrCdList(errCdList);
            return resultXtag;
        }
        
        // The VOLUME of Outer CD is acquired.
        // Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = getOuterPkgVolume(argXtag);
        if (tmPkgSetHdr == null) {
            errCdList.add(NXS_E1_0066);
            resultXtag.setErrCdList(errCdList);
            return resultXtag;
        } else {
            argXtag.setVolume(commonService.convertVolumeUnit(tmPkgSetHdr.getVolume(), tmPkgSetHdr.getVolumeUnit(), argXtag.getVolumeUnit()));
            if (argXtag.getVolume() == null){
                // An error is made when the digit number of integer part exceeds a maximum.
                // 整数部の桁数が上限を超えた場合はエラー
                Object[] params = {
                    commonService.getResource(argXtag.getLocale(), "label.volume")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            }
        }
        
        // An error is made when RT materials are included in Outer CD.
        // Outer CDにRT材が含まれていればエラー
        List<? extends W2014PltzDomain> rtTypList = getRtTyp(argXtag);
        for (int i = 0; i < rtTypList.size(); i++) {
            if(!RT_TYP_1WAY.equals(rtTypList.get(i).getRtTyp())) {
                throw new GscmApplicationException(NXS_E7_0001);
            }
        }
        
        // Sum total acquisition of G/W, and sum total acquisition [ of N/W ]  * It sets to the applicable item of argXtag.
        // G/Wの合計取得、N/Wの合計取得 ※argXtagの該当項目に設定
        getWeight(argXtag, cmlWeightList, outerPkgWeightList);
        
        // Registration processing (X Palletize)  
        // 登録処理(まとめパレタイズ)
        createTtXpltz(argXtag);
        
        // Delete process (X Palletize Work)
        // 削除処理(まとめパレタイズワーク)
        deleteTwXpltz(argXtag.getLoginUserDscId());
        
        // Update process (Palletize)  
        // 更新処理(パレタイズ)
        updateTtPltz(argXtag);
        
        // Re retrieval
        // 再検索
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        
        // XtagNo
        criteria.setXmainMark(xTagNo);
        
        // Unit relation
        // 単位関連
        criteria.setWeightUnit(argXtag.getWeightUnit());
        criteria.setWeightUnitDisplay(argXtag.getWeightUnitDisplay());
        criteria.setVolumeUnit(argXtag.getVolumeUnit());
        criteria.setVolumeUnitDisplay(argXtag.getVolumeUnitDisplay());
        
        // SERVER ID
        // サーバーID
        criteria.setServerId(argXtag.getServerId());
        
        return searchOnRegisterInitByFromMain(criteria);

    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W2014XtagDomain)
     */
    
    public void transactOnRegisterCancel(W2014XtagDomain xtag) throws ApplicationException {
        
        TtXpltzCriteriaDomain xtagCriteria = new TtXpltzCriteriaDomain();
        
        xtagCriteria.setXmainMark(xtag.getXmainMark());
        
        // Delete process (X Palletize)  
        // 削除処理(まとめパレタイズ)
        ttXpltzService.deleteByCondition(xtagCriteria);
        
        List<W2014PltzCriteriaDomain> pltzCriteriaList = new ArrayList<W2014PltzCriteriaDomain>();
        
        for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
            W2014PltzCriteriaDomain pltzCriteria = new W2014PltzCriteriaDomain();
            pltzCriteria.setMainMark(pltz.getMainMark());
            pltzCriteriaList.add(pltzCriteria);
        }
        
        W2014PltzDomain dummy = new W2014PltzDomain();
        
        // Update process (Palletize)  
        // 更新処理(パレタイズ)
        w2014XtagDao.updateTtPltzByXmainMark(dummy, pltzCriteriaList);
    }
    // -------------------------------- Print system method print ---------------------------------------------------------    
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2014XtagService#printOnRegisterPrintTag(com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain)
     */
    
    public File printOnRegisterPrintTag(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        // A create of PDF list
        // PDF帳票の作成
        return l2004ReportService.searchXtag(criteria.getXmainMark(), criteria.getOwnerCompCd(), criteria.getReportDateFormat());
    }
    
    // -------------------------------- Hereinafter, a protected method ---------------------------------------------------------
    // -------------------------------- 以下、protected メソッド ---------------------------------------------------------
    
    /**
     * X Palletize NO is published.
     * <br />まとめパレタイズNOを発行します。
     *
     * @param compCd A login person's COMPANY CODE<br />ログイン者の会社コード
     * @param curWhCompCd CUR WAREHOUSE COMPANY CODE<br />現在倉庫会社コード
     * @param curWhCd CUR WAREHOUSE CODE<br />現在倉庫コード
     * @param dateFormat Date format<br />日付フォーマット
     * @return Published X Palletize NO<br />発行したまとめパレタイズNO
     * @throws ApplicationException When X Palletize NO is not able to be published<br />まとめパレタイズNOが発行できなかった場合
     */
    @SuppressWarnings("deprecation")
    protected String getXtagNo(String compCd, String curWhCompCd, String curWhCd, String dateFormat) throws ApplicationException {
        // The time zone converted date of a login person's COMPANY CODE is acquired.
        // ログイン者の会社コードのタイムゾーン変換日付を取得
        Date sysdate = DateUtil.convertTime(new Date(), commonService.searchTimezone(compCd));
        
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
        
        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String pltzInstrNoSeqKey 
            = String.format("%s%s%s%s", "X", curWhCompCd, curWhCd, format.format(sysdate).substring(1, 6));
        
        // Consecutive acquisition
        // 連番の取得
        String pltzInstrNoSeq
            = commonService.transactSequence(pltzInstrNoSeqKey, SEQ_TYP_CML_NO_DN, 1, SCREEN_ID_W2016).get(0);
        
        // A return of X Palletize NO
        // まとめパレタイズNOの返却
        return pltzInstrNoSeqKey + pltzInstrNoSeq;
    }
    
    /**
     * N/W of CML and G/W are acquired.
     * <br />CMLのN/W、G/Wを取得します。
     *
     * @param xtag Xtag domain<br />Xtagドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize Work and a Palletize are not able to be referred to<br />まとめパレタイズワーク、パレタイズが参照できなかった場合
     */
    protected List<? extends W2014PltzDomain> getGwAndNwWeight(W2014XtagDomain xtag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        W2014PltzCriteriaDomain criteria = new W2014PltzCriteriaDomain();
        
        // Setting of property
        // プロパティの設定
        criteria.setLoginUserDscId(xtag.getLoginUserDscId());
        
        // N/W of CML, acquisition of G/W
        // CMLのN/W、G/Wの取得
        return w2014XtagDao.searchTtPltzByWeight(criteria);
    }
    
    /**
     * The WEIGHT of exterior cases is acquired.
     * <br />外装材の重量を取得します。
     * 
     * @param xtag Xtag domain<br />Xtagドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a packing combination master (details) and a PKG Materials MA are not able to be referred to<br />包装組合せ原単位(明細)、包装材原単位が参照できなかった場合
     */
    protected List<? extends W2014PltzDomain> getOuterPkgWeight(W2014XtagDomain xtag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        W2014PltzCriteriaDomain criteria = new W2014PltzCriteriaDomain();
        
        // Setting of property
        // プロパティの設定
        criteria.setOuterPkgComCd(xtag.getOuterPkgComCd());
        criteria.setOuterPkgCd(xtag.getOuterPkgCd());
        
        // Acquisition of the WEIGHT of exterior cases
        // 外装材の重量の取得
        return w2014XtagDao.searchTmPkgSetDtl(criteria);
    }
    
    /**
     * The VOLUME of Outer CD is acquired.
     * <br />Outer CDの容積を取得します。
     *
     * @param xtag  Xtag domain<br />Xtagドメイン
     * @return Packing combination master (header) domain<br />包装組合せ原単位(ヘッダ)ドメイン
     * @throws ApplicationException When a packing combination master (header) is not able to be referred to<br />包装組合せ原単位(ヘッダ)が参照できなかった場合
     */
    protected TmPkgSetHdrDomain getOuterPkgVolume(W2014XtagDomain xtag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        TmPkgSetHdrCriteriaDomain criteria = new TmPkgSetHdrCriteriaDomain();
        
        // Setting of property
        // プロパティの設定
        criteria.setOwnerComp(xtag.getOuterPkgComCd());
        criteria.setOuterPkgCd(xtag.getOuterPkgCd());
        
        // Acquisition of the WEIGHT of exterior cases
        // 外装材の重量の取得
        return tmPkgSetHdrService.searchByKey(criteria);
    }

    /**
     * RT Type is acquired.
     * <br />再利用区分を取得します。
     * 
     * @param xtag Xtag domain<br />Xtagドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a packing combination master (details) and a PKG Materials MA are not able to be referred to<br />包装組合せ原単位(明細)、包装材原単位が参照できなかった場合
     */
    protected List<? extends W2014PltzDomain> getRtTyp(W2014XtagDomain xtag) throws ApplicationException {
        
        // A search-condition domain is generated.
        // 検索条件ドメインを生成
        W2014PltzCriteriaDomain criteria = new W2014PltzCriteriaDomain();
        
        // Setting of property
        // プロパティの設定
        criteria.setOuterPkgComCd(xtag.getOuterPkgComCd());
        criteria.setOuterPkgCd(xtag.getOuterPkgCd());
        
        // Acquisition of the RT type.
        // 再利用区分の取得
        return w2014XtagDao.searchTmPkgSetDtlByRtTyp(criteria);
    }
    
    /**
     * N/W and G/W are acquired.
     * <br />N/W、G/Wを取得します。
     *
     * @param xtag Xtag domain<br />Xtagドメイン
     * @param cmlWeightList CML Weight List<br />CML Weight List
     * @param outerPkgWeightList Outer Package Weight List
     * @throws ApplicationException When a packing combination master (header) is not able to be referred to<br />包装組合せ原単位(ヘッダ)が参照できなかった場合
     */
    protected void getWeight(W2014XtagDomain xtag
        , List<? extends W2014PltzDomain> cmlWeightList
        , List<? extends W2014PltzDomain> outerPkgWeightList) throws ApplicationException{
        
        // G/W
        BigDecimal gw = BigDecimal.ZERO;
        // N/W
        BigDecimal nw = BigDecimal.ZERO;
        
        //  G/W, a totalled value calculation of N/W
        // G/W、N/Wの合計値算出
        for (W2014PltzDomain pltz : cmlWeightList) {
            try {
                BigDecimal tmpBd = commonService.convertWeightUnit(pltz.getGrossWeight(), 
                    pltz.getWeightUnit(), xtag.getWeightUnit());
                if (tmpBd == null) {
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    Object[] params = {
                        commonService.getResource(pltz.getLocale(), "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                gw = gw.add(tmpBd);
                tmpBd = null;
                tmpBd = commonService.convertWeightUnit(pltz.getNetWeight(), pltz.getWeightUnit(), xtag.getWeightUnit());
                if (tmpBd == null) {
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    Object[] params = {
                        commonService.getResource(pltz.getLocale(), "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                nw = nw.add(tmpBd);
            } catch (SystemException e) {
                throw new SystemException(NXS_91_0001, e);
            }
        }
        
        // Totalled value calculation of the exterior
        // 外装の合計値算出
        for (W2014PltzDomain pltz : outerPkgWeightList) {
            try {
                BigDecimal tmpBd = commonService.convertWeightUnit(pltz.getGrossWeight(), pltz.getWeightUnit(), xtag.getWeightUnit());
                if (tmpBd == null) {
                    // An error is made when the digit number of integer part exceeds a maximum.
                    // 整数部の桁数が上限を超えた場合はエラー
                    Object[] params = {
                        commonService.getResource(pltz.getLocale(), "label.grossWeight")
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params);
                }
                gw = gw.add(tmpBd);
            } catch (SystemException e) {
                throw new SystemException(NXS_91_0001, e);
            }
        }
        
        int precisionGw = gw.precision() - gw.scale();
        int precisionNw = nw.precision() - nw.scale();
        if (precisionGw > MAX_PRECISION_WEIGHT_UNIT || precisionNw > MAX_PRECISION_WEIGHT_UNIT) {
            // An error is made when the digit number of integer part exceeds a maximum.
            // 整数部の桁数が上限を超えた場合はエラー
            Object[] params = {
                commonService.getResource(xtag.getLocale(), "label.grossWeight")
            };
            throw new GscmApplicationException(NXS_E7_0157, params);
        }
        xtag.setNetWeight(nw);
        xtag.setGrossWeight(gw);
    }
    
    /**
     * A X Palletize is registered.
     * <br />まとめパレタイズを登録します。
     *
     * @param xtag Xtag domain<br />Xtagドメイン
     * @throws ApplicationException When a X Palletize is not able to be accessed<br />まとめパレタイズにアクセスできなかった場合
     */
    protected void createTtXpltz(W2014XtagDomain xtag) throws ApplicationException{
        TtXpltzDomain ttXpltz = new TtXpltzDomain();
        
        // Property setting
        // プロパティ設定
        CommonUtil.copyPropertiesDomainToDomain(ttXpltz, xtag, xtag.getScreenDateFormat());
        
        // PALLET NO / PALLET NO
        // PALLET NO/パレットNO
        ttXpltz.setPalletNo(DEFAULT_PALLET_NO);
        
        // X-TAG PACKING DATE / X-TAG PACKING DATE
        // X-TAG PACKING DATE/まとめ梱包日
        Date d = DateUtil.convertTime(new Date(), xtag.getTimeZone());
        d = DateUtils.truncate(d, Calendar.DAY_OF_MONTH); 
        ttXpltz.setXtagPackingDt(d);

        // DENGER ITEM FLAG / DENGER ITEM FLAG
        // DENGER ITEM FLAG/危険品フラグ
        ttXpltz.setDngrItemFlg(FLAG_N);
        for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
            if (FLAG_Y.compareTo(pltz.getDngrItemFlg()) == 0) {
                ttXpltz.setDngrItemFlg(FLAG_Y);
                break;
            }
        }
        
        
        // Setting of a common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttXpltz, SCREEN_ID_W2017);
        
        ttXpltz.setOuterPkgComCd(xtag.getOuterPkgComCd());
        ttXpltz.setOuterPkgCd(xtag.getOuterPkgCd());
        
        // X-Palletize registration
        // まとめパレタイズ登録
        ttXpltzService.create(ttXpltz);
    }

    /**
     * The hard delete of the X Palletize Work is carried out.
     * <br />まとめパレタイズワークを物理削除します。
     *
     * @param dscId DESC ID
     * @throws ApplicationException When a X Palletize Work is not able to be accessed<br />まとめパレタイズワークにアクセスできなかった場合
     */
    protected void deleteTwXpltz(String dscId) throws ApplicationException{
        TwXpltzCriteriaDomain criteria = new TwXpltzCriteriaDomain();
        
        criteria.setDscId(dscId);
        
        // X-Palletize-Work delete
        // まとめパレタイズワーク削除
        twXpltzService.deleteByCondition(criteria);
    }

    /**
     * X-TAG/X-TAG of a Palletize are updated.
     * <br />パレタイズのX-TAG/まとめメインマークを更新します。
     *
     * @param xtag W2014XtagDomain
     * @throws ApplicationException When a X Palletize Work is not able to be accessed<br />まとめパレタイズワークにアクセスできなかった場合
     */
    protected void updateTtPltz(W2014XtagDomain xtag) throws ApplicationException{
        
        // Setting of a Palletize domain
        // パレタイズドメインの設定
        W2014PltzDomain domain = new W2014PltzDomain();
        domain.setXmainMark(xtag.getXmainMark());
        
        // Setting of a Palletize search-condition domain
        // パレタイズ検索条件ドメインの設定
        List<W2014PltzCriteriaDomain> criteriaList = new ArrayList<W2014PltzCriteriaDomain>();
        
        // Setting of a Palletize domain
        // パレタイズドメインの設定
        for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
            W2014PltzCriteriaDomain criteria = new W2014PltzCriteriaDomain();
            criteria.setMainMark(pltz.getMainMark());
            criteriaList.add(criteria);
        }
        
        // X-TAG/X-TAG of Palletize are updated.
        // パレタイズのX-TAG/まとめメインマークを更新
        w2014XtagDao.updateTtPltzByXmainMark(domain, criteriaList);
    }
}
