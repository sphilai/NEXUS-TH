/*
 * PROJECT：eca0027
 * 
 * VmUserInfo のDomainクラス
 * テーブル概要：VM_USER_INFO
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmUserInfo のDomainクラスです。<BR>
 * テーブル概要：VM_USER_INFO<BR>
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
public class VmUserInfoDomain extends AbstractDomain implements Serializable {

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
     * デフォルトコンストラクタ。
     */
    public VmUserInfoDomain() {
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

}
