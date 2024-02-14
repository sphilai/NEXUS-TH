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

import com.globaldenso.eca0027.core.business.domain.Wt015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt015ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The initial action class of Unit Price Error List Sub Screen. <br />
 * <br />売価登録なし品番表示子画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT015.jsp
 *     - &quot;error&quot;:WT015.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public class Wt015InitAction extends Wt015AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt015ListDomain>, Wt015CriteriaDomain> 
    wt015InitFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt015InitAction() {
        super();
    }

    /**
     * Setter:wt015InitFacadeService
     * 
     * @param searchFacadeService Set wT015InitFacadeService.
     */
    public void setWt015InitFacadeService(
        SearchFacadeService<List<Wt015ListDomain>, Wt015CriteriaDomain> searchFacadeService) {
        this.wt015InitFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Call the SearchFacadeService.search an argument Wt015CriteriaDomain
     * - Set to form.Wt015ListDomain the result of calling SearchFacadeService.search
     * - Go to this screen.
     * 
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - Wt015CriteriaDomainを引数にSearchFacadeService.searchの呼び出し
     * - SearchFacadeService.searchの呼び出し結果をform.Wt015ListDomainに設定
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

        Wt015ActionForm thisForm = (Wt015ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt015ListDomainList(null);

        // Set search criteria.
        Wt015CriteriaDomain criteriaDomain = (Wt015CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt015CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Call search service.
        List<Wt015ListDomain> listDomainList = wt015InitFacadeService
            .search(criteriaDomain);

        // Set search results.
        thisForm.setWt015ListDomainList(listDomainList);

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
