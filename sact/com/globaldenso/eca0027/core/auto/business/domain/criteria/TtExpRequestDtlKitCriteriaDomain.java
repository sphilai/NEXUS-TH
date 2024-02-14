/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtlKit の検索条件Domainクラス
 * テーブル概要：TT_EXP_REQUEST_DTL_KIT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtExpRequestDtlKit の検索条件Domainクラスです。<BR>
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
public class TtExpRequestDtlKitCriteriaDomain extends AbstractDomain implements Serializable {

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
     * EXP_REQUEST_NO（大なり）
     */
    private String expRequestNoGreaterThan;

    /**
     * EXP_REQUEST_NO（大なりイコール）
     */
    private String expRequestNoGreaterThanEqual;

    /**
     * EXP_REQUEST_NO（小なり）
     */
    private String expRequestNoLessThan;

    /**
     * EXP_REQUEST_NO（小なりイコール）
     */
    private String expRequestNoLessThanEqual;

    /**
     * EXP_REQUEST_NO（前方一致）
     */
    private String expRequestNoLikeFront;

    /**
     * RT_USE_FLG（大なり）
     */
    private String rtUseFlgGreaterThan;

    /**
     * RT_USE_FLG（大なりイコール）
     */
    private String rtUseFlgGreaterThanEqual;

    /**
     * RT_USE_FLG（小なり）
     */
    private String rtUseFlgLessThan;

    /**
     * RT_USE_FLG（小なりイコール）
     */
    private String rtUseFlgLessThanEqual;

    /**
     * RT_USE_FLG（前方一致）
     */
    private String rtUseFlgLikeFront;

    /**
     * KIT_COMPONENT_ITEM_NM（大なり）
     */
    private String kitComponentItemNmGreaterThan;

    /**
     * KIT_COMPONENT_ITEM_NM（大なりイコール）
     */
    private String kitComponentItemNmGreaterThanEqual;

    /**
     * KIT_COMPONENT_ITEM_NM（小なり）
     */
    private String kitComponentItemNmLessThan;

    /**
     * KIT_COMPONENT_ITEM_NM（小なりイコール）
     */
    private String kitComponentItemNmLessThanEqual;

    /**
     * KIT_COMPONENT_ITEM_NM（前方一致）
     */
    private String kitComponentItemNmLikeFront;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL（大なり）
     */
    private String dngrGoodsImpExpCtrlGreaterThan;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL（大なりイコール）
     */
    private String dngrGoodsImpExpCtrlGreaterThanEqual;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL（小なり）
     */
    private String dngrGoodsImpExpCtrlLessThan;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL（小なりイコール）
     */
    private String dngrGoodsImpExpCtrlLessThanEqual;

    /**
     * DNGR_GOODS_IMP_EXP_CTRL（前方一致）
     */
    private String dngrGoodsImpExpCtrlLikeFront;

    /**
     * KIT_COMPONENT_ITEM_NO（大なり）
     */
    private String kitComponentItemNoGreaterThan;

    /**
     * KIT_COMPONENT_ITEM_NO（大なりイコール）
     */
    private String kitComponentItemNoGreaterThanEqual;

    /**
     * KIT_COMPONENT_ITEM_NO（小なり）
     */
    private String kitComponentItemNoLessThan;

    /**
     * KIT_COMPONENT_ITEM_NO（小なりイコール）
     */
    private String kitComponentItemNoLessThanEqual;

    /**
     * KIT_COMPONENT_ITEM_NO（前方一致）
     */
    private String kitComponentItemNoLikeFront;

    /**
     * ORIGIN_CNTRY_CD（大なり）
     */
    private String originCntryCdGreaterThan;

    /**
     * ORIGIN_CNTRY_CD（大なりイコール）
     */
    private String originCntryCdGreaterThanEqual;

    /**
     * ORIGIN_CNTRY_CD（小なり）
     */
    private String originCntryCdLessThan;

    /**
     * ORIGIN_CNTRY_CD（小なりイコール）
     */
    private String originCntryCdLessThanEqual;

