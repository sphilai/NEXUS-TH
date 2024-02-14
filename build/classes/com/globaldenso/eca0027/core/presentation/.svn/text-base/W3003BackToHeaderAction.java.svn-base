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
 * Back to Header Action of Print Carry Out List by CML
 * <pre>
 * forward name-path mappings:
 *     - "success":/W3002Init.do
 * </pre>
 *
 * @author SNT ku
 * @version 1.00
 */
public class W3003BackToHeaderAction extends W3003AbstractAction {

    /**
     * constructor.
     */
    public W3003BackToHeaderAction() {
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
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        return FORWARD_SUCCESS;
    }
}
