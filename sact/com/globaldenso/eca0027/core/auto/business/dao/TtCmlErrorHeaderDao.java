/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorHeader のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
 
 
/**
 * TtCmlErrorHeader のDAOインターフェースです。<BR>
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
public interface TtCmlErrorHeaderDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtCmlErrorHeaderDomain searchByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtCmlErrorHeaderDomain> searchByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtCmlErrorHeaderDomain> searchByConditionForPaging(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtCmlErrorHeaderDomain searchByKeyForChange(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtCmlErrorHeaderDomain lockByKey(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttCmlErrorHeaderの CriteriaDomain クラス
     * @return ttCmlErrorHeaderのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtCmlErrorHeaderDomain lockByKeyNoWait(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttCmlErrorHeaderのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtCmlErrorHeaderDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttCmlErrorHeaderのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtCmlErrorHeaderDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttCmlErrorHeaderのDomainクラス
     * @param criteria ttCmlErrorHeaderのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtCmlErrorHeaderDomain domain, TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttCmlErrorHeaderのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttCmlErrorHeaderのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtCmlErrorHeaderCriteriaDomain criteria) throws ApplicationException;

}
