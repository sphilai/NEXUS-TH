/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
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
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
/**
 * The base action class of CIGMA Customer No. X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public abstract class W9012AbstractAction extends AbstractAction {

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
    public W9012AbstractAction() {
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
     * - Acquisition of screen common information 
     *     A screen common item (linguistic code) is set as action form. 
     * - Acquisition of a pulldown list
     *     The following classification value is made into an argument 
     *     and CommonService.searchPullDownList() is called. 
     *         - reInvoiceFlg
     * - The acquired pulldown list is set as a request attribute. 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する。
     * - プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す。
     *         - reInvoiceFlg
     * - 取得したプルダウンリストをリクエスト属性に設定する。
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

        W9012ActionForm w9012Form = (W9012ActionForm) form;

        // Get screen common items.
        setCommonInfo(w9012Form);

        // Set the pull-down list
        searchPullDownList(request, w9012Form.getLanguageCd());

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set the caller ID screen.
     *     Set the caller ID screen in the action form.
     * 
     * - 呼出し元画面IDの設定
     *     アクション・フォームに呼出し元画面IDを設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #postInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                         org.apache.struts.action.ActionForm, 
     *                         javax.servlet.http.HttpServletRequest, 
     *                         javax.servlet.http.HttpServletResponse, 
     *                         java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W9012ActionForm w9012Form = (W9012ActionForm) form;
        //Set transition source screen ID.
        ((W9012ActionForm) form).setCallScreenId(SCREEN_ID_W9011);
        ((W9012ActionForm) form).setProcMode(w9012Form.getW9012CriteriaDomain().getProcMode());
        
    }

    /**
     * - The item of screen common information and languageCd are set to action form.
     * - アクション・フォームに画面共通情報の項目と言語コードを設定します。
     *
     * @param form アクションフォーム
     */
    protected void setCommonInfo(W9012ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Acquisition of a pulldown list
     * - Call CommonService.searchPullDownList () for the code type, language code, 
     *   code display flag and additional blank line flag argument.
     * - The acquired pulldown list is set as a request attribute. 
     * 
     * プルダウンリストの取得
     * - コード種別、言語コード、コード表示フラグ、空白行追加フラグを引数にCommonService.searchPullDownList()を呼び出す。
     * - 取得したプルダウンリストをリクエスト属性に設定する。
     *
     * @param request HTTPリクエスト
     * @param langCd 言語コード
     * @throws ApplicationException プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) 
        throws ApplicationException {

        // Call the method getPullDownList.
        List<? extends SelectListItemDomain>  pullDownList =  commonService.searchPullDownList(
            CD_TYPE_FLG, langCd, PULLDOWN_DISP_TYPE_CODE, true);

        // Set request attributes.
        request.setAttribute(ATTR_FLG, pullDownList);
    }

    /**
     * Screen display control.
     * 画面表示制御を行います。
     * <pre>
     * - Get the registration and update authority.
     * - When there are registration and update authority 
     *   of Company which is in new mode and was handed over.
     *       - Set a new mode.
     * - In the case of correction / reference mode.
     * - When there are registration and update authority of selected Company.
     *       - Set in correction mode.
     * - When there are registration and update authority of selected Company.
     *       - Active control of the button.
     *         - Deactivate the following items.
     *           - Register button
     *       - Set the reference mode.
     * - Set of a request attribute.
     * 
     * - 登録·更新権限を取得します。
     * - 新規モードかつ、引継値.Companyの更新・登録権限がある場合。
     *     - 新規モードを設定する。
     * - 修正/参照モードの場合。
     *     - 修正/参照モードで、更新権限がある場合。
     *         - 修正モードを設定する。
     *     - 修正/参照モードで、更新権限がない場合。
     *         - ボタン活性制御
     *             - 以下の項目を非活性にする
     *               - Registerボタン
     *         - 参照モードを設定する。
     * - リクエスト属性をセットする。
     * </pre>
     *
     * @param request HTTPリクエスト
     * @param form アクションフォーム
     * @throws ApplicationException  権限チェックができない場合
     */
    protected void controlDisplay(HttpServletRequest request, W9012ActionForm form) 
        throws ApplicationException {

        List<String> disableElementList = new ArrayList<String>();

        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());

        // Get handover items.
        ScreenInfoDomain w9011ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9011);
        W9011ActionForm w9011Form = (W9011ActionForm) w9011ScreenInfo.getActionForm();
        
        // Not taken over the lgcyLibCompCd and lgcyWhCd and plntCd.
        if (w9011Form.getAddFlg().equals(FLAG_ON)) {

            form.getW9012CriteriaDomain().setProcMode(MODE_NEW);

        }

        //In the case of correction / reference mode 
        else{

            // When there are registration and update authority of selected Company.
            if (enableRegister(w9011Form, form)) {

                // When there are registration and update authority of selected Company.

                form.getW9012CriteriaDomain().setProcMode(MODE_EDIT);

            } else {

                //Active control of the button.
                disableElementList.add("register");

                form.getW9012CriteriaDomain().setProcMode(MODE_REF);

            }
        }

        // Set of a request attribute.
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        request.setAttribute("w9012CriteriaDomain", form.getW9012CriteriaDomain()); 

    }

    /**
     * Return the availability of the Register button.
     * Registerボタンの利用可否を返します。
     * 
     * - Get screen common information domain.
     * - Get handover items.
     * - Authority check.
     * 
     * - 画面共通情報を取得。
     * - 引継値を取得。
     * - 権限チェック。
     * @param w9011Form アクションフォーム
     * @param w9012Form アクションフォーム
     * @return True will be returned if company code has authority of W9011R. 
     *         Otherwise, False is returned
     *         会社コードにW9011Rの権限があればtrue、そうでなければfalse
     */
    protected boolean enableRegister(W9011ActionForm w9011Form, W9012ActionForm w9012Form) {

        try {
            // Authority check.
            return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9011R, 
                w9011Form.getW9011ListDomainList()
                    .get(Integer.parseInt(w9012Form.getCk())).getLgcyLibCompCd());

        } catch (ApplicationException e) {
            return false;
        }
    }
}
