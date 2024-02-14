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

import com.globaldenso.eca0027.core.business.domain.W9015UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The create/update action class of CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面の登録・更新アクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9015.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class W9015RegisterAction extends W9015AbstractAction {

    /** 
     * Service for transact/複合Facadeサービス
     */
    protected TransactFacadeService<Integer, W9015UpdateDomain> w9015RegisterFacadeService;

    
    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015RegisterAction() {
        super();
    }

    /**
     * <p>Setter method for w9015RegisterFacadeService.</p>
     *
     * @param transactFacadeService Set for w9015RegisterFacadeService
     */
    public void setW9015RegisterFacadeService(
        TransactFacadeService<Integer, W9015UpdateDomain> transactFacadeService) {
        w9015RegisterFacadeService = transactFacadeService;
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping,
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest, 
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W9015ActionForm w9015Form = (W9015ActionForm) form;

        // Button activity control.
        controlDisplay(request, w9015Form);

        // PL domain creation
        // PLドメイン作成
        W9015UpdateDomain updateDomain = new W9015UpdateDomain();
        updateDomain.setCriteriaDomain(w9015Form.getW9015CriteriaDomain());
        
        // Set of common information screen
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, w9015Form.getWindowId(), w9015Form.getScreenId());
        // Set the DSC-ID and language code.
        updateDomain.getCriteriaDomain().setLanguageCd(w9015Form.getLanguageCd());
        updateDomain.getCriteriaDomain().setLoginUserDscId(updateDomain.getLoginUserDscId());

        // Update / registration process.
        int updateCoutn = w9015RegisterFacadeService.transact(updateDomain);

        ActionMessages successMessages = new ActionMessages();

        if (MODE_NEW.equals(w9015Form.getW9015CriteriaDomain().getProcMode())) {

            // Set the success message.
            ActionMessage successMeesage = new ActionMessage(GSCM_I0_0008, updateCoutn);
            successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
            saveMessages(request, successMessages);

        } else {

            // Set the success message.
            ActionMessage successMeesage = new ActionMessage(GSCM_I0_0006, updateCoutn);
            successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
            saveMessages(request, successMessages);
        }

        // Transition to transition source screen.
        return FORWARD_SUCCESS;
    }

}
