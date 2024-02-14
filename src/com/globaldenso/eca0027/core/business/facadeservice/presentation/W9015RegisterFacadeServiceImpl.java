/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9015;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9015UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The update service facade implementation class of CIGMA W/H X-Reference MA Edit
 * Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面の更新処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public class W9015RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<Integer, W9015UpdateDomain> {

    /**
     * common Service/共通サービス
     */
    private CommonService commonService;

    /**
     * w9014CgmWhXRefMaService/w9014CgmWhXRefMaサービス
     */
    private W9014CgmWhXRefMaService w9014CgmWhXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015RegisterFacadeServiceImpl() {
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
     * <p>Setter method for w9014CgmWhXRefMaService.</p>
     *
     * @param cgmWhXRefMaService Set for w9014CgmWhXRefMaService
     */
    public void setW9014CgmWhXRefMaService(W9014CgmWhXRefMaService cgmWhXRefMaService) {
        w9014CgmWhXRefMaService = cgmWhXRefMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9015UpdateDomain filterDomain(W9015UpdateDomain updateDomain)
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
    protected void validateItems(W9015UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        W9015CriteriaDomain w9015CriteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W9015CriteriaDomain> valid 
            = new Validator<W9015CriteriaDomain>(w9015CriteriaDomain, "w9015CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "lgcyWhCd", 
            "plntCd",
            "compCd",
            "whCd"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9015);

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
     *     Transfer your search criteria from criteriaDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomain.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.validateConsistencyCompAuth 
     *     with w9014CgmWhXRefMaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomainに検索条件を移送
     * - 検索結果の取得
     *       w9014CgmWhXRefMaDomainを引数にw9014CgmWhXRefMaService.validateConsistencyCompAuthの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9015UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        if (MODE_NEW.equals(criteriaDomain.getCriteriaDomain().getProcMode())) {
            // Get the search criteria.
            W9014CgmWhXRefMaCriteriaDomain updateDomain 
                = createCgmWhXRefMaCriteria(criteriaDomain);

            // Authority check.
            w9014CgmWhXRefMaService.validateConsistencyCompAuth(updateDomain.getLgcyLibCompCd());
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
     *     Call w9014CgmWhXRefMaService.validateDatabaseCompCd 
     *     with lgcyLibCompCd as an argument.
     * 
     * This method calls the service to  W/H com and NEXUS W/H combine check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to String compCd and whCd.
     * - Get the search results.
     *     Call w9014CgmWhXRefMaService.validateDatabaseCompWh with compCd and whCd as an argument.
     *
     * This method calls the service to behavior in a batch in the CIGMA night check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomain.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.validateDatabaseCigmaAvailable 
     *     with w9014CgmWhXRefMaDomain as an argument.
     * 
     * This method calls the service to W/H com and NEXUS W/H Related check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomain.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.validateDatabaseNexusWhWh 
     *     with w9014CgmWhXRefMaDomain as an argument.
     * 
     * This method calls the service to W/H information existence check of CIGMA check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomain.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.validateDatabaseWh 
     *     with w9014CgmWhXRefMaDomain as an argument.
     * 
     * This method calls the service to Plant information existence check of CIGMA check.
     * - Transfer your search criteria.
     *     Transfer your search criteria from updateDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomain.
     * - Get the number of search results.
     *     Call w9014CgmWhXRefMaService.validateDatabasePlant 
     *     with w9014CgmWhXRefMaDomain as an argument.
     *     
     *     
     * Company存在チェックをするサービスを呼び出します。
     * - エラーリストを作成。
     * - 検索条件の移送
     *       criteriaDomainよりString lgcyLibCompCdに検索条件を移送
     * - 検索結果の取得
     *       lgcyLibCompCdを引数にw9014CgmWhXRefMaService.validateDatabaseCompCdの呼び出し
     * 
     * W/H com, NEXUS W/H組合せチェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomainに検索条件を移送
     * - 検索件数の取得
     *       w9014CgmWhXRefMaDomainを引数にw9014CgmWhXRefMaService.validateDatabaseCompWhの呼び出し
     * 
     * CIGMA夜間バッチ中の振る舞いチェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaDomainに検索条件を移送
     * - 検索件数の取得
     *       w9014CgmWhXRefMaDomainを引数にw9014CgmWhXRefMaService.validateDatabaseCigmaAvailableの呼び出し
     * 
     * NEXUS倉庫コード･CIGMA倉庫コード関連チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       w9014CgmWhXRefMaCriteriaDomainを引数にw9014CgmWhXRefMaService.validateDatabaseNexusWhWhの呼び出し
     * 
     * CIGMAの倉庫情報存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       w9014CgmWhXRefMaCriteriaDomainを引数にw9014CgmWhXRefMaService.validateDatabaseWhの呼び出し
     * 
     * CIGMAの製造部工場区分情報存在チェックをするサービスを呼び出します。
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       w9014CgmWhXRefMaCriteriaDomainを引数にw9014CgmWhXRefMaService.validateDatabasePlantの呼び出し
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9015UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create error list.
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = criteriaDomain.getLocale();

        String lgcyLibCompCd = criteriaDomain.getCriteriaDomain().getLgcyLibCompCd();
        String lgcyWhCd = criteriaDomain.getCriteriaDomain().getLgcyWhCd();
        String compCd = criteriaDomain.getCriteriaDomain().getCompCd();
        String whCd = criteriaDomain.getCriteriaDomain().getWhCd();
        String plantCd = criteriaDomain.getCriteriaDomain().getPlntCd();
        String procMode = criteriaDomain.getCriteriaDomain().getProcMode();

        // Company presence check.
        if (!w9014CgmWhXRefMaService.validateDatabaseCompCd(lgcyLibCompCd)) {

            Object[] params = {
                commonService.getResource(locale, "label.lgcyLibCompCd")
            };
            
            if (criteriaDomain.getCriteriaDomain().getProcMode().equals(MODE_NEW)) {
                MessageDomain msg 
                    = new MessageDomain("w9015CriteriaDomain.lgcyLibCompCd", NXS_E7_0071, params);
                errList.add(msg);

            } else {
                MessageDomain msg = new MessageDomain("", NXS_E7_0071, params);
                errList.add(msg);
            }
            
        }

        // Check combine W/H com and NEXUS W/H.
        if (!w9014CgmWhXRefMaService.validateDatabaseCompWh(compCd, whCd)) {
            // Call commonService.getResource method.
            Object[] params = {
                commonService.getResource(locale, "label.W9015.compCd"),
                commonService.getResource(locale, "label.whCd")
            };
            errList.add(new MessageDomain("w9015CriteriaDomain.compCd", GSCM_E0_0029, params));
            errList.add(new MessageDomain("w9015CriteriaDomain.whCd", null, null));
        }


        // Check behavior of CIGMA night batch.
        if (!w9014CgmWhXRefMaService.validateDatabaseCigmaAvailable(true, lgcyLibCompCd)) {
            if (criteriaDomain.getCriteriaDomain().getProcMode().equals(MODE_NEW)) {
                MessageDomain msg 
                    = new MessageDomain("w9015CriteriaDomain.lgcyLibCompCd", NXS_E1_0060, null);
                errList.add(msg);

            } else {
                MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
                errList.add(msg);
            }
        }

        // Copy from the criteria on screen to a search criteria Domain.
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain 
            = new W9014CgmWhXRefMaCriteriaDomain();
        
        w9014CgmWhXRefMaCriteriaDomain.setLgcyLibCompCd(lgcyLibCompCd);
        w9014CgmWhXRefMaCriteriaDomain.setLgcyWhCd(lgcyWhCd);
        w9014CgmWhXRefMaCriteriaDomain.setCompCd(compCd);
        w9014CgmWhXRefMaCriteriaDomain.setWhCd(whCd);
        w9014CgmWhXRefMaCriteriaDomain.setLocale(locale);
        w9014CgmWhXRefMaCriteriaDomain.setPlntCd(plantCd);
        w9014CgmWhXRefMaCriteriaDomain.setProcMode(procMode);

        // Check Related W/H com and NEXUS W/H.
        w9014CgmWhXRefMaCriteriaDomain.setSearchCountCheckFlg(false);
        int count = w9014CgmWhXRefMaService.
            validateDatabaseNexusWhWh(w9014CgmWhXRefMaCriteriaDomain);
        if (count != 0) {
            // Call commonService.getResource method.
            Object[] params = {
                commonService.getResource(locale, "label.lgcyWhCd"),
                commonService.getResource(locale, "label.W9015.compCd") 
                + "・"
                    + commonService.getResource(locale, "label.whCd")
            };

            if (criteriaDomain.getCriteriaDomain().getProcMode().equals(MODE_NEW)) {
                MessageDomain msg 
                    = new MessageDomain("w9015CriteriaDomain.lgcyWhCd", NXS_E1_0035, params);
                errList.add(msg);

            } else {
                MessageDomain msg = new MessageDomain("", NXS_E1_0035, params);
                errList.add(msg);
            }
            errList.add(new MessageDomain("w9015CriteriaDomain.compCd", null, null));
            errList.add(new MessageDomain("w9015CriteriaDomain.whCd", null, null));
        }
        
        // Error check.
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }


        // W/H information check for the existence of CIGMA.
        w9014CgmWhXRefMaService.validateDatabaseWh(w9014CgmWhXRefMaCriteriaDomain);
        
        // Plant information check for the existence of CIGMA.
        w9014CgmWhXRefMaService.validateDatabasePlant(w9014CgmWhXRefMaCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to search for the NEXUS W/H cross-reference intensity.
     * NEXUS倉庫クロスリファレンス原単位を登録/更新するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain 
     *     to W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria.
     * - Process of create/update.
     *     Call w9014CgmWhXRefMaService.searchByCondition with w9014CgmWhXRefMaCriteria as an argument.
     * - Return the registration / update count.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりW9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaに検索条件を移送
     * - 登録/更新処理
     *       w9014CgmWhXRefMaCriteriaを引数にw9014CgmWhXRefMaService.transactOnEditRegisterの呼び出し
     * - 登録/更新件数を返却する。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9015UpdateDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria = 
            new W9014CgmWhXRefMaCriteriaDomain();

        // Copy from the criteria on screen to a search criteria Domain.
        CommonUtil.copyPropertiesDomainToDomain(w9014CgmWhXRefMaCriteria, 
            criteriaDomain.getCriteriaDomain());

        int count = 0;

        // Update / registration process.
        count = w9014CgmWhXRefMaService.transactOnEditRegister(w9014CgmWhXRefMaCriteria);

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
    protected W9014CgmWhXRefMaCriteriaDomain createCgmWhXRefMaCriteria 
    (W9015UpdateDomain criteriaDomain) {

        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria 
            = new W9014CgmWhXRefMaCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9014CgmWhXRefMaCriteria, criteriaDomain.getCriteriaDomain());

        return w9014CgmWhXRefMaCriteria;
    }
}
