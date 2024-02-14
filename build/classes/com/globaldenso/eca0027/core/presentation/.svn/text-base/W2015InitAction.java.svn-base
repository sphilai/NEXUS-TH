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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Init action class of X-tag Header
 * <br />X-tag Header画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2015.jsp
 *     - "error":W2015.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2015InitAction extends W2015AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected DeleteFacadeService<Void, W2015CriteriaDomain> w2015InitFacadeService;
    
    /**
     * constructor.
     */
    public W2015InitAction() {
        super();
    }

    /**
     * Setter method for w2015InitFacadeService.
     *
     * @param initFacadeService Set for w2015InitFacadeService
     */
    public void setW2015InitFacadeService(
        DeleteFacadeService<Void, W2015CriteriaDomain> initFacadeService) {
        w2015InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A delete of - X Palletize Work
     *       The X Palletize Work which the user registered is deleted.
     * 
     * 
     * - まとめパレタイズワークの削除
     *     ユーザが登録したまとめパレタイズワークを削除する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2015ActionForm W2015Form = (W2015ActionForm) form;
        
        // delete of X Palletize Work
        // まとめパレタイズワークの削除
        removeXpltz(W2015Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     *    A X Palletize Work is deleted.
     * <br />まとめパレタイズワークを削除します。
     * 
     * @param form Action form of a X-TAG Header screen<br />まとめCML Header画面のアクション・フォーム
     * @throws ApplicationException When a X Palletize Work is not able to be deleted<br />まとめパレタイズワークが削除できなかった場合
     */
    protected void removeXpltz(W2015ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2015CriteriaDomain criteriaDomain = form.getW2015CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // delete of X Palletize Work
        // まとめパレタイズワークの削除
        w2015InitFacadeService.delete(criteriaDomain);
    }
}
