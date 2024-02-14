/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W9006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9006ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The search action class of NEXUS Ship to MA Inquiry Screen. <br />
 * NEXUS Ship to MA Inquiry画面の検索アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W9006.jsp
 *     - "error":W9006.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 7949 $
 */
public class W9006SearchAction extends W9006AbstractAction{

    /** 
     * Service for search 
     */
    protected SearchFacadeService<ArrayList<W9006ListDomain>, 
        W9006CriteriaDomain> w9006SearchFacadeService = null;

    /**
     * Default constructor.
     */
    public W9006SearchAction() {
        super();
    }

    /**
     * Setter method for w9006SearchFacadeService.
     *
     * @param searchFacadeService Set for w9006SearchFacadeService
     */
    public void setW9006SearchFacadeService(
        SearchFacadeService<ArrayList<W9006ListDomain>, W9006CriteriaDomain> searchFacadeService) {
        w9006SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Search.
     * - Get screen common information domain.
     * - Set of common information screen.
     * - Clean the contents of the search results.
     * - Set search criteria.
     * - Set locale information.
     * - Create paging information.
     * - Call the SearchFacadeService.search an argument form.w9006CriteriaDomain.
     * - Set to form the result of calling SearchFacadeService.search.
     *
     * 検索処理
     * - 画面共通情報ドメインを取得する。
     * - 画面共通情報を設定する。
     * - 検索結果ドメインを空にする。
     * - 検索条件を設定する。
     * - ロケール情報を設定する。
     * - ページング情報を作成する
     * - form.w9006CriteriaDomain.を引数にSearchFacadeService.searchの呼び出す。
     * - SearchFacadeService.searchの呼び出し結果をformに設定する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping, 
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest, 
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W9006ActionForm thisForm = (W9006ActionForm)form;
        
        // Get screen common information domain.
        WindowInfoDomain windowInfo =
            (WindowInfoDomain)DensoContext.get().getGeneralArea(thisForm.getWindowId());
        Map<String, ScreenInfoDomain> screenInfo =
            (Map<String, ScreenInfoDomain>)windowInfo.getScreenInfo();
        ScreenInfoDomain screenInfoDomain = screenInfo.get(SCREEN_ID_W9006);

        if (screenInfoDomain == null) {
            screenInfoDomain = new ScreenInfoDomain();
        }

        // Set of common information screen.
        screenInfo.put(SCREEN_ID_W9006, screenInfoDomain);

        // Clean the contents of the search results.
        thisForm.setW9006ListDomainList(null);
        
        // Set search criteria.
        W9006CriteriaDomain w9006CriteriaDomain = (W9006CriteriaDomain)ActionUtil
            .prepareBusinessDomain(thisForm.getW9006CriteriaDomain(), thisForm.getWindowId(), thisForm
                .getScreenId());

        // Set locale information.
        Locale locale = (Locale)request.getSession(false).getAttribute(
            thisForm.getWindowId() + "_locale");
        w9006CriteriaDomain.setLocale(locale);

        // Create paging information.
        PageInfoCreator creator = new ActionPageInfoCreator(thisForm, mapping, request);
        w9006CriteriaDomain.setPageInfoCreator(creator);

        // Call search service.
        ArrayList<W9006ListDomain> w9006ListDomainList = w9006SearchFacadeService.search(w9006CriteriaDomain);
        thisForm.setW9006ListDomainList(w9006ListDomainList);
        screenInfoDomain.setGeneralArea("w9006ListDomain", w9006ListDomainList);

        // Set screen transition source ID.
        thisForm.setCallScreenId(SCREEN_ID_W9006);

        // Go to NEXUS Ship to MA Inquiry screen.
        return FORWARD_SUCCESS;
    }

}
