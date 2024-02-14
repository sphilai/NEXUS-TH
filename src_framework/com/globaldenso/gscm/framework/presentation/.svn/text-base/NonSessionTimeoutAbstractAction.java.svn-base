/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 非セッションタイムアウト 共通処理
 * Non-session Time-out Common Process Class
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
import com.globaldenso.ai.common.core.exception.ApplicationException;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * 非セッションタイムアウト 共通処理
 * Non-session Time-out Common Process Class
 * 
 * <p>
 * 非セッションタイムアウトの共通処理を実施する。
 * Execute non-session Time-out Common Process Class
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class NonSessionTimeoutAbstractAction extends AbstractAction {
    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public NonSessionTimeoutAbstractAction() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

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

    /**
     * {@inheritDoc}<br/>
     * 本アクションは画面情報を持たないので、Form情報を保持しないように<code>false</code>を返却する。
     * Return false not to have Form Information because this action does not have screen information
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
