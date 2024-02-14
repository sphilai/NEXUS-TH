/*
 * PROJECT：eca0027
 * 
 * TmPrinterPurpose のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterPurposeDomain;


/**
 * TmPrinterPurpose のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface TmPrinterPurposeService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmPrinterPurposeDomain searchByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmPrinterPurposeDomain> searchByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmPrinterPurposeDomain> searchByConditionForPaging(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmPrinterPurposeDomain searchByKeyForChange(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmPrinterPurposeDomain lockByKey(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmPrinterPurposeの CriteriaDomain クラス
     * @return tmPrinterPurposeのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmPrinterPurposeDomain lockByKeyNoWait(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmPrinterPurposeのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmPrinterPurposeDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmPrinterPurposeのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmPrinterPurposeDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmPrinterPurposeのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmPrinterPurposeDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmPrinterPurposeのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmPrinterPurposeDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmPrinterPurposeのDomainクラス
     * @param criteria tmPrinterPurposeのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmPrinterPurposeDomain domain, TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmPrinterPurposeのDomainクラスのList
     * @param criteria tmPrinterPurposeのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmPrinterPurposeDomain> domains, List<TmPrinterPurposeCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmPrinterPurposeのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmPrinterPurposeのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmPrinterPurposeCriteriaDomain criteria) throws ApplicationException;

}