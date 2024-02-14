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
import com.globaldenso.eca0027.core.business.domain.W6003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Class action Init of Documentation Invoice Header screen.
 * <br />通関書類作成業務 Invoice Header画面のInitアクションクラスです。
 * 
 * @author $Author: y-hazama$
 * @version $Revision: 6712$
 */
public class W6003InitAction extends W6003AbstractAction {
    /**
     * W6003InitFacadeService
     */
    protected DeleteFacadeService<Void, W6003CriteriaDomain> w6003InitFacadeService;

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6003InitAction() {
        super();
    }

    /**
     * Setter method for w6003InitFacadeService.
     *
     * @param initFacadeService Set for w6003InitFacadeService
     */
    public void setW6003InitFacadeService(
        DeleteFacadeService<Void, W6003CriteriaDomain> initFacadeService) {
        w6003InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Delete the session information
     *     Delete the information registered in the session in this screen (W6001.Invoice Main Screen screen) or later
     * - Control of the screen
     *     Hide the search results area.
     * </pre>
     * <pre>
     * - セッション情報の削除
     *     本画面(W6001.Invoice Main Screen画面)以降にセッションに登録した情報を削除する
     * - 画面の制御
     *     検索結果エリアを非表示にします。
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Acquisition of form 
        // フォームの取得
        W6003ActionForm w6003Form = (W6003ActionForm) form;
        
        // Acquisition of CriteriaDomain 
        // CriteriaDomainの取得
        W6003CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6003Form);
        
        // Delete work
        // ワークの削除
        w6003InitFacadeService.delete(criteriaDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6003CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W6003ActionForm form) 
        throws ApplicationException {
        
        W6003CriteriaDomain criteriaDomain = form.getW6003CriteriaDomain();
        
        // Setup of screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