    /**
     * ORIGIN_CNTRY_CD（前方一致）
     */
    private String originCntryCdLikeFront;

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
     * COMMERCIAL_FLG（大なり）
     */
    private String commercialFlgGreaterThan;

    /**
     * COMMERCIAL_FLG（大なりイコール）
     */
    private String commercialFlgGreaterThanEqual;

    /**
     * COMMERCIAL_FLG（小なり）
     */
    private String commercialFlgLessThan;

    /**
     * COMMERCIAL_FLG（小なりイコール）
     */
    private String commercialFlgLessThanEqual;

    /**
     * COMMERCIAL_FLG（前方一致）
     */
    private String commercialFlgLikeFront;

    /**
     * PACKING_STATUS（大なり）
     */
    private String packingStatusGreaterThan;

    /**
     * PACKING_STATUS（大なりイコール）
     */
    private String packingStatusGreaterThanEqual;

    /**
     * PACKING_STATUS（小なり）
     */
    private String packingStatusLessThan;

    /**
     * PACKING_STATUS（小なりイコール）
     */
    private String packingStatusLessThanEqual;

    /**
     * PACKING_STATUS（前方一致）
     */
    private String packingStatusLikeFront;

    /**
     * COM_UPDATE_FUNC_ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * COM_UPDATE_FUNC_ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * COM_UPDATE_FUNC_ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * COM_UPDATE_USER_ID（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * COM_UPDATE_USER_ID（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * COM_UPDATE_USER_ID（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * COM_UPDATE_USER_ID（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * COM_UPDATE_USER_ID（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * COM_CREATE_FUNC_ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * COM_CREATE_FUNC_ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * COM_CREATE_FUNC_ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * COM_CREATE_FUNC_ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * COM_CREATE_FUNC_ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * COM_CREATE_USER_ID（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * COM_CREATE_USER_ID（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * COM_CREATE_USER_ID（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * COM_CREATE_USER_ID（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * COM_CREATE_USER_ID（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * KIT（大なり）
     */
    private String kitCustomerItemNoGreaterThan;

    /**
     * KIT（大なりイコール）
     */
    private String kitCustomerItemNoGreaterThanEqual;

    /**
     * KIT（小なり）
     */
    private String kitCustomerItemNoLessThan;

    /**
     * KIT（小なりイコール）
     */
    private String kitCustomerItemNoLessThanEqual;

    /**
     * KIT（前方一致）
     */
    private String kitCustomerItemNoLikeFront;

    /**
     * CURRENCY CODE（大なり）
     */
    private String currencyGreaterThan;

    /**
     * CURRENCY CODE（大なりイコール）
     */
    private String currencyGreaterThanEqual;

    /**
     * CURRENCY CODE（小なり）
     */
    private String currencyLessThan;

    /**
     * CURRENCY CODE（小なりイコール）
     */
    private String currencyLessThanEqual;

