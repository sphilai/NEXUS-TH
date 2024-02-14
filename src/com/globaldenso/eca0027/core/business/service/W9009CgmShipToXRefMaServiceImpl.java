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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0027;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.dao.W9009CgmShipToXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9004RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of CIGMA Ship to X-Reference MA
 * Screen. <br />
 * CIGMA Ship to X-Reference MA画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 8056 $
 */
public class W9009CgmShipToXRefMaServiceImpl implements
    W9009CgmShipToXRefMaService {

    /**
     * commonService/共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * tmCigmaShipToXrefService/tmCigmaShipToXrefサービス
     */
    protected TmCigmaShipToXrefService tmCigmaShipToXrefService;

    /**
     * W9009CgmShipToXRefMaDao/W9009CgmShipToXRefMaダオ
     */
    protected W9009CgmShipToXRefMaDao w9009CgmShipToXRefMaDao;

    /**
     * tmNxsCompService/tmNxsCompサービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * Web service call serviceWeb (WS9004)/サービス呼出しサービス (WS9004)
     */
    protected Ws9004RestService ws9004RestService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009CgmShipToXRefMaServiceImpl() {
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
     * <p>
     * Setter method for userAuthService.
     * </p>
     * 
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
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
     * Setter method for w9009CgmShipToXRefMaDao.
     * 
     * @param w9009CgmShipToXRefMaDao Set for w9009CgmShipToXRefMaDao
     */
    public void setW9009CgmShipToXRefMaDao(
        W9009CgmShipToXRefMaDao w9009CgmShipToXRefMaDao) {
        this.w9009CgmShipToXRefMaDao = w9009CgmShipToXRefMaDao;
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
     * Setter method for ws9004RestService.
     * 
     * @param ws9004RestService Set for ws9004RestService
     */
    public void setWs9004RestService(Ws9004RestService ws9004RestService) {
        this.ws9004RestService = ws9004RestService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Dao to search count for the Ship to.
     * 送荷先の検索結果件数を取得するDaoを呼び出します。
     * 
     * - Get the number of search results.
     *     Call W9009CgmShipToXRefMaDao.searchCount with criteria as an argument.
     * 
     * - 検索件数の取得
     *       criteriaを引数にW9009CgmShipToXRefMaDao.searchCountの呼び出し
     * 
     * &#064;see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService
     *      #searchCount(com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     * 
     */
    public int searchCount(W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        return w9009CgmShipToXRefMaDao.searchCount(criteria);

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Dao to search for the Ship to.
     * 送荷先の検索結果を取得するDaoを呼び出します。
     * 
     * - Create a list of domain(W9009CgmShipToXRefMaDomain), return it.
     *     - Transfer the results of w9009CgmShipToXRefMaDao.searchByConditionForPaging to the list 
     *       of W9009CgmShipToXRefMaDomain.
     *     - Return the list of W9009CgmShipToXRefMaDomain.
     * 
     * - 検索結果リストドメインW9009CgmShipToXRefMaDomainのリストを作成し、返却
     *       - W9009CgmShipToXRefMaDao.searchByConditionForPagingの呼び出し結果を
     *         W9009CgmShipToXRefMaDomainのリストに移送
     *       - W9009CgmShipToXRefMaDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService
     *      #searchByConditionForPaging
     *      (com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     */
    public List<? extends W9009CgmShipToXRefMaDomain> searchByConditionForPaging(
        W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        return w9009CgmShipToXRefMaDao.searchByConditionForPaging(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * This method calls the service to locks data on condition of a primary key.
     * 主キーを条件に、データをロックするserviceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call tmCigmaShipToXrefService.LockByKeyNoWait with criteria as an argument.
     * 
     * - 検索件数の取得
     *       criteriaを引数にtmCigmaShipToXrefService.LockByKeyNoWaitの呼び出し
     * 
     * This method calls the service to delete data on condition of a primary key.
     * 主キーを条件に、データを物理削除するserviceを呼び出します。
     * 
     * - Get the number of delete results.
     *     Call tmCigmaShipToXrefService.searchCount with criteria as an argument.
     * 
     * - 削除件数の取得
     *       deleteDomainを引数にtmCigmaShipToXrefService.deleteの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService#deleteOnInquiryDelete(
     *      com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     */
    public int deleteOnInquiryDelete(W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        TmCigmaShipToXrefCriteriaDomain deleteDomain = new TmCigmaShipToXrefCriteriaDomain();
        deleteDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        deleteDomain.setCustomerCd(criteria.getCustomerCd());
        deleteDomain.setLgcyShipTo(criteria.getLgcyShipTo());
        deleteDomain.setShipToCd(criteria.getShipToCd());

        // Data lock.
        TmCigmaShipToXrefDomain tmCigmaShipToXref = tmCigmaShipToXrefService
            .lockByKeyNoWait(deleteDomain);

        // Company code presence check.
        if (tmCigmaShipToXref == null) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("",
                Eca0027Constants.GSCM_E0_0010, null));
            throw new ValidationException(errList);
        }

        deleteDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());

        // Delete Selected data.
        int deleteCount = tmCigmaShipToXrefService.delete(deleteDomain);

        if (deleteCount == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("",
                Eca0027Constants.GSCM_E0_0010, null));
            throw new ValidationException(errList);
        }
        return deleteCount;
    }

    /**
     * {@inheritDoc}.
     * 
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
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService
     *      #validateConsistencyCompAuth( java.lang.String, java.lang.String)
     */
    public void validateConsistencyCompAuth(String compCd)
        throws ApplicationException {

        // Create error list
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        if (!userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9009R, compCd)) {
            MessageDomain errMsg = new MessageDomain(
                "w9010CriteriaDomain.lgcyLibCompCd", GSCM_I0_0009, null);
            errorList.add(errMsg);
        }

        // Error check.
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }

    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * This method calls the Service to search count(1) for the Ship to.
     * 送荷先の検索結果件数(1件)を取得するServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteria 
     *     to TmCigmaShipToXrefCriteriaDomain criteriaDomain.
     * 
     * - Get search results.
     *     Call tmCigmaShipToXrefService.searchByCondition with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaよりTmCigmaShipToXrefCriteriaDomain criteriaDomainに検索条件を移送
     * 
     * - 検索結果の取得
     *       tableCriteriaDomainを引数にtmCigmaShipToXrefService.searchByConditionの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService
     *      #searchByCondition(
     *      com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     */
    public List<? extends W9009CgmShipToXRefMaDomain> searchByCondition(
        W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        // Set the search criteria.
        TmCigmaShipToXrefCriteriaDomain criteriaDomain = new TmCigmaShipToXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        criteriaDomain.setCustomerCd(criteria.getCustomerCd());
        criteriaDomain.setLgcyShipTo(criteria.getLgcyShipTo());

        // Get search results.
        List<TmCigmaShipToXrefDomain> result = tmCigmaShipToXrefService
            .searchByCondition(criteriaDomain);

        List<W9009CgmShipToXRefMaDomain> listDomainList = new ArrayList<W9009CgmShipToXRefMaDomain>();

        if (result.size() != 0) {

            for (TmCigmaShipToXrefDomain tmCigmaShipToXref : result) {
                W9009CgmShipToXRefMaDomain listDomain = new W9009CgmShipToXRefMaDomain();

                CommonUtil.copyPropertiesDomainToDomain(listDomain,
                    tmCigmaShipToXref);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to company existence check.
     * Company存在チェックをするServiceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call CommonService.validateDatabaseCompCd with lgcyLibCompCd as an argument.
     * 
     * - 検索件数の取得
     *       lgcyLibCompCdを引数にCommonService.validateDatabaseCompCdの呼び出し
     * &#064;see com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService
     *      #validateDatabaseCompCd(
     *      com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     * 
     */
    public boolean validateDatabaseCompCd(String lgcyLibCompCd)
        throws ApplicationException {

        boolean result = commonService.validateCompCd(lgcyLibCompCd);

        return result;

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to Ship to existence check.
     * Ship to存在チェックをするServiceを呼び出します。
     * 
     * - Get the number of search results.
     *     Call CommonService.validateShip to with tableCriteriaDomain as an argument.
     * 
     * - 検索件数の取得
     *       CompCdを引数にCommonService.validateShip toの呼び出し
     * 
     */
    public boolean validateDatabaseConsignee(String compCd)
        throws ApplicationException {

        boolean result = commonService.validateConsignee(compCd);

        return result;

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to behavior in a batch in the CIGMA night check.
     * CIGMA夜間バッチ中の振る舞いチェックをするServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9009CgmShipToXRefMaCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call commonService.searchCigmaAvailable with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にcommonService.searchCigmaAvailableの呼び出し
     * 
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc,
        String compCd) throws ApplicationException {

        return commonService.searchCigmaAvailable(isShipping24hFunc, compCd);
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to NEXUS Ship to Cross reference Standard physical unit
     * which carries out registration/updating .
     * NEXUS送荷先クロスリファレンス原単位を登録/更新処理するServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *       Transfer your search criteria from criteria 
     *       to TmCigmaShipToXrefCriteriaDomain criteriaDomain.
     * 
     * - Lock processing.
     *       Get the number of search results.
     *       Call tmCigmaShipToXrefService.LockByKeyNoWait with criteriaDomain as an argument.
     * 
     * - Execution of registration and an update process.
     *       It will update, if processing mode is correction.
     *           Call tmCigmaShipToXrefService.update with criteriaDomain as an argument.
     *           In the case of the updating result 0, an exception occurs. 
     *       It will register, if new. 
     *           Call tmCigmaShipToXrefService.create with criteriaDomain as an argument.
     *           In the case of the registration result 0, an exception occurs.
     * 
     * - 検索条件の移送
     *       criteriaよりTmCigmaShipToXrefCriteriaDomain criteriaDomainに検索条件を移送
     * 
     * - ロック処理
     *       検索件数の取得
     *       criteriaDomainを引数にtmCigmaShipToXrefService.LockByKeyNoWaitの呼び出し
     * 
     * - 登録/更新処理の実行。
     *       処理モードが修正であれば、更新を行う。
     *           criteriaDomainを引数にtmCigmaShipToXrefService.updateの呼び出し
     *           更新結果0の場合例外発生
     *       新規であれば登録を行う。
     *           criteriaDomainを引数にtmCigmaShipToXrefService.createの呼び出し
     *           登録結果0の場合例外発生
     * </pre>
     */
    public int transactOnEditRegister(
        W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        // Set conditions.
        TmCigmaShipToXrefCriteriaDomain criteriaDomain = new TmCigmaShipToXrefCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
        criteriaDomain.setCustomerCd(criteria.getCustomerCd());
        criteriaDomain.setLgcyShipTo(criteria.getLgcyShipTo());
        criteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());

        if (MODE_EDIT.equals(criteria.getProcMode())) {
            TmCigmaShipToXrefDomain tmCigmaShipToXref = tmCigmaShipToXrefService
                .lockByKeyNoWait(criteriaDomain);

            // Presence check.
            if (tmCigmaShipToXref == null) {
                List<MessageDomain> errList = Arrays.asList(new MessageDomain(
                    "", GSCM_E0_0010, null));
                throw new ValidationException(errList);
            }
        }

        int resultCount = 0;

        if (MODE_EDIT.equals(criteria.getProcMode())) {

            // Set conditions.
            TmCigmaShipToXrefDomain updateDomain = new TmCigmaShipToXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteria);
            updateDomain.setComUpdateFuncId(SCREEN_ID_W9010);
            updateDomain.setComUpdateUserId(criteria.getLoginUserDscId());

            // Update process.
            resultCount = tmCigmaShipToXrefService.update(updateDomain);

        } else if (MODE_NEW.equals(criteria.getProcMode())) {

            // Set conditions.
            TmCigmaShipToXrefDomain createDomain = new TmCigmaShipToXrefDomain();
            CommonUtil.copyPropertiesDomainToDomain(createDomain, criteria);
            createDomain.setLgcyLibCompCd(criteria.getLgcyLibCompCd());
            createDomain.setCustomerCd(criteria.getCustomerCd());
            createDomain.setLgcyShipTo(criteria.getLgcyShipTo());
            createDomain.setComCreateUserId(criteria.getLoginUserDscId());
            createDomain.setComCreateFuncId(SCREEN_ID_W9010);
            createDomain.setComUpdateUserId(criteria.getLoginUserDscId());
            createDomain.setComUpdateFuncId(SCREEN_ID_W9010);

            try {

                // Registration processing.
                tmCigmaShipToXrefService.create(createDomain);
            } catch (Exception e) {

                throw new GscmApplicationException(GSCM_E0_0020);
            }

            ++resultCount;
        } else {

        }
        return resultCount;

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to NEXUS Ship To existence check.
     * NEXUS Ship To存在チェックをするServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to String lgcyShipTo.
     * - Get search results.
     *     Call CommonService.validateShipTo with CompCd as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりString ShipToCdに検索条件を移送
     * - 検索結果の取得
     *       ShipToCdを引数にCommonService.validateShipToの呼び出し
     * 
     * &#064;see com.globaldenso.eca0027.core.business.service.CgmShipToXRefMaService
     *      #validateDatabaseShipTo(
     *      com.globaldenso.eca0027.core.business.domain.CgmShipToXRefMaCriteriaDomain)
     * 
     */
    public boolean validateDatabaseShipTo(String lgcyShipTo)
        throws ApplicationException {

        boolean result = commonService.validateShipTo(lgcyShipTo);
        return result;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the Service to behavior in a batch in The shipment information 
     * check of CIGMA .
     * CIGMAの送荷先情報存在チェックをするServiceを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9009CgmShipToXRefMaCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call ws9004RestService.validateDatabaseShipTo with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にws9004RestService.validateDatabaseShipToの呼び出し
     * 
     */
    public void validateDatabaseShipTo(
        W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException {

        // Set the parameters of the Web service.
        String compCd = criteria.getLgcyLibCompCd();
        String customerCd = criteria.getCustomerCd();
        String lgcyShipTo = criteria.getLgcyShipTo();
        Locale locale = criteria.getLocale();

        // 得意先の取得
        // Get the Customers.
        Ws9004ResultDomain result = ws9004RestService.validateDatabaseShipTo(
            compCd, customerCd, lgcyShipTo);

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Company presence check.
        if (null == result.getShipToInfo()) {

            Object[] params = {
                commonService.getResource(locale, "label.customerCd"),
                commonService.getResource(locale, "label.lgcyShipTo")};

            if (MODE_NEW.equals(criteria.getProcMode())) {

                errList.add(new MessageDomain("w9010CriteriaDomain.customerCd",
                    NXS_E7_0027, params));
                errList.add(new MessageDomain("w9010CriteriaDomain.lgcyShipTo",
                    null, null));

            } else {
                errList.add(new MessageDomain("", NXS_E7_0027, params));

            }

        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }

}