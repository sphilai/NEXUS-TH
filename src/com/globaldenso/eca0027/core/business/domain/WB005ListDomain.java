/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a List domain of ordering search detailed screen.
 * <br />受注検索詳細画面のListドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB005ListDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ETD DUE DATE
     * <br />船積期限
     */
    private String etdDueDt;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * CUSTOMER DUE DATE
     * <br />顧客納期
     */
    private String customerDueDt;
    
    /**
     * PALLETIZE ALLOC QUANTITY
     * <br />梱包引当数量
     */
    private String pltzAllocQty;
    
    /**
     * SHIPPED QUANTITY
     * <br />出荷数量
     */
    private String shippedQty;
    
    /**
     * SALES COMPANY PO NO
     * <br />販売会社PO NO
     */
    private String salesCompPoNo;
    
    /**
     * FIRM QTY
     * <br />確定注文数量
     */
    private String firmQty;
    
    /**
     * FORECAST QTY
     * <br />見込注文数量
     */
    private String forecastQty;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB005ListDomain() {
    }

    /**
     * Getter method for etdDueDt.
     *
     * @return the etdDueDt
     */
    public String getEtdDueDt() {
        return etdDueDt;
    }

    /**
     * Setter method for etdDueDt.
     *
     * @param etdDueDt Set for etdDueDt
     */
    public void setEtdDueDt(String etdDueDt) {
        this.etdDueDt = etdDueDt;
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
     * Getter method for customerDueDt.
     *
     * @return the customerDueDt
     */
    public String getCustomerDueDt() {
        return customerDueDt;
    }

    /**
     * Setter method for customerDueDt.
     *
     * @param customerDueDt Set for customerDueDt
     */
    public void setCustomerDueDt(String customerDueDt) {
        this.customerDueDt = customerDueDt;
    }

    /**
     * Getter method for pltzAllocQty.
     *
     * @return the pltzAllocQty
     */
    public String getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * Setter method for pltzAllocQty.
     *
     * @param pltzAllocQty Set for pltzAllocQty
     */
    public void setPltzAllocQty(String pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
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
     * Getter method for salesCompPoNo.
     *
     * @return the salesCompPoNo
     */
    public String getSalesCompPoNo() {
        return salesCompPoNo;
    }

    /**
     * Setter method for salesCompPoNo.
     *
     * @param salesCompPoNo Set for salesCompPoNo
     */
    public void setSalesCompPoNo(String salesCompPoNo) {
        this.salesCompPoNo = salesCompPoNo;
    }

    /**
     * Getter method for firmQty.
     *
     * @return the firmQty
     */
    public String getFirmQty() {
        return firmQty;
    }

    /**
     * Setter method for firmQty.
     *
     * @param firmQty Set for firmQty
     */
    public void setFirmQty(String firmQty) {
        this.firmQty = firmQty;
    }

    /**
     * Getter method for forecastQty.
     *
     * @return the forecastQty
     */
    public String getForecastQty() {
        return forecastQty;
    }

    /**
     * Setter method for forecastQty.
     *
     * @param forecastQty Set for forecastQty
     */
    public void setForecastQty(String forecastQty) {
        this.forecastQty = forecastQty;
    }
}
