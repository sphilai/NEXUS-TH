/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;

/**
 * DAO interface of Progress Control.
 * <br />進度管理のDAOインタフェースです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W8001ProgCtrlDao {

    /**
     * Retrieval of data number Progress Control information. ※Item number when searching.
     * <br />進度管理情報の検索データ件数の取得 ※品目番号検索時
     * <pre>
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Number<br />件数
     * @throws ApplicationException Can not get the data<br />データを取得できない場合
     */
    public int searchCountTtPltzByItemNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Progress Control information corresponding to the search condition.
     * <br />検索条件に該当する進度管理情報を取得します。
     * <pre>
     * ‐Do the data acquisition process of ITEM NO when searching for paging processing.
     * ‐ページング処理用の品目番号検索時のデータ取得処理を行います。
     * ‐Make Limit search to data that authority.
     * ‐権限のあるデータに絞って検索を行います。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Progress Control<br />進度管理のリスト
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzByItemNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Retrieval of data number Progress Control information ※Customers PO when searching
     * <br />進度管理情報の検索データ件数の取得 ※得意先PO検索時
     * <pre>
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Number<br />件数
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public int searchCountTtPltzByPoNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Get the Progress Control information corresponding to the search condition.
     * <br />検索条件に該当する進度管理情報を取得します。
     * <pre>
     * ‐Make the data acquisition process of the customer PO number when searching for paging processing.
     * ‐ページング処理用の得意先PO番号検索時のデータ取得処理を行います。
     * ‐Make Limit search to data that authority.
     * ‐権限のあるデータに絞って検索を行います。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Progress Control<br />進度管理のリスト
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzByPoNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Make Progress Control more information acquisition in the case mark the unit corresponding to the search criteria.
     * <br />検索条件に該当するケースマーク単位での進度管理詳細情報取得します。
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Progress Control domain<br />進度管理ドメイン
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public W8001ProgCtrlDomain searchTtPltz(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Retrieval of data number Progress Control ITEM NO information.
     * <br />進度管理 品目番号情報の検索データ件数の取得 
     * <pre>
     * ‐Get the number of the information contained in manufactured parts (CIGMA).
     * ‐製部品（CIGMA）に含まれる情報の件数します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Number<br />件数
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public int searchCountTtPltzItemByCigma(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Get the Progress Control ITEM NO information corresponding to the search criteria.
     * <br />検索条件に該当する進度管理 品目番号情報を取得します。
     * <pre>
     * ‐Get the information contained in manufactured parts (CIGMA).
     * ‐製部品（CIGMA）に含まれる情報を取得します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Progress Control ITEM NO information<br />進度管理 品目番号情報
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByCigma(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Get the Progress Control ITEM NO information corresponding to the search criteria.
     * <br />検索条件に該当する進度管理 品目番号情報を取得します。
     * <pre>
     *‐ Make Sort by Item No.
     * ‐Item Noによって並び替えを行います。
     * ‐Get the information contained in manufactured parts (CIGMA).
     * ‐製部品（CIGMA）に含まれる情報を取得します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Progress Control ITEM NO information<br />進度管理 品目番号情報
     * @throws ApplicationException Can not get the data<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByCigmaSort(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Retrieval of data number Progress Control ITEM NO information.
     * <br />進度管理 品目番号情報の検索データ件数の取得 
     * <pre>
     * ‐Get the information contained in the miscellaneous goods.
     * ‐非製部品に含まれる情報を取得します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Number<br />件数
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public int searchCountTtPltzItemByMisc(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Progress Control ITEM NO information corresponding to the search criteria.
     * <br />検索条件に該当する進度管理 品目番号情報を取得します。
     * <pre>
     * ‐Get the information contained in the miscellaneous goods.
     * ‐非製部品に含まれる情報を取得します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Progress Control ITEM NO information<br />進度管理 品目番号情報のリスト
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByMisc(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the Progress Control ITEM NO information corresponding to the search criteria.
     * <br />検索条件に該当する進度管理 品目番号情報を取得します。
     * <pre>
     * ‐Make Sort by Item No.
     * ‐Item Noによって並び替えを行います。
     * ‐Get the information contained in the miscellaneous goods.
     * ‐非製部品に含まれる情報を取得します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Progress Control ITEM NO<br />情報進度管理 品目番号情報
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByMiscSort(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Retrieval of data number Progress Control RT material information.
     * <br />進度管理 RT材情報の検索データ件数の取得 
     * <pre>
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Number<br />件数
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public int searchCountTtPltzItem(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Progress Control RT material information corresponding to the search condition.
     * <br />検索条件に該当する進度管理 RT材情報を取得します。
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Progress Control RT material information<br />進度管理 RT材情報のリスト
     * @throws ApplicationException Can not get the data.<br />データを取得できない場合
     */
    public List<? extends W8001ProgCtrlPltzItemDomain> searchForPagingTtPltzItem(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
}
