/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;


/**
 * Interface of the service that outputs a Shipping Confirmation form
 * <br />Shipping Confirmation帳票を出力するサービスのインターフェースです。
 * <pre>
 * bean id:l5001ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L5001ReportService {

    /**
     * Search for the information of the Shipping Confirmation, it will generate a Shipping Confirmation form
     * <br />出荷確認の情報を検索し、Shipping Confirmation 帳票を生成します。
     * <pre>
     * - Search shipment confirmation 
     *     - Set to TtShippingFirmCriteriaDomain ttShippingFirmCriteriaDomain the shippingFirmNo 
     *     - The call of TtShippingFirmService.searchByKey an argument ttShippingFirmCriteriaDomain 
     *     - If 0 with reviews, search results error 
     * - Search of transportation type master 
     *     - Set to TmTrnsTypDomain tmTrnsTypDomain TRNS_CD shipment confirmation of results, the TRNS_TYP_CD 
     *     - The call of TmTrnsTypService.searchByKey an argument tmTrnsTypDomain 
     *     - If 0 with reviews, search results error 
     * - Generation of the form 
     * - The return the document file generated
     *
     * - 出荷確認の検索
     *     - shippingFirmNoをTtShippingFirmCriteriaDomain ttShippingFirmCriteriaDomainに設定
     *     - ttShippingFirmCriteriaDomainを引数にTtShippingFirmService.searchByKeyの呼び出し
     *     - 検索結果が0件の場合、エラー
     * - 輸送手段種別マスタの検索
     *     - 出荷確認検索結果のTRNS_CD、TRNS_TYP_CDをTmTrnsTypDomain tmTrnsTypDomainに設定
     *     - tmTrnsTypDomainを引数にTmTrnsTypService.searchByKeyの呼び出し
     *     - 検索結果が0件の場合、エラー
     * - 印刷日付の取得
     *     - CommonService.searchTimezoneの呼び出し
     * - 帳票の生成
     * - 生成した帳票ファイルを返却
     * </pre>
     *
     * @param shippingFirmCriteriaDomain shipping confirmation criteria domain
     * @param reportDateFormat report date format
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchTtShippingFirm(W5001ShippingFirmDomain shippingFirmCriteriaDomain, String reportDateFormat) throws ApplicationException;
}
