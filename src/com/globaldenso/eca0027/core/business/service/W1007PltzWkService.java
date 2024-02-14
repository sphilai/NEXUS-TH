/*
 * PROJECT：eca0027
 * 
 * W1007PltzWk のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/05/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;


/**
 * W1007PltzWk のServiceインターフェースです。<BR>
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
public interface W1007PltzWkService {

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
     * @param criteria W1007PltzWkの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountDistinct(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;


    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria W1007PltzWkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int delete(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;

    /**
     * @param updateDomain W1007UpdateDomain<br />検索条件ドメイン
     * @return updateDomain W1007UpdateDomain <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1007UpdateDomain transactOnDetailSave(W1007UpdateDomain updateDomain) throws ApplicationException;
    /**
     * @return int
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public int searchMaxId() throws ApplicationException;
    
    /**@param domain List<W1007PltzWkDomain><br />検索条件ドメイン
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public void create(List<W1007PltzWkDomain> domain) throws ApplicationException;
    /**
     * 主キーを条件に、データを物理削除します。
     * 
     * @param criteria W1007PltzWkのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByExpRequestNo(W1007PltzWkCriteriaDomain criteria) throws ApplicationException;
}
