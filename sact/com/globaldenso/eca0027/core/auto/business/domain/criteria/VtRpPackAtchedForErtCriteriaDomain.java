/*
 * PROJECT：eca0027
 * 
 * VtRpPackAtchedForErt の検索条件Domainクラス
 * テーブル概要：VT_RP_PACK_ATCHED_FOR_ERT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * VtRpPackAtchedForErt の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_PACK_ATCHED_FOR_ERT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtRpPackAtchedForErtCriteriaDomain extends AbstractDomain implements Serializable {

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
     * PLTZ_ITEM_QTY
     */
    private BigDecimal pltzItemQty;

    /**
     * TOTAL_NET_WEIGHT_HEAD
     */
    private BigDecimal totalNetWeightHead;

    /**
     * TOTAL_GROSS_WEIGHT
     */
    private BigDecimal totalGrossWeight;

    /**
     * TOTAL_VOLUME
     */
    private BigDecimal totalVolume;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * NET_WEIGHT_CML
     */
    private BigDecimal netWeightCml;

    /**
     * NET_WEIGHT_UNIT_CML
     */
    private String netWeightUnitCml;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * GROSS_WEIGHT_UNIT
     */
    private String grossWeightUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

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
     * QTY
     */
    private BigDecimal qty;

    /**
     * QTY_UNIT
     */
    private String qtyUnit;

    /**
     * NET_WEIGHT_ITEM_NO
     */
    private BigDecimal netWeightItemNo;

    /**
     * NET_WEIGHT_UNIT_ITEM_NO
     */
    private String netWeightUnitItemNo;

    /**
     * TOTAL_NET_WEIGHT_ITEM_NO
     */
    private BigDecimal totalNetWeightItemNo;

    /**
     * TOTAL_NET_WEIGHT_UNIT
     */
    private String totalNetWeightUnit;

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
     * MAIN_MARK（大なり）
     */
    private String mainMarkGreaterThan;

    /**
     * MAIN_MARK（大なりイコール）
     */
    private String mainMarkGreaterThanEqual;

    /**
     * MAIN_MARK（小なり）
     */
    private String mainMarkLessThan;

    /**
     * MAIN_MARK（小なりイコール）
     */
    private String mainMarkLessThanEqual;

    /**
     * MAIN_MARK（前方一致）
     */
    private String mainMarkLikeFront;

    /**
     * NET_WEIGHT_UNIT_CML（大なり）
     */
    private String netWeightUnitCmlGreaterThan;

    /**
     * NET_WEIGHT_UNIT_CML（大なりイコール）
     */
    private String netWeightUnitCmlGreaterThanEqual;

    /**
     * NET_WEIGHT_UNIT_CML（小なり）
     */
    private String netWeightUnitCmlLessThan;

    /**
     * NET_WEIGHT_UNIT_CML（小なりイコール）
     */
    private String netWeightUnitCmlLessThanEqual;

    /**
     * NET_WEIGHT_UNIT_CML（前方一致）
     */
    private String netWeightUnitCmlLikeFront;

    /**
     * GROSS_WEIGHT_UNIT（大なり）
     */
    private String grossWeightUnitGreaterThan;

    /**
     * GROSS_WEIGHT_UNIT（大なりイコール）
     */
    private String grossWeightUnitGreaterThanEqual;

    /**
     * GROSS_WEIGHT_UNIT（小なり）
     */
    private String grossWeightUnitLessThan;

    /**
     * GROSS_WEIGHT_UNIT（小なりイコール）
     */
    private String grossWeightUnitLessThanEqual;

    /**
     * GROSS_WEIGHT_UNIT（前方一致）
     */
    private String grossWeightUnitLikeFront;

    /**
     * VOLUME_UNIT（大なり）
     */
    private String volumeUnitGreaterThan;

    /**
     * VOLUME_UNIT（大なりイコール）
     */
    private String volumeUnitGreaterThanEqual;

    /**
     * VOLUME_UNIT（小なり）
     */
    private String volumeUnitLessThan;

    /**
     * VOLUME_UNIT（小なりイコール）
     */
    private String volumeUnitLessThanEqual;

    /**
     * VOLUME_UNIT（前方一致）
     */
    private String volumeUnitLikeFront;

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
     * NET_WEIGHT_UNIT_ITEM_NO（大なり）
     */
    private String netWeightUnitItemNoGreaterThan;

    /**
     * NET_WEIGHT_UNIT_ITEM_NO（大なりイコール）
     */
    private String netWeightUnitItemNoGreaterThanEqual;

    /**
     * NET_WEIGHT_UNIT_ITEM_NO（小なり）
     */
    private String netWeightUnitItemNoLessThan;

    /**
     * NET_WEIGHT_UNIT_ITEM_NO（小なりイコール）
     */
    private String netWeightUnitItemNoLessThanEqual;

    /**
     * NET_WEIGHT_UNIT_ITEM_NO（前方一致）
     */
    private String netWeightUnitItemNoLikeFront;

    /**
     * TOTAL_NET_WEIGHT_UNIT（大なり）
     */
    private String totalNetWeightUnitGreaterThan;

    /**
     * TOTAL_NET_WEIGHT_UNIT（大なりイコール）
     */
    private String totalNetWeightUnitGreaterThanEqual;

    /**
     * TOTAL_NET_WEIGHT_UNIT（小なり）
     */
    private String totalNetWeightUnitLessThan;

    /**
     * TOTAL_NET_WEIGHT_UNIT（小なりイコール）
     */
    private String totalNetWeightUnitLessThanEqual;

    /**
     * TOTAL_NET_WEIGHT_UNIT（前方一致）
     */
    private String totalNetWeightUnitLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackAtchedForErtCriteriaDomain() {
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
     * pltzItemQty のゲッターメソッドです。
     * 
     * @return the pltzItemQty
     */
    public BigDecimal getPltzItemQty() {
        return pltzItemQty;
    }

    /**
     * pltzItemQty のセッターメソッドです。
     * 
     * @param pltzItemQty pltzItemQty に設定する
     */
    public void setPltzItemQty(BigDecimal pltzItemQty) {
        this.pltzItemQty = pltzItemQty;
    }

    /**
     * totalNetWeightHead のゲッターメソッドです。
     * 
     * @return the totalNetWeightHead
     */
    public BigDecimal getTotalNetWeightHead() {
        return totalNetWeightHead;
    }

    /**
     * totalNetWeightHead のセッターメソッドです。
     * 
     * @param totalNetWeightHead totalNetWeightHead に設定する
     */
    public void setTotalNetWeightHead(BigDecimal totalNetWeightHead) {
        this.totalNetWeightHead = totalNetWeightHead;
    }

    /**
     * totalGrossWeight のゲッターメソッドです。
     * 
     * @return the totalGrossWeight
     */
    public BigDecimal getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * totalGrossWeight のセッターメソッドです。
     * 
     * @param totalGrossWeight totalGrossWeight に設定する
     */
    public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /**
     * totalVolume のゲッターメソッドです。
     * 
     * @return the totalVolume
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * totalVolume のセッターメソッドです。
     * 
     * @param totalVolume totalVolume に設定する
     */
    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
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
     * netWeightCml のゲッターメソッドです。
     * 
     * @return the netWeightCml
     */
    public BigDecimal getNetWeightCml() {
        return netWeightCml;
    }

    /**
     * netWeightCml のセッターメソッドです。
     * 
     * @param netWeightCml netWeightCml に設定する
     */
    public void setNetWeightCml(BigDecimal netWeightCml) {
        this.netWeightCml = netWeightCml;
    }

    /**
     * netWeightUnitCml のゲッターメソッドです。
     * 
     * @return the netWeightUnitCml
     */
    public String getNetWeightUnitCml() {
        return netWeightUnitCml;
    }

    /**
     * netWeightUnitCml のセッターメソッドです。
     * 
     * @param netWeightUnitCml netWeightUnitCml に設定する
     */
    public void setNetWeightUnitCml(String netWeightUnitCml) {
        this.netWeightUnitCml = netWeightUnitCml;
    }

    /**
     * grossWeight のゲッターメソッドです。
     * 
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * grossWeight のセッターメソッドです。
     * 
     * @param grossWeight grossWeight に設定する
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * grossWeightUnit のゲッターメソッドです。
     * 
     * @return the grossWeightUnit
     */
    public String getGrossWeightUnit() {
        return grossWeightUnit;
    }

    /**
     * grossWeightUnit のセッターメソッドです。
     * 
     * @param grossWeightUnit grossWeightUnit に設定する
     */
    public void setGrossWeightUnit(String grossWeightUnit) {
        this.grossWeightUnit = grossWeightUnit;
    }

    /**
     * volume のゲッターメソッドです。
     * 
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * volume のセッターメソッドです。
     * 
     * @param volume volume に設定する
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * volumeUnit のゲッターメソッドです。
     * 
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * volumeUnit のセッターメソッドです。
     * 
     * @param volumeUnit volumeUnit に設定する
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
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
     * netWeightItemNo のゲッターメソッドです。
     * 
     * @return the netWeightItemNo
     */
    public BigDecimal getNetWeightItemNo() {
        return netWeightItemNo;
    }

    /**
     * netWeightItemNo のセッターメソッドです。
     * 
     * @param netWeightItemNo netWeightItemNo に設定する
     */
    public void setNetWeightItemNo(BigDecimal netWeightItemNo) {
        this.netWeightItemNo = netWeightItemNo;
    }

    /**
     * netWeightUnitItemNo のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNo
     */
    public String getNetWeightUnitItemNo() {
        return netWeightUnitItemNo;
    }

    /**
     * netWeightUnitItemNo のセッターメソッドです。
     * 
     * @param netWeightUnitItemNo netWeightUnitItemNo に設定する
     */
    public void setNetWeightUnitItemNo(String netWeightUnitItemNo) {
        this.netWeightUnitItemNo = netWeightUnitItemNo;
    }

    /**
     * totalNetWeightItemNo のゲッターメソッドです。
     * 
     * @return the totalNetWeightItemNo
     */
    public BigDecimal getTotalNetWeightItemNo() {
        return totalNetWeightItemNo;
    }

    /**
     * totalNetWeightItemNo のセッターメソッドです。
     * 
     * @param totalNetWeightItemNo totalNetWeightItemNo に設定する
     */
    public void setTotalNetWeightItemNo(BigDecimal totalNetWeightItemNo) {
        this.totalNetWeightItemNo = totalNetWeightItemNo;
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
     * mainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThan
     */
    public String getMainMarkGreaterThan() {
        return mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThan のセッターメソッドです。
     * 
     * @param mainMarkGreaterThan mainMarkGreaterThan に設定する
     */
    public void setMainMarkGreaterThan(String mainMarkGreaterThan) {
        this.mainMarkGreaterThan = mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThanEqual
     */
    public String getMainMarkGreaterThanEqual() {
        return mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param mainMarkGreaterThanEqual mainMarkGreaterThanEqual に設定する
     */
    public void setMainMarkGreaterThanEqual(String mainMarkGreaterThanEqual) {
        this.mainMarkGreaterThanEqual = mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkLessThan のゲッターメソッドです。
     * 
     * @return the mainMarkLessThan
     */
    public String getMainMarkLessThan() {
        return mainMarkLessThan;
    }

    /**
     * mainMarkLessThan のセッターメソッドです。
     * 
     * @param mainMarkLessThan mainMarkLessThan に設定する
     */
    public void setMainMarkLessThan(String mainMarkLessThan) {
        this.mainMarkLessThan = mainMarkLessThan;
    }

    /**
     * mainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkLessThanEqual
     */
    public String getMainMarkLessThanEqual() {
        return mainMarkLessThanEqual;
    }

    /**
     * mainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param mainMarkLessThanEqual mainMarkLessThanEqual に設定する
     */
    public void setMainMarkLessThanEqual(String mainMarkLessThanEqual) {
        this.mainMarkLessThanEqual = mainMarkLessThanEqual;
    }

    /**
     * mainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the mainMarkLikeFront
     */
    public String getMainMarkLikeFront() {
        return mainMarkLikeFront;
    }

    /**
     * mainMarkLikeFront のセッターメソッドです。
     * 
     * @param mainMarkLikeFront mainMarkLikeFront に設定する
     */
    public void setMainMarkLikeFront(String mainMarkLikeFront) {
        this.mainMarkLikeFront = mainMarkLikeFront;
    }

    /**
     * netWeightUnitCmlGreaterThan のゲッターメソッドです。
     * 
     * @return the netWeightUnitCmlGreaterThan
     */
    public String getNetWeightUnitCmlGreaterThan() {
        return netWeightUnitCmlGreaterThan;
    }

    /**
     * netWeightUnitCmlGreaterThan のセッターメソッドです。
     * 
     * @param netWeightUnitCmlGreaterThan netWeightUnitCmlGreaterThan に設定する
     */
    public void setNetWeightUnitCmlGreaterThan(String netWeightUnitCmlGreaterThan) {
        this.netWeightUnitCmlGreaterThan = netWeightUnitCmlGreaterThan;
    }

    /**
     * netWeightUnitCmlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the netWeightUnitCmlGreaterThanEqual
     */
    public String getNetWeightUnitCmlGreaterThanEqual() {
        return netWeightUnitCmlGreaterThanEqual;
    }

    /**
     * netWeightUnitCmlGreaterThanEqual のセッターメソッドです。
     * 
     * @param netWeightUnitCmlGreaterThanEqual netWeightUnitCmlGreaterThanEqual に設定する
     */
    public void setNetWeightUnitCmlGreaterThanEqual(String netWeightUnitCmlGreaterThanEqual) {
        this.netWeightUnitCmlGreaterThanEqual = netWeightUnitCmlGreaterThanEqual;
    }

    /**
     * netWeightUnitCmlLessThan のゲッターメソッドです。
     * 
     * @return the netWeightUnitCmlLessThan
     */
    public String getNetWeightUnitCmlLessThan() {
        return netWeightUnitCmlLessThan;
    }

    /**
     * netWeightUnitCmlLessThan のセッターメソッドです。
     * 
     * @param netWeightUnitCmlLessThan netWeightUnitCmlLessThan に設定する
     */
    public void setNetWeightUnitCmlLessThan(String netWeightUnitCmlLessThan) {
        this.netWeightUnitCmlLessThan = netWeightUnitCmlLessThan;
    }

    /**
     * netWeightUnitCmlLessThanEqual のゲッターメソッドです。
     * 
     * @return the netWeightUnitCmlLessThanEqual
     */
    public String getNetWeightUnitCmlLessThanEqual() {
        return netWeightUnitCmlLessThanEqual;
    }

    /**
     * netWeightUnitCmlLessThanEqual のセッターメソッドです。
     * 
     * @param netWeightUnitCmlLessThanEqual netWeightUnitCmlLessThanEqual に設定する
     */
    public void setNetWeightUnitCmlLessThanEqual(String netWeightUnitCmlLessThanEqual) {
        this.netWeightUnitCmlLessThanEqual = netWeightUnitCmlLessThanEqual;
    }

    /**
     * netWeightUnitCmlLikeFront のゲッターメソッドです。
     * 
     * @return the netWeightUnitCmlLikeFront
     */
    public String getNetWeightUnitCmlLikeFront() {
        return netWeightUnitCmlLikeFront;
    }

    /**
     * netWeightUnitCmlLikeFront のセッターメソッドです。
     * 
     * @param netWeightUnitCmlLikeFront netWeightUnitCmlLikeFront に設定する
     */
    public void setNetWeightUnitCmlLikeFront(String netWeightUnitCmlLikeFront) {
        this.netWeightUnitCmlLikeFront = netWeightUnitCmlLikeFront;
    }

    /**
     * grossWeightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the grossWeightUnitGreaterThan
     */
    public String getGrossWeightUnitGreaterThan() {
        return grossWeightUnitGreaterThan;
    }

    /**
     * grossWeightUnitGreaterThan のセッターメソッドです。
     * 
     * @param grossWeightUnitGreaterThan grossWeightUnitGreaterThan に設定する
     */
    public void setGrossWeightUnitGreaterThan(String grossWeightUnitGreaterThan) {
        this.grossWeightUnitGreaterThan = grossWeightUnitGreaterThan;
    }

    /**
     * grossWeightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the grossWeightUnitGreaterThanEqual
     */
    public String getGrossWeightUnitGreaterThanEqual() {
        return grossWeightUnitGreaterThanEqual;
    }

    /**
     * grossWeightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param grossWeightUnitGreaterThanEqual grossWeightUnitGreaterThanEqual に設定する
     */
    public void setGrossWeightUnitGreaterThanEqual(String grossWeightUnitGreaterThanEqual) {
        this.grossWeightUnitGreaterThanEqual = grossWeightUnitGreaterThanEqual;
    }

    /**
     * grossWeightUnitLessThan のゲッターメソッドです。
     * 
     * @return the grossWeightUnitLessThan
     */
    public String getGrossWeightUnitLessThan() {
        return grossWeightUnitLessThan;
    }

    /**
     * grossWeightUnitLessThan のセッターメソッドです。
     * 
     * @param grossWeightUnitLessThan grossWeightUnitLessThan に設定する
     */
    public void setGrossWeightUnitLessThan(String grossWeightUnitLessThan) {
        this.grossWeightUnitLessThan = grossWeightUnitLessThan;
    }

    /**
     * grossWeightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the grossWeightUnitLessThanEqual
     */
    public String getGrossWeightUnitLessThanEqual() {
        return grossWeightUnitLessThanEqual;
    }

    /**
     * grossWeightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param grossWeightUnitLessThanEqual grossWeightUnitLessThanEqual に設定する
     */
    public void setGrossWeightUnitLessThanEqual(String grossWeightUnitLessThanEqual) {
        this.grossWeightUnitLessThanEqual = grossWeightUnitLessThanEqual;
    }

    /**
     * grossWeightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the grossWeightUnitLikeFront
     */
    public String getGrossWeightUnitLikeFront() {
        return grossWeightUnitLikeFront;
    }

    /**
     * grossWeightUnitLikeFront のセッターメソッドです。
     * 
     * @param grossWeightUnitLikeFront grossWeightUnitLikeFront に設定する
     */
    public void setGrossWeightUnitLikeFront(String grossWeightUnitLikeFront) {
        this.grossWeightUnitLikeFront = grossWeightUnitLikeFront;
    }

    /**
     * volumeUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the volumeUnitGreaterThan
     */
    public String getVolumeUnitGreaterThan() {
        return volumeUnitGreaterThan;
    }

    /**
     * volumeUnitGreaterThan のセッターメソッドです。
     * 
     * @param volumeUnitGreaterThan volumeUnitGreaterThan に設定する
     */
    public void setVolumeUnitGreaterThan(String volumeUnitGreaterThan) {
        this.volumeUnitGreaterThan = volumeUnitGreaterThan;
    }

    /**
     * volumeUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitGreaterThanEqual
     */
    public String getVolumeUnitGreaterThanEqual() {
        return volumeUnitGreaterThanEqual;
    }

    /**
     * volumeUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitGreaterThanEqual volumeUnitGreaterThanEqual に設定する
     */
    public void setVolumeUnitGreaterThanEqual(String volumeUnitGreaterThanEqual) {
        this.volumeUnitGreaterThanEqual = volumeUnitGreaterThanEqual;
    }

    /**
     * volumeUnitLessThan のゲッターメソッドです。
     * 
     * @return the volumeUnitLessThan
     */
    public String getVolumeUnitLessThan() {
        return volumeUnitLessThan;
    }

    /**
     * volumeUnitLessThan のセッターメソッドです。
     * 
     * @param volumeUnitLessThan volumeUnitLessThan に設定する
     */
    public void setVolumeUnitLessThan(String volumeUnitLessThan) {
        this.volumeUnitLessThan = volumeUnitLessThan;
    }

    /**
     * volumeUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitLessThanEqual
     */
    public String getVolumeUnitLessThanEqual() {
        return volumeUnitLessThanEqual;
    }

    /**
     * volumeUnitLessThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitLessThanEqual volumeUnitLessThanEqual に設定する
     */
    public void setVolumeUnitLessThanEqual(String volumeUnitLessThanEqual) {
        this.volumeUnitLessThanEqual = volumeUnitLessThanEqual;
    }

    /**
     * volumeUnitLikeFront のゲッターメソッドです。
     * 
     * @return the volumeUnitLikeFront
     */
    public String getVolumeUnitLikeFront() {
        return volumeUnitLikeFront;
    }

    /**
     * volumeUnitLikeFront のセッターメソッドです。
     * 
     * @param volumeUnitLikeFront volumeUnitLikeFront に設定する
     */
    public void setVolumeUnitLikeFront(String volumeUnitLikeFront) {
        this.volumeUnitLikeFront = volumeUnitLikeFront;
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
     * netWeightUnitItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNoGreaterThan
     */
    public String getNetWeightUnitItemNoGreaterThan() {
        return netWeightUnitItemNoGreaterThan;
    }

    /**
     * netWeightUnitItemNoGreaterThan のセッターメソッドです。
     * 
     * @param netWeightUnitItemNoGreaterThan netWeightUnitItemNoGreaterThan に設定する
     */
    public void setNetWeightUnitItemNoGreaterThan(String netWeightUnitItemNoGreaterThan) {
        this.netWeightUnitItemNoGreaterThan = netWeightUnitItemNoGreaterThan;
    }

    /**
     * netWeightUnitItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNoGreaterThanEqual
     */
    public String getNetWeightUnitItemNoGreaterThanEqual() {
        return netWeightUnitItemNoGreaterThanEqual;
    }

    /**
     * netWeightUnitItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param netWeightUnitItemNoGreaterThanEqual netWeightUnitItemNoGreaterThanEqual に設定する
     */
    public void setNetWeightUnitItemNoGreaterThanEqual(String netWeightUnitItemNoGreaterThanEqual) {
        this.netWeightUnitItemNoGreaterThanEqual = netWeightUnitItemNoGreaterThanEqual;
    }

    /**
     * netWeightUnitItemNoLessThan のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNoLessThan
     */
    public String getNetWeightUnitItemNoLessThan() {
        return netWeightUnitItemNoLessThan;
    }

    /**
     * netWeightUnitItemNoLessThan のセッターメソッドです。
     * 
     * @param netWeightUnitItemNoLessThan netWeightUnitItemNoLessThan に設定する
     */
    public void setNetWeightUnitItemNoLessThan(String netWeightUnitItemNoLessThan) {
        this.netWeightUnitItemNoLessThan = netWeightUnitItemNoLessThan;
    }

    /**
     * netWeightUnitItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNoLessThanEqual
     */
    public String getNetWeightUnitItemNoLessThanEqual() {
        return netWeightUnitItemNoLessThanEqual;
    }

    /**
     * netWeightUnitItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param netWeightUnitItemNoLessThanEqual netWeightUnitItemNoLessThanEqual に設定する
     */
    public void setNetWeightUnitItemNoLessThanEqual(String netWeightUnitItemNoLessThanEqual) {
        this.netWeightUnitItemNoLessThanEqual = netWeightUnitItemNoLessThanEqual;
    }

    /**
     * netWeightUnitItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the netWeightUnitItemNoLikeFront
     */
    public String getNetWeightUnitItemNoLikeFront() {
        return netWeightUnitItemNoLikeFront;
    }

    /**
     * netWeightUnitItemNoLikeFront のセッターメソッドです。
     * 
     * @param netWeightUnitItemNoLikeFront netWeightUnitItemNoLikeFront に設定する
     */
    public void setNetWeightUnitItemNoLikeFront(String netWeightUnitItemNoLikeFront) {
        this.netWeightUnitItemNoLikeFront = netWeightUnitItemNoLikeFront;
    }

    /**
     * totalNetWeightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnitGreaterThan
     */
    public String getTotalNetWeightUnitGreaterThan() {
        return totalNetWeightUnitGreaterThan;
    }

    /**
     * totalNetWeightUnitGreaterThan のセッターメソッドです。
     * 
     * @param totalNetWeightUnitGreaterThan totalNetWeightUnitGreaterThan に設定する
     */
    public void setTotalNetWeightUnitGreaterThan(String totalNetWeightUnitGreaterThan) {
        this.totalNetWeightUnitGreaterThan = totalNetWeightUnitGreaterThan;
    }

    /**
     * totalNetWeightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnitGreaterThanEqual
     */
    public String getTotalNetWeightUnitGreaterThanEqual() {
        return totalNetWeightUnitGreaterThanEqual;
    }

    /**
     * totalNetWeightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param totalNetWeightUnitGreaterThanEqual totalNetWeightUnitGreaterThanEqual に設定する
     */
    public void setTotalNetWeightUnitGreaterThanEqual(String totalNetWeightUnitGreaterThanEqual) {
        this.totalNetWeightUnitGreaterThanEqual = totalNetWeightUnitGreaterThanEqual;
    }

    /**
     * totalNetWeightUnitLessThan のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnitLessThan
     */
    public String getTotalNetWeightUnitLessThan() {
        return totalNetWeightUnitLessThan;
    }

    /**
     * totalNetWeightUnitLessThan のセッターメソッドです。
     * 
     * @param totalNetWeightUnitLessThan totalNetWeightUnitLessThan に設定する
     */
    public void setTotalNetWeightUnitLessThan(String totalNetWeightUnitLessThan) {
        this.totalNetWeightUnitLessThan = totalNetWeightUnitLessThan;
    }

    /**
     * totalNetWeightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnitLessThanEqual
     */
    public String getTotalNetWeightUnitLessThanEqual() {
        return totalNetWeightUnitLessThanEqual;
    }

    /**
     * totalNetWeightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param totalNetWeightUnitLessThanEqual totalNetWeightUnitLessThanEqual に設定する
     */
    public void setTotalNetWeightUnitLessThanEqual(String totalNetWeightUnitLessThanEqual) {
        this.totalNetWeightUnitLessThanEqual = totalNetWeightUnitLessThanEqual;
    }

    /**
     * totalNetWeightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the totalNetWeightUnitLikeFront
     */
    public String getTotalNetWeightUnitLikeFront() {
        return totalNetWeightUnitLikeFront;
    }

    /**
     * totalNetWeightUnitLikeFront のセッターメソッドです。
     * 
     * @param totalNetWeightUnitLikeFront totalNetWeightUnitLikeFront に設定する
     */
    public void setTotalNetWeightUnitLikeFront(String totalNetWeightUnitLikeFront) {
        this.totalNetWeightUnitLikeFront = totalNetWeightUnitLikeFront;
    }

}

