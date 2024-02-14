/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ウィンドウクローズ用の基底クラス
 * Super Class for Window Close
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;

/**
 * ウィンドウクローズ用基底クラス
 * Super Class for Window Close
 * <p>
 * ウィンドウクローズに伴う、DensoContext汎用エリア内の情報を削除する。<br/>
 * Delete information in DensoContext common area with window close <br/>
 * 実際に情報を削除する箇所は基底クラス(AbstractAction)内で、本Actionを呼び出した際に<br/>
 * The part which deletes information executes at super class(AbstractAction) with value of request argument,GSCM_SessionClearUnit,attached at this action invoked  <br/>
 * 付与するリクエストパラメータ「GSCM_SessionClearUnit」の値により実施される。
 * 
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class AbstractWindowCloseAction extends AbstractAction {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public AbstractWindowCloseAction() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected final String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        // フォーム情報よりウィンドウIDを取得する。
        // Get window id from form information
        String windowId = ((AbstractActionForm)form).getWindowId();

        // DensoContext汎用エリアより、閉じられるウィンドウのウィンドウIDに該当する情報を削除する。
        // Delete information fallen under window id of window closed from DensoContext common area
        DensoContext.get().removeGeneralArea(windowId);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isTokenCheck()
     */
    @Override
    protected boolean isTokenCheck() {
        return false;
    }
}
