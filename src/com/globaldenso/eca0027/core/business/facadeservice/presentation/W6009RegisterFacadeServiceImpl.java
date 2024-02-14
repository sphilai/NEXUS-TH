/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_MISCELLANEOUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DECIMAL_PART;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_E_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_AMOUNT_DIGIT_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_AMOUNT_DIGIT_REPORT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0059;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0115;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0119;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_LC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SPECIAL_INFORMATION_PAR_LINE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SPECIAL_INFORMATION_ROW;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * 
 * Service for the Facade Register of action Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のRegisterアクションに対するFacadeサービスです。
 * <pre>
 * bean id: w6009RegisterFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class W6009RegisterFacadeServiceImpl extends AbstractTransactFacadeService<W6009CriteriaDomain, W6009CriteriaDomain>{
    
    /**
     * Documentation Service<br />
     * Documentationサービス
     */
    protected W6001DocService w6001DocService;

    /**
     * Common Features Service<br />
     * 共通機能サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009RegisterFacadeServiceImpl(){
        super();
    }
    
    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
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
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain filterDomain(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        criteriaDomain.setSpInfo(convertLineSeparator(criteriaDomain.getSpInfo()));
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check
     *     Reference to "Display item definition" of "the screen definition document _ECA0027_W6009_Invoice Register.xls".
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     *     詳細は画面定義書_ECA0027_W6009_Invoice Register.xls「画面項目定義」を参照
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6009CriteriaDomain> valid = new Validator<W6009CriteriaDomain>(criteriaDomain, "w6009CriteriaDomain");

        List<String> propertyList = new ArrayList<String>();
        
        if (!GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            // FRT
            propertyList.add("frtShipperCd");
            propertyList.add("frtConsigneeCd");
        }
        
        propertyList.add("invTplNo");
        
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            // Main
            propertyList.add("freightResponsibleCd");
            propertyList.add("dispInvoiceIssueDt");
            
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 START >>>>>
//            if(INVOICE_CTGRY_C.equals(criteriaDomain.getInvoiceCtgry())){
            if(!INVOICE_CTGRY_N.equals(criteriaDomain.getInvoiceCtgry())){
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 END <<<<<
                propertyList.add("remLcTyp");
            }
        } else {
            // FRT
            propertyList.add("priceTerms");
        }
        
        if (REM_LC_TYP_REM.equals(criteriaDomain.getRemLcTyp())) {
            // Case of Remittance selection 
            // Remittance選択の場合
            propertyList.add("remBankNm");
            propertyList.add("remBankAddress1");
            propertyList.add("remBankAddress2");
            propertyList.add("remBankAddress3");
            propertyList.add("remBankAccountNo");
        } 
        if (REM_LC_TYP_LC.equals(criteriaDomain.getRemLcTyp())) {
            // Case of L/C selection 
            // L/C選択の場合
            propertyList.add("lcBankNm1");
            propertyList.add("lcBankNm2");
            propertyList.add("lcNo");
            propertyList.add("lcDt");
        }
        
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            propertyList.add("freight");
            propertyList.add("insurance");
            propertyList.add("vatRatio");
            if(CML_TYPE_MISCELLANEOUS.equals(criteriaDomain.getCmlTyp())) {
                propertyList.add("handlingCharge");
                propertyList.add("additionalCharge");
            }
        }
        propertyList.add("bookingNo");
        // Addition of a check item (No78～No95)
        // チェック項目の追加(No78～No95)
        propertyList.add("spInfo");
        propertyList.add("notifyParty1Nm");
        propertyList.add("notifyParty1Addr");
        propertyList.add("notifyParty2Nm");
        propertyList.add("notifyParty2Addr");
        propertyList.add("notifyParty3Nm");
        propertyList.add("notifyParty3Addr");
        propertyList.add("notifyParty4Nm");
        propertyList.add("notifyParty4Addr");
        
        String[] properties = propertyList.toArray(new String[0]);
        valid.isValidateProperties(properties, SCREEN_ID_W6009);
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Check correlation calculation of the amount of money related 
     *      Call the {@link #validateConsistencyCalculateAmount(W6009CriteriaDomain)}.
     *      
     * - Required Check 
     *      Call the {@link #validateConsistencyRequire(W6009CriteriaDomain)}.
     * 
     * - Special Information number of characters, the number of new line check 
     *      Call the {@link W6001DocService#validateConsistencySpecialInformation(String, Integer, Integer)}.
     *      
     * - Notify Part of check-related 
     *      Call the {@link #validateConsistencyRequireForNotifyParty(W6009CriteriaDomain)}.
     *      
     * - Amount number of digits check
     *      Call the {@link #validateConsistencyRequireForMaxAmountDegit(W6009CriteriaDomain)}.
     *      
     * </pre>
     * <pre>
     * ‐金額計算関連の相関チェック
     *     {@link #validateConsistencyCalculateAmount(W6009CriteriaDomain)}を呼び出します。
     * 
     * ‐必須チェック
     *     {@link #validateConsistencyRequire(W6009CriteriaDomain)}を呼び出します。
     * 
     * ‐Special Information 文字数、改行数チェック
     *     {@link W6001DocService#validateConsistencySpecialInformation(String, Integer, Integer)}を呼び出します。
     * 
     * ‐Notify Part関連のチェック
     *     {@link #validateConsistencyRequireForNotifyParty(W6009CriteriaDomain)}を呼び出します。
     * 
     * ‐金額桁数チェック
     *     {@link #validateConsistencyRequireForMaxAmountDegit(W6009CriteriaDomain)}を呼び出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Locale locale = criteriaDomain.getLocale();
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
  
        // Price computation-related correlation check 
        // 金額計算関連の相関チェック
        errList.addAll(validateConsistencyCalculateAmount(criteriaDomain));
        
        errList.addAll(validateConsistencyRequire(criteriaDomain));
        
        // Special Information The number of characters, the number check of new-lines
        // Special Information 文字数、改行数チェック
        if (!w6001DocService.validateConsistencySpecialInformation(criteriaDomain.getSpInfo(), SPECIAL_INFORMATION_PAR_LINE, SPECIAL_INFORMATION_ROW)) {
            String[] params = {
                commonService.getResource(locale, "label.spInfo")
                , Integer.toString(SPECIAL_INFORMATION_PAR_LINE)
                , Integer.toString(SPECIAL_INFORMATION_ROW)
            };
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.spInfo", GSCM_E0_0039, params);
            errList.add(md);
        }
        
        // Notify Part related check 
        // Notify Part関連のチェック
        errList.addAll(validateConsistencyRequireForNotifyParty(criteriaDomain));
        
        // Amount-of-money digit number check 
        // 金額桁数チェック
        errList.addAll(validateConsistencyRequireForMaxAmountDegit(criteriaDomain));
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Night batch check 
     *    With the name of the shipper and Cml Typ code of search criteria domain, 
     *    Call the {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}.
     *    
     * - Price error checking
     *     Call the {@link #validateDatabaseInvAmountChk(W6009CriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐夜間バッチチェック
     *     検索条件ドメインの荷主コードとCml Typを引数にして、
     *     {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}を呼出します。
     * 
     * ‐金額エラーチェック
     *     {@link #validateDatabaseInvAmountChk(W6009CriteriaDomain)}を呼び出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        String errCd = w6001DocService.validateDatabaseCigmaAvailable(criteriaDomain.getShipperCd(), criteriaDomain.getCmlTyp());
        if (errCd != null){
            throw new ValidationException(Arrays.asList(new MessageDomain("", errCd, null)));
        }
        
        // Check of an amount-of-money error 
        // 金額エラーチェック
        validateDatabaseInvAmountChk(criteriaDomain);
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = prepareCriteriaDomain(criteriaDomain);
        
        W6001DocInvoiceDomain docInvoiceDomain = w6001DocService.transactOnRegister(docCriteria);
        
        return convertW6009CriteriaDomain(docInvoiceDomain, criteriaDomain);
    }

    // --- validateConsistency ---------------------------------------------------------------------
    /**
     * 
     * Check the correlation calculation of the amount of money involved.
     * <br />金額計算関連の相関チェックをします。
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />
     * エラーリスト
     * @throws ApplicationException If the correlation check calculation amount can not be related.<br />
     * 金額計算関連の相関チェックができない場合。
     */
    protected List<MessageDomain> validateConsistencyCalculateAmount (W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();

        int digit = Integer.parseInt(criteriaDomain.getDigit());
        
        BigDecimal freeAdd = new BigDecimal(criteriaDomain.getAdditionalCharge());
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//        String freeAddNm = criteriaDomain.getAdditionalChargeNm();
        String freeAddCd = criteriaDomain.getAdditionalChargeCd();
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
        
        // Related check of Free Additional and Free Additional Name
        // Free AdditionalとFree Additional Nameの関連チェック
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//        if (!w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameOver(freeAdd, freeAddNm)) {
        if (!w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameOver(freeAdd, freeAddCd)) {
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            String[] params = {
                commonService.getResource(locale, "label.additionalCharge")
                , commonService.getResource(locale, "label.additionalChargeNm")
            };
            // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", NXS_E7_0116, params);
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", GSCM_E0_0029, params);
            // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeNm", null, null);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeCd", null, null);
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            errList.add(md1);
            errList.add(md2);
        }
        
        // Related check of Free Additional and Free Additional Name
        // Free AdditionalとFree Additional Nameの関連チェック
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
        if (!w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameZero(freeAdd, freeAddCd)) {
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            String[] params = {
                commonService.getResource(locale, "label.additionalCharge")
                // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//                , commonService.getResource(locale, "label.additionalCharge")
                , commonService.getResource(locale, "label.additionalChargeNm")
                // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            };
            // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", NXS_E7_0117, params);
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", GSCM_E0_0029, params);
            // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeNm", null, null);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeCd", null, null);
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            errList.add(md1);
            errList.add(md2);
        }
        
        // Related check of Freight and internal variable .digit
        // Freightと内部変数.digitの関連チェック
        if (!w6001DocService.validateConsistencyDigit(new BigDecimal(criteriaDomain.getFreight()), digit)) {
            String[] params = {
                commonService.getResource(locale, "label.freight")
                , DECIMAL_PART
                , Integer.toString(digit)
            };
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.freight", NXS_E7_0017, params);
            errList.add(md);
        }
        
        // Related check of Insurance and internal variable .digit
        // Insuranceと内部変数.digitの関連チェック
        if (!w6001DocService.validateConsistencyDigit(new BigDecimal(criteriaDomain.getInsurance()), digit)) {
            String[] params = {
                commonService.getResource(locale, "label.insurance")
                , DECIMAL_PART
                , Integer.toString(digit)
            };
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.insurance", NXS_E7_0017, params);
            errList.add(md);
        }
        
        // Related check of Handling Charge and internal variable .digit
        // Handling Chargeと内部変数.digitの関連チェック
        if (!w6001DocService.validateConsistencyDigit(new BigDecimal(criteriaDomain.getHandlingCharge()), digit)) {
            String[] params = {
                commonService.getResource(locale, "label.handlingCharge")
                , DECIMAL_PART
                , Integer.toString(digit)
            };
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.handlingCharge", NXS_E7_0017, params);
            errList.add(md);
        }
        
        // Related check of Free Additional and internal variable .digit
        // Free Additionalと内部変数.digit の関連チェック
        if (!w6001DocService.validateConsistencyDigit(new BigDecimal(criteriaDomain.getAdditionalCharge()), digit)) {
            String[] params = {
                commonService.getResource(locale, "label.additionalCharge")
                , DECIMAL_PART
                , Integer.toString(digit)
            };
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.additionalCharge", NXS_E7_0017, params);
            errList.add(md);
        }
        return errList;
    }
    
    /**
     * 
     * Check the necessary prerequisite to Rgister processing.
     * <br />Rgister処理に必要な必須条件のチェックを行います。
     * <pre>
     * [In the case of FRT products, if input error of the following items] 
     *   ‐FRT Shipper
     * 
     * [In the case of "Remittance", Remittance or L / C , if not input following items then error]
     *   ‐Remittance Bank Name
     *   ‐Remittance Bank Address1
     *   ‐Remittance Bank Address2
     *   ‐Remittance Bank Address3
     *   ‐Remittance Bank Account No
     * 
     * [In the case of "L / C", Remittance or L / C, if not input of following items then error]
     *   ‐L/C Bank Name
     *   ‐L/C Bank Name2
     *   ‐L/C No
     *   ‐L/C Date
     * 
     * - Special Information number of characters, the number of new line check 
     *    Call the {@link W6001DocService#validateConsistencySpecialInformation(String, Integer, Integer)}.
     * 
     * - Notify Party related check 
     *    The error if a combination of the following, one or the other there is only input.
     *    ‐Notify Party1 Name と Notify Party1 Address
     *    ‐Notify Party2 Name と Notify Party2 Address
     *    ‐Notify Party3 Name と Notify Party3 Address
     *    ‐Notify Party4 Name と Notify Party4 Address
     *      
     * </pre>
     * 
     * <pre>
     * [FRT品の場合、下記項目の入力がない場合エラー]
     *   ‐FRT Shipper
     * 
     * [Remittance or L/Cが「Remittance」の場合、下記項目の入力がない場合エラー]
     *   ‐Remittance Bank Name
     *   ‐Remittance Bank Address1
     *   ‐Remittance Bank Address2
     *   ‐Remittance Bank Address3
     *   ‐Remittance Bank Account No
     * 
     * [Remittance or L/Cが「L/C」の場合、下記項目の入力がない場合エラー]
     *   ‐L/C Bank Name
     *   ‐L/C Bank Name2
     *   ‐L/C No
     *   ‐L/C Date
     *   
     * ‐Special Information 文字数、改行数チェック
     *     {@link W6001DocService#validateConsistencySpecialInformation(String, Integer, Integer)}を呼び出します。
     * 
     * ‐Notify Party関連チェック
     *     下記の組合せで、どちらか片方しか入力されていない場合はエラー
     *         ‐Notify Party1 Name と Notify Party1 Address
     *         ‐Notify Party2 Name と Notify Party2 Address
     *         ‐Notify Party3 Name と Notify Party3 Address
     *         ‐Notify Party4 Name と Notify Party4 Address
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />
     * エラーリスト
     * @throws ApplicationException If a required check can not be<br />
     * 必須チェックができなかった場合
     */
    protected List<? extends MessageDomain> validateConsistencyRequire(W6009CriteriaDomain criteriaDomain) throws ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();
        
        // FRT Shipper
        if(!w6001DocService.validateConsistencyFrtShipper(criteriaDomain.getFrtShipperCd(), criteriaDomain.getGrpNo2())) {
            String[] params = {commonService.getResource(locale, "label.frtShipperCd")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.frtShipperCd", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // Cheack Remittance-related 
        // Remittance関連のチェック
        errList.addAll(validateConsistencyRequireForRemittance(criteriaDomain));
        
        // Cheack L/C-related 
        // L/C関連のチェック
        errList.addAll(validateConsistencyRequireForLc(criteriaDomain));
        
        return errList;
    }
    
    /**
     * 
     * Check the necessary prerequisite to Rgister processing (Remittance-related).
     * <br />Rgister処理に必要な必須条件のチェックを行います(Remittance関連)。
     * <pre>
     * Check the {@link W6001DocService#validateConsistencyRemittance(String, String)} in the following items.
     *   ‐Remittance Bank Name
     *   ‐Remittance Bank Address1
     *   ‐Remittance Bank Address2
     *   ‐Remittance Bank Address3
     *   ‐Remittance Bank Account No
     * </pre>
     * 
     * <pre>
     * 下記項目を{@link W6001DocService#validateConsistencyRemittance(String, String)}で必須チェックします。
     *   ‐Remittance Bank Name
     *   ‐Remittance Bank Address1
     *   ‐Remittance Bank Address2
     *   ‐Remittance Bank Address3
     *   ‐Remittance Bank Account No
     * 
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />エラーリスト
     * 
     * @throws ApplicationException If a required check can not be<br />
     * 必須チェックができなかった場合
     */
    protected List<? extends MessageDomain> validateConsistencyRequireForRemittance(W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();
        
        // In the case of a FRT article, it does not check.
        // FRT品の場合チェックしない
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            return errList;
        }
        
        // Remittance Bank Name
        if(!w6001DocService.validateConsistencyRemittance(criteriaDomain.getRemBankNm(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.remBankNm")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.remBankNm", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // Remittance Bank Address1
        if(!w6001DocService.validateConsistencyRemittance(criteriaDomain.getRemBankAddress1(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.remBankAddr1")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.remBankAddr1", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // Remittance Bank Address2
        if(!w6001DocService.validateConsistencyRemittance(criteriaDomain.getRemBankAddress2(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.remBankAddr2")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.remBankAddr2", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // Remittance Bank Address3
        if(!w6001DocService.validateConsistencyRemittance(criteriaDomain.getRemBankAddress3(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.remBankAddr3")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.remBankAddr3", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // Remittance Bank Account No
        if(!w6001DocService.validateConsistencyRemittance(criteriaDomain.getRemBankAccountNo(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.remBankAccountNo")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.remBankAccountNo", GSCM_E0_0011, params);
            errList.add(md);
        }
        return errList;
    }
    
    /**
     * 
     * Check the necessary prerequisite to Rgister processing (L / C-related).
     * <br />Rgister処理に必要な必須条件のチェックを行います(L/C関連)。
     * <pre>
     * Check the {@link W6001DocService#validateConsistencyLc(String, String)} in the following items.
     *    ‐L/C Bank Name
     *    ‐L/C Bank Name2
     *    ‐L/C No
     *    ‐L/C Date
     * </pre>
     * <pre>
     * 下記項目を{@link W6001DocService#validateConsistencyLc(String, String)}で必須チェックします。
     *   ‐L/C Bank Name
     *   ‐L/C Bank Name2
     *   ‐L/C No
     *   ‐L/C Date
     * 
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />
     * エラーリスト
     * @throws ApplicationException If a required check can not be<br />
     * 必須チェックができなかった場合
     */
    protected List<? extends MessageDomain> validateConsistencyRequireForLc(W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();
    
        // In the case of a FRT article, it does not check.
        // FRT品の場合チェックしない
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            return errList;
        }
        
        // L/C Bank Name
        if(!w6001DocService.validateConsistencyLc(criteriaDomain.getLcBankNm1(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.lcBank1")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.lcBank1", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // L/C Bank Name2
        if(!w6001DocService.validateConsistencyLc(criteriaDomain.getLcBankNm2(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.lcBank2")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.lcBank2", GSCM_E0_0011, params);
            errList.add(md);
        }

        // L/C No
        if(!w6001DocService.validateConsistencyLc(criteriaDomain.getLcNo(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.lcNo")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.lcNo", GSCM_E0_0011, params);
            errList.add(md);
        }
        
        // L/C Date
        if(!w6001DocService.validateConsistencyLc(criteriaDomain.getLcDt(), criteriaDomain.getRemLcTyp())) {
            String[] params = {commonService.getResource(locale, "label.lcDt")};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.lcDt", GSCM_E0_0011, params);
            errList.add(md);
        }
        return errList;
    }
    
    /**
     * 
     * Check the necessary prerequisite to Rgister processing (Notify Party-related).
     * <br />Rgister処理に必要な必須条件のチェックを行います(Notify Party関連)。
     * <pre>
     * Check the {@link W6001DocService#validateConsistencyNotifyPartyNameNotifyPartyAddress(String, String)} in the following items.
     *   ‐Notify Party1 NameとNotify Party1 Address
     *   ‐Notify Party2 NameとNotify Party2 Address
     *   ‐Notify Party3 NameとNotify Party3 Address
     *   ‐Notify Party4 NameとNotify Party4 Address
     * </pre>
     * <pre>
     * 下記項目を{@link W6001DocService#validateConsistencyNotifyPartyNameNotifyPartyAddress(String, String)}で必須チェックします。
     *   ‐Notify Party1 NameとNotify Party1 Address
     *   ‐Notify Party2 NameとNotify Party2 Address
     *   ‐Notify Party3 NameとNotify Party3 Address
     *   ‐Notify Party4 NameとNotify Party4 Address
     * 
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />
     * エラーリスト
     * @throws ApplicationException If a required check can not be<br />
     * 必須チェックができなかった場合
     */
    protected List<? extends MessageDomain> validateConsistencyRequireForNotifyParty(W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();
        
        // Related check of Notify Party1 Name and Notify Party1 Address
        // Notify Party1 NameとNotify Party1 Addressの関連チェック
        boolean selectFlg;
        String errMsgId;
        if(StringUtils.isNotEmpty(criteriaDomain.getNotifyParty1CompCd())
            && StringUtils.isNotEmpty(criteriaDomain.getNotifyParty1CompNmAbb())) {
            selectFlg = true;
            errMsgId = NXS_E7_0060;
        } else {
            selectFlg = false;
            errMsgId = NXS_E7_0119;
        }
        if (!w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(criteriaDomain.getNotifyParty1Nm()
            , criteriaDomain.getNotifyParty1Addr(), selectFlg)) {
            String[] params = {
                commonService.getResource(locale, "label.notifyParty1Nm")
                , commonService.getResource(locale, "label.notifyParty1Addr")
            };
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.notifyParty1Nm", errMsgId, params);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.notifyParty1Addr", null, null);
            errList.add(md1);
            errList.add(md2);
        }
        
        // Select check of Notify Party1
        // Notify Party1のSelectチェック
        if(!selectFlg) {
            if (!w6001DocService.validateConsistencyNotifyPartySelect(criteriaDomain.getNotifyParty1CompCd(), criteriaDomain.getNotifyParty1CompNmAbb()
                , criteriaDomain.getNotifyParty1Nm(), criteriaDomain.getNotifyParty1Addr())) {
                String[] params = {
                    commonService.getResource(locale, "label.notifyParty1")
                };
                MessageDomain md1 = new MessageDomain("", NXS_E7_0059, params);
                errList.add(md1);
            }
        }
        
        // Related check of Notify Party2 Name and Notify Party2 Address
        // Notify Party2 NameとNotify Party2 Addressの関連チェック
        if(StringUtils.isNotEmpty(criteriaDomain.getNotifyParty2CompCd())
            && StringUtils.isNotEmpty(criteriaDomain.getNotifyParty2CompNmAbb())) {
            selectFlg = true;
            errMsgId = NXS_E7_0060;
        } else {
            selectFlg = false;
            errMsgId = NXS_E7_0119;
        }
        if (!w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(criteriaDomain.getNotifyParty2Nm(), criteriaDomain.getNotifyParty2Addr(), selectFlg)) {
            String[] params = {
                commonService.getResource(locale, "label.notifyParty2Nm")
                , commonService.getResource(locale, "label.notifyParty2Addr")
            };
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.notifyParty2Nm", errMsgId, params);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.notifyParty2Addr", null, null);
            errList.add(md1);
            errList.add(md2);
        }
        
        // Select check of Notify Party2
        // Notify Party2のSelectチェック
        if(!selectFlg) {
            if (!w6001DocService.validateConsistencyNotifyPartySelect(criteriaDomain.getNotifyParty2CompCd(), criteriaDomain.getNotifyParty2CompNmAbb()
                , criteriaDomain.getNotifyParty2Nm(), criteriaDomain.getNotifyParty2Addr())) {
                String[] params = {
                    commonService.getResource(locale, "label.notifyParty2")
                };
                MessageDomain md1 = new MessageDomain("", NXS_E7_0059, params);
                errList.add(md1);
            }
        }
        
        // Related check of Notify Party3 Name and Notify Party3 Address
        // Notify Party3 NameとNotify Party3 Addressの関連チェック
        if(StringUtils.isNotEmpty(criteriaDomain.getNotifyParty3CompCd())
            && StringUtils.isNotEmpty(criteriaDomain.getNotifyParty3CompNmAbb())) {
            selectFlg = true;
            errMsgId = NXS_E7_0060;
        } else {
            selectFlg = false;
            errMsgId = NXS_E7_0119;
        }
        if (!w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(criteriaDomain.getNotifyParty3Nm(), criteriaDomain.getNotifyParty3Addr(), selectFlg)) {
            String[] params = {
                commonService.getResource(locale, "label.notifyParty3Nm")
                , commonService.getResource(locale, "label.notifyParty3Addr")
            };
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.notifyParty3Nm", errMsgId, params);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.notifyParty3Addr", null, null);
            errList.add(md1);
            errList.add(md2);
        }
        
        // Select check of Notify Party3
        // Notify Party3のSelectチェック
        if(!selectFlg) {
            if (!w6001DocService.validateConsistencyNotifyPartySelect(criteriaDomain.getNotifyParty3CompCd(), criteriaDomain.getNotifyParty3CompNmAbb()
                , criteriaDomain.getNotifyParty3Nm(), criteriaDomain.getNotifyParty3Addr())) {
                String[] params = {
                    commonService.getResource(locale, "label.notifyParty3")
                };
                MessageDomain md1 = new MessageDomain("", NXS_E7_0059, params);
                errList.add(md1);
            }
        }
        
        // Related check of Notify Party4 Name and Notify Party4 Address
        // Notify Party4 NameとNotify Party4 Addressの関連チェック
        if(StringUtils.isNotEmpty(criteriaDomain.getNotifyParty4CompCd())
            && StringUtils.isNotEmpty(criteriaDomain.getNotifyParty4CompNmAbb())) {
            selectFlg = true;
            errMsgId = NXS_E7_0060;
        } else {
            selectFlg = false;
            errMsgId = NXS_E7_0119;
        }
        if (!w6001DocService.validateConsistencyNotifyPartyNameNotifyPartyAddress(criteriaDomain.getNotifyParty4Nm(), criteriaDomain.getNotifyParty4Addr(), selectFlg)) {
            String[] params = {
                commonService.getResource(locale, "label.notifyParty4Nm")
                , commonService.getResource(locale, "label.notifyParty4Addr")
            };
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.notifyParty4Nm", errMsgId, params);
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.notifyParty4Addr", null, null);
            errList.add(md1);
            errList.add(md2);
        }
        
        // Select check of Notify Party4
        // Notify Party4のSelectチェック
        if(!selectFlg) {
            if (!w6001DocService.validateConsistencyNotifyPartySelect(criteriaDomain.getNotifyParty4CompCd(), criteriaDomain.getNotifyParty4CompNmAbb()
                    , criteriaDomain.getNotifyParty4Nm(), criteriaDomain.getNotifyParty4Addr())) {
                String[] params = {
                    commonService.getResource(locale, "label.notifyParty4")
                };
                MessageDomain md1 = new MessageDomain("", NXS_E7_0059, params);
                errList.add(md1);
            }
        }
        
        return errList;
    }
    
    /**
     * 
     * Check the amount exceeded.
     * <br />金額超過チェックをします。
     * 
     * <pre>
     * - Maximum value 
     *     CML_TYP is 1:             99999999999.99
     *     CML_TYP If other than 1:9999999999999.99
     *     
     * - Check the following items do not exceed the number of digits.
     *      Call {@link W6001DocService#validateConsistencyAmountMaximum(BigDecimal, BigDecimal)} argument to the maximum value and the value to be checked. 
     *     ‐Net Amount
     *     ‐Freight
     *     ‐Insurance
     *     ‐Total Amount
     * </pre>
     * <pre>
     * ‐最大値
     *     CML_TYPが1の場合    :   99999999999.99
     *     CML_TYPが1以外の場合: 9999999999999.99
     * 
     * ‐下記の項目が桁数超過していないかチェック。
     *     チェック対象値と最大値を引数に{@link W6001DocService#validateConsistencyAmountMaximum(BigDecimal, BigDecimal)}を呼び出します。
     *       ‐Net Amount
     *       ‐Freight
     *       ‐Insurance
     *       ‐Total Amount
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Error list<br />
     * エラーリスト
     * @throws ApplicationException If are unable to check excess amount<br />
     * 金額超過チェックができない場合
     */
    protected List<? extends MessageDomain> validateConsistencyRequireForMaxAmountDegit(W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();
        
        BigDecimal maxAmount;
        // CML_TYP = 1
        if (CML_TYPE_CIGMA.equals(criteriaDomain.getCmlTyp())) {
            maxAmount = new BigDecimal(MAX_AMOUNT_DIGIT_CIGMA);
        } else {
            maxAmount = new BigDecimal(MAX_AMOUNT_DIGIT_REPORT);
        }
        
        // Net Amount
        if (!w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(criteriaDomain.getNetAmount()), maxAmount)) {
            String[] params = {commonService.getResource(locale, "label.netAmount"), maxAmount.toPlainString()};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.netAmount", NXS_E7_0115, params);
            errList.add(md);
        }
        
        // Freight
        if (!w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(criteriaDomain.getFreight()), maxAmount)) {
            String[] params = {commonService.getResource(locale, "label.freight"), maxAmount.toPlainString()};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.freight", NXS_E7_0115, params);
            errList.add(md);
        }
        
        // Insurance
        if (!w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(criteriaDomain.getInsurance()), maxAmount)) {
            String[] params = {commonService.getResource(locale, "label.insurance"), maxAmount.toPlainString()};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.insurance", NXS_E7_0115, params);
            errList.add(md);
        }
        
        // Total Amount
        if (!w6001DocService.validateConsistencyAmountMaximum(new BigDecimal(criteriaDomain.getTotalInvoiceAmount()), maxAmount)) {
            String[] params = {commonService.getResource(locale, "label.totalInvoiceAmount"), maxAmount.toPlainString()};
            MessageDomain md = new MessageDomain("w6009CriteriaDomain.totalInvoiceAmount", NXS_E7_0115, params);
            errList.add(md);
        }
        return errList;
    }
    
    // --- validateDatabase ------------------------------------------------------------------------
    /**
     * 
     * Check the amount error.
     * <br />金額エラーチェックをします。
     * <pre>
     * - mount error checking 
     *     Set the value from the argument to {@link W6001DocCriteriaDomain},
     *     Call the {@link W6001DocService#validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain, String[])}
     *      (Returns the name of a property of the relevant section on error) and pass the String array of size 1 to properties.
     * </pre>
     * <pre>
     * ‐金額エラーチェック
     *     {@link W6001DocCriteriaDomain}に引数から値を設定し、
     *     {@link W6001DocService#validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain, String[])}を呼出します。
     *       propertiesにはサイズ1のString型配列を渡します（エラー時に該当箇所のプロパティ名を返します）。
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If the amount error checking is not possible.<br />
     * 金額エラーチェックができない場合。
     */
    protected void validateDatabaseInvAmountChk (W6009CriteriaDomain criteriaDomain) throws ApplicationException {

        // Case of gratuitous goods, it does not check. 
        // 無償品の場合はチェックしない
        if (INVOICE_CTGRY_N.equals(criteriaDomain.getInvoiceCtgry())) {
            return;
        }
        
        String[] properties = new String[1];
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        String msgId = w6001DocService.validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(docCriteria, properties);
        if (null != msgId) {
            String[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label." + properties[0])
            };
            throw new ValidationException(Arrays.asList(new MessageDomain("w6009CriteriaDomain." + properties[0], msgId, params)));
        }
    }

    // --- callService用 ---------------------------------------------------------------------------
    /**
     * 
     * Convert to the BL layer from the screen for domain domain.
     * <br />画面用ドメインからBL層用ドメインに変換します。
     * 
     * @param criteriaDomain Screen for the search criteria domain<br />
     * 画面用検索条件ドメイン
     * @return BL layer search criteria domain<br />
     * BL層用検索条件ドメイン
     */
    protected W6001DocCriteriaDomain prepareCriteriaDomain (W6009CriteriaDomain criteriaDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, dateFormat);
        
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        // Free N Disp Flg
        docCriteria.setFree1DispFlg(convertDispFlag(criteriaDomain.getFree1DispFlg()));
        docCriteria.setFree2DispFlg(convertDispFlag(criteriaDomain.getFree2DispFlg()));
        docCriteria.setFree3DispFlg(convertDispFlag(criteriaDomain.getFree3DispFlg()));
        docCriteria.setFree4DispFlg(convertDispFlag(criteriaDomain.getFree4DispFlg()));
        
        return docCriteria;
    }
    
    /**
     *  Convert to the BL layer from the check state.
     * <br />チェック状態をBL層向けに変換します。
     * 
     * @param chkStatus 
     * チェック状態
     * @return Checked "Y", others "N"
     * チェックされている場合"Y"、それ以外の場合"N"を返します。
     */
    protected String convertDispFlag (String chkStatus) {
        if (CHECK_ON.equals(chkStatus)) {
            return FLAG_Y;
        } else {
            return FLAG_N;
        }
    }
   
    /**
     * 
     * (Transition from the Main screen) can transform it into a screen display data the data obtained
     * <br />取得したデータを画面表示データに変換します（Main画面から遷移時）
     * 
     * @param invoiceDomain Invoice domain of search results obtained<br />
     * 取得した検索結果のインボイスドメイン
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Screen display search criteria domain<br />
     * 画面表示用検索条件ドメイン
     */
    protected W6009CriteriaDomain convertW6009CriteriaDomain (W6001DocInvoiceDomain invoiceDomain, W6009CriteriaDomain criteriaDomain) {
        W6009CriteriaDomain resultDomain = new W6009CriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, criteriaDomain);
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, invoiceDomain, dateFormat);
        
        resultDomain.setDocumentType(invoiceDomain.getC2());
        resultDomain.setClassOfInv(invoiceDomain.getC3());
        
        // Format number
        String formatPrice = getPriceFormat(Integer.valueOf(resultDomain.getDigit()));
        resultDomain.setNetAmount(NumberUtil.format(invoiceDomain.getNetAmount(), formatPrice));
        resultDomain.setFreight(NumberUtil.format(invoiceDomain.getFreight(), formatPrice));
        resultDomain.setInsurance(NumberUtil.format(invoiceDomain.getInsurance(), formatPrice));
        resultDomain.setSubTotal(NumberUtil.format(invoiceDomain.getSubTotal(), formatPrice));
        resultDomain.setHandlingCharge(NumberUtil.format(invoiceDomain.getHandlingCharge(), formatPrice));
        resultDomain.setAdditionalCharge(NumberUtil.format(invoiceDomain.getAdditionalCharge(), formatPrice));
        resultDomain.setVat(NumberUtil.format(invoiceDomain.getVat(), formatPrice));
        resultDomain.setVatRatio(NumberUtil.format(invoiceDomain.getVatRatio(), FORMAT_RATIO));
        resultDomain.setTotalInvoiceAmount(NumberUtil.format(invoiceDomain.getTotalInvoiceAmount(), formatPrice));
        resultDomain.setNoCharge(NumberUtil.format(invoiceDomain.getNoCharge(), formatPrice));
        
        resultDomain.setTotalVolume(NumberUtil.format(invoiceDomain.getTotalVolume(), FORMAT_VOLUME));
        resultDomain.setTotalNetWeight(NumberUtil.format(invoiceDomain.getTotalNetWeight(), FORMAT_WEIGHT));
        resultDomain.setTotalGrossWeight(NumberUtil.format(invoiceDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
        
        // Reference Inv. No.1
        if (INVOICE_CLASS_MAIN.equals(invoiceDomain.getInvoiceClass()) 
            || INVOICE_CLASS_E_RT.equals(invoiceDomain.getInvoiceClass())) {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
                // Display of the invoice before cancellation 
                // キャンセル前のインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display of the re invoice
                // リインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getRelateInvoiceNo());
            }
        } else {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
                // Display of the invoice before cancellation 
                // キャンセル前のインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display of the main invoice
                // メインのインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getParInvoiceNo());
            }
        }
        
        // Reference Inv. No.2
        if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
            // Display of the invoice before cancellation 
            // キャンセル前のインボイスを表示
            resultDomain.setRelateInvoiceNo2(invoiceDomain.getRelateInvoiceNo());
        } else {
            // Display of the main invoice
            // メインのインボイスを表示
            resultDomain.setRelateInvoiceNo2(StringUtils.EMPTY);
        }
        
        // Set check box
        // チェックボックスの設定
        if (FLAG_Y.equals(invoiceDomain.getFree1DispFlg())) {
            resultDomain.setFree1DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree1DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree2DispFlg())) {
            resultDomain.setFree2DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree2DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree3DispFlg())) {
            resultDomain.setFree3DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree3DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree4DispFlg())) {
            resultDomain.setFree4DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree4DispFlg(CHECK_OFF);
        }
        
        return resultDomain;
    }
    
    /**
     * Line separator convert to '\n'.
     * <br />改行コードを「\n」に統一します。
     *
     * @param str original string.<br />変換元文字列
     * @return convert string.<br />変換後文字列
     */
    protected String convertLineSeparator(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\r\\n|\\r|\\n", LINE_SEPARATOR);
    }
    
    /**
     * 
     * Get Price format
     * 
     * @param scale scale
     * @return price format
     */
    protected String getPriceFormat (int scale) {
        StringBuffer format = new StringBuffer();
        if (scale == 0) {
            format.append("0");
        } else {
            format.append("0.");
            for (int i = 0; i < scale; i++) {
                format.append("0");
            }
        }
        return format.toString();
    }
}
