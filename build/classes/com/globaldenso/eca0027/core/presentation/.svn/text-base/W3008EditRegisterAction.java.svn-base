/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0356;
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
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The EditRegidter action class of Register Parts Transfer Report screen <br />
 * Register Parts Transfer Report画面のEditRegidterアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3008.jsp
 *     - &quot;error&quot;:W3008.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008EditRegisterAction extends W3008AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<Void, W3008UpdateDomain> w3008EditRegisterFacadeService;

    /**
     * constructor.
     */
    public W3008EditRegisterAction() {
        super();
    }

    /**
     * <p>Setter method for w3008EditRegisterFacadeService.</p>
     *
     * @param editRegisterFacadeService Set for w3008EditRegisterFacadeService
     */
    public void setW3008EditRegisterFacadeService(
        TransactFacadeService<Void, W3008UpdateDomain> editRegisterFacadeService) {
        w3008EditRegisterFacadeService = editRegisterFacadeService;
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

        W3008ActionForm form = (W3008ActionForm)actForm;

        W3008UpdateDomain updateDomain = prepareUpdateDomain(form);
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        // if all the records are selected, error
        if (form.getListDomainList().size() == updateDomain.getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_0356,
                new Object[] {null}));
            form.setDisplayList(true);
            form.setCallScreenId(SCREEN_ID_W3001);
            super.controlDisplay(form, request);
            throw new ValidationException(messageDomainList);
        }

        w3008EditRegisterFacadeService.transact(updateDomain);
        form.setRegisterFlg(true);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0008, form.getListDomainList().size()));
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
     * @param form W3008ActionForm
     * @return W3008UpdateDomain
     */
    protected W3008UpdateDomain prepareUpdateDomain(W3008ActionForm form) {
        W3008UpdateDomain updateDomain = new W3008UpdateDomain();
        W3008CriteriaDomain w3008CriteriaDomain = ((W3008ActionForm)form)
            .getCriteriaDomain();
        // set common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        ActionUtil.prepareBusinessDomain(w3008CriteriaDomain, form
            .getWindowId(), form.getScreenId());

        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        String userName = windowInfo.getCommonInfo().getUserName();

        // copy Header information
        CommonUtil.copyPropertiesDomainToDomain(updateDomain,
            w3008CriteriaDomain);

        int checkedAmount = 0;

        if (form.getListDomainList() != null) {
            // set languageCd and DSC-ID
            for (W3008ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                listDomain.setUserName(userName);
                if (CHECK_ON.equals(listDomain.getSelected())) {
                    checkedAmount = checkedAmount + 1;
                }
            }
        }
        // set the amount of the checked records
        updateDomain.setCheckedAmount(checkedAmount);

        // set the listDomainList
        updateDomain.setW3008ListDomainList(form.getListDomainList());

        return updateDomain;
    }
}
