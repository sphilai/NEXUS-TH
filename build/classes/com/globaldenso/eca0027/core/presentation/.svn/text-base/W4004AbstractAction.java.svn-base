/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The base action class of Staging Instruction Register Screen
 * <br />荷揃え指示Register画面の基底アクションクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public abstract class W4004AbstractAction extends AbstractAction {

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
    public W4004AbstractAction() {
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

        W4004ActionForm form = (W4004ActionForm)actForm;

        // Button control
        // ボタン制御

        // In the case of transition from the Main screen
        // Main画面からの遷移の場合
        if (!CheckUtil.isBlankOrNull(form.getStgInstrNo())) {

            // It inactivates the Back To Create / Delete / Register button
            // Back To Create/Delete/Registerボタンを非活性化
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                Arrays.asList("backToCreate", "delete", "register"));

            // If the search result record exists
            // 検索結果レコードが存在する場合
            if (form.getW4004ListDomainList() != null) {

                // If you do not have a RegisterAll
                // RegisterAllを保有していない場合
                if (!userAuthService.hasRegisterAll()) {
                    // If all the records are not updatable
                    // 全レコードが更新可能ではない場合
                    for (W4004ListDomain w4004ListDomain : form.getW4004ListDomainList()) {
                        if (!AUTH_REGISTER_NUMERIC.equals(w4004ListDomain.getAuth())) {
                            // Print Instr. / Register Working / Cancel buttons are deactivated
                            // Print Instr./Register Working/Cancelボタンも非活性化
                            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                                Arrays.asList("backToCreate", "delete", "register", "printInstr", "registerWorking", "cancel"));
                            break;
                        }
                    }
                }
            }

        // In the case of transition from the Create screen
        // Create画面からの遷移の場合
        } else {
            // Deactivate the Print Instr. / Register Working / Cancel button
            // Print Instr./Register Working/Cancelボタンを非活性化
            request.setAttribute(ATTR_DISABLE_ELEMENT_LIST,
                Arrays.asList("printInstr", "registerWorking", "cancel"));

        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
