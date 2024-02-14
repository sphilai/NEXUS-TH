/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;


/**
 * F7007CLP domain of using it by Transfer to GINV Job.
 * <br />船積書類GINV送信ジョブで使用するF7007CLPドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13201 $
 */
public class T0400F7007ClpDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * TRANSPORT NAME
     */
    private String trnsNm;

    /**
     * VESSEL
     */
    private String vessel;

    /**
     * ATD
     */
    private String atd;

    /**
     * ETA
     */
    private String eta;

    /**
     * LOADING PORT CODE (POL)
     */
    private String loadingPortCd;

    /**
     * DISCHARGE PORT CODE (POD)
     */
    private String dischargePortCd;

    /**
     * CARRIER COMP NAME
     */
    private String carrierCompNmAbb;

    /**
     * NO OF CONTAINER IN VESSEL
     */
    private Integer noOfContainerInVessel;

    /**
     * CONTAINER LOOSE TYPE
     */
    private String containerLooseTyp;

    /**
     * CONTAINER NO
     */
    private String containerNo;

    /**
     * TRANS TYP NAME
     */
    private String trnsTypNm;

    /**
     * LOAD EFF.
     */
    private BigDecimal loadingRatio;

    /**
     * NO OF BL IN VESSEL
     */
    private Integer noOfBlInVessel;

    /**
     * BL NO
     */
    private String billdNo;

    /**
     * FREIGHT RESPONSIBLE CD
     */
    private String freightResponsibleCd;

    /**
     * SHIPPER COM NAME
     */
    private String shipperCompNmAbb;

    /**
     * SHIP TO COM NAME
     */
    private String shipToCompNmAbb;

    /**
     * SHIP TO NAME
     */
    private String shipToNmAbb;

    /**
     * CONSIGNEE COM NAME
     */
    private String consigneeCompNmAbb;

    /**
     * NO OF INVOICE IN VESSEL
     */
    private Integer noOfInvoiceInVessel;

    /**
     * NO OF INVOICE IN SHIPPER
     */
    private Integer noOfInvoiceInShipper;

    /**
     * INV NO
     */
    private String invoiceNo;

    /**
     * INV CLASS 
     */
    private String invoiceClass;

    /**
     * NO OF FRT INV IN MAIN INV
     */
    private Integer noOfFrtInvInMainInv;

    /**
     * NO OF CML IN INV
     */
    private Integer noOfCmlInInv;

    /**
     * TOTAL GROSS WEIGHT PER BL
     */
    private BigDecimal totalGrossWeightPerBl;

    /**
     * TOTAL GROSS WEIGHT PER CONTAINER
     */
    private BigDecimal totalGrossWeightPerCtnr;

    /**
     * TOTAL GROSS WEIGHT PER INV
     */
    private BigDecimal totalGrossWeightPerInv;

    /**
     * UNIT OF WEIGHT
     */
    private String weightUnitDisp;

    /**
     * TOTAL VOL OF BL
     */
    private BigDecimal totalVolumeOfBl;

    /**
     * TOTAL VOL OF CONTAINER
     */
    private BigDecimal totalVolumeOfContainer;

    /**
     * TOTAL VOL OF INV
     */
    private BigDecimal totalVolumeOfInv;

    /**
     * UNIT OF VOL
     */
    private String volumeUnitDisp;

    /**
     * XMAIN MARK
     */
    private String xmainMark;

    /**
     * MAIN MARK
     */
    private String mainMark;

    /**
     * MIX TAG NO
     */
    private String mixTagNo;

    /**
     * CUSTOMER ITEM NO
     */
    private String customerItemNo;

    /**
     * PLTZ ITEM NO
     */
    private String pltzItemNo;

    /**
     * QTY
     */
    private Integer qty;

    /**
     * UNIT OF QTY
     */
    private String qtyUnitDisp;

    /**
     * CML GROSS WEIGHT
     */
    private BigDecimal pltzGrossWeight;

    /**
     * CML VOL
     */
    private BigDecimal pltzVolume;

    /**
     * PKG FORM TYP
     */
    private String pkgFormTyp;

    /**
     * RETURN STYLE CODE
     */
    private String returnStyleCd;

    /**
     * NO OF CML IN CONTAINER
     */
    private Integer noOfCmlInContainer;

    /**
     * NO OF CML IN BL
     */
    private Integer noOfCmlInBl;

    /**
     * CONTAINER SORTING KEY
     */
    private String containerSortingKey;

    /**
     * SITE TYP
     */
    private String siteTyp;

    /**
     * PACKAGE TYPE
     */
    private String palletCartonTyp;

    /**
     * MAIN INVOICE NO OF FRT
     */
    private String parInvoiceNo;

    /**
     * REGISTER DT (UTC)
     */
    private String registerDt;

    /**
     * INVOICE WEIGHT UNIT
     */
    private String invoiceWeightUnit;

    /**
     * INVOICE VOLUME UNIT
     */
    private String invoiceVolumeUnit;

    /**
     * CONTAINER WEIGHT UNIT
     */
    private String containerWeightUnit;

    /**
     * CONTAINER VOLUME UNIT
     */
    private String containerVolumeUnit;

    /**
     * PLTZ WEIGHT UNIT
     */
    private String pltzWeightUnit;

    /**
     * PLTZ VOLUME UNIT
     */
    private String pltzVolumeUnit;

    /**
     * constructor
     * <br />コンストラクタです。
     *
     */
    public T0400F7007ClpDomain() {
    }

    /**
     * Getter method for trnsNm.
     *
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * Setter method for trnsNm.
     *
     * @param trnsNm Set for trnsNm
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
    }

    /**
     * Getter method for vessel.
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * Setter method for vessel.
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
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
     * Getter method for loadingPortCd.
     *
     * @return the loadingPortCd
     */
    public String getLoadingPortCd() {
        return loadingPortCd;
    }

    /**
     * Setter method for loadingPortCd.
     *
     * @param loadingPortCd Set for loadingPortCd
     */
    public void setLoadingPortCd(String loadingPortCd) {
        this.loadingPortCd = loadingPortCd;
    }

    /**
     * Getter method for dischargePortCd.
     *
     * @return the dischargePortCd
     */
    public String getDischargePortCd() {
        return dischargePortCd;
    }

    /**
     * Setter method for dischargePortCd.
     *
     * @param dischargePortCd Set for dischargePortCd
     */
    public void setDischargePortCd(String dischargePortCd) {
        this.dischargePortCd = dischargePortCd;
    }

    /**
     * Getter method for carrierCompNmAbb.
     *
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }

    /**
     * Setter method for carrierCompNmAbb.
     *
     * @param carrierCompNmAbb Set for carrierCompNmAbb
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
    }

    /**
     * Getter method for noOfContainerInVessel.
     *
     * @return the noOfContainerInVessel
     */
    public Integer getNoOfContainerInVessel() {
        return noOfContainerInVessel;
    }

    /**
     * Setter method for noOfContainerInVessel.
     *
     * @param noOfContainerInVessel Set for noOfContainerInVessel
     */
    public void setNoOfContainerInVessel(Integer noOfContainerInVessel) {
        this.noOfContainerInVessel = noOfContainerInVessel;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for containerNo.
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo.
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for trnsTypNm.
     *
     * @return the trnsTypNm
     */
    public String getTrnsTypNm() {
        return trnsTypNm;
    }

    /**
     * Setter method for trnsTypNm.
     *
     * @param trnsTypNm Set for trnsTypNm
     */
    public void setTrnsTypNm(String trnsTypNm) {
        this.trnsTypNm = trnsTypNm;
    }

    /**
     * Getter method for loadingRatio.
     *
     * @return the loadingRatio
     */
    public BigDecimal getLoadingRatio() {
        return loadingRatio;
    }

    /**
     * Setter method for loadingRatio.
     *
     * @param loadingRatio Set for loadingRatio
     */
    public void setLoadingRatio(BigDecimal loadingRatio) {
        this.loadingRatio = loadingRatio;
    }

    /**
     * Getter method for noOfBlInVessel.
     *
     * @return the noOfBlInVessel
     */
    public Integer getNoOfBlInVessel() {
        return noOfBlInVessel;
    }

    /**
     * Setter method for noOfBlInVessel.
     *
     * @param noOfBlInVessel Set for noOfBlInVessel
     */
    public void setNoOfBlInVessel(Integer noOfBlInVessel) {
        this.noOfBlInVessel = noOfBlInVessel;
    }

    /**
     * Getter method for billdNo.
     *
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * Setter method for billdNo.
     *
     * @param billdNo Set for billdNo
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * Getter method for shipperCompNmAbb.
     *
     * @return the shipperCompNmAbb
     */
    public String getShipperCompNmAbb() {
        return shipperCompNmAbb;
    }

    /**
     * Setter method for shipperCompNmAbb.
     *
     * @param shipperCompNmAbb Set for shipperCompNmAbb
     */
    public void setShipperCompNmAbb(String shipperCompNmAbb) {
        this.shipperCompNmAbb = shipperCompNmAbb;
    }

    /**
     * Getter method for shipToCompNmAbb.
     *
     * @return the shipToCompNmAbb
     */
    public String getShipToCompNmAbb() {
        return shipToCompNmAbb;
    }

    /**
     * Setter method for shipToCompNmAbb.
     *
     * @param shipToCompNmAbb Set for shipToCompNmAbb
     */
    public void setShipToCompNmAbb(String shipToCompNmAbb) {
        this.shipToCompNmAbb = shipToCompNmAbb;
    }

    /**
     * Getter method for shipToNmAbb.
     *
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * Setter method for shipToNmAbb.
     *
     * @param shipToNmAbb Set for shipToNmAbb
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }

    /**
     * Getter method for consigneeCompNmAbb.
     *
     * @return the consigneeCompNmAbb
     */
    public String getConsigneeCompNmAbb() {
        return consigneeCompNmAbb;
    }

    /**
     * Setter method for consigneeCompNmAbb.
     *
     * @param consigneeCompNmAbb Set for consigneeCompNmAbb
     */
    public void setConsigneeCompNmAbb(String consigneeCompNmAbb) {
        this.consigneeCompNmAbb = consigneeCompNmAbb;
    }

    /**
     * Getter method for noOfInvoiceInVessel.
     *
     * @return the noOfInvoiceInVessel
     */
    public Integer getNoOfInvoiceInVessel() {
        return noOfInvoiceInVessel;
    }

    /**
     * Setter method for noOfInvoiceInVessel.
     *
     * @param noOfInvoiceInVessel Set for noOfInvoiceInVessel
     */
    public void setNoOfInvoiceInVessel(Integer noOfInvoiceInVessel) {
        this.noOfInvoiceInVessel = noOfInvoiceInVessel;
    }

    /**
     * Getter method for noOfInvoiceInShipper.
     *
     * @return the noOfInvoiceInShipper
     */
    public Integer getNoOfInvoiceInShipper() {
        return noOfInvoiceInShipper;
    }

    /**
     * Setter method for noOfInvoiceInShipper.
     *
     * @param noOfInvoiceInShipper Set for noOfInvoiceInShipper
     */
    public void setNoOfInvoiceInShipper(Integer noOfInvoiceInShipper) {
        this.noOfInvoiceInShipper = noOfInvoiceInShipper;
    }

    /**
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for invoiceClass.
     *
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Setter method for invoiceClass.
     *
     * @param invoiceClass Set for invoiceClass
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * Getter method for noOfFrtInvInMainInv.
     *
     * @return the noOfFrtInvInMainInv
     */
    public Integer getNoOfFrtInvInMainInv() {
        return noOfFrtInvInMainInv;
    }

    /**
     * Setter method for noOfFrtInvInMainInv.
     *
     * @param noOfFrtInvInMainInv Set for noOfFrtInvInMainInv
     */
    public void setNoOfFrtInvInMainInv(Integer noOfFrtInvInMainInv) {
        this.noOfFrtInvInMainInv = noOfFrtInvInMainInv;
    }

    /**
     * Getter method for noOfCmlInInv.
     *
     * @return the noOfCmlInInv
     */
    public Integer getNoOfCmlInInv() {
        return noOfCmlInInv;
    }

    /**
     * Setter method for noOfCmlInInv.
     *
     * @param noOfCmlInInv Set for noOfCmlInInv
     */
    public void setNoOfCmlInInv(Integer noOfCmlInInv) {
        this.noOfCmlInInv = noOfCmlInInv;
    }

    /**
     * Getter method for totalGrossWeightPerBl.
     *
     * @return the totalGrossWeightPerBl
     */
    public BigDecimal getTotalGrossWeightPerBl() {
        return totalGrossWeightPerBl;
    }

    /**
     * Setter method for totalGrossWeightPerBl.
     *
     * @param totalGrossWeightPerBl Set for totalGrossWeightPerBl
     */
    public void setTotalGrossWeightPerBl(BigDecimal totalGrossWeightPerBl) {
        this.totalGrossWeightPerBl = totalGrossWeightPerBl;
    }

    /**
     * Getter method for totalGrossWeightPerCtnr.
     *
     * @return the totalGrossWeightPerCtnr
     */
    public BigDecimal getTotalGrossWeightPerCtnr() {
        return totalGrossWeightPerCtnr;
    }

    /**
     * Setter method for totalGrossWeightPerCtnr.
     *
     * @param totalGrossWeightPerCtnr Set for totalGrossWeightPerCtnr
     */
    public void setTotalGrossWeightPerCtnr(BigDecimal totalGrossWeightPerCtnr) {
        this.totalGrossWeightPerCtnr = totalGrossWeightPerCtnr;
    }

    /**
     * Getter method for totalGrossWeightPerInv.
     *
     * @return the totalGrossWeightPerInv
     */
    public BigDecimal getTotalGrossWeightPerInv() {
        return totalGrossWeightPerInv;
    }

    /**
     * Setter method for totalGrossWeightPerInv.
     *
     * @param totalGrossWeightPerInv Set for totalGrossWeightPerInv
     */
    public void setTotalGrossWeightPerInv(BigDecimal totalGrossWeightPerInv) {
        this.totalGrossWeightPerInv = totalGrossWeightPerInv;
    }

    /**
     * Getter method for weightUnitDisp.
     *
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * Setter method for weightUnitDisp.
     *
     * @param weightUnitDisp Set for weightUnitDisp
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

    /**
     * Getter method for totalVolumeOfBl.
     *
     * @return the totalVolumeOfBl
     */
    public BigDecimal getTotalVolumeOfBl() {
        return totalVolumeOfBl;
    }

    /**
     * Setter method for totalVolumeOfBl.
     *
     * @param totalVolumeOfBl Set for totalVolumeOfBl
     */
    public void setTotalVolumeOfBl(BigDecimal totalVolumeOfBl) {
        this.totalVolumeOfBl = totalVolumeOfBl;
    }

    /**
     * Getter method for totalVolumeOfContainer.
     *
     * @return the totalVolumeOfContainer
     */
    public BigDecimal getTotalVolumeOfContainer() {
        return totalVolumeOfContainer;
    }

    /**
     * Setter method for totalVolumeOfContainer.
     *
     * @param totalVolumeOfContainer Set for totalVolumeOfContainer
     */
    public void setTotalVolumeOfContainer(BigDecimal totalVolumeOfContainer) {
        this.totalVolumeOfContainer = totalVolumeOfContainer;
    }

    /**
     * Getter method for totalVolumeOfInv.
     *
     * @return the totalVolumeOfInv
     */
    public BigDecimal getTotalVolumeOfInv() {
        return totalVolumeOfInv;
    }

    /**
     * Setter method for totalVolumeOfInv.
     *
     * @param totalVolumeOfInv Set for totalVolumeOfInv
     */
    public void setTotalVolumeOfInv(BigDecimal totalVolumeOfInv) {
        this.totalVolumeOfInv = totalVolumeOfInv;
    }

    /**
     * Getter method for volumeUnitDisp.
     *
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * Setter method for volumeUnitDisp.
     *
     * @param volumeUnitDisp Set for volumeUnitDisp
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
    }

    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
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
     * Getter method for qty.
     *
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * Getter method for qtyUnitDisp.
     *
     * @return the qtyUnitDisp
     */
    public String getQtyUnitDisp() {
        return qtyUnitDisp;
    }

    /**
     * Setter method for qtyUnitDisp.
     *
     * @param qtyUnitDisp Set for qtyUnitDisp
     */
    public void setQtyUnitDisp(String qtyUnitDisp) {
        this.qtyUnitDisp = qtyUnitDisp;
    }

    /**
     * Getter method for pltzGrossWeight.
     *
     * @return the pltzGrossWeight
     */
    public BigDecimal getPltzGrossWeight() {
        return pltzGrossWeight;
    }

    /**
     * Setter method for pltzGrossWeight.
     *
     * @param pltzGrossWeight Set for pltzGrossWeight
     */
    public void setPltzGrossWeight(BigDecimal pltzGrossWeight) {
        this.pltzGrossWeight = pltzGrossWeight;
    }

    /**
     * Getter method for pltzVolume.
     *
     * @return the pltzVolume
     */
    public BigDecimal getPltzVolume() {
        return pltzVolume;
    }

    /**
     * Setter method for pltzVolume.
     *
     * @param pltzVolume Set for pltzVolume
     */
    public void setPltzVolume(BigDecimal pltzVolume) {
        this.pltzVolume = pltzVolume;
    }

    /**
     * Getter method for pkgFormTyp.
     *
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * Setter method for pkgFormTyp.
     *
     * @param pkgFormTyp Set for pkgFormTyp
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * Getter method for returnStyleCd.
     *
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * Setter method for returnStyleCd.
     *
     * @param returnStyleCd Set for returnStyleCd
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * Getter method for noOfCmlInContainer.
     *
     * @return the noOfCmlInContainer
     */
    public Integer getNoOfCmlInContainer() {
        return noOfCmlInContainer;
    }

    /**
     * Setter method for noOfCmlInContainer.
     *
     * @param noOfCmlInContainer Set for noOfCmlInContainer
     */
    public void setNoOfCmlInContainer(Integer noOfCmlInContainer) {
        this.noOfCmlInContainer = noOfCmlInContainer;
    }

    /**
     * Getter method for noOfCmlInBl.
     *
     * @return the noOfCmlInBl
     */
    public Integer getNoOfCmlInBl() {
        return noOfCmlInBl;
    }

    /**
     * Setter method for noOfCmlInBl.
     *
     * @param noOfCmlInBl Set for noOfCmlInBl
     */
    public void setNoOfCmlInBl(Integer noOfCmlInBl) {
        this.noOfCmlInBl = noOfCmlInBl;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for siteTyp.
     *
     * @return the siteTyp
     */
    public String getSiteTyp() {
        return siteTyp;
    }

    /**
     * Setter method for siteTyp.
     *
     * @param siteTyp Set for siteTyp
     */
    public void setSiteTyp(String siteTyp) {
        this.siteTyp = siteTyp;
    }

    /**
     * Getter method for palletCartonTyp.
     *
     * @return the palletCartonTyp
     */
    public String getPalletCartonTyp() {
        return palletCartonTyp;
    }

    /**
     * Setter method for palletCartonTyp.
     *
     * @param palletCartonTyp Set for palletCartonTyp
     */
    public void setPalletCartonTyp(String palletCartonTyp) {
        this.palletCartonTyp = palletCartonTyp;
    }

    /**
     * Getter method for parInvoiceNo.
     *
     * @return the parInvoiceNo
     */
    public String getParInvoiceNo() {
        return parInvoiceNo;
    }

    /**
     * Setter method for parInvoiceNo.
     *
     * @param parInvoiceNo Set for parInvoiceNo
     */
    public void setParInvoiceNo(String parInvoiceNo) {
        this.parInvoiceNo = parInvoiceNo;
    }

    /**
     * Getter method for registerDt.
     *
     * @return the registerDt
     */
    public String getRegisterDt() {
        return registerDt;
    }

    /**
     * Setter method for registerDt.
     *
     * @param registerDt Set for registerDt
     */
    public void setRegisterDt(String registerDt) {
        this.registerDt = registerDt;
    }

    /**
     * Getter method for invoiceWeightUnit.
     *
     * @return the invoiceWeightUnit
     */
    public String getInvoiceWeightUnit() {
        return invoiceWeightUnit;
    }

    /**
     * Setter method for invoiceWeightUnit.
     *
     * @param invoiceWeightUnit Set for invoiceWeightUnit
     */
    public void setInvoiceWeightUnit(String invoiceWeightUnit) {
        this.invoiceWeightUnit = invoiceWeightUnit;
    }

    /**
     * Getter method for invoiceVolumeUnit.
     *
     * @return the invoiceVolumeUnit
     */
    public String getInvoiceVolumeUnit() {
        return invoiceVolumeUnit;
    }

    /**
     * Setter method for invoiceVolumeUnit.
     *
     * @param invoiceVolumeUnit Set for invoiceVolumeUnit
     */
    public void setInvoiceVolumeUnit(String invoiceVolumeUnit) {
        this.invoiceVolumeUnit = invoiceVolumeUnit;
    }

    /**
     * Getter method for containerWeightUnit.
     *
     * @return the containerWeightUnit
     */
    public String getContainerWeightUnit() {
        return containerWeightUnit;
    }

    /**
     * Setter method for containerWeightUnit.
     *
     * @param containerWeightUnit Set for containerWeightUnit
     */
    public void setContainerWeightUnit(String containerWeightUnit) {
        this.containerWeightUnit = containerWeightUnit;
    }

    /**
     * Getter method for containerVolumeUnit.
     *
     * @return the containerVolumeUnit
     */
    public String getContainerVolumeUnit() {
        return containerVolumeUnit;
    }

    /**
     * Setter method for containerVolumeUnit.
     *
     * @param containerVolumeUnit Set for containerVolumeUnit
     */
    public void setContainerVolumeUnit(String containerVolumeUnit) {
        this.containerVolumeUnit = containerVolumeUnit;
    }

    /**
     * Getter method for pltzWeightUnit.
     *
     * @return the pltzWeightUnit
     */
    public String getPltzWeightUnit() {
        return pltzWeightUnit;
    }

    /**
     * Setter method for pltzWeightUnit.
     *
     * @param pltzWeightUnit Set for pltzWeightUnit
     */
    public void setPltzWeightUnit(String pltzWeightUnit) {
        this.pltzWeightUnit = pltzWeightUnit;
    }

    /**
     * Getter method for pltzVolumeUnit.
     *
     * @return the pltzVolumeUnit
     */
    public String getPltzVolumeUnit() {
        return pltzVolumeUnit;
    }

    /**
     * Setter method for pltzVolumeUnit.
     *
     * @param pltzVolumeUnit Set for pltzVolumeUnit
     */
    public void setPltzVolumeUnit(String pltzVolumeUnit) {
        this.pltzVolumeUnit = pltzVolumeUnit;
    }

}
