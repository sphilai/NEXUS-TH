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
import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2015MoveToCreateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move To Create action class of X-tag Header
 * <br />X-tag Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2016Init.do
 *     - "error":W2015.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2015MoveToCreateAction extends W2015AbstractAction {

    /**
     * MoveToCreateFacade service
     * <br />MoveToCreateFacadeサービス
     */
    protected ProcessFacadeService<Void, W2015CriteriaDomain> w2015MoveToCreateFacadeService;
    
    /**
     * constructor.
     */
    public W2015MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w2015MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w2015MoveToCreateFacadeService
     */
    public void setW2015MoveToCreateFacadeService(
        ProcessFacadeService<Void, W2015CriteriaDomain> moveToCreateFacadeService) {
        w2015MoveToCreateFacadeService = moveToCreateFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - input check
     *       {@link W2015MoveToCreateFacadeServiceImpl W2015MoveToCreateFacadeServiceImpl#process (W2014CriteriaDomain)} is called,
     *       The VALUE inputted on the X-TAG Header screen is checked.
     *
     *
     * Changes to a - X-TAG Create screen
     *       It changes to a X-TAG Create screen.
     * 
     * 
     * - 入力チェック
     *     {@link W2015MoveToCreateFacadeServiceImpl W2015MoveToCreateFacadeServiceImpl#process(W2014CriteriaDomain)}を呼出し、
     *     まとめCML Header画面で入力された値をチェックする
     * 
     * 
     * - まとめCML Create画面への遷移
     *     まとめCML Create画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2015ActionForm W2015Form = (W2015ActionForm) form;
        
        // input check
        // 入力チェック
        validateHeader(W2015Form);
        
        // It changes to X-TAG Create screen.
        // まとめCML Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    The VALUE inputted on the X-TAG Header screen is checked.
     * <br />まとめCML Header画面で入力された値をチェックします。
     *
     * @param form Action form of a X-TAG Header screen<br />まとめCML Header画面のアクション・フォーム
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected void validateHeader(W2015ActionForm form) throws ApplicationException {
        
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2015CriteriaDomain criteriaDomain = form.getW2015CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Execution of input check
        // 入力チェックの実行
        w2015MoveToCreateFacadeService.process(criteriaDomain);
    }
}
