/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * the initial action class of Carry out Header
 *<pre>
 *  forward name-path mappings:
 *     - "success":W3002.jsp
 *     - "error":-
 *</pre>
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3002InitAction extends W3002AbstractAction {

    /**
     * <p>Init facade service</p>
     */
    protected DeleteFacadeService<Integer, W3002CriteriaDomain> w3002InitFacadeService;

    
    /**
     * <p>Constructor method.</p>
     *
     */
    public W3002InitAction() {
        super();
    }
    
    /**
     * <p>Setter method for w3002InitFacadeService.</p>
     *
     * @param deleteFacadeService Set for w3002InitFacadeService
     */
    public void setW3002InitFacadeService(
        DeleteFacadeService<Integer, W3002CriteriaDomain> deleteFacadeService) {
        w3002InitFacadeService = deleteFacadeService;
    }
    
    
    /**
     * {@inheritDoc}
     * Remove header information
     * Display control
     *      Active control of the screen item.
     *     ({@link W3001AbstractAction#controlDisplay(W3001ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actform,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W3002ActionForm form = (W3002ActionForm)actform;
        
        W3002CriteriaDomain w3002CriteriaDomain = form.getCriteriaDomain();
        
        String callScreenId = form.getCallScreenId();
        
        // Obtain windowInfoDomain,
        WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(WINDOW_ID_0);
        if(SCREEN_ID_W3001.equals(callScreenId)){
            // Obtain screenInfoDomain and W3001CriteriaDomain
            ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W3001);
            W3001CriteriaDomain w3001CriteriaDomain
                = ((W3001ActionForm)screenInfoDomain.getActionForm()).getCriteriaDomain();
            
            // set W3001's input values to W3002's criteria form
            w3002CriteriaDomain.setCarryInCompCd(w3001CriteriaDomain.getToWhComCd());
            w3002CriteriaDomain.setCarryInWhCd(w3001CriteriaDomain.getToWhCd());
            w3002CriteriaDomain.setCarryOutCompCd(w3001CriteriaDomain.getFmWhComCd());
            w3002CriteriaDomain.setCarryOutWhCd(w3001CriteriaDomain.getFmWhCd());
            w3002CriteriaDomain.setShipperCd(w3001CriteriaDomain.getShipperCd());
            
        }
        // Call DeleteFacadeService to delete the records of Work Tables
        w3002InitFacadeService.delete(w3002CriteriaDomain);
        // To complement the common information
        ActionUtil.prepareBusinessDomain(w3002CriteriaDomain, form.getWindowId(), form.getScreenId());
        
        return FORWARD_SUCCESS;
    }
}
