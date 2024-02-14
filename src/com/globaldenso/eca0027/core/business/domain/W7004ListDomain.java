/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of list for the Register Screen of Shipping Actuality.
 * <br />船積実績Register画面のリストドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11608 $
 */
public class W7004ListDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * Full RT Inv.
     */
    private String fullRtInv;

    /**
     * PKG QTY
     */
    private String pkgQty;

    /**
     * Invoice date<br />
     * インボイス発行日
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    //private String invoiceIssueDt;
    private Date invoiceIssueDt;
    
    /**
     * Shipper CD<br />
     * 荷主コード
     */
    private String shipperCd;
    
    /**
     * Status
     */
    private String shippingActStatus;
    
    /**
     * CML TYP<br />
     * ケースマーク区分
     */
    private String cmlTyp;
    
    /**
     * Delete flag (Shipping Actuality Receive Order)<br />
     * 削除フラグ（船積実績対象品受注情報用）
     */
    private String deleteFlagForOdr;
    
    /**
     * Delete flag (Shipping Document)<br />
     * 削除フラグ（船積書類用）
     */
    private String deleteFlagForDoc;
    
    /**
     * Need other doc.
     */
    private String needOtherDocFlg;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004ListDomain() {
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
     * Getter method for fullRtInv.
     *
     * @return the fullRtInv
     */
    public String getFullRtInv() {
        return fullRtInv;
    }

    /**
     * Setter method for fullRtInv.
     *
     * @param fullRtInv Set for fullRtInv
     */
    public void setFullRtInv(String fullRtInv) {
        this.fullRtInv = fullRtInv;
    }

    /**
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public String getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(String pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * Getter method for invoiceIssueDt.
     *
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for shippingActStatus.
     *
     * @return the shippingActStatus
     */
    public String getShippingActStatus() {
        return shippingActStatus;
    }

    /**
     * Setter method for shippingActStatus.
     *
     * @param shippingActStatus Set for shippingActStatus
     */
    public void setShippingActStatus(String shippingActStatus) {
        this.shippingActStatus = shippingActStatus;
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * Getter method for deleteFlagForOdr.
     *
     * @return the deleteFlagForOdr
     */
    public String getDeleteFlagForOdr() {
        return deleteFlagForOdr;
    }

    /**
     * Setter method for deleteFlagForOdr.
     *
     * @param deleteFlagForOdr Set for deleteFlagForOdr
     */
    public void setDeleteFlagForOdr(String deleteFlagForOdr) {
        this.deleteFlagForOdr = deleteFlagForOdr;
    }

    /**
     * Getter method for deleteFlagForDoc.
     *
     * @return the deleteFlagForDoc
     */
    public String getDeleteFlagForDoc() {
        return deleteFlagForDoc;
    }

    /**
     * Setter method for deleteFlagForDoc.
     *
     * @param deleteFlagForDoc Set for deleteFlagForDoc
     */
    public void setDeleteFlagForDoc(String deleteFlagForDoc) {
        this.deleteFlagForDoc = deleteFlagForDoc;
    }

    /**
     * <p>needOtherDocFlg のゲッターメソッドです。</p>
     *
     * @return the needOtherDocFlg
     */
    public String getNeedOtherDocFlg() {
        return needOtherDocFlg;
    }

    /**
     * <p>needOtherDocFlg のセッターメソッドです。</p>
     *
     * @param needOtherDocFlg needOtherDocFlg に設定する
     */
    public void setNeedOtherDocFlg(String needOtherDocFlg) {
        this.needOtherDocFlg = needOtherDocFlg;
    }

}
