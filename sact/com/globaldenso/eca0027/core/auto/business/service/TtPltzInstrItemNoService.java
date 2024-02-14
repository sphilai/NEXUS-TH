/*
 * PROJECT：eca0027
 * 
 * TtPltzInstrItemNo のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;


/**
 * TtPltzInstrItemNo のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/17 15:54:04<BR>
 * 
 * テーブル定義から2017/01/17に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public interface TtPltzInstrItemNoService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzInstrItemNoDomain searchByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtPltzInstrItemNoDomain> searchByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtPltzInstrItemNoDomain> searchByConditionForPaging(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzInstrItemNoDomain searchByKeyForChange(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzInstrItemNoDomain lockByKey(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttPltzInstrItemNoの CriteriaDomain クラス
     * @return ttPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtPltzInstrItemNoDomain lockByKeyNoWait(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtPltzInstrItemNoDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains ttPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TtPltzInstrItemNoDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttPltzInstrItemNoのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtPltzInstrItemNoDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains ttPltzInstrItemNoのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TtPltzInstrItemNoDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttPltzInstrItemNoのDomainクラス
     * @param criteria ttPltzInstrItemNoのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtPltzInstrItemNoDomain domain, TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains ttPltzInstrItemNoのDomainクラスのList
     * @param criteria ttPltzInstrItemNoのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TtPltzInstrItemNoDomain> domains, List<TtPltzInstrItemNoCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttPltzInstrItemNoのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttPltzInstrItemNoのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

}
