/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9018B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9018R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9018SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "success":W9018.jsp
 *     - "error":W9018.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 9080 $
 */
public class W9018SearchAction extends W9018AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> w9018SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018SearchAction() {
        super();
    }

    /**
     * Setter method for w9018SearchFacadeService.
     *
     * @param searchFacadeService Set for w9018SearchFacadeService
     */
    public void setW9018SearchFacadeService(
        SearchFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> searchFacadeService) {
        w9018SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Setting the action form
     *     Clear the List domain
     *     Set the maximum number of searches
     *     
     * - Set of search criteria domain
     *     Set to {@link W9018CriteriaDomain} the following information:
     *       - Common screen information
     *       - Information necessary to control page
     *       
     * - Execution of the search process
     *     Call {@link W9018SearchFacadeServiceImpl} as an argument {@link W9018CriteriaDomain}
     *     
     * - Set of search results
     *     Set the domain list the results of the above-mentioned
     *
     * - Screen display control
     *     Active control of the screen item ({@link W9018AbstractAction#controlDisplay(W9018ActionForm, HttpServletRequest)})
     *     Display the search results area (Display the true flag)
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W9018CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       
     * - 検索処理の実行
     *     {@link W9018CriteriaDomain}を引数に{@link W9018SearchFacadeServiceImpl}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9018AbstractAction#controlDisplay(W9018ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9018ActionForm w9018Form = prepareForm((W9018ActionForm) form);
        
        W9018CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9018Form);
        
        List<? extends W9018ListDomain> listDomainList = w9018SearchFacadeService.search(criteriaDomain);
        
        w9018Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return Action Form <br />アクションフォーム
     */
    protected W9018ActionForm prepareForm(W9018ActionForm form) {
        
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
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
    protected W9018CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9018ActionForm form) 
        throws ApplicationException {
        
        W9018CriteriaDomain criteriaDomain = form.getW9018CriteriaDomain();
        
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll()) {
            criteriaDomain.setUserAuthList(null);
        } else if (userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W9018B, PERMIT_FUNC_ID_W9018R};
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
}
