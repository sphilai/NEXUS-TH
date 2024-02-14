/*
 * PROJECT：eca0027
 * 
 * VmUserInfo の検索条件Domainクラス
 * テーブル概要：VM_USER_INFO
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmUserInfo の検索条件Domainクラスです。<BR>
 * テーブル概要：VM_USER_INFO<BR>
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
public class VmUserInfoCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * USR_NM_EN
     */
    private String usrNmEn;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * USER_LNG_CD
     */
    private String userLngCd;

    /**
     * TIMEZONE_ID
     */
    private String timezoneId;

    /**
     * CHAR_CD
     */
    private String charCd;

    /**
     * CNTRY_CD
     */
    private String cntryCd;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * LENGTH_UNIT
     */
    private String lengthUnit;

    /**
     * VOLUME_UNIT
     */
    private String volumeUnit;

    /**
     * BHT_SHIPPING_FIRM_TYP
     */
    private String bhtShippingFirmTyp;

    /**
     * WEIGHT_UNIT_DISP
     */
    private String weightUnitDisp;

    /**
     * LENGTH_UNIT_DISP
     */
    private String lengthUnitDisp;

    /**
     * VOLUME_UNIT_DISP
     */
    private String volumeUnitDisp;

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
     * USR_NM_EN（大なり）
     */
    private String usrNmEnGreaterThan;

    /**
     * USR_NM_EN（大なりイコール）
     */
    private String usrNmEnGreaterThanEqual;

    /**
     * USR_NM_EN（小なり）
     */
    private String usrNmEnLessThan;

    /**
     * USR_NM_EN（小なりイコール）
     */
    private String usrNmEnLessThanEqual;

    /**
     * USR_NM_EN（前方一致）
     */
    private String usrNmEnLikeFront;

    /**
     * COMP_CD（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMP_CD（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMP_CD（小なり）
     */
    private String compCdLessThan;

    /**
     * COMP_CD（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMP_CD（前方一致）
     */
    private String compCdLikeFront;

    /**
     * USER_LNG_CD（大なり）
     */
    private String userLngCdGreaterThan;

    /**
     * USER_LNG_CD（大なりイコール）
     */
    private String userLngCdGreaterThanEqual;

    /**
     * USER_LNG_CD（小なり）
     */
    private String userLngCdLessThan;

    /**
     * USER_LNG_CD（小なりイコール）
     */
    private String userLngCdLessThanEqual;

    /**
     * USER_LNG_CD（前方一致）
     */
    private String userLngCdLikeFront;

    /**
     * TIMEZONE_ID（大なり）
     */
    private String timezoneIdGreaterThan;

    /**
     * TIMEZONE_ID（大なりイコール）
     */
    private String timezoneIdGreaterThanEqual;

    /**
     * TIMEZONE_ID（小なり）
     */
    private String timezoneIdLessThan;

    /**
     * TIMEZONE_ID（小なりイコール）
     */
    private String timezoneIdLessThanEqual;

    /**
     * TIMEZONE_ID（前方一致）
     */
    private String timezoneIdLikeFront;

    /**
     * CHAR_CD（大なり）
     */
    private String charCdGreaterThan;

    /**
     * CHAR_CD（大なりイコール）
     */
    private String charCdGreaterThanEqual;

    /**
     * CHAR_CD（小なり）
     */
    private String charCdLessThan;

    /**
     * CHAR_CD（小なりイコール）
     */
    private String charCdLessThanEqual;

    /**
     * CHAR_CD（前方一致）
     */
    private String charCdLikeFront;

    /**
     * CNTRY_CD（大なり）
     */
    private String cntryCdGreaterThan;

    /**
     * CNTRY_CD（大なりイコール）
     */
    private String cntryCdGreaterThanEqual;

    /**
     * CNTRY_CD（小なり）
     */
    private String cntryCdLessThan;

    /**
     * CNTRY_CD（小なりイコール）
     */
    private String cntryCdLessThanEqual;

    /**
     * CNTRY_CD（前方一致）
     */
    private String cntryCdLikeFront;

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
     * LENGTH_UNIT（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH_UNIT（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH_UNIT（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH_UNIT（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH_UNIT（前方一致）
     */
    private String lengthUnitLikeFront;

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
     * BHT_SHIPPING_FIRM_TYP（大なり）
     */
    private String bhtShippingFirmTypGreaterThan;

    /**
     * BHT_SHIPPING_FIRM_TYP（大なりイコール）
     */
    private String bhtShippingFirmTypGreaterThanEqual;

    /**
     * BHT_SHIPPING_FIRM_TYP（小なり）
     */
    private String bhtShippingFirmTypLessThan;

    /**
     * BHT_SHIPPING_FIRM_TYP（小なりイコール）
     */
    private String bhtShippingFirmTypLessThanEqual;

    /**
     * BHT_SHIPPING_FIRM_TYP（前方一致）
     */
    private String bhtShippingFirmTypLikeFront;

    /**
     * WEIGHT_UNIT_DISP（大なり）
     */
    private String weightUnitDispGreaterThan;

    /**
     * WEIGHT_UNIT_DISP（大なりイコール）
     */
    private String weightUnitDispGreaterThanEqual;

    /**
     * WEIGHT_UNIT_DISP（小なり）
     */
    private String weightUnitDispLessThan;

    /**
     * WEIGHT_UNIT_DISP（小なりイコール）
     */
    private String weightUnitDispLessThanEqual;

    /**
     * WEIGHT_UNIT_DISP（前方一致）
     */
    private String weightUnitDispLikeFront;

    /**
     * LENGTH_UNIT_DISP（大なり）
     */
    private String lengthUnitDispGreaterThan;

    /**
     * LENGTH_UNIT_DISP（大なりイコール）
     */
    private String lengthUnitDispGreaterThanEqual;

    /**
     * LENGTH_UNIT_DISP（小なり）
     */
    private String lengthUnitDispLessThan;

    /**
     * LENGTH_UNIT_DISP（小なりイコール）
     */
    private String lengthUnitDispLessThanEqual;

    /**
     * LENGTH_UNIT_DISP（前方一致）
     */
    private String lengthUnitDispLikeFront;

    /**
     * VOLUME_UNIT_DISP（大なり）
     */
    private String volumeUnitDispGreaterThan;

    /**
     * VOLUME_UNIT_DISP（大なりイコール）
     */
    private String volumeUnitDispGreaterThanEqual;

    /**
     * VOLUME_UNIT_DISP（小なり）
     */
    private String volumeUnitDispLessThan;

    /**
     * VOLUME_UNIT_DISP（小なりイコール）
     */
    private String volumeUnitDispLessThanEqual;

    /**
     * VOLUME_UNIT_DISP（前方一致）
     */
    private String volumeUnitDispLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VmUserInfoCriteriaDomain() {
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
     * usrNmEn のゲッターメソッドです。
     * 
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * usrNmEn のセッターメソッドです。
     * 
     * @param usrNmEn usrNmEn に設定する
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * userLngCd のゲッターメソッドです。
     * 
     * @return the userLngCd
     */
    public String getUserLngCd() {
        return userLngCd;
    }

    /**
     * userLngCd のセッターメソッドです。
     * 
     * @param userLngCd userLngCd に設定する
     */
    public void setUserLngCd(String userLngCd) {
        this.userLngCd = userLngCd;
    }

    /**
     * timezoneId のゲッターメソッドです。
     * 
     * @return the timezoneId
     */
    public String getTimezoneId() {
        return timezoneId;
    }

    /**
     * timezoneId のセッターメソッドです。
     * 
     * @param timezoneId timezoneId に設定する
     */
    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    /**
     * charCd のゲッターメソッドです。
     * 
     * @return the charCd
     */
    public String getCharCd() {
        return charCd;
    }

    /**
     * charCd のセッターメソッドです。
     * 
     * @param charCd charCd に設定する
     */
    public void setCharCd(String charCd) {
        this.charCd = charCd;
    }

    /**
     * cntryCd のゲッターメソッドです。
     * 
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * cntryCd のセッターメソッドです。
     * 
     * @param cntryCd cntryCd に設定する
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
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
     * lengthUnit のゲッターメソッドです。
     * 
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * lengthUnit のセッターメソッドです。
     * 
     * @param lengthUnit lengthUnit に設定する
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
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
     * bhtShippingFirmTyp のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTyp
     */
    public String getBhtShippingFirmTyp() {
        return bhtShippingFirmTyp;
    }

    /**
     * bhtShippingFirmTyp のセッターメソッドです。
     * 
     * @param bhtShippingFirmTyp bhtShippingFirmTyp に設定する
     */
    public void setBhtShippingFirmTyp(String bhtShippingFirmTyp) {
        this.bhtShippingFirmTyp = bhtShippingFirmTyp;
    }

    /**
     * weightUnitDisp のゲッターメソッドです。
     * 
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * weightUnitDisp のセッターメソッドです。
     * 
     * @param weightUnitDisp weightUnitDisp に設定する
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

    /**
     * lengthUnitDisp のゲッターメソッドです。
     * 
     * @return the lengthUnitDisp
     */
    public String getLengthUnitDisp() {
        return lengthUnitDisp;
    }

    /**
     * lengthUnitDisp のセッターメソッドです。
     * 
     * @param lengthUnitDisp lengthUnitDisp に設定する
     */
    public void setLengthUnitDisp(String lengthUnitDisp) {
        this.lengthUnitDisp = lengthUnitDisp;
    }

    /**
     * volumeUnitDisp のゲッターメソッドです。
     * 
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * volumeUnitDisp のセッターメソッドです。
     * 
     * @param volumeUnitDisp volumeUnitDisp に設定する
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
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
     * usrNmEnGreaterThan のゲッターメソッドです。
     * 
     * @return the usrNmEnGreaterThan
     */
    public String getUsrNmEnGreaterThan() {
        return usrNmEnGreaterThan;
    }

    /**
     * usrNmEnGreaterThan のセッターメソッドです。
     * 
     * @param usrNmEnGreaterThan usrNmEnGreaterThan に設定する
     */
    public void setUsrNmEnGreaterThan(String usrNmEnGreaterThan) {
        this.usrNmEnGreaterThan = usrNmEnGreaterThan;
    }

    /**
     * usrNmEnGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the usrNmEnGreaterThanEqual
     */
    public String getUsrNmEnGreaterThanEqual() {
        return usrNmEnGreaterThanEqual;
    }

    /**
     * usrNmEnGreaterThanEqual のセッターメソッドです。
     * 
     * @param usrNmEnGreaterThanEqual usrNmEnGreaterThanEqual に設定する
     */
    public void setUsrNmEnGreaterThanEqual(String usrNmEnGreaterThanEqual) {
        this.usrNmEnGreaterThanEqual = usrNmEnGreaterThanEqual;
    }

    /**
     * usrNmEnLessThan のゲッターメソッドです。
     * 
     * @return the usrNmEnLessThan
     */
    public String getUsrNmEnLessThan() {
        return usrNmEnLessThan;
    }

    /**
     * usrNmEnLessThan のセッターメソッドです。
     * 
     * @param usrNmEnLessThan usrNmEnLessThan に設定する
     */
    public void setUsrNmEnLessThan(String usrNmEnLessThan) {
        this.usrNmEnLessThan = usrNmEnLessThan;
    }

    /**
     * usrNmEnLessThanEqual のゲッターメソッドです。
     * 
     * @return the usrNmEnLessThanEqual
     */
    public String getUsrNmEnLessThanEqual() {
        return usrNmEnLessThanEqual;
    }

    /**
     * usrNmEnLessThanEqual のセッターメソッドです。
     * 
     * @param usrNmEnLessThanEqual usrNmEnLessThanEqual に設定する
     */
    public void setUsrNmEnLessThanEqual(String usrNmEnLessThanEqual) {
        this.usrNmEnLessThanEqual = usrNmEnLessThanEqual;
    }

    /**
     * usrNmEnLikeFront のゲッターメソッドです。
     * 
     * @return the usrNmEnLikeFront
     */
    public String getUsrNmEnLikeFront() {
        return usrNmEnLikeFront;
    }

    /**
     * usrNmEnLikeFront のセッターメソッドです。
     * 
     * @param usrNmEnLikeFront usrNmEnLikeFront に設定する
     */
    public void setUsrNmEnLikeFront(String usrNmEnLikeFront) {
        this.usrNmEnLikeFront = usrNmEnLikeFront;
    }

    /**
     * compCdGreaterThan のゲッターメソッドです。
     * 
     * @return the compCdGreaterThan
     */
    public String getCompCdGreaterThan() {
        return compCdGreaterThan;
    }

    /**
     * compCdGreaterThan のセッターメソッドです。
     * 
     * @param compCdGreaterThan compCdGreaterThan に設定する
     */
    public void setCompCdGreaterThan(String compCdGreaterThan) {
        this.compCdGreaterThan = compCdGreaterThan;
    }

    /**
     * compCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compCdGreaterThanEqual
     */
    public String getCompCdGreaterThanEqual() {
        return compCdGreaterThanEqual;
    }

    /**
     * compCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param compCdGreaterThanEqual compCdGreaterThanEqual に設定する
     */
    public void setCompCdGreaterThanEqual(String compCdGreaterThanEqual) {
        this.compCdGreaterThanEqual = compCdGreaterThanEqual;
    }

    /**
     * compCdLessThan のゲッターメソッドです。
     * 
     * @return the compCdLessThan
     */
    public String getCompCdLessThan() {
        return compCdLessThan;
    }

    /**
     * compCdLessThan のセッターメソッドです。
     * 
     * @param compCdLessThan compCdLessThan に設定する
     */
    public void setCompCdLessThan(String compCdLessThan) {
        this.compCdLessThan = compCdLessThan;
    }

    /**
     * compCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the compCdLessThanEqual
     */
    public String getCompCdLessThanEqual() {
        return compCdLessThanEqual;
    }

    /**
     * compCdLessThanEqual のセッターメソッドです。
     * 
     * @param compCdLessThanEqual compCdLessThanEqual に設定する
     */
    public void setCompCdLessThanEqual(String compCdLessThanEqual) {
        this.compCdLessThanEqual = compCdLessThanEqual;
    }

    /**
     * compCdLikeFront のゲッターメソッドです。
     * 
     * @return the compCdLikeFront
     */
    public String getCompCdLikeFront() {
        return compCdLikeFront;
    }

    /**
     * compCdLikeFront のセッターメソッドです。
     * 
     * @param compCdLikeFront compCdLikeFront に設定する
     */
    public void setCompCdLikeFront(String compCdLikeFront) {
        this.compCdLikeFront = compCdLikeFront;
    }

    /**
     * userLngCdGreaterThan のゲッターメソッドです。
     * 
     * @return the userLngCdGreaterThan
     */
    public String getUserLngCdGreaterThan() {
        return userLngCdGreaterThan;
    }

    /**
     * userLngCdGreaterThan のセッターメソッドです。
     * 
     * @param userLngCdGreaterThan userLngCdGreaterThan に設定する
     */
    public void setUserLngCdGreaterThan(String userLngCdGreaterThan) {
        this.userLngCdGreaterThan = userLngCdGreaterThan;
    }

    /**
     * userLngCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the userLngCdGreaterThanEqual
     */
    public String getUserLngCdGreaterThanEqual() {
        return userLngCdGreaterThanEqual;
    }

    /**
     * userLngCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param userLngCdGreaterThanEqual userLngCdGreaterThanEqual に設定する
     */
    public void setUserLngCdGreaterThanEqual(String userLngCdGreaterThanEqual) {
        this.userLngCdGreaterThanEqual = userLngCdGreaterThanEqual;
    }

    /**
     * userLngCdLessThan のゲッターメソッドです。
     * 
     * @return the userLngCdLessThan
     */
    public String getUserLngCdLessThan() {
        return userLngCdLessThan;
    }

    /**
     * userLngCdLessThan のセッターメソッドです。
     * 
     * @param userLngCdLessThan userLngCdLessThan に設定する
     */
    public void setUserLngCdLessThan(String userLngCdLessThan) {
        this.userLngCdLessThan = userLngCdLessThan;
    }

    /**
     * userLngCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the userLngCdLessThanEqual
     */
    public String getUserLngCdLessThanEqual() {
        return userLngCdLessThanEqual;
    }

    /**
     * userLngCdLessThanEqual のセッターメソッドです。
     * 
     * @param userLngCdLessThanEqual userLngCdLessThanEqual に設定する
     */
    public void setUserLngCdLessThanEqual(String userLngCdLessThanEqual) {
        this.userLngCdLessThanEqual = userLngCdLessThanEqual;
    }

    /**
     * userLngCdLikeFront のゲッターメソッドです。
     * 
     * @return the userLngCdLikeFront
     */
    public String getUserLngCdLikeFront() {
        return userLngCdLikeFront;
    }

    /**
     * userLngCdLikeFront のセッターメソッドです。
     * 
     * @param userLngCdLikeFront userLngCdLikeFront に設定する
     */
    public void setUserLngCdLikeFront(String userLngCdLikeFront) {
        this.userLngCdLikeFront = userLngCdLikeFront;
    }

    /**
     * timezoneIdGreaterThan のゲッターメソッドです。
     * 
     * @return the timezoneIdGreaterThan
     */
    public String getTimezoneIdGreaterThan() {
        return timezoneIdGreaterThan;
    }

    /**
     * timezoneIdGreaterThan のセッターメソッドです。
     * 
     * @param timezoneIdGreaterThan timezoneIdGreaterThan に設定する
     */
    public void setTimezoneIdGreaterThan(String timezoneIdGreaterThan) {
        this.timezoneIdGreaterThan = timezoneIdGreaterThan;
    }

    /**
     * timezoneIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the timezoneIdGreaterThanEqual
     */
    public String getTimezoneIdGreaterThanEqual() {
        return timezoneIdGreaterThanEqual;
    }

    /**
     * timezoneIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param timezoneIdGreaterThanEqual timezoneIdGreaterThanEqual に設定する
     */
    public void setTimezoneIdGreaterThanEqual(String timezoneIdGreaterThanEqual) {
        this.timezoneIdGreaterThanEqual = timezoneIdGreaterThanEqual;
    }

    /**
     * timezoneIdLessThan のゲッターメソッドです。
     * 
     * @return the timezoneIdLessThan
     */
    public String getTimezoneIdLessThan() {
        return timezoneIdLessThan;
    }

    /**
     * timezoneIdLessThan のセッターメソッドです。
     * 
     * @param timezoneIdLessThan timezoneIdLessThan に設定する
     */
    public void setTimezoneIdLessThan(String timezoneIdLessThan) {
        this.timezoneIdLessThan = timezoneIdLessThan;
    }

    /**
     * timezoneIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the timezoneIdLessThanEqual
     */
    public String getTimezoneIdLessThanEqual() {
        return timezoneIdLessThanEqual;
    }

    /**
     * timezoneIdLessThanEqual のセッターメソッドです。
     * 
     * @param timezoneIdLessThanEqual timezoneIdLessThanEqual に設定する
     */
    public void setTimezoneIdLessThanEqual(String timezoneIdLessThanEqual) {
        this.timezoneIdLessThanEqual = timezoneIdLessThanEqual;
    }

    /**
     * timezoneIdLikeFront のゲッターメソッドです。
     * 
     * @return the timezoneIdLikeFront
     */
    public String getTimezoneIdLikeFront() {
        return timezoneIdLikeFront;
    }

    /**
     * timezoneIdLikeFront のセッターメソッドです。
     * 
     * @param timezoneIdLikeFront timezoneIdLikeFront に設定する
     */
    public void setTimezoneIdLikeFront(String timezoneIdLikeFront) {
        this.timezoneIdLikeFront = timezoneIdLikeFront;
    }

    /**
     * charCdGreaterThan のゲッターメソッドです。
     * 
     * @return the charCdGreaterThan
     */
    public String getCharCdGreaterThan() {
        return charCdGreaterThan;
    }

    /**
     * charCdGreaterThan のセッターメソッドです。
     * 
     * @param charCdGreaterThan charCdGreaterThan に設定する
     */
    public void setCharCdGreaterThan(String charCdGreaterThan) {
        this.charCdGreaterThan = charCdGreaterThan;
    }

    /**
     * charCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the charCdGreaterThanEqual
     */
    public String getCharCdGreaterThanEqual() {
        return charCdGreaterThanEqual;
    }

    /**
     * charCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param charCdGreaterThanEqual charCdGreaterThanEqual に設定する
     */
    public void setCharCdGreaterThanEqual(String charCdGreaterThanEqual) {
        this.charCdGreaterThanEqual = charCdGreaterThanEqual;
    }

    /**
     * charCdLessThan のゲッターメソッドです。
     * 
     * @return the charCdLessThan
     */
    public String getCharCdLessThan() {
        return charCdLessThan;
    }

    /**
     * charCdLessThan のセッターメソッドです。
     * 
     * @param charCdLessThan charCdLessThan に設定する
     */
    public void setCharCdLessThan(String charCdLessThan) {
        this.charCdLessThan = charCdLessThan;
    }

    /**
     * charCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the charCdLessThanEqual
     */
    public String getCharCdLessThanEqual() {
        return charCdLessThanEqual;
    }

    /**
     * charCdLessThanEqual のセッターメソッドです。
     * 
     * @param charCdLessThanEqual charCdLessThanEqual に設定する
     */
    public void setCharCdLessThanEqual(String charCdLessThanEqual) {
        this.charCdLessThanEqual = charCdLessThanEqual;
    }

    /**
     * charCdLikeFront のゲッターメソッドです。
     * 
     * @return the charCdLikeFront
     */
    public String getCharCdLikeFront() {
        return charCdLikeFront;
    }

    /**
     * charCdLikeFront のセッターメソッドです。
     * 
     * @param charCdLikeFront charCdLikeFront に設定する
     */
    public void setCharCdLikeFront(String charCdLikeFront) {
        this.charCdLikeFront = charCdLikeFront;
    }

    /**
     * cntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThan
     */
    public String getCntryCdGreaterThan() {
        return cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThan のセッターメソッドです。
     * 
     * @param cntryCdGreaterThan cntryCdGreaterThan に設定する
     */
    public void setCntryCdGreaterThan(String cntryCdGreaterThan) {
        this.cntryCdGreaterThan = cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThanEqual
     */
    public String getCntryCdGreaterThanEqual() {
        return cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param cntryCdGreaterThanEqual cntryCdGreaterThanEqual に設定する
     */
    public void setCntryCdGreaterThanEqual(String cntryCdGreaterThanEqual) {
        this.cntryCdGreaterThanEqual = cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdLessThan のゲッターメソッドです。
     * 
     * @return the cntryCdLessThan
     */
    public String getCntryCdLessThan() {
        return cntryCdLessThan;
    }

    /**
     * cntryCdLessThan のセッターメソッドです。
     * 
     * @param cntryCdLessThan cntryCdLessThan に設定する
     */
    public void setCntryCdLessThan(String cntryCdLessThan) {
        this.cntryCdLessThan = cntryCdLessThan;
    }

    /**
     * cntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdLessThanEqual
     */
    public String getCntryCdLessThanEqual() {
        return cntryCdLessThanEqual;
    }

    /**
     * cntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param cntryCdLessThanEqual cntryCdLessThanEqual に設定する
     */
    public void setCntryCdLessThanEqual(String cntryCdLessThanEqual) {
        this.cntryCdLessThanEqual = cntryCdLessThanEqual;
    }

    /**
     * cntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the cntryCdLikeFront
     */
    public String getCntryCdLikeFront() {
        return cntryCdLikeFront;
    }

    /**
     * cntryCdLikeFront のセッターメソッドです。
     * 
     * @param cntryCdLikeFront cntryCdLikeFront に設定する
     */
    public void setCntryCdLikeFront(String cntryCdLikeFront) {
        this.cntryCdLikeFront = cntryCdLikeFront;
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
     * lengthUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThan
     */
    public String getLengthUnitGreaterThan() {
        return lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThan のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThan lengthUnitGreaterThan に設定する
     */
    public void setLengthUnitGreaterThan(String lengthUnitGreaterThan) {
        this.lengthUnitGreaterThan = lengthUnitGreaterThan;
    }

    /**
     * lengthUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitGreaterThanEqual
     */
    public String getLengthUnitGreaterThanEqual() {
        return lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitGreaterThanEqual lengthUnitGreaterThanEqual に設定する
     */
    public void setLengthUnitGreaterThanEqual(String lengthUnitGreaterThanEqual) {
        this.lengthUnitGreaterThanEqual = lengthUnitGreaterThanEqual;
    }

    /**
     * lengthUnitLessThan のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThan
     */
    public String getLengthUnitLessThan() {
        return lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThan のセッターメソッドです。
     * 
     * @param lengthUnitLessThan lengthUnitLessThan に設定する
     */
    public void setLengthUnitLessThan(String lengthUnitLessThan) {
        this.lengthUnitLessThan = lengthUnitLessThan;
    }

    /**
     * lengthUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitLessThanEqual
     */
    public String getLengthUnitLessThanEqual() {
        return lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLessThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitLessThanEqual lengthUnitLessThanEqual に設定する
     */
    public void setLengthUnitLessThanEqual(String lengthUnitLessThanEqual) {
        this.lengthUnitLessThanEqual = lengthUnitLessThanEqual;
    }

    /**
     * lengthUnitLikeFront のゲッターメソッドです。
     * 
     * @return the lengthUnitLikeFront
     */
    public String getLengthUnitLikeFront() {
        return lengthUnitLikeFront;
    }

    /**
     * lengthUnitLikeFront のセッターメソッドです。
     * 
     * @param lengthUnitLikeFront lengthUnitLikeFront に設定する
     */
    public void setLengthUnitLikeFront(String lengthUnitLikeFront) {
        this.lengthUnitLikeFront = lengthUnitLikeFront;
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
     * bhtShippingFirmTypGreaterThan のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTypGreaterThan
     */
    public String getBhtShippingFirmTypGreaterThan() {
        return bhtShippingFirmTypGreaterThan;
    }

    /**
     * bhtShippingFirmTypGreaterThan のセッターメソッドです。
     * 
     * @param bhtShippingFirmTypGreaterThan bhtShippingFirmTypGreaterThan に設定する
     */
    public void setBhtShippingFirmTypGreaterThan(String bhtShippingFirmTypGreaterThan) {
        this.bhtShippingFirmTypGreaterThan = bhtShippingFirmTypGreaterThan;
    }

    /**
     * bhtShippingFirmTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTypGreaterThanEqual
     */
    public String getBhtShippingFirmTypGreaterThanEqual() {
        return bhtShippingFirmTypGreaterThanEqual;
    }

    /**
     * bhtShippingFirmTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param bhtShippingFirmTypGreaterThanEqual bhtShippingFirmTypGreaterThanEqual に設定する
     */
    public void setBhtShippingFirmTypGreaterThanEqual(String bhtShippingFirmTypGreaterThanEqual) {
        this.bhtShippingFirmTypGreaterThanEqual = bhtShippingFirmTypGreaterThanEqual;
    }

    /**
     * bhtShippingFirmTypLessThan のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTypLessThan
     */
    public String getBhtShippingFirmTypLessThan() {
        return bhtShippingFirmTypLessThan;
    }

    /**
     * bhtShippingFirmTypLessThan のセッターメソッドです。
     * 
     * @param bhtShippingFirmTypLessThan bhtShippingFirmTypLessThan に設定する
     */
    public void setBhtShippingFirmTypLessThan(String bhtShippingFirmTypLessThan) {
        this.bhtShippingFirmTypLessThan = bhtShippingFirmTypLessThan;
    }

    /**
     * bhtShippingFirmTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTypLessThanEqual
     */
    public String getBhtShippingFirmTypLessThanEqual() {
        return bhtShippingFirmTypLessThanEqual;
    }

    /**
     * bhtShippingFirmTypLessThanEqual のセッターメソッドです。
     * 
     * @param bhtShippingFirmTypLessThanEqual bhtShippingFirmTypLessThanEqual に設定する
     */
    public void setBhtShippingFirmTypLessThanEqual(String bhtShippingFirmTypLessThanEqual) {
        this.bhtShippingFirmTypLessThanEqual = bhtShippingFirmTypLessThanEqual;
    }

    /**
     * bhtShippingFirmTypLikeFront のゲッターメソッドです。
     * 
     * @return the bhtShippingFirmTypLikeFront
     */
    public String getBhtShippingFirmTypLikeFront() {
        return bhtShippingFirmTypLikeFront;
    }

    /**
     * bhtShippingFirmTypLikeFront のセッターメソッドです。
     * 
     * @param bhtShippingFirmTypLikeFront bhtShippingFirmTypLikeFront に設定する
     */
    public void setBhtShippingFirmTypLikeFront(String bhtShippingFirmTypLikeFront) {
        this.bhtShippingFirmTypLikeFront = bhtShippingFirmTypLikeFront;
    }

    /**
     * weightUnitDispGreaterThan のゲッターメソッドです。
     * 
     * @return the weightUnitDispGreaterThan
     */
    public String getWeightUnitDispGreaterThan() {
        return weightUnitDispGreaterThan;
    }

    /**
     * weightUnitDispGreaterThan のセッターメソッドです。
     * 
     * @param weightUnitDispGreaterThan weightUnitDispGreaterThan に設定する
     */
    public void setWeightUnitDispGreaterThan(String weightUnitDispGreaterThan) {
        this.weightUnitDispGreaterThan = weightUnitDispGreaterThan;
    }

    /**
     * weightUnitDispGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitDispGreaterThanEqual
     */
    public String getWeightUnitDispGreaterThanEqual() {
        return weightUnitDispGreaterThanEqual;
    }

    /**
     * weightUnitDispGreaterThanEqual のセッターメソッドです。
     * 
     * @param weightUnitDispGreaterThanEqual weightUnitDispGreaterThanEqual に設定する
     */
    public void setWeightUnitDispGreaterThanEqual(String weightUnitDispGreaterThanEqual) {
        this.weightUnitDispGreaterThanEqual = weightUnitDispGreaterThanEqual;
    }

    /**
     * weightUnitDispLessThan のゲッターメソッドです。
     * 
     * @return the weightUnitDispLessThan
     */
    public String getWeightUnitDispLessThan() {
        return weightUnitDispLessThan;
    }

    /**
     * weightUnitDispLessThan のセッターメソッドです。
     * 
     * @param weightUnitDispLessThan weightUnitDispLessThan に設定する
     */
    public void setWeightUnitDispLessThan(String weightUnitDispLessThan) {
        this.weightUnitDispLessThan = weightUnitDispLessThan;
    }

    /**
     * weightUnitDispLessThanEqual のゲッターメソッドです。
     * 
     * @return the weightUnitDispLessThanEqual
     */
    public String getWeightUnitDispLessThanEqual() {
        return weightUnitDispLessThanEqual;
    }

    /**
     * weightUnitDispLessThanEqual のセッターメソッドです。
     * 
     * @param weightUnitDispLessThanEqual weightUnitDispLessThanEqual に設定する
     */
    public void setWeightUnitDispLessThanEqual(String weightUnitDispLessThanEqual) {
        this.weightUnitDispLessThanEqual = weightUnitDispLessThanEqual;
    }

    /**
     * weightUnitDispLikeFront のゲッターメソッドです。
     * 
     * @return the weightUnitDispLikeFront
     */
    public String getWeightUnitDispLikeFront() {
        return weightUnitDispLikeFront;
    }

    /**
     * weightUnitDispLikeFront のセッターメソッドです。
     * 
     * @param weightUnitDispLikeFront weightUnitDispLikeFront に設定する
     */
    public void setWeightUnitDispLikeFront(String weightUnitDispLikeFront) {
        this.weightUnitDispLikeFront = weightUnitDispLikeFront;
    }

    /**
     * lengthUnitDispGreaterThan のゲッターメソッドです。
     * 
     * @return the lengthUnitDispGreaterThan
     */
    public String getLengthUnitDispGreaterThan() {
        return lengthUnitDispGreaterThan;
    }

    /**
     * lengthUnitDispGreaterThan のセッターメソッドです。
     * 
     * @param lengthUnitDispGreaterThan lengthUnitDispGreaterThan に設定する
     */
    public void setLengthUnitDispGreaterThan(String lengthUnitDispGreaterThan) {
        this.lengthUnitDispGreaterThan = lengthUnitDispGreaterThan;
    }

    /**
     * lengthUnitDispGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitDispGreaterThanEqual
     */
    public String getLengthUnitDispGreaterThanEqual() {
        return lengthUnitDispGreaterThanEqual;
    }

    /**
     * lengthUnitDispGreaterThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitDispGreaterThanEqual lengthUnitDispGreaterThanEqual に設定する
     */
    public void setLengthUnitDispGreaterThanEqual(String lengthUnitDispGreaterThanEqual) {
        this.lengthUnitDispGreaterThanEqual = lengthUnitDispGreaterThanEqual;
    }

    /**
     * lengthUnitDispLessThan のゲッターメソッドです。
     * 
     * @return the lengthUnitDispLessThan
     */
    public String getLengthUnitDispLessThan() {
        return lengthUnitDispLessThan;
    }

    /**
     * lengthUnitDispLessThan のセッターメソッドです。
     * 
     * @param lengthUnitDispLessThan lengthUnitDispLessThan に設定する
     */
    public void setLengthUnitDispLessThan(String lengthUnitDispLessThan) {
        this.lengthUnitDispLessThan = lengthUnitDispLessThan;
    }

    /**
     * lengthUnitDispLessThanEqual のゲッターメソッドです。
     * 
     * @return the lengthUnitDispLessThanEqual
     */
    public String getLengthUnitDispLessThanEqual() {
        return lengthUnitDispLessThanEqual;
    }

    /**
     * lengthUnitDispLessThanEqual のセッターメソッドです。
     * 
     * @param lengthUnitDispLessThanEqual lengthUnitDispLessThanEqual に設定する
     */
    public void setLengthUnitDispLessThanEqual(String lengthUnitDispLessThanEqual) {
        this.lengthUnitDispLessThanEqual = lengthUnitDispLessThanEqual;
    }

    /**
     * lengthUnitDispLikeFront のゲッターメソッドです。
     * 
     * @return the lengthUnitDispLikeFront
     */
    public String getLengthUnitDispLikeFront() {
        return lengthUnitDispLikeFront;
    }

    /**
     * lengthUnitDispLikeFront のセッターメソッドです。
     * 
     * @param lengthUnitDispLikeFront lengthUnitDispLikeFront に設定する
     */
    public void setLengthUnitDispLikeFront(String lengthUnitDispLikeFront) {
        this.lengthUnitDispLikeFront = lengthUnitDispLikeFront;
    }

    /**
     * volumeUnitDispGreaterThan のゲッターメソッドです。
     * 
     * @return the volumeUnitDispGreaterThan
     */
    public String getVolumeUnitDispGreaterThan() {
        return volumeUnitDispGreaterThan;
    }

    /**
     * volumeUnitDispGreaterThan のセッターメソッドです。
     * 
     * @param volumeUnitDispGreaterThan volumeUnitDispGreaterThan に設定する
     */
    public void setVolumeUnitDispGreaterThan(String volumeUnitDispGreaterThan) {
        this.volumeUnitDispGreaterThan = volumeUnitDispGreaterThan;
    }

    /**
     * volumeUnitDispGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitDispGreaterThanEqual
     */
    public String getVolumeUnitDispGreaterThanEqual() {
        return volumeUnitDispGreaterThanEqual;
    }

    /**
     * volumeUnitDispGreaterThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitDispGreaterThanEqual volumeUnitDispGreaterThanEqual に設定する
     */
    public void setVolumeUnitDispGreaterThanEqual(String volumeUnitDispGreaterThanEqual) {
        this.volumeUnitDispGreaterThanEqual = volumeUnitDispGreaterThanEqual;
    }

    /**
     * volumeUnitDispLessThan のゲッターメソッドです。
     * 
     * @return the volumeUnitDispLessThan
     */
    public String getVolumeUnitDispLessThan() {
        return volumeUnitDispLessThan;
    }

    /**
     * volumeUnitDispLessThan のセッターメソッドです。
     * 
     * @param volumeUnitDispLessThan volumeUnitDispLessThan に設定する
     */
    public void setVolumeUnitDispLessThan(String volumeUnitDispLessThan) {
        this.volumeUnitDispLessThan = volumeUnitDispLessThan;
    }

    /**
     * volumeUnitDispLessThanEqual のゲッターメソッドです。
     * 
     * @return the volumeUnitDispLessThanEqual
     */
    public String getVolumeUnitDispLessThanEqual() {
        return volumeUnitDispLessThanEqual;
    }

    /**
     * volumeUnitDispLessThanEqual のセッターメソッドです。
     * 
     * @param volumeUnitDispLessThanEqual volumeUnitDispLessThanEqual に設定する
     */
    public void setVolumeUnitDispLessThanEqual(String volumeUnitDispLessThanEqual) {
        this.volumeUnitDispLessThanEqual = volumeUnitDispLessThanEqual;
    }

    /**
     * volumeUnitDispLikeFront のゲッターメソッドです。
     * 
     * @return the volumeUnitDispLikeFront
     */
    public String getVolumeUnitDispLikeFront() {
        return volumeUnitDispLikeFront;
    }

    /**
     * volumeUnitDispLikeFront のセッターメソッドです。
     * 
     * @param volumeUnitDispLikeFront volumeUnitDispLikeFront に設定する
     */
    public void setVolumeUnitDispLikeFront(String volumeUnitDispLikeFront) {
        this.volumeUnitDispLikeFront = volumeUnitDispLikeFront;
    }

}

