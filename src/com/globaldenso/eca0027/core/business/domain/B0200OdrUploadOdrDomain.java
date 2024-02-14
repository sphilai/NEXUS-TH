/*
 * Project : NEXUS_EXPORT/NEXUS_CIGMA
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * It is a domain equivalent to 1 order. Used for Order Upload job
 * <br />1オーダーに相当するドメインです。Order Uploadジョブで使用。
 *
 * MGT575 ADD
 *
 * #############################################################
 * Caution/注意:
 * Since this file is common to NEXUS_EXPORT / NEXUS_CIGMA, when you modify one,
 * be sure to copy it to the other.
 * 本ファイルはNEXUS_EXPORT/NEXUS_CIGMA共通であるため、一方を修正した場合、必ず他方にコピーすること。
 * #############################################################
 *
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13711 $
 */
@XmlAccessorType(XmlAccessType.NONE)
public class B0200OdrUploadOdrDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * REQUEST_ID
     */
    @XmlElement(name = "requestId")
    private String requestId;

    /**
     * UPLOAD_FILE_LINE
     */
    @XmlElement(name = "uploadFileLine")
    private BigDecimal uploadFileLine;

    /**
     * FCST_REPLACE_FLG
     */
    private String fcstReplaceFlg;

    /**
     * PROCESS_TYP
     */
    @XmlElement(name = "processTyp")
    private String processTyp;

    /**
     * RCV_ODR_COMP_CD
     */
    private String rcvOdrCompCd;

    /**
     * CUSTOMER_CD
     */
    @XmlElement(name = "customerCd")
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    @XmlElement(name = "lgcyShipTo")
    private String lgcyShipTo;

    /**
     * CUSTOMER_ITEM_NO
     */
    @XmlElement(name = "customerItemNo")
    private String customerItemNo;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * ETD_DUE_DT
     */
    private Date etdDueDt;

    /**
     * ETD_DUE_DT
     */
    @XmlElement(name = "etdDueDt")
    private String etdDueDtString;

    /**
     * CUSTOMER_PO_NO
     */
    private String customerPoNo;

    /**
     * NEW_TRNS_CD
     */
    private String newTrnsCd;

    /**
     * NEW_ETD_DUE_DT
     */
    private Date newEtdDueDt;

    /**
     * NEW_CUSTOMER_PO_NO
     */
    private String newCustomerPoNo;

    /**
     * ODR_QTY
     */
    private BigDecimal odrQty;

    /**
     * CUSTOMER_DUE_DT
     */
    private Date customerDueDt;

    /**
     * ODR_FIRM_FLG
     */
    @XmlElement(name = "odrFirmFlg")
    private String odrFirmFlg;

    /**
     * SALES_COMP_PO_NO
     */
    private String salesCompPoNo;

    /**
     * ITEM_NO
     */
    @XmlElement(name = "itemNo")
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * ITEM_DESCRIPTION
     */
    @XmlElement(name = "itemDescription")
    private String itemDescription;

    /**
     * PLNT_CD
     */
    @XmlElement(name = "plntCd")
    private String plntCd;

    /**
     * SHIPPING_DT
     */
    private Date shippingDt;

    /**
     * SHIPPING_DT
     */
    @XmlElement(name = "shippingDt")
    private String shippingDtString;

    /**
     * SUPPLIER_CD
     */
    @XmlElement(name = "supplierCd")
    private String supplierCd;

    /**
     * LVL1_ERR_CD_LIST
     */
    @XmlElement(name = "lvl1ErrCdList")
    private String lvl1ErrCdList;

    /**
     * LVL2_ERR_CD_LIST
     */
    @XmlElement(name = "lvl2ErrCdList")
    private String lvl2ErrCdList;

    /**
     * LVL3_ERR_CD_LIST
     */
    @XmlElement(name = "lvl3ErrCdList")
    private String lvl3ErrCdList;

    /**
     * LVL3_WARN_CD_LIST
     */
    @XmlElement(name = "lvl3WarnCdList")
    private String lvl3WarnCdList;

    /**
     * ERROR_TYP
     */
    private String errorTyp;

    /** CIGMA library */
    private String lib;

    /*
     * use for checking CIGMA side
     */
    /** existCusSupXrefFlg */
    private String existCusSupXrefFlg;
    /** existShipDocFlg */
    private String existShipDocFlg;
    /** reqireSubInvoiceFlg */
    private String reqireSubInvoiceFlg;
    /** existSubShipDocFlg */
    private String existSubShipDocFlg;
    /** existShipToFlg */
    private String existShipToFlg;
    /** existItemXrefFlg */
    private String existItemXrefFlg;
    /** existItemFlg */
    private String existItemFlg;
    /** existSalesPriceFlg */
    private String existSalesPriceFlg;
    /** productOrApartsFlg */
    private String productOrApartsFlg;
    /** ediFlg */
    private String ediFlg;

    /*
     * use for checking NEXUS side.
     */
    /** existOldExpRcvOdrFlg */
    private String existOldExpRcvOdrFlg;
    /** existNewExpRcvOdrFlg */
    private String existNewExpRcvOdrFlg;
    /** existItemSpInfoFlg */
    private String existItemSpInfoFlg;
    /** existFormalitiItemFlg */
    private String existFormalitiItemFlg;
    /** existNewTrnsFlg */
    private String existNewTrnsFlg;
    /** oldOdrQty */
    private BigDecimal oldOdrQty;
    /** oldCustomerDueDt */
    private Date oldCustomerDueDt;
    /** oldOdrFirmFlg */
    private String oldOdrFirmFlg;
    /** pltzAllocQty */
    private BigDecimal pltzAllocQty;
    /** shippedQty */
    private BigDecimal shippedQty;
    /** shippingLot */
    private BigDecimal shippingLot;

    /*
     * common item
     */
    /** 作成日時 */
    /** Create date and time */
    private Timestamp comCreateTimestamp;
    /** 作成者ID */
    /** Create user id */
    private String comCreateUserId;
    /** 登録機能ID */
    /** Create function id */
    private String comCreateFuncId;
    /** 更新日時 */
    /** Update date and time */
    private Timestamp comUpdateTimestamp;
    /** 更新者ID */
    /** Update user id */
    private String comUpdateUserId;
    /** 更新機能ID */
    /** Update function id */
    private String comUpdateFuncId;

    /**
     * constructor
     * <br />コンストラクタ。
     */
    public B0200OdrUploadOdrDomain() {
        super();
    }

    /**
     * Getter method for requestId.
     *
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter method for requestId.
     *
     * @param requestId Set for requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter method for uploadFileLine.
     *
     * @return the uploadFileLine
     */
    public BigDecimal getUploadFileLine() {
        return uploadFileLine;
    }

    /**
     * Setter method for uploadFileLine.
     *
     * @param uploadFileLine Set for uploadFileLine
     */
    public void setUploadFileLine(BigDecimal uploadFileLine) {
        this.uploadFileLine = uploadFileLine;
    }

    /**
     * Getter method for fcstReplaceFlg.
     *
     * @return the fcstReplaceFlg
     */
    public String getFcstReplaceFlg() {
        return fcstReplaceFlg;
    }

    /**
     * Setter method for fcstReplaceFlg.
     *
     * @param fcstReplaceFlg Set for fcstReplaceFlg
     */
    public void setFcstReplaceFlg(String fcstReplaceFlg) {
        this.fcstReplaceFlg = fcstReplaceFlg;
    }

    /**
     * Getter method for processTyp.
     *
     * @return the processTyp
     */
    public String getProcessTyp() {
        return processTyp;
    }

    /**
     * Setter method for processTyp.
     *
     * @param processTyp Set for processTyp
     */
    public void setProcessTyp(String processTyp) {
        this.processTyp = processTyp;
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
     * Getter method for etdDueDtString.
     *
     * @return the etdDueDtString
     */
    public String getEtdDueDtString() {
        return etdDueDtString;
    }

    /**
     * Setter method for etdDueDtString.
     *
     * @param etdDueDtString Set for etdDueDtString
     */
    public void setEtdDueDtString(String etdDueDtString) {
        this.etdDueDtString = etdDueDtString;
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
     * Getter method for newTrnsCd.
     *
     * @return the newTrnsCd
     */
    public String getNewTrnsCd() {
        return newTrnsCd;
    }

    /**
     * Setter method for newTrnsCd.
     *
     * @param newTrnsCd Set for newTrnsCd
     */
    public void setNewTrnsCd(String newTrnsCd) {
        this.newTrnsCd = newTrnsCd;
    }

    /**
     * Getter method for newEtdDueDt.
     *
     * @return the newEtdDueDt
     */
    public Date getNewEtdDueDt() {
        return newEtdDueDt;
    }

    /**
     * Setter method for newEtdDueDt.
     *
     * @param newEtdDueDt Set for newEtdDueDt
     */
    public void setNewEtdDueDt(Date newEtdDueDt) {
        this.newEtdDueDt = newEtdDueDt;
    }

    /**
     * Getter method for newCustomerPoNo.
     *
     * @return the newCustomerPoNo
     */
    public String getNewCustomerPoNo() {
        return newCustomerPoNo;
    }

    /**
     * Setter method for newCustomerPoNo.
     *
     * @param newCustomerPoNo Set for newCustomerPoNo
     */
    public void setNewCustomerPoNo(String newCustomerPoNo) {
        this.newCustomerPoNo = newCustomerPoNo;
    }

    /**
     * Getter method for odrQty.
     *
     * @return the odrQty
     */
    public BigDecimal getOdrQty() {
        return odrQty;
    }

    /**
     * Setter method for odrQty.
     *
     * @param odrQty Set for odrQty
     */
    public void setOdrQty(BigDecimal odrQty) {
        this.odrQty = odrQty;
    }

    /**
     * Getter method for customerDueDt.
     *
     * @return the customerDueDt
     */
    public Date getCustomerDueDt() {
        return customerDueDt;
    }

    /**
     * Setter method for customerDueDt.
     *
     * @param customerDueDt Set for customerDueDt
     */
    public void setCustomerDueDt(Date customerDueDt) {
        this.customerDueDt = customerDueDt;
    }

    /**
     * Getter method for odrFirmFlg.
     *
     * @return the odrFirmFlg
     */
    public String getOdrFirmFlg() {
        return odrFirmFlg;
    }

    /**
     * Setter method for odrFirmFlg.
     *
     * @param odrFirmFlg Set for odrFirmFlg
     */
    public void setOdrFirmFlg(String odrFirmFlg) {
        this.odrFirmFlg = odrFirmFlg;
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
     * Getter method for shippingDt.
     *
     * @return the shippingDt
     */
    public Date getShippingDt() {
        return shippingDt;
    }

    /**
     * Setter method for shippingDt.
     *
     * @param shippingDt Set for shippingDt
     */
    public void setShippingDt(Date shippingDt) {
        this.shippingDt = shippingDt;
    }

    /**
     * Getter method for shippingDtString.
     *
     * @return the shippingDtString
     */
    public String getShippingDtString() {
        return shippingDtString;
    }

    /**
     * Setter method for shippingDtString.
     *
     * @param shippingDtString Set for shippingDtString
     */
    public void setShippingDtString(String shippingDtString) {
        this.shippingDtString = shippingDtString;
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
     * Getter method for lvl1ErrCdList.
     *
     * @return the lvl1ErrCdList
     */
    public String getLvl1ErrCdList() {
        return lvl1ErrCdList;
    }

    /**
     * Setter method for lvl1ErrCdList.
     *
     * @param lvl1ErrCdList Set for lvl1ErrCdList
     */
    public void setLvl1ErrCdList(String lvl1ErrCdList) {
        this.lvl1ErrCdList = lvl1ErrCdList;
    }

    /**
     * Getter method for lvl2ErrCdList.
     *
     * @return the lvl2ErrCdList
     */
    public String getLvl2ErrCdList() {
        return lvl2ErrCdList;
    }

    /**
     * Setter method for lvl2ErrCdList.
     *
     * @param lvl2ErrCdList Set for lvl2ErrCdList
     */
    public void setLvl2ErrCdList(String lvl2ErrCdList) {
        this.lvl2ErrCdList = lvl2ErrCdList;
    }

    /**
     * Getter method for lvl3ErrCdList.
     *
     * @return the lvl3ErrCdList
     */
    public String getLvl3ErrCdList() {
        return lvl3ErrCdList;
    }

    /**
     * Setter method for lvl3ErrCdList.
     *
     * @param lvl3ErrCdList Set for lvl3ErrCdList
     */
    public void setLvl3ErrCdList(String lvl3ErrCdList) {
        this.lvl3ErrCdList = lvl3ErrCdList;
    }

    /**
     * Getter method for lvl3WarnCdList.
     *
     * @return the lvl3WarnCdList
     */
    public String getLvl3WarnCdList() {
        return lvl3WarnCdList;
    }

    /**
     * Setter method for lvl3WarnCdList.
     *
     * @param lvl3WarnCdList Set for lvl3WarnCdList
     */
    public void setLvl3WarnCdList(String lvl3WarnCdList) {
        this.lvl3WarnCdList = lvl3WarnCdList;
    }

    /**
     * Getter method for errorTyp.
     *
     * @return the errorTyp
     */
    public String getErrorTyp() {
        return errorTyp;
    }

    /**
     * Setter method for errorTyp.
     *
     * @param errorTyp Set for errorTyp
     */
    public void setErrorTyp(String errorTyp) {
        this.errorTyp = errorTyp;
    }

    /**
     * Getter method for lib.
     *
     * @return the lib
     */
    public String getLib() {
        return lib;
    }

    /**
     * Setter method for lib.
     *
     * @param lib Set for lib
     */
    public void setLib(String lib) {
        this.lib = lib;
    }

    /**
     * Getter method for existCusSupXrefFlg.
     *
     * @return the existCusSupXrefFlg
     */
    public String getExistCusSupXrefFlg() {
        return existCusSupXrefFlg;
    }

    /**
     * Setter method for existCusSupXrefFlg.
     *
     * @param existCusSupXrefFlg Set for existCusSupXrefFlg
     */
    public void setExistCusSupXrefFlg(String existCusSupXrefFlg) {
        this.existCusSupXrefFlg = existCusSupXrefFlg;
    }

    /**
     * Getter method for existShipDocFlg.
     *
     * @return the existShipDocFlg
     */
    public String getExistShipDocFlg() {
        return existShipDocFlg;
    }

    /**
     * Setter method for existShipDocFlg.
     *
     * @param existShipDocFlg Set for existShipDocFlg
     */
    public void setExistShipDocFlg(String existShipDocFlg) {
        this.existShipDocFlg = existShipDocFlg;
    }

    /**
     * Getter method for reqireSubInvoiceFlg.
     *
     * @return the reqireSubInvoiceFlg
     */
    public String getReqireSubInvoiceFlg() {
        return reqireSubInvoiceFlg;
    }

    /**
     * Setter method for reqireSubInvoiceFlg.
     *
     * @param reqireSubInvoiceFlg Set for reqireSubInvoiceFlg
     */
    public void setReqireSubInvoiceFlg(String reqireSubInvoiceFlg) {
        this.reqireSubInvoiceFlg = reqireSubInvoiceFlg;
    }

    /**
     * Getter method for existSubShipDocFlg.
     *
     * @return the existSubShipDocFlg
     */
    public String getExistSubShipDocFlg() {
        return existSubShipDocFlg;
    }

    /**
     * Setter method for existSubShipDocFlg.
     *
     * @param existSubShipDocFlg Set for existSubShipDocFlg
     */
    public void setExistSubShipDocFlg(String existSubShipDocFlg) {
        this.existSubShipDocFlg = existSubShipDocFlg;
    }

    /**
     * Getter method for existShipToFlg.
     *
     * @return the existShipToFlg
     */
    public String getExistShipToFlg() {
        return existShipToFlg;
    }

    /**
     * Setter method for existShipToFlg.
     *
     * @param existShipToFlg Set for existShipToFlg
     */
    public void setExistShipToFlg(String existShipToFlg) {
        this.existShipToFlg = existShipToFlg;
    }

    /**
     * Getter method for existItemXrefFlg.
     *
     * @return the existItemXrefFlg
     */
    public String getExistItemXrefFlg() {
        return existItemXrefFlg;
    }

    /**
     * Setter method for existItemXrefFlg.
     *
     * @param existItemXrefFlg Set for existItemXrefFlg
     */
    public void setExistItemXrefFlg(String existItemXrefFlg) {
        this.existItemXrefFlg = existItemXrefFlg;
    }

    /**
     * Getter method for existItemFlg.
     *
     * @return the existItemFlg
     */
    public String getExistItemFlg() {
        return existItemFlg;
    }

    /**
     * Setter method for existItemFlg.
     *
     * @param existItemFlg Set for existItemFlg
     */
    public void setExistItemFlg(String existItemFlg) {
        this.existItemFlg = existItemFlg;
    }

    /**
     * Getter method for existSalesPriceFlg.
     *
     * @return the existSalesPriceFlg
     */
    public String getExistSalesPriceFlg() {
        return existSalesPriceFlg;
    }

    /**
     * Setter method for existSalesPriceFlg.
     *
     * @param existSalesPriceFlg Set for existSalesPriceFlg
     */
    public void setExistSalesPriceFlg(String existSalesPriceFlg) {
        this.existSalesPriceFlg = existSalesPriceFlg;
    }

    /**
     * Getter method for productOrApartsFlg.
     *
     * @return the productOrApartsFlg
     */
    public String getProductOrApartsFlg() {
        return productOrApartsFlg;
    }

    /**
     * Setter method for productOrApartsFlg.
     *
     * @param productOrApartsFlg Set for productOrApartsFlg
     */
    public void setProductOrApartsFlg(String productOrApartsFlg) {
        this.productOrApartsFlg = productOrApartsFlg;
    }

    /**
     * Getter method for ediFlg.
     *
     * @return the ediFlg
     */
    public String getEdiFlg() {
        return ediFlg;
    }

    /**
     * Setter method for ediFlg.
     *
     * @param ediFlg Set for ediFlg
     */
    public void setEdiFlg(String ediFlg) {
        this.ediFlg = ediFlg;
    }

    /**
     * Getter method for existOldExpRcvOdrFlg.
     *
     * @return the existOldExpRcvOdrFlg
     */
    public String getExistOldExpRcvOdrFlg() {
        return existOldExpRcvOdrFlg;
    }

    /**
     * Setter method for existOldExpRcvOdrFlg.
     *
     * @param existOldExpRcvOdrFlg Set for existOldExpRcvOdrFlg
     */
    public void setExistOldExpRcvOdrFlg(String existOldExpRcvOdrFlg) {
        this.existOldExpRcvOdrFlg = existOldExpRcvOdrFlg;
    }

    /**
     * Getter method for existNewExpRcvOdrFlg.
     *
     * @return the existNewExpRcvOdrFlg
     */
    public String getExistNewExpRcvOdrFlg() {
        return existNewExpRcvOdrFlg;
    }

    /**
     * Setter method for existNewExpRcvOdrFlg.
     *
     * @param existNewExpRcvOdrFlg Set for existNewExpRcvOdrFlg
     */
    public void setExistNewExpRcvOdrFlg(String existNewExpRcvOdrFlg) {
        this.existNewExpRcvOdrFlg = existNewExpRcvOdrFlg;
    }

    /**
     * Getter method for existItemSpInfoFlg.
     *
     * @return the existItemSpInfoFlg
     */
    public String getExistItemSpInfoFlg() {
        return existItemSpInfoFlg;
    }

    /**
     * Setter method for existItemSpInfoFlg.
     *
     * @param existItemSpInfoFlg Set for existItemSpInfoFlg
     */
    public void setExistItemSpInfoFlg(String existItemSpInfoFlg) {
        this.existItemSpInfoFlg = existItemSpInfoFlg;
    }

    /**
     * Getter method for existFormalitiItemFlg.
     *
     * @return the existFormalitiItemFlg
     */
    public String getExistFormalitiItemFlg() {
        return existFormalitiItemFlg;
    }

    /**
     * Setter method for existFormalitiItemFlg.
     *
     * @param existFormalitiItemFlg Set for existFormalitiItemFlg
     */
    public void setExistFormalitiItemFlg(String existFormalitiItemFlg) {
        this.existFormalitiItemFlg = existFormalitiItemFlg;
    }

    /**
     * Getter method for existNewTrnsFlg.
     *
     * @return the existNewTrnsFlg
     */
    public String getExistNewTrnsFlg() {
        return existNewTrnsFlg;
    }

    /**
     * Setter method for existNewTrnsFlg.
     *
     * @param existNewTrnsFlg Set for existNewTrnsFlg
     */
    public void setExistNewTrnsFlg(String existNewTrnsFlg) {
        this.existNewTrnsFlg = existNewTrnsFlg;
    }

    /**
     * Getter method for oldOdrQty.
     *
     * @return the oldOdrQty
     */
    public BigDecimal getOldOdrQty() {
        return oldOdrQty;
    }

    /**
     * Setter method for oldOdrQty.
     *
     * @param oldOdrQty Set for oldOdrQty
     */
    public void setOldOdrQty(BigDecimal oldOdrQty) {
        this.oldOdrQty = oldOdrQty;
    }

    /**
     * Getter method for oldCustomerDueDt.
     *
     * @return the oldCustomerDueDt
     */
    public Date getOldCustomerDueDt() {
        return oldCustomerDueDt;
    }

    /**
     * Setter method for oldCustomerDueDt.
     *
     * @param oldCustomerDueDt Set for oldCustomerDueDt
     */
    public void setOldCustomerDueDt(Date oldCustomerDueDt) {
        this.oldCustomerDueDt = oldCustomerDueDt;
    }

    /**
     * Getter method for oldOdrFirmFlg.
     *
     * @return the oldOdrFirmFlg
     */
    public String getOldOdrFirmFlg() {
        return oldOdrFirmFlg;
    }

    /**
     * Setter method for oldOdrFirmFlg.
     *
     * @param oldOdrFirmFlg Set for oldOdrFirmFlg
     */
    public void setOldOdrFirmFlg(String oldOdrFirmFlg) {
        this.oldOdrFirmFlg = oldOdrFirmFlg;
    }

    /**
     * Getter method for pltzAllocQty.
     *
     * @return the pltzAllocQty
     */
    public BigDecimal getPltzAllocQty() {
        return pltzAllocQty;
    }

    /**
     * Setter method for pltzAllocQty.
     *
     * @param pltzAllocQty Set for pltzAllocQty
     */
    public void setPltzAllocQty(BigDecimal pltzAllocQty) {
        this.pltzAllocQty = pltzAllocQty;
    }

    /**
     * Getter method for shippedQty.
     *
     * @return the shippedQty
     */
    public BigDecimal getShippedQty() {
        return shippedQty;
    }

    /**
     * Setter method for shippedQty.
     *
     * @param shippedQty Set for shippedQty
     */
    public void setShippedQty(BigDecimal shippedQty) {
        this.shippedQty = shippedQty;
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
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
    }

    /**
     * Getter method for comCreateTimestamp.
     *
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * Setter method for comCreateTimestamp.
     *
     * @param comCreateTimestamp Set for comCreateTimestamp
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * Getter method for comCreateUserId.
     *
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * Setter method for comCreateUserId.
     *
     * @param comCreateUserId Set for comCreateUserId
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * Getter method for comCreateFuncId.
     *
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * Setter method for comCreateFuncId.
     *
     * @param comCreateFuncId Set for comCreateFuncId
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for comUpdateUserId.
     *
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * Setter method for comUpdateUserId.
     *
     * @param comUpdateUserId Set for comUpdateUserId
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * Getter method for comUpdateFuncId.
     *
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * Setter method for comUpdateFuncId.
     *
     * @param comUpdateFuncId Set for comUpdateFuncId
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }
}
