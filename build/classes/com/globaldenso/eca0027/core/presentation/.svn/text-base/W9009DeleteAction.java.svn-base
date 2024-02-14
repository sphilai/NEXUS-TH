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

import com.globaldenso.eca0027.core.business.domain.W9009UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The delete action class of CIGMA Ship to X-Reference MA Inquiry Screen.
 * <br />
 * CIGMA Ship to X-Reference MA Inquiry画面の削除アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W9009.jsp
 *     - "error":W9009.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 7951 $
 */
public class W9009DeleteAction extends W9009AbstractAction {

    /**
     * Delete Facade Service/削除Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9009UpdateDomain> w9009DeleteFacadeService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009DeleteAction() {
        super();
    }

    /**
     * Setter method for w9009DeleteFacadeService.
     * 
     * @param deleteFacadeService Set for w9009DeleteFacadeService
     */
    public void setW9009DeleteFacadeService(
        DeleteFacadeService<Integer, W9009UpdateDomain> deleteFacadeService) {
        w9009DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * Process of Delete.
     * 削除処理。
     * - Set the mass update domain.
     * - To perform deletions.
     * - Set the success message.
     * 
     * - 一括更新ドメインの設定する。
     * - 削除処理の実行する。
     * - 成功メッセージを設定する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9009ActionForm w9009Form = (W9009ActionForm)form;

        // Set the mass update domain.
        W9009UpdateDomain deleteDomain = prepareDeleteDomain(w9009Form);

        // To perform deletions.
        int deleteCount = w9009DeleteFacadeService.delete(deleteDomain);

        // Set the success message.
        ActionMessages successMessages = new ActionMessages();
        ActionMessage successMeesage = new ActionMessage(GSCM_I0_0007,
            deleteCount);
        successMessages.add(ActionMessages.GLOBAL_MESSAGE, successMeesage);
        saveMessages(request, successMessages);

        return FORWARD_SUCCESS;
    }

    /**
     * Create {@ link W9009DeleteDomain}. {@link W9009DeleteDomain}を作成します。 -
     * Set the screen common information. - Set the mass update domain. -
     * 画面共通情報の設定 - 一括更新ドメインの設定
     * 
     * @param form アクションフォーム
     * @return 作成した{@link W9009DeleteDomain}
     */
    protected W9009UpdateDomain prepareDeleteDomain(W9009ActionForm form) {

        W9009UpdateDomain updateDomain = new W9009UpdateDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());

        // Set the mass update domain.
        updateDomain.setCriteriaDomain(form.getW9009CriteriaDomain());
        updateDomain.setListDomainList(form.getW9009ListDomainList());
        updateDomain.setCk(form.getCk());

        return updateDomain;
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
}
