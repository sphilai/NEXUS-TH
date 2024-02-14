/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActPltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;

/**
 * 
 * <br />DAO interface of Shipping Actuality.
 * <br />船積実績のDAOインタフェースです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12986 $
 */
public interface W7001ShippingActDao {

    /**
     * Get the number of Invoice corresponding to the search criteria.
     * <br />検索条件に該当するインボイスの件数を取得します。
     * <pre>
     * ‐ Search Invoice
     * ‐インボイスの検索
     *     For details, see searchForPagingTtInvoice.(W7001ShippingActCriteriaDomain) 
     *     詳細は{@link #searchForPagingTtInvoice(W7001ShippingActCriteriaDomain)}を参照
     * 
     * ‐ Return of the number of searches
     * ‐検索件数の返却
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If the number of the invoice can not be acquired.<br />インボイスの件数が取得できなかった場合
     */
    public int searchCountTtInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Invoice corresponding to the search criteria.
     * <br />検索条件に該当するインボイスを取得します。
     * <pre>
     * ‐Search Invoice
     *    Get the data that satisfies all the following conditions.
     *     - Shipping Confirmation is complete data exists and to Palletize table
     *     - corresponding to the conditions specified by the screen
     *     - Included in the specified page
     * 
     *  - Sort the search results
     *     Sorted in the following order.
     *      ‐ ETD(Ascending order)
     *      ‐ CARRIER COMPANY CODE(Ascending order)
     *      ‐ VESSEL(Ascending order)
     *      ‐ Invoice No(Ascending order)
     *      
     *  - Return of the search results
     *     Return a list of W7001ShippingActInvoiceDomain search results.
     * </pre>
     * 
     * <pre>
     * ‐インボイスの検索
     *     下記の条件をすべて満たすデータを取得する
     *       ‐パレタイズテーブルにデータが存在し、かつ出荷確認が完了している
     *       ‐画面から指定された条件に該当する
     *       ‐指定されたページに含まれている
     * 
     * ‐検索結果のソート
     *     下記の順にソートする
     *       ‐出発予定日（昇順）
     *       ‐運送会社コード（昇順）
     *       ‐船（昇順）
     *       ‐インボイスNo（昇順）
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Invoice<br />インボイスのリスト
     * @throws ApplicationException Can not get the Invoice.<br />インボイスが取得できない場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTtInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Get the number of Invoice corresponding to the search criteria.
     * <br />検索条件に該当するインボイスの件数を取得します。
     * <pre>
     * ‐ Search Invoice
     * ‐インボイスの検索
     *     For details, see searchForPagingTtInvoiceByNoPltz.(W7001ShippingActCriteriaDomain) 
     *     詳細は{@link #searchForPagingTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain)}を参照
     * 
     * ‐Return of the number of searches
     * ‐検索件数の返却
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If the number of the invoice can not be acquired.<br />インボイスの件数が取得できなかった場合
     */
    public int searchCountTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get an invoice corresponding to the search criteria.
     * <br />検索条件に該当するインボイスを取得します。
     * <pre>
     * ‐Search Invoice
     *    Get the data that satisfies all the following conditions.
     *     ‐No data in the table Palletize
     *     ‐corresponding to the conditions specified by the screen
     *     ‐Included in the specified page
     * ‐Sort of search results
     *    Sorted in the following order.
     *     ‐ETD(Ascending order)
     *     ‐CARRIER COMPANY CODE(Ascending order)
     *     ‐VESSEL(Ascending order)
     *     ‐Invoice No(Ascending order)
     * ‐Return of search results
     *     Return a list of W7001ShippingActInvoiceDomain search results.
     * </pre>
     * <pre>
     * ‐インボイスの検索
     *     下記の条件をすべて満たすデータを取得する
     *       ‐パレタイズテーブルにデータが存在しない
     *       ‐画面から指定された条件に該当する
     *       ‐指定されたページに含まれている
     * 
     * ‐検索結果のソート
     *     下記の順にソートする
     *       ‐出発予定日（昇順）
     *       ‐運送会社コード（昇順）
     *       ‐船（昇順）
     *       ‐インボイスNo（昇順）
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Invoice<br />インボイスのリスト
     * @throws ApplicationException Can not get the Invoice.<br />インボイスが取得できない場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the number of Shipping Actuality corresponding to the search criteria.
     * <br />検索条件に該当する船積実績の件数を取得します。
     * <pre>
     * ‐Search Invoice
     * ‐インボイスの検索
     *     For details, see searchForPagingTtShippingAct.(W7001ShippingActCriteriaDomain) 
     *     詳細は{@link #searchForPagingTtShippingAct(W7001ShippingActCriteriaDomain)}を参照
     * 
     * ‐Return of the number of searches
     * ‐検索件数の返却
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If the number of Shipping Actuality can not be acquired.<br />船積実績の件数が取得できなかった場合
     */
    public int searchCountTtShippingAct(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Shipping Actuality corresponding to the search criteria.
     * <br />検索条件に該当する船積実績を取得します。
     * <pre>
     * 
     * <pre>
     * ‐Search Shipping Actuality
     *   Get the data that satisfies all the following conditions.
     *       ‐corresponds to the conditions specified by the screen
     *       ‐Included in the specified page
     *       ‐SHIPPER CODE corresponds to the logged-in user authority has
     * ‐Sort of search results
     *    Sorted in the following order:
     *     ‐ REGISTER DATE(Ascending order)
     *     ‐SHIPPER CODE(Ascending order)
     *     ‐CONSIGNEE CODE(Ascending order)
     *     ‐SHIP TO COMPANY CODE(Ascending order)
     *     ‐TRANSPORT CODE(Ascending order)
     *     ‐CONTAINER LOOSE TYPE(Ascending order)
     *     ‐CARRIER COMPANY CODE(Ascending order)
     *     ‐VESSEL(Ascending order)
     *     ‐FREIGHT RESPONSIBLE CODE(Ascending order)
     *     ‐B/L No.(Ascending order)
     *     ‐SHIPPING ACTUALITY STATUS(Ascending order)
     *     ‐SHIPPING ACTUALITY STATUS(Ascending order)
     *     ‐B/L FILE ID(Ascending order)
     *     ‐ATD(Ascending order)
     *     ‐ETA(Ascending order)
     *     ‐NUMBER OF CONTAINER(Ascending order)
     *     ‐NUMBER OF INVOICE(Ascending order)
     * ‐Return of search results
     *    Return a list of W7001ShippingActDomain search results.
     * </pre> 
     * 
     * <pre>
     * ‐船積実績の検索
     *     下記の条件をすべて満たすデータを取得する
     *       ‐画面から指定された条件に該当する
     *       ‐指定されたページに含まれている
     *       ‐荷主コードはログインユーザが持つ権限に該当する
     * 
     * ‐検索結果のソート
     *     以下の順にソートする
     *       ‐登録日（降順）
     *       ‐荷主コード（昇順）
     *       ‐荷受人コード（昇順）
     *       ‐送荷先会社コード（昇順）
     *       ‐輸送手段コード（昇順）
     *       ‐コンテナルーズ区分（昇順）
     *       ‐運送会社コード（昇順）
     *       ‐船（昇順）
     *       ‐運賃支払いコード（昇順）
     *       ‐B/L No.（昇順）
     *       ‐船積実績ステータス（昇順）
     *       ‐船積実績ステータス（昇順）
     *       ‐B/LファイルID（昇順）
     *       ‐出発日（降順）
     *       ‐到着予定日（降順）
     *       ‐コンテナ数（昇順）
     *       ‐インボイス数（昇順）
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Shipping Actuality<br />船積実績のリスト
     * @throws ApplicationException Can not get the Shipping Actuality.<br />船積実績が取得できない場合
     */
    public List<? extends W7001ShippingActDomain> searchForPagingTtShippingAct(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the number of Shipping Actuality Invoice Work corresponding to the search criteria.
     * <br />検索条件に該当する船積実績対象インボイスワークの件数を取得します。
     * <pre>
     * ‐Search Shipping Actuality Invoice Work
     * ‐船積実績対象インボイスワークの検索
     *     For details, see searchForPagingTwShippingActInvoice.
     *     詳細は{@link W7001ShippingActDao#searchForPagingTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を参照
     * 
     * ‐Return of the number of searches
     * ‐検索件数の返却
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If not possible to take a number of Shipping Actuality Invoice Work.<br />船積実績対象インボイスワークの件数を取得できなかった場合
     */
    public int searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Shipping Actuality Invoice Work corresponding to the search criteria.
     * <br />検索条件に該当する船積実績対象インボイスワークを取得します。
     * <pre>
     * ‐Search Shipping Actuality Invoice Work
     *    Get the data that satisfies all the following conditions.
     *     ‐Corresponding to the DSC-ID specified
     *     ‐Included in the specified page
     * ‐Sort of search results
     *    Sorted in the following order:
     *     -Invoice No(Ascending order)
     *     -Invoice effective date(Ascending order)
     * 
     * ‐Return of search results
     *    Return a list of search results W7001ShippingActInvoiceDomain.
     * </pre>
     * 
     * <pre>
     * ‐船積実績対象インボイスワークの検索
     *     下記の条件をすべて満たすデータを取得する
     *       ‐指定されたDSC-IDに該当する
     *       ‐指定されたページに含まれている
     * 
     * ‐検索結果のソート
     *     以下の順にソートする
     *       -インボイスNo（昇順）
     *       -インボイス発効日（昇順）
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Shipping Actuality Invoice Work<br />船積実績対象インボイスワークのリスト
     * @throws ApplicationException Can not get the Shipping Actuality Invoice Work.<br />船積実績対象インボイスワークを取得できないかった場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Invoice corresponding to the search criteria.
     * <br />検索条件に該当するインボイスを取得します。
     * <pre>
     * ‐Search Invoice
     * ‐インボイスの検索
     *     Get the data corresponding to the DSC-ID specified.
     *     指定されたDSC-IDに該当するデータを取得する。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActInvoiceDomain search results.
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Invoice<br />インボイスのリスト
     * @throws ApplicationException Can not get the Invoice.<br />インボイスを取得できなかった場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchTtInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Palletize corresponding to the search criteria.
     * <br />検索条件に該当するパレタイズを取得します。
     * <pre>
     * ‐Search Palletize
     * ‐パレタイズの検索
     *     Get the data corresponding to the DSC-ID specified.
     *     指定されたDSC-IDに該当するデータを取得する。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of search results W7001ShippingActPltzDomain.
     *     検索結果を{@link W7001ShippingActPltzDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Palletize<br />パレタイズのリスト
     * @throws ApplicationException Can not get the Palletize.<br />パレタイズを取得できなかった場合
     */
    public List<? extends W7001ShippingActPltzDomain> searchTtPltz(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Invoice No corresponding to the search criteria.
     * <br />検索条件に該当するインボイスNoを取得します。
     * <pre>
     * ‐Acquisition of Invoice No
     * ‐インボイスNoの取得
     *     ‐Get from Shipping Actuality Receive Order the Invoice No corresponding to the Shipping Actuality No search criteria.
     *     ‐検索条件の船積実績Noに該当するインボイスNoを船積実績対象品受注情報から取得する。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActOdrDomain search results.
     *     検索結果を{@link W7001ShippingActOdrDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Shipping Actuality Receive Order<br />船積実績対象品受注情報のリスト
     * @throws ApplicationException Invoice No get failed.<br />インボイスNoの取得に失敗した場合
     */
    public List<? extends W7001ShippingActOdrDomain> searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get BRANCH corresponding to the search criteria.
     * <br />検索条件に該当する枝番を取得します。
     * <pre>
     * ‐Getting BRANCH
     * ‐枝番の取得
     *     Get from the Shipping Document BRANCH corresponding to the conditions specified by the screen.
     *     画面から指定された条件に該当する枝番を船積書類から取得します。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return in W7001ShippingActDocDomain search results.
     *     検索結果を{@link W7001ShippingActDocDomain}で返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice domain<br />インボイスドメイン
     * @throws ApplicationException Get BRANCH failed.<br />枝番の取得に失敗した場合
     */
    public W7001ShippingActDocDomain searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get FILE ID corresponding to the search criteria.
     * <br />検索条件に該当するファイルIDを取得します。
     * <pre>
     * ‐Getting FILE ID
     * ‐ファイルIDの取得
     *     Of the FILE ID that obtained from the Shipping Document to be deleted, 
     *     削除対象の船積書類から取得したファイルIDのうち、
     *     Get a FILE ID that is not tied in the Shipping Document.
     *     船積書類で紐付けられていないファイルIDを取得します。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActDocDomain search results.
     *     検索結果を{@link W7001ShippingActDocDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice list of domain<br />インボイスドメインのリスト
     * @throws ApplicationException FILE ID get failed.<br />ファイルIDの取得に失敗した場合
     */
    public List<? extends W7001ShippingActDocDomain> searchTtShippingDocumentByFileId(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the number of SHIPPER CODE corresponding to the search criteria.
     * <br />検索条件に該当する荷主コードの件数を取得します。
     * <pre>
     * ‐SHIPPER CODE search
     * ‐荷主コード検索
     *     Get from the Shipping Document SHIPPER CODE corresponding to the search criteria.
     *     検索条件に該当する荷主コードを船積書類から取得します。
     * ‐Return of the number of searches
     * ‐検索件数の返却
     *     Return in the search W7001ShippingActInvoiceDomain number.
     *     検索件数を{@link W7001ShippingActInvoiceDomain}で返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice domain<br />インボイスドメイン
     * @throws ApplicationException The number of SHIPPER CODE get failed.<br />荷主コードの件数取得に失敗した場合
     */
    public W7001ShippingActInvoiceDomain searchCountTtShippingDocumentByShipper(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the NUMBER OF CONTAINER corresponding to the search criteria.
     * <br />検索条件に該当するコンテナ数を取得します。
     * <pre>
     * 
     * ‐No container search
     * ‐コンテナNo検索
     *     Get Shipping Actuality Invoice Work, Palletize, 
     *     検索条件に該当するコンテナNoを
     *     Shipping Confirmation from the container No corresponding to the search criteria. 
     *     船積実績対象インボイスワーク、パレタイズ、出荷確認から取得します。
     * 
     * ‐No container search
     * ‐検索件数の返却
     *     Return in the search W7001ShippingActPltzDomain number.
     *     検索件数を{@link W7001ShippingActPltzDomain}で返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Palletize domain<br />パレタイズドメイン
     * @throws ApplicationException NUMBER OF CONTAINER get failed.<br />コンテナ数の取得に失敗した場合
     */
    public W7001ShippingActPltzDomain searchTtShippingFirm(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the order information corresponding to the search condition.
     * <br />検索条件に該当する受注情報を取得します。
     * <pre>
     * ‐Getting order information
     *    Get it by joining the tables the following order information corresponding to the search criteria.
     *     ‐Shipping Actuality Invoice Work
     *     ‐Palletize
     *     ‐Shipping Confirmation
     *     ‐Palletize Item
     *     ‐Palletize Item Receive Order
     *     ‐Export Receive Order
     *     
     * ‐Return of search results
     *    Return a list of W7001ShippingActInvoiceDomain search results.
     * </pre>
     * 
     * <pre>
     * ‐受注情報の取得
     *     検索条件に該当する受注情報を下記のテーブルを結合して取得します。
     *       ‐船積実績対象インボイスワーク
     *       ‐パレタイズ
     *       ‐出荷確認
     *       ‐パレタイズ対象品
     *       ‐パレタイズ対象品受注情報
     *       ‐輸出受注
     *     
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice domain<br />インボイスドメイン
     * @throws ApplicationException Order information get failed.<br />受注情報の取得に失敗した場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Get the Shipping Actuality Invoice Work corresponding to the search criteria.
     * <br />検索条件に該当する船積実績対象インボイスワークを取得します。
     * <pre>
     * ‐Acquisition of Shipping Actuality Invoice Work
     * ‐船積実績対象インボイスワークの取得
     *     Get the data corresponding to the DSC-ID specified.
     *     指定されたDSC-IDに該当するデータを取得します。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return to W7001ShippingActInvoiceDomain search results
     *     検索結果を{@link W7001ShippingActInvoiceDomain}
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice domain<br />インボイスドメイン
     * @throws ApplicationException Shipping Actuality Invoice Work get failed.<br />船積実績対象インボイスワークの取得に失敗した場合
     */
    public W7001ShippingActInvoiceDomain searchTwShippingActInvoiceByCount(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Record a PACKAGE QUANTITY corresponding to the search criteria.
     * <br />検索条件に該当するPKG数量を計上します。
     * <pre>
     * ‐Getting PACKAGE QUANTITY
     * ‐PKG数量の取得
     *     Get a Shipping Actuality Invoice Work the number of cases mark.
     *     指定されたDSC-IDに該当する船積実績に含まれているケースマークの数を
     *     which is included in the Shipping Actuality applicable to DSC-ID specified.
     *     船積実績対象インボイスワークから取得します。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return in W7001ShippingActInvoiceDomain search results.
     *     検索結果を{@link W7001ShippingActInvoiceDomain}で返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice domain<br />インボイスドメイン
     * @throws ApplicationException PACKAGE QUANTITYPKG get failed.<br />数量の取得に失敗した場合
     */
    public W7001ShippingActInvoiceDomain searchTwShippingActInvoiceBySumPkgQty(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Lock the Invoice in the search condition and gets the data.
     * <br />検索条件でインボイスをロックし、データを取得します。
     * <pre>
     * ‐Lock Invoice
     * ‐インボイスをロック
     *     Lock the Invoice corresponding to the search criteria.
     *     検索条件に該当するインボイスをロックします。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActInvoiceDomain search results.
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice list of domain<br />インボイスドメインのリスト
     * @throws ApplicationException Can not obtain a lock.<br />ロックを取得できない場合
     */
    public List<? extends W7001ShippingActInvoiceDomain> lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Lock the Shipping Actuality in the search condition and gets the data.
     * <br />検索条件で船積実績をロックし、データを取得します。
     * <pre>
     * 
     * ‐Lock Shipping Actuality
     * ‐船積実績をロック
     *     Lock the Shipping Actuality corresponding to the search criteria.
     *     検索条件に該当する船積実績をロックします。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of the cord W7001ShippingActDomain result.
     *     検索結果を{@link W7001ShippingActDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Shipping Actuality domain<br />船積実績ドメインのリスト
     * @throws ApplicationException Can not obtain a lock.<br />ロックを取得できない場合
     */
    public List<? extends W7001ShippingActDomain> lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Lock the Shipping Actuality Receive Order in the search condition and gets the data.
     * <br />検索条件で船積実績対象品受注情報をロックし、データを取得します。
     * <pre>
     * ‐ Lock Shipping Actuality Receive Order
     * ‐船積実績対象品受注情報をロック
     *     Lock the Shipping Actuality Receive Order corresponding to the search criteria.
     *     検索条件に該当する船積実績対象品受注情報をロックします。
     *     
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActOdrDomain search results.
     *     検索結果を{@link W7001ShippingActOdrDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return List of Shipping Actuality Receive Order domain<br />船積実績対象品受注情報ドメインのリスト
     * @throws ApplicationException Can not obtain a lock.<br />kロックを取得できない場合
     */
    public List<? extends W7001ShippingActOdrDomain> lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Lock the Shipping Document in the search condition and gets the data.
     * <br />検索条件で船積書類をロックし、データを取得します。
     * <pre>
     * ‐Lock Shipping Document
     * ‐船積書類をロック
     *      Lock the Shipping Document corresponding to the search criteria.
     *     検索条件に該当する船積書類をロックします。
     * 
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActDocDomain search results.
     *     検索結果を{@link W7001ShippingActDocDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice list of domain<br />インボイスドメインのリスト
     * @throws ApplicationException Can not obtain a lock.<br />ロックを取得できない場合
     */
    public List<? extends W7001ShippingActDocDomain> lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Register Shipping Actuality Invoice Work.
     * <br />船積実績インボイスワークの登録をします。
     * <pre>
     * ‐Registration of Shipping Actuality Invoice Work
     * ‐船積実績インボイスワークの登録
     *     Registered in the Shipping Actuality Invoice Work the registration data of the argument.
     *     引数の登録データを船積実績インボイスワークに登録します。
     * </pre>
     * 
     * @param domain Registration data domain<br />登録データドメイン
     * @throws ApplicationException Can not obtain a lock.<br />ロックを取得できない場合
     */
    public void createTwShippingActInvoice(TwShippingActInvoiceDomain domain)
        throws ApplicationException;

    /**
     * Palletize status check
     * <br />パレタイズステータスチェック。
     *
     * <pre>
     * Examine all of the CML status of under the invoice, Error if there is a following palletize status.
     * Customs custom timing type A: there are CML other than 90.
     * Otherwise: there are CML Not 80.
     * インボイスの配下のパレタイズステータスを全て調べ次のものがある場合エラー。
     * 通関タイプ-A:90以外のCMLがある。
     * それ以外:80以外のCMLがある。
     * UT456 ADD
     * </pre>
     *
     * @param dscId login user DSC-ID
     * @return Invoice No. list that contains the CML of status check NG
     * @throws ApplicationException business exception
     */
    public List<String> searchTtPltzByInvoice(String dscId) throws ApplicationException;
    
    /**
     * Update the CLP Group of Shipping actuality.
     * <br />船積実績のCLPGroupを更新します
     * <pre>
     * ‐Update Shipping actuality
     * ‐船積実績の更新
     *     For details, see updateTtShippingAct.(W7001ShippingActCriteriaDomain) 
     *     詳細は{@link #updateTtShippingAct(W7001ShippingActCriteriaDomain)}を参照
     * 
     * ‐Return of the number of updates
     * ‐更新件数の返却
     * </pre>
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Updates number<br />更新件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int updateTtShippingAct(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the main mark and Shipping confirmation No to be related to the Shipping Actuality No.
     * <br />船積実績Noに紐づくメインマークと出荷確認Noを取得します
     * <pre>
     * ‐Return of search results
     * ‐検索結果の返却
     *     Return a list of W7001ShippingActDocDomain search results.
     *     検索結果を{@link W7001ShippingActDocDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @return Invoice list of domain<br />インボイスドメインのリスト
     * @throws ApplicationException business exception
     */
    public List<? extends W7001ShippingActDomain> searchTtShippingActByShippingFirmNo(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the CLP Group.
     * <br />CLP Groupを取得します。
     *
     * @return CLP Group No.
     * @throws ApplicationException business exception
     */
    public String getClpGroupSeqNextValue() throws ApplicationException;
}
