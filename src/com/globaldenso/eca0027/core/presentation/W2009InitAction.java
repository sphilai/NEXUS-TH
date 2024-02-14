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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * This is an initial display action class of a CML Main Screen.
 * <br />
 * CML Main Screen画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W2009.jsp
 *     - &quot;error&quot;:W2009.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2009InitAction extends W2009AbstractAction {

    /**
     * W2009InitFacade service
     * <br />W2009InitFacadeサービス
     */
    protected DeleteFacadeService<Void, W2009CriteriaDomain> w2009InitFacadeService;

    /**
     * constructor.
     */
    public W2009InitAction() {
        super();
    }

    /**
     * Setter method for w2009InitFacadeService.
     * 
     * @param initFacadeService Set for w2009InitFacadeService
     */
    public void setW2009InitFacadeService(
        DeleteFacadeService<Void, W2009CriteriaDomain> initFacadeService) {
        w2009InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A delete of - Palletize Item Work
     *       A login user's DSC-ID is deleted for a temporary work information on a Palletize Item to a key.
     *
     * - Display control
     *       Set screen field attributes.
     *       Set search-results fields inactive.
     *
     * - パレタイズ対象品ワークの削除
     *     一時的なパレタイズ対象品のワーク情報を、ログインユーザのDSC-IDをキーに削除
     *     
     * - 表示制御
     *     画面項目の活性制御を行う
     *     検索結果エリアを非表示にする
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

        // A delete of Palletize Item Work
        // パレタイズ対象品ワークの削除
        W2009ActionForm w2009Form = (W2009ActionForm)form;
        W2009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2009Form);
        w2009InitFacadeService.delete(criteriaDomain);
        
        // Display control
        // 表示制御
        controlDisplay((W2009ActionForm)form, request);
        
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
     *    A deletion-conditions domain is set up.
     * <br />削除条件ドメインを設定します。
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority of a Packaging Instruction (=Pull)<br />梱包指示の権限がない場合
     */
    protected W2009CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W2009ActionForm form)
        throws ApplicationException {

        W2009CriteriaDomain criteriaDomain = form.getW2009CriteriaDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        return criteriaDomain;
    }

    /**
     *    Display control of a CML Main screen is performed.
     * <br />CML Main画面の表示制御を行います。
     * <pre>
     * - Display control of a button is performed.
     *    {@link W2009AbstractAction#controlDisplay(W2009ActionForm, HttpServletRequest)}
     *
     * - Search-results area
     *      Set search-results fields inactive.
     *
     * - ボタンの表示制御を行います。
     *    {@link W2009AbstractAction#controlDisplay(W2009ActionForm, HttpServletRequest)}
     * 
     * - 検索結果エリア
     *    検索結果エリアを非表示にする。
     * </pre>
     * 
     * @param form Action form of a CML Main screen<br />CML Main画面のアクション・フォーム
     * @param request The request of a CML Main screen<br />CML Main画面のリクエスト
     */
    @Override
    protected void controlDisplay(W2009ActionForm form,
        HttpServletRequest request) {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(form, request);

        // Set search-results fields inactive.
        // 検索結果エリアを非表示
        form.setDisplayList(false);
    }

}
