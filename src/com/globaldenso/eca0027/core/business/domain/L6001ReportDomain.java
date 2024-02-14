/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/** 
 * The domain class that holds the information of the document [L6001].
 * <br/>帳票【L6001】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
  */
public class L6001ReportDomain extends AbstractDomain {
    /** 
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /**  Auto Text1  */
    private InputStream autoText1 = null;
    /**  Shipper Name  */
    private String compNmInv1 = null;
    /**  Shipper Name2  */
    private String compNmInv2 = null;
    /**  Auto Text2  */
    private String master2 = null;
    /**  Shipper Tax ID  */
    private String shipperTaxIdNo = null;
    /**  Shipper Address1  */
    private String shipperCompAddrInv1 = null;
    /**  Shipper Address2  */
    private String shipperCompAddrInv2 = null;
    /**  Shipper Tel  */
    private String shipperCompTel = null;
    /**  Shipper Fax  */
    private String shipperCompFax = null;
    /**  Block Name Sold To  */
    private String consigneeBlockName = null;
    /**  Consignee Name1  */
    private String consigneeCompNmInv1 = null;
    /**  Consignee Name2  */
    private String consigneeCompNmInv2 = null;
    /**  Consignee Address1  */
    private String consigneeCompAddrInv1 = null;
    /**  Consignee Address2  */
    private String consigneeCompAddrInv2 = null;
    /**  Consignee Address3  */
    private String consigneeCompAddrInv3 = null;
    /**  Consignee Address4  */
    private String consigneeCompAddrInv4 = null;
    /**  Consignee Attn  */
    private String consigneeAttn = null;
    /**  Ship To Name1  */
    private String shipToNmInv1 = null;
    /**  Ship To Name2  */
    private String shipToNmInv2 = null;
    /**  Ship To Address1  */
    private String shipToAddrInv1 = null;
    /**  Ship To Address2  */
    private String shipToAddrInv2 = null;
    /**  Ship To Address3  */
    private String shipToAddrInv3 = null;
    /**  Ship To Address4  */
    private String shipToAddrInv4 = null;
    /**  Shipper Short Name  */
    private String shipToCompNmAbb = null;
    /**  Documents Type  */
    private String documentsType = null;
    /**  Invoice No  */
    private String invoiceNo = null;
    /**  Reference Invoice No1  */
    private String reInvoiceNo1 = null;
    /**  Reference Invoice No2  */
    private String reInvoiceNo2 = null;
    /**  Invoice Category  */
    private String invoiceCategoryNm = null;
    /**  Issued Date  */
    private String issuedDate = null;
    /**  Shipped Date  */
    private String shippedDate = null;
    /**  ETD  */
    private String etd = null;
    /**  ETA  */
    private String eta = null;
    /**  Trans Way  */
    private String trnsWayNm = null;
    /**  Loading Port  */
    private String loadingPortNm = null;
    /**  Discharge Port  */
    private String dischargePortNm = null;
    /**  Delivery Point  */
    private String deliveryPoint = null;
    /**  Carrier Name  */
    private String carrierCompNmAbb = null;
    /**  Vessel  */
    private String vessel = null;
    /**  Booking No  */
    private String bookingNo = null;
    /**  Container No  */
    private String containerNo = null;
    /**  No of PKG  */
    private String noOfPkg = null;
    /**  Net Weight  */
    private String totalNetWeight = null;
    /**  Net Weight Unit  */
    private String totalNetWeightUnit = null;
    /**  Gross Weight  */
    private String totalGrossWeight = null;
    /**  Gross Weight Unit  */
    private String totalGrossWeghtUnit = null;
    /**  Volume  */
    private String totalVolume = null;
    /**  Volume Unit  */
    private String totalVolumeUnit = null;
    /**  Freight Responsibility  */
    private String freightStatusNm = null;
    /**  Price Terms  */
    private String priceTermNm = null;
    /**  Trade Terms  */
    private String tradeTermsNm = null;
    /**  Payment Method  */
    private String paymentMethod = null;
    /**  Payment Terms  */
    private String paymentTerms = null;
    /**  Payment Message  */
    private String paymentMessage = null;
    /**  Remittance Bank  */
    private String remittanceBank = null;
    /**  Remittance Bank Address1  */
    private String remittanceBankAddress1 = null;
    /**  Remittance Bank Address2  */
    private String remittanceBankAddress2 = null;
    /**  Remittance Bank Address3  */
    private String remittanceBankAddress3 = null;
    /**  Remittance Account  */
    private String remittanceAccount = null;
    /**  LC No. Display  */
    private String lcNoDisplay = null;
    /**  LC No.  */
    private String lcNo = null;
    /**  LC Date Display  */
    private String lcDateDisplay = null;
    /**  LC Date  */
    private String lcDate = null;
    /**  LC Bank1 Display  */
    private String lcBank1Display = null;
    /**  LC Bank1  */
    private String lcBank1 = null;
    /**  LC Bank2 Display  */
    private String lcBank2Display = null;
    /**  LC Bank2  */
    private String lcBank2 = null;
    /**  Special Information  */
    private String specialInformation1Value = null;
    /**  Auto Text3  */
    private String autoText3 = null;
    /**  Net Amount  */
    private String costNetAmount = null;
    /**  Net Amount Currency  */
    private String netAmountCurrCd = null;
    /**  Freight Amount  */
    private String costFreight = null;
    /**  Freight Currency  */
    private String freightCurrCd = null;
    /**  Insurance Amount  */
    private String costInsurance = null;
    /**  Insurance Currency  */
    private String insuranceCurrCd = null;
    /**  Sub Total Amount  */
    private String costSubTotal = null;
    /**  Sub Total Currency  */
    private String subTotalCurrCd = null;
    /**  VAT Display1  */
    private String vatDisplay1 = null;
    /**  VAT Percentage  */
    private String vatPercentage = null;
    /**  VAT Display2  */
    private String vatDisplay2 = null;
    /**  VAT Amount  */
    private String costVat = null;
    /**  VAT Currency  */
    private String vatCurrCd = null;
    /**  Handling Charge Display  */
    private String handlingChargeDisplay = null;
    /**  Handling Charge Amount  */
    private String costHandlingCharge = null;
    /**  Handling Charge Currency  */
    private String handlingChargeCurrCd = null;
    /**  Free Additional Name  */
    private String freeAdditionalChargeNm = null;
    /**  Free Additional Amount  */
    private String costAdditionalCharge = null;
    /**  Free Additional Currency  */
    private String freeAdditionalChargeCurrCd = null;
    /**  Total Invoice Amount  */
    private String costTotalInvoiceAmount = null;
    /**  Total Amount Currency  */
    private String totalInvoiceAmountCurrCd = null;
    /**  No Charge Display  */
    private String costNoChargeDisplay = null;
    /**  No Charge Amount  */
    private String costNoChargeAmount = null;
    /**  No Charge Currency  */
    private String noChargeCurr = null;
    /**  Auto Text4  */
    private InputStream autoText4 = null;
    /**  Auto Text5  */
    private InputStream autoText5 = null;
    /**  Auto Text6  */
    private InputStream autoText6 = null;
    /**  Auto Text7  */
    private String master7 = null;
    /**  Auto Text8  */
    private String master8 = null;
    /**
     * Default Constructor
     */
    public L6001ReportDomain() {
    }
    /**
     * Getter method for autoText1.
     *
     * @return the autoText1
     */
    public InputStream getAutoText1() {
        return autoText1;
    }
    /**
     * Setter method for autoText1.
     *
     * @param autoText1 Set for autoText1
     */
    public void setAutoText1(InputStream autoText1) {
        this.autoText1 = autoText1;
    }
    /**
     * Getter method for compNmInv1.
     *
     * @return the compNmInv1
     */
    public String getCompNmInv1() {
        return compNmInv1;
    }
    /**
     * Setter method for compNmInv1.
     *
     * @param compNmInv1 Set for compNmInv1
     */
    public void setCompNmInv1(String compNmInv1) {
        this.compNmInv1 = compNmInv1;
    }
    /**
     * Getter method for compNmInv2.
     *
     * @return the compNmInv2
     */
    public String getCompNmInv2() {
        return compNmInv2;
    }
    /**
     * Setter method for compNmInv2.
     *
     * @param compNmInv2 Set for compNmInv2
     */
    public void setCompNmInv2(String compNmInv2) {
        this.compNmInv2 = compNmInv2;
    }
    /**
     * Getter method for master2.
     *
     * @return the master2
     */
    public String getMaster2() {
        return master2;
    }
    /**
     * Setter method for master2.
     *
     * @param master2 Set for master2
     */
    public void setMaster2(String master2) {
        this.master2 = master2;
    }
    /**
     * Getter method for shipperTaxIdNo.
     *
     * @return the shipperTaxIdNo
     */
    public String getShipperTaxIdNo() {
        return shipperTaxIdNo;
    }
    /**
     * Setter method for shipperTaxIdNo.
     *
     * @param shipperTaxIdNo Set for shipperTaxIdNo
     */
    public void setShipperTaxIdNo(String shipperTaxIdNo) {
        this.shipperTaxIdNo = shipperTaxIdNo;
    }
    /**
     * Getter method for shipperCompAddrInv1.
     *
     * @return the shipperCompAddrInv1
     */
    public String getShipperCompAddrInv1() {
        return shipperCompAddrInv1;
    }
    /**
     * Setter method for shipperCompAddrInv1.
     *
     * @param shipperCompAddrInv1 Set for shipperCompAddrInv1
     */
    public void setShipperCompAddrInv1(String shipperCompAddrInv1) {
        this.shipperCompAddrInv1 = shipperCompAddrInv1;
    }
    /**
     * Getter method for shipperCompAddrInv2.
     *
     * @return the shipperCompAddrInv2
     */
    public String getShipperCompAddrInv2() {
        return shipperCompAddrInv2;
    }
    /**
     * Setter method for shipperCompAddrInv2.
     *
     * @param shipperCompAddrInv2 Set for shipperCompAddrInv2
     */
    public void setShipperCompAddrInv2(String shipperCompAddrInv2) {
        this.shipperCompAddrInv2 = shipperCompAddrInv2;
    }
    /**
     * Getter method for shipperCompTel.
     *
     * @return the shipperCompTel
     */
    public String getShipperCompTel() {
        return shipperCompTel;
    }
    /**
     * Setter method for shipperCompTel.
     *
     * @param shipperCompTel Set for shipperCompTel
     */
    public void setShipperCompTel(String shipperCompTel) {
        this.shipperCompTel = shipperCompTel;
    }
    /**
     * Getter method for shipperCompFax.
     *
     * @return the shipperCompFax
     */
    public String getShipperCompFax() {
        return shipperCompFax;
    }
    /**
     * Setter method for shipperCompFax.
     *
     * @param shipperCompFax Set for shipperCompFax
     */
    public void setShipperCompFax(String shipperCompFax) {
        this.shipperCompFax = shipperCompFax;
    }
    /**
     * Getter method for consigneeBlockName.
     *
     * @return the consigneeBlockName
     */
    public String getConsigneeBlockName() {
        return consigneeBlockName;
    }
    /**
     * Setter method for consigneeBlockName.
     *
     * @param consigneeBlockName Set for consigneeBlockName
     */
    public void setConsigneeBlockName(String consigneeBlockName) {
        this.consigneeBlockName = consigneeBlockName;
    }
    /**
     * Getter method for consigneeCompNmInv1.
     *
     * @return the consigneeCompNmInv1
     */
    public String getConsigneeCompNmInv1() {
        return consigneeCompNmInv1;
    }
    /**
     * Setter method for consigneeCompNmInv1.
     *
     * @param consigneeCompNmInv1 Set for consigneeCompNmInv1
     */
    public void setConsigneeCompNmInv1(String consigneeCompNmInv1) {
        this.consigneeCompNmInv1 = consigneeCompNmInv1;
    }
    /**
     * Getter method for consigneeCompNmInv2.
     *
     * @return the consigneeCompNmInv2
     */
    public String getConsigneeCompNmInv2() {
        return consigneeCompNmInv2;
    }
    /**
     * Setter method for consigneeCompNmInv2.
     *
     * @param consigneeCompNmInv2 Set for consigneeCompNmInv2
     */
    public void setConsigneeCompNmInv2(String consigneeCompNmInv2) {
        this.consigneeCompNmInv2 = consigneeCompNmInv2;
    }
    /**
     * Getter method for consigneeCompAddrInv1.
     *
     * @return the consigneeCompAddrInv1
     */
    public String getConsigneeCompAddrInv1() {
        return consigneeCompAddrInv1;
    }
    /**
     * Setter method for consigneeCompAddrInv1.
     *
     * @param consigneeCompAddrInv1 Set for consigneeCompAddrInv1
     */
    public void setConsigneeCompAddrInv1(String consigneeCompAddrInv1) {
        this.consigneeCompAddrInv1 = consigneeCompAddrInv1;
    }
    /**
     * Getter method for consigneeCompAddrInv2.
     *
     * @return the consigneeCompAddrInv2
     */
    public String getConsigneeCompAddrInv2() {
        return consigneeCompAddrInv2;
    }
    /**
     * Setter method for consigneeCompAddrInv2.
     *
     * @param consigneeCompAddrInv2 Set for consigneeCompAddrInv2
     */
    public void setConsigneeCompAddrInv2(String consigneeCompAddrInv2) {
        this.consigneeCompAddrInv2 = consigneeCompAddrInv2;
    }
    /**
     * Getter method for consigneeCompAddrInv3.
     *
     * @return the consigneeCompAddrInv3
     */
    public String getConsigneeCompAddrInv3() {
        return consigneeCompAddrInv3;
    }
    /**
     * Setter method for consigneeCompAddrInv3.
     *
     * @param consigneeCompAddrInv3 Set for consigneeCompAddrInv3
     */
    public void setConsigneeCompAddrInv3(String consigneeCompAddrInv3) {
        this.consigneeCompAddrInv3 = consigneeCompAddrInv3;
    }
    /**
     * Getter method for consigneeCompAddrInv4.
     *
     * @return the consigneeCompAddrInv4
     */
    public String getConsigneeCompAddrInv4() {
        return consigneeCompAddrInv4;
    }
    /**
     * Setter method for consigneeCompAddrInv4.
     *
     * @param consigneeCompAddrInv4 Set for consigneeCompAddrInv4
     */
    public void setConsigneeCompAddrInv4(String consigneeCompAddrInv4) {
        this.consigneeCompAddrInv4 = consigneeCompAddrInv4;
    }
    /**
     * Getter method for consigneeAttn.
     *
     * @return the consigneeAttn
     */
    public String getConsigneeAttn() {
        return consigneeAttn;
    }
    /**
     * Setter method for consigneeAttn.
     *
     * @param consigneeAttn Set for consigneeAttn
     */
    public void setConsigneeAttn(String consigneeAttn) {
        this.consigneeAttn = consigneeAttn;
    }
    /**
     * Getter method for shipToNmInv1.
     *
     * @return the shipToNmInv1
     */
    public String getShipToNmInv1() {
        return shipToNmInv1;
    }
    /**
     * Setter method for shipToNmInv1.
     *
     * @param shipToNmInv1 Set for shipToNmInv1
     */
    public void setShipToNmInv1(String shipToNmInv1) {
        this.shipToNmInv1 = shipToNmInv1;
    }
    /**
     * Getter method for shipToNmInv2.
     *
     * @return the shipToNmInv2
     */
    public String getShipToNmInv2() {
        return shipToNmInv2;
    }
    /**
     * Setter method for shipToNmInv2.
     *
     * @param shipToNmInv2 Set for shipToNmInv2
     */
    public void setShipToNmInv2(String shipToNmInv2) {
        this.shipToNmInv2 = shipToNmInv2;
    }
    /**
     * Getter method for shipToAddrInv1.
     *
     * @return the shipToAddrInv1
     */
    public String getShipToAddrInv1() {
        return shipToAddrInv1;
    }
    /**
     * Setter method for shipToAddrInv1.
     *
     * @param shipToAddrInv1 Set for shipToAddrInv1
     */
    public void setShipToAddrInv1(String shipToAddrInv1) {
        this.shipToAddrInv1 = shipToAddrInv1;
    }
    /**
     * Getter method for shipToAddrInv2.
     *
     * @return the shipToAddrInv2
     */
    public String getShipToAddrInv2() {
        return shipToAddrInv2;
    }
    /**
     * Setter method for shipToAddrInv2.
     *
     * @param shipToAddrInv2 Set for shipToAddrInv2
     */
    public void setShipToAddrInv2(String shipToAddrInv2) {
        this.shipToAddrInv2 = shipToAddrInv2;
    }
    /**
     * Getter method for shipToAddrInv3.
     *
     * @return the shipToAddrInv3
     */
    public String getShipToAddrInv3() {
        return shipToAddrInv3;
    }
    /**
     * Setter method for shipToAddrInv3.
     *
     * @param shipToAddrInv3 Set for shipToAddrInv3
     */
    public void setShipToAddrInv3(String shipToAddrInv3) {
        this.shipToAddrInv3 = shipToAddrInv3;
    }
    /**
     * Getter method for shipToAddrInv4.
     *
     * @return the shipToAddrInv4
     */
    public String getShipToAddrInv4() {
        return shipToAddrInv4;
    }
    /**
     * Setter method for shipToAddrInv4.
     *
     * @param shipToAddrInv4 Set for shipToAddrInv4
     */
    public void setShipToAddrInv4(String shipToAddrInv4) {
        this.shipToAddrInv4 = shipToAddrInv4;
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
     * Getter method for documentsType.
     *
     * @return the documentsType
     */
    public String getDocumentsType() {
        return documentsType;
    }
    /**
     * Setter method for documentsType.
     *
     * @param documentsType Set for documentsType
     */
    public void setDocumentsType(String documentsType) {
        this.documentsType = documentsType;
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
     * Getter method for reInvoiceNo1.
     *
     * @return the reInvoiceNo1
     */
    public String getReInvoiceNo1() {
        return reInvoiceNo1;
    }
    /**
     * Setter method for reInvoiceNo1.
     *
     * @param reInvoiceNo1 Set for reInvoiceNo1
     */
    public void setReInvoiceNo1(String reInvoiceNo1) {
        this.reInvoiceNo1 = reInvoiceNo1;
    }
    /**
     * Getter method for reInvoiceNo2.
     *
     * @return the reInvoiceNo2
     */
    public String getReInvoiceNo2() {
        return reInvoiceNo2;
    }
    /**
     * Setter method for reInvoiceNo2.
     *
     * @param reInvoiceNo2 Set for reInvoiceNo2
     */
    public void setReInvoiceNo2(String reInvoiceNo2) {
        this.reInvoiceNo2 = reInvoiceNo2;
    }
    /**
     * Getter method for invoiceCategoryNm.
     *
     * @return the invoiceCategoryNm
     */
    public String getInvoiceCategoryNm() {
        return invoiceCategoryNm;
    }
    /**
     * Setter method for invoiceCategoryNm.
     *
     * @param invoiceCategoryNm Set for invoiceCategoryNm
     */
    public void setInvoiceCategoryNm(String invoiceCategoryNm) {
        this.invoiceCategoryNm = invoiceCategoryNm;
    }
    /**
     * Getter method for issuedDate.
     *
     * @return the issuedDate
     */
    public String getIssuedDate() {
        return issuedDate;
    }
    /**
     * Setter method for issuedDate.
     *
     * @param issuedDate Set for issuedDate
     */
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }
    /**
     * Getter method for shippedDate.
     *
     * @return the shippedDate
     */
    public String getShippedDate() {
        return shippedDate;
    }
    /**
     * Setter method for shippedDate.
     *
     * @param shippedDate Set for shippedDate
     */
    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }
    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }
    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
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
     * Getter method for trnsWayNm.
     *
     * @return the trnsWayNm
     */
    public String getTrnsWayNm() {
        return trnsWayNm;
    }
    /**
     * Setter method for trnsWayNm.
     *
     * @param trnsWayNm Set for trnsWayNm
     */
    public void setTrnsWayNm(String trnsWayNm) {
        this.trnsWayNm = trnsWayNm;
    }
    /**
     * Getter method for loadingPortNm.
     *
     * @return the loadingPortNm
     */
    public String getLoadingPortNm() {
        return loadingPortNm;
    }
    /**
     * Setter method for loadingPortNm.
     *
     * @param loadingPortNm Set for loadingPortNm
     */
    public void setLoadingPortNm(String loadingPortNm) {
        this.loadingPortNm = loadingPortNm;
    }
    /**
     * Getter method for dischargePortNm.
     *
     * @return the dischargePortNm
     */
    public String getDischargePortNm() {
        return dischargePortNm;
    }
    /**
     * Setter method for dischargePortNm.
     *
     * @param dischargePortNm Set for dischargePortNm
     */
    public void setDischargePortNm(String dischargePortNm) {
        this.dischargePortNm = dischargePortNm;
    }
    /**
     * Getter method for deliveryPoint.
     *
     * @return the deliveryPoint
     */
    public String getDeliveryPoint() {
        return deliveryPoint;
    }
    /**
     * Setter method for deliveryPoint.
     *
     * @param deliveryPoint Set for deliveryPoint
     */
    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
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
     * Getter method for bookingNo.
     *
     * @return the bookingNo
     */
    public String getBookingNo() {
        return bookingNo;
    }
    /**
     * Setter method for bookingNo.
     *
     * @param bookingNo Set for bookingNo
     */
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
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
     * Getter method for noOfPkg.
     *
     * @return the noOfPkg
     */
    public String getNoOfPkg() {
        return noOfPkg;
    }
    /**
     * Setter method for noOfPkg.
     *
     * @param noOfPkg Set for noOfPkg
     */
    public void setNoOfPkg(String noOfPkg) {
        this.noOfPkg = noOfPkg;
    }
    /**
     * Getter method for totalNetWeight.
     *
     * @return the totalNetWeight
     */
    public String getTotalNetWeight() {
        return totalNetWeight;
    }
    /**
     * Setter method for totalNetWeight.
     *
     * @param totalNetWeight Set for totalNetWeight
     */
    public void setTotalNetWeight(String totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }
    /**
     * Getter method for totalNetWeightUnit.
     *
     * @return the totalNetWeightUnit
     */
    public String getTotalNetWeightUnit() {
        return totalNetWeightUnit;
    }
    /**
     * Setter method for totalNetWeightUnit.
     *
     * @param totalNetWeightUnit Set for totalNetWeightUnit
     */
    public void setTotalNetWeightUnit(String totalNetWeightUnit) {
        this.totalNetWeightUnit = totalNetWeightUnit;
    }
    /**
     * Getter method for totalGrossWeight.
     *
     * @return the totalGrossWeight
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }
    /**
     * Setter method for totalGrossWeight.
     *
     * @param totalGrossWeight Set for totalGrossWeight
     */
    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }
    /**
     * Getter method for totalGrossWeghtUnit.
     *
     * @return the totalGrossWeghtUnit
     */
    public String getTotalGrossWeghtUnit() {
        return totalGrossWeghtUnit;
    }
    /**
     * Setter method for totalGrossWeghtUnit.
     *
     * @param totalGrossWeghtUnit Set for totalGrossWeghtUnit
     */
    public void setTotalGrossWeghtUnit(String totalGrossWeghtUnit) {
        this.totalGrossWeghtUnit = totalGrossWeghtUnit;
    }
    /**
     * Getter method for totalVolume.
     *
     * @return the totalVolume
     */
    public String getTotalVolume() {
        return totalVolume;
    }
    /**
     * Setter method for totalVolume.
     *
     * @param totalVolume Set for totalVolume
     */
    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }
    /**
     * Getter method for totalVolumeUnit.
     *
     * @return the totalVolumeUnit
     */
    public String getTotalVolumeUnit() {
        return totalVolumeUnit;
    }
    /**
     * Setter method for totalVolumeUnit.
     *
     * @param totalVolumeUnit Set for totalVolumeUnit
     */
    public void setTotalVolumeUnit(String totalVolumeUnit) {
        this.totalVolumeUnit = totalVolumeUnit;
    }
    /**
     * Getter method for freightStatusNm.
     *
     * @return the freightStatusNm
     */
    public String getFreightStatusNm() {
        return freightStatusNm;
    }
    /**
     * Setter method for freightStatusNm.
     *
     * @param freightStatusNm Set for freightStatusNm
     */
    public void setFreightStatusNm(String freightStatusNm) {
        this.freightStatusNm = freightStatusNm;
    }
    /**
     * Getter method for priceTermNm.
     *
     * @return the priceTermNm
     */
    public String getPriceTermNm() {
        return priceTermNm;
    }
    /**
     * Setter method for priceTermNm.
     *
     * @param priceTermNm Set for priceTermNm
     */
    public void setPriceTermNm(String priceTermNm) {
        this.priceTermNm = priceTermNm;
    }
    /**
     * Getter method for tradeTermsNm.
     *
     * @return the tradeTermsNm
     */
    public String getTradeTermsNm() {
        return tradeTermsNm;
    }
    /**
     * Setter method for tradeTermsNm.
     *
     * @param tradeTermsNm Set for tradeTermsNm
     */
    public void setTradeTermsNm(String tradeTermsNm) {
        this.tradeTermsNm = tradeTermsNm;
    }
    /**
     * Getter method for paymentMethod.
     *
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }
    /**
     * Setter method for paymentMethod.
     *
     * @param paymentMethod Set for paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Getter method for paymentTerms.
     *
     * @return the paymentTerms
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }
    /**
     * Setter method for paymentTerms.
     *
     * @param paymentTerms Set for paymentTerms
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
    /**
     * Getter method for paymentMessage.
     *
     * @return the paymentMessage
     */
    public String getPaymentMessage() {
        return paymentMessage;
    }
    /**
     * Setter method for paymentMessage.
     *
     * @param paymentMessage Set for paymentMessage
     */
    public void setPaymentMessage(String paymentMessage) {
        this.paymentMessage = paymentMessage;
    }
    /**
     * Getter method for remittanceBank.
     *
     * @return the remittanceBank
     */
    public String getRemittanceBank() {
        return remittanceBank;
    }
    /**
     * Setter method for remittanceBank.
     *
     * @param remittanceBank Set for remittanceBank
     */
    public void setRemittanceBank(String remittanceBank) {
        this.remittanceBank = remittanceBank;
    }
    /**
     * Getter method for remittanceBankAddress1.
     *
     * @return the remittanceBankAddress1
     */
    public String getRemittanceBankAddress1() {
        return remittanceBankAddress1;
    }
    /**
     * Setter method for remittanceBankAddress1.
     *
     * @param remittanceBankAddress1 Set for remittanceBankAddress1
     */
    public void setRemittanceBankAddress1(String remittanceBankAddress1) {
        this.remittanceBankAddress1 = remittanceBankAddress1;
    }
    /**
     * Getter method for remittanceBankAddress2.
     *
     * @return the remittanceBankAddress2
     */
    public String getRemittanceBankAddress2() {
        return remittanceBankAddress2;
    }
    /**
     * Setter method for remittanceBankAddress2.
     *
     * @param remittanceBankAddress2 Set for remittanceBankAddress2
     */
    public void setRemittanceBankAddress2(String remittanceBankAddress2) {
        this.remittanceBankAddress2 = remittanceBankAddress2;
    }
    /**
     * Getter method for remittanceBankAddress3.
     *
     * @return the remittanceBankAddress3
     */
    public String getRemittanceBankAddress3() {
        return remittanceBankAddress3;
    }
    /**
     * Setter method for remittanceBankAddress3.
     *
     * @param remittanceBankAddress3 Set for remittanceBankAddress3
     */
    public void setRemittanceBankAddress3(String remittanceBankAddress3) {
        this.remittanceBankAddress3 = remittanceBankAddress3;
    }
    /**
     * Getter method for remittanceAccount.
     *
     * @return the remittanceAccount
     */
    public String getRemittanceAccount() {
        return remittanceAccount;
    }
    /**
     * Setter method for remittanceAccount.
     *
     * @param remittanceAccount Set for remittanceAccount
     */
    public void setRemittanceAccount(String remittanceAccount) {
        this.remittanceAccount = remittanceAccount;
    }
    /**
     * Getter method for lcNoDisplay.
     *
     * @return the lcNoDisplay
     */
    public String getLcNoDisplay() {
        return lcNoDisplay;
    }
    /**
     * Setter method for lcNoDisplay.
     *
     * @param lcNoDisplay Set for lcNoDisplay
     */
    public void setLcNoDisplay(String lcNoDisplay) {
        this.lcNoDisplay = lcNoDisplay;
    }
    /**
     * Getter method for lcNo.
     *
     * @return the lcNo
     */
    public String getLcNo() {
        return lcNo;
    }
    /**
     * Setter method for lcNo.
     *
     * @param lcNo Set for lcNo
     */
    public void setLcNo(String lcNo) {
        this.lcNo = lcNo;
    }
    /**
     * Getter method for lcDateDisplay.
     *
     * @return the lcDateDisplay
     */
    public String getLcDateDisplay() {
        return lcDateDisplay;
    }
    /**
     * Setter method for lcDateDisplay.
     *
     * @param lcDateDisplay Set for lcDateDisplay
     */
    public void setLcDateDisplay(String lcDateDisplay) {
        this.lcDateDisplay = lcDateDisplay;
    }
    /**
     * Getter method for lcDate.
     *
     * @return the lcDate
     */
    public String getLcDate() {
        return lcDate;
    }
    /**
     * Setter method for lcDate.
     *
     * @param lcDate Set for lcDate
     */
    public void setLcDate(String lcDate) {
        this.lcDate = lcDate;
    }
    /**
     * Getter method for lcBank1Display.
     *
     * @return the lcBank1Display
     */
    public String getLcBank1Display() {
        return lcBank1Display;
    }
    /**
     * Setter method for lcBank1Display.
     *
     * @param lcBank1Display Set for lcBank1Display
     */
    public void setLcBank1Display(String lcBank1Display) {
        this.lcBank1Display = lcBank1Display;
    }
    /**
     * Getter method for lcBank1.
     *
     * @return the lcBank1
     */
    public String getLcBank1() {
        return lcBank1;
    }
    /**
     * Setter method for lcBank1.
     *
     * @param lcBank1 Set for lcBank1
     */
    public void setLcBank1(String lcBank1) {
        this.lcBank1 = lcBank1;
    }
    /**
     * Getter method for lcBank2Display.
     *
     * @return the lcBank2Display
     */
    public String getLcBank2Display() {
        return lcBank2Display;
    }
    /**
     * Setter method for lcBank2Display.
     *
     * @param lcBank2Display Set for lcBank2Display
     */
    public void setLcBank2Display(String lcBank2Display) {
        this.lcBank2Display = lcBank2Display;
    }
    /**
     * Getter method for lcBank2.
     *
     * @return the lcBank2
     */
    public String getLcBank2() {
        return lcBank2;
    }
    /**
     * Setter method for lcBank2.
     *
     * @param lcBank2 Set for lcBank2
     */
    public void setLcBank2(String lcBank2) {
        this.lcBank2 = lcBank2;
    }
    /**
     * Getter method for specialInformation1Value.
     *
     * @return the specialInformation1Value
     */
    public String getSpecialInformation1Value() {
        return specialInformation1Value;
    }
    /**
     * Setter method for specialInformation1Value.
     *
     * @param specialInformation1Value Set for specialInformation1Value
     */
    public void setSpecialInformation1Value(String specialInformation1Value) {
        this.specialInformation1Value = specialInformation1Value;
    }
    /**
     * Getter method for autoText3.
     *
     * @return the autoText3
     */
    public String getAutoText3() {
        return autoText3;
    }
    /**
     * Setter method for autoText3.
     *
     * @param autoText3 Set for autoText3
     */
    public void setAutoText3(String autoText3) {
        this.autoText3 = autoText3;
    }
    /**
     * Getter method for costNetAmount.
     *
     * @return the costNetAmount
     */
    public String getCostNetAmount() {
        return costNetAmount;
    }
    /**
     * Setter method for costNetAmount.
     *
     * @param costNetAmount Set for costNetAmount
     */
    public void setCostNetAmount(String costNetAmount) {
        this.costNetAmount = costNetAmount;
    }
    /**
     * Getter method for netAmountCurrCd.
     *
     * @return the netAmountCurrCd
     */
    public String getNetAmountCurrCd() {
        return netAmountCurrCd;
    }
    /**
     * Setter method for netAmountCurrCd.
     *
     * @param netAmountCurrCd Set for netAmountCurrCd
     */
    public void setNetAmountCurrCd(String netAmountCurrCd) {
        this.netAmountCurrCd = netAmountCurrCd;
    }
    /**
     * Getter method for costFreight.
     *
     * @return the costFreight
     */
    public String getCostFreight() {
        return costFreight;
    }
    /**
     * Setter method for costFreight.
     *
     * @param costFreight Set for costFreight
     */
    public void setCostFreight(String costFreight) {
        this.costFreight = costFreight;
    }
    /**
     * Getter method for freightCurrCd.
     *
     * @return the freightCurrCd
     */
    public String getFreightCurrCd() {
        return freightCurrCd;
    }
    /**
     * Setter method for freightCurrCd.
     *
     * @param freightCurrCd Set for freightCurrCd
     */
    public void setFreightCurrCd(String freightCurrCd) {
        this.freightCurrCd = freightCurrCd;
    }
    /**
     * Getter method for costInsurance.
     *
     * @return the costInsurance
     */
    public String getCostInsurance() {
        return costInsurance;
    }
    /**
     * Setter method for costInsurance.
     *
     * @param costInsurance Set for costInsurance
     */
    public void setCostInsurance(String costInsurance) {
        this.costInsurance = costInsurance;
    }
    /**
     * Getter method for insuranceCurrCd.
     *
     * @return the insuranceCurrCd
     */
    public String getInsuranceCurrCd() {
        return insuranceCurrCd;
    }
    /**
     * Setter method for insuranceCurrCd.
     *
     * @param insuranceCurrCd Set for insuranceCurrCd
     */
    public void setInsuranceCurrCd(String insuranceCurrCd) {
        this.insuranceCurrCd = insuranceCurrCd;
    }
    /**
     * Getter method for costSubTotal.
     *
     * @return the costSubTotal
     */
    public String getCostSubTotal() {
        return costSubTotal;
    }
    /**
     * Setter method for costSubTotal.
     *
     * @param costSubTotal Set for costSubTotal
     */
    public void setCostSubTotal(String costSubTotal) {
        this.costSubTotal = costSubTotal;
    }
    /**
     * Getter method for subTotalCurrCd.
     *
     * @return the subTotalCurrCd
     */
    public String getSubTotalCurrCd() {
        return subTotalCurrCd;
    }
    /**
     * Setter method for subTotalCurrCd.
     *
     * @param subTotalCurrCd Set for subTotalCurrCd
     */
    public void setSubTotalCurrCd(String subTotalCurrCd) {
        this.subTotalCurrCd = subTotalCurrCd;
    }
    /**
     * Getter method for vatDisplay1.
     *
     * @return the vatDisplay1
     */
    public String getVatDisplay1() {
        return vatDisplay1;
    }
    /**
     * Setter method for vatDisplay1.
     *
     * @param vatDisplay1 Set for vatDisplay1
     */
    public void setVatDisplay1(String vatDisplay1) {
        this.vatDisplay1 = vatDisplay1;
    }
    /**
     * Getter method for vatPercentage.
     *
     * @return the vatPercentage
     */
    public String getVatPercentage() {
        return vatPercentage;
    }
    /**
     * Setter method for vatPercentage.
     *
     * @param vatPercentage Set for vatPercentage
     */
    public void setVatPercentage(String vatPercentage) {
        this.vatPercentage = vatPercentage;
    }
    /**
     * Getter method for vatDisplay2.
     *
     * @return the vatDisplay2
     */
    public String getVatDisplay2() {
        return vatDisplay2;
    }
    /**
     * Setter method for vatDisplay2.
     *
     * @param vatDisplay2 Set for vatDisplay2
     */
    public void setVatDisplay2(String vatDisplay2) {
        this.vatDisplay2 = vatDisplay2;
    }
    /**
     * Getter method for costVat.
     *
     * @return the costVat
     */
    public String getCostVat() {
        return costVat;
    }
    /**
     * Setter method for costVat.
     *
     * @param costVat Set for costVat
     */
    public void setCostVat(String costVat) {
        this.costVat = costVat;
    }
    /**
     * Getter method for vatCurrCd.
     *
     * @return the vatCurrCd
     */
    public String getVatCurrCd() {
        return vatCurrCd;
    }
    /**
     * Setter method for vatCurrCd.
     *
     * @param vatCurrCd Set for vatCurrCd
     */
    public void setVatCurrCd(String vatCurrCd) {
        this.vatCurrCd = vatCurrCd;
    }
    /**
     * Getter method for handlingChargeDisplay.
     *
     * @return the handlingChargeDisplay
     */
    public String getHandlingChargeDisplay() {
        return handlingChargeDisplay;
    }
    /**
     * Setter method for handlingChargeDisplay.
     *
     * @param handlingChargeDisplay Set for handlingChargeDisplay
     */
    public void setHandlingChargeDisplay(String handlingChargeDisplay) {
        this.handlingChargeDisplay = handlingChargeDisplay;
    }
    /**
     * Getter method for costHandlingCharge.
     *
     * @return the costHandlingCharge
     */
    public String getCostHandlingCharge() {
        return costHandlingCharge;
    }
    /**
     * Setter method for costHandlingCharge.
     *
     * @param costHandlingCharge Set for costHandlingCharge
     */
    public void setCostHandlingCharge(String costHandlingCharge) {
        this.costHandlingCharge = costHandlingCharge;
    }
    /**
     * Getter method for handlingChargeCurrCd.
     *
     * @return the handlingChargeCurrCd
     */
    public String getHandlingChargeCurrCd() {
        return handlingChargeCurrCd;
    }
    /**
     * Setter method for handlingChargeCurrCd.
     *
     * @param handlingChargeCurrCd Set for handlingChargeCurrCd
     */
    public void setHandlingChargeCurrCd(String handlingChargeCurrCd) {
        this.handlingChargeCurrCd = handlingChargeCurrCd;
    }
    /**
     * Getter method for freeAdditionalChargeNm.
     *
     * @return the freeAdditionalChargeNm
     */
    public String getFreeAdditionalChargeNm() {
        return freeAdditionalChargeNm;
    }
    /**
     * Setter method for freeAdditionalChargeNm.
     *
     * @param freeAdditionalChargeNm Set for freeAdditionalChargeNm
     */
    public void setFreeAdditionalChargeNm(String freeAdditionalChargeNm) {
        this.freeAdditionalChargeNm = freeAdditionalChargeNm;
    }
    /**
     * Getter method for costAdditionalCharge.
     *
     * @return the costAdditionalCharge
     */
    public String getCostAdditionalCharge() {
        return costAdditionalCharge;
    }
    /**
     * Setter method for costAdditionalCharge.
     *
     * @param costAdditionalCharge Set for costAdditionalCharge
     */
    public void setCostAdditionalCharge(String costAdditionalCharge) {
        this.costAdditionalCharge = costAdditionalCharge;
    }
    /**
     * Getter method for freeAdditionalChargeCurrCd.
     *
     * @return the freeAdditionalChargeCurrCd
     */
    public String getFreeAdditionalChargeCurrCd() {
        return freeAdditionalChargeCurrCd;
    }
    /**
     * Setter method for freeAdditionalChargeCurrCd.
     *
     * @param freeAdditionalChargeCurrCd Set for freeAdditionalChargeCurrCd
     */
    public void setFreeAdditionalChargeCurrCd(String freeAdditionalChargeCurrCd) {
        this.freeAdditionalChargeCurrCd = freeAdditionalChargeCurrCd;
    }
    /**
     * Getter method for totalInvoiceAmountCurrCd.
     *
     * @return the totalInvoiceAmountCurrCd
     */
    public String getTotalInvoiceAmountCurrCd() {
        return totalInvoiceAmountCurrCd;
    }
    /**
     * Setter method for totalInvoiceAmountCurrCd.
     *
     * @param totalInvoiceAmountCurrCd Set for totalInvoiceAmountCurrCd
     */
    public void setTotalInvoiceAmountCurrCd(String totalInvoiceAmountCurrCd) {
        this.totalInvoiceAmountCurrCd = totalInvoiceAmountCurrCd;
    }
    /**
     * Getter method for costNoChargeDisplay.
     *
     * @return the costNoChargeDisplay
     */
    public String getCostNoChargeDisplay() {
        return costNoChargeDisplay;
    }
    /**
     * Setter method for costNoChargeDisplay.
     *
     * @param costNoChargeDisplay Set for costNoChargeDisplay
     */
    public void setCostNoChargeDisplay(String costNoChargeDisplay) {
        this.costNoChargeDisplay = costNoChargeDisplay;
    }

    /**
     * Getter method for noChargeCurr.
     *
     * @return the noChargeCurr
     */
    public String getNoChargeCurr() {
        return noChargeCurr;
    }
    /**
     * Setter method for noChargeCurr.
     *
     * @param noChargeCurr Set for noChargeCurr
     */
    public void setNoChargeCurr(String noChargeCurr) {
        this.noChargeCurr = noChargeCurr;
    }
    /**
     * Getter method for autoText4.
     *
     * @return the autoText4
     */
    public InputStream getAutoText4() {
        return autoText4;
    }
    /**
     * Setter method for autoText4.
     *
     * @param autoText4 Set for autoText4
     */
    public void setAutoText4(InputStream autoText4) {
        this.autoText4 = autoText4;
    }
    /**
     * Getter method for autoText5.
     *
     * @return the autoText5
     */
    public InputStream getAutoText5() {
        return autoText5;
    }
    /**
     * Setter method for autoText5.
     *
     * @param autoText5 Set for autoText5
     */
    public void setAutoText5(InputStream autoText5) {
        this.autoText5 = autoText5;
    }
    /**
     * Getter method for autoText6.
     *
     * @return the autoText6
     */
    public InputStream getAutoText6() {
        return autoText6;
    }
    /**
     * Setter method for autoText6.
     *
     * @param autoText6 Set for autoText6
     */
    public void setAutoText6(InputStream autoText6) {
        this.autoText6 = autoText6;
    }
    /**
     * Getter method for master7.
     *
     * @return the master7
     */
    public String getMaster7() {
        return master7;
    }
    /**
     * Setter method for master7.
     *
     * @param master7 Set for master7
     */
    public void setMaster7(String master7) {
        this.master7 = master7;
    }
    /**
     * Getter method for master8.
     *
     * @return the master8
     */
    public String getMaster8() {
        return master8;
    }
    /**
     * Setter method for master8.
     *
     * @param master8 Set for master8
     */
    public void setMaster8(String master8) {
        this.master8 = master8;
    }
    /**
     * Getter method for costTotalInvoiceAmount.
     *
     * @return the costTotalInvoiceAmount
     */
    public String getCostTotalInvoiceAmount() {
        return costTotalInvoiceAmount;
    }
    /**
     * Setter method for costTotalInvoiceAmount.
     *
     * @param costTotalInvoiceAmount Set for costTotalInvoiceAmount
     */
    public void setCostTotalInvoiceAmount(String costTotalInvoiceAmount) {
        this.costTotalInvoiceAmount = costTotalInvoiceAmount;
    }
    /**
     * Getter method for costNoChargeAmount.
     *
     * @return the costNoChargeAmount
     */
    public String getCostNoChargeAmount() {
        return costNoChargeAmount;
    }
    /**
     * Setter method for costNoChargeAmount.
     *
     * @param costNoChargeAmount Set for costNoChargeAmount
     */
    public void setCostNoChargeAmount(String costNoChargeAmount) {
        this.costNoChargeAmount = costNoChargeAmount;
    }
    
}
