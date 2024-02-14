/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2014B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2014R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2014ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2014SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Search action class of X-tag Main Screen
 * <br />X-tag Main Screen画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2014.jsp
 *     - "error":W2014.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014SearchAction extends W2014AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2014ListDomain>, W2014CriteriaDomain> w2014SearchFacadeService;

    /**
     * constructor.
     */
    public W2014SearchAction() {
        super();
    }

    /**
     * Setter method for w2014SearchFacadeService.
     *
     * @param searchFacadeService Set for w2014SearchFacadeService
     */
    public void setW2014SearchFacadeService(
        SearchFacadeService<List<? extends W2014ListDomain>, W2014CriteriaDomain> searchFacadeService) {
        w2014SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *       The maximum search number is set up.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2014CriteriaDomain}.
     *         - Screen common information
     *         Information required for - page control
     *         - User functional utilization right
     *
     * - Execution of retrieval processing
     *       This is a call about {@link W2014SearchFacadeServiceImpl W2014SearchFacadeServiceImpl#search (W2014CriteriaDomain)} to an argument in {@link W2014CriteriaDomain}.
     *
     * - Setting of search results
     *       The above-mentioned result is set as a list domain.
     *
     * - Screen fields attributes
     *       Set search-results fields active (display flag is set to true).
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2014CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       - ユーザ機能利用権限
     * 
     * - 検索処理の実行
     *     {@link W2014CriteriaDomain}を引数に{@link W2014SearchFacadeServiceImpl W2014SearchFacadeServiceImpl#search(W2014CriteriaDomain)}を呼出
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        W2014ActionForm w2014Form = prepareForm((W2014ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2014CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2014Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends W2014ListDomain> listDomainList = w2014SearchFacadeService.search(criteriaDomain);
        
        // Setting of search results
        // 検索結果の設定
        w2014Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2014ActionForm prepareForm(W2014ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        // The clearance of Packaging Instruction (=Pull) NO has been chosen
        // 選択済みの梱包指示NOのクリア
        form.setXmainMark(null);
        
        return form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected W2014CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2014ActionForm form) 
        throws ApplicationException {
        
        W2014CriteriaDomain criteriaDomain = form.getW2014CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Setting of authority
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2014R, PERMIT_FUNC_ID_W2014B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
}
