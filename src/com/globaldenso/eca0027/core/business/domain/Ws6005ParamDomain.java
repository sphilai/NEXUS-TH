/*
 * Project : NEXUS_XPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The domain class that contains the request parameters of Ws6005.
 * <br />Ws6005のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws6005ParamDomain {

    /**
     * Invoice No.
     */
    @XmlElement(name = "invoiceNo")
    private String invoiceNo;

    /**
     * Customer No.
     */
    @XmlElement(name = "customerNo")
    private String customerCd;

    /**
     * Ship to No.
     */
    @XmlElement(name = "shipToNo")
    private String shipToNo;

    /**
     * Date of Issued Document
     */
    @XmlElement(name = "dateOfIssuedDocument")
    private String dateOfIssuedDocument;

    // 2014/11/18 DNJP.Kawamura ST074対応 START >>>>>
    /**
     * D/D No.
     */
    @XmlElement(name = "DDNo")
    private String dDNo;
    // 2014/11/18 DNJP.Kawamura ST074対応 END <<<<<
    
    /**
     * Shipped Date
     */
    @XmlElement(name = "shippedDate")
    private String shippedDate;

    /**
     * Estimated Arrival Date
     */
    @XmlElement(name = "estimatedArrivalDate")
    private String estimatedArrivalDate;

    /**
     * Estimated Arrival Time
     */
    @XmlElement(name = "estimatedArrivalTime")
    private String estimatedArrivalTime;

    /**
     * Ship to Name
     */
    @XmlElement(name = "shipToName")
    private String shipToName;

    /**
     * Ship to Address1
     */
    @XmlElement(name = "shipToAddress1")
    private String shipToAddress1;

    /**
     * Ship to Address2
     */
    @XmlElement(name = "shipToAddress2")
    private String shipToAddress2;

    /**
     * Ship to Address3
     */
    @XmlElement(name = "shipToAddress3")
    private String shipToAddress3;

    /**
     * Ship to Country Code
     */
    @XmlElement(name = "shipToCountryCode")
    private String shipToCountryCode;

    /**
     * No. of Cartons
     */
    @XmlElement(name = "noOfCartons")
    private String noOfCartons;

    /**
     * Total Gross Weight
     */
    @XmlElement(name = "totalGrossWeight")
    private String totalGrossWeight;

    /**
     * Total Net Weight
     */
    @XmlElement(name = "totalNetWeight")
    private String totalNetWeight;

    /**
     * Weight Unit
     */
    @XmlElement(name = "weightUnit")
    private String weightUnit;

    /**
     * Weight Unit on Doc.
     */
    @XmlElement(name = "weightUnitonDoc")
    private String weightUnitonDoc;

    /**
     * Total Volume
     */
    @XmlElement(name = "totalVolume")
    private String totalVolume;

    /**
     * Carrier Name
     */
    @XmlElement(name = "carrierName")
    private String carrierName;

    /**
     * Carrier Address1
     */
    @XmlElement(name = "carrierAddress1")
    private String carrierAddress1;

    /**
     * Carrier Address2
     */
    @XmlElement(name = "carrierAddress2")
    private String carrierAddress2;

    /**
     * Carrier Address3
     */
    @XmlElement(name = "carrierAddress3")
    private String carrierAddress3;

    /**
     * Carrier Country Code
     */
    @XmlElement(name = "carrierCountryCode")
    private String carrierCountryCode;

    /**
     * Special Infomation
     */
    @XmlElement(name = "specialInfomation")
    private String specialInfomation;

    /**
     * Special Infomation1
     */
    @XmlElement(name = "specialInfomation1")
    private String specialInfomation1;

    /**
     * Special Infomation2
     */
    @XmlElement(name = "specialInfomation2")
    private String specialInfomation2;

    /**
     * Sender Name
     */
    @XmlElement(name = "senderName")
    private String senderName;

    /**
     * Sender Address1
     */
    @XmlElement(name = "senderAddress1")
    private String senderAddress1;

    /**
     * Sender Address2
     */
    @XmlElement(name = "senderAddress2")
    private String senderAddress2;

    /**
     * Sender Address3
     */
    @XmlElement(name = "senderAddress3")
    private String senderAddress3;

    /**
     * Sender Country Code
     */
    @XmlElement(name = "senderCountryCode")
    private String senderCountryCode;

    /**
     * Biling Company VAT No.
     */
    @XmlElement(name = "bilingCompanyVatNo")
    private String bilingCompanyVatNo;

    /**
     * Billing Tel No.
     */
    @XmlElement(name = "billingTelNo")
    private String billingTelNo;

    /**
     * Billing Fax No.
     */
    @XmlElement(name = "billingFaxNo")
    private String billingFaxNo;

    /**
     * Accountee No.
     */
    @XmlElement(name = "accounteeNo")
    private String accounteeNo;

    /**
     * Accountee Name
     */
    @XmlElement(name = "accounteeName")
    private String accounteeName;

    /**
     * Accountee Address1
     */
    @XmlElement(name = "accounteeAddress1")
    private String accounteeAddress1;

    /**
     * Accountee Address2
     */
    @XmlElement(name = "accounteeAddress2")
    private String accounteeAddress2;

    /**
     * Accountee Address3
     */
    @XmlElement(name = "accounteeAddress3")
    private String accounteeAddress3;

    /**
     * Accountee Country Code
     */
    @XmlElement(name = "accounteeCountryCode")
    private String accounteeCountryCode;

    /**
     * Payment Terms
     */
    @XmlElement(name = "paymentTerms")
    private String paymentTerms;

    /**
     * Freight Status
     */
    @XmlElement(name = "freightStatus")
    private String freightStatus;

    /**
     * Trade Terms
     */
    @XmlElement(name = "tradeTerms")
    private String tradeTerms;

    /**
     * Delivery Point
     */
    @XmlElement(name = "deliveryPoint")
    private String deliveryPoint;

    /**
     * Price Terms
     */
    @XmlElement(name = "priceTerms")
    private String priceTerms;

    /**
     * Bank Name
     */
    @XmlElement(name = "bankName")
    private String bankName;

    /**
     * Bank Address1
     */
    @XmlElement(name = "bankAddress1")
    private String bankAddress1;

    /**
     * Bank Address2
     */
    @XmlElement(name = "bankAddress2")
    private String bankAddress2;

    /**
     * Bank Address3
     */
    @XmlElement(name = "bankAddress3")
    private String bankAddress3;

    /**
     * Bank Account No.
     */
    @XmlElement(name = "bankAccountNo")
    private String bankAccountNo;

    /**
     * Invoice Authorized Name
     */
    @XmlElement(name = "invoiceAuthorizedName")
    private String invoiceAuthorizedName;

    /**
     * Invoice Authorized Position
     */
    @XmlElement(name = "invoiceAuthorizedPosition")
    private String invoiceAuthorizedPosition;

    /**
     * Invoice Amount
     */
    @XmlElement(name = "invoiceAmount")
    private String invoiceAmount;

    /**
     * Invoice Amount Cur. CD 3Digit
     */
    @XmlElement(name = "invoiceAmountCurCd3Digit")
    private String invoiceAmountCurCd3Digit;

    /**
     * Tax
     */
    @XmlElement(name = "tax")
    private String tax;

    /**
     * Tax(%)
     */
    @XmlElement(name = "taxPercent")
    private String taxpc;

    /**
     * Insurance
     */
    @XmlElement(name = "insurance")
    private String insurance;

    /**
     * Freight
     */
    @XmlElement(name = "freight")
    private String freight;

    /**
     * Total Volume2
     * ADD UT395
     */
    @XmlElement(name = "totalVolume2")
    private String totalVolume2;

    /**
     * TYPE OF SHIPMENT<br />
     * 出荷タイプ
     */
    @XmlElement(name = "typeOfShipment")
    private String typeOfShipment;

    /**
     * Description information<br />
     * EDT47PR用情報
     */
    @XmlElementWrapper(name = "eDT47PRList")
    @XmlElement(name = "eDT47PRItem")
    private List<? extends Ws6005ParamEDT47PRDomain> eDT47PRList;

    /**
     * Description information<br />
     * EDT45PR用情報
     */
    @XmlElementWrapper(name = "eDT45PRList")
    @XmlElement(name = "eDT45PRItem")
    private List<? extends Ws6005ParamEDT45PRDomain> eDT45PRList;
    
    /**
     * common library
     * 共通ライブラリ名
     */
    @XmlElement(name = "libInvDb")
    private String libInvDb;

    /**
     * OGC code
     * 拠点コード（CIGMA内）
     */
    @XmlElement(name = "ogccd")
    private String ogccd;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6005ParamDomain() {
        super();
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
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for shipToNo.
     *
     * @return the shipToNo
     */
    public String getShipToNo() {
        return shipToNo;
    }

    /**
     * Setter method for shipToNo.
     *
     * @param shipToNo Set for shipToNo
     */
    public void setShipToNo(String shipToNo) {
        this.shipToNo = shipToNo;
    }

    /**
     * Getter method for dateOfIssuedDocument.
     *
     * @return the dateOfIssuedDocument
     */
    public String getDateOfIssuedDocument() {
        return dateOfIssuedDocument;
    }

    /**
     * Setter method for dateOfIssuedDocument.
     *
     * @param dateOfIssuedDocument Set for dateOfIssuedDocument
     */
    public void setDateOfIssuedDocument(String dateOfIssuedDocument) {
        this.dateOfIssuedDocument = dateOfIssuedDocument;
    }

    // 2014/11/18 DNJP.Kawamura ST074対応 START >>>>>
    /**
     * <p>Getter method for dDNo.</p>
     *
     * @return the dDNo
     */
    public String getDDNo() {
        return dDNo;
    }

    /**
     * <p>Setter method for dDNo.</p>
     *
     * @param no Set for dDNo
     */
    public void setDDNo(String no) {
        dDNo = no;
    }
    // 2014/11/18 DNJP.Kawamura ST074対応 END <<<<<

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
     * Getter method for estimatedArrivalDate.
     *
     * @return the estimatedArrivalDate
     */
    public String getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    /**
     * Setter method for estimatedArrivalDate.
     *
     * @param estimatedArrivalDate Set for estimatedArrivalDate
     */
    public void setEstimatedArrivalDate(String estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    /**
     * Getter method for estimatedArrivalTime.
     *
     * @return the estimatedArrivalTime
     */
    public String getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    /**
     * Setter method for estimatedArrivalTime.
     *
     * @param estimatedArrivalTime Set for estimatedArrivalTime
     */
    public void setEstimatedArrivalTime(String estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    /**
     * Getter method for shipToName.
     *
     * @return the shipToName
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Setter method for shipToName.
     *
     * @param shipToName Set for shipToName
     */
    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    /**
     * Getter method for shipToAddress1.
     *
     * @return the shipToAddress1
     */
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Setter method for shipToAddress1.
     *
     * @param shipToAddress1 Set for shipToAddress1
     */
    public void setShipToAddress1(String shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }

    /**
     * Getter method for shipToAddress2.
     *
     * @return the shipToAddress2
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Setter method for shipToAddress2.
     *
     * @param shipToAddress2 Set for shipToAddress2
     */
    public void setShipToAddress2(String shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }

    /**
     * Getter method for shipToAddress3.
     *
     * @return the shipToAddress3
     */
    public String getShipToAddress3() {
        return shipToAddress3;
    }

    /**
     * Setter method for shipToAddress3.
     *
     * @param shipToAddress3 Set for shipToAddress3
     */
    public void setShipToAddress3(String shipToAddress3) {
        this.shipToAddress3 = shipToAddress3;
    }

    /**
     * Getter method for shipToCountryCode.
     *
     * @return the shipToCountryCode
     */
    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    /**
     * Setter method for shipToCountryCode.
     *
     * @param shipToCountryCode Set for shipToCountryCode
     */
    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    /**
     * Getter method for noOfCartons.
     *
     * @return the noOfCartons
     */
    public String getNoOfCartons() {
        return noOfCartons;
    }

    /**
     * Setter method for noOfCartons.
     *
     * @param noOfCartons Set for noOfCartons
     */
    public void setNoOfCartons(String noOfCartons) {
        this.noOfCartons = noOfCartons;
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
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for weightUnitonDoc.
     *
     * @return the weightUnitonDoc
     */
    public String getWeightUnitonDoc() {
        return weightUnitonDoc;
    }

    /**
     * Setter method for weightUnitonDoc.
     *
     * @param weightUnitonDoc Set for weightUnitonDoc
     */
    public void setWeightUnitonDoc(String weightUnitonDoc) {
        this.weightUnitonDoc = weightUnitonDoc;
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
     * Getter method for carrierName.
     *
     * @return the carrierName
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Setter method for carrierName.
     *
     * @param carrierName Set for carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Getter method for carrierAddress1.
     *
     * @return the carrierAddress1
     */
    public String getCarrierAddress1() {
        return carrierAddress1;
    }

    /**
     * Setter method for carrierAddress1.
     *
     * @param carrierAddress1 Set for carrierAddress1
     */
    public void setCarrierAddress1(String carrierAddress1) {
        this.carrierAddress1 = carrierAddress1;
    }

    /**
     * Getter method for carrierAddress2.
     *
     * @return the carrierAddress2
     */
    public String getCarrierAddress2() {
        return carrierAddress2;
    }

    /**
     * Setter method for carrierAddress2.
     *
     * @param carrierAddress2 Set for carrierAddress2
     */
    public void setCarrierAddress2(String carrierAddress2) {
        this.carrierAddress2 = carrierAddress2;
    }

    /**
     * Getter method for carrierAddress3.
     *
     * @return the carrierAddress3
     */
    public String getCarrierAddress3() {
        return carrierAddress3;
    }

    /**
     * Setter method for carrierAddress3.
     *
     * @param carrierAddress3 Set for carrierAddress3
     */
    public void setCarrierAddress3(String carrierAddress3) {
        this.carrierAddress3 = carrierAddress3;
    }

    /**
     * Getter method for carrierCountryCode.
     *
     * @return the carrierCountryCode
     */
    public String getCarrierCountryCode() {
        return carrierCountryCode;
    }

    /**
     * Setter method for carrierCountryCode.
     *
     * @param carrierCountryCode Set for carrierCountryCode
     */
    public void setCarrierCountryCode(String carrierCountryCode) {
        this.carrierCountryCode = carrierCountryCode;
    }

    /**
     * Getter method for specialInfomation.
     *
     * @return the specialInfomation
     */
    public String getSpecialInfomation() {
        return specialInfomation;
    }

    /**
     * Setter method for specialInfomation.
     *
     * @param specialInfomation Set for specialInfomation
     */
    public void setSpecialInfomation(String specialInfomation) {
        this.specialInfomation = specialInfomation;
    }

    /**
     * <p>Getter method for specialInfomation1.</p>
     *
     * @return the specialInfomation1
     */
    public String getSpecialInfomation1() {
        return specialInfomation1;
    }

    /**
     * <p>Setter method for specialInfomation1.</p>
     *
     * @param specialInfomation1 Set for specialInfomation1
     */
    public void setSpecialInfomation1(String specialInfomation1) {
        this.specialInfomation1 = specialInfomation1;
    }

    /**
     * <p>Getter method for specialInfomation2.</p>
     *
     * @return the specialInfomation2
     */
    public String getSpecialInfomation2() {
        return specialInfomation2;
    }

    /**
     * <p>Setter method for specialInfomation2.</p>
     *
     * @param specialInfomation2 Set for specialInfomation2
     */
    public void setSpecialInfomation2(String specialInfomation2) {
        this.specialInfomation2 = specialInfomation2;
    }

    /**
     * Getter method for senderName.
     *
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Setter method for senderName.
     *
     * @param senderName Set for senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Getter method for senderAddress1.
     *
     * @return the senderAddress1
     */
    public String getSenderAddress1() {
        return senderAddress1;
    }

    /**
     * Setter method for senderAddress1.
     *
     * @param senderAddress1 Set for senderAddress1
     */
    public void setSenderAddress1(String senderAddress1) {
        this.senderAddress1 = senderAddress1;
    }

    /**
     * Getter method for senderAddress2.
     *
     * @return the senderAddress2
     */
    public String getSenderAddress2() {
        return senderAddress2;
    }

    /**
     * Setter method for senderAddress2.
     *
     * @param senderAddress2 Set for senderAddress2
     */
    public void setSenderAddress2(String senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }

    /**
     * Getter method for senderAddress3.
     *
     * @return the senderAddress3
     */
    public String getSenderAddress3() {
        return senderAddress3;
    }

    /**
     * Setter method for senderAddress3.
     *
     * @param senderAddress3 Set for senderAddress3
     */
    public void setSenderAddress3(String senderAddress3) {
        this.senderAddress3 = senderAddress3;
    }

    /**
     * Getter method for senderCountryCode.
     *
     * @return the senderCountryCode
     */
    public String getSenderCountryCode() {
        return senderCountryCode;
    }

    /**
     * Setter method for senderCountryCode.
     *
     * @param senderCountryCode Set for senderCountryCode
     */
    public void setSenderCountryCode(String senderCountryCode) {
        this.senderCountryCode = senderCountryCode;
    }

    /**
     * Getter method for bilingCompanyVatNo.
     *
     * @return the bilingCompanyVatNo
     */
    public String getBilingCompanyVatNo() {
        return bilingCompanyVatNo;
    }

    /**
     * Setter method for bilingCompanyVatNo.
     *
     * @param bilingCompanyVatNo Set for bilingCompanyVatNo
     */
    public void setBilingCompanyVatNo(String bilingCompanyVatNo) {
        this.bilingCompanyVatNo = bilingCompanyVatNo;
    }

    /**
     * Getter method for billingTelNo.
     *
     * @return the billingTelNo
     */
    public String getBillingTelNo() {
        return billingTelNo;
    }

    /**
     * Setter method for billingTelNo.
     *
     * @param billingTelNo Set for billingTelNo
     */
    public void setBillingTelNo(String billingTelNo) {
        this.billingTelNo = billingTelNo;
    }

    /**
     * Getter method for billingFaxNo.
     *
     * @return the billingFaxNo
     */
    public String getBillingFaxNo() {
        return billingFaxNo;
    }

    /**
     * Setter method for billingFaxNo.
     *
     * @param billingFaxNo Set for billingFaxNo
     */
    public void setBillingFaxNo(String billingFaxNo) {
        this.billingFaxNo = billingFaxNo;
    }

    /**
     * Getter method for accounteeNo.
     *
     * @return the accounteeNo
     */
    public String getAccounteeNo() {
        return accounteeNo;
    }

    /**
     * Setter method for accounteeNo.
     *
     * @param accounteeNo Set for accounteeNo
     */
    public void setAccounteeNo(String accounteeNo) {
        this.accounteeNo = accounteeNo;
    }

    /**
     * Getter method for accounteeName.
     *
     * @return the accounteeName
     */
    public String getAccounteeName() {
        return accounteeName;
    }

    /**
     * Setter method for accounteeName.
     *
     * @param accounteeName Set for accounteeName
     */
    public void setAccounteeName(String accounteeName) {
        this.accounteeName = accounteeName;
    }

    /**
     * Getter method for accounteeAddress1.
     *
     * @return the accounteeAddress1
     */
    public String getAccounteeAddress1() {
        return accounteeAddress1;
    }

    /**
     * Setter method for accounteeAddress1.
     *
     * @param accounteeAddress1 Set for accounteeAddress1
     */
    public void setAccounteeAddress1(String accounteeAddress1) {
        this.accounteeAddress1 = accounteeAddress1;
    }

    /**
     * Getter method for accounteeAddress2.
     *
     * @return the accounteeAddress2
     */
    public String getAccounteeAddress2() {
        return accounteeAddress2;
    }

    /**
     * Setter method for accounteeAddress2.
     *
     * @param accounteeAddress2 Set for accounteeAddress2
     */
    public void setAccounteeAddress2(String accounteeAddress2) {
        this.accounteeAddress2 = accounteeAddress2;
    }

    /**
     * Getter method for accounteeAddress3.
     *
     * @return the accounteeAddress3
     */
    public String getAccounteeAddress3() {
        return accounteeAddress3;
    }

    /**
     * Setter method for accounteeAddress3.
     *
     * @param accounteeAddress3 Set for accounteeAddress3
     */
    public void setAccounteeAddress3(String accounteeAddress3) {
        this.accounteeAddress3 = accounteeAddress3;
    }

    /**
     * Getter method for accounteeCountryCode.
     *
     * @return the accounteeCountryCode
     */
    public String getAccounteeCountryCode() {
        return accounteeCountryCode;
    }

    /**
     * Setter method for accounteeCountryCode.
     *
     * @param accounteeCountryCode Set for accounteeCountryCode
     */
    public void setAccounteeCountryCode(String accounteeCountryCode) {
        this.accounteeCountryCode = accounteeCountryCode;
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
     * Getter method for freightStatus.
     *
     * @return the freightStatus
     */
    public String getFreightStatus() {
        return freightStatus;
    }

    /**
     * Setter method for freightStatus.
     *
     * @param freightStatus Set for freightStatus
     */
    public void setFreightStatus(String freightStatus) {
        this.freightStatus = freightStatus;
    }

    /**
     * Getter method for tradeTerms.
     *
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * Setter method for tradeTerms.
     *
     * @param tradeTerms Set for tradeTerms
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
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
     * Getter method for priceTerms.
     *
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * Setter method for priceTerms.
     *
     * @param priceTerms Set for priceTerms
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * Getter method for bankName.
     *
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter method for bankName.
     *
     * @param bankName Set for bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter method for bankAddress1.
     *
     * @return the bankAddress1
     */
    public String getBankAddress1() {
        return bankAddress1;
    }

    /**
     * Setter method for bankAddress1.
     *
     * @param bankAddress1 Set for bankAddress1
     */
    public void setBankAddress1(String bankAddress1) {
        this.bankAddress1 = bankAddress1;
    }

    /**
     * Getter method for bankAddress2.
     *
     * @return the bankAddress2
     */
    public String getBankAddress2() {
        return bankAddress2;
    }

    /**
     * Setter method for bankAddress2.
     *
     * @param bankAddress2 Set for bankAddress2
     */
    public void setBankAddress2(String bankAddress2) {
        this.bankAddress2 = bankAddress2;
    }

    /**
     * Getter method for bankAddress3.
     *
     * @return the bankAddress3
     */
    public String getBankAddress3() {
        return bankAddress3;
    }

    /**
     * Setter method for bankAddress3.
     *
     * @param bankAddress3 Set for bankAddress3
     */
    public void setBankAddress3(String bankAddress3) {
        this.bankAddress3 = bankAddress3;
    }

    /**
     * Getter method for bankAccountNo.
     *
     * @return the bankAccountNo
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * Setter method for bankAccountNo.
     *
     * @param bankAccountNo Set for bankAccountNo
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    /**
     * Getter method for invoiceAuthorizedName.
     *
     * @return the invoiceAuthorizedName
     */
    public String getInvoiceAuthorizedName() {
        return invoiceAuthorizedName;
    }

    /**
     * Setter method for invoiceAuthorizedName.
     *
     * @param invoiceAuthorizedName Set for invoiceAuthorizedName
     */
    public void setInvoiceAuthorizedName(String invoiceAuthorizedName) {
        this.invoiceAuthorizedName = invoiceAuthorizedName;
    }

    /**
     * Getter method for invoiceAuthorizedPosition.
     *
     * @return the invoiceAuthorizedPosition
     */
    public String getInvoiceAuthorizedPosition() {
        return invoiceAuthorizedPosition;
    }

    /**
     * Setter method for invoiceAuthorizedPosition.
     *
     * @param invoiceAuthorizedPosition Set for invoiceAuthorizedPosition
     */
    public void setInvoiceAuthorizedPosition(String invoiceAuthorizedPosition) {
        this.invoiceAuthorizedPosition = invoiceAuthorizedPosition;
    }

    /**
     * Getter method for invoiceAmount.
     *
     * @return the invoiceAmount
     */
    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Setter method for invoiceAmount.
     *
     * @param invoiceAmount Set for invoiceAmount
     */
    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * Getter method for invoiceAmountCurCd3Digit.
     *
     * @return the invoiceAmountCurCd3Digit
     */
    public String getInvoiceAmountCurCd3Digit() {
        return invoiceAmountCurCd3Digit;
    }

    /**
     * Setter method for invoiceAmountCurCd3Digit.
     *
     * @param invoiceAmountCurCd3Digit Set for invoiceAmountCurCd3Digit
     */
    public void setInvoiceAmountCurCd3Digit(String invoiceAmountCurCd3Digit) {
        this.invoiceAmountCurCd3Digit = invoiceAmountCurCd3Digit;
    }

    /**
     * Getter method for tax.
     *
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * Setter method for tax.
     *
     * @param tax Set for tax
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * Getter method for taxpc.
     *
     * @return the taxpc
     */
    public String getTaxpc() {
        return taxpc;
    }

    /**
     * Setter method for taxpc.
     *
     * @param taxpc Set for taxpc
     */
    public void setTaxpc(String taxpc) {
        this.taxpc = taxpc;
    }

    /**
     * Getter method for insurance.
     *
     * @return the insurance
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * Setter method for insurance.
     *
     * @param insurance Set for insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * Getter method for freight.
     *
     * @return the freight
     */
    public String getFreight() {
        return freight;
    }

    /**
     * Setter method for freight.
     *
     * @param freight Set for freight
     */
    public void setFreight(String freight) {
        this.freight = freight;
    }

    /**
     * Getter method for totalVolume2.
     *
     * @return the totalVolume2
     */
    public String getTotalVolume2() {
        return totalVolume2;
    }

    /**
     * Setter method for totalVolume2.
     *
     * @param totalVolume2 Set for totalVolume2
     */
    public void setTotalVolume2(String totalVolume2) {
        this.totalVolume2 = totalVolume2;
    }

    /**
     * <p>Getter method for eDT47PRList.</p>
     *
     * @return the eDT47PRList
     */
    public List<? extends Ws6005ParamEDT47PRDomain> getEDT47PRList() {
        return eDT47PRList;
    }

    /**
     * <p>Setter method for eDT47PRList.</p>
     *
     * @param list Set for eDT47PRList
     */
    public void setEDT47PRList(List<? extends Ws6005ParamEDT47PRDomain> list) {
        eDT47PRList = list;
    }

    /**
     * <p>Getter method for eDT45PRList.</p>
     *
     * @return the eDT45PRList
     */
    public List<? extends Ws6005ParamEDT45PRDomain> getEDT45PRList() {
        return eDT45PRList;
    }

    /**
     * <p>Setter method for eDT45PRList.</p>
     *
     * @param list Set for eDT45PRList
     */
    public void setEDT45PRList(List<? extends Ws6005ParamEDT45PRDomain> list) {
        eDT45PRList = list;
    }

    /**
     * <p>Getter method for libInvDb.</p>
     *
     * @return the libInvDb
     */
    public String getLibInvDb() {
        return libInvDb;
    }

    /**
     * <p>Setter method for libInvDb.</p>
     *
     * @param libInvDb Set for libInvDb
     */
    public void setLibInvDb(String libInvDb) {
        this.libInvDb = libInvDb;
    }

    /**
     * <p>Getter method for ogccd.</p>
     *
     * @return the ogccd
     */
    public String getOgccd() {
        return ogccd;
    }

    /**
     * <p>Setter method for ogccd.</p>
     *
     * @param ogccd Set for ogccd
     */
    public void setOgccd(String ogccd) {
        this.ogccd = ogccd;
    }

    /**
     * Getter method for typeOfShipment.
     *
     * @return the typeOfShipment
     */
    public String getTypeOfShipment() {
        return typeOfShipment;
    }

    /**
     * Setter method for typeOfShipment.
     *
     * @param typeOfShipment Set for typeOfShipment
     */
    public void setTypeOfShipment(String typeOfShipment) {
        this.typeOfShipment = typeOfShipment;
    }
}
