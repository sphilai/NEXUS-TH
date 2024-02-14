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

import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Initialize action class of Staging Actuality Header screen
 * <br />山作り実績Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4006.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4006InitAction extends W4006AbstractAction {

    /**
     * Init facade service.
     */
    protected DeleteFacadeService<Integer, W4006CriteriaDomain> w4006InitFacadeService;

    /**
     * constructor.
     */
    public W4006InitAction() {
        super();
    }

    /**
     * Setter method for w4006InitFacadeService.
     *
     * @param initFacadeService Set for w4006InitFacadeService
     */
    public void setW4006InitFacadeService(
        DeleteFacadeService<Integer, W4006CriteriaDomain> initFacadeService) {
        w4006InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Clear indication of staging actuality work
     *     - An argument form.w4006CriteriaDomain, I call the W4006InitFacadeService.delete
     *
     * - 山作り実績ワークのクリア
     *     - form.w4006CriteriaDomainを引数に、W4006InitFacadeService.deleteの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4006ActionForm form = (W4006ActionForm)actForm;

        // PL domain registration
        // PLドメイン取得
        W4006CriteriaDomain w4006CriteriaDomain = form.getW4006CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4006CriteriaDomain, form.getWindowId(), form.getScreenId());

        // call of service facade
        // facadeサービスの呼び出し
        w4006InitFacadeService.delete(w4006CriteriaDomain);

        return FORWARD_SUCCESS;
    }
}
