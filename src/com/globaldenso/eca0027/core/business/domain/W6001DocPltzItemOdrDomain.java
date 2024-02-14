/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain that holds the palletizing goods for order information of Documentation screen.
 * <br/>通関書類作成業務画面のパレタイズ対象品受注情報を保持するドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */

public class W6001DocPltzItemOdrDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     *Customer Cd
     */
    private String customerCd;

    /**
     *Customer Item No
     */
    private String customerItemNo;

    /**
     *Customer Item No Org
     */
    private String customerItemNoOrg;

    /**
     *Customer Po No
     */
    private String customerPoNo;

    /**
     *Etd Due Dt
     */
    private Date etdDueDt;

    /**
     *Item No
     */
    private String itemNo;

    /**
     *Lgcy Ship To
     */
    private String lgcyShipTo;

    /**
     *Odr Ctrl No
     */
    private BigDecimal odrCtrlNo;

    /**
     *Pkg Cd
     */
    private String pkgCd;

    /**
     *Rcv Odr Comp Cd
     */
    private String rcvOdrCompCd;

    /**
     *Sum Alloc Qty
     */
    private BigDecimal sumAllocQty;

    /**
     *Trns Cd
     */
    private String trnsCd;

    /**
     *Item Ord Customer Po No
     */
    private String itemOrdCustomerPoNo;
    /**
     *Item Sales Comp Po No
     */
    private String salesCompPoNo;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001DocPltzItemOdrDomain() {
        super();
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
     * Getter method for customerItemNoOrg.
     *
     * @return the customerItemNoOrg
     */
    public String getCustomerItemNoOrg() {
        return customerItemNoOrg;
    }

    /**
     * Setter method for customerItemNoOrg.
     *
     * @param customerItemNoOrg Set for customerItemNoOrg
     */
    public void setCustomerItemNoOrg(String customerItemNoOrg) {
        this.customerItemNoOrg = customerItemNoOrg;
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
     * Getter method for etdDueDt.
     *
     * @return the etdDueDt
     */
    public Date getEtdDueDt() {
        return etdDueDt;
    }

    /**
     * Setter method for etdDueDt.
     *
     * @param etdDueDt Set for etdDueDt
     */
    public void setEtdDueDt(Date etdDueDt) {
        this.etdDueDt = etdDueDt;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for odrCtrlNo.
     *
     * @return the odrCtrlNo
     */
    public BigDecimal getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * Setter method for odrCtrlNo.
     *
     * @param odrCtrlNo Set for odrCtrlNo
     */
    public void setOdrCtrlNo(BigDecimal odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * Getter method for rcvOdrCompCd.
     *
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * Setter method for rcvOdrCompCd.
     *
     * @param rcvOdrCompCd Set for rcvOdrCompCd
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
    }

    /**
     * Getter method for sumAllocQty.
     *
     * @return the sumAllocQty
     */
    public BigDecimal getSumAllocQty() {
        return sumAllocQty;
    }

    /**
     * Setter method for sumAllocQty.
     *
     * @param sumAllocQty Set for sumAllocQty
     */
    public void setSumAllocQty(BigDecimal sumAllocQty) {
        this.sumAllocQty = sumAllocQty;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for itemOrdCustomerPoNo.
     *
     * @return the itemOrdCustomerPoNo
     */
    public String getItemOrdCustomerPoNo() {
        return itemOrdCustomerPoNo;
    }

    /**
     * Setter method for itemOrdCustomerPoNo.
     *
     * @param itemOrdCustomerPoNo Set for itemOrdCustomerPoNo
     */
    public void setItemOrdCustomerPoNo(String itemOrdCustomerPoNo) {
        this.itemOrdCustomerPoNo = itemOrdCustomerPoNo;
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
}