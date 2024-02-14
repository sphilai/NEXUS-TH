/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9014R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9014;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;

/**
 * The base action class of CIGMA W/H X-Reference MA Inquiry Screen. <br />
 * CIGMA W/H X-Reference MA Inquiry画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6455 $
 */

public abstract class W9014AbstractAction extends AbstractAction {

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor./デフォルトコンストラクタ
     */
    public W9014AbstractAction() {
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

        W9014ActionForm w9014Form = (W9014ActionForm) form;
        
        // Screen display control.
        controlDisplay(w9014Form, request);

        //Set transition source screen ID.
        w9014Form.setCallScreenId(SCREEN_ID_W9014);
    }

    /**
     * <pre>
     * Screen display control.
     * 画面表示制御を行います。
     * 
     * -Active control of the button.
     *     -The Add button and Delete button is made into non-activity 
     *      when one does not have W9014R authority or W9014B authority. 
     * 
     * - ボタンの活性制御
     *    - W9014R権限またはW9014B権限が1つもない場合
     *        AddボタンとDeleteボタンを非活性
     * </pre>
     * 
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    protected void controlDisplay(W9014ActionForm form, HttpServletRequest request) {

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
     * @return True will be returned if there is authority of W9014R. 
     *         Otherwise, False is returned
     *         W9014Rの権限あればtrue、そうでなければfalse
     */
    protected boolean enableAdd() {

        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W9014R);
    }
}
