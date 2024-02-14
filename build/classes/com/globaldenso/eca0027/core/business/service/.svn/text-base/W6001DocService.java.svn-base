/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtScHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCancelInvSeqTypCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvAmountChkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCancelInvSeqTypService;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvAmountChkService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvSeqService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPortService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtInvoiceService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackAtchItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingAttachedCmlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPackingHeadService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtScAttachedService;
import com.globaldenso.eca0027.core.auto.business.service.TtScHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvItemService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvService;
import com.globaldenso.eca0027.core.auto.business.service.TwInvoiceService;
import com.globaldenso.eca0027.core.business.dao.W6001DocDao;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws6001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6002RestService;
import com.globaldenso.eca0027.core.business.ws.Ws6004RestService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserService;

/**
 * The service interface of Documentation.
 * <br />Documentationのサービスインタフェースです。
 * <pre>
 * bean id: w6001DocService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14031 $
 */
public interface W6001DocService {
    
    // --- validateConsistency ---------------------------------------------------------------------
    /**
     * Date correlation check.
     * <br />日付相関チェック。
     * <pre>
     * - Do the correlation check of the start and end dates.
     *   Call the CommonService.validateFromToDate(String, String, String).
     * </pre>
     * <pre>
     * ‐開始日と終了日の相関チェックを行います。
     *     {@link CommonService#validateFromToDate(String, String, String)}を呼出します。
     * </pre>
     *
     * @param fmDate Start date<br />
     * 開始日
     * @param toDate End date <br />
     * 終了日
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateCorrelationDate(String fmDate, String toDate, String dateFormat)
        throws ApplicationException;
    
    /**
     * Check the required of FRT Shipper.
     * <br />FRT Shipperの必須チェックをします。
     * <pre>
     * Case of FRT (Group No. Sec! = 0), FRT Shipper if errors blank
     * FRT(Group No. sec != 0)の場合、FRT Shipperが空白の場合エラー
     * </pre>
     * 
     * @param frtShipperCd FRT Shipper
     * @param grpNo2 Group No. sec
     * @return True, false otherwise if FRT Shipper and FRT or if not FRT is input<br />
     * FRTでない場合 または FRTかつFRT Shipperが入力されている場合true、それ以外false
     * @throws ApplicationException A mandatory check of FRT Shipper can not be<br />
     * FRT Shipperの必須チェックができない場合
     */
    public boolean validateConsistencyFrtShipper(String frtShipperCd, String grpNo2)
        throws ApplicationException;
    
    /**
     * Check the required Remittance.
     * <br />Remittanceの必須チェックをします。
     * <pre>
     * In the case of "Remittance", Remittance or L/C will check whether it is input to be checked.
     * Remittance or L/C が「Remittance」の場合、チェック対象に入力されているかチェックします。
     * </pre>
     * 
     * @param remVal Check target<br />
     * チェック対象
     * @param remLcTyp Remittance or L/C
     * @return True if there is an input to be checked or, in the case of "L/C" and "Remittance"<br />
     * 「L/C」の場合 または 「Remittance」かつチェック対象に入力がある場合true
     * @throws ApplicationException A mandatory check of Remittance can not be<br />
     * Remittanceの必須チェックができない場合
     */
    public boolean validateConsistencyRemittance(String remVal, String remLcTyp) 
        throws ApplicationException;
    
    /**
     * Check the required L/C.
     * <br />L/Cの必須チェックをします。
     * <pre>
     * In the case of "L/C", Remittance or L/C will check whether it is input to be checked.
     * Remittance or L/C が「L/C」の場合、チェック対象に入力されているかチェックします。
     * </pre>
     * 
     * @param lcVal Check target<br />
     * チェック対象
     * @param remLcTyp Remittance or L/C
     * @return True if there is an input to be checked or, in the case of "Remittance" and "L/C"<br />
     * 「Remittance」の場合 または 「L/C」かつチェック対象に入力がある場合true
     * @throws ApplicationException A mandatory check of Remittance can not be<br />
     * Remittanceの必須チェックができない場合
     */
    public boolean validateConsistencyLc(String lcVal, String remLcTyp) 
        throws ApplicationException;
    
    /**
     * Calculate (Amount) crossing checking
     * <br />金額超過チェック
     * 
     * @param amount Checked Calculate (Amount) <br />
     * チェック対象金額
     * @param maxVal Maximum Calculate (Amount)<br />
     * 最大金額
     * @return Checked is true, false otherwise Calculate if the maximum of (Amount) below<br />
     * チェック対象が最大金額の桁数以下の場合true、それ以外false
     * @throws ApplicationException If (Amount) crossing checking is unable to Calculate<br />
     * 金額超過チェックができない場合
     */
    public boolean validateConsistencyAmountMaximum (BigDecimal amount, BigDecimal maxVal)
        throws ApplicationException;
    
