/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;

/**
 * The search dao implementation class of NEXUS Ship to MA Inquiry Screen.
 * <br />
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface W9006NxsShipToMaDao {
    
    /**
     * <pre>
     * Find the NEXUS Ship to MA based on any criteria, it returns the list.(paging)
     * 任意の条件を元にNEXUS送荷先原単位を検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * 
     * @param criteria W9006NxsShipToMaDomainの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W9006NxsShipToMaDomain> searchByConditionForPaging(
        W9006NxsShipToMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the NEXUS Ship to MA based on any criteria, it returns the getting count.
     * 任意の条件を元にNEXUS送荷先原単位を検索し、取得件数を返却します。
     * </pre>
     * 
     * @param criteria W9006NxsShipToMaDomainの Domain クラス
     * @return W9006NxsShipToMaDomainの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9006NxsShipToMaCriteriaDomain criteria)
        throws ApplicationException;

}
