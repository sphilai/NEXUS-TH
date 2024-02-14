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

/**
 * The class of Move to B / L Upload action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のMove to B/L Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7005Init.do
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004MoveToBlUploadAction extends W7004AbstractAction {

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004MoveToBlUploadAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     *  - Set the takeover VALUE to the next screen.
     *
     *  - Transition to B / L Update screen.
     * </pre>
     * <pre>
     * ‐遷移先画面への引継値を設定します。
     * 
     * ‐船荷証券更新画面に遷移します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7004ActionForm w7004Form = (W7004ActionForm) form;
        W7004CriteriaDomain criteriaDomain = w7004Form.getW7004CriteriaDomain();
        
        w7004Form.setShipperCd(criteriaDomain.getShipperCd());
        w7004Form.setConsigneeCd(criteriaDomain.getConsigneeCd());
        w7004Form.setShipToCompCd(criteriaDomain.getShipToCompCd());
        w7004Form.setTrnsCd(criteriaDomain.getTrnsCd());
        w7004Form.setBilldNo(criteriaDomain.getBilldNo());
        w7004Form.setShippingActNo(criteriaDomain.getShippingActNo());
        
        return FORWARD_SUCCESS;
    }
}
