/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Multi Label Register Screen
 * <br />Multi Label Register画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Multi Label registration information.
     */
    private W2020CriteriaDomain w2020CriteriaDomain;

    /**
     * constructor.
     */
    public W2020ActionForm() {
        super();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W2020CriteriaDomain getW2020CriteriaDomain() {
        if (w2020CriteriaDomain == null) {
            w2020CriteriaDomain = new W2020CriteriaDomain();
        }
        return w2020CriteriaDomain;
    }

    /**
     * Setter method for W2020CriteriaDomain.
     *
     * @param criteriaDomain Set for W2020CriteriaDomain
     */
    public void setW2020CriteriaDomain(W2020CriteriaDomain criteriaDomain) {
        w2020CriteriaDomain = criteriaDomain;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w2020CriteriaDomain == null) {
            return;
        }
        w2020CriteriaDomain.setManualRegFlg(FLAG_N);
    }
}
