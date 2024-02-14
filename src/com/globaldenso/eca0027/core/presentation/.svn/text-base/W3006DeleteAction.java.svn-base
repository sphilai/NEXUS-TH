/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * the Delete action class of Register CML Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3006.jsp
 *     - &quot;error&quot;:W3006.jsp
 * </pre>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006DeleteAction extends W3006AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected DeleteFacadeService<Integer, W3006UpdateDomain> w3006DeleteFacadeService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3006DeleteAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3006DeleteFacadeService.
     * </p>
     * 
     * @param deleteFacadeService Set for w3006DeleteFacadeService
     */
    public void setW3006DeleteFacadeService(
        DeleteFacadeService<Integer, W3006UpdateDomain> deleteFacadeService) {
        w3006DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     * Remove header information
     * Display control Active control of
     * the screen item. ({@link W3001AbstractAction#controlDisplay(W3001ActionForm, HttpServletRequest)})
     * Hide the search results area
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W3006ActionForm w3006form = (W3006ActionForm)form;
        w3006form.setDisplayList(true);
        W3006UpdateDomain deleteDomain = prepareUpdateDomain(w3006form);

        try {
            // Call of facade service
            // facadeサービスの呼び出し
            int updateCount = w3006DeleteFacadeService.delete(deleteDomain);

            // Registration completion message settings
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
                GSCM_I0_0007, updateCount));
            saveMessages(request, messages);
        } catch(Exception e){
            super.controlDisplay(w3006form, request);
            throw e;
        }

        return FORWARD_SUCCESS;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3006ActionForm
     * @return W3006UpdateDomain
     */
    protected W3006UpdateDomain prepareUpdateDomain(W3006ActionForm form) {
        W3006UpdateDomain deleteDomain = new W3006UpdateDomain();

        // set common screen information
        ActionUtil.prepareBusinessDomain(deleteDomain, form.getWindowId(), form
            .getScreenId());

        int checkedAmount = 0;
        // set languageCd and DSC-ID
        for (W3006ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(deleteDomain.getLoginUserDscId());
            if (CHECK_ON.equals(listDomain.getSelected())) {
                checkedAmount = checkedAmount + 1;
            }
        }
        // set the amount of the checked records
        deleteDomain.setCheckedAmount(checkedAmount);

        // set the listDomainList
        deleteDomain.setW3006ListDomainList(form.getListDomainList());

        return deleteDomain;
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
