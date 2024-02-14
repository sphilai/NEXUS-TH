/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * List of domain Invoice Main Screen.<br />
 * Invoice Main Screenのリストドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11660 $
 */
public class W6001ListDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Shipper
     */
    private String shipperCd;
   
    /**
     * Consignee
     */
    private String consigneeCd;
    
    /**
     * Ship To Comp
     */
    private String shipToCd;
    
    /**
     * Trans Way
     */
    private String trnsCd;

    /**
     * Document Type
     */
    private String invoiceTyp;

    /**
     * Cancel Typ
     * ST946 MANUAL SCREEN TRANSITION ADD
     */
    private String cancelTyp;

    // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
    /**
     *Cancel Flg
     */
    private String cancelFlg;
    // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<

    /**
     * ETD
     */
    private String etd;

    /**
     * Re-Inv. Flg
     */
    private String reInvFlg;

    /**
     * Inv.No.
     */
    private String invoiceNo;

    // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
    /**
     * Cancel Reference Invoice No.
     */
    private String cancelRefNo;
    // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<

    /**
     * FRT Contain Flg
     */
    private String frtContainFlg;

    /**
     * Reference Shipper
     */
    private String relateInvoiceShipperCd;

    /**
     * Reference Inv. No.
     */
    private String relateInvoiceNo;
    
    /**
     * Issue Date
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    //private String invoiceIssueDt;
    private Date invoiceIssueDt;
    
    // ST184 INVOICE ISSUE DATE/インボイス発行日 ADD
    /**
     *Invoice Issue Dt for Disp
     */
    private String dispInvoiceIssueDt;
    
    /**
     * Issuer Name
     */
    private String invoiceIssuerNm;
    
    // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
