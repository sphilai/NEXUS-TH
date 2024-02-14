/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of action BackToMainScreen for Shipping Actuality Register screen.
 * <br />船積実績Register画面のBackToMainScreenアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W7004
 *     ‐"error": W7004
 *     ‐"W7003": /W7003Init.do
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004DeleteAction extends W7004AbstractAction {

    /**
     * Delete Facade Service<br />
     * Delete Facadeサービス
     */
    protected DeleteFacadeService<W7004UpdateDomain, W7004UpdateDomain> w7004DeleteFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004DeleteAction() {
        super();
    }

    /**
     * Setter method for w7004DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w7004DeleteFacadeService
     */
    public void setW7004DeleteFacadeService(DeleteFacadeService<W7004UpdateDomain, W7004UpdateDomain> deleteFacadeService) {
        w7004DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set of mass update domain
     *   Set to{@link W7004UpdateDomain}.
     *
     * - Execution of the removal process
     *   Call the{@link W7004DeleteFacadeServiceImpl}.
     *
     * [Search If the result is 1 or more]
     *
     * - Set of search results
     *
     * [Search If the result is 0 Listings]
     * 
     * -Create transition to the screen
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     {@link W7004UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W7004DeleteFacadeServiceImpl}を呼出す。
     * 
     * [検索結果が1件以上の場合]
     * 
     * ‐検索結果の設定
     * 
     * [検索結果が0件の場合]
     * 
     * ‐Create画面へ遷移
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        W7004UpdateDomain updateDomain = prepareUpdateDomain(w7004Form);
        
        W7004UpdateDomain resultDomain = w7004DeleteFacadeService.delete(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, resultDomain.getUpdateCount());
        
        if (null == resultDomain || 0 == resultDomain.getListDomainList().size()) {
            return SCREEN_ID_W7003;
        } else {
            w7004Form.setW7004CriteriaDomain(resultDomain.getCriteriaDomain());
            w7004Form.setListDomainList(resultDomain.getListDomainList());
            
            return FORWARD_SUCCESS;
        }
    }

    /**
     * Create a {@link W7004UpdateDomain}.
     * <br />{@link W7004UpdateDomain}を作成します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @return You created {@link W7004UpdateDomain}<br />作成した{@link W7004UpdateDomain}
     */
    protected W7004UpdateDomain prepareUpdateDomain(W7004ActionForm form) {
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        for (W7004ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        updateDomain.setCriteriaDomain(form.getW7004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
