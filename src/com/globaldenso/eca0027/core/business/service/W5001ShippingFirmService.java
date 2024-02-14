/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;


/**
 * Interface of the service that provides a shipment confirmation function
 * <br />出荷確認機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:w5001ShippingFirmService
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9359 $
 */
public interface W5001ShippingFirmService {

    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * Check correlation of ETD
     * <br />ETDの相関チェックを行います。
     *
     * <pre>
     * - Correlation check of ETD
     *     A check is made if both ETD and (From) ETD of (To) is input.
     *     For details, common specifications xls: 
     *     - see "functional specifications common date From correlation check of To".
     *
     * - ETDの相関チェック
     *     ETD(From)とETD(To)の両方が入力された場合にチェック
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     *
     * @param etdFrom ETD(From)
     * @param etdTo ETD(To)
     * @param dateFormat date format
     * @return true, false otherwise if there is an error in the input value
     */
    public boolean validateConsistencyFmEtdToEtd(String etdFrom, String etdTo, String dateFormat);


    //--------------------------------- データベースチェックメソッド validateDatabase ----------------------------------

    /**
     * Do W / H Company, the NEXUS W / H combination check.
     * <br />W/H Company、NEXUS W/H　組み合わせチェックを行います。
     *
     * <pre>
     * More common specification xls: 
     * See "Common Functional Specifications W / H Company, NEXUS W / H combination check" the.
     *
     * 詳細は共通仕様.xls「機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック」を参照
     * </pre>
     *
     * @param compCd W/H Company
     * @param whCd NEXUS W/H
     * @return true combination W / H company, of W / H is present in the original warehouse unit,
     *          false otherwise
     * @throws ApplicationException If TM_NXS_WH can not browse
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd) throws ApplicationException;

    /**
     * Make the past day check using the time zone of login user
     * <br />ログイン者のタイムゾーンを使用して過去日チェックを行います。
     * <pre>
     * More common specification xls: see "functional specifications common past date check"
     *
     * 詳細は共通仕様.xls「機能仕様共通：過去日チェック」を参照
     * </pre>
     *
     * @param date input date
     * @param dateFormat date format
     * @param loginUserTimezoneId login user timezone ID
     * @return Date entered the true, false and if not, not a past date
     * @throws ApplicationException If the date format can not be obtained
     */
    boolean validateDatabaseAfterDate(String date, String dateFormat, String loginUserTimezoneId)
        throws ApplicationException;

    /**
     * Check the shipping company existence check
     * <br />運送会社存在チェックを行います。
     * <pre>
     * More common specification xls: see "Common Carrier functional specifications presence check"
     *
     * 詳細は共通仕様.xls「機能仕様共通：Carrier存在チェック」を参照
     * </pre>
     *
     * @param compCd company code
     * @return True, false and otherwise company code exists in the company NEXUS basic unit 
     *         as the shipping company
     * @throws ApplicationException If the company NEXUS basic unit can not browse
     */
    public boolean validateDatabaseCarrier(String compCd) throws ApplicationException;

