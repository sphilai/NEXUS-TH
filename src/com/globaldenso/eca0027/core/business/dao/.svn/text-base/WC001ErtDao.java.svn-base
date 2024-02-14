/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;

/**
 *    This is an interface of Empty RT materials DAO.
 * <br />Empty RT materials DAOのインタフェースです。
 * <pre>
 * bean id: wC001ErtDao
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public interface WC001ErtDao {

    /**
     *    A Palletize and a Palletize Item are acquired.
     * <br />パレタイズ、パレタイズ対象品を取得します。
     * <pre>
     * - Search of a Palletize and a Palletize Item
     *       To an argument, sql id:Ert.SearchTtPltzByAuth is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WC001ErtDomain}.
     *
     * - パレタイズ、パレタイズ対象品の検索
     *     criteriaを引数に、sql id:Ert.SearchTtPltzByAuthを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WC001ErtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria ERT item search-condition domain<br />ERT品目検索条件ドメイン
     * @return ERT domain<br />ERTドメイン
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public List<? extends WC001ErtDomain> searchTtPltzByAuth(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;


    /**
     *    A CONTAINER-SORTING-KEY loading CD and a CUSTOM TIMING TYPE are acquired.
     * <br />コンテナ層別キー・ローディングコード・通関タイミング区分を取得します。
     * <pre>
     * - Export Ship To Shipping Master
     *       To an argument, sql id:Ert.SearchTmExpShipToShippingByKey is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WC001ErtDomain}.
     *
     * - 輸出送荷先出荷原単位
     *     criteriaを引数に、sql id:Ert.SearchTmExpShipToShippingByKeyを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WC001ErtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria ERT item search-condition domain<br />ERT品目検索条件ドメイン
     * @return ERT domain<br />ERTドメイン
     * @throws ApplicationException When a Palletize and a Palletize Item cannot be referred to<br />パレタイズ、パレタイズ対象品が参照できない場合
     */
    public WC001ErtDomain searchTmExpShipToShippingByKey(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     *    A PKG Material MA Item are acquired.
     * <br />包装材原単位を取得します。
     * <pre>
     * - Export Ship To Shipping Master
     *       To an argument, sql id:Ert.SearchTmPkgMtrlByKey is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WC001ErtDomain}.
     *
     * - 輸出送荷先出荷原単位
     *     criteriaを引数に、sql id:Ert.SearchTmPkgMtrlByKeyを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WC001ErtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria ERT item search-condition domain<br />ERT品目検索条件ドメイン
     * @return ERT domain<br />ERTドメイン
     * @throws ApplicationException When a PKG Material MA Item cannot be referred to<br />包装材原単位が参照できない場合
     */
    public WC001ErtDomain searchTmPkgMtrlByKey(WC001ErtCriteriaDomain criteria)
        throws ApplicationException;
}
