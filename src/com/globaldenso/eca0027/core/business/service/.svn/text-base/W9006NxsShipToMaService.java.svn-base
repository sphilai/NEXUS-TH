/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;

/**
 * The search service implementation class of NEXUS Ship to MA Inquiry Screen.
 * 
 * <br />NEXUS Ship to MA Inquiry画面のServiceインターフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public interface W9006NxsShipToMaService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria NxsShipToMaInquiryの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W9006NxsShipToMaDomain> searchByConditionForPaging(
        W9006NxsShipToMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>> 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria NxsShipToMaInquiryの CriteriaDomain クラス
     * @return NxsShipToMaInquiryのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W9006NxsShipToMaCriteriaDomain criteria)
        throws ApplicationException;

}
