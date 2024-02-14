/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * Base action class of Agent MA Edit screen.
 * <br />Agent MA Edit画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10567 $
 */
public abstract class W9003AbstractAction extends AbstractAction {

    /**
     * User function use authorization service<br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     *  <br /> デフォルトコンストラクタです。
     */
    public W9003AbstractAction() {
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
     * Setter method for userAuthService.
     * 
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Get screen common information 
     * Set the screen common items (language code) in Action Form 
     * - Get the pull-down list 
     * Call CommonService.searchPullDownList () for argument classification values: 
     * - Flag 
     * Set the request attribute the pull-down list obtained
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐フラグ
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W9003ActionForm W9003Form = (W9003ActionForm)form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(W9003Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, W9003Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Set screen transition source ID 
     *  Set the transition source screen ID in Action Form
     * </pre>
     * <pre>
     *  - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W9003ActionForm)form).setCallScreenId(SCREEN_ID_W9003);
        
        controlDisplay((W9003ActionForm) form, request, forwardName);
    }

    /**
     *Set the items in the common information screen in the action form.
     * <br />
     * アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action Form <br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W9003ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />
     * 画面に表示するプルダウンリストを取得します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param langCd Language code<br />
     * 言語コード
     * @throws ApplicationException can not get a pull-down list<br />
     * プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd)
        throws ApplicationException {

        List<? extends SelectListItemDomain> flgList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, false);

        request.setAttribute("bhtUnlockAuthFlg", flgList);
        request.setAttribute("maOtherAuthFlg", flgList);
        request.setAttribute("docAuthFlg", flgList);
        request.setAttribute("shippingActAuthFlg", flgList);
        request.setAttribute("expRequestAuthFlg", flgList);
        request.setAttribute("expRequestPkgAuthFlg", flgList);
        request.setAttribute("ertAuthFlg", flgList);
        request.setAttribute("rcvOdrAuthFlg", flgList);
        request.setAttribute("pltzInstrAuthFlg", flgList);
        request.setAttribute("mixTagAuthFlg", flgList);
        request.setAttribute("cmlAuthFlg", flgList);
        request.setAttribute("xTagAuthFlg", flgList);
        request.setAttribute("trAuthFlg", flgList);
        request.setAttribute("stgInstrAuthFlg", flgList);
        request.setAttribute("stgActAuthFlg", flgList);
        request.setAttribute("shippingFirmAuthFlg", flgList);
        request.setAttribute("progControlAuthFlg", flgList);
    }

    /**
     * Make the screen display control.<br />
     * 画面表示制御を行います。
     * 
     * <pre>
     * - If W9002B authority or W9002R authority there are no such
     *  the non-active the Register button
     * </pre>
     * <pre>
     * - W9002R権限またはW9002B権限が1つもない場合
     *     Registerボタンを非活性
     * </pre>
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param forwardName Forward Name<br />
     * フォワード名
     */
    protected void controlDisplay(W9003ActionForm form, HttpServletRequest request, String forwardName ) {

        List<String> disableElementList = new ArrayList<String>();

        String procMode = form.getW9003CriteriaDomain().getProcMode();
        if (MODE_NEW.equals(procMode) && FORWARD_SUCCESS.equals(forwardName)) {
            // Set initial data of the combo box.
            // ComboBoxの初期値を設定する。
            form.getW9003CriteriaDomain().setBhtUnlockAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setMaOtherAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setDocAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setShippingActAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setExpRequestAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setExpRequestPkgAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setErtAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setRcvOdrAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setPltzInstrAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setMixTagAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setCmlAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setXTagAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setTrAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setStgInstrAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setStgActAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setShippingFirmAuthFlg(FLAG_N);
            form.getW9003CriteriaDomain().setProgControlAuthFlg(FLAG_N);
        }

        if (MODE_REF.equals(procMode)) {
            // set disable data.
            // 非活性に設定する。
            disableElementList.add("register");
            disableElementList.add("w9003CriteriaDomain.bhtUnlockAuthFlg");
            disableElementList.add("w9003CriteriaDomain.maOtherAuthFlg");
            disableElementList.add("w9003CriteriaDomain.docAuthFlg");
            disableElementList.add("w9003CriteriaDomain.shippingActAuthFlg");
            disableElementList.add("w9003CriteriaDomain.expRequestAuthFlg");
            disableElementList.add("w9003CriteriaDomain.expRequestPkgAuthFlg");
            disableElementList.add("w9003CriteriaDomain.ertAuthFlg");
            disableElementList.add("w9003CriteriaDomain.rcvOdrAuthFlg");
            disableElementList.add("w9003CriteriaDomain.pltzInstrAuthFlg");
            disableElementList.add("w9003CriteriaDomain.mixTagAuthFlg");
            disableElementList.add("w9003CriteriaDomain.cmlAuthFlg");
            disableElementList.add("w9003CriteriaDomain.xTagAuthFlg");
            disableElementList.add("w9003CriteriaDomain.trAuthFlg");
            disableElementList.add("w9003CriteriaDomain.stgInstrAuthFlg");
            disableElementList.add("w9003CriteriaDomain.stgActAuthFlg");
            disableElementList.add("w9003CriteriaDomain.shippingFirmAuthFlg");
            disableElementList.add("w9003CriteriaDomain.progControlAuthFlg");
        }

        if (MODE_EDIT.equals(procMode)
            || form.getW9003CriteriaDomain().getProcMode().equals(MODE_REF)) {
            // Set disable data.
            // 非活性に設定する。
            disableElementList.add("select");
            disableElementList.add("w9003CriteriaDomain.agentCompCd");
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     * Add as {@link ActionMessages#GLOBAL_MESSAGE} the specified message
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId Message ID<br />メッセージID
     * @param args Message argument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
}
