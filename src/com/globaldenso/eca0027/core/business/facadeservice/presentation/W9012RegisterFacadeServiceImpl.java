/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0109;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9012;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9012UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The update service facade implementation class of CIGMA Customer No. X-Reference MA Edit
 * Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面の更新処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 6675 $
 */
public class W9012RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<Integer, W9012UpdateDomain> {

    /**
     * common Service/共通サービス
     */
    private CommonService commonService;

    /**
     * w9011CgmCusNoXRefMaService/w9011CgmCusNoXRefMaサービス
     */
    private W9011CgmCusNoXRefMaService w9011CgmCusNoXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9012RegisterFacadeServiceImpl() {
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
     * Setter method for w9011CgmCusNoXRefMaService.
     *
     * @param cgmCusNoXRefMaService Set for w9011CgmCusNoXRefMaService
     */
    public void setW9011CgmCusNoXRefMaService(W9011CgmCusNoXRefMaService cgmCusNoXRefMaService) {
        w9011CgmCusNoXRefMaService = cgmCusNoXRefMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9012UpdateDomain filterDomain(W9012UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check.
     * - 共通エラーチェックをする。
     * 
     * - Check out the single item.
     * - Check the error.
     * 
     * - 単項目チェックをする。
     * - エラーを確認する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9012UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        W9012CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W9012CriteriaDomain> valid 
            = new Validator<W9012CriteriaDomain>(criteriaDomain, "w9012CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "customerCd", 
            "consigneeCd",
            "reInvoiceFlg"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9012);

        // Check the error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }

    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to Authority check.
     * 権限チェック(COMPANY)をするサービスを呼び出します。
     * 
     * - If are a new mode
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomain.
     * - Get the number of search results.
     *     Call w9011CgmCusNoXRefMaService.validateConsistencyCompAuth 
     *     with cgmCusNoXRefMaDomain as an argument.
     * 
     * - 新規モードの場合
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomainに検索条件を移送
     * - 検索結果の取得
     *       cgmCusNoXRefMaDomainを引数にw9011CgmCusNoXRefMaService.validateConsistencyCompAuthの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9012UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        if (MODE_NEW.equals(criteriaDomain.getCriteriaDomain().getProcMode())) {
            // Get the search criteria.
            W9011CgmCusNoXRefMaCriteriaDomain updateDomain 
                = createCgmCusNoXRefMaCriteria(criteriaDomain);

            // Authority check.
            w9011CgmCusNoXRefMaService.validateConsistencyCompAuth(updateDomain.getLgcyLibCompCd());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to Company existence check.
     * - Create error list.
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to String lgcyLibCompCd.
     * - Get the search results.
     *     Call w9011CgmCusNoXRefMaService.validateDatabaseCompCd 
     *     with lgcyLibCompCd as an argument.
     * 
     * This method calls the service to Consignee existence check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to String compCd.
     * - Get the search results.
     *     Call w9011CgmCusNoXRefMaService.validateDatabaseConsignee 
     *     with compCd as an argument.
     * 
     * This method calls the service to Intermediate Flg check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomain.
     * - Get the search results.
     *     Call w9011CgmCusNoXRefMaService.validateDatabaseIntermediateFlg 
     *     with cgmCusNoXRefMaDomain as an argument.
     * 
     * This method calls the service to behavior in a batch in the CIGMA night check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomain.
     * - Get the number of search results.
     *     Call w9011CgmCusNoXRefMaService.validateDatabaseCigmaAvailable 
     *     with cgmCusNoXRefMaDomain as an argument.
     * 
     * This method calls the service to customer information existence check of CIGMA check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomain.
     * - Get the number of search results.
     *     Call w9011CgmCusNoXRefMaService.validateDatabaseCustomer 
     *     with cgmCusNoXRefMaDomain as an argument.
     * 
     * Company存在チェックをするサービスを呼び出します。
     * - エラーリストを作成。
     * - 検索条件の移送
     *       criteriaDomainよりString lgcyLibCompCdに検索条件を移送
     * - 検索結果の取得
     *       lgcyLibCompCdを引数にw9011CgmCusNoXRefMaService.validateDatabaseCompCdの呼び出し
     * 
     * Consignee存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       updateDomainよりString compCdに検索条件を移送
     * - 検索結果の取得
     *       compCdを引数にw9011CgmCusNoXRefMaService.validateDatabaseConsigneeの呼び出し
     * 
     * Intermediate Flgチェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteriaに検索条件を移送
     * - 検索結果の取得
     *       cgmCusNoXRefMaDomainを引数にw9011CgmCusNoXRefMaService.validateDatabaseIntermediateFlgの呼び出し
     * 
     * CIGMA夜間バッチ中の振る舞いチェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomainに検索条件を移送
     * - 検索件数の取得
     *       cgmCusNoXRefMaDomainを引数にw9011CgmCusNoXRefMaService.validateDatabaseCigmaAvailableの呼び出し
     * 
     * CIGMAの得意先情報存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaDomainに検索条件を移送
     * - 検索件数の取得
     *       cgmCusNoXRefMaDomainを引数にw9011CgmCusNoXRefMaService.validateDatabaseCustomerの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9012UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = criteriaDomain.getLocale();

        String lgcyLibCompCd = criteriaDomain.getCriteriaDomain().getLgcyLibCompCd();
        String consigneeCd = criteriaDomain.getCriteriaDomain().getConsigneeCd();

        // Company presence check.
        if (!w9011CgmCusNoXRefMaService.validateDatabaseCompCd(lgcyLibCompCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyLibCompCd")
            };

            if (MODE_NEW.equals(criteriaDomain.getCriteriaDomain().getProcMode())) {

                errList.add(new MessageDomain("w9012CriteriaDomain.lgcyLibCompCd",
                    NXS_E7_0071, params));

            } else {
                errList.add(new MessageDomain("", NXS_E7_0071, params));
            }

        }

        // Consignee presence check.
        if (!w9011CgmCusNoXRefMaService.validateDatabaseConsignee(consigneeCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.consigneeCd")
            };

            errList.add(new MessageDomain("w9012CriteriaDomain.consigneeCd", NXS_E7_0109, params));

        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        //Intermediate Flg check.
        if (FLAG_Y.equals(criteriaDomain.getCriteriaDomain().getReInvoiceFlg())) {

            // Copy from the criteria on screen to a search criteria Domain.
            W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
                = new W9011CgmCusNoXRefMaCriteriaDomain();
            cgmCusNoXRefMaCriteria.setConsigneeCd(criteriaDomain.getCriteriaDomain().getConsigneeCd());

            // Get the search result.
            W9011CgmCusNoXRefMaDomain flg = w9011CgmCusNoXRefMaService.
                validateDatabaseIntermediateFlg(cgmCusNoXRefMaCriteria);

            if (FLAG_N.equals(flg.getReInvoiceFlg())) {

                Object[] params = {
                    commonService.getResource(locale, "label.consigneeCd"),
                    commonService.getResource(locale, "label.reInvoiceFlg")
                };

                errList.add(new MessageDomain("w9012CriteriaDomain.consigneeCd", NXS_E1_0038, params));
                errList.add(new MessageDomain("w9012CriteriaDomain.reInvoiceFlg", null, null));
            }
        }
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        // Check behavior of CIGMA night batch.
        if (!w9011CgmCusNoXRefMaService.validateDatabaseCigmaAvailable(true, lgcyLibCompCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyLibCompCd")
            };

            if (criteriaDomain.getCriteriaDomain().getProcMode().equals(MODE_NEW)) {
                MessageDomain msg 
                    = new MessageDomain("w9012CriteriaDomain.lgcyLibCompCd", NXS_E1_0060, params);
                errList.add(msg);

            } else {
                MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
                errList.add(msg);
            }
        }

        // Error check.
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        // Copy from the criteria on screen to a search criteria Domain.
        W9011CgmCusNoXRefMaCriteriaDomain criteria 
            = new W9011CgmCusNoXRefMaCriteriaDomain();

        criteria.setCustomerCd(criteriaDomain.getCriteriaDomain().getCustomerCd());
        criteria.setLgcyLibCompCd(lgcyLibCompCd);
        criteria.setLocale(locale);
        criteria.setProcMode(criteriaDomain.getCriteriaDomain().getProcMode());

        // Customer information check for the existence of CIGMA.
        w9011CgmCusNoXRefMaService.validateDatabaseCustomer(criteria);

    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to search for the NEXUS consignee cross-reference intensity.
     * NEXUS荷受人クロスリファレンス原単位を登録/更新するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria.
     * - Process of create/update.
     *     Call w9011CgmCusNoXRefMaService.searchByCondition with cgmCusNoXRefMaCriteria as an argument.
     * - Return the registration / update count.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteriaに検索条件を移送
     * - 登録/更新処理
     *       cgmCusNoXRefMaCriteriaを引数にw9011CgmCusNoXRefMaService.transactOnEditRegisterの呼び出し
     * - 登録/更新件数を返却する。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9012UpdateDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria = new W9011CgmCusNoXRefMaCriteriaDomain();

        // Copy from the criteria on screen to a search criteria Domain.
        CommonUtil.copyPropertiesDomainToDomain(cgmCusNoXRefMaCriteria, criteriaDomain.getCriteriaDomain());

        int count = 0;

        // Update / registration process.
        count = w9011CgmCusNoXRefMaService.transactOnEditRegister(cgmCusNoXRefMaCriteria);

        if (0 == count) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Return the registration / update count.
        return count;

    }

    /**
     * Based on (PL) domain search criteria, you can create search criteria domain (BL).
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * - Set screen ID, and locale.
     * - Copy the search criteria.
     * 
     * - 画面ID, ロケールを設定。
     * - 検索条件をコピー
     * 
     * @param criteriaDomain 画面の検索条件ドメイン(PL)
     * @return User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9011CgmCusNoXRefMaCriteriaDomain createCgmCusNoXRefMaCriteria 
    (W9012UpdateDomain criteriaDomain) {

        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
            = new W9011CgmCusNoXRefMaCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(cgmCusNoXRefMaCriteria, criteriaDomain.getCriteriaDomain());

        return cgmCusNoXRefMaCriteria;
    }
}
