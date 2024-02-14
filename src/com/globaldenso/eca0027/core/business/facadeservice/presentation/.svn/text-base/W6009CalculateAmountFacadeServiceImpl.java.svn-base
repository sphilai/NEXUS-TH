/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DECIMAL_PART;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade CalculateAmount action of Documentation Invoice Register screen.
 * </br />通関書類作成業務 Invoice Register画面のCalculateAmountアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009CalculateAmountFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class W6009CalculateAmountFacadeServiceImpl extends AbstractProcessFacadeService<W6009CriteriaDomain, W6009CriteriaDomain>{
    
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
    public W6009CalculateAmountFacadeServiceImpl(){
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
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Common error check
     * ‐共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Validator<W6009CriteriaDomain> valid = new Validator<W6009CriteriaDomain>(criteriaDomain, "w6009CriteriaDomain");

        List<String> propertyList = new ArrayList<String>();
    
        propertyList.add("freightResponsibleCd");
        propertyList.add("freight");
        propertyList.add("insurance");
        propertyList.add("handlingCharge");
        propertyList.add("additionalCharge");
        propertyList.add("vatRatio");
        
        String[] properties = propertyList.toArray(new String[0]);
        
        valid.isValidateProperties(properties, SCREEN_ID_W6009);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Check correlation
     * ‐相関チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        Locale locale = criteriaDomain.getLocale();

        int digit = Integer.parseInt(criteriaDomain.getDigit());
        
        BigDecimal freeAdd = new BigDecimal(criteriaDomain.getAdditionalCharge());
        String freeAddNm = criteriaDomain.getAdditionalChargeNm();
        
        // Related check of Free Additional and Free Additional Name 
        // Free AdditionalとFree Additional Nameの関連チェック
        if (!w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameOver(freeAdd, freeAddNm)) {
            String[] params = {
                // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//                commonService.getResource(locale, "label.vat")
//                , commonService.getResource(locale, "label.vatRatio")
                commonService.getResource(locale, "label.additionalCharge")
                , commonService.getResource(locale, "label.additionalChargeNm")
                // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            };
            // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", NXS_E7_0116, params);
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", GSCM_E0_0029, params);
            // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeNm", null, null);
            errList.add(md1);
            errList.add(md2);
        }
        
        // Related check of Free Additional and Free Additional Name 
        // Free AdditionalとFree Additional Nameの関連チェック
        if (!w6001DocService.validateConsistencyFreeAdditionalFreeAdditionalNameZero(freeAdd, freeAddNm)) {
            String[] params = {
                // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//                commonService.getResource(locale, "label.vat")
//                , commonService.getResource(locale, "label.vatRatio")
                commonService.getResource(locale, "label.additionalCharge")
                , commonService.getResource(locale, "label.additionalChargeNm")
                // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            };
            // 2015/3/11 DNJP.Kawamura UT116対応 START >>>>>
//            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", NXS_E7_0117, params);
            MessageDomain md1 = new MessageDomain("w6009CriteriaDomain.additionalCharge", GSCM_E0_0029, params);
            // 2015/3/11 DNJP.Kawamura UT116対応 END <<<<<
            MessageDomain md2 = new MessageDomain("w6009CriteriaDomain.additionalChargeNm", null, null);
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
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
  
    /**
     * {@inheritDoc}
     * DB integrity check
     * <br />DB整合性チェック
     * <pre>
     * ‐Amount error checking 
     *     Set the value from the argument to {@link W6001DocCriteriaDomain}, 
     *      Call the {@link W6001DocService#validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain, String[])}.
     *      (Returns the name of the property of the relevant section on error) and pass the String array of size 1 to properties.
     * </pre>
     * <pre>
     * ‐金額エラーチェック
     *     {@link W6001DocCriteriaDomain}に引数から値を設定し、
     *     {@link W6001DocService#validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain, String[])}を呼出します。
     *       propertiesにはサイズ1のString型配列を渡します（エラー時に該当箇所のプロパティ名を返します）。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
     
        // In the case of gratuitous goods, it does not check. 
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

    /**
     * {@inheritDoc}
     * <pre>
     * - In computing the amount of money 
     *     Set the screen display item in {@link W6001DocCriteriaDomain}
     *     Call {@link W6001DocService#calculateAmount(W6001DocCriteriaDomain)}
     * - The computed information is set as a screen.
     * </pre>
     * <pre>
     * ‐有効金額を算出
     *     {@link W6001DocCriteriaDomain}に画面表示項目を設定し、
     *     {@link W6001DocService#calculateAmount(W6001DocCriteriaDomain)}を呼出します。
     * 
     * ‐算出した情報を画面に設定します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
 
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        W6001DocInvoiceDomain invoiceDomain = w6001DocService.calculateAmount(docCriteria);

        String formatPrice = getPriceFormat(invoiceDomain.getVat().scale());
        criteriaDomain.setVat(NumberUtil.format(invoiceDomain.getVat(), formatPrice));
        criteriaDomain.setSubTotal(NumberUtil.format(invoiceDomain.getSubTotal(), formatPrice));
        criteriaDomain.setTotalInvoiceAmount(NumberUtil.format(invoiceDomain.getTotalInvoiceAmount(), formatPrice));
        
        return criteriaDomain;
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
