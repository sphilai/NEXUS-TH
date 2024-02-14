/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W9010UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The create/update action class of CIGMA Ship to X-Reference MA Edit Screen.
 * <br />CIGMA Ship to X-Reference MA Edit画面の登録・更新アクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9010.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6487 $
 */
public class W9010RegisterAction extends W9010AbstractAction {

    /** 
     * Service for transact/複合Facadeサービス
     */
    protected TransactFacadeService<Integer, W9010UpdateDomain> w9010RegisterFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9010RegisterAction() {
        super();
    }

    /**
     * Setter method for w9010RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9010RegisterFacadeService
     */
    public void setW9010RegisterFacadeService(
        TransactFacadeService<Integer, W9010UpdateDomain> registerFacadeService) {
        w9010RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Update / registration process.
     * - Set screen common information domain.
     * - Set the DSC-ID and language code.
     * - Set locale information.
     * - If the correction mode, set the following items
     *     ComUpdateTimestamp, ComUpdateFuncId, ComUpdateUserId, 
     *     ComUpdateUserId, ComCreateFuncId, ComCreateUserId
     * - Update / registration process.
     *     - Call the TransactFacadeService.transact an argument updateDomain.
     * - In the case of the new mode.
     *     - Set the success message.
     * - In the case of updating mode.
     *     - Set the success message.
     * - Transition to transition source screen.
     * 
     * 更新/登録処理。
     * - 画面共通情報を設定する。
     * - 言語コード・DSC-IDを設定する。
     * - ロケール情報を設定する。
     * - 修正モードの場合、以下の項目を設定する。
     *     最終更新日、更新機能ID、更新者ID、登録機能ID、作成者ID
     * - 更新/登録処理。
     *     - updateDomainを引数にTransactFacadeService.transactの呼び出す。
     * - 新規モードの場合
     *     - 成功メッセージを設定する。
     * - 更新モードの場合
     *     - 成功メッセージを設定する。
     * - 遷移元画面へ遷移
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(
     *      org.apache.struts.action.ActionMapping, 
     *      org.apache.struts.action.ActionForm, 
     *      javax.servlet.http.HttpServletRequest, 
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W9010ActionForm w9010Form = (W9010ActionForm) form;

        // Button activity control.
        controlDisplay(request, w9010Form);

        // PL domain creation
        W9010UpdateDomain updateDomain = new W9010UpdateDomain();
        updateDomain.setCriteriaDomain(w9010Form.getW9010CriteriaDomain());

        // Set screen common information domain.
        ActionUtil.prepareBusinessDomain(updateDomain, 
            w9010Form.getWindowId(), w9010Form.getScreenId());

        // Set the DSC-ID and language code.
        updateDomain.getCriteriaDomain().setLanguageCd(w9010Form.getLanguageCd());
        updateDomain.getCriteriaDomain().setLoginUserDscId(updateDomain.getLoginUserDscId());

        // Update / registration process.
        int updateCount = w9010RegisterFacadeService.transact(updateDomain);

        ActionMessages successMessages = new ActionMessages();

        if (MODE_NEW.equals(w9010Form.getW9010CriteriaDomain().getProcMode())) {

            // Set the success message.
            ActionMessage successMeesage = new ActionMessage(GSCM_I0_0008, updateCount);
            successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
            saveMessages(request, successMessages);

        } else {

            // Set the success message.
            ActionMessage successMeesage = new ActionMessage(GSCM_I0_0006, updateCount);
            successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
            saveMessages(request, successMessages);
        }

        // Transition to transition source screen.
        return FORWARD_SUCCESS;
    }
}
