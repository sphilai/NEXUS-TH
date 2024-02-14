/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2019ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2019InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is an Init action class of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2019.jsp
 *     - "error":W2019.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class W2019InitAction extends W2019AbstractAction {

    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> w2019InitFacadeService;

    /**
     * constructor.
     */
    public W2019InitAction() {
        super();
    }

    /**
     * Setter method for w2019InitFacadeService.
     *
     * @param initFacadeServise Set for w2019InitFacadeService
     *
     */
    public void setW2019InitFacadeService(
        SearchFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> initFacadeServise) {
        
        w2019InitFacadeService = initFacadeServise;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A search condition is set to {@link W2019CriteriaDomain}.
     *
     * - Object information is acquired from a Palletize table.
     *     {@link W2019InitFacadeServiceImpl W2019InitFacadeServiceImpl#search(W2019CriteriaDomain)} is called.
     *
     * - When there is zero object information
     *     It changes on a caller screen.
     *
     * - When object information is one or more affairs
     *     - Search results are displayed on a list.
     *     - The following informations are set to a session.
     *     - CML No.
     *     - Change Trans. To Air
     *     - Change Outer CD
     *     - Update Time
     *
     * - {@link W2019CriteriaDomain} に、検索条件を設定する。
     * 
     * - パレタイズテーブルから対象情報を取得
     *   {@link W2019InitFacadeServiceImpl W2019InitFacadeServiceImpl#search(W2019CriteriaDomain)} を呼出す。
     *   
     * - 対象情報が0件の場合
     *   呼出元画面に遷移する。
     * 
     * - 対象情報が1件以上の場合
     *   - 検索結果を一覧に表示する。
     *   - セッションに以下の情報を設定
     *     - CML No.
     *     - Change Trans. To Air
     *     - Change Outer CD
     *     - Update Time
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

        // Setting of action form
        // アクションフォームの設定
        W2019ActionForm w2019Form = setActionForm(request, form); 
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2019Form);

        List<? extends W2019ListDomain> listDomainList = w2019InitFacadeService.search(criteriaDomain);

        if (listDomainList != null && 0 < listDomainList.size()) {
            
            // A setting of a setting and Session of search results
            // 検索結果の設定・Sessionの設定
            setSearchResult(w2019Form, criteriaDomain, listDomainList);
            
            return FORWARD_SUCCESS;

        } else {

            // When the number of search results is zero, it changes to a Transition original screen.
            // 検索結果が0件の場合、遷移元画面に遷移
            return w2019Form.getCallScreenId();
        }
    }

    /**
     *    Action form is set up.
     * <br />アクションフォームを設定する
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     * @return Action form of a CML Trans Revise screen<br />CML Trans Revise 画面のアクションフォーム
     */
    protected W2019ActionForm setActionForm(HttpServletRequest request,
        ActionForm form) {
        W2019ActionForm w2019Form = (W2019ActionForm)form;

        if (SCREEN_ID_W2009.equals(w2019Form.getCallScreenId())) {
            // At the time of the changes from a CML Main Screen
            // CML Main Screen 画面からの遷移時
            String mainMark = (String)request.getAttribute("mainMark");
            w2019Form.getW2019CriteriaDomain().setMainMark(mainMark);
            w2019Form.getW2019CriteriaDomain().setOuterPkgCd("");
            w2019Form.getW2019CriteriaDomain().setOriginalScreenId(SCREEN_ID_W2009);
        } else if (SCREEN_ID_W2013.equals(w2019Form.getCallScreenId())) {
            // At the time of the changes from a CML Pkg Detail screen
            // CML Pkg Detail 画面からの遷移時
            w2019Form.getW2019CriteriaDomain().setOriginalScreenId(SCREEN_ID_W2013);
        }
        
        w2019Form.setListDomainList(null);
        
        return w2019Form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2019CriteriaDomain prepareCriteriaDomain(W2019ActionForm form) {
        
        W2019CriteriaDomain criteriaDomain = form.getW2019CriteriaDomain();
        
        // Set transition original screen id
        // 遷移元画面の設定
        criteriaDomain.setOriginalScreenId(form.getCallScreenId());
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());

        return criteriaDomain;
    }

    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param criteria The domain of search-condition area<br />検索条件エリアのドメイン
     * @param listDomainList Search results<br />検索結果
     */
    protected void setSearchResult(W2019ActionForm form, W2019CriteriaDomain criteria, List<? extends W2019ListDomain> listDomainList) {

        // A setting of a Criteria domain
        // The item of following is registered into Session.
        //      - CML No.
        //      - Change Trans. To Air
        //      - Change Outer CD
        //      - hidden Update Time
        
        // Criteriaドメインの設定
        //   以下の項目をSessionに登録
        //    - CML No.
        //    - Change Trans. To Air
        //    - Change Outer CD
        //    - hidden Update Time
        form.setW2019CriteriaDomain(criteria);
        
        // A setting of a List domain
        // Listドメインの設定
        form.setListDomainList(listDomainList);
    }
}
