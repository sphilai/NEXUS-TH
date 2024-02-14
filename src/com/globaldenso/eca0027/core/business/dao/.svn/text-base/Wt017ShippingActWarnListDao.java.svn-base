/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;

/**
 * The search dao implementation class of Shipping Actuality Warning List Sub Screen.
 * <br />
 * 船積実績ワーニングリスト表示子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt017ShippingActWarnListDao {

    /**
     * <pre>
     * Find the shipper time zone information based on any criteria, it returns the list.
     * 任意の条件を元に荷主のタイムゾーン情報を検索し、検索結果をリスト形式で返却します。
     * </pre>
     * @param criteria Wt017ShippingActWarnListの Domain クラス
     * @return Wt017ShippingActWarnListの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionTmNxsComp(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the shipper time zone information based on any criteria, it returns the getting count.
     * 任意の条件を元に荷主のタイムゾーン情報を検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt017ShippingActWarnListの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountTmNxsComp(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <pre>
     * Find the shipping actuality warning information based on any criteria, it returns the list.(paging)
     * 任意の条件を元に船積実績ワーニング情報を検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * @param criteria Wt017ShippingActWarnListの Domain クラス
     * @return Wt017ShippingActWarnListの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionForPagingTtInvoice(
        Wt017ShippingActWarnListCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the shipping actuality warning information based on any criteria, it returns the getting count.
     * 任意の条件を元に船積実績ワーニング情報を検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt017ShippingActWarnListの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountTtInvoice(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;
}
