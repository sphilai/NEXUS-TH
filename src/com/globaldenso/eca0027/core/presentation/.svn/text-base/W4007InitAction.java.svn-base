/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4007CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize action class of Staging Actuality create screen
 * <br />山作り実績Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4007.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4007InitAction extends W4007AbstractAction {

    /**
     * constructor.
     */
    public W4007InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting the Header information
     *    - Transfer to the form.w4007CriteriaDomain w4006CriteriaDomain of Header screen information stack
     *
     * - Header情報の設定
     *    - Header画面情報スタックのw4006CriteriaDomainをform.w4007CriteriaDomainに移送
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4007ActionForm form = (W4007ActionForm)actForm;

        // Get Header PL domain than the screen stack information
        // 画面情報スタックよりHeader PLドメインの取得
        WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W4006);
        W4006CriteriaDomain w4006CriteriaDomain
            = ((W4006ActionForm)screenInfoDomain.getActionForm()).getW4006CriteriaDomain();

        // Header PL domain -> Create PL domain transfer
        // Header PLドメイン→Create PLドメイン移送
        W4007CriteriaDomain w4007CriteriaDomain = form.getW4007CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w4007CriteriaDomain,
            w4006CriteriaDomain, w4006CriteriaDomain.getScreenDateFormat());

        // Erase search results
        // 検索結果の消去
        form.setW4007ListDomainList(null);

        return FORWARD_SUCCESS;
    }
}
