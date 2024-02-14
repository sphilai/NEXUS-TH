/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a domain class holding the search condition information of WebService BHT Eis Product.
 * <br />WebService BHT Eis Productの検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class WsBhtEisProductCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Printer possession COMPANY-CODE  , [ws2505] COMPANY CODE / COMPANY CODE
     * <br />プリンタ保有会社コード 、[ws2505]COMPANY CODE/会社コード
     */
    private String compCd;
    
    /**
     * PRINTER ID
     * <br />プリンタID
     */
    private String printerId;
    
    /**
     * CML PRINT NUM
     * <br />CML印刷枚数
     * UT300 ADD
     */
    private int cmlPrintNum;
    
    /**
     * [ws2501][ws2502][ws2508]Palletize Instr. No.
     * <br />梱包指示No
     */
    private String pltzInstrNo;
    
    /**
     * Mix tag
     * <br />Mixタグ
     */
    private String mixTag;
    
    /**
     * Mix tag printing flag
     * <br />Mixタグ印刷フラグ
     */
    private String printMixTagFlg;

    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * Error report output flag
     * <br />エラーレポート出力フラグ
     */
    private String errorReportFlg;
    
    /**
     * ERROR CREATE TIMESTAMP
     * <br />エラーレポート作成日時
     */
    private String errorReportDt;
    
    /**
     * ERROR CREATE TIMESTAMP (Timestamp)  
     * <br />エラーレポート作成日時(Timestamp)
     */
    private Timestamp errorReportTs;
    
    /**
     * [ws2510]MAIN-MARK list
     * <br />メインマークリスト
     */
    private List<String> mainMarkList;

    /**
     * CML printing flag
     * <br />CML印刷フラグ
     */
    private String cmlPrintFlg;
    
    // --------------------------------- ECA0027_WS_2501_Get Palletize Instruction ---------------------------------------
    // ---- Input parameter
    // ---- 入力パラメタ
    /*
     * [ws2501][ws2502][ws2508]Palletize Instr. No.
     * <br />梱包指示No
     */
    // private String pltzInstrNo;
    
    // ---- Work
    // ---- ワーク
    /**
     * [ws2501][ws2503][ws2508]SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * [ws2501]COLLATE METHOD TYPE
     * <br />照合方式区分
     */
    private String collateMethTyp;
    
    // --------------------------------- ECA0027_WS_2502_Create Inst Palletize -------------------------------------------
    // ---- Input parameter
    // ---- 入力パラメタ
    /*
     * [ws2501][ws2502][ws2508]PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    // private String pltzInstrNo;
    
    /**
     * [ws2502][ws2503][ws2510]PALLET NO
     * <br />パレットNO
     */
    private String palletNo;
    
    /**
     * [ws2502][ws2503][ws2508]ITEM NO LIST
     * <br />品目番号リスト
     */
    private List<? extends Ws2501ItemNoDomain> ws2502ItemNoList;
    
    /**
     * [ws2502][ws2503]OUTER CODE
     * <br />外装記号
     */
    private String outerCd;
    
    /**
     * [ws2502][ws2503]OUTER CODE FLG
     * <br />外装記号フラグ
     */
    private String outerCdFlg;
    
    /**
     * [ws2502][ws2503][ws2508]PACKAGE ITEM NO LIST
     * <br />包装材品目番号リスト
     */
    private List<? extends Ws2501PkgItemNoDomain> ws2502PkgItemNoList;
    
    /**
     * [ws2502][ws2503]WORK START TIME
     * <br />作業開始時間
     */
    private String workTimeStrt;
    
    /**
     * [ws2502][ws2503]WORK END TIME
     * <br />作業終了時間
     */
    private String workTimeEnd;
    
    /**
     * [ws2502][ws2503][ws2508]PRODUCTIVITY DATA INFOMATION LIST
     * <br />生産性データ情報リスト
     */
    private List<? extends Ws2501ProductivityDataInfoDomain> ws2502ProductivityDataInfoList;
    
    // ---- Internal variable
    // ---- 内部変数 
    /**
     * [ws2502]Ws2502 Internal variable (header) domain
     * <br />内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2502InternalVariableHdrDomain;
    
    /**
     * [ws2502]Ws2502 Internal variable (details) domain
     * <br />内部変数（明細）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2502InternalVariableDtlDomainList;
    
    /**
     * [ws2502]Ws2502 Internal variable (MIX ITEM NO) domain
     * <br />内部変数（MIX品目番号）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2502InternalVariableMixItemNoDomainList;
    
    // ---- Work
    // ---- ワーク
    /**
     * [ws2502][ws2503]MAX SEQUENCE
     * <br />枝番
     */
    private BigDecimal maxSeq;
    
    /**
     * [ws2502]RT USSE FLAG
     * <br />RT材フラグ
     */
    private String rtUseFlg;
    
    /*
     * [ws2502][ws2503][ws2510]VOLUME UNIT
     * <br />容積単位
     */
    // private String volumeUnit;
    
    /*
     * [ws2502][ws2503][ws2510]VOLUME
     * <br />容積
     */
    // private BigDecimal volume;
    
    /*
     * [ws2502][ws2503][ws2504]LENGTH UNIT
     * <br />長さ単位
     */
    // private String lengthUnit;
    
    /*
     * [ws2502][ws2503][ws2504]LENGTH(EXPORT PACKAGE)
     * <br />縦(輸出荷姿)
     * 
     */
    // private BigDecimal length;
    
    /*
     * [ws2502][ws2503][ws2504]WIDTH(EXPORT PACKAGE)
     * <br />横(輸出荷姿)
     */
    // private BigDecimal width;
    
    /*
     * [ws2502][ws2503][ws2504]HEIGHT(EXPORT PACKAGE)
     * <br />高さ(輸出荷姿)
     */
    // private BigDecimal height;
    
    /**
     * [ws2502][ws2503]VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnitPalletize;
    
    /**
     * [ws2502][ws2503]VOLUME (PALLETIZE)
     * <br />容積（パレタイズ）
     */
    private BigDecimal volumePalletize;
    
    /**
     * [ws2502][ws2503]LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnitPalletize;
    
    /**
     * [ws2502][ws2503]LENGTH(PALLETIZE)
     * <br />たて（パレタイズ）
     */
    private BigDecimal lengthPalletize;
    
    /**
     * [ws2502][ws2503]WIDTH (PALLETIZE)
     * <br />よこ（パレタイズ）
     */
    private BigDecimal widthPalletize;
    
    /**
     * [ws2502][ws2503]HEIGHT (PALLETIZE)
     * <br />高さ（パレタイズ）
     */
    private BigDecimal heightPalletize;
    
    // --------------------------------- ECA0027_WS_2503_Create Non Inst Palletize ---------------------------------------
    // ---- Input parameter
    // ---- 入力パラメタ
    /*
     * [ws2501][ws2503][ws2508]SHIPPER CODE
     * <br />荷主コード
     */
    // private String shipperCd;
    
    /**
     * [ws2503][ws2508]CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * [ws2503][ws2508]LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /*
     * [ws2503][ws2505][ws2508][ws2510]TRANSPORT CODE
     * <br />輸送手段コード
     */
    // private String trnsCd;
    
    /*
     * [ws2503][ws2504][ws2508]PLANT CODE
     * <br />製造部工場区分
     */
    // private String plntCd;

    /*
     * [ws2503][ws2504][ws2508]LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    // private String lgcyWhCd;
    
    /*
     * [ws2503][ws2504][ws2508]WAREHOUSE COMPANY CODE
     * <br />倉庫会社コード
     */
    // private String whCompCd;
    
    /**
     * [ws2503][ws2508]WAREHOUSE CODE
     * <br />倉庫コード
     */
    private String whCd;
    
    /**
     * [ws2503]NEXUS WAREHOUSE FLG
     * <br />NEXUS倉庫フラグ
     */
    private String nexusWhFlg;
    
    /*
     * [ws2502][ws2503][ws2510]PALLET NO
     * <br />パレットNO
     */
    // private String palletNo;
    
    /**
     * [ws2502][ws2503][ws2508]ITEM NO LIST
     * <br />品目番号リスト
     */
    private List<? extends Ws2501ItemNoDomain> ws2503ItemNoList;
    
    /*
     * [ws2502][ws2503]OUTER CODE
     * <br />外装記号
     */
    // private String outerCd;
    
    /*
     * [ws2502][ws2503]OUTER CODE FLG
     * <br />外装記号フラグ
     */
    // private String outerCdFlg;
    
    /**
     * [ws2502][ws2503][ws2508]PACKAGE ITEM NO LIST
     * <br />包装材品目番号リスト
     */
    private List<? extends Ws2501PkgItemNoDomain> ws2503PkgItemNoList;
    
    /*
     * [ws2502][ws2503]WORK START TIME
     * <br />作業開始時間
     */
    // private String workTimeStrt;
    
    /*
     * [ws2502][ws2503]WORK END TIME
     * <br />作業終了時間
     */
    // private String workTimeEnd;
    
    /**
     * [ws2502][ws2503][ws2508]PRODUCTIVITY DATA INFOMATION LIST
     * <br />生産性データ情報リスト
     */
    private List<? extends Ws2501ProductivityDataInfoDomain> ws2503ProductivityDataInfoList;
    
    // ---- Internal variable
    // ---- 内部変数 
    /**
     * [ws2503]Ws2503 Internal variable (header) domain
     * <br />内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2503InternalVariableHdrDomain;
    
    /**
     * [ws2503]Ws2503 Internal variable (details) domain
     * <br />内部変数（明細）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableDtlDomainList;
    
    /**
     * [ws2503]Ws2503 Internal variable (MIX ITEM NO) domain
     * <br />内部変数（MIX品目番号）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableMixItemNoDomainList;    
    
    // ---- Work
    // ---- ワーク
    /*
     * [ws2502][ws2503]MAX SEQUENCE
     * <br />枝番
     */
    // private BigDecimal maxSeq;
    
    /**
     * SHIP TO CODE
     * <br />送荷先コード
     */
    private String wkShipToCd;
    
    /**
     * [ws2503]LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String wkLgcyWhCd;
    
    /**
     * [ws2503]WAREHOUSE COMPANY CODE
     * <br />倉庫会社コード
     */
    private String wkWhCompCd;
    
    /**
     * [ws2503]WAREHOUSE CODE
     * <br />倉庫コード
     */
    private String wkWhCd;
    
    /**
     * [ws2503]CONSIGNEE CODE
     * <br />荷受人コード
     */
    private String wkConsigneeCompCd;
    
    /**
     * [ws2503][ws2508] Export-Receive-Order list
     * <br />輸出受注リスト
     */
    private List<? extends Ws2501TtExpRcvOdrDomain> ws2503TtExpRcvOdrList;
    
    /**
     * [ws2503][ws2508] Error order list
     * <br />受注エラーリスト
     */
    private List<String> errOdrList;
    
    /*
     * [ws2502][ws2503][ws2510]VOLUME UNIT
     * <br />容積単位
     */
    // private String volumeUnit;
    
    /*
     * [ws2502][ws2503][ws2510]VOLUME
     * <br />容積
     */
    // private BigDecimal volume;
    
    /*
     * [ws2502][ws2503][ws2504]LENGTH UNIT
     * <br />長さ単位
     */
    // private String lengthUnit;
    
    /*
     * [ws2502][ws2503][ws2504]LENGTH(EXPORT PACKAGE)
     * <br />縦(輸出荷姿)
     * 
     */
    // private BigDecimal length;
    
    /*
     * [ws2502][ws2503][ws2504]WIDTH(EXPORT PACKAGE)
     * <br />横(輸出荷姿)
     */
    // private BigDecimal width;
    
    /*
     * [ws2502][ws2503][ws2504]HEIGHT(EXPORT PACKAGE)
     * <br />高さ(輸出荷姿)
     */
    // private BigDecimal height;
    
    /*
     * [ws2502][ws2503]VOLUME UNIT
     * <br />容積単位
     */
    // private String volumeUnitPalletize;
    
    /*
     * [ws2502][ws2503]VOLUME (PALLETIZE)
     * <br />容積（パレタイズ）
     */
    // private BigDecimal volumePalletize;
    
    /*
     * [ws2502][ws2503]LENGTH UNIT
     * <br />長さ単位
     */
    // private String lengthUnitPalletize;
    
    /*
     * [ws2502][ws2503]LENGTH(PALLETIZE)
     * <br />たて（パレタイズ）
     */
    // private BigDecimal lengthPalletize;
    
    /*
     * [ws2502][ws2503]WIDTH (PALLETIZE)
     * <br />よこ（パレタイズ）
     */
    // private BigDecimal widthPalletize;
    
    /*
     * [ws2502][ws2503]HEIGHT (PALLETIZE)
     * <br />高さ（パレタイズ）
     */
    // private BigDecimal heightPalletize;
    
    // --------------------------------- ECA0027_WS_2504_Create E-RT Palletize -------------------------------------------

    /**
     * [ws2504]DSC-ID
     */
    private String dscId;

    /**
     * [ws2504] SHIP TO CODE (between bases)  
     * <br />送荷先コード(拠点間)
     */
    private String shipToCd;

    /**
     * [ws2504] PAYMENT TERMS
     * <br />支払条件
     */
    private String payTerms;

    /**
     * [ws2503][ws2504][ws2508] factory code
     * <br />工場コード
     */
    private String plntCd;

    /**
     * [ws2503][ws2504][ws2508] W/H Company CD (between bases)  
     * <br />倉庫会社コード(拠点間)
     */
    private String whCompCd;

    /**
     * [ws2503][ws2504][ws2508] W/H CD (between bases)
     * <br />倉庫コード(拠点間)
     */
    private String lgcyWhCd;

    /**
     * [ws2504] PRICE TERMS
     * <br />建値区分
     */
    private String priceTerms;

    /**
     * [ws2504] recommendation packing-style CD
     * <br />推奨荷姿コード
     */
    private String returnStyleCd;
    
    /**
     * [ws2504] Pallet/Carton Type
     * <br />パレット/カートン区分
     */
    private String pkgTyp;

    /**
     * [ws2504] CML creates
     * <br />CML作成数
     */
    private String cmlQty;

    /**
     * [ws2504] WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;

    /**
     * [ws2504] GROSS WEIGHT
     * <br />グロス重量
     */
    private String grossWeight;

    /**
     * [ws2502][ws2503][ws2504] LENGTH UNIT
     * <br />長さ単位
     */
    private String lengthUnit;

    /**
     * [ws2502][ws2503][ws2504] LENGTH
     * <br />縦
     */
    private BigDecimal length;

    /**
     * [ws2502][ws2503][ws2504] WIDTH
     * <br />横
     */
    private BigDecimal width;

    /**
     * [ws2502][ws2503][ws2504] HEIGHT
     * <br />高さ
     */
    private BigDecimal height;

    /**
     * [ws2504] list of PACKAGE ITEM NO->PACKAGE ITEM NO
     * <br />包装材品番リスト.包装材品番
     */
    private String pkgItemNo;

    /**
     * [ws2504] list of PACKAGE ITEM NO->PACKAGE QUANTITY
     * <br />包装材品番リスト.包装材数量
     */
    private String pkgItemQty;

    /**
     * [ws2504] list of PACKAGE ITEM NO->list of PACKAGE ITEM NO
     * <br />包装材品番リスト.包装材品番リスト
     */
    private List<String> pkgItemNoList;

    /**
     * [ws2504] list of PACKAGE ITEM NO->list of PACKAGE QUANTITY
     * <br />包装材品番リスト.包装材数量リスト
     */
    private List<String> pkgItemQtyList;
    

    /**
     * [ws2504] NET WEIGHT
     * <br />NET重量
     */
    private BigDecimal netWeight;
    
    /**
     * [ws2504] DUE DATE
     * <br />納期
     */
    private Date dueDt;
    
    /**
     * [ws2504] DUE DATE
     * <br />契約条件
     */
    private String tradeTerms;

    /**
     * [ws2504] PACKING WAREHOUSE COMPANY CODE
     * <br />梱包倉庫会社コード
     */
    private String packingWhCompCd;

    /**
     * [ws2504] PACKING WAREHOUSE CODE
     * <br />梱包倉庫コード
     */
    private String packingWhCd;

    /**
     * [ws2504] LAST TR RECEIVE DATE
     * <br />最終送荷書受入日
     */
    private Date lastTrRcvDt;
    
    /**
     * [ws2504] EXPORT REQUEST NO
     * <br />輸出依頼NO
     */
    private String expRequestNo;
    
    /**
     * [ws2504] Freight Res. Cd
     * <br />運賃支払いコード
     */
    private String freightResponsibleCd;

    /**
     * [ws2504] CONTAINER LOOSE TYPE
     * <br />コンテナルーズ区分
     */
    private String containerLooseTyp;
    

    /**
     * [ws2504] PACKAGE-ITEM-NO list
     * <br />包装材品目番号リスト
     */
    private List<? extends Ws2504PkgItemNoCriteriaDomain> pkgItemNoCriteriaList;
    
    // --------------------------------- ECA0027_WS_2505_Create PKG Spec -------------------------------------------------
    /**
     * [ws2505]OWNER COMPANY
     * <br />責任会社
     */
    private String ownerComp;

    /*
     * [ws2505]COMPANY CODE
     * <br />会社コード
     */
    // private String compCd;
    
    /**
     * [ws2505]ITEM NO GROUP
     * <br />品目番号グループ
     */
    private String itemNoGrp;
    
    /**
     * [ws2505]ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * [ws2505]PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * [ws2503][ws2505][ws2508][ws2510]TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * [ws2505]REVISION
     * <br />リビジョン
     */
    private BigDecimal rev;
    
    /**
     * [ws2505]ISOLATED PURCHASE
     * <br />層別（購入）
     */
    private String isltdPurchaseFlg;
    
    /**
     * [ws2505]ISOLATED STORAGE
     * <br />層別（入庫）
     */
    private String isltdStorageFlg;

    /**
     * [ws2505]ISOLATED SHIPPING
     * <br />層別（出荷）
     */
    private String isltdShippingFlg;
    
    /**
     * [ws2505]NEXT PROCESS
     * <br />次区
     */
    private String nProc;
    
    // --------------------------------- ECA0027_WS_2507_Print Case Mark Label -------------------------------------------
    
    // --------------------------------- ECA0027_WS_2508_Create Mixed Label ----------------------------------------------
    /*
     * [ws2501][ws2502][ws2508]PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    // private String pltzInstrNo;
    
    /*
     * [ws2501][ws2503][ws2508]SHIPPER CODE
     * <br />荷主コード
     */
    // private String shipperCd;
    
    /*
     * [ws2503][ws2508]CUSTOMER CODE
     * <br />得意先コード
     */
    // private String customerCd;
    
    /*
     * [ws2503][ws2508]LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    // private String lgcyShipTo;
    
    /*
     * [ws2503][ws2505][ws2508][ws2510]TRANSPORT CODE
     * <br />輸送手段コード
     */
    // private String trnsCd;
    
    /*
     * [ws2503][ws2504][ws2508]PLANT CODE
     * <br />製造部工場区分
     */
    // private String plntCd;
    
    /*
     * [ws2503][ws2504][ws2508]LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    // private String lgcyWhCd;
    
    /*
     * [ws2503][ws2504][ws2508]WAREHOUSE COMPANY CODE
     * <br />倉庫会社コード
     */
    // private String whCompCd;
    
    /*
     * [ws2503][ws2508]WAREHOUSE CODE
     * <br />倉庫コード
     */
    // private String whCd;
    
    /**
     * [ws2508] NEXUS W/H flag
     * <br />NEXUS倉庫フラグ
     */
    private String nxsStockFlg;
    
    /**
     * [ws2508]boxNo
     */
    private String boxNo;
    
    /**
     * [ws2503][ws2508] Export-Receive-Order list
     * <br />輸出受注リスト
     */
    private List<? extends Ws2501TtExpRcvOdrDomain> ws2508TtExpRcvOdrList;
    
    /**
     * [ws2502][ws2503][ws2508]ITEM NO LIST
     * <br />品目番号リスト
     */
    private List<? extends Ws2501ItemNoDomain> ws2508ItemNoList;
    
    /**
     * [ws2502][ws2503][ws2508]PACKAGE ITEM NO LIST
     * <br />包装材品目番号リスト
     */
    private List<? extends Ws2501PkgItemNoDomain> ws2508PkgItemNoList;
    
    /**
     * [ws2502][ws2503][ws2508]PRODUCTIVITY DATA INFOMATION LIST
     * <br />生産性データ情報リスト
     */
    private List<? extends Ws2501ProductivityDataInfoDomain> ws2508ProductivityDataInfoList;
    
    // ---- Internal variable
    // ---- 内部変数 
    /**
     * [ws2508]Ws2508 Internal variable (header) domain
     * <br />内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2508InternalVariableHdrDomain;
    
    /**
     * [ws2508]Ws2508 Internal variable (details) domain
     * <br />内部変数（明細）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2508InternalVariableDtlDomainList;
    
    /**
     * [ws2508]Ws2508 Internal variable (MIX ITEM NO) domain
     * <br />内部変数（MIX品目番号）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2508InternalVariableMixItemNoDomainList;
    
    

    /**
     * [ws2503] Palletize Item Receive Order
     * <br />パレタイズ対象品受注情報
     */
    private List<TtPltzItemOdrDomain> pltzItemOdrList;


    // --------------------------------- ECA0027_WS_2509_Print Mixed Label -----------------------------------------------
    
    // --------------------------------- ECA0027_WS_2510_Create X CML ----------------------------------------------------
    /**
     * [ws2502][ws2510]PALLET NO
     * <br />パレットNO
     */
    // private String palletNo;
    
    /**
     * [ws2510]CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /*
     * [ws2510]TRANSPORT CODE
     * <br />輸送手段コード
     */
    // private String trnsCd;
    
    /**
     * [ws2510]SHIP TO COMPANY CODE
     * <br />送荷先会社コード
     */
    private String shipToCompCd;
    
    /**
     * [ws2510]LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * [ws2510]CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /*
     * [ws2510]MAIN MARK LIST
     * <br />メインマークリスト
     */
    // private List<String> mainMarkList;
    
    /**
     * [ws2510]OUTER PACKAGE COM CODE
     * <br />外装会社コード
     */
    private String outerPkgComCd;
    
    /**
     * [ws2510]OUTER PACKAGE CODE
     * <br />外装コード
     */
    private String outerPkgCd;
    
    /**
     * [ws2510]CUR WAREHOUSE COMPANY CODE
     * <br />現在倉庫会社コード
     */
    private String curWhCompCd;
    
    /**
     * [ws2510]CUR WAREHOUSE CODE
     * <br />現在倉庫コード
     */
    private String curWhCd;
    
    /**
     * [ws2510]DENGER ITEM FLAG
     * <br />危険品フラグ
     */
    private String dngrItemFlg;
    
    /**
     * [ws2510]GROSS WEIGHT MAP
     * <br />グロス重量MAP
     */
    private Map<String, BigDecimal> grossWeightMap;
    
    /**
     * [ws2510]NET WEIGHT MAP
     * <br />ネット重量MAP
     */
    private Map<String, BigDecimal> netWeightMap;
    
    /**
     * [ws2502][ws2503][ws2510]VOLUME UNIT
     * <br />容積単位
     */
    private String volumeUnit;
    
    /**
     * [ws2502][ws2503][ws2510]VOLUME
     * <br />容積
     */
    private BigDecimal volume;
    
    // --------------------------------- ECA0027_WS_2511_Print X CML -----------------------------------------------------
    
    // --------------------------------- ECA0027_WS_2512_Print Case Mark Label(E-RT) -------------------------------------
    
    // --------------------------------- Constructor ------------------------------------------------------------------
    // --------------------------------- コンストラクタ ------------------------------------------------------------------
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsBhtEisProductCriteriaDomain() {
    }
    
    // --------------------------------- Getter / Setter -----------------------------------------------------------------
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
     * Getter method for printerId.
     *
     * @return the printerId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * Setter method for printerId.
     *
     * @param printerId Set for printerId
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * Getter method for cmlPrintNum.
     *
     * @return the cmlPrintNum
     */
    public int getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * Setter method for cmlPrintNum.
     *
     * @param cmlPrintNum Set for cmlPrintNum
     */
    public void setCmlPrintNum(int cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
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
     * Getter method for mixTag.
     *
     * @return the mixTag
     */
    public String getMixTag() {
        return mixTag;
    }

    /**
     * Setter method for mixTag.
     *
     * @param mixTag Set for mixTag
     */
    public void setMixTag(String mixTag) {
        this.mixTag = mixTag;
    }

    /**
     * Getter method for printMixTagFlg.
     *
     * @return the printMixTagFlg
     */
    public String getPrintMixTagFlg() {
        return printMixTagFlg;
    }

    /**
     * Setter method for printMixTagFlg.
     *
     * @param printMixTagFlg Set for printMixTagFlg
     */
    public void setPrintMixTagFlg(String printMixTagFlg) {
        this.printMixTagFlg = printMixTagFlg;
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
     * Getter method for errorReportFlg.
     *
     * @return the errorReportFlg
     */
    public String getErrorReportFlg() {
        return errorReportFlg;
    }

    /**
     * Setter method for errorReportFlg.
     *
     * @param errorReportFlg Set for errorReportFlg
     */
    public void setErrorReportFlg(String errorReportFlg) {
        this.errorReportFlg = errorReportFlg;
    }

    /**
     * Getter method for errorReportDt.
     *
     * @return the errorReportDt
     */
    public String getErrorReportDt() {
        return errorReportDt;
    }

    /**
     * Setter method for errorReportDt.
     *
     * @param errorReportDt Set for errorReportDt
     */
    public void setErrorReportDt(String errorReportDt) {
        this.errorReportDt = errorReportDt;
    }

    /**
     * Getter method for errorReportTs.
     *
     * @return the errorReportTs
     */
    public Timestamp getErrorReportTs() {
        return errorReportTs;
    }

    /**
     * Setter method for errorReportTs.
     *
     * @param errorReportTs Set for errorReportTs
     */
    public void setErrorReportTs(Timestamp errorReportTs) {
        this.errorReportTs = errorReportTs;
    }

    /**
     * Getter method for MainMarkList.
     *
     * @return the MainMarkList
     */
    public List<String> getMainMarkList() {
        return mainMarkList;
    }

    /**
     * Setter method for MainMarkList.
     *
     * @param mainMarkList Set for mainMarkList
     */
    public void setMainMarkList(List<String> mainMarkList) {
        this.mainMarkList = mainMarkList;
    }

    /**
     * Getter method for cmlPrintFlg.
     *
     * @return the cmlPrintFlg
     */
    public String getCmlPrintFlg() {
        return cmlPrintFlg;
    }

    /**
     * Setter method for cmlPrintFlg.
     *
     * @param cmlPrintFlg Set for cmlPrintFlg
     */
    public void setCmlPrintFlg(String cmlPrintFlg) {
        this.cmlPrintFlg = cmlPrintFlg;
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
     * Getter method for collateMethTyp.
     *
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * Setter method for collateMethTyp.
     *
     * @param collateMethTyp Set for collateMethTyp
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
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
     * Getter method for ws2502ItemNoList.
     *
     * @return the ws2502ItemNoList
     */
    public List<? extends Ws2501ItemNoDomain> getWs2502ItemNoList() {
        return ws2502ItemNoList;
    }

    /**
     * Setter method for ws2502ItemNoList.
     *
     * @param ws2502ItemNoList Set for ws2502ItemNoList
     */
    public void setWs2502ItemNoList(
        List<? extends Ws2501ItemNoDomain> ws2502ItemNoList) {
        this.ws2502ItemNoList = ws2502ItemNoList;
    }

    /**
     * Getter method for outerCd.
     *
     * @return the outerCd
     */
    public String getOuterCd() {
        return outerCd;
    }

    /**
     * Setter method for outerCd.
     *
     * @param outerCd Set for outerCd
     */
    public void setOuterCd(String outerCd) {
        this.outerCd = outerCd;
    }

    /**
     * Getter method for outerCdFlg.
     *
     * @return the outerCdFlg
     */
    public String getOuterCdFlg() {
        return outerCdFlg;
    }

    /**
     * Setter method for outerCdFlg.
     *
     * @param outerCdFlg Set for outerCdFlg
     */
    public void setOuterCdFlg(String outerCdFlg) {
        this.outerCdFlg = outerCdFlg;
    }

    /**
     * Getter method for ws2502pkgItemNoList.
     *
     * @return the ws2502pkgItemNoList
     */
    public List<? extends Ws2501PkgItemNoDomain> getWs2502PkgItemNoList() {
        return ws2502PkgItemNoList;
    }

    /**
     * Setter method for ws2502pkgItemNoList.
     *
     * @param ws2502PkgItemNoList Set for ws2502PkgItemNoList
     */
    public void setWs2502pkgItemNoList(
        List<? extends Ws2501PkgItemNoDomain> ws2502PkgItemNoList) {
        this.ws2502PkgItemNoList = ws2502PkgItemNoList;
    }

    /**
     * Getter method for workTimeStrt.
     *
     * @return the workTimeStrt
     */
    public String getWorkTimeStrt() {
        return workTimeStrt;
    }

    /**
     * Setter method for workTimeStrt.
     *
     * @param workTimeStrt Set for workTimeStrt
     */
    public void setWorkTimeStrt(String workTimeStrt) {
        this.workTimeStrt = workTimeStrt;
    }

    /**
     * Getter method for workTimeEnd.
     *
     * @return the workTimeEnd
     */
    public String getWorkTimeEnd() {
        return workTimeEnd;
    }

    /**
     * Setter method for workTimeEnd.
     *
     * @param workTimeEnd Set for workTimeEnd
     */
    public void setWorkTimeEnd(String workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    /**
     * Getter method for ws2502ProductivityDataInfoList.
     *
     * @return the ws2502ProductivityDataInfoList
     */
    public List<? extends Ws2501ProductivityDataInfoDomain> getWs2502ProductivityDataInfoList() {
        return ws2502ProductivityDataInfoList;
    }

    /**
     * Setter method for ws2502ProductivityDataInfoList.
     *
     * @param ws2502ProductivityDataInfoList Set for ws2502ProductivityDataInfoList
     */
    public void setWs2502ProductivityDataInfoList(
        List<? extends Ws2501ProductivityDataInfoDomain> ws2502ProductivityDataInfoList) {
        this.ws2502ProductivityDataInfoList = ws2502ProductivityDataInfoList;
    }

    /**
     * Getter method for maxSeq.
     *
     * @return the maxSeq
     */
    public BigDecimal getMaxSeq() {
        return maxSeq;
    }

    /**
     * Setter method for maxSeq.
     *
     * @param maxSeq Set for maxSeq
     */
    public void setMaxSeq(BigDecimal maxSeq) {
        this.maxSeq = maxSeq;
    }

    /**
     * Getter method for ws2502InternalVariableHdrDomain.
     *
     * @return the ws2502InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2502InternalVariableHdrDomain() {
        return ws2502InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2502InternalVariableHdrDomain.
     *
     * @param ws2502InternalVariableHdrDomain Set for ws2502InternalVariableHdrDomain
     */
    public void setWs2502InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2502InternalVariableHdrDomain) {
        this.ws2502InternalVariableHdrDomain = ws2502InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2502InternalVariableDtlDomainList.
     *
     * @return the ws2502InternalVariableDtlDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2502InternalVariableDtlDomainList() {
        return ws2502InternalVariableDtlDomainList;
    }

    /**
     * Setter method for ws2502InternalVariableDtlDomainList.
     *
     * @param ws2502InternalVariableDtlDomainList Set for ws2502InternalVariableDtlDomainList
     */
    public void setWs2502InternalVariableDtlDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2502InternalVariableDtlDomainList) {
        this.ws2502InternalVariableDtlDomainList = ws2502InternalVariableDtlDomainList;
    }

    /**
     * Getter method for ws2502InternalVariableMixItemNoDomainList.
     *
     * @return the ws2502InternalVariableMixItemNoDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2502InternalVariableMixItemNoDomainList() {
        return ws2502InternalVariableMixItemNoDomainList;
    }

    /**
     * Setter method for ws2502InternalVariableMixItemNoDomainList.
     *
     * @param ws2502InternalVariableMixItemNoDomainList Set for ws2502InternalVariableMixItemNoDomainList
     */
    public void setWs2502InternalVariableMixItemNoDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2502InternalVariableMixItemNoDomainList) {
        this.ws2502InternalVariableMixItemNoDomainList = ws2502InternalVariableMixItemNoDomainList;
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
     * Getter method for volumeUnitPalletize.
     *
     * @return the volumeUnitPalletize
     */
    public String getVolumeUnitPalletize() {
        return volumeUnitPalletize;
    }

    /**
     * Setter method for volumeUnitPalletize.
     *
     * @param volumeUnitPalletize Set for volumeUnitPalletize
     */
    public void setVolumeUnitPalletize(String volumeUnitPalletize) {
        this.volumeUnitPalletize = volumeUnitPalletize;
    }

    /**
     * Getter method for volumePalletize.
     *
     * @return the volumePalletize
     */
    public BigDecimal getVolumePalletize() {
        return volumePalletize;
    }

    /**
     * Setter method for volumePalletize.
     *
     * @param volumePalletize Set for volumePalletize
     */
    public void setVolumePalletize(BigDecimal volumePalletize) {
        this.volumePalletize = volumePalletize;
    }

    /**
     * Getter method for lengthUnitPalletize.
     *
     * @return the lengthUnitPalletize
     */
    public String getLengthUnitPalletize() {
        return lengthUnitPalletize;
    }

    /**
     * Setter method for lengthUnitPalletize.
     *
     * @param lengthUnitPalletize Set for lengthUnitPalletize
     */
    public void setLengthUnitPalletize(String lengthUnitPalletize) {
        this.lengthUnitPalletize = lengthUnitPalletize;
    }

    /**
     * Getter method for lengthPalletize.
     *
     * @return the lengthPalletize
     */
    public BigDecimal getLengthPalletize() {
        return lengthPalletize;
    }

    /**
     * Setter method for lengthPalletize.
     *
     * @param lengthPalletize Set for lengthPalletize
     */
    public void setLengthPalletize(BigDecimal lengthPalletize) {
        this.lengthPalletize = lengthPalletize;
    }

    /**
     * Getter method for widthPalletize.
     *
     * @return the widthPalletize
     */
    public BigDecimal getWidthPalletize() {
        return widthPalletize;
    }

    /**
     * Setter method for widthPalletize.
     *
     * @param widthPalletize Set for widthPalletize
     */
    public void setWidthPalletize(BigDecimal widthPalletize) {
        this.widthPalletize = widthPalletize;
    }

    /**
     * Getter method for heightPalletize.
     *
     * @return the heightPalletize
     */
    public BigDecimal getHeightPalletize() {
        return heightPalletize;
    }

    /**
     * Setter method for heightPalletize.
     *
     * @param heightPalletize Set for heightPalletize
     */
    public void setHeightPalletize(BigDecimal heightPalletize) {
        this.heightPalletize = heightPalletize;
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
     * Getter method for whCd.
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * Setter method for whCd.
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * Getter method for nexusWhFlg.
     *
     * @return the nexusWhFlg
     */
    public String getNexusWhFlg() {
        return nexusWhFlg;
    }

    /**
     * Setter method for nexusWhFlg.
     *
     * @param nexusWhFlg Set for nexusWhFlg
     */
    public void setNexusWhFlg(String nexusWhFlg) {
        this.nexusWhFlg = nexusWhFlg;
    }

    /**
     * Getter method for ws2503ItemNoList.
     *
     * @return the ws2503ItemNoList
     */
    public List<? extends Ws2501ItemNoDomain> getWs2503ItemNoList() {
        return ws2503ItemNoList;
    }

    /**
     * Setter method for ws2503ItemNoList.
     *
     * @param ws2503ItemNoList Set for ws2503ItemNoList
     */
    public void setWs2503ItemNoList(
        List<? extends Ws2501ItemNoDomain> ws2503ItemNoList) {
        this.ws2503ItemNoList = ws2503ItemNoList;
    }

    /**
     * Getter method for ws2503PkgItemNoList.
     *
     * @return the ws2503PkgItemNoList
     */
    public List<? extends Ws2501PkgItemNoDomain> getWs2503PkgItemNoList() {
        return ws2503PkgItemNoList;
    }

    /**
     * Setter method for ws2503PkgItemNoList.
     *
     * @param ws2503PkgItemNoList Set for ws2503PkgItemNoList
     */
    public void setWs2503PkgItemNoList(
        List<? extends Ws2501PkgItemNoDomain> ws2503PkgItemNoList) {
        this.ws2503PkgItemNoList = ws2503PkgItemNoList;
    }

    /**
     * Getter method for ws2503ProductivityDataInfoList.
     *
     * @return the ws2503ProductivityDataInfoList
     */
    public List<? extends Ws2501ProductivityDataInfoDomain> getWs2503ProductivityDataInfoList() {
        return ws2503ProductivityDataInfoList;
    }

    /**
     * Setter method for ws2503ProductivityDataInfoList.
     *
     * @param ws2503ProductivityDataInfoList Set for ws2503ProductivityDataInfoList
     */
    public void setWs2503ProductivityDataInfoList(
        List<? extends Ws2501ProductivityDataInfoDomain> ws2503ProductivityDataInfoList) {
        this.ws2503ProductivityDataInfoList = ws2503ProductivityDataInfoList;
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * Getter method for payTerms.
     *
     * @return the payTerms
     */
    public String getPayTerms() {
        return payTerms;
    }

    /**
     * Setter method for payTerms.
     *
     * @param payTerms Set for payTerms
     */
    public void setPayTerms(String payTerms) {
        this.payTerms = payTerms;
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
     * Getter method for whCompCd.
     *
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * Setter method for whCompCd.
     *
     * @param whCompCd Set for whCompCd
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
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
     * Getter method for priceTerms.
     *
     * @return the priceTerms
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * Setter method for priceTerms.
     *
     * @param priceTerms Set for priceTerms
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms;
    }

    /**
     * Getter method for returnStyleCd.
     *
     * @return the returnStyleCd
     */
    public String getReturnStyleCd() {
        return returnStyleCd;
    }

    /**
     * Setter method for returnStyleCd.
     *
     * @param returnStyleCd Set for returnStyleCd
     */
    public void setReturnStyleCd(String returnStyleCd) {
        this.returnStyleCd = returnStyleCd;
    }

    /**
     * <p>pkgTyp のゲッターメソッドです。</p>
     *
     * @return the pkgTyp
     */
    public String getPkgTyp() {
        return pkgTyp;
    }

    /**
     * <p>pkgTyp のセッターメソッドです。</p>
     *
     * @param pkgTyp pkgTyp に設定する
     */
    public void setPkgTyp(String pkgTyp) {
        this.pkgTyp = pkgTyp;
    }

    /**
     * Getter method for cmlQty.
     *
     * @return the cmlQty
     */
    public String getCmlQty() {
        return cmlQty;
    }

    /**
     * Setter method for cmlQty.
     *
     * @param cmlQty Set for cmlQty
     */
    public void setCmlQty(String cmlQty) {
        this.cmlQty = cmlQty;
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
     * Getter method for length.
     *
     * @return the length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param length Set for length
     */
    public void setLength(BigDecimal length) {
        this.length = length;
    }

    /**
     * Getter method for width.
     *
     * @return the width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Setter method for width.
     *
     * @param width Set for width
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * Getter method for height.
     *
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Setter method for height.
     *
     * @param height Set for height
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * Getter method for pkgItemNo.
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * Setter method for pkgItemNo.
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * Getter method for pkgItemQty.
     *
     * @return the pkgItemQty
     */
    public String getPkgItemQty() {
        return pkgItemQty;
    }

    /**
     * Setter method for pkgItemQty.
     *
     * @param pkgItemQty Set for pkgItemQty
     */
    public void setPkgItemQty(String pkgItemQty) {
        this.pkgItemQty = pkgItemQty;
    }

    /**
     * Getter method for pkgItemNoList.
     *
     * @return the pkgItemNoList
     */
    public List<String> getPkgItemNoList() {
        return pkgItemNoList;
    }

    /**
     * Setter method for pkgItemNoList.
     *
     * @param pkgItemNoList Set for pkgItemNoList
     */
    public void setPkgItemNoList(List<String> pkgItemNoList) {
        this.pkgItemNoList = pkgItemNoList;
    }

    /**
     * Getter method for pkgItemQtyList.
     *
     * @return the pkgItemQtyList
     */
    public List<String> getPkgItemQtyList() {
        return pkgItemQtyList;
    }

    /**
     * Setter method for pkgItemQtyList.
     *
     * @param pkgItemQtyList Set for pkgItemQtyList
     */
    public void setPkgItemQtyList(List<String> pkgItemQtyList) {
        this.pkgItemQtyList = pkgItemQtyList;
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
     * Getter method for tradeTerms.
     *
     * @return the tradeTerms
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * Setter method for tradeTerms.
     *
     * @param tradeTerms Set for tradeTerms
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
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
     * Getter method for lastTrRcvDt.
     *
     * @return the lastTrRcvDt
     */
    public Date getLastTrRcvDt() {
        return lastTrRcvDt;
    }

    /**
     * Setter method for lastTrRcvDt.
     *
     * @param lastTrRcvDt Set for lastTrRcvDt
     */
    public void setLastTrRcvDt(Date lastTrRcvDt) {
        this.lastTrRcvDt = lastTrRcvDt;
    }

    /**
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
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
     * Getter method for pkgItemNoCriteriaList.
     *
     * @return the pkgItemNoCriteriaList
     */
    public List<? extends Ws2504PkgItemNoCriteriaDomain> getPkgItemNoCriteriaList() {
        return pkgItemNoCriteriaList;
    }

    /**
     * Setter method for pkgItemNoCriteriaList.
     *
     * @param pkgItemNoCriteriaList Set for pkgItemNoCriteriaList
     */
    public void setPkgItemNoCriteriaList(
        List<? extends Ws2504PkgItemNoCriteriaDomain> pkgItemNoCriteriaList) {
        this.pkgItemNoCriteriaList = pkgItemNoCriteriaList;
    }

    /**
     * Getter method for ownerComp.
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * Setter method for ownerComp.
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * Getter method for itemNoGrp.
     *
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * Setter method for itemNoGrp.
     *
     * @param itemNoGrp Set for itemNoGrp
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
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
     * Getter method for rev.
     *
     * @return the rev
     */
    public BigDecimal getRev() {
        return rev;
    }

    /**
     * Setter method for rev.
     *
     * @param rev Set for rev
     */
    public void setRev(BigDecimal rev) {
        this.rev = rev;
    }

    /**
     * Getter method for isltdPurchaseFlg.
     *
     * @return the isltdPurchaseFlg
     */
    public String getIsltdPurchaseFlg() {
        return isltdPurchaseFlg;
    }

    /**
     * Setter method for isltdPurchaseFlg.
     *
     * @param isltdPurchaseFlg Set for isltdPurchaseFlg
     */
    public void setIsltdPurchaseFlg(String isltdPurchaseFlg) {
        this.isltdPurchaseFlg = isltdPurchaseFlg;
    }

    /**
     * Getter method for isltdStorageFlg.
     *
     * @return the isltdStorageFlg
     */
    public String getIsltdStorageFlg() {
        return isltdStorageFlg;
    }

    /**
     * Setter method for isltdStorageFlg.
     *
     * @param isltdStorageFlg Set for isltdStorageFlg
     */
    public void setIsltdStorageFlg(String isltdStorageFlg) {
        this.isltdStorageFlg = isltdStorageFlg;
    }

    /**
     * Getter method for isltdShippingFlg.
     *
     * @return the isltdShippingFlg
     */
    public String getIsltdShippingFlg() {
        return isltdShippingFlg;
    }

    /**
     * Setter method for isltdShippingFlg.
     *
     * @param isltdShippingFlg Set for isltdShippingFlg
     */
    public void setIsltdShippingFlg(String isltdShippingFlg) {
        this.isltdShippingFlg = isltdShippingFlg;
    }

    /**
     * Getter method for nProc.
     *
     * @return the nProc
     */
    public String getNProc() {
        return nProc;
    }

    /**
     * Setter method for nProc.
     *
     * @param proc Set for nProc
     */
    public void setNProc(String proc) {
        nProc = proc;
    }

    /**
     * Getter method for nxsStockFlg.
     *
     * @return the nxsStockFlg
     */
    public String getNxsStockFlg() {
        return nxsStockFlg;
    }

    /**
     * Setter method for nxsStockFlg.
     *
     * @param nxsStockFlg Set for nxsStockFlg
     */
    public void setNxsStockFlg(String nxsStockFlg) {
        this.nxsStockFlg = nxsStockFlg;
    }

    /**
     * Getter method for boxNo.
     *
     * @return the boxNo
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Setter method for boxNo.
     *
     * @param boxNo Set for boxNo
     */
    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }

    /**
     * Getter method for ws2508TtExpRcvOdrList.
     *
     * @return the ws2508TtExpRcvOdrList
     */
    public List<? extends Ws2501TtExpRcvOdrDomain> getWs2508TtExpRcvOdrList() {
        return ws2508TtExpRcvOdrList;
    }

    /**
     * Setter method for ws2508TtExpRcvOdrList.
     *
     * @param ws2508TtExpRcvOdrList Set for ws2508TtExpRcvOdrList
     */
    public void setWs2508TtExpRcvOdrList(
        List<? extends Ws2501TtExpRcvOdrDomain> ws2508TtExpRcvOdrList) {
        this.ws2508TtExpRcvOdrList = ws2508TtExpRcvOdrList;
    }

    /**
     * Getter method for ws2508ItemNoList.
     *
     * @return the ws2508ItemNoList
     */
    public List<? extends Ws2501ItemNoDomain> getWs2508ItemNoList() {
        return ws2508ItemNoList;
    }

    /**
     * Setter method for ws2508ItemNoList.
     *
     * @param ws2508ItemNoList Set for ws2508ItemNoList
     */
    public void setWs2508ItemNoList(
        List<? extends Ws2501ItemNoDomain> ws2508ItemNoList) {
        this.ws2508ItemNoList = ws2508ItemNoList;
    }

    /**
     * Getter method for ws2508PkgItemNoList.
     *
     * @return the ws2508PkgItemNoList
     */
    public List<? extends Ws2501PkgItemNoDomain> getWs2508PkgItemNoList() {
        return ws2508PkgItemNoList;
    }

    /**
     * Setter method for ws2508PkgItemNoList.
     *
     * @param ws2508PkgItemNoList Set for ws2508PkgItemNoList
     */
    public void setWs2508PkgItemNoList(
        List<? extends Ws2501PkgItemNoDomain> ws2508PkgItemNoList) {
        this.ws2508PkgItemNoList = ws2508PkgItemNoList;
    }

    /**
     * Getter method for ws2508ProductivityDataInfoList.
     *
     * @return the ws2508ProductivityDataInfoList
     */
    public List<? extends Ws2501ProductivityDataInfoDomain> getWs2508ProductivityDataInfoList() {
        return ws2508ProductivityDataInfoList;
    }

    /**
     * Setter method for ws2508ProductivityDataInfoList.
     *
     * @param ws2508ProductivityDataInfoList Set for ws2508ProductivityDataInfoList
     */
    public void setWs2508ProductivityDataInfoList(
        List<? extends Ws2501ProductivityDataInfoDomain> ws2508ProductivityDataInfoList) {
        this.ws2508ProductivityDataInfoList = ws2508ProductivityDataInfoList;
    }

    /**
     * Getter method for ws2508InternalVariableHdrDomain.
     *
     * @return the ws2508InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2508InternalVariableHdrDomain() {
        return ws2508InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2508InternalVariableHdrDomain.
     *
     * @param ws2508InternalVariableHdrDomain Set for ws2508InternalVariableHdrDomain
     */
    public void setWs2508InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2508InternalVariableHdrDomain) {
        this.ws2508InternalVariableHdrDomain = ws2508InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2508InternalVariableDtlDomainList.
     *
     * @return the ws2508InternalVariableDtlDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2508InternalVariableDtlDomainList() {
        return ws2508InternalVariableDtlDomainList;
    }

    /**
     * Setter method for ws2508InternalVariableDtlDomainList.
     *
     * @param ws2508InternalVariableDtlDomainList Set for ws2508InternalVariableDtlDomainList
     */
    public void setWs2508InternalVariableDtlDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2508InternalVariableDtlDomainList) {
        this.ws2508InternalVariableDtlDomainList = ws2508InternalVariableDtlDomainList;
    }

    /**
     * Getter method for ws2508InternalVariableMixItemNoDomainList.
     *
     * @return the ws2508InternalVariableMixItemNoDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2508InternalVariableMixItemNoDomainList() {
        return ws2508InternalVariableMixItemNoDomainList;
    }

    /**
     * Setter method for ws2508InternalVariableMixItemNoDomainList.
     *
     * @param ws2508InternalVariableMixItemNoDomainList Set for ws2508InternalVariableMixItemNoDomainList
     */
    public void setWs2508InternalVariableMixItemNoDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2508InternalVariableMixItemNoDomainList) {
        this.ws2508InternalVariableMixItemNoDomainList = ws2508InternalVariableMixItemNoDomainList;
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
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * Getter method for outerPkgComCd.
     *
     * @return the outerPkgComCd
     */
    public String getOuterPkgComCd() {
        return outerPkgComCd;
    }

    /**
     * Setter method for outerPkgComCd.
     *
     * @param outerPkgComCd Set for outerPkgComCd
     */
    public void setOuterPkgComCd(String outerPkgComCd) {
        this.outerPkgComCd = outerPkgComCd;
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
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
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
     * Getter method for grossWeightMap.
     *
     * @return the grossWeightMap
     */
    public Map<String, BigDecimal> getGrossWeightMap() {
        return grossWeightMap;
    }

    /**
     * Setter method for grossWeightMap.
     *
     * @param grossWeightMap Set for grossWeightMap
     */
    public void setGrossWeightMap(Map<String, BigDecimal> grossWeightMap) {
        this.grossWeightMap = grossWeightMap;
    }

    /**
     * Getter method for netWeightMap.
     *
     * @return the netWeightMap
     */
    public Map<String, BigDecimal> getNetWeightMap() {
        return netWeightMap;
    }

    /**
     * Setter method for netWeightMap.
     *
     * @param netWeightMap Set for netWeightMap
     */
    public void setNetWeightMap(Map<String, BigDecimal> netWeightMap) {
        this.netWeightMap = netWeightMap;
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
     * Getter method for ws2503InternalVariableHdrDomain.
     *
     * @return the ws2503InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2503InternalVariableHdrDomain() {
        return ws2503InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2503InternalVariableHdrDomain.
     *
     * @param ws2503InternalVariableHdrDomain Set for ws2503InternalVariableHdrDomain
     */
    public void setWs2503InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2503InternalVariableHdrDomain) {
        this.ws2503InternalVariableHdrDomain = ws2503InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2503InternalVariableDtlDomainList.
     *
     * @return the ws2503InternalVariableDtlDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2503InternalVariableDtlDomainList() {
        return ws2503InternalVariableDtlDomainList;
    }

    /**
     * Setter method for ws2503InternalVariableDtlDomainList.
     *
     * @param ws2503InternalVariableDtlDomainList Set for ws2503InternalVariableDtlDomainList
     */
    public void setWs2503InternalVariableDtlDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableDtlDomainList) {
        this.ws2503InternalVariableDtlDomainList = ws2503InternalVariableDtlDomainList;
    }

    /**
     * Getter method for wkShipToCd.
     *
     * @return the wkShipToCd
     */
    public String getWkShipToCd() {
        return wkShipToCd;
    }

    /**
     * Setter method for wkShipToCd.
     *
     * @param wkShipToCd Set for wkShipToCd
     */
    public void setWkShipToCd(String wkShipToCd) {
        this.wkShipToCd = wkShipToCd;
    }

    /**
     * Getter method for wkLgcyWhCd.
     *
     * @return the wkLgcyWhCd
     */
    public String getWkLgcyWhCd() {
        return wkLgcyWhCd;
    }

    /**
     * Setter method for wkLgcyWhCd.
     *
     * @param wkLgcyWhCd Set for wkLgcyWhCd
     */
    public void setWkLgcyWhCd(String wkLgcyWhCd) {
        this.wkLgcyWhCd = wkLgcyWhCd;
    }

    /**
     * Getter method for wkWhCompCd.
     *
     * @return the wkWhCompCd
     */
    public String getWkWhCompCd() {
        return wkWhCompCd;
    }

    /**
     * Setter method for wkWhCompCd.
     *
     * @param wkWhCompCd Set for wkWhCompCd
     */
    public void setWkWhCompCd(String wkWhCompCd) {
        this.wkWhCompCd = wkWhCompCd;
    }

    /**
     * Getter method for wkWhCd.
     *
     * @return the wkWhCd
     */
    public String getWkWhCd() {
        return wkWhCd;
    }

    /**
     * Setter method for wkWhCd.
     *
     * @param wkWhCd Set for wkWhCd
     */
    public void setWkWhCd(String wkWhCd) {
        this.wkWhCd = wkWhCd;
    }

    /**
     * Getter method for wkConsigneeCompCd.
     *
     * @return the wkConsigneeCompCd
     */
    public String getWkConsigneeCompCd() {
        return wkConsigneeCompCd;
    }

    /**
     * Setter method for wkConsigneeCompCd.
     *
     * @param wkConsigneeCompCd Set for wkConsigneeCompCd
     */
    public void setWkConsigneeCompCd(String wkConsigneeCompCd) {
        this.wkConsigneeCompCd = wkConsigneeCompCd;
    }

    /**
     * Getter method for ws2503InternalVariableMixItemNoDomainList.
     *
     * @return the ws2503InternalVariableMixItemNoDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2503InternalVariableMixItemNoDomainList() {
        return ws2503InternalVariableMixItemNoDomainList;
    }

    /**
     * Setter method for ws2503InternalVariableMixItemNoDomainList.
     *
     * @param ws2503InternalVariableMixItemNoDomainList Set for ws2503InternalVariableMixItemNoDomainList
     */
    public void setWs2503InternalVariableMixItemNoDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableMixItemNoDomainList) {
        this.ws2503InternalVariableMixItemNoDomainList = ws2503InternalVariableMixItemNoDomainList;
    }

    /**
     * Getter method for ws2503TtExpRcvOdrList.
     *
     * @return the ws2503TtExpRcvOdrList
     */
    public List<? extends Ws2501TtExpRcvOdrDomain> getWs2503TtExpRcvOdrList() {
        return ws2503TtExpRcvOdrList;
    }

    /**
     * Setter method for ws2503TtExpRcvOdrList.
     *
     * @param ws2503TtExpRcvOdrList Set for ws2503TtExpRcvOdrList
     */
    public void setWs2503TtExpRcvOdrList(
        List<? extends Ws2501TtExpRcvOdrDomain> ws2503TtExpRcvOdrList) {
        this.ws2503TtExpRcvOdrList = ws2503TtExpRcvOdrList;
    }
    
    /**
     * Getter method for errOdrList.
     *
     * @return the errOdrList
     */
    public List<String> getErrOdrList() {
        return errOdrList;
    }

    /**
     * Setter method for errOdrList.
     *
     * @param errOdrList Set for errOdrList
     */
    public void setErrOdrList(List<String> errOdrList) {
        this.errOdrList = errOdrList;
    }
    
    /**
     * Getter method for pltzItemOdrList.
     *
     * @return the pltzItemOdrList
     */
    public List<TtPltzItemOdrDomain> getTtPltzItemOdrList() {
        return pltzItemOdrList;
    }

    /**
     * Setter method for pltzItemOdrList.
     *
     * @param pltzItemOdrList Set for pltzItemOdrList
     */
    public void setTtPltzItemOdrList(List<TtPltzItemOdrDomain> pltzItemOdrList) {
        this.pltzItemOdrList = pltzItemOdrList;
    }
}
