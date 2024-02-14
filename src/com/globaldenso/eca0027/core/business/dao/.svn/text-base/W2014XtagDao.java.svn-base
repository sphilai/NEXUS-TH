/*
 * Project : NEXUS_EXPORT
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;

/**
 *    This is an interface of X Palletize DAO.
 * <br />まとめパレタイズDAOのインタフェースです。
 * <pre>
 * bean id: w2014XtagDao
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9618 $
 */
public interface W2014XtagDao {

    /**
     *    The hard delete of the X Palletize Work is carried out.
     * <br />まとめパレタイズワークを物理削除します。
     * <pre>
     * The hard delete of - X Palletize Work
     *       To an argument, sql id:W2014Xtag.DeleteTwXpltz is performed for pltz.
     *
     * - Return of the search number
     *
     * - まとめパレタイズワークの物理削除
     *     pltzを引数に、sql id:W2014Xtag.DeleteTwXpltzを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param pltzList The list of Palletize search-condition domains<br />パレタイズ検索条件ドメインのリスト
     * @return Delete number<br />削除件数
     * @throws ApplicationException When a X Palletize Work cannot be referred to<br />まとめパレタイズワークが参照できない場合
     */
    public int deleteTwXpltz(List<? extends W2014PltzDomain> pltzList)
        throws ApplicationException;
    
    /**
     *    It acquires, after locking a Palletize.
     * <br />パレタイズをロック後に取得します。
     * <pre>
     * - Lock of a Palletize
     *       To an argument, sql id:W2014Xtag.LockTtPltz is performed for pltzDomainList.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2014PltzDomain}.
     *
     * - パレタイズのロック
     *     pltzDomainListを引数に、sql id:W2014Xtag.LockTtPltzを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014PltzDomain}のリストで返却
     * </pre>
     * 
     * @param pltzList The list of Palletize domains<br />パレタイズドメインのリスト
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a Palletize cannot be locked<br />パレタイズがロックできない場合
     */
    public List<? extends W2014PltzDomain> lockTtPltz(List<? extends W2014PltzDomain> pltzList)
        throws ApplicationException;
    
