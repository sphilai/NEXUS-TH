/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004BackToMainScreenFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The BackToMainScreen action class of a Shipping Actuality Register screen.
 * <br />船積実績Register画面のBackToMainScreenアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7001Init.do
 *     ‐"error": W7004
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004BackToMainScreenAction extends W7004AbstractAction {

    /**
     * BackToMain Facade service.
     * <br />BackToMain Facadeサービス
     */
    protected ProcessFacadeService<String, W7004CriteriaDomain> w7004BackToMainScreenFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7004BackToMainScreenAction() {
        super();
    }

    /**
     * Setter method for w7004BackToMainScreenFacadeService.
     *
     * @param backToMainScreenFacadeService Set for w7004BackToMainScreenFacadeService
     */
    public void setW7004BackToMainScreenFacadeService(ProcessFacadeService<String, W7004CriteriaDomain> backToMainScreenFacadeService) {
        w7004BackToMainScreenFacadeService = backToMainScreenFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Sets to a search condition domain. 
     *     Sets to {@link W7004CriteriaDomain}.
     * 
     * ‐Existence check.
     *     Call {@link W7004BackToMainScreenFacadeServiceImpl}.
     * 
     * ‐Move to Main screen.
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7004CriteriaDomain}に設定します。
     * 
     * ‐存在チェック
     *     {@link W7004BackToMainScreenFacadeServiceImpl}を呼出す。
     * 
     * ‐Main画面に遷移します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        W7004CriteriaDomain criteriaDomain = w7004Form.getW7004CriteriaDomain();
        
        if (FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return SCREEN_ID_W7001;
        }
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, w7004Form.getWindowId(), w7004Form.getScreenId());

        String confirmMsg = w7004BackToMainScreenFacadeService.process(criteriaDomain);
        if (StringUtils.isEmpty(confirmMsg)) {
            return SCREEN_ID_W7001;
        }
        
        criteriaDomain.setConfirmMsg(confirmMsg);
        return FORWARD_ERROR;
    }
}
