/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of holds for the information of the invoice.
 * <br />インボイスの情報を保持するドメインです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13885 $
 */
public class W7001ShippingActInvoiceDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * SHIPPER CODE<br />
     * 荷主コード
     */
    private String shipperCd;

    /**
     * INVOICE NO<br />
     * インボイスNO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE<br />
     * インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * SHIPPING ACTUALITY STATUS<br />
     * 船積実績ステータス
     */
    private String shippingActStatus;

    /**
     * VESSEL<br />
     * 船
     */
    private String vessel;

    /**
     * ETD<br />
     * 出発予定日
     */
    private Date etd;

    /**
     * CARRIER COMPANY CODE<br />
     * 運送会社コード
     */
    private String carrierCompCd;

    /**
     * CONTAINER LOOSE TYPE<br />
     * コンテナルーズ区分
     */
    private String containerLooseTyp;

    /**
     * FREIGHT RESPONSIBLE CODE<br />
     * 運賃支払いコード
     */
    private String freightResponsibleCd;
    
    /**
     * ETA<br />
     * 到着予定日
     */
    private Date eta;

    /**
     * SHIP TO COMPANY CODE<br />
     * 送荷先会社コード
     */
    private String shipToCompCd;

    /**
     * PACKAGE QUANTITY<br />
     * PKG数量
     */
    private BigDecimal pkgQty;

    /**
     * PARENT INVOICE NO<br />
     * 親_インボイスNO
     */
    private String parInvoiceNo;

    /**
     * LEGACY SHIP TO<br />
     * LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * CUSTOMER CODE<br />
     * 得意先コード
     */
    private String customerCd;

    /**
     * TRANSPORT CODE ORIGINAL<br />
     * 輸送手段コードオリジナル
     */
    private String trnsCdOrg;

    /**
     * No invoice number<br />
     * インボイスNo件数
     */
    private int countInvoiceNo;

    /**
     * CML TYPE<br />
     * ケースマーク区分
     */
    private String cmlTyp;

    /**
    * CML/ITEM NO QUANTITY<br />
     * CML/品番数量
    */
    private BigDecimal pltzItemQty;

    /**
     * shipper number<br />
     * 荷主件数
     */
    private int countShipperCd;
    
    /**
     * Delete flag (Shipping Actuality Receive Order)<br />
     * 削除フラグ（船積実績対象品受注情報用)
     */
    private String deleteFlagForOdr;
    
    /**
     * Delete flag (Shipping Document)<br />
     * 削除フラグ（船積書類用）
     */
    private String deleteFlagForDoc;
    
    /**
     * Need Other Doc.<br />
     * 他書類貼り付け要否
     */
    private String needOtherDocFlg;

    /**
     * Invoice Delete Flag<br />
     * インボイス削除指示フラグ
     * 
     * 20170314 ADD
     */
    private String invoiceDelFlg;

    /**
     * List of palletizing<br />
     * パレタイズのリスト
     */
    private List<? extends W7001ShippingActPltzDomain> shippingActPltzList;
    
    /**
     * Shipping Actuality Invoice Work list<br />
     * 船積実績対象インボイスワークのリスト
     */
    private List<? extends W7001ShippingActTwInvoiceDomain> shippingActTwInvoiceList;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActInvoiceDomain() {
        super();
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * Getter method for etd.
     *
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(Date etd) {
        this.etd = etd;
    }

    /**
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public Date getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(Date eta) {
        this.eta = eta;
    }

    /**
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * Getter method for parInvoiceNo.
     *
     * @return the parInvoiceNo
     */
    public String getParInvoiceNo() {
        return parInvoiceNo;
    }

    /**
     * Setter method for parInvoiceNo.
     *
     * @param parInvoiceNo Set for parInvoiceNo
     */
    public void setParInvoiceNo(String parInvoiceNo) {
        this.parInvoiceNo = parInvoiceNo;
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
     * Getter method for trnsCdOrg.
     *
     * @return the trnsCdOrg
     */
    public String getTrnsCdOrg() {
        return trnsCdOrg;
    }

    /**
     * Setter method for trnsCdOrg.
     *
     * @param trnsCdOrg Set for trnsCdOrg
     */
    public void setTrnsCdOrg(String trnsCdOrg) {
        this.trnsCdOrg = trnsCdOrg;
    }

    /**
     * Getter method for countInvoiceNo.
     *
     * @return the countInvoiceNo
     */
    public int getCountInvoiceNo() {
        return countInvoiceNo;
    }

    /**
     * Setter method for countInvoiceNo.
     *
     * @param countInvoiceNo Set for countInvoiceNo
     */
    public void setCountInvoiceNo(int countInvoiceNo) {
        this.countInvoiceNo = countInvoiceNo;
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
     * Getter method for pltzItemQty.
     *
     * @return the pltzItemQty
     */
    public BigDecimal getPltzItemQty() {
        return pltzItemQty;
    }

    /**
     * Setter method for pltzItemQty.
     *
     * @param pltzItemQty Set for pltzItemQty
     */
    public void setPltzItemQty(BigDecimal pltzItemQty) {
        this.pltzItemQty = pltzItemQty;
    }

    /**
     * Getter method for countShipperCd.
     *
     * @return the countShipperCd
     */
    public int getCountShipperCd() {
        return countShipperCd;
    }

    /**
     * Setter method for countShipperCd.
     *
     * @param countShipperCd Set for countShipperCd
     */
    public void setCountShipperCd(int countShipperCd) {
        this.countShipperCd = countShipperCd;
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

    /**
     * Getter method for invoiceDelFlg.
     *
     * @return the invoiceDelFlg
     */
    public String getInvoiceDelFlg() {
        return invoiceDelFlg;
    }

    /**
     * Setter method for invoiceDelFlg.
     *
     * @param invoiceDelFlg Set for invoiceDelFlg
     */
    public void setInvoiceDelFlg(String invoiceDelFlg) {
        this.invoiceDelFlg = invoiceDelFlg;
    }

    /**
     * Getter method for shippingActPltzList.
     *
     * @return the shippingActPltzList
     */
    public List<? extends W7001ShippingActPltzDomain> getShippingActPltzList() {
        return shippingActPltzList;
    }

    /**
     * Setter method for shippingActPltzList.
     *
     * @param shippingActPltzList Set for shippingActPltzList
     */
    public void setShippingActPltzList(
        List<? extends W7001ShippingActPltzDomain> shippingActPltzList) {
        this.shippingActPltzList = shippingActPltzList;
    }

    /**
     * Getter method for shippingActTwInvoiceList.
     *
     * @return the shippingActTwInvoiceList
     */
    public List<? extends W7001ShippingActTwInvoiceDomain> getShippingActTwInvoiceList() {
        return shippingActTwInvoiceList;
    }

    /**
     * Setter method for shippingActTwInvoiceList.
     *
     * @param shippingActTwInvoiceList Set for shippingActTwInvoiceList
     */
    public void setShippingActTwInvoiceList(
        List<? extends W7001ShippingActTwInvoiceDomain> shippingActTwInvoiceList) {
        this.shippingActTwInvoiceList = shippingActTwInvoiceList;
    }
}
