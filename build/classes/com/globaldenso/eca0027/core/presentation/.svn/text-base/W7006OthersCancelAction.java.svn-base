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

import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7006OthersCancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action Others Cancel of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のOthers Cancelアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7006
 *     ‐"error": /W7006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7006OthersCancelAction extends W7006AbstractAction {

    /**
     * Others Cancel Facade Service
     * <br />Others Cancel Facadeサービス
     */
    protected DeleteFacadeService<W7006UpdateDomain, W7006UpdateDomain> w7006OthersCancelFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006OthersCancelAction() {
        super();
    }
    
    /**
     * Setter method for w7006OthersCancelFacadeService.
     *
     * @param othersCancelFacadeService Set for w7006OthersCancelFacadeService
     */
    public void setW7006OthersCancelFacadeService(DeleteFacadeService<W7006UpdateDomain, W7006UpdateDomain> othersCancelFacadeService) {
        w7006OthersCancelFacadeService = othersCancelFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set the {@link W7006CriteriaDomain}.
     * 
     * ‐Delete uploading process FILE DATA, search
     *     Call the {@link W7006OthersCancelFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7006CriteriaDomain}を設定します。
     * 
     * ‐アップロードファイルデータの削除処理、再検索
     *     {@link W7006OthersCancelFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7006ActionForm w7006Form = (W7006ActionForm) form;
        
        W7006UpdateDomain udpateDomain = prepareCriteriaDomain(w7006Form);
        
        W7006UpdateDomain resultDomain = w7006OthersCancelFacadeService.delete(udpateDomain);
        
        w7006Form.setW7006CriteriaDomain(resultDomain.getW7006CriteriaDomain());
        w7006Form.setListDomainList(resultDomain.getListDomainList());
        
        addGlobalMessage(request, GSCM_I0_0007, resultDomain.getUpdateCount());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7006UpdateDomain}.
     * <br />{@link W7006UpdateDomain}を設定します。
     *
     * @param form Action Form of Shipping Document Upload screen<br />
     * 船積書類アップロード画面のアクションフォーム
     * @return {@link W7006UpdateDomain} It set up.<br />
     * 設定した{@link W7006UpdateDomain}
     */
    protected W7006UpdateDomain prepareCriteriaDomain (W7006ActionForm form) {
        W7006UpdateDomain updateDomain = new W7006UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setW7006CriteriaDomain(form.getW7006CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
