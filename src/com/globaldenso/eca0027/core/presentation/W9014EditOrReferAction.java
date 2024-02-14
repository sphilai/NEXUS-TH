/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9014UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The action class for edit or refer by new creation on CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面に修正・参照で遷移するアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9015.jsp
 *     - "error":W9014.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
public class W9014EditOrReferAction extends W9014AbstractAction{

    /** 
     * EditOrRefer Facade Service/EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Integer, W9014UpdateDomain> 
    w9014EditOrReferFacadeService = null;

    /** 
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014EditOrReferAction() {
        super();
    }

    /**
     * <p>Setter method for w9014EditOrReferFacadeService.</p>
     *
     * @param editOrReferFacadeService Set for w9014EditOrReferFacadeService
     */
    public void setW9014EditOrReferFacadeService(
        ProcessFacadeService<Integer, W9014UpdateDomain> editOrReferFacadeService) {
        w9014EditOrReferFacadeService = editOrReferFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Process of changes.
     * - 遷移処理。
     * 
     * - To create a mass update domain.
     * - Set locale information.
     * - Line item selection check.
     * 
     * - 一括更新ドメインを作成する。
     * - 明細行選択チェックをする。
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

        // To create a mass update domain.
        W9014UpdateDomain updateDomain = prepareUpdateDomain(w9014Form);

        // Line item selection check.
        w9014EditOrReferFacadeService.process(updateDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * To create a {@link W9014UpdateDomain}.
     * {@link W9014UpdateDomain}を作成する。
     * 
     * - Set the screen common information.
     * 
     * - 画面共通情報の設定。
     *
     * @param form アクションフォーム
     * @return 作成した{@link W9014UpdateDomain}
     */
    protected W9014UpdateDomain prepareUpdateDomain(W9014ActionForm form) {
        
        W9014UpdateDomain updateDomain = new W9014UpdateDomain();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
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
