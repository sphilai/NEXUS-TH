/*
 * PROJECT：eca0027
 * 
 * TtEdiRcvOdrRtry のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrRtryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrRtryDomain;


/**
 * TtEdiRcvOdrRtry のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/06 12:17:14<BR>
 * 
 * テーブル定義から2014/08/06に自動生成したモジュールです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7336 $
 */
public interface TtEdiRcvOdrRtryService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtEdiRcvOdrRtryDomain searchByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtEdiRcvOdrRtryDomain> searchByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtEdiRcvOdrRtryDomain> searchByConditionForPaging(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtEdiRcvOdrRtryDomain searchByKeyForChange(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtEdiRcvOdrRtryDomain lockByKey(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttEdiRcvOdrRtryの CriteriaDomain クラス
     * @return ttEdiRcvOdrRtryのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtEdiRcvOdrRtryDomain lockByKeyNoWait(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttEdiRcvOdrRtryのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtEdiRcvOdrRtryDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains ttEdiRcvOdrRtryのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TtEdiRcvOdrRtryDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttEdiRcvOdrRtryのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtEdiRcvOdrRtryDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains ttEdiRcvOdrRtryのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TtEdiRcvOdrRtryDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttEdiRcvOdrRtryのDomainクラス
     * @param criteria ttEdiRcvOdrRtryのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtEdiRcvOdrRtryDomain domain, TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains ttEdiRcvOdrRtryのDomainクラスのList
     * @param criteria ttEdiRcvOdrRtryのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TtEdiRcvOdrRtryDomain> domains, List<TtEdiRcvOdrRtryCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttEdiRcvOdrRtryのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttEdiRcvOdrRtryのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtEdiRcvOdrRtryCriteriaDomain criteria) throws ApplicationException;

}
