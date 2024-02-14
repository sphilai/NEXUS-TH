/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of a Palletize-Instruction Create screen.
 * <br />梱包指示Create画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W2003AbstractAction extends AbstractAction {

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public W2003AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Acquisition of a screen common information
     *     A screen common items (LANGUAGE CODE) is set to action form.
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2003ActionForm w2003Form = (W2003ActionForm) form;
        
        // Acquisition of a screen common items
        // 画面共通項目の取得
        setCommonInfo(w2003Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Screen fields attributes
     *     Set screen button attributes. Set search-results fields active/inactive.
     *
     * - A setting of call former SCREEN ID
     *     A call former SCREEN ID is set to action form.
     *     
     * - 画面表示制御
     *     ボタンの活性制御、検索結果エリアの表示制御を行う
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

        W2003ActionForm w2003Form = (W2003ActionForm) form;
        
        // Display control
        // 表示制御
        controlDisplay(request, w2003Form);

        // A setting of call former SCREEN ID
        // 呼出し元画面IDの設定
        w2003Form.setCallScreenId(SCREEN_ID_W2003);
    }

    /**
     * Set the item of a screen common information to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2003ActionForm form) {
        
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // A setting of LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Acquire the locale of a screen common information.
     * <br />画面共通情報のロケールを取得します。
     *
     * @param form action form<br />アクションフォーム
     * @return The locale of screen common information<br/>画面共通情報のロケール
     */
    protected Locale getLocale(W2003ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        return commonInfo.getLocale();
    }

    /**
     * Perform display control of a screen.
     * <br />画面の表示制御を行います。
     * 
     * <pre>
     * At the time of the changes from - Header screen and a Register screen
     *       Set search-results fields inactive.
     *
     * - Except the above
     *       Set search-results fields active.
     *       In disabledFlg =='Y', CK is made into non-activity.
     *       InstrQty is made into non-activity when disabledFlg =='N' and instrQty have not been inputted.
     * 
     * - Header画面およびRegister画面からの遷移時
     *     検索結果エリアを非表示にする
     * 
     * - 上記以外
     *     検索結果エリアを表示する
     *     disabledFlg == 'Y'の場合、CKを非活性にする
     *     disabledFlg == 'N'かつinstrQtyが未入力の場合、InstrQtyを非活性にする
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param form action form<br />アクション・フォーム
     */
    protected void controlDisplay(HttpServletRequest request, W2003ActionForm form) {
        // call former screen
        // 呼出し元画面
        String callScreenId = form.getCallScreenId();
        
        // At the time of the changes from a Header screen or a Register screen
        // Header画面またはRegister画面からの遷移時
        if (SCREEN_ID_W2002.equals(callScreenId) || SCREEN_ID_W2004.equals(callScreenId)) {
            form.setDisplayList(false);
        
        // Other
        // それ以外
        } else {
            form.setDisplayList(true);

            List<String> disableList = new ArrayList<String>();
            
            // Set CK, QUANTITY attributes.
            // CK、数量の活性制御
            List<? extends W2003ListDomain> listDomainList = form.getListDomainList();
            if (!CollectionUtils.isEmpty(listDomainList)) {
                for (int i = 0; i < listDomainList.size(); i++) {
                    boolean isDisabled = FLAG_Y.equals(listDomainList.get(i).getDisabledFlg());
                    boolean isSelected = CHECK_ON.equals(listDomainList.get(i).getSelected());
                    boolean isInstrQtyEmpty = StringUtils.isEmpty(listDomainList.get(i).getInstrQty());

                    // Un-active in a check box, when registered.
                    // 登録済みの場合、チェックボックスを非活性
                    if (isDisabled) {
                        disableList.add(String.format("listDomainList[%d].selected", i));
                    }
                    
                    // Un-active in InstrQty, when this is unregistered and InstrQty has not been inputted.
                    // 未登録でInstrQtyが未入力の場合、InstrQtyを非活性
                    if (!isDisabled && !isSelected && isInstrQtyEmpty) {
                        disableList.add(String.format("listDomainList[%d].instrQty", i));
                    }
                }
            }
            
            // Setting of an un-active item
            // 非活性項目の設定
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
        }
    }
    
    /**
     * Add the specified message as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId message id <br />メッセージID
     * @param args message argument<br />メッセージ引数
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
