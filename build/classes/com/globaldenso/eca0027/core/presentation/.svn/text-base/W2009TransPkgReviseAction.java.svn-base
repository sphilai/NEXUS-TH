/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2009TransPkgReviseFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The TransPkgRevise action class of CML Main Screen <br />
 * CML Main Screen画面のTransPkgReviseアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - success :/W2019Init.do
 *     - error :W2009.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2009TransPkgReviseAction extends W2009AbstractAction {

    /**
     * ConfirmDetail Facade service
     * <br />ConfirmDetail Facadeサービス
     */
    protected SearchFacadeService<Void, W2009CriteriaDomain> w2009TransPkgReviseFacadeService;

    /**
     * constructor.
     */
    public W2009TransPkgReviseAction() {
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
     * Setter method for w2009TransPkgReviseFacadeService.
     * 
     * @param transPkgReviseFacadeService Set for
     *            w2009TransPkgReviseFacadeService
     */
    public void setW2009TransPkgReviseFacadeService(
        SearchFacadeService<Void, W2009CriteriaDomain> transPkgReviseFacadeService) {
        w2009TransPkgReviseFacadeService = transPkgReviseFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Succeed selected data and change on a CML Trans./PKG Revise screen.
     *
     * - A detailed line selection check, an input check, authority check
     *       {@link W2009TransPkgReviseFacadeServiceImpl W2009TransPkgReviseFacadeServiceImpl#search(W2009CriteriaDomain)} is called,
     *       A detailed line selection check, a unary eye check, an authority check, and DB consistency check are performed.
     *
     * - Transition destination taking over item setting
     *       The MAIN MARK of the line selected by the list is set up.
     *
     * 選択したデータを引継ぎ、CML Trans./PKG Revise 画面に遷移する
     * 
     * - 明細行選択チェック、入力チェック、権限チェック
     *     {@link W2009TransPkgReviseFacadeServiceImpl W2009TransPkgReviseFacadeServiceImpl#search(W2009CriteriaDomain)}を呼出し、
     *     明細行選択チェック、単項目チェック、権限チェック、DB整合性チェックを行う
     * 
     * - 遷移先引き継ぎ項目設定
     *     一覧で選択した行のメインマークを設定する
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
        
        // Domain create for a check
        // チェック用のドメイン作成
        W2009CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2009Form);
        
        // A detailed line selection check, an input check, and authority check
        // 明細行選択チェック・入力チェック・権限チェック
        w2009TransPkgReviseFacadeService.search(criteriaDomain);
        
        // Taking over item setting
        // 引継項目設定
        request.setAttribute("mainMark", criteriaDomain.getMainMark());

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
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        W2009ActionForm w2009Form = (W2009ActionForm)form;
        String selected = w2009Form.getW2009CriteriaDomain().getSelected();
        
        if (!CheckUtil.isBlankOrNull(selected)) {
            
            String[] values = selected.split(":");
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
