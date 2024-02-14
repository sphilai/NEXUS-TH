/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9025;
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
import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;


/**
 * The base action class of Registration Screen of Actual Item Weight.
 * <br />実測製品重量登録画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public abstract class W9025AbstractAction extends AbstractAction {

    /**
     * commonService/共通サービス
     */
    private CommonService commonService;

    /**
     * <p>
     * Default constructor./デフォルトコンストラクタ。
     * </p>
     */
    public W9025AbstractAction() {
        super();
    }
    
   
    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
   
    /**
     * {@inheritDoc}
     * <pre>
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Get screen common items.
     *     A screen common item (language code) is set as action form. 
     * - Set the pull-down list
     *     The following classification value is made into an argument 
     *     and CommonService.searchPullDownList() is called. 
     *         -Unit of Weight
     * - The acquired pulldown list is set as a request attribute. 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの設定
     *    次の区分値を引数にCommonService.searchPullDownList()を呼び出す。
     *       - Unit of Weight
     * - 取得したプルダウンリストをリクエスト属性に設定する。
     * </pre>
     *  
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W9025ActionForm w9025Form = (W9025ActionForm) form;
        
        // Get of common entry screen.
        // 画面共通情報の設定
        setCommonInfo(w9025Form);
        
        // Setting of the pull-down list.
        // プルダウンリストの設定
        searchPullDownList(request, w9025Form.getLanguageCd());

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
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W9025ActionForm) form).setCallScreenId(SCREEN_ID_W9025);
        
        controlDisplay((W9025ActionForm) form, request);
        
    }

    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9025ActionForm form) {

        // Get of screen common information domain.
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
    
        //setting the language code and owner comp.
        // 言語コードと責任会社の設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
    }
    
    /**
     *  Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTPリクエスト
     * @param langCd 言語コード
     * @throws ApplicationException プルダウンリストが取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {

        // Acquisition of each pull-down list.
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> weightUnitCdList = commonService.searchPullDownList(
            CD_TYPE_WEIGHT_UNIT, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_WEIGHT_UNIT, weightUnitCdList);
    }

    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - ボタンの活性制御
     * </pre>
     * - If Company(input) don't have the Register Auth, change Register button to Non-Acctive.
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9025ActionForm form,
        HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        // When there are not update authority of selected Company.
        if (!form.getW9025CriteriaDomain().isUserAuthForComp()) {
            //Active control.
            disableElementList.add("w9025CriteriaDomain.weightUnit");
            disableElementList.add("w9025CriteriaDomain.netWeightA");
            disableElementList.add("w9025CriteriaDomain.ignoreWarnings");
            disableElementList.add("register");
        }
        
        // Set of a request attribute.
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
    protected void prepareBusinessDomain (W9025CriteriaDomain criteriaDomain, String windowId, String screenId) {
        // Saves the screen the same name and properties common information domain.
        // 画面共通情報ドメインと同名プロパティを退避
        String weightUnit = criteriaDomain.getWeightUnit();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, windowId, screenId);
        
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
    }
    
    /**
     * Add the specified message to {@link ActionMessages#GLOBAL_MESSAGE}.
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

