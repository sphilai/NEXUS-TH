/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of CML Register Screen
 * <br />CML Register画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2012CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Changing agency screen
     * <br />遷移元画面
     */
    private String callScreenId;

    /**
     * MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;

    /**
     * PALLET NO
     * <br />パレットNO
     */
    private String palletNo;

    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;

    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;

    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;

    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;

    /**
     * CUR LEGACY WAREHOUSE CODE
     * <br />現在LEGACY倉庫コード
     */
    private String curLgcyWhCd;

    /**
     * PACKAGE FORM TYPE
     * <br />梱包形態区分
     */
    private String pkgFormTyp;

    /**
     * INVOICE KEY
     * <br />インボイスキー
     */
    private String invoiceKey;

    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * RT USE FLAG
     * <br />RT材使用フラグ
     */
    private String rtUseFlg;

    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;

    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private String netWeight;

    /**
     * GROSS WEIGHT
     * <br />グロス重量
     */
    private String grossWeight;

    /**
     * VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnit;

    /**
     * VOLUME
     * <br />容積
     */
    private String volume;

    /**
     * OUTER PACKAGE CODE
     * <br />外装コード
     */
    private String outerPkgCd;

    /**
     * EXPORT PACKING DATE
     * <br />輸出梱包日
     */
    private String expPackingDt;

    /**
     * EXPORT PACKING ISSUER NAME
     * <br />輸出梱包者名
     */
    private String expPackingIssuerNm;

    /**
     * STAGING INSTRUCTION ITEM FLAG
     * <br />荷揃指示品フラグ
     */
    private String stgInstrItemFlg;

    /**
     * PACKING WAREHOUSE COMPANY CODE
     * <br />梱包倉庫会社コード
     */
    private String packingWhCompCd;

    /**
     * PACKING WAREHOUSE CODE
     * <br />梱包倉庫コード
     */
    private String packingWhCd;

    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;

    /**
     * PACKAGING CONFIRMED FLG
     * <br />パッケージング確定フラグ
     */
    private String packagingConfirmedFlg;

    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;

    /**
     * IGMORE WARMINGS
     * <br />ワーニング無視
     */
    private String ignoreWarnings;

    /**
     * Ship to
     *   (taking over item  *2.3.9 from W2012 Register validate)
     * <br />送荷先 
     * (W2012 Register validateからの引継項目 ※2.3.9) 
     */
    private String wkPltzShipToCode;

    /**
     * Consignee
     *   (taking over item  *2.3.10 from W2012 Register validate)
     * <br />荷受人 
     * (W2012 Register validateからの引継項目 ※2.3.10) 
     */
    private String wkPltzConsigneeCd;

    /**
     * LENGTH(EXPORT PACKAGE)
     *   (taking over item  *2.3.11 from W2012 Register validate)
     * <br />縦(輸出荷姿) 
     * (W2012 Register validateからの引継項目 ※2.3.11) 
     */
    private String wkHeight;

    /**
     * WIDTH(EXPORT PACKAGE)
     *   (taking over item  *2.3.11 from W2012 Register validate)
     * <br />横(輸出荷姿) 
     * (W2012 Register validateからの引継項目 ※2.3.11) 
     */
    private String wkLength;

    /**
     * HEIGHT(EXPORT PACKAGE)
     *   (taking over item  *2.3.11 from W2012 Register validate)
     * <br />高さ(輸出荷姿) 
     * (W2012 Register validateからの引継項目 ※2.3.11) 
     */
    private String wkWidth;

    /**
     * VOLUME
     *   (taking over item  *2.3.11 from W2012 Register validate)
     * <br />容積  
     * (W2012 Register validateからの引継項目 ※2.3.11) 
     */
    private String wkVolume;

    /**
     * LENGTH UNIT
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />長さ単位 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkLengthUnit;

    /**
     * Unit of Vol.
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />容積単位 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkVolumeUnit;

    /**
     * LENGTH(PALLETIZE)
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />たて（パレタイズ） 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkHeightPalletize;

    /**
     * WIDTH (PALLETIZE)
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />よこ（パレタイズ） 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkLengthPalletize;

    /**
     * HEIGHT (PALLETIZE)
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />高さ（パレタイズ） 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkWidthPalletize;

    /**
     * VOLUME (PALLETIZE)
     *   (taking over item  *2.3.12 from W2012 Register validate)
     * <br />容積（パレタイズ） 
     * (W2012 Register validateからの引継項目 ※2.3.12) 
     */
    private String wkVolumePalletize;

    /**
     * The login user name acquired from DENSO CONTEXT
     * <br />DENSO CONTEXT から取得したログインユーザ名
     */
    private String usrNmEn;

    /**
     * Processing mode (for screen taking over)  
     * <br />処理モード (画面引継ぎ用)
     */
    private String functionMode;

    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;

    /**
     * Base VALUE of authority (with no 2:RALL, 1:BALL, and 0:ALL authority)  
     * <br />権限のベース値(2:RALL、1:BALL、0:ALL権限なし)
     */
    private String baseAuthFlg;

    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * Date format (for document outputs)  
     * <br />日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;

    /**
     * VOLUME overflow flag
     * <br />容積桁あふれフラグ
     */
    private boolean volumeOverflow;

    /**
     * NET WEIGHT overflow flag
     * <br />ネット重量桁あふれフラグ
     */
    private boolean netWeightOverflow;

    /**
     * GROSS WEIGHT overflow flag
     * <br />グロス重量桁あふれフラグ
     */
    private boolean grossWeightOverflow;

    // UT110 TRIAL SHIPMENT/号試品対応 ADD START
    /**
     * Manual registration flag
     * <br />マニュアル登録フラグ
     */
    private String manualRegFlg;
    
    /**
     * LENGTH
     * <br />縦
     */
    private String length;
    
    /**
     * WIDTH
     * <br />横
     */
    private String width;
    
    /**
     * HEIGHT
     * <br />高さ
     */
    private String height;
    
    /**
     * LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnit;
    // UT110 TRIAL SHIPMENT/号試品対応 ADD END
    
    /**
     * Pallet/Carton Type
     * <br />パレット・カートン区分
     * UT420 ADD
     */
    private String palletCartonTyp;
    
    /**
     * Pallet/Carton Type Name
     * <br />パレット・カートン区分名称
     * UT420 ADD
     */
    private String palletCartonTypName;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2012CriteriaDomain() {
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
     * Getter method for palletNo.
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
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
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
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
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for curLgcyWhCd.
     *
     * @return the curLgcyWhCd
     */
    public String getCurLgcyWhCd() {
        return curLgcyWhCd;
    }

    /**
     * Setter method for curLgcyWhCd.
     *
     * @param curLgcyWhCd Set for curLgcyWhCd
     */
    public void setCurLgcyWhCd(String curLgcyWhCd) {
        this.curLgcyWhCd = curLgcyWhCd;
    }

    /**
     * Getter method for pkgFormTyp.
     *
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * Setter method for pkgFormTyp.
     *
     * @param pkgFormTyp Set for pkgFormTyp
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for rtUseFlg.
     *
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }

    /**
     * Setter method for rtUseFlg.
     *
     * @param rtUseFlg Set for rtUseFlg
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
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
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for volume.
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Getter method for outerPkgCd.
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * Setter method for outerPkgCd.
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }

    /**
     * Getter method for expPackingDt.
     *
     * @return the expPackingDt
     */
    public String getExpPackingDt() {
        return expPackingDt;
    }

    /**
     * Setter method for expPackingDt.
     *
     * @param expPackingDt Set for expPackingDt
     */
    public void setExpPackingDt(String expPackingDt) {
        this.expPackingDt = expPackingDt;
    }

    /**
     * Getter method for expPackingIssuerNm.
     *
     * @return the expPackingIssuerNm
     */
    public String getExpPackingIssuerNm() {
        return expPackingIssuerNm;
    }

    /**
     * Setter method for expPackingIssuerNm.
     *
     * @param expPackingIssuerNm Set for expPackingIssuerNm
     */
    public void setExpPackingIssuerNm(String expPackingIssuerNm) {
        this.expPackingIssuerNm = expPackingIssuerNm;
    }

    /**
     * Getter method for stgInstrItemFlg.
     *
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * Setter method for stgInstrItemFlg.
     *
     * @param stgInstrItemFlg Set for stgInstrItemFlg
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * Getter method for packingWhCompCd.
     *
     * @return the packingWhCompCd
     */
    public String getPackingWhCompCd() {
        return packingWhCompCd;
    }

    /**
     * Setter method for packingWhCompCd.
     *
     * @param packingWhCompCd Set for packingWhCompCd
     */
    public void setPackingWhCompCd(String packingWhCompCd) {
        this.packingWhCompCd = packingWhCompCd;
    }

    /**
     * Getter method for packingWhCd.
     *
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * Setter method for packingWhCd.
     *
     * @param packingWhCd Set for packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
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
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for packagingConfirmedFlg.
     *
     * @return the packagingConfirmedFlg
     */
    public String getPackagingConfirmedFlg() {
        return packagingConfirmedFlg;
    }

    /**
     * Setter method for packagingConfirmedFlg.
     *
     * @param packagingConfirmedFlg Set for packagingConfirmedFlg
     */
    public void setPackagingConfirmedFlg(String packagingConfirmedFlg) {
        this.packagingConfirmedFlg = packagingConfirmedFlg;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for ignoreWarnings.
     *
     * @return the ignoreWarnings
     */
    public String getIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Setter method for ignoreWarnings.
     *
     * @param ignoreWarnings Set for ignoreWarnings
     */
    public void setIgnoreWarnings(String ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
    }

    /**
     * Getter method for wkPltzShipToCode.
     *
     * @return the wkPltzShipToCode
     */
    public String getWkPltzShipToCode() {
        return wkPltzShipToCode;
    }

    /**
     * Setter method for wkPltzShipToCode.
     *
     * @param wkPltzShipToCode Set for wkPltzShipToCode
     */
    public void setWkPltzShipToCode(String wkPltzShipToCode) {
        this.wkPltzShipToCode = wkPltzShipToCode;
    }

    /**
     * Getter method for wkPltzConsigneeCd.
     *
     * @return the wkPltzConsigneeCd
     */
    public String getWkPltzConsigneeCd() {
        return wkPltzConsigneeCd;
    }

    /**
     * Setter method for wkPltzConsigneeCd.
     *
     * @param wkPltzConsigneeCd Set for wkPltzConsigneeCd
     */
    public void setWkPltzConsigneeCd(String wkPltzConsigneeCd) {
        this.wkPltzConsigneeCd = wkPltzConsigneeCd;
    }

    /**
     * Getter method for wkHeight.
     *
     * @return the wkHeight
     */
    public String getWkHeight() {
        return wkHeight;
    }

    /**
     * Setter method for wkHeight.
     *
     * @param wkHeight Set for wkHeight
     */
    public void setWkHeight(String wkHeight) {
        this.wkHeight = wkHeight;
    }

    /**
     * Getter method for wkLength.
     *
     * @return the wkLength
     */
    public String getWkLength() {
        return wkLength;
    }

    /**
     * Setter method for wkLength.
     *
     * @param wkLength Set for wkLength
     */
    public void setWkLength(String wkLength) {
        this.wkLength = wkLength;
    }

    /**
     * Getter method for wkWidth.
     *
     * @return the wkWidth
     */
    public String getWkWidth() {
        return wkWidth;
    }

    /**
     * Setter method for wkWidth.
     *
     * @param wkWidth Set for wkWidth
     */
    public void setWkWidth(String wkWidth) {
        this.wkWidth = wkWidth;
    }

    /**
     * Getter method for wkVolume.
     *
     * @return the wkVolume
     */
    public String getWkVolume() {
        return wkVolume;
    }

    /**
     * Setter method for wkVolume.
     *
     * @param wkVolume Set for wkVolume
     */
    public void setWkVolume(String wkVolume) {
        this.wkVolume = wkVolume;
    }

    /**
     * Getter method for wkLengthUnit.
     *
     * @return the wkLengthUnit
     */
    public String getWkLengthUnit() {
        return wkLengthUnit;
    }

    /**
     * Setter method for wkLengthUnit.
     *
     * @param wkLengthUnit Set for wkLengthUnit
     */
    public void setWkLengthUnit(String wkLengthUnit) {
        this.wkLengthUnit = wkLengthUnit;
    }

    /**
     * Getter method for wkVolumeUnit.
     *
     * @return the wkVolumeUnit
     */
    public String getWkVolumeUnit() {
        return wkVolumeUnit;
    }

    /**
     * Setter method for wkVolumeUnit.
     *
     * @param wkVolumeUnit Set for wkVolumeUnit
     */
    public void setWkVolumeUnit(String wkVolumeUnit) {
        this.wkVolumeUnit = wkVolumeUnit;
    }

    /**
     * Getter method for wkHeightPalletize.
     *
     * @return the wkHeightPalletize
     */
    public String getWkHeightPalletize() {
        return wkHeightPalletize;
    }

    /**
     * Setter method for wkHeightPalletize.
     *
     * @param wkHeightPalletize Set for wkHeightPalletize
     */
    public void setWkHeightPalletize(String wkHeightPalletize) {
        this.wkHeightPalletize = wkHeightPalletize;
    }

    /**
     * Getter method for wkLengthPalletize.
     *
     * @return the wkLengthPalletize
     */
    public String getWkLengthPalletize() {
        return wkLengthPalletize;
    }

    /**
     * Setter method for wkLengthPalletize.
     *
     * @param wkLengthPalletize Set for wkLengthPalletize
     */
    public void setWkLengthPalletize(String wkLengthPalletize) {
        this.wkLengthPalletize = wkLengthPalletize;
    }

    /**
     * Getter method for wkWidthPalletize.
     *
     * @return the wkWidthPalletize
     */
    public String getWkWidthPalletize() {
        return wkWidthPalletize;
    }

    /**
     * Setter method for wkWidthPalletize.
     *
     * @param wkWidthPalletize Set for wkWidthPalletize
     */
    public void setWkWidthPalletize(String wkWidthPalletize) {
        this.wkWidthPalletize = wkWidthPalletize;
    }

    /**
     * Getter method for wkVolumePalletize.
     *
     * @return the wkVolumePalletize
     */
    public String getWkVolumePalletize() {
        return wkVolumePalletize;
    }

    /**
     * Setter method for wkVolumePalletize.
     *
     * @param wkVolumePalletize Set for wkVolumePalletize
     */
    public void setWkVolumePalletize(String wkVolumePalletize) {
        this.wkVolumePalletize = wkVolumePalletize;
    }

    /**
     * Getter method for usrNmEn.
     *
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * Setter method for usrNmEn.
     *
     * @param usrNmEn Set for usrNmEn
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }

    /**
     * Getter method for functionMode.
     *
     * @return the functionMode
     */
    public String getFunctionMode() {
        return functionMode;
    }

    /**
     * Setter method for functionMode.
     *
     * @param functionMode Set for functionMode
     */
    public void setFunctionMode(String functionMode) {
        this.functionMode = functionMode;
    }

    /**
     * Getter method for callScreenId.
     *
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * Setter method for callScreenId.
     *
     * @param callScreenId Set for callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }

    /**
     * Getter method for baseAuthFlg.
     *
     * @return the baseAuthFlg
     */
    public String getBaseAuthFlg() {
        return baseAuthFlg;
    }

    /**
     * Setter method for baseAuthFlg.
     *
     * @param baseAuthFlg Set for baseAuthFlg
     */
    public void setBaseAuthFlg(String baseAuthFlg) {
        this.baseAuthFlg = baseAuthFlg;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

    /**
     * Getter method for volumeOverflow.
     *
     * @return the volumeOverflow
     */
    public boolean isVolumeOverflow() {
        return volumeOverflow;
    }

    /**
     * Setter method for volumeOverflow.
     *
     * @param volumeOverflow Set for volumeOverflow
     */
    public void setVolumeOverflow(boolean volumeOverflow) {
        this.volumeOverflow = volumeOverflow;
    }

    /**
     * Getter method for netWeightOverflow.
     *
     * @return the netWeightOverflow
     */
    public boolean isNetWeightOverflow() {
        return netWeightOverflow;
    }

    /**
     * Setter method for netWeightOverflow.
     *
     * @param netWeightOverflow Set for netWeightOverflow
     */
    public void setNetWeightOverflow(boolean netWeightOverflow) {
        this.netWeightOverflow = netWeightOverflow;
    }

    /**
     * Getter method for grossWeightOverflow.
     *
     * @return the grossWeightOverflow
     */
    public boolean isGrossWeightOverflow() {
        return grossWeightOverflow;
    }

    /**
     * Setter method for grossWeightOverflow.
     *
     * @param grossWeightOverflow Set for grossWeightOverflow
     */
    public void setGrossWeightOverflow(boolean grossWeightOverflow) {
        this.grossWeightOverflow = grossWeightOverflow;
    }

    /**
     * Getter method for manualRegFlg.
     *
     * @return the manualRegFlg
     */
    public String getManualRegFlg() {
        return manualRegFlg;
    }

    /**
     * Setter method for manualRegFlg.
     *
     * @param manualRegFlg Set for manualRegFlg
     */
    public void setManualRegFlg(String manualRegFlg) {
        this.manualRegFlg = manualRegFlg;
    }

    /**
     * Getter method for length.
     *
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param length Set for length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * Getter method for width.
     *
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Setter method for width.
     *
     * @param width Set for width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Getter method for height.
     *
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Setter method for height.
     *
     * @param height Set for height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Getter method for lengthUnit.
     *
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Setter method for lengthUnit.
     *
     * @param lengthUnit Set for lengthUnit
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * Getter method for palletCartonTyp.
     *
     * @return the palletCartonTyp
     */
    public String getPalletCartonTyp() {
        return palletCartonTyp;
    }

    /**
     * Setter method for palletCartonTyp.
     *
     * @param palletCartonTyp Set for palletCartonTyp
     */
    public void setPalletCartonTyp(String palletCartonTyp) {
        this.palletCartonTyp = palletCartonTyp;
    }

    /**
     * Getter method for palletCartonTypName.
     *
     * @return the palletCartonTypName
     */
    public String getPalletCartonTypName() {
        return palletCartonTypName;
    }

    /**
     * Setter method for palletCartonTypName.
     *
     * @param palletCartonTypName Set for palletCartonTypName
     */
    public void setPalletCartonTypName(String palletCartonTypName) {
        this.palletCartonTypName = palletCartonTypName;
    }

}
