/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;

/**
 * Interface of the DAO to access the Staging Actuality
 * <br />山作り実績へアクセスするDAOのインターフェースです。
 * <pre>
 * bean id:w4005StgActDao
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5687 $
 */
public interface W4005StgActDao {

    /**
     * Get the number of search Staging Actuality to the Main screen for
     * <br />Main画面用に山作り実績の検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of Staging Actuality
     *     Run the SQL that retrieves the Staging Actuality contained more than one part number with a reference authority, to return the number
     *         With the name of the stgActCriteriaDomain, Run SQL-ID:W4005StgAct.SearchCountForPagingOnMainSearch 
     * - The return the result of executing the SQL
     *
     * - 山作り実績の検索件数取得
     *     参照権限のある品番が1つ以上含まれている山作り実績を検索し、その件数を返却するSQLを実行
     *         stgActCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchCountForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public int searchCountForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for Staging Actuality to the Main screen for
     * <br />Main画面用に山作り実績の検索を行います。
     *
     * <pre>
     * - Search Staging Actuality 
     *     Run the SQL that retrieves the Staging Actuality contained more than one part number with a reference authority, to return the results of one page 
     *         With the name of the stgActCriteriaDomain, Run SQL-ID:W4005StgAct.SearchForPagingOnMainSearch 
     * - The return the result of executing the SQL
     *
     * - 山作り実績の検索
     *     参照権限のある品番が1つ以上含まれている山作り実績を検索し、1ページ分の結果を返却するSQLを実行
     *         stgActCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public List<? extends W4005StgActDomain> searchForPagingOnMainSearch(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that Staging Actuality preparing candidates for the Create screen
     * <br />Create画面用に山作り実績作成候補とするパレタイズの検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of palletize that Staging Actuality preparing candidates 
     *     Run the SQL to search for a part number only in palletize with update privileges, and returns the number 
     *         With the name of the pltzCriteriaDomain, Run SQL-ID:W4005StgAct.SearchCountForPagingOnCreateSearch 
     * - The return the result of executing the SQL
     *
     * - 山作り実績作成候補とするパレタイズの検索件数取得
     *     更新権限のある品番のみで構成されるパレタイズを検索し、その件数を返却するSQLを実行
     *         pltzCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchCountForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Actuality or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that Staging Actuality preparing candidates for the Create screen
     * <br />Create画面用に山作り実績作成候補とするパレタイズを検索します。
     *
     * <pre>
     * - Search of palletize that Staging Actuality preparing candidates 
     *     Run the SQL to search for a part number only in palletize with the update authority, to return the results of one page 
     *         With the name of the pltzCriteriaDomain, Run SQL-ID:W4005StgAct.SearchForPagingOnCreateSearch 
     * - The return the result of executing the SQL
     *
     * - 山作り実績作成候補とするパレタイズの検索
     *     更新権限のある品番のみで構成されるパレタイズを検索し、1ページ分の結果を返却するSQLを実行
     *         pltzCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality or staging actuality
     */
    public List<? extends W4005PltzDomain> searchForPagingOnCreateSearch(W4005PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that is included in the Staging Actuality (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に山作り実績に含まれるパレタイズの検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of palletize that is included in the Staging Actuality 
     *     With the name of the stgActCriteriaDomain, Run SQL-ID:W4005StgAct.SearchCountOnRegisterInitByFromMain 
     * - The return the result of executing the SQL
     *
     * - 山作り実績に含まれるパレタイズの検索件数取得
     *     stgActCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchCountOnRegisterInitByFromMainを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public int searchCountOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that is included in the Staging Actuality (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に山作り実績に含まれるパレタイズを検索します。
     *
     * <pre>
     * - Search for palletize that is included in the Staging Actuality 
     *     Run the SQL to return by adding a column of authority as the data mask for the search results 
     *         With the name of the stgActCriteriaDomain, Run SQL-ID:W4005StgAct.SearchOnRegisterInitByFromMain 
     * - The return the result of executing the SQL
     *
     * - 山作り実績に含まれるパレタイズを検索
     *     検索結果にデータマスク用として権限の列を付加して返却するSQLを実行
     *         stgActCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchOnRegisterInitByFromMainを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public W4005StgActDomain searchOnRegisterInitByFromMain(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to search for palletize that is included in the Staging Actuality Register screen
     * <br />Register画面(Create画面からの遷移)用に、山作り実績に含まれるパレタイズを検索します。
     *
     * <pre>
     * - Search of palletize that is included in the Staging Actuality 
     *     With the name of the stgActCriteriaDomain, Run SQL-ID:W4005StgAct.SearchOnRegisterInitByFromCreate 
     * - The return the result of executing the SQL
     *
     * - 山作り実績に含まれるパレタイズの検索
     *     stgActCriteriaDomainを引数にして、SQL-ID:W4005StgAct.SearchOnRegisterInitByFromCreateを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Actuality
     */
    public List<? extends W4005PltzDomain> searchOnRegisterInitByFromCreate(W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException;

    /**
     * From palletize associated with their staging actuality work, I get a summary of the weight of the weight per unit
     * <br />山作り実績ワークにに紐付くパレタイズから、重量単位ごとの重量のサマリを取得します。
     * <pre>
     * - Weight acquisition of weight per unit
     *     With the name of the loginUserDscId, Run SQL-ID:W4005StgAct.SearchOnRegisterInitByWeightSummary
     * - The return the result of executing the SQL
     *
     * - 重量単位ごとの重量取得
     *     loginUserDscIdを引数にして、SQL-ID:W4005StgAct.SearchOnRegisterInitByWeightSummaryを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Weight summary by unit
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<? extends W4005PltzDomain> searchOnRegisterInitByWeightSummary(String loginUserDscId)
        throws ApplicationException;

    /**
     * From palletize associated with their staging actuality work, I get a summary of the volume of the volume per unit
     * <br />山作り実績ワークにに紐付くパレタイズから、容積単位ごとの容積のサマリを取得します。
     * <pre>
     * - Weight acquisition of volume per unit
     *     With the name of the loginUserDscId, Run SQL-ID:W4005StgAct.SearchOnRegisterInitByVolumeSummary
     * - The return the result of executing the SQL
     *
     * - 容積単位ごとの容積取得
     *     loginUserDscIdを引数にして、SQL-ID:W4005StgAct.SearchOnRegisterInitByVolumeSummaryを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Volume summary by unit
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<? extends W4005PltzDomain> searchOnRegisterInitByVolumeSummary(String loginUserDscId)
        throws ApplicationException;

    /**
     * For registering Staging Actuality to lock the selection Palletize
     * <br />山作り実績を登録するため、選択パレタイズをロックします。
     * <pre>
     * - Lock of Palletize
     *     With the name of the pltzDomainList, SQL-ID:W4005StgAct.LockTtPltzByMainMarkListNoWait
     * - The return the result of executing the SQL
     *
     * - パレタイズのロック
     *     maipltzDomainListnMarkListを引数にして、SQL-ID:W4005StgAct.LockTtPltzByMainMarkListNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param pltzDomainList Selected main mark or X-main mark list
     * @return Record of palletizing that locked
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<? extends W4005PltzDomain> lockTtPltzByMainMarkListNoWait(List<? extends W4005PltzDomain> pltzDomainList)
        throws ApplicationException;

    /**
     * To check for the staging instruction unit, Search Palletize
     * <br />荷揃え指示単位のチェック用に、パレタイズを検索します。
     * <pre>
     * - Search Palletize
     * With the name of the loginUserDscId, Run SQL-ID:W4005StgAct.SearchTtPltzByStgInstr
     * - The return the result of executing the SQL
     *
     * - パレタイズの検索
     *     loginUserDscIdを引数にして、SQL-ID:W4005StgAct.SearchTtPltzByStgInstrを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Main mark of unselected in a same staging instruction
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<String> searchTtPltzByStgInstr(String loginUserDscId) throws ApplicationException;

    /**
     * For registering Staging Actuality to lock the staging instruction
     * <br />山作り実績を登録するため、荷揃え指示をロックします。
     * <pre>
     * - Lock of Palletize
     *     With the name of the stgInstrNoList, SQL-ID:W4005StgAct.LockTtStgInstrByStgInstrNoListNoWait
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示のロック
     *     stgInstrNoListを引数にして、SQL-ID:W4005StgAct.LockTtStgInstrByStgInstrNoListNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrNoList Staging instruction no list
     * @return List of staging instruction no that locked
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<String> lockTtStgInstrByStgInstrNoListNoWait(List<String> stgInstrNoList) throws ApplicationException;

    /**
     * For danger item with or without judgment, search for palletize
     * <br />危険品有無判断のために、パレタイズを検索します。
     * <pre>
     * - Search Palletize
     * With the name of the loginUserDscId, Run SQL-ID:W4005StgAct.SearchTtPltzByDngrItem
     * - The return the result of executing the SQL
     *
     * - パレタイズの検索
     *     loginUserDscIdを引数にして、SQL-ID:W4005StgAct.SearchTtPltzByDngrItemを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return If "Y" of dangerous goods there. "N" If not,
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public String searchTtPltzByDngrItem(String loginUserDscId) throws ApplicationException;

    /**
     * Lock palletize of staging actuality after registration.
     * <br />山作り実績登録後のパレタイズをロックします。
     * <pre>
     * - Lock of Palletize
     *     With the name of the pltzDomainList, SQL-ID:W4005StgAct.LockTtPltzByStgActNoNoWait
     * - The return the result of executing the SQL
     *
     * - パレタイズのロック
     *     stgActNoを引数にして、SQL-ID:W4005StgAct.LockTtPltzByStgActNoNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActNo Staging actuality No.
     * @return Record of palletizing that locked
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<? extends W4005PltzDomain> lockTtPltzByStgActNoNoWait(String stgActNo)
        throws ApplicationException;

    /**
     * Lock staging instruction of staging actuality after registration.
     * <br />山作り実績登録後の荷揃え指示をロックします。
     * <pre>
     * - Lock of Palletize
     *     With the name of the stgInstrNoList, SQL-ID:W4005StgAct.LockTtStgInstrByStgActNoNoWait
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示のロック
     *     stgActNoを引数にして、SQL-ID:W4005StgAct.LockTtStgInstrByStgActNoNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgActNo Staging actuality No.
     * @return List of staging instruction no that locked
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public List<String> lockTtStgInstrByStgActNoNoWait(String stgActNo) throws ApplicationException;

    /**
     * In order to cancel the staging actuality, it updates the palletize
     * <br />山作り実績をキャンセルするために、パレタイズを更新します。
     * <pre>
     * - Update Palletize
     *     With the name of the w4005PltzDomain, SQL-ID:W4005StgAct.UpdateTtPltzOnRegisterCancel
     * - The return the result of executing the SQL
     *
     * - パレタイズの更新
     *     w4005PltzDomainを引数にして、SQL-ID:W4005StgAct.UpdateTtPltzOnRegisterCancelを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param w4005PltzDomain Update data domain
     * @return Update count
     * @throws ApplicationException If you can not search for Staging Actuality Work
     */
    public int updateTtPltzOnRegisterCancel(W4005PltzDomain w4005PltzDomain) throws ApplicationException;
}
