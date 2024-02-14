/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W7001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.Wt017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt017ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The initial action class of Shipping Actuality Warning List Sub Screen. <br />
 * <br />船積実績ワーニングリスト子画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WT017.jsp
 *     - &quot;error&quot;:WT017.jsp
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public class Wt017InitAction extends Wt017AbstractAction {

    /** Service for search */
    protected SearchFacadeService<List<Wt017ListDomain>, Wt017CriteriaDomain> 
    wt017InitFacadeService = null;

    /**
     * Default constructor.
     */
    public Wt017InitAction() {
        super();
    }

    /**
     * Setter:wt017InitFacadeService
     * 
     * @param searchFacadeService Set wT017InitFacadeService.
     */
    public void setWt017InitFacadeService(
        SearchFacadeService<List<Wt017ListDomain>, Wt017CriteriaDomain> searchFacadeService) {
        this.wt017InitFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Process of Search.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Create paging information.
     * - Set permissions.
     * - Call the SearchFacadeService.search an argument Wt017CriteriaDomain
     * - Set to form.Wt017ListDomain the result of calling SearchFacadeService.search
     * - Go to this screen.
     * 
     * 検索処理
     * - 検索結果ドメインを空にする
     * - 検索条件をセットする
     * - ページング情報を作成する
     * - 権限を設定。
     * - Wt017CriteriaDomainを引数にSearchFacadeService.searchの呼び出し
     * - SearchFacadeService.searchの呼び出し結果をform.Wt017ListDomainに設定
     * - Go to this screen.
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

        Wt017ActionForm thisForm = (Wt017ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setWt017ListDomainList(null);

        // Set search criteria.
        Wt017CriteriaDomain criteriaDomain = (Wt017CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getWt017CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping,
            request);
        criteriaDomain.setPageInfoCreator(creator);

        // Set permissions.
        if (userAuthService.hasRegisterAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W7001R};
            List<? extends UserAuthDomain> userAuthList 
                = userAuthService.getUserAuthList(permitFuncIdList);

            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }

        // Call search service.
        List<Wt017ListDomain> listDomainList = wt017InitFacadeService
            .search(criteriaDomain);

        // Set search results.
        thisForm.setWt017ListDomainList(listDomainList);

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
