/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2004;
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
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * This is a base action class of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面の基底アクションクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 10497 $
 */
public abstract class W2004AbstractAction extends AbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004AbstractAction() {
        super();
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
     * <pre>
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     *
     * - Set transition original screen id
     *       The SCREEN ID ({@link W2004ActionForm#fromScreenId}) of a changing agency is set to action form.
     *
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *
     * - 遷移元画面の設定
     *     アクション・フォームに遷移元の画面ID({@link W2004ActionForm#fromScreenId})を設定する
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2004Form);
        
        // Set transition original screen id
        // 遷移元画面の設定
        setFromScreenId(w2004Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Screen fields attributes
     *       Set screen field and button attributes.
     *
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     * 
     * 
     * - 画面表示制御
     *     ボタンおよび入力項目の活性制御を行う
     *     
     * - 呼出し元画面IDの設定
     *     アクション・フォームに呼出し元画面IDを設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(request, w2004Form);
        
        // Set transition original screen id
        // 呼出し元画面IDの設定
        w2004Form.setCallScreenId(SCREEN_ID_W2004);
    }

    /**
     *    A Transition original screen is set as action form.
     * <br />遷移元画面をアクションフォームに設定します。
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void setFromScreenId(W2004ActionForm form) {
        if (!SCREEN_ID_W2004.equals(form.getCallScreenId())) {
            form.setFromScreenId(form.getCallScreenId());
        }
    }
    
    /**
     *    The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2004ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Perform display control of a screen item.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * From - Main screen to the time of changes
     *       The following items are made into non-activity.
     *         - BackToCreate button
     *         - Delete check box
     *         - Delete button
     *         - Register button
     *         - PrintInstr button (when there is no update authority of a Packaging Instruction (=Pull))  
     *         - Cancel button (when there is no update authority of a Packaging Instruction (=Pull))
     *         - PirntCmlForInstr (when any update authority of a Packaging Instruction (=Pull) and CML cannot be found)  
     *
     * From - Create screen to the time of changes
     *       The following items are made into non-activity.
     *         - PrintInstr button
     *         - Cancel button
     *         - Print CML for Instr button
     * 
     * 
     * - Main画面から遷移時
     *     以下の項目を非活性にする
     *       - BackToCreateボタン
     *       - Deleteチェックボックス
     *       - Deleteボタン
     *       - Registerボタン
     *       - PrintInstrボタン (梱包指示の更新権限がない場合)
     *       - Cancelボタン (梱包指示の更新権限がない場合)
     *       - PirntCmlForInstr (梱包指示、CMLいずれの更新権限もない場合)
     *       
     * - Create画面から遷移時
     *     以下の項目を非活性にする
     *       - PrintInstrボタン
     *       - Cancelボタン
     *       - Print CML for Instrボタン
     * </pre>
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     */
    protected void controlDisplay(HttpServletRequest request, W2004ActionForm form) {
        // List of un-active items
        // 非活性項目のリスト
        List<String> disableList = new ArrayList<String>();
        
        if (SCREEN_ID_W2001.equals(form.getFromScreenId())) {
            List<? extends W2004ListDomain> listDomainList = form.getListDomainList();
            if (listDomainList != null){
                disableList.add("backToCreate");
                disableList.add("delete");
                disableList.add("register");
                if (!enablePrintInstr(form)) {
                    disableList.add("printInstr");
                }
                if (!enableCancel(form)) {
                    disableList.add("cancel");
                }
                if (!enablePrintCmlForInstr(form)) {
                    disableList.add("printCmlForInstr");
                }
//            List<? extends W2004ListDomain> listDomainList = form.getListDomainList();
                if (listDomainList != null) {
                    for (int i = 0; i < listDomainList.size(); i++) {
                        disableList.add(String.format("listDomainList[%d].selected", i));
                    }
                }
            }
        } else {
            disableList.add("printInstr");
            disableList.add("cancel");
            disableList.add("printCmlForInstr");
        }
        
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }

    /**
     *    The use propriety of the PrintCmlForInstr button is returned.
     * <br />PrintCmlForInstrボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2001R authority or W2009R authority, they will be true, otherwise, false.<br />W2001R権限またはW2009R権限があればtrue、そうでなければfalse
     */
    protected boolean enablePrintCmlForInstr(W2004ActionForm form) {
        try {
            // Acquisition of COMPANY CODE, and a factory code
            // 会社コード、工場コードの取得
            String shipperCd = form.getW2004CriteriaDomain().getShipperCd();
            String plntCd = form.getW2004CriteriaDomain().getPlntCd();
            
            // Packaging Instruction (=Pull), the existence of the update authority of CML
            // 梱包指示、CMLの更新権限の有無
            boolean hasPltzInstrR = userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2001R, shipperCd, plntCd);
            boolean hasCmlR = userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2009R, shipperCd, plntCd);
            
            return hasPltzInstrR || hasCmlR;
        } catch (ApplicationException e) {
            return false;
        }
    }

    /**
     *    The use propriety of the Cancel button is returned.
     * <br />Cancelボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2001R authority over the Packaging Instruction (=Pull) selected on the Main screen, they will be true, otherwise, false.<br />Main画面で選択された梱包指示に対するW2001R権限があればtrue、そうでなければfalse
     */
    protected boolean enableCancel(W2004ActionForm form) {
        return enablePrintInstr(form);
    }
    
    /**
     *    The use propriety of the PrintInstr button is returned.
     * <br />PrintInstrボタンの利用可否を返します。
     *
     * @param form Action form<br />アクションフォーム
     * @return If there is W2001R authority over the Packaging Instruction (=Pull) selected on the Main screen, they will be true, otherwise, false.<br />Main画面で選択された梱包指示に対するW2001R権限があればtrue、そうでなければfalse
     */
    protected boolean enablePrintInstr(W2004ActionForm form) {
        try {
            // Acquisition of COMPANY CODE, and a factory code
            // 会社コード、工場コードの取得
            String shipperCd = form.getW2004CriteriaDomain().getShipperCd();
            String plntCd = form.getW2004CriteriaDomain().getPlntCd();
            
            // Authority check
            // 権限チェック
            return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2001R, shipperCd, plntCd);
        } catch (ApplicationException e) {
            return false;
        }
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
     *    The specified PDF list is saved in the general-purpose area of a screen information domain.
     * <br />指定されたPDF帳票を画面情報ドメインの汎用エリアに保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param report PDF list<br />PDF帳票
     */
    protected void saveReport(W2004ActionForm form, File report) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2004);
        
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
    protected File getReport(W2004ActionForm form) {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2004);

        // Acquisition of PDF list
        // PDF帳票の取得
        File report = screenInfo.getGeneralArea("report");
        
        // Clearance of area in general
        // 汎用エリアのクリア
        screenInfo.setGeneralArea("report", null);
        
        return report;
    }
}
