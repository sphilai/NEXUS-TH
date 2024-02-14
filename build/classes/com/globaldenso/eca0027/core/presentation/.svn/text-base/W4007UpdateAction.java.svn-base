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

import com.globaldenso.eca0027.core.business.domain.W4007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Staging Actuality Create screen
 * <br />山作り実績Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4007.jsp
 *     - "error":W4007.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4007UpdateAction extends W4007AbstractAction {

    /**
     * Update facade service.
     */
    protected CreateFacadeService<Integer, W4007UpdateDomain> w4007UpdateFacadeService;

    /**
     * constructor.
     */
    public W4007UpdateAction() {
        super();
    }

    /**
     * Setter method for w4007UpdateFacadeService.
     *
     * @param updateFacadeService Set for w4007UpdateFacadeService
     */
    public void setW4007UpdateFacadeService(
        CreateFacadeService<Integer, W4007UpdateDomain> updateFacadeService) {
        w4007UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Create an instance of W4005UpdateDomain w4007UpdateDomain mass update domain
     * - Set to w4007UpdateDomain.listDomainList, the form.listDomain
     * - Call the W4007RegisterFacadeService.create an argument w4007UpdateDomain
     *
     * - 一括更新ドメインのインスタンスW4005UpdateDomain w4007UpdateDomainを作成
     * - form.listDomainを、w4007UpdateDomain.listDomainListに設定
     * - w4007UpdateDomainを引数にW4007RegisterFacadeService.createの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4007ActionForm form = (W4007ActionForm)actForm;

        // PL domain creation
        // PLドメイン作成
        W4007UpdateDomain w4007UpdateDomain = new W4007UpdateDomain();
        w4007UpdateDomain.setW4007ListDomainList(form.getW4007ListDomainList());
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4007UpdateDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        int resultCount = w4007UpdateFacadeService.create(w4007UpdateDomain);

        // The deactivation of the check box items that have registered to work
        // ワークに登録した明細のチェックボックスを非活性化
        for (W4007ListDomain w4007ListDomain : form.getW4007ListDomainList()) {
            if (CHECK_ON.equals(w4007ListDomain.getSelected()) && FLAG_N.equals(w4007ListDomain.getDisabledFlg())) {
                w4007ListDomain.setDisabledFlg(FLAG_Y);
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
