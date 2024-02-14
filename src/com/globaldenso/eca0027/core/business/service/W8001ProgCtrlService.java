/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * Service interface of Progress Control.
 * <br />進度管理のサービスインタフェースです。
 * <pre>
 * bean id: w8001ProgCtrlService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W8001ProgCtrlService {

    /**
     * Check correlation
     * <br />相関チェック
     * <pre>
     * - [9]: Conducted when both of TO) Issue Date is entered: and FM) Issue Date [11]
     *     Correlation check of To - Date From: functional specification common
     *     Call {@link CommonService#validateFromToDate}, to compare
     * </pre>
     * <pre>
     * - 【9】:FM) Issue Dateと【11】:TO) Issue Dateの両方が入力された場合に実施
     *       機能仕様共通：日付 From - To の相関チェック
     *       {@link CommonService#validateFromToDate}を呼び出し、比較する
     * </pre>
     * 
     * @param fmIssueDate Start date<br />開始日付
     * @param toIssueDate End date<br />
     * 終了日付
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True: Normal False: abnormal<br />
     * True:正常 False:異常
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String fmIssueDate, String toIssueDate, String dateFormat)
        throws ApplicationException;

    /**
     * Check correlation
     * <br />相関チェック
     * <pre>
     * - [31]: The implementation if both of TO) ETD has been entered: The FM) ETD [33]
     *     Correlation check of To - Date From: functional specification common
     *     Call {@link CommonService#validateFromToDate}, to compare
     * </pre>
     * <pre>
     * - 【31】:FM) ETDと【33】:TO) ETDの両方が入力された場合に実施
     *   機能仕様共通：日付 From - To の相関チェック
     *       {@link CommonService#validateFromToDate}を呼び出し、比較する
     * </pre>
     * 
     * @param fmEtd Start date<br />
     * 開始日付
     * @param toEtd End date<br />
     * 終了日付
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True: Normal False: abnormal<br />
     * True:正常 False:異常
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public boolean validateConsistencyFmEtdToEtd(String fmEtd, String toEtd, String dateFormat)
        throws ApplicationException;
    
    /**
     * Check correlation
     * <br />相関チェック
     * <pre>
     * - [35]: The implementation if both of TO) ATD is input: and FM) ATD [37]
     *   Correlation check of To - Date From: functional specification common
     *   Call {@link CommonService#validateFromToDate}, to compare
     * </pre>
     * <pre>
     * - 【35】:FM) ATDと【37】:TO) ATDの両方が入力された場合に実施
     *   機能仕様共通：日付 From - To の相関チェック
     *       {@link CommonService#validateFromToDate}を呼び出し、比較する
     * </pre>
     * 
     * @param fmAtd Start date<br />
     * 開始日付
     * @param toAtd End date<br />
     * 終了日付
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True: Normal False: abnormal<br />
     * True:正常 False:異常
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public boolean validateConsistencyFmAtdToAtd(String fmAtd, String toAtd, String dateFormat)
        throws ApplicationException;
    
    /**
     * Data fetches matching the criteria specified in the search area
     * <br />検索エリアで指定した条件に一致するデータ取得する
     * <pre>
     * (In the case of ITEM NO Search) 
     *   - Get ※ ITEM NO when searching for data retrieval number
     *     Call W8001ProgCtrlDao#searchCountTtPltzByItemNo(W8001ProgCtrlCriteriaDomain) and get the number
     *   - << Display will focus on data with data acquisition authority of paging processing >> ITEM NO when searching
     *     Call W8001ProgCtrlDao#searchForPagingTtPltzByItemNo(W8001ProgCtrlCriteriaDomain) and get the data
     *
     * (In the case of a customer PO search)
     *   - Get ※ Customers PO when searching for data retrieval number
     *     Call W8001ProgCtrlDao#searchCountTtPltzByPoNo(W8001ProgCtrlCriteriaDomain) and get the number
     *   - << Display will focus on data with data acquisition authority of paging processing >> customer PO when searching
     *     Call W8001ProgCtrlDao#searchForPagingTtPltzByPoNo(W8001ProgCtrlCriteriaDomain) and get the data
     * </pre>
     * <pre>
     * (品目番号検索の場合)
     * - 検索データ件数の取得 ※品目番号検索時
     *     {@link W8001ProgCtrlDao#searchCountTtPltzByItemNo(W8001ProgCtrlCriteriaDomain)}を呼び出し、件数を取得する
     * - <<ページング処理用>>品目番号検索時のデータ取得　権限のあるデータに絞って表示
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzByItemNo(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * (得意先PO検索の場合)
     * - 検索データ件数の取得 ※得意先PO検索時
     *     {@link W8001ProgCtrlDao#searchCountTtPltzByPoNo(W8001ProgCtrlCriteriaDomain)}を呼び出し、件数を取得する
     * - <<ページング処理用>>得意先PO検索時のデータ取得　権限のあるデータに絞って表示
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzByPoNo(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * </pre>
     * 
     * @param criteria W8001ProgCtrlCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingOnMainSearch(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the details of the data selected in the Progress Control Main Screan screen
     * <br />Progress Control Main Screan画面で選択したデータの詳細を取得する
     * <pre>
     * - Functional specification common: the acquisition of Units (WEIGHT)
     *   Call CommonService#searchWeightUnit, to get the data
     * 
     * - Functional specification common: the acquisition of Units (VOLUME)
     *   Call {@link CommonService#searchVolumeUnit}, to get the data
     * 
     * - And to get more information about the data that is selected in the Progress Control Main Screen screen
     *   Call {@link W8001ProgCtrlDao#searchTtPltz(W8001ProgCtrlCriteriaDomain) }, to obtain the data
     * </pre>
     * <pre>
     * - 機能仕様共通：単位の取得（重量）
     *     {@link CommonService#searchWeightUnit}を呼び出し、データを取得する
     * - 機能仕様共通：単位の取得（容積）
     *     {@link CommonService#searchVolumeUnit}を呼び出し、データを取得する
     * - Progress Control Main Screen画面で選択したデータの詳細情報を取得する
     *     {@link W8001ProgCtrlDao#searchTtPltz(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * </pre>
     * 
     * @param criteria W8001ProgCtrlCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public W8001ProgCtrlDomain searchOnDetailInit(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Get list of ITEM NO contained in the case of the mark that are displayed in the Progress Control Main Detail screen
     * <br />Progress Control Main Detail画面に表示されているケースマークに含まれる品目番号の一覧を取得
     * <pre>
     * (ITEM NO contained in manufactured parts (CIGMA))
     * - The masking the data without obtaining permission of the ITEM NO contained in the (CIGMA) made ​​parts
     *   Call W8001ProgCtrlDao#searchCountTtPltzItemByCigma(W8001ProgCtrlCriteriaDomain)  and get the data
     * 
     * (ITEM NO contained in the miscellaneous goods)
     * - The masking the data without obtaining permission of the ITEM NO contained in the miscellaneous goods
     *   Call W8001ProgCtrlDao#searchForPagingTtPltzItemByMisc(W8001ProgCtrlCriteriaDomain) and get the data
     * </pre>
     * <pre>
     * (製部品(CIGMA)に含まれる品目番号)
     * - 製部品（CIGMA）に含まれる品目番号の取得 権限のないデータをマスキング
     *     {@link W8001ProgCtrlDao#searchCountTtPltzItemByCigma(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * (非製部品に含まれる品目番号)
     * - 非製部品に含まれる品目番号の取得 権限のないデータをマスキング
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzItemByMisc(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * </pre>
     * 
     * @param criteria W8001ProgCtrlCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingOnCmlDetailInit(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Get data sorted by the sort criteria that have been selected by Item No. (Combo)
     * <br />Item No.（コンボ）にて選択されている並び替え条件により並び替えたデータを取得する
     * <pre>
     * (ITEM NO contained in manufactured parts (CIGMA))
     * - The masking the data without obtaining permission of the ITEM NO contained in the (CIGMA) made ​​parts
     *   Call W8001ProgCtrlDao#searchForPagingTtPltzItemByCigmaSort(W8001ProgCtrlCriteriaDomain)  and get the data
     * 
     * (ITEM NO contained in the miscellaneous goods)
     * - The masking the data without obtaining permission of the ITEM NO contained in the miscellaneous goods
     *   Call W8001ProgCtrlDao#searchForPagingTtPltzItemByMiscSort(W8001ProgCtrlCriteriaDomain) and get the data
     * </pre>
     * <pre>
     * (製部品(CIGMA)に含まれる品目番号)
     * - 製部品（CIGMA）に含まれる品目番号の取得 権限のないデータをマスキング
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzItemByCigmaSort(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * (非製部品に含まれる品目番号)
     * - 非製部品に含まれる品目番号の取得 権限のないデータをマスキング
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzItemByMiscSort(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * </pre>
     * 
     * @param criteria W8001ProgCtrlCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public List<? extends W8001ProgCtrlDomain> searchOnCmlDetailSort(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;    
    /**
     * Get the details of RT material contained in the case mark that is displayed on the Progress Control Detail Screen
     * <br />Progress Control Detail画面に表示されているケースマークに含まれるRT材の詳細を取得する
     * <pre>
     * - Get the search result data
     *   W8001ProgCtrlDao#searchForPagingTtPltzItem(W8001ProgCtrlCriteriaDomain) to call, and retrieve data
     * </pre>
     * <pre>
     * - 検索結果データを取得
     *     {@link W8001ProgCtrlDao#searchForPagingTtPltzItem(W8001ProgCtrlCriteriaDomain)}を呼び出し、データを取得する
     * </pre>
     * 
     * @param criteria W8001ProgCtrlCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException In the case of abnormal<br />
     * 異常の場合
     */
    public List<? extends W8001ProgCtrlPltzItemDomain> searchOnRtnInfoInit(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException;    


}
