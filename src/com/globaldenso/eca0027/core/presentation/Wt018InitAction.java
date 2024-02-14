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

import com.globaldenso.eca0027.core.business.domain.Wt018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt018ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The initial action class of Container No. Info Sub Screen. <br />
 * コンテナNo.情報表示子画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT005.jsp
 * </pre>
 * 
 * @author $Author$
 * @version $Revision$
 */
public class Wt018InitAction extends Wt018AbstractAction {
    /** Service for search */
    protected SearchFacadeService<List<Wt018ListDomain>, Wt018CriteriaDomain> wt018InitFacadeService = null;
    
    /**
     * Default constructor.
     */
    public Wt018InitAction() {
        super();
    }
    /**
     * Setter:wt018InitFacadeService
     *
     * @param searchFacadeService Set wt018InitFacadeService.
     */
    public void setWt018InitFacadeService(
        SearchFacadeService<List<Wt018ListDomain>, Wt018CriteriaDomain> searchFacadeService) {
        this.wt018InitFacadeService = searchFacadeService;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Process of Search.
     * - Set search criteria.
     * - Call the InitFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling InitFacadeService.search
     * 
     * 
     * 検索処理
     * - 検索条件をセットする
     * - form.criteriaDomainを引数にInitFacadeService.searchの呼び出し
     * - InitFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#invokeExecute
     * (org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Wt018ActionForm thisForm = (Wt018ActionForm)form;

        // Set search criteria.
        Wt018CriteriaDomain criteriaDomain = (Wt018CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt018CriteriaDomain(), thisForm.getWindowId(), thisForm.getScreenId());

        // Call search service.
        List<Wt018ListDomain> listDomainList = wt018InitFacadeService.search(criteriaDomain);
        
        // Set search results.
        thisForm.setWt018ListDomainList(listDomainList);

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
