/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W6005CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Shipping Information Input画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W6005ActionForm extends AbstractActionForm  {
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6004 search criteria domain
     * <br />W6004検索条件ドメイン
     */
    private W6005CriteriaDomain criteriaDomain;
    
    /**
     * trnsCd
     */
    private String trnsCd;
    
    /**
     * COUNTRY CODE
     * <br />国コード
     */
    private String cntryCd;
    
    /**Default constructor.
     * 
     * <br />デフォルトコンストラクタです。
     */
    public W6005ActionForm() {
        criteriaDomain = new W6005CriteriaDomain();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W6005CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W6005CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for cntryCd.
     *
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * Setter method for cntryCd.
     *
     * @param cntryCd Set for cntryCd
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

}
