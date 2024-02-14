/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.MigCmlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain;

/**
 * This is a DAO interface of Migration CML.
 * <br />Migration CMLのDAOインタフェースです。
 *
 * <pre>
 * bean id:migCmlDao
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11751 $
 */
public interface MigCmlDao {

    /**
     * Case mark No. list extraction
     * <br />ケースマークNo.一覧取り出し
     *
     * <pre>
     * - acquired data
     *     CML-Header-Interface distinct
     * 
     * - 取得データ
     *   ケースマークヘッダ連携 distinct
     * </pre>
     * 
     * @return Search results<br />検索結果
     * @throws ApplicationException When search results are unacquirable<br />検索結果が取得できない場合
     */
    List<? extends MigCmlDomain> searchByKeyMigCmlForHeadDistinct()
        throws ApplicationException;


    /**
     * CML-Header-Interface +NEXUS Ship-to cross reference master
     *     +NEXUS Consignee cross reference master + W/H cross reference master list extraction
     * <br />ケースマークヘッダ連携＋NEXUS送荷先クロスリファレンスマスタ
     *   ＋NEXUS荷受人クロスリファレンスマスタ＋倉庫クロスリファレンスマスタ一覧取り出し
     *
     * <pre>
     * - acquired data
     *     CML Header Interface
     *     +NEXUS Ship-to cross reference master
     *     +NEXUS Consignee cross reference master
     *     + W/H cross reference master
     * 
     * - 取得データ
     *   ケースマークヘッダ連携
     *   ＋NEXUS送荷先クロスリファレンスマスタ
     *   ＋NEXUS荷受人クロスリファレンスマスタ
     *   ＋倉庫クロスリファレンスマスタ
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When search results are unacquirable<br />検索結果が取得できない場合
     */
    MigCmlDomain searchByCondtionMigCmlForCmlHead(MigCmlCriteriaDomain criteria) 
        throws ApplicationException;


    /**
     * CML Detail Interface
     *     + Export-Shipping-Item-No master
     *     + Export-Formality-Item-No master
     *     + measurement unit master list extraction
     * <br />ケースマーク明細連携
     *   ＋輸出出荷品番マスタ
     *   ＋輸出手続品番マスタ
     *   ＋計量単位マスタ一覧取り出し
     *
     * <pre>
     * - acquired data
     *     CML Detail Interface
     *     + Export-Shipping-Item-No master
     *     + Export-Formality-Item-No master
     *     + measurement unit master
     *
     *     The APLY_STRT_DT -> latest in * today (after TZ converted) or before Logic
     *       "": One space   -> Logic
     * 
     * - 取得データ
     *   ケースマーク明細連携
     *   ＋輸出出荷品番マスタ
     *   ＋輸出手続品番マスタ
     *   ＋計量単位マスタ
     *   
     *   ＊本日(TZ変換後)以前で直近のAPLY_STRT_DT　→　ロジック
     *   　　" ":スペース1個　→　ロジック
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When search results are unacquirable<br />検索結果が取得できない場合
     */
    List<? extends MigCmlDomain> searchByCondtionMigCmlForCmlDtil(MigCmlCriteriaDomain criteria) 
        throws ApplicationException;
    
    
    /**
     * Output destination change printer information search
     * <br />出力先プリンタ情報検索
     * 
     * <pre>
     * - Search of output destination change printer information
     * 
     * - 出力先プリンタ情報の検索
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When search results are unacquirable<br />検索結果が取得できない場合
     */
    // ST958 MOD result:MigCmlDomain -> List<String>
    List<String> searchByKeyMigCmlForPrinterInfo(MigCmlCriteriaDomain criteria) 
        throws ApplicationException;
    
    
    /**
     * CML-Detail-Interface + Palletize-Item information retrieval
     * <br />ケースマーク明細連携＋パレタイズ対象品情報検索
     *
     * <pre>
     * - acquired data
     *     CML-Detail-Interface + Palletize Item
     * 
     * - 取得データ
     *   ケースマーク明細連携＋パレタイズ対象品
     * </pre>
     * 
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When search results are unacquirable<br />検索結果が取得できない場合
     */
    List<? extends MigCmlDomain> searchByConditionMigCmlForCmlDtl(MigCmlCriteriaDomain criteria) 
        throws ApplicationException;


 
}
