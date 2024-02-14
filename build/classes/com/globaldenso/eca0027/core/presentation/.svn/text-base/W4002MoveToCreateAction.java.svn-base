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

import com.globaldenso.eca0027.core.business.domain.W4002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Create action class of Staging Instruction Header screen
 * <br />荷揃え指示Header画面のMove to Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4003Init.do
 *     - "error":W4002.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4002MoveToCreateAction extends W4002AbstractAction {

    /**
     * Move to create facade service.
     */
    protected SearchFacadeService<Void, W4002CriteriaDomain> w4002MoveToCreateFacadeService;

    /**
     * constructor.
     */
    public W4002MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w4002MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w4002MoveToCreateFacadeService
     */
    public void setW4002MoveToCreateFacadeService(
        SearchFacadeService<Void, W4002CriteriaDomain> moveToCreateFacadeService) {
        w4002MoveToCreateFacadeService = moveToCreateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call W4002MoveToCreateFacadeService.search an argument form.w4002CriteriaDomain
     *
     * - form.w4002CriteriaDomainを引数にW4002MoveToCreateFacadeService.searchの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4002ActionForm form = (W4002ActionForm)actForm;

        // PL domain registration
        // PLドメイン取得
        W4002CriteriaDomain w4002CriteriaDomain = form.getW4002CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4002CriteriaDomain, form.getWindowId(), form.getScreenId());

        // call of service facade
        // facadeサービスの呼び出し
        w4002MoveToCreateFacadeService.search(w4002CriteriaDomain);

        return FORWARD_SUCCESS;
    }
}
