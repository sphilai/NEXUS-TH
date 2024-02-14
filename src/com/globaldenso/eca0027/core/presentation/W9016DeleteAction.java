/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9016UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9016DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Clone action class of Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面のCloneアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9016
 *     ‐"error": W9016
 *     ‐"W9016": /W9016Init.do
 * </pre>
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9016DeleteAction extends W9016AbstractAction {

    /**
     * Delete Facade Service
     * <br />Delete Facadeサービス
     */
    protected DeleteFacadeService<Integer, W9016UpdateDomain> w9016DeleteFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016DeleteAction() {
        super();
    }

    /**
     * Setter method for w9016DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9016DeleteFacadeService
     */
    public void setW9016DeleteFacadeService(
        DeleteFacadeService<Integer, W9016UpdateDomain> deleteFacadeService) {
        w9016DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W9016UpdateDomain}.
     * 
     * ‐Execution of the removal process
     *     Call the {@link W9016DeleteFacadeServiceImpl}.
     * 
     * ‐一括更新ドメインの設定
     *     {@link W9016UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9016DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9016ActionForm w9016Form = (W9016ActionForm) form;

        W9016UpdateDomain updateDomain = prepareUpdateDomain(w9016Form);
        
        int deleteCount = w9016DeleteFacadeService.delete(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, deleteCount);

        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9016UpdateDomain}.
     * <br />{@link W9016UpdateDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Inquiry screen <br />Export Ship to Shipping MA Inquiry画面のアクションフォーム
     * @return  {@link W9016UpdateDomain} It created <br />作成した{@link W9016UpdateDomain}
     */
    protected W9016UpdateDomain prepareUpdateDomain(W9016ActionForm form) {
        
        W9016UpdateDomain updateDomain = new W9016UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9016CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        String selected = form.getW9016CriteriaDomain().getSelected();
        if (selected != null) {
            int index = Integer.parseInt(selected);
            for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
                if (i == index) {
                    updateDomain.getListDomainList().get(i).setSelected(CHECK_ON);
                } else {
                    updateDomain.getListDomainList().get(i).setSelected(CHECK_OFF);
                }
            }
        }
        
        return updateDomain;
    }
}
