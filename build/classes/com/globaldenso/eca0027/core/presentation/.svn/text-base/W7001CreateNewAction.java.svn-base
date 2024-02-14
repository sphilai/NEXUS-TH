/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * The class of Create New Action for Shipping Actuality Main screen.
 * <br />船積実績Main画面のCreate Newアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":/W7002Init.do
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001CreateNewAction extends W7001AbstractAction {

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001CreateNewAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Transition to Shipping Actuality Header screen.
     * </pre>
     * <pre>
     * ‐船積実績 Header画面に遷移する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        return FORWARD_SUCCESS;
    }

}
