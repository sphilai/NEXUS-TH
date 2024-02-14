/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
/**
 * The base action class of Create Parts Transfer Report Screen
 * 
 * @author SNT riku
 * @version 1.00
 */
public abstract class W3007AbstractAction extends AbstractAction {

    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor
     */
    public W3007AbstractAction() {
        super();
    }

    /**
     * <p>
     * Setter method for userAuthService.
     * </p>
     * 
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Get the pull-down list, set to request
     *         - TR status
     *         - Edit flag
     *         - TR kind(CML or Item.)
     *         - Issuer
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W3007ActionForm w3007form = (W3007ActionForm)form;
        // Get the screen of common items
        setCommonInfo(w3007form);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Set the caller ID screen.
     *     Set the caller ID screen in the action form.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse, java.lang.String)
     */

    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        ((W3007ActionForm)form).setCallScreenId(SCREEN_ID_W3007);
    }

    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3007ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        // Language code
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * <p>
     * control the button activation
     * </p>
     * 
     * @param form form
     * @param request request
     */
    protected void controlDisplay(W3007ActionForm form,
        HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();

        if (!enableSearch()) {
            disableElementList.add("search");
        }
        //Support UT171
        if (!(form.getListDomainList() == null)) {
            int i = 0;
            for (W3007ListDomain w3007list : form.getListDomainList()) {
                if (w3007list.getChk().equals(FLAG_Y)) {
                    form.getListDomainList().get(i).setSelected(CHECK_ON);
                }
                i++ ;
            }
            // Setting request attributes
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
        }
    }

    /**
     * Return the availability of the Search button。
     * 
     * @return True, false and otherwise be one or more privileges W3001B or
     *         W3001R
     */
    protected boolean enableSearch() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W3001R,
            PERMIT_FUNC_ID_W3001B);
    }

}
