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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of search action for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Invoice Grouping画面のSearchアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6006SearchAction extends W6006AbstractAction {
    
    /**
     * W6006SearchFacadeService
     */
    protected SearchFacadeService<List<? extends W6006ListDomain>, W6006CriteriaDomain> w6006SearchFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6006SearchAction() {
        super();
    }
    
    /**
     * Setter method for w6006SearchFacadeService.
     *
     * @param searchFacadeService Set for w6006SearchFacadeService
     */
    public void setW6006SearchFacadeService(SearchFacadeService<List<? extends W6006ListDomain>, W6006CriteriaDomain> searchFacadeService) {
        w6006SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {

        W6006ActionForm w6006Form = (W6006ActionForm) form;

        W6006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w6006Form);        
        List<? extends W6006ListDomain> listDomainList = w6006SearchFacadeService.search(criteriaDomain);
        w6006Form.setListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    /**
     * Set the domain cord conditions.
     * <br />検索条件ドメインを設定します。
     * 
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     */
    protected W6006CriteriaDomain prepareCriteriaDomain(W6006ActionForm form) {
        W6006CriteriaDomain criteriaDomain = form.getW6006CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
