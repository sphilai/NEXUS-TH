/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Order Registration header screen.
 * <br />受注登録ヘッダー画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class WB001ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB001CriteriaDomain wb001CriteriaDomain;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WB001ActionForm() {
        wb001CriteriaDomain = new WB001CriteriaDomain();
    }

    /**
     * Getter method for wb001CriteriaDomain.
     *
     * @return the wb001CriteriaDomain
     */
    public WB001CriteriaDomain getWb001CriteriaDomain() {
        return wb001CriteriaDomain;
    }

    /**
     * Setter method for wb001CriteriaDomain.
     *
     * @param wb001CriteriaDomain Set for wb001CriteriaDomain
     */
    public void setWb001CriteriaDomain(WB001CriteriaDomain wb001CriteriaDomain) {
        this.wb001CriteriaDomain = wb001CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        wb001CriteriaDomain.setIgnoreWarnings(null);
    }
}
