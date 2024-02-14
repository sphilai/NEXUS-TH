/*
 * PROJECT：eca0027
 * 
 * TtInvoice の検索条件Domainクラス
 * テーブル概要：Invoice/インボイス  Table that holds the information of Invoice is a statement of delivery the hardware needed to export clearance/輸出通関に必要な納品書類であるInvoiceの情報を保持するテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/09/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TtInvoice の検索条件Domainクラスです。<BR>
 * テーブル概要：Invoice/インボイス  Table that holds the information of Invoice is a statement of delivery the hardware needed to export clearance/輸出通関に必要な納品書類であるInvoiceの情報を保持するテーブル<BR>
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
public class TtInvoiceCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

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
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled
     */
    private String cancelFlg;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel
     */
    private String cancelTyp;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo
     */
    private String cancelInvoiceNo;

    /**
     * CANCEL INVOICE ISSUE DATE/キャンセル前インボイス発行日
     */
    private Date cancelInvoiceIssueDt;

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
     * CONTAINER LOOSE TYPE/コンテナルーズ区分
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
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録
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
     * INVOICE ISSUER ID/インボイス発行者DSC-ID
     */
    private String invoiceIssuerId;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名
     */
    private String invoiceIssuerNm;

    /**
     * MANUAL INVOICE ISSUE DATE/マニュアルインボイス発行日
     */
    private Date manualInvoiceIssueDt;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted
     */
    private String deleteFlg;

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
     * SHIPPER CODE/荷主コード（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER CODE/荷主コード（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER CODE/荷主コード（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER CODE/荷主コード（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER CODE/荷主コード（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * INVOICE NO/インボイスNO  連番（大なり）
     */
    private String invoiceNoGreaterThan;

    /**
     * INVOICE NO/インボイスNO  連番（大なりイコール）
     */
    private String invoiceNoGreaterThanEqual;

    /**
     * INVOICE NO/インボイスNO  連番（小なり）
     */
    private String invoiceNoLessThan;

    /**
     * INVOICE NO/インボイスNO  連番（小なりイコール）
     */
    private String invoiceNoLessThanEqual;

    /**
     * INVOICE NO/インボイスNO  連番（前方一致）
     */
    private String invoiceNoLikeFront;

    /**
     * INVOICE ISSUE DATE/インボイス発行日（大なりイコール）
     */
    private Date invoiceIssueDtGreaterThanEqual;

    /**
     * INVOICE ISSUE DATE/インボイス発行日（小なりイコール）
     */
    private Date invoiceIssueDtLessThanEqual;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System（大なり）
     */
    private String manualFlgGreaterThan;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System（大なりイコール）
     */
    private String manualFlgGreaterThanEqual;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System（小なり）
     */
    private String manualFlgLessThan;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System（小なりイコール）
     */
    private String manualFlgLessThanEqual;

    /**
     * MANUAL FLAG/マニュアルフラグ  Y:Manual, N:Auto by System（前方一致）
     */
    private String manualFlgLikeFront;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")（大なり）
     */
    private String manualTypGreaterThan;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")（大なりイコール）
     */
    private String manualTypGreaterThanEqual;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")（小なり）
     */
    private String manualTypLessThan;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")（小なりイコール）
     */
    private String manualTypLessThanEqual;

    /**
     * MANUAL TYPE/マニュアル作成種別  1:Re-Invoice,
2:Non DN-G Invoice,
3:DN-G Invoice(It is set only if manual flag "Y")（前方一致）
     */
    private String manualTypLikeFront;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT（大なり）
     */
    private String invoiceClassGreaterThan;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT（大なりイコール）
     */
    private String invoiceClassGreaterThanEqual;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT（小なり）
     */
    private String invoiceClassLessThan;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT（小なりイコール）
     */
    private String invoiceClassLessThanEqual;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT（前方一致）
     */
    private String invoiceClassLikeFront;

    /**
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled（大なり）
     */
    private String cancelFlgGreaterThan;

    /**
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled（大なりイコール）
     */
    private String cancelFlgGreaterThanEqual;

    /**
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled（小なり）
     */
    private String cancelFlgLessThan;

    /**
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled（小なりイコール）
     */
    private String cancelFlgLessThanEqual;

    /**
     * CANCEL FLAG/キャンセルフラグ  Y:Canceled, N:Not Canceled（前方一致）
     */
    private String cancelFlgLikeFront;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel（大なり）
     */
    private String cancelTypGreaterThan;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel（大なりイコール）
     */
    private String cancelTypGreaterThanEqual;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel（小なり）
     */
    private String cancelTypLessThan;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel（小なりイコール）
     */
    private String cancelTypLessThanEqual;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel（前方一致）
     */
    private String cancelTypLikeFront;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo（大なり）
     */
    private String cancelInvoiceNoGreaterThan;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo（大なりイコール）
     */
    private String cancelInvoiceNoGreaterThanEqual;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo（小なり）
     */
    private String cancelInvoiceNoLessThan;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo（小なりイコール）
     */
    private String cancelInvoiceNoLessThanEqual;

    /**
     * CANCEL INVOICE NO/キャンセル前インボイスNO  ｷｬﾝｾﾙ前のInvoiceNo（前方一致）
     */
    private String cancelInvoiceNoLikeFront;

    /**
     * CANCEL INVOICE ISSUE DATE/キャンセル前インボイス発行日（大なりイコール）
     */
    private Date cancelInvoiceIssueDtGreaterThanEqual;

    /**
     * CANCEL INVOICE ISSUE DATE/キャンセル前インボイス発行日（小なりイコール）
     */
    private Date cancelInvoiceIssueDtLessThanEqual;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。（大なり）
     */
    private String parInvoiceNoGreaterThan;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。（大なりイコール）
     */
    private String parInvoiceNoGreaterThanEqual;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。（小なり）
     */
    private String parInvoiceNoLessThan;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。（小なりイコール）
     */
    private String parInvoiceNoLessThanEqual;

    /**
     * PARENT INVOICE NO/親_インボイスNO  インボイス種類（M:Main,F:Full-RT,E:E-RT）に応じて、M,EならそのままインボイスNOをセットする。FならMのインボイスNOをセットする。（前方一致）
     */
    private String parInvoiceNoLikeFront;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード（大なり）
     */
    private String parInvoiceShipperCdGreaterThan;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード（大なりイコール）
     */
    private String parInvoiceShipperCdGreaterThanEqual;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード（小なり）
     */
    private String parInvoiceShipperCdLessThan;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード（小なりイコール）
     */
    private String parInvoiceShipperCdLessThanEqual;

    /**
     * PARENT INVOICE SHIPPER CODE/親_荷主コード（前方一致）
     */
    private String parInvoiceShipperCdLikeFront;

    /**
     * PARENT INVOICE ISSUE DATE/親_インボイス発行日（大なりイコール）
     */
    private Date parInvoiceIssueDtGreaterThanEqual;

    /**
     * PARENT INVOICE ISSUE DATE/親_インボイス発行日（小なりイコール）
     */
    private Date parInvoiceIssueDtLessThanEqual;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。（大なり）
     */
    private String relateInvoiceNoGreaterThan;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。（大なりイコール）
     */
    private String relateInvoiceNoGreaterThanEqual;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。（小なり）
     */
    private String relateInvoiceNoLessThan;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。（小なりイコール）
     */
    private String relateInvoiceNoLessThanEqual;

    /**
     * RELATION INVOICE NO/関連_インボイスNO  通常インボイスの場合、リインボイスNo.が入る。リインボイスの場合、通常インボイスNo.が入る。（前方一致）
     */
    private String relateInvoiceNoLikeFront;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード（大なり）
     */
    private String relateInvoiceShipperCdGreaterThan;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード（大なりイコール）
     */
    private String relateInvoiceShipperCdGreaterThanEqual;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード（小なり）
     */
    private String relateInvoiceShipperCdLessThan;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード（小なりイコール）
     */
    private String relateInvoiceShipperCdLessThanEqual;

    /**
     * RELATION INVOICE SHIPPER CODE/関連_荷主コード（前方一致）
     */
    private String relateInvoiceShipperCdLikeFront;

    /**
     * RELATION INVOICE ISSUE DATE/関連_インボイス発行日（大なりイコール）
     */
    private Date relateInvoiceIssueDtGreaterThanEqual;

    /**
     * RELATION INVOICE ISSUE DATE/関連_インボイス発行日（小なりイコール）
     */
    private Date relateInvoiceIssueDtLessThanEqual;

    /**
     * CONSIGNEE CODE/荷受人コード（大なり）
     */
    private String consigneeCdGreaterThan;

    /**
     * CONSIGNEE CODE/荷受人コード（大なりイコール）
     */
    private String consigneeCdGreaterThanEqual;

    /**
     * CONSIGNEE CODE/荷受人コード（小なり）
     */
    private String consigneeCdLessThan;

    /**
     * CONSIGNEE CODE/荷受人コード（小なりイコール）
     */
    private String consigneeCdLessThanEqual;

    /**
     * CONSIGNEE CODE/荷受人コード（前方一致）
     */
    private String consigneeCdLikeFront;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード（大なり）
     */
    private String frtShipperCdGreaterThan;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード（大なりイコール）
     */
    private String frtShipperCdGreaterThanEqual;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード（小なり）
     */
    private String frtShipperCdLessThan;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード（小なりイコール）
     */
    private String frtShipperCdLessThanEqual;

    /**
     * FULL RT SHIPPER CODE/FRT_荷主コード（前方一致）
     */
    private String frtShipperCdLikeFront;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード（大なり）
     */
    private String frtConsigneeCdGreaterThan;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード（大なりイコール）
     */
    private String frtConsigneeCdGreaterThanEqual;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード（小なり）
     */
    private String frtConsigneeCdLessThan;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード（小なりイコール）
     */
    private String frtConsigneeCdLessThanEqual;

    /**
     * FULL RT CONSIGNEE CODE/FRT_荷受人コード（前方一致）
     */
    private String frtConsigneeCdLikeFront;

    /**
     * SHIP TO CODE/送荷先コード（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP TO CODE/送荷先コード（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP TO CODE/送荷先コード（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP TO CODE/送荷先コード（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP TO CODE/送荷先コード（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード（大なり）
     */
    private String shipToCompCdGreaterThan;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード（大なりイコール）
     */
    private String shipToCompCdGreaterThanEqual;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード（小なり）
     */
    private String shipToCompCdLessThan;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード（小なりイコール）
     */
    private String shipToCompCdLessThanEqual;

    /**
     * SHIP TO COMPANY CODE/送荷先会社コード（前方一致）
     */
    private String shipToCompCdLikeFront;

    /**
     * CUSTOMER CODE/得意先コード（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER CODE/得意先コード（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER CODE/得意先コード（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER CODE/得意先コード（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER CODE/得意先コード（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * LEGACY SHIP TO/LEGACY送荷先（大なり）
     */
    private String lgcyShipToGreaterThan;

    /**
     * LEGACY SHIP TO/LEGACY送荷先（大なりイコール）
     */
    private String lgcyShipToGreaterThanEqual;

    /**
     * LEGACY SHIP TO/LEGACY送荷先（小なり）
     */
    private String lgcyShipToLessThan;

    /**
     * LEGACY SHIP TO/LEGACY送荷先（小なりイコール）
     */
    private String lgcyShipToLessThanEqual;

    /**
     * LEGACY SHIP TO/LEGACY送荷先（前方一致）
     */
    private String lgcyShipToLikeFront;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value（大なり）
     */
    private String invoiceCtgryGreaterThan;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value（大なりイコール）
     */
    private String invoiceCtgryGreaterThanEqual;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value（小なり）
     */
    private String invoiceCtgryLessThan;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value（小なりイコール）
     */
    private String invoiceCtgryLessThanEqual;

    /**
     * INVOICE CATEGORY/請求分類  C:Commercial value,
I:Commercial value (I),
N:No commercial value（前方一致）
     */
    private String invoiceCtgryLikeFront;

    /**
     * INVOICE CATEGORY NAME/請求分類名（大なり）
     */
    private String invoiceCtgryNmGreaterThan;

    /**
     * INVOICE CATEGORY NAME/請求分類名（大なりイコール）
     */
    private String invoiceCtgryNmGreaterThanEqual;

    /**
     * INVOICE CATEGORY NAME/請求分類名（小なり）
     */
    private String invoiceCtgryNmLessThan;

    /**
     * INVOICE CATEGORY NAME/請求分類名（小なりイコール）
     */
    private String invoiceCtgryNmLessThanEqual;

    /**
     * INVOICE CATEGORY NAME/請求分類名（前方一致）
     */
    private String invoiceCtgryNmLikeFront;

    /**
     * SHIPPED DATE/売上日（大なりイコール）
     */
    private Date shippedDtGreaterThanEqual;

    /**
     * SHIPPED DATE/売上日（小なりイコール）
     */
    private Date shippedDtLessThanEqual;

    /**
     * TRANSPORT CODE/輸送手段コード（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRANSPORT CODE/輸送手段コード（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRANSPORT CODE/輸送手段コード（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRANSPORT CODE/輸送手段コード（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRANSPORT CODE/輸送手段コード（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * TRANSPORT NAME/輸送手段名（大なり）
     */
    private String trnsNmGreaterThan;

    /**
     * TRANSPORT NAME/輸送手段名（大なりイコール）
     */
    private String trnsNmGreaterThanEqual;

    /**
     * TRANSPORT NAME/輸送手段名（小なり）
     */
    private String trnsNmLessThan;

    /**
     * TRANSPORT NAME/輸送手段名（小なりイコール）
     */
    private String trnsNmLessThanEqual;

    /**
     * TRANSPORT NAME/輸送手段名（前方一致）
     */
    private String trnsNmLikeFront;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段（大なり）
     */
    private String trnsCdOrgGreaterThan;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段（大なりイコール）
     */
    private String trnsCdOrgGreaterThanEqual;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段（小なり）
     */
    private String trnsCdOrgLessThan;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段（小なりイコール）
     */
    private String trnsCdOrgLessThanEqual;

    /**
     * TRANSPORT CODE ORIGINAL/輸送手段コードオリジナル  元々の輸送手段（前方一致）
     */
    private String trnsCdOrgLikeFront;

    /**
     * ETD/出発予定日  船用TBLに分ける？（大なりイコール）
     */
    private Date etdGreaterThanEqual;

    /**
     * ETD/出発予定日  船用TBLに分ける？（小なりイコール）
     */
    private Date etdLessThanEqual;

    /**
     * ETA/到着予定日（大なりイコール）
     */
    private Date etaGreaterThanEqual;

    /**
     * ETA/到着予定日（小なりイコール）
     */
    private Date etaLessThanEqual;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし（大なり）
     */
    private String arrivalTimeGreaterThan;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし（大なりイコール）
     */
    private String arrivalTimeGreaterThanEqual;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし（小なり）
     */
    private String arrivalTimeLessThan;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし（小なりイコール）
     */
    private String arrivalTimeLessThanEqual;

    /**
     * ARRIVAL TIME/到着予定時刻  書類上表示なし（前方一致）
     */
    private String arrivalTimeLikeFront;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード（大なり）
     */
    private String lPortCntryCdGreaterThan;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード（大なりイコール）
     */
    private String lPortCntryCdGreaterThanEqual;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード（小なり）
     */
    private String lPortCntryCdLessThan;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード（小なりイコール）
     */
    private String lPortCntryCdLessThanEqual;

    /**
     * LOADING PORT COUNTRY CODE/出発港国コード（前方一致）
     */
    private String lPortCntryCdLikeFront;

    /**
     * LOADING PORT CODE/出発港コード（大なり）
     */
    private String loadingPortCdGreaterThan;

    /**
     * LOADING PORT CODE/出発港コード（大なりイコール）
     */
    private String loadingPortCdGreaterThanEqual;

    /**
     * LOADING PORT CODE/出発港コード（小なり）
     */
    private String loadingPortCdLessThan;

    /**
     * LOADING PORT CODE/出発港コード（小なりイコール）
     */
    private String loadingPortCdLessThanEqual;

    /**
     * LOADING PORT CODE/出発港コード（前方一致）
     */
    private String loadingPortCdLikeFront;

    /**
     * LOADING PORT NAME/出発港名（大なり）
     */
    private String loadingPortNmGreaterThan;

    /**
     * LOADING PORT NAME/出発港名（大なりイコール）
     */
    private String loadingPortNmGreaterThanEqual;

    /**
     * LOADING PORT NAME/出発港名（小なり）
     */
    private String loadingPortNmLessThan;

    /**
     * LOADING PORT NAME/出発港名（小なりイコール）
     */
    private String loadingPortNmLessThanEqual;

    /**
     * LOADING PORT NAME/出発港名（前方一致）
     */
    private String loadingPortNmLikeFront;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード（大なり）
     */
    private String dPortCntryCdGreaterThan;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード（大なりイコール）
     */
    private String dPortCntryCdGreaterThanEqual;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード（小なり）
     */
    private String dPortCntryCdLessThan;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード（小なりイコール）
     */
    private String dPortCntryCdLessThanEqual;

    /**
     * DISCHARGE PORT COUNTRY CODE/到着港国コード（前方一致）
     */
    private String dPortCntryCdLikeFront;

    /**
     * DISCHARGE PORT CODE/到着港コード（大なり）
     */
    private String dischargePortCdGreaterThan;

    /**
     * DISCHARGE PORT CODE/到着港コード（大なりイコール）
     */
    private String dischargePortCdGreaterThanEqual;

    /**
     * DISCHARGE PORT CODE/到着港コード（小なり）
     */
    private String dischargePortCdLessThan;

    /**
     * DISCHARGE PORT CODE/到着港コード（小なりイコール）
     */
    private String dischargePortCdLessThanEqual;

    /**
     * DISCHARGE PORT CODE/到着港コード（前方一致）
     */
    private String dischargePortCdLikeFront;

    /**
     * DISCHARGE PORT NAME/到着港名（大なり）
     */
    private String dischargePortNmGreaterThan;

    /**
     * DISCHARGE PORT NAME/到着港名（大なりイコール）
     */
    private String dischargePortNmGreaterThanEqual;

    /**
     * DISCHARGE PORT NAME/到着港名（小なり）
     */
    private String dischargePortNmLessThan;

    /**
     * DISCHARGE PORT NAME/到着港名（小なりイコール）
     */
    private String dischargePortNmLessThanEqual;

    /**
     * DISCHARGE PORT NAME/到着港名（前方一致）
     */
    private String dischargePortNmLikeFront;

    /**
     * DELIVERY POINT/荷渡地（大なり）
     */
    private String dlivPointGreaterThan;

    /**
     * DELIVERY POINT/荷渡地（大なりイコール）
     */
    private String dlivPointGreaterThanEqual;

    /**
     * DELIVERY POINT/荷渡地（小なり）
     */
    private String dlivPointLessThan;

    /**
     * DELIVERY POINT/荷渡地（小なりイコール）
     */
    private String dlivPointLessThanEqual;

    /**
     * DELIVERY POINT/荷渡地（前方一致）
     */
    private String dlivPointLikeFront;

    /**
     * CARRIER COMPANY CODE/運送会社コード（大なり）
     */
    private String carrierCompCdGreaterThan;

    /**
     * CARRIER COMPANY CODE/運送会社コード（大なりイコール）
     */
    private String carrierCompCdGreaterThanEqual;

    /**
     * CARRIER COMPANY CODE/運送会社コード（小なり）
     */
    private String carrierCompCdLessThan;

    /**
     * CARRIER COMPANY CODE/運送会社コード（小なりイコール）
     */
    private String carrierCompCdLessThanEqual;

    /**
     * CARRIER COMPANY CODE/運送会社コード（前方一致）
     */
    private String carrierCompCdLikeFront;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称（大なり）
     */
    private String carrierCompNmAbbGreaterThan;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称（大なりイコール）
     */
    private String carrierCompNmAbbGreaterThanEqual;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称（小なり）
     */
    private String carrierCompNmAbbLessThan;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称（小なりイコール）
     */
    private String carrierCompNmAbbLessThanEqual;

    /**
     * CARRIER COMPANY NAME ABBREVIATION/運送会社名略称（前方一致）
     */
    private String carrierCompNmAbbLikeFront;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし（大なり）
     */
    private String forwarderCompCdGreaterThan;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし（大なりイコール）
     */
    private String forwarderCompCdGreaterThanEqual;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし（小なり）
     */
    private String forwarderCompCdLessThan;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし（小なりイコール）
     */
    private String forwarderCompCdLessThanEqual;

    /**
     * FORWARDER COMPANY CODE/フォワーダーコード  画面上表示なし（前方一致）
     */
    private String forwarderCompCdLikeFront;

    /**
     * VESSEL/船（大なり）
     */
    private String vesselGreaterThan;

    /**
     * VESSEL/船（大なりイコール）
     */
    private String vesselGreaterThanEqual;

    /**
     * VESSEL/船（小なり）
     */
    private String vesselLessThan;

    /**
     * VESSEL/船（小なりイコール）
     */
    private String vesselLessThanEqual;

    /**
     * VESSEL/船（前方一致）
     */
    private String vesselLikeFront;

    /**
     * BOOKING NO/予約NO（大なり）
     */
    private String bookingNoGreaterThan;

    /**
     * BOOKING NO/予約NO（大なりイコール）
     */
    private String bookingNoGreaterThanEqual;

    /**
     * BOOKING NO/予約NO（小なり）
     */
    private String bookingNoLessThan;

    /**
     * BOOKING NO/予約NO（小なりイコール）
     */
    private String bookingNoLessThanEqual;

    /**
     * BOOKING NO/予約NO（前方一致）
     */
    private String bookingNoLikeFront;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect（大なり）
     */
    private String freightResponsibleCdGreaterThan;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect（大なりイコール）
     */
    private String freightResponsibleCdGreaterThanEqual;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect（小なり）
     */
    private String freightResponsibleCdLessThan;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect（小なりイコール）
     */
    private String freightResponsibleCdLessThanEqual;

    /**
     * FREIGHT RESPONSIBLE CODE/運賃支払いコード  P:Prepaid, C:Collect（前方一致）
     */
    private String freightResponsibleCdLikeFront;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり（大なり）
     */
    private String freightResponsibleNmGreaterThan;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり（大なりイコール）
     */
    private String freightResponsibleNmGreaterThanEqual;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり（小なり）
     */
    private String freightResponsibleNmLessThan;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり（小なりイコール）
     */
    private String freightResponsibleNmLessThanEqual;

    /**
     * FREIGHT RESPONSIBLE NAME/運賃支払い名  論理名,物理名とも変更の可能性あり（前方一致）
     */
    private String freightResponsibleNmLikeFront;

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
FAS:Free Alongside Ship（大なり）
     */
    private String priceTermsGreaterThan;

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
FAS:Free Alongside Ship（大なりイコール）
     */
    private String priceTermsGreaterThanEqual;

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
FAS:Free Alongside Ship（小なり）
     */
    private String priceTermsLessThan;

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
FAS:Free Alongside Ship（小なりイコール）
     */
    private String priceTermsLessThanEqual;

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
FAS:Free Alongside Ship（前方一致）
     */
    private String priceTermsLikeFront;

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
FAS:Free Alongside Ship（大なり）
     */
    private String tradeTermsGreaterThan;

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
FAS:Free Alongside Ship（大なりイコール）
     */
    private String tradeTermsGreaterThanEqual;

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
FAS:Free Alongside Ship（小なり）
     */
    private String tradeTermsLessThan;

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
FAS:Free Alongside Ship（小なりイコール）
     */
    private String tradeTermsLessThanEqual;

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
FAS:Free Alongside Ship（前方一致）
     */
    private String tradeTermsLikeFront;

    /**
     * TERMS POINT/費用負担移転地（大なり）
     */
    private String termsPointGreaterThan;

    /**
     * TERMS POINT/費用負担移転地（大なりイコール）
     */
    private String termsPointGreaterThanEqual;

    /**
     * TERMS POINT/費用負担移転地（小なり）
     */
    private String termsPointLessThan;

    /**
     * TERMS POINT/費用負担移転地（小なりイコール）
     */
    private String termsPointLessThanEqual;

    /**
     * TERMS POINT/費用負担移転地（前方一致）
     */
    private String termsPointLikeFront;

    /**
     * PAYMENT TERMS/支払条件（大なり）
     */
    private String payTermsGreaterThan;

    /**
     * PAYMENT TERMS/支払条件（大なりイコール）
     */
    private String payTermsGreaterThanEqual;

    /**
     * PAYMENT TERMS/支払条件（小なり）
     */
    private String payTermsLessThan;

    /**
     * PAYMENT TERMS/支払条件（小なりイコール）
     */
    private String payTermsLessThanEqual;

    /**
     * PAYMENT TERMS/支払条件（前方一致）
     */
    private String payTermsLikeFront;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance（大なり）
     */
    private String payMethGreaterThan;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance（大なりイコール）
     */
    private String payMethGreaterThanEqual;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance（小なり）
     */
    private String payMethLessThan;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance（小なりイコール）
     */
    private String payMethLessThanEqual;

    /**
     * PAYMENT METHOD/支払方法  L:L/C,
P:D/P,
A:D/A,
M:Payment in Advance,
R:Deferred Payment,
X:T/T Remittance（前方一致）
     */
    private String payMethLikeFront;

    /**
     * PAYMENT METHOD NAME/支払方法名称（大なり）
     */
    private String payMethNmGreaterThan;

    /**
     * PAYMENT METHOD NAME/支払方法名称（大なりイコール）
     */
    private String payMethNmGreaterThanEqual;

    /**
     * PAYMENT METHOD NAME/支払方法名称（小なり）
     */
    private String payMethNmLessThan;

    /**
     * PAYMENT METHOD NAME/支払方法名称（小なりイコール）
     */
    private String payMethNmLessThanEqual;

    /**
     * PAYMENT METHOD NAME/支払方法名称（前方一致）
     */
    private String payMethNmLikeFront;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C（大なり）
     */
    private String remLcTypGreaterThan;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C（大なりイコール）
     */
    private String remLcTypGreaterThanEqual;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C（小なり）
     */
    private String remLcTypLessThan;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C（小なりイコール）
     */
    private String remLcTypLessThanEqual;

    /**
     * REMITTANCE L/C TYPE/送金先L/C区分  R:Remittance, L:L/C（前方一致）
     */
    private String remLcTypLikeFront;

    /**
     * REMITTANCE BANK NAME/送金先銀行名（大なり）
     */
    private String remBankNmGreaterThan;

    /**
     * REMITTANCE BANK NAME/送金先銀行名（大なりイコール）
     */
    private String remBankNmGreaterThanEqual;

    /**
     * REMITTANCE BANK NAME/送金先銀行名（小なり）
     */
    private String remBankNmLessThan;

    /**
     * REMITTANCE BANK NAME/送金先銀行名（小なりイコール）
     */
    private String remBankNmLessThanEqual;

    /**
     * REMITTANCE BANK NAME/送金先銀行名（前方一致）
     */
    private String remBankNmLikeFront;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1（大なり）
     */
    private String remBankAddress1GreaterThan;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1（大なりイコール）
     */
    private String remBankAddress1GreaterThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1（小なり）
     */
    private String remBankAddress1LessThan;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1（小なりイコール）
     */
    private String remBankAddress1LessThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 1/送金先銀行住所1（前方一致）
     */
    private String remBankAddress1LikeFront;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2（大なり）
     */
    private String remBankAddress2GreaterThan;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2（大なりイコール）
     */
    private String remBankAddress2GreaterThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2（小なり）
     */
    private String remBankAddress2LessThan;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2（小なりイコール）
     */
    private String remBankAddress2LessThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 2/送金先銀行住所2（前方一致）
     */
    private String remBankAddress2LikeFront;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3（大なり）
     */
    private String remBankAddress3GreaterThan;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3（大なりイコール）
     */
    private String remBankAddress3GreaterThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3（小なり）
     */
    private String remBankAddress3LessThan;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3（小なりイコール）
     */
    private String remBankAddress3LessThanEqual;

    /**
     * REMITTANCE BANK ADDRESS 3/送金先銀行住所3（前方一致）
     */
    private String remBankAddress3LikeFront;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号（大なり）
     */
    private String remBankAccountNoGreaterThan;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号（大なりイコール）
     */
    private String remBankAccountNoGreaterThanEqual;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号（小なり）
     */
    private String remBankAccountNoLessThan;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号（小なりイコール）
     */
    private String remBankAccountNoLessThanEqual;

    /**
     * REMITTANCE BANK ACCOUNT NUMBER/送金先銀行口座番号（前方一致）
     */
    private String remBankAccountNoLikeFront;

    /**
     * L/C NUMBER/L/C数（大なり）
     */
    private String lcNoGreaterThan;

    /**
     * L/C NUMBER/L/C数（大なりイコール）
     */
    private String lcNoGreaterThanEqual;

    /**
     * L/C NUMBER/L/C数（小なり）
     */
    private String lcNoLessThan;

    /**
     * L/C NUMBER/L/C数（小なりイコール）
     */
    private String lcNoLessThanEqual;

    /**
     * L/C NUMBER/L/C数（前方一致）
     */
    private String lcNoLikeFront;

    /**
     * LC DATE/L/C発行日（大なりイコール）
     */
    private Date lcDtGreaterThanEqual;

    /**
     * LC DATE/L/C発行日（小なりイコール）
     */
    private Date lcDtLessThanEqual;

    /**
     * LC BANK NAME 1/L/C 銀行名 1（大なり）
     */
    private String lcBankNm1GreaterThan;

    /**
     * LC BANK NAME 1/L/C 銀行名 1（大なりイコール）
     */
    private String lcBankNm1GreaterThanEqual;

    /**
     * LC BANK NAME 1/L/C 銀行名 1（小なり）
     */
    private String lcBankNm1LessThan;

    /**
     * LC BANK NAME 1/L/C 銀行名 1（小なりイコール）
     */
    private String lcBankNm1LessThanEqual;

    /**
     * LC BANK NAME 1/L/C 銀行名 1（前方一致）
     */
    private String lcBankNm1LikeFront;

    /**
     * LC BANK NAME 2/L/C 銀行名 2（大なり）
     */
    private String lcBankNm2GreaterThan;

    /**
     * LC BANK NAME 2/L/C 銀行名 2（大なりイコール）
     */
    private String lcBankNm2GreaterThanEqual;

    /**
     * LC BANK NAME 2/L/C 銀行名 2（小なり）
     */
    private String lcBankNm2LessThan;

    /**
     * LC BANK NAME 2/L/C 銀行名 2（小なりイコール）
     */
    private String lcBankNm2LessThanEqual;

    /**
     * LC BANK NAME 2/L/C 銀行名 2（前方一致）
     */
    private String lcBankNm2LikeFront;

    /**
     * CURRENCY CODE/通貨コード（大なり）
     */
    private String currCdGreaterThan;

    /**
     * CURRENCY CODE/通貨コード（大なりイコール）
     */
    private String currCdGreaterThanEqual;

    /**
     * CURRENCY CODE/通貨コード（小なり）
     */
    private String currCdLessThan;

    /**
     * CURRENCY CODE/通貨コード（小なりイコール）
     */
    private String currCdLessThanEqual;

    /**
     * CURRENCY CODE/通貨コード（前方一致）
     */
    private String currCdLikeFront;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード（大なり）
     */
    private String additionalChargeCdGreaterThan;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード（大なりイコール）
     */
    private String additionalChargeCdGreaterThanEqual;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード（小なり）
     */
    private String additionalChargeCdLessThan;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード（小なりイコール）
     */
    private String additionalChargeCdLessThanEqual;

    /**
     * ADDITIONAL CHARGE CODE/追加料金コード（前方一致）
     */
    private String additionalChargeCdLikeFront;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名（大なり）
     */
    private String additionalChargeNmGreaterThan;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名（大なりイコール）
     */
    private String additionalChargeNmGreaterThanEqual;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名（小なり）
     */
    private String additionalChargeNmLessThan;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名（小なりイコール）
     */
    private String additionalChargeNmLessThanEqual;

    /**
     * ADDITIONAL CHARGE NAME/追加料金名（前方一致）
     */
    private String additionalChargeNmLikeFront;

    /**
     * WEIGHT UNIT/重量単位（大なり）
     */
    private String weightUnitGreaterThan;

    /**
     * WEIGHT UNIT/重量単位（大なりイコール）
     */
    private String weightUnitGreaterThanEqual;

    /**
     * WEIGHT UNIT/重量単位（小なり）
     */
    private String weightUnitLessThan;

    /**
     * WEIGHT UNIT/重量単位（小なりイコール）
     */
    private String weightUnitLessThanEqual;

    /**
     * WEIGHT UNIT/重量単位（前方一致）
     */
    private String weightUnitLikeFront;

    /**
     * VOLUME UNIT/容積単位（大なり）
     */
    private String volumeUnitGreaterThan;

    /**
     * VOLUME UNIT/容積単位（大なりイコール）
     */
    private String volumeUnitGreaterThanEqual;

    /**
     * VOLUME UNIT/容積単位（小なり）
     */
    private String volumeUnitLessThan;

    /**
     * VOLUME UNIT/容積単位（小なりイコール）
     */
    private String volumeUnitLessThanEqual;

    /**
     * VOLUME UNIT/容積単位（前方一致）
     */
    private String volumeUnitLikeFront;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO（大なり）
     */
    private String invTplNoGreaterThan;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO（大なりイコール）
     */
    private String invTplNoGreaterThanEqual;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO（小なり）
     */
    private String invTplNoLessThan;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO（小なりイコール）
     */
    private String invTplNoLessThanEqual;

    /**
     * INVOICE TEMPLATE NO/インボイステンプレートNO（前方一致）
     */
    private String invTplNoLikeFront;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名（大なり）
     */
    private String free1ColNmGreaterThan;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名（大なりイコール）
     */
    private String free1ColNmGreaterThanEqual;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名（小なり）
     */
    private String free1ColNmLessThan;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名（小なりイコール）
     */
    private String free1ColNmLessThanEqual;

    /**
     * FREE 1 COLUMN NAME/フリー1項目名（前方一致）
     */
    private String free1ColNmLikeFront;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free1DispFlgGreaterThan;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free1DispFlgGreaterThanEqual;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free1DispFlgLessThan;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free1DispFlgLessThanEqual;

    /**
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free1DispFlgLikeFront;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名（大なり）
     */
    private String free2ColNmGreaterThan;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名（大なりイコール）
     */
    private String free2ColNmGreaterThanEqual;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名（小なり）
     */
    private String free2ColNmLessThan;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名（小なりイコール）
     */
    private String free2ColNmLessThanEqual;

    /**
     * FREE 2 COLUMN NAME/フリー2項目名（前方一致）
     */
    private String free2ColNmLikeFront;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free2DispFlgGreaterThan;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free2DispFlgGreaterThanEqual;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free2DispFlgLessThan;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free2DispFlgLessThanEqual;

    /**
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free2DispFlgLikeFront;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名（大なり）
     */
    private String free3ColNmGreaterThan;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名（大なりイコール）
     */
    private String free3ColNmGreaterThanEqual;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名（小なり）
     */
    private String free3ColNmLessThan;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名（小なりイコール）
     */
    private String free3ColNmLessThanEqual;

    /**
     * FREE 3 COLUMN NAME/フリー3項目名（前方一致）
     */
    private String free3ColNmLikeFront;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free3DispFlgGreaterThan;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free3DispFlgGreaterThanEqual;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free3DispFlgLessThan;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free3DispFlgLessThanEqual;

    /**
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free3DispFlgLikeFront;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名（大なり）
     */
    private String free4ColNmGreaterThan;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名（大なりイコール）
     */
    private String free4ColNmGreaterThanEqual;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名（小なり）
     */
    private String free4ColNmLessThan;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名（小なりイコール）
     */
    private String free4ColNmLessThanEqual;

    /**
     * FREE 4 COLUMN NAME/フリー4項目名（前方一致）
     */
    private String free4ColNmLikeFront;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free4DispFlgGreaterThan;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free4DispFlgGreaterThanEqual;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free4DispFlgLessThan;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free4DispFlgLessThanEqual;

    /**
     * FREE 4 DISPLAY FLAG/フリー4表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free4DispFlgLikeFront;

    /**
     * SP INFO/特記事項（大なり）
     */
    private String spInfoGreaterThan;

    /**
     * SP INFO/特記事項（大なりイコール）
     */
    private String spInfoGreaterThanEqual;

    /**
     * SP INFO/特記事項（小なり）
     */
    private String spInfoLessThan;

    /**
     * SP INFO/特記事項（小なりイコール）
     */
    private String spInfoLessThanEqual;

    /**
     * SP INFO/特記事項（前方一致）
     */
    private String spInfoLikeFront;

    /**
     * APPROVAL POSITION/承認者役職（大なり）
     */
    private String approvalPositionGreaterThan;

    /**
     * APPROVAL POSITION/承認者役職（大なりイコール）
     */
    private String approvalPositionGreaterThanEqual;

    /**
     * APPROVAL POSITION/承認者役職（小なり）
     */
    private String approvalPositionLessThan;

    /**
     * APPROVAL POSITION/承認者役職（小なりイコール）
     */
    private String approvalPositionLessThanEqual;

    /**
     * APPROVAL POSITION/承認者役職（前方一致）
     */
    private String approvalPositionLikeFront;

    /**
     * APPROVAL NAME/承認者名（大なり）
     */
    private String approvalNmGreaterThan;

    /**
     * APPROVAL NAME/承認者名（大なりイコール）
     */
    private String approvalNmGreaterThanEqual;

    /**
     * APPROVAL NAME/承認者名（小なり）
     */
    private String approvalNmLessThan;

    /**
     * APPROVAL NAME/承認者名（小なりイコール）
     */
    private String approvalNmLessThanEqual;

    /**
     * APPROVAL NAME/承認者名（前方一致）
     */
    private String approvalNmLikeFront;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分（大なり）
     */
    private String containerLooseTypGreaterThan;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分（大なりイコール）
     */
    private String containerLooseTypGreaterThanEqual;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分（小なり）
     */
    private String containerLooseTypLessThan;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分（小なりイコール）
     */
    private String containerLooseTypLessThanEqual;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分（前方一致）
     */
    private String containerLooseTypLikeFront;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分（大なり）
     */
    private String customTimingTypGreaterThan;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分（大なりイコール）
     */
    private String customTimingTypGreaterThanEqual;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分（小なり）
     */
    private String customTimingTypLessThan;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分（小なりイコール）
     */
    private String customTimingTypLessThanEqual;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分（前方一致）
     */
    private String customTimingTypLikeFront;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous（大なり）
     */
    private String cmlTypGreaterThan;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous（大なりイコール）
     */
    private String cmlTypGreaterThanEqual;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous（小なり）
     */
    private String cmlTypLessThan;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous（小なりイコール）
     */
    private String cmlTypLessThanEqual;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous（前方一致）
     */
    private String cmlTypLikeFront;

    /**
     * INVOICE KEY/インボイスキー（大なり）
     */
    private String invoiceKeyGreaterThan;

    /**
     * INVOICE KEY/インボイスキー（大なりイコール）
     */
    private String invoiceKeyGreaterThanEqual;

    /**
     * INVOICE KEY/インボイスキー（小なり）
     */
    private String invoiceKeyLessThan;

    /**
     * INVOICE KEY/インボイスキー（小なりイコール）
     */
    private String invoiceKeyLessThanEqual;

    /**
     * INVOICE KEY/インボイスキー（前方一致）
     */
    private String invoiceKeyLikeFront;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要（大なり）
     */
    private String notifyParty1CompCdGreaterThan;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty1CompCdGreaterThanEqual;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要（小なり）
     */
    private String notifyParty1CompCdLessThan;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty1CompCdLessThanEqual;

    /**
     * NOTIFY PARTY 1 COMPANY CODE/着荷通知先1コード  BLを作成する際に必要（前方一致）
     */
    private String notifyParty1CompCdLikeFront;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要（大なり）
     */
    private String notifyParty1CompNmAbbGreaterThan;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty1CompNmAbbGreaterThanEqual;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要（小なり）
     */
    private String notifyParty1CompNmAbbLessThan;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty1CompNmAbbLessThanEqual;

    /**
     * NOTIFY PARTY 1 COMPANY NAME ABBREVIATION/着荷通知先1略称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty1CompNmAbbLikeFront;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要（大なり）
     */
    private String notifyParty1NmGreaterThan;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty1NmGreaterThanEqual;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要（小なり）
     */
    private String notifyParty1NmLessThan;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty1NmLessThanEqual;

    /**
     * NOTIFY PARTY 1 NAME/着荷通知先1名称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty1NmLikeFront;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要（大なり）
     */
    private String notifyParty1AddrGreaterThan;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty1AddrGreaterThanEqual;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要（小なり）
     */
    private String notifyParty1AddrLessThan;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty1AddrLessThanEqual;

    /**
     * NOTIFY PARTY 1 ADDRESS/着荷通知先1住所  BLを作成する際に必要（前方一致）
     */
    private String notifyParty1AddrLikeFront;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要（大なり）
     */
    private String notifyParty2CompCdGreaterThan;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty2CompCdGreaterThanEqual;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要（小なり）
     */
    private String notifyParty2CompCdLessThan;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty2CompCdLessThanEqual;

    /**
     * NOTIFY PARTY 2 COMPANY CODE/着荷通知先2コード  BLを作成する際に必要（前方一致）
     */
    private String notifyParty2CompCdLikeFront;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要（大なり）
     */
    private String notifyParty2CompNmAbbGreaterThan;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty2CompNmAbbGreaterThanEqual;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要（小なり）
     */
    private String notifyParty2CompNmAbbLessThan;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty2CompNmAbbLessThanEqual;

    /**
     * NOTIFY PARTY 2 COMPANY NAME ABBREVIATION/着荷通知先2略称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty2CompNmAbbLikeFront;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要（大なり）
     */
    private String notifyParty2NmGreaterThan;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty2NmGreaterThanEqual;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要（小なり）
     */
    private String notifyParty2NmLessThan;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty2NmLessThanEqual;

    /**
     * NOTIFY PARTY 2 NAME/着荷通知先2名称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty2NmLikeFront;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要（大なり）
     */
    private String notifyParty2AddrGreaterThan;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty2AddrGreaterThanEqual;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要（小なり）
     */
    private String notifyParty2AddrLessThan;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty2AddrLessThanEqual;

    /**
     * NOTIFY PARTY 2 ADDRESS/着荷通知先2住所  BLを作成する際に必要（前方一致）
     */
    private String notifyParty2AddrLikeFront;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要（大なり）
     */
    private String notifyParty3CompCdGreaterThan;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty3CompCdGreaterThanEqual;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要（小なり）
     */
    private String notifyParty3CompCdLessThan;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty3CompCdLessThanEqual;

    /**
     * NOTIFY PARTY 3 COMPANY CODE/着荷通知先3コード  BLを作成する際に必要（前方一致）
     */
    private String notifyParty3CompCdLikeFront;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要（大なり）
     */
    private String notifyParty3CompNmAbbGreaterThan;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty3CompNmAbbGreaterThanEqual;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要（小なり）
     */
    private String notifyParty3CompNmAbbLessThan;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty3CompNmAbbLessThanEqual;

    /**
     * NOTIFY PARTY 3 COMPANY NAME ABBREVIATION/着荷通知先3略称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty3CompNmAbbLikeFront;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要（大なり）
     */
    private String notifyParty3NmGreaterThan;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty3NmGreaterThanEqual;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要（小なり）
     */
    private String notifyParty3NmLessThan;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty3NmLessThanEqual;

    /**
     * NOTIFY PARTY 3 NAME/着荷通知先3名称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty3NmLikeFront;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要（大なり）
     */
    private String notifyParty3AddrGreaterThan;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty3AddrGreaterThanEqual;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要（小なり）
     */
    private String notifyParty3AddrLessThan;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty3AddrLessThanEqual;

    /**
     * NOTIFY PARTY 3 ADDRESS/着荷通知先3住所  BLを作成する際に必要（前方一致）
     */
    private String notifyParty3AddrLikeFront;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要（大なり）
     */
    private String notifyParty4CompCdGreaterThan;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty4CompCdGreaterThanEqual;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要（小なり）
     */
    private String notifyParty4CompCdLessThan;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty4CompCdLessThanEqual;

    /**
     * NOTIFY PARTY 4 COMPANY CODE/着荷通知先4コード  BLを作成する際に必要（前方一致）
     */
    private String notifyParty4CompCdLikeFront;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要（大なり）
     */
    private String notifyParty4CompNmAbbGreaterThan;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty4CompNmAbbGreaterThanEqual;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要（小なり）
     */
    private String notifyParty4CompNmAbbLessThan;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty4CompNmAbbLessThanEqual;

    /**
     * NOTIFY PARTY 4 COMPANY NAME ABBREVIATION/着荷通知先4略称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty4CompNmAbbLikeFront;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要（大なり）
     */
    private String notifyParty4NmGreaterThan;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty4NmGreaterThanEqual;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要（小なり）
     */
    private String notifyParty4NmLessThan;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty4NmLessThanEqual;

    /**
     * NOTIFY PARTY 4 NAME/着荷通知先4名称  BLを作成する際に必要（前方一致）
     */
    private String notifyParty4NmLikeFront;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要（大なり）
     */
    private String notifyParty4AddrGreaterThan;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要（大なりイコール）
     */
    private String notifyParty4AddrGreaterThanEqual;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要（小なり）
     */
    private String notifyParty4AddrLessThan;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要（小なりイコール）
     */
    private String notifyParty4AddrLessThanEqual;

    /**
     * NOTIFY PARTY 4 ADDRESS/着荷通知先4住所  BLを作成する際に必要（前方一致）
     */
    private String notifyParty4AddrLikeFront;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録（大なり）
     */
    private String shippingActNoGreaterThan;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録（大なりイコール）
     */
    private String shippingActNoGreaterThanEqual;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録（小なり）
     */
    private String shippingActNoLessThan;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録（小なりイコール）
     */
    private String shippingActNoLessThanEqual;

    /**
     * SHIPPING ACTUALITY NO/船積実績NO  船積実績機能にて登録（前方一致）
     */
    private String shippingActNoLikeFront;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録（大なり）
     */
    private String shippingActStatusGreaterThan;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録（大なりイコール）
     */
    private String shippingActStatusGreaterThanEqual;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録（小なり）
     */
    private String shippingActStatusLessThan;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録（小なりイコール）
     */
    private String shippingActStatusLessThanEqual;

    /**
     * SHIPPING ACTUALITY STATUS/船積実績ステータス  船積実績機能にて登録（前方一致）
     */
    private String shippingActStatusLikeFront;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO（大なり）
     */
    private String supplierInvoiceNoGreaterThan;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO（大なりイコール）
     */
    private String supplierInvoiceNoGreaterThanEqual;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO（小なり）
     */
    private String supplierInvoiceNoLessThan;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO（小なりイコール）
     */
    private String supplierInvoiceNoLessThanEqual;

    /**
     * SUPPLIER INVOICE NO/仕入先インボイスNO（前方一致）
     */
    private String supplierInvoiceNoLikeFront;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1（大なり）
     */
    private String impInvoiceNo1GreaterThan;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1（大なりイコール）
     */
    private String impInvoiceNo1GreaterThanEqual;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1（小なり）
     */
    private String impInvoiceNo1LessThan;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1（小なりイコール）
     */
    private String impInvoiceNo1LessThanEqual;

    /**
     * IMPORT INVOICE NO 1/輸入インボイスNO1（前方一致）
     */
    private String impInvoiceNo1LikeFront;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2（大なり）
     */
    private String impInvoiceNo2GreaterThan;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2（大なりイコール）
     */
    private String impInvoiceNo2GreaterThanEqual;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2（小なり）
     */
    private String impInvoiceNo2LessThan;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2（小なりイコール）
     */
    private String impInvoiceNo2LessThanEqual;

    /**
     * IMPORT INVOICE NO 2/輸入インボイスNO2（前方一致）
     */
    private String impInvoiceNo2LikeFront;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称（大なり）
     */
    private String shipperCompNmAbbGreaterThan;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称（大なりイコール）
     */
    private String shipperCompNmAbbGreaterThanEqual;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称（小なり）
     */
    private String shipperCompNmAbbLessThan;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称（小なりイコール）
     */
    private String shipperCompNmAbbLessThanEqual;

    /**
     * SHIPPER COMPANY NAME ABBREVIATION/荷主会社略称（前方一致）
     */
    private String shipperCompNmAbbLikeFront;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1（大なり）
     */
    private String shipperCompNm1GreaterThan;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1（大なりイコール）
     */
    private String shipperCompNm1GreaterThanEqual;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1（小なり）
     */
    private String shipperCompNm1LessThan;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1（小なりイコール）
     */
    private String shipperCompNm1LessThanEqual;

    /**
     * SHIPPER COMPANY NAME 1/荷主会社名称1（前方一致）
     */
    private String shipperCompNm1LikeFront;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2（大なり）
     */
    private String shipperCompNm2GreaterThan;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2（大なりイコール）
     */
    private String shipperCompNm2GreaterThanEqual;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2（小なり）
     */
    private String shipperCompNm2LessThan;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2（小なりイコール）
     */
    private String shipperCompNm2LessThanEqual;

    /**
     * SHIPPER COMPANY NAME 2/荷主会社名称2（前方一致）
     */
    private String shipperCompNm2LikeFront;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1（大なり）
     */
    private String shipperCompAddr1GreaterThan;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1（大なりイコール）
     */
    private String shipperCompAddr1GreaterThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1（小なり）
     */
    private String shipperCompAddr1LessThan;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1（小なりイコール）
     */
    private String shipperCompAddr1LessThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 1/荷主会社住所1（前方一致）
     */
    private String shipperCompAddr1LikeFront;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2（大なり）
     */
    private String shipperCompAddr2GreaterThan;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2（大なりイコール）
     */
    private String shipperCompAddr2GreaterThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2（小なり）
     */
    private String shipperCompAddr2LessThan;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2（小なりイコール）
     */
    private String shipperCompAddr2LessThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 2/荷主会社住所2（前方一致）
     */
    private String shipperCompAddr2LikeFront;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3（大なり）
     */
    private String shipperCompAddr3GreaterThan;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3（大なりイコール）
     */
    private String shipperCompAddr3GreaterThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3（小なり）
     */
    private String shipperCompAddr3LessThan;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3（小なりイコール）
     */
    private String shipperCompAddr3LessThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 3/荷主会社住所3（前方一致）
     */
    private String shipperCompAddr3LikeFront;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4（大なり）
     */
    private String shipperCompAddr4GreaterThan;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4（大なりイコール）
     */
    private String shipperCompAddr4GreaterThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4（小なり）
     */
    private String shipperCompAddr4LessThan;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4（小なりイコール）
     */
    private String shipperCompAddr4LessThanEqual;

    /**
     * SHIPPER COMPANY ADDRESS 4/荷主会社住所4（前方一致）
     */
    private String shipperCompAddr4LikeFront;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL（大なり）
     */
    private String shipperCompTelGreaterThan;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL（大なりイコール）
     */
    private String shipperCompTelGreaterThanEqual;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL（小なり）
     */
    private String shipperCompTelLessThan;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL（小なりイコール）
     */
    private String shipperCompTelLessThanEqual;

    /**
     * SHIPPER COMPANY TEL/荷主会社TEL（前方一致）
     */
    private String shipperCompTelLikeFront;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX（大なり）
     */
    private String shipperCompFaxGreaterThan;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX（大なりイコール）
     */
    private String shipperCompFaxGreaterThanEqual;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX（小なり）
     */
    private String shipperCompFaxLessThan;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX（小なりイコール）
     */
    private String shipperCompFaxLessThanEqual;

    /**
     * SHIPPER COMPANY FAX/荷主会社FAX（前方一致）
     */
    private String shipperCompFaxLikeFront;

    /**
     * SHIPPER TAX ID NO/荷主 TAX ID NO（大なり）
     */
    private String shipperTaxIdNoGreaterThan;

    /**
     * SHIPPER TAX ID NO/荷主 TAX ID NO（大なりイコール）
     */
    private String shipperTaxIdNoGreaterThanEqual;

    /**
     * SHIPPER TAX ID NO/荷主 TAX ID NO（小なり）
     */
    private String shipperTaxIdNoLessThan;

    /**
     * SHIPPER TAX ID NO/荷主 TAX ID NO（小なりイコール）
     */
    private String shipperTaxIdNoLessThanEqual;

    /**
     * SHIPPER TAX ID NO/荷主 TAX ID NO（前方一致）
     */
    private String shipperTaxIdNoLikeFront;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1（大なり）
     */
    private String consigneeCompNm1GreaterThan;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1（大なりイコール）
     */
    private String consigneeCompNm1GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1（小なり）
     */
    private String consigneeCompNm1LessThan;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1（小なりイコール）
     */
    private String consigneeCompNm1LessThanEqual;

    /**
     * CONSIGNEE COMPANY NAME 1/荷受人会社名称1（前方一致）
     */
    private String consigneeCompNm1LikeFront;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2（大なり）
     */
    private String consigneeCompNm2GreaterThan;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2（大なりイコール）
     */
    private String consigneeCompNm2GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2（小なり）
     */
    private String consigneeCompNm2LessThan;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2（小なりイコール）
     */
    private String consigneeCompNm2LessThanEqual;

    /**
     * CONSIGNEE COMPANY NAME 2/荷受人会社名称2（前方一致）
     */
    private String consigneeCompNm2LikeFront;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1（大なり）
     */
    private String consigneeCompAddr1GreaterThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1（大なりイコール）
     */
    private String consigneeCompAddr1GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1（小なり）
     */
    private String consigneeCompAddr1LessThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1（小なりイコール）
     */
    private String consigneeCompAddr1LessThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 1/荷受人会社住所1（前方一致）
     */
    private String consigneeCompAddr1LikeFront;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2（大なり）
     */
    private String consigneeCompAddr2GreaterThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2（大なりイコール）
     */
    private String consigneeCompAddr2GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2（小なり）
     */
    private String consigneeCompAddr2LessThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2（小なりイコール）
     */
    private String consigneeCompAddr2LessThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 2/荷受人会社住所2（前方一致）
     */
    private String consigneeCompAddr2LikeFront;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3（大なり）
     */
    private String consigneeCompAddr3GreaterThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3（大なりイコール）
     */
    private String consigneeCompAddr3GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3（小なり）
     */
    private String consigneeCompAddr3LessThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3（小なりイコール）
     */
    private String consigneeCompAddr3LessThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 3/荷受人会社住所3（前方一致）
     */
    private String consigneeCompAddr3LikeFront;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4（大なり）
     */
    private String consigneeCompAddr4GreaterThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4（大なりイコール）
     */
    private String consigneeCompAddr4GreaterThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4（小なり）
     */
    private String consigneeCompAddr4LessThan;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4（小なりイコール）
     */
    private String consigneeCompAddr4LessThanEqual;

    /**
     * CONSIGNEE COMPANY ADDRESS 4/荷受人会社住所4（前方一致）
     */
    private String consigneeCompAddr4LikeFront;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL（大なり）
     */
    private String consigneeCompTelGreaterThan;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL（大なりイコール）
     */
    private String consigneeCompTelGreaterThanEqual;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL（小なり）
     */
    private String consigneeCompTelLessThan;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL（小なりイコール）
     */
    private String consigneeCompTelLessThanEqual;

    /**
     * CONSIGNEE COMPANY TEL/荷受人会社TEL（前方一致）
     */
    private String consigneeCompTelLikeFront;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX（大なり）
     */
    private String consigneeCompFaxGreaterThan;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX（大なりイコール）
     */
    private String consigneeCompFaxGreaterThanEqual;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX（小なり）
     */
    private String consigneeCompFaxLessThan;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX（小なりイコール）
     */
    private String consigneeCompFaxLessThanEqual;

    /**
     * CONSIGNEE COMPANY FAX/荷受人会社FAX（前方一致）
     */
    private String consigneeCompFaxLikeFront;

    /**
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO（大なり）
     */
    private String consigneeTaxIdNoGreaterThan;

    /**
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO（大なりイコール）
     */
    private String consigneeTaxIdNoGreaterThanEqual;

    /**
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO（小なり）
     */
    private String consigneeTaxIdNoLessThan;

    /**
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO（小なりイコール）
     */
    private String consigneeTaxIdNoLessThanEqual;

    /**
     * CONSIGNEE TAX ID NO/荷受人 TAX ID NO（前方一致）
     */
    private String consigneeTaxIdNoLikeFront;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先（大なり）
     */
    private String consigneeAttnGreaterThan;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先（大なりイコール）
     */
    private String consigneeAttnGreaterThanEqual;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先（小なり）
     */
    private String consigneeAttnLessThan;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先（小なりイコール）
     */
    private String consigneeAttnLessThanEqual;

    /**
     * CONSIGNEE ATTENTION/荷受人宛先（前方一致）
     */
    private String consigneeAttnLikeFront;

    /**
     * SHIP TO NAME 1/送荷先名称1（大なり）
     */
    private String shipToNm1GreaterThan;

    /**
     * SHIP TO NAME 1/送荷先名称1（大なりイコール）
     */
    private String shipToNm1GreaterThanEqual;

    /**
     * SHIP TO NAME 1/送荷先名称1（小なり）
     */
    private String shipToNm1LessThan;

    /**
     * SHIP TO NAME 1/送荷先名称1（小なりイコール）
     */
    private String shipToNm1LessThanEqual;

    /**
     * SHIP TO NAME 1/送荷先名称1（前方一致）
     */
    private String shipToNm1LikeFront;

    /**
     * SHIP TO NAME 2/送荷先名称2（大なり）
     */
    private String shipToNm2GreaterThan;

    /**
     * SHIP TO NAME 2/送荷先名称2（大なりイコール）
     */
    private String shipToNm2GreaterThanEqual;

    /**
     * SHIP TO NAME 2/送荷先名称2（小なり）
     */
    private String shipToNm2LessThan;

    /**
     * SHIP TO NAME 2/送荷先名称2（小なりイコール）
     */
    private String shipToNm2LessThanEqual;

    /**
     * SHIP TO NAME 2/送荷先名称2（前方一致）
     */
    private String shipToNm2LikeFront;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1（大なり）
     */
    private String shipToAddr1GreaterThan;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1（大なりイコール）
     */
    private String shipToAddr1GreaterThanEqual;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1（小なり）
     */
    private String shipToAddr1LessThan;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1（小なりイコール）
     */
    private String shipToAddr1LessThanEqual;

    /**
     * SHIP TO ADDRESS 1/送荷先住所1（前方一致）
     */
    private String shipToAddr1LikeFront;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2（大なり）
     */
    private String shipToAddr2GreaterThan;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2（大なりイコール）
     */
    private String shipToAddr2GreaterThanEqual;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2（小なり）
     */
    private String shipToAddr2LessThan;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2（小なりイコール）
     */
    private String shipToAddr2LessThanEqual;

    /**
     * SHIP TO ADDRESS 2/送荷先住所2（前方一致）
     */
    private String shipToAddr2LikeFront;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3（大なり）
     */
    private String shipToAddr3GreaterThan;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3（大なりイコール）
     */
    private String shipToAddr3GreaterThanEqual;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3（小なり）
     */
    private String shipToAddr3LessThan;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3（小なりイコール）
     */
    private String shipToAddr3LessThanEqual;

    /**
     * SHIP TO ADDRESS 3/送荷先住所3（前方一致）
     */
    private String shipToAddr3LikeFront;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4（大なり）
     */
    private String shipToAddr4GreaterThan;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4（大なりイコール）
     */
    private String shipToAddr4GreaterThanEqual;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4（小なり）
     */
    private String shipToAddr4LessThan;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4（小なりイコール）
     */
    private String shipToAddr4LessThanEqual;

    /**
     * SHIP TO ADDRESS 4/送荷先住所4（前方一致）
     */
    private String shipToAddr4LikeFront;

    /**
     * SHIP TO TEL/送荷先TEL（大なり）
     */
    private String shipToTelGreaterThan;

    /**
     * SHIP TO TEL/送荷先TEL（大なりイコール）
     */
    private String shipToTelGreaterThanEqual;

    /**
     * SHIP TO TEL/送荷先TEL（小なり）
     */
    private String shipToTelLessThan;

    /**
     * SHIP TO TEL/送荷先TEL（小なりイコール）
     */
    private String shipToTelLessThanEqual;

    /**
     * SHIP TO TEL/送荷先TEL（前方一致）
     */
    private String shipToTelLikeFront;

    /**
     * CONTAINER NO 1/コンテナNO_1（大なり）
     */
    private String containerNo1GreaterThan;

    /**
     * CONTAINER NO 1/コンテナNO_1（大なりイコール）
     */
    private String containerNo1GreaterThanEqual;

    /**
     * CONTAINER NO 1/コンテナNO_1（小なり）
     */
    private String containerNo1LessThan;

    /**
     * CONTAINER NO 1/コンテナNO_1（小なりイコール）
     */
    private String containerNo1LessThanEqual;

    /**
     * CONTAINER NO 1/コンテナNO_1（前方一致）
     */
    private String containerNo1LikeFront;

    /**
     * CONTAINER NO 2/コンテナNO_2（大なり）
     */
    private String containerNo2GreaterThan;

    /**
     * CONTAINER NO 2/コンテナNO_2（大なりイコール）
     */
    private String containerNo2GreaterThanEqual;

    /**
     * CONTAINER NO 2/コンテナNO_2（小なり）
     */
    private String containerNo2LessThan;

    /**
     * CONTAINER NO 2/コンテナNO_2（小なりイコール）
     */
    private String containerNo2LessThanEqual;

    /**
     * CONTAINER NO 2/コンテナNO_2（前方一致）
     */
    private String containerNo2LikeFront;

    /**
     * CONTAINER NO 3/コンテナNO_3（大なり）
     */
    private String containerNo3GreaterThan;

    /**
     * CONTAINER NO 3/コンテナNO_3（大なりイコール）
     */
    private String containerNo3GreaterThanEqual;

    /**
     * CONTAINER NO 3/コンテナNO_3（小なり）
     */
    private String containerNo3LessThan;

    /**
     * CONTAINER NO 3/コンテナNO_3（小なりイコール）
     */
    private String containerNo3LessThanEqual;

    /**
     * CONTAINER NO 3/コンテナNO_3（前方一致）
     */
    private String containerNo3LikeFront;

    /**
     * INVOICE ISSUER ID/インボイス発行者DSC-ID（大なり）
     */
    private String invoiceIssuerIdGreaterThan;

    /**
     * INVOICE ISSUER ID/インボイス発行者DSC-ID（大なりイコール）
     */
    private String invoiceIssuerIdGreaterThanEqual;

    /**
     * INVOICE ISSUER ID/インボイス発行者DSC-ID（小なり）
     */
    private String invoiceIssuerIdLessThan;

    /**
     * INVOICE ISSUER ID/インボイス発行者DSC-ID（小なりイコール）
     */
    private String invoiceIssuerIdLessThanEqual;

    /**
     * INVOICE ISSUER ID/インボイス発行者DSC-ID（前方一致）
     */
    private String invoiceIssuerIdLikeFront;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名（大なり）
     */
    private String invoiceIssuerNmGreaterThan;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名（大なりイコール）
     */
    private String invoiceIssuerNmGreaterThanEqual;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名（小なり）
     */
    private String invoiceIssuerNmLessThan;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名（小なりイコール）
     */
    private String invoiceIssuerNmLessThanEqual;

    /**
     * INVOICE ISSUER NAME/インボイス発行者名（前方一致）
     */
    private String invoiceIssuerNmLikeFront;

    /**
     * MANUAL INVOICE ISSUE DATE/マニュアルインボイス発行日（大なりイコール）
     */
    private Date manualInvoiceIssueDtGreaterThanEqual;

    /**
     * MANUAL INVOICE ISSUE DATE/マニュアルインボイス発行日（小なりイコール）
     */
    private Date manualInvoiceIssueDtLessThanEqual;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted（大なり）
     */
    private String deleteFlgGreaterThan;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted（大なりイコール）
     */
    private String deleteFlgGreaterThanEqual;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted（小なり）
     */
    private String deleteFlgLessThan;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted（小なりイコール）
     */
    private String deleteFlgLessThanEqual;

    /**
     * DELETE FLAG/削除フラグ  Y:Deleted, N:Not Deleted（前方一致）
     */
    private String deleteFlgLikeFront;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/更新者（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/更新者（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/更新者（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/更新者（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/更新者（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/作成者（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/作成者（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/作成者（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/作成者（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/作成者（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TtInvoiceCriteriaDomain() {
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
     * cancelFlg のゲッターメソッドです。
     * 
     * @return the cancelFlg
     */
    public String getCancelFlg() {
        return cancelFlg;
    }

    /**
     * cancelFlg のセッターメソッドです。
     * 
     * @param cancelFlg cancelFlg に設定する
     */
    public void setCancelFlg(String cancelFlg) {
        this.cancelFlg = cancelFlg;
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
     * cancelInvoiceIssueDt のゲッターメソッドです。
     * 
     * @return the cancelInvoiceIssueDt
     */
    public Date getCancelInvoiceIssueDt() {
        return cancelInvoiceIssueDt;
    }

    /**
     * cancelInvoiceIssueDt のセッターメソッドです。
     * 
     * @param cancelInvoiceIssueDt cancelInvoiceIssueDt に設定する
     */
    public void setCancelInvoiceIssueDt(Date cancelInvoiceIssueDt) {
        this.cancelInvoiceIssueDt = cancelInvoiceIssueDt;
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
     * invoiceIssuerId のゲッターメソッドです。
     * 
     * @return the invoiceIssuerId
     */
    public String getInvoiceIssuerId() {
        return invoiceIssuerId;
    }

    /**
     * invoiceIssuerId のセッターメソッドです。
     * 
     * @param invoiceIssuerId invoiceIssuerId に設定する
     */
    public void setInvoiceIssuerId(String invoiceIssuerId) {
        this.invoiceIssuerId = invoiceIssuerId;
    }

    /**
     * invoiceIssuerNm のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNm
     */
    public String getInvoiceIssuerNm() {
        return invoiceIssuerNm;
    }

    /**
     * invoiceIssuerNm のセッターメソッドです。
     * 
     * @param invoiceIssuerNm invoiceIssuerNm に設定する
     */
    public void setInvoiceIssuerNm(String invoiceIssuerNm) {
        this.invoiceIssuerNm = invoiceIssuerNm;
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
     * deleteFlg のゲッターメソッドです。
     * 
     * @return the deleteFlg
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * deleteFlg のセッターメソッドです。
     * 
     * @param deleteFlg deleteFlg に設定する
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
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

    /**
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
    }

    /**
     * invoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThan
     */
    public String getInvoiceNoGreaterThan() {
        return invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThan invoiceNoGreaterThan に設定する
     */
    public void setInvoiceNoGreaterThan(String invoiceNoGreaterThan) {
        this.invoiceNoGreaterThan = invoiceNoGreaterThan;
    }

    /**
     * invoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoGreaterThanEqual
     */
    public String getInvoiceNoGreaterThanEqual() {
        return invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoGreaterThanEqual invoiceNoGreaterThanEqual に設定する
     */
    public void setInvoiceNoGreaterThanEqual(String invoiceNoGreaterThanEqual) {
        this.invoiceNoGreaterThanEqual = invoiceNoGreaterThanEqual;
    }

    /**
     * invoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThan
     */
    public String getInvoiceNoLessThan() {
        return invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThan のセッターメソッドです。
     * 
     * @param invoiceNoLessThan invoiceNoLessThan に設定する
     */
    public void setInvoiceNoLessThan(String invoiceNoLessThan) {
        this.invoiceNoLessThan = invoiceNoLessThan;
    }

    /**
     * invoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceNoLessThanEqual
     */
    public String getInvoiceNoLessThanEqual() {
        return invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceNoLessThanEqual invoiceNoLessThanEqual に設定する
     */
    public void setInvoiceNoLessThanEqual(String invoiceNoLessThanEqual) {
        this.invoiceNoLessThanEqual = invoiceNoLessThanEqual;
    }

    /**
     * invoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceNoLikeFront
     */
    public String getInvoiceNoLikeFront() {
        return invoiceNoLikeFront;
    }

    /**
     * invoiceNoLikeFront のセッターメソッドです。
     * 
     * @param invoiceNoLikeFront invoiceNoLikeFront に設定する
     */
    public void setInvoiceNoLikeFront(String invoiceNoLikeFront) {
        this.invoiceNoLikeFront = invoiceNoLikeFront;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtGreaterThanEqual
     */
    public Date getInvoiceIssueDtGreaterThanEqual() {
        return invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtGreaterThanEqual invoiceIssueDtGreaterThanEqual に設定する
     */
    public void setInvoiceIssueDtGreaterThanEqual(Date invoiceIssueDtGreaterThanEqual) {
        this.invoiceIssueDtGreaterThanEqual = invoiceIssueDtGreaterThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssueDtLessThanEqual
     */
    public Date getInvoiceIssueDtLessThanEqual() {
        return invoiceIssueDtLessThanEqual;
    }

    /**
     * invoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssueDtLessThanEqual invoiceIssueDtLessThanEqual に設定する
     */
    public void setInvoiceIssueDtLessThanEqual(Date invoiceIssueDtLessThanEqual) {
        this.invoiceIssueDtLessThanEqual = invoiceIssueDtLessThanEqual;
    }

    /**
     * manualFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the manualFlgGreaterThan
     */
    public String getManualFlgGreaterThan() {
        return manualFlgGreaterThan;
    }

    /**
     * manualFlgGreaterThan のセッターメソッドです。
     * 
     * @param manualFlgGreaterThan manualFlgGreaterThan に設定する
     */
    public void setManualFlgGreaterThan(String manualFlgGreaterThan) {
        this.manualFlgGreaterThan = manualFlgGreaterThan;
    }

    /**
     * manualFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the manualFlgGreaterThanEqual
     */
    public String getManualFlgGreaterThanEqual() {
        return manualFlgGreaterThanEqual;
    }

    /**
     * manualFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param manualFlgGreaterThanEqual manualFlgGreaterThanEqual に設定する
     */
    public void setManualFlgGreaterThanEqual(String manualFlgGreaterThanEqual) {
        this.manualFlgGreaterThanEqual = manualFlgGreaterThanEqual;
    }

    /**
     * manualFlgLessThan のゲッターメソッドです。
     * 
     * @return the manualFlgLessThan
     */
    public String getManualFlgLessThan() {
        return manualFlgLessThan;
    }

    /**
     * manualFlgLessThan のセッターメソッドです。
     * 
     * @param manualFlgLessThan manualFlgLessThan に設定する
     */
    public void setManualFlgLessThan(String manualFlgLessThan) {
        this.manualFlgLessThan = manualFlgLessThan;
    }

    /**
     * manualFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the manualFlgLessThanEqual
     */
    public String getManualFlgLessThanEqual() {
        return manualFlgLessThanEqual;
    }

    /**
     * manualFlgLessThanEqual のセッターメソッドです。
     * 
     * @param manualFlgLessThanEqual manualFlgLessThanEqual に設定する
     */
    public void setManualFlgLessThanEqual(String manualFlgLessThanEqual) {
        this.manualFlgLessThanEqual = manualFlgLessThanEqual;
    }

    /**
     * manualFlgLikeFront のゲッターメソッドです。
     * 
     * @return the manualFlgLikeFront
     */
    public String getManualFlgLikeFront() {
        return manualFlgLikeFront;
    }

    /**
     * manualFlgLikeFront のセッターメソッドです。
     * 
     * @param manualFlgLikeFront manualFlgLikeFront に設定する
     */
    public void setManualFlgLikeFront(String manualFlgLikeFront) {
        this.manualFlgLikeFront = manualFlgLikeFront;
    }

    /**
     * manualTypGreaterThan のゲッターメソッドです。
     * 
     * @return the manualTypGreaterThan
     */
    public String getManualTypGreaterThan() {
        return manualTypGreaterThan;
    }

    /**
     * manualTypGreaterThan のセッターメソッドです。
     * 
     * @param manualTypGreaterThan manualTypGreaterThan に設定する
     */
    public void setManualTypGreaterThan(String manualTypGreaterThan) {
        this.manualTypGreaterThan = manualTypGreaterThan;
    }

    /**
     * manualTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the manualTypGreaterThanEqual
     */
    public String getManualTypGreaterThanEqual() {
        return manualTypGreaterThanEqual;
    }

    /**
     * manualTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param manualTypGreaterThanEqual manualTypGreaterThanEqual に設定する
     */
    public void setManualTypGreaterThanEqual(String manualTypGreaterThanEqual) {
        this.manualTypGreaterThanEqual = manualTypGreaterThanEqual;
    }

    /**
     * manualTypLessThan のゲッターメソッドです。
     * 
     * @return the manualTypLessThan
     */
    public String getManualTypLessThan() {
        return manualTypLessThan;
    }

    /**
     * manualTypLessThan のセッターメソッドです。
     * 
     * @param manualTypLessThan manualTypLessThan に設定する
     */
    public void setManualTypLessThan(String manualTypLessThan) {
        this.manualTypLessThan = manualTypLessThan;
    }

    /**
     * manualTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the manualTypLessThanEqual
     */
    public String getManualTypLessThanEqual() {
        return manualTypLessThanEqual;
    }

    /**
     * manualTypLessThanEqual のセッターメソッドです。
     * 
     * @param manualTypLessThanEqual manualTypLessThanEqual に設定する
     */
    public void setManualTypLessThanEqual(String manualTypLessThanEqual) {
        this.manualTypLessThanEqual = manualTypLessThanEqual;
    }

    /**
     * manualTypLikeFront のゲッターメソッドです。
     * 
     * @return the manualTypLikeFront
     */
    public String getManualTypLikeFront() {
        return manualTypLikeFront;
    }

    /**
     * manualTypLikeFront のセッターメソッドです。
     * 
     * @param manualTypLikeFront manualTypLikeFront に設定する
     */
    public void setManualTypLikeFront(String manualTypLikeFront) {
        this.manualTypLikeFront = manualTypLikeFront;
    }

    /**
     * invoiceClassGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceClassGreaterThan
     */
    public String getInvoiceClassGreaterThan() {
        return invoiceClassGreaterThan;
    }

    /**
     * invoiceClassGreaterThan のセッターメソッドです。
     * 
     * @param invoiceClassGreaterThan invoiceClassGreaterThan に設定する
     */
    public void setInvoiceClassGreaterThan(String invoiceClassGreaterThan) {
        this.invoiceClassGreaterThan = invoiceClassGreaterThan;
    }

    /**
     * invoiceClassGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceClassGreaterThanEqual
     */
    public String getInvoiceClassGreaterThanEqual() {
        return invoiceClassGreaterThanEqual;
    }

    /**
     * invoiceClassGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceClassGreaterThanEqual invoiceClassGreaterThanEqual に設定する
     */
    public void setInvoiceClassGreaterThanEqual(String invoiceClassGreaterThanEqual) {
        this.invoiceClassGreaterThanEqual = invoiceClassGreaterThanEqual;
    }

    /**
     * invoiceClassLessThan のゲッターメソッドです。
     * 
     * @return the invoiceClassLessThan
     */
    public String getInvoiceClassLessThan() {
        return invoiceClassLessThan;
    }

    /**
     * invoiceClassLessThan のセッターメソッドです。
     * 
     * @param invoiceClassLessThan invoiceClassLessThan に設定する
     */
    public void setInvoiceClassLessThan(String invoiceClassLessThan) {
        this.invoiceClassLessThan = invoiceClassLessThan;
    }

    /**
     * invoiceClassLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceClassLessThanEqual
     */
    public String getInvoiceClassLessThanEqual() {
        return invoiceClassLessThanEqual;
    }

    /**
     * invoiceClassLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceClassLessThanEqual invoiceClassLessThanEqual に設定する
     */
    public void setInvoiceClassLessThanEqual(String invoiceClassLessThanEqual) {
        this.invoiceClassLessThanEqual = invoiceClassLessThanEqual;
    }

    /**
     * invoiceClassLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceClassLikeFront
     */
    public String getInvoiceClassLikeFront() {
        return invoiceClassLikeFront;
    }

    /**
     * invoiceClassLikeFront のセッターメソッドです。
     * 
     * @param invoiceClassLikeFront invoiceClassLikeFront に設定する
     */
    public void setInvoiceClassLikeFront(String invoiceClassLikeFront) {
        this.invoiceClassLikeFront = invoiceClassLikeFront;
    }

    /**
     * cancelFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the cancelFlgGreaterThan
     */
    public String getCancelFlgGreaterThan() {
        return cancelFlgGreaterThan;
    }

    /**
     * cancelFlgGreaterThan のセッターメソッドです。
     * 
     * @param cancelFlgGreaterThan cancelFlgGreaterThan に設定する
     */
    public void setCancelFlgGreaterThan(String cancelFlgGreaterThan) {
        this.cancelFlgGreaterThan = cancelFlgGreaterThan;
    }

    /**
     * cancelFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cancelFlgGreaterThanEqual
     */
    public String getCancelFlgGreaterThanEqual() {
        return cancelFlgGreaterThanEqual;
    }

    /**
     * cancelFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param cancelFlgGreaterThanEqual cancelFlgGreaterThanEqual に設定する
     */
    public void setCancelFlgGreaterThanEqual(String cancelFlgGreaterThanEqual) {
        this.cancelFlgGreaterThanEqual = cancelFlgGreaterThanEqual;
    }

    /**
     * cancelFlgLessThan のゲッターメソッドです。
     * 
     * @return the cancelFlgLessThan
     */
    public String getCancelFlgLessThan() {
        return cancelFlgLessThan;
    }

    /**
     * cancelFlgLessThan のセッターメソッドです。
     * 
     * @param cancelFlgLessThan cancelFlgLessThan に設定する
     */
    public void setCancelFlgLessThan(String cancelFlgLessThan) {
        this.cancelFlgLessThan = cancelFlgLessThan;
    }

    /**
     * cancelFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the cancelFlgLessThanEqual
     */
    public String getCancelFlgLessThanEqual() {
        return cancelFlgLessThanEqual;
    }

    /**
     * cancelFlgLessThanEqual のセッターメソッドです。
     * 
     * @param cancelFlgLessThanEqual cancelFlgLessThanEqual に設定する
     */
    public void setCancelFlgLessThanEqual(String cancelFlgLessThanEqual) {
        this.cancelFlgLessThanEqual = cancelFlgLessThanEqual;
    }

    /**
     * cancelFlgLikeFront のゲッターメソッドです。
     * 
     * @return the cancelFlgLikeFront
     */
    public String getCancelFlgLikeFront() {
        return cancelFlgLikeFront;
    }

    /**
     * cancelFlgLikeFront のセッターメソッドです。
     * 
     * @param cancelFlgLikeFront cancelFlgLikeFront に設定する
     */
    public void setCancelFlgLikeFront(String cancelFlgLikeFront) {
        this.cancelFlgLikeFront = cancelFlgLikeFront;
    }

    /**
     * cancelTypGreaterThan のゲッターメソッドです。
     * 
     * @return the cancelTypGreaterThan
     */
    public String getCancelTypGreaterThan() {
        return cancelTypGreaterThan;
    }

    /**
     * cancelTypGreaterThan のセッターメソッドです。
     * 
     * @param cancelTypGreaterThan cancelTypGreaterThan に設定する
     */
    public void setCancelTypGreaterThan(String cancelTypGreaterThan) {
        this.cancelTypGreaterThan = cancelTypGreaterThan;
    }

    /**
     * cancelTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cancelTypGreaterThanEqual
     */
    public String getCancelTypGreaterThanEqual() {
        return cancelTypGreaterThanEqual;
    }

    /**
     * cancelTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param cancelTypGreaterThanEqual cancelTypGreaterThanEqual に設定する
     */
    public void setCancelTypGreaterThanEqual(String cancelTypGreaterThanEqual) {
        this.cancelTypGreaterThanEqual = cancelTypGreaterThanEqual;
    }

    /**
     * cancelTypLessThan のゲッターメソッドです。
     * 
     * @return the cancelTypLessThan
     */
    public String getCancelTypLessThan() {
        return cancelTypLessThan;
    }

    /**
     * cancelTypLessThan のセッターメソッドです。
     * 
     * @param cancelTypLessThan cancelTypLessThan に設定する
     */
    public void setCancelTypLessThan(String cancelTypLessThan) {
        this.cancelTypLessThan = cancelTypLessThan;
    }

    /**
     * cancelTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the cancelTypLessThanEqual
     */
    public String getCancelTypLessThanEqual() {
        return cancelTypLessThanEqual;
    }

    /**
     * cancelTypLessThanEqual のセッターメソッドです。
     * 
     * @param cancelTypLessThanEqual cancelTypLessThanEqual に設定する
     */
    public void setCancelTypLessThanEqual(String cancelTypLessThanEqual) {
        this.cancelTypLessThanEqual = cancelTypLessThanEqual;
    }

    /**
     * cancelTypLikeFront のゲッターメソッドです。
     * 
     * @return the cancelTypLikeFront
     */
    public String getCancelTypLikeFront() {
        return cancelTypLikeFront;
    }

    /**
     * cancelTypLikeFront のセッターメソッドです。
     * 
     * @param cancelTypLikeFront cancelTypLikeFront に設定する
     */
    public void setCancelTypLikeFront(String cancelTypLikeFront) {
        this.cancelTypLikeFront = cancelTypLikeFront;
    }

    /**
     * cancelInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNoGreaterThan
     */
    public String getCancelInvoiceNoGreaterThan() {
        return cancelInvoiceNoGreaterThan;
    }

    /**
     * cancelInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param cancelInvoiceNoGreaterThan cancelInvoiceNoGreaterThan に設定する
     */
    public void setCancelInvoiceNoGreaterThan(String cancelInvoiceNoGreaterThan) {
        this.cancelInvoiceNoGreaterThan = cancelInvoiceNoGreaterThan;
    }

    /**
     * cancelInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNoGreaterThanEqual
     */
    public String getCancelInvoiceNoGreaterThanEqual() {
        return cancelInvoiceNoGreaterThanEqual;
    }

    /**
     * cancelInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param cancelInvoiceNoGreaterThanEqual cancelInvoiceNoGreaterThanEqual に設定する
     */
    public void setCancelInvoiceNoGreaterThanEqual(String cancelInvoiceNoGreaterThanEqual) {
        this.cancelInvoiceNoGreaterThanEqual = cancelInvoiceNoGreaterThanEqual;
    }

    /**
     * cancelInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNoLessThan
     */
    public String getCancelInvoiceNoLessThan() {
        return cancelInvoiceNoLessThan;
    }

    /**
     * cancelInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param cancelInvoiceNoLessThan cancelInvoiceNoLessThan に設定する
     */
    public void setCancelInvoiceNoLessThan(String cancelInvoiceNoLessThan) {
        this.cancelInvoiceNoLessThan = cancelInvoiceNoLessThan;
    }

    /**
     * cancelInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNoLessThanEqual
     */
    public String getCancelInvoiceNoLessThanEqual() {
        return cancelInvoiceNoLessThanEqual;
    }

    /**
     * cancelInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param cancelInvoiceNoLessThanEqual cancelInvoiceNoLessThanEqual に設定する
     */
    public void setCancelInvoiceNoLessThanEqual(String cancelInvoiceNoLessThanEqual) {
        this.cancelInvoiceNoLessThanEqual = cancelInvoiceNoLessThanEqual;
    }

    /**
     * cancelInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the cancelInvoiceNoLikeFront
     */
    public String getCancelInvoiceNoLikeFront() {
        return cancelInvoiceNoLikeFront;
    }

    /**
     * cancelInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param cancelInvoiceNoLikeFront cancelInvoiceNoLikeFront に設定する
     */
    public void setCancelInvoiceNoLikeFront(String cancelInvoiceNoLikeFront) {
        this.cancelInvoiceNoLikeFront = cancelInvoiceNoLikeFront;
    }

    /**
     * cancelInvoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cancelInvoiceIssueDtGreaterThanEqual
     */
    public Date getCancelInvoiceIssueDtGreaterThanEqual() {
        return cancelInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * cancelInvoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param cancelInvoiceIssueDtGreaterThanEqual cancelInvoiceIssueDtGreaterThanEqual に設定する
     */
    public void setCancelInvoiceIssueDtGreaterThanEqual(Date cancelInvoiceIssueDtGreaterThanEqual) {
        this.cancelInvoiceIssueDtGreaterThanEqual = cancelInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * cancelInvoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the cancelInvoiceIssueDtLessThanEqual
     */
    public Date getCancelInvoiceIssueDtLessThanEqual() {
        return cancelInvoiceIssueDtLessThanEqual;
    }

    /**
     * cancelInvoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param cancelInvoiceIssueDtLessThanEqual cancelInvoiceIssueDtLessThanEqual に設定する
     */
    public void setCancelInvoiceIssueDtLessThanEqual(Date cancelInvoiceIssueDtLessThanEqual) {
        this.cancelInvoiceIssueDtLessThanEqual = cancelInvoiceIssueDtLessThanEqual;
    }

    /**
     * parInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the parInvoiceNoGreaterThan
     */
    public String getParInvoiceNoGreaterThan() {
        return parInvoiceNoGreaterThan;
    }

    /**
     * parInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param parInvoiceNoGreaterThan parInvoiceNoGreaterThan に設定する
     */
    public void setParInvoiceNoGreaterThan(String parInvoiceNoGreaterThan) {
        this.parInvoiceNoGreaterThan = parInvoiceNoGreaterThan;
    }

    /**
     * parInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceNoGreaterThanEqual
     */
    public String getParInvoiceNoGreaterThanEqual() {
        return parInvoiceNoGreaterThanEqual;
    }

    /**
     * parInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceNoGreaterThanEqual parInvoiceNoGreaterThanEqual に設定する
     */
    public void setParInvoiceNoGreaterThanEqual(String parInvoiceNoGreaterThanEqual) {
        this.parInvoiceNoGreaterThanEqual = parInvoiceNoGreaterThanEqual;
    }

    /**
     * parInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the parInvoiceNoLessThan
     */
    public String getParInvoiceNoLessThan() {
        return parInvoiceNoLessThan;
    }

    /**
     * parInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param parInvoiceNoLessThan parInvoiceNoLessThan に設定する
     */
    public void setParInvoiceNoLessThan(String parInvoiceNoLessThan) {
        this.parInvoiceNoLessThan = parInvoiceNoLessThan;
    }

    /**
     * parInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceNoLessThanEqual
     */
    public String getParInvoiceNoLessThanEqual() {
        return parInvoiceNoLessThanEqual;
    }

    /**
     * parInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceNoLessThanEqual parInvoiceNoLessThanEqual に設定する
     */
    public void setParInvoiceNoLessThanEqual(String parInvoiceNoLessThanEqual) {
        this.parInvoiceNoLessThanEqual = parInvoiceNoLessThanEqual;
    }

    /**
     * parInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the parInvoiceNoLikeFront
     */
    public String getParInvoiceNoLikeFront() {
        return parInvoiceNoLikeFront;
    }

    /**
     * parInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param parInvoiceNoLikeFront parInvoiceNoLikeFront に設定する
     */
    public void setParInvoiceNoLikeFront(String parInvoiceNoLikeFront) {
        this.parInvoiceNoLikeFront = parInvoiceNoLikeFront;
    }

    /**
     * parInvoiceShipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCdGreaterThan
     */
    public String getParInvoiceShipperCdGreaterThan() {
        return parInvoiceShipperCdGreaterThan;
    }

    /**
     * parInvoiceShipperCdGreaterThan のセッターメソッドです。
     * 
     * @param parInvoiceShipperCdGreaterThan parInvoiceShipperCdGreaterThan に設定する
     */
    public void setParInvoiceShipperCdGreaterThan(String parInvoiceShipperCdGreaterThan) {
        this.parInvoiceShipperCdGreaterThan = parInvoiceShipperCdGreaterThan;
    }

    /**
     * parInvoiceShipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCdGreaterThanEqual
     */
    public String getParInvoiceShipperCdGreaterThanEqual() {
        return parInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * parInvoiceShipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceShipperCdGreaterThanEqual parInvoiceShipperCdGreaterThanEqual に設定する
     */
    public void setParInvoiceShipperCdGreaterThanEqual(String parInvoiceShipperCdGreaterThanEqual) {
        this.parInvoiceShipperCdGreaterThanEqual = parInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * parInvoiceShipperCdLessThan のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCdLessThan
     */
    public String getParInvoiceShipperCdLessThan() {
        return parInvoiceShipperCdLessThan;
    }

    /**
     * parInvoiceShipperCdLessThan のセッターメソッドです。
     * 
     * @param parInvoiceShipperCdLessThan parInvoiceShipperCdLessThan に設定する
     */
    public void setParInvoiceShipperCdLessThan(String parInvoiceShipperCdLessThan) {
        this.parInvoiceShipperCdLessThan = parInvoiceShipperCdLessThan;
    }

    /**
     * parInvoiceShipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCdLessThanEqual
     */
    public String getParInvoiceShipperCdLessThanEqual() {
        return parInvoiceShipperCdLessThanEqual;
    }

    /**
     * parInvoiceShipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceShipperCdLessThanEqual parInvoiceShipperCdLessThanEqual に設定する
     */
    public void setParInvoiceShipperCdLessThanEqual(String parInvoiceShipperCdLessThanEqual) {
        this.parInvoiceShipperCdLessThanEqual = parInvoiceShipperCdLessThanEqual;
    }

    /**
     * parInvoiceShipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the parInvoiceShipperCdLikeFront
     */
    public String getParInvoiceShipperCdLikeFront() {
        return parInvoiceShipperCdLikeFront;
    }

    /**
     * parInvoiceShipperCdLikeFront のセッターメソッドです。
     * 
     * @param parInvoiceShipperCdLikeFront parInvoiceShipperCdLikeFront に設定する
     */
    public void setParInvoiceShipperCdLikeFront(String parInvoiceShipperCdLikeFront) {
        this.parInvoiceShipperCdLikeFront = parInvoiceShipperCdLikeFront;
    }

    /**
     * parInvoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceIssueDtGreaterThanEqual
     */
    public Date getParInvoiceIssueDtGreaterThanEqual() {
        return parInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * parInvoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceIssueDtGreaterThanEqual parInvoiceIssueDtGreaterThanEqual に設定する
     */
    public void setParInvoiceIssueDtGreaterThanEqual(Date parInvoiceIssueDtGreaterThanEqual) {
        this.parInvoiceIssueDtGreaterThanEqual = parInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * parInvoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the parInvoiceIssueDtLessThanEqual
     */
    public Date getParInvoiceIssueDtLessThanEqual() {
        return parInvoiceIssueDtLessThanEqual;
    }

    /**
     * parInvoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param parInvoiceIssueDtLessThanEqual parInvoiceIssueDtLessThanEqual に設定する
     */
    public void setParInvoiceIssueDtLessThanEqual(Date parInvoiceIssueDtLessThanEqual) {
        this.parInvoiceIssueDtLessThanEqual = parInvoiceIssueDtLessThanEqual;
    }

    /**
     * relateInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the relateInvoiceNoGreaterThan
     */
    public String getRelateInvoiceNoGreaterThan() {
        return relateInvoiceNoGreaterThan;
    }

    /**
     * relateInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param relateInvoiceNoGreaterThan relateInvoiceNoGreaterThan に設定する
     */
    public void setRelateInvoiceNoGreaterThan(String relateInvoiceNoGreaterThan) {
        this.relateInvoiceNoGreaterThan = relateInvoiceNoGreaterThan;
    }

    /**
     * relateInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceNoGreaterThanEqual
     */
    public String getRelateInvoiceNoGreaterThanEqual() {
        return relateInvoiceNoGreaterThanEqual;
    }

    /**
     * relateInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceNoGreaterThanEqual relateInvoiceNoGreaterThanEqual に設定する
     */
    public void setRelateInvoiceNoGreaterThanEqual(String relateInvoiceNoGreaterThanEqual) {
        this.relateInvoiceNoGreaterThanEqual = relateInvoiceNoGreaterThanEqual;
    }

    /**
     * relateInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the relateInvoiceNoLessThan
     */
    public String getRelateInvoiceNoLessThan() {
        return relateInvoiceNoLessThan;
    }

    /**
     * relateInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param relateInvoiceNoLessThan relateInvoiceNoLessThan に設定する
     */
    public void setRelateInvoiceNoLessThan(String relateInvoiceNoLessThan) {
        this.relateInvoiceNoLessThan = relateInvoiceNoLessThan;
    }

    /**
     * relateInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceNoLessThanEqual
     */
    public String getRelateInvoiceNoLessThanEqual() {
        return relateInvoiceNoLessThanEqual;
    }

    /**
     * relateInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceNoLessThanEqual relateInvoiceNoLessThanEqual に設定する
     */
    public void setRelateInvoiceNoLessThanEqual(String relateInvoiceNoLessThanEqual) {
        this.relateInvoiceNoLessThanEqual = relateInvoiceNoLessThanEqual;
    }

    /**
     * relateInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the relateInvoiceNoLikeFront
     */
    public String getRelateInvoiceNoLikeFront() {
        return relateInvoiceNoLikeFront;
    }

    /**
     * relateInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param relateInvoiceNoLikeFront relateInvoiceNoLikeFront に設定する
     */
    public void setRelateInvoiceNoLikeFront(String relateInvoiceNoLikeFront) {
        this.relateInvoiceNoLikeFront = relateInvoiceNoLikeFront;
    }

    /**
     * relateInvoiceShipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCdGreaterThan
     */
    public String getRelateInvoiceShipperCdGreaterThan() {
        return relateInvoiceShipperCdGreaterThan;
    }

    /**
     * relateInvoiceShipperCdGreaterThan のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCdGreaterThan relateInvoiceShipperCdGreaterThan に設定する
     */
    public void setRelateInvoiceShipperCdGreaterThan(String relateInvoiceShipperCdGreaterThan) {
        this.relateInvoiceShipperCdGreaterThan = relateInvoiceShipperCdGreaterThan;
    }

    /**
     * relateInvoiceShipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCdGreaterThanEqual
     */
    public String getRelateInvoiceShipperCdGreaterThanEqual() {
        return relateInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * relateInvoiceShipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCdGreaterThanEqual relateInvoiceShipperCdGreaterThanEqual に設定する
     */
    public void setRelateInvoiceShipperCdGreaterThanEqual(String relateInvoiceShipperCdGreaterThanEqual) {
        this.relateInvoiceShipperCdGreaterThanEqual = relateInvoiceShipperCdGreaterThanEqual;
    }

    /**
     * relateInvoiceShipperCdLessThan のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCdLessThan
     */
    public String getRelateInvoiceShipperCdLessThan() {
        return relateInvoiceShipperCdLessThan;
    }

    /**
     * relateInvoiceShipperCdLessThan のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCdLessThan relateInvoiceShipperCdLessThan に設定する
     */
    public void setRelateInvoiceShipperCdLessThan(String relateInvoiceShipperCdLessThan) {
        this.relateInvoiceShipperCdLessThan = relateInvoiceShipperCdLessThan;
    }

    /**
     * relateInvoiceShipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCdLessThanEqual
     */
    public String getRelateInvoiceShipperCdLessThanEqual() {
        return relateInvoiceShipperCdLessThanEqual;
    }

    /**
     * relateInvoiceShipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCdLessThanEqual relateInvoiceShipperCdLessThanEqual に設定する
     */
    public void setRelateInvoiceShipperCdLessThanEqual(String relateInvoiceShipperCdLessThanEqual) {
        this.relateInvoiceShipperCdLessThanEqual = relateInvoiceShipperCdLessThanEqual;
    }

    /**
     * relateInvoiceShipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the relateInvoiceShipperCdLikeFront
     */
    public String getRelateInvoiceShipperCdLikeFront() {
        return relateInvoiceShipperCdLikeFront;
    }

    /**
     * relateInvoiceShipperCdLikeFront のセッターメソッドです。
     * 
     * @param relateInvoiceShipperCdLikeFront relateInvoiceShipperCdLikeFront に設定する
     */
    public void setRelateInvoiceShipperCdLikeFront(String relateInvoiceShipperCdLikeFront) {
        this.relateInvoiceShipperCdLikeFront = relateInvoiceShipperCdLikeFront;
    }

    /**
     * relateInvoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceIssueDtGreaterThanEqual
     */
    public Date getRelateInvoiceIssueDtGreaterThanEqual() {
        return relateInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * relateInvoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceIssueDtGreaterThanEqual relateInvoiceIssueDtGreaterThanEqual に設定する
     */
    public void setRelateInvoiceIssueDtGreaterThanEqual(Date relateInvoiceIssueDtGreaterThanEqual) {
        this.relateInvoiceIssueDtGreaterThanEqual = relateInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * relateInvoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the relateInvoiceIssueDtLessThanEqual
     */
    public Date getRelateInvoiceIssueDtLessThanEqual() {
        return relateInvoiceIssueDtLessThanEqual;
    }

    /**
     * relateInvoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param relateInvoiceIssueDtLessThanEqual relateInvoiceIssueDtLessThanEqual に設定する
     */
    public void setRelateInvoiceIssueDtLessThanEqual(Date relateInvoiceIssueDtLessThanEqual) {
        this.relateInvoiceIssueDtLessThanEqual = relateInvoiceIssueDtLessThanEqual;
    }

    /**
     * consigneeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThan
     */
    public String getConsigneeCdGreaterThan() {
        return consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThan consigneeCdGreaterThan に設定する
     */
    public void setConsigneeCdGreaterThan(String consigneeCdGreaterThan) {
        this.consigneeCdGreaterThan = consigneeCdGreaterThan;
    }

    /**
     * consigneeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdGreaterThanEqual
     */
    public String getConsigneeCdGreaterThanEqual() {
        return consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdGreaterThanEqual consigneeCdGreaterThanEqual に設定する
     */
    public void setConsigneeCdGreaterThanEqual(String consigneeCdGreaterThanEqual) {
        this.consigneeCdGreaterThanEqual = consigneeCdGreaterThanEqual;
    }

    /**
     * consigneeCdLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThan
     */
    public String getConsigneeCdLessThan() {
        return consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThan のセッターメソッドです。
     * 
     * @param consigneeCdLessThan consigneeCdLessThan に設定する
     */
    public void setConsigneeCdLessThan(String consigneeCdLessThan) {
        this.consigneeCdLessThan = consigneeCdLessThan;
    }

    /**
     * consigneeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCdLessThanEqual
     */
    public String getConsigneeCdLessThanEqual() {
        return consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCdLessThanEqual consigneeCdLessThanEqual に設定する
     */
    public void setConsigneeCdLessThanEqual(String consigneeCdLessThanEqual) {
        this.consigneeCdLessThanEqual = consigneeCdLessThanEqual;
    }

    /**
     * consigneeCdLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCdLikeFront
     */
    public String getConsigneeCdLikeFront() {
        return consigneeCdLikeFront;
    }

    /**
     * consigneeCdLikeFront のセッターメソッドです。
     * 
     * @param consigneeCdLikeFront consigneeCdLikeFront に設定する
     */
    public void setConsigneeCdLikeFront(String consigneeCdLikeFront) {
        this.consigneeCdLikeFront = consigneeCdLikeFront;
    }

    /**
     * frtShipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the frtShipperCdGreaterThan
     */
    public String getFrtShipperCdGreaterThan() {
        return frtShipperCdGreaterThan;
    }

    /**
     * frtShipperCdGreaterThan のセッターメソッドです。
     * 
     * @param frtShipperCdGreaterThan frtShipperCdGreaterThan に設定する
     */
    public void setFrtShipperCdGreaterThan(String frtShipperCdGreaterThan) {
        this.frtShipperCdGreaterThan = frtShipperCdGreaterThan;
    }

    /**
     * frtShipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the frtShipperCdGreaterThanEqual
     */
    public String getFrtShipperCdGreaterThanEqual() {
        return frtShipperCdGreaterThanEqual;
    }

    /**
     * frtShipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param frtShipperCdGreaterThanEqual frtShipperCdGreaterThanEqual に設定する
     */
    public void setFrtShipperCdGreaterThanEqual(String frtShipperCdGreaterThanEqual) {
        this.frtShipperCdGreaterThanEqual = frtShipperCdGreaterThanEqual;
    }

    /**
     * frtShipperCdLessThan のゲッターメソッドです。
     * 
     * @return the frtShipperCdLessThan
     */
    public String getFrtShipperCdLessThan() {
        return frtShipperCdLessThan;
    }

    /**
     * frtShipperCdLessThan のセッターメソッドです。
     * 
     * @param frtShipperCdLessThan frtShipperCdLessThan に設定する
     */
    public void setFrtShipperCdLessThan(String frtShipperCdLessThan) {
        this.frtShipperCdLessThan = frtShipperCdLessThan;
    }

    /**
     * frtShipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the frtShipperCdLessThanEqual
     */
    public String getFrtShipperCdLessThanEqual() {
        return frtShipperCdLessThanEqual;
    }

    /**
     * frtShipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param frtShipperCdLessThanEqual frtShipperCdLessThanEqual に設定する
     */
    public void setFrtShipperCdLessThanEqual(String frtShipperCdLessThanEqual) {
        this.frtShipperCdLessThanEqual = frtShipperCdLessThanEqual;
    }

    /**
     * frtShipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the frtShipperCdLikeFront
     */
    public String getFrtShipperCdLikeFront() {
        return frtShipperCdLikeFront;
    }

    /**
     * frtShipperCdLikeFront のセッターメソッドです。
     * 
     * @param frtShipperCdLikeFront frtShipperCdLikeFront に設定する
     */
    public void setFrtShipperCdLikeFront(String frtShipperCdLikeFront) {
        this.frtShipperCdLikeFront = frtShipperCdLikeFront;
    }

    /**
     * frtConsigneeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the frtConsigneeCdGreaterThan
     */
    public String getFrtConsigneeCdGreaterThan() {
        return frtConsigneeCdGreaterThan;
    }

    /**
     * frtConsigneeCdGreaterThan のセッターメソッドです。
     * 
     * @param frtConsigneeCdGreaterThan frtConsigneeCdGreaterThan に設定する
     */
    public void setFrtConsigneeCdGreaterThan(String frtConsigneeCdGreaterThan) {
        this.frtConsigneeCdGreaterThan = frtConsigneeCdGreaterThan;
    }

    /**
     * frtConsigneeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the frtConsigneeCdGreaterThanEqual
     */
    public String getFrtConsigneeCdGreaterThanEqual() {
        return frtConsigneeCdGreaterThanEqual;
    }

    /**
     * frtConsigneeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param frtConsigneeCdGreaterThanEqual frtConsigneeCdGreaterThanEqual に設定する
     */
    public void setFrtConsigneeCdGreaterThanEqual(String frtConsigneeCdGreaterThanEqual) {
        this.frtConsigneeCdGreaterThanEqual = frtConsigneeCdGreaterThanEqual;
    }

    /**
     * frtConsigneeCdLessThan のゲッターメソッドです。
     * 
     * @return the frtConsigneeCdLessThan
     */
    public String getFrtConsigneeCdLessThan() {
        return frtConsigneeCdLessThan;
    }

    /**
     * frtConsigneeCdLessThan のセッターメソッドです。
     * 
     * @param frtConsigneeCdLessThan frtConsigneeCdLessThan に設定する
     */
    public void setFrtConsigneeCdLessThan(String frtConsigneeCdLessThan) {
        this.frtConsigneeCdLessThan = frtConsigneeCdLessThan;
    }

    /**
     * frtConsigneeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the frtConsigneeCdLessThanEqual
     */
    public String getFrtConsigneeCdLessThanEqual() {
        return frtConsigneeCdLessThanEqual;
    }

    /**
     * frtConsigneeCdLessThanEqual のセッターメソッドです。
     * 
     * @param frtConsigneeCdLessThanEqual frtConsigneeCdLessThanEqual に設定する
     */
    public void setFrtConsigneeCdLessThanEqual(String frtConsigneeCdLessThanEqual) {
        this.frtConsigneeCdLessThanEqual = frtConsigneeCdLessThanEqual;
    }

    /**
     * frtConsigneeCdLikeFront のゲッターメソッドです。
     * 
     * @return the frtConsigneeCdLikeFront
     */
    public String getFrtConsigneeCdLikeFront() {
        return frtConsigneeCdLikeFront;
    }

    /**
     * frtConsigneeCdLikeFront のセッターメソッドです。
     * 
     * @param frtConsigneeCdLikeFront frtConsigneeCdLikeFront に設定する
     */
    public void setFrtConsigneeCdLikeFront(String frtConsigneeCdLikeFront) {
        this.frtConsigneeCdLikeFront = frtConsigneeCdLikeFront;
    }

    /**
     * shipToCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThan
     */
    public String getShipToCdGreaterThan() {
        return shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCdGreaterThan shipToCdGreaterThan に設定する
     */
    public void setShipToCdGreaterThan(String shipToCdGreaterThan) {
        this.shipToCdGreaterThan = shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThanEqual
     */
    public String getShipToCdGreaterThanEqual() {
        return shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCdGreaterThanEqual shipToCdGreaterThanEqual に設定する
     */
    public void setShipToCdGreaterThanEqual(String shipToCdGreaterThanEqual) {
        this.shipToCdGreaterThanEqual = shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCdLessThan
     */
    public String getShipToCdLessThan() {
        return shipToCdLessThan;
    }

    /**
     * shipToCdLessThan のセッターメソッドです。
     * 
     * @param shipToCdLessThan shipToCdLessThan に設定する
     */
    public void setShipToCdLessThan(String shipToCdLessThan) {
        this.shipToCdLessThan = shipToCdLessThan;
    }

    /**
     * shipToCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdLessThanEqual
     */
    public String getShipToCdLessThanEqual() {
        return shipToCdLessThanEqual;
    }

    /**
     * shipToCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCdLessThanEqual shipToCdLessThanEqual に設定する
     */
    public void setShipToCdLessThanEqual(String shipToCdLessThanEqual) {
        this.shipToCdLessThanEqual = shipToCdLessThanEqual;
    }

    /**
     * shipToCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCdLikeFront
     */
    public String getShipToCdLikeFront() {
        return shipToCdLikeFront;
    }

    /**
     * shipToCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCdLikeFront shipToCdLikeFront に設定する
     */
    public void setShipToCdLikeFront(String shipToCdLikeFront) {
        this.shipToCdLikeFront = shipToCdLikeFront;
    }

    /**
     * shipToCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThan
     */
    public String getShipToCompCdGreaterThan() {
        return shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThan shipToCompCdGreaterThan に設定する
     */
    public void setShipToCompCdGreaterThan(String shipToCompCdGreaterThan) {
        this.shipToCompCdGreaterThan = shipToCompCdGreaterThan;
    }

    /**
     * shipToCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdGreaterThanEqual
     */
    public String getShipToCompCdGreaterThanEqual() {
        return shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdGreaterThanEqual shipToCompCdGreaterThanEqual に設定する
     */
    public void setShipToCompCdGreaterThanEqual(String shipToCompCdGreaterThanEqual) {
        this.shipToCompCdGreaterThanEqual = shipToCompCdGreaterThanEqual;
    }

    /**
     * shipToCompCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThan
     */
    public String getShipToCompCdLessThan() {
        return shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThan のセッターメソッドです。
     * 
     * @param shipToCompCdLessThan shipToCompCdLessThan に設定する
     */
    public void setShipToCompCdLessThan(String shipToCompCdLessThan) {
        this.shipToCompCdLessThan = shipToCompCdLessThan;
    }

    /**
     * shipToCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCompCdLessThanEqual
     */
    public String getShipToCompCdLessThanEqual() {
        return shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCompCdLessThanEqual shipToCompCdLessThanEqual に設定する
     */
    public void setShipToCompCdLessThanEqual(String shipToCompCdLessThanEqual) {
        this.shipToCompCdLessThanEqual = shipToCompCdLessThanEqual;
    }

    /**
     * shipToCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCompCdLikeFront
     */
    public String getShipToCompCdLikeFront() {
        return shipToCompCdLikeFront;
    }

    /**
     * shipToCompCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCompCdLikeFront shipToCompCdLikeFront に設定する
     */
    public void setShipToCompCdLikeFront(String shipToCompCdLikeFront) {
        this.shipToCompCdLikeFront = shipToCompCdLikeFront;
    }

    /**
     * customerCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThan
     */
    public String getCustomerCdGreaterThan() {
        return customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThan のセッターメソッドです。
     * 
     * @param customerCdGreaterThan customerCdGreaterThan に設定する
     */
    public void setCustomerCdGreaterThan(String customerCdGreaterThan) {
        this.customerCdGreaterThan = customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThanEqual
     */
    public String getCustomerCdGreaterThanEqual() {
        return customerCdGreaterThanEqual;
    }

    /**
     * customerCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerCdGreaterThanEqual customerCdGreaterThanEqual に設定する
     */
    public void setCustomerCdGreaterThanEqual(String customerCdGreaterThanEqual) {
        this.customerCdGreaterThanEqual = customerCdGreaterThanEqual;
    }

    /**
     * customerCdLessThan のゲッターメソッドです。
     * 
     * @return the customerCdLessThan
     */
    public String getCustomerCdLessThan() {
        return customerCdLessThan;
    }

    /**
     * customerCdLessThan のセッターメソッドです。
     * 
     * @param customerCdLessThan customerCdLessThan に設定する
     */
    public void setCustomerCdLessThan(String customerCdLessThan) {
        this.customerCdLessThan = customerCdLessThan;
    }

    /**
     * customerCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdLessThanEqual
     */
    public String getCustomerCdLessThanEqual() {
        return customerCdLessThanEqual;
    }

    /**
     * customerCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerCdLessThanEqual customerCdLessThanEqual に設定する
     */
    public void setCustomerCdLessThanEqual(String customerCdLessThanEqual) {
        this.customerCdLessThanEqual = customerCdLessThanEqual;
    }

    /**
     * customerCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerCdLikeFront
     */
    public String getCustomerCdLikeFront() {
        return customerCdLikeFront;
    }

    /**
     * customerCdLikeFront のセッターメソッドです。
     * 
     * @param customerCdLikeFront customerCdLikeFront に設定する
     */
    public void setCustomerCdLikeFront(String customerCdLikeFront) {
        this.customerCdLikeFront = customerCdLikeFront;
    }

    /**
     * lgcyShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThan
     */
    public String getLgcyShipToGreaterThan() {
        return lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThan のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThan lgcyShipToGreaterThan に設定する
     */
    public void setLgcyShipToGreaterThan(String lgcyShipToGreaterThan) {
        this.lgcyShipToGreaterThan = lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThanEqual
     */
    public String getLgcyShipToGreaterThanEqual() {
        return lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThanEqual lgcyShipToGreaterThanEqual に設定する
     */
    public void setLgcyShipToGreaterThanEqual(String lgcyShipToGreaterThanEqual) {
        this.lgcyShipToGreaterThanEqual = lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToLessThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThan
     */
    public String getLgcyShipToLessThan() {
        return lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThan のセッターメソッドです。
     * 
     * @param lgcyShipToLessThan lgcyShipToLessThan に設定する
     */
    public void setLgcyShipToLessThan(String lgcyShipToLessThan) {
        this.lgcyShipToLessThan = lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThanEqual
     */
    public String getLgcyShipToLessThanEqual() {
        return lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToLessThanEqual lgcyShipToLessThanEqual に設定する
     */
    public void setLgcyShipToLessThanEqual(String lgcyShipToLessThanEqual) {
        this.lgcyShipToLessThanEqual = lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyShipToLikeFront
     */
    public String getLgcyShipToLikeFront() {
        return lgcyShipToLikeFront;
    }

    /**
     * lgcyShipToLikeFront のセッターメソッドです。
     * 
     * @param lgcyShipToLikeFront lgcyShipToLikeFront に設定する
     */
    public void setLgcyShipToLikeFront(String lgcyShipToLikeFront) {
        this.lgcyShipToLikeFront = lgcyShipToLikeFront;
    }

    /**
     * invoiceCtgryGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThan
     */
    public String getInvoiceCtgryGreaterThan() {
        return invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThan のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThan invoiceCtgryGreaterThan に設定する
     */
    public void setInvoiceCtgryGreaterThan(String invoiceCtgryGreaterThan) {
        this.invoiceCtgryGreaterThan = invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThanEqual
     */
    public String getInvoiceCtgryGreaterThanEqual() {
        return invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThanEqual invoiceCtgryGreaterThanEqual に設定する
     */
    public void setInvoiceCtgryGreaterThanEqual(String invoiceCtgryGreaterThanEqual) {
        this.invoiceCtgryGreaterThanEqual = invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryLessThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThan
     */
    public String getInvoiceCtgryLessThan() {
        return invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThan のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThan invoiceCtgryLessThan に設定する
     */
    public void setInvoiceCtgryLessThan(String invoiceCtgryLessThan) {
        this.invoiceCtgryLessThan = invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThanEqual
     */
    public String getInvoiceCtgryLessThanEqual() {
        return invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThanEqual invoiceCtgryLessThanEqual に設定する
     */
    public void setInvoiceCtgryLessThanEqual(String invoiceCtgryLessThanEqual) {
        this.invoiceCtgryLessThanEqual = invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLikeFront
     */
    public String getInvoiceCtgryLikeFront() {
        return invoiceCtgryLikeFront;
    }

    /**
     * invoiceCtgryLikeFront のセッターメソッドです。
     * 
     * @param invoiceCtgryLikeFront invoiceCtgryLikeFront に設定する
     */
    public void setInvoiceCtgryLikeFront(String invoiceCtgryLikeFront) {
        this.invoiceCtgryLikeFront = invoiceCtgryLikeFront;
    }

    /**
     * invoiceCtgryNmGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNmGreaterThan
     */
    public String getInvoiceCtgryNmGreaterThan() {
        return invoiceCtgryNmGreaterThan;
    }

    /**
     * invoiceCtgryNmGreaterThan のセッターメソッドです。
     * 
     * @param invoiceCtgryNmGreaterThan invoiceCtgryNmGreaterThan に設定する
     */
    public void setInvoiceCtgryNmGreaterThan(String invoiceCtgryNmGreaterThan) {
        this.invoiceCtgryNmGreaterThan = invoiceCtgryNmGreaterThan;
    }

    /**
     * invoiceCtgryNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNmGreaterThanEqual
     */
    public String getInvoiceCtgryNmGreaterThanEqual() {
        return invoiceCtgryNmGreaterThanEqual;
    }

    /**
     * invoiceCtgryNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryNmGreaterThanEqual invoiceCtgryNmGreaterThanEqual に設定する
     */
    public void setInvoiceCtgryNmGreaterThanEqual(String invoiceCtgryNmGreaterThanEqual) {
        this.invoiceCtgryNmGreaterThanEqual = invoiceCtgryNmGreaterThanEqual;
    }

    /**
     * invoiceCtgryNmLessThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNmLessThan
     */
    public String getInvoiceCtgryNmLessThan() {
        return invoiceCtgryNmLessThan;
    }

    /**
     * invoiceCtgryNmLessThan のセッターメソッドです。
     * 
     * @param invoiceCtgryNmLessThan invoiceCtgryNmLessThan に設定する
     */
    public void setInvoiceCtgryNmLessThan(String invoiceCtgryNmLessThan) {
        this.invoiceCtgryNmLessThan = invoiceCtgryNmLessThan;
    }

    /**
     * invoiceCtgryNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNmLessThanEqual
     */
    public String getInvoiceCtgryNmLessThanEqual() {
        return invoiceCtgryNmLessThanEqual;
    }

    /**
     * invoiceCtgryNmLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryNmLessThanEqual invoiceCtgryNmLessThanEqual に設定する
     */
    public void setInvoiceCtgryNmLessThanEqual(String invoiceCtgryNmLessThanEqual) {
        this.invoiceCtgryNmLessThanEqual = invoiceCtgryNmLessThanEqual;
    }

    /**
     * invoiceCtgryNmLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceCtgryNmLikeFront
     */
    public String getInvoiceCtgryNmLikeFront() {
        return invoiceCtgryNmLikeFront;
    }

    /**
     * invoiceCtgryNmLikeFront のセッターメソッドです。
     * 
     * @param invoiceCtgryNmLikeFront invoiceCtgryNmLikeFront に設定する
     */
    public void setInvoiceCtgryNmLikeFront(String invoiceCtgryNmLikeFront) {
        this.invoiceCtgryNmLikeFront = invoiceCtgryNmLikeFront;
    }

    /**
     * shippedDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippedDtGreaterThanEqual
     */
    public Date getShippedDtGreaterThanEqual() {
        return shippedDtGreaterThanEqual;
    }

    /**
     * shippedDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippedDtGreaterThanEqual shippedDtGreaterThanEqual に設定する
     */
    public void setShippedDtGreaterThanEqual(Date shippedDtGreaterThanEqual) {
        this.shippedDtGreaterThanEqual = shippedDtGreaterThanEqual;
    }

    /**
     * shippedDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippedDtLessThanEqual
     */
    public Date getShippedDtLessThanEqual() {
        return shippedDtLessThanEqual;
    }

    /**
     * shippedDtLessThanEqual のセッターメソッドです。
     * 
     * @param shippedDtLessThanEqual shippedDtLessThanEqual に設定する
     */
    public void setShippedDtLessThanEqual(Date shippedDtLessThanEqual) {
        this.shippedDtLessThanEqual = shippedDtLessThanEqual;
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
     * trnsNmGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsNmGreaterThan
     */
    public String getTrnsNmGreaterThan() {
        return trnsNmGreaterThan;
    }

    /**
     * trnsNmGreaterThan のセッターメソッドです。
     * 
     * @param trnsNmGreaterThan trnsNmGreaterThan に設定する
     */
    public void setTrnsNmGreaterThan(String trnsNmGreaterThan) {
        this.trnsNmGreaterThan = trnsNmGreaterThan;
    }

    /**
     * trnsNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsNmGreaterThanEqual
     */
    public String getTrnsNmGreaterThanEqual() {
        return trnsNmGreaterThanEqual;
    }

    /**
     * trnsNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsNmGreaterThanEqual trnsNmGreaterThanEqual に設定する
     */
    public void setTrnsNmGreaterThanEqual(String trnsNmGreaterThanEqual) {
        this.trnsNmGreaterThanEqual = trnsNmGreaterThanEqual;
    }

    /**
     * trnsNmLessThan のゲッターメソッドです。
     * 
     * @return the trnsNmLessThan
     */
    public String getTrnsNmLessThan() {
        return trnsNmLessThan;
    }

    /**
     * trnsNmLessThan のセッターメソッドです。
     * 
     * @param trnsNmLessThan trnsNmLessThan に設定する
     */
    public void setTrnsNmLessThan(String trnsNmLessThan) {
        this.trnsNmLessThan = trnsNmLessThan;
    }

    /**
     * trnsNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsNmLessThanEqual
     */
    public String getTrnsNmLessThanEqual() {
        return trnsNmLessThanEqual;
    }

    /**
     * trnsNmLessThanEqual のセッターメソッドです。
     * 
     * @param trnsNmLessThanEqual trnsNmLessThanEqual に設定する
     */
    public void setTrnsNmLessThanEqual(String trnsNmLessThanEqual) {
        this.trnsNmLessThanEqual = trnsNmLessThanEqual;
    }

    /**
     * trnsNmLikeFront のゲッターメソッドです。
     * 
     * @return the trnsNmLikeFront
     */
    public String getTrnsNmLikeFront() {
        return trnsNmLikeFront;
    }

    /**
     * trnsNmLikeFront のセッターメソッドです。
     * 
     * @param trnsNmLikeFront trnsNmLikeFront に設定する
     */
    public void setTrnsNmLikeFront(String trnsNmLikeFront) {
        this.trnsNmLikeFront = trnsNmLikeFront;
    }

    /**
     * trnsCdOrgGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdOrgGreaterThan
     */
    public String getTrnsCdOrgGreaterThan() {
        return trnsCdOrgGreaterThan;
    }

    /**
     * trnsCdOrgGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdOrgGreaterThan trnsCdOrgGreaterThan に設定する
     */
    public void setTrnsCdOrgGreaterThan(String trnsCdOrgGreaterThan) {
        this.trnsCdOrgGreaterThan = trnsCdOrgGreaterThan;
    }

    /**
     * trnsCdOrgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdOrgGreaterThanEqual
     */
    public String getTrnsCdOrgGreaterThanEqual() {
        return trnsCdOrgGreaterThanEqual;
    }

    /**
     * trnsCdOrgGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdOrgGreaterThanEqual trnsCdOrgGreaterThanEqual に設定する
     */
    public void setTrnsCdOrgGreaterThanEqual(String trnsCdOrgGreaterThanEqual) {
        this.trnsCdOrgGreaterThanEqual = trnsCdOrgGreaterThanEqual;
    }

    /**
     * trnsCdOrgLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLessThan
     */
    public String getTrnsCdOrgLessThan() {
        return trnsCdOrgLessThan;
    }

    /**
     * trnsCdOrgLessThan のセッターメソッドです。
     * 
     * @param trnsCdOrgLessThan trnsCdOrgLessThan に設定する
     */
    public void setTrnsCdOrgLessThan(String trnsCdOrgLessThan) {
        this.trnsCdOrgLessThan = trnsCdOrgLessThan;
    }

    /**
     * trnsCdOrgLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLessThanEqual
     */
    public String getTrnsCdOrgLessThanEqual() {
        return trnsCdOrgLessThanEqual;
    }

    /**
     * trnsCdOrgLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdOrgLessThanEqual trnsCdOrgLessThanEqual に設定する
     */
    public void setTrnsCdOrgLessThanEqual(String trnsCdOrgLessThanEqual) {
        this.trnsCdOrgLessThanEqual = trnsCdOrgLessThanEqual;
    }

    /**
     * trnsCdOrgLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdOrgLikeFront
     */
    public String getTrnsCdOrgLikeFront() {
        return trnsCdOrgLikeFront;
    }

    /**
     * trnsCdOrgLikeFront のセッターメソッドです。
     * 
     * @param trnsCdOrgLikeFront trnsCdOrgLikeFront に設定する
     */
    public void setTrnsCdOrgLikeFront(String trnsCdOrgLikeFront) {
        this.trnsCdOrgLikeFront = trnsCdOrgLikeFront;
    }

    /**
     * etdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etdGreaterThanEqual
     */
    public Date getEtdGreaterThanEqual() {
        return etdGreaterThanEqual;
    }

    /**
     * etdGreaterThanEqual のセッターメソッドです。
     * 
     * @param etdGreaterThanEqual etdGreaterThanEqual に設定する
     */
    public void setEtdGreaterThanEqual(Date etdGreaterThanEqual) {
        this.etdGreaterThanEqual = etdGreaterThanEqual;
    }

    /**
     * etdLessThanEqual のゲッターメソッドです。
     * 
     * @return the etdLessThanEqual
     */
    public Date getEtdLessThanEqual() {
        return etdLessThanEqual;
    }

    /**
     * etdLessThanEqual のセッターメソッドです。
     * 
     * @param etdLessThanEqual etdLessThanEqual に設定する
     */
    public void setEtdLessThanEqual(Date etdLessThanEqual) {
        this.etdLessThanEqual = etdLessThanEqual;
    }

    /**
     * etaGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the etaGreaterThanEqual
     */
    public Date getEtaGreaterThanEqual() {
        return etaGreaterThanEqual;
    }

    /**
     * etaGreaterThanEqual のセッターメソッドです。
     * 
     * @param etaGreaterThanEqual etaGreaterThanEqual に設定する
     */
    public void setEtaGreaterThanEqual(Date etaGreaterThanEqual) {
        this.etaGreaterThanEqual = etaGreaterThanEqual;
    }

    /**
     * etaLessThanEqual のゲッターメソッドです。
     * 
     * @return the etaLessThanEqual
     */
    public Date getEtaLessThanEqual() {
        return etaLessThanEqual;
    }

    /**
     * etaLessThanEqual のセッターメソッドです。
     * 
     * @param etaLessThanEqual etaLessThanEqual に設定する
     */
    public void setEtaLessThanEqual(Date etaLessThanEqual) {
        this.etaLessThanEqual = etaLessThanEqual;
    }

    /**
     * arrivalTimeGreaterThan のゲッターメソッドです。
     * 
     * @return the arrivalTimeGreaterThan
     */
    public String getArrivalTimeGreaterThan() {
        return arrivalTimeGreaterThan;
    }

    /**
     * arrivalTimeGreaterThan のセッターメソッドです。
     * 
     * @param arrivalTimeGreaterThan arrivalTimeGreaterThan に設定する
     */
    public void setArrivalTimeGreaterThan(String arrivalTimeGreaterThan) {
        this.arrivalTimeGreaterThan = arrivalTimeGreaterThan;
    }

    /**
     * arrivalTimeGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the arrivalTimeGreaterThanEqual
     */
    public String getArrivalTimeGreaterThanEqual() {
        return arrivalTimeGreaterThanEqual;
    }

    /**
     * arrivalTimeGreaterThanEqual のセッターメソッドです。
     * 
     * @param arrivalTimeGreaterThanEqual arrivalTimeGreaterThanEqual に設定する
     */
    public void setArrivalTimeGreaterThanEqual(String arrivalTimeGreaterThanEqual) {
        this.arrivalTimeGreaterThanEqual = arrivalTimeGreaterThanEqual;
    }

    /**
     * arrivalTimeLessThan のゲッターメソッドです。
     * 
     * @return the arrivalTimeLessThan
     */
    public String getArrivalTimeLessThan() {
        return arrivalTimeLessThan;
    }

    /**
     * arrivalTimeLessThan のセッターメソッドです。
     * 
     * @param arrivalTimeLessThan arrivalTimeLessThan に設定する
     */
    public void setArrivalTimeLessThan(String arrivalTimeLessThan) {
        this.arrivalTimeLessThan = arrivalTimeLessThan;
    }

    /**
     * arrivalTimeLessThanEqual のゲッターメソッドです。
     * 
     * @return the arrivalTimeLessThanEqual
     */
    public String getArrivalTimeLessThanEqual() {
        return arrivalTimeLessThanEqual;
    }

    /**
     * arrivalTimeLessThanEqual のセッターメソッドです。
     * 
     * @param arrivalTimeLessThanEqual arrivalTimeLessThanEqual に設定する
     */
    public void setArrivalTimeLessThanEqual(String arrivalTimeLessThanEqual) {
        this.arrivalTimeLessThanEqual = arrivalTimeLessThanEqual;
    }

    /**
     * arrivalTimeLikeFront のゲッターメソッドです。
     * 
     * @return the arrivalTimeLikeFront
     */
    public String getArrivalTimeLikeFront() {
        return arrivalTimeLikeFront;
    }

    /**
     * arrivalTimeLikeFront のセッターメソッドです。
     * 
     * @param arrivalTimeLikeFront arrivalTimeLikeFront に設定する
     */
    public void setArrivalTimeLikeFront(String arrivalTimeLikeFront) {
        this.arrivalTimeLikeFront = arrivalTimeLikeFront;
    }

    /**
     * lPortCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lPortCntryCdGreaterThan
     */
    public String getLPortCntryCdGreaterThan() {
        return lPortCntryCdGreaterThan;
    }

    /**
     * lPortCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param lPortCntryCdGreaterThan lPortCntryCdGreaterThan に設定する
     */
    public void setLPortCntryCdGreaterThan(String lPortCntryCdGreaterThan) {
        this.lPortCntryCdGreaterThan = lPortCntryCdGreaterThan;
    }

    /**
     * lPortCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lPortCntryCdGreaterThanEqual
     */
    public String getLPortCntryCdGreaterThanEqual() {
        return lPortCntryCdGreaterThanEqual;
    }

    /**
     * lPortCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lPortCntryCdGreaterThanEqual lPortCntryCdGreaterThanEqual に設定する
     */
    public void setLPortCntryCdGreaterThanEqual(String lPortCntryCdGreaterThanEqual) {
        this.lPortCntryCdGreaterThanEqual = lPortCntryCdGreaterThanEqual;
    }

    /**
     * lPortCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the lPortCntryCdLessThan
     */
    public String getLPortCntryCdLessThan() {
        return lPortCntryCdLessThan;
    }

    /**
     * lPortCntryCdLessThan のセッターメソッドです。
     * 
     * @param lPortCntryCdLessThan lPortCntryCdLessThan に設定する
     */
    public void setLPortCntryCdLessThan(String lPortCntryCdLessThan) {
        this.lPortCntryCdLessThan = lPortCntryCdLessThan;
    }

    /**
     * lPortCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lPortCntryCdLessThanEqual
     */
    public String getLPortCntryCdLessThanEqual() {
        return lPortCntryCdLessThanEqual;
    }

    /**
     * lPortCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param lPortCntryCdLessThanEqual lPortCntryCdLessThanEqual に設定する
     */
    public void setLPortCntryCdLessThanEqual(String lPortCntryCdLessThanEqual) {
        this.lPortCntryCdLessThanEqual = lPortCntryCdLessThanEqual;
    }

    /**
     * lPortCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the lPortCntryCdLikeFront
     */
    public String getLPortCntryCdLikeFront() {
        return lPortCntryCdLikeFront;
    }

    /**
     * lPortCntryCdLikeFront のセッターメソッドです。
     * 
     * @param lPortCntryCdLikeFront lPortCntryCdLikeFront に設定する
     */
    public void setLPortCntryCdLikeFront(String lPortCntryCdLikeFront) {
        this.lPortCntryCdLikeFront = lPortCntryCdLikeFront;
    }

    /**
     * loadingPortCdGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingPortCdGreaterThan
     */
    public String getLoadingPortCdGreaterThan() {
        return loadingPortCdGreaterThan;
    }

    /**
     * loadingPortCdGreaterThan のセッターメソッドです。
     * 
     * @param loadingPortCdGreaterThan loadingPortCdGreaterThan に設定する
     */
    public void setLoadingPortCdGreaterThan(String loadingPortCdGreaterThan) {
        this.loadingPortCdGreaterThan = loadingPortCdGreaterThan;
    }

    /**
     * loadingPortCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingPortCdGreaterThanEqual
     */
    public String getLoadingPortCdGreaterThanEqual() {
        return loadingPortCdGreaterThanEqual;
    }

    /**
     * loadingPortCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingPortCdGreaterThanEqual loadingPortCdGreaterThanEqual に設定する
     */
    public void setLoadingPortCdGreaterThanEqual(String loadingPortCdGreaterThanEqual) {
        this.loadingPortCdGreaterThanEqual = loadingPortCdGreaterThanEqual;
    }

    /**
     * loadingPortCdLessThan のゲッターメソッドです。
     * 
     * @return the loadingPortCdLessThan
     */
    public String getLoadingPortCdLessThan() {
        return loadingPortCdLessThan;
    }

    /**
     * loadingPortCdLessThan のセッターメソッドです。
     * 
     * @param loadingPortCdLessThan loadingPortCdLessThan に設定する
     */
    public void setLoadingPortCdLessThan(String loadingPortCdLessThan) {
        this.loadingPortCdLessThan = loadingPortCdLessThan;
    }

    /**
     * loadingPortCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingPortCdLessThanEqual
     */
    public String getLoadingPortCdLessThanEqual() {
        return loadingPortCdLessThanEqual;
    }

    /**
     * loadingPortCdLessThanEqual のセッターメソッドです。
     * 
     * @param loadingPortCdLessThanEqual loadingPortCdLessThanEqual に設定する
     */
    public void setLoadingPortCdLessThanEqual(String loadingPortCdLessThanEqual) {
        this.loadingPortCdLessThanEqual = loadingPortCdLessThanEqual;
    }

    /**
     * loadingPortCdLikeFront のゲッターメソッドです。
     * 
     * @return the loadingPortCdLikeFront
     */
    public String getLoadingPortCdLikeFront() {
        return loadingPortCdLikeFront;
    }

    /**
     * loadingPortCdLikeFront のセッターメソッドです。
     * 
     * @param loadingPortCdLikeFront loadingPortCdLikeFront に設定する
     */
    public void setLoadingPortCdLikeFront(String loadingPortCdLikeFront) {
        this.loadingPortCdLikeFront = loadingPortCdLikeFront;
    }

    /**
     * loadingPortNmGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingPortNmGreaterThan
     */
    public String getLoadingPortNmGreaterThan() {
        return loadingPortNmGreaterThan;
    }

    /**
     * loadingPortNmGreaterThan のセッターメソッドです。
     * 
     * @param loadingPortNmGreaterThan loadingPortNmGreaterThan に設定する
     */
    public void setLoadingPortNmGreaterThan(String loadingPortNmGreaterThan) {
        this.loadingPortNmGreaterThan = loadingPortNmGreaterThan;
    }

    /**
     * loadingPortNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingPortNmGreaterThanEqual
     */
    public String getLoadingPortNmGreaterThanEqual() {
        return loadingPortNmGreaterThanEqual;
    }

    /**
     * loadingPortNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingPortNmGreaterThanEqual loadingPortNmGreaterThanEqual に設定する
     */
    public void setLoadingPortNmGreaterThanEqual(String loadingPortNmGreaterThanEqual) {
        this.loadingPortNmGreaterThanEqual = loadingPortNmGreaterThanEqual;
    }

    /**
     * loadingPortNmLessThan のゲッターメソッドです。
     * 
     * @return the loadingPortNmLessThan
     */
    public String getLoadingPortNmLessThan() {
        return loadingPortNmLessThan;
    }

    /**
     * loadingPortNmLessThan のセッターメソッドです。
     * 
     * @param loadingPortNmLessThan loadingPortNmLessThan に設定する
     */
    public void setLoadingPortNmLessThan(String loadingPortNmLessThan) {
        this.loadingPortNmLessThan = loadingPortNmLessThan;
    }

    /**
     * loadingPortNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingPortNmLessThanEqual
     */
    public String getLoadingPortNmLessThanEqual() {
        return loadingPortNmLessThanEqual;
    }

    /**
     * loadingPortNmLessThanEqual のセッターメソッドです。
     * 
     * @param loadingPortNmLessThanEqual loadingPortNmLessThanEqual に設定する
     */
    public void setLoadingPortNmLessThanEqual(String loadingPortNmLessThanEqual) {
        this.loadingPortNmLessThanEqual = loadingPortNmLessThanEqual;
    }

    /**
     * loadingPortNmLikeFront のゲッターメソッドです。
     * 
     * @return the loadingPortNmLikeFront
     */
    public String getLoadingPortNmLikeFront() {
        return loadingPortNmLikeFront;
    }

    /**
     * loadingPortNmLikeFront のセッターメソッドです。
     * 
     * @param loadingPortNmLikeFront loadingPortNmLikeFront に設定する
     */
    public void setLoadingPortNmLikeFront(String loadingPortNmLikeFront) {
        this.loadingPortNmLikeFront = loadingPortNmLikeFront;
    }

    /**
     * dPortCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the dPortCntryCdGreaterThan
     */
    public String getDPortCntryCdGreaterThan() {
        return dPortCntryCdGreaterThan;
    }

    /**
     * dPortCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param dPortCntryCdGreaterThan dPortCntryCdGreaterThan に設定する
     */
    public void setDPortCntryCdGreaterThan(String dPortCntryCdGreaterThan) {
        this.dPortCntryCdGreaterThan = dPortCntryCdGreaterThan;
    }

    /**
     * dPortCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dPortCntryCdGreaterThanEqual
     */
    public String getDPortCntryCdGreaterThanEqual() {
        return dPortCntryCdGreaterThanEqual;
    }

    /**
     * dPortCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dPortCntryCdGreaterThanEqual dPortCntryCdGreaterThanEqual に設定する
     */
    public void setDPortCntryCdGreaterThanEqual(String dPortCntryCdGreaterThanEqual) {
        this.dPortCntryCdGreaterThanEqual = dPortCntryCdGreaterThanEqual;
    }

    /**
     * dPortCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the dPortCntryCdLessThan
     */
    public String getDPortCntryCdLessThan() {
        return dPortCntryCdLessThan;
    }

    /**
     * dPortCntryCdLessThan のセッターメソッドです。
     * 
     * @param dPortCntryCdLessThan dPortCntryCdLessThan に設定する
     */
    public void setDPortCntryCdLessThan(String dPortCntryCdLessThan) {
        this.dPortCntryCdLessThan = dPortCntryCdLessThan;
    }

    /**
     * dPortCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dPortCntryCdLessThanEqual
     */
    public String getDPortCntryCdLessThanEqual() {
        return dPortCntryCdLessThanEqual;
    }

    /**
     * dPortCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param dPortCntryCdLessThanEqual dPortCntryCdLessThanEqual に設定する
     */
    public void setDPortCntryCdLessThanEqual(String dPortCntryCdLessThanEqual) {
        this.dPortCntryCdLessThanEqual = dPortCntryCdLessThanEqual;
    }

    /**
     * dPortCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the dPortCntryCdLikeFront
     */
    public String getDPortCntryCdLikeFront() {
        return dPortCntryCdLikeFront;
    }

    /**
     * dPortCntryCdLikeFront のセッターメソッドです。
     * 
     * @param dPortCntryCdLikeFront dPortCntryCdLikeFront に設定する
     */
    public void setDPortCntryCdLikeFront(String dPortCntryCdLikeFront) {
        this.dPortCntryCdLikeFront = dPortCntryCdLikeFront;
    }

    /**
     * dischargePortCdGreaterThan のゲッターメソッドです。
     * 
     * @return the dischargePortCdGreaterThan
     */
    public String getDischargePortCdGreaterThan() {
        return dischargePortCdGreaterThan;
    }

    /**
     * dischargePortCdGreaterThan のセッターメソッドです。
     * 
     * @param dischargePortCdGreaterThan dischargePortCdGreaterThan に設定する
     */
    public void setDischargePortCdGreaterThan(String dischargePortCdGreaterThan) {
        this.dischargePortCdGreaterThan = dischargePortCdGreaterThan;
    }

    /**
     * dischargePortCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dischargePortCdGreaterThanEqual
     */
    public String getDischargePortCdGreaterThanEqual() {
        return dischargePortCdGreaterThanEqual;
    }

    /**
     * dischargePortCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dischargePortCdGreaterThanEqual dischargePortCdGreaterThanEqual に設定する
     */
    public void setDischargePortCdGreaterThanEqual(String dischargePortCdGreaterThanEqual) {
        this.dischargePortCdGreaterThanEqual = dischargePortCdGreaterThanEqual;
    }

    /**
     * dischargePortCdLessThan のゲッターメソッドです。
     * 
     * @return the dischargePortCdLessThan
     */
    public String getDischargePortCdLessThan() {
        return dischargePortCdLessThan;
    }

    /**
     * dischargePortCdLessThan のセッターメソッドです。
     * 
     * @param dischargePortCdLessThan dischargePortCdLessThan に設定する
     */
    public void setDischargePortCdLessThan(String dischargePortCdLessThan) {
        this.dischargePortCdLessThan = dischargePortCdLessThan;
    }

    /**
     * dischargePortCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dischargePortCdLessThanEqual
     */
    public String getDischargePortCdLessThanEqual() {
        return dischargePortCdLessThanEqual;
    }

    /**
     * dischargePortCdLessThanEqual のセッターメソッドです。
     * 
     * @param dischargePortCdLessThanEqual dischargePortCdLessThanEqual に設定する
     */
    public void setDischargePortCdLessThanEqual(String dischargePortCdLessThanEqual) {
        this.dischargePortCdLessThanEqual = dischargePortCdLessThanEqual;
    }

    /**
     * dischargePortCdLikeFront のゲッターメソッドです。
     * 
     * @return the dischargePortCdLikeFront
     */
    public String getDischargePortCdLikeFront() {
        return dischargePortCdLikeFront;
    }

    /**
     * dischargePortCdLikeFront のセッターメソッドです。
     * 
     * @param dischargePortCdLikeFront dischargePortCdLikeFront に設定する
     */
    public void setDischargePortCdLikeFront(String dischargePortCdLikeFront) {
        this.dischargePortCdLikeFront = dischargePortCdLikeFront;
    }

    /**
     * dischargePortNmGreaterThan のゲッターメソッドです。
     * 
     * @return the dischargePortNmGreaterThan
     */
    public String getDischargePortNmGreaterThan() {
        return dischargePortNmGreaterThan;
    }

    /**
     * dischargePortNmGreaterThan のセッターメソッドです。
     * 
     * @param dischargePortNmGreaterThan dischargePortNmGreaterThan に設定する
     */
    public void setDischargePortNmGreaterThan(String dischargePortNmGreaterThan) {
        this.dischargePortNmGreaterThan = dischargePortNmGreaterThan;
    }

    /**
     * dischargePortNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dischargePortNmGreaterThanEqual
     */
    public String getDischargePortNmGreaterThanEqual() {
        return dischargePortNmGreaterThanEqual;
    }

    /**
     * dischargePortNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param dischargePortNmGreaterThanEqual dischargePortNmGreaterThanEqual に設定する
     */
    public void setDischargePortNmGreaterThanEqual(String dischargePortNmGreaterThanEqual) {
        this.dischargePortNmGreaterThanEqual = dischargePortNmGreaterThanEqual;
    }

    /**
     * dischargePortNmLessThan のゲッターメソッドです。
     * 
     * @return the dischargePortNmLessThan
     */
    public String getDischargePortNmLessThan() {
        return dischargePortNmLessThan;
    }

    /**
     * dischargePortNmLessThan のセッターメソッドです。
     * 
     * @param dischargePortNmLessThan dischargePortNmLessThan に設定する
     */
    public void setDischargePortNmLessThan(String dischargePortNmLessThan) {
        this.dischargePortNmLessThan = dischargePortNmLessThan;
    }

    /**
     * dischargePortNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the dischargePortNmLessThanEqual
     */
    public String getDischargePortNmLessThanEqual() {
        return dischargePortNmLessThanEqual;
    }

    /**
     * dischargePortNmLessThanEqual のセッターメソッドです。
     * 
     * @param dischargePortNmLessThanEqual dischargePortNmLessThanEqual に設定する
     */
    public void setDischargePortNmLessThanEqual(String dischargePortNmLessThanEqual) {
        this.dischargePortNmLessThanEqual = dischargePortNmLessThanEqual;
    }

    /**
     * dischargePortNmLikeFront のゲッターメソッドです。
     * 
     * @return the dischargePortNmLikeFront
     */
    public String getDischargePortNmLikeFront() {
        return dischargePortNmLikeFront;
    }

    /**
     * dischargePortNmLikeFront のセッターメソッドです。
     * 
     * @param dischargePortNmLikeFront dischargePortNmLikeFront に設定する
     */
    public void setDischargePortNmLikeFront(String dischargePortNmLikeFront) {
        this.dischargePortNmLikeFront = dischargePortNmLikeFront;
    }

    /**
     * dlivPointGreaterThan のゲッターメソッドです。
     * 
     * @return the dlivPointGreaterThan
     */
    public String getDlivPointGreaterThan() {
        return dlivPointGreaterThan;
    }

    /**
     * dlivPointGreaterThan のセッターメソッドです。
     * 
     * @param dlivPointGreaterThan dlivPointGreaterThan に設定する
     */
    public void setDlivPointGreaterThan(String dlivPointGreaterThan) {
        this.dlivPointGreaterThan = dlivPointGreaterThan;
    }

    /**
     * dlivPointGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dlivPointGreaterThanEqual
     */
    public String getDlivPointGreaterThanEqual() {
        return dlivPointGreaterThanEqual;
    }

    /**
     * dlivPointGreaterThanEqual のセッターメソッドです。
     * 
     * @param dlivPointGreaterThanEqual dlivPointGreaterThanEqual に設定する
     */
    public void setDlivPointGreaterThanEqual(String dlivPointGreaterThanEqual) {
        this.dlivPointGreaterThanEqual = dlivPointGreaterThanEqual;
    }

    /**
     * dlivPointLessThan のゲッターメソッドです。
     * 
     * @return the dlivPointLessThan
     */
    public String getDlivPointLessThan() {
        return dlivPointLessThan;
    }

    /**
     * dlivPointLessThan のセッターメソッドです。
     * 
     * @param dlivPointLessThan dlivPointLessThan に設定する
     */
    public void setDlivPointLessThan(String dlivPointLessThan) {
        this.dlivPointLessThan = dlivPointLessThan;
    }

    /**
     * dlivPointLessThanEqual のゲッターメソッドです。
     * 
     * @return the dlivPointLessThanEqual
     */
    public String getDlivPointLessThanEqual() {
        return dlivPointLessThanEqual;
    }

    /**
     * dlivPointLessThanEqual のセッターメソッドです。
     * 
     * @param dlivPointLessThanEqual dlivPointLessThanEqual に設定する
     */
    public void setDlivPointLessThanEqual(String dlivPointLessThanEqual) {
        this.dlivPointLessThanEqual = dlivPointLessThanEqual;
    }

    /**
     * dlivPointLikeFront のゲッターメソッドです。
     * 
     * @return the dlivPointLikeFront
     */
    public String getDlivPointLikeFront() {
        return dlivPointLikeFront;
    }

    /**
     * dlivPointLikeFront のセッターメソッドです。
     * 
     * @param dlivPointLikeFront dlivPointLikeFront に設定する
     */
    public void setDlivPointLikeFront(String dlivPointLikeFront) {
        this.dlivPointLikeFront = dlivPointLikeFront;
    }

    /**
     * carrierCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThan
     */
    public String getCarrierCompCdGreaterThan() {
        return carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThan carrierCompCdGreaterThan に設定する
     */
    public void setCarrierCompCdGreaterThan(String carrierCompCdGreaterThan) {
        this.carrierCompCdGreaterThan = carrierCompCdGreaterThan;
    }

    /**
     * carrierCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdGreaterThanEqual
     */
    public String getCarrierCompCdGreaterThanEqual() {
        return carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdGreaterThanEqual carrierCompCdGreaterThanEqual に設定する
     */
    public void setCarrierCompCdGreaterThanEqual(String carrierCompCdGreaterThanEqual) {
        this.carrierCompCdGreaterThanEqual = carrierCompCdGreaterThanEqual;
    }

    /**
     * carrierCompCdLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThan
     */
    public String getCarrierCompCdLessThan() {
        return carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThan のセッターメソッドです。
     * 
     * @param carrierCompCdLessThan carrierCompCdLessThan に設定する
     */
    public void setCarrierCompCdLessThan(String carrierCompCdLessThan) {
        this.carrierCompCdLessThan = carrierCompCdLessThan;
    }

    /**
     * carrierCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompCdLessThanEqual
     */
    public String getCarrierCompCdLessThanEqual() {
        return carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompCdLessThanEqual carrierCompCdLessThanEqual に設定する
     */
    public void setCarrierCompCdLessThanEqual(String carrierCompCdLessThanEqual) {
        this.carrierCompCdLessThanEqual = carrierCompCdLessThanEqual;
    }

    /**
     * carrierCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompCdLikeFront
     */
    public String getCarrierCompCdLikeFront() {
        return carrierCompCdLikeFront;
    }

    /**
     * carrierCompCdLikeFront のセッターメソッドです。
     * 
     * @param carrierCompCdLikeFront carrierCompCdLikeFront に設定する
     */
    public void setCarrierCompCdLikeFront(String carrierCompCdLikeFront) {
        this.carrierCompCdLikeFront = carrierCompCdLikeFront;
    }

    /**
     * carrierCompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbbGreaterThan
     */
    public String getCarrierCompNmAbbGreaterThan() {
        return carrierCompNmAbbGreaterThan;
    }

    /**
     * carrierCompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompNmAbbGreaterThan carrierCompNmAbbGreaterThan に設定する
     */
    public void setCarrierCompNmAbbGreaterThan(String carrierCompNmAbbGreaterThan) {
        this.carrierCompNmAbbGreaterThan = carrierCompNmAbbGreaterThan;
    }

    /**
     * carrierCompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbbGreaterThanEqual
     */
    public String getCarrierCompNmAbbGreaterThanEqual() {
        return carrierCompNmAbbGreaterThanEqual;
    }

    /**
     * carrierCompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompNmAbbGreaterThanEqual carrierCompNmAbbGreaterThanEqual に設定する
     */
    public void setCarrierCompNmAbbGreaterThanEqual(String carrierCompNmAbbGreaterThanEqual) {
        this.carrierCompNmAbbGreaterThanEqual = carrierCompNmAbbGreaterThanEqual;
    }

    /**
     * carrierCompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbbLessThan
     */
    public String getCarrierCompNmAbbLessThan() {
        return carrierCompNmAbbLessThan;
    }

    /**
     * carrierCompNmAbbLessThan のセッターメソッドです。
     * 
     * @param carrierCompNmAbbLessThan carrierCompNmAbbLessThan に設定する
     */
    public void setCarrierCompNmAbbLessThan(String carrierCompNmAbbLessThan) {
        this.carrierCompNmAbbLessThan = carrierCompNmAbbLessThan;
    }

    /**
     * carrierCompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbbLessThanEqual
     */
    public String getCarrierCompNmAbbLessThanEqual() {
        return carrierCompNmAbbLessThanEqual;
    }

    /**
     * carrierCompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompNmAbbLessThanEqual carrierCompNmAbbLessThanEqual に設定する
     */
    public void setCarrierCompNmAbbLessThanEqual(String carrierCompNmAbbLessThanEqual) {
        this.carrierCompNmAbbLessThanEqual = carrierCompNmAbbLessThanEqual;
    }

    /**
     * carrierCompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompNmAbbLikeFront
     */
    public String getCarrierCompNmAbbLikeFront() {
        return carrierCompNmAbbLikeFront;
    }

    /**
     * carrierCompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param carrierCompNmAbbLikeFront carrierCompNmAbbLikeFront に設定する
     */
    public void setCarrierCompNmAbbLikeFront(String carrierCompNmAbbLikeFront) {
        this.carrierCompNmAbbLikeFront = carrierCompNmAbbLikeFront;
    }

    /**
     * forwarderCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the forwarderCompCdGreaterThan
     */
    public String getForwarderCompCdGreaterThan() {
        return forwarderCompCdGreaterThan;
    }

    /**
     * forwarderCompCdGreaterThan のセッターメソッドです。
     * 
     * @param forwarderCompCdGreaterThan forwarderCompCdGreaterThan に設定する
     */
    public void setForwarderCompCdGreaterThan(String forwarderCompCdGreaterThan) {
        this.forwarderCompCdGreaterThan = forwarderCompCdGreaterThan;
    }

    /**
     * forwarderCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the forwarderCompCdGreaterThanEqual
     */
    public String getForwarderCompCdGreaterThanEqual() {
        return forwarderCompCdGreaterThanEqual;
    }

    /**
     * forwarderCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param forwarderCompCdGreaterThanEqual forwarderCompCdGreaterThanEqual に設定する
     */
    public void setForwarderCompCdGreaterThanEqual(String forwarderCompCdGreaterThanEqual) {
        this.forwarderCompCdGreaterThanEqual = forwarderCompCdGreaterThanEqual;
    }

    /**
     * forwarderCompCdLessThan のゲッターメソッドです。
     * 
     * @return the forwarderCompCdLessThan
     */
    public String getForwarderCompCdLessThan() {
        return forwarderCompCdLessThan;
    }

    /**
     * forwarderCompCdLessThan のセッターメソッドです。
     * 
     * @param forwarderCompCdLessThan forwarderCompCdLessThan に設定する
     */
    public void setForwarderCompCdLessThan(String forwarderCompCdLessThan) {
        this.forwarderCompCdLessThan = forwarderCompCdLessThan;
    }

    /**
     * forwarderCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the forwarderCompCdLessThanEqual
     */
    public String getForwarderCompCdLessThanEqual() {
        return forwarderCompCdLessThanEqual;
    }

    /**
     * forwarderCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param forwarderCompCdLessThanEqual forwarderCompCdLessThanEqual に設定する
     */
    public void setForwarderCompCdLessThanEqual(String forwarderCompCdLessThanEqual) {
        this.forwarderCompCdLessThanEqual = forwarderCompCdLessThanEqual;
    }

    /**
     * forwarderCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the forwarderCompCdLikeFront
     */
    public String getForwarderCompCdLikeFront() {
        return forwarderCompCdLikeFront;
    }

    /**
     * forwarderCompCdLikeFront のセッターメソッドです。
     * 
     * @param forwarderCompCdLikeFront forwarderCompCdLikeFront に設定する
     */
    public void setForwarderCompCdLikeFront(String forwarderCompCdLikeFront) {
        this.forwarderCompCdLikeFront = forwarderCompCdLikeFront;
    }

    /**
     * vesselGreaterThan のゲッターメソッドです。
     * 
     * @return the vesselGreaterThan
     */
    public String getVesselGreaterThan() {
        return vesselGreaterThan;
    }

    /**
     * vesselGreaterThan のセッターメソッドです。
     * 
     * @param vesselGreaterThan vesselGreaterThan に設定する
     */
    public void setVesselGreaterThan(String vesselGreaterThan) {
        this.vesselGreaterThan = vesselGreaterThan;
    }

    /**
     * vesselGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the vesselGreaterThanEqual
     */
    public String getVesselGreaterThanEqual() {
        return vesselGreaterThanEqual;
    }

    /**
     * vesselGreaterThanEqual のセッターメソッドです。
     * 
     * @param vesselGreaterThanEqual vesselGreaterThanEqual に設定する
     */
    public void setVesselGreaterThanEqual(String vesselGreaterThanEqual) {
        this.vesselGreaterThanEqual = vesselGreaterThanEqual;
    }

    /**
     * vesselLessThan のゲッターメソッドです。
     * 
     * @return the vesselLessThan
     */
    public String getVesselLessThan() {
        return vesselLessThan;
    }

    /**
     * vesselLessThan のセッターメソッドです。
     * 
     * @param vesselLessThan vesselLessThan に設定する
     */
    public void setVesselLessThan(String vesselLessThan) {
        this.vesselLessThan = vesselLessThan;
    }

    /**
     * vesselLessThanEqual のゲッターメソッドです。
     * 
     * @return the vesselLessThanEqual
     */
    public String getVesselLessThanEqual() {
        return vesselLessThanEqual;
    }

    /**
     * vesselLessThanEqual のセッターメソッドです。
     * 
     * @param vesselLessThanEqual vesselLessThanEqual に設定する
     */
    public void setVesselLessThanEqual(String vesselLessThanEqual) {
        this.vesselLessThanEqual = vesselLessThanEqual;
    }

    /**
     * vesselLikeFront のゲッターメソッドです。
     * 
     * @return the vesselLikeFront
     */
    public String getVesselLikeFront() {
        return vesselLikeFront;
    }

    /**
     * vesselLikeFront のセッターメソッドです。
     * 
     * @param vesselLikeFront vesselLikeFront に設定する
     */
    public void setVesselLikeFront(String vesselLikeFront) {
        this.vesselLikeFront = vesselLikeFront;
    }

    /**
     * bookingNoGreaterThan のゲッターメソッドです。
     * 
     * @return the bookingNoGreaterThan
     */
    public String getBookingNoGreaterThan() {
        return bookingNoGreaterThan;
    }

    /**
     * bookingNoGreaterThan のセッターメソッドです。
     * 
     * @param bookingNoGreaterThan bookingNoGreaterThan に設定する
     */
    public void setBookingNoGreaterThan(String bookingNoGreaterThan) {
        this.bookingNoGreaterThan = bookingNoGreaterThan;
    }

    /**
     * bookingNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the bookingNoGreaterThanEqual
     */
    public String getBookingNoGreaterThanEqual() {
        return bookingNoGreaterThanEqual;
    }

    /**
     * bookingNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param bookingNoGreaterThanEqual bookingNoGreaterThanEqual に設定する
     */
    public void setBookingNoGreaterThanEqual(String bookingNoGreaterThanEqual) {
        this.bookingNoGreaterThanEqual = bookingNoGreaterThanEqual;
    }

    /**
     * bookingNoLessThan のゲッターメソッドです。
     * 
     * @return the bookingNoLessThan
     */
    public String getBookingNoLessThan() {
        return bookingNoLessThan;
    }

    /**
     * bookingNoLessThan のセッターメソッドです。
     * 
     * @param bookingNoLessThan bookingNoLessThan に設定する
     */
    public void setBookingNoLessThan(String bookingNoLessThan) {
        this.bookingNoLessThan = bookingNoLessThan;
    }

    /**
     * bookingNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the bookingNoLessThanEqual
     */
    public String getBookingNoLessThanEqual() {
        return bookingNoLessThanEqual;
    }

    /**
     * bookingNoLessThanEqual のセッターメソッドです。
     * 
     * @param bookingNoLessThanEqual bookingNoLessThanEqual に設定する
     */
    public void setBookingNoLessThanEqual(String bookingNoLessThanEqual) {
        this.bookingNoLessThanEqual = bookingNoLessThanEqual;
    }

    /**
     * bookingNoLikeFront のゲッターメソッドです。
     * 
     * @return the bookingNoLikeFront
     */
    public String getBookingNoLikeFront() {
        return bookingNoLikeFront;
    }

    /**
     * bookingNoLikeFront のセッターメソッドです。
     * 
     * @param bookingNoLikeFront bookingNoLikeFront に設定する
     */
    public void setBookingNoLikeFront(String bookingNoLikeFront) {
        this.bookingNoLikeFront = bookingNoLikeFront;
    }

    /**
     * freightResponsibleCdGreaterThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThan
     */
    public String getFreightResponsibleCdGreaterThan() {
        return freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThan freightResponsibleCdGreaterThan に設定する
     */
    public void setFreightResponsibleCdGreaterThan(String freightResponsibleCdGreaterThan) {
        this.freightResponsibleCdGreaterThan = freightResponsibleCdGreaterThan;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdGreaterThanEqual
     */
    public String getFreightResponsibleCdGreaterThanEqual() {
        return freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdGreaterThanEqual freightResponsibleCdGreaterThanEqual に設定する
     */
    public void setFreightResponsibleCdGreaterThanEqual(String freightResponsibleCdGreaterThanEqual) {
        this.freightResponsibleCdGreaterThanEqual = freightResponsibleCdGreaterThanEqual;
    }

    /**
     * freightResponsibleCdLessThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThan
     */
    public String getFreightResponsibleCdLessThan() {
        return freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThan のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThan freightResponsibleCdLessThan に設定する
     */
    public void setFreightResponsibleCdLessThan(String freightResponsibleCdLessThan) {
        this.freightResponsibleCdLessThan = freightResponsibleCdLessThan;
    }

    /**
     * freightResponsibleCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLessThanEqual
     */
    public String getFreightResponsibleCdLessThanEqual() {
        return freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLessThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleCdLessThanEqual freightResponsibleCdLessThanEqual に設定する
     */
    public void setFreightResponsibleCdLessThanEqual(String freightResponsibleCdLessThanEqual) {
        this.freightResponsibleCdLessThanEqual = freightResponsibleCdLessThanEqual;
    }

    /**
     * freightResponsibleCdLikeFront のゲッターメソッドです。
     * 
     * @return the freightResponsibleCdLikeFront
     */
    public String getFreightResponsibleCdLikeFront() {
        return freightResponsibleCdLikeFront;
    }

    /**
     * freightResponsibleCdLikeFront のセッターメソッドです。
     * 
     * @param freightResponsibleCdLikeFront freightResponsibleCdLikeFront に設定する
     */
    public void setFreightResponsibleCdLikeFront(String freightResponsibleCdLikeFront) {
        this.freightResponsibleCdLikeFront = freightResponsibleCdLikeFront;
    }

    /**
     * freightResponsibleNmGreaterThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleNmGreaterThan
     */
    public String getFreightResponsibleNmGreaterThan() {
        return freightResponsibleNmGreaterThan;
    }

    /**
     * freightResponsibleNmGreaterThan のセッターメソッドです。
     * 
     * @param freightResponsibleNmGreaterThan freightResponsibleNmGreaterThan に設定する
     */
    public void setFreightResponsibleNmGreaterThan(String freightResponsibleNmGreaterThan) {
        this.freightResponsibleNmGreaterThan = freightResponsibleNmGreaterThan;
    }

    /**
     * freightResponsibleNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleNmGreaterThanEqual
     */
    public String getFreightResponsibleNmGreaterThanEqual() {
        return freightResponsibleNmGreaterThanEqual;
    }

    /**
     * freightResponsibleNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleNmGreaterThanEqual freightResponsibleNmGreaterThanEqual に設定する
     */
    public void setFreightResponsibleNmGreaterThanEqual(String freightResponsibleNmGreaterThanEqual) {
        this.freightResponsibleNmGreaterThanEqual = freightResponsibleNmGreaterThanEqual;
    }

    /**
     * freightResponsibleNmLessThan のゲッターメソッドです。
     * 
     * @return the freightResponsibleNmLessThan
     */
    public String getFreightResponsibleNmLessThan() {
        return freightResponsibleNmLessThan;
    }

    /**
     * freightResponsibleNmLessThan のセッターメソッドです。
     * 
     * @param freightResponsibleNmLessThan freightResponsibleNmLessThan に設定する
     */
    public void setFreightResponsibleNmLessThan(String freightResponsibleNmLessThan) {
        this.freightResponsibleNmLessThan = freightResponsibleNmLessThan;
    }

    /**
     * freightResponsibleNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the freightResponsibleNmLessThanEqual
     */
    public String getFreightResponsibleNmLessThanEqual() {
        return freightResponsibleNmLessThanEqual;
    }

    /**
     * freightResponsibleNmLessThanEqual のセッターメソッドです。
     * 
     * @param freightResponsibleNmLessThanEqual freightResponsibleNmLessThanEqual に設定する
     */
    public void setFreightResponsibleNmLessThanEqual(String freightResponsibleNmLessThanEqual) {
        this.freightResponsibleNmLessThanEqual = freightResponsibleNmLessThanEqual;
    }

    /**
     * freightResponsibleNmLikeFront のゲッターメソッドです。
     * 
     * @return the freightResponsibleNmLikeFront
     */
    public String getFreightResponsibleNmLikeFront() {
        return freightResponsibleNmLikeFront;
    }

    /**
     * freightResponsibleNmLikeFront のセッターメソッドです。
     * 
     * @param freightResponsibleNmLikeFront freightResponsibleNmLikeFront に設定する
     */
    public void setFreightResponsibleNmLikeFront(String freightResponsibleNmLikeFront) {
        this.freightResponsibleNmLikeFront = freightResponsibleNmLikeFront;
    }

    /**
     * priceTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the priceTermsGreaterThan
     */
    public String getPriceTermsGreaterThan() {
        return priceTermsGreaterThan;
    }

    /**
     * priceTermsGreaterThan のセッターメソッドです。
     * 
     * @param priceTermsGreaterThan priceTermsGreaterThan に設定する
     */
    public void setPriceTermsGreaterThan(String priceTermsGreaterThan) {
        this.priceTermsGreaterThan = priceTermsGreaterThan;
    }

    /**
     * priceTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the priceTermsGreaterThanEqual
     */
    public String getPriceTermsGreaterThanEqual() {
        return priceTermsGreaterThanEqual;
    }

    /**
     * priceTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param priceTermsGreaterThanEqual priceTermsGreaterThanEqual に設定する
     */
    public void setPriceTermsGreaterThanEqual(String priceTermsGreaterThanEqual) {
        this.priceTermsGreaterThanEqual = priceTermsGreaterThanEqual;
    }

    /**
     * priceTermsLessThan のゲッターメソッドです。
     * 
     * @return the priceTermsLessThan
     */
    public String getPriceTermsLessThan() {
        return priceTermsLessThan;
    }

    /**
     * priceTermsLessThan のセッターメソッドです。
     * 
     * @param priceTermsLessThan priceTermsLessThan に設定する
     */
    public void setPriceTermsLessThan(String priceTermsLessThan) {
        this.priceTermsLessThan = priceTermsLessThan;
    }

    /**
     * priceTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the priceTermsLessThanEqual
     */
    public String getPriceTermsLessThanEqual() {
        return priceTermsLessThanEqual;
    }

    /**
     * priceTermsLessThanEqual のセッターメソッドです。
     * 
     * @param priceTermsLessThanEqual priceTermsLessThanEqual に設定する
     */
    public void setPriceTermsLessThanEqual(String priceTermsLessThanEqual) {
        this.priceTermsLessThanEqual = priceTermsLessThanEqual;
    }

    /**
     * priceTermsLikeFront のゲッターメソッドです。
     * 
     * @return the priceTermsLikeFront
     */
    public String getPriceTermsLikeFront() {
        return priceTermsLikeFront;
    }

    /**
     * priceTermsLikeFront のセッターメソッドです。
     * 
     * @param priceTermsLikeFront priceTermsLikeFront に設定する
     */
    public void setPriceTermsLikeFront(String priceTermsLikeFront) {
        this.priceTermsLikeFront = priceTermsLikeFront;
    }

    /**
     * tradeTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThan
     */
    public String getTradeTermsGreaterThan() {
        return tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThan のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThan tradeTermsGreaterThan に設定する
     */
    public void setTradeTermsGreaterThan(String tradeTermsGreaterThan) {
        this.tradeTermsGreaterThan = tradeTermsGreaterThan;
    }

    /**
     * tradeTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsGreaterThanEqual
     */
    public String getTradeTermsGreaterThanEqual() {
        return tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsGreaterThanEqual tradeTermsGreaterThanEqual に設定する
     */
    public void setTradeTermsGreaterThanEqual(String tradeTermsGreaterThanEqual) {
        this.tradeTermsGreaterThanEqual = tradeTermsGreaterThanEqual;
    }

    /**
     * tradeTermsLessThan のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThan
     */
    public String getTradeTermsLessThan() {
        return tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThan のセッターメソッドです。
     * 
     * @param tradeTermsLessThan tradeTermsLessThan に設定する
     */
    public void setTradeTermsLessThan(String tradeTermsLessThan) {
        this.tradeTermsLessThan = tradeTermsLessThan;
    }

    /**
     * tradeTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the tradeTermsLessThanEqual
     */
    public String getTradeTermsLessThanEqual() {
        return tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLessThanEqual のセッターメソッドです。
     * 
     * @param tradeTermsLessThanEqual tradeTermsLessThanEqual に設定する
     */
    public void setTradeTermsLessThanEqual(String tradeTermsLessThanEqual) {
        this.tradeTermsLessThanEqual = tradeTermsLessThanEqual;
    }

    /**
     * tradeTermsLikeFront のゲッターメソッドです。
     * 
     * @return the tradeTermsLikeFront
     */
    public String getTradeTermsLikeFront() {
        return tradeTermsLikeFront;
    }

    /**
     * tradeTermsLikeFront のセッターメソッドです。
     * 
     * @param tradeTermsLikeFront tradeTermsLikeFront に設定する
     */
    public void setTradeTermsLikeFront(String tradeTermsLikeFront) {
        this.tradeTermsLikeFront = tradeTermsLikeFront;
    }

    /**
     * termsPointGreaterThan のゲッターメソッドです。
     * 
     * @return the termsPointGreaterThan
     */
    public String getTermsPointGreaterThan() {
        return termsPointGreaterThan;
    }

    /**
     * termsPointGreaterThan のセッターメソッドです。
     * 
     * @param termsPointGreaterThan termsPointGreaterThan に設定する
     */
    public void setTermsPointGreaterThan(String termsPointGreaterThan) {
        this.termsPointGreaterThan = termsPointGreaterThan;
    }

    /**
     * termsPointGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the termsPointGreaterThanEqual
     */
    public String getTermsPointGreaterThanEqual() {
        return termsPointGreaterThanEqual;
    }

    /**
     * termsPointGreaterThanEqual のセッターメソッドです。
     * 
     * @param termsPointGreaterThanEqual termsPointGreaterThanEqual に設定する
     */
    public void setTermsPointGreaterThanEqual(String termsPointGreaterThanEqual) {
        this.termsPointGreaterThanEqual = termsPointGreaterThanEqual;
    }

    /**
     * termsPointLessThan のゲッターメソッドです。
     * 
     * @return the termsPointLessThan
     */
    public String getTermsPointLessThan() {
        return termsPointLessThan;
    }

    /**
     * termsPointLessThan のセッターメソッドです。
     * 
     * @param termsPointLessThan termsPointLessThan に設定する
     */
    public void setTermsPointLessThan(String termsPointLessThan) {
        this.termsPointLessThan = termsPointLessThan;
    }

    /**
     * termsPointLessThanEqual のゲッターメソッドです。
     * 
     * @return the termsPointLessThanEqual
     */
    public String getTermsPointLessThanEqual() {
        return termsPointLessThanEqual;
    }

    /**
     * termsPointLessThanEqual のセッターメソッドです。
     * 
     * @param termsPointLessThanEqual termsPointLessThanEqual に設定する
     */
    public void setTermsPointLessThanEqual(String termsPointLessThanEqual) {
        this.termsPointLessThanEqual = termsPointLessThanEqual;
    }

    /**
     * termsPointLikeFront のゲッターメソッドです。
     * 
     * @return the termsPointLikeFront
     */
    public String getTermsPointLikeFront() {
        return termsPointLikeFront;
    }

    /**
     * termsPointLikeFront のセッターメソッドです。
     * 
     * @param termsPointLikeFront termsPointLikeFront に設定する
     */
    public void setTermsPointLikeFront(String termsPointLikeFront) {
        this.termsPointLikeFront = termsPointLikeFront;
    }

    /**
     * payTermsGreaterThan のゲッターメソッドです。
     * 
     * @return the payTermsGreaterThan
     */
    public String getPayTermsGreaterThan() {
        return payTermsGreaterThan;
    }

    /**
     * payTermsGreaterThan のセッターメソッドです。
     * 
     * @param payTermsGreaterThan payTermsGreaterThan に設定する
     */
    public void setPayTermsGreaterThan(String payTermsGreaterThan) {
        this.payTermsGreaterThan = payTermsGreaterThan;
    }

    /**
     * payTermsGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the payTermsGreaterThanEqual
     */
    public String getPayTermsGreaterThanEqual() {
        return payTermsGreaterThanEqual;
    }

    /**
     * payTermsGreaterThanEqual のセッターメソッドです。
     * 
     * @param payTermsGreaterThanEqual payTermsGreaterThanEqual に設定する
     */
    public void setPayTermsGreaterThanEqual(String payTermsGreaterThanEqual) {
        this.payTermsGreaterThanEqual = payTermsGreaterThanEqual;
    }

    /**
     * payTermsLessThan のゲッターメソッドです。
     * 
     * @return the payTermsLessThan
     */
    public String getPayTermsLessThan() {
        return payTermsLessThan;
    }

    /**
     * payTermsLessThan のセッターメソッドです。
     * 
     * @param payTermsLessThan payTermsLessThan に設定する
     */
    public void setPayTermsLessThan(String payTermsLessThan) {
        this.payTermsLessThan = payTermsLessThan;
    }

    /**
     * payTermsLessThanEqual のゲッターメソッドです。
     * 
     * @return the payTermsLessThanEqual
     */
    public String getPayTermsLessThanEqual() {
        return payTermsLessThanEqual;
    }

    /**
     * payTermsLessThanEqual のセッターメソッドです。
     * 
     * @param payTermsLessThanEqual payTermsLessThanEqual に設定する
     */
    public void setPayTermsLessThanEqual(String payTermsLessThanEqual) {
        this.payTermsLessThanEqual = payTermsLessThanEqual;
    }

    /**
     * payTermsLikeFront のゲッターメソッドです。
     * 
     * @return the payTermsLikeFront
     */
    public String getPayTermsLikeFront() {
        return payTermsLikeFront;
    }

    /**
     * payTermsLikeFront のセッターメソッドです。
     * 
     * @param payTermsLikeFront payTermsLikeFront に設定する
     */
    public void setPayTermsLikeFront(String payTermsLikeFront) {
        this.payTermsLikeFront = payTermsLikeFront;
    }

    /**
     * payMethGreaterThan のゲッターメソッドです。
     * 
     * @return the payMethGreaterThan
     */
    public String getPayMethGreaterThan() {
        return payMethGreaterThan;
    }

    /**
     * payMethGreaterThan のセッターメソッドです。
     * 
     * @param payMethGreaterThan payMethGreaterThan に設定する
     */
    public void setPayMethGreaterThan(String payMethGreaterThan) {
        this.payMethGreaterThan = payMethGreaterThan;
    }

    /**
     * payMethGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the payMethGreaterThanEqual
     */
    public String getPayMethGreaterThanEqual() {
        return payMethGreaterThanEqual;
    }

    /**
     * payMethGreaterThanEqual のセッターメソッドです。
     * 
     * @param payMethGreaterThanEqual payMethGreaterThanEqual に設定する
     */
    public void setPayMethGreaterThanEqual(String payMethGreaterThanEqual) {
        this.payMethGreaterThanEqual = payMethGreaterThanEqual;
    }

    /**
     * payMethLessThan のゲッターメソッドです。
     * 
     * @return the payMethLessThan
     */
    public String getPayMethLessThan() {
        return payMethLessThan;
    }

    /**
     * payMethLessThan のセッターメソッドです。
     * 
     * @param payMethLessThan payMethLessThan に設定する
     */
    public void setPayMethLessThan(String payMethLessThan) {
        this.payMethLessThan = payMethLessThan;
    }

    /**
     * payMethLessThanEqual のゲッターメソッドです。
     * 
     * @return the payMethLessThanEqual
     */
    public String getPayMethLessThanEqual() {
        return payMethLessThanEqual;
    }

    /**
     * payMethLessThanEqual のセッターメソッドです。
     * 
     * @param payMethLessThanEqual payMethLessThanEqual に設定する
     */
    public void setPayMethLessThanEqual(String payMethLessThanEqual) {
        this.payMethLessThanEqual = payMethLessThanEqual;
    }

    /**
     * payMethLikeFront のゲッターメソッドです。
     * 
     * @return the payMethLikeFront
     */
    public String getPayMethLikeFront() {
        return payMethLikeFront;
    }

    /**
     * payMethLikeFront のセッターメソッドです。
     * 
     * @param payMethLikeFront payMethLikeFront に設定する
     */
    public void setPayMethLikeFront(String payMethLikeFront) {
        this.payMethLikeFront = payMethLikeFront;
    }

    /**
     * payMethNmGreaterThan のゲッターメソッドです。
     * 
     * @return the payMethNmGreaterThan
     */
    public String getPayMethNmGreaterThan() {
        return payMethNmGreaterThan;
    }

    /**
     * payMethNmGreaterThan のセッターメソッドです。
     * 
     * @param payMethNmGreaterThan payMethNmGreaterThan に設定する
     */
    public void setPayMethNmGreaterThan(String payMethNmGreaterThan) {
        this.payMethNmGreaterThan = payMethNmGreaterThan;
    }

    /**
     * payMethNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the payMethNmGreaterThanEqual
     */
    public String getPayMethNmGreaterThanEqual() {
        return payMethNmGreaterThanEqual;
    }

    /**
     * payMethNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param payMethNmGreaterThanEqual payMethNmGreaterThanEqual に設定する
     */
    public void setPayMethNmGreaterThanEqual(String payMethNmGreaterThanEqual) {
        this.payMethNmGreaterThanEqual = payMethNmGreaterThanEqual;
    }

    /**
     * payMethNmLessThan のゲッターメソッドです。
     * 
     * @return the payMethNmLessThan
     */
    public String getPayMethNmLessThan() {
        return payMethNmLessThan;
    }

    /**
     * payMethNmLessThan のセッターメソッドです。
     * 
     * @param payMethNmLessThan payMethNmLessThan に設定する
     */
    public void setPayMethNmLessThan(String payMethNmLessThan) {
        this.payMethNmLessThan = payMethNmLessThan;
    }

    /**
     * payMethNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the payMethNmLessThanEqual
     */
    public String getPayMethNmLessThanEqual() {
        return payMethNmLessThanEqual;
    }

    /**
     * payMethNmLessThanEqual のセッターメソッドです。
     * 
     * @param payMethNmLessThanEqual payMethNmLessThanEqual に設定する
     */
    public void setPayMethNmLessThanEqual(String payMethNmLessThanEqual) {
        this.payMethNmLessThanEqual = payMethNmLessThanEqual;
    }

    /**
     * payMethNmLikeFront のゲッターメソッドです。
     * 
     * @return the payMethNmLikeFront
     */
    public String getPayMethNmLikeFront() {
        return payMethNmLikeFront;
    }

    /**
     * payMethNmLikeFront のセッターメソッドです。
     * 
     * @param payMethNmLikeFront payMethNmLikeFront に設定する
     */
    public void setPayMethNmLikeFront(String payMethNmLikeFront) {
        this.payMethNmLikeFront = payMethNmLikeFront;
    }

    /**
     * remLcTypGreaterThan のゲッターメソッドです。
     * 
     * @return the remLcTypGreaterThan
     */
    public String getRemLcTypGreaterThan() {
        return remLcTypGreaterThan;
    }

    /**
     * remLcTypGreaterThan のセッターメソッドです。
     * 
     * @param remLcTypGreaterThan remLcTypGreaterThan に設定する
     */
    public void setRemLcTypGreaterThan(String remLcTypGreaterThan) {
        this.remLcTypGreaterThan = remLcTypGreaterThan;
    }

    /**
     * remLcTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remLcTypGreaterThanEqual
     */
    public String getRemLcTypGreaterThanEqual() {
        return remLcTypGreaterThanEqual;
    }

    /**
     * remLcTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param remLcTypGreaterThanEqual remLcTypGreaterThanEqual に設定する
     */
    public void setRemLcTypGreaterThanEqual(String remLcTypGreaterThanEqual) {
        this.remLcTypGreaterThanEqual = remLcTypGreaterThanEqual;
    }

    /**
     * remLcTypLessThan のゲッターメソッドです。
     * 
     * @return the remLcTypLessThan
     */
    public String getRemLcTypLessThan() {
        return remLcTypLessThan;
    }

    /**
     * remLcTypLessThan のセッターメソッドです。
     * 
     * @param remLcTypLessThan remLcTypLessThan に設定する
     */
    public void setRemLcTypLessThan(String remLcTypLessThan) {
        this.remLcTypLessThan = remLcTypLessThan;
    }

    /**
     * remLcTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the remLcTypLessThanEqual
     */
    public String getRemLcTypLessThanEqual() {
        return remLcTypLessThanEqual;
    }

    /**
     * remLcTypLessThanEqual のセッターメソッドです。
     * 
     * @param remLcTypLessThanEqual remLcTypLessThanEqual に設定する
     */
    public void setRemLcTypLessThanEqual(String remLcTypLessThanEqual) {
        this.remLcTypLessThanEqual = remLcTypLessThanEqual;
    }

    /**
     * remLcTypLikeFront のゲッターメソッドです。
     * 
     * @return the remLcTypLikeFront
     */
    public String getRemLcTypLikeFront() {
        return remLcTypLikeFront;
    }

    /**
     * remLcTypLikeFront のセッターメソッドです。
     * 
     * @param remLcTypLikeFront remLcTypLikeFront に設定する
     */
    public void setRemLcTypLikeFront(String remLcTypLikeFront) {
        this.remLcTypLikeFront = remLcTypLikeFront;
    }

    /**
     * remBankNmGreaterThan のゲッターメソッドです。
     * 
     * @return the remBankNmGreaterThan
     */
    public String getRemBankNmGreaterThan() {
        return remBankNmGreaterThan;
    }

    /**
     * remBankNmGreaterThan のセッターメソッドです。
     * 
     * @param remBankNmGreaterThan remBankNmGreaterThan に設定する
     */
    public void setRemBankNmGreaterThan(String remBankNmGreaterThan) {
        this.remBankNmGreaterThan = remBankNmGreaterThan;
    }

    /**
     * remBankNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remBankNmGreaterThanEqual
     */
    public String getRemBankNmGreaterThanEqual() {
        return remBankNmGreaterThanEqual;
    }

    /**
     * remBankNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param remBankNmGreaterThanEqual remBankNmGreaterThanEqual に設定する
     */
    public void setRemBankNmGreaterThanEqual(String remBankNmGreaterThanEqual) {
        this.remBankNmGreaterThanEqual = remBankNmGreaterThanEqual;
    }

    /**
     * remBankNmLessThan のゲッターメソッドです。
     * 
     * @return the remBankNmLessThan
     */
    public String getRemBankNmLessThan() {
        return remBankNmLessThan;
    }

    /**
     * remBankNmLessThan のセッターメソッドです。
     * 
     * @param remBankNmLessThan remBankNmLessThan に設定する
     */
    public void setRemBankNmLessThan(String remBankNmLessThan) {
        this.remBankNmLessThan = remBankNmLessThan;
    }

    /**
     * remBankNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the remBankNmLessThanEqual
     */
    public String getRemBankNmLessThanEqual() {
        return remBankNmLessThanEqual;
    }

    /**
     * remBankNmLessThanEqual のセッターメソッドです。
     * 
     * @param remBankNmLessThanEqual remBankNmLessThanEqual に設定する
     */
    public void setRemBankNmLessThanEqual(String remBankNmLessThanEqual) {
        this.remBankNmLessThanEqual = remBankNmLessThanEqual;
    }

    /**
     * remBankNmLikeFront のゲッターメソッドです。
     * 
     * @return the remBankNmLikeFront
     */
    public String getRemBankNmLikeFront() {
        return remBankNmLikeFront;
    }

    /**
     * remBankNmLikeFront のセッターメソッドです。
     * 
     * @param remBankNmLikeFront remBankNmLikeFront に設定する
     */
    public void setRemBankNmLikeFront(String remBankNmLikeFront) {
        this.remBankNmLikeFront = remBankNmLikeFront;
    }

    /**
     * remBankAddress1GreaterThan のゲッターメソッドです。
     * 
     * @return the remBankAddress1GreaterThan
     */
    public String getRemBankAddress1GreaterThan() {
        return remBankAddress1GreaterThan;
    }

    /**
     * remBankAddress1GreaterThan のセッターメソッドです。
     * 
     * @param remBankAddress1GreaterThan remBankAddress1GreaterThan に設定する
     */
    public void setRemBankAddress1GreaterThan(String remBankAddress1GreaterThan) {
        this.remBankAddress1GreaterThan = remBankAddress1GreaterThan;
    }

    /**
     * remBankAddress1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress1GreaterThanEqual
     */
    public String getRemBankAddress1GreaterThanEqual() {
        return remBankAddress1GreaterThanEqual;
    }

    /**
     * remBankAddress1GreaterThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress1GreaterThanEqual remBankAddress1GreaterThanEqual に設定する
     */
    public void setRemBankAddress1GreaterThanEqual(String remBankAddress1GreaterThanEqual) {
        this.remBankAddress1GreaterThanEqual = remBankAddress1GreaterThanEqual;
    }

    /**
     * remBankAddress1LessThan のゲッターメソッドです。
     * 
     * @return the remBankAddress1LessThan
     */
    public String getRemBankAddress1LessThan() {
        return remBankAddress1LessThan;
    }

    /**
     * remBankAddress1LessThan のセッターメソッドです。
     * 
     * @param remBankAddress1LessThan remBankAddress1LessThan に設定する
     */
    public void setRemBankAddress1LessThan(String remBankAddress1LessThan) {
        this.remBankAddress1LessThan = remBankAddress1LessThan;
    }

    /**
     * remBankAddress1LessThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress1LessThanEqual
     */
    public String getRemBankAddress1LessThanEqual() {
        return remBankAddress1LessThanEqual;
    }

    /**
     * remBankAddress1LessThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress1LessThanEqual remBankAddress1LessThanEqual に設定する
     */
    public void setRemBankAddress1LessThanEqual(String remBankAddress1LessThanEqual) {
        this.remBankAddress1LessThanEqual = remBankAddress1LessThanEqual;
    }

    /**
     * remBankAddress1LikeFront のゲッターメソッドです。
     * 
     * @return the remBankAddress1LikeFront
     */
    public String getRemBankAddress1LikeFront() {
        return remBankAddress1LikeFront;
    }

    /**
     * remBankAddress1LikeFront のセッターメソッドです。
     * 
     * @param remBankAddress1LikeFront remBankAddress1LikeFront に設定する
     */
    public void setRemBankAddress1LikeFront(String remBankAddress1LikeFront) {
        this.remBankAddress1LikeFront = remBankAddress1LikeFront;
    }

    /**
     * remBankAddress2GreaterThan のゲッターメソッドです。
     * 
     * @return the remBankAddress2GreaterThan
     */
    public String getRemBankAddress2GreaterThan() {
        return remBankAddress2GreaterThan;
    }

    /**
     * remBankAddress2GreaterThan のセッターメソッドです。
     * 
     * @param remBankAddress2GreaterThan remBankAddress2GreaterThan に設定する
     */
    public void setRemBankAddress2GreaterThan(String remBankAddress2GreaterThan) {
        this.remBankAddress2GreaterThan = remBankAddress2GreaterThan;
    }

    /**
     * remBankAddress2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress2GreaterThanEqual
     */
    public String getRemBankAddress2GreaterThanEqual() {
        return remBankAddress2GreaterThanEqual;
    }

    /**
     * remBankAddress2GreaterThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress2GreaterThanEqual remBankAddress2GreaterThanEqual に設定する
     */
    public void setRemBankAddress2GreaterThanEqual(String remBankAddress2GreaterThanEqual) {
        this.remBankAddress2GreaterThanEqual = remBankAddress2GreaterThanEqual;
    }

    /**
     * remBankAddress2LessThan のゲッターメソッドです。
     * 
     * @return the remBankAddress2LessThan
     */
    public String getRemBankAddress2LessThan() {
        return remBankAddress2LessThan;
    }

    /**
     * remBankAddress2LessThan のセッターメソッドです。
     * 
     * @param remBankAddress2LessThan remBankAddress2LessThan に設定する
     */
    public void setRemBankAddress2LessThan(String remBankAddress2LessThan) {
        this.remBankAddress2LessThan = remBankAddress2LessThan;
    }

    /**
     * remBankAddress2LessThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress2LessThanEqual
     */
    public String getRemBankAddress2LessThanEqual() {
        return remBankAddress2LessThanEqual;
    }

    /**
     * remBankAddress2LessThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress2LessThanEqual remBankAddress2LessThanEqual に設定する
     */
    public void setRemBankAddress2LessThanEqual(String remBankAddress2LessThanEqual) {
        this.remBankAddress2LessThanEqual = remBankAddress2LessThanEqual;
    }

    /**
     * remBankAddress2LikeFront のゲッターメソッドです。
     * 
     * @return the remBankAddress2LikeFront
     */
    public String getRemBankAddress2LikeFront() {
        return remBankAddress2LikeFront;
    }

    /**
     * remBankAddress2LikeFront のセッターメソッドです。
     * 
     * @param remBankAddress2LikeFront remBankAddress2LikeFront に設定する
     */
    public void setRemBankAddress2LikeFront(String remBankAddress2LikeFront) {
        this.remBankAddress2LikeFront = remBankAddress2LikeFront;
    }

    /**
     * remBankAddress3GreaterThan のゲッターメソッドです。
     * 
     * @return the remBankAddress3GreaterThan
     */
    public String getRemBankAddress3GreaterThan() {
        return remBankAddress3GreaterThan;
    }

    /**
     * remBankAddress3GreaterThan のセッターメソッドです。
     * 
     * @param remBankAddress3GreaterThan remBankAddress3GreaterThan に設定する
     */
    public void setRemBankAddress3GreaterThan(String remBankAddress3GreaterThan) {
        this.remBankAddress3GreaterThan = remBankAddress3GreaterThan;
    }

    /**
     * remBankAddress3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress3GreaterThanEqual
     */
    public String getRemBankAddress3GreaterThanEqual() {
        return remBankAddress3GreaterThanEqual;
    }

    /**
     * remBankAddress3GreaterThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress3GreaterThanEqual remBankAddress3GreaterThanEqual に設定する
     */
    public void setRemBankAddress3GreaterThanEqual(String remBankAddress3GreaterThanEqual) {
        this.remBankAddress3GreaterThanEqual = remBankAddress3GreaterThanEqual;
    }

    /**
     * remBankAddress3LessThan のゲッターメソッドです。
     * 
     * @return the remBankAddress3LessThan
     */
    public String getRemBankAddress3LessThan() {
        return remBankAddress3LessThan;
    }

    /**
     * remBankAddress3LessThan のセッターメソッドです。
     * 
     * @param remBankAddress3LessThan remBankAddress3LessThan に設定する
     */
    public void setRemBankAddress3LessThan(String remBankAddress3LessThan) {
        this.remBankAddress3LessThan = remBankAddress3LessThan;
    }

    /**
     * remBankAddress3LessThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAddress3LessThanEqual
     */
    public String getRemBankAddress3LessThanEqual() {
        return remBankAddress3LessThanEqual;
    }

    /**
     * remBankAddress3LessThanEqual のセッターメソッドです。
     * 
     * @param remBankAddress3LessThanEqual remBankAddress3LessThanEqual に設定する
     */
    public void setRemBankAddress3LessThanEqual(String remBankAddress3LessThanEqual) {
        this.remBankAddress3LessThanEqual = remBankAddress3LessThanEqual;
    }

    /**
     * remBankAddress3LikeFront のゲッターメソッドです。
     * 
     * @return the remBankAddress3LikeFront
     */
    public String getRemBankAddress3LikeFront() {
        return remBankAddress3LikeFront;
    }

    /**
     * remBankAddress3LikeFront のセッターメソッドです。
     * 
     * @param remBankAddress3LikeFront remBankAddress3LikeFront に設定する
     */
    public void setRemBankAddress3LikeFront(String remBankAddress3LikeFront) {
        this.remBankAddress3LikeFront = remBankAddress3LikeFront;
    }

    /**
     * remBankAccountNoGreaterThan のゲッターメソッドです。
     * 
     * @return the remBankAccountNoGreaterThan
     */
    public String getRemBankAccountNoGreaterThan() {
        return remBankAccountNoGreaterThan;
    }

    /**
     * remBankAccountNoGreaterThan のセッターメソッドです。
     * 
     * @param remBankAccountNoGreaterThan remBankAccountNoGreaterThan に設定する
     */
    public void setRemBankAccountNoGreaterThan(String remBankAccountNoGreaterThan) {
        this.remBankAccountNoGreaterThan = remBankAccountNoGreaterThan;
    }

    /**
     * remBankAccountNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAccountNoGreaterThanEqual
     */
    public String getRemBankAccountNoGreaterThanEqual() {
        return remBankAccountNoGreaterThanEqual;
    }

    /**
     * remBankAccountNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param remBankAccountNoGreaterThanEqual remBankAccountNoGreaterThanEqual に設定する
     */
    public void setRemBankAccountNoGreaterThanEqual(String remBankAccountNoGreaterThanEqual) {
        this.remBankAccountNoGreaterThanEqual = remBankAccountNoGreaterThanEqual;
    }

    /**
     * remBankAccountNoLessThan のゲッターメソッドです。
     * 
     * @return the remBankAccountNoLessThan
     */
    public String getRemBankAccountNoLessThan() {
        return remBankAccountNoLessThan;
    }

    /**
     * remBankAccountNoLessThan のセッターメソッドです。
     * 
     * @param remBankAccountNoLessThan remBankAccountNoLessThan に設定する
     */
    public void setRemBankAccountNoLessThan(String remBankAccountNoLessThan) {
        this.remBankAccountNoLessThan = remBankAccountNoLessThan;
    }

    /**
     * remBankAccountNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the remBankAccountNoLessThanEqual
     */
    public String getRemBankAccountNoLessThanEqual() {
        return remBankAccountNoLessThanEqual;
    }

    /**
     * remBankAccountNoLessThanEqual のセッターメソッドです。
     * 
     * @param remBankAccountNoLessThanEqual remBankAccountNoLessThanEqual に設定する
     */
    public void setRemBankAccountNoLessThanEqual(String remBankAccountNoLessThanEqual) {
        this.remBankAccountNoLessThanEqual = remBankAccountNoLessThanEqual;
    }

    /**
     * remBankAccountNoLikeFront のゲッターメソッドです。
     * 
     * @return the remBankAccountNoLikeFront
     */
    public String getRemBankAccountNoLikeFront() {
        return remBankAccountNoLikeFront;
    }

    /**
     * remBankAccountNoLikeFront のセッターメソッドです。
     * 
     * @param remBankAccountNoLikeFront remBankAccountNoLikeFront に設定する
     */
    public void setRemBankAccountNoLikeFront(String remBankAccountNoLikeFront) {
        this.remBankAccountNoLikeFront = remBankAccountNoLikeFront;
    }

    /**
     * lcNoGreaterThan のゲッターメソッドです。
     * 
     * @return the lcNoGreaterThan
     */
    public String getLcNoGreaterThan() {
        return lcNoGreaterThan;
    }

    /**
     * lcNoGreaterThan のセッターメソッドです。
     * 
     * @param lcNoGreaterThan lcNoGreaterThan に設定する
     */
    public void setLcNoGreaterThan(String lcNoGreaterThan) {
        this.lcNoGreaterThan = lcNoGreaterThan;
    }

    /**
     * lcNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lcNoGreaterThanEqual
     */
    public String getLcNoGreaterThanEqual() {
        return lcNoGreaterThanEqual;
    }

    /**
     * lcNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param lcNoGreaterThanEqual lcNoGreaterThanEqual に設定する
     */
    public void setLcNoGreaterThanEqual(String lcNoGreaterThanEqual) {
        this.lcNoGreaterThanEqual = lcNoGreaterThanEqual;
    }

    /**
     * lcNoLessThan のゲッターメソッドです。
     * 
     * @return the lcNoLessThan
     */
    public String getLcNoLessThan() {
        return lcNoLessThan;
    }

    /**
     * lcNoLessThan のセッターメソッドです。
     * 
     * @param lcNoLessThan lcNoLessThan に設定する
     */
    public void setLcNoLessThan(String lcNoLessThan) {
        this.lcNoLessThan = lcNoLessThan;
    }

    /**
     * lcNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the lcNoLessThanEqual
     */
    public String getLcNoLessThanEqual() {
        return lcNoLessThanEqual;
    }

    /**
     * lcNoLessThanEqual のセッターメソッドです。
     * 
     * @param lcNoLessThanEqual lcNoLessThanEqual に設定する
     */
    public void setLcNoLessThanEqual(String lcNoLessThanEqual) {
        this.lcNoLessThanEqual = lcNoLessThanEqual;
    }

    /**
     * lcNoLikeFront のゲッターメソッドです。
     * 
     * @return the lcNoLikeFront
     */
    public String getLcNoLikeFront() {
        return lcNoLikeFront;
    }

    /**
     * lcNoLikeFront のセッターメソッドです。
     * 
     * @param lcNoLikeFront lcNoLikeFront に設定する
     */
    public void setLcNoLikeFront(String lcNoLikeFront) {
        this.lcNoLikeFront = lcNoLikeFront;
    }

    /**
     * lcDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lcDtGreaterThanEqual
     */
    public Date getLcDtGreaterThanEqual() {
        return lcDtGreaterThanEqual;
    }

    /**
     * lcDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param lcDtGreaterThanEqual lcDtGreaterThanEqual に設定する
     */
    public void setLcDtGreaterThanEqual(Date lcDtGreaterThanEqual) {
        this.lcDtGreaterThanEqual = lcDtGreaterThanEqual;
    }

    /**
     * lcDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the lcDtLessThanEqual
     */
    public Date getLcDtLessThanEqual() {
        return lcDtLessThanEqual;
    }

    /**
     * lcDtLessThanEqual のセッターメソッドです。
     * 
     * @param lcDtLessThanEqual lcDtLessThanEqual に設定する
     */
    public void setLcDtLessThanEqual(Date lcDtLessThanEqual) {
        this.lcDtLessThanEqual = lcDtLessThanEqual;
    }

    /**
     * lcBankNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the lcBankNm1GreaterThan
     */
    public String getLcBankNm1GreaterThan() {
        return lcBankNm1GreaterThan;
    }

    /**
     * lcBankNm1GreaterThan のセッターメソッドです。
     * 
     * @param lcBankNm1GreaterThan lcBankNm1GreaterThan に設定する
     */
    public void setLcBankNm1GreaterThan(String lcBankNm1GreaterThan) {
        this.lcBankNm1GreaterThan = lcBankNm1GreaterThan;
    }

    /**
     * lcBankNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lcBankNm1GreaterThanEqual
     */
    public String getLcBankNm1GreaterThanEqual() {
        return lcBankNm1GreaterThanEqual;
    }

    /**
     * lcBankNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param lcBankNm1GreaterThanEqual lcBankNm1GreaterThanEqual に設定する
     */
    public void setLcBankNm1GreaterThanEqual(String lcBankNm1GreaterThanEqual) {
        this.lcBankNm1GreaterThanEqual = lcBankNm1GreaterThanEqual;
    }

    /**
     * lcBankNm1LessThan のゲッターメソッドです。
     * 
     * @return the lcBankNm1LessThan
     */
    public String getLcBankNm1LessThan() {
        return lcBankNm1LessThan;
    }

    /**
     * lcBankNm1LessThan のセッターメソッドです。
     * 
     * @param lcBankNm1LessThan lcBankNm1LessThan に設定する
     */
    public void setLcBankNm1LessThan(String lcBankNm1LessThan) {
        this.lcBankNm1LessThan = lcBankNm1LessThan;
    }

    /**
     * lcBankNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the lcBankNm1LessThanEqual
     */
    public String getLcBankNm1LessThanEqual() {
        return lcBankNm1LessThanEqual;
    }

    /**
     * lcBankNm1LessThanEqual のセッターメソッドです。
     * 
     * @param lcBankNm1LessThanEqual lcBankNm1LessThanEqual に設定する
     */
    public void setLcBankNm1LessThanEqual(String lcBankNm1LessThanEqual) {
        this.lcBankNm1LessThanEqual = lcBankNm1LessThanEqual;
    }

    /**
     * lcBankNm1LikeFront のゲッターメソッドです。
     * 
     * @return the lcBankNm1LikeFront
     */
    public String getLcBankNm1LikeFront() {
        return lcBankNm1LikeFront;
    }

    /**
     * lcBankNm1LikeFront のセッターメソッドです。
     * 
     * @param lcBankNm1LikeFront lcBankNm1LikeFront に設定する
     */
    public void setLcBankNm1LikeFront(String lcBankNm1LikeFront) {
        this.lcBankNm1LikeFront = lcBankNm1LikeFront;
    }

    /**
     * lcBankNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the lcBankNm2GreaterThan
     */
    public String getLcBankNm2GreaterThan() {
        return lcBankNm2GreaterThan;
    }

    /**
     * lcBankNm2GreaterThan のセッターメソッドです。
     * 
     * @param lcBankNm2GreaterThan lcBankNm2GreaterThan に設定する
     */
    public void setLcBankNm2GreaterThan(String lcBankNm2GreaterThan) {
        this.lcBankNm2GreaterThan = lcBankNm2GreaterThan;
    }

    /**
     * lcBankNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lcBankNm2GreaterThanEqual
     */
    public String getLcBankNm2GreaterThanEqual() {
        return lcBankNm2GreaterThanEqual;
    }

    /**
     * lcBankNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param lcBankNm2GreaterThanEqual lcBankNm2GreaterThanEqual に設定する
     */
    public void setLcBankNm2GreaterThanEqual(String lcBankNm2GreaterThanEqual) {
        this.lcBankNm2GreaterThanEqual = lcBankNm2GreaterThanEqual;
    }

    /**
     * lcBankNm2LessThan のゲッターメソッドです。
     * 
     * @return the lcBankNm2LessThan
     */
    public String getLcBankNm2LessThan() {
        return lcBankNm2LessThan;
    }

    /**
     * lcBankNm2LessThan のセッターメソッドです。
     * 
     * @param lcBankNm2LessThan lcBankNm2LessThan に設定する
     */
    public void setLcBankNm2LessThan(String lcBankNm2LessThan) {
        this.lcBankNm2LessThan = lcBankNm2LessThan;
    }

    /**
     * lcBankNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the lcBankNm2LessThanEqual
     */
    public String getLcBankNm2LessThanEqual() {
        return lcBankNm2LessThanEqual;
    }

    /**
     * lcBankNm2LessThanEqual のセッターメソッドです。
     * 
     * @param lcBankNm2LessThanEqual lcBankNm2LessThanEqual に設定する
     */
    public void setLcBankNm2LessThanEqual(String lcBankNm2LessThanEqual) {
        this.lcBankNm2LessThanEqual = lcBankNm2LessThanEqual;
    }

    /**
     * lcBankNm2LikeFront のゲッターメソッドです。
     * 
     * @return the lcBankNm2LikeFront
     */
    public String getLcBankNm2LikeFront() {
        return lcBankNm2LikeFront;
    }

    /**
     * lcBankNm2LikeFront のセッターメソッドです。
     * 
     * @param lcBankNm2LikeFront lcBankNm2LikeFront に設定する
     */
    public void setLcBankNm2LikeFront(String lcBankNm2LikeFront) {
        this.lcBankNm2LikeFront = lcBankNm2LikeFront;
    }

    /**
     * currCdGreaterThan のゲッターメソッドです。
     * 
     * @return the currCdGreaterThan
     */
    public String getCurrCdGreaterThan() {
        return currCdGreaterThan;
    }

    /**
     * currCdGreaterThan のセッターメソッドです。
     * 
     * @param currCdGreaterThan currCdGreaterThan に設定する
     */
    public void setCurrCdGreaterThan(String currCdGreaterThan) {
        this.currCdGreaterThan = currCdGreaterThan;
    }

    /**
     * currCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the currCdGreaterThanEqual
     */
    public String getCurrCdGreaterThanEqual() {
        return currCdGreaterThanEqual;
    }

    /**
     * currCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param currCdGreaterThanEqual currCdGreaterThanEqual に設定する
     */
    public void setCurrCdGreaterThanEqual(String currCdGreaterThanEqual) {
        this.currCdGreaterThanEqual = currCdGreaterThanEqual;
    }

    /**
     * currCdLessThan のゲッターメソッドです。
     * 
     * @return the currCdLessThan
     */
    public String getCurrCdLessThan() {
        return currCdLessThan;
    }

    /**
     * currCdLessThan のセッターメソッドです。
     * 
     * @param currCdLessThan currCdLessThan に設定する
     */
    public void setCurrCdLessThan(String currCdLessThan) {
        this.currCdLessThan = currCdLessThan;
    }

    /**
     * currCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the currCdLessThanEqual
     */
    public String getCurrCdLessThanEqual() {
        return currCdLessThanEqual;
    }

    /**
     * currCdLessThanEqual のセッターメソッドです。
     * 
     * @param currCdLessThanEqual currCdLessThanEqual に設定する
     */
    public void setCurrCdLessThanEqual(String currCdLessThanEqual) {
        this.currCdLessThanEqual = currCdLessThanEqual;
    }

    /**
     * currCdLikeFront のゲッターメソッドです。
     * 
     * @return the currCdLikeFront
     */
    public String getCurrCdLikeFront() {
        return currCdLikeFront;
    }

    /**
     * currCdLikeFront のセッターメソッドです。
     * 
     * @param currCdLikeFront currCdLikeFront に設定する
     */
    public void setCurrCdLikeFront(String currCdLikeFront) {
        this.currCdLikeFront = currCdLikeFront;
    }

    /**
     * additionalChargeCdGreaterThan のゲッターメソッドです。
     * 
     * @return the additionalChargeCdGreaterThan
     */
    public String getAdditionalChargeCdGreaterThan() {
        return additionalChargeCdGreaterThan;
    }

    /**
     * additionalChargeCdGreaterThan のセッターメソッドです。
     * 
     * @param additionalChargeCdGreaterThan additionalChargeCdGreaterThan に設定する
     */
    public void setAdditionalChargeCdGreaterThan(String additionalChargeCdGreaterThan) {
        this.additionalChargeCdGreaterThan = additionalChargeCdGreaterThan;
    }

    /**
     * additionalChargeCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the additionalChargeCdGreaterThanEqual
     */
    public String getAdditionalChargeCdGreaterThanEqual() {
        return additionalChargeCdGreaterThanEqual;
    }

    /**
     * additionalChargeCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param additionalChargeCdGreaterThanEqual additionalChargeCdGreaterThanEqual に設定する
     */
    public void setAdditionalChargeCdGreaterThanEqual(String additionalChargeCdGreaterThanEqual) {
        this.additionalChargeCdGreaterThanEqual = additionalChargeCdGreaterThanEqual;
    }

    /**
     * additionalChargeCdLessThan のゲッターメソッドです。
     * 
     * @return the additionalChargeCdLessThan
     */
    public String getAdditionalChargeCdLessThan() {
        return additionalChargeCdLessThan;
    }

    /**
     * additionalChargeCdLessThan のセッターメソッドです。
     * 
     * @param additionalChargeCdLessThan additionalChargeCdLessThan に設定する
     */
    public void setAdditionalChargeCdLessThan(String additionalChargeCdLessThan) {
        this.additionalChargeCdLessThan = additionalChargeCdLessThan;
    }

    /**
     * additionalChargeCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the additionalChargeCdLessThanEqual
     */
    public String getAdditionalChargeCdLessThanEqual() {
        return additionalChargeCdLessThanEqual;
    }

    /**
     * additionalChargeCdLessThanEqual のセッターメソッドです。
     * 
     * @param additionalChargeCdLessThanEqual additionalChargeCdLessThanEqual に設定する
     */
    public void setAdditionalChargeCdLessThanEqual(String additionalChargeCdLessThanEqual) {
        this.additionalChargeCdLessThanEqual = additionalChargeCdLessThanEqual;
    }

    /**
     * additionalChargeCdLikeFront のゲッターメソッドです。
     * 
     * @return the additionalChargeCdLikeFront
     */
    public String getAdditionalChargeCdLikeFront() {
        return additionalChargeCdLikeFront;
    }

    /**
     * additionalChargeCdLikeFront のセッターメソッドです。
     * 
     * @param additionalChargeCdLikeFront additionalChargeCdLikeFront に設定する
     */
    public void setAdditionalChargeCdLikeFront(String additionalChargeCdLikeFront) {
        this.additionalChargeCdLikeFront = additionalChargeCdLikeFront;
    }

    /**
     * additionalChargeNmGreaterThan のゲッターメソッドです。
     * 
     * @return the additionalChargeNmGreaterThan
     */
    public String getAdditionalChargeNmGreaterThan() {
        return additionalChargeNmGreaterThan;
    }

    /**
     * additionalChargeNmGreaterThan のセッターメソッドです。
     * 
     * @param additionalChargeNmGreaterThan additionalChargeNmGreaterThan に設定する
     */
    public void setAdditionalChargeNmGreaterThan(String additionalChargeNmGreaterThan) {
        this.additionalChargeNmGreaterThan = additionalChargeNmGreaterThan;
    }

    /**
     * additionalChargeNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the additionalChargeNmGreaterThanEqual
     */
    public String getAdditionalChargeNmGreaterThanEqual() {
        return additionalChargeNmGreaterThanEqual;
    }

    /**
     * additionalChargeNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param additionalChargeNmGreaterThanEqual additionalChargeNmGreaterThanEqual に設定する
     */
    public void setAdditionalChargeNmGreaterThanEqual(String additionalChargeNmGreaterThanEqual) {
        this.additionalChargeNmGreaterThanEqual = additionalChargeNmGreaterThanEqual;
    }

    /**
     * additionalChargeNmLessThan のゲッターメソッドです。
     * 
     * @return the additionalChargeNmLessThan
     */
    public String getAdditionalChargeNmLessThan() {
        return additionalChargeNmLessThan;
    }

    /**
     * additionalChargeNmLessThan のセッターメソッドです。
     * 
     * @param additionalChargeNmLessThan additionalChargeNmLessThan に設定する
     */
    public void setAdditionalChargeNmLessThan(String additionalChargeNmLessThan) {
        this.additionalChargeNmLessThan = additionalChargeNmLessThan;
    }

    /**
     * additionalChargeNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the additionalChargeNmLessThanEqual
     */
    public String getAdditionalChargeNmLessThanEqual() {
        return additionalChargeNmLessThanEqual;
    }

    /**
     * additionalChargeNmLessThanEqual のセッターメソッドです。
     * 
     * @param additionalChargeNmLessThanEqual additionalChargeNmLessThanEqual に設定する
     */
    public void setAdditionalChargeNmLessThanEqual(String additionalChargeNmLessThanEqual) {
        this.additionalChargeNmLessThanEqual = additionalChargeNmLessThanEqual;
    }

    /**
     * additionalChargeNmLikeFront のゲッターメソッドです。
     * 
     * @return the additionalChargeNmLikeFront
     */
    public String getAdditionalChargeNmLikeFront() {
        return additionalChargeNmLikeFront;
    }

    /**
     * additionalChargeNmLikeFront のセッターメソッドです。
     * 
     * @param additionalChargeNmLikeFront additionalChargeNmLikeFront に設定する
     */
    public void setAdditionalChargeNmLikeFront(String additionalChargeNmLikeFront) {
        this.additionalChargeNmLikeFront = additionalChargeNmLikeFront;
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
     * invTplNoGreaterThan のゲッターメソッドです。
     * 
     * @return the invTplNoGreaterThan
     */
    public String getInvTplNoGreaterThan() {
        return invTplNoGreaterThan;
    }

    /**
     * invTplNoGreaterThan のセッターメソッドです。
     * 
     * @param invTplNoGreaterThan invTplNoGreaterThan に設定する
     */
    public void setInvTplNoGreaterThan(String invTplNoGreaterThan) {
        this.invTplNoGreaterThan = invTplNoGreaterThan;
    }

    /**
     * invTplNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invTplNoGreaterThanEqual
     */
    public String getInvTplNoGreaterThanEqual() {
        return invTplNoGreaterThanEqual;
    }

    /**
     * invTplNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param invTplNoGreaterThanEqual invTplNoGreaterThanEqual に設定する
     */
    public void setInvTplNoGreaterThanEqual(String invTplNoGreaterThanEqual) {
        this.invTplNoGreaterThanEqual = invTplNoGreaterThanEqual;
    }

    /**
     * invTplNoLessThan のゲッターメソッドです。
     * 
     * @return the invTplNoLessThan
     */
    public String getInvTplNoLessThan() {
        return invTplNoLessThan;
    }

    /**
     * invTplNoLessThan のセッターメソッドです。
     * 
     * @param invTplNoLessThan invTplNoLessThan に設定する
     */
    public void setInvTplNoLessThan(String invTplNoLessThan) {
        this.invTplNoLessThan = invTplNoLessThan;
    }

    /**
     * invTplNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the invTplNoLessThanEqual
     */
    public String getInvTplNoLessThanEqual() {
        return invTplNoLessThanEqual;
    }

    /**
     * invTplNoLessThanEqual のセッターメソッドです。
     * 
     * @param invTplNoLessThanEqual invTplNoLessThanEqual に設定する
     */
    public void setInvTplNoLessThanEqual(String invTplNoLessThanEqual) {
        this.invTplNoLessThanEqual = invTplNoLessThanEqual;
    }

    /**
     * invTplNoLikeFront のゲッターメソッドです。
     * 
     * @return the invTplNoLikeFront
     */
    public String getInvTplNoLikeFront() {
        return invTplNoLikeFront;
    }

    /**
     * invTplNoLikeFront のセッターメソッドです。
     * 
     * @param invTplNoLikeFront invTplNoLikeFront に設定する
     */
    public void setInvTplNoLikeFront(String invTplNoLikeFront) {
        this.invTplNoLikeFront = invTplNoLikeFront;
    }

    /**
     * free1ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free1ColNmGreaterThan
     */
    public String getFree1ColNmGreaterThan() {
        return free1ColNmGreaterThan;
    }

    /**
     * free1ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free1ColNmGreaterThan free1ColNmGreaterThan に設定する
     */
    public void setFree1ColNmGreaterThan(String free1ColNmGreaterThan) {
        this.free1ColNmGreaterThan = free1ColNmGreaterThan;
    }

    /**
     * free1ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1ColNmGreaterThanEqual
     */
    public String getFree1ColNmGreaterThanEqual() {
        return free1ColNmGreaterThanEqual;
    }

    /**
     * free1ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1ColNmGreaterThanEqual free1ColNmGreaterThanEqual に設定する
     */
    public void setFree1ColNmGreaterThanEqual(String free1ColNmGreaterThanEqual) {
        this.free1ColNmGreaterThanEqual = free1ColNmGreaterThanEqual;
    }

    /**
     * free1ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free1ColNmLessThan
     */
    public String getFree1ColNmLessThan() {
        return free1ColNmLessThan;
    }

    /**
     * free1ColNmLessThan のセッターメソッドです。
     * 
     * @param free1ColNmLessThan free1ColNmLessThan に設定する
     */
    public void setFree1ColNmLessThan(String free1ColNmLessThan) {
        this.free1ColNmLessThan = free1ColNmLessThan;
    }

    /**
     * free1ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1ColNmLessThanEqual
     */
    public String getFree1ColNmLessThanEqual() {
        return free1ColNmLessThanEqual;
    }

    /**
     * free1ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free1ColNmLessThanEqual free1ColNmLessThanEqual に設定する
     */
    public void setFree1ColNmLessThanEqual(String free1ColNmLessThanEqual) {
        this.free1ColNmLessThanEqual = free1ColNmLessThanEqual;
    }

    /**
     * free1ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free1ColNmLikeFront
     */
    public String getFree1ColNmLikeFront() {
        return free1ColNmLikeFront;
    }

    /**
     * free1ColNmLikeFront のセッターメソッドです。
     * 
     * @param free1ColNmLikeFront free1ColNmLikeFront に設定する
     */
    public void setFree1ColNmLikeFront(String free1ColNmLikeFront) {
        this.free1ColNmLikeFront = free1ColNmLikeFront;
    }

    /**
     * free1DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free1DispFlgGreaterThan
     */
    public String getFree1DispFlgGreaterThan() {
        return free1DispFlgGreaterThan;
    }

    /**
     * free1DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free1DispFlgGreaterThan free1DispFlgGreaterThan に設定する
     */
    public void setFree1DispFlgGreaterThan(String free1DispFlgGreaterThan) {
        this.free1DispFlgGreaterThan = free1DispFlgGreaterThan;
    }

    /**
     * free1DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1DispFlgGreaterThanEqual
     */
    public String getFree1DispFlgGreaterThanEqual() {
        return free1DispFlgGreaterThanEqual;
    }

    /**
     * free1DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1DispFlgGreaterThanEqual free1DispFlgGreaterThanEqual に設定する
     */
    public void setFree1DispFlgGreaterThanEqual(String free1DispFlgGreaterThanEqual) {
        this.free1DispFlgGreaterThanEqual = free1DispFlgGreaterThanEqual;
    }

    /**
     * free1DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free1DispFlgLessThan
     */
    public String getFree1DispFlgLessThan() {
        return free1DispFlgLessThan;
    }

    /**
     * free1DispFlgLessThan のセッターメソッドです。
     * 
     * @param free1DispFlgLessThan free1DispFlgLessThan に設定する
     */
    public void setFree1DispFlgLessThan(String free1DispFlgLessThan) {
        this.free1DispFlgLessThan = free1DispFlgLessThan;
    }

    /**
     * free1DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1DispFlgLessThanEqual
     */
    public String getFree1DispFlgLessThanEqual() {
        return free1DispFlgLessThanEqual;
    }

    /**
     * free1DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free1DispFlgLessThanEqual free1DispFlgLessThanEqual に設定する
     */
    public void setFree1DispFlgLessThanEqual(String free1DispFlgLessThanEqual) {
        this.free1DispFlgLessThanEqual = free1DispFlgLessThanEqual;
    }

    /**
     * free1DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free1DispFlgLikeFront
     */
    public String getFree1DispFlgLikeFront() {
        return free1DispFlgLikeFront;
    }

    /**
     * free1DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free1DispFlgLikeFront free1DispFlgLikeFront に設定する
     */
    public void setFree1DispFlgLikeFront(String free1DispFlgLikeFront) {
        this.free1DispFlgLikeFront = free1DispFlgLikeFront;
    }

    /**
     * free2ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free2ColNmGreaterThan
     */
    public String getFree2ColNmGreaterThan() {
        return free2ColNmGreaterThan;
    }

    /**
     * free2ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free2ColNmGreaterThan free2ColNmGreaterThan に設定する
     */
    public void setFree2ColNmGreaterThan(String free2ColNmGreaterThan) {
        this.free2ColNmGreaterThan = free2ColNmGreaterThan;
    }

    /**
     * free2ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2ColNmGreaterThanEqual
     */
    public String getFree2ColNmGreaterThanEqual() {
        return free2ColNmGreaterThanEqual;
    }

    /**
     * free2ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2ColNmGreaterThanEqual free2ColNmGreaterThanEqual に設定する
     */
    public void setFree2ColNmGreaterThanEqual(String free2ColNmGreaterThanEqual) {
        this.free2ColNmGreaterThanEqual = free2ColNmGreaterThanEqual;
    }

    /**
     * free2ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free2ColNmLessThan
     */
    public String getFree2ColNmLessThan() {
        return free2ColNmLessThan;
    }

    /**
     * free2ColNmLessThan のセッターメソッドです。
     * 
     * @param free2ColNmLessThan free2ColNmLessThan に設定する
     */
    public void setFree2ColNmLessThan(String free2ColNmLessThan) {
        this.free2ColNmLessThan = free2ColNmLessThan;
    }

    /**
     * free2ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2ColNmLessThanEqual
     */
    public String getFree2ColNmLessThanEqual() {
        return free2ColNmLessThanEqual;
    }

    /**
     * free2ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free2ColNmLessThanEqual free2ColNmLessThanEqual に設定する
     */
    public void setFree2ColNmLessThanEqual(String free2ColNmLessThanEqual) {
        this.free2ColNmLessThanEqual = free2ColNmLessThanEqual;
    }

    /**
     * free2ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free2ColNmLikeFront
     */
    public String getFree2ColNmLikeFront() {
        return free2ColNmLikeFront;
    }

    /**
     * free2ColNmLikeFront のセッターメソッドです。
     * 
     * @param free2ColNmLikeFront free2ColNmLikeFront に設定する
     */
    public void setFree2ColNmLikeFront(String free2ColNmLikeFront) {
        this.free2ColNmLikeFront = free2ColNmLikeFront;
    }

    /**
     * free2DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free2DispFlgGreaterThan
     */
    public String getFree2DispFlgGreaterThan() {
        return free2DispFlgGreaterThan;
    }

    /**
     * free2DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free2DispFlgGreaterThan free2DispFlgGreaterThan に設定する
     */
    public void setFree2DispFlgGreaterThan(String free2DispFlgGreaterThan) {
        this.free2DispFlgGreaterThan = free2DispFlgGreaterThan;
    }

    /**
     * free2DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2DispFlgGreaterThanEqual
     */
    public String getFree2DispFlgGreaterThanEqual() {
        return free2DispFlgGreaterThanEqual;
    }

    /**
     * free2DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2DispFlgGreaterThanEqual free2DispFlgGreaterThanEqual に設定する
     */
    public void setFree2DispFlgGreaterThanEqual(String free2DispFlgGreaterThanEqual) {
        this.free2DispFlgGreaterThanEqual = free2DispFlgGreaterThanEqual;
    }

    /**
     * free2DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free2DispFlgLessThan
     */
    public String getFree2DispFlgLessThan() {
        return free2DispFlgLessThan;
    }

    /**
     * free2DispFlgLessThan のセッターメソッドです。
     * 
     * @param free2DispFlgLessThan free2DispFlgLessThan に設定する
     */
    public void setFree2DispFlgLessThan(String free2DispFlgLessThan) {
        this.free2DispFlgLessThan = free2DispFlgLessThan;
    }

    /**
     * free2DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2DispFlgLessThanEqual
     */
    public String getFree2DispFlgLessThanEqual() {
        return free2DispFlgLessThanEqual;
    }

    /**
     * free2DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free2DispFlgLessThanEqual free2DispFlgLessThanEqual に設定する
     */
    public void setFree2DispFlgLessThanEqual(String free2DispFlgLessThanEqual) {
        this.free2DispFlgLessThanEqual = free2DispFlgLessThanEqual;
    }

    /**
     * free2DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free2DispFlgLikeFront
     */
    public String getFree2DispFlgLikeFront() {
        return free2DispFlgLikeFront;
    }

    /**
     * free2DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free2DispFlgLikeFront free2DispFlgLikeFront に設定する
     */
    public void setFree2DispFlgLikeFront(String free2DispFlgLikeFront) {
        this.free2DispFlgLikeFront = free2DispFlgLikeFront;
    }

    /**
     * free3ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free3ColNmGreaterThan
     */
    public String getFree3ColNmGreaterThan() {
        return free3ColNmGreaterThan;
    }

    /**
     * free3ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free3ColNmGreaterThan free3ColNmGreaterThan に設定する
     */
    public void setFree3ColNmGreaterThan(String free3ColNmGreaterThan) {
        this.free3ColNmGreaterThan = free3ColNmGreaterThan;
    }

    /**
     * free3ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3ColNmGreaterThanEqual
     */
    public String getFree3ColNmGreaterThanEqual() {
        return free3ColNmGreaterThanEqual;
    }

    /**
     * free3ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3ColNmGreaterThanEqual free3ColNmGreaterThanEqual に設定する
     */
    public void setFree3ColNmGreaterThanEqual(String free3ColNmGreaterThanEqual) {
        this.free3ColNmGreaterThanEqual = free3ColNmGreaterThanEqual;
    }

    /**
     * free3ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free3ColNmLessThan
     */
    public String getFree3ColNmLessThan() {
        return free3ColNmLessThan;
    }

    /**
     * free3ColNmLessThan のセッターメソッドです。
     * 
     * @param free3ColNmLessThan free3ColNmLessThan に設定する
     */
    public void setFree3ColNmLessThan(String free3ColNmLessThan) {
        this.free3ColNmLessThan = free3ColNmLessThan;
    }

    /**
     * free3ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3ColNmLessThanEqual
     */
    public String getFree3ColNmLessThanEqual() {
        return free3ColNmLessThanEqual;
    }

    /**
     * free3ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free3ColNmLessThanEqual free3ColNmLessThanEqual に設定する
     */
    public void setFree3ColNmLessThanEqual(String free3ColNmLessThanEqual) {
        this.free3ColNmLessThanEqual = free3ColNmLessThanEqual;
    }

    /**
     * free3ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free3ColNmLikeFront
     */
    public String getFree3ColNmLikeFront() {
        return free3ColNmLikeFront;
    }

    /**
     * free3ColNmLikeFront のセッターメソッドです。
     * 
     * @param free3ColNmLikeFront free3ColNmLikeFront に設定する
     */
    public void setFree3ColNmLikeFront(String free3ColNmLikeFront) {
        this.free3ColNmLikeFront = free3ColNmLikeFront;
    }

    /**
     * free3DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free3DispFlgGreaterThan
     */
    public String getFree3DispFlgGreaterThan() {
        return free3DispFlgGreaterThan;
    }

    /**
     * free3DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free3DispFlgGreaterThan free3DispFlgGreaterThan に設定する
     */
    public void setFree3DispFlgGreaterThan(String free3DispFlgGreaterThan) {
        this.free3DispFlgGreaterThan = free3DispFlgGreaterThan;
    }

    /**
     * free3DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3DispFlgGreaterThanEqual
     */
    public String getFree3DispFlgGreaterThanEqual() {
        return free3DispFlgGreaterThanEqual;
    }

    /**
     * free3DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3DispFlgGreaterThanEqual free3DispFlgGreaterThanEqual に設定する
     */
    public void setFree3DispFlgGreaterThanEqual(String free3DispFlgGreaterThanEqual) {
        this.free3DispFlgGreaterThanEqual = free3DispFlgGreaterThanEqual;
    }

    /**
     * free3DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free3DispFlgLessThan
     */
    public String getFree3DispFlgLessThan() {
        return free3DispFlgLessThan;
    }

    /**
     * free3DispFlgLessThan のセッターメソッドです。
     * 
     * @param free3DispFlgLessThan free3DispFlgLessThan に設定する
     */
    public void setFree3DispFlgLessThan(String free3DispFlgLessThan) {
        this.free3DispFlgLessThan = free3DispFlgLessThan;
    }

    /**
     * free3DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3DispFlgLessThanEqual
     */
    public String getFree3DispFlgLessThanEqual() {
        return free3DispFlgLessThanEqual;
    }

    /**
     * free3DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free3DispFlgLessThanEqual free3DispFlgLessThanEqual に設定する
     */
    public void setFree3DispFlgLessThanEqual(String free3DispFlgLessThanEqual) {
        this.free3DispFlgLessThanEqual = free3DispFlgLessThanEqual;
    }

    /**
     * free3DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free3DispFlgLikeFront
     */
    public String getFree3DispFlgLikeFront() {
        return free3DispFlgLikeFront;
    }

    /**
     * free3DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free3DispFlgLikeFront free3DispFlgLikeFront に設定する
     */
    public void setFree3DispFlgLikeFront(String free3DispFlgLikeFront) {
        this.free3DispFlgLikeFront = free3DispFlgLikeFront;
    }

    /**
     * free4ColNmGreaterThan のゲッターメソッドです。
     * 
     * @return the free4ColNmGreaterThan
     */
    public String getFree4ColNmGreaterThan() {
        return free4ColNmGreaterThan;
    }

    /**
     * free4ColNmGreaterThan のセッターメソッドです。
     * 
     * @param free4ColNmGreaterThan free4ColNmGreaterThan に設定する
     */
    public void setFree4ColNmGreaterThan(String free4ColNmGreaterThan) {
        this.free4ColNmGreaterThan = free4ColNmGreaterThan;
    }

    /**
     * free4ColNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free4ColNmGreaterThanEqual
     */
    public String getFree4ColNmGreaterThanEqual() {
        return free4ColNmGreaterThanEqual;
    }

    /**
     * free4ColNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free4ColNmGreaterThanEqual free4ColNmGreaterThanEqual に設定する
     */
    public void setFree4ColNmGreaterThanEqual(String free4ColNmGreaterThanEqual) {
        this.free4ColNmGreaterThanEqual = free4ColNmGreaterThanEqual;
    }

    /**
     * free4ColNmLessThan のゲッターメソッドです。
     * 
     * @return the free4ColNmLessThan
     */
    public String getFree4ColNmLessThan() {
        return free4ColNmLessThan;
    }

    /**
     * free4ColNmLessThan のセッターメソッドです。
     * 
     * @param free4ColNmLessThan free4ColNmLessThan に設定する
     */
    public void setFree4ColNmLessThan(String free4ColNmLessThan) {
        this.free4ColNmLessThan = free4ColNmLessThan;
    }

    /**
     * free4ColNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free4ColNmLessThanEqual
     */
    public String getFree4ColNmLessThanEqual() {
        return free4ColNmLessThanEqual;
    }

    /**
     * free4ColNmLessThanEqual のセッターメソッドです。
     * 
     * @param free4ColNmLessThanEqual free4ColNmLessThanEqual に設定する
     */
    public void setFree4ColNmLessThanEqual(String free4ColNmLessThanEqual) {
        this.free4ColNmLessThanEqual = free4ColNmLessThanEqual;
    }

    /**
     * free4ColNmLikeFront のゲッターメソッドです。
     * 
     * @return the free4ColNmLikeFront
     */
    public String getFree4ColNmLikeFront() {
        return free4ColNmLikeFront;
    }

    /**
     * free4ColNmLikeFront のセッターメソッドです。
     * 
     * @param free4ColNmLikeFront free4ColNmLikeFront に設定する
     */
    public void setFree4ColNmLikeFront(String free4ColNmLikeFront) {
        this.free4ColNmLikeFront = free4ColNmLikeFront;
    }

    /**
     * free4DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free4DispFlgGreaterThan
     */
    public String getFree4DispFlgGreaterThan() {
        return free4DispFlgGreaterThan;
    }

    /**
     * free4DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free4DispFlgGreaterThan free4DispFlgGreaterThan に設定する
     */
    public void setFree4DispFlgGreaterThan(String free4DispFlgGreaterThan) {
        this.free4DispFlgGreaterThan = free4DispFlgGreaterThan;
    }

    /**
     * free4DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free4DispFlgGreaterThanEqual
     */
    public String getFree4DispFlgGreaterThanEqual() {
        return free4DispFlgGreaterThanEqual;
    }

    /**
     * free4DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free4DispFlgGreaterThanEqual free4DispFlgGreaterThanEqual に設定する
     */
    public void setFree4DispFlgGreaterThanEqual(String free4DispFlgGreaterThanEqual) {
        this.free4DispFlgGreaterThanEqual = free4DispFlgGreaterThanEqual;
    }

    /**
     * free4DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free4DispFlgLessThan
     */
    public String getFree4DispFlgLessThan() {
        return free4DispFlgLessThan;
    }

    /**
     * free4DispFlgLessThan のセッターメソッドです。
     * 
     * @param free4DispFlgLessThan free4DispFlgLessThan に設定する
     */
    public void setFree4DispFlgLessThan(String free4DispFlgLessThan) {
        this.free4DispFlgLessThan = free4DispFlgLessThan;
    }

    /**
     * free4DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free4DispFlgLessThanEqual
     */
    public String getFree4DispFlgLessThanEqual() {
        return free4DispFlgLessThanEqual;
    }

    /**
     * free4DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free4DispFlgLessThanEqual free4DispFlgLessThanEqual に設定する
     */
    public void setFree4DispFlgLessThanEqual(String free4DispFlgLessThanEqual) {
        this.free4DispFlgLessThanEqual = free4DispFlgLessThanEqual;
    }

    /**
     * free4DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free4DispFlgLikeFront
     */
    public String getFree4DispFlgLikeFront() {
        return free4DispFlgLikeFront;
    }

    /**
     * free4DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free4DispFlgLikeFront free4DispFlgLikeFront に設定する
     */
    public void setFree4DispFlgLikeFront(String free4DispFlgLikeFront) {
        this.free4DispFlgLikeFront = free4DispFlgLikeFront;
    }

    /**
     * spInfoGreaterThan のゲッターメソッドです。
     * 
     * @return the spInfoGreaterThan
     */
    public String getSpInfoGreaterThan() {
        return spInfoGreaterThan;
    }

    /**
     * spInfoGreaterThan のセッターメソッドです。
     * 
     * @param spInfoGreaterThan spInfoGreaterThan に設定する
     */
    public void setSpInfoGreaterThan(String spInfoGreaterThan) {
        this.spInfoGreaterThan = spInfoGreaterThan;
    }

    /**
     * spInfoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the spInfoGreaterThanEqual
     */
    public String getSpInfoGreaterThanEqual() {
        return spInfoGreaterThanEqual;
    }

    /**
     * spInfoGreaterThanEqual のセッターメソッドです。
     * 
     * @param spInfoGreaterThanEqual spInfoGreaterThanEqual に設定する
     */
    public void setSpInfoGreaterThanEqual(String spInfoGreaterThanEqual) {
        this.spInfoGreaterThanEqual = spInfoGreaterThanEqual;
    }

    /**
     * spInfoLessThan のゲッターメソッドです。
     * 
     * @return the spInfoLessThan
     */
    public String getSpInfoLessThan() {
        return spInfoLessThan;
    }

    /**
     * spInfoLessThan のセッターメソッドです。
     * 
     * @param spInfoLessThan spInfoLessThan に設定する
     */
    public void setSpInfoLessThan(String spInfoLessThan) {
        this.spInfoLessThan = spInfoLessThan;
    }

    /**
     * spInfoLessThanEqual のゲッターメソッドです。
     * 
     * @return the spInfoLessThanEqual
     */
    public String getSpInfoLessThanEqual() {
        return spInfoLessThanEqual;
    }

    /**
     * spInfoLessThanEqual のセッターメソッドです。
     * 
     * @param spInfoLessThanEqual spInfoLessThanEqual に設定する
     */
    public void setSpInfoLessThanEqual(String spInfoLessThanEqual) {
        this.spInfoLessThanEqual = spInfoLessThanEqual;
    }

    /**
     * spInfoLikeFront のゲッターメソッドです。
     * 
     * @return the spInfoLikeFront
     */
    public String getSpInfoLikeFront() {
        return spInfoLikeFront;
    }

    /**
     * spInfoLikeFront のセッターメソッドです。
     * 
     * @param spInfoLikeFront spInfoLikeFront に設定する
     */
    public void setSpInfoLikeFront(String spInfoLikeFront) {
        this.spInfoLikeFront = spInfoLikeFront;
    }

    /**
     * approvalPositionGreaterThan のゲッターメソッドです。
     * 
     * @return the approvalPositionGreaterThan
     */
    public String getApprovalPositionGreaterThan() {
        return approvalPositionGreaterThan;
    }

    /**
     * approvalPositionGreaterThan のセッターメソッドです。
     * 
     * @param approvalPositionGreaterThan approvalPositionGreaterThan に設定する
     */
    public void setApprovalPositionGreaterThan(String approvalPositionGreaterThan) {
        this.approvalPositionGreaterThan = approvalPositionGreaterThan;
    }

    /**
     * approvalPositionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the approvalPositionGreaterThanEqual
     */
    public String getApprovalPositionGreaterThanEqual() {
        return approvalPositionGreaterThanEqual;
    }

    /**
     * approvalPositionGreaterThanEqual のセッターメソッドです。
     * 
     * @param approvalPositionGreaterThanEqual approvalPositionGreaterThanEqual に設定する
     */
    public void setApprovalPositionGreaterThanEqual(String approvalPositionGreaterThanEqual) {
        this.approvalPositionGreaterThanEqual = approvalPositionGreaterThanEqual;
    }

    /**
     * approvalPositionLessThan のゲッターメソッドです。
     * 
     * @return the approvalPositionLessThan
     */
    public String getApprovalPositionLessThan() {
        return approvalPositionLessThan;
    }

    /**
     * approvalPositionLessThan のセッターメソッドです。
     * 
     * @param approvalPositionLessThan approvalPositionLessThan に設定する
     */
    public void setApprovalPositionLessThan(String approvalPositionLessThan) {
        this.approvalPositionLessThan = approvalPositionLessThan;
    }

    /**
     * approvalPositionLessThanEqual のゲッターメソッドです。
     * 
     * @return the approvalPositionLessThanEqual
     */
    public String getApprovalPositionLessThanEqual() {
        return approvalPositionLessThanEqual;
    }

    /**
     * approvalPositionLessThanEqual のセッターメソッドです。
     * 
     * @param approvalPositionLessThanEqual approvalPositionLessThanEqual に設定する
     */
    public void setApprovalPositionLessThanEqual(String approvalPositionLessThanEqual) {
        this.approvalPositionLessThanEqual = approvalPositionLessThanEqual;
    }

    /**
     * approvalPositionLikeFront のゲッターメソッドです。
     * 
     * @return the approvalPositionLikeFront
     */
    public String getApprovalPositionLikeFront() {
        return approvalPositionLikeFront;
    }

    /**
     * approvalPositionLikeFront のセッターメソッドです。
     * 
     * @param approvalPositionLikeFront approvalPositionLikeFront に設定する
     */
    public void setApprovalPositionLikeFront(String approvalPositionLikeFront) {
        this.approvalPositionLikeFront = approvalPositionLikeFront;
    }

    /**
     * approvalNmGreaterThan のゲッターメソッドです。
     * 
     * @return the approvalNmGreaterThan
     */
    public String getApprovalNmGreaterThan() {
        return approvalNmGreaterThan;
    }

    /**
     * approvalNmGreaterThan のセッターメソッドです。
     * 
     * @param approvalNmGreaterThan approvalNmGreaterThan に設定する
     */
    public void setApprovalNmGreaterThan(String approvalNmGreaterThan) {
        this.approvalNmGreaterThan = approvalNmGreaterThan;
    }

    /**
     * approvalNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the approvalNmGreaterThanEqual
     */
    public String getApprovalNmGreaterThanEqual() {
        return approvalNmGreaterThanEqual;
    }

    /**
     * approvalNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param approvalNmGreaterThanEqual approvalNmGreaterThanEqual に設定する
     */
    public void setApprovalNmGreaterThanEqual(String approvalNmGreaterThanEqual) {
        this.approvalNmGreaterThanEqual = approvalNmGreaterThanEqual;
    }

    /**
     * approvalNmLessThan のゲッターメソッドです。
     * 
     * @return the approvalNmLessThan
     */
    public String getApprovalNmLessThan() {
        return approvalNmLessThan;
    }

    /**
     * approvalNmLessThan のセッターメソッドです。
     * 
     * @param approvalNmLessThan approvalNmLessThan に設定する
     */
    public void setApprovalNmLessThan(String approvalNmLessThan) {
        this.approvalNmLessThan = approvalNmLessThan;
    }

    /**
     * approvalNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the approvalNmLessThanEqual
     */
    public String getApprovalNmLessThanEqual() {
        return approvalNmLessThanEqual;
    }

    /**
     * approvalNmLessThanEqual のセッターメソッドです。
     * 
     * @param approvalNmLessThanEqual approvalNmLessThanEqual に設定する
     */
    public void setApprovalNmLessThanEqual(String approvalNmLessThanEqual) {
        this.approvalNmLessThanEqual = approvalNmLessThanEqual;
    }

    /**
     * approvalNmLikeFront のゲッターメソッドです。
     * 
     * @return the approvalNmLikeFront
     */
    public String getApprovalNmLikeFront() {
        return approvalNmLikeFront;
    }

    /**
     * approvalNmLikeFront のセッターメソッドです。
     * 
     * @param approvalNmLikeFront approvalNmLikeFront に設定する
     */
    public void setApprovalNmLikeFront(String approvalNmLikeFront) {
        this.approvalNmLikeFront = approvalNmLikeFront;
    }

    /**
     * containerLooseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThan
     */
    public String getContainerLooseTypGreaterThan() {
        return containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThan のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThan containerLooseTypGreaterThan に設定する
     */
    public void setContainerLooseTypGreaterThan(String containerLooseTypGreaterThan) {
        this.containerLooseTypGreaterThan = containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThanEqual
     */
    public String getContainerLooseTypGreaterThanEqual() {
        return containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThanEqual containerLooseTypGreaterThanEqual に設定する
     */
    public void setContainerLooseTypGreaterThanEqual(String containerLooseTypGreaterThanEqual) {
        this.containerLooseTypGreaterThanEqual = containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypLessThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThan
     */
    public String getContainerLooseTypLessThan() {
        return containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThan のセッターメソッドです。
     * 
     * @param containerLooseTypLessThan containerLooseTypLessThan に設定する
     */
    public void setContainerLooseTypLessThan(String containerLooseTypLessThan) {
        this.containerLooseTypLessThan = containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThanEqual
     */
    public String getContainerLooseTypLessThanEqual() {
        return containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLessThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypLessThanEqual containerLooseTypLessThanEqual に設定する
     */
    public void setContainerLooseTypLessThanEqual(String containerLooseTypLessThanEqual) {
        this.containerLooseTypLessThanEqual = containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLikeFront のゲッターメソッドです。
     * 
     * @return the containerLooseTypLikeFront
     */
    public String getContainerLooseTypLikeFront() {
        return containerLooseTypLikeFront;
    }

    /**
     * containerLooseTypLikeFront のセッターメソッドです。
     * 
     * @param containerLooseTypLikeFront containerLooseTypLikeFront に設定する
     */
    public void setContainerLooseTypLikeFront(String containerLooseTypLikeFront) {
        this.containerLooseTypLikeFront = containerLooseTypLikeFront;
    }

    /**
     * containerSortingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThan
     */
    public String getContainerSortingKeyGreaterThan() {
        return containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThan のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThan containerSortingKeyGreaterThan に設定する
     */
    public void setContainerSortingKeyGreaterThan(String containerSortingKeyGreaterThan) {
        this.containerSortingKeyGreaterThan = containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThanEqual
     */
    public String getContainerSortingKeyGreaterThanEqual() {
        return containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThanEqual containerSortingKeyGreaterThanEqual に設定する
     */
    public void setContainerSortingKeyGreaterThanEqual(String containerSortingKeyGreaterThanEqual) {
        this.containerSortingKeyGreaterThanEqual = containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyLessThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThan
     */
    public String getContainerSortingKeyLessThan() {
        return containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThan のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThan containerSortingKeyLessThan に設定する
     */
    public void setContainerSortingKeyLessThan(String containerSortingKeyLessThan) {
        this.containerSortingKeyLessThan = containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThanEqual
     */
    public String getContainerSortingKeyLessThanEqual() {
        return containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThanEqual containerSortingKeyLessThanEqual に設定する
     */
    public void setContainerSortingKeyLessThanEqual(String containerSortingKeyLessThanEqual) {
        this.containerSortingKeyLessThanEqual = containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLikeFront
     */
    public String getContainerSortingKeyLikeFront() {
        return containerSortingKeyLikeFront;
    }

    /**
     * containerSortingKeyLikeFront のセッターメソッドです。
     * 
     * @param containerSortingKeyLikeFront containerSortingKeyLikeFront に設定する
     */
    public void setContainerSortingKeyLikeFront(String containerSortingKeyLikeFront) {
        this.containerSortingKeyLikeFront = containerSortingKeyLikeFront;
    }

    /**
     * customTimingTypGreaterThan のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThan
     */
    public String getCustomTimingTypGreaterThan() {
        return customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThan のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThan customTimingTypGreaterThan に設定する
     */
    public void setCustomTimingTypGreaterThan(String customTimingTypGreaterThan) {
        this.customTimingTypGreaterThan = customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThanEqual
     */
    public String getCustomTimingTypGreaterThanEqual() {
        return customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThanEqual customTimingTypGreaterThanEqual に設定する
     */
    public void setCustomTimingTypGreaterThanEqual(String customTimingTypGreaterThanEqual) {
        this.customTimingTypGreaterThanEqual = customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypLessThan のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThan
     */
    public String getCustomTimingTypLessThan() {
        return customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThan のセッターメソッドです。
     * 
     * @param customTimingTypLessThan customTimingTypLessThan に設定する
     */
    public void setCustomTimingTypLessThan(String customTimingTypLessThan) {
        this.customTimingTypLessThan = customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThanEqual
     */
    public String getCustomTimingTypLessThanEqual() {
        return customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLessThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypLessThanEqual customTimingTypLessThanEqual に設定する
     */
    public void setCustomTimingTypLessThanEqual(String customTimingTypLessThanEqual) {
        this.customTimingTypLessThanEqual = customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLikeFront のゲッターメソッドです。
     * 
     * @return the customTimingTypLikeFront
     */
    public String getCustomTimingTypLikeFront() {
        return customTimingTypLikeFront;
    }

    /**
     * customTimingTypLikeFront のセッターメソッドです。
     * 
     * @param customTimingTypLikeFront customTimingTypLikeFront に設定する
     */
    public void setCustomTimingTypLikeFront(String customTimingTypLikeFront) {
        this.customTimingTypLikeFront = customTimingTypLikeFront;
    }

    /**
     * cmlTypGreaterThan のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThan
     */
    public String getCmlTypGreaterThan() {
        return cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThan のセッターメソッドです。
     * 
     * @param cmlTypGreaterThan cmlTypGreaterThan に設定する
     */
    public void setCmlTypGreaterThan(String cmlTypGreaterThan) {
        this.cmlTypGreaterThan = cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThanEqual
     */
    public String getCmlTypGreaterThanEqual() {
        return cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param cmlTypGreaterThanEqual cmlTypGreaterThanEqual に設定する
     */
    public void setCmlTypGreaterThanEqual(String cmlTypGreaterThanEqual) {
        this.cmlTypGreaterThanEqual = cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypLessThan のゲッターメソッドです。
     * 
     * @return the cmlTypLessThan
     */
    public String getCmlTypLessThan() {
        return cmlTypLessThan;
    }

    /**
     * cmlTypLessThan のセッターメソッドです。
     * 
     * @param cmlTypLessThan cmlTypLessThan に設定する
     */
    public void setCmlTypLessThan(String cmlTypLessThan) {
        this.cmlTypLessThan = cmlTypLessThan;
    }

    /**
     * cmlTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypLessThanEqual
     */
    public String getCmlTypLessThanEqual() {
        return cmlTypLessThanEqual;
    }

    /**
     * cmlTypLessThanEqual のセッターメソッドです。
     * 
     * @param cmlTypLessThanEqual cmlTypLessThanEqual に設定する
     */
    public void setCmlTypLessThanEqual(String cmlTypLessThanEqual) {
        this.cmlTypLessThanEqual = cmlTypLessThanEqual;
    }

    /**
     * cmlTypLikeFront のゲッターメソッドです。
     * 
     * @return the cmlTypLikeFront
     */
    public String getCmlTypLikeFront() {
        return cmlTypLikeFront;
    }

    /**
     * cmlTypLikeFront のセッターメソッドです。
     * 
     * @param cmlTypLikeFront cmlTypLikeFront に設定する
     */
    public void setCmlTypLikeFront(String cmlTypLikeFront) {
        this.cmlTypLikeFront = cmlTypLikeFront;
    }

    /**
     * invoiceKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThan
     */
    public String getInvoiceKeyGreaterThan() {
        return invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThan のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThan invoiceKeyGreaterThan に設定する
     */
    public void setInvoiceKeyGreaterThan(String invoiceKeyGreaterThan) {
        this.invoiceKeyGreaterThan = invoiceKeyGreaterThan;
    }

    /**
     * invoiceKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyGreaterThanEqual
     */
    public String getInvoiceKeyGreaterThanEqual() {
        return invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyGreaterThanEqual invoiceKeyGreaterThanEqual に設定する
     */
    public void setInvoiceKeyGreaterThanEqual(String invoiceKeyGreaterThanEqual) {
        this.invoiceKeyGreaterThanEqual = invoiceKeyGreaterThanEqual;
    }

    /**
     * invoiceKeyLessThan のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThan
     */
    public String getInvoiceKeyLessThan() {
        return invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThan のセッターメソッドです。
     * 
     * @param invoiceKeyLessThan invoiceKeyLessThan に設定する
     */
    public void setInvoiceKeyLessThan(String invoiceKeyLessThan) {
        this.invoiceKeyLessThan = invoiceKeyLessThan;
    }

    /**
     * invoiceKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceKeyLessThanEqual
     */
    public String getInvoiceKeyLessThanEqual() {
        return invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceKeyLessThanEqual invoiceKeyLessThanEqual に設定する
     */
    public void setInvoiceKeyLessThanEqual(String invoiceKeyLessThanEqual) {
        this.invoiceKeyLessThanEqual = invoiceKeyLessThanEqual;
    }

    /**
     * invoiceKeyLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceKeyLikeFront
     */
    public String getInvoiceKeyLikeFront() {
        return invoiceKeyLikeFront;
    }

    /**
     * invoiceKeyLikeFront のセッターメソッドです。
     * 
     * @param invoiceKeyLikeFront invoiceKeyLikeFront に設定する
     */
    public void setInvoiceKeyLikeFront(String invoiceKeyLikeFront) {
        this.invoiceKeyLikeFront = invoiceKeyLikeFront;
    }

    /**
     * notifyParty1CompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCdGreaterThan
     */
    public String getNotifyParty1CompCdGreaterThan() {
        return notifyParty1CompCdGreaterThan;
    }

    /**
     * notifyParty1CompCdGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty1CompCdGreaterThan notifyParty1CompCdGreaterThan に設定する
     */
    public void setNotifyParty1CompCdGreaterThan(String notifyParty1CompCdGreaterThan) {
        this.notifyParty1CompCdGreaterThan = notifyParty1CompCdGreaterThan;
    }

    /**
     * notifyParty1CompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCdGreaterThanEqual
     */
    public String getNotifyParty1CompCdGreaterThanEqual() {
        return notifyParty1CompCdGreaterThanEqual;
    }

    /**
     * notifyParty1CompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1CompCdGreaterThanEqual notifyParty1CompCdGreaterThanEqual に設定する
     */
    public void setNotifyParty1CompCdGreaterThanEqual(String notifyParty1CompCdGreaterThanEqual) {
        this.notifyParty1CompCdGreaterThanEqual = notifyParty1CompCdGreaterThanEqual;
    }

    /**
     * notifyParty1CompCdLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCdLessThan
     */
    public String getNotifyParty1CompCdLessThan() {
        return notifyParty1CompCdLessThan;
    }

    /**
     * notifyParty1CompCdLessThan のセッターメソッドです。
     * 
     * @param notifyParty1CompCdLessThan notifyParty1CompCdLessThan に設定する
     */
    public void setNotifyParty1CompCdLessThan(String notifyParty1CompCdLessThan) {
        this.notifyParty1CompCdLessThan = notifyParty1CompCdLessThan;
    }

    /**
     * notifyParty1CompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCdLessThanEqual
     */
    public String getNotifyParty1CompCdLessThanEqual() {
        return notifyParty1CompCdLessThanEqual;
    }

    /**
     * notifyParty1CompCdLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1CompCdLessThanEqual notifyParty1CompCdLessThanEqual に設定する
     */
    public void setNotifyParty1CompCdLessThanEqual(String notifyParty1CompCdLessThanEqual) {
        this.notifyParty1CompCdLessThanEqual = notifyParty1CompCdLessThanEqual;
    }

    /**
     * notifyParty1CompCdLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty1CompCdLikeFront
     */
    public String getNotifyParty1CompCdLikeFront() {
        return notifyParty1CompCdLikeFront;
    }

    /**
     * notifyParty1CompCdLikeFront のセッターメソッドです。
     * 
     * @param notifyParty1CompCdLikeFront notifyParty1CompCdLikeFront に設定する
     */
    public void setNotifyParty1CompCdLikeFront(String notifyParty1CompCdLikeFront) {
        this.notifyParty1CompCdLikeFront = notifyParty1CompCdLikeFront;
    }

    /**
     * notifyParty1CompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbbGreaterThan
     */
    public String getNotifyParty1CompNmAbbGreaterThan() {
        return notifyParty1CompNmAbbGreaterThan;
    }

    /**
     * notifyParty1CompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbbGreaterThan notifyParty1CompNmAbbGreaterThan に設定する
     */
    public void setNotifyParty1CompNmAbbGreaterThan(String notifyParty1CompNmAbbGreaterThan) {
        this.notifyParty1CompNmAbbGreaterThan = notifyParty1CompNmAbbGreaterThan;
    }

    /**
     * notifyParty1CompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbbGreaterThanEqual
     */
    public String getNotifyParty1CompNmAbbGreaterThanEqual() {
        return notifyParty1CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty1CompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbbGreaterThanEqual notifyParty1CompNmAbbGreaterThanEqual に設定する
     */
    public void setNotifyParty1CompNmAbbGreaterThanEqual(String notifyParty1CompNmAbbGreaterThanEqual) {
        this.notifyParty1CompNmAbbGreaterThanEqual = notifyParty1CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty1CompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbbLessThan
     */
    public String getNotifyParty1CompNmAbbLessThan() {
        return notifyParty1CompNmAbbLessThan;
    }

    /**
     * notifyParty1CompNmAbbLessThan のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbbLessThan notifyParty1CompNmAbbLessThan に設定する
     */
    public void setNotifyParty1CompNmAbbLessThan(String notifyParty1CompNmAbbLessThan) {
        this.notifyParty1CompNmAbbLessThan = notifyParty1CompNmAbbLessThan;
    }

    /**
     * notifyParty1CompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbbLessThanEqual
     */
    public String getNotifyParty1CompNmAbbLessThanEqual() {
        return notifyParty1CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty1CompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbbLessThanEqual notifyParty1CompNmAbbLessThanEqual に設定する
     */
    public void setNotifyParty1CompNmAbbLessThanEqual(String notifyParty1CompNmAbbLessThanEqual) {
        this.notifyParty1CompNmAbbLessThanEqual = notifyParty1CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty1CompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty1CompNmAbbLikeFront
     */
    public String getNotifyParty1CompNmAbbLikeFront() {
        return notifyParty1CompNmAbbLikeFront;
    }

    /**
     * notifyParty1CompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param notifyParty1CompNmAbbLikeFront notifyParty1CompNmAbbLikeFront に設定する
     */
    public void setNotifyParty1CompNmAbbLikeFront(String notifyParty1CompNmAbbLikeFront) {
        this.notifyParty1CompNmAbbLikeFront = notifyParty1CompNmAbbLikeFront;
    }

    /**
     * notifyParty1NmGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty1NmGreaterThan
     */
    public String getNotifyParty1NmGreaterThan() {
        return notifyParty1NmGreaterThan;
    }

    /**
     * notifyParty1NmGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty1NmGreaterThan notifyParty1NmGreaterThan に設定する
     */
    public void setNotifyParty1NmGreaterThan(String notifyParty1NmGreaterThan) {
        this.notifyParty1NmGreaterThan = notifyParty1NmGreaterThan;
    }

    /**
     * notifyParty1NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1NmGreaterThanEqual
     */
    public String getNotifyParty1NmGreaterThanEqual() {
        return notifyParty1NmGreaterThanEqual;
    }

    /**
     * notifyParty1NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1NmGreaterThanEqual notifyParty1NmGreaterThanEqual に設定する
     */
    public void setNotifyParty1NmGreaterThanEqual(String notifyParty1NmGreaterThanEqual) {
        this.notifyParty1NmGreaterThanEqual = notifyParty1NmGreaterThanEqual;
    }

    /**
     * notifyParty1NmLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty1NmLessThan
     */
    public String getNotifyParty1NmLessThan() {
        return notifyParty1NmLessThan;
    }

    /**
     * notifyParty1NmLessThan のセッターメソッドです。
     * 
     * @param notifyParty1NmLessThan notifyParty1NmLessThan に設定する
     */
    public void setNotifyParty1NmLessThan(String notifyParty1NmLessThan) {
        this.notifyParty1NmLessThan = notifyParty1NmLessThan;
    }

    /**
     * notifyParty1NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1NmLessThanEqual
     */
    public String getNotifyParty1NmLessThanEqual() {
        return notifyParty1NmLessThanEqual;
    }

    /**
     * notifyParty1NmLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1NmLessThanEqual notifyParty1NmLessThanEqual に設定する
     */
    public void setNotifyParty1NmLessThanEqual(String notifyParty1NmLessThanEqual) {
        this.notifyParty1NmLessThanEqual = notifyParty1NmLessThanEqual;
    }

    /**
     * notifyParty1NmLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty1NmLikeFront
     */
    public String getNotifyParty1NmLikeFront() {
        return notifyParty1NmLikeFront;
    }

    /**
     * notifyParty1NmLikeFront のセッターメソッドです。
     * 
     * @param notifyParty1NmLikeFront notifyParty1NmLikeFront に設定する
     */
    public void setNotifyParty1NmLikeFront(String notifyParty1NmLikeFront) {
        this.notifyParty1NmLikeFront = notifyParty1NmLikeFront;
    }

    /**
     * notifyParty1AddrGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty1AddrGreaterThan
     */
    public String getNotifyParty1AddrGreaterThan() {
        return notifyParty1AddrGreaterThan;
    }

    /**
     * notifyParty1AddrGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty1AddrGreaterThan notifyParty1AddrGreaterThan に設定する
     */
    public void setNotifyParty1AddrGreaterThan(String notifyParty1AddrGreaterThan) {
        this.notifyParty1AddrGreaterThan = notifyParty1AddrGreaterThan;
    }

    /**
     * notifyParty1AddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1AddrGreaterThanEqual
     */
    public String getNotifyParty1AddrGreaterThanEqual() {
        return notifyParty1AddrGreaterThanEqual;
    }

    /**
     * notifyParty1AddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1AddrGreaterThanEqual notifyParty1AddrGreaterThanEqual に設定する
     */
    public void setNotifyParty1AddrGreaterThanEqual(String notifyParty1AddrGreaterThanEqual) {
        this.notifyParty1AddrGreaterThanEqual = notifyParty1AddrGreaterThanEqual;
    }

    /**
     * notifyParty1AddrLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty1AddrLessThan
     */
    public String getNotifyParty1AddrLessThan() {
        return notifyParty1AddrLessThan;
    }

    /**
     * notifyParty1AddrLessThan のセッターメソッドです。
     * 
     * @param notifyParty1AddrLessThan notifyParty1AddrLessThan に設定する
     */
    public void setNotifyParty1AddrLessThan(String notifyParty1AddrLessThan) {
        this.notifyParty1AddrLessThan = notifyParty1AddrLessThan;
    }

    /**
     * notifyParty1AddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty1AddrLessThanEqual
     */
    public String getNotifyParty1AddrLessThanEqual() {
        return notifyParty1AddrLessThanEqual;
    }

    /**
     * notifyParty1AddrLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty1AddrLessThanEqual notifyParty1AddrLessThanEqual に設定する
     */
    public void setNotifyParty1AddrLessThanEqual(String notifyParty1AddrLessThanEqual) {
        this.notifyParty1AddrLessThanEqual = notifyParty1AddrLessThanEqual;
    }

    /**
     * notifyParty1AddrLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty1AddrLikeFront
     */
    public String getNotifyParty1AddrLikeFront() {
        return notifyParty1AddrLikeFront;
    }

    /**
     * notifyParty1AddrLikeFront のセッターメソッドです。
     * 
     * @param notifyParty1AddrLikeFront notifyParty1AddrLikeFront に設定する
     */
    public void setNotifyParty1AddrLikeFront(String notifyParty1AddrLikeFront) {
        this.notifyParty1AddrLikeFront = notifyParty1AddrLikeFront;
    }

    /**
     * notifyParty2CompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCdGreaterThan
     */
    public String getNotifyParty2CompCdGreaterThan() {
        return notifyParty2CompCdGreaterThan;
    }

    /**
     * notifyParty2CompCdGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty2CompCdGreaterThan notifyParty2CompCdGreaterThan に設定する
     */
    public void setNotifyParty2CompCdGreaterThan(String notifyParty2CompCdGreaterThan) {
        this.notifyParty2CompCdGreaterThan = notifyParty2CompCdGreaterThan;
    }

    /**
     * notifyParty2CompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCdGreaterThanEqual
     */
    public String getNotifyParty2CompCdGreaterThanEqual() {
        return notifyParty2CompCdGreaterThanEqual;
    }

    /**
     * notifyParty2CompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2CompCdGreaterThanEqual notifyParty2CompCdGreaterThanEqual に設定する
     */
    public void setNotifyParty2CompCdGreaterThanEqual(String notifyParty2CompCdGreaterThanEqual) {
        this.notifyParty2CompCdGreaterThanEqual = notifyParty2CompCdGreaterThanEqual;
    }

    /**
     * notifyParty2CompCdLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCdLessThan
     */
    public String getNotifyParty2CompCdLessThan() {
        return notifyParty2CompCdLessThan;
    }

    /**
     * notifyParty2CompCdLessThan のセッターメソッドです。
     * 
     * @param notifyParty2CompCdLessThan notifyParty2CompCdLessThan に設定する
     */
    public void setNotifyParty2CompCdLessThan(String notifyParty2CompCdLessThan) {
        this.notifyParty2CompCdLessThan = notifyParty2CompCdLessThan;
    }

    /**
     * notifyParty2CompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCdLessThanEqual
     */
    public String getNotifyParty2CompCdLessThanEqual() {
        return notifyParty2CompCdLessThanEqual;
    }

    /**
     * notifyParty2CompCdLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2CompCdLessThanEqual notifyParty2CompCdLessThanEqual に設定する
     */
    public void setNotifyParty2CompCdLessThanEqual(String notifyParty2CompCdLessThanEqual) {
        this.notifyParty2CompCdLessThanEqual = notifyParty2CompCdLessThanEqual;
    }

    /**
     * notifyParty2CompCdLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty2CompCdLikeFront
     */
    public String getNotifyParty2CompCdLikeFront() {
        return notifyParty2CompCdLikeFront;
    }

    /**
     * notifyParty2CompCdLikeFront のセッターメソッドです。
     * 
     * @param notifyParty2CompCdLikeFront notifyParty2CompCdLikeFront に設定する
     */
    public void setNotifyParty2CompCdLikeFront(String notifyParty2CompCdLikeFront) {
        this.notifyParty2CompCdLikeFront = notifyParty2CompCdLikeFront;
    }

    /**
     * notifyParty2CompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbbGreaterThan
     */
    public String getNotifyParty2CompNmAbbGreaterThan() {
        return notifyParty2CompNmAbbGreaterThan;
    }

    /**
     * notifyParty2CompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbbGreaterThan notifyParty2CompNmAbbGreaterThan に設定する
     */
    public void setNotifyParty2CompNmAbbGreaterThan(String notifyParty2CompNmAbbGreaterThan) {
        this.notifyParty2CompNmAbbGreaterThan = notifyParty2CompNmAbbGreaterThan;
    }

    /**
     * notifyParty2CompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbbGreaterThanEqual
     */
    public String getNotifyParty2CompNmAbbGreaterThanEqual() {
        return notifyParty2CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty2CompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbbGreaterThanEqual notifyParty2CompNmAbbGreaterThanEqual に設定する
     */
    public void setNotifyParty2CompNmAbbGreaterThanEqual(String notifyParty2CompNmAbbGreaterThanEqual) {
        this.notifyParty2CompNmAbbGreaterThanEqual = notifyParty2CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty2CompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbbLessThan
     */
    public String getNotifyParty2CompNmAbbLessThan() {
        return notifyParty2CompNmAbbLessThan;
    }

    /**
     * notifyParty2CompNmAbbLessThan のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbbLessThan notifyParty2CompNmAbbLessThan に設定する
     */
    public void setNotifyParty2CompNmAbbLessThan(String notifyParty2CompNmAbbLessThan) {
        this.notifyParty2CompNmAbbLessThan = notifyParty2CompNmAbbLessThan;
    }

    /**
     * notifyParty2CompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbbLessThanEqual
     */
    public String getNotifyParty2CompNmAbbLessThanEqual() {
        return notifyParty2CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty2CompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbbLessThanEqual notifyParty2CompNmAbbLessThanEqual に設定する
     */
    public void setNotifyParty2CompNmAbbLessThanEqual(String notifyParty2CompNmAbbLessThanEqual) {
        this.notifyParty2CompNmAbbLessThanEqual = notifyParty2CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty2CompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty2CompNmAbbLikeFront
     */
    public String getNotifyParty2CompNmAbbLikeFront() {
        return notifyParty2CompNmAbbLikeFront;
    }

    /**
     * notifyParty2CompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param notifyParty2CompNmAbbLikeFront notifyParty2CompNmAbbLikeFront に設定する
     */
    public void setNotifyParty2CompNmAbbLikeFront(String notifyParty2CompNmAbbLikeFront) {
        this.notifyParty2CompNmAbbLikeFront = notifyParty2CompNmAbbLikeFront;
    }

    /**
     * notifyParty2NmGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty2NmGreaterThan
     */
    public String getNotifyParty2NmGreaterThan() {
        return notifyParty2NmGreaterThan;
    }

    /**
     * notifyParty2NmGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty2NmGreaterThan notifyParty2NmGreaterThan に設定する
     */
    public void setNotifyParty2NmGreaterThan(String notifyParty2NmGreaterThan) {
        this.notifyParty2NmGreaterThan = notifyParty2NmGreaterThan;
    }

    /**
     * notifyParty2NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2NmGreaterThanEqual
     */
    public String getNotifyParty2NmGreaterThanEqual() {
        return notifyParty2NmGreaterThanEqual;
    }

    /**
     * notifyParty2NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2NmGreaterThanEqual notifyParty2NmGreaterThanEqual に設定する
     */
    public void setNotifyParty2NmGreaterThanEqual(String notifyParty2NmGreaterThanEqual) {
        this.notifyParty2NmGreaterThanEqual = notifyParty2NmGreaterThanEqual;
    }

    /**
     * notifyParty2NmLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty2NmLessThan
     */
    public String getNotifyParty2NmLessThan() {
        return notifyParty2NmLessThan;
    }

    /**
     * notifyParty2NmLessThan のセッターメソッドです。
     * 
     * @param notifyParty2NmLessThan notifyParty2NmLessThan に設定する
     */
    public void setNotifyParty2NmLessThan(String notifyParty2NmLessThan) {
        this.notifyParty2NmLessThan = notifyParty2NmLessThan;
    }

    /**
     * notifyParty2NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2NmLessThanEqual
     */
    public String getNotifyParty2NmLessThanEqual() {
        return notifyParty2NmLessThanEqual;
    }

    /**
     * notifyParty2NmLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2NmLessThanEqual notifyParty2NmLessThanEqual に設定する
     */
    public void setNotifyParty2NmLessThanEqual(String notifyParty2NmLessThanEqual) {
        this.notifyParty2NmLessThanEqual = notifyParty2NmLessThanEqual;
    }

    /**
     * notifyParty2NmLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty2NmLikeFront
     */
    public String getNotifyParty2NmLikeFront() {
        return notifyParty2NmLikeFront;
    }

    /**
     * notifyParty2NmLikeFront のセッターメソッドです。
     * 
     * @param notifyParty2NmLikeFront notifyParty2NmLikeFront に設定する
     */
    public void setNotifyParty2NmLikeFront(String notifyParty2NmLikeFront) {
        this.notifyParty2NmLikeFront = notifyParty2NmLikeFront;
    }

    /**
     * notifyParty2AddrGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty2AddrGreaterThan
     */
    public String getNotifyParty2AddrGreaterThan() {
        return notifyParty2AddrGreaterThan;
    }

    /**
     * notifyParty2AddrGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty2AddrGreaterThan notifyParty2AddrGreaterThan に設定する
     */
    public void setNotifyParty2AddrGreaterThan(String notifyParty2AddrGreaterThan) {
        this.notifyParty2AddrGreaterThan = notifyParty2AddrGreaterThan;
    }

    /**
     * notifyParty2AddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2AddrGreaterThanEqual
     */
    public String getNotifyParty2AddrGreaterThanEqual() {
        return notifyParty2AddrGreaterThanEqual;
    }

    /**
     * notifyParty2AddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2AddrGreaterThanEqual notifyParty2AddrGreaterThanEqual に設定する
     */
    public void setNotifyParty2AddrGreaterThanEqual(String notifyParty2AddrGreaterThanEqual) {
        this.notifyParty2AddrGreaterThanEqual = notifyParty2AddrGreaterThanEqual;
    }

    /**
     * notifyParty2AddrLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty2AddrLessThan
     */
    public String getNotifyParty2AddrLessThan() {
        return notifyParty2AddrLessThan;
    }

    /**
     * notifyParty2AddrLessThan のセッターメソッドです。
     * 
     * @param notifyParty2AddrLessThan notifyParty2AddrLessThan に設定する
     */
    public void setNotifyParty2AddrLessThan(String notifyParty2AddrLessThan) {
        this.notifyParty2AddrLessThan = notifyParty2AddrLessThan;
    }

    /**
     * notifyParty2AddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty2AddrLessThanEqual
     */
    public String getNotifyParty2AddrLessThanEqual() {
        return notifyParty2AddrLessThanEqual;
    }

    /**
     * notifyParty2AddrLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty2AddrLessThanEqual notifyParty2AddrLessThanEqual に設定する
     */
    public void setNotifyParty2AddrLessThanEqual(String notifyParty2AddrLessThanEqual) {
        this.notifyParty2AddrLessThanEqual = notifyParty2AddrLessThanEqual;
    }

    /**
     * notifyParty2AddrLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty2AddrLikeFront
     */
    public String getNotifyParty2AddrLikeFront() {
        return notifyParty2AddrLikeFront;
    }

    /**
     * notifyParty2AddrLikeFront のセッターメソッドです。
     * 
     * @param notifyParty2AddrLikeFront notifyParty2AddrLikeFront に設定する
     */
    public void setNotifyParty2AddrLikeFront(String notifyParty2AddrLikeFront) {
        this.notifyParty2AddrLikeFront = notifyParty2AddrLikeFront;
    }

    /**
     * notifyParty3CompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCdGreaterThan
     */
    public String getNotifyParty3CompCdGreaterThan() {
        return notifyParty3CompCdGreaterThan;
    }

    /**
     * notifyParty3CompCdGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty3CompCdGreaterThan notifyParty3CompCdGreaterThan に設定する
     */
    public void setNotifyParty3CompCdGreaterThan(String notifyParty3CompCdGreaterThan) {
        this.notifyParty3CompCdGreaterThan = notifyParty3CompCdGreaterThan;
    }

    /**
     * notifyParty3CompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCdGreaterThanEqual
     */
    public String getNotifyParty3CompCdGreaterThanEqual() {
        return notifyParty3CompCdGreaterThanEqual;
    }

    /**
     * notifyParty3CompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3CompCdGreaterThanEqual notifyParty3CompCdGreaterThanEqual に設定する
     */
    public void setNotifyParty3CompCdGreaterThanEqual(String notifyParty3CompCdGreaterThanEqual) {
        this.notifyParty3CompCdGreaterThanEqual = notifyParty3CompCdGreaterThanEqual;
    }

    /**
     * notifyParty3CompCdLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCdLessThan
     */
    public String getNotifyParty3CompCdLessThan() {
        return notifyParty3CompCdLessThan;
    }

    /**
     * notifyParty3CompCdLessThan のセッターメソッドです。
     * 
     * @param notifyParty3CompCdLessThan notifyParty3CompCdLessThan に設定する
     */
    public void setNotifyParty3CompCdLessThan(String notifyParty3CompCdLessThan) {
        this.notifyParty3CompCdLessThan = notifyParty3CompCdLessThan;
    }

    /**
     * notifyParty3CompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCdLessThanEqual
     */
    public String getNotifyParty3CompCdLessThanEqual() {
        return notifyParty3CompCdLessThanEqual;
    }

    /**
     * notifyParty3CompCdLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3CompCdLessThanEqual notifyParty3CompCdLessThanEqual に設定する
     */
    public void setNotifyParty3CompCdLessThanEqual(String notifyParty3CompCdLessThanEqual) {
        this.notifyParty3CompCdLessThanEqual = notifyParty3CompCdLessThanEqual;
    }

    /**
     * notifyParty3CompCdLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty3CompCdLikeFront
     */
    public String getNotifyParty3CompCdLikeFront() {
        return notifyParty3CompCdLikeFront;
    }

    /**
     * notifyParty3CompCdLikeFront のセッターメソッドです。
     * 
     * @param notifyParty3CompCdLikeFront notifyParty3CompCdLikeFront に設定する
     */
    public void setNotifyParty3CompCdLikeFront(String notifyParty3CompCdLikeFront) {
        this.notifyParty3CompCdLikeFront = notifyParty3CompCdLikeFront;
    }

    /**
     * notifyParty3CompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbbGreaterThan
     */
    public String getNotifyParty3CompNmAbbGreaterThan() {
        return notifyParty3CompNmAbbGreaterThan;
    }

    /**
     * notifyParty3CompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbbGreaterThan notifyParty3CompNmAbbGreaterThan に設定する
     */
    public void setNotifyParty3CompNmAbbGreaterThan(String notifyParty3CompNmAbbGreaterThan) {
        this.notifyParty3CompNmAbbGreaterThan = notifyParty3CompNmAbbGreaterThan;
    }

    /**
     * notifyParty3CompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbbGreaterThanEqual
     */
    public String getNotifyParty3CompNmAbbGreaterThanEqual() {
        return notifyParty3CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty3CompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbbGreaterThanEqual notifyParty3CompNmAbbGreaterThanEqual に設定する
     */
    public void setNotifyParty3CompNmAbbGreaterThanEqual(String notifyParty3CompNmAbbGreaterThanEqual) {
        this.notifyParty3CompNmAbbGreaterThanEqual = notifyParty3CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty3CompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbbLessThan
     */
    public String getNotifyParty3CompNmAbbLessThan() {
        return notifyParty3CompNmAbbLessThan;
    }

    /**
     * notifyParty3CompNmAbbLessThan のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbbLessThan notifyParty3CompNmAbbLessThan に設定する
     */
    public void setNotifyParty3CompNmAbbLessThan(String notifyParty3CompNmAbbLessThan) {
        this.notifyParty3CompNmAbbLessThan = notifyParty3CompNmAbbLessThan;
    }

    /**
     * notifyParty3CompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbbLessThanEqual
     */
    public String getNotifyParty3CompNmAbbLessThanEqual() {
        return notifyParty3CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty3CompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbbLessThanEqual notifyParty3CompNmAbbLessThanEqual に設定する
     */
    public void setNotifyParty3CompNmAbbLessThanEqual(String notifyParty3CompNmAbbLessThanEqual) {
        this.notifyParty3CompNmAbbLessThanEqual = notifyParty3CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty3CompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty3CompNmAbbLikeFront
     */
    public String getNotifyParty3CompNmAbbLikeFront() {
        return notifyParty3CompNmAbbLikeFront;
    }

    /**
     * notifyParty3CompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param notifyParty3CompNmAbbLikeFront notifyParty3CompNmAbbLikeFront に設定する
     */
    public void setNotifyParty3CompNmAbbLikeFront(String notifyParty3CompNmAbbLikeFront) {
        this.notifyParty3CompNmAbbLikeFront = notifyParty3CompNmAbbLikeFront;
    }

    /**
     * notifyParty3NmGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty3NmGreaterThan
     */
    public String getNotifyParty3NmGreaterThan() {
        return notifyParty3NmGreaterThan;
    }

    /**
     * notifyParty3NmGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty3NmGreaterThan notifyParty3NmGreaterThan に設定する
     */
    public void setNotifyParty3NmGreaterThan(String notifyParty3NmGreaterThan) {
        this.notifyParty3NmGreaterThan = notifyParty3NmGreaterThan;
    }

    /**
     * notifyParty3NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3NmGreaterThanEqual
     */
    public String getNotifyParty3NmGreaterThanEqual() {
        return notifyParty3NmGreaterThanEqual;
    }

    /**
     * notifyParty3NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3NmGreaterThanEqual notifyParty3NmGreaterThanEqual に設定する
     */
    public void setNotifyParty3NmGreaterThanEqual(String notifyParty3NmGreaterThanEqual) {
        this.notifyParty3NmGreaterThanEqual = notifyParty3NmGreaterThanEqual;
    }

    /**
     * notifyParty3NmLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty3NmLessThan
     */
    public String getNotifyParty3NmLessThan() {
        return notifyParty3NmLessThan;
    }

    /**
     * notifyParty3NmLessThan のセッターメソッドです。
     * 
     * @param notifyParty3NmLessThan notifyParty3NmLessThan に設定する
     */
    public void setNotifyParty3NmLessThan(String notifyParty3NmLessThan) {
        this.notifyParty3NmLessThan = notifyParty3NmLessThan;
    }

    /**
     * notifyParty3NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3NmLessThanEqual
     */
    public String getNotifyParty3NmLessThanEqual() {
        return notifyParty3NmLessThanEqual;
    }

    /**
     * notifyParty3NmLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3NmLessThanEqual notifyParty3NmLessThanEqual に設定する
     */
    public void setNotifyParty3NmLessThanEqual(String notifyParty3NmLessThanEqual) {
        this.notifyParty3NmLessThanEqual = notifyParty3NmLessThanEqual;
    }

    /**
     * notifyParty3NmLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty3NmLikeFront
     */
    public String getNotifyParty3NmLikeFront() {
        return notifyParty3NmLikeFront;
    }

    /**
     * notifyParty3NmLikeFront のセッターメソッドです。
     * 
     * @param notifyParty3NmLikeFront notifyParty3NmLikeFront に設定する
     */
    public void setNotifyParty3NmLikeFront(String notifyParty3NmLikeFront) {
        this.notifyParty3NmLikeFront = notifyParty3NmLikeFront;
    }

    /**
     * notifyParty3AddrGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty3AddrGreaterThan
     */
    public String getNotifyParty3AddrGreaterThan() {
        return notifyParty3AddrGreaterThan;
    }

    /**
     * notifyParty3AddrGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty3AddrGreaterThan notifyParty3AddrGreaterThan に設定する
     */
    public void setNotifyParty3AddrGreaterThan(String notifyParty3AddrGreaterThan) {
        this.notifyParty3AddrGreaterThan = notifyParty3AddrGreaterThan;
    }

    /**
     * notifyParty3AddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3AddrGreaterThanEqual
     */
    public String getNotifyParty3AddrGreaterThanEqual() {
        return notifyParty3AddrGreaterThanEqual;
    }

    /**
     * notifyParty3AddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3AddrGreaterThanEqual notifyParty3AddrGreaterThanEqual に設定する
     */
    public void setNotifyParty3AddrGreaterThanEqual(String notifyParty3AddrGreaterThanEqual) {
        this.notifyParty3AddrGreaterThanEqual = notifyParty3AddrGreaterThanEqual;
    }

    /**
     * notifyParty3AddrLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty3AddrLessThan
     */
    public String getNotifyParty3AddrLessThan() {
        return notifyParty3AddrLessThan;
    }

    /**
     * notifyParty3AddrLessThan のセッターメソッドです。
     * 
     * @param notifyParty3AddrLessThan notifyParty3AddrLessThan に設定する
     */
    public void setNotifyParty3AddrLessThan(String notifyParty3AddrLessThan) {
        this.notifyParty3AddrLessThan = notifyParty3AddrLessThan;
    }

    /**
     * notifyParty3AddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty3AddrLessThanEqual
     */
    public String getNotifyParty3AddrLessThanEqual() {
        return notifyParty3AddrLessThanEqual;
    }

    /**
     * notifyParty3AddrLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty3AddrLessThanEqual notifyParty3AddrLessThanEqual に設定する
     */
    public void setNotifyParty3AddrLessThanEqual(String notifyParty3AddrLessThanEqual) {
        this.notifyParty3AddrLessThanEqual = notifyParty3AddrLessThanEqual;
    }

    /**
     * notifyParty3AddrLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty3AddrLikeFront
     */
    public String getNotifyParty3AddrLikeFront() {
        return notifyParty3AddrLikeFront;
    }

    /**
     * notifyParty3AddrLikeFront のセッターメソッドです。
     * 
     * @param notifyParty3AddrLikeFront notifyParty3AddrLikeFront に設定する
     */
    public void setNotifyParty3AddrLikeFront(String notifyParty3AddrLikeFront) {
        this.notifyParty3AddrLikeFront = notifyParty3AddrLikeFront;
    }

    /**
     * notifyParty4CompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCdGreaterThan
     */
    public String getNotifyParty4CompCdGreaterThan() {
        return notifyParty4CompCdGreaterThan;
    }

    /**
     * notifyParty4CompCdGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty4CompCdGreaterThan notifyParty4CompCdGreaterThan に設定する
     */
    public void setNotifyParty4CompCdGreaterThan(String notifyParty4CompCdGreaterThan) {
        this.notifyParty4CompCdGreaterThan = notifyParty4CompCdGreaterThan;
    }

    /**
     * notifyParty4CompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCdGreaterThanEqual
     */
    public String getNotifyParty4CompCdGreaterThanEqual() {
        return notifyParty4CompCdGreaterThanEqual;
    }

    /**
     * notifyParty4CompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4CompCdGreaterThanEqual notifyParty4CompCdGreaterThanEqual に設定する
     */
    public void setNotifyParty4CompCdGreaterThanEqual(String notifyParty4CompCdGreaterThanEqual) {
        this.notifyParty4CompCdGreaterThanEqual = notifyParty4CompCdGreaterThanEqual;
    }

    /**
     * notifyParty4CompCdLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCdLessThan
     */
    public String getNotifyParty4CompCdLessThan() {
        return notifyParty4CompCdLessThan;
    }

    /**
     * notifyParty4CompCdLessThan のセッターメソッドです。
     * 
     * @param notifyParty4CompCdLessThan notifyParty4CompCdLessThan に設定する
     */
    public void setNotifyParty4CompCdLessThan(String notifyParty4CompCdLessThan) {
        this.notifyParty4CompCdLessThan = notifyParty4CompCdLessThan;
    }

    /**
     * notifyParty4CompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCdLessThanEqual
     */
    public String getNotifyParty4CompCdLessThanEqual() {
        return notifyParty4CompCdLessThanEqual;
    }

    /**
     * notifyParty4CompCdLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4CompCdLessThanEqual notifyParty4CompCdLessThanEqual に設定する
     */
    public void setNotifyParty4CompCdLessThanEqual(String notifyParty4CompCdLessThanEqual) {
        this.notifyParty4CompCdLessThanEqual = notifyParty4CompCdLessThanEqual;
    }

    /**
     * notifyParty4CompCdLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty4CompCdLikeFront
     */
    public String getNotifyParty4CompCdLikeFront() {
        return notifyParty4CompCdLikeFront;
    }

    /**
     * notifyParty4CompCdLikeFront のセッターメソッドです。
     * 
     * @param notifyParty4CompCdLikeFront notifyParty4CompCdLikeFront に設定する
     */
    public void setNotifyParty4CompCdLikeFront(String notifyParty4CompCdLikeFront) {
        this.notifyParty4CompCdLikeFront = notifyParty4CompCdLikeFront;
    }

    /**
     * notifyParty4CompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbbGreaterThan
     */
    public String getNotifyParty4CompNmAbbGreaterThan() {
        return notifyParty4CompNmAbbGreaterThan;
    }

    /**
     * notifyParty4CompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbbGreaterThan notifyParty4CompNmAbbGreaterThan に設定する
     */
    public void setNotifyParty4CompNmAbbGreaterThan(String notifyParty4CompNmAbbGreaterThan) {
        this.notifyParty4CompNmAbbGreaterThan = notifyParty4CompNmAbbGreaterThan;
    }

    /**
     * notifyParty4CompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbbGreaterThanEqual
     */
    public String getNotifyParty4CompNmAbbGreaterThanEqual() {
        return notifyParty4CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty4CompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbbGreaterThanEqual notifyParty4CompNmAbbGreaterThanEqual に設定する
     */
    public void setNotifyParty4CompNmAbbGreaterThanEqual(String notifyParty4CompNmAbbGreaterThanEqual) {
        this.notifyParty4CompNmAbbGreaterThanEqual = notifyParty4CompNmAbbGreaterThanEqual;
    }

    /**
     * notifyParty4CompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbbLessThan
     */
    public String getNotifyParty4CompNmAbbLessThan() {
        return notifyParty4CompNmAbbLessThan;
    }

    /**
     * notifyParty4CompNmAbbLessThan のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbbLessThan notifyParty4CompNmAbbLessThan に設定する
     */
    public void setNotifyParty4CompNmAbbLessThan(String notifyParty4CompNmAbbLessThan) {
        this.notifyParty4CompNmAbbLessThan = notifyParty4CompNmAbbLessThan;
    }

    /**
     * notifyParty4CompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbbLessThanEqual
     */
    public String getNotifyParty4CompNmAbbLessThanEqual() {
        return notifyParty4CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty4CompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbbLessThanEqual notifyParty4CompNmAbbLessThanEqual に設定する
     */
    public void setNotifyParty4CompNmAbbLessThanEqual(String notifyParty4CompNmAbbLessThanEqual) {
        this.notifyParty4CompNmAbbLessThanEqual = notifyParty4CompNmAbbLessThanEqual;
    }

    /**
     * notifyParty4CompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty4CompNmAbbLikeFront
     */
    public String getNotifyParty4CompNmAbbLikeFront() {
        return notifyParty4CompNmAbbLikeFront;
    }

    /**
     * notifyParty4CompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param notifyParty4CompNmAbbLikeFront notifyParty4CompNmAbbLikeFront に設定する
     */
    public void setNotifyParty4CompNmAbbLikeFront(String notifyParty4CompNmAbbLikeFront) {
        this.notifyParty4CompNmAbbLikeFront = notifyParty4CompNmAbbLikeFront;
    }

    /**
     * notifyParty4NmGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty4NmGreaterThan
     */
    public String getNotifyParty4NmGreaterThan() {
        return notifyParty4NmGreaterThan;
    }

    /**
     * notifyParty4NmGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty4NmGreaterThan notifyParty4NmGreaterThan に設定する
     */
    public void setNotifyParty4NmGreaterThan(String notifyParty4NmGreaterThan) {
        this.notifyParty4NmGreaterThan = notifyParty4NmGreaterThan;
    }

    /**
     * notifyParty4NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4NmGreaterThanEqual
     */
    public String getNotifyParty4NmGreaterThanEqual() {
        return notifyParty4NmGreaterThanEqual;
    }

    /**
     * notifyParty4NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4NmGreaterThanEqual notifyParty4NmGreaterThanEqual に設定する
     */
    public void setNotifyParty4NmGreaterThanEqual(String notifyParty4NmGreaterThanEqual) {
        this.notifyParty4NmGreaterThanEqual = notifyParty4NmGreaterThanEqual;
    }

    /**
     * notifyParty4NmLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty4NmLessThan
     */
    public String getNotifyParty4NmLessThan() {
        return notifyParty4NmLessThan;
    }

    /**
     * notifyParty4NmLessThan のセッターメソッドです。
     * 
     * @param notifyParty4NmLessThan notifyParty4NmLessThan に設定する
     */
    public void setNotifyParty4NmLessThan(String notifyParty4NmLessThan) {
        this.notifyParty4NmLessThan = notifyParty4NmLessThan;
    }

    /**
     * notifyParty4NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4NmLessThanEqual
     */
    public String getNotifyParty4NmLessThanEqual() {
        return notifyParty4NmLessThanEqual;
    }

    /**
     * notifyParty4NmLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4NmLessThanEqual notifyParty4NmLessThanEqual に設定する
     */
    public void setNotifyParty4NmLessThanEqual(String notifyParty4NmLessThanEqual) {
        this.notifyParty4NmLessThanEqual = notifyParty4NmLessThanEqual;
    }

    /**
     * notifyParty4NmLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty4NmLikeFront
     */
    public String getNotifyParty4NmLikeFront() {
        return notifyParty4NmLikeFront;
    }

    /**
     * notifyParty4NmLikeFront のセッターメソッドです。
     * 
     * @param notifyParty4NmLikeFront notifyParty4NmLikeFront に設定する
     */
    public void setNotifyParty4NmLikeFront(String notifyParty4NmLikeFront) {
        this.notifyParty4NmLikeFront = notifyParty4NmLikeFront;
    }

    /**
     * notifyParty4AddrGreaterThan のゲッターメソッドです。
     * 
     * @return the notifyParty4AddrGreaterThan
     */
    public String getNotifyParty4AddrGreaterThan() {
        return notifyParty4AddrGreaterThan;
    }

    /**
     * notifyParty4AddrGreaterThan のセッターメソッドです。
     * 
     * @param notifyParty4AddrGreaterThan notifyParty4AddrGreaterThan に設定する
     */
    public void setNotifyParty4AddrGreaterThan(String notifyParty4AddrGreaterThan) {
        this.notifyParty4AddrGreaterThan = notifyParty4AddrGreaterThan;
    }

    /**
     * notifyParty4AddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4AddrGreaterThanEqual
     */
    public String getNotifyParty4AddrGreaterThanEqual() {
        return notifyParty4AddrGreaterThanEqual;
    }

    /**
     * notifyParty4AddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4AddrGreaterThanEqual notifyParty4AddrGreaterThanEqual に設定する
     */
    public void setNotifyParty4AddrGreaterThanEqual(String notifyParty4AddrGreaterThanEqual) {
        this.notifyParty4AddrGreaterThanEqual = notifyParty4AddrGreaterThanEqual;
    }

    /**
     * notifyParty4AddrLessThan のゲッターメソッドです。
     * 
     * @return the notifyParty4AddrLessThan
     */
    public String getNotifyParty4AddrLessThan() {
        return notifyParty4AddrLessThan;
    }

    /**
     * notifyParty4AddrLessThan のセッターメソッドです。
     * 
     * @param notifyParty4AddrLessThan notifyParty4AddrLessThan に設定する
     */
    public void setNotifyParty4AddrLessThan(String notifyParty4AddrLessThan) {
        this.notifyParty4AddrLessThan = notifyParty4AddrLessThan;
    }

    /**
     * notifyParty4AddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the notifyParty4AddrLessThanEqual
     */
    public String getNotifyParty4AddrLessThanEqual() {
        return notifyParty4AddrLessThanEqual;
    }

    /**
     * notifyParty4AddrLessThanEqual のセッターメソッドです。
     * 
     * @param notifyParty4AddrLessThanEqual notifyParty4AddrLessThanEqual に設定する
     */
    public void setNotifyParty4AddrLessThanEqual(String notifyParty4AddrLessThanEqual) {
        this.notifyParty4AddrLessThanEqual = notifyParty4AddrLessThanEqual;
    }

    /**
     * notifyParty4AddrLikeFront のゲッターメソッドです。
     * 
     * @return the notifyParty4AddrLikeFront
     */
    public String getNotifyParty4AddrLikeFront() {
        return notifyParty4AddrLikeFront;
    }

    /**
     * notifyParty4AddrLikeFront のセッターメソッドです。
     * 
     * @param notifyParty4AddrLikeFront notifyParty4AddrLikeFront に設定する
     */
    public void setNotifyParty4AddrLikeFront(String notifyParty4AddrLikeFront) {
        this.notifyParty4AddrLikeFront = notifyParty4AddrLikeFront;
    }

    /**
     * shippingActNoGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingActNoGreaterThan
     */
    public String getShippingActNoGreaterThan() {
        return shippingActNoGreaterThan;
    }

    /**
     * shippingActNoGreaterThan のセッターメソッドです。
     * 
     * @param shippingActNoGreaterThan shippingActNoGreaterThan に設定する
     */
    public void setShippingActNoGreaterThan(String shippingActNoGreaterThan) {
        this.shippingActNoGreaterThan = shippingActNoGreaterThan;
    }

    /**
     * shippingActNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActNoGreaterThanEqual
     */
    public String getShippingActNoGreaterThanEqual() {
        return shippingActNoGreaterThanEqual;
    }

    /**
     * shippingActNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingActNoGreaterThanEqual shippingActNoGreaterThanEqual に設定する
     */
    public void setShippingActNoGreaterThanEqual(String shippingActNoGreaterThanEqual) {
        this.shippingActNoGreaterThanEqual = shippingActNoGreaterThanEqual;
    }

    /**
     * shippingActNoLessThan のゲッターメソッドです。
     * 
     * @return the shippingActNoLessThan
     */
    public String getShippingActNoLessThan() {
        return shippingActNoLessThan;
    }

    /**
     * shippingActNoLessThan のセッターメソッドです。
     * 
     * @param shippingActNoLessThan shippingActNoLessThan に設定する
     */
    public void setShippingActNoLessThan(String shippingActNoLessThan) {
        this.shippingActNoLessThan = shippingActNoLessThan;
    }

    /**
     * shippingActNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActNoLessThanEqual
     */
    public String getShippingActNoLessThanEqual() {
        return shippingActNoLessThanEqual;
    }

    /**
     * shippingActNoLessThanEqual のセッターメソッドです。
     * 
     * @param shippingActNoLessThanEqual shippingActNoLessThanEqual に設定する
     */
    public void setShippingActNoLessThanEqual(String shippingActNoLessThanEqual) {
        this.shippingActNoLessThanEqual = shippingActNoLessThanEqual;
    }

    /**
     * shippingActNoLikeFront のゲッターメソッドです。
     * 
     * @return the shippingActNoLikeFront
     */
    public String getShippingActNoLikeFront() {
        return shippingActNoLikeFront;
    }

    /**
     * shippingActNoLikeFront のセッターメソッドです。
     * 
     * @param shippingActNoLikeFront shippingActNoLikeFront に設定する
     */
    public void setShippingActNoLikeFront(String shippingActNoLikeFront) {
        this.shippingActNoLikeFront = shippingActNoLikeFront;
    }

    /**
     * shippingActStatusGreaterThan のゲッターメソッドです。
     * 
     * @return the shippingActStatusGreaterThan
     */
    public String getShippingActStatusGreaterThan() {
        return shippingActStatusGreaterThan;
    }

    /**
     * shippingActStatusGreaterThan のセッターメソッドです。
     * 
     * @param shippingActStatusGreaterThan shippingActStatusGreaterThan に設定する
     */
    public void setShippingActStatusGreaterThan(String shippingActStatusGreaterThan) {
        this.shippingActStatusGreaterThan = shippingActStatusGreaterThan;
    }

    /**
     * shippingActStatusGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActStatusGreaterThanEqual
     */
    public String getShippingActStatusGreaterThanEqual() {
        return shippingActStatusGreaterThanEqual;
    }

    /**
     * shippingActStatusGreaterThanEqual のセッターメソッドです。
     * 
     * @param shippingActStatusGreaterThanEqual shippingActStatusGreaterThanEqual に設定する
     */
    public void setShippingActStatusGreaterThanEqual(String shippingActStatusGreaterThanEqual) {
        this.shippingActStatusGreaterThanEqual = shippingActStatusGreaterThanEqual;
    }

    /**
     * shippingActStatusLessThan のゲッターメソッドです。
     * 
     * @return the shippingActStatusLessThan
     */
    public String getShippingActStatusLessThan() {
        return shippingActStatusLessThan;
    }

    /**
     * shippingActStatusLessThan のセッターメソッドです。
     * 
     * @param shippingActStatusLessThan shippingActStatusLessThan に設定する
     */
    public void setShippingActStatusLessThan(String shippingActStatusLessThan) {
        this.shippingActStatusLessThan = shippingActStatusLessThan;
    }

    /**
     * shippingActStatusLessThanEqual のゲッターメソッドです。
     * 
     * @return the shippingActStatusLessThanEqual
     */
    public String getShippingActStatusLessThanEqual() {
        return shippingActStatusLessThanEqual;
    }

    /**
     * shippingActStatusLessThanEqual のセッターメソッドです。
     * 
     * @param shippingActStatusLessThanEqual shippingActStatusLessThanEqual に設定する
     */
    public void setShippingActStatusLessThanEqual(String shippingActStatusLessThanEqual) {
        this.shippingActStatusLessThanEqual = shippingActStatusLessThanEqual;
    }

    /**
     * shippingActStatusLikeFront のゲッターメソッドです。
     * 
     * @return the shippingActStatusLikeFront
     */
    public String getShippingActStatusLikeFront() {
        return shippingActStatusLikeFront;
    }

    /**
     * shippingActStatusLikeFront のセッターメソッドです。
     * 
     * @param shippingActStatusLikeFront shippingActStatusLikeFront に設定する
     */
    public void setShippingActStatusLikeFront(String shippingActStatusLikeFront) {
        this.shippingActStatusLikeFront = shippingActStatusLikeFront;
    }

    /**
     * supplierInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoGreaterThan
     */
    public String getSupplierInvoiceNoGreaterThan() {
        return supplierInvoiceNoGreaterThan;
    }

    /**
     * supplierInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param supplierInvoiceNoGreaterThan supplierInvoiceNoGreaterThan に設定する
     */
    public void setSupplierInvoiceNoGreaterThan(String supplierInvoiceNoGreaterThan) {
        this.supplierInvoiceNoGreaterThan = supplierInvoiceNoGreaterThan;
    }

    /**
     * supplierInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoGreaterThanEqual
     */
    public String getSupplierInvoiceNoGreaterThanEqual() {
        return supplierInvoiceNoGreaterThanEqual;
    }

    /**
     * supplierInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param supplierInvoiceNoGreaterThanEqual supplierInvoiceNoGreaterThanEqual に設定する
     */
    public void setSupplierInvoiceNoGreaterThanEqual(String supplierInvoiceNoGreaterThanEqual) {
        this.supplierInvoiceNoGreaterThanEqual = supplierInvoiceNoGreaterThanEqual;
    }

    /**
     * supplierInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLessThan
     */
    public String getSupplierInvoiceNoLessThan() {
        return supplierInvoiceNoLessThan;
    }

    /**
     * supplierInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLessThan supplierInvoiceNoLessThan に設定する
     */
    public void setSupplierInvoiceNoLessThan(String supplierInvoiceNoLessThan) {
        this.supplierInvoiceNoLessThan = supplierInvoiceNoLessThan;
    }

    /**
     * supplierInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLessThanEqual
     */
    public String getSupplierInvoiceNoLessThanEqual() {
        return supplierInvoiceNoLessThanEqual;
    }

    /**
     * supplierInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLessThanEqual supplierInvoiceNoLessThanEqual に設定する
     */
    public void setSupplierInvoiceNoLessThanEqual(String supplierInvoiceNoLessThanEqual) {
        this.supplierInvoiceNoLessThanEqual = supplierInvoiceNoLessThanEqual;
    }

    /**
     * supplierInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the supplierInvoiceNoLikeFront
     */
    public String getSupplierInvoiceNoLikeFront() {
        return supplierInvoiceNoLikeFront;
    }

    /**
     * supplierInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param supplierInvoiceNoLikeFront supplierInvoiceNoLikeFront に設定する
     */
    public void setSupplierInvoiceNoLikeFront(String supplierInvoiceNoLikeFront) {
        this.supplierInvoiceNoLikeFront = supplierInvoiceNoLikeFront;
    }

    /**
     * impInvoiceNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1GreaterThan
     */
    public String getImpInvoiceNo1GreaterThan() {
        return impInvoiceNo1GreaterThan;
    }

    /**
     * impInvoiceNo1GreaterThan のセッターメソッドです。
     * 
     * @param impInvoiceNo1GreaterThan impInvoiceNo1GreaterThan に設定する
     */
    public void setImpInvoiceNo1GreaterThan(String impInvoiceNo1GreaterThan) {
        this.impInvoiceNo1GreaterThan = impInvoiceNo1GreaterThan;
    }

    /**
     * impInvoiceNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1GreaterThanEqual
     */
    public String getImpInvoiceNo1GreaterThanEqual() {
        return impInvoiceNo1GreaterThanEqual;
    }

    /**
     * impInvoiceNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo1GreaterThanEqual impInvoiceNo1GreaterThanEqual に設定する
     */
    public void setImpInvoiceNo1GreaterThanEqual(String impInvoiceNo1GreaterThanEqual) {
        this.impInvoiceNo1GreaterThanEqual = impInvoiceNo1GreaterThanEqual;
    }

    /**
     * impInvoiceNo1LessThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LessThan
     */
    public String getImpInvoiceNo1LessThan() {
        return impInvoiceNo1LessThan;
    }

    /**
     * impInvoiceNo1LessThan のセッターメソッドです。
     * 
     * @param impInvoiceNo1LessThan impInvoiceNo1LessThan に設定する
     */
    public void setImpInvoiceNo1LessThan(String impInvoiceNo1LessThan) {
        this.impInvoiceNo1LessThan = impInvoiceNo1LessThan;
    }

    /**
     * impInvoiceNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LessThanEqual
     */
    public String getImpInvoiceNo1LessThanEqual() {
        return impInvoiceNo1LessThanEqual;
    }

    /**
     * impInvoiceNo1LessThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo1LessThanEqual impInvoiceNo1LessThanEqual に設定する
     */
    public void setImpInvoiceNo1LessThanEqual(String impInvoiceNo1LessThanEqual) {
        this.impInvoiceNo1LessThanEqual = impInvoiceNo1LessThanEqual;
    }

    /**
     * impInvoiceNo1LikeFront のゲッターメソッドです。
     * 
     * @return the impInvoiceNo1LikeFront
     */
    public String getImpInvoiceNo1LikeFront() {
        return impInvoiceNo1LikeFront;
    }

    /**
     * impInvoiceNo1LikeFront のセッターメソッドです。
     * 
     * @param impInvoiceNo1LikeFront impInvoiceNo1LikeFront に設定する
     */
    public void setImpInvoiceNo1LikeFront(String impInvoiceNo1LikeFront) {
        this.impInvoiceNo1LikeFront = impInvoiceNo1LikeFront;
    }

    /**
     * impInvoiceNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2GreaterThan
     */
    public String getImpInvoiceNo2GreaterThan() {
        return impInvoiceNo2GreaterThan;
    }

    /**
     * impInvoiceNo2GreaterThan のセッターメソッドです。
     * 
     * @param impInvoiceNo2GreaterThan impInvoiceNo2GreaterThan に設定する
     */
    public void setImpInvoiceNo2GreaterThan(String impInvoiceNo2GreaterThan) {
        this.impInvoiceNo2GreaterThan = impInvoiceNo2GreaterThan;
    }

    /**
     * impInvoiceNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2GreaterThanEqual
     */
    public String getImpInvoiceNo2GreaterThanEqual() {
        return impInvoiceNo2GreaterThanEqual;
    }

    /**
     * impInvoiceNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo2GreaterThanEqual impInvoiceNo2GreaterThanEqual に設定する
     */
    public void setImpInvoiceNo2GreaterThanEqual(String impInvoiceNo2GreaterThanEqual) {
        this.impInvoiceNo2GreaterThanEqual = impInvoiceNo2GreaterThanEqual;
    }

    /**
     * impInvoiceNo2LessThan のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LessThan
     */
    public String getImpInvoiceNo2LessThan() {
        return impInvoiceNo2LessThan;
    }

    /**
     * impInvoiceNo2LessThan のセッターメソッドです。
     * 
     * @param impInvoiceNo2LessThan impInvoiceNo2LessThan に設定する
     */
    public void setImpInvoiceNo2LessThan(String impInvoiceNo2LessThan) {
        this.impInvoiceNo2LessThan = impInvoiceNo2LessThan;
    }

    /**
     * impInvoiceNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LessThanEqual
     */
    public String getImpInvoiceNo2LessThanEqual() {
        return impInvoiceNo2LessThanEqual;
    }

    /**
     * impInvoiceNo2LessThanEqual のセッターメソッドです。
     * 
     * @param impInvoiceNo2LessThanEqual impInvoiceNo2LessThanEqual に設定する
     */
    public void setImpInvoiceNo2LessThanEqual(String impInvoiceNo2LessThanEqual) {
        this.impInvoiceNo2LessThanEqual = impInvoiceNo2LessThanEqual;
    }

    /**
     * impInvoiceNo2LikeFront のゲッターメソッドです。
     * 
     * @return the impInvoiceNo2LikeFront
     */
    public String getImpInvoiceNo2LikeFront() {
        return impInvoiceNo2LikeFront;
    }

    /**
     * impInvoiceNo2LikeFront のセッターメソッドです。
     * 
     * @param impInvoiceNo2LikeFront impInvoiceNo2LikeFront に設定する
     */
    public void setImpInvoiceNo2LikeFront(String impInvoiceNo2LikeFront) {
        this.impInvoiceNo2LikeFront = impInvoiceNo2LikeFront;
    }

    /**
     * shipperCompNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbbGreaterThan
     */
    public String getShipperCompNmAbbGreaterThan() {
        return shipperCompNmAbbGreaterThan;
    }

    /**
     * shipperCompNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param shipperCompNmAbbGreaterThan shipperCompNmAbbGreaterThan に設定する
     */
    public void setShipperCompNmAbbGreaterThan(String shipperCompNmAbbGreaterThan) {
        this.shipperCompNmAbbGreaterThan = shipperCompNmAbbGreaterThan;
    }

    /**
     * shipperCompNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbbGreaterThanEqual
     */
    public String getShipperCompNmAbbGreaterThanEqual() {
        return shipperCompNmAbbGreaterThanEqual;
    }

    /**
     * shipperCompNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNmAbbGreaterThanEqual shipperCompNmAbbGreaterThanEqual に設定する
     */
    public void setShipperCompNmAbbGreaterThanEqual(String shipperCompNmAbbGreaterThanEqual) {
        this.shipperCompNmAbbGreaterThanEqual = shipperCompNmAbbGreaterThanEqual;
    }

    /**
     * shipperCompNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbbLessThan
     */
    public String getShipperCompNmAbbLessThan() {
        return shipperCompNmAbbLessThan;
    }

    /**
     * shipperCompNmAbbLessThan のセッターメソッドです。
     * 
     * @param shipperCompNmAbbLessThan shipperCompNmAbbLessThan に設定する
     */
    public void setShipperCompNmAbbLessThan(String shipperCompNmAbbLessThan) {
        this.shipperCompNmAbbLessThan = shipperCompNmAbbLessThan;
    }

    /**
     * shipperCompNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbbLessThanEqual
     */
    public String getShipperCompNmAbbLessThanEqual() {
        return shipperCompNmAbbLessThanEqual;
    }

    /**
     * shipperCompNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNmAbbLessThanEqual shipperCompNmAbbLessThanEqual に設定する
     */
    public void setShipperCompNmAbbLessThanEqual(String shipperCompNmAbbLessThanEqual) {
        this.shipperCompNmAbbLessThanEqual = shipperCompNmAbbLessThanEqual;
    }

    /**
     * shipperCompNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompNmAbbLikeFront
     */
    public String getShipperCompNmAbbLikeFront() {
        return shipperCompNmAbbLikeFront;
    }

    /**
     * shipperCompNmAbbLikeFront のセッターメソッドです。
     * 
     * @param shipperCompNmAbbLikeFront shipperCompNmAbbLikeFront に設定する
     */
    public void setShipperCompNmAbbLikeFront(String shipperCompNmAbbLikeFront) {
        this.shipperCompNmAbbLikeFront = shipperCompNmAbbLikeFront;
    }

    /**
     * shipperCompNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompNm1GreaterThan
     */
    public String getShipperCompNm1GreaterThan() {
        return shipperCompNm1GreaterThan;
    }

    /**
     * shipperCompNm1GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompNm1GreaterThan shipperCompNm1GreaterThan に設定する
     */
    public void setShipperCompNm1GreaterThan(String shipperCompNm1GreaterThan) {
        this.shipperCompNm1GreaterThan = shipperCompNm1GreaterThan;
    }

    /**
     * shipperCompNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNm1GreaterThanEqual
     */
    public String getShipperCompNm1GreaterThanEqual() {
        return shipperCompNm1GreaterThanEqual;
    }

    /**
     * shipperCompNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNm1GreaterThanEqual shipperCompNm1GreaterThanEqual に設定する
     */
    public void setShipperCompNm1GreaterThanEqual(String shipperCompNm1GreaterThanEqual) {
        this.shipperCompNm1GreaterThanEqual = shipperCompNm1GreaterThanEqual;
    }

    /**
     * shipperCompNm1LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompNm1LessThan
     */
    public String getShipperCompNm1LessThan() {
        return shipperCompNm1LessThan;
    }

    /**
     * shipperCompNm1LessThan のセッターメソッドです。
     * 
     * @param shipperCompNm1LessThan shipperCompNm1LessThan に設定する
     */
    public void setShipperCompNm1LessThan(String shipperCompNm1LessThan) {
        this.shipperCompNm1LessThan = shipperCompNm1LessThan;
    }

    /**
     * shipperCompNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNm1LessThanEqual
     */
    public String getShipperCompNm1LessThanEqual() {
        return shipperCompNm1LessThanEqual;
    }

    /**
     * shipperCompNm1LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNm1LessThanEqual shipperCompNm1LessThanEqual に設定する
     */
    public void setShipperCompNm1LessThanEqual(String shipperCompNm1LessThanEqual) {
        this.shipperCompNm1LessThanEqual = shipperCompNm1LessThanEqual;
    }

    /**
     * shipperCompNm1LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompNm1LikeFront
     */
    public String getShipperCompNm1LikeFront() {
        return shipperCompNm1LikeFront;
    }

    /**
     * shipperCompNm1LikeFront のセッターメソッドです。
     * 
     * @param shipperCompNm1LikeFront shipperCompNm1LikeFront に設定する
     */
    public void setShipperCompNm1LikeFront(String shipperCompNm1LikeFront) {
        this.shipperCompNm1LikeFront = shipperCompNm1LikeFront;
    }

    /**
     * shipperCompNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompNm2GreaterThan
     */
    public String getShipperCompNm2GreaterThan() {
        return shipperCompNm2GreaterThan;
    }

    /**
     * shipperCompNm2GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompNm2GreaterThan shipperCompNm2GreaterThan に設定する
     */
    public void setShipperCompNm2GreaterThan(String shipperCompNm2GreaterThan) {
        this.shipperCompNm2GreaterThan = shipperCompNm2GreaterThan;
    }

    /**
     * shipperCompNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNm2GreaterThanEqual
     */
    public String getShipperCompNm2GreaterThanEqual() {
        return shipperCompNm2GreaterThanEqual;
    }

    /**
     * shipperCompNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNm2GreaterThanEqual shipperCompNm2GreaterThanEqual に設定する
     */
    public void setShipperCompNm2GreaterThanEqual(String shipperCompNm2GreaterThanEqual) {
        this.shipperCompNm2GreaterThanEqual = shipperCompNm2GreaterThanEqual;
    }

    /**
     * shipperCompNm2LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompNm2LessThan
     */
    public String getShipperCompNm2LessThan() {
        return shipperCompNm2LessThan;
    }

    /**
     * shipperCompNm2LessThan のセッターメソッドです。
     * 
     * @param shipperCompNm2LessThan shipperCompNm2LessThan に設定する
     */
    public void setShipperCompNm2LessThan(String shipperCompNm2LessThan) {
        this.shipperCompNm2LessThan = shipperCompNm2LessThan;
    }

    /**
     * shipperCompNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompNm2LessThanEqual
     */
    public String getShipperCompNm2LessThanEqual() {
        return shipperCompNm2LessThanEqual;
    }

    /**
     * shipperCompNm2LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompNm2LessThanEqual shipperCompNm2LessThanEqual に設定する
     */
    public void setShipperCompNm2LessThanEqual(String shipperCompNm2LessThanEqual) {
        this.shipperCompNm2LessThanEqual = shipperCompNm2LessThanEqual;
    }

    /**
     * shipperCompNm2LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompNm2LikeFront
     */
    public String getShipperCompNm2LikeFront() {
        return shipperCompNm2LikeFront;
    }

    /**
     * shipperCompNm2LikeFront のセッターメソッドです。
     * 
     * @param shipperCompNm2LikeFront shipperCompNm2LikeFront に設定する
     */
    public void setShipperCompNm2LikeFront(String shipperCompNm2LikeFront) {
        this.shipperCompNm2LikeFront = shipperCompNm2LikeFront;
    }

    /**
     * shipperCompAddr1GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1GreaterThan
     */
    public String getShipperCompAddr1GreaterThan() {
        return shipperCompAddr1GreaterThan;
    }

    /**
     * shipperCompAddr1GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompAddr1GreaterThan shipperCompAddr1GreaterThan に設定する
     */
    public void setShipperCompAddr1GreaterThan(String shipperCompAddr1GreaterThan) {
        this.shipperCompAddr1GreaterThan = shipperCompAddr1GreaterThan;
    }

    /**
     * shipperCompAddr1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1GreaterThanEqual
     */
    public String getShipperCompAddr1GreaterThanEqual() {
        return shipperCompAddr1GreaterThanEqual;
    }

    /**
     * shipperCompAddr1GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr1GreaterThanEqual shipperCompAddr1GreaterThanEqual に設定する
     */
    public void setShipperCompAddr1GreaterThanEqual(String shipperCompAddr1GreaterThanEqual) {
        this.shipperCompAddr1GreaterThanEqual = shipperCompAddr1GreaterThanEqual;
    }

    /**
     * shipperCompAddr1LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1LessThan
     */
    public String getShipperCompAddr1LessThan() {
        return shipperCompAddr1LessThan;
    }

    /**
     * shipperCompAddr1LessThan のセッターメソッドです。
     * 
     * @param shipperCompAddr1LessThan shipperCompAddr1LessThan に設定する
     */
    public void setShipperCompAddr1LessThan(String shipperCompAddr1LessThan) {
        this.shipperCompAddr1LessThan = shipperCompAddr1LessThan;
    }

    /**
     * shipperCompAddr1LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1LessThanEqual
     */
    public String getShipperCompAddr1LessThanEqual() {
        return shipperCompAddr1LessThanEqual;
    }

    /**
     * shipperCompAddr1LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr1LessThanEqual shipperCompAddr1LessThanEqual に設定する
     */
    public void setShipperCompAddr1LessThanEqual(String shipperCompAddr1LessThanEqual) {
        this.shipperCompAddr1LessThanEqual = shipperCompAddr1LessThanEqual;
    }

    /**
     * shipperCompAddr1LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompAddr1LikeFront
     */
    public String getShipperCompAddr1LikeFront() {
        return shipperCompAddr1LikeFront;
    }

    /**
     * shipperCompAddr1LikeFront のセッターメソッドです。
     * 
     * @param shipperCompAddr1LikeFront shipperCompAddr1LikeFront に設定する
     */
    public void setShipperCompAddr1LikeFront(String shipperCompAddr1LikeFront) {
        this.shipperCompAddr1LikeFront = shipperCompAddr1LikeFront;
    }

    /**
     * shipperCompAddr2GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2GreaterThan
     */
    public String getShipperCompAddr2GreaterThan() {
        return shipperCompAddr2GreaterThan;
    }

    /**
     * shipperCompAddr2GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompAddr2GreaterThan shipperCompAddr2GreaterThan に設定する
     */
    public void setShipperCompAddr2GreaterThan(String shipperCompAddr2GreaterThan) {
        this.shipperCompAddr2GreaterThan = shipperCompAddr2GreaterThan;
    }

    /**
     * shipperCompAddr2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2GreaterThanEqual
     */
    public String getShipperCompAddr2GreaterThanEqual() {
        return shipperCompAddr2GreaterThanEqual;
    }

    /**
     * shipperCompAddr2GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr2GreaterThanEqual shipperCompAddr2GreaterThanEqual に設定する
     */
    public void setShipperCompAddr2GreaterThanEqual(String shipperCompAddr2GreaterThanEqual) {
        this.shipperCompAddr2GreaterThanEqual = shipperCompAddr2GreaterThanEqual;
    }

    /**
     * shipperCompAddr2LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2LessThan
     */
    public String getShipperCompAddr2LessThan() {
        return shipperCompAddr2LessThan;
    }

    /**
     * shipperCompAddr2LessThan のセッターメソッドです。
     * 
     * @param shipperCompAddr2LessThan shipperCompAddr2LessThan に設定する
     */
    public void setShipperCompAddr2LessThan(String shipperCompAddr2LessThan) {
        this.shipperCompAddr2LessThan = shipperCompAddr2LessThan;
    }

    /**
     * shipperCompAddr2LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2LessThanEqual
     */
    public String getShipperCompAddr2LessThanEqual() {
        return shipperCompAddr2LessThanEqual;
    }

    /**
     * shipperCompAddr2LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr2LessThanEqual shipperCompAddr2LessThanEqual に設定する
     */
    public void setShipperCompAddr2LessThanEqual(String shipperCompAddr2LessThanEqual) {
        this.shipperCompAddr2LessThanEqual = shipperCompAddr2LessThanEqual;
    }

    /**
     * shipperCompAddr2LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompAddr2LikeFront
     */
    public String getShipperCompAddr2LikeFront() {
        return shipperCompAddr2LikeFront;
    }

    /**
     * shipperCompAddr2LikeFront のセッターメソッドです。
     * 
     * @param shipperCompAddr2LikeFront shipperCompAddr2LikeFront に設定する
     */
    public void setShipperCompAddr2LikeFront(String shipperCompAddr2LikeFront) {
        this.shipperCompAddr2LikeFront = shipperCompAddr2LikeFront;
    }

    /**
     * shipperCompAddr3GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3GreaterThan
     */
    public String getShipperCompAddr3GreaterThan() {
        return shipperCompAddr3GreaterThan;
    }

    /**
     * shipperCompAddr3GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompAddr3GreaterThan shipperCompAddr3GreaterThan に設定する
     */
    public void setShipperCompAddr3GreaterThan(String shipperCompAddr3GreaterThan) {
        this.shipperCompAddr3GreaterThan = shipperCompAddr3GreaterThan;
    }

    /**
     * shipperCompAddr3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3GreaterThanEqual
     */
    public String getShipperCompAddr3GreaterThanEqual() {
        return shipperCompAddr3GreaterThanEqual;
    }

    /**
     * shipperCompAddr3GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr3GreaterThanEqual shipperCompAddr3GreaterThanEqual に設定する
     */
    public void setShipperCompAddr3GreaterThanEqual(String shipperCompAddr3GreaterThanEqual) {
        this.shipperCompAddr3GreaterThanEqual = shipperCompAddr3GreaterThanEqual;
    }

    /**
     * shipperCompAddr3LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3LessThan
     */
    public String getShipperCompAddr3LessThan() {
        return shipperCompAddr3LessThan;
    }

    /**
     * shipperCompAddr3LessThan のセッターメソッドです。
     * 
     * @param shipperCompAddr3LessThan shipperCompAddr3LessThan に設定する
     */
    public void setShipperCompAddr3LessThan(String shipperCompAddr3LessThan) {
        this.shipperCompAddr3LessThan = shipperCompAddr3LessThan;
    }

    /**
     * shipperCompAddr3LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3LessThanEqual
     */
    public String getShipperCompAddr3LessThanEqual() {
        return shipperCompAddr3LessThanEqual;
    }

    /**
     * shipperCompAddr3LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr3LessThanEqual shipperCompAddr3LessThanEqual に設定する
     */
    public void setShipperCompAddr3LessThanEqual(String shipperCompAddr3LessThanEqual) {
        this.shipperCompAddr3LessThanEqual = shipperCompAddr3LessThanEqual;
    }

    /**
     * shipperCompAddr3LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompAddr3LikeFront
     */
    public String getShipperCompAddr3LikeFront() {
        return shipperCompAddr3LikeFront;
    }

    /**
     * shipperCompAddr3LikeFront のセッターメソッドです。
     * 
     * @param shipperCompAddr3LikeFront shipperCompAddr3LikeFront に設定する
     */
    public void setShipperCompAddr3LikeFront(String shipperCompAddr3LikeFront) {
        this.shipperCompAddr3LikeFront = shipperCompAddr3LikeFront;
    }

    /**
     * shipperCompAddr4GreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4GreaterThan
     */
    public String getShipperCompAddr4GreaterThan() {
        return shipperCompAddr4GreaterThan;
    }

    /**
     * shipperCompAddr4GreaterThan のセッターメソッドです。
     * 
     * @param shipperCompAddr4GreaterThan shipperCompAddr4GreaterThan に設定する
     */
    public void setShipperCompAddr4GreaterThan(String shipperCompAddr4GreaterThan) {
        this.shipperCompAddr4GreaterThan = shipperCompAddr4GreaterThan;
    }

    /**
     * shipperCompAddr4GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4GreaterThanEqual
     */
    public String getShipperCompAddr4GreaterThanEqual() {
        return shipperCompAddr4GreaterThanEqual;
    }

    /**
     * shipperCompAddr4GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr4GreaterThanEqual shipperCompAddr4GreaterThanEqual に設定する
     */
    public void setShipperCompAddr4GreaterThanEqual(String shipperCompAddr4GreaterThanEqual) {
        this.shipperCompAddr4GreaterThanEqual = shipperCompAddr4GreaterThanEqual;
    }

    /**
     * shipperCompAddr4LessThan のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4LessThan
     */
    public String getShipperCompAddr4LessThan() {
        return shipperCompAddr4LessThan;
    }

    /**
     * shipperCompAddr4LessThan のセッターメソッドです。
     * 
     * @param shipperCompAddr4LessThan shipperCompAddr4LessThan に設定する
     */
    public void setShipperCompAddr4LessThan(String shipperCompAddr4LessThan) {
        this.shipperCompAddr4LessThan = shipperCompAddr4LessThan;
    }

    /**
     * shipperCompAddr4LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4LessThanEqual
     */
    public String getShipperCompAddr4LessThanEqual() {
        return shipperCompAddr4LessThanEqual;
    }

    /**
     * shipperCompAddr4LessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompAddr4LessThanEqual shipperCompAddr4LessThanEqual に設定する
     */
    public void setShipperCompAddr4LessThanEqual(String shipperCompAddr4LessThanEqual) {
        this.shipperCompAddr4LessThanEqual = shipperCompAddr4LessThanEqual;
    }

    /**
     * shipperCompAddr4LikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompAddr4LikeFront
     */
    public String getShipperCompAddr4LikeFront() {
        return shipperCompAddr4LikeFront;
    }

    /**
     * shipperCompAddr4LikeFront のセッターメソッドです。
     * 
     * @param shipperCompAddr4LikeFront shipperCompAddr4LikeFront に設定する
     */
    public void setShipperCompAddr4LikeFront(String shipperCompAddr4LikeFront) {
        this.shipperCompAddr4LikeFront = shipperCompAddr4LikeFront;
    }

    /**
     * shipperCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompTelGreaterThan
     */
    public String getShipperCompTelGreaterThan() {
        return shipperCompTelGreaterThan;
    }

    /**
     * shipperCompTelGreaterThan のセッターメソッドです。
     * 
     * @param shipperCompTelGreaterThan shipperCompTelGreaterThan に設定する
     */
    public void setShipperCompTelGreaterThan(String shipperCompTelGreaterThan) {
        this.shipperCompTelGreaterThan = shipperCompTelGreaterThan;
    }

    /**
     * shipperCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompTelGreaterThanEqual
     */
    public String getShipperCompTelGreaterThanEqual() {
        return shipperCompTelGreaterThanEqual;
    }

    /**
     * shipperCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompTelGreaterThanEqual shipperCompTelGreaterThanEqual に設定する
     */
    public void setShipperCompTelGreaterThanEqual(String shipperCompTelGreaterThanEqual) {
        this.shipperCompTelGreaterThanEqual = shipperCompTelGreaterThanEqual;
    }

    /**
     * shipperCompTelLessThan のゲッターメソッドです。
     * 
     * @return the shipperCompTelLessThan
     */
    public String getShipperCompTelLessThan() {
        return shipperCompTelLessThan;
    }

    /**
     * shipperCompTelLessThan のセッターメソッドです。
     * 
     * @param shipperCompTelLessThan shipperCompTelLessThan に設定する
     */
    public void setShipperCompTelLessThan(String shipperCompTelLessThan) {
        this.shipperCompTelLessThan = shipperCompTelLessThan;
    }

    /**
     * shipperCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompTelLessThanEqual
     */
    public String getShipperCompTelLessThanEqual() {
        return shipperCompTelLessThanEqual;
    }

    /**
     * shipperCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompTelLessThanEqual shipperCompTelLessThanEqual に設定する
     */
    public void setShipperCompTelLessThanEqual(String shipperCompTelLessThanEqual) {
        this.shipperCompTelLessThanEqual = shipperCompTelLessThanEqual;
    }

    /**
     * shipperCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompTelLikeFront
     */
    public String getShipperCompTelLikeFront() {
        return shipperCompTelLikeFront;
    }

    /**
     * shipperCompTelLikeFront のセッターメソッドです。
     * 
     * @param shipperCompTelLikeFront shipperCompTelLikeFront に設定する
     */
    public void setShipperCompTelLikeFront(String shipperCompTelLikeFront) {
        this.shipperCompTelLikeFront = shipperCompTelLikeFront;
    }

    /**
     * shipperCompFaxGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCompFaxGreaterThan
     */
    public String getShipperCompFaxGreaterThan() {
        return shipperCompFaxGreaterThan;
    }

    /**
     * shipperCompFaxGreaterThan のセッターメソッドです。
     * 
     * @param shipperCompFaxGreaterThan shipperCompFaxGreaterThan に設定する
     */
    public void setShipperCompFaxGreaterThan(String shipperCompFaxGreaterThan) {
        this.shipperCompFaxGreaterThan = shipperCompFaxGreaterThan;
    }

    /**
     * shipperCompFaxGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompFaxGreaterThanEqual
     */
    public String getShipperCompFaxGreaterThanEqual() {
        return shipperCompFaxGreaterThanEqual;
    }

    /**
     * shipperCompFaxGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCompFaxGreaterThanEqual shipperCompFaxGreaterThanEqual に設定する
     */
    public void setShipperCompFaxGreaterThanEqual(String shipperCompFaxGreaterThanEqual) {
        this.shipperCompFaxGreaterThanEqual = shipperCompFaxGreaterThanEqual;
    }

    /**
     * shipperCompFaxLessThan のゲッターメソッドです。
     * 
     * @return the shipperCompFaxLessThan
     */
    public String getShipperCompFaxLessThan() {
        return shipperCompFaxLessThan;
    }

    /**
     * shipperCompFaxLessThan のセッターメソッドです。
     * 
     * @param shipperCompFaxLessThan shipperCompFaxLessThan に設定する
     */
    public void setShipperCompFaxLessThan(String shipperCompFaxLessThan) {
        this.shipperCompFaxLessThan = shipperCompFaxLessThan;
    }

    /**
     * shipperCompFaxLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCompFaxLessThanEqual
     */
    public String getShipperCompFaxLessThanEqual() {
        return shipperCompFaxLessThanEqual;
    }

    /**
     * shipperCompFaxLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCompFaxLessThanEqual shipperCompFaxLessThanEqual に設定する
     */
    public void setShipperCompFaxLessThanEqual(String shipperCompFaxLessThanEqual) {
        this.shipperCompFaxLessThanEqual = shipperCompFaxLessThanEqual;
    }

    /**
     * shipperCompFaxLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCompFaxLikeFront
     */
    public String getShipperCompFaxLikeFront() {
        return shipperCompFaxLikeFront;
    }

    /**
     * shipperCompFaxLikeFront のセッターメソッドです。
     * 
     * @param shipperCompFaxLikeFront shipperCompFaxLikeFront に設定する
     */
    public void setShipperCompFaxLikeFront(String shipperCompFaxLikeFront) {
        this.shipperCompFaxLikeFront = shipperCompFaxLikeFront;
    }

    /**
     * shipperTaxIdNoGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNoGreaterThan
     */
    public String getShipperTaxIdNoGreaterThan() {
        return shipperTaxIdNoGreaterThan;
    }

    /**
     * shipperTaxIdNoGreaterThan のセッターメソッドです。
     * 
     * @param shipperTaxIdNoGreaterThan shipperTaxIdNoGreaterThan に設定する
     */
    public void setShipperTaxIdNoGreaterThan(String shipperTaxIdNoGreaterThan) {
        this.shipperTaxIdNoGreaterThan = shipperTaxIdNoGreaterThan;
    }

    /**
     * shipperTaxIdNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNoGreaterThanEqual
     */
    public String getShipperTaxIdNoGreaterThanEqual() {
        return shipperTaxIdNoGreaterThanEqual;
    }

    /**
     * shipperTaxIdNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperTaxIdNoGreaterThanEqual shipperTaxIdNoGreaterThanEqual に設定する
     */
    public void setShipperTaxIdNoGreaterThanEqual(String shipperTaxIdNoGreaterThanEqual) {
        this.shipperTaxIdNoGreaterThanEqual = shipperTaxIdNoGreaterThanEqual;
    }

    /**
     * shipperTaxIdNoLessThan のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNoLessThan
     */
    public String getShipperTaxIdNoLessThan() {
        return shipperTaxIdNoLessThan;
    }

    /**
     * shipperTaxIdNoLessThan のセッターメソッドです。
     * 
     * @param shipperTaxIdNoLessThan shipperTaxIdNoLessThan に設定する
     */
    public void setShipperTaxIdNoLessThan(String shipperTaxIdNoLessThan) {
        this.shipperTaxIdNoLessThan = shipperTaxIdNoLessThan;
    }

    /**
     * shipperTaxIdNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNoLessThanEqual
     */
    public String getShipperTaxIdNoLessThanEqual() {
        return shipperTaxIdNoLessThanEqual;
    }

    /**
     * shipperTaxIdNoLessThanEqual のセッターメソッドです。
     * 
     * @param shipperTaxIdNoLessThanEqual shipperTaxIdNoLessThanEqual に設定する
     */
    public void setShipperTaxIdNoLessThanEqual(String shipperTaxIdNoLessThanEqual) {
        this.shipperTaxIdNoLessThanEqual = shipperTaxIdNoLessThanEqual;
    }

    /**
     * shipperTaxIdNoLikeFront のゲッターメソッドです。
     * 
     * @return the shipperTaxIdNoLikeFront
     */
    public String getShipperTaxIdNoLikeFront() {
        return shipperTaxIdNoLikeFront;
    }

    /**
     * shipperTaxIdNoLikeFront のセッターメソッドです。
     * 
     * @param shipperTaxIdNoLikeFront shipperTaxIdNoLikeFront に設定する
     */
    public void setShipperTaxIdNoLikeFront(String shipperTaxIdNoLikeFront) {
        this.shipperTaxIdNoLikeFront = shipperTaxIdNoLikeFront;
    }

    /**
     * consigneeCompNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1GreaterThan
     */
    public String getConsigneeCompNm1GreaterThan() {
        return consigneeCompNm1GreaterThan;
    }

    /**
     * consigneeCompNm1GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompNm1GreaterThan consigneeCompNm1GreaterThan に設定する
     */
    public void setConsigneeCompNm1GreaterThan(String consigneeCompNm1GreaterThan) {
        this.consigneeCompNm1GreaterThan = consigneeCompNm1GreaterThan;
    }

    /**
     * consigneeCompNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1GreaterThanEqual
     */
    public String getConsigneeCompNm1GreaterThanEqual() {
        return consigneeCompNm1GreaterThanEqual;
    }

    /**
     * consigneeCompNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNm1GreaterThanEqual consigneeCompNm1GreaterThanEqual に設定する
     */
    public void setConsigneeCompNm1GreaterThanEqual(String consigneeCompNm1GreaterThanEqual) {
        this.consigneeCompNm1GreaterThanEqual = consigneeCompNm1GreaterThanEqual;
    }

    /**
     * consigneeCompNm1LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1LessThan
     */
    public String getConsigneeCompNm1LessThan() {
        return consigneeCompNm1LessThan;
    }

    /**
     * consigneeCompNm1LessThan のセッターメソッドです。
     * 
     * @param consigneeCompNm1LessThan consigneeCompNm1LessThan に設定する
     */
    public void setConsigneeCompNm1LessThan(String consigneeCompNm1LessThan) {
        this.consigneeCompNm1LessThan = consigneeCompNm1LessThan;
    }

    /**
     * consigneeCompNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1LessThanEqual
     */
    public String getConsigneeCompNm1LessThanEqual() {
        return consigneeCompNm1LessThanEqual;
    }

    /**
     * consigneeCompNm1LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNm1LessThanEqual consigneeCompNm1LessThanEqual に設定する
     */
    public void setConsigneeCompNm1LessThanEqual(String consigneeCompNm1LessThanEqual) {
        this.consigneeCompNm1LessThanEqual = consigneeCompNm1LessThanEqual;
    }

    /**
     * consigneeCompNm1LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompNm1LikeFront
     */
    public String getConsigneeCompNm1LikeFront() {
        return consigneeCompNm1LikeFront;
    }

    /**
     * consigneeCompNm1LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompNm1LikeFront consigneeCompNm1LikeFront に設定する
     */
    public void setConsigneeCompNm1LikeFront(String consigneeCompNm1LikeFront) {
        this.consigneeCompNm1LikeFront = consigneeCompNm1LikeFront;
    }

    /**
     * consigneeCompNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2GreaterThan
     */
    public String getConsigneeCompNm2GreaterThan() {
        return consigneeCompNm2GreaterThan;
    }

    /**
     * consigneeCompNm2GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompNm2GreaterThan consigneeCompNm2GreaterThan に設定する
     */
    public void setConsigneeCompNm2GreaterThan(String consigneeCompNm2GreaterThan) {
        this.consigneeCompNm2GreaterThan = consigneeCompNm2GreaterThan;
    }

    /**
     * consigneeCompNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2GreaterThanEqual
     */
    public String getConsigneeCompNm2GreaterThanEqual() {
        return consigneeCompNm2GreaterThanEqual;
    }

    /**
     * consigneeCompNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNm2GreaterThanEqual consigneeCompNm2GreaterThanEqual に設定する
     */
    public void setConsigneeCompNm2GreaterThanEqual(String consigneeCompNm2GreaterThanEqual) {
        this.consigneeCompNm2GreaterThanEqual = consigneeCompNm2GreaterThanEqual;
    }

    /**
     * consigneeCompNm2LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2LessThan
     */
    public String getConsigneeCompNm2LessThan() {
        return consigneeCompNm2LessThan;
    }

    /**
     * consigneeCompNm2LessThan のセッターメソッドです。
     * 
     * @param consigneeCompNm2LessThan consigneeCompNm2LessThan に設定する
     */
    public void setConsigneeCompNm2LessThan(String consigneeCompNm2LessThan) {
        this.consigneeCompNm2LessThan = consigneeCompNm2LessThan;
    }

    /**
     * consigneeCompNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2LessThanEqual
     */
    public String getConsigneeCompNm2LessThanEqual() {
        return consigneeCompNm2LessThanEqual;
    }

    /**
     * consigneeCompNm2LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompNm2LessThanEqual consigneeCompNm2LessThanEqual に設定する
     */
    public void setConsigneeCompNm2LessThanEqual(String consigneeCompNm2LessThanEqual) {
        this.consigneeCompNm2LessThanEqual = consigneeCompNm2LessThanEqual;
    }

    /**
     * consigneeCompNm2LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompNm2LikeFront
     */
    public String getConsigneeCompNm2LikeFront() {
        return consigneeCompNm2LikeFront;
    }

    /**
     * consigneeCompNm2LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompNm2LikeFront consigneeCompNm2LikeFront に設定する
     */
    public void setConsigneeCompNm2LikeFront(String consigneeCompNm2LikeFront) {
        this.consigneeCompNm2LikeFront = consigneeCompNm2LikeFront;
    }

    /**
     * consigneeCompAddr1GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1GreaterThan
     */
    public String getConsigneeCompAddr1GreaterThan() {
        return consigneeCompAddr1GreaterThan;
    }

    /**
     * consigneeCompAddr1GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr1GreaterThan consigneeCompAddr1GreaterThan に設定する
     */
    public void setConsigneeCompAddr1GreaterThan(String consigneeCompAddr1GreaterThan) {
        this.consigneeCompAddr1GreaterThan = consigneeCompAddr1GreaterThan;
    }

    /**
     * consigneeCompAddr1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1GreaterThanEqual
     */
    public String getConsigneeCompAddr1GreaterThanEqual() {
        return consigneeCompAddr1GreaterThanEqual;
    }

    /**
     * consigneeCompAddr1GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr1GreaterThanEqual consigneeCompAddr1GreaterThanEqual に設定する
     */
    public void setConsigneeCompAddr1GreaterThanEqual(String consigneeCompAddr1GreaterThanEqual) {
        this.consigneeCompAddr1GreaterThanEqual = consigneeCompAddr1GreaterThanEqual;
    }

    /**
     * consigneeCompAddr1LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1LessThan
     */
    public String getConsigneeCompAddr1LessThan() {
        return consigneeCompAddr1LessThan;
    }

    /**
     * consigneeCompAddr1LessThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr1LessThan consigneeCompAddr1LessThan に設定する
     */
    public void setConsigneeCompAddr1LessThan(String consigneeCompAddr1LessThan) {
        this.consigneeCompAddr1LessThan = consigneeCompAddr1LessThan;
    }

    /**
     * consigneeCompAddr1LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1LessThanEqual
     */
    public String getConsigneeCompAddr1LessThanEqual() {
        return consigneeCompAddr1LessThanEqual;
    }

    /**
     * consigneeCompAddr1LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr1LessThanEqual consigneeCompAddr1LessThanEqual に設定する
     */
    public void setConsigneeCompAddr1LessThanEqual(String consigneeCompAddr1LessThanEqual) {
        this.consigneeCompAddr1LessThanEqual = consigneeCompAddr1LessThanEqual;
    }

    /**
     * consigneeCompAddr1LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr1LikeFront
     */
    public String getConsigneeCompAddr1LikeFront() {
        return consigneeCompAddr1LikeFront;
    }

    /**
     * consigneeCompAddr1LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompAddr1LikeFront consigneeCompAddr1LikeFront に設定する
     */
    public void setConsigneeCompAddr1LikeFront(String consigneeCompAddr1LikeFront) {
        this.consigneeCompAddr1LikeFront = consigneeCompAddr1LikeFront;
    }

    /**
     * consigneeCompAddr2GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2GreaterThan
     */
    public String getConsigneeCompAddr2GreaterThan() {
        return consigneeCompAddr2GreaterThan;
    }

    /**
     * consigneeCompAddr2GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr2GreaterThan consigneeCompAddr2GreaterThan に設定する
     */
    public void setConsigneeCompAddr2GreaterThan(String consigneeCompAddr2GreaterThan) {
        this.consigneeCompAddr2GreaterThan = consigneeCompAddr2GreaterThan;
    }

    /**
     * consigneeCompAddr2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2GreaterThanEqual
     */
    public String getConsigneeCompAddr2GreaterThanEqual() {
        return consigneeCompAddr2GreaterThanEqual;
    }

    /**
     * consigneeCompAddr2GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr2GreaterThanEqual consigneeCompAddr2GreaterThanEqual に設定する
     */
    public void setConsigneeCompAddr2GreaterThanEqual(String consigneeCompAddr2GreaterThanEqual) {
        this.consigneeCompAddr2GreaterThanEqual = consigneeCompAddr2GreaterThanEqual;
    }

    /**
     * consigneeCompAddr2LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2LessThan
     */
    public String getConsigneeCompAddr2LessThan() {
        return consigneeCompAddr2LessThan;
    }

    /**
     * consigneeCompAddr2LessThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr2LessThan consigneeCompAddr2LessThan に設定する
     */
    public void setConsigneeCompAddr2LessThan(String consigneeCompAddr2LessThan) {
        this.consigneeCompAddr2LessThan = consigneeCompAddr2LessThan;
    }

    /**
     * consigneeCompAddr2LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2LessThanEqual
     */
    public String getConsigneeCompAddr2LessThanEqual() {
        return consigneeCompAddr2LessThanEqual;
    }

    /**
     * consigneeCompAddr2LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr2LessThanEqual consigneeCompAddr2LessThanEqual に設定する
     */
    public void setConsigneeCompAddr2LessThanEqual(String consigneeCompAddr2LessThanEqual) {
        this.consigneeCompAddr2LessThanEqual = consigneeCompAddr2LessThanEqual;
    }

    /**
     * consigneeCompAddr2LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr2LikeFront
     */
    public String getConsigneeCompAddr2LikeFront() {
        return consigneeCompAddr2LikeFront;
    }

    /**
     * consigneeCompAddr2LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompAddr2LikeFront consigneeCompAddr2LikeFront に設定する
     */
    public void setConsigneeCompAddr2LikeFront(String consigneeCompAddr2LikeFront) {
        this.consigneeCompAddr2LikeFront = consigneeCompAddr2LikeFront;
    }

    /**
     * consigneeCompAddr3GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3GreaterThan
     */
    public String getConsigneeCompAddr3GreaterThan() {
        return consigneeCompAddr3GreaterThan;
    }

    /**
     * consigneeCompAddr3GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr3GreaterThan consigneeCompAddr3GreaterThan に設定する
     */
    public void setConsigneeCompAddr3GreaterThan(String consigneeCompAddr3GreaterThan) {
        this.consigneeCompAddr3GreaterThan = consigneeCompAddr3GreaterThan;
    }

    /**
     * consigneeCompAddr3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3GreaterThanEqual
     */
    public String getConsigneeCompAddr3GreaterThanEqual() {
        return consigneeCompAddr3GreaterThanEqual;
    }

    /**
     * consigneeCompAddr3GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr3GreaterThanEqual consigneeCompAddr3GreaterThanEqual に設定する
     */
    public void setConsigneeCompAddr3GreaterThanEqual(String consigneeCompAddr3GreaterThanEqual) {
        this.consigneeCompAddr3GreaterThanEqual = consigneeCompAddr3GreaterThanEqual;
    }

    /**
     * consigneeCompAddr3LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3LessThan
     */
    public String getConsigneeCompAddr3LessThan() {
        return consigneeCompAddr3LessThan;
    }

    /**
     * consigneeCompAddr3LessThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr3LessThan consigneeCompAddr3LessThan に設定する
     */
    public void setConsigneeCompAddr3LessThan(String consigneeCompAddr3LessThan) {
        this.consigneeCompAddr3LessThan = consigneeCompAddr3LessThan;
    }

    /**
     * consigneeCompAddr3LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3LessThanEqual
     */
    public String getConsigneeCompAddr3LessThanEqual() {
        return consigneeCompAddr3LessThanEqual;
    }

    /**
     * consigneeCompAddr3LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr3LessThanEqual consigneeCompAddr3LessThanEqual に設定する
     */
    public void setConsigneeCompAddr3LessThanEqual(String consigneeCompAddr3LessThanEqual) {
        this.consigneeCompAddr3LessThanEqual = consigneeCompAddr3LessThanEqual;
    }

    /**
     * consigneeCompAddr3LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr3LikeFront
     */
    public String getConsigneeCompAddr3LikeFront() {
        return consigneeCompAddr3LikeFront;
    }

    /**
     * consigneeCompAddr3LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompAddr3LikeFront consigneeCompAddr3LikeFront に設定する
     */
    public void setConsigneeCompAddr3LikeFront(String consigneeCompAddr3LikeFront) {
        this.consigneeCompAddr3LikeFront = consigneeCompAddr3LikeFront;
    }

    /**
     * consigneeCompAddr4GreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4GreaterThan
     */
    public String getConsigneeCompAddr4GreaterThan() {
        return consigneeCompAddr4GreaterThan;
    }

    /**
     * consigneeCompAddr4GreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr4GreaterThan consigneeCompAddr4GreaterThan に設定する
     */
    public void setConsigneeCompAddr4GreaterThan(String consigneeCompAddr4GreaterThan) {
        this.consigneeCompAddr4GreaterThan = consigneeCompAddr4GreaterThan;
    }

    /**
     * consigneeCompAddr4GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4GreaterThanEqual
     */
    public String getConsigneeCompAddr4GreaterThanEqual() {
        return consigneeCompAddr4GreaterThanEqual;
    }

    /**
     * consigneeCompAddr4GreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr4GreaterThanEqual consigneeCompAddr4GreaterThanEqual に設定する
     */
    public void setConsigneeCompAddr4GreaterThanEqual(String consigneeCompAddr4GreaterThanEqual) {
        this.consigneeCompAddr4GreaterThanEqual = consigneeCompAddr4GreaterThanEqual;
    }

    /**
     * consigneeCompAddr4LessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4LessThan
     */
    public String getConsigneeCompAddr4LessThan() {
        return consigneeCompAddr4LessThan;
    }

    /**
     * consigneeCompAddr4LessThan のセッターメソッドです。
     * 
     * @param consigneeCompAddr4LessThan consigneeCompAddr4LessThan に設定する
     */
    public void setConsigneeCompAddr4LessThan(String consigneeCompAddr4LessThan) {
        this.consigneeCompAddr4LessThan = consigneeCompAddr4LessThan;
    }

    /**
     * consigneeCompAddr4LessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4LessThanEqual
     */
    public String getConsigneeCompAddr4LessThanEqual() {
        return consigneeCompAddr4LessThanEqual;
    }

    /**
     * consigneeCompAddr4LessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompAddr4LessThanEqual consigneeCompAddr4LessThanEqual に設定する
     */
    public void setConsigneeCompAddr4LessThanEqual(String consigneeCompAddr4LessThanEqual) {
        this.consigneeCompAddr4LessThanEqual = consigneeCompAddr4LessThanEqual;
    }

    /**
     * consigneeCompAddr4LikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompAddr4LikeFront
     */
    public String getConsigneeCompAddr4LikeFront() {
        return consigneeCompAddr4LikeFront;
    }

    /**
     * consigneeCompAddr4LikeFront のセッターメソッドです。
     * 
     * @param consigneeCompAddr4LikeFront consigneeCompAddr4LikeFront に設定する
     */
    public void setConsigneeCompAddr4LikeFront(String consigneeCompAddr4LikeFront) {
        this.consigneeCompAddr4LikeFront = consigneeCompAddr4LikeFront;
    }

    /**
     * consigneeCompTelGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompTelGreaterThan
     */
    public String getConsigneeCompTelGreaterThan() {
        return consigneeCompTelGreaterThan;
    }

    /**
     * consigneeCompTelGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompTelGreaterThan consigneeCompTelGreaterThan に設定する
     */
    public void setConsigneeCompTelGreaterThan(String consigneeCompTelGreaterThan) {
        this.consigneeCompTelGreaterThan = consigneeCompTelGreaterThan;
    }

    /**
     * consigneeCompTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompTelGreaterThanEqual
     */
    public String getConsigneeCompTelGreaterThanEqual() {
        return consigneeCompTelGreaterThanEqual;
    }

    /**
     * consigneeCompTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompTelGreaterThanEqual consigneeCompTelGreaterThanEqual に設定する
     */
    public void setConsigneeCompTelGreaterThanEqual(String consigneeCompTelGreaterThanEqual) {
        this.consigneeCompTelGreaterThanEqual = consigneeCompTelGreaterThanEqual;
    }

    /**
     * consigneeCompTelLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLessThan
     */
    public String getConsigneeCompTelLessThan() {
        return consigneeCompTelLessThan;
    }

    /**
     * consigneeCompTelLessThan のセッターメソッドです。
     * 
     * @param consigneeCompTelLessThan consigneeCompTelLessThan に設定する
     */
    public void setConsigneeCompTelLessThan(String consigneeCompTelLessThan) {
        this.consigneeCompTelLessThan = consigneeCompTelLessThan;
    }

    /**
     * consigneeCompTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLessThanEqual
     */
    public String getConsigneeCompTelLessThanEqual() {
        return consigneeCompTelLessThanEqual;
    }

    /**
     * consigneeCompTelLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompTelLessThanEqual consigneeCompTelLessThanEqual に設定する
     */
    public void setConsigneeCompTelLessThanEqual(String consigneeCompTelLessThanEqual) {
        this.consigneeCompTelLessThanEqual = consigneeCompTelLessThanEqual;
    }

    /**
     * consigneeCompTelLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompTelLikeFront
     */
    public String getConsigneeCompTelLikeFront() {
        return consigneeCompTelLikeFront;
    }

    /**
     * consigneeCompTelLikeFront のセッターメソッドです。
     * 
     * @param consigneeCompTelLikeFront consigneeCompTelLikeFront に設定する
     */
    public void setConsigneeCompTelLikeFront(String consigneeCompTelLikeFront) {
        this.consigneeCompTelLikeFront = consigneeCompTelLikeFront;
    }

    /**
     * consigneeCompFaxGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeCompFaxGreaterThan
     */
    public String getConsigneeCompFaxGreaterThan() {
        return consigneeCompFaxGreaterThan;
    }

    /**
     * consigneeCompFaxGreaterThan のセッターメソッドです。
     * 
     * @param consigneeCompFaxGreaterThan consigneeCompFaxGreaterThan に設定する
     */
    public void setConsigneeCompFaxGreaterThan(String consigneeCompFaxGreaterThan) {
        this.consigneeCompFaxGreaterThan = consigneeCompFaxGreaterThan;
    }

    /**
     * consigneeCompFaxGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompFaxGreaterThanEqual
     */
    public String getConsigneeCompFaxGreaterThanEqual() {
        return consigneeCompFaxGreaterThanEqual;
    }

    /**
     * consigneeCompFaxGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompFaxGreaterThanEqual consigneeCompFaxGreaterThanEqual に設定する
     */
    public void setConsigneeCompFaxGreaterThanEqual(String consigneeCompFaxGreaterThanEqual) {
        this.consigneeCompFaxGreaterThanEqual = consigneeCompFaxGreaterThanEqual;
    }

    /**
     * consigneeCompFaxLessThan のゲッターメソッドです。
     * 
     * @return the consigneeCompFaxLessThan
     */
    public String getConsigneeCompFaxLessThan() {
        return consigneeCompFaxLessThan;
    }

    /**
     * consigneeCompFaxLessThan のセッターメソッドです。
     * 
     * @param consigneeCompFaxLessThan consigneeCompFaxLessThan に設定する
     */
    public void setConsigneeCompFaxLessThan(String consigneeCompFaxLessThan) {
        this.consigneeCompFaxLessThan = consigneeCompFaxLessThan;
    }

    /**
     * consigneeCompFaxLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeCompFaxLessThanEqual
     */
    public String getConsigneeCompFaxLessThanEqual() {
        return consigneeCompFaxLessThanEqual;
    }

    /**
     * consigneeCompFaxLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeCompFaxLessThanEqual consigneeCompFaxLessThanEqual に設定する
     */
    public void setConsigneeCompFaxLessThanEqual(String consigneeCompFaxLessThanEqual) {
        this.consigneeCompFaxLessThanEqual = consigneeCompFaxLessThanEqual;
    }

    /**
     * consigneeCompFaxLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeCompFaxLikeFront
     */
    public String getConsigneeCompFaxLikeFront() {
        return consigneeCompFaxLikeFront;
    }

    /**
     * consigneeCompFaxLikeFront のセッターメソッドです。
     * 
     * @param consigneeCompFaxLikeFront consigneeCompFaxLikeFront に設定する
     */
    public void setConsigneeCompFaxLikeFront(String consigneeCompFaxLikeFront) {
        this.consigneeCompFaxLikeFront = consigneeCompFaxLikeFront;
    }

    /**
     * consigneeTaxIdNoGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNoGreaterThan
     */
    public String getConsigneeTaxIdNoGreaterThan() {
        return consigneeTaxIdNoGreaterThan;
    }

    /**
     * consigneeTaxIdNoGreaterThan のセッターメソッドです。
     * 
     * @param consigneeTaxIdNoGreaterThan consigneeTaxIdNoGreaterThan に設定する
     */
    public void setConsigneeTaxIdNoGreaterThan(String consigneeTaxIdNoGreaterThan) {
        this.consigneeTaxIdNoGreaterThan = consigneeTaxIdNoGreaterThan;
    }

    /**
     * consigneeTaxIdNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNoGreaterThanEqual
     */
    public String getConsigneeTaxIdNoGreaterThanEqual() {
        return consigneeTaxIdNoGreaterThanEqual;
    }

    /**
     * consigneeTaxIdNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeTaxIdNoGreaterThanEqual consigneeTaxIdNoGreaterThanEqual に設定する
     */
    public void setConsigneeTaxIdNoGreaterThanEqual(String consigneeTaxIdNoGreaterThanEqual) {
        this.consigneeTaxIdNoGreaterThanEqual = consigneeTaxIdNoGreaterThanEqual;
    }

    /**
     * consigneeTaxIdNoLessThan のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNoLessThan
     */
    public String getConsigneeTaxIdNoLessThan() {
        return consigneeTaxIdNoLessThan;
    }

    /**
     * consigneeTaxIdNoLessThan のセッターメソッドです。
     * 
     * @param consigneeTaxIdNoLessThan consigneeTaxIdNoLessThan に設定する
     */
    public void setConsigneeTaxIdNoLessThan(String consigneeTaxIdNoLessThan) {
        this.consigneeTaxIdNoLessThan = consigneeTaxIdNoLessThan;
    }

    /**
     * consigneeTaxIdNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNoLessThanEqual
     */
    public String getConsigneeTaxIdNoLessThanEqual() {
        return consigneeTaxIdNoLessThanEqual;
    }

    /**
     * consigneeTaxIdNoLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeTaxIdNoLessThanEqual consigneeTaxIdNoLessThanEqual に設定する
     */
    public void setConsigneeTaxIdNoLessThanEqual(String consigneeTaxIdNoLessThanEqual) {
        this.consigneeTaxIdNoLessThanEqual = consigneeTaxIdNoLessThanEqual;
    }

    /**
     * consigneeTaxIdNoLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeTaxIdNoLikeFront
     */
    public String getConsigneeTaxIdNoLikeFront() {
        return consigneeTaxIdNoLikeFront;
    }

    /**
     * consigneeTaxIdNoLikeFront のセッターメソッドです。
     * 
     * @param consigneeTaxIdNoLikeFront consigneeTaxIdNoLikeFront に設定する
     */
    public void setConsigneeTaxIdNoLikeFront(String consigneeTaxIdNoLikeFront) {
        this.consigneeTaxIdNoLikeFront = consigneeTaxIdNoLikeFront;
    }

    /**
     * consigneeAttnGreaterThan のゲッターメソッドです。
     * 
     * @return the consigneeAttnGreaterThan
     */
    public String getConsigneeAttnGreaterThan() {
        return consigneeAttnGreaterThan;
    }

    /**
     * consigneeAttnGreaterThan のセッターメソッドです。
     * 
     * @param consigneeAttnGreaterThan consigneeAttnGreaterThan に設定する
     */
    public void setConsigneeAttnGreaterThan(String consigneeAttnGreaterThan) {
        this.consigneeAttnGreaterThan = consigneeAttnGreaterThan;
    }

    /**
     * consigneeAttnGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeAttnGreaterThanEqual
     */
    public String getConsigneeAttnGreaterThanEqual() {
        return consigneeAttnGreaterThanEqual;
    }

    /**
     * consigneeAttnGreaterThanEqual のセッターメソッドです。
     * 
     * @param consigneeAttnGreaterThanEqual consigneeAttnGreaterThanEqual に設定する
     */
    public void setConsigneeAttnGreaterThanEqual(String consigneeAttnGreaterThanEqual) {
        this.consigneeAttnGreaterThanEqual = consigneeAttnGreaterThanEqual;
    }

    /**
     * consigneeAttnLessThan のゲッターメソッドです。
     * 
     * @return the consigneeAttnLessThan
     */
    public String getConsigneeAttnLessThan() {
        return consigneeAttnLessThan;
    }

    /**
     * consigneeAttnLessThan のセッターメソッドです。
     * 
     * @param consigneeAttnLessThan consigneeAttnLessThan に設定する
     */
    public void setConsigneeAttnLessThan(String consigneeAttnLessThan) {
        this.consigneeAttnLessThan = consigneeAttnLessThan;
    }

    /**
     * consigneeAttnLessThanEqual のゲッターメソッドです。
     * 
     * @return the consigneeAttnLessThanEqual
     */
    public String getConsigneeAttnLessThanEqual() {
        return consigneeAttnLessThanEqual;
    }

    /**
     * consigneeAttnLessThanEqual のセッターメソッドです。
     * 
     * @param consigneeAttnLessThanEqual consigneeAttnLessThanEqual に設定する
     */
    public void setConsigneeAttnLessThanEqual(String consigneeAttnLessThanEqual) {
        this.consigneeAttnLessThanEqual = consigneeAttnLessThanEqual;
    }

    /**
     * consigneeAttnLikeFront のゲッターメソッドです。
     * 
     * @return the consigneeAttnLikeFront
     */
    public String getConsigneeAttnLikeFront() {
        return consigneeAttnLikeFront;
    }

    /**
     * consigneeAttnLikeFront のセッターメソッドです。
     * 
     * @param consigneeAttnLikeFront consigneeAttnLikeFront に設定する
     */
    public void setConsigneeAttnLikeFront(String consigneeAttnLikeFront) {
        this.consigneeAttnLikeFront = consigneeAttnLikeFront;
    }

    /**
     * shipToNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToNm1GreaterThan
     */
    public String getShipToNm1GreaterThan() {
        return shipToNm1GreaterThan;
    }

    /**
     * shipToNm1GreaterThan のセッターメソッドです。
     * 
     * @param shipToNm1GreaterThan shipToNm1GreaterThan に設定する
     */
    public void setShipToNm1GreaterThan(String shipToNm1GreaterThan) {
        this.shipToNm1GreaterThan = shipToNm1GreaterThan;
    }

    /**
     * shipToNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNm1GreaterThanEqual
     */
    public String getShipToNm1GreaterThanEqual() {
        return shipToNm1GreaterThanEqual;
    }

    /**
     * shipToNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToNm1GreaterThanEqual shipToNm1GreaterThanEqual に設定する
     */
    public void setShipToNm1GreaterThanEqual(String shipToNm1GreaterThanEqual) {
        this.shipToNm1GreaterThanEqual = shipToNm1GreaterThanEqual;
    }

    /**
     * shipToNm1LessThan のゲッターメソッドです。
     * 
     * @return the shipToNm1LessThan
     */
    public String getShipToNm1LessThan() {
        return shipToNm1LessThan;
    }

    /**
     * shipToNm1LessThan のセッターメソッドです。
     * 
     * @param shipToNm1LessThan shipToNm1LessThan に設定する
     */
    public void setShipToNm1LessThan(String shipToNm1LessThan) {
        this.shipToNm1LessThan = shipToNm1LessThan;
    }

    /**
     * shipToNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNm1LessThanEqual
     */
    public String getShipToNm1LessThanEqual() {
        return shipToNm1LessThanEqual;
    }

    /**
     * shipToNm1LessThanEqual のセッターメソッドです。
     * 
     * @param shipToNm1LessThanEqual shipToNm1LessThanEqual に設定する
     */
    public void setShipToNm1LessThanEqual(String shipToNm1LessThanEqual) {
        this.shipToNm1LessThanEqual = shipToNm1LessThanEqual;
    }

    /**
     * shipToNm1LikeFront のゲッターメソッドです。
     * 
     * @return the shipToNm1LikeFront
     */
    public String getShipToNm1LikeFront() {
        return shipToNm1LikeFront;
    }

    /**
     * shipToNm1LikeFront のセッターメソッドです。
     * 
     * @param shipToNm1LikeFront shipToNm1LikeFront に設定する
     */
    public void setShipToNm1LikeFront(String shipToNm1LikeFront) {
        this.shipToNm1LikeFront = shipToNm1LikeFront;
    }

    /**
     * shipToNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToNm2GreaterThan
     */
    public String getShipToNm2GreaterThan() {
        return shipToNm2GreaterThan;
    }

    /**
     * shipToNm2GreaterThan のセッターメソッドです。
     * 
     * @param shipToNm2GreaterThan shipToNm2GreaterThan に設定する
     */
    public void setShipToNm2GreaterThan(String shipToNm2GreaterThan) {
        this.shipToNm2GreaterThan = shipToNm2GreaterThan;
    }

    /**
     * shipToNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNm2GreaterThanEqual
     */
    public String getShipToNm2GreaterThanEqual() {
        return shipToNm2GreaterThanEqual;
    }

    /**
     * shipToNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToNm2GreaterThanEqual shipToNm2GreaterThanEqual に設定する
     */
    public void setShipToNm2GreaterThanEqual(String shipToNm2GreaterThanEqual) {
        this.shipToNm2GreaterThanEqual = shipToNm2GreaterThanEqual;
    }

    /**
     * shipToNm2LessThan のゲッターメソッドです。
     * 
     * @return the shipToNm2LessThan
     */
    public String getShipToNm2LessThan() {
        return shipToNm2LessThan;
    }

    /**
     * shipToNm2LessThan のセッターメソッドです。
     * 
     * @param shipToNm2LessThan shipToNm2LessThan に設定する
     */
    public void setShipToNm2LessThan(String shipToNm2LessThan) {
        this.shipToNm2LessThan = shipToNm2LessThan;
    }

    /**
     * shipToNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToNm2LessThanEqual
     */
    public String getShipToNm2LessThanEqual() {
        return shipToNm2LessThanEqual;
    }

    /**
     * shipToNm2LessThanEqual のセッターメソッドです。
     * 
     * @param shipToNm2LessThanEqual shipToNm2LessThanEqual に設定する
     */
    public void setShipToNm2LessThanEqual(String shipToNm2LessThanEqual) {
        this.shipToNm2LessThanEqual = shipToNm2LessThanEqual;
    }

    /**
     * shipToNm2LikeFront のゲッターメソッドです。
     * 
     * @return the shipToNm2LikeFront
     */
    public String getShipToNm2LikeFront() {
        return shipToNm2LikeFront;
    }

    /**
     * shipToNm2LikeFront のセッターメソッドです。
     * 
     * @param shipToNm2LikeFront shipToNm2LikeFront に設定する
     */
    public void setShipToNm2LikeFront(String shipToNm2LikeFront) {
        this.shipToNm2LikeFront = shipToNm2LikeFront;
    }

    /**
     * shipToAddr1GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAddr1GreaterThan
     */
    public String getShipToAddr1GreaterThan() {
        return shipToAddr1GreaterThan;
    }

    /**
     * shipToAddr1GreaterThan のセッターメソッドです。
     * 
     * @param shipToAddr1GreaterThan shipToAddr1GreaterThan に設定する
     */
    public void setShipToAddr1GreaterThan(String shipToAddr1GreaterThan) {
        this.shipToAddr1GreaterThan = shipToAddr1GreaterThan;
    }

    /**
     * shipToAddr1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr1GreaterThanEqual
     */
    public String getShipToAddr1GreaterThanEqual() {
        return shipToAddr1GreaterThanEqual;
    }

    /**
     * shipToAddr1GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr1GreaterThanEqual shipToAddr1GreaterThanEqual に設定する
     */
    public void setShipToAddr1GreaterThanEqual(String shipToAddr1GreaterThanEqual) {
        this.shipToAddr1GreaterThanEqual = shipToAddr1GreaterThanEqual;
    }

    /**
     * shipToAddr1LessThan のゲッターメソッドです。
     * 
     * @return the shipToAddr1LessThan
     */
    public String getShipToAddr1LessThan() {
        return shipToAddr1LessThan;
    }

    /**
     * shipToAddr1LessThan のセッターメソッドです。
     * 
     * @param shipToAddr1LessThan shipToAddr1LessThan に設定する
     */
    public void setShipToAddr1LessThan(String shipToAddr1LessThan) {
        this.shipToAddr1LessThan = shipToAddr1LessThan;
    }

    /**
     * shipToAddr1LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr1LessThanEqual
     */
    public String getShipToAddr1LessThanEqual() {
        return shipToAddr1LessThanEqual;
    }

    /**
     * shipToAddr1LessThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr1LessThanEqual shipToAddr1LessThanEqual に設定する
     */
    public void setShipToAddr1LessThanEqual(String shipToAddr1LessThanEqual) {
        this.shipToAddr1LessThanEqual = shipToAddr1LessThanEqual;
    }

    /**
     * shipToAddr1LikeFront のゲッターメソッドです。
     * 
     * @return the shipToAddr1LikeFront
     */
    public String getShipToAddr1LikeFront() {
        return shipToAddr1LikeFront;
    }

    /**
     * shipToAddr1LikeFront のセッターメソッドです。
     * 
     * @param shipToAddr1LikeFront shipToAddr1LikeFront に設定する
     */
    public void setShipToAddr1LikeFront(String shipToAddr1LikeFront) {
        this.shipToAddr1LikeFront = shipToAddr1LikeFront;
    }

    /**
     * shipToAddr2GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAddr2GreaterThan
     */
    public String getShipToAddr2GreaterThan() {
        return shipToAddr2GreaterThan;
    }

    /**
     * shipToAddr2GreaterThan のセッターメソッドです。
     * 
     * @param shipToAddr2GreaterThan shipToAddr2GreaterThan に設定する
     */
    public void setShipToAddr2GreaterThan(String shipToAddr2GreaterThan) {
        this.shipToAddr2GreaterThan = shipToAddr2GreaterThan;
    }

    /**
     * shipToAddr2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr2GreaterThanEqual
     */
    public String getShipToAddr2GreaterThanEqual() {
        return shipToAddr2GreaterThanEqual;
    }

    /**
     * shipToAddr2GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr2GreaterThanEqual shipToAddr2GreaterThanEqual に設定する
     */
    public void setShipToAddr2GreaterThanEqual(String shipToAddr2GreaterThanEqual) {
        this.shipToAddr2GreaterThanEqual = shipToAddr2GreaterThanEqual;
    }

    /**
     * shipToAddr2LessThan のゲッターメソッドです。
     * 
     * @return the shipToAddr2LessThan
     */
    public String getShipToAddr2LessThan() {
        return shipToAddr2LessThan;
    }

    /**
     * shipToAddr2LessThan のセッターメソッドです。
     * 
     * @param shipToAddr2LessThan shipToAddr2LessThan に設定する
     */
    public void setShipToAddr2LessThan(String shipToAddr2LessThan) {
        this.shipToAddr2LessThan = shipToAddr2LessThan;
    }

    /**
     * shipToAddr2LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr2LessThanEqual
     */
    public String getShipToAddr2LessThanEqual() {
        return shipToAddr2LessThanEqual;
    }

    /**
     * shipToAddr2LessThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr2LessThanEqual shipToAddr2LessThanEqual に設定する
     */
    public void setShipToAddr2LessThanEqual(String shipToAddr2LessThanEqual) {
        this.shipToAddr2LessThanEqual = shipToAddr2LessThanEqual;
    }

    /**
     * shipToAddr2LikeFront のゲッターメソッドです。
     * 
     * @return the shipToAddr2LikeFront
     */
    public String getShipToAddr2LikeFront() {
        return shipToAddr2LikeFront;
    }

    /**
     * shipToAddr2LikeFront のセッターメソッドです。
     * 
     * @param shipToAddr2LikeFront shipToAddr2LikeFront に設定する
     */
    public void setShipToAddr2LikeFront(String shipToAddr2LikeFront) {
        this.shipToAddr2LikeFront = shipToAddr2LikeFront;
    }

    /**
     * shipToAddr3GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAddr3GreaterThan
     */
    public String getShipToAddr3GreaterThan() {
        return shipToAddr3GreaterThan;
    }

    /**
     * shipToAddr3GreaterThan のセッターメソッドです。
     * 
     * @param shipToAddr3GreaterThan shipToAddr3GreaterThan に設定する
     */
    public void setShipToAddr3GreaterThan(String shipToAddr3GreaterThan) {
        this.shipToAddr3GreaterThan = shipToAddr3GreaterThan;
    }

    /**
     * shipToAddr3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr3GreaterThanEqual
     */
    public String getShipToAddr3GreaterThanEqual() {
        return shipToAddr3GreaterThanEqual;
    }

    /**
     * shipToAddr3GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr3GreaterThanEqual shipToAddr3GreaterThanEqual に設定する
     */
    public void setShipToAddr3GreaterThanEqual(String shipToAddr3GreaterThanEqual) {
        this.shipToAddr3GreaterThanEqual = shipToAddr3GreaterThanEqual;
    }

    /**
     * shipToAddr3LessThan のゲッターメソッドです。
     * 
     * @return the shipToAddr3LessThan
     */
    public String getShipToAddr3LessThan() {
        return shipToAddr3LessThan;
    }

    /**
     * shipToAddr3LessThan のセッターメソッドです。
     * 
     * @param shipToAddr3LessThan shipToAddr3LessThan に設定する
     */
    public void setShipToAddr3LessThan(String shipToAddr3LessThan) {
        this.shipToAddr3LessThan = shipToAddr3LessThan;
    }

    /**
     * shipToAddr3LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr3LessThanEqual
     */
    public String getShipToAddr3LessThanEqual() {
        return shipToAddr3LessThanEqual;
    }

    /**
     * shipToAddr3LessThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr3LessThanEqual shipToAddr3LessThanEqual に設定する
     */
    public void setShipToAddr3LessThanEqual(String shipToAddr3LessThanEqual) {
        this.shipToAddr3LessThanEqual = shipToAddr3LessThanEqual;
    }

    /**
     * shipToAddr3LikeFront のゲッターメソッドです。
     * 
     * @return the shipToAddr3LikeFront
     */
    public String getShipToAddr3LikeFront() {
        return shipToAddr3LikeFront;
    }

    /**
     * shipToAddr3LikeFront のセッターメソッドです。
     * 
     * @param shipToAddr3LikeFront shipToAddr3LikeFront に設定する
     */
    public void setShipToAddr3LikeFront(String shipToAddr3LikeFront) {
        this.shipToAddr3LikeFront = shipToAddr3LikeFront;
    }

    /**
     * shipToAddr4GreaterThan のゲッターメソッドです。
     * 
     * @return the shipToAddr4GreaterThan
     */
    public String getShipToAddr4GreaterThan() {
        return shipToAddr4GreaterThan;
    }

    /**
     * shipToAddr4GreaterThan のセッターメソッドです。
     * 
     * @param shipToAddr4GreaterThan shipToAddr4GreaterThan に設定する
     */
    public void setShipToAddr4GreaterThan(String shipToAddr4GreaterThan) {
        this.shipToAddr4GreaterThan = shipToAddr4GreaterThan;
    }

    /**
     * shipToAddr4GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr4GreaterThanEqual
     */
    public String getShipToAddr4GreaterThanEqual() {
        return shipToAddr4GreaterThanEqual;
    }

    /**
     * shipToAddr4GreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr4GreaterThanEqual shipToAddr4GreaterThanEqual に設定する
     */
    public void setShipToAddr4GreaterThanEqual(String shipToAddr4GreaterThanEqual) {
        this.shipToAddr4GreaterThanEqual = shipToAddr4GreaterThanEqual;
    }

    /**
     * shipToAddr4LessThan のゲッターメソッドです。
     * 
     * @return the shipToAddr4LessThan
     */
    public String getShipToAddr4LessThan() {
        return shipToAddr4LessThan;
    }

    /**
     * shipToAddr4LessThan のセッターメソッドです。
     * 
     * @param shipToAddr4LessThan shipToAddr4LessThan に設定する
     */
    public void setShipToAddr4LessThan(String shipToAddr4LessThan) {
        this.shipToAddr4LessThan = shipToAddr4LessThan;
    }

    /**
     * shipToAddr4LessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToAddr4LessThanEqual
     */
    public String getShipToAddr4LessThanEqual() {
        return shipToAddr4LessThanEqual;
    }

    /**
     * shipToAddr4LessThanEqual のセッターメソッドです。
     * 
     * @param shipToAddr4LessThanEqual shipToAddr4LessThanEqual に設定する
     */
    public void setShipToAddr4LessThanEqual(String shipToAddr4LessThanEqual) {
        this.shipToAddr4LessThanEqual = shipToAddr4LessThanEqual;
    }

    /**
     * shipToAddr4LikeFront のゲッターメソッドです。
     * 
     * @return the shipToAddr4LikeFront
     */
    public String getShipToAddr4LikeFront() {
        return shipToAddr4LikeFront;
    }

    /**
     * shipToAddr4LikeFront のセッターメソッドです。
     * 
     * @param shipToAddr4LikeFront shipToAddr4LikeFront に設定する
     */
    public void setShipToAddr4LikeFront(String shipToAddr4LikeFront) {
        this.shipToAddr4LikeFront = shipToAddr4LikeFront;
    }

    /**
     * shipToTelGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToTelGreaterThan
     */
    public String getShipToTelGreaterThan() {
        return shipToTelGreaterThan;
    }

    /**
     * shipToTelGreaterThan のセッターメソッドです。
     * 
     * @param shipToTelGreaterThan shipToTelGreaterThan に設定する
     */
    public void setShipToTelGreaterThan(String shipToTelGreaterThan) {
        this.shipToTelGreaterThan = shipToTelGreaterThan;
    }

    /**
     * shipToTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToTelGreaterThanEqual
     */
    public String getShipToTelGreaterThanEqual() {
        return shipToTelGreaterThanEqual;
    }

    /**
     * shipToTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToTelGreaterThanEqual shipToTelGreaterThanEqual に設定する
     */
    public void setShipToTelGreaterThanEqual(String shipToTelGreaterThanEqual) {
        this.shipToTelGreaterThanEqual = shipToTelGreaterThanEqual;
    }

    /**
     * shipToTelLessThan のゲッターメソッドです。
     * 
     * @return the shipToTelLessThan
     */
    public String getShipToTelLessThan() {
        return shipToTelLessThan;
    }

    /**
     * shipToTelLessThan のセッターメソッドです。
     * 
     * @param shipToTelLessThan shipToTelLessThan に設定する
     */
    public void setShipToTelLessThan(String shipToTelLessThan) {
        this.shipToTelLessThan = shipToTelLessThan;
    }

    /**
     * shipToTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToTelLessThanEqual
     */
    public String getShipToTelLessThanEqual() {
        return shipToTelLessThanEqual;
    }

    /**
     * shipToTelLessThanEqual のセッターメソッドです。
     * 
     * @param shipToTelLessThanEqual shipToTelLessThanEqual に設定する
     */
    public void setShipToTelLessThanEqual(String shipToTelLessThanEqual) {
        this.shipToTelLessThanEqual = shipToTelLessThanEqual;
    }

    /**
     * shipToTelLikeFront のゲッターメソッドです。
     * 
     * @return the shipToTelLikeFront
     */
    public String getShipToTelLikeFront() {
        return shipToTelLikeFront;
    }

    /**
     * shipToTelLikeFront のセッターメソッドです。
     * 
     * @param shipToTelLikeFront shipToTelLikeFront に設定する
     */
    public void setShipToTelLikeFront(String shipToTelLikeFront) {
        this.shipToTelLikeFront = shipToTelLikeFront;
    }

    /**
     * containerNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the containerNo1GreaterThan
     */
    public String getContainerNo1GreaterThan() {
        return containerNo1GreaterThan;
    }

    /**
     * containerNo1GreaterThan のセッターメソッドです。
     * 
     * @param containerNo1GreaterThan containerNo1GreaterThan に設定する
     */
    public void setContainerNo1GreaterThan(String containerNo1GreaterThan) {
        this.containerNo1GreaterThan = containerNo1GreaterThan;
    }

    /**
     * containerNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo1GreaterThanEqual
     */
    public String getContainerNo1GreaterThanEqual() {
        return containerNo1GreaterThanEqual;
    }

    /**
     * containerNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param containerNo1GreaterThanEqual containerNo1GreaterThanEqual に設定する
     */
    public void setContainerNo1GreaterThanEqual(String containerNo1GreaterThanEqual) {
        this.containerNo1GreaterThanEqual = containerNo1GreaterThanEqual;
    }

    /**
     * containerNo1LessThan のゲッターメソッドです。
     * 
     * @return the containerNo1LessThan
     */
    public String getContainerNo1LessThan() {
        return containerNo1LessThan;
    }

    /**
     * containerNo1LessThan のセッターメソッドです。
     * 
     * @param containerNo1LessThan containerNo1LessThan に設定する
     */
    public void setContainerNo1LessThan(String containerNo1LessThan) {
        this.containerNo1LessThan = containerNo1LessThan;
    }

    /**
     * containerNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo1LessThanEqual
     */
    public String getContainerNo1LessThanEqual() {
        return containerNo1LessThanEqual;
    }

    /**
     * containerNo1LessThanEqual のセッターメソッドです。
     * 
     * @param containerNo1LessThanEqual containerNo1LessThanEqual に設定する
     */
    public void setContainerNo1LessThanEqual(String containerNo1LessThanEqual) {
        this.containerNo1LessThanEqual = containerNo1LessThanEqual;
    }

    /**
     * containerNo1LikeFront のゲッターメソッドです。
     * 
     * @return the containerNo1LikeFront
     */
    public String getContainerNo1LikeFront() {
        return containerNo1LikeFront;
    }

    /**
     * containerNo1LikeFront のセッターメソッドです。
     * 
     * @param containerNo1LikeFront containerNo1LikeFront に設定する
     */
    public void setContainerNo1LikeFront(String containerNo1LikeFront) {
        this.containerNo1LikeFront = containerNo1LikeFront;
    }

    /**
     * containerNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the containerNo2GreaterThan
     */
    public String getContainerNo2GreaterThan() {
        return containerNo2GreaterThan;
    }

    /**
     * containerNo2GreaterThan のセッターメソッドです。
     * 
     * @param containerNo2GreaterThan containerNo2GreaterThan に設定する
     */
    public void setContainerNo2GreaterThan(String containerNo2GreaterThan) {
        this.containerNo2GreaterThan = containerNo2GreaterThan;
    }

    /**
     * containerNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo2GreaterThanEqual
     */
    public String getContainerNo2GreaterThanEqual() {
        return containerNo2GreaterThanEqual;
    }

    /**
     * containerNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param containerNo2GreaterThanEqual containerNo2GreaterThanEqual に設定する
     */
    public void setContainerNo2GreaterThanEqual(String containerNo2GreaterThanEqual) {
        this.containerNo2GreaterThanEqual = containerNo2GreaterThanEqual;
    }

    /**
     * containerNo2LessThan のゲッターメソッドです。
     * 
     * @return the containerNo2LessThan
     */
    public String getContainerNo2LessThan() {
        return containerNo2LessThan;
    }

    /**
     * containerNo2LessThan のセッターメソッドです。
     * 
     * @param containerNo2LessThan containerNo2LessThan に設定する
     */
    public void setContainerNo2LessThan(String containerNo2LessThan) {
        this.containerNo2LessThan = containerNo2LessThan;
    }

    /**
     * containerNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo2LessThanEqual
     */
    public String getContainerNo2LessThanEqual() {
        return containerNo2LessThanEqual;
    }

    /**
     * containerNo2LessThanEqual のセッターメソッドです。
     * 
     * @param containerNo2LessThanEqual containerNo2LessThanEqual に設定する
     */
    public void setContainerNo2LessThanEqual(String containerNo2LessThanEqual) {
        this.containerNo2LessThanEqual = containerNo2LessThanEqual;
    }

    /**
     * containerNo2LikeFront のゲッターメソッドです。
     * 
     * @return the containerNo2LikeFront
     */
    public String getContainerNo2LikeFront() {
        return containerNo2LikeFront;
    }

    /**
     * containerNo2LikeFront のセッターメソッドです。
     * 
     * @param containerNo2LikeFront containerNo2LikeFront に設定する
     */
    public void setContainerNo2LikeFront(String containerNo2LikeFront) {
        this.containerNo2LikeFront = containerNo2LikeFront;
    }

    /**
     * containerNo3GreaterThan のゲッターメソッドです。
     * 
     * @return the containerNo3GreaterThan
     */
    public String getContainerNo3GreaterThan() {
        return containerNo3GreaterThan;
    }

    /**
     * containerNo3GreaterThan のセッターメソッドです。
     * 
     * @param containerNo3GreaterThan containerNo3GreaterThan に設定する
     */
    public void setContainerNo3GreaterThan(String containerNo3GreaterThan) {
        this.containerNo3GreaterThan = containerNo3GreaterThan;
    }

    /**
     * containerNo3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo3GreaterThanEqual
     */
    public String getContainerNo3GreaterThanEqual() {
        return containerNo3GreaterThanEqual;
    }

    /**
     * containerNo3GreaterThanEqual のセッターメソッドです。
     * 
     * @param containerNo3GreaterThanEqual containerNo3GreaterThanEqual に設定する
     */
    public void setContainerNo3GreaterThanEqual(String containerNo3GreaterThanEqual) {
        this.containerNo3GreaterThanEqual = containerNo3GreaterThanEqual;
    }

    /**
     * containerNo3LessThan のゲッターメソッドです。
     * 
     * @return the containerNo3LessThan
     */
    public String getContainerNo3LessThan() {
        return containerNo3LessThan;
    }

    /**
     * containerNo3LessThan のセッターメソッドです。
     * 
     * @param containerNo3LessThan containerNo3LessThan に設定する
     */
    public void setContainerNo3LessThan(String containerNo3LessThan) {
        this.containerNo3LessThan = containerNo3LessThan;
    }

    /**
     * containerNo3LessThanEqual のゲッターメソッドです。
     * 
     * @return the containerNo3LessThanEqual
     */
    public String getContainerNo3LessThanEqual() {
        return containerNo3LessThanEqual;
    }

    /**
     * containerNo3LessThanEqual のセッターメソッドです。
     * 
     * @param containerNo3LessThanEqual containerNo3LessThanEqual に設定する
     */
    public void setContainerNo3LessThanEqual(String containerNo3LessThanEqual) {
        this.containerNo3LessThanEqual = containerNo3LessThanEqual;
    }

    /**
     * containerNo3LikeFront のゲッターメソッドです。
     * 
     * @return the containerNo3LikeFront
     */
    public String getContainerNo3LikeFront() {
        return containerNo3LikeFront;
    }

    /**
     * containerNo3LikeFront のセッターメソッドです。
     * 
     * @param containerNo3LikeFront containerNo3LikeFront に設定する
     */
    public void setContainerNo3LikeFront(String containerNo3LikeFront) {
        this.containerNo3LikeFront = containerNo3LikeFront;
    }

    /**
     * invoiceIssuerIdGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceIssuerIdGreaterThan
     */
    public String getInvoiceIssuerIdGreaterThan() {
        return invoiceIssuerIdGreaterThan;
    }

    /**
     * invoiceIssuerIdGreaterThan のセッターメソッドです。
     * 
     * @param invoiceIssuerIdGreaterThan invoiceIssuerIdGreaterThan に設定する
     */
    public void setInvoiceIssuerIdGreaterThan(String invoiceIssuerIdGreaterThan) {
        this.invoiceIssuerIdGreaterThan = invoiceIssuerIdGreaterThan;
    }

    /**
     * invoiceIssuerIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssuerIdGreaterThanEqual
     */
    public String getInvoiceIssuerIdGreaterThanEqual() {
        return invoiceIssuerIdGreaterThanEqual;
    }

    /**
     * invoiceIssuerIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssuerIdGreaterThanEqual invoiceIssuerIdGreaterThanEqual に設定する
     */
    public void setInvoiceIssuerIdGreaterThanEqual(String invoiceIssuerIdGreaterThanEqual) {
        this.invoiceIssuerIdGreaterThanEqual = invoiceIssuerIdGreaterThanEqual;
    }

    /**
     * invoiceIssuerIdLessThan のゲッターメソッドです。
     * 
     * @return the invoiceIssuerIdLessThan
     */
    public String getInvoiceIssuerIdLessThan() {
        return invoiceIssuerIdLessThan;
    }

    /**
     * invoiceIssuerIdLessThan のセッターメソッドです。
     * 
     * @param invoiceIssuerIdLessThan invoiceIssuerIdLessThan に設定する
     */
    public void setInvoiceIssuerIdLessThan(String invoiceIssuerIdLessThan) {
        this.invoiceIssuerIdLessThan = invoiceIssuerIdLessThan;
    }

    /**
     * invoiceIssuerIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssuerIdLessThanEqual
     */
    public String getInvoiceIssuerIdLessThanEqual() {
        return invoiceIssuerIdLessThanEqual;
    }

    /**
     * invoiceIssuerIdLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssuerIdLessThanEqual invoiceIssuerIdLessThanEqual に設定する
     */
    public void setInvoiceIssuerIdLessThanEqual(String invoiceIssuerIdLessThanEqual) {
        this.invoiceIssuerIdLessThanEqual = invoiceIssuerIdLessThanEqual;
    }

    /**
     * invoiceIssuerIdLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceIssuerIdLikeFront
     */
    public String getInvoiceIssuerIdLikeFront() {
        return invoiceIssuerIdLikeFront;
    }

    /**
     * invoiceIssuerIdLikeFront のセッターメソッドです。
     * 
     * @param invoiceIssuerIdLikeFront invoiceIssuerIdLikeFront に設定する
     */
    public void setInvoiceIssuerIdLikeFront(String invoiceIssuerIdLikeFront) {
        this.invoiceIssuerIdLikeFront = invoiceIssuerIdLikeFront;
    }

    /**
     * invoiceIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNmGreaterThan
     */
    public String getInvoiceIssuerNmGreaterThan() {
        return invoiceIssuerNmGreaterThan;
    }

    /**
     * invoiceIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param invoiceIssuerNmGreaterThan invoiceIssuerNmGreaterThan に設定する
     */
    public void setInvoiceIssuerNmGreaterThan(String invoiceIssuerNmGreaterThan) {
        this.invoiceIssuerNmGreaterThan = invoiceIssuerNmGreaterThan;
    }

    /**
     * invoiceIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNmGreaterThanEqual
     */
    public String getInvoiceIssuerNmGreaterThanEqual() {
        return invoiceIssuerNmGreaterThanEqual;
    }

    /**
     * invoiceIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssuerNmGreaterThanEqual invoiceIssuerNmGreaterThanEqual に設定する
     */
    public void setInvoiceIssuerNmGreaterThanEqual(String invoiceIssuerNmGreaterThanEqual) {
        this.invoiceIssuerNmGreaterThanEqual = invoiceIssuerNmGreaterThanEqual;
    }

    /**
     * invoiceIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNmLessThan
     */
    public String getInvoiceIssuerNmLessThan() {
        return invoiceIssuerNmLessThan;
    }

    /**
     * invoiceIssuerNmLessThan のセッターメソッドです。
     * 
     * @param invoiceIssuerNmLessThan invoiceIssuerNmLessThan に設定する
     */
    public void setInvoiceIssuerNmLessThan(String invoiceIssuerNmLessThan) {
        this.invoiceIssuerNmLessThan = invoiceIssuerNmLessThan;
    }

    /**
     * invoiceIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNmLessThanEqual
     */
    public String getInvoiceIssuerNmLessThanEqual() {
        return invoiceIssuerNmLessThanEqual;
    }

    /**
     * invoiceIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceIssuerNmLessThanEqual invoiceIssuerNmLessThanEqual に設定する
     */
    public void setInvoiceIssuerNmLessThanEqual(String invoiceIssuerNmLessThanEqual) {
        this.invoiceIssuerNmLessThanEqual = invoiceIssuerNmLessThanEqual;
    }

    /**
     * invoiceIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceIssuerNmLikeFront
     */
    public String getInvoiceIssuerNmLikeFront() {
        return invoiceIssuerNmLikeFront;
    }

    /**
     * invoiceIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param invoiceIssuerNmLikeFront invoiceIssuerNmLikeFront に設定する
     */
    public void setInvoiceIssuerNmLikeFront(String invoiceIssuerNmLikeFront) {
        this.invoiceIssuerNmLikeFront = invoiceIssuerNmLikeFront;
    }

    /**
     * manualInvoiceIssueDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the manualInvoiceIssueDtGreaterThanEqual
     */
    public Date getManualInvoiceIssueDtGreaterThanEqual() {
        return manualInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * manualInvoiceIssueDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param manualInvoiceIssueDtGreaterThanEqual manualInvoiceIssueDtGreaterThanEqual に設定する
     */
    public void setManualInvoiceIssueDtGreaterThanEqual(Date manualInvoiceIssueDtGreaterThanEqual) {
        this.manualInvoiceIssueDtGreaterThanEqual = manualInvoiceIssueDtGreaterThanEqual;
    }

    /**
     * manualInvoiceIssueDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the manualInvoiceIssueDtLessThanEqual
     */
    public Date getManualInvoiceIssueDtLessThanEqual() {
        return manualInvoiceIssueDtLessThanEqual;
    }

    /**
     * manualInvoiceIssueDtLessThanEqual のセッターメソッドです。
     * 
     * @param manualInvoiceIssueDtLessThanEqual manualInvoiceIssueDtLessThanEqual に設定する
     */
    public void setManualInvoiceIssueDtLessThanEqual(Date manualInvoiceIssueDtLessThanEqual) {
        this.manualInvoiceIssueDtLessThanEqual = manualInvoiceIssueDtLessThanEqual;
    }

    /**
     * deleteFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the deleteFlgGreaterThan
     */
    public String getDeleteFlgGreaterThan() {
        return deleteFlgGreaterThan;
    }

    /**
     * deleteFlgGreaterThan のセッターメソッドです。
     * 
     * @param deleteFlgGreaterThan deleteFlgGreaterThan に設定する
     */
    public void setDeleteFlgGreaterThan(String deleteFlgGreaterThan) {
        this.deleteFlgGreaterThan = deleteFlgGreaterThan;
    }

    /**
     * deleteFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the deleteFlgGreaterThanEqual
     */
    public String getDeleteFlgGreaterThanEqual() {
        return deleteFlgGreaterThanEqual;
    }

    /**
     * deleteFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param deleteFlgGreaterThanEqual deleteFlgGreaterThanEqual に設定する
     */
    public void setDeleteFlgGreaterThanEqual(String deleteFlgGreaterThanEqual) {
        this.deleteFlgGreaterThanEqual = deleteFlgGreaterThanEqual;
    }

    /**
     * deleteFlgLessThan のゲッターメソッドです。
     * 
     * @return the deleteFlgLessThan
     */
    public String getDeleteFlgLessThan() {
        return deleteFlgLessThan;
    }

    /**
     * deleteFlgLessThan のセッターメソッドです。
     * 
     * @param deleteFlgLessThan deleteFlgLessThan に設定する
     */
    public void setDeleteFlgLessThan(String deleteFlgLessThan) {
        this.deleteFlgLessThan = deleteFlgLessThan;
    }

    /**
     * deleteFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the deleteFlgLessThanEqual
     */
    public String getDeleteFlgLessThanEqual() {
        return deleteFlgLessThanEqual;
    }

    /**
     * deleteFlgLessThanEqual のセッターメソッドです。
     * 
     * @param deleteFlgLessThanEqual deleteFlgLessThanEqual に設定する
     */
    public void setDeleteFlgLessThanEqual(String deleteFlgLessThanEqual) {
        this.deleteFlgLessThanEqual = deleteFlgLessThanEqual;
    }

    /**
     * deleteFlgLikeFront のゲッターメソッドです。
     * 
     * @return the deleteFlgLikeFront
     */
    public String getDeleteFlgLikeFront() {
        return deleteFlgLikeFront;
    }

    /**
     * deleteFlgLikeFront のセッターメソッドです。
     * 
     * @param deleteFlgLikeFront deleteFlgLikeFront に設定する
     */
    public void setDeleteFlgLikeFront(String deleteFlgLikeFront) {
        this.deleteFlgLikeFront = deleteFlgLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

}

