/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6004;
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
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class of action Documentation Invoice Header screen.
 * <br />通関書類作成業務 Invoice Header画面の基底アクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public abstract class W6004AbstractAction extends AbstractAction {
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタ。
     */
    public W6004AbstractAction() {
        super();
    }

    /**
     * Getter method for commonService.
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
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
     * - Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form
     *     
     * - Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for the argument classification VALUE following
     *         - Delay
     *     And then set them in the request attribute pull-down list obtained
     * </pre>
     * <pre>
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     *     
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         - Delay
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Acquisition of form 
        // フォームの取得
        W6004ActionForm w6004Form = (W6004ActionForm) form;
        
        // Acquisition of a screen common item 
        // 画面共通項目の取得
        setCommonInfo(w6004Form);
        
        // Setup of a pulldown list
        // プルダウンリストの設定
        searchPullDownList(request, w6004Form.getLanguageCd());
        
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
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        ((W6004ActionForm) form).setCallScreenId(SCREEN_ID_W6004);
        
        controlDisplay((W6004ActionForm) form, request);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W6004ActionForm form) {
        // Acquisition of a screen common information domain 
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Setup of a linguistic code 
        // 言語コードの設定
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
        // Acquisition of each pulldown list 
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> flagList = commonService.searchPullDownList(CD_TYPE_FLAG, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        
        // Setup of a request attribute 
        // リクエスト属性の設定
        request.setAttribute(ATTR_FLAG, flagList);
    }
    
    /**
     * Add as ActionMessages.GLOBAL_MESSAGE the specified message.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param messageId MESSAGE ID<br />
     * メッセージID
     * @param args Message argument<br />
     * メッセージ引数
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
    
    /**
     * Make the display control of Invoice Header screen.
     * <pre>
     * ‐Make the display control of the screens by selecting VALUE of the radio buttons of the search condition.
     * </pre>
     *
     * @param form Action Form
     * @param request HTTP request
     */
    protected void controlDisplay(W6004ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        // Active control of CK 
        // CKの活性制御
        List<? extends W6004ListDomain> listDomainList = form.getListDomainList();
        if(null != listDomainList) {
            for (int i = 0; i < listDomainList.size(); i++) {
                if (listDomainList.get(i).isDisabledFlg()) {
                    disableElementList.add(String.format("listDomainList[%d].selected", i));
                }
            }
        }

        // Setup of an un-active item 
        // 非活性項目の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
}
