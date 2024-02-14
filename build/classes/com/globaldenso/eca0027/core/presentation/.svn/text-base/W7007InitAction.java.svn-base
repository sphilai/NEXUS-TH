/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W7007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7007ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7007InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of display for default action  B / L upload screen.
 * <br />B/Lアップロード画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7007
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7007InitAction extends W7007AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示 Facadeサービス
     */
    protected SearchFacadeService<List<? extends W7007ListDomain>, W7007CriteriaDomain> w7007InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7007InitAction() {
        super();
    }

    /**
     * Setter method for w7007InitFacadeService.
     *
     * @param initFacadeService Set for w7007InitFacadeService
     */
    public void setW7007InitFacadeService(SearchFacadeService<List<? extends W7007ListDomain>, W7007CriteriaDomain> initFacadeService) {
        w7007InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting the action form
     *     Call {@link #prepareForm(W7007ActionForm)}.
     * 
     * ‐Set of search criteria domain
     *     Set to {@link W7007CriteriaDomain} the following information.
     *         ‐Common screen information
     *         ‐Take-over of information from the original screen transition
     * 
     * ‐Retrieval data
     *     Call {@link W7007InitFacadeServiceImpl}
     * 
     * ‐Set of search results
     * </pre>
     * <pre>
     * ‐アクションフォームの設定
     *     {@link #prepareForm(W7007ActionForm)}を呼び出します。
     * 
     * ‐検索条件ドメインの設定
     *     以下の情報を{@link W7007CriteriaDomain}に設定します。
     *         ‐画面共通情報
     *         ‐遷移元画面からの引継ぎ情報
     * 
     * ‐検索データの取得
     *     {@link W7007InitFacadeServiceImpl}を呼び出します。
     * 
     * ‐検索結果の設定
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7007ActionForm w7007Form = prepareForm((W7007ActionForm) form); 
        
        W7007CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7007Form);
        
        List<? extends W7007ListDomain> listDomainList = w7007InitFacadeService.search(criteriaDomain);
        
        w7007Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7007CriteriaDomain}.
     * <br />{@link W7007CriteriaDomain}を設定します。
     *
     * @param form Action Form of B / L upload screen<br />
     * B/Lアップロード画面のアクションフォーム
     * @return  {@link W7007CriteriaDomain} It set up.<br />
     * 設定した{@link W7007CriteriaDomain}
     */
    protected W7007CriteriaDomain prepareCriteriaDomain(W7007ActionForm form) {
        W7007CriteriaDomain criteriaDomain = form.getW7007CriteriaDomain();
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
