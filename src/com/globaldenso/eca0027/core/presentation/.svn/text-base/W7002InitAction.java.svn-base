/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of initial display action for  Shipping Actuality Header screen.
 * <br />船積実績Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W7002
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7002InitAction extends W7002AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected DeleteFacadeService<Void, W7002CriteriaDomain> w7002InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7002InitAction() {
        super();
    }

    /**
     * Setter method for w7002InitFacadeService.
     *
     * @param initFacadeService Set for w7002InitFacadeService
     */
    public void setW7002InitFacadeService(
        DeleteFacadeService<Void, W7002CriteriaDomain> initFacadeService) {
        w7002InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Delete processing of Shipping Actuality Invoice Work
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除処理
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7002ActionForm w7002Form = (W7002ActionForm) form;
        // Remove the Shipping Actuality Invoice Work. 
        // 船積実績対象インボイスワークの削除
        removeShippingActInvoice(w7002Form);
        // Setting the initial values.
        // 画面表示項目の設定
        controlDisplay(w7002Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Remove the Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークを削除します。
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @throws ApplicationException If do not be able to delete the Shipping Actuality Invoice Work<br />
     * 船積実績対象インボイスワークを削除できなかった場合
     */
    protected void removeShippingActInvoice(W7002ActionForm form) throws ApplicationException {
        W7002CriteriaDomain criteriaDomain = form.getW7002CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        w7002InitFacadeService.delete(criteriaDomain);
    }

    /**
     * Setting the initial VALUE
     * <br />初期値の設定
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W7002ActionForm form, HttpServletRequest request) {
        W7002CriteriaDomain criteriaDomain = form.getW7002CriteriaDomain();
        
        if (SCREEN_ID_W7001.equals(form.getCallScreenId())) {
            criteriaDomain.setAutoInvoiceRegisterFlg(FLAG_Y);
        }
    }
}
