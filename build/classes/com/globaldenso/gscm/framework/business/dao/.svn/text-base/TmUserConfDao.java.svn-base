/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUserConf のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
 
 
/**
 * TmUserConf のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public interface TmUserConfDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmUserConfDomain searchByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmUserConfDomain> searchByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmUserConfDomain> searchByConditionForPaging(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * 基本的にSearchByKeyと同等の機能となります。
     * </pre>
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmUserConfDomain searchByKeyForChange(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmUserConfDomain lockByKey(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria tmUserConfの CriteriaDomain クラス
     * @return tmUserConfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmUserConfDomain lockByKeyNoWait(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain tmUserConfのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TmUserConfDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain tmUserConfのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TmUserConfDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain tmUserConfのDomainクラス
     * @param criteria tmUserConfのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TmUserConfDomain domain, TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria tmUserConfのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TmUserConfCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria tmUserConfのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TmUserConfCriteriaDomain criteria) throws ApplicationException;

}