//    /**
//     * Freight Res.
//     */
//    private String freightResponsibleCd;
    // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<

    /**
     * Date conversion format (screen display)<br />
     * 日付変換フォーマット（画面表示用）
     */
    private String screenDateFormat;
    
    /**
     * Manual Typ
     */
    private String manualTyp;
    
    /**
     * Manual Flg
     */
    private String manualFlg;
    
    /**
     * DN Base Flg
     */
    private String dnBaseFlg;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001ListDomain() {
        super();
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
     * Getter method for consigneeCd.
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * Setter method for consigneeCd.
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
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
     * Getter method for invoiceTyp.
     *
     * @return the invoiceTyp
     */
    public String getInvoiceTyp() {
        return invoiceTyp;
    }

    /**
     * Setter method for invoiceTyp.
     *
     * @param invoiceTyp Set for invoiceTyp
     */
    public void setInvoiceTyp(String invoiceTyp) {
        this.invoiceTyp = invoiceTyp;
    }

    /**
     * Getter method for cancelTyp.
     *
     * @return the cancelTyp
     */
    public String getCancelTyp() {
        return cancelTyp;
    }

    /**
     * Setter method for cancelTyp.
     *
     * @param cancelTyp Set for cancelTyp
     */
    public void setCancelTyp(String cancelTyp) {
        this.cancelTyp = cancelTyp;
    }

    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }

    /**
     * Getter method for reInvFlg.
     *
     * @return the reInvFlg
     */
    public String getReInvFlg() {
        return reInvFlg;
    }

    /**
     * Setter method for reInvFlg.
     *
     * @param reInvFlg Set for reInvFlg
     */
    public void setReInvFlg(String reInvFlg) {
        this.reInvFlg = reInvFlg;
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
     * Getter method for frtContainFlg.
     *
     * @return the frtContainFlg
     */
    public String getFrtContainFlg() {
        return frtContainFlg;
    }

    /**
     * Setter method for frtContainFlg.
     *
     * @param frtContainFlg Set for frtContainFlg
     */
    public void setFrtContainFlg(String frtContainFlg) {
        this.frtContainFlg = frtContainFlg;
    }

    /**
     * Getter method for relateInvoiceShipperCd.
     *
     * @return the relateInvoiceShipperCd
     */
    public String getRelateInvoiceShipperCd() {
        return relateInvoiceShipperCd;
    }

    /**
     * Setter method for relateInvoiceShipperCd.
     *
     * @param relateInvoiceShipperCd Set for relateInvoiceShipperCd
     */
    public void setRelateInvoiceShipperCd(String relateInvoiceShipperCd) {
        this.relateInvoiceShipperCd = relateInvoiceShipperCd;
    }

    /**
     * Getter method for relateInvoiceNo.
     *
     * @return the relateInvoiceNo
     */
    public String getRelateInvoiceNo() {
        return relateInvoiceNo;
    }

    /**
     * Setter method for relateInvoiceNo.
     *
     * @param relateInvoiceNo Set for relateInvoiceNo
     */
    public void setRelateInvoiceNo(String relateInvoiceNo) {
        this.relateInvoiceNo = relateInvoiceNo;
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
     * Getter method for dispInvoiceIssueDt.
     *
     * @return the dispInvoiceIssueDt
     */
    public String getDispInvoiceIssueDt() {
        return dispInvoiceIssueDt;
    }

    /**
     * Setter method for dispInvoiceIssueDt.
     *
     * @param dispInvoiceIssueDt Set for dispInvoiceIssueDt
     */
    public void setDispInvoiceIssueDt(String dispInvoiceIssueDt) {
        this.dispInvoiceIssueDt = dispInvoiceIssueDt;
    }

    /**
     * Getter method for invoiceIssuerNm.
     *
     * @return the invoiceIssuerNm
     */
    public String getInvoiceIssuerNm() {
        return invoiceIssuerNm;
    }

    /**
     * Setter method for invoiceIssuerNm.
     *
     * @param invoiceIssuerNm Set for invoiceIssuerNm
     */
    public void setInvoiceIssuerNm(String invoiceIssuerNm) {
        this.invoiceIssuerNm = invoiceIssuerNm;
    }

    // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
//    /**
//     * Getter method for freightResponsibleCd.
//     *
//     * @return the freightResponsibleCd
//     */
//    public String getFreightResponsibleCd() {
//        return freightResponsibleCd;
//    }
//
//    /**
//     * Setter method for freightResponsibleCd.
//     *
//     * @param freightResponsibleCd Set for freightResponsibleCd
//     */
//    public void setFreightResponsibleCd(String freightResponsibleCd) {
//        this.freightResponsibleCd = freightResponsibleCd;
//    }
    // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<

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
     * Getter method for manualTyp.
     *
     * @return the manualTyp
     */
    public String getManualTyp() {
        return manualTyp;
    }

    /**
     * Setter method for manualTyp.
     *
     * @param manualTyp Set for manualTyp
     */
    public void setManualTyp(String manualTyp) {
        this.manualTyp = manualTyp;
    }

    /**
     * Getter method for manualFlg.
     *
     * @return the manualFlg
     */
    public String getManualFlg() {
        return manualFlg;
    }

    /**
     * Setter method for manualFlg.
     *
     * @param manualFlg Set for manualFlg
     */
    public void setManualFlg(String manualFlg) {
        this.manualFlg = manualFlg;
    }

    /**
     * Getter method for dnBaseFlg.
     *
     * @return the dnBaseFlg
     */
    public String getDnBaseFlg() {
        return dnBaseFlg;
    }

    /**
     * Setter method for dnBaseFlg.
     *
     * @param dnBaseFlg Set for dnBaseFlg
     */
    public void setDnBaseFlg(String dnBaseFlg) {
        this.dnBaseFlg = dnBaseFlg;
    }

    // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
    /**
     * <p>Getter method for cancelFlg.</p>
     *
     * @return the cancelFlg
     */
    public String getCancelFlg() {
        return cancelFlg;
    }

    /**
     * <p>Setter method for cancelFlg.</p>
     *
     * @param cancelFlg Set for cancelFlg
     */
    public void setCancelFlg(String cancelFlg) {
        this.cancelFlg = cancelFlg;
    }

    /**
     * <p>Getter method for cancelRefNo.</p>
     *
     * @return the cancelRefNo
     */
    public String getCancelRefNo() {
        return cancelRefNo;
    }

    /**
     * <p>Setter method for cancelRefNo.</p>
     *
     * @param cancelRefNo Set for cancelRefNo
     */
    public void setCancelRefNo(String cancelRefNo) {
        this.cancelRefNo = cancelRefNo;
    }
    // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<

}
