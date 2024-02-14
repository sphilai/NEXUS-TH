/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3005UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Create CML Transfer Report screen <br />
 * Print Carry Out List by CML画面のUpdateアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3005.jsp
 *     - &quot;error&quot;:W3005.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005UpdateAction extends W3005AbstractAction {

    /**
     * UpdateFacadeService
     */
    protected TransactFacadeService<Void, W3005UpdateDomain> w3005UpdateFacadeService;

    /**
     * constructor.
     */
    public W3005UpdateAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3005UpdateFacadeService.
     * </p>
     * 
     * @param updateFacadeService Set for w3005UpdateFacadeService
     */
    public void setW3005UpdateFacadeService(
        TransactFacadeService<Void, W3005UpdateDomain> updateFacadeService) {
        w3005UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Print Carry Out List by CML : Update
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

        W3005ActionForm form = (W3005ActionForm)actForm;

        W3005UpdateDomain updateDomain = prepareUpdateDomain(form);

        // Call of facade service
        // facadeサービスの呼び出し
        w3005UpdateFacadeService.transact(updateDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
            GSCM_I0_0008, updateDomain.getCheckedAmount()));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * <br />
     * Create update Domain
     * 
     * @param form W3005ActionForm
     * @return UpdateDomain W3005UpdateDomain
     */
    protected W3005UpdateDomain prepareUpdateDomain(W3005ActionForm form) {
        W3005UpdateDomain updateDomain = new W3005UpdateDomain();

        // Set common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        int checkedAmount = 0;
        // set languageCd and DSC-ID
        List<? extends W3005ListDomain> domainList = form.getListDomainList();
        if (domainList != null) {
            for (W3005ListDomain listDomain : domainList) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                //select only Selected = "on" & CHK = "Y" support UT171
                if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getChk())) {
                    checkedAmount = checkedAmount + 1;
                }
            }
        }
        // set the amount of the checked records
        updateDomain.setCheckedAmount(checkedAmount);

        // set the domainList
        updateDomain.setW3005ListDomainList(domainList);

        return updateDomain;
    }
}
