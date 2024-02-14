/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * Service interface Exp Shipping Item Sp Info MA
 * <br />Exp Shipping Item Sp Info MAのサービスインタフェースです。
 * <pre>
 * bean id: w9016ExpShippingItemSpInfoMaService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12250 $
 */
public interface W9016ExpShippingItemSpInfoMaService {

    /**
     * Authority check
     * <br />権限チェック
     * <pre>
     * - Check authority  ※Company of the screen
     * - 権限チェック ※画面.Company
     * </pre>
     * 
     * @param company Search condition <br />
     * 検索条件
     * @return There is authority true, no authority to false<br />
     * true: 権限あり, false: 権限なし
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyCompAuth(String company) throws ApplicationException;
    
    /**
     * Retrieval data
     * <br />検索データの取得
     * <pre>
     * - Authorization check. 3.1-3.2 of processing No4
     *   Display will focus on the data that is authorized
     * - 2.Get the number of search data
     * - 3.Get search data
     * - 4.Set screen to search results
     * </pre>
     * <pre>
     * - 権限チェック。処理No4の3.1～3.2
     *   権限のあるデータに絞って表示
     * - 2.検索データ件数の取得
     * - 3.検索データの取得
     * - 4.検索結果を画面に設定
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public List<? extends W9016ExpShippingItemSpInfoMaItemDomain> searchForPagingOnInquirySearch(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Physical delete the CIGMA Warehouse Cross Reference Master 
     * <br />倉庫クロスリファレンス原単位を物理削除
     * <pre>
     *  - 4.Lock the selected data
     *  - 5.Delete Selected data
     * </pre>
     * <pre>
     * - 4.選択データをロック
     * - 5.選択データの削除
     * </pre>
     * 
     * @return Number of records that are physical delete<br />
     * 物理削除されたレコードの件数
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException exception occurs<br />
     * 例外が発生した場合
     */
    public Integer deleteOnInquiryDelete(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Authority check
     * <br />権限チェックを行います。
     * <pre>
     * - Check for the existence of Shipper
     *   Call CommonService.validateShipper(String) 
     * </pre>
     * <pre>
     * - Shipperの存在チェックを行います。
     *   {@link CommonService#validateShipper(String)}を呼び出します。
     * </pre>
     * 
     * @param shipper Shipper CD<br />
     * Shipperコード
     * @return False and unless true, in so if present<br />
     * 存在すればtrue、そうでければfalse
     * @throws ApplicationException fail to check<br />
     * チェックに失敗した場合
     */
    public boolean validateDatabaseShipper(String shipper) throws ApplicationException;

    /**
     * Check combination
     * <br />組み合わせチェックを行います。
     * <pre>
     * - Shipper, Customer, Ship to combination check
     *   Call CommonService.validateShipperCustomerShipTo(String, String, String)
     * </pre>
     * <pre>
     * - Shipper、Customer、Ship to 組み合わせチェックを行います。
     *   {@link CommonService#validateShipperCustomerShipTo(String, String, String)}を呼び出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param customerCd CUSTOMER CODE<br />
     * 得意先コード
     * @param shipToCd SHIP TO CODE<br />
     * 送荷先コード
     * @return True, false and otherwise combined company, customers, of Ship to if there is<br />
     * 会社、得意先、送荷先の組み合わせが存在すればtrue、 そうでなければfalse
     * @throws ApplicationException fail to check<br />
     * チェックに失敗した場合
     */
    public boolean validateDatabaseShipperCustomerShipTo(String compCd, String customerCd, String shipToCd) throws ApplicationException;
    
    /**
     * CD packaging related check
     * <br />包装コード関連チェックを行います。
     * <pre>
     * - CD packaging decision of whether or not correct
     *   Call (String, String) the CommonService.validatePkgCd
     * </pre>
     * <pre>
     * - 包装コードが正しかどうかの判定を行います。
     *   {@link CommonService#validatePkgCd(String, String)}を呼び出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param pkgCd CD packaging <br />
     * 包装コード
     * @return True, false and otherwise packaged CD is correct<br />
     * 包装コードが正しければtrue、そうでなければfalse
     * @throws ApplicationException fail to check<br />
     * チェックに失敗した場合
     */
    public boolean validateDatabasePkgCd(String compCd, String pkgCd) throws ApplicationException;
    
    /**
     * CIGMA night batch check
     * <br />CIGMA環境原単位チェックを行います。
     * 
     * <pre>
     * - Call (String) the CommonService.searchCigmaAds as arguments COMPANY CODE
     * - 会社コードを引数とし{@link CommonService#searchCigmaAds(String)}を呼び出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     * @return Return true when the company code exists in the TM_CIGMA_ENV table otherwise return false. <br />
     * CIGAM環境原単位に会社コードが存在すればtrue、そうでなければfalse
     */
    public boolean validateDatabaseCigma(String compCd) throws ApplicationException;
    /**
     * CIGMA night batch check
     * <br />CIGMA夜間バッチ中チェックを行います。
     * 
     * <pre>
     * - Call (boolean, String) the CommonService.searchCigmaAvailable as arguments COMPANY CODE
     * - 会社コードを引数とし{@link CommonService#searchCigmaAvailable(boolean, String)}を呼び出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     * @return True, false and otherwise CIGAM nightly batch if it is running<br />
     * CIGAM夜間バッチが稼働中であればtrue、そうでなければfalse
     */
    public boolean validateDatabaseCigmaAvailable(String compCd) throws ApplicationException;
    
    /**
     * Get search results data 
     * <br />検索結果データを取得
     * <pre>
     * - 3.Set initial VALUE
     * - 4.Get search data
     * - 5.To get a lot of default and QUANTITY Name from CIGMA (new mode only)
     * - 6.From Export Ship To Shipping Master acquisition of default VALUE (new mode only)
     * - 7.Set screen to search results
     * </pre>
     * <pre>
     * - 3.初期値の設定
     * - 4.検索データの取得
     * - 5.CIGMAから品名とロット数量のデフォルトを取得する（新規モードのみ）
     * - 6.輸出送荷先出荷原単位からデフォルト値の取得（新規モードのみ）
     * - 7.検索結果を画面に設定
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9016ExpShippingItemSpInfoMaDomain searchOnEditInit(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Lock selection data
     * <br />選択データをロックします。
     * <pre>
     * - Only if the correction mode
     *   Call (TmExpItemNoSpInfoCriteriaDomain) TmExpItemNoSpInfoService.lockByKeyNoWait
     * </pre>
     * <pre>
     * - 修正モードの場合のみ
     *   {@link TmExpItemNoSpInfoService#lockByKeyNoWait(TmExpItemNoSpInfoCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     * @return False, true otherwise if the lock can not be obtained<br />
     * ロックが取得できなかった場合はfalse, それ以外はtrue
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnEditRegister(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Register / Update Export Shipping Item No Special Information Master 
     * <br />輸出出荷品目番号原単位を登録/更新
     * <pre>
     *  - Update of Export Shipping Item No Special Information Master
     *  - Registration of Export Shipping Item No Special Information Master
     * </pre>
     * <pre>
     * - 輸出出荷品目番号原単位の更新
     * - 輸出出荷品目番号原単位の登録
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return result
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     * 
     */
    public Integer createOnEditRegister(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Multiple lines of text check
     * <br />複数行テキストチェックを行います。
     *
     * @param cmlRemarks CML Remarks
     * @return New line number more than one, or number of characters up to a newline is false if more than 26, true otherwise<br />
     * 改行数が2つ以上、または改行までの文字数が26以上の場合false、それ以外はtrue                                             
     */
    public boolean validateConsistencyTxtLines(String cmlRemarks);
    
    /**
     * Check correlation
     * <br />相関チェックを行います。
     *
     * @param stgInstrFlg Stg. Instr. Flg
     * @param ccType C/C TYPE
     * @param cl C/L
     * @return If the case is not a 'Z' is C / C TYPE in C / L = 'L' it is not 'Y' is Stg. Instr. Flg false, in the C / L = 'L' is false, 'Z is C / C TYPE If this is not the Y '' is Stg. Instr. Flg in 'is false, true otherwise<br />
     * C/L = 'L'でC/C TYPEが'Z'でない場合はfalse、C/L = 'L'でStg. Instr. Flgが'Y'でない場合はfalse、C/C TYPEが'Z'でStg. Instr. Flgが'Y'でない場合はfalse、それ以外はtrue
     */
    public boolean validateConsistencyCLAndCCSpInf(String stgInstrFlg, String ccType, String cl);

    /**
     * Input check
     * <br />入力チェックを行います。
     * <pre>
     * - Past date Check
     *   The target argument date and date format · COMPANY CODE
     *   Call (String, String, String) the CommonService.validateAfterDateComp
     * </pre>
     * <pre>
     * - 過去日チェックを行います。
     *   対象日時・日付フォーマット・会社コードを引数に
     *   {@link CommonService#validateAfterDateComp(String, String, String)}を呼び出します。
     * </pre>
     * 
     * @param date Date entered<br />
     * 入力された日付
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return True, false and otherwise specified date if the reference date later<br />
     * 指定された日付が基準日以降であればtrue、そうでなければfalse
     * @throws ApplicationException exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String compCd) throws ApplicationException;

    /**
     * Get a item description from P/N Xref MA by condition that shipper/customer No./DN item No./reference date.
     * シッパー、得意先、DN品番、基準日より品対から品名を取得します。
     *
     * UT305 ADD
     *
     * @param expShippingItemSpInfoMaCriteriaDomain search criteria
     * @return item description. if no data, null.
     * @throws ApplicationException exception occurs.
     */
    public W9016ExpShippingItemSpInfoMaDomain searchRefreshOnEdit(W9016ExpShippingItemSpInfoMaCriteriaDomain expShippingItemSpInfoMaCriteriaDomain)
        throws ApplicationException;
}
