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
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzItemPkgCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzItemItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzItemPkgService;
import com.globaldenso.eca0027.core.business.dao.W2009CmlDao;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * interface of CML service.
 * <br />CMLサービスのインタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public interface W2009CmlService {
    
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * Perform a QUANTITY check and a TAG-QUANTITY check
     * <br />数量チェック、タグ数チェックを行います。
     * <pre>
     * - A QUANTITY check or TAG-QUANTITY check
     *     If the VALUE specified by the argument less than 1, make an error.
     *     (00 and 000 grades regard it as 0)
     *
     * - 数量チェックまたはタグ数チェック
     *     引数で指定された値 <  1の場合 (00、000等は0とみなす)エラー
     * </pre>
     * 
     * @param actualQty Actual PKG QTY or Actual Tag QTY<br />Actual PKG QTY または Actual Tag QTY 
     * @return check result (true or false)
     */
    public boolean validateConsistencyActualQty(String actualQty);
    
    /**
     * Confirm whether the VALUE of all the data of a list is the same
     * <br />リストの全データの値が同一かどうかをチェックします。
     * <pre>
     * - CUSTOM-TIMING-TYPE check
     *     An error is made when C/C TYPE of all the selected data differs.
     *
     * - C/L check
     *     An error is made when C/L of all the selected data differs.
     *
     * - CONTAINER-SORTING-KEY check
     *     An error is made when the CONTAINER SORTING KEY of all the selected data is not the same.
     *
     * - Currency check
     *     An error is made when the CURRENCY CODE (hidden VALUE) of all the selected data is not the same.
     *
     * - A PACKAGE-FORM-TYPE check is performed.
     *     An error is made When the PACKAGE FORM TYPE of all the selected data is not the same.
     *
     * - Inv. Key check   It carries out.
     *     An error is made When the Inv. Key of all the selected data is not the same.
     *
     * - 通関タイミング区分チェック
     *     選択された全データのC/C TYPEが異なる場合エラー
     *     
     * - コンテナルーズチェック
     *     選択された全データのC/Lが異なる場合エラー
     *
     * - コンテナ層別キーチェック
     *     選択された全データのコンテナ層別キーが同一でない場合エラー
     *     
     * - 通貨チェック
     *     選択された全データの通貨コード(hidden値)が同一でない場合は エラー
     *     
     * - 梱包形態チェックを行います。
     *     選択された全データの梱包形態が同一でない場合は エラー
     *     
     * - インボイスキーチェック を行います。
     *     選択された全データのインボイスキーが同一でない場合は エラー
     * </pre>
     * 
     * @param inputList The list of VALUEs of a check item<br />チェック項目の値のリスト
     * @return check result (true or false)
     */
    public boolean validateConsistencyAllSame(List<String> inputList);
    
    /**
     * Perform an item input check
     * <br />項目入力チェックを行います。
     *
     * <pre>
     * - When only one of Package Item No. and the QTY(s) is inputted, make an error.
     *   (it checks, only when Mix Tag No. is "")
     * 
     * - Package Item No. と QTY のどちらかしか入力されていない場合はエラー
     *   (Mix Tag No. が "" の場合のみチェックを行う)
     * </pre>
     * 
     * @param pkgItemNo PACKAGE ITEM NO<br />包装材品目番号
     * @param qty QUANTITY<br />数量
     * @param mixTagNo MIX TAG NO<br />MIXタグNO
     * @return Package This is false when only one of Package Item No. and the QTY(s) is inputted, otherwise true.<br />Item No. と QTY のどちらか一方のみが入力された場合は false、そうでなければ true
     *
     */
    public boolean validateConsistencyDetailPackageItemNoQTY(String pkgItemNo, String qty, String mixTagNo);
    
    /**
     * When Mix Tag No. has not been inputted, perform the minimum QUANTITY check
     * <br />Mix Tag No. が未入力の場合に、最少数量チェックを行います。
     * <pre>
     * - If QTY less than 1 (00 and 000 grades regard it as 0), make an error.
     *   (it checks, only when Mix Tag No. is "")
     *
     * - QTY < 1 の場合(00、000等は0とみなす)の場合はエラー
     *   (Mix Tag No. が "" の場合のみチェックを行う)
     * </pre>
     * @param qty QUANTITY<br />数量
     * @param mixTagNo MIX TAG NO<br />MIXタグNO
     * @return This is false in the case of QTY < 1.Otherwise, true<br />QTY < 1 の場合は falseそうでなければ true
     * 
     */
    public boolean validateConsistencyDetailQTY(String qty, String mixTagNo);
    
    /**
     * Perform the amount check of maximum numbers
     * <br />最大数量チェックを行います。
     * <pre>
     * - In the case of QTY > 9999999, an error is made.
     * 
     * - QTY > 9999999 の場合はエラー
     * </pre>
     * @param qty QUANTITY<br />数量
     * @return This is false in the case of QTY < 1. Otherwise, true<br />QTY < 1 の場合は falseそうでなければ true
     *
     */
    public boolean validateConsistencyDetailQTYMax(BigDecimal qty);

    /**
     * Correlation check of EXPORT PACKING DATE (FROM-TO)
     * <br/>輸出梱包日(FROM-TO)の相関チェックを行います。
     * <pre>
     *  - The correlation check (from date <= to date)
     *
     *  - 【共通仕様No.10】日付の相関チェック(開始日付 <= 終了日付)を行います
     * </pre>
     * @param dateFormat Date format<br />日付フォーマット
     * @param fromDate Beginning date<br />開始日付
     * @param toDate End date<br />終了日付
     * @return If this is a from date <= to date, they are true, otherwise, false.<br />開始日付 <= 終了日付であればtrue、そうでなければfalse
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String dateFormat, String fromDate, String toDate);
    
    /**
     * CIGMA information acquisition check
     * <br />CIGMA情報取得チェックを行います。
     * <pre>
     * If any one of the CURRENCY CODE, QUANTITY UNIT, PLANT CODE is empty, it's error.
     *
     * 通貨コード、数量単位、製造部工場区分 のいずれかに""が存在する場合 エラー
     * </pre>
     * @param currCd CURRENCY CODE<br />通貨コード
     * @param qtyUnit QUANTITY UNIT<br />数量単位
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @return A CURRENCY CODE, a QUANTITY UNIT, PLANT CODE   This is false when "" exists in either. This is true when that is not right.<br />通貨コード、数量単位、製造部工場区分 のいずれかに""が存在する場合は falseそうでない場合は true
     *
     */
    public boolean validateConsistencyGetCigmaInfo(String currCd, String qtyUnit, String plntCd);
    
    /**
     * Non-input check
     * <br />未入力チェック。
     * <pre>
     * - export-formalities ITEM-NO information acquisition check
     *       In DENGER-ITEM-FLAG ="", an error is made.
     *
     * - A Special-Information number information acquisition check is performed.
     *       In ITEM-DESCRIPTION ="", an error is made.
     *
     * - A survey WEIGHT check is performed.
     *       In ITEM-WEIGHT ="", an error is made.
     *
     * - 輸出手続き品目番号情報取得チェック
     *     危険品フラグ = "" の場合はエラー
     * 
     * - 輸出出荷品目番号情報取得チェックを行います。
     *     品目名称 = "" の場合はエラー
     *     
     * - 実測重量チェックを行います。
     *     製品重量 = "" の場合はエラー
     * </pre>
     * 
     * @param input Input value<br />入力値
     * @return This is false in the case of input value ="." This is true when that is not right.<br />入力値="" の場合は falseそうでない場合は true
     *
     */
    public boolean validateConsistencyBlankOrNull(String input);
    
    /**
     * Perform a Warning check check
     * <br />Warning確認チェックを行います。
     * <pre>
     *  At least one warningFlg ="Y" of the item hidden is contained, and an error is made when there is no check in ignore Warnings.
     *
     *  hidden項目のwarningFlg = "Y" が1件でも含まれるかつ、ignore Warnings にチェックがない場合はエラー
     * </pre>
     *
     * @param warningFlgList The list of Warn. flags<br />ワーニングフラグのリスト
     * @param ignoreWarnings Classification of whether a Warn. is disregarded<br />ワーニングを無視するか否かの区分
     * @return This is false, when one "at least Y" is contained in the list of Warn. flags and there is no check in ignore Warnings. This is true when that is not right.<br />ワーニングフラグのリストに "Y" が1件でも含まれるかつ、ignore Warnings にチェックがない場合はfalseそうでない場合は true
     *          
     */
    public boolean validateConsistencyOfRegister(List<String> warningFlgList, String ignoreWarnings);
    
    /**
     * Exterior symbol input check
     * <br />外装記号入力チェック。
     * <pre>
     * - Input check of OUTER_PKG_CD, in the case of multi-article Palletize.
     *   If the case of outerPkgCd = "" and pkgFormType = "M", it's error.
     *
     * - Input check of OUTER_PKG_CD, in the case of single Palletize(lot crack).
     *   if outerPkgCd = "" and pkgFormType = "S" and 
     *   warningFlg ="Y" is contained in the warningFlgList, it's error.
     *
     * - 多品パレタイズ時の外装記号の入力チェック
     *   outerPkgCd = ""  かつ、 pkgFormType = "M" の場合エラー
     *   
     * - 単品パレタイズ(ロット割れ)時の外装記号入力チェック
     *   outerPkgCd = ""  かつ、 pkgFormType = "S" かつ
     *    hidden項目のwarningFlg = "Y" が1件でも含まれる場合エラー
     * </pre>
     * @param outrPkgCd Exterior sign<br />外装記号
     * @param pkgFormTyp PACKAGE FORM TYPE<br />梱包形態
     * @param warningFlgList The list of Warn. flags<br />ワーニングフラグのリスト
     * @return This is false when there is an error. This is true when that is not right.<br />エラーがあった場合はfalseそうでない場合は true
     *
     */
    public boolean validateConsistencyOfRegisterPkgMtrial(String outrPkgCd, String pkgFormTyp, List<String> warningFlgList);
    
    /**
     * Check over for the number of the Packaging Instruction
     * <br />指示超えチェック を行います。
     * <pre>
     * - If QUANTITY > (the number of Packaging Instruction - the number of Packed)  -- error
     * 
     * - 数量 > (梱包指示数 - 梱包済数) の場合エラー
     * </pre>
     *
     * @param qty QUANTITY<br />数量
     * @param instrQty The number of Packaging Instruction (=Pull)s<br />梱包指示数
     * @param instrPkgedQty A packed up number<br />梱包済数
     * @return QUANTITY > (number of Packaging Instruction - the number of packed ) A case is false. This is true when that is not right.<br />数量 > (梱包指示数 - 梱包済数) の場合は falseそうでない場合は true
     * 
     */
    public boolean validateConsistencyOverInstr(BigDecimal qty, BigDecimal instrQty, BigDecimal instrPkgedQty);
    
    /**
     * Check over for the number of order
     * <br />オーダー超えチェックを行います。
     * <pre>
     *  - Order over check
     *    QUANTITY > the number of Export-Receive-Order orders  -- error
     *
     *  - SHIPPING-LOT over check
     *    QUANTITY > SHIPPING LOT  -- error
     *
     *  - オーダー超えチェック 
     *   数量 > 輸出受注オーダー数 の場合エラー
     *   
     *  - 出荷ロット超えチェック 
     *   数量 > 出荷ロット の場合エラー
     * </pre>
     * @param qty QUANTITY<br />数量
     * @param orderQty The number of Export-Receive-Order orders<br />輸出受注オーダー数
     * @return The number of QUANTITY > Export-Receive-Order orders   If it is, they will be false, otherwise, true.<br />数量 > 輸出受注オーダー数 であれば false、そうでなければ true
     */
    public boolean validateConsistencyOver(BigDecimal qty, BigDecimal orderQty);
    
    /**
     * Check over for the number of SHIPPING-LOT (multi-article ITEM NO)
     * <br />出荷ロット超えチェック（多品品目番号）を行います。
     * <pre>
     *  (a QUANTITY/TAG QUANTITY) > SHIPPING LOT -- error
     *
     *  (数量 / タグ数) > 出荷ロット の場合エラー
     * </pre>
     * @param qty QUANTITY<br />数量
     * @param tagQty TAG QUANTITY<br />タグ数
     * @param shipperLog SHIPPING LOT<br />出荷ロット
     * @return (A QUANTITY/TAG QUANTITY) > SHIPPING LOT   A case is false. This is true when that is not right.<br />(数量 / タグ数) > 出荷ロット の場合は falseそうでない場合は true
     *
     */
    public boolean validateConsistencyOverShipLotMultiple(BigDecimal qty, BigDecimal tagQty, BigDecimal shipperLog);
        
    /**
     * Perform the authority check at the time of Trans/PKG Revise button depression on a CML Main screen
     * <br />CML Main 画面で Trans/PKG Revise ボタン押下時の権限チェックを行います。
     * <pre>
     * - Details (details whose update authority flag created by Search action is not ON) without update authority
     *     An error is made when it chooses.
     *     - registerAuthFlg !="1", an error is made.
     *
     * - 更新権限のない明細(Searchアクションで作成した更新権限フラグがオンでない明細)を
     *   選択した場合はエラー
     *     - registerAuthFlg ≠ "1" の場合はエラー
     * </pre>
     * @param registerAuthFlg Update authority existence classification<br />更新権限有無区分
     * @return This is false when details without update authority are chosen.Otherwise, true<br />更新権限のない明細を選択していた場合は falseそうでなければ true
     *
     */
    public boolean validateConsistencyRegisterAuthByTransPkgRevise(String registerAuthFlg);
    
    /**
     * Check for Packing-material registration check
     * <br />包装材登録チェックを行います。
     * <pre>
     * -In the case of packaging decision flag ="N"  Error
     * 
     * - パッケージング確定フラグ = "N" の場合 エラー
     * </pre>
     *
     * @param packagingConfirmedFlg Packaging decision flag<br />パッケージング確定フラグ
     * @return In packaging decision flag ="N", this is false. This is true when that is not right.<br />パッケージング確定フラグ = "N" の場合 falseそうでない場合 true
     *
     */
    public boolean validateConsistencyRegistPkg(String packagingConfirmedFlg);
    
    /**
     * the existence check of update authority to Shipper and Plant(Only when Plant & W/H Declaration is "CIGMA")  
     * <br />Shipper、Plantに対する更新権限の有無チェックする(Plant & W/H Declaration が "CIGMA"の場合のみ)。
     * <pre>
     * - This is confirmed whether Shipper which carried out the screen input, and Plant CD have update authority.
     *     An error is made when the combination of Shipper specified in the list of authority information (update authority) in the pictures and Plant CD does not exist (with no update authority).  
     *
     * - 画面入力した Shipper と Plant CD に更新権限があるかチェックする
     *     権限情報(更新権限)のリストの中に、画面で指定した Shipper と Plant CD の組合せが存在しない場合はエラー(更新権限なし)
     * </pre>
     * @param shipperCd Shipper
     * @param plntCd Plant CD
     * @return This is false when you have no update authority. This is true when that is not right.<br />更新権限なしの場合 falseそうでない場合 true
     *
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException;
    
    /**
     * Check a PKG Form TYPE
     * <br />梱包形態区分のチェックを行います。
     * <pre>
     * A PKG Form TYPE (hidden) in two or more data which data selection is made and was chosen.
     * When the data of "S" exists   Error
     *
     * 2つ以上のデータ選択されているかつ、選択したデータ内に梱包形態区分(hidden)が
     * "S"のデータが存在する場合 エラー
     * </pre>
     * @param pkgFormTypList The list of PKG Form TYPEs<br />梱包形態区分のリスト
     * @return list size >= 1 of an argument -- and --   the inside of selected data -- PKG Form TYPE (hidden) This is false when the data of "S" exists. This is true when that is not right.<br />引数のリストサイズ >= 1 かつ 選択したデータ内に梱包形態区分(hidden)が"S"のデータが存在する場合は false そうでない場合は true
     */
    public boolean validateConsistencySingleItemNo(List<String> pkgFormTypList);
    
    /**
     * Check Loading position code 
     * <br />荷積み位置コードチェックを行います。
     * <pre>
     * - An error is made when "D" (Door) and "B" (Back) are intermingled in the loading position code of all the selected data.
     *   *"F" (Free) can be intermingled with other CDs.
     *     
     * - 選択された全データの荷積み位置コードに"D"（Door）と"B"（Back）が混在している場合エラー
     *   ※"F"（Free）は他コードと混在可
     * </pre>
     *
     * @param loadingCdList L/D-CD list<br />荷積位置コードリスト
     * @return This is false when "D" (Door) and "B" (Back) are intermingled in the loading position code of all the selected data. This is true when that is not right.<br />選択された全データの荷積み位置コードに"D"（Door）と"B"（Back）が混在している場合は falseそうでない場合は true
     * 
     */
    public boolean validateConsistencyStagingCd(List<String> loadingCdList);

    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * Check the use propriety of CIGMA
     * <br />CIGMAの利用可否をチェックします。
     * <pre>
     * - Shipper confirms whether to be among a night batch.
     *
     * - Shipperが夜間バッチ中かをチェックします。
     *   詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * </pre>
     * 
     * @param isShipping24hFunc The functional flag corresponding to 24H shipment<br />24H出荷対応機能フラグ
     * @param compCd COMPANY CODE<br />会社コード
     * @return If CIGMA can be used, they will be true, otherwise, false.<br />CIGMAが利用可能であればtrue、そうでなければfalse
     * @throws ApplicationException When use propriety of CIGMA cannot be judged<br />CIGMAの利用可否を判定できない場合
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc,
        String compCd) throws ApplicationException;
    
    /**
     * Confirm whether the combination of Shipper, Customer, and Ship to is right
     * <br />Shipper、Customer、Ship to　の組み合わせが正しいかどうかをチェックします。
     * <pre>
     * - Shipper, Customer, and Ship to Combination check
     *
     * - Shipper、Customer、Ship to　組み合わせチェック
     *   詳細は共通仕様.xls「機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック」を参照
     * </pre>
     * 
     * @param lgcyLibCompCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipToCd SHIP TO CODE<br />送荷先コード
     * @return It will be true if the combination of a company, a customer, and a Ship to exists in a CIGMA Ship To Cross Reference Master,Otherwise, false<br />会社、得意先、送荷先の組み合わせがNEXUS送荷先クロスリファレンス原単位に存在すればtrue、そうでなければfalse
     * 
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master cannot be referred to<br />NEXUS送荷先クロスリファレンス原単位が参照できない場合
     */
    public boolean validateDatabaseShipperCustomerShipTo(
        String lgcyLibCompCd, String customerCd, String lgcyShipToCd)
        throws ApplicationException;
    
    /**
     * Confirm whether the inputted COMPANY CODE exists in a NEXUS Company Master as a shippe
     * <br />入力された会社コードがNEXUS会社原単位に荷主として存在するかどうかをチェックします。
     * <pre>
     * - Shipper existence check
     *
     * - Shipper存在チェック
     *   詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return if a COMPANY CODE exists in a NEXUS Company Master as a shipper, return true. Otherwise return false.<br />会社コードが荷主としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseShipperOnHeaderMoveToCreate(String compCd) throws ApplicationException;
    
    /**
     * Confirm whether the combination of Shipper, W/H, and Plant is right
     * <br />Shipper、W/H、Plant の組み合わせが正しいかどうかをチェックします。
     * <pre>
     * - Shipper, W/H, and Plant Combination check (only in plantCd!="", it carries out)
     *   {@link CommonService#validateShipperWhPlant(String, String, String)} is called.
     *
     * - Shipper、W/H、Plant　組み合わせチェック(plantCd≠"" の場合のみ行う)
     *   詳細は共通仕様.xls「機能仕様共通：Shipper、W/H、Plant　組み合わせチェック」を参照
     *   {@link CommonService#validateShipperWhPlant(String, String, String)} を呼出す。
     *   
     * </pre>
     * @param lgcyLibCompCd COMPANY CODE<br />会社コード
     * @param lgcyWhCd W/H CD<br />倉庫コード
     * @param plantCd Factory code<br />工場コード
     * @return It will be true if the combination of factory code ="" or a company, W/H, and a factory code exists in a NEXUS CIGMA Warehouse Cross Reference Master,Otherwise, false<br />工場コード="" または、 会社、W/H、工場コードの組み合わせがNEXUS倉庫クロスリファレンス原単位に存在すればtrue、
     *          そうでなければfalse
     * @exception ApplicationException When NEXUS CIGMA Warehouse Cross Reference Master cannot be referred to<br />NEXUS倉庫クロスリファレンス原単位が参照できない場合
     */
    public boolean validateDatabaseShipperWhPlantOnRegister(String lgcyLibCompCd, String lgcyWhCd, String plantCd) throws ApplicationException;

    /**
     * Consignee existence check
     * <br />荷受人存在チェックします。
     * <pre>
     * - {@link W2009CmlDao#searchTmCigmaCustomerToXref(W2009CmlCriteriaDomain)} is called.
     *     * An acquisition VALUE is returned in order to use the VALUE acquired here at the time of registration.
     *
     * - {@link W2009CmlDao#searchTmCigmaCustomerToXref(W2009CmlCriteriaDomain)} を呼出す。
     *   ※ 登録時にここで取得した値を利用する為、取得値を返す。
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @return Consignee (an error is made when a Consignee is null)<br />荷受人 (荷受人がnullの場合はエラー)
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(String shipperCd, String customerCd) throws ApplicationException;
    
    /**
     * Exterior sign existence check
     * <br />外装記号の存在チェックを行います。
     * <pre>
     * Only in - outerCd !="", carry out.
     * - The following condition items are set to {@link TmPkgSetHdrCriteriaDomain}.
     *     {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)} is called.
     *       - Condition items
     *       - shipperCd
     *       - outerCd
     *
     * - data acquisition number check
     *    An error is made when the acquisition number is zero affair (MSGID :  NXS-E 7-0147).
     *
     * - VOLUME information registration check
     *     - An error is made when the item of "" exists in the following items (MSGID :  NXS-E 7-0156).
     *     - volumeUnit
     *     - volume
     *     - lengthUnit
     *     - length
     *     - width
     *     - height
     *
     * - When errorless, the item of the acquired following is set to {@link W2009CmlCriteriaDomain} of an argument.
     *     - wkVolumeUnit
     *     - wkVolume
     *     - wkLengthUnit
     *     - wkLength
     *     - wkWidth
     *     - wkHeight
     *
     * - outerCd ≠ "" の場合のみ行う
     * - {@link TmPkgSetHdrCriteriaDomain}に、以下の条件項目を設定して
     *   {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出す。
     *     - 条件項目
     *       - shipperCd
     *       - outerCd
     *       
     * - データ取得件数チェック
     *   取得件数が0件の場合はエラー (MSGID : NXS-E7-0147)
     *   
     * - 容積情報登録チェック
     *   - 以下の項目の中に""の項目が存在する場合はエラー (MSGID : NXS-E7-0156)
     *     - volumeUnit
     *     - volume
     *     - lengthUnit
     *     - length
     *     - width
     *     - height
     *     
     * - エラーがなかった場合は、引数の{@link W2009CmlCriteriaDomain}に、取得した以下の項目を設定する。
     *     - wkVolumeUnit
     *     - wkVolume
     *     - wkLengthUnit
     *     - wkLength
     *     - wkWidth
     *     - wkHeight
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param outerCd OUTER PACKAGE CODE<br />外装コード
     * @param criteria The domain for an acquisition item return<br />取得項目返却用のドメイン
     * @return When there is an error   Error message. This is null when that is not right.<br />エラーがあった場合 エラーメッセージそうでない場合 null
     * 
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd(String shipperCd, String outerCd, W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Ship-to existence check
     * <br />送荷先の存在チェックを行います。
     * <pre>
     * - {@link W2009CmlDao#searchTmCigmaShipToXref(W2009CmlCriteriaDomain)} is called.
     *     * An acquisition VALUE is returned in order to use the VALUE acquired here at the time of registration.
     *
     * - {@link W2009CmlDao#searchTmCigmaShipToXref(W2009CmlCriteriaDomain)} を呼出す。
     *   ※ 登録時にここで取得した値を利用する為、取得値を返す。
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LGCY Ship to<br />LGCY送荷先
     * @return Ship to (an error is made when a Ship to is null)<br />送荷先 (送荷先がnullの場合はエラー)
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(String shipperCd, String customerCd, String lgcyShipTo) throws ApplicationException;
    
    /**
     * Exterior sign existence check
     * <br />外装記号の存在チェックを行います。
     * <pre>
     * Only in - changeOuterCd !="", carry out.
     * - The following condition items are set to {@link TmPkgSetHdrCriteriaDomain}.
     *     {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)} is called.
     *       - Condition items
     *       - shipperCd
     *       - changeOuterCd
     *
     * - data acquisition number check
     *     An error is made when the acquisition number is zero affair (MSGID :  NXS-E 7-0147).
     *
     * - VOLUME information registration check
     *     - An error is made when the item of "" exists in the following items (MSGID :  NXS-E 7-0156).
     *     - volumeUnit
     *     - volume
     *     - lengthUnit
     *     - length
     *     - width
     *     - height
     *
     * - changeOuterCd ≠ "" の場合のみ行う
     * - {@link TmPkgSetHdrCriteriaDomain}に、以下の条件項目を設定して
     *   {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出す。
     *     - 条件項目
     *       - shipperCd
     *       - changeOuterCd
     *       
     * - データ取得件数チェック
     *   取得件数が0件の場合はエラー (MSGID : NXS-E7-0147)
     *   
     * - 容積情報登録チェック
     *   - 以下の項目の中に""の項目が存在する場合はエラー (MSGID : NXS-E7-0156)
     *     - volumeUnit
     *     - volume
     *     - lengthUnit
     *     - length
     *     - width
     *     - height
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param outerCd OUTER PACKAGE CODE<br />外装コード
     * @return When there is an error   Error message. This is null when that is not right.<br />エラーがあった場合 エラーメッセージ そうでない場合 null
     * 
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister(String shipperCd, String outerCd) throws ApplicationException;
    
    /**
     * CIGMA warehouse information check
     * <br />CIGMA倉庫情報をチェックします。
     * <pre>
     * - CIGMA warehouse information acquisition
     *       criteria The following is set to {@link W2009CmlCriteriaDomain}.
     *         - The list of above-mentioned authority informations {@link UserAuthDomain}
     *       - packingWhCompCd W/H Company
     *       - packingWhCd NEXUS W/H
     *       criteria is made into an argument and {@link W2009CmlDao#searchTmCigmaWhXrefByAuthList(W2009CmlCriteriaDomain)} is called.
     *
     * - The acquisition number check
     *       An error is made when there is zero CIGMA warehouse information.
     *
     * - CIGMA倉庫情報取得
     *     criteria {@link W2009CmlCriteriaDomain} に以下を設定
     *       - 上記の権限情報 {@link UserAuthDomain} のリスト
     *       - packingWhCompCd W/H Company 
     *       - packingWhCd NEXUS W/H
     *     criteria を引数にして、{@link W2009CmlDao#searchTmCigmaWhXrefByAuthList(W2009CmlCriteriaDomain)}を呼出す。
     * 
     * - 取得件数チェック
     *     CIGMA倉庫情報が0件の場合はエラー 
     * 
     * </pre>
     * @param criteria packingWhCompCd W/H Company and packingWhCd NEXUS W/H are set up.<br />packingWhCompCd W/H Company、 packingWhCd NEXUS W/H が設定されている
     * @return The list of CIGMA warehouse information<br />CIGMA倉庫情報のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Perform a Packing-material existence check
     * <br />包装材存在チェックを行います。
     * <pre>
     * Perform the following checks to all the data of - Brch. ="."
     * - The following condition items are set to {@link TmPkgMtrlCriteriaDomain}.
     *     {@link TmPkgMtrlService#searchCount} is called.
     *     Condition items
     *   - shipperCd
     *   - pkgItemNo
     * When the number of - acquired data is zero, make an error.
     *
     * - Brch. = "" の全てのデータに対して以下のチェックを行う。
     * - {@link TmPkgMtrlCriteriaDomain} に以下の条件項目を設定し
     *   {@link TmPkgMtrlService#searchCount} を呼出す。
     *   条件項目
     *   - shipperCd
     *   - pkgItemNo
     * - 取得データが0件の場合はエラー
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param pkgItemNo Packing material No<br />梱包材No
     * @return This is false when a packing material does not exist. This is true when that is not right.<br />梱包材が存在しない場合はfalseそうでない場合はtrue
     *           
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTmPkgMaterialsOnDetail(String shipperCd, String pkgItemNo) throws ApplicationException;

    /**
     * VOLUME information registration check
     * <br />容積情報登録チェックを行います。
     * <pre>
     * Only in - outerCd !="", carry out.
     * - All the line part checks selected in the pictures are performed.
     *
     * - {@link W2009CmlDao#searchTmPkgSpecificationDtl(W2009CmlCriteriaDomain)} is called.
     *
     * - Existence check
     *       An error is made when there is zero corresponding information (MSGID :  NXS-E 7-0155).
     *
     * - VOLUME information registration check
     *       An error is made when the item of "" exists in the item of the acquired following (MSGID :  NXS-E 7-0155).
     *
     * - When errorless, the item of the acquired following is set to {@link W2009CmlCriteriaDomain} of an argument.
     *     - wkVolumeUnit
     *     - wkVolumePalletize
     *     - wkLengthUnit
     *     - wkLengthPalletize
     *     - wkWidthPalletize
     *     - wkHeightPalletize
     *
     * - outerCd ≠ "" の場合のみ行う
     * - 画面で選択した全行分チェックを行う。
     * 
     * - {@link W2009CmlDao#searchTmPkgSpecificationDtl(W2009CmlCriteriaDomain)}を呼出す。
     * 
     * - 存在チェック
     *     該当情報が0件の場合はエラー (MSGID : NXS-E7-0155)
     * 
     * - 容積情報登録チェック
     *     取得した以下の項目に"" の項目が存在する場合はエラー (MSGID : NXS-E7-0155)
     * 
     * - エラーがなかった場合は、引数の{@link W2009CmlCriteriaDomain}に、取得した以下の項目を設定する。
     *     - wkVolumeUnit
     *     - wkVolumePalletize
     *     - wkLengthUnit
     *     - wkLengthPalletize
     *     - wkWidthPalletize
     *     - wkHeightPalletize
     * </pre>
     *
     * @param shipperCd Shipper
     * @param trnsCd Trans.
     * @param itemNo Mix Tag No./ Item No.
     * @param pkgCd PKG CD
     * @param criteria The domain for an acquisition item return<br />取得項目返却用のドメイン
     * @return This is an error message when there is an error. This is null when that is not right.<br />エラーがあった場合はエラーメッセージそうでない場合は null
     *          
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTmPkgSpecificationDtlOnRegister(String shipperCd, String trnsCd, String itemNo, String pkgCd, W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    
    /**
     * MIX thing vote update authority check
     * <br />MIX現品票更新権限チェックを行います。
     * 
     * <pre>
     * - The list of link items is acquired to the specified MIX thing vote No.
     *     The MIX thing vote No is set to {@link TtMixtagItemNoCriteriaDomain},
     *     {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)} is called.
     *
     * - At least one factory code is not contained in an update authority list in the acquired items.
     *     When there is a thing, this is considered that he has no update authority.
     *
     * - 指定したMIX現品票Noに紐づく品目のリストを取得する
     *   {@link TtMixtagItemNoCriteriaDomain} にMIX現品票No を設定し、
     *   {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)} を呼出す。
     *   
     * - 取得した品目の中に、1件でも工場コードが、更新権限リストに含まれない
     *   ものがあった場合、更新権限なしとみなす。
     * </pre>
     *
     * @param mixTagNo MIX thing vote No<br />MIX現品票No
     * @param userAuthList Update authority list<br />更新権限リスト
     * @return In with update authority, this is true. <br />更新権限ありの場合 true
     *         This is false when you have no update authority.<br />更新権限なしの場合 false
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtMixedtagAuthOnCreateUpdate(String mixTagNo,
        List<? extends UserAuthDomain> userAuthList) throws ApplicationException;
    
    /**
     * MIX thing vote check
     * <br />MIX現品票チェックを行います。
     * <pre>
     * - Only in mixTag Flg ="Y", carry out.
     *
     * - The lock of Mix Tag
     *     - A Mix Tag is locked on condition of major key.
     *       {@link TtMixtagService#lockByKeyNoWait(TtMixtagCriteriaDomain)}
     *       Acquisition item
     *        - mixTagStatus
     *
     *     - The acquisition number
     *         An error is made when the acquisition number is zero affair (MSGID :  NXS-E 7-0090).  
     *
     * - Status check
     *     - MULTI-ITEM-NO-IN-BOX-STATUS check
     *       - When the state of the multi-article small box for a Palletize is ending with a PKG, this is considered as an error.
     *         In mixTagStatus ="20" acquired above, an error is made (MSGID :  NXS-E 1-0029).  
     *
     *
     * - mixTagFlg = "Y" の場合のみ行う
     * 
     * - MIXED現品票のロック
     *   - 主キーを条件に、MIXED現品票をロック
     *     {@link TtMixtagService#lockByKeyNoWait(TtMixtagCriteriaDomain)}
     *     取得項目
     *      - mixTagStatus
     *   
     *   - 取得件数
     *       取得件数が0件の場合エラー (MSGID : NXS-E7-0090)
     * 
     * - ステータスチェック
     *   - 小箱内多品ステータスチェック
     *     - パレタイズ対象の多品小箱の状態が梱包済みになっている場合はエラーとする
     *       上記で取得した mixTagStatus = "20" の場合はエラー (MSGID : NXS-E1-0029)
     *
     * </pre>
     * @param mixTagFlg MIX TAG FLAG<br />MIXタグフラグ
     * @param mixTagNo MIX TAG NO<br />MIXタグNO
     * @return This is an error message when there is an error. This is null when that is not right.<br />エラーがあった場合はエラーメッセージそうでない場合は null
     *
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTtMixedTagOnRegister(String mixTagFlg, String mixTagNo) throws ApplicationException;
    
    /**
     * Perform a Palletize-Instruction-Item-No check
     * <br />梱包指示品目番号チェックを行います。
     * <pre>
     * - Only in pltzInstrNo !="", carry out.
     *
     * - The following condition items are set to {@link W2009CmlCriteriaDomain}.
     *     - Condition items
     *       pltzInstrNo
     *
     * - Lock of a Palletize Instruction Item No
     *     {@link W2009CmlDao#searchTtPltzInstrItemNoLockBypltzInstrNoNowait(W2009CmlCriteriaDomain)}
     *     It calls.
     *
     * - The acquisition number check
     *     - An error is made when there is zero information acquired above.
     *
     * - pltzInstrNo ≠ "" の場合のみ行います。
     * 
     * 
     * - {@link W2009CmlCriteriaDomain} に以下の条件項目を設定する。
     *   - 条件項目
     *     pltzInstrNo
     * 
     * - 梱包指示品目番号のロック
     *   {@link W2009CmlDao#searchTtPltzInstrItemNoLockBypltzInstrNoNowait(W2009CmlCriteriaDomain)}
     *   を呼出す。
     * 
     * - 取得件数チェック
     *   - 上記で取得した情報が0件の場合はエラー
     *   
     * </pre>
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @return This is false when the acquisition number is zero affair. This is true when that is not right. <br />取得件数が0件の場合 false そうでない場合 true
     * 
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtPltzInstrItemNoOnRegister(String pltzInstrNo) throws ApplicationException;
    
    /**
     * Perform a directions over check
     * <br />指示超えチェックを行います。
     * <pre>
     * - pltzInstrNo !=""    And only in mixTagFlg !="N", it carries out.
     *
     * - The following condition items are set to {@link W2009CmlCriteriaDomain}.
     *     - Condition items
     *     pltzInstrNo
     *     mixTagNo
     *     pkgCd
     *
     * - Data is acquired.
     *   {@link W2009CmlDao#searchTtPltzInstrItemNo(W2009CmlCriteriaDomain)}
     *     - Acquisition item
     *      - packedQty
     *      - qty
     *
     * - Excess check
     *       the QUANTITY contained in QUANTITY - mixTag of which the INSTRUCTION-QUANTITY -  PKG is done < QUANTITY (Actual PKG Qty) to add  
     *       (instrQty - packedQty acquired above - qty < qty acquired above)  
     *       In the case   Error
     *
     * - pltzInstrNo ≠ ""  かつ mixTagFlg ≠ "N" の場合のみ行います。
     * 
     * - {@link W2009CmlCriteriaDomain} に以下の条件項目を設定する。
     *   - 条件項目
     *     pltzInstrNo
     *     mixTagNo
     *     pkgCd
     * 
     * - データを取得する
     *   {@link W2009CmlDao#searchTtPltzInstrItemNo(W2009CmlCriteriaDomain)}
     *   - 取得項目
     *      - packedQty
     *      - qty
     *   
     * - 超過チェック
     *     梱包指示数量 - 梱包されている数量 - mixTag に含まれる数量 < 追加したい数量(Actual PKG Qty)
     *     (instrQty - 上記で取得したpackedQty - 上記で取得したqty < qty )
     *     の場合 エラー
     *     
     * </pre>
     * 
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @param mixTagFlg MIX TAG FLAG<br />MIXタグフラグ
     * @param mixTagNo MIX TAG NO<br />MIXタグNO
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param instrQty LEFT INSTRUCTION QUANTITY<br />残指示数量
     * @param qty QUANTITY<br />数量
     * @return This is false when exceeding the number of Packaging Instruction (=Pull)s. This is true when that is not right. <br />梱包指示数を超える場合 false そうでない場合 true
     *           
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr(
        String pltzInstrNo, String mixTagFlg, String mixTagNo, String pkgCd,
        BigDecimal instrQty, BigDecimal qty) throws ApplicationException;
    
    /**
     * Perform a Packaging Instruction check
     * <br />梱包指示チェックを行います。
     * <pre>
     * - Only in pltzInstrNo !="", carry out.
     *
     * - Lock of a Packaging Instruction (=Pull)
     *       {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}
     *       It calls.
     *
     * - The acquisition number check
     *     - An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).  
     *
     * - Status check
     *     (when all the Palletizes of the ITEM NO contained in a Packaging Instruction (=Pull) are completed, this is considered as an error.)  
     *     - pltzInstrStatus of the information acquired above = in the case of 40 or 50   Error    (MSGID :  NEX-E 1-0027)  
     *
     *
     * - pltzInstrNo ≠ "" の場合のみ行います。
     * 
     * - 梱包指示のロック
     *     {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}
     *     を呼出す。
     *     
     * - 取得件数チェック
     *   - 上記で取得した情報が0件の場合はエラー (MSGID : GSCM-E0-0010)
     *     
     * - ステータスチェック
     *   (梱包指示に含まれる品目番号のパレタイズが全て完了している場合はエラーとする。)
     *   - 上記で取得した情報の pltzInstrStatus = 40 または 50 の場合 エラー  (MSGID : NEX-E1-0027)
     * </pre>
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @return When there is an error   Error message This is null when that is not right. <br />エラーがあった場合は エラーメッセージ そうでない場合は null
     * 
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTtPltzInstrOnRegister(String pltzInstrNo) throws ApplicationException;
    
    /**
     * Perform a Packaging Instruction check
     * <br />梱包指示チェックを行います。
     * <pre>
     * Only in - pltzInstrNo!="", carry out.
     * - Packaging Instruction (=Pull) check
     *     - The lock of a Packaging Instruction (=Pull) is acquired.
     *         pltzInstrNo is set to {@link TtPltzInstrCriteriaDomain}.
     *         {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)} is called.
     *     - Number-of-cases check
     *         An error is made when the number of acquired data is zero (MSGID :  GSCM-E 0-0010).
     *
     * - Palletize-Instruction-Item-No check
     *     - The lock of a Palletize Instruction Item No is acquired.
     *         pltzInstrNo is set to {@link W2009CmlCriteriaDomain}.
     *         {@link W2009CmlDao#searchTtPltzInstrItemNoLockBypltzInstrNoNowait(W2009CmlCriteriaDomain)} is called.
     *     - Number-of-cases check
     *         An error is made when the number of acquired data is zero (MSGID :  GSCM-E 0-0010).
     *
     * - pltzInstrNo≠"" の場合のみ行う。
     * - 梱包指示チェック
     *   - 梱包指示のロックを取得する
     *       {@link TtPltzInstrCriteriaDomain}に pltzInstrNo を設定し
     *       {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)} を呼出す。
     *   - 件数チェック
     *       取得データが0件の場合はエラー (MSGID : GSCM-E0-0010)
     *     
     * - 梱包指示品目番号チェック
     *   - 梱包指示品目番号のロックを取得する
     *       {@link W2009CmlCriteriaDomain}に pltzInstrNo を設定し
     *       {@link W2009CmlDao#searchTtPltzInstrItemNoLockBypltzInstrNoNowait(W2009CmlCriteriaDomain)} を呼出す。
     *   - 件数チェック
     *       取得データが0件の場合はエラー (MSGID : GSCM-E0-0010)
     * </pre>
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) number<br />梱包指示番号
     * @return When there is an error   Error message This is null when that is not right. <br />エラーがあった場合は エラーメッセージ そうでない場合は null
     *
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTtPltzInstrOnRegisterCancel(String pltzInstrNo) throws ApplicationException;
    
    
    /**
     * PALLETIZE INSTRUCTION STATUS Check 
     * <br /> 梱包指示ステータスチェック。
     * 
     * <pre>
     * - Packaging Instruction check
     *     - A Packaging Instruction is acquired.
     *         pltzInstrNo is set to {@link TtPltzInstrCriteriaDomain}.
     *         {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)} is called.
     *     - PALLETIZE-INSTRUCTION-STATUS check
     *       (unless this is after printing CML on a Packaging Instruction (=Pull) screen in the case of an Instructed(=Pull) Palletizing, printing of a CML screen cannot be performed)  
     *         In the case of pltzInstrStatus !="50" Error (MSGID :  NXS-E 1-0046)
     *
     * - 梱包指示チェック
     *   - 梱包指示を取得する
     *       {@link TtPltzInstrCriteriaDomain}に pltzInstrNo を設定し
     *       {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}を呼出す。
     *   - 梱包指示ステータスチェック
     *     (指示パレタイズの場合は梱包指示画面でCMLを印刷した後でないと、CML画面の印刷は行えない)
     *       pltzInstrStatus ≠ "50" の場合は エラー (MSGID : NXS-E1-0046)
     *       
     * @param pltzInstrNo Packaging Instruction (=Pull) number<br />梱包指示番号
     * @return When there is an error   Error message This is null when that is not right. <br />エラーがあった場合は true そうでない場合は false
     *
     * @throws ApplicationException  When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtPltzInstrPrintCml(String pltzInstrNo) throws ApplicationException;
        // UT414 MOD refactoring method name
    
    /**
     * PALLETIZE-INSTRUCTION-STATUS check
     * <br /> 梱包指示ステータスチェック。
     * <pre>
     * - Palletize Instr. No. acquisition
     *     - mainMark is set as {@link TtPltzCriteriaDomain}.
     *       {@link TtPltzService#searchByKey(TtPltzCriteriaDomain)} is called.
     *
     * - Status check of a Packaging Instruction (=Pull)
     *     (unless this is after printing CML on a Packaging Instruction (=Pull) screen in the case of an Instructed(=Pull) Palletizing, printing of a CML screen cannot be performed)  
     *
     *     - If the Packaging Instruction data  can get and not pltzInstorNo ≠ "" (null)
     *       pltzInstorNo is set to {@link TtPltzInstrCriteriaDomain}.
     *       {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)} is called.
     *       In pltzInstrStatus!="50", an error is made.
     *
     *     - Otherwise no error
     *       (it contains, also when pltzInstorNo cannot be acquired)  
     *
     *
     * - 梱包指示No取得
     *   - {@link TtPltzCriteriaDomain}にmainMarkを設定し
     *     {@link TtPltzService#searchByKey(TtPltzCriteriaDomain)}を呼出す。
     *   
     * - 梱包指示のステータスチェック
     *   (指示パレタイズの場合は梱包指示画面でCMLを印刷した後でないと、CML画面の印刷は行えない)
     *   
     *   - 上記でデータが取得でき、pltzInstorNo ≠ "" (null) でない場合は
     *     {@link TtPltzInstrCriteriaDomain}にpltzInstorNoを設定し
     *     {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}を呼出す。
     *     pltzInstrStatus≠"50" の場合はエラー
     *     
     *   - そうでない場合はエラーなし
     *     (pltzInstorNoが取得できない場合も含む)
     * </pre>
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @return In after printing CML on an Instructed(=Pull) Palletizing and a Packaging Instruction (=Pull) screen, this is true. This is false when that is not right. <br />指示パレタイズかつ梱包指示画面でCMLを印刷した後の場合 true そうでない場合は false
     *           
     * @throws ApplicationException  When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtPltzInstrOnTransRevisePrintCml(String mainMark) throws ApplicationException;
    
    /**
     * Instructed(=Pull) Palletizing check (when Palletize Instr Required is Y)  
     * <br />指示パレタイズチェック(Palletize Instr Required がYの場合)
     * <pre>
     *
     * - A Packaging Instruction (=Pull) information is acquired.
     *       A Packaging Instruction (=Pull) and a CIGMA Warehouse Cross Reference Master are searched.
     *       To {@link W2009CmlCriteriaDomain}, this is the above-mentioned {@link UserAuthService#getUserAuthList(String...)}.
     *       Palletize Instr. No. is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchTtPltzInstr(W2009CmlCriteriaDomain)} is called.
     *
     * - Packaging Instruction (=Pull) information information check
     *       An error is made when there is zero Packaging Instruction (=Pull) information (MSGID:NXS-E 7-0047).
     *       Subsequent checks are not performed.
     *
     * - Packaging Instruction (=Pull) document printing check
     *       Before Packaging Instruction (=Pull) document printing, since a Palletize is improper, an error is made.
     *         In pltzInstrStatus ="10", an error is made (MSGID:NXS-E 7-0086).
     *
     * - Check pltzInstrStatus
     *       Since a Palletize is improper when a Packaging Instruction (=Pull) is already in the completion state of a PKG, an error is made.
     *         In pltzInstrStatus ="40"or pltzInstrStatus ="50", an error is made (MSGID:NXS-E 7-0048).
     *
     * - NEXUS warehouse information acquisition check
     *       Since a Palletize is improper when the warehouse information of NEXUS is unacquirable, an error is made.
     *         In compCd ="", an error is made (MSGID:NXS-E 0-0030).
     *         In an error, a Packaging Instruction (=Pull) information is set to {@link TtPltzInstrDomain} of an argument for a message indicator.
     *
     * - 梱包指示情報を取得する
     *     梱包指示、倉庫クロスリファレンス原単位を検索
     *     {@link W2009CmlCriteriaDomain} に、上記の{@link UserAuthService#getUserAuthList(String...)} 
     *     {@link W2009CmlCriteriaDomain} に、Palletize Instr. No. を設定して
     *     {@link W2009CmlDao#searchTtPltzInstr(W2009CmlCriteriaDomain)} を呼出す。
     * 
     * - 梱包指示情報情報チェック
     *     梱包指示情報が0件の場合エラー (MSGID:NXS-E7-0047)
     *     以降のチェックは行わない。
     *     
     * - 梱包指示書印刷チェック
     *     梱包指示書印刷前はパレタイズ不可なためエラー
     *       pltzInstrStatus = "10" の場合エラー (MSGID:NXS-E7-0086)
     * 
     * - 梱包完了済みチェック
     *     梱包指示が既に梱包完了状態の場合はパレタイズ不可なためエラー
     *       pltzInstrStatus = "40" or pltzInstrStatus = "50" の場合エラー (MSGID:NXS-E7-0048)
     * 
     * - NEXUS倉庫情報取得チェック
     *     NEXUSの倉庫情報が取得できない場合はパレタイズ不可なためエラー
     *       compCd = "" の場合エラー (MSGID:NXS-E0-0030)
     *       エラーの場合は、メッセージ表示の為に引数の{@link TtPltzInstrDomain} に梱包指示情報を設定
     *     
     * </pre>
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @param ttPltzInstrDomain The domain for returning the argument for error displays<br />エラー表示用の引数を返すためのドメイン
     * @return The list of error message IDs (other case applicable to two or more errors)<br />エラーメッセージIDのリスト(複数のエラーに該当する場合あり)
     * @throws ApplicationException When a Packaging Instruction (=Pull) information cannot be retrieved<br />梱包指示情報が検索できない場合
     */
    public List<String> validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(W2009CmlCriteriaDomain criteria, TtPltzInstrDomain ttPltzInstrDomain) throws ApplicationException;
    
    /**
     * A Palletize-Item check is performed
     * <br /> パレタイズ対象品チェックを行う。
     * <pre>
     * - Palletize-Item check
     *     - The lock of a Palletize information is acquired.
     *       mainMark is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchTtPltzItemLockByMainMarkNowait(W2009CmlCriteriaDomain)} is called.
     *
     *     - Number-of-cases check
     *       An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).
     *
     * - パレタイズ対象品チェック
     *   - パレタイズ情報のロックを取得
     *     {@link W2009CmlCriteriaDomain} に mainMark を設定して
     *     {@link W2009CmlDao#searchTtPltzItemLockByMainMarkNowait(W2009CmlCriteriaDomain)} を呼出す。
     *     
     *   - 件数チェック
     *     上記で取得した情報が0件の場合エラー(MSGID : GSCM-E0-0010)
     * </pre>
     * @param mainMark MAIN MARK<br />メインマーク
     * @return This is an error message when there is an error. This is null when that is not right. <br />エラーがあった場合はエラーメッセージ そうでない場合は null
     *           
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public String validateDatabaseTtPltzItemOnTransReviseRegister(String mainMark) throws ApplicationException;
    
    /**
     * Palletize check
     * <br /> パレタイズチェックを行う。
     * <pre>
     * - A Palletize information is acquired for a MAIN MARK to a key.
     *       mainMark is set as {@link TtPltzCriteriaDomain}.
     *       criteria is made into an argument and {@link TtPltzService#searchByKey(TtPltzCriteriaDomain)} is called.
     *
     * - When the following checks were performed to the acquired Palletize information and it becomes an error
     *     A MESSAGE ID is packed and returned to a list.
     *
     *       - Palletize Status check
     *           When processing after the load making even has been carried out, the change of transportation means is prohibited.
     *             In the case of pltzStatus != 10, an error is made (MSGID:NXS-E 1-0006).
     *
     *       - X-Palletize check
     *          When X-Palletize has been carried out, the change of transportation means is prohibited.
     *             In xmainMark !="", an error is made (MSGID:NXS-E 1-0006).
     *
     *       - Carry-Out ON status check
     *           During a Carry-Out and a Carry-In, the change of transportation means is prohibited.
     *             In lastTrStatus ="20"or lastTrStatus ="30", an error is made (MSGID:NXS-E 1-0030).  
     *
     *       - Shift CML check
     *           If shift CML, the change of transportation means is prohibited.
     *             In migrationFlg ="Y", an error is made.    (MSGID:NXS-E 1-0025)  
     *
     * - メインマークをキーにパレタイズ情報を取得
     *     {@link TtPltzCriteriaDomain}に mainMark を設定し
     *     criteriaを引数にして、{@link TtPltzService#searchByKey(TtPltzCriteriaDomain)}を呼出す
     * 
     * - 取得したパレタイズ情報に対して以下のチェックを行いエラーとなった場合は
     *   リストにメッセージIDを詰めて返す。
     *   
     *     - パレタイズステータスチェック
     *         荷揃え以降を実施済みの場合は輸送手段付け替え不可
     *           pltzStatus ≠ 10 の場合エラー (MSGID：NXS-E1-0006)
     *           
     *     - まとめパレタイズチェック
     *         まとめパレタイズ実施済みの場合は輸送手段付け替え不可
     *           xmainMark ≠ "" の場合エラー (MSGID：NXS-E1-0006)
     *           
     *     - 搬出入状態チェック
     *         搬出・搬入中は輸送手段付け替え不可の為エラー
     *           lastTrStatus = "20" or lastTrStatus = "30" の場合エラー (MSGID：NXS-E1-0030)
     *     
     *     - 移行CMLチェック
     *         移行CMLは輸送手段付け替え不可の為エラー
     *           migrationFlg = "Y" の場合エラー  (MSGID：NXS-E1-0025)
     * </pre>
     * 
     * @param mainMark MAIN MARK<br />メインマーク
     * @return The list of error message IDs (other case applicable to two or more errors)<br />エラーメッセージIDのリスト(複数のエラーに該当する場合あり)
     * @throws ApplicationException When a Palletize information is unacquirable<br />パレタイズ情報が取得できない場合
     */
    public List<String> validateDatabaseTtPltzOnMainTransPkgRevise(String mainMark) throws ApplicationException;
    
    /**
     * Palletize check
     * <br />パレタイズチェックを行う。
     * <pre>
     * - Palletize check
     *     - The lock of a Palletize information is acquired.
     *       mainMark is set as {@link TtPltzCriteriaDomain}.
     *       {@link TtPltzService#lockByKeyNoWait(TtPltzCriteriaDomain)} is called.
     *
     *     - Number-of-cases check
     *       An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).
     *
     *     - Palletize Status check
     *       In the case of pltzStatus != 10, an error is made (MSGID :  NXS-E 1-0006).  
     *
     *     - X-Palletize check
     *       In xmainMark !="", an error is made (MSGID :  NXS-E 1-0006).
     *
     *     - Check of a Carry-Out and a Carry-In
     *       In lastTrStatus = "20" or lastTrStatus ="30", an error is made (MSGID :  NXS-E 1-0047).  
     *
     * - Palletize-Item check
     *     - The lock of a Palletize information is acquired.
     *       mainMark is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchTtPltzItemLockByMainMarkNowait(W2009CmlCriteriaDomain)} is called.
     *
     *     - Number-of-cases check
     *       An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).
     *
     * - Palletize-Item-Receive-Order check
     *     The lock of - Palletize Item Receive Order is acquired.
     *       mainMark is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchTtPltzItemOdrLockByMainMarkNowait(W2009CmlCriteriaDomain)} is called.
     *
     *     - Number-of-cases check
     *       An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).
     *
     * - Palletize-Item-KANBAN check
     *     The lock of - Palletize Item KANBAN is acquired.
     *       mainMark is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchTtPltzKanbanLockByMainMarkNowait(W2009CmlCriteriaDomain)} is called.
     *
     * - パレタイズチェック
     *   - パレタイズ情報のロックを取得
     *     {@link TtPltzCriteriaDomain} に mainMark を設定して
     *     {@link TtPltzService#lockByKeyNoWait(TtPltzCriteriaDomain)} を呼出す。
     *   
     *   - 件数チェック
     *     上記で取得した情報が0件の場合エラー(MSGID : GSCM-E0-0010)
     *     
     *   - パレタイズステータスチェック
     *     pltzStatus ≠ 10 の場合はエラー (MSGID : NXS-E1-0006)
     *     
     *   - まとめパレタイズチェック
     *     xmainMark ≠ "" の場合はエラー (MSGID : NXS-E1-0006)
     *     
     *   - 搬出・搬入のチェック
     *     lastTrStatus = "20" または lastTrStatus = "30" の場合はエラー (MSGID : NXS-E1-0047)
     *     
     * - パレタイズ対象品チェック
     *   - パレタイズ情報のロックを取得
     *     {@link W2009CmlCriteriaDomain} に mainMark を設定して
     *     {@link W2009CmlDao#searchTtPltzItemLockByMainMarkNowait(W2009CmlCriteriaDomain)} を呼出す。
     *     
     *   - 件数チェック
     *     上記で取得した情報が0件の場合エラー(MSGID : GSCM-E0-0010)
     *     
     * - パレタイズ対象品受注情報チェック
     *   - パレタイズ対象品受注情報のロックを取得
     *     {@link W2009CmlCriteriaDomain} に mainMark を設定して
     *     {@link W2009CmlDao#searchTtPltzItemOdrLockByMainMarkNowait(W2009CmlCriteriaDomain)} を呼出す。
     *     
     *   - 件数チェック
     *     上記で取得した情報が0件の場合エラー(MSGID : GSCM-E0-0010)
     *     
     * - パレタイズ対象品かんばん情報チェック
     *   - パレタイズ対象品かんばん情報のロックを取得
     *     {@link W2009CmlCriteriaDomain} に mainMark を設定して
     *     {@link W2009CmlDao#searchTtPltzKanbanLockByMainMarkNowait(W2009CmlCriteriaDomain)} を呼出す。
     *
     * </pre>
     * @param mainMark MAIN MARK<br />メインマーク
     * @return When there is an error, this is a list of error messages. null is returned when that is not right. <br />エラーがあった場合はエラーメッセージのリスト そうでない場合は null を返す。
     *           
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public List<String> validateDatabaseTtPltzOnRegisterCancel(String mainMark) throws ApplicationException;
    
    /**
     * Palletize check
     * <br />パレタイズチェックを行う。
     * <pre>
     * - Palletize check
     *     - The lock of a Palletize information is acquired.
     *       mainMark is set as {@link TtPltzCriteriaDomain}.
     *       {@link TtPltzService#lockByKeyNoWait(TtPltzCriteriaDomain)} is called.
     *
     *     - Number-of-cases check
     *       An error is made when there is zero information acquired above (MSGID :  GSCM-E 0-0010).
     *
     *     - Palletize Status check
     *       In the case of pltzStatus != 10, an error is made (MSGID :  NXS-E 1-0006).  
     *
     *     - X-Palletize check
     *       In xmainMark !="", an error is made (MSGID :  NXS-E 1-0006).
     *
     *     - Check of a Carry-Out and a Carry-In
     *       In lastTrStatus = "20" or lastTrStatus ="30", an error is made (MSGID :  NXS-E 1-0047).  
     *
     * - パレタイズチェック
     *   - パレタイズ情報のロックを取得
     *     {@link TtPltzCriteriaDomain} に mainMark を設定して
     *     {@link TtPltzService#lockByKeyNoWait(TtPltzCriteriaDomain)} を呼出す。
     *   
     *   - 件数チェック
     *     上記で取得した情報が0件の場合エラー(MSGID : GSCM-E0-0010)
     *     
     *   - パレタイズステータスチェック
     *     pltzStatus ≠ 10 の場合はエラー (MSGID : NXS-E1-0006)
     *     
     *   - まとめパレタイズチェック
     *     xmainMark ≠ "" の場合はエラー (MSGID : NXS-E1-0006)
     *     
     *   - 搬出・搬入のチェック
     *     lastTrStatus = "20" または lastTrStatus = "30" の場合はエラー (MSGID : NXS-E1-0047)
     *     
     * </pre>
     *
     * @param mainMark MAIN MARK<br />メインマーク
     * @param criteria The domain for an acquisition item return<br />取得項目返却用のドメイン
     * @param errorMessages The list which stores an error message <br />エラーメッセージを格納するリスト
     * @return If it has no error return true, otherwise false. <br />エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException  When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTtPltzOnTransReviseRegister(String mainMark, W2009CmlCriteriaDomain criteria, List<MessageDomain> errorMessages) throws ApplicationException;

    /**
     * Palletize-Item-Work registration check
     * <br />パレタイズ対象品ワーク登録チェックを行う。
     * <pre>
     *
     * - Palletize-Item-Work information acquisition
     *       The following is set to {@link TwPltzItemItemNoCriteriaDomain},
     *       {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)} is called.
     *        - dscId/DSC-ID
     *
     * - The acquisition number check
     *       An error is made when there is zero Palletize-Item-Work information.
     *
     * - パレタイズ対象品ワーク情報取得
     *     {@link TwPltzItemItemNoCriteriaDomain} に以下を設定して、
     *     {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)}を呼出す。
     *      - dscId/DSC-ID
     *
     * - 取得件数チェック
     *     パレタイズ対象品ワーク情報が0件の場合はエラー
     * </pre>
     * 
     * @param dscId Login user ID<br />ログインユーザID
     * @return This is false when there is zero Palletize-Item-Work information. This is true when that is not right.<br />パレタイズ対象品ワーク情報が0件の場合は false そうでない場合は true
     *           
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseTwPltzItemItemNoOnCreateMoveToRegister(String dscId) throws ApplicationException;
    
    /**
     * DB consistency check
     * <br />DB整合性チェックを行う。
     * <pre>
     * - The same Palletize condition check
     *
     *     Only one affair of a head is acquired from - Palletize Item Work.
     *       The following condition items are set to {@link TwPltzItemItemNoCriteriaDomain}.
     *       {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)} is called.
     *       - Condition items
     *          DSC_ID
     *
     *     - CONTAINER-SORTING-KEY check
     *        An error is made when CONTAINER_SORTING_KEY and [53]:Cont. Sort Key are not the same (MSGID:NXS-E 7-0101).
     *
     *     - Inv. Key check
     *        An error is made when INVOICE_KEY and [68]:Inv. Set Key are not the same (MSGID:NXS-E 7-0103).
     *
     *     - staging-instruction flag check
     *        An error is made when STG_INSTR_ITEM_FLG and [69]:Stg. Instr. Flg are not the same (MSGID:NXS-E 7-0104).
     *
     *     - CUSTOM-TIMING-TYPE check
     *        An error is made when CUSTOM_TIMING_TYP and [70]:C/C TYPE are not the same (MSGID:NXS-E 7-0105).
     *
     *     - C/L check
     *        An error is made when CONTAINER_LOOSE_TYP and [58]:C/L are not the same (MSGID:NXS-E 7-0106).
     *
     *     - PACKAGE-FORM-TYPE check
     *        An error is made when PKG_FORM_TYP and [71]:hidden PKG Form TYPE are not the same (MSGID:  NXS-E 7-0107).
     *
     *     - Currency check
     *        An error is made when CURR_CD and [78]:hidden Currency CD are not the same (MSGID:NXS-E 7-0108).
     *
     * - loading position code check
     *       [54]:LD CD checks only to the data of the leading record which is not "F" (Free) in the record selected in the pictures.
     *       パレタイズ対象品ワークの中に、LD CDが F または 画面で選択した値と異なる場合はエラー
     *       If there is LC CDs witch from Palletize Item Work, and even one of them is not F and different from the VALUE that selected in screen,  An error.
     *           The following items are set to {@link W2009CmlCriteriaDomain},
     *           {@link W2009CmlDao#searchTwPltzItemItemNoForChkOnCreate(W2009CmlCriteriaDomain)} is called.
     *
     *           - Condition items
     *            DSC_ID
     *              LOADING_CD as for which Free does not come out in the record selected in the pictures
     *
     *         The acquired number of cases > In the case of 0, an error is made (MSGID:  NXS-E 7-0102).
     *
     * - Single article ITEM-NO check
     *      When the data of "S" has [71]:hidden PKG Form TYPE in the record selected in the pictures
     *
     *       A different record from the VALUE which PLTZ_ITEM_NO or PKG_CD chose into - Palletize Item Work in the pictures.
     *         An error is made when it exists.
     *
     *           The following condition items are set to {@link W2009CmlCriteriaDomain},
     * {@link W2009CmlDao#searchCountTwPltzItemItemNoForSingleChkOnCreate(W2009CmlCriteriaDomain)} is called.
     *
     *           - Condition items
     *            DSC_ID
     *              PLTZ_ITEM_NO of the record selected in the pictures
     *              PKG_CD of the record selected in the pictures
     *
     *         The acquired number of cases > In the case of 0, an error is made (MSGID:  NXS-E 7-0051).  
     *
     * - The registration number check
     *     - A login user's DSC-ID is set to {@link W2009CmlCriteriaDomain}.
     *       {@link W2009CmlDao#searchCountTwPltzItemItemNoForLimitNumChkOnCreate(W2009CmlCriteriaDomain)} It calls.
     *
     *       the acquired number + the number of disableFlg is 'N' > 999  -- error (MSGID:  NXS-E 7-0050)
     *
     *
     *
     * - 同一パレタイズ条件チェック
     * 
     *   - パレタイズ対象品ワークから先頭の1件のみを取得する。
     *     {@link TwPltzItemItemNoCriteriaDomain}に以下の条件項目を設定し
     *     {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)}を呼出す
     *     - 条件項目
     *        DSC_ID
     *  
     *   - コンテナ層別キーチェック
     *      CONTAINER_SORTING_KEYと【53】:Cont. Sort Keyが同一でない場合エラー (MSGID:NXS-E7-0101)
     *      
     *   - インボイスキーチェック
     *      INVOICE_KEYと【68】:Inv. Set Keyが同一でない場合エラー (MSGID:NXS-E7-0103)
     * 
     *   - 荷揃え指示フラグチェック
     *      STG_INSTR_ITEM_FLGと【69】:Stg. Instr. Flgが同一でない場合エラー (MSGID:NXS-E7-0104)
     * 
     *   - 通関タイミング区分チェック
     *      CUSTOM_TIMING_TYPと【70】:C/C TYPEが同一でない場合エラー (MSGID:NXS-E7-0105)
     * 
     *   - コンテナルーズチェック
     *      CONTAINER_LOOSE_TYPと【58】:C/Lが同一でない場合エラー (MSGID:NXS-E7-0106)
     * 
     *   - 梱包形態チェック
     *      PKG_FORM_TYPと【71】:hidden PKG Form TYPEが同一でない場合エラー (MSGID: NXS-E7-0107)
     * 
     *   - 通貨チェック
     *      CURR_CDと【78】:hidden Currency CDが同一でない場合エラー (MSGID:NXS-E7-0108)
     * 
     * - 荷積み位置コードチェック
     *     画面にて選択されたレコードの中で【54】:LD CDが"F"（Free）でない先頭レコードのデータに対してのみチェックを行う
     *     
     *     - パレタイズ対象品ワークの中に、LD CDが F または 画面で選択した値と異なる場合はエラー
     *         {@link W2009CmlCriteriaDomain}に以下の項目を設定し、
     *         {@link W2009CmlDao#searchTwPltzItemItemNoForChkOnCreate(W2009CmlCriteriaDomain)}を呼出す。
     *
     *         - 条件項目
     *            DSC_ID
     *            画面で選択したレコードの中でFreeでないLOADING_CD
     *         
     *       取得した件数 > 0 の場合エラー (MSGID: NXS-E7-0102)
     * 
     * - 単品品目番号チェック
     *    画面にて選択されたレコードの中に【71】:hidden PKG Form TYPEが "S"のデータがある場合
     *    
     *     - パレタイズ対象品ワークの中に、PLTZ_ITEM_NO または PKG_CD が画面で選択した値と異なるレコードが
     *       存在する場合はエラー
     *  
     *         {@link W2009CmlCriteriaDomain}に以下の条件項目を設定し、
     *         {@link W2009CmlDao#searchCountTwPltzItemItemNoForSingleChkOnCreate(W2009CmlCriteriaDomain)}を呼出す。
     *           
     *         - 条件項目
     *            DSC_ID
     *            画面で選択したレコードの PLTZ_ITEM_NO
     *            画面で選択したレコードの PKG_CD
     *         
     *       取得した件数 > 0 の場合エラー (MSGID: NXS-E7-0051)
     * 
     * - 登録件数チェック
     *   - {@link W2009CmlCriteriaDomain} にログインユーザのDSC-IDを設定し
     *     {@link W2009CmlDao#searchCountTwPltzItemItemNoForLimitNumChkOnCreate(W2009CmlCriteriaDomain)}を呼出す。
     *    
     *     取得した件数 ＋ 一覧で選択したデータの中でdisableFlgがNのものの件数 > 999 の場合エラー (MSGID: NXS-E7-0050)
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @param itemDomainList The list of CmlItem domains<br />CmlItemドメインのリスト
     * @return When there is an error, this is an error message list. This is null when errorless. <br />エラーがあった場合、エラーメッセージリスト エラーがなかった場合 null
     *          
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public List<String> validateDatabaseTwPltzItemItemNoOnCreateUpdate(W2009CmlCriteriaDomain criteria, List<? extends W2009CmlItemDomain> itemDomainList) throws ApplicationException;
    
    /**
     * Confirm whether the combination of W/H Company and NEXUS W/H is right
     * <br />W/H Company、NEXUS W/H　の組み合わせが正しいかどうかをチェックします。
     * <pre>
     * - W/H Company, combination of NEXUS W/H
     *     details -- common-specifications .xls -- "-- functional specification common: -- the combination check " of W/H Company and NEXUS W/H is referred to
     *
     * - W/H Company、NEXUS W/H　の組み合わせ
     *   詳細は共通仕様.xls「機能仕様共通：W/H Company、NEXUS W/H　の組み合わせチェック」を参照
     * </pre>
     *
     * @param packingWhCompCd W/H Company
     * @param packingWhCd NEXUS W/H
     * @return This is true when the combination of W/H Company and NEXUS W/H is right. This is false when that is not right.<br />W/H Company、NEXUS W/H　の組み合わせが正しい場合は true そうでない場合は false
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public boolean validateDatabaseWhCompanyWh(String packingWhCompCd, String packingWhCd) throws ApplicationException;
        
    // --------------------------------- Registration system method create  ----------------------------------------------
    // --------------------------------- 登録系メソッド create ----------------------------------------------

    // --------------------------------- Search system method search ----------------------------------------------
    // --------------------------------- 検索系メソッド search ----------------------------------------------

    /**
     * Acquire the search number of a CML Main Screen
     * <br />CML Main Screen画面の検索件数を取得します。
     * <pre>
     * - A Palletize, the search number acquisition of a Palletize Item
     *       criteria is made into an argument and {@link W2009CmlDao#searchCountTtPltzByCml(W2009CmlCriteriaDomain)} is called.
     *
     * - The search number is returned.
     *
     *
     * - パレタイズ、パレタイズ対象品の検索件数取得
     *     criteriaを引数にして、{@link W2009CmlDao#searchCountTtPltzByCml(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 検索件数を返却
     * 
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of search results is zero and a Palletize and a Palletize Item cannot be referred to <br />検索結果が0件の場合、パレタイズ、パレタイズ対象品が参照できない場合
     */
    public int searchCountForPagingOnMainSearch(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * The search number acquisition of a CML Register screen
     * <br />CML Register画面の検索件数取得
     * <pre>
     * - Acquire the number of cases in the case of having changed from CML Create screen (for registration).
     *   - {@link W2009CmlDao#searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain)}
     * - Acquire the number of cases in the case of having changed from CML Main screen (for a reference).
     *   - {@link W2009CmlDao#searchCountTtPltzByMainMarkMixTagNo(W2009CmlCriteriaDomain)}
     *
     * - CML Create画面から遷移してきた場合の件数(登録用)を取得
     *   - {@link W2009CmlDao#searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain)}
     * - CML Main画面から遷移してきた場合の件数(参照用)を取得
     *   - {@link W2009CmlDao#searchCountTtPltzByMainMarkMixTagNo(W2009CmlCriteriaDomain)}
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The search number (in zero affair, it does not become an error)  <br />検索件数(0件の場合もエラーにならない)
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public int searchCountOnRegister(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * The search number acquisition after the delete process of a CML Register screen
     * <br />CML Register画面の削除処理後の検索件数取得
     * <pre>
     * Acquire the number of cases in the case of having changed from - CML Create screen (for registration).
     *   {@link W2009CmlDao#searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain)}
     *
     * - CML Create画面から遷移してきた場合の件数(登録用)を取得
     *   {@link W2009CmlDao#searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain)}
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The search number (in zero affair, it does not become an error) <br />検索件数(0件の場合もエラーにならない)
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountOnRegisterDelete(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Acquire the search results of a CML Create screen
     * <br />CML Create画面の検索結果を取得します。
     * <pre>
     * - 3. information is acquired.
     *     - When Palletize Instr. No is not ""
     *       - A Palletize Instruction Item No is acquired.
     *         An information is acquired by the MIX tag unit and an ITEM NO.
     *           Acquisition in the acquisition-MIX tag unit of a Palletize Instruction Item No
     *           - Mix Tag
     *           - MIXED ITEM NO
     *           - Palletize Item Work
     *         union all
     *           Acquisition of the acquisition-ITEM-NO data of a Palletize Instruction Item No
     *           - Export Formality Item No Master
     *           - Export Receive Order
     *           - Export Shipping Item No Special Information Master
     *           - Palletize Item Work
     *           - A Temp Stock, NEXUS Company Master
     *           - PKG Specification MA(Header)
     *           - PKG Specification MA(Detail)
     *           - Package Specification Revision Master
     *
     *           The following carries out an item setting and it calls {@link W2009CmlDao#searchMixTagItemNoOnCreate(W2009CmlCriteriaDomain)} to criteria.
     *             - Reference: screen definition document_ECA0027_W2011_CML Create.xls Processing No.5    3.2.1.2 and 3.2.2.2 
     *
     *     - When Palletize Instr. No is ""
     *       Acquisition of - result ITEM NO
     *           Acquisition of an acquisition of a result ITEM NO
     *           - Mix-Tag MIXED ITEM NO
     *           - Palletize Item Work
     *         union all
     *           Acquisition of the acquisition-ITEM-NO data of a result ITEM NO
     *           - Export Formality Item No Master
     *           - Export Receive Order
     *           - Export Shipping Item No Special Information Master
     *           - Palletize Item Work
     *           - Temp Stock
     *           - NEXUS Company Master
     *           - PKG Specification MA(Header)
     *           - PKG Specification MA(Detail)
     *           - Package Specification Revision Master
     *
     *           The following items are set to criteria and {@link W2009CmlDao#searchNonInstructionItemNoOnCreate(W2009CmlCriteriaDomain)} is called.
     *             - Reference: screen definition document_ECA0027_W2011_CML Create.xls Processing No.5    3.3.1.2 and 3.3.2.2 
     *
     * - 4. ITEM NOs are acquired from CIGMA.
     *     - When the information on mixTagFlg ="N" does not exist in the information acquired by 3.
     *         - No Action
     *
     *     - When the information on mixTagFlg ="N" exists in the information acquired by 3.
     *         - When Disp. Plnt CD is not "" (when = CIGMA W/H CD is chosen)
     *             - The following WEB services are called to the information on mixTagFlg ="N" in the information acquired above.
     *
     *               {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *
     *                 Argument: Shipper inputted on the Header screen
     *                        Plant CD inputted on the Header screen
     *                        W/H inputted on the Header screen
     *                        This is an information on mixTagFlg ="N" in the information acquired above.   itemNo is repeated and set up.
     *                        Cust. No inputted on the Header screen.
     *
     *         - When Disp. Plnt CD is "" (when = NEXUS W/H CD is chosen)
     *
     *             - CIGMA-Warehouse-Cross-Reference-Master acquisition
     *                - criteria {@link W2009CmlCriteriaDomain},
     *                   Authority information acquired above
     *                   W/H Com inputted on the Header screen.
     *                   NEXUS W/H inputted on the Header screen
     *                   It sets up and calls {@link W2009CmlDao#searchTmCigmaWhXrefByAuth(W2009CmlCriteriaDomain)}.
     *
     *                - An error is made when the number of corresponding data is zero.
     *                  An error message is set up and returned.
     *
     *             - The following WEB services are called to the information on mixTagFlg ="N" in the information acquired by 3.
     *                 {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *                 Argument: Shipper inputted on the Header screen
     *                        plant CD (those with two or more affairs) acquired by CIGMA-Warehouse-Cross-Reference-Master acquisition
     *                        W/H inputted on the Header screen
     *                        This is an information on mixTagFlg ="N" in the information acquired above.   itemNo
     *                        Cust. No inputted on the Header screen.
     *
     *         - This is checked whether WEB service has carried out the normal end.
     *             resultCode of {@link Ws2004ResultDomain} is checked.
     *             - A carrying-out-abnormal end case is a system error.
     *             - When a normal end is carried out
     *                 The QUANTITY UNIT of CIGMAN is changed into a NEXU QUANTITY UNIT, and is set up.
     *                 The top QUANTITY UNIT of the 1st affair is set to lgcyUnitCd of {@link TmMeasureUnitCriteriaDomain}.
     *                 {@link TmMeasureUnitService#searchByCondition(TmMeasureUnitCriteriaDomain)} is called.
     *                 * The QUANTITY UNIT of CIGMAN obtained by the argument to the above-mentioned WEB service is uniform.
     *                 
     * - 5. The list of 4. is combined with tha list of 3.
     *     - On the basis of the list of 3., an ITEM NO (3. ITEM_NO, 4. ITEM NO) is set to KEY, and the list of 4. is combined.
     *       The ITEM NO which did not exist in the list of 4. is excepted from the list of 3. (MIX_TAG_FLG does not except the data of Y).
     *
     * - 6. Number-of-cases check
     *
     *     - When the acquisition number is zero affair   Error
     *     - When the acquisition number exceeds the maximum number   Error
     *
     * - 7. Create of the data for list displays
     *     It extracts to - page number only at the number data of relevance.
     *     - About the following items of the list of 3, this is a VALUE of the list of 4 It overwrites.
     *          3.ON_HAND_QTY  :   4.inventory figures - 3.TMP_QTY
     *          3.CURR_CD      :   4.currency
     *          3.QTY_UNIT     :   4.UNIT_CD
     *          3.PLNT_CD      :   4.factory CD
     *
     * - 8. The list of 7 is returned.
     *
     * - 3.情報を取得する
     *   - Palletize Instr. No が "" でない場合
     *     - 梱包指示品目番号の取得を実施
     *       MIXタグ単位と品目番号で情報を取得する。
     *         梱包指示品目番号の取得-MIXタグ単位での取得
     *         - MIXED現品票
     *         - MIXED品目番号
     *         - パレタイズ対象品ワーク
     *         union all
     *         梱包指示品目番号の取得-品目番号データの取得
     *         - 輸出手続品目番号原単位
     *         - 輸出受注
     *         - 輸出出荷品目番号原単位
     *         - パレタイズ対象品ワーク
     *         - 仮在庫、NEXUS会社原単位
     *         - 包装仕様原単位（ヘッダ）
     *         - 包装仕様原単位（明細）
     *         - 包装仕様有効リビジョン原単位
     *         
     *         criteriaに以下の項目設定して{@link W2009CmlDao#searchMixTagItemNoOnCreate(W2009CmlCriteriaDomain)}を呼出す
     *           - 画面定義書_ECA0027_W2011_CML Create.xls 処理No.5  3.2.1.2、3.2.2.2 参照
     *       
     *   - Palletize Instr. No が "" の場合
     *     - 成行き品目番号の取得
     *         成行品目番号の取得-成行品目番号の取得
     *         - MIXED現品票MIXED品目番号
     *         - パレタイズ対象品ワーク
     *         union all
     *         成行品目番号の取得-品目番号データの取得
     *         - 輸出手続品目番号原単位
     *         - 輸出受注
     *         - 輸出出荷品目番号原単位
     *         - パレタイズ対象品ワーク
     *         - 仮在庫
     *         - NEXUS会社原単位
     *         - 包装仕様原単位（ヘッダ）
     *         - 包装仕様原単位（明細）
     *         - 包装仕様有効リビジョン原単位
     *         
     *         criteria に以下の項目を設定して{@link W2009CmlDao#searchNonInstructionItemNoOnCreate(W2009CmlCriteriaDomain)}を呼出す
     *           - 画面定義書_ECA0027_W2011_CML Create.xls 処理No.5  3.3.1.2、3.3.2.2 参照
     *
     * - 4.CIGMAから品目番号を取得する
     *   - 3.で取得した情報の中に、mixTagFlg = "N" の情報が存在しない場合 
     *       - 処理なし
     *       
     *   - 3.で取得した情報の中に、mixTagFlg = "N" の情報が存在する場合
     *       - Disp. Plnt CD が "" でない場合 (= CIGMA倉庫コードを選択した場合)
     *           - 上記で取得した情報の中で mixTagFlg = "N" の情報に対して以下のWEBサービスをコールする。
     *               
     *               {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *
     *               引数：Header 画面で入力された Shipper
     *                     Header 画面で入力された Plant CD
     *                     Header 画面で入力された W/H
     *                     上記で取得した情報の中で mixTagFlg = "N" の情報 の itemNo を繰返し設定する
     *                     Header 画面で入力された Cust. No.
     *           
     *       - Disp. Plnt CD が "" の場合 (= NEXUS倉庫コードを選択した場合)
     *                
     *           - 倉庫クロスリファレンス原単位取得
     *              - criteria {@link W2009CmlCriteriaDomain} に、
     *                 上記で取得した権限情報
     *                 Header 画面で入力された W/H Com.
     *                 Header 画面で入力された NEXUS W/H
     *                を設定し、{@link W2009CmlDao#searchTmCigmaWhXrefByAuth(W2009CmlCriteriaDomain)} を呼出す
     *                 
     *              - 該当データが0件の場合はエラー
     *                エラーメッセージを設定して返す。
     *                
     *           - 3.で取得した情報の中で mixTagFlg = "N" の情報に対して以下のWEBサービスをコールする。
     *               {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *               
     *               引数：Header 画面で入力された Shipper
     *                     倉庫クロスリファレンス原単位取得で取得した plant CD (複数件あり)
     *                     Header 画面で入力された W/H
     *                     上記で取得した情報の中で mixTagFlg = "N" の情報 の itemNo
     *                     Header 画面で入力された Cust. No.
     *           
     *       - WEBサービスが正常終了したか確認
     *           {@link Ws2004ResultDomain} の resultCode を確認する。
     *           - 異常終了したの場合は、システムエラー
     *           - 正常終了した場合
     *               CIGMANの数量単位をNEXU数量単位に変換して設定
     *               {@link TmMeasureUnitCriteriaDomain} のlgcyUnitCd に、先頭の1件目の数量単位を設定し
     *               {@link TmMeasureUnitService#searchByCondition(TmMeasureUnitCriteriaDomain)} を呼出す。
     *               ※ 上記WEBサービスへの引数で得られるCIGMANの数量単位は一律
     *           
     * - 5. 3 と 4 の情報を結合
     *   - 3.のリストを基準とし、4.のリストを品目番号（3.ITEM_NO、4.品目番号）をKEYにして結合する
     *     4.のリストに存在しなかった品目番号は3.のリストから除外する（MIX_TAG_FLGがYのデータは除外しない）
     *     
     * - 6. 件数チェック
     * 
     *   - 取得件数が0件の場合 エラー
     *   - 取得件数が上限件数を超える場合 エラー
     *     
     * - 7. 一覧表示用データの作成
     *   - ページ番号に該当数データのみに絞る。
     *   - 3 のリストの以下の項目を、4 のリストの値で 上書きする。
     *        3.ON_HAND_QTY : 4.在庫数 - 3.TMP_QTY
     *        3.CURR_CD     : 4.通貨
     *        3.QTY_UNIT    : 4.UNIT_CD
     *        3.PLNT_CD     : 4.工場CD
     * 
     * - 8. 7 のリストを返却する。
     * 
     * </pre>
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return 検索結果
     * @throws GscmApplicationException Search results<br />取得件数が0件の場合
     * @throws ApplicationException When an error occurs in processing of DB<br >DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnCreateSearch(W2009CmlCriteriaDomain criteria) throws GscmApplicationException, ApplicationException;
    
    /**
     * Perform retrieval processing of a CML Main Screen
     * <br />CML Main Screen画面の検索処理を行います。
     * <pre>
     * - A Palletize, the search number acquisition of a Palletize Item
     *       {@link W2009CmlDao#searchForPagingTtPltzByCml(W2009CmlCriteriaDomain)} is called.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2009CmlDomain}.
     *
     * - パレタイズ、パレタイズ対象品の検索件数取得
     *     {@link W2009CmlDao#searchForPagingTtPltzByCml(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2009CmlDomain}のリストで返却
     * 
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public List<? extends W2009CmlDomain> searchForPagingOnMainSearch(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * A screen display after the CML Register screen delete
     * <br />CML Register画面 delete後の画面表示
     * <pre>
     *   This is the same as {@link W2009CmlService#searchOnRegisterInitByFromCreate(W2009CmlCriteriaDomain)}
     *
     * {@link W2009CmlService#searchOnRegisterInitByFromCreate(W2009CmlCriteriaDomain)} と同じ
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Search number<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchOnRegisterDelete(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Perform retrieval processing of a CML Trans Revise screen
     * <br />CML Trans Revise画面の検索処理を行います。
     * <pre>
     * - Search of a Palletize and a measurement master
     *       criteria is made into an argument and {@link W2009CmlDao#searchTmMeasureUnit(W2009CmlCriteriaDomain)} is called.
     *
     * - When a changing agency is a CML PKG Info Detail screen, a PKG combination master (header) is searched.
     *       criteria is made into an argument and {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)} is called.
     *
     * - A VOLUME is changed when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link CommonService#convertVolumeUnit(BigDecimal, String, String)} is called.
     *
     * - G/W is acquired when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link W2009CmlDao#searchTwPltzItemPkgByDscId(W2009CmlCriteriaDomain)} is called.
     *
     * - Measurement is changed when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link CommonService#convertWeightUnit(BigDecimal, String, String)} is called.
     *
     * - A Palletize and a Palletize Instruction Item No are searched.
     *       criteria is made into an argument and {@link W2009CmlDao#searchTtPltzInstrItemNoTransPkg(W2009CmlCriteriaDomain)} is called.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2009CmlItemDomain}.
     *
     * - パレタイズ、計量原単位の検索
     *     criteriaを引数にして、{@link W2009CmlDao#searchTmMeasureUnit(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 遷移元が CML PKG Info Detail画面の場合、梱包組合せ原単位（ヘッダ）を検索する
     *     criteriaを引数にして、{@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、容積を変換する
     *     criteriaを引数にして、{@link CommonService#convertVolumeUnit(BigDecimal, String, String)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、G/Wを取得する
     *     criteriaを引数にして、{@link W2009CmlDao#searchTwPltzItemPkgByDscId(W2009CmlCriteriaDomain)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、計量を変換する
     *     criteriaを引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出す
     *
     * - パレタイズ、梱包指示品番を検索する
     *     criteriaを引数にして、{@link W2009CmlDao#searchTtPltzInstrItemNoTransPkg(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2009CmlItemDomain}のリストで返却
     * 
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @param callScreenID Transition-original-screen ID <br />遷移元画面ID
     * @return Search number <br />検索件数
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to <br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnTransReviseInit(W2009CmlCriteriaDomain criteria, String callScreenID) throws ApplicationException;

    /**
     * Perform retrieval processing of a CML Trans Revise screen
     * <br />CML Trans Revise画面の検索処理を行います。
     * <pre>
     * - Search of a Palletize and a measurement master
     *       criteria is made into an argument and {@link W2009CmlDao#searchTmMeasureUnit(W2009CmlCriteriaDomain)} is called.
     *
     * - When a changing agency is a CML PKG Info Detail screen, a PKG combination master (header) is searched.
     *       criteria is made into an argument and {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)} is called.
     *
     * - A VOLUME is changed when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link CommonService#convertVolumeUnit(BigDecimal, String, String)} is called.
     *
     * - G/W is acquired when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link W2009CmlDao#searchTwPltzItemPkgByDscId(W2009CmlCriteriaDomain)} is called.
     *
     * - Measurement is changed when a changing agency is a CML PKG Info Detail screen.
     *       criteria is made into an argument and {@link CommonService#convertWeightUnit(BigDecimal, String, String)} is called.
     *
     * - A Palletize and a Palletize Instruction Item No are searched.
     *       criteria is made into an argument and {@link W2009CmlDao#searchTtPltzInstrItemNo(W2009CmlCriteriaDomain)} is called.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2009CmlItemDomain}.
     *
     * - パレタイズ、計量原単位の検索
     *     criteriaを引数にして、{@link W2009CmlDao#searchTmMeasureUnit(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 遷移元が CML PKG Info Detail画面の場合、梱包組合せ原単位（ヘッダ）を検索する
     *     criteriaを引数にして、{@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、容積を変換する
     *     criteriaを引数にして、{@link CommonService#convertVolumeUnit(BigDecimal, String, String)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、G/Wを取得する
     *     criteriaを引数にして、{@link W2009CmlDao#searchTwPltzItemPkgByDscId(W2009CmlCriteriaDomain)}を呼出す
     *
     * - 遷移元が CML PKG Info Detail画面の場合、計量を変換する
     *     criteriaを引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出す
     *
     * - パレタイズ、梱包指示品番を検索する
     *     criteriaを引数にして、{@link W2009CmlDao#searchTtPltzInstrItemNo(W2009CmlCriteriaDomain)}を呼出す
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2009CmlItemDomain}のリストで返却
     * 
     * </pre>
     * @param criteria CML search-condition domain <br />検索条件ドメイン
     * @return Search number <br />検索件数
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public List<? extends W2009CmlItemDomain> searchForPagingOnTransReviseRegister(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Acquire a Palletize Item Package Work
     * <br />パレタイズ対象品PKGワークを取得する。
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param callScreenId The SCREEN ID of a changing agency <br />遷移元の画面ID
     * @return Search number <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchOnDetailInit(W2009CmlCriteriaDomain criteria, String callScreenId) throws ApplicationException;
    
    /**
     * Dipplay CML Register screen transit from CML Create screen (for registration) (Also transit from a CML Pkg Info Detail screen, it contains) 
     * <br />CML Register画面 CML Create画面から遷移してきた場合の初期表示情報取得(登録用)
     *       (CML Pkg Info Detail画面からの遷移の場合も含む)
     * <pre>
     * - Acquisition of a WEIGHT, a Unit of Vol., a WEIGHT, and the VOLUME notation
     *     - WEIGHT UNIT for a display
     *       - shipperCd is specified and {@link CommonService#searchWeightUnit(String)} is called to an argument.
     *
     *     - Unit of Vol. for a display
     *       - shipperCd is specified and {@link CommonService#searchVolumeUnit(String)} is called to an argument.
     *
     * - Acquire the information for registration from Palletize-Item work table.
     *     - {@link W2009CmlDao#searchTwPltzItemItemNo(W2009CmlCriteriaDomain)} is called.
     *
     * - Setting of a VOLUME
     *     - When the exterior sign is set up (outerCd !="")
     *       - It acquires from an exterior sign.
     *         The following condition items are set to {@link TmPkgSetDtlCriteriaDomain},
     *         {@link TmPkgSetDtlService#searchByKey(TmPkgSetDtlCriteriaDomain)} is called.
     *           Acquisition item
     *           - volumeUnit
     *           - volume
     *           Condition items
     *           - shipperCd
     *           - outerCd
     *
     *       - Converted of a unit and a VOLUME
     *           - When the Unit of Vol. for a display differs from the Unit of Vol. acquired above
     *             A Unit of Vol. is changed into the Unit of Vol. for a display, and the VALUE of a VOLUME is also changed according to the Unit of Vol. for a display.
     *
     *             "Common-specifications .xls functional-specification common:unit converted" An intermediary refers to it to a converted of a VOLUME.
     *
     *           {@link CommonService#convertVolumeUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *
     *     - And the exterior sign is not set up, when a lot crack is not carried out by a single palletize
     *     (outerCd = "" & pkgFormTyp = "S" & warningFlg = "N" 
     *       - It acquires from an ITEM NO.
     *         The following condition items are set to {@link W2009CmlCriteriaDomain},
     *         {@link W2009CmlDao#searchTmPkgSpecificationDtl(W2009CmlCriteriaDomain)} is called.
     *           Acquisition item
     *           - volumeUnit
     *           - volume
     *           Condition items
     *           - compCd
     *           - itemNo
     *           - pkgCd
     *           - trnsCd
     *
     *       - Converted of a unit and a VOLUME
     *           - When the Unit of Vol. for a display differs from the Unit of Vol. acquired above
     *             A Unit of Vol. is changed into the Unit of Vol. for a display, and the VALUE of a VOLUME is also changed according to the Unit of Vol. for a display.
     *
     *             "Common-specifications .xls functional-specification common:unit converted" An intermediary refers to it to a converted of a VOLUME.
     *
     *           {@link CommonService#convertVolumeUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *
     *     In -, the case of others
     *       - It does not set up.
     *
     * - A setting of N/W
     *     - N/W is computed from the contents of the elegance for a Palletize work.
     *     - {@link W2009CmlDao#searchTwPltzItemItemNoByDscId}
     *
     *     - WEIGHT UNIT for a display   When the acquired WEIGHT UNITs differ,
     *       A WEIGHT UNIT is changed into the WEIGHT UNIT for a display, and the VALUE of a WEIGHT is also changed according to the WEIGHT UNIT for a display.
     *
     *     {@link CommonService#convertWeightUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *
     * - A setting of G/W
     *     - G/W is acquired when Palletize Item Package Work is registered.
     *       {@link W2009CmlDao#searchTwPltzItemItemNoByDscId(W2009CmlCriteriaDomain)}
     *
     *     - WEIGHT UNIT for a display   When the acquired WEIGHT UNITs differ,
     *       A WEIGHT UNIT is changed into the WEIGHT UNIT for a display, and the VALUE of a WEIGHT is also changed according to the WEIGHT UNIT for a display.
     *
     *     {@link CommonService#convertWeightUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *
     * - The data for screen display is returned.
     *
     *
     * 
     * - 重量、容積単位、重量・容積表記の取得
     *   - 表示用重量単位
     *     - 引数に、shipperCd を指定して {@link CommonService#searchWeightUnit(String)}を呼出す。
     *     
     *   - 表示用容積単位
     *     - 引数に、shipperCd を指定して {@link CommonService#searchVolumeUnit(String)}を呼出す。
     * 
     * - パレタイズ対象品ワークテーブルから登録用の情報を取得する。
     *   - {@link W2009CmlDao#searchTwPltzItemItemNo(W2009CmlCriteriaDomain)} を呼出す。
     * 
     * - 容積の設定
     *   - 外装記号が設定されている場合（outerCd ≠ ""）
     *     - 外装記号から取得
     *       {@link TmPkgSetDtlCriteriaDomain}に、下記の条件項目を設定し、
     *       {@link TmPkgSetDtlService#searchByKey(TmPkgSetDtlCriteriaDomain)}を呼出す。
     *         取得項目
     *           - volumeUnit
     *           - volume
     *         条件項目
     *           - shipperCd
     *           - outerCd
     *     
     *     - 単位と容積の変換
     *         - 表示用容積単位が、上記で取得した容積単位と異なる場合は
     *           容積単位を表示用容積単位に変更し、容積の値も表示用容積単位に合わせて変換する。
     *           
     *           容積の変換につては、「共通仕様.xls 機能仕様共通：単位変換」参照
     *           
     *           {@link CommonService#convertVolumeUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *             
     *   - 外装記号が設定されていないかつ、単品パレタイズでロット割れしていない場合
     *     （outerCd = "" & pkgFormTyp = "S" & warningFlg = "N"）
     *     - 品目番号から取得
     *       {@link W2009CmlCriteriaDomain}に、下記の条件項目を設定し、
     *       {@link W2009CmlDao#searchTmPkgSpecificationDtl(W2009CmlCriteriaDomain)}を呼出す。
     *         取得項目
     *           - volumeUnit
     *           - volume
     *         条件項目
     *           - compCd
     *           - itemNo
     *           - pkgCd
     *           - trnsCd
     *           
     *     - 単位と容積の変換
     *         - 表示用容積単位が、上記で取得した容積単位と異なる場合は
     *           容積単位を表示用容積単位に変更し、容積の値も表示用容積単位に合わせて変換する。
     *           
     *           容積の変換につては、「共通仕様.xls 機能仕様共通：単位変換」参照
     *           
     *           {@link CommonService#convertVolumeUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *
     *   - その他の場合
     *     - 設定しない
     *     
     * - N/Wの設定
     *   - パレタイズワーク対象品の内容からN/Wを算出する
     *     - 
     *     - {@link W2009CmlDao#searchTwPltzItemItemNoByDscId}
     *     
     *   - 表示用重量単位 と 取得した重量単位が異なる場合は、
     *     重量単位を表示用重量単位に変更し、重量の値も表示用重量単位に合わせて変換する。
     *     
     *     {@link CommonService#convertWeightUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     *   
     * - G/Wの設定
     *   - パレタイズ対象品PKGワークが登録済みの場合にG/Wを取得する
     *     {@link W2009CmlDao#searchTwPltzItemItemNoByDscId(W2009CmlCriteriaDomain)}
     *     
     *   - 表示用重量単位 と 取得した重量単位が異なる場合は、
     *     重量単位を表示用重量単位に変更し、重量の値も表示用重量単位に合わせて変換する。
     *     
     *     {@link CommonService#convertWeightUnit(BigDecimal, String, String)}
     *             - value
     *             - fromUnitCd
     *             - toUnitCd
     * 
     * - 画面表示用のデータを返す
     * 
     * </pre>
     * @param criteria CML search-condition domain <br />CML検索条件ドメイン
     * @return CML domain <br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchOnRegisterInitByFromCreate(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Initial-display-information acquisition in the case of having changed from a CML Register screen CML Main screen (for a reference) 
     * <br />CML Register画面 CML Main画面から遷移してきた場合の初期表示情報取得(参照用)
     * <pre>
     * - The information for a reference is acquired from a Palletize table.
     *       criteria is made into an argument and this is a call about {@link W2009CmlDao#searchTtPltzByMainMarkMixTagNo(W2009CmlCriteriaDomain)}.
     *       The acquired information is returned.
     *
     * - パレタイズテーブルから参照用の情報を取得する。
     *     criteriaを引数にして、{@link W2009CmlDao#searchTtPltzByMainMarkMixTagNo(W2009CmlCriteriaDomain)}を呼出し
     *     取得した情報を返す。
     * 
     * </pre>
     * @param criteria CML search-condition domain <br />CML検索条件ドメイン
     * @return The information for screen display <br />画面表示用の情報
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchOnRegisterInitByFromMain(W2009CmlCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- Update system method update ----------------------------------------------
    // --------------------------------- 更新系メソッド update ----------------------------------------------
    
    // --------------------------------- Delete system method delete ----------------------------------------------
    // --------------------------------- 削除系メソッド delete ----------------------------------------------
    /**
     * Perform the hard delete of the elegance work for Palletize PKG
     * <br />パレタイズPKG対象品ワークの物理削除を行います。
     * <pre>
     * - Hard delete of the elegance work for Palletize PKG
     *       The following items of criteria are set to {@link TwPltzItemPkgCriteriaDomain},
     *       {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)} is called.
     *       - dscId/DSC-ID
     *
     * - パレタイズPKG対象品ワークの物理削除
     *     {@link TwPltzItemPkgCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}を呼出す
     *       - dscId/DSC-ID
     * </pre>
     *
     * @param dscId Login user ID<br />ログインユーザID
     * @throws ApplicationException When a delete of the elegance work for Palletize PKG cannot be performed <br />パレタイズPKG対象品ワークの削除ができない場合
     */
    public void deleteOnInit(String dscId) throws ApplicationException;
    
    /**
     * Perform the hard delete of a Palletize Item Work
     * <br />パレタイズ対象品ワークの物理削除を行います。
     * <pre>
     * - Hard delete of the elegance work for Palletize PKG
     *       The following items of criteria are set to {@link TwPltzItemItemNoCriteriaDomain},
     *       {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)} is called.
     *       - dscId/DSC-ID
     *
     * - パレタイズPKG対象品ワークの物理削除
     *     {@link TwPltzItemItemNoCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)}を呼出す
     *       - dscId/DSC-ID
     * </pre>
     *
     * @param dscId Login user ID <br />ログインユーザID
     * @throws ApplicationException When a delete of the elegance work for Palletize PKG cannot be performed <br />パレタイズPKG対象品ワークの削除ができない場合
     */
    public void deleteOnHeaderInit(String dscId) throws ApplicationException;
        
    /**
     * Delete the selected line
     * <br />選択された行の削除を行う。
     * <pre>
     * - Delete process
     *     - When Mix Tag Flg is "Y"
     *       - dsc_id, MIX_TAG_NO, and MIX_TAG_FLG are set to TwPltzItemItemNoCriteriaDomain.
     *         {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)} is called.
     *     - When Mix Tag Flg is "N"
     *       - dsc_id, PLTZ_ITEM_NO, PKG_CD, and MIX_TAG_FLG are set to TwPltzItemItemNoCriteriaDomain.
     *         {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)} is called.
     *
     * - 削除処理
     *   - Mix Tag Flg が "Y" の場合
     *     - TwPltzItemItemNoCriteriaDomain に dsc_id、MIX_TAG_NO、MIX_TAG_FLG を設定し
     *       {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)}を呼出す。
     *   - Mix Tag Flg が "N" の場合
     *     - TwPltzItemItemNoCriteriaDomain に dsc_id、PLTZ_ITEM_NO、PKG_CD、MIX_TAG_FLG を設定し
     *       {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)}を呼出す。
     *   
     * </pre>
     * @param criteria  Search-condition domain <br />検索条件ドメイン
     * @param w2012List Search-results list <br />検索結果一覧
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public void deleteOnRegisterDelete(W2009CmlCriteriaDomain criteria, List<? extends W2009CmlItemDomain> w2012List) throws ApplicationException;

    // --------------------------------- Transaction system method transact ----------------------------------------------
    // --------------------------------- トランザクション系メソッド transact ----------------------------------------------
    /**
     * Registration and the update process of a CML Create screen
     * <br />CML Create画面の登録・更新処理
     * <pre>
     * - Acquisition of a BRANCH
     *     The following items are set to {@link W2009CriteriaDomain},
     *     {@link W2009CmlDao#searchTwPltzItemItemNoByBrch(W2009CmlCriteriaDomain)} is called.
     *     - dscId/DSC-ID
     *
     * - In order, the following processings are performed to the record selected in the pictures.
     *
     *     - In the case of mixTagFlg ="N"& disableFlg =" N"
     *        - An ITEM NO is registered.
     *          The following items are set to {@link TwPltzInstrItemNoDomain} and a list is created.
     *          If all are set as a list,
     *          {@link TwPltzItemItemNoService#create(List)} is called.
     *          - "screen definition document_ECA0027_W2011_CML Create.xls processing No.6 4.2.2" Refer to a registration item.
     *           - dscId
     *           - brch
     *           - pltzItemNo
     *           - pkgCd
     *           - itemDescription
     *           - qty
     *           - instrQty
     *           - shippingLot
     *           - tagQty
     *           - pkgFormTyp
     *           - mixTagNo
     *           - mixTagFlg
     *           - netWeight
     *           - itemWeight
     *           - weightUnit
     *           - expLimitTyp
     *           - dngrItemFlg
     *           - originCntryCd
     *           - qtyUnit
     *           - itemTyp
     *           - currCd
     *           - plntCd
     *           - containerSortingKey
     *           - loadingCd
     *           - invoiceKey
     *           - containerLooseTyp
     *           - stgInstrItemFlg
     *           - customTimingTyp
     *
     *          - hiddenDisableFlg ="Y" of the list returned to a screen for the control at the time of a re-display is set to a screen.    (In order not to perform re retrieval after registration)
     *
     *     - In the case of mixTagFlg ="N"& disableFlg =" N"
     *        - An ITEM NO is updated.
     *          The following update items are set to {@link TwPltzInstrItemNoDomain} and a list is created.
     *          - "screen definition document_ECA0027_W2011_CML Create.xls processing No.6 4.3.1" Refer to an update item.
     *           - qty
     *           - tagQty
     *          The following update conditions are set to {@link TwPltzInstrItemNoCriteriaDomain} and a list is created.
     *          - "screen definition document_ECA0027_W2011_CML Create.xls processing No.6 4.3.1" Refer to update conditions.
     *           - dscId
     *           - pltzItemNo
     *           - pkgCd
     *           - mixTagNo
     *          If all are set as a list,
     *          {@link TwPltzItemItemNoService#updateByCondition(List, List)} is called.
     *
     *     - In the case of mixTagFlg ="N"& disableFlg =" N"
     *        - MIX tag is registered.    (Those with authority processing)
     *          - MIX ITEM NO is acquired.
     *             The following items are set to {@link W2009CmlCriteriaDomain}.
     *               - Search-condition item
     *                - mixTagNo
     *                  - Authority information acquired above
     *             {@link W2009CmlDao#searchTtMixtagItemNo(W2009CmlCriteriaDomain)} is called.
     *               - Acquisition item
     *                - mixTagNo
     *                - itemNo
     *                - pkgCd
     *                - itemDescription
     *                - qty
     *                - itemWeight
     *                - weightUnit
     *                - qtyUnit
     *                - expLimitTyp
     *                - dngrItemFlg
     *                - originCntryCd
     *                - plntCd
     *
     *          - MIX tag is registered.
     *             - "screen definition document_ECA0027_W2011_CML Create.xls processing No.6 4.4.3" Refer to a registration item.
     *                - dsc-Id
     *                - brch
     *                - pltzItemNo
     *                - pkgCd
     *                - itemDescription
     *                - qty
     *                - instrQty
     *                - shippingLot
     *                - tagQty
     *                - pkgFormTyp
     *                - mixTagNo
     *                - mixTagFlg
     *                - netWeight
     *                - itemWeight
     *                - weightUnit
     *                - expLimitTyp
     *                - dngrItemFlg
     *                - originCntryCd
     *                - qtyUnit
     *                - itemTyp
     *                - currCd
     *                - plntCd
     *                - containerSortingKey
     *                - loadingCd
     *                - invoiceKey
     *                - containerLooseTyp
     *                - stgInstrItemFlg
     *                - customTimingTyp
     *
     *          - hiddenDisableFlg ="Y" of the list returned to a screen for the control at the time of a re-display is set to a screen.    (In order not to perform re retrieval after registration)     *
     *     
     *     - In the case of mixTagFlg ="Y"& disableFlg =" Y"
     *        - No Action
     *
     *
     * - 枝番の取得
     *   {@link W2009CriteriaDomain}に以下の項目を設定し、
     *   {@link W2009CmlDao#searchTwPltzItemItemNoByBrch(W2009CmlCriteriaDomain)}を呼出す。
     *     - dscId/DSC-ID
     *     
     * - 画面で選択されたレコードに対して順番に、以下の処理を行う。
     * 
     *   - mixTagFlg = "N" & disableFlg = "N" の場合
     *      - 品目番号を登録する。
     *        {@link TwPltzInstrItemNoDomain}に以下の項目を設定しリストを作成。
     *        全てをリストに設定したら、
     *        {@link TwPltzItemItemNoService#create(List)} を呼出す。
     *        - 登録項目は「画面定義書_ECA0027_W2011_CML Create.xls 処理No.6 4.2.2」参照
     *           - dscId
     *           - brch
     *           - pltzItemNo
     *           - pkgCd
     *           - itemDescription
     *           - qty
     *           - instrQty
     *           - shippingLot
     *           - tagQty
     *           - pkgFormTyp
     *           - mixTagNo
     *           - mixTagFlg
     *           - netWeight
     *           - itemWeight
     *           - weightUnit
     *           - expLimitTyp
     *           - dngrItemFlg
     *           - originCntryCd
     *           - qtyUnit
     *           - itemTyp
     *           - currCd
     *           - plntCd
     *           - containerSortingKey
     *           - loadingCd
     *           - invoiceKey
     *           - containerLooseTyp
     *           - stgInstrItemFlg
     *           - customTimingTyp
     *        
     *        - 画面に再表示時の制御の為に、画面に戻すリストの hiddenDisableFlg = "Y" を設定する。(登録後、再検索は行わない為)
     *        
     *   - mixTagFlg = "N" & disableFlg = "N" の場合
     *      - 品目番号を更新する。
     *        {@link TwPltzInstrItemNoDomain}に以下の更新項目を設定しリストを作成。
     *        - 更新項目は「画面定義書_ECA0027_W2011_CML Create.xls 処理No.6 4.3.1」参照
     *           - qty
     *           - tagQty
     *        {@link TwPltzInstrItemNoCriteriaDomain}に以下の更新条件を設定しリストを作成。
     *        - 更新条件は「画面定義書_ECA0027_W2011_CML Create.xls 処理No.6 4.3.1」参照
     *           - dscId
     *           - pltzItemNo
     *           - pkgCd
     *           - mixTagNo
     *        全てをリストに設定したら、
     *        {@link TwPltzItemItemNoService#updateByCondition(List, List)}を呼出す。
     *  
     *   - mixTagFlg = "N" & disableFlg = "N" の場合
     *      - MIXタグを登録する。(権限処理あり)
     *        - MIX品目番号を取得する。
     *           {@link W2009CmlCriteriaDomain}に以下の項目を設定して
     *             - 検索条件項目
     *                - mixTagNo
     *                - 上記で取得した権限情報
     *           {@link W2009CmlDao#searchTtMixtagItemNo(W2009CmlCriteriaDomain)}を呼出す。
     *             - 取得項目
     *                - mixTagNo
     *                - itemNo
     *                - pkgCd
     *                - itemDescription
     *                - qty
     *                - itemWeight
     *                - weightUnit
     *                - qtyUnit
     *                - expLimitTyp
     *                - dngrItemFlg
     *                - originCntryCd
     *                - plntCd
     *
     *        - MIXタグを登録する。
     *           - 登録項目は「画面定義書_ECA0027_W2011_CML Create.xls 処理No.6 4.4.3」参照
     *                - dsc-Id
     *                - brch
     *                - pltzItemNo
     *                - pkgCd
     *                - itemDescription
     *                - qty
     *                - instrQty
     *                - shippingLot
     *                - tagQty
     *                - pkgFormTyp
     *                - mixTagNo
     *                - mixTagFlg
     *                - netWeight
     *                - itemWeight
     *                - weightUnit
     *                - expLimitTyp
     *                - dngrItemFlg
     *                - originCntryCd
     *                - qtyUnit
     *                - itemTyp
     *                - currCd
     *                - plntCd
     *                - containerSortingKey
     *                - loadingCd
     *                - invoiceKey
     *                - containerLooseTyp
     *                - stgInstrItemFlg
     *                - customTimingTyp
     *
     *        - 画面に再表示時の制御の為に、画面に戻すリストの hiddenDisableFlg = "Y" を設定する。(登録後、再検索は行わない為)
     *
     *   - mixTagFlg = "Y" & disableFlg = "Y" の場合
     *      - 処理なし
     *      
     * </pre>
     *
     * @param criteria CML search-condition domain <br />CML検索条件ドメイン
     * @param w2011List The list of domains for a screen re-display <br />画面再表示用のドメインのリスト
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public void transactOnCreateUpdate(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> w2011List) throws ApplicationException;
    
    /**
     * Delete a Palletize Item Package Work on condition of login DSC-ID, and BRCH
     * <br />ログインDSC-IDとBRCHを条件に、パレタイズ対象品PKGワークを削除する。
     *
     * @param criteria  W2009CmlCriteriaDomain<br />W2009CmlCriteriaDomain
     * @param brchList  The list of Brch<br />Brchのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnDetailDelete(W2009CmlCriteriaDomain criteria, List<String> brchList) throws ApplicationException;

    /**
     * SaveMoveTo processing of a CML PKG Detail screen
     * <br />CML PKG Detail画面のSaveMoveTo処理。
     * <pre>
     *   - Delete process of Palletize Item Package Work
     *   - Registration of packing specification data
     *   - Registration of an additional Packing material
     *
     *   - パレタイズ対象品PKGワークの削除処理
     *   - 包装仕様データの登録
     *   - 追加包装材の登録
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param domainList The list of W2009CmlItemDomain <br />W2009CmlItemDomainのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnDetailSaveMoveTo(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> domainList) throws ApplicationException;

    /**
     * Register processing of CML Trans Revise screen
     * <br />CML Trans Revise画面のRegister処理.
     * 
     * <pre>
     *   - Update process of Palletize data
     *   - Update of a Palletize table
     *   - Update of Palletize-Item data (Packing material) (a delete, registration)  
     *   - Delete of Palletize Item Package Work
     *
     *   - パレタイズデータの更新処理
     *   - パレタイズテーブルの更新
     *   - パレタイズ対象品データ（包装材）の更新（削除、登録）
     *   - パレタイズ対象品PKGワークの削除
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param errorMessages The list of error messages<br />エラーメッセージのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnTransReviseRegister(W2009CmlCriteriaDomain criteria, List<MessageDomain> errorMessages) throws ApplicationException;

    /**
     * Register processing of a CML Register screen
     * <br />CML Register画面のRegister処理。
     * <pre>
     * - 3. Acquisition of work information
     *     - 3.1. Acquisition of Palletize Item Work
     *         {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)}
     *     - 3.2. Acquisition of Palletize Item Package Work
     *         {@link TwPltzItemPkgService#searchByCondition(TwPltzItemPkgCriteriaDomain)}
     *
     * - 4. Acquisition of MainMark
     *       "D"+ OWNER-COMPANY CD + {W/H, NEXUS W/H} + Date
     *       {@link CommonService#transactSequence(String, String, int, String)}
     *
     * - 5. firm-order-receipt mortgage processing
     *     - 5.1. Mortgage of firm order receipt
     *       - A part for the number of cases of cmlItemDomainList of {@link W2009CmlItemDomain} and the following are repeated.
     *
     *       - Export-Receive-Order data is acquired (lock lump).
     *           The following items of cml are set to {@link TtExpRcvOdrCriteriaDomain}.
     *             - shipperCd / Shipper CD
     *             - customerCd / CUSTOMER CODE
     *             - lgcyShipTo / LEGACY SHIP TO
     *             - trnsCd / TRANSPORT CODE
     *           - dscId/DSC-ID
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - odrFirmFlg / ORDER FIRM FLAG
     *             - shippedTyp / SHIPPED TYPE
     *
     *           It sorts in following order.
     *             - ETD DUE DATE / ETD DUE DATE (ascending order)
     *             - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *             - ORDER CONTROL NO / ORDER CONTROL NO (ascending order)
     *
     *           {@link TtExpRcvOdrCriteriaDomain} is made into an argument,
     *           This is a call about {@link W2009CmlDao#lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain)}.
     *
     *          - An Alloc QTY is most drawn and updated from the past data.
     *           - The following is set to {@link TtExpRcvOdrDomain}.
     *           - Alloc QTY (Alloc-QTY +Min (InstrActQty, Shipment-remaining QUANTITY) is set up)
     *           - SHIPPED TYPE (ORDER QUANTITY = = 2 is set up only when it becomes an Alloc QTY)
     *           - The following is set to {@link TtExpRcvOdrCriteriaDomain},
     *               {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)} is called.
     *           - Key item of the acquired Export Receive Order
     *
     *        * An error is made when the alloc for InstrActQty is not made.
     *
     * - 6. Palletize-Instruction-Receive-Order alloc
     *     - 6.1. Palletize-Instruction-Receive-Order alloc
     *       A search condition and a sort order are set to {@link TtPltzInstrOdrCriteriaDomain}.
     *       {@link W2009CmlDao#lockTtPltzInstrOrd(TtPltzInstrOdrCriteriaDomain)} is called.
     *
     *       - An Alloc QTY is most drawn and updated from the past data.
     *         - The following is set to {@link TtExpRcvOdrDomain}.
     *           - Packed up number      :   Calculated value
     *           - Packed up classification    :   "Y"
     *           - The following is set to {@link TtPltzInstrOdrCriteriaDomain}
     *              {@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)} is called.
     *           - Key item of the acquired Export Receive Order
     *
     *        * An error is made when the alloc for InstrActQty is not made.
     *
     *
     *     - 6.2. Registration of Palletize Item Receive Order
     *       The drawn Palletize-Instruction-Item-No information is registered into a Palletize Item Receive Order.
     *       {@link TtPltzItemOdrService#create(List)}
     *
     * - 7. Registration of Palletize-Item order number
     *     The following processings are performed to all the records of MixTagFlg ="Y" in the record acquired by 3.1.
     *     - 7.1. Acquisition of Mix Tag Receive Order
     *         {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)}
     *     - 7.3. Registration of Palletize Item Receive Order
     *         {@link TtPltzItemOdrService#create(List)}
     *
     * - 8. Palletize data is registered.
     *     - 8.1. The unit of WEIGHT, a VOLUME, and length is acquired.
     *     {@link CommonService#searchVolumeUnit(String)}
     *     {@link CommonService#searchWeightUnit(String)}
     *     {@link CommonService#searchLengthUnit(String)}
     *
     *     - 8.2. Acquisition of palette No
     *     {@link W2009CmlDao#searchTtPltzByPalletNo(W2009CmlCriteriaDomain)}
     *
     *     - 8.3. Acquisition of DUE DATE
     *     {@link W2009CmlDao#searchTtPltzItemOdrByPalletNo(W2009CmlCriteriaDomain)}
     *
     *     - 8.4. registration processing (Palletize)  
     *     {@link TtPltzService#create(TtPltzDomain)}
     *
     * -  9. Registration of Palletize-Item data
     *     - 9.1. Registration of ITEM NO
     *     - 9.2. Registration of Packing material
     *   - {@link TtPltzItemService#create(List)}
     *
     * - 10. Packaging Instruction (=Pull) update process
     *     - 10.1. Update of the QUANTITY packed up
     *     {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}
     *     {@link TtPltzInstrItemNoService#update(List)}
     *     - 10.2. Update of PALLETIZE INSTRUCTION STATUS
     *     {@link W2009CmlDao#updateTtPltzInstrStatusByPltzInstrNo(W2009CmlCriteriaDomain)}
     *
     * - 11.MIXED thing information update processing
     *     - Update of 11.1. multi-ITEM-NO-in-box Status
     *     {@link TtMixtagService#update(List)}
     *
     * - 12. Temp Stock is updated and registered.
     *     - 12.1. Acquisition of Temp Stock
     *       - 12.2.2. Judgment of registration update processing of Temp Stock
     *         {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}
     *
     *       - 12.2.3. Update process of Temp Stock
     *         When data is able to be acquired by 12.2.2
     *         {@link TtTmpStockService#update(TtTmpStockDomain)}
     *
     *       - 12.2.4. Registration processing of Temp Stock
     *         When data is not able to be acquired by 12.2.2
     *         {@link TtTmpStockService#create(TtTmpStockDomain)}
     *
     *     - 13.2. This is registration of a link KANBAN information to MIXTAG.
     *       Acquisition of - information
     *       {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)}
     *       Registration of - Palletize Item KANBAN
     *      {@link TtPltzKanbanService#create(List)}
     *
     * - 14. Delete of work information
     *     - 14.1. Palletize-Item-Work delete
     *       {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)}
     *     - 14.2. Palletize-Item-Package-Work delete
     *       {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     *
     * - 15. Registration of ordering mortgage track record
     *     - 15.1. Call of WEB service
     *       {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}
     *
     *
     *
     * - 3.ワーク情報の取得
     *   - 3.1.パレタイズ対象品ワークの取得
     *     {@link TwPltzItemItemNoService#searchByCondition(TwPltzItemItemNoCriteriaDomain)}
     *   - 3.2.パレタイズ対象品PKGワークの取得
     *     {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     *   
     * - 4.MainMarkの取得
     *     "D" + 責任会社コード + {W/H,NEXUS W/H} + 年月日
     *     {@link CommonService#transactSequence(String, String, int, String)}
     * 
     * - 5.確定受注引き当て処理
     *   - 5.1.確定受注の引き当て
     *     - {@link W2009CmlItemDomain}のcmlItemDomainListの件数分、以下を繰り返す
     *     
     *     - 輸出受注データを取得(ロック込み)
     *         {@link TtExpRcvOdrCriteriaDomain}にcmlの以下の項目を設定
     *           - shipperCd/荷主コード
     *           - customerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先
     *           - trnsCd/輸送手段コード
     *           - dscId/DSC-ID
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - odrFirmFlg/受注確定フラグ
     *           - shippedTyp/出荷済み区分
     *       
     *         下記の順にソート
     *           - ETD DUE DATE/船積期限 (昇順)
     *           - CUSTOMER PO NO/得意先PO NO (昇順)
     *           - ORDER CONTROL NO/オーダーコントロールNO (昇順)
     *       
     *         {@link TtExpRcvOdrCriteriaDomain}を引数にして、
     *         {@link W2009CmlDao#lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain)}を呼出
     *       
     *     - 一番過去のデータより梱包引当数量を引き当て更新する。
     *       - {@link TtExpRcvOdrDomain}に以下を設定をする
     *         - 梱包引当数量 (梱包引当数量 + Min(InstrActQty, 出荷残数量)を設定)
     *         - 出荷済み区分 (注文数量 == 梱包引当数量となった場合のみ、2を設定)
     *       - {@link TtExpRcvOdrCriteriaDomain}に以下を設定し、{@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出す
     *         - 取得した輸出受注のキー項目
     *     
     *      ※InstrActQty分の引当ができなかった場合はエラー
     * 
     * - 6.梱包指示品目番号受注情報引当
     *   - 6.1.梱包指示品目番号受注情報引当
     *     {@link TtPltzInstrOdrCriteriaDomain} に検索条件、ソート順を設定し
     *     {@link W2009CmlDao#lockTtPltzInstrOrd(TtPltzInstrOdrCriteriaDomain)}を呼出す。
     *     
     *     - 一番過去のデータより梱包引当数量を引き当て更新する。
     *       - {@link TtExpRcvOdrDomain}に以下を設定をする
     *         - 梱包済み数    : 計算値
     *         - 梱包済み区分  : "Y"
     *       - {@link TtPltzInstrOdrCriteriaDomain}に以下を設定し、{@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)}を呼出す
     *         - 取得した輸出受注のキー項目
     *     
     *      ※InstrActQty分の引当ができなかった場合はエラー
     *     
     *     
     *   - 6.2.パレタイズ対象品受注情報の登録
     *     引き当てた梱包指示品目番号情報をパレタイズ対象品受注情報に登録する。
     *     {@link TtPltzItemOdrService#create(List)}
     *     
     * - 7.パレタイズ対象品受注番号の登録
     *   3.1で取得したレコードの中で MixTagFlg = "Y" の全てのレコードに対して以下の処理を行う
     *   - 7.1.MIXED品目番号受注情報の取得
     *     {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)} を呼び出す。
     *   - 7.3.パレタイズ対象品受注情報の登録
     *     {@link TtPltzItemOdrService#create(List)}
     * 
     * - 8.パレタイズデータを登録
     *   - 8.1.重量・容積・長さの単位を取得
     *     {@link CommonService#searchVolumeUnit(String)}
     *     {@link CommonService#searchWeightUnit(String)}
     *     {@link CommonService#searchLengthUnit(String)}
     *     
     *   - 8.2.パレットNoの取得
     *     {@link W2009CmlDao#searchTtPltzByPalletNo(W2009CmlCriteriaDomain)}
     *     
     *   - 8.3.納期の取得
     *     {@link W2009CmlDao#searchTtPltzItemOdrByPalletNo(W2009CmlCriteriaDomain)}
     *     
     *   - 8.4.登録処理(パレタイズ)
     *     {@link TtPltzService#create(TtPltzDomain)}
     * 
     * - 9.パレタイズ対象品データの登録
     *   - 9.1.品目番号の登録
     *   - 9.2.包装材の登録
     *   - {@link TtPltzItemService#create(List)}
     *   
     * - 10.梱包指示更新処理
     *   - 10.1.梱包済み数量更新
     *     {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}
     *     {@link TtPltzInstrItemNoService#update(List)}
     *   - 10.2.梱包指示ステータス更新
     *     {@link W2009CmlDao#updateTtPltzInstrStatusByPltzInstrNo(W2009CmlCriteriaDomain)}
     * 
     * - 11.MIXED現品情報更新処理
     *   - 11.1.小箱内他品番ステータス更新
     *     {@link TtMixtagService#update(List)}
     * 
     * - 12.仮在庫を更新・登録する
     *   - 12.1.仮在庫の取得
     *     - 12.2.2.仮在庫の登録更新処理の判定
     *       {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}
     *       
     *     - 12.2.3.仮在庫の更新処理
     *       12.2.2 でデータが取得できた場合
     *       {@link TtTmpStockService#update(TtTmpStockDomain)}
     *       
     *     - 12.2.4.仮在庫の登録処理
     *       12.2.2 でデータが取得できなかった場合
     *       {@link TtTmpStockService#create(TtTmpStockDomain)}
     * 
     *   - 13.2.MIXTAGに紐づくかんばん情報の登録
     *     -情報の取得
     *      {@link TtMixKanbanService#searchByCondition(TtMixKanbanCriteriaDomain)}
     *     -パレタイズ対象品かんばん情報の登録
     *      {@link TtPltzKanbanService#create(List)}
     * 
     * - 14.ワーク情報の削除
     *   - 14.1.パレタイズ対象品ワーク削除
     *     {@link TwPltzItemItemNoService#deleteByCondition(TwPltzItemItemNoCriteriaDomain)}
     *   - 14.2.パレタイズ対象品PKGワーク削除
     *     {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     *   
     * - 15.受注引き当て実績の登録
     *   - 15.1.WEBサービスのコール
     *     {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param w2012List Search-results list<br />検索結果一覧
     * @param errorMessages The list of error messages<br />エラーメッセージのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnRegister(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> w2012List, List<MessageDomain> errorMessages) throws ApplicationException;
    
    /**
     * Cancel processing of a CML Register screen
     * <br />CML Register画面のCancel処理。
     * <pre>
     * - 3. Cancellation of ordering alloc
     *   - 3.1. A target is acquired from Palletize Item Receive Order.
     *     {@link W2009CmlDao#searchTtPltzItemOdr(W2009CmlCriteriaDomain)}
     *   - 3.2. The number of orders received is returned.
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}
     *     {@link TtExpRcvOdrService#update(TtExpRcvOdrDomain)}
     * 
     * - 4. Palletize-Instruction-Item-No ordering alloc cancellation
     *   - 4.1. A target is acquired from Palletize Item Receive Order.
     *     {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}
     *   - 4.2. The number packed up is returned.
     *     {@link TtPltzInstrOdrService#lockByKeyNoWait(TtPltzInstrOdrCriteriaDomain)}
     *     {@link TtPltzInstrOdrService#update(TtPltzInstrOdrDomain)}
     * 
     * - 5. Acquisition of Palletize Item
     *     {@link TtPltzInstrService#searchByCondition(TtPltzInstrCriteriaDomain)}
     * 
     * - 6. Update of PACKED QUANTITY
     *     {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}
     *     {@link TtPltzInstrItemNoService#update(TtPltzInstrItemNoDomain)}
     *     {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}
     * 
     * - 7. Update of PALLETIZE INSTRUCTION STATUS
     *     {@link W2009CmlDao#searchTtPltzInstrItemNoByPltzInstrNo(W2009CmlCriteriaDomain)}
     *     {@link TtPltzInstrService#update(TtPltzInstrDomain)}
     * 
     * - 8. Update of 8. Multiple Item No. in 1Box PKG number Status
     *     {@link TtMixtagService#lockByKeyNoWait(TtMixtagCriteriaDomain)}
     *     {@link TtMixtagService#update(TtMixtagDomain)}
     * 
     * - 9. Update of Temp Stock
     *     {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}
     *     {@link TtTmpStockService#update(List)}
     * 
     * - 10. Delete of data
     *     - 10.1. Palletize delete
     *       {@link TtPltzService#delete(TtPltzCriteriaDomain)}
     *     - 10.2. Palletize-Item delete
     *       {@link TtPltzItemService#deleteByCondition(TtPltzItemCriteriaDomain)}
     *     - 10.3. Delete of Palletize Item Receive Order
     *       {@link TtPltzItemOdrService#deleteByCondition(TtPltzItemOdrCriteriaDomain)}
     *     - 10.4. Delete of Palletize Item KANBAN
     *       {@link TtPltzKanbanService#deleteByCondition(TtPltzKanbanCriteriaDomain)}
     *       
     * - 11.Registration of a  ordering alloc track record (starting of Web service)
     *     {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}
     * 
     * 
     * - 3.受注引当のキャンセル
     *   - 3.1.パレタイズ対象品受注情報から対象を取得
     *     {@link W2009CmlDao#searchTtPltzItemOdr(W2009CmlCriteriaDomain)}
     *   - 3.2.受注数を戻す
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}
     *     {@link TtExpRcvOdrService#update(TtExpRcvOdrDomain)}
     *     
     * - 4.梱包指示品目番号受注引当キャンセル
     *   - 4.1.パレタイズ対象品受注情報から対象を取得
     *     {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}
     *   - 4.2.梱包済数を戻す
     *     {@link TtPltzInstrOdrService#lockByKeyNoWait(TtPltzInstrOdrCriteriaDomain)}
     *     {@link TtPltzInstrOdrService#update(TtPltzInstrOdrDomain)}
     *     
     * - 5.パレタイズ対象品の取得
     *     {@link TtPltzInstrService#searchByCondition(TtPltzInstrCriteriaDomain)}
     *     
     * - 6.梱包済数量の更新
     *     {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}
     *     {@link TtPltzInstrItemNoService#update(TtPltzInstrItemNoDomain)}
     *     {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}
     *     
     * - 7.梱包指示ステータスの更新
     *     {@link W2009CmlDao#searchTtPltzInstrItemNoByPltzInstrNo(W2009CmlCriteriaDomain)}
     *     {@link TtPltzInstrService#update(TtPltzInstrDomain)}
     *     
     * - 8.小箱内多品番ステータスの更新
     *     {@link TtMixtagService#lockByKeyNoWait(TtMixtagCriteriaDomain)}
     *     {@link TtMixtagService#update(TtMixtagDomain)}
     *     
     * - 9.仮在庫の更新
     *     {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}
     *     {@link TtTmpStockService#update(List)}
     *     
     * - 10.データの削除
     *   - 10.1.パレタイズ削除
     *     {@link TtPltzService#delete(TtPltzCriteriaDomain)}
     *   - 10.2.パレタイズ対象品削除
     *     {@link TtPltzItemService#deleteByCondition(TtPltzItemCriteriaDomain)}
     *   - 10.3.パレタイズ対象品受注情報の削除
     *     {@link TtPltzItemOdrService#deleteByCondition(TtPltzItemOdrCriteriaDomain)}
     *   - 10.4.パレタイズ対象品かんばん情報の削除
     *     {@link TtPltzKanbanService#deleteByCondition(TtPltzKanbanCriteriaDomain)}
     *     
     * -11.受注引当実績の登録(Webサービスの起動)
     *     {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnRegisterCancel(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Registration processing of a Palletize Item Package Work
     * <br />パレタイズ対象品PKGワークの登録処理。
     * <pre>
     * - processing mode carries out, only when 1 and Packing Confirmed Flg are "N."
     *
     *    - The information on a work table is deleted.
     *      {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     *
     * - 3.1. Distribution of processing
     *    - When single-palletize lot crack has not occurred
     *        When the data of PKG Form Type = "S" and hidden Warning Flg =" Y" does not exist
     *        - 3.2. Palletize Item Package Work is registered (registration by an ITEM NO).
     *          - 3.2.1.Acquisition of  packing specification
     *          - 3.2.4. packing specification's existence check
     *              An error is made when the information on an ITEM NO cannot be acquired (MSGID:NXS-E7-0126 argument: MixTagNo).
     *              In an error, the background color of the ITEM NO of an applicable ITEM NO (selected ITEM NO) is displayed in red.
     *              {@link W2009CmlDao#searchTmPkgSpecificationDtlByAuto(W2009CmlCriteriaDomain)}
     *          - 3.2.6. Calculation of Packing-material USE QUANTITY
     *              Packing-material USE-QUANTITY = (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) * Joint packing specification .QTY
     *              Below the decimal point of * (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) is upvaluation.
     *          - 3.2.6. Total ofPacking-material USE QUANTITY
     *          - 3.2.7. Contents of registration are added to a list.
     *
     *      - When that is not right
     *        - 3.3. Palletize Item Package Work is registered (registration with an ITEM NO and an exterior sign).
     *          - 3.3.1. This is registration of a link Packing material to ITEM NO.
     *            - 3.3.1.1. Acquisition of packing specification
     *            - 3.3.1.4. packing specification's existence check
     *              An error is made when the information on an ITEM NO cannot be acquired (MSGID:NXS-E7-0126 argument: MixTagNo).
     *              In an error, the background color of the ITEM NO of an applicable ITEM NO (selected ITEM NO) is displayed in red.
     *              {@link W2009CmlDao#searchTmPkgSpecificationDtlByInner(W2009CmlCriteriaDomain)}
     *
     *          - 3.3.2. This is registration of a link Packing material to a MIX tag.
     *            - 3.3.2.1. Acquisition of information
     *               {@link W2009CmlDao#searchTtMixtagRt(W2009CmlCriteriaDomain)}
     *            - 3.3.2.3. Contents of registration are added to a list.
     *
     *          - 3.3.3. This is registration of a link Packing material to exterior sign.
     *            - 3.3.3.1. Acquisition of information
     *            - 3.3.3.2. Check of  acquisition number
     *                In the case of zero affair, an error is made (MSGID:NXS-E 7-0147).  
     *                In an error, the background color of Outer CD is displayed in red.
     *                {@link W2009CmlDao#searchCountTmPkgSetDtl(W2009CmlCriteriaDomain)}
     *                {@link W2009CmlDao#searchTmPkgSetDtl(W2009CmlCriteriaDomain)}
     *            - 3.3.2.4. Contents of registration are added to a list.
     *
     *       - An information is registered into a work table.
     *         {@link TwPltzItemPkgService#create(List)}
     *
     *
     *
     * - 処理モードが1 かつ Packing Confirmed Flg が "N" の場合のみ実施
     * 
     *  - ワークテーブルの情報を削除
     *    {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     * 
     * - 3.1.処理の振り分け
     *    - 単品パレタイズロット割れが発生していない場合
     *      PKG Form Type = "S" かつ hidden Warning Flg = "Y" のデータが存在しない場合
     *      - 3.2.パレタイズ対象品PKGワークの登録(品目番号による登録)を実施
     *        - 3.2.1.包装仕様の取得
     *        - 3.2.4.包装仕様の存在チェック
     *          品目番号の情報が取得できない場合は、エラー(MSGID:NXS-E7-0126 引数：MixTagNo)
     *          エラーの場合は、該当品目番号(選択した品目番号)の品目番号の背景色を赤色で表示
     *            {@link W2009CmlDao#searchTmPkgSpecificationDtlByAuto(W2009CmlCriteriaDomain)}
     *        - 3.2.6.包装材使用数の算出
     *          包装材使用数 = (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE) * 結合包装仕様.QTY
     *          ※ (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE)の小数点以下は切り上げ
     *        - 3.2.6.包装材使用数の合算
     *        - 3.2.7.登録内容をリストに追加
     *        
     *    - そうでない場合   
     *      - 3.3.パレタイズ対象品PKGワークの登録(品目番号・外装記号による登録)を実施
     *        - 3.3.1.品目番号に紐づく包装材の登録
     *          - 3.3.1.1.包装仕様の取得
     *          - 3.3.1.4.包装仕様の存在チェック
     *            品目番号の情報が取得できない場合は、エラー(MSGID:NXS-E7-0126 引数：MixTagNo)
     *            エラーの場合は、該当品目番号(選択した品目番号)の品目番号の背景色を赤色で表示
     *              {@link W2009CmlDao#searchTmPkgSpecificationDtlByInner(W2009CmlCriteriaDomain)}
     *              
     *        - 3.3.2.MIXタグに紐づく包装材の登録
     *          - 3.3.2.1.情報の取得
     *            {@link W2009CmlDao#searchTtMixtagRt(W2009CmlCriteriaDomain)}
     *          - 3.3.2.3.登録内容をリストに追加
     *        
     *        - 3.3.3.外装記号に紐づく包装材の登録
     *          - 3.3.3.1.情報の取得
     *          - 3.3.3.2.取得件数のチェック
     *            0件の場合は、エラー(MSGID:NXS-E7-0147)
     *            エラーの場合は、Outer CD の背景色を赤色で表示
     *            {@link W2009CmlDao#searchCountTmPkgSetDtl(W2009CmlCriteriaDomain)}
     *            {@link W2009CmlDao#searchTmPkgSetDtl(W2009CmlCriteriaDomain)}
     *          - 3.3.2.4.登録内容をリストに追加
     * 
     *     - ワークテーブルに情報を登録
     *       {@link TwPltzItemPkgService#create(List)}
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param listDoamin Search-results list<br />検索結果一覧
     * @param errMessages Error message list<br />エラーメッセージリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnRegisterPkgMaterials(W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> listDoamin, List<MessageDomain> errMessages) throws ApplicationException;
    
    /**
     * Registration processing of a Palletize Item Package Work
     * <br />パレタイズ対象品PKGワークの登録処理。
     * <pre>
     *    - The information on a work table is deleted.
     *    {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     *
     * - 3.1. Distribution of processing
     *      - When Change Outer CD is ""
     *        - 3.2. Palletize Item Package Work is registered (registration of an initial data).
     *          - 3.2.1. Acquisition of Palletize-Item data
     *          - 3.2.4. packing specification's existence check
     *            An error is made when the information on an ITEM NO cannot be acquired (MSGID:NXS-E7-0126 argument: MixTagNo).  
     *            In an error, the background color of the ITEM NO of an applicable ITEM NO (selected ITEM NO) is displayed in red.
     *            {@link W2009CmlDao#searchTmPkgSpecificationDtlByAuto(W2009CmlCriteriaDomain)}
     *          - 3.2.6. Calculation of Packing-material USE QUANTITY
     *            Packing-material USE-QUANTITY = (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) * Joint packing specification .QTY
     *            Below the decimal point of * (Palletize-Item-Work .QTY/joint packing specification .LOT_SIZE) is upvaluation.
     *          - 3.2.6. Total of Packing-material USE QUANTITY
     *          - 3.2.7. Contents of registration are added to a list.
     *
     *      - When that is not right
     *        - 3.3. Palletize Item Package Work is registered (registration of exterior sign alteration data).
     *          - 3.3.1. Registration of Dunnage
     *            - 3.3.1.1. Acquisition of Palletize-Item data
     *            - 3.3.1.4. packing specification's existence check
     *              An error is made when the information on an ITEM NO cannot be acquired (MSGID:NXS-E7-0126 argument: MixTagNo).
     *              In an error, the background color of the ITEM NO of an applicable ITEM NO (selected ITEM NO) is displayed in red.
     *              {@link W2009CmlDao#searchTmPkgSpecificationDtlByInner(W2009CmlCriteriaDomain)}
     *
     *          - 3.3.2. Registration of imported wood
     *            - 3.3.2.1. Acquisition of information
     *              {@link W2009CmlDao#searchTtMixtagRt(W2009CmlCriteriaDomain)}
     *            - 3.3.2.3. Contents of registration are added to a list.
     *
     *       - An information is registered into a work table.
     *     {@link TwPltzItemPkgService#create(List)}
     *
     *  - ワークテーブルの情報を削除
     *    {@link TwPltzItemPkgService#deleteByCondition(TwPltzItemPkgCriteriaDomain)}
     * 
     * - 3.1.処理の振り分け
     *    - Change Outer CDが""の場合
     *      - 3.2.パレタイズ対象品PKGワークの登録(初期データの登録)を実施
     *        - 3.2.1.パレタイズ対象品データの取得
     *        - 3.2.4.包装仕様の存在チェック
     *          品目番号の情報が取得できない場合は、エラー(MSGID:NXS-E7-0126 引数：MixTagNo)
     *          エラーの場合は、該当品目番号(選択した品目番号)の品目番号の背景色を赤色で表示
     *            {@link W2009CmlDao#searchTmPkgSpecificationDtlByAuto(W2009CmlCriteriaDomain)}
     *        - 3.2.6.包装材使用数の算出
     *          包装材使用数 = (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE) * 結合包装仕様.QTY
     *          ※ (パレタイズ対象品ワーク.QTY/結合包装仕様.LOT_SIZE)の小数点以下は切り上げ
     *        - 3.2.6.包装材使用数の合算
     *        - 3.2.7.登録内容をリストに追加
     *        
     *    - そうでない場合   
     *      - 3.3.パレタイズ対象品PKGワークの登録(外装記号変更データの登録)を実施
     *        - 3.3.1.内材の登録
     *          - 3.3.1.1.パレタイズ対象品データの取得
     *          - 3.3.1.4.包装仕様の存在チェック
     *            品目番号の情報が取得できない場合は、エラー(MSGID:NXS-E7-0126 引数：MixTagNo)
     *            エラーの場合は、該当品目番号(選択した品目番号)の品目番号の背景色を赤色で表示
     *              {@link W2009CmlDao#searchTmPkgSpecificationDtlByInner(W2009CmlCriteriaDomain)}
     *              
     *        - 3.3.2.外材の登録
     *          - 3.3.2.1.情報の取得
     *            {@link W2009CmlDao#searchTtMixtagRt(W2009CmlCriteriaDomain)}
     *          - 3.3.2.3.登録内容をリストに追加
     * 
     *     - ワークテーブルに情報を登録
     *     {@link TwPltzItemPkgService#create(List)}
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param errMessages Error message list<br />エラーメッセージリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public void transactOnTransRevisePkgMaterials(W2009CmlCriteriaDomain criteria, List<MessageDomain> errMessages) throws ApplicationException;

     // --------------------------------- Print system method  ----------------------------------------------
     // --------------------------------- プリント系メソッド  ----------------------------------------------
    /**
     * CML document output
     * <br />CML帳票出力。
     * <pre>
     * A create of - PDF list
     *     Make a Palletize Instr. No., a MAIN MARK, and the Date format for a report into an argument.
     *     {@link L2003ReportService#searchCml(String, String, String)} is called.
     *
     * - PDF帳票の作成
     *   梱包指示No、メインマーク、レポート用の日付フォーマットを引数にして
     *   {@link L2003ReportService#searchCml(String, String, String)}を呼出す。
     * </pre>
     * 
     * @param criteria Search condition<br />検索条件
     * @param reportDateFormat Date format (for document outputs) <br />日付フォーマット (帳票出力用)
     * @return PDF list <br />PDF帳票
     * @throws ApplicationException When an error occurs in the update of a Status, or a create of a PDF list<br />ステータスの更新またはPDF帳票の作成でエラーが発生した場合
     */
    public File printCml(W2009CmlCriteriaDomain criteria,  String  reportDateFormat) throws ApplicationException;

    /**
     * Multiple CML document output
     * <br />複数CML帳票出力。
     *
     * <pre>
     * UT414 ADD
     * </pre>
     * 
     * @param criteria Search condition<br />検索条件
     * @param reportDateFormat Date format (for document outputs) <br />日付フォーマット (帳票出力用)
     * @return PDF file object<br />PDFファイルオブジェクト
     * @throws ApplicationException When an error occurs in the update of a Status, or a create of a PDF list<br />ステータスの更新またはPDF帳票の作成でエラーが発生した場合
     */
    public File printMultiCml(W2009CmlCriteriaDomain criteria,  String  reportDateFormat) throws ApplicationException;

    // --------------------------------- Multi Label ----------------------------------------------
    /**
     * Search processing of Multi Label Register Screen
     * <br />Multi Label Register画面の検索処理。
     *
     * <pre>
     * - Search order and master.
     *     - Get local date of the shipper(time is truncated)
     *     - Search order and header information. If result 0, Display the message.
     *     - If not the trial item
     *         - If there is no PKG spec of the single item.
     *         - If there is no registration of volume information.
     * - Get Part information from SIGMA.
     *     - SIGMA information acquisition check
     *     - QTY unit
     *     - Stock quantity calculation
     * - Size, weight calculation (with conversion to the unit of sipper).
     *     - Search Shipper unit.
     *     - If not the trial item
     *         - L
     *         - W
     *         - H
     *         - Volume
     *     - Item Weight
     *         - Sipper unit. No rounding order to reduce the error of the issue as Sample N/W calculated by the J/S.
     *     - N/W
     * - PKG work registration and calculate the G/W.
     *     - PKG work clear.
     *     - If not the trial item
     *         - Register the PKG work.
     *         - Calculate the packaging material weight from PKG work.
     *         - G/W
     *
     * - オーダーおよび原単位検索。
     *     - シッパーのローカル日付を取得（時刻は切り捨て）
     *     - オーダーおよびヘッダ情報検索。結果が0件ならメッセージを表示する。
     *     - 号試品のでない場合
     *         - 単品の包装仕様がない場合
     *         - 包装仕様に容積情報の登録がない場合
     * - CIGMAからの品番情報取得。
     *     - CIGMA情報取得チェック
     *     - 数量単位
     *     - 在庫数量計算
     * - 大きさ、重量計算（シッパーの単位への変換を伴う）。
     *     - シッパー単位系の検索
     *     - 号試品でない場合
     *         - L
     *         - W
     *         - H
     *         - Volume
     *     - 製品重量
     *         - シッパー単位。J/Sによる号試品N/W計算の誤差を少なくするため丸めなし。
     *     - N/W
     * - PKGワーク登録およびG/W計算。
     *     - PKGワーククリア。
     *     - 号試品でない場合
     *         - PKGワークの登録。
     *         - PKGワークより包装材重量を計算
     *         - G/W
     * </pre>
     *
     * UT304 MULTI LABEL ADD
     *
     * @param cmlCriteriaDomain 検索条件
     * @return Search Result/検索結果
     * @throws ApplicationException Business Exception/業務例外
     */
    W2009CmlDomain searchOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException;

    /**
     * Register processing of Multi Label Register Screen
     * <br />Multi Label Register画面の登録処理
     *
     * <pre>
     * - Get local date of the shipper(time is truncated)
     * - Numbering of the main mark
     * - Search and lock the allocatable orders.
     * - Allocate orders
     *     - Save list of orders that allocated
     *     - Save registration information list of TT_PLTZ_ITEM
     *     - If order QTY is not enough
     * - Update TT_EXP_RCV_ODR
     * - Update TT_PLTZ_ITEM_ODR
     * - Repeat Main Mark number
     *     - TT_PLTZ registration
     *     - Get the earliest ETD in order that allocated
     *     - TT_PLTZ_ITEM registration(parts)
     *     - TT_PLTZ_ITEM registration(PKG)
     *     - Search TW_PLTZ_ITEM_PKG
     * - TT_TMP_STOCK registration
     * - Update if there is a record. If not, registration.
     * - CIGMA I/F
     * - Return value
     *     - From To Main Mark
     *     - Issuer infomation
     *
     * - シッパーのローカル日付を取得（時刻は切り捨て）
     * - メインマークの採番
     * - 引当可能な受注をロックして検索
     * - 受注の引当
     *     - 引き当てた受注のリストを退避
     *     - パレタイズ対象品の登録情報リストを退避
     *     - 受注数が足りない場合
     * - 輸出受注の更新
     * - パレタイズ対象品受注情報の登録。
     * - メインマーク数分繰り返し
     *     - パレタイズ登録
     *     - 引き当てた受注の中で最も早いETDを取得
     *     - パレタイズ対象品登録（品番）
     *     - パレタイズ対象品登録（包装材）
     *     - パレタイズ対象品PKGワークの検索
     * - 仮在庫の登録
     * - レコードがあれば更新なければ登録
     * - CIGMA連携
     * - 戻り値
     *     - 開始・終了メインマーク
     *     - 発行者情報
     * </pre>
     *
     * UT304 MULTI LABEL ADD
     *
     * @param cmlCriteriaDomain Register data/登録データ
     * @return Register Result/検索結果
     * @throws ApplicationException 業務例外
     */
    W2009CmlDomain registerOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException;

    /**
     * PKG Materials processing of Multi Label Register Screen
     * <br />Multi Label Register画面のPKG Materials処理
     *
     * <pre>
     * - RT material use the presence or absence of TW_PLTZ_ITEM_PKG
     * - PKGワークのRT材使用有無
     * - Calculate the packaging material weight from PKG work.
     * - PKGワークより包装材重量を計算
     * </pre>
     *
     * UT304 MULTI LABEL ADD
     *
     * @param cmlCriteriaDomain 検索条件
     * @return Search Result/検索結果
     * @throws ApplicationException Business Exception/業務例外
     */
    W2009CmlDomain searchOnMultiLabelPkgMaterialsReturn(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException;
    // ---------------------------------  ----------------------------------------------
}