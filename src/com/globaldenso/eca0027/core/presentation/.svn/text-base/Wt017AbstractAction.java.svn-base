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

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The base action class of Shipping Actuality Warning List Sub Screen. <br />
 * <br />船積実績ワーニングリスト子画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class Wt017AbstractAction extends AbstractAction {

    /**
     * User function use authorization service/ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor.
     */
    public Wt017AbstractAction() {
        super();
    }
    
    /**
     * <p>Setter method for userAuthService.</p>
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Get screen common items.
     *     A screen common item (date format) is set as action form. 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(日付フォーマット)を設定する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #preInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                        org.apache.struts.action.ActionForm, 
     *                        javax.servlet.http.HttpServletRequest,
     *                        javax.servlet.http.HttpServletResponse)
     */

    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        Wt017ActionForm thisForm = (Wt017ActionForm)form;

        // Get screen common items.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(thisForm.getWindowId());
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo.getCommonInfo();
        thisForm.getWt017CriteriaDomain().setScreenDateFormat(eca0027CommonInfoDomain.getScreenDateFormat());

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;
    }

}