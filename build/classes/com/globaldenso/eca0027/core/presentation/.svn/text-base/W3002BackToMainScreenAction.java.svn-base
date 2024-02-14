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
 * The Back to Main action class of Carry out Header
 * <pre>
 *  forward name-path mappings:
 *     - "success":/W3001Init.do
 *     - "error":W3002.jsp
 * </pre>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3002BackToMainScreenAction extends W3002AbstractAction {

    /**
     * <p>Constructor</p>
     *
     */
    public W3002BackToMainScreenAction() {
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
     * 
     * <pre>
     * - No process
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        return FORWARD_SUCCESS;
    }

}
