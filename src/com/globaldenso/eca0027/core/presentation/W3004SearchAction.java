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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Print Carry Out List by Parts screen
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3004.jsp
 *     - "error":W3004.jsp
 * </pre>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004SearchAction extends W3004AbstractAction {

    /**
     * <p>Search facade service</p>
     */
    protected SearchFacadeService<List<? extends W3004ListDomain>, W3004CriteriaDomain> w3004SearchFacadeService;

    /**
     * <p>Constructor</p>
     *
     */
    public W3004SearchAction() {
        super();
    }

    /**
     * <p>Setter method for w3004SearchFacadeService.</p>
     *
     * @param searchFacadeService Set for w3004SearchFacadeService
     */
    public void setW3004SearchFacadeService(
        SearchFacadeService<List<? extends W3004ListDomain>, W3004CriteriaDomain> searchFacadeService) {
        w3004SearchFacadeService = searchFacadeService;
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

        W3004ActionForm w3004Form = prepareForm((W3004ActionForm)form);

        // Set of search criteria domain
        W3004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w3004Form);

        // Execution of the search process
        List<? extends W3004ListDomain> listDomainList = w3004SearchFacadeService
            .search(criteriaDomain);
        //Set of search results
        w3004Form.setListDomainList(listDomainList);
        //Control display show result
        controlDisplay(w3004Form, request);

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
    protected W3004ActionForm prepareForm(W3004ActionForm form) {

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
    protected W3004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request,
        ActionMapping mapping, W3004ActionForm form) throws ApplicationException {

        W3004CriteriaDomain criteriaDomain = form.getCriteriaDomain();

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
        // Setting Server ID
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(WINDOW_ID_0);
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo
            .getCommonInfo();
        criteriaDomain.setServerId(eca0027CommonInfoDomain.getServerId());
        
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
     * @see com.globaldenso.eca0027.core.presentation.W3004AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3001ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3004ActionForm form, HttpServletRequest request) {
        super.controlDisplay(form, request);

        form.setDisplayList(true);
    }
}
