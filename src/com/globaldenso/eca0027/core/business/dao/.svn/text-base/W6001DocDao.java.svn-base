/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.F6051CmlAtchFileDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;

/**
 * DAO interface of Documentation.
 * <br />DocumentationのDAOインタフェースです。
 * <pre>
 * bean id: W6001DocDao
 * </pre>
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public interface W6001DocDao {

    /**
     * Get the number of search data corresponding to the search criteria.
     * <br />検索条件に該当する検索データの件数を取得します。
     * <pre>
     *  - Search Search data 
     *    Get the following data corresponding to the search criteria. 
     *  - Invoice 
     *  - Master Agent 
     *  - NEXUS Company Master 
     *
     * - return of number of searches
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - 代行会社原単位
     *       - NEXUS会社原単位
     *
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException The number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public int searchCountTtInvoice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the selected data corresponding to the selected data.
     * <br />選択データに該当する選択データを取得します。
     * <pre>
     *  - Search the selected data 
     *    Obtain the following data corresponding to the search criteria. 
     *  - Palletize 
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *      
     * - The return of the results search
     * </pre>
     * <pre>
     * - 選択データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *          *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocPltzDomain
     * @throws ApplicationException  Can not get the selection data.<br />選択データが取得できない場合
     */
    public List<W6001DocPltzDomain> searchTtPltzByCreate(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * << Get the paging processing >> Invoice data.
     * <br /><<ページング処理用>>インボイスデータを取得します。
     * <pre>
     * - Search Search data 
     *    to get the following data corresponding to the search criteria. 
     *     - Invoice 
     *     - Palletize 
     *     - Master Agent 
     *     - NEXUS Company Master 
     *
     * - return of number of searches
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - パレタイズ
     *       - 代行会社原単位
     *       - NEXUS会社原単位
     *
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchForPagingTtInvoice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the number of search data corresponding to the search criteria. (If type = "A", the "container loading after customs clearance")
     * <br />検索条件に該当する検索データの件数を取得します。(タイプ="A"、「バン詰め後通関」の場合）
     * <pre>
     * - Search Search data 
     *    to get the following data corresponding to the search criteria. 
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      - Shipping Confirmation 
     *
     * - return of the number of searches
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 出荷確認
     *   
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException  If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public int searchCountTtPltzByTypA(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the search data corresponding to the search criteria. (If type = "A", the "container loading after customs clearance")
     * <br />検索条件に該当する検索データを取得します。(タイプ="A"、「バン詰め後通関」の場合）
     * <pre>
     *  - Search Search data 
     *      to obtain the following data corresponding to the search criteria. 
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      - Shipping Confirmation 
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *  - sort the search results 
     *      below are sorted in the order of 
     *      - CONTAINER SORTING KEY (Ascending) 
     *      - delay flag (descending) 
     *      - ETD (Ascending) 
     *      - NO SHIPPING CONFIRM (ascending) 
     *
     *  - return of Search Results
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 出荷確認
     *   
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - コンテナ層別キー (昇順)
     *       - 遅延フラグ (降順)
     *       - 出発予定日 (昇順)
     *       - 出荷確認NO (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return  list of {@link W6001DocPltzDomain}
     * @throws ApplicationException  If the number of search data can not be obtained. <br />検索データの件数が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypA(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the number of search data corresponding to the search criteria. (If type = "B", and "after customs clearance container loading")
     * <br />検索条件に該当する検索データの件数を取得します。(タイプ="B"、「通関後バン詰め」の場合）
     * <pre>
     *  - Search Search data 
     *      to get the following data corresponding to the search criteria.
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      - Staging Actuality 
     *
     *  - return of the number of searches
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 山作り実績
     *   
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public int searchCountTtPltzByTypB(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the search data corresponding to the search criteria. (If type = "B", and "after customs clearance container loading")
     * <br />検索条件に該当する検索データを取得します。(タイプ="B"、「通関後バン詰め」の場合）
     * <pre>
     *  - Search Search data 
     *      to obtain the following data corresponding to the search criteria. 
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      - Staging Actuality
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException.
     *
     *  - sort the search results 
     *      below are sorted in the order of 
     *      - CONTAINER SORTING KEY (Ascending) 
     *      - delay flag (descending) 
     *      - ETD (Ascending) 
     *      - STAGING Actuality NO (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 山作り実績
     *   
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - コンテナ層別キー (昇順)
     *       - 遅延フラグ (降順)
     *       - 出発予定日 (昇順)
     *       - 山作り実績NO (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return list of {@link W6001DocPltzDomain} 
     * @throws ApplicationException If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypB(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the number of search data corresponding to the search criteria. (In the case of type = "Z")
     * <br />検索条件に該当する検索データの件数を取得します。(タイプ="Z"の場合）
     * <pre>
     *  - Search Search data 
     *      to get the following data corresponding to the search criteria.
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      - Staging Instruction 
     *
     * - return of the number of searches
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 荷揃え指示
     *   
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public int searchCountTtPltzByTypZ(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the search data corresponding to the search criteria. (In the case of type = "Z")
     * <br />検索条件に該当する検索データを取得します。(タイプ="Z"の場合）
     * <pre>
     *  - Search Search data 
     *      to obtain the following data corresponding to the search criteria. 
     *      - Palletize 
     *      - Invoide Palletize Work 
     *      -  Staging Instruction
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *  - sort the search results 
     *      below are sorted in the order of 
     *      - CONTAINER SORTING KEY (Ascending) 
     *      - delay flag (descending) 
     *      - ETD (Ascending) 
     *      - STAGING Actuality NO (ascending) 
     *
     *  - return of Search Results
     * </pre>
     * <pre>
     * - 検索データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - インボイス作成対象パレタイズワーク
     *       - 荷揃え指示
     *   
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - コンテナ層別キー (昇順)
     *       - 遅延フラグ (降順)
     *       - 出発予定日 (昇順)
     *       - 山作り実績NO (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return list of {@link W6001DocPltzDomain} 
     * @throws ApplicationException If the number of search data can not be obtained.<br />検索データの件数が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    
    /**
     * Get the part number information from export procedures Part intensity corresponding to the search criteria.
     * <br />検索条件に該当する輸出手続品番原単位から品番情報を取得します。
     * <pre>
     *  - Search Part information from export procedures Part basic unit 
     *      to get the following data corresponding to the search criteria. 
     *      - Invoice Item No Work 
     *      - Export Formality Item No Master 
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, the GscmApplicationException to throw. 
     *
     *  - sort of search results
     *      are sorted in the following order. 
     *      - UNIT PRICE (Ascending) 
     *      - ITEM NO (ascending) 
     *
     * return of Search Results
     * </pre>
     * <pre>
     * - 輸出手続品番原単位から品番情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *       - 輸出手続品目番号原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 単価 (昇順)
     *       - 品目番号 (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocDomain} 
     * @throws ApplicationException If the part number information can not be obtained from the export procedures Part intensity.<br />輸出手続品番原単位から品番情報が取得できない場合
     */
    public List<? extends W6001DocPltzItemDomain> searchTmExpFormalitiItemNo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the Invoice Item No Work.
     * <br />インボイス作成対象品目番号ワークを取得します。
     * <pre>
     *  - Search Invoice Item No Work 
     *     to get the following data corresponding to the search criteria. 
     *     - Invoice Item No Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - インボイス作成対象品目番号ワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzItemDomain} 
     * @throws ApplicationException Can not get the Invoice Item No Work.<br />インボイス作成対象品目番号ワークが取得できない場合
     */
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByDetailFull(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the error information UNIT PRICE.
     * <br />単価エラー情報を取得します。
     * <pre>
     *  - Search Invoice Item No Work 
     *    to get the following data corresponding to the search criteria 
     *    - Invoice Item No Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - インボイス作成対象品目番号ワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return Number<br />件数
     * @throws ApplicationException  If UNIT PRICE error information can not be obtained.<br />単価エラー情報が取得できない場合
     */
    public int searchCountTwInvItemByUnitPrice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get Invoide Palletize Work data corresponding to the search criteria.
     * <br />検索条件に該当するインボイス作成対象パレタイズワークデータを取得します。
     * <pre>
     *  - Search Invoide Palletize Work data 
     *    to obtain the following data corresponding to the search criteria 
     *    - Invoide Palletize Work data 
     *    - NEXUS Company Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *  - Search Results sort 
     *    are sorted in the following order 
     *    - MAIN MARK (ascending) 
     *
     *  - return of Search Results
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークデータの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワークデータ
     *       - NEXUS会社原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - メインマーク (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain} 
     * @throws ApplicationException Can not get the Invoice Item No Work.<br />インボイス作成対象品目番号ワークが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByDetail(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Get more than one currency.
     * <br />複数通貨を取得します。
     * <pre>
     * - Search multiple currencies 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Item No Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 複数通貨の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return Number<br />件数
     * @throws ApplicationException Can not get the multi-currency.<br />複数通貨が取得できない場合
     */
    public int searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    // UT186 ZIP DOWNLOAD MOD START
    /**
     * Get the PDF file path to be displayed on the Viewer the PDF of Invoice No.
     * <br />インボイスNoのPDFをViewerに表示するためのPDFファイルパスを取得する
     * <pre>
     * - Search Invoice data 
     *   to obtain the following data corresponding to the search criteria 
     *   - Invoice 
     *   - Invoice Header 
     *   - Packing Header 
     *   - Services Contract Header
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - Search Results return of
     * </pre>
     * <pre>
     * - インボイスデータの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - インボイスヘッダ
     *       - パッキングヘッダ
     *       - セールスコントラクトヘッダ
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not get the PDF file path.<br />PDFファイルパスが取得できない場合
     */
//    public W6001DocInvoiceDomain searchTtInvoiceByFileManager(W6001DocCriteriaDomain criteria)
//        throws ApplicationException;

    /**
     * For download, All the file ID of invoice attached document that related to the parent invoice.
     * ダウンロード用に親インボイスに紐付く書類ファイルのIDを全て取得します。
     *
     * @param criteria search criteria domain. Set the parenat invoice key./検索条件ドメイン。親インボイスのキー情報を設定します。
     * @return invoice info domain list/インボイス情報ドメインのリスト
     * @throws ApplicationException when business exception occurd/業務例外発生時
     */
    public List<W6001DocInvoiceDomain> searchFileIdByParentInvoiceKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // UT186 ZIP DOWNLOAD MOD END

    /**
     * Check unique name under parent invoice for zip entry<br />
     * zip内でファイル名が重複しないように、親インボイスの配下に同名ファイルのアップロードがされていないかをチェックします。
     *
     * UT186 ZIP DOWNLOAD ADD
     *
     * <pre>
     * return the duplicate count.
     * 重複数を返す。
     * </pre>
     *
     * @param criteria criteria search conditions
     * @return uploaded count that same file name as the criteria.uploadFileName
     * @throws ApplicationException business exception
     */
    public int searchUploadedCountByFileName(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get an invoice of the keys will be displayed next<br />
     * 次に表示するインボイスのキーを取得します。
     *
     * ST946 MANUAL SCREEN TRANSITION ADD
     * 
     * <pre>
     * Invoices that have not been canceled are attached to the main invoice is target.
     * It is also possible to specify the invoice currently displayed.
     * In this case the next invoice of the invoice is acquired.
     * メインインボイスに紐づくキャンセルされていないインボイスが対象。
     * 現在表示中のインボイスを指定することも可能。この場合そのインボイスの次のインボイスが取得される。
     * </pre>
     *
     * @param criteria criteria search conditions
     * @return invoice of the keys will be displayed next
     * @throws ApplicationException business exception
     */
    public W6001DocInvoiceDomain searchNextInvoiceBySameParent(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Inv. Template No. Corresponding to the search criteria for FRT.
     * <br />FRT用に検索条件に該当するInv. Template No.を取得します。
     * <pre>
     * - Search Template No Inv.. 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Template Ship To Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   below are sorted in the order of 
     *   - DOC NO (ascending) 
     * 
     * - return of Search Results
     * </pre>
     * <pre>
     * - Inv. Template No.の検索
     *     検索条件に該当する下記のデータを取得する
     *       - 送荷先別インボイステンプレート原単位 
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - ドキュメント番号 (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria  search conditions<br />検索条件
     * @return list of {@link W6001DocDomain} 
     * @throws ApplicationException Can not get the Template No Inv.<br />Inv. Template No.が取得できない場合
     */
    public List<? extends W6001DocDomain> searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * Get Inv. Template No. Corresponding to the search criteria for FRT for default.
     * <br />FRT用に検索条件に該当するInv. Template No.の初期値を取得します。
     * <pre>
     * - Search Template No Inv. 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Template Ship To Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   below are sorted in the order of 
     *   - DOC NO (ascending) 
     * 
     * - return of Search Results
     * </pre>
     * <pre>
     * - Inv. Template No.の検索
     *     検索条件に該当する下記のデータを取得する
     *       - 送荷先別インボイステンプレート原単位 
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - ドキュメント番号 (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria  search conditions<br />検索条件
     * @return list of {@link W6001DocDomain} 
     * @throws ApplicationException Can not get the Template No Inv.<br />Inv. Template No.が取得できない場合
     */
    public W6001DocDomain searchTmInvTplShipToReacquisitionForDefault(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * Get the other data that corresponds to the search criteria.
     * <br />検索条件に該当するその他データを取得します。
     * <pre>
     *  - Search other data 
     *    to get the following data corresponding to the search criteria. 
     *    - Code Master 
     *    - Invoice Group Work 
     *    - Invoide Palletize Work 
     *    - Invoice Item No Work 
     *    - NEXUS Company Master 
     *    - NEXUS Ship To Master 
     *
     * ※ search results Search upper limit or 0 Listings If the limit is exceeded, to throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - その他データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - コード原単位
     *       - インボイスグループワーク
     *       - インボイス作成対象パレタイズワーク
     *       - インボイス作成対象品目番号ワーク
     *       - NEXUS会社原単位
     *       - NEXUS送荷先原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocDomain
     * @throws ApplicationException Other data get failed.<br />その他データが取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchTwInvByRegisterInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Get. Template No. Inv.
     * <br />Inv. Template No.を取得します。
     * <pre>
     * - Search Template No Inv.. 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice Group Work 
     *   - Invoice Template Ship To Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - Search return of results
     * </pre>
     * <pre>
     * - Inv. Template No.の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイスグループワーク
     *       - 送荷先別インボイステンプレート原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocDomain}
     * @throws ApplicationException Can not get the Template No Inv.<br />Inv. Template No.が取得できない場合
     */
    public List<? extends W6001DocDomain> searchTmInvTplShipTo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * Get. Template No. Inv. For Default
     * <br />Inv. Template No.のデフォルト値を取得します。
     * <pre>
     * - Search Template No Inv. 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice Group Work 
     *   - Invoice Template Ship To Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - Search return of results
     * </pre>
     * <pre>
     * - Inv. Template No.のデフォルト値の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイスグループワーク
     *       - 送荷先別インボイステンプレート原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return String
     * @throws ApplicationException Can not get the Template No Inv.<br />Inv. Template No.が取得できない場合
     */
    public W6001DocDomain searchTmInvTplShipToForDefault(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<

    /**
     * Get the FRT Consignee.
     * <br />FRT Consigneeを取得します。
     * <pre>
     * - Search FRT Consignee 
     *   to obtain the following data corresponding to the search criteria 
     *   - Invoide Palletize Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order. 
     *   - CONSIGNEE CODE (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - FRT Consigneeの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *     
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 荷受人コード (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the FRT Consignee.<br />FRT Consigneeが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByConsignee(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the FRT Shipper.
     * <br />FRT Shipperを取得します。
     * <pre>
     * - Search FRT Shipper 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoide Palletize Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *    are sorted in the following order. 
     *    - SHIPPER CODE (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - FRT Shipperの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *     
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 荷主コード (昇順)
     *
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the FRT Shipper.<br />FRT Shipperが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByShipper(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Get the initial display information corresponding to the search criteria.
     * <br />検索条件に該当する初期表示情報を取得します。
     * <pre>
     * - Search of the initial display information 
     *   to get the following data corresponding to the search criteria. 
     *   - Code Master 
     *   - Invoice
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 初期表示情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - コード原単位
     *       - インボイス
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not obtain the initial display informatio.<br />初期表示情報が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Get the initial display information.
     * <br />初期表示情報を取得します。
     * <pre>
     * - Search of the initial display information 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice 
     *   - NEXUS Company Master 
     *   - NEXUS Ship To Master 
     *   - Port Master 
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 初期表示情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - NEXUS会社原単位
     *       - NEXUS送荷先原単位
     *       - 港原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not obtain the initial display information.<br />初期表示情報が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByUploadInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Operation No.
     * <br />Operation No.を取得します。
     * <pre>
     * Sql Id:SqlMap-W6001Doc.SearchTwInvPltzByOperationNo
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return Palletize domain list obtained<br />取得したパレタイズドメインリスト
     * @throws ApplicationException Can not get the date.<br />データの取得ができない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNo (W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Invoice Palletize Work corresponding to the search criteria. (In the case of "container loading after customs clearance") if (pattern 1) Session of (W6003.C / C TYPE) = "A"
     * <br />検索条件に該当するインボイス作成対象パレタイズワークを取得します。（パターン1）　Session(W6003.C/C TYPE) = "A"　の場合　（「バン詰め後通関」の場合）
     * <pre>
     * - Search Invoice Palletize Work 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Palletize Work
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order. 
     *   - SHIPPING CONFIRM NO (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 出荷確認NO   (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the Invoide Palletize Work.<br />インボイス作成対象パレタイズワークが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain criteria)
        throws ApplicationException;


    /**
     * Get Invoide Palletize Work corresponding to the search criteria. (In the case of "after customs clearance container loading") if (pattern 2) Session of (W6003.C / C TYPE) = "B"
     * <br />検索条件に該当するインボイス作成対象パレタイズワークを取得します。（パターン2）　Session(W6003.C/C TYPE) = "B"　の場合　（「通関後バン詰め」の場合）
     * <pre>
     * - Search Invoide Palletize Work 
     *   to get the following data corresponding to the search criteria.
     *   - Invoide Palletize Work
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order 
     *    - STAGING ACTUALITY NO (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 山作り実績NO (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the Invoide Palletize Work<br />インボイス作成対象パレタイズワークが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Invoide Palletize Work corresponding to the search criteria. If (pattern 3) Session of (W6003.C / C TYPE) = "Z"
     * <br />検索条件に該当するインボイス作成対象パレタイズワークを取得します。（パターン3）　Session(W6003.C/C TYPE) = "Z"　の場合
     * <pre>
     * - Search Invoide Palletize Work 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoide Palletize Work
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order. 
     *   - STAGING INSTRUCTION NO (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 荷揃え指示NO (昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the Invoide Palletize Work.<br />インボイス作成対象パレタイズワークが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the Shipper information corresponding to the search condition.
     * <br />検索条件に該当するShipper情報を取得します。
     * <pre>
     * - Search Shipper information 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoide Palletize Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order. 
     *   - SHIPPER CODE (ascending) 
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - Shipper情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 荷主コード(昇順)
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Shipper information get failed.<br />Shipper情報が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByShipperCd(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Get the registration data of Invoice Item No Work corresponding to the search criteria.
     * <br />検索条件に該当するインボイス作成対象品目番号ワークの登録データを取得します。
     * <pre>
     * - Search of registration data of Invoice Item No Work 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoide Palletize Work 
     *   - Palletize Item 
     *   - Palletize Item Receive Order 
     *
     *  ※ If search results exceeds the search limit or the number 0 with reviews, the GscmApplicationException to throw. 
     *
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - インボイス作成対象品目番号ワークの登録データの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *       - パレタイズ対象品
     *       - パレタイズ対象品受注情報
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException If the registration data of Invoice Item No Work can not be obtained.<br />インボイス作成対象品目番号ワークの登録データが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGropingInfo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    
    /**
     * Get the items in the Invoice for grouping from the RT material PKG Materials MA.
     * <br />RT材包装材原単位からインボイスグルーピング用の項目を取得します。
     * <pre>
     * - Search of the items in the Invoice grouping for from the RT material PKG Materials MA. 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice created for Part work 
     *   - PKG Materials MA
     *
     * - return of Search Results
     * </pre>
     * <pre>
     * - RT材包装材原単位からインボイスグルーピング用の項目の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品番ワーク
     *       - 包装材原単位
     * 
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return List of {@link W6001DocPltzItemDomain}
     * @throws ApplicationException Can not get the item in the Invoice for grouping from the RT material PKG Materials MA.<br />RT材包装材原単位からインボイスグルーピング用の項目が取得できない場合
     */
    public List<? extends W6001DocPltzItemDomain> searchTmPkgMtrl(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the registration data of Invoice Group Work.
     * <br />インボイスグループワークの登録データを取得します。
     * <pre>
     * Sql id:W6001Doc.SearchTwInvPltzByGroupNo1
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return List of {@link W6001DocPltzDomain}
     * @throws ApplicationException If the registration data of Invoice Group Work can not be obtained.<br />インボイスグループワークの登録データが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGroupNo1(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the (main group of Invoice) group No.1 of Invoice created for part number work.
     * <br />インボイス作成対象品番ワークのグループNo.1（メインインボイスのまとまり）を取得します。
     * <pre>
     * Sql id : W6001Doc.SearchTwInvPltzBySearchInvoice
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return List of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the (unity of the main Invoice) group No.1 of Part Invoice created for work<br />インボイス作成対象品番ワークのグループNo.1（メインインボイスのまとまり）が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzBySearchInvoice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;


    /**
     * Get the Invoice created for part number work.
     * <br />インボイス作成対象品番ワークを取得します。
     * <pre>
     * Sql id : W6001Doc.SearchTwInvItemByGroupNo2
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return List of {@link W6001DocPltzItemDomain}
     * @throws ApplicationException  Can not get the Invoice Number is created for work. <br />インボイス作成対象品番ワークが取得できない場合
     */
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByGroupNo2(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the Invoice summary item.
     * <br />インボイスまとめ項目を取得します。
     * <pre>
     * SqlMap id : W6001Doc.SearchTwInvPltzByGroup
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return List of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not get the Invoice Summary item.<br />インボイスまとめ項目を取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGroup(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Get the information to be passed to the Web service corresponding to the search criteria.
     * <br />検索条件に該当するWebサービスに渡す情報を取得します。
     * <pre>
     * - Search of information to be passed to the Web service 
     *   to retrieve the following data corresponding to the search criteria. 
     *   - Invoice 
     *   - Palletize 
     *   - Palletize Item 
     *   - Palletize Item Receive Order 
     *   - Export Receive Order 
     *   - Invoice 
     *   - Invoice Attached 
     *   - Measure Unit Master
     * 
     *  ※ 0 reviews results or if it exceeds the maximum number of search, to throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - Webサービスに渡す情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - パレタイズ
     *       - パレタイズ対象品
     *       - パレタイズ対象品受注情報
     *       - 輸出受注
     *       - インボイス
     *       - インボイスアタッチ
     *       - 計量単位原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException If the information to be passed to the Web service can not be obtained.<br />Webサービスに渡す情報が取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttached(W6001DocCriteriaDomain criteria)
        throws ApplicationException;



    /**
     * Get information to pass to the Web service corresponding to the search condition (header part).
     * <br />検索条件に該当するWebサービスに渡す情報(ヘッダ部分）を取得します。
     * <pre>
     * - Search information to be passed to the Web service (header part) 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice 
     *   - Invoice Header 
     *   - CIGMA Environment Master 
     *   - NEXUS Company Master
     *
     * ※ If search result has exceeded the search limit or the number of 0 Listings , to throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - Webサービスに渡す情報(ヘッダ部分）の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - インボイスヘッダ
     *       - CIGMA環境原単位
     *       - NEXUS会社原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException if (header part) is unable to obtain information to be passed to the Web service.<br />Webサービスに渡す情報(ヘッダ部分）が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the (acquisition of updated source information) subtraction of Temp Stock.
     * <br />仮在庫の減算(更新元情報の取得)を取得します。
     * <pre>
     *  - Search (acquisition of updated source information) subtraction of Temp Stock 
     *    to get the following data corresponding to the search criteria. 
     *    - Palletize 
     *    - Palletize Item 
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of search results
     * </pre>
     * <pre>
     * - 仮在庫の減算(更新元情報の取得)の検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocPltzDomain
     * @throws ApplicationException Can not obtain Retrieval (update source information) subtraction of Temp Stock.<br />仮在庫の減算(更新元情報の取得)が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTtPltzByRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
        

    /**
     * Get the container No.
     * <br />コンテナNo.を取得します。
     * <pre>
     * - Search container No. 
     *   to get the following data corresponding to the search criteria 
     *   - Palletize 
     *   - Palletize Item 
     *   - Palletize Item Receive Order
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - Search Results return
     * </pre>
     * <pre>
     * - コンテナNo.の検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *       - パレタイズ対象品受注情報
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocPltzItemOdrDomain
     * @throws ApplicationException Can not get the container No.<br />コンテナNo.が取得できない場合
     */
    public List<? extends W6001DocPltzItemOdrDomain> searchTtPltzItemOdr(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
        


    /**
     * Get the (acquisition of updated source information) SHIPPED QUANTITY, shipping instructions number of times.
     * <br />出荷数量、出荷指示回数(更新元情報の取得)を取得します。
     * <pre>
     * - Search (acquisition of updated source information) SHIPPED QUANTITY, shipping instructions number of times 
     *   to get the following data corresponding to the search criteria. 
     *   - Palletize 
     *   - Palletize Item 
     *   - Palletize Item Receive Order 
     *
     * ※ search results has exceeded the search limit or the number of 0 Listings case, to throw the GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 出荷数量、出荷指示回数(更新元情報の取得)の検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *       - パレタイズ対象品受注情報
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not obtain Retrieval (update source information) SHIPPED QUANTITY, shipping instructions number of times.<br />出荷数量、出荷指示回数(更新元情報の取得)が取得できない場合
     */
    public W6001DocDomain searchTwInvByFree(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
        

    /**
     * Get the FREE item SERVER NAME.
     * <br />FREE項目名称を取得します。
     * <pre>
     * - Search FREE item SERVER NAME 
     *  to get the following data corresponding to the search criteria. 
     *   - Invoice Work 
     *   - Code Master
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - FREE項目名称の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイスワーク
     *       - コード原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria  search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not get the item FREE SERVER NAME<br />FREE項目名称が取得できない場合
     */
    public W6001DocInvoiceDomain searchTwInvoiceByRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

        
    /**
     * Get the initial display information.
     * <br />初期表示情報を取得します。
     * <pre>
     * - Search of the initial display information 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoide Palletize Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - sort the search results 
     *   are sorted in the following order. 
     *   - CONTAINER NO (ascending) 
     *  
     * - return of Search Results
     * </pre>
     * <pre>
     * - 初期表示情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果のソート
     *     下記の順にソートする
     *       - コンテナNO(昇順)
     *
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocPltzDomain}
     * @throws ApplicationException Can not obtain the initial display information.<br />初期表示情報が取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByContainerNo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Get ShipTo information corresponding to the search condition.
     * <br />検索条件に該当するShipTo情報を取得します。
     * <pre>
     * - Search ShipTo information 
     *   to get the following data corresponding to the search criteria. 
     *   - Palletize 
     *   - Palletize Item
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - ShipTo情報の検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocPltzItemDomain
     * @throws ApplicationException If information can not be obtained.<br />ShipTo情報が取得できない場合
     */
    public W6001DocPltzItemDomain searchTmExpShipToShipping(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Palletize STATUS clear and Invoice No. Palletize the table.
     * <br />パレタイズテーブルのInvoice No.のクリアとパレタイズステータスを取得します。
     * <pre>
     * - Search Palletize STATUS clear and Invoice No of Palletize table. 
     *   to get the following data corresponding to the search criteria. 
     *   - Palletize 
     *   - Palletize Item 
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of search results
     * </pre>
     * <pre>
     * - パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocPltzDomain
     * @throws ApplicationException If Palletize STATUS clear and Invoice No of Palletize table can not be obtained.<br />パレタイズテーブルのInvoice No.のクリアとパレタイズステータスが取得できない場合
     */
    // ST944 MOD result type:W6001DocPltzDomain -> List<W6001DocPltzDomain>
    public List<W6001DocPltzDomain> lockByNoWaitTtPltz(W6001DocCriteriaDomain criteria)
        throws ApplicationException;


    /**
     * Get Palletize STATUS clear and Invoice No. Palletize the table.
     * <br />パレタイズテーブルのInvoice No.のクリアとパレタイズステータスを取得します。
     * <pre>
     * - Search Palletize STATUS clear and Invoice No of Palletize table. 
     *   to get the following data corresponding to the search criteria. 
     *   - Palletize 
     *   - Palletize Item 
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of search results
     * </pre>
     * <pre>
     * - パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの検索
     *     検索条件に該当する下記のデータを取得する
     *       - パレタイズ
     *       - パレタイズ対象品
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException If Palletize STATUS clear and Invoice No of Palletize table can not be obtained<br />パレタイズテーブルのInvoice No.のクリアとパレタイズステータスが取得できない場合
     */
    // ST944 MOD result type:W6001DocPltzDomain -> List<W6001DocPltzDomain>
    public List<W6001DocInvoiceDomain> searchTtPltz(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

// Deleted because of no use.
// 使用なしのため削除。
//    /**
//     * Get the Temp Stock update-source information corresponding to the search criteria.
//     * <br />検索条件に該当する仮在庫更新元情報を取得します。
//     * <pre>
//     * - Search Temp Stock update source information 
//     *   to obtain the following data corresponding to the search criteria. 
//     *   - Palletize 
//     *   - Palletize Item
//     *
//     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
//     *
//     *
//     * - return of the search results
//     * </pre>
//     * <pre>
//     * - 仮在庫更新元情報の検索
//     *     検索条件に該当する下記のデータを取得する
//     *       - パレタイズ
//     *       - パレタイズ対象品
//     *
//     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
//     *     
//     *     
//     * - 検索結果の返却
//     * </pre>
//     * 
//     * @param criteria search conditions<br />検索条件
//     * @return W6001DocPltzDomain
//     * @throws ApplicationException If Temp Stock update the original information can not be obtained.<br />仮在庫更新元情報が取得できない場合
//     */
//    public W6001DocPltzDomain searchTtPltzByRegisterCancel(W6001DocCriteriaDomain criteria)
//        throws ApplicationException;
//    
//
//    /**
//     * Get SHIPPED QUANTITY, the number of times the shipping instruction.
//     * <br />出荷数量、出荷指示回数を取得します。
//     * <pre>
//     * - Search SHIPPED QUANTITY, of shipping instructions number of times 
//     *   to get the following data corresponding to the search criteria. 
//     *   - Palletize 
//     *   - Palletize Item 
//     *   - Palletize Item Receive Order 
//     *
//     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
//     *
//     *
//     * - return of search results
//     * </pre>
//     * <pre>
//     * - 出荷数量、出荷指示回数の検索
//     *     検索条件に該当する下記のデータを取得する
//     *       - パレタイズ
//     *       - パレタイズ対象品
//     *       - パレタイズ対象品受注情報
//     *
//     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
//     *     
//     *     
//     * - 検索結果の返却
//     * </pre>
//     * 
//     * @param criteria search conditions<br />検索条件
//     * @return W6001DocPltzItemOdrDomain
//     * @throws ApplicationException If SHIPPED QUANTITY, shipping instructions number can not be obtained.<br />出荷数量、出荷指示回数が取得できない場合
//     */
//    public W6001DocPltzItemOdrDomain searchTtPltzItemOdrByRegisterCancel(W6001DocCriteriaDomain criteria)
//        throws ApplicationException;


    /**
     * Get information to be passed to the Web service (header part).
     * <br />Webサービスに渡す情報（ヘッダ部分）を取得します。
     * <pre>
     * - Search information to be passed to the Web service (header part) 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice 
     *   - CIGMA Environment Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - Search return of results
     * </pre>
     * <pre>
     * - Webサービスに渡す情報（ヘッダ部分）の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - CIGMA環境原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException if (header part) is unable to obtain information to be passed to the Web service.<br />Webサービスに渡す情報（ヘッダ部分）が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the Cancel determination corresponding to the search criteria.
     * <br />検索条件に該当するCancel 可否判定を取得します。
     * <pre>
     * - Search Cancel determination 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice 
     *   - Palletize 
     *   - NEXUS Company Master
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - Cancel 可否判定の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - パレタイズ
     *       - NEXUS会社原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Cancel Can not get the Cancel determination.<br />可否判定が取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceByCancelInv(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the transition determination corresponding to the search criteria.
     * <br />検索条件に該当する遷移可否判定を取得します。
     * <pre>
     * - Search of transition determination 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice 
     *   - NEXUS Company Master
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 遷移可否判定の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - NEXUS会社原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException Can not get the transition determination.<br />遷移可否判定が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByNonDnGInvOrReInv(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    

    /**
     * Get the STATUS check when canceling corresponding to the search criteria.
     * <br />検索条件に該当するキャンセル時のステータスチェックを取得します。
     * <pre>
     * - Search STATUS check when canceling 
     *   to get the following data corresponding to the search criteria 
     *   - Invoice 
     *   - Palletize
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - キャンセル時のステータスチェックの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - パレタイズ
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return W6001DocInvoiceDomain
     * @throws ApplicationException if the STATUS check when canceling can not get. <br />キャンセル時のステータスチェックが取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByUploadRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get carried necessity determination of processing corresponding to the search criteria.
     * <br />検索条件に該当する処理の実施要否判断を取得します。
     * <pre>
     * - Search implementation necessity determination of processing 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Item No Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 処理の実施要否判断の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria  search conditions<br />検索条件
     * @return int
     * @throws ApplicationException If implemented necessity determination of treatment can not be obtained.<br />処理の実施要否判断が取得できない場合
     */
    public int searchTwInvItemByNecessityEnforcement(W6001DocCriteriaDomain criteria)
        throws ApplicationException;


    /**
     * Get the check CIGMA products corresponding to the search criteria if they were included.
     * <br />検索条件に該当するCIGMA品が含まれているかのチェックを取得します。
     * <pre>
     * - Search check CIGMA goods if they were included 
     *   to obtain the following data corresponding to the search criteria 
     *   - Invoide Palletize Work
     *
     * ※ If search result has exceeded the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - Search Results return
     * </pre>
     * <pre>
     * - CIGMA品が含まれているかのチェックの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象パレタイズワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria  search conditions<br />検索条件
     * @return int
     * @throws ApplicationException  If the check CIGMA products is included or can not be acquired.<br />CIGMA品が含まれているかのチェックが取得できない場合
     */
    public int searchTwInvPltzByCigmaCheck(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the number of provisional Invoice No are numbered.
     * <br />仮インボイスNoが採番されている件数を取得
     * <pre>
     * - Search Invoice Group Work 
     *   to get the following data corresponding to the search criteria/ 
     *   - Invoice Group Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - インボイスグループワークの検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイスグループワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return 件数
     * @throws ApplicationException If UNIT PRICE error information can not be obtained.<br />単価エラー情報が取得できない場合
     */
    public int searchCountTwInvByTempInvoiceNo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Clear CURRENCY CODE / CURRENCY CODE of Invoice Item No Work, the UNIT PRICE / UNIT PRICE.
     * <br />インボイス作成対象品目番号ワークのCURRENCY CODE/通貨コード、UNIT PRICE/単価をクリアします。
     * <pre>
     * - Updated with NULL blank, the UNIT PRICE / UNIT PRICE the CURRENCY CODE / CURRENCY CODE of Invoice Item No Work 
     *   in the argument criteria, sql id: run the W6001Doc.YupdateUnitPriceByTwInvItem. 
     *
     * - The return update counts
     * </pre>
     * <pre>
     * - インボイス作成対象品目番号ワークのCURRENCY CODE/通貨コードをブランク、UNIT PRICE/単価をNULLで更新
     *     criteriaを引数に、sql id:W6001Doc.UpdateUnitPriceByTwInvItemを実行
     *     
     * - 更新件数の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return Update Counts<br />更新件数
     * @throws ApplicationException Do not have access to the Invoice Item No Work.<br />インボイス作成対象品目番号ワークにアクセスできない場合
     */
    public int updateClearPriceByTwInvItem(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * This is done to acquire a lock and target data Palletize table.
     * <br />パレタイズテーブルをロック&対象データの取得を行います。
     * <pre>
     * - Lock the Palletize corresponding to the search criteria.
     * {@link W6001DocCriteriaDomain} an argument, Sql id: Run the W6001Doc.LockByNoWaitTtPltzByPltzStatus. 
     *
     * - Return to get results. 
     *  The number and Palletize STATUS.
     * </pre>
     * <pre>
     * ‐検索条件に該当するパレタイズをロックします。
     *     {@link W6001DocCriteriaDomain}を引数に、Sql id:W6001Doc.LockByNoWaitTtPltzByPltzStatusを実行します。
     * 
     * ‐取得結果を返却します。
     *     パレタイズステータスとその件数
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Palletize domain list obtained<br />取得したパレタイズドメインリスト
     * @throws ApplicationException If the lock of Palletize table could not be.<br />パレタイズテーブルのロックが出来なかった場合
     */
    public List<? extends W6001DocPltzDomain> lockByNoWaitTtPltzByPltzStatus(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Update the table Palletize.
     * <br />パレタイズテーブルを更新します。
     * <pre>
     * - Update the data of Palletize corresponding to the search criteria.
     * {@link W6001DocCriteriaDomain} an argument, Sql id: Run the W6001Doc.UpdateTtPltzByPltzStatus. 
     *  Updates 
     *    VALUE is specified in the search criteria domain: Palletize STATUS - 
     *    blank: Invoice No - 
     *    - INVOICE ISSUE DATE: null 
     *  narrowing conditions 
     *    - SHIPPER CODE 
     *    - Invoice No 
     *    - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐検索条件に該当するパレタイズのデータを更新します。
     *     {@link W6001DocCriteriaDomain}を引数に、Sql id:W6001Doc.UpdateTtPltzByPltzStatusを実行します。
     *       更新内容
     *         ‐パレタイズステータス：検索条件ドメインで指定した値
     *         ‐インボイスNo：空白
     *         ‐インボイス発行日：null
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Update Counts<br />更新件数
     * @throws ApplicationException Can not update the table Palletize. <br />パレタイズテーブルの更新ができない場合。
     */
    public int updateTtPltzByPltzStatus(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Update the Invoice table.
     * <br />インボイステーブルを更新します。
     * <pre>
     * - Update the data in the Invoice corresponding to the search criteria.
     *   W6001DocCriteriaDomain an argument, Sql id: Run the W6001Doc.UpdateTtInvoiceByKey. 
     *   Narrowing conditions 
     *    - SHIPPER CODE 
     *    - Invoice No 
     *    - INVOICE ISSUE DATE 
     *    - DELETE FLAG (optional)
     * </pre>
     * <pre>
     * ‐検索条件に該当するインボイスのデータを更新します。
     *     {@link W6001DocCriteriaDomain}を引数に、Sql id:W6001Doc.UpdateTtInvoiceByKeyを実行します。
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     *         - 削除フラグ(省略可)
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Update Counts<br />更新件数
     * @throws ApplicationException The Invoice table update failed. <br />インボイステーブルの更新ができない場合。
     */
    public int updateTtInvoiceByKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * Update the Invoice Header table over.
     * <br />インボイスヘッダーテーブルを更新します。
     * <pre>
     * - Update the data in the Invoice corresponding to the search criteria.
     * W6001DocCriteriaDomain an argument, Sql id: Run the W6001Doc.UpdateTtInvoiceHeaderByKey. 
     *  Narrowing conditions 
     *    - SHIPPER CODE 
     *    - Invoice No 
     *    - INVOICE ISSUE DATE 
     *    - DELETE FLAG (optional)
     * </pre>
     * <pre>
     * ‐検索条件に該当するインボイスのデータを更新します。
     *     {@link W6001DocCriteriaDomain}を引数に、Sql id:W6001Doc.UpdateTtInvoiceHeaderByKeyを実行します。
     *       絞込条件
     *         ‐荷主コード
     *         ‐インボイスNo
     *         ‐インボイス発行日
     *         - 削除フラグ(省略可)
     * </pre>
     * 
     * @param criteria domain search criteria<br />検索条件ドメイン
     * @return Update Counts<br />更新件数
     * @throws ApplicationException The Invoice Header table over update failed.<br />インボイスヘッダーテーブルの更新ができない場合。
     */
    public int updateTtInvoiceHeaderByKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Update invoice Item No Work.
     * <br />インボイス作成対象品番ワークテーブルを更新します。
     * <pre>
     * - Search Criteria
     *     - DSC-ID
     *     - Shipper code
     *     - Group No.first
     *     - Remove flga:'N'
     * <\pre>
     *
     * @param criteria Search criteria domain
     * @return Number of update count.
     * @throws ApplicationException ApplicationException
     */
    public int updateTwInvItemOnInvoiceDetailForClear(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get number of HS CODE Warning.
     * <br />HS CODE警告情報の件数を取得します。
     *
     * @param criteria search criteria domain
     * @return Number of HS OCDE warning.
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwInvItemBySortNo(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get number of count Group No.sec that not target remove data.
     * <br />GRP_NO_2の削除対象でないデータの件数を取得します。
     *
     * @param criteria search criteria domain
     * @return number of count Group No.sec that not remove data.
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByRemoveGrpNo2(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get Invoice Item No Work for Invoice Attached.
     * <br />インボイスアタッチに登録するデータをインボイス作成対象品番ワークから取得します。
     * 
     * @param criteria Criteria domain
     * @return Invoice Item No Work List
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByInvoiceAttached(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Invoice Item No Work for Packing Attached Item No.
     * <br />パッキングアタッチ(品番)に登録するデータをインボイス作成対象品番ワークから取得します。
     * 
     * @param criteria criteria domain
     * @return Invoice Item No Work List
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByPackingAttachedItem(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * Get information to pass to the Web service corresponding to the search condition (EDT46PR).
     * <br />検索条件に該当するWebサービスに渡す情報(EDT46PR）を取得します。
     * <pre>
     * - same searchTtInvoiceByHeaderRegister
     * </pre>
     * <pre>
     * - searchTtInvoiceByHeaderRegisterと同じ
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException if (header part) is unable to obtain information to be passed to the Web service.<br />Webサービスに渡す情報(ヘッダ部分）が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByEDT46PRRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get information to pass to the Web service corresponding to the search criteria (EDT47PR).
     * <br />検索条件に該当するWebサービスに渡す情報(EDT47PR）を取得します。
     * <pre>
     * - same searchTtInvoiceAttached
     * </pre>
     * <pre>
     * - searchTtInvoiceAttachedと同じ
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException If the information to be passed to the Web service can not be obtained.<br />Webサービスに渡す情報が取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttachedByEDT47PRRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get information to pass to the Web service corresponding to the search criteria (EDT45PR).
     * <br />検索条件に該当するWebサービスに渡す情報(EDT45PR）を取得します。
     * <pre>
     * - same searchTtInvoiceAttached
     * </pre>
     * <pre>
     * - searchTtInvoiceAttachedと同じ
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException If the information to be passed to the Web service can not be obtained.<br />Webサービスに渡す情報が取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttachedByEDT45PRRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

    // 2014/11/25 DNJP.Kawamura UT149,ST180対応 START >>>>>
    /**
     * Get currency for Invoice.
     * <br />Invoice全体の通貨を取得します。
     * <pre>
     * - Search currencies 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice Item No Work
     *
     * ※ If search results exceeds the search limit or the number 0 with reviews, throw GscmApplicationException. 
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - 通貨の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス作成対象品目番号ワーク
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return Number<br />件数
     * @throws ApplicationException Can not get the multi-currency.<br />通貨が取得できない場合
     */
    public int searchCountTwInvItemByCurrencyCheckInvoice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // 2014/11/25 DNJP.Kawamura UT149,ST180対応 END <<<<<

    /**
     * Unit conversion based on information acquisition to be set in the palletizing work<br />
     * パレタイズワークへ設定する単位換算元情報取得。
     * 
     * T959 UNIT CONVERSION ADD
     * 
     * <pre>
     * Get the information of TW_INV_PLTZ for the unit conversion.
     * Get together the results of the summary of the N/W of TW_INV_ITEM.
     * For main invoice only.
     * 単位換算を行うためパレタイズワークの情報を取得する。
     * 品目番号ワークのN/Wをサマリした結果を併せて取得する。
     * メインインボイス専用。
     * </pre>
     *
     * @param criteria search conditions<br />検索条件
     * @return list of palletize work<br />パレタイズワークのリスト
     * @throws ApplicationException business exception<br />業務例外
     */
    public List<W6001DocPltzDomain> searchTwInvPltzOnRegisterByWorkPhase(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search for creating CML attach CSV file<br />
     * CMLアタッチCSVファイルを作成するための検索。
     * 
     * UT205 CML ATTACH CSV ADD
     * 
     * @param criteria search conditions<br />検索条件
     * @return  list of CSV line unit record<br />CSV行単位レコードのリスト
     * @throws ApplicationException business exception<br />業務例外
     */
    public List<F6051CmlAtchFileDomain> searchForCreateCmlAttachCsvFile(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Override price terms and trade terms
     * <br />建値条件・契約条件の上書き。
     *
     * UT284 ADD
     *
     * @param criteria search conditions<br />検索条件
     * @throws ApplicationException business exception<br />業務例外
     */
    public void updateTwInvItemBySearchForTradeTermsRevice(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search for obtaining Packing Summary Attach Flag
     * <br />パッキングサマリ添付フラグを取得するための検索
     *
     * @param criteria search conditions<br />検索条件
     * @return  value of Packing Summary Attach Flag<br />パッキングサマリ添付フラグの値
     * @throws ApplicationException business exception<br />業務例外
     */
    public String serchPackingSummaryAtchFlg(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
}
