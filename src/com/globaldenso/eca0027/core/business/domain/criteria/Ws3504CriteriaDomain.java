/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * The domain of the result data of selecting update data for Ws3504.<BR>
 * </p>
 *
 * @version 1.00
 */
public class Ws3504CriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;
    
    /**
     * TR_NO
     */
    private String trNo;
    
    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * From W/H company Code
     */
    private String carryOutCompCd;

    /**
     * From W/H Code
     */
    private String carryOutWhCd;

    /**
     * To W/H Company Code
     */
    private String carryInCompCd;

    /**
     * To W/H Code
     */
    private String carryInWhCd;

    /**
     * Item No
     */
    private String itemNo;

    /**
     * PAKAGE CODE
     */
    private String pkgCd;
    
    /**
     * CARRY_OUT_QTY
     */
    private String carryOutQty;
   
    /**
     * CARRY_OUT_CASE_QTY
     */
    private String carryOutCaseQty;
    
    /**
     * Screen ID
     */
    private String screenId;
    
    /**
     * Item No. List
     */
    private List<Ws3504ItemListDomain> itemNoList;

    /**
     * Default Constructor.
     */
    public Ws3504CriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for dscId.
     * </p>
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>
     * Setter method for dscId.
     * </p>
     * 
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * Getter method for shipperCd.
     * </p>
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>
     * Setter method for shipperCd.
     * </p>
     * 
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }
    /**
     * <p>
     * Getter method for carryOutCompCd.
     * </p>
     * 
     * @return the carryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * <p>
     * Setter method for carryOutCompCd.
     * </p>
     * 
     * @param carryOutCompCd Set for carryOutCompCd
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }
    /**
     * <p>
     * Getter method for carryOutWhCd.
     * </p>
     * 
     * @return the carryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * <p>
     * Setter method for carryOutWhCd.
     * </p>
     * 
     * @param carryOutWhCd Set for carryOutWhCd
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }
    /**
     * <p>
     * Getter method for carryInCompCd.
     * </p>
     * 
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * <p>
     * Setter method for carryInCompCd.
     * </p>
     * 
     * @param carryInCompCd Set for carryInCompCd
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }
    /**
     * <p>
     * Getter method for carryInWhCd.
     * </p>
     * 
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * <p>
     * Setter method for carryInWhCd.
     * </p>
     * 
     * @param carryInWhCd Set for carryInWhCd
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
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

    /**
     * <p>
     * Getter method for screenId.
     * </p>
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * <p>
     * Setter method for screenId.
     * </p>
     * 
     * @param screenId Set for screenId
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }
    
    /**
     * <p>
     * Getter method for itemNoList.
     * </p>
     * 
     * @return the itemNoList
     */
    public List<Ws3504ItemListDomain> getItemNoList() {
        return itemNoList;
    }

    /**
     * <p>
     * Setter method for itemNoList.
     * </p>
     * 
     * @param itemNoList Set for itemNoList
     */
    public void setItemNoList(
        List<Ws3504ItemListDomain> itemNoList) {
        this.itemNoList = itemNoList;
    }

}
