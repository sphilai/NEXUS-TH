/*
 * PROJECT：eca0027
 * 
 * TtOdrUploadReqMgt のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/01/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtOdrUploadReqMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOdrUploadReqMgtDomain;
 
 
/**
 * TtOdrUploadReqMgt のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/01/26 19:15:00<BR>
 * 
 * テーブル定義から2017/01/26に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13533 $
 */
public interface TtOdrUploadReqMgtDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOdrUploadReqMgtDomain searchByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtOdrUploadReqMgtDomain> searchByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtOdrUploadReqMgtDomain> searchByConditionForPaging(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOdrUploadReqMgtDomain searchByKeyForChange(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOdrUploadReqMgtDomain lockByKey(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria ttOdrUploadReqMgtの CriteriaDomain クラス
     * @return ttOdrUploadReqMgtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TtOdrUploadReqMgtDomain lockByKeyNoWait(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttOdrUploadReqMgtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtOdrUploadReqMgtDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttOdrUploadReqMgtのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TtOdrUploadReqMgtDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttOdrUploadReqMgtのDomainクラス
     * @param criteria ttOdrUploadReqMgtのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtOdrUploadReqMgtDomain domain, TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria ttOdrUploadReqMgtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttOdrUploadReqMgtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtOdrUploadReqMgtCriteriaDomain criteria) throws ApplicationException;

}
