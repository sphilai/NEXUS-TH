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
 * This is a domain class holding a Mix Tag Receive Order.
 * <br />MIXED品目番号受注情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12515 $
 */
public class W2005MixTagOdrDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    private String mixTagNo;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * RECEIVE ORDER COMPANY CODE
     * <br />受注会社コード
     */
    private String rcvOdrCompCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * ETD DUE DATE
     * <br />船積期限
     */
    private Date etdDueDt;
    
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
     * CUSTOMER ITEM NO ORIGINAL
     * <br />得意先品目番号オリジナル
     */
    private String customerItemNoOrg;
    
    /**
     * ORDER CONTROL NO
     * <br />オーダーコントロールNO
     */
    private BigDecimal odrCtrlNo;
    
    /**
     * ALLOC QUANTITY
     * <br />引当数量
     */
    private BigDecimal allocQty;
    
    /**
     * ALLOC QUANTITY
     * <br />パレタイズ済み引当数量
     */
    private BigDecimal pltzAllocQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2005MixTagOdrDomain() {
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
     * Getter method for allocQty.
     *
     * @return the allocQty
     */
    public BigDecimal getAllocQty() {
        return allocQty;
    }

    /**
     * Setter method for allocQty.
     *
     * @param allocQty Set for allocQty
     */
    public void setAllocQty(BigDecimal allocQty) {
        this.allocQty = allocQty;
    }

    /**
     * <p>pltzAllocQty のゲッターメソッドです。</p>
     *
     * @return the pltzAllocQty
     */
    public BigDecimal getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * <p>pltzAllocQty のセッターメソッドです。</p>
     *
     * @param pltzAllocQty pltzAllocQty に設定する
     */
    public void setPltzAllocQty(BigDecimal pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
    }
    
}
