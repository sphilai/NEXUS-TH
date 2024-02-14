/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4004Init.do
 *     - "successW4003":/W4003Init.do
 *     - "error":W4004.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5193 $
 */
public class W4004DeleteAction extends W4004AbstractAction {

    /**
     * Delete facade service.
     */
    protected DeleteFacadeService<Integer, W4004UpdateDomain> w4004DeleteFacadeService;

    /**
     * constructor.
     */
    public W4004DeleteAction() {
        super();
    }

    /**
     * Setter method for w4004DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w4004DeleteFacadeService
     */
    public void setW4004DeleteFacadeService(
        DeleteFacadeService<Integer, W4004UpdateDomain> deleteFacadeService) {
        w4004DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4004UpdateDomain updateDomain mass update domain 
     * - Set to updateDomain.criteriaDomain, the form.criteriaDomain 
     * - Call the W4004DeleteFacadeService.transact an argument updateDomain
     * - If it becomes 0 Reviews, Transition to the former screen transition
     *
     * - 一括更新ドメインのインスタンスW4004UpdateDomain updateDomainを作成
     * - form.listDomainを、updateDomain.listDomainListに設定
     * - updateDomainを引数にW4004DeleteFacadeService.deleteの呼び出し
     * - 0件になった場合、遷移元画面に遷移
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4004ActionForm form = (W4004ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4004UpdateDomain w4004UpdateDomain = new W4004UpdateDomain();
        w4004UpdateDomain.setW4004ListDomainList(form.getW4004ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4004UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        int resultCount = w4004DeleteFacadeService.delete(w4004UpdateDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0007, resultCount));
        saveMessages(request, messages);

        // When it becomes 0 Listings
        // 0件になった場合
        if (resultCount == form.getW4004ListDomainList().size()) {
            return FORWARD_SUCCESS + SCREEN_ID_W4003;
        }

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
