/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Register action class of Staging Instruction create screen
 * <br />荷揃え指示Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4004Init.do
 *     - "error":W4003.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4003MoveToRegisterAction extends W4003AbstractAction {

    /**
     * Move to register facade service.
     */
    protected ProcessFacadeService<Void, W4003CriteriaDomain> w4003MoveToRegisterFacadeService;

    /**
     * constructor.
     */
    public W4003MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w4003MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w4003MoveToRegisterFacadeService
     */
    public void setW4003MoveToRegisterFacadeService(
        ProcessFacadeService<Void, W4003CriteriaDomain> moveToRegisterFacadeService) {
        w4003MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call MoveToRegisterFacadeService.process an argument form.w4003CriteriaDomain
     *
     * - form.w4003CriteriaDomainを引数にW4003MoveToRegisterFacadeService.processの呼び出し
     * <pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4003ActionForm form = (W4003ActionForm)actForm;

        // Get PL domain
        // PLドメイン取得
        W4003CriteriaDomain w4003CriteriaDomain = form.getW4003CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4003CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Call facade service
        // facadeサービスの呼び出し
        w4003MoveToRegisterFacadeService.process(w4003CriteriaDomain);

        return FORWARD_SUCCESS;
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
