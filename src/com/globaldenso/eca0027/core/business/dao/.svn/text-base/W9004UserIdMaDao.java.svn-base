/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;


/**
 * The User ID MA DAO interface.
 * <br />User ID MA DAOインタフェースです。
 * <pre>
 * bean id: w9002AgentMaDao
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9004UserIdMaDao {

    /**
     * Get the number of data search results.
     * <br />検索結果データ件数を取得します。
     * <pre>
     * - Get the number of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     *     - PLANT CODE corresponds to the logged-in user authority has
     * 
     * - Sort the search results
     *   Sorted in the order below.
     *     - Author / UPDATE NAME (ascending)
     * 
     * - Return of the search results
     *     Return the number of search results.
     * </pre>
     * <pre>
     * - 対象データ件数の取得
     *     下記の条件をすべて満たすデータ件数を取得します。
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - 製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - 検索結果のソート
     *     下記の順にソートします。
     *     - 作成者/更新者(昇順)
     *     
     * - 検索結果の返却
     *     検索結果件数を返却します。
     * </pre>
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingTmUserId(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException;
    
    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Get the number of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     *     - PLANT CODE corresponds to the logged-in user authority has
     *  
     * - Sort the search results
     *     Sorted in the order below.
     *     - Author / UPDATE NAME (ascending)
     * 
     * - Return of the search results
     *     Return a list of W9004UserIdMaItemDomain search results.
     * </pre>
     * <pre>
     * - 対象データ件数の取得
     *     下記の条件をすべて満たすデータを取得します。
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - 製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - 検索結果のソート
     *     下記の順にソートします。
     *     - 作成者/更新者(昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W9004UserIdMaItemDomain}のリストで返却します。
     * </pre>
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaItemDomain> searchForPagingTmUserId(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException;
    
    /**
     * And lock.<br />
     * ロックします。
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Lock acquisition data<br />
     * ロック取得データ
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> lockByNoWaitTmUser(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * User Config Master, Get the user information from the User Group Master.<br />
     * ユーザ設定原単位、ユーザ集約原単位よりユーザ情報を取得します。
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domain
     * @throws ApplicationException ApplicationException
     */
    public W9004UserIdMaDomain searchTmUser(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Number of count User Data<br />
     * ユーザ設定原単位、ユーザ集約原単位よりユーザ情報の取得件数を取得します。
     *
     * @param criteria Criteria domain
     * @return Number of count user data.
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTmUser(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get all factories.<br />
     * 全ての工場を取得
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTmNxsCompByPlant(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get local and regional authority Adm function use the authority of user information.<br />
     * ユーザの地域管理者権限・地域機能利用権限情報を取得
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByArea(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the authorization possible company.<br />
     * ログイン者が権限付与可能な会社を取得
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgt(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the authorization possible company. (Reference mode)<br />
     * ログイン者が権限付与可能な会社を取得 (参照モード)
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtReferModeByCompany(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the authorization possible company. (Reference mode)<br />
     * ログイン者が権限付与可能な工場を取得 (参照モード)
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtReferModeByPlant(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 4.7.Get company Adm authority and company functions use the authority of user information<br />
     * 4.7.ユーザの会社管理者権限・会社機能利用権限情報を取得
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByComp(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 4.9.Get factory Adm authority and function factory use authority information of user.<br />
     * 4.9.ユーザの工場管理者権限・工場機能利用権限情報を取得
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Domain list results<br />
     * 検索結果Domainリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * And lock.<br />
     * ロックします。
     *
     * @param criteria Search conditions domain<br />
     * 検索条件Domain
     * @return Lock acquisition data<br />
     * ロック取得データ
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> lockByNoWaitTtUserAuthMgtByDscId(W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Type in the functional overview of the method.
     *
     * @param domain Updated Domain<br />
     * 更新Domain
     * @param criteria Domain conditions<br />
     * 条件Domain
     * @return Update Counts<br />
     * 更新件数
     * @throws ApplicationException ApplicationException
     */
    public int updateTmUser(W9004UserIdMaDomain domain, W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 
     * Get factory Adm authority and function factory use authority information of user.
     * 
     * @param criteria criteria domain
     * @return List of factory Adm authority and function factory
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByPlantAuth (W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Number of count Deleted DSC-ID<br />
     * ユーザ集約原単位より削除済みのDSC-IDの件数を取得します。
     *
     * @param criteria Criteria domain
     * @return Number of count deleted user data.
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTmUserByDscId (W9004UserIdMaCriteriaDomain criteria)
        throws ApplicationException;
}
