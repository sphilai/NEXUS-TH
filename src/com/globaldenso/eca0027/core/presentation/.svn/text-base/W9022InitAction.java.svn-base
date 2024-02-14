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

/**
 * The initial display of class action Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9022
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W9022InitAction extends W9022AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W9022AbstractAction#controlDisplay(W9022ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * 
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W9022AbstractAction#controlDisplay(W9022ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        request.removeAttribute("company");
        request.removeAttribute("documentNo");
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W9022AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W9022ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W9022ActionForm form,
        HttpServletRequest request) {
        
        // Active control of the button.
        // ボタンの活性制御
        super.controlDisplay(form, request);

        // Hide Search Results Area.
        // 検索結果エリアを非表示
        form.setListDomainList(null);
    }
}
