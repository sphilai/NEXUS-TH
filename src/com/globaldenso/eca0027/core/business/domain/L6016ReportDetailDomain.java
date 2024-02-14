/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L6016].
 * <br/>帳票【L6016】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L6016ReportDetailDomain extends AbstractDomain {

    /** serial version */
    private static final long serialVersionUID = 1L;
    /** pos */
    private String pos = null;
    /** customerPartNo */
    private String customerItemNo = null;
    /** description */
    private String itemDescription = null;
    /** unitDispQty */
    private String unitDispQty = null;
    /** qty */
    private String qty = null;

    /**
     * Default Constructor
     */
    public L6016ReportDetailDomain() {
    }

    /**
     * Getter method of pos.
     *
     * @return the pos.
     */
    public String getPos() {
        return pos;
    }

    /**
     * Setter method of pos.
     *
     * @param pos Value to be stored in pos.
     */
    public void setPos(String pos) {
        this.pos = pos;
    }

    /**
     * Getter method of customerItemNo.
     *
     * @return the customerItemNo.
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * Setter method of customerItemNo.
     *
     * @param customerItemNo Value to be stored in customerItemNo.
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * Getter method of itemDescription.
     *
     * @return the itemDescription.
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Setter method of itemDescription.
     *
     * @param itemDescription Value to be stored in itemDescription.
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Getter method of unitDispQty.
     *
     * @return the unitDispQty.
     */
    public String getUnitDispQty() {
        return unitDispQty;
    }

    /**
     * Setter method of unitDispQty.
     *
     * @param unitDispQty Value to be stored in unitDispQty.
     */
    public void setUnitDispQty(String unitDispQty) {
        this.unitDispQty = unitDispQty;
    }

    /**
     * Getter method of qty.
     *
     * @return the qty.
     */
    public String getQty() {
        return qty;
    }

    /**
     * Setter method of qty.
     *
     * @param qty Value to be stored in qty.
     */
    public void setQty(String qty) {
        this.qty = qty;
    }
}
