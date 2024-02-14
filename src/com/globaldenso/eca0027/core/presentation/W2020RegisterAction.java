/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
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

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of Multi Label Register Screen
 * <br />Multi Label Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2020.jsp
 *     - "error":W2020.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020RegisterAction extends W2020AbstractAction {

    /**
     * Init facade service.
     */
    protected TransactFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> w2020RegisterFacadeService;

    /**
     * constructor.
     */
    public W2020RegisterAction() {
        super();
    }

    /**
     * Setter method for W2020InitFacadeService.
     *
     * @param registerFacadeService Set for W2020InitFacadeService
     */
    public void setW2020RegisterFacadeService(
        TransactFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> registerFacadeService) {
        w2020RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - PL domain registration
     * - To complement the common information
     * - call of service facade
     * - Registration completion message settings
     * - PLドメイン取得
     * - 共通情報を補完
     * - facadeサービスの呼び出し
     * - 登録完了メッセージ設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2020ActionForm form = (W2020ActionForm)actForm;

        // PL domain registration
        // PLドメイン取得
        W2020CriteriaDomain w2020CriteriaDomain = form.getW2020CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w2020CriteriaDomain, form.getWindowId(), form.getScreenId());

        // call of service facade
        // facadeサービスの呼び出し
        w2020RegisterFacadeService.transact(w2020CriteriaDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, w2020CriteriaDomain.getCmlQty()));
        saveMessages(request, messages);

        w2020CriteriaDomain.setDisplayControlStatus("3"); // register done

        return FORWARD_SUCCESS;
    }
}
