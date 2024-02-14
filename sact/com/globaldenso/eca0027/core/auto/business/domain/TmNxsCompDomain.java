/*
 * PROJECT：eca0027
 * 
 * TmNxsComp のDomainクラス
 * テーブル概要：NEXUS Company Master/NEXUS会社原単位  Master to hold the information of the company/会社の情報を保持するMaster
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/02/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmNxsComp のDomainクラスです。<BR>
 * テーブル概要：NEXUS Company Master/NEXUS会社原単位  Master to hold the information of the company/会社の情報を保持するMaster<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/02/19 15:21:32<BR>
 * 
 * テーブル定義から2016/02/19に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class TmNxsCompDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE/会社コード
     */
    private String compCd;

    /**
     * COMPANY NAME/会社名称
     */
    private String compNm;

    /**
     * COMPANY NAME ABBREVIATION/会社略称
     */
    private String compNmAbb;

    /**
     * COMPANY ADDRESS/会社住所
     */
    private String compAddr;

    /**
     * COMPANY TEL/会社TEL
     */
    private String compTel;

    /**
     * COMPANY FAX/会社FAX
     */
    private String compFax;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not
     */
    private String dnBaseFlg;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード
     */
    private String hqCompCd;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not
     */
    private String shipperFlg;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not
     */
    private String customsBrokerFlg;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not
     */
    private String carrierCompFlg;

    /**
     * COUNTRY CODE/国コード
     */
    private String cntryCd;

    /**
     * LANGUAGE CODE/言語コード
     */
    private String lngCd;

    /**
     * TIMEZONE ID/タイムゾーンID
     */
    private String timezoneId;

    /**
     * CML PRINT NUM/CML印刷枚数  非製部品のデフォルト値
     */
    private BigDecimal cmlPrintNum;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号
     */
    private String itemNoGrp;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused
     */
    private String usePcSysTyp;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * LENGTH UNIT/長さ単位
     */
    private String lengthUnit;

    /**
     * VOLUME UNIT/容積単位
     */
    private String volumeUnit;

    /**
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not
     */
    private String salesContractFlg;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not
     */
    private String intermediateFlg;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1
     */
    private String printCompNm1;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2
     */
    private String printCompNm2;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1
     */
    private String printCompAddr1;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2
     */
    private String printCompAddr2;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3
     */
    private String printCompAddr3;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4
     */
    private String printCompAddr4;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード
     */
    private String newLincSubsidiaryCd;

    /**
     * SERVER ID/サーバID
     */
    private String serverId;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ
     */
    private String bhtShippingFirmTyp;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)
     */
    private String roundPattern;

    /**
     * TAX ID NO/納税者番号
     */
    private String taxIdNo;

    /**
     * PLLETIZE VOLUME MAX/パレタイズ容積上限
     */
    private BigDecimal pltzVolumeMax;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TmNxsCompDomain() {
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
     * compNm のゲッターメソッドです。
     * 
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * compNm のセッターメソッドです。
     * 
     * @param compNm compNm に設定する
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * compNmAbb のゲッターメソッドです。
     * 
     * @return the compNmAbb
     */
    public String getCompNmAbb() {
        return compNmAbb;
    }

    /**
     * compNmAbb のセッターメソッドです。
     * 
     * @param compNmAbb compNmAbb に設定する
     */
    public void setCompNmAbb(String compNmAbb) {
        this.compNmAbb = compNmAbb;
    }

    /**
     * compAddr のゲッターメソッドです。
     * 
     * @return the compAddr
     */
    public String getCompAddr() {
        return compAddr;
    }

    /**
     * compAddr のセッターメソッドです。
     * 
     * @param compAddr compAddr に設定する
     */
    public void setCompAddr(String compAddr) {
        this.compAddr = compAddr;
    }

    /**
     * compTel のゲッターメソッドです。
     * 
     * @return the compTel
     */
    public String getCompTel() {
        return compTel;
    }

    /**
     * compTel のセッターメソッドです。
     * 
     * @param compTel compTel に設定する
     */
    public void setCompTel(String compTel) {
        this.compTel = compTel;
    }

    /**
     * compFax のゲッターメソッドです。
     * 
     * @return the compFax
     */
    public String getCompFax() {
        return compFax;
    }

    /**
     * compFax のセッターメソッドです。
     * 
     * @param compFax compFax に設定する
     */
    public void setCompFax(String compFax) {
        this.compFax = compFax;
    }

    /**
     * dnBaseFlg のゲッターメソッドです。
     * 
     * @return the dnBaseFlg
     */
    public String getDnBaseFlg() {
        return dnBaseFlg;
    }

    /**
     * dnBaseFlg のセッターメソッドです。
     * 
     * @param dnBaseFlg dnBaseFlg に設定する
     */
    public void setDnBaseFlg(String dnBaseFlg) {
        this.dnBaseFlg = dnBaseFlg;
    }

    /**
     * hqCompCd のゲッターメソッドです。
     * 
     * @return the hqCompCd
     */
    public String getHqCompCd() {
        return hqCompCd;
    }

    /**
     * hqCompCd のセッターメソッドです。
     * 
     * @param hqCompCd hqCompCd に設定する
     */
    public void setHqCompCd(String hqCompCd) {
        this.hqCompCd = hqCompCd;
    }

    /**
     * shipperFlg のゲッターメソッドです。
     * 
     * @return the shipperFlg
     */
    public String getShipperFlg() {
        return shipperFlg;
    }

    /**
     * shipperFlg のセッターメソッドです。
     * 
     * @param shipperFlg shipperFlg に設定する
     */
    public void setShipperFlg(String shipperFlg) {
        this.shipperFlg = shipperFlg;
    }

    /**
     * customsBrokerFlg のゲッターメソッドです。
     * 
     * @return the customsBrokerFlg
     */
    public String getCustomsBrokerFlg() {
        return customsBrokerFlg;
    }

    /**
     * customsBrokerFlg のセッターメソッドです。
     * 
     * @param customsBrokerFlg customsBrokerFlg に設定する
     */
    public void setCustomsBrokerFlg(String customsBrokerFlg) {
        this.customsBrokerFlg = customsBrokerFlg;
    }

    /**
     * carrierCompFlg のゲッターメソッドです。
     * 
     * @return the carrierCompFlg
     */
    public String getCarrierCompFlg() {
        return carrierCompFlg;
    }

    /**
     * carrierCompFlg のセッターメソッドです。
     * 
     * @param carrierCompFlg carrierCompFlg に設定する
     */
    public void setCarrierCompFlg(String carrierCompFlg) {
        this.carrierCompFlg = carrierCompFlg;
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
     * lngCd のゲッターメソッドです。
     * 
     * @return the lngCd
     */
    public String getLngCd() {
        return lngCd;
    }

    /**
     * lngCd のセッターメソッドです。
     * 
     * @param lngCd lngCd に設定する
     */
    public void setLngCd(String lngCd) {
        this.lngCd = lngCd;
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
     * cmlPrintNum のゲッターメソッドです。
     * 
     * @return the cmlPrintNum
     */
    public BigDecimal getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * cmlPrintNum のセッターメソッドです。
     * 
     * @param cmlPrintNum cmlPrintNum に設定する
     */
    public void setCmlPrintNum(BigDecimal cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
    }

    /**
     * itemNoGrp のゲッターメソッドです。
     * 
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * itemNoGrp のセッターメソッドです。
     * 
     * @param itemNoGrp itemNoGrp に設定する
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

    /**
     * usePcSysTyp のゲッターメソッドです。
     * 
     * @return the usePcSysTyp
     */
    public String getUsePcSysTyp() {
        return usePcSysTyp;
    }

    /**
     * usePcSysTyp のセッターメソッドです。
     * 
     * @param usePcSysTyp usePcSysTyp に設定する
     */
    public void setUsePcSysTyp(String usePcSysTyp) {
        this.usePcSysTyp = usePcSysTyp;
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
     * salesContractFlg のゲッターメソッドです。
     * 
     * @return the salesContractFlg
     */
    public String getSalesContractFlg() {
        return salesContractFlg;
    }

    /**
     * salesContractFlg のセッターメソッドです。
     * 
     * @param salesContractFlg salesContractFlg に設定する
     */
    public void setSalesContractFlg(String salesContractFlg) {
        this.salesContractFlg = salesContractFlg;
    }

    /**
     * intermediateFlg のゲッターメソッドです。
     * 
     * @return the intermediateFlg
     */
    public String getIntermediateFlg() {
        return intermediateFlg;
    }

    /**
     * intermediateFlg のセッターメソッドです。
     * 
     * @param intermediateFlg intermediateFlg に設定する
     */
    public void setIntermediateFlg(String intermediateFlg) {
        this.intermediateFlg = intermediateFlg;
    }

    /**
     * printCompNm1 のゲッターメソッドです。
     * 
     * @return the printCompNm1
     */
    public String getPrintCompNm1() {
        return printCompNm1;
    }

    /**
     * printCompNm1 のセッターメソッドです。
     * 
     * @param printCompNm1 printCompNm1 に設定する
     */
    public void setPrintCompNm1(String printCompNm1) {
        this.printCompNm1 = printCompNm1;
    }

    /**
     * printCompNm2 のゲッターメソッドです。
     * 
     * @return the printCompNm2
     */
    public String getPrintCompNm2() {
        return printCompNm2;
    }

    /**
     * printCompNm2 のセッターメソッドです。
     * 
     * @param printCompNm2 printCompNm2 に設定する
     */
    public void setPrintCompNm2(String printCompNm2) {
        this.printCompNm2 = printCompNm2;
    }

    /**
     * printCompAddr1 のゲッターメソッドです。
     * 
     * @return the printCompAddr1
     */
    public String getPrintCompAddr1() {
        return printCompAddr1;
    }

    /**
     * printCompAddr1 のセッターメソッドです。
     * 
     * @param printCompAddr1 printCompAddr1 に設定する
     */
    public void setPrintCompAddr1(String printCompAddr1) {
        this.printCompAddr1 = printCompAddr1;
    }

    /**
     * printCompAddr2 のゲッターメソッドです。
     * 
     * @return the printCompAddr2
     */
    public String getPrintCompAddr2() {
        return printCompAddr2;
    }

    /**
     * printCompAddr2 のセッターメソッドです。
     * 
     * @param printCompAddr2 printCompAddr2 に設定する
     */
    public void setPrintCompAddr2(String printCompAddr2) {
        this.printCompAddr2 = printCompAddr2;
    }

    /**
     * printCompAddr3 のゲッターメソッドです。
     * 
     * @return the printCompAddr3
     */
    public String getPrintCompAddr3() {
        return printCompAddr3;
    }

    /**
     * printCompAddr3 のセッターメソッドです。
     * 
     * @param printCompAddr3 printCompAddr3 に設定する
     */
    public void setPrintCompAddr3(String printCompAddr3) {
        this.printCompAddr3 = printCompAddr3;
    }

    /**
     * printCompAddr4 のゲッターメソッドです。
     * 
     * @return the printCompAddr4
     */
    public String getPrintCompAddr4() {
        return printCompAddr4;
    }

    /**
     * printCompAddr4 のセッターメソッドです。
     * 
     * @param printCompAddr4 printCompAddr4 に設定する
     */
    public void setPrintCompAddr4(String printCompAddr4) {
        this.printCompAddr4 = printCompAddr4;
    }

    /**
     * newLincSubsidiaryCd のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCd
     */
    public String getNewLincSubsidiaryCd() {
        return newLincSubsidiaryCd;
    }

    /**
     * newLincSubsidiaryCd のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCd newLincSubsidiaryCd に設定する
     */
    public void setNewLincSubsidiaryCd(String newLincSubsidiaryCd) {
        this.newLincSubsidiaryCd = newLincSubsidiaryCd;
    }

    /**
     * serverId のゲッターメソッドです。
     * 
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * serverId のセッターメソッドです。
     * 
     * @param serverId serverId に設定する
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
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
     * roundPattern のゲッターメソッドです。
     * 
     * @return the roundPattern
     */
    public String getRoundPattern() {
        return roundPattern;
    }

    /**
     * roundPattern のセッターメソッドです。
     * 
     * @param roundPattern roundPattern に設定する
     */
    public void setRoundPattern(String roundPattern) {
        this.roundPattern = roundPattern;
    }

    /**
     * taxIdNo のゲッターメソッドです。
     * 
     * @return the taxIdNo
     */
    public String getTaxIdNo() {
        return taxIdNo;
    }

    /**
     * taxIdNo のセッターメソッドです。
     * 
     * @param taxIdNo taxIdNo に設定する
     */
    public void setTaxIdNo(String taxIdNo) {
        this.taxIdNo = taxIdNo;
    }

    /**
     * pltzVolumeMax のゲッターメソッドです。
     * 
     * @return the pltzVolumeMax
     */
    public BigDecimal getPltzVolumeMax() {
        return pltzVolumeMax;
    }

    /**
     * pltzVolumeMax のセッターメソッドです。
     * 
     * @param pltzVolumeMax pltzVolumeMax に設定する
     */
    public void setPltzVolumeMax(BigDecimal pltzVolumeMax) {
        this.pltzVolumeMax = pltzVolumeMax;
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