    /**
     * Put a lock so that others can not update the data palletizing
     * <br />パレタイズデータを他者が更新できないようにロックをかける（Register処理）
     *
     * <pre>
     * - Lock of palletizing data
     *     Search by CML No or X-Tag No.
     *
     * - パレタイズデータのロック
     *     X-Tag Noもしくは、CML Noで検索する
     * </pre>
     *
     * @param listDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not get the palletizing data
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegister(W5004ListDomain listDomain)
        throws ApplicationException;
    
    /**
     * Put a lock so that others can not update the shipment confirmation data
     * <br />出荷確認データを他者が更新できないようにロックをかける（Re-Update Container No処理）
     *
     * <pre>
     * - Lock of the shipment confirmation data
     *     Search by shippingFirmNo.
     *
     * - 出荷確認データのロック
     *     shippingFirmNoで検索する
     * </pre>
     *
     * @param shippingFirmNo shipping Firm No
     * @return True
     * @throws ApplicationException Can not get the shipment confirmation data
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterReUpdateContainerNo(String shippingFirmNo)
        throws ApplicationException;

    /**
     * (An outer join, invoice) Put a lock so that others can not update the data palletizing
     * <br />パレタイズ(外部結合で、インボイス)データを他者が更新できないようにロックをかける（Re-Update Container No処理）
     *
     * <pre>
     * - (An outer join, invoice) Palletizing lock on the data
     *     Search by shippingFirmNo.
     *
     * - パレタイズ(外部結合で、インボイス)データのロック
     *     shippingFirmNoで検索する
     * </pre>
     *
     * @param shippingFirmNo shipping Firm No
     * @return Process of X CML / CML is, if ahead of shipments, false
     * @throws ApplicationException Can not get the shipment confirmation data
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegisterReUpdateContainerNo(String shippingFirmNo)
        throws ApplicationException;
    
    /**
     * Put a lock so that others can not update the shipment confirmation data
     * <br />出荷確認データを他者が更新できないようにロックをかける（Register Working処理）
     *
     * <pre>
     * - Lock of the shipment confirmation data
     *     Search by shippingFirmNo.
     *
     * - 出荷確認データのロック
     *     shippingFirmNoで検索する
     * </pre>
     *
     * @param shippingFirmNo shipping Firm No
     * @return If the process of shipment confirmation, is ahead of shipment confirmation, false
     * @throws ApplicationException Can not get the shipment confirmation data
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterWorking(String shippingFirmNo)
        throws ApplicationException;
    
    /**
     * Put a lock so that others can not update the shipment confirmation data
     * <br />出荷確認データを他者が更新できないようにロックをかける（Cancel処理）
     *
     * <pre>
     * - Lock of the shipment confirmation data
     *     Search by shippingFirmNo.
     *
     * - 出荷確認データのロック
     *     shippingFirmNoで検索する
     * </pre>
     *
     * @param shippingFirmNo shipping Firm No
     * @return True
     * @throws ApplicationException Can not get the shipment confirmation data
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterCancel(String shippingFirmNo)
        throws ApplicationException;
    
    /**
     * (An outer join, invoice) Put a lock so that others can not update the data palletizing
     * <br />パレタイズ(外部結合で、インボイス)データを他者が更新できないようにロックをかける（Re-Update Container No処理）
     *
     * <pre>
     * - (An outer join, invoice) Palletizing lock on the data
     *     Search by shippingFirmNo.
     *
     * - パレタイズ(外部結合で、インボイス)データのロック
     *     shippingFirmNoで検索する
     * </pre>
     *
     * @param shippingFirmNo shipping Firm No
     * @return Process of X CML / CML is, if ahead of shipments, false
     * @throws ApplicationException Can not get the shipment confirmation data
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegisterCancel(String shippingFirmNo)
        throws ApplicationException;

    //--------------------------------- 検索系メソッド search ----------------------------------
    /**
     * Get the number of searches of shipping confirmation to the Main screen for
     * <br />Main画面用に出荷確認の検索件数を取得します。
     *
     * <pre>
     * - An argument shippingFirmCriteriaDomain, 
     *   I call the W5001ShippingFirmDao.searchCountForPagingOnMainSearch
     * - The return to the result of a call of W5001ShippingFirmDao.searchCountForPagingOnMainSearch
     *
     * - shippingFirmCriteriaDomainを引数に、W5001ShippingFirmDao.searchCountForPagingOnMainSearchの呼び出し
     * - W5001ShippingFirmDao.searchCountForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return serch result count
     * @throws ApplicationException Can not see is pshipping confirmation
     */
    public int searchCountForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;
    
