/*
 * PROJECT：eca0027
 * 
 * VtRpPltzInstr のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/04/12  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPltzInstrDomain;


/**
 * VtRpPltzInstr のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/04/12 13:45:52<BR>
 * 
 * テーブル定義から2017/04/12に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14083 $
 */
public interface VtRpPltzInstrService {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpPltzInstrの CriteriaDomain クラス
     * @return vtRpPltzInstrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpPltzInstrDomain> searchByCondition(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vtRpPltzInstrの CriteriaDomain クラス
     * @return vtRpPltzInstrのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VtRpPltzInstrDomain> searchByConditionForPaging(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vtRpPltzInstrの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException;


}
