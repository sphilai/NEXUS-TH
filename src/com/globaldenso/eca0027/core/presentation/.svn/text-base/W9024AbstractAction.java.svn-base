/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9024;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;
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
import com.globaldenso.eca0027.core.business.domain.W9024CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * Base action class of the Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面の基底アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W9024AbstractAction extends AbstractAction {

    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9024AbstractAction() {
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
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common items (language code) in Action Form
     * ‐Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for argument classification values:
     *         ‐Transport
     *     And then set them in the request attribute pull-down list obtained
     * 
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐輸送手段
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9024ActionForm w9024Form = (W9024ActionForm) form;
        
        // Get of common entry screen.
        // 画面共通項目の取得
        setCommonInfo(w9024Form);
        
        // Setting of the pull-down list.
        // プルダウンリストの設定
        searchPullDownList(request, w9024Form.getLanguageCd());
        
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
        
        ((W9024ActionForm) form).setCallScreenId(SCREEN_ID_W9024);
        
        controlDisplay((W9024ActionForm) form, request);
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9024ActionForm form) {
        
        // Get of screen common information domain.
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        //setting the language code.
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param langCd Language code <br />言語コード
     * @throws ApplicationException can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        
        // Acquisition of each pull-down list.
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> transList = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_TRANS_CD, transList);
    }

    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If Company(input) don't have the Register Auth, change Register button to Non-Acctive.
     * 
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9024ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        if (!form.getW9024CriteriaDomain().isUserAuthForComp()) {
            disableElementList.add("register");
            disableElementList.add("w9024CriteriaDomain.ignoreWarnings");
            disableElementList.add("w9024CriteriaDomain.rev");
        }
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * do not overwrite the screen display item with a copy of the screen function common information domain
     * <br />画面共通情報ドメインのコピー関数で画面表示項目を上書きしないようにします。
     * 
     * @param criteriaDomain Criteria Domain
     * @param windowId Window Id
     * @param screenId Screen ID
     */
    protected void prepareBusinessDomain (W9024CriteriaDomain criteriaDomain, String windowId, String screenId) {
        // Saves the screen the same name and properties common information domain.
        // 画面共通情報ドメインと同名プロパティを退避
        String compCd = criteriaDomain.getCompCd();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, windowId, screenId);
        
        criteriaDomain.setCompCd(compCd);
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
    }
    
    /**
     * Add the specified message to {@link ActionMessages#GLOBAL_MESSAGE}.
     * 
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param args Message argument
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Add Message
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Register GLOBAL_MESSAGE
        addMessages(request, messages);
    }
}
