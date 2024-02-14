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

import com.globaldenso.eca0027.core.business.domain.Wt010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt010ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Warehouse Search Sub Screen.
 * <br />倉庫選択子画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WT010.jsp
 *     - "error":WT010.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class Wt010SearchAction extends Wt010AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt010ListDomain>, Wt010CriteriaDomain> 
    wt010SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt010SearchAction() {
        super();
    }

    /**
     * Setter:wt010SearchFacadeService
     *
     * @param searchFacadeService Set wt010SearchFacadeService.
     */
    public void setWt010SearchFacadeService(
        SearchFacadeService<List<Wt010ListDomain>, Wt010CriteriaDomain> searchFacadeService) {
        this.wt010SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
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

        Wt010ActionForm thisForm = (Wt010ActionForm)form;
        
        // Clean the contents of the search results.
        thisForm.setWt010ListDomainList(null);
        
        // Set search criteria.
        Wt010CriteriaDomain criteriaDomain = thisForm.getWt010CriteriaDomain();

        // Set screenID.
        criteriaDomain.setScreenId(thisForm.getScreenId());

        // Set locale information.
        Locale locale = (Locale)request.getSession(false).getAttribute(
            thisForm.getWindowId() + "_locale");
        criteriaDomain.setLocale(locale);
        
        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        criteriaDomain.setPageInfoCreator(creator);
        
        // Call search service.
        List<Wt010ListDomain> listDomainList =
            wt010SearchFacadeService.search(criteriaDomain);
        
        // Set search results.
        thisForm.setWt010ListDomainList(listDomainList);

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
