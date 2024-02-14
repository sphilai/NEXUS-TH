/*
 * PROJECT：eca0027
 * 
 * TmMeasureUnit のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/12/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;


/**
 * TmMeasureUnit のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/12/05 16:41:35<BR>
 * 
 * テーブル定義から2014/12/05に自動生成したモジュールです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10146 $
 */
public interface TmMeasureUnitService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmMeasureUnitDomain searchByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmMeasureUnitDomain> searchByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmMeasureUnitDomain> searchByConditionForPaging(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmMeasureUnitDomain searchByKeyForChange(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmMeasureUnitDomain lockByKey(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmMeasureUnitの CriteriaDomain クラス
     * @return tmMeasureUnitのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmMeasureUnitDomain lockByKeyNoWait(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmMeasureUnitのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmMeasureUnitDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmMeasureUnitのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmMeasureUnitDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmMeasureUnitのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmMeasureUnitDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmMeasureUnitのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmMeasureUnitDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmMeasureUnitのDomainクラス
     * @param criteria tmMeasureUnitのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmMeasureUnitDomain domain, TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmMeasureUnitのDomainクラスのList
     * @param criteria tmMeasureUnitのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmMeasureUnitDomain> domains, List<TmMeasureUnitCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmMeasureUnitのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmMeasureUnitのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmMeasureUnitCriteriaDomain criteria) throws ApplicationException;

}
