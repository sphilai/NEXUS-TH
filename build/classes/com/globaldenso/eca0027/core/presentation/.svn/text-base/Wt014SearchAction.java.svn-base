/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.Wt014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt014ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Ship to Search Sub Screen. <br />
 * <br />送荷先選択子画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT014.jsp
 *     - &quot;error&quot;:WT014.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public class Wt014SearchAction extends Wt014AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt014ListDomain>, Wt014CriteriaDomain> 
    wt014SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt014SearchAction() {
        super();
    }

    /**
     * Setter:wt014SearchFacadeService
     * 
     * @param searchFacadeService Set wT001SearchFacadeService.
     */
    public void setWt014SearchFacadeService(
        SearchFacadeService<List<Wt014ListDomain>, Wt014CriteriaDomain> searchFacadeService) {
        this.wt014SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Create paging information.
     * - Set locale information.
     * - Call the SearchFacadeService.search an argument Wt014CriteriaDomain
     * - Set to Wt014ListDomain the result of calling SearchFacadeService.search
     * - Go to this screen.
     * 
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - 画面IDをセットする
     * - ページング情報を作成する
     * - ロケール情報を設定
     * - Wt014CriteriaDomainを引数にSearchFacadeService.searchの呼び出し
     * - SearchFacadeService.searchの呼び出し結果をWt014ListDomainに設定
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

        Wt014ActionForm thisForm = (Wt014ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt014ListDomainList(null);

        // Set search criteria.
        Wt014CriteriaDomain criteriaDomain = thisForm.getWt014CriteriaDomain();

        // Set screenID.
        criteriaDomain.setScreenId(thisForm.getScreenId());

        // Set locale information.
        Locale locale = (Locale)request.getSession(false).getAttribute(
            thisForm.getWindowId() + "_locale");
        criteriaDomain.setLocale(locale);

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping,
            request);
        criteriaDomain.setPageInfoCreator(creator);

        // Call search service.
        List<Wt014ListDomain> listDomainList = wt014SearchFacadeService
            .search(criteriaDomain);

        // Set search results.
        thisForm.setWt014ListDomainList(listDomainList);

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
