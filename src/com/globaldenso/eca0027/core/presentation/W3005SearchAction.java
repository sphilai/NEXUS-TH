/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3005ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Create CML Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3005.jsp
 *     - &quot;error&quot;:W3015.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005SearchAction extends W3005AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<List<? extends W3005ListDomain>, W3005CriteriaDomain> w3005SearchFacadeService;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public W3005SearchAction() {
        super();
    }

    /**
     * <p>
     * Setter method for W3005SearchFacadeService.
     * </p>
     * 
     * @param searchFacadeService Set for W3005SearchFacadeService
     */
    public void setW3005SearchFacadeService(
        SearchFacadeService<List<? extends W3005ListDomain>, W3005CriteriaDomain> searchFacadeService) {
        w3005SearchFacadeService = searchFacadeService;
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
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3005ActionForm W3005Form = prepareForm((W3005ActionForm)form);

        // Set of search criteria domain
        W3005CriteriaDomain criteriaDomain = prepareCriteriaDomain(request,
            mapping, W3005Form);

        // Execution of the search process
        List<? extends W3005ListDomain> listDomainList = w3005SearchFacadeService
            .search(criteriaDomain);
        // Set of search results
        W3005Form.setListDomainList(listDomainList);
        // Control display show result
        controlDisplay(W3005Form, request);

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

    /**
     * Set the search criteria domain.
     * 
     * @param request request
     * @param mapping map
     * @param form action form
     * @return criteriaDomain
     * @throws ApplicationException exception
     */
    protected W3005CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W3005ActionForm form)
        throws ApplicationException {

        W3005CriteriaDomain criteriaDomain = form.getCriteriaDomain();

        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(),
            form.getScreenId());

        // Page control processing
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form,
            mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Setting User Permissions
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            //
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W3001R,
                PERMIT_FUNC_ID_W3001B};
            List<? extends UserAuthDomain> userAuthList = userAuthService
                .getUserAuthList(permitFuncIdList);

            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }

        return criteriaDomain;
    }

    /**
     * Make the display control of shipping confirmation Main screen.
     * 
     * <pre>
     * - Showing Results Area. 
     * </pre>
     * 
     * @param form form
     * @param request request
     * @see com.globaldenso.eca0027.core.presentation.W3005AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3005ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3005ActionForm form,
        HttpServletRequest request) {
        super.controlDisplay(form, request);

        form.setDisplayList(true);
    }
}
