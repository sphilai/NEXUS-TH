/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W8001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * Action class of Progress Control Main screen.
 * <br />進度管理Main画面のSearchアクションクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W8001SearchAction extends W8001AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W8001ListDomain>, W8001CriteriaDomain> w8001SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8001SearchAction() {
        super();
    }

    /**
     * Setter method for w8001SearchFacadeService.
     *
     * @param searchFacadeService Set for w8001SearchFacadeService
     */
    public void setW8001SearchFacadeService(SearchFacadeService<List<? extends W8001ListDomain>, W8001CriteriaDomain> searchFacadeService) {
        w8001SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting the action form
     * ‐Set of search criteria domain
     * ‐Execution of the search process
     * ‐Set of search results
     * ‐Display control of the Main screen
     * </pre>
     * <pre>
     * ‐アクションフォームの設定
     * ‐検索条件ドメインの設定
     * ‐検索処理の実行
     * ‐検索結果の設定
     * ‐Main画面の表示制御
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W8001ActionForm w8001Form = prepareForm((W8001ActionForm) form);
        
        W8001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w8001Form);
        
        List<? extends W8001ListDomain> listDomainList = w8001SearchFacadeService.search(criteriaDomain);
        
        w8001Form.setW8001ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
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
    protected W8001ActionForm prepareForm(W8001ActionForm form) {
        form.setW8001ListDomainList(null);
        form.setCmlNo("");
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
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
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W8001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W8001ActionForm form) 
        throws ApplicationException {
        W8001CriteriaDomain criteriaDomain = form.getW8001CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        // ラジオボタン選択値
        if("searchItemNo".equals(form.getW8001CriteriaDomain().getSelectCondition())) {
            // Item No.
            // Item No.選択
            form.getW8001CriteriaDomain().setCustomerPoNo("");
        } else if("searchPoNo".equals(form.getW8001CriteriaDomain().getSelectCondition())) {
            // P/O No.
            // P/O No.選択
            form.getW8001CriteriaDomain().setPltzItemNo("");
        }
        
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W8001B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
                
        return criteriaDomain;
    }
}
