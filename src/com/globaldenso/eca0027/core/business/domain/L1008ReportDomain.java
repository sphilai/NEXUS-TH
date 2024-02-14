/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of the document [L1004].
 * <br/>帳票【L1004】の情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10064 $
 */
public class L1008ReportDomain extends AbstractDomain {
    
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /** 
     * Cont. Sort Key
     */             
    private String contSortKey = null;
    
    /**
     * LD CD
     */
    private String ldCd = null;
    
    /**
     * Instr. Flg
     */
    private Boolean instr = false;
    
    /**
     * Air Flg
     */
    private Boolean airFlg = false;
    
    /**
     * Pallet No.
     */
    private String palletNo = null;
    
    /** 
     * Case Mark Label No.
     */
    private String cmlNo = null;
    
    /**
     * Ship to Abbr.
     */
    private String shipToAbbr = null;
    
    /**
     * Ship to Comp Name
     */
    private String shipTo = null;
    
    /**
     * Customer Item No.
     */
    private String customerItemNo = null;
    
    /**
     * QTY
     */
    private String headerQty = null;
    
    /**
     * Broken Flg
     */
    private Boolean brokenFlg = null;
    
    /**
     * Unit Name
     */
    private String measureUnit = null;
    
    /**
     * CML TYPE
     */
    private String cmlType = null;
    
    /**
     * G/W
     */
    private String gw = null;

    /**
     * QR(NEXUS)
     */
    private InputStream qrCdNexus = null;
    
    /**
     * Due Date
     */
    private String dueDate = null;

    /**
     * QR(EIS)
     */
    private InputStream qrCdEls = null;
    
    /**
     * Printed Date
     */
    private String printedDate = null;
    
    /**
     * Shipper
     */
    private String shipper = null;
    
    /**
     * Issuer
     */
    private String issuer = null;
    
    /**
     * RT
     */
    private String rt = null;
    
    /**
     * Mix Tag
     */
    private String mixTag = null;
    
    /**
     * Description
     */
    private String description = null;
    
    /**
     * Customer Item No. or Model
     */
    private String customerItemNoOrModel = null;
    
    /**
     * Item No.
     */
    private String itemNo = null;
    
    /**
     * QTY
     */
    private String qty = null;
    
    /**
     * PKG
     */
    private String pkg = null;
    
    /**
     * Remarks
     */
    private String remarks = null;
    

    /**
     * MigrationFlg
     */
    private String migrationFlg = null;
    
    /**
     * Flag to determine whether multi-product or single item.<br />
     * true = Single、false = Multi<br />
     * 単品か多品かを判定するフラグ<br />
     * true = 単品、false = 多品<br />
     */
    private Boolean singleFlg = false;
    /**
     * SumNoOfBox
     */
    private String sumNoOfBox = null;
    /**
     * List of domain specification<br />
     * 明細ドメインのリスト
     */
    private List<? extends L1008ReportDetailDomain> detailList;

    /**
     * Default Constructor
     */
    public L1008ReportDomain() {
    }
    
    /**
     * Getter method for contSortKey.
     *
     * @return the contSortKey
     */
    public String getContSortKey() {
        return contSortKey;
    }

    /**
     * Setter method for contSortKey.
     *
     * @param contSortKey Set for contSortKey
     */
    public void setContSortKey(String contSortKey) {
        this.contSortKey = contSortKey;
    }

    /**
     * <p>Getter method for sumNoOfBox.</p>
     *
     * @return the sumNoOfBox
     */
    public String getSumNoOfBox() {
        return sumNoOfBox;
    }

    /**
     * <p>Setter method for sumNoOfBox.</p>
     *
     * @param sumNoOfBox Set for sumNoOfBox
     */
    public void setSumNoOfBox(String sumNoOfBox) {
        this.sumNoOfBox = sumNoOfBox;
    }

    /**
     * Getter method for ldCd.
     *
     * @return the ldCd
     */
    public String getLdCd() {
        return ldCd;
    }

    /**
     * Setter method for ldCd.
     *
     * @param ldCd Set for ldCd
     */
    public void setLdCd(String ldCd) {
        this.ldCd = ldCd;
    }

    /**
     * Getter method for instr.
     *
     * @return the instr
     */
    public Boolean getInstr() {
        return instr;
    }

    /**
     * Setter method for instr.
     *
     * @param instr Set for instr
     */
    public void setInstr(Boolean instr) {
        this.instr = instr;
    }

    /**
     * Getter method for airFlg.
     *
     * @return the airFlg
     */
    public Boolean getAirFlg() {
        return airFlg;
    }

    /**
     * Setter method for airFlg.
     *
     * @param airFlg Set for airFlg
     */
    public void setAirFlg(Boolean airFlg) {
        this.airFlg = airFlg;
    }

    /**
     * Getter method for palletNo.
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * Getter method for cmlNo.
     *
     * @return the cmlNo
     */
    public String getCmlNo() {
        return cmlNo;
    }

    /**
     * Setter method for cmlNo.
     *
     * @param cmlNo Set for cmlNo
     */
    public void setCmlNo(String cmlNo) {
        this.cmlNo = cmlNo;
    }

    /**
     * Getter method for shipToAbbr.
     *
     * @return the shipToAbbr
     */
    public String getShipToAbbr() {
        return shipToAbbr;
    }

