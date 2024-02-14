/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L4002ReportDomain;

/**
 * Interface of the service that outputs a Staging Actuality form
 * <br />Staging Actuality帳票を出力するサービスのインターフェースです。
 * <pre>
 * bean id:l4002ReportService
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5687 $
 */
public interface L4002ReportService {

    /**
     * Search for the information of the Staging Actuality, it will generate a Staging Actuality form
     * <br />山作り実績の情報を検索し、Staging Actuality 帳票を生成します。
     * <pre>
     * - Search Staging Actuality
     *     - Set to VtRpStgActCriteriaDomain vtRpStgActCriteriaDomain the l4002ReportDomain.stgActNo
     *     - An argument vtRpStgActCriteriaDomain, Call the VtRpStgActService.searchByCondition
     *     - If 0 with reviews, search results error
     * - Unit conversion
     *     - Use CommonService.convertUnit, and converted to a weight unit of the company's login and the VOLUME GROSS_WEIGHT of search results
     * - QR code generation
     *     - Call the QrcodeGenerator.generateQrcode
     * - Get the printing date
     *     - Call the CommonService.searchTimezone
     * - Convert to L4002ReportDomain l4002ReportDomain result of a call VtRpStgActService.searchByCondition
     * - Generation of the form
     *     - An argument l4002ReportDomain, I invoke the form generation service
     * - The return the document file generated
     *
     * - 山作り実績の検索
     *     - l4002ReportDomain.stgActNoをVtRpStgActCriteriaDomain vtRpStgActCriteriaDomainに設定
     *     - vtRpStgActCriteriaDomainを引数に、VtRpStgActService.searchByConditionの呼び出し
     *     - 検索結果が0件の場合、エラー
     * - 単位変換
     *     - CommonService.convertUnitを使用し、検索結果のGROSS_WEIGHTおよびVOLUMEをログイン者の会社の重量単位に変換
     * - QRコード生成
     *     - QrcodeGenerator.generateQrcodeを呼び出し
     * - 印刷日付の取得
     *     - CommonService.searchTimezoneの呼び出し
     * - VtRpStgActService.searchByConditionの呼び出し結果をL4002ReportDomain l4002ReportDomainに変換
     * - 帳票の生成
     *     - l4002ReportDomainを引数に、帳票生成サービスの呼び出し
     * - 生成した帳票ファイルを返却
     * </pre>
     *
     * @param l4002ReportDomain L4002Report domain
     * @return File stream
     * @throws ApplicationException Application exception
     */
    public File searchTtStgAct(L4002ReportDomain l4002ReportDomain) throws ApplicationException;
}
