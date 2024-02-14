/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

/**
 * <p>
 * The domain of the result data of Ws3501. (by Item No)<BR>
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3501ItemNoListItemDomain implements Serializable {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * TR No (not output in XML)
     */
    @XmlTransient
    private String trNo;
    
    /**
     * itemNo
     */
    private String itemNo;

    /**
     * pkgCd
     */
    private String pkgCd;

    /**
     * carryOutQty
     */
    private String carryOutQty;

    /**
     * carryOutCaseQty
     */
    private String carryOutCaseQty;
    
    /**
     * Default Constructor.
     */
    public Ws3501ItemNoListItemDomain() {
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }
    
    /**
     * <p>
     * Getter method for itemNo.
     * </p>
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>
     * Setter method for itemNo.
     * </p>
     * 
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>
     * Getter method for pkgCd.
     * </p>
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * <p>
     * Setter method for pkgCd.
     * </p>
     * 
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * <p>
     * Getter method for carryOutQty.
     * </p>
     * 
     * @return the carryOutQty
     */
    public String getCarryOutQty() {
        return carryOutQty;
    }

    /**
     * <p>
     * Setter method for carryOutQty.
     * </p>
     * 
     * @param carryOutQty Set for carryOutQty
     */
    public void setCarryOutQty(String carryOutQty) {
        this.carryOutQty = carryOutQty;
    }

    /**
     * <p>
     * Getter method for carryOutCaseQty.
     * </p>
     * 
     * @return the carryOutCaseQty
     */
    public String getCarryOutCaseQty() {
        return carryOutCaseQty;
    }

    /**
     * <p>
     * Setter method for carryOutCaseQty.
     * </p>
     * 
     * @param carryOutCaseQty Set for carryOutCaseQty
     */
    public void setCarryOutCaseQty(String carryOutCaseQty) {
        this.carryOutCaseQty = carryOutCaseQty;
    }
}