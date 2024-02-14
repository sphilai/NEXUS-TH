/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;

/**
 * Interface of the service that provides a Staging Actuality function
 * <br />山作り実績機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:w4005StgActService
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9359 $
 */
public interface W4005StgActService {

    //--------------------------------- Parameter check method - validateConsistency ----------------------------------
    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------

    /**
     * Check correlation of Staging Actuality Date
     * <br />Staging Actuality Dateの相関チェックを行います。
     *
     * <pre>
     * - Correlation check of Staging Actuality Date
     *     A check is made if both Staginf Instruction and (From) Staginf Instruction of (To) is input.
     *     For details, common specifications xls: - see "functional specifications common date From correlation check of To".
     *
     * - 山作り実績日の相関チェック
     *     山作り実績日(From)と山作り実績日(To)の両方が入力された場合にチェック
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     *
     * @param instrDtFrom Staging Actuality Date(From)
     * @param instrDtTo Staging Actuality Date(To)
     * @param dateFormat Date format
     * @return true, false otherwise if there is an error in the input value
     */
    public boolean validateConsistencyFmInstrDateToInstrDate(String instrDtFrom, String instrDtTo, String dateFormat);

    /**
     * Shipper authority check
     * <br />Shipper権限チェックを行います。
     * <pre>
     * - The Shipper that you specify, and check that there is an update privileges for this function to log in person
     *     - Call of userAuthService.hasUserAuthForComp an argument shipperCd, "W4005R"
     *         For details, common specifications xls: see "access common specifications refer to and update authority".
     *
     * - 指定したShipperで、ログイン者にこの機能の更新権限があることをチェック
     *     - shipperCd、"W4005R"を引数にuserAuthService.hasUserAuthForCompの呼び出し
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
     * Make the past day check using the time zone of the login user
     * <br />ログインユーザーのタイムゾーンを使用して過去日チェックを行います。
     * <pre>
     * - For features that can not be identified shipper, I invoke the argument CommonService.validateAfterDate to the timezone id of login user
     * - More common specification xls: see "functional specifications common past date check"
     *
     * - 荷主が特定できない機能のため、ログイン者のタイムゾーンIDを引数にCommonService.validateAfterDateの呼び出し
     * - 詳細は共通仕様.xls「機能仕様共通：過去日チェック」を参照
     * </pre>
     *
     * @param date Input date
     * @param dateFormat Date format
     * @param loginUserTimezoneId Login user timezone ID
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
     * @param compCd Company code
     * @return True, false and otherwise company code exists in the company NEXUS basic unit as the shipping company
     * @throws ApplicationException If the company NEXUS basic unit can not browse
     */
    public boolean validateDatabaseCarrier(String compCd) throws ApplicationException;

