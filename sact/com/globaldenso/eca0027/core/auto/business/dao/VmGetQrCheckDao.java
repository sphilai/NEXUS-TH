/*
 * PROJECT：eca0027
 * 
 * VmGetQrCheck のDAOインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;
 
 
/**
 * VmGetQrCheck のDAOインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface VmGetQrCheckDao {

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vmGetQrCheckの CriteriaDomain クラス
     * @return vmGetQrCheckのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VmGetQrCheckDomain> searchByCondition(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException;

    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria vmGetQrCheckの CriteriaDomain クラス
     * @return vmGetQrCheckのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<VmGetQrCheckDomain> searchByConditionForPaging(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria vmGetQrCheckの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException;


}
