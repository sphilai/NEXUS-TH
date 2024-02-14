/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;

/**
 * Interface of the service that provides a Staging Instruction function
 * <br />荷揃え指示機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:w4001StgInstrService
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5687 $
 */
public interface W4001StgInstrService {

    //--------------------------------- Parameter check method - validateConsistency ----------------------------------
    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * Check correlation of Staging Instruction Date
     * <br />Staging Instruction Dateの相関チェックを行います。
     *
     * <pre>
     * - Correlation check of Staging Instruction Date
     *     A check is made if both Staginf Instruction and (From) Staginf Instruction of (To) is input.
     *     For details, common specifications xls: - see "functional specifications common date From correlation check of To".
     *
     * - 荷揃え指示日の相関チェック
     *     荷揃え指示日(From)と荷揃え指示日(To)の両方が入力された場合にチェック
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     *
     * @param instrDtFrom Staging Instruction Date(From)
     * @param instrDtTo Staging Instruction Date(To)
     * @param dateFormat Date format
     * @return true, false otherwise if there is an error in the input value
     */
    public boolean validateConsistencyFmInstrDateToInstrDate(String instrDtFrom, String instrDtTo, String dateFormat);

    /**
     * Shipper authority check
     * <br />Shipper権限チェックを行います。
     * <pre>
     * - The Shipper that you specify, and check that there is an update privileges for this function to log in person
     *     - Call of userAuthService.hasUserAuthForComp an argument shipperCd, "W4001R"
     *         For details, common specifications xls: see "access common specifications refer to and update authority".
     *
     * - 指定したShipperで、ログイン者にこの機能の更新権限があることをチェック
     *     - shipperCd、"W4001R"を引数にuserAuthService.hasUserAuthForCompの呼び出し
     *         詳細は共通仕様.xls「アクセス権限共通仕様：参照・更新権限」を参照
     * </pre>
     * 
     * @param shipperCd Company code
     * @return True, false and otherwise if there is a function use rights to the company code specified
     * @throws ApplicationException If the authorization check can not be
     */
    boolean validateConsistencyShipperAuth(String shipperCd) throws ApplicationException;


    //--------------------------------- Check database method - validateDatabase ----------------------------------
    //--------------------------------- データベースチェックメソッド validateDatabase ----------------------------------

    /**
     * Do W / H Company, the NEXUS W / H combination check.
     * <br />W/H Company、NEXUS W/H　組み合わせチェックを行います。
     *
     * <pre>
     * More common specification xls: See "Common Functional Specifications W / H Company, NEXUS W / H combination check" the.
     *
     * 詳細は共通仕様.xls「機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック」を参照
     * </pre>
     *
     * @param compCd W/H Company
     * @param whCd NEXUS W/H
     * @return True combination W / H company, of W / H is present in the original warehouse unit,
     *          False otherwise
     * @throws ApplicationException If TM_NXS_WH can not browse
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd) throws ApplicationException;

    /**
     * Make the past day check using the time zone of the company that has been specified
     * <br />指定された会社のタイムゾーンを使用して過去日チェックを行います。
     * <pre>
     * - For features that can be identified shipper, I invoke the argument CommonService.validateAfterDateComp to the company code of the shipper
     * - More common specification xls: see "functional specifications common past date check"
     *
     * - 荷主が特定できる機能のため、荷主の会社コードを引数にCommonService.validateAfterDateCompの呼び出し
     * - 詳細は共通仕様.xls「機能仕様共通：過去日チェック」を参照
     * </pre>
     *
     * @param date Input date
     * @param dateFormat Date format
     * @param compCd Shipper company code
     * @return Date entered the true, false and if not, not a past date
     * @throws ApplicationException If the date format can not be obtained
     */
    boolean validateDatabaseAfterDateComp(String date, String dateFormat, String compCd)
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
     * @param compCd Company code
     * @return True, false and otherwise company code exists in the company NEXUS basic unit as the shipping company
     * @throws ApplicationException If the company NEXUS basic unit can not browse
     */
    public boolean validateDatabaseCarrier(String compCd) throws ApplicationException;

