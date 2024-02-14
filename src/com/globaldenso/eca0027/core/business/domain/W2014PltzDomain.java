/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds information of Palletize. 
 * <br />パレタイズを保持するドメインクラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9618 $
 */
public class W2014PltzDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MAIN MARK(CML NO)
     * <br />メインマーク（CML No)
     */
    private String mainMark;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */ 
    private String trnsCd;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;

    /**
     * WEIGHT UNIT DISPLAY
     * <br />重量単位表記
     */
    private String weightUnitDisplay;
    
    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private BigDecimal netWeight;
    
    /**
     * GROSS WEIGHT
     * <br />グロス重量
     */
    private BigDecimal grossWeight;
    
    /**
     * PALLETIZE STATUS
     * <br />パレタイズステータスコード
     */
    private String pltzStatus;
    
    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * DENGER ITEM FLAG
     * <br />危険品フラグ
     */
    private String dngrItemFlg;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /**
     * LAST TR STATUS
     * 最終搬出入ステータス
     */
    private String lastTrStatus;
    
    /**
     * DISABLED Flg
     * <br />利用不可フラグ
     */
    private String disabledFlg;
    
    /**
     * AUTHORITY Flg
     * <br />権限
     */
    private String auth;
    
    /** 
     * RT TYPE
     * <br />再使用区分
     */
    private String rtTyp;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2014PltzDomain() {
    }
    
    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    
    /**
     * Getter method for weightUnitDisplay.
     *
     * @return the weightUnitDisplay
     */
    public String getWeightUnitDisplay() {
        return weightUnitDisplay;
    }

    /**
     * Setter method for weightUnitDisplay.
     *
     * @param weightUnitDisplay Set for weightUnitDisplay
     */
    public void setWeightUnitDisplay(String weightUnitDisplay) {
        this.weightUnitDisplay = weightUnitDisplay;
    }
    
    /**
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for pltzStatus.
     *
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * Setter method for pltzStatus.
     *
     * @param pltzStatus Set for pltzStatus
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for lastTrStatus.
     *
     * @return the lastTrStatus
     */
    public String getLastTrStatus() {
        return lastTrStatus;
    }

    /**
     * Setter method for lastTrStatus.
     *
     * @param lastTrStatus Set for lastTrStatus
     */
    public void setLastTrStatus(String lastTrStatus) {
        this.lastTrStatus = lastTrStatus;
    }

    /**
     * Getter method for disabledFlg.
     *
     * @return the disabledFlg
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * Setter method for disabledFlg.
     *
     * @param disabledFlg Set for disabledFlg
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    /**
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for auth.
     *
     * @return the auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * Setter method for auth.
     *
     * @param auth Set for auth
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }
    
    /**
     * Getter method for rtTyp.
     *
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * Setter method for rtTyp.
     *
     * @param rtTyp Set for rtTyp
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }
}
