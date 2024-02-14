/*
 * PROJECT：GSCMSample
 * 
 * の基底アクションクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractAction;

/**
 * <p>
 * 基底アクションクラスです。
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 */
public abstract class X9001AbstractAction extends AbstractAction {

    /**
     * デフォルトコンストラクタ。
     */
    public X9001AbstractAction() {
        super();
    }

    /**
     * 初期化処理 {@inheritDoc}
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
     * 
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#isTokenCheck()
     */

    @Override
    protected boolean isTokenCheck() {
        return false;
    }

}
