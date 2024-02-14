/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;


import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt005CmlInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt005CmlInfoDomain;



/**
 * The search service implementation class of CML Info Sub
 * Screen. <br />
 * CML情報表示子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt005CmlInfoService {

    /**
     * Search table in any criteria, return the list of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria CmlInfoの CriteriaDomain クラス
     * @return CmlInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public ArrayList<Wt005CmlInfoDomain> searchByCondition(
        Wt005CmlInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search table in any criteria, return the number of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria CmlInfoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt005CmlInfoCriteriaDomain criteria)
        throws ApplicationException;

}
