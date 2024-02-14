/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W6001R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * Search action class of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のSearchアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004SearchAction extends W6004AbstractAction  {

    /**
     * W6004SearchFacadeService
     */
    protected SearchFacadeService<List<? extends W6004ListDomain>, W6004CriteriaDomain> w6004SearchFacadeService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004SearchAction() {
        super();
    }
    
    /**
     * Setter method for w6001SearchFacadeService.
     *
     * @param searchFacadeService Set for w6001SearchFacadeService
     */
    public void setW6004SearchFacadeService(SearchFacadeService<List<? extends W6004ListDomain>, W6004CriteriaDomain> searchFacadeService) {
        w6004SearchFacadeService = searchFacadeService;
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
     * ‐The data which coincides with the conditions specified in search condition area is displayed.
     *   To display the search results area when search results of 1 or more
     * </pre>
     * <pre>
     * ‐検索条件エリアで指定した条件に一致するデータを表示する
     *   検索結果が1件以上の場合に検索結果エリアを表示する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        // Setup of action form 
        // アクション・フォームの設定
        W6004ActionForm w6004Form = prepareForm((W6004ActionForm) form);
        
        // setup of criteriaDomain
        // 検索条件ドメインの設定
        W6004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6004Form);
        
        // Execution of search processing 
        // 検索処理の実行
        List<? extends W6004ListDomain> listDomainList = w6004SearchFacadeService.search(criteriaDomain);
        
        // Setup of search results 
        // 検索結果の設定
        w6004Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException ApplicationException
     */
    protected W6004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, 
        ActionMapping mapping, W6004ActionForm form) throws ApplicationException {
        
        W6004CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Setup of screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing 
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Setup of authority 
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W6001R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }

    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W6004ActionForm prepareForm(W6004ActionForm form) {
        form.setListDomainList(null);
        // The maximum display number of one screen of search results 
        // 検索結果の1画面の最大表示件数
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
}
