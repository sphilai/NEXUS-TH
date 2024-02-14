/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchTtPltzItemByKanban.
 * <br />SearchTtPltzItemByKanbanの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501TtPltzItemByKanbanDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * PLTZ_ITEM_NO
     */
    private String  pltzItemNo;
    
    /**
     * PKG_CD
     */
    private String  pkgCd;

    /**
     * CUSTOMER_ITEM_NO
     */
    private String  customerItemNo;
    
    /**
     * EXP_INDUS_TYP_CD
     */
    private String  expIndusTypCd;
    
    /**
     * EXP_KANBAN_TYP
     */
    private String  expKanbanTyp;
    
    /**
     * EXP_REGULATE_NO
     */
    private String  expRegulateNo;

    /**
     * EXP_CUSTOMER_REGULATE_NO
     */
    private String  expCustomerRegulateNo;

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501TtPltzItemByKanbanDomain() {
    }

    /**
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * Getter method for customerItemNo.
     *
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * Setter method for customerItemNo.
     *
     * @param customerItemNo Set for customerItemNo
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * Getter method for expIndusTypCd.
     *
     * @return the expIndusTypCd
     */
    public String getExpIndusTypCd() {
        return expIndusTypCd;
    }

    /**
     * Setter method for expIndusTypCd.
     *
     * @param expIndusTypCd Set for expIndusTypCd
     */
    public void setExpIndusTypCd(String expIndusTypCd) {
        this.expIndusTypCd = expIndusTypCd;
    }

    /**
     * Getter method for expKanbanTyp.
     *
     * @return the expKanbanTyp
     */
    public String getExpKanbanTyp() {
        return expKanbanTyp;
    }

    /**
     * Setter method for expKanbanTyp.
     *
     * @param expKanbanTyp Set for expKanbanTyp
     */
    public void setExpKanbanTyp(String expKanbanTyp) {
        this.expKanbanTyp = expKanbanTyp;
    }

    /**
     * Getter method for expRegulateNo.
     *
     * @return the expRegulateNo
     */
    public String getExpRegulateNo() {
        return expRegulateNo;
    }

    /**
     * Setter method for expRegulateNo.
     *
     * @param expRegulateNo Set for expRegulateNo
     */
    public void setExpRegulateNo(String expRegulateNo) {
        this.expRegulateNo = expRegulateNo;
    }

    /**
     * Getter method for expCustomerRegulateNo.
     *
     * @return the expCustomerRegulateNo
     */
    public String getExpCustomerRegulateNo() {
        return expCustomerRegulateNo;
    }

    /**
     * Setter method for expCustomerRegulateNo.
     *
     * @param expCustomerRegulateNo Set for expCustomerRegulateNo
     */
    public void setExpCustomerRegulateNo(String expCustomerRegulateNo) {
        this.expCustomerRegulateNo = expCustomerRegulateNo;
    }

}
