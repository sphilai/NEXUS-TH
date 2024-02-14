/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService;
import com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;

/**
 * Service interface Exp Ship To Shipping MA
 * <br />Exp Ship To Shipping MAのサービスインタフェース
 * <pre>
 * bean id: w9007ExpShipToShippingMaService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9007ExpShipToShippingMaService {

    /**
     * Authority check
     * <br />権限チェック
     * <pre>
     * - Authorization check for Company
     *   Call UserAuthService.hasUserAuthForComp(String, String) arguments COMPANY CODE as its own screen PERMIT FUNCTION ID
     * </pre>
     * <pre>
     * - Companyの権限チェック
     *   自画面認可機能ID と 会社コードを引数に{@link UserAuthService#hasUserAuthForComp(String, String)}を呼び出し
     * </pre>
     * 
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return There is authority true, no authority to false<br />
     * true: 権限あり, false: 権限なし
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyCompAuth(String company) throws ApplicationException;
    
    /**
     * Get the paging processing results data
     * <br />ページング処理用検索結果データを取得
     * <pre>
     * - Create search criteria domain
     *   Set the following to W9007ExpShipToShippingMaCriteriaDomain.
     *    - (To get the maximum number ) SCREEN ID, locale
     *    - Conditions input from the screen
     *  
     * - Get the number of searches
     *   Call the W9007ExpShipToShippingMaDao.searchCountTmExpShipToShipping (W9007ExpShipToShippingMaCriteriaDomain) as an argument W9007ExpShipToShippingMaCriteriaDomain.
     *   ※ Perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Calculate the search range corresponding to the requested page
     *   Calculate the search start and end position on the basis of number of searches , the number of one page around .
     *   Set to W9007ExpShipToShippingMaCriteriaDomain the calculation results .
     * 
     * - The execution of the search process
     *   Call the W9007ExpShipToShippingMaDao.searchForPagingTmExpShipToShipping (W9007ExpShipToShippingMaCriteriaDomain) as an argument W9007ExpShipToShippingMaCriteriaDomain.
     *   ※ Perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Return the search results list .
     * </pre>
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W9007ExpShipToShippingMaCriteriaDomain}に下記を設定
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9007ExpShipToShippingMaCriteriaDomain}を引数に{@link W9007ExpShipToShippingMaDao#searchCountTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain)}を呼び出し
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算
     *     計算結果を{@link W9007ExpShipToShippingMaCriteriaDomain}に設定
     * 
     * - 検索処理の実行
     *     {@link W9007ExpShipToShippingMaCriteriaDomain}を引数に{@link W9007ExpShipToShippingMaDao#searchForPagingTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain)}を呼び出し
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得
     *    
     * - 検索結果リストを返却
     * </pre>
     *
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public List<? extends W9007ExpShipToShippingMaItemDomain> searchForPagingOnInquirySearch(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Past date Check
     * <br />過去日チェック
     * <pre>
     * - Call CommonService.validateAfterDateComp(String, String, String)  to the target argument date and date format · COMPANY CODE
     * - 対象日時・日付フォーマット・会社コードを引数に{@link CommonService#validateAfterDateComp(String, String, String)}を呼び出し
     * </pre>
     * 
     * @param date Date entered<br />
     * 入力された日付
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @param compCd  COMPANY CODE<br />
     * 会社コード
     * @return True, false and otherwise specified date if the reference date later<br />
     * 指定された日付が基準日以降であればtrue、そうでなければfalse
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyApplyStartDate(String date, String dateFormat, String compCd)
        throws ApplicationException;
    
    /**
     * Delete Export Ship To Shipping Master, the Invoice Template Ship To Master
     * <br />輸出送荷先出荷原単位、送荷先別インボイステンプレート原単位の削除
     * <pre>
     * - To acquire a lock on the Invoice Template Ship To Master
     *   Call TmExpShipToShippingService.lockByKeyNoWait(TmExpShipToShippingCriteriaDomain) 
     *   ※ Throw an Exception if the lock can not be acquired
     * 
     * - Get a lock of Export Ship To Shipping Master
     *   And call W9007ExpShipToShippingMaDao.lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain) 
     *   ※ Throw an Exception if the lock can not be acquired
     * 
     * - Delete the Export Ship To Shipping Master
     *   Call TmExpShipToShippingService.deleteByCondition(TmExpShipToShippingCriteriaDomain) 
     * 
     * - Delete Invoice Template Ship To Master
     *   Call TmInvTplShipToService.deleteByCondition(TmInvTplShipToCriteriaDomain) 
     * </pre>
     * <pre>
     * - 送荷先別インボイステンプレート原単位のロックを取得します。
     *   {@link TmExpShipToShippingService#lockByKeyNoWait(TmExpShipToShippingCriteriaDomain)}を呼び出し
     *   ※ロックが取得できなかった場合はExceptionをThrow
     *   
     * - 輸出送荷先出荷原単位のロックを取得します。
     *   {@link W9007ExpShipToShippingMaDao#lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain)}を呼び出し
     *   ※ロックが取得できなかった場合はExceptionをThrow
     *   
     * - 輸出送荷先出荷原単位の削除
     *   {@link TmExpShipToShippingService#deleteByCondition(TmExpShipToShippingCriteriaDomain)}を呼び出し
     *   
     * - 送荷先別インボイステンプレート原単位の削除
     *   {@link TmInvTplShipToService#deleteByCondition(TmInvTplShipToCriteriaDomain)}を呼び出し
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return delete Count<br />
     * 削除件数
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public int deleteOnInquiryDelete(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Check for the existence of Shipper
     * <br />Shipperの存在チェック
     * 
     * <pre>
     * - Call CommonService.validateShipper the (String) in the argument Shipper CD
     * - Shipperコードを引数に{@link CommonService#validateShipper(String)}を呼び出し
     * </pre>
     * 
     * @param shipper shipper COMPANY CODE<br />
     * 荷主会社コード
     * @return False and unless true, in so if present<br />
     * 存在すればtrue、そうでければfalse
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseShipper(String shipper) throws ApplicationException;
    
    /**
     * Get search results data
     * <br />検索結果データを取得
     * <pre>
     * - Get Free item SERVER NAME
     *   Call the TmInvFreeItemService.searchByCondition (TmInvFreeItemCriteriaDomain) based on COMPANY CODE
     * 
     * - Set the screen Free item SERVER NAME
     *   Set to W9007ExpShipToShippingMaDomain the information obtained
     * 
     * - Only if the correction mode, reference mode, copy the new mode
     *   Retrieval data
     * 
     * - Data acquisition of Export Ship To Shipping Master
     *   Call TmExpShipToShippingService.searchByKey(TmExpShipToShippingCriteriaDomain) 
     * 
     * - Data acquisition of Invoice Template Ship To Master
     *   Call TmInvTplShipToService.searchByCondition(TmInvTplShipToCriteriaDomain) 
     * 
     * - Set as W9007ExpShipToShippingMaDomain search results
     * </pre>
     * <pre>
     * - Free項目名称を取得
     *   会社コードを元に{@link TmInvFreeItemService#searchByCondition(TmInvFreeItemCriteriaDomain)}を呼び出し
     *   
     * - Free項目名称を画面に設定
     *   取得した情報を{@link W9007ExpShipToShippingMaDomain}へ設定
     *   
     * - 修正モード・参照モード・コピー新規モードの場合のみ
     *   検索データの取得を行います。
     *   
     *   - 輸出送荷先出荷原単位のデータ取得
     *     {@link TmExpShipToShippingService#searchByKey(TmExpShipToShippingCriteriaDomain)}を呼び出し
     *     
     *   - 送荷先別インボイステンプレート原単位のデータ取得
     *     {@link TmInvTplShipToService#searchByCondition(TmInvTplShipToCriteriaDomain)}を呼び出し
     *     
     *   - 検索結果を{@link W9007ExpShipToShippingMaDomain}に設定
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9007ExpShipToShippingMaDomain searchOnEditInit(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Check correlation
     * <br />相関チェック
     *
     * <pre>
     * - If (C / C TYPE ≠ 'Z' (mixing)) of (C / L = 'L') without (container shipping) & CUSTOM TIMING TYPE, check NG container shipping
     * - コンテナ出荷(C/L = 'L'(コンテナ出荷なし))＆通関タイミング区分(C/C TYPE ≠ 'Z'(混合))の場合、チェックNGとします。
     * </pre>
     * 
     * @param cl Container shipping<br />
     * コンテナ出荷
     * @param ccType CUSTOM TIMING TYPE<br />
     * 通関タイミング区分
     * @return true check OK,Check false NG<br />
     * チェックOK, false: チェックNG
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyCLAndCCCorrelative(String cl, String ccType) throws ApplicationException;
    
    
    /**
     * DB integrity check
     * <br />DB整合性チェック
     *
     * <pre>
     * - NEXUS Ship to present check
     * - NEXUS送荷先存在チェック
     * </pre>
     * 
     * @param shipTo NEXUS Ship to CD<br />
     * NEXUS Ship toコード
     * @return true is present, false does not exist<br />
     * true: 存在する、false: 存在しない
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseOnEditRegisterByShipTo(String shipTo) throws ApplicationException;
    
    /**
     * Check combination
     * <br />組合せチェック
     * <pre>
     * - Call TmInvTplService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain) ,
     *   Determining the number of whether there 1 or more
     * </pre>
     * <pre>
     * - {@link TmInvTplService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain)}を呼び出し、
     *   件数が1件以上存在するかどうか判定
     * </pre>
     *
     * @param shipper Shipper
     * @param docNo Inv Template
     * @param invCategory Inv Category
     * @param invClass Class of Invoice
     * @return true check OK,Check false NG<br />
     * true: チェックOK, false: チェックNG
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseTmInvTplOnEditRegister(String shipper, String docNo, String invCategory, String invClass) throws ApplicationException;
    
    /**
     * Export Ship To Shipping Master, registration / update the Invoice Template Ship To Master
     * <br />輸出送荷先出荷原単位、送荷先別インボイステンプレート原単位を登録/更新
     * <pre>
     * - In the case of correction mode
     *   - Get a lock of Export Ship To Shipping Master.
     *     CalltmExpShipToShippingService.lockByKeyNoWait(expShipToShippingCriteriaDomain) .
     *     ※ Throw an Exception if the lock can not be acquired .
     *  
     *   - Get a lock on the Invoice Template Ship To Master.
     *     Call w9007ExpShipToShippingMaDao.lockByNoWaitTmInvTplShipTo(criteria).
     *     ※ Throw an Exception if the lock can not be acquired .
     *   
     *   - Update of Export Ship To Shipping Master.
     *     Call TmExpShipToShippingService.updateByCondition(TmExpShipToShippingDomain, TmExpShipToShippingCriteriaDomain).
     * 
     *  - Run the process makes a determination of the registration and renewal in Invoice Template Ship To Master every argument .
     *    Call TmInvTplShipToService.searchByCondition(TmInvTplShipToCriteriaDomain) .
     *    - Run the update process if get 1 or more .
     *      Call TmInvTplShipToService.updateByCondition(TmInvTplShipToDomain, TmInvTplShipToCriteriaDomain).
     *  
     *    - Run the registration process if 0 review.
     *      Call TmInvTplShipToService.create(TmInvTplShipToDomain) .
     * </pre>
     * <pre>
     * - 修正モードの場合
     *   
     *   - 輸出送荷先出荷原単位のロックを取得
     *     {@link TmExpShipToShippingService#lockByKeyNoWait(TmExpShipToShippingCriteriaDomain)}を呼び出し
     *     ※ロックが取得できなかった場合はExceptionをThrow
     *   
     *   - 送荷先別インボイステンプレート原単位のロックを取得
     *     {@link W9007ExpShipToShippingMaDao#lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain)}を呼び出し
     *     ※ロックが取得できなかった場合はExceptionをThrow
     *   
     *   - 輸出送荷先出荷原単位の更新を行います。
     *     {@link TmExpShipToShippingService#updateByCondition(TmExpShipToShippingDomain, TmExpShipToShippingCriteriaDomain)}を呼び出し
     *   
     * - 引数の送荷先別インボイステンプレート原単位毎に登録・更新の判定を行い処理を実行
     *   {@link TmInvTplShipToService#searchByCondition(TmInvTplShipToCriteriaDomain)}を呼び出し
     *     
     *   - 1件以上取得できれば更新処理を実行
     *       {@link TmInvTplShipToService#updateByCondition(TmInvTplShipToDomain, TmInvTplShipToCriteriaDomain)}を呼び出し
     *     
     *   - 0件であれば登録処理を実行
     *     {@link TmInvTplShipToService#create(TmInvTplShipToDomain)}を実行
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return result<br />
     * 結果
     * @throws ApplicationException exception occurs<br />
     * 例外が発生した場合
     */
    public int transactOnEditRegister(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException;
}
