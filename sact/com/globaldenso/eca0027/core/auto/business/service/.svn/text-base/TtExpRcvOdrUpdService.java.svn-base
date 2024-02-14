/*
 * PROJECT：eca0027
 * 
 * TtExpRcvOdrUpd のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrUpdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain;


/**
 * TtExpRcvOdrUpd のServiceインターフェースです。<BR>
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
public interface TtExpRcvOdrUpdService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttExpRcvOdrUpdの CriteriaDomain クラス
     * @return ttExpRcvOdrUpdのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtExpRcvOdrUpdDomain> searchByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttExpRcvOdrUpdの CriteriaDomain クラス
     * @return ttExpRcvOdrUpdのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TtExpRcvOdrUpdDomain> searchByConditionForPaging(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttExpRcvOdrUpdの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttExpRcvOdrUpdのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(TtExpRcvOdrUpdDomain domain) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domains ttExpRcvOdrUpdのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(List<TtExpRcvOdrUpdDomain> domains) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。
     * 
     * @param domain ttExpRcvOdrUpdのDomainクラス
     * @param criteria ttExpRcvOdrUpdのCriteriaDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(TtExpRcvOdrUpdDomain domain, TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを更新します。（複数件更新）
     * 
     * @param domains ttExpRcvOdrUpdのDomainクラスのList
     * @param criteria ttExpRcvOdrUpdのCriteriaDomainクラスのList
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int updateByCondition(List<TtExpRcvOdrUpdDomain> domains, List<TtExpRcvOdrUpdCriteriaDomain> criteria) throws ApplicationException;

    /**
     * 任意の条件を元に、データを物理削除します。
     * 
     * @param criteria ttExpRcvOdrUpdのCriteriaDomainクラス
     * @return 削除件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int deleteByCondition(TtExpRcvOdrUpdCriteriaDomain criteria) throws ApplicationException;

}
