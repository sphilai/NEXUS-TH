/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9013NxsWhMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9013NxsWhMaCriteriaDomain;

/**
 * The search service implementation class of Warehouse Search Screen.
 * <br />
 * 倉庫検索画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface W9013NxsWhMaService {

    /**
     * <<Paging processing>>The data of a table is searched based on arbitrary conditions, 
     * and search results are returned by list form. 
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param w9013NxsWhMaCriteriaDomain W9013NxsWhMaの画面の検索条件ドメイン
     * @return W9013NxsWhMaのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W9013NxsWhMaDomain> searchByConditionForPaging(
        W9013NxsWhMaCriteriaDomain w9013NxsWhMaCriteriaDomain) throws ApplicationException;

    /**
     * The data of a table is searched based on arbitrary conditions, 
     * and the search-results number is returned. 
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param w9013NxsWhMaCriteriaDomain W9013NxsWhMa画面の検索条件ドメイン
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9013NxsWhMaCriteriaDomain w9013NxsWhMaCriteriaDomain)
        throws ApplicationException;

}
