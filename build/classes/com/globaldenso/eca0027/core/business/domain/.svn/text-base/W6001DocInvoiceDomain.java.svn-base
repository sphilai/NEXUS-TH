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
 * The domain that holds the invoice information of Documentation screen.
 * <br/>通関書類作成業務画面のインボイス情報を保持するドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11902 $
 */

public class W6001DocInvoiceDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    // --- インボイス ------------------------------------------------------------------------------
    /**
     *Shipper Cd
     */
    private String shipperCd;

    /**
     *Invoice No
     */
    private String invoiceNo;
    
    /**
     *Invoice Issue Dt
     */
    private Date invoiceIssueDt;
    
    // ST184 INVOICE ISSUE DATE/インボイス発行日 ADD
    /**
     *Invoice Issue Dt for Disp
     */
    private Date dispInvoiceIssueDt;
    
    /**
     *Manual Flg
     */
    private String manualFlg;
    
    /**
     *Manual Typ
     */
    private String manualTyp;
    
    /**
     *Invoice Class
     */
    private String invoiceClass;
    
    /**
     *Cancel Flg
     */
    private String cancelFlg;
    
    /**
     *Cancel Typ
     */
    private String cancelTyp;
    
    /**
     *Cancel Invoice No
     */
    private String cancelInvoiceNo;
    
    /**
     *Par Invoice No
     */
    private String parInvoiceNo;
    
    /**
     *Relate Invoice No
     */
    private String relateInvoiceNo;
    
    /**
     *Relate Invoice Shipper Cd
     */
    private String relateInvoiceShipperCd;
    
    /**
     *Consignee Cd
     */
    private String consigneeCd;
    
    /**
     *Frt Shipper Cd
     */
    private String frtShipperCd;
    
    /**
     *Frt Consignee Cd
     */
    private String frtConsigneeCd;
    
    /**
     *Ship To Cd
     */
    private String shipToCd;
    
    /**
     *Customer Cd
     */
    private String customerCd;
    
    /**
     *Lgcy Ship To
     */
    private String lgcyShipTo;
    
    /**
     *Invoice Ctgry
     */
    private String invoiceCtgry;

    /**
     *Invoice Ctgry Nm
     */
    private String invoiceCtgryNm;
    
    /**
     *Shipped Dt
     */
    private Date shippedDt;
    
    /**
     *Trns Cd
     */
    private String trnsCd;
    
    /**
     * Trns Cd Org
     */
    private String trnsCdOrg;
    
    /**
     *Trns Nm
     */
    private String trnsNm;
    
    /**
     *Etd
     */
    private Date etd;
    
    /**
     *Eta
     */
    private Date eta;
    
    /**
     * L_PORT_CNTRY_CD
     */
    private String lPortCntryCd;
    
    /**
     *Loading Port Cd
     */
    private String loadingPortCd;
    
    /**
     * D_PORT_CNTRY_CD
     */
    private String dPortCntryCd;
    
    /**
     *Discharge Port Cd
     */
    private String dischargePortCd;
    
    /**
     *Dliv Point
     */
    private String dlivPoint;
    
    /**
     *Carrier Comp Cd
     */
    private String carrierCompCd;
    
    /**
     *Carrier Comp Nm Abb
     */
    private String carrierCompNmAbb;
    
    /**
     *Forwarder Comp Cd
     */
    private String forwarderCompCd;
    
    /**
     *Vessel
     */
    private String vessel;
    
    /**
     *Booking No
     */
    private String bookingNo;
    
    /**
     *Freight Responsible Cd
     */
    private String freightResponsibleCd;

    /**
     *Freight Responsible Nm
     */
    private String freightResponsibleNm;
    
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
     *Pay Terms
     */
    private String payTerms;
    
    /**
     *Pay Meth
     */
    private String payMeth;

    /**
     *Pay Meth Nm
     */
    private String payMethNm;
    
    /**
     *Rem Lc Typ
     */
    private String remLcTyp;
    
    /**
     *Rem Bank Nm
     */
    private String remBankNm;
    
    /**
     *Rem Bank Address 1
     */
    private String remBankAddress1;

    /**
     *Rem Bank Address 2
     */
    private String remBankAddress2;

    /**
     *Rem Bank Address 3
     */
    private String remBankAddress3;
    
    /**
     *Rem Bank Account No
     */
    private String remBankAccountNo;

    /**
     *Lc No
     */
    private String lcNo;
    
    /**
     *Lc Dt
     */
    private Date lcDt;
    
    /**
     *Lc Bank Nm 1
     */
    private String lcBankNm1;

    /**
     *Lc Bank Nm 2
     */
    private String lcBankNm2;
    
    /**
     *Curr Cd
     */
    private String currCd;
    
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
     *Sub Total
     */
    private BigDecimal subTotal;
    
    /**
     *Vat Ratio
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
    
    // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
    /**
     *Free Additional Code
     */
    private String additionalChargeCd;
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
    
    /**
     *Additional Charge Nm
     */
    private String additionalChargeNm;
    
    /**
     *Additional Charge
     */
    private BigDecimal additionalCharge;
    
    /**
     *Total Invoice Amount
     */
    private BigDecimal totalInvoiceAmount;
    
    /**
     *No Charge
     */
    private BigDecimal noCharge;
    
    /**
     *Pltz Item Qty
     */
    private BigDecimal pltzItemQty;
    
    /**
     *Weight Unit
     */
    private String weightUnit;
    
    /**
     *Total Net Weight
     */
    private BigDecimal totalNetWeight;
    
    /**
     *Total Gross Weight
     */
    private BigDecimal totalGrossWeight;
    
    /**
     *Volume Unit
     */
    private String volumeUnit;
    
    /**
     *Total Volume
     */
    private BigDecimal totalVolume;
    
    /**
     *Inv Tpl No
     */
    private String invTplNo;

    /**
     *Free 1 Disp Flg
     */
    private String free1DispFlg;
    
    /**
     *Free 2 Disp Flg
     */
    private String free2DispFlg;
    
    /**
     *Free 3 Disp Flg
     */
    private String free3DispFlg;
    
    /**
     *Free 4 Disp Flg
     */
    private String free4DispFlg;
    
    /**
     *Sp Info
     */
    private String spInfo;
    
    /**
     *Approval Position
     */
    private String approvalPosition;
    
    /**
     *Approval Nm
     */
    private String approvalNm;
    
    /**
     *Cml Typ
     */
    private String cmlTyp;
    
    /**
     *Invoice Key
     */
    private String invoiceKey;
    
    /**
     * Notify Party1 Company Code
     */
    private String notifyParty1CompCd;
    
    /**
     * Notify Party1 Company Name Abbr
     */
    private String notifyParty1CompNmAbb;
    
    /**
     *Notify Party 1 Nm
     */
    private String notifyParty1Nm;
    
    /**
     *Notify Party 1 Addr
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
     *Notify Party 2 Nm
     */
    private String notifyParty2Nm;
    
    /**
     *Notify Party 2 Addr
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
     *Notify Party 3 Nm
     */
    private String notifyParty3Nm;
    
    /**
     *Notify Party 3 Addr
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
     *Notify Party 4 Nm
     */
    private String notifyParty4Nm;
    
    /**
     *Notify Party 4 Addr
     */
    private String notifyParty4Addr;
    
    /**
     *Shipping Act No
     */
    private String shippingActNo;
    
    /**
     *Imp Invoice No 1
     */
    private String impInvoiceNo1;

    /**
     *Imp Invoice No 2
     */
    private String impInvoiceNo2;
    
    /**
     *Shipper Comp Nm 1
     */
    private String shipperCompNm1;

    /**
     *Shipper Comp Nm 2
     */
    private String shipperCompNm2;
    
    /**
     *Shipper Comp Addr 1
     */
    private String shipperCompAddr1;

    /**
     *Shipper Comp Addr 2
     */
    private String shipperCompAddr2;

    /**
     *Shipper Comp Addr 3
     */
    private String shipperCompAddr3;
    
    /**
     *Shipper Comp Tel
     */
    private String shipperCompTel;
    
    /**
     *Shipper Comp Fax
     */
    private String shipperCompFax;
    
    /**
     *Shipper Tax Id No
     */
    private String shipperTaxIdNo;
    
    /**
     *Consignee Comp Nm 1
     */
    private String consigneeCompNm1;

    /**
     *Consignee Comp Nm 2
     */
    private String consigneeCompNm2;
    
    /**
     *Ship To Nm 1
     */
    private String shipToNm1;

    /**
     *Ship To Nm 2
     */
    private String shipToNm2;
    
    /**
     *Ship To Addr 1
     */
    private String shipToAddr1;

    /**
     *Ship To Addr 2
     */
    private String shipToAddr2;

    /**
     *Ship To Addr 3
     */
    private String shipToAddr3;
    
    /**
     *Invoice Issuer Nm
     */
    private String invoiceIssuerNm;
    
    // --- NXUS会社原単位 --------------------------------------------------------------------------
    /**
     *Print Comp Addr 1
     */
    private String printCompAddr1;

    /**
     *Print Comp Addr 2
     */
    private String printCompAddr2;

    /**
     *Print Comp Addr 3
     */
    private String printCompAddr3;
    
    // --- NXUS会社原単位（Shipper用） -------------------------------------------------------------
    /**
     *Print Comp Nm 1(Shipper）
     */
    private String printCompNm1Shipper;

    /**
     *Print Comp Nm 2(Shipper）
     */
    private String printCompNm2Shipper;
    
    /**
     *Print Comp Addr 1(Shipper）
     */
    private String printCompAddr1Shipper;

    /**
     *Print Comp Addr 2(Shipper）
     */
    private String printCompAddr2Shipper;

    /**
     *Print Comp Addr 3(Shipper）
     */
    private String printCompAddr3Shipper;

    /**
     *Print Comp Addr 4(Shipper）
     */
    private String printCompAddr4Shipper;

    /**
     * COMPANY TEL<br />
     * 会社TEL
     */
    private String compTelShipper;
    
    /**
     * COMPANY FAX<br />
     * 会社FAX
     */
    private String compFaxShipper;
    
    // --- NXUS会社原単位（Consignee用） -----------------------------------------------------------
    /**
     *Print Comp Nm 1（Consignee）
     */
    private String printCompNm1Consignee;

    /**
     *Print Comp Nm 2（Consignee）
     */
    private String printCompNm2Consignee;
    
    /**
     *Print Comp Addr 1（Consignee）
     */
    private String printCompAddr1Consignee;

    /**
     *Print Comp Addr 2（Consignee）
     */
    private String printCompAddr2Consignee;

    /**
     *Print Comp Addr 3（Consignee）
     */
    private String printCompAddr3Consignee;

    /**
     *Print Comp Addr 4（Consignee）
     */
    private String printCompAddr4Consignee;
    
    
    // --- NXUS送荷先原単位 ------------------------------------------------------------------------
    
    /**
     *Print Ship To Nm 1
     */
    private String printShipToNm1;

    /**
     *Print Ship To Nm 2
     */
    private String printShipToNm2;
    
    /**
     *Print Ship To Addr 1
     */
    private String printShipToAddr1;

    /**
     *Print Ship To Addr 2
     */
    private String printShipToAddr2;

    /**
     *Print Ship To Addr 3
     */
    private String printShipToAddr3;

    /**
     *Print Ship To Addr 4
     */
    private String printShipToAddr4;
    
    /**
     *Ship To Tel
     */
    private String shipToTel;
    
    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;
    
    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;
    
    // --- コード原単位 ----------------------------------------------------------------------------
    /**
     * C1 (Transport)<br />
     * C1（輸送手段）
     */
    private String c1;

    /**
     * C2 (customs documents state division)<br />
     * C2（通関書類状態区分）
     */
    private String c2;

    /**
     * C3 (Invoice classification)<br />
     * C3（Invoice分類）
     */
    private String c3;

    /**
     * C4（ Invoice Category ）<br />
     * C4（請求分類）
     */
    private String c4;

    /**
     * C5（ Freight Res Status ）<br />
     * C5（運賃支払いステータス）
     */
    private String c5;

    /**
     * C6 (payment method)<br />
     * C6（支払方法）
     */
    private String c6;

    // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
    /**
     * C8 (additional charge)<br />
     * C8（追加費用区分）
     */
    private String c8;
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<
    // ---------------------------------------------------------------------------------------------
    /**
     *Arrival Time
     */
    private String arrivalTime;

    /**
     *Cntry Cd
     */
    private String cntryCd;

    /**
     *Comp Nm1
     */
    private String compNm1;

    /**
     *Comp Nm2
     */
    private String compNm2;

    /**
     *Comp Nm3
     */
    private String compNm3;

    /**
     *Comp Nm4
     */
    private String compNm4;

    /**
     *Comp Nm5
     */
    private String compNm5;

    /**
     *Count Invoice No
     */
    private int countInvoiceNo;

    /**
     *Count Main Mark
     */
    private int countMainMark;

    /**
     *Customer Item No
     */
    private String customerItemNo;

    /**
     *Customer Po No
     */
    private String customerPoNo;

    /**
     *Custom Timing Typ
     */
    private String customTimingTyp;

    /**
     *Dn Base Flg
     */
    private String dnBaseFlg;

    /**
     *Invoice Header File Id
     */
    private String invoiceHeaderFileId;

    /**
     *Item No
     */
    private String itemNo;

    /**
     *Job Host
     */
    private String jobHost;

    /**
     *Job User
     */
    private String jobUser;

    /**
     *Job Password
     */
    private String jobPassword;

    /**
     *Job Description
     */
    private String jobDescription;

    /**
     *Lc Bank 1
     */
    private String lcBank1;

    /**
     *Lc Bank 2
     */
    private String lcBank2;

    /**
     *Lgcy Unit Cd
     */
    private String lgcyUnitCd;

    /**
     *Lib Pgm
     */
    private String libPgm;

    /**
     *Packing Head File Id
     */
    private String packingHeadFileId;

    /**
     *Par Temp Invoice No
     */
    private String parTempInvoiceNo;

    /**
     *Pltz Status
     */
    private String pltzStatus;

    /**
     *Port Nm1
     */
    private String portNm1;

    /**
     *Port Nm2
     */
    private String portNm2;

    /**
     *Qty Unit
     */
    private String qtyUnit;

    /**
     *Relate Temp Invoice No
     */
    private String relateTempInvoiceNo;

    /**
     *Sc Header File Id
     */
    private String scHeaderFileId;

    /**
     *Ship To Nm
     */
    private String shipToNm;

    /**
     *Supplier Invoice No
     */
    private String supplierInvoiceNo;

    /**
     *Temp Invoice No
     */
    private String tempInvoiceNo;

    /**
     *Total Invoice Amount Curr Cd
     */
    private String totalInvoiceAmountCurrCd;

    /**
     *Total Net Weight Unit
     */
    private String totalNetWeightUnit;

    /**
     *Unit Price
     */
    private String unitPrice;

    /**
     *Unit Price Curr Cd
     */
    private String unitPriceCurrCd;

    /**
     *Value1
     */
    private String value1;

    /**
     *Value2
     */
    private String value2;

    /**
     *Unit Price Error
     */
    private String unitPriceError;

    /**
     *Hs Code Warning
     */
    private String hsCodeWarning;

    /**
     *Re Exp Goods Flg
     */
    private String reExpGoodsFlg;

    /**
     * Country code (for ship to company code)
     */
    private String cntryCdShipTo;

    /**
     * Country code (for Shipper code)
     */
    private String cntryCdShipper;

    /**
     * Country code (for carrier code)
     */
    private String cntryCdCarrier;

    /**
     *Customer Po Cd
     */
    private String customerPoCd;

    /**
     * SHIP TO COMP CD
     */
    private String shipToCompCd;
    
    /**
     * Update Count
     */
    private int updateCount;
    
    /**
     * GRP_NO_1
     */
    private String grpNo1;
    
    /**
     * GRP_NO_2
     */
    private String grpNo2;
    
    // ST959 UNIT CONVERSION ADD START
    /**
     * total N/W overflow flag
     */
    private String totalNetWeightOverflowFlg;
    
    /**
     * total G/W overflow flag
     */
    private String totalGrossWeightOverflowFlg;
    
    /**
     * total Volume overflow flag
     */
    private String totalVolumeOverflowFlg;
    // ST959 UNIT CONVERSION ADD END
    
    /**
     * CML attach CSV file ID.
     * 
     * UT205 CML ATTACH CSV ADD
     */
    private String cmlAtchCsvFileId;
    
    /**
     * Palletizing<br />
     * パレタイズ
     */
    private List<? extends W6001DocPltzDomain> docPltzList;
    
    /**
     * Palletizing<br />
     * パレタイズ
     */
    private List<? extends W6001DocPltzDomain> pltzList2;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001DocInvoiceDomain() {
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
     * Getter method for dispInvoiceIssueDt.
     *
     * @return the dispInvoiceIssueDt
     */
    public Date getDispInvoiceIssueDt() {
        return dispInvoiceIssueDt;
    }

    /**
     * Setter method for dispInvoiceIssueDt.
     *
     * @param dispInvoiceIssueDt Set for dispInvoiceIssueDt
     */
    public void setDispInvoiceIssueDt(Date dispInvoiceIssueDt) {
        this.dispInvoiceIssueDt = dispInvoiceIssueDt;
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
     * Getter method for invoiceClass.
     *
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Setter method for invoiceClass.
     *
     * @param invoiceClass Set for invoiceClass
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
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
     * Getter method for trnsNm.
     *
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * Setter method for trnsNm.
     *
     * @param trnsNm Set for trnsNm
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
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
     * Getter method for lPortCntryCd.
     *
     * @return the lPortCntryCd
     */
    public String getLPortCntryCd() {
        return lPortCntryCd;
    }

    /**
     * Setter method for lPortCntryCd.
     *
     * @param portCntryCd Set for lPortCntryCd
     */
    public void setLPortCntryCd(String portCntryCd) {
        lPortCntryCd = portCntryCd;
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
     * Getter method for dPortCntryCd.
     *
     * @return the dPortCntryCd
     */
    public String getDPortCntryCd() {
        return dPortCntryCd;
    }

    /**
     * Setter method for dPortCntryCd.
     *
     * @param portCntryCd Set for dPortCntryCd
     */
    public void setDPortCntryCd(String portCntryCd) {
        dPortCntryCd = portCntryCd;
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
     * Getter method for carrierCompNmAbb.
     *
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }

    /**
     * Setter method for carrierCompNmAbb.
     *
     * @param carrierCompNmAbb Set for carrierCompNmAbb
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
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
     * Getter method for approvalPosition.
     *
     * @return the approvalPosition
     */
    public String getApprovalPosition() {
        return approvalPosition;
    }

    /**
     * Setter method for approvalPosition.
     *
     * @param approvalPosition Set for approvalPosition
     */
    public void setApprovalPosition(String approvalPosition) {
        this.approvalPosition = approvalPosition;
    }

    /**
     * Getter method for approvalNm.
     *
     * @return the approvalNm
     */
    public String getApprovalNm() {
        return approvalNm;
    }

    /**
     * Setter method for approvalNm.
     *
     * @param approvalNm Set for approvalNm
     */
    public void setApprovalNm(String approvalNm) {
        this.approvalNm = approvalNm;
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
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
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
     * Getter method for shippingActNo.
     *
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * Setter method for shippingActNo.
     *
     * @param shippingActNo Set for shippingActNo
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }

    /**
     * Getter method for impInvoiceNo1.
     *
     * @return the impInvoiceNo1
     */
    public String getImpInvoiceNo1() {
        return impInvoiceNo1;
    }

    /**
     * Setter method for impInvoiceNo1.
     *
     * @param impInvoiceNo1 Set for impInvoiceNo1
     */
    public void setImpInvoiceNo1(String impInvoiceNo1) {
        this.impInvoiceNo1 = impInvoiceNo1;
    }

    /**
     * Getter method for impInvoiceNo2.
     *
     * @return the impInvoiceNo2
     */
    public String getImpInvoiceNo2() {
        return impInvoiceNo2;
    }

    /**
     * Setter method for impInvoiceNo2.
     *
     * @param impInvoiceNo2 Set for impInvoiceNo2
     */
    public void setImpInvoiceNo2(String impInvoiceNo2) {
        this.impInvoiceNo2 = impInvoiceNo2;
    }

    /**
     * Getter method for shipperCompNm1.
     *
     * @return the shipperCompNm1
     */
    public String getShipperCompNm1() {
        return shipperCompNm1;
    }

    /**
     * Setter method for shipperCompNm1.
     *
     * @param shipperCompNm1 Set for shipperCompNm1
     */
    public void setShipperCompNm1(String shipperCompNm1) {
        this.shipperCompNm1 = shipperCompNm1;
    }

    /**
     * Getter method for shipperCompNm2.
     *
     * @return the shipperCompNm2
     */
    public String getShipperCompNm2() {
        return shipperCompNm2;
    }

    /**
     * Setter method for shipperCompNm2.
     *
     * @param shipperCompNm2 Set for shipperCompNm2
     */
    public void setShipperCompNm2(String shipperCompNm2) {
        this.shipperCompNm2 = shipperCompNm2;
    }

    /**
     * Getter method for shipperCompAddr1.
     *
     * @return the shipperCompAddr1
     */
    public String getShipperCompAddr1() {
        return shipperCompAddr1;
    }

    /**
     * Setter method for shipperCompAddr1.
     *
     * @param shipperCompAddr1 Set for shipperCompAddr1
     */
    public void setShipperCompAddr1(String shipperCompAddr1) {
        this.shipperCompAddr1 = shipperCompAddr1;
    }

    /**
     * Getter method for shipperCompAddr2.
     *
     * @return the shipperCompAddr2
     */
    public String getShipperCompAddr2() {
        return shipperCompAddr2;
    }

    /**
     * Setter method for shipperCompAddr2.
     *
     * @param shipperCompAddr2 Set for shipperCompAddr2
     */
    public void setShipperCompAddr2(String shipperCompAddr2) {
        this.shipperCompAddr2 = shipperCompAddr2;
    }

    /**
     * Getter method for shipperCompAddr3.
     *
     * @return the shipperCompAddr3
     */
    public String getShipperCompAddr3() {
        return shipperCompAddr3;
    }

    /**
     * Setter method for shipperCompAddr3.
     *
     * @param shipperCompAddr3 Set for shipperCompAddr3
     */
    public void setShipperCompAddr3(String shipperCompAddr3) {
        this.shipperCompAddr3 = shipperCompAddr3;
    }

    /**
     * Getter method for shipperCompTel.
     *
     * @return the shipperCompTel
     */
    public String getShipperCompTel() {
        return shipperCompTel;
    }

    /**
     * Setter method for shipperCompTel.
     *
     * @param shipperCompTel Set for shipperCompTel
     */
    public void setShipperCompTel(String shipperCompTel) {
        this.shipperCompTel = shipperCompTel;
    }

    /**
     * Getter method for shipperCompFax.
     *
     * @return the shipperCompFax
     */
    public String getShipperCompFax() {
        return shipperCompFax;
    }

    /**
     * Setter method for shipperCompFax.
     *
     * @param shipperCompFax Set for shipperCompFax
     */
    public void setShipperCompFax(String shipperCompFax) {
        this.shipperCompFax = shipperCompFax;
    }

    /**
     * Getter method for shipperTaxIdNo.
     *
     * @return the shipperTaxIdNo
     */
    public String getShipperTaxIdNo() {
        return shipperTaxIdNo;
    }

    /**
     * Setter method for shipperTaxIdNo.
     *
     * @param shipperTaxIdNo Set for shipperTaxIdNo
     */
    public void setShipperTaxIdNo(String shipperTaxIdNo) {
        this.shipperTaxIdNo = shipperTaxIdNo;
    }

    /**
     * Getter method for consigneeCompNm1.
     *
     * @return the consigneeCompNm1
     */
    public String getConsigneeCompNm1() {
        return consigneeCompNm1;
    }

    /**
     * Setter method for consigneeCompNm1.
     *
     * @param consigneeCompNm1 Set for consigneeCompNm1
     */
    public void setConsigneeCompNm1(String consigneeCompNm1) {
        this.consigneeCompNm1 = consigneeCompNm1;
    }

    /**
     * Getter method for consigneeCompNm2.
     *
     * @return the consigneeCompNm2
     */
    public String getConsigneeCompNm2() {
        return consigneeCompNm2;
    }

    /**
     * Setter method for consigneeCompNm2.
     *
     * @param consigneeCompNm2 Set for consigneeCompNm2
     */
    public void setConsigneeCompNm2(String consigneeCompNm2) {
        this.consigneeCompNm2 = consigneeCompNm2;
    }

    /**
     * Getter method for shipToNm1.
     *
     * @return the shipToNm1
     */
    public String getShipToNm1() {
        return shipToNm1;
    }

    /**
     * Setter method for shipToNm1.
     *
     * @param shipToNm1 Set for shipToNm1
     */
    public void setShipToNm1(String shipToNm1) {
        this.shipToNm1 = shipToNm1;
    }

    /**
     * Getter method for shipToNm2.
     *
     * @return the shipToNm2
     */
    public String getShipToNm2() {
        return shipToNm2;
    }

    /**
     * Setter method for shipToNm2.
     *
     * @param shipToNm2 Set for shipToNm2
     */
    public void setShipToNm2(String shipToNm2) {
        this.shipToNm2 = shipToNm2;
    }

    /**
     * Getter method for shipToAddr1.
     *
     * @return the shipToAddr1
     */
    public String getShipToAddr1() {
        return shipToAddr1;
    }

    /**
     * Setter method for shipToAddr1.
     *
     * @param shipToAddr1 Set for shipToAddr1
     */
    public void setShipToAddr1(String shipToAddr1) {
        this.shipToAddr1 = shipToAddr1;
    }

    /**
     * Getter method for shipToAddr2.
     *
     * @return the shipToAddr2
     */
    public String getShipToAddr2() {
        return shipToAddr2;
    }

    /**
     * Setter method for shipToAddr2.
     *
     * @param shipToAddr2 Set for shipToAddr2
     */
    public void setShipToAddr2(String shipToAddr2) {
        this.shipToAddr2 = shipToAddr2;
    }

    /**
     * Getter method for shipToAddr3.
     *
     * @return the shipToAddr3
     */
    public String getShipToAddr3() {
        return shipToAddr3;
    }

    /**
     * Setter method for shipToAddr3.
     *
     * @param shipToAddr3 Set for shipToAddr3
     */
    public void setShipToAddr3(String shipToAddr3) {
        this.shipToAddr3 = shipToAddr3;
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
     * Getter method for printCompAddr1.
     *
     * @return the printCompAddr1
     */
    public String getPrintCompAddr1() {
        return printCompAddr1;
    }

    /**
     * Setter method for printCompAddr1.
     *
     * @param printCompAddr1 Set for printCompAddr1
     */
    public void setPrintCompAddr1(String printCompAddr1) {
        this.printCompAddr1 = printCompAddr1;
    }

    /**
     * Getter method for printCompAddr2.
     *
     * @return the printCompAddr2
     */
    public String getPrintCompAddr2() {
        return printCompAddr2;
    }

    /**
     * Setter method for printCompAddr2.
     *
     * @param printCompAddr2 Set for printCompAddr2
     */
    public void setPrintCompAddr2(String printCompAddr2) {
        this.printCompAddr2 = printCompAddr2;
    }

    /**
     * Getter method for printCompAddr3.
     *
     * @return the printCompAddr3
     */
    public String getPrintCompAddr3() {
        return printCompAddr3;
    }

    /**
     * Setter method for printCompAddr3.
     *
     * @param printCompAddr3 Set for printCompAddr3
     */
    public void setPrintCompAddr3(String printCompAddr3) {
        this.printCompAddr3 = printCompAddr3;
    }

    /**
     * Getter method for printCompNm1Shipper.
     *
     * @return the printCompNm1Shipper
     */
    public String getPrintCompNm1Shipper() {
        return printCompNm1Shipper;
    }

    /**
     * Setter method for printCompNm1Shipper.
     *
     * @param printCompNm1Shipper Set for printCompNm1Shipper
     */
    public void setPrintCompNm1Shipper(String printCompNm1Shipper) {
        this.printCompNm1Shipper = printCompNm1Shipper;
    }

    /**
     * Getter method for printCompNm2Shipper.
     *
     * @return the printCompNm2Shipper
     */
    public String getPrintCompNm2Shipper() {
        return printCompNm2Shipper;
    }

    /**
     * Setter method for printCompNm2Shipper.
     *
     * @param printCompNm2Shipper Set for printCompNm2Shipper
     */
    public void setPrintCompNm2Shipper(String printCompNm2Shipper) {
        this.printCompNm2Shipper = printCompNm2Shipper;
    }

    /**
     * Getter method for printCompAddr1Shipper.
     *
     * @return the printCompAddr1Shipper
     */
    public String getPrintCompAddr1Shipper() {
        return printCompAddr1Shipper;
    }

    /**
     * Setter method for printCompAddr1Shipper.
     *
     * @param printCompAddr1Shipper Set for printCompAddr1Shipper
     */
    public void setPrintCompAddr1Shipper(String printCompAddr1Shipper) {
        this.printCompAddr1Shipper = printCompAddr1Shipper;
    }

    /**
     * Getter method for printCompAddr2Shipper.
     *
     * @return the printCompAddr2Shipper
     */
    public String getPrintCompAddr2Shipper() {
        return printCompAddr2Shipper;
    }

    /**
     * Setter method for printCompAddr2Shipper.
     *
     * @param printCompAddr2Shipper Set for printCompAddr2Shipper
     */
    public void setPrintCompAddr2Shipper(String printCompAddr2Shipper) {
        this.printCompAddr2Shipper = printCompAddr2Shipper;
    }

    /**
     * Getter method for printCompAddr3Shipper.
     *
     * @return the printCompAddr3Shipper
     */
    public String getPrintCompAddr3Shipper() {
        return printCompAddr3Shipper;
    }

    /**
     * Setter method for printCompAddr3Shipper.
     *
     * @param printCompAddr3Shipper Set for printCompAddr3Shipper
     */
    public void setPrintCompAddr3Shipper(String printCompAddr3Shipper) {
        this.printCompAddr3Shipper = printCompAddr3Shipper;
    }

    /**
     * Getter method for printCompAddr4Shipper.
     *
     * @return the printCompAddr4Shipper
     */
    public String getPrintCompAddr4Shipper() {
        return printCompAddr4Shipper;
    }

    /**
     * Setter method for printCompAddr4Shipper.
     *
     * @param printCompAddr4Shipper Set for printCompAddr4Shipper
     */
    public void setPrintCompAddr4Shipper(String printCompAddr4Shipper) {
        this.printCompAddr4Shipper = printCompAddr4Shipper;
    }

    /**
     * Getter method for compTelShipper.
     *
     * @return the compTelShipper
     */
    public String getCompTelShipper() {
        return compTelShipper;
    }

    /**
     * Setter method for compTelShipper.
     *
     * @param compTelShipper Set for compTelShipper
     */
    public void setCompTelShipper(String compTelShipper) {
        this.compTelShipper = compTelShipper;
    }

    /**
     * Getter method for compFaxShipper.
     *
     * @return the compFaxShipper
     */
    public String getCompFaxShipper() {
        return compFaxShipper;
    }

    /**
     * Setter method for compFaxShipper.
     *
     * @param compFaxShipper Set for compFaxShipper
     */
    public void setCompFaxShipper(String compFaxShipper) {
        this.compFaxShipper = compFaxShipper;
    }

    /**
     * Getter method for printCompNm1Consignee.
     *
     * @return the printCompNm1Consignee
     */
    public String getPrintCompNm1Consignee() {
        return printCompNm1Consignee;
    }

    /**
     * Setter method for printCompNm1Consignee.
     *
     * @param printCompNm1Consignee Set for printCompNm1Consignee
     */
    public void setPrintCompNm1Consignee(String printCompNm1Consignee) {
        this.printCompNm1Consignee = printCompNm1Consignee;
    }

    /**
     * Getter method for printCompNm2Consignee.
     *
     * @return the printCompNm2Consignee
     */
    public String getPrintCompNm2Consignee() {
        return printCompNm2Consignee;
    }

    /**
     * Setter method for printCompNm2Consignee.
     *
     * @param printCompNm2Consignee Set for printCompNm2Consignee
     */
    public void setPrintCompNm2Consignee(String printCompNm2Consignee) {
        this.printCompNm2Consignee = printCompNm2Consignee;
    }

    /**
     * Getter method for printCompAddr1Consignee.
     *
     * @return the printCompAddr1Consignee
     */
    public String getPrintCompAddr1Consignee() {
        return printCompAddr1Consignee;
    }

    /**
     * Setter method for printCompAddr1Consignee.
     *
     * @param printCompAddr1Consignee Set for printCompAddr1Consignee
     */
    public void setPrintCompAddr1Consignee(String printCompAddr1Consignee) {
        this.printCompAddr1Consignee = printCompAddr1Consignee;
    }

    /**
     * Getter method for printCompAddr2Consignee.
     *
     * @return the printCompAddr2Consignee
     */
    public String getPrintCompAddr2Consignee() {
        return printCompAddr2Consignee;
    }

    /**
     * Setter method for printCompAddr2Consignee.
     *
     * @param printCompAddr2Consignee Set for printCompAddr2Consignee
     */
    public void setPrintCompAddr2Consignee(String printCompAddr2Consignee) {
        this.printCompAddr2Consignee = printCompAddr2Consignee;
    }

    /**
     * Getter method for printCompAddr3Consignee.
     *
     * @return the printCompAddr3Consignee
     */
    public String getPrintCompAddr3Consignee() {
        return printCompAddr3Consignee;
    }

    /**
     * Setter method for printCompAddr3Consignee.
     *
     * @param printCompAddr3Consignee Set for printCompAddr3Consignee
     */
    public void setPrintCompAddr3Consignee(String printCompAddr3Consignee) {
        this.printCompAddr3Consignee = printCompAddr3Consignee;
    }

    /**
     * Getter method for printCompAddr4Consignee.
     *
     * @return the printCompAddr4Consignee
     */
    public String getPrintCompAddr4Consignee() {
        return printCompAddr4Consignee;
    }

    /**
     * Setter method for printCompAddr4Consignee.
     *
     * @param printCompAddr4Consignee Set for printCompAddr4Consignee
     */
    public void setPrintCompAddr4Consignee(String printCompAddr4Consignee) {
        this.printCompAddr4Consignee = printCompAddr4Consignee;
    }

    /**
     * Getter method for printShipToNm1.
     *
     * @return the printShipToNm1
     */
    public String getPrintShipToNm1() {
        return printShipToNm1;
    }

    /**
     * Setter method for printShipToNm1.
     *
     * @param printShipToNm1 Set for printShipToNm1
     */
    public void setPrintShipToNm1(String printShipToNm1) {
        this.printShipToNm1 = printShipToNm1;
    }

    /**
     * Getter method for printShipToNm2.
     *
     * @return the printShipToNm2
     */
    public String getPrintShipToNm2() {
        return printShipToNm2;
    }

    /**
     * Setter method for printShipToNm2.
     *
     * @param printShipToNm2 Set for printShipToNm2
     */
    public void setPrintShipToNm2(String printShipToNm2) {
        this.printShipToNm2 = printShipToNm2;
    }

    /**
     * Getter method for printShipToAddr1.
     *
     * @return the printShipToAddr1
     */
    public String getPrintShipToAddr1() {
        return printShipToAddr1;
    }

    /**
     * Setter method for printShipToAddr1.
     *
     * @param printShipToAddr1 Set for printShipToAddr1
     */
    public void setPrintShipToAddr1(String printShipToAddr1) {
        this.printShipToAddr1 = printShipToAddr1;
    }

    /**
     * Getter method for printShipToAddr2.
     *
     * @return the printShipToAddr2
     */
    public String getPrintShipToAddr2() {
        return printShipToAddr2;
    }

    /**
     * Setter method for printShipToAddr2.
     *
     * @param printShipToAddr2 Set for printShipToAddr2
     */
    public void setPrintShipToAddr2(String printShipToAddr2) {
        this.printShipToAddr2 = printShipToAddr2;
    }

    /**
     * Getter method for printShipToAddr3.
     *
     * @return the printShipToAddr3
     */
    public String getPrintShipToAddr3() {
        return printShipToAddr3;
    }

    /**
     * Setter method for printShipToAddr3.
     *
     * @param printShipToAddr3 Set for printShipToAddr3
     */
    public void setPrintShipToAddr3(String printShipToAddr3) {
        this.printShipToAddr3 = printShipToAddr3;
    }

    /**
     * Getter method for printShipToAddr4.
     *
     * @return the printShipToAddr4
     */
    public String getPrintShipToAddr4() {
        return printShipToAddr4;
    }

    /**
     * Setter method for printShipToAddr4.
     *
     * @param printShipToAddr4 Set for printShipToAddr4
     */
    public void setPrintShipToAddr4(String printShipToAddr4) {
        this.printShipToAddr4 = printShipToAddr4;
    }

    /**
     * Getter method for shipToTel.
     *
     * @return the shipToTel
     */
    public String getShipToTel() {
        return shipToTel;
    }

    /**
     * Setter method for shipToTel.
     *
     * @param shipToTel Set for shipToTel
     */
    public void setShipToTel(String shipToTel) {
        this.shipToTel = shipToTel;
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
     * Getter method for c1.
     *
     * @return the c1
     */
    public String getC1() {
        return c1;
    }

    /**
     * Setter method for c1.
     *
     * @param c1 Set for c1
     */
    public void setC1(String c1) {
        this.c1 = c1;
    }

    /**
     * Getter method for c2.
     *
     * @return the c2
     */
    public String getC2() {
        return c2;
    }

    /**
     * Setter method for c2.
     *
     * @param c2 Set for c2
     */
    public void setC2(String c2) {
        this.c2 = c2;
    }

    /**
     * Getter method for c3.
     *
     * @return the c3
     */
    public String getC3() {
        return c3;
    }

    /**
     * Setter method for c3.
     *
     * @param c3 Set for c3
     */
    public void setC3(String c3) {
        this.c3 = c3;
    }

    /**
     * Getter method for c4.
     *
     * @return the c4
     */
    public String getC4() {
        return c4;
    }

    /**
     * Setter method for c4.
     *
     * @param c4 Set for c4
     */
    public void setC4(String c4) {
        this.c4 = c4;
    }

    /**
     * Getter method for c5.
     *
     * @return the c5
     */
    public String getC5() {
        return c5;
    }

    /**
     * Setter method for c5.
     *
     * @param c5 Set for c5
     */
    public void setC5(String c5) {
        this.c5 = c5;
    }

    /**
     * Getter method for c6.
     *
     * @return the c6
     */
    public String getC6() {
        return c6;
    }

    /**
     * Setter method for c6.
     *
     * @param c6 Set for c6
     */
    public void setC6(String c6) {
        this.c6 = c6;
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
     * Getter method for compNm1.
     *
     * @return the compNm1
     */
    public String getCompNm1() {
        return compNm1;
    }

    /**
     * Setter method for compNm1.
     *
     * @param compNm1 Set for compNm1
     */
    public void setCompNm1(String compNm1) {
        this.compNm1 = compNm1;
    }

    /**
     * Getter method for compNm2.
     *
     * @return the compNm2
     */
    public String getCompNm2() {
        return compNm2;
    }

    /**
     * Setter method for compNm2.
     *
     * @param compNm2 Set for compNm2
     */
    public void setCompNm2(String compNm2) {
        this.compNm2 = compNm2;
    }

    /**
     * Getter method for compNm3.
     *
     * @return the compNm3
     */
    public String getCompNm3() {
        return compNm3;
    }

    /**
     * Setter method for compNm3.
     *
     * @param compNm3 Set for compNm3
     */
    public void setCompNm3(String compNm3) {
        this.compNm3 = compNm3;
    }

    /**
     * Getter method for compNm4.
     *
     * @return the compNm4
     */
    public String getCompNm4() {
        return compNm4;
    }

    /**
     * Setter method for compNm4.
     *
     * @param compNm4 Set for compNm4
     */
    public void setCompNm4(String compNm4) {
        this.compNm4 = compNm4;
    }

    /**
     * Getter method for compNm5.
     *
     * @return the compNm5
     */
    public String getCompNm5() {
        return compNm5;
    }

    /**
     * Setter method for compNm5.
     *
     * @param compNm5 Set for compNm5
     */
    public void setCompNm5(String compNm5) {
        this.compNm5 = compNm5;
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
     * Getter method for countMainMark.
     *
     * @return the countMainMark
     */
    public int getCountMainMark() {
        return countMainMark;
    }

    /**
     * Setter method for countMainMark.
     *
     * @param countMainMark Set for countMainMark
     */
    public void setCountMainMark(int countMainMark) {
        this.countMainMark = countMainMark;
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

    /**
     * Getter method for invoiceHeaderFileId.
     *
     * @return the invoiceHeaderFileId
     */
    public String getInvoiceHeaderFileId() {
        return invoiceHeaderFileId;
    }

    /**
     * Setter method for invoiceHeaderFileId.
     *
     * @param invoiceHeaderFileId Set for invoiceHeaderFileId
     */
    public void setInvoiceHeaderFileId(String invoiceHeaderFileId) {
        this.invoiceHeaderFileId = invoiceHeaderFileId;
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
     * Getter method for jobHost.
     *
     * @return the jobHost
     */
    public String getJobHost() {
        return jobHost;
    }

    /**
     * Setter method for jobHost.
     *
     * @param jobHost Set for jobHost
     */
    public void setJobHost(String jobHost) {
        this.jobHost = jobHost;
    }

    /**
     * Getter method for jobUser.
     *
     * @return the jobUser
     */
    public String getJobUser() {
        return jobUser;
    }

    /**
     * Setter method for jobUser.
     *
     * @param jobUser Set for jobUser
     */
    public void setJobUser(String jobUser) {
        this.jobUser = jobUser;
    }

    /**
     * Getter method for jobPassword.
     *
     * @return the jobPassword
     */
    public String getJobPassword() {
        return jobPassword;
    }

    /**
     * Setter method for jobPassword.
     *
     * @param jobPassword Set for jobPassword
     */
    public void setJobPassword(String jobPassword) {
        this.jobPassword = jobPassword;
    }

    /**
     * Getter method for jobDescription.
     *
     * @return the jobDescription
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Setter method for jobDescription.
     *
     * @param jobDescription Set for jobDescription
     */
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
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
     * Getter method for lgcyUnitCd.
     *
     * @return the lgcyUnitCd
     */
    public String getLgcyUnitCd() {
        return lgcyUnitCd;
    }

    /**
     * Setter method for lgcyUnitCd.
     *
     * @param lgcyUnitCd Set for lgcyUnitCd
     */
    public void setLgcyUnitCd(String lgcyUnitCd) {
        this.lgcyUnitCd = lgcyUnitCd;
    }

    /**
     * Getter method for libPgm.
     *
     * @return the libPgm
     */
    public String getLibPgm() {
        return libPgm;
    }

    /**
     * Setter method for libPgm.
     *
     * @param libPgm Set for libPgm
     */
    public void setLibPgm(String libPgm) {
        this.libPgm = libPgm;
    }

    /**
     * Getter method for packingHeadFileId.
     *
     * @return the packingHeadFileId
     */
    public String getPackingHeadFileId() {
        return packingHeadFileId;
    }

    /**
     * Setter method for packingHeadFileId.
     *
     * @param packingHeadFileId Set for packingHeadFileId
     */
    public void setPackingHeadFileId(String packingHeadFileId) {
        this.packingHeadFileId = packingHeadFileId;
    }

    /**
     * Getter method for parTempInvoiceNo.
     *
     * @return the parTempInvoiceNo
     */
    public String getParTempInvoiceNo() {
        return parTempInvoiceNo;
    }

    /**
     * Setter method for parTempInvoiceNo.
     *
     * @param parTempInvoiceNo Set for parTempInvoiceNo
     */
    public void setParTempInvoiceNo(String parTempInvoiceNo) {
        this.parTempInvoiceNo = parTempInvoiceNo;
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
     * Getter method for portNm1.
     *
     * @return the portNm1
     */
    public String getPortNm1() {
        return portNm1;
    }

    /**
     * Setter method for portNm1.
     *
     * @param portNm1 Set for portNm1
     */
    public void setPortNm1(String portNm1) {
        this.portNm1 = portNm1;
    }

    /**
     * Getter method for portNm2.
     *
     * @return the portNm2
     */
    public String getPortNm2() {
        return portNm2;
    }

    /**
     * Setter method for portNm2.
     *
     * @param portNm2 Set for portNm2
     */
    public void setPortNm2(String portNm2) {
        this.portNm2 = portNm2;
    }

    /**
     * Getter method for qtyUnit.
     *
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Setter method for qtyUnit.
     *
     * @param qtyUnit Set for qtyUnit
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * Getter method for relateTempInvoiceNo.
     *
     * @return the relateTempInvoiceNo
     */
    public String getRelateTempInvoiceNo() {
        return relateTempInvoiceNo;
    }

    /**
     * Setter method for relateTempInvoiceNo.
     *
     * @param relateTempInvoiceNo Set for relateTempInvoiceNo
     */
    public void setRelateTempInvoiceNo(String relateTempInvoiceNo) {
        this.relateTempInvoiceNo = relateTempInvoiceNo;
    }

    /**
     * Getter method for scHeaderFileId.
     *
     * @return the scHeaderFileId
     */
    public String getScHeaderFileId() {
        return scHeaderFileId;
    }

    /**
     * Setter method for scHeaderFileId.
     *
     * @param scHeaderFileId Set for scHeaderFileId
     */
    public void setScHeaderFileId(String scHeaderFileId) {
        this.scHeaderFileId = scHeaderFileId;
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
     * Getter method for supplierInvoiceNo.
     *
     * @return the supplierInvoiceNo
     */
    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    /**
     * Setter method for supplierInvoiceNo.
     *
     * @param supplierInvoiceNo Set for supplierInvoiceNo
     */
    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
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
     * Getter method for totalNetWeightUnit.
     *
     * @return the totalNetWeightUnit
     */
    public String getTotalNetWeightUnit() {
        return totalNetWeightUnit;
    }

    /**
     * Setter method for totalNetWeightUnit.
     *
     * @param totalNetWeightUnit Set for totalNetWeightUnit
     */
    public void setTotalNetWeightUnit(String totalNetWeightUnit) {
        this.totalNetWeightUnit = totalNetWeightUnit;
    }

    /**
     * Getter method for unitPrice.
     *
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter method for unitPrice.
     *
     * @param unitPrice Set for unitPrice
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter method for unitPriceCurrCd.
     *
     * @return the unitPriceCurrCd
     */
    public String getUnitPriceCurrCd() {
        return unitPriceCurrCd;
    }

    /**
     * Setter method for unitPriceCurrCd.
     *
     * @param unitPriceCurrCd Set for unitPriceCurrCd
     */
    public void setUnitPriceCurrCd(String unitPriceCurrCd) {
        this.unitPriceCurrCd = unitPriceCurrCd;
    }

    /**
     * Getter method for value1.
     *
     * @return the value1
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Setter method for value1.
     *
     * @param value1 Set for value1
     */
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    /**
     * Getter method for value2.
     *
     * @return the value2
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Setter method for value2.
     *
     * @param value2 Set for value2
     */
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    /**
     * Getter method for unitPriceError.
     *
     * @return the unitPriceError
     */
    public String getUnitPriceError() {
        return unitPriceError;
    }

    /**
     * Setter method for unitPriceError.
     *
     * @param unitPriceError Set for unitPriceError
     */
    public void setUnitPriceError(String unitPriceError) {
        this.unitPriceError = unitPriceError;
    }

    /**
     * Getter method for hsCodeWarning.
     *
     * @return the hsCodeWarning
     */
    public String getHsCodeWarning() {
        return hsCodeWarning;
    }

    /**
     * Setter method for hsCodeWarning.
     *
     * @param hsCodeWarning Set for hsCodeWarning
     */
    public void setHsCodeWarning(String hsCodeWarning) {
        this.hsCodeWarning = hsCodeWarning;
    }

    /**
     * Getter method for reExpGoodsFlg.
     *
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * Setter method for reExpGoodsFlg.
     *
     * @param reExpGoodsFlg Set for reExpGoodsFlg
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * Getter method for cntryCdShipTo.
     *
     * @return the cntryCdShipTo
     */
    public String getCntryCdShipTo() {
        return cntryCdShipTo;
    }

    /**
     * Setter method for cntryCdShipTo.
     *
     * @param cntryCdShipTo Set for cntryCdShipTo
     */
    public void setCntryCdShipTo(String cntryCdShipTo) {
        this.cntryCdShipTo = cntryCdShipTo;
    }

    /**
     * Getter method for cntryCdShipper.
     *
     * @return the cntryCdShipper
     */
    public String getCntryCdShipper() {
        return cntryCdShipper;
    }

    /**
     * Setter method for cntryCdShipper.
     *
     * @param cntryCdShipper Set for cntryCdShipper
     */
    public void setCntryCdShipper(String cntryCdShipper) {
        this.cntryCdShipper = cntryCdShipper;
    }

    /**
     * Getter method for cntryCdCarrier.
     *
     * @return the cntryCdCarrier
     */
    public String getCntryCdCarrier() {
        return cntryCdCarrier;
    }

    /**
     * Setter method for cntryCdCarrier.
     *
     * @param cntryCdCarrier Set for cntryCdCarrier
     */
    public void setCntryCdCarrier(String cntryCdCarrier) {
        this.cntryCdCarrier = cntryCdCarrier;
    }

    /**
     * Getter method for customerPoCd.
     *
     * @return the customerPoCd
     */
    public String getCustomerPoCd() {
        return customerPoCd;
    }

    /**
     * Setter method for customerPoCd.
     *
     * @param customerPoCd Set for customerPoCd
     */
    public void setCustomerPoCd(String customerPoCd) {
        this.customerPoCd = customerPoCd;
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
     * Getter method for totalNetWeightOverflowFlg.
     *
     * @return the totalNetWeightOverflowFlg
     */
    public String getTotalNetWeightOverflowFlg() {
        return totalNetWeightOverflowFlg;
    }

    /**
     * Setter method for totalNetWeightOverflowFlg.
     *
     * @param totalNetWeightOverflowFlg Set for totalNetWeightOverflowFlg
     */
    public void setTotalNetWeightOverflowFlg(String totalNetWeightOverflowFlg) {
        this.totalNetWeightOverflowFlg = totalNetWeightOverflowFlg;
    }

    /**
     * Getter method for totalGrossWeightOverflowFlg.
     *
     * @return the totalGrossWeightOverflowFlg
     */
    public String getTotalGrossWeightOverflowFlg() {
        return totalGrossWeightOverflowFlg;
    }

    /**
     * Setter method for totalGrossWeightOverflowFlg.
     *
     * @param totalGrossWeightOverflowFlg Set for totalGrossWeightOverflowFlg
     */
    public void setTotalGrossWeightOverflowFlg(String totalGrossWeightOverflowFlg) {
        this.totalGrossWeightOverflowFlg = totalGrossWeightOverflowFlg;
    }

    /**
     * Getter method for totalVolumeOverflowFlg.
     *
     * @return the totalVolumeOverflowFlg
     */
    public String getTotalVolumeOverflowFlg() {
        return totalVolumeOverflowFlg;
    }

    /**
     * Setter method for totalVolumeOverflowFlg.
     *
     * @param totalVolumeOverflowFlg Set for totalVolumeOverflowFlg
     */
    public void setTotalVolumeOverflowFlg(String totalVolumeOverflowFlg) {
        this.totalVolumeOverflowFlg = totalVolumeOverflowFlg;
    }

    /**
     * Getter method for cmlAtchCsvFileId.
     *
     * @return the cmlAtchCsvFileId
     */
    public String getCmlAtchCsvFileId() {
        return cmlAtchCsvFileId;
    }

    /**
     * Setter method for cmlAtchCsvFileId.
     *
     * @param cmlAtchCsvFileId Set for cmlAtchCsvFileId
     */
    public void setCmlAtchCsvFileId(String cmlAtchCsvFileId) {
        this.cmlAtchCsvFileId = cmlAtchCsvFileId;
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
     * Getter method for pltzList2.
     *
     * @return the pltzList2
     */
    public List<? extends W6001DocPltzDomain> getPltzList2() {
        return pltzList2;
    }

    /**
     * Setter method for pltzList2.
     *
     * @param pltzList2 Set for pltzList2
     */
    public void setPltzList2(List<? extends W6001DocPltzDomain> pltzList2) {
        this.pltzList2 = pltzList2;
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

    /**
     * <p>Getter method for c8.</p>
     *
     * @return the c8
     */
    public String getC8() {
        return c8;
    }

    /**
     * <p>Setter method for c8.</p>
     *
     * @param c8 Set for c8
     */
    public void setC8(String c8) {
        this.c8 = c8;
    }
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<

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
    