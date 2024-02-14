/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt001CompSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt001CompSelectCriteriaDomain;

/**
 * The search dao implementation class of Company Search Sub Screen.
 * <br />
 * 包装材選択子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7347 $
 */

public interface Wt001CompSelectDao {

    /**
     * <pre>
     * Find the Company based on any criteria, it returns the list.(paging)
     * 任意の条件を元にCompanyを検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * @param criteria Wt001CompSelectの Domain クラス
     * @return Wt001CompSelectの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt001CompSelectDomain> searchByConditionForPaging(
        Wt001CompSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the Company based on any criteria, it returns the getting count.
     * 任意の条件を元にCompanyを検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt001CompSelectの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt001CompSelectCriteriaDomain criteria)
        throws ApplicationException;

}
