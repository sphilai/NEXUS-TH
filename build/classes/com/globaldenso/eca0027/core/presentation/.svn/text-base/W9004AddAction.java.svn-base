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
 * Action class for add of Export Ship to Shipping MA Inquiry screen.<br />
 * Export Ship to Shipping MA Inquiry画面のAddアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9004.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9004AddAction extends W9004AbstractAction {

    /**
     * Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W9004AddAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9004ActionForm w9004Form = (W9004ActionForm) form;
        w9004Form.setDscId(null);
        w9004Form.setUsrNmEn(null);
        w9004Form.setFunctionNo(MODE_NEW);

        return FORWARD_SUCCESS;
    }
}
