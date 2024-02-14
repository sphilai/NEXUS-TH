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

import com.globaldenso.eca0027.core.business.domain.W9002UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9002DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Delete action class of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面の削除アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9002
 *     ‐"error": W9002
 *     ‐"W9002": /W9002Init.do
 * </pre>
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002DeleteAction extends W9002AbstractAction {

    /**
     * Delete Facade Service
     * <br />Delete Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9002UpdateDomain> w9002DeleteFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9002DeleteAction() {
        super();
    }

    /**
     * Setter method for w9002DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9002DeleteFacadeService
     */
    public void setW9002DeleteFacadeService(DeleteFacadeService<Integer, W9002UpdateDomain> deleteFacadeService) {
        w9002DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W9002UpdateDomain}.
     * 
     * ‐Execution of the removal process
     *     Call {@link W9002DeleteFacadeServiceImpl}.
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     {@link W9002UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9002DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9002ActionForm w9002Form = (W9002ActionForm) form;
        W9002UpdateDomain updateDomain = prepareUpdateDomain(w9002Form);
        
        int deleteCount = w9002DeleteFacadeService.delete(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, deleteCount);
        controlDisplay(w9002Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9002UpdateDomain}.
     * <br />{@link W9002UpdateDomain}を作成します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return  {@link W9002UpdateDomain} It created<br />
     * 作成した{@link W9002UpdateDomain}
     */
    protected W9002UpdateDomain prepareUpdateDomain(W9002ActionForm form) {
        
        W9002UpdateDomain updateDomain = new W9002UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9002CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
