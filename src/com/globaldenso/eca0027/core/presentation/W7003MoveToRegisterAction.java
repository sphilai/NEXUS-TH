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
import com.globaldenso.eca0027.core.business.domain.W7003CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7003MoveToRegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of action MoveToRegister for Shipping Actuality Create screen.
 * <br />船積実績Create画面のMoveToRegisterアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7004Init.do
 *     ‐"error": W7003
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003MoveToRegisterAction extends W7003AbstractAction {

    /**
     * MoveToRegister Facade Service
     * <br />MoveToRegister Facadeサービス
     */
    protected ProcessFacadeService<Void, W7003CriteriaDomain> w7003MoveToRegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7003MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w7003MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w7003MoveToRegisterFacadeService
     */
    public void setW7003MoveToRegisterFacadeService(ProcessFacadeService<Void, W7003CriteriaDomain> moveToRegisterFacadeService) {
        w7003MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Input check
     *     Call the {@link W7003MoveToRegisterFacadeServiceImpl}, 
     *     Check the VALUE entered in Shipping Actuality Create screen.
     * 
     * ‐Transition to the Shipping Actuality Register screen
     *     Transition to Shipping Actuality Register screen.
     * </pre>
     * <pre>
     * ‐入力チェック
     *     {@link W7003MoveToRegisterFacadeServiceImpl}を呼出し、
     *     船積実績Create画面で入力された値をチェックします。
     * 
     * ‐船積実績Register画面への遷移
     *     船積実績Register画面へ遷移します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7003ActionForm w7003Form = (W7003ActionForm) form;
        // Check validation of the input data in the Shipping Actuality Create screen. 
        // 入力チェック
        validateCreate(w7003Form);

        return FORWARD_SUCCESS;
    }
    
    /**
     * Check the VALUE entered in Shipping Actuality Create screen.
     * <br />船積実績Create画面で入力された値をチェックします。
     *
     * @param form Action Form of Shipping Actuality Create screen<br />
     * 船積実績Create画面のアクションフォーム
     * @throws ApplicationException If there is an input error<br />
     * 入力エラーが有る場合
     */
    protected void validateCreate(W7003ActionForm form) throws ApplicationException {
        W7003CriteriaDomain criteriaDomain = form.getW7003CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        w7003MoveToRegisterFacadeService.process(criteriaDomain);
    }

}
