/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_TYP_CD;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Create action class of Staging Actuality Header screen
 * <br />山作り実績Header画面のMove to Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W4007Init.do
 *     - "error":W4006.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4006MoveToCreateAction extends W4006AbstractAction {

    /**
     * Move to create facade service.
     */
    protected SearchFacadeService<Void, W4006CriteriaDomain> w4006MoveToCreateFacadeService;

    /**
     * constructor.
     */
    public W4006MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w4006MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w4006MoveToCreateFacadeService
     */
    public void setW4006MoveToCreateFacadeService(
        SearchFacadeService<Void, W4006CriteriaDomain> moveToCreateFacadeService) {
        w4006MoveToCreateFacadeService = moveToCreateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call W4006MoveToCreateFacadeService.search an argument form.w4006CriteriaDomain
     *
     * - form.w4006CriteriaDomainを引数にW4006MoveToCreateFacadeService.searchの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4006ActionForm form = (W4006ActionForm)actForm;

        // PL domain registration
        // PLドメイン取得
        W4006CriteriaDomain w4006CriteriaDomain = form.getW4006CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w4006CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Completion trans type name
        // 輸送種別名補完
        @SuppressWarnings("unchecked")
        List<? extends SelectListItemDomain> trnsTypCdList =
            (List<? extends SelectListItemDomain>)request.getAttribute(ATTR_TRANS_TYP_CD);
        for (SelectListItemDomain selectListItemDomain : trnsTypCdList) {
            if (w4006CriteriaDomain.getTrnsTypCd().equals(selectListItemDomain.getId())) {
                w4006CriteriaDomain.setTrnsTypNm(selectListItemDomain.getName());
                break;
            }
        }

        // call of service facade
        // facadeサービスの呼び出し
        w4006MoveToCreateFacadeService.search(w4006CriteriaDomain);

        return FORWARD_SUCCESS;
    }
}
