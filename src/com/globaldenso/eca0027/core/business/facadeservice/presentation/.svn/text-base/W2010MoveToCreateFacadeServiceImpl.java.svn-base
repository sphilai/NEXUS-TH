/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_NEXUS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is a MoveToCreateFacade service implement class of a CML Header screen.
 * <br />
 * CML Header画面のMoveToCreateFacadeサービス実装クラスです。
 * 
 * <pre>
 * bean id : w2010MoveToCreateFacadeService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2010MoveToCreateFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W2010CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * services of TmCigmaWhXrefServic(s)
     * <br />TmCigmaWhXrefService サービス
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * constructor
     * <br />
     * デフォルトコンストラクタ
     */
    public W2010MoveToCreateFacadeServiceImpl() {
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
     * Setter method for w2009CmlService.
     * 
     * @param w2009CmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService w2009CmlService) {
        this.w2009CmlService = w2009CmlService;
    }

    /**
     * Setter method for tmCigmaWhXrefService.
     * 
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(
        TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2010CriteriaDomain filterDomain(
        W2010CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     *    - Unary eye check implementation
     *       Screen definition document_ECA0027_W2010_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     * 
     *  - 単項目チェック実施
     *     詳細は画面定義書_ECA0027_W2010_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W2010CriteriaDomain> valid = new Validator<W2010CriteriaDomain>(
            criteriaDomain, "w2010CriteriaDomain");

        Validator<W2010CriteriaDomain> valid2 = new Validator<W2010CriteriaDomain>(
            criteriaDomain, "w2010CriteriaDomain");

        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Required input check of each item (necessary items are variable by an input value)  
        // 各項目の必須入力チェック(必須項目は入力値によって可変）
        String palletizeInstrRequired = criteriaDomain.getPltzInstrRequired();

        // No Selection
        if (CheckUtil.isBlankOrNull(palletizeInstrRequired)) {

            Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.pltzInstrRequired")}; 
            errorList.add(new MessageDomain("w2010CriteriaDomain.pltzInstrRequired", GSCM_E0_0011, params));

        } else {
            
            if (palletizeInstrRequired.equals(FLAG_Y)) {
                // In the case of [Y]
                // [Y]の場合
                String[] properties = { "pltzInstrNo" };
                valid.isValidateProperties(properties, SCREEN_ID_W2010);
                if (0 < valid.getErrList().size()) {
                    errorList.addAll(valid.getErrList());
                }
            
            } else if (palletizeInstrRequired.equals(FLAG_N)) {
                // In the case of [N]
                // [N]の場合
                String[] properties = {
                    "shipperCd",
                    "customerCd",
                    "lgcyShipTo",
                    "trnsCd"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W2010);
                if (0 < valid.getErrList().size()) {
                    errorList.addAll(valid.getErrList());
                }

                String plntAndWhDeclaration = criteriaDomain.getPlntAndWhDeclaration();
                if (CheckUtil.isBlankOrNull(plntAndWhDeclaration)) {
                    
                    Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.plntAndWhDeclaration")};
                    errorList.add(new MessageDomain("w2010CriteriaDomain.plntAndWhDeclaration", GSCM_E0_0011, params));

                } else {
                    // In the case of [CIGMA]
                    // [CIGMA]の場合
                    if (plntAndWhDeclaration.equals(TYP_PLANT_AND_WH_CIGMA)) {

                        String[] props = {"plntCd", "lgcyWhCd" };
                        valid2.isValidateProperties(props, SCREEN_ID_W2010);

                    
                    } else if (plntAndWhDeclaration.equals(TYP_PLANT_AND_WH_NEXUS)) {

                        String[] props = { "packingWhCompCd", "packingWhCd" };
                        valid2.isValidateProperties(props, SCREEN_ID_W2010);

                    }
                    if (0 < valid2.getErrList().size()) {
                        errorList.addAll(valid2.getErrList());
                    }
                }
            }
        }
        // Error check
        // エラー確認
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Authority check implementation
     *      Plant &amp;   It was inputted into the screen when W/H Declaration was &quot;CIGMA&quot; (1).
     *      This is confirmed whether Shipper and PlantCD have authority.
     *      It checks by calling {@link W2009CmlService#validateConsistencyShipperPlantAuth(String, String)}.
     * 
     * - 権限チェック実施
     *    Plant &amp; W/H Declaration が &quot;CIGMA&quot;(1)の場合、画面に入力された
     *    ShipperとPlantCDに権限があるかどうかチェックする
     *    {@link W2009CmlService#validateConsistencyShipperPlantAuth(String, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Acquisition of an input value
        // 入力値の取得
        String plntAndWhDeclaration = criteriaDomain.getPlntAndWhDeclaration();

        // Only in "CIGMA", it checks.
        // "CIGMA"の場合のみチェックする
        if (!CheckUtil.isBlankOrNull(plntAndWhDeclaration)
            && plntAndWhDeclaration.equals(TYP_PLANT_AND_WH_CIGMA)) {

            String shipperCd = criteriaDomain.getShipperCd();
            String plntCd = criteriaDomain.getPlntCd();

            // Shipper authority check
            // Shipper権限チェック
            if (!w2009CmlService.validateConsistencyShipperPlantAuth(shipperCd,
                plntCd)) {
                MessageDomain msgShipperCd = new MessageDomain(
                    "w2010CriteriaDomain.shipperCd", GSCM_I0_0009, null);
                MessageDomain msgPlntCd = new MessageDomain(
                    "w2010CriteriaDomain.plntCd", null, null);

                errorList.add(msgShipperCd);
                errorList.add(msgPlntCd);
            }
        }

        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        // If manual registration is specified when instruction palletizing. 
        // 指示パレタイズかつマニュアル登録指定の場合
        if (FLAG_Y.equals(criteriaDomain.getPltzInstrRequired())) {
            if (FLAG_Y.equals(criteriaDomain.getManualRegFlg())) {
                errorList.add(
                    new MessageDomain("w2010CriteriaDomain.manualRegFlg", NXS_E7_0003, null)
                );
            }
        }

        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - In the case of a Packaging Instruction (=Pull)
     *     - This is an existence check about a Packaging Instruction (=Pull) and a CIGMA Warehouse Cross Reference Master.
     *     Behavior in - CIGMA night batch
     *     - Authority check (Company, Plant)
     *
     * - In the case of the result (CIGMA W/H)
     *     Behavior in - CIGMA night batch
     *     - Authority check (Company, Plant)
     *     - Shipper existence check
     *     - Shipper, Customer, and Ship to Combination check
     *       Based on an optional condition, this is an existence check about a CIGMA Warehouse Cross Reference Master.
     *
     * - In the case of the result (NEXUS W/H)
     *     Behavior in - CIGMA night batch
     *     - Authority check (Company, Plant)
     *     - Shipper existence check
     *     - Shipper, Customer, and Ship to Combination check
     *     - W/H Company and NEXUS W/H Combination check
     *       Based on an optional condition, this is an existence check about a CIGMA Warehouse Cross Reference Master.
     * 
     * - 梱包指示の場合
     *   - 梱包指示、倉庫クロスリファレンス原単位を存在チェック
     *   - CIGMA夜間バッチ中の振る舞い
     *   - 権限チェック(Company、Plant)
     * 
     * - 成行の場合(CIGMA倉庫)
     *   - CIGMA夜間バッチ中の振る舞い
     *   - 権限チェック(Company、Plant)
     *   - Shipper存在チェック
     *   - Shipper、Customer、Ship to　組み合わせチェック
     *     任意の条件を元に、倉庫クロスリファレンス原単位を存在チェック
     * 
     * - 成行の場合(NEXUS倉庫)
     *   - CIGMA夜間バッチ中の振る舞い
     *   - 権限チェック(Company、Plant)
     *   - Shipper存在チェック
     *   - Shipper、Customer、Ship to　組み合わせチェック
     *   - W/H Company、NEXUS W/H　組み合わせチェック
     *     任意の条件を元に、倉庫クロスリファレンス原単位を存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        // Acquisition of an input value
        // 入力値の取得
        String required = criteriaDomain.getPltzInstrRequired();
        String pltzInstrNo = criteriaDomain.getPltzInstrNo();
        String shipperCd = criteriaDomain.getShipperCd();
        String customerCd = criteriaDomain.getCustomerCd();
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        String plntCd = criteriaDomain.getPlntCd();
        String lgcyWhCd = criteriaDomain.getLgcyWhCd();
        String plntAndWhDeclaration = criteriaDomain.getPlntAndWhDeclaration();
        String packingWhCompCd = criteriaDomain.getPackingWhCompCd();
        String packingWhCd = criteriaDomain.getPackingWhCd();

        Locale locale = criteriaDomain.getLocale();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // It checks, when or [8] Plant & W/H Declaration is "NEXUS".
        // または【8】Plant & W/H Declaration が "NEXUS"の場合にチェック
        if (!CheckUtil.isBlankOrNull(required) && required.equals(FLAG_Y)) {
            // When [1] Palletize Instr. Required is "Y"
            // 【1】Palletize Instr. Required が "Y"の場合

            // 1.2 Instructed(=Pull) Palletizing check
            // 1.2 指示パレタイズチェック
            if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
                // 1.2.1 Packaging Instruction (=Pull) information check
                // Packaging Instruction (=Pull), a CIGMA-Warehouse-Cross-Reference-Master existence check  -> authority check
                // 1.2.1 梱包指示情報チェック
                // 梱包指示、倉庫クロスリファレンス原単位存在チェック →権限チェック
                W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
                criteria.setPltzInstrRequired(required);
                criteria.setPltzInstrNo(pltzInstrNo);
                criteria.setBaseAuthFlg(criteriaDomain.getBaseAuthFlg());
                criteria.setUserAuthList(criteriaDomain.getUserAuthList());
                criteria.setServerId(criteriaDomain.getServerId());

                TtPltzInstrDomain ttPltzInstrDomain = new TtPltzInstrDomain();
                ttPltzInstrDomain.setPltzInstrNo(pltzInstrNo);

                List<String> errs 
                    = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);

                if (errs != null) {
                    for (String errmsg : errs) {
                        if (!CheckUtil.isBlankOrNull(ttPltzInstrDomain.getShipperCd())) {
                            Object[] params = {
                                commonService.getResource(locale, "label.shipperCd"),
                                commonService.getResource(locale, "label.plntCd"),
                                commonService.getResource(locale, "label.lgcyWhCd")
                            };
                            errorList.add(new MessageDomain("w2010CriteriaDomain.pltzInstrNo", errmsg, params));
                        } else {
                            errorList.add(new MessageDomain("w2010CriteriaDomain.pltzInstrNo", errmsg, null));
                        }
                    }
                } else {
                    // 1.2.1.4 functional common specifications: This is a behavior check under match in the CIGMA night.
                    // 1.2.1.4 機能共通仕様：CIGMA夜間マッチ中の振る舞いチェック
                    if (!w2009CmlService.validateDatabaseCigmaAvailable(true, ttPltzInstrDomain.getShipperCd())) {
                        errorList.add(new MessageDomain(null, NXS_E1_0060, null));
                    }
                }

                // WkOO is reset up in order to pass session information.
                // acquisition VALUE is set to the item Wk of CriteriaDomain (for the storage to a session).  
                // セッション情報に渡すため、Wk○○を設定しなおす
                // 取得値をCriteriaDomainのWk項目へ設定(セッションへの保管のため)
                criteriaDomain.setWkPltzInstrNo(criteria.getWkPltzInstrNo());
                criteriaDomain.setWkShipperCd(criteria.getWkShipperCd());
                criteriaDomain.setWkCustomerCd(criteria.getWkCustomerCd());
                criteriaDomain.setWkLgcyShipTo(criteria.getWkLgcyShipTo());
                criteriaDomain.setWkTrnsCd(criteria.getWkTrnsCd());
                criteriaDomain.setWkPlntCd(criteria.getWkPlntCd());
                criteriaDomain.setWkLgcyWhCd(criteria.getWkLgcyWhCd());
                criteriaDomain.setWkPackingWhCompCd(criteria.getWkPackingWhCompCd());
                criteriaDomain.setWkPackingWhCd(criteria.getWkPackingWhCd());

            }
        } else {
            // When [8] Plnt & W/H Declaration is "CIGMA", or when this is "NEXUS"
            // 【8】Plnt & W/H Declaration が "CIGMA"の場合もしくは"NEXUS"の場合
            if (TYP_PLANT_AND_WH_CIGMA.equals(plntAndWhDeclaration)
                || TYP_PLANT_AND_WH_NEXUS.equals(plntAndWhDeclaration)) {

                // 1.3.1 or 1.4.1 functional common specifications: This is a behavior check under match in the CIGMA night.
                // 1.3.1 or 1.4.1 機能共通仕様：CIGMA夜間マッチ中の振る舞いチェック
                if (!w2009CmlService.validateDatabaseCigmaAvailable(true, shipperCd)) {
                    errorList.add(new MessageDomain("w2010CriteriaDomain.shipperCd", NXS_E1_0060, null));
                }

                // 1.3.3 or 1.4.3 functional-specification common: Shipper existence check
                // 1.3.3 or 1.4.3 機能仕様共通：Shipper存在チェック
                if (!w2009CmlService.validateDatabaseShipperOnHeaderMoveToCreate(shipperCd)) {
                    MessageDomain msg = new MessageDomain("w2010CriteriaDomain.shipperCd", NXS_E7_0111, null);
                    errorList.add(msg);
                }

                // 1.3.4 or 1.4.4 combination check
                // 1.3.4 or 1.4.4 組み合わせチェック
                if (!w2009CmlService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo)) {
                    String[] params = {
                        commonService.getResource(locale, "label.shipperCd"),
                        commonService.getResource(locale, "label.customerCd"),
                        commonService.getResource(locale, "label.lgcyShipTo")
                    };
                    
                    MessageDomain msgShipperCd = new MessageDomain("w2010CriteriaDomain.shipperCd", GSCM_E0_0030, params);
                    MessageDomain msgCustomerCd = new MessageDomain("w2010CriteriaDomain.customerCd", null, null);
                    MessageDomain msgLgcyShipTo = new MessageDomain("w2010CriteriaDomain.lgcyShipTo", null, null);

                    errorList.add(msgShipperCd);
                    errorList.add(msgCustomerCd);
                    errorList.add(msgLgcyShipTo);
                }
            }

            // In the case of CIGMA
            // CIGMAの場合
            if (TYP_PLANT_AND_WH_CIGMA.equals(plntAndWhDeclaration)) {
                // 1.3.5 CIGMA-Warehouse-Cross-Reference-Master existence check
                // 1.3.5 倉庫クロスリファレンス原単位存在チェック
                TmCigmaWhXrefCriteriaDomain tmcigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
                tmcigmaWhXrefCriteria.setLgcyLibCompCd(shipperCd);
                tmcigmaWhXrefCriteria.setPlntCd(plntCd);
                tmcigmaWhXrefCriteria.setLgcyWhCd(lgcyWhCd);
                
                TmCigmaWhXrefDomain tmCigmaWhXrefDomain = tmCigmaWhXrefService.searchByKey(tmcigmaWhXrefCriteria);
                
                if (tmCigmaWhXrefDomain == null) {
                    String[] params = {
                        commonService.getResource(locale, "label.shipperCd"),
                        commonService.getResource(locale, "label.plntCd"),
                        commonService.getResource(locale, "label.lgcyWhCd")
                    };
                    
                    errorList.add(new MessageDomain("w2010CriteriaDomain.shipperCd", GSCM_E0_0030, params));
                    errorList.add(new MessageDomain("w2010CriteriaDomain.plntCd", null, null));
                    errorList.add(new MessageDomain("w2010CriteriaDomain.lgcyWhCd", null, null));
                } else {
                    // The VALUE acquired to session information is set up.
                    // セッション情報へ取得した値を設定する
                    criteriaDomain.setWkPackingWhCompCd(tmCigmaWhXrefDomain.getCompCd());
                    criteriaDomain.setWkPackingWhCd(tmCigmaWhXrefDomain.getWhCd());
                }
            } else if (TYP_PLANT_AND_WH_NEXUS.equals(plntAndWhDeclaration)) {
                // In the case of NEXUS
                // 1.4.5 functional-specification common: Combination check (W/H Company, NEXUS W/H)  
                // NEXUSの場合
                // 1.4.5 機能仕様共通：組み合わせチェック (W/H Company, NEXUS W/H)
                if (!w2009CmlService.validateDatabaseWhCompanyWh(
                    packingWhCompCd, packingWhCd)) {

                    String[] params = {
                        commonService.getResource(locale, "label.packingWhCompCd"),
                        commonService.getResource(locale, "label.packingWhCd")
                    };
                    
                    errorList.add(new MessageDomain("w2010CriteriaDomain.packingWhCompCd", GSCM_E0_0029, params));
                    errorList.add(new MessageDomain("w2010CriteriaDomain.packingWhCd", null, null));
                }

                // 1.4.6 CIGMA warehouse information's existence check a -> authority check
                // 1.4.6 CIGMA倉庫情報の存在チェック→権限チェック
                W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
                criteria.setPackingWhCompCd(packingWhCompCd);
                criteria.setPackingWhCd(packingWhCd);
                criteria.setBaseAuthFlg(criteriaDomain.getBaseAuthFlg());
                criteria.setUserAuthList(criteriaDomain.getUserAuthList());
                criteria.setServerId(criteriaDomain.getServerId());
                criteria.setShipperCd(shipperCd);

                List<? extends W2009CmlDomain> w2009CmlDomainList = w2009CmlService
                    .validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(criteria);
                if (w2009CmlDomainList == null || w2009CmlDomainList.size() == 0) {
                    errorList.add(new MessageDomain("w2010CriteriaDomain.packingWhCompCd", GSCM_I0_0009, null));
                    errorList.add(new MessageDomain("w2010CriteriaDomain.packingWhCd", null, null));
                } else {
                    // The VALUE acquired to session information is acquired.
                    // セッション情報へ取得した値を取得する
                    criteriaDomain.setWkLgcyWhCd(w2009CmlDomainList.get(0).getLgcyWhCd());
                }
            }
        }

        // Error check
        // エラー確認
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }

}
