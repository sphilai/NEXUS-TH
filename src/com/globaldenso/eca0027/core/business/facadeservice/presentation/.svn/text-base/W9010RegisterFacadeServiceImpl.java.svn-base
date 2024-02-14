/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0074;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9010;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9010UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The update service facade implementation class of CIGMA Ship to X-Reference MA Edit 
 * Screen. 
 * <br />CIGMA Ship to X-Reference MA Edit画面の更新処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7973 $
 */
public class W9010RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<Integer, W9010UpdateDomain> {

    /**
     * common Service/共通サービス
     */
    protected CommonService commonService;

    /**
     * w9009CgmShipToXRefMaService/cgmShipToXRefMaサービス
     */
    protected W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    protected W9010RegisterFacadeServiceImpl() {
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
     * Setter method for w9009CgmShipToXRefMaService.
     *
     * @param cgmShipToXRefMaService Set for w9009CgmShipToXRefMaService
     */
    public void setW9009CgmShipToXRefMaService(W9009CgmShipToXRefMaService cgmShipToXRefMaService) {
        w9009CgmShipToXRefMaService = cgmShipToXRefMaService;
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
    protected W9010UpdateDomain filterDomain(W9010UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
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
    protected void validateItems(W9010UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        W9010CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W9010CriteriaDomain> valid 
            = new Validator<W9010CriteriaDomain>(criteriaDomain, "w9010CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "customerCd", 
            "lgcyShipTo",
            "shipToCd"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9010);

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
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to 
     *     W9009CgmShipToXRefMaCriteriaDomain updateDomain.
     * - Get the number of search results.
     *     Call w9009CgmShipToXRefMaService.validateConsistencyCompAuth with 
     *     updateDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaDomain updateDomainに検索条件を移送
     * - 検索件数の取得
     *       updateDomainを引数にw9009CgmShipToXRefMaService.validateConsistencyCompAuthの呼び出し
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9010UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        if (MODE_NEW.equals(criteriaDomain.getCriteriaDomain().getProcMode())) {
            // Get the search criteria.
            W9009CgmShipToXRefMaCriteriaDomain updateDomain 
                = createShipToXRefMaCriteria(criteriaDomain);

            // Authority check.
            w9009CgmShipToXRefMaService.validateConsistencyCompAuth(updateDomain.getLgcyLibCompCd());
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
     *     Call w9009CgmShipToXRefMaService.validateDatabaseCompCd 
     *     with lgcyLibCompCd as an argument.
     * 
     * This method calls the service to NEXUS Ship to existence check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to String shipToCd.
     * - Get the number of search results.
     *     Call w9009CgmShipToXRefMaService.validateDatabaseShipTo with shipToCd as an argument.
     * 
     * This method calls the service to behavior in a batch in the CIGMA night check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9009CgmShipToXRefMaCriteriaD cgmShipToXRefMaDomain.
     * - Get the number of search results.
     *     Call w9009CgmShipToXRefMaService.validateDatabaseCigmaAvailable with (boolean, String) 
     *     as an argument.
     * 
     * This method calls the service to shipment information existence check of CIGMA check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9009CgmShipToXRefMaCriteriaD cgmShipToXRefMaDomain.
     * - Get the number of search results.
     *     Call w9009CgmShipToXRefMaService.validateDatabaseShipTo 
     *     with cgmShipToXRefMaDomain as an argument.
     * 
     * Company存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりString lgcyLibCompCdに検索条件を移送
     * - 検索件数の取得
     *       lgcyLibCompCdを引数にw9009CgmShipToXRefMaService.validateDatabaseCompCdの呼び出し
     * 
     * NEXUS Ship to存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりString shipToCdに検索条件を移送
     * - 検索件数の取得
     *       shipToCdを引数にw9009CgmShipToXRefMaService.validateDatabaseShipToの呼び出し
     * 
     * CIGMA夜間バッチ中の振る舞いチェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaD (boolean, String)に検索条件を移送
     * - 検索件数の取得
     *       (boolean, String)を引数に
     *       w9009CgmShipToXRefMaService.validateDatabaseCigmaAvailableの呼び出し
     * 
     * CIGMAの送荷先情報存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaD criteriaに検索条件を移送
     * - 検索件数の取得
     *       criteriaを引数にw9009CgmShipToXRefMaService.validateDatabaseShipToの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9010UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = criteriaDomain.getLocale();

        String lgcyLibCompCd = criteriaDomain.getCriteriaDomain().getLgcyLibCompCd();
        String shipToCd = criteriaDomain.getCriteriaDomain().getShipToCd();
        String lgcyShipTo = criteriaDomain.getCriteriaDomain().getLgcyShipTo();

        // Company presence check.
        if (!w9009CgmShipToXRefMaService.validateDatabaseCompCd(lgcyLibCompCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyLibCompCd"), lgcyLibCompCd
            };

            errList.add(new MessageDomain("w9010CriteriaDomain.lgcyLibCompCd", NXS_E7_0071, params));

        }

        // NEXUS Ship to present check.
        if (!w9009CgmShipToXRefMaService.validateDatabaseShipTo(shipToCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.W9010.shipToCd"), shipToCd
            };

            errList.add(new MessageDomain("w9010CriteriaDomain.shipToCd", NXS_E7_0074, params));

        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        // Check behavior of CIGMA night batch.
        if (!w9009CgmShipToXRefMaService.validateDatabaseCigmaAvailable(true, lgcyLibCompCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyLibCompCd")
            };

            if (criteriaDomain.getCriteriaDomain().getProcMode().equals(MODE_NEW)) {
                MessageDomain msg 
                    = new MessageDomain("w9010CriteriaDomain.lgcyLibCompCd", NXS_E1_0060, params);
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

        // Check presence of consignee destination information of CIGMA.
        W9009CgmShipToXRefMaCriteriaDomain criteria 
            = new W9009CgmShipToXRefMaCriteriaDomain();

        criteria.setCustomerCd(criteriaDomain.getCriteriaDomain().getCustomerCd());
        criteria.setLgcyLibCompCd(lgcyLibCompCd);
        criteria.setLgcyShipTo(lgcyShipTo);
        criteria.setLocale(locale);
        criteria.setProcMode(criteriaDomain.getCriteriaDomain().getProcMode());

        // WareHouse information check for the existence of CIGMA.
        w9009CgmShipToXRefMaService.validateDatabaseShipTo(criteria);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to search for the NEXUS送荷先クロスリファレンス原単位.
     * NEXUS送荷先クロスリファレンス原単位を登録/更新するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteria.
     * - Process of create/update.
     *     Call w9009CgmShipToXRefMaService.searchByCondition 
     *     with cgmShipToXRefMaCriteria as an argument.
     * - Return the registration / update count.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteriaに検索条件を移送
     * - 登録/更新処理
     *       cgmcgmShipToXRefMaCriteriaを引数に
     *       w9009CgmShipToXRefMaService.transactOnEditRegisterの呼び出し
     * - 登録/更新件数を返却する。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9010UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteria 
            = new W9009CgmShipToXRefMaCriteriaDomain();

        // Copy from the criteria on screen to a search criteria Domain.
        CommonUtil.copyPropertiesDomainToDomain(cgmShipToXRefMaCriteria, 
            criteriaDomain.getCriteriaDomain());

        int count = 0;

        // Update / registration process.
        count = w9009CgmShipToXRefMaService.transactOnEditRegister(cgmShipToXRefMaCriteria);

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
    protected W9009CgmShipToXRefMaCriteriaDomain createShipToXRefMaCriteria 
    (W9010UpdateDomain criteriaDomain) {

        W9009CgmShipToXRefMaCriteriaDomain cgmShipToXRefMaCriteria 
            = new W9009CgmShipToXRefMaCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(cgmShipToXRefMaCriteria, 
            criteriaDomain.getCriteriaDomain());

        return cgmShipToXRefMaCriteria;
    }
}
