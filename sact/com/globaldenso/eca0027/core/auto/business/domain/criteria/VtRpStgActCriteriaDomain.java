/*
 * PROJECT：eca0027
 * 
 * VtRpStgAct の検索条件Domainクラス
 * テーブル概要：VT_RP_STG_ACT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * VtRpStgAct の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_RP_STG_ACT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/02 14:14:58<BR>
 * 
 * テーブル定義から2014/04/02に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class VtRpStgActCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * STG_ACT_NO
     */
    private String stgActNo;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * PKG_QTY
     */
    private BigDecimal pkgQty;

    /**
     * GROSS_WEIGHT
     */
    private BigDecimal grossWeight;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * LOADING_RATIO
     */
    private BigDecimal loadingRatio;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * WEIGHT_PER_A
     */
    private BigDecimal weightPerA;

    /**
     * WEIGHT_PER_B
     */
    private BigDecimal weightPerB;

    /**
     * WEIGHT_PER_C
     */
    private BigDecimal weightPerC;

    /**
     * WEIGHT_PER_D
     */
    private BigDecimal weightPerD;

    /**
     * STG_ACT_DT
     */
    private Date stgActDt;

    /**
     * STG_ACT_ISSUER_NM
     */
    private String stgActIssuerNm;

    /**
     * TRNS_TYP_NM
     */
    private String trnsTypNm;

    /**
     * TRNS_NM
     */
    private String trnsNm;

    /**
     * STG_ACT_NO（大なり）
     */
    private String stgActNoGreaterThan;

    /**
     * STG_ACT_NO（大なりイコール）
     */
    private String stgActNoGreaterThanEqual;

    /**
     * STG_ACT_NO（小なり）
     */
    private String stgActNoLessThan;

    /**
     * STG_ACT_NO（小なりイコール）
     */
    private String stgActNoLessThanEqual;

    /**
     * STG_ACT_NO（前方一致）
     */
    private String stgActNoLikeFront;

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
     * STG_ACT_DT（大なりイコール）
     */
    private Date stgActDtGreaterThanEqual;

    /**
     * STG_ACT_DT（小なりイコール）
     */
    private Date stgActDtLessThanEqual;

    /**
     * STG_ACT_ISSUER_NM（大なり）
     */
    private String stgActIssuerNmGreaterThan;

    /**
     * STG_ACT_ISSUER_NM（大なりイコール）
     */
    private String stgActIssuerNmGreaterThanEqual;

    /**
     * STG_ACT_ISSUER_NM（小なり）
     */
    private String stgActIssuerNmLessThan;

    /**
     * STG_ACT_ISSUER_NM（小なりイコール）
     */
    private String stgActIssuerNmLessThanEqual;

    /**
     * STG_ACT_ISSUER_NM（前方一致）
     */
    private String stgActIssuerNmLikeFront;

    /**
     * TRNS_TYP_NM（大なり）
     */
    private String trnsTypNmGreaterThan;

    /**
     * TRNS_TYP_NM（大なりイコール）
     */
    private String trnsTypNmGreaterThanEqual;

    /**
     * TRNS_TYP_NM（小なり）
     */
    private String trnsTypNmLessThan;

    /**
     * TRNS_TYP_NM（小なりイコール）
     */
    private String trnsTypNmLessThanEqual;

    /**
     * TRNS_TYP_NM（前方一致）
     */
    private String trnsTypNmLikeFront;

    /**
     * TRNS_NM（大なり）
     */
    private String trnsNmGreaterThan;

    /**
     * TRNS_NM（大なりイコール）
     */
    private String trnsNmGreaterThanEqual;

    /**
     * TRNS_NM（小なり）
     */
    private String trnsNmLessThan;

    /**
     * TRNS_NM（小なりイコール）
     */
    private String trnsNmLessThanEqual;

    /**
     * TRNS_NM（前方一致）
     */
    private String trnsNmLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpStgActCriteriaDomain() {
    }

    /**
     * stgActNo のゲッターメソッドです。
     * 
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * stgActNo のセッターメソッドです。
     * 
     * @param stgActNo stgActNo に設定する
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
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
     * loadingRatio のゲッターメソッドです。
     * 
     * @return the loadingRatio
     */
    public BigDecimal getLoadingRatio() {
        return loadingRatio;
    }

    /**
     * loadingRatio のセッターメソッドです。
     * 
     * @param loadingRatio loadingRatio に設定する
     */
    public void setLoadingRatio(BigDecimal loadingRatio) {
        this.loadingRatio = loadingRatio;
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
     * weightPerA のゲッターメソッドです。
     * 
     * @return the weightPerA
     */
    public BigDecimal getWeightPerA() {
        return weightPerA;
    }

    /**
     * weightPerA のセッターメソッドです。
     * 
     * @param weightPerA weightPerA に設定する
     */
    public void setWeightPerA(BigDecimal weightPerA) {
        this.weightPerA = weightPerA;
    }

    /**
     * weightPerB のゲッターメソッドです。
     * 
     * @return the weightPerB
     */
    public BigDecimal getWeightPerB() {
        return weightPerB;
    }

    /**
     * weightPerB のセッターメソッドです。
     * 
     * @param weightPerB weightPerB に設定する
     */
    public void setWeightPerB(BigDecimal weightPerB) {
        this.weightPerB = weightPerB;
    }

    /**
     * weightPerC のゲッターメソッドです。
     * 
     * @return the weightPerC
     */
    public BigDecimal getWeightPerC() {
        return weightPerC;
    }

    /**
     * weightPerC のセッターメソッドです。
     * 
     * @param weightPerC weightPerC に設定する
     */
    public void setWeightPerC(BigDecimal weightPerC) {
        this.weightPerC = weightPerC;
    }

    /**
     * weightPerD のゲッターメソッドです。
     * 
     * @return the weightPerD
     */
    public BigDecimal getWeightPerD() {
        return weightPerD;
    }

    /**
     * weightPerD のセッターメソッドです。
     * 
     * @param weightPerD weightPerD に設定する
     */
    public void setWeightPerD(BigDecimal weightPerD) {
        this.weightPerD = weightPerD;
    }

    /**
     * stgActDt のゲッターメソッドです。
     * 
     * @return the stgActDt
     */
    public Date getStgActDt() {
        return stgActDt;
    }

    /**
     * stgActDt のセッターメソッドです。
     * 
     * @param stgActDt stgActDt に設定する
     */
    public void setStgActDt(Date stgActDt) {
        this.stgActDt = stgActDt;
    }

    /**
     * stgActIssuerNm のゲッターメソッドです。
     * 
     * @return the stgActIssuerNm
     */
    public String getStgActIssuerNm() {
        return stgActIssuerNm;
    }

    /**
     * stgActIssuerNm のセッターメソッドです。
     * 
     * @param stgActIssuerNm stgActIssuerNm に設定する
     */
    public void setStgActIssuerNm(String stgActIssuerNm) {
        this.stgActIssuerNm = stgActIssuerNm;
    }

    /**
     * trnsTypNm のゲッターメソッドです。
     * 
     * @return the trnsTypNm
     */
    public String getTrnsTypNm() {
        return trnsTypNm;
    }

    /**
     * trnsTypNm のセッターメソッドです。
     * 
     * @param trnsTypNm trnsTypNm に設定する
     */
    public void setTrnsTypNm(String trnsTypNm) {
        this.trnsTypNm = trnsTypNm;
    }

    /**
     * trnsNm のゲッターメソッドです。
     * 
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * trnsNm のセッターメソッドです。
     * 
     * @param trnsNm trnsNm に設定する
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
    }

    /**
     * stgActNoGreaterThan のゲッターメソッドです。
     * 
     * @return the stgActNoGreaterThan
     */
    public String getStgActNoGreaterThan() {
        return stgActNoGreaterThan;
    }

    /**
     * stgActNoGreaterThan のセッターメソッドです。
     * 
     * @param stgActNoGreaterThan stgActNoGreaterThan に設定する
     */
    public void setStgActNoGreaterThan(String stgActNoGreaterThan) {
        this.stgActNoGreaterThan = stgActNoGreaterThan;
    }

    /**
     * stgActNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgActNoGreaterThanEqual
     */
    public String getStgActNoGreaterThanEqual() {
        return stgActNoGreaterThanEqual;
    }

    /**
     * stgActNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgActNoGreaterThanEqual stgActNoGreaterThanEqual に設定する
     */
    public void setStgActNoGreaterThanEqual(String stgActNoGreaterThanEqual) {
        this.stgActNoGreaterThanEqual = stgActNoGreaterThanEqual;
    }

    /**
     * stgActNoLessThan のゲッターメソッドです。
     * 
     * @return the stgActNoLessThan
     */
    public String getStgActNoLessThan() {
        return stgActNoLessThan;
    }

    /**
     * stgActNoLessThan のセッターメソッドです。
     * 
     * @param stgActNoLessThan stgActNoLessThan に設定する
     */
    public void setStgActNoLessThan(String stgActNoLessThan) {
        this.stgActNoLessThan = stgActNoLessThan;
    }

    /**
     * stgActNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgActNoLessThanEqual
     */
    public String getStgActNoLessThanEqual() {
        return stgActNoLessThanEqual;
    }

    /**
     * stgActNoLessThanEqual のセッターメソッドです。
     * 
     * @param stgActNoLessThanEqual stgActNoLessThanEqual に設定する
     */
    public void setStgActNoLessThanEqual(String stgActNoLessThanEqual) {
        this.stgActNoLessThanEqual = stgActNoLessThanEqual;
    }

    /**
     * stgActNoLikeFront のゲッターメソッドです。
     * 
     * @return the stgActNoLikeFront
     */
    public String getStgActNoLikeFront() {
        return stgActNoLikeFront;
    }

    /**
     * stgActNoLikeFront のセッターメソッドです。
     * 
     * @param stgActNoLikeFront stgActNoLikeFront に設定する
     */
    public void setStgActNoLikeFront(String stgActNoLikeFront) {
        this.stgActNoLikeFront = stgActNoLikeFront;
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

    /**
     * stgActDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgActDtGreaterThanEqual
     */
    public Date getStgActDtGreaterThanEqual() {
        return stgActDtGreaterThanEqual;
    }

    /**
     * stgActDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgActDtGreaterThanEqual stgActDtGreaterThanEqual に設定する
     */
    public void setStgActDtGreaterThanEqual(Date stgActDtGreaterThanEqual) {
        this.stgActDtGreaterThanEqual = stgActDtGreaterThanEqual;
    }

    /**
     * stgActDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgActDtLessThanEqual
     */
    public Date getStgActDtLessThanEqual() {
        return stgActDtLessThanEqual;
    }

    /**
     * stgActDtLessThanEqual のセッターメソッドです。
     * 
     * @param stgActDtLessThanEqual stgActDtLessThanEqual に設定する
     */
    public void setStgActDtLessThanEqual(Date stgActDtLessThanEqual) {
        this.stgActDtLessThanEqual = stgActDtLessThanEqual;
    }

    /**
     * stgActIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the stgActIssuerNmGreaterThan
     */
    public String getStgActIssuerNmGreaterThan() {
        return stgActIssuerNmGreaterThan;
    }

    /**
     * stgActIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param stgActIssuerNmGreaterThan stgActIssuerNmGreaterThan に設定する
     */
    public void setStgActIssuerNmGreaterThan(String stgActIssuerNmGreaterThan) {
        this.stgActIssuerNmGreaterThan = stgActIssuerNmGreaterThan;
    }

    /**
     * stgActIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgActIssuerNmGreaterThanEqual
     */
    public String getStgActIssuerNmGreaterThanEqual() {
        return stgActIssuerNmGreaterThanEqual;
    }

    /**
     * stgActIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgActIssuerNmGreaterThanEqual stgActIssuerNmGreaterThanEqual に設定する
     */
    public void setStgActIssuerNmGreaterThanEqual(String stgActIssuerNmGreaterThanEqual) {
        this.stgActIssuerNmGreaterThanEqual = stgActIssuerNmGreaterThanEqual;
    }

    /**
     * stgActIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the stgActIssuerNmLessThan
     */
    public String getStgActIssuerNmLessThan() {
        return stgActIssuerNmLessThan;
    }

    /**
     * stgActIssuerNmLessThan のセッターメソッドです。
     * 
     * @param stgActIssuerNmLessThan stgActIssuerNmLessThan に設定する
     */
    public void setStgActIssuerNmLessThan(String stgActIssuerNmLessThan) {
        this.stgActIssuerNmLessThan = stgActIssuerNmLessThan;
    }

    /**
     * stgActIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgActIssuerNmLessThanEqual
     */
    public String getStgActIssuerNmLessThanEqual() {
        return stgActIssuerNmLessThanEqual;
    }

    /**
     * stgActIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param stgActIssuerNmLessThanEqual stgActIssuerNmLessThanEqual に設定する
     */
    public void setStgActIssuerNmLessThanEqual(String stgActIssuerNmLessThanEqual) {
        this.stgActIssuerNmLessThanEqual = stgActIssuerNmLessThanEqual;
    }

    /**
     * stgActIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the stgActIssuerNmLikeFront
     */
    public String getStgActIssuerNmLikeFront() {
        return stgActIssuerNmLikeFront;
    }

    /**
     * stgActIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param stgActIssuerNmLikeFront stgActIssuerNmLikeFront に設定する
     */
    public void setStgActIssuerNmLikeFront(String stgActIssuerNmLikeFront) {
        this.stgActIssuerNmLikeFront = stgActIssuerNmLikeFront;
    }

    /**
     * trnsTypNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsTypNmGreaterThan
     */
    public String getTrnsTypNmGreaterThan() {
        return trnsTypNmGreaterThan;
    }

    /**
     * trnsTypNmGreaterThan のセッターメソッドです。
     * 
     * @param trnsTypNmGreaterThan trnsTypNmGreaterThan に設定する
     */
    public void setTrnsTypNmGreaterThan(String trnsTypNmGreaterThan) {
        this.trnsTypNmGreaterThan = trnsTypNmGreaterThan;
    }

    /**
     * trnsTypNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypNmGreaterThanEqual
     */
    public String getTrnsTypNmGreaterThanEqual() {
        return trnsTypNmGreaterThanEqual;
    }

    /**
     * trnsTypNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsTypNmGreaterThanEqual trnsTypNmGreaterThanEqual に設定する
     */
    public void setTrnsTypNmGreaterThanEqual(String trnsTypNmGreaterThanEqual) {
        this.trnsTypNmGreaterThanEqual = trnsTypNmGreaterThanEqual;
    }

    /**
     * trnsTypNmLessThan のゲッターメソッドです。
     * 
     * @return the trnsTypNmLessThan
     */
    public String getTrnsTypNmLessThan() {
        return trnsTypNmLessThan;
    }

    /**
     * trnsTypNmLessThan のセッターメソッドです。
     * 
     * @param trnsTypNmLessThan trnsTypNmLessThan に設定する
     */
    public void setTrnsTypNmLessThan(String trnsTypNmLessThan) {
        this.trnsTypNmLessThan = trnsTypNmLessThan;
    }

    /**
     * trnsTypNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypNmLessThanEqual
     */
    public String getTrnsTypNmLessThanEqual() {
        return trnsTypNmLessThanEqual;
    }

    /**
     * trnsTypNmLessThanEqual のセッターメソッドです。
     * 
     * @param trnsTypNmLessThanEqual trnsTypNmLessThanEqual に設定する
     */
    public void setTrnsTypNmLessThanEqual(String trnsTypNmLessThanEqual) {
        this.trnsTypNmLessThanEqual = trnsTypNmLessThanEqual;
    }

    /**
     * trnsTypNmLikeFront のゲッターメソッドです。
     * 
     * @return the trnsTypNmLikeFront
     */
    public String getTrnsTypNmLikeFront() {
        return trnsTypNmLikeFront;
    }

    /**
     * trnsTypNmLikeFront のセッターメソッドです。
     * 
     * @param trnsTypNmLikeFront trnsTypNmLikeFront に設定する
     */
    public void setTrnsTypNmLikeFront(String trnsTypNmLikeFront) {
        this.trnsTypNmLikeFront = trnsTypNmLikeFront;
    }

    /**
     * trnsNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsNmGreaterThan
     */
    public String getTrnsNmGreaterThan() {
        return trnsNmGreaterThan;
    }

    /**
     * trnsNmGreaterThan のセッターメソッドです。
     * 
     * @param trnsNmGreaterThan trnsNmGreaterThan に設定する
     */
    public void setTrnsNmGreaterThan(String trnsNmGreaterThan) {
        this.trnsNmGreaterThan = trnsNmGreaterThan;
    }

    /**
     * trnsNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsNmGreaterThanEqual
     */
    public String getTrnsNmGreaterThanEqual() {
        return trnsNmGreaterThanEqual;
    }

    /**
     * trnsNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsNmGreaterThanEqual trnsNmGreaterThanEqual に設定する
     */
    public void setTrnsNmGreaterThanEqual(String trnsNmGreaterThanEqual) {
        this.trnsNmGreaterThanEqual = trnsNmGreaterThanEqual;
    }

    /**
     * trnsNmLessThan のゲッターメソッドです。
     * 
     * @return the trnsNmLessThan
     */
    public String getTrnsNmLessThan() {
        return trnsNmLessThan;
    }

    /**
     * trnsNmLessThan のセッターメソッドです。
     * 
     * @param trnsNmLessThan trnsNmLessThan に設定する
     */
    public void setTrnsNmLessThan(String trnsNmLessThan) {
        this.trnsNmLessThan = trnsNmLessThan;
    }

    /**
     * trnsNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsNmLessThanEqual
     */
    public String getTrnsNmLessThanEqual() {
        return trnsNmLessThanEqual;
    }

    /**
     * trnsNmLessThanEqual のセッターメソッドです。
     * 
     * @param trnsNmLessThanEqual trnsNmLessThanEqual に設定する
     */
    public void setTrnsNmLessThanEqual(String trnsNmLessThanEqual) {
        this.trnsNmLessThanEqual = trnsNmLessThanEqual;
    }

    /**
     * trnsNmLikeFront のゲッターメソッドです。
     * 
     * @return the trnsNmLikeFront
     */
    public String getTrnsNmLikeFront() {
        return trnsNmLikeFront;
    }

    /**
     * trnsNmLikeFront のセッターメソッドです。
     * 
     * @param trnsNmLikeFront trnsNmLikeFront に設定する
     */
    public void setTrnsNmLikeFront(String trnsNmLikeFront) {
        this.trnsNmLikeFront = trnsNmLikeFront;
    }

}