    /**
     * Setter method for shipToAbbr.
     *
     * @param shipToAbbr Set for shipToAbbr
     */
    public void setShipToAbbr(String shipToAbbr) {
        this.shipToAbbr = shipToAbbr;
    }

    /**
     * Getter method for shipTo.
     *
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Setter method for shipTo.
     *
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
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
     * Getter method for headerQty.
     *
     * @return the headerQty
     */
    public String getHeaderQty() {
        return headerQty;
    }

    /**
     * Setter method for headerQty.
     *
     * @param headerQty Set for headerQty
     */
    public void setHeaderQty(String headerQty) {
        this.headerQty = headerQty;
    }

    /**
     * Getter method for brokenFlg.
     *
     * @return the brokenFlg
     */
    public Boolean getBrokenFlg() {
        return brokenFlg;
    }

    /**
     * Setter method for brokenFlg.
     *
     * @param brokenFlg Set for brokenFlg
     */
    public void setBrokenFlg(Boolean brokenFlg) {
        this.brokenFlg = brokenFlg;
    }

    /**
     * Getter method for measureUnit.
     *
     * @return the measureUnit
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Setter method for measureUnit.
     *
     * @param measureUnit Set for measureUnit
     */
    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    /**
     * Getter method for cmlType.
     *
     * @return the cmlType
     */
    public String getCmlType() {
        return cmlType;
    }

    /**
     * Setter method for cmlType.
     *
     * @param cmlType Set for cmlType
     */
    public void setCmlType(String cmlType) {
        this.cmlType = cmlType;
    }

    /**
     * Getter method for gw.
     *
     * @return the gw
     */
    public String getGw() {
        return gw;
    }

    /**
     * Setter method for gw.
     *
     * @param gw Set for gw
     */
    public void setGw(String gw) {
        this.gw = gw;
    }

    /**
     * Getter method for qrCdNexus.
     *
     * @return the qrCdNexus
     */
    public InputStream getQrCdNexus() {
        return qrCdNexus;
    }

    /**
     * Setter method for qrCdNexus.
     *
     * @param qrCdNexus Set for qrCdNexus
     */
    public void setQrCdNexus(InputStream qrCdNexus) {
        this.qrCdNexus = qrCdNexus;
    }

    /**
     * Getter method for dueDate.
     *
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Setter method for dueDate.
     *
     * @param dueDate Set for dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter method for qrCdEls.
     *
     * @return the qrCdEls
     */
    public InputStream getQrCdEls() {
        return qrCdEls;
    }

    /**
     * Setter method for qrCdEls.
     *
     * @param qrCdEls Set for qrCdEls
     */
    public void setQrCdEls(InputStream qrCdEls) {
        this.qrCdEls = qrCdEls;
    }

    /**
     * Getter method for printedDate.
     *
     * @return the printedDate
     */
    public String getPrintedDate() {
        return printedDate;
    }

    /**
     * Setter method for printedDate.
     *
     * @param printedDate Set for printedDate
     */
    public void setPrintedDate(String printedDate) {
        this.printedDate = printedDate;
    }

    /**
     * Getter method for shipper.
     *
     * @return the shipper
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * Setter method for shipper.
     *
     * @param shipper Set for shipper
     */
    public void setShipper(String shipper) {
        this.shipper = shipper;
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

    /**
     * Getter method for rt.
     *
     * @return the rt
     */
    public String getRt() {
        return rt;
    }

    /**
     * Setter method for rt.
     *
     * @param rt Set for rt
     */
    public void setRt(String rt) {
        this.rt = rt;
    }

    /**
     * Getter method for mixTag.
     *
     * @return the mixTag
     */
    public String getMixTag() {
        return mixTag;
    }

    /**
     * Setter method for mixTag.
     *
     * @param mixTag Set for mixTag
     */
    public void setMixTag(String mixTag) {
        this.mixTag = mixTag;
    }

    /**
     * Getter method for description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param description Set for description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for customerItemNoOrModel.
     *
     * @return the customerItemNoOrModel
     */
    public String getCustomerItemNoOrModel() {
        return customerItemNoOrModel;
    }

    /**
     * Setter method for customerItemNoOrModel.
     *
     * @param customerItemNoOrModel Set for customerItemNoOrModel
     */
    public void setCustomerItemNoOrModel(String customerItemNoOrModel) {
        this.customerItemNoOrModel = customerItemNoOrModel;
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
     * Getter method for qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Getter method for pkg.
     *
     * @return the pkg
     */
    public String getPkg() {
        return pkg;
    }

    /**
     * Setter method for pkg.
     *
     * @param pkg Set for pkg
     */
    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    /**
     * Getter method for remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter method for remarks.
     *
     * @param remarks Set for remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Getter method for singleFlg.
     *
     * @return the singleFlg
     */
    public Boolean getSingleFlg() {
        return singleFlg;
    }

    /**
     * Setter method for singleFlg.
     *
     * @param singleFlg Set for singleFlg
     */
    public void setSingleFlg(Boolean singleFlg) {
        this.singleFlg = singleFlg;
    }

    /**
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<? extends L1008ReportDetailDomain> getDetailList() {
        return detailList;
    }

    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<? extends L1008ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }

    /**
     * Getter method for migrationFlg.
     *
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

     /**
      * Setter method for migrationFlg.
      *
      * @param migrationFlg Set for migrationFlg
      */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
    }

}