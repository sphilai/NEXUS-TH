/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3011;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * <p>
 * he base action class of Receive Parts Transfer Report.
 * </p>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3011AbstractAction extends AbstractAction {
    
    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor
     */
    public W3011AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}
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

        W3011ActionForm w3011Form = (W3011ActionForm)form;
        // Get the screen of common items
        setCommonInfo(w3011Form);

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

        ((W3011ActionForm)form).setCallScreenId(SCREEN_ID_W3011);
    }

    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3011ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        // Language code
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param form form
     * @param request request
     */
    protected void controlDisplay(W3011ActionForm form,
        HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();

        if (!enableReceive(form)) {
            disableElementList.add("receive");
        }
        if (!enablePrintTr(form)) {
            disableElementList.add("printTr");
        }

        // Setting request attributes
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     * Return the availability of the Receive button.
     * 
     * @param form form
     * @return True, false
     */
    protected boolean enableReceive(W3011ActionForm form) {
        Boolean result = false;
        String trStatus = form.getCriteriaDomain().getTrStatus();
        if (TR_STATUS_ACTIVATE_TR.equals(trStatus)) {
            result = true;
        }
        return result;
    }

    /**
     * Return the availability of the PrintTR button.
     * 
     * @param form form
     * @return True, false
     */
    protected boolean enablePrintTr(W3011ActionForm form) {
        Boolean result = false;
        String trStatus = form.getCriteriaDomain().getTrStatus();
        if (TR_STATUS_ACTIVATE_TR.equals(trStatus)
            || TR_STATUS_RECEIVED_TR.equals(trStatus)) {
            result = true;
        }
        return result;
    }

}
