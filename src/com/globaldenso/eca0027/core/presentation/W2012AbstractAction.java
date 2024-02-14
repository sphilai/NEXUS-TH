/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
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
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of CML Register
 * <br />CML登録画面の基底アクションクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7517 $
 */
public abstract class W2012AbstractAction extends AbstractAction {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * constructor.
     */
    public W2012AbstractAction() {
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
     * {@inheritDoc}.
     * <pre>
     * - Setting of a screen common items
     *
     * - 画面共通項目の設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W2012ActionForm w2012Form = (W2012ActionForm)form;

        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2012Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     *
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        ((W2012ActionForm) form).setCallScreenId(SCREEN_ID_W2012);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2012ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     *    Display control of a screen item is performed.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * From - Main screen to the time of changes
     *       The following items are made into non-activity.
     *         - criteriaDomain.outerPkgCd input column
     *         - select button
     *         - BackToCreate button
     *         - Delete check box
     *         - Delete button
     *         - Register button
     *         - IgnoreWarnings check box
     *         - PrintCml button (when there is no update authority of CML)
     *         - Cancel button (when there is no update authority of CML)
     *
     * From - Create screen to the time of changes
     *       The following items are made into non-activity.
     *         - Cancel button
     *         - Print CML button
     *         - select button (un-active [ in the case of activity and others ] only in PKG_FORM_TYPE=M or WARNING_FLG=Y)  
     *
     * - Main画面から遷移時
     *     以下の項目を非活性にする
     *       - criteriaDomain.outerPkgCd 入力欄
     *       - select ボタン
     *       - BackToCreateボタン
     *       - Deleteチェックボックス
     *       - Deleteボタン
     *       - Registerボタン
     *       - IgnoreWarnings チェックボックス
     *       - PrintCmlボタン (CMLの更新権限がない場合)
     *       - Cancelボタン (CMLの更新権限がない場合)
     *       
     * - Create画面から遷移時
     *     以下の項目を非活性にする
     *       - Cancelボタン
     *       - Print CMLボタン
     *       - select ボタン(PKG_FORM_TYPE=M または WARNING_FLG=Y の場合のみ活性、その他の場合は非活性)
     * </pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     */
    protected void controlDisplay(HttpServletRequest request, W2012ActionForm form) {
        // List of un-active items
        // 非活性項目のリスト
        List<String> disableList = new ArrayList<String>();
        
        if (W2009_CML_MODE_REF.equals(form.getW2012CriteriaDomain().getFunctionMode())) {
            disableList.add("w2012CriteriaDomain.outerPkgCd");
            disableList.add("select");
            disableList.add("backToCreate");
            disableList.add("delete");
            disableList.add("register");
            disableList.add("w2012CriteriaDomain.ignoreWarnings");
            if (!enableCancel(form)) {
                disableList.add("cancel");
            }
            if (!enablePrintCml(form)) {
                disableList.add("printCml");
            }
            List<? extends W2012ListDomain> listDomainList = form.getListDomainList();
            for (int i = 0; i < listDomainList.size(); i++) {
                disableList.add(String.format("listDomainList[%d].selected", i));
            }
        } else {

            disableList.add("cancel");
            disableList.add("printCml");
            
            // Control of a Select button
            // Un-active [ in the case of activity and others ] only in PKG_FORM_TYPE=M or WARNING_FLG=Y
            // Select ボタンの制御
            // PKG_FORM_TYPE=M または WARNING_FLG=Y の場合のみ活性、その他の場合は非活性
            boolean hasFlgY = false;
            boolean hasPkgFormTypM = false;
            if (PKG_FORM_TYP_MULTI.equals(form.getW2012CriteriaDomain().getPkgFormTyp())) {
                hasPkgFormTypM = true;
            }
            List<? extends W2012ListDomain> listDomainList = form.getListDomainList();
            if (listDomainList != null) {
                for (int i = 0; i < listDomainList.size(); i++) {
                    if (FLAG_Y.equals(listDomainList.get(i).getWarningFlg())) {
                        hasFlgY = true;
                        break;
                    }
                }
            }
            if (!hasFlgY && !hasPkgFormTypM) {
                disableList.add("select");
            }
            
            if (form.getW2012CriteriaDomain().isVolumeOverflow()
                || form.getW2012CriteriaDomain().isNetWeightOverflow()
                || form.getW2012CriteriaDomain().isGrossWeightOverflow()) {
                disableList.add("register");
            }
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }
    
    /**
     *    The use propriety of the PrintCml button is returned.
     * <br />PrintCmlボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2009R authority, they will be true, otherwise, false.<br />W2009R権限があればtrue、そうでなければfalse
     */
    @SuppressWarnings("unchecked")
    protected boolean enablePrintCml(W2012ActionForm form) {

        List<? extends W2012ListDomain> list = (List<? extends W2012ListDomain>)form.getListDomainList();
        
        boolean hasCmlR = true;
        for (W2012ListDomain domain : list) {
        
            if (!AUTH_REGISTER_NUMERIC.equals(domain.getAuthFlg())) {
                hasCmlR = false;
                break;
            }
        }
        
        // Existence of the update authority of CML
        // CMLの更新権限の有無
        return hasCmlR;
    }

    /**
     *    The use propriety of the Cancel button is returned.
     * <br />Cancelボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2009R authority over CML selected on the Main screen, they will be true, otherwise, false.<br />Main画面で選択されたCMLに対するW2009R権限があればtrue、そうでなければfalse
     */
    protected boolean enableCancel(W2012ActionForm form) {
        return enablePrintCml(form);
    }

    /**
     *    The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId MESSAGE ID<br />メッセージID
     * @param args Message argument<br />メッセージ引数
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

    /**
     *    Set of a warning message
     * <br />警告メッセージのセット
     * <pre>
     * - Display a overflow warning message.
     * - Display a warning message to the record of WarningFlg = Y.
     *
     * - 桁あふれ警告メッセージを表示する。
     * - WarningFlg = Y のレコードに対して、警告メッセージを表示する。
     * </pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param listDomainList Search results<br />検索結果
     * @param criteriaDomain Search-condition domain<br />検索条件ドメイン
     */
    protected void saveWarnigMsges(HttpServletRequest request, ActionMapping mapping, List<? extends W2012ListDomain> listDomainList,
        W2012CriteriaDomain criteriaDomain) {
        
        ActionMessages errors = new ActionMessages();
        ActionMessages warnings = new ActionMessages();
        
        if (criteriaDomain.isVolumeOverflow()) {
            String[] args = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.volume") };
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_E7_0157, args));
        }
        if (criteriaDomain.isNetWeightOverflow()) {
            String[] args = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.netWeight") };
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_E7_0157, args));
        }
        if (criteriaDomain.isGrossWeightOverflow()) {
            String[] args = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.grossWeight") };
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_E7_0157, args));
        }
        
        for (W2012ListDomain domain : listDomainList) {
            if (FLAG_Y.equals(domain.getWarningFlg())) {
                String[] args = new String[] {"No." + String.valueOf(domain.getNo())};
                warnings.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_W1_0004, args));
            }
        }
        
        if (errors.size() > 0) {
            saveErrors(request, errors);
        }
        if (warnings.size() > 0) {
            addMessages(request, warnings);
        }
    }

}
