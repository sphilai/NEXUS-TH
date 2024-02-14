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

import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Move to Create TR for Parts action class of Carry out Header
 * <pre>
 *  forward name-path mappings:
 *     - "success":W3003.jsp
 *     - "error":W3002.jsp
 * </pre>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3002MoveToCreateTrForPartsAction extends W3002AbstractAction {

    /**
     * <p>Transact facade service</p>
     */
    protected TransactFacadeService<Void, W3002CriteriaDomain> w3002MoveToCreateTrForPartsFacadeService;

    /**
     * <p>Constructor</p>
     *
     */
    public W3002MoveToCreateTrForPartsAction() {
        super();
    }

    /**
     * <p>Setter method for w3002MoveToCreateTrForPartsFacadeService.</p>
     *
     * @param moveToCreateTrForPartsFacadeService Set for w3002MoveToCreateTrForPartsFacadeService
     */
    public void setW3002MoveToCreateTrForPartsFacadeService(
        TransactFacadeService<Void, W3002CriteriaDomain> moveToCreateTrForPartsFacadeService) {
        w3002MoveToCreateTrForPartsFacadeService = moveToCreateTrForPartsFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Set of search criteria domain
     * - Call the SearchFacadeService.search an argument form.criteriaDomain
     * - Set to form the result of calling TransactFacadeService.transact
     * - Control display show result
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W3002ActionForm w3002Form = (W3002ActionForm)form;

        // 条件ドメインの取得
        // Create criteriaDomain
        W3002CriteriaDomain criteriaDomain = w3002Form.getCriteriaDomain();
        
        // 条件ドメインの設定
        // Set criteriaDomain
        ActionUtil.prepareBusinessDomain(criteriaDomain, w3002Form.getWindowId(), w3002Form.getScreenId());

        // 入力チェックの実行
        // input check
        w3002MoveToCreateTrForPartsFacadeService.transact(criteriaDomain);
        
        return FORWARD_SUCCESS;
    }
}
