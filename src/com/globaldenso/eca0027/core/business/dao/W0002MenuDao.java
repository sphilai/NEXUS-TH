/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;

/**
 * DAO Interface For The Menu Screen
 * <br />メニュー画面のDAOインタフェースです。
 * <pre>
 * bean id: w0002MenuDao
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10657 $
 */
public interface W0002MenuDao {
    
    /**
     * This interface gets the information on menu.
     * <br />メニューに関する情報を取得します。
     * <pre>
     * - To Search The Information On Menu
     *         This interface gets information on menu that meets all of the following conditions.
     *            - Information on menu that corresponds to the language used by logged-in user
     *            - Information on menu that value of display mark is '1(Display)'
     * - メニュー情報の検索
     *     下記の条件をすべて満たすメニュー情報(メニュー権限を含む)を取得する
     *       - ログインユーザの言語に対応するメニュー情報
     *       - メニュー表示印が1(Display)
     * 
     * - How To Sort Of Search Results
     *         - Display order (ascending)
     * - 検索結果のソート
     *     - 表示順 (昇順)
     *
     * - How To Return Search Results
     *         Return search results in a form of list {@link W0002MenuDomain}
     * - 検索結果の返却
     *     - 検索結果を{@link W0002MenuDomain}のリストで返却する
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of menu informations<br />メニュ情報のリスト
     * @throws ApplicationException When a menu information is unacquirable<br />メニュー情報が取得できない場合
     */
    public List<? extends W0002MenuDomain> searchVmMenu(W0002MenuCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets the information about other system menu.
     * <br />他システムメニューに関する情報を取得します。
     * <pre>
     * 
     * - How To Get The Information About Other System Menu
     *     This will get information for satisfies all of following conditions.
     *       - The url matches the owner comp cd of the logged-in user
     *       - The System name matches the language of the logged-in user
     * - 他システムメニュー情報の検索
     *     下記の条件をすべて満たすデータを取得する
     *       - URLがログインユーザの責任会社と一致する
     *       - システム名称がログインユーザの言語と一致する
     *       
     * - How To Sort Of Search Results
     *         Search results are sorted in the following order:
     *         - SORT ORDER (ascending)
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 並び順 (昇順)
     *     
     * - How To Return Search Results
     *         Return search results in a form of list {@link W0002MenuDomain}
     * - 検索結果の返却
     *     検索結果を{@link W0002OtherMenuDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of other system menu information<br />サーバ情報のリスト
     * @throws ApplicationException When other system menu information is unacquirable<br />他システムメニュー情報が取得できない場合
     */
    public List<? extends W0002OtherMenuDomain> searchTmOtherSysLink(W0002OtherMenuCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets the information about other servers.
     * <br />他サーバに関する情報を取得します。
     * <pre>
     * 
     * - How To Get The Information About Servers
     *     This will get information for satisfies all of following conditions.
     *       - SERVER ID does not match the server's logged in
     *       - The Server name matches the language of the logged-in user
     * - サーバ情報の検索
     *     下記の条件をすべて満たすデータを取得する
     *       - サーバIDがログインしているサーバと一致しない
     *       - サーバ名がログインユーザの言語と一致する
     *       
     * - How To Sort Of Search Results
     *         Search results are sorted in the following order:
     *         - SORT ORDER (ascending)
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 並び順 (昇順)
     *     
     * - How To Return Search Results
     *         Return search results in a form of list {@link W0002MenuDomain}
     * - 検索結果の返却
     *     検索結果を{@link W0002ServerDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of server information<br />サーバ情報のリスト
     * @throws ApplicationException When server information is unacquirable<br />サーバ情報が取得できない場合
     */
    public List<? extends W0002ServerDomain> searchTmServer(W0002ServerCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets the information on CIGMA's nightly batch processing.
     * <br />CIGMA夜間バッチ情報を取得します。
     * <pre>
     * 
     * - To Search Records From 'CIGMA Environment Master'
     *       - The value of COMPANY CODE, is one of which was included in the specified server.
     *       - The value of ACCESSIBILITY TYPE is not '1' (Normal).
     * - CIGMA環境原単位の検索
     *     下記の条件をすべて満たすデータを取得する
     *       - 会社コードが指定されたサーバに含まれる
     *       - 利用可能区分が1(Normal)以外
     *       
     * - How To Sort Of Search Results
     *         Search results are sorted in the following order:
     *         - COMPANY CODE (ascending)
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 会社コード (昇順)
     *       
     * - How To Return Search Results
     *         Return search results in a form of list {@link W0002MenuDomain}
     * - 検索結果の返却
     *     検索結果を{@link W0002CigmaStatusDomain}のリストで返却する
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of CIGMA night-batch informations<br />CIGMA夜間バッチ情報のリスト
     * @throws ApplicationException When a CIGMA night-batch information is unacquirable<br />CIGMA夜間バッチ情報が取得できない場合
     */
    public List<? extends W0002CigmaStatusDomain> searchTmCigmaEnv(W0002CigmaStatusCriteriaDomain criteria)
        throws ApplicationException;
}
