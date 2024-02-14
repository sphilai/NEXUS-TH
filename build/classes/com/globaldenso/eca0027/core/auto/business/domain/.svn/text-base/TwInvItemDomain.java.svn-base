/*
 * PROJECT：eca0027
 * 
 * TwInvItem のDomainクラス
 * テーブル概要：Invoice Item No Work/インボイス作成対象品目番号ワーク  Work table for creating Invoice created for information in Part shopping basket system/買い物かご方式でInvoice作成対象品番情報を作成するためのワークテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/09/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TwInvItem のDomainクラスです。<BR>
 * テーブル概要：Invoice Item No Work/インボイス作成対象品目番号ワーク  Work table for creating Invoice created for information in Part shopping basket system/買い物かご方式でInvoice作成対象品番情報を作成するためのワークテーブル<BR>
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
public class TwInvItemDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * MAIN MARK/メインマーク
     */
    private String mainMark;

    /**
     * BRANCH/枝番
     */
    private BigDecimal brch;

    /**
     * SORT ORDER/並び順
     */
    private BigDecimal sortOdr;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous
     */
    private String cmlTyp;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not
     */
    private String rtFlg;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not
     */
    private String kitFlg;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。
     */
    private String customerItemNo;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。
     */
    private String itemNo;

    /**
     * PACKAGE CODE/包装区分
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
     * CURRENCY CODE/通貨コード
     */
    private String currCd;

    /**
     * UNIT PRICE/単価
     */
    private BigDecimal unitPrice;

    /**
     * QUANTITY UNIT/数量単位
     */
    private String qtyUnit;

    /**
     * QUANTITY/数量
     */
    private BigDecimal qty;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * ITEM WEIGHT/製品重量
     */
    private BigDecimal itemWeight;

    /**
     * NET WEIGHT/ネット重量
     */
    private BigDecimal netWeight;

    /**
     * HS CODE/HSコード
     */
    private String hsCd;

    /**
     * ORIGIN COUNTRY CODE/原産国コード
     */
    private String originCntryCd;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not
     */
    private String free1RegFlg;

    /**
     * FREE 1 NAME/フリー1名称
     */
    private String free1Nm;

    /**
     * FREE 1 DETAIL/フリー1内容
     */
    private String free1Dtl;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free1OriginCntryFlg;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not
     */
    private String free2RegFlg;

    /**
     * FREE 2 NAME/フリー2名称
     */
    private String free2Nm;

    /**
     * FREE 2 DETAIL/フリー2内容
     */
    private String free2Dtl;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free2OriginCntryFlg;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not
     */
    private String free3RegFlg;

    /**
     * FREE 3 NAME/フリー3名称
     */
    private String free3Nm;

    /**
     * FREE 3 DETAIL/フリー3内容
     */
    private String free3Dtl;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free3OriginCntryFlg;

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
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。
     */
    private String grpNo1;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。
     */
    private String grpNo2;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not
     */
    private String removeFlg;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not
     */
    private String decisionFlg;

    /**
     * TEMP INVOICE NO/仮インボイスNO
     */
    private String tempInvoiceNo;

    /**
     * INVOICE NO/インボイスNO
     */
    private String invoiceNo;

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
    public TwInvItemDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * brch のゲッターメソッドです。
     * 
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * brch のセッターメソッドです。
     * 
     * @param brch brch に設定する
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
    }

    /**
     * sortOdr のゲッターメソッドです。
     * 
     * @return the sortOdr
     */
    public BigDecimal getSortOdr() {
        return sortOdr;
    }

    /**
     * sortOdr のセッターメソッドです。
     * 
     * @param sortOdr sortOdr に設定する
     */
    public void setSortOdr(BigDecimal sortOdr) {
        this.sortOdr = sortOdr;
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
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * rtFlg のゲッターメソッドです。
     * 
     * @return the rtFlg
     */
    public String getRtFlg() {
        return rtFlg;
    }

    /**
     * rtFlg のセッターメソッドです。
     * 
     * @param rtFlg rtFlg に設定する
     */
    public void setRtFlg(String rtFlg) {
        this.rtFlg = rtFlg;
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
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
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
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * itemWeight のゲッターメソッドです。
     * 
     * @return the itemWeight
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * itemWeight のセッターメソッドです。
     * 
     * @param itemWeight itemWeight に設定する
     */
    public void setItemWeight(BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
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
     * free1RegFlg のゲッターメソッドです。
     * 
     * @return the free1RegFlg
     */
    public String getFree1RegFlg() {
        return free1RegFlg;
    }

    /**
     * free1RegFlg のセッターメソッドです。
     * 
     * @param free1RegFlg free1RegFlg に設定する
     */
    public void setFree1RegFlg(String free1RegFlg) {
        this.free1RegFlg = free1RegFlg;
    }

    /**
     * free1Nm のゲッターメソッドです。
     * 
     * @return the free1Nm
     */
    public String getFree1Nm() {
        return free1Nm;
    }

    /**
     * free1Nm のセッターメソッドです。
     * 
     * @param free1Nm free1Nm に設定する
     */
    public void setFree1Nm(String free1Nm) {
        this.free1Nm = free1Nm;
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
     * free1OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlg
     */
    public String getFree1OriginCntryFlg() {
        return free1OriginCntryFlg;
    }

    /**
     * free1OriginCntryFlg のセッターメソッドです。
     * 
     * @param free1OriginCntryFlg free1OriginCntryFlg に設定する
     */
    public void setFree1OriginCntryFlg(String free1OriginCntryFlg) {
        this.free1OriginCntryFlg = free1OriginCntryFlg;
    }

    /**
     * free2RegFlg のゲッターメソッドです。
     * 
     * @return the free2RegFlg
     */
    public String getFree2RegFlg() {
        return free2RegFlg;
    }

    /**
     * free2RegFlg のセッターメソッドです。
     * 
     * @param free2RegFlg free2RegFlg に設定する
     */
    public void setFree2RegFlg(String free2RegFlg) {
        this.free2RegFlg = free2RegFlg;
    }

    /**
     * free2Nm のゲッターメソッドです。
     * 
     * @return the free2Nm
     */
    public String getFree2Nm() {
        return free2Nm;
    }

    /**
     * free2Nm のセッターメソッドです。
     * 
     * @param free2Nm free2Nm に設定する
     */
    public void setFree2Nm(String free2Nm) {
        this.free2Nm = free2Nm;
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
     * free2OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlg
     */
    public String getFree2OriginCntryFlg() {
        return free2OriginCntryFlg;
    }

    /**
     * free2OriginCntryFlg のセッターメソッドです。
     * 
     * @param free2OriginCntryFlg free2OriginCntryFlg に設定する
     */
    public void setFree2OriginCntryFlg(String free2OriginCntryFlg) {
        this.free2OriginCntryFlg = free2OriginCntryFlg;
    }

    /**
     * free3RegFlg のゲッターメソッドです。
     * 
     * @return the free3RegFlg
     */
    public String getFree3RegFlg() {
        return free3RegFlg;
    }

    /**
     * free3RegFlg のセッターメソッドです。
     * 
     * @param free3RegFlg free3RegFlg に設定する
     */
    public void setFree3RegFlg(String free3RegFlg) {
        this.free3RegFlg = free3RegFlg;
    }

    /**
     * free3Nm のゲッターメソッドです。
     * 
     * @return the free3Nm
     */
    public String getFree3Nm() {
        return free3Nm;
    }

    /**
     * free3Nm のセッターメソッドです。
     * 
     * @param free3Nm free3Nm に設定する
     */
    public void setFree3Nm(String free3Nm) {
        this.free3Nm = free3Nm;
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
     * free3OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlg
     */
    public String getFree3OriginCntryFlg() {
        return free3OriginCntryFlg;
    }

    /**
     * free3OriginCntryFlg のセッターメソッドです。
     * 
     * @param free3OriginCntryFlg free3OriginCntryFlg に設定する
     */
    public void setFree3OriginCntryFlg(String free3OriginCntryFlg) {
        this.free3OriginCntryFlg = free3OriginCntryFlg;
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
     * grpNo1 のゲッターメソッドです。
     * 
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * grpNo1 のセッターメソッドです。
     * 
     * @param grpNo1 grpNo1 に設定する
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * grpNo2 のゲッターメソッドです。
     * 
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * grpNo2 のセッターメソッドです。
     * 
     * @param grpNo2 grpNo2 に設定する
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
    }

    /**
     * removeFlg のゲッターメソッドです。
     * 
     * @return the removeFlg
     */
    public String getRemoveFlg() {
        return removeFlg;
    }

    /**
     * removeFlg のセッターメソッドです。
     * 
     * @param removeFlg removeFlg に設定する
     */
    public void setRemoveFlg(String removeFlg) {
        this.removeFlg = removeFlg;
    }

    /**
     * decisionFlg のゲッターメソッドです。
     * 
     * @return the decisionFlg
     */
    public String getDecisionFlg() {
        return decisionFlg;
    }

    /**
     * decisionFlg のセッターメソッドです。
     * 
     * @param decisionFlg decisionFlg に設定する
     */
    public void setDecisionFlg(String decisionFlg) {
        this.decisionFlg = decisionFlg;
    }

    /**
     * tempInvoiceNo のゲッターメソッドです。
     * 
     * @return the tempInvoiceNo
     */
    public String getTempInvoiceNo() {
        return tempInvoiceNo;
    }

    /**
     * tempInvoiceNo のセッターメソッドです。
     * 
     * @param tempInvoiceNo tempInvoiceNo に設定する
     */
    public void setTempInvoiceNo(String tempInvoiceNo) {
        this.tempInvoiceNo = tempInvoiceNo;
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
