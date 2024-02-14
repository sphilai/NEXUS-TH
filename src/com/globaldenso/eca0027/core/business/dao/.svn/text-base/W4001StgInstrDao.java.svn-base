/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;

/**
 * Interface of the DAO to access the Staging Instruction
 * <br />荷揃え指示へアクセスするDAOのインターフェースです。
 * <pre>
 * bean id:w4001StgInstrDao
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4673 $
 */
public interface W4001StgInstrDao {

    /**
     * Get the number of search Staging Instruction to the Main screen for
     * <br />Main画面用に荷揃え指示の検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of Staging Instruction
     *     Run the SQL that retrieves the Staging Instruction contained more than one part number with a reference authority, to return the number
     *         With the name of the stgInstrCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchCountForPagingOnMainSearch 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示の検索件数取得
     *     参照権限のある品番が1つ以上含まれている荷揃え指示を検索し、その件数を返却するSQLを実行
     *         stgInstrCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchCountForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public int searchCountForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for Staging Instruction to the Main screen for
     * <br />Main画面用に荷揃え指示の検索を行います。
     *
     * <pre>
     * - Search Staging Instruction 
     *     Run the SQL that retrieves the Staging Instruction contained more than one part number with a reference authority, to return the results of one page 
     *         With the name of the stgInstrCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchForPagingOnMainSearch 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示の検索
     *     参照権限のある品番が1つ以上含まれている荷揃え指示を検索し、1ページ分の結果を返却するSQLを実行
     *         stgInstrCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public List<? extends W4001StgInstrDomain> searchForPagingOnMainSearch(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that Staging Instruction preparing candidates for the Create screen
     * <br />Create画面用に荷揃え指示作成候補とするパレタイズの検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of palletize that Staging Instruction preparing candidates 
     *     Run the SQL to search for a part number only in palletize with update privileges, and returns the number 
     *         With the name of the pltzCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchCountForPagingOnCreateSearch 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示作成候補とするパレタイズの検索件数取得
     *     更新権限のある品番のみで構成されるパレタイズを検索し、その件数を返却するSQLを実行
     *         pltzCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchCountForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Instruction or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that Staging Instruction preparing candidates for the Create screen
     * <br />Create画面用に荷揃え指示作成候補とするパレタイズを検索します。
     *
     * <pre>
     * - Search of palletize that Staging Instruction preparing candidates 
     *     Run the SQL to search for a part number only in palletize with the update authority, to return the results of one page 
     *         With the name of the pltzCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchForPagingOnCreateSearch 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示作成候補とするパレタイズの検索
     *     更新権限のある品番のみで構成されるパレタイズを検索し、1ページ分の結果を返却するSQLを実行
     *         pltzCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param pltzCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction or staging actuality
     */
    public List<? extends W4001PltzDomain> searchForPagingOnCreateSearch(W4001PltzCriteriaDomain pltzCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of palletize that is included in the Staging Instruction (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に荷揃え指示に含まれるパレタイズの検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of palletize that is included in the Staging Instruction 
     *     With the name of the stgInstrCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchCountOnRegisterInitByFromMain 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示に含まれるパレタイズの検索件数取得
     *     stgInstrCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchCountOnRegisterInitByFromMainを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Serch result count
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public int searchCountOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the palletize that is included in the Staging Instruction (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に荷揃え指示に含まれるパレタイズを検索します。
     *
     * <pre>
     * - Search for palletize that is included in the Staging Instruction 
     *     Run the SQL to return by adding a column of authority as the data mask for the search results 
     *         With the name of the stgInstrCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchOnRegisterInitByFromMain 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示に含まれるパレタイズを検索
     *     検索結果にデータマスク用として権限の列を付加して返却するSQLを実行
     *         stgInstrCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchOnRegisterInitByFromMainを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromMain(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to search for palletize that is included in the Staging Instruction Register screen
     * <br />Register画面(Create画面からの遷移)用に、荷揃え指示に含まれるパレタイズを検索します。
     *
     * <pre>
     * - Search of palletize that is included in the Staging Instruction 
     *     With the name of the stgInstrCriteriaDomain, Run SQL-ID:W4001StgInstr.SearchOnRegisterInitByFromCreate 
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示に含まれるパレタイズの検索
     *     stgInstrCriteriaDomainを引数にして、SQL-ID:W4001StgInstr.SearchOnRegisterInitByFromCreateを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgInstrCriteriaDomain Search criteria domain
     * @return Search result
     * @throws ApplicationException Can not see is Staging Instruction
     */
    public List<? extends W4001PltzDomain> searchOnRegisterInitByFromCreate(W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException;

    /**
     * Get a summary of the Ship To contained in the Staging Instruction Work
     * <br />荷揃え指示ワークに含まれるShip Toのサマリを取得します。
     * <pre>
     * - Search Staging Instruction Work
     *     With the name of the loginUserDscId, Run SQL-ID:W4001StgInstr.SearchTwStgInstrByShipToSummary
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示ワークの検索
     *     loginUserDscIdを引数にして、SQL-ID:W4001StgInstr.SearchTwStgInstrByShipToSummaryを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return ship to summary
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public List<String> searchTwStgInstrByShipToSummary(String loginUserDscId)
        throws ApplicationException;

    /**
     * From palletize associated with their staging instruction work, I get a summary of the weight of the weight per unit
     * <br />荷揃え指示ワークにに紐付くパレタイズから、重量単位ごとの重量のサマリを取得します。
     * <pre>
     * - Weight acquisition of weight per unit
     *     With the name of the loginUserDscId, Run SQL-ID:W4001StgInstr.SearchOnRegisterInitByWeightSummary
     * - The return the result of executing the SQL
     *
     * - 重量単位ごとの重量取得
     *     loginUserDscIdを引数にして、SQL-ID:W4001StgInstr.SearchOnRegisterInitByWeightSummaryを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Weight summary by unit
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public List<? extends W4001PltzDomain> searchOnRegisterInitByWeightSummary(String loginUserDscId)
        throws ApplicationException;

    /**
     * From palletize associated with their staging instruction work, I get a summary of the volume of the volume per unit
     * <br />荷揃え指示ワークにに紐付くパレタイズから、容積単位ごとの容積のサマリを取得します。
     * <pre>
     * - Weight acquisition of volume per unit
     *     With the name of the loginUserDscId, Run SQL-ID:W4001StgInstr.SearchOnRegisterInitByVolumeSummary
     * - The return the result of executing the SQL
     *
     * - 容積単位ごとの容積取得
     *     loginUserDscIdを引数にして、SQL-ID:W4001StgInstr.SearchOnRegisterInitByVolumeSummaryを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Volume summary by unit
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public List<? extends W4001PltzDomain> searchOnRegisterInitByVolumeSummary(String loginUserDscId)
        throws ApplicationException;

    /**
     * For registering Staging Instruction to lock the selection Palletize
     * <br />荷揃え指示を登録するため、選択パレタイズをロックします。
     * <pre>
     * - Lock of Palletize
     *     With the name of the mainMarkList, SQL-ID:W4001StgInstr.LockTtPltzByMainMarkListNoWait
     * - The return the result of executing the SQL
     *
     * - パレタイズのロック
     *     mainMarkListを引数にして、SQL-ID:W4001StgInstr.LockTtPltzByMainMarkListNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param mainMarkList Selected main mark list
     * @return Record of palletizing that locked
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public List<? extends W4001PltzDomain> lockTtPltzByMainMarkListNoWait(List<String> mainMarkList)
        throws ApplicationException;

    /**
     * To check for the export request unit, Search Palletize
     * <br />輸出依頼単位のチェック用に、パレタイズを検索します。
     * <pre>
     * - Search Palletize
     * With the name of the loginUserDscId, Run SQL-ID:W4001StgInstr.SearchTtPltzByExpReq
     * - The return the result of executing the SQL
     *
     * - パレタイズの検索
     *     loginUserDscIdを引数にして、SQL-ID:W4001StgInstr.SearchTtPltzByExpReqを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param loginUserDscId Login user DSC-ID
     * @return Palletize search result
     * @throws ApplicationException If you can not search for Staging Instruction Work
     */
    public List<? extends W4001PltzDomain> searchTtPltzByExpReq(String loginUserDscId)
        throws ApplicationException;
}
