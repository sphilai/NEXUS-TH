/*
 * PROJECT：eca0027
 * 
 * TwExpRequestPalletizeRt のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/06/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;
 
 
/**
 * TwExpRequestPalletizeRt のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/06/08 15:34:03<BR>
 * 
 * テーブル定義から2015/06/08に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface TwExpRequestPalletizeRtDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwExpRequestPalletizeRtDomain searchByKey(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwExpRequestPalletizeRtDomain> searchByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwExpRequestPalletizeRtDomain> searchByConditionForPaging(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwExpRequestPalletizeRtDomain searchByKeyForChange(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwExpRequestPalletizeRtDomain lockByKey(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwExpRequestPalletizeRtDomain lockByKeyNoWait(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twExpRequestPalletizeRtのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwExpRequestPalletizeRtDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twExpRequestPalletizeRtのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwExpRequestPalletizeRtDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twExpRequestPalletizeRtのDomainクラス
     * @param criteria twExpRequestPalletizeRtのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwExpRequestPalletizeRtDomain domain, TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twExpRequestPalletizeRtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twExpRequestPalletizeRtのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwExpRequestPalletizeRtDomain> searchPkgSetMaterialsNxsCompNm(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twExpRequestPalletizeRtの CriteriaDomain クラス
     * @return twExpRequestPalletizeRtのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwExpRequestPalletizeRtDomain> searchJoinPackageMaterialByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException;
}
