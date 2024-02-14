/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of Staging Instruction Main screen
 * <br />荷揃え指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4001.jsp
 *     - "error":W4001.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4001SearchAction extends W4001AbstractAction {

    /**
     * Search facade service.
     */
    protected SearchFacadeService<List<? extends W4001ListDomain>, W4001CriteriaDomain> w4001SearchFacadeService;

    /**
     * Constructor.
     */
    public W4001SearchAction() {
        super();
    }

    /**
     * Setter method for w4001SearchFacadeService.
     *
     * @param searchFacadeService Set for w4001SearchFacadeService
     */
    public void setW4001SearchFacadeService(
        SearchFacadeService<List<? extends W4001ListDomain>, W4001CriteriaDomain> searchFacadeService) {
        w4001SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set to W4001CriteriaDomain w4001CriteriaDomain the form.w4001CriteriaDomain
     * - Setting permissions information
     *     - When there BrowseAll or RegisterAll
     *         Set to null w4001CriteriaDomain.userAuthList
     *     - Otherwise
     *         Get the information of function use authority W4001R, of W4001B than DensoContext, is set to w4001CriteriaDomain.userAuthList
     * - Call the W4001SearchFacadeService.search an argument w4001CriteriaDomain
     * - Set to form the result of calling W4001SearchFacadeService.search
     *
     * - form.w4001CriteriaDomainをW4001CriteriaDomain w4001CriteriaDomainに設定
     * - 権限情報の設定
     *     - RegisterAllまたはBrowseAllありの場合
     *         w4001CriteriaDomain.userAuthListにnullを設定
     *     - 上記以外の場合
     *         DensoContextよりW4001R, W4001Bの機能利用権限の情報を取得し、w4001CriteriaDomain.userAuthListに設定
     * - w4001CriteriaDomainを引数にW4001SearchFacadeService.searchの呼び出し
     * - W4001SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4001ActionForm form = (W4001ActionForm)actForm;

        // Create a search condition to be passed to the domain facade
        // facadeに渡す検索条件ドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4001CriteriaDomain w4001CriteriaDomain = form.getW4001CriteriaDomain();

        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4001CriteriaDomain, form.getWindowId(), form.getScreenId());
        // Set PageInfoCreator
        // PageInfoCreatorを設定
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        w4001CriteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Set of function use authority
        // 機能利用権限の設定
        w4001CriteriaDomain.setUserAuthList(null);
        if (!userAuthService.hasBrowseAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4001R, PERMIT_FUNC_ID_W4001B });
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            w4001CriteriaDomain.setUserAuthList(userAuthList);
        }

        // Call of facade service
        // facadeサービスの呼び出し

        List<? extends W4001ListDomain> resultW4001ListDomainList = w4001SearchFacadeService.search(w4001CriteriaDomain);

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4001ListDomainList(resultW4001ListDomainList);
        // Deselect the radio button
        // ラジオボタンの選択を解除
        form.setStgInstrNo(null);

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

        W4001ActionForm form = (W4001ActionForm)actForm;

        // If an error occurs, and clear the search results
        // エラーが発生している場合、検索結果を消去
        if (!FORWARD_SUCCESS.equals(forwardName)) {
            form.setW4001ListDomainList(null);
        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
