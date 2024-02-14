/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The domain class that stores information repetition of the request parameter of Ws6001.
 * <br />Ws6001のリクエストパラメータの繰り返し情報を格納するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws6001ParamItemDomain {

    /**
     * Part No.
     */
    @XmlElement(name = "partNo")
    private String partNo;

    /**
     * ETD Due Date
     */
    @XmlElement(name = "etdDueDate")
    private String etdDueDate;

    /**
     * Customer P.O. No.
     */
    @XmlElement(name = "customerPoNo")
    private String customerPoNo;

    /**
     * Customer Part No.
     */
    @XmlElement(name = "customerPartNo")
    private String customerPartNo;

    /**
     * Instructed Shipping QTY
     */
    @XmlElement(name = "instructedShippingQty")
    private String instructedShippingQty;

    /**
     * Shipped QTY
     */
    @XmlElement(name = "shippedQty")
    private String shippedQty;

    /**
     * Sales Company P.O. No.
     */
    @XmlElement(name = "salesCompanyPoNo")
    private String salesCompanyPoNo;

    /**
     * Unit of Measure
     */
    @XmlElement(name = "unitOfMeasure")
    private String unitOfMeasure;

    /**
     * Unit of Measure on Document
     */
    @XmlElement(name = "unitOfMeasureOnDocument")
    private String unitOfMeasureOnDocument;

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
     * Current Warehouse
     */
    @XmlElement(name = "currentWarehouse")
    private String currentWarehouse;

    /**
     * Shipping Lot
     * UT413-3 ADD
     */
    @XmlElement(name = "shippingLot")
    private String shippingLot;

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
    public Ws6001ParamItemDomain() {
        super();
    }

    /**
     * Getter method for partNo.
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Setter method for partNo.
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    /**
     * Getter method for etdDueDate.
     *
     * @return the etdDueDate
     */
    public String getEtdDueDate() {
        return etdDueDate;
    }

    /**
     * Setter method for etdDueDate.
     *
     * @param etdDueDate Set for etdDueDate
     */
    public void setEtdDueDate(String etdDueDate) {
        this.etdDueDate = etdDueDate;
    }

    /**
     * Getter method for customerPoNo.
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * Setter method for customerPoNo.
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * Getter method for customerPartNo.
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }

    /**
     * Setter method for customerPartNo.
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }

    /**
     * Getter method for instructedShippingQty.
     *
     * @return the instructedShippingQty
     */
    public String getInstructedShippingQty() {
        return instructedShippingQty;
    }

    /**
     * Setter method for instructedShippingQty.
     *
     * @param instructedShippingQty Set for instructedShippingQty
     */
    public void setInstructedShippingQty(String instructedShippingQty) {
        this.instructedShippingQty = instructedShippingQty;
    }

    /**
     * Getter method for shippedQty.
     *
     * @return the shippedQty
     */
    public String getShippedQty() {
        return shippedQty;
    }

    /**
     * Setter method for shippedQty.
     *
     * @param shippedQty Set for shippedQty
     */
    public void setShippedQty(String shippedQty) {
        this.shippedQty = shippedQty;
    }

    /**
     * Getter method for salesCompanyPoNo.
     *
     * @return the salesCompanyPoNo
     */
    public String getSalesCompanyPoNo() {
        return salesCompanyPoNo;
    }

    /**
     * Setter method for salesCompanyPoNo.
     *
     * @param salesCompanyPoNo Set for salesCompanyPoNo
     */
    public void setSalesCompanyPoNo(String salesCompanyPoNo) {
        this.salesCompanyPoNo = salesCompanyPoNo;
    }

    /**
     * Getter method for unitOfMeasure.
     *
     * @return the unitOfMeasure
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Setter method for unitOfMeasure.
     *
     * @param unitOfMeasure Set for unitOfMeasure
     */
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Getter method for unitOfMeasureOnDocument.
     *
     * @return the unitOfMeasureOnDocument
     */
    public String getUnitOfMeasureOnDocument() {
        return unitOfMeasureOnDocument;
    }

    /**
     * Setter method for unitOfMeasureOnDocument.
     *
     * @param unitOfMeasureOnDocument Set for unitOfMeasureOnDocument
     */
    public void setUnitOfMeasureOnDocument(String unitOfMeasureOnDocument) {
        this.unitOfMeasureOnDocument = unitOfMeasureOnDocument;
    }

    /**
     * Getter method for salesUnitPrice.
     *
     * @return the salesUnitPrice
     */
    public String getSalesUnitPrice() {
        return salesUnitPrice;
    }

    /**
     * Setter method for salesUnitPrice.
     *
     * @param salesUnitPrice Set for salesUnitPrice
     */
    public void setSalesUnitPrice(String salesUnitPrice) {
        this.salesUnitPrice = salesUnitPrice;
    }

    /**
     * Getter method for salesUnitPriceCurCd3Digit.
     *
     * @return the salesUnitPriceCurCd3Digit
     */
    public String getSalesUnitPriceCurCd3Digit() {
        return salesUnitPriceCurCd3Digit;
    }

    /**
     * Setter method for salesUnitPriceCurCd3Digit.
     *
     * @param salesUnitPriceCurCd3Digit Set for salesUnitPriceCurCd3Digit
     */
    public void setSalesUnitPriceCurCd3Digit(String salesUnitPriceCurCd3Digit) {
        this.salesUnitPriceCurCd3Digit = salesUnitPriceCurCd3Digit;
    }

    /**
     * Getter method for currentWarehouse.
     *
     * @return the currentWarehouse
     */
    public String getCurrentWarehouse() {
        return currentWarehouse;
    }

    /**
     * Setter method for currentWarehouse.
     *
     * @param currentWarehouse Set for currentWarehouse
     */
    public void setCurrentWarehouse(String currentWarehouse) {
        this.currentWarehouse = currentWarehouse;
    }

    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
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
