/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;

/**
 * The search service implementation class of Package Search Sub Screen.
 * <br />
 * 包装材選択子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface Wt004PkgSelectService {

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria PkgSelectの CriteriaDomain クラス
     * @return PkgSelectのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt004PkgSelectDomain> searchByConditionForPaging(
        Wt004PkgSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria PkgSelectの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt004PkgSelectCriteriaDomain criteria)
        throws ApplicationException;

}
