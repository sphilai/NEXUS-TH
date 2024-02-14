/*
 * PROJECT：eca0027
 * 
 * TwInvoice のDomainクラス
 * テーブル概要：Invoice Work/インボイスワーク  Work table for creating Invoice information in the shopping basket system/買い物かご方式でInvoice情報を作成するためのワークテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/09/26  DNITS  新規作成
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
 * TwInvoice のDomainクラスです。<BR>
 * テーブル概要：Invoice Work/インボイスワーク  Work table for creating Invoice information in the shopping basket system/買い物かご方式でInvoice情報を作成するためのワークテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/09/26 16:19:23<BR>
 * 
 * テーブル定義から2016/09/26に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11085 $
 */
public class TwInvoiceDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * TEMP INVOICE NO/仮インボイスNO  連番
     */
    private String tempInvoiceNo;

    /**
     * INVOICE NO/インボイスNO  連番
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE/インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System
     */
    private String manualFlg;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")
     */
    private String manualTyp;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT
     */
    private String invoiceClass;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel
     */
    private String cancelTyp;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo
     */
    private String cancelInvoiceNo;

    /**
     * PARENT TEMP INVOICE NO/親_仮インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。
     */
    private String parTempInvoiceNo;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。
     */
    private String parInvoiceNo;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード
     */
    private String parInvoiceShipperCd;

    /**
     * PARENT INVOICE ISSUE DATE/親_インボイス発行日
     */
    private Date parInvoiceIssueDt;

    /**
     * RELATION TEMP INVOICE NO/関連_仮インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。
     */
    private String relateTempInvoiceNo;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。
     */
    private String relateInvoiceNo;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード
     */
    private String relateInvoiceShipperCd;

    /**
     * RELATION INVOICE ISSUE DATE/関連_インボイス発行日
     */
    private Date relateInvoiceIssueDt;

    /**
     * CONSIGNEE CODE/荷受人コード
     */
    private String consigneeCd;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード
     */
    private String frtShipperCd;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード
     */
    private String frtConsigneeCd;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード
     */
    private String shipToCompCd;

    /**
     * CUSTOMER CODE/得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO/LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value
     */
    private String invoiceCtgry;

    /**
     * INVOICE CATEGORY NAME/請求分類名
     */
    private String invoiceCtgryNm;

    /**
     * SHIPPED DATE/売上日
     */
    private Date shippedDt;

    /**
     * TRANSPORT CODE/輸送手段コード
     */
    private String trnsCd;

    /**
     * TRANSPORT NAME/輸送手段名
     */
    private String trnsNm;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段
     */
    private String trnsCdOrg;

    /**
     * ETD/出発予定日  船用TBLに分ける？
     */
    private Date etd;

    /**
     * ETA/到着予定日
     */
    private Date eta;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし
     */
    private String arrivalTime;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード
     */
    private String lPortCntryCd;

    /**
     * LOADING PORT CODE/出発港コード
     */
    private String loadingPortCd;

    /**
     * LOADING PORT NAME/出発港名
     */
    private String loadingPortNm;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード
     */
    private String dPortCntryCd;

    /**
     * DISCHARGE PORT CODE/到着港コード
     */
    private String dischargePortCd;

    /**
     * DISCHARGE PORT NAME/到着港名
     */
    private String dischargePortNm;

    /**
     * DELIVERY POINT/荷渡地
     */
    private String dlivPoint;

    /**
     * CARRIER COMPANY CODE/運送会社コード
     */
    private String carrierCompCd;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称
     */
    private String carrierCompNmAbb;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし
     */
    private String forwarderCompCd;

    /**
     * VESSEL/船
     */
    private String vessel;

    /**
     * BOOKING NO/予約NO
     */
    private String bookingNo;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect
     */
    private String freightResponsibleCd;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり
     */
    private String freightResponsibleNm;

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
     * PAYMENT METHOD NAME/支払方法名称
     */
    private String payMethNm;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C
     */
    private String remLcTyp;

    /**
     * REMITTANCE BANK NAME/送金先銀行名
     */
    private String remBankNm;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1
     */
    private String remBankAddress1;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2
     */
    private String remBankAddress2;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3
     */
    private String remBankAddress3;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号
     */
    private String remBankAccountNo;

    /**
     * L/C NUMBER/L/C数
     */
    private String lcNo;

    /**
     * LC DATE/L/C発行日
     */
    private Date lcDt;

    /**
     * LC BANK NAME 1/L/C 銀行名 1
     */
    private String lcBankNm1;

    /**
     * LC BANK NAME 2/L/C 銀行名 2
     */
    private String lcBankNm2;

    /**
     * CURRENCY CODE/通貨コード
     */
    private String currCd;

    /**
     * NET AMOUNT/ネット金額
     */
    private BigDecimal netAmount;

    /**
     * FREIGHT/運賃
     */
    private BigDecimal freight;

    /**
     * INSURANCE/保険金額
     */
    private BigDecimal insurance;

    /**
     * SUB TOTAL/小計  NET金額+運賃+保険金額
     */
    private BigDecimal subTotal;

    /**
     * VALUE ADDED TAX RATIO/付加価値税率
     */
    private BigDecimal vatRatio;

    /**
     * VALUE ADDED TAX/付加価値税
     */
    private BigDecimal vat;

    /**
     * HANDLING CHARGE/手数料
     */
    private BigDecimal handlingCharge;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード
     */
    private String additionalChargeCd;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名
     */
    private String additionalChargeNm;

    /**
     * ADDITIONAL CHARGE/追加料金
     */
    private BigDecimal additionalCharge;

    /**
     * TOTAL INVOICE AMOUNT/総インボイス金額  「SUB_TOTAL」+「付加価値税」+「手数料」+「追加料金」
     */
    private BigDecimal totalInvoiceAmount;

    /**
     * NO CHARGE/無償金額  請求分類（Invoice Category）がIntengible時のみセット。非製部品の子(無償)の数量*単価の合計金額をセット。
     */
    private BigDecimal noCharge;

    /**
     * CML/ITEM NO QUANTITY/CML/品番数量
     */
    private BigDecimal pltzItemQty;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * TOTAL NET WEIGHT/ネット総重量
     */
    private BigDecimal totalNetWeight;

    /**
     * TOTAL GROSS WEIGHT/グロス総重量
     */
    private BigDecimal totalGrossWeight;

    /**
     * VOLUME UNIT/容積単位
     */
    private String volumeUnit;

    /**
     * TOTAL VOLUME/総容積
     */
    private BigDecimal totalVolume;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO
     */
    private String invTplNo;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名
     */
    private String free1ColNm;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not
     */
    private String free1DispFlg;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名
     */
    private String free2ColNm;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not
     */
    private String free2DispFlg;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名
     */
    private String free3ColNm;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not
     */
    private String free3DispFlg;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名
     */
    private String free4ColNm;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not
     */
    private String free4DispFlg;

    /**
     * SP INFO/特記事項
     */
    private String spInfo;

    /**
     * APPROVAL POSITION/承認者役職
     */
    private String approvalPosition;

    /**
     * APPROVAL NAME/承認者名
     */
    private String approvalNm;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分  L:Loose, C:Full Container
     */
    private String containerLooseTyp;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous
     */
    private String cmlTyp;

    /**
     * INVOICE KEY/インボイスキー
     */
    private String invoiceKey;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要
     */
    private String notifyParty1CompCd;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要
     */
    private String notifyParty1CompNmAbb;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要
     */
    private String notifyParty1Nm;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要
     */
    private String notifyParty1Addr;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要
     */
    private String notifyParty2CompCd;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要
     */
    private String notifyParty2CompNmAbb;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要
     */
    private String notifyParty2Nm;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要
     */
    private String notifyParty2Addr;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要
     */
    private String notifyParty3CompCd;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要
     */
    private String notifyParty3CompNmAbb;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要
     */
    private String notifyParty3Nm;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要
     */
    private String notifyParty3Addr;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要
     */
    private String notifyParty4CompCd;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要
     */
    private String notifyParty4CompNmAbb;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要
     */
    private String notifyParty4Nm;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要
     */
    private String notifyParty4Addr;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録
     */
    private String shippingActNo;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  10:Imcomplete Doc Attach,
