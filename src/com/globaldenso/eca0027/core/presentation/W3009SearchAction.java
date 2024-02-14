/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3009R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * <p>W3009SearchAction</p>
 *
 * @author DIAT Thalerngsak.P
 * @version 1.00
 */
public class W3009SearchAction extends W3009AbstractAction {
    /**
     * <p>Search facade service</p>
     */
    protected SearchFacadeService<List<? extends W3009ListDomain>, W3009CriteriaDomain> w3009SearchFacadeService;

    /**
     * <p>constructor</p>
     *
     */
    public W3009SearchAction() {
        super();
    }


    /**
     * <p>w3009SearchFacadeService setter</p>
     *
     * @param searchFacadeService w3009SearchFacadeService set
     */
    public void setW3009SearchFacadeService(
        SearchFacadeService<List<? extends W3009ListDomain>, W3009CriteriaDomain> searchFacadeService) {
        w3009SearchFacadeService = searchFacadeService;
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        W3009ActionForm w3009Form = prepareForm((W3009ActionForm)form);

        // Set of search criteria domain
        W3009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w3009Form);

        // Execution of the search process
        List<? extends W3009ListDomain> listDomainList = w3009SearchFacadeService
            .search(criteriaDomain);
        //Set of search results
        w3009Form.setW3009ListDomainList(listDomainList);
        //Control display show result
        controlDisplay(w3009Form, request);

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
    protected W3009ActionForm prepareForm(W3009ActionForm form) {

        form.setW3009ListDomainList(null);
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
    protected W3009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request,
        ActionMapping mapping, W3009ActionForm form) throws ApplicationException {

        W3009CriteriaDomain criteriaDomain = form.getCriteriaDomain();

        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Page control processing
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Set of function use authority
        criteriaDomain.setUserAuthList(null);
        if (!userAuthService.hasRegisterAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W3009R, PERMIT_FUNC_ID_W3009B });
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W3009AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3009ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3009ActionForm form,
        HttpServletRequest request) {
        super.controlDisplay(form, request);
        form.setDisplayList(true);
    }
    
    

}
