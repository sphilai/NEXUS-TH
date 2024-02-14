/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_TYP_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The base action class of Staging Actuality Register Screen
 * <br />山作り実績Register画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12955 $
 */
public abstract class W4008AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Function authoriry service.
     */
    protected UserAuthService userAuthService;

    /**
     * constructor.
     */
    public W4008AbstractAction() {
        super();
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        // Transportation type code list
        List<? extends SelectListItemDomain> trnsTypCdList
            = commonService.searchTransTypePullDownList(true);
        request.setAttribute(ATTR_TRANS_TYP_CD, trnsTypCdList);

        return super.preInvokeExecute(mapping, form, request, response);
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Button activity control
     *     Active control of the button by the transition source screen, functional use authority
     *
     * - ボタン活性制御
     *     遷移元画面、機能利用権限によるボタンの活性制御
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        W4008ActionForm form = (W4008ActionForm)actForm;

        // Button control
        // ボタン制御

        // In the case of transition from the Main screen
        // Main画面からの遷移の場合
        if (!CheckUtil.isBlankOrNull(form.getStgActNo())) {

            // It inactivates the Back To Create / Delete / Register button
            // Back To Create/Delete/Registerボタンを非活性化
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                Arrays.asList("backToCreate", "delete", "register"));

            // If the search result record exists
            // 検索結果レコードが存在する場合
            if (form.getW4008ListDomainList() != null) {

                // If you do not have a RegisterAll
                // RegisterAllを保有していない場合
                if (!userAuthService.hasRegisterAll()) {
                    // If all the records are not updatable
                    // 全レコードが更新可能ではない場合
                    for (W4008ListDomain w4008ListDomain : form.getW4008ListDomainList()) {
                        if (!AUTH_REGISTER_NUMERIC.equals(w4008ListDomain.getAuth())) {
                            // Print Stg. Actuality. / Update ETD Carrier / Cancel buttons are deactivated
                            // Print Stg. Actuality./Update ETD Carrier/Cancelボタンも非活性化
                            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                                Arrays.asList("backToCreate", "delete", "register", "printStgAct", "updateEtdCarrier", "cancel"));
                            break;
                        }
                    }
                }
            }

        // In the case of transition from the Create screen
        // Create画面からの遷移の場合
        } else {
            // Deactivate the Print Stg. Actuality. / Update ETD Carrier / Cancel button
            // Print Stg. Actuality./Update ETD Carrier/Cancelボタンを非活性化
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                Arrays.asList("printStgAct", "updateEtdCarrier", "cancel"));

        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
