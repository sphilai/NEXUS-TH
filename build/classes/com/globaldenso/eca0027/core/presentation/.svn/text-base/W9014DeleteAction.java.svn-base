/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W9014UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The delete action class of CIGMA W/H X-Reference MA Inquiry Screen.
 * <br />CIGMA W/H X-Reference MA Inquiry画面の削除アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9014.jsp
 *     - "error":W9014.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class W9014DeleteAction extends W9014AbstractAction{

    /**
     * Delete Facade Service/削除Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9014UpdateDomain> w9014DeleteFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014DeleteAction() {
        super();
    }

    /**
     * <p>Setter method for w9014DeleteFacadeService.</p>
     *
     * @param deleteFacadeService Set for w9014DeleteFacadeService
     */
    public void setW9014DeleteFacadeService(
        DeleteFacadeService<Integer, W9014UpdateDomain> deleteFacadeService) {
        w9014DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Delete.
     * 削除処理。
     * - Set the update domain.
     * - To perform deletions.
     *     - Call the W9014DeleteFacadeService.transact an argument updateDomain
     * - Set the success message.
     * 
     * - 一括更新ドメインの設定する。
     * - 削除処理の実行する。
     *     - updateDomainを引数にW9014DeleteFacadeService.deleteの呼び出し
     * - 成功メッセージを設定する。
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

        W9014ActionForm w9014Form = (W9014ActionForm)form;

        // Set the update domain.
        W9014UpdateDomain deleteDomain = prepareDeleteDomain(w9014Form);

        // To perform deletions.
        int deleteCount = w9014DeleteFacadeService.delete(deleteDomain);

        // Set the success message.
        ActionMessages successMessages = new ActionMessages();
        ActionMessage successMeesage = new ActionMessage(GSCM_I0_0007, deleteCount);
        successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
        saveMessages(request, successMessages);

        return FORWARD_SUCCESS;
    }
    /**
     * Create {@ link W9014DeleteDomain}.
     * {@link W9014DeleteDomain}を作成します。
     * 
     * - Set the screen common information.
     * - Set the update domain.
     * 
     * - 画面共通情報の設定
     * - 更新ドメインの設定
     * 
     * @param form アクションフォーム
     * @return 作成した{@link W9014DeleteDomain}
     */
    protected W9014UpdateDomain prepareDeleteDomain(W9014ActionForm form) {
        
        W9014UpdateDomain updateDomain = new W9014UpdateDomain();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // Set the update domain.
        updateDomain.setW9014CriteriaDomain(form.getW9014CriteriaDomain());
        updateDomain.setW9014ListDomainList(form.getW9014ListDomainList());
        updateDomain.setCk(form.getCk());

        return updateDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
