/*
 * PROJECT：eca0027
 * 
 * TmCustomerQrPatternHdr のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCustomerQrPatternHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCustomerQrPatternHdrDomain;


/**
 * TmCustomerQrPatternHdr のServiceインターフェースです。<BR>
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
public interface TmCustomerQrPatternHdrService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCustomerQrPatternHdrDomain searchByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmCustomerQrPatternHdrDomain> searchByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmCustomerQrPatternHdrDomain> searchByConditionForPaging(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCustomerQrPatternHdrDomain searchByKeyForChange(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCustomerQrPatternHdrDomain lockByKey(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmCustomerQrPatternHdrの CriteriaDomain クラス
     * @return tmCustomerQrPatternHdrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmCustomerQrPatternHdrDomain lockByKeyNoWait(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmCustomerQrPatternHdrのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmCustomerQrPatternHdrDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmCustomerQrPatternHdrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmCustomerQrPatternHdrDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmCustomerQrPatternHdrのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmCustomerQrPatternHdrDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmCustomerQrPatternHdrのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmCustomerQrPatternHdrDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmCustomerQrPatternHdrのDomainクラス
     * @param criteria tmCustomerQrPatternHdrのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmCustomerQrPatternHdrDomain domain, TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmCustomerQrPatternHdrのDomainクラスのList
     * @param criteria tmCustomerQrPatternHdrのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmCustomerQrPatternHdrDomain> domains, List<TmCustomerQrPatternHdrCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmCustomerQrPatternHdrのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmCustomerQrPatternHdrのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmCustomerQrPatternHdrCriteriaDomain criteria) throws ApplicationException;

}
