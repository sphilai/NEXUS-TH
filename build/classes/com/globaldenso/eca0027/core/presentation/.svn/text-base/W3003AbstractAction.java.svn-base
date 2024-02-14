/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;


import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CML_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CML_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Print Carry Out List by CML Screen
 *
 * @author SNT ku
 * @version 1.00
 */
public abstract class W3003AbstractAction extends AbstractAction {

    /** 
     * common service
     */
    protected CommonService commonService;
    
    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor
     */
    public W3003AbstractAction() {
        super();
    }
     
    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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

        W3003ActionForm w3003form = (W3003ActionForm) form;

        //Get the screen of common items
        setCommonInfo(w3003form);

        //Setting of the pull-down list
        searchPullDownList(request, w3003form.getLanguageCd());
        
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
        
        ((W3003ActionForm) form).setCallScreenId(SCREEN_ID_W3003);
    }  
    
    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3003ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(
            form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        // Language code
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * <p>
     * Set the pull-down list to be displayed on the screen
     * </p>
     * 
     * @param request request
     * @param langCd langCd
     * @throws ApplicationException Exception
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd)
        throws ApplicationException {
        // Acquisition of each pull-down list
        List<? extends SelectListItemDomain> cmlList = commonService.searchPullDownList(
            CD_TYPE_CML_TYPE, langCd, PULLDOWN_DISP_TYPE_VALUE, true);

        // Setting request attributes.
        request.setAttribute(ATTR_CML_TYP, cmlList);
    }
    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param form form 
     * @param request request
     */
    protected void controlDisplay(W3003ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        if (!enableSearch()) {
            disableElementList.add("search");
        }
        
        // Setting request attributes
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * Return the availability of the Search button。
     *
     * @return True, false and otherwise be one or more privileges W3003B or W3003R
     */
    protected boolean enableSearch() {
        return userAuthService.hasAnyPermitFuncId(PERMIT_FUNC_ID_W3001R, PERMIT_FUNC_ID_W3001B);
    }
    
    /**
     * Save PDF File
     *
     * @param form W3003ActionForm
     * @param report File
     */
    protected void saveReport(W3003ActionForm form, File report) {
        // Get Domain Info
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W3003);
        
        // Save PDF File
        screenInfo.setGeneralArea("report", report);
    }

}
