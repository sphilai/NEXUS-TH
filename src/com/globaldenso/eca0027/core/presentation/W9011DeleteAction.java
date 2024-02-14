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

import com.globaldenso.eca0027.core.business.domain.W9011UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The delete action class of CIGMA Customer No. X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面の削除アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9011.jsp
 *     - "error":W9011.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public class W9011DeleteAction extends W9011AbstractAction{

    /**
     * Delete Facade Service/削除Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9011UpdateDomain> w9011DeleteFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011DeleteAction() {
        super();
    }

    /**
     * Setter method for w9011DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9011DeleteFacadeService
     */
    public void setW9011DeleteFacadeService(
        DeleteFacadeService<Integer, W9011UpdateDomain> deleteFacadeService) {
        w9011DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Process of Delete.
     * 削除処理。
     * - Set the update domain.
     * - To perform deletions.
     *     - - Call the W9011DeleteFacadeService.transact an argument deleteDomain
     * - Set the success message.
     * 
     * - 更新ドメインの設定する。
     * - 削除処理の実行する。
     *     - deleteDomainを引数にW9011DeleteFacadeService.deleteの呼び出し
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

        W9011ActionForm w9011Form = (W9011ActionForm)form;

        // Set the update domain.
        W9011UpdateDomain deleteDomain = prepareDeleteDomain(w9011Form);

        // To perform deletions.
        int deleteCount = w9011DeleteFacadeService.delete(deleteDomain);

        // Set the success message.
        ActionMessages successMessages = new ActionMessages();
        ActionMessage successMeesage = new ActionMessage(GSCM_I0_0007, deleteCount);
        successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
        saveMessages(request, successMessages);

        return FORWARD_SUCCESS;
    }
    
    /**
     * Create {@ link W9011DeleteDomain}.
     * {@link W9011DeleteDomain}を作成します。
     * 
     * - Set the screen common information.
     * - Set the update domain.
     * 
     * - 画面共通情報の設定
     * - 更新ドメインの設定
     * 
     * @param form アクションフォーム
     * @return 作成した{@link W9011DeleteDomain}
     */
    protected W9011UpdateDomain prepareDeleteDomain(W9011ActionForm form) {

        W9011UpdateDomain updateDomain = new W9011UpdateDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // Set the update domain.

        updateDomain.setCriteriaDomain(form.getW9011CriteriaDomain());
        updateDomain.setListDomainList(form.getW9011ListDomainList());
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
