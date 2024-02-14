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
 * the initial action class of Create CML Transfer Report Screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3005.jsp
 *     - &quot;error&quot;:-
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005InitAction extends W3005AbstractAction {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3005InitAction() {
        super();
    }

    /**
     * {@inheritDoc} Remove header information Display control Active control of
     * the screen item. 
     * Hide the search results area
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        // Display control of the Main screen
        controlDisplay((W3005ActionForm)form, request);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Button activity control. 
     * - Hide search result
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W3002AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3005ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3005ActionForm form,
        HttpServletRequest request) {
        // Active control of the button
        super.controlDisplay(form, request);

        // Hide Search Results Area
        form.setDisplayList(false);
    }

}
