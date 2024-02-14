/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2003SearchFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is a search action class of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2003.jsp
 *     - "error":W2003.jsp
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2003SearchAction extends W2003AbstractAction {

    /**
     * Search Facade service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W2003ListDomain>, W2003CriteriaDomain> w2003SearchFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003SearchAction() {
        super();
    }

    /**
     * Setter method for w2003SearchFacadeService.
     *
     * @param searchFacadeService Set for w2003SearchFacadeService
     */
    public void setW2003SearchFacadeService(
        SearchFacadeService<List<? extends W2003ListDomain>, W2003CriteriaDomain> searchFacadeService) {
        w2003SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - The clearance of retrieval button depression flag
     *       {@link W2003ActionForm#setSearchFlg(String)} is called,
     * 
     * 
     * - 検索ボタン押下フラグのクリア
     *     {@link W2003ActionForm#setSearchFlg(String)}を呼出し、
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        super.postInvokeExecute(mapping, form, request, response, forwardName);
        
        ((W2003ActionForm) form).setSearchFlg(null);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * At the time of - Search button depression
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *           A List domain (result for preservation) is cleared.
     *
     *       - Setting of a search-condition domain
     *           The following informations are set as {@link W2003CriteriaDomain}.
     *             - Screen common information
     *
     *       - Execution of retrieval processing
     *           {@link W2003SearchFacadeServiceImpl W2003SearchFacadeServiceImpl#search(W2003CriteriaDomain)} is called for {@link W2003CriteriaDomain} to an argument.
     *
     *       - Setting of search results
     *           {@link #setListDomainList(ActionMapping, W2003ActionForm, HttpServletRequest, List)} is called,
     *           The data displayed on a screen is set up.
     *
     *       - Preservation of search results
     *           {@link W2003ActionForm#setSearchResult(List)} is called and search results are set up.
     *           The set-up search results are saved using a screen information stack function.
     *
     * At the time of - page transition
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *
     *       - Setting of retrieval processing
     *           The search results saved at the session are acquired and the data of an applicable page is extracted.
     *           {@link #setListDomainList(ActionMapping, W2003ActionForm, HttpServletRequest, List)} is called, and the extracted data is set up.
     * 
     * 
     * - Searchボタン押下時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         Listドメイン(結果保存用)をクリアする
     *         
     *     - 検索条件ドメインの設定
     *         以下の情報を{@link W2003CriteriaDomain}に設定する
     *           - 画面共通情報
     *           
     *     - 検索処理の実行
     *         {@link W2003CriteriaDomain}を引数に、{@link W2003SearchFacadeServiceImpl W2003SearchFacadeServiceImpl#search(W2003CriteriaDomain)}を呼出す
     *         
     *     - 検索結果の設定
     *         {@link #setListDomainList(ActionMapping, W2003ActionForm, HttpServletRequest, List)}を呼出し、
     *         画面に表示するデータを設定する
     *     
     *     - 検索結果の保存
     *         {@link W2003ActionForm#setSearchResult(List)}を呼出し、検索結果を設定する
     *         設定した検索結果は画面情報スタック機能を利用して保存する
     * 
     * - ページ遷移時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         
     *     - 検索処理の設定
     *         セッションに保存されている検索結果を取得し、該当するページのデータを抽出する
     *         {@link #setListDomainList(ActionMapping, W2003ActionForm, HttpServletRequest, List)}を呼出し、抽出したデータを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2003ActionForm w2003Form = (W2003ActionForm) form;
        
        // At the time of Search button depression
        // Searchボタン押下時
        if (FLAG_Y.equals(w2003Form.getSearchFlg())) {
            // Setting of action form
            // アクションフォームの設定
            w2003Form = prepareForm(w2003Form, true);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2003CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2003Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2003ListDomain> searchResult = w2003SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2003Form, request, searchResult);
            
            // Preservation of search results
            // 検索結果の保存
            saveSearchResult(w2003Form, searchResult);
            
        // At the time of page transition
        // ページ遷移時
        } else {
            // Setting of action form
            // アクションフォームの設定
            w2003Form = prepareForm(w2003Form, false);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2003Form, request, w2003Form.getSearchResult());
        }

        return FORWARD_SUCCESS;
    }

    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param removeSearchResult In true, a List domain (result for preservation) is cleared.<br />trueの場合、Listドメイン(結果保存用)をクリアする
     * @return Action form<br />アクションフォーム
     */
    protected W2003ActionForm prepareForm(W2003ActionForm form, boolean removeSearchResult) {
        // The clearance of a List domain (for screen display)
        // Listドメイン(画面表示用)のクリア
        form.setListDomainList(null);
        
        // The clearance of a List domain (result for preservation)
        // Listドメイン(結果保存用)のクリア
        if (removeSearchResult) {
            form.setSearchResult(null);
        }
        
        return form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2003CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2003ActionForm form) {
        // 検索条件ドメインの作成
        
        W2003CriteriaDomain criteriaDomain = form.getW2003CriteriaDomain();
        
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setIgnoreWarnings(null);
        
        return criteriaDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @param searchResult Search results<br />検索結果
     * @throws ApplicationException When page information is unacquirable<br />ページ情報が取得できない場合
     */
    protected void setListDomainList(ActionMapping mapping, W2003ActionForm form, HttpServletRequest request,
        List<? extends W2003ListDomain> searchResult) throws ApplicationException {
        
        // Set page size
        // ページサイズの設定
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(searchResult.size(), null, null, getLocale(form));

        // Acquisition of a display rectangle
        // 表示範囲の取得
        int fromCount = pageInfoData.getFromCount();
        int toCount = pageInfoData.getToCount();

        // setting of a List domain (for screen display)
        // Listドメイン(画面表示用)の設定
        form.setListDomainList(new ArrayList<W2003ListDomain>(searchResult.subList(fromCount - 1, toCount)));
        
        // Reset of WarningFlg
        // WarningFlgのリセット
        form.getW2003CriteriaDomain().setIgnoreWarnings(FLAG_N);
    }
    
    /**
     *    Search results are saved.
     * <br />検索結果を保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param searchResult Search results<br />検索結果
     */
    protected void saveSearchResult(W2003ActionForm form, List<? extends W2003ListDomain> searchResult) {
        // setting of a List domain (result for preservation)
        // Listドメイン (結果保存用)の設定
        form.setSearchResult(searchResult);
    }
}
