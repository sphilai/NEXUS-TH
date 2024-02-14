/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementCriterionDomain;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingActOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingDocumentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingActOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingDocumentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwShippingActInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingActService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingDocumentService;
import com.globaldenso.eca0027.core.auto.business.service.TwShippingActInvoiceService;
import com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws7001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws7003RestService;
import com.globaldenso.eca0027.core.business.ws.Ws7004RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * 
 * Service interface of Shipping Actuality.
 * <br />船積実績のサービスインタフェースです。
 * <pre>
 * bean id: w7001ShiippingActService
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13994 $
 */
public interface W7001ShippingActService {

    // --- パラメータチェックメソッド validateConsistency ------------------------------------------
    
    /**
     * 
     * Check correlation of ETA and ATD.
     * <br />出発日と到着予定日の相関チェックを行います。
     * <pre>
     * - Check correlation of ETA and ATD.
     * </pre>
     * <pre>
     * ‐出発日と到着予定日の相関チェック
     * </pre>
     * 
     * @param atd ATD<br />
     * 出発日
     * @param etd ETA<br />
     * 到着予定日
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True:check OK, False:error<br />
     * 入力値にエラーがなければtrue、それ以外はfalse
     */
    public boolean validateConsistencyAtdEta(String atd, String etd, String dateFormat);
    
    /**
     * 
     * File existence check.
     * <br />ファイル存在チェックを行います。
     * <pre>
     * - File existence check.
     *   Check the specified file exists.
     * </pre>
     * <pre>
     * ‐ファイル存在チェック
     *     指定したファイルが存在するかチェックします。
     * </pre>
     * 
     * @param fileSize upload file size<br />
     * アップロードするファイルのファイルサイズ
     * @return True:file exists, false:other<br />
     * ファイルが存在していればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFileExistence(int fileSize);
        
    /**
     * 
     * File path input check.
     * <br />ファイルパス入力チェックを行います。
     * <pre>
     * - File path input check.
     *   Check the effectiveness of the file-pass.
     * </pre>
     * <pre>
     * ‐ファイルパス入力チェック
     *     アップロードされたファイルが取得できるかチェックします（ファイル名が空白かどうか）
     * </pre>
     * 
     * @param fileName FileName to be uploaded<br />
     * アップロードするファイルのファイル名 
     * @return True:file-pass OK, false:other <br />
     * ファイルが指定されていればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFilePathInput(String fileName);
    
    /**
     * 
     * File size check.
     * <br />ファイルサイズチェックを行います。
     * <pre>
     * - File size check.
     *   Check the uploaded file size (less than 5MB).
     * </pre>
     * <pre>
     * ‐ファイルサイズチェック
     *     アップロードするファイルのサイズが5MBを超えていないかチェックします。
     * </pre>
     * 
     * @param fileSize uploaded file size<br />
     * アップロードするファイルのファイルサイズ
     * @return True:file-size less than 5MB, false:other<br />
     * 5MBを超えていなかればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFileSize(int fileSize);
    
    /**
     * Do check the name of the file.
     * <br />ファイルの名前チェックを行います。
     * 
     * @param fileName file name
     * ファイルデータ
     * @return True, false and otherwise string is not contain some double byte character.<br />
     * ファイル名にダブルバイト文字が含まれなければ場合true、そうでなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFileName(String fileName)
        throws ApplicationException;
    
    /**
     * 
     * Authority check.
     * <br />権限チェックを行います。
     * <pre>
     * - Authority check
     * </pre>
     * <pre>
     * ‐権限チェック
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return True:have authorization for selected COMPANY CODE, false:other<br />
     * 指定された会社コードに対する機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException cannot check the authorization.<br />
     * 権限チェックができない場合
     */
    public boolean validateConsistencyShipperAuth(String compCd) throws ApplicationException;
    
