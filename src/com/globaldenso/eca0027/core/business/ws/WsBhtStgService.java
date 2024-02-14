/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ECA0027_WS_4501Domain;
import com.globaldenso.eca0027.core.business.domain.Ws4502UpdateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4502WsUpdateStgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4503CreateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4504ProcessFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4503CreateFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4504ProcessFacadeServiceInputDomain;

/**
 * <p>
 * WS4 Service Interface
 * Ws4のサービスのインターフェイス
 * </p>
 * 
 * @version 1.00
 */
public interface WsBhtStgService {
    /**
     * <p>
     * Staging Search
     * Ws4501 荷揃え検索
     * </p>
     * 
     * @param inputdomain 荷揃え検索用入出力ドメイン
     * @return List<VtStgInstrDomain> 
     * @throws ApplicationException Error エラー
     */
    public List<ECA0027_WS_4501Domain> searchStgInstr(
        WS4501TtStgInstrByStgInstrNoCriteriaDomain inputdomain) throws ApplicationException;

    /**
     * <p>
     * Staging Instruction Lock
     * Ws4502 荷揃え指示情報のロック
     * </p>
     * 
     * @param inputDomain InputDomain 入力ドメイン
     * @return TtStgInstrDomain ResultDomain 検索結果
     * @throws ApplicationException Error エラー
     */
    public TtStgInstrDomain validateDatabaseTtStgInstrOnStgInstr(
        TtStgInstrCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Palletize Lock
     * Ws4502 パレタイズのロック（キー指定のロックでないため、新規作成）
     * </p>
     * 
     * @param inputDomain InputDomain 入力ドメイン
     * @return List<ECA0027_WS_4501Domain> ResultDomainList 実行結果
     * @throws ApplicationException Error エラー
     */
    public List<ECA0027_WS_4501Domain> validateDatabaseTtPltzOnStgInstr(
        WS4501TtPltzByConditionCriteriaDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Get User Information, Update Staging Instruction, Update Palletize Information
     * Ws4502 ユーザ情報取得、荷揃え指示情報更新、パレタイズ情報更新
     * </p>
     * 
     * @param inputDomain Input Domain 入力ドメイン
     * @return Ws4502UpdateFacadeServiceResultDomain 実行結果
     * @throws ApplicationException Error エラー
     */
    public Ws4502UpdateFacadeServiceResultDomain updateStgInstr(Ws4502WsUpdateStgInstrDomain inputDomain)
        throws ApplicationException;

    /**
     * <p>
     * Calculate Registration Information
     * Ws4503 登録情報の算出
     * </p>
     * 
     * <pre>
     * 1)Get User Information
     * 2)Calculate weight of the main mark
     * 3)Calculate weight of the main mark
     * 4)Calculate volume of the main mark
     * 5)Calculate volume of the main mark
     * 6)Get Staging Actuality Information
     * 7)Register Staging Actuality Information
     * 8)Update Palletize Information
     * 
     * 1)ユーザ情報取得
     * 2)パレタイズ (重量の算出)
     * 3)まとめパレタイズ (重量の算出)
     * 4)パレタイズ (容積の算出)
     * 5)まとめパレタイズ (容積の算出)
     * 6)山作り実績Noの取得
     * 7)山作り実績登録
     * 8)パレタイズ情報更新
     * </pre>
     * 
     * @param inputDomain Input Domain 入力値
     * @return Ws4503ResultDomain Result Domain 算出結果
     * @throws ApplicationException Error エラー
     */
    public Ws4503CreateFacadeServiceResultDomain createStgAct(
        Ws4503CreateFacadeServiceInputDomain inputDomain) throws ApplicationException;

    /**
     * <p>
     * Sheet Output
     * Ws4504 帳票出力
     * </p>
     * 
     * @param inputDomain 入力ドメイン
     * @return Ws4504UpdateFacadeServiceResultDomain 出力結果
     * @throws ApplicationException エラー
     */
    public Ws4504ProcessFacadeServiceResultDomain printStgAct(
        Ws4504ProcessFacadeServiceInputDomain inputDomain) throws ApplicationException;
}