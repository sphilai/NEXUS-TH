/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_COMP_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9005CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class of action User ID MA Edit screen.
 * <br />User ID MA Edit画面の基底アクションクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6762 $
 */
public abstract class W9005AbstractAction extends AbstractAction {

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9005AbstractAction() {
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
     * 
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common items (language code) in Action Form
     * ‐Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for argument classification values:
     *         ‐Flag
     *     And then set them in the request attribute pull-down list obtained
     * 
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐フラグ
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9005ActionForm W9005Form = (W9005ActionForm)form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(W9005Form);

        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     *  - Specification of transition original screen ID
     *     Set the transition source screen ID in Action Form
     *  - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        ((W9005ActionForm) form).setCallScreenId(SCREEN_ID_W9005);
        controlDisplay((W9005ActionForm) form, request);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9005ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
        form.setUserAuthList(((Eca0027CommonInfoDomain) commonInfo).getUserAuthList());
    }

    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * 
     * <pre>
     * - If W9004B authority or W9004R authority there are no such
     *     The inactive the Register button
     * - W9004R権限またはW9004B権限が1つもない場合
     *     Registerボタンを非活性
     * </pre>
     * 
     * @param form Action Form <br />アクションフォーム
     * @param request HTTP request <br />HTTPリクエスト
     */
    protected void controlDisplay(W9005ActionForm form, HttpServletRequest request) {

        W9005CriteriaDomain criteriaDomain = form.getW9005CriteriaDomain();
        if (MODE_NEW.equals(criteriaDomain.getFunctionNo())) {
            form.getW9005CriteriaDomain().setProcMode(MODE_NEW);
            
            criteriaDomain.setEnabledDscId(true);
            criteriaDomain.setEnabledUsrNmEn(true);
            criteriaDomain.setEnabledMailAdd1(true);
            criteriaDomain.setEnabledCompCd(true);
            criteriaDomain.setEnabledBackToInquiry(true);
            
        } else if (MODE_EDIT_REF.equals(criteriaDomain.getFunctionNo())) {
            if(!form.getW9005CriteriaDomain().getLoginUserDscId().equals(form.getW9005CriteriaDomain().getDscId())){
                form.getW9005CriteriaDomain().setProcMode(MODE_EDIT);
                criteriaDomain.setEnabledDscId(false);
                
                if (userAuthService.hasRole(ROLE_AREA_ADMIN) 
                    || hasRoleForCompany(ROLE_COMP_ADMIN, criteriaDomain.getCompCd(), form.getUserAuthList())) {
                    criteriaDomain.setEnabledUsrNmEn(true);
                    criteriaDomain.setEnabledMailAdd1(true);
                } else {
                    criteriaDomain.setEnabledUsrNmEn(false);
                    criteriaDomain.setEnabledMailAdd1(false);
                }
                criteriaDomain.setEnabledCompCd(false);
                
            }else{
                form.getW9005CriteriaDomain().setProcMode(MODE_REF);
                
                criteriaDomain.setEnabledDscId(false);
                criteriaDomain.setEnabledUsrNmEn(false);
                criteriaDomain.setEnabledMailAdd1(false);
                criteriaDomain.setEnabledCompCd(false);
            }
            criteriaDomain.setEnabledBackToInquiry(true);
            
        }else if (MODE_REF.equals(criteriaDomain.getFunctionNo())) {
            form.getW9005CriteriaDomain().setProcMode(MODE_REF);
            
            criteriaDomain.setEnabledDscId(false);
            criteriaDomain.setEnabledUsrNmEn(false);
            criteriaDomain.setEnabledMailAdd1(false);
            criteriaDomain.setEnabledCompCd(false);
            criteriaDomain.setEnabledBackToInquiry(false);
        }
    }
    /**
     * Add {@link ActionMessages#GLOBAL_MESSAGE}
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTPリクエスト
     * @param messageId メッセージID
     * @param args メッセージ引数
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
}
