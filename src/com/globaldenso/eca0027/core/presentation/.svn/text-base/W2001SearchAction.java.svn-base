/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2001B;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2001ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2001SearchFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;

/**
 *    This is a search action class of a Packaging Instruction (=Pull) Main screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2001.jsp
 *     - "error":W2001.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W2001SearchAction extends W2001AbstractAction {

    /**
     * Search Facade service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W2001ListDomain>, W2001CriteriaDomain> w2001SearchFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001SearchAction() {
        super();
    }

    /**
     * Setter method for w2001SearchFacadeService.
     *
     * @param searchFacadeService Set for w2001SearchFacadeService
     */
    public void setW2001SearchFacadeService(
        SearchFacadeService<List<? extends W2001ListDomain>, W2001CriteriaDomain> searchFacadeService) {
        w2001SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - If the back button was pressed
     *   No Action. (Re-display the screen stack info)
     *   
     * - Otherwise
     *   - Setting of action form
     *         A List domain is cleared.
     *         The maximum search number is set up.
     *
     *   - Setting of a search-condition domain
     *         The following informations are set as {@link W2001CriteriaDomain}.
     *           - Screen common information
     *           - Information required for page control
     *           - User functional utilization right
     *           - A login person's DSC-ID (when the VALUE of Issuer is {@link Eca0027Constants#ISSUER_ID_YOURSELF})  
     *
     *   - Execution of retrieval processing
     *         This is a call about {@link W2001SearchFacadeServiceImpl W2001SearchFacadeServiceImpl#search(W2001CriteriaDomain)} to an argument in {@link W2001CriteriaDomain}.
     *
     *   - Setting of search results
     *         The above-mentioned result is set as a list domain.
     * 
     * - 戻るボタン押下時
     *     何もしない (スタックされた画面情報を再表示)
     * 
     * - 上記以外の場合
     *   - アクションフォームの設定
     *       Listドメインをクリアする
     *       最大検索件数を設定する
     *     
     *   - 検索条件ドメインの設定
     *       以下の情報を{@link W2001CriteriaDomain}に設定する
     *         - 画面共通情報
     *         - ページ制御に必要な情報
     *         - ユーザ機能利用権限
     *         - ログイン者のDSC-ID (Issuerの値が{@link Eca0027Constants#ISSUER_ID_YOURSELF}の場合)
     * 
     *   - 検索処理の実行
     *       {@link W2001CriteriaDomain}を引数に{@link W2001SearchFacadeServiceImpl W2001SearchFacadeServiceImpl#search(W2001CriteriaDomain)}を呼び出す
     *     
     *   - 検索結果の設定
     *       上記の結果をリストドメインに設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        if (!isBack(request)) {
            // Setting of action form
            // アクションフォームの設定
            W2001ActionForm w2001Form = prepareForm((W2001ActionForm) form);
            
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2001CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w2001Form);
            
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends W2001ListDomain> listDomainList = w2001SearchFacadeService.search(criteriaDomain);
            
            // Setting of search results
            // 検索結果の設定
            w2001Form.setListDomainList(listDomainList);
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
    protected W2001ActionForm prepareForm(W2001ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        // The clearance of Packaging Instruction (=Pull) NO has been chosen
        // 選択済みの梱包指示NOのクリア
        form.setPltzInstrNo(null);
        
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
     * @throws ApplicationException When there is no authority of a Packaging Instruction (=Pull)<br />梱包指示の権限がない場合
     */
    protected W2001CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W2001ActionForm form) 
        throws ApplicationException {
        
        W2001CriteriaDomain criteriaDomain = form.getW2001CriteriaDomain();
        
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
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2001R, PERMIT_FUNC_ID_W2001B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        return criteriaDomain;
    }
}
