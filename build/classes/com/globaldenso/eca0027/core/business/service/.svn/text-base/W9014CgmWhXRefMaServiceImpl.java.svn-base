/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0152;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0153;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9014R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.business.dao.W9014CgmWhXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws9005RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面のService実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public class W9014CgmWhXRefMaServiceImpl implements W9014CgmWhXRefMaService{

    /**
     * commonService/共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * Web service call serviceWeb (WS9002)/サービス呼出しサービス (WS9002)
     */
    protected Ws9002RestService ws9002RestService;

    /**
     * Web service call serviceWeb (WS9005)/サービス呼出しサービス (WS9005)
     */
    protected Ws9005RestService ws9005RestService;

    /**
     * tmCigmaWhXrefService/tmCigmaWhXrefServiceサービス
     */
    private TmCigmaWhXrefService tmCigmaWhXrefService;
    
    /**
     * W9014CgmWhXRefMaDao/W9014CgmWhXRefMaダオ
     */
    private W9014CgmWhXRefMaDao w9014CgmWhXRefMaDao;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014CgmWhXRefMaServiceImpl() {
    }

    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>Setter method for userAuthService.</p>
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * <p>Setter method for w9014CgmWhXRefMaDao.</p>
     *
     * @param w9014CgmWhXRefMaDao Set for w9014CgmWhXRefMaDao
     */
    public void setW9014CgmWhXRefMaDao(W9014CgmWhXRefMaDao w9014CgmWhXRefMaDao) {
        this.w9014CgmWhXRefMaDao = w9014CgmWhXRefMaDao;
    }

    /**
      * <p>Setter method for tmCigmaWhXrefService.</p>
      *
      * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
      */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * <p>Setter method for ws9002RestService.</p>
     *
     * @param ws9002RestService Set for ws9002RestService
     */
    public void setWs9002RestService(Ws9002RestService ws9002RestService) {
        this.ws9002RestService = ws9002RestService;
    }

    /**
     * <p>Setter method for ws9005RestService.</p>
     *
     * @param ws9005RestService Set for ws9005RestService
     */
    public void setWs9005RestService(Ws9005RestService ws9005RestService) {
        this.ws9005RestService = ws9005RestService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Dao to search count for the W/H.
     * 倉庫の検索結果件数を取得するDaoを呼び出します。
     * 
     * - Get the number of search results.
     *     Call W9014CgmWhXRefMaDao.searchCount with criteria as an argument.
     * 
     * - 検索件数の取得
     *       w9014CgmWhXRefMaCriteriaDomainを引数にW9014CgmWhXRefMaDao.searchCountの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService#searchCount(com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public int searchCount(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws 
        ApplicationException {

        return w9014CgmWhXRefMaDao.searchCount(w9014CgmWhXRefMaCriteriaDomain);

    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Dao to search for the W/H.
     * 倉庫の検索結果を取得するDaoを呼び出します。
     * 
     * - Create a list of domain(W9014CgmWhXRefMaDomain), return it.
     *     - Transfer the results of w9014CgmWhXRefMaDao.searchByConditionForPaging to the list of W9014CgmWhXRefMaDomain.
     *     - Return the list of W9014CgmWhXRefMaDomain.
     *
     * - 検索結果リストドメインW9014CgmWhXRefMaDomainのリストを作成し、返却
     *       - W9014CgmWhXRefMaDao.searchByConditionForPagingの呼び出し結果をW9014CgmWhXRefMaDomainのリストに移送
     *       - W9014CgmWhXRefMaDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService#searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public List<? extends W9014CgmWhXRefMaDomain> searchByConditionForPaging(
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException {

        return w9014CgmWhXRefMaDao.searchByConditionForPaging(w9014CgmWhXRefMaCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to locks data on condition of a primary key.
     * 主キーを条件に、データをロックするserviceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call tmCigmaWhXrefService.LockByKeyNoWait with criteria as an argument.
     * 
     * - 検索件数の取得
     *       criteriaを引数にtmCigmaWhXrefService.LockByKeyNoWaitの呼び出し
     * 
     * This method calls the service to delete data on condition of a primary key.
     * 主キーを条件に、データを物理削除するserviceを呼び出します。
     * 
     * - Get the number of delete results.
     *     Call tmCigmaWhXrefService.searchCount with criteria as an argument.
     * 
     * - 削除件数の取得
     *       deleteDomainを引数にtmCigmaWhXrefService.deleteの呼び出し
     * </pre>

     * @see com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService#deleteOnInquiryDelete(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public int deleteOnInquiryDelete(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) 
        throws ApplicationException {

        // Set the search criteria.
        TmCigmaWhXrefCriteriaDomain deleteDomain = new TmCigmaWhXrefCriteriaDomain();
        deleteDomain.setLgcyLibCompCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyLibCompCd());
        deleteDomain.setLgcyWhCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyWhCd());
        deleteDomain.setPlntCd(w9014CgmWhXRefMaCriteriaDomain.getPlntCd());

        // Data lock.
        TmCigmaWhXrefDomain tmCigmaWhXref = tmCigmaWhXrefService.lockByKeyNoWait(deleteDomain);

        // Company code presence check.
        if (tmCigmaWhXref == null) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", 
                Eca0027Constants.GSCM_E0_0010, null));
            throw new ValidationException(errList);
        }

        deleteDomain.setComUpdateTimestamp(w9014CgmWhXRefMaCriteriaDomain.getComUpdateTimestamp());

        // Delete Selected data.
        int deleteCount = tmCigmaWhXrefService.delete(deleteDomain);

        if (deleteCount == 0 ) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", 
                Eca0027Constants.GSCM_E0_0010, null));
            throw new ValidationException(errList);
        }
        return deleteCount;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * 権限チェック(Company)
     * Authority check (Company) 
     * 
     * - Create error list.
     * - Error check.
     * 
     * - エラーリストを作成。
     * - エラー確認。
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.CgmCusNoXRefMaService
     *      #validateConsistencyCompAuth(
     *      java.lang.String, java.lang.String)
     */
    public void validateConsistencyCompAuth(String compCd) throws ApplicationException{

        // Create error list
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        if (!userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9014R, compCd)) {
            MessageDomain errMsg = new MessageDomain("w9015CriteriaDomain.lgcyLibCompCd", 
                GSCM_I0_0009, null);
            errorList.add(errMsg);
        }

        // Error check.
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }

    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the Service to search result(1) for the W/H.
     * 倉庫の検索結果(1件)を取得するServiceを呼び出します。
     * 
     * - Get the search results.
     *     Call tmCigmaWhXrefService.searchByCondition with criteriaDomain as an argument.
     * - Transfer your search results.
     *     Transfer your search results from result to W9014CgmWhXRefMaDomain w9014CgmWhXRefMaDomain.
     * 
     * - 検索結果の取得
     *       criteriaDomainを引数にtmCigmaWhXrefService.searchByConditionの呼び出し
     * - 検索結果の移送
     *       resultよりW9014CgmWhXRefMaDomain w9014CgmWhXRefMaDomainに検索条件を移送
     * 
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService#searchByCondition(
     *      com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public List< ? extends W9014CgmWhXRefMaDomain> 
    searchByCondition(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) 
        throws ApplicationException {

        // Set the search criteria.
        TmCigmaWhXrefCriteriaDomain criteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyLibCompCd());
        criteriaDomain.setLgcyWhCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyWhCd());
        criteriaDomain.setPlntCd(w9014CgmWhXRefMaCriteriaDomain.getPlntCd());
        
        // Get search results.
        List<TmCigmaWhXrefDomain> result = tmCigmaWhXrefService.searchByCondition(criteriaDomain);

        List<W9014CgmWhXRefMaDomain> w9014CgmWhXRefMaDomainList = new ArrayList<W9014CgmWhXRefMaDomain>();
        if (result.size() != 0) {

            for (TmCigmaWhXrefDomain tmCigmaWhXref : result) {
                W9014CgmWhXRefMaDomain w9014CgmWhXRefMaDomain = new W9014CgmWhXRefMaDomain();
                
                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(w9014CgmWhXRefMaDomain, tmCigmaWhXref);

                w9014CgmWhXRefMaDomainList.add(w9014CgmWhXRefMaDomain);
            }
        }

        return w9014CgmWhXRefMaDomainList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to company existence check.
     * Company存在チェックをするServiceを呼び出します。
     * 
     * - Call CommonService.validateDatabaseCompCd with lgcyLibCompCd as an argument.
     * 
     * - lgcyLibCompCdを引数にCommonService.validateDatabaseCompCdの呼び出し
     * 
     */
    public boolean validateDatabaseCompCd(String lgcyLibCompCd)
        throws ApplicationException {

        boolean result = commonService.validateCompCd(lgcyLibCompCd);

        return result;

    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to W/H company and W/H combination check.
     * W/H会社、W/Hの組み合わせチェックを行う。
     * 
     * - Call CommonService.validateCompWh with compCd and whCd as an argument.
     * 
     * - compCd,whCdを引数にCommonService.validateCompWhの呼び出し
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException {
        
        boolean resulet1 = commonService.validateCompWh(compCd, whCd);
        
        return resulet1 ;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to behavior in a batch in the CIGMA night check.
     * CIGMA夜間バッチ中の振る舞いチェックをするServiceを呼び出します。
     * 
     * - Call commonService.searchCigmaAvailable with isShipping24hFunc and compCd as an argument.
     * 
     * - isShipping24hFunc,compCdを引数にcommonService.searchCigmaAvailableの呼び出し
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException {

        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Dao to search count for the W/H.
     * 倉庫の検索結果件数を取得するDaoを呼び出します。
     * 
     * - Get the number of search results.
     *     Call W9014CgmWhXRefMaDao.searchCountTmCigmaWhXref with w9014CgmWhXRefMaCriteriaDomain
     *     as an argument.
     * 
     * - 検索件数の取得
     *     w9014CgmWhXRefMaCriteriaDomainを引数にW9014CgmWhXRefMaDao.searchCountTmCigmaWhXrefの呼び出し
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService#searchCount(com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaCriteriaDomain)
     */
    public int validateDatabaseNexusWhWh(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException {

        return w9014CgmWhXRefMaDao.searchCountTmCigmaWhXref(w9014CgmWhXRefMaCriteriaDomain);

    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to behavior in a batch in The W/H information 
     * existence check (WS (Get W/H Info)) of CIGMA .
     * CIGMAの倉庫情報存在チェック(WS(Get W/H Info))をするServiceを呼び出します。
     * 
     * - Set the parameters of the Web service.
     * - Get the W/H.
     *     - The call of the argument ws9005RestService.validateDatabaseWh 
     *       compCd, lgcyWhCd
     * - Create error list.
     * - Company presence check.
     * 
     * - Webサービスのパラメータ設定
     * - 倉庫の取得
     *     - compCd,lgcyWhCdを引数にws9005RestService.validateDatabaseWhの呼び出し
     * - エラーリストを作成
     * - 会社存在チェック
     * </pre>
     */
    public void validateDatabaseWh
    (W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException {

        // Set the parameters of the Web service.
        String compCd = w9014CgmWhXRefMaCriteriaDomain.getLgcyLibCompCd();
        String lgcyWhCd = w9014CgmWhXRefMaCriteriaDomain.getLgcyWhCd();
        Locale locale = w9014CgmWhXRefMaCriteriaDomain.getLocale();
//        String procMode = w9014CgmWhXRefMaCriteriaDomain.getProcMode();

        // Get the Customers.
        Ws9005ResultDomain result
            = ws9005RestService.validateDatabaseWh(lgcyWhCd, compCd);

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Company presence check.
        if (null == result.getWhInfo()) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyWhCd")
            };

            if(MODE_NEW.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())){

                errList.add(new MessageDomain("w9015CriteriaDomain.lgcyWhCd", 
                    NXS_E7_0152, params));

            }else{

                errList.add(new MessageDomain("", NXS_E7_0152, params));
            }

        } else {

            int index = result.getWhInfo().getWh().indexOf(lgcyWhCd);
            if (index == -1) {

                Object[] params = {
                    commonService.getResource(locale, "label.lgcyWhCd")
                };

                if(MODE_NEW.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())){

                    errList.add(new MessageDomain("w9015CriteriaDomain.lgcyWhCd", 
                        NXS_E7_0152, params));

                }else{

                    errList.add(new MessageDomain("", NXS_E7_0152, params));
                }
            }
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to behavior in a batch in The plant information 
     * existence check (WS (Get plant Info)) of CIGMA .
     * CIGMAの製造部工場区分情報存在チェック(WS(Get plant Info))をするServiceを呼び出します。
     * 
     * - Set the parameters of the Web service.
     * - Get the plant.
     *     - The call of the argument ws9002RestService.validateDatabasePlant 
     *       compCd, plntCd
     * - Create error list.
     * - Company presence check.
     * 
     * - Webサービスのパラメータ設定
     * - 製造部工場区分の取得
     *     - compCd,plntCdを引数にws9002RestService.validateDatabasePlantの呼び出し
     * - エラーリストを作成
     * - 会社存在チェック
     * </pre>
     */
    public void validateDatabasePlant
    (W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException {

        // Set the parameters of the Web service.
        String compCd = w9014CgmWhXRefMaCriteriaDomain.getLgcyLibCompCd();
        String plntCd = w9014CgmWhXRefMaCriteriaDomain.getPlntCd();
        Locale locale = w9014CgmWhXRefMaCriteriaDomain.getLocale();
//        String procMode = w9014CgmWhXRefMaCriteriaDomain.getProcMode();

        // Get the Customers.
        Ws9002ResultDomain result
            = ws9002RestService.validateDatabasePlant(compCd, plntCd);

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Company presence check.
        if (null == result.getPlantInfo()) {

            Object[] params = {
                commonService.getResource(locale, "label.plntCd")
            };

            if(MODE_NEW.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())){

                errList.add(new MessageDomain("w9015CriteriaDomain.plntCd", NXS_E7_0153, params));

            }else{

                errList.add(new MessageDomain("", NXS_E7_0153, params));

            }

        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to NEXUS W/H Cross reference Standard physical unit
     * which carries out registration/updating .
     * 倉庫クロスリファレンス原単位を登録/更新処理するServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *       Transfer your search criteria from w9014CgmWhXRefMaCriteriaDomain 
     *       to TmCigmaWhXrefCriteriaDomain criteriaDomain.
     * 
     * - Lock processing.
     *       Get the number of search results.
     *       Call tmCigmaWhXrefService.LockByKeyNoWait with criteriaDomain as an argument.
     * 
     * - Execution of registration and an update process.
     *       It will update, if processing mode is correction.
     *           Call tmCigmaWhXrefService.update with criteriaDomain as an argument.
     *           In the case of the updating result 0, an exception occurs. 
     *       It will register, if new. 
     *           Call tmCigmaWhXrefService.create with criteriaDomain as an argument.
     *           In the case of the registration result 0, an exception occurs.
     * 
     * - 検索条件の移送
     *       w9014CgmWhXRefMaCriteriaDomainよりtmCigmaWhXrefCriteriaDomain criteriaDomainに検索条件を移送
     * 
     * - ロック処理
     *       検索件数の取得
     *       criteriaDomainを引数にtmCigmaWhXrefService.LockByKeyNoWaitの呼び出し
     * 
     * - 登録/更新処理の実行。
     *       処理モードが修正であれば、更新を行う。
     *           criteriaDomainを引数にtmCigmaWhXrefService.updateの呼び出し
     *           更新結果0の場合例外発生
     *       新規であれば登録を行う。
     *           criteriaDomainを引数にtmCigmaWhXrefService.createの呼び出し
     *           登録結果0の場合例外発生
     * </pre>
     */
    public int transactOnEditRegister(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain)
        throws ApplicationException {

        // Set conditions.
        TmCigmaWhXrefCriteriaDomain criteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyLibCompCd());
        criteriaDomain.setLgcyWhCd(w9014CgmWhXRefMaCriteriaDomain.getLgcyWhCd());
        criteriaDomain.setPlntCd(w9014CgmWhXRefMaCriteriaDomain.getPlntCd());
        criteriaDomain.setComUpdateTimestamp(
            w9014CgmWhXRefMaCriteriaDomain.getComUpdateTimestamp());

        if (MODE_EDIT.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())) {
            TmCigmaWhXrefDomain tmCigmaWhXref = 
                tmCigmaWhXrefService.lockByKeyNoWait(criteriaDomain);

            // Presence check.
            if (tmCigmaWhXref == null) {
                List<MessageDomain> errList = Arrays.asList(new MessageDomain("", 
                    GSCM_E0_0010, null));
                throw new ValidationException(errList);
            }
        }

        int resultCount = 0;
        
        if (MODE_EDIT.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())) {

            // Set conditions.
            TmCigmaWhXrefDomain updateDomain = new TmCigmaWhXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(updateDomain, w9014CgmWhXRefMaCriteriaDomain);
            updateDomain.setCompCd(w9014CgmWhXRefMaCriteriaDomain.getCompCd());
            updateDomain.setWhCd(w9014CgmWhXRefMaCriteriaDomain.getWhCd());
            updateDomain.setComUpdateUserId(w9014CgmWhXRefMaCriteriaDomain.getLoginUserDscId());
            updateDomain.setComUpdateFuncId(SCREEN_ID_W9015);

            // Update process.
            resultCount = tmCigmaWhXrefService.update(updateDomain);

        }else if (MODE_NEW.equals(w9014CgmWhXRefMaCriteriaDomain.getProcMode())) {

            // Set conditions.
            TmCigmaWhXrefDomain createDomain = new TmCigmaWhXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(createDomain, w9014CgmWhXRefMaCriteriaDomain);
            createDomain.setCompCd(w9014CgmWhXRefMaCriteriaDomain.getCompCd());
            createDomain.setWhCd(w9014CgmWhXRefMaCriteriaDomain.getWhCd());
            createDomain.setComCreateUserId(w9014CgmWhXRefMaCriteriaDomain.getLoginUserDscId());
            createDomain.setComCreateFuncId(SCREEN_ID_W9015);
            createDomain.setComUpdateUserId(w9014CgmWhXRefMaCriteriaDomain.getLoginUserDscId());
            createDomain.setComUpdateFuncId(SCREEN_ID_W9015);

            try {

                // Registration processing.
                tmCigmaWhXrefService.create(createDomain);
            } catch (Exception e) {

                throw new GscmApplicationException(GSCM_E0_0020);
            }

            ++resultCount;
        }
        return resultCount;

    }

}