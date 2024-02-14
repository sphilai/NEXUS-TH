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

import com.globaldenso.eca0027.core.business.domain.W4005ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Confirm Detail action class of Staging Actuality Main screen
 * <br />山作り実績Main画面のConfirm Detailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4008Init.do
 *     - "error":W4005.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4005ConfirmDetailAction extends W4005AbstractAction {

    /**
     * Confirm detail facade service.
     */
    protected ProcessFacadeService<Void, W4005ListDomain> w4005ConfirmDetailFacadeService;

    /**
     * Constructor.
     */
    public W4005ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w4005ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w4005ConfirmDetailFacadeService
     */
    public void setW4005ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W4005ListDomain> confirmDetailFacadeService) {
        w4005ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set the form.stgActNo to W4005ListDomain w4005ListDomain 
     * - Call W4005ConfirmDetailFacadeService.process an argument w4005ListDomain
     *
     * - form.stgActNoをW4005ListDomain w4005ListDomainにを設定
     * - w4005ListDomainを引数にW4005ConfirmDetailFacadeService.processの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4005ActionForm form = (W4005ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4005ListDomain w4005ListDomain = new W4005ListDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4005ListDomain, form.getWindowId(), form.getScreenId());
        // Set staging actuality No.
        // 山作り実績No.を設定
        w4005ListDomain.setStgActNo(form.getStgActNo());

        // Call facade service
        // facadeサービスの呼び出し
        w4005ConfirmDetailFacadeService.process(w4005ListDomain);

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
