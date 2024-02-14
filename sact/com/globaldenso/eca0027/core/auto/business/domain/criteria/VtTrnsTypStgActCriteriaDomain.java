/*
 * PROJECT：eca0027
 * 
 * VtTrnsTypStgAct の検索条件Domainクラス
 * テーブル概要：VT_TRNS_TYP_STG_ACT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;

/**
 * VtTrnsTypStgAct の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_TRNS_TYP_STG_ACT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtTrnsTypStgActCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * TRNS_TYP_CD
     */
    private String trnsTypCd;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * VOLUME
     */
    private BigDecimal volume;

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
     * TRNS_TYP_CD（大なり）
     */
    private String trnsTypCdGreaterThan;

    /**
     * TRNS_TYP_CD（大なりイコール）
     */
    private String trnsTypCdGreaterThanEqual;

    /**
     * TRNS_TYP_CD（小なり）
     */
    private String trnsTypCdLessThan;

    /**
     * TRNS_TYP_CD（小なりイコール）
     */
    private String trnsTypCdLessThanEqual;

    /**
     * TRNS_TYP_CD（前方一致）
     */
    private String trnsTypCdLikeFront;

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
     * デフォルトコンストラクタ。
     */
    public VtTrnsTypStgActCriteriaDomain() {
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
     * trnsTypCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsTypCdGreaterThan
     */
    public String getTrnsTypCdGreaterThan() {
        return trnsTypCdGreaterThan;
    }

    /**
     * trnsTypCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsTypCdGreaterThan trnsTypCdGreaterThan に設定する
     */
    public void setTrnsTypCdGreaterThan(String trnsTypCdGreaterThan) {
        this.trnsTypCdGreaterThan = trnsTypCdGreaterThan;
    }

    /**
     * trnsTypCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypCdGreaterThanEqual
     */
    public String getTrnsTypCdGreaterThanEqual() {
        return trnsTypCdGreaterThanEqual;
    }

    /**
     * trnsTypCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsTypCdGreaterThanEqual trnsTypCdGreaterThanEqual に設定する
     */
    public void setTrnsTypCdGreaterThanEqual(String trnsTypCdGreaterThanEqual) {
        this.trnsTypCdGreaterThanEqual = trnsTypCdGreaterThanEqual;
    }

    /**
     * trnsTypCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsTypCdLessThan
     */
    public String getTrnsTypCdLessThan() {
        return trnsTypCdLessThan;
    }

    /**
     * trnsTypCdLessThan のセッターメソッドです。
     * 
     * @param trnsTypCdLessThan trnsTypCdLessThan に設定する
     */
    public void setTrnsTypCdLessThan(String trnsTypCdLessThan) {
        this.trnsTypCdLessThan = trnsTypCdLessThan;
    }

    /**
     * trnsTypCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsTypCdLessThanEqual
     */
    public String getTrnsTypCdLessThanEqual() {
        return trnsTypCdLessThanEqual;
    }

    /**
     * trnsTypCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsTypCdLessThanEqual trnsTypCdLessThanEqual に設定する
     */
    public void setTrnsTypCdLessThanEqual(String trnsTypCdLessThanEqual) {
        this.trnsTypCdLessThanEqual = trnsTypCdLessThanEqual;
    }

    /**
     * trnsTypCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsTypCdLikeFront
     */
    public String getTrnsTypCdLikeFront() {
        return trnsTypCdLikeFront;
    }

    /**
     * trnsTypCdLikeFront のセッターメソッドです。
     * 
     * @param trnsTypCdLikeFront trnsTypCdLikeFront に設定する
     */
    public void setTrnsTypCdLikeFront(String trnsTypCdLikeFront) {
        this.trnsTypCdLikeFront = trnsTypCdLikeFront;
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

}

