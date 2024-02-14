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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9014R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9014;
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

/**
 * The base action class of CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6696 $
 */
public abstract class W9015AbstractAction extends AbstractAction {

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015AbstractAction() {
        super();
    }

    /**
     * <p>Setter method for userAuthService.</p>
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Process of initialization.
     *    - No processing.
     * 
     * - 初期化処理。
     *    - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
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

        W9015ActionForm w9015Form = (W9015ActionForm) form;
        //Set transition source screen ID.
        ((W9015ActionForm) form).setCallScreenId(SCREEN_ID_W9014);
        ((W9015ActionForm) form).setProcMode(w9015Form.getW9015CriteriaDomain().getProcMode());
        
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
    protected void controlDisplay(HttpServletRequest request, W9015ActionForm form) 
        throws ApplicationException {

        List<String> disableElementList = new ArrayList<String>();

        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());

        // Get handover items.
        ScreenInfoDomain w9014ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo()
            .get(SCREEN_ID_W9014);
        W9014ActionForm w9014Form = (W9014ActionForm) w9014ScreenInfo.getActionForm();
        
        // Not taken over the lgcyLibCompCd and lgcyWhCd and plntCd.
        if (w9014Form.getAddFlg().equals(FLAG_ON)) {

            form.getW9015CriteriaDomain().setProcMode(MODE_NEW);

        }

        //In the case of correction / reference mode 
        else{

            // When there are registration and update authority of selected Company.
            if (enableRegister(w9014Form, form)) {

                // When there are registration and update authority of selected Company.

                form.getW9015CriteriaDomain().setProcMode(MODE_EDIT);

            } else {

                //Active control of the button.
                disableElementList.add("register");

                form.getW9015CriteriaDomain().setProcMode(MODE_REF);

            }
        }

        // Set of a request attribute.
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        request.setAttribute("w9015CriteriaDomain", form.getW9015CriteriaDomain()); 

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
     * @param w9014Form アクションフォーム
     * @param w9015Form アクションフォーム
     * @return True will be returned if company code has authority of W9014R. 
     *         Otherwise, False is returned
     *         会社コードにW9014Rの権限があればtrue、そうでなければfalse
     */
    protected boolean enableRegister(W9014ActionForm w9014Form, W9015ActionForm w9015Form) {

        try {

            // Authority check.
            return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9014R, 
                w9014Form.getW9014ListDomainList()
                    .get(Integer.parseInt(w9015Form.getCk())).getLgcyLibCompCd());

        } catch (ApplicationException e) {
            return false;
        }
    }

}
