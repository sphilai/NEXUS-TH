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

import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The Move to Register action class of Shipping Confirmation create screen
 * <br />出荷確認Create画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5004Init.do
 *     - "error":W5003.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5003MoveToRegisterAction extends W5003AbstractAction {
    
    /**
     * Confirm detail facade service.
     */
    protected ProcessFacadeService<Void, W5003CriteriaDomain> w5003MoveToRegisterFacadeService;

    /**
     * constructor.
     */
    public W5003MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w5003MoveToRegisterFacadeService.
     *
     * @param moveToRegisterFacadeService Set for w5003MoveToRegisterFacadeService
     */
    public void setW5003MoveToRegisterFacadeService(
        ProcessFacadeService<Void, W5003CriteriaDomain> moveToRegisterFacadeService) {
        w5003MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Set to W5003CriteriaDomain criteriaDomain form.stgInstrNo and form.stgActNo
     * - Call MoveToRegisterFacadeService.process an argument criteriaDomain
     *
     * - form.stgInstrNoおよび、form.stgActNoをW5003CriteriaDomain criteriaDomainに設定
     * - criteriaDomainを引数にW5003MoveToRegisterFacadeService.processの呼び出し
     * <pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5003ActionForm w5003Form = (W5003ActionForm)form;
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5003CriteriaDomain criteriaDomain = w5003Form.getW5003CriteriaDomain();
        criteriaDomain.setRowNum(w5003Form.getRowNum());
        
        w5003MoveToRegisterFacadeService.process(criteriaDomain);

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
