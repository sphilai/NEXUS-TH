/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2009SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * This is a Search action class of a CML Main Screen.
 * <br />CML Main Screen画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2009.jsp
 *     - "error":W2009.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7490 $
 */
public class W2009SearchAction extends W2009AbstractAction {

    /**
     * W2009SearchFacade service
     * <br />W2009SearchFacade サービス
     */
    protected SearchFacadeService<List<? extends W2009ListDomain>, W2009CriteriaDomain> w2009SearchFacadeService;
    
    /**
     * constructor.
     */
    public W2009SearchAction() {
        super();
    }

    /**
     * Setter method for w2009SearchFacadeService.
     *
     * @param searchFacadeService Set for w2009SearchFacadeService
     */
    public void setW2009SearchFacadeService(
        SearchFacadeService<List<? extends W2009ListDomain>, W2009CriteriaDomain> searchFacadeService) {
        w2009SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * Display the data which coincides with the conditions specified in search-condition area.
     * When search results are one or more affairs, display search-results area.
     *
     * - Setting of action form
     *       A List domain is cleared.
     *       The maximum search number is set up.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2009CriteriaDomain}.
     *         - Screen common information
     *         Information required for - page control
     *         - User functional utilization right
     *
     * - Execution of retrieval processing
     *       This is a call about {@link W2009SearchFacadeServiceImpl W2009SearchFacadeServiceImpl#search(W2009CriteriaDomain)} to an argument in {@link W2009CriteriaDomain}.
     *
     * - Setting of search results
     *       The above-mentioned result is set as a list domain.
     *
     * - Screen fields attributes
     *       Set screen field attributes ({@link W2009AbstractAction#controlDisplay(W2009ActionForm, HttpServletRequest)}).
     *       Set search-results fields active (display flag is set to true).
     * 
     * 
     * 検索条件エリアで指定した条件に一致するデータを表示する。
     * 検索結果が1件以上の場合に検索結果エリアを表示する。
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2009CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - ページ制御に必要な情報
     *       - ユーザ機能利用権限
     * 
     * - 検索処理の実行
     *     {@link W2009CriteriaDomain}を引数に{@link W2009SearchFacadeServiceImpl W2009SearchFacadeServiceImpl#search(W2009CriteriaDomain)}を呼び出す
     *     
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W2009AbstractAction#controlDisplay(W2009ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        if (!isBack(request)) {
            // Setting of action form
            // アクションフォームの設定
            W2009ActionForm w2009Form = prepareForm((W2009ActionForm) form);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2009Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2009ListDomain> listDomainList = w2009SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            w2009Form.setListDomainList(listDomainList);
            
            if (listDomainList.size() > 0) {
                w2009Form.setDisplayList(true);
            }
            
            // Display control of a Main screen
            // Main画面の表示制御
            controlDisplay(w2009Form, request);
        }
        
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
     * - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     * 
     * 
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            // 表示制御
            controlDisplay((W2009ActionForm)form, request);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }

    /**
     * Check if the back button was pressed
     * <br />戻るボタンによる画面遷移かどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return true if the back button was pressed, otherwise false<br />戻るボタンによる画面遷移であればtrue、それ以外はfalse
     */
    protected boolean isBack(HttpServletRequest request) {
        return Boolean.valueOf(request.getParameter("back"));
    }
    
    /**
     * Set up action form.
     * <br />アクションフォームを設定します。
     *
     * @param form action form<br />アクションフォーム
     * @return action form<br />アクションフォーム
     */
    protected W2009ActionForm prepareForm(W2009ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setDisplayList(false);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set up a search-condition domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping action mapping<br />アクション・マッピング
     * @param form action form<br />アクション・フォーム
     * @return search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected W2009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2009ActionForm form) 
        throws ApplicationException {
        
        W2009CriteriaDomain criteriaDomain = form.getW2009CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // When Issuer is "yourself", a login user's DSC-ID is set up.
        // Issuer が "yourself" の場合は、ログインユーザのDSC-IDを設定する。
        if ("yourself".equals(criteriaDomain.getExpPackingIssuerId())) {
            criteriaDomain.setExpPackingIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        // page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
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
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2009R, PERMIT_FUNC_ID_W2009B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0 && AUTH_EMPTY_NUMERIC.equals(baseAuthFlg)) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
    
}
