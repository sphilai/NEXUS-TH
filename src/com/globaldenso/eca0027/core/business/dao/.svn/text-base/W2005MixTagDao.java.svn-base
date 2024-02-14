/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;

/**
 *    This is an interface of Multiple Item No. in 1Box PKG DAO.
 * <br />小箱内多品DAOのインタフェースです。
 * <pre>
 * bean id: w2005MixTagDao
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13648 $
 */
public interface W2005MixTagDao {
    
    /**
     *    It acquires, after locking an Export Receive Order.
     * <br />輸出受注をロック後に取得します。
     * <pre>
     * - Lock of an Export Receive Order
     *       To an argument, sql id:MixTag.LockTtExpRcvOdr is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link TtExpRcvOdrDomain}.
     *
     * - 輸出受注のロック
     *     criteriaを引数に、sql id:MixTag.LockTtExpRcvOdrを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link TtExpRcvOdrDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Export-Receive-Order search-condition domain<br />輸出受注検索条件ドメイン
     * @return Export-Receive-Order domain<br />輸出受注ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The number of the Mix Tag applicable to a search condition and a Mix Tag Item No is acquired.(Those with an authority check)
     * <br />検索条件に該当するMIXED現品票、MIXED品番の件数を取得します。(権限チェックあり)
     * <pre>
     * - Mix Tag, the search number acquisition of a Mix Tag Item No
     *       To an argument, sql id:MixTag.SearchCountTtMixtag is performed for criteria.
     *
     * - Return of the search number
     *
     * - MIXED現品票、MIXED品番の検索件数取得
     *     criteriaを引数に、sql id:MixTag.SearchCountTtMixtagを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a Mix Tag and a Mix Tag Item No cannot be referred to<br />MIXED現品票、MIXED品番が参照できない場合
     */
    public int searchCountTtMixtag(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;

    /**
     *    The Mix Tag and Mix Tag Item No applicable to a search condition are acquired.(Those with an authority check)
     * <br />検索条件に該当するMIXED現品票、MIXED品番を取得します。(権限チェックあり)
     * <pre>
     * A search of - Mix Tag and a Mix Tag Item No
     *       To an argument, sql id:MixTag.searchForPagingTtMixtag is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     *
     * - MIXED現品票、MIXED品番の検索
     *     criteriaを引数に、sql id:MixTag.searchForPagingTtMixtagを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Mix Tag and a Mix Tag Item No cannot be referred to<br />MIXED現品票、MIXED品番が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchForPagingTtMixtag(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A CIGMA Warehouse Cross Reference Master is acquired.(Those with an authority check)
     * <br />倉庫クロスリファレンス原単位を取得します。(権限チェックあり)
     * <pre>
     * Search - CIGMA Warehouse Cross Reference Master.
     *       To an argument, sql id:MixTag.SearchTmCigmaWhXrefByAuth is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     *
     * - 倉庫クロスリファレンス原単位を検索
     *     criteriaを引数に、sql id:MixTag.SearchTmCigmaWhXrefByAuthを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a CIGMA Warehouse Cross Reference Master cannot be referred to<br />倉庫クロスリファレンス原単位が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchTmCigmaWhXrefByAuth(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The Export Receive Order applicable to a search condition is acquired.
     * <br />検索条件に該当する輸出受注を取得します。
     * <pre>
     * - An Export Receive Order is used as the main tables, and is searched.
     *       To an argument, sql id:MixTag.SearchTtExpRcvOdr is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagItemDomain}.
     *
     * - 輸出受注を主なテーブルとして検索
     *     criteriaを引数に、sql id:MixTag.SearchTtExpRcvOdrを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagItemDomain}のリストで返却
     * </pre>
     * 
     * @param criteria MIXED-ITEM-NO search-condition domain<br />MIXED品目番号検索条件ドメイン
     * @return  MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends W2005MixTagItemDomain> searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The Mix Tag and Mix Tag Item No applicable to a search condition are acquired.(Those with an authority check)
     * <br />検索条件に該当するMIXED現品票、MIXED品番を取得します。(権限チェックあり)
     * <pre>
     * A search of - Mix Tag and a Mix Tag Item No
     *       To an argument, sql id:MixTag.SearchTtMixtagItemNo is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     *
     * - MIXED現品票、MIXED品番の検索
     *     criteriaを引数に、sql id:MixTag.SearchTtMixtagItemNoを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Mix Tag and a Mix Tag Item No cannot be referred to<br />MIXED現品票、MIXED品番が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchTtMixtagItemNo(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The Mix Tag and Mix Tag Item No applicable to a search condition are acquired.
     * <br />検索条件に該当するMIXED現品票、MIXED品番を取得します。
     * <pre>
     * A search of - Mix Tag and a Mix Tag Item No
     *       To an argument, sql id:MixTag.SearchTtMixtagItemNoByActualQtyOver is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagItemDomain}.
     *
     * - MIXED現品票、MIXED品番の検索
     *     criteriaを引数に、sql id:MixTag.SearchTtMixtagItemNoByActualQtyOverを実行
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagItemDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When a Mix Tag and a Mix Tag Item No cannot be referred to<br />MIXED現品票、MIXED品番が参照できない場合
     */
    public List<? extends W2005MixTagItemDomain> searchTtMixtagItemNoByActualQtyOver(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The Packaging Instruction (=Pull) and Palletize Instruction Item No applicable to a search condition are acquired.(Those with an authority check)
     * <br />検索条件に該当する梱包指示、梱包指示品目番号を取得します。(権限チェックあり)
     * <pre>
     * - A Packaging Instruction (=Pull) and a Palletize Instruction Item No are used as the main tables, and are searched.
     *       To an argument, sql id:MixTag.SearchTtPltzInstr is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagItemDomain}.
     *
     * - 梱包指示、梱包指示品目番号を主なテーブルとして検索
     *     criteriaを引数に、sql id:MixTag.SearchTtPltzInstrを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagItemDomain}のリストで返却
     * </pre>
     * 
     * @param criteria MIXED-ITEM-NO search-condition domain<br />MIXED品目番号検索条件ドメイン
     * @return MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) and a Palletize Instruction Item No cannot be referred to<br />梱包指示、梱包指示品目番号が参照できない場合
     */
    public List<? extends W2005MixTagItemDomain> searchTtPltzInstr(W2005MixTagItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    The Packaging Instruction (=Pull) and CIGMA Warehouse Cross Reference Master applicable to a search condition are acquired.(Those with an authority check)
     * <br />検索条件に該当する梱包指示、倉庫クロスリファレンス原単位を取得します。(権限チェックあり)
     * <pre>
     * - A Packaging Instruction (=Pull) and a CIGMA Warehouse Cross Reference Master are searched.
     *       To an argument, sql id:MixTag.searchTtPltzInstrOnHeaderMoveToCreate is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     *
     * - 梱包指示、倉庫クロスリファレンス原単位を検索
     *     criteriaを引数に、sql id:MixTag.searchTtPltzInstrOnHeaderMoveToCreateを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) and a CIGMA Warehouse Cross Reference Master cannot be referred to<br />梱包指示、倉庫クロスリファレンス原単位が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchTtPltzInstrOnHeaderMoveToCreate(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A Mix Tag RT Work is acquired.
     * <br />MIXED用RT材ワークを取得します。
     * <pre>
     * Search - Mix Tag RT Work.
     *       To an argument, sql id:MixTag.SearchTwMixtagRt is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagRtDomain}.
     *
     * - MIXED用RT材ワークを検索
     *     criteriaを引数に、sql id:MixTag.SearchTwMixtagRtを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagRtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag-RT search-condition domain<br />MIXED用RT材検索条件ドメイン
     * @return Mix-Tag-RT domain<br />MIXED用RT材ドメイン
     * @throws ApplicationException When a Mix Tag RT Work cannot be referred to<br />MIXED用RT材ワークが参照できない場合
     */
    public List<? extends W2005MixTagRtDomain> searchTwMixtagRt(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     *    A Package Material Master is acquired.
     * <br />包装材原単位を取得します。
     * <pre>
     * Search - Package Material Master.
     *       To an argument, sql id:MixTag.SearchPkgMaterials is performed for criteria.
     *
     * - Return of search results
     *       Search results are returned by the {@link TmPkgMtrlDomain}.
     *
     * - 倉庫クロスリファレンス原単位を検索
     *     criteriaを引数に、sql id:MixTag.SearchPkgMaterialsを実行
     *
     * - 検索結果の返却
     *     検索結果を{@link TmPkgMtrlDomain}で返却
     * </pre>
     * 
     * @param criteria search-condition domain<br />M検索条件ドメイン
     * @return domain<br />ドメイン
     * @throws ApplicationException When a Package Material Master cannot be referred to<br />包装材原単位が参照できない場合
     */
    public TmPkgMtrlDomain searchPkgMaterials(TmPkgMtrlCriteriaDomain criteria)
        throws ApplicationException;
    
}
