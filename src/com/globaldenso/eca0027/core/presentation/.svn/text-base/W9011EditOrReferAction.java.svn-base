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

import com.globaldenso.eca0027.core.business.domain.W9011UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The action class for edit or refer by new creation 
 * on CIGMA Customer No. X-Reference MA Edit Screen.
 * <br />CIGMA Customer No. X-Reference MA Edit画面に修正・参照で遷移するアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9012.jsp
 *     - "error":W9011.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7885 $
 */
public class W9011EditOrReferAction extends W9011AbstractAction{

    /** 
     * EditOrRefer Facade Service/EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Integer, W9011UpdateDomain> 
    w9011EditOrReferFacadeService = null;

    /** 
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9011EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9011EditOrReferFacadeService
     */
    public void setW9011EditOrReferFacadeService(
        ProcessFacadeService<Integer, W9011UpdateDomain> editOrReferFacadeService) {
        w9011EditOrReferFacadeService = editOrReferFacadeService;
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

        W9011ActionForm w9011Form = (W9011ActionForm)form;

        // To create a mass update domain.
        W9011UpdateDomain updateDomain = prepareUpdateDomain(w9011Form);

        // Line item selection check.
        w9011EditOrReferFacadeService.process(updateDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * To create a {@link W9011UpdateDomain}.
     * {@link W9011UpdateDomain}を作成する。
     * 
     * - Set the screen common information.
     * 
     * - 画面共通情報の設定。
     *
     * @param form アクションフォーム
     * @return 作成した{@link W9011UpdateDomain}
     */
    protected W9011UpdateDomain prepareUpdateDomain(W9011ActionForm form) {

        W9011UpdateDomain updateDomain = new W9011UpdateDomain();

        // Set the screen common information.
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

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
