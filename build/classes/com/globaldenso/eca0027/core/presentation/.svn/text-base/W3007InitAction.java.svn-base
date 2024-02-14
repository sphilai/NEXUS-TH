/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3007CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * the initial action class of Create Parts Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3007.jsp
 *     - &quot;error&quot;:-
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3007InitAction extends W3007AbstractAction {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3007InitAction() {
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
        W3007ActionForm w3007Form = (W3007ActionForm)form;
        
        if (SCREEN_ID_W3002.equals(w3007Form.getCallScreenId())) {

            WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
                .getGeneralArea(((W3007ActionForm)form).getWindowId());
            ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
                SCREEN_ID_W3002);
            W3002CriteriaDomain w3002criteriaDomain = ((W3002ActionForm)screenInfo
                .getActionForm()).getCriteriaDomain();

            W3007CriteriaDomain w3007CriteriaDomain = ((W3007ActionForm)form)
                .getCriteriaDomain();

            // copy Header information
            CommonUtil.copyPropertiesDomainToDomain(w3007CriteriaDomain,
                w3002criteriaDomain);
        }
        if (SCREEN_ID_W3008.equals(w3007Form.getCallScreenId())) {
            // Display control of the Main screen
            controlDisplay((W3007ActionForm)form, request);
        }

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
    protected void controlDisplay(W3007ActionForm form,
        HttpServletRequest request) {
        // Active control of the button
        super.controlDisplay(form, request);

        // Hide Search Results Area
        form.setDisplayList(false);
    }

}
