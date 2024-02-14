/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.Wt006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt006ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Outer Package Search Sub Screen.
 * <br />外装選択子画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WT006.jsp
 *     - "error":WT006.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class Wt006SearchAction extends Wt006AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt006ListDomain>, Wt006CriteriaDomain> wt006SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt006SearchAction() {
        super();
    }

    /**
     * Setter:wt006SearchFacadeService
     * 
     * @param searchFacadeService Set wT006SearchFacadeService.
     */
    public void setWt006SearchFacadeService(
        SearchFacadeService<List<Wt006ListDomain>, Wt006CriteriaDomain> searchFacadeService) {
        this.wt006SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Set screenID.
     * - Set locale information.
     * - Create paging information.
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     *
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - ページング情報を作成する
     * - form.criteriaDomainを引数にSearchFacadeService.searchの呼び出し
     * - SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        Wt006ActionForm thisForm = (Wt006ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt006ListDomainList(null);
        
        // Set search criteria.
        Wt006CriteriaDomain criteriaDomain = (Wt006CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt006CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        criteriaDomain.setPageInfoCreator(creator);

        // Call search service.
        List<Wt006ListDomain> listDomainList = wt006SearchFacadeService.search(criteriaDomain);

        // Set search results.
        thisForm.setWt006ListDomainList(listDomainList);

        // Go to this screen.
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Screen information stack.
     *     - Return false.
     * - 画面情報を保持するかどうかを返却するメソッドです。
     *     - falseを返却。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
