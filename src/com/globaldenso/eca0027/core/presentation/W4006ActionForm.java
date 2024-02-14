/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Actuality Header Screen
 * <br />山作り実績Header画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4006ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Header infomation for creating Staging Actuality.
     */
    private W4006CriteriaDomain w4006CriteriaDomain;

    /**
     * constructor.
     */
    public W4006ActionForm() {
        super();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4006CriteriaDomain getW4006CriteriaDomain() {
        if (w4006CriteriaDomain == null) {
            w4006CriteriaDomain = new W4006CriteriaDomain();
        }
        return w4006CriteriaDomain;
    }

    /**
     * Setter method for w4006CriteriaDomain.
     *
     * @param criteriaDomain Set for w4006CriteriaDomain
     */
    public void setW4006CriteriaDomain(W4006CriteriaDomain criteriaDomain) {
        w4006CriteriaDomain = criteriaDomain;
    }
}
