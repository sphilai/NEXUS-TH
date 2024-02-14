/*
 * PROJECT：eca0027
 * 
 * TtMixtagItemNo の検索条件Domainクラス
 * テーブル概要：TT_MIXTAG_ITEM_NO
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
 * TtMixtagItemNo の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_MIXTAG_ITEM_NO<BR>
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
public class TtMixtagItemNoCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX_TAG_NO
     */
    private String mixTagNo;

    /**
     * ITEM_NO
     */
    private String itemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * SHIPPING_LOT
     */
    private BigDecimal shippingLot;

    /**
     * ITEM_DESCRIPTION
     */
    private String itemDescription;

    /**
     * TAG_QTY
     */
    private BigDecimal tagQty;

    /**
     * INSTR_QTY
     */
    private BigDecimal instrQty;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * ITEM_WEIGHT
     */
    private BigDecimal itemWeight;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * QTY_UNIT
     */
    private String qtyUnit;

    /**
     * ITEM_TYP
     */
    private String itemTyp;

    /**
     * EXP_LIMIT_TYP
     */
    private String expLimitTyp;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * ORIGIN_CNTRY_CD
     */
    private String originCntryCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * CUSTOMER_ITEM_NO
     */
    private String customerItemNo;

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
     * MIX_TAG_NO（大なり）
     */
    private String mixTagNoGreaterThan;

    /**
     * MIX_TAG_NO（大なりイコール）
     */
    private String mixTagNoGreaterThanEqual;

    /**
     * MIX_TAG_NO（小なり）
     */
    private String mixTagNoLessThan;

    /**
     * MIX_TAG_NO（小なりイコール）
     */
    private String mixTagNoLessThanEqual;

    /**
     * MIX_TAG_NO（前方一致）
     */
    private String mixTagNoLikeFront;

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
     * WEIGHT_UNIT（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT_UNIT（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT_UNIT（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT_UNIT（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT_UNIT（前方一致）
     */
    private String weightUnitLikeFront;

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
     * ITEM_TYP（大なり）
     */
    private String itemTypGreaterThan;

    /**
     * ITEM_TYP（大なりイコール）
     */
    private String itemTypGreaterThanEqual;

    /**
     * ITEM_TYP（小なり）
     */
    private String itemTypLessThan;

    /**
     * ITEM_TYP（小なりイコール）
     */
    private String itemTypLessThanEqual;

    /**
     * ITEM_TYP（前方一致）
     */
    private String itemTypLikeFront;

    /**
     * EXP_LIMIT_TYP（大なり）
     */
    private String expLimitTypGreaterThan;

    /**
     * EXP_LIMIT_TYP（大なりイコール）
     */
    private String expLimitTypGreaterThanEqual;

    /**
     * EXP_LIMIT_TYP（小なり）
     */
    private String expLimitTypLessThan;

    /**
     * EXP_LIMIT_TYP（小なりイコール）
     */
    private String expLimitTypLessThanEqual;

    /**
     * EXP_LIMIT_TYP（前方一致）
     */
    private String expLimitTypLikeFront;

    /**
     * DNGR_ITEM_FLG（大なり）
     */
    private String dngrItemFlgGreaterThan;

    /**
     * DNGR_ITEM_FLG（大なりイコール）
     */
    private String dngrItemFlgGreaterThanEqual;

    /**
     * DNGR_ITEM_FLG（小なり）
     */
    private String dngrItemFlgLessThan;

    /**
     * DNGR_ITEM_FLG（小なりイコール）
     */
    private String dngrItemFlgLessThanEqual;

    /**
     * DNGR_ITEM_FLG（前方一致）
     */
    private String dngrItemFlgLikeFront;

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
     * PLNT_CD（大なり）
     */
    private String plntCdGreaterThan;

    /**
     * PLNT_CD（大なりイコール）
     */
    private String plntCdGreaterThanEqual;

    /**
     * PLNT_CD（小なり）
     */
    private String plntCdLessThan;

    /**
     * PLNT_CD（小なりイコール）
     */
    private String plntCdLessThanEqual;

    /**
     * PLNT_CD（前方一致）
     */
    private String plntCdLikeFront;

    /**
     * CUSTOMER_ITEM_NO（大なり）
     */
    private String customerItemNoGreaterThan;

    /**
     * CUSTOMER_ITEM_NO（大なりイコール）
     */
    private String customerItemNoGreaterThanEqual;

    /**
     * CUSTOMER_ITEM_NO（小なり）
     */
    private String customerItemNoLessThan;

    /**
     * CUSTOMER_ITEM_NO（小なりイコール）
     */
    private String customerItemNoLessThanEqual;

    /**
     * CUSTOMER_ITEM_NO（前方一致）
     */
    private String customerItemNoLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public TtMixtagItemNoCriteriaDomain() {
    }

    /**
     * mixTagNo のゲッターメソッドです。
     * 
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * mixTagNo のセッターメソッドです。
     * 
     * @param mixTagNo mixTagNo に設定する
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
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
     * shippingLot のゲッターメソッドです。
     * 
     * @return the shippingLot
     */
    public BigDecimal getShippingLot() {
        return shippingLot;
    }

    /**
     * shippingLot のセッターメソッドです。
     * 
     * @param shippingLot shippingLot に設定する
     */
    public void setShippingLot(BigDecimal shippingLot) {
        this.shippingLot = shippingLot;
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
     * tagQty のゲッターメソッドです。
     * 
     * @return the tagQty
     */
    public BigDecimal getTagQty() {
        return tagQty;
    }

    /**
     * tagQty のセッターメソッドです。
     * 
     * @param tagQty tagQty に設定する
     */
    public void setTagQty(BigDecimal tagQty) {
        this.tagQty = tagQty;
    }

    /**
     * instrQty のゲッターメソッドです。
     * 
     * @return the instrQty
     */
    public BigDecimal getInstrQty() {
        return instrQty;
    }

    /**
     * instrQty のセッターメソッドです。
     * 
     * @param instrQty instrQty に設定する
     */
    public void setInstrQty(BigDecimal instrQty) {
        this.instrQty = instrQty;
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
     * itemTyp のゲッターメソッドです。
     * 
     * @return the itemTyp
     */
    public String getItemTyp() {
        return itemTyp;
    }

    /**
     * itemTyp のセッターメソッドです。
     * 
     * @param itemTyp itemTyp に設定する
     */
    public void setItemTyp(String itemTyp) {
        this.itemTyp = itemTyp;
    }

    /**
     * expLimitTyp のゲッターメソッドです。
     * 
     * @return the expLimitTyp
     */
    public String getExpLimitTyp() {
        return expLimitTyp;
    }

    /**
     * expLimitTyp のセッターメソッドです。
     * 
     * @param expLimitTyp expLimitTyp に設定する
     */
    public void setExpLimitTyp(String expLimitTyp) {
        this.expLimitTyp = expLimitTyp;
    }

    /**
     * dngrItemFlg のゲッターメソッドです。
     * 
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * dngrItemFlg のセッターメソッドです。
     * 
     * @param dngrItemFlg dngrItemFlg に設定する
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
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
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
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
     * mixTagNoGreaterThan のゲッターメソッドです。
     * 
     * @return the mixTagNoGreaterThan
     */
    public String getMixTagNoGreaterThan() {
        return mixTagNoGreaterThan;
    }

    /**
     * mixTagNoGreaterThan のセッターメソッドです。
     * 
     * @param mixTagNoGreaterThan mixTagNoGreaterThan に設定する
     */
    public void setMixTagNoGreaterThan(String mixTagNoGreaterThan) {
        this.mixTagNoGreaterThan = mixTagNoGreaterThan;
    }

    /**
     * mixTagNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagNoGreaterThanEqual
     */
    public String getMixTagNoGreaterThanEqual() {
        return mixTagNoGreaterThanEqual;
    }

    /**
     * mixTagNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param mixTagNoGreaterThanEqual mixTagNoGreaterThanEqual に設定する
     */
    public void setMixTagNoGreaterThanEqual(String mixTagNoGreaterThanEqual) {
        this.mixTagNoGreaterThanEqual = mixTagNoGreaterThanEqual;
    }

    /**
     * mixTagNoLessThan のゲッターメソッドです。
     * 
     * @return the mixTagNoLessThan
     */
    public String getMixTagNoLessThan() {
        return mixTagNoLessThan;
    }

    /**
     * mixTagNoLessThan のセッターメソッドです。
     * 
     * @param mixTagNoLessThan mixTagNoLessThan に設定する
     */
    public void setMixTagNoLessThan(String mixTagNoLessThan) {
        this.mixTagNoLessThan = mixTagNoLessThan;
    }

    /**
     * mixTagNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagNoLessThanEqual
     */
    public String getMixTagNoLessThanEqual() {
        return mixTagNoLessThanEqual;
    }

    /**
     * mixTagNoLessThanEqual のセッターメソッドです。
     * 
     * @param mixTagNoLessThanEqual mixTagNoLessThanEqual に設定する
     */
    public void setMixTagNoLessThanEqual(String mixTagNoLessThanEqual) {
        this.mixTagNoLessThanEqual = mixTagNoLessThanEqual;
    }

    /**
     * mixTagNoLikeFront のゲッターメソッドです。
     * 
     * @return the mixTagNoLikeFront
     */
    public String getMixTagNoLikeFront() {
        return mixTagNoLikeFront;
    }

    /**
     * mixTagNoLikeFront のセッターメソッドです。
     * 
     * @param mixTagNoLikeFront mixTagNoLikeFront に設定する
     */
    public void setMixTagNoLikeFront(String mixTagNoLikeFront) {
        this.mixTagNoLikeFront = mixTagNoLikeFront;
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
     * weightUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThan
     */
    public String getWeightUnitGreaterThan() {
        return weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThan のセッターメソッドです。
     * 
     * @param weightUnitGreaterThan weightUnitGreaterThan に設定する
     */
    public void setWeightUnitGreaterThan(String weightUnitGreaterThan) {
        this.weightUnitGreaterThan = weightUnitGreaterThan;
    }

    /**
     * weightUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitGreaterThanEqual
     */
    public String getWeightUnitGreaterThanEqual() {
        return weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param weightUnitGreaterThanEqual weightUnitGreaterThanEqual に設定する
     */
    public void setWeightUnitGreaterThanEqual(String weightUnitGreaterThanEqual) {
        this.weightUnitGreaterThanEqual = weightUnitGreaterThanEqual;
    }

    /**
     * weightUnitLessThan のゲッターメソッドです。
     * 
     * @return the weightUnitLessThan
     */
    public String getWeightUnitLessThan() {
        return weightUnitLessThan;
    }

    /**
     * weightUnitLessThan のセッターメソッドです。
     * 
     * @param weightUnitLessThan weightUnitLessThan に設定する
     */
    public void setWeightUnitLessThan(String weightUnitLessThan) {
        this.weightUnitLessThan = weightUnitLessThan;
    }

    /**
     * weightUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitLessThanEqual
     */
    public String getWeightUnitLessThanEqual() {
        return weightUnitLessThanEqual;
    }

    /**
     * weightUnitLessThanEqual のセッターメソッドです。
     * 
     * @param weightUnitLessThanEqual weightUnitLessThanEqual に設定する
     */
    public void setWeightUnitLessThanEqual(String weightUnitLessThanEqual) {
        this.weightUnitLessThanEqual = weightUnitLessThanEqual;
    }

    /**
     * weightUnitLikeFront のゲッターメソッドです。
     * 
     * @return the weightUnitLikeFront
     */
    public String getWeightUnitLikeFront() {
        return weightUnitLikeFront;
    }

    /**
     * weightUnitLikeFront のセッターメソッドです。
     * 
     * @param weightUnitLikeFront weightUnitLikeFront に設定する
     */
    public void setWeightUnitLikeFront(String weightUnitLikeFront) {
        this.weightUnitLikeFront = weightUnitLikeFront;
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
     * itemTypGreaterThan のゲッターメソッドです。
     * 
     * @return the itemTypGreaterThan
     */
    public String getItemTypGreaterThan() {
        return itemTypGreaterThan;
    }

    /**
     * itemTypGreaterThan のセッターメソッドです。
     * 
     * @param itemTypGreaterThan itemTypGreaterThan に設定する
     */
    public void setItemTypGreaterThan(String itemTypGreaterThan) {
        this.itemTypGreaterThan = itemTypGreaterThan;
    }

    /**
     * itemTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemTypGreaterThanEqual
     */
    public String getItemTypGreaterThanEqual() {
        return itemTypGreaterThanEqual;
    }

    /**
     * itemTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemTypGreaterThanEqual itemTypGreaterThanEqual に設定する
     */
    public void setItemTypGreaterThanEqual(String itemTypGreaterThanEqual) {
        this.itemTypGreaterThanEqual = itemTypGreaterThanEqual;
    }

    /**
     * itemTypLessThan のゲッターメソッドです。
     * 
     * @return the itemTypLessThan
     */
    public String getItemTypLessThan() {
        return itemTypLessThan;
    }

    /**
     * itemTypLessThan のセッターメソッドです。
     * 
     * @param itemTypLessThan itemTypLessThan に設定する
     */
    public void setItemTypLessThan(String itemTypLessThan) {
        this.itemTypLessThan = itemTypLessThan;
    }

    /**
     * itemTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemTypLessThanEqual
     */
    public String getItemTypLessThanEqual() {
        return itemTypLessThanEqual;
    }

    /**
     * itemTypLessThanEqual のセッターメソッドです。
     * 
     * @param itemTypLessThanEqual itemTypLessThanEqual に設定する
     */
    public void setItemTypLessThanEqual(String itemTypLessThanEqual) {
        this.itemTypLessThanEqual = itemTypLessThanEqual;
    }

    /**
     * itemTypLikeFront のゲッターメソッドです。
     * 
     * @return the itemTypLikeFront
     */
    public String getItemTypLikeFront() {
        return itemTypLikeFront;
    }

    /**
     * itemTypLikeFront のセッターメソッドです。
     * 
     * @param itemTypLikeFront itemTypLikeFront に設定する
     */
    public void setItemTypLikeFront(String itemTypLikeFront) {
        this.itemTypLikeFront = itemTypLikeFront;
    }

    /**
     * expLimitTypGreaterThan のゲッターメソッドです。
     * 
     * @return the expLimitTypGreaterThan
     */
    public String getExpLimitTypGreaterThan() {
        return expLimitTypGreaterThan;
    }

    /**
     * expLimitTypGreaterThan のセッターメソッドです。
     * 
     * @param expLimitTypGreaterThan expLimitTypGreaterThan に設定する
     */
    public void setExpLimitTypGreaterThan(String expLimitTypGreaterThan) {
        this.expLimitTypGreaterThan = expLimitTypGreaterThan;
    }

    /**
     * expLimitTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expLimitTypGreaterThanEqual
     */
    public String getExpLimitTypGreaterThanEqual() {
        return expLimitTypGreaterThanEqual;
    }

    /**
     * expLimitTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param expLimitTypGreaterThanEqual expLimitTypGreaterThanEqual に設定する
     */
    public void setExpLimitTypGreaterThanEqual(String expLimitTypGreaterThanEqual) {
        this.expLimitTypGreaterThanEqual = expLimitTypGreaterThanEqual;
    }

    /**
     * expLimitTypLessThan のゲッターメソッドです。
     * 
     * @return the expLimitTypLessThan
     */
    public String getExpLimitTypLessThan() {
        return expLimitTypLessThan;
    }

    /**
     * expLimitTypLessThan のセッターメソッドです。
     * 
     * @param expLimitTypLessThan expLimitTypLessThan に設定する
     */
    public void setExpLimitTypLessThan(String expLimitTypLessThan) {
        this.expLimitTypLessThan = expLimitTypLessThan;
    }

    /**
     * expLimitTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the expLimitTypLessThanEqual
     */
    public String getExpLimitTypLessThanEqual() {
        return expLimitTypLessThanEqual;
    }

    /**
     * expLimitTypLessThanEqual のセッターメソッドです。
     * 
     * @param expLimitTypLessThanEqual expLimitTypLessThanEqual に設定する
     */
    public void setExpLimitTypLessThanEqual(String expLimitTypLessThanEqual) {
        this.expLimitTypLessThanEqual = expLimitTypLessThanEqual;
    }

    /**
     * expLimitTypLikeFront のゲッターメソッドです。
     * 
     * @return the expLimitTypLikeFront
     */
    public String getExpLimitTypLikeFront() {
        return expLimitTypLikeFront;
    }

    /**
     * expLimitTypLikeFront のセッターメソッドです。
     * 
     * @param expLimitTypLikeFront expLimitTypLikeFront に設定する
     */
    public void setExpLimitTypLikeFront(String expLimitTypLikeFront) {
        this.expLimitTypLikeFront = expLimitTypLikeFront;
    }

    /**
     * dngrItemFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThan
     */
    public String getDngrItemFlgGreaterThan() {
        return dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThan のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThan dngrItemFlgGreaterThan に設定する
     */
    public void setDngrItemFlgGreaterThan(String dngrItemFlgGreaterThan) {
        this.dngrItemFlgGreaterThan = dngrItemFlgGreaterThan;
    }

    /**
     * dngrItemFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgGreaterThanEqual
     */
    public String getDngrItemFlgGreaterThanEqual() {
        return dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgGreaterThanEqual dngrItemFlgGreaterThanEqual に設定する
     */
    public void setDngrItemFlgGreaterThanEqual(String dngrItemFlgGreaterThanEqual) {
        this.dngrItemFlgGreaterThanEqual = dngrItemFlgGreaterThanEqual;
    }

    /**
     * dngrItemFlgLessThan のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThan
     */
    public String getDngrItemFlgLessThan() {
        return dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThan のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThan dngrItemFlgLessThan に設定する
     */
    public void setDngrItemFlgLessThan(String dngrItemFlgLessThan) {
        this.dngrItemFlgLessThan = dngrItemFlgLessThan;
    }

    /**
     * dngrItemFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLessThanEqual
     */
    public String getDngrItemFlgLessThanEqual() {
        return dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLessThanEqual のセッターメソッドです。
     * 
     * @param dngrItemFlgLessThanEqual dngrItemFlgLessThanEqual に設定する
     */
    public void setDngrItemFlgLessThanEqual(String dngrItemFlgLessThanEqual) {
        this.dngrItemFlgLessThanEqual = dngrItemFlgLessThanEqual;
    }

    /**
     * dngrItemFlgLikeFront のゲッターメソッドです。
     * 
     * @return the dngrItemFlgLikeFront
     */
    public String getDngrItemFlgLikeFront() {
        return dngrItemFlgLikeFront;
    }

    /**
     * dngrItemFlgLikeFront のセッターメソッドです。
     * 
     * @param dngrItemFlgLikeFront dngrItemFlgLikeFront に設定する
     */
    public void setDngrItemFlgLikeFront(String dngrItemFlgLikeFront) {
        this.dngrItemFlgLikeFront = dngrItemFlgLikeFront;
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
     * plntCdGreaterThan のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThan
     */
    public String getPlntCdGreaterThan() {
        return plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThan のセッターメソッドです。
     * 
     * @param plntCdGreaterThan plntCdGreaterThan に設定する
     */
    public void setPlntCdGreaterThan(String plntCdGreaterThan) {
        this.plntCdGreaterThan = plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThanEqual
     */
    public String getPlntCdGreaterThanEqual() {
        return plntCdGreaterThanEqual;
    }

    /**
     * plntCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param plntCdGreaterThanEqual plntCdGreaterThanEqual に設定する
     */
    public void setPlntCdGreaterThanEqual(String plntCdGreaterThanEqual) {
        this.plntCdGreaterThanEqual = plntCdGreaterThanEqual;
    }

    /**
     * plntCdLessThan のゲッターメソッドです。
     * 
     * @return the plntCdLessThan
     */
    public String getPlntCdLessThan() {
        return plntCdLessThan;
    }

    /**
     * plntCdLessThan のセッターメソッドです。
     * 
     * @param plntCdLessThan plntCdLessThan に設定する
     */
    public void setPlntCdLessThan(String plntCdLessThan) {
        this.plntCdLessThan = plntCdLessThan;
    }

    /**
     * plntCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdLessThanEqual
     */
    public String getPlntCdLessThanEqual() {
        return plntCdLessThanEqual;
    }

    /**
     * plntCdLessThanEqual のセッターメソッドです。
     * 
     * @param plntCdLessThanEqual plntCdLessThanEqual に設定する
     */
    public void setPlntCdLessThanEqual(String plntCdLessThanEqual) {
        this.plntCdLessThanEqual = plntCdLessThanEqual;
    }

    /**
     * plntCdLikeFront のゲッターメソッドです。
     * 
     * @return the plntCdLikeFront
     */
    public String getPlntCdLikeFront() {
        return plntCdLikeFront;
    }

    /**
     * plntCdLikeFront のセッターメソッドです。
     * 
     * @param plntCdLikeFront plntCdLikeFront に設定する
     */
    public void setPlntCdLikeFront(String plntCdLikeFront) {
        this.plntCdLikeFront = plntCdLikeFront;
    }

    /**
     * customerItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThan
     */
    public String getCustomerItemNoGreaterThan() {
        return customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThan のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThan customerItemNoGreaterThan に設定する
     */
    public void setCustomerItemNoGreaterThan(String customerItemNoGreaterThan) {
        this.customerItemNoGreaterThan = customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThanEqual
     */
    public String getCustomerItemNoGreaterThanEqual() {
        return customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThanEqual customerItemNoGreaterThanEqual に設定する
     */
    public void setCustomerItemNoGreaterThanEqual(String customerItemNoGreaterThanEqual) {
        this.customerItemNoGreaterThanEqual = customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoLessThan のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThan
     */
    public String getCustomerItemNoLessThan() {
        return customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThan のセッターメソッドです。
     * 
     * @param customerItemNoLessThan customerItemNoLessThan に設定する
     */
    public void setCustomerItemNoLessThan(String customerItemNoLessThan) {
        this.customerItemNoLessThan = customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThanEqual
     */
    public String getCustomerItemNoLessThanEqual() {
        return customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoLessThanEqual customerItemNoLessThanEqual に設定する
     */
    public void setCustomerItemNoLessThanEqual(String customerItemNoLessThanEqual) {
        this.customerItemNoLessThanEqual = customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerItemNoLikeFront
     */
    public String getCustomerItemNoLikeFront() {
        return customerItemNoLikeFront;
    }

    /**
     * customerItemNoLikeFront のセッターメソッドです。
     * 
     * @param customerItemNoLikeFront customerItemNoLikeFront に設定する
     */
    public void setCustomerItemNoLikeFront(String customerItemNoLikeFront) {
        this.customerItemNoLikeFront = customerItemNoLikeFront;
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

}

