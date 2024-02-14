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

import com.globaldenso.eca0027.core.business.domain.W4005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4005ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of Staging Actuality Main screen
 * <br />山作り実績Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4005.jsp
 *     - "error":W4005.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4005SearchAction extends W4005AbstractAction {

    /**
     * Search facade service.
     */
    protected SearchFacadeService<List<? extends W4005ListDomain>, W4005CriteriaDomain> w4005SearchFacadeService;

    /**
     * Constructor.
     */
    public W4005SearchAction() {
        super();
    }

    /**
     * Setter method for w4005SearchFacadeService.
     *
     * @param searchFacadeService Set for w4005SearchFacadeService
     */
    public void setW4005SearchFacadeService(
        SearchFacadeService<List<? extends W4005ListDomain>, W4005CriteriaDomain> searchFacadeService) {
        w4005SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set to W4005CriteriaDomain w4005CriteriaDomain the form.w4005CriteriaDomain
     * - Setting permissions information
     *     - When there BrowseAll or RegisterAll
     *         Set to null w4005CriteriaDomain.userAuthList
     *     - Otherwise
     *         Get the information of function use authority W4005R, of W4005B than DensoContext, is set to w4005CriteriaDomain.userAuthList
     * - Call the W4005SearchFacadeService.search an argument w4005CriteriaDomain
     * - Set to form the result of calling W4005SearchFacadeService.search
     *
     * - form.w4005CriteriaDomainをW4005CriteriaDomain w4005CriteriaDomainに設定
     * - 権限情報の設定
     *     - RegisterAllまたはBrowseAllありの場合
     *         w4005CriteriaDomain.userAuthListにnullを設定
     *     - 上記以外の場合
     *         DensoContextよりW4005R, W4005Bの機能利用権限の情報を取得し、w4005CriteriaDomain.userAuthListに設定
     * - w4005CriteriaDomainを引数にW4005SearchFacadeService.searchの呼び出し
     * - W4005SearchFacadeService.searchの呼び出し結果をformに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4005ActionForm form = (W4005ActionForm)actForm;

        // Create a search condition to be passed to the domain facade
        // facadeに渡す検索条件ドメインを作成

        // Get PL domain
        // PLドメイン取得
        W4005CriteriaDomain w4005CriteriaDomain = form.getW4005CriteriaDomain();

        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4005CriteriaDomain, form.getWindowId(), form.getScreenId());
        // Set PageInfoCreator
        // PageInfoCreatorを設定
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        w4005CriteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Set of function use authority
        // 機能利用権限の設定
        w4005CriteriaDomain.setUserAuthList(null);
        if (!userAuthService.hasBrowseAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4005R, PERMIT_FUNC_ID_W4005B });
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            w4005CriteriaDomain.setUserAuthList(userAuthList);
        }

        // Call of facade service
        // facadeサービスの呼び出し

        List<? extends W4005ListDomain> resultW4005ListDomainList = w4005SearchFacadeService.search(w4005CriteriaDomain);

        // Set to form the search results
        // 検索結果をフォームに設定
        form.setW4005ListDomainList(resultW4005ListDomainList);
        // Deselect the radio button
        // ラジオボタンの選択を解除
        form.setStgActNo(null);

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

        W4005ActionForm form = (W4005ActionForm)actForm;

        // If an error occurs, and clear the search results
        // エラーが発生している場合、検索結果を消去
        if (!FORWARD_SUCCESS.equals(forwardName)) {
            form.setW4005ListDomainList(null);
        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
