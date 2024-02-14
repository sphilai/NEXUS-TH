/*
 * PROJECT：eca0027
 * 
 * TwPltzItemItemNo の検索条件Domainクラス
 * テーブル概要：TW_PLTZ_ITEM_ITEM_NO
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
 * TwPltzItemItemNo の検索条件Domainクラスです。<BR>
 * テーブル概要：TW_PLTZ_ITEM_ITEM_NO<BR>
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
public class TwPltzItemItemNoCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * BRCH
     */
    private BigDecimal brch;

    /**
     * PLTZ_ITEM_NO
     */
    private String pltzItemNo;

    /**
     * PKG_CD
     */
    private String pkgCd;

    /**
     * ITEM_DESCRIPTION
     */
    private String itemDescription;

    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * INSTR_QTY
     */
    private BigDecimal instrQty;

    /**
     * SHIPPING_LOT
     */
    private BigDecimal shippingLot;

    /**
     * TAG_QTY
     */
    private BigDecimal tagQty;

    /**
     * PKG_FORM_TYP
     */
    private String pkgFormTyp;

    /**
     * MIX_TAG_NO
     */
    private String mixTagNo;

    /**
     * MIX_TAG_FLG
     */
    private String mixTagFlg;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * ITEM_WEIGHT
     */
    private BigDecimal itemWeight;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

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
     * QTY_UNIT
     */
    private String qtyUnit;

    /**
     * ITEM_TYP
     */
    private String itemTyp;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * INVOICE_KEY
     */
    private String invoiceKey;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * STG_INSTR_ITEM_FLG
     */
    private String stgInstrItemFlg;

    /**
     * CUSTOM_TIMING_TYP
     */
    private String customTimingTyp;

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
     * DSC_ID（大なり）
     */
    private String dscIdGreaterThan;

    /**
     * DSC_ID（大なりイコール）
     */
    private String dscIdGreaterThanEqual;

    /**
     * DSC_ID（小なり）
     */
    private String dscIdLessThan;

    /**
     * DSC_ID（小なりイコール）
     */
    private String dscIdLessThanEqual;

    /**
     * DSC_ID（前方一致）
     */
    private String dscIdLikeFront;

    /**
     * PLTZ_ITEM_NO（大なり）
     */
    private String pltzItemNoGreaterThan;

    /**
     * PLTZ_ITEM_NO（大なりイコール）
     */
    private String pltzItemNoGreaterThanEqual;

    /**
     * PLTZ_ITEM_NO（小なり）
     */
    private String pltzItemNoLessThan;

    /**
     * PLTZ_ITEM_NO（小なりイコール）
     */
    private String pltzItemNoLessThanEqual;

    /**
     * PLTZ_ITEM_NO（前方一致）
     */
    private String pltzItemNoLikeFront;

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
     * PKG_FORM_TYP（大なり）
     */
    private String pkgFormTypGreaterThan;

    /**
     * PKG_FORM_TYP（大なりイコール）
     */
    private String pkgFormTypGreaterThanEqual;

    /**
     * PKG_FORM_TYP（小なり）
     */
    private String pkgFormTypLessThan;

    /**
     * PKG_FORM_TYP（小なりイコール）
     */
    private String pkgFormTypLessThanEqual;

    /**
     * PKG_FORM_TYP（前方一致）
     */
    private String pkgFormTypLikeFront;

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
     * MIX_TAG_FLG（大なり）
     */
    private String mixTagFlgGreaterThan;

    /**
     * MIX_TAG_FLG（大なりイコール）
     */
    private String mixTagFlgGreaterThanEqual;

    /**
     * MIX_TAG_FLG（小なり）
     */
    private String mixTagFlgLessThan;

    /**
     * MIX_TAG_FLG（小なりイコール）
     */
    private String mixTagFlgLessThanEqual;

    /**
     * MIX_TAG_FLG（前方一致）
     */
    private String mixTagFlgLikeFront;

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
     * CURR_CD（大なり）
     */
    private String currCdGreaterThan;

    /**
     * CURR_CD（大なりイコール）
     */
    private String currCdGreaterThanEqual;

    /**
     * CURR_CD（小なり）
     */
    private String currCdLessThan;

    /**
     * CURR_CD（小なりイコール）
     */
    private String currCdLessThanEqual;

    /**
     * CURR_CD（前方一致）
     */
    private String currCdLikeFront;

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
     * CONTAINER_SORTING_KEY（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER_SORTING_KEY（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER_SORTING_KEY（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER_SORTING_KEY（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER_SORTING_KEY（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * LOADING_CD（大なり）
     */
    private String loadingCdGreaterThan;

    /**
     * LOADING_CD（大なりイコール）
     */
    private String loadingCdGreaterThanEqual;

    /**
     * LOADING_CD（小なり）
     */
    private String loadingCdLessThan;

    /**
     * LOADING_CD（小なりイコール）
     */
    private String loadingCdLessThanEqual;

    /**
     * LOADING_CD（前方一致）
     */
    private String loadingCdLikeFront;

    /**
     * INVOICE_KEY（大なり）
     */
    private String invoiceKeyGreaterThan;

    /**
     * INVOICE_KEY（大なりイコール）
     */
    private String invoiceKeyGreaterThanEqual;

    /**
     * INVOICE_KEY（小なり）
     */
    private String invoiceKeyLessThan;

    /**
     * INVOICE_KEY（小なりイコール）
     */
    private String invoiceKeyLessThanEqual;

    /**
     * INVOICE_KEY（前方一致）
     */
    private String invoiceKeyLikeFront;

    /**
     * CONTAINER_LOOSE_TYP（大なり）
     */
    private String containerLooseTypGreaterThan;

    /**
     * CONTAINER_LOOSE_TYP（大なりイコール）
     */
    private String containerLooseTypGreaterThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（小なり）
     */
    private String containerLooseTypLessThan;

    /**
     * CONTAINER_LOOSE_TYP（小なりイコール）
     */
    private String containerLooseTypLessThanEqual;

    /**
     * CONTAINER_LOOSE_TYP（前方一致）
     */
    private String containerLooseTypLikeFront;

    /**
     * STG_INSTR_ITEM_FLG（大なり）
     */
    private String stgInstrItemFlgGreaterThan;

    /**
     * STG_INSTR_ITEM_FLG（大なりイコール）
     */
    private String stgInstrItemFlgGreaterThanEqual;

    /**
     * STG_INSTR_ITEM_FLG（小なり）
     */
    private String stgInstrItemFlgLessThan;

    /**
     * STG_INSTR_ITEM_FLG（小なりイコール）
     */
    private String stgInstrItemFlgLessThanEqual;

    /**
     * STG_INSTR_ITEM_FLG（前方一致）
     */
    private String stgInstrItemFlgLikeFront;

    /**
     * CUSTOM_TIMING_TYP（大なり）
     */
    private String customTimingTypGreaterThan;

    /**
     * CUSTOM_TIMING_TYP（大なりイコール）
     */
    private String customTimingTypGreaterThanEqual;

    /**
     * CUSTOM_TIMING_TYP（小なり）
     */
    private String customTimingTypLessThan;

    /**
     * CUSTOM_TIMING_TYP（小なりイコール）
     */
    private String customTimingTypLessThanEqual;

    /**
     * CUSTOM_TIMING_TYP（前方一致）
     */
    private String customTimingTypLikeFront;

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
    public TwPltzItemItemNoCriteriaDomain() {
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
     * pltzItemNo のゲッターメソッドです。
     * 
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * pltzItemNo のセッターメソッドです。
     * 
     * @param pltzItemNo pltzItemNo に設定する
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
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
     * pkgFormTyp のゲッターメソッドです。
     * 
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * pkgFormTyp のセッターメソッドです。
     * 
     * @param pkgFormTyp pkgFormTyp に設定する
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
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
     * mixTagFlg のゲッターメソッドです。
     * 
     * @return the mixTagFlg
     */
    public String getMixTagFlg() {
        return mixTagFlg;
    }

    /**
     * mixTagFlg のセッターメソッドです。
     * 
     * @param mixTagFlg mixTagFlg に設定する
     */
    public void setMixTagFlg(String mixTagFlg) {
        this.mixTagFlg = mixTagFlg;
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
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * invoiceKey のゲッターメソッドです。
     * 
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * invoiceKey のセッターメソッドです。
     * 
     * @param invoiceKey invoiceKey に設定する
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * stgInstrItemFlg のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * stgInstrItemFlg のセッターメソッドです。
     * 
     * @param stgInstrItemFlg stgInstrItemFlg に設定する
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
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
     * dscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThan
     */
    public String getDscIdGreaterThan() {
        return dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThan のセッターメソッドです。
     * 
     * @param dscIdGreaterThan dscIdGreaterThan に設定する
     */
    public void setDscIdGreaterThan(String dscIdGreaterThan) {
        this.dscIdGreaterThan = dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThanEqual
     */
    public String getDscIdGreaterThanEqual() {
        return dscIdGreaterThanEqual;
    }

    /**
     * dscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dscIdGreaterThanEqual dscIdGreaterThanEqual に設定する
     */
    public void setDscIdGreaterThanEqual(String dscIdGreaterThanEqual) {
        this.dscIdGreaterThanEqual = dscIdGreaterThanEqual;
    }

    /**
     * dscIdLessThan のゲッターメソッドです。
     * 
     * @return the dscIdLessThan
     */
    public String getDscIdLessThan() {
        return dscIdLessThan;
    }

    /**
     * dscIdLessThan のセッターメソッドです。
     * 
     * @param dscIdLessThan dscIdLessThan に設定する
     */
    public void setDscIdLessThan(String dscIdLessThan) {
        this.dscIdLessThan = dscIdLessThan;
    }

    /**
     * dscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdLessThanEqual
     */
    public String getDscIdLessThanEqual() {
        return dscIdLessThanEqual;
    }

    /**
     * dscIdLessThanEqual のセッターメソッドです。
     * 
     * @param dscIdLessThanEqual dscIdLessThanEqual に設定する
     */
    public void setDscIdLessThanEqual(String dscIdLessThanEqual) {
        this.dscIdLessThanEqual = dscIdLessThanEqual;
    }

    /**
     * dscIdLikeFront のゲッターメソッドです。
     * 
     * @return the dscIdLikeFront
     */
    public String getDscIdLikeFront() {
        return dscIdLikeFront;
    }

    /**
     * dscIdLikeFront のセッターメソッドです。
     * 
     * @param dscIdLikeFront dscIdLikeFront に設定する
     */
    public void setDscIdLikeFront(String dscIdLikeFront) {
        this.dscIdLikeFront = dscIdLikeFront;
    }

    /**
     * pltzItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzItemNoGreaterThan
     */
    public String getPltzItemNoGreaterThan() {
        return pltzItemNoGreaterThan;
    }

    /**
     * pltzItemNoGreaterThan のセッターメソッドです。
     * 
     * @param pltzItemNoGreaterThan pltzItemNoGreaterThan に設定する
     */
    public void setPltzItemNoGreaterThan(String pltzItemNoGreaterThan) {
        this.pltzItemNoGreaterThan = pltzItemNoGreaterThan;
    }

    /**
     * pltzItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzItemNoGreaterThanEqual
     */
    public String getPltzItemNoGreaterThanEqual() {
        return pltzItemNoGreaterThanEqual;
    }

    /**
     * pltzItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzItemNoGreaterThanEqual pltzItemNoGreaterThanEqual に設定する
     */
    public void setPltzItemNoGreaterThanEqual(String pltzItemNoGreaterThanEqual) {
        this.pltzItemNoGreaterThanEqual = pltzItemNoGreaterThanEqual;
    }

    /**
     * pltzItemNoLessThan のゲッターメソッドです。
     * 
     * @return the pltzItemNoLessThan
     */
    public String getPltzItemNoLessThan() {
        return pltzItemNoLessThan;
    }

    /**
     * pltzItemNoLessThan のセッターメソッドです。
     * 
     * @param pltzItemNoLessThan pltzItemNoLessThan に設定する
     */
    public void setPltzItemNoLessThan(String pltzItemNoLessThan) {
        this.pltzItemNoLessThan = pltzItemNoLessThan;
    }

    /**
     * pltzItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzItemNoLessThanEqual
     */
    public String getPltzItemNoLessThanEqual() {
        return pltzItemNoLessThanEqual;
    }

    /**
     * pltzItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param pltzItemNoLessThanEqual pltzItemNoLessThanEqual に設定する
     */
    public void setPltzItemNoLessThanEqual(String pltzItemNoLessThanEqual) {
        this.pltzItemNoLessThanEqual = pltzItemNoLessThanEqual;
    }

    /**
     * pltzItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the pltzItemNoLikeFront
     */
    public String getPltzItemNoLikeFront() {
        return pltzItemNoLikeFront;
    }

    /**
     * pltzItemNoLikeFront のセッターメソッドです。
     * 
     * @param pltzItemNoLikeFront pltzItemNoLikeFront に設定する
     */
    public void setPltzItemNoLikeFront(String pltzItemNoLikeFront) {
        this.pltzItemNoLikeFront = pltzItemNoLikeFront;
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
     * pkgFormTypGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgFormTypGreaterThan
     */
    public String getPkgFormTypGreaterThan() {
        return pkgFormTypGreaterThan;
    }

    /**
     * pkgFormTypGreaterThan のセッターメソッドです。
     * 
     * @param pkgFormTypGreaterThan pkgFormTypGreaterThan に設定する
     */
    public void setPkgFormTypGreaterThan(String pkgFormTypGreaterThan) {
        this.pkgFormTypGreaterThan = pkgFormTypGreaterThan;
    }

    /**
     * pkgFormTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgFormTypGreaterThanEqual
     */
    public String getPkgFormTypGreaterThanEqual() {
        return pkgFormTypGreaterThanEqual;
    }

    /**
     * pkgFormTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgFormTypGreaterThanEqual pkgFormTypGreaterThanEqual に設定する
     */
    public void setPkgFormTypGreaterThanEqual(String pkgFormTypGreaterThanEqual) {
        this.pkgFormTypGreaterThanEqual = pkgFormTypGreaterThanEqual;
    }

    /**
     * pkgFormTypLessThan のゲッターメソッドです。
     * 
     * @return the pkgFormTypLessThan
     */
    public String getPkgFormTypLessThan() {
        return pkgFormTypLessThan;
    }

    /**
     * pkgFormTypLessThan のセッターメソッドです。
     * 
     * @param pkgFormTypLessThan pkgFormTypLessThan に設定する
     */
    public void setPkgFormTypLessThan(String pkgFormTypLessThan) {
        this.pkgFormTypLessThan = pkgFormTypLessThan;
    }

    /**
     * pkgFormTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgFormTypLessThanEqual
     */
    public String getPkgFormTypLessThanEqual() {
        return pkgFormTypLessThanEqual;
    }

    /**
     * pkgFormTypLessThanEqual のセッターメソッドです。
     * 
     * @param pkgFormTypLessThanEqual pkgFormTypLessThanEqual に設定する
     */
    public void setPkgFormTypLessThanEqual(String pkgFormTypLessThanEqual) {
        this.pkgFormTypLessThanEqual = pkgFormTypLessThanEqual;
    }

    /**
     * pkgFormTypLikeFront のゲッターメソッドです。
     * 
     * @return the pkgFormTypLikeFront
     */
    public String getPkgFormTypLikeFront() {
        return pkgFormTypLikeFront;
    }

    /**
     * pkgFormTypLikeFront のセッターメソッドです。
     * 
     * @param pkgFormTypLikeFront pkgFormTypLikeFront に設定する
     */
    public void setPkgFormTypLikeFront(String pkgFormTypLikeFront) {
        this.pkgFormTypLikeFront = pkgFormTypLikeFront;
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
     * mixTagFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the mixTagFlgGreaterThan
     */
    public String getMixTagFlgGreaterThan() {
        return mixTagFlgGreaterThan;
    }

    /**
     * mixTagFlgGreaterThan のセッターメソッドです。
     * 
     * @param mixTagFlgGreaterThan mixTagFlgGreaterThan に設定する
     */
    public void setMixTagFlgGreaterThan(String mixTagFlgGreaterThan) {
        this.mixTagFlgGreaterThan = mixTagFlgGreaterThan;
    }

    /**
     * mixTagFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagFlgGreaterThanEqual
     */
    public String getMixTagFlgGreaterThanEqual() {
        return mixTagFlgGreaterThanEqual;
    }

    /**
     * mixTagFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param mixTagFlgGreaterThanEqual mixTagFlgGreaterThanEqual に設定する
     */
    public void setMixTagFlgGreaterThanEqual(String mixTagFlgGreaterThanEqual) {
        this.mixTagFlgGreaterThanEqual = mixTagFlgGreaterThanEqual;
    }

    /**
     * mixTagFlgLessThan のゲッターメソッドです。
     * 
     * @return the mixTagFlgLessThan
     */
    public String getMixTagFlgLessThan() {
        return mixTagFlgLessThan;
    }

    /**
     * mixTagFlgLessThan のセッターメソッドです。
     * 
     * @param mixTagFlgLessThan mixTagFlgLessThan に設定する
     */
    public void setMixTagFlgLessThan(String mixTagFlgLessThan) {
        this.mixTagFlgLessThan = mixTagFlgLessThan;
    }

    /**
     * mixTagFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the mixTagFlgLessThanEqual
     */
    public String getMixTagFlgLessThanEqual() {
        return mixTagFlgLessThanEqual;
    }

    /**
     * mixTagFlgLessThanEqual のセッターメソッドです。
     * 
     * @param mixTagFlgLessThanEqual mixTagFlgLessThanEqual に設定する
     */
    public void setMixTagFlgLessThanEqual(String mixTagFlgLessThanEqual) {
        this.mixTagFlgLessThanEqual = mixTagFlgLessThanEqual;
    }

    /**
     * mixTagFlgLikeFront のゲッターメソッドです。
     * 
     * @return the mixTagFlgLikeFront
     */
    public String getMixTagFlgLikeFront() {
        return mixTagFlgLikeFront;
    }

    /**
     * mixTagFlgLikeFront のセッターメソッドです。
     * 
     * @param mixTagFlgLikeFront mixTagFlgLikeFront に設定する
     */
    public void setMixTagFlgLikeFront(String mixTagFlgLikeFront) {
        this.mixTagFlgLikeFront = mixTagFlgLikeFront;
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
     * currCdGreaterThan のゲッターメソッドです。
     * 
     * @return the currCdGreaterThan
     */
    public String getCurrCdGreaterThan() {
        return currCdGreaterThan;
    }

    /**
     * currCdGreaterThan のセッターメソッドです。
     * 
     * @param currCdGreaterThan currCdGreaterThan に設定する
     */
    public void setCurrCdGreaterThan(String currCdGreaterThan) {
        this.currCdGreaterThan = currCdGreaterThan;
    }

    /**
     * currCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the currCdGreaterThanEqual
     */
    public String getCurrCdGreaterThanEqual() {
        return currCdGreaterThanEqual;
    }

    /**
     * currCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param currCdGreaterThanEqual currCdGreaterThanEqual に設定する
     */
    public void setCurrCdGreaterThanEqual(String currCdGreaterThanEqual) {
        this.currCdGreaterThanEqual = currCdGreaterThanEqual;
    }

    /**
     * currCdLessThan のゲッターメソッドです。
     * 
     * @return the currCdLessThan
     */
    public String getCurrCdLessThan() {
        return currCdLessThan;
    }

    /**
     * currCdLessThan のセッターメソッドです。
     * 
     * @param currCdLessThan currCdLessThan に設定する
     */
    public void setCurrCdLessThan(String currCdLessThan) {
        this.currCdLessThan = currCdLessThan;
    }

    /**
     * currCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the currCdLessThanEqual
     */
    public String getCurrCdLessThanEqual() {
        return currCdLessThanEqual;
    }

    /**
     * currCdLessThanEqual のセッターメソッドです。
     * 
     * @param currCdLessThanEqual currCdLessThanEqual に設定する
     */
    public void setCurrCdLessThanEqual(String currCdLessThanEqual) {
        this.currCdLessThanEqual = currCdLessThanEqual;
    }

    /**
     * currCdLikeFront のゲッターメソッドです。
     * 
     * @return the currCdLikeFront
     */
    public String getCurrCdLikeFront() {
        return currCdLikeFront;
    }

    /**
     * currCdLikeFront のセッターメソッドです。
     * 
     * @param currCdLikeFront currCdLikeFront に設定する
     */
    public void setCurrCdLikeFront(String currCdLikeFront) {
        this.currCdLikeFront = currCdLikeFront;
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
     * containerSortingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThan
     */
    public String getContainerSortingKeyGreaterThan() {
        return containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThan のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThan containerSortingKeyGreaterThan に設定する
     */
    public void setContainerSortingKeyGreaterThan(String containerSortingKeyGreaterThan) {
        this.containerSortingKeyGreaterThan = containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThanEqual
     */
    public String getContainerSortingKeyGreaterThanEqual() {
        return containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThanEqual containerSortingKeyGreaterThanEqual に設定する
     */
    public void setContainerSortingKeyGreaterThanEqual(String containerSortingKeyGreaterThanEqual) {
        this.containerSortingKeyGreaterThanEqual = containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyLessThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThan
     */
    public String getContainerSortingKeyLessThan() {
        return containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThan のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThan containerSortingKeyLessThan に設定する
     */
    public void setContainerSortingKeyLessThan(String containerSortingKeyLessThan) {
        this.containerSortingKeyLessThan = containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThanEqual
     */
    public String getContainerSortingKeyLessThanEqual() {
        return containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThanEqual containerSortingKeyLessThanEqual に設定する
     */
    public void setContainerSortingKeyLessThanEqual(String containerSortingKeyLessThanEqual) {
        this.containerSortingKeyLessThanEqual = containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLikeFront
     */
    public String getContainerSortingKeyLikeFront() {
        return containerSortingKeyLikeFront;
    }

    /**
     * containerSortingKeyLikeFront のセッターメソッドです。
     * 
     * @param containerSortingKeyLikeFront containerSortingKeyLikeFront に設定する
     */
    public void setContainerSortingKeyLikeFront(String containerSortingKeyLikeFront) {
        this.containerSortingKeyLikeFront = containerSortingKeyLikeFront;
    }

    /**
     * loadingCdGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThan
     */
    public String getLoadingCdGreaterThan() {
        return loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThan のセッターメソッドです。
     * 
     * @param loadingCdGreaterThan loadingCdGreaterThan に設定する
     */
    public void setLoadingCdGreaterThan(String loadingCdGreaterThan) {
        this.loadingCdGreaterThan = loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThanEqual
     */
    public String getLoadingCdGreaterThanEqual() {
        return loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingCdGreaterThanEqual loadingCdGreaterThanEqual に設定する
     */
    public void setLoadingCdGreaterThanEqual(String loadingCdGreaterThanEqual) {
        this.loadingCdGreaterThanEqual = loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdLessThan のゲッターメソッドです。
     * 
     * @return the loadingCdLessThan
     */
    public String getLoadingCdLessThan() {
        return loadingCdLessThan;
    }

    /**
     * loadingCdLessThan のセッターメソッドです。
     * 
     * @param loadingCdLessThan loadingCdLessThan に設定する
     */
    public void setLoadingCdLessThan(String loadingCdLessThan) {
        this.loadingCdLessThan = loadingCdLessThan;
    }

    /**
     * loadingCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdLessThanEqual
     */
    public String getLoadingCdLessThanEqual() {
        return loadingCdLessThanEqual;
    }

    /**
     * loadingCdLessThanEqual のセッターメソッドです。
     * 
     * @param loadingCdLessThanEqual loadingCdLessThanEqual に設定する
     */
    public void setLoadingCdLessThanEqual(String loadingCdLessThanEqual) {
        this.loadingCdLessThanEqual = loadingCdLessThanEqual;
    }

    /**
     * loadingCdLikeFront のゲッターメソッドです。
     * 
     * @return the loadingCdLikeFront
     */
    public String getLoadingCdLikeFront() {
        return loadingCdLikeFront;
    }

    /**
     * loadingCdLikeFront のセッターメソッドです。
     * 
     * @param loadingCdLikeFront loadingCdLikeFront に設定する
     */
    public void setLoadingCdLikeFront(String loadingCdLikeFront) {
        this.loadingCdLikeFront = loadingCdLikeFront;
    }

    /**
     * invoiceKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThan
     */
    public String getInvoiceKeyGreaterThan() {
        return invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThan のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThan invoiceKeyGreaterThan に設定する
     */
    public void setInvoiceKeyGreaterThan(String invoiceKeyGreaterThan) {
        this.invoiceKeyGreaterThan = invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThanEqual
     */
    public String getInvoiceKeyGreaterThanEqual() {
        return invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThanEqual invoiceKeyGreaterThanEqual に設定する
     */
    public void setInvoiceKeyGreaterThanEqual(String invoiceKeyGreaterThanEqual) {
        this.invoiceKeyGreaterThanEqual = invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyLessThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThan
     */
    public String getInvoiceKeyLessThan() {
        return invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThan のセッターメソッドです。
     * 
     * @param invoiceKeyLessThan invoiceKeyLessThan に設定する
     */
    public void setInvoiceKeyLessThan(String invoiceKeyLessThan) {
        this.invoiceKeyLessThan = invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThanEqual
     */
    public String getInvoiceKeyLessThanEqual() {
        return invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyLessThanEqual invoiceKeyLessThanEqual に設定する
     */
    public void setInvoiceKeyLessThanEqual(String invoiceKeyLessThanEqual) {
        this.invoiceKeyLessThanEqual = invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceKeyLikeFront
     */
    public String getInvoiceKeyLikeFront() {
        return invoiceKeyLikeFront;
    }

    /**
     * invoiceKeyLikeFront のセッターメソッドです。
     * 
     * @param invoiceKeyLikeFront invoiceKeyLikeFront に設定する
     */
    public void setInvoiceKeyLikeFront(String invoiceKeyLikeFront) {
        this.invoiceKeyLikeFront = invoiceKeyLikeFront;
    }

    /**
     * containerLooseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThan
     */
    public String getContainerLooseTypGreaterThan() {
        return containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThan のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThan containerLooseTypGreaterThan に設定する
     */
    public void setContainerLooseTypGreaterThan(String containerLooseTypGreaterThan) {
        this.containerLooseTypGreaterThan = containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThanEqual
     */
    public String getContainerLooseTypGreaterThanEqual() {
        return containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThanEqual containerLooseTypGreaterThanEqual に設定する
     */
    public void setContainerLooseTypGreaterThanEqual(String containerLooseTypGreaterThanEqual) {
        this.containerLooseTypGreaterThanEqual = containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypLessThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThan
     */
    public String getContainerLooseTypLessThan() {
        return containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThan のセッターメソッドです。
     * 
     * @param containerLooseTypLessThan containerLooseTypLessThan に設定する
     */
    public void setContainerLooseTypLessThan(String containerLooseTypLessThan) {
        this.containerLooseTypLessThan = containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThanEqual
     */
    public String getContainerLooseTypLessThanEqual() {
        return containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLessThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypLessThanEqual containerLooseTypLessThanEqual に設定する
     */
    public void setContainerLooseTypLessThanEqual(String containerLooseTypLessThanEqual) {
        this.containerLooseTypLessThanEqual = containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLikeFront のゲッターメソッドです。
     * 
     * @return the containerLooseTypLikeFront
     */
    public String getContainerLooseTypLikeFront() {
        return containerLooseTypLikeFront;
    }

    /**
     * containerLooseTypLikeFront のセッターメソッドです。
     * 
     * @param containerLooseTypLikeFront containerLooseTypLikeFront に設定する
     */
    public void setContainerLooseTypLikeFront(String containerLooseTypLikeFront) {
        this.containerLooseTypLikeFront = containerLooseTypLikeFront;
    }

    /**
     * stgInstrItemFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgGreaterThan
     */
    public String getStgInstrItemFlgGreaterThan() {
        return stgInstrItemFlgGreaterThan;
    }

    /**
     * stgInstrItemFlgGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrItemFlgGreaterThan stgInstrItemFlgGreaterThan に設定する
     */
    public void setStgInstrItemFlgGreaterThan(String stgInstrItemFlgGreaterThan) {
        this.stgInstrItemFlgGreaterThan = stgInstrItemFlgGreaterThan;
    }

    /**
     * stgInstrItemFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgGreaterThanEqual
     */
    public String getStgInstrItemFlgGreaterThanEqual() {
        return stgInstrItemFlgGreaterThanEqual;
    }

    /**
     * stgInstrItemFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrItemFlgGreaterThanEqual stgInstrItemFlgGreaterThanEqual に設定する
     */
    public void setStgInstrItemFlgGreaterThanEqual(String stgInstrItemFlgGreaterThanEqual) {
        this.stgInstrItemFlgGreaterThanEqual = stgInstrItemFlgGreaterThanEqual;
    }

    /**
     * stgInstrItemFlgLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLessThan
     */
    public String getStgInstrItemFlgLessThan() {
        return stgInstrItemFlgLessThan;
    }

    /**
     * stgInstrItemFlgLessThan のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLessThan stgInstrItemFlgLessThan に設定する
     */
    public void setStgInstrItemFlgLessThan(String stgInstrItemFlgLessThan) {
        this.stgInstrItemFlgLessThan = stgInstrItemFlgLessThan;
    }

    /**
     * stgInstrItemFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLessThanEqual
     */
    public String getStgInstrItemFlgLessThanEqual() {
        return stgInstrItemFlgLessThanEqual;
    }

    /**
     * stgInstrItemFlgLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLessThanEqual stgInstrItemFlgLessThanEqual に設定する
     */
    public void setStgInstrItemFlgLessThanEqual(String stgInstrItemFlgLessThanEqual) {
        this.stgInstrItemFlgLessThanEqual = stgInstrItemFlgLessThanEqual;
    }

    /**
     * stgInstrItemFlgLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlgLikeFront
     */
    public String getStgInstrItemFlgLikeFront() {
        return stgInstrItemFlgLikeFront;
    }

    /**
     * stgInstrItemFlgLikeFront のセッターメソッドです。
     * 
     * @param stgInstrItemFlgLikeFront stgInstrItemFlgLikeFront に設定する
     */
    public void setStgInstrItemFlgLikeFront(String stgInstrItemFlgLikeFront) {
        this.stgInstrItemFlgLikeFront = stgInstrItemFlgLikeFront;
    }

    /**
     * customTimingTypGreaterThan のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThan
     */
    public String getCustomTimingTypGreaterThan() {
        return customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThan のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThan customTimingTypGreaterThan に設定する
     */
    public void setCustomTimingTypGreaterThan(String customTimingTypGreaterThan) {
        this.customTimingTypGreaterThan = customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThanEqual
     */
    public String getCustomTimingTypGreaterThanEqual() {
        return customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThanEqual customTimingTypGreaterThanEqual に設定する
     */
    public void setCustomTimingTypGreaterThanEqual(String customTimingTypGreaterThanEqual) {
        this.customTimingTypGreaterThanEqual = customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypLessThan のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThan
     */
    public String getCustomTimingTypLessThan() {
        return customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThan のセッターメソッドです。
     * 
     * @param customTimingTypLessThan customTimingTypLessThan に設定する
     */
    public void setCustomTimingTypLessThan(String customTimingTypLessThan) {
        this.customTimingTypLessThan = customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThanEqual
     */
    public String getCustomTimingTypLessThanEqual() {
        return customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLessThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypLessThanEqual customTimingTypLessThanEqual に設定する
     */
    public void setCustomTimingTypLessThanEqual(String customTimingTypLessThanEqual) {
        this.customTimingTypLessThanEqual = customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLikeFront のゲッターメソッドです。
     * 
     * @return the customTimingTypLikeFront
     */
    public String getCustomTimingTypLikeFront() {
        return customTimingTypLikeFront;
    }

    /**
     * customTimingTypLikeFront のセッターメソッドです。
     * 
     * @param customTimingTypLikeFront customTimingTypLikeFront に設定する
     */
    public void setCustomTimingTypLikeFront(String customTimingTypLikeFront) {
        this.customTimingTypLikeFront = customTimingTypLikeFront;
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

