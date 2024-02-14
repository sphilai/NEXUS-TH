/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt018ContainerInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt018ContainerInfoCriteriaDomain;

/**
 * The search service implementation class of Container Info 
 * Sub Screen. <br />
 * コンテナNo情報表示子画面のServiceインターフェースです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface Wt018ContainerInfoService {

    /**
     * Search table in any criteria, return the list of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria CmlInfoの CriteriaDomain クラス
     * @return CmlInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public ArrayList<Wt018ContainerInfoDomain> searchByCondition(
        Wt018ContainerInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search table in any criteria, return the number of result.
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria CmlInfoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt018ContainerInfoCriteriaDomain criteria)
        throws ApplicationException;
    
}
