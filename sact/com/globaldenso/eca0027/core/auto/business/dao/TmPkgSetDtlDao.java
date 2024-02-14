/*
 * PROJECT：eca0027
 * 
 * TmPkgSetDtl のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetDtlDomain;
 
 
/**
 * TmPkgSetDtl のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11315 $
 */
public interface TmPkgSetDtlDao {

    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * @param criteria tmPkgSetDtlの CriteriaDomain クラス
     * @return tmPkgSetDtlのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public TmPkgSetDtlDomain searchByKey(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmPkgSetDtlの CriteriaDomain クラス
     * @return tmPkgSetDtlのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmPkgSetDtlDomain> searchByCondition(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria tmPkgSetDtlの CriteriaDomain クラス
     * @return tmPkgSetDtlのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<TmPkgSetDtlDomain> searchByConditionForPaging(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria tmPkgSetDtlの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException;


}
