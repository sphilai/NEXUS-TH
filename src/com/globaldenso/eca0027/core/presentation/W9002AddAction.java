/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Action class of Add the Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のAddアクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9002AddAction extends W9002AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9002AddAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Move to a new Agent MA Edit screen
     * </pre>
     * <pre>
     * ‐Agent MA Edit画面に新規で遷移する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9002ActionForm w9002Form = (W9002ActionForm) form;
        
        w9002Form.setFunctionNo(MODE_NEW);
        
        return FORWARD_SUCCESS;
    }

}
