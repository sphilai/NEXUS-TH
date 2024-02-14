/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
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
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of Register CML Transfer Report screen <br />
 * Register CML Transfer Report画面のRegisterアクションクラスです。
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
public class W3006RegisterAction extends W3006AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<W3TransferDomain, W3006UpdateDomain> w3006RegisterFacadeService;

    /**
     * constructor.
     */
    public W3006RegisterAction() {
        super();
    }

    /**
     * <p>Setter method for w3006RegisterFacadeService.</p>
     *
     * @param registerFacadeService Set for w3006RegisterFacadeService
     */
    public void setW3006RegisterFacadeService(
        TransactFacadeService<W3TransferDomain, W3006UpdateDomain> registerFacadeService) {
        w3006RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Register CML Transfer Report : Register function
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
        W3006UpdateDomain registerDomain = prepareUpdateDomain(w3006Form);
        registerDomain.setCarryOutCompCd(criteriaDomain.getCarryOutCompCd());
        registerDomain.setCarryOutWhCd(criteriaDomain.getCarryOutWhCd());
        registerDomain.setCarryInCompCd(criteriaDomain.getCarryInCompCd());
        registerDomain.setCarryInWhCd(criteriaDomain.getCarryInWhCd());
        registerDomain.setShipperCd(criteriaDomain.getShipperCd());
        registerDomain.setTrNo(criteriaDomain.getTrNo());
        try {
            W3TransferDomain returnDomain = w3006RegisterFacadeService.transact(registerDomain);
            w3006Form.setTrNo(returnDomain.getTrNo());
            w3006Form.setSqlInitCheck(true);
            w3006Form.setSessionFlg(false);
            // Registration completion message settings
            // 登録完了メッセージ設定
            ActionMessages messages = new ActionMessages();
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
                GSCM_I0_0008, returnDomain.getRegisterCnt()));
            saveMessages(request, messages);
        } catch (Exception e) {
            w3006Form.setSqlInitCheck(false);
            super.controlDisplay(w3006Form, request);
            throw e;
        }

        return FORWARD_SUCCESS;
    }

    /**
     * <br />
     * create update Domain
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
        // set languageC and DSC-ID
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
}
