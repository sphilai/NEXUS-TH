/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author Chaiporn
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3003ResultItemDomain {
    
    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * <p>Item No</p>
     */
    @XmlElement(name = "itemNo")
    private String itemNo;
    
    /**
     * <p>Warehouse</p>
     */
    @XmlElement(name = "lgcyWhCd")
    private String lgcyWhCd;
    
    /**
     * <p>Legacy Plant Code</p>
     */
    @XmlElement(name = "plntCd")
    private String plntCd;
    
    /**
     * <p>Current sotck on hand Qty</p>
     */
    @XmlElement(name = "onHandQty")
    private String onHandQty;
    
    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Ws3003ResultItemDomain() {
        super();
    }

    /**
     * <p>Getter method for itemNo.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for lgcyWhCd.</p>
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * <p>Setter method for lgcyWhCd.</p>
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * <p>Getter method for plntCd.</p>
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * <p>Setter method for plntCd.</p>
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * <p>Getter method for onHandQty.</p>
     *
     * @return the onHandQty
     */
    public String getOnHandQty() {
        return onHandQty;
    }

    /**
     * <p>Setter method for onHandQty.</p>
     *
     * @param onHandQty Set for onHandQty
     */
    public void setOnHandQty(String onHandQty) {
        this.onHandQty = onHandQty;
    }

}
