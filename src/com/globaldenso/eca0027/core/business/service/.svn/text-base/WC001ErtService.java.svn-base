/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.dao.WC001ErtDao;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;

/**
 *    This is an interface of Multiple Item No. in 1Box PKG service.
 * <br />小箱内多品サービスのインタフェースです。
 * <pre>
 * bean id: wC001ErtService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public interface WC001ErtService {

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     *    Functional-specification common: Perform a day check in the past.
     * <br />機能仕様共通：過去日チェックを行います。
     * <pre>
     * - functional specification common : past day check
     *       details -- common-specifications .xls -- "-- functional specification common: -- the day check " is referred to in the past
     *
     * - 機能仕様共通：過去日チェック
     *     詳細は共通仕様.xls「機能仕様共通：過去日チェック」を参照
     * </pre>
     * 
     * @param date The date of an optional<br />任意の日付
     * @param dateFormat Date format<br />日付フォーマット
     * @param timezoneId TIMEZONE ID<br />タイムゾーンID
     * @return If the specified date is after a date of record, they are true, otherwise, false.<br />指定された日付が基準日以降であればtrue、そうでなければfalse
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String timezoneId);
    
    /**
     *    A FROM-TO correlation check is performed.
     * <br />FROM-TO相関チェックを行います。
     * <pre>
     * - FROM-TO correlation check
     *       CML No. (From) > CML No. An error is made when it specifies by (To).
     *
     * - FROM-TO相関チェック
     *     CML No. (From) > CML No. (To)で指定した場合エラー
     * </pre>
     * 
     * @param fromCmlNo CML No. (From)
     * @param toCmlNo CML No. (To)
     * @return check result (true or false)
     */
    public boolean validateConsistencyCmlNoFromCmlNoTo(String fromCmlNo, String toCmlNo);
    
    /**
     *    A FROM-TO input check is performed.
     * <br />FROM-TO入力チェックを行います。
     * <pre>
     * - 1.2.FROM-TO input check
     *       CML No. An error is made when only (To) is specified.
     *
     * - 1.2.FROM-TO入力チェック
     *     CML No. (To)のみ指定した場合エラー
     * </pre>
     * 
     * @param fromCmlNo CML No. (from)
     * @param toCmlNo CML No. (to)
     * @return check result (true or false)
     */
    public boolean validateConsistencyCmlNoFromCmlNoToInput(String fromCmlNo, String toCmlNo);
    
    /**
     *    A PACKAGE-ITEM-NO input check is performed.
     * <br />包装材品番入力チェックを行います。
     * <pre>
     * - PACKAGE-ITEM-NO input check
     *       In an input[ of Contents1_PKG_Item_No-Contents15_Qty ]-less (one PACKAGE ITEM NO is not inputted, either) case, an error is made.
     *
     * - 包装材品番入力チェック
     *     Contents1_PKG_Item_No～Contents15_Qtyの入力無し(1件も包装材品番が入力されていない)場合エラー
     * </pre>
     * 
     * @param itemNoList Item No List
     * @param modelCdList Model CD List
     * @param qtyList Qty List
     * @return check result (true or false)
     */
    public boolean validateConsistencyContents(List<String> itemNoList, List<String> modelCdList, List<String> qtyList);
    
    /**
     *    A QUANTITY check Packing-material QUANTITY check is performed.
     * <br />数量チェック-包装材数量チェックを行います。
     * <pre>
     * - QUANTITY check Packing-material QUANTITY check
     *       In the case of Contents1_Qty < 1 ("""", 00, and 000 grades regard it as 0), an error is made.
     *
     * - 数量チェック-包装材数量チェック
     *     Contents1_Qty < 1 (""""、00、000等は0とみなす)の場合エラー
     * </pre>
     * 
     * @param contentsQty Contents Qty List
     * @return check result (true or false)
     */
    public boolean validateConsistencyContentsQty(String contentsQty);
     
    /**
     *    A WEIGHT check is performed.
     * <br />重量チェックを行います。
     * <pre>
     * - WEIGHT check
     *       In the case of G/W <= 0, an error is made.
     *
     * - 重量チェック
     *     G/W <= 0の場合エラー
     * </pre>
     * 
     * @param gw G/W 
     * @return check result (true or false)
     */
    public boolean validateConsistencyGw(String gw);
    
    /**
     *    A length check is performed.
     * <br />長さチェックを行います。
     * <pre>
     * - length check
     *       In the case of Length <= 0, Width <=0, or Height <=0, an error is made.
     *
     * - 長さチェック
     *     Length <= 0 又はWidth <=0 又はHeight <=0の場合エラー
     * </pre>
     * 
     * @param value Length
     * @return check result (true or false)
     */
    public boolean validateConsistencyLengthWidthHeight(String value);
    
    /**
     *    A QUANTITY check palette QUANTITY check is performed.
     * <br />数量チェック-パレット数量チェックを行います。
     * <pre>
     * - QUANTITY check palette QUANTITY check
     *       In the case of Pallet Qty < 1 ("""", 00, and 000 grades regard it as 0), an error is made.
     *
     * - 数量チェック-パレット数量チェック
     *     Pallet Qty < 1 (""""、00、000等は0とみなす)の場合エラー
     * </pre>
     * 
     * @param palletQty Pallet Qty
     * @return check result (true or false)
     */
    public boolean validateConsistencyPalletQty(String palletQty);
    
    /**
     *    A PACKAGE ITEM NO and a QUANTITY related check are performed.
     * <br />包装材品番・数量関連チェックを行います。
     * <pre>
     * - A PACKAGE ITEM NO and QUANTITY related check
     *       (with no those with Contents1_PKG_Item_No input, and Contents1_Qty input)  
     *       or a case (Contents1_PKG_Item_No input nothing and with a Contents1_Qty input) -- error
     *
     * - 包装材品番・数量関連チェック
     *     (Contents1_PKG_Item_No入力有り、且つ、Contents1_Qty入力無し)
     *     又は(Contents1_PKG_Item_No入力無し、且つ、Contents1_Qty入力有り)の場合エラー
     * </pre>
     * 
     * @param itemNo Item No
     * @param qty Qty
     * @return check result (true or false)
     */
    public boolean validateConsistencyPkgItemNoQty(String itemNo, String qty);
    
    /**
     *    An authority check is performed.
     * <br />権限チェックを行います。
     * <pre>
     * - Authority check (update authority)  
     *       The following is made into an argument and this is a call about {@link UserAuthService#hasUserAuthForCompPlnt (String, String, String)}.
     *         - Approval ID:W 2005R
     *         - COMPANY CODE
     *         - PLANT CODE
     *
     * - 権限チェック(更新権限)
     *     以下を引数にして、{@link UserAuthService#hasUserAuthForCompPlnt(String, String, String)}を呼出
     *       - 認可ID:W2005R
     *       - 会社コード
     *       - 製造部工場区分
     * </pre>
     * 
     * @param shipperCd COMPANY CODE<br />会社コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @return If there is a functional utilization right over the COMPANY CODE and PLANT CODE which were specified, they will be true, otherwise, false.<br />指定された会社コード、製造部工場区分に対する機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException When an authority check is not made<br />権限チェックができない場合
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd)
        throws ApplicationException;
    
    // --------------------------------- Database check method validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     *    This is confirmed whether the combination of Shipper, Customer, and Ship to is right.
     * <br />Shipper、Customer、Ship to　の組み合わせが正しいかチェックします。
     * <pre>
     * - Shipper, Customer, and Ship to Combination check
     *       details -- common-specifications .xls -- "-- functional specification common: -- Shipper, Customer, and the Ship to combination check " are referred to
     *
     * - Shipper、Customer、Ship to　組み合わせチェック
     *     詳細は共通仕様.xls「機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @return It will be true if a W/H company and the combination of W/H exist in a NEXUS Warehouse Master, Otherwise, false<br />W/H会社、W/Hの組み合わせが倉庫原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Warehouse Master cannot be referred to<br />倉庫原単位が参照できない場合
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException;
    
    /**
     *    A shipper's existence is checked.
     * <br />荷主の存在をチェックします。
     * <pre>
     * - Shipper existence check
     *       details -- common-specifications .xls -- "-- functional specification common: -- the Shipper existence check " is referred to
     *
     * - Shipper存在チェック
     *     詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return if a COMPANY CODE exists in a NEXUS Company Master as a shipper -- true -- if it kicks right [ that ] -- false<br />会社コードが荷主としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException When the COMPANY CODE is not defined as a NEXUS Company Master as a shipper<br />会社コードが荷主としてNEXUS会社原単位に定義されていない場合
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException;
    
    /**
     *    NEXUS Ship-to existence is checked.
     * <br />NEXUS送荷先存在をチェックします。
     * <pre>
     * - NEXUS Ship To existence check
     *       details -- common-specifications .xls -- "-- functional specification common: -- the NEXUS Ship To existence check " is referred to
     *
     * - NEXUS Ship To存在チェック
     *     詳細は共通仕様.xls「機能仕様共通：NEXUS Ship To存在チェック」を参照
     * </pre>
     * 
     * @param shipTo Ship to<br />送荷先
     * @return If a Ship to exists in a NEXUS Ship To Master, they will be true, otherwise, false.<br />送荷先がNEXUS送荷先原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Ship To Master cannot be referred to<br />NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseShipTo(String shipTo)
        throws ApplicationException;
    
    /**
     *    Existence of a PKG Materials MA, RT material, and a CURRENCY CODE are checked.
     * <br />包装材品番原単位の存在、RT材、通貨コードをチェックします。
     * <pre>
     * - Search of a PKG Materials MA
     *       The following is set to {@link TmPkgMtrlCriteriaDomain}.
     *         - shipperCdHidden / Shipper CD
     *         - pltzItemNoList / PACKAGE ITEM NO
     *
     *       This is a call about {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}.
     *
     * - Packing-material existence check
     *       An error is made when {@link TmPkgMtrlDomain}of the above-mentioned result is zero affair.
     *
     * - RT material check
     *       In the above-mentioned result, rtTyp/RT TYPE of {@link TmPkgMtrlDomain} make an error in the record of 0.
     *
     * - Currency code check
     *       In the above-mentioned result, currCd / all CURRENCY CODEs of {@link TmPkgMtrlDomain} make an error, when not the same.
     *
     * - 包装材品番原単位の検索
     *     {@link TmPkgMtrlCriteriaDomain}に以下を設定
     *       - shipperCdHidden/荷主コード
     *       - pltzItemNoList/包装材品目番号
     *       
     *     {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}を呼出
     *     
     * - 包装材存在チェック
     *     上記の結果{@link TmPkgMtrlDomain}が0件の場合エラー
     *     
     * - RT材チェック
     *     上記の結果{@link TmPkgMtrlDomain}のrtTyp/再使用区分が0のレコードはエラー
     *     
     * - 通貨コードチェック
     *     上記の結果{@link TmPkgMtrlDomain}のcurrCd/通貨コードが全て同じでない場合エラー
     * </pre>
     * 
     * @param shipperCdHidden Shipper CD<br />荷主コード
     * @param pltzItemNoList PACKAGE ITEM NO<br />包装材品目番号
     * @param resultPartList Checked result (a checked result sets up pltzItemNo of NG) * Return VALUE<br />チェック結果(チェック結果がNGのpltzItemNoを設定)　※戻り値
     * @param languageCd LANGUAGE CD<br />言語コード
     * @return If a checked result is OK, a setting, otherwise, MSGID will be set up for empty.<br />チェック結果がOKであれば空を設定、そうでなければMSGIDを設定
     * @throws ApplicationException When a PKG Materials MA cannot be referred to<br />包装材品番原単位が参照できない場合
     */
    public List<String> validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(String shipperCdHidden, List<String> pltzItemNoList,
        List<Integer> resultPartList, String languageCd)
        throws ApplicationException;
    
    /**
     *    Existence of a Palletize and a Palletize Item, compatibility, and a Status are checked.
     * <br />パレタイズ、パレタイズ対象品の存在、整合性、ステータスをチェックします。
     * <pre>
     * - Search of a Palletize and a Palletize Item
     *       The following is set as {@link WC001ErtCriteriaDomain}.
     *         - fromMainMark / start MAIN MARK: fromCmlNo
     *         - toMainMark / end MAIN MARK: toCmlNo
     *
     *       This is a call about {@link WC001ErtDao#searchTtPltzByAuth (WC001ErtCriteriaDomain)}.
     *
     * - The acquisition number check
     *       An error is made when {@link WC001ErtItemDomain of the above-mentioned result} is 100 or more affairs.
     *
     * - Existence check
     *       An error is made when {@link WC001ErtItemDomain of the above-mentioned result} is zero affair.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:WC 001R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     *       An error is made when the above-mentioned result does not exist in {@link UserAuthDomain} as a result of the above [ the following items of {@link WC001ErtItemDomain} ].
     *       Error message (GSCM_I 0_0009)
     *         - shipperCd / Shipper CD -- SHIPPER_CD of a Palletize
     *         - plntCd / PLANT CODE -- PLNT_CD of a Palletize Item
     *
     * - DB consistency-check object record check
     *       In the above-mentioned result, cmlTyp/CML TYPE makes an error in at least one affair in it, when it exists except "2" in {@link TmPkgMtrlDomain}.
     *
     * - DB consistency-check Status check
     *       (when the inputted MAIN MARK is not E-RT)  
     *       In the above-mentioned result, pltzStatus/PALLETIZE STATUS makes an error in at least one affair in it, when it exists except "10" in {@link TmPkgMtrlDomain}.
     *
     * - パレタイズ、パレタイズ対象品の検索
     *     {@link WC001ErtCriteriaDomain}に以下を設定
     *       - fromMainMark/開始メインマーク:fromCmlNo
     *       - toMainMark/終了メインマーク:toCmlNo
     *       
     *     {@link WC001ErtDao#searchTtPltzByAuth(WC001ErtCriteriaDomain)}を呼出
     *     
     * - 取得件数チェック
     *     上記の結果{@link WC001ErtItemDomain}が100件以上の場合エラー
     *     
     * - 存在チェック
     *     上記の結果{@link WC001ErtItemDomain}が0件の場合エラー
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:WC001Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     *     上記の結果{@link WC001ErtItemDomain}の以下の項目が上記の結果{@link UserAuthDomain}に存在しない場合エラー
     *     エラーメッセージ(GSCM_I0_0009)
     *       - shipperCd/荷主コード…パレタイズのSHIPPER_CD
     *       - plntCd/製造部工場区分…パレタイズ対象品のPLNT_CD
     *     
     * - DB整合性チェック-対象レコードチェック
     *     上記の結果{@link TmPkgMtrlDomain}に1件でもcmlTyp/ケースマーク区分が"2"以外が存在する場合エラー
     *     
     * - DB整合性チェック-ステータスチェック
     *     （入力したメインマークがE-RTでない場合）
     *     上記の結果{@link TmPkgMtrlDomain}に1件でもpltzStatus/パレタイズステータスコードが"10"以外が存在する場合エラー
     * </pre>
     * 
     * @param criteria Condition domain<br />条件ドメイン
     * @return If a checked result is OK, a setting, otherwise, MSGID will be set up for empty.<br />チェック結果がOKであれば空を設定、そうでなければMSGIDを設定
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public String[] validateDatabaseTtPltzOnContensOfABoxCancelByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    Existence of a Palletize and a Palletize Item, compatibility, and a Status are checked.
     * <br />パレタイズ、パレタイズ対象品の存在、整合性、ステータスをチェックします。
     * <pre>
     * - Search of a Palletize and a Palletize Item
     *       The following is set as {@link WC001ErtCriteriaDomain}.
     *         - fromMainMark / start MAIN MARK: fromCmlNo
     *         - toMainMark / end MAIN MARK: toCmlNo
     *
     *       This is a call about {@link WC001ErtDao#searchTtPltzByAuth (WC001ErtCriteriaDomain)}.
     *
     * - Existence check
     *       An error is made when {@link WC001ErtItemDomain of the above-mentioned result} is zero affair.
     *
     * - The acquisition number check
     *       An error is made when {@link WC001ErtItemDomain of the above-mentioned result} is 100 or more affairs.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:WC 001R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     *       An error is made when the above-mentioned result does not exist in {@link UserAuthDomain} as a result of the above [ the following items of {@link WC001ErtItemDomain} ].
     *       Error message (GSCM_I 0_0009)
     *         - shipperCd / Shipper CD -- SHIPPER_CD of a Palletize
     *         - plntCd / PLANT CODE -- PLNT_CD of a Palletize Item
     *
     * - DB consistency-check object record check
     *       In the above-mentioned result, cmlTyp/CML TYPE makes an error in at least one affair in it, when it exists except "2" in {@link TmPkgMtrlDomain}.
     *
     * - パレタイズ、パレタイズ対象品の検索
     *     {@link WC001ErtCriteriaDomain}に以下を設定
     *       - fromMainMark/開始メインマーク:fromCmlNo
     *       - toMainMark/終了メインマーク:toCmlNo
     *       
     *     {@link WC001ErtDao#searchTtPltzByAuth(WC001ErtCriteriaDomain)}を呼出
     *     
     * - 存在チェック
     *     上記の結果{@link WC001ErtItemDomain}が0件の場合エラー
     *     
     * - 取得件数チェック
     *     上記の結果{@link WC001ErtItemDomain}が100件以上の場合エラー
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:WC001Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     *     上記の結果{@link WC001ErtItemDomain}の以下の項目が上記の結果{@link UserAuthDomain}に存在しない場合エラー
     *     エラーメッセージ(GSCM_I0_0009)
     *       - shipperCd/荷主コード…パレタイズのSHIPPER_CD
     *       - plntCd/製造部工場区分…パレタイズ対象品のPLNT_CD
     *     
     * - DB整合性チェック-対象レコードチェック
     *     上記の結果{@link TmPkgMtrlDomain}に1件でもcmlTyp/ケースマーク区分が"2"以外が存在する場合エラー
     *     
     * </pre>
     * 
     * @param criteria Search condition<br />検索条件
     * @return If a checked result is OK, a setting, otherwise, MSGID will be set up for empty.<br />チェック結果がOKであれば空を設定、そうでなければMSGIDを設定
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public String[] validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
    
    // ST987 DEL START
    ///**
    // *    Web service "ECA0027_WS_9002:Get Plant Info" is called.
    // * <br />Webサービス「ECA0027_WS_9002：Get Plant Info」のコールを行います。
    // * <pre>
    // * - Get Plant Info
    // *       Each argument is made into an argument,
    // *       This is a call about Web service (WS9002) {@link Ws9002RestService#getPlantInfo (String, String)}.
    // *
    // * - Get Plant Info
    // *     各引数を引数にして、
    // *     Webサービス(WS9002){@link Ws9002RestService#getPlantInfo(String, String)}を呼出
    // * </pre>
    // * 
    // * @param shipperCd shipper cd
    // * @param plntCd plant cd
    // * @return If an error does not occur in Web service (WS9002), they are true, otherwise, false.<br />Webサービス(WS9002)でエラーが発生しなければtrue、そうでなければfalse
    // * @throws ApplicationException it does not expect by Web service (WS9002) -- the case where an error occurs<br />Webサービス(WS9002)で予期せぬエラーが発生した場合
    // */
    //public boolean validateDatabaseWs9002OnContensOfABoxRegister(String shipperCd, String plntCd)
    //    throws ApplicationException;
    // ST987 DEL END

    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    /**
     *    Registration of a Palletize and a Palletize Item is performed.
     * <br />パレタイズ、パレタイズ対象品の登録を行います。
     * <pre>
     * Acquire - Ship-to information.
     *       - Acquisition of a consignee
     *           Search of - NEXUS Ship To Master
     *               The following items of ert {@link WC001ErtDomain} are set to {@link TmNxsShipToCriteriaDomain}.
     *                 - shipToCd / SHIP TO CODE
     *
     *               This is a call about {@link TmNxsShipToService#searchByKey (TmNxsShipToCriteriaDomain)}.
     *
     *       Acquisition of - CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE and a CUSTOM TIMING TYPE
     *           - Search of an Export Ship To Shipping Master
     *               The following items are set to {@link TmExpShipToShippingCriteriaDomain}.
     *                 - shipperCdHidden / Shipper CD: Same name item of ert {@link WC001ErtDomain}
     *                 - shipToCd / SHIP TO CODE: Same name item of ert {@link WC001ErtDomain}
     *                 - aplyStrtDt / APPLY START DATE: Time zone converted date   Above
     *
     *               This is a call about {@link TmExpShipToShippingService#searchByKey (TmExpShipToShippingCriteriaDomain)}.
     *
     *           An error is made when the number of - corresponding data is zero.
     *
     * - A Palletize information is registered.
     *       A Palletize is created several minutes of palletQty / Palletize QUANTITY of - ert {@link WC001ErtDomain}.
     *
     *       Acquisition of - Main Mark
     *           - Judgment of the Denso base or a supplier
     *               The following items are set to {@link TmNxsCompCriteriaDomain}.
     *                 - compCd / COMPANY CODE: shipperCdHidden/Shipper CD of ert {@link WC001ErtDomain}
     *
     *               This is a call about {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)}.
     *
     *           Assignment of order numbers of - Main Mark
     *               The following is made into an argument, This is a call about * {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}.
     *                 - assignment-of-order-numbers key: Acquire the following items from criteria and create an assignment-of-order-numbers key.
     *                     - shipperCdHidden / Shipper CD
     *                     - packingWhCd / PACKING WAREHOUSE CODE: Required only in the case of the MAIN MARK of *DN base
     *                 - assignment-of-order-numbers classification: In the case of the MAIN MARK of DN base, this is "03." In the case of the MAIN MARK of a supplier, this is "04."
     *                 - the number of the SEQUENCE NO to acquire: palletQty / Palletize QUANTITY
     *                 - function ID: Constant ({@link Eca0027Constants#SCREEN_ID_WC001})
     *
     *       - Calculation of a Palletize VOLUME (VOLUME)
     *           VOLUME  = length/vertical  x width / WIDTH   x height / HEIGHT
     *           A conversion table is followed based on the following of ert, and this is a unit converted.
     *           - Length UNIT(Length)
     *           - Volume UNIT
     *
     *       - Calculation of a WEIGHT (N/W)
     *           It calculates for each ITEM NO.
     *             Calculation of the WEIGHT (N/W) for each ITEM NO
     *               pkgWeight/PACKAGE WEIGHT of the PKG-Materials-MA list of sub domain area of ert {@link WC001ErtDomain}
     *                 qty/QUANTITY of ertItemDomainList of the sub domain area of x ert
     *
     *             Unit converted for each ITEM NO
     *               The following is made into an argument and this is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *                 - the VALUE of the above-mentioned WEIGHT (N/W): VALUE to change
     *                 weightUnit/WEIGHT UNIT of the PKG-Materials-MA list of sub domain area of - ert: Unit before a converted
     *                 Weight UNIT (N/W) of - ert: Unit after a converted
     *
     *           The sum total of a WEIGHT (N/W)
     *             The WEIGHT (N/W) after the unit converted for each ITEM NO is totaled.
     *
     *           WEIGHT correlation check
     *             grossWeight/GROSS WEIGHT of ert {@link WC001ErtDomain} -- < -- result after the above-mentioned unit converted   a case -- error [   ]
     *
     *       - Registration processing of a Palletize
     *           The following is set to {@link TtPltzDomain} and this is a call about {@link TtPltzService#create (TtPltzDomain)}.
     *             Property of - ert
     *             - containerSortingKey / CONTAINER SORTING KEY: Result of acquisition of a CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE and a CUSTOM TIMING TYPE
     *                                                      containerSortingKey/CONTAINER SORTING KEY of {@link TmExpShipToShippingDomain}
     *             - containerLooseTyp / CONTAINER LOOSE TYPE: Result of acquisition of a CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE and a CUSTOM TIMING TYPE
     *                                                      containerLooseTyp/CONTAINER LOOSE TYPE of {@link TmExpShipToShippingDomain}
     *             - netWeight / NET WEIGHT: Result of a calculation of the above-mentioned WEIGHT (N/W)
     *             - weightUnit / WEIGHT UNIT: Weight UNIT (N/W) of ert
     *             - lengthUnit / LENGTH UNIT: Length UNIT of ert (Length)
     *             - volumeUnit / Unit of Vol.: Volume UNIT of ert
     *             - consigneeCd / Consignee CD: They are compCd/COMPANY CODE of {@link TmNxsShipToDomain} as a result of acquisition of a consignee.
     *             - currCd / CURRENCY CODE: currCd/CURRENCY CODE of the PKG-Materials-MA list of sub domain area of ert
     *             - customTimingTyp / CUSTOM TIMING TYPE: Result of acquisition of a CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE and a CUSTOM TIMING TYPE
     *                                                    customTimingTyp/CUSTOM TIMING TYPE of {@link TmExpShipToShippingDomain}
     *
     * A create of - Palletize Item
     *       The following is set to {@link TtPltzDomain} and this is a call about {@link TtPltzService#create (TtPltzDomain)}.
     *         Property of the sub domain ertItemDomainList of - ert
     *         - pltzItemNo / PALLETIZE ITEM NO: pkgItemNo/PACKAGE ITEM NO of the PKG-Materials-MA list of sub domain area of ert
     *         - itemDescription / ITEM DESCRIPTION: PKG-Materials-MA list of sub domain area of ert
     *         - qtyUnit / QUANTITY UNIT: qtyUnit/QUANTITY UNIT of the PKG-Materials-MA list of sub domain area of ert
     *         - netWeight / NET WEIGHT: Result of calculation of the WEIGHT (N/W) for each ITEM NO
     *         - itemWeight / ITEM WEIGHT: pkgWeight/PACKAGE WEIGHT of the PKG-Materials-MA list of sub domain area of ert
     *         - modelCd / MODEL CODE: modelCd/MODEL CODE of the PKG-Materials-MA list of sub domain area of ert
     *         - originCntryCd / ORIGIN COUNTRY CODE: originCntry/country of origin of the PKG-Materials-MA list of sub domain area of ert
     *         - currCd / CURRENCY CODE: currCd/CURRENCY CODE of the PKG-Materials-MA list of sub domain area of ert
     *         - rtFlg / RT FLAG: rtTyp/RT TYPE of the PKG-Materials-MA list of sub domain area of ert
     *
     * - Return of an item required for the re-display of a screen
     *       It returns by the list of {@link WC001ErtDomain}.
     *
     * - Ship-to情報を取得
     *     - コンサイニの取得
     *         - NEXUS送荷先原単位の検索
     *             {@link TmNxsShipToCriteriaDomain}にert{@link WC001ErtDomain}の以下の項目を設定
     *               - shipToCd/送荷先コード
     *               
     *             {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出
     *     
     *     - コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得
     *         - 輸出送荷先出荷原単位の検索
     *             {@link TmExpShipToShippingCriteriaDomain}に以下の項目を設定
     *               - shipperCdHidden/荷主コード:ert{@link WC001ErtDomain}の同名項目
     *               - shipToCd/送荷先コード:ert{@link WC001ErtDomain}の同名項目
     *               - aplyStrtDt/適用開始日:タイムゾーン変換日付 以上
     *               
     *             {@link TmExpShipToShippingService#searchByKey(TmExpShipToShippingCriteriaDomain)}を呼出
     *             
     *         - 該当データが0件の場合エラー
     *         
     * - パレタイズ情報を登録
     *     - ert{@link WC001ErtDomain}のpalletQty/パレタイズ数量の数分、パレタイズを作成
     *     
     *     - Main Markの取得
     *         - デンソー拠点か仕入先かの判断
     *             {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *               - compCd/会社コード:ert{@link WC001ErtDomain}のshipperCdHidden/荷主コード
     *               
     *             {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *         
     *         - Main Markの採番
     *             以下を引数にして、
     *             {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}を呼出
     *               - 採番キー:criteriaより以下の項目を取得し採番キーを作成
     *                   - shipperCdHidden/荷主コード
     *                   - packingWhCd/梱包倉庫コード:※DN拠点のメインマークの場合のみ必要
     *               - 採番区分:DN拠点のメインマークの場合、"03"。仕入先のメインマークの場合、"04"。
     *               - 取得する連番の個数:palletQty/パレタイズ数量
     *               - 機能ID:コンスタント({@link Eca0027Constants#SCREEN_ID_WC001})
     *               
     *     - パレタイズ容積（VOLUME）の算出
     *         容積 ＝ length/縦 × width/横 × height/高さ
     *         ertの以下を元に変換表に従って単位変換
     *           - Length UNIT（Length）
     *           - Volume UNIT
     *             
     *     - 重量（N/W）の算出
     *         各品番ごとに計算
     *           各品番ごとの重量（N/W）の計算
     *             ert{@link WC001ErtDomain}の子ドメインエリアの包装材品番原単位リストのpkgWeight/包装材重量
     *               × ertの子ドメインエリアのertItemDomainListのqty/数量
     *               
     *           各品番ごとの単位変換
     *             以下を引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *               - 上記の重量（N/W）の値:変換する値
     *               - ertの子ドメインエリアの包装材品番原単位リストのweightUnit/重量単位:変換前の単位
     *               - ertのWeight UNIT(N/W):変換後の単位
     *         
     *         重量（N/W）の合計
     *           各品番ごとの単位変換後の重量（N/W）を合計
     *         
     *         重量相関チェック
     *           ert{@link WC001ErtDomain}のgrossWeight/グロス重量 ＜ 上記の単位変換後の結果　の場合エラー
     *     
     *     - パレタイズの登録処理
     *         {@link TtPltzDomain}に以下を設定し、{@link TtPltzService#create(TtPltzDomain)}を呼出
     *           - ertのプロパティ
     *           - containerSortingKey/コンテナ層別キー:コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得の結果
     *                                                  {@link TmExpShipToShippingDomain}のcontainerSortingKey/コンテナ層別キー
     *           - containerLooseTyp/コンテナルーズ区分:コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得の結果
     *                                                  {@link TmExpShipToShippingDomain}のcontainerLooseTyp/コンテナルーズ区分
     *           - netWeight/ネット重量:上記の重量（N/W）の算出の結果
     *           - weightUnit/重量単位:ertのWeight UNIT(N/W)
     *           - lengthUnit/長さ単位:ertのLength UNIT（Length）
     *           - volumeUnit/容積単位:ertのVolume UNIT
     *           - consigneeCd/荷受人コード:コンサイニの取得の結果{@link TmNxsShipToDomain}のcompCd/会社コード
     *           - currCd/通貨コード:ertの子ドメインエリアの包装材品番原単位リストのcurrCd/通貨コード
     *           - customTimingTyp/通関タイミング区分:コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得の結果
     *                                                {@link TmExpShipToShippingDomain}のcustomTimingTyp/通関タイミング区分
     *                                                
     * - パレタイズ対象品の作成
     *     {@link TtPltzDomain}に以下を設定し、{@link TtPltzService#create(TtPltzDomain)}を呼出
     *       - ertの子ドメインertItemDomainListのプロパティ
     *       - pltzItemNo/パレタイズ品目番号:ertの子ドメインエリアの包装材品番原単位リストのpkgItemNo/包装材品目番号
     *       - itemDescription/品目名称:ertの子ドメインエリアの包装材品番原単位リストの
     *       - qtyUnit/数量単位:ertの子ドメインエリアの包装材品番原単位リストのqtyUnit/数量単位
     *       - netWeight/ネット重量:各品番ごとの重量（N/W）の計算の結果
     *       - itemWeight/製品重量:ertの子ドメインエリアの包装材品番原単位リストのpkgWeight/包装材重量
     *       - modelCd/型式コード:ertの子ドメインエリアの包装材品番原単位リストのmodelCd/型式コード
     *       - originCntryCd/原産国コード:ertの子ドメインエリアの包装材品番原単位リストのoriginCntry/原産国
     *       - currCd/通貨コード:ertの子ドメインエリアの包装材品番原単位リストのcurrCd/通貨コード
     *       - rtFlg/RT材フラグ:ertの子ドメインエリアの包装材品番原単位リストのrtTyp/再使用区分
     *
     * - 画面の再表示に必要な項目の返却
     *     {@link WC001ErtDomain}のリストで返却
     * </pre>
     * 
     * @param ert ERT domain<br />ERTドメイン
     * @return ERT domain<br />ERTドメイン
     * @throws ApplicationException When a NEXUS Ship To Master, an Export Ship To Shipping Master, and a NEXUS Company Master cannot be referred to. When it cannot register with a Palletize and a Palletize Item. When an error unexpected by CommonService occurs.
<br />NEXUS送荷先原単位、輸出送荷先出荷原単位、NEXUS会社原単位が参照できない場合、パレタイズ、パレタイズ対象品に登録できない場合、CommonServiceで予期せぬエラーが発生した場合
     */
    public List<? extends WC001ErtDomain> createOnContensOfABoxRegister(WC001ErtDomain ert)
        throws ApplicationException;
    
    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     *    Retrieval processing of a return recommendation packing-style create, re printing, and a cancellation screen is performed.
     * <br />返却推奨荷姿作成・再印刷・キャンセル画面の検索処理を行います。
     * <pre>
     * Acquisition of - CONTAINER-SORTING-KEY CONTAINER LOOSE TYPE and a CUSTOM TIMING TYPE
     *       - Search of an Export Ship To Shipping Master
     *           The following items are set to {@link TmExpShipToShippingCriteriaDomain}.
     *             - shipperCdHidden / Shipper CD: Same name item of ert {@link WC001ErtDomain}
     *             - shipToCd / SHIP TO CODE: Same name item of ert {@link WC001ErtDomain}
     *             - aplyStrtDt / APPLY START DATE: Time zone converted date   Above
     *
     *           This is a call about {@link TmExpShipToShippingService#searchByKey (TmExpShipToShippingCriteriaDomain)}.
     *
     * Acquisition of - LENGTH UNIT
     *       Search of - NEXUS Company Master
     *           The following items are set to {@link TmNxsCompCriteriaDomain}.
     *             - compCd / COMPANY CODE: shipperCdHidden/Shipper CD of ert {@link WC001ErtDomain}
     *
     *           This is a call about {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)}.
     *
     * - Calculation of a Palletize VOLUME (VOLUME)
     *       This is a VOLUME calculation at the following items of - ert {@link WC001ErtDomain}.
     *           VOLUME  = length/vertical  x width / WIDTH   x height / HEIGHT
     *
     *       A conversion table is followed based on the following of - ert, and this is a unit converted.
     *           - Length UNIT(Length)
     *           - Volume UNIT
     *
     * - Calculation of a WEIGHT (N/W)
     *       - Search of a PKG Materials MA
     *           The following is set to {@link TmPkgMtrlCriteriaDomain}.
     *             - shipperCdHidden / Shipper CD: Same name item of ert
     *             - pltzItemNoList / PACKAGE ITEM NO: List of pltzItemNo/PALLETIZE ITEM NOs of ertItemDomainList of the sub domain area of ert
     *
     *           This is a call about {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}.
     *
     *       - It calculates for each ITEM NO.
     *           Calculation of the WEIGHT (N/W) for each ITEM NO
     *             pkgWeight/PACKAGE WEIGHT of the search results {@link WC001ErtItemDomain} of the above-mentioned PKG Materials MA
     *               qty/QUANTITY of ertItemDomainList of the sub domain area of x ert
     *
     *           Unit converted for each ITEM NO
     *             The following is made into an argument and this is a call about {@link CommonService#convertWeightUnit (BigDecimal, String, String)}.
     *               - the VALUE of the above-mentioned WEIGHT (N/W): VALUE to change
     *               - weightUnit/WEIGHT UNIT of the search results {@link WC001ErtItemDomain} of the above-mentioned PKG Materials MA: Unit before a converted
     *               Weight UNIT (N/W) of - ert: Unit after a converted
     *
     *           The sum total of a WEIGHT (N/W)
     *             The WEIGHT (N/W) after the unit converted for each ITEM NO is totaled.
     *
     * Acquisition of - MODEL CODE
     *       It acquires from the property of the search results {@link WC001ErtItemDomain} of the above-mentioned PKG Materials MA.
     *
     * - コンテナ層別キー・コンテナルーズ区分・通関タイミング区分の取得
     *     - 輸出送荷先出荷原単位の検索
     *         {@link TmExpShipToShippingCriteriaDomain}に以下の項目を設定
     *           - shipperCdHidden/荷主コード:ert{@link WC001ErtDomain}の同名項目
     *           - shipToCd/送荷先コード:ert{@link WC001ErtDomain}の同名項目
     *           - aplyStrtDt/適用開始日:タイムゾーン変換日付 以上
     *               
     *         {@link TmExpShipToShippingService#searchByKey(TmExpShipToShippingCriteriaDomain)}を呼出
     * 
     * - 長さ単位の取得
     *     - NEXUS会社原単位の検索
     *         {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *           - compCd/会社コード:ert{@link WC001ErtDomain}のshipperCdHidden/荷主コード
     *               
     *         {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *             
     * - パレタイズ容積（VOLUME）の算出
     *     - ert{@link WC001ErtDomain}の以下の項目にて容積算出
     *         容積 ＝ length/縦 × width/横 × height/高さ
     *         
     *     - ertの以下を元に変換表に従って単位変換
     *           - Length UNIT（Length）
     *           - Volume UNIT
     *           
     * - 重量（N/W）の算出
     *     - 包装材品番原単位の検索
     *         {@link TmPkgMtrlCriteriaDomain}に以下を設定
     *           - shipperCdHidden/荷主コード:ertの同名項目
     *           - pltzItemNoList/包装材品目番号:ertの子ドメインエリアのertItemDomainListのpltzItemNo/パレタイズ品目番号のリスト
     *       
     *         {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}を呼出
     *     
     *     - 各品番ごとに計算
     *         各品番ごとの重量（N/W）の計算
     *           上記の包装材品番原単位の検索結果{@link WC001ErtItemDomain}のpkgWeight/包装材重量
     *             × ertの子ドメインエリアのertItemDomainListのqty/数量
     *               
     *         各品番ごとの単位変換
     *           以下を引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *             - 上記の重量（N/W）の値:変換する値
     *             - 上記の包装材品番原単位の検索結果{@link WC001ErtItemDomain}のweightUnit/重量単位:変換前の単位
     *             - ertのWeight UNIT(N/W):変換後の単位
     *         
     *         重量（N/W）の合計
     *           各品番ごとの単位変換後の重量（N/W）を合計
     *           
     * - 型式コードの取得
     *     上記の包装材品番原単位の検索結果{@link WC001ErtItemDomain}のプロパティより取得
     * </pre>
     * 
     * @param ert ERT domain<br />ERTドメイン
     * @return ERT domain<br />ERTドメイン
     * @throws ApplicationException When an Export Ship To Shipping Master, a NEXUS Company Master, and a PKG Materials MA cannot be referred to. When an error unexpected by CommonService occurs.<br />輸出送荷先出荷原単位、NEXUS会社原単位、包装材品番原単位が参照できない場合、CommonServiceで予期せぬエラーが発生した場合
     */
    public WC001ErtDomain searchOnContensOfABoxDisplay(WC001ErtDomain ert)
        throws ApplicationException;
    
    // --------------------------------- Update system method update -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- Delete system method delete -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    /**
     *    Registration of a Palletize and a Palletize Item is performed.
     * <br />パレタイズ、パレタイズ対象品の登録を行います。
     * <pre>
     * - Delete process of a Palletize
     *       The following is set as {@link TtPltzCriteriaDomain} and this is a call about {@link TtPltzService#deleteByCondition (TtPltzCriteriaDomain)}.
     *         - mainMark / MAIN MARK: fromMainMark / start MAIN MARK of criteria   Above
     *         - mainMark / MAIN MARK: toMainMark / end MAIN MARK of criteria   Following
     *
     * A create of - Palletize Item
     *       The following is set to {@link TtPltzItemCriteriaDomain} and this is a call about {@link TtPltzItemService#deleteByCondition (TtPltzItemCriteriaDomain)}.
     *         - mainMark / MAIN MARK: fromMainMark / start MAIN MARK of criteria   Above
     *         - mainMark / MAIN MARK: toMainMark / end MAIN MARK of criteria   Following
     *
     * - パレタイズの削除処理
     *     {@link TtPltzCriteriaDomain}に以下を設定し、{@link TtPltzService#deleteByCondition(TtPltzCriteriaDomain)}を呼出
     *       - mainMark/メインマーク:criteriaのfromMainMark/開始メインマーク 以上
     *       - mainMark/メインマーク:criteriaのtoMainMark/終了メインマーク 以下
     *                                                
     * - パレタイズ対象品の作成
     *     {@link TtPltzItemCriteriaDomain}に以下を設定し、{@link TtPltzItemService#deleteByCondition(TtPltzItemCriteriaDomain)}を呼出
     *       - mainMark/メインマーク:criteriaのfromMainMark/開始メインマーク 以上
     *       - mainMark/メインマーク:criteriaのtoMainMark/終了メインマーク 以下
     * </pre>
     * 
     * @param criteria ERT search-condition domain<br />ERT検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be accessed<br />パレタイズ、パレタイズ対象品にアクセスできない場合
     */
    public Integer deleteOnContensOfABoxCancel(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
    
    // -------------------------------- Transaction system method transact ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    
    // -------------------------------- Print system method print ---------------------------------------------------------
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
    /**
     *    A list (LC001_CML (E-RT)) is created.
     * <br />帳票(LC001_CML(E-RT))の作成を行います。
     * <pre>
     * - A list is created
     *       The following is set as {@link WC001ErtCriteriaDomain},
     *       This is a call about {@link LC001ReportService#searchErt (String, String, String)}.
     *         - mainMark / MAIN MARK: fromMainMark / start MAIN MARK of criteria   Above
     *         - mainMark / MAIN MARK: toMainMark / end MAIN MARK of criteria   Following
     *
     * - 帳票の作成
     *     {@link WC001ErtCriteriaDomain}に以下を設定し、
     *     {@link LC001ReportService#searchErt(String, String, String)}を呼出
     *       - mainMark/メインマーク:criteriaのfromMainMark/開始メインマーク 以上
     *       - mainMark/メインマーク:criteriaのtoMainMark/終了メインマーク 以下
     * </pre>
     * 
     * @param criteria ERT search-condition domain<br />ERT検索条件ドメイン
     * @return PDF list<br />PDF帳票
     * @throws ApplicationException it does not expect by a list (LC001) -- the case where an error occurs<br />帳票(LC001)で予期せぬエラーが発生した場合
     */
    public File printErt(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
}