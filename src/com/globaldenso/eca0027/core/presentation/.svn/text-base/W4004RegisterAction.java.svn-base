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

import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4004Init.do
 *     - "error":W4004.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4004RegisterAction extends W4004AbstractAction {

    /**
     * Register facade service.
     */
    protected TransactFacadeService<String, W4004UpdateDomain> w4004RegisterFacadeService;

    /**
     * constructor.
     */
    public W4004RegisterAction() {
        super();
    }

    /**
     * Setter method for w4004RegisterFacadeService.
     *
     * @param registerFacadeService Set for w4004RegisterFacadeService
     */
    public void setW4004RegisterFacadeService(
        TransactFacadeService<String, W4004UpdateDomain> registerFacadeService) {
        w4004RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4001UpdateDomain updateDomain mass update domain 
     * - Set to updateDomain.criteriaDomain, the form.criteriaDomain 
     * - Set to updateDomain.listDomainList, the form.listDomain 
     * - Call the W4004RegisterFacadeService.transact an argument updateDomain
     *
     * - 一括更新ドメインのインスタンスW4001UpdateDomain updateDomainを作成
     * - form.criteriaDomainを、updateDomain.criteriaDomainに設定
     * - form.listDomainを、updateDomain.listDomainListに設定
     * - updateDomainを引数にW4004RegisterFacadeService.transactの呼び出し
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
        w4004UpdateDomain.setW4004CriteriaDomain(form.getW4004CriteriaDomain());
        w4004UpdateDomain.setW4004ListDomainList(form.getW4004ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4004UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        String resultStgInstrNo = w4004RegisterFacadeService.transact(w4004UpdateDomain);

        // The cooperation forward to a destination new staging instruction No.
        // 新規荷揃え指示NOをフォワード先に連携
        form.setStgInstrNo(resultStgInstrNo);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, 1));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }
}
