/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :2014/09/02
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The domain class that stores information repetition of the request parameter of Ws6005.
 * <br />Ws6005のリクエストパラメータの繰り返し情報を格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws6005ParamEDT45PRDomain {

    /**
     * Customer Part No.
     */
    @XmlElement(name = "customerPartNo")
    private String customerPartNo;

    /**
     * Customer P.O. No.
     */
    @XmlElement(name = "customerPoNo")
    private String customerPoNo;

    /**
     * Part No.
     */
    @XmlElement(name = "partNo")
    private String partNo;

    /**
     * Unit of Measure on Document
     */
    @XmlElement(name = "unitOfMeasureOnDocument")
    private String unitOfMeasureOnDocument;

    /**
     * Shipped QTY
     */
    @XmlElement(name = "shippedQty")
    private String shippedQty;

    /**
     * Item Weight
     */
    @XmlElement(name = "itemWeight")
    private String itemWeight;

    /**
     * Net Weight(Item Weight * Shipped QTY)
     */
    @XmlElement(name = "netWeight")
    private String netWeight;

    /**
     * Gross Weight
     */
    @XmlElement(name = "grossWeight")
    private String grossWeight;

    /**
     * Sales Unit Price
     */
    @XmlElement(name = "salesUnitPrice")
    private String salesUnitPrice;

    /**
     * Sales Unit Price Cur. CD 3Digit
     */
    @XmlElement(name = "salesUnitPriceCurCd3Digit")
    private String salesUnitPriceCurCd3Digit;

    /**
     * Net Amount
     */
    @XmlElement(name = "netAmount")
    private String netAmount;
    
    /**
     * cml
     */
    @XmlElement(name = "cml")
    private String cml;
    
    
    /**
     * no of CML
     */
    @XmlElement(name = "noOfCml")
    private String noOfCml;

    /**
     * Freight
     */
    @XmlElement(name = "freight")
    private String freight;
    
    /**
     * Insurance
     */
    @XmlElement(name = "insurance")
    private String insurance;
    
    /**
     * Invoice Amount
     */
    @XmlElement(name = "invoiceAmount")
    private String invoiceAmount;
    
    /**
     * Customer Part Description
     * UT436 ADD
     */
    @XmlElement(name = "itemDescription")
    private String itemDescription;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6005ParamEDT45PRDomain() {
        super();
    }
    
    
    /**
     * <p>Getter method for customerPartNo.</p>
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }

    
    /**
     * <p>Setter method for customerPartNo.</p>
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }


    /**
     * <p>Getter method for customerPoNo.</p>
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }


    /**
     * <p>Setter method for customerPoNo.</p>
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }


    /**
     * <p>Getter method for partNo.</p>
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }


    /**
     * <p>Setter method for partNo.</p>
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }


    /**
     * <p>Getter method for unitOfMeasureOnDocument.</p>
     *
     * @return the unitOfMeasureOnDocument
     */
    public String getUnitOfMeasureOnDocument() {
        return unitOfMeasureOnDocument;
    }


    /**
     * <p>Setter method for unitOfMeasureOnDocument.</p>
     *
     * @param unitOfMeasureOnDocument Set for unitOfMeasureOnDocument
     */
    public void setUnitOfMeasureOnDocument(String unitOfMeasureOnDocument) {
        this.unitOfMeasureOnDocument = unitOfMeasureOnDocument;
    }


    /**
     * <p>Getter method for shippedQty.</p>
     *
     * @return the shippedQty
     */
    public String getShippedQty() {
        return shippedQty;
    }


    /**
     * <p>Setter method for shippedQty.</p>
     *
     * @param shippedQty Set for shippedQty
     */
    public void setShippedQty(String shippedQty) {
        this.shippedQty = shippedQty;
    }


    /**
     * <p>Getter method for itemWeight.</p>
     *
     * @return the itemWeight
     */
    public String getItemWeight() {
        return itemWeight;
    }


    /**
     * <p>Setter method for itemWeight.</p>
     *
     * @param itemWeight Set for itemWeight
     */
    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }


    /**
     * <p>Getter method for netWeight.</p>
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }


    /**
     * <p>Setter method for netWeight.</p>
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }


    /**
     * <p>Getter method for grossWeight.</p>
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }


    /**
     * <p>Setter method for grossWeight.</p>
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }


    /**
     * <p>Getter method for salesUnitPrice.</p>
     *
     * @return the salesUnitPrice
     */
    public String getSalesUnitPrice() {
        return salesUnitPrice;
    }


    /**
     * <p>Setter method for salesUnitPrice.</p>
     *
     * @param salesUnitPrice Set for salesUnitPrice
     */
    public void setSalesUnitPrice(String salesUnitPrice) {
        this.salesUnitPrice = salesUnitPrice;
    }


    /**
     * <p>Getter method for salesUnitPriceCurCd3Digit.</p>
     *
     * @return the salesUnitPriceCurCd3Digit
     */
    public String getSalesUnitPriceCurCd3Digit() {
        return salesUnitPriceCurCd3Digit;
    }


    /**
     * <p>Setter method for salesUnitPriceCurCd3Digit.</p>
     *
     * @param salesUnitPriceCurCd3Digit Set for salesUnitPriceCurCd3Digit
     */
    public void setSalesUnitPriceCurCd3Digit(String salesUnitPriceCurCd3Digit) {
        this.salesUnitPriceCurCd3Digit = salesUnitPriceCurCd3Digit;
    }


    /**
     * <p>Getter method for netAmount.</p>
     *
     * @return the netAmount
     */
    public String getNetAmount() {
        return netAmount;
    }


    /**
     * <p>Setter method for netAmount.</p>
     *
     * @param netAmount Set for netAmount
     */
    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * <p>Getter method for cml.</p>
     *
     * @return the cml
     */
    public String getCml() {
        return cml;
    }


    /**
     * <p>Setter method for cml.</p>
     *
     * @param cml Set for cml
     */
    public void setCml(String cml) {
        this.cml = cml;
    }


    /**
     * <p>Getter method for noOfCml.</p>
     *
     * @return the noOfCml
     */
    public String getNoOfCml() {
        return noOfCml;
    }


    /**
     * <p>Setter method for noOfCml.</p>
     *
     * @param noOfCml Set for noOfCml
     */
    public void setNoOfCml(String noOfCml) {
        this.noOfCml = noOfCml;
    }


    /**
     * <p>Getter method for freight.</p>
     *
     * @return the freight
     */
    public String getFreight() {
        return freight;
    }


    /**
     * <p>Setter method for freight.</p>
     *
     * @param freight Set for freight
     */
    public void setFreight(String freight) {
        this.freight = freight;
    }


    /**
     * <p>Getter method for insurance.</p>
     *
     * @return the insurance
     */
    public String getInsurance() {
        return insurance;
    }


    /**
     * <p>Setter method for insurance.</p>
     *
     * @param insurance Set for insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }


    /**
     * <p>Getter method for invoiceAmount.</p>
     *
     * @return the invoiceAmount
     */
    public String getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * <p>Setter method for invoiceAmount.</p>
     *
     * @param invoiceAmount Set for invoiceAmount
     */
    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }


    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    

    
}
