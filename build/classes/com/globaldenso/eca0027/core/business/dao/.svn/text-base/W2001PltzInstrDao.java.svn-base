/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;

/**
 * DAO Interface For The 'Palletize Instruction'
 * <br />梱包指示のDAOインタフェースです。
 * <pre>
 * bean id: w2001PltzInstrDao
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface W2001PltzInstrDao {
    /**
     * This interface gets a records count of 'Palletize Instruction' corresponding to the search criteria.
     * <br />検索条件に該当する梱包指示の件数を取得します。
     * <pre>
     * - To Search Records From 'Palletize Instruction'
     *     For details, refer to {@link #searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain)}.
     * - 梱包指示の検索
     *   詳細は{@link #searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain)}参照
     *   
     * - Return A Records Count
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of a Packaging Instruction (=Pull) is unacquirable<br />梱包指示の件数が取得できない場合
     */
    public int searchCountTtPltzInstr(W2001PltzInstrCriteriaDomain criteria) 
        throws ApplicationException;
 
    /**
     * This method gets all records of 'Palletize Instruction' corresponding to the search criteria.
     * <br />検索条件に該当する梱包指示を取得します。
     * <pre>
     * - To Search Records From 'Palletize Instruction'
     *         Data that satisfies all the following conditions are retrieved.
     *            - Data corresponding to the conditions specified by the screen
     *            - Data contained in the specified page
     *            - Data that has SHIPPER CODE and PLANT CODE searchable with the privileges of logged-in user
     * - 梱包指示の検索
     *     下記の条件をすべて満たすデータを取得する
     *       - 画面から指定された条件に該当する
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当する
     *     
     * - How To Sort Of Search Results
     *     Search results are sorted in the following order:
     *            - TRANSPORT CODE (ascending)
     *            - PLANT CODE (ascending)
     *            - LEGACY W/H CD (ascending)
     *            - PALLETIZE INSTRUCTION STATUS (ascending)
     *            - PALLETIZE INSTRUCTION NO (descending)
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 輸送手段コード (昇順)
     *       - 製造部工場区分 (昇順)
     *       - LEGACY倉庫コード (昇順)
     *       - 梱包指示ステータス (昇順)
     *       - 梱包指示NO (降順)
     *     
     * - How To Return Search Results
     *         Return search results in a form of list {@link W2001PltzInstrDomain}
     * - 検索結果の返却
     *     検索結果を{@link W2001PltzInstrDomain}のリストで返却します。
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of Packaging Instruction (=Pull)s<br />梱包指示のリスト
     * @throws ApplicationException When a Packaging Instruction (=Pull) is unacquirable<br />梱包指示が取得できない場合
     */
    public List<? extends W2001PltzInstrDomain> searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets all records from 'Palletize Instruction Item No Work' (including 'Export Receive Order') corresponding to the search criteria.
     * <br />検索条件に該当する梱包指示品目番号ワーク(輸出受注を含む)を取得します。
     * <pre>
     * - Searching 'Palletize Instruction Item No Work' and 'Export Receive Order'
     *         The following data corresponding to the search condition will obtained.
     *            - 'Palletize Instruction Item No Work' (if exists)
     *            - 'Export Receive Order' (Remaining order quantity of each working day) 
     *     * If the search results include more than the maximum number or no search results, GscmApplicationException will thrown.
     * - 梱包指示品目番号ワーク、輸出受注の検索
     *     検索条件に該当する下記のデータを取得する
     *       - 梱包指示品目番号ワーク (あれば)
     *       - 輸出受注 (稼働日ごとの残注文数量を取得)
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     * - How To Sort Of Search Results
     *         Search results are sorted in the following order:
     *            - ITEM NO (ascending)
     *            - PACKAGE CODE (ascending)
     * - 検索結果のソート
     *     下記の順にソートする
     *       - 品目番号 (昇順)
     *       - 包装区分 (昇順)
     *     
     * - To Return Search Results
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria Search condition<br />検索条件
     * @return The list of {@link W2001PltzInstrItemDomain}<br />{@link W2001PltzInstrItemDomain}のリスト
     * @throws ApplicationException When a Palletize Instruction Item No Work is unacquirable<br />梱包指示品目番号ワークが取得できない場合
     */
    public List<? extends W2001PltzInstrItemDomain> searchTtExpRcvOdr(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets all records corresponding to the search criteria from 'Palletize Instruction' and 'Palletize Instruction Item No'.
     * <br />検索条件に該当する梱包指示、梱包指示品目番号を取得します。
     * <pre>
     * 
     * - To search 'Palletize Instruction' And 'Palletize Instruction Item No'
     *         Data corresponding to the PALLETIZE INSTRUCTION NO specified are acquired.
     * - 梱包指示、梱包指示品目番号の検索
     *     指定された梱包指示NOに該当するデータを取得する
     *     
     * - How To Sort Of Search Results ('Palletize Instruction Item No')
     *         Search results are sorted in the following order:
     *            - ITEM NO (ascending)
     *            - PACKAGE CODE (ascending)
     * - 検索結果(梱包指示品目番号)のソート
     *     下記の順にソートする
     *       - 品目番号 (昇順)
     *       - 包装区分 (昇順)
     *       
     * - To Return Search Results
     * - 検索結果の返却
     * </pre>
     * 
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2001PltzInstrDomain}<br />{@link W2001PltzInstrDomain}のリスト
     * @throws ApplicationException When a Packaging Instruction (=Pull) is unacquirable<br />梱包指示が取得できない場合
     */
    public W2001PltzInstrDomain searchTtPltzInstrItemNo(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method gets all records corresponding to the search criteria from 'Palletize Instruction Item No Work'
     * <br />検索条件に該当する梱包指示品目番号ワークを取得します。
     * <pre>
     * - To Search Records from 'Palletize Instruction Item No Work'
     *         Data corresponding to the DSC-ID specified is acquired.
     * - 梱包指示品目番号ワークの検索
     *     指定されたDSC-IDに該当するデータを取得する
     *     
     * - To Sort Of Search Results
     *         Search results are sorted in the following order:
     *            - ITEM NO (ascending)
     *            - PACKAGE CODE (ascending)
     * - 検索結果のソート
     *     以下の順にソートする
     *       - 品目番号 (昇順)
     *       - 包装区分 (昇順)
     *       
     * - To Return Search Results
     * - 検索結果の返却
     * </pre>
     * 
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2001PltzInstrItemDomain}<br />{@link W2001PltzInstrItemDomain}のリスト
     * @throws ApplicationException When a Palletize Instruction Item No Work is unacquirable<br />梱包指示品目番号ワークが取得できない場合
     */
    public List<? extends W2001PltzInstrItemDomain> searchTwPltzInstrItemNo(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * This method will return the search results corresponding to the search criteria from 'Export Receive Order', after locking those.
     * <br />検索条件に該当する輸出受注をロックし、検索結果を返却します。
     * <pre>
     *  If the search results are already locked, an exception will occur.
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link TtExpRcvOdrDomain}<br />{@link TtExpRcvOdrDomain}のリスト
     * @throws ApplicationException When a lock is unacquirable<br />ロックが取得できない場合
     */
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException;
}
