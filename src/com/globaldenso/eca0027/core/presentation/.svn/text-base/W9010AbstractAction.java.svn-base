/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
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
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of CIGMA Ship to X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 9504 $
 */
public abstract class W9010AbstractAction extends AbstractAction {

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9010AbstractAction() {
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
     * <pre>
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Acquisition of screen common information 
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
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W9010ActionForm w9010Form = (W9010ActionForm) form;

        // Get screen common items.
        setCommonInfo(w9010Form);

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

        W9010ActionForm w9010Form = (W9010ActionForm) form;
        //Set transition source screen ID.
        ((W9010ActionForm) form).setCallScreenId(SCREEN_ID_W9009);
        ((W9010ActionForm) form).setProcMode(w9010Form.getW9010CriteriaDomain().getProcMode());
    }

    /**
     * - The item of screen common information is set to action form. 
     * - アクション・フォームに画面共通情報の項目を設定します。
     * 
     * @param form アクションフォーム
     */
    protected void setCommonInfo(W9010ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * Screen display control.
     * 画面表示制御を行います。
     * <pre>
     * - Active control of the button.
     *     -If do not have update authority 
     *         ,deactivate the following items.
     *           - Register button
     * - Get the registration and update authority.
     * - When there are registration and update authority 
     *   of Company which is in new mode and was handed over.
     *       - Set a new mode.
     * - In the case of correction / reference mode.
     * - When there are registration and update authority of selected Company.
     *       - Set in correction mode.
     * - When there are registration and update authority of selected Company.
     *       - Set the reference mode.
     * - Set of a request attribute.
     * 
     * - ボタンの活性制御
     *     - 更新権限を持っていない場合
     *         以下の項目を非活性にする
     *           - Registerボタン
     * - 登録·更新権限を取得します。
     * - 新規モードかつ、引継値.Companyの更新・登録権限がある場合。
     *     - 新規モードを設定する。
     * - 修正/参照モードの場合。
     *     - 修正/参照モードで、更新権限がある場合。
     *         - 修正モードを設定する。
     *     - 修正/参照モードで、更新権限がない場合。
     *         - 参照モードを設定する。
     * - リクエスト属性をセットする。
     * </pre>
     *
     * @param request HTTPリクエスト
     * @param form アクションフォーム
     * @throws ApplicationException  権限チェックができない場合
     */
    protected void controlDisplay(HttpServletRequest request, W9010ActionForm form) 
        throws ApplicationException {

        List<String> disableElementList = new ArrayList<String>();

        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());

        // Get handover items.
        ScreenInfoDomain w9009ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9009);
        W9009ActionForm w9009Form = (W9009ActionForm) w9009ScreenInfo.getActionForm();
        
        // Not taken over the lgcyLibCompCd and lgcyWhCd and plntCd.
        if (w9009Form.getAddFlg().equals(FLAG_ON)) {
            form.getW9010CriteriaDomain().setProcMode(MODE_NEW);

        }

        //In the case of correction / reference mode 
        else{

            // When there are registration and update authority of selected Company.
            if (enableRegister(w9009Form, form)) {

                form.getW9010CriteriaDomain().setProcMode(MODE_EDIT);

            // When there are registration and update authority of selected Company.
            } else {

              //Active control of the button.
                disableElementList.add("register");
                form.getW9010CriteriaDomain().setProcMode(MODE_REF);
            }
        }

        // Set of a request attribute.
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        request.setAttribute("w9010CriteriaDomain", form.getW9010CriteriaDomain()); 

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
     * @param w9009Form アクションフォーム
     * @param w9010Form アクションフォーム
     * @return True will be returned if company code has authority of W9009R. 
     *         Otherwise, False is returned
     *         会社コードにW9009Rの権限があればtrue、そうでなければfalse
     */
    protected boolean enableRegister(W9009ActionForm w9009Form, W9010ActionForm w9010Form) {

        try {
            // Authority check.
            return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9009R, 
                w9009Form.getW9009ListDomainList()
                    .get(Integer.parseInt(w9010Form.getCk())).getLgcyLibCompCd());

        } catch (ApplicationException e) {
            return false;
        }
    }
}
