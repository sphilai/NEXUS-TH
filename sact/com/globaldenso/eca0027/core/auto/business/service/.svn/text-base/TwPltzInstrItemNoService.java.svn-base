/*
 * PROJECT：eca0027
 * 
 * TwPltzInstrItemNo のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/17  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain;


/**
 * TwPltzInstrItemNo のServiceインターフェースです。<BR>
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
public interface TwPltzInstrItemNoService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwPltzInstrItemNoDomain searchByKey(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwPltzInstrItemNoDomain> searchByCondition(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwPltzInstrItemNoDomain> searchByConditionForPaging(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwPltzInstrItemNoDomain searchByKeyForChange(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwPltzInstrItemNoDomain lockByKey(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twPltzInstrItemNoの CriteriaDomain クラス
     * @return twPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwPltzInstrItemNoDomain lockByKeyNoWait(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twPltzInstrItemNoのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwPltzInstrItemNoDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains twPltzInstrItemNoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TwPltzInstrItemNoDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twPltzInstrItemNoのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwPltzInstrItemNoDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains twPltzInstrItemNoのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TwPltzInstrItemNoDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twPltzInstrItemNoのDomainクラス
     * @param criteria twPltzInstrItemNoのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwPltzInstrItemNoDomain domain, TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains twPltzInstrItemNoのDomainクラスのList
     * @param criteria twPltzInstrItemNoのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TwPltzInstrItemNoDomain> domains, List<TwPltzInstrItemNoCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twPltzInstrItemNoのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twPltzInstrItemNoのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwPltzInstrItemNoCriteriaDomain criteria) throws ApplicationException;

}
