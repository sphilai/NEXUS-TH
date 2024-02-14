/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0033;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0052;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0053;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0054;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0055;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0061;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0067;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0074;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0077;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0109;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0122;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0128;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W6001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_2;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_4;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6002UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Register action of a Manual Invoice Upload screen.
 * <br />Manual Invoice Upload画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6002RegisterFacadeService
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15107 $
 */
public class W6002RegisterFacadeServiceImpl extends AbstractTransactFacadeService<W6002UpdateDomain, W6002UpdateDomain>{

    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * TmExpShipToShippingService Service
     * <br />TmExpShipToShippingServiceサービス
     * NL004 ADD
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;
   
    /**
     * Default constructor.
     */
    public W6002RegisterFacadeServiceImpl(){
        super();
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
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }
    
    /**
     * Setter method of tmExpShipToShippingService.
     *
     * @param tmExpShipToShippingService Value to be stored in tmExpShipToShippingService.
     */
    public void setTmExpShipToShippingService(
        TmExpShipToShippingService tmExpShipToShippingService) {
        this.tmExpShipToShippingService = tmExpShipToShippingService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6002UpdateDomain filterDomain(W6002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Check item property.
     * 単項目チェックを行う。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected void validateItems(W6002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W6002CriteriaDomain criteriaDomain = updateDomain.getW6002CriteriaDomain();
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        Validator<W6002CriteriaDomain> valid 
            = new Validator<W6002CriteriaDomain>(criteriaDomain, "w6002CriteriaDomain");
        
        // ST945 MOD START
        // Check item dynamically but check order is not changed.
        // 項目を動的に設定する。チェック順は変えない。
        List<String> propertyList = new ArrayList<String>();
        // Case of cancellation, no need for required check.
        // キャンセルの場合必須チェックの必要はない。
        if (!W6002_FUNCTION_NO_4.equals(updateDomain.getFunctionNo())) {
            propertyList.add("typeOfInv");
        }
        propertyList.add("classOfInv");
        propertyList.add("invoiceCtgry");
        propertyList.add("shipperCd");
        propertyList.add("invoiceNo");
        propertyList.add("consigneeCd");
        propertyList.add("shipToCd");
        propertyList.add("trnsCd");
        propertyList.add("relateInvoiceShipperCd");
        propertyList.add("relateInvoiceNo");
        propertyList.add("dlivPoint");
        propertyList.add("termsPoint");
        propertyList.add("payTerms");
        propertyList.add("remBankNm");
        propertyList.add("remBankAddress1");
        propertyList.add("remBankAddress2");
        propertyList.add("remBankAddress3");
        propertyList.add("remBankAccountNo");
        propertyList.add("lcBank1");
        propertyList.add("lcBank2");
        propertyList.add("lcNo");
        propertyList.add("lcDt");
        propertyList.add("netAmount");
        propertyList.add("freight");
        propertyList.add("insurance");
        propertyList.add("handlingCharge");
        propertyList.add("additionalCharge");
        propertyList.add("additionalChargeNm");
        propertyList.add("vat");
        propertyList.add("vatRatio");
        propertyList.add("pltzItemQty");
        propertyList.add("totalVolume");
        propertyList.add("totalNetWeight");
        propertyList.add("totalGrossWeight");
        propertyList.add("carrierCompCd");
        propertyList.add("forwarderCompCd");
        propertyList.add("fmCntryCd");
        propertyList.add("loadingPortCd");
        propertyList.add("toCntryCd");
        propertyList.add("dischargePortCd");
        propertyList.add("vessel");
        propertyList.add("etd");
        propertyList.add("eta");
        propertyList.add("arrivalTime");
        propertyList.add("bookingNo");
        
        valid.isValidateProperties((String[])propertyList.toArray(new String[0]), SCREEN_ID_W6002);
        // ST945 MOD END
        errorList.addAll(valid.getErrList());
        
        // Required check.
        // 各項目の必須入力チェック(必須項目は入力値によって可変）
        errorList.addAll(validateRequiredItems(updateDomain));
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Checking of the consistency.
     * 整合性チェックを行う。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        W6002CriteriaDomain criteriaDomain = updateDomain.getW6002CriteriaDomain();
        String dateFormat = criteriaDomain.getScreenDateFormat();
        String functionNo = updateDomain.getFunctionNo();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Authority check.
        // 権限チェック実施
        if(!w6001DocService.validateConsistencyShipperPlantAuth(PERMIT_FUNC_ID_W6001R, criteriaDomain.getShipperCd(), null)) {
            MessageDomain md = new MessageDomain("w6002CriteriaDomain.shipperCd", GSCM_I0_0009, null);
            errorList.add(md);
        }
        
        // Correlation check in date.
        // 日付の相関チェック
        if(!w6001DocService.validateCorrelationDate(criteriaDomain.getEtd(), criteriaDomain.getEta(), dateFormat)) {
            Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.etd")
                , commonService.getResource(criteriaDomain.getLocale(), "label.eta")};
            errorList.add(new MessageDomain("w6002CriteriaDomain.etd", NXS_E1_0033, params));
            errorList.add(new MessageDomain("w6002CriteriaDomain.eta", null, null));
        }
        
        // Different data check.
        // 同一データ不可チェック
        if (W6002_FUNCTION_NO_4.equals(functionNo)) {
            if(!w6001DocService.validateConsistencyCancelInvoiceNo(criteriaDomain.getInvoiceNo()
                , criteriaDomain.getOrgInvoiceNo())) {
                errorList.add(new MessageDomain("w6002CriteriaDomain.invoiceNo", NXS_E7_0054, null));
            }
        }
        if (W6002_FUNCTION_NO_1.equals(functionNo)) {
            String reInvoiceNo = criteriaDomain.getRelateInvoiceNo();
            String reInvoiceShipperCd = criteriaDomain.getRelateInvoiceShipperCd();
            String invoiceNo = criteriaDomain.getInvoiceNo();
            String shipperCd = criteriaDomain.getShipperCd();
            if(!w6001DocService.validateConsistencyReferenceInvNoReferenceInvShipper(reInvoiceNo
                , reInvoiceShipperCd, invoiceNo, shipperCd)) {
                
                errorList.add(new MessageDomain("w6002CriteriaDomain.relateInvoiceNo", NXS_E7_0055, null));
                errorList.add(new MessageDomain("w6002CriteriaDomain.relateInvoiceShipperCd", null, null));
            }
        }
        
        // Check FRT class (when register Main-Invoice or E-RT Invoice)
        if (W6002_FUNCTION_NO_1.equals(functionNo)) {
            if(!w6001DocService.validateConsistencyFunctionNoClassOfInv(criteriaDomain.getClassOfInv())) {
                errorList.add(new MessageDomain("w6002CriteriaDomain.classOfInv", NXS_E7_0061, null));
            }
        }
        
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getInvoicePdfFileName())) {
            // Check file exist.
            if(!w6001DocService.validateConsistencyFileExists(criteriaDomain.getInvoicePdfFileSize())) {
                errorList.add(new MessageDomain("invoicePdfFile", GSCM_E0_0036, null));
            }
            // Check file size.
            if(!w6001DocService.validateConsistencyFileSize(criteriaDomain.getInvoicePdfFileSize())) {
                errorList.add(new MessageDomain("invoicePdfFile", NXS_E7_0057, null));
            }
            // Check file name.
            if(!w6001DocService.validateConsistencyFileName(criteriaDomain.getInvoicePdfFileName())) {
                errorList.add(new MessageDomain("invoicePdfFile", NXS_E7_0067, null));
            }
        }
        
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getPackingListPdfFileName())) {
            // Check file exist.
            if(!w6001DocService.validateConsistencyFileExists(criteriaDomain.getPackingListPdfFileSize())) {
                errorList.add(new MessageDomain("packingListPdfFile", GSCM_E0_0036, null));
            }
            // Check file size.
            if(!w6001DocService.validateConsistencyFileSize(criteriaDomain.getPackingListPdfFileSize())) {
                errorList.add(new MessageDomain("packingListPdfFile", NXS_E7_0057, null));
            }
            // Check file name.
            if(!w6001DocService.validateConsistencyFileName(criteriaDomain.getPackingListPdfFileName())) {
                errorList.add(new MessageDomain("packingListPdfFile", NXS_E7_0067, null));
            }
        }
        
        // UT186 ZIP DOWNLOAD ADD START
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getInvoicePdfFileName())
            && !CheckUtil.isBlankOrNull(criteriaDomain.getPackingListPdfFileName())) {
            // Check unique name in screen for zip entry.
            // zip内でファイル名が重複しないように、まず画面内で同じファイル名を指定していないかをチェックする。
            if (criteriaDomain.getInvoicePdfFileName().equals(criteriaDomain.getPackingListPdfFileName())) {
                errorList.add(new MessageDomain("invoicePdfFile", NXS_E7_0052, null));
                errorList.add(new MessageDomain("packingListPdfFile", null, null));
            }
        }
        // UT186 ZIP DOWNLOAD ADD END
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * Checking of the database.
     * <br />データベースチェックを行う。
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected void validateDatabase(W6002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        W6002CriteriaDomain criteria = updateDomain.getW6002CriteriaDomain();
        String functionNo = updateDomain.getFunctionNo();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Existence check Carrier
        // Carrier存在チェック
        if(!w6001DocService.validateDatabaseCarrier(criteria.getCarrierCompCd())){
            errorList.add(new MessageDomain("w6002CriteriaDomain.carrierCompCd", NXS_E7_0113, null));
        }
        
        // Existence check Forwarder
        // Forwarder存在チェック
        // UT263 Forwarderの入力があれば実施するように変更
        if (!CheckUtil.isBlankOrNull(criteria.getForwarderCompCd())) {
            if(!w6001DocService.validateDatabaseCompCd(criteria.getForwarderCompCd())){
                errorList.add(new MessageDomain("w6002CriteriaDomain.forwarderCompCd", NXS_E7_0071, null));
            }
        }
        
        // Existence check Port of Load/FLT
        // Port of Load/FLT存在チェック
        if(!w6001DocService.validateDatabasePort(criteria.getLoadingPortCd(), criteria.getFmCntryCd())){
            errorList.add(new MessageDomain("w6002CriteriaDomain.loadingPortCd", NXS_E7_0122, null));
            errorList.add(new MessageDomain("w6002CriteriaDomain.fmCntryCd", null, null));
        }
    
        // Existence check Port of Discharge/FLT
        // Port of Discharge/FLT存在チェック
        if(!w6001DocService.validateDatabasePort(criteria.getDischargePortCd(), criteria.getToCntryCd())){
            errorList.add(new MessageDomain("w6002CriteriaDomain.dischargePortCd", NXS_E7_0122, null));
            errorList.add(new MessageDomain("w6002CriteriaDomain.toCntryCd", null, null));
        }

        // NL004 ADD START
        // Existence check Consignee
        // Consignee存在チェック
        if (!commonService.validateConsignee(criteria.getConsigneeCd())) {
            errorList.add(new MessageDomain("w6002CriteriaDomain.consigneeCd", NXS_E7_0109, null));
        }

        // Existence check NEXUS Ship to
        // NEXUS Ship to存在チェック
        if (!commonService.validateShipTo(criteria.getShipToCd())) {
            errorList.add(new MessageDomain("w6002CriteriaDomain.shipToCd", NXS_E7_0074, null));
        }

        // Existence check TM_EXP_SHIP_TO_SHIPPING
        // 輸出送荷先出荷原単位存在チェック
        TmExpShipToShippingCriteriaDomain tmExpShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
        tmExpShipToShippingCriteriaDomain.setCompCd(criteria.getShipperCd());
        tmExpShipToShippingCriteriaDomain.setShipToCd(criteria.getShipToCd());
        Date localDate = DateUtils.truncate(
            DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getShipperCd())), Calendar.DAY_OF_MONTH
        );
        tmExpShipToShippingCriteriaDomain.setAplyStrtDtLessThanEqual(localDate);
        tmExpShipToShippingCriteriaDomain.setSearchCountCheckFlg(false);
        int tmExpShipToShippingResultCount = tmExpShipToShippingService.searchCount(tmExpShipToShippingCriteriaDomain);
        if (tmExpShipToShippingResultCount == 0) {
            errorList.add(new MessageDomain("w6002CriteriaDomain.shipperCd", NXS_E7_0128, null));
            errorList.add(new MessageDomain("w6002CriteriaDomain.shipToCd", null, null));
        }
        // NL004 ADD END

        // Check target invoice No is canceled. 
        // 対象のインボイスNoが既にキャンセルされていないかチェック
        if (!W6002_FUNCTION_NO_1.equals(functionNo)) {
            // ST946 MANUAL SCREEN TRANSITION MOD START
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //String shipperCd = updateDomain.getShipperCd();
            //String pInvoiceNo = updateDomain.getParInvoiceNo();
            //String invoiceNo = updateDomain.getInvoiceNo();
            //Date invoiceIssueDt = DateUtil.parseDate(updateDomain.getInvoiceIssueDt(), criteria.getScreenDateFormat());
            //if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(shipperCd, pInvoiceNo, invoiceNo, invoiceIssueDt, functionNo)) {
            //    errorList.add(new MessageDomain("", NXS_E7_0058, null));
            //}

            // In the case of FRT added, check the main invoice has not been canceled.
            // FRT追加の場合、メインインボイスががキャンセルされていないかを調査。
            if (W6002_FUNCTION_NO_2.equals(functionNo)) {
                if (
                    !w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(
                        criteria.getTakeOverParInvoiceShipperCd(), criteria.getTakeOverParInvoiceNo(), criteria.getTakeOverParInvoiceIssueDt(), functionNo)
                )
                {
                    errorList.add(new MessageDomain("", NXS_E7_0058, null));
                }

            // In the case of supplier invoice update, invoice cancellation, re-invoice update,
            // Check the target invoice has not been canceled.
            // 仕入れ先インボイス更新、インボイスキャンセル、リインボイス更新の場合、
            // 対象のインボイスがキャンセルされていないかを調査。
            } else if (W6002_FUNCTION_NO_3.equals(functionNo) || W6002_FUNCTION_NO_4.equals(functionNo) || W6002_FUNCTION_NO_5.equals(functionNo)) {
                if (
                    !w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByCancel(
                        criteria.getTakeOverShipperCd(), criteria.getTakeOverInvoiceNo(), criteria.getTakeOverInvoiceIssueDt(), functionNo)
                )
                {
                    errorList.add(new MessageDomain("", NXS_E7_0058, null));
                }
            }
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            // ST946 MANUAL SCREEN TRANSITION MOD END
        }

        // ST946 MANUAL SCREEN TRANSITION DEL START
        //// Duplicate registration check
        //// 重複登録チェック
        //if (W6002_FUNCTION_NO_2.equals(functionNo) 
        //    || (W6002_FUNCTION_NO_3.equals(functionNo)
        //        && !updateDomain.getInvoiceNo().equals(criteria.getInvoiceNo()))
        //    || W6002_FUNCTION_NO_4.equals(functionNo)) {
        //    String shipperCd = criteria.getShipperCd();
        //    String invoiceNo = criteria.getInvoiceNo();
        //    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //    //Date invoiceIssueDt = DateUtil.parseDate(updateDomain.getInvoiceIssueDt(), criteria.getScreenDateFormat());
        //    Date invoiceIssueDt = updateDomain.getInvoiceIssueDt();
        //    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        //    if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByDuplication(shipperCd, invoiceNo, invoiceIssueDt)) { 
        //        errorList.add(new MessageDomain("w6002CriteriaDomain.invoiceNo", GSCM_E0_0020, null));
        //    }
        //}
        // ST946 MANUAL SCREEN TRANSITION DEL START
            // Since the issue time can not duplicate check and not decided, it moved to W6001DocServiceImpl.
            // 発行時刻が決まらないと重複チェックできないため、W6001DocServiceImplに移動。

        // Check for the existence of update.
        // 更新時の存在チェック
        // ST946 MANUAL SCREEN TRANSITION MOD START
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //if ((W6002_FUNCTION_NO_3.equals(functionNo)
        //        && updateDomain.getInvoiceNo().equals(criteria.getInvoiceNo()))
        //    || W6002_FUNCTION_NO_5.equals(functionNo)) {
        //    String shipperCd = criteria.getShipperCd();
        //    String invoiceNo = criteria.getInvoiceNo();
        //    Date invoiceIssueDt = DateUtil.parseDate(updateDomain.getInvoiceIssueDt(), criteria.getScreenDateFormat());
        //    if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByExistence(shipperCd, invoiceNo, invoiceIssueDt)) {
        //        errorList.add(new MessageDomain("", NXS_E1_0010, null));
        //    }
        //}
        //if (
        //    (W6002_FUNCTION_NO_3.equals(functionNo) && criteria.getTakeOverInvoiceNo().equals(criteria.getInvoiceNo()))
        //        || W6002_FUNCTION_NO_5.equals(functionNo)
        //)
        if (W6002_FUNCTION_NO_5.equals(functionNo)){
            String shipperCd = criteria.getTakeOverShipperCd();
            String invoiceNo = criteria.getTakeOverInvoiceNo();
            Date invoiceIssueDt = criteria.getTakeOverInvoiceIssueDt();
            if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByExistence(shipperCd, invoiceNo, invoiceIssueDt)) {
                errorList.add(new MessageDomain("", NXS_E1_0010, null));
            }
        }
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        // ST946 MANUAL SCREEN TRANSITION MOD END

        // ST943 DEL START
        //// Check for the existence of update.
        //// 更新時の存在チェック
        //if (W6002_FUNCTION_NO_4.equals(functionNo) && "2".equals(criteria.getTypeOfInv())) {
        //    if (!FLAG_Y.equals(updateDomain.getW6002CriteriaDomain().getContinueFlag())) {
        //        if (0 < errorList.size()) {
        //            throw new ValidationException(errorList);
        //        }
        //        criteria.setConfirmMsg(commonService.getResource(criteria.getLocale(), NXS_I1_0013));
        //        return;
        //    }
        //}
        // ST943 DEL END

        // Canceling status check
        // キャンセル時ステータスチェック
        // ST946 MANUAL SCREEN TRANSITION MOD START
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //if (W6002_FUNCTION_NO_4.equals(functionNo)) {
        //    String shipperCd = criteria.getShipperCd();
        //    String invoiceNo = updateDomain.getInvoiceNo();
        //    Date invoiceIssueDt = DateUtil.parseDate(updateDomain.getInvoiceIssueDt(), criteria.getScreenDateFormat());
        //    if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt)) {
        //        errorList.add(new MessageDomain("", NXS_E7_0077, null));
        //    }
        //}
        if (W6002_FUNCTION_NO_4.equals(functionNo)) {
            String shipperCd = criteria.getTakeOverShipperCd();
            String invoiceNo = criteria.getTakeOverInvoiceNo();
            Date invoiceIssueDt = criteria.getTakeOverInvoiceIssueDt();
            if(!w6001DocService.validateDatabaseTtInvoiceOnUploadRegisterByStatus(shipperCd, invoiceNo, invoiceIssueDt)) {
                errorList.add(new MessageDomain("", NXS_E7_0077, null));
            }
        }
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        // ST946 MANUAL SCREEN TRANSITION MOD END

        // UT186 ZIP DOWNLOAD ADD START
        // Check unique name under parent invoice for zip entry.
        // zip内でファイル名が重複しないように、親インボイスの配下に同名ファイルのアップロードがされていないかをチェック
        
        // Main invoice initial registration and cancellation of the main invoice is not checked.
        // メインインボイス初回登録および、メインインボイスのキャンセルはチェックしない。
        if (
            !W6002_FUNCTION_NO_1.equals(functionNo)
                && !(W6002_FUNCTION_NO_4.equals(functionNo) && INVOICE_CLASS_MAIN.equals(criteria.getClassOfInv()))
        )
        {
            // For an update, the file that has been uploaded to the target invoice is not checked because the non-overlapping.
            // 更新の場合は、対象インボイスにアップロードされているファイルは洗い替えのためチェック対象外とする措置。
            String updateInvoiceShipper = null;
            String updateInvoiceNo = null;
            Date updateInvoiceIssueDt = null;
            // if replacement
            // 差し替えの場合
            if (W6002_FUNCTION_NO_3.equals(functionNo) || W6002_FUNCTION_NO_5.equals(functionNo)) {
                updateInvoiceShipper = criteria.getTakeOverShipperCd();
                updateInvoiceNo = criteria.getTakeOverInvoiceNo();
                updateInvoiceIssueDt = criteria.getTakeOverInvoiceIssueDt();
            }
            
            // INVOICE
            if (!CheckUtil.isBlankOrNull(criteria.getInvoicePdfFileName())) {
                if (
                    !w6001DocService.validateDatabaseUniqueFileNameOnUploadRegister(
                        criteria.getTakeOverParInvoiceShipperCd(), criteria.getTakeOverParInvoiceNo(), criteria.getTakeOverParInvoiceIssueDt(),
                            updateInvoiceShipper, updateInvoiceNo, updateInvoiceIssueDt,
                                criteria.getInvoicePdfFileName())
                )
                {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.invoice2") };
                    errorList.add(new MessageDomain("invoicePdfFile", NXS_E7_0053, params));
                }
            }
            
            // PACKING LIST
            if (!CheckUtil.isBlankOrNull(criteria.getPackingListPdfFileName())) {
                if (
                    !w6001DocService.validateDatabaseUniqueFileNameOnUploadRegister(
                        criteria.getTakeOverParInvoiceShipperCd(), criteria.getTakeOverParInvoiceNo(), criteria.getTakeOverParInvoiceIssueDt(),
                            updateInvoiceShipper, updateInvoiceNo, updateInvoiceIssueDt,
                                criteria.getPackingListPdfFileName())
                )
                {
                    Object[] params = { commonService.getResource(criteria.getLocale(), "label.packingList") };
                    errorList.add(new MessageDomain("packingListPdfFile", NXS_E7_0053, params));
                }
            }
        }
        // UT186 ZIP DOWNLOAD ADD END
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * <br />
     * <pre>
     * - Create a search condition domain. 
     *      Create the {@link W6001DocCriteriaDomain}
     * - Register the data.
     * - Upload files
     * </pre>
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W6001DocCriteriaDomain}を作成する
     * - データ登録を行う
     * - ファイルのアップロード
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected W6002UpdateDomain callServices(W6002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // ST943 DEL START
        //if (!CheckUtil.isBlankOrNull(updateDomain.getW6002CriteriaDomain().getConfirmMsg())) {
        //    return updateDomain;
        //}
        // ST943 DEL END
        
        W6001DocCriteriaDomain criteriaDomain = createDocCriteria(updateDomain);
        
        // Process:register, update, upload file.
        // ファイルのアップロード、登録・更新処理
        W6001DocCriteriaDomain result = w6001DocService.transactOnUploadRegister(criteriaDomain);
        
        return convertToCriteriaDomain(updateDomain, result);
    }
    
    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param  updateDomain Update domain of customs document preparation business Manual Invoice Upload screen (PL)<br />
     * 通関書類作成業務 Manual Invoice Upload画面の更新ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6002UpdateDomain updateDomain){
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        W6002CriteriaDomain criteria = updateDomain.getW6002CriteriaDomain();
        
        String dateFormat = updateDomain.getW6002CriteriaDomain().getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteria, dateFormat);
            // takeOver...,takeOverPar... is copied here./takeOver～,takeOverPar～はここでコピーされる。
        
        if (!CheckUtil.isBlankOrNull(criteria.getLcDt())) {
            Date lcDt = DateUtil.parseDate(criteria.getLcDt(), dateFormat);
            docCriteria.setLcDt(lcDt);
        }        
        if (!CheckUtil.isBlankOrNull(criteria.getEtd())) {
            Date etd = DateUtil.parseDate(criteria.getEtd(), dateFormat);
            docCriteria.setEtd(etd);
        }
        if (!CheckUtil.isBlankOrNull(criteria.getEta())) {
            Date eta = DateUtil.parseDate(criteria.getEta(), dateFormat);
            docCriteria.setEta(eta);
        }
        
        // ST946 MANUAL SCREEN TRANSITION DEL START
        //docCriteria.setTakeOverShipperCd(updateDomain.getShipperCd());
        //docCriteria.setTakeOverInvoiceNo(updateDomain.getInvoiceNo());
        //docCriteria.setTakeOverParInvoiceNo(updateDomain.getParInvoiceNo());
        //Date invoiceIssueDt = DateUtil.parseDate(updateDomain.getInvoiceIssueDt(), dateFormat);
        //docCriteria.setTakeOverInvoiceIssueDt(invoiceIssueDt);
        // ST946 MANUAL SCREEN TRANSITION DEL END
        
        String arrivalTime = docCriteria.getArrivalTime();
        
        docCriteria.setRemLcTyp(criteria.getRemittanceOrLc());
        docCriteria.setFreightResponsibleCd(criteria.getFreightRes());
        docCriteria.setPayMeth(criteria.getPaymentMethod());
        
        if (!CheckUtil.isBlankOrNull(arrivalTime)) {
            arrivalTime = convertArrivalTime(arrivalTime);
            docCriteria.setArrivalTime(arrivalTime);
        }
        docCriteria.setInvoiceFileNm(criteria.getInvoicePdfFileName());
        docCriteria.setInvoiceFileData(criteria.getInvoicePdfFileStream());
        docCriteria.setPackinglistFileNm(criteria.getPackingListPdfFileName());
        docCriteria.setPackinglistFileData(criteria.getPackingListPdfFilaStream());
        
        return docCriteria;
    }
    
    /**
     * Checking of the required.
     * <br />必須チェックを行う。
     * @param updateDomain check target W6002UpdateDomain
     * @return error lists
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected List<MessageDomain> validateRequiredItems(W6002UpdateDomain updateDomain) {

        W6002CriteriaDomain criteriaDomain = updateDomain.getW6002CriteriaDomain();
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Required check.
        String fnctionNo = updateDomain.getFunctionNo();
        
        // Freight Res.
        if (W6002_FUNCTION_NO_1.equals(fnctionNo) || W6002_FUNCTION_NO_5.equals(fnctionNo)) {
            if (CheckUtil.isBlankOrNull(criteriaDomain.getFreightRes())) {
                String[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.freightRes")};
                errorList.add(new MessageDomain("w6002CriteriaDomain.freightRes", GSCM_E0_0011, params));
            }
        }
        // Upload Invoice File
        if (!W6002_FUNCTION_NO_4.equals(fnctionNo)) {
            if (CheckUtil.isBlankOrNull(criteriaDomain.getInvoicePdfFileName())) {
                String[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.invoice2")};
                errorList.add(new MessageDomain("invoicePdfFile", GSCM_E0_0011, params));
            } 
        }
        return errorList;
    }
    
    /**
     * Remove the 「:」 from arrivalTime
     * <br />arrivalTimeから「:」を削除する
     * 
     * @param arrivalTime arrivalTime
     * @return ArrivalTime after processing<br />
     * 加工後のarrivalTime
     */
    protected String convertArrivalTime(String arrivalTime) {
        StringBuffer tmp = new StringBuffer(arrivalTime);
        
        int idx = tmp.indexOf(":");
        String ret = tmp.deleteCharAt(idx).toString();
        return ret;
    }
    /**
     * Convert to Manual Invoice Upload screen domain invoice information of customs paperwork main work screen.
     * <br />通関書類作成業務画面のインボイス情報メインをManual Invoice Upload画面ドメインに変換します。
     *
     * @param criteria Search condition<br />
     * 検索条件
     * @param docDomain Search result<br />
     * 検索結果
     * @return Conversion result<br />
     * 変換結果
     */
    protected W6002UpdateDomain convertToCriteriaDomain(W6002UpdateDomain criteria, W6001DocCriteriaDomain docDomain) {
        W6002UpdateDomain resultDomain = new W6002UpdateDomain();
        W6002CriteriaDomain criteriaDomain = new W6002CriteriaDomain();
        
        criteriaDomain.setUpdateCount(docDomain.getUpdateCount());
        criteriaDomain.setCreateCount(docDomain.getCreateCount());
        
        if (!CheckUtil.isBlankOrNull(docDomain.getFunctionNo())) {
            resultDomain.setFunctionNo(docDomain.getFunctionNo());
            //resultDomain.setParInvoiceNo(docDomain.getParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
            resultDomain.setShipperCd(docDomain.getShipperCd()); // ST946 MANUAL SCREEN TRANSITION ADD
            resultDomain.setInvoiceNo(docDomain.getInvoiceNo());
            resultDomain.setInvoiceIssueDt(docDomain.getInvoiceIssueDt()); // ST946 MANUAL SCREEN TRANSITION ADD
            resultDomain.setParInvoiceNo(docDomain.getParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION ADD
                // Used when the main invoice No. has been changed.
                // メインインボイスNo.が変更された場合に使用。
        }
        
        resultDomain.setW6002CriteriaDomain(criteriaDomain);
        return resultDomain;
    }
}
