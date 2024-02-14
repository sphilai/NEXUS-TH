/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLink のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkDomain;


/**
 * TmOtherSysLink のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/02/11 14:36:46<BR>
 * 
 * テーブル定義から2015/02/11に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10644 $
 */
public interface TmOtherSysLinkService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkDomain searchByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmOtherSysLinkDomain> searchByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmOtherSysLinkDomain> searchByConditionForPaging(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkDomain searchByKeyForChange(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkDomain lockByKey(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkの CriteriaDomain クラス
     * @return tmOtherSysLinkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkDomain lockByKeyNoWait(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmOtherSysLinkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmOtherSysLinkDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmOtherSysLinkのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmOtherSysLinkDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmOtherSysLinkのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmOtherSysLinkDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmOtherSysLinkのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmOtherSysLinkDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmOtherSysLinkのDomainクラス
     * @param criteria tmOtherSysLinkのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmOtherSysLinkDomain domain, TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmOtherSysLinkのDomainクラスのList
     * @param criteria tmOtherSysLinkのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmOtherSysLinkDomain> domains, List<TmOtherSysLinkCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmOtherSysLinkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmOtherSysLinkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmOtherSysLinkCriteriaDomain criteria) throws ApplicationException;

}
