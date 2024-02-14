/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_LENGTH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2019ListDomain;
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
 * This is an implement class of the Facade service to Register action of a CML Trans Revise screen.
 * <br />CML Trans Revise画面の Register アクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id : w2019RegisterFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2019RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
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
     */
    public W2019RegisterFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
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
    protected W2019CriteriaDomain filterDomain(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Unary eye check
     *     The required input check of - reviseFlg is performed.
     * 
     * - 単項目チェック
     *   - reviseFlg の必須入力チェックを行う。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

// UT110 TRIAL SHIPMENT/号試品対応 DEL START
// There is no reviseFlg to TM_RESOURCES so deleted because it does not check.
// TM_RESOURCESにreviseFlgがなくチェックしていないので削除。
//        Validator<W2019CriteriaDomain> valid
//            = new Validator<W2019CriteriaDomain>(criteriaDomain, "w2019CriteriaDomain");
//
//        // Unary eye check
//        // 単項目チェック
//        String[] properties = {
//            "reviseFlg"
//        };
//
//        valid.isValidateProperties(properties, SCREEN_ID_W2019);
//
//        // Error check
//        // エラー確認
//        if (0 < valid.getErrList().size()) {
//            throw new ValidationException(valid.getErrList());
//        }
// UT110 TRIAL SHIPMENT/号試品対応 DEL END

        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        if (FLAG_Y.equals(criteriaDomain.getManualRegFlg())) {
            Validator<W2019CriteriaDomain> valid
                = new Validator<W2019CriteriaDomain>(criteriaDomain, "w2019CriteriaDomain");
            String[] properties = {
                "length",
                "width",
                "height",
                "volume",
                "grossWeight",
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2019);
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
     * - Packing-material registration check
     *     Make packagingConfirmedFlg into an argument.
     *     {@link W2009CmlService#validateConsistencyRegistPkg(String)} is called.
     * 
     * - 包装材登録チェック
     *   packagingConfirmedFlg を引数にして
     *   {@link W2009CmlService#validateConsistencyRegistPkg(String)}を呼出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        String packagingConfirmedFlg = criteriaDomain.getPackagingConfirmedFlg();
        
        if (!w2009CmlService.validateConsistencyRegistPkg(packagingConfirmedFlg)) {
            errMessages.add(new MessageDomain(null, NXS_E7_0039, null));
        }
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        if (FLAG_Y.equals(criteriaDomain.getManualRegFlg())) {
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(criteriaDomain.getLength())) < 0)) {
                String[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.length")
                };
                errMessages.add(new MessageDomain("w2019CriteriaDomain.length", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(criteriaDomain.getWidth())) < 0)) {
                String[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.width")
                };
                errMessages.add(new MessageDomain("w2019CriteriaDomain.width", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(criteriaDomain.getHeight())) < 0)) {
                String[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.height")
                };
                errMessages.add(new MessageDomain("w2019CriteriaDomain.height", GSCM_E0_0034, params));
            }
            if (!(BigDecimal.ZERO.compareTo(new BigDecimal(criteriaDomain.getGrossWeight())) < 0)) {
                String[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.grossWeight")
                };
                errMessages.add(new MessageDomain("w2019CriteriaDomain.grossWeight", GSCM_E0_0034, params));
            }
            if (
                !(new BigDecimal(criteriaDomain.getNetWeight())
                    .compareTo(new BigDecimal(criteriaDomain.getGrossWeight())) <= 0)
            )
            {
                errMessages.add(new MessageDomain(NXS_E7_0082, NXS_E7_0082, null));
                    // And does not null the first argument for the reason of FW Issue List No.79.
                    // FW修正依頼一覧.xls No.79の理由で第一引数をnullとしない。
            }
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Palletize check
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtPltzOnTransReviseRegister(String, W2009CmlCriteriaDomain, List)}.
     *
     * - Palletize-Item check
     *       It checks by calling {@link W2009CmlService#validateDatabaseTtPltzItemOnTransReviseRegister(String)}.
     *
     * - Exterior sign existence check
     *       * [11] : It carries out, only when Change Outer CD is not "."
     *       It checks by calling * {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister(String, String)}.
     * 
     * - パレタイズチェック
     *     {@link W2009CmlService#validateDatabaseTtPltzOnTransReviseRegister(String, W2009CmlCriteriaDomain, List)}を呼出し、チェックを行う。
     * 
     * - パレタイズ対象品チェック
     *     {@link W2009CmlService#validateDatabaseTtPltzItemOnTransReviseRegister(String)}を呼出し、チェックを行う。
     * 
     * - 外装記号存在チェック
     *     ※【11】:Change Outer CDが""でない場合のみ行う
     *     {@link W2009CmlService#validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister(String, String)}を呼出し、チェックを行う。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        String errMsgId = null;
        String mainMark = criteriaDomain.getMainMark();
        String shipperCd = criteriaDomain.getShipperCd();
        String outerPkgCd = criteriaDomain.getOuterPkgCd();

        // UT442 ADD START
        // If in case of manual registration, Volume proper check
        // マニュアル登録の場合Volume適正チェック
        if (FLAG_Y.equals(criteriaDomain.getManualRegFlg())) {
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteriaDomain.getShipperCd());
            TmNxsCompDomain resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            if (resultTmNxsCompDomain != null) {
                if (resultTmNxsCompDomain.getPltzVolumeMax() != null
                    && !CheckUtil.isBlankOrNull(criteriaDomain.getVolume()))
                {
                    if (resultTmNxsCompDomain.getPltzVolumeMax()
                        .compareTo(new BigDecimal(criteriaDomain.getVolume())) < 0)
                    {
                        VtCompMeasureUnitDomain resultVtCompMeasureUnitDomain
                            = commonService.searchMeasureUnit(criteriaDomain.getShipperCd());
                        String[] params = {
                            resultTmNxsCompDomain.getPltzVolumeMax().toPlainString()
                            + resultVtCompMeasureUnitDomain.getVolumeUnitDisp(),
                        };
                        errMessages.add(new MessageDomain("w2019CriteriaDomain.length", NXS_E7_0009, params));
                        errMessages.add(new MessageDomain("w2019CriteriaDomain.width", null, null));
                        errMessages.add(new MessageDomain("w2019CriteriaDomain.height", null, null));
                    }
                }
            }
        }
        // UT442 ADD END

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        // - Palletize check
        // - パレタイズチェック
        w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister(mainMark, criteria, errMessages);
        
        // - Palletize-Item check
        // - パレタイズ対象品チェック
        errMsgId = w2009CmlService.validateDatabaseTtPltzItemOnTransReviseRegister(mainMark);
        if (!CheckUtil.isBlankOrNull(errMsgId)) {
            errMessages.add(new MessageDomain(null, errMsgId, null));
        }
        
        // - Exterior sign existence check
        // - 外装記号存在チェック
        if (!CheckUtil.isBlankOrNull(outerPkgCd)) {
            errMsgId = w2009CmlService
                .validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(shipperCd, outerPkgCd, criteria);
            if (!CheckUtil.isBlankOrNull(errMsgId)) {
                errMessages.add(new MessageDomain("w2019CriteriaDomain.outerPkgCd", errMsgId, null));
            }
        }
        
        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        } else {
            // The VALUE used by registration processing is set to a Criteria domain, and is handed over.
            // 登録処理で使う値をCriteriaドメインにセットして引渡す
            criteriaDomain.setWkPltzInstrNo(criteria.getWkPltzInstrNo());
            criteriaDomain.setWkVolumeUnit(criteria.getWkVolumeUnit());
            criteriaDomain.setWkVolume(decimalToString(criteria.getWkVolume(), null));
            criteriaDomain.setWkLengthUnit(criteria.getWkLengthUnit());
            criteriaDomain.setWkLength(decimalToString(criteria.getWkLength(), null));
            criteriaDomain.setWkWidth(decimalToString(criteria.getWkWidth(), null));
            criteriaDomain.setWkHeight(decimalToString(criteria.getWkHeight(), null));
            // UT110 TRIAL SHIPMENT/号試品対応 ADD
            // If not in case of manual registration, Return the TT_PLTZ.LENGTH_UNIT.
            // マニュアル登録でない場合変換用にパレタイズの長さ単位を返す。
            if (!FLAG_Y.equals(criteriaDomain.getManualRegFlg())) {
                criteriaDomain.setLengthUnit(criteria.getLengthUnit());
            }
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Palletize data is updated.
     *     Acquisition of - LENGTH UNIT
     *       [1] : It acquires from Shipper.
     *        Acquisition of * unit and the notation is common-specifications .xls [acquisition of : [ / functional specification ] unit]. This is referred to.
     *        Palletize
     *
     * Update - Palletize-Item data (Packing material).
     *
     *     - Delete of existing information
     *       - The contents of a delete (Palletize Item)
     *         Palletize Item
     *
     *    Acquisition of - Palletize Item Package Work
     *
     *    - Acquisition of a BRANCH
     *      - acquired data (data with O is acquired)
     *        Palletize Item
     *
     *    - Registration processing (Palletize Item)
     *      - The contents of registration (Packing material)
     *
     * - A work information is deleted.
     *     Palletize Item Package Work
     *
     * - Re retrieval
     * Acquire the search data of initial display processing (in the case of the changes from a CML Main Screen).
     * 
     * - パレタイズデータを更新する
     *   - 長さ単位の取得
     *     【1】:Shipperから取得する
     *      ※単位、表記の取得は、共通仕様.xls[機能仕様共通：単位の取得] 参照
     *      パレタイズ
     * 
     * - パレタイズ対象品データ（包装材）を更新する
     * 
     *   - 既存情報の削除
     *     - 削除内容（パレタイズ対象品）
     *       パレタイズ対象品
     *       
     *  - パレタイズ対象品PKGワークの取得
     *
     *  - 枝番の取得
     *    - 取得データ(○がついているデータを取得する)
     *      パレタイズ対象品
     * 
     *  - 登録処理(パレタイズ対象品)
     *    - 登録内容（包装材）
     *        
     * - ワーク情報を削除する
     *   パレタイズ対象品PKGワーク
     *   
     * - 再検索
     * 初期表示処理の検索データの取得(CML Main Screen画面からの遷移の場合)を行う
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2019ListDomain> callServices(W2019CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // The information from a screen is set to criteria.
        // criteria に画面からの情報を設定する。
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        // Execution of registration processing
        // 登録処理の実行
        w2009CmlService.transactOnTransReviseRegister(criteria, errorMessages);
        
        // When an error is during registration processing
        // 登録処理中にエラーがあった場合
        if (errorMessages.size() > 0) {
            throw new ValidationException(errorMessages);
        }
        
        // Re retrieval processing is performed.
        // 再検索処理を行う
        W2009CmlCriteriaDomain dispcriteria = createCmlCriteria(criteriaDomain);
        List<? extends W2009CmlItemDomain> cmlItemList = w2009CmlService.searchForPagingOnTransReviseRegister(dispcriteria);
        
        List<? extends W2019ListDomain> w2019CmlList = new ArrayList<W2019ListDomain>();
        if (cmlItemList != null && !cmlItemList.isEmpty()) {
            w2019CmlList = createCmlItemList(cmlItemList);
        }
        
        // Re-setting of the domain used for header part is carried out (since only the detail section is set to w2019CmlList).  
        // ヘッダ部分に使用するdomainを再セットする（w2019CmlListには明細部しかセットされていないため）
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, dispcriteria);
        
        // Format volume、weight items.
        // 重さ、容量項目のフォーマット
        criteriaDomain.setVolume(decimalToString(dispcriteria.getVolume(), FORMAT_VOLUME));
        criteriaDomain.setNetWeight(decimalToString(dispcriteria.getNetWeight(), FORMAT_WEIGHT));
        criteriaDomain.setGrossWeight(decimalToString(dispcriteria.getGrossWeight(), FORMAT_WEIGHT));
        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        criteriaDomain.setLength(decimalToString(criteria.getLength(), FORMAT_LENGTH));
        criteriaDomain.setWidth(decimalToString(criteria.getWidth(), FORMAT_LENGTH));
        criteriaDomain.setHeight(decimalToString(criteria.getHeight(), FORMAT_LENGTH));
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END
        
        return w2019CmlList;
    }
    /**
     * {@link W2019CriteriaDomain} is changed into {@link W2009CmlCriteriaDomain}.
     * <br />{@link W2019CriteriaDomain} を {@link W2009CmlCriteriaDomain} に変換します。
     *
     * @param criteriaDomain {@link W2019CriteriaDomain}
     * @return {@link W2009CmlCriteriaDomain}
     */
    private W2009CmlCriteriaDomain createCmlCriteria(W2019CriteriaDomain criteriaDomain) {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        
        return criteria;
    }

    /**
     * The list of {@link W2009CmlItemDomain} is changed into the list of {@link W2019ListDomain}.
     * <br />{@link W2009CmlItemDomain}のリストを{@link W2019ListDomain}のリストに変換します。
     *
     * @param listDomainList The list of {@link W2009CmlItemDomain}<br />{@link W2009CmlItemDomain}のリスト
     * @return The list of {@link W2019ListDomain}<br />{@link W2019ListDomain}のリスト
     */
    private List<? extends W2019ListDomain> createCmlItemList(
        List<? extends W2009CmlItemDomain> listDomainList) {
        
        List<W2019ListDomain> cmlItemList = new ArrayList<W2019ListDomain>();
        
        for (W2009CmlItemDomain listDomain : listDomainList) {
            W2019ListDomain cmlItem = new W2019ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(cmlItem, listDomain);
            cmlItemList.add(cmlItem);
        }
        return cmlItemList;
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