    // --- validateDataBase ------------------------------------------------------------------------
    /**
     * FRT Invoice determine whether addition
     * <br />FRT Invoice追加可否判定
     * <pre>
     * - Invoice search
     *   Set the following items TtInvoiceDomain,
     *    Call the TtInvoiceService.searchByCondition(TtInvoiceCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     *  
     * - Do the following checks from the obtained result.
     *   [Manual uploaded Check]
     *     Failure to meet all of the following conditions, an error (NXS-E1-0037)
     *       - CANCEL_TYP = 'N'
     *       - MANUAL_FLG = 'Y'
     *       - MANUAL_TYP = '3 '
     *       - INVOICE_CLASS = 'M'
     * 
     *   [Cancelled Check]
     *     Do not meet all the following conditions, error (NXS-E7-0062)
     *       - CANCEL_FLG = 'Y'
     *   
     *   [Shipping Actuality Registered Check]
     *     Do not meet all the following conditions, error (NXS-E7-0063)
     *       - If Shipping Actuality No is not NULL
     * </pre>
     * <pre>
     * ‐インボイス検索
     *     {@link TtInvoiceDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     * 
     * ‐取得結果から以下のチェックを行います。
     *     [マニュアル アップロード対象チェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E1-0037)
     *         ‐CANCEL_TYP = 'N'
     *         ‐MANUAL_FLG = 'Y'
     *         ‐MANUAL_TYP = '3'
     *         ‐INVOICE_CLASS = 'M'
     *     
     *     [キャンセル済みチェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E7-0062)
     *         ‐CANCEL_FLG = 'Y'
     *     
     *     [船積実績登録済みチェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E7-0063)
     *         ‐船積実績NoがNULLではない場合
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Null normal, MESSAGE ID abnormal<br />
     * 正常時null、異常時メッセージID
     * @throws ApplicationException Can not FRT Invoice determine whether addition<br />
     * FRT Invoice追加可否判定が出来ない場合
     */
    public String validateDatabaseTtInvoiceOnMainUploadFrtInv(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    
    /**
     * Check of the transition conditions (Upload Non DN-G Inv. Or Re-Inv.)
     * <br />遷移条件のチェック(Upload Non DN-G Inv. or Re-Inv.)
     * <pre>
     * - Invoice search
     *   Set the following items W6001DocCriteriaDomain,
     *    Call the W6001DocDao.searchTtInvoiceByNonDnGInvOrReInv(W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - DELETE FLAG: 'N'
     * 
     * - Do the following checks from the obtained result .
     *   [Manual uploaded Check ]
     *     Failure to meet all of the following conditions , an error (NXS-E1-0037)
     *       " Upload Non DN-G Inv. Or Re-Inv. " No.8 processing screen name definition document _ECA0027_W6001_Invoice Main Screen.xls processing
     *       2.1.2 . Uploaded manual reference check
     * 
     *   [Cancelled Check ]
     *     Do not meet all the following conditions , error (NXS-E7-0062)
     *       - CANCEL_FLG = 'Y'
     * 
     *   [Shipping Actuality Registered Check ]
     *     Do not meet all the following conditions , error (NXS-E7-0063)
     *       - If Shipping Actuality No is not NULL
     * </pre>
     * <pre>
     * ‐インボイス検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByNonDnGInvOrReInv(W6001DocCriteriaDomain)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     *       ‐削除フラグ：'N'
     * 
     * ‐取得結果から以下のチェックを行います。
     *     [マニュアル アップロード対象チェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E1-0037)
     *         画面定義書_ECA0027_W6001_Invoice Main Screen.xls 処理No.8 処理名「Upload Non DN-G Inv. or Re-Inv.」
     *         2.1.2.マニュアル　アップロード対象チェック参照
     *     
     *     [キャンセル済みチェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E7-0062)
     *         ‐CANCEL_FLG = 'Y'
     *     
     *     [船積実績登録済みチェック]
     *       下記の条件をすべて満たさない場合、エラー(NXS-E7-0063)
     *         ‐船積実績NoがNULLではない場合
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param manualTyp (Used for return of acquisition VALUE) manual classification<br />
     * マニュアル種別（取得値の返却に使用）
     * @return Null normal time, Return the MESSAGE ID abnormal.<br />
     * 正常時null、異常時メッセージIDを返却します。
     * @throws ApplicationException Unable to check the transition conditions.<br />
     * 遷移条件のチェックが出来ない場合。
     */
    public String validateDatabaseTtInvoiceOnMainUploadNonDnGInvOrReInv(String shipperCd, String invoiceNo, Date invoiceIssueDt, String[] manualTyp)
        throws ApplicationException;
    
    /**
     * Cancel determination
     * <br />Cancel可否判定
     * 
     * @param invoiceDomain Invoice domain<br />
     * インボイスドメイン
     * @return Null normal time, Return the MESSAGE ID abnormal.<br />
     * 正常時null、異常時メッセージIDを返却します。
     * @throws ApplicationException Can not Cancel determination<br />
     * Cancel可否判定が出来ない場合
     */
    public String validateDatabaseTtInvoiceOnMainCancelInv(W6001DocInvoiceDomain invoiceDomain)
        throws ApplicationException;
    
    // --- callService 検索系 ----------------------------------------------------------------------
    /**
     * The data which coincides with the conditions specified in search condition area is displayed.
     * <br />検索条件エリアで指定した条件に一致するデータを表示する。
     * <pre>
     * - Get the number of search data
     *   with the name of the criteriaDomain, and calls W6001DocDao#serachCountTtInvoice(W6001DocCriteriaDomain).
     * 
     * - Get the right information
     *   Set the item to UserAuthDomain, can call UserAuthService#getUserAuthList(String...).
     * 
     * - Get search data
     *   with the name of the criteriaDomain, and calls W6001DocDao#searchForPagingTtInvoice(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * - 検索データ件数の取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTtInvoice(W6001DocCriteriaDomain)}を呼出します。
     * 
     * - 権限情報の取得
     *     {@link UserAuthDomain}に項目を設定し、{@link UserAuthService#getUserAuthList(String...)}を呼出します。
     * 
     * - 検索データの取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchForPagingTtInvoice(W6001DocCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchForPagingOnMainSearch(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Display in the Viewer PDF files of Invoice No selected.
     * <br />選択したインボイスNoのPDFファイルをViewerに表示する。
     * <pre>
     * - (Get the FILE ID) extraction of PDF file
     *   with the name of the criteriaDomain, call W6001DocDao.searchTtInvoiceByFileManager(W6001DocCriteriaDomain), to get the FILE ID
     * 
     * - (Get the FILE DATA) extraction of PDF file
     * 
     * - Binding of PDF file
     * </pre>
     * <pre>
     * - PDFファイルの抽出(FILE IDを取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceByFileManager(W6001DocCriteriaDomain)}を呼出し、ファイルIDを取得する
     * - PDFファイルの抽出(FILE DATAを取得)
     *     
     * - PDFファイルの結合
     * </pre>
     * 
     * @param criteria Criteria domain<br />
     * 抽出条件ドメイン
     * @return PDF document<br />
     * PDF帳票
     * @throws ApplicationException If the PDF file of Invoice No can not be created<br />
     * インボイスNoのPDFファイルが作成できない場合
     */
    public File searchOnMainPrintDocument(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Calculate the effective Calculate of (Amount).
     * <br />有効金額の算出をします。
     * <pre>
     * - Vat The calculation of the effective Calculate (Amount)
     * 
     * - Sub to calculate the Total Amount and Total
     * </pre>
     * <pre>
     * ‐Vatの有効金額を算出
     * 
     * ‐Sub TotalとTotal Amountを算出
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search results domain<br />
     * 検索結果ドメイン
     * @throws ApplicationException Calculation of the effective Calculate (Amount) could not be<br />
     * 有効金額の算出ができなかった場合
     */
    public W6001DocInvoiceDomain calculateAmount (W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    // ---------------------------------------------------------------------------------------------
    
    /**
     * Register to create Invoice contrast Palletize work, the selected data.
     * <br />選択したデータを、インボイス作成対照パレタイズワークに登録する。
     * <pre>
     * - Get the selected data
     *   with the name of the criteriaDomain, call W6001DocDao#searchTtPltzByCreate(W6001DocCriteriaDomain),
     *    Fet the data
     * 
     * - Registration processing of the selected data
     *   Set the item to TwInvPltzCriteriaDomain, call TwInvPltzService#create(TwInvPltzDomain)
     * </pre>
     * <pre>
     * - 選択したデータの取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltzByCreate(W6001DocCriteriaDomain)}を呼出し、
     *     データを取得する
     * - 選択データの登録処理
     *     {@link TwInvPltzDomain}に項目を設定し、{@link TwInvPltzService#create(TwInvPltzDomain)}を呼出す
     *     
     * </pre>
     * 
     * @param criteria W6001DocCriteriaDomain
     * @return update count
     * @throws ApplicationException If can not register<br />
     * 登録できない場合
     */
    public int createOnCreateUpdate(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Removal process of work group.
     * <br />ワークグループの削除処理。
     * <pre>
     * - Delete the Invoide Palletize Work
     *   Set the item to TwInvPltzCriteriaDomain, calling TwInvPltzService.deleteByCondition (TwInvPltzCriteriaDomain)
     * 
     * - Delete the Invoice created for Part Number work
     *   Set the item to TwInvItemCriteriaDomain, calling TwInvItemService.deleteByCondition (TwInvItemCriteriaDomain)
     * 
     * - Delete the Invoice Group Work
     *   Set the item to TwInvDomain, call TwInvService#deleteByCondition the (TwInvDomain)
     * 
     * - Delete the Invoice Work
     *   Set the item to TwInvoiceCriteriaDomain, calling TwInvoiceService.deleteByCondition (TwInvoiceCriteriaDomain)
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの削除
     *     {@link TwInvPltzCriteriaDomain}に項目を設定し、{@link TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}を呼出す
     * - インボイス作成対象品番ワークの削除
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}を呼出す
     * - インボイスグループワークの削除
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#deleteByCondition(TwInvCriteriaDomain)}を呼出す
     * - インボイスワークの削除
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}を呼出す
     *     
     * </pre>
     * 
     * @param criteria W6001DocCriteriaDomain
     * @throws ApplicationException Work group can not be removed<br />
     * ワークグループが削除できない場合
     */
    public void deleteOnCreateInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * In order to split the Invoice of Packing material of choice to update the work.
     * <br />選択した包装材のインボイスを分割するために、ワークを更新する。
     * <pre>
     * - Updated Invoice Item No Work
     *   Set the item to TwInvItemDomain, call TwInvItemService#updateByCondition the (TwInvItemDomain, TwInvItemCriteriaDomain)
     * 
     * - ※ re-display processing
     *   with the name of the criteriaDomain, call searchOnDetaiFrtlInit(W6001DocCriteriaDomain), to get the data
     * </pre>
     * <pre>
     * - インボイス作成対象品目番号ワークを更新
     *     {@link TwInvItemDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出す
     * - ※再表示処理
     *     criteriaDomainを引数にして、{@link W6001DocService#searchOnDetaiFrtlInit(W6001DocCriteriaDomain)}を呼出し、データを取得する
     *     
     * </pre>
     * 
     * @param criteria W6001DocCriteriaDomain
     * @return Search results<br />
     * 再検索結果
     * @throws ApplicationException Can not update<br />
     * 更新できない場合
     */
    public W6001DocInvoiceDomain deleteOnDetailFrtRemove(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Removal process of work group.
     * <br />ワークグループの削除処理。
     * <pre>
     * - Delete the Invoide Palletize Work
     *   Set the item to TwInvPltzCriteriaDomain, calling TwInvPltzService.deleteByCondition (TwInvPltzCriteriaDomain)
     * 
     * - Delete the Invoice created for Part Number work
     *   Set the item to TwInvItemCriteriaDomain, calling TwInvItemService.deleteByCondition (TwInvItemCriteriaDomain)
     * 
     * - Delete the Invoice Work
     *   Set the item to TwInvoiceCriteriaDomain, calling TwInvoiceService.deleteByCondition (TwInvoiceCriteriaDomain)
     * 
     * - Delete the Invoice Group Work
     *   Set the item to TwInvDomain, call TwInvService#deleteByCondition the (TwInvDomain)
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの削除
     *     {@link TwInvPltzCriteriaDomain}に項目を設定し、{@link TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}を呼出す
     * - インボイス作成対象品番ワークの削除
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}を呼出す
     * - インボイスワークの削除
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}を呼出す
     * - インボイスグループワークの削除
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#deleteByCondition(TwInvCriteriaDomain)}を呼出す
     *     
     * </pre>
     * 
     * @param criteria W6001DocCriteriaDomain
     * @throws ApplicationException Work group can not be removed<br />
     * ワークグループが削除できない場合
     */
    public void deleteOnHeaderInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Removal process of work group.
     * <br />ワークテーブルを削除します。
     * <pre>
     * 
     * - Delete the Invoice created for Part Number work
     *   Set the item to TwInvItemCriteriaDomain, calling TwInvItemService.deleteByCondition (TwInvItemCriteriaDomain)
     * 
     * - Delete the Invoide Palletize Work
     *   Set the item to TwInvPltzCriteriaDomain, calling TwInvPltzService.deleteByCondition (TwInvPltzCriteriaDomain)
     * 
     * - Delete the Invoice Group Work
     *   Set the item to TwInvCriteriaDomain, calling TwInvService.deleteByCondition (TwInvCriteriaDomain)
     * 
     * - Delete the Invoice Work
     *   Set the item to TwInvoiceCriteriaDomain, calling TwInvoiceService.deleteByCondition (TwInvoiceCriteriaDomain)
     * <pre>
     * - インボイス作成対象品番ワークの削除
     *     {@link TwInvItemService#deleteByCondition(TwInvItemCriteriaDomain)}を呼出します。
     *     
     * - インボイス作成対象パレタイズワークの削除
     *     {@link TwInvPltzService#deleteByCondition(TwInvPltzCriteriaDomain)}を呼出します。
     * - インボイスグループワークの削除
     *     {@link TwInvService#deleteByCondition(TwInvCriteriaDomain)}を呼出します。
     *     
     * - インボイスワークの削除
     *     {@link TwInvoiceService#deleteByCondition(TwInvoiceCriteriaDomain)}を呼出します。
     *     
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Work group can not be removed<br />
     * ワークテーブルの削除ができない場合
     */
    public void deleteOnInvGroupBackToMainScreen(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * The data which coincides with the conditions specified in search condition area is displayed.
     * <br />検索条件エリアで指定した条件に一致するデータを表示する。
     * <pre>
     * - Get the right information
     *   Set the item to UserAuthDomain, and call UserAuthService#getUserAuthList(String...), to get the search data
     * 
     * - ( If type = "A", the " container loading after customs clearance ") acquisition of data number search
     *   with the name of the criteriaDomain, call W6001DocDao.searchCountTtPltzByTypA(W6001DocCriteriaDomain),
     *    Get the number
     * 
     * - ( If type = "A", the " container loading after customs clearance ") acquisition of search data
     *   with the name of the criteriaDomain, call W6001DocDao.searchForPagingTtPltzByTypA(W6001DocCriteriaDomain),
     *    Get the search data
     * 
     * - ( If type = "B", and " after customs clearance container loading ") acquisition of data number search
     *   with the name of the criteriaDomain, call W6001DocDao.searchCountTtPltzByTypB(W6001DocCriteriaDomain),
     *    Get the number
     * 
     * - ( If type = "B", and " after customs clearance container loading ") acquisition of search data
     *   with the name of the criteriaDomain, call W6001DocDao.searchForPagingTtPltzByTypB(W6001DocCriteriaDomain),
     *    Get the search data
     * 
     * - ( In the case of type = "Z") acquisition of data number search
     *   with the name of the criteriaDomain, call W6001DocDao.searchCountTtPltzByTypZ(W6001DocCriteriaDomain),
     *    Get the number
     * 
     * - ( In the case of type = "Z") acquisition of search data
     *   with the name of the criteriaDomain, call W6001DocDao.searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain),
     *    Get the search data
     * </pre>
     * <pre>
     * - 権限情報の取得
     *     {@link UserAuthDomain}に項目を設定し、{@link UserAuthService#getUserAuthList(String...)}を呼出し、検索データを取得する
     * - 検索データ件数の取得(タイプ="A"、「バン詰め後通関」の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTtPltzByTypA(W6001DocCriteriaDomain)}を呼出し、
     *     件数を取得する
     * - 検索データの取得(タイプ="A"、「バン詰め後通関」の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchForPagingTtPltzByTypA(W6001DocCriteriaDomain)}を呼出し、
     *     検索データを取得する
     * - 検索データ件数の取得(タイプ="B"、「通関後バン詰め」の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTtPltzByTypB(W6001DocCriteriaDomain)}を呼出し、
     *     件数を取得する
     * - 検索データの取得(タイプ="B"、「通関後バン詰め」の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchForPagingTtPltzByTypB(W6001DocCriteriaDomain)}を呼出し、
     *     検索データを取得する
     * - 検索データ件数の取得(タイプ="Z"の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTtPltzByTypZ(W6001DocCriteriaDomain)}を呼出し、
     *     件数を取得する
     * - 検索データの取得(タイプ="Z"の場合）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain)}を呼出し、
     *     検索データを取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public List<? extends W6001DocPltzDomain> searchForPagingOnCreateSearch(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Get the information from Part Number export procedures per unit.
     * <br />輸出手続品番原単位から品番情報を取得する。
     * <pre>
     * - Get the Invoice Group Work data
     *   Set the item to TwInvCriteriaDomain, to call TwInvService.searchByCondition (TwInvCriteriaDomain), to obtain the data
     * 
     * - Data acquisition of Invoice Item No Work
     *   with the name of the criteriaDomain, call the W6001DocDao.searchTwInvItemByDetailFull(W6001DocCriteriaDomain), to get the data
     * 
     * - ( Get WEIGHT UNIT, WEIGHT of notation) data acquisition of Invoice Item No Work
     *   Set an item to the COMPANY CODE, to call CommonService.searchWeightUnit (String), to obtain the data
     * 
     * - Clear the Invoice Item No Work
     *   Set the item to TwInvItemCriteriaDomain, and call TwInvItemService#updateByCondition the (TwInvItemCriteriaDomain), to update the data
     * 
     * - Get information from Part Number export procedures per unit
     *   with the name of the criteriaDomain, call W6001DocDao.searchTmExpFormalitiItemNo(W6001DocCriteriaDomain), to get the data
     * 
     * - Register the Part information from export procedures Part intensity
     *   Set the item to TwInvItemCriteriaDomain, and call TwInvItemService#updateByCondition the (TwInvItemCriteriaDomain), to update the data
     * 
     * - Get UNIT PRICE error information
     *   with the name of the criteriaDomain, call W6001DocDao.searchCountTwInvItemByUnitPrice(W6001DocCriteriaDomain), to get the data
     * 
     * - Get HS CODE warning information
     *   Set the item to TwInvItemCriteriaDomain, to call TwInvItemService.searchCount (TwInvItemCriteriaDomain), to obtain the data
     * </pre>
     * <pre>
     * - インボイスグループワークデータを取得
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する
     * - インボイス作成対象品目番号ワークのデータ取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvItemByDetailFull(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - インボイス作成対象品目番号ワークのデータ取得（重量単位、重量表記の取得）
     *     会社コードに項目を設定し、{@link CommonService#searchWeightUnit(String)}を呼出し、データを取得する
     * - インボイス作成対象品目番号ワークをクリア
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを更新する
     * - 輸出手続品番原単位から品番情報を取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTmExpFormalitiItemNo(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - 輸出手続品番原単位から品番情報を登録
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを更新する
     * - 単価エラー情報を取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTwInvItemByUnitPrice(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - HS CODE 警告情報を取得
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#searchCount(TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * </pre>
     * 
     * @param criteria W6001DocCriteriaDomain
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If can not get the data<br />
     * データが取得できない場合
     */
    public W6001DocInvoiceDomain searchOnDetaiFrtlInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Display the details of the data that is selected in the Invoice Grouping screen.(In the case of transition from the Invoice Grouping screen)
     * <br />Invoice Grouping 画面で選択したデータの詳細を表示する(Invoice Grouping 画面からの遷移の場合)
     * <pre>
     * - Invoice Group Work data acquisition
     *   Set the item to TwInvCriteriaDomain, to call TwInvService.searchByCondition (TwInvCriteriaDomain), to obtain the data
     * 
     * - Invoide Palletize Work data acquisition
     *   with the name of the criteriaDomain, call W6001DocDao.searchTwInvPltzByDetail(W6001DocCriteriaDomain), to get the data
     *  
     * - Clear once from the work , the information obtained from the export procedures Part intensity
     *   Set the item to TwInvItemCriteriaDomain, and call TwInvItemService#updateByCondition the (TwInvItemCriteriaDomain), to obtain the data
     *
     * - Get information from Part Number export procedures per unit
     *   with the name of the criteriaDomain, call W6001DocDao.searchTmExpFormalitiItemNo(W6001DocCriteriaDomain), to get the data
     * 
     * - Register the Part information from export procedures Part intensity
     *   Set the item to TwInvCriteriaDomain, and call TwInvItemService#searchByCondition the (TwInvCriteriaDomain), to obtain the data
     *  
     * - Clear from the work once , the information obtained from CIGMA
     *   Set the item to TwInvItemCriteriaDomain, and call TwInvItemService#updateByCondition the (TwInvItemCriteriaDomain), to obtain the data
     *  
     * - Acquisition of information to be passed to the Web service
     *   Set the item to TwInvItemCriteriaDomain, to call TwInvItemService.searchByCondition (TwInvItemCriteriaDomain), to obtain the data
     *  
     * - Get Web service ECA0027_WS_6004 part number information from CIGMA: The call Get Sales Prince Info of (Sales Price MA information retrieval ) "
     *   Set the item to Ws6004RestDomain, and call Ws6004RestService#searchGetSalesPriceInfo the (Ws6004RestDomain), to obtain the data
     *  
     * - Register (currency , UNIT PRICE) part number information from CIGMA
     *   Set the item to TwInvItemCriteriaDomain, and call TwInvItemService#updateByCondition the (TwInvItemCriteriaDomain), to update the data
     *  
     * - Check multiple currencies is that it contains
     *   with the name of the criteriaDomain, call  W6001DocDao.searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain), to get the data
     *
     * - The determination of the error without UNIT PRICE
     *   Set the item to TwInvItemCriteriaDomain, to call TwInvItemService.searchByCondition (TwInvItemCriteriaDomain), to obtain the data
     *  
     * - Set the warning information CIGMA products, ERT products
     *   Set the item to TwInvItemCriteriaDomain, to call TwInvItemService.searchByCondition (TwInvItemCriteriaDomain), to obtain the data
     * </pre>
     * <pre>
     * - インボイスグループワークデータ取得
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する
     * - インボイス作成対象パレタイズワークデータ取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByDetail(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - 輸出手続品番原単位から取得する情報を、ワークから一度クリア
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * - 輸出手続品番原単位から品番情報を取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTmExpFormalitiItemNo(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - 輸出手続品番原単位から品番情報を登録
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvItemService#searchByCondition(TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * - CIGMAから取得する情報を、ワークから一度クリアする
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * - Webサービスに渡す情報の取得
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#searchByCondition(TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * - CIGMAから品番情報を取得 Webサービス「ECA0027_WS_6004：Get Sales Prince Info(Sales Price MA 情報検索)」のコール
     *     {@link Ws6004ParamDomain}に項目を設定し、{@link Ws6004RestService#getSalesPriceInfo(String, Ws6004ParamDomain)}を呼出し、データを取得する
     * - CIGMAから品番情報（通貨、単価）を登録
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを更新する
     * - 複数通貨が含まれているかをチェック
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * - 単価なしエラーの判定
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#searchByCondition(TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * - CIGMA品、ERT品の警告情報をセット
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#searchByCondition(TwInvItemCriteriaDomain)}を呼出し、データを取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public W6001DocInvoiceDomain searchOnDetailInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the data of the re-display of the screen.
     * <br />画面の再表示のデータを取得する。
     * <pre>
     * - Search process
     *   with the name of the criteriaDomain, call searchOnDetailInit(W6001DocCriteriaDomain), to get the data
     * </pre>
     * <pre>
     * - 検索処理
     *     criteriaDomainを引数にして、{@link W6001DocService#searchOnDetailInit(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public W6001DocInvoiceDomain searchOnDetailRefresh(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * And unit conversion in accordance with the Frt Shipper, Recalculate WEIGHT, of VOLUME.
     * <br />Frt Shipperに合わせた単位変換と、重量、容積の再計算をします。
     * <pre>
     * - Get unit
     *   Set an argument Frt Shipper, and calls CommonService.searchWeightUnit (String).
     * 
     * - Conversion of units
     *   Set the item VALUE, the conversion source unit, to the destination unit, call CommonService.convertWeightUnit(BigDecimal, String, String), to convert the data
     * </pre>
     * <pre>
     * - 単位の取得
     *     Frt Shipperを引数に設定し、{@link CommonService#searchWeightUnit(String)}を呼出します。
     * 
     * - 単位の変換
     *     値、変換元単位、変換先単位に項目を設定し、{@link CommonService#convertWeightUnit(BigDecimal,String,String)}を呼出し、データを変換する
     * 
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public W6001DocInvoiceDomain searchOnRegisterChangeFrtShipper(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquisition of FRT Shipper (combo box data)
     * <br />FRT Shipperの取得（コンボボックスデータ）
     * <pre>
     * - FRT acquisition of Shipper
     *  An argument W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByShipper(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐FRT Shipperの取得
     *    {@link W6001DocCriteriaDomain}を引数に、
     *    {@link W6001DocDao#searchTwInvPltzByShipper(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param addBlank Add blank line flag<br />
     * 空白行追加フラグ
     * @return Pull-down data of FRT Shipper<br />
     * Pull-down data of FRT ShipperFRT Shipperのプルダウンデータ
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzOnRegisterByFrtShipper(String dscId, boolean addBlank)
        throws ApplicationException;
    
    /**
     * Acquisition of FRT Consignee (combo box data)
     * <br />FRT Consigneeの取得（コンボボックスデータ）
     * <pre>
     * - FRT acquisition of Consignee
     *   An argument W6001DocCriteriaDomain,
     *    Call W6001DocDao.searchTwInvPltzByConsignee(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐FRT Consigneeの取得
     *     {@link W6001DocCriteriaDomain}を引数に、、
     *     {@link W6001DocDao#searchTwInvPltzByConsignee(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param grpNo1 Group No. first
     * @param addBlank Add blank line flag<br />
     * 空白行追加フラグ
     * @return Pull-down data of FRT Shipper<br />
     * FRT Consigneeのプルダウンデータ
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzOnRegisterByFrtConsignee(String dscId, String grpNo1, boolean addBlank)
        throws ApplicationException;
    
    // 2015/1/19 DNJP.Kawamura UT038対応 START >>>>>
    /**
     * Acquisition of FRT Consignee for Default (combo box data)
     * <br />FRT Consigneeの初期値の取得（コンボボックスデータ）
     * <pre>
     * - FRT acquisition of Consignee
     *   An argument W6001DocCriteriaDomain,
     *    Call W6001DocDao.searchTwInvPltzByConsignee(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐FRT Consigneeの取得
     *     {@link W6001DocCriteriaDomain}を引数に、、
     *     {@link W6001DocDao#searchTwInvPltzByConsignee(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param grpNo1 Group No. first
     * @return default data of FRT Shipper<br />
     * FRT Consigneeの初期値
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public String searchTwInvPltzOnRegisterByFrtConsigneeForDefault(String dscId, String grpNo1)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT038対応 END <<<<<
    
    /**
     * Acquisition of. Template No. Inv (combo box data)
     * <br />Inv. Template No.の取得（コンボボックスデータ）
     * <pre>
     * - Get Template No. Inv.
     *   An argument W6001DocCriteriaDomain,
     *    Call W6001DocDao.searchTmInvTplShipTo(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * - Inv. Template No.の取得
     *       {@link W6001DocCriteriaDomain}を引数に、
     *       {@link W6001DocDao#searchTmInvTplShipTo(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param shipperCd ShipperCd
     * @param invoiceCtgry InvoiceCategory
     * @param grpNo2 Group No.sec
     * @param addBlank Add blank line flag<br />
     * 空白行追加フラグ
     * @param attr Attribute of the select box to get<br />
     * 取得するセレクトボックスの属性
     * @return Pull-down data of Template No. Inv.<br />
     * インボイステンプレートのプルダウンデータ
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
//    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String grpNo2, boolean addBlank, String attr)
//        throws ApplicationException;
    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String shipperCd, String invoiceCtgry, String grpNo2, boolean addBlank, String attr)
        throws ApplicationException;
    // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<

    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * Acquisition of. Template No. Inv (combo box data) for default
     * <br />Inv. Template No.のデフォルト値取得（コンボボックスデータ）
     * <pre>
     * - Get Template No. Inv.
     *   An argument W6001DocCriteriaDomain,
     *    Call W6001DocDao.searchTmInvTplShipToForDefault(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * - Inv. Template No.の取得
     *       {@link W6001DocCriteriaDomain}を引数に、
     *       {@link W6001DocDao#searchTmInvTplShipToForDefault(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param shipperCd shipper code
     * @param shipToCd  ship to code
     * @param cmlTyp  CML type
     * @param invoiceCtgry invoice category
     * @return Pull-down data of FRT Shipper<br />
     * インボイステンプレートの初期値
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public W6001DocDomain searchTwInvOnRegisterByInvTmpNoForDefault(String dscId, String compCd, String shipperCd, String invoiceCtgry, String shipToCd, String cmlTyp)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * Acquisition of. Template No. Inv for FRT(combo box data)
     * <br />FRT用のInv. Template No.の取得（コンボボックスデータ）
     * <pre>
     * - Get Template No. Inv.
     *   An argument W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * - Inv. Template No.の取得
     *       {@link W6001DocCriteriaDomain}を引数に、
     *       {@link W6001DocDao#searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param frtShipperCd FRT Shipper
     * @param addBlank Add blank line flag<br />
     * 空白行追加フラグ
     * @param attr Attribute of the select box to get<br />
     * 取得するセレクトボックスの属性
     * @return Pull-down list of data Inv Tpl No for FRT<br />
     * FRT用のインボイステンプレートのプルダウンデータ
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNo(String dscId, String compCd, String frtShipperCd, String shipToCd, String cmlTyp, boolean addBlank, String attr)
//        throws ApplicationException;
    public List<? extends SelectListItemDomain> searchTwInvOnRegisterByInvTmpNoForFrt(String dscId, String compCd, String frtShipperCd, boolean addBlank, String attr)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<

    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * Acquisition of. Template No. Inv (combo box data) for FRT for default
     * <br />FRT用のInv. Template No.のデフォルト値取得（コンボボックスデータ）
     * <pre>
     * - Get Template No. Inv.
     *   An argument W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * - Inv. Template No.の取得
     *       {@link W6001DocCriteriaDomain}を引数に、
     *       {@link W6001DocDao#searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param frtShipperCd FRT Shipper
     * @param shipToCd ship to code
     * @param cmlTyp CML type
     * @return Pull-down list of data Inv Tpl No for FRT for Default<br />
     * FRT用のインボイステンプレートの初期値
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public W6001DocDomain searchTwInvOnRegisterByInvTmpNoForFrtForDefault(String dscId, String compCd, String frtShipperCd, String shipToCd, String cmlTyp)
        throws ApplicationException;
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * Get the Shipper (combo box data).
     * <br />Shipperを取得します（コンボボックスデータ）。
     * <pre>
     * - Search Invoide Palletize Work
     *   An argument W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByShipperCd(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐インボイス作成対象パレタイズワーク検索
     *     {@link W6001DocCriteriaDomain}を引数に、
     *     {@link W6001DocDao#searchTwInvPltzByShipperCd(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param addBlank Add blank line flag<br />
     * 空白行追加フラグ
     * @return Pull-down list of data Shipper<br />
     * Shipperのプルダウンリストデータ
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public List<? extends SelectListItemDomain> searchTwInvPltzByShipperCd(String dscId, boolean addBlank)
        throws ApplicationException;
    
    /**
     * Get the Operation No (Invoice Grouping Screen)
     * <br />Operation Noを取得します（Invoice Grouping Screen）
     * <pre>
     * - Search Invoide Palletize Work
     *   Set the following items W6001DocCriteriaDomain,
     *   Call W6001DocDao.searchTwInvPltzByOperationNo(W6001DocCriteriaDomain).
     *    ‐DSC-ID
     *    ‐C/C Type
     * </pre>
     * <pre>
     * ‐インボイス作成対象パレタイズワーク検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzByOperationNo(W6001DocCriteriaDomain)}を呼出します。
     *       ‐DSC-ID
     *       ‐C/C Type
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param customTimingTyp C/C TYPE
     * @return List of OperationNo that has been acquired<br />
     * 取得したOperationNoのリスト
     * @throws ApplicationException Can not get the data<br />
     * データを取得できない場合
     */
    public List<String> searchToolTipOnInvoiceGrouping (String dscId, String customTimingTyp) 
        throws ApplicationException;
    
    /**
     * Get the initial data of the display screen Invoice Register.(Transition from the details for the screen)
     * <br />Invoice Register 画面の初期表示データを取得します（詳細画面からの遷移時用）。
     * <pre>
     * - Screen display data acquisition
     *   An argument W6001DocCriteriaDomain
     *    Call W6001DocDao.searchTwInvByRegisterInit(W6001DocCriteriaDomain).
     * </pre>
     * <pre>
     * ‐画面表示データ取得
     *     {@link W6001DocCriteriaDomain}を引数に
     *     {@link W6001DocDao#searchTwInvByRegisterInit(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Display data obtained<br />
     * 取得した画面表示データ
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public List<? extends W6001DocInvoiceDomain> searchOnRegisterInitByFromDetail(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *  Get the initial data of the display screen Invoice Register.(Transition-time from the Main screen)
     * <br />Invoice Register 画面の初期表示データを取得します（Main画面からの遷移時用）。
     * <pre>
     * - Get the initial display information
     *   with the name of the criteriaDomain, call W6001DocDao.searchTtInvoiceByRegister(W6001DocCriteriaDomain), to get the data
     * </pre>
     * <pre>
     * - 初期表示情報の取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceByRegister(W6001DocCriteriaDomain)}を呼出し、データを取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Display data obtained<br />
     * 取得した画面表示データ
     * @throws ApplicationException Can not get the data<br />
     * データが取得できない場合
     */
    public W6001DocInvoiceDomain searchOnRegisterInitByFromMain(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * Extract the PDF file.
     * <br />PDFファイルを抽出します。
     * <pre>
     * - PDF output target acquisition of data
     *   Set the following items TtInvoiceCriteriaDomain,
     *    Call the (TtInvoiceCriteriaDomain) TtInvoiceService.searchByKey.
     *     - SHIPPER CODE screen
     *     - Invoice No of screen
     *     - INVOICE ISSUE DATE of the screen
     * 
     * - FILE ID acquisition
     *   Set the following items W6001DocCriteriaDomain,
     *    Call W6001DocDao.searchTtInvoiceByFileManager(W6001DocCriteriaDomain).
     *     - SHIPPER CODE screen
     *     - PDF Invoice No parent that has been acquired in the output target data
     *     - INVOICE ISSUE DATE of the screen
     *     
     * - PDF file extraction
     *   With the name of each FILE DATA associated with their FILE ID that has been acquired,
     *    Call FileManagementService.searchFileDownload(String, boolean, OutputStream).
     * 
     * - Binding of PDF file
     *   Call (String, java.io.InputStream ...) the CommonService.mergePdf.
     * </pre>
     * <pre>
     * ‐PDF出力対象データの取得
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByKey(TtInvoiceCriteriaDomain)}を呼出します。
     *       ‐画面の荷主コード
     *       ‐画面のインボイスNo
     *       ‐画面のインボイス発行日
     * 
     * ‐ファイルID取得
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTtInvoiceByFileManager(W6001DocCriteriaDomain)}を呼び出します。
     *       ‐画面の荷主コード
     *       ‐PDF出力対象データで取得した親インボイスNo
     *       ‐画面のインボイス発行日
     * 
     * ‐PDFファイルの抽出
     *     取得したファイルIDに紐付くファイルデータをそれぞれ引数にして、
     *     {@link FileManagementService#searchFileDownload(String, boolean, OutputStream)}を呼び出します。
     *     
     * - PDFファイルの結合
     *     {@link CommonService#mergePdf(String, java.io.InputStream...)}を呼び出します。
     * </pre>
     * 
     * @param criteria Criteria domain<br />
     * 抽出条件ドメイン
     * @return PDF file that is extracted<br />
     * 抽出したPDFファイル
     * @throws ApplicationException Can not extract the PDF file.<br />
     * PDFファイルを抽出できない場合。
     */
    public File searchOnRegisterPrintDocument(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
        
    /**
     * Do the initial display takes over the information from the pre-transition screen.
     * <br />遷移前画面から情報を引き継ぎ初期表示を行う。
     * <pre>
     * - Get CANCEL FLAG parent of Invoice
     *   with the name of the criteriaDomain, call TtInvoiceService#searchByKey(W6001DocCriteriaDomain),
     *    Get the CANCEL FLAG information
     * 
     * - Get the initial display information
     *   with the name of the criteriaDomain, call W6001DocDao.searchTtInvoiceByUploadInit(W6001DocCriteriaDomain),
     *    Get the initial display information
     * 
     * - Get COUNTRY CODE associated with their login's
     *   Set the item to TmNxsCompCriteriaDomain, to call TmNxsCompService.searchByCondition (TmNxsCompCriteriaDomain), to get the search data
     * </pre>
     * <pre>
     * - 親インボイスのキャンセルフラグを取得
     *     criteriaDomainを引数にして、{@link TtInvoiceService#searchByKey(TtInvoiceCriteriaDomain)}を呼出し、
     *     キャンセルフラグ情報を取得する
     * - 初期表示情報の取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceByUploadInit(W6001DocCriteriaDomain)}を呼出し、
     *     初期表示情報を取得する
     * - ログイン者に紐付く国コードの取得
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、検索データを取得する
     *     
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not display the initial<br />
     * 初期表示ができない場合
     */
    public W6001DocInvoiceDomain searchOnUploadInit(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
        
        
    /**
     * Without an operation on Invoice No., Which is currently displayed on the screen, Get the data of Invoice Invoice No. Following.
     * <br />現在画面に表示されているInvoice No.に対して処理をせずに、次のInvoice No.のインボイスデータを取得する。
     * <pre>
     * - Get Invoice data
     *   Set the item to TtInvoiceCriteriaDomain, to call TtInvoiceService.searchByCondition (TtInvoiceCriteriaDomain), to get the search data
     * </pre>
     * <pre>
     * - インボイスデータの取得
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、検索データを取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    // ST946 MANUAL SCREEN TRANSITION DEL
    //public List<? extends TtInvoiceDomain> searchOnUpdateSkip(W6001DocCriteriaDomain criteria)
    //    throws ApplicationException;
        
    
    /**
     * Set the initial VALUE the search criteria area.
     * <br />検索条件エリアに初期値を設定する。
     * <pre>
     * - (In the case of "container loading after customs clearance") if Session of (W6003.C / C TYPE) = "A" 
     *   Retrieval data
     *     with the name of the criteriaDomain, call W6001DocDao.searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain),
     *     Get the search data
     * 
     * - (In the case of "after customs clearance container loading") if Session of (W6003.C / C TYPE) = "B"
     *   Retrieval data
     *     with the name of the criteriaDomain, call  W6001DocDao.searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain),
     *      Get the search data
     * 
     * - Session of the case (W6003.C / C TYPE) = "Z"
     *   Retrieval data
     *     with the name of the criteriaDomain, call W6001DocDao.searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain),
     *     Get the search data
     * 
     * - Get Shipper
     *   with the name of the criteriaDomain, cal  W6001DocDao.searchTwInvPltzByShipperCd(W6001DocCriteriaDomain),
     *    Get the information Shipper
     * </pre>
     * <pre>
     * - Session(W6003.C/C TYPE) = "A"　の場合　（「バン詰め後通関」の場合）
     *     検索データの取得
     *         criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain)}を呼出し、
     *         検索データを取得する
     * - Session(W6003.C/C TYPE) = "B"　の場合　（「通関後バン詰め」の場合）
     *     検索データの取得
     *         criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain)}を呼出し、
     *         検索データを取得する
     * - Session(W6003.C/C TYPE) = "Z"　の場合
     *     検索データの取得
     *         criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain)}を呼出し、
     *         検索データを取得する
     * - Shipperの取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByShipperCd(W6001DocCriteriaDomain)}を呼出し、
     *     Shipper情報を取得する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return The results list of Shipper: PltzList2 result list of Operation No: Search Results PltzList.<br />
     * 検索結果
     *            PltzList :Operation No.の結果リスト
     *            PltzList2:Shipperの結果リスト
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public W6001DocInvoiceDomain searchOnInvGroupInit(W6001DocCriteriaDomain criteria)
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
     * Shipper to each configured to search, performing the grouping in the Invoice unit, Get the result.
     * <br />検索条件に設定されたShipperごとに、インボイス単位でグルーピングを行い、その結果を取得します。
     * <pre>
     * - Grouping of information created Invoice
     *   Set to the argument W6001DocCriteriaDomain,
     *    Call W6001DocServiceImpl.createInvoiceGroupingInformation(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain).
     * 
     * - Create screen display information
     *   Set the following items TwInvCriteriaDomain,
     *    Call TwInvService.searchByCondition(TwInvCriteriaDomain).
     *     - SHIPPER CODE SEARCH
     *     - Login DSC-ID of the search condition
     *     - DISPLAY ORDER: GRP_NO_1, GRP_NO_2 (ascending)
     * </pre>
     * <pre>
     * - インボイスのグルーピング情報作成
     *     {@link W6001DocCriteriaDomain}を引数に設定し、
     *     {@link W6001DocServiceImpl#createInvoiceGroupingInformation}を呼び出します。
     *     
     * - 画面表示情報の作成
     *     {@link TwInvCriteriaDomain}に以下の項目を設定し、
     *     {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出します。
     *       - 検索条件の荷主コード
     *       - 検索条件のログインDSC-ID
     *       - 表示順: GRP_NO_1, GRP_NO_2(昇順)
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return List of {@link TwInvDomain}
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public List<? extends TwInvDomain> transactOnInvGroupSearch(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * The numbering the Invoice No., To register the Invoice data. Create a (PDF) customs documents.
     * <br />インボイスNo.を採番し、インボイスデータを登録する。通関書類（PDF）を作成する。
     * <pre>
     * 9 (functional specification)
     * - (To be deleted from this method to invoke from facadeservice this process) Calculate calculation of (Amount)
     *   Set the item to W6001DocCriteriaDomain, call {@link W6001DocService#calculateAmount(W6001DocCriteriaDomain)}, to obtain the data.
     * 
     * <9 (tentative)>
     * << Create a temporary Invoice data (= officially registered before). >>
     * - Extraction of container No.
     *     with the name of the criteriaDomain, call {@link W6001DocDao#searchTwInvPltzByContainerNo(W6001DocCriteriaDomain)}, to obtain the data.
     * - Sales contract to determine whether or not the need
     *     Set the item to the {@link TmNxsCompCriteriaDomain}, call {@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}, to get the data.
     * - Judge Re-Invoice is whether or not it is necessary
     *     Set the item to the {@link TmCigmaCustomerXrefCriteriaDomain}, call {@link TmCigmaCustomerXrefService#searchByCondition(TmCigmaCustomerXrefCriteriaDomain)}, to get the data.
     * - Updated Invoice Item No Work
     *     Set the item to the {@link TwInvItemDomain}, call {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}, to get the data.
     * - Register necessity provisional Invoice No, of Re-Invoice, the necessity of the sales contract Invoice Group Work.
     *     Set the item to the {@link TwInvCriteriaDomain}, call {@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}, to get the data.
     * - Register the data in table Invoice Work
     *     Set the item to the {@link TwInvoiceDomain}, call {@link TwInvoiceService#create(TwInvoiceDomain)}, to get the data.
     * - Get Invoice number of the same group No.
     *     Set the item to the {@link TwInvCriteriaDomain}, call {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}, to get the data.
     * - Get the number of provisional Invoice No are numbered.
     *     Set the item to the {@link TwInvCriteriaDomain}, call {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}, to get the data.
     * - (Acquisition of initial information display) screen redraw
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTwInvoiceByRegister(W6001DocCriteriaDomain)}, to obtain the data.
     * - (Get the item FREE SERVER NAME) necessary item acquisition process
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTwInvByFree(W6001DocCriteriaDomain)}, to obtain the data.
     * - (Acquisition of Shipping Document template information) necessary item acquisition process
     *     Set the item to the {@link TmInvTplCriteriaDomain}, call {@link TmInvTplService#searchByCondition(TmInvTplCriteriaDomain)}, to get the data.
     * 
     * <9 (provisional → positive)>
     * << Registration process regular Invoice No. >>
     * - Get regular numbering target data Invoice No.
     *     Set the item to the {@link TwInvCriteriaDomain}, call {@link TwInvService#searchByCondition(TwInvCriteriaDomain)}, to get the data.
     * - Lock main Invoice Sequence Master
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}, to get the data.
     * - Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}, to get the data.
     * - Registration of regular Invoice No. to the work table (Invoice Number created for work) 
     *     Set the item to the {@link TwInvItemCriteriaDomain}, call {@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}, to get the data.
     * - Registration of regular Invoice No to the Invoice Group Work.
     *     Set the item to the {@link TwInvCriteriaDomain}, call {@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}, to get the data.
     * - (Registration of INVOICE_NO) registration of regular Invoice No to Invoice Work.
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}, to get the data.
     * - (Registration of PAR_INVOICE_NO) registration of regular Invoice No to Invoice Work.
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}, to get the data.
     * - Registration of regular Invoice No. to Invoice Work (RELATE_INVOICE_NO)
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}, to get the data.
     * - Lock main Invoice Sequence Master
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}, to get the data.
     * - Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}, to get the data.
     * - (Registration of INVOICE_NO) registration of Re-Invoice No to Invoice Work.
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}, to get the data.
     * - Registration of Re-Invoice No. to Invoice Work (RELATE_INVOICE_NO)
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}, to get the data.
     * - To be registered with the regular table (Invoice)
     *     Set the item to the {@link TtInvoiceDomain}, call {@link TtInvoiceService#create(TtInvoiceDomain)}, to get the data .
     * - To be registered with the regular table (Invoice Header)
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}, to get the data .
     * - To be registered with the regular table (Packing Header)
     *     Set the item to the {@link TtPackingHeadDomain}, call {@link TtPackingHeadService#create(TtPackingHeadDomain)}, to get the data .
     * - From the work table , ( data taken from the Country Master) registered in the regular table , the data obtained by numbering the regular Invoice No.
     *     Set the item to the {@link TmCntryCriteriaDomain}, call {@link TmCntryService#searchByKey(TmCntryCriteriaDomain)}, to get the data .
     * - From the work table , the regular registration table (Invoice Attachi registration ) , the data obtained by numbering the regular Invoice No.
     *     Set the item to the {@link TtInvoiceAttachedDomain}, call {@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}, to get the data .
     * - From the work table , the regular registration table (ORIGIN COUNTRY display control ) , data obtained by numbering the regular Invoice No.
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#searchByCondition(TwInvoiceCriteriaDomain)}, to get the data .
     * - From the work table , ( data taken from the Invoice Work) officially registered table , the data obtained by numbering the regular Invoice No.
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}, to get the data .
     * - To be registered with the regular table ( packing attach CML)
     *     Set the item to the {@link TtPackingAttachedCmlDomain}, call {@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}, to get the data .
     * - To be registered with the regular table ( attach packing number)
     *     Set the item to the {@link TtPackAtchItemNoDomain}, call {@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}, to get the data .
     * - To be registered with the regular table (Sales Contract Header)
     *     Set the item to the {@link TtScHeaderDomain}, call {@link TtScHeaderService#create(TtScHeaderDomain)}, to get the data .
     * - To be registered with the regular table (Sales Contract Attached)
     *     Set the item to the {@link TtScAttachedDomain}, call {@link TtScAttachedService#create(TtScAttachedDomain)}, to get the data .
     * - Create a PDF file
     *     call {@link L6001ReportService#searchInvHdrForCmrclIntang(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6002ReportService#searchInvHdrForNonCmrcl(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6003ReportService#searchIvnHdrForFrt(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6004ReportService#searchInvAtchedForMain(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6005ReportService#searchInvAtchedForRt(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6006ReportService#searchPackHdrForMain(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6007ReportService#searchPackHdrForFrt(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6009ReportService#searchPackAtchedForFrt(String, String, Date, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6010ReportService#searchPackAtchedForErt(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6011ReportService#searchSalesCntrctHdrForCmrclIntang(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6012ReportService#searchSalesCntrctHdrForNonCmrcl(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6013ReportService#searchSalesCntrctHdrForFrt(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6014ReportService#searchSalesCntrctAtchedForMain(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6015ReportService#searchSalesCntrctAtchedForRt(String, String, Date, String, String, String)}, to get the data .
     * - ( Registered in the File Manage table ) storage of PDF
     *     call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}, to get the data .
     * - FILE ID update process of Invoice Header
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - FILE ID update process of Packing Header
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call {@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}, to get the data .
     * - FILE ID update process of the Sales Contract Header
     *     Set the item to the {@link TtScHeaderCriteriaDomain}, call {@link TtScHeaderService#updateByCondition(TtScHeaderDomain, TtScHeaderCriteriaDomain)}, to get the data .
     * - ( Search Invoice Work) registration of regular data table
     *     Set the item to the {@link TwInvoiceCriteriaDomain}, call {@link TwInvoiceService#searchByCondition(TwInvoiceCriteriaDomain)}, to get the data .
     * - ( Registration of Invoice Header) registration of data of Re-Invoice
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}, to get the data .
     * - ( Registration of Invoice) registration of data of Re-Invoice
     *     Set the item to the {@link TtInvoiceDomain}, call {@link TtInvoiceService#create(TtInvoiceDomain)}, to get the data .
     * - Lock Palletize
     *     Set the item to the {@link TtPltzCriteriaDomain}, call {@link TtPltzService#lockByKey(TtPltzCriteriaDomain)}, to get the data .
     * - Update  Palletize
     *     Set the item to the {@link TtPltzCriteriaDomain}, call {@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)} , to get the data .
     * - (Update Temp Stock) subtraction of Temp Stock
     *     Set the item to the {@link TtTmpStockCriteriaDomain}, call {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}, to get the data .
     * - ( Get the update source information ) subtraction of Temp Stock
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltzByRegister(W6001DocCriteriaDomain)}, to obtain the data .
     * - ( Lock Temp Stock) subtraction of Temp Stock
     *     Set the item to the {@link TtTmpStockCriteriaDomain}, call {@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}, to get the data .
     * - ( Get the update source information ) adding SHIPPED QUANTITY, the number of shipping instructions
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltzItemOdr(W6001DocCriteriaDomain)}, to obtain the data .
     * - ( Rock the Export Receive Order) adding SHIPPED QUANTITY, the number of shipping instructions
     *     Set the item to the {@link TtExpRcvOdrCriteriaDomain}, call {@link TtExpRcvOdrService#lockByKey(TtExpRcvOdrCriteriaDomain)}, to get the data .
     * - (Update Export Receive Order) adding SHIPPED QUANTITY, the number of shipping instructions
     *     Set the item to the {@link TtExpRcvOdrCriteriaDomain}, call {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}, to get the data .
     * - Screen refresh
     *     Set the item to the {@link W6001DocCriteriaDomain}, call {@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}, to get the data .
     * 
     * << CIGMA products (CML_TYP = "1"), with respect to CIGMA, >> to perform the sales and orders and stock registration
     * - Acquisition of information to be passed to the Web service (header part)
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)}, to obtain the data.
     * - Acquisition of information to be passed to the Web service (detailed part)
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtInvoiceAttached(W6001DocCriteriaDomain)}, to obtain the data.
     * - Web services.: Call "ECA0027_WS_6001 Regist Sales, Order, Inventory (sales, orders and stock registration)" of
     *     Set the item to the {@link Ws6001ParamDomain}, call {@link Ws6001RestService#registSalesOdrInvntry(String, Ws6001ParamDomain)}, to get the data.
     * </pre>
     * <pre>
     * 9(機能仕様) 
     * - 金額の算出 (この処理はfacadeserviceから呼びだす このメソッドからは削除する)
     *     {@link W6001DocCriteriaDomain}に項目を設定し、{@link W6001DocService#calculateAmount(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     *   
     *<9(仮)>
     *<<仮（＝正式登録前）のインボイスデータを作成する。>>
     * - コンテナNo.の抽出
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvPltzByContainerNo(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - セールスコントラクトが必要か否かを判断する
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する。
     * - リインボイスが必要か否かを判断する
     *     {@link TmCigmaCustomerXrefCriteriaDomain}に項目を設定し、{@link TmCigmaCustomerXrefService#searchByCondition(TmCigmaCustomerXrefCriteriaDomain)}を呼出し、データを取得する。
     * - インボイス作成対象品目番号ワークを更新
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスグループワークに仮インボイスNo.、リインボイスの要否、セールスコントラクトの要否を登録
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークテーブルにデータを登録
     *     {@link TwInvoiceDomain}に項目を設定し、{@link TwInvoiceService#create(TwInvoiceDomain)}を呼出し、データを取得する。
     * - 同じグループNo.のインボイス件数を取得
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する。
     * - 仮インボイスNo.が採番されている件数を取得
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する。
     * - 画面の再表示(初期表示情報の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvoiceByRegister(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 必要項目取得処理(FREE項目名称の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTwInvByFree(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 必要項目取得処理(船積書類テンプレート情報の取得)
     *     {@link TmInvTplCriteriaDomain}に項目を設定し、{@link TmInvTplService#searchByCondition(TmInvTplCriteriaDomain)}を呼出し、データを取得する。
     *<9(仮→正)>
     *<<正規インボイスNo.登録処理を行う。>>
     * - 正規インボイスNo.採番対象データの取得
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#searchByCondition(TwInvCriteriaDomain)}を呼出し、データを取得する。
     * - メインインボイス採番原単位をロック
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - ワークテーブルへの正規インボイスNo.の登録(インボイス作成対象品番ワーク)
     *     {@link TwInvItemCriteriaDomain}に項目を設定し、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスグループワークへの正規インボイスNo.の登録
     *     {@link TwInvCriteriaDomain}に項目を設定し、{@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークへの正規インボイスNo.の登録(INVOICE_NOの登録)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークへの正規インボイスNo.の登録(PAR_INVOICE_NOの登録)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークへの正規インボイスNo.の登録(RELATE_INVOICE_NO)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - メインインボイス採番原単位をロック
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークへのリインボイスNo.の登録（INVOICE_NOの登録）
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - インボイスワークへのリインボイスNo.の登録(RELATE_INVOICE_NO)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#updateByCondition(TwInvoiceDomain, TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(インボイス）
     *     {@link TtInvoiceDomain}に項目を設定し、{@link TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(インボイスヘッダ）
     *     {@link TtInvoiceHeaderDomain}に項目を設定し、{@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(パッキングヘッダ）
     *     {@link TtPackingHeadDomain}に項目を設定し、{@link TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを取得する。
     * - 正規インボイスNo.を採番したデータを、ワークテーブルから、正規テーブルに登録(国原単位からデータ取得)
     *     {@link TmCntryCriteriaDomain}に項目を設定し、{@link TmCntryService#searchByKey(TmCntryCriteriaDomain)}を呼出し、データを取得する。
     * - 正規インボイスNo.を採番したデータを、ワークテーブルから、正規テーブルに登録(インボイスアッタチ登録)
     *     {@link TtInvoiceAttachedDomain}に項目を設定し、{@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}を呼出し、データを取得する。
     * - 正規インボイスNo.を採番したデータを、ワークテーブルから、正規テーブルに登録(原産国表示制御)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#searchByCondition(TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - 正規インボイスNo.を採番したデータを、ワークテーブルから、正規テーブルに登録(インボイスワークからデータ取得)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(パッキングアタッチCML）
     *     {@link TtPackingAttachedCmlDomain}に項目を設定し、{@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(パッキングアタッチ品番）
     *     {@link TtPackAtchItemNoDomain}に項目を設定し、{@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(セールスコントラクトヘッダ）
     *     {@link TtScHeaderDomain}に項目を設定し、{@link TtScHeaderService#create(TtScHeaderDomain)}を呼出し、データを取得する。
     * - 正規テーブルへの登録処理(セールスコントラクトアタッチ）
     *     {@link TtScAttachedDomain}に項目を設定し、{@link TtScAttachedService#create(TtScAttachedDomain)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6001ReportService#searchInvHdrForCmrclIntang(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6002ReportService#searchInvHdrForNonCmrcl(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6003ReportService#searchIvnHdrForFrt(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6004ReportService#searchInvAtchedForMain(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6005ReportService#searchInvAtchedForRt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6006ReportService#searchPackHdrForMain(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6007ReportService#searchPackHdrForFrt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6009ReportService#searchPackAtchedForFrt(String, String, Date, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6010ReportService#searchPackAtchedForErt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6011ReportService#searchSalesCntrctHdrForCmrclIntang(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6012ReportService#searchSalesCntrctHdrForNonCmrcl(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6013ReportService#searchSalesCntrctHdrForFrt(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6014ReportService#searchSalesCntrctAtchedForMain(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6015ReportService#searchSalesCntrctAtchedForRt(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFの保管(ファイル管理テーブルへの登録)
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出し、データを取得する。
     * - インボイスヘッダのファイルID更新処理
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - パッキングヘッダのファイルID更新処理
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - セールスコントラクトヘッダのファイルID更新処理
     *     {@link TtScHeaderCriteriaDomain}に項目を設定し、{@link TtScHeaderService#updateByCondition(TtScHeaderDomain, TtScHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - 正規テーブルのデータの登録(インボイスワークの検索)
     *     {@link TwInvoiceCriteriaDomain}に項目を設定し、{@link TwInvoiceService#searchByCondition(TwInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - リインボイスのデータの登録(インボイスヘッダの登録)
     *     {@link TtInvoiceHeaderDomain}に項目を設定し、{@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを取得する。
     * - リインボイスのデータの登録(インボイスの登録)
     *     {@link TtInvoiceDomain}に項目を設定し、{@link TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを取得する。
     * - パレタイズをロック
     *     {@link TtPltzCriteriaDomain}に項目を設定し、{@link TtPltzService#lockByKey(TtPltzCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズの更新
     *     {@link TtPltzCriteriaDomain}に項目を設定し、{@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の減算(仮在庫の更新)
     *     {@link TtTmpStockCriteriaDomain}に項目を設定し、{@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の減算(更新元情報の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltzByRegister(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の減算(仮在庫をロック)
     *     {@link TtTmpStockCriteriaDomain}に項目を設定し、{@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の加算(更新元情報の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltzItemOdr(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の加算(輸出受注をロック)
     *     {@link TtExpRcvOdrCriteriaDomain}に項目を設定し、{@link TtExpRcvOdrService#lockByKey(TtExpRcvOdrCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の加算(輸出受注の更新)
     *     {@link TtExpRcvOdrCriteriaDomain}に項目を設定し、{@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出し、データを取得する。
     * - 画面の再表示
     *     {@link W6001DocCriteriaDomain}に項目を設定し、{@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     *<<CIGMA品（CML_TYP = "1"）は、CIGMAに対し、売上・受注・在庫登録を行う>>
     * - Webサービスに渡す情報の取得(ヘッダ部分）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - Webサービスに渡す情報の取得(明細部分）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceAttached(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - .Webサービス「ECA0027_WS_6001：Regist Sales, Order, Inventory(売上・受注・在庫登録)」のコール
     *     {@link Ws6001ParamDomain}に項目を設定し、{@link Ws6001RestService#registSalesOdrInvntry(String, Ws6001ParamDomain)}を呼出し、データを取得する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search conditions domain of search results (re-display)<br />
     * 検索結果の検索条件ドメイン（再表示）
     * @throws ApplicationException Can not Register processing, data reacquisition<br />
     * Register処理、データ再取得ができない場合
     */
    public W6001DocInvoiceDomain transactOnRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    
    /**
     * To be uploaded to the database along with the information of each screen item on the screen a PDF file that specify.
     * <br />指定したPDFファイルを画面の各画面項目の情報と共にデータベースにアップロードする。
     * <pre>
     * - Get information Shipper
     *     Set the item to TmNxsCompCriteriaDomain, call { @link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}, to obtain the data .
     * - Get information Consignee
     *     Set the item to the {@link TmNxsCompCriteriaDomain}, call {@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}, to get the data .
     * - Get information ShipTo
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTmExpShipToShipping(W6001DocCriteriaDomain)}, to obtain the data .
     * - Get Inv Category information .
     *     Set the item to the {@link TmCdCriteriaDomain}, call {@link TmCdService#searchByCondition(TmCdCriteriaDomain)}, to get the data .
     * - Get information Trans_Way
     *     Set the item to the {@link TmCdCriteriaDomain}, call {@link TmCdService#searchByCondition(TmCdCriteriaDomain)}, to get the data .
     * - Get information Carrier
     *     Set the item to the {@link TmNxsCompCriteriaDomain}, call {@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}, to get the data .
     * - Get login Information
     *     Set the item to the {@link TmUserCriteriaDomain}, call {@link TmUserService#searchByKey(TmUserCriteriaDomain)}, to get the data .
     * - Get information Freight Res.
     *     Set the item to the {@link TmCdCriteriaDomain}, call {@link TmCdService#searchByCondition(TmCdCriteriaDomain)}, to get the data .
     * - Get information Payment Method
     *     Set the item to the {@link TmCdCriteriaDomain}, call {@link TmCdService#searchByCondition(TmCdCriteriaDomain)}, to get the data .
     * - ( Registration File Manage) Invoice / Invoice Attach
     *     call {@link FileManagementService#createFileUpload(InputStream, String, Number, String) }, to get the data .
     * - ( Registration File Manage) Packing List / Packing List Attach
     *     call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}, to get the data .
     * - Registration of Re-Invoice (Invoice update )
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - Registration of Re-Invoice (Invoice Header Updated )
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call  {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice: Delete files of Invoice Header: FILE DATA Delete (common parts used)
     *     call {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)} , to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice: Delete files of packing : FILE DATA Delete (common parts used)
     *     call {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)} , to get the data .
     * - ( Get the FILE_ID) Delete files of Invoice
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call {@link TtInvoiceHeaderService#searchByCondition(TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - ( Get the FILE_ID) Delete files of packing
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call  {@link TtPackingHeadService#searchByCondition(TtPackingHeadCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice:. Invoice registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call  {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice:. Invoice Header registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call  {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice:. Invoice Attached registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtInvoiceAttachedCriteriaDomain}, call {@link TtInvoiceAttachedService#updateByCondition(TtInvoiceAttachedDomain, TtInvoiceAttachedCriteriaDomain)}, to get the data .
     * - Packing Header registration in the Invoice No. post-update ( update )
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call {@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice:. Packing Attached CML registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtPackingAttachedCmlCriteriaDomain}, call {@link TtPackingAttachedCmlService#updateByCondition(TtPackingAttachedCmlDomain, TtPackingAttachedCmlCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice:. Packing Attached Item No registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtPackAtchItemNoCriteriaDomain}, call  {@link TtPackAtchItemNoService#updateByCondition(TtPackAtchItemNoDomain, TtPackAtchItemNoCriteriaDomain)}, to get the data .
     * - Registration (with change Invoice No.) Non DN-G Invoice: change ( update ) the parent Invoice No of FRT Invoice associated with this mapping .
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - Updated ( Updated ) Invoice No. of Palletize table
     *     Set the item to the {@link TtPltzCriteriaDomain}, call {@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}, to get the data .
     * - Registration of ( no change Invoice No.) Non DN-G Invoice:. Invoice registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - Registration of ( no change Invoice No.) Non DN-G Invoice:. Invoice Header registration in the Invoice No post-update ( update )
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - Update Packing Header
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call {@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}, to get the data .
     * - Registration of Manual Invoice: Invoice registration
     *     Set the item to the {@link TtInvoiceDomain}, call {@link TtInvoiceService#create(TtInvoiceDomain)}, to get the data .
     * - Registration of Manual Invoice: Invoice Header registration
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}, to get the data .
     * - Registration of Manual Invoice: Packing Header registration
     *     Set the item to the {@link TtPackingHeadDomain}, call {@link TtPackingHeadService#create(TtPackingHeadDomain)}, to get the data .
     * - Registration of registration Cancel Invoice : Invoice registration
     *     Set the item to the {@link TtInvoiceDomain}, call {@link TtInvoiceService#create(TtInvoiceDomain)}, to get the data .
     * - Registration of registration Cancel Invoice : Invoice Header registration
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}, to get the data .
     * - Registration of registration Cancel Invoice : Invoice Attached registration
     *     Set the item to the {@link TtInvoiceAttachedDomain}, call {@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}, to get the data .
     * - Registration Cancel Invoice registration : Packing Header registration
     *     Set the item to the {@link TtPackingHeadDomain}, call {@link TtPackingHeadService#create(TtPackingHeadDomain)}, to get the data .
     * - Registration Cancel Invoice registration : Packing Attached CML registration
     *     Set the item to the {@link TtPackingAttachedCmlDomain}, call {@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}, to get the data .
     * - Registration Cancel Invoice registration : Packing Attached Item No registration ( update )
     *     Set the item to the {@link TtPackAtchItemNoDomain}, call {@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}, to get the data .
     * - Registration Cancel Invoice registration : Cancel before update of data Invoice : Invoice registration ( update )
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - Canceling of Non DN-G Invoice, change of Palletize STATUS clear and Invoice No. of Palletize table (locked)
     *     with the name of the criteriaDomain, call { @link W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)}, to obtain the data .
     * - Canceling of Non DN-G Invoice, change of Palletize STATUS clear and Invoice No. of Palletize table ( count acquisition )
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)}, to obtain the data .
     * - Changes Palletize STATUS clear and Invoice No. of Palletize ( updated)
     *     Set the item to the {@link TtPltzCriteriaDomain}, call {@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}, to get the data .
     * - Check for updates authority
     *     call {@link UserAuthService#hasUserAuthForComp(String, String)}, to get the data .
     * - (Non DN-G Invoice or Cancel Invoice registration) screen change: Search FRT Invoice No following exists .
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}, to get the data .
     * </pre>
     * <pre>
     * - Shipper情報の取得
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する。
     * - Consignee情報の取得
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する。
     * - ShipTo情報の取得
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTmExpShipToShipping(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - Inv. Category情報の取得
     *     {@link TmCdCriteriaDomain}に項目を設定し、{@link TmCdService#searchByCondition(TmCdCriteriaDomain)}を呼出し、データを取得する。
     * - Trans_Way情報の取得
     *     {@link TmCdCriteriaDomain}に項目を設定し、{@link TmCdService#searchByCondition(TmCdCriteriaDomain)}を呼出し、データを取得する。
     * - Carrier情報の取得
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する。
     * - ログイン者情報の取得
     *     {@link TmUserCriteriaDomain}に項目を設定し、{@link TmUserService#searchByKey(TmUserCriteriaDomain)}を呼出し、データを取得する。
     * - Freight Res.情報の取得
     *     {@link TmCdCriteriaDomain}に項目を設定し、{@link TmCdService#searchByCondition(TmCdCriteriaDomain)}を呼出し、データを取得する。
     * - Payment Method情報の取得
     *     {@link TmCdCriteriaDomain}に項目を設定し、{@link TmCdService#searchByCondition(TmCdCriteriaDomain)}を呼出し、データを取得する。
     * - Invoice/Invoice Attach(ファイル管理の登録)
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出し、データを取得する。
     * - Packing List/Packing List Attach(ファイル管理の登録)
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出し、データを取得する。
     * - Re-Invoiceの登録(インボイス更新)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - Re-Invoiceの登録(インボイスヘッダ更新)
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：インボイスヘッダのファイル削除：ファイルデータ削除(共通部品使用)
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：パッキングのファイル削除：ファイルデータ削除(共通部品使用)
     *     {@link FileManagementService#deleteFile(String, java.sql.Timestamp, String)}を呼出し、データを取得する。
     * - インボイスのファイル削除(FILE_IDを取得)
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#searchByCondition(TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - パッキングのファイル削除(FILE_IDを取得)
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#searchByCondition(TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：更新後のInvoice No.でのインボイス登録(更新)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：更新後のInvoice No.でのインボイスヘッダ登録(更新)
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：更新後のInvoice No.でのインボイスアタッチ登録(更新)
     *     {@link TtInvoiceAttachedCriteriaDomain}に項目を設定し、{@link TtInvoiceAttachedService#updateByCondition(TtInvoiceAttachedDomain, TtInvoiceAttachedCriteriaDomain)}を呼出し、データを取得する。
     * - 更新後のInvoice No.でのパッキングヘッダ登録(更新)
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：更新後のInvoice No.でのパッキングアタッチ_CML登録(更新)
     *     {@link TtPackingAttachedCmlCriteriaDomain}に項目を設定し、{@link TtPackingAttachedCmlService#updateByCondition(TtPackingAttachedCmlDomain, TtPackingAttachedCmlCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：更新後のInvoice No.でのパッキングアタッチ_品目番号登録(更新)
     *     {@link TtPackAtchItemNoCriteriaDomain}に項目を設定し、{@link TtPackAtchItemNoService#updateByCondition(TtPackAtchItemNoDomain, TtPackAtchItemNoCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更あり)の登録：紐付くFRT Invoice の親Invoice No.を変更（更新)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズテーブルのInvoice No.更新（更新)
     *     {@link TtPltzCriteriaDomain}に項目を設定し、{@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更なし)の登録：更新後のInvoice No.でのインボイス登録(更新)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoice (Invoice No.変更なし)の登録：更新後のInvoice No.でのインボイスヘッダ登録(更新)
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - パッキングヘッダの更新
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - Manual Invoiceの登録：インボイス登録
     *     {@link TtInvoiceDomain}に項目を設定し、{@link TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを取得する。
     * - Manual Invoiceの登録：インボイスヘッダ登録
     *     {@link TtInvoiceHeaderDomain}に項目を設定し、{@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを取得する。
     * - Manual Invoiceの登録：パッキングヘッダ登録
     *     {@link TtPackingHeadDomain}に項目を設定し、{@link TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：インボイス登録
     *     {@link TtInvoiceDomain}に項目を設定し、{@link TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：インボイスヘッダ登録
     *     {@link TtInvoiceHeaderDomain}に項目を設定し、{@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：インボイスアタッチ登録
     *     {@link TtInvoiceAttachedDomain}に項目を設定し、{@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：パッキングヘッダ登録
     *     {@link TtPackingHeadDomain}に項目を設定し、{@link TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：パッキングアタッチ_CML登録
     *     {@link TtPackingAttachedCmlDomain}に項目を設定し、{@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：パッキングアタッチ_品目番号登録(更新)
     *     {@link TtPackAtchItemNoDomain}に項目を設定し、{@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}を呼出し、データを取得する。
     * - Cancel Invoice登録の登録：キャンセル前インボイスデータの更新：インボイス登録(更新)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoiceのキャンセル時、パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの変更(ロック)
     *     criteriaDomainを引数にして、{@link W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - Non DN-G Invoiceのキャンセル時、パレタイズテーブルのInvoice No.のクリアとパレタイズステータスの変更(カウント取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズのInvoice No.のクリアとパレタイズステータスの変更(更新)
     *     {@link TtPltzCriteriaDomain}に項目を設定し、{@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}を呼出し、データを取得する。
     * - 更新権限の有無をチェック
     *     {@link UserAuthService#hasUserAuthForComp(String, String)}を呼出し、データを取得する。
     * - 画面遷移(Non DN-G Invoice or Cancel Invoice登録時)：次のFRT Invoice No.が存在するかを検索
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return W6001DocInvoiceDomain W6001DocInvoiceDomain initial display domain<br />
     * 初期表示用ドメイン
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public W6001DocCriteriaDomain transactOnUploadRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Create an Invoice cancellation data. Create a (PDF) Cancel customs documents.<br />
     *  For CIGMA, CIGMA products (CML_TYP = "1") performs the cancellation of sales and orders and stock
     * <br />キャンセルインボイスデータを作成する。キャンセル通関書類（PDF）を作成する。
     *       CIGMA品（CML_TYP = "1"）は、CIGMAに対し、売上・受注・在庫のキャンセルを行う
     * <pre>
     * << 10 ( cancel) >>
     * - Cancel availability check ( lock the Invoice)
     *     Set the item to TtInvoiceCriteriaDomain, call { @link TtInvoiceService#lockByKey(TtInvoiceCriteriaDomain)}, to obtain the data .
     * - Get numbering target data cancellation Invoice No.
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)} , to get the data .
     * - For the main Invoice ( Search Cancel Invoice numbering classification per unit ) unified type OR distributed decision
     *     Set the item to the {@link TmCancelInvSeqTypCriteriaDomain}, call {@link TmCancelInvSeqTypService#searchByCondition(TmCancelInvSeqTypCriteriaDomain)} , to get the data .
     * - In the case of FRT Invoice ( Search Cancel Invoice numbering classification per unit ) unified type OR distributed decision
     *     Set the item to the {@link TmCancelInvSeqTypCriteriaDomain}, call {@link TmCancelInvSeqTypService#searchByCondition(TmCancelInvSeqTypCriteriaDomain)} , to get the data .
     * - For the main Invoice ( lock the main Invoice Sequence Master) Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}, to get the data .
     * - In the case of FRT Invoice ( lock the main Invoice Sequence Master) Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}, to get the data .
     * - For the main Invoice ( update of the main Invoice Sequence Master) Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}, to get the data .
     * - In the case of FRT Invoice ( update of the main Invoice Sequence Master) Sequence Master update process
     *     Set the item to the {@link TmInvSeqCriteriaDomain}, call {@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)} , to get the data .
     * - To be registered in the table , the data that has been numbered Cancel Invoice No. ( data acquisition)
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtInvoiceDomain}, call {@link TtInvoiceService#create(TtInvoiceDomain)} , to get the data .
     * - To be registered in the table , the data that has been numbered Cancel Invoice No. ( data acquisition)
     *     Set the item to the {@link TtInvoiceHeaderCriteriaDomain}, call {@link TtInvoiceHeaderService#searchByCondition(TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)} , to get the data .
     * - To be registered in the table , the data that has been numbered Cancel Invoice No. ( data acquisition)
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call {@link TtPackingHeadService#searchByCondition(TtPackingHeadCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtPackingHeadDomain}, call {@link TtPackingHeadService#create(TtPackingHeadDomain)}, to get the data .
     * - To find out how to obtain it is registered in the table , the data that has been numbered Cancel Invoice No (data acquisition ) RECORD_NO.
     *     Set the item to the {@link TtInvoiceAttachedCriteriaDomain}, call {@link TtInvoiceAttachedService#searchByCondition(TtInvoiceAttachedCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtInvoiceAttachedDomain}, call {@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}, to get the data .
     * - To find out how to obtain it is registered in the table , the data that has been numbered Cancel Invoice No (data acquisition ) MAIN_MARK.
     *     Set the item to the {@link TtPackingAttachedCmlCriteriaDomain}, call {@link TtPackingAttachedCmlService#searchByCondition(TtPackingAttachedCmlCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtPackingAttachedCmlDomain}, call {@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}, to get the data .
     * - Make sure registered in the table , the data that has been numbered Cancel Invoice No ( data acquisition ) MAIN_MARK, how to get the RECORD_NO.
     *     Set the item to the {@link TtPackAtchItemNoCriteriaDomain}, call {@link TtPackAtchItemNoService#searchByCondition(TtPackAtchItemNoCriteriaDomain)}, to get the data .
     * - Be registered in the table , the data that has been numbered Cancel Invoice No.
     *     Set the item to the {@link TtPackAtchItemNoDomain}, call {@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}, to get the data .
     * - Create a PDF file
     *     call {@link L6001ReportService#searchInvHdrForCmrclIntang(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6002ReportService#searchInvHdrForNonCmrcl(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6003ReportService#searchIvnHdrForFrt(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6004ReportService#searchInvAtchedForMain(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6005ReportService#searchInvAtchedForRt(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6006ReportService#searchPackHdrForMain(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6007ReportService#searchPackHdrForFrt(String, String, Date, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6009ReportService#searchPackAtchedForFrt(String, String, Date, String)}, to get the data .
     * - Create a PDF file
     *     call {@link L6010ReportService#searchPackAtchedForErt(String, String, Date, String, String)}, to get the data .
     * - ( Registered in the File Manage table ) storage of PDF
     *     call {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}, to get the data .
     * - FILE ID update process of Invoice Header table
     *     Set the item to the {@link TtInvoiceHeaderDomain}, call {@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}, to get the data .
     * - FILE ID update process of Packing Header table
     *     Set the item to the {@link TtPackingHeadCriteriaDomain}, call {@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}, to get the data .
     * - ( Make a CANCEL FLAG of Invoice table ) update of Invoice data before cancellation
     *     Set the item to the {@link TtInvoiceCriteriaDomain}, call {@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}, to get the data .
     * - ( Lock Palletize) to perform update of Invoice No of Palletize table , a change of Palletize STATUS.
     *     with the name of the criteriaDomain, call { @link W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)}, to obtain the data .
     * - ( Get the data ) to perform updating of Invoice No of Palletize table , a change of Palletize STATUS.
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)}, to obtain the data .
     * - Update Palletize table
     *     Set the item to the {@link TtPltzCriteriaDomain}, call {@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}, to get the data .
     * - ( Get the update source information ) addition of Temp Stock
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltzByRegisterCancel(W6001DocCriteriaDomain)}, to obtain the data .
     * - ( Lock Temp Stock) addition of Temp Stock
     *     Set the item to the {@link TtTmpStockCriteriaDomain}, call {@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}, to get the data .
     * - (Update Temp Stock) addition of Temp Stock
     *     Set the item to the {@link TtTmpStockCriteriaDomain}, call {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}, to get the data .
     * - ( Get the update source information ) subtraction SHIPPED QUANTITY, the number of shipping instructions
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtPltzItemOdrByRegisterCancel(W6001DocCriteriaDomain)}, to obtain the data .
     * - ( Rock the Export Receive Order) subtraction SHIPPED QUANTITY, the number of shipping instructions
     *     Set the item to the {@link TtExpRcvOdrCriteriaDomain}, call {@link TtExpRcvOdrService#lockByKey(TtExpRcvOdrCriteriaDomain)}, to get the data .
     * - (Update Export Receive Order) subtraction SHIPPED QUANTITY, the number of shipping instructions
     *     Set the item to the {@link TtExpRcvOdrCriteriaDomain}, call {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}, to get the data .
     * - Screen refresh
     *     Set the item to the {@link W6001DocCriteriaDomain}, call {@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}, to get the data .
     * 
     * << 10 (CIGMA writing _Cancel) >>
     * - Acquisition of information to be passed to the Web service (header part)
     *     with the name of the criteriaDomain, call { @link W6001DocDao#searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain)}, to obtain the data.
     * - Web Services: call "ECA0027_WS_6002 Cancel Sales, Order, Inventory (sales, orders and stock cancellation)" of
     *     call {@link Ws6002RestService#cancelSalesOdrInvntry(String, String, String, String, String)}, to get the data.
     * </pre>
     * <pre>
     *<<10(キャンセル)>>
     * - キャンセル可否チェック(インボイスをロック)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#lockByKey(TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.採番対象データの取得
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - 統一型　OR 分散型判定(キャンセルインボイス採番区分原単位の検索)メインインボイスの場合
     *     {@link TmCancelInvSeqTypCriteriaDomain}に項目を設定し、{@link TmCancelInvSeqTypService#searchByCondition(TmCancelInvSeqTypCriteriaDomain)}を呼出し、データを取得する。
     * - 統一型　OR 分散型判定(キャンセルインボイス採番区分原単位の検索)FRTインボイスの場合
     *     {@link TmCancelInvSeqTypCriteriaDomain}に項目を設定し、{@link TmCancelInvSeqTypService#searchByCondition(TmCancelInvSeqTypCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理(メインインボイス採番原単位をロック)メインインボイスの場合
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理(メインインボイス採番原単位をロック)FRTインボイスの場合
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#lockByKey(TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理(メインインボイス採番原単位の更新)メインインボイスの場合
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - 採番原単位更新処理(メインインボイス採番原単位の更新)FRTインボイスの場合
     *     {@link TmInvSeqCriteriaDomain}に項目を設定し、{@link TmInvSeqService#updateByCondition(TmInvSeqDomain, TmInvSeqCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#searchByCondition(TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtInvoiceDomain}に項目を設定し、{@link TtInvoiceService#create(TtInvoiceDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#searchByCondition(TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtInvoiceHeaderDomain}に項目を設定し、{@link TtInvoiceHeaderService#create(TtInvoiceHeaderDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#searchByCondition(TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtPackingHeadDomain}に項目を設定し、{@link TtPackingHeadService#create(TtPackingHeadDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)RECORD_NOの取得方法を確認
     *     {@link TtInvoiceAttachedCriteriaDomain}に項目を設定し、{@link TtInvoiceAttachedService#searchByCondition(TtInvoiceAttachedCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtInvoiceAttachedDomain}に項目を設定し、{@link TtInvoiceAttachedService#create(TtInvoiceAttachedDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)MAIN_MARKの取得方法を確認
     *     {@link TtPackingAttachedCmlCriteriaDomain}に項目を設定し、{@link TtPackingAttachedCmlService#searchByCondition(TtPackingAttachedCmlCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtPackingAttachedCmlDomain}に項目を設定し、{@link TtPackingAttachedCmlService#create(TtPackingAttachedCmlDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する(データ取得)MAIN_MARK、RECORD_NOの取得方法を確認
     *     {@link TtPackAtchItemNoCriteriaDomain}に項目を設定し、{@link TtPackAtchItemNoService#searchByCondition(TtPackAtchItemNoCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセルインボイスNo.を採番したデータを、テーブルに登録する
     *     {@link TtPackAtchItemNoDomain}に項目を設定し、{@link TtPackAtchItemNoService#create(TtPackAtchItemNoDomain)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6001ReportService#searchInvHdrForCmrclIntang(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6002ReportService#searchInvHdrForNonCmrcl(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6003ReportService#searchIvnHdrForFrt(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6004ReportService#searchInvAtchedForMain(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6005ReportService#searchInvAtchedForRt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6006ReportService#searchPackHdrForMain(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6007ReportService#searchPackHdrForFrt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6008ReportService#searchPackAtchedForMain(String, String, Date, String, String, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6009ReportService#searchPackAtchedForFrt(String, String, Date, String)}を呼出し、データを取得する。
     * - PDFファイルの作成
     *     {@link L6010ReportService#searchPackAtchedForErt(String, String, Date, String, String)}を呼出し、データを取得する。
     * - PDFの保管(ファイル管理テーブルへの登録)
     *     {@link FileManagementService#createFileUpload(InputStream, String, Number, String)}を呼出し、データを取得する。
     * - インボイスヘッダテーブルのファイルID更新処理
     *     {@link TtInvoiceHeaderCriteriaDomain}に項目を設定し、{@link TtInvoiceHeaderService#updateByCondition(TtInvoiceHeaderDomain, TtInvoiceHeaderCriteriaDomain)}を呼出し、データを取得する。
     * - パッキングヘッダテーブルのファイルID更新処理
     *     {@link TtPackingHeadCriteriaDomain}に項目を設定し、{@link TtPackingHeadService#updateByCondition(TtPackingHeadDomain, TtPackingHeadCriteriaDomain)}を呼出し、データを取得する。
     * - キャンセル前インボイスデータの更新（インボイステーブルのキャンセルフラグを立てる）
     *     {@link TtInvoiceCriteriaDomain}に項目を設定し、{@link TtInvoiceService#updateByCondition(TtInvoiceDomain, TtInvoiceCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズテーブルのインボイスNo.の更新、パレタイズステータスの変更を行う(パレタイズをロック)
     *     criteriaDomainを引数にして、{@link W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズテーブルのインボイスNo.の更新、パレタイズステータスの変更を行う(データを取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - パレタイズテーブルの更新
     *     {@link TtPltzCriteriaDomain}に項目を設定し、{@link TtPltzService#updateByCondition(TtPltzDomain, TtPltzCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の加算(更新元情報の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltzByRegisterCancel(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の加算(仮在庫をロック)
     *     {@link TtTmpStockCriteriaDomain}に項目を設定し、{@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}を呼出し、データを取得する。
     * - 仮在庫の加算(仮在庫の更新)
     *     {@link TtTmpStockCriteriaDomain}に項目を設定し、{@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の減算(更新元情報の取得)
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtPltzItemOdrByRegisterCancel(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の減算(輸出受注をロック)
     *     {@link TtExpRcvOdrCriteriaDomain}に項目を設定し、{@link TtExpRcvOdrService#lockByKey(TtExpRcvOdrCriteriaDomain)}を呼出し、データを取得する。
     * - 出荷数量、出荷指示回数の減算(輸出受注の更新)
     *     {@link TtExpRcvOdrCriteriaDomain}に項目を設定し、{@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出し、データを取得する。
     * - 画面の再表示
     *     {@link W6001DocCriteriaDomain}に項目を設定し、{@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     *     
     *<<10(CIGMA書き込み_Cancel)>>
     * - Webサービスに渡す情報の取得（ヘッダ部分）
     *     criteriaDomainを引数にして、{@link W6001DocDao#searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * - Webサービス「ECA0027_WS_6002：Cancel Sales, Order, Inventory(売上・受注・在庫キャンセル)」のコール
     *     {@link Ws6002RestService#cancelSalesOdrInvntry(String, String, String, String, String)}を呼出し、データを取得する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Re-display data<br />
     * 再表示データ
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public W6001DocInvoiceDomain transactOnRegisterCancel(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Registered in the Invoice Group Work SHIPPED DATE
     * <br />売上日を インボイスグループワーク に登録する
     * <pre>
     * - Registration in the Invoice Group Work of SHIPPED DATE
     *   With the name of the TwInvDomain, call TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain), the data to be updated.
     * 
     * - Registration in the Invoice Group Work of CURRENCY CODE
     *   With the name of the TwInvDomain, call TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * - 売上日のインボイスグループワークへの登録
     *      TwInvDomainを引数にして、{@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出し、データを更新する。
     * - 通貨コードのインボイスグループワークへの登録
     *      TwInvDomainを引数にして、{@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public void updateOnDetailMoveToRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;


    /**
     * To split the Invoice of CML selected, and updates the workpiece. Do re-display of the screen.
     * <br />選択したCMLのインボイスを分割するために、ワークを更新する。画面の再表示を行う。
     * <pre>
     * - Update of Invoide Palletize Work
     *   With the name of the TwInvPltzCriteriaDomain, call TwInvPltzService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain), the data to be updated.
     * 
     * - Updated Invoice Item No Work
     *   With the name of the TwInvItemCriteriaDomain, call TwInvItemService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain), the data to be updated.
     * 
     * -  Search
     *   With the name of the W6001DocCriteriaDomain, call searchOnDetailInit(W6001DocCriteriaDomain), to get the data.
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワークの更新
     *      TwInvPltzCriteriaDomainを引数にして、{@link TwInvPltzService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain)}を呼出し、データを更新する。
     * - インボイス作成対象品目番号ワークを更新
     *      TwInvItemCriteriaDomainを引数にして、{@link TwInvItemService#updateByCondition(TwInvItemDomain, TwInvItemCriteriaDomain)}を呼出し、データを更新する。
     * - 再検索
     *      W6001DocCriteriaDomainを引数にして、{@link W6001DocService#searchOnDetailInit(W6001DocCriteriaDomain)}を呼出し、データを取得する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search results<br />
     * 再検索結果
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public W6001DocInvoiceDomain updateOnDetailRemove(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
    /**
     * Registered in the Invoice Group Work CURRENCY CODE
     * <br />通貨コードを インボイスグループワーク に登録する
     * <pre>
     * - Registration in the Invoice Group Work of CURRENCY CODE
     *   With the name of the TwInvDomain, call TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain), the data to be updated.
     * </pre>
     * <pre>
     * - 通貨コードのインボイスグループワークへの登録
     *      TwInvDomainを引数にして、{@link TwInvService#updateByCondition(TwInvDomain, TwInvCriteriaDomain)}を呼出し、データを更新する。
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public void updateOnDetailFrtMoveToRegister(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
    
    /**
     * Takes over the data that has been selected, transition to "Invoice Detail" screen.
     * <br />選択したデータを引継ぎ、"Invoice Detail"画面に遷移する。
     * <pre>
     * - Acquisition of Carrier SERVER NAME (Abbr.)
     *   Set the item to TmNxsCompCriteriaDomain, to call TmNxsCompService.searchByCondition (TmNxsCompCriteriaDomain), to obtain the data
     * 
     * - Get PORT NAME
     *   Set the item to TmPortCriteriaDomain, to call TmPortService.searchByCondition (TmPortCriteriaDomain), to obtain the data
     * 
     * - Updated Invoide Palletize Work
     *   Set the item to TwInvPltzCriteriaDomain, and call TwInvPltzService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain), to update the data
     * </pre>
     * <pre>
     * - Carrier名称（略称）の取得
     *     {@link TmNxsCompCriteriaDomain}に項目を設定し、{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼出し、データを取得する
     * - 港名の取得
     *     {@link TmPortCriteriaDomain}に項目を設定し、{@link TmPortService#searchByCondition(TmPortCriteriaDomain)}を呼出し、データを取得する
     * - インボイス作成対象パレタイズワークを更新
     *     {@link TwInvPltzDomain}に項目を設定し、{@link TwInvPltzService#updateByCondition(TwInvPltzDomain, TwInvPltzCriteriaDomain)}を呼出し、データを更新する
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Can not get the data<br />
     * データの取得ができない場合
     */
    public void updateOnShippingInfoInpMoveToInvoiceGrouping(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    


    /**
     * Check past date.
     * <br />過去日チェック。
     *
     * @param date Date<br />日付
     * @param dateFormat Date format<br />日付フォーマット
     * @param timeZoneId Timezone ID for login user.<br />ログイン者のタイムゾーンID
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />エラーの場合
     */
    public boolean validateConsistencyEtdAfterDate(String date, String dateFormat, String timeZoneId)
        throws ApplicationException;
    
    /**
     * The same data not allowed Check.
     * <br />同一データ不可チェック。
     *
     * @param invNo Invoice No.
     * @param orgInvNo Original Inv. No.
     * @return Number of decimal places of the VALUE is, True if the number of digits is less than or equal to the specified, False otherwise<br />
     * 値の小数点以下の桁数が、指定された桁数以下の場合True、それ以外はFalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyCancelInvoiceNo(String invNo, String orgInvNo)
        throws ApplicationException;
     
    /**
     * Related check of Digit and Free Additional
     * <br />Free Additional と Digit の関連チェック
     *
     * @param value Value<br />
     * 値
     * @param digit Number of digits<br />
     * 桁数
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyRelation(BigDecimal value, int digit)
        throws ApplicationException;
    
    /**
     * Related check of Free Additional Name and Free Additional (1)
     * <br />Free Additional と Free Additional Nameの関連チェック(1)
     * 
     * @param freeAdd       Free Additional
     * @param freeAddNm     Free Additional Name
     * @return In freeAdd> 0, True If false, it otherwise. freeAddNm = blank<br />
     * freeAdd>0で、freeAddNm=ブランクの場合はfalse、そうでない場合はTrue
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFreeAdditionalFreeAdditionalNameOver(BigDecimal freeAdd, String freeAddNm)
        throws ApplicationException;

    /**
     * Related check of Free Additional Name and Free Additional (2)
     * <br />Free Additional と Free Additional Name の 関連チェック(2)
     *
     * @param freeAdd       Free Additional
     * @param freeAddNm     Free Additional Name
     * @return fIn freeAdd> 0, True If false, it otherwise. freeAddNm = blank<br />
     * reeAdd=0で、freeAddNm!=ブランクの場合はfalse、そうでない場合はTrue
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFreeAdditionalFreeAdditionalNameZero(BigDecimal freeAdd, String freeAddNm)
        throws ApplicationException;

    /**
     * Number of digits check
     * <br />桁数チェック
     * 
     * @param curr Check target<br />
     * チェック対象
     * @param digit Number of digits<br />
     * 桁数
     * @return Number of decimal places to be checked false degit number of digits greater than, false otherwise<br />
     * チェック対象の小数点以下の桁数が桁数degitより大きい場合false、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyDigit(BigDecimal curr, int digit)
        throws ApplicationException;

    /**
     * Required Check
     * <br />必須チェック
     *
     * @param value Value<br />
     * 値
     * @return False true, if not inputted if the input<br />
     * 入力されていればtrue、入力されていなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyCompulsory(String value)
        throws ApplicationException;
    
    /**
     * INVOICE_CLASS check and Function No.
     * <br />Function NoとINVOICE_CLASSチェック。
     *
     * @param clsOfInv Class of Inv.
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFunctionNoClassOfInv(String clsOfInv)
        throws ApplicationException;
      
    /**
     * Warning confirmation check
     * <br />Warning確認チェック
     *
     * @param hsCdWarnig HS CODE Warning
     * @param ignoreWarning Ignore Warnings
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyHsCodeWarningIgnoreWarnings(String hsCdWarnig, String ignoreWarning)
        throws ApplicationException;
    
    /**
     * Related checks and Notify Party Address Notify Party Name
     * <br />Notify Party Name と Notify Party Address の関連チェック
     * 
     * @param notifyPatyNm Notify Party Name
     * @param notifyPatyAdd Notify Party Address
     * @param selectFlg Select Flag
     * @return False if one or the other there is only input true otherwise<br />
     * どちらか片方しか入力されていない場合false それ以外はtrue
     * @throws ApplicationException A mandatory check of Remittance can not be<br />
     * Notify Party Name と Notify Party Address の関連チェック
     */
    public boolean validateConsistencyNotifyPartyNameNotifyPartyAddress(String notifyPatyNm, String notifyPatyAdd, boolean selectFlg)
        throws ApplicationException;
    
    /**
     * Related checks and Notify Party
     * <br />Notify Partyの関連チェック
     * 
     * @param notifyPatyCompCd Notify Party Comp Cd
     * @param notifyPatyCompNmAbb Notify Party Comp Nm Abbr
     * @param notifyPatyNm Notify Party Name
     * @param notifyPatyAdd Notify Party Address
     * @return If though Name and Addr are input, Code and Name(Abbr) are not input; false<br />
     * NameとAddrが入力されているのに、CodeとName(Abbr)が入力されていなければfalse それ以外はtrue
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyNotifyPartySelect(String notifyPatyCompCd, String notifyPatyCompNmAbb, String notifyPatyNm, String notifyPatyAdd)
        throws ApplicationException;
        
    /**
     * The same data not allowed Check.
     * <br />同一データ不可チェック。
     *
     * @param referenceInvNo Reference Inv. No.
     * @param referenceInvShipper Reference Inv. Shipper
     * @param invoiceNo Invoice No.
     * @param shipper Shipper
     * @return True if the same, false otherwise<br />
     * 同一ならばtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyReferenceInvNoReferenceInvShipper(String referenceInvNo, String referenceInvShipper, String invoiceNo, String shipper)
        throws ApplicationException;

    /**
     * Re-display check.
     * <br />再表示チェック。
     *
     * @param dateSkipped    Date Shipped
     * @param hiddenDateSkipped   Hidden Date Shipped
     * @param refreshFlg    Refresh Flg
     * @return If it is not true error, false otherwise<br />
     * エラーでなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyRefreshed(Date dateSkipped, Date hiddenDateSkipped, boolean refreshFlg)
        throws ApplicationException;
    
    /**
     * Do the authority check.
     * <br />権限チェックを行います。
     * 
     * @param permitFuncId  PERMIT FUNCTION ID<br />
     * 認可機能ID
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param plntCd Factory CD<br />
     * 工場コード
     * @return True, false and otherwise if there is a function use authority<br />
     * 機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyShipperPlantAuth(String permitFuncId, String compCd, String plntCd)
        throws ApplicationException;

    
    /**
     * Special Information number of characters, the number of new line check
     * <br />Special Information 文字数、改行数チェック
     * <pre>
     * If the following error
     *   - Number of characters> lineMax of one line to the new line CD
     *   - The number of rows> rowMax
     * </pre>
     * <pre>
     * 下記の場合エラー
     *    ‐改行コードまでの1行の文字数 > lineMax
     *    ‐行数 > rowMax
     * </pre>
     * 
     * @param spInfo Special Information
     * @param lineMax The maximum number of characters per line<br />
     * 1行あたりの最大文字数
     * @param rowMax Maximum number of lines<br />
     * 最大行数
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException If the Special Information number of characters, line breaks check number can not be<br />
     * Special Information 文字数、改行数チェックができない場合
     */
    public boolean validateConsistencySpecialInformation(String spInfo, Integer lineMax, Integer rowMax)
        throws ApplicationException;
    
    /**
     * Currency, UNIT PRICE check
     * <br />通貨、単価チェック
     * 
     * @param unitPriceErr Unit Price Error
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyUnitPriceError(String unitPriceErr)
        throws ApplicationException;
    
    /**
     * Do check the size of the file.
     * <br />ファイルのサイズチェックを行います。
     * 
     * @param fileSize file size
     * ファイルデータ
     * @return True, false and otherwise FILE SIZE 5MB less than<br />
     * ファイルサイズ5MBより小さい場合true、そうでなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFileSize(int fileSize)
        throws ApplicationException;

    /**
     * Do check the existence of the file.
     * <br />ファイルの存在チェックを行います。
     * 
     * @param fileSize file size
     * @return True, false and otherwise if there is a file<br />
     * ファイルがあればtrue、そうでなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyFileExists(int fileSize)
        throws ApplicationException;
    
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
     * Invoice Calculate (Amount) error checking
     * <br />インボイス金額エラーチェック
     * <pre>
     * - Invoice Calculate (Amount) error checking basic unit Search
     *   Set the following items TmInvAmountChkCriteriaDomain
     *   Call  TmInvAmountChkService.searchByKey(TmInvAmountChkCriteriaDomain).
     *     - SHIPPER CODE of argument
     *     - Price Terms of argument
     *     - 3 digits of Trade Terms of argument
     *     - Freight Res of argument
     * 
     * - Error determination
     *   Make the decision the following process. 
     *   However, if the acquisition of the data could not be from the original unit, it does not in error it is determined that the check unnecessary.
     *     - Freight error checking of
     *       [In the case of FREIGHT_ERR = 0]
     *          If the error of Freight = 0
     *       [In the case of FREIGHT_ERR = 1]
     *          If the error of Freight ≠ 0
     *     
     *   - Insurance of error checking
     *       [In the case of INSURANCE_ERR = 0]
     *          If the error of Insurance = 0
     *       [In the case of INSURANCE_ERR = 1]
     *          If the error of Insurance ≠ 0
     * </pre>
     * <pre>
     * ‐インボイス金額エラーチェック原単位検索
     *     {@link TmInvAmountChkCriteriaDomain}に以下の項目を設定して
     *     {@link TmInvAmountChkService#searchByKey(TmInvAmountChkCriteriaDomain)}を呼出します。
     *       ‐引数の荷主コード
     *       ‐引数のPrice Terms
     *       ‐引数のTrade Termsの上3桁
     *       ‐引数のFreight Res
     * 
     * ‐エラー判定
     *     下記の判定処理を行います。
     *     ただし、原単位からデータの取得ができなかった場合、チェック不要と判断しエラーにしません。
     *       ‐Freightのエラーチェック
     *           [FREIGHT_ERR = 0の場合]
     *             Freight = 0の場合エラー
     *           [FREIGHT_ERR = 1の場合]
     *             Freight ≠ 0の場合エラー
     *       ‐Insuranceのエラーチェック
     *           [INSURANCE_ERR = 0の場合]
     *             Insurance = 0の場合エラー
     *           [INSURANCE_ERR = 1の場合]
     *             Insurance ≠ 0の場合エラー
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @param params (An array of size 1 String type) error message parameters<br />
     * エラーメッセージ用パラメータ（String型サイズ1の配列）
     * @return NULL normal, error MESSAGE ID<br />
     * 正常時NULL、エラー時メッセージID
     * @throws ApplicationException If (Amount) error checking can not Invoice Calculate<br />
     * インボイス金額エラーチェックが出来ない場合
     */
    public String validateDatabaseTmInvAmountChkOnRegisterCalculateAmount(W6001DocCriteriaDomain criteria, String[] params)
        throws ApplicationException;
    
    /**
     * Carrier presence check
     * <br />Carrier存在チェック
     * 
     * @param compCd NXS_COMP_CD
     * @return False true, and if it does not exist if it exists<br />
     * 存在すればtrue、存在しなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseCarrier(String compCd)
        throws ApplicationException;

    /**
     * Date Shipped input range check
     * <br />Date Shipped入力可能範囲チェック
     * 
     * @param compCd NXS_COMP_CD
     * @param dateShipped Date Shipped
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseCigmaAds(String compCd, Date dateShipped) throws ApplicationException;
    
    /**
     * CIGMA the availability check.
     * <br />CIGMA利用可否チェックをします。
     * <pre>
     * [For CIGMA products (CML_TYP = 1)]
     * - CIGMA Get the availability of.
     *   Specify the following items, call (boolean, String) the CommonService.searchCigmaAvailable.
     *     - COMPANY CODE of argument
     *     - Documentation is false for non-24H shipping function
     * 
     * And [if not CIGMA product (CML_TYP ≠ 1)]
     *   Set to true the result unconditionally
     * </pre>
     * <pre>
     * [CIGMA品の場合(CML_TYP = 1)]
     * ‐CIGMAの利用可否を取得します。
     *     下記の項目を指定して、{@link CommonService#searchCigmaAvailable(boolean, String)}を呼出します。
     *       ‐引数の会社コード
     *       ‐Documentationは24H出荷非対応機能のためfalse
     * 
     * [CIGMA品でない場合(CML_TYP ≠ 1)]
     *   無条件に結果をtrueにする
     * </pre>
     * 
     * @param compCd Comp Cd
     * @param CmlType CML TYP
     * @return True, false, otherwise it is not CIGMA products or is a CIGMA products available<br />
     * CIGMA品でない または CIGMA品利用可能な場合true、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public String validateDatabaseCigmaAvailable(String compCd, String CmlType)
        throws ApplicationException;
    
    /**
     * CIGMA the availability check.
     * <br />CIGMA利用可否チェックをします。
     * <pre>
     * CIGMA goods check that it contains
     * - Invoide Palletize Work Search
     *   Set the following items W6001DocCriteriaDomain,
     *    Call the (W6001DocCriteriaDomain) W6001DocDao.searchTwInvPltzByCigmaCheck.
     *     - Login DSC-ID
     *     - SHIPPER CODE
     * 
     * [If count obtained in (MAIN_MARK)> 0]
     *   Do CIGMA availability check.
     *   Call (String, String) the validateDatabaseCigmaAvailable.
     *     - COMPANY CODE of argument
     *     - CML_TYP: 1 (CIGMA)
     * 
     * [If count obtained in (MAIN_MARK) == 0]
     *   CIGMA products because it does not contain, Return true unconditionally.
     * </pre>
     * <pre>
     * CIGMA品が含まれているかチェック
     * - インボイス作成対象パレタイズワーク検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvPltzByCigmaCheck(W6001DocCriteriaDomain)}を呼出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     * 
     * [取得したcount(MAIN_MARK) > 0 の場合]
     *   CIGMA利用可否チェックを行います。
     *   {@link #validateDatabaseCigmaAvailable(String, String)}を呼出します。
     *     ‐引数の会社コード
     *     ‐CML_TYP:1(CIGMA)
     *   
     * [取得したcount(MAIN_MARK) == 0 の場合]
     *   CIGMA品が含まれていないので、無条件にtrueを返す。
     * </pre>
     * 
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param obj object (not available)<br />
     * object(利用しない)
     * @return True, false, otherwise it is not CIGMA products or is a CIGMA products available<br />
     * CIGMA品でない または CIGMA品利用可能な場合true、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public String validateDatabaseCigmaAvailable(String dscId, String shipperCd, Void obj)
        throws ApplicationException;
    
    /**
     * Company presence check
     * <br />Company存在チェック
     * 
     * @param compCd NXS_COMP_CD
     * @return False true, and if it does not exist if it exists<br />
     * 存在すればtrue、存在しなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseCompCd(String compCd)
        throws ApplicationException;
    
    /**
     * W / H Company, NEXUS W / H combination check
     * <br />W/H Company、NEXUS W/H　組み合わせチェック
     * 
     * @param compCd W/H Company
     * @param whCd NEXUS W/H
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException;
    

    /**
     * Port existence check
     * <br />Port存在チェック
     * 
     * @param portCd     PORT_CD
     * @param cntryCd Country code
     * @return False true, and if it does not exist if it exists<br />
     * 存在すればtrue、存在しなければfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabasePort(String portCd, String cntryCd)
        throws ApplicationException;
    
    /**
     * Cancel availability check.
     * <br />キャンセル可否チェックをします。
     * <pre>
     * - Invoice search
     *   Set the following items TtInvoiceCriteriaDomain,
     *    Call  TtInvoiceService.searchByKey(TtInvoiceCriteriaDomain).
     * 
     * [CANCEL FLAG is a case of Y]
     *   Error because it is already canceled
     *     MESSAGE ID: NXS-E7-0062
     *   
     * [If Shipping Actuality No is not null]
     *   Error for Shipping Actuality is up already
     *     MESSAGE ID: NXS-E7-0063
     * </pre>
     * <pre>
     * ‐インボイス検索
     *     {@link TtInvoiceCriteriaDomain}に以下の項目を設定し、
     *     {@link TtInvoiceService#searchByKey(TtInvoiceCriteriaDomain)}を呼び出します。
     *     
     * [キャンセルフラグがYの場合]
     *   既にキャンセルされているためエラー
     *     メッセージID：NXS-E7-0062
     * 
     * [船積実績Noがnullではない場合]
     *   既に船積実績が上がっているためエラー
     *     メッセージID：NXS-E7-0063
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @return Null normal, MESSAGE ID abnormal<br />
     * 正常時null、異常時メッセージID
     * @throws ApplicationException Can not cancel availability check<br />
     * キャンセル可否チェックが出来ない場合
     */
    public String validateDatabaseTtInvoiceOnRegisterCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    
    /**
     * Cancel Check
     * <br />キャンセルチェック
     * 
     * @param shipperCd Shipper Cd
     * @param invoiceNo Invoice No.
     * @param invoiceIssueDt invoice Issue Date
     * @param functionNo Function No.
     * @return The number of the acquired true If 0, false otherwise<br />
     * 取得した件数が0の場合true、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    // ST946 MANUAL SCREEN TRANSITION MOD
    //public boolean validateDatabaseTtInvoiceOnUploadRegisterByCancel(String shipperCd, String pInvoiceNo, String invoiceNo, Date invoiceIssueDt, String functionNo)
    //    throws ApplicationException;
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByCancel(String shipperCd, String invoiceNo, Date invoiceIssueDt, String functionNo)
        throws ApplicationException;
    
    /**
     * Duplicate registration check
     * <br />重複登録チェック
     * 
     * @param shipperCd   Shipper Cd
     * @param invoiceNo Invoice No.
     * @param invoiceIssueDt invoice Issue Date
     * @return The number of the acquired true If 0, false otherwise<br />
     * 取得した件数が0の場合true、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByDuplication(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;
    

    /**
     * Check for the existence of update
     * <br />更新時の存在チェック
     * 
     * @param shipperCd Shipper Cd
     * @param invoiceNo Invoice No.
     * @param invoiceIssueDt invoice Issue Date
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByExistence(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;

    /**
     * STATUS check when canceling
     * <br />キャンセル時のステータスチェック
     * 
     * @param shipperCd Shipper Cd
     * @param invoiceNo Invoice No.
     * @param invoiceIssueDt invoice Issue Date
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTtInvoiceOnUploadRegisterByStatus(String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException;

    // UT186 ZIP DOWNLOAD ADD
    /**
     * Check unique name under parent invoice for zip entry<br />
     * zip内でファイル名が重複しないように、親インボイスの配下に同名ファイルのアップロードがされていないかをチェック。
     * 
     * <pre>
     * For an update, the file that has been uploaded to the target invoice is not checked because the non-overlapping.
     * So specify the invoice to the outside of check target to the next parameter.
     * updateInvoiceShipperCd, updateInvoiceNo, updateInvoiceIssueDt
     * 更新の場合は、対象インボイスにアップロードされているファイルは洗い替えのためチェック対象外とする。
     * 次のパラメータにはチェック対象外とするインボイスを指定すること。
     * updateInvoiceShipperCd, updateInvoiceNo, updateInvoiceIssueDt
     * </pre>
     * 
     * @param mainInvoiceShipperCd main invoice shipper code
     * @param mainInvoiceNo main invoice No.
     * @param mainInvoiceIssueDt main invoice issue date
     * @param updateInvoiceShipperCd update target invoice shipper code. If create then set null.
     * @param updateInvoiceNo update target invoice No. If create then set null.
     * @param updateInvoiceIssueDt update target invoice issue date If create then set null.
     * @param fileName upload file base name
     * @return true:check OK, false:check not OK.
     * @throws ApplicationException In the case of error
     */
    public boolean validateDatabaseUniqueFileNameOnUploadRegister(
        String mainInvoiceShipperCd, String mainInvoiceNo, Date mainInvoiceIssueDt,
        String updateInvoiceShipperCd, String updateInvoiceNo, Date updateInvoiceIssueDt,
        String fileName)
        throws ApplicationException;

    /**
     * Check Search for Invoice Group Work
     * <br />インボイスグループワークを検索しチェック
     * 
     * @param criteriaDomain condition 
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTwInvOnDetailFrtMoveToRegister(W6008CriteriaDomain criteriaDomain)
        throws ApplicationException;

    /**
     * Staging Instruction register multiple check
     * <br />荷揃え指示複数登録チェック
     * 
     * @param dscId DSC-ID  
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByCk(String dscId)
        throws ApplicationException;

    /**
     * CONTAINER SORTING KEY difference check
     * <br />コンテナ層別キー違いチェック
     * 
     * @param dscId DSC-ID  
     * @param containerSortingKey Container Sort Key
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(String dscId, String containerSortingKey)
        throws ApplicationException;

    /**
     * Check for the existence of Invoide Palletize Work
     * <br />インボイス作成対象パレタイズワークの存在チェック
     * 
     * @param dscId DSC-ID  
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByExistence(String dscId)
        throws ApplicationException;

    /**
     * MAIN MARK maximum number check
     * <br />最大メインマーク件数チェック
     * 
     * @param dscId DSC-ID  
     * @param countMainMark Count Main Marl
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(String dscId, int countMainMark)
        throws ApplicationException;

    /**
     * Determine the necessity of the implementation process.
     * <br />処理の実施要否を判定します。
     * <pre>
     * - Invoice created for work Part Number Search
     *   Set the following items W6001DocCriteriaDomain,
     *    Call  W6001DocDao.searchTwInvItemByNecessityEnforcement(W6001DocCriteriaDomain).
     *     - Login DSC-ID
     *     - SHIPPER CODE
     * </pre>
     * <pre>
     * - インボイス作成対象品番ワーク検索
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocDao#searchTwInvItemByNecessityEnforcement(W6001DocCriteriaDomain)}を呼出します。
     *       - ログインDSC-ID
     *       - 荷主コード
     * </pre>
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @return Count that was acquired (SHIPPER_CD) is true if 0 with reviews, false otherwise<br />
     * 取得したcount(SHIPPER_CD)が0件の場合true、それ以外はfalse
     * @throws ApplicationException Can not determine an implementation necessity of processing.<br />
     * 処理の実施要否を判定できない場合。
     */
    public boolean validateDatabaseTwInvItemOnInvGroupSearch(String dscId, String shipperCd)
        throws ApplicationException;

    /**
     * Check date correlation of ETA and ETD
     * <br />ETDとETAの日付相関チェック
     * <pre>
     * - ETD Check the correlation and ETA.
     * </pre>
     * <pre>
     * ‐ETDとETAの相関チェックを行います。
     * </pre>
     *
     * @param etd ETD
     * @param eta ETA
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return True, false otherwise if there is no error<br />
     * エラーがなければtrue、それ以外はfalse
     * @throws ApplicationException In the case of error<br />
     * エラーの場合
     */
    public boolean validateConsistencyEtdEda(String etd, String eta, String dateFormat)
        throws ApplicationException;

}
