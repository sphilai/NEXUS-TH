/*
 * PROJECT：eca0027
 * 
 * TtScAttached の検索条件Domainクラス
 * テーブル概要：Sales Contract Attached/セールスコントラクトアタッチ  Table that contains the detail information of the item number unit, which is output in the accompanying form of Sales contract. The underlying information to be global coordination document sharing ./Sales contractの添付帳票に出力される品目番号単位の明細情報を格納するテーブル。グローバル書類共有に連携する元情報となる。
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/09/22  DNITS  新規作成
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
 * TtScAttached の検索条件Domainクラスです。<BR>
 * テーブル概要：Sales Contract Attached/セールスコントラクトアタッチ  Table that contains the detail information of the item number unit, which is output in the accompanying form of Sales contract. The underlying information to be global coordination document sharing ./Sales contractの添付帳票に出力される品目番号単位の明細情報を格納するテーブル。グローバル書類共有に連携する元情報となる。<BR>
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
public class TtScAttachedCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * INVOICE NO/インボイスNO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE/インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * RECORD NO/レコード番号
     */
    private BigDecimal recordNo;

    /**
     * INVOICE CLASS/インボイス種類  M:Main, F:Full-RT, E:E-RT
     */
    private String invoiceClass;

    /**
     * CANCEL TYPE/キャンセル区分  N:Normal, C:Cancel
     */
    private String cancelTyp;

    /**
     * CUSTOMER PO NO/得意先PO NO  M場合のみ入る。
     */
    private String customerPoNo;

    /**
     * CUSTOMER ITEM NO/得意先品目番号  M場合のみ入る。
     */
    private String customerItemNo;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。
     */
    private String itemNo;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。
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
     * KIT FLAG/KIT品フラグ  Y:Export Request KIT Item, N:Not
     */
    private String kitFlg;

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
     * ORIGIN COUNTRY CODE/原産国コード
     */
    private String originCntryCd;

    /**
     * ORIGIN COUNTRY NAME/原産国名
     */
    private String originCntryNm;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。
     */
    private String free1Dtl;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。
     */
    private String free2Dtl;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。
     */
    private String free3Dtl;

    /**
     * HS CODE/HSコード
     */
    private String hsCd;

    /**
     * UNIT PRICE/単価
     */
    private BigDecimal unitPrice;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨
     */
    private String unitPriceCurrCd;

    /**
     * QUANTITY/数量
     */
    private BigDecimal qty;

    /**
     * QUANTITY UNIT/数量単位
     */
    private String qtyUnit;

    /**
     * AMOUNT/合計金額  品目番号ごとの合計金額
     */
    private BigDecimal amount;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨
     */
    private String amountCurrCd;

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
     * INVOICE ISSUE DATE/インボイス発行日（大なりイコール）
     */
    private Date invoiceIssueDtGreaterThanEqual;

    /**
     * INVOICE ISSUE DATE/インボイス発行日（小なりイコール）
     */
    private Date invoiceIssueDtLessThanEqual;

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
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。（大なり）
     */
    private String itemNoGreaterThan;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。（大なりイコール）
     */
    private String itemNoGreaterThanEqual;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。（小なり）
     */
    private String itemNoLessThan;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。（小なりイコール）
     */
    private String itemNoLessThanEqual;

    /**
     * ITEM NO/品目番号  F,Eの場合、包装材品目番号が入る。（前方一致）
     */
    private String itemNoLikeFront;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。（大なり）
     */
    private String pkgCdGreaterThan;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。（大なりイコール）
     */
    private String pkgCdGreaterThanEqual;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。（小なり）
     */
    private String pkgCdLessThan;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。（小なりイコール）
     */
    private String pkgCdLessThanEqual;

    /**
     * PACKAGE CODE/包装区分  M場合のみ入る。（前方一致）
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
     * ORIGIN COUNTRY NAME/原産国名（大なり）
     */
    private String originCntryNmGreaterThan;

    /**
     * ORIGIN COUNTRY NAME/原産国名（大なりイコール）
     */
    private String originCntryNmGreaterThanEqual;

    /**
     * ORIGIN COUNTRY NAME/原産国名（小なり）
     */
    private String originCntryNmLessThan;

    /**
     * ORIGIN COUNTRY NAME/原産国名（小なりイコール）
     */
    private String originCntryNmLessThanEqual;

    /**
     * ORIGIN COUNTRY NAME/原産国名（前方一致）
     */
    private String originCntryNmLikeFront;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。（大なり）
     */
    private String free1DtlGreaterThan;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。（大なりイコール）
     */
    private String free1DtlGreaterThanEqual;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。（小なり）
     */
    private String free1DtlLessThan;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。（小なりイコール）
     */
    private String free1DtlLessThanEqual;

    /**
     * FREE 1 DETAIL/フリー1内容  M場合のみ入る。（前方一致）
     */
    private String free1DtlLikeFront;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。（大なり）
     */
    private String free2DtlGreaterThan;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。（大なりイコール）
     */
    private String free2DtlGreaterThanEqual;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。（小なり）
     */
    private String free2DtlLessThan;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。（小なりイコール）
     */
    private String free2DtlLessThanEqual;

    /**
     * FREE 2 DETAIL/フリー2内容  M場合のみ入る。（前方一致）
     */
    private String free2DtlLikeFront;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。（大なり）
     */
    private String free3DtlGreaterThan;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。（大なりイコール）
     */
    private String free3DtlGreaterThanEqual;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。（小なり）
     */
    private String free3DtlLessThan;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。（小なりイコール）
     */
    private String free3DtlLessThanEqual;

    /**
     * FREE 3 DETAIL/フリー3内容  M場合のみ入る。（前方一致）
     */
    private String free3DtlLikeFront;

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
     * UNIT PRICE CURRENCY CODE/単価_通貨（大なり）
     */
    private String unitPriceCurrCdGreaterThan;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨（大なりイコール）
     */
    private String unitPriceCurrCdGreaterThanEqual;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨（小なり）
     */
    private String unitPriceCurrCdLessThan;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨（小なりイコール）
     */
    private String unitPriceCurrCdLessThanEqual;

    /**
     * UNIT PRICE CURRENCY CODE/単価_通貨（前方一致）
     */
    private String unitPriceCurrCdLikeFront;

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
     * AMOUNT CURRENCY CODE/合計金額_通貨（大なり）
     */
    private String amountCurrCdGreaterThan;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨（大なりイコール）
     */
    private String amountCurrCdGreaterThanEqual;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨（小なり）
     */
    private String amountCurrCdLessThan;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨（小なりイコール）
     */
    private String amountCurrCdLessThanEqual;

    /**
     * AMOUNT CURRENCY CODE/合計金額_通貨（前方一致）
     */
    private String amountCurrCdLikeFront;

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
    public TtScAttachedCriteriaDomain() {
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
     * recordNo のゲッターメソッドです。
     * 
     * @return the recordNo
     */
    public BigDecimal getRecordNo() {
        return recordNo;
    }

    /**
     * recordNo のセッターメソッドです。
     * 
     * @param recordNo recordNo に設定する
     */
    public void setRecordNo(BigDecimal recordNo) {
        this.recordNo = recordNo;
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
     * originCntryNm のゲッターメソッドです。
     * 
     * @return the originCntryNm
     */
    public String getOriginCntryNm() {
        return originCntryNm;
    }

    /**
     * originCntryNm のセッターメソッドです。
     * 
     * @param originCntryNm originCntryNm に設定する
     */
    public void setOriginCntryNm(String originCntryNm) {
        this.originCntryNm = originCntryNm;
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
     * unitPriceCurrCd のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCd
     */
    public String getUnitPriceCurrCd() {
        return unitPriceCurrCd;
    }

    /**
     * unitPriceCurrCd のセッターメソッドです。
     * 
     * @param unitPriceCurrCd unitPriceCurrCd に設定する
     */
    public void setUnitPriceCurrCd(String unitPriceCurrCd) {
        this.unitPriceCurrCd = unitPriceCurrCd;
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
     * amount のゲッターメソッドです。
     * 
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * amount のセッターメソッドです。
     * 
     * @param amount amount に設定する
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * amountCurrCd のゲッターメソッドです。
     * 
     * @return the amountCurrCd
     */
    public String getAmountCurrCd() {
        return amountCurrCd;
    }

    /**
     * amountCurrCd のセッターメソッドです。
     * 
     * @param amountCurrCd amountCurrCd に設定する
     */
    public void setAmountCurrCd(String amountCurrCd) {
        this.amountCurrCd = amountCurrCd;
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
     * originCntryNmGreaterThan のゲッターメソッドです。
     * 
     * @return the originCntryNmGreaterThan
     */
    public String getOriginCntryNmGreaterThan() {
        return originCntryNmGreaterThan;
    }

    /**
     * originCntryNmGreaterThan のセッターメソッドです。
     * 
     * @param originCntryNmGreaterThan originCntryNmGreaterThan に設定する
     */
    public void setOriginCntryNmGreaterThan(String originCntryNmGreaterThan) {
        this.originCntryNmGreaterThan = originCntryNmGreaterThan;
    }

    /**
     * originCntryNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryNmGreaterThanEqual
     */
    public String getOriginCntryNmGreaterThanEqual() {
        return originCntryNmGreaterThanEqual;
    }

    /**
     * originCntryNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param originCntryNmGreaterThanEqual originCntryNmGreaterThanEqual に設定する
     */
    public void setOriginCntryNmGreaterThanEqual(String originCntryNmGreaterThanEqual) {
        this.originCntryNmGreaterThanEqual = originCntryNmGreaterThanEqual;
    }

    /**
     * originCntryNmLessThan のゲッターメソッドです。
     * 
     * @return the originCntryNmLessThan
     */
    public String getOriginCntryNmLessThan() {
        return originCntryNmLessThan;
    }

    /**
     * originCntryNmLessThan のセッターメソッドです。
     * 
     * @param originCntryNmLessThan originCntryNmLessThan に設定する
     */
    public void setOriginCntryNmLessThan(String originCntryNmLessThan) {
        this.originCntryNmLessThan = originCntryNmLessThan;
    }

    /**
     * originCntryNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the originCntryNmLessThanEqual
     */
    public String getOriginCntryNmLessThanEqual() {
        return originCntryNmLessThanEqual;
    }

    /**
     * originCntryNmLessThanEqual のセッターメソッドです。
     * 
     * @param originCntryNmLessThanEqual originCntryNmLessThanEqual に設定する
     */
    public void setOriginCntryNmLessThanEqual(String originCntryNmLessThanEqual) {
        this.originCntryNmLessThanEqual = originCntryNmLessThanEqual;
    }

    /**
     * originCntryNmLikeFront のゲッターメソッドです。
     * 
     * @return the originCntryNmLikeFront
     */
    public String getOriginCntryNmLikeFront() {
        return originCntryNmLikeFront;
    }

    /**
     * originCntryNmLikeFront のセッターメソッドです。
     * 
     * @param originCntryNmLikeFront originCntryNmLikeFront に設定する
     */
    public void setOriginCntryNmLikeFront(String originCntryNmLikeFront) {
        this.originCntryNmLikeFront = originCntryNmLikeFront;
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
     * unitPriceCurrCdGreaterThan のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdGreaterThan
     */
    public String getUnitPriceCurrCdGreaterThan() {
        return unitPriceCurrCdGreaterThan;
    }

    /**
     * unitPriceCurrCdGreaterThan のセッターメソッドです。
     * 
     * @param unitPriceCurrCdGreaterThan unitPriceCurrCdGreaterThan に設定する
     */
    public void setUnitPriceCurrCdGreaterThan(String unitPriceCurrCdGreaterThan) {
        this.unitPriceCurrCdGreaterThan = unitPriceCurrCdGreaterThan;
    }

    /**
     * unitPriceCurrCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdGreaterThanEqual
     */
    public String getUnitPriceCurrCdGreaterThanEqual() {
        return unitPriceCurrCdGreaterThanEqual;
    }

    /**
     * unitPriceCurrCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param unitPriceCurrCdGreaterThanEqual unitPriceCurrCdGreaterThanEqual に設定する
     */
    public void setUnitPriceCurrCdGreaterThanEqual(String unitPriceCurrCdGreaterThanEqual) {
        this.unitPriceCurrCdGreaterThanEqual = unitPriceCurrCdGreaterThanEqual;
    }

    /**
     * unitPriceCurrCdLessThan のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLessThan
     */
    public String getUnitPriceCurrCdLessThan() {
        return unitPriceCurrCdLessThan;
    }

    /**
     * unitPriceCurrCdLessThan のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLessThan unitPriceCurrCdLessThan に設定する
     */
    public void setUnitPriceCurrCdLessThan(String unitPriceCurrCdLessThan) {
        this.unitPriceCurrCdLessThan = unitPriceCurrCdLessThan;
    }

    /**
     * unitPriceCurrCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLessThanEqual
     */
    public String getUnitPriceCurrCdLessThanEqual() {
        return unitPriceCurrCdLessThanEqual;
    }

    /**
     * unitPriceCurrCdLessThanEqual のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLessThanEqual unitPriceCurrCdLessThanEqual に設定する
     */
    public void setUnitPriceCurrCdLessThanEqual(String unitPriceCurrCdLessThanEqual) {
        this.unitPriceCurrCdLessThanEqual = unitPriceCurrCdLessThanEqual;
    }

    /**
     * unitPriceCurrCdLikeFront のゲッターメソッドです。
     * 
     * @return the unitPriceCurrCdLikeFront
     */
    public String getUnitPriceCurrCdLikeFront() {
        return unitPriceCurrCdLikeFront;
    }

    /**
     * unitPriceCurrCdLikeFront のセッターメソッドです。
     * 
     * @param unitPriceCurrCdLikeFront unitPriceCurrCdLikeFront に設定する
     */
    public void setUnitPriceCurrCdLikeFront(String unitPriceCurrCdLikeFront) {
        this.unitPriceCurrCdLikeFront = unitPriceCurrCdLikeFront;
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
     * amountCurrCdGreaterThan のゲッターメソッドです。
     * 
     * @return the amountCurrCdGreaterThan
     */
    public String getAmountCurrCdGreaterThan() {
        return amountCurrCdGreaterThan;
    }

    /**
     * amountCurrCdGreaterThan のセッターメソッドです。
     * 
     * @param amountCurrCdGreaterThan amountCurrCdGreaterThan に設定する
     */
    public void setAmountCurrCdGreaterThan(String amountCurrCdGreaterThan) {
        this.amountCurrCdGreaterThan = amountCurrCdGreaterThan;
    }

    /**
     * amountCurrCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the amountCurrCdGreaterThanEqual
     */
    public String getAmountCurrCdGreaterThanEqual() {
        return amountCurrCdGreaterThanEqual;
    }

    /**
     * amountCurrCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param amountCurrCdGreaterThanEqual amountCurrCdGreaterThanEqual に設定する
     */
    public void setAmountCurrCdGreaterThanEqual(String amountCurrCdGreaterThanEqual) {
        this.amountCurrCdGreaterThanEqual = amountCurrCdGreaterThanEqual;
    }

    /**
     * amountCurrCdLessThan のゲッターメソッドです。
     * 
     * @return the amountCurrCdLessThan
     */
    public String getAmountCurrCdLessThan() {
        return amountCurrCdLessThan;
    }

    /**
     * amountCurrCdLessThan のセッターメソッドです。
     * 
     * @param amountCurrCdLessThan amountCurrCdLessThan に設定する
     */
    public void setAmountCurrCdLessThan(String amountCurrCdLessThan) {
        this.amountCurrCdLessThan = amountCurrCdLessThan;
    }

    /**
     * amountCurrCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the amountCurrCdLessThanEqual
     */
    public String getAmountCurrCdLessThanEqual() {
        return amountCurrCdLessThanEqual;
    }

    /**
     * amountCurrCdLessThanEqual のセッターメソッドです。
     * 
     * @param amountCurrCdLessThanEqual amountCurrCdLessThanEqual に設定する
     */
    public void setAmountCurrCdLessThanEqual(String amountCurrCdLessThanEqual) {
        this.amountCurrCdLessThanEqual = amountCurrCdLessThanEqual;
    }

    /**
     * amountCurrCdLikeFront のゲッターメソッドです。
     * 
     * @return the amountCurrCdLikeFront
     */
    public String getAmountCurrCdLikeFront() {
        return amountCurrCdLikeFront;
    }

    /**
     * amountCurrCdLikeFront のセッターメソッドです。
     * 
     * @param amountCurrCdLikeFront amountCurrCdLikeFront に設定する
     */
    public void setAmountCurrCdLikeFront(String amountCurrCdLikeFront) {
        this.amountCurrCdLikeFront = amountCurrCdLikeFront;
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