    /**
     * Check palletize is whether it is save one or more Staging Actuality Work
     * <br />パレタイズが山作り実績ワークに1件以上登録されているかのチェックを行います。
     * <pre>
     * - Search Staging Actuality Work
     *     - Use the SACT, get the number of Staging Actuality Work
     *     - If 0 with reviews, number error
     *
     * - 山作り実績ワークの検索
     *     - SACTを使用し、山作り実績ワークの件数を取得
     *     - 件数が0件の場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return If false true, this is not the case if there is a registration to Staging Actuality Work
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public boolean validateDatabaseTwStgActOnCreateMoveToRegister(String loginUserDscId)
        throws ApplicationException;

    /**
     * Check the upper limit of Staging Actuality configuration palletize number
     * <br />山作り実績構成パレタイズ数の上限チェックを行います。
     * <pre>
     * - Check upper limit of Staging Actuality configuration palletize number
     *     - Use the SACT, get the number of work Staging actuality 
     *     - If the number + countNew> 999, error
     *
     * - 山作り実績構成パレタイズ数の上限チェック
     *     - SACTを使用し、山作り実績ワークの件数を取得
     *     - 件数 + countNew > 999の場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @param countNew Count for create
     * @return If fasle true, this is not the case when the total number of palletize that make up the Staging actuality becomes 999 or less
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public boolean validateDatabaseTwStgActOnCreateUpdateByCount(String loginUserDscId, int countNew)
        throws ApplicationException;

    /**
     * In order to register a Staging Actuality to check the status and lock the palletize
     * <br />山作り実績を登録するために、パレタイズをロックしステータスをチェックします。
     * <pre>
     * - Lock of palletize
     *     - Call the W4005StgActDao.lockTtPltzByMainMarkListNoWait an argument pltzDomainList
     *     - If the number does not match the size of pltzDomainList, error
     * - Check palletize
     *     - Palletizing status check
     *         - In the following cases, palletize status of the record of palletize that locked error 
     *             - If "Y" is INSTR_FLG of the (instruction product) 
     *                 - In the case of "A" or "B" is CUSTOM_TIMING_TYP, if "30" of (Staging instruction worked done), then an error 
     *                 - If "Z" is CUSTOM_TIMING_TYP, if "40" of the (customs), then an error 
     *             - If "N" is INSTR_FLG of (Shigeyuki product), if "10" (palletize), then an error
     *     - Loading and unloading status check
     *         - If there is a record "10" (blank), "40" of (accepted) other than loading and unloading status is an error in the record of palletize that locked
     *
     * - パレタイズのロック
     *     - pltzDomainListを引数にW4005StgActDao.lockTtPltzByMainMarkListNoWaitの呼び出し
     *     - 件数がpltzDomainListのサイズより小さい場合、エラー
     * - パレタイズのチェック
     *     - パレタイズステータスチェック
     *         - ロックしたパレタイズのレコードのパレタイズステータスが次の場合、エラー
     *             - INSTR_FLGが"Y"(指示品)の場合
     *                 - CUSTOM_TIMING_TYPが"A"or"B"の場合、"30"(荷揃え実績)以外の場合、エラー
     *                 - CUSTOM_TIMING_TYPが"Z"の場合、"40"(通関)以外の場合、エラー
     *             - INSTR_FLGが"N"(成行品)の場合、"10"(パレタイズ)以外の場合、エラー
     *     - 搬出入ステータスチェック
     *         - ロックしたパレタイズのレコードに搬出入ステータスが"10"(ブランク)、"40"(受入)以外のレコードがある場合、エラー
     * </pre>
     *
     * @param pltzDomainList Selected main mark list
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegister(List<? extends W4005PltzDomain> pltzDomainList,
        List<String[]> paramsList) throws ApplicationException;

    /**
     * In order to register a Staging Actuality to check the staging instruction palletize unit
     * <br />山作り実績を登録するために、パレタイズを荷揃え指示単位にチェックします。
     * <pre>
     * - Check the staging instruction unit
     *     - Call the W4005StgActDao.searchTtPltzByStgInstr an argument loginUserDscId
     *     - If there are staging instructions unselected, error
     *
     * - 荷揃え指示単位のチェック
     *     - loginUserDscIdを引数にW4005StgActDao.searchTtPltzByStgInstrの呼び出し
     *     - 未選択の荷揃え指示がある場合、エラー
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTtPltzOnRegisterByStgInstr(String loginUserDscId) throws ApplicationException;

    /**
     * In order to register a Staging Actuality to check for the presence staging instruction
     * <br />山作り実績を登録するために、荷揃え指示の存在をチェックします。
     * <pre>
     * - Lock of staging instruction
     *     - Call the W4005StgActDao.lockTtStgInstrByStgInstrNoListNoWait an argument stgInstrNoList
     *     - If the number does not match the size of stgInstrNoList, error
     *
     * - 荷揃え指示のロック
     *     - stgInstrNoListを引数にW4005StgActDao.lockTtStgInstrByStgInstrNoListNoWaitの呼び出し
     *     - 件数がstgInstrNoListのサイズと一致しない場合、エラー
     * </pre>
     *
     * @param stgInstrNoList Staging instruction no list
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTtStgInstrOnRegister(List<String> stgInstrNoList) throws ApplicationException;

    /**
     * In order to register a Staging Actuality to check for the presence transportation type master
     * <br />山作り実績を登録するために、輸送手段種別原単位の存在をチェックします。
     * <pre>
     * - Search transportation type master
     *     - Use the SACT, the key trnsCd, the trnsTypCd, you can search and transportation type master
     *     - If 0 with reviews, error
     *
     * - 輸送手段種別原単位の検索
     *     - SACTを使用し、trnsCd、trnsTypCdをキーに、輸送手段種別原単位を検索
     *     - 0件の場合、エラー
     * </pre>
     *
     * @param trnsCd Transport code
     * @param trnsTypCd Transport type code
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTmTrnsTyp(String trnsCd, String trnsTypCd) throws ApplicationException;

    /**
     * Lock the staging actuality
     * <br />山作り実績をロックします。
     * <pre>
     * - Use the SACT, Lock Staging actuality the key stgActNo
     *     - If 0 with reviews, error 
     *
     * - SACTを使用し、stgActNoをキーに山作り実績をロック
     *     - 0件の場合、エラー
     * </pre>
     *
     * @param stgActNo Staging Actuality no
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTtStgActOnRegister(String stgActNo)
        throws ApplicationException;

    /**
     * Lock palletize of staging actuality after registration
     * <br />山作り実績登録後のパレタイズをロックします。
     * <pre>
     * - Lock of palletize
     *     - Call the W4005StgActDao.lockTtPltzByStgActNoNoWait an argument stgActNo
     *     - If 0 with reviews, error 
     *     - If there is a record "50" of (Staging Actuality) other than, palletize status error
     *
     * - パレタイズのロック
     *     - stgActNoを引数にW4005StgActDao.lockTtPltzByStgActNoNoWaitの呼び出し
     *     - 0件の場合、エラー
     *     - パレタイズステータスが"50"(山作り実績)以外のレコードがある場合、エラー
     * </pre>
     *
     * @param stgActNo Staging actuality No.
     * @param paramsList Error supplementary information
     * @return Check OK: null, check NG: message ID
     * @throws ApplicationException If you can not check
     */
    public String validateDatabaseTtPltzOnRegisterUpdate(String stgActNo, List<String[]> paramsList)
        throws ApplicationException;

