/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7006InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial display of class action Shipping Document Upload screen.
 * <br />船積書類アップロード画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7006InitAction extends W7006AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示 Facadeサービス
     */
    protected SearchFacadeService<W7006UpdateDomain, W7006CriteriaDomain> w7006InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006InitAction() {
        super();
    }

    /**
     * Setter method for w7006InitFacadeService.
     *
     * @param initFacadeService Set for w7006InitFacadeService
     */
    public void setW7006InitFacadeService(SearchFacadeService<W7006UpdateDomain, W7006CriteriaDomain> initFacadeService) {
        w7006InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set to {@link W7005CriteriaDomain} the following information.
     *         ‐Common screen information
     *         ‐Takeover information from the original screen transition
     * 
     * ‐Retrieval data
     *     Call {@link W7006InitFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     以下の情報を{@link W7005CriteriaDomain}に設定します。
     *         ‐画面共通情報
     *         ‐遷移元画面からの引継情報
     * 
     * ‐検索データの取得
     *     {@link W7006InitFacadeServiceImpl}を呼び出します。
     * 
     * ‐検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7006ActionForm w7006Form = (W7006ActionForm) form;
        
        W7006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7006Form);
        
        W7006UpdateDomain resultDomain = w7006InitFacadeService.search(criteriaDomain);
        
        w7006Form.setW7006CriteriaDomain(resultDomain.getW7006CriteriaDomain());
        w7006Form.setListDomainList(resultDomain.getListDomainList());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7006CriteriaDomain}.
     * <br />{@link W7006CriteriaDomain}を設定します。
     *
     * @param form Action Form of Shipping Document Upload screen<br />
     * 船積書類アップロード画面のアクションフォーム
     * @return  {@link W7006CriteriaDomain} It set up.<br />
     * 設定した{@link W7006CriteriaDomain}
     */
    protected W7006CriteriaDomain prepareCriteriaDomain (W7006ActionForm form) {
        W7006CriteriaDomain criteriaDomain = form.getW7006CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W7004);
        W7004ActionForm w7004Form = (W7004ActionForm) screenInfo.getActionForm();
        
        CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w7004Form);
        
        return criteriaDomain;
    }
}
