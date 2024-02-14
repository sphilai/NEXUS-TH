/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;

/**
 * The search dao implementation class of Package Search Sub Screen.
 * <br />
 * 包装材選択子画面のDAOインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt004PkgSelectDao {

    /**
     * <pre>
     * Find the Package based on any criteria, it returns the list.(paging)
     * 任意の条件を元にPackageを検索し、検索結果をリスト形式で返却します。(ページング用)
     * </pre>
     * @param criteria Wt004PkgSelectの Domain クラス
     * @return Wt004PkgSelectの DomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt004PkgSelectDomain> searchByConditionForPaging(
        Wt004PkgSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * <pre>
     * Find the Package based on any criteria, it returns the getting count.
     * 任意の条件を元にPackageを検索し、取得件数を返却します。
     * </pre>
     * @param criteria Wt004PkgSelectの Domain クラス
     * @return Search result number 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt004PkgSelectCriteriaDomain criteria)
        throws ApplicationException;

}
