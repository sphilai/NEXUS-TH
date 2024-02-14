/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;

/**
 * The search service implementation class of Outer Package Search Sub Screen.
 * <br />
 * 外装選択子画面のServiceインターフェースです。
 * 
 * @author $Author$
 * @version $Revision$
 */

public interface Wt006OuterPkgSelectService {

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria OuterPkgSelectの CriteriaDomain クラス
     * @return OuterPkgSelectのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt006OuterPkgSelectDomain> searchByConditionForPaging(
        Wt006OuterPkgSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria OuterPkgSelectの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt006OuterPkgSelectCriteriaDomain criteria)
        throws ApplicationException;

}
