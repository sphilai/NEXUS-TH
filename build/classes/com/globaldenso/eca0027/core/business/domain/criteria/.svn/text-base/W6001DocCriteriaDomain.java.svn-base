/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;
import java.util.Date;
import java.io.InputStream;
import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search criteria Documentation screen.
 * <br/>通関書類作成業務画面の検索条件ドメインです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11643 $
 */
public class W6001DocCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Date format .(screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Date format .(for forms)<br />
     * 日付フォーマット (帳票用)
     */
    private String reportDateFormat;
    
    /**
     * SERVER ID.<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * User function use authority.<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     *Agent Comp Cd
     */
    private String agentCompCd;

    /**
     *Aply Strt Dt
     */
    private Date aplyStrtDt;

    /**
     *Cancel Typ
     */
    private String cancelTyp;

    /**
     *Carrier Comp Cd
     */
    private String carrierCompCd;

    /**
     *Cml Typ
     */
    private String cmlTyp;

    /**
     *Comp Cd
     */
    private String compCd;

    /**
     *Consignee Cd
     */
    private String consigneeCd;

    /**
     *Container Loose Typ
     */
    private String containerLooseTyp;

    /**
     *Container Sorting Key
     */
    private String containerSortingKey;

    /**
     *Cur Wh Cd
     */
    private String curWhCd;

    /**
     *Cur Wh Comp Cd
     */
    private String curWhCompCd;

    /**
     *Custom Timing Typ
     */
    private String customTimingTyp;

    /**
     *Dsc Id
     */
    private String dscId;

    /**
     *Etd From
     */
    private Date fmEtd;

    /**
     *Etd To
     */
    private Date toEtd;

    /**
     *flg
     */
    private String flag;
    
    /**
     *Forwarder Comp Cd
     */
    private String forwarderCompCd;

    /**
     *Grp No 1
     */
    private String grpNo1;

    /**
     *Grp No 2
     */
    private String grpNo2;

    /**
     *Invoice Ctgry
     */
    private String invoiceCtgry;

    /**
     *Invoice Issue Dt
     */
    private Date invoiceIssueDt;
    
    /**
     *Display Invoice Issue Dt
     */
    private Date dispInvoiceIssueDt;

    /**
     *Invoice Issue Dt From
     */
    private Date invoiceIssueDtFrom;

    /**
     *Invoice Issue Dt To
     */
    private Date invoiceIssueDtTo;

    /**
     *Invoice No
     */
    private String invoiceNo;

    /**
     *Main Mark
     */
    private String mainMark;

    /**
     *Par Invoice No
     */
    private String parInvoiceNo;

    /**
     *Relate Invoice Shipper Cd
     */
    private String relateInvoiceShipperCd;

    /**
     *Shipper Cd
     */
    private String shipperCd;

    /**
     *Shipper Cd
     */
    private String shipperCdOrg;

    /**
     *Shipping Firm No
     */
    private String shippingFirmNo;

    /**
     *Ship To Cd
     */
    private String shipToCd;

    /**
     *Stg Act Dt
     */
    private String stgActDt;

    /**
     *Stg Act Dt From
     */
    private String stgActDtFrom;

    /**
     *Stg Act Dt To
     */
    private String stgActDtTo;

    /**
     *Stg Act No
     */
    private String stgActNo;
    
    /**
     *Stg.Com
     */
    private String stgCom;

    /**
     *Stg Instr Dt
     */
    private String stgInstrDt;

    /**
     *Stg Instr Dt From
     */
    private String stgInstrDtFrom;

    /**
     *Stg Instr Dt To
     */
    private String stgInstrDtTo;

    /**
     *Stg Instr No
     */
    private String stgInstrNo;
    
    /**
     *Stg W/H
     */
    private String stgWh;

    /**
     *Temp Invoice No
     */
    private String tempInvoiceNo;

    /**
     *Trns Cd
     */
    private String trnsCd;

    /**
     *Original Inv. No.
     */
    private String orgInvoiceNo;
    
    /**
     *Worked Dt
     */
    private Date workedDt;

    /**
     *Worked Dt From
     */
    private Date fmWorkedDt;

    /**
     *Worked Dt To
     */
    private Date toWorkedDt;
    
    /**
     *Stg Act Dt From
     */
    private Date fmStgActDt;

    /**
     *Stg Act Dt To
     */
    private Date toStgActDt;

    /**
     *Net Amount
     */
    private BigDecimal netAmount;

    /**
     *Freight
     */
    private BigDecimal freight;

    /**
     *Insurance
     */
    private BigDecimal insurance;

    /**
     *Vat After
     */
    private BigDecimal vatAfter;

    /**
     * FM) Country
     */
    private String fmCntryCd;
    
    /**
     *Port Cd From
     */
    private String loadingPortCd;

    /**
     * TO) Country
     */
    private String toCntryCd;
    
    /**
     *Port Cd To
     */
    private String dischargePortCd;

    // 2015/3/31 DNJP.Kawamura UT212対応 START >>>>>
    /**
     *delivery point
     */
    private String dlivPoint;
    // 2015/3/31 DNJP.Kawamura UT212対応 END <<<<<

    /**
     *Vessel
     */
    private String vessel;

    /**
     *Etd
     */
    private Date etd;

    /**
     *Eta
     */
    private Date eta;

    /**
     *Arrival Time
     */
    private String arrivalTime;

    /**
     *First Time Flg
     */
    private String firstTimeFlg;

    /**
     *Shipped Dt
     */
    private Date shippedDt;

    /**
     *Curr Cd
     */
    private String currCd;

    /**
     *Function No
     */
    private String functionNo;

    /**
     *Pay Meth
     */
    private String payMeth;

    /**
     *Upload Invoice File Name
     */
    private String invoiceFileNm;

    /**
     * Upload Invoice File Data
     */
    private InputStream invoiceFileData;
    
    /**
     *Upload Packinglist File Name
     */
    private String packinglistFileNm;
    
    /**
     * Upload Packinglist File Data
     */
    private InputStream packinglistFileData;

    /**
     *Price Terms
     */
    private String priceTerms;

    /**
     *Trade Terms
     */
    private String tradeTerms;

    /**
     *Terms Point
     */
    private String termsPoint;
    
    /**
     *Payment Terms
     */
    private String payTerms;

    /**
     *Remittance Or Lc
     */
    private String remLcTyp;

    /**
     *Remittance Bank Name
     */
    private String remBankNm;

    /**
     *Remittance Address1
     */
    private String remBankAddress1;

    /**
     *Remittance Address2
     */
    private String remBankAddress2;

    /**
     *Remittance Address3
     */
    private String remBankAddress3;

    /**
     *Remittance Account No
     */
    private String remBankAccountNo;

    /**
     *Lc No
     */
    private String lcNo;

    /**
     *Lc Date
     */
    private Date lcDt;

    /**
     *Lc Bank Name1
     */
    private String lcBank1;

    /**
     *Lc Bank Name2
     */
    private String lcBank2;
    
    /**
     *Lc Bank Name1
     */
    private String lcBankNm1;

    /**
     *Lc Bank Name2
     */
    private String lcBankNm2;

    /**
     *Freight ResponsResponsible Cd
     */
    private String freightResponsibleCd;

    /**
     *Sub Total
     */
    private BigDecimal subTotal;

    /**
     *vatRatio
     */
    private BigDecimal vatRatio;

    /**
     *Vat
     */
    private BigDecimal vat;

    /**
     *Handling Charge
     */
    private BigDecimal handlingCharge;

    /**
     *Free Additional
     */
    private BigDecimal additionalCharge;

    // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
    /**
     *Free Additional Code
     */
    private String additionalChargeCd;
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
    
    /**
     *Free Additional Name
     */
    private String additionalChargeNm;

    /**
     *Total Amount
     */
    private BigDecimal totalInvoiceAmount;

    /**
     *Total Pkg Qty
     */
    private BigDecimal pltzItemQty;

    /**
     *Total Vol
     */
    private BigDecimal totalVolume;

    /**
     *Unit Of Vol
     */
    private String volumeUnit;

    /**
     *Total N/W
     */
    private BigDecimal totalNetWeight;

    /**
     *Total G/W
     */
    private BigDecimal totalGrossWeight;

    /**
     *Unit Of Weight
     */
    private String weightUnit;

    /**
     *Type Of Inv
     */
    private String typeOfInv;

    /**
     *Class Of Inv
     */
    private String classOfInv;

    /**
     *Reference Inv No
     */
    private String relateInvoiceNo;

    /**
     *Booking No
     */
    private String bookingNo;

    /**
     * Takeover VALUE Invoice No.<br />
     *引継値 Invoice No
     */
    private String takeOverInvoiceNo;

    /**
     * Takeover VALUE Invoice Issue D.t<br />
     *引継値 Invoice Issue Dt
     */
    private Date takeOverInvoiceIssueDt;

    /**
     * Takeover VALUE Shipper Cd.<br />
     *引継値 Shipper Cd
     */
    private String takeOverShipperCd;

    /**
     * Takeover VALUE FRT Contain Flg.<br />
     *引継値 FRT Contain Flg
     */
    private String takeOverFrtContainFlg;
    
    /**
     *Customer Cd
     */
    private String customerCd;

    /**
     *Inv Template No
     */
    private String invTemplateNo;

    /**
     *Frt Consignee
     */
    private String frtConsigneeCd;

    /**
     *Free1 Chk Flg
     */
    private String free1ChkFlg;

    /**
     *Free2 Chk Flg
     */
    private String free2ChkFlg;

    /**
     *Free3 Chk Flg
     */
    private String free3ChkFlg;

    /**
     *Free4 Chk Flg
     */
    private String hsCodeCheckFlg;

    /**
     * Free1 Disp Flg
     */
    private String free1DispFlg;
    
    /**
     * Free2 Disp Flg
     */
    private String free2DispFlg;
    
    /**
     * Free3 Disp Flg
     */
    private String free3DispFlg;
    
    /**
     * Free4 Disp Flg
     */
    private String free4DispFlg;
    
    /**
     *Sp Info
     */
    private String spInfo;

    /**
     *Frt Shipper Cd
     */
    private String frtShipperCd;

    /**
     *Frt Shipper Tax Id No
     */
    private String frtShipperTaxIdNo;

    /**
     *No Charge
     */
    private BigDecimal noCharge;

    /**
     * Notify Party1 Company Code
     */
    private String notifyParty1CompCd;
    
    /**
     * Notify Party1 Company Name Abbr
     */
    private String notifyParty1CompNmAbb;
    
    /**
     *Notify Party1 Name
     */
    private String notifyParty1Nm;

    /**
     *Notify Party1 Address
     */
    private String notifyParty1Addr;
    
    /**
     * Notify Party2 Company Code
     */
    private String notifyParty2CompCd;
    
    /**
     * Notify Party2 Company Name Abbr
     */
    private String notifyParty2CompNmAbb;

    /**
     *Notify Party2 Name
     */
    private String notifyParty2Nm;

    /**
     *Notify Party2 Address
     */
    private String notifyParty2Addr;
    
    /**
     * Notify Party3 Company Code
     */
    private String notifyParty3CompCd;
    
    /**
     * Notify Party3 Company Name Abbr
     */
    private String notifyParty3CompNmAbb;

    /**
     *Notify Party3 Name
     */
    private String notifyParty3Nm;

    /**
     *Notify Party3 Address
     */
    private String notifyParty3Addr;
    
    /**
     * Notify Party4 Company Code
     */
    private String notifyParty4CompCd;
    
    /**
     * Notify Party4 Company Name Abbr
     */
    private String notifyParty4CompNmAbb;

    /**
     *Notify Party4 Name
     */
    private String notifyParty4Nm;

    /**
     *Notify Party4 Address
     */
    private String notifyParty4Addr;

    /**
     *Inv. Tpl No.
     */
    private String invTplNo;

    /**
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * by (VALUE selection of combo box)<br />
     * by(コンボボックスの選択値）
     */
    private String by;
    
    /**
     * FM) Date
     */
    private Date fmDate;
    
    /**
     * To) Date
     */
    private Date toDate;
    
    /**
     * Palletize table search flag.<br />
     * The contents of Palletize table is also included into the search target when the flag is "Y". <br />
     * パレタイズテーブル検索対象フラグ
     * <br />"Y"のとき、パレタイズテーブルの内容も検索対象にします。
     */
    private String ttPltzEnableFlg;

    /**
    * Date Shipped
    */
    private String dateShipped; 
    
    /**
     * Palletize STATUS<br />
     * パレタイズステータス
     */
    private String pltzStatus;
    
    /**
     * Upload file name for unique check.
     */
    private String uploadFileName;
    
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String keyInvoiceNo;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String keyShipperCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private Date keyInvoiceIssueDt;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String keyDeleteFlg;
    
    /**
     * INVOICE for<br />
     * INVOICE用
     */
    private String cancelFlg;
    /**
     * INVOICE for<br />
     * INVOICE用
     */
    private String invoiceIssuerNm;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String cancelInvoiceNo;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String deleteFlg;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String freightResponsibleNm;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String invoiceCtgryNm;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String manualFlg;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE/INVOICE HEADER用
     */
    private String payMethNm;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String additionalChargeCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String fileId;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String freightCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String handlingChargeCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String insuranceCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String netAmountCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String subTotalCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String totalInvoiceAmountCurrCd;
    /**
     * INVOICE / INVOICE HEADER for<br />
     * INVOICE HEADER用
     */
    private String vatCurrCd;
    
    /**
     * Palletize<br />
     *パレタイズ
     */
    private List<? extends W6001DocPltzDomain> docPltzList;
    
    /**
     * Number of registered.
     * 登録件数
     */
    private int updateCount;
    
    /**
     * Number of updated.
     * 更新件数
     */
    private int createCount;
    
    /**
     * issuer
     */
    private String issuer;
    
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
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001DocCriteriaDomain() {
        super();
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
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for agentCompCd.
     *
     * @return the agentCompCd
     */
    public String getAgentCompCd() {
        return agentCompCd;
    }

    /**
     * Setter method for agentCompCd.
     *
     * @param agentCompCd Set for agentCompCd
     */
    public void setAgentCompCd(String agentCompCd) {
        this.agentCompCd = agentCompCd;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
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
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
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
     * Getter method for fmEtd.
     *
     * @return the fmEtd
     */
    public Date getFmEtd() {
        return fmEtd;
    }

    /**
     * Setter method for fmEtd.
     *
     * @param fmEtd Set for fmEtd
     */
    public void setFmEtd(Date fmEtd) {
        this.fmEtd = fmEtd;
    }

    /**
     * Getter method for toEtd.
     *
     * @return the toEtd
     */
    public Date getToEtd() {
        return toEtd;
    }

    /**
     * Setter method for toEtd.
     *
     * @param toEtd Set for toEtd
     */
    public void setToEtd(Date toEtd) {
        this.toEtd = toEtd;
    }

    /**
     * Getter method for flag.
     *
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Setter method for flag.
     *
     * @param flag Set for flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
     * Getter method for grpNo1.
     *
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * Setter method for grpNo1.
     *
     * @param grpNo1 Set for grpNo1
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * Getter method for grpNo2.
     *
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * Setter method for grpNo2.
     *
     * @param grpNo2 Set for grpNo2
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
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
     * <p>dispInvoiceIssueDt のゲッターメソッドです。</p>
     *
     * @return the dispInvoiceIssueDt
     */
    public Date getDispInvoiceIssueDt() {
        return dispInvoiceIssueDt;
    }

    /**
     * <p>dispInvoiceIssueDt のセッターメソッドです。</p>
     *
     * @param dispInvoiceIssueDt dispInvoiceIssueDt に設定する
     */
    public void setDispInvoiceIssueDt(Date dispInvoiceIssueDt) {
        this.dispInvoiceIssueDt = dispInvoiceIssueDt;
    }

    /**
     * Getter method for invoiceIssueDtFrom.
     *
     * @return the invoiceIssueDtFrom
     */
    public Date getInvoiceIssueDtFrom() {
        return invoiceIssueDtFrom;
    }

    /**
     * Setter method for invoiceIssueDtFrom.
     *
     * @param invoiceIssueDtFrom Set for invoiceIssueDtFrom
     */
    public void setInvoiceIssueDtFrom(Date invoiceIssueDtFrom) {
        this.invoiceIssueDtFrom = invoiceIssueDtFrom;
    }

    /**
     * Getter method for invoiceIssueDtTo.
     *
     * @return the invoiceIssueDtTo
     */
    public Date getInvoiceIssueDtTo() {
        return invoiceIssueDtTo;
    }

    /**
     * Setter method for invoiceIssueDtTo.
     *
     * @param invoiceIssueDtTo Set for invoiceIssueDtTo
     */
    public void setInvoiceIssueDtTo(Date invoiceIssueDtTo) {
        this.invoiceIssueDtTo = invoiceIssueDtTo;
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
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * Getter method for shipperCdOrg.
     *
     * @return the shipperCdOrg
     */
    public String getShipperCdOrg() {
        return shipperCdOrg;
    }

    /**
     * Setter method for shipperCdOrg.
     *
     * @param shipperCdOrg Set for shipperCdOrg
     */
    public void setShipperCdOrg(String shipperCdOrg) {
        this.shipperCdOrg = shipperCdOrg;
    }

    /**
     * Getter method for shippingFirmNo.
     *
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * Setter method for shippingFirmNo.
     *
     * @param shippingFirmNo Set for shippingFirmNo
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
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
     * Getter method for stgActDt.
     *
     * @return the stgActDt
     */
    public String getStgActDt() {
        return stgActDt;
    }

    /**
     * Setter method for stgActDt.
     *
     * @param stgActDt Set for stgActDt
     */
    public void setStgActDt(String stgActDt) {
        this.stgActDt = stgActDt;
    }

    /**
     * Getter method for stgActDtFrom.
     *
     * @return the stgActDtFrom
     */
    public String getStgActDtFrom() {
        return stgActDtFrom;
    }

    /**
     * Setter method for stgActDtFrom.
     *
     * @param stgActDtFrom Set for stgActDtFrom
     */
    public void setStgActDtFrom(String stgActDtFrom) {
        this.stgActDtFrom = stgActDtFrom;
    }

    /**
     * Getter method for stgActDtTo.
     *
     * @return the stgActDtTo
     */
    public String getStgActDtTo() {
        return stgActDtTo;
    }

    /**
     * Setter method for stgActDtTo.
     *
     * @param stgActDtTo Set for stgActDtTo
     */
    public void setStgActDtTo(String stgActDtTo) {
        this.stgActDtTo = stgActDtTo;
    }

    /**
     * Getter method for stgActNo.
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo.
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }

    /**
     * Getter method for stgCom.
     *
     * @return the stgCom
     */
    public String getStgCom() {
        return stgCom;
    }

    /**
     * Setter method for stgCom.
     *
     * @param stgCom Set for stgCom
     */
    public void setStgCom(String stgCom) {
        this.stgCom = stgCom;
    }

    /**
     * Getter method for stgInstrDt.
     *
     * @return the stgInstrDt
     */
    public String getStgInstrDt() {
        return stgInstrDt;
    }

    /**
     * Setter method for stgInstrDt.
     *
     * @param stgInstrDt Set for stgInstrDt
     */
    public void setStgInstrDt(String stgInstrDt) {
        this.stgInstrDt = stgInstrDt;
    }

    /**
     * Getter method for stgInstrDtFrom.
     *
     * @return the stgInstrDtFrom
     */
    public String getStgInstrDtFrom() {
        return stgInstrDtFrom;
    }

    /**
     * Setter method for stgInstrDtFrom.
     *
     * @param stgInstrDtFrom Set for stgInstrDtFrom
     */
    public void setStgInstrDtFrom(String stgInstrDtFrom) {
        this.stgInstrDtFrom = stgInstrDtFrom;
    }

    /**
     * Getter method for stgInstrDtTo.
     *
     * @return the stgInstrDtTo
     */
    public String getStgInstrDtTo() {
        return stgInstrDtTo;
    }

    /**
     * Setter method for stgInstrDtTo.
     *
     * @param stgInstrDtTo Set for stgInstrDtTo
     */
    public void setStgInstrDtTo(String stgInstrDtTo) {
        this.stgInstrDtTo = stgInstrDtTo;
    }

    /**
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * Getter method for stgWh.
     *
     * @return the stgWh
     */
    public String getStgWh() {
        return stgWh;
    }

    /**
     * Setter method for stgWh.
     *
     * @param stgWh Set for stgWh
     */
    public void setStgWh(String stgWh) {
        this.stgWh = stgWh;
    }

    /**
     * Getter method for tempInvoiceNo.
     *
     * @return the tempInvoiceNo
     */
    public String getTempInvoiceNo() {
        return tempInvoiceNo;
    }

    /**
     * Setter method for tempInvoiceNo.
     *
     * @param tempInvoiceNo Set for tempInvoiceNo
     */
    public void setTempInvoiceNo(String tempInvoiceNo) {
        this.tempInvoiceNo = tempInvoiceNo;
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
     * Getter method for workedDt.
     *
     * @return the workedDt
     */
    public Date getWorkedDt() {
        return workedDt;
    }

    /**
     * Setter method for workedDt.
     *
     * @param workedDt Set for workedDt
     */
    public void setWorkedDt(Date workedDt) {
        this.workedDt = workedDt;
    }

    /**
     * Getter method for fmWorkedDt.
     *
     * @return the fmWorkedDt
     */
    public Date getFmWorkedDt() {
        return fmWorkedDt;
    }

    /**
     * Setter method for fmWorkedDt.
     *
     * @param fmWorkedDt Set for fmWorkedDt
     */
    public void setFmWorkedDt(Date fmWorkedDt) {
        this.fmWorkedDt = fmWorkedDt;
    }

    /**
     * Getter method for toWorkedDt.
     *
     * @return the toWorkedDt
     */
    public Date getToWorkedDt() {
        return toWorkedDt;
    }

    /**
     * Setter method for toWorkedDt.
     *
     * @param toWorkedDt Set for toWorkedDt
     */
    public void setToWorkedDt(Date toWorkedDt) {
        this.toWorkedDt = toWorkedDt;
    }

    /**
     * Getter method for fmStgActDt.
     *
     * @return the fmStgActDt
     */
    public Date getFmStgActDt() {
        return fmStgActDt;
    }

    /**
     * Setter method for fmStgActDt.
     *
     * @param fmStgActDt Set for fmStgActDt
     */
    public void setFmStgActDt(Date fmStgActDt) {
        this.fmStgActDt = fmStgActDt;
    }

    /**
     * Getter method for toStgActDt.
     *
     * @return the toStgActDt
     */
    public Date getToStgActDt() {
        return toStgActDt;
    }

    /**
     * Setter method for toStgActDt.
     *
     * @param toStgActDt Set for toStgActDt
     */
    public void setToStgActDt(Date toStgActDt) {
        this.toStgActDt = toStgActDt;
    }

    /**
     * Getter method for netAmount.
     *
     * @return the netAmount
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Setter method for netAmount.
     *
     * @param netAmount Set for netAmount
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Getter method for freight.
     *
     * @return the freight
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * Setter method for freight.
     *
     * @param freight Set for freight
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * Getter method for insurance.
     *
     * @return the insurance
     */
    public BigDecimal getInsurance() {
        return insurance;
    }

    /**
     * Setter method for insurance.
     *
     * @param insurance Set for insurance
     */
    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    /**
     * Getter method for vatAfter.
     *
     * @return the vatAfter
     */
    public BigDecimal getVatAfter() {
        return vatAfter;
    }

    /**
     * Setter method for vatAfter.
     *
     * @param vatAfter Set for vatAfter
     */
    public void setVatAfter(BigDecimal vatAfter) {
        this.vatAfter = vatAfter;
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
     * Getter method for firstTimeFlg.
     *
     * @return the firstTimeFlg
     */
    public String getFirstTimeFlg() {
        return firstTimeFlg;
    }

    /**
     * Setter method for firstTimeFlg.
     *
     * @param firstTimeFlg Set for firstTimeFlg
     */
    public void setFirstTimeFlg(String firstTimeFlg) {
        this.firstTimeFlg = firstTimeFlg;
    }

    /**
     * Getter method for shippedDt.
     *
     * @return the shippedDt
     */
    public Date getShippedDt() {
        return shippedDt;
    }

    /**
     * Setter method for shippedDt.
     *
     * @param shippedDt Set for shippedDt
     */
    public void setShippedDt(Date shippedDt) {
        this.shippedDt = shippedDt;
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
     * Getter method for payMeth.
     *
     * @return the payMeth
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * Setter method for payMeth.
     *
     * @param payMeth Set for payMeth
     */
    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
    }

    /**
     * Getter method for invoiceFileNm.
     *
     * @return the invoiceFileNm
     */
    public String getInvoiceFileNm() {
        return invoiceFileNm;
    }

    /**
     * Setter method for invoiceFileNm.
     *
     * @param invoiceFileNm Set for invoiceFileNm
     */
    public void setInvoiceFileNm(String invoiceFileNm) {
        this.invoiceFileNm = invoiceFileNm;
    }

    /**
     * Getter method for invoiceFileData.
     *
     * @return the invoiceFileData
     */
    public InputStream getInvoiceFileData() {
        return invoiceFileData;
    }

    /**
     * Setter method for invoiceFileData.
     *
     * @param invoiceFileData Set for invoiceFileData
     */
    public void setInvoiceFileData(InputStream invoiceFileData) {
        this.invoiceFileData = invoiceFileData;
    }

    /**
     * Getter method for packinglistFileNm.
     *
     * @return the packinglistFileNm
     */
    public String getPackinglistFileNm() {
        return packinglistFileNm;
    }

    /**
     * Setter method for packinglistFileNm.
     *
     * @param packinglistFileNm Set for packinglistFileNm
     */
    public void setPackinglistFileNm(String packinglistFileNm) {
        this.packinglistFileNm = packinglistFileNm;
    }

    /**
     * Getter method for packinglistFileData.
     *
     * @return the packinglistFileData
     */
    public InputStream getPackinglistFileData() {
        return packinglistFileData;
    }

    /**
     * Setter method for packinglistFileData.
     *
     * @param packinglistFileData Set for packinglistFileData
     */
    public void setPackinglistFileData(InputStream packinglistFileData) {
        this.packinglistFileData = packinglistFileData;
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
     * Getter method for remLcTyp.
     *
     * @return the remLcTyp
     */
    public String getRemLcTyp() {
        return remLcTyp;
    }

    /**
     * Setter method for remLcTyp.
     *
     * @param remLcTyp Set for remLcTyp
     */
    public void setRemLcTyp(String remLcTyp) {
        this.remLcTyp = remLcTyp;
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
    public Date getLcDt() {
        return lcDt;
    }

    /**
     * Setter method for lcDt.
     *
     * @param lcDt Set for lcDt
     */
    public void setLcDt(Date lcDt) {
        this.lcDt = lcDt;
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
     * Getter method for lcBankNm1.
     *
     * @return the lcBankNm1
     */
    public String getLcBankNm1() {
        return lcBankNm1;
    }

    /**
     * Setter method for lcBankNm1.
     *
     * @param lcBankNm1 Set for lcBankNm1
     */
    public void setLcBankNm1(String lcBankNm1) {
        this.lcBankNm1 = lcBankNm1;
    }

    /**
     * Getter method for lcBankNm2.
     *
     * @return the lcBankNm2
     */
    public String getLcBankNm2() {
        return lcBankNm2;
    }

    /**
     * Setter method for lcBankNm2.
     *
     * @param lcBankNm2 Set for lcBankNm2
     */
    public void setLcBankNm2(String lcBankNm2) {
        this.lcBankNm2 = lcBankNm2;
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
     * Getter method for subTotal.
     *
     * @return the subTotal
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Setter method for subTotal.
     *
     * @param subTotal Set for subTotal
     */
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Getter method for vatRatio.
     *
     * @return the vatRatio
     */
    public BigDecimal getVatRatio() {
        return vatRatio;
    }

    /**
     * Setter method for vatRatio.
     *
     * @param vatRatio Set for vatRatio
     */
    public void setVatRatio(BigDecimal vatRatio) {
        this.vatRatio = vatRatio;
    }

    /**
     * Getter method for vat.
     *
     * @return the vat
     */
    public BigDecimal getVat() {
        return vat;
    }

    /**
     * Setter method for vat.
     *
     * @param vat Set for vat
     */
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    /**
     * Getter method for handlingCharge.
     *
     * @return the handlingCharge
     */
    public BigDecimal getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * Setter method for handlingCharge.
     *
     * @param handlingCharge Set for handlingCharge
     */
    public void setHandlingCharge(BigDecimal handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    /**
     * Getter method for additionalCharge.
     *
     * @return the additionalCharge
     */
    public BigDecimal getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * Setter method for additionalCharge.
     *
     * @param additionalCharge Set for additionalCharge
     */
    public void setAdditionalCharge(BigDecimal additionalCharge) {
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
     * Getter method for totalInvoiceAmount.
     *
     * @return the totalInvoiceAmount
     */
    public BigDecimal getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Setter method for totalInvoiceAmount.
     *
     * @param totalInvoiceAmount Set for totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(BigDecimal totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
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
     * Getter method for totalVolume.
     *
     * @return the totalVolume
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * Setter method for totalVolume.
     *
     * @param totalVolume Set for totalVolume
     */
    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
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
     * Getter method for totalNetWeight.
     *
     * @return the totalNetWeight
     */
    public BigDecimal getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * Setter method for totalNetWeight.
     *
     * @param totalNetWeight Set for totalNetWeight
     */
    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * Getter method for totalGrossWeight.
     *
     * @return the totalGrossWeight
     */
    public BigDecimal getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * Setter method for totalGrossWeight.
     *
     * @param totalGrossWeight Set for totalGrossWeight
     */
    public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
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
     * Getter method for invTemplateNo.
     *
     * @return the invTemplateNo
     */
    public String getInvTemplateNo() {
        return invTemplateNo;
    }

    /**
     * Setter method for invTemplateNo.
     *
     * @param invTemplateNo Set for invTemplateNo
     */
    public void setInvTemplateNo(String invTemplateNo) {
        this.invTemplateNo = invTemplateNo;
    }

    /**
     * Getter method for frtConsigneeCd.
     *
     * @return the frtConsigneeCd
     */
    public String getFrtConsigneeCd() {
        return frtConsigneeCd;
    }

    /**
     * Setter method for frtConsigneeCd.
     *
     * @param frtConsigneeCd Set for frtConsigneeCd
     */
    public void setFrtConsigneeCd(String frtConsigneeCd) {
        this.frtConsigneeCd = frtConsigneeCd;
    }

    /**
     * Getter method for free1ChkFlg.
     *
     * @return the free1ChkFlg
     */
    public String getFree1ChkFlg() {
        return free1ChkFlg;
    }

    /**
     * Setter method for free1ChkFlg.
     *
     * @param free1ChkFlg Set for free1ChkFlg
     */
    public void setFree1ChkFlg(String free1ChkFlg) {
        this.free1ChkFlg = free1ChkFlg;
    }

    /**
     * Getter method for free2ChkFlg.
     *
     * @return the free2ChkFlg
     */
    public String getFree2ChkFlg() {
        return free2ChkFlg;
    }

    /**
     * Setter method for free2ChkFlg.
     *
     * @param free2ChkFlg Set for free2ChkFlg
     */
    public void setFree2ChkFlg(String free2ChkFlg) {
        this.free2ChkFlg = free2ChkFlg;
    }

    /**
     * Getter method for free3ChkFlg.
     *
     * @return the free3ChkFlg
     */
    public String getFree3ChkFlg() {
        return free3ChkFlg;
    }

    /**
     * Setter method for free3ChkFlg.
     *
     * @param free3ChkFlg Set for free3ChkFlg
     */
    public void setFree3ChkFlg(String free3ChkFlg) {
        this.free3ChkFlg = free3ChkFlg;
    }

    /**
     * Getter method for hsCodeCheckFlg.
     *
     * @return the hsCodeCheckFlg
     */
    public String getHsCodeCheckFlg() {
        return hsCodeCheckFlg;
    }

    /**
     * Setter method for hsCodeCheckFlg.
     *
     * @param hsCodeCheckFlg Set for hsCodeCheckFlg
     */
    public void setHsCodeCheckFlg(String hsCodeCheckFlg) {
        this.hsCodeCheckFlg = hsCodeCheckFlg;
    }

    /**
     * Getter method for free1DispFlg.
     *
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * Setter method for free1DispFlg.
     *
     * @param free1DispFlg Set for free1DispFlg
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * Getter method for free2DispFlg.
     *
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * Setter method for free2DispFlg.
     *
     * @param free2DispFlg Set for free2DispFlg
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * Getter method for free3DispFlg.
     *
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * Setter method for free3DispFlg.
     *
     * @param free3DispFlg Set for free3DispFlg
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * Getter method for free4DispFlg.
     *
     * @return the free4DispFlg
     */
    public String getFree4DispFlg() {
        return free4DispFlg;
    }

    /**
     * Setter method for free4DispFlg.
     *
     * @param free4DispFlg Set for free4DispFlg
     */
    public void setFree4DispFlg(String free4DispFlg) {
        this.free4DispFlg = free4DispFlg;
    }

    /**
     * Getter method for spInfo.
     *
     * @return the spInfo
     */
    public String getSpInfo() {
        return spInfo;
    }

    /**
     * Setter method for spInfo.
     *
     * @param spInfo Set for spInfo
     */
    public void setSpInfo(String spInfo) {
        this.spInfo = spInfo;
    }

    /**
     * Getter method for frtShipperCd.
     *
     * @return the frtShipperCd
     */
    public String getFrtShipperCd() {
        return frtShipperCd;
    }

    /**
     * Setter method for frtShipperCd.
     *
     * @param frtShipperCd Set for frtShipperCd
     */
    public void setFrtShipperCd(String frtShipperCd) {
        this.frtShipperCd = frtShipperCd;
    }

    /**
     * Getter method for frtShipperTaxIdNo.
     *
     * @return the frtShipperTaxIdNo
     */
    public String getFrtShipperTaxIdNo() {
        return frtShipperTaxIdNo;
    }

    /**
     * Setter method for frtShipperTaxIdNo.
     *
     * @param frtShipperTaxIdNo Set for frtShipperTaxIdNo
     */
    public void setFrtShipperTaxIdNo(String frtShipperTaxIdNo) {
        this.frtShipperTaxIdNo = frtShipperTaxIdNo;
    }

    /**
     * Getter method for noCharge.
     *
     * @return the noCharge
     */
    public BigDecimal getNoCharge() {
        return noCharge;
    }

    /**
     * Setter method for noCharge.
     *
     * @param noCharge Set for noCharge
     */
    public void setNoCharge(BigDecimal noCharge) {
        this.noCharge = noCharge;
    }

    /**
     * Getter method for notifyParty1Nm.
     *
     * @return the notifyParty1Nm
     */
    public String getNotifyParty1Nm() {
        return notifyParty1Nm;
    }

    /**
     * Setter method for notifyParty1Nm.
     *
     * @param notifyParty1Nm Set for notifyParty1Nm
     */
    public void setNotifyParty1Nm(String notifyParty1Nm) {
        this.notifyParty1Nm = notifyParty1Nm;
    }

    /**
     * Getter method for notifyParty1Addr.
     *
     * @return the notifyParty1Addr
     */
    public String getNotifyParty1Addr() {
        return notifyParty1Addr;
    }

    /**
     * Setter method for notifyParty1Addr.
     *
     * @param notifyParty1Addr Set for notifyParty1Addr
     */
    public void setNotifyParty1Addr(String notifyParty1Addr) {
        this.notifyParty1Addr = notifyParty1Addr;
    }

    /**
     * Getter method for notifyParty2Nm.
     *
     * @return the notifyParty2Nm
     */
    public String getNotifyParty2Nm() {
        return notifyParty2Nm;
    }

    /**
     * Setter method for notifyParty2Nm.
     *
     * @param notifyParty2Nm Set for notifyParty2Nm
     */
    public void setNotifyParty2Nm(String notifyParty2Nm) {
        this.notifyParty2Nm = notifyParty2Nm;
    }

    /**
     * Getter method for notifyParty2Addr.
     *
     * @return the notifyParty2Addr
     */
    public String getNotifyParty2Addr() {
        return notifyParty2Addr;
    }

    /**
     * Setter method for notifyParty2Addr.
     *
     * @param notifyParty2Addr Set for notifyParty2Addr
     */
    public void setNotifyParty2Addr(String notifyParty2Addr) {
        this.notifyParty2Addr = notifyParty2Addr;
    }

    /**
     * Getter method for notifyParty3Nm.
     *
     * @return the notifyParty3Nm
     */
    public String getNotifyParty3Nm() {
        return notifyParty3Nm;
    }

    /**
     * Setter method for notifyParty3Nm.
     *
     * @param notifyParty3Nm Set for notifyParty3Nm
     */
    public void setNotifyParty3Nm(String notifyParty3Nm) {
        this.notifyParty3Nm = notifyParty3Nm;
    }

    /**
     * Getter method for notifyParty3Addr.
     *
     * @return the notifyParty3Addr
     */
    public String getNotifyParty3Addr() {
        return notifyParty3Addr;
    }

    /**
     * Setter method for notifyParty3Addr.
     *
     * @param notifyParty3Addr Set for notifyParty3Addr
     */
    public void setNotifyParty3Addr(String notifyParty3Addr) {
        this.notifyParty3Addr = notifyParty3Addr;
    }

    /**
     * Getter method for notifyParty4Nm.
     *
     * @return the notifyParty4Nm
     */
    public String getNotifyParty4Nm() {
        return notifyParty4Nm;
    }

    /**
     * Setter method for notifyParty4Nm.
     *
     * @param notifyParty4Nm Set for notifyParty4Nm
     */
    public void setNotifyParty4Nm(String notifyParty4Nm) {
        this.notifyParty4Nm = notifyParty4Nm;
    }

    /**
     * Getter method for notifyParty4Addr.
     *
     * @return the notifyParty4Addr
     */
    public String getNotifyParty4Addr() {
        return notifyParty4Addr;
    }

    /**
     * Setter method for notifyParty4Addr.
     *
     * @param notifyParty4Addr Set for notifyParty4Addr
     */
    public void setNotifyParty4Addr(String notifyParty4Addr) {
        this.notifyParty4Addr = notifyParty4Addr;
    }

    /**
     * Getter method for invTplNo.
     *
     * @return the invTplNo
     */
    public String getInvTplNo() {
        return invTplNo;
    }

    /**
     * Setter method for invTplNo.
     *
     * @param invTplNo Set for invTplNo
     */
    public void setInvTplNo(String invTplNo) {
        this.invTplNo = invTplNo;
    }

    /**
     * Getter method for pageInfoCreator.
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * Setter method for pageInfoCreator.
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * Getter method for by.
     *
     * @return the by
     */
    public String getBy() {
        return by;
    }

    /**
     * Setter method for by.
     *
     * @param by Set for by
     */
    public void setBy(String by) {
        this.by = by;
    }

    /**
     * Getter method for fmDate.
     *
     * @return the fmDate
     */
    public Date getFmDate() {
        return fmDate;
    }

    /**
     * Setter method for fmDate.
     *
     * @param fmDate Set for fmDate
     */
    public void setFmDate(Date fmDate) {
        this.fmDate = fmDate;
    }

    /**
     * Getter method for toDate.
     *
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * Setter method for toDate.
     *
     * @param toDate Set for toDate
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * Getter method for ttPltzEnableFlg.
     *
     * @return the ttPltzEnableFlg
     */
    public String getTtPltzEnableFlg() {
        return ttPltzEnableFlg;
    }

    /**
     * Setter method for ttPltzEnableFlg.
     *
     * @param ttPltzEnableFlg Set for ttPltzEnableFlg
     */
    public void setTtPltzEnableFlg(String ttPltzEnableFlg) {
        this.ttPltzEnableFlg = ttPltzEnableFlg;
    }

    /**
     * Getter method for dateShipped.
     *
     * @return the dateShipped
     */
    public String getDateShipped() {
        return dateShipped;
    }

    /**
     * Setter method for dateShipped.
     *
     * @param dateShipped Set for dateShipped
     */
    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    /**
     * Getter method for pltzStatus.
     *
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * Setter method for pltzStatus.
     *
     * @param pltzStatus Set for pltzStatus
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * Getter method for uploadFileName.
     *
     * @return the uploadFileName
     */
    public String getUploadFileName() {
        return uploadFileName;
    }

    /**
     * Setter method for uploadFileName.
     *
     * @param uploadFileName Set for uploadFileName
     */
    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    /**
     * Getter method for keyInvoiceNo.
     *
     * @return the keyInvoiceNo
     */
    public String getKeyInvoiceNo() {
        return keyInvoiceNo;
    }

    /**
     * Setter method for keyInvoiceNo.
     *
     * @param keyInvoiceNo Set for keyInvoiceNo
     */
    public void setKeyInvoiceNo(String keyInvoiceNo) {
        this.keyInvoiceNo = keyInvoiceNo;
    }

    /**
     * Getter method for keyShipperCd.
     *
     * @return the keyShipperCd
     */
    public String getKeyShipperCd() {
        return keyShipperCd;
    }

    /**
     * Setter method for keyShipperCd.
     *
     * @param keyShipperCd Set for keyShipperCd
     */
    public void setKeyShipperCd(String keyShipperCd) {
        this.keyShipperCd = keyShipperCd;
    }

    /**
     * Getter method for keyInvoiceIssueDt.
     *
     * @return the keyInvoiceIssueDt
     */
    public Date getKeyInvoiceIssueDt() {
        return keyInvoiceIssueDt;
    }

    /**
     * Setter method for keyInvoiceIssueDt.
     *
     * @param keyInvoiceIssueDt Set for keyInvoiceIssueDt
     */
    public void setKeyInvoiceIssueDt(Date keyInvoiceIssueDt) {
        this.keyInvoiceIssueDt = keyInvoiceIssueDt;
    }

    /**
     * Getter method for keyDeleteFlg.
     *
     * @return the keyDeleteFlg
     */
    public String getKeyDeleteFlg() {
        return keyDeleteFlg;
    }

    /**
     * Setter method for keyDeleteFlg.
     *
     * @param keyDeleteFlg Set for keyDeleteFlg
     */
    public void setKeyDeleteFlg(String keyDeleteFlg) {
        this.keyDeleteFlg = keyDeleteFlg;
    }

    /**
     * Getter method for cancelFlg.
     *
     * @return the cancelFlg
     */
    public String getCancelFlg() {
        return cancelFlg;
    }

    /**
     * Setter method for cancelFlg.
     *
     * @param cancelFlg Set for cancelFlg
     */
    public void setCancelFlg(String cancelFlg) {
        this.cancelFlg = cancelFlg;
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

    /**
     * Getter method for cancelInvoiceNo.
     *
     * @return the cancelInvoiceNo
     */
    public String getCancelInvoiceNo() {
        return cancelInvoiceNo;
    }

    /**
     * Setter method for cancelInvoiceNo.
     *
     * @param cancelInvoiceNo Set for cancelInvoiceNo
     */
    public void setCancelInvoiceNo(String cancelInvoiceNo) {
        this.cancelInvoiceNo = cancelInvoiceNo;
    }

    /**
     * Getter method for deleteFlg.
     *
     * @return the deleteFlg
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * Setter method for deleteFlg.
     *
     * @param deleteFlg Set for deleteFlg
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * Getter method for freightResponsibleNm.
     *
     * @return the freightResponsibleNm
     */
    public String getFreightResponsibleNm() {
        return freightResponsibleNm;
    }

    /**
     * Setter method for freightResponsibleNm.
     *
     * @param freightResponsibleNm Set for freightResponsibleNm
     */
    public void setFreightResponsibleNm(String freightResponsibleNm) {
        this.freightResponsibleNm = freightResponsibleNm;
    }

    /**
     * Getter method for invoiceCtgryNm.
     *
     * @return the invoiceCtgryNm
     */
    public String getInvoiceCtgryNm() {
        return invoiceCtgryNm;
    }

    /**
     * Setter method for invoiceCtgryNm.
     *
     * @param invoiceCtgryNm Set for invoiceCtgryNm
     */
    public void setInvoiceCtgryNm(String invoiceCtgryNm) {
        this.invoiceCtgryNm = invoiceCtgryNm;
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
     * Getter method for payMethNm.
     *
     * @return the payMethNm
     */
    public String getPayMethNm() {
        return payMethNm;
    }

    /**
     * Setter method for payMethNm.
     *
     * @param payMethNm Set for payMethNm
     */
    public void setPayMethNm(String payMethNm) {
        this.payMethNm = payMethNm;
    }

    /**
     * Getter method for additionalChargeCurrCd.
     *
     * @return the additionalChargeCurrCd
     */
    public String getAdditionalChargeCurrCd() {
        return additionalChargeCurrCd;
    }

    /**
     * Setter method for additionalChargeCurrCd.
     *
     * @param additionalChargeCurrCd Set for additionalChargeCurrCd
     */
    public void setAdditionalChargeCurrCd(String additionalChargeCurrCd) {
        this.additionalChargeCurrCd = additionalChargeCurrCd;
    }

    /**
     * Getter method for fileId.
     *
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Setter method for fileId.
     *
     * @param fileId Set for fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Getter method for freightCurrCd.
     *
     * @return the freightCurrCd
     */
    public String getFreightCurrCd() {
        return freightCurrCd;
    }

    /**
     * Setter method for freightCurrCd.
     *
     * @param freightCurrCd Set for freightCurrCd
     */
    public void setFreightCurrCd(String freightCurrCd) {
        this.freightCurrCd = freightCurrCd;
    }

    /**
     * Getter method for handlingChargeCurrCd.
     *
     * @return the handlingChargeCurrCd
     */
    public String getHandlingChargeCurrCd() {
        return handlingChargeCurrCd;
    }

    /**
     * Setter method for handlingChargeCurrCd.
     *
     * @param handlingChargeCurrCd Set for handlingChargeCurrCd
     */
    public void setHandlingChargeCurrCd(String handlingChargeCurrCd) {
        this.handlingChargeCurrCd = handlingChargeCurrCd;
    }

    /**
     * Getter method for insuranceCurrCd.
     *
     * @return the insuranceCurrCd
     */
    public String getInsuranceCurrCd() {
        return insuranceCurrCd;
    }

    /**
     * Setter method for insuranceCurrCd.
     *
     * @param insuranceCurrCd Set for insuranceCurrCd
     */
    public void setInsuranceCurrCd(String insuranceCurrCd) {
        this.insuranceCurrCd = insuranceCurrCd;
    }

    /**
     * Getter method for netAmountCurrCd.
     *
     * @return the netAmountCurrCd
     */
    public String getNetAmountCurrCd() {
        return netAmountCurrCd;
    }

    /**
     * Setter method for netAmountCurrCd.
     *
     * @param netAmountCurrCd Set for netAmountCurrCd
     */
    public void setNetAmountCurrCd(String netAmountCurrCd) {
        this.netAmountCurrCd = netAmountCurrCd;
    }

    /**
     * Getter method for subTotalCurrCd.
     *
     * @return the subTotalCurrCd
     */
    public String getSubTotalCurrCd() {
        return subTotalCurrCd;
    }

    /**
     * Setter method for subTotalCurrCd.
     *
     * @param subTotalCurrCd Set for subTotalCurrCd
     */
    public void setSubTotalCurrCd(String subTotalCurrCd) {
        this.subTotalCurrCd = subTotalCurrCd;
    }

    /**
     * Getter method for totalInvoiceAmountCurrCd.
     *
     * @return the totalInvoiceAmountCurrCd
     */
    public String getTotalInvoiceAmountCurrCd() {
        return totalInvoiceAmountCurrCd;
    }

    /**
     * Setter method for totalInvoiceAmountCurrCd.
     *
     * @param totalInvoiceAmountCurrCd Set for totalInvoiceAmountCurrCd
     */
    public void setTotalInvoiceAmountCurrCd(String totalInvoiceAmountCurrCd) {
        this.totalInvoiceAmountCurrCd = totalInvoiceAmountCurrCd;
    }

    /**
     * Getter method for vatCurrCd.
     *
     * @return the vatCurrCd
     */
    public String getVatCurrCd() {
        return vatCurrCd;
    }

    /**
     * Setter method for vatCurrCd.
     *
     * @param vatCurrCd Set for vatCurrCd
     */
    public void setVatCurrCd(String vatCurrCd) {
        this.vatCurrCd = vatCurrCd;
    }

    /**
     * Getter method for docPltzList.
     *
     * @return the docPltzList
     */
    public List<? extends W6001DocPltzDomain> getDocPltzList() {
        return docPltzList;
    }

    /**
     * Setter method for docPltzList.
     *
     * @param docPltzList Set for docPltzList
     */
    public void setDocPltzList(List<? extends W6001DocPltzDomain> docPltzList) {
        this.docPltzList = docPltzList;
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
     * Getter method for issuer.
     *
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Setter method for issuer.
     *
     * @param issuer Set for issuer
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
    /**
     * <p>Getter method for additionalChargeCd.</p>
     *
     * @return the additionalChargeCd
     */
    public String getAdditionalChargeCd() {
        return additionalChargeCd;
    }

    /**
     * <p>Setter method for additionalChargeCd.</p>
     *
     * @param additionalChargeCd Set for additionalChargeCd
     */
    public void setAdditionalChargeCd(String additionalChargeCd) {
        this.additionalChargeCd = additionalChargeCd;
    }
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<

    // 2015/3/31 DNJP.Kawamura UT212対応 START >>>>>
    /**
     * <p>Getter method for dlivPoint.</p>
     *
     * @return the dlivPoint
     */
    public String getDlivPoint() {
        return dlivPoint;
    }

    /**
     * <p>Setter method for dlivPoint.</p>
     *
     * @param dlivPoint Set for dlivPoint
     */
    public void setDlivPoint(String dlivPoint) {
        this.dlivPoint = dlivPoint;
    }
    // 2015/3/31 DNJP.Kawamura UT212対応 END <<<<<

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

    /**
     * <p>notifyParty1CompCd のゲッターメソッドです。</p>
     *
     * @return the notifyParty1CompCd
     */
    public String getNotifyParty1CompCd() {
        return notifyParty1CompCd;
    }

    /**
     * <p>notifyParty1CompCd のセッターメソッドです。</p>
     *
     * @param notifyParty1CompCd notifyParty1CompCd に設定する
     */
    public void setNotifyParty1CompCd(String notifyParty1CompCd) {
        this.notifyParty1CompCd = notifyParty1CompCd;
    }

    /**
     * <p>notifyParty1CompNmAbb のゲッターメソッドです。</p>
     *
     * @return the notifyParty1CompNmAbb
     */
    public String getNotifyParty1CompNmAbb() {
        return notifyParty1CompNmAbb;
    }

    /**
     * <p>notifyParty1CompNmAbb のセッターメソッドです。</p>
     *
     * @param notifyParty1CompNmAbb notifyParty1CompNmAbb に設定する
     */
    public void setNotifyParty1CompNmAbb(String notifyParty1CompNmAbb) {
        this.notifyParty1CompNmAbb = notifyParty1CompNmAbb;
    }

    /**
     * <p>notifyParty2CompCd のゲッターメソッドです。</p>
     *
     * @return the notifyParty2CompCd
     */
    public String getNotifyParty2CompCd() {
        return notifyParty2CompCd;
    }

    /**
     * <p>notifyParty2CompCd のセッターメソッドです。</p>
     *
     * @param notifyParty2CompCd notifyParty2CompCd に設定する
     */
    public void setNotifyParty2CompCd(String notifyParty2CompCd) {
        this.notifyParty2CompCd = notifyParty2CompCd;
    }

    /**
     * <p>notifyParty2CompNmAbb のゲッターメソッドです。</p>
     *
     * @return the notifyParty2CompNmAbb
     */
    public String getNotifyParty2CompNmAbb() {
        return notifyParty2CompNmAbb;
    }

    /**
     * <p>notifyParty2CompNmAbb のセッターメソッドです。</p>
     *
     * @param notifyParty2CompNmAbb notifyParty2CompNmAbb に設定する
     */
    public void setNotifyParty2CompNmAbb(String notifyParty2CompNmAbb) {
        this.notifyParty2CompNmAbb = notifyParty2CompNmAbb;
    }

    /**
     * <p>notifyParty3CompCd のゲッターメソッドです。</p>
     *
     * @return the notifyParty3CompCd
     */
    public String getNotifyParty3CompCd() {
        return notifyParty3CompCd;
    }

    /**
     * <p>notifyParty3CompCd のセッターメソッドです。</p>
     *
     * @param notifyParty3CompCd notifyParty3CompCd に設定する
     */
    public void setNotifyParty3CompCd(String notifyParty3CompCd) {
        this.notifyParty3CompCd = notifyParty3CompCd;
    }

    /**
     * <p>notifyParty3CompNmAbb のゲッターメソッドです。</p>
     *
     * @return the notifyParty3CompNmAbb
     */
    public String getNotifyParty3CompNmAbb() {
        return notifyParty3CompNmAbb;
    }

    /**
     * <p>notifyParty3CompNmAbb のセッターメソッドです。</p>
     *
     * @param notifyParty3CompNmAbb notifyParty3CompNmAbb に設定する
     */
    public void setNotifyParty3CompNmAbb(String notifyParty3CompNmAbb) {
        this.notifyParty3CompNmAbb = notifyParty3CompNmAbb;
    }

    /**
     * <p>notifyParty4CompCd のゲッターメソッドです。</p>
     *
     * @return the notifyParty4CompCd
     */
    public String getNotifyParty4CompCd() {
        return notifyParty4CompCd;
    }

    /**
     * <p>notifyParty4CompCd のセッターメソッドです。</p>
     *
     * @param notifyParty4CompCd notifyParty4CompCd に設定する
     */
    public void setNotifyParty4CompCd(String notifyParty4CompCd) {
        this.notifyParty4CompCd = notifyParty4CompCd;
    }

    /**
     * <p>notifyParty4CompNmAbb のゲッターメソッドです。</p>
     *
     * @return the notifyParty4CompNmAbb
     */
    public String getNotifyParty4CompNmAbb() {
        return notifyParty4CompNmAbb;
    }

    /**
     * <p>notifyParty4CompNmAbb のセッターメソッドです。</p>
     *
     * @param notifyParty4CompNmAbb notifyParty4CompNmAbb に設定する
     */
    public void setNotifyParty4CompNmAbb(String notifyParty4CompNmAbb) {
        this.notifyParty4CompNmAbb = notifyParty4CompNmAbb;
    }

}
