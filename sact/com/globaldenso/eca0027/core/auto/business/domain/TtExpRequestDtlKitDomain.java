/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlKit のDomainクラス
 * テーブル概要：TT_EXP_REQUEST_DTL_KIT
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
 * TtExpRequestDtlKit のDomainクラスです。<BR>
 * テーブル概要：TT_EXP_REQUEST_DTL_KIT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class TtExpRequestDtlKitDomain extends AbstractDomain implements Serializable {

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
     * EXP_REQUEST_KIT_ID
     */
    private BigDecimal expRequestKitId;

    /**
     * KIT_BRCH
     */
    private BigDecimal kitBrch;

    /**
     * RT_USE_FLG
     */
    private String rtUseFlg;

    /**
     * KIT_COMPONENT_ITEM_NM
     */
    private String kitComponentItemNm;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL
     */
    private String dngrGoodsImpExpCtrl;

    /**
     * KIT_COMPONENT_ITEM_NO
     */
    private String kitComponentItemNo;

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
     * UNIT_PRICE
     */
    private BigDecimal unitPrice;

    /**
     * COMMERCIAL_FLG
     */
    private String commercialFlg;

    /**
     * PACKING_STATUS
     */
    private String packingStatus;
    
    /**
     * KIT
     */
    private String kitCustomerItemNo;

    /**
     * CURRENCY CODE
     */
    private String currency;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

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
    public TtExpRequestDtlKitDomain() {
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
     * expRequestKitId のゲッターメソッドです。
     * 
     * @return the expRequestKitId
     */
    public BigDecimal getExpRequestKitId() {
        return expRequestKitId;
    }

    /**
     * expRequestKitId のセッターメソッドです。
     * 
     * @param expRequestKitId expRequestKitId に設定する
     */
    public void setExpRequestKitId(BigDecimal expRequestKitId) {
        this.expRequestKitId = expRequestKitId;
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
     * kitComponentItemNm のゲッターメソッドです。
     * 
     * @return the kitComponentItemNm
     */
    public String getKitComponentItemNm() {
        return kitComponentItemNm;
    }

    /**
     * kitComponentItemNm のセッターメソッドです。
     * 
     * @param kitComponentItemNm kitComponentItemNm に設定する
     */
    public void setKitComponentItemNm(String kitComponentItemNm) {
        this.kitComponentItemNm = kitComponentItemNm;
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
     * kitComponentItemNo のゲッターメソッドです。
     * 
     * @return the kitComponentItemNo
     */
    public String getKitComponentItemNo() {
        return kitComponentItemNo;
    }

    /**
     * kitComponentItemNo のセッターメソッドです。
     * 
     * @param kitComponentItemNo kitComponentItemNo に設定する
     */
    public void setKitComponentItemNo(String kitComponentItemNo) {
        this.kitComponentItemNo = kitComponentItemNo;
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
     * kitCustomerItemNo のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNo
     */
    public String getKitCustomerItemNo() {
        return kitCustomerItemNo;
    }

    /**
     * kitCustomerItemNo のセッターメソッドです。
     * 
     * @param kitCustomerItemNo kitCustomerItemNo に設定する
     */
    public void setKitCustomerItemNo(String kitCustomerItemNo) {
        this.kitCustomerItemNo = kitCustomerItemNo;
    }

    /**
     * currency のゲッターメソッドです。
     * 
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency のセッターメソッドです。
     * 
     * @param currency currency に設定する
     */
    public void setCurrency(String currency) {
        this.currency = currency;
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
