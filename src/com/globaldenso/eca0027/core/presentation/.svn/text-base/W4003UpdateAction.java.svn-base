/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W4003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Staging Instruction Create screen
 * <br />荷揃え指示Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4003.jsp
 *     - "error":W4003.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4003UpdateAction extends W4003AbstractAction {

    /**
     * Update facade service.
     */
    protected CreateFacadeService<Integer, W4003UpdateDomain> w4003UpdateFacadeService;

    /**
     * constructor.
     */
    public W4003UpdateAction() {
        super();
    }

    /**
     * Setter method for w4003UpdateFacadeService.
     *
     * @param updateFacadeService Set for w4003UpdateFacadeService
     */
    public void setW4003UpdateFacadeService(
        CreateFacadeService<Integer, W4003UpdateDomain> updateFacadeService) {
        w4003UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4001UpdateDomain w4003UpdateDomain mass update domain
     * - Set to w4003UpdateDomain.listDomainList, the form.listDomain
     * - Call the W4003RegisterFacadeService.create an argument w4003UpdateDomain
     *
     * - 一括更新ドメインのインスタンスW4001UpdateDomain w4003UpdateDomainを作成
     * - form.listDomainを、w4003UpdateDomain.listDomainListに設定
     * - w4003UpdateDomainを引数にW4003RegisterFacadeService.createの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4003ActionForm form = (W4003ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4003UpdateDomain w4003UpdateDomain = new W4003UpdateDomain();
        w4003UpdateDomain.setW4003ListDomainList(form.getW4003ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4003UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        int resultCount = w4003UpdateFacadeService.create(w4003UpdateDomain);

        // The deactivation of the check box items that have registered to work
        // ワークに登録した明細のチェックボックスを非活性化
        for (W4003ListDomain w4003ListDomain : form.getW4003ListDomainList()) {
            if (CHECK_ON.equals(w4003ListDomain.getSelected()) && FLAG_N.equals(w4003ListDomain.getDisabledFlg())) {
                w4003ListDomain.setDisabledFlg(FLAG_Y);
            }
        }

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, resultCount));
        saveMessages(request, messages);

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
