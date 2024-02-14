/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Cancel TR action class of Register Parts Transfer Report screen <br />
 * Register Parts Transfer Report画面のCancel TRアクションクラスです。
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
public class W3008CancelTrAction extends W3008AbstractAction {

    /**
     * UpdateFacadeService
     */
    protected UpdateFacadeService<W3TransferDomain, W3008CriteriaDomain> w3008CancelTrFacadeService;

    /**
     * constructor.
     */
    public W3008CancelTrAction() {
        super();
    }

    /**
     * <p>Setter method for w3008CancelTrFacadeService.</p>
     *
     * @param cancelTrFacadeService Set for w3008CancelTrFacadeService
     */
    public void setW3008CancelTrFacadeService(
        UpdateFacadeService<W3TransferDomain, W3008CriteriaDomain> cancelTrFacadeService) {
        w3008CancelTrFacadeService = cancelTrFacadeService;
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

        W3008ActionForm form = (W3008ActionForm)actForm;

        W3008CriteriaDomain criteriaDomain = ((W3008ActionForm)form)
            .getCriteriaDomain();
        // set common screen information
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(),
            form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        W3TransferDomain cancelResult = w3008CancelTrFacadeService.update(criteriaDomain);
        form.setRegisterFlg(true);
        form.setCancelFlg(true);
        form.setTrNo(cancelResult.getTrNo());

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0008, cancelResult.getUpdateCnt()));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

}
