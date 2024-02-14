/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of init action Order Upload screen.
 * <br />受注アップロード画面のInitアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /WB008
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13730 $
 */
public class WB020InitAction extends WB020AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示 Facadeサービス
     */
    protected SearchFacadeService<List<? extends WB020OdrUploadReqDomain>, WB020OdrUploadReqDomain> wb020InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020InitAction() {
        super();
    }

    /**
     * Setter method for wb020InitFacadeService.
     *
     * @param wb020InitFacadeService Set for wb020InitFacadeService
     */
    public void setWb020InitFacadeService(
        SearchFacadeService<List<? extends WB020OdrUploadReqDomain>, WB020OdrUploadReqDomain> wb020InitFacadeService) {
        this.wb020InitFacadeService = wb020InitFacadeService;
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
     *     Set to {@link WB020OdrUploadReqDomain} the following information.
     *         ‐Common screen information
     *         ‐Setting of takeover VALUE from Register screen
     * 
     * ‐ Retrieval data
     *     Call the {@link WB008InitFacadeServiceImpl}.
     * 
     * ‐ Set of search results
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     以下の情報を{@link WB020OdrUploadReqDomain}に設定します。
     *         ‐ 画面共通情報
     *         ‐ Register画面からの引継値の設定
     * 
     * ‐検索データの取得
     *     {@link WB020InitFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actform, HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        WB020ActionForm form = (WB020ActionForm)actform;

        WB020OdrUploadReqDomain wb020CriteriaDomain = form.getWb020CriteriaDomain();
        ActionUtil.prepareBusinessDomain(wb020CriteriaDomain, form.getWindowId(), form.getScreenId());

        List<? extends WB020OdrUploadReqDomain> wb020ListDomainList
            = wb020InitFacadeService.search(wb020CriteriaDomain);

        form.setWb020ListDomainList(wb020ListDomainList);

        return FORWARD_SUCCESS;
    }

}
