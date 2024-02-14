/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2007SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * The Search Screen action class of Multiple Item No. in 1Box PKG Create Screen
 * <br />小箱内多品番Create画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2007.jsp
 *     - "error":W2007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2007SearchAction extends W2007AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2007ListDomain>, W2007CriteriaDomain> w2007SearchFacadeService;
    
    /**
     * constructor.
     */
    public W2007SearchAction() {
        super();
    }

    /**
     * Setter method for w2007SearchFacadeService.
     *
     * @param searchFacadeService Set for w2007SearchFacadeService
     */
    public void setW2007SearchFacadeService(
        SearchFacadeService<List<? extends W2007ListDomain>, W2007CriteriaDomain> searchFacadeService) {
        w2007SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * The clearance of - retrieval button depression flag
     *       {@link W2007ActionForm#setSearchFlg (String)} is called,
     *
     * - 検索ボタン押下フラグのクリア
     *     {@link W2007ActionForm#setSearchFlg(String)}を呼出し、
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        super.postInvokeExecute(mapping, form, request, response, forwardName);
        
        ((W2007ActionForm) form).setSearchFlg(null);
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * At the time of - Search button depression
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *           A List domain (result for preservation) is cleared.
     *
     *       - Setting of a search-condition domain
     *           The following informations are set as {@link W2007CriteriaDomain}.
     *             - Screen common information
     *
     *       - Execution of retrieval processing
     *           {@link W2007SearchFacadeServiceImpl W2007SearchFacadeServiceImpl#search (W2007CriteriaDomain)} is called for {@link W2007CriteriaDomain} to an argument.
     *
     *       - Setting of search results
     *           {@link #setListDomainList (ActionMapping, W2007ActionForm, HttpServletRequest, List)} is called,
     *           The data displayed on a screen is set up.
     *
     *       - Preservation of search results
     *           {@link W2007ActionForm#setSearchResult (List)} is called and search results are set up.
     *           The set-up search results are saved using a screen information stack function.
     *
     *       - Display control
     *           If search results are one or more affairs, search-results area will be displayed.
     *           When disableFlg of a List domain is "N", suppose that this is active.
     *
     * At the time of - page transition
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *
     *       - Setting of retrieval processing
     *           The search results saved at the session are acquired and the data of an applicable page is extracted.
     *           {@link #setListDomainList (ActionMapping, W2007ActionForm, HttpServletRequest, List)} is called, and the extracted data is set up.
     *
     *       - Display control
     *           The same processing as the time of Search button depression is performed.
     *
     *
     * - Searchボタン押下時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         Listドメイン(結果保存用)をクリアする
     *         
     *     - 検索条件ドメインの設定
     *         以下の情報を{@link W2007CriteriaDomain}に設定する
     *           - 画面共通情報
     *           
     *     - 検索処理の実行
     *         {@link W2007CriteriaDomain}を引数に、{@link W2007SearchFacadeServiceImpl W2007SearchFacadeServiceImpl#search(W2007CriteriaDomain)}を呼出す
     *         
     *     - 検索結果の設定
     *         {@link #setListDomainList(ActionMapping, W2007ActionForm, HttpServletRequest, List)}を呼出し、
     *         画面に表示するデータを設定する
     *     
     *     - 検索結果の保存
     *         {@link W2007ActionForm#setSearchResult(List)}を呼出し、検索結果を設定する
     *         設定した検索結果は画面情報スタック機能を利用して保存する
     *         
     *     - 表示制御
     *         検索結果が1件以上であれば、検索結果エリアを表示する
     *         ListドメインのdisableFlgが"N"の場合、活性とする
     * 
     * - ページ遷移時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         
     *     - 検索処理の設定
     *         セッションに保存されている検索結果を取得し、該当するページのデータを抽出する
     *         {@link #setListDomainList(ActionMapping, W2007ActionForm, HttpServletRequest, List)}を呼出し、抽出したデータを設定する
     *         
     *     - 表示制御
     *         Searchボタン押下時と同じ処理を行う
     *        
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W2007ActionForm w2007Form = (W2007ActionForm) form;
        
        // Search button depression
        // Searchボタン押下時
        if (FLAG_Y.equals(w2007Form.getSearchFlg())) {
            // Setting of action form
            // アクションフォームの設定
            w2007Form = prepareForm(w2007Form, true);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2007CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2007Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2007ListDomain> searchResult = w2007SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2007Form, request, searchResult);
            
            // Preservation of search results
            // 検索結果の保存
            saveSearchResult(w2007Form, searchResult);
            
        // page transition
        // ページ遷移時
        } else {
            // Setting of action form
            // アクションフォームの設定
            w2007Form = prepareForm(w2007Form, false);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2007Form, request, w2007Form.getSearchResult());
        }
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param removeSearchResult In true, a List domain (result for preservation) is cleared.<br />trueの場合、Listドメイン(結果保存用)をクリアする
     * @return Action form<br />アクションフォーム
     */
    protected W2007ActionForm prepareForm(W2007ActionForm form, boolean removeSearchResult) {
        // List domain (for screen display)
        // Listドメイン(画面表示用)のクリア
        form.setListDomainList(null);
        
        // List domain (result for preservation)
        // Listドメイン(結果保存用)のクリア
        if (removeSearchResult) {
            form.setSearchResult(null);
        }
        
        return form;
    }
    
    /**
     * Set up a search-condition domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected W2007CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2007ActionForm form) 
        throws ApplicationException {
        
        W2007CriteriaDomain criteriaDomain = form.getW2007CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of authority
        // 権限の設定
        String baseAuthFlg = AUTH_EMPTY_NUMERIC;
        if (userAuthService.hasBrowseAll()) {
            // Browse All
            baseAuthFlg = AUTH_BROWSE_NUMERIC;
        }
        if (userAuthService.hasRegisterAll()) {
            // Register All, it overwrites.
            // Register All の場合、上書き。
            baseAuthFlg = AUTH_REGISTER_NUMERIC;
        }
        criteriaDomain.setBaseAuthFlg(baseAuthFlg);
        
        if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2005R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
    /**
     * Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @param searchResult Search results<br />検索結果
     * @throws ApplicationException When page information is unacquirable<br />ページ情報が取得できない場合
     */
    protected void setListDomainList(ActionMapping mapping, W2007ActionForm form, HttpServletRequest request,
        List<? extends W2007ListDomain> searchResult) throws ApplicationException {
        
        // Set page size
        // ページサイズの設定
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        // page information
        // ページ情報の取得
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(searchResult.size(), null, null, getLocale(form));

        // Acquisition of a display rectangle
        // 表示範囲の取得
        int fromCount = pageInfoData.getFromCount();
        int toCount = pageInfoData.getToCount();

        // List domain (for screen display)
        // Listドメイン(画面表示用)の設定
        form.setListDomainList(new ArrayList<W2007ListDomain>(searchResult.subList(fromCount - 1, toCount)));
    }
    
    /**
     * Search results are saved.
     * <br />検索結果を保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param searchResult Search results<br />検索結果
     */
    protected void saveSearchResult(W2007ActionForm form, List<? extends W2007ListDomain> searchResult) {
        // A setting of a List domain (result for preservation)
        // Listドメイン (結果保存用)の設定
        form.setSearchResult(searchResult);
    }

}
