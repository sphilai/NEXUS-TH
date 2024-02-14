/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3014;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_3003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
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
import com.globaldenso.eca0027.core.business.domain.W3010DetailDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ReceiveDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Receive action class
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3010.jsp
 *     - &quot;error&quot;:W3010.jsp
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010ReceiveAction extends W3010AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<Void, W3010ReceiveDomain> w3010ReceiveFacadeService;

    /**
     * constructor.
     */
    public W3010ReceiveAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3010ReceiveFacadeService.
     * </p>
     * 
     * @param receiveFacadeService Set for w3010ReceiveFacadeService
     */
    public void setW3010ReceiveFacadeService(
        TransactFacadeService<Void, W3010ReceiveDomain> receiveFacadeService) {
        w3010ReceiveFacadeService = receiveFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Print Carry Out List by CML : Receive
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

        W3010ActionForm w3010Form = (W3010ActionForm)actForm;
        W3010DetailDomain criteria = w3010Form.getDetailDomain();
        W3010ReceiveDomain updateDomain = new W3010ReceiveDomain();
        updateDomain = prepareUpdateDomain(w3010Form);
        updateDomain.setCarryOutCompCd(criteria.getCarryOutCompCd());
        updateDomain.setCarryOutWhCd(criteria.getCarryOutWhCd());
        updateDomain.setCarryInCompCd(criteria.getCarryInCompCd());
        updateDomain.setCarryInWhCd(criteria.getCarryInWhCd());
        updateDomain.setShipperCd(criteria.getShipperCd());
        updateDomain.setTrNo(criteria.getTrNo());
        // Call of facade service
        // facadeサービスの呼び出し
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(WINDOW_ID_0);
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo
            .getCommonInfo();
        updateDomain.setUserName(eca0027CommonInfoDomain.getUserName());
        try {
            w3010ReceiveFacadeService.transact(updateDomain);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e){
            List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
            messageDomainList.add(new MessageDomain(null, NXS_E1_3014,
                new Object[] {null}));
            throw new ValidationException(messageDomainList);
        }
        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            NXS_I1_3003, null));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3010ActionForm
     * @return W3010ReceiveDomain
     */
    protected W3010ReceiveDomain prepareUpdateDomain(W3010ActionForm form) {
        W3010ReceiveDomain updateDomain = new W3010ReceiveDomain();

        // set the common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        List<? extends W3010ListDomain> domainList = form.getListDomainList();
        if (domainList != null) {
            // set languageCd and DSC-ID
            for (W3010ListDomain listDomain : domainList) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
            }
        }

        // set the listDomainList
        updateDomain.setW3010ListDomainList(domainList);
        return updateDomain;
    }

}
