/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of Staging Actuality Register screen
 * <br />山作り実績Register画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4008Init.do
 *     - "successW4007":/W4007Init.do
 *     - "error":W4008.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5193 $
 */
public class W4008DeleteAction extends W4008AbstractAction {

    /**
     * Delete facade service.
     */
    protected DeleteFacadeService<Integer, W4008UpdateDomain> w4008DeleteFacadeService;

    /**
     * constructor.
     */
    public W4008DeleteAction() {
        super();
    }

    /**
     * Setter method for w4008DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w4008DeleteFacadeService
     */
    public void setW4008DeleteFacadeService(
        DeleteFacadeService<Integer, W4008UpdateDomain> deleteFacadeService) {
        w4008DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4008UpdateDomain updateDomain mass update domain 
     * - Set to updateDomain.criteriaDomain, the form.criteriaDomain 
     * - Call the W4008DeleteFacadeService.transact an argument updateDomain
     * - If it becomes 0 Reviews, Transition to the former screen transition
     *
     * - 一括更新ドメインのインスタンスW4008UpdateDomain updateDomainを作成
     * - form.listDomainを、updateDomain.listDomainListに設定
     * - updateDomainを引数にW4008DeleteFacadeService.deleteの呼び出し
     * - 0件になった場合、遷移元画面に遷移
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4008ActionForm form = (W4008ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4008UpdateDomain w4008UpdateDomain = new W4008UpdateDomain();
        w4008UpdateDomain.setW4008ListDomainList(form.getW4008ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4008UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        int resultCount = w4008DeleteFacadeService.delete(w4008UpdateDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0007, resultCount));
        saveMessages(request, messages);

        // When it becomes 0 Listings
        // 0件になった場合
        if (resultCount == form.getW4008ListDomainList().size()) {
            return FORWARD_SUCCESS + SCREEN_ID_W4007;
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
