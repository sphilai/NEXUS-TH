/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;

/**
 * the interface of the ordering registration DAO.
 * <br />受注登録DAOのインタフェースです。
 * <pre>
 * bean id: wB001OdrRcvDao
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WB001OdrRcvDao {
    
    /**
     * Acquire the number of an Export Receive Order.
     * <br />輸出受注の件数を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchCountTtExpRcvOdrByDetailInit is performed for criteria.
     *
     * - Return of the search number
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchCountTtExpRcvOdrByDetailInitを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public int searchCountTtExpRcvOdrByDetailInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire the number of an Export Receive Order.
     * <br />輸出受注の件数を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchCountTtExpRcvOdrByLstDgtChgMainSearch is performed for criteria.
     *
     * - Return of the search number
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchCountTtExpRcvOdrByLstDgtChgMainSearchを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public int searchCountTtExpRcvOdrByLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire the number of an Export Receive Order.
     * <br />輸出受注の件数を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchCountTtExpRcvOdrByMainSearch is performed for criteria.
     *
     * - Return of the search number
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchCountTtExpRcvOdrByMainSearchを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public int searchCountTtExpRcvOdrByMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchForPagingTtExpRcvOdrByDetailInit is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchForPagingTtExpRcvOdrByDetailInitを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByDetailInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchForPagingTtExpRcvOdrByLstDgtChgMainSearch is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchForPagingTtExpRcvOdrByLstDgtChgMainSearchを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchForPagingTtExpRcvOdrByMainSearch is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchForPagingTtExpRcvOdrByMainSearchを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInit is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInitを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByLstDgtChgRegisterInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInitPost is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInitPostを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByLstDgtChgRegisterInitPost(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Acquire an Export Receive Order.
     * <br />輸出受注を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchTtExpRcvOdrByRegister is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchTtExpRcvOdrByRegisterを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByRegisterInit(WB001OdrRcvDomain criteria)
        throws ApplicationException;
    
}
