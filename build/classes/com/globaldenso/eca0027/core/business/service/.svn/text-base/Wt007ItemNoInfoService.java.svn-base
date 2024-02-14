/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List; 

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;

/**
 * The search service implementation class of Item No. Info Sub
 * Screen. <br />
 * 品番表示子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt007ItemNoInfoService {

    /**
     * Search table in any criteria, return the list of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria Wt007ItemNoInfoの CriteriaDomain クラス
     * @return criteria Wt007ItemNoInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt007ItemNoInfoDomain> searchByCondition(
        Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search table in any criteria, return the number of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria Wt007ItemNoInfoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException;

}
