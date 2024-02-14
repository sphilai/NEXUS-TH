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

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of Move action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のMoveアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7006Init.do
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004MoveAction extends W7004AbstractAction {

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004MoveAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set the takeover VALUE to the next screen.
     *
     * - Transition to the Shipping Document Upload screen.
     * </pre>
     * <pre>
     * ‐遷移先画面への引継値を設定します。
     * 
     * ‐船積書類アップロード画面に遷移します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        W7004CriteriaDomain criteriaDomain = w7004Form.getW7004CriteriaDomain();
        W7004ListDomain listDomain = w7004Form.getListDomainList().get(Integer.parseInt(criteriaDomain.getSelectedRow()));
        
        CommonUtil.copyPropertiesDomainToActionForm(w7004Form, criteriaDomain);
        w7004Form.setInvoiceNo(listDomain.getInvoiceNo());
        w7004Form.setInvoiceIssueDt(listDomain.getInvoiceIssueDt());
        
        return FORWARD_SUCCESS;
    }
}
