/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3007CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of Move to register TR
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:/W3008Init.do
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3007MoveToRegisterTrAction extends W3007AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<Integer, W3007CriteriaDomain> w3007MoveToRegisterTrFacadeService;

    /**
     * <br />
     * default constructor
     */
    public W3007MoveToRegisterTrAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * <p>
     * Setter method for w3007MoveToRegisterTrFacadeService.
     * </p>
     * 
     * @param searchFacadeService Set for w3007MoveToRegisterTrFacadeService
     */
    public void setW3007MoveToRegisterTrFacadeService(
        SearchFacadeService<Integer, W3007CriteriaDomain> searchFacadeService) {
        w3007MoveToRegisterTrFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * no process
     * </pre>
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

        W3007ActionForm w3007Form = prepareForm((W3007ActionForm)form);

        W3007CriteriaDomain criteriaDomain = w3007Form.getCriteriaDomain();
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, w3007Form
            .getWindowId(), w3007Form.getScreenId());

        w3007MoveToRegisterTrFacadeService.search(criteriaDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * 
     * <pre>
     *  - Clear list domain
     *  - Set the maximum number of records per page
     * </pre>
     * 
     * @param form actionform
     * @return form
     */
    protected W3007ActionForm prepareForm(W3007ActionForm form) {

        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);

        return form;
    }
}
