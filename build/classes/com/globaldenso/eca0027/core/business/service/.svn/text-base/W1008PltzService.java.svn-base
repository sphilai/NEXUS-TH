/*
 * PROJECT：eca0027
 * 
 * W1008Pltz のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/06/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;


/**
 * W1008Pltz のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/06/05 16:25:47<BR>
 * 
 * テーブル定義から2558/06/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface W1008PltzService {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria W1008Pltzの CriteriaDomain クラス
     * @return W1008PltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public W1008PltzDomain searchByKey(W1008PltzCriteriaDomain criteria) throws ApplicationException;
    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @return String
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public String searchRunningNo() throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria W1008Pltzの CriteriaDomain クラス
     * @return W1008PltzのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1008PltzDomain> searchByCondition(W1008PltzCriteriaDomain criteria) throws ApplicationException;
    /**
    * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
    * 
    * @param criteria W1008Pltzの CriteriaDomain クラス
    * @return W1008PltzのDomainクラスのList
    * @throws ApplicationException アプリ基盤のアプリケーション例外です。
    */
    public List<W1008PltzDomain> searchByPalletNo(W1008PltzCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria W1008Pltzの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountDistinct(W1008PltzCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain W1008PltzのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(W1008PltzDomain domain) throws ApplicationException;


    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria W1008PltzのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(W1008PltzCriteriaDomain criteria) throws ApplicationException;
    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria W1008Pltzの CriteriaDomain クラス
     * @return W1008PltzのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1008PltzDomain> searchByConditionWithOuterCD(W1008PltzCriteriaDomain criteria) throws ApplicationException;
    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain W1008PltzのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(W1008PltzDomain domain) throws ApplicationException;
}
