/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;

/**
 * The search dao implementation class of CIGMA Customer No. X-Reference MA Screen.
 * <br />
 * CIGMA Customer No. X-Reference MA画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface W9011CgmCusNoXRefMaDao {

    /**
     * <pre>
     * Find the consignee information based on any criteria, it returns the getting count.
     * 任意の条件を元に荷受人情報を検索し、取得件数を返却します。
     * </pre>
     *
     * @param criteria W9011CgmCusNoXRefMaDomainの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9011CgmCusNoXRefMaCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * <pre>
     * Find the consignee information based on any criteria, it returns the list.(paging)
     * 任意の条件を元に荷受人情報を検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * 
     * @param criteria W9011CgmCusNoXRefMaDomainの Domain クラス
     * @return W9011CgmCusNoXRefMaDomainの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9011CgmCusNoXRefMaDomain> searchByConditionForPaging(
        W9011CgmCusNoXRefMaCriteriaDomain criteria) throws ApplicationException;
}
