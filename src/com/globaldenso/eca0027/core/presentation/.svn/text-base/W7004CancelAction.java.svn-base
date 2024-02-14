/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004CancelFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Move to Other Doc. Upload action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のMove to Other Doc. Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7001Init.do
 *     ‐"error": W7004
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9540 $
 */
public class W7004CancelAction extends W7004AbstractAction {

    /**
     * Cancel Facade Service<br />
     * Cancel Facadeサービス
     */
    protected TransactFacadeService<Integer, W7004UpdateDomain> w7004CancelFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004CancelAction() {
    }

    /**
     * Setter method for w7004CancelFacadeService.
     *
     * @param cancelFacadeService Set for w7004CancelFacadeService
     */
    public void setW7004CancelFacadeService(TransactFacadeService<Integer, W7004UpdateDomain> cancelFacadeService) {
        w7004CancelFacadeService = cancelFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set of mass update domain
     *   Set to {@link W7004UpdateDomain} in the following information .
     *    - Screen-like common information
     *    - Search conditions domain ( {@link W7004CriteriaDomain} )
     *    - List domain list ( {@link W7004ListDomain} )
     * 
     * - Execution of the cancellation process
     *   Call the {@link W7004CancelFacadeServiceImpl}.
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     以下の情報を{@link W7004UpdateDomain}に設定します。
     *         ‐画面共通情報
     *         ‐検索条件ドメイン（{@link W7004CriteriaDomain}）
     *         ‐Listドメインリスト（{@link W7004ListDomain}）
     * 
     * ‐キャンセル処理の実行
     *     {@link W7004CancelFacadeServiceImpl}を呼び出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        W7004UpdateDomain updateDomain = prepareUpdateDomain(w7004Form);
        
        int updateCount = w7004CancelFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, updateCount);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7004UpdateDomain}.
     * <br />{@link W7004UpdateDomain}を設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br />船積実績Register画面のアクションフォーム
     * @return You set {@link W7004UpdateDomain}<br />設定した {@link W7004UpdateDomain}
     */
    protected W7004UpdateDomain prepareUpdateDomain(W7004ActionForm form) {
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
