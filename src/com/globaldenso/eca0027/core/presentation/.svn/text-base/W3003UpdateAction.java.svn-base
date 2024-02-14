/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Print Carry Out List by CML screen <br />
 * Print Carry Out List by CML画面のUpdateアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3003.jsp
 *     - &quot;error&quot;:W3003.jsp
 * </pre>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3003UpdateAction extends W3003AbstractAction {

    /**
     * UpdateFacadeService
     */
    protected TransactFacadeService<Integer, W3003UpdateDomain> w3003UpdateFacadeService;

    /**
     * constructor.
     */
    public W3003UpdateAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3003UpdateFacadeService.
     * </p>
     * 
     * @param updateFacadeService w3003UpdateFacadeService
     */
    public void setW3003UpdateFacadeService(
        TransactFacadeService<Integer, W3003UpdateDomain> updateFacadeService) {
        w3003UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Update of Print Carry Out List by CML
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3003ActionForm form = (W3003ActionForm)actForm;

        W3003UpdateDomain updateDomain = prepareUpdateDomain(form);

        // Call of facade service
        int updateCount = w3003UpdateFacadeService.transact(updateDomain);

        // Registration completion message settings
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0008, updateCount));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * <br />
     * Create Update Domain
     * 
     * @param form W3003ActionForm
     * @return W3003UpdateDomain
     */
    protected W3003UpdateDomain prepareUpdateDomain(W3003ActionForm form) {
        W3003UpdateDomain updateDomain = new W3003UpdateDomain();

        // Set Common Info
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        int checkedAmount = 0;
        List<? extends W3003ListDomain> domainList = form.getListDomainList();
        if (domainList != null) {
            for (W3003ListDomain listDomain : domainList) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                if (CHECK_ON.equals(listDomain.getSelected())) {
                    checkedAmount = checkedAmount + 1;
                }
            }
        }
        // set the amount of checked records
        updateDomain.setCheckedAmount(checkedAmount);

        // Set ListDomain
        updateDomain.setW3003ListDomainList(domainList);

        return updateDomain;
    }
}
