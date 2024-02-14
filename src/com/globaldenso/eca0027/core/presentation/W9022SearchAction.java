/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9022CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9022SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "success":W9022.jsp
 *     - "error":W9022.jsp
 * </pre>
 *  *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9022SearchAction extends W9022AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9022ListDomain>, W9022CriteriaDomain> w9022SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022SearchAction() {
        super();
    }

    /**
     * Setter method for w9022SearchFacadeService.
     *
     * @param searchFacadeService Set for w9022SearchFacadeService
     */
    public void setW9022SearchFacadeService(
        SearchFacadeService<List<? extends W9022ListDomain>, W9022CriteriaDomain> searchFacadeService) {
        w9022SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Setting the action form
     *     Clear the List domain
     *     Set the maximum number of searches
     *     
     * - Set of search criteria domain
     *     Set to {@link W9022CriteriaDomain} the following information:
     *       - Common screen information
     *       - Information necessary to control page
     *       
     * - Execution of the search process
     *     Call {@link W9022SearchFacadeServiceImpl} as an argument {@link W9022CriteriaDomain}
     *     
     * - Set of search results
     *     Set the domain list the results of the above-mentioned
     *
     * - Screen display control
     *     Do active control of the screen item ({@link W9022AbstractAction#controlDisplay(W9022ActionForm, HttpServletRequest)})
     *     Display the search results area (Display the true flag)
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W9022CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       
     * - 検索処理の実行
     *     {@link W9022CriteriaDomain}を引数に{@link W9022SearchFacadeServiceImpl}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9022AbstractAction#controlDisplay(W9022ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        // Setting the action form.
        // アクションフォームの設定
        W9022ActionForm w9022Form = prepareForm((W9022ActionForm) form);
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W9022CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9022Form);
        
        // Execution of the search process.
        // 検索処理の実行
        List<? extends W9022ListDomain> listDomainList = w9022SearchFacadeService.search(criteriaDomain);
        
        // Set of search results.
        // 検索結果の設定
        w9022Form.setListDomainList(listDomainList);
        
        // Display control of the Main screen.
        // Main画面の表示制御
        controlDisplay(w9022Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return Action Form <br />アクションフォーム
     */
    protected W9022ActionForm prepareForm(W9022ActionForm form) {
        
        // Setting of Action Form.
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action Form <br />アクション・フォーム
     * @return Search conditions domain <br />検索条件ドメイン
     * @throws ApplicationException If do not have permission of Packaging Instruction (= Pull) <br />梱包指示の権限がない場合
     */
    protected W9022CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9022ActionForm form) 
        throws ApplicationException {
        
        W9022CriteriaDomain criteriaDomain = form.getW9022CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing.
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // execution permission settings.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9022B, PERMIT_FUNC_ID_W9022R };
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
     * @see com.globaldenso.eca0027.core.presentation.W9022AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W9022ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W9022ActionForm form,
        HttpServletRequest request) {
        
        // Active control of the button.
        // ボタンの活性制御
        super.controlDisplay(form, request);
        
        // Showing Results Area.
        // 検索結果エリアを表示
        form.setDisplayList(true);
    }
}
