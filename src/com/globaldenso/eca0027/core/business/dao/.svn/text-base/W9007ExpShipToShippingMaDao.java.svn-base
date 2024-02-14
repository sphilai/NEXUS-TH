/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;


/**
 * DAO interface of Exp Ship To Shipping MA.
 * <br />Exp Ship To Shipping MAのDAOインタフェースです。
 * <pre>
 * bean id: w9007ExpShipToShippingMaDao
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9007ExpShipToShippingMaDao {

    
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
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search number<br />
     * 検索件数
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Search of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     *     - PLANT CODE corresponds to the logged-in user authority has
     * 
     *  - Sort the search results
     *      Sorted in the order below.
     *      - Author / UPDATE NAME (ascending)
     *  
     * - Return of the search results
     *     Return a list of W9007ExpShipToShippingMaItemDomain search results.
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
     *     検索結果を{@link W9007ExpShipToShippingMaItemDomain}のリストで返却します。
     * </pre>
     * 
     *
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9007ExpShipToShippingMaItemDomain> searchForPagingTmExpShipToShipping(W9007ExpShipToShippingMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the lock data.
     * <br />ロックデータを取得します。
     * <pre>
     * - Rock of the target data
     *     Get the data that satisfies all the following conditions.
     *     - Corresponds to the conditions indicated by the screen
     *     - Are included in the specified page
     * 
     * - Return of the search results
     *     Return a list of W9007ExpShipToShippingMaDomain search results.
     * </pre>
     * <pre>
     * - 対象データのロック
     *     下記の条件をすべて満たすデータ取得します。
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     
     * - 検索結果の返却
     *     検索結果を{@link W9007ExpShipToShippingMaDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Lock data list<br />
     * ロックデータリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9007ExpShipToShippingMaItemDomain> lockByNoWaitTmInvTplShipTo(W9007ExpShipToShippingMaCriteriaDomain criteria)
        throws ApplicationException;
    
}
