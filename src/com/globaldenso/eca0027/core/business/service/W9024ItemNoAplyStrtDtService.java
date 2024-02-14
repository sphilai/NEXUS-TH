/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;

/**
 * Service interface Item No. Apply Start Date Refer & Register
 * <br />Item No. Apply Start Date Refer & Registerのサービスインタフェースです。
 * <pre>
 * bean id: W9024ItemNoAplyStrtDtService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $s
 */
public interface W9024ItemNoAplyStrtDtService {

    /**
     * Company presence check
     * <br />Company存在チェック
     *
     * @param company COMPANY CODE<br />
     * 会社コード
     * @return Present false true, there is no<br />
     * true: 存在する, false: 存在しない
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateDatabaseShipper(String company) throws ApplicationException;
    
    /**
     * 
     * <br />権限チェック
     * 
     * @param compCd Company Code
     * @return True if there is no error in the input value, otherwise false.
     * @throws ApplicationException authority check is not possible<br />
     * 権限チェックを出来ない場合
     */
    public boolean validateDatabaseUserAuthCompCd(String compCd) throws ApplicationException;
    
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
    public W9024ItemNoAplyStrtDtItemDomain searchOnRegisterAddOrRefer(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * REVISION check
     * <br />リビジョンチェック
     * 
     * @param revisionNoOld Old REVISION No<br />
     * 旧リビジョンNo
     * @param revisionNoNew New REVISION No<br />
     * 新リビジョンNo
     * @param ignoreWarning Ignore Warning check box<br />
     * Ignore Warningチェックボックス
     * @return true: normal, false: abnormal<br />
     * true: 正常, false: 異常
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public boolean validateConsistencyRevision(int revisionNoOld, int revisionNoNew, boolean ignoreWarning) 
        throws ApplicationException;
    
    /**
     * 
     * Packaging per unit existence check
     * <br />包装仕様原単位存在チェック
     * @param compCd company code
     * @param itemNo item no
     * @param pkgCd package code
     * @param trnsCd trans way code
     * @param rev revision
     * @return check OK is true
     * @throws ApplicationException If an exception occurs<br />例外が発生した場合 
     */
    public boolean validateDatabaseTmPkgSpecHdr(String compCd, String itemNo, String pkgCd, String trnsCd, String rev)
        throws ApplicationException;
    
    /**
     * Reflected in packaging specifications valid REVISION
     * <br />包装仕様有効リビジョンへの反映
     * <pre>
     * - 3.Rock of packaging specifications effective REVISION master
     * - 4.Re-drawing to the screen
     * </pre>
     * <pre>
     * - 3.包装仕様有効リビジョンマスタのロック
     * - 4.画面への再描画
     * </pre>
     * 
     * @param domain Search results domain<br />
     * 検索結果ドメイン
     * @return W9024ItemNoAplyStrtDtItemDomain redraw domain<br />
     * W9024ItemNoAplyStrtDtItemDomain 再描画用ドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W9024ItemNoAplyStrtDtItemDomain createOnRegister(W9024ItemNoAplyStrtDtCriteriaDomain domain) 
        throws ApplicationException;

    /**
     * 
     * Lock the Package Specification Revision Master selected.
     * <br />選択したデータのロックを取得します。
     * 
     * @param compCd Company code
     * @param itemNo Item No
     * @param pkgCd Package code
     * @param trnsCd Trans code
     * @return success(Get Data): true, other: false;
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTmPkgSpecRev(String compCd, String itemNo, String pkgCd, String trnsCd)
        throws ApplicationException;
}
