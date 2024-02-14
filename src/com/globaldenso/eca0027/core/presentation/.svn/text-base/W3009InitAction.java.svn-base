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
 * <p>W3009InitAction</p>
 *
 * @author DIAT Thalerngsak.P
 * @version 1.00
 */
public class W3009InitAction extends W3009AbstractAction {

    /**
     * <p>constructor</p>
     *
     */
    public W3009InitAction() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // Remove header information
        W3009ActionForm w3009ActionForm = (W3009ActionForm)form;
        // Erase search results
        w3009ActionForm.setW3009ListDomainList(null);
        //removeHeaderInfo();
        
        // Display control of the Main screen
        controlDisplay((W3009ActionForm) form, request);
        
        return FORWARD_SUCCESS;
    }
    
   
    /**
     * {@inheritDoc} 
     * <pre>
     * - Button activity control. 
     * - Hide search result
     * </pre>
     * @see com.globaldenso.eca0027.core.presentation.W3001AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3001ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3009ActionForm form, HttpServletRequest request) {
        // Active control of the button
        super.controlDisplay(form, request);

        // Hide Search Results Area
        form.setDisplayList(false);
    }
    

}
