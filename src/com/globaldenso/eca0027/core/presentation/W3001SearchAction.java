/*
 * Project : NEXUS_EXPORT
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
//Temp
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
import com.globaldenso.eca0027.core.business.domain.W3001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Carry out main screen
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3001.jsp
 *     - "error":W3001.jsp
 * </pre>
 *
 * @author DIAT - Chaiporn.A
 * @version 1.00
 */
public class W3001SearchAction extends W3001AbstractAction {

    /**
     * <p>Search facade service</p>
     */
    protected SearchFacadeService<List<? extends W3001ListDomain>, W3001CriteriaDomain> w3001SearchFacadeService;

    /**
     * <p>Constructor</p>
     *
     */
    public W3001SearchAction() {
        super();
    }

    /**
     * <p>Setter method for w3001SearchFacadeService.</p>
     *
     * @param searchFacadeService Set for w3001SearchFacadeService
     */
    public void setW3001SearchFacadeService(
        SearchFacadeService<List<? extends W3001ListDomain>, W3001CriteriaDomain> searchFacadeService) {
        w3001SearchFacadeService = searchFacadeService;
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
        W3001ActionForm w3001Form = prepareForm((W3001ActionForm)form);
        // Set of search criteria domain
        W3001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w3001Form);
        // Execution of the search process
        List<? extends W3001ListDomain> listDomainList = w3001SearchFacadeService
            .search(criteriaDomain);
        //Set of search results
        w3001Form.setW3001ListDomainList(listDomainList);
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <pre>
     *  - Clear list domain
     *  - Set the maximum number of records per page
     * </pre>
     * @param form actionform
     * @return form 
     */
    protected W3001ActionForm prepareForm(W3001ActionForm form) {
        //form.setListDomainList(null);
        form.setW3001ListDomainList(null);
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
    protected W3001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request,
        ActionMapping mapping, W3001ActionForm form) throws ApplicationException {
        W3001CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        // Page control processing
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Setting User Permissions
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            //
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W3001R, PERMIT_FUNC_ID_W3001B};
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
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
     * @param form form
     * @param request request
     * @see com.globaldenso.eca0027.core.presentation.W3001AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3001ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplayButton(W3001ActionForm form, HttpServletRequest request) {
        super.controlDisplayButton(form, request);
        form.setDisplayList(true);
    }
}
