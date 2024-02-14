/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7002MoveToCreateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Move to Create action for Shipping Actuality Header screen.
 * <br />船積実績Header画面のMove to Createアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7003Init.do
 *     ‐"error":W7002
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7002MoveToCreateAction extends W7002AbstractAction {

    /**
     * MoveToCreate Facade Service
     * <br />MoveToCreate Facadeサービス
     */
    protected ProcessFacadeService<Void, W7002CriteriaDomain> w7002MoveToCreateFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7002MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w7002MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w7002MoveToCreateFacadeService
     */
    public void setW7002MoveToCreateFacadeService(ProcessFacadeService<Void, W7002CriteriaDomain> moveToCreateFacadeService) {
        w7002MoveToCreateFacadeService = moveToCreateFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Input check
     *     Call the {@link W7002MoveToCreateFacadeServiceImpl},
     *     Check the VALUE entered in Shipping Actuality Header screen.
     * ‐Transition to the Shipping Actuality Create screen
     * </pre>
     * <pre>
     * ‐入力チェック
     *     {@link W7002MoveToCreateFacadeServiceImpl}を呼出し、
     *     船積実績Header画面で入力された値をチェックする
     * ‐船積実績Create画面への遷移
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7002ActionForm w7002Form = (W7002ActionForm) form;
        // Check validation of the input data in the Shipping Actuality Header screen.
        // 入力チェック
        validateHeader(w7002Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Check the VALUE entered in Shipping Actuality Header screen.
     * <br />船積実績Header画面で入力された値をチェックします。
     *
     * @param form Action Form of Shipping Actuality Header screen<br />
     * 船積実績Header画面のアクションフォーム
     * @throws ApplicationException If there is an input error<br />
     * 入力エラーがある場合
     */
    protected void validateHeader(W7002ActionForm form) throws ApplicationException {
        W7002CriteriaDomain criteriaDomain = form.getW7002CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        w7002MoveToCreateFacadeService.process(criteriaDomain);
    }

}
