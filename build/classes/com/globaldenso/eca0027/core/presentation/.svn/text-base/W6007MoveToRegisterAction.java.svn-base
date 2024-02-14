/* Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;

/**
 * The class of Move to Register action for Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のMove to Registerアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6007MoveToRegisterAction extends W6007AbstractAction {
    /**
     * W6007RemoveFacadeService
     */
    protected UpdateFacadeService<Void, W6007CriteriaDomain> w6007MoveToRegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007MoveToRegisterAction() {
        super();
    }
    
    /**
     * Setter method for w6007MoveToRegisterFacadeService.
     * <br />w6007MoveToRegisterFacadeService のセッターメソッドです。
     *
     * @param moveToRegisterFacadeService w6007MoveToRegisterFacadeService に設定する
     */
    public void setW6007MoveToRegisterFacadeService(
        UpdateFacadeService<Void, W6007CriteriaDomain> moveToRegisterFacadeService) {
        w6007MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Register an Invoice Group Work
     * </pre>
     * <pre>
     * インボイスグループワークを登録する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6007ActionForm w6007Form = (W6007ActionForm)form;
        
        W6007CriteriaDomain criteriaDomain = w6007Form.getW6007CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, w6007Form.getWindowId(), w6007Form.getScreenId());
        
        w6007MoveToRegisterFacadeService.update(criteriaDomain);
        
        return FORWARD_SUCCESS;
    }
}

