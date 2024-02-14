/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9011R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9011;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of CIGMA Customer No. X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public abstract class W9011AbstractAction extends AbstractAction {

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
    public W9011AbstractAction() {
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
     * - Set the pull-down list
     *     The following classification value is made into an argument 
     *     and CommonService.searchPullDownList() is called. 
     *         -reInvoice Flg
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する。
     * - プルダウンリストの設定
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す。
     *         -reInvoice Flg
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

        W9011ActionForm w9011Form = (W9011ActionForm) form;

        // Get screen common items.
        setCommonInfo(w9011Form);

        // Set the pull-down list
        searchPullDownList(request, w9011Form.getLanguageCd());

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

        W9011ActionForm w9011Form = (W9011ActionForm) form;

        // Screen display control.
        controlDisplay(w9011Form, request);

        // Set transition source screen ID.
        w9011Form.setCallScreenId(SCREEN_ID_W9011);
    }

    /**
     * Get the pull-down list.
     * - Call CommonService.searchPullDownList () for the code type, language code, 
     *   code display flag and additional blank line flag argument.
     * - The acquired pulldown list is set as a request attribute.
     * Set request attributes. 
     * 
     * プルダウンリストの取得
     * - コード種別、言語コード、コード表示フラグ、空白行追加フラグを引数にCommonService.searchPullDownList()を呼び出す。
     * - 取得したプルダウンリストをリクエスト属性に設定する。
     * リクエスト属性の設定
     * 
     * @param request HTTPリクエスト
     * @param langCd 言語コード
     * @throws ApplicationException プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) 
        throws ApplicationException {

        // Get the pull-down list.
        List<? extends SelectListItemDomain>  pullDownList =  commonService.searchPullDownList(
            CD_TYPE_FLG, langCd, PULLDOWN_DISP_TYPE_CODE, true);

        // Set request attributes.
        request.setAttribute(ATTR_FLG, pullDownList);
    }

    /**
     * <pre>
     * Screen display control.
     * 画面表示制御を行います。
     * 
     * -Active control of the button.
     *     -The Add / Delete button is made into non-activity 
     *      when does not have W9011R authority or W9011B authority. 
     * 
     * - ボタンの活性制御
     *    - W9011R権限がない場合
     *        Add/Deleteボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9011ActionForm form, HttpServletRequest request) {

        List<String> disableElementList = new ArrayList<String>();

        if (!enableButton()) {
            disableElementList.add("add");
            disableElementList.add("delete");
        }

        // Set request attributes.
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     * To return the availability of the Add button.
     * Add/Deleteボタンの利用可否を返します。
     *
     * @return True will be returned if there is authority of W9011R. 
     *         Otherwise, False is returned
     *         W9011Rの権限あればtrue、そうでなければfalse
     */
    protected boolean enableButton() {

        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W9011R);
    }

    /**
     * - The item of screen common information and languageCd are set to action form.
     * - アクション・フォームに画面共通情報の項目と言語コードを設定します。
     *
     * @param form アクションフォーム
     */
    protected void setCommonInfo(W9011ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

}
