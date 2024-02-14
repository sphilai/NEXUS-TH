/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/** 
 * The domain class that holds the information of the document [L9008].
 * </br>帳票【L9008】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L9008ReportDomain extends AbstractDomain {
    /** 
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /** shipperTaxIdNo */
    private String shipperTaxIdNo = null;
    /** shipperCompAddrInv */
    private String shipperCompAddrInv = null;
    /** shipperCompTel */
    private String shipperCompTel = null;
    /** shipperCompFax */
    private String shipperCompFax = null;
    /** consigneeCompNmInv1 */
    private String consigneeCompNmInv1 = null;
    /** consigneeCompAddrInv1 */
    private String consigneeCompAddrInv1 = null;
    /** consigneeCompAddrInv2 */
    private String consigneeCompAddrInv2 = null;
    /** consigneeAttn */
    private String consigneeAttn = null;
    /** shipToNmInv1 */
    private String shipToNmInv1 = null;
    /** shipToAddrInv1 */
    private String shipToAddrInv1 = null;
    /** shipToAddrInv2 */
    private String shipToAddrInv2 = null;
    /** shipToCompNmAbb */
    private String shipToCompNmAbb = null;
    /** documentsType */
    private String documentsType = null;
    /** invoiceNo */
    private String invoiceNo = null;
    /** reInvoiceNo1 */
    private String reInvoiceNo1 = null;
    /** reInvoiceNo2 */
    private String reInvoiceNo2 = null;
    /** invoiceCategoryNm */
    private String invoiceCategoryNm = null;
    /** issuedDate */
    private String issuedDate = null;
    /** shippedDate */
    private String shippedDate = null;
    /** etd */
    private String etd = null;
    /** eta */
    private String eta = null;
    /** trnsWayNm */
    private String trnsWayNm = null;
    /** loadingPortNm */
    private String loadingPortNm = null;
    /** dischargePortNm */
    private String dischargePortNm = null;
    /** deliveryPoint */
    private String deliveryPoint = null;
    /** carrierCompNmAbb */
    private String carrierCompNmAbb = null;
    /** vessel */
    private String vessel = null;
    /** bookingNo */
    private String bookingNo = null;
    /** containerNo */
    private String containerNo = null;
    /** priceTermNm */
    private String priceTermNm = null;
    /** costTotalInvoiceAmount */
    private String costTotalInvoiceAmount = null;
    /** compNmInv1 */
    private String compNmInv1 = null;
    /** totalInvoiceAmountCurrCd */
    private String totalInvoiceAmountCurrCd = null;
    /** master11 */
    private String master11 = null;
    /** consigneeCompNmInv2 */
    private String consigneeCompNmInv2 = null;
    /** consigneeCompAddrInv3 */
    private String consigneeCompAddrInv3 = null;
    /** consigneeCompAddrInv4 */
    private String consigneeCompAddrInv4 = null;
    /** shipToNmInv2 */
    private String shipToNmInv2 = null;
    /** shipToAddrInv3 */
    private String shipToAddrInv3 = null;
    /** shipToAddrInv4 */
    private String shipToAddrInv4 = null;
    /** totalQty1 */
    private String totalQty1 = null;
    /** totalQty2 */
    private String totalQty2 = null;
    /** totalQty3 */
    private String totalQty3 = null;
    /** totalWeight */
    private String totalWeight = null;
    /** master3 */
    private String master3 = null;
    /** master7 */
    private String master7 = null;
    /** master8 */
    private String master8 = null;
    /** compNmInv2 */
    private String compNmInv2 = null;
    /** master2 */
    private String master2 = null;
    /** totalWeightUnit */
    private String totalWeightUnit = null;
    /** totalQty1Unit */
    private String totalQty1Unit = null;
    /** totalQty2Unit */
    private String totalQty2Unit = null;
    /** totalQty3Unit */
    private String totalQty3Unit = null;
    /** consigneeBlockName */
    private String consigneeBlockName = null;
    /** fileData1 */
    private InputStream fileData1 = null;
    /** fileData12 */
    private InputStream fileData12 = null;
    /** fileData13 */
    private InputStream fileData13 = null;
    /** fileData9 */
    private InputStream fileData9 = null;

    /**
     * Default Constructor
     */
    public L9008ReportDomain() {
    }

    /**
     * Getter method for shipperTaxIdNo
     *
     * @return the shipperTaxIdNo
     */
    public String getShipperTaxIdNo() {
        return shipperTaxIdNo;
    }
    /**
     * Setter method for shipperTaxIdNo
     *
     * @param shipperTaxIdNo Set for shipperTaxIdNo
     */
    public void setShipperTaxIdNo(String shipperTaxIdNo) {
        this.shipperTaxIdNo = shipperTaxIdNo;
    }
    /**
     * Getter method for shipperCompAddrInv
     *
     * @return the shipperCompAddrInv
     */
    public String getShipperCompAddrInv() {
        return shipperCompAddrInv;
    }
    /**
     * Setter method for shipperCompAddrInv
     *
     * @param shipperCompAddrInv Set for shipperCompAddrInv
     */
    public void setShipperCompAddrInv(String shipperCompAddrInv) {
        this.shipperCompAddrInv = shipperCompAddrInv;
    }
    /**
     * Getter method for shipperCompTel
     *
     * @return the shipperCompTel
     */
    public String getShipperCompTel() {
        return shipperCompTel;
    }
    /**
     * Setter method for shipperCompTel
     *
     * @param shipperCompTel Set for shipperCompTel
     */
    public void setShipperCompTel(String shipperCompTel) {
        this.shipperCompTel = shipperCompTel;
    }
    /**
     * Getter method for shipperCompFax
     *
     * @return the shipperCompFax
     */
    public String getShipperCompFax() {
        return shipperCompFax;
    }
    /**
     * Setter method for shipperCompFax
     *
     * @param shipperCompFax Set for shipperCompFax
     */
    public void setShipperCompFax(String shipperCompFax) {
        this.shipperCompFax = shipperCompFax;
    }
    /**
     * Getter method for consigneeCompNmInv1
     *
     * @return the consigneeCompNmInv1
     */
    public String getConsigneeCompNmInv1() {
        return consigneeCompNmInv1;
    }
    /**
     * Setter method for consigneeCompNmInv1
     *
     * @param consigneeCompNmInv1 Set for consigneeCompNmInv1
     */
    public void setConsigneeCompNmInv1(String consigneeCompNmInv1) {
        this.consigneeCompNmInv1 = consigneeCompNmInv1;
    }
    /**
     * Getter method for consigneeCompAddrInv1
     *
     * @return the consigneeCompAddrInv1
     */
    public String getConsigneeCompAddrInv1() {
        return consigneeCompAddrInv1;
    }
    /**
     * Setter method for consigneeCompAddrInv1
     *
     * @param consigneeCompAddrInv1 Set for consigneeCompAddrInv1
     */
    public void setConsigneeCompAddrInv1(String consigneeCompAddrInv1) {
        this.consigneeCompAddrInv1 = consigneeCompAddrInv1;
    }
    /**
     * Getter method for consigneeCompAddrInv2
     *
     * @return the consigneeCompAddrInv2
     */
    public String getConsigneeCompAddrInv2() {
        return consigneeCompAddrInv2;
    }
    /**
     * Setter method for consigneeCompAddrInv2
     *
     * @param consigneeCompAddrInv2 Set for consigneeCompAddrInv2
     */
    public void setConsigneeCompAddrInv2(String consigneeCompAddrInv2) {
        this.consigneeCompAddrInv2 = consigneeCompAddrInv2;
    }
    /**
     * Getter method for consigneeAttn
     *
     * @return the consigneeAttn
     */
    public String getConsigneeAttn() {
        return consigneeAttn;
    }
    /**
     * Setter method for consigneeAttn
     *
     * @param consigneeAttn Set for consigneeAttn
     */
    public void setConsigneeAttn(String consigneeAttn) {
        this.consigneeAttn = consigneeAttn;
    }
    /**
     * Getter method for shipToNmInv1
     *
     * @return the shipToNmInv1
     */
    public String getShipToNmInv1() {
        return shipToNmInv1;
    }
    /**
     * Setter method for shipToNmInv1
     *
     * @param shipToNmInv1 Set for shipToNmInv1
     */
    public void setShipToNmInv1(String shipToNmInv1) {
        this.shipToNmInv1 = shipToNmInv1;
    }
    /**
     * Getter method for shipToAddrInv1
     *
     * @return the shipToAddrInv1
     */
    public String getShipToAddrInv1() {
        return shipToAddrInv1;
    }
    /**
     * Setter method for shipToAddrInv1
     *
     * @param shipToAddrInv1 Set for shipToAddrInv1
     */
    public void setShipToAddrInv1(String shipToAddrInv1) {
        this.shipToAddrInv1 = shipToAddrInv1;
    }
    /**
     * Getter method for shipToAddrInv2
     *
     * @return the shipToAddrInv2
     */
    public String getShipToAddrInv2() {
        return shipToAddrInv2;
    }
    /**
     * Setter method for shipToAddrInv2
     *
     * @param shipToAddrInv2 Set for shipToAddrInv2
     */
    public void setShipToAddrInv2(String shipToAddrInv2) {
        this.shipToAddrInv2 = shipToAddrInv2;
    }
    /**
     * Getter method for shipToCompNmAbb
     *
     * @return the shipToCompNmAbb
     */
    public String getShipToCompNmAbb() {
        return shipToCompNmAbb;
    }
    /**
     * Setter method for shipToCompNmAbb
     *
     * @param shipToCompNmAbb Set for shipToCompNmAbb
     */
    public void setShipToCompNmAbb(String shipToCompNmAbb) {
        this.shipToCompNmAbb = shipToCompNmAbb;
    }
    /**
     * Getter method for documentsType
     *
     * @return the documentsType
     */
    public String getDocumentsType() {
        return documentsType;
    }
    /**
     * Setter method for documentsType
     *
     * @param documentsType Set for documentsType
     */
    public void setDocumentsType(String documentsType) {
        this.documentsType = documentsType;
    }
    /**
     * Getter method for invoiceNo
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }
    /**
     * Setter method for invoiceNo
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    /**
     * Getter method for reInvoiceNo1
     *
     * @return the reInvoiceNo1
     */
    public String getReInvoiceNo1() {
        return reInvoiceNo1;
    }
    /**
     * Setter method for reInvoiceNo1
     *
     * @param reInvoiceNo1 Set for reInvoiceNo1
     */
    public void setReInvoiceNo1(String reInvoiceNo1) {
        this.reInvoiceNo1 = reInvoiceNo1;
    }
    /**
     * Getter method for reInvoiceNo2
     *
     * @return the reInvoiceNo2
     */
    public String getReInvoiceNo2() {
        return reInvoiceNo2;
    }
    /**
     * Setter method for reInvoiceNo2
     *
     * @param reInvoiceNo2 Set for reInvoiceNo2
     */
    public void setReInvoiceNo2(String reInvoiceNo2) {
        this.reInvoiceNo2 = reInvoiceNo2;
    }
    /**
     * Getter method for invoiceCategoryNm
     *
     * @return the invoiceCategoryNm
     */
    public String getInvoiceCategoryNm() {
        return invoiceCategoryNm;
    }
    /**
     * Setter method for invoiceCategoryNm
     *
     * @param invoiceCategoryNm Set for invoiceCategoryNm
     */
    public void setInvoiceCategoryNm(String invoiceCategoryNm) {
        this.invoiceCategoryNm = invoiceCategoryNm;
    }
    /**
     * Getter method for issuedDate
     *
     * @return the issuedDate
     */
    public String getIssuedDate() {
        return issuedDate;
    }
    /**
     * Setter method for issuedDate
     *
     * @param issuedDate Set for issuedDate
     */
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }
    /**
     * Getter method for shippedDate
     *
     * @return the shippedDate
     */
    public String getShippedDate() {
        return shippedDate;
    }
    /**
     * Setter method for shippedDate
     *
     * @param shippedDate Set for shippedDate
     */
    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }
    /**
     * Getter method for etd
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }
    /**
     * Setter method for etd
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }
    /**
     * Getter method for eta
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }
    /**
     * Setter method for eta
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }
    /**
     * Getter method for trnsWayNm
     *
     * @return the trnsWayNm
     */
    public String getTrnsWayNm() {
        return trnsWayNm;
    }
    /**
     * Setter method for trnsWayNm
     *
     * @param trnsWayNm Set for trnsWayNm
     */
    public void setTrnsWayNm(String trnsWayNm) {
        this.trnsWayNm = trnsWayNm;
    }
    /**
     * Getter method for loadingPortNm
     *
     * @return the loadingPortNm
     */
    public String getLoadingPortNm() {
        return loadingPortNm;
    }
    /**
     * Setter method for loadingPortNm
     *
     * @param loadingPortNm Set for loadingPortNm
     */
    public void setLoadingPortNm(String loadingPortNm) {
        this.loadingPortNm = loadingPortNm;
    }
    /**
     * Getter method for dischargePortNm
     *
     * @return the dischargePortNm
     */
    public String getDischargePortNm() {
        return dischargePortNm;
    }
    /**
     * Setter method for dischargePortNm
     *
     * @param dischargePortNm Set for dischargePortNm
     */
    public void setDischargePortNm(String dischargePortNm) {
        this.dischargePortNm = dischargePortNm;
    }
    /**
     * Getter method for deliveryPoint
     *
     * @return the deliveryPoint
     */
    public String getDeliveryPoint() {
        return deliveryPoint;
    }
    /**
     * Setter method for deliveryPoint
     *
     * @param deliveryPoint Set for deliveryPoint
     */
    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }
    /**
     * Getter method for carrierCompNmAbb
     *
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }
    /**
     * Setter method for carrierCompNmAbb
     *
     * @param carrierCompNmAbb Set for carrierCompNmAbb
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
    }
    /**
     * Getter method for vessel
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }
    /**
     * Setter method for vessel
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }
    /**
     * Getter method for bookingNo
     *
     * @return the bookingNo
     */
    public String getBookingNo() {
        return bookingNo;
    }
    /**
     * Setter method for bookingNo
     *
     * @param bookingNo Set for bookingNo
     */
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }
    /**
     * Getter method for containerNo
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }
    /**
     * Setter method for containerNo
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }
    /**
     * Getter method for priceTermNm
     *
     * @return the priceTermNm
     */
    public String getPriceTermNm() {
        return priceTermNm;
    }
    /**
     * Setter method for priceTermNm
     *
     * @param priceTermNm Set for priceTermNm
     */
    public void setPriceTermNm(String priceTermNm) {
        this.priceTermNm = priceTermNm;
    }
    /**
     * Getter method for costTotalInvoiceAmount
     *
     * @return the costTotalInvoiceAmount
     */
    public String getCostTotalInvoiceAmount() {
        return costTotalInvoiceAmount;
    }
    /**
     * Setter method for costTotalInvoiceAmount
     *
     * @param costTotalInvoiceAmount Set for costTotalInvoiceAmount
     */
    public void setCostTotalInvoiceAmount(String costTotalInvoiceAmount) {
        this.costTotalInvoiceAmount = costTotalInvoiceAmount;
    }
    /**
     * Getter method for compNmInv1
     *
     * @return the compNmInv1
     */
    public String getCompNmInv1() {
        return compNmInv1;
    }
    /**
     * Setter method for compNmInv1
     *
     * @param compNmInv1 Set for compNmInv1
     */
    public void setCompNmInv1(String compNmInv1) {
        this.compNmInv1 = compNmInv1;
    }
    /**
     * Getter method for totalInvoiceAmountCurrCd
     *
     * @return the totalInvoiceAmountCurrCd
     */
    public String getTotalInvoiceAmountCurrCd() {
        return totalInvoiceAmountCurrCd;
    }
    /**
     * Setter method for totalInvoiceAmountCurrCd
     *
     * @param totalInvoiceAmountCurrCd Set for totalInvoiceAmountCurrCd
     */
    public void setTotalInvoiceAmountCurrCd(String totalInvoiceAmountCurrCd) {
        this.totalInvoiceAmountCurrCd = totalInvoiceAmountCurrCd;
    }
    /**
     * Getter method for master11
     *
     * @return the master11
     */
    public String getMaster11() {
        return master11;
    }
    /**
     * Setter method for master11
     *
     * @param master11 Set for master11
     */
    public void setMaster11(String master11) {
        this.master11 = master11;
    }
    /**
     * Getter method for consigneeCompNmInv2
     *
     * @return the consigneeCompNmInv2
     */
    public String getConsigneeCompNmInv2() {
        return consigneeCompNmInv2;
    }
    /**
     * Setter method for consigneeCompNmInv2
     *
     * @param consigneeCompNmInv2 Set for consigneeCompNmInv2
     */
    public void setConsigneeCompNmInv2(String consigneeCompNmInv2) {
        this.consigneeCompNmInv2 = consigneeCompNmInv2;
    }
    /**
     * Getter method for consigneeCompAddrInv3
     *
     * @return the consigneeCompAddrInv3
     */
    public String getConsigneeCompAddrInv3() {
        return consigneeCompAddrInv3;
    }
    /**
     * Setter method for consigneeCompAddrInv3
     *
     * @param consigneeCompAddrInv3 Set for consigneeCompAddrInv3
     */
    public void setConsigneeCompAddrInv3(String consigneeCompAddrInv3) {
        this.consigneeCompAddrInv3 = consigneeCompAddrInv3;
    }
    /**
     * Getter method for consigneeCompAddrInv4
     *
     * @return the consigneeCompAddrInv4
     */
    public String getConsigneeCompAddrInv4() {
        return consigneeCompAddrInv4;
    }
    /**
     * Setter method for consigneeCompAddrInv4
     *
     * @param consigneeCompAddrInv4 Set for consigneeCompAddrInv4
     */
    public void setConsigneeCompAddrInv4(String consigneeCompAddrInv4) {
        this.consigneeCompAddrInv4 = consigneeCompAddrInv4;
    }
    /**
     * Getter method for shipToNmInv2
     *
     * @return the shipToNmInv2
     */
    public String getShipToNmInv2() {
        return shipToNmInv2;
    }
    /**
     * Setter method for shipToNmInv2
     *
     * @param shipToNmInv2 Set for shipToNmInv2
     */
    public void setShipToNmInv2(String shipToNmInv2) {
        this.shipToNmInv2 = shipToNmInv2;
    }
    /**
     * Getter method for shipToAddrInv3
     *
     * @return the shipToAddrInv3
     */
    public String getShipToAddrInv3() {
        return shipToAddrInv3;
    }
    /**
     * Setter method for shipToAddrInv3
     *
     * @param shipToAddrInv3 Set for shipToAddrInv3
     */
    public void setShipToAddrInv3(String shipToAddrInv3) {
        this.shipToAddrInv3 = shipToAddrInv3;
    }
    /**
     * Getter method for shipToAddrInv4
     *
     * @return the shipToAddrInv4
     */
    public String getShipToAddrInv4() {
        return shipToAddrInv4;
    }
    /**
     * Setter method for shipToAddrInv4
     *
     * @param shipToAddrInv4 Set for shipToAddrInv4
     */
    public void setShipToAddrInv4(String shipToAddrInv4) {
        this.shipToAddrInv4 = shipToAddrInv4;
    }
    /**
     * Getter method for totalQty1
     *
     * @return the totalQty1
     */
    public String getTotalQty1() {
        return totalQty1;
    }
    /**
     * Setter method for totalQty1
     *
     * @param totalQty1 Set for totalQty1
     */
    public void setTotalQty1(String totalQty1) {
        this.totalQty1 = totalQty1;
    }
    /**
     * Getter method for totalQty2
     *
     * @return the totalQty2
     */
    public String getTotalQty2() {
        return totalQty2;
    }
    /**
     * Setter method for totalQty2
     *
     * @param totalQty2 Set for totalQty2
     */
    public void setTotalQty2(String totalQty2) {
        this.totalQty2 = totalQty2;
    }
    /**
     * Getter method for totalQty3
     *
     * @return the totalQty3
     */
    public String getTotalQty3() {
        return totalQty3;
    }
    /**
     * Setter method for totalQty3
     *
     * @param totalQty3 Set for totalQty3
     */
    public void setTotalQty3(String totalQty3) {
        this.totalQty3 = totalQty3;
    }
    /**
     * Getter method for totalWeight
     *
     * @return the totalWeight
     */
    public String getTotalWeight() {
        return totalWeight;
    }
    /**
     * Setter method for totalWeight
     *
     * @param totalWeight Set for totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }
    /**
     * Getter method for master3
     *
     * @return the master3
     */
    public String getMaster3() {
        return master3;
    }
    /**
     * Setter method for master3
     *
     * @param master3 Set for master3
     */
    public void setMaster3(String master3) {
        this.master3 = master3;
    }
    /**
     * Getter method for master7
     *
     * @return the master7
     */
    public String getMaster7() {
        return master7;
    }
    /**
     * Setter method for master7
     *
     * @param master7 Set for master7
     */
    public void setMaster7(String master7) {
        this.master7 = master7;
    }
    /**
     * Getter method for master8
     *
     * @return the master8
     */
    public String getMaster8() {
        return master8;
    }
    /**
     * Setter method for master8
     *
     * @param master8 Set for master8
     */
    public void setMaster8(String master8) {
        this.master8 = master8;
    }
    /**
     * Getter method for compNmInv2
     *
     * @return the compNmInv2
     */
    public String getCompNmInv2() {
        return compNmInv2;
    }
    /**
     * Setter method for compNmInv2
     *
     * @param compNmInv2 Set for compNmInv2
     */
    public void setCompNmInv2(String compNmInv2) {
        this.compNmInv2 = compNmInv2;
    }
    /**
     * Getter method for master2
     *
     * @return the master2
     */
    public String getMaster2() {
        return master2;
    }
    /**
     * Setter method for master2
     *
     * @param master2 Set for master2
     */
    public void setMaster2(String master2) {
        this.master2 = master2;
    }
    /**
     * Getter method for totalWeightUnit
     *
     * @return the totalWeightUnit
     */
    public String getTotalWeightUnit() {
        return totalWeightUnit;
    }
    /**
     * Setter method for totalWeightUnit
     *
     * @param totalWeightUnit Set for totalWeightUnit
     */
    public void setTotalWeightUnit(String totalWeightUnit) {
        this.totalWeightUnit = totalWeightUnit;
    }
    /**
     * Getter method for totalQty1Unit
     *
     * @return the totalQty1Unit
     */
    public String getTotalQty1Unit() {
        return totalQty1Unit;
    }
    /**
     * Setter method for totalQty1Unit
     *
     * @param totalQty1Unit Set for totalQty1Unit
     */
    public void setTotalQty1Unit(String totalQty1Unit) {
        this.totalQty1Unit = totalQty1Unit;
    }
    /**
     * Getter method for totalQty2Unit
     *
     * @return the totalQty2Unit
     */
    public String getTotalQty2Unit() {
        return totalQty2Unit;
    }
    /**
     * Setter method for totalQty2Unit
     *
     * @param totalQty2Unit Set for totalQty2Unit
     */
    public void setTotalQty2Unit(String totalQty2Unit) {
        this.totalQty2Unit = totalQty2Unit;
    }
    /**
     * Getter method for totalQty3Unit
     *
     * @return the totalQty3Unit
     */
    public String getTotalQty3Unit() {
        return totalQty3Unit;
    }
    /**
     * Setter method for totalQty3Unit
     *
     * @param totalQty3Unit Set for totalQty3Unit
     */
    public void setTotalQty3Unit(String totalQty3Unit) {
        this.totalQty3Unit = totalQty3Unit;
    }
    /**
     * Getter method for consigneeBlockName
     *
     * @return the consigneeBlockName
     */
    public String getConsigneeBlockName() {
        return consigneeBlockName;
    }
    /**
     * Setter method for consigneeBlockName
     *
     * @param consigneeBlockName Set for consigneeBlockName
     */
    public void setConsigneeBlockName(String consigneeBlockName) {
        this.consigneeBlockName = consigneeBlockName;
    }
    /**
     * Getter method for fileData1
     *
     * @return the fileData1
     */
    public InputStream getFileData1() {
        return fileData1;
    }
    /**
     * Setter method for fileData1
     *
     * @param fileData1 Set for fileData1
     */
    public void setFileData1(InputStream fileData1) {
        this.fileData1 = fileData1;
    }
    /**
     * Getter method for fileData12
     *
     * @return the fileData12
     */
    public InputStream getFileData12() {
        return fileData12;
    }
    /**
     * Setter method for fileData12
     *
     * @param fileData12 Set for fileData12
     */
    public void setFileData12(InputStream fileData12) {
        this.fileData12 = fileData12;
    }
    /**
     * Getter method for fileData13
     *
     * @return the fileData13
     */
    public InputStream getFileData13() {
        return fileData13;
    }
    /**
     * Setter method for fileData13
     *
     * @param fileData13 Set for fileData13
     */
    public void setFileData13(InputStream fileData13) {
        this.fileData13 = fileData13;
    }
    /**
     * Getter method for fileData9
     *
     * @return the fileData9
     */
    public InputStream getFileData9() {
        return fileData9;
    }
    /**
     * Setter method for fileData9
     *
     * @param fileData9 Set for fileData9
     */
    public void setFileData9(InputStream fileData9) {
        this.fileData9 = fileData9;
    }
}
