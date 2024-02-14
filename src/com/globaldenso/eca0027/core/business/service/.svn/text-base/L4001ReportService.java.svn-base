/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L4001ReportDomain;

/**
 * Interface of the service that outputs a Staging Instruction form
 * <br />Staging Instruction帳票を出力するサービスのインターフェースです。
 * <pre>
 * bean id:l4001ReportService
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5687 $
 */
public interface L4001ReportService {

    /**
     * Search for the information of the Staging Instruction, it will generate a Staging Instruction form
     * <br />荷揃え指示の情報を検索し、Staging Instruction 帳票を生成します。
     * <pre>
     * - Search Staging Instruction
     *     - Set to VtRpStgInstrCriteriaDomain vtRpStgInstrCriteriaDomain the l4001ReportDomain.stgInstrNo
     *     - An argument vtRpStgInstrCriteriaDomain, Call the VtRpStgInstrService.searchByCondition
     *     - If 0 with reviews, search results error
     * - Unit conversion
     *     - Use CommonService.convertUnit, and converted to a weight unit of the company's login and the VOLUME GROSS_WEIGHT of search results
     * - QR code generation
     *     - Call the QrcodeGenerator.generateQrcode
     * - Get the printing date
     *     - Call the CommonService.searchTimezone
     * - Convert to L4001ReportDomain l4001ReportDomain result of a call VtRpStgInstrService.searchByCondition
     * - Generation of the form
     *     - An argument l4001ReportDomain, I invoke the form generation service
     * - The return the document file generated
     *
     * - 荷揃え指示の検索
     *     - l4001ReportDomain.stgInstrNoをVtRpStgInstrCriteriaDomain vtRpStgInstrCriteriaDomainに設定
     *     - vtRpStgInstrCriteriaDomainを引数に、VtRpStgInstrService.searchByConditionの呼び出し
     *     - 検索結果が0件の場合、エラー
     * - 単位変換
     *     - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の会社の重量単位に変換
     * - QRコード生成
     *     - QrcodeGenerator.generateQrcodeを呼び出し
     * - 印刷日付の取得
     *     - CommonService.searchTimezoneの呼び出し
     * - VtRpStgInstrService.searchByConditionの呼び出し結果をL4001ReportDomain l4001ReportDomainに変換
     * - 帳票の生成
     *     - l4001ReportDomainを引数に、帳票生成サービスの呼び出し
     * - 生成した帳票ファイルを返却
     * </pre>
     *
     * @param l4001ReportDomain L4001Report domain
     * @return File stream
     * @throws ApplicationException Application exception
     */
    public File searchTtStgInstr(L4001ReportDomain l4001ReportDomain) throws ApplicationException;
}
