/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;

/**
 * The search service implementation class of Shipping Actuality Warning List SubScreen. 
 * <br />船積実績ワーニングリスト子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt017ShippingActWarnListService {

    /**
     * 任意の条件を元にNEXUS会社原単位テーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria Wt017ShippingActWarnListの CriteriaDomain クラス
     * @return Wt017ShippingActWarnListのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionTmNxsComp(
        Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 任意の条件を元にNEXUS会社原単位テーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria Wt017ShippingActWarnListの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountTmNxsComp(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * <<ページング処理用>> 任意の条件を元にインボイステーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria Wt017ShippingActWarnListの CriteriaDomain クラス
     * @return Wt017ShippingActWarnListのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt017ShippingActWarnListDomain> searchByConditionForPagingTtInvoice(
        Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 任意の条件を元にインボイステーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria Wt017ShippingActWarnListの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountTtInvoice(Wt017ShippingActWarnListCriteriaDomain criteria)
        throws ApplicationException;

}
