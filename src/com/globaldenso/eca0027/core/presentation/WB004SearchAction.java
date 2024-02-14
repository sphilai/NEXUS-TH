/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB004ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 *    This is a search action class of an ordering search main screen.
 * <br />受注検索メイン画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB004.jsp
 *     - "error":WB004.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class WB004SearchAction extends WB004AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<WB004UpdateDomain, WB004CriteriaDomain> wb004SearchFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB004SearchAction() {
        super();
    }

    /**
     * Setter method for wb004SearchFacadeService.
     *
     * @param searchFacadeService Set for wb004SearchFacadeService
     */
    public void setWb004SearchFacadeService(
        SearchFacadeService<WB004UpdateDomain, WB004CriteriaDomain> searchFacadeService) {
        wb004SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Setting of action form
        // アクションフォームの設定
        WB004ActionForm wb004Form = prepareForm((WB004ActionForm) form);
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        WB004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, wb004Form);
        
        // Execution of retrieval processing
        // 検索処理の実行
        WB004UpdateDomain searchResult = wb004SearchFacadeService.search(criteriaDomain);
        List<? extends WB004ListDomain> listDomainList = searchResult.getListDomainList();
        
        if (listDomainList == null || listDomainList.size() == 0){
            // 0件メッセージ
            ActionMessages messages = getMessages(request);
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_E0_0001));
            
            // GLOBAL_MESSAGEの登録
            addMessages(request, messages);
        }
        
        // Setting in a search-condition domain
        // 検索条件ドメインへの設定
        wb004Form.setWb004CriteriaDomain(criteriaDomain);
        
        // Setting of search results
        // 検索結果の設定
        if (listDomainList != null && listDomainList.size() != 0){
            setListDomainList(mapping, wb004Form, request, listDomainList);
        }
        
        // The clearance of CK.
        // CK.のクリア
        wb004Form.setSelectedIndex(null);
        
        return FORWARD_SUCCESS;
    }

    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB004ActionForm prepareForm(WB004ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
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
    protected WB004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, WB004ActionForm form) 
        throws ApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        WB004CriteriaDomain criteriaDomain = form.getWb004CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
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
    protected void setListDomainList(ActionMapping mapping, WB004ActionForm form, HttpServletRequest request,
        List<? extends WB004ListDomain> searchResult) throws ApplicationException {
        
        // A setting of a List domain (for screen display)
        // Listドメイン(画面表示用)の設定
        form.setListDomainList(searchResult);
    }

}
