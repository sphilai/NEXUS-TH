/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 29, 2015
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author XXXXXXXXXXX
 * @version 1.00
 */
public class Wt002InitAction extends Wt002AbstractAction {

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Wt002InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        Wt002ActionForm thisForm = (Wt002ActionForm)form;
        //clear criteria & result list
        thisForm.setWt002CriteriaDomain(null);
        thisForm.setWt002ListDomainList(null);
        
        return FORWARD_SUCCESS;
    }

}
