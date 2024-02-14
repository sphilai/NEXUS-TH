/*
 * PROJECT：eca0027
 * 
 * TwInvItem の検索条件Domainクラス
 * テーブル概要：Invoice Item No Work/インボイス作成対象品目番号ワーク  Work table for creating Invoice created for information in Part shopping basket system/買い物かご方式でInvoice作成対象品番情報を作成するためのワークテーブル
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/09/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TwInvItem の検索条件Domainクラスです。<BR>
 * テーブル概要：Invoice Item No Work/インボイス作成対象品目番号ワーク  Work table for creating Invoice created for information in Part shopping basket system/買い物かご方式でInvoice作成対象品番情報を作成するためのワークテーブル<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/09/22 16:37:13<BR>
 * 
 * テーブル定義から2015/09/22に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12132 $
 */
public class TwInvItemCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * MAIN MARK/メインマーク
     */
    private String mainMark;

    /**
     * BRANCH/枝番
     */
    private BigDecimal brch;

    /**
     * SORT ORDER/並び順
     */
    private BigDecimal sortOdr;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * CML TYPE/ケースマーク区分  1:CIGMA, 2:E-RT, 3:Miscellaneous
     */
    private String cmlTyp;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not
     */
    private String rtFlg;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not
     */
    private String kitFlg;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。
     */
    private String customerItemNo;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。
     */
    private String itemNo;

    /**
     * PACKAGE CODE/包装区分
     */
    private String pkgCd;

    /**
     * ITEM DESCRIPTION/品目名称
     */
    private String itemDescription;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。
     */
    private String modelCd;

    /**
     * EXPORT REQUEST NO/輸出依頼NO
     */
    private String expRequestNo;

    /**
     * LINE NO/ライン番号
     */
    private BigDecimal lineNo;

    /**
     * KIT BRANCH/KIT品枝番
     */
    private BigDecimal kitBrch;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item
     */
    private String parFlg;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号
     */
    private String kitParItemNo;

    /**
     * CURRENCY CODE/通貨コード
     */
    private String currCd;

    /**
     * UNIT PRICE/単価
     */
    private BigDecimal unitPrice;

    /**
     * QUANTITY UNIT/数量単位
     */
    private String qtyUnit;

    /**
     * QUANTITY/数量
     */
    private BigDecimal qty;

    /**
     * WEIGHT UNIT/重量単位
     */
    private String weightUnit;

    /**
     * ITEM WEIGHT/製品重量
     */
    private BigDecimal itemWeight;

    /**
     * NET WEIGHT/ネット重量
     */
    private BigDecimal netWeight;

    /**
     * HS CODE/HSコード
     */
    private String hsCd;

    /**
     * ORIGIN COUNTRY CODE/原産国コード
     */
    private String originCntryCd;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not
     */
    private String free1RegFlg;

    /**
     * FREE 1 NAME/フリー1名称
     */
    private String free1Nm;

    /**
     * FREE 1 DETAIL/フリー1内容
     */
    private String free1Dtl;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free1OriginCntryFlg;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not
     */
    private String free2RegFlg;

    /**
     * FREE 2 NAME/フリー2名称
     */
    private String free2Nm;

    /**
     * FREE 2 DETAIL/フリー2内容
     */
    private String free2Dtl;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free2OriginCntryFlg;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not
     */
    private String free3RegFlg;

    /**
     * FREE 3 NAME/フリー3名称
     */
    private String free3Nm;

    /**
     * FREE 3 DETAIL/フリー3内容
     */
    private String free3Dtl;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not
     */
    private String free3OriginCntryFlg;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり
     */
    private String lengthUnit;

    /**
     * LENGTH/縦  RT材のみ入力あり
     */
    private BigDecimal length;

    /**
     * WIDTH/横  RT材のみ入力あり
     */
    private BigDecimal width;

    /**
     * HEIGHT/高さ  RT材のみ入力あり
     */
    private BigDecimal height;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。
     */
    private String grpNo1;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。
     */
    private String grpNo2;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not
     */
    private String removeFlg;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not
     */
    private String decisionFlg;

    /**
     * TEMP INVOICE NO/仮インボイスNO
     */
    private String tempInvoiceNo;

    /**
     * INVOICE NO/インボイスNO
     */
    private String invoiceNo;

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
     * DSC-ID/DSC-ID（大なり）
     */
    private String dscIdGreaterThan;

    /**
     * DSC-ID/DSC-ID（大なりイコール）
     */
    private String dscIdGreaterThanEqual;

    /**
     * DSC-ID/DSC-ID（小なり）
     */
    private String dscIdLessThan;

    /**
     * DSC-ID/DSC-ID（小なりイコール）
     */
    private String dscIdLessThanEqual;

    /**
     * DSC-ID/DSC-ID（前方一致）
     */
    private String dscIdLikeFront;

    /**
     * MAIN MARK/メインマーク（大なり）
     */
    private String mainMarkGreaterThan;

    /**
     * MAIN MARK/メインマーク（大なりイコール）
     */
    private String mainMarkGreaterThanEqual;

    /**
     * MAIN MARK/メインマーク（小なり）
     */
    private String mainMarkLessThan;

    /**
     * MAIN MARK/メインマーク（小なりイコール）
     */
    private String mainMarkLessThanEqual;

    /**
     * MAIN MARK/メインマーク（前方一致）
     */
    private String mainMarkLikeFront;

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
     * RT FLAG/RT材フラグ  Y:RT, N:Not（大なり）
     */
    private String rtFlgGreaterThan;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not（大なりイコール）
     */
    private String rtFlgGreaterThanEqual;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not（小なり）
     */
    private String rtFlgLessThan;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not（小なりイコール）
     */
    private String rtFlgLessThanEqual;

    /**
     * RT FLAG/RT材フラグ  Y:RT, N:Not（前方一致）
     */
    private String rtFlgLikeFront;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not（大なり）
     */
    private String kitFlgGreaterThan;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not（大なりイコール）
     */
    private String kitFlgGreaterThanEqual;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not（小なり）
     */
    private String kitFlgLessThan;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not（小なりイコール）
     */
    private String kitFlgLessThanEqual;

    /**
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not（前方一致）
     */
    private String kitFlgLikeFront;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。（大なり）
     */
    private String customerPoNoGreaterThan;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。（大なりイコール）
     */
    private String customerPoNoGreaterThanEqual;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。（小なり）
     */
    private String customerPoNoLessThan;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。（小なりイコール）
     */
    private String customerPoNoLessThanEqual;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。（前方一致）
     */
    private String customerPoNoLikeFront;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。（大なり）
     */
    private String customerItemNoGreaterThan;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。（大なりイコール）
     */
    private String customerItemNoGreaterThanEqual;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。（小なり）
     */
    private String customerItemNoLessThan;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。（小なりイコール）
     */
    private String customerItemNoLessThanEqual;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。（前方一致）
     */
    private String customerItemNoLikeFront;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM NO/品目番号  製部品の場合は品目番号が入る。包装材の場合は、包装材品目番号が入る。（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PACKAGE CODE/包装区分（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PACKAGE CODE/包装区分（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PACKAGE CODE/包装区分（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PACKAGE CODE/包装区分（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PACKAGE CODE/包装区分（前方一致）
     */
    private String pkgCdLikeFront;

    /**
     * ITEM DESCRIPTION/品目名称（大なり）
     */
    private String itemDescriptionGreaterThan;

    /**
     * ITEM DESCRIPTION/品目名称（大なりイコール）
     */
    private String itemDescriptionGreaterThanEqual;

    /**
     * ITEM DESCRIPTION/品目名称（小なり）
     */
    private String itemDescriptionLessThan;

    /**
     * ITEM DESCRIPTION/品目名称（小なりイコール）
     */
    private String itemDescriptionLessThanEqual;

    /**
     * ITEM DESCRIPTION/品目名称（前方一致）
     */
    private String itemDescriptionLikeFront;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。（大なり）
     */
    private String modelCdGreaterThan;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。（大なりイコール）
     */
    private String modelCdGreaterThanEqual;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。（小なり）
     */
    private String modelCdLessThan;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。（小なりイコール）
     */
    private String modelCdLessThanEqual;

    /**
     * MODEL CODE/型式コード  F,Eの場合のみ入る。（前方一致）
     */
    private String modelCdLikeFront;

    /**
     * EXPORT REQUEST NO/輸出依頼NO（大なり）
     */
    private String expRequestNoGreaterThan;

    /**
     * EXPORT REQUEST NO/輸出依頼NO（大なりイコール）
     */
    private String expRequestNoGreaterThanEqual;

    /**
     * EXPORT REQUEST NO/輸出依頼NO（小なり）
     */
    private String expRequestNoLessThan;

    /**
     * EXPORT REQUEST NO/輸出依頼NO（小なりイコール）
     */
    private String expRequestNoLessThanEqual;

    /**
     * EXPORT REQUEST NO/輸出依頼NO（前方一致）
     */
    private String expRequestNoLikeFront;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item（大なり）
     */
    private String parFlgGreaterThan;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item（大なりイコール）
     */
    private String parFlgGreaterThanEqual;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item（小なり）
     */
    private String parFlgLessThan;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item（小なりイコール）
     */
    private String parFlgLessThanEqual;

    /**
     * PARENT FLAG/親フラグ  Y:Parent Item, N:Child Item（前方一致）
     */
    private String parFlgLikeFront;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号（大なり）
     */
    private String kitParItemNoGreaterThan;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号（大なりイコール）
     */
    private String kitParItemNoGreaterThanEqual;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号（小なり）
     */
    private String kitParItemNoLessThan;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号（小なりイコール）
     */
    private String kitParItemNoLessThanEqual;

    /**
     * KIT PARENT ITEM NO/親KIT品目番号（前方一致）
     */
    private String kitParItemNoLikeFront;

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
     * QUANTITY UNIT/数量単位（大なり）
     */
    private String qtyUnitGreaterThan;

    /**
     * QUANTITY UNIT/数量単位（大なりイコール）
     */
    private String qtyUnitGreaterThanEqual;

    /**
     * QUANTITY UNIT/数量単位（小なり）
     */
    private String qtyUnitLessThan;

    /**
     * QUANTITY UNIT/数量単位（小なりイコール）
     */
    private String qtyUnitLessThanEqual;

    /**
     * QUANTITY UNIT/数量単位（前方一致）
     */
    private String qtyUnitLikeFront;

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
     * HS CODE/HSコード（大なり）
     */
    private String hsCdGreaterThan;

    /**
     * HS CODE/HSコード（大なりイコール）
     */
    private String hsCdGreaterThanEqual;

    /**
     * HS CODE/HSコード（小なり）
     */
    private String hsCdLessThan;

    /**
     * HS CODE/HSコード（小なりイコール）
     */
    private String hsCdLessThanEqual;

    /**
     * HS CODE/HSコード（前方一致）
     */
    private String hsCdLikeFront;

    /**
     * ORIGIN COUNTRY CODE/原産国コード（大なり）
     */
    private String originCntryCdGreaterThan;

    /**
     * ORIGIN COUNTRY CODE/原産国コード（大なりイコール）
     */
    private String originCntryCdGreaterThanEqual;

    /**
     * ORIGIN COUNTRY CODE/原産国コード（小なり）
     */
    private String originCntryCdLessThan;

    /**
     * ORIGIN COUNTRY CODE/原産国コード（小なりイコール）
     */
    private String originCntryCdLessThanEqual;

    /**
     * ORIGIN COUNTRY CODE/原産国コード（前方一致）
     */
    private String originCntryCdLikeFront;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not（大なり）
     */
    private String free1RegFlgGreaterThan;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not（大なりイコール）
     */
    private String free1RegFlgGreaterThanEqual;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not（小なり）
     */
    private String free1RegFlgLessThan;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not（小なりイコール）
     */
    private String free1RegFlgLessThanEqual;

    /**
     * FREE 1 REGIST FLAG/フリー1登録フラグ  Y:Set, N:Not（前方一致）
     */
    private String free1RegFlgLikeFront;

    /**
     * FREE 1 NAME/フリー1名称（大なり）
     */
    private String free1NmGreaterThan;

    /**
     * FREE 1 NAME/フリー1名称（大なりイコール）
     */
    private String free1NmGreaterThanEqual;

    /**
     * FREE 1 NAME/フリー1名称（小なり）
     */
    private String free1NmLessThan;

    /**
     * FREE 1 NAME/フリー1名称（小なりイコール）
     */
    private String free1NmLessThanEqual;

    /**
     * FREE 1 NAME/フリー1名称（前方一致）
     */
    private String free1NmLikeFront;

    /**
     * FREE 1 DETAIL/フリー1内容（大なり）
     */
    private String free1DtlGreaterThan;

    /**
     * FREE 1 DETAIL/フリー1内容（大なりイコール）
     */
    private String free1DtlGreaterThanEqual;

    /**
     * FREE 1 DETAIL/フリー1内容（小なり）
     */
    private String free1DtlLessThan;

    /**
     * FREE 1 DETAIL/フリー1内容（小なりイコール）
     */
    private String free1DtlLessThanEqual;

    /**
     * FREE 1 DETAIL/フリー1内容（前方一致）
     */
    private String free1DtlLikeFront;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free1OriginCntryFlgGreaterThan;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free1OriginCntryFlgGreaterThanEqual;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free1OriginCntryFlgLessThan;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free1OriginCntryFlgLessThanEqual;

    /**
     * FREE 1 ORIGIN COUNTRY FLAG/フリー1原産国代替表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free1OriginCntryFlgLikeFront;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not（大なり）
     */
    private String free2RegFlgGreaterThan;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not（大なりイコール）
     */
    private String free2RegFlgGreaterThanEqual;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not（小なり）
     */
    private String free2RegFlgLessThan;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not（小なりイコール）
     */
    private String free2RegFlgLessThanEqual;

    /**
     * FREE 2 REGIST FLAG/フリー2登録フラグ  Y:Set, N:Not（前方一致）
     */
    private String free2RegFlgLikeFront;

    /**
     * FREE 2 NAME/フリー2名称（大なり）
     */
    private String free2NmGreaterThan;

    /**
     * FREE 2 NAME/フリー2名称（大なりイコール）
     */
    private String free2NmGreaterThanEqual;

    /**
     * FREE 2 NAME/フリー2名称（小なり）
     */
    private String free2NmLessThan;

    /**
     * FREE 2 NAME/フリー2名称（小なりイコール）
     */
    private String free2NmLessThanEqual;

    /**
     * FREE 2 NAME/フリー2名称（前方一致）
     */
    private String free2NmLikeFront;

    /**
     * FREE 2 DETAIL/フリー2内容（大なり）
     */
    private String free2DtlGreaterThan;

    /**
     * FREE 2 DETAIL/フリー2内容（大なりイコール）
     */
    private String free2DtlGreaterThanEqual;

    /**
     * FREE 2 DETAIL/フリー2内容（小なり）
     */
    private String free2DtlLessThan;

    /**
     * FREE 2 DETAIL/フリー2内容（小なりイコール）
     */
    private String free2DtlLessThanEqual;

    /**
     * FREE 2 DETAIL/フリー2内容（前方一致）
     */
    private String free2DtlLikeFront;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free2OriginCntryFlgGreaterThan;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free2OriginCntryFlgGreaterThanEqual;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free2OriginCntryFlgLessThan;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free2OriginCntryFlgLessThanEqual;

    /**
     * FREE 2 ORIGIN COUNTRY FLAG/フリー2原産国代替表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free2OriginCntryFlgLikeFront;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not（大なり）
     */
    private String free3RegFlgGreaterThan;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not（大なりイコール）
     */
    private String free3RegFlgGreaterThanEqual;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not（小なり）
     */
    private String free3RegFlgLessThan;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not（小なりイコール）
     */
    private String free3RegFlgLessThanEqual;

    /**
     * FREE 3 REGIST FLAG/フリー3登録フラグ  Y:Set, N:Not（前方一致）
     */
    private String free3RegFlgLikeFront;

    /**
     * FREE 3 NAME/フリー3名称（大なり）
     */
    private String free3NmGreaterThan;

    /**
     * FREE 3 NAME/フリー3名称（大なりイコール）
     */
    private String free3NmGreaterThanEqual;

    /**
     * FREE 3 NAME/フリー3名称（小なり）
     */
    private String free3NmLessThan;

    /**
     * FREE 3 NAME/フリー3名称（小なりイコール）
     */
    private String free3NmLessThanEqual;

    /**
     * FREE 3 NAME/フリー3名称（前方一致）
     */
    private String free3NmLikeFront;

    /**
     * FREE 3 DETAIL/フリー3内容（大なり）
     */
    private String free3DtlGreaterThan;

    /**
     * FREE 3 DETAIL/フリー3内容（大なりイコール）
     */
    private String free3DtlGreaterThanEqual;

    /**
     * FREE 3 DETAIL/フリー3内容（小なり）
     */
    private String free3DtlLessThan;

    /**
     * FREE 3 DETAIL/フリー3内容（小なりイコール）
     */
    private String free3DtlLessThanEqual;

    /**
     * FREE 3 DETAIL/フリー3内容（前方一致）
     */
    private String free3DtlLikeFront;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not（大なり）
     */
    private String free3OriginCntryFlgGreaterThan;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not（大なりイコール）
     */
    private String free3OriginCntryFlgGreaterThanEqual;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not（小なり）
     */
    private String free3OriginCntryFlgLessThan;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not（小なりイコール）
     */
    private String free3OriginCntryFlgLessThanEqual;

    /**
     * FREE 3 ORIGIN COUNTRY FLAG/フリー3原産国代替表示フラグ  Y:Display, N:Not（前方一致）
     */
    private String free3OriginCntryFlgLikeFront;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり（大なり）
     */
    private String lengthUnitGreaterThan;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり（大なりイコール）
     */
    private String lengthUnitGreaterThanEqual;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり（小なり）
     */
    private String lengthUnitLessThan;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり（小なりイコール）
     */
    private String lengthUnitLessThanEqual;

    /**
     * LENGTH UNIT/長さ単位  RT材のみ入力あり（前方一致）
     */
    private String lengthUnitLikeFront;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。（大なり）
     */
    private String grpNo1GreaterThan;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。（大なりイコール）
     */
    private String grpNo1GreaterThanEqual;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。（小なり）
     */
    private String grpNo1LessThan;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。（小なりイコール）
     */
    private String grpNo1LessThanEqual;

    /**
     * GRP NO 1/グループNO1  Main+FullRTのインボイスのまとまりで１つのNOが付与される。（前方一致）
     */
    private String grpNo1LikeFront;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。（大なり）
     */
    private String grpNo2GreaterThan;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。（大なりイコール）
     */
    private String grpNo2GreaterThanEqual;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。（小なり）
     */
    private String grpNo2LessThan;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。（小なりイコール）
     */
    private String grpNo2LessThanEqual;

    /**
     * GRP NO 2/グループNO2  FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。（前方一致）
     */
    private String grpNo2LikeFront;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not（大なり）
     */
    private String removeFlgGreaterThan;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not（大なりイコール）
     */
    private String removeFlgGreaterThanEqual;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not（小なり）
     */
    private String removeFlgLessThan;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not（小なりイコール）
     */
    private String removeFlgLessThanEqual;

    /**
     * REMOVE FLAG/移動フラグ  Y:Remove, N:Not（前方一致）
     */
    private String removeFlgLikeFront;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not（大なり）
     */
    private String decisionFlgGreaterThan;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not（大なりイコール）
     */
    private String decisionFlgGreaterThanEqual;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not（小なり）
     */
    private String decisionFlgLessThan;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not（小なりイコール）
     */
    private String decisionFlgLessThanEqual;

    /**
     * INVOICE DECISION FLAG/インボイス確定フラグ  Y:Firm, N:Not（前方一致）
     */
    private String decisionFlgLikeFront;

    /**
     * TEMP INVOICE NO/仮インボイスNO（大なり）
     */
    private String tempInvoiceNoGreaterThan;

    /**
     * TEMP INVOICE NO/仮インボイスNO（大なりイコール）
     */
    private String tempInvoiceNoGreaterThanEqual;

    /**
     * TEMP INVOICE NO/仮インボイスNO（小なり）
     */
    private String tempInvoiceNoLessThan;

    /**
     * TEMP INVOICE NO/仮インボイスNO（小なりイコール）
     */
    private String tempInvoiceNoLessThanEqual;

    /**
     * TEMP INVOICE NO/仮インボイスNO（前方一致）
     */
    private String tempInvoiceNoLikeFront;

    /**
     * INVOICE NO/インボイスNO（大なり）
     */
    private String invoiceNoGreaterThan;

    /**
     * INVOICE NO/インボイスNO（大なりイコール）
     */
    private String invoiceNoGreaterThanEqual;

    /**
     * INVOICE NO/インボイスNO（小なり）
     */
    private String invoiceNoLessThan;

    /**
     * INVOICE NO/インボイスNO（小なりイコール）
     */
    private String invoiceNoLessThanEqual;

    /**
     * INVOICE NO/インボイスNO（前方一致）
     */
    private String invoiceNoLikeFront;

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
    public TwInvItemCriteriaDomain() {
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
     * brch のゲッターメソッドです。
     * 
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * brch のセッターメソッドです。
     * 
     * @param brch brch に設定する
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
    }

    /**
     * sortOdr のゲッターメソッドです。
     * 
     * @return the sortOdr
     */
    public BigDecimal getSortOdr() {
        return sortOdr;
    }

    /**
     * sortOdr のセッターメソッドです。
     * 
     * @param sortOdr sortOdr に設定する
     */
    public void setSortOdr(BigDecimal sortOdr) {
        this.sortOdr = sortOdr;
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
     * rtFlg のゲッターメソッドです。
     * 
     * @return the rtFlg
     */
    public String getRtFlg() {
        return rtFlg;
    }

    /**
     * rtFlg のセッターメソッドです。
     * 
     * @param rtFlg rtFlg に設定する
     */
    public void setRtFlg(String rtFlg) {
        this.rtFlg = rtFlg;
    }

    /**
     * kitFlg のゲッターメソッドです。
     * 
     * @return the kitFlg
     */
    public String getKitFlg() {
        return kitFlg;
    }

    /**
     * kitFlg のセッターメソッドです。
     * 
     * @param kitFlg kitFlg に設定する
     */
    public void setKitFlg(String kitFlg) {
        this.kitFlg = kitFlg;
    }

    /**
     * customerPoNo のゲッターメソッドです。
     * 
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * customerPoNo のセッターメソッドです。
     * 
     * @param customerPoNo customerPoNo に設定する
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * itemNo のゲッターメソッドです。
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * itemNo のセッターメソッドです。
     * 
     * @param itemNo itemNo に設定する
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * pkgCd のゲッターメソッドです。
     * 
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * pkgCd のセッターメソッドです。
     * 
     * @param pkgCd pkgCd に設定する
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * itemDescription のゲッターメソッドです。
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription のセッターメソッドです。
     * 
     * @param itemDescription itemDescription に設定する
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * modelCd のゲッターメソッドです。
     * 
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * modelCd のセッターメソッドです。
     * 
     * @param modelCd modelCd に設定する
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
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
     * lineNo のゲッターメソッドです。
     * 
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * lineNo のセッターメソッドです。
     * 
     * @param lineNo lineNo に設定する
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * kitBrch のゲッターメソッドです。
     * 
     * @return the kitBrch
     */
    public BigDecimal getKitBrch() {
        return kitBrch;
    }

    /**
     * kitBrch のセッターメソッドです。
     * 
     * @param kitBrch kitBrch に設定する
     */
    public void setKitBrch(BigDecimal kitBrch) {
        this.kitBrch = kitBrch;
    }

    /**
     * parFlg のゲッターメソッドです。
     * 
     * @return the parFlg
     */
    public String getParFlg() {
        return parFlg;
    }

    /**
     * parFlg のセッターメソッドです。
     * 
     * @param parFlg parFlg に設定する
     */
    public void setParFlg(String parFlg) {
        this.parFlg = parFlg;
    }

    /**
     * kitParItemNo のゲッターメソッドです。
     * 
     * @return the kitParItemNo
     */
    public String getKitParItemNo() {
        return kitParItemNo;
    }

    /**
     * kitParItemNo のセッターメソッドです。
     * 
     * @param kitParItemNo kitParItemNo に設定する
     */
    public void setKitParItemNo(String kitParItemNo) {
        this.kitParItemNo = kitParItemNo;
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
     * unitPrice のゲッターメソッドです。
     * 
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * unitPrice のセッターメソッドです。
     * 
     * @param unitPrice unitPrice に設定する
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * qtyUnit のゲッターメソッドです。
     * 
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * qtyUnit のセッターメソッドです。
     * 
     * @param qtyUnit qtyUnit に設定する
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
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
     * itemWeight のゲッターメソッドです。
     * 
     * @return the itemWeight
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * itemWeight のセッターメソッドです。
     * 
     * @param itemWeight itemWeight に設定する
     */
    public void setItemWeight(BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
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
     * hsCd のゲッターメソッドです。
     * 
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * hsCd のセッターメソッドです。
     * 
     * @param hsCd hsCd に設定する
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * originCntryCd のゲッターメソッドです。
     * 
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * originCntryCd のセッターメソッドです。
     * 
     * @param originCntryCd originCntryCd に設定する
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * free1RegFlg のゲッターメソッドです。
     * 
     * @return the free1RegFlg
     */
    public String getFree1RegFlg() {
        return free1RegFlg;
    }

    /**
     * free1RegFlg のセッターメソッドです。
     * 
     * @param free1RegFlg free1RegFlg に設定する
     */
    public void setFree1RegFlg(String free1RegFlg) {
        this.free1RegFlg = free1RegFlg;
    }

    /**
     * free1Nm のゲッターメソッドです。
     * 
     * @return the free1Nm
     */
    public String getFree1Nm() {
        return free1Nm;
    }

    /**
     * free1Nm のセッターメソッドです。
     * 
     * @param free1Nm free1Nm に設定する
     */
    public void setFree1Nm(String free1Nm) {
        this.free1Nm = free1Nm;
    }

    /**
     * free1Dtl のゲッターメソッドです。
     * 
     * @return the free1Dtl
     */
    public String getFree1Dtl() {
        return free1Dtl;
    }

    /**
     * free1Dtl のセッターメソッドです。
     * 
     * @param free1Dtl free1Dtl に設定する
     */
    public void setFree1Dtl(String free1Dtl) {
        this.free1Dtl = free1Dtl;
    }

    /**
     * free1OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlg
     */
    public String getFree1OriginCntryFlg() {
        return free1OriginCntryFlg;
    }

    /**
     * free1OriginCntryFlg のセッターメソッドです。
     * 
     * @param free1OriginCntryFlg free1OriginCntryFlg に設定する
     */
    public void setFree1OriginCntryFlg(String free1OriginCntryFlg) {
        this.free1OriginCntryFlg = free1OriginCntryFlg;
    }

    /**
     * free2RegFlg のゲッターメソッドです。
     * 
     * @return the free2RegFlg
     */
    public String getFree2RegFlg() {
        return free2RegFlg;
    }

    /**
     * free2RegFlg のセッターメソッドです。
     * 
     * @param free2RegFlg free2RegFlg に設定する
     */
    public void setFree2RegFlg(String free2RegFlg) {
        this.free2RegFlg = free2RegFlg;
    }

    /**
     * free2Nm のゲッターメソッドです。
     * 
     * @return the free2Nm
     */
    public String getFree2Nm() {
        return free2Nm;
    }

    /**
     * free2Nm のセッターメソッドです。
     * 
     * @param free2Nm free2Nm に設定する
     */
    public void setFree2Nm(String free2Nm) {
        this.free2Nm = free2Nm;
    }

    /**
     * free2Dtl のゲッターメソッドです。
     * 
     * @return the free2Dtl
     */
    public String getFree2Dtl() {
        return free2Dtl;
    }

    /**
     * free2Dtl のセッターメソッドです。
     * 
     * @param free2Dtl free2Dtl に設定する
     */
    public void setFree2Dtl(String free2Dtl) {
        this.free2Dtl = free2Dtl;
    }

    /**
     * free2OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlg
     */
    public String getFree2OriginCntryFlg() {
        return free2OriginCntryFlg;
    }

    /**
     * free2OriginCntryFlg のセッターメソッドです。
     * 
     * @param free2OriginCntryFlg free2OriginCntryFlg に設定する
     */
    public void setFree2OriginCntryFlg(String free2OriginCntryFlg) {
        this.free2OriginCntryFlg = free2OriginCntryFlg;
    }

    /**
     * free3RegFlg のゲッターメソッドです。
     * 
     * @return the free3RegFlg
     */
    public String getFree3RegFlg() {
        return free3RegFlg;
    }

    /**
     * free3RegFlg のセッターメソッドです。
     * 
     * @param free3RegFlg free3RegFlg に設定する
     */
    public void setFree3RegFlg(String free3RegFlg) {
        this.free3RegFlg = free3RegFlg;
    }

    /**
     * free3Nm のゲッターメソッドです。
     * 
     * @return the free3Nm
     */
    public String getFree3Nm() {
        return free3Nm;
    }

    /**
     * free3Nm のセッターメソッドです。
     * 
     * @param free3Nm free3Nm に設定する
     */
    public void setFree3Nm(String free3Nm) {
        this.free3Nm = free3Nm;
    }

    /**
     * free3Dtl のゲッターメソッドです。
     * 
     * @return the free3Dtl
     */
    public String getFree3Dtl() {
        return free3Dtl;
    }

    /**
     * free3Dtl のセッターメソッドです。
     * 
     * @param free3Dtl free3Dtl に設定する
     */
    public void setFree3Dtl(String free3Dtl) {
        this.free3Dtl = free3Dtl;
    }

    /**
     * free3OriginCntryFlg のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlg
     */
    public String getFree3OriginCntryFlg() {
        return free3OriginCntryFlg;
    }

    /**
     * free3OriginCntryFlg のセッターメソッドです。
     * 
     * @param free3OriginCntryFlg free3OriginCntryFlg に設定する
     */
    public void setFree3OriginCntryFlg(String free3OriginCntryFlg) {
        this.free3OriginCntryFlg = free3OriginCntryFlg;
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
     * grpNo1 のゲッターメソッドです。
     * 
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * grpNo1 のセッターメソッドです。
     * 
     * @param grpNo1 grpNo1 に設定する
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * grpNo2 のゲッターメソッドです。
     * 
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * grpNo2 のセッターメソッドです。
     * 
     * @param grpNo2 grpNo2 に設定する
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
    }

    /**
     * removeFlg のゲッターメソッドです。
     * 
     * @return the removeFlg
     */
    public String getRemoveFlg() {
        return removeFlg;
    }

    /**
     * removeFlg のセッターメソッドです。
     * 
     * @param removeFlg removeFlg に設定する
     */
    public void setRemoveFlg(String removeFlg) {
        this.removeFlg = removeFlg;
    }

    /**
     * decisionFlg のゲッターメソッドです。
     * 
     * @return the decisionFlg
     */
    public String getDecisionFlg() {
        return decisionFlg;
    }

    /**
     * decisionFlg のセッターメソッドです。
     * 
     * @param decisionFlg decisionFlg に設定する
     */
    public void setDecisionFlg(String decisionFlg) {
        this.decisionFlg = decisionFlg;
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
     * dscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThan
     */
    public String getDscIdGreaterThan() {
        return dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThan のセッターメソッドです。
     * 
     * @param dscIdGreaterThan dscIdGreaterThan に設定する
     */
    public void setDscIdGreaterThan(String dscIdGreaterThan) {
        this.dscIdGreaterThan = dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThanEqual
     */
    public String getDscIdGreaterThanEqual() {
        return dscIdGreaterThanEqual;
    }

    /**
     * dscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dscIdGreaterThanEqual dscIdGreaterThanEqual に設定する
     */
    public void setDscIdGreaterThanEqual(String dscIdGreaterThanEqual) {
        this.dscIdGreaterThanEqual = dscIdGreaterThanEqual;
    }

    /**
     * dscIdLessThan のゲッターメソッドです。
     * 
     * @return the dscIdLessThan
     */
    public String getDscIdLessThan() {
        return dscIdLessThan;
    }

    /**
     * dscIdLessThan のセッターメソッドです。
     * 
     * @param dscIdLessThan dscIdLessThan に設定する
     */
    public void setDscIdLessThan(String dscIdLessThan) {
        this.dscIdLessThan = dscIdLessThan;
    }

    /**
     * dscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdLessThanEqual
     */
    public String getDscIdLessThanEqual() {
        return dscIdLessThanEqual;
    }

    /**
     * dscIdLessThanEqual のセッターメソッドです。
     * 
     * @param dscIdLessThanEqual dscIdLessThanEqual に設定する
     */
    public void setDscIdLessThanEqual(String dscIdLessThanEqual) {
        this.dscIdLessThanEqual = dscIdLessThanEqual;
    }

    /**
     * dscIdLikeFront のゲッターメソッドです。
     * 
     * @return the dscIdLikeFront
     */
    public String getDscIdLikeFront() {
        return dscIdLikeFront;
    }

    /**
     * dscIdLikeFront のセッターメソッドです。
     * 
     * @param dscIdLikeFront dscIdLikeFront に設定する
     */
    public void setDscIdLikeFront(String dscIdLikeFront) {
        this.dscIdLikeFront = dscIdLikeFront;
    }

    /**
     * mainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThan
     */
    public String getMainMarkGreaterThan() {
        return mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThan のセッターメソッドです。
     * 
     * @param mainMarkGreaterThan mainMarkGreaterThan に設定する
     */
    public void setMainMarkGreaterThan(String mainMarkGreaterThan) {
        this.mainMarkGreaterThan = mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThanEqual
     */
    public String getMainMarkGreaterThanEqual() {
        return mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param mainMarkGreaterThanEqual mainMarkGreaterThanEqual に設定する
     */
    public void setMainMarkGreaterThanEqual(String mainMarkGreaterThanEqual) {
        this.mainMarkGreaterThanEqual = mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkLessThan のゲッターメソッドです。
     * 
     * @return the mainMarkLessThan
     */
    public String getMainMarkLessThan() {
        return mainMarkLessThan;
    }

    /**
     * mainMarkLessThan のセッターメソッドです。
     * 
     * @param mainMarkLessThan mainMarkLessThan に設定する
     */
    public void setMainMarkLessThan(String mainMarkLessThan) {
        this.mainMarkLessThan = mainMarkLessThan;
    }

    /**
     * mainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkLessThanEqual
     */
    public String getMainMarkLessThanEqual() {
        return mainMarkLessThanEqual;
    }

    /**
     * mainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param mainMarkLessThanEqual mainMarkLessThanEqual に設定する
     */
    public void setMainMarkLessThanEqual(String mainMarkLessThanEqual) {
        this.mainMarkLessThanEqual = mainMarkLessThanEqual;
    }

    /**
     * mainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the mainMarkLikeFront
     */
    public String getMainMarkLikeFront() {
        return mainMarkLikeFront;
    }

    /**
     * mainMarkLikeFront のセッターメソッドです。
     * 
     * @param mainMarkLikeFront mainMarkLikeFront に設定する
     */
    public void setMainMarkLikeFront(String mainMarkLikeFront) {
        this.mainMarkLikeFront = mainMarkLikeFront;
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
     * rtFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the rtFlgGreaterThan
     */
    public String getRtFlgGreaterThan() {
        return rtFlgGreaterThan;
    }

    /**
     * rtFlgGreaterThan のセッターメソッドです。
     * 
     * @param rtFlgGreaterThan rtFlgGreaterThan に設定する
     */
    public void setRtFlgGreaterThan(String rtFlgGreaterThan) {
        this.rtFlgGreaterThan = rtFlgGreaterThan;
    }

    /**
     * rtFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the rtFlgGreaterThanEqual
     */
    public String getRtFlgGreaterThanEqual() {
        return rtFlgGreaterThanEqual;
    }

    /**
     * rtFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param rtFlgGreaterThanEqual rtFlgGreaterThanEqual に設定する
     */
    public void setRtFlgGreaterThanEqual(String rtFlgGreaterThanEqual) {
        this.rtFlgGreaterThanEqual = rtFlgGreaterThanEqual;
    }

    /**
     * rtFlgLessThan のゲッターメソッドです。
     * 
     * @return the rtFlgLessThan
     */
    public String getRtFlgLessThan() {
        return rtFlgLessThan;
    }

    /**
     * rtFlgLessThan のセッターメソッドです。
     * 
     * @param rtFlgLessThan rtFlgLessThan に設定する
     */
    public void setRtFlgLessThan(String rtFlgLessThan) {
        this.rtFlgLessThan = rtFlgLessThan;
    }

    /**
     * rtFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the rtFlgLessThanEqual
     */
    public String getRtFlgLessThanEqual() {
        return rtFlgLessThanEqual;
    }

    /**
     * rtFlgLessThanEqual のセッターメソッドです。
     * 
     * @param rtFlgLessThanEqual rtFlgLessThanEqual に設定する
     */
    public void setRtFlgLessThanEqual(String rtFlgLessThanEqual) {
        this.rtFlgLessThanEqual = rtFlgLessThanEqual;
    }

    /**
     * rtFlgLikeFront のゲッターメソッドです。
     * 
     * @return the rtFlgLikeFront
     */
    public String getRtFlgLikeFront() {
        return rtFlgLikeFront;
    }

    /**
     * rtFlgLikeFront のセッターメソッドです。
     * 
     * @param rtFlgLikeFront rtFlgLikeFront に設定する
     */
    public void setRtFlgLikeFront(String rtFlgLikeFront) {
        this.rtFlgLikeFront = rtFlgLikeFront;
    }

    /**
     * kitFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the kitFlgGreaterThan
     */
    public String getKitFlgGreaterThan() {
        return kitFlgGreaterThan;
    }

    /**
     * kitFlgGreaterThan のセッターメソッドです。
     * 
     * @param kitFlgGreaterThan kitFlgGreaterThan に設定する
     */
    public void setKitFlgGreaterThan(String kitFlgGreaterThan) {
        this.kitFlgGreaterThan = kitFlgGreaterThan;
    }

    /**
     * kitFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitFlgGreaterThanEqual
     */
    public String getKitFlgGreaterThanEqual() {
        return kitFlgGreaterThanEqual;
    }

    /**
     * kitFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitFlgGreaterThanEqual kitFlgGreaterThanEqual に設定する
     */
    public void setKitFlgGreaterThanEqual(String kitFlgGreaterThanEqual) {
        this.kitFlgGreaterThanEqual = kitFlgGreaterThanEqual;
    }

    /**
     * kitFlgLessThan のゲッターメソッドです。
     * 
     * @return the kitFlgLessThan
     */
    public String getKitFlgLessThan() {
        return kitFlgLessThan;
    }

    /**
     * kitFlgLessThan のセッターメソッドです。
     * 
     * @param kitFlgLessThan kitFlgLessThan に設定する
     */
    public void setKitFlgLessThan(String kitFlgLessThan) {
        this.kitFlgLessThan = kitFlgLessThan;
    }

    /**
     * kitFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitFlgLessThanEqual
     */
    public String getKitFlgLessThanEqual() {
        return kitFlgLessThanEqual;
    }

    /**
     * kitFlgLessThanEqual のセッターメソッドです。
     * 
     * @param kitFlgLessThanEqual kitFlgLessThanEqual に設定する
     */
    public void setKitFlgLessThanEqual(String kitFlgLessThanEqual) {
        this.kitFlgLessThanEqual = kitFlgLessThanEqual;
    }

    /**
     * kitFlgLikeFront のゲッターメソッドです。
     * 
     * @return the kitFlgLikeFront
     */
    public String getKitFlgLikeFront() {
        return kitFlgLikeFront;
    }

    /**
     * kitFlgLikeFront のセッターメソッドです。
     * 
     * @param kitFlgLikeFront kitFlgLikeFront に設定する
     */
    public void setKitFlgLikeFront(String kitFlgLikeFront) {
        this.kitFlgLikeFront = kitFlgLikeFront;
    }

    /**
     * customerPoNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThan
     */
    public String getCustomerPoNoGreaterThan() {
        return customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThan のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThan customerPoNoGreaterThan に設定する
     */
    public void setCustomerPoNoGreaterThan(String customerPoNoGreaterThan) {
        this.customerPoNoGreaterThan = customerPoNoGreaterThan;
    }

    /**
     * customerPoNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoGreaterThanEqual
     */
    public String getCustomerPoNoGreaterThanEqual() {
        return customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoGreaterThanEqual customerPoNoGreaterThanEqual に設定する
     */
    public void setCustomerPoNoGreaterThanEqual(String customerPoNoGreaterThanEqual) {
        this.customerPoNoGreaterThanEqual = customerPoNoGreaterThanEqual;
    }

    /**
     * customerPoNoLessThan のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThan
     */
    public String getCustomerPoNoLessThan() {
        return customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThan のセッターメソッドです。
     * 
     * @param customerPoNoLessThan customerPoNoLessThan に設定する
     */
    public void setCustomerPoNoLessThan(String customerPoNoLessThan) {
        this.customerPoNoLessThan = customerPoNoLessThan;
    }

    /**
     * customerPoNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerPoNoLessThanEqual
     */
    public String getCustomerPoNoLessThanEqual() {
        return customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerPoNoLessThanEqual customerPoNoLessThanEqual に設定する
     */
    public void setCustomerPoNoLessThanEqual(String customerPoNoLessThanEqual) {
        this.customerPoNoLessThanEqual = customerPoNoLessThanEqual;
    }

    /**
     * customerPoNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerPoNoLikeFront
     */
    public String getCustomerPoNoLikeFront() {
        return customerPoNoLikeFront;
    }

    /**
     * customerPoNoLikeFront のセッターメソッドです。
     * 
     * @param customerPoNoLikeFront customerPoNoLikeFront に設定する
     */
    public void setCustomerPoNoLikeFront(String customerPoNoLikeFront) {
        this.customerPoNoLikeFront = customerPoNoLikeFront;
    }

    /**
     * customerItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThan
     */
    public String getCustomerItemNoGreaterThan() {
        return customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThan のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThan customerItemNoGreaterThan に設定する
     */
    public void setCustomerItemNoGreaterThan(String customerItemNoGreaterThan) {
        this.customerItemNoGreaterThan = customerItemNoGreaterThan;
    }

    /**
     * customerItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoGreaterThanEqual
     */
    public String getCustomerItemNoGreaterThanEqual() {
        return customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoGreaterThanEqual customerItemNoGreaterThanEqual に設定する
     */
    public void setCustomerItemNoGreaterThanEqual(String customerItemNoGreaterThanEqual) {
        this.customerItemNoGreaterThanEqual = customerItemNoGreaterThanEqual;
    }

    /**
     * customerItemNoLessThan のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThan
     */
    public String getCustomerItemNoLessThan() {
        return customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThan のセッターメソッドです。
     * 
     * @param customerItemNoLessThan customerItemNoLessThan に設定する
     */
    public void setCustomerItemNoLessThan(String customerItemNoLessThan) {
        this.customerItemNoLessThan = customerItemNoLessThan;
    }

    /**
     * customerItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerItemNoLessThanEqual
     */
    public String getCustomerItemNoLessThanEqual() {
        return customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param customerItemNoLessThanEqual customerItemNoLessThanEqual に設定する
     */
    public void setCustomerItemNoLessThanEqual(String customerItemNoLessThanEqual) {
        this.customerItemNoLessThanEqual = customerItemNoLessThanEqual;
    }

    /**
     * customerItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the customerItemNoLikeFront
     */
    public String getCustomerItemNoLikeFront() {
        return customerItemNoLikeFront;
    }

    /**
     * customerItemNoLikeFront のセッターメソッドです。
     * 
     * @param customerItemNoLikeFront customerItemNoLikeFront に設定する
     */
    public void setCustomerItemNoLikeFront(String customerItemNoLikeFront) {
        this.customerItemNoLikeFront = customerItemNoLikeFront;
    }

    /**
     * itemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThan
     */
    public String getItemNoGreaterThan() {
        return itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThan のセッターメソッドです。
     * 
     * @param itemNoGreaterThan itemNoGreaterThan に設定する
     */
    public void setItemNoGreaterThan(String itemNoGreaterThan) {
        this.itemNoGreaterThan = itemNoGreaterThan;
    }

    /**
     * itemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoGreaterThanEqual
     */
    public String getItemNoGreaterThanEqual() {
        return itemNoGreaterThanEqual;
    }

    /**
     * itemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemNoGreaterThanEqual itemNoGreaterThanEqual に設定する
     */
    public void setItemNoGreaterThanEqual(String itemNoGreaterThanEqual) {
        this.itemNoGreaterThanEqual = itemNoGreaterThanEqual;
    }

    /**
     * itemNoLessThan のゲッターメソッドです。
     * 
     * @return the itemNoLessThan
     */
    public String getItemNoLessThan() {
        return itemNoLessThan;
    }

    /**
     * itemNoLessThan のセッターメソッドです。
     * 
     * @param itemNoLessThan itemNoLessThan に設定する
     */
    public void setItemNoLessThan(String itemNoLessThan) {
        this.itemNoLessThan = itemNoLessThan;
    }

    /**
     * itemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemNoLessThanEqual
     */
    public String getItemNoLessThanEqual() {
        return itemNoLessThanEqual;
    }

    /**
     * itemNoLessThanEqual のセッターメソッドです。
     * 
     * @param itemNoLessThanEqual itemNoLessThanEqual に設定する
     */
    public void setItemNoLessThanEqual(String itemNoLessThanEqual) {
        this.itemNoLessThanEqual = itemNoLessThanEqual;
    }

    /**
     * itemNoLikeFront のゲッターメソッドです。
     * 
     * @return the itemNoLikeFront
     */
    public String getItemNoLikeFront() {
        return itemNoLikeFront;
    }

    /**
     * itemNoLikeFront のセッターメソッドです。
     * 
     * @param itemNoLikeFront itemNoLikeFront に設定する
     */
    public void setItemNoLikeFront(String itemNoLikeFront) {
        this.itemNoLikeFront = itemNoLikeFront;
    }

    /**
     * pkgCdGreaterThan のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThan
     */
    public String getPkgCdGreaterThan() {
        return pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThan のセッターメソッドです。
     * 
     * @param pkgCdGreaterThan pkgCdGreaterThan に設定する
     */
    public void setPkgCdGreaterThan(String pkgCdGreaterThan) {
        this.pkgCdGreaterThan = pkgCdGreaterThan;
    }

    /**
     * pkgCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdGreaterThanEqual
     */
    public String getPkgCdGreaterThanEqual() {
        return pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param pkgCdGreaterThanEqual pkgCdGreaterThanEqual に設定する
     */
    public void setPkgCdGreaterThanEqual(String pkgCdGreaterThanEqual) {
        this.pkgCdGreaterThanEqual = pkgCdGreaterThanEqual;
    }

    /**
     * pkgCdLessThan のゲッターメソッドです。
     * 
     * @return the pkgCdLessThan
     */
    public String getPkgCdLessThan() {
        return pkgCdLessThan;
    }

    /**
     * pkgCdLessThan のセッターメソッドです。
     * 
     * @param pkgCdLessThan pkgCdLessThan に設定する
     */
    public void setPkgCdLessThan(String pkgCdLessThan) {
        this.pkgCdLessThan = pkgCdLessThan;
    }

    /**
     * pkgCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the pkgCdLessThanEqual
     */
    public String getPkgCdLessThanEqual() {
        return pkgCdLessThanEqual;
    }

    /**
     * pkgCdLessThanEqual のセッターメソッドです。
     * 
     * @param pkgCdLessThanEqual pkgCdLessThanEqual に設定する
     */
    public void setPkgCdLessThanEqual(String pkgCdLessThanEqual) {
        this.pkgCdLessThanEqual = pkgCdLessThanEqual;
    }

    /**
     * pkgCdLikeFront のゲッターメソッドです。
     * 
     * @return the pkgCdLikeFront
     */
    public String getPkgCdLikeFront() {
        return pkgCdLikeFront;
    }

    /**
     * pkgCdLikeFront のセッターメソッドです。
     * 
     * @param pkgCdLikeFront pkgCdLikeFront に設定する
     */
    public void setPkgCdLikeFront(String pkgCdLikeFront) {
        this.pkgCdLikeFront = pkgCdLikeFront;
    }

    /**
     * itemDescriptionGreaterThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThan
     */
    public String getItemDescriptionGreaterThan() {
        return itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThan のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThan itemDescriptionGreaterThan に設定する
     */
    public void setItemDescriptionGreaterThan(String itemDescriptionGreaterThan) {
        this.itemDescriptionGreaterThan = itemDescriptionGreaterThan;
    }

    /**
     * itemDescriptionGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionGreaterThanEqual
     */
    public String getItemDescriptionGreaterThanEqual() {
        return itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionGreaterThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionGreaterThanEqual itemDescriptionGreaterThanEqual に設定する
     */
    public void setItemDescriptionGreaterThanEqual(String itemDescriptionGreaterThanEqual) {
        this.itemDescriptionGreaterThanEqual = itemDescriptionGreaterThanEqual;
    }

    /**
     * itemDescriptionLessThan のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThan
     */
    public String getItemDescriptionLessThan() {
        return itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThan のセッターメソッドです。
     * 
     * @param itemDescriptionLessThan itemDescriptionLessThan に設定する
     */
    public void setItemDescriptionLessThan(String itemDescriptionLessThan) {
        this.itemDescriptionLessThan = itemDescriptionLessThan;
    }

    /**
     * itemDescriptionLessThanEqual のゲッターメソッドです。
     * 
     * @return the itemDescriptionLessThanEqual
     */
    public String getItemDescriptionLessThanEqual() {
        return itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLessThanEqual のセッターメソッドです。
     * 
     * @param itemDescriptionLessThanEqual itemDescriptionLessThanEqual に設定する
     */
    public void setItemDescriptionLessThanEqual(String itemDescriptionLessThanEqual) {
        this.itemDescriptionLessThanEqual = itemDescriptionLessThanEqual;
    }

    /**
     * itemDescriptionLikeFront のゲッターメソッドです。
     * 
     * @return the itemDescriptionLikeFront
     */
    public String getItemDescriptionLikeFront() {
        return itemDescriptionLikeFront;
    }

    /**
     * itemDescriptionLikeFront のセッターメソッドです。
     * 
     * @param itemDescriptionLikeFront itemDescriptionLikeFront に設定する
     */
    public void setItemDescriptionLikeFront(String itemDescriptionLikeFront) {
        this.itemDescriptionLikeFront = itemDescriptionLikeFront;
    }

    /**
     * modelCdGreaterThan のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThan
     */
    public String getModelCdGreaterThan() {
        return modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThan のセッターメソッドです。
     * 
     * @param modelCdGreaterThan modelCdGreaterThan に設定する
     */
    public void setModelCdGreaterThan(String modelCdGreaterThan) {
        this.modelCdGreaterThan = modelCdGreaterThan;
    }

    /**
     * modelCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdGreaterThanEqual
     */
    public String getModelCdGreaterThanEqual() {
        return modelCdGreaterThanEqual;
    }

    /**
     * modelCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param modelCdGreaterThanEqual modelCdGreaterThanEqual に設定する
     */
    public void setModelCdGreaterThanEqual(String modelCdGreaterThanEqual) {
        this.modelCdGreaterThanEqual = modelCdGreaterThanEqual;
    }

    /**
     * modelCdLessThan のゲッターメソッドです。
     * 
     * @return the modelCdLessThan
     */
    public String getModelCdLessThan() {
        return modelCdLessThan;
    }

    /**
     * modelCdLessThan のセッターメソッドです。
     * 
     * @param modelCdLessThan modelCdLessThan に設定する
     */
    public void setModelCdLessThan(String modelCdLessThan) {
        this.modelCdLessThan = modelCdLessThan;
    }

    /**
     * modelCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the modelCdLessThanEqual
     */
    public String getModelCdLessThanEqual() {
        return modelCdLessThanEqual;
    }

    /**
     * modelCdLessThanEqual のセッターメソッドです。
     * 
     * @param modelCdLessThanEqual modelCdLessThanEqual に設定する
     */
    public void setModelCdLessThanEqual(String modelCdLessThanEqual) {
        this.modelCdLessThanEqual = modelCdLessThanEqual;
    }

    /**
     * modelCdLikeFront のゲッターメソッドです。
     * 
     * @return the modelCdLikeFront
     */
    public String getModelCdLikeFront() {
        return modelCdLikeFront;
    }

    /**
     * modelCdLikeFront のセッターメソッドです。
     * 
     * @param modelCdLikeFront modelCdLikeFront に設定する
     */
    public void setModelCdLikeFront(String modelCdLikeFront) {
        this.modelCdLikeFront = modelCdLikeFront;
    }

    /**
     * expRequestNoGreaterThan のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThan
     */
    public String getExpRequestNoGreaterThan() {
        return expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThan のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThan expRequestNoGreaterThan に設定する
     */
    public void setExpRequestNoGreaterThan(String expRequestNoGreaterThan) {
        this.expRequestNoGreaterThan = expRequestNoGreaterThan;
    }

    /**
     * expRequestNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoGreaterThanEqual
     */
    public String getExpRequestNoGreaterThanEqual() {
        return expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoGreaterThanEqual expRequestNoGreaterThanEqual に設定する
     */
    public void setExpRequestNoGreaterThanEqual(String expRequestNoGreaterThanEqual) {
        this.expRequestNoGreaterThanEqual = expRequestNoGreaterThanEqual;
    }

    /**
     * expRequestNoLessThan のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThan
     */
    public String getExpRequestNoLessThan() {
        return expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThan のセッターメソッドです。
     * 
     * @param expRequestNoLessThan expRequestNoLessThan に設定する
     */
    public void setExpRequestNoLessThan(String expRequestNoLessThan) {
        this.expRequestNoLessThan = expRequestNoLessThan;
    }

    /**
     * expRequestNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the expRequestNoLessThanEqual
     */
    public String getExpRequestNoLessThanEqual() {
        return expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLessThanEqual のセッターメソッドです。
     * 
     * @param expRequestNoLessThanEqual expRequestNoLessThanEqual に設定する
     */
    public void setExpRequestNoLessThanEqual(String expRequestNoLessThanEqual) {
        this.expRequestNoLessThanEqual = expRequestNoLessThanEqual;
    }

    /**
     * expRequestNoLikeFront のゲッターメソッドです。
     * 
     * @return the expRequestNoLikeFront
     */
    public String getExpRequestNoLikeFront() {
        return expRequestNoLikeFront;
    }

    /**
     * expRequestNoLikeFront のセッターメソッドです。
     * 
     * @param expRequestNoLikeFront expRequestNoLikeFront に設定する
     */
    public void setExpRequestNoLikeFront(String expRequestNoLikeFront) {
        this.expRequestNoLikeFront = expRequestNoLikeFront;
    }

    /**
     * parFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the parFlgGreaterThan
     */
    public String getParFlgGreaterThan() {
        return parFlgGreaterThan;
    }

    /**
     * parFlgGreaterThan のセッターメソッドです。
     * 
     * @param parFlgGreaterThan parFlgGreaterThan に設定する
     */
    public void setParFlgGreaterThan(String parFlgGreaterThan) {
        this.parFlgGreaterThan = parFlgGreaterThan;
    }

    /**
     * parFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the parFlgGreaterThanEqual
     */
    public String getParFlgGreaterThanEqual() {
        return parFlgGreaterThanEqual;
    }

    /**
     * parFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param parFlgGreaterThanEqual parFlgGreaterThanEqual に設定する
     */
    public void setParFlgGreaterThanEqual(String parFlgGreaterThanEqual) {
        this.parFlgGreaterThanEqual = parFlgGreaterThanEqual;
    }

    /**
     * parFlgLessThan のゲッターメソッドです。
     * 
     * @return the parFlgLessThan
     */
    public String getParFlgLessThan() {
        return parFlgLessThan;
    }

    /**
     * parFlgLessThan のセッターメソッドです。
     * 
     * @param parFlgLessThan parFlgLessThan に設定する
     */
    public void setParFlgLessThan(String parFlgLessThan) {
        this.parFlgLessThan = parFlgLessThan;
    }

    /**
     * parFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the parFlgLessThanEqual
     */
    public String getParFlgLessThanEqual() {
        return parFlgLessThanEqual;
    }

    /**
     * parFlgLessThanEqual のセッターメソッドです。
     * 
     * @param parFlgLessThanEqual parFlgLessThanEqual に設定する
     */
    public void setParFlgLessThanEqual(String parFlgLessThanEqual) {
        this.parFlgLessThanEqual = parFlgLessThanEqual;
    }

    /**
     * parFlgLikeFront のゲッターメソッドです。
     * 
     * @return the parFlgLikeFront
     */
    public String getParFlgLikeFront() {
        return parFlgLikeFront;
    }

    /**
     * parFlgLikeFront のセッターメソッドです。
     * 
     * @param parFlgLikeFront parFlgLikeFront に設定する
     */
    public void setParFlgLikeFront(String parFlgLikeFront) {
        this.parFlgLikeFront = parFlgLikeFront;
    }

    /**
     * kitParItemNoGreaterThan のゲッターメソッドです。
     * 
     * @return the kitParItemNoGreaterThan
     */
    public String getKitParItemNoGreaterThan() {
        return kitParItemNoGreaterThan;
    }

    /**
     * kitParItemNoGreaterThan のセッターメソッドです。
     * 
     * @param kitParItemNoGreaterThan kitParItemNoGreaterThan に設定する
     */
    public void setKitParItemNoGreaterThan(String kitParItemNoGreaterThan) {
        this.kitParItemNoGreaterThan = kitParItemNoGreaterThan;
    }

    /**
     * kitParItemNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the kitParItemNoGreaterThanEqual
     */
    public String getKitParItemNoGreaterThanEqual() {
        return kitParItemNoGreaterThanEqual;
    }

    /**
     * kitParItemNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param kitParItemNoGreaterThanEqual kitParItemNoGreaterThanEqual に設定する
     */
    public void setKitParItemNoGreaterThanEqual(String kitParItemNoGreaterThanEqual) {
        this.kitParItemNoGreaterThanEqual = kitParItemNoGreaterThanEqual;
    }

    /**
     * kitParItemNoLessThan のゲッターメソッドです。
     * 
     * @return the kitParItemNoLessThan
     */
    public String getKitParItemNoLessThan() {
        return kitParItemNoLessThan;
    }

    /**
     * kitParItemNoLessThan のセッターメソッドです。
     * 
     * @param kitParItemNoLessThan kitParItemNoLessThan に設定する
     */
    public void setKitParItemNoLessThan(String kitParItemNoLessThan) {
        this.kitParItemNoLessThan = kitParItemNoLessThan;
    }

    /**
     * kitParItemNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the kitParItemNoLessThanEqual
     */
    public String getKitParItemNoLessThanEqual() {
        return kitParItemNoLessThanEqual;
    }

    /**
     * kitParItemNoLessThanEqual のセッターメソッドです。
     * 
     * @param kitParItemNoLessThanEqual kitParItemNoLessThanEqual に設定する
     */
    public void setKitParItemNoLessThanEqual(String kitParItemNoLessThanEqual) {
        this.kitParItemNoLessThanEqual = kitParItemNoLessThanEqual;
    }

    /**
     * kitParItemNoLikeFront のゲッターメソッドです。
     * 
     * @return the kitParItemNoLikeFront
     */
    public String getKitParItemNoLikeFront() {
        return kitParItemNoLikeFront;
    }

    /**
     * kitParItemNoLikeFront のセッターメソッドです。
     * 
     * @param kitParItemNoLikeFront kitParItemNoLikeFront に設定する
     */
    public void setKitParItemNoLikeFront(String kitParItemNoLikeFront) {
        this.kitParItemNoLikeFront = kitParItemNoLikeFront;
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
     * qtyUnitGreaterThan のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThan
     */
    public String getQtyUnitGreaterThan() {
        return qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThan のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThan qtyUnitGreaterThan に設定する
     */
    public void setQtyUnitGreaterThan(String qtyUnitGreaterThan) {
        this.qtyUnitGreaterThan = qtyUnitGreaterThan;
    }

    /**
     * qtyUnitGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitGreaterThanEqual
     */
    public String getQtyUnitGreaterThanEqual() {
        return qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitGreaterThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitGreaterThanEqual qtyUnitGreaterThanEqual に設定する
     */
    public void setQtyUnitGreaterThanEqual(String qtyUnitGreaterThanEqual) {
        this.qtyUnitGreaterThanEqual = qtyUnitGreaterThanEqual;
    }

    /**
     * qtyUnitLessThan のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThan
     */
    public String getQtyUnitLessThan() {
        return qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThan のセッターメソッドです。
     * 
     * @param qtyUnitLessThan qtyUnitLessThan に設定する
     */
    public void setQtyUnitLessThan(String qtyUnitLessThan) {
        this.qtyUnitLessThan = qtyUnitLessThan;
    }

    /**
     * qtyUnitLessThanEqual のゲッターメソッドです。
     * 
     * @return the qtyUnitLessThanEqual
     */
    public String getQtyUnitLessThanEqual() {
        return qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLessThanEqual のセッターメソッドです。
     * 
     * @param qtyUnitLessThanEqual qtyUnitLessThanEqual に設定する
     */
    public void setQtyUnitLessThanEqual(String qtyUnitLessThanEqual) {
        this.qtyUnitLessThanEqual = qtyUnitLessThanEqual;
    }

    /**
     * qtyUnitLikeFront のゲッターメソッドです。
     * 
     * @return the qtyUnitLikeFront
     */
    public String getQtyUnitLikeFront() {
        return qtyUnitLikeFront;
    }

    /**
     * qtyUnitLikeFront のセッターメソッドです。
     * 
     * @param qtyUnitLikeFront qtyUnitLikeFront に設定する
     */
    public void setQtyUnitLikeFront(String qtyUnitLikeFront) {
        this.qtyUnitLikeFront = qtyUnitLikeFront;
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
     * hsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThan
     */
    public String getHsCdGreaterThan() {
        return hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThan のセッターメソッドです。
     * 
     * @param hsCdGreaterThan hsCdGreaterThan に設定する
     */
    public void setHsCdGreaterThan(String hsCdGreaterThan) {
        this.hsCdGreaterThan = hsCdGreaterThan;
    }

    /**
     * hsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdGreaterThanEqual
     */
    public String getHsCdGreaterThanEqual() {
        return hsCdGreaterThanEqual;
    }

    /**
     * hsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param hsCdGreaterThanEqual hsCdGreaterThanEqual に設定する
     */
    public void setHsCdGreaterThanEqual(String hsCdGreaterThanEqual) {
        this.hsCdGreaterThanEqual = hsCdGreaterThanEqual;
    }

    /**
     * hsCdLessThan のゲッターメソッドです。
     * 
     * @return the hsCdLessThan
     */
    public String getHsCdLessThan() {
        return hsCdLessThan;
    }

    /**
     * hsCdLessThan のセッターメソッドです。
     * 
     * @param hsCdLessThan hsCdLessThan に設定する
     */
    public void setHsCdLessThan(String hsCdLessThan) {
        this.hsCdLessThan = hsCdLessThan;
    }

    /**
     * hsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdLessThanEqual
     */
    public String getHsCdLessThanEqual() {
        return hsCdLessThanEqual;
    }

    /**
     * hsCdLessThanEqual のセッターメソッドです。
     * 
     * @param hsCdLessThanEqual hsCdLessThanEqual に設定する
     */
    public void setHsCdLessThanEqual(String hsCdLessThanEqual) {
        this.hsCdLessThanEqual = hsCdLessThanEqual;
    }

    /**
     * hsCdLikeFront のゲッターメソッドです。
     * 
     * @return the hsCdLikeFront
     */
    public String getHsCdLikeFront() {
        return hsCdLikeFront;
    }

    /**
     * hsCdLikeFront のセッターメソッドです。
     * 
     * @param hsCdLikeFront hsCdLikeFront に設定する
     */
    public void setHsCdLikeFront(String hsCdLikeFront) {
        this.hsCdLikeFront = hsCdLikeFront;
    }

    /**
     * originCntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThan
     */
    public String getOriginCntryCdGreaterThan() {
        return originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThan のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThan originCntryCdGreaterThan に設定する
     */
    public void setOriginCntryCdGreaterThan(String originCntryCdGreaterThan) {
        this.originCntryCdGreaterThan = originCntryCdGreaterThan;
    }

    /**
     * originCntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdGreaterThanEqual
     */
    public String getOriginCntryCdGreaterThanEqual() {
        return originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdGreaterThanEqual originCntryCdGreaterThanEqual に設定する
     */
    public void setOriginCntryCdGreaterThanEqual(String originCntryCdGreaterThanEqual) {
        this.originCntryCdGreaterThanEqual = originCntryCdGreaterThanEqual;
    }

    /**
     * originCntryCdLessThan のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThan
     */
    public String getOriginCntryCdLessThan() {
        return originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThan のセッターメソッドです。
     * 
     * @param originCntryCdLessThan originCntryCdLessThan に設定する
     */
    public void setOriginCntryCdLessThan(String originCntryCdLessThan) {
        this.originCntryCdLessThan = originCntryCdLessThan;
    }

    /**
     * originCntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryCdLessThanEqual
     */
    public String getOriginCntryCdLessThanEqual() {
        return originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryCdLessThanEqual originCntryCdLessThanEqual に設定する
     */
    public void setOriginCntryCdLessThanEqual(String originCntryCdLessThanEqual) {
        this.originCntryCdLessThanEqual = originCntryCdLessThanEqual;
    }

    /**
     * originCntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryCdLikeFront
     */
    public String getOriginCntryCdLikeFront() {
        return originCntryCdLikeFront;
    }

    /**
     * originCntryCdLikeFront のセッターメソッドです。
     * 
     * @param originCntryCdLikeFront originCntryCdLikeFront に設定する
     */
    public void setOriginCntryCdLikeFront(String originCntryCdLikeFront) {
        this.originCntryCdLikeFront = originCntryCdLikeFront;
    }

    /**
     * free1RegFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free1RegFlgGreaterThan
     */
    public String getFree1RegFlgGreaterThan() {
        return free1RegFlgGreaterThan;
    }

    /**
     * free1RegFlgGreaterThan のセッターメソッドです。
     * 
     * @param free1RegFlgGreaterThan free1RegFlgGreaterThan に設定する
     */
    public void setFree1RegFlgGreaterThan(String free1RegFlgGreaterThan) {
        this.free1RegFlgGreaterThan = free1RegFlgGreaterThan;
    }

    /**
     * free1RegFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1RegFlgGreaterThanEqual
     */
    public String getFree1RegFlgGreaterThanEqual() {
        return free1RegFlgGreaterThanEqual;
    }

    /**
     * free1RegFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1RegFlgGreaterThanEqual free1RegFlgGreaterThanEqual に設定する
     */
    public void setFree1RegFlgGreaterThanEqual(String free1RegFlgGreaterThanEqual) {
        this.free1RegFlgGreaterThanEqual = free1RegFlgGreaterThanEqual;
    }

    /**
     * free1RegFlgLessThan のゲッターメソッドです。
     * 
     * @return the free1RegFlgLessThan
     */
    public String getFree1RegFlgLessThan() {
        return free1RegFlgLessThan;
    }

    /**
     * free1RegFlgLessThan のセッターメソッドです。
     * 
     * @param free1RegFlgLessThan free1RegFlgLessThan に設定する
     */
    public void setFree1RegFlgLessThan(String free1RegFlgLessThan) {
        this.free1RegFlgLessThan = free1RegFlgLessThan;
    }

    /**
     * free1RegFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1RegFlgLessThanEqual
     */
    public String getFree1RegFlgLessThanEqual() {
        return free1RegFlgLessThanEqual;
    }

    /**
     * free1RegFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free1RegFlgLessThanEqual free1RegFlgLessThanEqual に設定する
     */
    public void setFree1RegFlgLessThanEqual(String free1RegFlgLessThanEqual) {
        this.free1RegFlgLessThanEqual = free1RegFlgLessThanEqual;
    }

    /**
     * free1RegFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free1RegFlgLikeFront
     */
    public String getFree1RegFlgLikeFront() {
        return free1RegFlgLikeFront;
    }

    /**
     * free1RegFlgLikeFront のセッターメソッドです。
     * 
     * @param free1RegFlgLikeFront free1RegFlgLikeFront に設定する
     */
    public void setFree1RegFlgLikeFront(String free1RegFlgLikeFront) {
        this.free1RegFlgLikeFront = free1RegFlgLikeFront;
    }

    /**
     * free1NmGreaterThan のゲッターメソッドです。
     * 
     * @return the free1NmGreaterThan
     */
    public String getFree1NmGreaterThan() {
        return free1NmGreaterThan;
    }

    /**
     * free1NmGreaterThan のセッターメソッドです。
     * 
     * @param free1NmGreaterThan free1NmGreaterThan に設定する
     */
    public void setFree1NmGreaterThan(String free1NmGreaterThan) {
        this.free1NmGreaterThan = free1NmGreaterThan;
    }

    /**
     * free1NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1NmGreaterThanEqual
     */
    public String getFree1NmGreaterThanEqual() {
        return free1NmGreaterThanEqual;
    }

    /**
     * free1NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1NmGreaterThanEqual free1NmGreaterThanEqual に設定する
     */
    public void setFree1NmGreaterThanEqual(String free1NmGreaterThanEqual) {
        this.free1NmGreaterThanEqual = free1NmGreaterThanEqual;
    }

    /**
     * free1NmLessThan のゲッターメソッドです。
     * 
     * @return the free1NmLessThan
     */
    public String getFree1NmLessThan() {
        return free1NmLessThan;
    }

    /**
     * free1NmLessThan のセッターメソッドです。
     * 
     * @param free1NmLessThan free1NmLessThan に設定する
     */
    public void setFree1NmLessThan(String free1NmLessThan) {
        this.free1NmLessThan = free1NmLessThan;
    }

    /**
     * free1NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1NmLessThanEqual
     */
    public String getFree1NmLessThanEqual() {
        return free1NmLessThanEqual;
    }

    /**
     * free1NmLessThanEqual のセッターメソッドです。
     * 
     * @param free1NmLessThanEqual free1NmLessThanEqual に設定する
     */
    public void setFree1NmLessThanEqual(String free1NmLessThanEqual) {
        this.free1NmLessThanEqual = free1NmLessThanEqual;
    }

    /**
     * free1NmLikeFront のゲッターメソッドです。
     * 
     * @return the free1NmLikeFront
     */
    public String getFree1NmLikeFront() {
        return free1NmLikeFront;
    }

    /**
     * free1NmLikeFront のセッターメソッドです。
     * 
     * @param free1NmLikeFront free1NmLikeFront に設定する
     */
    public void setFree1NmLikeFront(String free1NmLikeFront) {
        this.free1NmLikeFront = free1NmLikeFront;
    }

    /**
     * free1DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free1DtlGreaterThan
     */
    public String getFree1DtlGreaterThan() {
        return free1DtlGreaterThan;
    }

    /**
     * free1DtlGreaterThan のセッターメソッドです。
     * 
     * @param free1DtlGreaterThan free1DtlGreaterThan に設定する
     */
    public void setFree1DtlGreaterThan(String free1DtlGreaterThan) {
        this.free1DtlGreaterThan = free1DtlGreaterThan;
    }

    /**
     * free1DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1DtlGreaterThanEqual
     */
    public String getFree1DtlGreaterThanEqual() {
        return free1DtlGreaterThanEqual;
    }

    /**
     * free1DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1DtlGreaterThanEqual free1DtlGreaterThanEqual に設定する
     */
    public void setFree1DtlGreaterThanEqual(String free1DtlGreaterThanEqual) {
        this.free1DtlGreaterThanEqual = free1DtlGreaterThanEqual;
    }

    /**
     * free1DtlLessThan のゲッターメソッドです。
     * 
     * @return the free1DtlLessThan
     */
    public String getFree1DtlLessThan() {
        return free1DtlLessThan;
    }

    /**
     * free1DtlLessThan のセッターメソッドです。
     * 
     * @param free1DtlLessThan free1DtlLessThan に設定する
     */
    public void setFree1DtlLessThan(String free1DtlLessThan) {
        this.free1DtlLessThan = free1DtlLessThan;
    }

    /**
     * free1DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1DtlLessThanEqual
     */
    public String getFree1DtlLessThanEqual() {
        return free1DtlLessThanEqual;
    }

    /**
     * free1DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free1DtlLessThanEqual free1DtlLessThanEqual に設定する
     */
    public void setFree1DtlLessThanEqual(String free1DtlLessThanEqual) {
        this.free1DtlLessThanEqual = free1DtlLessThanEqual;
    }

    /**
     * free1DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free1DtlLikeFront
     */
    public String getFree1DtlLikeFront() {
        return free1DtlLikeFront;
    }

    /**
     * free1DtlLikeFront のセッターメソッドです。
     * 
     * @param free1DtlLikeFront free1DtlLikeFront に設定する
     */
    public void setFree1DtlLikeFront(String free1DtlLikeFront) {
        this.free1DtlLikeFront = free1DtlLikeFront;
    }

    /**
     * free1OriginCntryFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlgGreaterThan
     */
    public String getFree1OriginCntryFlgGreaterThan() {
        return free1OriginCntryFlgGreaterThan;
    }

    /**
     * free1OriginCntryFlgGreaterThan のセッターメソッドです。
     * 
     * @param free1OriginCntryFlgGreaterThan free1OriginCntryFlgGreaterThan に設定する
     */
    public void setFree1OriginCntryFlgGreaterThan(String free1OriginCntryFlgGreaterThan) {
        this.free1OriginCntryFlgGreaterThan = free1OriginCntryFlgGreaterThan;
    }

    /**
     * free1OriginCntryFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlgGreaterThanEqual
     */
    public String getFree1OriginCntryFlgGreaterThanEqual() {
        return free1OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free1OriginCntryFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1OriginCntryFlgGreaterThanEqual free1OriginCntryFlgGreaterThanEqual に設定する
     */
    public void setFree1OriginCntryFlgGreaterThanEqual(String free1OriginCntryFlgGreaterThanEqual) {
        this.free1OriginCntryFlgGreaterThanEqual = free1OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free1OriginCntryFlgLessThan のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlgLessThan
     */
    public String getFree1OriginCntryFlgLessThan() {
        return free1OriginCntryFlgLessThan;
    }

    /**
     * free1OriginCntryFlgLessThan のセッターメソッドです。
     * 
     * @param free1OriginCntryFlgLessThan free1OriginCntryFlgLessThan に設定する
     */
    public void setFree1OriginCntryFlgLessThan(String free1OriginCntryFlgLessThan) {
        this.free1OriginCntryFlgLessThan = free1OriginCntryFlgLessThan;
    }

    /**
     * free1OriginCntryFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlgLessThanEqual
     */
    public String getFree1OriginCntryFlgLessThanEqual() {
        return free1OriginCntryFlgLessThanEqual;
    }

    /**
     * free1OriginCntryFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free1OriginCntryFlgLessThanEqual free1OriginCntryFlgLessThanEqual に設定する
     */
    public void setFree1OriginCntryFlgLessThanEqual(String free1OriginCntryFlgLessThanEqual) {
        this.free1OriginCntryFlgLessThanEqual = free1OriginCntryFlgLessThanEqual;
    }

    /**
     * free1OriginCntryFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free1OriginCntryFlgLikeFront
     */
    public String getFree1OriginCntryFlgLikeFront() {
        return free1OriginCntryFlgLikeFront;
    }

    /**
     * free1OriginCntryFlgLikeFront のセッターメソッドです。
     * 
     * @param free1OriginCntryFlgLikeFront free1OriginCntryFlgLikeFront に設定する
     */
    public void setFree1OriginCntryFlgLikeFront(String free1OriginCntryFlgLikeFront) {
        this.free1OriginCntryFlgLikeFront = free1OriginCntryFlgLikeFront;
    }

    /**
     * free2RegFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free2RegFlgGreaterThan
     */
    public String getFree2RegFlgGreaterThan() {
        return free2RegFlgGreaterThan;
    }

    /**
     * free2RegFlgGreaterThan のセッターメソッドです。
     * 
     * @param free2RegFlgGreaterThan free2RegFlgGreaterThan に設定する
     */
    public void setFree2RegFlgGreaterThan(String free2RegFlgGreaterThan) {
        this.free2RegFlgGreaterThan = free2RegFlgGreaterThan;
    }

    /**
     * free2RegFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2RegFlgGreaterThanEqual
     */
    public String getFree2RegFlgGreaterThanEqual() {
        return free2RegFlgGreaterThanEqual;
    }

    /**
     * free2RegFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2RegFlgGreaterThanEqual free2RegFlgGreaterThanEqual に設定する
     */
    public void setFree2RegFlgGreaterThanEqual(String free2RegFlgGreaterThanEqual) {
        this.free2RegFlgGreaterThanEqual = free2RegFlgGreaterThanEqual;
    }

    /**
     * free2RegFlgLessThan のゲッターメソッドです。
     * 
     * @return the free2RegFlgLessThan
     */
    public String getFree2RegFlgLessThan() {
        return free2RegFlgLessThan;
    }

    /**
     * free2RegFlgLessThan のセッターメソッドです。
     * 
     * @param free2RegFlgLessThan free2RegFlgLessThan に設定する
     */
    public void setFree2RegFlgLessThan(String free2RegFlgLessThan) {
        this.free2RegFlgLessThan = free2RegFlgLessThan;
    }

    /**
     * free2RegFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2RegFlgLessThanEqual
     */
    public String getFree2RegFlgLessThanEqual() {
        return free2RegFlgLessThanEqual;
    }

    /**
     * free2RegFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free2RegFlgLessThanEqual free2RegFlgLessThanEqual に設定する
     */
    public void setFree2RegFlgLessThanEqual(String free2RegFlgLessThanEqual) {
        this.free2RegFlgLessThanEqual = free2RegFlgLessThanEqual;
    }

    /**
     * free2RegFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free2RegFlgLikeFront
     */
    public String getFree2RegFlgLikeFront() {
        return free2RegFlgLikeFront;
    }

    /**
     * free2RegFlgLikeFront のセッターメソッドです。
     * 
     * @param free2RegFlgLikeFront free2RegFlgLikeFront に設定する
     */
    public void setFree2RegFlgLikeFront(String free2RegFlgLikeFront) {
        this.free2RegFlgLikeFront = free2RegFlgLikeFront;
    }

    /**
     * free2NmGreaterThan のゲッターメソッドです。
     * 
     * @return the free2NmGreaterThan
     */
    public String getFree2NmGreaterThan() {
        return free2NmGreaterThan;
    }

    /**
     * free2NmGreaterThan のセッターメソッドです。
     * 
     * @param free2NmGreaterThan free2NmGreaterThan に設定する
     */
    public void setFree2NmGreaterThan(String free2NmGreaterThan) {
        this.free2NmGreaterThan = free2NmGreaterThan;
    }

    /**
     * free2NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2NmGreaterThanEqual
     */
    public String getFree2NmGreaterThanEqual() {
        return free2NmGreaterThanEqual;
    }

    /**
     * free2NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2NmGreaterThanEqual free2NmGreaterThanEqual に設定する
     */
    public void setFree2NmGreaterThanEqual(String free2NmGreaterThanEqual) {
        this.free2NmGreaterThanEqual = free2NmGreaterThanEqual;
    }

    /**
     * free2NmLessThan のゲッターメソッドです。
     * 
     * @return the free2NmLessThan
     */
    public String getFree2NmLessThan() {
        return free2NmLessThan;
    }

    /**
     * free2NmLessThan のセッターメソッドです。
     * 
     * @param free2NmLessThan free2NmLessThan に設定する
     */
    public void setFree2NmLessThan(String free2NmLessThan) {
        this.free2NmLessThan = free2NmLessThan;
    }

    /**
     * free2NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2NmLessThanEqual
     */
    public String getFree2NmLessThanEqual() {
        return free2NmLessThanEqual;
    }

    /**
     * free2NmLessThanEqual のセッターメソッドです。
     * 
     * @param free2NmLessThanEqual free2NmLessThanEqual に設定する
     */
    public void setFree2NmLessThanEqual(String free2NmLessThanEqual) {
        this.free2NmLessThanEqual = free2NmLessThanEqual;
    }

    /**
     * free2NmLikeFront のゲッターメソッドです。
     * 
     * @return the free2NmLikeFront
     */
    public String getFree2NmLikeFront() {
        return free2NmLikeFront;
    }

    /**
     * free2NmLikeFront のセッターメソッドです。
     * 
     * @param free2NmLikeFront free2NmLikeFront に設定する
     */
    public void setFree2NmLikeFront(String free2NmLikeFront) {
        this.free2NmLikeFront = free2NmLikeFront;
    }

    /**
     * free2DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free2DtlGreaterThan
     */
    public String getFree2DtlGreaterThan() {
        return free2DtlGreaterThan;
    }

    /**
     * free2DtlGreaterThan のセッターメソッドです。
     * 
     * @param free2DtlGreaterThan free2DtlGreaterThan に設定する
     */
    public void setFree2DtlGreaterThan(String free2DtlGreaterThan) {
        this.free2DtlGreaterThan = free2DtlGreaterThan;
    }

    /**
     * free2DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2DtlGreaterThanEqual
     */
    public String getFree2DtlGreaterThanEqual() {
        return free2DtlGreaterThanEqual;
    }

    /**
     * free2DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2DtlGreaterThanEqual free2DtlGreaterThanEqual に設定する
     */
    public void setFree2DtlGreaterThanEqual(String free2DtlGreaterThanEqual) {
        this.free2DtlGreaterThanEqual = free2DtlGreaterThanEqual;
    }

    /**
     * free2DtlLessThan のゲッターメソッドです。
     * 
     * @return the free2DtlLessThan
     */
    public String getFree2DtlLessThan() {
        return free2DtlLessThan;
    }

    /**
     * free2DtlLessThan のセッターメソッドです。
     * 
     * @param free2DtlLessThan free2DtlLessThan に設定する
     */
    public void setFree2DtlLessThan(String free2DtlLessThan) {
        this.free2DtlLessThan = free2DtlLessThan;
    }

    /**
     * free2DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2DtlLessThanEqual
     */
    public String getFree2DtlLessThanEqual() {
        return free2DtlLessThanEqual;
    }

    /**
     * free2DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free2DtlLessThanEqual free2DtlLessThanEqual に設定する
     */
    public void setFree2DtlLessThanEqual(String free2DtlLessThanEqual) {
        this.free2DtlLessThanEqual = free2DtlLessThanEqual;
    }

    /**
     * free2DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free2DtlLikeFront
     */
    public String getFree2DtlLikeFront() {
        return free2DtlLikeFront;
    }

    /**
     * free2DtlLikeFront のセッターメソッドです。
     * 
     * @param free2DtlLikeFront free2DtlLikeFront に設定する
     */
    public void setFree2DtlLikeFront(String free2DtlLikeFront) {
        this.free2DtlLikeFront = free2DtlLikeFront;
    }

    /**
     * free2OriginCntryFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlgGreaterThan
     */
    public String getFree2OriginCntryFlgGreaterThan() {
        return free2OriginCntryFlgGreaterThan;
    }

    /**
     * free2OriginCntryFlgGreaterThan のセッターメソッドです。
     * 
     * @param free2OriginCntryFlgGreaterThan free2OriginCntryFlgGreaterThan に設定する
     */
    public void setFree2OriginCntryFlgGreaterThan(String free2OriginCntryFlgGreaterThan) {
        this.free2OriginCntryFlgGreaterThan = free2OriginCntryFlgGreaterThan;
    }

    /**
     * free2OriginCntryFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlgGreaterThanEqual
     */
    public String getFree2OriginCntryFlgGreaterThanEqual() {
        return free2OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free2OriginCntryFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2OriginCntryFlgGreaterThanEqual free2OriginCntryFlgGreaterThanEqual に設定する
     */
    public void setFree2OriginCntryFlgGreaterThanEqual(String free2OriginCntryFlgGreaterThanEqual) {
        this.free2OriginCntryFlgGreaterThanEqual = free2OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free2OriginCntryFlgLessThan のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlgLessThan
     */
    public String getFree2OriginCntryFlgLessThan() {
        return free2OriginCntryFlgLessThan;
    }

    /**
     * free2OriginCntryFlgLessThan のセッターメソッドです。
     * 
     * @param free2OriginCntryFlgLessThan free2OriginCntryFlgLessThan に設定する
     */
    public void setFree2OriginCntryFlgLessThan(String free2OriginCntryFlgLessThan) {
        this.free2OriginCntryFlgLessThan = free2OriginCntryFlgLessThan;
    }

    /**
     * free2OriginCntryFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlgLessThanEqual
     */
    public String getFree2OriginCntryFlgLessThanEqual() {
        return free2OriginCntryFlgLessThanEqual;
    }

    /**
     * free2OriginCntryFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free2OriginCntryFlgLessThanEqual free2OriginCntryFlgLessThanEqual に設定する
     */
    public void setFree2OriginCntryFlgLessThanEqual(String free2OriginCntryFlgLessThanEqual) {
        this.free2OriginCntryFlgLessThanEqual = free2OriginCntryFlgLessThanEqual;
    }

    /**
     * free2OriginCntryFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free2OriginCntryFlgLikeFront
     */
    public String getFree2OriginCntryFlgLikeFront() {
        return free2OriginCntryFlgLikeFront;
    }

    /**
     * free2OriginCntryFlgLikeFront のセッターメソッドです。
     * 
     * @param free2OriginCntryFlgLikeFront free2OriginCntryFlgLikeFront に設定する
     */
    public void setFree2OriginCntryFlgLikeFront(String free2OriginCntryFlgLikeFront) {
        this.free2OriginCntryFlgLikeFront = free2OriginCntryFlgLikeFront;
    }

    /**
     * free3RegFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free3RegFlgGreaterThan
     */
    public String getFree3RegFlgGreaterThan() {
        return free3RegFlgGreaterThan;
    }

    /**
     * free3RegFlgGreaterThan のセッターメソッドです。
     * 
     * @param free3RegFlgGreaterThan free3RegFlgGreaterThan に設定する
     */
    public void setFree3RegFlgGreaterThan(String free3RegFlgGreaterThan) {
        this.free3RegFlgGreaterThan = free3RegFlgGreaterThan;
    }

    /**
     * free3RegFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3RegFlgGreaterThanEqual
     */
    public String getFree3RegFlgGreaterThanEqual() {
        return free3RegFlgGreaterThanEqual;
    }

    /**
     * free3RegFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3RegFlgGreaterThanEqual free3RegFlgGreaterThanEqual に設定する
     */
    public void setFree3RegFlgGreaterThanEqual(String free3RegFlgGreaterThanEqual) {
        this.free3RegFlgGreaterThanEqual = free3RegFlgGreaterThanEqual;
    }

    /**
     * free3RegFlgLessThan のゲッターメソッドです。
     * 
     * @return the free3RegFlgLessThan
     */
    public String getFree3RegFlgLessThan() {
        return free3RegFlgLessThan;
    }

    /**
     * free3RegFlgLessThan のセッターメソッドです。
     * 
     * @param free3RegFlgLessThan free3RegFlgLessThan に設定する
     */
    public void setFree3RegFlgLessThan(String free3RegFlgLessThan) {
        this.free3RegFlgLessThan = free3RegFlgLessThan;
    }

    /**
     * free3RegFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3RegFlgLessThanEqual
     */
    public String getFree3RegFlgLessThanEqual() {
        return free3RegFlgLessThanEqual;
    }

    /**
     * free3RegFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free3RegFlgLessThanEqual free3RegFlgLessThanEqual に設定する
     */
    public void setFree3RegFlgLessThanEqual(String free3RegFlgLessThanEqual) {
        this.free3RegFlgLessThanEqual = free3RegFlgLessThanEqual;
    }

    /**
     * free3RegFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free3RegFlgLikeFront
     */
    public String getFree3RegFlgLikeFront() {
        return free3RegFlgLikeFront;
    }

    /**
     * free3RegFlgLikeFront のセッターメソッドです。
     * 
     * @param free3RegFlgLikeFront free3RegFlgLikeFront に設定する
     */
    public void setFree3RegFlgLikeFront(String free3RegFlgLikeFront) {
        this.free3RegFlgLikeFront = free3RegFlgLikeFront;
    }

    /**
     * free3NmGreaterThan のゲッターメソッドです。
     * 
     * @return the free3NmGreaterThan
     */
    public String getFree3NmGreaterThan() {
        return free3NmGreaterThan;
    }

    /**
     * free3NmGreaterThan のセッターメソッドです。
     * 
     * @param free3NmGreaterThan free3NmGreaterThan に設定する
     */
    public void setFree3NmGreaterThan(String free3NmGreaterThan) {
        this.free3NmGreaterThan = free3NmGreaterThan;
    }

    /**
     * free3NmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3NmGreaterThanEqual
     */
    public String getFree3NmGreaterThanEqual() {
        return free3NmGreaterThanEqual;
    }

    /**
     * free3NmGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3NmGreaterThanEqual free3NmGreaterThanEqual に設定する
     */
    public void setFree3NmGreaterThanEqual(String free3NmGreaterThanEqual) {
        this.free3NmGreaterThanEqual = free3NmGreaterThanEqual;
    }

    /**
     * free3NmLessThan のゲッターメソッドです。
     * 
     * @return the free3NmLessThan
     */
    public String getFree3NmLessThan() {
        return free3NmLessThan;
    }

    /**
     * free3NmLessThan のセッターメソッドです。
     * 
     * @param free3NmLessThan free3NmLessThan に設定する
     */
    public void setFree3NmLessThan(String free3NmLessThan) {
        this.free3NmLessThan = free3NmLessThan;
    }

    /**
     * free3NmLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3NmLessThanEqual
     */
    public String getFree3NmLessThanEqual() {
        return free3NmLessThanEqual;
    }

    /**
     * free3NmLessThanEqual のセッターメソッドです。
     * 
     * @param free3NmLessThanEqual free3NmLessThanEqual に設定する
     */
    public void setFree3NmLessThanEqual(String free3NmLessThanEqual) {
        this.free3NmLessThanEqual = free3NmLessThanEqual;
    }

    /**
     * free3NmLikeFront のゲッターメソッドです。
     * 
     * @return the free3NmLikeFront
     */
    public String getFree3NmLikeFront() {
        return free3NmLikeFront;
    }

    /**
     * free3NmLikeFront のセッターメソッドです。
     * 
     * @param free3NmLikeFront free3NmLikeFront に設定する
     */
    public void setFree3NmLikeFront(String free3NmLikeFront) {
        this.free3NmLikeFront = free3NmLikeFront;
    }

    /**
     * free3DtlGreaterThan のゲッターメソッドです。
     * 
     * @return the free3DtlGreaterThan
     */
    public String getFree3DtlGreaterThan() {
        return free3DtlGreaterThan;
    }

    /**
     * free3DtlGreaterThan のセッターメソッドです。
     * 
     * @param free3DtlGreaterThan free3DtlGreaterThan に設定する
     */
    public void setFree3DtlGreaterThan(String free3DtlGreaterThan) {
        this.free3DtlGreaterThan = free3DtlGreaterThan;
    }

    /**
     * free3DtlGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3DtlGreaterThanEqual
     */
    public String getFree3DtlGreaterThanEqual() {
        return free3DtlGreaterThanEqual;
    }

    /**
     * free3DtlGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3DtlGreaterThanEqual free3DtlGreaterThanEqual に設定する
     */
    public void setFree3DtlGreaterThanEqual(String free3DtlGreaterThanEqual) {
        this.free3DtlGreaterThanEqual = free3DtlGreaterThanEqual;
    }

    /**
     * free3DtlLessThan のゲッターメソッドです。
     * 
     * @return the free3DtlLessThan
     */
    public String getFree3DtlLessThan() {
        return free3DtlLessThan;
    }

    /**
     * free3DtlLessThan のセッターメソッドです。
     * 
     * @param free3DtlLessThan free3DtlLessThan に設定する
     */
    public void setFree3DtlLessThan(String free3DtlLessThan) {
        this.free3DtlLessThan = free3DtlLessThan;
    }

    /**
     * free3DtlLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3DtlLessThanEqual
     */
    public String getFree3DtlLessThanEqual() {
        return free3DtlLessThanEqual;
    }

    /**
     * free3DtlLessThanEqual のセッターメソッドです。
     * 
     * @param free3DtlLessThanEqual free3DtlLessThanEqual に設定する
     */
    public void setFree3DtlLessThanEqual(String free3DtlLessThanEqual) {
        this.free3DtlLessThanEqual = free3DtlLessThanEqual;
    }

    /**
     * free3DtlLikeFront のゲッターメソッドです。
     * 
     * @return the free3DtlLikeFront
     */
    public String getFree3DtlLikeFront() {
        return free3DtlLikeFront;
    }

    /**
     * free3DtlLikeFront のセッターメソッドです。
     * 
     * @param free3DtlLikeFront free3DtlLikeFront に設定する
     */
    public void setFree3DtlLikeFront(String free3DtlLikeFront) {
        this.free3DtlLikeFront = free3DtlLikeFront;
    }

    /**
     * free3OriginCntryFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlgGreaterThan
     */
    public String getFree3OriginCntryFlgGreaterThan() {
        return free3OriginCntryFlgGreaterThan;
    }

    /**
     * free3OriginCntryFlgGreaterThan のセッターメソッドです。
     * 
     * @param free3OriginCntryFlgGreaterThan free3OriginCntryFlgGreaterThan に設定する
     */
    public void setFree3OriginCntryFlgGreaterThan(String free3OriginCntryFlgGreaterThan) {
        this.free3OriginCntryFlgGreaterThan = free3OriginCntryFlgGreaterThan;
    }

    /**
     * free3OriginCntryFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlgGreaterThanEqual
     */
    public String getFree3OriginCntryFlgGreaterThanEqual() {
        return free3OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free3OriginCntryFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3OriginCntryFlgGreaterThanEqual free3OriginCntryFlgGreaterThanEqual に設定する
     */
    public void setFree3OriginCntryFlgGreaterThanEqual(String free3OriginCntryFlgGreaterThanEqual) {
        this.free3OriginCntryFlgGreaterThanEqual = free3OriginCntryFlgGreaterThanEqual;
    }

    /**
     * free3OriginCntryFlgLessThan のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlgLessThan
     */
    public String getFree3OriginCntryFlgLessThan() {
        return free3OriginCntryFlgLessThan;
    }

    /**
     * free3OriginCntryFlgLessThan のセッターメソッドです。
     * 
     * @param free3OriginCntryFlgLessThan free3OriginCntryFlgLessThan に設定する
     */
    public void setFree3OriginCntryFlgLessThan(String free3OriginCntryFlgLessThan) {
        this.free3OriginCntryFlgLessThan = free3OriginCntryFlgLessThan;
    }

    /**
     * free3OriginCntryFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlgLessThanEqual
     */
    public String getFree3OriginCntryFlgLessThanEqual() {
        return free3OriginCntryFlgLessThanEqual;
    }

    /**
     * free3OriginCntryFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free3OriginCntryFlgLessThanEqual free3OriginCntryFlgLessThanEqual に設定する
     */
    public void setFree3OriginCntryFlgLessThanEqual(String free3OriginCntryFlgLessThanEqual) {
        this.free3OriginCntryFlgLessThanEqual = free3OriginCntryFlgLessThanEqual;
    }

    /**
     * free3OriginCntryFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free3OriginCntryFlgLikeFront
     */
    public String getFree3OriginCntryFlgLikeFront() {
        return free3OriginCntryFlgLikeFront;
    }

    /**
     * free3OriginCntryFlgLikeFront のセッターメソッドです。
     * 
     * @param free3OriginCntryFlgLikeFront free3OriginCntryFlgLikeFront に設定する
     */
    public void setFree3OriginCntryFlgLikeFront(String free3OriginCntryFlgLikeFront) {
        this.free3OriginCntryFlgLikeFront = free3OriginCntryFlgLikeFront;
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
     * grpNo1GreaterThan のゲッターメソッドです。
     * 
     * @return the grpNo1GreaterThan
     */
    public String getGrpNo1GreaterThan() {
        return grpNo1GreaterThan;
    }

    /**
     * grpNo1GreaterThan のセッターメソッドです。
     * 
     * @param grpNo1GreaterThan grpNo1GreaterThan に設定する
     */
    public void setGrpNo1GreaterThan(String grpNo1GreaterThan) {
        this.grpNo1GreaterThan = grpNo1GreaterThan;
    }

    /**
     * grpNo1GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo1GreaterThanEqual
     */
    public String getGrpNo1GreaterThanEqual() {
        return grpNo1GreaterThanEqual;
    }

    /**
     * grpNo1GreaterThanEqual のセッターメソッドです。
     * 
     * @param grpNo1GreaterThanEqual grpNo1GreaterThanEqual に設定する
     */
    public void setGrpNo1GreaterThanEqual(String grpNo1GreaterThanEqual) {
        this.grpNo1GreaterThanEqual = grpNo1GreaterThanEqual;
    }

    /**
     * grpNo1LessThan のゲッターメソッドです。
     * 
     * @return the grpNo1LessThan
     */
    public String getGrpNo1LessThan() {
        return grpNo1LessThan;
    }

    /**
     * grpNo1LessThan のセッターメソッドです。
     * 
     * @param grpNo1LessThan grpNo1LessThan に設定する
     */
    public void setGrpNo1LessThan(String grpNo1LessThan) {
        this.grpNo1LessThan = grpNo1LessThan;
    }

    /**
     * grpNo1LessThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo1LessThanEqual
     */
    public String getGrpNo1LessThanEqual() {
        return grpNo1LessThanEqual;
    }

    /**
     * grpNo1LessThanEqual のセッターメソッドです。
     * 
     * @param grpNo1LessThanEqual grpNo1LessThanEqual に設定する
     */
    public void setGrpNo1LessThanEqual(String grpNo1LessThanEqual) {
        this.grpNo1LessThanEqual = grpNo1LessThanEqual;
    }

    /**
     * grpNo1LikeFront のゲッターメソッドです。
     * 
     * @return the grpNo1LikeFront
     */
    public String getGrpNo1LikeFront() {
        return grpNo1LikeFront;
    }

    /**
     * grpNo1LikeFront のセッターメソッドです。
     * 
     * @param grpNo1LikeFront grpNo1LikeFront に設定する
     */
    public void setGrpNo1LikeFront(String grpNo1LikeFront) {
        this.grpNo1LikeFront = grpNo1LikeFront;
    }

    /**
     * grpNo2GreaterThan のゲッターメソッドです。
     * 
     * @return the grpNo2GreaterThan
     */
    public String getGrpNo2GreaterThan() {
        return grpNo2GreaterThan;
    }

    /**
     * grpNo2GreaterThan のセッターメソッドです。
     * 
     * @param grpNo2GreaterThan grpNo2GreaterThan に設定する
     */
    public void setGrpNo2GreaterThan(String grpNo2GreaterThan) {
        this.grpNo2GreaterThan = grpNo2GreaterThan;
    }

    /**
     * grpNo2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo2GreaterThanEqual
     */
    public String getGrpNo2GreaterThanEqual() {
        return grpNo2GreaterThanEqual;
    }

    /**
     * grpNo2GreaterThanEqual のセッターメソッドです。
     * 
     * @param grpNo2GreaterThanEqual grpNo2GreaterThanEqual に設定する
     */
    public void setGrpNo2GreaterThanEqual(String grpNo2GreaterThanEqual) {
        this.grpNo2GreaterThanEqual = grpNo2GreaterThanEqual;
    }

    /**
     * grpNo2LessThan のゲッターメソッドです。
     * 
     * @return the grpNo2LessThan
     */
    public String getGrpNo2LessThan() {
        return grpNo2LessThan;
    }

    /**
     * grpNo2LessThan のセッターメソッドです。
     * 
     * @param grpNo2LessThan grpNo2LessThan に設定する
     */
    public void setGrpNo2LessThan(String grpNo2LessThan) {
        this.grpNo2LessThan = grpNo2LessThan;
    }

    /**
     * grpNo2LessThanEqual のゲッターメソッドです。
     * 
     * @return the grpNo2LessThanEqual
     */
    public String getGrpNo2LessThanEqual() {
        return grpNo2LessThanEqual;
    }

    /**
     * grpNo2LessThanEqual のセッターメソッドです。
     * 
     * @param grpNo2LessThanEqual grpNo2LessThanEqual に設定する
     */
    public void setGrpNo2LessThanEqual(String grpNo2LessThanEqual) {
        this.grpNo2LessThanEqual = grpNo2LessThanEqual;
    }

    /**
     * grpNo2LikeFront のゲッターメソッドです。
     * 
     * @return the grpNo2LikeFront
     */
    public String getGrpNo2LikeFront() {
        return grpNo2LikeFront;
    }

    /**
     * grpNo2LikeFront のセッターメソッドです。
     * 
     * @param grpNo2LikeFront grpNo2LikeFront に設定する
     */
    public void setGrpNo2LikeFront(String grpNo2LikeFront) {
        this.grpNo2LikeFront = grpNo2LikeFront;
    }

    /**
     * removeFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the removeFlgGreaterThan
     */
    public String getRemoveFlgGreaterThan() {
        return removeFlgGreaterThan;
    }

    /**
     * removeFlgGreaterThan のセッターメソッドです。
     * 
     * @param removeFlgGreaterThan removeFlgGreaterThan に設定する
     */
    public void setRemoveFlgGreaterThan(String removeFlgGreaterThan) {
        this.removeFlgGreaterThan = removeFlgGreaterThan;
    }

    /**
     * removeFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the removeFlgGreaterThanEqual
     */
    public String getRemoveFlgGreaterThanEqual() {
        return removeFlgGreaterThanEqual;
    }

    /**
     * removeFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param removeFlgGreaterThanEqual removeFlgGreaterThanEqual に設定する
     */
    public void setRemoveFlgGreaterThanEqual(String removeFlgGreaterThanEqual) {
        this.removeFlgGreaterThanEqual = removeFlgGreaterThanEqual;
    }

    /**
     * removeFlgLessThan のゲッターメソッドです。
     * 
     * @return the removeFlgLessThan
     */
    public String getRemoveFlgLessThan() {
        return removeFlgLessThan;
    }

    /**
     * removeFlgLessThan のセッターメソッドです。
     * 
     * @param removeFlgLessThan removeFlgLessThan に設定する
     */
    public void setRemoveFlgLessThan(String removeFlgLessThan) {
        this.removeFlgLessThan = removeFlgLessThan;
    }

    /**
     * removeFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the removeFlgLessThanEqual
     */
    public String getRemoveFlgLessThanEqual() {
        return removeFlgLessThanEqual;
    }

    /**
     * removeFlgLessThanEqual のセッターメソッドです。
     * 
     * @param removeFlgLessThanEqual removeFlgLessThanEqual に設定する
     */
    public void setRemoveFlgLessThanEqual(String removeFlgLessThanEqual) {
        this.removeFlgLessThanEqual = removeFlgLessThanEqual;
    }

    /**
     * removeFlgLikeFront のゲッターメソッドです。
     * 
     * @return the removeFlgLikeFront
     */
    public String getRemoveFlgLikeFront() {
        return removeFlgLikeFront;
    }

    /**
     * removeFlgLikeFront のセッターメソッドです。
     * 
     * @param removeFlgLikeFront removeFlgLikeFront に設定する
     */
    public void setRemoveFlgLikeFront(String removeFlgLikeFront) {
        this.removeFlgLikeFront = removeFlgLikeFront;
    }

    /**
     * decisionFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the decisionFlgGreaterThan
     */
    public String getDecisionFlgGreaterThan() {
        return decisionFlgGreaterThan;
    }

    /**
     * decisionFlgGreaterThan のセッターメソッドです。
     * 
     * @param decisionFlgGreaterThan decisionFlgGreaterThan に設定する
     */
    public void setDecisionFlgGreaterThan(String decisionFlgGreaterThan) {
        this.decisionFlgGreaterThan = decisionFlgGreaterThan;
    }

    /**
     * decisionFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the decisionFlgGreaterThanEqual
     */
    public String getDecisionFlgGreaterThanEqual() {
        return decisionFlgGreaterThanEqual;
    }

    /**
     * decisionFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param decisionFlgGreaterThanEqual decisionFlgGreaterThanEqual に設定する
     */
    public void setDecisionFlgGreaterThanEqual(String decisionFlgGreaterThanEqual) {
        this.decisionFlgGreaterThanEqual = decisionFlgGreaterThanEqual;
    }

    /**
     * decisionFlgLessThan のゲッターメソッドです。
     * 
     * @return the decisionFlgLessThan
     */
    public String getDecisionFlgLessThan() {
        return decisionFlgLessThan;
    }

    /**
     * decisionFlgLessThan のセッターメソッドです。
     * 
     * @param decisionFlgLessThan decisionFlgLessThan に設定する
     */
    public void setDecisionFlgLessThan(String decisionFlgLessThan) {
        this.decisionFlgLessThan = decisionFlgLessThan;
    }

    /**
     * decisionFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the decisionFlgLessThanEqual
     */
    public String getDecisionFlgLessThanEqual() {
        return decisionFlgLessThanEqual;
    }

    /**
     * decisionFlgLessThanEqual のセッターメソッドです。
     * 
     * @param decisionFlgLessThanEqual decisionFlgLessThanEqual に設定する
     */
    public void setDecisionFlgLessThanEqual(String decisionFlgLessThanEqual) {
        this.decisionFlgLessThanEqual = decisionFlgLessThanEqual;
    }

    /**
     * decisionFlgLikeFront のゲッターメソッドです。
     * 
     * @return the decisionFlgLikeFront
     */
    public String getDecisionFlgLikeFront() {
        return decisionFlgLikeFront;
    }

    /**
     * decisionFlgLikeFront のセッターメソッドです。
     * 
     * @param decisionFlgLikeFront decisionFlgLikeFront に設定する
     */
    public void setDecisionFlgLikeFront(String decisionFlgLikeFront) {
        this.decisionFlgLikeFront = decisionFlgLikeFront;
    }

    /**
     * tempInvoiceNoGreaterThan のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoGreaterThan
     */
    public String getTempInvoiceNoGreaterThan() {
        return tempInvoiceNoGreaterThan;
    }

    /**
     * tempInvoiceNoGreaterThan のセッターメソッドです。
     * 
     * @param tempInvoiceNoGreaterThan tempInvoiceNoGreaterThan に設定する
     */
    public void setTempInvoiceNoGreaterThan(String tempInvoiceNoGreaterThan) {
        this.tempInvoiceNoGreaterThan = tempInvoiceNoGreaterThan;
    }

    /**
     * tempInvoiceNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoGreaterThanEqual
     */
    public String getTempInvoiceNoGreaterThanEqual() {
        return tempInvoiceNoGreaterThanEqual;
    }

    /**
     * tempInvoiceNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param tempInvoiceNoGreaterThanEqual tempInvoiceNoGreaterThanEqual に設定する
     */
    public void setTempInvoiceNoGreaterThanEqual(String tempInvoiceNoGreaterThanEqual) {
        this.tempInvoiceNoGreaterThanEqual = tempInvoiceNoGreaterThanEqual;
    }

    /**
     * tempInvoiceNoLessThan のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLessThan
     */
    public String getTempInvoiceNoLessThan() {
        return tempInvoiceNoLessThan;
    }

    /**
     * tempInvoiceNoLessThan のセッターメソッドです。
     * 
     * @param tempInvoiceNoLessThan tempInvoiceNoLessThan に設定する
     */
    public void setTempInvoiceNoLessThan(String tempInvoiceNoLessThan) {
        this.tempInvoiceNoLessThan = tempInvoiceNoLessThan;
    }

    /**
     * tempInvoiceNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLessThanEqual
     */
    public String getTempInvoiceNoLessThanEqual() {
        return tempInvoiceNoLessThanEqual;
    }

    /**
     * tempInvoiceNoLessThanEqual のセッターメソッドです。
     * 
     * @param tempInvoiceNoLessThanEqual tempInvoiceNoLessThanEqual に設定する
     */
    public void setTempInvoiceNoLessThanEqual(String tempInvoiceNoLessThanEqual) {
        this.tempInvoiceNoLessThanEqual = tempInvoiceNoLessThanEqual;
    }

    /**
     * tempInvoiceNoLikeFront のゲッターメソッドです。
     * 
     * @return the tempInvoiceNoLikeFront
     */
    public String getTempInvoiceNoLikeFront() {
        return tempInvoiceNoLikeFront;
    }

    /**
     * tempInvoiceNoLikeFront のセッターメソッドです。
     * 
     * @param tempInvoiceNoLikeFront tempInvoiceNoLikeFront に設定する
     */
    public void setTempInvoiceNoLikeFront(String tempInvoiceNoLikeFront) {
        this.tempInvoiceNoLikeFront = tempInvoiceNoLikeFront;
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

