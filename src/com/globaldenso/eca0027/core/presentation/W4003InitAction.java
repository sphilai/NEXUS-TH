/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W4002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4003CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize action class of Staging Instruction create screen
 * <br />荷揃え指示Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W4003.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4003InitAction extends W4003AbstractAction {

    /**
     * constructor.
     */
    public W4003InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting the Header information
     *    - Transfer to the form.w4003CriteriaDomain w4002CriteriaDomain of Header screen information stack
     *
     * - Header情報の設定
     *    - Header画面情報スタックのw4002CriteriaDomainをform.w4003CriteriaDomainに移送
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4003ActionForm form = (W4003ActionForm)actForm;

        // Get Header PL domain than the screen stack information
        // 画面情報スタックよりHeader PLドメインの取得
        WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W4002);
        W4002CriteriaDomain w4002CriteriaDomain
            = ((W4002ActionForm)screenInfoDomain.getActionForm()).getW4002CriteriaDomain();

        // Header PL domain -> Create PL domain transfer
        // Header PLドメイン→Create PLドメイン移送
        W4003CriteriaDomain w4003CriteriaDomain = form.getW4003CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w4003CriteriaDomain,
            w4002CriteriaDomain, w4002CriteriaDomain.getScreenDateFormat());

        // Erase search results
        // 検索結果の消去
        form.setW4003ListDomainList(null);

        return FORWARD_SUCCESS;
    }
}
