/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Register action class of Register Parts Transfer Report screen <br />
 * Register Parts Transfer Report画面のRegisterアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3008.jsp
 *     - &quot;error&quot;:W3008.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008RegisterAction extends W3008AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<String, W3008UpdateDomain> w3008RegisterFacadeService;

    /**
     * constructor.
     */
    public W3008RegisterAction() {
        super();
    }

    /**
     * <p>Setter method for w3008RegisterFacadeService.</p>
     *
     * @param registerFacadeService Set for w3008RegisterFacadeService
     */
    public void setW3008RegisterFacadeService(
        TransactFacadeService<String, W3008UpdateDomain> registerFacadeService) {
        w3008RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Register Parts Transfer Report : Register
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        W3008ActionForm form = (W3008ActionForm)actForm;

        W3008UpdateDomain updateDomain = prepareUpdateDomain(form);

        // Call of facade service
        // facadeサービスの呼び出し

        String trNo = w3008RegisterFacadeService.transact(updateDomain);
        form.setRegisterFlg(true);
        form.setTrNo(trNo);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0008, updateDomain.getW3008ListDomainList().size()));
        saveMessages(request, messages);
        return FORWARD_SUCCESS;
    }

    /**
     * <br />
     * create updateDomain
     * 
     * @param form W3008ActionForm
     * @return W3008UpdateDomain
     */
    protected W3008UpdateDomain prepareUpdateDomain(W3008ActionForm form) {
        W3008UpdateDomain updateDomain = new W3008UpdateDomain();

        // set the common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        W3008CriteriaDomain w3008CriteriaDomain = ((W3008ActionForm)form)
            .getCriteriaDomain();

        ActionUtil.prepareBusinessDomain(w3008CriteriaDomain, form
            .getWindowId(), form.getScreenId());

        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(form.getWindowId());
        String userName = windowInfo.getCommonInfo().getUserName();

        if (form.getListDomainList() != null) {
            // set languageCd and DSC-ID
            for (W3008ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                listDomain.setUserName(userName);
            }
        }

        // copy Header information
        CommonUtil.copyPropertiesDomainToDomain(updateDomain,
            w3008CriteriaDomain);

        // set listDomainList
        updateDomain.setW3008ListDomainList(form.getListDomainList());

        return updateDomain;
    }
}
