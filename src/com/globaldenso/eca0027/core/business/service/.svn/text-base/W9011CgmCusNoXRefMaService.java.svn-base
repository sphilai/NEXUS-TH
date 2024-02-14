/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;

/**
 * The search service implementation class of 
 * CIGMA Customer No X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No X-Reference MA Inquiry画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface W9011CgmCusNoXRefMaService {

    /**
     * The data of a table is searched based on arbitrary conditions, 
     * and the search-results number is returned. 
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteriaDomain 画面の検索条件ドメイン
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain)
        throws ApplicationException;

    /**
     * <<Paging processing>>The data of a table is searched based on arbitrary conditions, 
     * and search results are returned by list form. 
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteriaDomain 画面の検索条件ドメイン
     * @return W9011CgmCusNoXRefMaのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9011CgmCusNoXRefMaDomain> searchByConditionForPaging 
    (W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain)
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
     * @param criteriaDomain 画面の検索条件ドメイン
     * @return Delete number 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteOnInquiryDelete(W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on arbitrary conditions, 
     * and search results are returned by list form. 
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return W9011CgmCusNoXRefMaのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9011CgmCusNoXRefMaDomain> 
    searchByCondition(W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on the corporate code of conditions, 
     * and search results are returned. 
     * 条件の会社コードを元にテーブルのデータを検索し、検索結果を返却します。
     * 
     * @param lgcyLibCompCd 会社コード
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
     * @param compCd 会社コード
     * @return true/false
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public boolean validateDatabaseConsignee(String compCd) 
        throws ApplicationException;

    /**
     * The data of a table is searched based on the corporate code of conditions, 
     * and search results are returned by domain form. 
     * 条件の会社コードを元にテーブルのデータを検索し、検索結果をドメイン形式で返却します。
     * 
     * @param criteriaDomain criteriaDomain 画面の検索条件ドメイン
     * @return W9011CgmCusNoXRefMaのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public W9011CgmCusNoXRefMaDomain validateDatabaseIntermediateFlg
    (W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain) 
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
     * The customer information existence check of CIGMA.
     * CIGMAの得意先情報存在チェック(WS(Get Customer Info))
     * CIGMAの原単位に入力された得意先情報が存在するかをチェックする
     * 
     * @param criteria W9011CgmCusNoXRefMaの CriteriaDomain クラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @return 取得した得意先情報
     */
    public Ws9003ResultDomain validateDatabaseCustomer
    (W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * Registration/update process about a NEXUS consignee cross reference standard physical unit. 
     * NEXUS荷受人クロスリファレンス原単位を登録/更新処理をします。
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
    public int transactOnEditRegister(W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain) 
        throws ApplicationException;
}
