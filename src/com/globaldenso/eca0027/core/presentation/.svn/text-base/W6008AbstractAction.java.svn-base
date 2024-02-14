/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;
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
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action for Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11858 $
 */
public abstract class W6008AbstractAction extends AbstractAction {
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form
     * </pre>
     * <pre>
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6008ActionForm w6008Form = (W6008ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w6008Form);
       
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form
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

        ((W6008ActionForm) form).setCallScreenId(SCREEN_ID_W6008);
        
        controlDisplay((W6008ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W6008ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
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
        // Add message.
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
    

    /**
     * Control Invoice Detail screen display.
     * <br />Invoice Detail画面の表示制御を行います。
     * <pre>
     * ‐Make the display control of the screen by the selected value of the radio button of the search condition.
     * </pre>
     * <pre>
     * ‐検索条件のラジオボタンの選択値によって画面の表示制御を行います。
     * </pre>
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W6008ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        // ST959 UNIT CONVERSION ADD START
        if (FLAG_Y.equals(form.getW6008CriteriaDomain().getTotalNetWeightOverflowFlg())) {
            disableElementList.add("moveToRegister");
        }
        // ST959 UNIT CONVERSION ADD END
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
}
