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
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2002MoveToCreateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is a Move To Create action class of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2003Init.do
 *     - "error":W2002.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2002MoveToCreateAction extends W2002AbstractAction {

    /**
     * MoveToCreate Facade service
     * <br />MoveToCreate Facadeサービス
     */
    protected TransactFacadeService<Void, W2002CriteriaDomain> w2002MoveToCreateFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2002MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w2002MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w2002MoveToCreateFacadeService
     */
    public void setW2002MoveToCreateFacadeService(
        TransactFacadeService<Void, W2002CriteriaDomain> moveToCreateFacadeService) {
        w2002MoveToCreateFacadeService = moveToCreateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - input check
     *       {@link W2002MoveToCreateFacadeServiceImpl W2002MoveToCreateFacadeServiceImpl#process(W2002CriteriaDomain)} is called,
     *       The VALUE inputted on the Packaging Instruction (=Pull) Header screen is checked.
     *
     *
     * - Changes to a Packaging Instruction (=Pull) Create screen
     *       It changes to a Packaging Instruction (=Pull) Create screen.
     * 
     * 
     * - 入力チェック
     *     {@link W2002MoveToCreateFacadeServiceImpl W2002MoveToCreateFacadeServiceImpl#process(W2002CriteriaDomain)}を呼出し、
     *     梱包指示Header画面で入力された値をチェックする
     * 
     * 
     * - 梱包指示Create画面への遷移
     *     梱包指示Create画面へ遷移する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W2002ActionForm w2002Form = (W2002ActionForm) form;
        
        // input check
        // 入力チェック
        validateHeader(w2002Form);
        
        // It changes to a Packaging Instruction (=Pull) Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    The VALUE inputted on the Packaging Instruction (=Pull) Header screen is checked.
     * <br />梱包指示Header画面で入力された値をチェックします。
     *
     * @param form Action form of a Packaging Instruction (=Pull) Header screen<br />梱包指示Header画面のアクション・フォーム
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected void validateHeader(W2002ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2002CriteriaDomain criteriaDomain = form.getW2002CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Execution of input check
        // 入力チェックの実行
        w2002MoveToCreateFacadeService.transact(criteriaDomain);
    }
}
