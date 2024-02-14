/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Class action Register of Actual Item No Weight MA screen.
 * <br />Actual Item No Weight MA 画面のRegisterアクションクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025RegisterAction extends W9025AbstractAction {

    /**
     * The class action Register of Actual Item No Weight MA screen.
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<W9025CriteriaDomain, W9025CriteriaDomain> w9025RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9025RegisterAction() {
        super();
    }

    /**
     * Setter method for w9025RegisterFacadeService
     *
     * @param registerFacadeService Set for w9025RegisterFacadeService
     */
    
    public void setW9025RegisterFacadeService(
        TransactFacadeService<W9025CriteriaDomain, W9025CriteriaDomain> registerFacadeService) {
        w9025RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9025ActionForm w9025Form = (W9025ActionForm) form;

        // Set of mass update domain.
        // 一括更新ドメインの設定
        W9025CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9025Form);
        
        // Execution of the registration process.
        // 登録処理の実行
        W9025CriteriaDomain resultDomain  = w9025RegisterFacadeService.transact(criteriaDomain);

        resultDomain.setEnableRegister(FLAG_Y);

        if (!CheckUtil.isBlankOrNull(resultDomain.getConfirmMsg())) {
            w9025Form.getW9025CriteriaDomain().setConfirmMsgCd(resultDomain.getConfirmMsgCd());
            w9025Form.getW9025CriteriaDomain().setConfirmMsg(resultDomain.getConfirmMsg());
            return FORWARD_SUCCESS;
        }
        
        w9025Form.setW9025CriteriaDomain(resultDomain);
        
        // Add Message
        ActionMessages messages = getMessages(request);
        if (resultDomain.getCreateCount() > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, resultDomain.getCreateCount()));
        }
        if (resultDomain.getUpdateCount() > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0006, resultDomain.getUpdateCount()));
        }
        if (messages.size() > 0) {
            // Register GLOBAL_MESSAGE
            addMessages(request, messages);
        }
        
        return FORWARD_SUCCESS;
        
    }

    /**
     * Create a {@link W9025CriteriaDomain}.
     * <br />{@link W9025CriteriaDomain}を作成します。
     *
     * @param form Action Form of Actual Item No Weight MA<br />Actual Item No Weight MA画面のアクションフォーム
     * @return  {@link W9025CriteriaDomain} It createds <br />作成した{@link W9025CriteriaDomain}
     */
    protected W9025CriteriaDomain prepareCriteriaDomain(W9025ActionForm form) {
        W9025CriteriaDomain criteriaDomain = form.getW9025CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }

}