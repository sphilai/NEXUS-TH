/*
 * PROJECT：eca0027
 * 
 * TwMixtagRt のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;
 
 
/**
 * TwMixtagRt のDAOインターフェースです。<BR>
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
public interface TwMixtagRtDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwMixtagRtDomain searchByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwMixtagRtDomain> searchByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwMixtagRtDomain> searchByConditionForPaging(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwMixtagRtDomain searchByKeyForChange(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwMixtagRtDomain lockByKey(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twMixtagRtの CriteriaDomain クラス
     * @return twMixtagRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwMixtagRtDomain lockByKeyNoWait(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twMixtagRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwMixtagRtDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twMixtagRtのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwMixtagRtDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twMixtagRtのDomainクラス
     * @param criteria twMixtagRtのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwMixtagRtDomain domain, TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twMixtagRtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twMixtagRtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwMixtagRtCriteriaDomain criteria) throws ApplicationException;

}
