/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of Print Carry Out List by Parts screen
 * <br />Print Carry Out List by Parts画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W3004.jsp
 *     - "error":W3004.jsp
 * </pre>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004UpdateAction extends W3004AbstractAction {

    /**
     * TransactFacadeService
     */
    protected TransactFacadeService<Integer, W3004UpdateDomain> w3004UpdateFacadeService;

    /**
     * constructor.
     */
    public W3004UpdateAction() {
        super();
    }

    /**
     * <p>Setter method for w3004UpdateFacadeService.</p>
     *
     * @param updateFacadeService Set for w3004UpdateFacadeService
     */
    public void setW3004UpdateFacadeService(
        TransactFacadeService<Integer, W3004UpdateDomain> updateFacadeService) {
        w3004UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Print Carry Out List by CML Update function
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W3004ActionForm form = (W3004ActionForm)actForm;

        W3004UpdateDomain updateDomain = prepareUpdateDomain(form);

        // Call of facade service
        // facadeサービスの呼び出し
        int updateCount  = w3004UpdateFacadeService.transact(updateDomain);

        // Registration completion message settings
        // 登録完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, updateCount));
        saveMessages(request, messages);

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * <br />Updateドメインを作成します。
     * <br />Create UpdateDomain
     *
     * @param form アクションフォーム W3004ActionForm
     * @return Updateドメイン W3004UpdateDomain
     */
    protected W3004UpdateDomain prepareUpdateDomain(W3004ActionForm form) {
        W3004UpdateDomain updateDomain = new W3004UpdateDomain();
        
        // Set Screen Common Information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        int checkedAmount = 0;
        List<? extends W3004ListDomain> domainList = form.getListDomainList();
        if (domainList != null) {
            // Set Language CD, DSC-ID (Need to register and update)
            // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
            for (W3004ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
                if (CHECK_ON.equals(listDomain.getSelected())) {
                    checkedAmount = checkedAmount + 1;
                }
            }
        }
        // set the amount of checked records
        updateDomain.setCheckedAmount(checkedAmount);
        // set ListDomain
        updateDomain.setW3004ListDomainList(domainList);
        
        return updateDomain;
    }
}
