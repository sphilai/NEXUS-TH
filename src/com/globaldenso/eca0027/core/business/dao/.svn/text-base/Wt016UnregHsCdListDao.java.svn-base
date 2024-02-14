/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt016UnregHsCdListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt016UnregHsCdListCriteriaDomain;

/**
 * The search dao implementation class of Unregistered HS CODE List Sub Screen.
 * <br />
 * HS CODE登録なし品番表示子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt016UnregHsCdListDao {

    /**
     * <pre>
     * Find the Unregistered HS CODE based on any criteria, it returns the list.
     * 任意の条件を元にHS CODE登録なし品番情報を検索し、検索結果をリスト形式で返却します。
     * </pre>
     * @param criteria Wt016UnregHsCdListの Domain クラス
     * @return Wt016UnregHsCdListの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt016UnregHsCdListDomain> searchByCondition(
        Wt016UnregHsCdListCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the Unregistered HS CODE based on any criteria, it returns the getting count.
     * 任意の条件を元にHS CODE登録なし品番情報を検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt016UnregHsCdListの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt016UnregHsCdListCriteriaDomain criteria)
        throws ApplicationException;

}