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

import com.globaldenso.eca0027.core.business.domain.Wt007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;



/**
 * The initial action class of CML Info Sub Screen. <br />
 * 品番情報表示子画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT007.jsp
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class Wt007InitAction extends Wt007AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt007ListDomain>, Wt007CriteriaDomain> 
    wt007InitFacadeService = null;
    /**
     * Default constructor.
     */
    public Wt007InitAction() {
        super();
    }
    /**
     * Setter:wt007InitFacadeService
     *
     * @param searchFacadeService Set wt007InitFacadeService.
     */
    public void setWt007InitFacadeService(
        SearchFacadeService<List<Wt007ListDomain>, Wt007CriteriaDomain> searchFacadeService) {
        this.wt007InitFacadeService = searchFacadeService;
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
        
        Wt007ActionForm thisForm = (Wt007ActionForm)form;
        
        // Set search criteria.
        Wt007CriteriaDomain criteriaDomain = (Wt007CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt007CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Call search service.
        List<Wt007ListDomain> listDomainList =
            wt007InitFacadeService.search(criteriaDomain);
        
        // Set search results.
        thisForm.setWt007ListDomainList(listDomainList);

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
