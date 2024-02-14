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

import com.globaldenso.eca0027.core.business.domain.Wt016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt016ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The initial action class of Unregistered HS CODE List Sub Screen. <br />
 * <br />HS CODE登録なし品番表示子画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT016.jsp
 *     - &quot;error&quot;:WT016.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public class Wt016InitAction extends Wt016AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt016ListDomain>, Wt016CriteriaDomain> 
    wt016InitFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt016InitAction() {
        super();
    }

    /**
     * Setter:wt016InitFacadeService
     * 
     * @param searchFacadeService Set wT016InitFacadeService.
     */
    public void setWt016InitFacadeService(
        SearchFacadeService<List<Wt016ListDomain>, Wt016CriteriaDomain> searchFacadeService) {
        this.wt016InitFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Call the SearchFacadeService.search an argument Wt016CriteriaDomain
     * - Set to form.Wt016ListDomain the result of calling SearchFacadeService.search
     * - Go to this screen.
     * 
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - Wt016CriteriaDomainを引数にSearchFacadeService.searchの呼び出し
     * - SearchFacadeService.searchの呼び出し結果をform.Wt016ListDomainに設定
     * - 自画面へ遷移
     * </pre>
     * 
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        Wt016ActionForm thisForm = (Wt016ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt016ListDomainList(null);

        // Set search criteria.
        Wt016CriteriaDomain criteriaDomain = (Wt016CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt016CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Call search service.
        List<Wt016ListDomain> listDomainList = wt016InitFacadeService
            .search(criteriaDomain);

        // Set search results.
        thisForm.setWt016ListDomainList(listDomainList);

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