/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB002UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.WB002InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Initial display action of an ordering registration picture.
 * <br />
 * 受注登録画面の初期表示アクション。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:WB002.jsp
 *     - &quot;error&quot;:WB002.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB002InitAction extends WB002AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<WB002UpdateDomain, WB002CriteriaDomain> wb002InitFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB002InitAction() {
        super();
    }

    /**
     * Setter method for wb002InitFacadeService.
     *
     * @param wb002InitFacadeService Set for wb002InitFacadeService
     */
    public void setWb002InitFacadeService(
        SearchFacadeService<WB002UpdateDomain, WB002CriteriaDomain> wb002InitFacadeService) {
        this.wb002InitFacadeService = wb002InitFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link WB002CriteriaDomain}.
     *         - Screen common information
     *         Information on - B001 screen
     *
     * - Execution of retrieval processing
     *       {@link WB002InitFacadeServiceImpl WB002InitFacadeServiceImpl#search(WB002CriteriaDomain)} is called for {@link WB002CriteriaDomain} to an argument.
     *
     * - Setting of search results
     *       The above-mentioned result is set as {@link WB002ActionForm#wb002CriteriaDomain}.
     *       The above-mentioned result is set as {@link WB002ActionForm#wb002ListDomainList}.
     *
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link WB002CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - B001画面の情報
     *       
     * - 検索処理の実行
     *     {@link WB002CriteriaDomain}を引数に{@link WB002InitFacadeServiceImpl WB002InitFacadeServiceImpl#search(WB002CriteriaDomain)}を呼出す
     * 
     * - 検索結果の設定
     *     上記の結果を{@link WB002ActionForm#wb002CriteriaDomain}に設定する
     *     上記の結果を{@link WB002ActionForm#wb002ListDomainList}に設定する
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        // Setting of action form
        // アクションフォームの設定
        WB002ActionForm wb002Form = prepareForm((WB002ActionForm)form);

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        WB002CriteriaDomain criteriaDomain = prepareUpdateDomain(wb002Form);

        // Execution of retrieval processing
        // 検索処理の実行
        WB002UpdateDomain resultUpdateDomain = wb002InitFacadeService.search(criteriaDomain);

        // Setting of search results
        // 検索結果の設定
        setSearchResult(wb002Form, resultUpdateDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * Set up action form.
     * <br />
     * アクションフォームを設定します。
     * 
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB002ActionForm prepareForm(WB002ActionForm form) {
        // The clearance of a List domain
        // Listドメインのクリア
        form.setWb002ListDomainList(null);

        return form;
    }

    /**
     * Set up a search-condition domain.
     * <br />
     * 検索条件ドメインを設定します。
     * 
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected WB002CriteriaDomain prepareUpdateDomain(WB002ActionForm form) {
        
        WB002CriteriaDomain criteriaDomain = form.getWb002CriteriaDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        // Acquisition of B001 screen information
        // B001画面情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(WINDOW_ID_0);
        ScreenInfoDomain screenInfo = (ScreenInfoDomain)windowInfo.getScreenInfo().get(SCREEN_ID_WB001);

        // Acquisition of the VALUE of B001 screen
        // B001画面の値の取得
        WB001ActionForm wb001Form = (WB001ActionForm)screenInfo.getActionForm();
        WB001CriteriaDomain headerInfo = wb001Form.getWb001CriteriaDomain();

        // A setting of the VALUE of B001 screen
        // B001画面の値の設定
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);

        return criteriaDomain;
    }

    /**
     * Set up search results.
     * <br />
     * 検索結果を設定します。
     * 
     * @param form Action form<br />アクションフォーム
     * @param updateDomain Search results<br />検索結果
     */
    protected void setSearchResult(WB002ActionForm form, WB002UpdateDomain updateDomain) {
        
        // A setting of a Criteria domain
        // Criteriaドメインの設定
        form.setWb002CriteriaDomain(updateDomain.getCriteriaDomain());
        
        // A setting of a List domain
        // Listドメインの設定
        form.setWb002ListDomainList(updateDomain.getListDomainList());
    }
}
