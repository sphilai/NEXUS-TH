/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_3003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3009R;
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

import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3009UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <p>
 * W3009ReceiveAction
 * </p>
 * 
 * @author DIAT Thalerngsak.p
 * @version 1.00
 */
public class W3009ReceiveAction extends W3009AbstractAction {

    /**
     * TransactionFacadeService
     */
    protected TransactFacadeService<Void, W3009UpdateDomain> w3009ReceiveFacadeService;

    /**
     * <p>
     * constructor
     * </p>
     */
    public W3009ReceiveAction() {
        super();
    }

    /**
     * <p>
     * w3009ReceiveFacadeService setter
     * </p>
     * 
     * @param receiveFacadeService w3009ReceiveFacadeService set
     */
    public void setW3009ReceiveFacadeService(
        TransactFacadeService<Void, W3009UpdateDomain> receiveFacadeService) {
        w3009ReceiveFacadeService = receiveFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3009ActionForm w3009Form = (W3009ActionForm)form;
        // Prepare update domain
        W3009UpdateDomain w3009Update = prepareUpdateDomain(w3009Form);
        // Call activate TR service
        w3009ReceiveFacadeService.transact(w3009Update);

        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            NXS_I1_3003, 1));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * Prepare Update domain for TR activate -Set of common information screen
     * -Get TR information from the selected TR for update -Set update list
     * domain
     * 
     * @param form form
     * @return updateDomain updateDomain
     * @throws GscmApplicationException GscmApplicationException
     */
    protected W3009UpdateDomain prepareUpdateDomain(W3009ActionForm form) throws GscmApplicationException {

        W3009UpdateDomain updateDomain = new W3009UpdateDomain();
        List<W3009ListDomain> listW3009 = new ArrayList<W3009ListDomain>();
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());
        // Get TR information from the selected TR for update
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3009ListDomain listDomain : form.getW3009ListDomainList()) {
                // for (W3001ListDomain listDomain : form.getListDomainList()) {
                if (form.getTrNo().equals(listDomain.getTrNo())) {
                    listDomain.setLanguageCd(form.getLanguageCd());
                    listDomain.setLoginUserDscId(updateDomain
                        .getLoginUserDscId());
                    listW3009.add(listDomain);
                }
            }
        }
        // Set update list domain
        updateDomain.setTrNo(form.getTrNo());
        updateDomain.setListDomainList(listW3009);
       // TODO Thalerngsak Add to get Auth List
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            updateDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W3009R, PERMIT_FUNC_ID_W3009B};
            List<? extends UserAuthDomain> userAuthList = userAuthService
                .getUserAuthList(permitFuncIdList);

            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            updateDomain.setUserAuthList(userAuthList);
        }
        //Add end

        return updateDomain;
    }
}
