/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Cancel action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のCancelアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5001Init.do
 *     - "error":W5004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004CancelAction extends W5004AbstractAction {
    
    /**
     * Cancel facade service.
     */
    protected TransactFacadeService<Void, W5004UpdateDomain> w5004CancelFacadeService;

    /**
     * constructor.
     */
    public W5004CancelAction() {
        super();
    }

    /**
     * Setter method for w5004CancelFacadeService.
     *
     * @param cancelFacadeService Set for w5004CancelFacadeService
     */
    public void setW5004CancelFacadeService(
        TransactFacadeService<Void, W5004UpdateDomain> cancelFacadeService) {
        w5004CancelFacadeService = cancelFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W5004CancelFacadeService.transact an argument form.criteriaDomain
     *
     * - form.criteriaDomainを引数にW5004CancelFacadeService.transactの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        Timestamp comUpdateTimestamp = w5004Form.getW5004CriteriaDomain().getComUpdateTimestamp();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(w5004Form.getW5004CriteriaDomain(), w5004Form.getWindowId(), w5004Form.getScreenId());
        W5004UpdateDomain updateDomain = new W5004UpdateDomain();
        w5004Form.getW5004CriteriaDomain().setComUpdateTimestamp(comUpdateTimestamp);
        updateDomain.setCriteriaDomain(w5004Form.getW5004CriteriaDomain());
        updateDomain.setListDomainList(w5004Form.getListDomainList());
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, w5004Form.getWindowId(), w5004Form.getScreenId());
        
        w5004CancelFacadeService.transact(updateDomain);
        
        // Delete complete message set
        // 削除完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0007, 1));
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