    // --- データベースチェックメソッド validateDatabase -------------------------------------------
    /**
     * 
     * CIGMA night batch check.
     * <br />CIGMA夜間バッチ中チェックを行います
     * <pre>
     * - Search The Invoice.
     *   Set the following items to {@link TtInvoiceCriteriaDomain} and 
     *    call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *   - SHIPPER CODE domain of search condition
     *   - Invoice No in the selected row, INVOICE ISSUE DATE
     *   - CML classification: 1 (CIGMA)
     * 
     * - Check data execution determination of CIGMA.
     *   When Invoice search result 1 or more than 1, do CIGMA data check.
     *   Otherwise, true.
     * 
     * - CIGMA data check.
     *   Call {@link CommonService#searchCigmaAvailable(boolean, String)}
     * </pre>
     * <pre>
     * ‐インボイスを検索
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐検索条件ドメインの荷主コード
     *       ‐選択行のインボイスNo、インボイス発行日
     *       ‐CML区分：1（CIGMA）
     *
     * ‐CIGMAのデータチェック実施判定
     *     インボイスの検索結果が1件以上の場合、CIGMAデータチェックを行います。
     *     それ以外の場合、true
     *
     * ‐CIGMAデータチェック
     *     {@link CommonService#searchCigmaAvailable(boolean, String)}を呼出します。
     * </pre>
     * 
     * @param isShipping24hFunc 24H shipping function corresponding flag<br />
     * 24H出荷対応機能フラグ
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param dateFormat Date format (for display)<br />
     * 日付フォーマット（表示用）
     * @return null:CIGMA available, error code:other<br />
     * CIGMAが利用可能であればnull、そうでなければエラーコードを返す。
     * @throws ApplicationException then cannot determine the availability of CIGMA.<br />
     * CIGMAの利用可否を判定できない場合
     */
    public String validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String shipperCd, String invoiceNo, Date invoiceIssueDt, String dateFormat)
        throws ApplicationException;

    /**
     * 
     * Carrier existence check.
     * <br />Carrier存在チェックを行います。
     * <pre>
     * - Carrier existence check.
     *   Call {@link CommonService#validateCarrier(String)}
     * </pre>
     * <pre>
     * ‐ Carrier存在チェック
     *     {@link CommonService#validateCarrier(String)}を呼出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return true:COMPANY CODE exists on NEXUS Company Master as transportation company, false:other <br />
     * 会社コードが運送会社としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException when COMPANY CODE not exists on NEXUS Company Master as shipper<br />
     * 会社コードが荷主としてNEXUS会社原単位に定義されていない場合
     */
    public boolean validateDatabaseCarrier(String compCd) throws ApplicationException;
    
    /**
     * 
     * Shipper existence check.
     * <br />Shipper存在チェックを行います。
     * <pre>
     * - Shipper existence check.
     *   Call {@link CommonService#validateShipper(String)}
     * </pre>
     * <pre>
     * ‐ Shipper存在チェック
     *     {@link CommonService#validateShipper(String)}を呼出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return COMPANY CODE exists on NEXUS Company Master as shipper, false:other<br />
     * 会社コードが荷主としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException cannot check existence of Shipper<br />
     * Shipper存在チェックが出来ない場合
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException;
    
    /**
     * 
     * Existence check NEXUS Ship to Com.
     * <br />NEXUS Ship to Com.存在チェックを行います。
     * <pre>
     * - NEXUS Ship to Com. Existence check.
     *   Call {@link CommonService#validateCompCd(String)}
     * </pre>
     * <pre>
     * ‐NEXUS Ship to Com.存在チェック
     *     {@link CommonService#validateCompCd(String)}を呼出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return COMPANY CODE exists on NEXUS Company Master, false:other<br />
     * 会社コードがNEXUS会社原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException cannot check existence of NEXUS Ship to Com<br />
     * NEXUS Ship to Com.存在チェックが出来ない場合
     */
    public boolean validateDatabaseCompCd(String compCd) throws ApplicationException;
    
    /**
     * Consignee existence check.
     * <br />Consignee存在チェックを行います。
     * <pre>
     * - Consignee presence check.
     *   Call {@link CommonService#validateConsignee(String)}
     * </pre>
     * <pre>
     * ‐ Consignee存在チェック
     *     {@link CommonService#validateConsignee(String)}を呼出します。
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @return COMPANY CODE exists on NEXUS Company Master, false:other<br />
     * 会社コードがNEXUS会社原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException cannot check existence of Consignee.<br />
     * Consignee存在チェックが出来ない場合
     */
    public boolean validateDatabaseConsignee(String compCd) throws ApplicationException;
    
    /**
     * 
     * Check to get the number of File Manage.
     * <br />ファイル管理の取得件数をチェックします。
     * <pre>
     * - Search File Manage
     *   Select the file Id, and call {@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}
     * </pre>
     * <pre>
     * ‐ファイル管理の検索
     *     ファイルIdを指定して、{@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}を呼び出します。
     * </pre>
     * 
     * @param fileId FILE ID to lock<br />
     * ロックするファイルID
     * @param fileDomain File Manage information<br />
     * 取得したファイル管理情報
     * @return True:get data from File Manage, false:other<br />
     * ファイル管理からデータが取得できた場合true、それ以外はfalse
     * @throws ApplicationException can not check the number of File Manage.<br />
     * ファイル管理の取得件数チェックが出来ない場合
     */
    public boolean validateDatabaseFileManager(String fileId, FileManagementDomain fileDomain) throws ApplicationException;
    
    /**
     * 
     * Check deleted files and lock the File Manage.
     * <br />削除対象ファイルチェックとファイル管理のロックを行います。
     * <pre>
     * - Search Shipping Document.
     *   Set the following items W7001ShippingActCriteriaDomain and 
     *    call W7001ShippingActDao.searchTtShippingDocumentByFileId(W7001ShippingActCriteriaDomain).
     *     - FILE ID of argument.
     *   
     * - Set the following items to search condition domain.
     *     - FILE ID.
     *     
     * [0 review of Shipping Document]
     * - Exit with false.
     * 
     * [1 review of Shipping Document]
     * - Search File Manage.
     *   Select the FILE ID, and call FileManagementService.searchFileDownload(String, boolean, OutputStream)
     * 
     * - Get the data from the File Manage
     *   Set the following items from search condition domain.
     *     - File LAST UPDATE DATE
     * </pre>
     * <pre>
     * ‐船積書類の検索
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTtShippingDocumentByFileId(W7001ShippingActCriteriaDomain)}を呼び出す。
     *       ‐引数のファイルID
     * 
     * ‐検索条件ドメインに取得した以下の項目を設定します。
     *       ‐ファイルID
     * 
     * [船積書類の取得件数が0件]
     * ‐falseで処理を終了します。
     * 
     * [船積書類の取得件数が1件]
     * ‐ファイル管理を検索
     *     ファイルIDを指定して、{@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}を呼び出します。
     * 
     * ‐ファイル管理からデータを取得できた場合
     *     検索条件ドメインに取得した以下の項目を設定します。
     *       ‐ファイル最終更新日
     * </pre>
     * 
     * @param docDomain Shipping Document domain<br />
     * 船積書類ドメイン
     * @return true:delete date from File Manage, false:not remove<br />
     * ファイル管理からデータを削除する場合はtrue、削除しない場合はfalse
     * @throws ApplicationException can not check deleted files and If the lock of File Manage and deleted files can not be checked.<br />
     * 削除対象ファイルチェックとファイル管理のロックが出来ない場合
     */
    public boolean validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain docDomain)
        throws ApplicationException;
    
    /**
     * 
     * Acquisition of check FILE DATA.
     * <br />ファイルデータの取得チェック
     * <pre>
     * - Search Shipping Actuality.
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    Call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}
     *     - Shipping Actuality No argument
     *     - DELETE FLAG: 'N'
     *     
     * - Search File Manage.
     *   Set the following items in the argument, and call 
     *    {@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}.
     *     - FILE ID that obtained in Shipping Actuality
     *     - FILE DATA necessity: true (FILE DATA acquisition)
     *     - Data acquisition stream
     * </pre>
     * <pre>
     * ‐船積実績の検索
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼出します。
     *       ‐引数の船積実績No
     *       ‐削除フラグ：’N'
     * 
     * ‐ファイル管理の検索
     *     引数に以下の項目を設定し、{@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}を呼び出します。
     *       ‐船積実績で取得したファイルID
     *       ‐ファイルデータ要否：true（ファイルデータ取得）
     *       ‐データ取得用ストリーム
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param fileData FILE DATA acquisition<br />
     * ファイルデータ取得用
     * @return True:get FILE DATA from the File Manage, false:other<br />
     * ファイル管理からファイルデータを取得できた場合true、それ以外はfalse
     * @throws ApplicationException If the acquisition of check FILE DATA can not be<br />
     * ファイルデータの取得チェックができない場合
     */
    public boolean validateDatabaseOfRegisterPringClp(String shippingActNo, OutputStream fileData) throws ApplicationException;
    
    /**
     * 
     * Check of data CIGMA.
     * <br />CIGMAのデータチェックを行います。
     * <pre>
     * - Get updated Invoice No.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - Login DSC-ID
     * [0 reviews acquired as a result of updated Invoice No]
     * - Exit with true.
     * 
     * [Get a result of updated Invoice No is 1 or more]
     * - CIGMA night batch of check
     *   - Call {@link CommonService#searchCigmaAvailable(boolean, String)}
     *   - In the case of NG, the check is to set the "NXS-E1-0060" to return VALUE.
     * 
     * - CIGMA (correction mode) SHIPPING ACTUALITY STATUS Check
     *   -Call service "CIGMA SHIPPING ACTUALITY STATUS check".
     *  - In the case of flag STATUS = 2, set the "NXS-E1-0016" to return VALUE.
     * </pre>
     * <pre>
     * ‐更新対象インボイスNoの取得
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * 
     * [更新対象インボイスNoの取得結果が0件]
     * ‐チェック結果trueとして処理を終了します。
     * 
     * [更新対象インボイスNoの取得結果が1件以上]
     * ‐CIGMAの夜間バッチ中チェック
     *     ‐{@link CommonService#searchCigmaAvailable(boolean, String)}を呼び出します。
     *     ‐チェック結果がNGの場合、戻り値に「NXS-E1-0060」を設定します。
     * 
     * 
     * ‐CIGMA船積実績ステータスチェック（修正モードの場合）
     *     ‐Webサービス「CIGMA船積実績ステータスチェック」の呼び出します。
     *     ‐ステータスフラグ=2の場合、戻り値に「NXS-E1-0016」を設定します。
     * </pre>
     * 
     * @param isShipping24hFunc 24H shipping corresponding function function = true/24H shipping non-function = false<br />
     * 24H出荷対応機能機能=true／24H出荷非対応機能=false
     * @param compCd SHIPPER CODE<br />
     * 荷主コード
     * @param trnsCd trans code<br />
     * trans code
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param procMode Processing mode<br />
     * 処理モード
     * @param cigmaEdiStatus CIGMA EDI status<br />
     * CIGMA EDI status
     * @return Return null normal check result, it returns an error MESSAGE ID otherwise.<br />
     * チェック結果正常時nullを返します、それ以外の場合エラーメッセージIDを返します。
     * @throws ApplicationException can not check the data CIGMA.<br />
     * CIGMAのデータチェックができない場合
     */
    public String validateDatabaseShippingActStatus(boolean isShipping24hFunc, String compCd, String trnsCd, String dscId, String procMode, StringBuffer cigmaEdiStatus)
        throws ApplicationException;
    
    /**
     * 
     * Lock Invoice.
     * <br />インボイスをロックします。
     * <pre>
     * - Lock Invoice.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐インボイスをロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return True:get lock of Invoice, false:other<br />
     * インボイスのロックを取得できた場合true、それ以外false
     * @throws ApplicationException can not lock Invoice.<br />
     * インボイスのロックができない場合
     */
    public boolean validateDatabaseTtInvoice(String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException;
    
    /**
     * 
     * Lock the Invoice (only Non-cancellation).
     * <br />インボイスをロックします（未キャンセルのみ）。
     * <pre>
     * - Lock Invoice.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    Call {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - CANCEL FLAG: 'N' (Non-cancellation)
     * </pre>
     * <pre>
     * ‐インボイスをロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐キャンセルフラグ：'N'（未キャンセル）
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param cmlTyp CML TYP that has been acquired<br />
     * 取得したCML TYP
     * @return True:get lock of Invoice, false:other<br />
     * インボイスのロックを取得できた場合true、それ以外false
     * @throws ApplicationException can not lock Invoice.<br />
     * インボイスのロックができない場合
     */
    public boolean validateDatabaseTtInvoiceOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] cmlTyp)
        throws ApplicationException;
    
    /**
     * 
     * lock Invoice(Only data associated with their Shipping Actuality No).
     * <br />インボイスをロックします（船積実績Noに紐付くデータのみ）。
     * <pre>
     * - Lock Invoice/
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * </pre>
     * <pre>
     * ‐インボイスをロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return True:get lock of Invoice, false:other<br />
     * インボイスのロックを取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Invoice can not be<br />
     * インボイスのロックができない場合
     */
    public boolean validateDatabaseTtInvoiceOnRegisterCancel(W7001ShippingActCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * 
     * Lock Invoice(SHIPPER CODE, Invoice No).
     * <br />インボイスをロックします（荷主コード、インボイスNo）。
     * <pre>
     * - Lock Invoice
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     * </pre>
     * <pre>
     * ‐インボイスをロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @return True:get lock of Invoice, false:other<br />
     * インボイスのロックを取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Invoice can not be.<br />
     * インボイスのロックができない場合
     */
    public boolean validateDatabaseTtInvoiceOnRegisterChangeStatus(String shipperCd, String invoiceNo) 
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Actuality Receive Order.
     * <br />船積実績対象品受注情報をロックします。
     * <pre>
     * - Lock Shipping Actuality Receive Order.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * <pre>
     * ‐船積実績対象品受注情報をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param checkCount is not carried out to obtain the number of check: to acquire the number of check / false that: true<br />
     * true：取得件数チェックを行う / false：取得件数チェックを行わない 
     * @param lockFlag In return for VALUE LOCK FLAG (when that can be locked, set the 'Y'.)<br />
     * 戻り値用ロックフラグ(ロックできた時、'Y'を設定します。)
     * @return True:get lock of Shipping Actuality Receive Order, false:other<br />
     * 船積実績対象品受注情報のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality Receive Order can not be.<br />
     * 船積実績対象品受注情報のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOdrOnRegister(String shippingActNo, String shipperCd, String invoiceNo, Date invoiceIssueDt, boolean checkCount, String[] lockFlag)
        throws ApplicationException;
    
    /**
     * 
     * Lock the Shipping Actuality Receive Order.
     * <br />船積実績対象品受注情報をロックします。
     * <pre>
     * - Lock Shipping Actuality Receive Order.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * </pre>
     * <pre>
     * ‐船積実績対象品受注情報をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param checkCount is not carried out to obtain the number of check: to acquire the number of check / false that: true<br />
     * true：取得件数チェックを行う / false：取得件数チェックを行わない
     * @param lockFlag The (set when the 'Y', which can be locked.) VALUE LOCK FLAG for the return<br />
     * 戻り値用ロックフラグ（ロックできた時'Y'を設定します。） 
     * @return True:get lock of Shipping Actuality Receive Order, false:other<br />
     * 船積実績対象品受注情報のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality Receive Order can not be.<br />
     * 船積実績対象品受注情報のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOdrOnRegisterCancel(String shippingActNo, boolean checkCount, String[] lockFlag)
        throws ApplicationException;
    
    /**
     * Lock Shipping Actuality.
     * <br />船積実績をロックします。
     * <pre>
     * - Lock Shipping Actuality.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @return True:get lock of Shipping Actuality, false:other<br />
     * 船積実績のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnBlUpload(String shippingActNo)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Actuality.
     * <br />船積実績をロックします。
     * <pre>
     * - Lock Shipping Actuality.
     *   The settings for the following argument to {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - LAST UPDATE DATE
     * - Set the argument {@link W7001ShippingActCriteriaDomain}
     *  the B / L FILE ID that obtained from the Shipping Actuality.
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に引数以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐最終更新日時
     * 
     * ‐船積実績から取得したB/LファイルIDを引数{@link W7001ShippingActCriteriaDomain}に設定します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return True:get lock of Shipping Actuality, false:other<br />
     * 船積実績のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnBlUploadCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Acquisition of check FILE DATA.
     * <br />ファイルデータの取得チェック
     * <pre>
     * - Search Shipping Actuality.
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)} .
     *     - Shipping Actuality No
     * - Get FILE DATA
     *   Set the following arguments, {@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}
     *     - B / L FILE ID that obtained in Shipping Actuality
     *     - FILE DATA acquisition
     * </pre>
     * <pre>
     * ‐船積実績の検索
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼出します。
     *       ‐船積実績No
     * 
     * ‐ファイルデータの取得
     *     以下の引数を設定し、{@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}
     *       ‐船積実績で取得したB/LファイルID
     *       ‐ファイルデータ取得用
     * </pre>
     * 
     * @param shippingActNo Shipping Actuality No<br />
     * 船積実績No
     * @param fileData FILE DATA acquisition<br />
     * ファイルデータ取得用
     * @return True:get FILE DATA from File Manage, false:other<br />
     * ファイル管理からファイルデータを取得できた場合true、それ以外はfalse
     * @throws ApplicationException If the acquisition of check FILE DATA can not be.<br />
     * ファイルデータの取得チェックができない場合
     */
    public boolean validateDatabaseTtShippingActOnBlUploadView(String shippingActNo, OutputStream fileData)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Actuality.
     * <br />船積実績をロックします。
     * <pre>
     * - Lock Shipping Actuality.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐船積実績No
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return True:get lock of Shipping Actuality, false:other<br />
     * 船積実績のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Document (C / O's).
     * <br />船積書類をロックします（C/O向け）。
     * <pre>
     * - Lock Shipping Document.
     *   Set the following to {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - DOCUMENT TYPE: '1 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * 
     * - Set to the fileId argument FILE ID that obtained from the Shipping Document.
     * </pre>
     * <pre>
     * ‐船積書類をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐ドキュメント種別：'1'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * 
     * ‐船積書類から取得したファイルIDを引数のfileIdに設定します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param fileId (Array of type String of size 1) FILE ID storage that has been acquired<br />
     * 取得したファイルID格納用（サイズ1のString型の配列）
     * @return True:get lock of Shipping Document, false:other<br />
     * 船積書類のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Document can not be.<br />
     * 船積書類のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] fileId)
        throws ApplicationException;

    /**
     * 
     * Get FILE DATA (C / O's).
     * <br />ファイルデータを取得します（C/O向け）。
     * <pre>
     * - Get Shipping Document.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - DOCUMENT TYPE: '1 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * - FILE DATA acquisition
     *   Set the following arguments,
     *    and call {@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}.
     *     - FILE ID that obtained from the Shipping Document
     *     - Acquisition FILE DATA
     * </pre>
     * <pre>
     * ‐船積書類の検索
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼び出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐ドキュメント種別：'1'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * 
     * ‐ファイルデータ取得
     *     以下の引数を設定し、{@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}を呼び出します。
     *       ‐船積書類から取得したファイルID
     *       ‐取得用ファイルデータ
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param fileData Acquisition FILE DATA<br />
     * 取得用ファイルデータ
     * @return True:get FILE DATA, false:other<br />
     * ファイルデータの取得ができた場合true、それ以外はfalse
     * @throws ApplicationException can not get the FILE DATA.<br />
     * ファイルデータの取得ができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(String shipperCd, String invoiceNo, Date invoiceIssueDt, OutputStream fileData)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Document (Non Wooden for).
     * <br />船積書類をロックします（Non Wooden向け）。
     * <pre>
     * - Lock Shipping Document.
     *   Set the following to {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - DOCUMENT TYPE: '2 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * 
     * - Set to the fileId argument FILE ID that obtained from the Shipping Document.
     * </pre>
     * <pre>
     * ‐船積書類をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐ドキュメント種別：'2'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * 
     * ‐船積書類から取得したファイルIDを引数のfileIdに設定します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param fileId (Array of type String of size 1) FILE ID storage that has been acquired<br />
     * 取得したファイルID格納用（サイズ1のString型の配列）
     * @return True, false otherwise if the lock of the Shipping Document can be acquired<br />
     * 船積書類のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Document can not be.<br />
     * 船積書類のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] fileId)
        throws ApplicationException;
    
    /**
     * 
     * Get FILE DATA (Non Wooden for).
     * <br />ファイルデータを取得します（Non Wooden向け）。
     * <pre>
     * - Search Shipping Document.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - DOCUMENT TYPE: '2 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * 
     * - FILE DATA acquisition.
     *   Set the following arguments, 
     *    and call {@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}.
     *     - FILE ID that obtained from the Shipping Document
     *     - Acquisition FILE DATA
     * </pre>
     * <pre>
     * ‐船積書類の検索
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼び出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐ドキュメント種別：'2'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * 
     * ‐ファイルデータ取得
     *     以下の引数を設定し、{@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}を呼び出します。
     *       ‐船積書類から取得したファイルID
     *       ‐取得用ファイルデータ
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param fileData Acquisition FILE DATA<br />
     * 取得用ファイルデータ
     * @return True if the acquisition of the FILE DATA could be, false otherwise<br />
     * ファイルデータの取得ができた場合true、それ以外はfalse
     * @throws ApplicationException can not get the FILE DATA.<br />
     * ファイルデータの取得ができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView(String shipperCd, String invoiceNo, Date invoiceIssueDt, OutputStream fileData)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Document (for Others).
     * <br />船積書類をロックします（Others向け）。
     * <pre>
     * - Lock Shipping Document.
     *   Set the following to {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - BRANCH of argument
     *     - DOCUMENT TYPE: '3 '
     *     - DELETE FLAG: 'N'
     * 
     * - Set to the fileId argument FILE ID that obtained from the Shipping Document.
     * </pre>
     * <pre>
     * ‐船積書類をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐引数の枝番
     *       ‐ドキュメント種別：'3'
     *       ‐削除フラグ：'N'
     * 
     * ‐船積書類から取得したファイルIDを引数のfileIdに設定します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param brch BRANCH<br />
     * 枝番
     * @param fileId (Array of type String of size 1) FILE ID storage that has been acquired<br />
     * 取得したファイルID格納用（サイズ1のString型の配列）
     * @return True, false otherwise if the lock of the Shipping Document can be acquired<br />
     * 船積書類のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Document can not be.<br />
     * 船積書類のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(String shipperCd
        , String invoiceNo, Date invoiceIssueDt, BigDecimal brch, String[] fileId)
        throws ApplicationException;
    
    /**
     * 
     * Get FILE DATA (for Others).
     * <br />ファイルデータを取得します（Others向け）。
     * <pre>
     * - Search Shipping Document.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE of argument
     *     - Invoice No of argument
     *     - INVOICE ISSUE DATE of argument
     *     - BRANCH of argument
     *     - DOCUMENT TYPE: '3 '
     *     - DELETE FLAG: 'N'
     * 
     * - FILE DATA acquisition.
     *   Set the following arguments, 
     *    and call {@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}.
     *     - FILE ID that obtained from the Shipping Document
     *     - Acquisition FILE DATA
     * </pre>
     * <pre>
     * ‐船積書類の検索
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼び出します。
     *       ‐引数の荷主コード
     *       ‐引数のインボイスNo
     *       ‐引数のインボイス発行日
     *       ‐引数の枝番
     *       ‐ドキュメント種別：'3'
     *       ‐削除フラグ：'N'
     * 
     * ‐ファイルデータ取得
     *     以下の引数を設定し、{@link FileManagementService#searchFileDownload(String, boolean, java.io.OutputStream)}を呼び出します。
     *       ‐船積書類から取得したファイルID
     *       ‐取得用ファイルデータ
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param brch BRANCH<br />
     * 枝番
     * @param fileData Acquisition FILE DATA<br />
     * 取得用ファイルデータ
     * @return True if the acquisition of the FILE DATA could be, false otherwise<br />
     * ファイルデータの取得ができた場合true、それ以外はfalse
     * @throws ApplicationException can not get the FILE DATA.<br />
     * ファイルデータの取得ができない場合
     */
    public boolean validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(
        String shipperCd, String invoiceNo, Date invoiceIssueDt, BigDecimal brch, OutputStream fileData)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Actuality and get CLP FILE ID.
     * <br />船積実績をロックし、CLPファイルIDを取得します。
     * <pre>
     * - Lock Shipping Actuality.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * 
     * - Set to {@link W7001ShippingActCriteriaDomain} of argument CLP FILE ID that obtained from the Shipping Actuality.
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * 
     * ‐船積実績から取得したCLPファイルIDを引数の{@link W7001ShippingActCriteriaDomain}に設定します。
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return True if the lock of Shipping Actuality can be acquired, false otherwise<br />
     * 船積実績のロックが取得できた場合true、それ以外はfalse
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnRegister(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Actuality and get a CLP FILE ID.
     * <br />船積実績をロックし、CLPファイルID、B/LファイルIDを取得します。
     * <pre>
     * - Lock Shipping Actuality.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * 
     * - Set to{@link W7001ShippingActCriteriaDomain} of argument CLP FILE ID that obtained from the Shipping Actuality.
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * 
     * ‐船積実績から取得したCLPファイルID、B/LファイルIDを引数の{@link W7001ShippingActCriteriaDomain}に設定します。
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return True if the lock of Shipping Actuality can be acquired, false otherwise<br />
     * 船積実績のロックが取得できた場合true、それ以外はfalse
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnRegisterCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Lock Shipping Actuality.
     * <br />船積実績をロックします。
     * <pre>
     * - Lock Shipping Actuality.
     *   Set the following items{@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     * </pre>
     * <pre>
     * ‐船積実績をロック
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return True if the lock of Shipping Actuality can be acquired, false otherwise<br />
     * 船積実績のロックが取得できた場合true、それ以外false
     * @throws ApplicationException If the lock of Shipping Actuality can not be.<br />
     * 船積実績のロックができない場合
     */
    public boolean validateDatabaseTtShippingActOnRegisterChangeStatus(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * To check the presence of Shipping Document (C / O's).
     * <br />船積書類の存在チェックをします（C/O向け）。
     * <pre>
     * - Get Shipping Document.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    Call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DOCUMENT TYPE: '1 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐船積書類の取得
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐ドキュメント種別：'1'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Search results are true if 0 with reviews, false otherwise<br />
     * 検索結果が0件の場合true、それ以外はfalse
     * @throws ApplicationException can not get the Shipping Document.<br />
     * 船積書類の取得ができない場合
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    
    /**
     * 
     * Check presence of Shipping Document (for Non Wooden).
     * <br />船積書類の存在チェックをします（Non Wooden向け）。
     * <pre>
     * - Get Shipping Document.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DOCUMENT TYPE: '2 '
     *     - BRANCH: 1
     *     - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐船積書類の取得
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐ドキュメント種別：'2'
     *       ‐枝番：1
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Search results are true if 0 with reviews, false otherwise<br />
     * 検索結果が0件の場合true、それ以外はfalse
     * @throws ApplicationException can not get the Shipping Document.<br />
     * 船積書類の取得ができない場合
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    
    /**
     * 
     * To check the presence of Shipping Document (Others for).
     * <br />船積書類の存在チェックをします（Others向け）。
     * <pre>
     * - Get Shipping Document.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchCountTtShippingDocumentByShipper(W7001ShippingActCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DOCUMENT TYPE: '3 '
     *     - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐船積書類の取得
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchCountTtShippingDocumentByShipper(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐ドキュメント種別：'3'
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return SHIPPER CODE that the acquired, false, true more than 20 less than 20<br />
     * 取得した荷主コードが20未満の場合true、20以上はfalse
     * @throws ApplicationException can not get the Shipping Document.<br />
     * 船積書類の取得ができない場合
     */
    public boolean validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    
    /**
     * 
     * Lock Shipping Document and get FILE ID.
     * <br />船積書類をロックし、ファイルIDを取得します。
     * <pre>
     * - Lock Shipping Document
     *   Set the following items {@link W7001ShippingActCriteriaDomain} to the newly created,
     *    and call {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}.
     *     - Shipping Actuality No Invoice domain list of the beginning of the criteria argument
     *     - Invoice No Invoice domain list of the beginning of the criteria argument
     *     - INVOICE ISSUE DATE Invoice domain list of the beginning of the criteria argument
     * 
     * - Set to {@link W7001ShippingActCriteriaDomain} of argument FILE ID that obtained from the Shipping Document.
     * </pre>
     * <pre>
     * ‐船積書類をロック
     *     新たに作成した{@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain)}を呼出します。
     *       ‐引数criteriaのインボイスドメインリスト先頭の船積実績No
     *       ‐引数criteriaのインボイスドメインリスト先頭のインボイスNo
     *       ‐引数criteriaのインボイスドメインリスト先頭のインボイス発行日
     * 
     * ‐船積書類から取得したファイルIDを引数の{@link W7001ShippingActCriteriaDomain}に設定します。
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param shippingActDocList List of file information<br />
     * ファイル情報のリスト
     * @param checkCount is not carried out to obtain the number of check: to acquire the number of check / false that: true<br />
     * true：取得件数チェックを行う / false：取得件数チェックを行わない
     * @return True if the lock of the Shipping Document can be acquired, NG otherwise<br />
     * 船積書類のロックが取得できた場合true、それ以外はNG
     * @throws ApplicationException If the lock of Shipping Document can not be.<br />
     * 船積書類のロックが出来ない場合
     */
    public boolean validateDatabaseTtShippingDocumentOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, List<W7001ShippingActDocDomain> shippingActDocList, boolean checkCount)
        throws ApplicationException;
    
    /**
     * 
     * Invoice to register the Shipping Actuality checks or registered.
     * <br />船積実績を登録するインボイスが登録済みかチェックします。
     * <pre>
     * - Shipping Actuality Invoice Work Search.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}).
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワーク検索
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼出します。
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return True:get data from Shipping Actuality Invoice Work, false:other<br />
     * 船積実績対象インボイスワークからデータを取得できた場合true、それ以外の場合false
     * @throws ApplicationException can not check for the existence of Shipping Actuality Invoice Work<br />
     * 船積実績対象インボイスワークの存在チェックが出来ない場合
     */
    public boolean validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister(String dscId)
        throws ApplicationException;
    

    /**
     * 
     * Check a number of data.
     * <br />選択データ件数チェックをします。
     * <pre>
     * - Find The Shipping Actuality Invoice Work.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchTwShippingActInvoiceByCount(W7001ShippingActCriteriaDomain)}.
     *     - Login DSC-ID
     * 
     * - Check number
     *   Make the decision from the following VALUE return.
     *     - Count number> 99 (invoiceNo) + CK is set to ON in the active
     *       "Invoice", {1}; {0} in the message parameter of the argument {@link W7001ShippingActCriteriaDomain}: Set the "99",
     *       set the "GSCM-E0-0038" in the VALUE to return.
     *     - Sum total> 9999 PKG_QTY of data (pkgQty) + CK plays an active ON
     *       "PKG QTY", {1}; {0} in the message parameter of the argument {@link W7001ShippingActCriteriaDomain}: Set the "9999",
     *       set the "GSCM-E0-0038" in the VALUE to return.
     *     - Other than the above
     *       Set to null to return VALUE.
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークを検索
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTwShippingActInvoiceByCount(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *
     * ‐件数チェック
     *     戻り値から下記の判定を行います。
     *       ‐count(invoiceNo) + CKが活性でONになっている件数 > 99
     *             引数{@link W7001ShippingActCriteriaDomain}のメッセージパラメータに{0};"Invoice", {1}:"99"を設定し、
     *             戻り値に「GSCM-E0-0038」を設定します。
     *       ‐sum(pkgQty) + CKが活性でON担っているデータのPKG_QTYの合計 > 9999
     *             引数{@link W7001ShippingActCriteriaDomain}のメッセージパラメータに{0};"PKG QTY", {1}:"9999"を設定し、
     *             戻り値に「GSCM-E0-0038」を設定します。
     *       ‐上記以外
     *             戻り値にnullを設定します。
     * </pre>
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param activeCheckedCnt Number that CK plays an active ON<br />
     * CKが活性でON担っている件数
     * @param activePkgQty Sum of PKG QTY of data that CK is set to ON in the active<br />
     * CKが活性でONになっているデータのPKG QTYの合計
     * @param params (One-dimensional array of size 2) message parameters at the time of the error<br />
     * エラー時のメッセージパラメータ(サイズ2の1次元配列)
     * @return Null normal time, the number of check sets the MESSAGE ID abnormal.<br />
     * 件数チェックが正常時null、異常時メッセージIDを設定します。
     * @throws ApplicationException can not select the number of data check.<br />
     * 選択データ件数チェックが出来ない場合。
     */
    public String validateDatabaseTwShippingActInvoiceOnCreateUpdate(String dscId, int activeCheckedCnt, int activePkgQty, String[] params)
        throws ApplicationException;
    
    /**
    *
    * Check deleted data is present in the Shipping Actuality Invoice Work.
    * <br />船積実績対象インボイスワークに削除対象データが存在するかチェックします。
    * <pre>
    * - Find The Shipping Actuality Invoice Work.
    *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
    *    and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
    *     - Login DSC-ID
    *     - DELETE FLAG: 'Y'
    * 
    *  - Set the argument to obtain data
    *    Loading CD that is acquired from the Shipping Actuality Invoice Work, Invoice No, the INVOICE ISSUE DATE
    *    Set the argument {@link W7001ShippingActCriteriaDomain}.
    * </pre>
    * <pre>
    * ‐船積実績対象インボイスワークを検索
    *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
    *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
    *       ‐ログインDSC-ID
    *       ‐削除フラグ：'Y'
    *
    * ‐取得データを引数に設定
    *     船積実績対象インボイスワークから取得した荷積コード、インボイスNo、インボイス発行日を
    *     引数{@link W7001ShippingActCriteriaDomain}に設定します。
    * </pre>
    *
    * @param criteria search conditions domain<br />
    * 検索条件ドメイン
    * @return True:get data from Shipping Actuality Invoice Work, false:other<br />
    * 船積実績対象インボイスワークにデータが存在する場合true、それ以外はfalse
    * @throws ApplicationException can not check for the existence of deleted data.<br />
    * 削除対象データの存在チェックが出来ない場合。
    */
    public boolean validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Check deleted data exists from Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークから削除対象データが存在するかチェックします。
     * <pre>
     * - Find The Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}).
     *     - Login DSC-ID
     *     - DELETE FLAG: 'Y'
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークを検索
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐削除フラグ：'Y'
     * </pre>
     *
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return True:get data from Shipping Actuality Invoice Work, false:other<br />
     * 船積実績対象インボイスワークにデータが存在する場合true、それ以外はfalse
     * @throws ApplicationException can not check for the existence of deleted data.<br />
     * 削除対象データの存在チェックが出来ない場合。
     */
    public boolean validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen(String dscId)
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
     * @param invoiceNo error invoice No. Out parameter.
     * @return true:check OK false:check NG
     * @throws ApplicationException business exception
     */
    public boolean validateDatabaseTtPltzOnRegister(String dscId, StringBuffer invoiceNo)
        throws ApplicationException;
    
    /**
     * Shipping Actuality status check
     * <br />船積実績ステータスチェック。
     *
     * <pre>
     * Error if there is a following status.
     * A value is in CLP_FILE_ID or SHIPPING_ACT_STATUS is 20
     * 次のものがある場合エラー。
     * CLP_FILE_IDに値があるまたは、SHIPPING_ACT_STATUSが20
     * </pre>
     *
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return Error Message code
     * @throws ApplicationException business exception
     */
    public String validateDatabaseTtShippingActOnUpdateRegister(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * CLP Group check
     * <br />CLP Groupチェック。
     *
     * <pre>
     * Error if there is an omission of choice in CLPGroup.
     * CLP Groupに選択漏れがあればエラー
     * </pre>
     *
     * @param updateDomain search conditions domain<br />
     * 検索条件ドメイン
     * @return true:check OK false:check NG
     * @throws ApplicationException business exception
     */
    public boolean validateDatabaseTtShippingActOnClpCancel(W7001UpdateDomain updateDomain)
        throws ApplicationException;
    
    /**
     * Shipping Actuality status check
     * <br />船積実績ステータスチェック。
     *
     * <pre>
     * Error if there is a following status.
     * SHIPPING_ACT_STATUS is 20
     * 次のものがある場合エラー。
     * SHIPPING_ACT_STATUSが20
     * </pre>
     *
     * @param updateDomain search conditions domain<br />
     * 検索条件ドメイン
     * @return true:check OK false:check NG
     * @throws ApplicationException business exception
     */
    public boolean validateDatabaseTtInvoiceOnClpCancel(W7001UpdateDomain updateDomain)
        throws ApplicationException;
    /**
     * 
     * <p>メソッドの機能概要を記述してください。</p>
     *
     * @param updateDomain check input
     * @return check result
     * @throws ApplicationException business error
     */
    public String validateDatabaseTtShippingActOnClpRegister(W7001UpdateDomain updateDomain)
        throws ApplicationException;
    
    /**
     * 
     * <p>メソッドの機能概要を記述してください。</p>
     *
     * @param updateDomain check input
     * @throws ApplicationException business error
     */
    public void validateDatabaseTtPltzOnClpRegister(W7001UpdateDomain updateDomain)
        throws ApplicationException;

    // --- 検索系メソッド search -------------------------------------------------------------------
    /**
     * 
     * Make the search process of Shipping Actuality Create screen.
     * <br />船積実績Create画面の検索処理を行います。
     * <pre>
     * [In the case of 'Y' is Auto Invoice Register]
     *  Extract only the data that Shipping Confirmation they are all completed data exists and to Palletize table.
     *   - Get the number of search data.
     *     Call {@link W7001ShippingActDao#searchCountTtInvoice(W7001ShippingActCriteriaDomain)} .
     *   
     *   - Get search data.
     *     Call {@link W7001ShippingActDao#searchForPagingTtInvoice(W7001ShippingActCriteriaDomain)}.
     *   
     *   - Return of the search results .
     *    Return a list of {@link W7001ShippingActInvoiceDomain} search results.
     *
     * [In the case of the 'N' is Auto Invoice Register]
     *  Extract only the data that does not exist is data in the table Palletize.
     *   - Get the number of search data.
     *      Call {@link W7001ShippingActDao#searchCountTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain)}.
     *   
     *   - Get search data .
     *      Call {@link W7001ShippingActDao#searchForPagingTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain)}.
     *   
     *   - Return of the search results.
     *      Return a list of {@link W7001ShippingActInvoiceDomain} search results.
     * </pre>
     * <pre>
     * [Auto Invoice Registerが'Y'の場合]
     * パレタイズテーブルにデータが存在し、かつすべての出荷確認が完了しているデータのみ抽出します。
     * ‐検索データ件数の取得
     *     {@link W7001ShippingActDao#searchCountTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐検索データの取得
     *     {@link W7001ShippingActDao#searchForPagingTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     *
     * [Auto Invoice Registerが'N'の場合]
     * パレタイズテーブルにデータが存在しないデータのみを抽出します。
     * ‐検索データ件数の取得
     *     {@link W7001ShippingActDao#searchCountTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain)}を呼び出します。
     *
     * ‐検索データの取得
     *     {@link W7001ShippingActDao#searchForPagingTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActInvoiceDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the search process of Shipping Actuality Create screen can not be.<br />
     * 船積実績Create画面の検索処理ができない場合。
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingOnCreateSearch(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Make the search process of Shipping Actuality Main screen.
     * <br />船積実績Main画面の検索処理を行います。
     * <pre>
     * - Get the number of search data.
     *    Use the screen search criteria passed in the argument,
     *     and call {@link W7001ShippingActDao#searchCountTtShippingAct(W7001ShippingActCriteriaDomain)}.
     * 
     * - Get search data.
     *   Use the screen search criteria passed in the argument,
     *     and call {@link W7001ShippingActDao#searchForPagingTtShippingAct(W7001ShippingActCriteriaDomain)}.
     * 
     * - Return of the search results.
     *   Return a list of {@link W7001ShippingActDomain} search results.
     * </pre>
     * <pre>
     * ‐検索データ件数の取得
     *     引数で渡された画面検索条件を使用して、
     *     {@link W7001ShippingActDao#searchCountTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     *
     * ‐検索データの取得
     *     引数で渡された画面検索条件を使用して、
     *     {@link W7001ShippingActDao#searchForPagingTtShippingAct(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐検索結果の返却
     *     検索結果を{@link W7001ShippingActDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the search process of Shipping Actuality Main screen is not possible.<br />
     * 船積実績Main画面の検索処理ができない場合。
     */
    public List<? extends W7001ShippingActDomain> searchForPagingOnMainSearch(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Make the search process of BL Upload screen.
     * <br />BL Upload画面の検索処理を行います。
     * <pre>
     * - Find The Shipping Actuality.
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - DELETE FLAG: 'N'
     * 
     * - Find The File Manage.
     *   Set the following items {@link FileManagementCriterionDomain},
     *    and call {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}.
     *     - B / L FILE ID that obtained from the Shipping Actuality
     * 
     * - Set of search results.
     *   The return is set to {@link W7001ShippingActDomain} the following items.
     *     - LAST UPDATE DATE of Shipping Actuality
     *     - FILE NAME of File Manage
     * </pre>
     * <pre>
     * ‐船積実績を検索
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐削除フラグ：'N'
     * 
     * ‐ファイル管理を検索
     *     {@link FileManagementCriterionDomain}に以下の項目を設定し、
     *     {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}を呼び出します。
     *       ‐船積実績から取得したB/LファイルID
     * 
     * ‐検索結果の設定
     *     以下の項目を{@link W7001ShippingActDomain}に設定し返却する。
     *       ‐船積実績の最終更新日時
     *       ‐ファイル管理のファイル名
     * </pre>
     * 
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the search process of BL Upload screen can not be.<br />
     * BL Upload画面の検索処理ができない場合
     */
    public W7001ShippingActDocDomain searchOnBlUploadInit(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Search for screen of Other Doc. Upload Individual when transition from the Register screen.
     * <br />Other Doc. Upload Individual画面の検索処理（Register画面からの遷移時）を行います。
     * <pre>
     * - Get LAST UPDATE DATE of Shipping Actuality.
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - DELETE FLAG: 'N'
     * 
     * - Get STATUS · LAST UPDATE DATE of Invoice.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     * 
     * - Get Shipping Document information.
     *   Set the following items {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}.
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     * 
     * - File Manage Search.
     *   Set the following items {@link FileManagementCriterionDomain},
     *    and call {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}.
     *     - FILE ID that obtained from the Shipping Document
     * 
     * - Set of search results.
     *    Set to {@link W7001ShippingActDomain} search results .
     * </pre>
     * <pre>
     * ‐船積実績の最終更新日時の取得
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐削除フラグ：'N'
     * 
     * ‐インボイスのステータス・最終更新日時の取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     * 
     * ‐船積書類情報の取得
     *     {@link TtShippingDocumentCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#searchByCondition(TtShippingDocumentCriteriaDomain)}を呼び出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     *       
     * ‐ファイル管理検索
     *     {@link FileManagementCriterionDomain}に以下の項目を設定し、
     *     {@link FileManagementService#searchFileInfo(FileManagementCriterionDomain)}を呼び出します。
     *       ‐船積書類から取得したファイルID
     * 
     * ‐検索結果の設定
     *     検索結果を{@link W7001ShippingActDomain}に設定します。 
     * </pre>
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return  Search result<br />
     * 検索結果
     * @throws ApplicationException fail to search process Other Doc. Upload Individual screen.<br />
     * Other Doc. Upload Individual画面の検索処理に失敗した場合。
     */
    public W7001ShippingActDomain searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Search of Other Doc. Upload of (Summary).
     * <br />Other Doc. Upload(Summary)の検索処理を行う。
     * <pre>
     * - Get STATUS.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *     - Shipping Actuality No
     *     - DELETE FLAG: 'N'
     *    DISPLAY ORDER is as follows:
     *     - Invoice No (Ascending)
     * 
     * - Set the search results.
     *    Set to {@link W7001ShippingActInvoiceDomain} search results.
     * </pre>
     * <pre>
     * ‐ステータスの取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *       ‐削除フラグ：'N'
     *     
     *     表示順は下記の通り
     *       ‐インボイスNo（昇順）
     * 
     * ‐検索結果を設定
     *     検索結果を{@link W7001ShippingActInvoiceDomain}に設定します。
     * </pre>
     *
     * @param criteria search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the search process Other Doc. Upload of (Summary) is not possible.<br />
     * Other Doc. Upload(Summary)の検索処理ができない場合。
     */
    public List<? extends W7001ShippingActInvoiceDomain> searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *
     * Search process of Shipping Actuality Register screen (new mode).
     * <br />船積実績Register画面の検索処理を行います（新規モード）。
     * <pre>
     * - Get the number of search data.
     *   and call {@link W7001ShippingActDao#searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain)}
     *    argument to the search criteria domain.
     *    
     * - Data acquisition of detailed part.
     *   Call {@link W7001ShippingActDao#searchForPagingTwShippingActInvoice(W7001ShippingActCriteriaDomain)} ,
     *    get the data Shipping Actuality Invoice Work, from Invoice.
     *  
     * - (Only in the case of 'Y' is Auto Invoice Register) NUMBER OF CONTAINER acquisition is included in the Shipping Actuality.
     *    Argument to the search criteria domain.
     *     call {@link W7001ShippingActDao#searchTtShippingFirm(W7001ShippingActCriteriaDomain)}.
     * 
     * - Get the number of cases mark that is included in the Shipping Actuality.
     *   Set of search criteria domain.
     *     Set {@link W7001ShippingActCriteriaDomain}.
     *   Search PKG QTY
     *     Call {@link W7001ShippingActDao#searchTwShippingActInvoiceBySumPkgQty(W7001ShippingActCriteriaDomain)}.
     *   
     * - VALUE initial acquisition of input items.
     *   ( Get only 1 of the first) acquisition of ETD
     *     Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *      and call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *   Narrowing conditions.
     *     - Login DSC-ID
     *     - DELETE FLAG: 'N'
     *   - Set DISPLAY ORDER
     *      Following in the order of the sort.
     *       - ETD ( ascending)
     *   
     * ( Get only 1 of the first) acquisition of CONTAINER_LOOSE_TYP
     *   -{@link TwShippingActInvoiceCriteriaDomain} Set the following items ,
     *    call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *      Narrowing conditions
     *        - Login DSC-ID
     *        - DELETE FLAG: 'N'
     *      - Set DISPLAY ORDER
     *         following in the order of the sort .
     *          -CONTAINER_LOOSE_TYP ( ascending)
     *    
     * ( Get only 1 of the first) acquisition of ETA
     *   -{@link TwShippingActInvoiceCriteriaDomain} Set the following items ,
     *    call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *      Narrowing conditions
     *        - Login DSC-ID
     *        - DELETE FLAG: 'N'
     *      - Set DISPLAY ORDER
     *         following in the order of the sort .
     *          -ETA ( descending)
     *    
     * ( Get only 1 of the first) acquisition of Carrier
     *   -{@link TwShippingActInvoiceCriteriaDomain} Set the following items ,
     *    call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *      Narrowing conditions
     *        - Login DSC-ID
     *        - DELETE FLAG: 'N'
     *        - ETD initial VALUE of
     *     - Set DISPLAY ORDER
     *        Following in the order of the sort .
     *          -CARRIER_COMP_CD ( ascending)
     *  
     * ( Get only 1 of the first) acquisition of Vessel
     *   -{@link TwShippingActInvoiceCriteriaDomain} Set the following items ,
     *    call {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *      Narrowing conditions
     *        - Login DSC-ID
     *        - DELETE FLAG: 'N'
     *        - ETD initial VALUE of
     *      - Set DISPLAY ORDER
     *        Following in the order of the sort .
     *          -VESSEL ( ascending)
     *    
     * - Set the search results
     *    Set to {@link W7001ShippingActDomain} acquired data .
     * </pre>
     * <pre>
     * ‐検索データ件数の取得
     *    検索条件ドメインを引数に{@link W7001ShippingActDao#searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐明細部分のデータ取得
     *     {@link W7001ShippingActDao#searchForPagingTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を呼び出し、
     *     船積実績対象インボイスワーク、インボイスからデータを取得します。
     * 
     * ‐船積実績に含まれているコンテナ数取得（Auto Invoice Registerが'Y'の場合のみ）
     *     検索条件ドメインを引数に
     *     {@link W7001ShippingActDao#searchTtShippingFirm(W7001ShippingActCriteriaDomain)}を呼び出します。
     *
     * ‐船積実績に含まれるケースマークの数を取得
     *     検索条件ドメインの設定
     *       {@link W7001ShippingActCriteriaDomain}を設定します。
     *     PKG QTYの検索
     *       {@link W7001ShippingActDao#searchTwShippingActInvoiceBySumPkgQty(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     * ‐入力項目の初期値取得
     *   ETDの取得（先頭の1件のみ取得）
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐削除フラグ：'N'
     *     ‐表示順の設定
     *         ソートを下記の順で行います。
     *           ‐ETD（昇順）
     *
     *   CONTAINER_LOOSE_TYPの取得（先頭の1件のみ取得）
     *     ‐{@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、{@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐削除フラグ：'N'
     *     ‐表示順の設定
     *         ソートを下記の順で行います。
     *           ‐CONTAINER_LOOSE_TYP（昇順）
     *
     *   ETAの取得（先頭の1件のみ取得）
     *     ‐{@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、{@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐削除フラグ：'N'
     *     ‐表示順の設定
     *         ソートを下記の順で行います。
     *           ‐ETA（降順）
     *
     *   Carrierの取得（先頭の1件のみ取得）
     *     ‐{@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、{@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐削除フラグ：'N'
     *         ‐ETDの初期値
     *     ‐表示順の設定
     *         ソートを下記の順で行います。
     *           ‐CARRIER_COMP_CD（昇順）
     *
     *   Vesselの取得（先頭の1件のみ取得）
     *     ‐{@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、{@link TwShippingActInvoiceService#searchByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐削除フラグ：'N'
     *         ‐ETDの初期値
     *     ‐表示順の設定
     *         ソートを下記の順で行います。
     *           ‐VESSEL（昇順）
     *
     * ‐検索結果を設定
     *     取得データを{@link W7001ShippingActDomain}に設定します。
     *
     * </pre>
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果 
     * @throws ApplicationException If the search process of Shipping Actuality Register screen can not be.<br />
     * 船積実績Register画面の検索処理ができない場合
     */
    public W7001ShippingActDomain searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *
     * Make the search process of Shipping Actuality Register screen (correction mode).
     * <br />船積実績Register画面の検索処理を行います（修正モード）。
     * <pre>
     * - Get the number of search data.
     *    Call the {@link W7001ShippingActDao#searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain)}
     *    argument to the search criteria of the domain specification section .
     * 
     * - Search Invoice table.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)} 
     *      - Shipping Actuality No
     * 
     * - Registration to the Shipping Actuality Invoice Work.
     *    and call {@link TwShippingActInvoiceService#create}.
     * 
     * - Get Shipping Actuality from the data of the header part.
     *   Set the following items {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}.
     *      - Shipping Actuality No
     * 
     * - Data acquisition of detailed part.
     *    Call {@link W7001ShippingActDao#searchForPagingTwShippingActInvoice},
     *    Get the data Shipping Actuality Invoice Work, from Invoice.
     * 
     * - (Only in the case of 'Y' is Auto Invoice Register) NUMBER OF CONTAINER acquisition is included in the Shipping Actuality.
     *   Set the search criteria in the {@link W7001ShippingActCriteriaDomain}, call {@link W7001ShippingActDao#searchTtShippingFirm}.
     *   
     * - Get the number of cases mark that is included in the Shipping Actuality.
     *   Set the search criteria in the {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchTwShippingActInvoiceBySumPkgQty}.
     * 
     * - Set the search results.
     *    Set to {@link W7001ShippingActDomain} acquired data .
     * </pre>
     * <pre>
     * ‐検索データ件数の取得
     *    明細部の検索条件ドメインを引数に{@link W7001ShippingActDao#searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *
     * ‐インボイステーブルの検索
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します
     *       ‐船積実績No
     * 
     * ‐船積実績対象インボイスワークへの登録
     *     {@link TwShippingActInvoiceService#create}を呼び出します。
     *
     * ‐ヘッダ部分のデータを船積実績から取得
     *     {@link TtShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link TtShippingActService#searchByCondition(TtShippingActCriteriaDomain)}を呼び出します。
     *       ‐船積実績No
     *
     * ‐明細部分のデータ取得
     *     {@link W7001ShippingActDao#searchForPagingTwShippingActInvoice}を呼び出し、
     *     船積実績対象インボイスワーク、インボイスからデータを取得します。
     *
     * ‐船積実績に含まれているコンテナ数取得（Auto Invoice Registerが'Y'の場合のみ）
     *     {@link W7001ShippingActCriteriaDomain}に検索条件を設定し、{@link W7001ShippingActDao#searchTtShippingFirm}を呼び出します。
     *
     * ‐船積実績に含まれるケースマークの数を取得
     *     {@link W7001ShippingActCriteriaDomain}に検索条件を設定し、{@link W7001ShippingActDao#searchTwShippingActInvoiceBySumPkgQty}を呼び出します。
     *
     * ‐検索結果を設定
     *     取得データを{@link W7001ShippingActDomain}に設定します。
     *
     * </pre>
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果 
     * @throws ApplicationException If the search process of Shipping Actuality Register screen can not be.<br />
     * 船積実績Register画面の検索処理ができない場合
     */
    public W7001ShippingActDomain searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    // --- 登録系メソッド create -------------------------------------------------------------------
    /**
     *
     * Registration to the Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークへの登録
     * <pre>
     * - Registration to the Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#create(List)}. 
     *      - List of arguments {@link W7001ShippingActInvoiceDomain} 
     *      - Shipping Actuality No: null 
     *      - DELETE FLAG: 'N'
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークへの登録
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#create(List)}を呼び出します。
     *       ‐引数{@link W7001ShippingActInvoiceDomain}のリスト
     *       ‐船積実績No：null
     *       ‐削除フラグ：'N'
     * </pre>
     * 
     * @param shippingActInvoiceList Invoice domain list (registration data)<br />
     * インボイスドメインリスト（登録データ）
     * @return register count
     * @throws ApplicationException If the registration of the Shipping Actuality Invoice Work can not be.<br />
     * 船積実績対象インボイスワークへの登録ができない場合
     */
    public int createOnCreateUpdate(List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList) throws ApplicationException;
    
    /**
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *    Call{@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}.
     *     - The fileData: FILE DATA to register
     *     - The fileName: FILE NAME to register
     *     - SaveLimitTerm: 9999/12/31
     *     - UploadUser: login user name
     * 
     * - Register of Shipping Document data.
     *   Set the following items {@link TtShippingDocumentDomain},
     *    and call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}. 
     *      - {@link W7001ShippingActCriteriaDomain} of argument
     *      - FILE ID: FILE ID that is numbered at the time of registration to the File Manage (return VALUE)
     *      - DOCUMENT TYPE: 1
     *      - BRANCH: 1
     *  
     * - Screen refresh.
     *    call {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}. 
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}を呼出します。
     *       ‐fileData：登録するファイルデータ
     *       ‐fileName：登録するファイル名
     *       ‐saveLimitTerm：9999/12/31
     *       ‐uploadUser：ログインユーザ名
     * 
     * ‐船積書類データの登録
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：1
     *       ‐枝番：1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualCoUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *    Call {@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}.
     *     - The fileData: FILE DATA to register
     *     - The fileName: FILE NAME to register
     *     - SaveLimitTerm: 9999/12/31
     *     - UploadUser: login user name
     * 
     * - Register of Shipping Document data.
     *   Set the following items {@link TtShippingDocumentDomain},
     *    and call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}.
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     *     - FILE ID: FILE ID that is numbered at the time of registration to the File Manage (return VALUE)
     *     - DOCUMENT TYPE: 2
     *     - BRANCH: 1
     * 
     * - Screen refresh.
     *    Call {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}を呼出します。
     *       ‐fileData：登録するファイルデータ
     *       ‐fileName：登録するファイル名
     *       ‐saveLimitTerm：9999/12/31
     *       ‐uploadUser：ログインユーザ名
     * 
     * ‐船積書類データの登録
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：2
     *       ‐枝番：1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualNonWoodenUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - Register to File Manage the FILE DATA.
     *   Call {@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}.
     *     - The fileData: FILE DATA to register
     *     - The fileName: FILE NAME to register
     *     - SaveLimitTerm: 9999/12/31
     *     - UploadUser: login user name
     * 
     * - Numbering BRANCH.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    Call {@link W7001ShippingActDao#searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain)} .
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     * 
     * - Register of Shipping Document data.
     *   Set the following items {@link TtShippingDocumentDomain},
     *    Call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)} .
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     *     - FILE ID: FILE ID that is numbered at the time of registration to the File Manage ( return VALUE)
     *     - DOCUMENT TYPE: 3
     *     - The BRANCH: BRANCH +1 were numbered
     * 
     * - Screen refresh
     *   Call {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイルデータをファイル管理に登録。
     *     {@link FileManagementService#createFileUpload(java.io.InputStream, String, Number, String)}を呼出します。
     *       ‐fileData：登録するファイルデータ
     *       ‐fileName：登録するファイル名
     *       ‐saveLimitTerm：9999/12/31
     *       ‐uploadUser：ログインユーザ名
     * 
     * ‐枝番の採番
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     * 
     * ‐船積書類データの登録
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：3
     *       ‐枝番：採番した枝番 +1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadIndividualOthersUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - FILE DATA register.
     *   Call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     * 
     * - Registration process of the Shipping Document.
     *   Set the following items {@link TtShippingDocumentDomain},
     *    Call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}.
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     *     - FILE ID: FILE ID that is numbered at the time of registration to the File Manage (return VALUE)
     *     - DOCUMENT TYPE: 1
     *     - BRANCH: 1
     * 
     * - Screen refresh.
     *    Call {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイルデータ登録
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     * 
     * ‐船積書類の登録処理
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：1
     *       ‐枝番：1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryCoUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - FILE DATA register.
     *    Call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     * 
     * - Registration process of the Shipping Document.
     *   Set the following items {@link TtShippingDocumentDomain}, 
     *     Call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}.
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     *     - FILE ID: FILE ID that is numbered at the time of registration to the File Manage (return VALUE)
     *     - DOCUMENT TYPE: 2
     *     - BRANCH: 1
     * 
     * - Screen refresh.
     *    Call {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイルデータ登録
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     * 
     * ‐船積書類の登録処理
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：2
     *       ‐枝番：1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryNonWoodenUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Upload file.
     * <br />ファイルのアップロードをします。
     * <pre>
     * - FILE DATA register.
     *   Call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     * 
     * - Numbering BRANCH.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain)}.
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     * 
     * - Registration process of the Shipping Document.
     *   Set the following items {@link TtShippingDocumentDomain},
     *    and call {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}.
     *     - {@link W7001ShippingActCriteriaDomain} of argument
     *     - FILE ID: FILE ID that is numbered at the time of registration to the File Manage (return VALUE)
     *     - DOCUMENT TYPE: 2
     *     - The BRANCH: BRANCH + 1 were numbered
     * 
     * - Screen refresh.
     *    Call {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイルデータ登録
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     * 
     * ‐枝番の採番
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     * 
     * ‐船積書類の登録処理
     *     {@link TtShippingDocumentDomain}に以下の項目を設定し、
     *     {@link TtShippingDocumentService#create(TtShippingDocumentDomain)}を呼出します。
     *       ‐引数の{@link W7001ShippingActCriteriaDomain}
     *       ‐ファイルID：ファイル管理への登録時に採番されたファイルID（戻り値）
     *       ‐ドキュメント種別：2
     *       ‐枝番：採番した枝番 + 1
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadSummary(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the file upload operation can not be performed.<br />
     * ファイルのアップロード処理ができない場合。
     */
    public W7001ShippingActDomain createOnOtherDocUploadSummaryOthersUpload(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    // --- 更新系メソッド update -------------------------------------------------------------------
    /**
     * Update STATUS of Invoice and re-display of the screen.
     * <br />インボイスのステータス更新、画面の再表示を行います。
     * <pre>
     * - Updated SHIPPING ACTUALITY STATUS of Invoice.
     *   Set the refiners updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    Call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content
     *       - SHIPPING ACTUALITY STATUS of the screen to the case 10 of 20, 20 of 10
     *     Narrowing conditions
     *       - SHIPPER CODE screen
     *       - Invoice No of screen
     *       - INVOICE ISSUE DATE of the screen
     *       - LAST UPDATE DATE of the Invoice screen
     * 
     * - Get SHIPPING ACTUALITY STATUS of Invoice.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *     - Shipping Actuality No of screen
     * 
     * - SHIPPING ACTUALITY STATUS update of Shipping Actuality.
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - Set the VALUE of the following SHIPPING ACTUALITY STATUS
     *         In the case of 20, SHIPPING ACTUALITY STATUS of Invoice acquired by the '20 all '
     *         Other than the above , '10 '
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     *       - LAST UPDATE DATE of the screen
     * 
     * - Screen refresh.
     *    Call {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐インボイスの船積実績ステータスを更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐画面の船積実績ステータスが10の場合20、20の場合10にする
     *       絞込条件
     *         ‐画面の荷主コード
     *         ‐画面のインボイスNo
     *         ‐画面のインボイス発行日
     *         ‐画面のインボイスの最終更新日時
     * 
     * ‐インボイスの船積実績ステータスを取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐画面の船積実績No
     * 
     * ‐船積実績の船積実績ステータス更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐船積実績ステータスに下記の値を設定する
     *             取得したインボイスの船積実績ステータスがすべて20の場合、'20'
     *             上記以外、'10'
     *       絞込条件
     *         ‐画面の船積実績No
     *         ‐画面の最終更新日時
     * 
     * ‐画面の再表示
     *     {@link #searchOnOtherDocUploadIndividualInit(W7001ShippingActCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the STATUS update of Invoice, re-display of the screen can not be.<br />
     * インボイスのステータス更新、画面の再表示ができない場合
     */
    public W7001ShippingActDomain updateOnOtherDocUploadIndividualChangeStatus(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    // --- 削除系メソッド delete -------------------------------------------------------------------
    /**
     * 
     * Delete data from the Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークから削除対象データを削除します。
     * <pre>
     * - Delete the Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     - Login DSC-ID 
     *     - DELETE FLAG: 'Y'
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     *       ‐削除フラグ：'Y'
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not remove from the Shipping Actuality Invoice Work.<br />
     * 船積実績対象インボイスワークから削除できない場合
     */
    public void deleteOnCreateInit(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID.
     * <br />ログインDSC-IDに紐付く船積実績対象インボイスワークのデータを削除します。
     * <pre>
     * - Delete the Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)} .
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException  can not remove from the Shipping Actuality Invoice Work.<br />
     * 船積実績対象インボイスワークから削除できない場合
     */
    public void deleteOnHeaderInit(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Delete the data of Shipping Actuality Invoice Work associated with their login DSC-ID.
     * <br />ログインDSC-IDに紐付く船積実績対象インボイスワークのデータを削除します。
     * <pre>
     * - Delete the Shipping Actuality Invoice Work.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    Call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)} .
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐船積実績対象インボイスワークの削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not remove from the Shipping Actuality Invoice Work.<br />
     * 船積実績対象インボイスワークから削除できない場合
     */
    public void deleteOnMainInit(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Delete the file of the entity holding.
     * <br />ファイル保持用のエンティティを削除します。
     * <pre>
     * - Remove information associated with their FILE ID from File Manage.
     *    Call {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *     - FILE ID to be deleted
     *     - LAST UPDATE DATE to be deleted
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐ファイル管理からファイルIDに紐付く情報を削除
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼び出します。
     *       ‐削除するファイルID
     *       ‐削除対象の最終更新日
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException can not remove the entity of the file holding.<br />
     * ファイル保持用のエンティティを削除できない場合
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualCoCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Delete the file of the entity holding.
     * <br />ファイル保持用のエンティティを削除します。
     * <pre>
     * - Remove information associated with their FILE ID from File Manage
     *    Call {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *     - FILE ID to be deleted
     *     - LAST UPDATE DATE to be deleted
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐ファイル管理からファイルIDに紐付く情報を削除
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼び出します。
     *       ‐削除するファイルID
     *       ‐削除対象の最終更新日
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException can not remove the entity of the file holding<br />
     * ファイル保持用のエンティティを削除できない場合
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualNonWoodenCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Delete the file of the entity holding.
     * <br />ファイル保持用のエンティティを削除します。
     * <pre>
     * - Remove information associated with their FILE ID from File Manage
     *    Call {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *     - FILE ID to be deleted
     *     - LAST UPDATE DATE to be deleted
     *     - Login DSC-ID
     * </pre>
     * <pre>
     * ‐ファイル管理からファイルIDに紐付く情報を削除
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼び出します。
     *       ‐削除するファイルID
     *       ‐削除対象の最終更新日
     *       ‐ログインDSC-ID
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException can not remove the entity of the file holding.<br />
     * ファイル保持用のエンティティを削除できない場合
     */
    public W7001ShippingActDomain deleteOnOtherDocUploadIndividualOthersCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * DELETE FLAG update of check data, re-screen display.
     * <br />チェックデータの削除フラグ更新、画面再表示
     * <pre>
     * Against Le CD that is checked Delete.
     * - The DELETE FLAG update of Shipping Actuality Invoice Work checked against data.
     *   Set the refiners updates to {@link TwShippingActInvoiceDomain}, in {@link TwShippingActInvoiceCriteriaDomain},
     *     Call {@link TwShippingActInvoiceService#updateByCondition(List, List)}.
     *     Updated content
     *       - Set the 'Y' to DELETE FLAG.
     *     Narrowing conditions
     *       - Login DSC-ID
     *       - SHIPPER CODE
     *       - Invoice No of the target data
     *       - INVOICE ISSUE DATE of the target data
     * 
     * - Screen refresh.
     *   [In case of correction mode]
     *     Call {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)} .
     *   
     *   [New mode]
     *     Call {@link #searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * Deleteがチェックされているレコードに対して、以下の処理を行います。
     * ‐チェック済みデータに対して船積実績対象インボイスワークの削除フラグ更新
     *     {@link TwShippingActInvoiceDomain}に更新内容、{@link TwShippingActInvoiceCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TwShippingActInvoiceService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         ‐削除フラグに'Y'を設定します。
     *       絞込条件
     *         ‐ログインDSC-ID
     *         ‐荷主コード
     *         ‐対象データのインボイスNo
     *         ‐対象データのインボイス発行日
     * 
     * ‐画面の再表示
     * [修正モードの場合]
     *     {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}を呼出します。
     * 
     * [新規モードの場合]
     *     {@link #searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param procMode 処理モード
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If the DELETE FLAG update of check data, re-screen can not be displayed.<br />
     * チェックデータの削除フラグ更新、画面再表示ができない場合
     */
    public W7001ShippingActDomain deleteOnRegisterDelete(String procMode, W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    // --- トランザクション系メソッド transact -----------------------------------------------------
    /**
     * 
     * Upload files, search of the screen display item.
     * <br />ファイルのアップロード、画面表示項目の再検索
     * <pre>
     * - Registration of the entity to file holding.
     *   Set the items on the screen, call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     * 
     * - FILE ID updates to the Shipping Actuality.
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    Call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - B / L FILE ID: FILE ID that obtained when registered to File Manage
     *     Refine conditions
     *       - Shipping Actuality No
     *       - LAST UPDATE DATE
     * 
     * - Screen display items search.
     *   Argument to the search criteria of the screen, and call {@link #searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイル保持用のエンティティへ登録
     *     画面の項目を設定し、{@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     * 
     * ‐船積実績へのファイルID更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *         更新内容
     *           ‐B/LファイルID：ファイル管理への登録時に取得したファイルID
     *         絞りこみ条件
     *           ‐船積実績No
     *           ‐最終更新日時
     * 
     * ‐画面表示項目再検索
     *     画面の検索条件を引数に、{@link #searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException can not upload the file, re-search of the screen display item<br />
     * ファイルのアップロード、画面表示項目の再検索ができない場合
     */
    public W7001ShippingActDocDomain transactOnBlUpload(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException;
    
    /**
     * 
     * Delete upload FILE DATA.
     * <br />アップロードファイルデータの削除を行います。
     * <pre>
     * - Remove information associated with their FILE ID from File Manage.
     *    Call{@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *     - FILE ID to be deleted
     *     - LAST UPDATE DATE to be deleted
     *     - Login DSC-ID
     * 
     * - FILE ID updates to the Shipping Actuality.
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *     Call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *      Updated content
     *        - B / L FILE ID: NULL
     *      Refine conditions
     *        - Shipping Actuality No
     * 
     * - Screen display items search.
     *   Argument to the search criteria of the screen, and call {@link #searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐ファイル管理からファイルIDに紐付く情報を削除
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼び出します。
     *       ‐削除するファイルID
     *       ‐削除対象の最終更新日
     *       ‐ログインDSC-ID
     * 
     * ‐船積実績へのファイルID更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *         更新内容
     *           ‐B/LファイルID：NULL
     *         絞りこみ条件
     *           ‐船積実績No
     * 
     * ‐画面表示項目再検索
     *     画面の検索条件を引数に、{@link #searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException can not delete the upload FILE DATA.<br />
     * アップロードファイルデータの削除が出来ない場合。
     */
    public W7001ShippingActDocDomain transactOnBlUploadCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Registration process, and the re-display of the screen (new mode).
     * <br />登録処理を行い、画面の再表示をします（新規モード）。
     * <pre>
     * - Numbering Shipping Actuality No.
     *   With the name of the following items , call {@link CommonService#transactSequence(String, String, int, String)}.
     *     - Numbering key: time zone date of Shipper M + Session (7002.Shipper) + year ( last two digits ), month , month year ※
     *     - Numbering division: 10
     *     - Get the number : 1 (SEQ_TYP_SHIPPING_ACTUALITY_NO)
     *     - FUNC ID: SCREEN ID
     * 
     * - Register of Shipping Actuality.
     *   Set the contents of the search conditions in domain {@link TtShippingActDomain},
     *     Call {@link TtShippingActService#create(TtShippingActDomain)} .
     * 
     * - Update of Invoice.
     *   Set the refiners updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content.
     *       - The Shipping Actuality No: Shipping Actuality No that numbered
     *       - SHIPPING ACTUALITY STATUS: '10 '(. Imcomplete Doc Attach)
     *     Narrowing conditions.
     *       - SHIPPER CODE
     *       - Invoice No of the target data
     *       - INVOICE ISSUE DATE of the target data
     *       - LAST UPDATE DATE of the target data
     * 
     * [ In the case of 'Y' is AUTO INVOICE REGISTER FLAG]
     *   Create a sales information of the part number that is included in the Invoice Shipping Actuality Receive Order table .
     *    - Data acquisition to be registered in the Shipping Actuality Receive Order ().
     *      Specify the search criteria argument domain of the screen ,
     *      and call {@link W7001ShippingActDao#searchTwShippingActInvoice(W7001ShippingActCriteriaDomain)}.
     * 
     *    - Register of Shipping Actuality Receive Order.
     *      Is set to TtShippingActOdrDomain registration data acquired ,
     *       and  call {@link TtShippingActOdrService#create(List)}.
     * 
     * [ In the case of 'Y' is AUTO INVOICE REGISTER FLAG and other 'A' is Trans]
     *   Creating a CLP FILE DATA.
     *     - Create a PDF file .
     *       Call {@link L7001ReportService#searchShippingAct(String, String, String)}
     *         - Shipping Actuality No
     *         - SHIPPER CODE
     *         - Date format
     *    
     *     - Registration of FILE DATA.
     *       Call{@link FileManagementService#createFileUpload(InputStream, String, Number, String)}.
     *         - The FILE DATA: PDF data created
     *         - FILE NAME: Shipping Actuality No of screen
     *         - Login DSC-ID
     *         - File retention period : the number of days until 12/31/9999
     *     
     *     - FILE ID update process to Shipping Actuality.
     *       Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *        and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *          Updated content
     *            - CLP FILE ID: FILE ID that obtained in FILE DATA registration
     *          Narrowing conditions
     *            - Shipping Actuality No: Shipping Actuality No of screen
     * 
     * [ In the case of 'Y' is AUTO INVOICE REGISTER FLAG]
     *   Call of collaboration Web service to CIGMA.
     *     - ( Get CUSTOMER_CD, of LGCY_SHIP_TO) acquisition of data to be set to the argument
     *       The argument to the search criteria domain of the screen ,
     *        and call {@link W7001ShippingActDao#searchTtPltz(W7001ShippingActCriteriaDomain)}.
     *  
     *   - (Invoice No acquisition of interest) acquisition of data to be set to the argument
     *     The argument to the search criteria domain of the screen ,
     *      and call {@link W7001ShippingActDao#searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain)}.
     *  
     *   - Call of Shipping Actuality registration Web Service
     *     Set the following items {@link Ws7001ParamDomain},
     *      and call{@link Ws7001RestService#createShippingAct}.
     *        - Search conditions domain of the screen
     *        - Argument Configuration data values ​​(CUSTOMER_CD, LGCY_SHIP_TO, Invoice No.)
     *        - Number of order information that is included in the Invoice that registered with
     *           the Shipping Actuality Receive Order table
     * 
     * - Remove from Shipping Actuality Invoice Work table the deleted data.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#delete(TwShippingActInvoiceCriteriaDomain)}.
     *      - Login DSC-ID
     *      - DELETE FLAG: 'Y' ( Delete )
     *      
     * - Set the screen Shipping Actuality No that numbered.
     * 
     * - Screen display items search.
     *    Call {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐船積実績Noの採番
     *     以下の項目を引数にして、{@link CommonService#transactSequence(String, String, int, String)}を呼び出します。
     *       ‐採番キー：M + Session(7002.Shipper) + 年(下2桁) + 月 ※年・月はShipperのタイムゾーン日付
     *       ‐採番区分：10
     *       ‐取得数  ：1（SEQ_TYP_SHIPPING_ACTUALITY_NO）
     *       ‐機能ID  ：画面ID
     * 
     * ‐船積実績の登録
     *     {@link TtShippingActDomain}に検索条件ドメインの内容を設定し、
     *     {@link TtShippingActService#create(TtShippingActDomain)}を呼び出します。
     * 
     * ‐インボイスの更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐船積実績No：採番した船積実績No
     *         ‐船積実績ステータス：'10'（Imcomplete Doc. Attach）
     *       絞込条件
     *         ‐荷主コード
     *         ‐対象データのインボイスNo
     *         ‐対象データのインボイス発行日
     *         ‐対象データの最終更新日時
     * 
     * [インボイス自動作成フラグが'Y'の場合]
     * 船積実績対象品受注情報テーブルにインボイスに含まれる品番の受注情報を登録します。
     *   ‐船積実績対象品受注情報に登録するデータ取得（）
     *       画面の検索条件ドメインを引数に指定して、
     *       {@link W7001ShippingActDao#searchTwShippingActInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     *   ‐船積実績対象品受注情報の登録
     *       取得した登録データを{@link TtShippingActOdrDomain}に設定し、
     *       {@link TtShippingActOdrService#create(List)}を呼び出します。
     * 
     * [Transが'A'以外 かつ インボイス自動作成フラグが'Y'の場合]
     * CLPファイルデータの作成
     *   ‐PDFファイルを作成します。
     *       {@link L7001ReportService#searchShippingAct(String, String, String)}を呼び出します。
     *         ‐船積実績No
     *         ‐荷主コード
     *         ‐日付フォーマット
     * 
     *   ‐ファイルデータの登録
     *       {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼び出します。
     *         ‐ファイルデータ：作成したPDFデータ
     *         ‐ファイル名：画面の船積実績No
     *         ‐ログインDSC-ID
     *         ‐ファイル保存期間：9999/12/31までの日数
     * 
     *     ‐船積実績へのファイルID更新処理
     *         {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *         {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼出します。
     *           更新内容
     *             ‐CLPファイルID：ファイルデータ登録で取得したファイルID
     *           絞込条件
     *             ‐船積実績No：画面の船積実績No
     * 
     * [インボイス自動作成フラグが'Y'の場合]
     * CIGMAへの連携Webサービスの呼び出し
     *   ‐引数へ設定するデータの取得（CUSTOMER_CD、LGCY_SHIP_TOの取得）
     *       画面の検索条件ドメインを引数にし、
     *       {@link W7001ShippingActDao#searchTtPltz(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       
     *   ‐引数へ設定するデータの取得（対象のインボイスNo.取得）
     *       画面の検索条件ドメインを引数にし、
     *       {@link W7001ShippingActDao#searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     *   ‐船積実績登録Webサービスの呼び出し
     *       {@link Ws7001ParamDomain}に以下の項目を設定し、
     *       {@link Ws7001RestService#createShippingAct}を呼び出します。
     *         ‐画面の検索条件ドメイン
     *         ‐取得した引数設定データ（CUSTOMER_CD、LGCY_SHIP_TO、インボイスNo.）
     *         ‐船積実績対象品受注情報テーブルに登録したインボイスに含まれる品番の受注情報
     * 
     * ‐削除対象データを船積実績対象インボイスワークテーブルから削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼出します。
     *       ‐ログインDSC-ID
     *       ‐削除フラグ：'Y'（削除）
     * 
     * ‐採番した船積実績Noを画面に設定
     * 
     * ‐画面表示項目再検索
     *     {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param reportDateFormat Date format (the document output)<br />
     * 日付フォーマット (帳票出力用)
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException unable to reacquire the screen display item and registration process.<br />
     * 登録処理と画面表示項目の再取得が出来ない場合
     */
    public W7001ShippingActDomain transactOnRegisterByFromCreate(W7001ShippingActCriteriaDomain criteria, String reportDateFormat)
        throws ApplicationException;
    
    /**
     * 
     * Perform the registration process, and the re-display of the screen (correction mode).
     * <br />登録処理を行い、画面の再表示をします（修正モード）。
     * <pre>
     * - Update Shipping Actuality.
     *   Set the refiners updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)} .
     *     Updated content
     *       - The contents of the search criteria area of ​​the screen
     *     Narrowing conditions
     *       - Shipping Actuality No area of search criteria
     *       - LAST UPDATE DATE area of search criteria
     * 
     * - String pickled released update of Invoice data.
     *   Set the Filter information updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(List, List)}.
     *     Updated content
     *       - Shipping Actuality No: NULL
     *       - SHIPPING ACTUALITY STATUS: NULL
     *     Narrowing conditions
     *       - {@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}
     *          SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     *       - LAST UPDATE DATE of the screen
     * 
     * - Update of Shipping Actuality Receive Order.
     *   Set the refiners updates to {@link TtShippingActOdrDomain}, in {@link TtShippingActOdrCriteriaDomain},
     *    and call {@link TtShippingActOdrService#updateByCondition(TtShippingActOdrDomain, TtShippingActOdrCriteriaDomain)}.
     *     Updated content
     *       - DELETE FLAG: 'Y'
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     *       - {@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)} 
     *          SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     *  
     * - Shipping Document update of data.
     *   Set the refiners updates to {@link TtShippingDocumentDomain}, in {@link TtShippingDocumentCriteriaDomain},
     *    and call {@link TtShippingDocumentService#updateByCondition(List, List)}.
     *     Updated content
     *       - DELETE FLAG: 'Y'
     *     Narrowing conditions
     *       - ValidateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)
     *          SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     * 
     * - Delete the File Manage data.
     *   The argument is set to the following items ,
     *    and call{@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *      - # Acquired from {@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}
     *         FILE ID, LAST UPDATE DATE
     *      - Login DSC-ID
     * 
     * [In the case of 'Y' is AUTO INVOICE REGISTER FLAG and other 'A' is Trans] 
     *   Creating a CLP FILE DATA
     *     - Create a PDF file.
     *       {@link L7001ReportService#searchShippingAct(String, String, String)}
     *         - Shipping Actuality No
     *         - SHIPPER CODE
     *         - Date format
     *     - Updating FILE DATA
     *       Set the following items, call {@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)}.
     *         - CLP FILE ID
     *         - The FILE DATA: PDF data created
     *         - FILE NAME: Shipping Actuality No
     *         - File retention period: the number of days until 12/31/9999
     *         - Login DSC-ID
     *         - UPDATE YMD: LAST UPDATE DATE to be updated
     *  
     *  [In the case of 'Y' is AUTO INVOICE REGISTER FLAG]
     *    Call of collaboration Web service to CIGMA
     *      - (Get CUSTOMER_CD, of LGCY_SHIP_TO) acquisition of data to be set to the argument
     *        The argument to the search criteria domain of the screen,
     *         and call {@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)}.
     *  
     *      - Call of Shipping Actuality Update Web service
     *        Set the following items {@link Ws7003ParamDomain},
     *         and call {@link Ws7003RestService#updateShippingAct(String, Ws7003ParamDomain)}.
     *          - Search conditions domain of the screen
     *          - Argument Configuration data values ​​(CUSTOMER_CD, LGCY_SHIP_TO)
     *          - Invoice No to be deleted
     *   
     * - Remove from Shipping Actuality Invoice Work table the deleted data.
     *   Set the following items {@link TwShippingActInvoiceCriteriaDomain},
     *    and call {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}.
     *     - Login DSC-ID
     *     - DELETE FLAG: 'Y' (Delete)
     * 
     * - Screen display items search.
     *    Call {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐船積実績の更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐画面の検索条件エリアの内容
     *       絞込条件
     *         ‐検索条件エリアの船積実績No
     *         ‐検索条件エリアの最終更新日時
     * 
     * ‐インボイスデータの紐づけ解除更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞り込み情報を設定し、
     *     {@link TtInvoiceService#updateByCondition(List, List)}を呼び出します。
     *       更新内容
     *         ‐船積実績No：NULL
     *         ‐船積実績ステータス：NULL
     *       絞込条件
     *         ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *           荷主コード、インボイスNo、インボイス発行日
     *         ‐画面の最終更新日時
     * 
     * ‐船積実績対象品受注情報の更新
     *     {@link TtShippingActOdrDomain}に更新内容、{@link TtShippingActOdrCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingActOdrService#updateByCondition(TtShippingActOdrDomain, TtShippingActOdrCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐削除フラグ：'Y'
     *       絞込条件
     *         ‐画面の船積実績No
     *         ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *           荷主コード、インボイスNo、インボイス発行日
     * 
     * ‐船積書類データの更新
     *     {@link TtShippingDocumentDomain}に更新内容、{@link TtShippingDocumentCriteriaDomain}に絞り込み条件を設定し、
     *     {@link TtShippingDocumentService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐削除フラグ：'Y'
     *       絞込条件
     *         ‐{@link #validateDatabaseTwShippingActInvoiceOnRegister(W7001ShippingActCriteriaDomain)}から取得した
     *           荷主コード、インボイスNo、インボイス発行日
     * 
     * ‐ファイル管理データの削除
     *     以下の項目を引数に設定し、
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼び出します。
     *       ‐{@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}から取得した
     *         ファイルID、最終更新日
     *       ‐ログインDSC-ID
     * 
     * [Transが'A'以外 かつ インボイス自動作成フラグが'Y'の場合]
     * CLPファイルデータの作成
     *   ‐PDFファイルを作成します。
     *       {@link L7001ReportService#searchShippingAct(String, String, String)}
     *         ‐船積実績No
     *         ‐荷主コード
     *         ‐日付フォーマット
     * 
     *   ‐ファイルデータの更新
     *      以下の項目を設定し、{@link FileManagementService#updateFileData(String, InputStream, String, Number, String, Timestamp)}を呼び出します。
     *        ‐CLPファイルID
     *        ‐ファイルデータ：作成したPDFデータ
     *        ‐ファイル名：船積実績No
     *        ‐ファイル保存期間：9999/12/31までの日数
     *        ‐ログインDSC-ID
     *        ‐更新日時：更新対象の最終更新日
     * 
     * [インボイス自動作成フラグが'Y'の場合]
     * CIGMAへの連携Webサービスの呼び出し
     *   ‐引数へ設定するデータの取得（CUSTOMER_CD、LGCY_SHIP_TOの取得）
     *       画面の検索条件ドメインを引数にし、
     *       {@link W7001ShippingActDao#searchTtPltz(W7001ShippingActCriteriaDomain)}を呼び出します。
     * 
     *   ‐船積実績更新Webサービスの呼び出し
     *       {@link Ws7003ParamDomain}に以下の項目を設定し、
     *       {@link Ws7003RestService#updateShippingAct(String, Ws7003ParamDomain)}を呼び出します。
     *         ‐画面の検索条件ドメイン
     *         ‐取得した引数設定データ（CUSTOMER_CD、LGCY_SHIP_TO）
     *         ‐削除対象のインボイスNo
     * 
     * ‐削除対象データを船積実績対象インボイスワークテーブルから削除
     *     {@link TwShippingActInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TwShippingActInvoiceService#deleteByCondition(TwShippingActInvoiceCriteriaDomain)}を呼出します。
     *       ‐ログインDSC-ID
     *       ‐削除フラグ：'Y'（削除）
     * 
     * ‐画面表示項目再検索
     *     {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}を呼出します。
     *     
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param reportDateFormat Date format (the document output)<br />
     * 日付フォーマット (帳票出力用)
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException unable to reacquire the screen display item and registration process.<br />
     * 登録処理と画面表示項目の再取得が出来ない場合
     */
    public W7001ShippingActDomain transactOnRegisterByFromMain(W7001ShippingActCriteriaDomain criteria, String reportDateFormat)
        throws ApplicationException;
    
    /**
     * 
     * Delete, string Detaching Shipping Actuality.
     * <br />船積実績の削除・紐付け解除
     * <pre>
     * - Update Shipping Actuality.
     *   Set the narrowing-down condition updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - DELETE FLAG: 'Y' (Delete)
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     *       - LAST UPDATE DATE of the screen
     * 
     * - Pegging released update of Invoice data.
     *   Set the narrowing-down condition updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content
     *       - DELETE FLAG: 'Y' (Delete)
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     *       - LAST UPDATE DATE of the screen
     * 
     * - Shipping Actuality Receive Order update.
     *   Set the narrowing-down condition updates to {@link TtShippingActOdrDomain}, in {@link TtShippingActOdrCriteriaDomain},
     *    and call {@link TtShippingActOdrService#updateByCondition(List, List)}.
     *     Updated content
     *       - DELETE FLAG: 'Y' (Delete)
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     * 
     * - Shipping Document data update.
     *   Set the narrowing-down condition updates to {@link TtShippingDocumentDomain}, in {@link TtShippingDocumentCriteriaDomain},
     *    {@link TtShippingDocumentService#updateByCondition(List, List)}
     *      Updated content
     *        - DELETE FLAG: 'Y' (Delete)
     *      Narrowing conditions
     *        Obtained in {@link #validateDatabaseTtInvoiceOnRegisterCancel} validateDatabaseTtInvoiceOnRegisterCancel
     *         SHIPPER CODE, Invoice No, INVOICE ISSUE DATE
     * 
     * - Delete the File Manage data.
     *    Delete by calling {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}.
     *     - {@link #validateDatabaseTtShippingActOnRegisterCancel(W7001ShippingActCriteriaDomain)}
     *       B / L No file thus acquired, CLP file No
     *     - {@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}
     *       FILE ID that obtained by calling
     * 
     * - Call of Shipping Actuality Delete Web Service.
     *    call {@link Ws7004RestService#deleteShippingAct(String, String)} # deleteShippingAct.
     *     - Search conditions domain of the screen
     *     - Argument Configuration data values ​​(CUSTOMER_CD, LGCY_SHIP_TO)
     *     - Invoice No to be deleted
     * </pre>
     * <pre>
     * ‐船積実績の更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐削除フラグ：'Y'（削除）
     *       絞込条件
     *         ‐画面の船積実績No
     *         ‐画面の最終更新日時
     *     
     * ‐インボイスデータの紐付解除更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞込条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐削除フラグ：'Y'（削除）
     *       絞込条件
     *         ‐画面の船積実績No
     *         ‐画面の最終更新日時
     * 
     * ‐船積実績対象品受注情報更新
     *     {@link TtShippingActOdrDomain}に更新内容、{@link TtShippingActOdrCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActOdrService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐削除フラグ：'Y'（削除）
     *       絞込条件
     *         ‐画面の船積実績No 
     * 
     * ‐船積書類データ更新
     *     {@link TtShippingDocumentDomain}に更新内容、{@link TtShippingDocumentCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingDocumentService#updateByCondition(List, List)}を呼出します。
     *       更新内容
     *         ‐削除フラグ：'Y'（削除）
     *       絞込条件
     *         {@link #validateDatabaseTtInvoiceOnRegisterCancel}で取得した
     *         荷主コード、インボイスNo、インボイス発行日
     * 
     * ‐ファイル管理データの削除
     *     下記のファイルIDを{@link FileManagementService   #deleteFile(String, java.sql.Timestamp, String)}を呼び出して削除します。
     *       ‐{@link #validateDatabaseTtShippingActOnRegisterCancel(W7001ShippingActCriteriaDomain)}で
     *         取得したB/LファイルNo、CLPファイルNo
     *       ‐{@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}を
     *         呼び出して取得したファイルID
     * 
     * ‐船積実績削除Webサービスの呼び出し
     *       {@link Ws7004RestService#deleteShippingAct(String, String)}を呼び出します。
     *         ‐画面の検索条件ドメイン
     *         ‐取得した引数設定データ（CUSTOMER_CD、LGCY_SHIP_TO）
     *         ‐削除対象のインボイスNo
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return update count
     * @throws ApplicationException can not delete, string Detaching Shipping Actuality<br />
     * 船積実績の削除・紐付け解除が出来ない場合
     */
    public int transactOnRegisterCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * Update the STATUS Invoice, of Shipping Actuality, and then re-search of the screen display item.
     * <br />インボイス、船積実績のステータスを更新し、画面表示項目の再検索をします。
     * <pre>
     * - STATUS update of Invoice.
     *   Set the narrowing-down condition updates to {@link TtInvoiceDomain}, in {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}.
     *     Updated content
     *       - SHIPPING ACTUALITY STATUS
     *         In the case of 10, SHIPPING ACTUALITY STATUS of the screen 20
     *         In the case of 20, SHIPPING ACTUALITY STATUS of the screen 10
     *     Narrowing conditions
     *       - SHIPPER CODE screen
     *       - Invoice No to be updated
     *       - LAST UPDATE DATE to be updated
     *       - DELETE FLAG: 'N'
     * 
     * - STATUS acquisition of Invoice.
     *   Set the following items {@link TtInvoiceCriteriaDomain},
     *    and call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}.
     *     - Shipping Actuality No of screen
     *     - DELETE FLAG: 'N'
     * 
     * - STATUS update of Shipping Actuality.
     *   Set the narrowing-down condition updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - SHIPPING ACTUALITY STATUS
     *         SHIPPING ACTUALITY STATUS that is obtained from Invoice When 20 of 20 All
     *         In all other cases, 10
     *     Narrowing conditions
     *       - Shipping Actuality No of screen
     *       - LAST UPDATE DATE of the screen
     *       - DELETE FLAG; 'N'
     * 
     * - Search screen display item.
     *    Call {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐インボイスのステータス更新
     *     {@link TtInvoiceDomain}に更新内容、{@link TtInvoiceCriteriaDomain}に絞込条件を設定し、
     *     {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出します。
     *       更新内容
     *         ‐船積実績ステータス
     *             画面の船積実績ステータスが10の場合、20
     *             画面の船積実績ステータスが20の場合、10
     *       絞込条件
     *         ‐画面の荷主コード
     *         ‐更新対象のインボイスNo
     *         ‐更新対象の最終更新日時
     *         ‐削除フラグ：'N'
     * 
     * 
     * ‐インボイスのステータス取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼び出します。
     *       ‐画面の船積実績No
     *       ‐削除フラグ：'N'
     * 
     * ‐船積実績のステータス更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐船積実績ステータス
     *             インボイスから取得した船積実績ステータスが全て20のとき20
     *             上記以外の場合、10
     *       絞込条件
     *         ‐画面の船積実績No
     *         ‐画面の最終更新日時
     *         ‐削除フラグ；'N'
     * 
     * ‐画面表示項目の検索
     *     {@link #searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Update the STATUS of Shipping Actuality and could not re-find screen display item.<br />
     * インボイス、船積実績のステータスを更新、画面表示項目の再検索が出来なかった場合
     */
    public W7001ShippingActDomain transactOnRegisterChangeStatus(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    /**
     * 
     * <pre>
     * - 船積実績のCLPグループ更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐CLPグループ
     *             ""で上書き
     *       絞込条件
     *         ‐画面の船積実績No.
     * - CLP Group update of Shipping Actuality.
     *   Set the narrowing-down condition updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - CLP Group
     *         The overwrite that is ""
     *     Narrowing conditions
     *       - Shipping actuality No. of screen
     * </pre>
     *
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException When cannot update the CLP group
     * CLPグループの更新が出来なかった場合
     */
    public void transactOnUpdateCancel(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * <pre>
     * - 船積実績のCLPグループ更新
     *     {@link TtShippingActDomain}に更新内容、{@link TtShippingActCriteriaDomain}に絞込条件を設定し、
     *     {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}を呼び出します。
     *       更新内容
     *         ‐CLPグループ
     *          CLPグループシーケンス
     *       絞込条件
     *         ‐画面の船積実績No.
     * - CLP Group update of Shipping Actuality.
     *   Set the narrowing-down condition updates to {@link TtShippingActDomain}, in {@link TtShippingActCriteriaDomain},
     *    and call {@link TtShippingActService#updateByCondition(TtShippingActDomain, TtShippingActCriteriaDomain)}.
     *     Updated content
     *       - CLP Group
     *         CLP Group sequence
     *     Narrowing conditions
     *       - Shipping actuality No. of screen
     * </pre>
     *
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return update count<br />
     * 更新件数
     * @throws ApplicationException When cannot update the CLP group
     * CLPグループの更新が出来なかった場合
     */
    public int transactOnRegisterClpGroup(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 
     * It checks whether CIGMA data is already linked with EDI
     * <br />CIGMAのデータが既にEDI連携されているかかチェックを行います。
     * <pre>
     * - Get target Invoice No.
     *   Set the following items {@link W7001ShippingActCriteriaDomain},
     *    and call {@link W7001ShippingActDao#searchTtInvoice(W7001ShippingActCriteriaDomain)}.
     *     - Login DSC-ID
     * [0 reviews acquired as a result of updated Invoice No]
     * - Exit with true.
     * 
     * [Get a result of target CIGMA part Invoice No is 1 or more]
     * - CIGMA night batch of check
     *   - Call {@link CommonService#searchCigmaAvailable(boolean, String)}
     *   - In the case of NG, the check is to set the "NXS-E1-0060" to return VALUE.
     * 
     * - CIGMA (correction mode) SHIPPING ACTUALITY STATUS Check
     *   -Call service "CIGMA SHIPPING ACTUALITY STATUS check".
     *  - In the case of flag STATUS = 2, set the "NXS-E1-0016" to return VALUE.
     * </pre>
     * <pre>
     * ‐対象のインボイスNoの取得
     *     {@link W7001ShippingActCriteriaDomain}に以下の項目を設定し、
     *     {@link W7001ShippingActDao#searchTtInvoice(W7001ShippingActCriteriaDomain)}を呼び出します。
     *       ‐ログインDSC-ID
     * 
     * [対象のCIGMA品インボイスNoの取得結果が0件]
     * ‐チェック結果trueとして処理を終了します。
     * 
     * [対象インボイスNoの取得結果が1件以上]
     * ‐CIGMAの夜間バッチ中チェック
     *     ‐{@link CommonService#searchCigmaAvailable(boolean, String)}を呼び出します。
     *     ‐チェック結果がNGの場合、戻り値に「NXS-E1-0060」を設定します。
     * 
     * ‐CIGMA船積実績ステータスチェック
     *     ‐Webサービス「CIGMA船積実績ステータスチェック」の呼び出します。
     *     ‐ステータスフラグ=2の場合、戻り値に「NXS-E1-0016」を設定します。
     * </pre>
     * 
     * @param isShipping24hFunc 24H shipping corresponding function function = true/24H shipping non-function = false<br />
     * 24H出荷対応機能機能=true／24H出荷非対応機能=false
     * @param compCd SHIPPER CODE<br />
     * 荷主コード
     * @param trnsCd trans code<br />
     * trans code
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @return Return null normal check result, it returns an error MESSAGE ID otherwise.<br />
     * チェック結果正常時nullを返します、それ以外の場合エラーメッセージIDを返します。
     * @throws ApplicationException can not check the data CIGMA.<br />
     * CIGMAのデータチェックができない場合
     */
    public String validateDatabaseShippingActStatusForCancel(boolean isShipping24hFunc, String compCd, String trnsCd, String dscId)
        throws ApplicationException;
}
