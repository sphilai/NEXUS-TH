/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move To Register action class of a CML Create screen.
 * <br />CML Create画面のMove To Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2012Init.do
 *     - "error":W2011.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2011MoveToRegisterAction extends W2011AbstractAction {

    /**
     * W2011 MoveToRegister Facade service
     * <br />W2011MoveToRegister Facadeサービス
     */
    protected ProcessFacadeService<Void, W2011CriteriaDomain> w2011MoveToRegisterFacadeService;
    
    /**
     * constructor.
     */
    public W2011MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w2011MoveToRegisterFacadeServic.
     *
     * @param moveToRegisterFacadeServic Set for w2011MoveToRegisterFacadeServic
     */
    public void setW2011MoveToRegisterFacadeService(
        ProcessFacadeService<Void, W2011CriteriaDomain> moveToRegisterFacadeServic) {
        w2011MoveToRegisterFacadeService = moveToRegisterFacadeServic;
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
     *       Palletize-Item-Work registration check
     *       An error is made when the Palletize Item is not registered.
     *
     * Change to - CML Register screen.
     *       If satisfactory, it will change to a Register screen.
     *
     * - 遷移条件のチェック
     *     パレタイズ対象品ワーク登録チェック
     *     パレタイズ対象品が登録されていない場合はエラー
     * 
     * - CML Register画面へ遷移
     *     問題がなければ、Register画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Check of changes conditions
        // 遷移条件のチェック
        validateCondition((W2011ActionForm) form);
        
        // A taking over item setting on changes screen
        // 遷移画面への引き継ぎ項目設定
        request.setAttribute("functionMode", W2009_CML_MODE_EDIT); 

        return FORWARD_SUCCESS;
    }
    
    /**
     *    Changes conditions are checked.
     * <br />遷移条件をチェックします。
     *
     * @param form CML Action form of a CML Create screen<br />Create画面のアクション・フォーム
     * @throws ApplicationException When changes conditions are not fulfilled<br />遷移条件を満たさない場合
     */
    protected void validateCondition(W2011ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2011CriteriaDomain criteriaDomain = form.getW2011CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Check of changes conditions
        // 遷移条件のチェック
        w2011MoveToRegisterFacadeService.process(criteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2011AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        // Display control
        // 表示制御
        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplayErr(request, (W2011ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }
    
}
