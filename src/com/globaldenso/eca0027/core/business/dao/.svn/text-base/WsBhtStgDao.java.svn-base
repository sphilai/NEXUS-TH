/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ECA0027_WS_4501Domain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByMainMarkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtXpltzByXMainMarkCriteriaDomain;

/**
 * <p>
 * Dao Class Interface(WsStg)
 * WsStgのDaoインターフェイスです
 * </p>
 * 
 * @version 1.00
 */
public interface WsBhtStgDao {
    /**
     * <p>
     * View Bound TT_STGINSTR,TT_PLTZ
     * 荷揃え指示、パレタイズを結合したビュー
     * </p>
     * 
     * @param inputDomain 検索条件
     * @return List<TtStgInstrExtDomain> 検索結果
     * @throws ApplicationException エラー
     */
    public List<ECA0027_WS_4501Domain> searchTtStgInstrByCondition(
        WS4501TtStgInstrByStgInstrNoCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Lock X-Tag
     * まとめパレタイズのロック
     * </p>
     * 
     * @param inputDomain 入力値
     * @return List<ECA0027_WS_4501Domain> ロックの可否
     * @throws ApplicationException エラー
     */
    public List<ECA0027_WS_4501Domain> lockTtPltzByConditionNoWait(
        WS4501TtPltzByConditionCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Get volume and weight of the main mark
     * メインマークの重量、容積取得
     * </p>
     * 
     * @param inputDomain inputDomain 検索条件
     * @return List<StgDomain> result Domain List 処理結果
     * @throws ApplicationException error アプリ基盤のアプリケーション例外です。
     */
    public List<ECA0027_WS_4501Domain> searchTtPltzByKeys(
        WS4501TtPltzByMainMarkCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Get volume and weight of the X-Tag
     * まとめメインマークの重量、容積取得
     * </p>
     * 
     * @param inputDomain inputDomain 検索条件
     * @return List<StgDomain> result Domain List 処理結果
     * @throws ApplicationException error アプリ基盤のアプリケーション例外です。
     */
    public List<ECA0027_WS_4501Domain> searchTtXpltzByKeys(
        WS4501TtXpltzByXMainMarkCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * Update TT_STG_INSTR.STG_ACT_NO when Staging ACT. register.
     * 山作実績登録時に荷揃指示の山作実績No.を更新します。
     *
     * @param inputMap update data & condition 更新情報・条件です。
     * @return update count 更新件数です。
     * @throws ApplicationException  error アプリ基盤のアプリケーション例外です。
     */
    public int updStgInstrIncludedInStgAct(Map<String, Object> inputMap) throws ApplicationException;
}
