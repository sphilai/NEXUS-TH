/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl のDomainクラス
 * テーブル概要：TT_EXP_REQUEST_DTL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtExpRequestDtl のDomainクラスです。<BR>
 * テーブル概要：TT_EXP_REQUEST_DTL<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TtExpRequestDtlDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * EXP_REQUEST_NO
     */
    private String expRequestNo;

    /**
     * EXP_REQUEST_ITEM_ID
     */
    private BigDecimal expRequestItemId;

    /**
     * LINE_NO
     */
    private BigDecimal lineNo;

    /**
     * CUSTOMER_PO_NO
     */
    private String customerPoNo;

    /**
     * DESCRIPTION
     */
    private String description;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL
     */
    private String dngrGoodsImpExpCtrl;

    /**
     * KIT_PAR_FLG
     */
    private String kitParFlg;

    /**
     * RT_USE_FLG
     */
    private String rtUseFlg;

    /**
     * CUSTOMER_ITEM_NO
     */
    private String customerItemNo;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * ORIGIN_CNTRY_CD
     */
    private String originCntryCd;

    /**
     * QTY_UNIT
     */
    private String qtyUnit;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * UNIT_PRICE
     */
    private BigDecimal unitPrice;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * COMMERCIAL_FLG
     */
    private String commercialFlg;

    /**
     * RE_EXP_GOODS_FLG
     */
    private String reExpGoodsFlg;

    /**
     * LOCATION_NO
     */
    private String locationNo;

    /**
     * CONSTRUCTION_WORK_NO
     */
    private String constructionWorkNo;

    /**
     * PACKING_STATUS
     */
    private String packingStatus;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlDomain() {
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
     * expRequestItemId のゲッターメソッドです。
     * 
     * @return the expRequestItemId
     */
    public BigDecimal getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * expRequestItemId のセッターメソッドです。
     * 
     * @param expRequestItemId expRequestItemId に設定する
     */
    public void setExpRequestItemId(BigDecimal expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
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
     * description のゲッターメソッドです。
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * description のセッターメソッドです。
     * 
     * @param description description に設定する
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * dngrGoodsImpExpCtrl のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrl
     */
    public String getDngrGoodsImpExpCtrl() {
        return dngrGoodsImpExpCtrl;
    }

    /**
     * dngrGoodsImpExpCtrl のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrl dngrGoodsImpExpCtrl に設定する
     */
    public void setDngrGoodsImpExpCtrl(String dngrGoodsImpExpCtrl) {
        this.dngrGoodsImpExpCtrl = dngrGoodsImpExpCtrl;
    }

    /**
     * kitParFlg のゲッターメソッドです。
     * 
     * @return the kitParFlg
     */
    public String getKitParFlg() {
        return kitParFlg;
    }

    /**
     * kitParFlg のセッターメソッドです。
     * 
     * @param kitParFlg kitParFlg に設定する
     */
    public void setKitParFlg(String kitParFlg) {
        this.kitParFlg = kitParFlg;
    }

    /**
     * rtUseFlg のゲッターメソッドです。
     * 
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }

    /**
     * rtUseFlg のセッターメソッドです。
     * 
     * @param rtUseFlg rtUseFlg に設定する
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
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
     * commercialFlg のゲッターメソッドです。
     * 
     * @return the commercialFlg
     */
    public String getCommercialFlg() {
        return commercialFlg;
    }

    /**
     * commercialFlg のセッターメソッドです。
     * 
     * @param commercialFlg commercialFlg に設定する
     */
    public void setCommercialFlg(String commercialFlg) {
        this.commercialFlg = commercialFlg;
    }

    /**
     * reExpGoodsFlg のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * reExpGoodsFlg のセッターメソッドです。
     * 
     * @param reExpGoodsFlg reExpGoodsFlg に設定する
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * locationNo のゲッターメソッドです。
     * 
     * @return the locationNo
     */
    public String getLocationNo() {
        return locationNo;
    }

    /**
     * locationNo のセッターメソッドです。
     * 
     * @param locationNo locationNo に設定する
     */
    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    /**
     * constructionWorkNo のゲッターメソッドです。
     * 
     * @return the constructionWorkNo
     */
    public String getConstructionWorkNo() {
        return constructionWorkNo;
    }

    /**
     * constructionWorkNo のセッターメソッドです。
     * 
     * @param constructionWorkNo constructionWorkNo に設定する
     */
    public void setConstructionWorkNo(String constructionWorkNo) {
        this.constructionWorkNo = constructionWorkNo;
    }

    /**
     * packingStatus のゲッターメソッドです。
     * 
     * @return the packingStatus
     */
    public String getPackingStatus() {
        return packingStatus;
    }

    /**
     * packingStatus のセッターメソッドです。
     * 
     * @param packingStatus packingStatus に設定する
     */
    public void setPackingStatus(String packingStatus) {
        this.packingStatus = packingStatus;
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
