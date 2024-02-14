/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004ChangeStatusFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of Change Status action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のChange Statusアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W7004
 *     ‐"error": W7004
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004ChangeStatusAction extends W7004AbstractAction {

    /**
     * Change Status Facade Service<br />
     * Change Status Facadeサービス
     */
    protected TransactFacadeService<W7004UpdateDomain, W7004UpdateDomain> w7004ChangeStatusFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004ChangeStatusAction() {
        super();
    }

    /**
     * Setter method for w7004ChangeStatusFacadeService.
     *
     * @param changeStatusFacadeService Set for w7004ChangeStatusFacadeService
     */
    public void setW7004ChangeStatusFacadeService(TransactFacadeService<W7004UpdateDomain, W7004UpdateDomain> changeStatusFacadeService) {
        w7004ChangeStatusFacadeService = changeStatusFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Is the execution process.
     *   Set of mass update domain EXECUTE Process W7004UpdateDomain I set to.
     * - STATUS update process of Invoice
     *   Call the{@link W7004ChangeStatusFacadeServiceImpl}.
     * - Set of search results
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     {@link W7004UpdateDomain}に設定します。
     * 
     * ‐インボイスのステータス更新処理
     *     {@link W7004ChangeStatusFacadeServiceImpl}を呼び出す。
     * 
     * ‐検索結果の設定
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        W7004UpdateDomain updateDomain = prepareUpdateDomain(w7004Form);
        
        W7004UpdateDomain resultDomain = w7004ChangeStatusFacadeService.transact(updateDomain);
        // Add ActionMessages.
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0006, resultDomain.getUpdateCount());
        // Set the search results. 
        // 検索結果の設定
        setSearchResult(w7004Form, resultDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the search results.
     * <br />検索結果を設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @param updateDomain mass update domain<br />一括更新ドメイン
     */
    protected void setSearchResult(W7004ActionForm form, W7004UpdateDomain updateDomain) {
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
                
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, updateDomain.getCriteriaDomain());
        
        form.setListDomainList(updateDomain.getListDomainList());
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
     
        updateDomain.setCriteriaDomain(form.getW7004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }   
}
