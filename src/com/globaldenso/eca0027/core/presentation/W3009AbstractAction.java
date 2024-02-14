/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FLAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TR_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TR_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_FLG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TR_STS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TR_TYPE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * <p>
 * AbstractAction class for screen W3009
 * </p>
 * 
 * @author Thalerngsak.P
 * @version 1.00
 */
public abstract class W3009AbstractAction extends AbstractAction {
    /**
     * common service
     */
    protected CommonService commonService;

    /**
     * User authorize service
     */
    protected UserAuthService userAuthService;

    /**
     * <p>
     * constructor
     * </p>
     */
    public W3009AbstractAction() {
    }

    /**
     * <p>
     * Setter method for commonService.
     * </p>
     * 
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        W3009ActionForm w3009form = (W3009ActionForm)form;
        // Get the screen of common items
        setCommonInfo(w3009form);
        // Setting of the pull-down list
        searchPullDownList(request, w3009form.getLanguageCd());

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        W3009ActionForm w3009form = (W3009ActionForm) form;
        
        controlDisplay(w3009form, request);
        
        ((W3009ActionForm)form).setCallScreenId(SCREEN_ID_W3009);
    }

    /**
     * - The item of screen common information and languageCd are set to action
     * form.
     * 
     * @param form form
     */
    protected void setCommonInfo(W3009ActionForm form) {
        // Acquisition of screen common information domain
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
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
        List<? extends SelectListItemDomain> statusCdList = commonService
            .searchPullDownList(CD_TYPE_TR_STS, langCd,
                PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> editFlgCdList = commonService
            .searchPullDownList(CD_TYPE_FLG, langCd,
                PULLDOWN_DISP_TYPE_CODE, true);
        List<? extends SelectListItemDomain> trKindCdList = commonService
            .searchPullDownList(CD_TYPE_TR_TYPE, langCd,
                PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> trIssuerCdList = commonService
            .searchPullDownList(CD_TYPE_ISSUER, langCd,
                PULLDOWN_DISP_TYPE_CODE_VALUE, true);

        // Setting request attributes.
        request.setAttribute(ATTR_TR_STATUS, statusCdList);
        request.setAttribute(ATTR_FLAG, editFlgCdList);
        request.setAttribute(ATTR_TR_TYPE, trKindCdList);
        request.setAttribute(ATTR_ISSUER, trIssuerCdList);
    }

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param form form
     * @param request request
     */
    protected void controlDisplay(W3009ActionForm form,
        HttpServletRequest request) {

        if (!userAuthService.hasRegisterAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W3009R });
            if (userAuthList.size() == 0) {
                request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, Arrays.asList("receive"));
            }
        }
    }
}
