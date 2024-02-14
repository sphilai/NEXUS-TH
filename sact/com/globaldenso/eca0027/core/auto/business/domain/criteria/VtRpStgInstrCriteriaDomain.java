/*
 * PROJECT：eca0027
 * 
 * VtRpStgInstr の検索条件Domainクラス
 * テーブル概要：VT_RP_STG_INSTR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/25  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * VtRpStgInstr の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_STG_INSTR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/25 13:55:48<BR>
 * 
 * テーブル定義から2014/03/25に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtRpStgInstrCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * STG_INSTR_NO
     */
    private String stgInstrNo;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * ETD
     */
    private Date etd;

    /**
     * CARRIER_COMP_CD
     */
    private String carrierCompCd;

    /**
     * PKG_QTY
     */
    private BigDecimal pkgQty;

    /**
     * STG_INSTR_DT
     */
    private Date stgInstrDt;

    /**
     * STG_INSTR_ISSUER_NM
     */
    private String stgInstrIssuerNm;

    /**
     * SHIPPER_NM_ABB
     */
    private String shipperNmAbb;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * STG_INSTR_NO（大なり）
     */
    private String stgInstrNoGreaterThan;

    /**
     * STG_INSTR_NO（大なりイコール）
     */
    private String stgInstrNoGreaterThanEqual;

    /**
     * STG_INSTR_NO（小なり）
     */
    private String stgInstrNoLessThan;

    /**
     * STG_INSTR_NO（小なりイコール）
     */
    private String stgInstrNoLessThanEqual;

    /**
     * STG_INSTR_NO（前方一致）
     */
    private String stgInstrNoLikeFront;

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
     * ETD（大なりイコール）
     */
    private Date etdGreaterThanEqual;

    /**
     * ETD（小なりイコール）
     */
    private Date etdLessThanEqual;

    /**
     * CARRIER_COMP_CD（大なり）
     */
    private String carrierCompCdGreaterThan;

    /**
     * CARRIER_COMP_CD（大なりイコール）
     */
    private String carrierCompCdGreaterThanEqual;

    /**
     * CARRIER_COMP_CD（小なり）
     */
    private String carrierCompCdLessThan;

    /**
     * CARRIER_COMP_CD（小なりイコール）
     */
    private String carrierCompCdLessThanEqual;

    /**
     * CARRIER_COMP_CD（前方一致）
     */
    private String carrierCompCdLikeFront;

    /**
     * STG_INSTR_DT（大なりイコール）
     */
    private Date stgInstrDtGreaterThanEqual;

    /**
     * STG_INSTR_DT（小なりイコール）
     */
    private Date stgInstrDtLessThanEqual;

    /**
     * STG_INSTR_ISSUER_NM（大なり）
     */
    private String stgInstrIssuerNmGreaterThan;

    /**
     * STG_INSTR_ISSUER_NM（大なりイコール）
     */
    private String stgInstrIssuerNmGreaterThanEqual;

    /**
     * STG_INSTR_ISSUER_NM（小なり）
     */
    private String stgInstrIssuerNmLessThan;

    /**
     * STG_INSTR_ISSUER_NM（小なりイコール）
     */
    private String stgInstrIssuerNmLessThanEqual;

    /**
     * STG_INSTR_ISSUER_NM（前方一致）
     */
    private String stgInstrIssuerNmLikeFront;

    /**
     * SHIPPER_NM_ABB（大なり）
     */
    private String shipperNmAbbGreaterThan;

    /**
     * SHIPPER_NM_ABB（大なりイコール）
     */
    private String shipperNmAbbGreaterThanEqual;

    /**
     * SHIPPER_NM_ABB（小なり）
     */
    private String shipperNmAbbLessThan;

    /**
     * SHIPPER_NM_ABB（小なりイコール）
     */
    private String shipperNmAbbLessThanEqual;

    /**
     * SHIPPER_NM_ABB（前方一致）
     */
    private String shipperNmAbbLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public VtRpStgInstrCriteriaDomain() {
    }

    /**
     * stgInstrNo のゲッターメソッドです。
     * 
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * stgInstrNo のセッターメソッドです。
     * 
     * @param stgInstrNo stgInstrNo に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
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
     * etd のゲッターメソッドです。
     * 
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * etd のセッターメソッドです。
     * 
     * @param etd etd に設定する
     */
    public void setEtd(Date etd) {
        this.etd = etd;
    }

    /**
     * carrierCompCd のゲッターメソッドです。
     * 
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * carrierCompCd のセッターメソッドです。
     * 
     * @param carrierCompCd carrierCompCd に設定する
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * pkgQty のゲッターメソッドです。
     * 
     * @return the pkgQty
     */
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * pkgQty のセッターメソッドです。
     * 
     * @param pkgQty pkgQty に設定する
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * stgInstrDt のゲッターメソッドです。
     * 
     * @return the stgInstrDt
     */
    public Date getStgInstrDt() {
        return stgInstrDt;
    }

    /**
     * stgInstrDt のセッターメソッドです。
     * 
     * @param stgInstrDt stgInstrDt に設定する
     */
    public void setStgInstrDt(Date stgInstrDt) {
        this.stgInstrDt = stgInstrDt;
    }

    /**
     * stgInstrIssuerNm のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNm
     */
    public String getStgInstrIssuerNm() {
        return stgInstrIssuerNm;
    }

    /**
     * stgInstrIssuerNm のセッターメソッドです。
     * 
     * @param stgInstrIssuerNm stgInstrIssuerNm に設定する
     */
    public void setStgInstrIssuerNm(String stgInstrIssuerNm) {
        this.stgInstrIssuerNm = stgInstrIssuerNm;
    }

    /**
     * shipperNmAbb のゲッターメソッドです。
     * 
     * @return the shipperNmAbb
     */
    public String getShipperNmAbb() {
        return shipperNmAbb;
    }

    /**
     * shipperNmAbb のセッターメソッドです。
     * 
     * @param shipperNmAbb shipperNmAbb に設定する
     */
    public void setShipperNmAbb(String shipperNmAbb) {
        this.shipperNmAbb = shipperNmAbb;
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
     * stgInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThan
     */
    public String getStgInstrNoGreaterThan() {
        return stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThan stgInstrNoGreaterThan に設定する
     */
    public void setStgInstrNoGreaterThan(String stgInstrNoGreaterThan) {
        this.stgInstrNoGreaterThan = stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThanEqual
     */
    public String getStgInstrNoGreaterThanEqual() {
        return stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThanEqual stgInstrNoGreaterThanEqual に設定する
     */
    public void setStgInstrNoGreaterThanEqual(String stgInstrNoGreaterThanEqual) {
        this.stgInstrNoGreaterThanEqual = stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThan
     */
    public String getStgInstrNoLessThan() {
        return stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThan のセッターメソッドです。
     * 
     * @param stgInstrNoLessThan stgInstrNoLessThan に設定する
     */
    public void setStgInstrNoLessThan(String stgInstrNoLessThan) {
        this.stgInstrNoLessThan = stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThanEqual
     */
    public String getStgInstrNoLessThanEqual() {
        return stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoLessThanEqual stgInstrNoLessThanEqual に設定する
     */
    public void setStgInstrNoLessThanEqual(String stgInstrNoLessThanEqual) {
        this.stgInstrNoLessThanEqual = stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrNoLikeFront
     */
    public String getStgInstrNoLikeFront() {
        return stgInstrNoLikeFront;
    }

    /**
     * stgInstrNoLikeFront のセッターメソッドです。
     * 
     * @param stgInstrNoLikeFront stgInstrNoLikeFront に設定する
     */
    public void setStgInstrNoLikeFront(String stgInstrNoLikeFront) {
        this.stgInstrNoLikeFront = stgInstrNoLikeFront;
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
     * etdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etdGreaterThanEqual
     */
    public Date getEtdGreaterThanEqual() {
        return etdGreaterThanEqual;
    }

    /**
     * etdGreaterThanEqual のセッターメソッドです。
     * 
     * @param etdGreaterThanEqual etdGreaterThanEqual に設定する
     */
    public void setEtdGreaterThanEqual(Date etdGreaterThanEqual) {
        this.etdGreaterThanEqual = etdGreaterThanEqual;
    }

    /**
     * etdLessThanEqual のゲッターメソッドです。
     * 
     * @return the etdLessThanEqual
     */
    public Date getEtdLessThanEqual() {
        return etdLessThanEqual;
    }

    /**
     * etdLessThanEqual のセッターメソッドです。
     * 
     * @param etdLessThanEqual etdLessThanEqual に設定する
     */
    public void setEtdLessThanEqual(Date etdLessThanEqual) {
        this.etdLessThanEqual = etdLessThanEqual;
    }

    /**
     * carrierCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThan
     */
    public String getCarrierCompCdGreaterThan() {
        return carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThan carrierCompCdGreaterThan に設定する
     */
    public void setCarrierCompCdGreaterThan(String carrierCompCdGreaterThan) {
        this.carrierCompCdGreaterThan = carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThanEqual
     */
    public String getCarrierCompCdGreaterThanEqual() {
        return carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThanEqual carrierCompCdGreaterThanEqual に設定する
     */
    public void setCarrierCompCdGreaterThanEqual(String carrierCompCdGreaterThanEqual) {
        this.carrierCompCdGreaterThanEqual = carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThan
     */
    public String getCarrierCompCdLessThan() {
        return carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThan のセッターメソッドです。
     * 
     * @param carrierCompCdLessThan carrierCompCdLessThan に設定する
     */
    public void setCarrierCompCdLessThan(String carrierCompCdLessThan) {
        this.carrierCompCdLessThan = carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThanEqual
     */
    public String getCarrierCompCdLessThanEqual() {
        return carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdLessThanEqual carrierCompCdLessThanEqual に設定する
     */
    public void setCarrierCompCdLessThanEqual(String carrierCompCdLessThanEqual) {
        this.carrierCompCdLessThanEqual = carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompCdLikeFront
     */
    public String getCarrierCompCdLikeFront() {
        return carrierCompCdLikeFront;
    }

    /**
     * carrierCompCdLikeFront のセッターメソッドです。
     * 
     * @param carrierCompCdLikeFront carrierCompCdLikeFront に設定する
     */
    public void setCarrierCompCdLikeFront(String carrierCompCdLikeFront) {
        this.carrierCompCdLikeFront = carrierCompCdLikeFront;
    }

    /**
     * stgInstrDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrDtGreaterThanEqual
     */
    public Date getStgInstrDtGreaterThanEqual() {
        return stgInstrDtGreaterThanEqual;
    }

    /**
     * stgInstrDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrDtGreaterThanEqual stgInstrDtGreaterThanEqual に設定する
     */
    public void setStgInstrDtGreaterThanEqual(Date stgInstrDtGreaterThanEqual) {
        this.stgInstrDtGreaterThanEqual = stgInstrDtGreaterThanEqual;
    }

    /**
     * stgInstrDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrDtLessThanEqual
     */
    public Date getStgInstrDtLessThanEqual() {
        return stgInstrDtLessThanEqual;
    }

    /**
     * stgInstrDtLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrDtLessThanEqual stgInstrDtLessThanEqual に設定する
     */
    public void setStgInstrDtLessThanEqual(Date stgInstrDtLessThanEqual) {
        this.stgInstrDtLessThanEqual = stgInstrDtLessThanEqual;
    }

    /**
     * stgInstrIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNmGreaterThan
     */
    public String getStgInstrIssuerNmGreaterThan() {
        return stgInstrIssuerNmGreaterThan;
    }

    /**
     * stgInstrIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrIssuerNmGreaterThan stgInstrIssuerNmGreaterThan に設定する
     */
    public void setStgInstrIssuerNmGreaterThan(String stgInstrIssuerNmGreaterThan) {
        this.stgInstrIssuerNmGreaterThan = stgInstrIssuerNmGreaterThan;
    }

    /**
     * stgInstrIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNmGreaterThanEqual
     */
    public String getStgInstrIssuerNmGreaterThanEqual() {
        return stgInstrIssuerNmGreaterThanEqual;
    }

    /**
     * stgInstrIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrIssuerNmGreaterThanEqual stgInstrIssuerNmGreaterThanEqual に設定する
     */
    public void setStgInstrIssuerNmGreaterThanEqual(String stgInstrIssuerNmGreaterThanEqual) {
        this.stgInstrIssuerNmGreaterThanEqual = stgInstrIssuerNmGreaterThanEqual;
    }

    /**
     * stgInstrIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNmLessThan
     */
    public String getStgInstrIssuerNmLessThan() {
        return stgInstrIssuerNmLessThan;
    }

    /**
     * stgInstrIssuerNmLessThan のセッターメソッドです。
     * 
     * @param stgInstrIssuerNmLessThan stgInstrIssuerNmLessThan に設定する
     */
    public void setStgInstrIssuerNmLessThan(String stgInstrIssuerNmLessThan) {
        this.stgInstrIssuerNmLessThan = stgInstrIssuerNmLessThan;
    }

    /**
     * stgInstrIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNmLessThanEqual
     */
    public String getStgInstrIssuerNmLessThanEqual() {
        return stgInstrIssuerNmLessThanEqual;
    }

    /**
     * stgInstrIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrIssuerNmLessThanEqual stgInstrIssuerNmLessThanEqual に設定する
     */
    public void setStgInstrIssuerNmLessThanEqual(String stgInstrIssuerNmLessThanEqual) {
        this.stgInstrIssuerNmLessThanEqual = stgInstrIssuerNmLessThanEqual;
    }

    /**
     * stgInstrIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrIssuerNmLikeFront
     */
    public String getStgInstrIssuerNmLikeFront() {
        return stgInstrIssuerNmLikeFront;
    }

    /**
     * stgInstrIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param stgInstrIssuerNmLikeFront stgInstrIssuerNmLikeFront に設定する
     */
    public void setStgInstrIssuerNmLikeFront(String stgInstrIssuerNmLikeFront) {
        this.stgInstrIssuerNmLikeFront = stgInstrIssuerNmLikeFront;
    }

    /**
     * shipperNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperNmAbbGreaterThan
     */
    public String getShipperNmAbbGreaterThan() {
        return shipperNmAbbGreaterThan;
    }

    /**
     * shipperNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param shipperNmAbbGreaterThan shipperNmAbbGreaterThan に設定する
     */
    public void setShipperNmAbbGreaterThan(String shipperNmAbbGreaterThan) {
        this.shipperNmAbbGreaterThan = shipperNmAbbGreaterThan;
    }

    /**
     * shipperNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperNmAbbGreaterThanEqual
     */
    public String getShipperNmAbbGreaterThanEqual() {
        return shipperNmAbbGreaterThanEqual;
    }

    /**
     * shipperNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperNmAbbGreaterThanEqual shipperNmAbbGreaterThanEqual に設定する
     */
    public void setShipperNmAbbGreaterThanEqual(String shipperNmAbbGreaterThanEqual) {
        this.shipperNmAbbGreaterThanEqual = shipperNmAbbGreaterThanEqual;
    }

    /**
     * shipperNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the shipperNmAbbLessThan
     */
    public String getShipperNmAbbLessThan() {
        return shipperNmAbbLessThan;
    }

    /**
     * shipperNmAbbLessThan のセッターメソッドです。
     * 
     * @param shipperNmAbbLessThan shipperNmAbbLessThan に設定する
     */
    public void setShipperNmAbbLessThan(String shipperNmAbbLessThan) {
        this.shipperNmAbbLessThan = shipperNmAbbLessThan;
    }

    /**
     * shipperNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperNmAbbLessThanEqual
     */
    public String getShipperNmAbbLessThanEqual() {
        return shipperNmAbbLessThanEqual;
    }

    /**
     * shipperNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param shipperNmAbbLessThanEqual shipperNmAbbLessThanEqual に設定する
     */
    public void setShipperNmAbbLessThanEqual(String shipperNmAbbLessThanEqual) {
        this.shipperNmAbbLessThanEqual = shipperNmAbbLessThanEqual;
    }

    /**
     * shipperNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the shipperNmAbbLikeFront
     */
    public String getShipperNmAbbLikeFront() {
        return shipperNmAbbLikeFront;
    }

    /**
     * shipperNmAbbLikeFront のセッターメソッドです。
     * 
     * @param shipperNmAbbLikeFront shipperNmAbbLikeFront に設定する
     */
    public void setShipperNmAbbLikeFront(String shipperNmAbbLikeFront) {
        this.shipperNmAbbLikeFront = shipperNmAbbLikeFront;
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

}

