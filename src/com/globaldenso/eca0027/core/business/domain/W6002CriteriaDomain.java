/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of the search condition Manual Invoice Upload screen.<br />
 * Manual Invoice Upload画面の検索条件ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11664 $
 */
public class W6002CriteriaDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * Function No
     */
    private String functionNo;

    /**
     *Denso Context dsc id
     */
    private String dscId;
    
    
    /**
     *Denso Context Comp Cd
     */
    private String compCd;
    
    /**
     * Take over value Invoice No<br />
     *引継値 Invoice No
     */
    private String takeOverInvoiceNo;

    /**
     * Takeover value Invoice Issue Dt<br />
     *引継値 Invoice Issue Dt
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    // There is no meaning the value of the new Date(). It is for exception of Date(null) -> Date avoided in Beanutils.copyProperties().
    // new Date()の値に意味はない。Beanutils.copyProperties()でのDate(null)→Date例外回避のため。
    //private String takeOverInvoiceIssueDt;
    private Date takeOverInvoiceIssueDt = new Date();

    /**
     * Takeover value Shipper Cd<br />
     *引継値 Shipper Cd
     */
    private String takeOverShipperCd;

    /**
     * Takeover value FRT Contain Flg<br />
     *引継値 FRT Contain Flg
     */
    private String takeOverFrtContainFlg;
    
    /**
     * Sort of invoice<br/>インボイス表示順
     */
    //private String sortInvoice; // ST946 MANUAL SCREEN TRANSITION DEL
    
    /**
     * A confirmation dialog message.<br />
     * 確認ダイアログのメッセージ
     */
    //private String confirmMsg = ""; // ST943 DEL
    
    /**
     * The process continuation flag (If the value in flag is 'y', process will be continue)<br />
     * 処理継続フラグ("Y"の時、継続して処理を行う)
     */
    //private String continueFlag; // ST943 DEL
    
    
    /**
     * country Cd
     */
    private String cntryCd;
    
    /**
     * cml type
     */
    private String cmlTyp;
    
    /** 
     * 2.Document Type
     */
    private String documentType;
    
    /** 
     * 3.Type of Inv.
     */
    private String typeOfInv;
    
    /** 
     * 4.Class of Inv.
     */
    private String classOfInv;
    
    /** 
     * 36.Inv. Category
     */
    private String invoiceCtgry;

    /** 
     * 5.Shipper
     */
    private String shipperCd;
    
    /** 
     * 7.Shipper Name
     */
    private String shipCompNm;

    /** 
     * 8.Invoice No.
     */
    private String invoiceNo;

    /** 
     * 9.Consignee
     */
    private String consigneeCd;

    /** 
     * 11.Consignee Name
     */
    private String consCompNm;

    /** 
     * 15.NEXUS Ship To
     */
    private String shipToCd;

    /** 
     * 17.NEXUS Ship To Name
     */
    private String shipToNm;

    /** 
     * 18.Trans.
     */
    private String trnsCd;

    /** 
     * 20.Reference Inv. Shipper
     */
    private String relateInvoiceShipperCd;
    
    /** 
     * 22.Reference Inv. Shipper Name
     */
    private String relateShipToNm;

    /** 
     * 19.Reference Inv. No.
     */
    private String relateInvoiceNo;

    /** 
     * 82.Delivery Point
     */
    private String dlivPoint;

    /** 
     * 30.Freight Res.
     */
    private String freightRes;

    /**
     * 23.Price Terms
     */
    private String priceTerms;

    /**
     * 26.Trade Terms
     */
    private String tradeTerms;

    /**
     * 83.Terms Point
     */
    private String termsPoint;

    /**
     * 24.Payment Method 
     */
    private String paymentMethod;

    /**
     * 25.Payment Terms
     */
    private String payTerms;

    /**
     * 84.Remittance or L/C
     */
    private String remittanceOrLc;

    /**
     * 32.Bank Name
     */
    private String remBankNm;

    /**
     * 34.Address
     */
    private String remBankAddress1;

    /**
     * 80.Remittance Address2
     */
    private String remBankAddress2;

    /**
     * 81.Remittance Address3
     */
    private String remBankAddress3;

    /**
     * 33.Account No.
     */
    private String remBankAccountNo;

    /**
     * 31.Bank Name
     */
    private String lcBank1;

    /**
     * 85.L/C Bank Name2
     */
    private String lcBank2;

    /**
     * 27.L/C No.
     */
    private String lcNo;

    /**
     * 28.L/C Date
     */
    private String lcDt;
    
    /**
     * 35.Cur.
     */
    private String currCd;

    /**
     * 37.Net Amount
     */
    private String netAmount;

    /**
     * 38.Freight
     */
    private String freight;

    /**
     * 39.Insurance
     */
    private String insurance;

    /**
     * 40.Sub Total
     */
    private String subTotal;

    /**
     * 44.Handling Charge
     */
    private String handlingCharge;

    /**
     * 47.Free Additional
     */
    private String additionalCharge;

    /**
     * 46.Free Additional Name
     */
    private String additionalChargeNm;

    /**
     * 42.Vat
     */
    private String vat;

    /**
     * 41.Vat(%)
     */
    private String vatRatio;

    /**
     * 49.Total Amount
     */
    private String totalInvoiceAmount;

    /**
     * 50.Total PKG QTY
     */
    private String pltzItemQty;

    /**
     * 52.Unit of Vol.
     */
    private String volumeUnit;

    /**
     * 51.Total Vol.
     */
    private String totalVolume;

    /**
     * 55.Unit of Weight
     */
    private String weightUnit;

    /**
     * 53.Total N/W
     */
    private String totalNetWeight;

    /**
     * 54.Total G/W
     */
    private String totalGrossWeight;

    /**
     * 58.Carrier
     */
    private String carrierCompCd;

    /**
     * 60.Carrier Name
     */
    private String carCompNm;

    /**
     * 61.Forwarder
     */
    private String forwarderCompCd;

    /**
     * 63.Forwarder Name
     */
    private String forCompNm;

    /**
     * 64.FM) Port of Load/FLT
     */
    private String loadingPortCd;

    /**
     * FM) Country
     */
    private String fmCntryCd;
    
    /**
     * 66.Port_NM_From
     */
    private String portNmFrom;

    /**
     * 67.TO) Port of Discharge/FLT
     */
    private String dischargePortCd;

    /**
     * TO) Country
     */
    private String toCntryCd;
    
    /**
     * 69.Port_NM_To
     */
    private String portNmTo;

    /**
     * 87.Vessel/FLT No.
     */
    private String vessel;

    /**
     * 70.ETD
     */
    private String etd;

    /**
     * 72.ETA
     */
    private String eta;

    /**
     * 74.Arrival Time
     */
    private String arrivalTime;

    /**
     * 88.Booking No.
     */
    private String bookingNo;

    /**
     * upload file data stream (for Invoice PDF)
     */
    private InputStream invoicePdfFileStream;
    
    /**
     * upload file name (for Invoice PDF)
     */
    private String invoicePdfFileName;
    
    /**
     * upload file size (for Invoice PDF)
     */
    private int invoicePdfFileSize;
    
    /**
     * upload file data stream (for Packing List PDF)
     */
    private InputStream packingListPdfFilaStream;
    
    /**
     * upload file name (for Packing List PDF)
     */
    private String packingListPdfFileName;
    
    /**
     * upload file size (for Packing List PDF)
     */
    private int packingListPdfFileSize;

    /**
     * 77.Original Inv. No.
     */
    private String orgInvoiceNo;
    
    /**
     * Number of registered<br />
     * 登録件数
     */
    private int updateCount;
    
    /**
     * Update Counts<br />
     * 更新件数
     */
    private int createCount;

    // ST946 MANUAL SCREEN TRANSITION ADD START
    //
    // key of main invoice
    // 
    // Key of top-level invoice which has been selected in the main screen.
    // It uses the search, registration, as TT_INVOICE.PAR_... .
    // 
    // メイン画面で選択されたトップレベルのインボイスのキー。
    // TT_INVOICE.PAR_...として検索、登録に使用する。
    // 
    /** main invoice key No.1 */
    private String takeOverParInvoiceShipperCd;
    /** main invoice key No.2 */
    private String takeOverParInvoiceNo;
    /** main invoice key No.3 */
    private Date takeOverParInvoiceIssueDt = new Date(); // dummy value. cause copyProperties can't copy null Date
    // ST946 MANUAL SCREEN TRANSITION ADD END

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6002CriteriaDomain() {
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
     * Getter method for functionNo.
     *
     * @return the functionNo
     */
    public String getFunctionNo() {
        return functionNo;
    }

    /**
     * Setter method for functionNo.
     *
     * @param functionNo Set for functionNo
     */
    public void setFunctionNo(String functionNo) {
        this.functionNo = functionNo;
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
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for takeOverInvoiceNo.
     *
     * @return the takeOverInvoiceNo
     */
    public String getTakeOverInvoiceNo() {
        return takeOverInvoiceNo;
    }

    /**
     * Setter method for takeOverInvoiceNo.
     *
     * @param takeOverInvoiceNo Set for takeOverInvoiceNo
     */
    public void setTakeOverInvoiceNo(String takeOverInvoiceNo) {
        this.takeOverInvoiceNo = takeOverInvoiceNo;
    }

    /**
     * Getter method for takeOverInvoiceIssueDt.
     *
     * @return the takeOverInvoiceIssueDt
     */
    public Date getTakeOverInvoiceIssueDt() {
        return takeOverInvoiceIssueDt;
    }

    /**
     * Setter method for takeOverInvoiceIssueDt.
     *
     * @param takeOverInvoiceIssueDt Set for takeOverInvoiceIssueDt
     */
    public void setTakeOverInvoiceIssueDt(Date takeOverInvoiceIssueDt) {
        this.takeOverInvoiceIssueDt = takeOverInvoiceIssueDt;
    }

    /**
     * Getter method for takeOverShipperCd.
     *
     * @return the takeOverShipperCd
     */
    public String getTakeOverShipperCd() {
        return takeOverShipperCd;
    }

    /**
     * Setter method for takeOverShipperCd.
     *
     * @param takeOverShipperCd Set for takeOverShipperCd
     */
    public void setTakeOverShipperCd(String takeOverShipperCd) {
        this.takeOverShipperCd = takeOverShipperCd;
    }

    /**
     * Getter method for takeOverFrtContainFlg.
     *
     * @return the takeOverFrtContainFlg
     */
    public String getTakeOverFrtContainFlg() {
        return takeOverFrtContainFlg;
    }

    /**
     * Setter method for takeOverFrtContainFlg.
     *
     * @param takeOverFrtContainFlg Set for takeOverFrtContainFlg
     */
    public void setTakeOverFrtContainFlg(String takeOverFrtContainFlg) {
        this.takeOverFrtContainFlg = takeOverFrtContainFlg;
    }

    /**
     * Getter method for cntryCd.
     *
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * Setter method for cntryCd.
     *
     * @param cntryCd Set for cntryCd
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
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
     * Getter method for documentType.
     *
     * @return the documentType
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Setter method for documentType.
     *
     * @param documentType Set for documentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Getter method for typeOfInv.
     *
     * @return the typeOfInv
     */
    public String getTypeOfInv() {
        return typeOfInv;
    }

    /**
     * Setter method for typeOfInv.
     *
     * @param typeOfInv Set for typeOfInv
     */
    public void setTypeOfInv(String typeOfInv) {
        this.typeOfInv = typeOfInv;
    }

    /**
     * Getter method for classOfInv.
     *
     * @return the classOfInv
     */
    public String getClassOfInv() {
        return classOfInv;
    }

    /**
     * Setter method for classOfInv.
     *
     * @param classOfInv Set for classOfInv
     */
    public void setClassOfInv(String classOfInv) {
        this.classOfInv = classOfInv;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
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
     * Getter method for shipCompNm.
     *
     * @return the shipCompNm
     */
    public String getShipCompNm() {
        return shipCompNm;
    }

    /**
     * Setter method for shipCompNm.
     *
     * @param shipCompNm Set for shipCompNm
     */
    public void setShipCompNm(String shipCompNm) {
        this.shipCompNm = shipCompNm;
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
     * Getter method for consCompNm.
     *
     * @return the consCompNm
     */
    public String getConsCompNm() {
        return consCompNm;
    }

    /**
     * Setter method for consCompNm.
     *
     * @param consCompNm Set for consCompNm
     */
    public void setConsCompNm(String consCompNm) {
        this.consCompNm = consCompNm;
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
     * Getter method for relateShipToNm.
     *
     * @return the relateShipToNm
     */
    public String getRelateShipToNm() {
        return relateShipToNm;
    }

    /**
     * Setter method for relateShipToNm.
     *
     * @param relateShipToNm Set for relateShipToNm
     */
    public void setRelateShipToNm(String relateShipToNm) {
        this.relateShipToNm = relateShipToNm;
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
     * Getter method for dlivPoint.
     *
     * @return the dlivPoint
     */
    public String getDlivPoint() {
        return dlivPoint;
    }

    /**
     * Setter method for dlivPoint.
     *
     * @param dlivPoint Set for dlivPoint
     */
    public void setDlivPoint(String dlivPoint) {
        this.dlivPoint = dlivPoint;
    }

    /**
     * Getter method for freightRes.
     *
     * @return the freightRes
     */
    public String getFreightRes() {
        return freightRes;
    }

    /**
     * Setter method for freightRes.
     *
     * @param freightRes Set for freightRes
     */
    public void setFreightRes(String freightRes) {
        this.freightRes = freightRes;
    }

    /**
     * Getter method for priceTerms.
     *
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * Setter method for priceTerms.
     *
     * @param priceTerms Set for priceTerms
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * Getter method for tradeTerms.
     *
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * Setter method for tradeTerms.
     *
     * @param tradeTerms Set for tradeTerms
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * Getter method for termsPoint.
     *
     * @return the termsPoint
     */
    public String getTermsPoint() {
        return termsPoint;
    }

    /**
     * Setter method for termsPoint.
     *
     * @param termsPoint Set for termsPoint
     */
    public void setTermsPoint(String termsPoint) {
        this.termsPoint = termsPoint;
    }

    /**
     * Getter method for paymentMethod.
     *
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter method for paymentMethod.
     *
     * @param paymentMethod Set for paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter method for payTerms.
     *
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * Setter method for payTerms.
     *
     * @param payTerms Set for payTerms
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    /**
     * Getter method for remittanceOrLc.
     *
     * @return the remittanceOrLc
     */
    public String getRemittanceOrLc() {
        return remittanceOrLc;
    }

    /**
     * Setter method for remittanceOrLc.
     *
     * @param remittanceOrLc Set for remittanceOrLc
     */
    public void setRemittanceOrLc(String remittanceOrLc) {
        this.remittanceOrLc = remittanceOrLc;
    }

    /**
     * Getter method for remBankNm.
     *
     * @return the remBankNm
     */
    public String getRemBankNm() {
        return remBankNm;
    }

    /**
     * Setter method for remBankNm.
     *
     * @param remBankNm Set for remBankNm
     */
    public void setRemBankNm(String remBankNm) {
        this.remBankNm = remBankNm;
    }

    /**
     * Getter method for remBankAddress1.
     *
     * @return the remBankAddress1
     */
    public String getRemBankAddress1() {
        return remBankAddress1;
    }

    /**
     * Setter method for remBankAddress1.
     *
     * @param remBankAddress1 Set for remBankAddress1
     */
    public void setRemBankAddress1(String remBankAddress1) {
        this.remBankAddress1 = remBankAddress1;
    }

    /**
     * Getter method for remBankAddress2.
     *
     * @return the remBankAddress2
     */
    public String getRemBankAddress2() {
        return remBankAddress2;
    }

    /**
     * Setter method for remBankAddress2.
     *
     * @param remBankAddress2 Set for remBankAddress2
     */
    public void setRemBankAddress2(String remBankAddress2) {
        this.remBankAddress2 = remBankAddress2;
    }

    /**
     * Getter method for remBankAddress3.
     *
     * @return the remBankAddress3
     */
    public String getRemBankAddress3() {
        return remBankAddress3;
    }

    /**
     * Setter method for remBankAddress3.
     *
     * @param remBankAddress3 Set for remBankAddress3
     */
    public void setRemBankAddress3(String remBankAddress3) {
        this.remBankAddress3 = remBankAddress3;
    }

    /**
     * Getter method for remBankAccountNo.
     *
     * @return the remBankAccountNo
     */
    public String getRemBankAccountNo() {
        return remBankAccountNo;
    }

    /**
     * Setter method for remBankAccountNo.
     *
     * @param remBankAccountNo Set for remBankAccountNo
     */
    public void setRemBankAccountNo(String remBankAccountNo) {
        this.remBankAccountNo = remBankAccountNo;
    }

    /**
     * Getter method for lcBank1.
     *
     * @return the lcBank1
     */
    public String getLcBank1() {
        return lcBank1;
    }

    /**
     * Setter method for lcBank1.
     *
     * @param lcBank1 Set for lcBank1
     */
    public void setLcBank1(String lcBank1) {
        this.lcBank1 = lcBank1;
    }

    /**
     * Getter method for lcBank2.
     *
     * @return the lcBank2
     */
    public String getLcBank2() {
        return lcBank2;
    }

    /**
     * Setter method for lcBank2.
     *
     * @param lcBank2 Set for lcBank2
     */
    public void setLcBank2(String lcBank2) {
        this.lcBank2 = lcBank2;
    }

    /**
     * Getter method for lcNo.
     *
     * @return the lcNo
     */
    public String getLcNo() {
        return lcNo;
    }

    /**
     * Setter method for lcNo.
     *
     * @param lcNo Set for lcNo
     */
    public void setLcNo(String lcNo) {
        this.lcNo = lcNo;
    }

    /**
     * Getter method for lcDt.
     *
     * @return the lcDt
     */
    public String getLcDt() {
        return lcDt;
    }

    /**
     * Setter method for lcDt.
     *
     * @param lcDt Set for lcDt
     */
    public void setLcDt(String lcDt) {
        this.lcDt = lcDt;
    }

    /**
     * Getter method for currCd.
     *
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * Setter method for currCd.
     *
     * @param currCd Set for currCd
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * Getter method for netAmount.
     *
     * @return the netAmount
     */
    public String getNetAmount() {
        return netAmount;
    }

    /**
     * Setter method for netAmount.
     *
     * @param netAmount Set for netAmount
     */
    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Getter method for freight.
     *
     * @return the freight
     */
    public String getFreight() {
        return freight;
    }

    /**
     * Setter method for freight.
     *
     * @param freight Set for freight
     */
    public void setFreight(String freight) {
        this.freight = freight;
    }

    /**
     * Getter method for insurance.
     *
     * @return the insurance
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * Setter method for insurance.
     *
     * @param insurance Set for insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * Getter method for subTotal.
     *
     * @return the subTotal
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * Setter method for subTotal.
     *
     * @param subTotal Set for subTotal
     */
    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Getter method for handlingCharge.
     *
     * @return the handlingCharge
     */
    public String getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * Setter method for handlingCharge.
     *
     * @param handlingCharge Set for handlingCharge
     */
    public void setHandlingCharge(String handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    /**
     * Getter method for additionalCharge.
     *
     * @return the additionalCharge
     */
    public String getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * Setter method for additionalCharge.
     *
     * @param additionalCharge Set for additionalCharge
     */
    public void setAdditionalCharge(String additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    /**
     * Getter method for additionalChargeNm.
     *
     * @return the additionalChargeNm
     */
    public String getAdditionalChargeNm() {
        return additionalChargeNm;
    }

    /**
     * Setter method for additionalChargeNm.
     *
     * @param additionalChargeNm Set for additionalChargeNm
     */
    public void setAdditionalChargeNm(String additionalChargeNm) {
        this.additionalChargeNm = additionalChargeNm;
    }

    /**
     * Getter method for vat.
     *
     * @return the vat
     */
    public String getVat() {
        return vat;
    }

    /**
     * Setter method for vat.
     *
     * @param vat Set for vat
     */
    public void setVat(String vat) {
        this.vat = vat;
    }

    /**
     * Getter method for vatRatio.
     *
     * @return the vatRatio
     */
    public String getVatRatio() {
        return vatRatio;
    }

    /**
     * Setter method for vatRatio.
     *
     * @param vatRatio Set for vatRatio
     */
    public void setVatRatio(String vatRatio) {
        this.vatRatio = vatRatio;
    }

    /**
     * Getter method for totalInvoiceAmount.
     *
     * @return the totalInvoiceAmount
     */
    public String getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Setter method for totalInvoiceAmount.
     *
     * @param totalInvoiceAmount Set for totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(String totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    /**
     * Getter method for pltzItemQty.
     *
     * @return the pltzItemQty
     */
    public String getPltzItemQty() {
        return pltzItemQty;
    }

    /**
     * Setter method for pltzItemQty.
     *
     * @param pltzItemQty Set for pltzItemQty
     */
    public void setPltzItemQty(String pltzItemQty) {
        this.pltzItemQty = pltzItemQty;
    }

    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for totalVolume.
     *
     * @return the totalVolume
     */
    public String getTotalVolume() {
        return totalVolume;
    }

    /**
     * Setter method for totalVolume.
     *
     * @param totalVolume Set for totalVolume
     */
    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for totalNetWeight.
     *
     * @return the totalNetWeight
     */
    public String getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * Setter method for totalNetWeight.
     *
     * @param totalNetWeight Set for totalNetWeight
     */
    public void setTotalNetWeight(String totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * Getter method for totalGrossWeight.
     *
     * @return the totalGrossWeight
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * Setter method for totalGrossWeight.
     *
     * @param totalGrossWeight Set for totalGrossWeight
     */
    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
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
     * Getter method for carCompNm.
     *
     * @return the carCompNm
     */
    public String getCarCompNm() {
        return carCompNm;
    }

    /**
     * Setter method for carCompNm.
     *
     * @param carCompNm Set for carCompNm
     */
    public void setCarCompNm(String carCompNm) {
        this.carCompNm = carCompNm;
    }

    /**
     * Getter method for forwarderCompCd.
     *
     * @return the forwarderCompCd
     */
    public String getForwarderCompCd() {
        return forwarderCompCd;
    }

    /**
     * Setter method for forwarderCompCd.
     *
     * @param forwarderCompCd Set for forwarderCompCd
     */
    public void setForwarderCompCd(String forwarderCompCd) {
        this.forwarderCompCd = forwarderCompCd;
    }

    /**
     * Getter method for forCompNm.
     *
     * @return the forCompNm
     */
    public String getForCompNm() {
        return forCompNm;
    }

    /**
     * Setter method for forCompNm.
     *
     * @param forCompNm Set for forCompNm
     */
    public void setForCompNm(String forCompNm) {
        this.forCompNm = forCompNm;
    }

    /**
     * Getter method for loadingPortCd.
     *
     * @return the loadingPortCd
     */
    public String getLoadingPortCd() {
        return loadingPortCd;
    }

    /**
     * Setter method for loadingPortCd.
     *
     * @param loadingPortCd Set for loadingPortCd
     */
    public void setLoadingPortCd(String loadingPortCd) {
        this.loadingPortCd = loadingPortCd;
    }

    /**
     * Getter method for fmCntryCd.
     *
     * @return the fmCntryCd
     */
    public String getFmCntryCd() {
        return fmCntryCd;
    }

    /**
     * Setter method for fmCntryCd.
     *
     * @param fmCntryCd Set for fmCntryCd
     */
    public void setFmCntryCd(String fmCntryCd) {
        this.fmCntryCd = fmCntryCd;
    }

    /**
     * Getter method for portNmFrom.
     *
     * @return the portNmFrom
     */
    public String getPortNmFrom() {
        return portNmFrom;
    }

    /**
     * Setter method for portNmFrom.
     *
     * @param portNmFrom Set for portNmFrom
     */
    public void setPortNmFrom(String portNmFrom) {
        this.portNmFrom = portNmFrom;
    }

    /**
     * Getter method for dischargePortCd.
     *
     * @return the dischargePortCd
     */
    public String getDischargePortCd() {
        return dischargePortCd;
    }

    /**
     * Setter method for dischargePortCd.
     *
     * @param dischargePortCd Set for dischargePortCd
     */
    public void setDischargePortCd(String dischargePortCd) {
        this.dischargePortCd = dischargePortCd;
    }

    /**
     * Getter method for toCntryCd.
     *
     * @return the toCntryCd
     */
    public String getToCntryCd() {
        return toCntryCd;
    }

    /**
     * Setter method for toCntryCd.
     *
     * @param toCntryCd Set for toCntryCd
     */
    public void setToCntryCd(String toCntryCd) {
        this.toCntryCd = toCntryCd;
    }

    /**
     * Getter method for portNmTo.
     *
     * @return the portNmTo
     */
    public String getPortNmTo() {
        return portNmTo;
    }

    /**
     * Setter method for portNmTo.
     *
     * @param portNmTo Set for portNmTo
     */
    public void setPortNmTo(String portNmTo) {
        this.portNmTo = portNmTo;
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
     * Getter method for eta.
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }

    /**
     * Getter method for arrivalTime.
     *
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Setter method for arrivalTime.
     *
     * @param arrivalTime Set for arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Getter method for bookingNo.
     *
     * @return the bookingNo
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * Setter method for bookingNo.
     *
     * @param bookingNo Set for bookingNo
     */
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    /**
     * Getter method for invoicePdfFileStream.
     *
     * @return the invoicePdfFileStream
     */
    public InputStream getInvoicePdfFileStream() {
        return invoicePdfFileStream;
    }

    /**
     * Setter method for invoicePdfFileStream.
     *
     * @param invoicePdfFileStream Set for invoicePdfFileStream
     */
    public void setInvoicePdfFileStream(InputStream invoicePdfFileStream) {
        this.invoicePdfFileStream = invoicePdfFileStream;
    }

    /**
     * Getter method for invoicePdfFileName.
     *
     * @return the invoicePdfFileName
     */
    public String getInvoicePdfFileName() {
        return invoicePdfFileName;
    }

    /**
     * Setter method for invoicePdfFileName.
     *
     * @param invoicePdfFileName Set for invoicePdfFileName
     */
    public void setInvoicePdfFileName(String invoicePdfFileName) {
        this.invoicePdfFileName = invoicePdfFileName;
    }

    /**
     * Getter method for invoicePdfFileSize.
     *
     * @return the invoicePdfFileSize
     */
    public int getInvoicePdfFileSize() {
        return invoicePdfFileSize;
    }

    /**
     * Setter method for invoicePdfFileSize.
     *
     * @param invoicePdfFileSize Set for invoicePdfFileSize
     */
    public void setInvoicePdfFileSize(int invoicePdfFileSize) {
        this.invoicePdfFileSize = invoicePdfFileSize;
    }

    /**
     * Getter method for packingListPdfFilaStream.
     *
     * @return the packingListPdfFilaStream
     */
    public InputStream getPackingListPdfFilaStream() {
        return packingListPdfFilaStream;
    }

    /**
     * Setter method for packingListPdfFilaStream.
     *
     * @param packingListPdfFilaStream Set for packingListPdfFilaStream
     */
    public void setPackingListPdfFilaStream(InputStream packingListPdfFilaStream) {
        this.packingListPdfFilaStream = packingListPdfFilaStream;
    }

    /**
     * Getter method for packingListPdfFileName.
     *
     * @return the packingListPdfFileName
     */
    public String getPackingListPdfFileName() {
        return packingListPdfFileName;
    }

    /**
     * Setter method for packingListPdfFileName.
     *
     * @param packingListPdfFileName Set for packingListPdfFileName
     */
    public void setPackingListPdfFileName(String packingListPdfFileName) {
        this.packingListPdfFileName = packingListPdfFileName;
    }

    /**
     * Getter method for packingListPdfFileSize.
     *
     * @return the packingListPdfFileSize
     */
    public int getPackingListPdfFileSize() {
        return packingListPdfFileSize;
    }

    /**
     * Setter method for packingListPdfFileSize.
     *
     * @param packingListPdfFileSize Set for packingListPdfFileSize
     */
    public void setPackingListPdfFileSize(int packingListPdfFileSize) {
        this.packingListPdfFileSize = packingListPdfFileSize;
    }

    /**
     * Getter method for orgInvoiceNo.
     *
     * @return the orgInvoiceNo
     */
    public String getOrgInvoiceNo() {
        return orgInvoiceNo;
    }

    /**
     * Setter method for orgInvoiceNo.
     *
     * @param orgInvoiceNo Set for orgInvoiceNo
     */
    public void setOrgInvoiceNo(String orgInvoiceNo) {
        this.orgInvoiceNo = orgInvoiceNo;
    }

    /**
     * Getter method for updateCount.
     *
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * Setter method for updateCount.
     *
     * @param updateCount Set for updateCount
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * Getter method for createCount.
     *
     * @return the createCount
     */
    public int getCreateCount() {
        return createCount;
    }

    /**
     * Setter method for createCount.
     *
     * @param createCount Set for createCount
     */
    public void setCreateCount(int createCount) {
        this.createCount = createCount;
    }

    /**
     * Getter method for takeOverParInvoiceShipperCd.
     *
     * @return the takeOverParInvoiceShipperCd
     */
    public String getTakeOverParInvoiceShipperCd() {
        return takeOverParInvoiceShipperCd;
    }

    /**
     * Setter method for takeOverParInvoiceShipperCd.
     *
     * @param takeOverParInvoiceShipperCd Set for takeOverParInvoiceShipperCd
     */
    public void setTakeOverParInvoiceShipperCd(String takeOverParInvoiceShipperCd) {
        this.takeOverParInvoiceShipperCd = takeOverParInvoiceShipperCd;
    }

    /**
     * Getter method for takeOverParInvoiceNo.
     *
     * @return the takeOverParInvoiceNo
     */
    public String getTakeOverParInvoiceNo() {
        return takeOverParInvoiceNo;
    }

    /**
     * Setter method for takeOverParInvoiceNo.
     *
     * @param takeOverParInvoiceNo Set for takeOverParInvoiceNo
     */
    public void setTakeOverParInvoiceNo(String takeOverParInvoiceNo) {
        this.takeOverParInvoiceNo = takeOverParInvoiceNo;
    }

    /**
     * Getter method for takeOverParInvoiceIssueDt.
     *
     * @return the takeOverParInvoiceIssueDt
     */
    public Date getTakeOverParInvoiceIssueDt() {
        return takeOverParInvoiceIssueDt;
    }

    /**
     * Setter method for takeOverParInvoiceIssueDt.
     *
     * @param takeOverParInvoiceIssueDt Set for takeOverParInvoiceIssueDt
     */
    public void setTakeOverParInvoiceIssueDt(Date takeOverParInvoiceIssueDt) {
        this.takeOverParInvoiceIssueDt = takeOverParInvoiceIssueDt;
    }
}
