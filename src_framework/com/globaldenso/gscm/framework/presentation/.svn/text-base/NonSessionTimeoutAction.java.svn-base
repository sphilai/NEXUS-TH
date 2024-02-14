/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 非セッションタイムアウト処理
 * Non-session Time-out Process Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * 非セッションタイムアウト処理
 * Non-session Time-out Process 
 * <p>
 * 非セッションタイムアウト処理です。<br/> 
 * Non-session Time-out Process Class <br/> 
 * 本アクションを定期的に呼び出す事で、セッションをタイムアウトさせない。
 * Do not make session occur time-out with invoking constantly this action   
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class NonSessionTimeoutAction extends NonSessionTimeoutAbstractAction {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public NonSessionTimeoutAction() {
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
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        // サーバ接続を実現する処理のため、処理はなし
        // Return null because of process for connecting to server
        return null;
    }
}