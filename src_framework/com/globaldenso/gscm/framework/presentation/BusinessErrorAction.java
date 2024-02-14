/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 業務共通エラー処理
 * Business common error process
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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.exception.GscmBusinessException;

/**
 * 業務共通エラー処理
 * Business common error process
 * <p>
 * 業務共通エラー処理です。<br/> 業務共通エラー画面を表示します。
 * Business common error process.<br/>Display screen of business common error.
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5907 $
 */
public class BusinessErrorAction extends AbstractAction {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public BusinessErrorAction() {
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
        String msgId = request.getParameter("msgId");
        throw new GscmBusinessException(msgId);
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
     * {@inheritDoc}<br/> 本アクションは画面情報を持たないので、Form情報を保持しないように<code>false</code>を返却する。
     * {@inheritDoc}<br/> Because window information does not exist at this action,return false not to maintain Form information
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }

}