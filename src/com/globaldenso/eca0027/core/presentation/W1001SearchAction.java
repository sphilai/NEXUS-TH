/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The class of Search action for Export Request screen.
 * <br />船積実績Main画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W1001
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1001SearchAction extends W1001AbstractAction {

    /**
     * Search FacadeService<br />
     * 検索FacadeService
     */
    protected SearchFacadeService<List<? extends W1001ListDomain>, W1001CriteriaDomain> w1001SearchFacadeService;

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1001SearchAction() {
        super();
    }

    /**
     * Setter method for w1001SearchFacadeService.
     *
     * @param searchFacadeService Set for w1001SearchFacadeService
     */
    public void setW1001SearchFacadeService(
        SearchFacadeService<List<? extends W1001ListDomain>, W1001CriteriaDomain> searchFacadeService) {
        w1001SearchFacadeService = searchFacadeService;
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

        W1001ActionForm w1001Form = prepareForm((W1001ActionForm) form);
        // Set the search criteria domain. 
        // 条件ドメインの設定
        W1001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w1001Form);
        // Set of function use authority
        // 機能利用権限の設定
        criteriaDomain.setUserAuthList(null);
        if (!userAuthService.hasBrowseAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W1001R, PERMIT_FUNC_ID_W1001B });
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        List<? extends W1001ListDomain> listDomainList = w1001SearchFacadeService.search(criteriaDomain);

        w1001Form.setListDomainList(listDomainList);
        
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getComCreateUserId())) {
            criteriaDomain.setComCreateUserId("1");
        }
        
        controlDisplay(w1001Form, request);

        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />アクションフォーム
     * @return Action Form<br />アクションフォーム
     */
    protected W1001ActionForm prepareForm(W1001ActionForm form) {
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        form.setExpRequestNo(null);
        
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
    protected W1001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W1001ActionForm form) 
        throws ApplicationException {
        
        W1001CriteriaDomain criteriaDomain = form.getW1001CriteriaDomain();
        
        boolean issueFlg = false;
        if (criteriaDomain.getComCreateUserId().equals("1")) {
            issueFlg = true;
        }
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        if (issueFlg) {
            criteriaDomain.setComCreateUserId(criteriaDomain.getLoginUserDscId());
        }

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Set user authority list.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W1001R, PERMIT_FUNC_ID_W1001B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W9007AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W9007ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W1001ActionForm form,
        HttpServletRequest request) {
        super.controlDisplay(form, request);
        
        form.setDisplayList(true);
    }
}
