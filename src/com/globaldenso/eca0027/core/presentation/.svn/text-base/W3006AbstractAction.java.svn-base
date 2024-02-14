/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3006;
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
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Register CML Transfer Report Screen
 * 
 * @author SNT ku
 * @version 1.00
 */
public abstract class W3006AbstractAction extends AbstractAction {

    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;

    /**
     * Default constructor
     */
    public W3006AbstractAction() {
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

        W3006ActionForm w3006form = (W3006ActionForm)form;
        // Get the screen of common items
        setCommonInfo(w3006form);

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

        ((W3006ActionForm)form).setCallScreenId(SCREEN_ID_W3006);
    }

    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3006ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        // Language code
        form.setLanguageCd(commonInfo.getLanguageCd());
    }

    /**
     * <p>
     * control button activation
     * </p>
     * 
     * @param form form
     * @param request request
     */
    protected void controlDisplay(W3006ActionForm form,
        HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        String trStatus = form.getCriteriaDomain().getTrStatus();
        if (form.isSqlInitCheck()) {
            // transferred from W3001
            if (form.isSessionFlg()) {
                // confirm detail
                disableElementList.add("delete");
                disableElementList.add("backToCreate");
                disableElementList.add("register");
                disableElementList.add("edit");
                disableElementList.add("cancelTR");
                if ((!TR_STATUS_ISSUED_TR.equals(trStatus)
                    && !TR_STATUS_ACTIVATE_TR.equals(trStatus))
                    || !form.isPrintableFlg()) {
                    disableElementList.add("printTR");
                }
            } else {
                // edit TR
                disableElementList.add("delete");
                disableElementList.add("backToCreate");
                disableElementList.add("register");
                // TR_STASUS != '20', not display Cancel TR button
                if(!TR_STATUS_ISSUED_TR.equals(trStatus)){
                    disableElementList.add("cancelTR");
                }
                if ((!TR_STATUS_ISSUED_TR.equals(trStatus)
                    && !TR_STATUS_ACTIVATE_TR.equals(trStatus))
                    || !form.isPrintableFlg()) {
                    disableElementList.add("printTR");
                }
                //Thalerngsak add disable edit when cancle TR
                if(!TR_STATUS_ISSUED_TR.equals(trStatus)){
                    disableElementList.add("edit");
                }
            }
        } else {
            // transferred from W3005
            disableElementList.add("edit");
            disableElementList.add("printTR");
            disableElementList.add("cancelTR");
        }
        if (!enableSearch()) {
            disableElementList.add("delete");
            disableElementList.add("register");
            disableElementList.add("edit");
            disableElementList.add("cancelTR");
        }

        // Setting request attributes
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
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

    /**
     * <br />
     * save the pdf file into screenInfo
     * 
     * @param form W3006ActionForm
     * @param report File
     */
    protected void saveReport(W3006ActionForm form, File report) {
        // obtain screen information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
            SCREEN_ID_W3006);

        // save pdf file
        screenInfo.setGeneralArea("report", report);
    }

}
