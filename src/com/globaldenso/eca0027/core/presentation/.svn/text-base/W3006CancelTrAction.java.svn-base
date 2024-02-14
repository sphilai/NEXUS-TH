/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0360;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Cancel TR action class of Register CML Transfer Report screen <br />
 * Register CML Transfer Report画面のCancel TRアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3006.jsp
 *     - &quot;error&quot;:W3006.jsp
 * </pre>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006CancelTrAction extends W3006AbstractAction {

    /**
     * 更新Facadeサービス
     */
    protected UpdateFacadeService<Integer, W3006UpdateDomain> w3006CancelTrFacadeService;

    /**
     * constructor.
     */
    public W3006CancelTrAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3006CancelTrFacadeService.
     * </p>
     * 
     * @param cancelTrFacadeService Set for w3006CancelTrFacadeService
     */
    public void setW3006CancelTrFacadeService(
        UpdateFacadeService<Integer, W3006UpdateDomain> cancelTrFacadeService) {
        w3006CancelTrFacadeService = cancelTrFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Cancel CML Transfer Report : Cancel
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

        W3006ActionForm w3006Form = (W3006ActionForm)actForm;
        W3006CriteriaDomain criteriaDomain = w3006Form.getCriteriaDomain();
        w3006Form.setDisplayList(true);
        W3006UpdateDomain updateDomain = prepareUpdateDomain(w3006Form);
        updateDomain.setTrNo(criteriaDomain.getTrNo());
        w3006Form.setSqlInitCheck(criteriaDomain.isSqlInitCheck());
        w3006Form.setSessionFlg(criteriaDomain.isSessionFlg());
        try {
            int updateCnt = w3006CancelTrFacadeService.update(updateDomain);
            w3006Form.setSqlInitCheck(true);
            w3006Form.setSessionFlg(true);

            // Registration completion message settings
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
                NXS_E1_0360, updateCnt));
            saveMessages(request, messages);
        } catch (Exception e) {
            super.controlDisplay(w3006Form, request);
            throw e;
        }
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
     * create updateDomain
     * 
     * @param form W3006ActionForm
     * @return W3006UpdateDomain
     */
    protected W3006UpdateDomain prepareUpdateDomain(W3006ActionForm form) {
        W3006UpdateDomain deleteDomain = new W3006UpdateDomain();

        // set the common screen information
        ActionUtil.prepareBusinessDomain(deleteDomain, form.getWindowId(), form
            .getScreenId());

        // set the languageCd and DSC-ID
        for (W3006ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(deleteDomain.getLoginUserDscId());
        }

        // set the listDomainList
        deleteDomain.setW3006ListDomainList(form.getListDomainList());

        return deleteDomain;
    }
}
