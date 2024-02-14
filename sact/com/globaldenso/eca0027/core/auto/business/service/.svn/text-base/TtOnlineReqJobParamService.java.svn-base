/*
 * PROJECT：eca0027
 * 
 * TtOnlineReqJobParam のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2016/07/06  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOnlineReqJobParamCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;


/**
 * TtOnlineReqJobParam のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2016/07/06 18:42:21<BR>
 * 
 * テーブル定義から2016/07/06に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13160 $
 */
public interface TtOnlineReqJobParamService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOnlineReqJobParamDomain searchByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtOnlineReqJobParamDomain> searchByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtOnlineReqJobParamDomain> searchByConditionForPaging(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOnlineReqJobParamDomain searchByKeyForChange(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOnlineReqJobParamDomain lockByKey(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttOnlineReqJobParamの CriteriaDomain クラス
     * @return ttOnlineReqJobParamのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOnlineReqJobParamDomain lockByKeyNoWait(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttOnlineReqJobParamのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtOnlineReqJobParamDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains ttOnlineReqJobParamのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TtOnlineReqJobParamDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttOnlineReqJobParamのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtOnlineReqJobParamDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains ttOnlineReqJobParamのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TtOnlineReqJobParamDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttOnlineReqJobParamのDomainクラス
     * @param criteria ttOnlineReqJobParamのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtOnlineReqJobParamDomain domain, TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains ttOnlineReqJobParamのDomainクラスのList
     * @param criteria ttOnlineReqJobParamのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TtOnlineReqJobParamDomain> domains, List<TtOnlineReqJobParamCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttOnlineReqJobParamのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttOnlineReqJobParamのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtOnlineReqJobParamCriteriaDomain criteria) throws ApplicationException;

}
