/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7004;
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
import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action for Shipping Actuality Register screen.
 * <br />船積実績Register画面の基底アクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W7004AbstractAction extends AbstractAction {

    /** 
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004AbstractAction() {
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
     *  - Acquisition of common screen information
     *   Set the screen common item (LANGUAGE CODE) in Action Form.
     *  - Get the pull-down list
     *   Call CommonService.searchPullDownList () for the argument classification VALUE following.
     *  - CONTAINER LOOSE TYPE 
     *   And then set them in the request attribute pull-down list obtained.
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐コンテナルーズ区分
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w7004Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w7004Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set transition source SCREEN ID
     *  Set the transition source SCREEN ID in Action Form.
     *
     * - Screen display control
     *  Call the {@link #controlDisplay(W7004ActionForm, HttpServletRequest)}.
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(W7004ActionForm, HttpServletRequest)}を呼び出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W7004ActionForm) form).setCallScreenId(SCREEN_ID_W7004);
        
        controlDisplay((W7004ActionForm) form, request);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />アクション・フォーム
     */
    protected void setCommonInfo(W7004ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException If can not get a pull-down list<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        List<? extends SelectListItemDomain> clList = commonService.searchPullDownList(CD_TYPE_CONTAINER_LOOSE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        
        request.setAttribute(ATTR_CONTAINER_LOOSE_TYP, clList);
    }
    
    /**
     * Add {@link ActionMessages#GLOBAL_MESSAGE}
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param args Message argument
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
    
    /**
     * Make the display control of Progress Control Register screen.
     * <br />進度管理Register画面の表示制御を行います。
     * <pre>
     * - Make the display control of the screens by selecting VALUE of the radio buttons of the search condition.
     * </pre>
     * <pre>
     * ‐検索条件のラジオボタンの選択値によって画面の表示制御を行います。
     * </pre>
     *
     * @param form Action Form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(W7004ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
        
        if(MODE_NEW.equals(criteriaDomain.getProcMode())) {
            disableElementList.add("printClp");
            disableElementList.add("moveToBlUpload");
            disableElementList.add("moveToOtherDocUpload");
            disableElementList.add("cancel");
            disableElementList.add("move");
            disableElementList.add("changeStatus");
        } else {
            disableElementList.add("backToCreate");
            if (FLAG_Y.equals(criteriaDomain.getDisabledFlgForPrintClp())) {
                disableElementList.add("printClp");
            }
            if (FLAG_Y.equals(criteriaDomain.getDisabledFlgForMoveToOtherDocUpload())) {
                disableElementList.add("moveToOtherDocUpload");
            }
        }
        
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
}
