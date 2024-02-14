/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3001UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Activate TR from carry-out main screen
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001ActivateAction extends W3001AbstractAction {
    
    /**
     * TransactionFacadeService
     */
    protected TransactFacadeService <Void , W3001UpdateDomain> w3001ActivateFacadeService;
    
    /**
     * Constructor
     */
    public W3001ActivateAction() {
        super();
    }
    
    /**
     * <p>Setter method for w3001ActivateFacadeService.</p>
     *
     * @param activateFacadeService Set for w3001ActivateFacadeService
     */
    public void setW3001ActivateFacadeService(
        TransactFacadeService<Void, W3001UpdateDomain> activateFacadeService) {
        w3001ActivateFacadeService = activateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Change TR status to "Activated TR"
     *      -Prepare update domain from W3001 form domain
     *      -Call activate TR service
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W3001ActionForm w3001Form = (W3001ActionForm) form;
        //Prepare update domain 
        W3001UpdateDomain w3001Update = prepareUpdateDomain(w3001Form);
        //Call activate TR service
        w3001ActivateFacadeService.transact(w3001Update);
       
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(NXS_I1_3001, 1));
        saveMessages(request, messages);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Prepare Update domain for TR activate
     *      -Set of common information screen
     *      -Get TR information from the selected TR for update
     *      -Set update list domain
     * @param form W3001ActionForm
     * @return updateDomain updateDomain
     * @throws ApplicationException ApplicationException
     */
    protected W3001UpdateDomain prepareUpdateDomain(W3001ActionForm form)
        throws ApplicationException {
        W3001UpdateDomain updateDomain = new W3001UpdateDomain();
        List<W3001ListDomain> listW3001 = new ArrayList<W3001ListDomain>();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        // Get TR information from the selected TR for update
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3001ListDomain listDomain : form.getW3001ListDomainList()) {
                // for (W3001ListDomain listDomain : form.getListDomainList()) {
                if (form.getTrNo().equals(listDomain.getTrNo())) {
                    listDomain.setLanguageCd(form.getLanguageCd());
                    listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                    listW3001.add(listDomain);
                }
            }
         // TODO Chaiporn Add to get Auth List
            updateDomain.setShipperCd(listW3001.get(0).getShipperCd());
            updateDomain.setTrNo(form.getTrNo());
            updateDomain.setListDomainList(listW3001);
            updateDomain.setScreenId(form.getScreenId());
            if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
                updateDomain.setUserAuthList(null);
            } else {
                String[] permitFuncIdList = {PERMIT_FUNC_ID_W3001R, PERMIT_FUNC_ID_W3001B};
                List<? extends UserAuthDomain> userAuthList = userAuthService
                    .getUserAuthList(permitFuncIdList);

                if (userAuthList.size() == 0) {
                    throw new GscmApplicationException(GSCM_I0_0009);
                }
                updateDomain.setUserAuthList(userAuthList);
            }
            //Add end
        }
        return updateDomain;
    }

}