    /**
     * CURRENCY CODE（前方一致）
     */
    private String currencyLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TtExpRequestDtlKitCriteriaDomain() {
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
     * expRequestNoGreaterThan のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThan
     */
    public String getExpRequestNoGreaterThan() {
        return expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThan のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThan expRequestNoGreaterThan に設定する
     */
    public void setExpRequestNoGreaterThan(String expRequestNoGreaterThan) {
        this.expRequestNoGreaterThan = expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThanEqual
     */
    public String getExpRequestNoGreaterThanEqual() {
        return expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThanEqual expRequestNoGreaterThanEqual に設定する
     */
    public void setExpRequestNoGreaterThanEqual(String expRequestNoGreaterThanEqual) {
        this.expRequestNoGreaterThanEqual = expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoLessThan のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThan
     */
    public String getExpRequestNoLessThan() {
        return expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThan のセッターメソッドです。
     * 
     * @param expRequestNoLessThan expRequestNoLessThan に設定する
     */
    public void setExpRequestNoLessThan(String expRequestNoLessThan) {
        this.expRequestNoLessThan = expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThanEqual
     */
    public String getExpRequestNoLessThanEqual() {
        return expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLessThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoLessThanEqual expRequestNoLessThanEqual に設定する
     */
    public void setExpRequestNoLessThanEqual(String expRequestNoLessThanEqual) {
        this.expRequestNoLessThanEqual = expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLikeFront のゲッターメソッドです。
     * 
     * @return the expRequestNoLikeFront
     */
    public String getExpRequestNoLikeFront() {
        return expRequestNoLikeFront;
    }

    /**
     * expRequestNoLikeFront のセッターメソッドです。
     * 
     * @param expRequestNoLikeFront expRequestNoLikeFront に設定する
     */
    public void setExpRequestNoLikeFront(String expRequestNoLikeFront) {
        this.expRequestNoLikeFront = expRequestNoLikeFront;
    }

    /**
     * rtUseFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the rtUseFlgGreaterThan
     */
    public String getRtUseFlgGreaterThan() {
        return rtUseFlgGreaterThan;
    }

    /**
     * rtUseFlgGreaterThan のセッターメソッドです。
     * 
     * @param rtUseFlgGreaterThan rtUseFlgGreaterThan に設定する
     */
    public void setRtUseFlgGreaterThan(String rtUseFlgGreaterThan) {
        this.rtUseFlgGreaterThan = rtUseFlgGreaterThan;
    }

    /**
     * rtUseFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rtUseFlgGreaterThanEqual
     */
    public String getRtUseFlgGreaterThanEqual() {
        return rtUseFlgGreaterThanEqual;
    }

    /**
     * rtUseFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param rtUseFlgGreaterThanEqual rtUseFlgGreaterThanEqual に設定する
     */
    public void setRtUseFlgGreaterThanEqual(String rtUseFlgGreaterThanEqual) {
        this.rtUseFlgGreaterThanEqual = rtUseFlgGreaterThanEqual;
    }

    /**
     * rtUseFlgLessThan のゲッターメソッドです。
     * 
     * @return the rtUseFlgLessThan
     */
    public String getRtUseFlgLessThan() {
        return rtUseFlgLessThan;
    }

    /**
     * rtUseFlgLessThan のセッターメソッドです。
     * 
     * @param rtUseFlgLessThan rtUseFlgLessThan に設定する
     */
    public void setRtUseFlgLessThan(String rtUseFlgLessThan) {
        this.rtUseFlgLessThan = rtUseFlgLessThan;
    }

    /**
     * rtUseFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the rtUseFlgLessThanEqual
     */
    public String getRtUseFlgLessThanEqual() {
        return rtUseFlgLessThanEqual;
    }

    /**
     * rtUseFlgLessThanEqual のセッターメソッドです。
     * 
     * @param rtUseFlgLessThanEqual rtUseFlgLessThanEqual に設定する
     */
    public void setRtUseFlgLessThanEqual(String rtUseFlgLessThanEqual) {
        this.rtUseFlgLessThanEqual = rtUseFlgLessThanEqual;
    }

    /**
     * rtUseFlgLikeFront のゲッターメソッドです。
     * 
     * @return the rtUseFlgLikeFront
     */
    public String getRtUseFlgLikeFront() {
        return rtUseFlgLikeFront;
    }

    /**
     * rtUseFlgLikeFront のセッターメソッドです。
     * 
     * @param rtUseFlgLikeFront rtUseFlgLikeFront に設定する
     */
    public void setRtUseFlgLikeFront(String rtUseFlgLikeFront) {
        this.rtUseFlgLikeFront = rtUseFlgLikeFront;
    }

    /**
     * kitComponentItemNmGreaterThan のゲッターメソッドです。
     * 
     * @return the kitComponentItemNmGreaterThan
     */
    public String getKitComponentItemNmGreaterThan() {
        return kitComponentItemNmGreaterThan;
    }

    /**
     * kitComponentItemNmGreaterThan のセッターメソッドです。
     * 
     * @param kitComponentItemNmGreaterThan kitComponentItemNmGreaterThan に設定する
     */
    public void setKitComponentItemNmGreaterThan(String kitComponentItemNmGreaterThan) {
        this.kitComponentItemNmGreaterThan = kitComponentItemNmGreaterThan;
    }

    /**
     * kitComponentItemNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitComponentItemNmGreaterThanEqual
     */
    public String getKitComponentItemNmGreaterThanEqual() {
        return kitComponentItemNmGreaterThanEqual;
    }

    /**
     * kitComponentItemNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitComponentItemNmGreaterThanEqual kitComponentItemNmGreaterThanEqual に設定する
     */
    public void setKitComponentItemNmGreaterThanEqual(String kitComponentItemNmGreaterThanEqual) {
        this.kitComponentItemNmGreaterThanEqual = kitComponentItemNmGreaterThanEqual;
    }

    /**
     * kitComponentItemNmLessThan のゲッターメソッドです。
     * 
     * @return the kitComponentItemNmLessThan
     */
    public String getKitComponentItemNmLessThan() {
        return kitComponentItemNmLessThan;
    }

    /**
     * kitComponentItemNmLessThan のセッターメソッドです。
     * 
     * @param kitComponentItemNmLessThan kitComponentItemNmLessThan に設定する
     */
    public void setKitComponentItemNmLessThan(String kitComponentItemNmLessThan) {
        this.kitComponentItemNmLessThan = kitComponentItemNmLessThan;
    }

    /**
     * kitComponentItemNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitComponentItemNmLessThanEqual
     */
    public String getKitComponentItemNmLessThanEqual() {
        return kitComponentItemNmLessThanEqual;
    }

    /**
     * kitComponentItemNmLessThanEqual のセッターメソッドです。
     * 
     * @param kitComponentItemNmLessThanEqual kitComponentItemNmLessThanEqual に設定する
     */
    public void setKitComponentItemNmLessThanEqual(String kitComponentItemNmLessThanEqual) {
        this.kitComponentItemNmLessThanEqual = kitComponentItemNmLessThanEqual;
    }

    /**
     * kitComponentItemNmLikeFront のゲッターメソッドです。
     * 
     * @return the kitComponentItemNmLikeFront
     */
    public String getKitComponentItemNmLikeFront() {
        return kitComponentItemNmLikeFront;
    }

    /**
     * kitComponentItemNmLikeFront のセッターメソッドです。
     * 
     * @param kitComponentItemNmLikeFront kitComponentItemNmLikeFront に設定する
     */
    public void setKitComponentItemNmLikeFront(String kitComponentItemNmLikeFront) {
        this.kitComponentItemNmLikeFront = kitComponentItemNmLikeFront;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThan のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlGreaterThan
     */
    public String getDngrGoodsImpExpCtrlGreaterThan() {
        return dngrGoodsImpExpCtrlGreaterThan;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThan のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlGreaterThan dngrGoodsImpExpCtrlGreaterThan に設定する
     */
    public void setDngrGoodsImpExpCtrlGreaterThan(String dngrGoodsImpExpCtrlGreaterThan) {
        this.dngrGoodsImpExpCtrlGreaterThan = dngrGoodsImpExpCtrlGreaterThan;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlGreaterThanEqual
     */
    public String getDngrGoodsImpExpCtrlGreaterThanEqual() {
        return dngrGoodsImpExpCtrlGreaterThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlGreaterThanEqual のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlGreaterThanEqual dngrGoodsImpExpCtrlGreaterThanEqual に設定する
     */
    public void setDngrGoodsImpExpCtrlGreaterThanEqual(String dngrGoodsImpExpCtrlGreaterThanEqual) {
        this.dngrGoodsImpExpCtrlGreaterThanEqual = dngrGoodsImpExpCtrlGreaterThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLessThan のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLessThan
     */
    public String getDngrGoodsImpExpCtrlLessThan() {
        return dngrGoodsImpExpCtrlLessThan;
    }

    /**
     * dngrGoodsImpExpCtrlLessThan のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLessThan dngrGoodsImpExpCtrlLessThan に設定する
     */
    public void setDngrGoodsImpExpCtrlLessThan(String dngrGoodsImpExpCtrlLessThan) {
        this.dngrGoodsImpExpCtrlLessThan = dngrGoodsImpExpCtrlLessThan;
    }

    /**
     * dngrGoodsImpExpCtrlLessThanEqual のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLessThanEqual
     */
    public String getDngrGoodsImpExpCtrlLessThanEqual() {
        return dngrGoodsImpExpCtrlLessThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLessThanEqual のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLessThanEqual dngrGoodsImpExpCtrlLessThanEqual に設定する
     */
    public void setDngrGoodsImpExpCtrlLessThanEqual(String dngrGoodsImpExpCtrlLessThanEqual) {
        this.dngrGoodsImpExpCtrlLessThanEqual = dngrGoodsImpExpCtrlLessThanEqual;
    }

    /**
     * dngrGoodsImpExpCtrlLikeFront のゲッターメソッドです。
     * 
     * @return the dngrGoodsImpExpCtrlLikeFront
     */
    public String getDngrGoodsImpExpCtrlLikeFront() {
        return dngrGoodsImpExpCtrlLikeFront;
    }

    /**
     * dngrGoodsImpExpCtrlLikeFront のセッターメソッドです。
     * 
     * @param dngrGoodsImpExpCtrlLikeFront dngrGoodsImpExpCtrlLikeFront に設定する
     */
    public void setDngrGoodsImpExpCtrlLikeFront(String dngrGoodsImpExpCtrlLikeFront) {
        this.dngrGoodsImpExpCtrlLikeFront = dngrGoodsImpExpCtrlLikeFront;
    }

    /**
     * kitComponentItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the kitComponentItemNoGreaterThan
     */
    public String getKitComponentItemNoGreaterThan() {
        return kitComponentItemNoGreaterThan;
    }

    /**
     * kitComponentItemNoGreaterThan のセッターメソッドです。
     * 
     * @param kitComponentItemNoGreaterThan kitComponentItemNoGreaterThan に設定する
     */
    public void setKitComponentItemNoGreaterThan(String kitComponentItemNoGreaterThan) {
        this.kitComponentItemNoGreaterThan = kitComponentItemNoGreaterThan;
    }

    /**
     * kitComponentItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitComponentItemNoGreaterThanEqual
     */
    public String getKitComponentItemNoGreaterThanEqual() {
        return kitComponentItemNoGreaterThanEqual;
    }

    /**
     * kitComponentItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitComponentItemNoGreaterThanEqual kitComponentItemNoGreaterThanEqual に設定する
     */
    public void setKitComponentItemNoGreaterThanEqual(String kitComponentItemNoGreaterThanEqual) {
        this.kitComponentItemNoGreaterThanEqual = kitComponentItemNoGreaterThanEqual;
    }

    /**
     * kitComponentItemNoLessThan のゲッターメソッドです。
     * 
     * @return the kitComponentItemNoLessThan
     */
    public String getKitComponentItemNoLessThan() {
        return kitComponentItemNoLessThan;
    }

    /**
     * kitComponentItemNoLessThan のセッターメソッドです。
     * 
     * @param kitComponentItemNoLessThan kitComponentItemNoLessThan に設定する
     */
    public void setKitComponentItemNoLessThan(String kitComponentItemNoLessThan) {
        this.kitComponentItemNoLessThan = kitComponentItemNoLessThan;
    }

    /**
     * kitComponentItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitComponentItemNoLessThanEqual
     */
    public String getKitComponentItemNoLessThanEqual() {
        return kitComponentItemNoLessThanEqual;
    }

    /**
     * kitComponentItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param kitComponentItemNoLessThanEqual kitComponentItemNoLessThanEqual に設定する
     */
    public void setKitComponentItemNoLessThanEqual(String kitComponentItemNoLessThanEqual) {
        this.kitComponentItemNoLessThanEqual = kitComponentItemNoLessThanEqual;
    }

    /**
     * kitComponentItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the kitComponentItemNoLikeFront
     */
    public String getKitComponentItemNoLikeFront() {
        return kitComponentItemNoLikeFront;
    }

    /**
     * kitComponentItemNoLikeFront のセッターメソッドです。
     * 
     * @param kitComponentItemNoLikeFront kitComponentItemNoLikeFront に設定する
     */
    public void setKitComponentItemNoLikeFront(String kitComponentItemNoLikeFront) {
        this.kitComponentItemNoLikeFront = kitComponentItemNoLikeFront;
    }

    /**
     * originCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThan
     */
    public String getOriginCntryCdGreaterThan() {
        return originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThan originCntryCdGreaterThan に設定する
     */
    public void setOriginCntryCdGreaterThan(String originCntryCdGreaterThan) {
        this.originCntryCdGreaterThan = originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThanEqual
     */
    public String getOriginCntryCdGreaterThanEqual() {
        return originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThanEqual originCntryCdGreaterThanEqual に設定する
     */
    public void setOriginCntryCdGreaterThanEqual(String originCntryCdGreaterThanEqual) {
        this.originCntryCdGreaterThanEqual = originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThan
     */
    public String getOriginCntryCdLessThan() {
        return originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThan のセッターメソッドです。
     * 
     * @param originCntryCdLessThan originCntryCdLessThan に設定する
     */
    public void setOriginCntryCdLessThan(String originCntryCdLessThan) {
        this.originCntryCdLessThan = originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThanEqual
     */
    public String getOriginCntryCdLessThanEqual() {
        return originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdLessThanEqual originCntryCdLessThanEqual に設定する
     */
    public void setOriginCntryCdLessThanEqual(String originCntryCdLessThanEqual) {
        this.originCntryCdLessThanEqual = originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryCdLikeFront
     */
    public String getOriginCntryCdLikeFront() {
        return originCntryCdLikeFront;
    }

    /**
     * originCntryCdLikeFront のセッターメソッドです。
     * 
     * @param originCntryCdLikeFront originCntryCdLikeFront に設定する
     */
    public void setOriginCntryCdLikeFront(String originCntryCdLikeFront) {
        this.originCntryCdLikeFront = originCntryCdLikeFront;
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
     * commercialFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the commercialFlgGreaterThan
     */
    public String getCommercialFlgGreaterThan() {
        return commercialFlgGreaterThan;
    }

    /**
     * commercialFlgGreaterThan のセッターメソッドです。
     * 
     * @param commercialFlgGreaterThan commercialFlgGreaterThan に設定する
     */
    public void setCommercialFlgGreaterThan(String commercialFlgGreaterThan) {
        this.commercialFlgGreaterThan = commercialFlgGreaterThan;
    }

    /**
     * commercialFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the commercialFlgGreaterThanEqual
     */
    public String getCommercialFlgGreaterThanEqual() {
        return commercialFlgGreaterThanEqual;
    }

    /**
     * commercialFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param commercialFlgGreaterThanEqual commercialFlgGreaterThanEqual に設定する
     */
    public void setCommercialFlgGreaterThanEqual(String commercialFlgGreaterThanEqual) {
        this.commercialFlgGreaterThanEqual = commercialFlgGreaterThanEqual;
    }

    /**
     * commercialFlgLessThan のゲッターメソッドです。
     * 
     * @return the commercialFlgLessThan
     */
    public String getCommercialFlgLessThan() {
        return commercialFlgLessThan;
    }

    /**
     * commercialFlgLessThan のセッターメソッドです。
     * 
     * @param commercialFlgLessThan commercialFlgLessThan に設定する
     */
    public void setCommercialFlgLessThan(String commercialFlgLessThan) {
        this.commercialFlgLessThan = commercialFlgLessThan;
    }

    /**
     * commercialFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the commercialFlgLessThanEqual
     */
    public String getCommercialFlgLessThanEqual() {
        return commercialFlgLessThanEqual;
    }

    /**
     * commercialFlgLessThanEqual のセッターメソッドです。
     * 
     * @param commercialFlgLessThanEqual commercialFlgLessThanEqual に設定する
     */
    public void setCommercialFlgLessThanEqual(String commercialFlgLessThanEqual) {
        this.commercialFlgLessThanEqual = commercialFlgLessThanEqual;
    }

    /**
     * commercialFlgLikeFront のゲッターメソッドです。
     * 
     * @return the commercialFlgLikeFront
     */
    public String getCommercialFlgLikeFront() {
        return commercialFlgLikeFront;
    }

    /**
     * commercialFlgLikeFront のセッターメソッドです。
     * 
     * @param commercialFlgLikeFront commercialFlgLikeFront に設定する
     */
    public void setCommercialFlgLikeFront(String commercialFlgLikeFront) {
        this.commercialFlgLikeFront = commercialFlgLikeFront;
    }

    /**
     * packingStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the packingStatusGreaterThan
     */
    public String getPackingStatusGreaterThan() {
        return packingStatusGreaterThan;
    }

    /**
     * packingStatusGreaterThan のセッターメソッドです。
     * 
     * @param packingStatusGreaterThan packingStatusGreaterThan に設定する
     */
    public void setPackingStatusGreaterThan(String packingStatusGreaterThan) {
        this.packingStatusGreaterThan = packingStatusGreaterThan;
    }

    /**
     * packingStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingStatusGreaterThanEqual
     */
    public String getPackingStatusGreaterThanEqual() {
        return packingStatusGreaterThanEqual;
    }

    /**
     * packingStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingStatusGreaterThanEqual packingStatusGreaterThanEqual に設定する
     */
    public void setPackingStatusGreaterThanEqual(String packingStatusGreaterThanEqual) {
        this.packingStatusGreaterThanEqual = packingStatusGreaterThanEqual;
    }

    /**
     * packingStatusLessThan のゲッターメソッドです。
     * 
     * @return the packingStatusLessThan
     */
    public String getPackingStatusLessThan() {
        return packingStatusLessThan;
    }

    /**
     * packingStatusLessThan のセッターメソッドです。
     * 
     * @param packingStatusLessThan packingStatusLessThan に設定する
     */
    public void setPackingStatusLessThan(String packingStatusLessThan) {
        this.packingStatusLessThan = packingStatusLessThan;
    }

    /**
     * packingStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingStatusLessThanEqual
     */
    public String getPackingStatusLessThanEqual() {
        return packingStatusLessThanEqual;
    }

    /**
     * packingStatusLessThanEqual のセッターメソッドです。
     * 
     * @param packingStatusLessThanEqual packingStatusLessThanEqual に設定する
     */
    public void setPackingStatusLessThanEqual(String packingStatusLessThanEqual) {
        this.packingStatusLessThanEqual = packingStatusLessThanEqual;
    }

    /**
     * packingStatusLikeFront のゲッターメソッドです。
     * 
     * @return the packingStatusLikeFront
     */
    public String getPackingStatusLikeFront() {
        return packingStatusLikeFront;
    }

    /**
     * packingStatusLikeFront のセッターメソッドです。
     * 
     * @param packingStatusLikeFront packingStatusLikeFront に設定する
     */
    public void setPackingStatusLikeFront(String packingStatusLikeFront) {
        this.packingStatusLikeFront = packingStatusLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

    /**
     * kitCustomerItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNoGreaterThan
     */
    public String getKitCustomerItemNoGreaterThan() {
        return kitCustomerItemNoGreaterThan;
    }

    /**
     * kitCustomerItemNoGreaterThan のセッターメソッドです。
     * 
     * @param kitCustomerItemNoGreaterThan kitCustomerItemNoGreaterThan に設定する
     */
    public void setKitCustomerItemNoGreaterThan(String kitCustomerItemNoGreaterThan) {
        this.kitCustomerItemNoGreaterThan = kitCustomerItemNoGreaterThan;
    }

    /**
     * kitCustomerItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNoGreaterThanEqual
     */
    public String getKitCustomerItemNoGreaterThanEqual() {
        return kitCustomerItemNoGreaterThanEqual;
    }

    /**
     * kitCustomerItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitCustomerItemNoGreaterThanEqual kitCustomerItemNoGreaterThanEqual に設定する
     */
    public void setKitCustomerItemNoGreaterThanEqual(String kitCustomerItemNoGreaterThanEqual) {
        this.kitCustomerItemNoGreaterThanEqual = kitCustomerItemNoGreaterThanEqual;
    }

    /**
     * kitCustomerItemNoLessThan のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNoLessThan
     */
    public String getKitCustomerItemNoLessThan() {
        return kitCustomerItemNoLessThan;
    }

    /**
     * kitCustomerItemNoLessThan のセッターメソッドです。
     * 
     * @param kitCustomerItemNoLessThan kitCustomerItemNoLessThan に設定する
     */
    public void setKitCustomerItemNoLessThan(String kitCustomerItemNoLessThan) {
        this.kitCustomerItemNoLessThan = kitCustomerItemNoLessThan;
    }

    /**
     * kitCustomerItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNoLessThanEqual
     */
    public String getKitCustomerItemNoLessThanEqual() {
        return kitCustomerItemNoLessThanEqual;
    }

    /**
     * kitCustomerItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param kitCustomerItemNoLessThanEqual kitCustomerItemNoLessThanEqual に設定する
     */
    public void setKitCustomerItemNoLessThanEqual(String kitCustomerItemNoLessThanEqual) {
        this.kitCustomerItemNoLessThanEqual = kitCustomerItemNoLessThanEqual;
    }

    /**
     * kitCustomerItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the kitCustomerItemNoLikeFront
     */
    public String getKitCustomerItemNoLikeFront() {
        return kitCustomerItemNoLikeFront;
    }

    /**
     * kitCustomerItemNoLikeFront のセッターメソッドです。
     * 
     * @param kitCustomerItemNoLikeFront kitCustomerItemNoLikeFront に設定する
     */
    public void setKitCustomerItemNoLikeFront(String kitCustomerItemNoLikeFront) {
        this.kitCustomerItemNoLikeFront = kitCustomerItemNoLikeFront;
    }

    /**
     * currencyGreaterThan のゲッターメソッドです。
     * 
     * @return the currencyGreaterThan
     */
    public String getCurrencyGreaterThan() {
        return currencyGreaterThan;
    }

    /**
     * currencyGreaterThan のセッターメソッドです。
     * 
     * @param currencyGreaterThan currencyGreaterThan に設定する
     */
    public void setCurrencyGreaterThan(String currencyGreaterThan) {
        this.currencyGreaterThan = currencyGreaterThan;
    }

    /**
     * currencyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the currencyGreaterThanEqual
     */
    public String getCurrencyGreaterThanEqual() {
        return currencyGreaterThanEqual;
    }

    /**
     * currencyGreaterThanEqual のセッターメソッドです。
     * 
     * @param currencyGreaterThanEqual currencyGreaterThanEqual に設定する
     */
    public void setCurrencyGreaterThanEqual(String currencyGreaterThanEqual) {
        this.currencyGreaterThanEqual = currencyGreaterThanEqual;
    }

    /**
     * currencyLessThan のゲッターメソッドです。
     * 
     * @return the currencyLessThan
     */
    public String getCurrencyLessThan() {
        return currencyLessThan;
    }

    /**
     * currencyLessThan のセッターメソッドです。
     * 
     * @param currencyLessThan currencyLessThan に設定する
     */
    public void setCurrencyLessThan(String currencyLessThan) {
        this.currencyLessThan = currencyLessThan;
    }

    /**
     * currencyLessThanEqual のゲッターメソッドです。
     * 
     * @return the currencyLessThanEqual
     */
    public String getCurrencyLessThanEqual() {
        return currencyLessThanEqual;
    }

    /**
     * currencyLessThanEqual のセッターメソッドです。
     * 
     * @param currencyLessThanEqual currencyLessThanEqual に設定する
     */
    public void setCurrencyLessThanEqual(String currencyLessThanEqual) {
        this.currencyLessThanEqual = currencyLessThanEqual;
    }

    /**
     * currencyLikeFront のゲッターメソッドです。
     * 
     * @return the currencyLikeFront
     */
    public String getCurrencyLikeFront() {
        return currencyLikeFront;
    }

    /**
     * currencyLikeFront のセッターメソッドです。
     * 
     * @param currencyLikeFront currencyLikeFront に設定する
     */
    public void setCurrencyLikeFront(String currencyLikeFront) {
        this.currencyLikeFront = currencyLikeFront;
    }

}

