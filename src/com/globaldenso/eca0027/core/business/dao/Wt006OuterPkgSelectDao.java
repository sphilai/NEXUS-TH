/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;

/**
 * The search dao implementation class of Outer Package Search Sub Screen.
 * <br />
 * 外装選択子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt006OuterPkgSelectDao {

    /**
     * <pre>
     * Find the Outer Package based on any criteria, it returns the list.(paging)
     * 任意の条件を元にOuter Packageを検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * @param criteria Wt006OuterPkgSelectの Domain クラス
     * @return Wt006OuterPkgSelectの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt006OuterPkgSelectDomain> searchByConditionForPaging(
        Wt006OuterPkgSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the Outer Package based on any criteria, it returns the getting count.
     * 任意の条件を元にOuter Packageを検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt006OuterPkgSelectの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt006OuterPkgSelectCriteriaDomain criteria)
        throws ApplicationException;

}
