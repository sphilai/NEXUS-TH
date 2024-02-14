/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt014ShipToSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt014ShipToSelectCriteriaDomain;

/**
 * The search service implementation class of Ship To Search Sub Screen. <br />
 * <br />送荷先選択子画面のServiceインターフェースです。
 * <pre>
 * bean id:wt014ShipToSelectService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt014ShipToSelectService {

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ShipToSelectの CriteriaDomain クラス
     * @return ShipToSelectのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt014ShipToSelectDomain> searchByConditionForPaging(
        Wt014ShipToSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ShipToSelectの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt014ShipToSelectCriteriaDomain criteria)
        throws ApplicationException;

}
