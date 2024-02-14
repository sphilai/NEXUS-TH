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

import com.globaldenso.eca0027.core.business.domain.W9013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9013ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Warehouse Search Screen.
 * <br />倉庫検索画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9013.jsp
 *     - "error":W9013.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class W9013SearchAction extends W9013AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<W9013ListDomain>, W9013CriteriaDomain> 
    w9013SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public W9013SearchAction() {
        super();
    }

    /**
     * Setter:w9013SearchFacadeService
     *
     * @param searchFacadeService Set w9013SearchFacadeService.
     */
    public void setW9013SearchFacadeService(
        SearchFacadeService<List<W9013ListDomain>, W9013CriteriaDomain> searchFacadeService) {
        this.w9013SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - To save because the criteria compCd is overwritten .
     * - Set the screen common information.
     * - Set compCd.
     * - Create paging information.
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     *
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - criteriaのcompCdが上書きされてしまうため、退避しておく
     * - 画面共通情報の設定
     * - compCdをセットする
     * - ページング情報を作成する
     * 
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

        W9013ActionForm thisForm = (W9013ActionForm)form;
        
        // Clean the contents of the search results.
        thisForm.setW9013ListDomainList(null);
        
        // Set search criteria.
        W9013CriteriaDomain w9013CriteriaDomain = thisForm.getW9013CriteriaDomain();

        // To save because the criteria compCd is overwritten .
        String compCd = thisForm.getW9013CriteriaDomain().getCompCd();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain( 
            w9013CriteriaDomain, thisForm.getWindowId(), thisForm.getScreenId());

        // Set compCd.
        w9013CriteriaDomain.setCompCd(compCd);

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        w9013CriteriaDomain.setPageInfoCreator(creator);
        
        // Call search service.
        List<W9013ListDomain> w9013ListDomainList =
            w9013SearchFacadeService.search(w9013CriteriaDomain);
        
        // Set search results.
        thisForm.setW9013ListDomainList(w9013ListDomainList);

        // Go to this screen.
        return FORWARD_SUCCESS;
    }
    
}
