/*
 * Project : NEXUS_EXPORT
 *
 * (c) Copyright  2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * the initial action class of carry out main screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3001.jsp
 *     - &quot;error&quot;:-
 * </pre>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001InitAction extends W3001AbstractAction {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3001InitAction() {
        super();
    }

    /**
     * {@inheritDoc} Remove header information Display control Active control of
     * the screen item. ({@link W3001AbstractAction#controlDisplay(W3001ActionForm, HttpServletRequest)})
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

        // Remove header information
        W3001ActionForm w3001ActionForm = (W3001ActionForm)form;
        // Erase search results
        w3001ActionForm.setW3001ListDomainList(null);
        ActionUtil.prepareBusinessDomain(w3001ActionForm.getCriteriaDomain(),
            w3001ActionForm.getWindowId(), w3001ActionForm.getScreenId());
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
     * @see com.globaldenso.eca0027.core.presentation.W3001AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3001ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplayButton(W3001ActionForm form,
        HttpServletRequest request) {
        // Active control of the button
        super.controlDisplayButton(form, request);

        // Hide Search Results Area
        form.setDisplayList(false);
    }

}
