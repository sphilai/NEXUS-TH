/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FUNCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FUNCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9002R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9002;
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
 * Base action class of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面の基底アクションクラスです。
 * 
 * @version $Revision: 7765 $
 */
public abstract class W9002AbstractAction extends AbstractAction {

    
    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;

    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタ。
     */
    public W9002AbstractAction() {
        super();
    }

    /**
     * Setter method of common services.
     * <br />共通サービス のセッターメソッドです。
     *
     * @param commonService set to common service<br />
     * 共通サービス に設定する
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
     * <pre>
     * - Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form
     *     
     * - Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for the argument classification VALUE following
     *         - Agent Company requesting function
     *     And then set them in the request attribute pull-down list obtained
     * </pre>
     * <pre>
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         - 代行会社依頼機能
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W9002ActionForm w9002Form = (W9002ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w9002Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w9002Form.getLanguageCd());
        
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W9002ActionForm) form).setCallScreenId(SCREEN_ID_W9002);
        
        controlDisplay((W9002ActionForm) form, request);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9002B authority or W9002R authority there are no such
     *     The non-active the Add button
     * </pre>
     * <pre>
     * - W9002R権限またはW9002B権限が1つもない場合
     *     Addボタンを非活性
     * </pre>
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W9002ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        if (!userAuthService.hasRegisterAll()) {
            if (!enableAdd()) {
                disableElementList.add("add");
                disableElementList.add("delete");
            }
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * Return the availability of the Add button.
     * <br />Addボタンの利用可否を返します。
     *
     * @return True, false and otherwise be one or more privileges or W9002B W9002R<br />
     * W9002RまたはW9002Bの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableAdd() {
        return !userAuthService.getUserAuthList(PERMIT_FUNC_ID_W9002R).isEmpty();
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
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W9002ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />
     * 言語コード
     * @throws ApplicationException If can not get a pull-down list<br />
     * プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Get a list of pull-down from the Code Master.
        // Functionプルダウンリストの取得
        List<? extends SelectListItemDomain> functionList = commonService.searchPullDownList(CD_TYPE_FUNCTION, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        
        request.setAttribute(ATTR_FUNCTION, functionList);
    }
}
