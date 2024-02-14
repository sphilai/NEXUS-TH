/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;


/**
 * This is an implement class of the Facade service to Move to Create action of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のMove to Createアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2002MoveToCreateFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2002MoveToCreateFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2002CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2002MoveToCreateFacadeServiceImpl() {
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
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2002CriteriaDomain filterDomain(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2002_Palletize Instruction Header.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2002_Palletize Instruction Header.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W2002CriteriaDomain> valid
            = new Validator<W2002CriteriaDomain>(criteriaDomain, "w2002CriteriaDomain");
    
        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "customerCd",
            "lgcyShipTo",
            "trnsCd",
            "plntCd",
            "lgcyWhCd",
            "pltzInstrDt",
            "customerPoNo",
            "poDueDtFrom",
            "poDueDtTo"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2002);
        
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Shipper authority check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyShipperPlantAuth(String, String)}.
     *
     * - Shipper権限チェック
     *     {@link W2001PltzInstrService#validateConsistencyShipperPlantAuth(String, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        String plntCd = criteriaDomain.getPlntCd();
        String poDueDtFrom = criteriaDomain.getPoDueDtFrom();
        String poDueDtTo = criteriaDomain.getPoDueDtTo();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Shipper authority check
        // Shipper権限チェック
        if (!w2001PltzInstrService.validateConsistencyShipperPlantAuth(shipperCd, plntCd)) {
            MessageDomain msgShipperCd = new MessageDomain("w2002CriteriaDomain.shipperCd", GSCM_I0_0009, null);
            MessageDomain msgPlntCd = new MessageDomain("w2002CriteriaDomain.plntCd", null, null);
            
            errorList.add(msgShipperCd);
            errorList.add(msgPlntCd);
        }
        
        // Acquisition of Date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correlation check of a P/O DUE DATE
        // 船積期限日の相関チェック
        if (!w2001PltzInstrService.validateConsistencyFmDateToDate(poDueDtFrom, poDueDtTo, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.poDueDt")
            };
            MessageDomain msgPoDueDtFrom = new MessageDomain("w2002CriteriaDomain.poDueDtFrom", GSCM_E0_0031, params);
            MessageDomain msgPoDueDtTo = new MessageDomain("w2002CriteriaDomain.poDueDtTo", null, null);
            
            errorList.add(msgPoDueDtFrom);
            errorList.add(msgPoDueDtTo);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Shipper authority check
     *       It checks by calling {@link W2001PltzInstrService#validateConsistencyShipperPlantAuth(String, String)}.
     *
     * - past day check
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseAfterDateComp(String, String, String)}.
     *
     * A check among - night batch
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}.
     *
     * - combination check (Shipper, Cust. No, Ship To)
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseShipperCustomerShipTo(String, String, String)}.
     *
     * - combination check (Shipper, W/H, Plant CD)
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseShipperWhPlant(String, String, String)}.
     * 
     * - 過去日チェック
     *     {@link W2001PltzInstrService#validateDatabaseAfterDateComp(String, String, String)}を呼出し、チェックを行う
     *     
     * - 夜間バッチ中チェック
     *     {@link W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う。
     *     
     * - 組み合わせチェック (Shipper、Cust. No、Ship To)
     *     {@link W2001PltzInstrService#validateDatabaseShipperCustomerShipTo(String, String, String)}を呼出し、チェックを行う。
     *     
     * - 組み合わせチェック (Shipper、W/H、Plant CD)
     *     {@link W2001PltzInstrService#validateDatabaseShipperWhPlant(String, String, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        String customerCd = criteriaDomain.getCustomerCd();
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        String plntCd = criteriaDomain.getPlntCd();
        String lgcyWhCd = criteriaDomain.getLgcyWhCd();
        String pltzInstrDt = criteriaDomain.getPltzInstrDt();
        
        // Acquisition of Date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Acquisition of a locale
        // ロケールの取得
        Locale locale = criteriaDomain.getLocale();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // past day check
        // 過去日チェック
        if (!w2001PltzInstrService.validateDatabaseAfterDateComp(pltzInstrDt, dateFormat, shipperCd)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.pltzInstrDt")
            };
            MessageDomain msg = new MessageDomain("w2002CriteriaDomain.pltzInstrDt", NXS_E7_0070, params);
            
            errorList.add(msg);
        }
        
        // CIGMA use propriety check
        // CIGMA利用可否チェック
        if (!w2001PltzInstrService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("w2002CriteriaDomain.shipperCd", NXS_E1_0060, null);
            
            errorList.add(msg);
        }
        
        // combination check (Shipper, Cust. No, Ship To)  
        // 組み合わせチェック (Shipper、Cust. No、Ship To)
        if (!w2001PltzInstrService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo)) {
            Object[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.customerCd"),
                commonService.getResource(locale, "label.lgcyShipTo"),
            };
            MessageDomain msgShipperCd = new MessageDomain("w2002CriteriaDomain.shipperCd", GSCM_E0_0030, params);
            MessageDomain msgCustomerCd = new MessageDomain("w2002CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("w2002CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgShipperCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        }
        // combination check (Shipper, W/H, Plant CD)  
        // 組み合わせチェック (Shipper、W/H、Plant CD)
        if (!w2001PltzInstrService.validateDatabaseShipperWhPlant(shipperCd, lgcyWhCd, plntCd)) {
            Object[] params = {
                commonService.getResource(locale, "label.shipperCd"),
                commonService.getResource(locale, "label.lgcyWhCd"),
                commonService.getResource(locale, "label.plntCd")
            };
            MessageDomain msgShipperCd = new MessageDomain("w2002CriteriaDomain.shipperCd", GSCM_E0_0030, params);
            MessageDomain msgLgcyWhCd = new MessageDomain("w2002CriteriaDomain.lgcyWhCd", null, null);
            MessageDomain msgPlntCd = new MessageDomain("w2002CriteriaDomain.plntCd", null, null);
           
            errorList.add(msgShipperCd);
            errorList.add(msgLgcyWhCd);
            errorList.add(msgPlntCd);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2002CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // No Action
        // 処理なし
        return null;
    }
}
