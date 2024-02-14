/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 *    This is a search action class of a Last Digit Change Main Screen.
 * <br />品番末尾変更メイン画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB006.jsp
 *     - "error":WB006.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB006SearchAction extends WB006AbstractAction {

    /**
     * SearchFacade service
     * <br />SearchFacadeサービス
     */
    protected SearchFacadeService<WB006UpdateDomain, WB006CriteriaDomain> wb006SearchFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB006SearchAction() {
        super();
    }

    /**
     * Setter method for wb006SearchFacadeService.
     *
     * @param searchFacadeService Set for wb006SearchFacadeService
     */
    public void setWb006SearchFacadeService(
        SearchFacadeService<WB006UpdateDomain, WB006CriteriaDomain> searchFacadeService) {
        wb006SearchFacadeService = searchFacadeService;
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
        WB006ActionForm wb006Form = prepareForm((WB006ActionForm) form);

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        WB006CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, wb006Form);

        // Execution of retrieval processing
        // 検索処理の実行
        WB006UpdateDomain updateDomain = wb006SearchFacadeService.search(criteriaDomain);

        // An additional setup of the insufficient item of a PL search-condition domain
        // PL検索条件ドメインの不足項目の追加設定
        criteriaDomain.setRcvOdrCompCdHidden(criteriaDomain.getRcvOdrCompCd());
        criteriaDomain.setCustomerCdHidden(criteriaDomain.getCustomerCd());
        criteriaDomain.setLgcyShipToHidden(criteriaDomain.getLgcyShipTo());
        criteriaDomain.setTrnsCdHidden(criteriaDomain.getTrnsCd());
        criteriaDomain.setShippingDtHidden(criteriaDomain.getShippingDt());
        criteriaDomain.setItemNoHidden(criteriaDomain.getItemNoOrg());
        
        // Setting of search results
        // 検索結果の設定
        wb006Form.setWb006CriteriaDomain(updateDomain.getCriteriaDomain());
        wb006Form.setWb006ListDomainList(updateDomain.getListDomainList());
        
        // The clearance of CK.
        // CK.のクリア
        wb006Form.setSelectedIndex(null);
        
        return FORWARD_SUCCESS;
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
    protected WB006CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, WB006ActionForm form) 
        throws ApplicationException {
        // Setting of action form
        // アクションフォームの設定
        prepareForm(form);
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        WB006CriteriaDomain criteriaDomain = form.getWb006CriteriaDomain();
        
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
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB006ActionForm prepareForm(WB006ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setWb006ListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
}
