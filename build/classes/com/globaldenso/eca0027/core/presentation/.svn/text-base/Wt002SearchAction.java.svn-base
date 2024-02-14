/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 29, 2015
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.Wt002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt002ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author XXXXXXXXXXX
 * @version 1.00
 */
public class Wt002SearchAction extends Wt002AbstractAction {
    
    /**
     * <p>Type in the role of the field.</p>
     */
    protected SearchFacadeService<List<Wt002ListDomain>, Wt002CriteriaDomain> 
    wt002SearchFacadeService = null;

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Wt002SearchAction() {
    }

    /**
     * <p>Setter method for wt002SearchFacadeService.</p>
     *
     * @param wt002SearchFacadeService Set for wt002SearchFacadeService
     */
    public void setWt002SearchFacadeService(
        SearchFacadeService<List<Wt002ListDomain>, Wt002CriteriaDomain> wt002SearchFacadeService) {
        this.wt002SearchFacadeService = wt002SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        Wt002ActionForm thisForm = (Wt002ActionForm)form;
        
        thisForm.setWt002ListDomainList(null);
        
        Wt002CriteriaDomain criteria = thisForm.getWt002CriteriaDomain();
        
        criteria.setScreenId(thisForm.getScreenId());
        
        // Set locale information.
        Locale locale = (Locale)request.getSession(false).getAttribute(
            thisForm.getWindowId() + "_locale");
        criteria.setLocale(locale);
        
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        criteria.setPageInfoCreator(creator);
        
        List <Wt002ListDomain> listDomainList = wt002SearchFacadeService.search(criteria);
        
        thisForm.setWt002ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }

}
