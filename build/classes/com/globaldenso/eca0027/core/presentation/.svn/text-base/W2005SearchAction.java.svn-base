/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2005R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2005ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2005SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番Main画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2005.jsp
 *     - "error":W2005.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6756 $
 */
public class W2005SearchAction extends W2005AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2005ListDomain>, W2005CriteriaDomain> w2005SearchFacadeService;
    
    /**
     * constructor.
     */
    public W2005SearchAction() {
        super();
    }

    /**
     * Setter method for w2005SearchFacadeService.
     *
     * @param searchFacadeService Set for w2005SearchFacadeService
     */
    public void setW2005SearchFacadeService(
        SearchFacadeService<List<? extends W2005ListDomain>, W2005CriteriaDomain> searchFacadeService) {
        w2005SearchFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * 
      * - If the back button was pressed
     *   No Action. (Re-display the screen stack info)
     *   
     * - Otherwise
     *   
     *   - Setting of action form
     *         A List domain is cleared.
     *         The maximum search number is set up.
     *
     *   - Setting of a search-condition domain
     *         The following informations are set as {@link W2005CriteriaDomain}.
     *           - Screen common information
     *           Information required for - page control
     *           - User functional utilization right
     *
     *   - Execution of retrieval processing
     *         This is a call about {@link W2005SearchFacadeServiceImpl W2005SearchFacadeServiceImpl#search (W2005CriteriaDomain)} to an argument in {@link W2005CriteriaDomain}.
     *
     *   - Setting of search results
     *         The above-mentioned result is set as a list domain.
     *
     *   - Screen fields attributes
     *         Set screen field attributes ({@link W2005AbstractAction#controlDisplay (W2005ActionForm, HttpServletRequest)}).
     *         Set search-results fields active (display flag is set to true).
     * 
     * - 戻るボタン押下時
     *     何もしない (スタックされた画面情報を再表示)
     *     
     * - 上記以外の場合
     *   - アクションフォームの設定
     *        Listドメインをクリアする
     *        最大検索件数を設定する
     *     
     *    - 検索条件ドメインの設定
     *        以下の情報を{@link W2005CriteriaDomain}に設定する
     *          - 画面共通情報
     *          - ページ制御に必要な情報
     *          - ユーザ機能利用権限
     *     
     *    - 検索処理の実行
     *        {@link W2005CriteriaDomain}を引数に{@link W2005SearchFacadeServiceImpl W2005SearchFacadeServiceImpl#search(W2005CriteriaDomain)}を呼び出す
     *     
     *    - 検索結果の設定
     *        上記の結果をリストドメインに設定する
     *     
     *    - 画面表示制御
     *        画面項目の活性制御を行う ({@link W2005AbstractAction#controlDisplay(W2005ActionForm, HttpServletRequest)})
     *        検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        if (!isBack(request)) {
            // Setting of action form
            // アクションフォームの設定
            W2005ActionForm w2005Form = prepareForm((W2005ActionForm) form);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2005CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2005Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2005ListDomain> listDomainList = w2005SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            w2005Form.setListDomainList(listDomainList);
            
            // Display control of a Main screen
            // Main画面の表示制御
            controlDisplay(w2005Form, request);
        }
        
        return FORWARD_SUCCESS;
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
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2005ActionForm prepareForm(W2005ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        form.setMixTagNo(null);
        
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
    protected W2005CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2005ActionForm form) 
        throws ApplicationException {
        
        W2005CriteriaDomain criteriaDomain = form.getW2005CriteriaDomain();
        
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
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2005R, PERMIT_FUNC_ID_W2005B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
    
    /**
     *    Display control of a screen is performed.
     * <br />画面の表示制御を行います。
     *
     * @param form Action form<br />アクション・フォーム
     * @param request Request<br />リクエスト
     */
    @Override
    protected void controlDisplay(W2005ActionForm form, HttpServletRequest request) {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(form, request);
        
        // Set search-results fields active.
        // 検索結果エリアを表示
        form.setDisplayList(true);
    }
}
