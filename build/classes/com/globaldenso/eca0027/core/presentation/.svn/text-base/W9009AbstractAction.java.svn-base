/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of CIGMA Ship to X-Reference MA Inquiry Screen.
 * <br />CIGMA Ship to X-Reference MA Inquiry画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 7950 $
 */
public abstract class W9009AbstractAction extends AbstractAction {

    /** 
     * Common service/共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009AbstractAction() {
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
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Get screen common items.
     *     A screen common item (linguistic code) is set as action form. 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #preInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                        org.apache.struts.action.ActionForm, 
     *                        javax.servlet.http.HttpServletRequest,
     *                        javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W9009ActionForm w9009Form = (W9009ActionForm) form;

        // Get screen common items.
        setCommonInfo(w9009Form);


        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Screen display control.
     *     The implementation of active control button, 
     *     the display control of the search results area.
     * - Set the caller ID screen.
     *     Set the caller ID screen in the action form.
     * 
     * - 画面表示制御
     *     ボタンの活性制御、検索結果エリアの表示制御を行う
     * - 呼出し元画面IDの設定
     *     アクション・フォームに呼出し元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #postInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                         org.apache.struts.action.ActionForm, 
     *                         javax.servlet.http.HttpServletRequest,
     *                         javax.servlet.http.HttpServletResponse, 
     *                         java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W9009ActionForm w9009Form = (W9009ActionForm) form;
        
        // Screen display control.
        controlDisplay(w9009Form, request);

        //Set transition source screen ID.
        w9009Form.setCallScreenId(SCREEN_ID_W9009);
    }

    /**
     * - The item of screen common information and languageCd are set to action form.
     * - アクション・フォームに画面共通情報の項目と言語コードを設定します。
     *
     * @param form アクションフォーム
     */
    protected void setCommonInfo(W9009ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * <pre>
     * Screen display control.
     * 画面表示制御を行います。
     * 
     * -Active control of the button.
     *     -The Add / Delete button is made into non-activity 
     *      when one does not have W9009R authority or W9009B authority. 
     * 
     * - ボタンの活性制御
     *    - W9009R権限またはW9009B権限が1つもない場合
     *        Add/Deleteボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9009ActionForm form, HttpServletRequest request) {

        List<String> disableElementList = new ArrayList<String>();

        if (!enableAdd()) {
            disableElementList.add("add");
            disableElementList.add("delete");
        }

        // Set request attributes.
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     * To return the availability of the Add button.
     * Addボタンの利用可否を返します。
     *
     * @return True will be returned if there is authority of W9009R. 
     *         Otherwise, False is returned
     *         W9009Rの権限あればtrue、そうでなければfalse
     */
    protected boolean enableAdd() {

        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W9009R);
    }

}
