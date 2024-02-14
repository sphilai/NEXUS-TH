/*
 * PROJECT：eca0027
 * 
 * TtTmpStock のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
 
 
/**
 * TtTmpStock のDAOインターフェースです。<BR>
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
public interface TtTmpStockDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTmpStockDomain searchByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtTmpStockDomain> searchByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtTmpStockDomain> searchByConditionForPaging(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTmpStockDomain searchByKeyForChange(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTmpStockDomain lockByKey(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttTmpStockの CriteriaDomain クラス
     * @return ttTmpStockのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTmpStockDomain lockByKeyNoWait(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttTmpStockのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtTmpStockDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttTmpStockのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtTmpStockDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttTmpStockのDomainクラス
     * @param criteria ttTmpStockのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtTmpStockDomain domain, TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttTmpStockのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttTmpStockのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtTmpStockCriteriaDomain criteria) throws ApplicationException;

}
