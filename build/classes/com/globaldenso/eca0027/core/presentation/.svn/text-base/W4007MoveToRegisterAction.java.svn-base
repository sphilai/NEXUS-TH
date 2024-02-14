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

import com.globaldenso.eca0027.core.business.domain.W4007CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Register action class of Staging Actuality create screen
 * <br />山作り実績Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4008Init.do
 *     - "error":W4007.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4007MoveToRegisterAction extends W4007AbstractAction {

    /**
     * Move to register facade service.
     */
    protected ProcessFacadeService<Void, W4007CriteriaDomain> w4007MoveToRegisterFacadeService;

    /**
     * constructor.
     */
    public W4007MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w4007MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w4007MoveToRegisterFacadeService
     */
    public void setW4007MoveToRegisterFacadeService(
        ProcessFacadeService<Void, W4007CriteriaDomain> moveToRegisterFacadeService) {
        w4007MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call MoveToRegisterFacadeService.process an argument form.w4007CriteriaDomain
     *
     * - form.w4007CriteriaDomainを引数にW4007MoveToRegisterFacadeService.processの呼び出し
     * <pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4007ActionForm form = (W4007ActionForm)actForm;

        // Get PL domain
        // PLドメイン取得
        W4007CriteriaDomain w4007CriteriaDomain = form.getW4007CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4007CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Call facade service
        // facadeサービスの呼び出し
        w4007MoveToRegisterFacadeService.process(w4007CriteriaDomain);

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
