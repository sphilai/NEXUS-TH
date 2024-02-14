/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2012CancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
*    This is a Cancel action class of a CML Register screen.
 * <br />CML Register画面のCancelアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2009Init.do
 *     - "error":W2012.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 10048 $
 */
public class W2012CancelAction extends W2012AbstractAction {

    /**
     * Cancel Facade service
     * <br />Cancel Facade サービス
     */
    protected TransactFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> w2012CancelFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2012CancelAction() {
        super();
    }

    /**
     * Setter method for w2012CancelFacadeService.
     * 
     * @param cancelFacadeService Set for w2012CancelFacadeService
     */
    public void setW2012CancelFacadeService(
        TransactFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> cancelFacadeService) {
        w2012CancelFacadeService = cancelFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2012UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2012CriteriaDomain})  
     *         - List domain ({@link W2012ListDomain})
     *
     * - Execution of cancellation processing
     *       Created {@link W2012UpdateDomain} is made into an argument, and {@link W2012CancelFacadeServiceImpl W2012CancelFacadeServiceImpl#transact(W2012UpdateDomain)} is called.
     *
     * - 更新ドメインの設定
     *     以下の情報を{@link W2012UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2012CriteriaDomain})
     *       - Listドメイン ({@link W2012ListDomain})
     * 
     * - キャンセル処理の実行
     *     作成した{@link W2012UpdateDomain}を引数にして、{@link W2012CancelFacadeServiceImpl W2012CancelFacadeServiceImpl#transact(W2012UpdateDomain)}を呼出す
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
        
        W2012ActionForm w2012Form = (W2012ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2012CriteriaDomain criteriaDomain = prepareUpdateDomain(w2012Form);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2012CancelFacadeService.transact(criteriaDomain);

        addGlobalMessage(request, GSCM_I0_0007, 1);

        // screen change
        // 画面遷移
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
     * - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2012ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }

    }

    /**
     *    Setting of an update domain
     * <br />更新ドメインの設定
     *
     * @param form Action form<br />アクションフォーム
     * @return The domain for a search<br />検索用ドメイン
     */
    protected W2012CriteriaDomain prepareUpdateDomain(W2012ActionForm form) {

        W2012CriteriaDomain criteriaDomain = new W2012CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        criteriaDomain = form.getW2012CriteriaDomain();
        
        return criteriaDomain;
    }
}
