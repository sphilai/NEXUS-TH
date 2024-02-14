/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Header
 * <br />CMLヘッダー情報入力画面のアクション・フォームです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2010ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2010CriteriaDomain w2010CriteriaDomain;

    /**
     * constructor.
     */
    public W2010ActionForm() {
        w2010CriteriaDomain = new W2010CriteriaDomain();
    }

    /**
     * Getter method for w2010CriteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W2010CriteriaDomain getW2010CriteriaDomain() {
        return w2010CriteriaDomain;
    }

    /**
     * Setter method for w2010CriteriaDomain.
     *
     * @param w2010CriteriaDomain Set for w2010CriteriaDomain
     */
    public void setW2010CriteriaDomain(W2010CriteriaDomain w2010CriteriaDomain) {
        this.w2010CriteriaDomain = w2010CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     *
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w2010CriteriaDomain == null) {
            return;
        }
        w2010CriteriaDomain.setManualRegFlg(FLAG_N);
    }
}
