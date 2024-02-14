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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Initialize action class of Staging Instruction Header screen
 * <br />荷揃え指示Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4002.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4002InitAction extends W4002AbstractAction {

    /**
     * Init facade service.
     */
    protected DeleteFacadeService<Integer, W4002CriteriaDomain> w4002InitFacadeService;

    /**
     * constructor.
     */
    public W4002InitAction() {
        super();
    }

    /**
     * Setter method for w4002InitFacadeService.
     *
     * @param initFacadeService Set for w4002InitFacadeService
     */
    public void setW4002InitFacadeService(
        DeleteFacadeService<Integer, W4002CriteriaDomain> initFacadeService) {
        w4002InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Clear indication of staging instruction work
     *     - An argument form.w4002CriteriaDomain, I call the W4002InitFacadeService.delete
     *
     * - 荷揃え指示ワークのクリア
     *     - form.w4002CriteriaDomainを引数に、W4002InitFacadeService.deleteの呼び出し
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
        w4002InitFacadeService.delete(w4002CriteriaDomain);

        return FORWARD_SUCCESS;
    }
}
