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

import com.globaldenso.eca0027.core.business.domain.W3001CriteriaDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The ListForCML action class of Carry out main screen
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3002.jsp
 *     - "error":W3001.jsp
 * </pre>
 *
 * @author DIAT - Chaiporn.A
 * @version 1.00
 */
public class W3001CreateListOrTrAction extends W3001AbstractAction {

    /**
     * <p>Constructor</p>
     *
     */
    public W3001CreateListOrTrAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Set of search criteria domain
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     * - Control display show result
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

        W3001ActionForm w3001Form = (W3001ActionForm)form;

        // get criteria
        W3001CriteriaDomain criteriaDomain = w3001Form.getCriteriaDomain();
        
        // set criteria
        ActionUtil.prepareBusinessDomain(criteriaDomain, w3001Form.getWindowId(), w3001Form.getScreenId());
        
        return FORWARD_SUCCESS;
    }
}
