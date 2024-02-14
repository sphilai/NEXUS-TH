/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2016SearchFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of X-tag Create
 * <br />X-tag Create画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2016.jsp
 *     - "error":W2016.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2016SearchAction extends W2016AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2016ListDomain>, W2016CriteriaDomain> w2016SearchFacadeService;
    
    /**
     * constructor.
     */
    public W2016SearchAction() {
        super();
    }

    /**
     * Setter method for w2016SearchFacadeService.
     *
     * @param searchFacadeService Set for w2016SearchFacadeService
     */
    public void setW2016SearchFacadeService(
        SearchFacadeService<List<? extends W2016ListDomain>, W2016CriteriaDomain> searchFacadeService) {
        w2016SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *       The 1 page-record number maximum is set up.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2016CriteriaDomain}.
     *         - Screen common information
     *         Information required for - page control
     *
     * - Execution of retrieval processing
     *       {@link W2016SearchFacadeServiceImpl W2016SearchFacadeServiceImpl#search (W2016CriteriaDomain)} is called for {@link W2016CriteriaDomain} to an argument.
     *
     * - Setting of search results
     * {@link W2016ActionForm#setW2016ListDomainList(List)} is called,
     *       The data displayed on a screen is set up.
     *
     * - Setting of search results
     *       The above-mentioned result is set as a list domain.
     *
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     1ページレコード件数最大値を設定する
     *         
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2016CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *           
     * - 検索処理の実行
     *     {@link W2016CriteriaDomain}を引数に、{@link W2016SearchFacadeServiceImpl W2016SearchFacadeServiceImpl#search(W2016CriteriaDomain)}を呼出す
     *         
     * - 検索結果の設定
     *     {@link W2016ActionForm#setW2016ListDomainList(List)}を呼出し、
     *     画面に表示するデータを設定する
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *         
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        W2016ActionForm w2016Form = prepareForm((W2016ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2016CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2016Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends W2016ListDomain> listDomainList = w2016SearchFacadeService.search(criteriaDomain);
        
        // Setting of search results
        // 検索結果の設定
        w2016Form.setW2016ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Setting of search results
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2016ActionForm prepareForm(W2016ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setW2016ListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * The search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2016CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2016ActionForm form) {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2016CriteriaDomain criteriaDomain = form.getW2016CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        return criteriaDomain;
    }
}
