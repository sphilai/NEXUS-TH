/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of Move To Register
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:/W3005Init.do
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005MoveToRegisterAction extends W3005AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<Integer, W3005CriteriaDomain> w3005MoveToRegisterFacadeService;

    /**
     * <br />
     * default constructor
     */
    public W3005MoveToRegisterAction() {
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
     * Setter method for w3005SearchFacadeService.
     * </p>
     * 
     * @param searchFacadeService Set for w3005SearchFacadeService
     */
    public void setW3005MoveToRegisterFacadeService(
        SearchFacadeService<Integer, W3005CriteriaDomain> searchFacadeService) {
        w3005MoveToRegisterFacadeService = searchFacadeService;
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
        W3005ActionForm w3005Form = prepareForm((W3005ActionForm)form);

        W3005CriteriaDomain criteriaDomain = w3005Form.getCriteriaDomain();
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, w3005Form
            .getWindowId(), w3005Form.getScreenId());

        int count = w3005MoveToRegisterFacadeService.search(criteriaDomain);
        if (count == 0) {
            // set error message
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
                NXS_E1_0007));
            saveMessages(request, messages);
        }
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
    protected W3005ActionForm prepareForm(W3005ActionForm form) {

        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);

        return form;
    }
}
