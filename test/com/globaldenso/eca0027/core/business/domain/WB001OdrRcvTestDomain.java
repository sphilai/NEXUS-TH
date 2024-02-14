/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 
 * <br />Customer Order Receivingを保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB001OdrRcvTestDomain extends WB001OdrRcvDomain {

    /**
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * DSC-ID
     * <br />DSC-ID
     */
    private String dscId;
    
    /**
     * DSC-NAME
     * <br />氏名
     */
    private String dscNm;
    
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
     * ETD DUE DATE
     * <br />船積期限
     */
    private Date etdDueDt;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * CUSTOMER ITEM NO ORIGINAL
     * <br />得意先品目番号オリジナル
     */
    private String customerItemNoOrg;
    
    /**
     * ORDER CONTROL NO
     * <br />オーダーコントロールNO
     */
    private BigDecimal odrCtrlNo;
    
    /**
     * REVISION NO
     * <br />履歴NO
     */
    private BigDecimal revisionNo;
    
    /**
     * REVISION NO FOR EIS
     * <br />履歴NO(拠点間) 
     */
    private BigDecimal revisionNoEis;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * CUSTOMER DUE DATE
     * <br />顧客納期
     */
    private Date customerDueDt;
    
    /**
     * ITEM NO ORIGINAL
     * <br />品目番号オリジナル
     */
    private String itemNoOrg;
    
    /**
     * ORDER QUANTITY ORIGINAL
     * <br />注文数量オリジナル
     */
    private BigDecimal odrQtyOrg;
    
    /**
     * ORDER QUANTITY
     * <br />注文数量
     */
    private BigDecimal odrQty;
    
    /**
     * PALLETIZE ALLOC QUANTITY
     * <br />梱包引当数量
     */
    private BigDecimal pltzAllocQty;
    
    /**
     * SHIPPED QUANTITY
     * <br />出荷数量
     */
    private BigDecimal shippedQty;
    
    /**
     * SHIPPING DATE
     * <br />出荷予定日
     */
    private Date shippingDt;
    
    /**
     * PARTIAL DELIVERY COUNT
     * <br />分納回数
     */
    private BigDecimal partialDelivCnt;
    
    /**
     * ORDER FIRM FLAG
     * <br />受注確定フラグ
     */
    private String odrFirmFlg;
    
    /**
     * SALES COMPANY PO NO
     * <br />販売会社PO NO
     */
    private String salesCompPoNo;
    
    /**
     * LAST FIGURE CHG FLAG
     * <br />設変振替フラグ
     */
    private String lastFigureChgFlg;
    
    /**
     * SUPPLIER CODE
     * <br />仕入先コード
     */
    private String supplierCd;
    
    /**
     * SHIPPED TYPE
     * <br />出荷済み区分
     */
    private String shippedTyp;
    
    /**
     * UPDATE TIMESTAMP
     * <br />更新日時
     */
    private Timestamp updateTimestamp;
    
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
     * 品目名称
     */
    private String partName;
    
    /**
     * SHIPPING LOT
     * <br />出荷ロット
     */
    private BigDecimal shippingLot;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String partItem;
    
    /**
     * IGMORE WARMINGS
     * <br />ワーニング無視
     */
    private int ignoreWarnings;
    
    /**
     * ETD DUE MONTH
     * <br />船積期限(月)
     */
    private List<String> month;
    
    /**
     * TOTAL ORDER QUANTITY
     * <br />総注文数量
     */
    private List<BigDecimal> totalQty;
    
    /**
     * FIRM QTY
     * <br />確定注文数量
     */
    private BigDecimal firmQty;
    
    /**
     * FORECAST QTY
     * <br />見込注文数量
     */
    private BigDecimal forecastQty;
    
    /**
     * EXPORT RECEIVE ORDER NUMBER
     * <br />受注情報数
     */
    private int expRcvOdrNum;
    
    /**
     * INDEX
     * <br />インデックス
     */
    private int index;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNoHidden;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNoHidden;
    
    /**
     * PALLETIZE ALLOC QUANTITY
     * <br />梱包引当数量
     */
    private BigDecimal pltzAllocQtyHidden;
    
    /**
     * SALES COMPANY PO NO
     * <br />販売会社PO NO
     */
    private String salesCompPoNoHidden;
    
    /**
     * RECEIVE ORDER COMPANY CODE
     * <br />受注会社コード
     */
    private String rcvOdrCompCdHidden;
    
    /**
     * COMPANY NAME
     * <br />会社名称
     */
    private String compNmHidden;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCdHidden;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipToHidden;
    
    /**
     * SHIP TO NAME
     * <br />送荷先名称
     */
    private String shipToNmHidden;
    
    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNoHidden;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemDescriptionHidden;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCdHidden;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCdHidden;
    
    /**
     * ORDER QUANTITY
     * <br />注文数量
     */
    private BigDecimal odrQtyHidden;
    
    /**
     * SHIPPING DATE
     * <br />出荷予定日
     */
    private Date shippingDtHidden;
    
    /**
     * SHIPPED QUANTITY
     * <br />出荷数量
     */
    private BigDecimal shippedQtyHidden;
    
    /**
     * Customer Order Receiving Domain List
     * <br />Customer Order Receiving ドメインリスト
     */
    private List<? extends WB001OdrRcvDomain> odrRcvDomainList;
    
    /**
     * RECEIVE ORDER COMPANY CODE COUNT
     * <br />受注会社コード　の件数
     */
    private BigDecimal count;
    
    /**
     * 更新件数保存用カウンタ
     */
    private int[] countUpdData;
    
    /**
     * 日付リスト
     */
    private List<Date> dateList;

    /**
     * 稼働日フラグリスト
     */
    private List<String> workDayFlgList;
    
    /**
     * CUSTOMER PART NO.リスト
     */
    private List<String> customerPartNoList;
    
    /**
     * 稼働日フラグ
     */
    private String workDayFlg;
    
//////////////////////////////テスト用に追加 //////////////////////////////
    /**
     * 値出力対象Feildを設定(値はDBカラム形式でカンマ区切りで設定)
     */
    private String chkItems;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001OdrRcvTestDomain() {
    }
//////////////////////////////テスト用に追加 //////////////////////////////
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
     * Getter method for dscNm.
     *
     * @return the dscNm
     */
    public String getDscNm() {
        return dscNm;
    }

    /**
     * Setter method for dscNm.
     *
     * @param dscNm Set for dscNm
     */
    public void setDscNm(String dscNm) {
        this.dscNm = dscNm;
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
     * Getter method for customerItemNoOrg.
     *
     * @return the customerItemNoOrg
     */
    public String getCustomerItemNoOrg() {
        return customerItemNoOrg;
    }

    /**
     * Setter method for customerItemNoOrg.
     *
     * @param customerItemNoOrg Set for customerItemNoOrg
     */
    public void setCustomerItemNoOrg(String customerItemNoOrg) {
        this.customerItemNoOrg = customerItemNoOrg;
    }

    /**
     * Getter method for odrCtrlNo.
     *
     * @return the odrCtrlNo
     */
    public BigDecimal getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * Setter method for odrCtrlNo.
     *
     * @param odrCtrlNo Set for odrCtrlNo
     */
    public void setOdrCtrlNo(BigDecimal odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * Getter method for revisionNo.
     *
     * @return the revisionNo
     */
    public BigDecimal getRevisionNo() {
        return revisionNo;
    }

    /**
     * Setter method for revisionNo.
     *
     * @param revisionNo Set for revisionNo
     */
    public void setRevisionNo(BigDecimal revisionNo) {
        this.revisionNo = revisionNo;
    }

    /**
     * Getter method for revisionNoEis.
     *
     * @return the revisionNoEis
     */
    public BigDecimal getRevisionNoEis() {
        return revisionNoEis;
    }

    /**
     * Setter method for revisionNoEis.
     *
     * @param revisionNoEis Set for revisionNoEis
     */
    public void setRevisionNoEis(BigDecimal revisionNoEis) {
        this.revisionNoEis = revisionNoEis;
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
     * Getter method for itemNoOrg.
     *
     * @return the itemNoOrg
     */
    public String getItemNoOrg() {
        return itemNoOrg;
    }

    /**
     * Setter method for itemNoOrg.
     *
     * @param itemNoOrg Set for itemNoOrg
     */
    public void setItemNoOrg(String itemNoOrg) {
        this.itemNoOrg = itemNoOrg;
    }

    /**
     * Getter method for odrQtyOrg.
     *
     * @return the odrQtyOrg
     */
    public BigDecimal getOdrQtyOrg() {
        return odrQtyOrg;
    }

    /**
     * Setter method for odrQtyOrg.
     *
     * @param odrQtyOrg Set for odrQtyOrg
     */
    public void setOdrQtyOrg(BigDecimal odrQtyOrg) {
        this.odrQtyOrg = odrQtyOrg;
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
     * Getter method for partialDelivCnt.
     *
     * @return the partialDelivCnt
     */
    public BigDecimal getPartialDelivCnt() {
        return partialDelivCnt;
    }

    /**
     * Setter method for partialDelivCnt.
     *
     * @param partialDelivCnt Set for partialDelivCnt
     */
    public void setPartialDelivCnt(BigDecimal partialDelivCnt) {
        this.partialDelivCnt = partialDelivCnt;
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
     * Getter method for lastFigureChgFlg.
     *
     * @return the lastFigureChgFlg
     */
    public String getLastFigureChgFlg() {
        return lastFigureChgFlg;
    }

    /**
     * Setter method for lastFigureChgFlg.
     *
     * @param lastFigureChgFlg Set for lastFigureChgFlg
     */
    public void setLastFigureChgFlg(String lastFigureChgFlg) {
        this.lastFigureChgFlg = lastFigureChgFlg;
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
     * Getter method for shippedTyp.
     *
     * @return the shippedTyp
     */
    public String getShippedTyp() {
        return shippedTyp;
    }

    /**
     * Setter method for shippedTyp.
     *
     * @param shippedTyp Set for shippedTyp
     */
    public void setShippedTyp(String shippedTyp) {
        this.shippedTyp = shippedTyp;
    }

    /**
     * Getter method for updateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param updateTimestamp Set for updateTimestamp
     */
    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
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
     * Getter method for partItem.
     *
     * @return the partItem
     */
    public String getPartItem() {
        return partItem;
    }

    /**
     * Setter method for partItem.
     *
     * @param partItem Set for partItem
     */
    public void setPartItem(String partItem) {
        this.partItem = partItem;
    }

    /**
     * Getter method for ignoreWarnings.
     *
     * @return the ignoreWarnings
     */
    public int getIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Setter method for ignoreWarnings.
     *
     * @param ignoreWarnings Set for ignoreWarnings
     */
    public void setIgnoreWarnings(int ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
    }

    /**
     * Getter method for month.
     *
     * @return the month
     */
    public List<String> getMonth() {
        return month;
    }

    /**
     * Setter method for month.
     *
     * @param month Set for month
     */
    public void setMonth(List<String> month) {
        this.month = month;
    }

    /**
     * Getter method for totalQty.
     *
     * @return the totalQty
     */
    public List<BigDecimal> getTotalQty() {
        return totalQty;
    }

    /**
     * Setter method for totalQty.
     *
     * @param totalQty Set for totalQty
     */
    public void setTotalQty(List<BigDecimal> totalQty) {
        this.totalQty = totalQty;
    }

    /**
     * Getter method for firmQty.
     *
     * @return the firmQty
     */
    public BigDecimal getFirmQty() {
        return firmQty;
    }

    /**
     * Setter method for firmQty.
     *
     * @param firmQty Set for firmQty
     */
    public void setFirmQty(BigDecimal firmQty) {
        this.firmQty = firmQty;
    }

    /**
     * Getter method for forecastQty.
     *
     * @return the forecastQty
     */
    public BigDecimal getForecastQty() {
        return forecastQty;
    }

    /**
     * Setter method for forecastQty.
     *
     * @param forecastQty Set for forecastQty
     */
    public void setForecastQty(BigDecimal forecastQty) {
        this.forecastQty = forecastQty;
    }

    /**
     * Getter method for expRcvOdrNum.
     *
     * @return the expRcvOdrNum
     */
    public int getExpRcvOdrNum() {
        return expRcvOdrNum;
    }

    /**
     * Setter method for expRcvOdrNum.
     *
     * @param expRcvOdrNum Set for expRcvOdrNum
     */
    public void setExpRcvOdrNum(int expRcvOdrNum) {
        this.expRcvOdrNum = expRcvOdrNum;
    }

    /**
     * Getter method for index.
     *
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     *
     * @param index Set for index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Getter method for customerPoNoHidden.
     *
     * @return the customerPoNoHidden
     */
    public String getCustomerPoNoHidden() {
        return customerPoNoHidden;
    }

    /**
     * Setter method for customerPoNoHidden.
     *
     * @param customerPoNoHidden Set for customerPoNoHidden
     */
    public void setCustomerPoNoHidden(String customerPoNoHidden) {
        this.customerPoNoHidden = customerPoNoHidden;
    }

    /**
     * Getter method for customerItemNoHidden.
     *
     * @return the customerItemNoHidden
     */
    public String getCustomerItemNoHidden() {
        return customerItemNoHidden;
    }

    /**
     * Setter method for customerItemNoHidden.
     *
     * @param customerItemNoHidden Set for customerItemNoHidden
     */
    public void setCustomerItemNoHidden(String customerItemNoHidden) {
        this.customerItemNoHidden = customerItemNoHidden;
    }

    /**
     * Getter method for pltzAllocQtyHidden.
     *
     * @return the pltzAllocQtyHidden
     */
    public BigDecimal getPltzAllocQtyHidden() {
        return pltzAllocQtyHidden;
    }

    /**
     * Setter method for pltzAllocQtyHidden.
     *
     * @param pltzAllocQtyHidden Set for pltzAllocQtyHidden
     */
    public void setPltzAllocQtyHidden(BigDecimal pltzAllocQtyHidden) {
        this.pltzAllocQtyHidden = pltzAllocQtyHidden;
    }

    /**
     * Getter method for salesCompPoNoHidden.
     *
     * @return the salesCompPoNoHidden
     */
    public String getSalesCompPoNoHidden() {
        return salesCompPoNoHidden;
    }

    /**
     * Setter method for salesCompPoNoHidden.
     *
     * @param salesCompPoNoHidden Set for salesCompPoNoHidden
     */
    public void setSalesCompPoNoHidden(String salesCompPoNoHidden) {
        this.salesCompPoNoHidden = salesCompPoNoHidden;
    }

    /**
     * Getter method for rcvOdrCompCdHidden.
     *
     * @return the rcvOdrCompCdHidden
     */
    public String getRcvOdrCompCdHidden() {
        return rcvOdrCompCdHidden;
    }

    /**
     * Setter method for rcvOdrCompCdHidden.
     *
     * @param rcvOdrCompCdHidden Set for rcvOdrCompCdHidden
     */
    public void setRcvOdrCompCdHidden(String rcvOdrCompCdHidden) {
        this.rcvOdrCompCdHidden = rcvOdrCompCdHidden;
    }

    /**
     * Getter method for compNmHidden.
     *
     * @return the compNmHidden
     */
    public String getCompNmHidden() {
        return compNmHidden;
    }

    /**
     * Setter method for compNmHidden.
     *
     * @param compNmHidden Set for compNmHidden
     */
    public void setCompNmHidden(String compNmHidden) {
        this.compNmHidden = compNmHidden;
    }

    /**
     * Getter method for customerCdHidden.
     *
     * @return the customerCdHidden
     */
    public String getCustomerCdHidden() {
        return customerCdHidden;
    }

    /**
     * Setter method for customerCdHidden.
     *
     * @param customerCdHidden Set for customerCdHidden
     */
    public void setCustomerCdHidden(String customerCdHidden) {
        this.customerCdHidden = customerCdHidden;
    }

    /**
     * Getter method for lgcyShipToHidden.
     *
     * @return the lgcyShipToHidden
     */
    public String getLgcyShipToHidden() {
        return lgcyShipToHidden;
    }

    /**
     * Setter method for lgcyShipToHidden.
     *
     * @param lgcyShipToHidden Set for lgcyShipToHidden
     */
    public void setLgcyShipToHidden(String lgcyShipToHidden) {
        this.lgcyShipToHidden = lgcyShipToHidden;
    }

    /**
     * Getter method for shipToNmHidden.
     *
     * @return the shipToNmHidden
     */
    public String getShipToNmHidden() {
        return shipToNmHidden;
    }

    /**
     * Setter method for shipToNmHidden.
     *
     * @param shipToNmHidden Set for shipToNmHidden
     */
    public void setShipToNmHidden(String shipToNmHidden) {
        this.shipToNmHidden = shipToNmHidden;
    }

    /**
     * Getter method for itemNoHidden.
     *
     * @return the itemNoHidden
     */
    public String getItemNoHidden() {
        return itemNoHidden;
    }

    /**
     * Setter method for itemNoHidden.
     *
     * @param itemNoHidden Set for itemNoHidden
     */
    public void setItemNoHidden(String itemNoHidden) {
        this.itemNoHidden = itemNoHidden;
    }

    /**
     * Getter method for itemDescriptionHidden.
     *
     * @return the itemDescriptionHidden
     */
    public String getItemDescriptionHidden() {
        return itemDescriptionHidden;
    }

    /**
     * Setter method for itemDescriptionHidden.
     *
     * @param itemDescriptionHidden Set for itemDescriptionHidden
     */
    public void setItemDescriptionHidden(String itemDescriptionHidden) {
        this.itemDescriptionHidden = itemDescriptionHidden;
    }

    /**
     * Getter method for pkgCdHidden.
     *
     * @return the pkgCdHidden
     */
    public String getPkgCdHidden() {
        return pkgCdHidden;
    }

    /**
     * Setter method for pkgCdHidden.
     *
     * @param pkgCdHidden Set for pkgCdHidden
     */
    public void setPkgCdHidden(String pkgCdHidden) {
        this.pkgCdHidden = pkgCdHidden;
    }

    /**
     * Getter method for trnsCdHidden.
     *
     * @return the trnsCdHidden
     */
    public String getTrnsCdHidden() {
        return trnsCdHidden;
    }

    /**
     * Setter method for trnsCdHidden.
     *
     * @param trnsCdHidden Set for trnsCdHidden
     */
    public void setTrnsCdHidden(String trnsCdHidden) {
        this.trnsCdHidden = trnsCdHidden;
    }

    /**
     * Getter method for odrQtyHidden.
     *
     * @return the odrQtyHidden
     */
    public BigDecimal getOdrQtyHidden() {
        return odrQtyHidden;
    }

    /**
     * Setter method for odrQtyHidden.
     *
     * @param odrQtyHidden Set for odrQtyHidden
     */
    public void setOdrQtyHidden(BigDecimal odrQtyHidden) {
        this.odrQtyHidden = odrQtyHidden;
    }

    /**
     * Getter method for shippingDtHidden.
     *
     * @return the shippingDtHidden
     */
    public Date getShippingDtHidden() {
        return shippingDtHidden;
    }

    /**
     * Setter method for shippingDtHidden.
     *
     * @param shippingDtHidden Set for shippingDtHidden
     */
    public void setShippingDtHidden(Date shippingDtHidden) {
        this.shippingDtHidden = shippingDtHidden;
    }

    /**
     * Getter method for shippedQtyHidden.
     *
     * @return the shippedQtyHidden
     */
    public BigDecimal getShippedQtyHidden() {
        return shippedQtyHidden;
    }

    /**
     * Setter method for shippedQtyHidden.
     *
     * @param shippedQtyHidden Set for shippedQtyHidden
     */
    public void setShippedQtyHidden(BigDecimal shippedQtyHidden) {
        this.shippedQtyHidden = shippedQtyHidden;
    }

    /**
     * Getter method for odrRcvDomainList.
     *
     * @return the odrRcvDomainList
     */
    public List<? extends WB001OdrRcvDomain> getOdrRcvDomainList() {
        return odrRcvDomainList;
    }

    /**
     * Setter method for odrRcvDomainList.
     *
     * @param odrRcvDomainList Set for odrRcvDomainList
     */
    public void setOdrRcvDomainList(
        List<? extends WB001OdrRcvDomain> odrRcvDomainList) {
        this.odrRcvDomainList = odrRcvDomainList;
    }

    /**
     * Getter method for count.
     *
     * @return the count
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * Setter method for count.
     *
     * @param count Set for count
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
     * Getter method for countUpdData.
     *
     * @return the countUpdData
     */
    public int[] getCountUpdData() {
        return countUpdData;
    }

    /**
     * Setter method for countUpdData.
     *
     * @param countUpdData Set for countUpdData
     */
    public void setCountUpdData(int[] countUpdData) {
        this.countUpdData = countUpdData;
    }

    /**
     * Getter method for dateList.
     *
     * @return the dateList
     */
    public List<Date> getDateList() {
        return dateList;
    }

    /**
     * Setter method for dateList.
     *
     * @param dateList Set for dateList
     */
    public void setDateList(List<Date> dateList) {
        this.dateList = dateList;
    }

    /**
     * Getter method for workDayFlgList.
     *
     * @return the workDayFlgList
     */
    public List<String> getWorkDayFlgList() {
        return workDayFlgList;
    }

    /**
     * Setter method for workDayFlgList.
     *
     * @param workDayFlgList Set for workDayFlgList
     */
    public void setWorkDayFlgList(List<String> workDayFlgList) {
        this.workDayFlgList = workDayFlgList;
    }

    /**
     * Getter method for customerPartNoList.
     *
     * @return the customerPartNoList
     */
    public List<String> getCustomerPartNoList() {
        return customerPartNoList;
    }

    /**
     * Setter method for customerPartNoList.
     *
     * @param customerPartNoList Set for customerPartNoList
     */
    public void setCustomerPartNoList(List<String> customerPartNoList) {
        this.customerPartNoList = customerPartNoList;
    }

    /**
     * Getter method for workDayFlg.
     *
     * @return the workDayFlg
     */
    public String getWorkDayFlg() {
        return workDayFlg;
    }

    /**
     * Setter method for workDayFlg.
     *
     * @param workDayFlg Set for workDayFlg
     */
    public void setWorkDayFlg(String workDayFlg) {
        this.workDayFlg = workDayFlg;
    }
    
////////////////////////////// テスト用に追加 //////////////////////////////
    /**
     * Getter method for chkItems.
     *
     * @return the chkItems
     */
    public String getChkItems() {
        return chkItems;
    }
    /**
     * Setter method for chkItems.
     *
     * @param chkItems Set for chkItems
     */
    public void setChkItems(String chkItems) {
        this.chkItems = chkItems;
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat stf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        boolean firstTimeFlg = true;
        StringBuilder sb = new StringBuilder();
        
        String[] members = chkItems.split(",");
        for (String member : members) {
            String name = convertCamelString(member);
            Object value = new Object();
            
            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (name.equals(field.getName())){
                    try {
                        field.setAccessible(true);
                        
                        if (field.get(this) == null){
                        
                        } else if ("java.util.Date".equals(field.getType().getName())){
                            value =  sdf.format(field.get(this));
                        } else if("java.sql.Timestamp".equals(field.getType().getName())){
                            value =  stf.format(field.get(this));
                        } else {
                            value = field.get(this);
                        }
                        break;
                    } catch (IllegalAccessException e) {
                        value = "IllegalAccessException";
                        break;
                    } catch (Exception e) {
                        value = "Exception";
                        break;
                    }
                }
            }
            if (firstTimeFlg){
                if (value != null) {
                    sb.append(value);
                }
                firstTimeFlg = false;
            } else {
                sb.append(",");
                if (value != null){
                    sb.append(value);
                }
            }
        }
        return sb.toString();
    }
    
    /**
     * <br />DBカラム形式の文字列をキャメル形式の文字列に変換します。
     *
     * @param feildName フィールド名
     * @return フィールド名(キャメル形式)
     */
    private String convertCamelString(String feildName){
        StringBuilder sb = new StringBuilder();
        
        String[] varvels = feildName.split("_");
        sb.append(varvels[0].toLowerCase());
        
        for (int i = 1; i < varvels.length; i++){
            sb.append(varvels[i].substring(0, 1).toUpperCase() + varvels[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
