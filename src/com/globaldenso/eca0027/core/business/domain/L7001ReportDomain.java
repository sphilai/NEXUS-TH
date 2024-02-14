/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L7001].
 * </br>帳票【L7001】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L7001ReportDomain extends AbstractDomain {
    
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /** Vessel Name */
    private String vesselName = null;
    /** Printed date */
    private String printedDate = null;
    /** Shipper */
    private String shipper = null;
    /** Port of Loading */
    private String portOfLoading = null;
    /** Port of Discharge */
    private String portOfDischarge = null;
    /** ATD */
    private String atd = null;
    /** ETA */
    private String eta = null;
    /** No. of Container */
    private String noOfContainer = null;
    /** Exporter */
    private String exporterNum = null;
    /** Exporter(List) */
    private String exporterNm = null;
    /** Importer */
    private String impoterNum = null;
    /** Importer(List) */
    private String impoterNm = null;
    /** No. of Invoice: */
    private String noOfInvoice = null;
    /** unit */
    private String unit = null;
    /** detailList */
    private List<? extends L7001ReportDetailDomain> detailList = null;
    
    /**
     * Default Constructor
     */
    public L7001ReportDomain() {
    }
    
    /**
     * Getter method for vesselName.
     *
     * @return the vesselName
     */
    public String getVesselName() {
        return vesselName;
    }
    /**
     * Setter method for vesselName.
     *
     * @param vesselName Set for vesselName
     */
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }
    /**
     * Getter method for printedDate.
     *
     * @return the printedDate
     */
    public String getPrintedDate() {
        return printedDate;
    }
    /**
     * Setter method for printedDate.
     *
     * @param printedDate Set for printedDate
     */
    public void setPrintedDate(String printedDate) {
        this.printedDate = printedDate;
    }
    /**
     * Getter method for shipper.
     *
     * @return the shipper
     */
    public String getShipper() {
        return shipper;
    }
    /**
     * Setter method for shipper.
     *
     * @param shipper Set for shipper
     */
    public void setShipper(String shipper) {
        this.shipper = shipper;
    }
    /**
     * Getter method for portOfLoading.
     *
     * @return the portOfLoading
     */
    public String getPortOfLoading() {
        return portOfLoading;
    }
    /**
     * Setter method for portOfLoading.
     *
     * @param portOfLoading Set for portOfLoading
     */
    public void setPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
    }
    /**
     * Getter method for portOfDischarge.
     *
     * @return the portOfDischarge
     */
    public String getPortOfDischarge() {
        return portOfDischarge;
    }
    /**
     * Setter method for portOfDischarge.
     *
     * @param portOfDischarge Set for portOfDischarge
     */
    public void setPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }
    /**
     * Getter method for atd.
     *
     * @return the atd
     */
    public String getAtd() {
        return atd;
    }
    /**
     * Setter method for atd.
     *
     * @param atd Set for atd
     */
    public void setAtd(String atd) {
        this.atd = atd;
    }
    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }
    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }
    /**
     * Getter method for noOfContainer.
     *
     * @return the noOfContainer
     */
    public String getNoOfContainer() {
        return noOfContainer;
    }
    /**
     * Setter method for noOfContainer.
     *
     * @param noOfContainer Set for noOfContainer
     */
    public void setNoOfContainer(String noOfContainer) {
        this.noOfContainer = noOfContainer;
    }
    /**
     * Getter method for exporterNum.
     *
     * @return the exporterNum
     */
    public String getExporterNum() {
        return exporterNum;
    }
    /**
     * Setter method for exporterNum.
     *
     * @param exporterNum Set for exporterNum
     */
    public void setExporterNum(String exporterNum) {
        this.exporterNum = exporterNum;
    }
    /**
     * Getter method for exporterNm.
     *
     * @return the exporterNm
     */
    public String getExporterNm() {
        return exporterNm;
    }
    /**
     * Setter method for exporterNm.
     *
     * @param exporterNm Set for exporterNm
     */
    public void setExporterNm(String exporterNm) {
        this.exporterNm = exporterNm;
    }
    /**
     * Getter method for impoterNum.
     *
     * @return the impoterNum
     */
    public String getImpoterNum() {
        return impoterNum;
    }
    /**
     * Setter method for impoterNum.
     *
     * @param impoterNum Set for impoterNum
     */
    public void setImpoterNum(String impoterNum) {
        this.impoterNum = impoterNum;
    }
    /**
     * Getter method for impoterNm.
     *
     * @return the impoterNm
     */
    public String getImpoterNm() {
        return impoterNm;
    }
    /**
     * Setter method for impoterNm.
     *
     * @param impoterNm Set for impoterNm
     */
    public void setImpoterNm(String impoterNm) {
        this.impoterNm = impoterNm;
    }
    /**
     * Getter method for noOfInvoice.
     *
     * @return the noOfInvoice
     */
    public String getNoOfInvoice() {
        return noOfInvoice;
    }
    /**
     * Setter method for noOfInvoice.
     *
     * @param noOfInvoice Set for noOfInvoice
     */
    public void setNoOfInvoice(String noOfInvoice) {
        this.noOfInvoice = noOfInvoice;
    }
    /**
     * Getter method for unit.
     *
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }
    /**
     * Setter method for unit.
     *
     * @param unit Set for unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<? extends L7001ReportDetailDomain> getDetailList() {
        return detailList;
    }
    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<? extends L7001ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }
    
}
