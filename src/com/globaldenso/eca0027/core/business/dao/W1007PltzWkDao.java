/*
 * PROJECT：eca0027
 * 
 * W1007PltzWk のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/05/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
 
 
/**
 * W1007PltzWk のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/05/26 15:53:05<BR>
 * 
 * テーブル定義から2558/05/26に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface W1007PltzWkDao {

    /**
    * 主キーを条件にデータを検索し、検索結果を返却します。
    * Issue 098
    * @param criteria W1007PltzWkの CriteriaDomain クラス
    * @return W1007PltzWkのDomainクラス
    * @throws ApplicationException アプリ基盤のアプリケーション例外です。
    */
    public List<W1007PltzWkDomain> searchByType(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria W1007PltzWkの CriteriaDomain クラス
     * @return W1007PltzWkのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1007PltzWkDomain> searchByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria W1007PltzWkの CriteriaDomain クラス
     * @return W1007PltzWkのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1007PltzWkDomain> searchJoinByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchMaxId() throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria W1007PltzWkの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountDistinct(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;


    /**
     * データを登録します。
     * 
     * @param domain W1007PltzWkのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(W1007PltzWkDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain W1007PltzWkのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(W1007PltzWkDomain domain) throws ApplicationException;


    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria W1007PltzWkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;
    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria W1007PltzWkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByExpRequestNo(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;

}
