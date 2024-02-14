/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9007SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "success":W9007.jsp
 *     - "error":W9007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9007SearchAction extends W9007AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9007ListDomain>, W9007CriteriaDomain> w9007SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007SearchAction() {
        super();
    }

    /**
     * Setter method for w9007SearchFacadeService.
     *
     * @param searchFacadeService Set for w9007SearchFacadeService
     */
    public void setW9007SearchFacadeService(
        SearchFacadeService<List<? extends W9007ListDomain>, W9007CriteriaDomain> searchFacadeService) {
        w9007SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Setting the action form
     *     Clear the List domain
     *     Set the maximum number of searches
     *     
     * - Set of search criteria domain
     *     Set to {@link W9007CriteriaDomain}the following information:
     *       - Common screen information
     *       - Information necessary to control page
     *       - User function use authority
     *       
     * - Execution of the search process
     *     Call {@link W9007SearchFacadeServiceImpl} as an argument {@link W9007CriteriaDomain}
     *     
     * - Set of search results
     *     Set the domain list the results of the above-mentioned
     *
     * - Screen display control
     *     Active control of the screen item ({@link W9007AbstractAction#controlDisplay(W9007ActionForm, HttpServletRequest)})
     *     Display the search results area (Display the true flag)
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W9007CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       - ユーザ機能利用権限
     *       
     * - 検索処理の実行
     *     {@link W9007CriteriaDomain}を引数に{@link W9007SearchFacadeServiceImpl}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9007AbstractAction#controlDisplay(W9007ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9007ActionForm w9007Form = prepareForm((W9007ActionForm) form);

        W9007CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9007Form);
        
        List<? extends W9007ListDomain> listDomainList = w9007SearchFacadeService.search(criteriaDomain);

        w9007Form.setListDomainList(listDomainList);
        
        controlDisplay(w9007Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return Action Form <br />アクションフォーム
     */
    protected W9007ActionForm prepareForm(W9007ActionForm form) {
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);

        form.setSearchFlg(true);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param mapping Action mapping <br />アクション・マッピング
     * @param form Action Form <br />アクション・フォーム
     * @return Search conditions domain <br />検索条件ドメイン
     * @throws ApplicationException If do not have permission of Packaging Instruction (= Pull) <br />梱包指示の権限がない場合
     */
    protected W9007CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9007ActionForm form) 
        throws ApplicationException {
        
        W9007CriteriaDomain criteriaDomain = form.getW9007CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9007R, PERMIT_FUNC_ID_W9007B };
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
    protected void controlDisplay(W9007ActionForm form,
        HttpServletRequest request) {
        super.controlDisplay(form, request);
        
        form.setDisplayList(true);
    }
}
