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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2011SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 *    This is a Search action class of a CML Create screen.
 * <br />CML Create画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2011.jsp
 *     - "error":W2011.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2011SearchAction extends W2011AbstractAction {

    /**
     * Search Facade service
     * <br />Search Facadeサービス
     */
    protected SearchFacadeService<List<? extends W2011ListDomain>, W2011CriteriaDomain> w2011SearchFacadeService;

    /**
     * constructor.
     */
    public W2011SearchAction() {
        super();
    }

    /**
     * Setter method for w2011SearchFacadeServic.
     * 
     * @param searchFacadeServic Set for w2011SearchFacadeServic
     */
    public void setW2011SearchFacadeService(
        SearchFacadeService<List<? extends W2011ListDomain>, W2011CriteriaDomain> searchFacadeServic) {
        w2011SearchFacadeService = searchFacadeServic;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * At the time of - Search button depression
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *           A List domain (result for preservation) is cleared.
     *
     *       - Setting of a search-condition domain
     *           The following informations are set as {@link W2011CriteriaDomain}.
     *             - Screen common information
     *
     *       - Execution of retrieval processing
     *           {@link W2011SearchFacadeServiceImpl W2011SearchFacadeServiceImpl#search(W2011CriteriaDomain)} is called for {@link W2011CriteriaDomain} to an argument.
     *
     *       - Setting of search results
     *           {@link #setListDomainList(ActionMapping, W2011ActionForm, HttpServletRequest, List)} is called,
     *           The data displayed on a screen is set up.
     *
     *       - Preservation of search results
     *           {@link W2011ActionForm#setSearchResult(List)} is called and search results are set up.
     *           The set-up search results are saved using a screen information stack function.
     *
     *       - Display control
     *           Refer to {@link W2011AbstractAction#controlDisplay(HttpServletRequest, W2011ActionForm)}.
     *
     * At the time of - page transition
     *       - Setting of action form
     *           A List domain (for screen display) is cleared.
     *
     *       - Setting of retrieval processing
     *           The search results saved at the session are acquired and the data of an applicable page is extracted.
     *           {@link #setListDomainList(ActionMapping, W2011ActionForm, HttpServletRequest, List)} is called, and the extracted data is set up.
     *
     *       - Display control
     *           Refer to {@link W2011AbstractAction#controlDisplay(HttpServletRequest, W2011ActionForm)}.
     *
     * - Searchボタン押下時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         Listドメイン(結果保存用)をクリアする
     *         
     *     - 検索条件ドメインの設定
     *         以下の情報を{@link W2011CriteriaDomain}に設定する
     *           - 画面共通情報
     *           
     *     - 検索処理の実行
     *         {@link W2011CriteriaDomain}を引数に、{@link W2011SearchFacadeServiceImpl W2011SearchFacadeServiceImpl#search(W2011CriteriaDomain)}を呼出す
     *         
     *     - 検索結果の設定
     *         {@link #setListDomainList(ActionMapping, W2011ActionForm, HttpServletRequest, List)}を呼出し、
     *         画面に表示するデータを設定する
     *     
     *     - 検索結果の保存
     *         {@link W2011ActionForm#setSearchResult(List)}を呼出し、検索結果を設定する
     *         設定した検索結果は画面情報スタック機能を利用して保存する
     *         
     *     - 表示制御
     *         {@link W2011AbstractAction#controlDisplay(HttpServletRequest, W2011ActionForm)}参照
     * 
     * - ページ遷移時
     *     - アクションフォームの設定
     *         Listドメイン(画面表示用)をクリアする
     *         
     *     - 検索処理の設定
     *         セッションに保存されている検索結果を取得し、該当するページのデータを抽出する
     *         {@link #setListDomainList(ActionMapping, W2011ActionForm, HttpServletRequest, List)}を呼出し、抽出したデータを設定する
     *         
     *     - 表示制御
     *         {@link W2011AbstractAction#controlDisplay(HttpServletRequest, W2011ActionForm)}参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W2011ActionForm w2011Form = (W2011ActionForm) form;
        
        // At the time of Search button depression
        // Searchボタン押下時
        if (FLAG_Y.equals(w2011Form.getSearchFlg())) {
            // Setting of action form
            // アクションフォームの設定
            w2011Form = prepareForm(w2011Form, true);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2011CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2011Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2011ListDomain> searchResult = w2011SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2011Form, request, searchResult);
            
            // Preservation of search results
            // 検索結果の保存
            saveSearchResult(w2011Form, searchResult);
            
        // At the time of page transition
        // ページ遷移時
        } else {
            // Setting of action form
            // アクションフォームの設定
            w2011Form = prepareForm(w2011Form, false);
            
            // Setting of search results
            // 検索結果の設定
            setListDomainList(mapping, w2011Form, request, w2011Form.getSearchResult());
        }

        // Display control of a Create screen
        // Create画面の表示制御
        controlDisplay(request, w2011Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * The clearance of - retrieval button depression flag
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     *   
     * - 検索ボタン押下フラグのクリア
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2011AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        // Display control
        // 表示制御
        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplayErr(request, (W2011ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
        
        // The clearance of retrieval button depression flag
        // 検索ボタン押下フラグのクリア
        ((W2011ActionForm) form).setSearchFlg(null);
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param removeSearchResult In true, a List domain (result for preservation) is cleared.<br />trueの場合、Listドメイン(結果保存用)をクリアする
     * @return Action form<br />アクションフォーム
     */
    protected W2011ActionForm prepareForm(W2011ActionForm form, boolean removeSearchResult) {
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
     * @throws GscmApplicationException When object data is unacquirable<br />対象データが取得できない場合
     */
    protected W2011CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2011ActionForm form) throws GscmApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        
        W2011CriteriaDomain criteriaDomain = form.getW2011CriteriaDomain();
        
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
            // In Register All, it overwrites.
            // Register All の場合、上書き。
            baseAuthFlg = AUTH_REGISTER_NUMERIC;
        }
        criteriaDomain.setBaseAuthFlg(baseAuthFlg);
        
        if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2009R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
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
    protected void setListDomainList(ActionMapping mapping, W2011ActionForm form, HttpServletRequest request,
        List<? extends W2011ListDomain> searchResult) throws ApplicationException {
        
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

        // A setting of a List domain (for screen display)
        // Listドメイン(画面表示用)の設定
        form.setListDomainList(new ArrayList<W2011ListDomain>(searchResult.subList(fromCount - 1, toCount)));
    }
    
    /**
     *    Search results are saved.
     * <br />検索結果を保存します。
     *
     * @param form Action form<br />アクションフォーム
     * @param searchResult Search results<br />検索結果
     */
    protected void saveSearchResult(W2011ActionForm form, List<? extends W2011ListDomain> searchResult) {
        // A setting of a List domain (result for preservation)
        // Listドメイン (結果保存用)の設定
        form.setSearchResult(searchResult);
    }
}
