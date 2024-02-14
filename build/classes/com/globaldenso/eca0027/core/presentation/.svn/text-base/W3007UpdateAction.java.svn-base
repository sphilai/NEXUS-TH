/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3007UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Create Parts Transfer Report screen <br />
 * Create Parts Transfer Report画面のUpdateアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - &quot;success&quot;:W3007.jsp
 *     - &quot;error&quot;:W3007.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3007UpdateAction extends W3007AbstractAction {

    /**
     * CreateFacadeService
     */
    protected CreateFacadeService<Void, W3007UpdateDomain> w3007UpdateFacadeService;

    /**
     * constructor.
     */
    public W3007UpdateAction() {
        super();
    }

    /**
     * <p>Setter method for w3007UpdateFacadeService.</p>
     *
     * @param updateFacadeService Set for w3007UpdateFacadeService
     */
    public void setW3007UpdateFacadeService(
        CreateFacadeService<Void, W3007UpdateDomain> updateFacadeService) {
        w3007UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create Parts Transfer Report : Update
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

        W3007ActionForm form = (W3007ActionForm)actForm;

        W3007UpdateDomain updateDomain = prepareUpdateDomain(form);
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if (0 == updateDomain.getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E7_3007,
                new Object[] {null}));
            throw new ValidationException(messageDomainList);
        }

        // Call of facade service
        // facadeサービスの呼び出し
        w3007UpdateFacadeService.create(updateDomain);

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
     * create updateDomain
     * 
     * @param form W3007ActionForm
     * @return W3007UpdateDomain
     */
    protected W3007UpdateDomain prepareUpdateDomain(W3007ActionForm form) {
        W3007UpdateDomain updateDomain = new W3007UpdateDomain();

        // set common screen information
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        int checkedAmount = 0;
        // set languageCd and DSC-ID
        List<? extends W3007ListDomain> domainList = form.getListDomainList();
        if (domainList != null) {
            for (W3007ListDomain listDomain : domainList) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                //Support UT171
                if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getChk())) {
                    checkedAmount = checkedAmount + 1;
                }
            }
        }
        // set the amount of the checked records
        updateDomain.setCheckedAmount(checkedAmount);

        // set the listDomainList
        updateDomain.setW3007ListDomainList(domainList);

        return updateDomain;
    }
}
