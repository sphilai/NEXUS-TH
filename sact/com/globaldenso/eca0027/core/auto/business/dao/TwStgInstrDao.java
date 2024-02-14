/*
 * PROJECT：eca0027
 * 
 * TwStgInstr のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwStgInstrDomain;
 
 
/**
 * TwStgInstr のDAOインターフェースです。<BR>
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
public interface TwStgInstrDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwStgInstrDomain searchByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwStgInstrDomain> searchByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwStgInstrDomain> searchByConditionForPaging(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwStgInstrDomain searchByKeyForChange(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwStgInstrDomain lockByKey(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twStgInstrの CriteriaDomain クラス
     * @return twStgInstrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwStgInstrDomain lockByKeyNoWait(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twStgInstrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwStgInstrDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twStgInstrのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwStgInstrDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twStgInstrのDomainクラス
     * @param criteria twStgInstrのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwStgInstrDomain domain, TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twStgInstrのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twStgInstrのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwStgInstrCriteriaDomain criteria) throws ApplicationException;

}