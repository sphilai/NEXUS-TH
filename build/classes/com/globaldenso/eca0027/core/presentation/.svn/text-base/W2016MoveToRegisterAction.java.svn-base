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
import com.globaldenso.eca0027.core.business.domain.W2016CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Register action class of X-tag Create
 * <br />X-tag Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2017Init.do
 *     - "error":W2016.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2016MoveToRegisterAction extends W2016AbstractAction {

    /**
     * MoveToRegisterFacade services
     * <br />MoveToRegisterFacadeサービス
     */
    protected ProcessFacadeService<Void, W2016CriteriaDomain> w2016MoveToRegisterFacadeService;
    
    /**
     * constructor.
     */
    public W2016MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w2016MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for moveToRegisterFacadeService
     */
    public void setW2016MoveToRegisterFacadeService(
        ProcessFacadeService<Void, W2016CriteriaDomain> moveToRegisterFacadeService) {
        w2016MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Check of changes conditions
     *       When the login user's data is not registered into a X Palletize Work, this is considered as an error.
     *
     * Change to a - X-TAG Register screen.
     *       If satisfactory, it will change to a Register screen.
     * 
     * 
     * - 遷移条件のチェック
     *     まとめパレタイズワークにログインユーザのデータが登録されていない場合、エラーとする
     * 
     * - まとめCML Register画面へ遷移
     *     問題がなければ、Register画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Check of changes conditions
        // 遷移条件のチェック
        validateCondition((W2016ActionForm) form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Changes conditions are checked.
     * <br />遷移条件をチェックします。
     *
     * @param form Action form of a X-TAG Create screen<br />まとめCML Create画面のアクション・フォーム
     * @throws ApplicationException When changes conditions are not fulfilled<br />遷移条件を満たさない場合
     */
    protected void validateCondition(W2016ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2016CriteriaDomain criteriaDomain = form.getW2016CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Check of changes conditions
        // 遷移条件のチェック
        w2016MoveToRegisterFacadeService.process(criteriaDomain);
    }
}