    /**
     *    The number of a Palletize, a X Palletize Work, and a Ship-to master is acquired.(Those with an authority check)
     * <br />パレタイズ、まとめパレタイズワーク、送荷先原単位の件数を取得します。(権限チェックあり)
     * <pre>
     * - The search number acquisition of a Palletize, a X Palletize Work, and a Ship-to master
     *       To an argument, sql id:W2014Xtag.SearchCountTtpltz is performed for criteria.
     *
     * - Return of the search number
     *
     * - パレタイズ、まとめパレタイズワーク、送荷先原単位の検索件数取得
     *     criteriaを引数に、sql id:W2014Xtag.SearchCountTtpltzを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a Palletize, a X Palletize Work, and a Ship-to master cannot be referred to<br />パレタイズ、まとめパレタイズワーク、送荷先原単位が参照できない場合
     */
    public int searchCountTtpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The number of a X Palletize and a Palletize is acquired.(Those with an authority check)
     * <br />まとめパレタイズ、パレタイズの件数を取得します。(権限チェックあり)
     * <pre>
     * The search number acquisition of - X Palletize and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchCountTtXpltz is performed for criteria.
     *
     * - Return of the search number
     *
     * - まとめパレタイズ、パレタイズの検索件数取得
     *     criteriaを引数に、sql id:W2014Xtag.SearchCountTtXpltzを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public int searchCountTtXpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A Palletize, a X Palletize Work, and a Ship-to master are acquired.(Those with an authority check)
     * <br />パレタイズ、まとめパレタイズワーク、送荷先原単位を取得します。(権限チェックあり)
     * <pre>
     * - Search of a Palletize, a X Palletize Work, and a Ship-to master
     *       To an argument, sql id:W2014Xtag.SearchForPagingTtpltz is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2014PltzDomain}.
     *
     * - パレタイズ、まとめパレタイズワーク、送荷先原単位の検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchForPagingTtpltzを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014PltzDomain}のリストで返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a Palletize, a X Palletize Work, and a Ship-to master cannot be referred to<br />パレタイズ、まとめパレタイズワーク、送荷先原単位が参照できない場合
     */
    public List<? extends W2014PltzDomain> searchForPagingTtpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A X Palletize and a Palletize are acquired.(Those with an authority check)
     * <br />まとめパレタイズ、パレタイズを取得します。(権限チェックあり)
     * <pre>
     * A search of - X Palletize and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchForPagingTtXpltz is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2014XtagDomain}.
     *
     * - まとめパレタイズ、パレタイズの検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchForPagingTtXpltzを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014XtagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of X-Palletize domains<br />まとめパレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public List<? extends W2014XtagDomain> searchForPagingTtXpltz(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The number of a packing combination master (details) and a PKG Materials MA is acquired.
     * <br />包装組合せ原単位（明細）、包装材原単位の件数を取得します。
     * <pre>
     * - The search number acquisition of a packing combination master (details) and a PKG Materials MA
     *       To an argument, sql id:W2014Xtag.SearchTmPkgSetDtl is performed for criteria.
     *
     * - Return of the search number
     *
     * - 包装組合せ原単位（明細）、包装材原単位の検索件数取得
     *     criteriaを引数に、sql id:W2014Xtag.SearchTmPkgSetDtlを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Palletize search-condition domain<br />パレタイズ検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a packing combination master (details) and a PKG Materials MA cannot be referred to<br />包装組合せ原単位（明細）、包装材原単位が参照できない場合
     */
    public List<? extends W2014PltzDomain> searchTmPkgSetDtl(W2014PltzCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A RT Type is acquired a packing combination master (details) and a PKG Materials MA.
     * <br />包装組合せ原単位（明細）、包装材原単位より再利用区分取得します。
     * <pre>
     * - A search of packing combination master (details) and a PKG Materials MA.
     *       To an argument, sql id:W2014Xtag.SearchTmPkgSetDtl is performed for criteria.
     *
     * - Return of the search number
     *
     * - 包装組合せ原単位（明細）、包装材原単位の検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchTmPkgSetDtlByRtTypを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014PltzDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Palletize search-condition domain<br />パレタイズ検索条件ドメイン
     * @return The list of Palletize domains<br />検索件数
     * @throws ApplicationException When a packing combination master (details) and a PKG Materials MA cannot be referred to<br />包装組合せ原単位（明細）、包装材原単位が参照できない場合
     */
    public List<? extends W2014PltzDomain> searchTmPkgSetDtlByRtTyp(W2014PltzCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A Shipper CD is acquired from a X Palletize Work and a Palletize.
     * <br />まとめパレタイズワーク、パレタイズより荷主コードを取得します。
     * <pre>
     * A search of - X Palletize Work and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchTtPltzByTotalShipper is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2014PltzDomain}.
     *
     * - まとめパレタイズワーク、パレタイズの検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchTtPltzByTotalShipperを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014PltzDomain}のリストで返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize Work and a Palletize cannot be referred to<br />まとめパレタイズワーク、パレタイズが参照できない場合
     */
    public List<? extends W2014PltzDomain> searchTtPltzByTotalShipper(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A WEIGHT UNIT is acquired from a X Palletize Work and a Palletize.
     * <br />まとめパレタイズワーク、パレタイズより重量単位を取得します。
     * <pre>
     * A search of - X Palletize Work and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchTtPltzByWeight is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2014PltzDomain}.
     *
     * - まとめパレタイズワーク、パレタイズの検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchTtPltzByWeightを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014PltzDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Palletize search-condition domain<br />パレタイズ検索条件ドメイン
     * @return The list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize Work and a Palletize cannot be referred to<br />まとめパレタイズワーク、パレタイズが参照できない場合
     */
    public List<? extends W2014PltzDomain> searchTtPltzByWeight(W2014PltzCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A X Palletize and a Palletize are acquired.(Those with an authority check)
     * <br />まとめパレタイズ、パレタイズを取得します。(権限チェックあり)
     * <pre>
     * A search of - X Palletize and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchTtXpltzByMain is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by {@link W2014XtagDomain}.
     *
     * - まとめパレタイズ、パレタイズの検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchTtXpltzByMainを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014XtagDomain}で返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return X-Palletize domain<br />まとめパレタイズドメイン
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public W2014XtagDomain searchTtXpltzByMain(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A X Palletize Work and a Palletize are acquired.
     * <br />まとめパレタイズワーク、パレタイズを取得します。
     * <pre>
     * A search of - X Palletize Work and a Palletize
     *       To an argument, sql id:W2014Xtag.SearchTtPltzByCleate is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by {@link W2014XtagDomain}.
     *
     * - まとめパレタイズワーク、パレタイズの検索
     *     criteriaを引数に、sql id:W2014Xtag.SearchTtPltzByCleateを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2014XtagDomain}で返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of X-Palletize domains<br />まとめパレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize Work and a Palletize cannot be referred to<br />まとめパレタイズワーク、パレタイズが参照できない場合
     */
    public W2014XtagDomain searchTwXpltzByCleate(W2014XtagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    X-TAG/X-TAG of a Palletize are updated.
     * <br />パレタイズのX-TAG/まとめメインマークを更新します。
     * <pre>
     * - X-TAG/X-TAG of a Palletize are updated.
     *       sql id:W2014Xtag.UpdateTtPltzByXmainMark is performed for domain and criteriaList to an argument.
     *
     * - Return of the update number
     *
     * - パレタイズのX-TAG/まとめメインマークを更新
     *     domain、criteriaListを引数に、sql id:W2014Xtag.UpdateTtPltzByXmainMarkを実行
     *     
     * - 更新件数の返却
     * </pre>
     * 
     * @param domain Palletize domain<br />パレタイズドメイン
     * @param criteriaList The list of Palletize search-condition domains<br />パレタイズ検索条件ドメインのリスト
     * @return Update number<br />更新件数
     * @throws ApplicationException When a Palletize cannot be accessed<br />パレタイズにアクセスできない場合
     */
    public int updateTtPltzByXmainMark(W2014PltzDomain domain, List<? extends W2014PltzCriteriaDomain> criteriaList)
        throws ApplicationException;
}
