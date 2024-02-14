/*
 * PROJECT：eca0027
 * 
 * VtRpPackHdrForMain のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForMainDomain;


/**
 * VtRpPackHdrForMain のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface VtRpPackHdrForMainService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpPackHdrForMainの CriteriaDomain クラス
     * @return vtRpPackHdrForMainのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpPackHdrForMainDomain> searchByCondition(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpPackHdrForMainの CriteriaDomain クラス
     * @return vtRpPackHdrForMainのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpPackHdrForMainDomain> searchByConditionForPaging(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vtRpPackHdrForMainの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException;


}
