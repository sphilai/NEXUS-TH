/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt015UnitPriceErrListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt015UnitPriceErrListCriteriaDomain;

/**
 * The search service implementation class of Unit Price Error List SubScreen. 
 * <br />売価登録なし品番表示子画面のServiceインターフェースです。
 * <pre>
 * bean id:wt015UnitPriceErrListService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt015UnitPriceErrListService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria UnitPriceErrorListの CriteriaDomain クラス
     * @return UnitPriceErrorListのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt015UnitPriceErrListDomain> searchByCondition(
        Wt015UnitPriceErrListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria UnitPriceErrorListの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt015UnitPriceErrListCriteriaDomain criteria)
        throws ApplicationException;

}