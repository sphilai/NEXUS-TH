/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpPrinterPurposeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpOdrRcvErrReportHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService;
import com.globaldenso.eca0027.core.auto.business.service.VmRpPrinterPurposeService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpOdrRcvErrReportHdrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;


/**
 * Interface of the service that provides the [Customer Order Receiving the output function form.
 * <br/>帳票【 Customer Order Receiving 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:lb001ReportService
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 8830 $
 */
public interface LB001ReportService {

    /**
     * Get the form output information to generate a document [Customer Order Receiving].
     * <br/>帳票出力情報を取得し、帳票【 Customer Order Receiving 】を生成します。
     * <pre>
     * - Get own base information
     *   Call TmNxsCompService # searchByCondition the (TtEdiRcvOdrReportCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - Get the header information
     *   Call VtRpOdrRecivingErrReportHdrService # searchByCondition the (VtRpOdrRcvErrReportHdrCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - Get detailed information
     *   Call the TtEdiRcvOdrReportService.searchByCondition (TtEdiRcvOdrReportCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - Search the destination printer
     *   Call the VmRpPrinterPurposeService.searchByCondition (VmRpPrinterPurposeCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - Printer output processing
     *   Call (criteriaDomain) CommonService # printer output processing to the argument criteriaDomain.
     *   Get the number is 0 , an error will occur .
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string , string password , the pdfStream.
     * </pre>
     * <pre>
     * - 自拠点情報の取得
     *       criteriaDomainを引数に{@link TmNxsCompService#searchByCondition(TmNxsCompCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - ヘッダー情報の取得
     *       criteriaDomainを引数に{@link VtRpOdrRcvErrReportHdrService#searchByCondition(VtRpOdrRcvErrReportHdrCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 明細情報の取得
     *       criteriaDomainを引数に{@link TtEdiRcvOdrReportService#searchByCondition(TtEdiRcvOdrReportCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 出力先プリンタを検索
     *        criteriaDomainを引数に{@link VmRpPrinterPurposeService#searchByCondition(VmRpPrinterPurposeCriteriaDomain)}を呼び出します。
     *        取得件数が0であれば、エラーとします。
     *        
     * - プリンタ出力処理
     *        criteriaDomainを引数に{@link CommonService#printPdf(File, int, String)}を呼び出します。
     *        取得件数が0であれば、エラーとします。
     *            
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param shipper search condition
     * @param subCd search condition
     * @param transDate search condition
     * @param CustCd search condition
     * @param lgcyShipTo search condition
     * @param plantCd search condition
     * @param cigmaAds search condition
     * @param formatDate Date format<br />
     * 日付フォーマット
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchOdrRcv(String shipper, String subCd, Date transDate, String CustCd, String lgcyShipTo, String plantCd, Date cigmaAds, String formatDate) throws ApplicationException;
    
}
