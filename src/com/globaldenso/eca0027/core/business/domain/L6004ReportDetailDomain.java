/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L6004].
 * <br/>帳票【L6004】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L6004ReportDetailDomain extends AbstractDomain {
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /** customerOrderNo */
    private String customerOrderNo = null;
    /** customerPartNo */
    private String customerPartNo = null;
    /** description1 */
    private String description1 = null;
    /** description2 */
    private String description2 = null;
    /** lineNo */
    private String lineNo = null;
    /** free1 */
    private String free1 = null;
    /** free2 */
    private String free2 = null;
    /** free3 */
    private String free3 = null;
    /** countryOfOrigin */
    private String countryOfOrigin = null;
    /** partNo */
    private String partNo = null;
    /** pkg */
    private String pkg = null;
    /** unit */
    private String unit = null;
    /** qty */
    private String qty = null;
    /** hsCode */
    private String hsCode = null;
    /** cur */
    private String cur = null;
    /** unitPrice */
    private String unitPrice = null;
    /** amount */
    private String amount = null;
    /** kitPnComment */
    private String kitPnComment = null;
    /**
     * Default Constructor
     */
    public L6004ReportDetailDomain() {
    }
    /**
     * Getter method for customerOrderNo.<br />
     * customerOrderNo のゲッターメソッドです。
     *
     * @return the customerOrderNo
     */
    public String getCustomerOrderNo() {
        return customerOrderNo;
    }
    /**
     * Getter method for customerPartNo.<br />
     * customerOrderNo のセッターメソッドです。
     *
     * @param customerOrderNo Set for customerOrderNo
     */
    public void setCustomerOrderNo(String customerOrderNo) {
        this.customerOrderNo = customerOrderNo;
    }
    /**
     * Getter method for customerPartNo.<br />
     * customerPartNo のゲッターメソッドです。
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }
    /**
     * Setter method for customerPartNo.<br />
     * customerPartNo のセッターメソッドです。
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }
    /**
     * Getter method for description1.<br />
     * description1 のゲッターメソッドです。
     *
     * @return the description1
     */
    public String getDescription1() {
        return description1;
    }
    /**
     * Setter method for description1.<br />
     * description1 のセッターメソッドです。
     *
     * @param description1 Set for description1
     */
    public void setDescription1(String description1) {
        this.description1 = description1;
    }
    /**
     * Getter method for description2.<br />
     * description2 のゲッターメソッドです。
     *
     * @return the description2
     */
    public String getDescription2() {
        return description2;
    }
    /**
     * Setter method for description2.<br />
     * description2 のセッターメソッドです。
     *
     * @param description2 Set for description2
     */
    public void setDescription2(String description2) {
        this.description2 = description2;
    }
    /**
     * Getter method for lineNo.<br />
     * lineNo のゲッターメソッドです。
     *
     * @return the lineNo
     */
    public String getLineNo() {
        return lineNo;
    }
    /**
     * Setter method for lineNo.<br />
     * lineNo のセッターメソッドです。
     *
     * @param lineNo Set for lineNo
     */
    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }
    /**
     * Getter method for free1.<br />
     * free1 のゲッターメソッドです。
     *
     * @return the free1
     */
    public String getFree1() {
        return free1;
    }
    /**
     * Setter method for free1.<br />
     * free1 のセッターメソッドです。
     *
     * @param free1 Set for free1
     */
    public void setFree1(String free1) {
        this.free1 = free1;
    }
    /**
     * Getter method for free2.<Br />
     * free2 のゲッターメソッドです。
     *
     * @return the free2
     */
    public String getFree2() {
        return free2;
    }
    /**
     * Setter method for free2.<br />
     * free2 のセッターメソッドです。
     *
     * @param free2 Set for free2
     */
    public void setFree2(String free2) {
        this.free2 = free2;
    }
    /**
     * Getter method for free3.<br />
     * free3 のゲッターメソッドです。
     *
     * @return the free3
     */
    public String getFree3() {
        return free3;
    }
    /**
     * Setter method for free3.<br />
     * free3 のセッターメソッドです。
     *
     * @param free3 Set for free3
     */
    public void setFree3(String free3) {
        this.free3 = free3;
    }
    /**
     * Getter method for countryOfOrigin.<br />
     * countryOfOrigin のゲッターメソッドです。
     *
     * @return the countryOfOrigin
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    /**
     * Setter method for countryOfOrigin.<br />
     * countryOfOrigin のセッターメソッドです。
     *
     * @param countryOfOrigin Set for countryOfOrigin
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    /**
     * Getter method for partNo.<br />
     * partNo のゲッターメソッドです。
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }
    /**
     * Setter method for partNo.<br />
     * partNo のセッターメソッドです。
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }
    /**
     * Getter method for pkg.<br />
     * pkg のゲッターメソッドです。
     *
     * @return the pkg
     */
    public String getPkg() {
        return pkg;
    }
    /**
     * Setter method for pkg.<br />
     * pkg のセッターメソッドです。
     *
     * @param pkg Set for pkg
     */
    public void setPkg(String pkg) {
        this.pkg = pkg;
    }
    /**
     * Getter method for unit.<br />
     * unit のゲッターメソッドです。
     *
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }
    /**
     * Setter method for unit.<br />
     * unit のセッターメソッドです。
     *
     * @param unit Set for unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**
     * Getter method for qty.<br />
     * qty のゲッターメソッドです。
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }
    /**
     * Setter method for qty.<br />
     * qty のセッターメソッドです。
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }
    /**
     * Getter method for hsCode.<br />
     * hsCode のゲッターメソッドです。
     *
     * @return the hsCode
     */
    public String getHsCode() {
        return hsCode;
    }
    /**
     * Setter method for hsCode.<br />
     * hsCode のセッターメソッドです。
     *
     * @param hsCode Set for hsCode
     */
    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }
    /**
     * Getter method for customerOrderNo.<br />
     * cur のゲッターメソッドです。
     *
     * @return the cur
     */
    public String getCur() {
        return cur;
    }
    /**
     * Setter method for cur.<br />
     * cur のセッターメソッドです。
     *
     * @param cur Set for cur
     */
    public void setCur(String cur) {
        this.cur = cur;
    }
    /**
     * Getter method for unitPrice.<br />
     * unitPrice のゲッターメソッドです。
     *
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }
    /**
     * Setter method for unitPrice.<br />
     * unitPrice のセッターメソッドです。
     *
     * @param unitPrice Set for unitPrice
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    /**
     * Getter method for amount.<br />
     * amount のゲッターメソッドです。
     *
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }
    /**
     * Setter method for amount.<br />
     * amount のセッターメソッドです。
     *
     * @param amount Set for amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
    /**
     * Getter method for kitPnComment.<br />
     * kitPnComment のゲッターメソッドです。
     *
     * @return the kitPnComment
     */
    public String getKitPnComment() {
        return kitPnComment;
    }
    /**
     * Setter method for kitPnComment.<br />
     * kitPnComment のセッターメソッドです。
     *
     * @param kitPnComment Set for kitPnComment
     */
    public void setKitPnComment(String kitPnComment) {
        this.kitPnComment = kitPnComment;
    }
}