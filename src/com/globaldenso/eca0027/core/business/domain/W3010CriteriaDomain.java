/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain class that holds the criteria of Receive CML Transfer
 * Report.
 *
 * @author SNT Ri
 * @version 1.00
 */
public class W3010CriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TR_NO
     */
    private String trNo;

    /**
     * dateFormat (for Display)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator object
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Fr) W/H Com CD
     */
    private String carryOutCompCd;
    
    /**
     * Fr) W/H CD
     */
    private String carryOutWhCd;

    /**
     * To) W/H Com CD
     */
    private String carryInCompCd;

    /**
     * To) W/H CD
     */
    private String carryInWhCd;

    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * Status
     */
    private String trStatus;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;

    /**
     * constructor functon
     */
    public W3010CriteriaDomain() {
    }

    /**
     * Getter method for trNo.
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * Setter method for trNo.
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>Getter method for screenDateFormat.</p>
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * <p>Setter method for screenDateFormat.</p>
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }
    
    /**
     * Getter method for pageInfoCreator.
     * 
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
    /**
     * <p>Setter method for pageInfoCreator.</p>
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
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
     * Getter method for trStatus.
     * </p>
     * 
     * @return the trStatus
     */
    public String getTrStatus() {
        return trStatus;
    }

    /**
     * <p>
     * Setter method for trStatus.
     * </p>
     * 
     * @param trStatus Set for trStatus
     */
    public void setTrStatus(String trStatus) {
        this.trStatus = trStatus;
    }

    /**
     * 
     * <p>Getter method for weightUnitDisp.</p>
     *
     * @return weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * 
     * <p>Setter method for weightUnitDisp.</p>
     *
     * @param weightUnitDisp unit for Gross Weight
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

}
