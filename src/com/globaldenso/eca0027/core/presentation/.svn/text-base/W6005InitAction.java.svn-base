/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of Init action for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Shipping Information Input画面のInitアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6005InitAction extends W6005AbstractAction {
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6005InitAction() {
        super();
    }
     
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6005ActionForm w6005Form = (W6005ActionForm) form;
        
        // Set the W6005CriteriaDomain. 
        // 遷移元画面からの引き継ぎ情報の取得
        prepareCriteriaDomain(w6005Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the {@link W6005CriteriaDomain}.
     * <br />{@link W6005CriteriaDomain}を設定します。
     *
     * @param form <br />
     * 通関書類作成業務 Manual Invoice Upload画面のアクションフォーム
     * @return {@link W8002CriteriaDomain}<br />
     * 設定した{@link W8002CriteriaDomain}
     */
    protected W6005CriteriaDomain prepareCriteriaDomain (W6005ActionForm form) {
        W6005CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6004);
        W6004ActionForm w6004Form = (W6004ActionForm) screenInfo.getActionForm();

        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w6004Form.getCriteriaDomain());
        criteriaDomain.setContainerSortingKey(w6004Form.getContainerSortingKey());
        form.setTrnsCd(criteriaDomain.getTrnsCd());
        
        criteriaDomain.setOriginalScreenId(form.getCallScreenId());
        
        return criteriaDomain;
    }

}
