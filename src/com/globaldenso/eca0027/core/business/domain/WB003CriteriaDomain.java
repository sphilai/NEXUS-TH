/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a search-condition domain of ordering two or more P / O registration picture.
 * <br />受注複数P/O登録画面の検索条件ドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB003CriteriaDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
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
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;

    /**
     * TRANSPORT CODE
     * <br />輸送手段コード(画面表示用)
     */
    private String trnsCdDisp;
    
    /**
     * ETD DUE DATE
     * <br />船積期限
     */
    private String etdDueDt;
    
    /**
     * COMPANY NAME
     * <br />会社名称
     */
    private String compNm;
    
    /**
     * SHIP TO NAME
     * <br />送荷先名称
     */
    private String shipToNm;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemDescription;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String partName;
    
    /**
     * Factory code
     * <br />工場コード
     */
    private String plntCd;
    
    /**
     * Supplier CD
     * <br />サプライヤーコード
     */
    private String supplierCd;
    
    /**
     * IGMORE WARMINGS
     * <br />ワーニング無視
     */
    private String ignoreWarnings;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO番号
     */
    private String customerPoNo;
    
    /**
     * The number of lots
     * <br />ロット数
     */
    private BigDecimal shippingLot;
    
    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB003CriteriaDomain() {
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
     * Getter method for trnsCdDisp.
     *
     * @return the trnsCdDisp
     */
    public String getTrnsCdDisp() {
        return trnsCdDisp;
    }

    /**
     * Setter method for trnsCdDisp.
     *
     * @param trnsCdDisp Set for trnsCdDisp
     */
    public void setTrnsCdDisp(String trnsCdDisp) {
        this.trnsCdDisp = trnsCdDisp;
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
     * Getter method for compNm.
     *
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * Setter method for compNm.
     *
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * Getter method for shipToNm.
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * Setter method for shipToNm.
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
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

    /**
     * Getter method for partName.
     *
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Setter method for partName.
     *
     * @param partName Set for partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for supplierCd.
     *
     * @return the supplierCd
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * Setter method for supplierCd.
     *
     * @param supplierCd Set for supplierCd
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd;
    }
    
    /**
     * Getter method for ignoreWarnings.
     *
     * @return the ignoreWarnings
     */
    public String getIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Setter method for ignoreWarnings.
     *
     * @param ignoreWarnings Set for ignoreWarnings
     */
    public void setIgnoreWarnings(String ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
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
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot shippingLot<br />shippingLot に設定する
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
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
}
