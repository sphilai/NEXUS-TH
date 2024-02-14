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

/**
 * The Init action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番Main画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2005.jsp
 *     - "error":W2005.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2005InitAction extends W2005AbstractAction {

    /**
     * constructor.
     */
    public W2005InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A delete of - session information
     *       The screen common information saved on the Multiple Item No. in 1Box PKG number Header screen is deleted.
     *
     * - Display control
     *       Set screen field attributes ({@link W2005AbstractAction#controlDisplay (W2005ActionForm, HttpServletRequest)}).  
     *       Set search-results fields inactive.
     * 
     * 
     * - セッション情報の削除
     *     小箱内多品番Header画面で保存された画面共通情報を削除する
     *     
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W2005AbstractAction#controlDisplay(W2005ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Display control of a Main screen
        // Main画面の表示制御
        controlDisplay((W2005ActionForm) form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Display control of a Multiple Item No. in 1Box PKG number Main screen is performed.
     * <br />小箱内多品番Main画面の表示制御を行います。
     *
     * @param form Action form of a Multiple Item No. in 1Box PKG number Main screen<br />小箱内多品番Main画面のアクション・フォーム
     * @param request Request parameter<br />リクエストパラメータ
     */
    @Override
    protected void controlDisplay(W2005ActionForm form, HttpServletRequest request) {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(form, request);
        
        // Set search-results fields inactive.
        // 検索結果エリアを非表示
        form.setDisplayList(false);
    }
}
