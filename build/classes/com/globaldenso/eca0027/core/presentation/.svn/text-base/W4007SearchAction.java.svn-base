/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4005R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4007ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of Staging Actuality Create screen
 * <br />山作り実績Create画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4007.jsp
 *     - "error":W4007.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4007SearchAction extends W4007AbstractAction {

    /**
     * Search facade service.
     */
    protected SearchFacadeService<List<? extends W4007ListDomain>, W4007CriteriaDomain> w4007SearchFacadeService;

    /**
     * constructor.
     */
    public W4007SearchAction() {
        super();
    }

    /**
     * Setter method for w4007SearchFacadeService.
     *
     * @param searchFacadeService Set for w4007SearchFacadeService
     */
    public void setW4007SearchFacadeService(
        SearchFacadeService<List<? extends W4007ListDomain>, W4007CriteriaDomain> searchFacadeService) {
        w4007SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the SearchFacadeService.search an argument form.w4007CriteriaDomain
     * - Set to form the result of calling SearchFacadeService.search
     *
     * - form.w4007CriteriaDomainを引数にW4007SearchFacadeService.searchの呼び出し
     * - W4007SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4007ActionForm form = (W4007ActionForm)actForm;

        // Create a domain to be passed to the facade
        // facadeに渡すドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4007CriteriaDomain w4007CriteriaDomain = form.getW4007CriteriaDomain();

        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4007CriteriaDomain, form.getWindowId(), form.getScreenId());
        // Set PageInfoCreator
        // PageInfoCreatorを設定
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        w4007CriteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Set of function use authority
        // 機能利用権限の設定
        w4007CriteriaDomain.setUserAuthList(null);
        if (!userAuthService.hasRegisterAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4005R, PERMIT_FUNC_ID_W4005B });
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            w4007CriteriaDomain.setUserAuthList(userAuthList);
        }

        // Call of facade service
        // facadeサービスの呼び出し

        List<? extends W4007ListDomain> resultW4007ListDomainList = w4007SearchFacadeService.search(w4007CriteriaDomain);

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4007ListDomainList(resultW4007ListDomainList);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        W4007ActionForm form = (W4007ActionForm)actForm;

        // If an error occurs, and clear the search results
        // エラーが発生している場合、検索結果を消去
        if (!FORWARD_SUCCESS.equals(forwardName)) {
            form.setW4007ListDomainList(null);
        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
