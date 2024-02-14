/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2009ConfirmDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The ConfirmDetail action class of CML Main Screen
 * <br />CML Main Screen画面のConfirmDetailアクションクラスです * <pre>
 * forward name-path mappings:
 *     - "success":/W2012Init.do
 *     - "error":W2009.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2009ConfirmDetailAction extends W2009AbstractAction {

    /**
     * ConfirmDetail Facade service
     * <br />ConfirmDetail Facadeサービス
     */
    protected ProcessFacadeService<Void, W2009CriteriaDomain> w2009ConfirmDetailFacadeService;

    /**
     * constructor.
     */
    public W2009ConfirmDetailAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * Setter method for w2009ConfirmDetailFacadeService.
     * 
     * @param confirmDetailFacadeService Set for w2009ConfirmDetailFacadeService
     */
    public void setW2009ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W2009CriteriaDomain> confirmDetailFacadeService) {
        w2009ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * Succeed selected data and change on a CML Register screen.
     * <br />選択したデータを引継ぎ、CML Register画面に遷移する
     * 
     * <pre>
     * - A detailed line selection check, input check
     *       {@link W2009ConfirmDetailFacadeServiceImpl W2009ConfirmDetailFacadeServiceImpl#process(W2009CriteriaDomain)} is called,
     *       A detailed line selection check and a unary eye check are performed.
     *
     * Set up - processing mode.
     *       the processing mode in a transition destination -- " -- the 2: reference "is set up.
     *
     * - 明細行選択チェック、入力チェック
     *     {@link W2009ConfirmDetailFacadeServiceImpl W2009ConfirmDetailFacadeServiceImpl#process(W2009CriteriaDomain)}を呼出し、
     *     明細行選択チェック、単項目チェックを行う
     * 
     * - 処理モードを設定
     *     遷移先での処理モードに "2:参照"を設定する。
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W2009ActionForm w2009Form = (W2009ActionForm)form;

        // A create of the domain for a selection check
        // 選択チェック用のドメインの作成
        W2009CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2009Form);

        // Detailed line selection check
        // 明細行選択チェック
        w2009ConfirmDetailFacadeService.process(criteriaDomain);

        // A VALUE is set up for screen change.
        // processing mode is set up.
        // 画面遷移の為に値を設定
        // 処理モードを設定
        String mainMark = criteriaDomain.getMainMark();
        request.setAttribute("functionMode", W2009_CML_MODE_REF);
        request.setAttribute("mainMark", mainMark);

        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            // Display control
            // 表示制御
            controlDisplay((W2009ActionForm)form, request);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }

    /**
     *    Action form   An information is set as a search-condition domain for an input check.
     * <br />アクション・フォーム の情報を、入力チェックの為に検索条件ドメインに設定
     * 
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2009CriteriaDomain prepareCriteriaDomain(W2009ActionForm form) {

        W2009CriteriaDomain criteriaDomain = new W2009CriteriaDomain();
        
        String selectValue = form.getW2009CriteriaDomain().getSelected();
        if (!CheckUtil.isBlankOrNull(selectValue)) {
            String[] values = selectValue.split(":");
            String selectedIdx = values[0];
            String mainMark = values[1];
            String selectedAuthFlg = values[2];
            
            criteriaDomain.setMainMark(mainMark);
            criteriaDomain.setSelectedIdx(selectedIdx);
            criteriaDomain.setSelectedAuthFlg(selectedAuthFlg);
        }
        
        return criteriaDomain;
    }
}
