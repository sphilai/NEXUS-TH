/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W7001R;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The class of Search action for Shipping Actuality Main screen.
 * <br />船積実績Main画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W7001
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001SearchAction extends W7001AbstractAction {

    /**
     * Search FacadeService<br />
     * 検索FacadeService
     */
    protected SearchFacadeService<List<? extends W7001ListDomain>, W7001CriteriaDomain> w7001SearchFacadeService;
        
    /**
     * User function use authorization service<br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001SearchAction() {
        super();
    }

    /**
     * Setter method for w7001SearchFacadeService.
     *
     * @param searchFacadeService Set for w7001SearchFacadeService
     */
    public void setW7001SearchFacadeService(
        SearchFacadeService<List<? extends W7001ListDomain>, W7001CriteriaDomain> searchFacadeService) {
        w7001SearchFacadeService = searchFacadeService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - See the data that matches the criteria you specified in the search condition area.
     *   To display the search results area when search results of 1 or more.
     * </pre>
     * <pre>
     * ‐検索条件エリアで指定した条件に一致するデータを表示する
     *   検索結果が1件以上の場合に検索結果エリアを表示する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W7001ActionForm w7001Form = prepareForm((W7001ActionForm) form);
        // Set the search criteria domain. 
        // 条件ドメインの設定
        W7001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w7001Form);

        List<? extends W7001ListDomain> listDomainList = w7001SearchFacadeService.search(criteriaDomain);

        w7001Form.setListDomainList(listDomainList);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />アクションフォーム
     * @return Action Form<br />アクションフォーム
     */
    protected W7001ActionForm prepareForm(W7001ActionForm form) {
        form.setListDomainList(null);
        form.setShippingActNo("");
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping action mapping<br />アクション・マッピング
     * @param form Action Form<br />アクション・フォーム
     * @return Search conditions domain<br />検索条件ドメイン
     * @throws ApplicationException if it fails to set the search criteria domain<br />検索条件ドメインの設定に失敗した場合
     */
    protected W7001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W7001ActionForm form) 
        throws ApplicationException {
        
        W7001CriteriaDomain criteriaDomain = form.getW7001CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Set user authority list.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W7001R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        return criteriaDomain;
    }
}
