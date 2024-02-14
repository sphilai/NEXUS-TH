/*
 * PROJECT：eca0027
 * 
 * TmServerLang のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmServerLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmServerLangDomain;


/**
 * TmServerLang のServiceインターフェースです。<BR>
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
public interface TmServerLangService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmServerLangDomain searchByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmServerLangDomain> searchByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmServerLangDomain> searchByConditionForPaging(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmServerLangDomain searchByKeyForChange(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmServerLangDomain lockByKey(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmServerLangの CriteriaDomain クラス
     * @return tmServerLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmServerLangDomain lockByKeyNoWait(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmServerLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmServerLangDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmServerLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmServerLangDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmServerLangのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmServerLangDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmServerLangのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmServerLangDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmServerLangのDomainクラス
     * @param criteria tmServerLangのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmServerLangDomain domain, TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmServerLangのDomainクラスのList
     * @param criteria tmServerLangのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmServerLangDomain> domains, List<TmServerLangCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmServerLangのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmServerLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmServerLangのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmServerLangCriteriaDomain criteria) throws ApplicationException;

}
