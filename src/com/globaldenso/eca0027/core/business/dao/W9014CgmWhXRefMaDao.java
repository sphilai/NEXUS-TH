/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;

/**
 * The search dao implementation class of CIGMA W/H X-Reference MA Inquiry Screen.
 * <br />
 * CIGMA W/H X-Reference MA Inquiry 画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface W9014CgmWhXRefMaDao {

    /**
     * <pre>
     * Find the W/H information based on any criteria, it returns the getting count.
     * 任意の条件を元に倉庫情報を検索し、取得件数を返却します。
     * </pre>
     *
     * @param w9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMaの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain)
        throws ApplicationException;
    
    /**
     * <pre>
     * Find the W/H information based on any criteria, it returns the list.(paging)
     * 任意の条件を元に倉庫情報を検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * 
     * @param w9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMaの Domain クラス
     * @return W9014CgmWhXRefMaの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<? extends W9014CgmWhXRefMaDomain> searchByConditionForPaging(
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain) throws ApplicationException;


    /**
     * <pre>
     * Find the CIGMA W/H X-Reference MA based on any criteria, it returns the getting count.
     * 任意の条件を元にCIGMA W/H X-Reference MA を検索し、取得件数を返却します。
     * </pre>
     * 
     * @param w9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMaの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCountTmCigmaWhXref(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteriaDomain)
        throws ApplicationException;
}
