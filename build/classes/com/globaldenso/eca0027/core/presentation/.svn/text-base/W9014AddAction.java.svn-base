/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * The action class for changes by new creation on CIGMA W/H X-Reference MA Edit Screen.
 * <br />CIGMA W/H X-Reference MA Edit画面に新規作成で遷移するアクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9015.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014AddAction extends W9014AbstractAction{

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014AddAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping, 
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest,
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W9014ActionForm w9014Form = (W9014ActionForm)form;
        w9014Form.setAddFlg(FLAG_ON);
        
        return FORWARD_SUCCESS;
    }
}
