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

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * The Create New action class of a Export Request Main screen.
 * <br />梱包指示Main画面のCreate Newアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W1002Init.do
 *     - "error":W1001.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1001CreateNewAction extends W1001AbstractAction {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1001CreateNewAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     *   With no processing
     *   
     *   処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W1001ActionForm w1001Form = (W1001ActionForm) form;
        
        w1001Form.setProcMode(MODE_NEW);
        
        return FORWARD_SUCCESS;
    }
}
