/*
 * PROJECT：eca0027
 * 
 * TwCarryOutListPltz のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/03  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain;
 
 
/**
 * TwCarryOutListPltz のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/06/03 15:33:31<BR>
 * 
 * テーブル定義から2014/06/03に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface TwCarryOutListPltzDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCarryOutListPltzDomain searchByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwCarryOutListPltzDomain> searchByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TwCarryOutListPltzDomain> searchByConditionForPaging(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCarryOutListPltzDomain searchByKeyForChange(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、ロックが取得できるまで待機します。
     * </pre>
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCarryOutListPltzDomain lockByKey(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件にロックを取得し、検索結果を返却します。
     * 
     * <pre>
     * 既にロックが取得されている場合、例外が発生します。
     * </pre>
     * 
     * @param criteria twCarryOutListPltzの CriteriaDomain クラス
     * @return twCarryOutListPltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TwCarryOutListPltzDomain lockByKeyNoWait(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain twCarryOutListPltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TwCarryOutListPltzDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain twCarryOutListPltzのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(TwCarryOutListPltzDomain domain) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain twCarryOutListPltzのDomainクラス
     * @param criteria twCarryOutListPltzのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TwCarryOutListPltzDomain domain, TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria twCarryOutListPltzのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria twCarryOutListPltzのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException;

}
