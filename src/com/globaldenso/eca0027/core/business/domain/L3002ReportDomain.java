/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class for holding L3002 Header.
 *
 * @author TIS Tanaka,Chonthicha.A
 * @version 1.00
 */
public class L3002ReportDomain extends AbstractDomain {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_NM
     */
    private String compNm;

    
    /**
     * Carry Out Comp Cd
     */
    private String carryOutCompCd;

    /**
     * Carry Out WH Cd
     */
    private String carryOutWhCd;

    /**
     * Carry In Comp Cd
     */
    private String carryInCompCd;
    
    /**
     * Carry In WH Cd
     */
    private String carryInWhCd;
    
    /**
     * Shipper Cd
     */
    private String shipperCd;
    
    /**
     * Item Np
     */
    private String itemNo;
    
    /**
     * Package Cd
     */
    private String pkgCd;
    
    /**
     * Print date.
     */
    private String printDt;

    /**
     * Server ID.
     */
    private String serverId;

    /**
     * Detail domain list.
     */
    private List<? extends L3002ReportDetailDomain> detailDomainList;

    /**
     * Default Constructor
     */
    public L3002ReportDomain() {
    }

    /**
     * <p>Getter method for compNm.</p>
     *
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * <p>Setter method for compNm.</p>
     *
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * <p>Getter method for carryOutCompCd.</p>
     *
     * @return the carryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * <p>Setter method for carryOutCompCd.</p>
     *
     * @param carryOutCompCd Set for carryOutCompCd
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }

    /**
     * <p>Getter method for carryOutWhCd.</p>
     *
     * @return the carryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * <p>Setter method for carryOutWhCd.</p>
     *
     * @param carryOutWhCd Set for carryOutWhCd
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }

    /**
     * <p>Getter method for carryInCompCd.</p>
     *
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * <p>Setter method for carryInCompCd.</p>
     *
     * @param carryInCompCd Set for carryInCompCd
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }

    /**
     * <p>Getter method for carryInWhCd.</p>
     *
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * <p>Setter method for carryInWhCd.</p>
     *
     * @param carryInWhCd Set for carryInWhCd
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
    }

    /**
     * <p>Getter method for shipperCd.</p>
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>Setter method for shipperCd.</p>
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
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
     * <p>Getter method for pkgCd.</p>
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * <p>Setter method for pkgCd.</p>
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * <p>Getter method for printDt.</p>
     *
     * @return the printDt
     */
    public String getPrintDt() {
        return printDt;
    }

    /**
     * <p>Setter method for printDt.</p>
     *
     * @param printDt Set for printDt
     */
    public void setPrintDt(String printDt) {
        this.printDt = printDt;
    }

    /**
     * <p>Getter method for serverId.</p>
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>Setter method for serverId.</p>
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>Getter method for detailDomainList.</p>
     *
     * @return the detailDomainList
     */
    public List<? extends L3002ReportDetailDomain> getDetailDomainList() {
        return detailDomainList;
    }

    /**
     * <p>Setter method for detailDomainList.</p>
     *
     * @param detailDomainList Set for detailDomainList
     */
    public void setDetailDomainList(
        List<? extends L3002ReportDetailDomain> detailDomainList) {
        this.detailDomainList = detailDomainList;
    }

}
