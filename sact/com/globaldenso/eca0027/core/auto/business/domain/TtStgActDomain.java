/*
 * PROJECT：eca0027
 * 
 * TtStgAct のDomainクラス
 * テーブル概要：TT_STG_ACT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtStgAct のDomainクラスです。<BR>
 * テーブル概要：TT_STG_ACT<BR>
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
public class TtStgActDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * STG_ACT_NO
     */
    private String stgActNo;

    /**
     * WH_COMP_CD
     */
    private String whCompCd;

    /**
     * WH_CD
     */
    private String whCd;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_TYP_CD
     */
    private String trnsTypCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

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
     * STG_ACT_ISSUER_ID
     */
    private String stgActIssuerId;

    /**
     * STG_ACT_ISSUER_NM
     */
    private String stgActIssuerNm;

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
    public TtStgActDomain() {
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
     * whCompCd のゲッターメソッドです。
     * 
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * whCompCd のセッターメソッドです。
     * 
     * @param whCompCd whCompCd に設定する
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * whCd のゲッターメソッドです。
     * 
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * whCd のセッターメソッドです。
     * 
     * @param whCd whCd に設定する
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
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
     * trnsTypCd のゲッターメソッドです。
     * 
     * @return the trnsTypCd
     */
    public String getTrnsTypCd() {
        return trnsTypCd;
    }

    /**
     * trnsTypCd のセッターメソッドです。
     * 
     * @param trnsTypCd trnsTypCd に設定する
     */
    public void setTrnsTypCd(String trnsTypCd) {
        this.trnsTypCd = trnsTypCd;
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
     * stgActIssuerId のゲッターメソッドです。
     * 
     * @return the stgActIssuerId
     */
    public String getStgActIssuerId() {
        return stgActIssuerId;
    }

    /**
     * stgActIssuerId のセッターメソッドです。
     * 
     * @param stgActIssuerId stgActIssuerId に設定する
     */
    public void setStgActIssuerId(String stgActIssuerId) {
        this.stgActIssuerId = stgActIssuerId;
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
