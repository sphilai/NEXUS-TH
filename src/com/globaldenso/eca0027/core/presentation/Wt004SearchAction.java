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

import com.globaldenso.eca0027.core.business.domain.Wt004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt004ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Package Search Sub Screen.
 * <br />包装材選択子画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WT004.jsp
 *     - "error":WT004.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class Wt004SearchAction extends Wt004AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt004ListDomain>, Wt004CriteriaDomain> 
    wt004SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt004SearchAction() {
        super();
    }

    /**
     * Setter:wt004SearchFacadeService
     * 
     * @param searchFacadeService Set wT004SearchFacadeService.
     */
    public void setWt004SearchFacadeService(
        SearchFacadeService<List<Wt004ListDomain>, Wt004CriteriaDomain> searchFacadeService) {
        this.wt004SearchFacadeService = searchFacadeService;
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

        Wt004ActionForm thisForm = (Wt004ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt004ListDomainList(null);
        
        // Set search criteria.
        Wt004CriteriaDomain criteriaDomain = (Wt004CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt004CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        criteriaDomain.setPageInfoCreator(creator);

        // Call search service.
        List<Wt004ListDomain> listDomainList = wt004SearchFacadeService.search(criteriaDomain);

        // Set search results.
        thisForm.setWt004ListDomainList(listDomainList);

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
