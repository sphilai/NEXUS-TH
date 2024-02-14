/*
 * PROJECT：eca0027
 * 
 * TmCigmaShipToXref のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;


/**
 * TmCigmaShipToXref のServiceインターフェースです。<BR>
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
public interface TmCigmaShipToXrefService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCigmaShipToXrefDomain searchByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmCigmaShipToXrefDomain> searchByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmCigmaShipToXrefDomain> searchByConditionForPaging(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCigmaShipToXrefDomain searchByKeyForChange(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCigmaShipToXrefDomain lockByKey(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmCigmaShipToXrefの CriteriaDomain クラス
     * @return tmCigmaShipToXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCigmaShipToXrefDomain lockByKeyNoWait(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmCigmaShipToXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmCigmaShipToXrefDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmCigmaShipToXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmCigmaShipToXrefDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmCigmaShipToXrefのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmCigmaShipToXrefDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmCigmaShipToXrefのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmCigmaShipToXrefDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmCigmaShipToXrefのDomainクラス
     * @param criteria tmCigmaShipToXrefのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmCigmaShipToXrefDomain domain, TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmCigmaShipToXrefのDomainクラスのList
     * @param criteria tmCigmaShipToXrefのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmCigmaShipToXrefDomain> domains, List<TmCigmaShipToXrefCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmCigmaShipToXrefのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmCigmaShipToXrefのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmCigmaShipToXrefCriteriaDomain criteria) throws ApplicationException;

}