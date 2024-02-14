/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.util.CheckUtil.isBlankOrNull;

import java.io.File;
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
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The base action class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面の基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public abstract class W2008AbstractAction extends AbstractAction {

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
    public W2008AbstractAction() {
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
     * 
     * <pre>
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Get screen common items
        // 画面共通項目の取得
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        
        setCommonInfo(w2008Form);
        
        // Set transition original screen id
        // 遷移元画面の設定
        setFromScreenId(w2008Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     * 
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        // Get screen common items
        // 画面共通項目の取得
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2008Form, request);

        ((W2008ActionForm) form).setCallScreenId(SCREEN_ID_W2008);
    }
    
    /**
     * The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2008ActionForm form) {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // Date format
        // 日付フォーマット
        form.getW2008CriteriaDomain().setDateFormat(commonInfo.getScreenDateFormat());
    }
    
    /**
     * A Transition original screen is set as action form.
     * <br />遷移元画面をアクションフォームに設定します。
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void setFromScreenId(W2008ActionForm form) {
        if (!SCREEN_ID_W2008.equals(form.getCallScreenId())) {
            form.setFromScreenId(form.getCallScreenId());
        }
    }
    
    /**
     * Display control of a screen item is performed.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * From - Main screen to the time of changes
     *       The following items are made into non-activity.
     *         - BackToCreate button
     *         - Delete button
     *         - Register button
     *         - Ignore Warnings check box
     *         - Print Tag button (when there is no update authority)  
     *         - Cancel button (when there is no update authority)
     *         - Delete check box
     *
     * From - Create screen to the time of changes
     *       The following items are made into non-activity.
     *         - Print Tag button
     *         - Cancel button
     * 
     * 
     * - Main画面から遷移時
     *     以下の項目を非活性にする
     *       - BackToCreateボタン
     *       - Deleteボタン
     *       - Registerボタン
     *       - Ignore Warningsチェックボックス
     *       - Print Tagボタン (更新権限がない場合)
     *       - Cancelボタン (更新権限がない場合)
     *       - Deleteチェックボックス
     *       
     * - Create画面から遷移時
     *     以下の項目を非活性にする
     *       - Print Tagボタン
     *       - Cancelボタン
     * </pre>
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2008ActionForm form, HttpServletRequest request) {

        // Control of a button
        // ボタンの制御
        List<String> disableList = new ArrayList<String>();
        
        if (SCREEN_ID_W2005.equals(form.getCallScreenId())) {
            disableList.add("backToCreate");
            disableList.add("delete");
            disableList.add("register");
            disableList.add("w2008CriteriaDomain.ignoreWarnings");
            if (!enableCancelAndPrintButton(form)) {
                disableList.add("printTag");
                disableList.add("cancel");
            }
            
            List<? extends W2008ListDomain> listDomainList = form.getListDomainList();
            if(listDomainList != null && 0 < listDomainList.size()){
                for (int i = 0; i < listDomainList.size(); i++) {
                    disableList.add(String.format("listDomainList[%d].selected", i));
                }
            }
        } else {

            // Changes from a Main screen (from W2018 to changes)  
            // Main画面からの遷移(W2018から遷移)
            if(!isBlankOrNull(form.getMixTagNo())){
                disableList.add("backToCreate");
                disableList.add("delete");
                disableList.add("register");
                disableList.add("w2008CriteriaDomain.ignoreWarnings");
                if (!enableCancelAndPrintButton(form)) {
                    disableList.add("printTag");
                    disableList.add("cancel");
                }
                List<? extends W2008ListDomain> listDomainList = form.getListDomainList();
                if(listDomainList != null && 0 < listDomainList.size()){
                    for (int i = 0; i < listDomainList.size(); i++) {
                        disableList.add(String.format("listDomainList[%d].selected", i));
                    }
                }
            // Changes from a Create screen
            // Create画面からの遷移
            }else{
                disableList.add("printTag");
                disableList.add("cancel");
                
                if (form.getW2008CriteriaDomain().isNetWeightOverflow()
                    || form.getW2008CriteriaDomain().isGrossWeightOverflow()) {
                    disableList.add("register");
                }
            }
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);

    }
    
    /**
     * The use propriety of Cancel and the Print Tag button is returned.
     * <br />Cancel、Print Tagボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2005R authority, they will be true, otherwise, false.<br />W2005R権限があればtrue、そうでなければfalse
     */
    protected boolean enableCancelAndPrintButton(W2008ActionForm form) {
        
        List<? extends W2008ListDomain> listDomainList = (List<? extends W2008ListDomain>)form.getListDomainList();
        
        if(listDomainList != null && 0 < listDomainList.size()){
            for (W2008ListDomain listDomain : listDomainList){
                if (AUTH_REGISTER_NUMERIC.compareTo(listDomain.getAuthFlg()) != 0 ){
                    return false;
                }
            }
        }
        
        return true;

    }
    
    /**
     * The specified PDF list is saved in the general-purpose area of a screen information domain.
     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param report PDF list<br />PDF帳票
     */
    protected void saveReport(W2008ActionForm form, File report) {
        
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2008);
        
        // Preservation of PDF list
        // PDF帳票の保存
        screenInfo.setGeneralArea("report", report);
    }
    
    /**
     * The PDF list saved in the general-purpose area of the screen information domain is acquired.
     * <br />画面情報ドメインの汎用エリアに保存されているPDF帳票を取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return PDF list<br />PDF帳票
     */
    protected File getReport(W2008ActionForm form) {
        
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2008);

        // Acquisition of PDF list
        // PDF帳票の取得
        File report = screenInfo.getGeneralArea("report");
        
        // Clearance of area in general
        // 汎用エリアのクリア
        screenInfo.setGeneralArea("report", null);
        
        return report;
    }
    
    /**
     * The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId HTTP request<br />メッセージID
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
    protected void saveWarnigMsges(HttpServletRequest request, ActionMapping mapping, List<? extends W2008ListDomain> listDomainList,
        W2008CriteriaDomain criteriaDomain) {

        ActionMessages errors = new ActionMessages();
        ActionMessages warnings = new ActionMessages();
        
        if (criteriaDomain.isNetWeightOverflow()) {
            String[] args = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.netWeight") };
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_E7_0157, args));
        }
        if (criteriaDomain.isGrossWeightOverflow()) {
            String[] args = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.grossWeight") };
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_E7_0157, args));
        }
        
        for (W2008ListDomain domain : listDomainList) {
            if (FLAG_ON.equals(domain.getWarningFlg())) {
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
