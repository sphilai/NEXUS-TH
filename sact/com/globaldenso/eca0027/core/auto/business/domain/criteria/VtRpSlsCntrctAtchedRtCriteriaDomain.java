/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctAtchedRt の検索条件Domainクラス
 * テーブル概要：VT_RP_SLS_CNTRCT_ATCHED_RT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/09/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * VtRpSlsCntrctAtchedRt の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_SLS_CNTRCT_ATCHED_RT<BR>
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
public class VtRpSlsCntrctAtchedRtCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * INVOICE_NO
     */
    private String invoiceNo;

    /**
     * INVOICE_ISSUE_DT
     */
    private Date invoiceIssueDt;

    /**
     * INV_TPL_NO
     */
    private String invTplNo;

    /**
     * NET_AMOUNT
     */
    private BigDecimal netAmount;

    /**
     * NET_AMOUNT_CURR_CD
     */
    private String netAmountCurrCd;

    /**
     * FREE_1_COL_NM
     */
    private String free1ColNm;

    /**
     * FREE_2_COL_NM
     */
    private String free2ColNm;

    /**
     * FREE_3_COL_NM
     */
    private String free3ColNm;

    /**
     * FREE_4_COL_NM
     */
    private String free4ColNm;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * ITEM_DESCRIPTION
     */
    private String itemDescription;

    /**
     * MODEL_CD
     */
    private String modelCd;

    /**
     * ORIGIN_CNTRY_NM
     */
    private String originCntryNm;

    /**
     * FREE_1_DTL
     */
    private String free1Dtl;

    /**
     * FREE_2_DTL
     */
    private String free2Dtl;

    /**
     * FREE_3_DTL
     */
    private String free3Dtl;

    /**
     * HS_CD
     */
    private String hsCd;

    /**
     * UNIT_PRICE
     */
    private BigDecimal unitPrice;

    /**
     * UNIT_PRICE_CURR_CD
     */
    private String unitPriceCurrCd;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * QTY_UNIT
     */
    private String qtyUnit;

    /**
     * AMOUNT
     */
    private BigDecimal amount;

    /**
     * LENGTH_UNIT
     */
    private String lengthUnit;

    /**
     * LENGTH
     */
    private BigDecimal length;

    /**
     * WIDTH
     */
    private BigDecimal width;

    /**
     * HEIGHT
     */
    private BigDecimal height;

    /**
     * SHIPPER_CD（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER_CD（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER_CD（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER_CD（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER_CD（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * INVOICE_NO（大なり）
     */
    private String invoiceNoGreaterThan;

    /**
     * INVOICE_NO（大なりイコール）
     */
    private String invoiceNoGreaterThanEqual;

    /**
     * INVOICE_NO（小なり）
     */
    private String invoiceNoLessThan;

    /**
     * INVOICE_NO（小なりイコール）
     */
    private String invoiceNoLessThanEqual;

    /**
     * INVOICE_NO（前方一致）
     */
    private String invoiceNoLikeFront;

    /**
     * INVOICE_ISSUE_DT（大なりイコール）
     */
    private Date invoiceIssueDtGreaterThanEqual;

    /**
     * INVOICE_ISSUE_DT（小なりイコール）
     */
    private Date invoiceIssueDtLessThanEqual;

    /**
     * INV_TPL_NO（大なり）
     */
    private String invTplNoGreaterThan;

    /**
     * INV_TPL_NO（大なりイコール）
     */
    private String invTplNoGreaterThanEqual;

    /**
     * INV_TPL_NO（小なり）
     */
    private String invTplNoLessThan;

    /**
     * INV_TPL_NO（小なりイコール）
     */
    private String invTplNoLessThanEqual;

    /**
     * INV_TPL_NO（前方一致）
     */
    private String invTplNoLikeFront;

    /**
     * NET_AMOUNT_CURR_CD（大なり）
     */
    private String netAmountCurrCdGreaterThan;

    /**
     * NET_AMOUNT_CURR_CD（大なりイコール）
     */
    private String netAmountCurrCdGreaterThanEqual;

    /**
     * NET_AMOUNT_CURR_CD（小なり）
     */
    private String netAmountCurrCdLessThan;

    /**
     * NET_AMOUNT_CURR_CD（小なりイコール）
     */
    private String netAmountCurrCdLessThanEqual;

    /**
     * NET_AMOUNT_CURR_CD（前方一致）
     */
    private String netAmountCurrCdLikeFront;

    /**
     * FREE_1_COL_NM（大なり）
     */
    private String free1ColNmGreaterThan;

    /**
     * FREE_1_COL_NM（大なりイコール）
     */
    private String free1ColNmGreaterThanEqual;

    /**
     * FREE_1_COL_NM（小なり）
     */
    private String free1ColNmLessThan;

    /**
     * FREE_1_COL_NM（小なりイコール）
     */
    private String free1ColNmLessThanEqual;

    /**
     * FREE_1_COL_NM（前方一致）
     */
    private String free1ColNmLikeFront;

    /**
     * FREE_2_COL_NM（大なり）
     */
    private String free2ColNmGreaterThan;

    /**
     * FREE_2_COL_NM（大なりイコール）
     */
    private String free2ColNmGreaterThanEqual;

    /**
     * FREE_2_COL_NM（小なり）
     */
    private String free2ColNmLessThan;

    /**
     * FREE_2_COL_NM（小なりイコール）
     */
    private String free2ColNmLessThanEqual;

    /**
     * FREE_2_COL_NM（前方一致）
     */
    private String free2ColNmLikeFront;

    /**
     * FREE_3_COL_NM（大なり）
     */
    private String free3ColNmGreaterThan;

    /**
     * FREE_3_COL_NM（大なりイコール）
     */
    private String free3ColNmGreaterThanEqual;

    /**
     * FREE_3_COL_NM（小なり）
     */
    private String free3ColNmLessThan;

    /**
     * FREE_3_COL_NM（小なりイコール）
     */
    private String free3ColNmLessThanEqual;

    /**
     * FREE_3_COL_NM（前方一致）
     */
    private String free3ColNmLikeFront;

    /**
     * FREE_4_COL_NM（大なり）
     */
    private String free4ColNmGreaterThan;

    /**
     * FREE_4_COL_NM（大なりイコール）
     */
    private String free4ColNmGreaterThanEqual;

    /**
     * FREE_4_COL_NM（小なり）
     */
    private String free4ColNmLessThan;

    /**
     * FREE_4_COL_NM（小なりイコール）
     */
    private String free4ColNmLessThanEqual;

    /**
     * FREE_4_COL_NM（前方一致）
     */
    private String free4ColNmLikeFront;

    /**
     * ITEM_NO（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM_NO（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM_NO（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM_NO（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM_NO（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PKG_CD（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PKG_CD（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PKG_CD（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PKG_CD（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PKG_CD（前方一致）
     */
    private String pkgCdLikeFront;

    /**
     * ITEM_DESCRIPTION（大なり）
     */
    private String itemDescriptionGreaterThan;

    /**
     * ITEM_DESCRIPTION（大なりイコール）
     */
    private String itemDescriptionGreaterThanEqual;

    /**
     * ITEM_DESCRIPTION（小なり）
     */
    private String itemDescriptionLessThan;

    /**
     * ITEM_DESCRIPTION（小なりイコール）
     */
    private String itemDescriptionLessThanEqual;

    /**
     * ITEM_DESCRIPTION（前方一致）
     */
    private String itemDescriptionLikeFront;

    /**
     * MODEL_CD（大なり）
     */
    private String modelCdGreaterThan;

    /**
     * MODEL_CD（大なりイコール）
     */
    private String modelCdGreaterThanEqual;

    /**
     * MODEL_CD（小なり）
     */
    private String modelCdLessThan;

    /**
     * MODEL_CD（小なりイコール）
     */
    private String modelCdLessThanEqual;

    /**
     * MODEL_CD（前方一致）
     */
    private String modelCdLikeFront;

    /**
     * ORIGIN_CNTRY_NM（大なり）
     */
    private String originCntryNmGreaterThan;

    /**
     * ORIGIN_CNTRY_NM（大なりイコール）
     */
    private String originCntryNmGreaterThanEqual;

    /**
     * ORIGIN_CNTRY_NM（小なり）
     */
    private String originCntryNmLessThan;

    /**
     * ORIGIN_CNTRY_NM（小なりイコール）
     */
    private String originCntryNmLessThanEqual;

    /**
     * ORIGIN_CNTRY_NM（前方一致）
     */
    private String originCntryNmLikeFront;

    /**
     * FREE_1_DTL（大なり）
     */
    private String free1DtlGreaterThan;

    /**
     * FREE_1_DTL（大なりイコール）
     */
    private String free1DtlGreaterThanEqual;

    /**
     * FREE_1_DTL（小なり）
     */
    private String free1DtlLessThan;

    /**
     * FREE_1_DTL（小なりイコール）
     */
    private String free1DtlLessThanEqual;

    /**
     * FREE_1_DTL（前方一致）
     */
    private String free1DtlLikeFront;

    /**
     * FREE_2_DTL（大なり）
     */
    private String free2DtlGreaterThan;

    /**
     * FREE_2_DTL（大なりイコール）
     */
    private String free2DtlGreaterThanEqual;

    /**
     * FREE_2_DTL（小なり）
     */
    private String free2DtlLessThan;

    /**
     * FREE_2_DTL（小なりイコール）
     */
    private String free2DtlLessThanEqual;

    /**
     * FREE_2_DTL（前方一致）
     */
    private String free2DtlLikeFront;

    /**
     * FREE_3_DTL（大なり）
     */
    private String free3DtlGreaterThan;

    /**
     * FREE_3_DTL（大なりイコール）
     */
    private String free3DtlGreaterThanEqual;

    /**
     * FREE_3_DTL（小なり）
     */
    private String free3DtlLessThan;

    /**
     * FREE_3_DTL（小なりイコール）
     */
    private String free3DtlLessThanEqual;

    /**
     * FREE_3_DTL（前方一致）
     */
    private String free3DtlLikeFront;

    /**
     * HS_CD（大なり）
     */
    private String hsCdGreaterThan;

    /**
     * HS_CD（大なりイコール）
     */
    private String hsCdGreaterThanEqual;

    /**
     * HS_CD（小なり）
     */
    private String hsCdLessThan;

    /**
     * HS_CD（小なりイコール）
     */
    private String hsCdLessThanEqual;

    /**
     * HS_CD（前方一致）
     */
    private String hsCdLikeFront;

    /**
     * UNIT_PRICE_CURR_CD（大なり）
     */
    private String unitPriceCurrCdGreaterThan;

    /**
     * UNIT_PRICE_CURR_CD（大なりイコール）
     */
    private String unitPriceCurrCdGreaterThanEqual;

    /**
     * UNIT_PRICE_CURR_CD（小なり）
     */
    private String unitPriceCurrCdLessThan;

    /**
     * UNIT_PRICE_CURR_CD（小なりイコール）
     */
    private String unitPriceCurrCdLessThanEqual;

    /**
     * UNIT_PRICE_CURR_CD（前方一致）
     */
    private String unitPriceCurrCdLikeFront;

    /**
     * QTY_UNIT（大なり）
     */
    private String qtyUnitGreaterThan;

    /**
     * QTY_UNIT（大なりイコール）
     */
    private String qtyUnitGreaterThanEqual;

    /**
     * QTY_UNIT（小なり）
     */
    private String qtyUnitLessThan;

    /**
     * QTY_UNIT（小なりイコール）
     */
    private String qtyUnitLessThanEqual;

    /**
     * QTY_UNIT（前方一致）
     */
    private String qtyUnitLikeFront;

    /**
     * LENGTH_UNIT（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH_UNIT（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH_UNIT（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH_UNIT（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH_UNIT（前方一致）
     */
    private String lengthUnitLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctAtchedRtCriteriaDomain() {
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
     * invTplNo のゲッターメソッドです。
     * 
     * @return the invTplNo
     */
    public String getInvTplNo() {
        return invTplNo;
    }

    /**
     * invTplNo のセッターメソッドです。
     * 
     * @param invTplNo invTplNo に設定する
     */
    public void setInvTplNo(String invTplNo) {
        this.invTplNo = invTplNo;
    }

    /**
     * netAmount のゲッターメソッドです。
     * 
     * @return the netAmount
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * netAmount のセッターメソッドです。
     * 
     * @param netAmount netAmount に設定する
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * netAmountCurrCd のゲッターメソッドです。
     * 
     * @return the netAmountCurrCd
     */
    public String getNetAmountCurrCd() {
        return netAmountCurrCd;
    }

    /**
     * netAmountCurrCd のセッターメソッドです。
     * 
     * @param netAmountCurrCd netAmountCurrCd に設定する
     */
    public void setNetAmountCurrCd(String netAmountCurrCd) {
        this.netAmountCurrCd = netAmountCurrCd;
    }

    /**
     * free1ColNm のゲッターメソッドです。
     * 
     * @return the free1ColNm
     */
    public String getFree1ColNm() {
        return free1ColNm;
    }

    /**
     * free1ColNm のセッターメソッドです。
     * 
     * @param free1ColNm free1ColNm に設定する
     */
    public void setFree1ColNm(String free1ColNm) {
        this.free1ColNm = free1ColNm;
    }

    /**
     * free2ColNm のゲッターメソッドです。
     * 
     * @return the free2ColNm
     */
    public String getFree2ColNm() {
        return free2ColNm;
    }

    /**
     * free2ColNm のセッターメソッドです。
     * 
     * @param free2ColNm free2ColNm に設定する
     */
    public void setFree2ColNm(String free2ColNm) {
        this.free2ColNm = free2ColNm;
    }

    /**
     * free3ColNm のゲッターメソッドです。
     * 
     * @return the free3ColNm
     */
    public String getFree3ColNm() {
        return free3ColNm;
    }

    /**
     * free3ColNm のセッターメソッドです。
     * 
     * @param free3ColNm free3ColNm に設定する
     */
    public void setFree3ColNm(String free3ColNm) {
        this.free3ColNm = free3ColNm;
    }

    /**
     * free4ColNm のゲッターメソッドです。
     * 
     * @return the free4ColNm
     */
    public String getFree4ColNm() {
        return free4ColNm;
    }

    /**
     * free4ColNm のセッターメソッドです。
     * 
     * @param free4ColNm free4ColNm に設定する
     */
    public void setFree4ColNm(String free4ColNm) {
        this.free4ColNm = free4ColNm;
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
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
    }

    /**
     * invoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThan
     */
    public String getInvoiceNoGreaterThan() {
        return invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThan invoiceNoGreaterThan に設定する
     */
    public void setInvoiceNoGreaterThan(String invoiceNoGreaterThan) {
        this.invoiceNoGreaterThan = invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThanEqual
     */
    public String getInvoiceNoGreaterThanEqual() {
        return invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThanEqual invoiceNoGreaterThanEqual に設定する
     */
    public void setInvoiceNoGreaterThanEqual(String invoiceNoGreaterThanEqual) {
        this.invoiceNoGreaterThanEqual = invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThan
     */
    public String getInvoiceNoLessThan() {
        return invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThan のセッターメソッドです。
     * 
     * @param invoiceNoLessThan invoiceNoLessThan に設定する
     */
    public void setInvoiceNoLessThan(String invoiceNoLessThan) {
        this.invoiceNoLessThan = invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThanEqual
     */
    public String getInvoiceNoLessThanEqual() {
        return invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoLessThanEqual invoiceNoLessThanEqual に設定する
     */
    public void setInvoiceNoLessThanEqual(String invoiceNoLessThanEqual) {
        this.invoiceNoLessThanEqual = invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceNoLikeFront
     */
    public String getInvoiceNoLikeFront() {
        return invoiceNoLikeFront;
    }

    /**
     * invoiceNoLikeFront のセッターメソッドです。
     * 
     * @param invoiceNoLikeFront invoiceNoLikeFront に設定する
     */
    public void setInvoiceNoLikeFront(String invoiceNoLikeFront) {
        this.invoiceNoLikeFront = invoiceNoLikeFront;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtGreaterThanEqual
     */
    public Date getInvoiceIssueDtGreaterThanEqual() {
        return invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtGreaterThanEqual invoiceIssueDtGreaterThanEqual に設定する
     */
    public void setInvoiceIssueDtGreaterThanEqual(Date invoiceIssueDtGreaterThanEqual) {
        this.invoiceIssueDtGreaterThanEqual = invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtLessThanEqual
     */
    public Date getInvoiceIssueDtLessThanEqual() {
        return invoiceIssueDtLessThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtLessThanEqual invoiceIssueDtLessThanEqual に設定する
     */
    public void setInvoiceIssueDtLessThanEqual(Date invoiceIssueDtLessThanEqual) {
        this.invoiceIssueDtLessThanEqual = invoiceIssueDtLessThanEqual;
    }

    /**
     * invTplNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invTplNoGreaterThan
     */
    public String getInvTplNoGreaterThan() {
        return invTplNoGreaterThan;
    }

    /**
     * invTplNoGreaterThan のセッターメソッドです。
     * 
     * @param invTplNoGreaterThan invTplNoGreaterThan に設定する
     */
    public void setInvTplNoGreaterThan(String invTplNoGreaterThan) {
        this.invTplNoGreaterThan = invTplNoGreaterThan;
    }

    /**
     * invTplNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invTplNoGreaterThanEqual
     */
    public String getInvTplNoGreaterThanEqual() {
        return invTplNoGreaterThanEqual;
    }

    /**
     * invTplNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invTplNoGreaterThanEqual invTplNoGreaterThanEqual に設定する
     */
    public void setInvTplNoGreaterThanEqual(String invTplNoGreaterThanEqual) {
        this.invTplNoGreaterThanEqual = invTplNoGreaterThanEqual;
    }

    /**
     * invTplNoLessThan のゲッターメソッドです。
     * 
     * @return the invTplNoLessThan
     */
    public String getInvTplNoLessThan() {
        return invTplNoLessThan;
    }

    /**
     * invTplNoLessThan のセッターメソッドです。
     * 
     * @param invTplNoLessThan invTplNoLessThan に設定する
     */
    public void setInvTplNoLessThan(String invTplNoLessThan) {
        this.invTplNoLessThan = invTplNoLessThan;
    }

    /**
     * invTplNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invTplNoLessThanEqual
     */
    public String getInvTplNoLessThanEqual() {
        return invTplNoLessThanEqual;
    }

    /**
     * invTplNoLessThanEqual のセッターメソッドです。
     * 
     * @param invTplNoLessThanEqual invTplNoLessThanEqual に設定する
     */
    public void setInvTplNoLessThanEqual(String invTplNoLessThanEqual) {
        this.invTplNoLessThanEqual = invTplNoLessThanEqual;
    }

    /**
     * invTplNoLikeFront のゲッターメソッドです。
     * 
     * @return the invTplNoLikeFront
     */
    public String getInvTplNoLikeFront() {
        return invTplNoLikeFront;
    }

    /**
     * invTplNoLikeFront のセッターメソッドです。
     * 
     * @param invTplNoLikeFront invTplNoLikeFront に設定する
     */
    public void setInvTplNoLikeFront(String invTplNoLikeFront) {
        this.invTplNoLikeFront = invTplNoLikeFront;
    }

    /**
     * netAmountCurrCdGreaterThan のゲッターメソッドです。
     * 
     * @return the netAmountCurrCdGreaterThan
     */
    public String getNetAmountCurrCdGreaterThan() {
        return netAmountCurrCdGreaterThan;
    }

    /**
     * netAmountCurrCdGreaterThan のセッターメソッドです。
     * 
     * @param netAmountCurrCdGreaterThan netAmountCurrCdGreaterThan に設定する
     */
    public void setNetAmountCurrCdGreaterThan(String netAmountCurrCdGreaterThan) {
        this.netAmountCurrCdGreaterThan = netAmountCurrCdGreaterThan;
    }

    /**
     * netAmountCurrCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the netAmountCurrCdGreaterThanEqual
     */
    public String getNetAmountCurrCdGreaterThanEqual() {
        return netAmountCurrCdGreaterThanEqual;
    }

    /**
     * netAmountCurrCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param netAmountCurrCdGreaterThanEqual netAmountCurrCdGreaterThanEqual に設定する
     */
    public void setNetAmountCurrCdGreaterThanEqual(String netAmountCurrCdGreaterThanEqual) {
        this.netAmountCurrCdGreaterThanEqual = netAmountCurrCdGreaterThanEqual;
    }

    /**
     * netAmountCurrCdLessThan のゲッターメソッドです。
     * 
     * @return the netAmountCurrCdLessThan
     */
    public String getNetAmountCurrCdLessThan() {
        return netAmountCurrCdLessThan;
    }

    /**
     * netAmountCurrCdLessThan のセッターメソッドです。
     * 
     * @param netAmountCurrCdLessThan netAmountCurrCdLessThan に設定する
     */
    public void setNetAmountCurrCdLessThan(String netAmountCurrCdLessThan) {
        this.netAmountCurrCdLessThan = netAmountCurrCdLessThan;
    }

    /**
     * netAmountCurrCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the netAmountCurrCdLessThanEqual
     */
    public String getNetAmountCurrCdLessThanEqual() {
        return netAmountCurrCdLessThanEqual;
    }

    /**
     * netAmountCurrCdLessThanEqual のセッターメソッドです。
     * 
     * @param netAmountCurrCdLessThanEqual netAmountCurrCdLessThanEqual に設定する
     */
    public void setNetAmountCurrCdLessThanEqual(String netAmountCurrCdLessThanEqual) {
        this.netAmountCurrCdLessThanEqual = netAmountCurrCdLessThanEqual;
    }

    /**
     * netAmountCurrCdLikeFront のゲッターメソッドです。
     * 
     * @return the netAmountCurrCdLikeFront
     */
    public String getNetAmountCurrCdLikeFront() {
        return netAmountCurrCdLikeFront;
    }

    /**
     * netAmountCurrCdLikeFront のセッターメソッドです。
     * 
     * @param netAmountCurrCdLikeFront netAmountCurrCdLikeFront に設定する
     */
    public void setNetAmountCurrCdLikeFront(String netAmountCurrCdLikeFront) {
        this.netAmountCurrCdLikeFront = netAmountCurrCdLikeFront;
    }

    /**
     * free1ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free1ColNmGreaterThan
     */
    public String getFree1ColNmGreaterThan() {
        return free1ColNmGreaterThan;
    }

    /**
     * free1ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free1ColNmGreaterThan free1ColNmGreaterThan に設定する
     */
    public void setFree1ColNmGreaterThan(String free1ColNmGreaterThan) {
        this.free1ColNmGreaterThan = free1ColNmGreaterThan;
    }

    /**
     * free1ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1ColNmGreaterThanEqual
     */
    public String getFree1ColNmGreaterThanEqual() {
        return free1ColNmGreaterThanEqual;
    }

    /**
     * free1ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1ColNmGreaterThanEqual free1ColNmGreaterThanEqual に設定する
     */
    public void setFree1ColNmGreaterThanEqual(String free1ColNmGreaterThanEqual) {
        this.free1ColNmGreaterThanEqual = free1ColNmGreaterThanEqual;
    }

    /**
     * free1ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free1ColNmLessThan
     */
    public String getFree1ColNmLessThan() {
        return free1ColNmLessThan;
    }

    /**
     * free1ColNmLessThan のセッターメソッドです。
     * 
     * @param free1ColNmLessThan free1ColNmLessThan に設定する
     */
    public void setFree1ColNmLessThan(String free1ColNmLessThan) {
        this.free1ColNmLessThan = free1ColNmLessThan;
    }

    /**
     * free1ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1ColNmLessThanEqual
     */
    public String getFree1ColNmLessThanEqual() {
        return free1ColNmLessThanEqual;
    }

    /**
     * free1ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free1ColNmLessThanEqual free1ColNmLessThanEqual に設定する
     */
    public void setFree1ColNmLessThanEqual(String free1ColNmLessThanEqual) {
        this.free1ColNmLessThanEqual = free1ColNmLessThanEqual;
    }

    /**
     * free1ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free1ColNmLikeFront
     */
    public String getFree1ColNmLikeFront() {
        return free1ColNmLikeFront;
    }

    /**
     * free1ColNmLikeFront のセッターメソッドです。
     * 
     * @param free1ColNmLikeFront free1ColNmLikeFront に設定する
     */
    public void setFree1ColNmLikeFront(String free1ColNmLikeFront) {
        this.free1ColNmLikeFront = free1ColNmLikeFront;
    }

    /**
     * free2ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free2ColNmGreaterThan
     */
    public String getFree2ColNmGreaterThan() {
        return free2ColNmGreaterThan;
    }

    /**
     * free2ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free2ColNmGreaterThan free2ColNmGreaterThan に設定する
     */
    public void setFree2ColNmGreaterThan(String free2ColNmGreaterThan) {
        this.free2ColNmGreaterThan = free2ColNmGreaterThan;
    }

    /**
     * free2ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2ColNmGreaterThanEqual
     */
    public String getFree2ColNmGreaterThanEqual() {
        return free2ColNmGreaterThanEqual;
    }

    /**
     * free2ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2ColNmGreaterThanEqual free2ColNmGreaterThanEqual に設定する
     */
    public void setFree2ColNmGreaterThanEqual(String free2ColNmGreaterThanEqual) {
        this.free2ColNmGreaterThanEqual = free2ColNmGreaterThanEqual;
    }

    /**
     * free2ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free2ColNmLessThan
     */
    public String getFree2ColNmLessThan() {
        return free2ColNmLessThan;
    }

    /**
     * free2ColNmLessThan のセッターメソッドです。
     * 
     * @param free2ColNmLessThan free2ColNmLessThan に設定する
     */
    public void setFree2ColNmLessThan(String free2ColNmLessThan) {
        this.free2ColNmLessThan = free2ColNmLessThan;
    }

    /**
     * free2ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2ColNmLessThanEqual
     */
    public String getFree2ColNmLessThanEqual() {
        return free2ColNmLessThanEqual;
    }

    /**
     * free2ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free2ColNmLessThanEqual free2ColNmLessThanEqual に設定する
     */
    public void setFree2ColNmLessThanEqual(String free2ColNmLessThanEqual) {
        this.free2ColNmLessThanEqual = free2ColNmLessThanEqual;
    }

    /**
     * free2ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free2ColNmLikeFront
     */
    public String getFree2ColNmLikeFront() {
        return free2ColNmLikeFront;
    }

    /**
     * free2ColNmLikeFront のセッターメソッドです。
     * 
     * @param free2ColNmLikeFront free2ColNmLikeFront に設定する
     */
    public void setFree2ColNmLikeFront(String free2ColNmLikeFront) {
        this.free2ColNmLikeFront = free2ColNmLikeFront;
    }

    /**
     * free3ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free3ColNmGreaterThan
     */
    public String getFree3ColNmGreaterThan() {
        return free3ColNmGreaterThan;
    }

    /**
     * free3ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free3ColNmGreaterThan free3ColNmGreaterThan に設定する
     */
    public void setFree3ColNmGreaterThan(String free3ColNmGreaterThan) {
        this.free3ColNmGreaterThan = free3ColNmGreaterThan;
    }

    /**
     * free3ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3ColNmGreaterThanEqual
     */
    public String getFree3ColNmGreaterThanEqual() {
        return free3ColNmGreaterThanEqual;
    }

    /**
     * free3ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3ColNmGreaterThanEqual free3ColNmGreaterThanEqual に設定する
     */
    public void setFree3ColNmGreaterThanEqual(String free3ColNmGreaterThanEqual) {
        this.free3ColNmGreaterThanEqual = free3ColNmGreaterThanEqual;
    }

    /**
     * free3ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free3ColNmLessThan
     */
    public String getFree3ColNmLessThan() {
        return free3ColNmLessThan;
    }

    /**
     * free3ColNmLessThan のセッターメソッドです。
     * 
     * @param free3ColNmLessThan free3ColNmLessThan に設定する
     */
    public void setFree3ColNmLessThan(String free3ColNmLessThan) {
        this.free3ColNmLessThan = free3ColNmLessThan;
    }

    /**
     * free3ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3ColNmLessThanEqual
     */
    public String getFree3ColNmLessThanEqual() {
        return free3ColNmLessThanEqual;
    }

    /**
     * free3ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free3ColNmLessThanEqual free3ColNmLessThanEqual に設定する
     */
    public void setFree3ColNmLessThanEqual(String free3ColNmLessThanEqual) {
        this.free3ColNmLessThanEqual = free3ColNmLessThanEqual;
    }

    /**
     * free3ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free3ColNmLikeFront
     */
    public String getFree3ColNmLikeFront() {
        return free3ColNmLikeFront;
    }

    /**
     * free3ColNmLikeFront のセッターメソッドです。
     * 
     * @param free3ColNmLikeFront free3ColNmLikeFront に設定する
     */
    public void setFree3ColNmLikeFront(String free3ColNmLikeFront) {
        this.free3ColNmLikeFront = free3ColNmLikeFront;
    }

    /**
     * free4ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free4ColNmGreaterThan
     */
    public String getFree4ColNmGreaterThan() {
        return free4ColNmGreaterThan;
    }

    /**
     * free4ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free4ColNmGreaterThan free4ColNmGreaterThan に設定する
     */
    public void setFree4ColNmGreaterThan(String free4ColNmGreaterThan) {
        this.free4ColNmGreaterThan = free4ColNmGreaterThan;
    }

    /**
     * free4ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free4ColNmGreaterThanEqual
     */
    public String getFree4ColNmGreaterThanEqual() {
        return free4ColNmGreaterThanEqual;
    }

    /**
     * free4ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free4ColNmGreaterThanEqual free4ColNmGreaterThanEqual に設定する
     */
    public void setFree4ColNmGreaterThanEqual(String free4ColNmGreaterThanEqual) {
        this.free4ColNmGreaterThanEqual = free4ColNmGreaterThanEqual;
    }

    /**
     * free4ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free4ColNmLessThan
     */
    public String getFree4ColNmLessThan() {
        return free4ColNmLessThan;
    }

    /**
     * free4ColNmLessThan のセッターメソッドです。
     * 
     * @param free4ColNmLessThan free4ColNmLessThan に設定する
     */
    public void setFree4ColNmLessThan(String free4ColNmLessThan) {
        this.free4ColNmLessThan = free4ColNmLessThan;
    }

    /**
     * free4ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free4ColNmLessThanEqual
     */
    public String getFree4ColNmLessThanEqual() {
        return free4ColNmLessThanEqual;
    }

    /**
     * free4ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free4ColNmLessThanEqual free4ColNmLessThanEqual に設定する
     */
    public void setFree4ColNmLessThanEqual(String free4ColNmLessThanEqual) {
        this.free4ColNmLessThanEqual = free4ColNmLessThanEqual;
    }

    /**
     * free4ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free4ColNmLikeFront
     */
    public String getFree4ColNmLikeFront() {
        return free4ColNmLikeFront;
    }

    /**
     * free4ColNmLikeFront のセッターメソッドです。
     * 
     * @param free4ColNmLikeFront free4ColNmLikeFront に設定する
     */
    public void setFree4ColNmLikeFront(String free4ColNmLikeFront) {
        this.free4ColNmLikeFront = free4ColNmLikeFront;
    }

    /**
     * itemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThan
     */
    public String getItemNoGreaterThan() {
        return itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGreaterThan itemNoGreaterThan に設定する
     */
    public void setItemNoGreaterThan(String itemNoGreaterThan) {
        this.itemNoGreaterThan = itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThanEqual
     */
    public String getItemNoGreaterThanEqual() {
        return itemNoGreaterThanEqual;
    }

    /**
     * itemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGreaterThanEqual itemNoGreaterThanEqual に設定する
     */
    public void setItemNoGreaterThanEqual(String itemNoGreaterThanEqual) {
        this.itemNoGreaterThanEqual = itemNoGreaterThanEqual;
    }

    /**
     * itemNoLessThan のゲッターメソッドです。
     * 
     * @return the itemNoLessThan
     */
    public String getItemNoLessThan() {
        return itemNoLessThan;
    }

    /**
     * itemNoLessThan のセッターメソッドです。
     * 
     * @param itemNoLessThan itemNoLessThan に設定する
     */
    public void setItemNoLessThan(String itemNoLessThan) {
        this.itemNoLessThan = itemNoLessThan;
    }

    /**
     * itemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoLessThanEqual
     */
    public String getItemNoLessThanEqual() {
        return itemNoLessThanEqual;
    }

    /**
     * itemNoLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoLessThanEqual itemNoLessThanEqual に設定する
     */
    public void setItemNoLessThanEqual(String itemNoLessThanEqual) {
        this.itemNoLessThanEqual = itemNoLessThanEqual;
    }

    /**
     * itemNoLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoLikeFront
     */
    public String getItemNoLikeFront() {
        return itemNoLikeFront;
    }

    /**
     * itemNoLikeFront のセッターメソッドです。
     * 
     * @param itemNoLikeFront itemNoLikeFront に設定する
     */
    public void setItemNoLikeFront(String itemNoLikeFront) {
        this.itemNoLikeFront = itemNoLikeFront;
    }

    /**
     * pkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThan
     */
    public String getPkgCdGreaterThan() {
        return pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThan のセッターメソッドです。
     * 
     * @param pkgCdGreaterThan pkgCdGreaterThan に設定する
     */
    public void setPkgCdGreaterThan(String pkgCdGreaterThan) {
        this.pkgCdGreaterThan = pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThanEqual
     */
    public String getPkgCdGreaterThanEqual() {
        return pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgCdGreaterThanEqual pkgCdGreaterThanEqual に設定する
     */
    public void setPkgCdGreaterThanEqual(String pkgCdGreaterThanEqual) {
        this.pkgCdGreaterThanEqual = pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdLessThan のゲッターメソッドです。
     * 
     * @return the pkgCdLessThan
     */
    public String getPkgCdLessThan() {
        return pkgCdLessThan;
    }

    /**
     * pkgCdLessThan のセッターメソッドです。
     * 
     * @param pkgCdLessThan pkgCdLessThan に設定する
     */
    public void setPkgCdLessThan(String pkgCdLessThan) {
        this.pkgCdLessThan = pkgCdLessThan;
    }

    /**
     * pkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdLessThanEqual
     */
    public String getPkgCdLessThanEqual() {
        return pkgCdLessThanEqual;
    }

    /**
     * pkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param pkgCdLessThanEqual pkgCdLessThanEqual に設定する
     */
    public void setPkgCdLessThanEqual(String pkgCdLessThanEqual) {
        this.pkgCdLessThanEqual = pkgCdLessThanEqual;
    }

    /**
     * pkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the pkgCdLikeFront
     */
    public String getPkgCdLikeFront() {
        return pkgCdLikeFront;
    }

    /**
     * pkgCdLikeFront のセッターメソッドです。
     * 
     * @param pkgCdLikeFront pkgCdLikeFront に設定する
     */
    public void setPkgCdLikeFront(String pkgCdLikeFront) {
        this.pkgCdLikeFront = pkgCdLikeFront;
    }

    /**
     * itemDescriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThan
     */
    public String getItemDescriptionGreaterThan() {
        return itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThan のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThan itemDescriptionGreaterThan に設定する
     */
    public void setItemDescriptionGreaterThan(String itemDescriptionGreaterThan) {
        this.itemDescriptionGreaterThan = itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThanEqual
     */
    public String getItemDescriptionGreaterThanEqual() {
        return itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThanEqual itemDescriptionGreaterThanEqual に設定する
     */
    public void setItemDescriptionGreaterThanEqual(String itemDescriptionGreaterThanEqual) {
        this.itemDescriptionGreaterThanEqual = itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionLessThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThan
     */
    public String getItemDescriptionLessThan() {
        return itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThan のセッターメソッドです。
     * 
     * @param itemDescriptionLessThan itemDescriptionLessThan に設定する
     */
    public void setItemDescriptionLessThan(String itemDescriptionLessThan) {
        this.itemDescriptionLessThan = itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThanEqual
     */
    public String getItemDescriptionLessThanEqual() {
        return itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLessThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionLessThanEqual itemDescriptionLessThanEqual に設定する
     */
    public void setItemDescriptionLessThanEqual(String itemDescriptionLessThanEqual) {
        this.itemDescriptionLessThanEqual = itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLikeFront のゲッターメソッドです。
     * 
     * @return the itemDescriptionLikeFront
     */
    public String getItemDescriptionLikeFront() {
        return itemDescriptionLikeFront;
    }

    /**
     * itemDescriptionLikeFront のセッターメソッドです。
     * 
     * @param itemDescriptionLikeFront itemDescriptionLikeFront に設定する
     */
    public void setItemDescriptionLikeFront(String itemDescriptionLikeFront) {
        this.itemDescriptionLikeFront = itemDescriptionLikeFront;
    }

    /**
     * modelCdGreaterThan のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThan
     */
    public String getModelCdGreaterThan() {
        return modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThan のセッターメソッドです。
     * 
     * @param modelCdGreaterThan modelCdGreaterThan に設定する
     */
    public void setModelCdGreaterThan(String modelCdGreaterThan) {
        this.modelCdGreaterThan = modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThanEqual
     */
    public String getModelCdGreaterThanEqual() {
        return modelCdGreaterThanEqual;
    }

    /**
     * modelCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param modelCdGreaterThanEqual modelCdGreaterThanEqual に設定する
     */
    public void setModelCdGreaterThanEqual(String modelCdGreaterThanEqual) {
        this.modelCdGreaterThanEqual = modelCdGreaterThanEqual;
    }

    /**
     * modelCdLessThan のゲッターメソッドです。
     * 
     * @return the modelCdLessThan
     */
    public String getModelCdLessThan() {
        return modelCdLessThan;
    }

    /**
     * modelCdLessThan のセッターメソッドです。
     * 
     * @param modelCdLessThan modelCdLessThan に設定する
     */
    public void setModelCdLessThan(String modelCdLessThan) {
        this.modelCdLessThan = modelCdLessThan;
    }

    /**
     * modelCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdLessThanEqual
     */
    public String getModelCdLessThanEqual() {
        return modelCdLessThanEqual;
    }

    /**
     * modelCdLessThanEqual のセッターメソッドです。
     * 
     * @param modelCdLessThanEqual modelCdLessThanEqual に設定する
     */
    public void setModelCdLessThanEqual(String modelCdLessThanEqual) {
        this.modelCdLessThanEqual = modelCdLessThanEqual;
    }

    /**
     * modelCdLikeFront のゲッターメソッドです。
     * 
     * @return the modelCdLikeFront
     */
    public String getModelCdLikeFront() {
        return modelCdLikeFront;
    }

    /**
     * modelCdLikeFront のセッターメソッドです。
     * 
     * @param modelCdLikeFront modelCdLikeFront に設定する
     */
    public void setModelCdLikeFront(String modelCdLikeFront) {
        this.modelCdLikeFront = modelCdLikeFront;
    }

    /**
     * originCntryNmGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryNmGreaterThan
     */
    public String getOriginCntryNmGreaterThan() {
        return originCntryNmGreaterThan;
    }

    /**
     * originCntryNmGreaterThan のセッターメソッドです。
     * 
     * @param originCntryNmGreaterThan originCntryNmGreaterThan に設定する
     */
    public void setOriginCntryNmGreaterThan(String originCntryNmGreaterThan) {
        this.originCntryNmGreaterThan = originCntryNmGreaterThan;
    }

    /**
     * originCntryNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryNmGreaterThanEqual
     */
    public String getOriginCntryNmGreaterThanEqual() {
        return originCntryNmGreaterThanEqual;
    }

    /**
     * originCntryNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryNmGreaterThanEqual originCntryNmGreaterThanEqual に設定する
     */
    public void setOriginCntryNmGreaterThanEqual(String originCntryNmGreaterThanEqual) {
        this.originCntryNmGreaterThanEqual = originCntryNmGreaterThanEqual;
    }

    /**
     * originCntryNmLessThan のゲッターメソッドです。
     * 
     * @return the originCntryNmLessThan
     */
    public String getOriginCntryNmLessThan() {
        return originCntryNmLessThan;
    }

    /**
     * originCntryNmLessThan のセッターメソッドです。
     * 
     * @param originCntryNmLessThan originCntryNmLessThan に設定する
     */
    public void setOriginCntryNmLessThan(String originCntryNmLessThan) {
        this.originCntryNmLessThan = originCntryNmLessThan;
    }

    /**
     * originCntryNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryNmLessThanEqual
     */
    public String getOriginCntryNmLessThanEqual() {
        return originCntryNmLessThanEqual;
    }

    /**
     * originCntryNmLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryNmLessThanEqual originCntryNmLessThanEqual に設定する
     */
    public void setOriginCntryNmLessThanEqual(String originCntryNmLessThanEqual) {
        this.originCntryNmLessThanEqual = originCntryNmLessThanEqual;
    }

    /**
     * originCntryNmLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryNmLikeFront
     */
    public String getOriginCntryNmLikeFront() {
        return originCntryNmLikeFront;
    }

    /**
     * originCntryNmLikeFront のセッターメソッドです。
     * 
     * @param originCntryNmLikeFront originCntryNmLikeFront に設定する
     */
    public void setOriginCntryNmLikeFront(String originCntryNmLikeFront) {
        this.originCntryNmLikeFront = originCntryNmLikeFront;
    }

    /**
     * free1DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free1DtlGreaterThan
     */
    public String getFree1DtlGreaterThan() {
        return free1DtlGreaterThan;
    }

    /**
     * free1DtlGreaterThan のセッターメソッドです。
     * 
     * @param free1DtlGreaterThan free1DtlGreaterThan に設定する
     */
    public void setFree1DtlGreaterThan(String free1DtlGreaterThan) {
        this.free1DtlGreaterThan = free1DtlGreaterThan;
    }

    /**
     * free1DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1DtlGreaterThanEqual
     */
    public String getFree1DtlGreaterThanEqual() {
        return free1DtlGreaterThanEqual;
    }

    /**
     * free1DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1DtlGreaterThanEqual free1DtlGreaterThanEqual に設定する
     */
    public void setFree1DtlGreaterThanEqual(String free1DtlGreaterThanEqual) {
        this.free1DtlGreaterThanEqual = free1DtlGreaterThanEqual;
    }

    /**
     * free1DtlLessThan のゲッターメソッドです。
     * 
     * @return the free1DtlLessThan
     */
    public String getFree1DtlLessThan() {
        return free1DtlLessThan;
    }

    /**
     * free1DtlLessThan のセッターメソッドです。
     * 
     * @param free1DtlLessThan free1DtlLessThan に設定する
     */
    public void setFree1DtlLessThan(String free1DtlLessThan) {
        this.free1DtlLessThan = free1DtlLessThan;
    }

    /**
     * free1DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1DtlLessThanEqual
     */
    public String getFree1DtlLessThanEqual() {
        return free1DtlLessThanEqual;
    }

    /**
     * free1DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free1DtlLessThanEqual free1DtlLessThanEqual に設定する
     */
    public void setFree1DtlLessThanEqual(String free1DtlLessThanEqual) {
        this.free1DtlLessThanEqual = free1DtlLessThanEqual;
    }

    /**
     * free1DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free1DtlLikeFront
     */
    public String getFree1DtlLikeFront() {
        return free1DtlLikeFront;
    }

    /**
     * free1DtlLikeFront のセッターメソッドです。
     * 
     * @param free1DtlLikeFront free1DtlLikeFront に設定する
     */
    public void setFree1DtlLikeFront(String free1DtlLikeFront) {
        this.free1DtlLikeFront = free1DtlLikeFront;
    }

    /**
     * free2DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free2DtlGreaterThan
     */
    public String getFree2DtlGreaterThan() {
        return free2DtlGreaterThan;
    }

    /**
     * free2DtlGreaterThan のセッターメソッドです。
     * 
     * @param free2DtlGreaterThan free2DtlGreaterThan に設定する
     */
    public void setFree2DtlGreaterThan(String free2DtlGreaterThan) {
        this.free2DtlGreaterThan = free2DtlGreaterThan;
    }

    /**
     * free2DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2DtlGreaterThanEqual
     */
    public String getFree2DtlGreaterThanEqual() {
        return free2DtlGreaterThanEqual;
    }

    /**
     * free2DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2DtlGreaterThanEqual free2DtlGreaterThanEqual に設定する
     */
    public void setFree2DtlGreaterThanEqual(String free2DtlGreaterThanEqual) {
        this.free2DtlGreaterThanEqual = free2DtlGreaterThanEqual;
    }

    /**
     * free2DtlLessThan のゲッターメソッドです。
     * 
     * @return the free2DtlLessThan
     */
    public String getFree2DtlLessThan() {
        return free2DtlLessThan;
    }

    /**
     * free2DtlLessThan のセッターメソッドです。
     * 
     * @param free2DtlLessThan free2DtlLessThan に設定する
     */
    public void setFree2DtlLessThan(String free2DtlLessThan) {
        this.free2DtlLessThan = free2DtlLessThan;
    }

    /**
     * free2DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2DtlLessThanEqual
     */
    public String getFree2DtlLessThanEqual() {
        return free2DtlLessThanEqual;
    }

    /**
     * free2DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free2DtlLessThanEqual free2DtlLessThanEqual に設定する
     */
    public void setFree2DtlLessThanEqual(String free2DtlLessThanEqual) {
        this.free2DtlLessThanEqual = free2DtlLessThanEqual;
    }

    /**
     * free2DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free2DtlLikeFront
     */
    public String getFree2DtlLikeFront() {
        return free2DtlLikeFront;
    }

    /**
     * free2DtlLikeFront のセッターメソッドです。
     * 
     * @param free2DtlLikeFront free2DtlLikeFront に設定する
     */
    public void setFree2DtlLikeFront(String free2DtlLikeFront) {
        this.free2DtlLikeFront = free2DtlLikeFront;
    }

    /**
     * free3DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free3DtlGreaterThan
     */
    public String getFree3DtlGreaterThan() {
        return free3DtlGreaterThan;
    }

    /**
     * free3DtlGreaterThan のセッターメソッドです。
     * 
     * @param free3DtlGreaterThan free3DtlGreaterThan に設定する
     */
    public void setFree3DtlGreaterThan(String free3DtlGreaterThan) {
        this.free3DtlGreaterThan = free3DtlGreaterThan;
    }

    /**
     * free3DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3DtlGreaterThanEqual
     */
    public String getFree3DtlGreaterThanEqual() {
        return free3DtlGreaterThanEqual;
    }

    /**
     * free3DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3DtlGreaterThanEqual free3DtlGreaterThanEqual に設定する
     */
    public void setFree3DtlGreaterThanEqual(String free3DtlGreaterThanEqual) {
        this.free3DtlGreaterThanEqual = free3DtlGreaterThanEqual;
    }

    /**
     * free3DtlLessThan のゲッターメソッドです。
     * 
     * @return the free3DtlLessThan
     */
    public String getFree3DtlLessThan() {
        return free3DtlLessThan;
    }

    /**
     * free3DtlLessThan のセッターメソッドです。
     * 
     * @param free3DtlLessThan free3DtlLessThan に設定する
     */
    public void setFree3DtlLessThan(String free3DtlLessThan) {
        this.free3DtlLessThan = free3DtlLessThan;
    }

    /**
     * free3DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3DtlLessThanEqual
     */
    public String getFree3DtlLessThanEqual() {
        return free3DtlLessThanEqual;
    }

    /**
     * free3DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free3DtlLessThanEqual free3DtlLessThanEqual に設定する
     */
    public void setFree3DtlLessThanEqual(String free3DtlLessThanEqual) {
        this.free3DtlLessThanEqual = free3DtlLessThanEqual;
    }

    /**
     * free3DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free3DtlLikeFront
     */
    public String getFree3DtlLikeFront() {
        return free3DtlLikeFront;
    }

    /**
     * free3DtlLikeFront のセッターメソッドです。
     * 
     * @param free3DtlLikeFront free3DtlLikeFront に設定する
     */
    public void setFree3DtlLikeFront(String free3DtlLikeFront) {
        this.free3DtlLikeFront = free3DtlLikeFront;
    }

    /**
     * hsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThan
     */
    public String getHsCdGreaterThan() {
        return hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThan のセッターメソッドです。
     * 
     * @param hsCdGreaterThan hsCdGreaterThan に設定する
     */
    public void setHsCdGreaterThan(String hsCdGreaterThan) {
        this.hsCdGreaterThan = hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThanEqual
     */
    public String getHsCdGreaterThanEqual() {
        return hsCdGreaterThanEqual;
    }

    /**
     * hsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param hsCdGreaterThanEqual hsCdGreaterThanEqual に設定する
     */
    public void setHsCdGreaterThanEqual(String hsCdGreaterThanEqual) {
        this.hsCdGreaterThanEqual = hsCdGreaterThanEqual;
    }

    /**
     * hsCdLessThan のゲッターメソッドです。
     * 
     * @return the hsCdLessThan
     */
    public String getHsCdLessThan() {
        return hsCdLessThan;
    }

    /**
     * hsCdLessThan のセッターメソッドです。
     * 
     * @param hsCdLessThan hsCdLessThan に設定する
     */
    public void setHsCdLessThan(String hsCdLessThan) {
        this.hsCdLessThan = hsCdLessThan;
    }

    /**
     * hsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdLessThanEqual
     */
    public String getHsCdLessThanEqual() {
        return hsCdLessThanEqual;
    }

    /**
     * hsCdLessThanEqual のセッターメソッドです。
     * 
     * @param hsCdLessThanEqual hsCdLessThanEqual に設定する
     */
    public void setHsCdLessThanEqual(String hsCdLessThanEqual) {
        this.hsCdLessThanEqual = hsCdLessThanEqual;
    }

    /**
     * hsCdLikeFront のゲッターメソッドです。
     * 
     * @return the hsCdLikeFront
     */
    public String getHsCdLikeFront() {
        return hsCdLikeFront;
    }

    /**
     * hsCdLikeFront のセッターメソッドです。
     * 
     * @param hsCdLikeFront hsCdLikeFront に設定する
     */
    public void setHsCdLikeFront(String hsCdLikeFront) {
        this.hsCdLikeFront = hsCdLikeFront;
    }

    /**
     * unitPriceCurrCdGreaterThan のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdGreaterThan
     */
    public String getUnitPriceCurrCdGreaterThan() {
        return unitPriceCurrCdGreaterThan;
    }

    /**
     * unitPriceCurrCdGreaterThan のセッターメソッドです。
     * 
     * @param unitPriceCurrCdGreaterThan unitPriceCurrCdGreaterThan に設定する
     */
    public void setUnitPriceCurrCdGreaterThan(String unitPriceCurrCdGreaterThan) {
        this.unitPriceCurrCdGreaterThan = unitPriceCurrCdGreaterThan;
    }

    /**
     * unitPriceCurrCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdGreaterThanEqual
     */
    public String getUnitPriceCurrCdGreaterThanEqual() {
        return unitPriceCurrCdGreaterThanEqual;
    }

    /**
     * unitPriceCurrCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param unitPriceCurrCdGreaterThanEqual unitPriceCurrCdGreaterThanEqual に設定する
     */
    public void setUnitPriceCurrCdGreaterThanEqual(String unitPriceCurrCdGreaterThanEqual) {
        this.unitPriceCurrCdGreaterThanEqual = unitPriceCurrCdGreaterThanEqual;
    }

    /**
     * unitPriceCurrCdLessThan のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLessThan
     */
    public String getUnitPriceCurrCdLessThan() {
        return unitPriceCurrCdLessThan;
    }

    /**
     * unitPriceCurrCdLessThan のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLessThan unitPriceCurrCdLessThan に設定する
     */
    public void setUnitPriceCurrCdLessThan(String unitPriceCurrCdLessThan) {
        this.unitPriceCurrCdLessThan = unitPriceCurrCdLessThan;
    }

    /**
     * unitPriceCurrCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLessThanEqual
     */
    public String getUnitPriceCurrCdLessThanEqual() {
        return unitPriceCurrCdLessThanEqual;
    }

    /**
     * unitPriceCurrCdLessThanEqual のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLessThanEqual unitPriceCurrCdLessThanEqual に設定する
     */
    public void setUnitPriceCurrCdLessThanEqual(String unitPriceCurrCdLessThanEqual) {
        this.unitPriceCurrCdLessThanEqual = unitPriceCurrCdLessThanEqual;
    }

    /**
     * unitPriceCurrCdLikeFront のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLikeFront
     */
    public String getUnitPriceCurrCdLikeFront() {
        return unitPriceCurrCdLikeFront;
    }

    /**
     * unitPriceCurrCdLikeFront のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLikeFront unitPriceCurrCdLikeFront に設定する
     */
    public void setUnitPriceCurrCdLikeFront(String unitPriceCurrCdLikeFront) {
        this.unitPriceCurrCdLikeFront = unitPriceCurrCdLikeFront;
    }

    /**
     * qtyUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThan
     */
    public String getQtyUnitGreaterThan() {
        return qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThan のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThan qtyUnitGreaterThan に設定する
     */
    public void setQtyUnitGreaterThan(String qtyUnitGreaterThan) {
        this.qtyUnitGreaterThan = qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThanEqual
     */
    public String getQtyUnitGreaterThanEqual() {
        return qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThanEqual qtyUnitGreaterThanEqual に設定する
     */
    public void setQtyUnitGreaterThanEqual(String qtyUnitGreaterThanEqual) {
        this.qtyUnitGreaterThanEqual = qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitLessThan のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThan
     */
    public String getQtyUnitLessThan() {
        return qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThan のセッターメソッドです。
     * 
     * @param qtyUnitLessThan qtyUnitLessThan に設定する
     */
    public void setQtyUnitLessThan(String qtyUnitLessThan) {
        this.qtyUnitLessThan = qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThanEqual
     */
    public String getQtyUnitLessThanEqual() {
        return qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLessThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitLessThanEqual qtyUnitLessThanEqual に設定する
     */
    public void setQtyUnitLessThanEqual(String qtyUnitLessThanEqual) {
        this.qtyUnitLessThanEqual = qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLikeFront のゲッターメソッドです。
     * 
     * @return the qtyUnitLikeFront
     */
    public String getQtyUnitLikeFront() {
        return qtyUnitLikeFront;
    }

    /**
     * qtyUnitLikeFront のセッターメソッドです。
     * 
     * @param qtyUnitLikeFront qtyUnitLikeFront に設定する
     */
    public void setQtyUnitLikeFront(String qtyUnitLikeFront) {
        this.qtyUnitLikeFront = qtyUnitLikeFront;
    }

    /**
     * lengthUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThan
     */
    public String getLengthUnitGreaterThan() {
        return lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThan のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThan lengthUnitGreaterThan に設定する
     */
    public void setLengthUnitGreaterThan(String lengthUnitGreaterThan) {
        this.lengthUnitGreaterThan = lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThanEqual
     */
    public String getLengthUnitGreaterThanEqual() {
        return lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThanEqual lengthUnitGreaterThanEqual に設定する
     */
    public void setLengthUnitGreaterThanEqual(String lengthUnitGreaterThanEqual) {
        this.lengthUnitGreaterThanEqual = lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitLessThan のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThan
     */
    public String getLengthUnitLessThan() {
        return lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThan のセッターメソッドです。
     * 
     * @param lengthUnitLessThan lengthUnitLessThan に設定する
     */
    public void setLengthUnitLessThan(String lengthUnitLessThan) {
        this.lengthUnitLessThan = lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThanEqual
     */
    public String getLengthUnitLessThanEqual() {
        return lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLessThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitLessThanEqual lengthUnitLessThanEqual に設定する
     */
    public void setLengthUnitLessThanEqual(String lengthUnitLessThanEqual) {
        this.lengthUnitLessThanEqual = lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLikeFront のゲッターメソッドです。
     * 
     * @return the lengthUnitLikeFront
     */
    public String getLengthUnitLikeFront() {
        return lengthUnitLikeFront;
    }

    /**
     * lengthUnitLikeFront のセッターメソッドです。
     * 
     * @param lengthUnitLikeFront lengthUnitLikeFront に設定する
     */
    public void setLengthUnitLikeFront(String lengthUnitLikeFront) {
        this.lengthUnitLikeFront = lengthUnitLikeFront;
    }

}

