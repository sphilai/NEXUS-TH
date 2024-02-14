/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService;
import com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.business.service.TmUserService;

/**
 * Service interface of User ID MA.
 * <br />User ID MAのサービスインタフェースです。
 * <pre>
 * bean id: w9004UserIdMaService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9004UserIdMaService {

    /**
     * Get the paging processing results data.
     * <br />ページング処理用検索結果データを取得します。
     * <pre>
     *  - Create a search condition domain
     *    Set the following to W9004UserIdMaCriteriaDomain.
     *      - (To get the maximum number) SCREEN ID, locale
     *      - Conditions input from the screen
     * 
     * - Get the number of searches
     *   W9004UserIdMaCriteriaDomain an argument
     *   Call W9004UserIdMaDao.searchCountForPagingTmUserId(W9004UserIdMaCriteriaDomain) .
     *   ※ Perform a get to focus on data that is (see, update) the company permission to enter.
     * 
     * - Calculate the search range corresponding to the requested page
     *   Calculate the search start and end position on the basis of number of searches, the number of one page around.
     *   Set to W9004UserIdMaCriteriaDomain the calculation results.
     * 
     * - The execution of the search process
     *   Call W9004UserIdMaCriteriaDomain an argument W9004UserIdMaDao.searchForPagingTmUserId(W9004UserIdMaCriteriaDomain).
     *   ※ Perform a get to focus on data that is (see, update) the company permission to enter.
     *   
     * - Return the search results list.
     * </pre>
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W9004UserIdMaCriteriaDomain}に下記を設定します。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9004UserIdMaCriteriaDomain}を引数に{@link W9004UserIdMaDao#searchCountForPagingTmUserId(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算します。
     *     計算結果を{@link W9004UserIdMaCriteriaDomain}に設定します。
     * 
     * - 検索処理の実行
     *     {@link W9004UserIdMaCriteriaDomain}を引数に{@link W9004UserIdMaDao#searchForPagingTmUserId(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     *    
     * - 検索結果リストを返却します。
     * </pre>
     *
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain list results<br />
     * 検索結果ドメインリスト
     * @throws ApplicationException If an exception occurs in the search results when retrieving data<br />
     * 検索結果データ取得時に例外が発生した場合
     */
    public List<? extends W9004UserIdMaItemDomain> searchForPagingOnInquirySearch(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Delete the logical User Config Master.
     * <br />ユーザ設定原単位を論理削除します。
     * <pre>
     * - Lock on the data.
     *   Call W9004UserIdMaDao.lockByNoWaitTmUser(W9004UserIdMaCriteriaDomain).
     *   ※ Throw an error if the lock can not be acquired.
     * 
     * - Performs a logical delete of User Config Master.
     *   Call TmUserConfService.updateByCondition(TmUserConfDomain, TmUserConfCriteriaDomain)  to the argument DSC-ID, the LAST UPDATE DATE.
     *   ※ In the case of 0 Listings, update counts will Throw an error.
     * 
     * - Remove the User Auth Manage.
     *   Call the TtUserAuthMgtService.deleteByCondition (TtUserAuthMgtCriteriaDomain) as an argument DSC-ID.
     * </pre>
     * <pre>
     * - データのロックを行います。
     *   {@link W9004UserIdMaDao#lockByNoWaitTmUser(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *   ※ロックが取得できなかった場合はエラーをThrowします。
     *   
     * - ユーザ設定原単位の論理削除を行います。
     *   DSC-ID、最終更新日時 を引数に{@link TmUserConfService#updateByCondition(TmUserConfDomain, TmUserConfCriteriaDomain)}を呼び出します。
     *   ※更新件数が0件の場合、エラーをThrowします。
     *   
     * - ユーザ利用権限管理の削除を行います。
     *   DSC-IDを引数に{@link TtUserAuthMgtService#deleteByCondition(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Domain lock conditions<br />
     * ロック条件Domain
     * @throws ApplicationException Failure to lock<br />
     * ロックに失敗した場合
     */
    public void deleteOnInquiryDelete(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get search results data
     * <br />検索結果データを取得
     * <pre>
     * - Make a determination of the processing mode .
     *   Determine on the basis of DSC-ID takeover VALUE. DSC-ID, of the logged-in user , the takeover VALUE. Function No.
     * 
     * - New mode
     *    Do nothing.
     * 
     * - Correction mode
     *   Get the screen information .
     *   - Get the user information based on the takeover VALUE DSC-ID..
     *     Call W9004UserIdMaDao.searchTmUser(W9004UserIdMaCriteriaDomain) .
     * 
     *   - Get the region Adm 's login information .
     *     Call TtUserAuthMgtService.searchByCondition(TtUserAuthMgtCriteriaDomain) .
     *  
     *     - If the area Adm 's login information can be acquired
     *       Get the company information and factory information .
     *  
     *       - Call TmNxsCompService.searchByCondition(TmNxsCompCriteriaDomain).
     *       - Call W9004UserIdMaDao.searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain).
     *   
     *     - Get the local authority and regional Adm function use authority information of the user .
     *       Call W9004UserIdMaDao.searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain) .
     *     
     *     - Login who will get the authorization company.
     *       Call W9004UserIdMaDao.searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain) .
     *     
     *     - Get the company Adm authority and company functions use authority information of the user .
     *       Call W9004UserIdMaDao.searchTtUserAuthMgtByComp(W9004UserIdMaCriteriaDomain) .
     *     
     *     - Login 's to get the get the authorization can factory .
     *       Call W9004UserIdMaDao.searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain) .
     *     
     *     - Get the factory Adm authority and function factory use authority information of the user .
     *       Call W9004UserIdMaDao.searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain) .
     *     
     *     - Get the proxy request based companies and the features that are proxy request.
     *       Call TmAgentService.searchByCondition(TmAgentCriteriaDomain) .
     *     
     *     - Set W9004UserIdMaDomain search results .
     * 
     * - Reference mode
     *   - Get the user information based on the takeover VALUE DSC-ID..
     *     Call (W9004UserIdMaCriteriaDomain) W9004UserIdMaDao.searchTmUser.
     *  
     *   - Get the local authority and regional Adm function use authority information of the user .
     *     Call W9004UserIdMaDao.searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain) .
     *  
     *   - Get the company to be displayed in the ( corporate authority ) input area .
     *     Call W9004UserIdMaDao.searchTtUserAuthMgt (W9004UserIdMaCriteriaDomain) .
     *  
     *   - Get the company Adm authority and company functions use authority information of the user .
     *     Call W9004UserIdMaDao.searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain) .
     *  
     *   - Get the factory to display in the ( factory privileges) input area .
     *     Call W9004UserIdMaDao.searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain) .
     *   
     *   - Get the factory Adm authority and function factory use authority information of the user .
     *     Call W9004UserIdMaDao.searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain) .
     *   
     *   - Set to W9004UserIdMaDomain search results .
     * </pre>
     * <pre>
     * - 処理モードの判定を行います。
     *   引継値.DSC-ID、ログインユーザのDSC-ID、引継値.Function Noを元に判定します。
     * 
     * - 新規モードの場合
     *   処理は行いません。
     * 
     * - 修正モードの場合
     *   画面情報の取得を行います。
     *   
     *   - 引継値.DSC-IDを元にユーザ情報を取得します。
     *     {@link W9004UserIdMaDao#searchTmUser(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - ログイン者の地域管理者情報を取得します。
     *     {@link TtUserAuthMgtService#searchByCondition(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     *     
     *     - ログイン者の地域管理者情報が取得できた場合
     *       会社情報・工場情報の取得を行います。
     *       
     *       - {@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *       - {@link W9004UserIdMaDao#searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *     - ユーザの地域管理者権限・地域機能利用権限情報を取得します。
     *       {@link W9004UserIdMaDao#searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *     - ログイン者が権限付与可能な会社を取得します。
     *       {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *     - ユーザの会社管理者権限・会社機能利用権限情報を取得します。
     *       {@link W9004UserIdMaDao#searchTtUserAuthMgtByComp(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *     - ログイン者が権限付与可能な工場を取得を取得します。
     *       {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *     - ユーザの工場管理者権限・工場機能利用権限情報を取得します。
     *       {@link W9004UserIdMaDao#searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *     - ユーザの会社に代行依頼されている代行依頼元会社・機能を取得します。
     *       {@link TmAgentService#searchByCondition(TmAgentCriteriaDomain)}を呼び出します。
     *       
     *     - 検索結果を{@link W9004UserIdMaDomain}に設定します。
     *     
     * 
     * - 参照モードの場合
     * 
     *   - 引継値.DSC-IDを元にユーザ情報を取得します。
     *     {@link W9004UserIdMaDao#searchTmUser(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - ユーザの地域管理者権限・地域機能利用権限情報を取得します。
     *     {@link W9004UserIdMaDao#searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - 入力(会社権限)エリアに表示する会社を取得します。
     *     {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - ユーザの会社管理者権限・会社機能利用権限情報を取得します。
     *     {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - 入力(工場権限)エリアに表示する工場を取得します。
     *     {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *   - ユーザの工場管理者権限・工場機能利用権限情報を取得します。
     *     {@link W9004UserIdMaDao#searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *     
     *     - 検索結果を{@link W9004UserIdMaDomain}に設定します。
     *     
     * </pre>
     *
     * @param criteria Domain search criteria<br />
     * 検索条件Domain
     * @return Search Results Domain<br />
     * 検索結果Domain
     * @throws ApplicationException fails in the search process<br />
     * 検索処理に失敗した場合
     */
    public W9004UserIdMaDomain searchOnEditInit(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Check DB integrity.
     * <br />DB整合性チェックを行います。
     *
     * <pre>
     *  - Call CommonService.validateCompCd(String) with COMPANY CODE .
     * - 会社コードを引数に{@link CommonService#validateCompCd(String)}を呼び出します。
     * </pre>
     *
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param mode Processing mode<br />
     * 処理モード
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException fail to check processing<br />
     * チェック処理に失敗した場合
     */
    public boolean validateDatabaseCompCd(String compCd, String mode) throws ApplicationException;
    
    /**
     * Register / Update User Config Master, User Group Master, the User Auth Manage
     * <br />ユーザ設定原単位、ユーザ集約原単位、ユーザ利用権限管理を登録/更新
     * <pre>
     * - In the case of correction mode
     *   Lock on the selected data .
     *   Call W9004UserIdMaDao.lockByNoWaitTtUserAuthMgtByDscId(W9004UserIdMaCriteriaDomain) . [
     *   ※ If the lock can not be obtained , throw an error .
     * 
     * - Register or update process .
     *   - New mode
     *     - This is done to get the registration information .
     *       Call TmNxsCompService.searchByKey(TmNxsCompCriteriaDomain) .
     * 
     *     - Get the presence or absence of user information ( number ) .
     *       - Get the number is 0 reviews
     *         - Regist User Config Master.
     *           Call TmUserConfService.create(TmUserConfDomain) .
     *   
     *         - Registration of the User Group Master.
     *           Call TmUserService.create(TmUserDomain) .
     *   
     *       - Get the number of cases of 1 or more
     *         - Update of the User Config Master.
     *           Call W9004UserIdMaDao.updateTmUser(W9004UserIdMaDomain, W9004UserIdMaCriteriaDomain).
     *    
     *         - Update of the User Group Master.
     *           Call TmUserService.updateByCondition(TmUserDomain, TmUserCriteriaDomain).
     *    
     * - Update mode
     *   - Update of the User Group Master.
     *     Call TmUserService.updateByCondition(TmUserDomain, TmUserCriteriaDomain).
     * 
     * - If the permission area is displayed
     *   - Register or remove the authority of the ability to have a reference and update rights and privileges of one .
     *     ※ Run repeat the processing authority , local authority , corporate authority , the authority of the factory worth .
     *     Use the VALUE which is determined by each treatment patterns for the parameters .
     *     For details, see the screen definition document .
     * 
     *     - Get the presence or absence of authority ( number ) .
     *       Call (TtUserAuthMgtCriteriaDomain) TtUserAuthMgtService.searchCount.
     * 
     *     - Make the decision of the registration and deletion check the target item (ON / OFF), the acquisition number mentioned above .
     *       ※ Call TtUserAuthMgtService.create(TtUserAuthMgtDomain)  at the time of registration.
     *       Call TtUserAuthMgtService.lockByKeyNoWait(TtUserAuthMgtCriteriaDomain)  in the case of the lock .
     *       Call TtUserAuthMgtService.deleteByCondition(TtUserAuthMgtCriteriaDomain) in the case of the deletion .
     * 
     *   - Update of the User Config Master.
     *     Call TmUserConfService.updateByCondition(TmUserConfDomain, TmUserConfCriteriaDomain).
     * </pre>
     * <pre>
     * - 修正モードの場合
     *   選択データのロックを行います。
     *   {@link W9004UserIdMaDao#lockByNoWaitTtUserAuthMgtByDscId(W9004UserIdMaCriteriaDomain)}を呼び出します。[
     *   ※ロックが取得できなかった場合、エラーをThrowします。
     *   
     * - 登録・更新処理を行います。
     *   
     *   - 新規モードの場合
     *     
     *     - 登録情報の取得を行います。
     *       {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼び出します。
     *       
     *     - ユーザ情報の有無(件数)を取得します。
     *       
     *       - 取得件数が0件の場合
     *       
     *         - ユーザ設定原単位の登録を行います。
     *           {@link TmUserConfService#create(TmUserConfDomain)}を呼び出します。
     *         
     *         - ユーザ集約原単位の登録を行います。
     *           {@link TmUserService#create(TmUserDomain)}を呼び出します。
     *           
     *       - 取得件数が1件以上の場合
     *         
     *         - ユーザ設定原単位の更新を行います。
     *           {@link W9004UserIdMaDao#updateTmUser(W9004UserIdMaDomain, W9004UserIdMaCriteriaDomain)}を呼び出します。
     *       
     *         - ユーザ集約原単位の更新を行います。
     *           {@link TmUserService#updateByCondition(TmUserDomain, TmUserCriteriaDomain)}を呼び出します。
     *       
     *   - 更新モードの場合
     *     
     *     - ユーザ集約原単位の更新を行います。
     *       {@link TmUserService#updateByCondition(TmUserDomain, TmUserCriteriaDomain)}を呼び出します。
     *     
     *   - 権限エリアが表示されている場合
     *     
     *     - 1種類の権限と参照・更新権限とを持つ機能の権限の登録・削除を行います。
     *       ※権限、地域権限、会社権限、工場権限 分の処理を繰り返し実行します。
     *         パラメータについても各処理パターンにより定められた値を使用します。
     *         詳細は画面定義書を参照。
     *       
     *       - 権限の有無(件数)を取得します。
     *         {@link TtUserAuthMgtService#searchCount(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     *         
     *       - 対象項目のチェック(ON/OFF)、上記の取得件数により登録・削除の判定を行います。
     *         ※登録の際には{@link TtUserAuthMgtService#create(TtUserAuthMgtDomain)}を実行します。。
     *           ロックの際には{@link TtUserAuthMgtService#lockByKeyNoWait(TtUserAuthMgtCriteriaDomain)}を実行します。
     *           削除の際には{@link TtUserAuthMgtService#deleteByCondition(TtUserAuthMgtCriteriaDomain)}を実行します。。
     *         
     *     - ユーザ設定原単位の更新を行います。
     *       {@link TmUserConfService#updateByCondition(TmUserConfDomain, TmUserConfCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Domain search criteria<br />
     * 検索条件Domain
     * @throws ApplicationException If it fails to process the registration, update, search<br />
     * 登録・更新・検索 の処理に失敗した場合
     */
    public void transactOnEditRegister(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get search data.
     * <br />検索データの取得を行います。
     * <pre>
     * - Search
     *   Get the same data as the correct mode of searchOnEditInit (W9004UserIdMaCriteriaDomain)
     * </pre>
     * <pre>
     * - 再検索
     *   {@link #searchOnEditInit(W9004UserIdMaCriteriaDomain)}の修正モード時と同じ取得データ
     * </pre>
     * 
     * @param criteria Search, registration, update, and delete conditions Domain<br />
     * 検索・登録・更新・削除条件Domain
     * @return Domain result<br />
     * 結果Domain
     * @throws ApplicationException fails to process the search, registration, update and delete<br />
     * 検索・登録・更新・削除 の処理に失敗した場合
     */
    public W9004UserIdMaDomain searchOnEditRegister(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Check authority.
     * <br />権限チェックを行います。
     * <pre>
     * - check consistency.
     *   Return the NG (false) if there is a difference in the display COMPANY CODE responsibility COMPANY CODE.
     *   
     * - Check existence.
     *   Call TtUserAuthMgtService.searchByCondition(TtUserAuthMgtCriteriaDomain).
     * </pre>
     * <pre>
     * - 整合性チェックを行います。
     *   責任会社コードと表示会社コードに差異があればNG(false)を返却します。
     *   
     * - 存在チェックを行います。
     *   {@link TtUserAuthMgtService#searchByCondition(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search domain<br />
     * 検索ドメイン
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException Check result<br />
     * 権限チェックに失敗した場合
     */
    public boolean validateDatabaseTmMenuUseAuthCnfOnEditRefer(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;

    
    /**
     * Get result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Get the region Adm's login information.
     *   Call TtUserAuthMgtService.searchByCondition(TtUserAuthMgtCriteriaDomain).
     *   
     * - If the area Adm's login information can be acquired
     *   - Get the company of all.
     *     Call TmNxsCompService.searchByCondition(TmNxsCompCriteriaDomain) .
     *     
     *   - Get the factory of all.
     *     Call W9004UserIdMaDao.searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain) .
     *     
     * - Login who will get the authorization company.
     *   Call W9004UserIdMaDao.searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain).
     *   
     * - Login who will get the authorization can factory.
     *   Call w9004UserIdMaDao.searchTtUserAuthMgt(criteria).
     *   
     * - Configure screen items (header) in the case of correction mode-see mode.
     * </pre>
     * <pre>
     * - ログイン者の地域管理者情報を取得します。
     *   {@link TtUserAuthMgtService#searchByCondition(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     *   
     * - ログイン者の地域管理者情報が取得できた場合
     *   
     *   - 全ての会社を取得します。
     *     {@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *     
     *   - 全ての工場を取得します。
     *     {@link W9004UserIdMaDao#searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *   
     * - ログイン者が権限付与可能な会社を取得します。
     *   {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     * 
     * - ログイン者が権限付与可能な工場を取得します。
     *   {@link W9004UserIdMaDao#searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain)}を呼び出します。
     *   
     * - 修正モード・参照モードの場合には画面項目(ヘッダ)の設定を行います。
     * </pre>
     * 
     * @param criteria Domain search criteria<br />
     * 検索条件Domain
     * @return Search Results Domain<br />
     * 検索結果Domain
     * @throws ApplicationException If it fails to search<br />
     * 検索に失敗した場合
     */
    public W9004UserIdMaDomain searchOnEditRefer(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
}
