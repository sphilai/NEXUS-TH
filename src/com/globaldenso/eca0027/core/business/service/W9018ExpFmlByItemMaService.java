/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;

/**
 * Service interface of Export Formalities by Parts MA
 * <br />Export Formalities by Parts MAのサービスインタフェースです。
 * <pre>
 * bean id: w9018ExpFmlByItemMaService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9018ExpFmlByItemMaService {
    
    /**
     * Authority check
     * <br />権限チェックを行います。
     * <pre>
     * - Get the user authorization list
     *   Call UserAuthService # getUserAuthList the (String...) argument to its own screen PERMIT FUNCTION ID
     * 
     * - Authorization check for Company
     *   Call userAuthService.hasUserAuthForComp(String, String) arguments COMPANY CODE as its own screen PERMIT FUNCTION ID
     * </pre>
     * <pre>
     * - ユーザ権限リストを取得します。
     *   自画面認可機能IDを引数に{@link UserAuthService#getUserAuthList(String...)}を呼び出します。
     *   
     * - Companyの権限チェックを行います。
     *   自画面認可機能ID と 会社コードを引数に{@link UserAuthService#hasUserAuthForComp(String, String)}を呼び出します。
     * </pre>
     *
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException In the case of an authorization list acquisition failure<br />
     * 権限リスト取得失敗の場合
     */
    public boolean validateConsistencyCompAuth(String compCd) throws ApplicationException;

    /**
     * Correlation check of To - From date
     * <br />日付 From - To の相関チェックを行います。
     * <pre>
     * - Check only if the VALUE is set to APPLY START DATE To the APPLY START DATE From
     *   The NG return the (false) in the case of APPLY START DATE From> APPLY START DATE To
     * </pre>
     * <pre>
     * - 適用開始日Fromと適用開始日Toに値が設定されている場合のみチェックを行います。
     *   適用開始日From > 適用開始日To の場合はNG(false)を返却します。
     * </pre>
     *
     * @param from From date string<br />
     * 日付文字列From
     * @param to To date string<br />
     * 日付文字列To
     * @param dateFormat Date format <br />
     * 日付フォーマット
     * @return True if there is no error in the input value, otherwise false.
     */
    public boolean validateCompanyFromToDate(String from, String to, String dateFormat);
    
    /**
     * Get the paging processing results data
     * <br />ページング処理用検索結果データを取得します。
     * <pre>
     * - Create search criteria domain
     *   Set the following to W9018ExpFmlByItemMaCriteriaDomain.
     *   - (To get the maximum number ) SCREEN ID, locale
     *   - Conditions input from the screen
     * 
     * - Get the number of searches
     *   Call W9018ExpFmlByItemMaDao.searchCountTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain) as an argument W9018ExpFmlByItemMaCriteriaDomain.
     *   ※ Perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Calculate the search range corresponding to the requested page
     *   Calculate the search start and end position on the basis of number of searches , the number of one page around .
     *   Set to W9018ExpFmlByItemMaCriteriaDomain the calculation results .
     * 
     * - The execution of the search process
     *   Call W9018ExpFmlByItemMaDao.searchForPagingTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain) as an argument W9018ExpFmlByItemMaCriteriaDomain.
     *   ※ perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Return the search results list .
     * </pre>
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W9018ExpFmlByItemMaCriteriaDomain}に下記を設定します。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9018ExpFmlByItemMaCriteriaDomain}を引数に{@link W9018ExpFmlByItemMaDao#searchCountTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算します。
     *     計算結果を{@link W9018ExpFmlByItemMaCriteriaDomain}に設定します。
     * 
     * - 検索処理の実行
     *     {@link W9018ExpFmlByItemMaCriteriaDomain}を引数に{@link W9018ExpFmlByItemMaDao#searchForPagingTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     *    
     * - 検索結果リストを返却します。
     * </pre>
     *
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return Domain list results<br />
     * 検索結果ドメインリスト
     * @throws ApplicationException fails to generate search range<br />
     * 検索範囲生成に失敗した場合
     */
    public List<? extends W9018ExpFmlByItemMaItemDomain> searchForPagingOnInquirySearch(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException;
    
    /**
     * Past date Check
     * <br />過去日チェックを行います。
     * <pre>
     * - Check if the date is past date time zone conversion date and time from (system date),
     *   Return (false) NG
     * </pre>
     * <pre>
     * - チェック日付がタイムゾーン変換日時(システム日付)より過去日の場合、
     *   NG（false）を返却します。
     * </pre>
     *
     * @param date Check date<br />
     * チェック日付
     * @param dateFormat Date format <br />
     * 日付フォーマット
     * @param compCd Time zone conversion CD<br />
     * タイムゾーン変換コード
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException time zone conversion failure<br />
     * タイムゾーン変換失敗した場合
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String compCd) throws ApplicationException;
    
    /**
     * Delete of export procedures Part intensity data
     * <br />輸出手続品番原単位データの削除を行います。
     * <pre>
     * - Generate Domain lock conditions
     *   Generate TmExpFormalitiItemNoCriteriaDomain and set VALUE COMPANY CODE, Item No, the APPLY START DATE
     * 
     *  - To acquire a lock on the Export Formality Item No Master
     *    Call TmExpFormalitiItemNoService.lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain) an argument TmExpFormalitiItemNoCriteriaDomain generated
     *    ※ Throw an error if the lock can not be acquired
     *  
     * - Delete Part of export procedures per unit
     *   Call TmExpFormalitiItemNoService.deleteByCondition(TmExpFormalitiItemNoCriteriaDomain) Set the UPDATE YMD to TmExpFormalitiItemNoCriteriaDomain that generated
     *   ※ Delete number is Throw an error if zero reviews
     * </pre>
     * <pre>
     * - ロック条件Domainを生成します。
     *   会社コード、Item No、適用開始日を設定値とし{@link TmExpFormalitiItemNoCriteriaDomain}を生成します。
     *  
     * - 輸出手続品目番号原単位のロックを取得します。
     *   生成した{@link TmExpFormalitiItemNoCriteriaDomain}を引数に{@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}を呼び出します。
     *   ※ロックが取得できない場合はエラーをThrowします。
     *    
     * - 輸出手続品番原単位の削除を行います。
     *   生成した{@link TmExpFormalitiItemNoCriteriaDomain}に更新日時を設定し{@link TmExpFormalitiItemNoService#deleteByCondition(TmExpFormalitiItemNoCriteriaDomain)}を呼び出します。
     *   ※削除件数がゼロ件の場合はエラーをThrowします。
     *   
     * </pre>
     *
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return delete count<br />
     * 削除件数
     * @throws ApplicationException If it fails to search<br />
     * 検索に失敗した場合
     */
    public Integer deleteOnInquiryDelete(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException;
    
    /**
     * Shipper presence check
     * <br />Shipper存在チェックを行います。
     * 
     * <pre>
     * - call CommonService.validateShipper(String) in the argument COMPANY CODE
     * - 会社コードを引数に{@link CommonService#validateShipper(String)}を呼び出します。
     * </pre>
     *
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return False and unless true, in so if present check result<br />
     * チェック結果 存在すればtrue、そうでければfalse
     * @throws ApplicationException fail to check<br />
     * チェックに失敗した場合
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException;

    /**
     * Data acquisition
     * <br />データ取得を行います。
     * <pre>
     * - Data acquisition of export procedures Part intensity
     *   Behavior of CIGMA night batch: functional specification common
     *     Web services: call "ECA0027_WS_9001 Get Item Info (Master Maintenance)" of
     *     Data acquisition of PKG Materials MA
     *     Get the Free item name
     * </pre>
     * <pre>
     * - 輸出手続品番原単位のデータ取得 
     * 機能仕様共通：CIGMA夜間バッチ中の振る舞い 
     * Webサービス「ECA0027_WS_9001：Get Item Info(Master Maintenance)」のコール 
     * 包装材原単位のデータ取得 
     * Free項目名の取得
     * <pre>
     *
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return W9018ExpFmlByItemMaDomain domain<br />
     * W9018ExpFmlByItemMaDomainドメイン
     * @throws ApplicationException If it fails to search<br />
     * 検索に失敗した場合
     */
    public W9018ExpFmlByItemMaDomain searchOnEditInit(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException;
    
    /**
     * Country presence check
     * <br />Country 存在チェックを行います。
     *
     * <pre>
     * - Call CommonService.validateCountry(String) in the argument COUNTRY CODE
     * - 国コードを引数に{@link CommonService#validateCountry(String)}を呼び出します。
     * </pre>
     * 
     * @param countryCd Country Cd
     * @return False and unless true, in so if present check result<br />
     * チェック結果 存在すればtrue、そうでければfalse
     * @throws ApplicationException failed check<br />
     * チェック失敗した場合
     */
    public boolean validateDatabaseCountry(String countryCd) throws ApplicationException;
    
    /**
     * Lock selection data
     * <br />選択データをロックを行います。
     * <pre>
     * - Run the process only if the update mode
     *   - Generate Domain lock conditions
     *     Generate TmExpFormalitiItemNoCriteriaDomain as setting VALUE COMPANY CODE, Item No, the APPLY START DATE
     * 
     * - Rock of Export Formality Item No Master
     *   Call TmExpFormalitiItemNoService # lockByKeyNoWait the (criteria) to the argument TmExpFormalitiItemNoCriteriaDomain generated
     *   ※ lock acquisition count is Throw an error if 0 Listings
     * </pre>
     * <pre>
     * - 更新モードの場合のみ処理を実行します。
     *   - ロック条件Domainを生成します。
     *     会社コード、Item No、適用開始日 を設定値として{@link TmExpFormalitiItemNoCriteriaDomain}を生成します。
     *     
     *   - 輸出手続品目番号原単位のロックを行います。
     *     生成した{@link TmExpFormalitiItemNoCriteriaDomain}を引数に{@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}を呼び出します。
     *     ※ロック取得件数が0件の場合エラーをThrowします。
     * </pre>
     * 
     * 取得件数チェック
     *
     * @param compCd Company
     * @param itemNo Item No
     * @param aplyStrtDt Apply Start Date
     * @param dateFormat Screen Date Format
     * @return True:get data, false: other <br />
     * データ取得できた場合true, それ以外false
     * @throws ApplicationException If 0 Listings lock acquisition number<br />
     * ロック取得件数0件の場合
     */
    public boolean validateDatabaseTmExpFormalitiItemNoOnEditRegister(String compCd, String itemNo, String aplyStrtDt, String dateFormat) 
        throws ApplicationException;
    
    /**
     * Update / registration process of export procedures Part intensity
     * <br />輸出手続品番原単位の 更新/登録 処理を行います。
     * <pre>
     * - Update mode
     *   - Generation of update condition Domain
     *     Generate TmExpFormalitiItemNoCriteriaDomain as setting VALUE COMPANY CODE, Item No, adaptive start date
     * 
     *   - Generation of the contents of the update Domain
     *     Generate TmExpFormalitiItemNoDomain based on the argument
     *   
     *   - Execution of the update process
     *     Domain update condition that is generated, call TmExpFormalitiItemNoService.updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)  to the argument updates Domain
     *   
     * - Registered mode
     *   - Generation of content Domain registration
     *     Generate TmExpFormalitiItemNoDomain based on the argument
     *   
     *   - Execution of the registration process
     *     Call TmExpFormalitiItemNoService.create(TmExpFormalitiItemNoDomain) argument to the stored contents Domain that generated
     * </pre>
     * <pre>
     * - 更新モードの場合
     *  
     *   - 更新条件Domainの生成を行います。
     *     会社コード、Item No、適応開始日 を設定値として{@link TmExpFormalitiItemNoCriteriaDomain}を生成します。
     *     
     *   - 更新内容Domainの生成を行います。
     *     引数を元に{@link TmExpFormalitiItemNoDomain}を生成します。
     *     
     *   - 更新処理の実行
     *     生成した 更新条件Domain、更新内容Domain を引数に{@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}を呼び出します。
     *   
     * - 登録モードの場合
     *   
     *   - 登録内容Domainの生成を行います。
     *     引数を元に{@link TmExpFormalitiItemNoDomain}を生成します。
     *     
     *   - 登録処理の実行
     *     生成した 登録内容Domain を引数に{@link TmExpFormalitiItemNoService#create(TmExpFormalitiItemNoDomain)}を呼び出します。
     * </pre>
     *
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return Register Count
     * @throws ApplicationException no update item<br />
     * 更新件数0件の場合
     */
    public int createOnEditRegister(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException;
    
}
