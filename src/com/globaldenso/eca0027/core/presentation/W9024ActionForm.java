/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9024CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W9024ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
      * Conditions domain
     * <br />条件ドメイン
     */
    private W9024CriteriaDomain w9024CriteriaDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9024ActionForm() {
        w9024CriteriaDomain = new W9024CriteriaDomain();
    }

    /**
     * Getter method for w9024CriteriaDomain.
     *
     * @return the w9024CriteriaDomain
     */
    public W9024CriteriaDomain getW9024CriteriaDomain() {
        return w9024CriteriaDomain;
    }

    /**
     * Setter method for w9024CriteriaDomain.
     *
     * @param criteriaDomain Set for w9024CriteriaDomain
     */
    public void setW9024CriteriaDomain(W9024CriteriaDomain criteriaDomain) {
        w9024CriteriaDomain = criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w9024CriteriaDomain != null) {
            w9024CriteriaDomain.setIgnoreWarnings(null);
        }
    }
}
