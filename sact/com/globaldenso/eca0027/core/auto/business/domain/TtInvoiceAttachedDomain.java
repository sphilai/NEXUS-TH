/*
 * PROJECT：eca0027
 * 
 * TtInvoiceAttached のDomainクラス
 * テーブル概要：Invoice Attached/インボイスアタッチ  Table that contains the detail information that is output to the attached form of Invoice. The underlying information to be global coordination document sharing ./Invoiceの添付帳票に出力される明細情報を格納するテーブル。グローバル書類共有に連携する元情報となる。
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/09/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtInvoiceAttached のDomainクラスです。<BR>
 * テーブル概要：Invoice Attached/インボイスアタッチ  Table that contains the detail information that is output to the attached form of Invoice. The underlying information to be global coordination document sharing ./Invoiceの添付帳票に出力される明細情報を格納するテーブル。グローバル書類共有に連携する元情報となる。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/09/22 16:37:13<BR>
 * 
 * テーブル定義から2015/09/22に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12132 $
 */
public class TtInvoiceAttachedDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * INVOICE NO/インボイスNO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE/インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * RECORD NO/レコード番号
     */
    private BigDecimal recordNo;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT
     */
    private String invoiceClass;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel
     */
    private String cancelTyp;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。
     */
    private String customerItemNo;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。
     */
    private String itemNo;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。
     */
    private String pkgCd;

    /**
     * ITEM DESCRIPTION/品目名称
     */
    private String itemDescription;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。
     */
    private String modelCd;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not
     */
    private String kitFlg;

    /**
     * EXPORT REQUEST NO/輸出依頼NO
     */
    private String expRequestNo;

    /**
     * LINE NO/ライン番号
     */
    private BigDecimal lineNo;

    /**
     * KIT BRANCH/KIT品枝番
     */
    private BigDecimal kitBrch;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item
     */
    private String parFlg;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号
     */
    private String kitParItemNo;

    /**
     * ORIGIN COUNTRY CODE/原産国コード
     */
    private String originCntryCd;

    /**
     * ORIGIN COUNTRY NAME/原産国名
     */
    private String originCntryNm;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。
     */
    private String free1Dtl;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。
     */
    private String free2Dtl;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。
     */
    private String free3Dtl;

    /**
     * HS CODE/HSコード
     */
    private String hsCd;

    /**
     * UNIT PRICE/単価
     */
    private BigDecimal unitPrice;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨
     */
    private String unitPriceCurrCd;

    /**
     * QUANTITY/数量
     */
    private BigDecimal qty;

    /**
     * QUANTITY UNIT/数量単位
     */
    private String qtyUnit;

    /**
     * AMOUNT/合計金額  品目番号ごとの合計金額
     */
    private BigDecimal amount;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨
     */
    private String amountCurrCd;

    /**
     * NET WEIGHT/ネット重量
     */
    private BigDecimal netWeight;

    /**
     * NET WEIGHT UNIT/ネット重量単位
     */
    private String netWeightUnit;

    /**
     * TOTAL NET WEIGHT/ネット総重量
     */
    private BigDecimal totalNetWeight;

    /**
     * TOTAL NET WEIGHT UNIT/ネット総重量_単位
     */
    private String totalNetWeightUnit;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり
     */
    private String lengthUnit;

    /**
     * LENGTH/縦  RT材のみ入力あり
     */
    private BigDecimal length;

    /**
     * WIDTH/横  RT材のみ入力あり
     */
    private BigDecimal width;

    /**
     * HEIGHT/高さ  RT材のみ入力あり
     */
    private BigDecimal height;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted
     */
    private String deleteFlg;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceAttachedDomain() {
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * invoiceNo のゲッターメソッドです。
     * 
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * invoiceNo のセッターメソッドです。
     * 
     * @param invoiceNo invoiceNo に設定する
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * invoiceIssueDt のゲッターメソッドです。
     * 
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * invoiceIssueDt のセッターメソッドです。
     * 
     * @param invoiceIssueDt invoiceIssueDt に設定する
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * recordNo のゲッターメソッドです。
     * 
     * @return the recordNo
     */
    public BigDecimal getRecordNo() {
        return recordNo;
    }

    /**
     * recordNo のセッターメソッドです。
     * 
     * @param recordNo recordNo に設定する
     */
    public void setRecordNo(BigDecimal recordNo) {
        this.recordNo = recordNo;
    }

    /**
     * invoiceClass のゲッターメソッドです。
     * 
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * invoiceClass のセッターメソッドです。
     * 
     * @param invoiceClass invoiceClass に設定する
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * cancelTyp のゲッターメソッドです。
     * 
     * @return the cancelTyp
     */
    public String getCancelTyp() {
        return cancelTyp;
    }

    /**
     * cancelTyp のセッターメソッドです。
     * 
     * @param cancelTyp cancelTyp に設定する
     */
    public void setCancelTyp(String cancelTyp) {
        this.cancelTyp = cancelTyp;
    }

    /**
     * customerPoNo のゲッターメソッドです。
     * 
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * customerPoNo のセッターメソッドです。
     * 
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * itemNo のゲッターメソッドです。
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo のセッターメソッドです。
     * 
     * @param itemNo itemNo に設定する
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * pkgCd のゲッターメソッドです。
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * pkgCd のセッターメソッドです。
     * 
     * @param pkgCd pkgCd に設定する
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * itemDescription のゲッターメソッドです。
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription のセッターメソッドです。
     * 
     * @param itemDescription itemDescription に設定する
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * modelCd のゲッターメソッドです。
     * 
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * modelCd のセッターメソッドです。
     * 
     * @param modelCd modelCd に設定する
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * kitFlg のゲッターメソッドです。
     * 
     * @return the kitFlg
     */
    public String getKitFlg() {
        return kitFlg;
    }

    /**
     * kitFlg のセッターメソッドです。
     * 
     * @param kitFlg kitFlg に設定する
     */
    public void setKitFlg(String kitFlg) {
        this.kitFlg = kitFlg;
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * lineNo のゲッターメソッドです。
     * 
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * lineNo のセッターメソッドです。
     * 
     * @param lineNo lineNo に設定する
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * kitBrch のゲッターメソッドです。
     * 
     * @return the kitBrch
     */
    public BigDecimal getKitBrch() {
        return kitBrch;
    }

    /**
     * kitBrch のセッターメソッドです。
     * 
     * @param kitBrch kitBrch に設定する
     */
    public void setKitBrch(BigDecimal kitBrch) {
        this.kitBrch = kitBrch;
    }

    /**
     * parFlg のゲッターメソッドです。
     * 
     * @return the parFlg
     */
    public String getParFlg() {
        return parFlg;
    }

    /**
     * parFlg のセッターメソッドです。
     * 
     * @param parFlg parFlg に設定する
     */
    public void setParFlg(String parFlg) {
        this.parFlg = parFlg;
    }

    /**
     * kitParItemNo のゲッターメソッドです。
     * 
     * @return the kitParItemNo
     */
    public String getKitParItemNo() {
        return kitParItemNo;
    }

    /**
     * kitParItemNo のセッターメソッドです。
     * 
     * @param kitParItemNo kitParItemNo に設定する
     */
    public void setKitParItemNo(String kitParItemNo) {
        this.kitParItemNo = kitParItemNo;
    }

    /**
     * originCntryCd のゲッターメソッドです。
     * 
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * originCntryCd のセッターメソッドです。
     * 
     * @param originCntryCd originCntryCd に設定する
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * originCntryNm のゲッターメソッドです。
     * 
     * @return the originCntryNm
     */
    public String getOriginCntryNm() {
        return originCntryNm;
    }

    /**
     * originCntryNm のセッターメソッドです。
     * 
     * @param originCntryNm originCntryNm に設定する
     */
    public void setOriginCntryNm(String originCntryNm) {
        this.originCntryNm = originCntryNm;
    }

    /**
     * free1Dtl のゲッターメソッドです。
     * 
     * @return the free1Dtl
     */
    public String getFree1Dtl() {
        return free1Dtl;
    }

    /**
     * free1Dtl のセッターメソッドです。
     * 
     * @param free1Dtl free1Dtl に設定する
     */
    public void setFree1Dtl(String free1Dtl) {
        this.free1Dtl = free1Dtl;
    }

    /**
     * free2Dtl のゲッターメソッドです。
     * 
     * @return the free2Dtl
     */
    public String getFree2Dtl() {
        return free2Dtl;
    }

    /**
     * free2Dtl のセッターメソッドです。
     * 
     * @param free2Dtl free2Dtl に設定する
     */
    public void setFree2Dtl(String free2Dtl) {
        this.free2Dtl = free2Dtl;
    }

    /**
     * free3Dtl のゲッターメソッドです。
     * 
     * @return the free3Dtl
     */
    public String getFree3Dtl() {
        return free3Dtl;
    }

    /**
     * free3Dtl のセッターメソッドです。
     * 
     * @param free3Dtl free3Dtl に設定する
     */
    public void setFree3Dtl(String free3Dtl) {
        this.free3Dtl = free3Dtl;
    }

    /**
     * hsCd のゲッターメソッドです。
     * 
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * hsCd のセッターメソッドです。
     * 
     * @param hsCd hsCd に設定する
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * unitPrice のゲッターメソッドです。
     * 
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice のセッターメソッドです。
     * 
     * @param unitPrice unitPrice に設定する
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * unitPriceCurrCd のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCd
     */
    public String getUnitPriceCurrCd() {
        return unitPriceCurrCd;
    }

    /**
     * unitPriceCurrCd のセッターメソッドです。
     * 
     * @param unitPriceCurrCd unitPriceCurrCd に設定する
     */
    public void setUnitPriceCurrCd(String unitPriceCurrCd) {
        this.unitPriceCurrCd = unitPriceCurrCd;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * qtyUnit のゲッターメソッドです。
     * 
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * qtyUnit のセッターメソッドです。
     * 
     * @param qtyUnit qtyUnit に設定する
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * amount のゲッターメソッドです。
     * 
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * amount のセッターメソッドです。
     * 
     * @param amount amount に設定する
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * amountCurrCd のゲッターメソッドです。
     * 
     * @return the amountCurrCd
     */
    public String getAmountCurrCd() {
        return amountCurrCd;
    }

    /**
     * amountCurrCd のセッターメソッドです。
     * 
     * @param amountCurrCd amountCurrCd に設定する
     */
    public void setAmountCurrCd(String amountCurrCd) {
        this.amountCurrCd = amountCurrCd;
    }

    /**
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * netWeightUnit のゲッターメソッドです。
     * 
     * @return the netWeightUnit
     */
    public String getNetWeightUnit() {
        return netWeightUnit;
    }

    /**
     * netWeightUnit のセッターメソッドです。
     * 
     * @param netWeightUnit netWeightUnit に設定する
     */
    public void setNetWeightUnit(String netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }

    /**
     * totalNetWeight のゲッターメソッドです。
     * 
     * @return the totalNetWeight
     */
    public BigDecimal getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * totalNetWeight のセッターメソッドです。
     * 
     * @param totalNetWeight totalNetWeight に設定する
     */
    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * totalNetWeightUnit のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnit
     */
    public String getTotalNetWeightUnit() {
        return totalNetWeightUnit;
    }

    /**
     * totalNetWeightUnit のセッターメソッドです。
     * 
     * @param totalNetWeightUnit totalNetWeightUnit に設定する
     */
    public void setTotalNetWeightUnit(String totalNetWeightUnit) {
        this.totalNetWeightUnit = totalNetWeightUnit;
    }

    /**
     * lengthUnit のゲッターメソッドです。
     * 
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * lengthUnit のセッターメソッドです。
     * 
     * @param lengthUnit lengthUnit に設定する
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * length のゲッターメソッドです。
     * 
     * @return the length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * length のセッターメソッドです。
     * 
     * @param length length に設定する
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * width のゲッターメソッドです。
     * 
     * @return the width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * width のセッターメソッドです。
     * 
     * @param width width に設定する
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * height のゲッターメソッドです。
     * 
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * height のセッターメソッドです。
     * 
     * @param height height に設定する
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * deleteFlg のゲッターメソッドです。
     * 
     * @return the deleteFlg
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * deleteFlg のセッターメソッドです。
     * 
     * @param deleteFlg deleteFlg に設定する
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

}
