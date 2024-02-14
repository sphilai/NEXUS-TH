/*
 * PROJECT：eca0027
 * 
 * TtTransferKanban のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/04  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferKanbanDomain;


/**
 * TtTransferKanban のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/04 11:49:32<BR>
 * 
 * テーブル定義から2014/06/04に自動生成したモジュールです。
 * 
 * @author $Author: 100011638841 $
 * @version $Revision: 8158 $
 */
public interface TtTransferKanbanService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTransferKanbanDomain searchByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtTransferKanbanDomain> searchByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtTransferKanbanDomain> searchByConditionForPaging(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTransferKanbanDomain searchByKeyForChange(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTransferKanbanDomain lockByKey(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttTransferKanbanの CriteriaDomain クラス
     * @return ttTransferKanbanのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtTransferKanbanDomain lockByKeyNoWait(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttTransferKanbanのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtTransferKanbanDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains ttTransferKanbanのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TtTransferKanbanDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttTransferKanbanのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtTransferKanbanDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains ttTransferKanbanのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TtTransferKanbanDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttTransferKanbanのDomainクラス
     * @param criteria ttTransferKanbanのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtTransferKanbanDomain domain, TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains ttTransferKanbanのDomainクラスのList
     * @param criteria ttTransferKanbanのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TtTransferKanbanDomain> domains, List<TtTransferKanbanCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttTransferKanbanのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttTransferKanbanのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtTransferKanbanCriteriaDomain criteria) throws ApplicationException;

}
