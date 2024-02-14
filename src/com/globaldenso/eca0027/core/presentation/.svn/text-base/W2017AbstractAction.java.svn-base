/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2014;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2017;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

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
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The base action class of X-Tag Register
 * <br />X-Tag Register画面の基底アクションクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public abstract class W2017AbstractAction extends AbstractAction {

    /**
     * constructor.
     */
    public W2017AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Acquisition of a screen common information
     *       In action form
     *         - Screen common items (LANGUAGE CODE)  
     *         - A login user's WEIGHT UNIT
     *         - A login user's WEIGHT-UNIT notation
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに
     *       - 画面共通項目(言語コード)
     *       - ログインユーザーの重量単位
     *       - ログインユーザーの重量単位表記
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2017Form);
        
        // Set transition original screen id
        // 遷移元画面の設定
        setFromScreenId(w2017Form);
        
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
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2017Form, request);
        
        // Set transition original screen id
        // 呼出し元画面IDの設定
        ((W2017ActionForm) form).setCallScreenId(SCREEN_ID_W2017);
    }

    /**
     * A Transition original screen is set as action form.
     * <br />遷移元画面をアクションフォームに設定します。
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void setFromScreenId(W2017ActionForm form) {
        if (!SCREEN_ID_W2017.equals(form.getCallScreenId())) {
            form.setFromScreenId(form.getCallScreenId());
        }
    }
    
    /**
     *    The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2017ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // The WEIGHT UNIT of login user is set up.
        // ログインユーザーの重量単位を設定
        form.getW2017CriteriaDomain().setWeightUnit(commonInfo.getWeightUnit());
        
        // The WEIGHT-UNIT notation of login user is set up.
        // ログインユーザーの重量単位表記を設定
        form.getW2017CriteriaDomain().setWeightUnitDisplay(commonInfo.getWeightUnitDisp());
        
        // The WEIGHT-UNIT notation of login user is set up.
        // ログインユーザーの重量単位表記を設定
        form.getW2017CriteriaDomain().setWeightUnitDisplayDtlTitle(commonInfo.getWeightUnitDisp());
        
        // The capacity unit of login user is set up.
        // ログインユーザーの容量単位を設定
        form.getW2017CriteriaDomain().setVolumeUnit(commonInfo.getVolumeUnit());
        
        // The capacity UNIT DISPLAY of login user is set up.
        // ログインユーザーの容量単位表記を設定
        form.getW2017CriteriaDomain().setVolumeUnitDisplay(commonInfo.getVolumeUnitDisp());
        
        // A login user name is set up.
        // ログインユーザー名を設定
        form.getW2017CriteriaDomain().setXtagPackingIssuerNm(commonInfo.getUsrNmEn());
        
        // Date format (for screen display)  
        // 日付フォーマット (画面表示用)
        form.getW2017CriteriaDomain().setDateFormat(commonInfo.getScreenDateFormat());
        
        // SERVER ID
        // サーバーID
        form.getW2017CriteriaDomain().setServerId(commonInfo.getServerId());
    }
    
    /**
     * Perform display control of a screen item.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * The time of changes from - Main screen, or after Register button depression
     *       The following items are made into non-activity.
     *         - Outer CD item
     *         - Select button
     *         - BackToCreate button
     *         - Delete button
     *         - Register button
     *         - PrintTag button (when there is no update authority)
     *         - Cancel button (when there is no update authority)
     *         - Delete check box
     *
     * From - Create screen to the time of changes
     *       The following items are made into non-activity.
     *         - PrintTag button
     *         - Cancel button
     * 
     * 
     * - Main画面から遷移時、または、Registerボタン押下後
     *     以下の項目を非活性にする
     *       - Outer CD項目
     *       - Selectボタン
     *       - BackToCreateボタン
     *       - Deleteボタン
     *       - Registerボタン
     *       - PrintTagボタン (更新権限がない場合)
     *       - Cancelボタン (更新権限がない場合)
     *       - Deleteチェックボックス
     *       
     * - Create画面から遷移時
     *     以下の項目を非活性にする
     *       - PrintTagボタン
     *       - Cancelボタン
     * </pre>
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W2017ActionForm form, HttpServletRequest request) {
        // List of un-active items
        // 非活性項目のリスト
        List<String> disableList = new ArrayList<String>();
        
        if (SCREEN_ID_W2014.equals(form.getFromScreenId())) {
            disableList.add("w2017CriteriaDomain.outerPkgCd");
            disableList.add("select");
            disableList.add("backToCreate");
            disableList.add("delete");
            disableList.add("register");
            
            List<? extends W2017ListDomain> listDomainList = form.getW2017ListDomainList();
            if (listDomainList != null) {
                if (!enable(form)) {
                    disableList.add("printTag");
                    disableList.add("cancel");
                }
                for (int i = 0; i < listDomainList.size(); i++) {
                    disableList.add(String.format("w2017ListDomainList[%d].selected", i));
                }
                form.setDisplayList(true);
            } else {
                form.setDisplayList(false);
            }
        } else {
            form.setDisplayList(true);
            disableList.add("printTag");
            disableList.add("cancel");
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }

    /**
     *    The PrintTag button and the use propriety of Cancel are returned.
     * <br />PrintTagボタン、Cancelの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If all the details of W2014ListDomain have update authority, they will be true, otherwise, false.<br />W2014ListDomainの全ての明細に更新権限があればtrue、そうでなければfalse
     */
    protected boolean enable(W2017ActionForm form) {
        
        List<? extends W2017ListDomain> listDomainList = form.getW2017ListDomainList();
        
        if (listDomainList != null) {
            for (W2017ListDomain listDomain : listDomainList){
                if (AUTH_REGISTER_NUMERIC.compareTo(listDomain.getAuth()) != 0 ){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    /**
     *    The specified PDF list is saved in the general-purpose area of a screen information domain.
     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param report PDF list<br />PDF帳票
     */
    protected void saveReport(W2017ActionForm form, File report) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2017);
        
        // Preservation of PDF list
        // PDF帳票の保存
        screenInfo.setGeneralArea("report", report);
    }
    
    /**
     *    The PDF list saved in the general-purpose area of the screen information domain is acquired.
     * <br />画面情報ドメインの汎用エリアに保存されているPDF帳票を取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return PDF list<br />PDF帳票
     */
    protected File getReport(W2017ActionForm form) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2017);

        // Acquisition of PDF list
        // PDF帳票の取得
        File report = screenInfo.getGeneralArea("report");
        
        // Clearance of area in general
        // 汎用エリアのクリア
        screenInfo.setGeneralArea("report", null);
        
        return report;
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
}
