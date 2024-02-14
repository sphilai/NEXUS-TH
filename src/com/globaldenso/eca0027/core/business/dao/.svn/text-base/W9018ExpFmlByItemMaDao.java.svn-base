/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;


/**
 * DAO interface of Export Formalities by Item MA Inquiry.
 * <br />Export Formalities by Item MA InquiryのDAOインタフェースです。
 * <pre>
 * bean id: w9018ExpFmlByItemMaDao
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public interface W9018ExpFmlByItemMaDao {

    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Search of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *  
     * - Return of the search results
     *     Return the number of results.
     * </pre>
     * <pre>
     * - 対象データの検索
     *     下記の条件をすべて満たすデータ取得します。
     *     - 画面から指定された条件に該当する
     *     
     * - 検索結果の返却
     *     検索結果の件数を返却します。
     * </pre>
     *
     * @param criteria Domain of Search conditions<br />
     * 検索条件ドメイン
     * @return Search number<br />
     * 検索件数
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Search of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     *     - PLANT CODE corresponds to the logged-in user authority has
     * 
     * - Sort the search results
     *     Sorted in the order below.
     *     - Author / UPDATE NAME (ascending)
     * 
     * - Return of the search results
     *     Return a list of W9018ExpFmlByItemMaItemDomain search results.
     * </pre>
     * <pre>
     * - 対象データの検索
     *     下記の条件をすべて満たすデータ取得します。
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - 製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - 検索結果のソート
     *     下記の順にソートします。
     *     - 作成者/更新者(昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W9018ExpFmlByItemMaItemDomain}のリストで返却します。
     * </pre>
     * 
     *
     * @param criteria Domain of Search conditions<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9018ExpFmlByItemMaItemDomain> searchForPagingTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Search of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     *     - PLANT CODE corresponds to the logged-in user authority has
     * 
     * - Sort the search results
     *     Sorted in the order below.
     *     - Author / UPDATE NAME (ascending)
     * 
     * - Return of the search results
     *     Return a list of W9018ExpFmlByItemMaItemDomain search results.
     * </pre>
     * <pre>
     * - 対象データの検索
     *     下記の条件をすべて満たすデータ取得します。
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - 製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - 検索結果のソート
     *     下記の順にソートします。
     *     - 作成者/更新者(昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W9018ExpFmlByItemMaItemDomain}のリストで返却します。
     * </pre>
     * 
     *
     * @param criteria Domain of Search conditions<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public W9018ExpFmlByItemMaDomain searchTmPkgMtrl(W9018ExpFmlByItemMaCriteriaDomain criteria)
        throws ApplicationException;
}
