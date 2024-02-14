/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadOdrDomain;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain;

/**
 * DAO interface of the order upload import job
 * <br />受注アップロード取込ジョブのDAOインタフェース。
 *
 * MGT575 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13653 $
 */
public interface JbOdrUploadDao {

    /**
     * Registration to order upload work
     * <br />受注アップロードワークへの登録。
     *
     * @param odrUploadOdrDomainList Create data domain
     * @return create count
     * @throws ApplicationException Business exception
     */
    public int createOdrUploadWork(final List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException;

    /**
     * Uniqueness check in file
     * ファイル内ユニーク性チェック。
     *
     * @param odrUploadReqDomain request info domain
     * @return search result
     * @throws ApplicationException system error
     */
    public List<? extends B0200OdrUploadOdrDomain> searchCheckUniquenessInsideFile(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Reflect the uniqueness check result on the order upload work
     * <br />ユニーク性チェック結果を受注アップロードワークに反映。
     *
     * @param odrUploadOdrDomainList Update domain data and criteria
     * @return update count
     * @throws ApplicationException business exception
     */
    public int updateOdrUploadWorkByUniquenessInsideFileCheckResults(final List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException;

    /**
     * Data retrieval to pass to CIGMA side check processing
     * <br />CIGMA側チェック処理に渡すデータ検索。
     *
     * @param odrUploadReqDomain request info domain
     * @return search result
     * @throws ApplicationException system error
     */
    public List<? extends B0200OdrUploadOdrDomain> searchCheckRelationCigmaSide(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Reflect the check result of CIGMA side to TW_ODR_UPLOAD
     * <br />CIGMA側チェック結果を受注アップロードワークに反映。
     *
     * @param odrUploadOdrDomainList order domain list
     * @return update count
     * @throws ApplicationException system error
     */
    public int updateOdrUploadWorkByCigmaSideCheckResults(final List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException;

    /**
     * ResultMap for result of NEXUS side check
     * <br />NEXUS側チェック結果のResultMap。
     *
     * @param odrUploadReqDomain request info domain
     * @return search result
     * @throws ApplicationException system error
     */
    public List<? extends B0200OdrUploadOdrDomain> searchCheckRelationNexusSide(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Reflect the check result of NEXUS side to TW_ODR_UPLOAD
     * <br />NEXUS側チェック結果を受注アップロードワークに反映。
     *
     * @param odrUploadOdrDomainList order domain list
     * @return update count
     * @throws ApplicationException system error
     */
    public int updateOdrUploadWorkByNexusSideCheckResults(final List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException;

    /**
     * Check error group of all rows and determine the status of the whole file
     * <br />全行のエラー区分を調査し、ファイル全体のステータスを判定する。
     *
     * @param odrUploadReqDomain request info domain
     * @return search result
     * @throws ApplicationException system error
     */
    public String searchStatusSummary(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Register the deletion target forecast order record to the order upload update work
     * <br />内示削除対象レコードを輸出受注更新ワークへ登録。
     *
     * @param odrUploadReqDomain request info domain
     * @return create count
     * @throws ApplicationException system error
     */
    public int createOdrUploadUpdForFcstReplace(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Delete forecast orders from export orders
     * <br />輸出受注から内示削除。
     *
     * @param odrUploadReqDomain request info domain
     * @return delete count
     * @throws ApplicationException system error
     */
    public int deleteExpOdrForFcstReplace(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Register the record to be registered to the order upload update work
     * <br />登録対象レコードを受注アップロード更新ワークへ登録。
     *
     * @param odrUploadReqDomain request info domain
     * @return create count
     * @throws ApplicationException system error
     */
    public int createExpOdrUpdForAdd(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Register to export order
     * <br />輸出受注へ登録する。
     *
     * @param odrUploadReqDomain request info domain
     * @return create count
     * @throws ApplicationException system error
     */
    public int createExpOdrForAdd(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Update the item name of TM_EXP_FORMALITI_ITEM_NO
     * <br />輸出手続品目番号原単位の品目名称を最新化。
     *
     * @param odrUploadReqDomain request info domain
     * @return update count
     * @throws ApplicationException system error
     */
    public int updateMaItemName(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Register the changing target record in the order upload update work
     * <br />更新対象レコードを受注アップロード更新ワークへ登録。
     *
     * @param odrUploadReqDomain request info domain
     * @return create count
     * @throws ApplicationException system error
     */
    public int createOdrUploadUpdForChg(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Update to export order
     * <br />輸出受注へ更新する。
     *
     * @param odrUploadReqDomain request info domain
     * @return update count
     * @throws ApplicationException system error
     */
    public int updateExpOdrForChg(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;

    /**
     * Delete records when quantity 0 is reached
     * <br />数量0となった場合レコード削除。
     *
     * @param odrUploadReqDomain request info domain
     * @return delete count
     * @throws ApplicationException system error
     */
    public int deleteExpOdrZeroQty(final B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException;
}
