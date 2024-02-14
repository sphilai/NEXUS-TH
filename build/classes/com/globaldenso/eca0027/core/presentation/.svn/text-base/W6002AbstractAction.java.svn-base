/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_CLASS_OF_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INV_CTGRY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TYPE_OF_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_LC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_2;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_4;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_5;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class of action Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11672 $
 */
public abstract class W6002AbstractAction extends AbstractAction {
    /** 
     * common service
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * default constructor.
     * <br />デフォルトコンストラクタ。
     */
    public W6002AbstractAction() {
        super();
    }

    /**
     * Getter method for commonService.
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
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
     * - Acquisition of common screen information
     * Set the screen common item (LANGUAGE CODE) in Action Form
     *
     * - Get the pull-down list
     * Call CommonService.searchPullDownList () for the argument classification VALUE following
     *    - Transport  
     * And then set them in the request attribute pull-down list obtained
     * </pre>
     * <pre>
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         - 輸送手段
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * 
     * 
     * @see AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6002ActionForm w6002Form = (W6002ActionForm) form;
        
        // Set the transition source SCREEN ID in Action Form.
        // 画面共通項目の取得
        setCommonInfo(w6002Form);
        
        // Get a pull-down list to be displayed on the screen.
        // プルダウンリストの設定
        searchPullDownList(request, w6002Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     *  - Set transition source SCREEN ID
     * Set the transition source SCREEN ID in Action Form
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W6002ActionForm w6002Form = (W6002ActionForm) form;

        w6002Form.setCallScreenId(SCREEN_ID_W6002);
        controlDisplay(w6002Form, request);

        W6002CriteriaDomain criteriaDomain = w6002Form.getW6002CriteriaDomain();

        try {
            if (criteriaDomain.getInvoicePdfFileStream() != null) {
                // ST943 DEL START
                //if (!CheckUtil.isBlankOrNull(criteriaDomain.getConfirmMsg())) {
                //    saveInvoiceStream(w6002Form, criteriaDomain.getInvoicePdfFileStream());
                //}
                // ST943 DEL END
                criteriaDomain.getInvoicePdfFileStream().close();
                criteriaDomain.setInvoicePdfFileStream(null);
            }
            if (criteriaDomain.getPackingListPdfFilaStream() != null) {
                // ST943 DEL START
                //if (!CheckUtil.isBlankOrNull(criteriaDomain.getConfirmMsg())) {
                //    savePackingListStream(w6002Form, criteriaDomain.getPackingListPdfFilaStream());
                //}
                // ST943 DEL END
                criteriaDomain.getPackingListPdfFilaStream().close();
                criteriaDomain.setPackingListPdfFilaStream(null);
            }
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        } finally {
            // FormFileの削除を追加
            boolean hasErr = false;
            hasErr = destroyFormFile(w6002Form.getInvoicePdfFile());
            hasErr = destroyFormFile(w6002Form.getPackingListPdfFile());
            w6002Form.setInvoicePdfFile(null);
            w6002Form.setPackingListPdfFile(null);
            if (hasErr) {
                throw new SystemException(NXS_91_0001);
            }
        }
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />アクション・フォーム
     */
    protected void setCommonInfo(W6002ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Setup of a linguistic code 
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException Can not get a pull-down list<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {


        List<? extends SelectListItemDomain> typeOfInvList = commonService.searchPullDownList(CD_TYPE_TYPE_OF_INVOICE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> classOfInvList = commonService.searchPullDownList(CD_CLASS_OF_INVOICE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> invCtgrList = commonService.searchPullDownList(CD_TYPE_INV_CTGRY, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> transCdList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> freightList = commonService.searchPullDownList(CD_TYPE_FREIGHT_RESPONSIBLE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> priceTermsList = commonService.searchPullDownList(CD_TYPE_PRICE_TERMS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> tradeTermsList = commonService.searchPullDownList("16", langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> payMethodList = commonService.searchPullDownList("52", langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        
        List<? extends SelectListItemDomain> curList = commonService.searchCurrencyPullDownList(false, true);
        List<? extends SelectListItemDomain> unitOfVal = commonService.searchUnitOfVolumePullDownList(false, true);
        List<? extends SelectListItemDomain> unitOfWeight = commonService.searchUnitOfWeightPullDownList(false, true);
        
        request.setAttribute("typeOfInv", typeOfInvList);
        request.setAttribute("classOfInv", classOfInvList);
        request.setAttribute("invoiceCtgry", invCtgrList);
        request.setAttribute(ATTR_TRANS_CD, transCdList);
        request.setAttribute("freightRes", freightList);
        request.setAttribute(ATTR_PRICE_TERMS, priceTermsList);
        request.setAttribute("tradeTerms", tradeTermsList);
        request.setAttribute("paymentMethod", payMethodList);
        request.setAttribute("currCd", curList);
        request.setAttribute("volumeUnit", unitOfVal);
        request.setAttribute("weightUnit", unitOfWeight);
        
    }

    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * And deactivate the button according to the Function No
     * </pre>
     * <pre>
     * Function Noに応じてボタンを非活性
     * </pre>
     * 
     * @param form Action Form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W6002ActionForm form, HttpServletRequest request) {

        List<String> disableElementList = new ArrayList<String>();
        
        String functionNo = form.getFunctionNo();
        
        if (W6002_FUNCTION_NO_1.equals(functionNo)) {
            disableElementList.add("w6002CriteriaDomain.subTotal");
            disableElementList.add("w6002CriteriaDomain.totalInvoiceAmount");
            disableElementList.add("skip");
        }
        else if (W6002_FUNCTION_NO_2.equals(functionNo)) {
            disableElementList.add("w6002CriteriaDomain.typeOfInv");
            disableElementList.add("w6002CriteriaDomain.classOfInv");
            disableElementList.add("w6002CriteriaDomain.invoiceCtgry");
            disableElementList.add("w6002CriteriaDomain.shipToCd");
            disableElementList.add("nexusSelect");
            disableElementList.add("w6002CriteriaDomain.trnsCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceShipperCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceNo");
            disableElementList.add("w6002CriteriaDomain.dlivPoint");
            disableElementList.add("w6002CriteriaDomain.freightRes");
            disableElementList.add("refSelect");
            disableElementList.add("w6002CriteriaDomain.tradeTerms");
            disableElementList.add("w6002CriteriaDomain.termsPoint");
            disableElementList.add("w6002CriteriaDomain.paymentMethod");
            disableElementList.add("w6002CriteriaDomain.payTerms");
            disableElementList.add("w6002CriteriaDomain.remittanceOrLc");
            disableElementList.add("w6002CriteriaDomain.remBankNm");
            disableElementList.add("w6002CriteriaDomain.remBankAddress1");
            disableElementList.add("w6002CriteriaDomain.remBankAddress2");
            disableElementList.add("w6002CriteriaDomain.remBankAddress3");
            disableElementList.add("w6002CriteriaDomain.remBankAccountNo");
            disableElementList.add("w6002CriteriaDomain.lcBank1");
            disableElementList.add("w6002CriteriaDomain.lcBank2");
            disableElementList.add("w6002CriteriaDomain.lcNo");
            disableElementList.add("w6002CriteriaDomain.lcDt");
            disableElementList.add("w6002CriteriaDomain.ldDtDiv");
            disableElementList.add("w6002CriteriaDomain.freight");
            disableElementList.add("w6002CriteriaDomain.insurance");
            disableElementList.add("w6002CriteriaDomain.subTotal");
            disableElementList.add("w6002CriteriaDomain.vat");
            disableElementList.add("w6002CriteriaDomain.vatRatio");
            disableElementList.add("w6002CriteriaDomain.handlingCharge");
            disableElementList.add("w6002CriteriaDomain.additionalCharge");
            disableElementList.add("w6002CriteriaDomain.additionalChargeNm");
            disableElementList.add("w6002CriteriaDomain.totalInvoiceAmount");
            disableElementList.add("w6002CriteriaDomain.pltzItemQty");
            disableElementList.add("w6002CriteriaDomain.carrierCompCd");
            disableElementList.add("carSelect");
            disableElementList.add("w6002CriteriaDomain.fmCntryCd");
            disableElementList.add("w6002CriteriaDomain.forwarderCompCd");
            disableElementList.add("forSelect");
            disableElementList.add("w6002CriteriaDomain.toCntryCd");
            disableElementList.add("w6002CriteriaDomain.loadingPortCd");
            disableElementList.add("portFromSelect");
            disableElementList.add("w6002CriteriaDomain.dischargePortCd");
            disableElementList.add("w6002CriteriaDomain.vessel");
            disableElementList.add("portToSelect");
            disableElementList.add("w6002CriteriaDomain.protNmTo");
            disableElementList.add("w6002CriteriaDomain.etd");
            disableElementList.add("w6002CriteriaDomain.etdDiv");
            disableElementList.add("w6002CriteriaDomain.eta");
            disableElementList.add("w6002CriteriaDomain.etaDiv");
            disableElementList.add("w6002CriteriaDomain.arrivalTime");
            disableElementList.add("w6002CriteriaDomain.bookingNo");
            disableElementList.add("skip");
        }
        else if (W6002_FUNCTION_NO_3.equals(functionNo)) {
            disableElementList.add("w6002CriteriaDomain.typeOfInv");
            disableElementList.add("w6002CriteriaDomain.classOfInv");
            disableElementList.add("w6002CriteriaDomain.invoiceCtgry");
            disableElementList.add("w6002CriteriaDomain.shipperCd");
            disableElementList.add("w6002CriteriaDomain.invoiceNo");
            disableElementList.add("shipSelect");
            disableElementList.add("w6002CriteriaDomain.consigneeCd");
            disableElementList.add("consSelect");
            disableElementList.add("w6002CriteriaDomain.shipToCd");
            disableElementList.add("nexusSelect");
            disableElementList.add("w6002CriteriaDomain.trnsCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceShipperCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceNo");
            disableElementList.add("w6002CriteriaDomain.dlivPoint");
            disableElementList.add("w6002CriteriaDomain.freightRes");
            disableElementList.add("refSelect");
            disableElementList.add("w6002CriteriaDomain.priceTerms");
            disableElementList.add("w6002CriteriaDomain.tradeTerms");
            disableElementList.add("w6002CriteriaDomain.termsPoint");
            disableElementList.add("w6002CriteriaDomain.paymentMethod");
            disableElementList.add("w6002CriteriaDomain.payTerms");
            disableElementList.add("w6002CriteriaDomain.currCd");
            disableElementList.add("w6002CriteriaDomain.subTotal");
            disableElementList.add("w6002CriteriaDomain.totalInvoiceAmount");
            disableElementList.add("w6002CriteriaDomain.pltzItemQty");
            disableElementList.add("w6002CriteriaDomain.totalVolume");
            disableElementList.add("w6002CriteriaDomain.volumeUnit");
            disableElementList.add("w6002CriteriaDomain.totalNetWeight");
            disableElementList.add("w6002CriteriaDomain.totalGrossWeight");
            disableElementList.add("w6002CriteriaDomain.weightUnit");
            disableElementList.add("w6002CriteriaDomain.carrierCompCd");
            disableElementList.add("carSelect");
            disableElementList.add("w6002CriteriaDomain.fmCntryCd");
            disableElementList.add("w6002CriteriaDomain.forwarderCompCd");
            disableElementList.add("forSelect");
            disableElementList.add("w6002CriteriaDomain.toCntryCd");
            disableElementList.add("w6002CriteriaDomain.loadingPortCd");
            disableElementList.add("portFromSelect");
            disableElementList.add("w6002CriteriaDomain.dischargePortCd");
            disableElementList.add("w6002CriteriaDomain.vessel");
            disableElementList.add("portToSelect");
            disableElementList.add("w6002CriteriaDomain.protNmTo");
            disableElementList.add("w6002CriteriaDomain.etd");
            disableElementList.add("w6002CriteriaDomain.etdDiv");
            disableElementList.add("w6002CriteriaDomain.eta");
            disableElementList.add("w6002CriteriaDomain.etaDiv");
            disableElementList.add("w6002CriteriaDomain.arrivalTime");
            disableElementList.add("w6002CriteriaDomain.bookingNo");
        }
        else if (W6002_FUNCTION_NO_4.equals(functionNo)) {
            disableElementList.add("w6002CriteriaDomain.typeOfInv");
            disableElementList.add("w6002CriteriaDomain.classOfInv");
            disableElementList.add("w6002CriteriaDomain.invoiceCtgry");
            disableElementList.add("w6002CriteriaDomain.shipperCd");
            disableElementList.add("shipSelect");
            disableElementList.add("w6002CriteriaDomain.consigneeCd");
            disableElementList.add("consSelect");
            disableElementList.add("w6002CriteriaDomain.shipToCd");
            disableElementList.add("nexusSelect");
            disableElementList.add("w6002CriteriaDomain.trnsCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceShipperCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceNo");
            disableElementList.add("w6002CriteriaDomain.dlivPoint");
            disableElementList.add("w6002CriteriaDomain.freightRes");
            disableElementList.add("refSelect");
            disableElementList.add("w6002CriteriaDomain.priceTerms");
            disableElementList.add("w6002CriteriaDomain.tradeTerms");
            disableElementList.add("w6002CriteriaDomain.termsPoint");
            disableElementList.add("w6002CriteriaDomain.paymentMethod");
            disableElementList.add("w6002CriteriaDomain.payTerms");
            disableElementList.add("w6002CriteriaDomain.remittanceOrLc");
            disableElementList.add("w6002CriteriaDomain.remBankNm");
            disableElementList.add("w6002CriteriaDomain.remBankAddress1");
            disableElementList.add("w6002CriteriaDomain.remBankAddress2");
            disableElementList.add("w6002CriteriaDomain.remBankAddress3");
            disableElementList.add("w6002CriteriaDomain.remBankAccountNo");
            disableElementList.add("w6002CriteriaDomain.lcBank1");
            disableElementList.add("w6002CriteriaDomain.lcBank2");
            disableElementList.add("w6002CriteriaDomain.lcNo");
            disableElementList.add("w6002CriteriaDomain.lcDt");
            disableElementList.add("w6002CriteriaDomain.ldDtDiv");
            disableElementList.add("w6002CriteriaDomain.currCd");
            disableElementList.add("w6002CriteriaDomain.netAmount");
            disableElementList.add("w6002CriteriaDomain.freight");
            disableElementList.add("w6002CriteriaDomain.insurance");
            disableElementList.add("w6002CriteriaDomain.subTotal");
            disableElementList.add("w6002CriteriaDomain.vat");
            disableElementList.add("w6002CriteriaDomain.vatRatio");
            disableElementList.add("w6002CriteriaDomain.handlingCharge");
            disableElementList.add("w6002CriteriaDomain.additionalCharge");
            disableElementList.add("w6002CriteriaDomain.additionalChargeNm");
            disableElementList.add("w6002CriteriaDomain.totalInvoiceAmount");
            disableElementList.add("w6002CriteriaDomain.pltzItemQty");
            disableElementList.add("w6002CriteriaDomain.totalVolume");
            disableElementList.add("w6002CriteriaDomain.volumeUnit");
            disableElementList.add("w6002CriteriaDomain.totalNetWeight");
            disableElementList.add("w6002CriteriaDomain.totalGrossWeight");
            disableElementList.add("w6002CriteriaDomain.weightUnit");
            disableElementList.add("w6002CriteriaDomain.carrierCompCd");
            disableElementList.add("carSelect");
            disableElementList.add("w6002CriteriaDomain.fmCntryCd");
            disableElementList.add("w6002CriteriaDomain.forwarderCompCd");
            disableElementList.add("forSelect");
            disableElementList.add("w6002CriteriaDomain.toCntryCd");
            disableElementList.add("w6002CriteriaDomain.loadingPortCd");
            disableElementList.add("portFromSelect");
            disableElementList.add("w6002CriteriaDomain.dischargePortCd");
            disableElementList.add("w6002CriteriaDomain.vessel");
            disableElementList.add("portToSelect");
            disableElementList.add("w6002CriteriaDomain.protNmTo");
            disableElementList.add("w6002CriteriaDomain.etd");
            disableElementList.add("w6002CriteriaDomain.etdDiv");
            disableElementList.add("w6002CriteriaDomain.eta");
            disableElementList.add("w6002CriteriaDomain.etaDiv");
            disableElementList.add("w6002CriteriaDomain.arrivalTime");
            disableElementList.add("w6002CriteriaDomain.bookingNo");
            // ST946 MANUAL SCREEN TRANSITION ADD START
            if (MANUAL_TYP_RE_INVOICE.equals(form.getW6002CriteriaDomain().getTypeOfInv())) {
                disableElementList.add("skip");
            }
            // ST946 MANUAL SCREEN TRANSITION ADD END
        }
        else if (W6002_FUNCTION_NO_5.equals(functionNo)) {
            disableElementList.add("w6002CriteriaDomain.typeOfInv");
            disableElementList.add("w6002CriteriaDomain.classOfInv");
            disableElementList.add("w6002CriteriaDomain.shipperCd");
            disableElementList.add("shipSelect");
            disableElementList.add("w6002CriteriaDomain.invoiceNo");
            disableElementList.add("w6002CriteriaDomain.consigneeCd");
            disableElementList.add("consSelect");
            disableElementList.add("w6002CriteriaDomain.shipToCd");
            disableElementList.add("nexusSelect");
            disableElementList.add("w6002CriteriaDomain.trnsCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceShipperCd");
            disableElementList.add("w6002CriteriaDomain.relateInvoiceNo");
            disableElementList.add("w6002CriteriaDomain.dlivPoint");
            disableElementList.add("refSelect");
            disableElementList.add("w6002CriteriaDomain.subTotal");
            disableElementList.add("w6002CriteriaDomain.totalInvoiceAmount");
            disableElementList.add("w6002CriteriaDomain.carrierCompCd");
            disableElementList.add("carSelect");
            disableElementList.add("w6002CriteriaDomain.fmCntryCd");
            disableElementList.add("w6002CriteriaDomain.forwarderCompCd");
            disableElementList.add("forSelect");
            disableElementList.add("w6002CriteriaDomain.toCntryCd");
            disableElementList.add("w6002CriteriaDomain.loadingPortCd");
            disableElementList.add("portFromSelect");
            disableElementList.add("w6002CriteriaDomain.dischargePortCd");
            disableElementList.add("w6002CriteriaDomain.vessel");
            disableElementList.add("portToSelect");
            disableElementList.add("w6002CriteriaDomain.protNmTo");
            disableElementList.add("w6002CriteriaDomain.etd");
            disableElementList.add("w6002CriteriaDomain.etdDiv");
            disableElementList.add("w6002CriteriaDomain.eta");
            disableElementList.add("w6002CriteriaDomain.etaDiv");
            disableElementList.add("w6002CriteriaDomain.arrivalTime");
            disableElementList.add("w6002CriteriaDomain.bookingNo");
            disableElementList.add("skip");
        }
        
        // Screen control of Remittance LC 
        // Remittance LC の画面制御
        if (REM_LC_TYP_REM.equals(form.getW6002CriteriaDomain().getRemittanceOrLc())) {
            disableElementList.add("w6002CriteriaDomain.lcBank1");
            disableElementList.add("w6002CriteriaDomain.lcBank2");
            disableElementList.add("w6002CriteriaDomain.lcNo");
            disableElementList.add("w6002CriteriaDomain.lcDt");
        }
        else if (REM_LC_TYP_LC.equals(form.getW6002CriteriaDomain().getRemittanceOrLc())) {
            disableElementList.add("w6002CriteriaDomain.remBankNm");
            disableElementList.add("w6002CriteriaDomain.remBankAddress1");
            disableElementList.add("w6002CriteriaDomain.remBankAddress2");
            disableElementList.add("w6002CriteriaDomain.remBankAddress3");
            disableElementList.add("w6002CriteriaDomain.remBankAccountNo");
        }
        
        // Setup of a request attribute 
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * Add as ActionMessages.GLOBAL_MESSAGE the specified message.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param messageId MESSAGE ID<br />
     * メッセージID
     * @param args Message argument<br />
     * メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Addition of a message 
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Registration of GLOBAL_MESSAGE 
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }
    
// ST943 DEL START
//    /**
//     * The specified PDF list is saved in the general-purpose area of a screen information domain.
//     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
//     *
//     * @param form Action form<br />アクションフォーム
//     * @param stream Invoice PDF
//     */
//    protected void saveInvoiceStream(W6002ActionForm form, InputStream stream) {
//        // Acquisition of a screen information domain
//        // 画面情報ドメインの取得
//        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
//        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W6002);
//        
//        // Preservation of PDF list
//        screenInfo.setGeneralArea("invoiceStream", stream);
//    }
//    
//    /**
//     *    The specified PDF list is saved in the general-purpose area of a screen information domain.
//     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
//     *
//     * @param form Action form<br />アクションフォーム
//     * @param stream packing list PDF
//     */
//    protected void savePackingListStream(W6002ActionForm form, InputStream stream) {
//        // Acquisition of a screen information domain
//        // 画面情報ドメインの取得
//        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
//        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W6002);
//        
//        // Preservation of PDF list
//        // PDF帳票の保存
//        screenInfo.setGeneralArea("packingStream", stream);
//    }
//    
//    /**
//     *    The PDF list saved in the general-purpose area of the screen information domain is acquired.
//     * <br />画面情報ドメインの汎用エリアに保存されているPDF帳票を取得します。
//     *
//     * @param form Action form<br />アクションフォーム
//     * @return Invoice PDF
//     */
//    protected InputStream getInvoiceStream(W6002ActionForm form) {
//        // Acquisition of a screen information domain
//        // 画面情報ドメインの取得
//        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
//        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W6002);
//
//        // Acquisition of PDF list
//        // PDF帳票の取得
//        InputStream report = screenInfo.getGeneralArea("invoiceStream");
//        
//        // Clearance of area in general
//        // 汎用エリアのクリア
//        screenInfo.setGeneralArea("invoiceStream", null);
//        
//        return report;
//    }
//    
//    /**
//     * The PDF list saved in the general-purpose area of the screen information domain is acquired.
//     * <br />画面情報ドメインの汎用エリアに保存されているPDF帳票を取得します。
//     *
//     * @param form Action form<br />アクションフォーム
//     * @return packing list PDF
//     */
//    protected InputStream getPackingListStream(W6002ActionForm form) {
//        // Acquisition of a screen information domain
//        // 画面情報ドメインの取得
//        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
//        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W6002);
//
//        // Acquisition of PDF list
//        // PDF帳票の取得
//        InputStream report = screenInfo.getGeneralArea("packingStream");
//        
//        // Clearance of area in general
//        // 汎用エリアのクリア
//        screenInfo.setGeneralArea("packingStream", null);
//        
//        return report;
//    }
// ST943 DEL END

    /**
     * Destroy temporary file.
     *
     * @param f FormFile object.
     * @return result If an error occurs return true, otherwise false.
     */
    private boolean destroyFormFile(FormFile f) {
        boolean hasErr = false;
        if (f != null) {
            InputStream in;
            try {
                in = f.getInputStream();
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                // No Action.
                hasErr = true;
            }
            f.destroy();
        }
        return hasErr;
    }

}
