/*
 * PROJECT：eca0027
 * 
 * W1006ExpRequestDtlKit のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain;
 
 
/**
 * W1006ExpRequestDtlKit のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/28 16:15:38<BR>
 * 
 * テーブル定義から2558/04/28に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface W1006ExpRequestDtlKitDao {


    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria W1006ExpRequestDtlKitの CriteriaDomain クラス
     * @return W1006ExpRequestDtlKitのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1006ExpRequestDtlKitDomain> searchByCondition(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException;


    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria W1006ExpRequestDtlKitの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException;



}
