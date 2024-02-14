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
 *    This is an initial display action class of a Export Request Main screen.
 * <br />梱包指示Main画面の初期表示アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1001InitAction extends W1001AbstractAction {

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1001InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 
     * 処理なし
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W1001ActionForm w1001Form = (W1001ActionForm) form;
        //Clear List
        w1001Form.setListDomainList(null);
        
        return FORWARD_SUCCESS;
    }
}
