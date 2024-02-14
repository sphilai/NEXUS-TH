/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CIGMA_PRDCT_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DNGR_ITEM_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_EXP_REGULATION_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_DISPLAY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9018R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
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
import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public abstract class W9018AbstractAction extends AbstractAction {

     /**
     * Select Condition(Mode:Search)
     */
    protected static final String SELECT_CONDITION_SEARCH = "1";
    
    /**
     * Select Condition(Mode:Add).
     */
    protected static final String SELECT_CONDITION_ADD = "2";
    
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018AbstractAction() {
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
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common items (language code) in Action Form
     * ‐Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for argument classification values:
     *         ‐Transport
     *         ‐containerLoose classification
     *         ‐Freight Res. Cd
     *         ‐Vessel product performance Status
     *         ‐Flag
     *     And then set them in the request attribute pull-down list obtained
     * 
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐輸送手段
     *         ‐コンテナルーズ区分
     *         ‐運賃支払いコード
     *         ‐船積実績ステータス
     *         ‐フラグ
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9018ActionForm w9018Form = (W9018ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w9018Form);
        // Get a pull-down list to be displayed on the screen. 
        // プルダウンリストの設定
        searchPullDownList(request, w9018Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Specification of transition original screen ID
     *     Set the transition source screen ID in Action Form
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        ((W9018ActionForm) form).setCallScreenId(SCREEN_ID_W9018);
        
        controlDisplay((W9018ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9018ActionForm form) {
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param w9018Form form <br />フォーム
     * @throws ApplicationException If can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, W9018ActionForm w9018Form) throws ApplicationException {
        
        String langCd = w9018Form.getLanguageCd();
        String company = "";
        
        List<? extends SelectListItemDomain> expRegList 
            = commonService.searchExpRegulationTypePullDownList(company, true, true);
        List<? extends SelectListItemDomain> dgFlgList 
            = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> cigmaProductsList 
            = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        // UT387
        List<? extends SelectListItemDomain> displayList 
            = commonService.searchPullDownList(CD_TYPE_DISPLAY, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        
        request.setAttribute(ATTR_EXP_REGULATION_TYPE, expRegList);
        request.setAttribute(ATTR_DNGR_ITEM_FLG, dgFlgList);
        request.setAttribute(ATTR_CIGMA_PRDCT_FLG, cigmaProductsList);
        request.setAttribute("display", displayList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9018B authority or W9018R authority there are no such
     *     The non-active the Add button
     * 
     * - W9018R権限またはW9018B権限が1つもない場合
     *     Addボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9018ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        if (!enableRegister()) {
            form.getW9018CriteriaDomain().setDisabledAdd(FLAG_Y);
            disableElementList.add("delete");
            disableElementList.add("clone");
        }
        // Check select condition.
        // Search未選択
        if (!SELECT_CONDITION_SEARCH.equals(form.getW9018CriteriaDomain().getSelectCondition())) {
            // Not SELECT_CONDITION_SEARCH
            disableElementList.add("search");
        }
        // Check select condition.
        // Add未選択
        if (!SELECT_CONDITION_ADD.equals(form.getW9018CriteriaDomain().getSelectCondition())) {
            // Not SELECT_CONDITION_ADD
            disableElementList.add("add");
            // UT387
            // disableElementList.add("w9018CriteriaDomain.fmAplyStrtDt");
            // disableElementList.add("w9018CriteriaDomain.toAplyStrtDt");
            disableElementList.add("w9018CriteriaDomain.expLimitTyp");
            disableElementList.add("w9018CriteriaDomain.dngrItemFlg");
            disableElementList.add("w9018CriteriaDomain.hsCd");
            disableElementList.add("w9018CriteriaDomain.display");
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * Check that the Register Authorization.
     * <br />更新権限を持っているかチェックします。
     *
     * @return true if the Register Authorization have been granted, otherwise return false
     */
    protected boolean enableRegister() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W9018R);
    }
    
    /**
     * <br />Do not overwrite the screen display items in the copy function of the screen common information domain
     * <br />画面共通情報ドメインのコピー関数で画面表示項目を上書きしないようにします。
     * 
     * @param criteriaDomain Criteria Domain
     * @param windowId Window Id
     * @param screenId Screen ID
     */
    protected void prepareBusinessDomain (W9018CriteriaDomain criteriaDomain, String windowId, String screenId) {
        String compCd = criteriaDomain.getCompCd();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, windowId, screenId);
        
        criteriaDomain.setCompCd(compCd);
    }
    /**
     * <br />Add as {@link ActionMessages # GLOBAL_MESSAGE} the specified message
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP Request<br />HTTPリクエスト
     * @param messageId messageId<br />メッセージID
     * @param args messageArgument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
}
