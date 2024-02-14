/*
 * PROJECT：eca0027
 * 
 * TmOtherSysLinkLang のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/02/11  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmOtherSysLinkLangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmOtherSysLinkLangDomain;


/**
 * TmOtherSysLinkLang のServiceインターフェースです。<BR>
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
public interface TmOtherSysLinkLangService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkLangDomain searchByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmOtherSysLinkLangDomain> searchByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmOtherSysLinkLangDomain> searchByConditionForPaging(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkLangDomain searchByKeyForChange(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkLangDomain lockByKey(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmOtherSysLinkLangの CriteriaDomain クラス
     * @return tmOtherSysLinkLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmOtherSysLinkLangDomain lockByKeyNoWait(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmOtherSysLinkLangのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmOtherSysLinkLangDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains tmOtherSysLinkLangのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TmOtherSysLinkLangDomain> domains) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmOtherSysLinkLangのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmOtherSysLinkLangDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。（複数件更新）
     * 
     * @param domains tmOtherSysLinkLangのDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(List<TmOtherSysLinkLangDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmOtherSysLinkLangのDomainクラス
     * @param criteria tmOtherSysLinkLangのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmOtherSysLinkLangDomain domain, TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains tmOtherSysLinkLangのDomainクラスのList
     * @param criteria tmOtherSysLinkLangのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TmOtherSysLinkLangDomain> domains, List<TmOtherSysLinkLangCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmOtherSysLinkLangのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmOtherSysLinkLangのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmOtherSysLinkLangCriteriaDomain criteria) throws ApplicationException;

}
