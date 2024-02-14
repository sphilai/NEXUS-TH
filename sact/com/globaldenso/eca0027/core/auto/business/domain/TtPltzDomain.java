/*
 * PROJECT：eca0027
 * 
 * TtPltz のDomainクラス
 * テーブル概要：Palletize/パレタイズ  Table to hold the information of the pallet packing unit/パレット単位の梱包情報を保持するテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/01/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * TtPltz のDomainクラスです。<BR>
 * テーブル概要：Palletize/パレタイズ  Table to hold the information of the pallet packing unit/パレット単位の梱包情報を保持するテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/01/07 10:53:16<BR>
 * 
 * テーブル定義から2016/01/07に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class TtPltzDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN MARK/メインマーク
     */
    private String mainMark;

    /**
     * PALLET NO/パレットNO
     */
    private String palletNo;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * CUSTOMER CODE/得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO/LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * TRANSPORT CODE/輸送手段コード  現在の輸送手段
     */
    private String trnsCd;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段
     */
    private String trnsCdOrg;

    /**
     * REVISE FLAG/輸送手段付替えフラグ  Y:Revised, N:Not
     */
    private String reviseFlg;

    /**
     * PLANT CODE/製造部工場区分
     */
    private String plntCd;

    /**
     * LEGACY WAREHOUSE CODE/LEGACY倉庫コード
     */
    private String lgcyWhCd;

    /**
     * CUR LEGACY WAREHOUSE CODE/現在LEGACY倉庫コード
     */
    private String curLgcyWhCd;

    /**
     * PACKAGE FORM TYPE/梱包形態区分  M:Multi, S:Single
     */
    private String pkgFormTyp;

    /**
     * INVOICE KEY/インボイスキー
     */
    private String invoiceKey;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分  L:Loose, C:Full Container
     */
    private String containerLooseTyp;

    /**
     * RETURN STYLE CODE/返却荷姿コード
     */
    private String returnStyleCd;

    /**
     * VARIANT FLAG/亜種フラグ  Y:Vriant, N:Not
     */
    private String variantFlg;

    /**
     * RT USE FLAG/RT材使用フラグ
     */
    private String rtUseFlg;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * NET WEIGHT/ネット重量
     */
    private BigDecimal netWeight;

    /**
     * GROSS WEIGHT/グロス重量
     */
    private BigDecimal grossWeight;

    /**
     * LENGTH UNIT/長さ単位
     */
    private String lengthUnit;

    /**
     * LENGTH/縦
     */
    private BigDecimal length;

    /**
     * WIDTH/横
     */
    private BigDecimal width;

    /**
     * HEIGHT/高さ
     */
    private BigDecimal height;

    /**
     * VOLUME UNIT/容積単位
     */
    private String volumeUnit;

    /**
     * VOLUME/容積
     */
    private BigDecimal volume;

    /**
     * SUPPLIER MAIN MARK/仕入先メインマーク
     */
    private String supplierMainMark;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous
     */
    private String cmlTyp;

    /**
     * OUTER PACKAGE CODE/外装コード
     */
    private String outerPkgCd;

    /**
     * EXPORT PACKING DATE/輸出梱包日
     */
    private Date expPackingDt;

    /**
     * EXPORT PACKING ISSUER ID/輸出梱包者ID
     */
    private String expPackingIssuerId;

    /**
     * EXPORT PACKING ISSUER NAME/輸出梱包者名
     */
    private String expPackingIssuerNm;

    /**
     * DUE DATE/納期
     */
    private Date dueDt;

    /**
     * STAGING INSTRUCTION ITEM FLAG/荷揃指示品フラグ  Y:Staging Instruction Item, N:Not
     */
    private String stgInstrItemFlg;

    /**
     * CONSIGNEE CODE/荷受人コード  不要候補
     */
    private String consigneeCd;

    /**
     * COMMERCIAL FLAG/有償フラグ  Y:Commercial, N:Not
     */
    private String commercialFlg;

    /**
     * TRADE TERMS/契約条件  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String tradeTerms;

    /**
     * CURRENCY CODE/通貨コード
     */
    private String currCd;

    /**
     * PALLETIZE STATUS/パレタイズステータスコード  10:Palletize,
20:Staging Instr.,
30:Staging Instr. - Actual,
40:Customs Clearance(Type Z),
50:Staging Actual,
60:Customs Clearance(Type B),
70:Shipping Comfirmation,
80:Shipping Comfirmation Actual,
90:Customs clearance(Type A)
     */
    private String pltzStatus;

    /**
     * PACKING WAREHOUSE COMPANY CODE/梱包倉庫会社コード
     */
    private String packingWhCompCd;

    /**
     * PACKING WAREHOUSE CODE/梱包倉庫コード
     */
    private String packingWhCd;

    /**
     * CUR WAREHOUSE COMPANY CODE/現在倉庫会社コード
     */
    private String curWhCompCd;

    /**
     * CUR WAREHOUSE CODE/現在倉庫コード
     */
    private String curWhCd;

    /**
     * X-TAG/まとめメインマーク
     */
    private String xmainMark;

    /**
     * INVOICE NO/インボイスNO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE/インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * LOADING CODE/荷積位置コード  F:Free,
D:Door,
B:Back
     */
    private String loadingCd;

    /**
     * SITE TYPE/位置区分  A:1/4(Front), B:Front2/4, C:Rear3/4, D:Rear4/4(Rear)
     */
    private String siteTyp;

    /**
     * EXPORT LIMIT FLAG/輸出規制フラグ  Y:Includes Regulating Item, N:Not
     */
    private String expLimitFlg;

    /**
     * DENGER ITEM FLAG/危険品フラグ  Y:Danger Item, N:Not
     */
    private String dngrItemFlg;

    /**
     * STAGING INSTRUCTION NO/荷揃え指示NO
     */
    private String stgInstrNo;

    /**
     * STAGING ACTUALITY NO/山作り実績NO
     */
    private String stgActNo;

    /**
     * SHIPPING CONFIRM NO/出荷確認NO
     */
    private String shippingFirmNo;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * LAST TR STATUS/最終搬出入ステータス  10:Blank,
