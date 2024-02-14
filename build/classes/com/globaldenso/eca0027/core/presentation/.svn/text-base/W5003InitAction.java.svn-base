/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W5002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The Initialize action class of Shipping Confirmation create screen
 * <br />出荷確認Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W5003.jsp
 *     - "error":W5003.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5003InitAction extends W5003AbstractAction {

    /**
     * constructor.
     */
    public W5003InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5003ActionForm w5003Form = (W5003ActionForm) form;
        
        // Copy of the Header information.
        // Header情報のコピー
        copyHeaderInfo(w5003Form);
        
        // Display control.
        // 表示制御
        controlDisplay(w5003Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * Copy the search criteria domain Header information.
     * <br />Header情報を検索条件ドメインにコピーします。
     *
     * <pre>
     * - Acquires the information of Header screen to set W5003CriteriaDomain
     *
     * - Header画面の情報を取得し、W5003CriteriaDomainに設定する。
     * </pre>
     * @param form action form
     */
    protected void copyHeaderInfo(W5003ActionForm form) {
        // Getting Header information.
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W5002);
        W5002CriteriaDomain w5002Criteria = ((W5002ActionForm) screenInfo.getActionForm()).getW5002CriteriaDomain();
        
        // Retrieval conditions domain.
        // 検索条件ドメインの取得
        W5003CriteriaDomain w5003Criteria = form.getW5003CriteriaDomain();
        
        // Copy of the Header information.
        // Header情報のコピー
        w5003Criteria.setWhCompCd(w5002Criteria.getWhCompCd());
        w5003Criteria.setWhCd(w5002Criteria.getWhCd());
        w5003Criteria.setTrnsCd(w5002Criteria.getTrnsCd());
        w5003Criteria.setContainerSortingKey(w5002Criteria.getContainerSortingKey());
    }

    /**
     * Make the display control of shipping confirmation Create screen.
     * <br />出荷確認Create画面の表示制御を行います。
     * <pre>
     * - Hide Search Results Area.
     *
     * - 検索結果エリアを非表示にする。
     * </pre>
     *
     * @param form action form
     */
    protected void controlDisplay(W5003ActionForm form) {
        form.setDisplayList(false);
    }
}
