/*
 * PROJECT：eca0027
 * 
 * TtXpltz の検索条件Domainクラス
 * テーブル概要：TT_XPLTZ
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
import java.util.Date;
import java.sql.Timestamp;

/**
 * TtXpltz の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_XPLTZ<BR>
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
public class TtXpltzCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * XMAIN_MARK
     */
    private String xmainMark;

    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * LOADING_CD
     */
    private String loadingCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * SHIP_TO_COMP_CD
     */
    private String shipToCompCd;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * CUR_WH_COMP_CD
     */
    private String curWhCompCd;

    /**
     * CUR_WH_CD
     */
    private String curWhCd;

    /**
     * XTAG_PACKING_ISSUER_ID
     */
    private String xtagPackingIssuerId;

    /**
     * XTAG_PACKING_ISSUER_NM
     */
    private String xtagPackingIssuerNm;

    /**
     * XTAG_PACKING_DT
     */
    private Date xtagPackingDt;

    /**
     * TOTAL_SHIPPER
     */
    private BigDecimal totalShipper;

    /**
     * OUTER_PKG_COM_CD
     */
    private String outerPkgComCd;

    /**
     * OUTER_PKG_CD
     */
    private String outerPkgCd;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

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
     * XMAIN_MARK（大なり）
     */
    private String xmainMarkGreaterThan;

    /**
     * XMAIN_MARK（大なりイコール）
     */
    private String xmainMarkGreaterThanEqual;

    /**
     * XMAIN_MARK（小なり）
     */
    private String xmainMarkLessThan;

    /**
     * XMAIN_MARK（小なりイコール）
     */
    private String xmainMarkLessThanEqual;

    /**
     * XMAIN_MARK（前方一致）
     */
    private String xmainMarkLikeFront;

    /**
     * PALLET_NO（大なり）
     */
    private String palletNoGreaterThan;

    /**
     * PALLET_NO（大なりイコール）
     */
    private String palletNoGreaterThanEqual;

    /**
     * PALLET_NO（小なり）
     */
    private String palletNoLessThan;

    /**
     * PALLET_NO（小なりイコール）
     */
    private String palletNoLessThanEqual;

    /**
     * PALLET_NO（前方一致）
     */
    private String palletNoLikeFront;

    /**
     * TRNS_CD（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRNS_CD（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRNS_CD（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRNS_CD（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRNS_CD（前方一致）
     */
    private String trnsCdLikeFront;

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
     * SHIP_TO_COMP_CD（大なり）
     */
    private String shipToCompCdGreaterThan;

    /**
     * SHIP_TO_COMP_CD（大なりイコール）
     */
    private String shipToCompCdGreaterThanEqual;

    /**
     * SHIP_TO_COMP_CD（小なり）
     */
    private String shipToCompCdLessThan;

    /**
     * SHIP_TO_COMP_CD（小なりイコール）
     */
    private String shipToCompCdLessThanEqual;

    /**
     * SHIP_TO_COMP_CD（前方一致）
     */
    private String shipToCompCdLikeFront;

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
     * CUR_WH_COMP_CD（大なり）
     */
    private String curWhCompCdGreaterThan;

    /**
     * CUR_WH_COMP_CD（大なりイコール）
     */
    private String curWhCompCdGreaterThanEqual;

    /**
     * CUR_WH_COMP_CD（小なり）
     */
    private String curWhCompCdLessThan;

    /**
     * CUR_WH_COMP_CD（小なりイコール）
     */
    private String curWhCompCdLessThanEqual;

    /**
     * CUR_WH_COMP_CD（前方一致）
     */
    private String curWhCompCdLikeFront;

    /**
     * CUR_WH_CD（大なり）
     */
    private String curWhCdGreaterThan;

    /**
     * CUR_WH_CD（大なりイコール）
     */
    private String curWhCdGreaterThanEqual;

    /**
     * CUR_WH_CD（小なり）
     */
    private String curWhCdLessThan;

    /**
     * CUR_WH_CD（小なりイコール）
     */
    private String curWhCdLessThanEqual;

    /**
     * CUR_WH_CD（前方一致）
     */
    private String curWhCdLikeFront;

    /**
     * XTAG_PACKING_ISSUER_ID（大なり）
     */
    private String xtagPackingIssuerIdGreaterThan;

    /**
     * XTAG_PACKING_ISSUER_ID（大なりイコール）
     */
    private String xtagPackingIssuerIdGreaterThanEqual;

    /**
     * XTAG_PACKING_ISSUER_ID（小なり）
     */
    private String xtagPackingIssuerIdLessThan;

    /**
     * XTAG_PACKING_ISSUER_ID（小なりイコール）
     */
    private String xtagPackingIssuerIdLessThanEqual;

    /**
     * XTAG_PACKING_ISSUER_ID（前方一致）
     */
    private String xtagPackingIssuerIdLikeFront;

    /**
     * XTAG_PACKING_ISSUER_NM（大なり）
     */
    private String xtagPackingIssuerNmGreaterThan;

    /**
     * XTAG_PACKING_ISSUER_NM（大なりイコール）
     */
    private String xtagPackingIssuerNmGreaterThanEqual;

    /**
     * XTAG_PACKING_ISSUER_NM（小なり）
     */
    private String xtagPackingIssuerNmLessThan;

    /**
     * XTAG_PACKING_ISSUER_NM（小なりイコール）
     */
    private String xtagPackingIssuerNmLessThanEqual;

    /**
     * XTAG_PACKING_ISSUER_NM（前方一致）
     */
    private String xtagPackingIssuerNmLikeFront;

    /**
     * XTAG_PACKING_DT（大なりイコール）
     */
    private Date xtagPackingDtGreaterThanEqual;

    /**
     * XTAG_PACKING_DT（小なりイコール）
     */
    private Date xtagPackingDtLessThanEqual;

    /**
     * OUTER_PKG_COM_CD（大なり）
     */
    private String outerPkgComCdGreaterThan;

    /**
     * OUTER_PKG_COM_CD（大なりイコール）
     */
    private String outerPkgComCdGreaterThanEqual;

    /**
     * OUTER_PKG_COM_CD（小なり）
     */
    private String outerPkgComCdLessThan;

    /**
     * OUTER_PKG_COM_CD（小なりイコール）
     */
    private String outerPkgComCdLessThanEqual;

    /**
     * OUTER_PKG_COM_CD（前方一致）
     */
    private String outerPkgComCdLikeFront;

    /**
     * OUTER_PKG_CD（大なり）
     */
    private String outerPkgCdGreaterThan;

    /**
     * OUTER_PKG_CD（大なりイコール）
     */
    private String outerPkgCdGreaterThanEqual;

    /**
     * OUTER_PKG_CD（小なり）
     */
    private String outerPkgCdLessThan;

    /**
     * OUTER_PKG_CD（小なりイコール）
     */
    private String outerPkgCdLessThanEqual;

    /**
     * OUTER_PKG_CD（前方一致）
     */
    private String outerPkgCdLikeFront;

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
    public TtXpltzCriteriaDomain() {
    }

    /**
     * xmainMark のゲッターメソッドです。
     * 
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * xmainMark のセッターメソッドです。
     * 
     * @param xmainMark xmainMark に設定する
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * palletNo のゲッターメソッドです。
     * 
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * palletNo のセッターメソッドです。
     * 
     * @param palletNo palletNo に設定する
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
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
     * shipToCompCd のゲッターメソッドです。
     * 
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * shipToCompCd のセッターメソッドです。
     * 
     * @param shipToCompCd shipToCompCd に設定する
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * curWhCompCd のゲッターメソッドです。
     * 
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * curWhCompCd のセッターメソッドです。
     * 
     * @param curWhCompCd curWhCompCd に設定する
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * curWhCd のゲッターメソッドです。
     * 
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * curWhCd のセッターメソッドです。
     * 
     * @param curWhCd curWhCd に設定する
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * xtagPackingIssuerId のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerId
     */
    public String getXtagPackingIssuerId() {
        return xtagPackingIssuerId;
    }

    /**
     * xtagPackingIssuerId のセッターメソッドです。
     * 
     * @param xtagPackingIssuerId xtagPackingIssuerId に設定する
     */
    public void setXtagPackingIssuerId(String xtagPackingIssuerId) {
        this.xtagPackingIssuerId = xtagPackingIssuerId;
    }

    /**
     * xtagPackingIssuerNm のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNm
     */
    public String getXtagPackingIssuerNm() {
        return xtagPackingIssuerNm;
    }

    /**
     * xtagPackingIssuerNm のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNm xtagPackingIssuerNm に設定する
     */
    public void setXtagPackingIssuerNm(String xtagPackingIssuerNm) {
        this.xtagPackingIssuerNm = xtagPackingIssuerNm;
    }

    /**
     * xtagPackingDt のゲッターメソッドです。
     * 
     * @return the xtagPackingDt
     */
    public Date getXtagPackingDt() {
        return xtagPackingDt;
    }

    /**
     * xtagPackingDt のセッターメソッドです。
     * 
     * @param xtagPackingDt xtagPackingDt に設定する
     */
    public void setXtagPackingDt(Date xtagPackingDt) {
        this.xtagPackingDt = xtagPackingDt;
    }

    /**
     * totalShipper のゲッターメソッドです。
     * 
     * @return the totalShipper
     */
    public BigDecimal getTotalShipper() {
        return totalShipper;
    }

    /**
     * totalShipper のセッターメソッドです。
     * 
     * @param totalShipper totalShipper に設定する
     */
    public void setTotalShipper(BigDecimal totalShipper) {
        this.totalShipper = totalShipper;
    }

    /**
     * outerPkgComCd のゲッターメソッドです。
     * 
     * @return the outerPkgComCd
     */
    public String getOuterPkgComCd() {
        return outerPkgComCd;
    }

    /**
     * outerPkgComCd のセッターメソッドです。
     * 
     * @param outerPkgComCd outerPkgComCd に設定する
     */
    public void setOuterPkgComCd(String outerPkgComCd) {
        this.outerPkgComCd = outerPkgComCd;
    }

    /**
     * outerPkgCd のゲッターメソッドです。
     * 
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * outerPkgCd のセッターメソッドです。
     * 
     * @param outerPkgCd outerPkgCd に設定する
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
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
     * xmainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the xmainMarkGreaterThan
     */
    public String getXmainMarkGreaterThan() {
        return xmainMarkGreaterThan;
    }

    /**
     * xmainMarkGreaterThan のセッターメソッドです。
     * 
     * @param xmainMarkGreaterThan xmainMarkGreaterThan に設定する
     */
    public void setXmainMarkGreaterThan(String xmainMarkGreaterThan) {
        this.xmainMarkGreaterThan = xmainMarkGreaterThan;
    }

    /**
     * xmainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the xmainMarkGreaterThanEqual
     */
    public String getXmainMarkGreaterThanEqual() {
        return xmainMarkGreaterThanEqual;
    }

    /**
     * xmainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param xmainMarkGreaterThanEqual xmainMarkGreaterThanEqual に設定する
     */
    public void setXmainMarkGreaterThanEqual(String xmainMarkGreaterThanEqual) {
        this.xmainMarkGreaterThanEqual = xmainMarkGreaterThanEqual;
    }

    /**
     * xmainMarkLessThan のゲッターメソッドです。
     * 
     * @return the xmainMarkLessThan
     */
    public String getXmainMarkLessThan() {
        return xmainMarkLessThan;
    }

    /**
     * xmainMarkLessThan のセッターメソッドです。
     * 
     * @param xmainMarkLessThan xmainMarkLessThan に設定する
     */
    public void setXmainMarkLessThan(String xmainMarkLessThan) {
        this.xmainMarkLessThan = xmainMarkLessThan;
    }

    /**
     * xmainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the xmainMarkLessThanEqual
     */
    public String getXmainMarkLessThanEqual() {
        return xmainMarkLessThanEqual;
    }

    /**
     * xmainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param xmainMarkLessThanEqual xmainMarkLessThanEqual に設定する
     */
    public void setXmainMarkLessThanEqual(String xmainMarkLessThanEqual) {
        this.xmainMarkLessThanEqual = xmainMarkLessThanEqual;
    }

    /**
     * xmainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the xmainMarkLikeFront
     */
    public String getXmainMarkLikeFront() {
        return xmainMarkLikeFront;
    }

    /**
     * xmainMarkLikeFront のセッターメソッドです。
     * 
     * @param xmainMarkLikeFront xmainMarkLikeFront に設定する
     */
    public void setXmainMarkLikeFront(String xmainMarkLikeFront) {
        this.xmainMarkLikeFront = xmainMarkLikeFront;
    }

    /**
     * palletNoGreaterThan のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThan
     */
    public String getPalletNoGreaterThan() {
        return palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThan のセッターメソッドです。
     * 
     * @param palletNoGreaterThan palletNoGreaterThan に設定する
     */
    public void setPalletNoGreaterThan(String palletNoGreaterThan) {
        this.palletNoGreaterThan = palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThanEqual
     */
    public String getPalletNoGreaterThanEqual() {
        return palletNoGreaterThanEqual;
    }

    /**
     * palletNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param palletNoGreaterThanEqual palletNoGreaterThanEqual に設定する
     */
    public void setPalletNoGreaterThanEqual(String palletNoGreaterThanEqual) {
        this.palletNoGreaterThanEqual = palletNoGreaterThanEqual;
    }

    /**
     * palletNoLessThan のゲッターメソッドです。
     * 
     * @return the palletNoLessThan
     */
    public String getPalletNoLessThan() {
        return palletNoLessThan;
    }

    /**
     * palletNoLessThan のセッターメソッドです。
     * 
     * @param palletNoLessThan palletNoLessThan に設定する
     */
    public void setPalletNoLessThan(String palletNoLessThan) {
        this.palletNoLessThan = palletNoLessThan;
    }

    /**
     * palletNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoLessThanEqual
     */
    public String getPalletNoLessThanEqual() {
        return palletNoLessThanEqual;
    }

    /**
     * palletNoLessThanEqual のセッターメソッドです。
     * 
     * @param palletNoLessThanEqual palletNoLessThanEqual に設定する
     */
    public void setPalletNoLessThanEqual(String palletNoLessThanEqual) {
        this.palletNoLessThanEqual = palletNoLessThanEqual;
    }

    /**
     * palletNoLikeFront のゲッターメソッドです。
     * 
     * @return the palletNoLikeFront
     */
    public String getPalletNoLikeFront() {
        return palletNoLikeFront;
    }

    /**
     * palletNoLikeFront のセッターメソッドです。
     * 
     * @param palletNoLikeFront palletNoLikeFront に設定する
     */
    public void setPalletNoLikeFront(String palletNoLikeFront) {
        this.palletNoLikeFront = palletNoLikeFront;
    }

    /**
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String getTrnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void setTrnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String getTrnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void setTrnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String getTrnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void setTrnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String getTrnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void setTrnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String getTrnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void setTrnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
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
     * shipToCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThan
     */
    public String getShipToCompCdGreaterThan() {
        return shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThan shipToCompCdGreaterThan に設定する
     */
    public void setShipToCompCdGreaterThan(String shipToCompCdGreaterThan) {
        this.shipToCompCdGreaterThan = shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThanEqual
     */
    public String getShipToCompCdGreaterThanEqual() {
        return shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThanEqual shipToCompCdGreaterThanEqual に設定する
     */
    public void setShipToCompCdGreaterThanEqual(String shipToCompCdGreaterThanEqual) {
        this.shipToCompCdGreaterThanEqual = shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThan
     */
    public String getShipToCompCdLessThan() {
        return shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThan のセッターメソッドです。
     * 
     * @param shipToCompCdLessThan shipToCompCdLessThan に設定する
     */
    public void setShipToCompCdLessThan(String shipToCompCdLessThan) {
        this.shipToCompCdLessThan = shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThanEqual
     */
    public String getShipToCompCdLessThanEqual() {
        return shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdLessThanEqual shipToCompCdLessThanEqual に設定する
     */
    public void setShipToCompCdLessThanEqual(String shipToCompCdLessThanEqual) {
        this.shipToCompCdLessThanEqual = shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompCdLikeFront
     */
    public String getShipToCompCdLikeFront() {
        return shipToCompCdLikeFront;
    }

    /**
     * shipToCompCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCompCdLikeFront shipToCompCdLikeFront に設定する
     */
    public void setShipToCompCdLikeFront(String shipToCompCdLikeFront) {
        this.shipToCompCdLikeFront = shipToCompCdLikeFront;
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
     * curWhCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the curWhCompCdGreaterThan
     */
    public String getCurWhCompCdGreaterThan() {
        return curWhCompCdGreaterThan;
    }

    /**
     * curWhCompCdGreaterThan のセッターメソッドです。
     * 
     * @param curWhCompCdGreaterThan curWhCompCdGreaterThan に設定する
     */
    public void setCurWhCompCdGreaterThan(String curWhCompCdGreaterThan) {
        this.curWhCompCdGreaterThan = curWhCompCdGreaterThan;
    }

    /**
     * curWhCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the curWhCompCdGreaterThanEqual
     */
    public String getCurWhCompCdGreaterThanEqual() {
        return curWhCompCdGreaterThanEqual;
    }

    /**
     * curWhCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param curWhCompCdGreaterThanEqual curWhCompCdGreaterThanEqual に設定する
     */
    public void setCurWhCompCdGreaterThanEqual(String curWhCompCdGreaterThanEqual) {
        this.curWhCompCdGreaterThanEqual = curWhCompCdGreaterThanEqual;
    }

    /**
     * curWhCompCdLessThan のゲッターメソッドです。
     * 
     * @return the curWhCompCdLessThan
     */
    public String getCurWhCompCdLessThan() {
        return curWhCompCdLessThan;
    }

    /**
     * curWhCompCdLessThan のセッターメソッドです。
     * 
     * @param curWhCompCdLessThan curWhCompCdLessThan に設定する
     */
    public void setCurWhCompCdLessThan(String curWhCompCdLessThan) {
        this.curWhCompCdLessThan = curWhCompCdLessThan;
    }

    /**
     * curWhCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the curWhCompCdLessThanEqual
     */
    public String getCurWhCompCdLessThanEqual() {
        return curWhCompCdLessThanEqual;
    }

    /**
     * curWhCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param curWhCompCdLessThanEqual curWhCompCdLessThanEqual に設定する
     */
    public void setCurWhCompCdLessThanEqual(String curWhCompCdLessThanEqual) {
        this.curWhCompCdLessThanEqual = curWhCompCdLessThanEqual;
    }

    /**
     * curWhCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the curWhCompCdLikeFront
     */
    public String getCurWhCompCdLikeFront() {
        return curWhCompCdLikeFront;
    }

    /**
     * curWhCompCdLikeFront のセッターメソッドです。
     * 
     * @param curWhCompCdLikeFront curWhCompCdLikeFront に設定する
     */
    public void setCurWhCompCdLikeFront(String curWhCompCdLikeFront) {
        this.curWhCompCdLikeFront = curWhCompCdLikeFront;
    }

    /**
     * curWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the curWhCdGreaterThan
     */
    public String getCurWhCdGreaterThan() {
        return curWhCdGreaterThan;
    }

    /**
     * curWhCdGreaterThan のセッターメソッドです。
     * 
     * @param curWhCdGreaterThan curWhCdGreaterThan に設定する
     */
    public void setCurWhCdGreaterThan(String curWhCdGreaterThan) {
        this.curWhCdGreaterThan = curWhCdGreaterThan;
    }

    /**
     * curWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the curWhCdGreaterThanEqual
     */
    public String getCurWhCdGreaterThanEqual() {
        return curWhCdGreaterThanEqual;
    }

    /**
     * curWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param curWhCdGreaterThanEqual curWhCdGreaterThanEqual に設定する
     */
    public void setCurWhCdGreaterThanEqual(String curWhCdGreaterThanEqual) {
        this.curWhCdGreaterThanEqual = curWhCdGreaterThanEqual;
    }

    /**
     * curWhCdLessThan のゲッターメソッドです。
     * 
     * @return the curWhCdLessThan
     */
    public String getCurWhCdLessThan() {
        return curWhCdLessThan;
    }

    /**
     * curWhCdLessThan のセッターメソッドです。
     * 
     * @param curWhCdLessThan curWhCdLessThan に設定する
     */
    public void setCurWhCdLessThan(String curWhCdLessThan) {
        this.curWhCdLessThan = curWhCdLessThan;
    }

    /**
     * curWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the curWhCdLessThanEqual
     */
    public String getCurWhCdLessThanEqual() {
        return curWhCdLessThanEqual;
    }

    /**
     * curWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param curWhCdLessThanEqual curWhCdLessThanEqual に設定する
     */
    public void setCurWhCdLessThanEqual(String curWhCdLessThanEqual) {
        this.curWhCdLessThanEqual = curWhCdLessThanEqual;
    }

    /**
     * curWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the curWhCdLikeFront
     */
    public String getCurWhCdLikeFront() {
        return curWhCdLikeFront;
    }

    /**
     * curWhCdLikeFront のセッターメソッドです。
     * 
     * @param curWhCdLikeFront curWhCdLikeFront に設定する
     */
    public void setCurWhCdLikeFront(String curWhCdLikeFront) {
        this.curWhCdLikeFront = curWhCdLikeFront;
    }

    /**
     * xtagPackingIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerIdGreaterThan
     */
    public String getXtagPackingIssuerIdGreaterThan() {
        return xtagPackingIssuerIdGreaterThan;
    }

    /**
     * xtagPackingIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param xtagPackingIssuerIdGreaterThan xtagPackingIssuerIdGreaterThan に設定する
     */
    public void setXtagPackingIssuerIdGreaterThan(String xtagPackingIssuerIdGreaterThan) {
        this.xtagPackingIssuerIdGreaterThan = xtagPackingIssuerIdGreaterThan;
    }

    /**
     * xtagPackingIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerIdGreaterThanEqual
     */
    public String getXtagPackingIssuerIdGreaterThanEqual() {
        return xtagPackingIssuerIdGreaterThanEqual;
    }

    /**
     * xtagPackingIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingIssuerIdGreaterThanEqual xtagPackingIssuerIdGreaterThanEqual に設定する
     */
    public void setXtagPackingIssuerIdGreaterThanEqual(String xtagPackingIssuerIdGreaterThanEqual) {
        this.xtagPackingIssuerIdGreaterThanEqual = xtagPackingIssuerIdGreaterThanEqual;
    }

    /**
     * xtagPackingIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerIdLessThan
     */
    public String getXtagPackingIssuerIdLessThan() {
        return xtagPackingIssuerIdLessThan;
    }

    /**
     * xtagPackingIssuerIdLessThan のセッターメソッドです。
     * 
     * @param xtagPackingIssuerIdLessThan xtagPackingIssuerIdLessThan に設定する
     */
    public void setXtagPackingIssuerIdLessThan(String xtagPackingIssuerIdLessThan) {
        this.xtagPackingIssuerIdLessThan = xtagPackingIssuerIdLessThan;
    }

    /**
     * xtagPackingIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerIdLessThanEqual
     */
    public String getXtagPackingIssuerIdLessThanEqual() {
        return xtagPackingIssuerIdLessThanEqual;
    }

    /**
     * xtagPackingIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingIssuerIdLessThanEqual xtagPackingIssuerIdLessThanEqual に設定する
     */
    public void setXtagPackingIssuerIdLessThanEqual(String xtagPackingIssuerIdLessThanEqual) {
        this.xtagPackingIssuerIdLessThanEqual = xtagPackingIssuerIdLessThanEqual;
    }

    /**
     * xtagPackingIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerIdLikeFront
     */
    public String getXtagPackingIssuerIdLikeFront() {
        return xtagPackingIssuerIdLikeFront;
    }

    /**
     * xtagPackingIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param xtagPackingIssuerIdLikeFront xtagPackingIssuerIdLikeFront に設定する
     */
    public void setXtagPackingIssuerIdLikeFront(String xtagPackingIssuerIdLikeFront) {
        this.xtagPackingIssuerIdLikeFront = xtagPackingIssuerIdLikeFront;
    }

    /**
     * xtagPackingIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNmGreaterThan
     */
    public String getXtagPackingIssuerNmGreaterThan() {
        return xtagPackingIssuerNmGreaterThan;
    }

    /**
     * xtagPackingIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNmGreaterThan xtagPackingIssuerNmGreaterThan に設定する
     */
    public void setXtagPackingIssuerNmGreaterThan(String xtagPackingIssuerNmGreaterThan) {
        this.xtagPackingIssuerNmGreaterThan = xtagPackingIssuerNmGreaterThan;
    }

    /**
     * xtagPackingIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNmGreaterThanEqual
     */
    public String getXtagPackingIssuerNmGreaterThanEqual() {
        return xtagPackingIssuerNmGreaterThanEqual;
    }

    /**
     * xtagPackingIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNmGreaterThanEqual xtagPackingIssuerNmGreaterThanEqual に設定する
     */
    public void setXtagPackingIssuerNmGreaterThanEqual(String xtagPackingIssuerNmGreaterThanEqual) {
        this.xtagPackingIssuerNmGreaterThanEqual = xtagPackingIssuerNmGreaterThanEqual;
    }

    /**
     * xtagPackingIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNmLessThan
     */
    public String getXtagPackingIssuerNmLessThan() {
        return xtagPackingIssuerNmLessThan;
    }

    /**
     * xtagPackingIssuerNmLessThan のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNmLessThan xtagPackingIssuerNmLessThan に設定する
     */
    public void setXtagPackingIssuerNmLessThan(String xtagPackingIssuerNmLessThan) {
        this.xtagPackingIssuerNmLessThan = xtagPackingIssuerNmLessThan;
    }

    /**
     * xtagPackingIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNmLessThanEqual
     */
    public String getXtagPackingIssuerNmLessThanEqual() {
        return xtagPackingIssuerNmLessThanEqual;
    }

    /**
     * xtagPackingIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNmLessThanEqual xtagPackingIssuerNmLessThanEqual に設定する
     */
    public void setXtagPackingIssuerNmLessThanEqual(String xtagPackingIssuerNmLessThanEqual) {
        this.xtagPackingIssuerNmLessThanEqual = xtagPackingIssuerNmLessThanEqual;
    }

    /**
     * xtagPackingIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the xtagPackingIssuerNmLikeFront
     */
    public String getXtagPackingIssuerNmLikeFront() {
        return xtagPackingIssuerNmLikeFront;
    }

    /**
     * xtagPackingIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param xtagPackingIssuerNmLikeFront xtagPackingIssuerNmLikeFront に設定する
     */
    public void setXtagPackingIssuerNmLikeFront(String xtagPackingIssuerNmLikeFront) {
        this.xtagPackingIssuerNmLikeFront = xtagPackingIssuerNmLikeFront;
    }

    /**
     * xtagPackingDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingDtGreaterThanEqual
     */
    public Date getXtagPackingDtGreaterThanEqual() {
        return xtagPackingDtGreaterThanEqual;
    }

    /**
     * xtagPackingDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingDtGreaterThanEqual xtagPackingDtGreaterThanEqual に設定する
     */
    public void setXtagPackingDtGreaterThanEqual(Date xtagPackingDtGreaterThanEqual) {
        this.xtagPackingDtGreaterThanEqual = xtagPackingDtGreaterThanEqual;
    }

    /**
     * xtagPackingDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the xtagPackingDtLessThanEqual
     */
    public Date getXtagPackingDtLessThanEqual() {
        return xtagPackingDtLessThanEqual;
    }

    /**
     * xtagPackingDtLessThanEqual のセッターメソッドです。
     * 
     * @param xtagPackingDtLessThanEqual xtagPackingDtLessThanEqual に設定する
     */
    public void setXtagPackingDtLessThanEqual(Date xtagPackingDtLessThanEqual) {
        this.xtagPackingDtLessThanEqual = xtagPackingDtLessThanEqual;
    }

    /**
     * outerPkgComCdGreaterThan のゲッターメソッドです。
     * 
     * @return the outerPkgComCdGreaterThan
     */
    public String getOuterPkgComCdGreaterThan() {
        return outerPkgComCdGreaterThan;
    }

    /**
     * outerPkgComCdGreaterThan のセッターメソッドです。
     * 
     * @param outerPkgComCdGreaterThan outerPkgComCdGreaterThan に設定する
     */
    public void setOuterPkgComCdGreaterThan(String outerPkgComCdGreaterThan) {
        this.outerPkgComCdGreaterThan = outerPkgComCdGreaterThan;
    }

    /**
     * outerPkgComCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the outerPkgComCdGreaterThanEqual
     */
    public String getOuterPkgComCdGreaterThanEqual() {
        return outerPkgComCdGreaterThanEqual;
    }

    /**
     * outerPkgComCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param outerPkgComCdGreaterThanEqual outerPkgComCdGreaterThanEqual に設定する
     */
    public void setOuterPkgComCdGreaterThanEqual(String outerPkgComCdGreaterThanEqual) {
        this.outerPkgComCdGreaterThanEqual = outerPkgComCdGreaterThanEqual;
    }

    /**
     * outerPkgComCdLessThan のゲッターメソッドです。
     * 
     * @return the outerPkgComCdLessThan
     */
    public String getOuterPkgComCdLessThan() {
        return outerPkgComCdLessThan;
    }

    /**
     * outerPkgComCdLessThan のセッターメソッドです。
     * 
     * @param outerPkgComCdLessThan outerPkgComCdLessThan に設定する
     */
    public void setOuterPkgComCdLessThan(String outerPkgComCdLessThan) {
        this.outerPkgComCdLessThan = outerPkgComCdLessThan;
    }

    /**
     * outerPkgComCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the outerPkgComCdLessThanEqual
     */
    public String getOuterPkgComCdLessThanEqual() {
        return outerPkgComCdLessThanEqual;
    }

    /**
     * outerPkgComCdLessThanEqual のセッターメソッドです。
     * 
     * @param outerPkgComCdLessThanEqual outerPkgComCdLessThanEqual に設定する
     */
    public void setOuterPkgComCdLessThanEqual(String outerPkgComCdLessThanEqual) {
        this.outerPkgComCdLessThanEqual = outerPkgComCdLessThanEqual;
    }

    /**
     * outerPkgComCdLikeFront のゲッターメソッドです。
     * 
     * @return the outerPkgComCdLikeFront
     */
    public String getOuterPkgComCdLikeFront() {
        return outerPkgComCdLikeFront;
    }

    /**
     * outerPkgComCdLikeFront のセッターメソッドです。
     * 
     * @param outerPkgComCdLikeFront outerPkgComCdLikeFront に設定する
     */
    public void setOuterPkgComCdLikeFront(String outerPkgComCdLikeFront) {
        this.outerPkgComCdLikeFront = outerPkgComCdLikeFront;
    }

    /**
     * outerPkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the outerPkgCdGreaterThan
     */
    public String getOuterPkgCdGreaterThan() {
        return outerPkgCdGreaterThan;
    }

    /**
     * outerPkgCdGreaterThan のセッターメソッドです。
     * 
     * @param outerPkgCdGreaterThan outerPkgCdGreaterThan に設定する
     */
    public void setOuterPkgCdGreaterThan(String outerPkgCdGreaterThan) {
        this.outerPkgCdGreaterThan = outerPkgCdGreaterThan;
    }

    /**
     * outerPkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the outerPkgCdGreaterThanEqual
     */
    public String getOuterPkgCdGreaterThanEqual() {
        return outerPkgCdGreaterThanEqual;
    }

    /**
     * outerPkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param outerPkgCdGreaterThanEqual outerPkgCdGreaterThanEqual に設定する
     */
    public void setOuterPkgCdGreaterThanEqual(String outerPkgCdGreaterThanEqual) {
        this.outerPkgCdGreaterThanEqual = outerPkgCdGreaterThanEqual;
    }

    /**
     * outerPkgCdLessThan のゲッターメソッドです。
     * 
     * @return the outerPkgCdLessThan
     */
    public String getOuterPkgCdLessThan() {
        return outerPkgCdLessThan;
    }

    /**
     * outerPkgCdLessThan のセッターメソッドです。
     * 
     * @param outerPkgCdLessThan outerPkgCdLessThan に設定する
     */
    public void setOuterPkgCdLessThan(String outerPkgCdLessThan) {
        this.outerPkgCdLessThan = outerPkgCdLessThan;
    }

    /**
     * outerPkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the outerPkgCdLessThanEqual
     */
    public String getOuterPkgCdLessThanEqual() {
        return outerPkgCdLessThanEqual;
    }

    /**
     * outerPkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param outerPkgCdLessThanEqual outerPkgCdLessThanEqual に設定する
     */
    public void setOuterPkgCdLessThanEqual(String outerPkgCdLessThanEqual) {
        this.outerPkgCdLessThanEqual = outerPkgCdLessThanEqual;
    }

    /**
     * outerPkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the outerPkgCdLikeFront
     */
    public String getOuterPkgCdLikeFront() {
        return outerPkgCdLikeFront;
    }

    /**
     * outerPkgCdLikeFront のセッターメソッドです。
     * 
     * @param outerPkgCdLikeFront outerPkgCdLikeFront に設定する
     */
    public void setOuterPkgCdLikeFront(String outerPkgCdLikeFront) {
        this.outerPkgCdLikeFront = outerPkgCdLikeFront;
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

