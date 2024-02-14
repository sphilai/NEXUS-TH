/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt016UnregHsCdListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt016UnregHsCdListCriteriaDomain;

/**
 * The search service implementation class of Unregistered HS CODE List Sub
 * Screen. <br />
 * HS CODE登録なし品番表示子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt016UnregHsCdListService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria UnregisteredHsCodeListの CriteriaDomain クラス
     * @return UnregisteredHsCodeListのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt016UnregHsCdListDomain> searchByCondition(
        Wt016UnregHsCdListCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria UnregisteredHsCodeListの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt016UnregHsCdListCriteriaDomain criteria)
        throws ApplicationException;

}
