/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TmColumnSize のServiceインターフェース
 * Service Interface of TmColumnSize
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * Version.   Last Update Author        Detail
 * 1.0.0      Mar./03/2014  DNITS  Create
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmColumnSizeCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmColumnSizeDomain;


/**
 * TmColumnSize のServiceインターフェースです。<BR>
 * Service Interface of TmColumnSize<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 15:46:53<BR>
 * Create date ： Mar./03/2014 15:46:53<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * Auto create module from the table definition on Mar./03/2014
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public interface TmColumnSizeService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * Search the data with the primary key,and return the search result
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param CriteriaDomain class of criteria tmColumnSize
     * @return tmColumnSizeのDomainクラス
     * @return Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TmColumnSizeDomain searchByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * Search the data of table with the optional condition,and return the search result with list format
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return tmColumnSizeのDomainクラスのList
     * @return List for Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public List<TmColumnSizeDomain> searchByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * <<For paging process>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * Search the data of table with the optional condition,and return the search result with list format
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return tmColumnSizeのDomainクラスのList
     * @return List for Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public List<TmColumnSizeDomain> searchByConditionForPaging(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * Search the data of table with the optional condition,and return the number of search result records
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return int 検索結果件数
     * @return int Number of search result records 
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int searchCount(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * Search the data with the primary key,and return the search result
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * Use this SQL when getting the record before update
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * Unlike SearchByKey, items except the primary key is also included in the search condition
     * </pre>
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return tmColumnSizeのDomainクラス
     * @return Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TmColumnSizeDomain searchByKeyForChange(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * Getting the lock with the primary key, and retutn the search result
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * Waiting until getting the lock when the lock already exists
     * </pre>
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return tmColumnSizeのDomainクラス
     * @return Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TmColumnSizeDomain lockByKey(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * Getting the lock with the primary key, and return the search result
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * Exception occurs when the lock already exists
     * </pre>
     * 
     * @param criteria tmColumnSizeの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return tmColumnSizeのDomainクラス
     * @return Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TmColumnSizeDomain lockByKeyNoWait(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * Create data
     * 
     * @param domain tmColumnSizeのDomainクラス
     * @param domain Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public void create(TmColumnSizeDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * Create data
     * 
     * @param domains tmColumnSizeのDomainクラスのList
     * @param domains List for Domain class of tmColumnSize
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public void create(List<TmColumnSizeDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * update the data with the primary key
     * 
     * @param domain tmColumnSizeのDomainクラス
     * @param domain Domain class of tmColumnSize
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int update(TmColumnSizeDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * Update the data with the primary key（update multi data）
     * 
     * @param domains tmColumnSizeのDomainクラスのList
     * @param domains List for Domain class of tmColumnSize
     * @return 更新件数
     * @return update number of records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int update(List<TmColumnSizeDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * Update the data with the optional condition
     * 
     * @param domain tmColumnSizeのDomainクラス
     * @param domain Domain class of tmColumnSize
     * @param criteria tmColumnSizeのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int updateByCondition(TmColumnSizeDomain domain, TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * Update the data with the optional condition (update multi data)
     * 
     * @param domains tmColumnSizeのDomainクラスのList
     * @param domains List for Domain class of tmColumnSize
     * @param criteria tmColumnSizeのCriteriaDomainクラスのList
     * @param criteria List for CriteriaDomain class of tmColumnSize
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int updateByCondition(List<TmColumnSizeDomain> domains, List<TmColumnSizeCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * Hard delete the data with the primary key
     * 
     * @param criteria tmColumnSizeのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return 削除件数
     * @return Number of delete records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int delete(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * Hard delete the data with the optional condition
     * 
     * @param criteria tmColumnSizeのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of tmColumnSize
     * @return 削除件数
     * @return Number of delete records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int deleteByCondition(TmColumnSizeCriteriaDomain criteria) throws ApplicationException;

}
