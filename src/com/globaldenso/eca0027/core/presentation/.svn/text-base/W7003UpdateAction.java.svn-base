/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7003UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7003UpdateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of action Update of Shipping Actuality Create screen.
 * <br />船積実績Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W7003
 *     ‐ "error": W7003
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003UpdateAction extends W7003AbstractAction {

    /**
     * Update FacadeService
     */
    protected CreateFacadeService<Integer, W7003UpdateDomain> w7003UpdateFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7003UpdateAction() {
        super();
    }

    /**
     * Setter method for w7003UpdateFacadeService.
     *
     * @param updateFacadeService Set for w7003UpdateFacadeService
     */
    public void setW7003UpdateFacadeService(CreateFacadeService<Integer, W7003UpdateDomain> updateFacadeService) {
        w7003UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W7003UpdateDomain} screen common information.
     * 
     * ‐Run the Update process
     *     Call the {@link W7003UpdateFacadeServiceImpl}.
     * 
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     画面共通情報を{@link W7003UpdateDomain}に設定します。
     * 
     * ‐Update処理の実行
     *     {@link W7003UpdateFacadeServiceImpl}を呼出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7003ActionForm w7003Form = (W7003ActionForm) form;
        
        W7003UpdateDomain updateDomain = prepareCriteriaDomain(request, mapping, w7003Form);

        int updateCount = w7003UpdateFacadeService.create(updateDomain);
        // Update the List domain. 
        // Listドメインリストの更新
        updateListDomain(updateDomain.getListDomainList());
        // Add ActionMessages.
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, updateCount);
        
        return FORWARD_SUCCESS;
    }

    /**
     *  Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     */
    protected W7003UpdateDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W7003ActionForm form) {
        
        W7003UpdateDomain updateDomain = new W7003UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW7003CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
