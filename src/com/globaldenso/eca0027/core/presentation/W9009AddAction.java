/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * The action class for changes by new creation on CIGMA Ship to X-Reference MA Edit Screen.
 * <br />CIGMA Ship to X-Reference MA Edit画面に新規作成で遷移するアクションです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9010.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9009AddAction extends W9009AbstractAction{

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009AddAction() {
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
       
        W9009ActionForm w9009Form = (W9009ActionForm)form;
        w9009Form.setAddFlg(FLAG_ON);
        
        return FORWARD_SUCCESS;
    }
}
