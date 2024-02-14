/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the acquisition of header information form of [L2003] (single) the results (including when the multi Part Number became single item as a result).
 * <br/>帳票【L2003】のヘッダー情報の取得（単品）（多品番品番が結果的に単品になった場合も含む）の結果を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L2003TtPltzBySingleDomain extends AbstractDomain {

    /**
     * Serial Version ID<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Palletize ． MAIN MARK<br />
     * パレタイズ．メインマーク
     */
    private String mainMark = null;
    /**
     * Palletize ． CONTAINER SORTING KEY<br />
     * パレタイズ．コンテナ層別キー
     */
    private String containerSortingKey = null;
    /**
     * Palletize ． TRANSPORT CODE<br />
     * パレタイズ．輸送手段コード
     */
    private String trnsCd = null;
    /**
     * Palletize ． DUE DATE<br />
     * パレタイズ．納期
     */
    private Date dueDt = null;
    /**
     * Palletize ． PALLET NO<br />
     * パレタイズ．パレットNO
     */
    private String palletNo = null;
    /**
     * Palletize ． EXPORT PACKING ISSUER NAME<br />
     * パレタイズ．輸出梱包者名
     */
    private String expPackingIssuerNm = null;
    /**
     * Palletize ． GROSS WEIGHT<br />
     * パレタイズ．グロス重量
     */
    private BigDecimal grossWeight = null;
    /**
     * Palletize ． NET WEIGHT<br />
     * パレタイズ．ネット重量
     */
    private BigDecimal netWeight = null;
    /**
     * Palletize ． CML TYPE<br />
     * パレタイズ．ケースマーク区分
     */
    private String cmlTyp = null;
    /**
     * Palletize ． LOADING CODE<br />
     * パレタイズ．荷積位置コード
     */
    private String loadingCd = null;
    /**
     * Palletize ． DENGER ITEM FLAG<br />
     * パレタイズ．危険品フラグ
     */
    private String dngrItemFlg = null;
    /**
     * Palletize ． VOLUME<br />
     * パレタイズ．容積
     */
    private BigDecimal volume = null;
    /**
     * Palletize. Luggage indication product flag<br />
     * パレタイズ．荷物指示品フラグ
     */
    private String stgInstrItemFlg = null;
    /**
     * Palletize ． PACKAGE FORM TYPE<br />
     * パレタイズ．梱包形態区分
     */
    private String pkgFormTyp = null;
    /**
     *  Palletize ． SHIP TO CODE<br />
     * パレタイズ．送荷先コード
     */
    private String compCd = null;
    /**
     * Palletize ． WEIGHT UNIT<br />
     * パレタイズ．重量単位
     */
    private String weightUnit = null;
    /**
     * Palletize ． CUSTOM TIMING TYPE<br />
     * パレタイズ．通関タイミング区分
     */
    private String customTimingTyp = null;
    /**
     * Palletize ． VOLUME UNIT<br />
     * パレタイズ．容積単位
     */
    private String volumeUnit = null;
    /**
     * Palletize ． CONTAINER LOOSE TYPE<br />
     * パレタイズ．コンテナルーズ区分
     */
    private String containerLooseTyp = null;
    /**
     * Palletize ． MIGRATION FLAG<br />
     * パレタイズ．移行フラグ
     */
    private String migrationFlg = null;
    /**
     * Palletize ． OLD QR MIX TYPE<br />
     * パレタイズ．旧QR用多品目番号混載区分
     */
    private String oldQrMixTyp = null;
    /**
     * Palletize ． OLD QR CONTAINER GROUP CODE<br />
     * パレタイズ．旧QR用コンテナグルーピングコード
     */
    private String oldQrContainerGrpCd = null;
    /**
     * Palletize ． SHIPPER CODE<br />
     * パレタイズ．荷主コード
     */
    private String shipperCd = null;
    /**
     * Palletize ． CUSTOMER CODE<br />
     * パレタイズ．得意先コード
     */
    private String customerCd = null;
    /**
     * Palletize ． LEGACY SHIP TO<br />
     * パレタイズ．LEGACY送荷先
     */
    private String lgcyShipTo = null;
    /**
     * Palletize ． PLANT CODE<br />
     * パレタイズ．製造部工場区分
     */
    private String plntCd = null;
    /**
     * Palletize ． LEGACY WAREHOUSE CODE<br />
     * パレタイズ．LEGACY倉庫コード
     */
    private String lgcyWhCd = null;
    /**
     * Palletize Item ． PALLETIZE ITEM NO<br />
     * パレタイズ対象品．パレタイズ品目番号
     */
    private String pltzItemNo = null;
    /**
     * Palletize Item ． ITEM DESCRIPTION<br />
     * パレタイズ対象品．品目名称
     */
    private String itemDescription = null;
    /**
     * Palletize Item ． SHIPPING LOT<br />
     * パレタイズ対象品．出荷ロット
     */
    private String shippingLot = null;
    /**
     * Palletize Item ． TAG QUANTITY<br />
     * パレタイズ対象品．タグ数
     */
    private String tagQty = null;
    /**
     * Palletize Item. Total of QUANTITY<br />
     * パレタイズ対象品．数量の合計
     */
    private String sumQty = null;
    /**
     * Palletize Item Receive Order ． CUSTOMER ITEM NO<br />
     * パレタイズ対象品受注情報．得意先品目番号
     */
    private String customerItemNo = null;
    /**
     * Measure Unit Master ． UNIT DISPLAY ( Palletize Item )<br />
     * 計量単位原単位．単位表記(パレタイズ対象品)
     */
    private String pltzItemUnitDisp = null;
    /**
     * Measure Unit Master ． UNIT DISPLAY （ Palletize ）<br />
     * 計量単位原単位．単位表記（パレタイズ）
     */
    private String pltzUnitDisp = null;
    /**
     * Export Shipping Item No Special Information Master ． CASEMARK NOTATION<br />
     * 輸出出荷品目番号原単位．ケースマーク注意書き
     */
    private String casemarkNotation = null;
    /**
     * NEXUS Ship To Master ． SHIP TO NAME ABBREVIATION<br />
     * NEXUS送荷先原単位．送荷先略称
     */
    private String shipToNmAbb = null;
    /**
     * NEXUS Company Master ． COMPANY NAME ( Ship to )<br />
     * NEXUS会社原単位．会社名称(送荷先)
     */
    private String shipCompNm = null;
    /**
     * NEXUS Company Master ． COMPANY NAME （ Palletize ）<br />
     * NEXUS会社原単位．会社名称（パレタイズ）
     */
    private String pltzCompNm = null;
    
    // NL047 ADD START
    /**
     * NEXUS Single PLTZ QR Flag<br />
     * NEXUS単品パレタイズQRフラグ
     */
    private String singlePltzQrFlg = null;
    /**
     * Ship to Code.
     * 
     * Added to TT_PLTZ search results because the SHIP_TO_CD is required for TM_EXP_SHIP_TO_SHIPPING search.<br />
     * 輸出送荷先出荷原単位検索に送荷先コードが必要なためパレタイズ検索結果に追加。
     */
    private String shipToCd = null;
    // NL047 ADD END
    
    /**
     * Default Constructor
     */
    public L2003TtPltzBySingleDomain() {
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
     * Getter method for dueDt.
     *
     * @return the dueDt
     */
    public Date getDueDt() {
        return dueDt;
    }
    /**
     * Setter method for dueDt.
     *
     * @param dueDt Set for dueDt
     */
    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
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
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }
    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
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
     * Getter method for volume.
     *
     * @return the volume
     */
    public BigDecimal getVolume() {
        return volume;
    }
    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
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
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }
    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }
    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }
    /**
     * Getter method for migrationFlg.
     *
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }
    /**
     * Setter method for migrationFlg.
     *
     * @param migrationFlg Set for migrationFlg
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
    }
    /**
     * Getter method for oldQrMixTyp.
     *
     * @return the oldQrMixTyp
     */
    public String getOldQrMixTyp() {
        return oldQrMixTyp;
    }
    /**
     * Setter method for oldQrMixTyp.
     *
     * @param oldQrMixTyp Set for oldQrMixTyp
     */
    public void setOldQrMixTyp(String oldQrMixTyp) {
        this.oldQrMixTyp = oldQrMixTyp;
    }
    /**
     * Getter method for oldQrContainerGrpCd.
     *
     * @return the oldQrContainerGrpCd
     */
    public String getOldQrContainerGrpCd() {
        return oldQrContainerGrpCd;
    }
    /**
     * Setter method for oldQrContainerGrpCd.
     *
     * @param oldQrContainerGrpCd Set for oldQrContainerGrpCd
     */
    public void setOldQrContainerGrpCd(String oldQrContainerGrpCd) {
        this.oldQrContainerGrpCd = oldQrContainerGrpCd;
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
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }
    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }
    /**
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }
    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }
    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
    }
    /**
     * Getter method for tagQty.
     *
     * @return the tagQty
     */
    public String getTagQty() {
        return tagQty;
    }
    /**
     * Setter method for tagQty.
     *
     * @param tagQty Set for tagQty
     */
    public void setTagQty(String tagQty) {
        this.tagQty = tagQty;
    }
    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public String getSumQty() {
        return sumQty;
    }
    /**
     * Setter method for sumQty.
     *
     * @param sumQty Set for sumQty
     */
    public void setSumQty(String sumQty) {
        this.sumQty = sumQty;
    }
    /**
     * Getter method for customerItemNo.
     *
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }
    /**
     * Setter method for customerItemNo.
     *
     * @param customerItemNo Set for customerItemNo
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }
    /**
     * Getter method for pltzItemUnitDisp.
     *
     * @return the pltzItemUnitDisp
     */
    public String getPltzItemUnitDisp() {
        return pltzItemUnitDisp;
    }
    /**
     * Setter method for pltzItemUnitDisp.
     *
     * @param pltzItemUnitDisp Set for pltzItemUnitDisp
     */
    public void setPltzItemUnitDisp(String pltzItemUnitDisp) {
        this.pltzItemUnitDisp = pltzItemUnitDisp;
    }
    /**
     * Getter method for pltzUnitDisp.
     *
     * @return the pltzUnitDisp
     */
    public String getPltzUnitDisp() {
        return pltzUnitDisp;
    }
    /**
     * Setter method for pltzUnitDisp.
     *
     * @param pltzUnitDisp Set for pltzUnitDisp
     */
    public void setPltzUnitDisp(String pltzUnitDisp) {
        this.pltzUnitDisp = pltzUnitDisp;
    }
    /**
     * Getter method for casemarkNotation.
     *
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }
    /**
     * Setter method for casemarkNotation.
     *
     * @param casemarkNotation Set for casemarkNotation
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
    }
    /**
     * Getter method for shipToNmAbb.
     *
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }
    /**
     * Setter method for shipToNmAbb.
     *
     * @param shipToNmAbb Set for shipToNmAbb
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }
    /**
     * Getter method for shipCompNm.
     *
     * @return the shipCompNm
     */
    public String getShipCompNm() {
        return shipCompNm;
    }
    /**
     * Setter method for shipCompNm.
     *
     * @param shipCompNm Set for shipCompNm
     */
    public void setShipCompNm(String shipCompNm) {
        this.shipCompNm = shipCompNm;
    }
    /**
     * Getter method for pltzCompNm.
     *
     * @return the pltzCompNm
     */
    public String getPltzCompNm() {
        return pltzCompNm;
    }
    /**
     * Setter method for pltzCompNm.
     *
     * @param pltzCompNm Set for pltzCompNm
     */
    public void setPltzCompNm(String pltzCompNm) {
        this.pltzCompNm = pltzCompNm;
    }
    /**
     * Getter method of singlePltzQrFlg.
     *
     * @return the singlePltzQrFlg.
     */
    public String getSinglePltzQrFlg() {
        return singlePltzQrFlg;
    }
    /**
     * Setter method of singlePltzQrFlg.
     *
     * @param singlePltzQrFlg Value to be stored in singlePltzQrFlg.
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg) {
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
   /**
    * Getter method of shipToCd.
    *
    * @return the shipToCd.
    */
   public String getShipToCd() {
       return shipToCd;
   }

   /**
    * Setter method of shipToCd.
    *
    * @param shipToCd Value to be stored in shipToCd.
    */
   public void setShipToCd(String shipToCd) {
       this.shipToCd = shipToCd;
   }
}