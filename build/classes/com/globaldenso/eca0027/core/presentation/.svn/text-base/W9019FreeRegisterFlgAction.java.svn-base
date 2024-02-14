/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;

/**
 * 
 * The class of Export for Free1RegisterFlgAction Formalities by Item MA Edit screen.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9019FreeRegisterFlgAction extends W9019AbstractAction {

    /**
     * Default constructor.
     */
    public W9019FreeRegisterFlgAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9019ActionForm w9019Form = (W9019ActionForm) form;
        W9019CriteriaDomain criteriaDomain = w9019Form.getW9019CriteriaDomain();
        
        // Free1 Register Flag
        if (FLAG_N.equals(criteriaDomain.getFree1RegFlg())) {
            criteriaDomain.setFree1Dtl(StringUtils.EMPTY);
            criteriaDomain.setFree1OriginCntryFlg(CHECK_OFF);
        }

        // Free2 Register Flag
        if (FLAG_N.equals(criteriaDomain.getFree2RegFlg())) {
            criteriaDomain.setFree2Dtl(StringUtils.EMPTY);
            criteriaDomain.setFree2OriginCntryFlg(CHECK_OFF);
        }
        
        // Free3 Register Flag
        if (FLAG_N.equals(criteriaDomain.getFree3RegFlg())) {
            criteriaDomain.setFree3Dtl(StringUtils.EMPTY);
            criteriaDomain.setFree3OriginCntryFlg(CHECK_OFF);
        }
        return FORWARD_SUCCESS;
    }
}
