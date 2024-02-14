/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCustomerQrPatternHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService;
import com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;

/**
 * Service Interface of Palletize Instruction
 * <br />梱包指示のサービスインタフェースです。
 * <pre>
 * bean id: w2001PltzInstrService
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public interface W2001PltzInstrService {

    
    
    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    
    /**
     * Check correlation of Date
     * <br />日付の相関チェックを行います。
     * <pre>
     * - Correlative check of the PALLETIZE INSTRUCTION DATE
     *     Check when both of PALLETIZE INSTRUCTION DATE(From) and PALLETIZE INSTRUCTION DATE(To) are inputted
     *     For details, refer sheet "機能仕様共通：日付 From - To の相関チェック" of 共通仕様.xls
     * 
     * - 梱包指示日の相関チェック
     *     梱包指示日(From)と梱包指示日(To)の両方が入力された場合にチェックを行う。
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     * 
     * 
     * @param fromDt - DATE(From)
     * @param toDt DATE(To)
     * @param dateFormat - Date format
     * @return True if there is no error in the input value, otherwise false
     */
    public boolean validateConsistencyFmDateToDate(String fromDt, String toDt, String dateFormat);

    /**
     * Check the Shipper authority
     * <br />Shipper権限チェックを行います。
     * <pre>
     * For details, refer sheet "access permission common-specifications: reference and update authority" of common-specifications .xls
     * 詳細は共通仕様.xls「アクセス権限共通仕様：参照・更新権限」を参照
     * </pre>
     * 
     * @param shipperCd - COMPANY CODE
     * @param plntCd - PLANT CODE
     * @return true if the user has authority for COMPANY and PALNT CODE specified, otherwise false
     * @throws ApplicationException - If authority can not be checked
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException;
    
    /**
     * Check the quantity of Palletize Instruction
     * <br />数量チェックを行います。
     *
     * @param instrQty - the quantity of Palletize Instruction
     * @return true if the quantity is greater than 0, otherwise false
     */
    public boolean validateConsistencyInstrActQty(int instrQty);
    
    /**
     * Check whether the quantity of Palletize Instruction has exceeded the order
     * <br />オーダー超えチェックを行います。
     *
     * @param instrQty - the quantity of Palletize Instruction
     * @param sumQty - total number of orders
     * @return true if the quantity of Palletize Instruction is greater than order, otherwise false
     */
    public boolean validateConsistencyInstrActQtyOver(int instrQty, int sumQty);
    
    /**
     * Check the record of Export Shipping Item No Special Information Master exists
     * <br />輸出出荷品番情報取得チェックを行います。
     *
     * @param itemNm - item name
     * @return true if item name is not "", otherwise false
     */
    public boolean validateConsistencyItemNm(String itemNm);
    
    /**
     * Check Item MA registration
     * <br />Item MA登録チェックを行います。
     *
     * @param itemLotSize - BOX LOT QUANTITY
     * @return false if BOX LOT QUANTITY is 0 or null, otherwise true
     */
    public boolean validateConsistencyLotSize(String itemLotSize);
    
    /**
     * Check the registration of Package Specification Revision Master
     * <br />包装仕様有効リビジョン原単位登録チェックを行います。
     * 
     * @param shipLot - Number of accommodated
     * @return true if shipLot is not "", otherwise false
     */
    public boolean validateConsistencyShipLot(String shipLot);
    
    /**
     * Warning confirmation check
     * <br />Warning確認チェック
     *
     * @param ignoreWarnings Ignore Warnings
     * @param instrQty - the quantity of Palletize Instruction
     * @param onHandQty - the quantity
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     */
    public boolean validateConsistencyWarningIgnoreWarnings(String ignoreWarnings, int instrQty, int onHandQty);
    
    
    
    // --------------------------------- Database check method validateDatabase ----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase ----------------------------------


    /**
     * Check whether the input date is the past day
     * <br />過去日チェックを行います。
     * <pre>
     * Check input date by using timezone of company specified
     * For details, refer sheet "機能仕様共通：過去日チェック" of 共通仕様.xls
     * 
     * 指定された会社のタイムゾーンを使用して過去日チェックを行います。
     * 詳細は共通仕様.xls「機能仕様共通：過去日チェック」を参照
     * </pre>
     * 
     *
     * @param date - the date entered
     * @param dateFormat - date format
     * @param compCd - COMPANY COED
     * @return true if the input date is not the past day, otherwise false
     * @throws ApplicationException - if can not get date format
     */
    public boolean validateDatabaseAfterDateComp(String date, String dateFormat, String compCd)
        throws ApplicationException;
    
    /**
     * Check the availability of CIGMA
     * <br />CIGMAの利用可否をチェックします。
     * <pre>
     * Check Shipper whether running nightly batch
     * For details, refer sheet "機能仕様共通：CIGMA夜間バッチ中の振る舞い" of 共通仕様.xls
     * 
     * Shipperが夜間バッチ中かをチェックします。
     * 詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * </pre>
     * 
     * 
     * @param isShipping24hFunc - SHIPPING 24H CORRESPONDENCE FLAG
     * @param compCd - COMPANY CODE
     * @return true if CIGMA is available, otherwise false
     * @throws ApplicationException - If the availability of CIGMA can not be determine
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException;
    
    /**
     * check the combination of Shipper, Cust. No and Ship To
     * <br />組み合わせチェック(Shipper、Cust. No、Ship To)を行います。
     * <pre>
     * For details, refer sheet ":[ / functional specification ] Shipper, Customer, and Ship to combination check" of common-specifications .xls
     * 
     * 詳細は共通仕様.xls「機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック」を参照
     * </pre>
     * 
     * @param shipperCd - COMPANY CODE
     * @param customerCd - CUSTOMER CODE
     * @param lgcyShipTo - SHIP TO CODE
     * @return true if the combination is correct, otherwise false
     * @throws ApplicationException - if the combination can not be obtained
     */
    public boolean validateDatabaseShipperCustomerShipTo(String shipperCd, String customerCd, String lgcyShipTo)
        throws ApplicationException;
    
    /**
     * check the combination of Shipper, W/H and Plant CD
     * <br />組み合わせチェック (Shipper、W/H、Plant CD)
     * <pre>
     * For details, refer sheet ":[ / functional specification ] Shipper, W/H, and Plant combination check" of common-specifications .xls
     * 
     * 詳細は共通仕様.xls「機能仕様共通：Shipper、W/H、Plant　組み合わせチェック」を参照
     * </pre>
     *
     * @param shipperCd - COMPANY CODE
     * @param lgcyWhCd - WAREHOUSE CODE
     * @param plntCd - PLANT CODE
     * @return true if the combination is correct, otherwise false
     * @throws ApplicationException - if the combination can not be obtained
     */
    public boolean validateDatabaseShipperWhPlant(String shipperCd, String lgcyWhCd, String plntCd)
        throws ApplicationException;
    
    /**
     * Check records of Palletize Instruction Item No Work exists
     * <br />梱包指示品目番号ワークが存在するかチェックします。
     * <pre>
     * - Create a search condition domain
     *     Create a {@link TwPltzInstrItemNoCriteriaDomain}, and set the DSC-ID Argument
     *     Set to false searchCountCheckFlg of the search condition domain
     * 
     * - Search of Palletize Instruction Item No Work
     *     Call the {@link TwPltzInstrItemNoService#searchCount(TwPltzInstrItemNoCriteriaDomain)},
     *     if acquisition number is 0, then an error is returned
     * 
     * - 検索条件ドメインの作成
     *     {@link TwPltzInstrItemNoCriteriaDomain}を作成し、引数のDSC-IDを設定する
     *     検索条件ドメインのsearchCountCheckFlgをfalseに設定する
     *     
     * - 梱包指示品目番号ワークの検索
     *     {@link TwPltzInstrItemNoService#searchCount(TwPltzInstrItemNoCriteriaDomain)}を呼出し、
     *     取得件数が0であれば、エラーとする
     * </pre>
     * 
     * 
     * @param dscId - DSC-ID
     * @return true if the records of Palletize Instruction Item No Work exists, otherwise false
     * @throws ApplicationException - if the Palletize Instruction Item No Work can not be refered
     */
    public boolean validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister(String dscId)
        throws ApplicationException;

    
    /**
     * Check the number of registration
     * <br />登録件数チェックを行います。
     *
     * @param dscId DSC-ID
     * @param registerNum - number of registration
     * @return true if the number of Palletize Instruction Item No Work + the number of registration
     *         <= {@link Eca0027Constants#TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT}, otherwise false
     * @throws ApplicationException - If the number of Palletize Instruction Item No Work cannot be obtained
     */
    public boolean validateDatabaseTwPltzInstrItemNoOnCreateUpdate(String dscId, int registerNum)
        throws ApplicationException;
    
    /**
     * Check the status of Palletize Instruction (Get Lock  of record at the same time also)
     * <br />梱包指示の存在(ステータス)チェックを行います。(同時にレコードのロックも取得)
     *
     * @param pltzInstrNo - PALLETIZE INSTRUCTION NO
     * @return GSCM_E0_0010 if the data does not exist, NXS_E1_0011 if the status is invalid, otherwise null
     * @throws ApplicationException - if the Palletize Instruction can not be obtained
     */
    public String validateDatabaseTtPltzInstrOnRegisterCancel(String pltzInstrNo)
        throws ApplicationException;
    
    /**
     * Check whether the Palletize Instruction exists (Get Lock  of record at the same time also)
     * <br />梱包指示の存在チェックを行います。(同時にレコードのロックも取得)
     *
     * @param pltzInstrNo - PALLETIZE INSTRUCTION NO
     * @return true if the data exists, otherwise false
     * @throws ApplicationException - if the Palletize Instruction can not be refered
     */
    public boolean validateDatabaseTtPltzInstrOnRegisterPrintInstr(String pltzInstrNo)
        throws ApplicationException;

    /**
     * Check existence of the Palletize Instruction and its status <br />
     * (Get Lock of record at the same time also)
     * <br />梱包指示の存在チェック、梱包指示ステータスチェックを行います。(同時にレコードのロックも取得)
     *
     * @param pltzInstrNo - PALLETIZE INSTRUCTION NO
     * @return GSCM_E0_0010 if the data does not exist, NXS_E1_0011 if the status is invalid, otherwise null
     * @throws ApplicationException - if the Palletize Instruction can not be refered
     */
    public String validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(String pltzInstrNo)
        throws ApplicationException;
    
    /**
     * Check for the existence of Mix Tag
     * <br />MIXED現品票の存在チェックを行います。
     *
     * @param pltzInstrNo - PALLETIZE INSTRUCTION NO
     * @return true if the Mix Tag does not exist, otherwise false
     * @throws ApplicationException - if the Mix Tag can not be refered
     */
    public boolean validateDatabaseTtMixTagOnRegisterCancel(String pltzInstrNo)
        throws ApplicationException;

    // --------------------------------- Search system method search ----------------------------------
    // --------------------------------- 検索系メソッド search ----------------------------------
    

    /**
     * Get the number of the Palletize Instruction Main Screen
     * <br />梱包指示Main画面の検索件数を取得します。
     * <pre>
     * For details of the search process, refer {@link #searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)}
     * 
     * 検索処理の詳細は{@link #searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)}を参照
     * </pre>
     *
     * @param criteria - Search conditions domain
     * @return Number of results
     * @throws ApplicationException - if the Palletize Instruction can not be refered
     */
    public int searchCountForPagingOnMainSearch(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Run a search process of Palletize Instruction Main Screen
     * <br />梱包指示Main画面の検索処理を行います。
     * <pre>
     * - Search of Palletize Instruction
     *     With criteriaDomain as an argument, get the data that satisfies all the following conditions
     *     by using {@link W2001PltzInstrDao#searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain)}:
     *     - corresponds to the conditions specified by the screen
     *     - included in the page that is specified
     *     - Logged-in user's authority includes the SHIPPER CODE and PLANT CODE in the Palletize Instruction
     * 
     * - How to sort the search results
     *     sort the search results in the following order:
     *     - TRANSPORT CODE (Ascending order)
     *     - PLANT CODE (Ascending order)
     *     - LEGACY WAREHOUSE CODE (Ascending order)
     *     - PALLETIZE INSTRUCTION STATUS (Ascending order)
     *     - PALLETIZE INSTRUCTION NO (Ascending order)
     * 
     * - How To Return Search Results
     *         Return search results in a form of list {@link W2001PltzInstrDomain}
     * 
     * - 梱包指示の検索
     *     criteriaDomainを引数にして、{@link W2001PltzInstrDao#searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータ取得する
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *     - 輸送手段コード (昇順)
     *     - 製造部工場区分 (昇順)
     *     - LEGACY倉庫コード (昇順)
     *     - 梱包指示ステータス (昇順)
     *     - 梱包指示NO (降順)
     *
     * - 検索結果の返却
     *   検索結果を{@link W2001PltzInstrDomain}のリストで返却する
     * </pre>
     * 
     * 
     * @param criteria - search conditions domain
     * @return search results
     * @throws ApplicationException - if cannot refer Palletize Instruction
     */
    public List<? extends W2001PltzInstrDomain> searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Run a search process of Palletize Instruction Create Screen
     * <br />梱包指示Create画面の検索処理を行います。
     * <pre>
     * - Acquisition of working days
     *     Get working days between from two business days before PALLETIZE INSTRUCTION DATE,
     *     to four business days after it by calling Web Service (WS2001)
     * 
     * - Run a search process
     *     With criteriaDomain as an argument, get the data that satisfies all the following conditions
     *     by using {@link W2001PltzInstrDao#searchTtExpRcvOdr(W2001PltzInstrItemCriteriaDomain)}:
     *     - Palletize Instruction Item No Work (if the corresponding records exists)
     *     - Export Receive Order (Get the remaining order quantity of the working day for each)
     * 
     * - Set of working days
     *     Set the working days that is acquired above to the search results domain
     * 
     * - Acquisition of the Item No. information
     *     By calling a (WS2002) Web service, obtain information for the Item No. of the search results
     * 
     * - Binding of data
     *     bind results by using Item No. of the Item No. information acquired above as a key.
     *     (exclude search results that item number information can not be acquired)
     * 
     * - Check for the existence of COLLATE METHOD TYPE
     *     Check the existence of the Customer QR Pattern corresponding to the Item No. information obtained in the above
     *     by calling {@link TmCustomerQrPatternHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)}
     *     If it does not exist, throw GscmApplicationException
     *     
     * - Return search results
     * 
     * 
     * - 稼働日の取得
     *     Webサービス(WS2001)を呼出し、梱包指示日の2稼働日前～4稼働日後の稼働日を取得する
     *     取得した稼働日を検索条件ドメインに設定する
     *     
     * - 検索処理の実行
     *     検索条件ドメインを引数にして、{@link W2001PltzInstrDao#searchTtExpRcvOdr(W2001PltzInstrItemCriteriaDomain)}を呼出し、
     *     検索条件に該当する下記のデータを取得する
     *     - 梱包指示品目番号ワーク (あれば)
     *     - 輸出受注 (上記稼働日ごとの残注文数量を取得)
     * 
     * - 稼働日の設定
     *     検索結果のドメインに上記で取得した稼働日を設定する
     *     
     * - 品目番号番号情報の取得
     *     Webサービス(WS2002)を呼出し、検索結果の品目番号に対する情報を取得する
     *     
     * - データの結合
     *     上記で取得した品目番号情報の品目番号をキーにして、検索結果と結合する
     *     (品目番号情報が取得できなかった検索結果は除外する)
     *     
     * - 照合方式区分の存在チェック
     *     上記で取得した品目番号情報に対して、{@link TmCustomerQrPatternHdrService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain)}を呼出し、
     *     得意先QRパターンが存在することをチェックする
     *     存在しない場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria - search conditions domain
     * @return search results
     * @throws ApplicationException - if cannot refer the Palletize Instruction Item No Work or Export Receive Order
     */
    public List<? extends W2001PltzInstrItemDomain> searchForPagingOnCreateSearch(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Run a search process of Palletize Instruction Register Screen (when changed from Main Screen)
     * <br />梱包指示Register画面の検索処理(Main画面から遷移時)を行います。
     * <pre>
     * - Search Palletize Instruction
     *     With criteria as an argument, search Palletize Instruction 
     *     by calling {@link W2001PltzInstrDao#searchTtPltzInstrItemNo(W2001PltzInstrCriteriaDomain)}
     * 
     * - Return search results
     *         Return search results in a form of list {@link W2001PltzInstrDomain}
     * 
     * 
     * - 梱包指示の検索
     *     criteriaを引数にして、{@link W2001PltzInstrDao#searchTtPltzInstrItemNo(W2001PltzInstrCriteriaDomain)}を呼出し、
     *     梱包指示を検索する
     * 
     * - 検索結果の返却
     *     結果を{@link W2001PltzInstrDomain}で返却する
     * </pre>
     * 
     * 
     * @param criteria - search conditions domain
     * @return search results
     * @throws ApplicationException - if cannot refer the Palletize Instruction
     */
    public W2001PltzInstrDomain searchOnRegisterInitByFromMain(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Run a search process of Palletize Instruction Register Screen (when changed from Create Screen)
     * <br />梱包指示Register画面の検索処理(Create画面からの遷移時)を行います。
     * <pre>
     * - Search the Palletize Instruction Item No Work
     *     With criteria as an argument, get the Palletize Instruction Item No Work 
     *     by calling {@link W2001PltzInstrDao#searchTwPltzInstrItemNo(W2001PltzInstrItemCriteriaDomain)}
     * 
     * - Return search results
     *         Return search results in a form of list {@link W2001PltzInstrItemDomain}
     * 
     * 
     * - 梱包指示品目番号ワークの検索
     *     criteriaを引数にして、{@link W2001PltzInstrDao#searchTwPltzInstrItemNo(W2001PltzInstrItemCriteriaDomain)}を呼出し、
     *     梱包指示品目番号ワークを取得する
     *     
     * - 検索結果の返却
     *     結果を{@link W2001PltzInstrItemDomain}で返却する
     * </pre>
     * 
     * 
     * @param criteria - search conditions domain
     * @return search results
     * @throws ApplicationException - if cannot refer the Palletize Instruction Item No Work
     */
    public List<? extends W2001PltzInstrItemDomain> searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException;
    

    // --------------------------------- Update system method update ----------------------------------
    // --------------------------------- 更新系メソッド update ----------------------------------
    

    /**
     * Create a Palletize Instruction
     * <br />梱包指示書を作成します。
     * <pre>
     * - Update status
     *     Create {@link TtPltzInstrDomain}, then set the following items to it:
     *     - PALLETIZE INSTRUCTION STATUS ({@link Eca0027Constants#PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT})
     *     - PALLETIZE INSTRUCTION NO
     *     Update the status by {@link TtPltzInstrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)}
     * 
     * - Create a PDF Document
     *     Create a PDF Document by {@link L2001ReportService#searchPltzInstr(String, String)}
     * 
     * 
     * - ステータスの更新
     *     {@link TtPltzInstrDomain}を作成し、下記項目を設定する
     *       - 梱包指示ステータス ({@link Eca0027Constants#PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT})
     *       - 梱包指示NO
     *     {@link TtPltzInstrService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain)}を呼出し、
     *     ステータスを更新する
     * 
     * - PDF帳票の作成
     *     {@link L2001ReportService#searchPltzInstr(String, String)}を呼出し、PDF帳票を作成する
     * </pre>
     * 
     * 
     * @param pltzInstr - Target palletize instructions
     * @param reportDateFormat - format date (for output the Documents)
     * @return PDF Documents
     * @throws ApplicationException - if any error occurs in creation of PDF Documents or in update of the status
     */
    public File updatePrintInstr(W2001PltzInstrDomain pltzInstr, String reportDateFormat) throws ApplicationException;

    
    /**
     * Create CML(EIS Parts)
     * <br />CML(EIS Parts)を作成します。
     * <pre>
     * - Update status of Palletize Instruction
     *     Create {@link W2001PltzInstrDomain}, then set the following items to it:
     *     - PALLETIZE INSTRUCTION STATUS ({@link Eca0027Constants#PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT})
     *     - CML PRINT OUT DATE (converted in the time zone of the Shipper)
     *     - PALLETIZE INSTRUCTION NO
     *     Update the status by {@link W2001PltzInstrService#updatePrintInstr(W2001PltzInstrDomain, String)}
     * 
     * - Create a PDF Document
     *     Create a PDF Document by {@link L2003ReportService#searchCml(String, String, String)}
     * 
     * 
     * - 梱包指示ステータスの更新
     *     {@link W2001PltzInstrDomain}を作成し、下記項目を設定する
     *       - 梱包指示ステータス ({@link Eca0027Constants#PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT})
     *       - CML出力日 (Shipperのタイムゾーン変換日付)
     *       - 梱包指示NO
     *     {@link W2001PltzInstrService#updatePrintInstr(W2001PltzInstrDomain, String)}を呼出し、ステータスを更新する
     *     
     * - PDF帳票の作成
     *     {@link L2003ReportService#searchCml(String, String, String)}を呼出し、PDF帳票を作成する
     * </pre>
     * 
     * 
     * @param pltzInstr - Target palletize instructions
     * @param reportDateFormat - format date (for output the Documents)
     * @return PDF Documents
     * @throws ApplicationException - if any error occurs in creation of PDF Documents or in update of the Palletize Instruction status
     */
    public File updatePrintCml(W2001PltzInstrDomain pltzInstr, String reportDateFormat) throws ApplicationException;
    

    // --------------------------------- Delete system method delete ----------------------------------
    // --------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * Delete Palletize Instruction Item No Work
     * <br />梱包指示品目番号ワークを削除します。
     * <pre>
     *  - Create the search condition domain
     *     Create {@link TwPltzInstrItemNoCriteriaDomain}, then set the DSC-ID of the criteria argument
     *     Set false in searchCountCheckFlg of search criteria domain
     * 
     * - Delete of Palletize Instruction Item No Work
     *     Call {@link TwPltzInstrItemNoService#searchCount(TwPltzInstrItemNoCriteriaDomain)}
     *     If the number that has been acquired is equal to one or more, 
     *     Delete Palletize Instruction Item No Work by {@link TwPltzInstrItemNoService#deleteByCondition(TwPltzInstrItemNoCriteriaDomain)}
     * 
     * 
     * - 検索条件ドメインの作成
     *     {@link TwPltzInstrItemNoCriteriaDomain}を作成し、引数criteriaのDSC-IDを設定する
     *     検索条件ドメインのsearchCountCheckFlgをfalseに設定する
     *     
     * - 梱包指示品目番号ワークの削除
     *     {@link TwPltzInstrItemNoService#searchCount(TwPltzInstrItemNoCriteriaDomain)}を呼出す
     *     取得件数が1以上であれば、{@link TwPltzInstrItemNoService#deleteByCondition(TwPltzInstrItemNoCriteriaDomain)}を呼出し、
     *     梱包指示品目番号ワークを削除する
     * </pre>
     * 
     * 
     * @param criteria - search condition domain
     * @return The number of record deleted 
     * @throws ApplicationException if cannot delete Palletize Instruction Item No Work
     */
    public int deleteOnHeaderInit(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Run the deletion process of Palletize Instruction Item No Work
     * <br />梱包指示品目番号ワークの削除処理を行います。
     * <pre>
     * - Run the deletion process
     *     Set the following items to {@link W2001PltzInstrItemCriteriaDomain}:
     *     - DSC-ID
     *     - Item No.
     *     - PACKAGE CODE
     *     With the domain above as argument, call {@link TwPltzInstrItemNoService#delete(TwPltzInstrItemNoCriteriaDomain)}
     * 
     * - Re-search
     *     search records again by {@link #searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain)}
     * 
     * 
     * - 削除処理の実行
     *     {@link W2001PltzInstrItemCriteriaDomain}に下記項目を設定する
     *       - DSC-ID
     *       - 品目番号
     *       - 包装区分
     *     上記ドメインを引数に、{@link TwPltzInstrItemNoService#delete(TwPltzInstrItemNoCriteriaDomain)}を呼出す
     *     
     * - 再検索
     *     {@link #searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain)}を呼出し、再検索を行う
     * </pre>
     * 
     * @param pltzInstrItemList - Palletize Instruction Item No Work to delete
     * @return Re-search results
     * @throws ApplicationException - if cannot delete Palletize Instruction Item No Work
     */
    public List<? extends W2001PltzInstrItemDomain> deleteOnRegisterDelete(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList)
        throws ApplicationException;

    // --------------------------------- Transaction system method transactOn ----------------------------------
    // --------------------------------- トランザクション系メソッド transactOn ----------------------------------

    /**
     * Register the data that related Palletize Instruction
     * <br />梱包指示関連のデータを登録します。
     * <pre>
     * - Established allocate order processing
     *     Repeat the following process same times as the number of {@link W2001PltzInstrItemDomain}:
     *     - Get data of Export Receive Order (included lock)
     *         Set following item to {@link TtExpRcvOdrCriteriaDomain}, 
     *         then call {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}
     *         - Properties of {@link W2001PltzInstrDomain}
     *         - RECEIVE ORDER COMPANY CODE ({@link W2001PltzInstrDomain#shipperCd})
     *         - ORDER FIRM FLAG (Y)
     *         - SHIPPED TYPE (1)
     * 
     *     - Allocate PALLETIZE ALLOC QUANTITY from the data in the past most and update 
     *         Set following item to {@link TtExpRcvOdrDomain}
     *         - PALLETIZE ALLOC QUANTITY (PALLETIZE ALLOC QUANTITY + Min(InstrActQty, The remaining amount))
     *         - SHIPPED TYPE(set "2", if ORDER QUANTITY == PALLETIZE ALLOC QUANTITY)
     * 
     *       - Set following item to {@link TtExpRcvOdrCriteriaDomain},
     *         then call {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}
     *           - Key of the Export Receive Order obtained
     * 
     *     * Return error, if cannot allocate InstrActQty
     * 
     * - 確定受注引当処理
     *     {@link W2001PltzInstrItemDomain}の件数分、以下を繰り返す
     *       - 輸出受注データを取得(ロック込み)
     *         {@link TtExpRcvOdrCriteriaDomain}に以下を設定し、{@link W2001PltzInstrDao#lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain)}を呼出す
     *           - {@link W2001PltzInstrDomain}のプロパティ
     *           - 受注会社コード ({@link W2001PltzInstrDomain#shipperCd})
     *           - 受注確定フラグ (Y)
     *           - 出荷済み区分 (1)
     * 
     *       - 一番過去のデータより梱包引当数量を引き当て更新する。
     *         {@link TtExpRcvOdrDomain}に以下を設定をする
     *           - 梱包引当数量 (梱包引当数量 + Min(InstrActQty, 出荷残数量)を設定)
     *           - 出荷済み区分 (注文数量 == 梱包引当数量となった場合のみ、2を設定)
     *           
     *       - {@link TtExpRcvOdrCriteriaDomain}に以下を設定し、{@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出す
     *           - 取得した輸出受注のキー項目
     *     
     *     ※InstrActQty分の引当ができなかった場合はエラー
     * 
     * 
     * - Registration of Palletize Instruction
     *     Set following item to {@link TtPltzInstrDomain},
     *     then call {@link TtPltzInstrService#create(TtPltzInstrDomain)}
     *     - PALLETIZE INSTRUCTION NO (use {@link CommonService#transactSequence(String, String, int, String)})
     *     - PALLETIZE INSTRUCTION STATUS (fixed to 10)
     * 
     * - 梱包指示の登録
     *     {@link TtPltzInstrDomain}に下記項目を設定し、{@link TtPltzInstrService#create(TtPltzInstrDomain)}を呼出す
     *       - {@link W2001PltzInstrDomain}のプロパティ
     *       - 梱包指示NO ({@link CommonService#transactSequence(String, String, int, String)}を使用)
     *       - 梱包指示ステータス (10固定)
     * 
     * 
     * - Registration of Palletize Instruction Item No
     *     Set following item to {@link TtPltzInstrItemNoDomain},
     *     then call {@link TtPltzInstrItemNoService#create(TtPltzInstrItemNoDomain)}
     *     - properties of {@link W2001PltzInstrItemDomain}
     *     - PALLETIZE INSTRUCTION NO (the value that be numbered above)
     *     - PACKED QUANTITY (fixed to 0)
     * 
     * - 梱包指示品目番号の登録
     *     {@link TtPltzInstrItemNoDomain}に下記項目を設定し、{@link TtPltzInstrItemNoService#create(TtPltzInstrItemNoDomain)}を呼出す
     *       - {@link W2001PltzInstrItemDomain}のプロパティ
     *       - 梱包指示NO (上記で採番した値)
     *       - 梱包済数量 (0固定)
     * 
     * 
     * - Registration of Palletize Instruction Receive Order
     *     Set following item to {@link TtPltzInstrOdrDomain},
     *     then call {@link TtPltzInstrOdrService#create(TtPltzInstrOdrDomain)}
     *     - properties of {@link W2001PltzInstrOdrDomain}
     *     - PALLETIZE INSTRUCTION NO (the value that be numbered above)
     *     - ALLOC QUANTITY (allocate from Export Receive Order)
     * 
     * - 梱包指示品目番号受注情報の登録
     *     {@link TtPltzInstrOdrDomain}に下記項目を設定し、{@link TtPltzInstrOdrService#create(TtPltzInstrOdrDomain)}を呼出す
     *       - {@link W2001PltzInstrOdrDomain}のプロパティ
     *       - 梱包指示NO (上記で採番した値)
     *       - 引当数量 (輸出受注から引き当てた数量)
     * 
     * 
     * - Deletion of the Palletize Instruction Item No Work
     *     Set following item to {@link TwPltzInstrItemNoCriteriaDomain},
     *     then call {@link TwPltzInstrItemNoService#deleteByCondition(TwPltzInstrItemNoCriteriaDomain)}
     *       - DSC-ID
     * 
     * - 梱包指示品目番号ワークの削除
     *     {@link TwPltzInstrItemNoCriteriaDomain}に下記項目を設定し、{@link TwPltzInstrItemNoService#deleteByCondition(TwPltzInstrItemNoCriteriaDomain)}を呼出す
     *       - DSC-ID
     * 
     * 
     * - Registration and update of the Temp Stock
     *     - Registered check of the Temp Stock
     *         Set following item to {@link TtTmpStockCriteriaDomain},
     *         then call {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}
     *         - properties of {@link W2001PltzInstrDomain}
     *         - properties of {@link W2001PltzInstrItemDomain}
     * 
     *     - if Temp Stock no exists
     *         Set following item to {@link TtTmpStockDomain},
     *         then call {@link TtTmpStockService#create(TtTmpStockDomain)}
     *         - properties of {@link W2001PltzInstrDomain}
     *         - properteis of {@link W2001PltzInstrItemDomain}
     *         - Quantity (set INSTRUCTION QUANTITY)
     * 
     *     - if Temp Stock exists
     *         Set following item to {@link TtTmpStockDomain},
     *         then call {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}
     *         - Quantity (set Quantity + INSTRUCTION QUANTITY)
     * 
     * - 仮在庫の登録・更新
     *     - 仮在庫登録済みチェック
     *         {@link TtTmpStockCriteriaDomain}に下記を設定し、{@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}を呼出す
     *           - {@link W2001PltzInstrDomain}のプロパティ
     *           - {@link W2001PltzInstrItemDomain}のプロパティ
     * 
     *   - 仮在庫が存在しない場合
     *       {@link TtTmpStockDomain}に下記を設定し、{@link TtTmpStockService#create(TtTmpStockDomain)}を呼出す
     *         - {@link W2001PltzInstrDomain}のプロパティ
     *         - {@link W2001PltzInstrItemDomain}のプロパティ
     *         - 数量 (梱包指示数量を設定)
     *         
     *   - 仮在庫が存在する場合
     *       {@link TtTmpStockDomain}に下記を設定し、{@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出す
     *         - 数量 (数量 + 梱包指示数量を設定)
     * 
     * 
     * - Registration Actuality of PALLETIZE ALLOC QUANTITY
     *     Update the order information of CIGMA side
     *     by {@link Ws2005RestService#createRcvOdrAlloc(String, String, com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain)},
     *     with the registered Palletize Instruction Receive as argument
     * 
     * - 受注引当実績の登録（Webサービスの起動）
     *     登録した梱包指示品目番号受注情報を引数に、{@link Ws2005RestService#createRcvOdrAlloc(String, String, com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain)}を呼び出し、
     *     CIGMA側の受注情報を更新する
     * 
     * 
     * - Re-search
     *     Run search process that is same process ran when changed from the Main Screen
     * 
     * - 再検索
     *     Main画面からの遷移時と同じ検索を行う
     * </pre>
     * 
     * 
     * @param pltzInstr - Domain that holds information of Palletize Instruction
     * @return Re-search result of Palletize Instruction
     * @throws ApplicationException - if cannot register
     */
    public W2001PltzInstrDomain transactOnRegister(W2001PltzInstrDomain pltzInstr)
        throws ApplicationException;
    
    /**
     * Cancel Palletize Instruction
     * <br />梱包指示のキャンセルを行います。
     * <pre>
     * - cancel of order allocation
     *     - Get the target from the Palletize Instruction Receive Order
     *     
     *     - To the above data, update the Export Receive Order
     *         - PALLETIZE ALLOC QUANTITY (PALLETIZE ALLOC QUANTITY - ALLOC QUANTITY)
     *         - SHIPPED TYPE (set "1")
     * 
     * - 受注引当のキャンセル
     *     - 梱包指示品目番号受注情報から対象を取得する
     *     
     *     - 上記のデータに対して、輸出受注を更新する
     *         - 梱包引当数量 (梱包引当数量 - 上記の引当数量を設定)
     *         - 出荷済み区分 (1を設定)
     * 
     * 
     * - Data deletion
     *     Delete the following data by using PALLETIZE INSTRUCTION NO as conditions:
     *     - Palletize Instruction
     *     - Palletize Instruction Item No
     *     - Palletize Instruction Receive Order No.
     * 
     * - データの削除
     *     梱包指示NOを条件にして、以下のデータを削除する
     *       - 梱包指示
     *       - 梱包指示品目番号
     *       - 梱包指示品目受注番号
     * 
     * 
     * - Update Temp Stock
     *     Update Temp Stock containing the Palletize Instruction Item No
     *         - Quantity (Quantity - INSTRUCTION QUANTITY)
     * 
     * - 仮在庫の更新
     *     梱包指示品目番号に紐づく仮在庫を更新する
     *       - 数量 (数量 - 梱包指示数量を設定)
     * 
     * 
     * - Registration Actuality of PALLETIZE ALLOC QUANTITY
     *     Reflect information of NEXUS side to CIGMA by {@link com.globaldenso.eca0027.core.business.ws.Ws2005RestService}
     * 
     * - 受注引当実績の登録
     *     {@link com.globaldenso.eca0027.core.business.ws.Ws2005RestService}を呼出し、
     *     NEXUS側の情報をCIGMAに反映する
     * </pre>
     * 
     *
     * @param pltzInstr {@link W2001PltzInstrDomain}
     * @throws ApplicationException - if cannot cancel
     */
    public void transactOnRegisterCancel(W2001PltzInstrDomain pltzInstr)
        throws ApplicationException;
    
    /**
     * Register and update Palletize Instruction Item No Work
     * <br />梱包指示品目番号ワークの登録・更新処理を行います。
     * <pre>
     * - Running process of registration and update
     *     Update if the data is registed to Palletize Instruction Item No Work, otherwise register it
     * 
     * - 登録・更新処理の実行
     *     梱包指示品目番号ワークに登録済みのデータであれば、更新を行う。
     *     そうでなければ登録を行う。
     * </pre>
     * 
     * @param shipperCd SHIPPER CD<br />荷主コード
     * @param pltzInstrItemList - target of Palletize Instruction Item No Work
     * @throws ApplicationException - if Palletize Instruction Item No Work cannot be register or update
     */
    public void transactOnCreateUpdate(String shipperCd, List<? extends W2001PltzInstrItemDomain> pltzInstrItemList)
        throws ApplicationException;
    
}
