/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;

/**
 * The search service implementation class of 
 * CIGMA Ship to X-Reference MA Inquiry Screen.
 * <br />CIGMA Ship to X-Reference MA Inquiry画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface W9009CgmShipToXRefMaService {

    /**
     * The data of a table is searched based on arbitrary conditions, 
     * and the search-results number is returned. 
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9009CgmShipToXRefMaCriteriaDomain criteriaDomain)
        throws ApplicationException;

    /**
     * <<Paging processing>>The data of a table is searched based on arbitrary conditions, 
     * and search results are returned by list form. 
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return W9009CgmShipToXRefMaのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9009CgmShipToXRefMaDomain> searchByConditionForPaging 
    (W9009CgmShipToXRefMaCriteriaDomain criteriaDomain)
        throws ApplicationException;

    /**
     * <pre>
     * - Get the user authorization list.
     *     Set an Self-screen approval function ID to argument , 
     *     call {@link UserAuthService#getUserAuthList(String)}
     * 
     * - ユーザ権限リストを取得します。
     *   自画面認可機能IDを引数に{@link UserAuthService#getUserAuthList(String)}を呼び出します。
     * </pre>
     *
     * @param compCd 会社コード
     * @throws ApplicationException 権限リスト取得失敗の場合
     */
    public void validateConsistencyCompAuth(String compCd) 
        throws ApplicationException;

    /**
     * Physical deletion of the data is carried out on condition of a primary key. 
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return Delete number 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteOnInquiryDelete(W9009CgmShipToXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on arbitrary conditions, 
     * and search results are returned by list form. 
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return W9009CgmShipToXRefMaのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9009CgmShipToXRefMaDomain> 
    searchByCondition(W9009CgmShipToXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on the corporate code of conditions, 
     * and search results are returned. 
     * 条件の会社コードを元にテーブルのデータを検索し、検索結果を返却します。
     * 
     * @param lgcyLibCompCd W9009CgmShipToXRefMaの CriteriaDomain クラス
     * @return true/false
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public boolean validateDatabaseCompCd(String lgcyLibCompCd) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on the corporate code of conditions, 
     * and search results are returned. 
     * 条件の会社コードを元にテーブルのデータを検索し、検索結果を返却します。
     * 
     * @param compCd W9009CgmShipToXRefMaの CriteriaDomain クラス
     * @return true/false
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public boolean validateDatabaseConsignee(String compCd) 
        throws ApplicationException;

    /**
     * The use propriety of CIGMA is checked.
     * CIGMAの利用可否をチェックします。
     *
     * <pre>
     * Shipperが夜間バッチ中かをチェックします。
     * 詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * </pre>
     * 
     * @param isShipping24hFunc 24H出荷対応機能フラグ
     * @param compCd 会社コード
     * @return CIGMAが利用可能であればtrue、そうでなければfalse
     * @throws ApplicationException CIGMAの利用可否を判定できない場合
     */
    boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException;

    /**
     * Registration/update process about a NEXUS ship to cross reference standard physical unit. 
     * NEXUS送荷先クロスリファレンス原単位を登録/更新処理をします。
     *
     * <pre>
     * - Registration and update process.
     *     In the case of correction mode, it updates.
     *     In the case of the new mode, it registers.
     * 
     * - 登録・更新処理の実行
     *     処理モードが修正であれば、更新を行う。
     *     新規であれば登録を行う。
     * </pre>
     * 
     * @param criteriaDomain 画面の検索条件ドメイン
     * @return Registration / update counts 登録/更新件数
     * @throws ApplicationException 登録/更新件数0件の場合
     */
    public int transactOnEditRegister(W9009CgmShipToXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on lgcyShipTo code of conditions, 
     * and the search number is returned. 
     * 条件の送荷先コードを元にテーブルのデータを検索し、検索件数を返却します。
     * 
     * @param lgcyShipTo 送荷先コード
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public boolean validateDatabaseShipTo(String lgcyShipTo) 
        throws ApplicationException;

    /**
     * CIGMAの送荷先情報存在チェック
     * 入力されたNEXUS Ship To が NEXUS送荷先原単位に存在するかどうかチェックする
     * 
     * @param criteria CgmShipToXRefMaの CriteriaDomain クラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void validateDatabaseShipTo
    (W9009CgmShipToXRefMaCriteriaDomain criteria) throws ApplicationException;

}
