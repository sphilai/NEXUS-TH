/*
 * PROJECT：eca0027
 * 
 * VtCompMeasureUnit のDomainクラス
 * テーブル概要：VT_COMP_MEASURE_UNIT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VtCompMeasureUnit のDomainクラスです。<BR>
 * テーブル概要：VT_COMP_MEASURE_UNIT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/20 19:22:34<BR>
 * 
 * テーブル定義から2014/03/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtCompMeasureUnitDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

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
    public VtCompMeasureUnitDomain() {
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
