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
import com.globaldenso.eca0027.core.business.domain.W2007CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Register action class of Multiple Item No. in 1Box PKG Create Screen
 * <br />小箱内多品番Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2008Init.do
 *     - "error":W2007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2007MoveToRegisterAction extends W2007AbstractAction {

    /**
     * MoveToRegisterFacade services
     * <br />MoveToRegisterFacadeサービス
     */
    protected TransactFacadeService<Void, W2007CriteriaDomain> w2007MoveToRegisterFacadeService;
    
    /**
     * constructor.
     */
    public W2007MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w2007MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w2007MoveToRegisterFacadeService
     */
    public void setW2007MoveToRegisterFacadeService(
        TransactFacadeService<Void, W2007CriteriaDomain> moveToRegisterFacadeService) {
        w2007MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Check of changes conditions
     *       When the login user's data is not registered into a Mix Tag Work, this is considered as an error.
     *
     * - It changes to a Multiple Item No. in 1Box PKG Register screen.
     *       If satisfactory, it will change to a Register screen.
     *
     * A delete of - session information
     *       The search results of a Multiple Item No. in 1Box PKG Create screen are deleted.
     * 
     * 
     * - 遷移条件のチェック
     *     MIXED品目番号ワークにログインユーザのデータが登録されていない場合、エラーとする
     * 
     * - 小箱内多品Register画面へ遷移
     *     問題がなければ、Register画面へ遷移する
     *     
     * - セッション情報の削除
     *     小箱内多品Create画面の検索結果を削除する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // Check of changes conditions
        // 遷移条件のチェック
        validateCondition((W2007ActionForm) form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Changes conditions are checked.
     * <br />遷移条件をチェックします。
     *
     * @param form Action form of a Multiple Item No. in 1Box PKG number Create screen<br />小箱内多品番Create画面のアクション・フォーム
     * @throws ApplicationException When changes conditions are not fulfilled<br />遷移条件を満たさない場合
     */
    protected void validateCondition(W2007ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2007CriteriaDomain criteriaDomain = form.getW2007CriteriaDomain();
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        // Check of changes conditions
        // 遷移条件のチェック
        w2007MoveToRegisterFacadeService.transact(criteriaDomain);
    }
}
