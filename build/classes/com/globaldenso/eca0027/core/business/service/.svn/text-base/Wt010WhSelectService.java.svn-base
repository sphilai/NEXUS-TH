/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt010WhSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt010WhSelectCriteriaDomain;

/**
 * The search service implementation class of Warehouse Search Screen.
 * <br />
 * 倉庫検索画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt010WhSelectService {

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria WhSelectの CriteriaDomain クラス
     * @return WhSelectのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt010WhSelectDomain> searchByConditionForPaging(
        Wt010WhSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria WhSelectの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt010WhSelectCriteriaDomain criteria)
        throws ApplicationException;

}
