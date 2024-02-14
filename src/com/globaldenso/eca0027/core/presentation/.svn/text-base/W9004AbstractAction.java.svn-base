/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_COMP_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9004;
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
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * Super class of action User ID MA Inquiry screen
 * <br />User ID MA Inquiry画面の基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W9004AbstractAction extends AbstractAction {

    /**
     * User function use authorization service<br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     *Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W9004AbstractAction() {
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9004ActionForm w9004Form = (W9004ActionForm) form;
        // Set the items in the common information screen in the action form.
        // 画面共通項目の取得
        setCommonInfo(w9004Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        ((W9004ActionForm) form).setCallScreenId(SCREEN_ID_W9004);
        controlDisplay((W9004ActionForm) form, request);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - Have no role of area administrator and have no role of company administrator and plant administrator for owner company.
     *    Does not display this screen and move to User ID MA Edit screen.
     * - Have no role of area administrator and have no role of company administrator 
     *    Non-activate Add / Delete button.
     * </pre>
     * <pre>
     * - 地域管理者権限を保有しない、
     *   かつ、自分の責任会社の会社管理者権限・工場管理者権限を保有しない場合、
     *   本画面は表示せず、User ID MA Edit画面に遷移
     * - 地域管理者権限・会社管理者権限を保有しない場合、Add/Deleteボタンを非活性
     * </pre>
     * 
     * @param form Action form <br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W9004ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        boolean roleAreaAdmin = userAuthService.hasRole(ROLE_AREA_ADMIN);
        
        if (!roleAreaAdmin && !hasRoleForCompany(ROLE_COMP_ADMIN, form.getOwnerCompCd(), form.getUserAuthList())) {
            disableElementList.add("add");
            disableElementList.add("delete");
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
    
    /**
     * Check the roll have been granted to the logged-in user
     * <br />ログインユーザに指定した会社に対するロールを持っているかチェックします。
     * 
     * @param role role
     * @param compCd company code
     * @param userAuthList Use Auth Config List
     * @return true if the roll have been granted, otherwise return false
     */
    protected boolean hasRoleForCompany (String role, String compCd, List<? extends UserAuthDomain> userAuthList) {
        for (UserAuthDomain userAuthDomain : userAuthList) {
            if (userAuthDomain.getRole().equals(role) && userAuthDomain.getAuthMgtComp().equals(compCd)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Set the items in the common information screen in the action form.<br />
     * アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W9004ActionForm form) {
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        form.setLanguageCd(commonInfo.getLanguageCd());
        form.setOwnerCompCd(commonInfo.getOwnerCompCd());
        form.setLoginUserDscId(commonInfo.getLoginUserDscId());
        form.setUserAuthList(((Eca0027CommonInfoDomain) commonInfo).getUserAuthList());
    }
}
