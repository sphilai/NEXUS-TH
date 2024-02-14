/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2017;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of X-Tag Create
 * <br />X-Tag Create画面の基底アクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W2016AbstractAction extends AbstractAction {

    /**
     * constructor.
     */
    public W2016AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Acquisition of a screen common information
     *       A screen common items is set to action form.
     *         - LANGUAGE CODE
     *         - A login user's WEIGHT UNIT
     *         - A login user's WEIGHT-UNIT notation
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目を設定する。
     *       - 言語コード
     *       - ログインユーザーの重量単位
     *       - ログインユーザーの重量単位表記
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2016ActionForm W2016Form = (W2016ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(W2016Form);
        
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

        W2016ActionForm w2016Form = (W2016ActionForm) form;
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2016Form, request);
        
        // Set transition original screen id
        // 呼出し元画面IDの設定
        ((W2016ActionForm) form).setCallScreenId(SCREEN_ID_W2016);
    }
    /**
     * The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2016ActionForm form) {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // The WEIGHT UNIT of login user is set up.
        // ログインユーザーの重量単位を設定
        form.getW2016CriteriaDomain().setWeightUnit(commonInfo.getWeightUnit());
        
        // The WEIGHT-UNIT notation of login user is set up.
        // ログインユーザーの重量単位表記を設定
        form.getW2016CriteriaDomain().setWeightUnitDisplay(commonInfo.getWeightUnitDisp());
    }
    
    /**
     *  The locale of a screen common information is acquired.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form Action form<br />アクションフォーム
     * @return The locale of a screen common information<br />画面共通情報のロケール
     */
    protected Locale getLocale(W2016ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
    }
    
    /**
     * Display control of a screen is performed.
     * <br />画面の表示制御を行います。
     * <pre>
     * At the time of the changes from - Header screen
     *       Set search-results fields inactive.
     *
     * - Except the above
     *       Set search-results fields active.
     *       In disabledFlg =='Y', CK is made into non-activity.
     * 
     * 
     * - Header画面からの遷移時
     *     検索結果エリアを非表示にする
     * 
     * - 上記以外
     *     検索結果エリアを表示する
     *     disabledFlg == 'Y'の場合、CKを非活性にする
     * </pre>
     * 
     * @param form <br />アクション・フォーム
     * @param request <br />HTTPリクエスト
     */
    protected void controlDisplay(W2016ActionForm form, HttpServletRequest request) {
        // At the time of the changes from a Header screen
        // Header画面からの遷移時
        if (SCREEN_ID_W2015.equals(form.getCallScreenId()) || SCREEN_ID_W2017.equals(form.getCallScreenId())) {
            form.setDisplayList(false);
            
        // Other than this
        // それ以外
        } else {
            if (form.getW2016ListDomainList() == null) {
                form.setDisplayList(false);
            } else {
                form.setDisplayList(true);

                List<String> disableList = new ArrayList<String>();

                // Set CK attributes.
                // CKの活性制御
                List<? extends W2016ListDomain> listDomainList = form.getW2016ListDomainList();
                if (!CollectionUtils.isEmpty(listDomainList)) {
                    for (int i = 0; i < listDomainList.size(); i++) {
                        if (FLAG_Y.equals(listDomainList.get(i).getDisabledFlg())) {
                            disableList.add(String.format("w2016ListDomainList[%d].selected", i));
                            
                            // // Setting of a check box
                            // チェックボックスの設定
                            listDomainList.get(i).setSelected(CHECK_ON);
                        }
                    }
                }

                // Setting of an un-active item
                // 非活性項目の設定
                request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
            }
        }
    }
    
    /**
     * The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
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
