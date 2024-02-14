/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9016B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9016R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9016SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "success":W9016.jsp
 *     - "error":W9016.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W9016SearchAction extends W9016AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9016ListDomain>, W9016CriteriaDomain> w9016SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016SearchAction() {
        super();
    }

    /**
     * Setter method for w9016SearchFacadeService.
     *
     * @param searchFacadeService Set for w9016SearchFacadeService
     */
    public void setW9016SearchFacadeService(
        SearchFacadeService<List<? extends W9016ListDomain>, W9016CriteriaDomain> searchFacadeService) {
        w9016SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Setting the action form
     *     Clear the List domain
     *     Set the maximum number of searches
     *     
     * - Set of search criteria domain
     *     Set to {@link W9016CriteriaDomain} the following information:
     *       - Common screen information
     *       - Information necessary to control page
     *       - User function use authority
     *       
     * - Execution of the search process
     *     Call {@link W9016SearchFacadeServiceImpl} as an argument {@link W9016CriteriaDomain}
     *     
     * - Set of search results
     *     Set the domain list the results of the above-mentioned
     *
     * - Screen display control
     *     Active control of the screen item ({@link W9016AbstractAction#controlDisplay(W9016ActionForm, HttpServletRequest)})
     *     Display the search results area (I want to display the true flag)
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W9016CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       - ユーザ機能利用権限
     *       
     * - 検索処理の実行
     *     {@link W9016CriteriaDomain}を引数に{@link W9016SearchFacadeServiceImpl}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9016AbstractAction#controlDisplay(W9016ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9016ActionForm w9016Form = prepareForm((W9016ActionForm) form);
        
        W9016CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9016Form);
        
        List<? extends W9016ListDomain> listDomainList = w9016SearchFacadeService.search(criteriaDomain);
        
        w9016Form.setListDomainList(listDomainList);
        
        controlDisplay(w9016Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return Action Form <br />アクションフォーム
     */
    protected W9016ActionForm prepareForm(W9016ActionForm form) {
        
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action Form<br />アクション・フォーム
     * @return Search conditions domain<br />検索条件ドメイン
     * @throws ApplicationException If do not have permission of Packaging Instruction (= Pull) <br />梱包指示の権限がない場合
     */
    protected W9016CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9016ActionForm form) 
        throws ApplicationException {
        
        W9016CriteriaDomain criteriaDomain = form.getW9016CriteriaDomain();
        // Set pushed down status of the Search button.
        // Searchボタンを押下状態にする
        criteriaDomain.setSelectCondition("1");
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        // ※compCdが書き換わるので、後で戻す
        String compCd = criteriaDomain.getCompCd();
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setCompCd(compCd);
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W9016R, PERMIT_FUNC_ID_W9016B};
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
}
