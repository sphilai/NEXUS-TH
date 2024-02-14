/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;
// 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ADDITIONAL_CHARGE_NM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ADDITIONAL_CHARGE_CD;
// 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
// 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_1_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_2_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_3_DISP_FLG;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREE_4_DISP_FLG;
// 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREIGHT_RESPONSIBLE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FRT_CONSIGNEE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FRT_SHIPPER_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INV_TPL_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ADDITIONAL_CHARGE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FREIGHT_RESPONSIBLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PRICE_TERMS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_MISCELLANEOUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_LC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;
//2015/3/31 DNJP.Kawamura UT208対応 END <<<<<

/**
 * The class of base action for Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11855 $
 */
public abstract class W6009AbstractAction extends AbstractAction  {
    
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009AbstractAction() {
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
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set screen common item (LANGUAGE CODE) in action form.
     * 
     * ‐Setting of the pull-down list
     *   Call {@link #searchPullDownList(HttpServletRequest, W6009ActionForm)}
     * </pre>
     * <pre>
     * ‐Acquisition of common information screen
     *   The screen common item (Language code) set to form action
     *     
     *      
     * ‐Setting of the pull-down list
     *    Call {@link #searchPullDownList(HttpServletRequest, W6009ActionForm)}
     * </pre>
     * <pre>
     *
     *
     * ‐プルダウンリストの設定
     *     {@link #searchPullDownList(HttpServletRequest, W6009ActionForm)}を呼び出します。
     *     
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクションフォームに画面共通項目（言語コード）を設定します。
     * 
     * ‐プルダウンリストの設定
     *     {@link #searchPullDownList(HttpServletRequest, W6009ActionForm)}を呼び出します。
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6009ActionForm w6009Form = (W6009ActionForm) form;
        // Set the items in the common information screen in the action form.
        // 画面共通項目の取得
        setCommonInfo(w6009Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w6009Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form
     * 
     * ‐Screen display control
     * </pre>
     * <pre>
     * ‐遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * 
     * ‐画面表示制御
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W6009ActionForm w6009Form = (W6009ActionForm) form;
        
        controlDisplay(w6009Form, request);
        
        w6009Form.setCallScreenId(SCREEN_ID_W6009);
        
        // Set the VALUE of the pull-down list at the transition from the Main screen. 
        postSetPullDownList(request, w6009Form);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W6009ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
        //  Setting of a screen common information
        // 画面共通情報の設定
        prepareBusinessDomain(form.getW6009CriteriaDomain(), form.getWindowId(), form.getScreenId());
        
        if(SCREEN_ID_W6007.equals(form.getCallScreenId())) {
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6007);
            W6007ActionForm w6007Form = (W6007ActionForm) screenInfo.getActionForm();
            W6007CriteriaDomain w6007Criteria = w6007Form.getW6007CriteriaDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(form.getW6009CriteriaDomain(), w6007Criteria);
        } 
        else if (SCREEN_ID_W6008.equals(form.getCallScreenId())) {
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6008);
            W6008ActionForm w6008Form = (W6008ActionForm) screenInfo.getActionForm();
            W6008CriteriaDomain w6008Criteria = w6008Form.getW6008CriteriaDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(form.getW6009CriteriaDomain(), w6008Criteria);
        }
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
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
    
    /**
     * 
     * <br />Do not overwrite the screen display items in the copy function of the screen common information domain.
     * 
     * <br />画面共通情報ドメインのコピー関数で画面表示項目を上書きしないようにします。
     * 
     * @param criteriaDomain Criteria Domain
     * @param windowId Window Id
     * @param screenId Screen ID
     */
    protected void prepareBusinessDomain (W6009CriteriaDomain criteriaDomain, String windowId, String screenId) {

        String weightUnit = criteriaDomain.getWeightUnit();
        String volumeUnit = criteriaDomain.getVolumeUnit();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, windowId, screenId);
        
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setVolumeUnit(volumeUnit);
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     * <pre>
     * ‐Acquisition of the pull-down list data
     *     Call {@link CommonService#searchPullDownList(String, String, int, boolean)} argument to the next segment VALUE
     *       ‐Freight Responsible/ FREIGHT RESPONSIBLE CODE (54)
     *       ‐Additional Charge / additional cost category (55)
     * </pre>
     * <pre>
     * ‐プルダウンリストデータの取得
     *     次の区分値を引数に{@link CommonService#searchPullDownList(String, String, int, boolean)}を呼び出す
     *       ‐Freight Responsible/運賃支払いコード(54)
     *       ‐Additional Charge/追加費用区分(55)
     * </pre>
     *
     * @param request HTTPリクエスト
     * @param form 画面のアクションフォーム
     * 
     * @throws ApplicationException プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, W6009ActionForm form) throws ApplicationException {
        String langCd = form.getLanguageCd();
        W6009CriteriaDomain criteria = form.getW6009CriteriaDomain();
        String dscId = criteria.getLoginUserDscId();
        String grpNo1 = criteria.getGrpNo1();
        String grpNo2 = criteria.getGrpNo2();
        String ownerCompCd = criteria.getOwnerCompCd();
        String frtShipperCd = criteria.getFrtShipperCd();
        // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
        String shipperCd = criteria.getShipperCd();
        String invoiceCtgry = criteria.getInvoiceCtgry();
        // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//        String shipToCd = criteria.getShipToCd();
//        String cmlTyp = criteria.getCmlTyp();
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        
        // Get FRT Shipper (combo box data).
        List<? extends SelectListItemDomain> frtShipperList = w6001DocService.searchTwInvPltzOnRegisterByFrtShipper(dscId, true);
        List<? extends SelectListItemDomain> frtConsigneeList = w6001DocService.searchTwInvPltzOnRegisterByFrtConsignee(dscId, grpNo1, true);
        // Get a list of pull-down from the Code Master. 
        List<? extends SelectListItemDomain> freightResponsibleNmList = commonService.searchPullDownList(CD_TYPE_FREIGHT_RESPONSIBLE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> additionalChargeNmList = commonService.searchPullDownList(CD_TYPE_ADDITIONAL_CHARGE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> priceTermsList = commonService.searchPullDownList(CD_TYPE_PRICE_TERMS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        // Get Template No. Inv (combo box data) .
        // FRT Shipperを選択済みかどうかで取得方法が変わる
        List<? extends SelectListItemDomain> invTplNoList = null;
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//        List<? extends SelectListItemDomain> free1DispFlgList = null;
//        List<? extends SelectListItemDomain> free2DispFlgList = null;
//        List<? extends SelectListItemDomain> free3DispFlgList = null;
//        List<? extends SelectListItemDomain> free4DispFlgList = null;
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        if (StringUtils.isEmpty(criteria.getFrtShipperCd())) {
            // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
//            invTplNoList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, grpNo2, true, ATTR_INV_TPL_NO);
            invTplNoList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, shipperCd, invoiceCtgry, grpNo2, true, ATTR_INV_TPL_NO);
            // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            free1DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, grpNo2, true, ATTR_FREE_1_DISP_FLG);
//            free2DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, grpNo2, true, ATTR_FREE_2_DISP_FLG);
//            free3DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, grpNo2, true, ATTR_FREE_3_DISP_FLG);
//            free4DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, grpNo2, true, ATTR_FREE_4_DISP_FLG);
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        } else {
            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//            invTplNoList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp, true, ATTR_INV_TPL_NO);
//            free1DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp, true, ATTR_FREE_1_DISP_FLG);
//            free2DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp, true, ATTR_FREE_2_DISP_FLG);
//            free3DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp, true, ATTR_FREE_3_DISP_FLG);
//            free4DispFlgList = w6001DocService.searchTwInvOnRegisterByInvTmpNo(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp, true, ATTR_FREE_4_DISP_FLG);
            invTplNoList = w6001DocService.searchTwInvOnRegisterByInvTmpNoForFrt(dscId, ownerCompCd, frtShipperCd, true, ATTR_INV_TPL_NO);
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        }
        
        request.setAttribute(ATTR_FRT_SHIPPER_CD, frtShipperList);
        request.setAttribute(ATTR_FRT_CONSIGNEE_CD, frtConsigneeList);
        request.setAttribute(ATTR_PRICE_TERMS, priceTermsList);
        
        request.setAttribute(ATTR_INV_TPL_NO, invTplNoList);
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//        request.setAttribute(ATTR_FREE_1_DISP_FLG, free1DispFlgList);
//        request.setAttribute(ATTR_FREE_2_DISP_FLG, free2DispFlgList);
//        request.setAttribute(ATTR_FREE_3_DISP_FLG, free3DispFlgList);
//        request.setAttribute(ATTR_FREE_4_DISP_FLG, free4DispFlgList);
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<

        request.setAttribute(ATTR_FREIGHT_RESPONSIBLE_CD, freightResponsibleNmList);
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
        request.setAttribute(ATTR_ADDITIONAL_CHARGE_CD, additionalChargeNmList);
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
    }
    
    /**
     * 
     * <br />Display control of the screen.
     * 
     * @param form Action form of screen<br />
     * 画面のアクションフォーム
     * @param request Request of the screen<br />
     * 画面のリクエスト
     */
    protected void controlDisplay(W6009ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        W6009CriteriaDomain criteriaDomain = form.getW6009CriteriaDomain();
        
        if (SCREEN_ID_W6007.equals(criteriaDomain.getOriginalScreenId()) || SCREEN_ID_W6008.equals(criteriaDomain.getOriginalScreenId())) {
            disableElementList.addAll(controlDisplayFromDetail(form.getCallScreenId(), criteriaDomain));
        } else {
            disableElementList.addAll(controlDisplayFromMain(form.getCallScreenId(), criteriaDomain));
        }
        // Change the screen display state in the state of Remittance or L / C radio button. 
        // Remittance or L/Cラジオボタンによる表示判定
        disableElementList.addAll(controlDisplayForRemLcTyp(criteriaDomain.getRemLcTyp()));
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        
        try {
            // 表示単位の設定
            if (CheckUtil.isBlankOrNull(criteriaDomain.getWeightUnit())) {
                criteriaDomain.setWeightUnitDisp("");
            } else {
                criteriaDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(criteriaDomain.getWeightUnit()));
            }
            if (CheckUtil.isBlankOrNull(criteriaDomain.getVolumeUnit())) {
                criteriaDomain.setVolumeUnitDisp("");
            } else {
                criteriaDomain.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(criteriaDomain.getVolumeUnit()));
            }
        } catch (Exception e) {
            throw new SystemException(NXS_91_0001);
        }
    }
    
    /**
     * Change the screen display state when a transition from the Detail screen.
     * <br />Detail画面から遷移した場合の画面表示状態を変更します。
     * 
     * @param callScreenId Invocation screen id
     * @param criteriaDomain criteria domain
     * @return Revocation list<br />
     * 無効化リスト
     */
    protected List<String> controlDisplayFromDetail (String callScreenId, W6009CriteriaDomain criteriaDomain) {
        List<String> disableElementList = new ArrayList<String>();
        
        String cmlTyp = criteriaDomain.getCmlTyp();
        String grpNo2 = criteriaDomain.getGrpNo2();
        String tmpInvoiceNo = criteriaDomain.getTempInvoiceNo();
        String invoiceCtgry = criteriaDomain.getInvoiceCtgry();
        
        if (CheckUtil.isBlankOrNull(criteriaDomain.getCommand())) {
            disableElementList.add("backToMainScreen");
            disableElementList.add("cancel");
            disableElementList.add("printDocument");
        } else {
            if (CANCEL_TYP_CANCEL.equals(criteriaDomain.getCancelTyp())) {
                disableElementList.add("cancel");
            }
            // Back to Invoice Detail
            disableElementList.add("backToInvoiceDetail");
            // Register
            disableElementList.add("register");
            // Calculate(Amount)
            disableElementList.add("calculate");
            
            disableElementList.addAll(controlDisplayForAllInput());
        }
        
        if (!GRP_NO2_MAIN.equals(grpNo2)) {
            disableElementList.add("calculate");
        }
        
        if (StringUtils.isNotEmpty(tmpInvoiceNo)) {
            disableElementList.add("backToInvoiceDetail");
            disableElementList.add("backToMainScreen");
            disableElementList.add("printDocument");
            disableElementList.add("register");
            disableElementList.add("cancel");
            disableElementList.add("calculate");
            disableElementList.addAll(controlDisplayForAllInput());
        }
        
        if (GRP_NO2_MAIN.equals(grpNo2)) {
            // FRT Shipper
            disableElementList.add("w6009CriteriaDomain.frtShipperCd");
            // FRT Consignee
            disableElementList.add("w6009CriteriaDomain.frtConsigneeCd");
            // Price Terms
            disableElementList.add("w6009CriteriaDomain.priceTerms");
            
            if (!CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
                // Handling Charge
                disableElementList.add("w6009CriteriaDomain.handlingCharge");
                // Free Additional
                disableElementList.add("w6009CriteriaDomain.additionalCharge");
                // Free Additional Name
                // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//                disableElementList.add("w6009CriteriaDomain.additionalChargeNm");
                disableElementList.add("w6009CriteriaDomain.additionalChargeCd");
                // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            }
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 START >>>>>
//            if (!INVOICE_CTGRY_C.equals(invoiceCtgry)) {
            if (INVOICE_CTGRY_N.equals(invoiceCtgry)) {
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 END <<<<<
                // Remittance or L/C
                disableElementList.add("w6009CriteriaDomain.remLcTyp");
            }
        } else {
            // Freight Res.
            disableElementList.add("w6009CriteriaDomain.freightResponsibleCd");
            // Freight
            disableElementList.add("w6009CriteriaDomain.freight");
            // Insurance
            disableElementList.add("w6009CriteriaDomain.insurance");
            // Handling Charge
            disableElementList.add("w6009CriteriaDomain.handlingCharge");
            // Free Additional
            disableElementList.add("w6009CriteriaDomain.additionalCharge");
            // Free Additional Name
            // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//            disableElementList.add("w6009CriteriaDomain.additionalChargeNm");
            disableElementList.add("w6009CriteriaDomain.additionalChargeCd");
            // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
            // Vat
            disableElementList.add("w6009CriteriaDomain.vat");
            // Vat(%)
            disableElementList.add("w6009CriteriaDomain.vatRatio");
            // Remittance or L/C
            disableElementList.add("w6009CriteriaDomain.remLcTyp");
            // Issue Date
            disableElementList.add("w6009CriteriaDomain.dispInvoiceIssueDt");
        }
        
        // ST959 UNIT CONVERSION ADD START
        if (FLAG_Y.equals(criteriaDomain.getTotalVolumeOverflowFlg())
            || FLAG_Y.equals(criteriaDomain.getTotalNetWeightOverflowFlg())
            || FLAG_Y.equals(criteriaDomain.getTotalGrossWeightOverflowFlg())
        )
        {
            disableElementList.add("register");
        }
        // ST959 UNIT CONVERSION ADD END
        
        
        return disableElementList;
    }
    
    /**
     * Change the screen display state when a transition from the Main screen.
     * <br />Main画面から遷移した場合の画面表示状態を変更します。
     * <pre>
     * I want to button other than the following inactive during transition from the Main screen.
     *   -Back to Main Screen
     *   -Cancel
     *   -Print Document
     * </pre>
     * <pre>
     * Main画面から遷移時は下記のボタン以外非活性にします。
     *   -Back to Main Screen
     *   -Cancel
     *   -Print Document
     * </pre>
     * 
     * @param callScreenId Invocation screen id
     * @param criteriaDomain criteria domain
     * @return Revocation list<br />
     * 無効化リスト
     */
    protected List<String> controlDisplayFromMain (String callScreenId, W6009CriteriaDomain criteriaDomain) {
        List<String> disableElementList = new ArrayList<String>();

        String cancelTyp = criteriaDomain.getCancelTyp();
        
        if (CANCEL_TYP_CANCEL.equals(cancelTyp)) {
            disableElementList.add("cancel");
        }
        
        disableElementList.add("backToInvoiceGrouping");
        
        // Back to Invoice Detail
        disableElementList.add("backToInvoiceDetail");
        // Register
        disableElementList.add("register");
        // Calculate(Amount)
        disableElementList.add("calculate");
        
        disableElementList.addAll(controlDisplayForAllInput());
        
        return disableElementList;
    }
    
    /**
     * Change input form to disable
     * <br />入力項目をすべて非表示にします。
     * 
     * @return Revocation list<br />
     * 無効化リスト
     */
    protected List<String> controlDisplayForAllInput () {
        List<String> disableElementList = new ArrayList<String>();
        
        // Select(Notify Party1)
        disableElementList.add("selectNotifyParty1");
        disableElementList.add("w6009CriteriaDomain.notifyParty1Nm");
        disableElementList.add("w6009CriteriaDomain.notifyParty1Addr");
        // Select(Notify Party2)
        disableElementList.add("selectNotifyParty2");
        disableElementList.add("w6009CriteriaDomain.notifyParty2Nm");
        disableElementList.add("w6009CriteriaDomain.notifyParty2Addr");
        // Select(Notify Party3)
        disableElementList.add("selectNotifyParty3");
        disableElementList.add("w6009CriteriaDomain.notifyParty3Nm");
        disableElementList.add("w6009CriteriaDomain.notifyParty3Addr");
        // Select(Notify Party4)
        disableElementList.add("selectNotifyParty4");
        disableElementList.add("w6009CriteriaDomain.notifyParty4Nm");
        disableElementList.add("w6009CriteriaDomain.notifyParty4Addr");
        
        // Export Basic Information
        disableElementList.add("w6009CriteriaDomain.frtShipperCd");
        disableElementList.add("w6009CriteriaDomain.frtConsigneeCd");
        // Document Information
        disableElementList.add("w6009CriteriaDomain.invTplNo");
        // Terms/Remittance Information
        disableElementList.add("w6009CriteriaDomain.freightResponsibleCd");
        disableElementList.add("w6009CriteriaDomain.priceTerms");
        disableElementList.add("w6009CriteriaDomain.remLcTyp");
        disableElementList.add("w6009CriteriaDomain.remBankNm");
        disableElementList.add("w6009CriteriaDomain.remBankAddress1");
        disableElementList.add("w6009CriteriaDomain.remBankAddress2");
        disableElementList.add("w6009CriteriaDomain.remBankAddress3");
        disableElementList.add("w6009CriteriaDomain.remBankAccountNo");
        disableElementList.add("w6009CriteriaDomain.lcBankNm1");
        disableElementList.add("w6009CriteriaDomain.lcBankNm2");
        disableElementList.add("w6009CriteriaDomain.lcNo");
        disableElementList.add("w6009CriteriaDomain.lcDt");
        // Amount Information
        disableElementList.add("w6009CriteriaDomain.freight");
        disableElementList.add("w6009CriteriaDomain.insurance");
        disableElementList.add("w6009CriteriaDomain.handlingCharge");
        disableElementList.add("w6009CriteriaDomain.additionalCharge");
        // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//        disableElementList.add("w6009CriteriaDomain.additionalChargeNm");
        disableElementList.add("w6009CriteriaDomain.additionalChargeCd");
        // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
        disableElementList.add("w6009CriteriaDomain.vatRatio");
        // Invoice Attached Header Information
        disableElementList.add("w6009CriteriaDomain.free1DispFlg");
        disableElementList.add("w6009CriteriaDomain.free2DispFlg");
        disableElementList.add("w6009CriteriaDomain.free3DispFlg");
        disableElementList.add("w6009CriteriaDomain.free4DispFlg");
        // Others Information
        disableElementList.add("w6009CriteriaDomain.spInfo");
        disableElementList.add("w6009CriteriaDomain.bookingNo");
        // Issue Date
        disableElementList.add("w6009CriteriaDomain.dispInvoiceIssueDt");
        
        return disableElementList;
    }
    
    /**
     * Change the screen display state in the state of Remittance or L / C radio button.
     * <br />Remittance or L/Cラジオボタンの状態で画面表示状態を変更します。
     * 
     * @param remLcTyp VALUE selection of Remittance or L / C radio button<br />
     * Remittance or L/Cラジオボタンの選択値
     * @return Revocation list<br />
     * 無効化リスト
     */
    protected List<String> controlDisplayForRemLcTyp (String remLcTyp) {
        List<String> disableElementList = new ArrayList<String>();

        if (!REM_LC_TYP_REM.equals(remLcTyp)) {
            disableElementList.add("w6009CriteriaDomain.remBankNm");
            disableElementList.add("w6009CriteriaDomain.remBankAddress1");
            disableElementList.add("w6009CriteriaDomain.remBankAddress2");
            disableElementList.add("w6009CriteriaDomain.remBankAddress3");
            disableElementList.add("w6009CriteriaDomain.remBankAccountNo");
        } 
        if (!REM_LC_TYP_LC.equals(remLcTyp)) {
            disableElementList.add("w6009CriteriaDomain.lcBankNm1");
            disableElementList.add("w6009CriteriaDomain.lcBankNm2");
            disableElementList.add("w6009CriteriaDomain.lcNo");
            disableElementList.add("w6009CriteriaDomain.lcDt");
           
        }
        return disableElementList;
    }
    
   
    /**
     * Set the VALUE of the pull-down list at the transition from the Main screen.
     * <br />Main画面から遷移時のプルダウンリストの値を設定します。
     * <pre>
     * The transition from the Main screen, I set the display to list items as they appear on the screen.
     * </pre>
     * <pre>
     * Main画面から遷移時は、画面の表示項目をリストに設定します。
     * </pre>
     * 
     * @param request HTTPリクエスト
     * @param form 画面のアクションフォーム
     */
    protected void postSetPullDownList (HttpServletRequest request, W6009ActionForm form) {
        W6009CriteriaDomain criteria = form.getW6009CriteriaDomain();
        
        // 2015/1/19 DNJP.Kawamura 不具合対応 START >>>>>
//        if (SCREEN_ID_W6001.equals(criteria.getOriginalScreenId())) {
        if (SCREEN_ID_W6001.equals(criteria.getOriginalScreenId()) 
            || SCREEN_ID_W6009.equals(criteria.getOriginalScreenId())) {
        // 2015/1/19 DNJP.Kawamura 不具合対応 END <<<<<
            // FRT Shipper
            List<SelectListItemDomain> frtShipperList = new ArrayList<SelectListItemDomain>();
            SelectListItemDomain frtShipperItemDomain = new SelectListItemDomain();
            frtShipperItemDomain.setId(criteria.getFrtShipperCd());
            frtShipperItemDomain.setName(criteria.getFrtShipperCd());
            frtShipperList.add(frtShipperItemDomain);
            request.setAttribute(ATTR_FRT_SHIPPER_CD, frtShipperList);
            
            // FRT Consignee
            List<SelectListItemDomain> frtConsigneeList = new ArrayList<SelectListItemDomain>();
            SelectListItemDomain frtConsigneeItemDomain = new SelectListItemDomain();
            frtConsigneeItemDomain.setId(criteria.getFrtConsigneeCd());
            frtConsigneeItemDomain.setName(criteria.getFrtConsigneeCd());
            frtConsigneeList.add(frtConsigneeItemDomain);
            request.setAttribute(ATTR_FRT_CONSIGNEE_CD, frtConsigneeList);
            
            // Inv Tpl No
            List<SelectListItemDomain> invTplNoList = new ArrayList<SelectListItemDomain>();
            SelectListItemDomain invTplNoDomain = new SelectListItemDomain();
            invTplNoDomain.setId(criteria.getInvTplNo());
            invTplNoDomain.setName(criteria.getInvTplNo());
            invTplNoList.add(invTplNoDomain);
            request.setAttribute(ATTR_INV_TPL_NO, invTplNoList);
        }
    }
}