    /**
     * Lock staging instruction of staging actuality after registration
     * <br />山作り実績登録後の荷揃え指示をロックします。
     * <pre>
     * - Lock of staging instruction
     *     - Call the W4005StgActDao.lockTtStgInstrByStgInstrNoListNoWait an argument stgActNo
     *     - If 0 with reviews, error 
     *
     * - 荷揃え指示のロック
     *     - stgActNoを引数にW4005StgActDao.lockTtStgInstrByStgInstrNoListNoWaitの呼び出し
     *     - 0件の場合、エラー
     * </pre>
     *
     * @param stgActNo Staging actuality No.
     * @return Check OK: true, check NG: false
     * @throws ApplicationException If you can not check
     */
    public boolean validateDatabaseTtStgInstrOnRegisterUpdate(String stgActNo) throws ApplicationException;


    //--------------------------------- Search methods - search  ----------------------------------
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Get the number of searches of Staging Actuality to the Main screen for
     * <br />Main画面用に山作り実績の検索件数を取得します。
     *
     * <pre>
     * - An argument stgActCriteriaDomain, Call the W4005StgActDao.searchCountForPagingOnMainSearch
     * - The return to the result of a call of W4005StgActDao.searchCountForPagingOnMainSearch
     *
     * - stgActCriteriaDomainを引数に、W4005StgActDao.searchCountForPagingOnMainSearchの呼び出し
     * - W4005StgActDao.searchCountForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is pStaging Actuality
     */
    public int searchCountForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for Staging Actuality to the Main screen for
     * <br />Main画面用に山作り実績の検索を行います。
     *
     * <pre>
     * - An argument stgActCriteriaDomain, Call the W4005StgActDao.searchForPagingOnMainSearch
     * - The return to the result of a call of W4005StgActDao.searchForPagingOnMainSearch
     *
     * - stgActCriteriaDomainを引数に、W4005StgActDao.searchForPagingOnMainSearchの呼び出し
     * - W4005StgActDao.searchForPagingOnMainSearchの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public List<? extends W4005StgActDomain> searchForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of shipping instruction and shipping actuality to the Main screen for
     * <br />Create画面用にパレタイズの検索件数を取得します。
     *
     * <pre>
     * - An argument pltzCriteriaDomain, Call the W4005StgActDao.searchCountForPagingOnCreateSearch
     * - The return to the result of a call of W4005StgActDao.searchCountForPagingOnCreateSearch
     *
     * - pltzCriteriaDomainを引数に、W4005StgActDao.searchCountForPagingOnCreateSearchの呼び出し
     * - W4005StgActDao.searchCountForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Actuality or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for shipping instruction and shipping actuality to the Create screen for
     * <br />Create画面用にパレタイズを検索します。
     *
     * <pre>
     * - An argument pltzCriteriaDomain, Call the W4005StgActDao.searchForPagingOnCreateSearch
     * - Use CommonService.convertUnit, and converted to a unit of login user and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4005StgActDao.searchForPagingOnCreateSearch
     *
     * - pltzCriteriaDomainを引数に、W4005StgActDao.searchForPagingOnCreateSearchの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の単位に変換
     * - W4005StgActDao.searchForPagingOnCreateSearchの呼び出し結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality or staging actuality
     */
    public List<? extends W4005PltzDomain> searchForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that is included in the Staging Actuality for the (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に山作り実績に含まれるパレタイズの検索件数を取得します。
     *
     * <pre>
     * - An argument stgActCriteriaDomain, Call the W4005StgActDao.searchCountOnRegisterInitByFromMain
     * - The return to the result of a call of W4005StgActDao.searchCountOnRegisterInitByFromMain
     *
     * - stgActCriteriaDomainを引数に、W4005StgActDao.searchCountOnRegisterInitByFromMainの呼び出し
     * - W4005StgActDao.searchCountOnRegisterInitByFromMainの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public int searchCountOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that is included in the Staging Actuality for (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に山作り実績に含まれるパレタイズを検索します。
     *
     * <pre>
     * - An argument stgActCriteriaDomain, Call the W4005StgActDao.searchOnRegisterInitByFromMain
     * - Use CommonService.convertUnit, and converted to a unit of login user and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4005StgActDao.searchOnRegisterInitByFromMain
     *
     * - stgActCriteriaDomainを引数に、W4005StgActDao.searchOnRegisterInitByFromMainの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の単位に変換
     * - 参照権限のない検索結果レコードをマスク
     * - W4005StgActDao.searchOnRegisterInitByFromMainの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public W4005StgActDomain searchOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to find the X-Tag/palletize included in the Staging Actuality Register screen
     * <br />Register画面(Create画面からの遷移)用に、山作り実績に含まれるパレタイズを検索します。
     *
     * <pre>
     * - An argument stgActCriteriaDomain, Call the W4005StgActDao.searchOnRegisterInitByFromCreate
     * - Use CommonService.convertUnit, and converted to a unit of login user and VOLUME GROSS_WEIGHT of search results
     * - The return to the result of a call of W4005StgActDao.searchOnRegisterInitByFromCreate
     *
     * - stgActCriteriaDomainを引数に、W4005StgActDao.searchOnRegisterInitByFromCreateの呼び出し
     * - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の単位に変換
     * - W4005StgActDao.searchOnRegisterInitByFromCreateの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public W4005StgActDomain searchOnRegisterInitByFromCreate(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Create a (Staging Actuality) L4002
     * <br />L4002(Staging Actuality)を作成します。
     * <pre>
     * - An argument stgActCriteriaDomain, Call the L4002ReportService.searchTtStgAct
     * - The return to the result of a call of L4002ReportService.searchTtStgAct
     *
     * - stgActCriteriaDomainを引数に、L4002ReportService.searchTtStgActの呼び出し
     * - L4002ReportService.searchTtStgActの呼び出し結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return PDF File object
     * @throws ApplicationException If the PDF document can not be created
     */
    public File printStgAct(W4005StgActCriteriaDomain stgActCriteriaDomain) throws ApplicationException;


    //--------------------------------- Registration method - create  ----------------------------------
    //--------------------------------- 登録系メソッド create ----------------------------------

    /**
     * Register the palletize to Staging Actuality Work
     * <br />山作り実績ワークにパレタイズを登録します。
     * <pre>
     * - Registration of Staging Actuality Work
     *     - Use the SACT, to register to Staging Actuality Work all the mainMark of stgActDomain.pltzDomainList
     *
     * - 山作り実績ワークの登録
     *     - SACTを使用し、stgActDomain.pltzDomainListの各mainMarkを全て山作り実績ワークに登録
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @throws ApplicationException If you can not create
     */
    public void createOnCreateUpdate(W4005StgActDomain stgActDomain) throws ApplicationException;


    //--------------------------------- Update method - update  ----------------------------------
    //--------------------------------- 更新系メソッド update ----------------------------------

    /**
     * Updated to "Staging Actuality Completed" the status of the Staging Actuality
     * <br />山作り実績のETD、Carrierを更新します。
     * <pre>
     * - Update - Staging actuality
     *     - Use the SACT, a key staging actuality No. of stgActDomain, Update ETD / carrier of staging actuality
     *
     * - 山作り実績の更新
     *     - SACTを使用し、stgActDomainの山作り実績No.をキーに、山作り実績のETD、Carrierを更新
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @return Staging Actuality update count
     * @throws ApplicationException If you can not update
     */
    public int updateOnRegisterUpdateEtdCarrier(W4005StgActDomain stgActDomain) throws ApplicationException;


    //--------------------------------- Delete method - delete ----------------------------------
    //--------------------------------- 削除系メソッド delete ----------------------------------

    /**
     * Clear the information of Staging Actuality Work
     * <br />山作り実績ワークの情報をクリアします。
     * <pre>
     * - Use the SACT, Delete Staging Actuality Work as a key stgActDomain.loginDscId
     *
     * - SACTを使用し、stgActDomain.loginDscIdをキーに山作り実績ワークを削除
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @return Staging Actuality update count
     * @throws ApplicationException If you can not register
     */
    public int deleteOnHeaderInit(W4005StgActDomain stgActDomain) throws ApplicationException;

    /**
     * Remove from the Staging Actuality Work information of palletize specified
     * <br />指定のパレタイズの情報を山作り実績ワークから削除します。
     * <pre>
     * - Use the SACT, and delete records in the Staging Actuality Work as a key stgActDomain.pltzDomainList.mainMark
     *
     * - SACTを使用し、stgActDomain.pltzDomainListの各mainMarkをキーに山作り実績ワークのレコードを削除
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @return Staging Actuality update count
     * @throws ApplicationException If you can not register
     */
    public int deleteOnRegisterDelete(W4005StgActDomain stgActDomain) throws ApplicationException;


    //--------------------------------- Transaction method - transact ----------------------------------
    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * Register the Staging Actuality, it updates the status palletize
     * <br />山作り実績を登録し、パレタイズステータスを更新します。
     * <pre>
     * - Call the CommonService.transactSequence, and numbering the staging actuality No.
     * - Use the SACT, to register the Staging Actuality
     * - Use the SACT, and delete records in the Staging Actuality Work
     * - Updated palletize status of palletize that uses SACT, locked , the Staging Actuality No.
     * - Use the SACT, based on staging instructions No, the update staging actuality No. Staging instruction aligned each load of stgActDomain.pltzDomainList
     *
     * - CommonService.transactSequenceを呼び出し、山作り実績No.を採番
     * - SACTを使用し、山作り実績を登録
     * - SACTを使用し、山作り実績ワークのレコードを削除
     * - SACTを使用し、stgActDomain.pltzDomainListの各Main Markを元に、パレタイズのパレタイズステータス、山作り実績No.を更新
     * - SACTを使用し、stgActDomain.pltzDomainListの各荷揃え指示Noを元に、荷揃え指示の山作り実績No.を更新
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @return New staging instr no.
     * @throws ApplicationException If you can not register
     */
    public String transactOnRegister(W4005StgActDomain stgActDomain) throws ApplicationException;

    /**
     * Cancel the Staging Actuality already created
     * <br />作成済みの山作り実績をキャンセルします。
     * <pre>
     * - Use the SACT, remove the Staging Actuality that you lock
     * - Updated the palletize status of palletize that uses SACT, locked. Clear Staging Actuality No.
     *
     * - SACTを使用し、stgActDomain.stgActNoをキーに、山作り実績を削除
     * - SACTを使用し、stgActDomain.pltzDomainListの各mainMarkをキーに、パレタイズのパレタイズステータスを更新。山作り実績No.をクリア
     * </pre>
     *
     * @param stgActDomain Staging Actuality domain
     * @return Staging Actuality update count
     * @throws ApplicationException If you can not update
     */
    public int transactOnRegisterCancel(W4005StgActDomain stgActDomain) throws ApplicationException;
}
