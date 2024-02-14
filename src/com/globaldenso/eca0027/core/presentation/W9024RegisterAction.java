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

import com.globaldenso.eca0027.core.business.domain.W9024CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Class action Register of Export Formalities by Item MA Edit screen.
 * <br />Export Formalities by Item MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9024RegisterAction extends W9024AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<W9024CriteriaDomain, W9024CriteriaDomain> w9024RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9024RegisterAction() {
        super();
    }

    /**
     * Setter method for w9024RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9024RegisterFacadeService
     */
    public void setW9024RegisterFacadeService(TransactFacadeService<W9024CriteriaDomain, W9024CriteriaDomain> registerFacadeService) {
        w9024RegisterFacadeService = registerFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9024ActionForm w9024Form = (W9024ActionForm) form;
        
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W9024CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9024Form);
        
        // Execution of the registration process.
        // 登録処理の実行
        W9024CriteriaDomain resultDomain = w9024RegisterFacadeService.transact(criteriaDomain);
        
        resultDomain.setEnableRegister(FLAG_Y);
        
        if (!CheckUtil.isBlankOrNull(resultDomain.getConfirmMsg())) {
            w9024Form.getW9024CriteriaDomain().setConfirmMsgCd(resultDomain.getConfirmMsgCd());
            w9024Form.getW9024CriteriaDomain().setConfirmMsg(resultDomain.getConfirmMsg());
            return FORWARD_SUCCESS;
        }
        w9024Form.setW9024CriteriaDomain(resultDomain);
        
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
        
        // Transition to packing instruction Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9024CriteriaDomain}.
     * <br />{@link W9024CriteriaDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9024CriteriaDomain} It created<br />作成した{@link W9024CriteriaDomain}
     */
    protected W9024CriteriaDomain prepareCriteriaDomain(W9024ActionForm form) {

        W9024CriteriaDomain criteriaDomain = form.getW9024CriteriaDomain();

        // Set of common information screen.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
