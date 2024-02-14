/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_1;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * Upload Main Inv action class of Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のUpload Main Invアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": /W6002Init.do
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
*/
public class W6001UploadMainInvAction extends W6001AbstractAction {
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001UploadMainInvAction() {
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
     * - Take over VALUE to the destination screen 
     * Set "" 1 "(Manual Main Invoice added)" in the Function No.
     * </pre>
     * <pre>
     * ‐遷移先画面への引継値
     *     Function Noに「"1"(Manual Main Invoice追加)」を設定します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        // Setting Take over VALUE.
        // 引継値の設定
        request.setAttribute("functionNo", W6002_FUNCTION_NO_1);
        
        return FORWARD_SUCCESS;
    }
}
