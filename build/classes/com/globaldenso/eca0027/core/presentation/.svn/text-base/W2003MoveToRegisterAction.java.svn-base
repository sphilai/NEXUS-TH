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
import com.globaldenso.eca0027.core.business.domain.W2003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * The MovetoRegister action class of a Palletize-Instruction Create screen.
 * <br />梱包指示Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2004Init.do
 *     - "error":W2003.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2003MoveToRegisterAction extends W2003AbstractAction {

    /**
     * MoveToRegister Facade service
     * <br />MoveToRegister Facadeサービス
     */
    protected TransactFacadeService<Void, W2003CriteriaDomain> w2003MoveToRegisterFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w2003MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w2003MoveToRegisterFacadeService
     */
    public void setW2003MoveToRegisterFacadeService(
        TransactFacadeService<Void, W2003CriteriaDomain> moveToRegisterFacadeService) {
        w2003MoveToRegisterFacadeService = moveToRegisterFacadeService;
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
     *  - Check of changes conditions
     *     When the login user's data is not registered into a Palletize Instruction Item No Work, this is considered as an error.
     * 
     * - It changes to a Palletize-Instruction Register screen.
     *     If satisfactory, it will change to a Register screen.
     * 
     * - 遷移条件のチェック
     *     梱包指示品目番号ワークにログインユーザのデータが登録されていない場合、エラーとする
     * 
     * - 梱包指示Register画面へ遷移
     *     問題がなければ、Register画面へ遷移する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Check of changes conditions
        // 遷移条件のチェック
        validateCondition((W2003ActionForm) form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Check changes conditions.
     * <br />遷移条件をチェックします。
     *
     * @param form Action form of a Packaging Instruction (=Pull) Create screen<br/>梱包指示Create画面のアクション・フォーム
     * @throws ApplicationException When changes conditions are not fulfilled<br />遷移条件を満たさない場合
     */
    protected void validateCondition(W2003ActionForm form) throws ApplicationException {
       
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2003CriteriaDomain criteriaDomain = form.getW2003CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Check of changes conditions
        // 遷移条件のチェック
        w2003MoveToRegisterFacadeService.transact(criteriaDomain);
    }
}
