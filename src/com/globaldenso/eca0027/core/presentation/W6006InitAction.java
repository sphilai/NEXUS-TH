/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of action Init for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Invoice Grouping画面のInitアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"sucess": W6006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
public class W6006InitAction extends W6006AbstractAction {
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6006InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting the initial value
     * </pre>
     * <pre>
     * ‐初期値の設定
     * </pre>
     * @see com.globaldenso.eca0027.core.presentation.W6006AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        W6006ActionForm w6006Form = (W6006ActionForm) form;
        W6006CriteriaDomain criteriaDomain = w6006Form.getW6006CriteriaDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w6006Form.getWindowId());
        // Get form data from W6003.
        // W6003から
        ScreenInfoDomain w6003ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6003);
        W6003ActionForm w6003Form = (W6003ActionForm) w6003ScreenInfo.getActionForm();
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w6003Form.getW6003CriteriaDomain());
        // Get form data from W6004.
        // W6004から
        ScreenInfoDomain w6004ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6004);
        W6004ActionForm w6004Form = (W6004ActionForm) w6004ScreenInfo.getActionForm();
        criteriaDomain.setContainerSortingKey(w6004Form.getContainerSortingKey());
        // Get form data from W6005.
        // W6005から
        ScreenInfoDomain w6005ScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6005);
        W6005ActionForm w6005Form = (W6005ActionForm) w6005ScreenInfo.getActionForm();
        criteriaDomain.setEtd(w6005Form.getCriteriaDomain().getEtd());
        
        super.preInvokeExecute(mapping, form, request, response);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        ActionMessages erros = getErrors(request);
        if (erros.size() == 0) {
            ((W6006ActionForm) form).setListDomainList(null);
        }
        return FORWARD_SUCCESS;
    }
}
