/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_LENGTH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0049;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Register action of CML Register.
 * <br />CML RegisterのRegisterアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2012RegisterFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2012RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> {

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
     * NEXUS Company Master Service
     * <br />NEXUS会社原単位 サービス
     * UT442 ADD
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2012RegisterFacadeServiceImpl() {
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
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
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
    protected W2012UpdateDomain filterDomain(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // conditional required input check
        // 条件付き必須入力チェック
        boolean result = requirCheckForOuterPkgCd(updateDomain);
        if (!result) {
            String[] params = new String[] {
                commonService.getResource(updateDomain.getLocale(), "label.outerPkgCd")};
            errList.add(new MessageDomain("w2012CriteriaDomain.outerPkgCd", NXS_E7_0049,
                params));
        }

        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
            Validator<W2012CriteriaDomain> valid
                = new Validator<W2012CriteriaDomain>(updateDomain.getCriteriaDomain(), "w2012CriteriaDomain");
            String[] properties = {
                "length",
                "width",
                "height",
                "volume",
                "grossWeight",
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2012);
            if (0 < valid.getErrList().size()) {
                throw new ValidationException(valid.getErrList());
            }
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Warning check check
     *     Make warningFlgList and ignoreWarning into an argument.
     *     {@link W2009CmlService#validateConsistencyOfRegister(List, String)} is called.
     *
     * - Packing-material registration check
     *     Make packagingConfirmedFlg into an argument.
     *     {@link W2009CmlService#validateConsistencyRegistPkg(String)} is called.
     * 
     * - Warning確認チェック
     *   warningFlgList, ignoreWarning を引数にして
     *   {@link W2009CmlService#validateConsistencyOfRegister(List, String)}を呼出す。
     *   
     * - 包装材登録チェック
     *   packagingConfirmedFlg を引数にして
     *   {@link W2009CmlService#validateConsistencyRegistPkg(String)}を呼出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        
        // UT110 TRIAL SHIPMENT/号試品対応 MOV
        String packagingConfirmedFlg = updateDomain.getCriteriaDomain().getPackagingConfirmedFlg();
        if (!w2009CmlService.validateConsistencyRegistPkg(packagingConfirmedFlg)) {
            errMessages.add(new MessageDomain(null, NXS_E7_0039, null));
        }
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(updateDomain.getCriteriaDomain().getLength())) < 0)) {
                String[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.length")
                };
                errMessages.add(new MessageDomain("w2012CriteriaDomain.length", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(updateDomain.getCriteriaDomain().getWidth())) < 0)) {
                String[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.width")
                };
                errMessages.add(new MessageDomain("w2012CriteriaDomain.width", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(updateDomain.getCriteriaDomain().getHeight())) < 0)) {
                String[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.height")
                };
                errMessages.add(new MessageDomain("w2012CriteriaDomain.height", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(updateDomain.getCriteriaDomain().getGrossWeight())) < 0)) {
                String[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.grossWeight")
                };
                errMessages.add(new MessageDomain("w2012CriteriaDomain.grossWeight", GSCM_E0_0034, params));
            }
            if (
                !(new BigDecimal(updateDomain.getCriteriaDomain().getNetWeight())
                    .compareTo(new BigDecimal(updateDomain.getCriteriaDomain().getGrossWeight())) <= 0)
            )
            {
                errMessages.add(new MessageDomain(NXS_E7_0082, NXS_E7_0082, null));
                    // And does not null the first argument for the reason of FW Issue List No.79.
                    // FW修正依頼一覧.xls No.79の理由で第一引数をnullとしない。
            }
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        
        List<String> warningFlgList = new ArrayList<String>();
        String ignoreWarnings = updateDomain.getCriteriaDomain().getIgnoreWarnings();
        //String packagingConfirmedFlg = updateDomain.getCriteriaDomain().getPackagingConfirmedFlg();
        
        for (W2012ListDomain domain : updateDomain.getListDomainList()) {
            warningFlgList.add(domain.getWarningFlg());
        }
        
        if (!w2009CmlService.validateConsistencyOfRegister(warningFlgList, ignoreWarnings)) {
            errMessages.add(new MessageDomain(null, NXS_E7_0040, null));
        }
        
        //if (!w2009CmlService.validateConsistencyRegistPkg(packagingConfirmedFlg)) {
        //    errMessages.add(new MessageDomain(null, NXS_E7_0039, null));
        //}
        
        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A check among - night batch
     *       Session (2010. Disp. Shipper) confirms whether to be among a night batch.
     *       * common-specifications .xls[functional-specification common: Behavior ] in a CIGMA night batch Reference
     *       It checks by calling {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}.
     *
     * - combination check 1
     *       Combination check of Session (2010. Disp. Shipper), Session (2010. Disp. Cust. No.), and Session (2010. Disp. Ship to)
     *       * common-specifications .xls[functional-specification common: Refer to [ Shipper, Customer, and ] Ship to combination check].
     *       It checks by calling {@link W2009CmlService#validateDatabaseShipperCustomerShipTo(String, String, String)}.
     *
     * - combination check 2
     *       Combination check of Session (2010. Disp. Shipper), Session (2010. Disp. W/H), and Session (2010. Disp. Plant CD)
     *       * common-specifications .xls[functional-specification common: Refer to [ Shipper, W/H, and ] Plant combination check].
     *       * It carries out, only when Session (2010. Disp. Plant CD) is not "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseShipperWhPlantOnRegister(String, String, String)}.
     *
     * - combination check 3
     *       Combination check of Session (2010. Disp. W/H Company) and Session (2010. Disp. NEXUS W/H)
     *       * common-specifications .xls[functional-specification common: Refer to [ W/H Company and ] NEXUS W/H combination check].
     *       It checks by calling {@link W2009CmlService#validateDatabaseWhCompanyWh(String, String)}.
     *
     * - Packaging Instruction (=Pull) check
     *       * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is not "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtPltzInstrOnRegister(String)}.
     *
     * - Palletize-Instruction-Item-No check
     *       * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is not "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegister(String)}.
     *
     * - Directions over check
     *      [64] : hidden Mix Tag Flg carries out to all the data of "N."
     *       * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is not "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(String, String, String, String, BigDecimal, BigDecimal)}.
     *
     * - Mix-Tag check
     *      [64] : hidden Mix Tag Flg carries out to all the data of "Y."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtMixedTagOnRegister(String, String)}.
     *
     * - Ship-to existence check
     *       It checks by calling * {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(String, String, String)}.
     *       An error is made when * return VALUE is Null.
     *       (A return VALUE is used at the time of registration.)
     *
     * - Consignee existence check
     *       It checks by calling {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(String, String)}.
     *       An error is made when * return VALUE is Null.
     *       (A return VALUE is used at the time of registration.)
     *
     * - Exterior sign existence check
     *       * [21] : It carries out, only when Outer CD is not "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(String, String, W2009CmlCriteriaDomain)}.
     *
     * - VOLUME information registration check
     *       * [21] : It carries out, only when Outer CD is "."
     *       It checks by calling {@link W2009CmlService#validateDatabaseTmPkgSpecificationDtlOnRegister(String, String, String, String, W2009CmlCriteriaDomain)}.
     * 
     * - 夜間バッチ中チェック
     *     Session(2010.Disp. Shipper)が夜間バッチ中かをチェックする
     *     ※共通仕様.xls[機能仕様共通：CIGMA夜間バッチ中の振る舞い] 参照
     *     {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う。
     *    
     * - 組み合わせチェック1
     *     Session(2010.Disp. Shipper)、Session(2010.Disp. Cust. No.)、Session(2010.Disp. Ship to)の組合せチェック
     *     ※共通仕様.xls[機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック]参照
     *     {@link W2009CmlService#validateDatabaseShipperCustomerShipTo(String, String, String)} を呼出し、チェックを行う。
     *     
     * - 組み合わせチェック2
     *     Session(2010.Disp. Shipper)、Session(2010.Disp. W/H)、Session(2010.Disp. Plant CD)の組合せチェック
     *     ※共通仕様.xls[機能仕様共通：Shipper、W/H、Plant　組み合わせチェック]参照
     *     ※Session(2010.Disp. Plant CD)が""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseShipperWhPlantOnRegister(String, String, String)}を呼出し、チェックを行う。
     *     
     * - 組み合わせチェック3
     *     Session(2010.Disp. W/H Company)、Session(2010.Disp. NEXUS W/H)の組合せチェック
     *     ※共通仕様.xls[機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック]参照
     *     {@link W2009CmlService#validateDatabaseWhCompanyWh(String, String)}を呼出し、チェックを行う。
     *     
     * - 梱包指示チェック
     *     ※Session(2010.Disp. Palletize Instr. No.)が""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTtPltzInstrOnRegister(String)}を呼出し、チェックを行う。
     *
     * - 梱包指示品目番号チェック
     *     ※Session(2010.Disp. Palletize Instr. No.)が""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegister(String)}を呼出し、チェックを行う。
     *
     * - 指示超えチェック
     *    【64】:hidden Mix Tag Flgが"N"のデータ全てに対して行う
     *     ※Session(2010.Disp. Palletize Instr. No.)が""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(String, String, String, String, java.math.BigDecimal, java.math.BigDecimal)}を呼出し、チェックを行う。
     *     
     * - MIXED現品票チェック
     *    【64】:hidden Mix Tag Flgが"Y"のデータ全てに対して行う
     *     {@link W2009CmlService#validateDatabaseTtMixedTagOnRegister(String, String)}を呼出し、チェックを行う。
     *    
     * - 送荷先存在チェック
     *     {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(String, String, String)}を呼出し、チェックを行う。
     *     ※ 戻り値がNullの場合、エラー。(戻り値を登録時に使用します。)
     *     
     * - 荷受人存在チェック
     *     {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(String, String)}を呼出し、チェックを行う。
     *     ※ 戻り値がNullの場合、エラー。(戻り値を登録時に使用します。)
     *     
     * - 外装記号存在チェック   
     *     ※【21】:Outer CDが""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(String, String, com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)}を呼出し、チェックを行う。
     *
     * - 容積情報登録チェック
     *     ※【21】:Outer CDが""の場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTmPkgSpecificationDtlOnRegister(String, String, String, String, com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)}を呼出し、チェックを行う。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        String errMsgId = null;
        
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String packingWhCompCd = updateDomain.getCriteriaDomain().getPackingWhCompCd();
        String customerCd = updateDomain.getCriteriaDomain().getCustomerCd();
        String lgcyShipToCd = updateDomain.getCriteriaDomain().getLgcyShipTo();
        String lgcyWhCd = updateDomain.getCriteriaDomain().getLgcyWhCd();
        String plntCd = updateDomain.getCriteriaDomain().getPlntCd();
        String packingWhCd = updateDomain.getCriteriaDomain().getPackingWhCd();
        String pltzInstrNo = updateDomain.getCriteriaDomain().getPltzInstrNo();
        String outerPkgCd = updateDomain.getCriteriaDomain().getOuterPkgCd();
        String trnsCd = updateDomain.getCriteriaDomain().getTrnsCd();
        W2012CriteriaDomain w2012CriteriaDomain = updateDomain.getCriteriaDomain(); // UT442 ADD
        
        List<? extends W2012ListDomain> w2012List = updateDomain.getListDomainList();
        
        Locale locale = updateDomain.getLocale();
        
        // A check among a - night batch
        // - 夜間バッチ中チェック
        if (!w2009CmlService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            errMessages.add(new MessageDomain(null, NXS_E1_0060, null));
        }
        
        // - Shipper, Customer, a Ship to combination check
        // - Shipper、Customer、Ship to　組み合わせチェック
        if (!w2009CmlService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipToCd)){
            String[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.customerCd"),
                commonService.getResource(locale, "label.lgcyShipTo")};
            errMessages.add(new MessageDomain("w2012CriteriaDomain.shipperCd", GSCM_E0_0030, params));
            errMessages.add(new MessageDomain("w2012CriteriaDomain.customerCd", null, null));
            errMessages.add(new MessageDomain("w2012CriteriaDomain.lgcyShipTo", null, null));
        }
        // - Shipper, W/H, and Plant Combination check
        // - Shipper、W/H、Plant　組み合わせチェック
        if (!CheckUtil.isBlankOrNull(plntCd)) {
            if (!w2009CmlService.validateDatabaseShipperWhPlantOnRegister(shipperCd, lgcyWhCd, plntCd)) {
                String[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.shipperCd"),
                    commonService.getResource(locale, "label.lgcyWhCd"),
                    commonService.getResource(locale, "label.plntCd")};
                errMessages.add(new MessageDomain("w2012CriteriaDomain.shipperCd", GSCM_E0_0030, params));
                errMessages.add(new MessageDomain("w2012CriteriaDomain.lgcyWhCd", null, null));
                errMessages.add(new MessageDomain("w2012CriteriaDomain.plntCd", null, null));
            }
        }
        
        // - W/H Company, a NEXUS W/H combination check
        // - W/H Company、NEXUS W/H　組み合わせチェック
        if (!w2009CmlService.validateDatabaseWhCompanyWh(packingWhCompCd, packingWhCd)) {
            String[] params = {
                commonService.getResource(locale, "label.packingWhCompCd"),
                commonService.getResource(locale, "label.packingWhCd")};
            errMessages.add(new MessageDomain("w2012CriteriaDomain.packingWhCompCd", GSCM_E0_0029, params));
            errMessages.add(new MessageDomain("w2012CriteriaDomain.packingWhCd", null, null));
        }
        
        // - Packaging Instruction (=Pull) check
        // - 梱包指示チェック
        errMsgId = w2009CmlService.validateDatabaseTtPltzInstrOnRegister(pltzInstrNo);
        if (!CheckUtil.isBlankOrNull(errMsgId)) {
            errMessages.add(new MessageDomain(null, errMsgId, null));
        }
        
        // - Palletize-Instruction-Item-No check
        // - 梱包指示品目番号チェック
        if (!w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegister(pltzInstrNo)) {
            errMessages.add(new MessageDomain(null, GSCM_E0_0010, null));
        }

        for (W2012ListDomain domain : w2012List) {
            String mixTagFlg = domain.getMixTagFlg();
            String mixTagNo = domain.getPltzItemNo();
            int index = domain.getNo() - 1;
            // - Directions over check
            // - 指示超えチェック
            if (!CheckUtil.isBlankOrNull(pltzInstrNo) && FLAG_N.equals(domain.getMixTagFlg())) {
                String pkgCd = domain.getPkgCd();
                BigDecimal instrQty = stringToBigDecimal(domain.getInstrQty());
                BigDecimal qty = stringToBigDecimal(domain.getQty());
                if (!w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(
                            pltzInstrNo, mixTagFlg, mixTagNo, pkgCd, instrQty, qty)) {
                    String[] params = {mixTagNo};
                    errMessages.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0090, params));
                }
             // - Mix-Tag check
             // - MIXED現品票チェック
            } else if (FLAG_Y.equals(domain.getMixTagFlg())) {
                errMsgId = w2009CmlService.validateDatabaseTtMixedTagOnRegister(mixTagFlg, mixTagNo);
                if (errMsgId != null) {
                    if (GSCM_E0_0010.equals(errMsgId)) {
                        errMessages.add(new MessageDomain(String.format("listDomainList[%d].pltzItemNo", index), errMsgId, null));
                    } else {
                        String[] params = {mixTagNo};
                        errMessages.add(new MessageDomain(String.format("listDomainList[%d].pltzItemNo", index), errMsgId, params));
                    }
                }
            }
        }

        // - Ship-to existence check
        // - 送荷先存在チェック
        String wkShipToCd = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(shipperCd, customerCd, lgcyShipToCd);
        if (CheckUtil.isBlankOrNull(wkShipToCd)) {
            String[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.customerCd"),
                commonService.getResource(locale, "label.lgcyShipTo")};
            errMessages.add(new MessageDomain(null, GSCM_E0_0030, params));
            
        }
        
        // - Consignee existence check
        // - 荷受人存在チェック
        String wkCompCd  = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(shipperCd, customerCd);
        if (CheckUtil.isBlankOrNull(wkCompCd)) {
            String[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.customerCd")};
            errMessages.add(new MessageDomain(null, GSCM_E0_0029, params));
        }
        
        // - Exterior sign existence check
        // - 外装記号存在チェック
        W2009CmlCriteriaDomain wkDomain = new W2009CmlCriteriaDomain();
        if (!CheckUtil.isBlankOrNull(outerPkgCd)) {
            errMsgId = w2009CmlService
                .validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(shipperCd, outerPkgCd, wkDomain);
            if (!CheckUtil.isBlankOrNull(errMsgId)) {
                errMessages.add(new MessageDomain("w2012CriteriaDomain.outerPkgCd", errMsgId, null));
            }
        } else {
            // In the case of manual registration, not the input check of volume information.
            // マニュアル登録の場合容積情報登録チェックをしない。
            if (!FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) { // UT110 TRIAL SHIPMENT/号試品対応 ADD
                // - VOLUME information registration check
                // - 容積情報登録チェック
                for (W2012ListDomain domain : w2012List) {
                    String pltzItemNo = domain.getPltzItemNo();
                    String pkgCd = domain.getPkgCd();
                    int index = domain.getNo() - 1;
                    errMsgId = w2009CmlService.validateDatabaseTmPkgSpecificationDtlOnRegister(shipperCd, trnsCd, pltzItemNo, pkgCd, wkDomain);
                    if (!CheckUtil.isBlankOrNull(errMsgId)) {
                        String[] params = {pltzItemNo};
                        errMessages.add(new MessageDomain(String.format("listDomainList[%d].pltzItemNo", index), errMsgId, params));
                    }
                }
            }
        }

        // UT442 ADD START
        // If in case of manual registration, Volume proper check
        // マニュアル登録の場合Volume適正チェック
        if (FLAG_Y.equals(w2012CriteriaDomain.getManualRegFlg())) {
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(updateDomain.getCriteriaDomain().getShipperCd());
            TmNxsCompDomain resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            if (resultTmNxsCompDomain != null) {
                if (resultTmNxsCompDomain.getPltzVolumeMax() != null
                    && !CheckUtil.isBlankOrNull(w2012CriteriaDomain.getVolume()))
                {
                    if (resultTmNxsCompDomain.getPltzVolumeMax()
                        .compareTo(new BigDecimal(w2012CriteriaDomain.getVolume())) < 0)
                    {
                        VtCompMeasureUnitDomain resultVtCompMeasureUnitDomain
                            = commonService.searchMeasureUnit(w2012CriteriaDomain.getShipperCd());
                        String[] params = {
                            resultTmNxsCompDomain.getPltzVolumeMax().toPlainString()
                            + resultVtCompMeasureUnitDomain.getVolumeUnitDisp(),
                        };
                        errMessages.add(new MessageDomain("w2012CriteriaDomain.length", NXS_E7_0009, params));
                        errMessages.add(new MessageDomain("w2012CriteriaDomain.width", null, null));
                        errMessages.add(new MessageDomain("w2012CriteriaDomain.height", null, null));
                    }
                }
            }
        }
        // UT442 ADD END

        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        } else {
            // The VALUE used by registration processing is set to a Criteria domain, and is handed over.
            // 登録処理で使う値をCriteriaドメインにセットして引渡す
            updateDomain.getCriteriaDomain().setWkPltzShipToCode(wkShipToCd);
            updateDomain.getCriteriaDomain().setWkPltzConsigneeCd(wkCompCd);
            updateDomain.getCriteriaDomain().setWkHeight(decimalToString(wkDomain.getWkHeight(), null));
            updateDomain.getCriteriaDomain().setWkLength(decimalToString(wkDomain.getWkLength(), null));
            updateDomain.getCriteriaDomain().setWkWidth(decimalToString(wkDomain.getWkWidth(), null));
            updateDomain.getCriteriaDomain().setWkVolume(decimalToString(wkDomain.getWkVolume(), null));
            updateDomain.getCriteriaDomain().setWkLengthUnit(wkDomain.getWkLengthUnit());
            updateDomain.getCriteriaDomain().setWkVolumeUnit(wkDomain.getWkVolumeUnit());
            updateDomain.getCriteriaDomain().setWkHeightPalletize(decimalToString(wkDomain.getWkHeightPalletize(), null));
            updateDomain.getCriteriaDomain().setWkLengthPalletize(decimalToString(wkDomain.getWkLengthPalletize(), null));
            updateDomain.getCriteriaDomain().setWkWidthPalletize(decimalToString(wkDomain.getWkWidthPalletize(), null));
            updateDomain.getCriteriaDomain().setWkVolumePalletize(decimalToString(wkDomain.getWkVolumePalletize(), null));
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Firm-order-receipt alloc processing
     *    A DUE DATE performs firm-order-receipt alloc processing from the past ordering information most.
     *    * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is "."
     *    Export Receive Order
     *
     * - Palletize-Instruction-Receive-Order alloc processing
     *    A DUE DATE performs alloc processing of a PKG QTY from the past Palletize Instruction Receive Order most.
     *    * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is not "."
     *
     *    Palletize Instruction Receive Order
     *    Palletize Item Receive Order
     *
     * Registration of - Palletize Item Receive Order (this is copy registration of an alloc finishing order received to a MIX tag)
     *    Palletize Item Receive Order
     *
     * - Palletize data is registered.
     *    Palletize
     *    Palletize Item
     *
     * - Packaging Instruction (=Pull) information update processing
     *    Palletize Instruction Item No
     *
     * - Mix-Tag information update processing
     *    Mix Tag
     *
     * - A Temp Stock is updated and registered.
     *    Temp Stock
     *
     * This is registration of a link KANBAN information to - MIX tag.
     *    Mix Tag KANBAN
     *
     * - A work information is deleted.
     *    Palletize Item Work
     *    Palletize Item Package Work
     *
     * - Registration of an ordering alloc track record (starting of Web service)
     *    * It carries out, only when Session (2010. Disp. Palletize Instr. No.) is "."
     *
     * - Re retrieval
     * 
     * - 確定受注引当処理   
     *  最も納期が過去の受注情報から確定受注引当処理を行う
     *  ※Session(2010.Disp. Palletize Instr. No.)が""の場合のみ実施
     *  輸出受注
     * 
     * - 梱包指示品目番号受注情報引当処理   
     *  最も納期が過去の梱包指示品目番号受注情報から梱包数量の引当処理を行う
     *  ※Session(2010.Disp. Palletize Instr. No.)が""でない場合のみ実施
     *  
     *  梱包指示品目番号受注情報
     *  パレタイズ対象品受注情報                            
     * 
     * - パレタイズ対象品受注情報の登録(MIXタグに引当済み受注のコピー登録)
     *  パレタイズ対象品受注情報                            
     * 
     * - パレタイズデータを登録する
     *  パレタイズ
     *  パレタイズ対象品
     * 
     * - 梱包指示情報更新処理
     *  梱包指示品目番号
     * 
     * - MIXED現品票情報更新処理
     *  MIXED現品票
     * 
     * - 仮在庫を更新・登録する
     *  仮在庫
     * 
     * - MIXタグに紐づくかんばん情報の登録
     *  MIX品かんばん情報
     * 
     * - ワーク情報を削除する
     *  パレタイズ対象品ワーク                         
     *  パレタイズ対象品PKGワーク                          
     * 
     * - 受注引当実績の登録（Webサービスの起動）  
     *  ※Session(2010.Disp. Palletize Instr. No.)が""の場合のみ実施
     * 
     * - 再検索
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2012ListDomain> callServices(W2012UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {


        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // In the inside of the information from a screen and validateDatabase processing to criteria and w2012List
        // acquired VALUE is set up.
        // criteria と w2012List に画面からの情報と、validateDatabase処理の中で
        // 取得した値を設定する。
        setScreenInfos(updateDomain, criteria, w2012List);

        // Execution of registration processing
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
        
        // When an error is during registration processing
        // 登録処理中にエラーがあった場合
        if (errorMessages.size() > 0) {
            throw new ValidationException(errorMessages);
        }

        // Re retrieval
        // 再検索
        W2009CmlDomain resultDomain = w2009CmlService.searchOnRegisterInitByFromMain(criteria);

        // A converted in W2012 domain
        // W2012ドメインへの変換
        return convertToListDomain(resultDomain, updateDomain.getScreenDateFormat(), updateDomain.getCriteriaDomain());
    }

    /**
     * This is an information from a screen to the list of {@link W2009CmlCriteriaDomain} and {@link W2009CmlItemDomain},
     * Set up the VALUE acquired in validateDatabase processing.
     * <br />{@link W2009CmlCriteriaDomain} と {@link W2009CmlItemDomain} のリストに画面からの情報と、
     * validateDatabase処理の中で取得した値を設定する。
     *
     * @param updateDomain Mass update domain<br />一括更新ドメイン
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param list Search results list<br />検索結果リスト
     */
    private void setScreenInfos(W2012UpdateDomain updateDomain,
        W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> list) {
        
        W2012CriteriaDomain w2012Criteria = updateDomain.getCriteriaDomain();
        List<? extends W2012ListDomain> w2012List = updateDomain.getListDomainList();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, w2012Criteria, updateDomain.getScreenDateFormat());
        
        for (W2012ListDomain listDomain : w2012List) {
            W2009CmlItemDomain cmlItemDomain = new W2009CmlItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(cmlItemDomain, listDomain);
            
            list.add(cmlItemDomain);
        }
    }

    /**
     *       A VALUE is set to {@link W2012CriteriaDomain} from {@link W2009CmlDomain},
     *       The list of {@link W2012ListDomain} is generated and returned.
     * <br />{@link W2009CmlDomain} から {@link W2012CriteriaDomain}に値を設定し、
     *       {@link W2012ListDomain} のリストを生成して返す。
     *
     * @param resultDomain Search results<br />検索結果
     * @param screenDateFormat The Date format for screen display<br />画面表示用の日付フォーマット
     * @param criteriaDomain  Search-condition area domain<br />検索条件エリアドメイン
     * @return Search results list<br />検索結果リスト
     */
    private List<? extends W2012ListDomain> convertToListDomain(W2009CmlDomain resultDomain, String screenDateFormat, W2012CriteriaDomain criteriaDomain) {
        
        List<W2012ListDomain> resultList = new ArrayList<W2012ListDomain>();
        
        // From W2009CmlDomain, an information is set and returned to criteria.
        // W2009CmlDomainから、criteriaに情報をセットして返す。
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, resultDomain, screenDateFormat);
        
        // Format volume、weight items.
        // 重さ、容量項目のフォーマット
        criteriaDomain.setVolume(decimalToString(resultDomain.getVolume(), FORMAT_VOLUME));
        criteriaDomain.setNetWeight(decimalToString(resultDomain.getNetWeight(), FORMAT_WEIGHT));
        criteriaDomain.setGrossWeight(decimalToString(resultDomain.getGrossWeight(), FORMAT_WEIGHT));
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        criteriaDomain.setLength(decimalToString(resultDomain.getLength(), FORMAT_LENGTH));
        criteriaDomain.setWidth(decimalToString(resultDomain.getWidth(), FORMAT_LENGTH));
        criteriaDomain.setHeight(decimalToString(resultDomain.getHeight(), FORMAT_LENGTH));
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        
        // "N" is set to packagingConfirmedFlg.
        // packagingConfirmedFlg に "N" を設定する。
        criteriaDomain.setPackagingConfirmedFlg(FLAG_N);
        
        // processing mode is changed into a reference.
        // 処理モードを参照に変更
        criteriaDomain.setFunctionMode(W2009_CML_MODE_REF);
        
        // search-results list is set up.
        // 検索結果一覧を設定する。
        int no = 1;
        for (W2009CmlItemDomain domain : resultDomain.getCmlItemDomainList()) {
            W2012ListDomain listDomain = new W2012ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, domain, criteriaDomain.getScreenDateFormat());
            listDomain.setNo(no);
            resultList.add(listDomain);
            no = no + 1;
        }

        return resultList;
    }
    
    /**
     * Required input check of an exterior equipment CD
     * <br />外装品コードの必須入力チェック
     * <pre>
     * - PKG_FORM_TYP= -- the data of 'M' or WARNING_FLG='Y' exists -- and
     *     In [21] Outer CD ='', this is made into a required input error.
     * 
     * - PKG_FORM_TYP=’M’ または、WARNING_FLG=’Y’ のデータが存在するかつ、
     *   【21】Outer CD ＝’’の場合は、必須入力エラーとする。
     * </pre>
     *
     * @param updateDomain Screen input information<br />画面入力情報
     * @return In a required error, this is false.
     *         This is true when that is not right;
     *         <br />必須エラーの場合 false
     *         そうでない場合 true;
     */
    private boolean requirCheckForOuterPkgCd(W2012UpdateDomain updateDomain) {
        
        List<? extends W2012ListDomain> list = updateDomain.getListDomainList();
        String outerPkgCd = updateDomain.getCriteriaDomain().getOuterPkgCd();
        String pkgFormTyp = updateDomain.getCriteriaDomain().getPkgFormTyp();
        
        if (!CheckUtil.isBlankOrNull(outerPkgCd)) {
            return true;
        }
        
        if (!PKG_FORM_TYP_MULTI.equals(pkgFormTyp)) {
            return true;
        }
        
        for (W2012ListDomain domain : list) {
            if (FLAG_Y.equals(domain.getWarningFlg())) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * The VALUE of String is changed into BigDecimal.
     * <br />String の値を BigDecimal に変換
     * <pre>
     * Change the VALUE of - String into BigDecimal.
     *     When the result of having given {@link CheckUtil#isBlankOrNull (String)} the argument is true,
     *     It changes into null.
     * 
     * - String の値を BigDecimal に変換する。
     *   引数を{@link CheckUtil#isBlankOrNull(String)}に与えた結果がtrueの場合は、
     *   nullに変換する。
     * </pre>
     *
     * @param bigDecimalStr Numerical character string<br />数値文字列
     * @return The VALUE changed into Bigdecimal<br />Bigdecimalに変換した値
     */
    protected BigDecimal stringToBigDecimal(String bigDecimalStr) {
        if (CheckUtil.isBlankOrNull(bigDecimalStr)) {
            return null;
        } else {
            return new BigDecimal(bigDecimalStr);
        }
    }
    
    /**
     * The VALUE of BigDecimal is changed into String and returned.
     * <br />BigDecimal の値を String に変換して返す。
     * <pre>
     * Change the VALUE of - String into BigDecimal and return it.
     * null is returned when an argument is null.
     * 
     * - String の値を BigDecimal に変換して返す
     *   引数が null の場合は、null を返す。
     * </pre>
     *
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @param format Formater<br />フォーマッタ
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal, String format){
        
        if (decimalVal == null ) {
            return null;
        }
        if (format != null) {
            return NumberUtil.format(decimalVal, format);
        } else {
            return decimalVal.toPlainString();
        }
        
    }
}