    /**
     * Search for shipping confirmation to the Main screen for
     * <br />Main画面用に出荷確認の検索を行います。
     *
     * <pre>
     * - An argument shippingFirmCriteriaDomain, 
     *   I call the W5001ShippingFirmDao.searchForPagingOnMainSearch
     * - The return to the result of a call of W5001ShippingFirmDao.searchForPagingOnMainSearch
     *
     * - shippingFirmCriteriaDomainを引数に、W5001ShippingFirmDao.searchForPagingOnMainSearchの呼び出し
     * - W5001ShippingFirmDao.searchForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public List<? extends W5001ShippingFirmDomain> searchForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of shipping instruction and shipping actuality to the Main screen for
     * <br />Create画面用に荷揃え指示、山作り実績の検索件数を取得します。
     *
     * <pre>
     * - An argument stgCriteriaDomain, 
     *   I call the W5001ShippingFirmDao.searchCountForPagingOnCreateSearch
     * - The return to the result of a call of W5001ShippingFirmDao.searchCountForPagingOnCreateSearch
     *
     * - stgCriteriaDomainを引数に、W5001ShippingFirmDao.searchCountForPagingOnCreateSearchの呼び出し
     * - W5001ShippingFirmDao.searchCountForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgCriteriaDomain search criteria domain
     * @return serch result count
     * @throws ApplicationException Can not see is staging instruction or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException;
    
    /**
     * Search for shipping instruction and shipping actuality to the Create screen for
     * <br />Create画面用に荷揃え指示、山作り実績を検索します。
     *
     * <pre>
     * - An argument stgCriteriaDomain, I call the W5001ShippingFirmDao.searchForPagingOnCreateSearch
     * - Use CommonService.convertUnit, and converted to a weight unit of the login's 
     *   and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W5001ShippingFirmDao.searchForPagingOnCreateSearch
     *
     * - stgCriteriaDomainを引数に、W5001ShippingFirmDao.searchForPagingOnCreateSearchの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の重量単位に変換
     * - W5001ShippingFirmDao.searchForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is staging instruction or staging actuality
     */
    public List<? extends W5001StgDomain> searchForPagingOnCreateSearch(
        W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the CML that is included in the shipping confirmation 
     * for (transition from the Main screen) 
     * Register screen
     * <br />Register画面(Main画面からの遷移)用に出荷確認に含まれるCMLを検索します。
     *
     * <pre>
     * - An argument shippingFirmCriteriaDomain, 
     *   I call the W5001ShippingFirmDao.searchOnRegisterInitByFromMain
     * - Use CommonService.convertUnit, and converted to a weight unit of the login's 
     *   and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W5001ShippingFirmDao.searchOnRegisterInitByFromMain
     *
     * - shippingFirmCriteriaDomainを引数に、W5001ShippingFirmDao.searchOnRegisterInitByFromMainの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の重量単位に変換
     * - W5001ShippingFirmDao.searchOnRegisterInitByFromMainの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromMain(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to find the X-Tag/CML included 
     * in the Staging Instruction Register screen
     * <br />Register画面(Create画面からの遷移)用に、荷揃え指示に含まれるCMLを検索します。
     *
     * <pre>
     * - An argument shippingFirmCriteriaDomain, 
     *   I call the W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgInstr
     * - Use CommonService.convertUnit, and converted to a weight unit of the login's 
     *   and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of 
     *   W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgInstr
     *
     * - shippingFirmCriteriaDomainを引数に、
     *   W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgInstrの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の重量単位に変換
     * - W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgInstrの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgInstr(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), 
     * to find the X-Tag/CML included in the Staging Actuality Register screen
     * <br />Register画面(Create画面からの遷移)用に、山作り実績に含まれるX-Tag/CMLを検索します。
     *
     * <pre>
     * - An argument shippingFirmCriteriaDomain, I call 
     *   the W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgAct
     * - Use CommonService.convertUnit, and converted to a weight unit of the login's 
     *   and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of 
     *   a call of W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgAct
     *
     * - shippingFirmCriteriaDomainを引数に、
     *   W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgActの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の重量単位に変換
     * - W5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgActの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgAct(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Create a (Shipping Comfirmation) L5001
     * <br />L5001(Shipping Comfirmation)を作成します。
     * <pre>
     * - An argument shippingFirmCriteriaDomain, I call the L5001ReportService.searchTtShippingFirm
     * - The return to the result of a call of L5001ReportService.searchTtShippingFirm
     *
     * - shippingFirmCriteriaDomainを引数に、L5001ReportService.searchTtShippingFirmの呼び出し
     * - L5001ReportService.searchTtShippingFirmの呼び出し結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @param reportDateFormat report date format
     * @return PDF File object
     * @throws ApplicationException If the PDF document can not be created
     */
    public File printShippingFirm(W5001ShippingFirmDomain shippingFirmCriteriaDomain, 
        String reportDateFormat) throws ApplicationException;


    //--------------------------------- 更新系メソッド update ----------------------------------


    //--------------------------------- トランザクション系メソッド transact ----------------------------------
    /**
     * Register the shipping confirmation, it updates the status palletizing
     * <br />出荷確認を登録し、パレタイズステータスを更新します。
     * <pre>
     * - Use the SACT, Lock key to 
     *   the palletizing shippingFirmDomain.cmlDomainList.mainMark / xMainMark 
     * - Palletizing you lock, a shipment confirmation can check status 
     * - Call the CommonService.transactSequence, and numbering the shipment confirmation NO 
     * - Use the SACT, to create a delivery confirmation 
     * - Palletizing status of palletizing that uses SACT, locked, updates the shipment confirmation NO
     *
     * - SACTを使用し、shippingFirmDomain.cmlDomainList.mainMark/xMainMarkをキーにパレタイズをロック
     * - ロックしたパレタイズが、出荷確認可能なステータスかチェック
     * - CommonService.transactSequenceを呼び出し、出荷確認NOを採番
     * - SACTを使用し、出荷確認を登録
     * - SACTを使用し、ロックしたパレタイズのパレタイズステータス、出荷確認NOを更新
     * </pre>
     *
     * @param updateDomain update domain
     * @return shipping confirmation update count
     * @throws ApplicationException If you can not register
     */
    public W5001ShippingFirmDomain transactOnRegister(W5004UpdateDomain updateDomain) 
        throws ApplicationException;

    /**
     * Cancel the shipping confirmation already created
     * <br />作成済みの出荷確認をキャンセルします。
     * <pre>
     * - Use the SACT, Lock shipment confirmation to the key shippingFirmDomain.shippingFirmNo
     * - Use the SACT, to lock the palletizing associated with their shipment confirmation
     * - Use the SACT, to lock the invoice associated with their palletizing
     * - Use the SACT, remove the shipping confirmation that you lock
     * - Updated the status of palletizing palletizing that uses SACT, locked. 
     *   Clear shipment confirmation NO
     *
     * - SACTを使用し、shippingFirmDomain.shippingFirmNoをキーに出荷確認をロック
     * - SACTを使用し、出荷確認に紐付くパレタイズをロック
     * - SACTを使用し、パレタイズに紐付くインボイスをロック
     * - SACTを使用し、ロックした出荷確認を削除
     * - SACTを使用し、ロックしたパレタイズのパレタイズステータスを更新。出荷確認NOをクリア
     * </pre>
     *
     * @param updateDomain update domain
     * @throws ApplicationException If you can not update
     */
    public void transactOnRegisterCancel(W5004UpdateDomain updateDomain) throws ApplicationException;

    /**
     * Update to "performance factory" the status of the shipment confirmation
     * <br />出荷確認のステータスを"出荷実績"に更新します。
     * <pre>
     * Update - shipment confirmation
     *     - Use the SACT, Lock shipping confirmation to key shippingFirmDomain.shippingFirmNo
     *     - Updated to shipments shipping confirmation status of shipment confirmation 
     *       that uses SACT, locked
     * Update - palletizing
     *     - Use the SACT, updated in shipments shipping confirmation status of 
     *       palletizing associated with their shipment confirmation
     *
     * - 出荷確認の更新
     *     - SACTを使用し、shippingFirmDomain.shippingFirmNoをキーに出荷確認をロック
     *     - SACTを使用し、ロックした出荷確認の出荷確認ステータスを出荷実績に更新
     * - パレタイズの更新
     *     - SACTを使用し、出荷確認に紐付くパレタイズの出荷確認ステータスを出荷実績に更新
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return shipping confirmation update count
     * @throws ApplicationException If you can not update
     */
    public W5001ShippingFirmDomain transactOnRegisterWorking(
        W5004CriteriaDomain criteriaDomain) throws ApplicationException;

    /**
     * <br />出荷確認のコンテナNo.を更新します。
     * <pre>
     * - Use the SACT, Lock shipment confirmation to the key shippingFirmDomain.shippingFirmNo
     * - Use the SACT, to lock the palletizing associated with their shipment confirmation
     * - Use the SACT, to lock the invoice associated with their palletizing
     * - Updated container of NO shipment confirmation that uses SACT, locked
     *
     * - SACTを使用し、shippingFirmDomain.shippingFirmNoをキーに出荷確認をロック
     * - SACTを使用し、出荷確認に紐付くパレタイズをロック
     * - SACTを使用し、パレタイズに紐付くインボイスをロック
     * - SACTを使用し、ロックした出荷確認のコンテナNOを更新
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return shipping confirmation update count
     * @throws ApplicationException If you can not update
     */
    public W5001ShippingFirmDomain transactOnRegisterReUpdateContainerNo(
        W5004CriteriaDomain criteriaDomain) throws ApplicationException;

    /**
     * Stores in listDomain search results.
     * <br />検索結果をlistDomainに格納する。
     * <pre>
     * - Convert screen display for search results.
     *
     * - 検索結果を画面表示用に変換する。
     * </pre>
     *
     * @param shippingFirm shipping confirmation domain
     * @param criteriaDomain criteria domain
     * @return List of W5004ListDomain
     * @throws ApplicationException If you can not update
     */
    public List<? extends W5004ListDomain> convertToListDomain(
        W5001ShippingFirmDomain shippingFirm, W5004CriteriaDomain criteriaDomain) 
        throws ApplicationException;

}
