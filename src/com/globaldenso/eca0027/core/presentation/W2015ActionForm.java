/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of X-Tag Header
 * <br />まとめCMLHeader画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2015ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2015CriteriaDomain w2015CriteriaDomain;

    /**
     * constructor.
     */
    public W2015ActionForm() {
        w2015CriteriaDomain = new W2015CriteriaDomain();
    }
    
    /**
     * Getter method for w2015CriteriaDomain.
     *
     * @return the w2015CriteriaDomain
     */
    public W2015CriteriaDomain getW2015CriteriaDomain() {
        return w2015CriteriaDomain;
    }

    /**
     * Setter method for w2015CriteriaDomain.
     *
     * @param criteriaDomain Set for w2015CriteriaDomain
     */
    public void setW2015CriteriaDomain(W2015CriteriaDomain criteriaDomain) {
        w2015CriteriaDomain = criteriaDomain;
    }
}
