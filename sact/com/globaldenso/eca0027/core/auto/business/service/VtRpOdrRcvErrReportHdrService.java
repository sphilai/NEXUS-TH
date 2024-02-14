/*
 * PROJECT：eca0027
 * 
 * VtRpOdrRcvErrReportHdr のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpOdrRcvErrReportHdrDomain;


/**
 * VtRpOdrRcvErrReportHdr のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface VtRpOdrRcvErrReportHdrService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpOdrRcvErrReportHdrの CriteriaDomain クラス
     * @return vtRpOdrRcvErrReportHdrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpOdrRcvErrReportHdrDomain> searchByCondition(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpOdrRcvErrReportHdrの CriteriaDomain クラス
     * @return vtRpOdrRcvErrReportHdrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpOdrRcvErrReportHdrDomain> searchByConditionForPaging(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vtRpOdrRcvErrReportHdrの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VtRpOdrRcvErrReportHdrCriteriaDomain criteria) throws ApplicationException;


}
