/*
 * Project : NEXUS_EXPORT 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;

/**
 * The search dao implementation class of Item No. Information Sub Screen.
 * <br />
 * 品番表示子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt007ItemNoInfoDao {

    /**
     * 
     * <pre>
     * Find the Item No. based on any criteria, it returns the list.
     * Search table(TT_PLTZ_ITEM).
     * 任意の条件を元に品番情報を検索し、検索結果をリスト形式で返却します。
     * TT_PLTZ_ITEMを検索します。
     * </pre>
     * 
     * @param criteria Wt007ItemNoInfoの CriteriaDomain クラス
     * @return criteria Wt007ItemNoInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt007ItemNoInfoDomain> searchByConditionTtPltzItem(
        Wt007ItemNoInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 
     * <pre>
     * Find the Item No. based on any criteria, it returns the list.
     * Search table(TT_MIXTAG_ITEM_NO).
     * 任意の条件を元に品番情報を検索し、検索結果をリスト形式で返却します。
     * TT_MIXTAG_ITEM_NOを検索します。
     * </pre>
     * 
     * @param criteria Wt007ItemNoInfoの CriteriaDomain クラス
     * @return criteria Wt007ItemNoInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * 
     */
    public List<Wt007ItemNoInfoDomain> searchByConditionTtMixtagItemNo(
        Wt007ItemNoInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 
     * <pre>
     * Find the Item No. based on any criteria, it returns the getting count.
     * Search table(TT_PLTZ_ITEM).
     * 任意の条件を元に品番情報を検索し、取得件数を返却します。
     * TT_PLTZ_ITEMを検索します。
     * </pre>
     * 
     * @param criteria Wt007ItemNoInfoの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * 
     */
    public int searchCountTtPltzItem(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * 
     * <pre>
     * Find the Item No. based on any criteria, it returns the getting count.
     * Search table(TT_MIXTAG_ITEM_NO).
     * 任意の条件を元に品番情報を検索し、取得件数を返却します。
     * TT_MIXTAG_ITEM_NOを検索します。
     * </pre>
     * 
     * @param criteria Wt007ItemNoInfoの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * 
     */
    public int searchCountTtMixtagItemNo(Wt007ItemNoInfoCriteriaDomain criteria)
        throws ApplicationException;

}
