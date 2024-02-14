/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;

/**
 * The class action Refresh of Export Shipping Item Special Information MA Edit screen.
 * <br />Export Shipping Item Special Information MA Edit画面のRefreshアクションクラスです。
 * 
 * UT305 ADD NEW
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12245 $
 */
public class W9017RefreshAction extends W9017AbstractAction {

    /**
     * Search Facade Service
     * <br />Search Facadeサービス
     */
    protected SearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> w9017RefreshFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9017RefreshAction() {
        super();
    }

    /**
     * Setter method for w9017RefreshFacadeService.
     *
     * @param refreshFacadeService Set for w9017RefreshFacadeService
     */
    public void setW9017RefreshFacadeService(
        SearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> refreshFacadeService) {
        w9017RefreshFacadeService = refreshFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9017ActionForm form = (W9017ActionForm) actForm;
        W9017CriteriaDomain w9017CriteriaDomain = form.getW9017CriteriaDomain();
        prepareBusinessDomain(w9017CriteriaDomain, form.getWindowId(), form.getScreenId());
        W9017CriteriaDomain w9017CriteriaResultDomain = w9017RefreshFacadeService.search(w9017CriteriaDomain);
        // If get, reflect to the item description.
        // 取得できた場合、品目名称へ反映する。
        if (w9017CriteriaResultDomain != null) {
            w9017CriteriaDomain.setItemDescription(w9017CriteriaResultDomain.getItemDescription());
        }

        return FORWARD_SUCCESS;
    }
}
