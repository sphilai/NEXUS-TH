/*
 * PROJECT：eca0027
 * 
 * TmExpShipToShipping のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;


/**
 * TmExpShipToShipping のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/12/18 16:26:47<BR>
 * 
 * テーブル定義から2017/12/18に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public interface TmExpShipToShippingService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmExpShipToShippingDomain searchByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * Export Request
     * 
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmExpShipToShippingDomain searchContainerKeyByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmExpShipToShippingDomain> searchByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmExpShipToShippingDomain> searchByConditionForPaging(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmExpShipToShippingDomain searchByKeyForChange(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmExpShipToShippingDomain lockByKey(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmExpShipToShippingの CriteriaDomain クラス
     * @return tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmExpShipToShippingDomain lockByKeyNoWait(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmExpShipToShippingのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmExpShipToShippingDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmExpShipToShippingのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmExpShipToShippingDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmExpShipToShippingのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmExpShipToShippingDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmExpShipToShippingのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmExpShipToShippingDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmExpShipToShippingのDomainクラス
     * @param criteria tmExpShipToShippingのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmExpShipToShippingDomain domain, TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmExpShipToShippingのDomainクラスのList
     * @param criteria tmExpShipToShippingのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmExpShipToShippingDomain> domains, List<TmExpShipToShippingCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmExpShipToShippingのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmExpShipToShippingのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException;

}
