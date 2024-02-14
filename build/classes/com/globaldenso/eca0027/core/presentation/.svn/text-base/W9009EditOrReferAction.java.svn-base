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

import com.globaldenso.eca0027.core.business.domain.W9009UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The action class for edit or refer by new creation 
 * on CIGMA Ship to X-Reference MA Edit Screen.
 * <br />CIGMA Ship to X-Reference MA Edit画面に修正・参照で遷移するアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9010.jsp
 *     - "error":W9009.jsp
 * </pre>
 *
 * @author $Author: 10088DS01498 $
 * @version $Revision: 7952 $
 */
public class W9009EditOrReferAction extends W9009AbstractAction{

    /** 
     * EditOrRefer Facade Service/EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Integer, W9009UpdateDomain> 
    w9009EditOrReferFacadeService = null;

    /** 
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9009EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9009EditOrReferFacadeService
     */
    public void setW9009EditOrReferFacadeService(
        ProcessFacadeService<Integer, W9009UpdateDomain> editOrReferFacadeService) {
        w9009EditOrReferFacadeService = editOrReferFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Process of changes.
     * - 遷移処理。
     * 
     * - To create a mass update domain.
     * - Line item selection check.
     * - Call the w9011EditOrReferFacadeService.process an argument updateDomain
     * 
     * - 一括更新ドメインを作成する。
     * - 明細行選択チェックをする。
     * - updateDomainを引数にw9011EditOrReferFacadeService.processの呼び出し
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

        W9009ActionForm w9009Form = (W9009ActionForm)form;

        // To create a mass update domain.
        W9009UpdateDomain updateDomain = prepareUpdateDomain(w9009Form);

        // Line item selection check.
        w9009EditOrReferFacadeService.process(updateDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * To create a {@link W9009UpdateDomain}.
     * {@link W9009UpdateDomain}を作成する。
     * 
     * - Set the screen common information.
     * 
     * - 画面共通情報の設定。
     *
     * @param form アクションフォーム
     * @return 作成した{@link W9009UpdateDomain}
     */
    protected W9009UpdateDomain prepareUpdateDomain(W9009ActionForm form) {
        
        W9009UpdateDomain updateDomain = new W9009UpdateDomain();
        
        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9009CriteriaDomain());
        updateDomain.setListDomainList(form.getW9009ListDomainList());
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