20:Issue TR,
30:Activate TR,
40:Received at To
(10 Palletizing immediately)
     */
    private String lastTrStatus;

    /**
     * LAST TR RECEIVE DATE/最終送荷書受入日
     */
    private Date lastTrRcvDt;

    /**
     * PALLETIZE INSTRUCTION NO/梱包指示NO
     */
    private String pltzInstrNo;

    /**
     * EXPORT REQUEST NO/輸出依頼NO
     */
    private String expRequestNo;

    /**
     * EXPORT REQUEST ALL CML ISSUED FLAG/輸出依頼全CML発行済みフラグ  Y:Issued All, N:Not
     */
    private String expRequestAllCmlIssuedFlg;

    /**
     * SPLIT SHIPPING NG FLAG/分割船積禁止フラグ  Y:Prohibit Division, N:Allowed Division
     */
    private String splitShippingNgFlg;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称
     */
    private String shipperCompNmAbb;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1
     */
    private String shipperCompNm1;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2
     */
    private String shipperCompNm2;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1
     */
    private String shipperCompAddr1;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2
     */
    private String shipperCompAddr2;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3
     */
    private String shipperCompAddr3;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4
     */
    private String shipperCompAddr4;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL
     */
    private String shipperCompTel;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX
     */
    private String shipperCompFax;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1
     */
    private String consigneeCompNm1;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2
     */
    private String consigneeCompNm2;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1
     */
    private String consigneeCompAddr1;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2
     */
    private String consigneeCompAddr2;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3
     */
    private String consigneeCompAddr3;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4
     */
    private String consigneeCompAddr4;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL
     */
    private String consigneeCompTel;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX
     */
    private String consigneeCompFax;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先
     */
    private String consigneeAttn;

    /**
     * SHIP TO NAME 1/送荷先名称1
     */
    private String shipToNm1;

    /**
     * SHIP TO NAME 2/送荷先名称2
     */
    private String shipToNm2;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1
     */
    private String shipToAddr1;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2
     */
    private String shipToAddr2;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3
     */
    private String shipToAddr3;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4
     */
    private String shipToAddr4;

    /**
     * SHIP TO TEL/送荷先TEL
     */
    private String shipToTel;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value
     */
    private String invoiceCtgry;

    /**
     * PRICE TERMS/建値区分  FOB:Free On Board,
C and I:Cost and Insurance,
CIF:Cost, Insurance and Freight,
CFR:Cost and Freight,
EXW:Ex-Works,
FCA:Free Carrier,
CPT:Carriage Paid to,
CIP:Carriage and Insurance Paid to,
DAT:Delivered at Terminal,
DAP:Delivered at Place,
DDP:Delivered Duty paid,
FAS:Free Alongside Ship
     */
    private String priceTerms;

    /**
     * TERMS POINT/費用負担移転地
     */
    private String termsPoint;

    /**
     * PAYMENT TERMS/支払条件
     */
    private String payTerms;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance
     */
    private String payMeth;

    /**
     * RE EXPORT GOODS FLAG/再輸出品フラグ  Y:Re-export, N:Not
     */
    private String reExpGoodsFlg;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO
     */
    private String supplierInvoiceNo;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1
     */
    private String impInvoiceNo1;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2
     */
    private String impInvoiceNo2;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect
     */
    private String freightResponsibleCd;

    /**
     * MIGRATION FLAG/移行フラグ  Y:Migration Data, N:Not
     */
    private String migrationFlg;

    /**
     * OLD QR MIX TYPE  /旧QR用多品目番号混載区分
     */
    private String oldQrMixTyp;

    /**
     * OLD QR CONTAINER GROUP CODE/旧QR用コンテナグルーピングコード
     */
    private String oldQrContainerGrpCd;

    /**
     * PALLET CARTON TYP/パレット・カートン区分  P:Pallet, C:Carton
     */
    private String palletCartonTyp;

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
    public TtPltzDomain() {
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * palletNo のゲッターメソッドです。
     * 
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * palletNo のセッターメソッドです。
     * 
     * @param palletNo palletNo に設定する
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
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
     * trnsCdOrg のゲッターメソッドです。
     * 
     * @return the trnsCdOrg
     */
    public String getTrnsCdOrg() {
        return trnsCdOrg;
    }

    /**
     * trnsCdOrg のセッターメソッドです。
     * 
     * @param trnsCdOrg trnsCdOrg に設定する
     */
    public void setTrnsCdOrg(String trnsCdOrg) {
        this.trnsCdOrg = trnsCdOrg;
    }

    /**
     * reviseFlg のゲッターメソッドです。
     * 
     * @return the reviseFlg
     */
    public String getReviseFlg() {
        return reviseFlg;
    }

    /**
     * reviseFlg のセッターメソッドです。
     * 
     * @param reviseFlg reviseFlg に設定する
     */
    public void setReviseFlg(String reviseFlg) {
        this.reviseFlg = reviseFlg;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * lgcyWhCd のゲッターメソッドです。
     * 
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * lgcyWhCd のセッターメソッドです。
     * 
     * @param lgcyWhCd lgcyWhCd に設定する
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * curLgcyWhCd のゲッターメソッドです。
     * 
     * @return the curLgcyWhCd
     */
    public String getCurLgcyWhCd() {
        return curLgcyWhCd;
    }

    /**
     * curLgcyWhCd のセッターメソッドです。
     * 
     * @param curLgcyWhCd curLgcyWhCd に設定する
     */
    public void setCurLgcyWhCd(String curLgcyWhCd) {
        this.curLgcyWhCd = curLgcyWhCd;
    }

    /**
     * pkgFormTyp のゲッターメソッドです。
     * 
     * @return the pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * pkgFormTyp のセッターメソッドです。
     * 
     * @param pkgFormTyp pkgFormTyp に設定する
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * invoiceKey のゲッターメソッドです。
     * 
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * invoiceKey のセッターメソッドです。
     * 
     * @param invoiceKey invoiceKey に設定する
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
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
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * returnStyleCd のゲッターメソッドです。
     * 
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * returnStyleCd のセッターメソッドです。
     * 
     * @param returnStyleCd returnStyleCd に設定する
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * variantFlg のゲッターメソッドです。
     * 
     * @return the variantFlg
     */
    public String getVariantFlg() {
        return variantFlg;
    }

    /**
     * variantFlg のセッターメソッドです。
     * 
     * @param variantFlg variantFlg に設定する
     */
    public void setVariantFlg(String variantFlg) {
        this.variantFlg = variantFlg;
    }

    /**
     * rtUseFlg のゲッターメソッドです。
     * 
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }

    /**
     * rtUseFlg のセッターメソッドです。
     * 
     * @param rtUseFlg rtUseFlg に設定する
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
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
     * netWeight のゲッターメソッドです。
     * 
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight のセッターメソッドです。
     * 
     * @param netWeight netWeight に設定する
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
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
     * length のゲッターメソッドです。
     * 
     * @return the length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * length のセッターメソッドです。
     * 
     * @param length length に設定する
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * width のゲッターメソッドです。
     * 
     * @return the width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * width のセッターメソッドです。
     * 
     * @param width width に設定する
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * height のゲッターメソッドです。
     * 
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * height のセッターメソッドです。
     * 
     * @param height height に設定する
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
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
     * supplierMainMark のゲッターメソッドです。
     * 
     * @return the supplierMainMark
     */
    public String getSupplierMainMark() {
        return supplierMainMark;
    }

    /**
     * supplierMainMark のセッターメソッドです。
     * 
     * @param supplierMainMark supplierMainMark に設定する
     */
    public void setSupplierMainMark(String supplierMainMark) {
        this.supplierMainMark = supplierMainMark;
    }

    /**
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * outerPkgCd のゲッターメソッドです。
     * 
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * outerPkgCd のセッターメソッドです。
     * 
     * @param outerPkgCd outerPkgCd に設定する
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }

    /**
     * expPackingDt のゲッターメソッドです。
     * 
     * @return the expPackingDt
     */
    public Date getExpPackingDt() {
        return expPackingDt;
    }

    /**
     * expPackingDt のセッターメソッドです。
     * 
     * @param expPackingDt expPackingDt に設定する
     */
    public void setExpPackingDt(Date expPackingDt) {
        this.expPackingDt = expPackingDt;
    }

    /**
     * expPackingIssuerId のゲッターメソッドです。
     * 
     * @return the expPackingIssuerId
     */
    public String getExpPackingIssuerId() {
        return expPackingIssuerId;
    }

    /**
     * expPackingIssuerId のセッターメソッドです。
     * 
     * @param expPackingIssuerId expPackingIssuerId に設定する
     */
    public void setExpPackingIssuerId(String expPackingIssuerId) {
        this.expPackingIssuerId = expPackingIssuerId;
    }

    /**
     * expPackingIssuerNm のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNm
     */
    public String getExpPackingIssuerNm() {
        return expPackingIssuerNm;
    }

    /**
     * expPackingIssuerNm のセッターメソッドです。
     * 
     * @param expPackingIssuerNm expPackingIssuerNm に設定する
     */
    public void setExpPackingIssuerNm(String expPackingIssuerNm) {
        this.expPackingIssuerNm = expPackingIssuerNm;
    }

    /**
     * dueDt のゲッターメソッドです。
     * 
     * @return the dueDt
     */
    public Date getDueDt() {
        return dueDt;
    }

    /**
     * dueDt のセッターメソッドです。
     * 
     * @param dueDt dueDt に設定する
     */
    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    /**
     * stgInstrItemFlg のゲッターメソッドです。
     * 
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * stgInstrItemFlg のセッターメソッドです。
     * 
     * @param stgInstrItemFlg stgInstrItemFlg に設定する
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * consigneeCd のゲッターメソッドです。
     * 
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * consigneeCd のセッターメソッドです。
     * 
     * @param consigneeCd consigneeCd に設定する
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * commercialFlg のゲッターメソッドです。
     * 
     * @return the commercialFlg
     */
    public String getCommercialFlg() {
        return commercialFlg;
    }

    /**
     * commercialFlg のセッターメソッドです。
     * 
     * @param commercialFlg commercialFlg に設定する
     */
    public void setCommercialFlg(String commercialFlg) {
        this.commercialFlg = commercialFlg;
    }

    /**
     * tradeTerms のゲッターメソッドです。
     * 
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * tradeTerms のセッターメソッドです。
     * 
     * @param tradeTerms tradeTerms に設定する
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * pltzStatus のゲッターメソッドです。
     * 
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * pltzStatus のセッターメソッドです。
     * 
     * @param pltzStatus pltzStatus に設定する
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * packingWhCompCd のゲッターメソッドです。
     * 
     * @return the packingWhCompCd
     */
    public String getPackingWhCompCd() {
        return packingWhCompCd;
    }

    /**
     * packingWhCompCd のセッターメソッドです。
     * 
     * @param packingWhCompCd packingWhCompCd に設定する
     */
    public void setPackingWhCompCd(String packingWhCompCd) {
        this.packingWhCompCd = packingWhCompCd;
    }

    /**
     * packingWhCd のゲッターメソッドです。
     * 
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * packingWhCd のセッターメソッドです。
     * 
     * @param packingWhCd packingWhCd に設定する
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * curWhCompCd のゲッターメソッドです。
     * 
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * curWhCompCd のセッターメソッドです。
     * 
     * @param curWhCompCd curWhCompCd に設定する
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * curWhCd のゲッターメソッドです。
     * 
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * curWhCd のセッターメソッドです。
     * 
     * @param curWhCd curWhCd に設定する
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * xmainMark のゲッターメソッドです。
     * 
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * xmainMark のセッターメソッドです。
     * 
     * @param xmainMark xmainMark に設定する
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * invoiceNo のゲッターメソッドです。
     * 
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * invoiceNo のセッターメソッドです。
     * 
     * @param invoiceNo invoiceNo に設定する
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * invoiceIssueDt のゲッターメソッドです。
     * 
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * invoiceIssueDt のセッターメソッドです。
     * 
     * @param invoiceIssueDt invoiceIssueDt に設定する
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * siteTyp のゲッターメソッドです。
     * 
     * @return the siteTyp
     */
    public String getSiteTyp() {
        return siteTyp;
    }

    /**
     * siteTyp のセッターメソッドです。
     * 
     * @param siteTyp siteTyp に設定する
     */
    public void setSiteTyp(String siteTyp) {
        this.siteTyp = siteTyp;
    }

    /**
     * expLimitFlg のゲッターメソッドです。
     * 
     * @return the expLimitFlg
     */
    public String getExpLimitFlg() {
        return expLimitFlg;
    }

    /**
     * expLimitFlg のセッターメソッドです。
     * 
     * @param expLimitFlg expLimitFlg に設定する
     */
    public void setExpLimitFlg(String expLimitFlg) {
        this.expLimitFlg = expLimitFlg;
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
     * stgInstrNo のゲッターメソッドです。
     * 
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * stgInstrNo のセッターメソッドです。
     * 
     * @param stgInstrNo stgInstrNo に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
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
     * shippingFirmNo のゲッターメソッドです。
     * 
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * shippingFirmNo のセッターメソッドです。
     * 
     * @param shippingFirmNo shippingFirmNo に設定する
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * lastTrStatus のゲッターメソッドです。
     * 
     * @return the lastTrStatus
     */
    public String getLastTrStatus() {
        return lastTrStatus;
    }

    /**
     * lastTrStatus のセッターメソッドです。
     * 
     * @param lastTrStatus lastTrStatus に設定する
     */
    public void setLastTrStatus(String lastTrStatus) {
        this.lastTrStatus = lastTrStatus;
    }

    /**
     * lastTrRcvDt のゲッターメソッドです。
     * 
     * @return the lastTrRcvDt
     */
    public Date getLastTrRcvDt() {
        return lastTrRcvDt;
    }

    /**
     * lastTrRcvDt のセッターメソッドです。
     * 
     * @param lastTrRcvDt lastTrRcvDt に設定する
     */
    public void setLastTrRcvDt(Date lastTrRcvDt) {
        this.lastTrRcvDt = lastTrRcvDt;
    }

    /**
     * pltzInstrNo のゲッターメソッドです。
     * 
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * pltzInstrNo のセッターメソッドです。
     * 
     * @param pltzInstrNo pltzInstrNo に設定する
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * expRequestAllCmlIssuedFlg のゲッターメソッドです。
     * 
     * @return the expRequestAllCmlIssuedFlg
     */
    public String getExpRequestAllCmlIssuedFlg() {
        return expRequestAllCmlIssuedFlg;
    }

    /**
     * expRequestAllCmlIssuedFlg のセッターメソッドです。
     * 
     * @param expRequestAllCmlIssuedFlg expRequestAllCmlIssuedFlg に設定する
     */
    public void setExpRequestAllCmlIssuedFlg(String expRequestAllCmlIssuedFlg) {
        this.expRequestAllCmlIssuedFlg = expRequestAllCmlIssuedFlg;
    }

    /**
     * splitShippingNgFlg のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlg
     */
    public String getSplitShippingNgFlg() {
        return splitShippingNgFlg;
    }

    /**
     * splitShippingNgFlg のセッターメソッドです。
     * 
     * @param splitShippingNgFlg splitShippingNgFlg に設定する
     */
    public void setSplitShippingNgFlg(String splitShippingNgFlg) {
        this.splitShippingNgFlg = splitShippingNgFlg;
    }

    /**
     * shipperCompNmAbb のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbb
     */
    public String getShipperCompNmAbb() {
        return shipperCompNmAbb;
    }

    /**
     * shipperCompNmAbb のセッターメソッドです。
     * 
     * @param shipperCompNmAbb shipperCompNmAbb に設定する
     */
    public void setShipperCompNmAbb(String shipperCompNmAbb) {
        this.shipperCompNmAbb = shipperCompNmAbb;
    }

    /**
     * shipperCompNm1 のゲッターメソッドです。
     * 
     * @return the shipperCompNm1
     */
    public String getShipperCompNm1() {
        return shipperCompNm1;
    }

    /**
     * shipperCompNm1 のセッターメソッドです。
     * 
     * @param shipperCompNm1 shipperCompNm1 に設定する
     */
    public void setShipperCompNm1(String shipperCompNm1) {
        this.shipperCompNm1 = shipperCompNm1;
    }

    /**
     * shipperCompNm2 のゲッターメソッドです。
     * 
     * @return the shipperCompNm2
     */
    public String getShipperCompNm2() {
        return shipperCompNm2;
    }

    /**
     * shipperCompNm2 のセッターメソッドです。
     * 
     * @param shipperCompNm2 shipperCompNm2 に設定する
     */
    public void setShipperCompNm2(String shipperCompNm2) {
        this.shipperCompNm2 = shipperCompNm2;
    }

    /**
     * shipperCompAddr1 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1
     */
    public String getShipperCompAddr1() {
        return shipperCompAddr1;
    }

    /**
     * shipperCompAddr1 のセッターメソッドです。
     * 
     * @param shipperCompAddr1 shipperCompAddr1 に設定する
     */
    public void setShipperCompAddr1(String shipperCompAddr1) {
        this.shipperCompAddr1 = shipperCompAddr1;
    }

    /**
     * shipperCompAddr2 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2
     */
    public String getShipperCompAddr2() {
        return shipperCompAddr2;
    }

    /**
     * shipperCompAddr2 のセッターメソッドです。
     * 
     * @param shipperCompAddr2 shipperCompAddr2 に設定する
     */
    public void setShipperCompAddr2(String shipperCompAddr2) {
        this.shipperCompAddr2 = shipperCompAddr2;
    }

    /**
     * shipperCompAddr3 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3
     */
    public String getShipperCompAddr3() {
        return shipperCompAddr3;
    }

    /**
     * shipperCompAddr3 のセッターメソッドです。
     * 
     * @param shipperCompAddr3 shipperCompAddr3 に設定する
     */
    public void setShipperCompAddr3(String shipperCompAddr3) {
        this.shipperCompAddr3 = shipperCompAddr3;
    }

    /**
     * shipperCompAddr4 のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4
     */
    public String getShipperCompAddr4() {
        return shipperCompAddr4;
    }

    /**
     * shipperCompAddr4 のセッターメソッドです。
     * 
     * @param shipperCompAddr4 shipperCompAddr4 に設定する
     */
    public void setShipperCompAddr4(String shipperCompAddr4) {
        this.shipperCompAddr4 = shipperCompAddr4;
    }

    /**
     * shipperCompTel のゲッターメソッドです。
     * 
     * @return the shipperCompTel
     */
    public String getShipperCompTel() {
        return shipperCompTel;
    }

    /**
     * shipperCompTel のセッターメソッドです。
     * 
     * @param shipperCompTel shipperCompTel に設定する
     */
    public void setShipperCompTel(String shipperCompTel) {
        this.shipperCompTel = shipperCompTel;
    }

    /**
     * shipperCompFax のゲッターメソッドです。
     * 
     * @return the shipperCompFax
     */
    public String getShipperCompFax() {
        return shipperCompFax;
    }

    /**
     * shipperCompFax のセッターメソッドです。
     * 
     * @param shipperCompFax shipperCompFax に設定する
     */
    public void setShipperCompFax(String shipperCompFax) {
        this.shipperCompFax = shipperCompFax;
    }

    /**
     * consigneeCompNm1 のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1
     */
    public String getConsigneeCompNm1() {
        return consigneeCompNm1;
    }

    /**
     * consigneeCompNm1 のセッターメソッドです。
     * 
     * @param consigneeCompNm1 consigneeCompNm1 に設定する
     */
    public void setConsigneeCompNm1(String consigneeCompNm1) {
        this.consigneeCompNm1 = consigneeCompNm1;
    }

    /**
     * consigneeCompNm2 のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2
     */
    public String getConsigneeCompNm2() {
        return consigneeCompNm2;
    }

    /**
     * consigneeCompNm2 のセッターメソッドです。
     * 
     * @param consigneeCompNm2 consigneeCompNm2 に設定する
     */
    public void setConsigneeCompNm2(String consigneeCompNm2) {
        this.consigneeCompNm2 = consigneeCompNm2;
    }

    /**
     * consigneeCompAddr1 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1
     */
    public String getConsigneeCompAddr1() {
        return consigneeCompAddr1;
    }

    /**
     * consigneeCompAddr1 のセッターメソッドです。
     * 
     * @param consigneeCompAddr1 consigneeCompAddr1 に設定する
     */
    public void setConsigneeCompAddr1(String consigneeCompAddr1) {
        this.consigneeCompAddr1 = consigneeCompAddr1;
    }

    /**
     * consigneeCompAddr2 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2
     */
    public String getConsigneeCompAddr2() {
        return consigneeCompAddr2;
    }

    /**
     * consigneeCompAddr2 のセッターメソッドです。
     * 
     * @param consigneeCompAddr2 consigneeCompAddr2 に設定する
     */
    public void setConsigneeCompAddr2(String consigneeCompAddr2) {
        this.consigneeCompAddr2 = consigneeCompAddr2;
    }

    /**
     * consigneeCompAddr3 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3
     */
    public String getConsigneeCompAddr3() {
        return consigneeCompAddr3;
    }

    /**
     * consigneeCompAddr3 のセッターメソッドです。
     * 
     * @param consigneeCompAddr3 consigneeCompAddr3 に設定する
     */
    public void setConsigneeCompAddr3(String consigneeCompAddr3) {
        this.consigneeCompAddr3 = consigneeCompAddr3;
    }

    /**
     * consigneeCompAddr4 のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4
     */
    public String getConsigneeCompAddr4() {
        return consigneeCompAddr4;
    }

    /**
     * consigneeCompAddr4 のセッターメソッドです。
     * 
     * @param consigneeCompAddr4 consigneeCompAddr4 に設定する
     */
    public void setConsigneeCompAddr4(String consigneeCompAddr4) {
        this.consigneeCompAddr4 = consigneeCompAddr4;
    }

    /**
     * consigneeCompTel のゲッターメソッドです。
     * 
     * @return the consigneeCompTel
     */
    public String getConsigneeCompTel() {
        return consigneeCompTel;
    }

    /**
     * consigneeCompTel のセッターメソッドです。
     * 
     * @param consigneeCompTel consigneeCompTel に設定する
     */
    public void setConsigneeCompTel(String consigneeCompTel) {
        this.consigneeCompTel = consigneeCompTel;
    }

    /**
     * consigneeCompFax のゲッターメソッドです。
     * 
     * @return the consigneeCompFax
     */
    public String getConsigneeCompFax() {
        return consigneeCompFax;
    }

    /**
     * consigneeCompFax のセッターメソッドです。
     * 
     * @param consigneeCompFax consigneeCompFax に設定する
     */
    public void setConsigneeCompFax(String consigneeCompFax) {
        this.consigneeCompFax = consigneeCompFax;
    }

    /**
     * consigneeAttn のゲッターメソッドです。
     * 
     * @return the consigneeAttn
     */
    public String getConsigneeAttn() {
        return consigneeAttn;
    }

    /**
     * consigneeAttn のセッターメソッドです。
     * 
     * @param consigneeAttn consigneeAttn に設定する
     */
    public void setConsigneeAttn(String consigneeAttn) {
        this.consigneeAttn = consigneeAttn;
    }

    /**
     * shipToNm1 のゲッターメソッドです。
     * 
     * @return the shipToNm1
     */
    public String getShipToNm1() {
        return shipToNm1;
    }

    /**
     * shipToNm1 のセッターメソッドです。
     * 
     * @param shipToNm1 shipToNm1 に設定する
     */
    public void setShipToNm1(String shipToNm1) {
        this.shipToNm1 = shipToNm1;
    }

    /**
     * shipToNm2 のゲッターメソッドです。
     * 
     * @return the shipToNm2
     */
    public String getShipToNm2() {
        return shipToNm2;
    }

    /**
     * shipToNm2 のセッターメソッドです。
     * 
     * @param shipToNm2 shipToNm2 に設定する
     */
    public void setShipToNm2(String shipToNm2) {
        this.shipToNm2 = shipToNm2;
    }

    /**
     * shipToAddr1 のゲッターメソッドです。
     * 
     * @return the shipToAddr1
     */
    public String getShipToAddr1() {
        return shipToAddr1;
    }

    /**
     * shipToAddr1 のセッターメソッドです。
     * 
     * @param shipToAddr1 shipToAddr1 に設定する
     */
    public void setShipToAddr1(String shipToAddr1) {
        this.shipToAddr1 = shipToAddr1;
    }

    /**
     * shipToAddr2 のゲッターメソッドです。
     * 
     * @return the shipToAddr2
     */
    public String getShipToAddr2() {
        return shipToAddr2;
    }

    /**
     * shipToAddr2 のセッターメソッドです。
     * 
     * @param shipToAddr2 shipToAddr2 に設定する
     */
    public void setShipToAddr2(String shipToAddr2) {
        this.shipToAddr2 = shipToAddr2;
    }

    /**
     * shipToAddr3 のゲッターメソッドです。
     * 
     * @return the shipToAddr3
     */
    public String getShipToAddr3() {
        return shipToAddr3;
    }

    /**
     * shipToAddr3 のセッターメソッドです。
     * 
     * @param shipToAddr3 shipToAddr3 に設定する
     */
    public void setShipToAddr3(String shipToAddr3) {
        this.shipToAddr3 = shipToAddr3;
    }

    /**
     * shipToAddr4 のゲッターメソッドです。
     * 
     * @return the shipToAddr4
     */
    public String getShipToAddr4() {
        return shipToAddr4;
    }

    /**
     * shipToAddr4 のセッターメソッドです。
     * 
     * @param shipToAddr4 shipToAddr4 に設定する
     */
    public void setShipToAddr4(String shipToAddr4) {
        this.shipToAddr4 = shipToAddr4;
    }

    /**
     * shipToTel のゲッターメソッドです。
     * 
     * @return the shipToTel
     */
    public String getShipToTel() {
        return shipToTel;
    }

    /**
     * shipToTel のセッターメソッドです。
     * 
     * @param shipToTel shipToTel に設定する
     */
    public void setShipToTel(String shipToTel) {
        this.shipToTel = shipToTel;
    }

    /**
     * invoiceCtgry のゲッターメソッドです。
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry のセッターメソッドです。
     * 
     * @param invoiceCtgry invoiceCtgry に設定する
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * priceTerms のゲッターメソッドです。
     * 
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * priceTerms のセッターメソッドです。
     * 
     * @param priceTerms priceTerms に設定する
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * termsPoint のゲッターメソッドです。
     * 
     * @return the termsPoint
     */
    public String getTermsPoint() {
        return termsPoint;
    }

    /**
     * termsPoint のセッターメソッドです。
     * 
     * @param termsPoint termsPoint に設定する
     */
    public void setTermsPoint(String termsPoint) {
        this.termsPoint = termsPoint;
    }

    /**
     * payTerms のゲッターメソッドです。
     * 
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * payTerms のセッターメソッドです。
     * 
     * @param payTerms payTerms に設定する
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
    }

    /**
     * payMeth のゲッターメソッドです。
     * 
     * @return the payMeth
     */
    public String getPayMeth() {
        return payMeth;
    }

    /**
     * payMeth のセッターメソッドです。
     * 
     * @param payMeth payMeth に設定する
     */
    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
    }

    /**
     * reExpGoodsFlg のゲッターメソッドです。
     * 
     * @return the reExpGoodsFlg
     */
    public String getReExpGoodsFlg() {
        return reExpGoodsFlg;
    }

    /**
     * reExpGoodsFlg のセッターメソッドです。
     * 
     * @param reExpGoodsFlg reExpGoodsFlg に設定する
     */
    public void setReExpGoodsFlg(String reExpGoodsFlg) {
        this.reExpGoodsFlg = reExpGoodsFlg;
    }

    /**
     * supplierInvoiceNo のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNo
     */
    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    /**
     * supplierInvoiceNo のセッターメソッドです。
     * 
     * @param supplierInvoiceNo supplierInvoiceNo に設定する
     */
    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
    }

    /**
     * impInvoiceNo1 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1
     */
    public String getImpInvoiceNo1() {
        return impInvoiceNo1;
    }

    /**
     * impInvoiceNo1 のセッターメソッドです。
     * 
     * @param impInvoiceNo1 impInvoiceNo1 に設定する
     */
    public void setImpInvoiceNo1(String impInvoiceNo1) {
        this.impInvoiceNo1 = impInvoiceNo1;
    }

    /**
     * impInvoiceNo2 のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2
     */
    public String getImpInvoiceNo2() {
        return impInvoiceNo2;
    }

    /**
     * impInvoiceNo2 のセッターメソッドです。
     * 
     * @param impInvoiceNo2 impInvoiceNo2 に設定する
     */
    public void setImpInvoiceNo2(String impInvoiceNo2) {
        this.impInvoiceNo2 = impInvoiceNo2;
    }

    /**
     * freightResponsibleCd のゲッターメソッドです。
     * 
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * freightResponsibleCd のセッターメソッドです。
     * 
     * @param freightResponsibleCd freightResponsibleCd に設定する
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * migrationFlg のゲッターメソッドです。
     * 
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

    /**
     * migrationFlg のセッターメソッドです。
     * 
     * @param migrationFlg migrationFlg に設定する
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
    }

    /**
     * oldQrMixTyp のゲッターメソッドです。
     * 
     * @return the oldQrMixTyp
     */
    public String getOldQrMixTyp() {
        return oldQrMixTyp;
    }

    /**
     * oldQrMixTyp のセッターメソッドです。
     * 
     * @param oldQrMixTyp oldQrMixTyp に設定する
     */
    public void setOldQrMixTyp(String oldQrMixTyp) {
        this.oldQrMixTyp = oldQrMixTyp;
    }

    /**
     * oldQrContainerGrpCd のゲッターメソッドです。
     * 
     * @return the oldQrContainerGrpCd
     */
    public String getOldQrContainerGrpCd() {
        return oldQrContainerGrpCd;
    }

    /**
     * oldQrContainerGrpCd のセッターメソッドです。
     * 
     * @param oldQrContainerGrpCd oldQrContainerGrpCd に設定する
     */
    public void setOldQrContainerGrpCd(String oldQrContainerGrpCd) {
        this.oldQrContainerGrpCd = oldQrContainerGrpCd;
    }

    /**
     * palletCartonTyp のゲッターメソッドです。
     * 
     * @return the palletCartonTyp
     */
    public String getPalletCartonTyp() {
        return palletCartonTyp;
    }

    /**
     * palletCartonTyp のセッターメソッドです。
     * 
     * @param palletCartonTyp palletCartonTyp に設定する
     */
    public void setPalletCartonTyp(String palletCartonTyp) {
        this.palletCartonTyp = palletCartonTyp;
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
