/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt008PortSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt008PortSelectCriteriaDomain;

/**
 * The search service implementation class of Port Search Sub Screen. <br />
 * 港選択子画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Wt008PortSelectService {

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria PortSelectの CriteriaDomain クラス
     * @return PortSelectのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<Wt008PortSelectDomain> searchByConditionForPaging(
        Wt008PortSelectCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria PortSelectの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(Wt008PortSelectCriteriaDomain criteria)
        throws ApplicationException;

}
