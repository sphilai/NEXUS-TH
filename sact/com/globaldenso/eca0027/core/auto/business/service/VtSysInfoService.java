/*
 * PROJECT：eca0027
 * 
 * VtSysInfo のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/01/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtSysInfoDomain;


/**
 * VtSysInfo のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/01/19 16:51:32<BR>
 * 
 * テーブル定義から2015/01/19に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10410 $
 */
public interface VtSysInfoService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtSysInfoの CriteriaDomain クラス
     * @return vtSysInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtSysInfoDomain> searchByCondition(VtSysInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtSysInfoの CriteriaDomain クラス
     * @return vtSysInfoのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtSysInfoDomain> searchByConditionForPaging(VtSysInfoCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vtSysInfoの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VtSysInfoCriteriaDomain criteria) throws ApplicationException;


}
