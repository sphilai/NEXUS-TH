/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService;
import com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;

/**
 * Service interface of Agent MA.
 * <br />Agent MAのサービスインタフェースです。
 * <pre>
 * bean id: w9002AgentMaService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9002AgentMaService {
    
    /**
     * Check authorization(Company) .
     * <br />権限チェック(Company)を行います。
     * <pre>
     * - Make the acquisition of user authority to use.
     *   Call UserAuthService#getUserAuthList(String...) .
     * 
     * - Check authority .
     *   Call UserAuthService#hasUserAuthForComp(String, String).
     * </pre>
     * <pre>
     * - ユーザ利用権限の取得を行います。
     *     {@link UserAuthService#getUserAuthList(String...)}を呼び出します。
     *     
     * - 権限チェックを行います。
     *     {@link UserAuthService#hasUserAuthForComp(String, String)}を呼び出します。
     * </pre>
     * 
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return There is authority, false:: true without authority<br />
     * true:権限有り, false:権限無し
     * @throws ApplicationException fail to get permission<br />
     * 権限取得に失敗した場合
     */
    public boolean validateConsistencyCompAuth(String company) throws ApplicationException;

    /**
     * Get the paging processing results data.
     * <br />ページング処理用検索結果データを取得します。
     * <pre>
     * - Create search criteria domain
     *   Set the following to W9002AgentMaCriteriaDomain.
     *     - (To get the maximum number ) SCREEN ID, locale
     *     - Conditions input from the screen
     * 
     * - Get number of searches
     *   Call W9002AgentMaDao.searchCountTmAgent (W9002AgentMaCriteriaDomain) as an argument W9002AgentMaCriteriaDomain.
     *   ※ Perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Calculate the search range corresponding to the requested page
     *   Calculate the search start and end position on the basis of number of searches , the number of one page around .
     *   Set to W9002AgentMaCriteriaDomain the calculation results .
     *  
     * - The execution of the search process
     *   Call W9002AgentMaDao.searchTmAgent (W9002AgentMaCriteriaDomain) as an argument W9002AgentMaCriteriaDomain.
     *   ※ Perform a get to focus on data that is (see , update ) the company permission to enter .
     * 
     * - Return the search results list .
     * </pre>
     * 
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W9002AgentMaCriteriaDomain}に下記を設定します。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9002AgentMaCriteriaDomain}を引数に{@link W9002AgentMaDao#searchCountTmAgent(W9002AgentMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算します。
     *     計算結果を{@link W9002AgentMaCriteriaDomain}に設定します。
     * 
     * - 検索処理の実行
     *     {@link W9002AgentMaCriteriaDomain}を引数に{@link W9002AgentMaDao#searchTmAgent(W9002AgentMaCriteriaDomain)}を呼び出します。
     *     ※入力した会社権限（参照、更新）のあるデータに絞って取得を行います。
     *    
     * - 検索結果リストを返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Master Maintenance information domain list<br />
     * マスタメンテナンス情報ドメインリスト
     * @throws ApplicationException If fail to specify the search scope<br />
     * 検索範囲指定に失敗した場合
     */
    public List<? extends W9002AgentMaItemDomain> searchForPagingOnInquirySearch(W9002AgentMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * Check authority.
     * <br />権限チェックを行います。
     * <pre>
     * - Call UserAuthService.hasUserAuthForComp(String, String)  with Org Comp.
     * 
     * - Return false if without authority, true if there is authority.
     * </pre>
     * <pre>
     * - 引継値の Org Comp を引数に {@link UserAuthService#hasUserAuthForComp(String, String)}を呼び出します。
     * 
     * -  権限ありの場合 true を、権限なしの場合 false を返却します。
     * </pre>
     * 
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException do not have update authority<br />
     * 更新権限がない場合
     */
    public boolean validateConsistencyCompAuthDel(String company) throws ApplicationException;

    /**
     * Make the process of deleting the Agent Master.
     * <br />代行会社原単位の削除処理を行います。
     * <pre>
     * - Lock the data selection of Agent Master.
     *   Call TmAgentService.lockByKeyNoWait(TmAgentCriteriaDomain).
     * 
     * - Get the DSC-ID belonging to the company of the Agent Company.
     *   Call TmUserConfService#searchByCondition(TmUserConfCriteriaDomain).
     * 
     * - Lock the selection of user data use rights management.
     *   Call TtUserAuthMgtService#lockByKeyNoWait(TtUserAuthMgtCriteriaDomain).
     * 
     * - Delete the selected data of the master Agent Company.
     *   Call TmAgentService#searchByCondition(TmAgentCriteriaDomain) .
     *     If no results
     *       Same as normal processing.
     *     In the case of 1 or more results
     *       Call TmAgentService#deleteByCondition(TmAgentCriteriaDomain) .
     *       ※ In the case of 0 Listings, Delete number will be an exclusive error.
     * 
     * - Remove selected data of User Auth Manage
     *    Call TtUserAuthMgtService#deleteByCondition(TtUserAuthMgtCriteriaDomain).
     *    
     * - Return the deleted number.
     * </pre>
     * <pre>
     * - 代行会社原単位の選択データをロックします。
     *     {@link TmAgentService#lockByKeyNoWait(TmAgentCriteriaDomain)}を呼び出します。
     *     
     * - Agent Companyの会社に属するDSC-IDを取得します。
     *     {@link TmUserConfService#searchByCondition(TmUserConfCriteriaDomain)}を呼び出します。
     *     
     * - ユーザー利用権限管理の選択データをロックします。
     *     {@link TtUserAuthMgtService#lockByKeyNoWait(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     *     
     * - 代行会社マスタの選択データを削除します。
     *     {@link TmAgentService#searchByCondition(TmAgentCriteriaDomain)}を呼び出します。
     *         検索結果0件の場合
     *             正常処理と同等とします。
     *         検索結果1件以上の場合
     *             {@link TmAgentService#deleteByCondition(TmAgentCriteriaDomain)}を呼び出します。
     *                 ※削除件数が0件の場合、排他エラーとします。
     *     
     * - ユーザ利用権限管理の選択データを削除
     *     {@link TtUserAuthMgtService#deleteByCondition(TtUserAuthMgtCriteriaDomain)}を呼び出します。
     *     
     * - 削除件数を返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Delete number<br />
     * 削除件数
     * @throws ApplicationException If the data lock failure, exclusive of error<br />
     * データロック失敗、排他エラー の場合
     */
    public int transactOnInquiryDelete(W9002AgentMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * Check mode.
     * <br />モード判定を行います。
     * <pre>
     *  - Make determination of the processing mode.
     *    Presence or absence of authority UserAuthService#hasUserAuthForComp(String, String) to determine the call     
     * </pre>
     * <pre>
     * - 処理モードの判定を行います。
     *     権限の有無は {@link UserAuthService#hasUserAuthForComp(String, String)}を呼び出し判定します
     *     
     * </pre>
     * 
     * @param functionNo Function number<br />
     * 機能番号
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return Processing mode<br />
     * 処理モード
     * @throws ApplicationException failed to get permission<br />
     * 権限の取得に失敗した場合
     */
    public String validateConsistencyEditMode(String functionNo, String company) throws ApplicationException;

    /**
     * Get Abbr., The master of the Agent Company Nxs Comp Name.
     * <br />会社名の略称、代行会社マスタを取得します。
     * <pre>
     * - New mode
     *    Call TmNxsCompService # SearchByCondition the (TmNxsCompCriteriaDomain) argument to the responsibility of the COMPANY CODE's login.
     * 
     * - In the case of correction mode-see mode
     *   Call TmNxsCompService # searchByCondition(TmNxsCompCriteriaDomain) argument to the takeover VALUE Org Company.
     *   Call TmNxsCompService # searchByCondition(TmNxsCompCriteriaDomain) argument to the takeover VALUE Agent Company.
     *   Call TmAgentService # searchByCondition(TmAgentCriteriaDomain) argument takeover VALUE. Org Company, the Agent Company.
     * </pre>
     * <pre>
     * - 新規モードの場合
     *     ログイン者の責任会社コード を引数に{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *     
     * - 修正モード・参照モードの場合
     *     引継値 Org Company   を引数に{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *     引継値 Agent Company を引数に{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *     引継値 .Org Company、Agent Company を引数に{@link TmAgentService#searchByCondition(TmAgentCriteriaDomain)}を呼び出します。
     *     
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Master Maintenance information domain<br />
     * マスタメンテナンス情報ドメイン
     * @throws ApplicationException failed to get search information<br />
     * 検索情報の取得に失敗した場合
     */
    public W9002AgentMaDomain searchOnEditInit(W9002AgentMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * combination check.
     * <br />組み合わせチェック
     * <pre>
     * - Do a combination of check Original company and Agent company.
     * </pre>
     * <pre>
     * - 代行依頼元会社と代行依頼先会社の組み合わせチェックを行います。
     * </pre>
     * 
     * @param orgCompany Original company code.<br />代行依頼元会社コード
     * @param agentCompany Agent company code.<br />代行依頼先会社コード
     * @return Check OK:true, NG:false
     * @throws ApplicationException ApplicationException
     */
    public boolean validateConsistencyAgentMaPair(String orgCompany, String agentCompany) throws ApplicationException;

    /**
     * Check DB integrity .
     * <br />DB整合性チェックを行います。
     * <pre>
     * - Call CommonService#validateCompCd(String) with Agent Company  .
     * - 引継値 Agent Company を引数に{@link CommonService#validateCompCd(String)}を呼び出します。
     * <pre>
     * 
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return OK / false:: NG true check result<br />
     * チェック結果 true：OK false：NG
     * @throws ApplicationException fail to check the existence<br />
     * 存在チェックに失敗した場合
     */
    public boolean validateDatabaseCompCd(String company) throws ApplicationException;

    /**
     * Check DB integrity .
     * <br />DB整合性チェックを行います。
     * <pre>
     * - Call TmAgentService#lockByKeyNoWait(TmAgentCriteriaDomain) with Org Company and Agent Company .
     * </pre>
     * <pre>
     * - 引継値 Org Company、Agent Company を引数に{@link TmAgentService#lockByKeyNoWait(TmAgentCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param orgCompCd Original company code.
     * @param agentCompCd Agent company code.
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException fails to search<br />
     * 検索に失敗した場合
     */
    public boolean validateDatabaseTmNxsCompOnEditRegisterByConsistency(String orgCompCd, String agentCompCd)
        throws ApplicationException;

    /**
     * Make registration / update of the master Agent Company, an update of the User Auth Manage.
     * <br />代行会社マスタの登録/更新、ユーザ利用権限管理の更新 を行います。
     * <pre>
     * - New mode
     *    Call TmAgentService#Create(TmAgentDomain) for registration.
     *
     * - In the case of correction mode
     *   - The call TmUserConfService # SearchByCondition the (TmUserConfCriteriaDomain) an argument Agent Company takeover VALUE,
     *     and get the DSC-ID belonging to the company.
     *     ※ If there is an item of "N" to the flag of the takeover VALUE
     * 
     *   - Call TtUserAuthMgtService#LockByKeyNoWait(TtUserAuthMgtCriteriaDomain),
     *      Lock the target data of the User Auth Manage.
     *     ※ If there is an item of "N" to the flag of the takeover VALUE
     * 
     *   - The call TmAgentService#UpdateByCondition(TmAgentDomain, TmAgentCriteriaDomain),
     *     update process.
     * </pre>
     * <pre>
     * - 新規モードの場合
     *     {@link TmAgentService#create(TmAgentDomain)}を呼び出し登録処理を行います。
     *     
     * - 修正モードの場合
     *     - 引継値のAgent Companyを引数に{@link TmUserConfService#searchByCondition(TmUserConfCriteriaDomain)}を呼び出し、
     *       会社に属するDSC-IDを取得します。
     *       ※引継値のフラグに"N"の項目がある場合
     *     
     *     - {@link TtUserAuthMgtService#lockByKeyNoWait(TtUserAuthMgtCriteriaDomain)}を呼び出し、
     *       ユーザ利用権限管理の対象データをロックします。
     *       ※引継値のフラグに"N"の項目がある場合
     *     
     *     - {@link TmAgentService#updateByCondition(TmAgentDomain, TmAgentCriteriaDomain)}を呼び出し、
     *       更新処理を行います。
     *     
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return retCount<br />
     * 結果
     * @throws ApplicationException fails to search<br />
     * 検索に失敗した場合
     * 
     */
    public Integer createOnEditRegister(W9002AgentMaCriteriaDomain criteria) throws ApplicationException;

}
