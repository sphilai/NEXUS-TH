/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Carry out Header Screen
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public abstract class W3002AbstractAction extends AbstractAction {
    
    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor
     */
    public W3002AbstractAction() {
        super();
    }

    /**
     * <p>Setter method for userAuthService.</p>
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
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W3002ActionForm w3002form = (W3002ActionForm) form;
        //Get the screen of common items
        setCommonInfo(w3002form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
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
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        ((W3002ActionForm) form).setCallScreenId(SCREEN_ID_W3002);
    }  
    
    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3002ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(
            form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        // Language code
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param form form 
     * @param request request
     */
    protected void controlDisplay(W3002ActionForm form, HttpServletRequest request) {
    }
}
