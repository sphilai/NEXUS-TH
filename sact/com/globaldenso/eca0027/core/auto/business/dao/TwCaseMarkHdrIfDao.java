/*
 * PROJECT：eca0027
 * 
 * TwCaseMarkHdrIf のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/07/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain;
 
 
/**
 * TwCaseMarkHdrIf のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/07/20 13:57:18<BR>
 * 
 * テーブル定義から2015/07/20に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11744 $
 */
public interface TwCaseMarkHdrIfDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCaseMarkHdrIfDomain searchByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwCaseMarkHdrIfDomain> searchByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwCaseMarkHdrIfDomain> searchByConditionForPaging(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCaseMarkHdrIfDomain searchByKeyForChange(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCaseMarkHdrIfDomain lockByKey(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twCaseMarkHdrIfの CriteriaDomain クラス
     * @return twCaseMarkHdrIfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCaseMarkHdrIfDomain lockByKeyNoWait(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twCaseMarkHdrIfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwCaseMarkHdrIfDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twCaseMarkHdrIfのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwCaseMarkHdrIfDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twCaseMarkHdrIfのDomainクラス
     * @param criteria twCaseMarkHdrIfのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwCaseMarkHdrIfDomain domain, TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twCaseMarkHdrIfのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twCaseMarkHdrIfのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwCaseMarkHdrIfCriteriaDomain criteria) throws ApplicationException;

}
