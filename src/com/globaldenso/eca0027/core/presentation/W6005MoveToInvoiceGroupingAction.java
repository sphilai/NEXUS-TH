/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6005CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;

/**
 * The class of Move to Invoice Grouping action for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Shipping Information Input画面のMove to Invoice Grouping アクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6005MoveToInvoiceGroupingAction extends W6005AbstractAction {
    /**
     * W6004SearchFacadeService
     */
    protected UpdateFacadeService<Void, W6005CriteriaDomain> w6005MoveToInvoiceGroupingFacadeService;
    
    
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6005MoveToInvoiceGroupingAction() {
        super();
    }
    
    /**
     * Setter method for w6005MoveToInvoiceGroupingFacadeService.
     *
     * @param moveToInvoiceGroupingFacadeService Set for w6005MoveToInvoiceGroupingFacadeService
     */
    public void setW6005MoveToInvoiceGroupingFacadeService(
        UpdateFacadeService<Void, W6005CriteriaDomain> moveToInvoiceGroupingFacadeService) {
        w6005MoveToInvoiceGroupingFacadeService = moveToInvoiceGroupingFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6005ActionForm w6005Form = (W6005ActionForm) form;
        W6005CriteriaDomain criteriaDomain = w6005Form.getCriteriaDomain();
        
        if (!SCREEN_ID_W6006.equals(criteriaDomain.getOriginalScreenId())) {
            w6005MoveToInvoiceGroupingFacadeService.update(criteriaDomain);
        }
        return FORWARD_SUCCESS;
    }

}
