/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


/**
 * The initial action class of CIGMA W/H X-Reference MA Inquiry Screen.
 * <br />CIGMA W/H X-Reference MA Inquiry画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9014.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014InitAction extends W9014AbstractAction {

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - ScreenInfo check.
     *     - Return false(No check).
     * 
     * - 画面情報チェック。
     *     - false(チェックしない)を返却する。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Display control.
     *     Active control of the screen item.
     *     ({@link W9014AbstractAction#controlDisplay(W9014ActionForm, HttpServletRequest)})
     *     Hide the search results area.
     * 
     * - 表示制御
     *     画面項目の活性制御を行う。
     *     ({@link W9014AbstractAction#controlDisplay(W9014ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping, 
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest, 
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        // Display control.
        controlDisplay((W9014ActionForm) form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * <pre>
     * Screen display control.
     * 画面表示制御を行います。
     * 
     * - Clean the contents of the search results.
     * - Button activity control.
     * 
     * - 検索結果を削除します。
     * - ボタンの活性制御をします。
     * </pre>
     * @param form アクションフォーム
     * @param request HTTPリクエスト
     */
    @Override
    protected void controlDisplay(W9014ActionForm form,
        HttpServletRequest request) {
        
        // Clean the contents of the search results.
        form.setW9014ListDomainList(null);
        form.setCk(null);

        // Button activity control.
        super.controlDisplay(form, request);

    }
}
