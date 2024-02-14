/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_NO_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ORDER_BY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PACKING_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PACKING_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ORDER_BY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
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
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * Super class of action Export Packaging screen
 *
 * @author $Author: DCS
 * @version $Revision: 7765 $
 */
public abstract class W1007AbstractAction extends AbstractAction {

    /**
     * User function use authorization service<br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /** 
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007AbstractAction() {
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
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W1007ActionForm w1007Form = (W1007ActionForm) form;
        // Set the items in the common information screen in the action form.
        // 画面共通項目の取得
        setCommonInfo(w1007Form);
        // Set dropdown 
        searchPullDownList(request, w1007Form.getLanguageCd());
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, String forwardName) {
        ((W1007ActionForm) form).setCallScreenId(SCREEN_ID_W1007);
        controlDisplay((W1007ActionForm) form, request);
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
    protected void setCommonInfo(W1007ActionForm form) {
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        form.setLanguageCd(commonInfo.getLanguageCd());
        form.setOwnerCompCd(commonInfo.getOwnerCompCd());
        form.setLoginUserDscId(commonInfo.getLoginUserDscId());
        form.setUserAuthList(((Eca0027CommonInfoDomain) commonInfo).getUserAuthList());
    }
    /**
     *    The pulldown list displayed on a screen is acquired.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param langCd LANGUAGE CODE<br />言語コード
     * @throws ApplicationException When a pulldown list is unacquirable<br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        // Acquisition of each pulldown list
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> packingList = commonService.searchPullDownList(FUNC_PACKING_STATUS, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        if(packingList != null && packingList.size() > 0){
            for(int i = 0; i < packingList.size(); i++){
                SelectListItemDomain select = packingList.get(i);
                if(i != 0){
                    select.setName(i + " : " + select.getName());
                }
            }
        }
        // Order by
        List<? extends SelectListItemDomain> orderByList = commonService.searchPullDownList(ORDER_BY, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        if(orderByList != null && orderByList.size() > 0){
            orderByList.remove(0);
        }
        
        
        // No of CML
        List<SelectListItemDomain> noOfCMLList = new ArrayList<SelectListItemDomain>();
        for(int i = 1; i < 5; i++){
            if(i != 3){
                SelectListItemDomain attribute = new SelectListItemDomain();
                attribute.setId(String.valueOf(i));
                attribute.setName(String.valueOf(i));
                noOfCMLList.add(attribute);
            }
        }
        // Setting of a request attribute
        // リクエスト属性の設定
        request.setAttribute(ATTR_PACKING_STATUS, packingList);
        request.setAttribute(ATTR_ORDER_BY, orderByList);
        request.setAttribute(ATTR_NO_CML, noOfCMLList);
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
    protected void controlDisplay(W1007ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        if(!enableCreateNew()){
            disableElementList.add("receive");
            disableElementList.add("cancelReceive");
            disableElementList.add("receiveAll");
            disableElementList.add("update");
        }
        if(!enableSearch()){
            disableElementList.add("print_all");
            disableElementList.add("print_inspect_sheet");
            disableElementList.add("printIdTag");
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    /**
     *    The use propriety of the CreateNew button is returned.
     * <br />CreateNewボタンの利用可否を返します。
     *
     * @return If there is one or more W1001R authority, they will be true, otherwise, false.<br />W1001R権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableCreateNew() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W1001R);
    }
    /**
     *    The use propriety of the Search button is returned.
     * <br />Searchボタンの利用可否を返します。
     *
     * @return If there is one or more authority of W1001R or 12001B, they will be true, otherwise, false.<br />W1001RまたはW2001Bの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableSearch() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W1001R, PERMIT_FUNC_ID_W1001B);
    }
}
