/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7001InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The class of initial display action for Shipping Actuality Main screen.
 * <br />船積実績Main画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W7001
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001InitAction extends W7001AbstractAction {

    /**
     * Delete Facade Service<br />
     * 削除Facadeサービス
     */
    protected DeleteFacadeService<Void, W7001CriteriaDomain> w7001InitFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001InitAction() {
        super();
    }

    /**
     * Setter method for w7001InitFacadeService.
     *
     * @param initFacadeService Set for w7001InitFacadeService
     */
    public void setW7001InitFacadeService(
        DeleteFacadeService<Void, W7001CriteriaDomain> initFacadeService) {
        w7001InitFacadeService = initFacadeService;
    }
    
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Deletion of Actuality Shipping Invoice Work
     *   Calls the {@link W7001InitFacadeServiceImpl},
     *   Delete the information stored in Shipping Actuality Header screen.
     * </pre>
     * - Delete the session
     * <pre>
     * ‐船積実績対象インボイスワークの削除処理
     *     {@link W7001InitFacadeServiceImpl}を呼出し、
     *     船積実績Header画面で保存された情報を削除します。
     *     
     * ‐セッションの削除
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7001ActionForm w7001Form = prepareForm((W7001ActionForm) form, request);
        // Set the search criteria domain. 
        // 条件ドメインの設定
        W7001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w7001Form);
        // Remove the Shipping Actuality Invoice Work. 
        // 削除処理の実行
        deleteShippingActInvoice(criteriaDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />アクションフォーム
     * @param request HttpServletRequest<br />サーバーリクエスト
     * @return Action Form<br />アクションフォーム
     */
    protected W7001ActionForm prepareForm(W7001ActionForm form, HttpServletRequest request) {
        ActionMessages erros = getErrors(request);
        if (erros.size() == 0) {
            form.setListDomainList(null);
        }

        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping action mapping<br />アクション・マッピング
     * @param form Action Form<br />アクション・フォーム
     * @return Search conditions domain<br />検索条件ドメイン
     */
    protected W7001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W7001ActionForm form) {
        W7001CriteriaDomain criteriaDomain = form.getW7001CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        return criteriaDomain;
    }
    
    /**
     * Remove the Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークを削除します。
     *
     * @param criteriaDomain Facade service conditions domain<br />Facadeサービス条件ドメイン
     * @throws ApplicationException if that could not be deleted Shipping Actuality Invoice Work<br />船積実績対象インボイスワークが削除できなかった場合
     */
    protected void deleteShippingActInvoice(W7001CriteriaDomain criteriaDomain) throws ApplicationException {
        w7001InitFacadeService.delete(criteriaDomain);
    }
}
