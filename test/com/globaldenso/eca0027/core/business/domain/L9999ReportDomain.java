/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * <br />Mock帳票出力用ドメインです。
 *
 * @version $Revision: 5759 $
 */
public class L9999ReportDomain {

    /**
     * <br />コンテナ層別キー
     */
    private String containerSortKey;
    
    /**
     * <br />荷積み位置コード
     */
    private String ldCd;
    
    /**
     * <br />荷揃え指示品表示フラグ
     */
    private boolean instrFlg;
    
    /**
     * <br />輸送手段AIR表示フラグ
     */
    private boolean airFlg;
    
    /**
     * <br />パレット番号
     */
    private String palletNo;
    
    /**
     * <br />メインマーク
     */
    private String mainMark;
  
    /**
     * <br />送荷先会社略称
     */
    private String shipToAbbr;
    
    /**
     * <br />送荷先会社名称
     */
    private String shipToCompName;
    
    /**
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * <br />数量
     */
    private String qty;
    
    /**
     * <br />ロット割れフラグ
     */
    private boolean brokenFlg;
    
    /**
     * <br />単位表記
     */
    private String unitName;
    
    /**
     * <br />ケースマーク区分
     */
    private String cmlType;
    
    /**
     * <br />グロス重量
     */
    private String gw;
    
    /**
     * <br />品目名称
     */
    private String description;
    
    /**
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * <br />QR(NEXUS)
     */
    private InputStream qrNexus;
    
    /**
     * <br />納期
     */
    private Date dueDate;
    
    /**
     * <br />注意書き
     */
    private String remarks;
    
    /**
     * <br />QR(EIS)
     */
    private InputStream qrEis;
    
    /**
     * <br />印刷日
     */
    private Date printedDate;
    
    /**
     * <br />荷主会社名称
     */
    private String shipper;
    
    /**
     * <br />CML作成者
     */
    private String issuer;
    
    /**
     * <br />明細ドメインのリスト
     */
    private List<L9999ReportDetailDomain> detailList;
    
    /**
     * <br />単品フラグ
     * <pre>
     * trueの場合、ヘッダ部に「Case Mark Label No.」+ 囲み線を表示します。
     * falseの場合、ヘッダ部に「CML No.」を表示します。
     * </pre>
     */
    private boolean singleFlg;
    
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public L9999ReportDomain() {
    }


    /**
     * Getter method for containerSortKey.
     *
     * @return the containerSortKey
     */
    public String getContainerSortKey() {
        return containerSortKey;
    }


    /**
     * Setter method for containerSortKey.
     *
     * @param containerSortKey Set for containerSortKey
     */
    public void setContainerSortKey(String containerSortKey) {
        this.containerSortKey = containerSortKey;
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
     * Getter method for instrFlg.
     *
     * @return the instrFlg
     */
    public boolean isInstrFlg() {
        return instrFlg;
    }


    /**
     * Setter method for instrFlg.
     *
     * @param instrFlg Set for instrFlg
     */
    public void setInstrFlg(boolean instrFlg) {
        this.instrFlg = instrFlg;
    }


    /**
     * Getter method for airFlg.
     *
     * @return the airFlg
     */
    public boolean isAirFlg() {
        return airFlg;
    }


    /**
     * Setter method for airFlg.
     *
     * @param airFlg Set for airFlg
     */
    public void setAirFlg(boolean airFlg) {
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
     * Getter method for shipToCompName.
     *
     * @return the shipToCompName
     */
    public String getShipToCompName() {
        return shipToCompName;
    }


    /**
     * Setter method for shipToCompName.
     *
     * @param shipToCompName Set for shipToCompName
     */
    public void setShipToCompName(String shipToCompName) {
        this.shipToCompName = shipToCompName;
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
     * Getter method for brokenFlg.
     *
     * @return the brokenFlg
     */
    public boolean isBrokenFlg() {
        return brokenFlg;
    }


    /**
     * Setter method for brokenFlg.
     *
     * @param brokenFlg Set for brokenFlg
     */
    public void setBrokenFlg(boolean brokenFlg) {
        this.brokenFlg = brokenFlg;
    }


    /**
     * Getter method for unitName.
     *
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }


    /**
     * Setter method for unitName.
     *
     * @param unitName Set for unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
     * Getter method for qrNexus.
     *
     * @return the qrNexus
     */
    public InputStream getQrNexus() {
        return qrNexus;
    }


    /**
     * Setter method for qrNexus.
     *
     * @param qrNexus Set for qrNexus
     */
    public void setQrNexus(InputStream qrNexus) {
        this.qrNexus = qrNexus;
    }


    /**
     * Getter method for dueDate.
     *
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }


    /**
     * Setter method for dueDate.
     *
     * @param dueDate Set for dueDate
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
     * Getter method for qrEis.
     *
     * @return the qrEis
     */
    public InputStream getQrEis() {
        return qrEis;
    }


    /**
     * Setter method for qrEis.
     *
     * @param qrEis Set for qrEis
     */
    public void setQrEis(InputStream qrEis) {
        this.qrEis = qrEis;
    }


    /**
     * Getter method for printedDate.
     *
     * @return the printedDate
     */
    public Date getPrintedDate() {
        return printedDate;
    }


    /**
     * Setter method for printedDate.
     *
     * @param printedDate Set for printedDate
     */
    public void setPrintedDate(Date printedDate) {
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
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<L9999ReportDetailDomain> getDetailList() {
        return detailList;
    }


    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<L9999ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }


    /**
     * Getter method for singleFlg.
     *
     * @return the singleFlg
     */
    public boolean isSingleFlg() {
        return singleFlg;
    }


    /**
     * Setter method for singleFlg.
     *
     * @param singleFlg Set for singleFlg
     */
    public void setSingleFlg(boolean singleFlg) {
        this.singleFlg = singleFlg;
    }

}
