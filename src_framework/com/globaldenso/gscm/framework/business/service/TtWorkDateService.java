/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TtWorkDate のServiceインターフェース
 * Service Interface of TtWorkDate
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * Version.   Last Update Author        Detail
 * 1.0.0      March/03/2014  DNITS  Create
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain;


/**
 * TtWorkDate のServiceインターフェースです。<BR>
 * Service Interface of TtWorkDate<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * Create date ： March/03/2014 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * Auto create module from the table definition on March/03/2014
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public interface TtWorkDateService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * Search the data with the primary key,and return the search result
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラス
     * @return Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TtWorkDateDomain searchByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * Search the data of table with the optional condition,and return the search result with list format
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラスのList
     * @return List for Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public List<TtWorkDateDomain> searchByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * <<For paging process>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * Search the data of table with the optional condition,and return the search result with list format
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラスのList
     * @return List for Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public List<TtWorkDateDomain> searchByConditionForPaging(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * Search the data of table with the optional condition,and return the number of search result records
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return int 検索結果件数
     * @return int Number of search result records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int searchCount(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * Search the data with the primary key,and return the search result
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * Use this SQL when getting the record before update
     * 
     * 基本的にSearchByKeyと同等の機能となります。
     * Function same as that of SearchByKey basically
     * </pre>
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラス
     * @return Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TtWorkDateDomain searchByKeyForChange(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * Getting the lock with the primary key, and return the search result
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * Waiting until getting the lock when the lock already exists
     * </pre>
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラス
     * @return Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TtWorkDateDomain lockByKey(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * Getting the lock with the primary key, and return the search result
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * Exception occurs when the lock already exists
     * </pre>
     * 
     * @param criteria ttWorkDateの CriteriaDomain クラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return ttWorkDateのDomainクラス
     * @return Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public TtWorkDateDomain lockByKeyNoWait(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * Create data
     * 
     * @param domain ttWorkDateのDomainクラス
     * @param domain Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public void create(TtWorkDateDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * Create data
     * 
     * @param domains ttWorkDateのDomainクラスのList
     * @param domains List for Domain class of ttWorkDate
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public void create(List<TtWorkDateDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * Update the data with the primary key
     * 
     * @param domain ttWorkDateのDomainクラス
     * @param domain Domain class of ttWorkDate
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int update(TtWorkDateDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * Update the data with the primary key（update multi data）
     * 
     * @param domains ttWorkDateのDomainクラスのList
     * @param domains List for Domain class of ttWorkDate
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int update(List<TtWorkDateDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * Update the data with the optional condition
     * 
     * @param domain ttWorkDateのDomainクラス
     * @param domain Domain class of ttWorkDate
     * @param criteria ttWorkDateのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int updateByCondition(TtWorkDateDomain domain, TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * Update the data with the optional condition (update multi data)
     * 
     * @param domains ttWorkDateのDomainクラスのList
     * @param domains List for Domain class of ttWorkDate
     * @param criteria ttWorkDateのCriteriaDomainクラスのList
     * @param criteria List for CriteriaDomain class of ttWorkDate
     * @return 更新件数
     * @return Number of update records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int updateByCondition(List<TtWorkDateDomain> domains, List<TtWorkDateCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * Hard delete the data with the primary key
     * 
     * @param criteria ttWorkDateのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return 削除件数
     * @return Number of delete records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int delete(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * Hard delete the data with the optional condition
     * 
     * @param criteria ttWorkDateのCriteriaDomainクラス
     * @param criteria CriteriaDomain class of ttWorkDate
     * @return 削除件数
     * @return Number of delete records
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public int deleteByCondition(TtWorkDateCriteriaDomain criteria) throws ApplicationException;

}
