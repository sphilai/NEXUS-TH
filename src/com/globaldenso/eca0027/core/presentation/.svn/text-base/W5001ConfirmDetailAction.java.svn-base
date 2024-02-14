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

import com.globaldenso.eca0027.core.business.domain.W5001CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The Confirm Detail action class of Shipping Confirmation Main screen
 * <br />出荷確認Main画面のConfirm Detailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5004Init.do
 *     - "error":W5001.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001ConfirmDetailAction extends W5001AbstractAction {
    
    /**
     * Confirm detail facade service.
     */
    protected ProcessFacadeService<Void, W5001CriteriaDomain> w5001ConfirmDetailFacadeService;
    
    /**
     * constructor.
     */
    public W5001ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w5001ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w5001ConfirmDetailFacadeService
     */
    public void setW5001ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W5001CriteriaDomain> confirmDetailFacadeService) {
        w5001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set the form.shippingFirmNo to W5001CriteriaDomain criteriaDomain 
     * - Call W5001ConfirmDetailFacadeService.process an argument criteriaDomain
     *
     * - form.shippingFirmNoをW5001CriteriaDomain criteriaDomainにを設定
     * - criteriaDomainを引数にW5001ConfirmDetailFacadeService.processの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5001ActionForm w5001Form = (W5001ActionForm)form;
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5001CriteriaDomain criteriaDomain = w5001Form.getW5001CriteriaDomain();
        criteriaDomain.setRowNum(w5001Form.getRowNum());
        
        w5001ConfirmDetailFacadeService.process(criteriaDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
