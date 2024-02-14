/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
 
 
/**
 * W1001ExpRequest のDAOインターフェースです。<BR>
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
public interface W1001ExpRequestDao {

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return ttExpRequestのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1001ExpRequestDomain> searchByConditionForPaging(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return ttExpRequestのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public W1001ExpRequestDomain searchByKeyForChange(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttExpRequestのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(W1001ExpRequestDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttExpRequestのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(W1001ExpRequestDomain domain) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return ttExpRequestのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public W1001ExpRequestDomain searchByContSort(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
    * 主キーを条件にデータを検索し、検索結果を返却します。
    * 
    * <pre>
    * 更新前処理のレコード取得時に当SQLを使用します。
    * 
    * searchByKeyForInitと違い、検索条件に主キー以外の項目も含まれています。
    * </pre>
    * 
    * @param criteria W1001ExpRequestCriteriaDomainの CriteriaDomain クラス
    * @return ttExpRequestのW1001ExpRequestDomainクラス
    * @throws ApplicationException アプリ基盤のアプリケーション例外です。
    */
    public W1001ExpRequestDomain searchByKeyForInit(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

   /**
    * 主キーを条件にデータを検索し、検索結果を返却します。
    * 
    * <pre>
    * 更新前処理のレコード取得時に当SQLを使用します。
    * 
    * searchQtyForDtlと違い、検索条件に主キー以外の項目も含まれています。
    * </pre>
    * 
    * @param criteria TtExpRequestDtlCriteriaDomainの CriteriaDomain クラス
    * @return ttExpRequestDtlDomainのTtExpRequestDtlDomainクラス
    * @throws ApplicationException アプリ基盤のアプリケーション例外です。
    */
    public List<TtExpRequestDtlDomain> searchQtyForDtl(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException;
   
   /**
    * 主キーを条件にデータを検索し、検索結果を返却します。
    * 
    * <pre>
    * 更新前処理のレコード取得時に当SQLを使用します。
    * 
    * searchAmountForDtlと違い、検索条件に主キー以外の項目も含まれています。
    * </pre>
    * 
    * @param criteria TtExpRequestDtlCriteriaDomainの CriteriaDomain クラス
    * @return ttExpRequestDtlDomainのTtExpRequestDtlDomainクラス
    * @throws ApplicationException アプリ基盤のアプリケーション例外です。
    */
    public List<TtExpRequestDtlDomain> searchAmountForDtl(TtExpRequestDtlCriteriaDomain criteria) throws ApplicationException;
}
