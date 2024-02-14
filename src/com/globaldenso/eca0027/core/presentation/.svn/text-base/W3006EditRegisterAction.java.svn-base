/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0355;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The EditRegister action class of Register CML Transfer Report screen <br />
 * Register CML Transfer Report画面のEditRegisterアクションクラスです。
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
public class W3006EditRegisterAction extends W3006AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<Void, W3006UpdateDomain> w3006EditRegisterFacadeService;

    /**
     * constructor.
     */
    public W3006EditRegisterAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3006EditRegisterFacadeService.
     * </p>
     * 
     * @param editRegisterFacadeService Set for w3006EditRegisterFacadeService
     */
    public void setW3006EditRegisterFacadeService(
        TransactFacadeService<Void, W3006UpdateDomain> editRegisterFacadeService) {
        w3006EditRegisterFacadeService = editRegisterFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Register CML Transfer Report : EditRegister
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

        W3006ActionForm w3006form = (W3006ActionForm)actForm;
        W3006CriteriaDomain criteriaDomain = w3006form.getCriteriaDomain();
        w3006form.setDisplayList(true);
        W3006UpdateDomain editRegisterDomain = prepareUpdateDomain(w3006form);
        editRegisterDomain.setTrNo(criteriaDomain.getTrNo());
        w3006form.setSqlInitCheck(criteriaDomain.isSqlInitCheck());
        w3006form.setSessionFlg(criteriaDomain.isSessionFlg());
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // if no record is selected, error
        if (0 == editRegisterDomain.getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E7_3007,
                new Object[] {null}));
            w3006form.setDisplayList(true);
            w3006form.setCallScreenId(SCREEN_ID_W3001);
            super.controlDisplay(w3006form, request);
            throw new ValidationException(messageDomainList);
        }
        
        // if all the records are selected, error
        if (w3006form.getListDomainList().size() == editRegisterDomain
            .getCheckedAmount()) {
            // kimura update message code 0356 -> 0355
            messageDomainList.add(new MessageDomain(null, NXS_E1_0355,
                new Object[] {null}));
            w3006form.setDisplayList(true);
            w3006form.setCallScreenId(SCREEN_ID_W3001);
            super.controlDisplay(w3006form, request);
            throw new ValidationException(messageDomainList);
        }

        try {
            w3006EditRegisterFacadeService.transact(editRegisterDomain);
        } catch (Exception e) {
            super.controlDisplay(w3006form, request);
            throw e;
        }
        // Deletion completion message settings
        // 削除完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0007, editRegisterDomain.getCheckedAmount()));
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
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        String userName = windowInfo.getCommonInfo().getUserName();
        int checkedAmount = 0;
        // set languageCd and DSC-ID
        for (W3006ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(deleteDomain.getLoginUserDscId());
            listDomain.setUserName(userName);
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
}
