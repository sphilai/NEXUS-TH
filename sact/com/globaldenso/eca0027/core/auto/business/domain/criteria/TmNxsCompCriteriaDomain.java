/*
 * PROJECT：eca0027
 * 
 * TmNxsComp の検索条件Domainクラス
 * テーブル概要：NEXUS Company Master/NEXUS会社原単位  Master to hold the information of the company/会社の情報を保持するMaster
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/02/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmNxsComp の検索条件Domainクラスです。<BR>
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
public class TmNxsCompCriteriaDomain extends AbstractDomain implements Serializable {

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
     * COMPANY CODE/会社コード（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMPANY CODE/会社コード（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMPANY CODE/会社コード（小なり）
     */
    private String compCdLessThan;

    /**
     * COMPANY CODE/会社コード（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMPANY CODE/会社コード（前方一致）
     */
    private String compCdLikeFront;

    /**
     * COMPANY NAME/会社名称（大なり）
     */
    private String compNmGreaterThan;

    /**
     * COMPANY NAME/会社名称（大なりイコール）
     */
    private String compNmGreaterThanEqual;

    /**
     * COMPANY NAME/会社名称（小なり）
     */
    private String compNmLessThan;

    /**
     * COMPANY NAME/会社名称（小なりイコール）
     */
    private String compNmLessThanEqual;

    /**
     * COMPANY NAME/会社名称（前方一致）
     */
    private String compNmLikeFront;

    /**
     * COMPANY NAME ABBREVIATION/会社略称（大なり）
     */
    private String compNmAbbGreaterThan;

    /**
     * COMPANY NAME ABBREVIATION/会社略称（大なりイコール）
     */
    private String compNmAbbGreaterThanEqual;

    /**
     * COMPANY NAME ABBREVIATION/会社略称（小なり）
     */
    private String compNmAbbLessThan;

    /**
     * COMPANY NAME ABBREVIATION/会社略称（小なりイコール）
     */
    private String compNmAbbLessThanEqual;

    /**
     * COMPANY NAME ABBREVIATION/会社略称（前方一致）
     */
    private String compNmAbbLikeFront;

    /**
     * COMPANY ADDRESS/会社住所（大なり）
     */
    private String compAddrGreaterThan;

    /**
     * COMPANY ADDRESS/会社住所（大なりイコール）
     */
    private String compAddrGreaterThanEqual;

    /**
     * COMPANY ADDRESS/会社住所（小なり）
     */
    private String compAddrLessThan;

    /**
     * COMPANY ADDRESS/会社住所（小なりイコール）
     */
    private String compAddrLessThanEqual;

    /**
     * COMPANY ADDRESS/会社住所（前方一致）
     */
    private String compAddrLikeFront;

    /**
     * COMPANY TEL/会社TEL（大なり）
     */
    private String compTelGreaterThan;

    /**
     * COMPANY TEL/会社TEL（大なりイコール）
     */
    private String compTelGreaterThanEqual;

    /**
     * COMPANY TEL/会社TEL（小なり）
     */
    private String compTelLessThan;

    /**
     * COMPANY TEL/会社TEL（小なりイコール）
     */
    private String compTelLessThanEqual;

    /**
     * COMPANY TEL/会社TEL（前方一致）
     */
    private String compTelLikeFront;

    /**
     * COMPANY FAX/会社FAX（大なり）
     */
    private String compFaxGreaterThan;

    /**
     * COMPANY FAX/会社FAX（大なりイコール）
     */
    private String compFaxGreaterThanEqual;

    /**
     * COMPANY FAX/会社FAX（小なり）
     */
    private String compFaxLessThan;

    /**
     * COMPANY FAX/会社FAX（小なりイコール）
     */
    private String compFaxLessThanEqual;

    /**
     * COMPANY FAX/会社FAX（前方一致）
     */
    private String compFaxLikeFront;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not（大なり）
     */
    private String dnBaseFlgGreaterThan;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not（大なりイコール）
     */
    private String dnBaseFlgGreaterThanEqual;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not（小なり）
     */
    private String dnBaseFlgLessThan;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not（小なりイコール）
     */
    private String dnBaseFlgLessThanEqual;

    /**
     * DN BASE FLAG/デンソー拠点フラグ  Y:DENSO, N:Not（前方一致）
     */
    private String dnBaseFlgLikeFront;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード（大なり）
     */
    private String hqCompCdGreaterThan;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード（大なりイコール）
     */
    private String hqCompCdGreaterThanEqual;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード（小なり）
     */
    private String hqCompCdLessThan;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード（小なりイコール）
     */
    private String hqCompCdLessThanEqual;

    /**
     * HEADQUARTER COMPANY CODE/統括会社コード（前方一致）
     */
    private String hqCompCdLikeFront;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not（大なり）
     */
    private String shipperFlgGreaterThan;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not（大なりイコール）
     */
    private String shipperFlgGreaterThanEqual;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not（小なり）
     */
    private String shipperFlgLessThan;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not（小なりイコール）
     */
    private String shipperFlgLessThanEqual;

    /**
     * SHIPPER FLAG/荷主フラグ  Y:Can specify the shipper, N:Not（前方一致）
     */
    private String shipperFlgLikeFront;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not（大なり）
     */
    private String customsBrokerFlgGreaterThan;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not（大なりイコール）
     */
    private String customsBrokerFlgGreaterThanEqual;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not（小なり）
     */
    private String customsBrokerFlgLessThan;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not（小なりイコール）
     */
    private String customsBrokerFlgLessThanEqual;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ  Y:Can specify the Customs Agent, N:Not（前方一致）
     */
    private String customsBrokerFlgLikeFront;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not（大なり）
     */
    private String carrierCompFlgGreaterThan;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not（大なりイコール）
     */
    private String carrierCompFlgGreaterThanEqual;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not（小なり）
     */
    private String carrierCompFlgLessThan;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not（小なりイコール）
     */
    private String carrierCompFlgLessThanEqual;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ  Y:Can specify the Carrier, N:Not（前方一致）
     */
    private String carrierCompFlgLikeFront;

    /**
     * COUNTRY CODE/国コード（大なり）
     */
    private String cntryCdGreaterThan;

    /**
     * COUNTRY CODE/国コード（大なりイコール）
     */
    private String cntryCdGreaterThanEqual;

    /**
     * COUNTRY CODE/国コード（小なり）
     */
    private String cntryCdLessThan;

    /**
     * COUNTRY CODE/国コード（小なりイコール）
     */
    private String cntryCdLessThanEqual;

    /**
     * COUNTRY CODE/国コード（前方一致）
     */
    private String cntryCdLikeFront;

    /**
     * LANGUAGE CODE/言語コード（大なり）
     */
    private String lngCdGreaterThan;

    /**
     * LANGUAGE CODE/言語コード（大なりイコール）
     */
    private String lngCdGreaterThanEqual;

    /**
     * LANGUAGE CODE/言語コード（小なり）
     */
    private String lngCdLessThan;

    /**
     * LANGUAGE CODE/言語コード（小なりイコール）
     */
    private String lngCdLessThanEqual;

    /**
     * LANGUAGE CODE/言語コード（前方一致）
     */
    private String lngCdLikeFront;

    /**
     * TIMEZONE ID/タイムゾーンID（大なり）
     */
    private String timezoneIdGreaterThan;

    /**
     * TIMEZONE ID/タイムゾーンID（大なりイコール）
     */
    private String timezoneIdGreaterThanEqual;

    /**
     * TIMEZONE ID/タイムゾーンID（小なり）
     */
    private String timezoneIdLessThan;

    /**
     * TIMEZONE ID/タイムゾーンID（小なりイコール）
     */
    private String timezoneIdLessThanEqual;

    /**
     * TIMEZONE ID/タイムゾーンID（前方一致）
     */
    private String timezoneIdLikeFront;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号（大なり）
     */
    private String itemNoGrpGreaterThan;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号（大なりイコール）
     */
    private String itemNoGrpGreaterThanEqual;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号（小なり）
     */
    private String itemNoGrpLessThan;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号（小なりイコール）
     */
    private String itemNoGrpLessThanEqual;

    /**
     * ITEM NO GROUP/品目番号グループ  D:DENSO item number system, DG:Denso item number similar system, L:each company its own item number/
D:デンソー品目番号体系、DG：デンソー品目番号類似体系、L：各社自社品目番号（前方一致）
     */
    private String itemNoGrpLikeFront;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused（大なり）
     */
    private String usePcSysTypGreaterThan;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused（大なりイコール）
     */
    private String usePcSysTypGreaterThanEqual;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused（小なり）
     */
    private String usePcSysTypLessThan;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused（小なりイコール）
     */
    private String usePcSysTypLessThanEqual;

    /**
     * USE PC SYSTEM TYPE/利用生管システム区分  A:GSCM
B:POPS
C:CIGMA
D:G-Standard
Z:Unused（前方一致）
     */
    private String usePcSysTypLikeFront;

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
     * LENGTH UNIT/長さ単位（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH UNIT/長さ単位（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH UNIT/長さ単位（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH UNIT/長さ単位（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH UNIT/長さ単位（前方一致）
     */
    private String lengthUnitLikeFront;

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
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not（大なり）
     */
    private String salesContractFlgGreaterThan;

    /**
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not（大なりイコール）
     */
    private String salesContractFlgGreaterThanEqual;

    /**
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not（小なり）
     */
    private String salesContractFlgLessThan;

    /**
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not（小なりイコール）
     */
    private String salesContractFlgLessThanEqual;

    /**
     * SALES CONTRACT FLAG/セールスコントラクト要否フラグ  Y:Consignee that issues the Sales Contract, N:Not（前方一致）
     */
    private String salesContractFlgLikeFront;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not（大なり）
     */
    private String intermediateFlgGreaterThan;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not（大なりイコール）
     */
    private String intermediateFlgGreaterThanEqual;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not（小なり）
     */
    private String intermediateFlgLessThan;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not（小なりイコール）
     */
    private String intermediateFlgLessThanEqual;

    /**
     * INTERMEDIATE FLAG/仲介会社フラグ  Y:Can specify the re-invoice broker, N:Not（前方一致）
     */
    private String intermediateFlgLikeFront;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1（大なり）
     */
    private String printCompNm1GreaterThan;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1（大なりイコール）
     */
    private String printCompNm1GreaterThanEqual;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1（小なり）
     */
    private String printCompNm1LessThan;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1（小なりイコール）
     */
    private String printCompNm1LessThanEqual;

    /**
     * PRINT COMPANY NAME 1/印刷用会社名称1（前方一致）
     */
    private String printCompNm1LikeFront;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2（大なり）
     */
    private String printCompNm2GreaterThan;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2（大なりイコール）
     */
    private String printCompNm2GreaterThanEqual;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2（小なり）
     */
    private String printCompNm2LessThan;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2（小なりイコール）
     */
    private String printCompNm2LessThanEqual;

    /**
     * PRINT COMPANY NAME 2/印刷用会社名称2（前方一致）
     */
    private String printCompNm2LikeFront;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1（大なり）
     */
    private String printCompAddr1GreaterThan;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1（大なりイコール）
     */
    private String printCompAddr1GreaterThanEqual;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1（小なり）
     */
    private String printCompAddr1LessThan;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1（小なりイコール）
     */
    private String printCompAddr1LessThanEqual;

    /**
     * PRINT COMPANY ADDRESS 1/印刷用会社住所1（前方一致）
     */
    private String printCompAddr1LikeFront;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2（大なり）
     */
    private String printCompAddr2GreaterThan;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2（大なりイコール）
     */
    private String printCompAddr2GreaterThanEqual;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2（小なり）
     */
    private String printCompAddr2LessThan;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2（小なりイコール）
     */
    private String printCompAddr2LessThanEqual;

    /**
     * PRINT COMPANY ADDRESS 2/印刷用会社住所2（前方一致）
     */
    private String printCompAddr2LikeFront;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3（大なり）
     */
    private String printCompAddr3GreaterThan;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3（大なりイコール）
     */
    private String printCompAddr3GreaterThanEqual;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3（小なり）
     */
    private String printCompAddr3LessThan;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3（小なりイコール）
     */
    private String printCompAddr3LessThanEqual;

    /**
     * PRINT COMPANY ADDRESS 3/印刷用会社住所3（前方一致）
     */
    private String printCompAddr3LikeFront;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4（大なり）
     */
    private String printCompAddr4GreaterThan;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4（大なりイコール）
     */
    private String printCompAddr4GreaterThanEqual;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4（小なり）
     */
    private String printCompAddr4LessThan;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4（小なりイコール）
     */
    private String printCompAddr4LessThanEqual;

    /**
     * PRINT COMPANY ADDRESS 4/印刷用会社住所4（前方一致）
     */
    private String printCompAddr4LikeFront;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード（大なり）
     */
    private String newLincSubsidiaryCdGreaterThan;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード（大なりイコール）
     */
    private String newLincSubsidiaryCdGreaterThanEqual;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード（小なり）
     */
    private String newLincSubsidiaryCdLessThan;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード（小なりイコール）
     */
    private String newLincSubsidiaryCdLessThanEqual;

    /**
     * NEW LINC SUBSIDIARY CODE/新LINC拠点コード（前方一致）
     */
    private String newLincSubsidiaryCdLikeFront;

    /**
     * SERVER ID/サーバID（大なり）
     */
    private String serverIdGreaterThan;

    /**
     * SERVER ID/サーバID（大なりイコール）
     */
    private String serverIdGreaterThanEqual;

    /**
     * SERVER ID/サーバID（小なり）
     */
    private String serverIdLessThan;

    /**
     * SERVER ID/サーバID（小なりイコール）
     */
    private String serverIdLessThanEqual;

    /**
     * SERVER ID/サーバID（前方一致）
     */
    private String serverIdLikeFront;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ（大なり）
     */
    private String bhtShippingFirmTypGreaterThan;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ（大なりイコール）
     */
    private String bhtShippingFirmTypGreaterThanEqual;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ（小なり）
     */
    private String bhtShippingFirmTypLessThan;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ（小なりイコール）
     */
    private String bhtShippingFirmTypLessThanEqual;

    /**
     * BHT SHIPPING CONFIRM TYPE/BHT出荷確認区分  1:By CML/Instr. (can choose), 2:Only by CML/
1:指示書単位/CML単位での実績計上(選択可), 2:CML単位での実績計上のみ（前方一致）
     */
    private String bhtShippingFirmTypLikeFront;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)（大なり）
     */
    private String roundPatternGreaterThan;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)（大なりイコール）
     */
    private String roundPatternGreaterThanEqual;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)（小なり）
     */
    private String roundPatternLessThan;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)（小なりイコール）
     */
    private String roundPatternLessThanEqual;

    /**
     * ROUND PATTERN/演算まとめパターン  U:round up(切り上げ),D:round down(切り捨て),O:round off(四捨五入)（前方一致）
     */
    private String roundPatternLikeFront;

    /**
     * TAX ID NO/納税者番号（大なり）
     */
    private String taxIdNoGreaterThan;

    /**
     * TAX ID NO/納税者番号（大なりイコール）
     */
    private String taxIdNoGreaterThanEqual;

    /**
     * TAX ID NO/納税者番号（小なり）
     */
    private String taxIdNoLessThan;

    /**
     * TAX ID NO/納税者番号（小なりイコール）
     */
    private String taxIdNoLessThanEqual;

    /**
     * TAX ID NO/納税者番号（前方一致）
     */
    private String taxIdNoLikeFront;

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
    public TmNxsCompCriteriaDomain() {
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
     * compNmGreaterThan のゲッターメソッドです。
     * 
     * @return the compNmGreaterThan
     */
    public String getCompNmGreaterThan() {
        return compNmGreaterThan;
    }

    /**
     * compNmGreaterThan のセッターメソッドです。
     * 
     * @param compNmGreaterThan compNmGreaterThan に設定する
     */
    public void setCompNmGreaterThan(String compNmGreaterThan) {
        this.compNmGreaterThan = compNmGreaterThan;
    }

    /**
     * compNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compNmGreaterThanEqual
     */
    public String getCompNmGreaterThanEqual() {
        return compNmGreaterThanEqual;
    }

    /**
     * compNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param compNmGreaterThanEqual compNmGreaterThanEqual に設定する
     */
    public void setCompNmGreaterThanEqual(String compNmGreaterThanEqual) {
        this.compNmGreaterThanEqual = compNmGreaterThanEqual;
    }

    /**
     * compNmLessThan のゲッターメソッドです。
     * 
     * @return the compNmLessThan
     */
    public String getCompNmLessThan() {
        return compNmLessThan;
    }

    /**
     * compNmLessThan のセッターメソッドです。
     * 
     * @param compNmLessThan compNmLessThan に設定する
     */
    public void setCompNmLessThan(String compNmLessThan) {
        this.compNmLessThan = compNmLessThan;
    }

    /**
     * compNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the compNmLessThanEqual
     */
    public String getCompNmLessThanEqual() {
        return compNmLessThanEqual;
    }

    /**
     * compNmLessThanEqual のセッターメソッドです。
     * 
     * @param compNmLessThanEqual compNmLessThanEqual に設定する
     */
    public void setCompNmLessThanEqual(String compNmLessThanEqual) {
        this.compNmLessThanEqual = compNmLessThanEqual;
    }

    /**
     * compNmLikeFront のゲッターメソッドです。
     * 
     * @return the compNmLikeFront
     */
    public String getCompNmLikeFront() {
        return compNmLikeFront;
    }

    /**
     * compNmLikeFront のセッターメソッドです。
     * 
     * @param compNmLikeFront compNmLikeFront に設定する
     */
    public void setCompNmLikeFront(String compNmLikeFront) {
        this.compNmLikeFront = compNmLikeFront;
    }

    /**
     * compNmAbbGreaterThan のゲッターメソッドです。
     * 
     * @return the compNmAbbGreaterThan
     */
    public String getCompNmAbbGreaterThan() {
        return compNmAbbGreaterThan;
    }

    /**
     * compNmAbbGreaterThan のセッターメソッドです。
     * 
     * @param compNmAbbGreaterThan compNmAbbGreaterThan に設定する
     */
    public void setCompNmAbbGreaterThan(String compNmAbbGreaterThan) {
        this.compNmAbbGreaterThan = compNmAbbGreaterThan;
    }

    /**
     * compNmAbbGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compNmAbbGreaterThanEqual
     */
    public String getCompNmAbbGreaterThanEqual() {
        return compNmAbbGreaterThanEqual;
    }

    /**
     * compNmAbbGreaterThanEqual のセッターメソッドです。
     * 
     * @param compNmAbbGreaterThanEqual compNmAbbGreaterThanEqual に設定する
     */
    public void setCompNmAbbGreaterThanEqual(String compNmAbbGreaterThanEqual) {
        this.compNmAbbGreaterThanEqual = compNmAbbGreaterThanEqual;
    }

    /**
     * compNmAbbLessThan のゲッターメソッドです。
     * 
     * @return the compNmAbbLessThan
     */
    public String getCompNmAbbLessThan() {
        return compNmAbbLessThan;
    }

    /**
     * compNmAbbLessThan のセッターメソッドです。
     * 
     * @param compNmAbbLessThan compNmAbbLessThan に設定する
     */
    public void setCompNmAbbLessThan(String compNmAbbLessThan) {
        this.compNmAbbLessThan = compNmAbbLessThan;
    }

    /**
     * compNmAbbLessThanEqual のゲッターメソッドです。
     * 
     * @return the compNmAbbLessThanEqual
     */
    public String getCompNmAbbLessThanEqual() {
        return compNmAbbLessThanEqual;
    }

    /**
     * compNmAbbLessThanEqual のセッターメソッドです。
     * 
     * @param compNmAbbLessThanEqual compNmAbbLessThanEqual に設定する
     */
    public void setCompNmAbbLessThanEqual(String compNmAbbLessThanEqual) {
        this.compNmAbbLessThanEqual = compNmAbbLessThanEqual;
    }

    /**
     * compNmAbbLikeFront のゲッターメソッドです。
     * 
     * @return the compNmAbbLikeFront
     */
    public String getCompNmAbbLikeFront() {
        return compNmAbbLikeFront;
    }

    /**
     * compNmAbbLikeFront のセッターメソッドです。
     * 
     * @param compNmAbbLikeFront compNmAbbLikeFront に設定する
     */
    public void setCompNmAbbLikeFront(String compNmAbbLikeFront) {
        this.compNmAbbLikeFront = compNmAbbLikeFront;
    }

    /**
     * compAddrGreaterThan のゲッターメソッドです。
     * 
     * @return the compAddrGreaterThan
     */
    public String getCompAddrGreaterThan() {
        return compAddrGreaterThan;
    }

    /**
     * compAddrGreaterThan のセッターメソッドです。
     * 
     * @param compAddrGreaterThan compAddrGreaterThan に設定する
     */
    public void setCompAddrGreaterThan(String compAddrGreaterThan) {
        this.compAddrGreaterThan = compAddrGreaterThan;
    }

    /**
     * compAddrGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compAddrGreaterThanEqual
     */
    public String getCompAddrGreaterThanEqual() {
        return compAddrGreaterThanEqual;
    }

    /**
     * compAddrGreaterThanEqual のセッターメソッドです。
     * 
     * @param compAddrGreaterThanEqual compAddrGreaterThanEqual に設定する
     */
    public void setCompAddrGreaterThanEqual(String compAddrGreaterThanEqual) {
        this.compAddrGreaterThanEqual = compAddrGreaterThanEqual;
    }

    /**
     * compAddrLessThan のゲッターメソッドです。
     * 
     * @return the compAddrLessThan
     */
    public String getCompAddrLessThan() {
        return compAddrLessThan;
    }

    /**
     * compAddrLessThan のセッターメソッドです。
     * 
     * @param compAddrLessThan compAddrLessThan に設定する
     */
    public void setCompAddrLessThan(String compAddrLessThan) {
        this.compAddrLessThan = compAddrLessThan;
    }

    /**
     * compAddrLessThanEqual のゲッターメソッドです。
     * 
     * @return the compAddrLessThanEqual
     */
    public String getCompAddrLessThanEqual() {
        return compAddrLessThanEqual;
    }

    /**
     * compAddrLessThanEqual のセッターメソッドです。
     * 
     * @param compAddrLessThanEqual compAddrLessThanEqual に設定する
     */
    public void setCompAddrLessThanEqual(String compAddrLessThanEqual) {
        this.compAddrLessThanEqual = compAddrLessThanEqual;
    }

    /**
     * compAddrLikeFront のゲッターメソッドです。
     * 
     * @return the compAddrLikeFront
     */
    public String getCompAddrLikeFront() {
        return compAddrLikeFront;
    }

    /**
     * compAddrLikeFront のセッターメソッドです。
     * 
     * @param compAddrLikeFront compAddrLikeFront に設定する
     */
    public void setCompAddrLikeFront(String compAddrLikeFront) {
        this.compAddrLikeFront = compAddrLikeFront;
    }

    /**
     * compTelGreaterThan のゲッターメソッドです。
     * 
     * @return the compTelGreaterThan
     */
    public String getCompTelGreaterThan() {
        return compTelGreaterThan;
    }

    /**
     * compTelGreaterThan のセッターメソッドです。
     * 
     * @param compTelGreaterThan compTelGreaterThan に設定する
     */
    public void setCompTelGreaterThan(String compTelGreaterThan) {
        this.compTelGreaterThan = compTelGreaterThan;
    }

    /**
     * compTelGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compTelGreaterThanEqual
     */
    public String getCompTelGreaterThanEqual() {
        return compTelGreaterThanEqual;
    }

    /**
     * compTelGreaterThanEqual のセッターメソッドです。
     * 
     * @param compTelGreaterThanEqual compTelGreaterThanEqual に設定する
     */
    public void setCompTelGreaterThanEqual(String compTelGreaterThanEqual) {
        this.compTelGreaterThanEqual = compTelGreaterThanEqual;
    }

    /**
     * compTelLessThan のゲッターメソッドです。
     * 
     * @return the compTelLessThan
     */
    public String getCompTelLessThan() {
        return compTelLessThan;
    }

    /**
     * compTelLessThan のセッターメソッドです。
     * 
     * @param compTelLessThan compTelLessThan に設定する
     */
    public void setCompTelLessThan(String compTelLessThan) {
        this.compTelLessThan = compTelLessThan;
    }

    /**
     * compTelLessThanEqual のゲッターメソッドです。
     * 
     * @return the compTelLessThanEqual
     */
    public String getCompTelLessThanEqual() {
        return compTelLessThanEqual;
    }

    /**
     * compTelLessThanEqual のセッターメソッドです。
     * 
     * @param compTelLessThanEqual compTelLessThanEqual に設定する
     */
    public void setCompTelLessThanEqual(String compTelLessThanEqual) {
        this.compTelLessThanEqual = compTelLessThanEqual;
    }

    /**
     * compTelLikeFront のゲッターメソッドです。
     * 
     * @return the compTelLikeFront
     */
    public String getCompTelLikeFront() {
        return compTelLikeFront;
    }

    /**
     * compTelLikeFront のセッターメソッドです。
     * 
     * @param compTelLikeFront compTelLikeFront に設定する
     */
    public void setCompTelLikeFront(String compTelLikeFront) {
        this.compTelLikeFront = compTelLikeFront;
    }

    /**
     * compFaxGreaterThan のゲッターメソッドです。
     * 
     * @return the compFaxGreaterThan
     */
    public String getCompFaxGreaterThan() {
        return compFaxGreaterThan;
    }

    /**
     * compFaxGreaterThan のセッターメソッドです。
     * 
     * @param compFaxGreaterThan compFaxGreaterThan に設定する
     */
    public void setCompFaxGreaterThan(String compFaxGreaterThan) {
        this.compFaxGreaterThan = compFaxGreaterThan;
    }

    /**
     * compFaxGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compFaxGreaterThanEqual
     */
    public String getCompFaxGreaterThanEqual() {
        return compFaxGreaterThanEqual;
    }

    /**
     * compFaxGreaterThanEqual のセッターメソッドです。
     * 
     * @param compFaxGreaterThanEqual compFaxGreaterThanEqual に設定する
     */
    public void setCompFaxGreaterThanEqual(String compFaxGreaterThanEqual) {
        this.compFaxGreaterThanEqual = compFaxGreaterThanEqual;
    }

    /**
     * compFaxLessThan のゲッターメソッドです。
     * 
     * @return the compFaxLessThan
     */
    public String getCompFaxLessThan() {
        return compFaxLessThan;
    }

    /**
     * compFaxLessThan のセッターメソッドです。
     * 
     * @param compFaxLessThan compFaxLessThan に設定する
     */
    public void setCompFaxLessThan(String compFaxLessThan) {
        this.compFaxLessThan = compFaxLessThan;
    }

    /**
     * compFaxLessThanEqual のゲッターメソッドです。
     * 
     * @return the compFaxLessThanEqual
     */
    public String getCompFaxLessThanEqual() {
        return compFaxLessThanEqual;
    }

    /**
     * compFaxLessThanEqual のセッターメソッドです。
     * 
     * @param compFaxLessThanEqual compFaxLessThanEqual に設定する
     */
    public void setCompFaxLessThanEqual(String compFaxLessThanEqual) {
        this.compFaxLessThanEqual = compFaxLessThanEqual;
    }

    /**
     * compFaxLikeFront のゲッターメソッドです。
     * 
     * @return the compFaxLikeFront
     */
    public String getCompFaxLikeFront() {
        return compFaxLikeFront;
    }

    /**
     * compFaxLikeFront のセッターメソッドです。
     * 
     * @param compFaxLikeFront compFaxLikeFront に設定する
     */
    public void setCompFaxLikeFront(String compFaxLikeFront) {
        this.compFaxLikeFront = compFaxLikeFront;
    }

    /**
     * dnBaseFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the dnBaseFlgGreaterThan
     */
    public String getDnBaseFlgGreaterThan() {
        return dnBaseFlgGreaterThan;
    }

    /**
     * dnBaseFlgGreaterThan のセッターメソッドです。
     * 
     * @param dnBaseFlgGreaterThan dnBaseFlgGreaterThan に設定する
     */
    public void setDnBaseFlgGreaterThan(String dnBaseFlgGreaterThan) {
        this.dnBaseFlgGreaterThan = dnBaseFlgGreaterThan;
    }

    /**
     * dnBaseFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dnBaseFlgGreaterThanEqual
     */
    public String getDnBaseFlgGreaterThanEqual() {
        return dnBaseFlgGreaterThanEqual;
    }

    /**
     * dnBaseFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param dnBaseFlgGreaterThanEqual dnBaseFlgGreaterThanEqual に設定する
     */
    public void setDnBaseFlgGreaterThanEqual(String dnBaseFlgGreaterThanEqual) {
        this.dnBaseFlgGreaterThanEqual = dnBaseFlgGreaterThanEqual;
    }

    /**
     * dnBaseFlgLessThan のゲッターメソッドです。
     * 
     * @return the dnBaseFlgLessThan
     */
    public String getDnBaseFlgLessThan() {
        return dnBaseFlgLessThan;
    }

    /**
     * dnBaseFlgLessThan のセッターメソッドです。
     * 
     * @param dnBaseFlgLessThan dnBaseFlgLessThan に設定する
     */
    public void setDnBaseFlgLessThan(String dnBaseFlgLessThan) {
        this.dnBaseFlgLessThan = dnBaseFlgLessThan;
    }

    /**
     * dnBaseFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the dnBaseFlgLessThanEqual
     */
    public String getDnBaseFlgLessThanEqual() {
        return dnBaseFlgLessThanEqual;
    }

    /**
     * dnBaseFlgLessThanEqual のセッターメソッドです。
     * 
     * @param dnBaseFlgLessThanEqual dnBaseFlgLessThanEqual に設定する
     */
    public void setDnBaseFlgLessThanEqual(String dnBaseFlgLessThanEqual) {
        this.dnBaseFlgLessThanEqual = dnBaseFlgLessThanEqual;
    }

    /**
     * dnBaseFlgLikeFront のゲッターメソッドです。
     * 
     * @return the dnBaseFlgLikeFront
     */
    public String getDnBaseFlgLikeFront() {
        return dnBaseFlgLikeFront;
    }

    /**
     * dnBaseFlgLikeFront のセッターメソッドです。
     * 
     * @param dnBaseFlgLikeFront dnBaseFlgLikeFront に設定する
     */
    public void setDnBaseFlgLikeFront(String dnBaseFlgLikeFront) {
        this.dnBaseFlgLikeFront = dnBaseFlgLikeFront;
    }

    /**
     * hqCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the hqCompCdGreaterThan
     */
    public String getHqCompCdGreaterThan() {
        return hqCompCdGreaterThan;
    }

    /**
     * hqCompCdGreaterThan のセッターメソッドです。
     * 
     * @param hqCompCdGreaterThan hqCompCdGreaterThan に設定する
     */
    public void setHqCompCdGreaterThan(String hqCompCdGreaterThan) {
        this.hqCompCdGreaterThan = hqCompCdGreaterThan;
    }

    /**
     * hqCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the hqCompCdGreaterThanEqual
     */
    public String getHqCompCdGreaterThanEqual() {
        return hqCompCdGreaterThanEqual;
    }

    /**
     * hqCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param hqCompCdGreaterThanEqual hqCompCdGreaterThanEqual に設定する
     */
    public void setHqCompCdGreaterThanEqual(String hqCompCdGreaterThanEqual) {
        this.hqCompCdGreaterThanEqual = hqCompCdGreaterThanEqual;
    }

    /**
     * hqCompCdLessThan のゲッターメソッドです。
     * 
     * @return the hqCompCdLessThan
     */
    public String getHqCompCdLessThan() {
        return hqCompCdLessThan;
    }

    /**
     * hqCompCdLessThan のセッターメソッドです。
     * 
     * @param hqCompCdLessThan hqCompCdLessThan に設定する
     */
    public void setHqCompCdLessThan(String hqCompCdLessThan) {
        this.hqCompCdLessThan = hqCompCdLessThan;
    }

    /**
     * hqCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the hqCompCdLessThanEqual
     */
    public String getHqCompCdLessThanEqual() {
        return hqCompCdLessThanEqual;
    }

    /**
     * hqCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param hqCompCdLessThanEqual hqCompCdLessThanEqual に設定する
     */
    public void setHqCompCdLessThanEqual(String hqCompCdLessThanEqual) {
        this.hqCompCdLessThanEqual = hqCompCdLessThanEqual;
    }

    /**
     * hqCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the hqCompCdLikeFront
     */
    public String getHqCompCdLikeFront() {
        return hqCompCdLikeFront;
    }

    /**
     * hqCompCdLikeFront のセッターメソッドです。
     * 
     * @param hqCompCdLikeFront hqCompCdLikeFront に設定する
     */
    public void setHqCompCdLikeFront(String hqCompCdLikeFront) {
        this.hqCompCdLikeFront = hqCompCdLikeFront;
    }

    /**
     * shipperFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperFlgGreaterThan
     */
    public String getShipperFlgGreaterThan() {
        return shipperFlgGreaterThan;
    }

    /**
     * shipperFlgGreaterThan のセッターメソッドです。
     * 
     * @param shipperFlgGreaterThan shipperFlgGreaterThan に設定する
     */
    public void setShipperFlgGreaterThan(String shipperFlgGreaterThan) {
        this.shipperFlgGreaterThan = shipperFlgGreaterThan;
    }

    /**
     * shipperFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperFlgGreaterThanEqual
     */
    public String getShipperFlgGreaterThanEqual() {
        return shipperFlgGreaterThanEqual;
    }

    /**
     * shipperFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperFlgGreaterThanEqual shipperFlgGreaterThanEqual に設定する
     */
    public void setShipperFlgGreaterThanEqual(String shipperFlgGreaterThanEqual) {
        this.shipperFlgGreaterThanEqual = shipperFlgGreaterThanEqual;
    }

    /**
     * shipperFlgLessThan のゲッターメソッドです。
     * 
     * @return the shipperFlgLessThan
     */
    public String getShipperFlgLessThan() {
        return shipperFlgLessThan;
    }

    /**
     * shipperFlgLessThan のセッターメソッドです。
     * 
     * @param shipperFlgLessThan shipperFlgLessThan に設定する
     */
    public void setShipperFlgLessThan(String shipperFlgLessThan) {
        this.shipperFlgLessThan = shipperFlgLessThan;
    }

    /**
     * shipperFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperFlgLessThanEqual
     */
    public String getShipperFlgLessThanEqual() {
        return shipperFlgLessThanEqual;
    }

    /**
     * shipperFlgLessThanEqual のセッターメソッドです。
     * 
     * @param shipperFlgLessThanEqual shipperFlgLessThanEqual に設定する
     */
    public void setShipperFlgLessThanEqual(String shipperFlgLessThanEqual) {
        this.shipperFlgLessThanEqual = shipperFlgLessThanEqual;
    }

    /**
     * shipperFlgLikeFront のゲッターメソッドです。
     * 
     * @return the shipperFlgLikeFront
     */
    public String getShipperFlgLikeFront() {
        return shipperFlgLikeFront;
    }

    /**
     * shipperFlgLikeFront のセッターメソッドです。
     * 
     * @param shipperFlgLikeFront shipperFlgLikeFront に設定する
     */
    public void setShipperFlgLikeFront(String shipperFlgLikeFront) {
        this.shipperFlgLikeFront = shipperFlgLikeFront;
    }

    /**
     * customsBrokerFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the customsBrokerFlgGreaterThan
     */
    public String getCustomsBrokerFlgGreaterThan() {
        return customsBrokerFlgGreaterThan;
    }

    /**
     * customsBrokerFlgGreaterThan のセッターメソッドです。
     * 
     * @param customsBrokerFlgGreaterThan customsBrokerFlgGreaterThan に設定する
     */
    public void setCustomsBrokerFlgGreaterThan(String customsBrokerFlgGreaterThan) {
        this.customsBrokerFlgGreaterThan = customsBrokerFlgGreaterThan;
    }

    /**
     * customsBrokerFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customsBrokerFlgGreaterThanEqual
     */
    public String getCustomsBrokerFlgGreaterThanEqual() {
        return customsBrokerFlgGreaterThanEqual;
    }

    /**
     * customsBrokerFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param customsBrokerFlgGreaterThanEqual customsBrokerFlgGreaterThanEqual に設定する
     */
    public void setCustomsBrokerFlgGreaterThanEqual(String customsBrokerFlgGreaterThanEqual) {
        this.customsBrokerFlgGreaterThanEqual = customsBrokerFlgGreaterThanEqual;
    }

    /**
     * customsBrokerFlgLessThan のゲッターメソッドです。
     * 
     * @return the customsBrokerFlgLessThan
     */
    public String getCustomsBrokerFlgLessThan() {
        return customsBrokerFlgLessThan;
    }

    /**
     * customsBrokerFlgLessThan のセッターメソッドです。
     * 
     * @param customsBrokerFlgLessThan customsBrokerFlgLessThan に設定する
     */
    public void setCustomsBrokerFlgLessThan(String customsBrokerFlgLessThan) {
        this.customsBrokerFlgLessThan = customsBrokerFlgLessThan;
    }

    /**
     * customsBrokerFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the customsBrokerFlgLessThanEqual
     */
    public String getCustomsBrokerFlgLessThanEqual() {
        return customsBrokerFlgLessThanEqual;
    }

    /**
     * customsBrokerFlgLessThanEqual のセッターメソッドです。
     * 
     * @param customsBrokerFlgLessThanEqual customsBrokerFlgLessThanEqual に設定する
     */
    public void setCustomsBrokerFlgLessThanEqual(String customsBrokerFlgLessThanEqual) {
        this.customsBrokerFlgLessThanEqual = customsBrokerFlgLessThanEqual;
    }

    /**
     * customsBrokerFlgLikeFront のゲッターメソッドです。
     * 
     * @return the customsBrokerFlgLikeFront
     */
    public String getCustomsBrokerFlgLikeFront() {
        return customsBrokerFlgLikeFront;
    }

    /**
     * customsBrokerFlgLikeFront のセッターメソッドです。
     * 
     * @param customsBrokerFlgLikeFront customsBrokerFlgLikeFront に設定する
     */
    public void setCustomsBrokerFlgLikeFront(String customsBrokerFlgLikeFront) {
        this.customsBrokerFlgLikeFront = customsBrokerFlgLikeFront;
    }

    /**
     * carrierCompFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the carrierCompFlgGreaterThan
     */
    public String getCarrierCompFlgGreaterThan() {
        return carrierCompFlgGreaterThan;
    }

    /**
     * carrierCompFlgGreaterThan のセッターメソッドです。
     * 
     * @param carrierCompFlgGreaterThan carrierCompFlgGreaterThan に設定する
     */
    public void setCarrierCompFlgGreaterThan(String carrierCompFlgGreaterThan) {
        this.carrierCompFlgGreaterThan = carrierCompFlgGreaterThan;
    }

    /**
     * carrierCompFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompFlgGreaterThanEqual
     */
    public String getCarrierCompFlgGreaterThanEqual() {
        return carrierCompFlgGreaterThanEqual;
    }

    /**
     * carrierCompFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param carrierCompFlgGreaterThanEqual carrierCompFlgGreaterThanEqual に設定する
     */
    public void setCarrierCompFlgGreaterThanEqual(String carrierCompFlgGreaterThanEqual) {
        this.carrierCompFlgGreaterThanEqual = carrierCompFlgGreaterThanEqual;
    }

    /**
     * carrierCompFlgLessThan のゲッターメソッドです。
     * 
     * @return the carrierCompFlgLessThan
     */
    public String getCarrierCompFlgLessThan() {
        return carrierCompFlgLessThan;
    }

    /**
     * carrierCompFlgLessThan のセッターメソッドです。
     * 
     * @param carrierCompFlgLessThan carrierCompFlgLessThan に設定する
     */
    public void setCarrierCompFlgLessThan(String carrierCompFlgLessThan) {
        this.carrierCompFlgLessThan = carrierCompFlgLessThan;
    }

    /**
     * carrierCompFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the carrierCompFlgLessThanEqual
     */
    public String getCarrierCompFlgLessThanEqual() {
        return carrierCompFlgLessThanEqual;
    }

    /**
     * carrierCompFlgLessThanEqual のセッターメソッドです。
     * 
     * @param carrierCompFlgLessThanEqual carrierCompFlgLessThanEqual に設定する
     */
    public void setCarrierCompFlgLessThanEqual(String carrierCompFlgLessThanEqual) {
        this.carrierCompFlgLessThanEqual = carrierCompFlgLessThanEqual;
    }

    /**
     * carrierCompFlgLikeFront のゲッターメソッドです。
     * 
     * @return the carrierCompFlgLikeFront
     */
    public String getCarrierCompFlgLikeFront() {
        return carrierCompFlgLikeFront;
    }

    /**
     * carrierCompFlgLikeFront のセッターメソッドです。
     * 
     * @param carrierCompFlgLikeFront carrierCompFlgLikeFront に設定する
     */
    public void setCarrierCompFlgLikeFront(String carrierCompFlgLikeFront) {
        this.carrierCompFlgLikeFront = carrierCompFlgLikeFront;
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
     * lngCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lngCdGreaterThan
     */
    public String getLngCdGreaterThan() {
        return lngCdGreaterThan;
    }

    /**
     * lngCdGreaterThan のセッターメソッドです。
     * 
     * @param lngCdGreaterThan lngCdGreaterThan に設定する
     */
    public void setLngCdGreaterThan(String lngCdGreaterThan) {
        this.lngCdGreaterThan = lngCdGreaterThan;
    }

    /**
     * lngCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lngCdGreaterThanEqual
     */
    public String getLngCdGreaterThanEqual() {
        return lngCdGreaterThanEqual;
    }

    /**
     * lngCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lngCdGreaterThanEqual lngCdGreaterThanEqual に設定する
     */
    public void setLngCdGreaterThanEqual(String lngCdGreaterThanEqual) {
        this.lngCdGreaterThanEqual = lngCdGreaterThanEqual;
    }

    /**
     * lngCdLessThan のゲッターメソッドです。
     * 
     * @return the lngCdLessThan
     */
    public String getLngCdLessThan() {
        return lngCdLessThan;
    }

    /**
     * lngCdLessThan のセッターメソッドです。
     * 
     * @param lngCdLessThan lngCdLessThan に設定する
     */
    public void setLngCdLessThan(String lngCdLessThan) {
        this.lngCdLessThan = lngCdLessThan;
    }

    /**
     * lngCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lngCdLessThanEqual
     */
    public String getLngCdLessThanEqual() {
        return lngCdLessThanEqual;
    }

    /**
     * lngCdLessThanEqual のセッターメソッドです。
     * 
     * @param lngCdLessThanEqual lngCdLessThanEqual に設定する
     */
    public void setLngCdLessThanEqual(String lngCdLessThanEqual) {
        this.lngCdLessThanEqual = lngCdLessThanEqual;
    }

    /**
     * lngCdLikeFront のゲッターメソッドです。
     * 
     * @return the lngCdLikeFront
     */
    public String getLngCdLikeFront() {
        return lngCdLikeFront;
    }

    /**
     * lngCdLikeFront のセッターメソッドです。
     * 
     * @param lngCdLikeFront lngCdLikeFront に設定する
     */
    public void setLngCdLikeFront(String lngCdLikeFront) {
        this.lngCdLikeFront = lngCdLikeFront;
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
     * itemNoGrpGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGrpGreaterThan
     */
    public String getItemNoGrpGreaterThan() {
        return itemNoGrpGreaterThan;
    }

    /**
     * itemNoGrpGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGrpGreaterThan itemNoGrpGreaterThan に設定する
     */
    public void setItemNoGrpGreaterThan(String itemNoGrpGreaterThan) {
        this.itemNoGrpGreaterThan = itemNoGrpGreaterThan;
    }

    /**
     * itemNoGrpGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGrpGreaterThanEqual
     */
    public String getItemNoGrpGreaterThanEqual() {
        return itemNoGrpGreaterThanEqual;
    }

    /**
     * itemNoGrpGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGrpGreaterThanEqual itemNoGrpGreaterThanEqual に設定する
     */
    public void setItemNoGrpGreaterThanEqual(String itemNoGrpGreaterThanEqual) {
        this.itemNoGrpGreaterThanEqual = itemNoGrpGreaterThanEqual;
    }

    /**
     * itemNoGrpLessThan のゲッターメソッドです。
     * 
     * @return the itemNoGrpLessThan
     */
    public String getItemNoGrpLessThan() {
        return itemNoGrpLessThan;
    }

    /**
     * itemNoGrpLessThan のセッターメソッドです。
     * 
     * @param itemNoGrpLessThan itemNoGrpLessThan に設定する
     */
    public void setItemNoGrpLessThan(String itemNoGrpLessThan) {
        this.itemNoGrpLessThan = itemNoGrpLessThan;
    }

    /**
     * itemNoGrpLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGrpLessThanEqual
     */
    public String getItemNoGrpLessThanEqual() {
        return itemNoGrpLessThanEqual;
    }

    /**
     * itemNoGrpLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoGrpLessThanEqual itemNoGrpLessThanEqual に設定する
     */
    public void setItemNoGrpLessThanEqual(String itemNoGrpLessThanEqual) {
        this.itemNoGrpLessThanEqual = itemNoGrpLessThanEqual;
    }

    /**
     * itemNoGrpLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoGrpLikeFront
     */
    public String getItemNoGrpLikeFront() {
        return itemNoGrpLikeFront;
    }

    /**
     * itemNoGrpLikeFront のセッターメソッドです。
     * 
     * @param itemNoGrpLikeFront itemNoGrpLikeFront に設定する
     */
    public void setItemNoGrpLikeFront(String itemNoGrpLikeFront) {
        this.itemNoGrpLikeFront = itemNoGrpLikeFront;
    }

    /**
     * usePcSysTypGreaterThan のゲッターメソッドです。
     * 
     * @return the usePcSysTypGreaterThan
     */
    public String getUsePcSysTypGreaterThan() {
        return usePcSysTypGreaterThan;
    }

    /**
     * usePcSysTypGreaterThan のセッターメソッドです。
     * 
     * @param usePcSysTypGreaterThan usePcSysTypGreaterThan に設定する
     */
    public void setUsePcSysTypGreaterThan(String usePcSysTypGreaterThan) {
        this.usePcSysTypGreaterThan = usePcSysTypGreaterThan;
    }

    /**
     * usePcSysTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the usePcSysTypGreaterThanEqual
     */
    public String getUsePcSysTypGreaterThanEqual() {
        return usePcSysTypGreaterThanEqual;
    }

    /**
     * usePcSysTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param usePcSysTypGreaterThanEqual usePcSysTypGreaterThanEqual に設定する
     */
    public void setUsePcSysTypGreaterThanEqual(String usePcSysTypGreaterThanEqual) {
        this.usePcSysTypGreaterThanEqual = usePcSysTypGreaterThanEqual;
    }

    /**
     * usePcSysTypLessThan のゲッターメソッドです。
     * 
     * @return the usePcSysTypLessThan
     */
    public String getUsePcSysTypLessThan() {
        return usePcSysTypLessThan;
    }

    /**
     * usePcSysTypLessThan のセッターメソッドです。
     * 
     * @param usePcSysTypLessThan usePcSysTypLessThan に設定する
     */
    public void setUsePcSysTypLessThan(String usePcSysTypLessThan) {
        this.usePcSysTypLessThan = usePcSysTypLessThan;
    }

    /**
     * usePcSysTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the usePcSysTypLessThanEqual
     */
    public String getUsePcSysTypLessThanEqual() {
        return usePcSysTypLessThanEqual;
    }

    /**
     * usePcSysTypLessThanEqual のセッターメソッドです。
     * 
     * @param usePcSysTypLessThanEqual usePcSysTypLessThanEqual に設定する
     */
    public void setUsePcSysTypLessThanEqual(String usePcSysTypLessThanEqual) {
        this.usePcSysTypLessThanEqual = usePcSysTypLessThanEqual;
    }

    /**
     * usePcSysTypLikeFront のゲッターメソッドです。
     * 
     * @return the usePcSysTypLikeFront
     */
    public String getUsePcSysTypLikeFront() {
        return usePcSysTypLikeFront;
    }

    /**
     * usePcSysTypLikeFront のセッターメソッドです。
     * 
     * @param usePcSysTypLikeFront usePcSysTypLikeFront に設定する
     */
    public void setUsePcSysTypLikeFront(String usePcSysTypLikeFront) {
        this.usePcSysTypLikeFront = usePcSysTypLikeFront;
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
     * salesContractFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the salesContractFlgGreaterThan
     */
    public String getSalesContractFlgGreaterThan() {
        return salesContractFlgGreaterThan;
    }

    /**
     * salesContractFlgGreaterThan のセッターメソッドです。
     * 
     * @param salesContractFlgGreaterThan salesContractFlgGreaterThan に設定する
     */
    public void setSalesContractFlgGreaterThan(String salesContractFlgGreaterThan) {
        this.salesContractFlgGreaterThan = salesContractFlgGreaterThan;
    }

    /**
     * salesContractFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the salesContractFlgGreaterThanEqual
     */
    public String getSalesContractFlgGreaterThanEqual() {
        return salesContractFlgGreaterThanEqual;
    }

    /**
     * salesContractFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param salesContractFlgGreaterThanEqual salesContractFlgGreaterThanEqual に設定する
     */
    public void setSalesContractFlgGreaterThanEqual(String salesContractFlgGreaterThanEqual) {
        this.salesContractFlgGreaterThanEqual = salesContractFlgGreaterThanEqual;
    }

    /**
     * salesContractFlgLessThan のゲッターメソッドです。
     * 
     * @return the salesContractFlgLessThan
     */
    public String getSalesContractFlgLessThan() {
        return salesContractFlgLessThan;
    }

    /**
     * salesContractFlgLessThan のセッターメソッドです。
     * 
     * @param salesContractFlgLessThan salesContractFlgLessThan に設定する
     */
    public void setSalesContractFlgLessThan(String salesContractFlgLessThan) {
        this.salesContractFlgLessThan = salesContractFlgLessThan;
    }

    /**
     * salesContractFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the salesContractFlgLessThanEqual
     */
    public String getSalesContractFlgLessThanEqual() {
        return salesContractFlgLessThanEqual;
    }

    /**
     * salesContractFlgLessThanEqual のセッターメソッドです。
     * 
     * @param salesContractFlgLessThanEqual salesContractFlgLessThanEqual に設定する
     */
    public void setSalesContractFlgLessThanEqual(String salesContractFlgLessThanEqual) {
        this.salesContractFlgLessThanEqual = salesContractFlgLessThanEqual;
    }

    /**
     * salesContractFlgLikeFront のゲッターメソッドです。
     * 
     * @return the salesContractFlgLikeFront
     */
    public String getSalesContractFlgLikeFront() {
        return salesContractFlgLikeFront;
    }

    /**
     * salesContractFlgLikeFront のセッターメソッドです。
     * 
     * @param salesContractFlgLikeFront salesContractFlgLikeFront に設定する
     */
    public void setSalesContractFlgLikeFront(String salesContractFlgLikeFront) {
        this.salesContractFlgLikeFront = salesContractFlgLikeFront;
    }

    /**
     * intermediateFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the intermediateFlgGreaterThan
     */
    public String getIntermediateFlgGreaterThan() {
        return intermediateFlgGreaterThan;
    }

    /**
     * intermediateFlgGreaterThan のセッターメソッドです。
     * 
     * @param intermediateFlgGreaterThan intermediateFlgGreaterThan に設定する
     */
    public void setIntermediateFlgGreaterThan(String intermediateFlgGreaterThan) {
        this.intermediateFlgGreaterThan = intermediateFlgGreaterThan;
    }

    /**
     * intermediateFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the intermediateFlgGreaterThanEqual
     */
    public String getIntermediateFlgGreaterThanEqual() {
        return intermediateFlgGreaterThanEqual;
    }

    /**
     * intermediateFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param intermediateFlgGreaterThanEqual intermediateFlgGreaterThanEqual に設定する
     */
    public void setIntermediateFlgGreaterThanEqual(String intermediateFlgGreaterThanEqual) {
        this.intermediateFlgGreaterThanEqual = intermediateFlgGreaterThanEqual;
    }

    /**
     * intermediateFlgLessThan のゲッターメソッドです。
     * 
     * @return the intermediateFlgLessThan
     */
    public String getIntermediateFlgLessThan() {
        return intermediateFlgLessThan;
    }

    /**
     * intermediateFlgLessThan のセッターメソッドです。
     * 
     * @param intermediateFlgLessThan intermediateFlgLessThan に設定する
     */
    public void setIntermediateFlgLessThan(String intermediateFlgLessThan) {
        this.intermediateFlgLessThan = intermediateFlgLessThan;
    }

    /**
     * intermediateFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the intermediateFlgLessThanEqual
     */
    public String getIntermediateFlgLessThanEqual() {
        return intermediateFlgLessThanEqual;
    }

    /**
     * intermediateFlgLessThanEqual のセッターメソッドです。
     * 
     * @param intermediateFlgLessThanEqual intermediateFlgLessThanEqual に設定する
     */
    public void setIntermediateFlgLessThanEqual(String intermediateFlgLessThanEqual) {
        this.intermediateFlgLessThanEqual = intermediateFlgLessThanEqual;
    }

    /**
     * intermediateFlgLikeFront のゲッターメソッドです。
     * 
     * @return the intermediateFlgLikeFront
     */
    public String getIntermediateFlgLikeFront() {
        return intermediateFlgLikeFront;
    }

    /**
     * intermediateFlgLikeFront のセッターメソッドです。
     * 
     * @param intermediateFlgLikeFront intermediateFlgLikeFront に設定する
     */
    public void setIntermediateFlgLikeFront(String intermediateFlgLikeFront) {
        this.intermediateFlgLikeFront = intermediateFlgLikeFront;
    }

    /**
     * printCompNm1GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompNm1GreaterThan
     */
    public String getPrintCompNm1GreaterThan() {
        return printCompNm1GreaterThan;
    }

    /**
     * printCompNm1GreaterThan のセッターメソッドです。
     * 
     * @param printCompNm1GreaterThan printCompNm1GreaterThan に設定する
     */
    public void setPrintCompNm1GreaterThan(String printCompNm1GreaterThan) {
        this.printCompNm1GreaterThan = printCompNm1GreaterThan;
    }

    /**
     * printCompNm1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompNm1GreaterThanEqual
     */
    public String getPrintCompNm1GreaterThanEqual() {
        return printCompNm1GreaterThanEqual;
    }

    /**
     * printCompNm1GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompNm1GreaterThanEqual printCompNm1GreaterThanEqual に設定する
     */
    public void setPrintCompNm1GreaterThanEqual(String printCompNm1GreaterThanEqual) {
        this.printCompNm1GreaterThanEqual = printCompNm1GreaterThanEqual;
    }

    /**
     * printCompNm1LessThan のゲッターメソッドです。
     * 
     * @return the printCompNm1LessThan
     */
    public String getPrintCompNm1LessThan() {
        return printCompNm1LessThan;
    }

    /**
     * printCompNm1LessThan のセッターメソッドです。
     * 
     * @param printCompNm1LessThan printCompNm1LessThan に設定する
     */
    public void setPrintCompNm1LessThan(String printCompNm1LessThan) {
        this.printCompNm1LessThan = printCompNm1LessThan;
    }

    /**
     * printCompNm1LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompNm1LessThanEqual
     */
    public String getPrintCompNm1LessThanEqual() {
        return printCompNm1LessThanEqual;
    }

    /**
     * printCompNm1LessThanEqual のセッターメソッドです。
     * 
     * @param printCompNm1LessThanEqual printCompNm1LessThanEqual に設定する
     */
    public void setPrintCompNm1LessThanEqual(String printCompNm1LessThanEqual) {
        this.printCompNm1LessThanEqual = printCompNm1LessThanEqual;
    }

    /**
     * printCompNm1LikeFront のゲッターメソッドです。
     * 
     * @return the printCompNm1LikeFront
     */
    public String getPrintCompNm1LikeFront() {
        return printCompNm1LikeFront;
    }

    /**
     * printCompNm1LikeFront のセッターメソッドです。
     * 
     * @param printCompNm1LikeFront printCompNm1LikeFront に設定する
     */
    public void setPrintCompNm1LikeFront(String printCompNm1LikeFront) {
        this.printCompNm1LikeFront = printCompNm1LikeFront;
    }

    /**
     * printCompNm2GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompNm2GreaterThan
     */
    public String getPrintCompNm2GreaterThan() {
        return printCompNm2GreaterThan;
    }

    /**
     * printCompNm2GreaterThan のセッターメソッドです。
     * 
     * @param printCompNm2GreaterThan printCompNm2GreaterThan に設定する
     */
    public void setPrintCompNm2GreaterThan(String printCompNm2GreaterThan) {
        this.printCompNm2GreaterThan = printCompNm2GreaterThan;
    }

    /**
     * printCompNm2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompNm2GreaterThanEqual
     */
    public String getPrintCompNm2GreaterThanEqual() {
        return printCompNm2GreaterThanEqual;
    }

    /**
     * printCompNm2GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompNm2GreaterThanEqual printCompNm2GreaterThanEqual に設定する
     */
    public void setPrintCompNm2GreaterThanEqual(String printCompNm2GreaterThanEqual) {
        this.printCompNm2GreaterThanEqual = printCompNm2GreaterThanEqual;
    }

    /**
     * printCompNm2LessThan のゲッターメソッドです。
     * 
     * @return the printCompNm2LessThan
     */
    public String getPrintCompNm2LessThan() {
        return printCompNm2LessThan;
    }

    /**
     * printCompNm2LessThan のセッターメソッドです。
     * 
     * @param printCompNm2LessThan printCompNm2LessThan に設定する
     */
    public void setPrintCompNm2LessThan(String printCompNm2LessThan) {
        this.printCompNm2LessThan = printCompNm2LessThan;
    }

    /**
     * printCompNm2LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompNm2LessThanEqual
     */
    public String getPrintCompNm2LessThanEqual() {
        return printCompNm2LessThanEqual;
    }

    /**
     * printCompNm2LessThanEqual のセッターメソッドです。
     * 
     * @param printCompNm2LessThanEqual printCompNm2LessThanEqual に設定する
     */
    public void setPrintCompNm2LessThanEqual(String printCompNm2LessThanEqual) {
        this.printCompNm2LessThanEqual = printCompNm2LessThanEqual;
    }

    /**
     * printCompNm2LikeFront のゲッターメソッドです。
     * 
     * @return the printCompNm2LikeFront
     */
    public String getPrintCompNm2LikeFront() {
        return printCompNm2LikeFront;
    }

    /**
     * printCompNm2LikeFront のセッターメソッドです。
     * 
     * @param printCompNm2LikeFront printCompNm2LikeFront に設定する
     */
    public void setPrintCompNm2LikeFront(String printCompNm2LikeFront) {
        this.printCompNm2LikeFront = printCompNm2LikeFront;
    }

    /**
     * printCompAddr1GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompAddr1GreaterThan
     */
    public String getPrintCompAddr1GreaterThan() {
        return printCompAddr1GreaterThan;
    }

    /**
     * printCompAddr1GreaterThan のセッターメソッドです。
     * 
     * @param printCompAddr1GreaterThan printCompAddr1GreaterThan に設定する
     */
    public void setPrintCompAddr1GreaterThan(String printCompAddr1GreaterThan) {
        this.printCompAddr1GreaterThan = printCompAddr1GreaterThan;
    }

    /**
     * printCompAddr1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr1GreaterThanEqual
     */
    public String getPrintCompAddr1GreaterThanEqual() {
        return printCompAddr1GreaterThanEqual;
    }

    /**
     * printCompAddr1GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr1GreaterThanEqual printCompAddr1GreaterThanEqual に設定する
     */
    public void setPrintCompAddr1GreaterThanEqual(String printCompAddr1GreaterThanEqual) {
        this.printCompAddr1GreaterThanEqual = printCompAddr1GreaterThanEqual;
    }

    /**
     * printCompAddr1LessThan のゲッターメソッドです。
     * 
     * @return the printCompAddr1LessThan
     */
    public String getPrintCompAddr1LessThan() {
        return printCompAddr1LessThan;
    }

    /**
     * printCompAddr1LessThan のセッターメソッドです。
     * 
     * @param printCompAddr1LessThan printCompAddr1LessThan に設定する
     */
    public void setPrintCompAddr1LessThan(String printCompAddr1LessThan) {
        this.printCompAddr1LessThan = printCompAddr1LessThan;
    }

    /**
     * printCompAddr1LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr1LessThanEqual
     */
    public String getPrintCompAddr1LessThanEqual() {
        return printCompAddr1LessThanEqual;
    }

    /**
     * printCompAddr1LessThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr1LessThanEqual printCompAddr1LessThanEqual に設定する
     */
    public void setPrintCompAddr1LessThanEqual(String printCompAddr1LessThanEqual) {
        this.printCompAddr1LessThanEqual = printCompAddr1LessThanEqual;
    }

    /**
     * printCompAddr1LikeFront のゲッターメソッドです。
     * 
     * @return the printCompAddr1LikeFront
     */
    public String getPrintCompAddr1LikeFront() {
        return printCompAddr1LikeFront;
    }

    /**
     * printCompAddr1LikeFront のセッターメソッドです。
     * 
     * @param printCompAddr1LikeFront printCompAddr1LikeFront に設定する
     */
    public void setPrintCompAddr1LikeFront(String printCompAddr1LikeFront) {
        this.printCompAddr1LikeFront = printCompAddr1LikeFront;
    }

    /**
     * printCompAddr2GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompAddr2GreaterThan
     */
    public String getPrintCompAddr2GreaterThan() {
        return printCompAddr2GreaterThan;
    }

    /**
     * printCompAddr2GreaterThan のセッターメソッドです。
     * 
     * @param printCompAddr2GreaterThan printCompAddr2GreaterThan に設定する
     */
    public void setPrintCompAddr2GreaterThan(String printCompAddr2GreaterThan) {
        this.printCompAddr2GreaterThan = printCompAddr2GreaterThan;
    }

    /**
     * printCompAddr2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr2GreaterThanEqual
     */
    public String getPrintCompAddr2GreaterThanEqual() {
        return printCompAddr2GreaterThanEqual;
    }

    /**
     * printCompAddr2GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr2GreaterThanEqual printCompAddr2GreaterThanEqual に設定する
     */
    public void setPrintCompAddr2GreaterThanEqual(String printCompAddr2GreaterThanEqual) {
        this.printCompAddr2GreaterThanEqual = printCompAddr2GreaterThanEqual;
    }

    /**
     * printCompAddr2LessThan のゲッターメソッドです。
     * 
     * @return the printCompAddr2LessThan
     */
    public String getPrintCompAddr2LessThan() {
        return printCompAddr2LessThan;
    }

    /**
     * printCompAddr2LessThan のセッターメソッドです。
     * 
     * @param printCompAddr2LessThan printCompAddr2LessThan に設定する
     */
    public void setPrintCompAddr2LessThan(String printCompAddr2LessThan) {
        this.printCompAddr2LessThan = printCompAddr2LessThan;
    }

    /**
     * printCompAddr2LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr2LessThanEqual
     */
    public String getPrintCompAddr2LessThanEqual() {
        return printCompAddr2LessThanEqual;
    }

    /**
     * printCompAddr2LessThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr2LessThanEqual printCompAddr2LessThanEqual に設定する
     */
    public void setPrintCompAddr2LessThanEqual(String printCompAddr2LessThanEqual) {
        this.printCompAddr2LessThanEqual = printCompAddr2LessThanEqual;
    }

    /**
     * printCompAddr2LikeFront のゲッターメソッドです。
     * 
     * @return the printCompAddr2LikeFront
     */
    public String getPrintCompAddr2LikeFront() {
        return printCompAddr2LikeFront;
    }

    /**
     * printCompAddr2LikeFront のセッターメソッドです。
     * 
     * @param printCompAddr2LikeFront printCompAddr2LikeFront に設定する
     */
    public void setPrintCompAddr2LikeFront(String printCompAddr2LikeFront) {
        this.printCompAddr2LikeFront = printCompAddr2LikeFront;
    }

    /**
     * printCompAddr3GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompAddr3GreaterThan
     */
    public String getPrintCompAddr3GreaterThan() {
        return printCompAddr3GreaterThan;
    }

    /**
     * printCompAddr3GreaterThan のセッターメソッドです。
     * 
     * @param printCompAddr3GreaterThan printCompAddr3GreaterThan に設定する
     */
    public void setPrintCompAddr3GreaterThan(String printCompAddr3GreaterThan) {
        this.printCompAddr3GreaterThan = printCompAddr3GreaterThan;
    }

    /**
     * printCompAddr3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr3GreaterThanEqual
     */
    public String getPrintCompAddr3GreaterThanEqual() {
        return printCompAddr3GreaterThanEqual;
    }

    /**
     * printCompAddr3GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr3GreaterThanEqual printCompAddr3GreaterThanEqual に設定する
     */
    public void setPrintCompAddr3GreaterThanEqual(String printCompAddr3GreaterThanEqual) {
        this.printCompAddr3GreaterThanEqual = printCompAddr3GreaterThanEqual;
    }

    /**
     * printCompAddr3LessThan のゲッターメソッドです。
     * 
     * @return the printCompAddr3LessThan
     */
    public String getPrintCompAddr3LessThan() {
        return printCompAddr3LessThan;
    }

    /**
     * printCompAddr3LessThan のセッターメソッドです。
     * 
     * @param printCompAddr3LessThan printCompAddr3LessThan に設定する
     */
    public void setPrintCompAddr3LessThan(String printCompAddr3LessThan) {
        this.printCompAddr3LessThan = printCompAddr3LessThan;
    }

    /**
     * printCompAddr3LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr3LessThanEqual
     */
    public String getPrintCompAddr3LessThanEqual() {
        return printCompAddr3LessThanEqual;
    }

    /**
     * printCompAddr3LessThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr3LessThanEqual printCompAddr3LessThanEqual に設定する
     */
    public void setPrintCompAddr3LessThanEqual(String printCompAddr3LessThanEqual) {
        this.printCompAddr3LessThanEqual = printCompAddr3LessThanEqual;
    }

    /**
     * printCompAddr3LikeFront のゲッターメソッドです。
     * 
     * @return the printCompAddr3LikeFront
     */
    public String getPrintCompAddr3LikeFront() {
        return printCompAddr3LikeFront;
    }

    /**
     * printCompAddr3LikeFront のセッターメソッドです。
     * 
     * @param printCompAddr3LikeFront printCompAddr3LikeFront に設定する
     */
    public void setPrintCompAddr3LikeFront(String printCompAddr3LikeFront) {
        this.printCompAddr3LikeFront = printCompAddr3LikeFront;
    }

    /**
     * printCompAddr4GreaterThan のゲッターメソッドです。
     * 
     * @return the printCompAddr4GreaterThan
     */
    public String getPrintCompAddr4GreaterThan() {
        return printCompAddr4GreaterThan;
    }

    /**
     * printCompAddr4GreaterThan のセッターメソッドです。
     * 
     * @param printCompAddr4GreaterThan printCompAddr4GreaterThan に設定する
     */
    public void setPrintCompAddr4GreaterThan(String printCompAddr4GreaterThan) {
        this.printCompAddr4GreaterThan = printCompAddr4GreaterThan;
    }

    /**
     * printCompAddr4GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr4GreaterThanEqual
     */
    public String getPrintCompAddr4GreaterThanEqual() {
        return printCompAddr4GreaterThanEqual;
    }

    /**
     * printCompAddr4GreaterThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr4GreaterThanEqual printCompAddr4GreaterThanEqual に設定する
     */
    public void setPrintCompAddr4GreaterThanEqual(String printCompAddr4GreaterThanEqual) {
        this.printCompAddr4GreaterThanEqual = printCompAddr4GreaterThanEqual;
    }

    /**
     * printCompAddr4LessThan のゲッターメソッドです。
     * 
     * @return the printCompAddr4LessThan
     */
    public String getPrintCompAddr4LessThan() {
        return printCompAddr4LessThan;
    }

    /**
     * printCompAddr4LessThan のセッターメソッドです。
     * 
     * @param printCompAddr4LessThan printCompAddr4LessThan に設定する
     */
    public void setPrintCompAddr4LessThan(String printCompAddr4LessThan) {
        this.printCompAddr4LessThan = printCompAddr4LessThan;
    }

    /**
     * printCompAddr4LessThanEqual のゲッターメソッドです。
     * 
     * @return the printCompAddr4LessThanEqual
     */
    public String getPrintCompAddr4LessThanEqual() {
        return printCompAddr4LessThanEqual;
    }

    /**
     * printCompAddr4LessThanEqual のセッターメソッドです。
     * 
     * @param printCompAddr4LessThanEqual printCompAddr4LessThanEqual に設定する
     */
    public void setPrintCompAddr4LessThanEqual(String printCompAddr4LessThanEqual) {
        this.printCompAddr4LessThanEqual = printCompAddr4LessThanEqual;
    }

    /**
     * printCompAddr4LikeFront のゲッターメソッドです。
     * 
     * @return the printCompAddr4LikeFront
     */
    public String getPrintCompAddr4LikeFront() {
        return printCompAddr4LikeFront;
    }

    /**
     * printCompAddr4LikeFront のセッターメソッドです。
     * 
     * @param printCompAddr4LikeFront printCompAddr4LikeFront に設定する
     */
    public void setPrintCompAddr4LikeFront(String printCompAddr4LikeFront) {
        this.printCompAddr4LikeFront = printCompAddr4LikeFront;
    }

    /**
     * newLincSubsidiaryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCdGreaterThan
     */
    public String getNewLincSubsidiaryCdGreaterThan() {
        return newLincSubsidiaryCdGreaterThan;
    }

    /**
     * newLincSubsidiaryCdGreaterThan のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCdGreaterThan newLincSubsidiaryCdGreaterThan に設定する
     */
    public void setNewLincSubsidiaryCdGreaterThan(String newLincSubsidiaryCdGreaterThan) {
        this.newLincSubsidiaryCdGreaterThan = newLincSubsidiaryCdGreaterThan;
    }

    /**
     * newLincSubsidiaryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCdGreaterThanEqual
     */
    public String getNewLincSubsidiaryCdGreaterThanEqual() {
        return newLincSubsidiaryCdGreaterThanEqual;
    }

    /**
     * newLincSubsidiaryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCdGreaterThanEqual newLincSubsidiaryCdGreaterThanEqual に設定する
     */
    public void setNewLincSubsidiaryCdGreaterThanEqual(String newLincSubsidiaryCdGreaterThanEqual) {
        this.newLincSubsidiaryCdGreaterThanEqual = newLincSubsidiaryCdGreaterThanEqual;
    }

    /**
     * newLincSubsidiaryCdLessThan のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCdLessThan
     */
    public String getNewLincSubsidiaryCdLessThan() {
        return newLincSubsidiaryCdLessThan;
    }

    /**
     * newLincSubsidiaryCdLessThan のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCdLessThan newLincSubsidiaryCdLessThan に設定する
     */
    public void setNewLincSubsidiaryCdLessThan(String newLincSubsidiaryCdLessThan) {
        this.newLincSubsidiaryCdLessThan = newLincSubsidiaryCdLessThan;
    }

    /**
     * newLincSubsidiaryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCdLessThanEqual
     */
    public String getNewLincSubsidiaryCdLessThanEqual() {
        return newLincSubsidiaryCdLessThanEqual;
    }

    /**
     * newLincSubsidiaryCdLessThanEqual のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCdLessThanEqual newLincSubsidiaryCdLessThanEqual に設定する
     */
    public void setNewLincSubsidiaryCdLessThanEqual(String newLincSubsidiaryCdLessThanEqual) {
        this.newLincSubsidiaryCdLessThanEqual = newLincSubsidiaryCdLessThanEqual;
    }

    /**
     * newLincSubsidiaryCdLikeFront のゲッターメソッドです。
     * 
     * @return the newLincSubsidiaryCdLikeFront
     */
    public String getNewLincSubsidiaryCdLikeFront() {
        return newLincSubsidiaryCdLikeFront;
    }

    /**
     * newLincSubsidiaryCdLikeFront のセッターメソッドです。
     * 
     * @param newLincSubsidiaryCdLikeFront newLincSubsidiaryCdLikeFront に設定する
     */
    public void setNewLincSubsidiaryCdLikeFront(String newLincSubsidiaryCdLikeFront) {
        this.newLincSubsidiaryCdLikeFront = newLincSubsidiaryCdLikeFront;
    }

    /**
     * serverIdGreaterThan のゲッターメソッドです。
     * 
     * @return the serverIdGreaterThan
     */
    public String getServerIdGreaterThan() {
        return serverIdGreaterThan;
    }

    /**
     * serverIdGreaterThan のセッターメソッドです。
     * 
     * @param serverIdGreaterThan serverIdGreaterThan に設定する
     */
    public void setServerIdGreaterThan(String serverIdGreaterThan) {
        this.serverIdGreaterThan = serverIdGreaterThan;
    }

    /**
     * serverIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the serverIdGreaterThanEqual
     */
    public String getServerIdGreaterThanEqual() {
        return serverIdGreaterThanEqual;
    }

    /**
     * serverIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param serverIdGreaterThanEqual serverIdGreaterThanEqual に設定する
     */
    public void setServerIdGreaterThanEqual(String serverIdGreaterThanEqual) {
        this.serverIdGreaterThanEqual = serverIdGreaterThanEqual;
    }

    /**
     * serverIdLessThan のゲッターメソッドです。
     * 
     * @return the serverIdLessThan
     */
    public String getServerIdLessThan() {
        return serverIdLessThan;
    }

    /**
     * serverIdLessThan のセッターメソッドです。
     * 
     * @param serverIdLessThan serverIdLessThan に設定する
     */
    public void setServerIdLessThan(String serverIdLessThan) {
        this.serverIdLessThan = serverIdLessThan;
    }

    /**
     * serverIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the serverIdLessThanEqual
     */
    public String getServerIdLessThanEqual() {
        return serverIdLessThanEqual;
    }

    /**
     * serverIdLessThanEqual のセッターメソッドです。
     * 
     * @param serverIdLessThanEqual serverIdLessThanEqual に設定する
     */
    public void setServerIdLessThanEqual(String serverIdLessThanEqual) {
        this.serverIdLessThanEqual = serverIdLessThanEqual;
    }

    /**
     * serverIdLikeFront のゲッターメソッドです。
     * 
     * @return the serverIdLikeFront
     */
    public String getServerIdLikeFront() {
        return serverIdLikeFront;
    }

    /**
     * serverIdLikeFront のセッターメソッドです。
     * 
     * @param serverIdLikeFront serverIdLikeFront に設定する
     */
    public void setServerIdLikeFront(String serverIdLikeFront) {
        this.serverIdLikeFront = serverIdLikeFront;
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
     * roundPatternGreaterThan のゲッターメソッドです。
     * 
     * @return the roundPatternGreaterThan
     */
    public String getRoundPatternGreaterThan() {
        return roundPatternGreaterThan;
    }

    /**
     * roundPatternGreaterThan のセッターメソッドです。
     * 
     * @param roundPatternGreaterThan roundPatternGreaterThan に設定する
     */
    public void setRoundPatternGreaterThan(String roundPatternGreaterThan) {
        this.roundPatternGreaterThan = roundPatternGreaterThan;
    }

    /**
     * roundPatternGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the roundPatternGreaterThanEqual
     */
    public String getRoundPatternGreaterThanEqual() {
        return roundPatternGreaterThanEqual;
    }

    /**
     * roundPatternGreaterThanEqual のセッターメソッドです。
     * 
     * @param roundPatternGreaterThanEqual roundPatternGreaterThanEqual に設定する
     */
    public void setRoundPatternGreaterThanEqual(String roundPatternGreaterThanEqual) {
        this.roundPatternGreaterThanEqual = roundPatternGreaterThanEqual;
    }

    /**
     * roundPatternLessThan のゲッターメソッドです。
     * 
     * @return the roundPatternLessThan
     */
    public String getRoundPatternLessThan() {
        return roundPatternLessThan;
    }

    /**
     * roundPatternLessThan のセッターメソッドです。
     * 
     * @param roundPatternLessThan roundPatternLessThan に設定する
     */
    public void setRoundPatternLessThan(String roundPatternLessThan) {
        this.roundPatternLessThan = roundPatternLessThan;
    }

    /**
     * roundPatternLessThanEqual のゲッターメソッドです。
     * 
     * @return the roundPatternLessThanEqual
     */
    public String getRoundPatternLessThanEqual() {
        return roundPatternLessThanEqual;
    }

    /**
     * roundPatternLessThanEqual のセッターメソッドです。
     * 
     * @param roundPatternLessThanEqual roundPatternLessThanEqual に設定する
     */
    public void setRoundPatternLessThanEqual(String roundPatternLessThanEqual) {
        this.roundPatternLessThanEqual = roundPatternLessThanEqual;
    }

    /**
     * roundPatternLikeFront のゲッターメソッドです。
     * 
     * @return the roundPatternLikeFront
     */
    public String getRoundPatternLikeFront() {
        return roundPatternLikeFront;
    }

    /**
     * roundPatternLikeFront のセッターメソッドです。
     * 
     * @param roundPatternLikeFront roundPatternLikeFront に設定する
     */
    public void setRoundPatternLikeFront(String roundPatternLikeFront) {
        this.roundPatternLikeFront = roundPatternLikeFront;
    }

    /**
     * taxIdNoGreaterThan のゲッターメソッドです。
     * 
     * @return the taxIdNoGreaterThan
     */
    public String getTaxIdNoGreaterThan() {
        return taxIdNoGreaterThan;
    }

    /**
     * taxIdNoGreaterThan のセッターメソッドです。
     * 
     * @param taxIdNoGreaterThan taxIdNoGreaterThan に設定する
     */
    public void setTaxIdNoGreaterThan(String taxIdNoGreaterThan) {
        this.taxIdNoGreaterThan = taxIdNoGreaterThan;
    }

    /**
     * taxIdNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the taxIdNoGreaterThanEqual
     */
    public String getTaxIdNoGreaterThanEqual() {
        return taxIdNoGreaterThanEqual;
    }

    /**
     * taxIdNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param taxIdNoGreaterThanEqual taxIdNoGreaterThanEqual に設定する
     */
    public void setTaxIdNoGreaterThanEqual(String taxIdNoGreaterThanEqual) {
        this.taxIdNoGreaterThanEqual = taxIdNoGreaterThanEqual;
    }

    /**
     * taxIdNoLessThan のゲッターメソッドです。
     * 
     * @return the taxIdNoLessThan
     */
    public String getTaxIdNoLessThan() {
        return taxIdNoLessThan;
    }

    /**
     * taxIdNoLessThan のセッターメソッドです。
     * 
     * @param taxIdNoLessThan taxIdNoLessThan に設定する
     */
    public void setTaxIdNoLessThan(String taxIdNoLessThan) {
        this.taxIdNoLessThan = taxIdNoLessThan;
    }

    /**
     * taxIdNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the taxIdNoLessThanEqual
     */
    public String getTaxIdNoLessThanEqual() {
        return taxIdNoLessThanEqual;
    }

    /**
     * taxIdNoLessThanEqual のセッターメソッドです。
     * 
     * @param taxIdNoLessThanEqual taxIdNoLessThanEqual に設定する
     */
    public void setTaxIdNoLessThanEqual(String taxIdNoLessThanEqual) {
        this.taxIdNoLessThanEqual = taxIdNoLessThanEqual;
    }

    /**
     * taxIdNoLikeFront のゲッターメソッドです。
     * 
     * @return the taxIdNoLikeFront
     */
    public String getTaxIdNoLikeFront() {
        return taxIdNoLikeFront;
    }

    /**
     * taxIdNoLikeFront のセッターメソッドです。
     * 
     * @param taxIdNoLikeFront taxIdNoLikeFront に設定する
     */
    public void setTaxIdNoLikeFront(String taxIdNoLikeFront) {
        this.taxIdNoLikeFront = taxIdNoLikeFront;
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

