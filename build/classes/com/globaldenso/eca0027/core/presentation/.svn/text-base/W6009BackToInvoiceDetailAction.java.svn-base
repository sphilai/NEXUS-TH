/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6009BackToInvoiceDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The Back to Invoice Detail action class of a Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のBack to Invoice Detailアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"W6007": /W6007Init.do
 *     ‐"W6008": /W6008Init.do
 *     ‐"error": W6009
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6009BackToInvoiceDetailAction extends W6009AbstractAction {
    /**
     * W6009BackToInvoiceDetailFacadeService
     */
    protected ProcessFacadeService<Void, W6009CriteriaDomain> w6009BackToInvoiceDetailFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009BackToInvoiceDetailAction() {
        super();
    }

    /**
     * Setter method for w6009BackToInvoiceDetailFacadeService.
     *
     * @param backToInvoiceDetailFacadeService Set for w6009BackToInvoiceDetailFacadeService
     */
    public void setW6009BackToInvoiceDetailFacadeService(ProcessFacadeService<Void, W6009CriteriaDomain> backToInvoiceDetailFacadeService) {
        w6009BackToInvoiceDetailFacadeService = backToInvoiceDetailFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Sets to a search condition domain. 
     *     Sets to {@link W6009CriteriaDomain}. 
     * 
     * ‐Input check.
     *     Call {@link W6009BackToInvoiceDetailFacadeServiceImpl}. 
     * 
     * ‐Move to Invoice Detail screen. 
     *     [Case of a main invoice (Group No. sec = 0).]
     *       Move to「W6007_INVOICE Detail」screen.
     *     
     *     [Case of a FRT Yingying voice (Group No. sec != 0) ]
     *       Move to「W6008_INVOICE Detail（Full Returnable）」screen.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W6009CriteriaDomain}に設定します。
     * 
     * ‐入力チェック
     *     {@link W6009BackToInvoiceDetailFacadeServiceImpl}を呼出します。
     * 
     * ‐Invoice Detail画面に遷移
     *     [メインインボイス(Group No. sec = 0)の場合]
     *       「W6007_INVOICE Detail」画面に遷移する
     *     
     *     [FRTインインボイス(Group No. sec ≠ 0)の場合]
     *       「W6008_INVOICE Detail（Full Returnable）」画面に遷移する
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6009ActionForm w6009Form = (W6009ActionForm)form;
        
        W6009CriteriaDomain criteriaDomain = w6009Form.getW6009CriteriaDomain();
        
        w6009BackToInvoiceDetailFacadeService.process(criteriaDomain);
        
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            return SCREEN_ID_W6007;
        } else {
            return SCREEN_ID_W6008;
        }
    }
}
