/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9025ActualItemWeightDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9025ActualItemWeightCriteriaDomain;

/**
 * The Interface of W9025ActualItemWeightService
 *
 */
public interface W9025ActualItemWeightService {

    /**
     * Company presence check
     * <br />Company存在チェック
     *
     * @param ownerComp COMPANY CODE<br />
     * 会社コード
     * @return Present false true, there is no<br />
     * true: 存在する, false: 存在しない
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseOwnerComp(String ownerComp) throws ApplicationException;
    
    /**
     * 
     * <br />権限チェック
     * 
     * @param ownerComp Company Code
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException authority check is not possible<br />
     * 権限チェックを出来ない場合
     */
    public boolean validateDatabaseUserAuthOwnerComp(String ownerComp) throws ApplicationException;
    
    /**
     * Showing target
     * <br />検索対象を表示
     * <pre>
     * - Authorization check. 2.1-2.2 of processing No2
     *   Filter data
     * - 2.Display the search
     *     2.1NEXUS company master + packaging specifications valid REVISION master
     *     2.3. CD packaging related check
     *       Functional specification common: CD packaging related check
     * - Authorization check. 3.2 processing No2
     *     Active control of the Register button
     * </pre>
     * <pre>
     * - 権限チェック。処理No2の2.1～2.2
     *     データ絞り込み
     * - 2.検索対象を表示する
     *     2.1NEXUS会社マスタ　＋　包装仕様有効リビジョンマスタ
     *     2.3.包装コード関連チェック
     *       機能仕様共通：包装コード関連チェック
     * - 権限チェック。処理No2の3.2
     *     Registerボタンの活性制御
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9025ActualItemWeightDomain searchOnRegisterAddOrRefer(W9025ActualItemWeightCriteriaDomain criteria)
        throws ApplicationException;
        
    /**
     * <pre>
     * Reflected in TmW9025ActualItemWeightMA
     * 実測製品重量原単位への反映
     * - Check of Item No exist.
     * - Judgment of function mode.
     * - Case new    : Create of Actual Item Weight MA
     * - Case update : Update of Actual Item Weight MA
     * - 品番存在チェック
     * - 処理モード判定
     * - 新規の場合：実測製品重量原単位の登録
     * - 更新の場合：実測製品重量原単位の更新
     * </pre>
     * @param domain "Target actual item's weight information" <br/>対象案件情報
     * @return TmW9025ActualItemWeightDomain "information for display" </br>表示用情報
     * @throws ApplicationException "In case of Error" </br>エラー発生時
     */
    public W9025ActualItemWeightDomain transactOnRegister(W9025ActualItemWeightCriteriaDomain domain) 
        throws ApplicationException;

    /**
     * 
     * Lock the Package Specification Revision Master selected.
     * <br />選択したデータのロックを取得します。
     * 
     * @param compCd Company code
     * @param itemNo Item No
     * @return success(Get Data): true, other: false;
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTmActualItemWeight(String compCd, String itemNo)
        throws ApplicationException;
}
