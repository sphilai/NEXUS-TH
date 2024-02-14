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
 * Class action CreateNew of Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のCreateNewアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": /W6003.Init.do
 * 
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001CreateNewAction extends W6001AbstractAction  {
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001CreateNewAction() {
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
     * {@inheritDoc}
     * <pre>
     * -Invoice Transition to. Screen Header.
     * </pre>
     * <pre>
     * ‐Invoice Header.画面に遷移します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        return FORWARD_SUCCESS;
    }
}
