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

import com.globaldenso.eca0027.core.business.domain.W9018UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9018DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9018
 *     ‐"error": W9018
 *     ‐"W9018": /W9018Init.do
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9747 $
 */
public class W9018DeleteAction extends W9018AbstractAction {

    /**
     * Delete Facade Service
     * <br />Delete Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9018UpdateDomain> w9018DeleteFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018DeleteAction() {
        super();
    }

    /**
     * Setter method for w9018DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9018DeleteFacadeService
     */
    public void setW9018DeleteFacadeService(
        DeleteFacadeService<Integer, W9018UpdateDomain> deleteFacadeService) {
        w9018DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W9018UpdateDomain}.
     * 
     * ‐Execution of the removal process
     *     Call the {@link W9018DeleteFacadeServiceImpl}.
     * 
     * ‐一括更新ドメインの設定
     *     {@link W9018UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9018DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9018ActionForm w9018Form = (W9018ActionForm) form;
        
        W9018UpdateDomain updateDomain = prepareUpdateDomain(w9018Form);
        
        int deleteCount = w9018DeleteFacadeService.delete(updateDomain);
        updateDomain.getCriteriaDomain().setSelected(null);
        addGlobalMessage(request, GSCM_I0_0007, deleteCount);

        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9018UpdateDomain}
     * <br />{@link W9018UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9018UpdateDomain} It created <br />作成した{@link W9018UpdateDomain}
     */
    protected W9018UpdateDomain prepareUpdateDomain(W9018ActionForm form) {
        
        W9018UpdateDomain updateDomain = new W9018UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9018CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
