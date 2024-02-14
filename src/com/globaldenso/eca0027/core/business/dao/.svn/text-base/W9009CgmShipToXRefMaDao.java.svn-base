/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;

/**
 * The search dao implementation class of CIGMA Ship to X-Reference MA Inquiry Screen.
 * <br />
 * CIGMA Ship to X-Reference MA Inquiry画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 8054 $
 */
public interface W9009CgmShipToXRefMaDao {

    /**
     * <pre>
     * Find the CIGMA Ship to X-Reference MA information based on any criteria, it returns the getting count.
     * 任意の条件を元にCIGMA Ship to X-Reference MA情報を検索し、取得件数を返却します。
     * </pre>
     *
     * @param criteria W9009CgmShipToXRefMaの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9009CgmShipToXRefMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <pre>
     * Find the CIGMA Ship to X-Reference MA information based on any criteria, it returns the list.(paging)
     * 任意の条件を元にCIGMA Ship to X-Reference MA情報を検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * 
     * @param criteria W9009CgmShipToXRefMaの Domain クラス
     * @return W9009CgmShipToXRefMaの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9009CgmShipToXRefMaDomain> searchByConditionForPaging(
        W9009CgmShipToXRefMaCriteriaDomain criteria) throws ApplicationException;
}
