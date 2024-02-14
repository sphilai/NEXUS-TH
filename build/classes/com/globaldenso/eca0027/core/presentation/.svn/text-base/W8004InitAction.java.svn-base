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

import com.globaldenso.eca0027.core.business.domain.W8004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8004ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of initial display Progress Control RT material information screen.
 * <br />進度管理 RT材情報画面の初期表示アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8004InitAction extends W8004AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<List<? extends W8004ListDomain>, W8004CriteriaDomain> w8004InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8004InitAction() {
        super();
    }

    /**
     * Setter method for w8004InitFacadeService.
     *
     * @param initFacadeService Set for w8004InitFacadeService
     */
    public void setW8004InitFacadeService(
        SearchFacadeService<List<? extends W8004ListDomain>, W8004CriteriaDomain> initFacadeService) {
        w8004InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W8004AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W8004ActionForm W8004Form = prepareForm((W8004ActionForm)form);

        W8004CriteriaDomain criteriaDomain = prepareCriteriaDomain(W8004Form);
        
        List<? extends W8004ListDomain> listDomainList = w8004InitFacadeService.search(criteriaDomain);

        W8004Form.setW8004ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W8004ActionForm prepareForm(W8004ActionForm form) {
        form.setW8004ListDomainList(null);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     */
    protected W8004CriteriaDomain prepareCriteriaDomain(W8004ActionForm form) {
        W8004CriteriaDomain criteriaDomain = form.getW8004CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
