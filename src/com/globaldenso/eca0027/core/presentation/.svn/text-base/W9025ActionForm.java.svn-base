/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Registration Screen of Actual Item Weight.
 * <br />実測製品重量登録画面のアクション・フォームです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Conditions domain
     * <br />検索条件ドメイン
     */
    private W9025CriteriaDomain w9025CriteriaDomain;
    
    /**
     * Default constructor
     * <br />デフォルトコンストラクタ。
     */
    public W9025ActionForm() {
        w9025CriteriaDomain = new W9025CriteriaDomain();
    }

    /**
     * Getter method for w9025CriteriaDomain
     * 
     * @return the w9025CriteriaDomain
     */
    public W9025CriteriaDomain getW9025CriteriaDomain() {
        return w9025CriteriaDomain;
    }

    /**
     * Setter method for w9025CriteriaDomain
     *
     * @param criteriaDomain Set for w9025CriteriaDomain
     */
    public void setW9025CriteriaDomain(W9025CriteriaDomain criteriaDomain) {
        w9025CriteriaDomain = criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w9025CriteriaDomain != null) {
            w9025CriteriaDomain.setIgnoreWarnings(false);
        }
    }
}
