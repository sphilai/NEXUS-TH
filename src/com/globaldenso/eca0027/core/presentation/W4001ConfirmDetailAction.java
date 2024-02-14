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

import com.globaldenso.eca0027.core.business.domain.W4001ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Confirm Detail action class of Staging Instruction Main screen
 * <br />荷揃え指示Main画面のConfirm Detailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4004Init.do
 *     - "error":W4001.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4001ConfirmDetailAction extends W4001AbstractAction {

    /**
     * Confirm detail facade service.
     */
    protected ProcessFacadeService<Void, W4001ListDomain> w4001ConfirmDetailFacadeService;

    /**
     * Constructor.
     */
    public W4001ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w4001ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w4001ConfirmDetailFacadeService
     */
    public void setW4001ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W4001ListDomain> confirmDetailFacadeService) {
        w4001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set the form.stgInstrNo to W4001ListDomain w4001ListDomain 
     * - Call W4001ConfirmDetailFacadeService.process an argument w4001ListDomain
     *
     * - form.stgInstrNoをW4001ListDomain w4001ListDomainにを設定
     * - w4001ListDomainを引数にW4001ConfirmDetailFacadeService.processの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4001ActionForm form = (W4001ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4001ListDomain w4001ListDomain = new W4001ListDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4001ListDomain, form.getWindowId(), form.getScreenId());
        // Set staging instruction No.
        // 荷揃え指示No.を設定
        w4001ListDomain.setStgInstrNo(form.getStgInstrNo());

        // Call facade service
        // facadeサービスの呼び出し
        w4001ConfirmDetailFacadeService.process(w4001ListDomain);

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
