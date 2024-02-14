/*
 * PROJECT：eca0027
 * 
 * TtPltzKanbanExtra のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain;
 
 
/**
 * TtPltzKanbanExtra のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/02/07 17:12:52<BR>
 * 
 * テーブル定義から2017/02/07に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface TtPltzKanbanExtraDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzKanbanExtraDomain searchByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtPltzKanbanExtraDomain> searchByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtPltzKanbanExtraDomain> searchByConditionForPaging(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzKanbanExtraDomain searchByKeyForChange(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzKanbanExtraDomain lockByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttPltzKanbanExtraの CriteriaDomain クラス
     * @return ttPltzKanbanExtraのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzKanbanExtraDomain lockByKeyNoWait(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttPltzKanbanExtraのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtPltzKanbanExtraDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttPltzKanbanExtraのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtPltzKanbanExtraDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttPltzKanbanExtraのDomainクラス
     * @param criteria ttPltzKanbanExtraのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtPltzKanbanExtraDomain domain, TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttPltzKanbanExtraのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttPltzKanbanExtraのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException;

}