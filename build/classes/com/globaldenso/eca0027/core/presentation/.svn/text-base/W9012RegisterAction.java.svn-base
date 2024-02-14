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

import com.globaldenso.eca0027.core.business.domain.W9012UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The create/update action class of CIGMA Customer No. X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面の登録・更新アクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9012.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public class W9012RegisterAction extends W9012AbstractAction {

    /** 
     * Service for transact/複合Facadeサービス
     */
    protected TransactFacadeService<Integer, W9012UpdateDomain> w9012RegisterFacadeService;

    
    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9012RegisterAction() {
        super();
    }

    /**
     * <p>Setter method for w9012RegisterFacadeService.</p>
     *
     * @param transactFacadeService Set for w9012RegisterFacadeService
     */
    public void setW9012RegisterFacadeService(
        TransactFacadeService<Integer, W9012UpdateDomain> transactFacadeService) {
        w9012RegisterFacadeService = transactFacadeService;
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
     *     - Call the w9012RegisterFacadeService.transact an argument updateDomain.
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
     *     - updateDomainを引数にw9012RegisterFacadeService.transactの呼び出す。
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

        W9012ActionForm w9012Form = (W9012ActionForm) form;

        // Button activity control.
        controlDisplay(request, w9012Form);

        // PL domain creation
        W9012UpdateDomain updateDomain = new W9012UpdateDomain();
        updateDomain.setCriteriaDomain(w9012Form.getW9012CriteriaDomain());
        
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(updateDomain, w9012Form.getWindowId(), w9012Form.getScreenId());

        // Set the DSC-ID and language code.
        updateDomain.getCriteriaDomain().setLanguageCd(w9012Form.getLanguageCd());
        updateDomain.getCriteriaDomain().setLoginUserDscId(updateDomain.getLoginUserDscId());

        // Update / registration process.
        int updateCoutn = w9012RegisterFacadeService.transact(updateDomain);

        ActionMessages successMessages = new ActionMessages();

        if (MODE_NEW.equals(w9012Form.getW9012CriteriaDomain().getProcMode())) {

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