20:Complete Doc attach
(Registerd by Shipping Actuality function)
     */
    private String shippingActStatus;

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
     * SHIPPER TAX ID NO/荷主 TAX ID NO
     */
    private String shipperTaxIdNo;

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
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO
     */
    private String consigneeTaxIdNo;

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
     * CONTAINER NO 1/コンテナNO_1
     */
    private String containerNo1;

    /**
     * CONTAINER NO 2/コンテナNO_2
     */
    private String containerNo2;

    /**
     * CONTAINER NO 3/コンテナNO_3
     */
    private String containerNo3;

    /**
     * MANUAL INVOICE ISSUE DATE/マニュアルインボイス発行日
     */
    private Date manualInvoiceIssueDt;

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
    public TwInvoiceDomain() {
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
     * tempInvoiceNo のゲッターメソッドです。
     * 
     * @return the tempInvoiceNo
     */
    public String getTempInvoiceNo() {
        return tempInvoiceNo;
    }

    /**
     * tempInvoiceNo のセッターメソッドです。
     * 
     * @param tempInvoiceNo tempInvoiceNo に設定する
     */
    public void setTempInvoiceNo(String tempInvoiceNo) {
        this.tempInvoiceNo = tempInvoiceNo;
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
     * manualFlg のゲッターメソッドです。
     * 
     * @return the manualFlg
     */
    public String getManualFlg() {
        return manualFlg;
    }

    /**
     * manualFlg のセッターメソッドです。
     * 
     * @param manualFlg manualFlg に設定する
     */
    public void setManualFlg(String manualFlg) {
        this.manualFlg = manualFlg;
    }

    /**
     * manualTyp のゲッターメソッドです。
     * 
     * @return the manualTyp
     */
    public String getManualTyp() {
        return manualTyp;
    }

    /**
     * manualTyp のセッターメソッドです。
     * 
     * @param manualTyp manualTyp に設定する
     */
    public void setManualTyp(String manualTyp) {
        this.manualTyp = manualTyp;
    }

    /**
     * invoiceClass のゲッターメソッドです。
     * 
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * invoiceClass のセッターメソッドです。
     * 
     * @param invoiceClass invoiceClass に設定する
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * cancelTyp のゲッターメソッドです。
     * 
     * @return the cancelTyp
     */
    public String getCancelTyp() {
        return cancelTyp;
    }

    /**
     * cancelTyp のセッターメソッドです。
     * 
     * @param cancelTyp cancelTyp に設定する
     */
    public void setCancelTyp(String cancelTyp) {
        this.cancelTyp = cancelTyp;
    }

    /**
     * cancelInvoiceNo のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNo
     */
    public String getCancelInvoiceNo() {
        return cancelInvoiceNo;
    }

    /**
     * cancelInvoiceNo のセッターメソッドです。
     * 
     * @param cancelInvoiceNo cancelInvoiceNo に設定する
     */
    public void setCancelInvoiceNo(String cancelInvoiceNo) {
        this.cancelInvoiceNo = cancelInvoiceNo;
    }

    /**
     * parTempInvoiceNo のゲッターメソッドです。
     * 
     * @return the parTempInvoiceNo
     */
    public String getParTempInvoiceNo() {
        return parTempInvoiceNo;
    }

    /**
     * parTempInvoiceNo のセッターメソッドです。
     * 
     * @param parTempInvoiceNo parTempInvoiceNo に設定する
     */
    public void setParTempInvoiceNo(String parTempInvoiceNo) {
        this.parTempInvoiceNo = parTempInvoiceNo;
    }

    /**
     * parInvoiceNo のゲッターメソッドです。
     * 
     * @return the parInvoiceNo
     */
    public String getParInvoiceNo() {
        return parInvoiceNo;
    }

    /**
     * parInvoiceNo のセッターメソッドです。
     * 
     * @param parInvoiceNo parInvoiceNo に設定する
     */
    public void setParInvoiceNo(String parInvoiceNo) {
        this.parInvoiceNo = parInvoiceNo;
    }

    /**
     * parInvoiceShipperCd のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCd
     */
    public String getParInvoiceShipperCd() {
        return parInvoiceShipperCd;
    }

    /**
     * parInvoiceShipperCd のセッターメソッドです。
     * 
     * @param parInvoiceShipperCd parInvoiceShipperCd に設定する
     */
    public void setParInvoiceShipperCd(String parInvoiceShipperCd) {
        this.parInvoiceShipperCd = parInvoiceShipperCd;
    }

    /**
     * parInvoiceIssueDt のゲッターメソッドです。
     * 
     * @return the parInvoiceIssueDt
     */
    public Date getParInvoiceIssueDt() {
        return parInvoiceIssueDt;
    }

    /**
     * parInvoiceIssueDt のセッターメソッドです。
     * 
     * @param parInvoiceIssueDt parInvoiceIssueDt に設定する
     */
    public void setParInvoiceIssueDt(Date parInvoiceIssueDt) {
        this.parInvoiceIssueDt = parInvoiceIssueDt;
    }

    /**
     * relateTempInvoiceNo のゲッターメソッドです。
     * 
     * @return the relateTempInvoiceNo
     */
    public String getRelateTempInvoiceNo() {
        return relateTempInvoiceNo;
    }

    /**
     * relateTempInvoiceNo のセッターメソッドです。
     * 
     * @param relateTempInvoiceNo relateTempInvoiceNo に設定する
     */
    public void setRelateTempInvoiceNo(String relateTempInvoiceNo) {
        this.relateTempInvoiceNo = relateTempInvoiceNo;
    }

    /**
     * relateInvoiceNo のゲッターメソッドです。
     * 
     * @return the relateInvoiceNo
     */
    public String getRelateInvoiceNo() {
        return relateInvoiceNo;
    }

    /**
     * relateInvoiceNo のセッターメソッドです。
     * 
     * @param relateInvoiceNo relateInvoiceNo に設定する
     */
    public void setRelateInvoiceNo(String relateInvoiceNo) {
        this.relateInvoiceNo = relateInvoiceNo;
    }

    /**
     * relateInvoiceShipperCd のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCd
     */
    public String getRelateInvoiceShipperCd() {
        return relateInvoiceShipperCd;
    }

    /**
     * relateInvoiceShipperCd のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCd relateInvoiceShipperCd に設定する
     */
    public void setRelateInvoiceShipperCd(String relateInvoiceShipperCd) {
        this.relateInvoiceShipperCd = relateInvoiceShipperCd;
    }

    /**
     * relateInvoiceIssueDt のゲッターメソッドです。
     * 
     * @return the relateInvoiceIssueDt
     */
    public Date getRelateInvoiceIssueDt() {
        return relateInvoiceIssueDt;
    }

    /**
     * relateInvoiceIssueDt のセッターメソッドです。
     * 
     * @param relateInvoiceIssueDt relateInvoiceIssueDt に設定する
     */
    public void setRelateInvoiceIssueDt(Date relateInvoiceIssueDt) {
        this.relateInvoiceIssueDt = relateInvoiceIssueDt;
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
     * frtShipperCd のゲッターメソッドです。
     * 
     * @return the frtShipperCd
     */
    public String getFrtShipperCd() {
        return frtShipperCd;
    }

    /**
     * frtShipperCd のセッターメソッドです。
     * 
     * @param frtShipperCd frtShipperCd に設定する
     */
    public void setFrtShipperCd(String frtShipperCd) {
        this.frtShipperCd = frtShipperCd;
    }

    /**
     * frtConsigneeCd のゲッターメソッドです。
     * 
     * @return the frtConsigneeCd
     */
    public String getFrtConsigneeCd() {
        return frtConsigneeCd;
    }

    /**
     * frtConsigneeCd のセッターメソッドです。
     * 
     * @param frtConsigneeCd frtConsigneeCd に設定する
     */
    public void setFrtConsigneeCd(String frtConsigneeCd) {
        this.frtConsigneeCd = frtConsigneeCd;
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
     * shipToCompCd のゲッターメソッドです。
     * 
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * shipToCompCd のセッターメソッドです。
     * 
     * @param shipToCompCd shipToCompCd に設定する
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * invoiceCtgryNm のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNm
     */
    public String getInvoiceCtgryNm() {
        return invoiceCtgryNm;
    }

    /**
     * invoiceCtgryNm のセッターメソッドです。
     * 
     * @param invoiceCtgryNm invoiceCtgryNm に設定する
     */
    public void setInvoiceCtgryNm(String invoiceCtgryNm) {
        this.invoiceCtgryNm = invoiceCtgryNm;
    }

    /**
     * shippedDt のゲッターメソッドです。
     * 
     * @return the shippedDt
     */
    public Date getShippedDt() {
        return shippedDt;
    }

    /**
     * shippedDt のセッターメソッドです。
     * 
     * @param shippedDt shippedDt に設定する
     */
    public void setShippedDt(Date shippedDt) {
        this.shippedDt = shippedDt;
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
     * trnsNm のゲッターメソッドです。
     * 
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * trnsNm のセッターメソッドです。
     * 
     * @param trnsNm trnsNm に設定する
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
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
     * eta のゲッターメソッドです。
     * 
     * @return the eta
     */
    public Date getEta() {
        return eta;
    }

    /**
     * eta のセッターメソッドです。
     * 
     * @param eta eta に設定する
     */
    public void setEta(Date eta) {
        this.eta = eta;
    }

    /**
     * arrivalTime のゲッターメソッドです。
     * 
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTime のセッターメソッドです。
     * 
     * @param arrivalTime arrivalTime に設定する
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * lPortCntryCd のゲッターメソッドです。
     * 
     * @return the lPortCntryCd
     */
    public String getLPortCntryCd() {
        return lPortCntryCd;
    }

    /**
     * lPortCntryCd のセッターメソッドです。
     * 
     * @param lPortCntryCd lPortCntryCd に設定する
     */
    public void setLPortCntryCd(String lPortCntryCd) {
        this.lPortCntryCd = lPortCntryCd;
    }

    /**
     * loadingPortCd のゲッターメソッドです。
     * 
     * @return the loadingPortCd
     */
    public String getLoadingPortCd() {
        return loadingPortCd;
    }

    /**
     * loadingPortCd のセッターメソッドです。
     * 
     * @param loadingPortCd loadingPortCd に設定する
     */
    public void setLoadingPortCd(String loadingPortCd) {
        this.loadingPortCd = loadingPortCd;
    }

    /**
     * loadingPortNm のゲッターメソッドです。
     * 
     * @return the loadingPortNm
     */
    public String getLoadingPortNm() {
        return loadingPortNm;
    }

    /**
     * loadingPortNm のセッターメソッドです。
     * 
     * @param loadingPortNm loadingPortNm に設定する
     */
    public void setLoadingPortNm(String loadingPortNm) {
        this.loadingPortNm = loadingPortNm;
    }

    /**
     * dPortCntryCd のゲッターメソッドです。
     * 
     * @return the dPortCntryCd
     */
    public String getDPortCntryCd() {
        return dPortCntryCd;
    }

    /**
     * dPortCntryCd のセッターメソッドです。
     * 
     * @param dPortCntryCd dPortCntryCd に設定する
     */
    public void setDPortCntryCd(String dPortCntryCd) {
        this.dPortCntryCd = dPortCntryCd;
    }

    /**
     * dischargePortCd のゲッターメソッドです。
     * 
     * @return the dischargePortCd
     */
    public String getDischargePortCd() {
        return dischargePortCd;
    }

    /**
     * dischargePortCd のセッターメソッドです。
     * 
     * @param dischargePortCd dischargePortCd に設定する
     */
    public void setDischargePortCd(String dischargePortCd) {
        this.dischargePortCd = dischargePortCd;
    }

    /**
     * dischargePortNm のゲッターメソッドです。
     * 
     * @return the dischargePortNm
     */
    public String getDischargePortNm() {
        return dischargePortNm;
    }

    /**
     * dischargePortNm のセッターメソッドです。
     * 
     * @param dischargePortNm dischargePortNm に設定する
     */
    public void setDischargePortNm(String dischargePortNm) {
        this.dischargePortNm = dischargePortNm;
    }

    /**
     * dlivPoint のゲッターメソッドです。
     * 
     * @return the dlivPoint
     */
    public String getDlivPoint() {
        return dlivPoint;
    }

    /**
     * dlivPoint のセッターメソッドです。
     * 
     * @param dlivPoint dlivPoint に設定する
     */
    public void setDlivPoint(String dlivPoint) {
        this.dlivPoint = dlivPoint;
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
     * carrierCompNmAbb のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbb
     */
    public String getCarrierCompNmAbb() {
        return carrierCompNmAbb;
    }

    /**
     * carrierCompNmAbb のセッターメソッドです。
     * 
     * @param carrierCompNmAbb carrierCompNmAbb に設定する
     */
    public void setCarrierCompNmAbb(String carrierCompNmAbb) {
        this.carrierCompNmAbb = carrierCompNmAbb;
    }

    /**
     * forwarderCompCd のゲッターメソッドです。
     * 
     * @return the forwarderCompCd
     */
    public String getForwarderCompCd() {
        return forwarderCompCd;
    }

    /**
     * forwarderCompCd のセッターメソッドです。
     * 
     * @param forwarderCompCd forwarderCompCd に設定する
     */
    public void setForwarderCompCd(String forwarderCompCd) {
        this.forwarderCompCd = forwarderCompCd;
    }

    /**
     * vessel のゲッターメソッドです。
     * 
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * vessel のセッターメソッドです。
     * 
     * @param vessel vessel に設定する
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    /**
     * bookingNo のゲッターメソッドです。
     * 
     * @return the bookingNo
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * bookingNo のセッターメソッドです。
     * 
     * @param bookingNo bookingNo に設定する
     */
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
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
     * freightResponsibleNm のゲッターメソッドです。
     * 
     * @return the freightResponsibleNm
     */
    public String getFreightResponsibleNm() {
        return freightResponsibleNm;
    }

    /**
     * freightResponsibleNm のセッターメソッドです。
     * 
     * @param freightResponsibleNm freightResponsibleNm に設定する
     */
    public void setFreightResponsibleNm(String freightResponsibleNm) {
        this.freightResponsibleNm = freightResponsibleNm;
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
     * payMethNm のゲッターメソッドです。
     * 
     * @return the payMethNm
     */
    public String getPayMethNm() {
        return payMethNm;
    }

    /**
     * payMethNm のセッターメソッドです。
     * 
     * @param payMethNm payMethNm に設定する
     */
    public void setPayMethNm(String payMethNm) {
        this.payMethNm = payMethNm;
    }

    /**
     * remLcTyp のゲッターメソッドです。
     * 
     * @return the remLcTyp
     */
    public String getRemLcTyp() {
        return remLcTyp;
    }

    /**
     * remLcTyp のセッターメソッドです。
     * 
     * @param remLcTyp remLcTyp に設定する
     */
    public void setRemLcTyp(String remLcTyp) {
        this.remLcTyp = remLcTyp;
    }

    /**
     * remBankNm のゲッターメソッドです。
     * 
     * @return the remBankNm
     */
    public String getRemBankNm() {
        return remBankNm;
    }

    /**
     * remBankNm のセッターメソッドです。
     * 
     * @param remBankNm remBankNm に設定する
     */
    public void setRemBankNm(String remBankNm) {
        this.remBankNm = remBankNm;
    }

    /**
     * remBankAddress1 のゲッターメソッドです。
     * 
     * @return the remBankAddress1
     */
    public String getRemBankAddress1() {
        return remBankAddress1;
    }

    /**
     * remBankAddress1 のセッターメソッドです。
     * 
     * @param remBankAddress1 remBankAddress1 に設定する
     */
    public void setRemBankAddress1(String remBankAddress1) {
        this.remBankAddress1 = remBankAddress1;
    }

    /**
     * remBankAddress2 のゲッターメソッドです。
     * 
     * @return the remBankAddress2
     */
    public String getRemBankAddress2() {
        return remBankAddress2;
    }

    /**
     * remBankAddress2 のセッターメソッドです。
     * 
     * @param remBankAddress2 remBankAddress2 に設定する
     */
    public void setRemBankAddress2(String remBankAddress2) {
        this.remBankAddress2 = remBankAddress2;
    }

    /**
     * remBankAddress3 のゲッターメソッドです。
     * 
     * @return the remBankAddress3
     */
    public String getRemBankAddress3() {
        return remBankAddress3;
    }

    /**
     * remBankAddress3 のセッターメソッドです。
     * 
     * @param remBankAddress3 remBankAddress3 に設定する
     */
    public void setRemBankAddress3(String remBankAddress3) {
        this.remBankAddress3 = remBankAddress3;
    }

    /**
     * remBankAccountNo のゲッターメソッドです。
     * 
     * @return the remBankAccountNo
     */
    public String getRemBankAccountNo() {
        return remBankAccountNo;
    }

    /**
     * remBankAccountNo のセッターメソッドです。
     * 
     * @param remBankAccountNo remBankAccountNo に設定する
     */
    public void setRemBankAccountNo(String remBankAccountNo) {
        this.remBankAccountNo = remBankAccountNo;
    }

    /**
     * lcNo のゲッターメソッドです。
     * 
     * @return the lcNo
     */
    public String getLcNo() {
        return lcNo;
    }

    /**
     * lcNo のセッターメソッドです。
     * 
     * @param lcNo lcNo に設定する
     */
    public void setLcNo(String lcNo) {
        this.lcNo = lcNo;
    }

    /**
     * lcDt のゲッターメソッドです。
     * 
     * @return the lcDt
     */
    public Date getLcDt() {
        return lcDt;
    }

    /**
     * lcDt のセッターメソッドです。
     * 
     * @param lcDt lcDt に設定する
     */
    public void setLcDt(Date lcDt) {
        this.lcDt = lcDt;
    }

    /**
     * lcBankNm1 のゲッターメソッドです。
     * 
     * @return the lcBankNm1
     */
    public String getLcBankNm1() {
        return lcBankNm1;
    }

    /**
     * lcBankNm1 のセッターメソッドです。
     * 
     * @param lcBankNm1 lcBankNm1 に設定する
     */
    public void setLcBankNm1(String lcBankNm1) {
        this.lcBankNm1 = lcBankNm1;
    }

    /**
     * lcBankNm2 のゲッターメソッドです。
     * 
     * @return the lcBankNm2
     */
    public String getLcBankNm2() {
        return lcBankNm2;
    }

    /**
     * lcBankNm2 のセッターメソッドです。
     * 
     * @param lcBankNm2 lcBankNm2 に設定する
     */
    public void setLcBankNm2(String lcBankNm2) {
        this.lcBankNm2 = lcBankNm2;
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
     * netAmount のゲッターメソッドです。
     * 
     * @return the netAmount
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * netAmount のセッターメソッドです。
     * 
     * @param netAmount netAmount に設定する
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * freight のゲッターメソッドです。
     * 
     * @return the freight
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * freight のセッターメソッドです。
     * 
     * @param freight freight に設定する
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * insurance のゲッターメソッドです。
     * 
     * @return the insurance
     */
    public BigDecimal getInsurance() {
        return insurance;
    }

    /**
     * insurance のセッターメソッドです。
     * 
     * @param insurance insurance に設定する
     */
    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    /**
     * subTotal のゲッターメソッドです。
     * 
     * @return the subTotal
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * subTotal のセッターメソッドです。
     * 
     * @param subTotal subTotal に設定する
     */
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * vatRatio のゲッターメソッドです。
     * 
     * @return the vatRatio
     */
    public BigDecimal getVatRatio() {
        return vatRatio;
    }

    /**
     * vatRatio のセッターメソッドです。
     * 
     * @param vatRatio vatRatio に設定する
     */
    public void setVatRatio(BigDecimal vatRatio) {
        this.vatRatio = vatRatio;
    }

    /**
     * vat のゲッターメソッドです。
     * 
     * @return the vat
     */
    public BigDecimal getVat() {
        return vat;
    }

    /**
     * vat のセッターメソッドです。
     * 
     * @param vat vat に設定する
     */
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    /**
     * handlingCharge のゲッターメソッドです。
     * 
     * @return the handlingCharge
     */
    public BigDecimal getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * handlingCharge のセッターメソッドです。
     * 
     * @param handlingCharge handlingCharge に設定する
     */
    public void setHandlingCharge(BigDecimal handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    /**
     * additionalChargeCd のゲッターメソッドです。
     * 
     * @return the additionalChargeCd
     */
    public String getAdditionalChargeCd() {
        return additionalChargeCd;
    }

    /**
     * additionalChargeCd のセッターメソッドです。
     * 
     * @param additionalChargeCd additionalChargeCd に設定する
     */
    public void setAdditionalChargeCd(String additionalChargeCd) {
        this.additionalChargeCd = additionalChargeCd;
    }

    /**
     * additionalChargeNm のゲッターメソッドです。
     * 
     * @return the additionalChargeNm
     */
    public String getAdditionalChargeNm() {
        return additionalChargeNm;
    }

    /**
     * additionalChargeNm のセッターメソッドです。
     * 
     * @param additionalChargeNm additionalChargeNm に設定する
     */
    public void setAdditionalChargeNm(String additionalChargeNm) {
        this.additionalChargeNm = additionalChargeNm;
    }

    /**
     * additionalCharge のゲッターメソッドです。
     * 
     * @return the additionalCharge
     */
    public BigDecimal getAdditionalCharge() {
        return additionalCharge;
    }

    /**
     * additionalCharge のセッターメソッドです。
     * 
     * @param additionalCharge additionalCharge に設定する
     */
    public void setAdditionalCharge(BigDecimal additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    /**
     * totalInvoiceAmount のゲッターメソッドです。
     * 
     * @return the totalInvoiceAmount
     */
    public BigDecimal getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * totalInvoiceAmount のセッターメソッドです。
     * 
     * @param totalInvoiceAmount totalInvoiceAmount に設定する
     */
    public void setTotalInvoiceAmount(BigDecimal totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    /**
     * noCharge のゲッターメソッドです。
     * 
     * @return the noCharge
     */
    public BigDecimal getNoCharge() {
        return noCharge;
    }

    /**
     * noCharge のセッターメソッドです。
     * 
     * @param noCharge noCharge に設定する
     */
    public void setNoCharge(BigDecimal noCharge) {
        this.noCharge = noCharge;
    }

    /**
     * pltzItemQty のゲッターメソッドです。
     * 
     * @return the pltzItemQty
     */
    public BigDecimal getPltzItemQty() {
        return pltzItemQty;
    }

    /**
     * pltzItemQty のセッターメソッドです。
     * 
     * @param pltzItemQty pltzItemQty に設定する
     */
    public void setPltzItemQty(BigDecimal pltzItemQty) {
        this.pltzItemQty = pltzItemQty;
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
     * totalNetWeight のゲッターメソッドです。
     * 
     * @return the totalNetWeight
     */
    public BigDecimal getTotalNetWeight() {
        return totalNetWeight;
    }

    /**
     * totalNetWeight のセッターメソッドです。
     * 
     * @param totalNetWeight totalNetWeight に設定する
     */
    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    /**
     * totalGrossWeight のゲッターメソッドです。
     * 
     * @return the totalGrossWeight
     */
    public BigDecimal getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * totalGrossWeight のセッターメソッドです。
     * 
     * @param totalGrossWeight totalGrossWeight に設定する
     */
    public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
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
     * totalVolume のゲッターメソッドです。
     * 
     * @return the totalVolume
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * totalVolume のセッターメソッドです。
     * 
     * @param totalVolume totalVolume に設定する
     */
    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    /**
     * invTplNo のゲッターメソッドです。
     * 
     * @return the invTplNo
     */
    public String getInvTplNo() {
        return invTplNo;
    }

    /**
     * invTplNo のセッターメソッドです。
     * 
     * @param invTplNo invTplNo に設定する
     */
    public void setInvTplNo(String invTplNo) {
        this.invTplNo = invTplNo;
    }

    /**
     * free1ColNm のゲッターメソッドです。
     * 
     * @return the free1ColNm
     */
    public String getFree1ColNm() {
        return free1ColNm;
    }

    /**
     * free1ColNm のセッターメソッドです。
     * 
     * @param free1ColNm free1ColNm に設定する
     */
    public void setFree1ColNm(String free1ColNm) {
        this.free1ColNm = free1ColNm;
    }

    /**
     * free1DispFlg のゲッターメソッドです。
     * 
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * free1DispFlg のセッターメソッドです。
     * 
     * @param free1DispFlg free1DispFlg に設定する
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * free2ColNm のゲッターメソッドです。
     * 
     * @return the free2ColNm
     */
    public String getFree2ColNm() {
        return free2ColNm;
    }

    /**
     * free2ColNm のセッターメソッドです。
     * 
     * @param free2ColNm free2ColNm に設定する
     */
    public void setFree2ColNm(String free2ColNm) {
        this.free2ColNm = free2ColNm;
    }

    /**
     * free2DispFlg のゲッターメソッドです。
     * 
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * free2DispFlg のセッターメソッドです。
     * 
     * @param free2DispFlg free2DispFlg に設定する
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * free3ColNm のゲッターメソッドです。
     * 
     * @return the free3ColNm
     */
    public String getFree3ColNm() {
        return free3ColNm;
    }

    /**
     * free3ColNm のセッターメソッドです。
     * 
     * @param free3ColNm free3ColNm に設定する
     */
    public void setFree3ColNm(String free3ColNm) {
        this.free3ColNm = free3ColNm;
    }

    /**
     * free3DispFlg のゲッターメソッドです。
     * 
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * free3DispFlg のセッターメソッドです。
     * 
     * @param free3DispFlg free3DispFlg に設定する
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * free4ColNm のゲッターメソッドです。
     * 
     * @return the free4ColNm
     */
    public String getFree4ColNm() {
        return free4ColNm;
    }

    /**
     * free4ColNm のセッターメソッドです。
     * 
     * @param free4ColNm free4ColNm に設定する
     */
    public void setFree4ColNm(String free4ColNm) {
        this.free4ColNm = free4ColNm;
    }

    /**
     * free4DispFlg のゲッターメソッドです。
     * 
     * @return the free4DispFlg
     */
    public String getFree4DispFlg() {
        return free4DispFlg;
    }

    /**
     * free4DispFlg のセッターメソッドです。
     * 
     * @param free4DispFlg free4DispFlg に設定する
     */
    public void setFree4DispFlg(String free4DispFlg) {
        this.free4DispFlg = free4DispFlg;
    }

    /**
     * spInfo のゲッターメソッドです。
     * 
     * @return the spInfo
     */
    public String getSpInfo() {
        return spInfo;
    }

    /**
     * spInfo のセッターメソッドです。
     * 
     * @param spInfo spInfo に設定する
     */
    public void setSpInfo(String spInfo) {
        this.spInfo = spInfo;
    }

    /**
     * approvalPosition のゲッターメソッドです。
     * 
     * @return the approvalPosition
     */
    public String getApprovalPosition() {
        return approvalPosition;
    }

    /**
     * approvalPosition のセッターメソッドです。
     * 
     * @param approvalPosition approvalPosition に設定する
     */
    public void setApprovalPosition(String approvalPosition) {
        this.approvalPosition = approvalPosition;
    }

    /**
     * approvalNm のゲッターメソッドです。
     * 
     * @return the approvalNm
     */
    public String getApprovalNm() {
        return approvalNm;
    }

    /**
     * approvalNm のセッターメソッドです。
     * 
     * @param approvalNm approvalNm に設定する
     */
    public void setApprovalNm(String approvalNm) {
        this.approvalNm = approvalNm;
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
     * notifyParty1CompCd のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCd
     */
    public String getNotifyParty1CompCd() {
        return notifyParty1CompCd;
    }

    /**
     * notifyParty1CompCd のセッターメソッドです。
     * 
     * @param notifyParty1CompCd notifyParty1CompCd に設定する
     */
    public void setNotifyParty1CompCd(String notifyParty1CompCd) {
        this.notifyParty1CompCd = notifyParty1CompCd;
    }

    /**
     * notifyParty1CompNmAbb のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbb
     */
    public String getNotifyParty1CompNmAbb() {
        return notifyParty1CompNmAbb;
    }

    /**
     * notifyParty1CompNmAbb のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbb notifyParty1CompNmAbb に設定する
     */
    public void setNotifyParty1CompNmAbb(String notifyParty1CompNmAbb) {
        this.notifyParty1CompNmAbb = notifyParty1CompNmAbb;
    }

    /**
     * notifyParty1Nm のゲッターメソッドです。
     * 
     * @return the notifyParty1Nm
     */
    public String getNotifyParty1Nm() {
        return notifyParty1Nm;
    }

    /**
     * notifyParty1Nm のセッターメソッドです。
     * 
     * @param notifyParty1Nm notifyParty1Nm に設定する
     */
    public void setNotifyParty1Nm(String notifyParty1Nm) {
        this.notifyParty1Nm = notifyParty1Nm;
    }

    /**
     * notifyParty1Addr のゲッターメソッドです。
     * 
     * @return the notifyParty1Addr
     */
    public String getNotifyParty1Addr() {
        return notifyParty1Addr;
    }

    /**
     * notifyParty1Addr のセッターメソッドです。
     * 
     * @param notifyParty1Addr notifyParty1Addr に設定する
     */
    public void setNotifyParty1Addr(String notifyParty1Addr) {
        this.notifyParty1Addr = notifyParty1Addr;
    }

    /**
     * notifyParty2CompCd のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCd
     */
    public String getNotifyParty2CompCd() {
        return notifyParty2CompCd;
    }

    /**
     * notifyParty2CompCd のセッターメソッドです。
     * 
     * @param notifyParty2CompCd notifyParty2CompCd に設定する
     */
    public void setNotifyParty2CompCd(String notifyParty2CompCd) {
        this.notifyParty2CompCd = notifyParty2CompCd;
    }

    /**
     * notifyParty2CompNmAbb のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbb
     */
    public String getNotifyParty2CompNmAbb() {
        return notifyParty2CompNmAbb;
    }

    /**
     * notifyParty2CompNmAbb のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbb notifyParty2CompNmAbb に設定する
     */
    public void setNotifyParty2CompNmAbb(String notifyParty2CompNmAbb) {
        this.notifyParty2CompNmAbb = notifyParty2CompNmAbb;
    }

    /**
     * notifyParty2Nm のゲッターメソッドです。
     * 
     * @return the notifyParty2Nm
     */
    public String getNotifyParty2Nm() {
        return notifyParty2Nm;
    }

    /**
     * notifyParty2Nm のセッターメソッドです。
     * 
     * @param notifyParty2Nm notifyParty2Nm に設定する
     */
    public void setNotifyParty2Nm(String notifyParty2Nm) {
        this.notifyParty2Nm = notifyParty2Nm;
    }

    /**
     * notifyParty2Addr のゲッターメソッドです。
     * 
     * @return the notifyParty2Addr
     */
    public String getNotifyParty2Addr() {
        return notifyParty2Addr;
    }

    /**
     * notifyParty2Addr のセッターメソッドです。
     * 
     * @param notifyParty2Addr notifyParty2Addr に設定する
     */
    public void setNotifyParty2Addr(String notifyParty2Addr) {
        this.notifyParty2Addr = notifyParty2Addr;
    }

    /**
     * notifyParty3CompCd のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCd
     */
    public String getNotifyParty3CompCd() {
        return notifyParty3CompCd;
    }

    /**
     * notifyParty3CompCd のセッターメソッドです。
     * 
     * @param notifyParty3CompCd notifyParty3CompCd に設定する
     */
    public void setNotifyParty3CompCd(String notifyParty3CompCd) {
        this.notifyParty3CompCd = notifyParty3CompCd;
    }

    /**
     * notifyParty3CompNmAbb のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbb
     */
    public String getNotifyParty3CompNmAbb() {
        return notifyParty3CompNmAbb;
    }

    /**
     * notifyParty3CompNmAbb のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbb notifyParty3CompNmAbb に設定する
     */
    public void setNotifyParty3CompNmAbb(String notifyParty3CompNmAbb) {
        this.notifyParty3CompNmAbb = notifyParty3CompNmAbb;
    }

    /**
     * notifyParty3Nm のゲッターメソッドです。
     * 
     * @return the notifyParty3Nm
     */
    public String getNotifyParty3Nm() {
        return notifyParty3Nm;
    }

    /**
     * notifyParty3Nm のセッターメソッドです。
     * 
     * @param notifyParty3Nm notifyParty3Nm に設定する
     */
    public void setNotifyParty3Nm(String notifyParty3Nm) {
        this.notifyParty3Nm = notifyParty3Nm;
    }

    /**
     * notifyParty3Addr のゲッターメソッドです。
     * 
     * @return the notifyParty3Addr
     */
    public String getNotifyParty3Addr() {
        return notifyParty3Addr;
    }

    /**
     * notifyParty3Addr のセッターメソッドです。
     * 
     * @param notifyParty3Addr notifyParty3Addr に設定する
     */
    public void setNotifyParty3Addr(String notifyParty3Addr) {
        this.notifyParty3Addr = notifyParty3Addr;
    }

    /**
     * notifyParty4CompCd のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCd
     */
    public String getNotifyParty4CompCd() {
        return notifyParty4CompCd;
    }

    /**
     * notifyParty4CompCd のセッターメソッドです。
     * 
     * @param notifyParty4CompCd notifyParty4CompCd に設定する
     */
    public void setNotifyParty4CompCd(String notifyParty4CompCd) {
        this.notifyParty4CompCd = notifyParty4CompCd;
    }

    /**
     * notifyParty4CompNmAbb のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbb
     */
    public String getNotifyParty4CompNmAbb() {
        return notifyParty4CompNmAbb;
    }

    /**
     * notifyParty4CompNmAbb のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbb notifyParty4CompNmAbb に設定する
     */
    public void setNotifyParty4CompNmAbb(String notifyParty4CompNmAbb) {
        this.notifyParty4CompNmAbb = notifyParty4CompNmAbb;
    }

    /**
     * notifyParty4Nm のゲッターメソッドです。
     * 
     * @return the notifyParty4Nm
     */
    public String getNotifyParty4Nm() {
        return notifyParty4Nm;
    }

    /**
     * notifyParty4Nm のセッターメソッドです。
     * 
     * @param notifyParty4Nm notifyParty4Nm に設定する
     */
    public void setNotifyParty4Nm(String notifyParty4Nm) {
        this.notifyParty4Nm = notifyParty4Nm;
    }

    /**
     * notifyParty4Addr のゲッターメソッドです。
     * 
     * @return the notifyParty4Addr
     */
    public String getNotifyParty4Addr() {
        return notifyParty4Addr;
    }

    /**
     * notifyParty4Addr のセッターメソッドです。
     * 
     * @param notifyParty4Addr notifyParty4Addr に設定する
     */
    public void setNotifyParty4Addr(String notifyParty4Addr) {
        this.notifyParty4Addr = notifyParty4Addr;
    }

    /**
     * shippingActNo のゲッターメソッドです。
     * 
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * shippingActNo のセッターメソッドです。
     * 
     * @param shippingActNo shippingActNo に設定する
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }

    /**
     * shippingActStatus のゲッターメソッドです。
     * 
     * @return the shippingActStatus
     */
    public String getShippingActStatus() {
        return shippingActStatus;
    }

    /**
     * shippingActStatus のセッターメソッドです。
     * 
     * @param shippingActStatus shippingActStatus に設定する
     */
    public void setShippingActStatus(String shippingActStatus) {
        this.shippingActStatus = shippingActStatus;
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
     * shipperTaxIdNo のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNo
     */
    public String getShipperTaxIdNo() {
        return shipperTaxIdNo;
    }

    /**
     * shipperTaxIdNo のセッターメソッドです。
     * 
     * @param shipperTaxIdNo shipperTaxIdNo に設定する
     */
    public void setShipperTaxIdNo(String shipperTaxIdNo) {
        this.shipperTaxIdNo = shipperTaxIdNo;
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
     * consigneeTaxIdNo のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNo
     */
    public String getConsigneeTaxIdNo() {
        return consigneeTaxIdNo;
    }

    /**
     * consigneeTaxIdNo のセッターメソッドです。
     * 
     * @param consigneeTaxIdNo consigneeTaxIdNo に設定する
     */
    public void setConsigneeTaxIdNo(String consigneeTaxIdNo) {
        this.consigneeTaxIdNo = consigneeTaxIdNo;
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
     * containerNo1 のゲッターメソッドです。
     * 
     * @return the containerNo1
     */
    public String getContainerNo1() {
        return containerNo1;
    }

    /**
     * containerNo1 のセッターメソッドです。
     * 
     * @param containerNo1 containerNo1 に設定する
     */
    public void setContainerNo1(String containerNo1) {
        this.containerNo1 = containerNo1;
    }

    /**
     * containerNo2 のゲッターメソッドです。
     * 
     * @return the containerNo2
     */
    public String getContainerNo2() {
        return containerNo2;
    }

    /**
     * containerNo2 のセッターメソッドです。
     * 
     * @param containerNo2 containerNo2 に設定する
     */
    public void setContainerNo2(String containerNo2) {
        this.containerNo2 = containerNo2;
    }

    /**
     * containerNo3 のゲッターメソッドです。
     * 
     * @return the containerNo3
     */
    public String getContainerNo3() {
        return containerNo3;
    }

    /**
     * containerNo3 のセッターメソッドです。
     * 
     * @param containerNo3 containerNo3 に設定する
     */
    public void setContainerNo3(String containerNo3) {
        this.containerNo3 = containerNo3;
    }

    /**
     * manualInvoiceIssueDt のゲッターメソッドです。
     * 
     * @return the manualInvoiceIssueDt
     */
    public Date getManualInvoiceIssueDt() {
        return manualInvoiceIssueDt;
    }

    /**
     * manualInvoiceIssueDt のセッターメソッドです。
     * 
     * @param manualInvoiceIssueDt manualInvoiceIssueDt に設定する
     */
    public void setManualInvoiceIssueDt(Date manualInvoiceIssueDt) {
        this.manualInvoiceIssueDt = manualInvoiceIssueDt;
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
