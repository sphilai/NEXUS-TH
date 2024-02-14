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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
// 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
// 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Move to Register action for Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のMove to Registerアクションクラスです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10038 $
 */
public class W6008MoveToRegisterAction extends W6008AbstractAction {
    /**
     * W6008MoveToRegisterFacadeService
     */
    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//    protected ProcessFacadeService<Void, W6008CriteriaDomain> w6008MoveToRegisterFacadeService;
    protected UpdateFacadeService<Void, W6008CriteriaDomain> w6008MoveToRegisterFacadeService;
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w6008MoveToRegisterFacadeService.
     * <br />w6008MoveToRegisterFacadeService のセッターメソッドです。
     *
     * @param moveToRegisterFacadeService w6008MoveToRegisterFacadeService に設定する
     */
    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//    public void setW6008MoveToRegisterFacadeService(
//        ProcessFacadeService<Void, W6008CriteriaDomain> moveToRegisterFacadeService) {
//        w6008MoveToRegisterFacadeService = moveToRegisterFacadeService;
//    }
    public void setW6008MoveToRegisterFacadeService(
        UpdateFacadeService<Void, W6008CriteriaDomain> moveToRegisterFacadeService) {
        w6008MoveToRegisterFacadeService = moveToRegisterFacadeService;
    }
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<

    
    /**
     * {@inheritDoc}
     * <pre>
     * Check Search for Invoice Group Work
     * </pre>
     * <pre>
     * インボイスグループワークを検索しチェック
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
        
        W6008ActionForm w6008Form = (W6008ActionForm)form;
        
        W6008CriteriaDomain criteriaDomain = w6008Form.getW6008CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, w6008Form.getWindowId(), w6008Form.getScreenId());
        
        // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//        w6008MoveToRegisterFacadeService.process(criteriaDomain);
        w6008MoveToRegisterFacadeService.update(criteriaDomain);
        // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
        
        return FORWARD_SUCCESS;
    }
}
