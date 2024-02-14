/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0356;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * the Delete action class of Register Parts Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3008.jsp
 *     - &quot;error&quot;:W3008.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008DeleteAction extends W3008AbstractAction {

    /**
     * <p>
     * Delete facade service
     * </p>
     */
    protected DeleteFacadeService<Void, W3008UpdateDomain> w3008DeleteFacadeService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3008DeleteAction() {
        super();
    }

    /**
     * <p>Setter method for w3008DeleteFacadeService.</p>
     *
     * @param deleteFacadeService Set for w3008DeleteFacadeService
     */
    public void setW3008DeleteFacadeService(
        DeleteFacadeService<Void, W3008UpdateDomain> deleteFacadeService) {
        w3008DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc} Delete the record which has been checked from database
     * Active control of the screen item. ({@link W3001AbstractAction#controlDisplay(W3001ActionForm, HttpServletRequest)})
     * Hide the search results area
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

        W3008ActionForm form = (W3008ActionForm)actForm;

        W3008UpdateDomain updateDomain = prepareUpdateDomain(form);
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if (0 == updateDomain.getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E7_3007,
                new Object[] {null}));
            form.setDisplayList(true);
            super.controlDisplay(form, request);
            throw new ValidationException(messageDomainList);
        } else if (updateDomain.getW3008ListDomainList().size() == updateDomain
            .getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_0356,
                new Object[] {null}));
            form.setDisplayList(true);
            super.controlDisplay(form, request);
            throw new ValidationException(messageDomainList);
        }

        // Call of facade service
        // facadeサービスの呼び出し
        w3008DeleteFacadeService.delete(updateDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0007, updateDomain.getCheckedAmount()));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3008ActionForm
     * @return W3008UpdateDomain
     */
    protected W3008UpdateDomain prepareUpdateDomain(W3008ActionForm form) {
        W3008UpdateDomain updateDomain = new W3008UpdateDomain();

        // set common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        int checkedAmount = 0;
        // set languageCd and DSC-ID
        for (W3008ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
            if (CHECK_ON.equals(listDomain.getSelected())) {
                checkedAmount = checkedAmount + 1;
            }
        }
        // set the amount of the checked records
        updateDomain.setCheckedAmount(checkedAmount);

        // set the listDomainList
        updateDomain.setW3008ListDomainList(form.getListDomainList());

        return updateDomain;
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
