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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0086;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_NEXUS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Header
 * <br />小箱内多品番梱包Header画面のMove to Createサービス実装クラスです。
 * <pre>
 * bean W2006MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W2006MoveToCreateFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2006CriteriaDomain> {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;

    /**
     * constructor.
     */
    public W2006MoveToCreateFacadeServiceImpl() {
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
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
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
    protected W2006CriteriaDomain filterDomain(W2006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2006_Multiple Item No. in 1Box PKG Header.xls "screen item definition" is referred to for details.
     *
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2006_Multiple Item No. in 1Box PKG Header.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2006CriteriaDomain> valid
            = new Validator<W2006CriteriaDomain>(criteriaDomain, "w2006CriteriaDomain");

        Validator<W2006CriteriaDomain> valid2
            = new Validator<W2006CriteriaDomain>(criteriaDomain, "w2006CriteriaDomain");

        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Required input check of each item (necessary items are variable by an input value)  
        // 各項目の必須入力チェック(必須項目は入力値によって可変）
        String palletizeInstrRequired = criteriaDomain.getPltzInstrRequired();

        // No Selection
        if (CheckUtil.isBlankOrNull(palletizeInstrRequired)) {
            errorList.add(new MessageDomain( "w2006CriteriaDomain.pltzInstrRequired", GSCM_E0_0011,
                new Object[] {commonService.getResource(criteriaDomain.getLocale(), "label.pltzInstrRequired")}));
       
        } else {

            // In the case of [Y]
            if (palletizeInstrRequired.equals(FLAG_Y)) {
                String[] properties = {
                    "pltzInstrNo"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W2006);
                if (0 < valid.getErrList().size()) {
                    errorList.addAll(valid.getErrList());
                }

            // In the case of [N]
            } else if (palletizeInstrRequired.equals(FLAG_N)) {
                String[] properties = {
                    "shipperCd",
                    "customerCd",
                    "lgcyShipTo",
                    "trnsCd"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W2006);
                if (0 < valid.getErrList().size()) {
                    errorList.addAll(valid.getErrList());
                }

                String plntAndWhDeclaration = criteriaDomain.getPlntAndWhDeclaration();
                if (CheckUtil.isBlankOrNull(plntAndWhDeclaration)) {

                    errorList.add(new MessageDomain( "w2006CriteriaDomain.plntAndWhDeclaration", GSCM_E0_0011,
                            new Object[] {commonService.getResource( criteriaDomain.getLocale(), "label.plntAndWhDeclaration")}));
             
                } else {
                    // In the case of [CIGMA]
                    if (plntAndWhDeclaration.equals(TYP_PLANT_AND_WH_CIGMA)) {
                        String[] props = {
                            "plntCd",
                            "lgcyWhCd"
                        };
                        valid2.isValidateProperties( props, SCREEN_ID_W2006);
 
                    } else if (plntAndWhDeclaration.equals(TYP_PLANT_AND_WH_NEXUS)) {
                        String[] props = {
                            "whCompCd",
                            "whCd"
                        };
                        valid2.isValidateProperties( props, SCREEN_ID_W2006);
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
     * No Action
     *
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Instructed(=Pull) Palletizing check
     *       Only in [1]:Palletize Instr. Required ="Y", it carries out.
     *       - Packaging Instruction (=Pull) information check
     *           - acquired data - the acquisition number check (authority check lump)
     *               Those with an authority check
    This is a call about * {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreate(W2005MixTagDomain, W2005MixTagCriteriaDomain)}.
     *
     *           Check among - CIGMA night batch (Packaging Instruction (=Pull) .SHIPPER_CD)  
     *               This is a call about {@link W2005MixTagService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     *           - Shipper authority check (Packaging Instruction (=Pull) .SHIPPER_CD)
     *               Processing needlessness  * In order to carry out an authority check by written data acquisition
     *
     *           - Packaging Instruction (=Pull) document printing check
     *               This is a call about {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByPrint (String)}.
     *
     *           - Check completed [ PKG ]
    This is a call about * {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(String)}.
     *
     *           - NEXUS warehouse information acquisition check
     *               This is a call about {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd (String)}.
     *
     * - Result Palletize check (at the time of CIGMA W/H selection)
     *       It carries out, only when [8]:Plant & W/H Declaration is "CIGMA".
     *       Check ([4] : Shipper) among - CIGMA night batch
     *           This is a call about {@link W2005MixTagService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     *       - Authority check ([4] : Shipper)
     *           This is a call about {@link W2005MixTagService#validateDatabaseShipperPlantAuth (String, String)}.
     *
     *       - Master existence check ([4] : Shipper)
     *           This is a call about {@link W2005MixTagService#validateDatabaseShipper (String)}.
     *
     *       - Shipper, Customer, and Ship to Combination check ([4] : Shipper, [5]:Cust. No., [6]:Ship to)
     *           This is a call about {@link W2005MixTagService#validateDatabaseShipperCustomerShipTo (String, String, String)}.
     *
     *       - NEXUS warehouse information acquisition check
    This is a call about * {@link W2005MixTagService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(String, String[], String, String[], String[], String)}.
     *
     * - Result Palletize check (at the time of NEXUS W/H selection)  
     *       It carries out, only when [8]:Plant & W/H Declaration is "NEXUS".
     *       Check ([4] : Shipper) among - CIGMA night batch
     *           This is a call about {@link W2005MixTagService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     *       - Authority check ([4] : Shipper)
     *           In order to carry out an authority check with the check of the CIGMA warehouse information of the processing needlessness  * following
     *
     *       - Master existence check ([4] : Shipper)
     *           This is a call about {@link W2005MixTagService#validateDatabaseShipper (String)}.
     *
     *       - Shipper, Customer, and Ship to Combination check ([4] : Shipper, [5]:Cust. No., [6]:Ship to)
     *           This is a call about {@link W2005MixTagService#validateDatabaseShipperCustomerShipTo (String, String, String)}.
     *
     *       - W/H Com. and NEXUS W/H Combination check ([11] :W/H Com., [12]:NEXUS W/H)
     *           This is a call about {@link W2005MixTagService#validateDatabaseCompWh (String, String)}.
     *
     *       Check of - CIGMA warehouse information
     *           Those with * authority check
    This is a call about * {@link W2005MixTagService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(String, String[], String, String[], String[], String)}.
     *
     * - Storage of the session information for other screen display
     *       It carries out by Action.
     *
     * Storage of - Header conditions
     *       It carries out by Action.
     *
     * - 指示パレタイズチェック
     *     【1】:Palletize Instr. Required ＝ "Y"の場合のみ実施
     *     - 梱包指示情報チェック
     *         - 取得データ～取得件数チェック(権限チェック込み) 
     *             権限チェックあり
     *             {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreate(W2005MixTagDomain, W2005MixTagCriteriaDomain)}を呼出
     *             
     *         - CIGMA夜間バッチ中チェック(梱包指示.SHIPPER_CD)
     *             {@link W2005MixTagService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *             
     *         - Shipper権限チェック(梱包指示.SHIPPER_CD)
     *             処理不要 ※上記データ取得で権限チェックを実施する為
     *             
     *         - 梱包指示書印刷チェック
     *             {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(String)}を呼出
     *             
     *         - 梱包完了済みチェック
     *             {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(String)}を呼出
     *             
     *         - NEXUS倉庫情報取得チェック
     *             {@link W2005MixTagService#validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(String)}を呼出
     *     
     * - 成行パレタイズチェック（CIGMA倉庫選択時）
     *     【8】:Plant & W/H Declarationが"CIGMA"の場合のみ実施
     *     - CIGMA夜間バッチ中チェック(【4】:Shipper)
     *         {@link W2005MixTagService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *         
     *     - 権限チェック(【4】:Shipper)
     *         {@link W2005MixTagService#validateDatabaseShipperPlantAuth(String, String)}を呼出
     *         
     *     - 原単位存在チェック(【4】:Shipper)
     *         {@link W2005MixTagService#validateDatabaseShipper(String)}を呼出
     *         
     *     - Shipper、Customer、Ship to　組み合わせチェック(【4】:Shipper、【5】:Cust. No.、【6】:Ship to)
     *         {@link W2005MixTagService#validateDatabaseShipperCustomerShipTo(String, String, String)}を呼出
     *         
     *     - NEXUS倉庫情報取得チェック
     *         {@link W2005MixTagService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(String, String[], String, String[], String[], String)}を呼出
     *     
     * - 成行パレタイズチェック（NEXUS倉庫選択時）
     *     【8】:Plant & W/H Declarationが"NEXUS"の場合のみ実施
     *     - CIGMA夜間バッチ中チェック(【4】:Shipper)
     *         {@link W2005MixTagService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *         
     *     - 権限チェック(【4】:Shipper)
     *         処理不要 ※下記のCIGMA倉庫情報のチェックで権限チェックを実施する為
     *         
     *     - 原単位存在チェック(【4】:Shipper)
     *         {@link W2005MixTagService#validateDatabaseShipper(String)}を呼出
     *         
     *     - Shipper、Customer、Ship to　組み合わせチェック(【4】:Shipper、【5】:Cust. No.、【6】:Ship to)
     *         {@link W2005MixTagService#validateDatabaseShipperCustomerShipTo(String, String, String)}を呼出
     *         
     *     - W/H Com.、NEXUS W/H　組み合わせチェック(【11】:W/H Com.、【12】:NEXUS W/H)
     *         {@link W2005MixTagService#validateDatabaseCompWh(String, String)}を呼出
     *         
     *     - CIGMA倉庫情報のチェック
     *         ※権限チェックあり
     *         {@link W2005MixTagService#validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(String, String[], String, String[], String[], String)}を呼出
     *     
     * - 他画面表示用セッション情報の保管
     *     Actionで実施
     * 
     * - Header条件の保管
     *     Actionで実施
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Acquisition of an input value
        // 入力値の取得
        String customerCd = criteriaDomain.getCustomerCd();
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        String pltzInstrNo = criteriaDomain.getPltzInstrNo();
        String plntCd = criteriaDomain.getPlntCd();
        String lgcyWhCd = criteriaDomain.getLgcyWhCd();
        String whCompCd = criteriaDomain.getWhCompCd();
        String whCd = criteriaDomain.getWhCd();        
        String shipperCd = criteriaDomain.getShipperCd();
        String pltzInstrRequired = criteriaDomain.getPltzInstrRequired();
        String plntAndWhDeclaration = criteriaDomain.getPlntAndWhDeclaration();
        String serverId = criteriaDomain.getServerId();
        // for return VALUE storing
        // 戻り値格納用
        String[] returnLgcyWhCd = {lgcyWhCd};
        String[] returnWhCompCd = {whCompCd};
        String[] returnWhCd = {whCd};
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        Locale locale = criteriaDomain.getLocale();
        
        // Instructed(=Pull) Palletizing check
        // Only in [1]:Palletize Instr. Required ="Y", it carries out.
        // 指示パレタイズチェック
        // 【1】:Palletize Instr. Required ＝ "Y"の場合のみ実施
        if (!CheckUtil.isBlankOrNull(pltzInstrRequired) && pltzInstrRequired.equals(FLAG_Y)){
            
            // Packaging Instruction (=Pull) information check
            // 梱包指示情報チェック

            W2005MixTagDomain mixTag = new W2005MixTagDomain();

            if (!CheckUtil.isBlankOrNull(pltzInstrNo)) {
                
                W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
                mixTagCriteria.setPltzInstrNo(pltzInstrNo);
                mixTagCriteria.setServerId(criteriaDomain.getServerId());

                // The acquisition number check (authority check lump)  
                // 取得件数チェック(権限チェック込み)
                if (!w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreate(mixTag, mixTagCriteria)) {

                    MessageDomain msgPltzInstrNo = new MessageDomain("w2006CriteriaDomain.pltzInstrNo", NXS_E7_0047, null);
                    errorList.add(msgPltzInstrNo);
                } else {

                    // A check among a CIGMA night batch
                    // CIGMA夜間バッチ中チェック
                    if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, mixTag.getShipperCd())) {
                        MessageDomain msgShipperCd = new MessageDomain("", NXS_E1_0060, null);
                        errorList.add(msgShipperCd);
                    }

                    // Shipper authority check (processing needlessness  * in order to carry out an authority check by written data acquisition)  
                    // Shipper権限チェック
                    if (!w2005MixTagService.validateDatabaseShipperPlantAuth(mixTag.getShipperCd(), mixTag.getPlntCd())) {
                        MessageDomain msgShipperCd = new MessageDomain("", GSCM_I0_0009, null);
                        errorList.add(msgShipperCd);
                    }

                    // Packaging Instruction (=Pull) document printing check
                    // 梱包指示書印刷チェック
                    if(!w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(mixTag.getPltzInstrStatus())){
                        MessageDomain msgPltzInstrNo = new MessageDomain("w2006CriteriaDomain.pltzInstrNo", NXS_E7_0086, null);
                        errorList.add(msgPltzInstrNo);
                    }
                    // Check completed [ PKG ]
                    // 梱包完了済みチェック
                    if(!w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(mixTag.getPltzInstrStatus())){
                        MessageDomain msgPltzInstrNo = new MessageDomain("w2006CriteriaDomain.pltzInstrNo", NXS_E7_0048, null);
                        errorList.add(msgPltzInstrNo);
                    }
                    // NEXUS warehouse information acquisition check
                    // NEXUS倉庫情報取得チェック
                    if(!w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(mixTag.getCompCd())){
                        Object[] params = {
                            commonService.getResource(locale, "label.shipperCd"),
                            commonService.getResource(locale, "label.plntCd"),
                            commonService.getResource(locale, "label.lgcyWhCd")
                        };
                        MessageDomain msgPltzInstrNo = new MessageDomain("w2006CriteriaDomain.pltzInstrNo", GSCM_E0_0030, params);
                        errorList.add(msgPltzInstrNo);
                    }
                }
                
                // acquisition VALUE is set to the item Wk of CriteriaDomain (for the storage to a session).  
                // 取得値をCriteriaDomainのWk項目へ設定(セッションへの保管のため)
                criteriaDomain.setWkShipperCd(mixTag.getShipperCd());
                criteriaDomain.setWkCustomerCd(mixTag.getCustomerCd());
                criteriaDomain.setWkLgcyShipTo(mixTag.getLgcyShipTo());
                criteriaDomain.setWkTrnsCd(mixTag.getTrnsCd());
                criteriaDomain.setWkPlntCd(mixTag.getPlntCd());
                criteriaDomain.setWkLgcyWhCd(mixTag.getLgcyWhCd());
                criteriaDomain.setWkWhCompCd(mixTag.getCompCd());
                criteriaDomain.setWkWhCd(mixTag.getWhCd());
                
            }
        }
        
        // Result Palletize check (at the time of CIGMA W/H selection)  
        // It carries out, only when [8]:Plant & W/H Declaration is "CIGMA".
        // 成行パレタイズチェック（CIGMA倉庫選択時）
        // 【8】:Plant & W/H Declarationが"CIGMA"の場合のみ実施
        if (!CheckUtil.isBlankOrNull(plntAndWhDeclaration) && TYP_PLANT_AND_WH_CIGMA.equals(plntAndWhDeclaration)){
            
            // A check among a CIGMA night batch
            // CIGMA夜間バッチ中チェック
            if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, shipperCd)) {
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", NXS_E1_0060, null);
                errorList.add(msgShipperCd);
            }            
            // Authority check
            // 権限チェック
            if (!w2005MixTagService.validateDatabaseShipperPlantAuth(shipperCd, plntCd)) {
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", GSCM_I0_0009, null);
                MessageDomain msgPlntCd = new MessageDomain("w2006CriteriaDomain.plntCd", null, null);
                errorList.add(msgShipperCd);
                errorList.add(msgPlntCd);
            }            
            // Master existence check
            // 原単位存在チェック
            if (!w2005MixTagService.validateDatabaseShipper(shipperCd)) {
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", NXS_E7_0111, null);
                errorList.add(msgShipperCd);
            }
            // Shipper, Customer, a Ship to combination check
            // Shipper、Customer、Ship to組み合わせチェック
            if (!w2005MixTagService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo)) {
                Object[] params = {
                    commonService.getResource(locale, "label.shipperCd"),
                    commonService.getResource(locale, "label.customerCd"),
                    commonService.getResource(locale, "label.lgcyShipTo")
                };
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", GSCM_E0_0030, params);
                MessageDomain msgCustomerCd = new MessageDomain("w2006CriteriaDomain.customerCd", null, null);
                MessageDomain msgLgcyShipTo = new MessageDomain("w2006CriteriaDomain.lgcyShipTo", null, null);
                errorList.add(msgShipperCd);
                errorList.add(msgCustomerCd);
                errorList.add(msgLgcyShipTo);
            }
            // NEXUS warehouse information acquisition check
            // NEXUS倉庫情報取得チェック
            boolean tmCigmaWhXrefFlg = w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(
                shipperCd, returnLgcyWhCd, plntCd, returnWhCompCd, returnWhCd, serverId);
            if (!tmCigmaWhXrefFlg) {
                Object[] params = {
                    commonService.getResource(locale, "label.shipperCd"),
                    commonService.getResource(locale, "label.plntCd"),
                    commonService.getResource(locale, "label.lgcyWhCd")
                };
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", GSCM_E0_0030, params);
                MessageDomain msgPlntCd = new MessageDomain("w2006CriteriaDomain.plntCd", null, null);
                MessageDomain msgLgcyWhCd = new MessageDomain("w2006CriteriaDomain.lgcyWhCd", null, null);
                errorList.add(msgShipperCd);
                errorList.add(msgPlntCd);
                errorList.add(msgLgcyWhCd);
            }
            // The VALUE acquired to session information is set up.
            // セッション情報へ取得した値を設定する
            criteriaDomain.setWkWhCompCd(returnWhCompCd[0]);
            criteriaDomain.setWkWhCd(returnWhCd[0]);
        }
        
        // Result Palletize check (at the time of NEXUS W/H selection)  
        // It carries out, only when [8]:Plant & W/H Declaration is "NEXUS".
        // 成行パレタイズチェック（NEXUS倉庫選択時）
        // 【8】:Plant & W/H Declarationが"NEXUS"の場合のみ実施
        
        if (!CheckUtil.isBlankOrNull(plntAndWhDeclaration) && TYP_PLANT_AND_WH_NEXUS.equals(plntAndWhDeclaration)){
            
            // A check among a CIGMA night batch
            // CIGMA夜間バッチ中チェック
            if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, shipperCd)) {
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", NXS_E1_0060, null);
                errorList.add(msgShipperCd);
            }
            
            // Shipper authority check (in order to carry out an authority check with the check of the CIGMA warehouse information of the processing needlessness  * following)  
            // Shipper権限チェック(処理不要 ※下記のCIGMA倉庫情報のチェックで権限チェックを実施する為)
            
            // Master existence check
            // 原単位存在チェック
            if (!w2005MixTagService.validateDatabaseShipper(shipperCd)) {
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", NXS_E7_0111, null);
                errorList.add(msgShipperCd);
            }
            // Shipper, Customer, a Ship to combination check
            // Shipper、Customer、Ship to 組み合わせチェック
            if (!w2005MixTagService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo)) {
                Object[] params = {
                    commonService.getResource(locale, "label.shipperCd"),
                    commonService.getResource(locale, "label.customerCd"),
                    commonService.getResource(locale, "label.lgcyShipTo")
                };
                MessageDomain msgShipperCd = new MessageDomain("w2006CriteriaDomain.shipperCd", GSCM_E0_0030, params);
                MessageDomain msgCustomerCd = new MessageDomain("w2006CriteriaDomain.customerCd", null, null);
                MessageDomain msgLgcyShipTo = new MessageDomain("w2006CriteriaDomain.lgcyShipTo", null, null);
                errorList.add(msgShipperCd);
                errorList.add(msgCustomerCd);
                errorList.add(msgLgcyShipTo);
            }
            // W/H Com., NEXUS W/H combination check ([11] :W/H Com., [12]:NEXUS W/H)  
            // W/H Com.、NEXUS W/H 組み合わせチェック(【11】:W/H Com.、【12】:NEXUS W/H)
            if (!w2005MixTagService.validateDatabaseCompWh(whCompCd, whCd)) {
                Object[] params = {
                    commonService.getResource(locale, "label.whCompCd"),
                    commonService.getResource(locale, "label.whCd")
                };
                MessageDomain msgWhCompCd = new MessageDomain("w2006CriteriaDomain.whCompCd", GSCM_E0_0029, params);
                MessageDomain msgWhCd = new MessageDomain("w2006CriteriaDomain.whCd", null, null);
                errorList.add(msgWhCompCd);
                errorList.add(msgWhCd);
            }
            
            // CIGMA warehouse information acquisition check
            // CIGMA倉庫情報取得チェック
            if (!w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(shipperCd, returnLgcyWhCd, plntCd, returnWhCompCd, returnWhCd, serverId)) {
                MessageDomain msgWhCompCd = new MessageDomain("w2006CriteriaDomain.whCompCd", GSCM_I0_0009, null);
                MessageDomain msgWhCd = new MessageDomain("w2006CriteriaDomain.whCd", null, null);
                errorList.add(msgWhCompCd);
                errorList.add(msgWhCd);
            }
            
            // The VALUE acquired to session information is acquired.
            // セッション情報へ取得した値を取得する
            criteriaDomain.setWkLgcyWhCd(returnLgcyWhCd[0]);
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
     * No Action
     *
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2006CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return null;
    }

}
