/*
 * PROJECT：eca0027
 * 
 * TmSupplierWhXref のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/04/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;


/**
 * TmSupplierWhXref のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/04/11 17:40:10<BR>
 * 
 * テーブル定義から2016/04/11に自動生成したモジュールです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public interface TmSupplierWhXrefService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmSupplierWhXrefDomain searchByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmSupplierWhXrefDomain> searchByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmSupplierWhXrefDomain> searchByConditionForPaging(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmSupplierWhXrefDomain searchByKeyForChange(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmSupplierWhXrefDomain lockByKey(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmSupplierWhXrefの CriteriaDomain クラス
     * @return tmSupplierWhXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmSupplierWhXrefDomain lockByKeyNoWait(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmSupplierWhXrefのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmSupplierWhXrefDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmSupplierWhXrefのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmSupplierWhXrefDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmSupplierWhXrefのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmSupplierWhXrefDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmSupplierWhXrefのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmSupplierWhXrefDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmSupplierWhXrefのDomainクラス
     * @param criteria tmSupplierWhXrefのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmSupplierWhXrefDomain domain, TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmSupplierWhXrefのDomainクラスのList
     * @param criteria tmSupplierWhXrefのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmSupplierWhXrefDomain> domains, List<TmSupplierWhXrefCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmSupplierWhXrefのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmSupplierWhXrefのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmSupplierWhXrefCriteriaDomain criteria) throws ApplicationException;

}
