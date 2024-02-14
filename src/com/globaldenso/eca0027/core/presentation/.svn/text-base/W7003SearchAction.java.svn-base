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

import com.globaldenso.eca0027.core.business.domain.W7003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7003ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7003SearchFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The class of Search action for Shipping Actuality Create screen.
 * <br />船積実績Create画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W7003
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003SearchAction extends W7003AbstractAction {

    /**
     * Search FacadeService
     * <br />検索FacadeService
     */
    protected SearchFacadeService<List<? extends W7003ListDomain>, W7003CriteriaDomain> w7003SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7003SearchAction() {
        super();
    }
    
    /**
     * Setter method for w7003SearchFacadeService.
     *
     * @param searchFacadeService Set for w7003SearchFacadeService
     */
    public void setW7003SearchFacadeService(SearchFacadeService<List<? extends W7003ListDomain>, W7003CriteriaDomain> searchFacadeService) {
        w7003SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting of Action Form
     *     Clear the List domain list.
     * 
     * ‐Set of search criteria domain
     *     Set to {@link W7003CriteriaDomain} screen common information, the page control information.
     * 
     * ‐Execution of the search process
     *     Call the{@link W7003SearchFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * </pre>
     * <pre>
     * ‐アクション・フォームの設定
     *     Listドメインリストをクリアします。
     * 
     * ‐検索条件ドメインの設定
     *     画面共通情報、ページ制御情報を{@link W7003CriteriaDomain}に設定します。
     * 
     * ‐検索処理の実行
     *     {@link W7003SearchFacadeServiceImpl}を呼出す。
     * 
     * ‐検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7003ActionForm w7003Form = prepareForm((W7003ActionForm) form);
        
        W7003CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w7003Form);

        List<? extends W7003ListDomain> listDomainList = w7003SearchFacadeService.search(criteriaDomain);
        // Update the List domain. 
        // Listドメインリストの更新
        updateListDomain(listDomainList);
        
        w7003Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     * 
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W7003ActionForm prepareForm(W7003ActionForm form) {
        // Listドメインリストをクリア
        form.setListDomainList(null);

        form.setCountPerPage(PAGE_MAX_COUNT);

        return form;
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
     */
    protected W7003CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W7003ActionForm form) {
        W7003CriteriaDomain criteriaDomain = form.getW7003CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        return criteriaDomain;
    }
}
