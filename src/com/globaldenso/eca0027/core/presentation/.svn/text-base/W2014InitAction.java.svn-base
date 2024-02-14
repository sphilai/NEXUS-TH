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
 * The Init action class of X-tag Main Screen
 * <br />X-tag Main Screen画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2014.jsp
 *     - "error":W2014.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014InitAction extends W2014AbstractAction {

    /**
     * constructor.
     */
    public W2014InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Display control
     *       Set screen field attributes.
     *       {@link W2014AbstractAction#controlDisplay(W2014ActionForm, HttpServletRequest)}
     * 
     * 
     * - 表示制御
     *     画面項目の活性制御 
     *       {@link W2014AbstractAction#controlDisplay(W2014ActionForm, HttpServletRequest)}
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        return FORWARD_SUCCESS;
    }
}
