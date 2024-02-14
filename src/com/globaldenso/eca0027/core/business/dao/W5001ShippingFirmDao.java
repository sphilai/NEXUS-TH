/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;

/**
 * Interface of the DAO to access the shipping confirmation
 * <br />出荷確認へアクセスするDAOのインターフェースです。
 * <pre>
 * bean id:w5001ShippingFirmDao
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9221 $
 */
public interface W5001ShippingFirmDao {

    /**
     * Get the number of searches of shipping confirmation
     * <br />出荷確認の検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of shipping confirmation
     * Run the SQL that retrieves the shipping confirmation that contains more than one part number with a reference authority, to return the number
     * With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchCountForPagingOnMainSearch
     * - The return the result of executing the SQL
     *
     * - 出荷確認の検索件数取得
     *     参照権限のある品番が1つ以上含まれている出荷確認を検索し、その件数を返却するSQLを実行
     *         shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchCountForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result count
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public int searchCountForPagingOnMainSearch(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Perform a search for shipping confirmation
     * <br />出荷確認の検索を行います。
     *
     * <pre>
     * - Search shipping confirmation
     *     Run the SQL that retrieves the shipping confirmation that contains more than one part number with a reference authority, to return the results of one page 
     *         With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchCountForPagingOnMainSearch 
     * - The return the result of executing the SQL
     *
     * - 出荷確認の検索
     *     参照権限のある品番が1つ以上含まれている出荷確認を検索し、1ページ分の結果を返却するSQLを実行
     *         shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchCountForPagingOnMainSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public List<? extends W5001ShippingFirmDomain> searchForPagingOnMainSearch(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Get the number of searches of shipping instruction and shipping actuality
     * <br />荷揃え指示、山作り実績の検索件数を取得します。
     *
     * <pre>
     * - Search number acquisition of shipping confirmation
     *     Run the SQL that a Staging Instruction in the part number only with update authority, search the Staging Actuality, to return the number
     *         With the name of the stgCriteriaDomain, SQL-ID: Run W5001ShippingFirm.searchCountForPagingOnCreateSearch
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示、山作り実績の検索件数取得
     *     更新権限のある品番のみで構成される荷揃え指示、山作り実績を検索し、その件数を返却するSQLを実行
     *         stgCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.searchCountForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgCriteriaDomain search criteria domain
     * @return search result count
     * @throws ApplicationException Can not see is staging instruction or staging actuality
     */
    public int searchCountForPagingOnCreateSearch(W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException;

    /**
     * Search for shipping instruction and shipping actuality
     * <br />荷揃え指示、山作り実績を検索します。
     *
     * <pre>
     * - Search shipping confirmation
     *     Run the SQL that a Staging Instruction in the part number only with update authority, search the Staging Actuality, returning the result of one page
     *          With the name of the stgCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchForPagingOnCreateSearch
     * - The return the result of executing the SQL
     *
     * - 出荷確認の検索
     *     更新権限のある品番のみで構成される荷揃え指示、山作り実績を検索し、1ページ分の結果を返却するSQLを実行
     *         stgCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchForPagingOnCreateSearchを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param stgCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is staging instruction or staging actuality
     */
    public List<? extends W5001StgDomain> searchForPagingOnCreateSearch(W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException;

    /**
     * Search the X-Tag/CML that is included in the shipping confirmation for (transition from the Main screen) Register screen
     * <br />Register画面(Main画面からの遷移)用に出荷確認に含まれるX-Tag/CMLを検索します。
     *
     * <pre>
     * - Search X-Tag/CML contained in the shipping confirmation
     *     With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchOnRegisterInitByFromMain
     * - The return the result of executing the SQL
     *
     * - 出荷確認に含まれるX-Tag/CMLを検索
     *     shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchOnRegisterInitByFromMainを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromMain(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to search for CML that is included in the Staging Instruction Register screen
     * <br />Register画面(Create画面からの遷移)用に、荷揃え指示に含まれるCMLを検索します。
     *
     * <pre>
     * - Search of CML that is included in the Staging Instruction
     *     Run the SQL to return by adding a column of authority as the data mask for the search results
     *         With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgInstr
     * - The return the result of executing the SQL
     *
     * - 荷揃え指示に含まれるCMLの検索
     *     検索結果にデータマスク用として権限の列を付加して返却するSQLを実行
     *         shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgInstrを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not see is shipping confirmation
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgInstr(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * For the (transition from the Create screen), to find the X-Tag/CML included in the Staging Actuality Register screen
     * <br />Register画面(Create画面からの遷移)用に、山作り実績に含まれるX-Tag/CMLを検索します。
     *
     * <pre>
     * - Search X-Tag/CML contained in the Staging Actuality
     *     Run the SQL to return by adding a column of authority as the data mask for the search results
     *         With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgAct
     * - The return the result of executing the SQL
     *
     * - 山作り実績に含まれるX-Tag/CMLの検索
     *     検索結果にデータマスク用として権限の列を付加して返却するSQLを実行
     *         shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgActを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @return search result
     * @throws ApplicationException Can not search stg act 
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgAct(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Lock the palletizing based on the information of X-Tag/CML
     * <br />X-Tag/CMLの情報を元にパレタイズをロックします。
     *
     * <pre>
     * - Run SQL to lock palletizing based on the information of CML and X-Tag of shippingFirmDomain.cmlDomainList
     *     With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.LockTtPltzByXmainMarkOrMainMarkNoWait
     * - The return the result of executing the SQL
     *
     * - shippingFirmDomain.cmlDomainListのX-TagとCMLの情報を元にパレタイズをロックするSQLを実行
     *     shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.LockTtPltzByXmainMarkOrMainMarkNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain shipping confirmation criteria domain
     * @return List of palletize that locked
     * @throws ApplicationException Can not lock pltz 
     */
    public List<? extends W5001CmlDomain> lockTtPltzByXmainMarkOrMainMarkNoWait(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Lock the invoice and palletizie associated with their Shipping Confirmation
     * <br />出荷確認に紐付くパレタイズおよびインボイスをロックします。
     *
     * <pre>
     * - Run SQL to lock the invoice and palletizie based on Shipping Confirmation No.
     *     With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.LockTtPltzTtInvoiceByShippingFirmNoNoWait
     * - The return the result of executing the SQL
     *
     * - 出荷確認No.を元にパレタイズおよびインボイスをロックするSQLを実行
     *     shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.LockTtPltzTtInvoiceByShippingFirmNoNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain shipping confirmation criteria domain
     * @return List of palletize that locked
     * @throws ApplicationException exception
     */
    public List<? extends W5001CmlDomain> lockTtPltzTtInvoiceByShippingFirmNoNoWait(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;

    /**
     * Lock the palletize associated with their Shipping Confirmation
     * <br />出荷確認に紐付くパレタイズをロックします。
     *
     * <pre>
     * - Run SQL to lock the palletizie based on Shipping Confirmation No.
     *     With the name of the shippingFirmCriteriaDomain, SQL-ID: Run W5001ShippingFirm.LockTtPltzByShippingFirmNoNoWait
     * - The return the result of executing the SQL
     *
     * - 出荷確認No.を元にパレタイズをロックするSQLを実行
     *     shippingFirmCriteriaDomainを引数にして、SQL-ID:W5001ShippingFirm.LockTtPltzByShippingFirmNoNoWaitを実行
     * - SQLの実行結果を返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain shipping confirmation criteria domain
     * @return List of palletize that locked
     * @throws ApplicationException exception
     */
    public List<? extends W5001CmlDomain> lockTtPltzByShippingFirmNoNoWait(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException;;
}
