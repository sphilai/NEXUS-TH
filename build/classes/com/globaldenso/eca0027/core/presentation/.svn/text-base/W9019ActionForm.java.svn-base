/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of Export Formalities by Item MA Edit screen.
 * <br />Export Formalities by Item MA Edit画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W9019ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9019CriteriaDomain w9019CriteriaDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9019ActionForm() {
        w9019CriteriaDomain = new W9019CriteriaDomain();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9019CriteriaDomain getW9019CriteriaDomain() {
        return w9019CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW9019CriteriaDomain(W9019CriteriaDomain criteriaDomain) {
        this.w9019CriteriaDomain = criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w9019CriteriaDomain != null) {
            w9019CriteriaDomain.setFree1OriginCntryFlg(null);
            w9019CriteriaDomain.setFree2OriginCntryFlg(null);
            w9019CriteriaDomain.setFree3OriginCntryFlg(null);
        }
    }
}
