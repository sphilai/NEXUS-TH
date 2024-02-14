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
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7005InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of default display action B / L Update screen.
 * <br />船荷証券更新画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7005
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005InitAction extends W7005AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示 Facadeサービス
     */
    protected SearchFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> w7005InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7005InitAction() {
        super();
    }

    /**
     * Setter method for w7005InitFacadeService.
     *
     * @param initFacadeService Set for w7005InitFacadeService
     */
    public void setW7005InitFacadeService(SearchFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> initFacadeService) {
        w7005InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set to {@link W7005CriteriaDomain} the following information.
     *         ‐Common screen information
     *         ‐Setting of takeover VALUE from Register screen
     * 
     * ‐Retrieval data
     *     Call the {@link W7005InitFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     以下の情報を{@link W7005CriteriaDomain}に設定します。
     *         ‐画面共通情報
     *         ‐Register画面からの引継値の設定
     * 
     * ‐検索データの取得
     *     {@link W7005InitFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7005ActionForm w7005Form = (W7005ActionForm) form;
        
        W7005CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7005Form);
        
        W7005CriteriaDomain resultDomain = w7005InitFacadeService.search(criteriaDomain);
        
        setResult(w7005Form, resultDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the search results.
     * <br />検索結果を設定します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param resultDomain Domain search results is stored<br />
     * 検索結果が格納されたドメイン
     */
    protected void setResult(W7005ActionForm form, W7005CriteriaDomain resultDomain) {
        W7005CriteriaDomain criteriaDomain = form.getW7005CriteriaDomain();

        criteriaDomain.setFileName(resultDomain.getFileName());
        criteriaDomain.setComUpdateTimestamp(resultDomain.getComUpdateTimestamp());
    }
    
    /**
     * Set the {@link W7005CriteriaDomain}.
     * <br />{@link W7005CriteriaDomain}を設定します。
     *
     * @param form Action Form of B / L Update screen<br />
     * 船荷証券更新画面のアクションフォーム
     * @return  {@link W7005CriteriaDomain} It set up.<br />
     * 設定した{@link W7005CriteriaDomain}
     */
    protected W7005CriteriaDomain prepareCriteriaDomain(W7005ActionForm form) {
        W7005CriteriaDomain criteriaDomain = form.getW7005CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W7004);
        W7004ActionForm w7004Form = (W7004ActionForm) screenInfo.getActionForm();
        
        CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w7004Form);
        
        return criteriaDomain;
    }
}
