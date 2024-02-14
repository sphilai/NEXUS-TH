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
 *    Initial display action of a Last Digit Change Main Screen.
 * <br />品番末尾変更メイン画面の初期表示アクション。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB006.jsp
 *     - "error":WB006.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB006InitAction extends WB006AbstractAction {

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB006InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        return FORWARD_SUCCESS;
    }
}
