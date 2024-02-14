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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0151;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9011R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.dao.W9011CgmCusNoXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9003RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * The search service implementation class of CIGMA Customer No. X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面のService実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6487 $
 */
public class W9011CgmCusNoXRefMaServiceImpl implements W9011CgmCusNoXRefMaService{

    /**
     * commonService/共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * tmCigmaCustomerXrefService/tmCigmaCustomerXrefサービス
     */
    protected TmCigmaCustomerXrefService tmCigmaCustomerXrefService;

    /**
     * w9011CgmCusNoXRefMaDao/CgmCusNoXRefMaダオ
     */
    protected W9011CgmCusNoXRefMaDao w9011CgmCusNoXRefMaDao;

    /**
     * tmNxsCompService/tmNxsCompサービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * Web service call serviceWeb (WS9003)/サービス呼出しサービス (WS9003)
     */
    protected Ws9003RestService ws9003RestService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011CgmCusNoXRefMaServiceImpl() {
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for tmCigmaCustomerXrefService.
     *
     * @param tmCigmaCustomerXrefService Set for tmCigmaCustomerXrefService
     */
    public void setTmCigmaCustomerXrefService(TmCigmaCustomerXrefService 
        tmCigmaCustomerXrefService) {
        this.tmCigmaCustomerXrefService = tmCigmaCustomerXrefService;
    }

    /**
     * Setter method for w9011CgmCusNoXRefMaDao.
     *
     * @param cgmCusNoXRefMaDao Set for w9011CgmCusNoXRefMaDao
     */
    public void setW9011CgmCusNoXRefMaDao(W9011CgmCusNoXRefMaDao cgmCusNoXRefMaDao) {
        w9011CgmCusNoXRefMaDao = cgmCusNoXRefMaDao;
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
     * Setter method for ws9003RestService.
     *
     * @param ws9003RestService Set for ws9003RestService
     */
    public void setWs9003RestService(Ws9003RestService ws9003RestService) {
        this.ws9003RestService = ws9003RestService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Dao to search count for the Consignee.
     * 荷受人の検索結果件数を取得するDaoを呼び出します。
     * 
     * - Get the number of search results.
     *     Call w9011CgmCusNoXRefMaDao.searchCount with criteria as an argument.
     * 
     * - 検索件数の取得
     *       criteriaを引数にw9011CgmCusNoXRefMaDao.searchCountの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #searchCount(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    public int searchCount(W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        return w9011CgmCusNoXRefMaDao.searchCount(criteria);

    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Dao to search for the Consignee.
     * 荷受人の検索結果を取得するDaoを呼び出します。
     * 
     * - Create a list of domain(CgmCusNoXRefMaDomain), return it.
     *     - Transfer the results of w9011CgmCusNoXRefMaDao.searchByConditionForPaging to the list 
     *       of W9011CgmCusNoXRefMaDomain.
     *     - Return the list of W9011CgmCusNoXRefMaDomain.
     *
     * - 検索結果リストドメインW9011CgmCusNoXRefMaDomainのリストを作成し、返却
     *       - w9011CgmCusNoXRefMaDao.searchByConditionForPagingの呼び出し結果を
     *         W9011CgmCusNoXRefMaDomainのリストに移送
     *       - W9011CgmCusNoXRefMaDomainのリストを返却
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    public List<? extends W9011CgmCusNoXRefMaDomain> searchByConditionForPaging(
        W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        return w9011CgmCusNoXRefMaDao.searchByConditionForPaging(criteria);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to locks data on condition of a primary key.
     * 主キーを条件に、データをロックするserviceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call tmCigmaCustomerXrefService.LockByKeyNoWait with criteria as an argument.
     * 
     * - 検索件数の取得
     *       criteriaを引数にtmCigmaCustomerXrefService.LockByKeyNoWaitの呼び出し
     * 
     * This method calls the service to delete data on condition of a primary key.
     * 主キーを条件に、データを物理削除するserviceを呼び出します。
     * 
     * - Get the number of delete results.
     *     Call tmCigmaCustomerXrefService.delete with criteria as an argument.
     * 
     * - 削除件数の取得
     *       deleteDomainを引数にtmCigmaCustomerXrefService.deleteの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #deleteOnInquiryDelete(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    public int deleteOnInquiryDelete(W9011CgmCusNoXRefMaCriteriaDomain criteria) 
        throws ApplicationException {

        TmCigmaCustomerXrefCriteriaDomain deleteDomain = new TmCigmaCustomerXrefCriteriaDomain();
        deleteDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        deleteDomain.setCustomerCd(criteria.getCustomerCd());

        // Data lock.
        TmCigmaCustomerXrefDomain tmCigmaCustomerXref 
            = tmCigmaCustomerXrefService.lockByKeyNoWait(deleteDomain);

        // Company code presence check.
        if (tmCigmaCustomerXref == null) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", 
                Eca0027Constants.GSCM_E0_0010, null));
            throw new ValidationException(errList);
        }

        deleteDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());

        // Delete Selected data.
        int deleteCount = tmCigmaCustomerXrefService.delete(deleteDomain);

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
     * - Authorization check for Company.
     *     Set an Self-screen approval function ID and Company code to argument , 
     *     call {@link userAuthService.hasUserAuthForComp(String)}
     * - Error check.
     * 
     * - エラーリストを作成。
     * - Companyの権限チェックを行います。
     *   自画面認可機能IDと会社コードを引数に
     *   {@link userAuthService.hasUserAuthForComp(String, String)}を呼び出します。
     * - エラー確認。
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #validateConsistencyCompAuth(java.lang.String)
     */
    public void validateConsistencyCompAuth(String compCd) throws ApplicationException{

        // Create error list
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        if (!userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9011R, compCd)) {

            MessageDomain errMsg = new MessageDomain("w9012CriteriaDomain.lgcyLibCompCd", GSCM_I0_0009, null);
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
     * This method calls the Service to search count(1) for the Consignee.
     * 荷受人の検索結果件数(1件)を取得するServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteria 
     *     to TmCigmaCustomerXrefCriteriaDomain criteriaDomain.
     * 
     * - Get search results.
     *     Call tmCigmaCustomerXrefService.searchByCondition with tableCriteriaDomain as an argument.
     * - Copy from search results to displaying Domain on the screen.
     * 
     * - 検索条件の移送
     *       criteriaよりTmCigmaCustomerXrefCriteriaDomain criteriaDomainに検索条件を移送
     * 
     * - 検索結果の取得
     *       tableCriteriaDomainを引数にtmCigmaCustomerXrefService.searchByConditionの呼び出し
     * - 画面表示ドメインに、検索結果をコピー
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #searchByCondition(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain)
     */
    public List< ? extends W9011CgmCusNoXRefMaDomain> 
    searchByCondition(W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        // Set the search criteria.
        TmCigmaCustomerXrefCriteriaDomain criteriaDomain = new TmCigmaCustomerXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        criteriaDomain.setCustomerCd(criteria.getCustomerCd());

        // Get search results.
        List<TmCigmaCustomerXrefDomain> result 
            = tmCigmaCustomerXrefService.searchByCondition(criteriaDomain);

        List<W9011CgmCusNoXRefMaDomain> listDomainList = new ArrayList<W9011CgmCusNoXRefMaDomain>();
        if (result.size() != 0) {

            for (TmCigmaCustomerXrefDomain tmCigmaCustomerXref : result) {
                W9011CgmCusNoXRefMaDomain listDomain = new W9011CgmCusNoXRefMaDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, tmCigmaCustomerXref);
                listDomain.setConsigneeCd(tmCigmaCustomerXref.getCompCd());

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to company existence check.
     * Company存在チェックをするServiceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call CommonService.validateDatabaseCompCd with lgcyLibCompCd as an argument.
     * 
     * - 検索件数の取得
     *       lgcyLibCompCdを引数にCommonService.validateDatabaseCompCdの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService
     *      #validateDatabaseCompCd(java.lang.String)
     */
    public boolean validateDatabaseCompCd(String lgcyLibCompCd)
        throws ApplicationException {

        boolean result = commonService.validateCompCd(lgcyLibCompCd);

        return result;

    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to Consignee existence check.
     * Consignee存在チェックをするServiceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call CommonService.validateConsignee with tableCriteriaDomain as an argument.
     * 
     * - 検索件数の取得
     *       CompCdを引数にCommonService.validateConsigneeの呼び出し
     * </pre>
     */
    public boolean validateDatabaseConsignee(String compCd)
        throws ApplicationException {

        boolean result = commonService.validateConsignee(compCd);

        return result;

    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to Intermediate Flg check.
     * Intermediate FlgチェックをするServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteria 
     *     to TmNxsCompCriteriaDomain criteriaDomain.
     * - Get the number of search results.
     *     Call tmNxsCompService.searchByCondition with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaよりTmNxsCompCriteriaDomain criteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       criteriaDomainを引数にtmNxsCompService.searchByConditionの呼び出し
     * </pre>
     */
    public W9011CgmCusNoXRefMaDomain validateDatabaseIntermediateFlg
    (W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        // Set the search criteria
        TmNxsCompCriteriaDomain criteriaDomain = new TmNxsCompCriteriaDomain();
        criteriaDomain.setCompCd(criteria.getConsigneeCd());

        // Intermediate Flg check.
        List<TmNxsCompDomain> result = tmNxsCompService.searchByCondition(criteriaDomain);

        W9011CgmCusNoXRefMaDomain domain = new W9011CgmCusNoXRefMaDomain();
        if (result.size() != 0) {

            domain.setConsigneeCd(result.get(0).getCompCd());
            domain.setReInvoiceFlg(result.get(0).getIntermediateFlg());

        }

        return domain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to behavior in a batch in the CIGMA night check.
     * CIGMA夜間バッチ中の振る舞いチェックをするServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call commonService.searchCigmaAvailable with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にcommonService.searchCigmaAvailableの呼び出し
     * </pre>
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException {

        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }
  
    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to behavior in a batch in The customer information 
     * existence check (WS (Get Customer Info)) of CIGMA .
     * CIGMAの得意先情報存在チェック(WS(Get Customer Info))をするServiceを呼び出します。
     * 
     * - Set the parameters of the Web service.
     * - Get the Customers.
     *     - The call of the argument ws9003RestService.validateDatabaseCustomer 
     *       compCd, the CustomerCd
     * - Create error list.
     * - Company presence check.
     * 
     * - Webサービスのパラメータ設定
     * - 得意先の取得
     *     - compCd,CustomerCdを引数にws9003RestService.validateDatabaseCustomerの呼び出し
     * - エラーリストを作成
     * - 会社存在チェック
     * </pre>
     */
    public Ws9003ResultDomain validateDatabaseCustomer
    (W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException {

        // Set the parameters of the Web service.
        String compCd = criteria.getLgcyLibCompCd();
        String customerCd = criteria.getCustomerCd();
        Locale locale = criteria.getLocale();

        // Get the Customers.
        Ws9003ResultDomain result
            = ws9003RestService.validateDatabaseCustomer(compCd, customerCd);

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Company presence check.
        if (null == result.getCustomerInfo()) {

            Object[] params = {
                commonService.getResource(locale, "label.customerCd")
            };

            if (MODE_NEW.equals(criteria.getProcMode())) {

                errList.add(new MessageDomain("w9012CriteriaDomain.customerCd", NXS_E7_0151, params));
            } else {
                errList.add(new MessageDomain("", NXS_E7_0151, params));
            }
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        return result;

    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the Service to NEXUS Consignee Cross reference Standard physical unit
     * which carries out registration/updating .
     * NEXUS荷受人クロスリファレンス原単位を登録/更新処理するServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *       Transfer your search criteria from criteria 
     *       to TmCigmaCustomerXrefCriteriaDomain criteriaDomain.
     * 
     * - Lock processing.
     *       Get the number of search results.
     *       Call tmCigmaCustomerXrefService.LockByKeyNoWait with criteriaDomain as an argument.
     * 
     * - Execution of registration and an update process.
     *       It will update, if processing mode is correction.
     *           Call tmCigmaCustomerXrefService.update with criteriaDomain as an argument.
     *           In the case of the updating result 0, an exception occurs. 
     *       It will register, if new. 
     *           Call tmCigmaCustomerXrefService.create with criteriaDomain as an argument.
     *           In the case of the registration result 0, an exception occurs.
     * 
     * - 検索条件の移送
     *       criteriaよりTmCigmaCustomerXrefCriteriaDomain criteriaDomainに検索条件を移送
     * 
     * - ロック処理
     *       検索件数の取得
     *       criteriaDomainを引数にtmCigmaCustomerXrefService.LockByKeyNoWaitの呼び出し
     * 
     * - 登録/更新処理の実行。
     *       処理モードが修正であれば、更新を行う。
     *           criteriaDomainを引数にtmCigmaCustomerXrefService.updateの呼び出し
     *           更新結果0の場合例外発生
     *       新規であれば登録を行う。
     *           criteriaDomainを引数にtmCigmaCustomerXrefService.createの呼び出し
     *           登録結果0の場合例外発生
     * </pre>
     */
    public int transactOnEditRegister(W9011CgmCusNoXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        // Set conditions.
        TmCigmaCustomerXrefCriteriaDomain criteriaDomain = new TmCigmaCustomerXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        criteriaDomain.setCustomerCd(criteria.getCustomerCd());
        criteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());

        if (MODE_EDIT.equals(criteria.getProcMode())) {
            TmCigmaCustomerXrefDomain tmCigmaCustomerXref = 
                tmCigmaCustomerXrefService.lockByKeyNoWait(criteriaDomain);

            // Presence check.
            if (tmCigmaCustomerXref == null) {
                List<MessageDomain> errList = Arrays.asList(new MessageDomain("", 
                    GSCM_E0_0010, null));
                throw new ValidationException(errList);
            }
        }

        int resultCount = 0;

        if (MODE_EDIT.equals(criteria.getProcMode())) {

            // Set conditions.
            TmCigmaCustomerXrefDomain updateDomain = new TmCigmaCustomerXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteria);
            updateDomain.setCompCd(criteria.getConsigneeCd());
            updateDomain.setComUpdateFuncId(SCREEN_ID_W9012);
            updateDomain.setComUpdateUserId(criteria.getLoginUserDscId());

            // Update process.
            resultCount = tmCigmaCustomerXrefService.update(updateDomain);

        }else if (MODE_NEW.equals(criteria.getProcMode())) {

            // Set conditions.
            TmCigmaCustomerXrefDomain createDomain = new TmCigmaCustomerXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(createDomain, criteria);
            createDomain.setCompCd(criteria.getConsigneeCd());
            createDomain.setComCreateUserId(criteria.getLoginUserDscId());
            createDomain.setComCreateFuncId(SCREEN_ID_W9012);
            createDomain.setComUpdateUserId(criteria.getLoginUserDscId());
            createDomain.setComUpdateFuncId(SCREEN_ID_W9012);

            try {

                // Registration processing.
                tmCigmaCustomerXrefService.create(createDomain);
            } catch (Exception e) {

                throw new GscmApplicationException(GSCM_E0_0020);
            }

            ++resultCount;
        }
        return resultCount;

    }

}
