/*
 * PROJECT：eca0027
 * 
 * VtRpCmlMixtagErrRep のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/10  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlMixtagErrRepDomain;
 
 
/**
 * VtRpCmlMixtagErrRep のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/10 11:06:48<BR>
 * 
 * テーブル定義から2014/06/10に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface VtRpCmlMixtagErrRepDao {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpCmlMixtagErrRepの CriteriaDomain クラス
     * @return vtRpCmlMixtagErrRepのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpCmlMixtagErrRepDomain> searchByCondition(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpCmlMixtagErrRepの CriteriaDomain クラス
     * @return vtRpCmlMixtagErrRepのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpCmlMixtagErrRepDomain> searchByConditionForPaging(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vtRpCmlMixtagErrRepの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException;


}
