/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * Move To Create action class of shipping confirmation Header screen.
 * <br />出荷確認Header画面のMove To Createアクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5002MoveToCreateAction extends W5002AbstractAction {

    /**
     * Move to create facade service.
     */
    protected ProcessFacadeService<Void, W5002CriteriaDomain> w5002MoveToCreateFacadeService;
    
    /**
     * constructor.
     */
    public W5002MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w5002MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w5002MoveToCreateFacadeService
     */
    public void setW5002MoveToCreateFacadeService(
        ProcessFacadeService<Void, W5002CriteriaDomain> moveToCreateFacadeService) {
        w5002MoveToCreateFacadeService = moveToCreateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Input check
     *     Call the {(W5002CriteriaDomain) @ link W5002MoveToCreateFacadeServiceImpl # process}, 
     *     to check the value entered in the shipping confirmation Header screen.
     * - Transition to Create shipping confirmation screen.
     *     Transition to Create shipment confirmation screen.
     * 
     * - 入力チェック
     *     {@link W5002MoveToCreateFacadeServiceImpl#process(W5002CriteriaDomain)}を呼出し、
     *     出荷確認Header画面で入力された値をチェックする
     * - 出荷確認Create画面への遷移
     *     出荷確認Create画面へ遷移する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5002ActionForm w5002Form = (W5002ActionForm) form;
        
        // Input check.
        // 入力チェック
        validateHeader(w5002Form);
        
        // Transition to Create shipping confirmation screen.
        // 出荷確認Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     * Check the values ​​entered in the shipping confirmation Header screen.
     * <br />出荷確認Header画面で入力された値をチェックします。
     * 
     * <pre>
     * - Set Condition domain.
     * - Execution of input check.
     * 
     * - 条件ドメインの設定
     * - 入力チェックの実行
     * </pre>
     *
     * @param form action form
     * @throws ApplicationException ApplicationException
     */
    protected void validateHeader(W5002ActionForm form) throws ApplicationException {
        
        W5002CriteriaDomain criteriaDomain = form.getW5002CriteriaDomain();
        
        // Set Condition domain.
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Execution of input check.
        // 入力チェックの実行
        w5002MoveToCreateFacadeService.process(criteriaDomain);
    }
}