    /**
     * Check the shipping company existence check
     * <br />Shipper存在チェックを行います。
     * <pre>
     * More common specification xls: see "Common Shipper functional specifications presence check"
     *
     * 詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     *
     * @param compCd Company code
     * @return True, false and otherwise company code exists in the company NEXUS basic unit as the shipping company
     * @throws ApplicationException If the company NEXUS basic unit can not browse
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException;

    /**
     * Check palletize is whether it is save one or more Staging Instruction Work
     * <br />パレタイズが荷揃え指示ワークに1件以上登録されているかのチェックを行います。
     * <pre>
     * - Search Staging Instruction Work
     *     - Use the SACT, get the number of Staging Instruction Work
     *     - If 0 with reviews, number error
     *
     * - 荷揃え指示ワークの検索
     *     - SACTを使用し、荷揃え指示ワークの件数を取得
     *     - 件数が0件の場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return If false true, this is not the case if there is a registration to Staging Instruction Work
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public boolean validateDatabaseTwStgInstrOnCreateMoveToRegister(String loginUserDscId)
        throws ApplicationException;

    /**
     * Check the upper limit of Staging Instruction configuration palletize number
     * <br />荷揃え指示構成パレタイズ数の上限チェックを行います。
     * <pre>
     * - Check upper limit of Staging Instruction configuration palletize number
     *     - Use the SACT, get the number of work Staging instruction 
     *     - If the number + countNew> 999, error
     *
     * - 荷揃え指示構成パレタイズ数の上限チェック
     *     - SACTを使用し、荷揃え指示ワークの件数を取得
     *     - 件数 + countNew > 999の場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @param countNew Count for create
     * @return If fasle true, this is not the case when the total number of palletize that make up the Staging instruction becomes 999 or less
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public boolean validateDatabaseTwStgInstrOnCreateUpdateByCount(String loginUserDscId, int countNew)
        throws ApplicationException;

    /**
     * Do work Ship To, select the Ship To check match
     * <br />ワークShip To、選択Ship To一致チェックを行います。
     * <pre>
     * - Work Ship To, select Ship To match check 
     *    - The call of W4001StgInstrDao.searchTwStgInstrByShipToSummary an argument loginUserDscId
     *    - If the result of calling the number> 1 of W4001StgInstrDao.searchTwStgInstrByShipToSummary, error
     *    - If the Ship To and shipToCd, the result of a call W4001StgInstrDao.searchTwStgInstrByShipToSummary is different, error
     *
     * - ワークShip To、選択Ship To一致チェック
     *    - loginUserDscIdを引数にW4001StgInstrDao.searchTwStgInstrByShipToSummaryの呼び出し
     *    - W4001StgInstrDao.searchTwStgInstrByShipToSummaryの呼び出し結果件数 > 1の場合、エラー
     *    - shipToCdと、W4001StgInstrDao.searchTwStgInstrByShipToSummaryの呼び出し結果のShip Toが異なる場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @param shipToCd Ship to code
     * @return If false true, this is not the case when there is no Ship to mix
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public boolean validateDatabaseTwStgInstrOnCreateUpdateByShipTo(String loginUserDscId, String shipToCd)
        throws ApplicationException;

    /**
     * In order to register a Staging Instruction to check the status and lock the palletize
     * <br />荷揃え指示を登録するために、パレタイズをロックしステータスをチェックします。
     * <pre>
     * - Lock of palletize
     *     - Call the W4001StgInstrDao.lockTtPltzByMainMarkListNoWait an argument mainMarkList
     *     - If the number does not match the size of mainMarkList, error
     * - Check palletize
     *     - Palletizing status check
     *         - If the palletize status there is a record "10" ( palletize ) other than in the record of the palletize that locked , error
     *     - Loading and unloading status check
     *         - If there is a record "20" of ( Okuni invoicing ) , loading and unloading status is an error in the record of palletize that locked
     *
     * - パレタイズのロック
     *     - mainMarkListを引数にW4001StgInstrDao.lockTtPltzByMainMarkListNoWaitの呼び出し
     *     - 件数がmainMarkListのサイズと一致しない場合、エラー
     * - パレタイズのチェック
     *     - パレタイズステータスチェック
     *         - ロックしたパレタイズのレコードにパレタイズステータスが"10"(パレタイズ)以外のレコードがある場合、エラー
     *     - 搬出入ステータスチェック
     *         - ロックしたパレタイズのレコードに搬出入ステータスが"20"(送荷書発行)のレコードがある場合、エラー
     * </pre>
     *
     * @param mainMarkList Selected main mark list
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegister(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException;

    /**
     * In order to register a Staging Instruction to check the export request palletize unit
     * <br />荷揃え指示を登録するために、パレタイズを輸出依頼単位にチェックします。
     * <pre>
     * - Check the export request unit
     *     - Call the W4001StgInstrDao.searchTwPltzOnRegisterByExpReq an argument loginUserDscId
     *     - If there is a thing of the CML issued part of the way into the export request that is the Partial shipments ban , error
     *     - If there is a thing of the palletize unselected in the export request that is the Partial shipments ban , error
     *
     * - 輸出依頼単位のチェック
     *     - loginUserDscIdを引数にW4001StgInstrDao.searchTtPltzByExpReqの呼び出し
     *     - 分割船積禁止となっている輸出依頼の中にCML発行途中のものがある場合、エラー
     *     - 分割船積禁止となっている輸出依頼の中にパレタイズ未選択のものがある場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegisterByExpReq(String loginUserDscId, List<String[]> paramsList)
        throws ApplicationException;

    /**
     * Lock the staging instruction
     * <br />荷揃え指示をロックします。
     * <pre>
     * - Use the SACT, Lock Staging instruction the key stgInstrNo
     *     - If 0 with reviews, error 
     *
     * - SACTを使用し、stgInstrNoをキーに荷揃え指示をロック
     *     - 0件の場合、エラー
     * </pre>
     *
     * @param stgInstrNo Staging Instruction no
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTtStgInstrOnRegister(String stgInstrNo)
        throws ApplicationException;

    /**
     * In order to update to "Staging Instruction Completed" the status of the Staging Instruction to lock the palletize
     * <br />荷揃え指示のステータスを"荷揃え実績"に更新するために、パレタイズをロックします。
     * <pre>
     * - Lock of palletize
     *     - Call the W4001StgInstrDao.lockTtPltzByMainMarkListNoWait an argument mainMarkList
     *     - If 0 with reviews, error 
     *     - If there is a record "20" of (Staging instruction) other than, palletize status error
     *
     * - パレタイズのロック
     *     - mainMarkListを引数にW4001StgInstrDao.lockTtPltzByMainMarkListNoWaitの呼び出し
     *     - 0件の場合、エラー
     *     - パレタイズステータスが"20"(荷揃え指示)以外のレコードがある場合、エラー
     * </pre>
     *
     * @param mainMarkList Selected main mark list
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegisterWorking(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException;

    /**
     * In order to cancel the Staging Instruction to lock the palletize
     * <br />荷揃え指示をキャンセルするために、パレタイズをロックします。
     * <pre>
     * - Lock of palletize
     *     - Call the W4001StgInstrDao.lockTtPltzByMainMarkListNoWait an argument mainMarkList
     *     - If 0 with reviews, error 
     *     - If there is a record "20"(Staging Instruction) / "30"(Staging Instruction worked done) other than, palletize status error
     *
     * - パレタイズのロック
     *     - mainMarkListを引数にW4001StgInstrDao.lockTtPltzByMainMarkListNoWaitの呼び出し
     *     - 0件の場合、エラー
     *     - パレタイズステータスが"20"(荷揃え指示)、"30"(荷揃え実績)以外のレコードがある場合、エラー
     * </pre>
     *
     * @param mainMarkList Selected main mark list
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegisterCancel(List<String> mainMarkList, List<String[]> paramsList)
        throws ApplicationException;


    //--------------------------------- Search methods - search  ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Get the number of searches of Staging Instruction to the Main screen for
     * <br />Main画面用に荷揃え指示の検索件数を取得します。
     *
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the W4001StgInstrDao.searchCountForPagingOnMainSearch
     * - The return to the result of a call of W4001StgInstrDao.searchCountForPagingOnMainSearch
     *
     * - stgInstrCriteriaDomainを引数に、W4001StgInstrDao.searchCountForPagingOnMainSearchの呼び出し
     * - W4001StgInstrDao.searchCountForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is pStaging Instruction
     */
    public int searchCountForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for Staging Instruction to the Main screen for
     * <br />Main画面用に荷揃え指示の検索を行います。
     *
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the W4001StgInstrDao.searchForPagingOnMainSearch
     * - The return to the result of a call of W4001StgInstrDao.searchForPagingOnMainSearch
     *
     * - stgInstrCriteriaDomainを引数に、W4001StgInstrDao.searchForPagingOnMainSearchの呼び出し
     * - W4001StgInstrDao.searchForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public List<? extends W4001StgInstrDomain> searchForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of shipping instruction and shipping actuality to the Main screen for
     * <br />Create画面用にパレタイズの検索件数を取得します。
     *
     * <pre>
     * - An argument pltzCriteriaDomain, Call the W4001StgInstrDao.searchCountForPagingOnCreateSearch
     * - The return to the result of a call of W4001StgInstrDao.searchCountForPagingOnCreateSearch
     *
     * - pltzCriteriaDomainを引数に、W4001StgInstrDao.searchCountForPagingOnCreateSearchの呼び出し
     * - W4001StgInstrDao.searchCountForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Instruction or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for shipping instruction and shipping actuality to the Create screen for
     * <br />Create画面用にパレタイズを検索します。
     *
     * <pre>
     * - An argument pltzCriteriaDomain, Call the W4001StgInstrDao.searchForPagingOnCreateSearch
     * - Use CommonService.convertUnit, and converted to a unit of the shipper and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4001StgInstrDao.searchForPagingOnCreateSearch
     *
     * - pltzCriteriaDomainを引数に、W4001StgInstrDao.searchForPagingOnCreateSearchの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをshipperの単位に変換
     * - W4001StgInstrDao.searchForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction or staging actuality
     */
    public List<? extends W4001PltzDomain> searchForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that is included in the Staging Instruction for the (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に荷揃え指示に含まれるパレタイズの検索件数を取得します。
     *
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the W4001StgInstrDao.searchCountOnRegisterInitByFromMain
     * - The return to the result of a call of W4001StgInstrDao.searchCountOnRegisterInitByFromMain
     *
     * - stgInstrCriteriaDomainを引数に、W4001StgInstrDao.searchCountOnRegisterInitByFromMainの呼び出し
     * - W4001StgInstrDao.searchCountOnRegisterInitByFromMainの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public int searchCountOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that is included in the Staging Instruction for (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に荷揃え指示に含まれるパレタイズを検索します。
     *
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the W4001StgInstrDao.searchOnRegisterInitByFromMain
     * - Use CommonService.convertUnit, and converted to a unit of the shipper and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4001StgInstrDao.searchOnRegisterInitByFromMain
     *
     * - stgInstrCriteriaDomainを引数に、W4001StgInstrDao.searchOnRegisterInitByFromMainの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをshipperの単位に変換
     * - 参照権限のない検索結果レコードをマスク
     * - W4001StgInstrDao.searchOnRegisterInitByFromMainの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to find the X-Tag/palletize included in the Staging Instruction Register screen
     * <br />Register画面(Create画面からの遷移)用に、荷揃え指示に含まれるパレタイズを検索します。
     *
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the W4001StgInstrDao.searchOnRegisterInitByFromCreate
     * - Use CommonService.convertUnit, and converted to a unit of the shipper and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4001StgInstrDao.searchOnRegisterInitByFromCreate
     *
     * - stgInstrCriteriaDomainを引数に、W4001StgInstrDao.searchOnRegisterInitByFromCreateの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをshipperの単位に変換
     * - W4001StgInstrDao.searchOnRegisterInitByFromCreateの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromCreate(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Create a (Staging Instruction) L4001
     * <br />L4001(Staging Instruction)を作成します。
     * <pre>
     * - An argument stgInstrCriteriaDomain, Call the L4001ReportService.searchTtStgInstr
     * - The return to the result of a call of L4001ReportService.searchTtStgInstr
     *
     * - stgInstrCriteriaDomainを引数に、L4001ReportService.searchTtStgInstrの呼び出し
     * - L4001ReportService.searchTtStgInstrの呼び出し結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return PDF File object
     * @throws ApplicationException If the PDF document can not be created
     */
    public File printStgInstr(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain) throws ApplicationException;


    //--------------------------------- Registration method - create  ----------------------------------
    //--------------------------------- 登録系メソッド create ----------------------------------

    /**
     * Register the palletize to Staging Instruction Work
     * <br />荷揃え指示ワークにパレタイズを登録します。
     * <pre>
     * - Registration of Staging Instruction Work
     *     - Use the SACT, to register to Staging Instruction Work all the mainMark of stgInstrDomain.pltzDomainList
     *
     * - 荷揃え指示ワークの登録
     *     - SACTを使用し、stgInstrDomain.pltzDomainListの各mainMarkを全て荷揃え指示ワークに登録
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @throws ApplicationException If you can not create
     */
    public void createOnCreateUpdate(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;


    //--------------------------------- Update method - update  ----------------------------------
    //--------------------------------- 更新系メソッド update ----------------------------------

    /**
     * Updated to "Staging Instruction Completed" the status of the Staging Instruction
     * <br />荷揃え指示のステータスを"荷揃え実績"に更新します。
     * <pre>
     * - Update - Staging instruction
     *     - Based on staging instruction of stgInstrDomain, uses the SACT, updated to "worked done" staging instruction status
     * - Update - palletize 
     *     - Based on Main Mark of stgInstrDomain.pltzDomainList, uses the SACT, updated to "Staging Instruction worked done" palletize status
     *
     * - 荷揃え指示の更新
     *     - SACTを使用し、stgInstrDomainの荷揃え指示No.を元に、荷揃え指示の荷揃え指示ステータスを荷揃え実績に更新
     * - パレタイズの更新
     *     - SACTを使用し、stgInstrDomain.pltzDomainListの各Main Markを元に、パレタイズステータスを荷揃え実績に更新
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @return Staging Instruction update count
     * @throws ApplicationException If you can not update
     */
    public int updateOnRegisterWorking(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;


    //--------------------------------- Delete method - delete ----------------------------------
    //--------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * Clear the information of Staging Instruction Work
     * <br />荷揃え指示ワークの情報をクリアします。
     * <pre>
     * - Use the SACT, Delete Staging Instruction Work as a key stgInstrDomain.loginDscId
     *
     * - SACTを使用し、stgInstrDomain.loginDscIdをキーに荷揃え指示ワークを削除
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @return Staging Instruction update count
     * @throws ApplicationException If you can not register
     */
    public int deleteOnHeaderInit(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;

    /**
     * Remove from the Staging Instruction Work information of palletize specified
     * <br />指定のパレタイズの情報を荷揃え指示ワークから削除します。
     * <pre>
     * - Use the SACT, and delete records in the Staging Instruction Work as a key stgInstrDomain.pltzDomainList.mainMark
     *
     * - SACTを使用し、stgInstrDomain.pltzDomainListの各mainMarkをキーに荷揃え指示ワークのレコードを削除
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @return Staging Instruction update count
     * @throws ApplicationException If you can not register
     */
    public int deleteOnRegisterDelete(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;


    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * Register the Staging Instruction, it updates the status palletize
     * <br />荷揃え指示を登録し、パレタイズステータスを更新します。
     * <pre>
     * - Call the CommonService.transactSequence, and numbering the staging instruction No.
     * - Use the SACT, to register the Staging Instruction
     * - Use the SACT, and delete records in the Staging Instruction Work
     * - Updated palletize status of palletize that uses SACT, locked , the Staging Instruction No.
     *
     * - CommonService.transactSequenceを呼び出し、荷揃え指示No.を採番
     * - SACTを使用し、荷揃え指示を登録
     * - SACTを使用し、荷揃え指示ワークのレコードを削除
     * - SACTを使用し、stgInstrDomain.pltzDomainListの各Main Markを元に、パレタイズのパレタイズステータス、荷揃え指示No.を更新
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @return New staging instr no.
     * @throws ApplicationException If you can not register
     */
    public String transactOnRegister(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;

    /**
     * Cancel the Staging Instruction already created
     * <br />作成済みの荷揃え指示をキャンセルします。
     * <pre>
     * - Use the SACT, remove the Staging Instruction that you lock
     * - Updated the palletize status of palletize that uses SACT, locked. Clear Staging Instruction No.
     *
     * - SACTを使用し、stgInstrDomain.stgInstrNoをキーに、荷揃え指示を削除
     * - SACTを使用し、stgInstrDomain.pltzDomainListの各mainMarkをキーに、パレタイズのパレタイズステータスを更新。荷揃え指示No.をクリア
     * </pre>
     *
     * @param stgInstrDomain Staging Instruction domain
     * @return Staging Instruction update count
     * @throws ApplicationException If you can not update
     */
    public int transactOnRegisterCancel(W4001StgInstrDomain stgInstrDomain) throws ApplicationException;
}
