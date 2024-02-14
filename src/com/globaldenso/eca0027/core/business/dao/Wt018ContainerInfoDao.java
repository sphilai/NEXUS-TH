/*
 * Project : NEXUS_EXPORT 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt018ContainerInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt018ContainerInfoCriteriaDomain;

/**
 * The search dao implementation class of Container No. Information Sub Screen.
 * <br />
 * コンテナNo表示子画面のDAOインターフェースです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface Wt018ContainerInfoDao {

    /**
     * 
     * <pre>
     * Find the Container No. based on any criteria, it returns the list.
     * Search table(TT_SHIPPING_FIRM).
     * 任意の条件を元にコンテナNo情報を検索し、検索結果をリスト形式で返却します。
     * TT_SHIPPING_FIRMを検索します。
     * </pre>
     * 
     * @param criteria Wt018ItemNoInfoの CriteriaDomain クラス
     * @return criteria Wt018ItemNoInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * 
     */
    public List<Wt018ContainerInfoDomain> searchByConditionTtShippingFirm(
        Wt018ContainerInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 
     * <pre>
     * Find the Container No. based on any criteria, it returns the getting count.
     * Search table(TT_SHIPPING_FIRM).
     * 任意の条件を元に品番情報を検索し、取得件数を返却します。
     * TT_SHIPPING_FIRMを検索します。
     * </pre>
     * 
     * @param criteria Wt018ContainerInfoの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * 
     */
    public int searchCountTtShippingFirm(Wt018ContainerInfoCriteriaDomain criteria)
        throws ApplicationException;
    
}
