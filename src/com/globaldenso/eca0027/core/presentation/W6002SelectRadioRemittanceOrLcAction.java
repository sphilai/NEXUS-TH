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
 * Action class of Documentation Manual Invoice Upload screen for port selection.
 * <br />通関書類作成業務 Manual Invoice Upload画面のSelect(PortTo)アクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W6002SelectRadioRemittanceOrLcAction extends W6002AbstractAction  {
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002SelectRadioRemittanceOrLcAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        return FORWARD_SUCCESS;
    }
    
}
