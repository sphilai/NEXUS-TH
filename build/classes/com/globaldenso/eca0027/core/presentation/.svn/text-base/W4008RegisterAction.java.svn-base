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

import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of Staging Actuality Register screen
 * <br />山作り実績Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4008Init.do
 *     - "error":W4008.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4008RegisterAction extends W4008AbstractAction {

    /**
     * Register facade service.
     */
    protected TransactFacadeService<String, W4008UpdateDomain> w4008RegisterFacadeService;

    /**
     * constructor.
     */
    public W4008RegisterAction() {
        super();
    }

    /**
     * Setter method for w4008RegisterFacadeService.
     *
     * @param registerFacadeService Set for w4008RegisterFacadeService
     */
    public void setW4008RegisterFacadeService(
        TransactFacadeService<String, W4008UpdateDomain> registerFacadeService) {
        w4008RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4005UpdateDomain updateDomain mass update domain 
     * - Set to updateDomain.criteriaDomain, the form.criteriaDomain 
     * - Set to updateDomain.listDomainList, the form.listDomain 
     * - Call the W4008RegisterFacadeService.transact an argument updateDomain
     *
     * - 一括更新ドメインのインスタンスW4005UpdateDomain updateDomainを作成
     * - form.criteriaDomainを、updateDomain.criteriaDomainに設定
     * - form.listDomainを、updateDomain.listDomainListに設定
     * - updateDomainを引数にW4008RegisterFacadeService.transactの呼び出し
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
        w4008UpdateDomain.setW4008CriteriaDomain(form.getW4008CriteriaDomain());
        w4008UpdateDomain.setW4008ListDomainList(form.getW4008ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4008UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        String resultStgActNo = w4008RegisterFacadeService.transact(w4008UpdateDomain);

        // The cooperation forward to a destination new staging actuality No.
        // 新規山作り実績NOをフォワード先に連携
        form.setStgActNo(resultStgActNo);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, 1));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }
}
