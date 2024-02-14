/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPackAtchedForErtService;


/**
 * Interface of the service that provides the output function form [Packing Attached(ERT)].
 * <br/>帳票【 Packing Attached(ERT)  】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l6010ReportService
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public interface L6010ReportService {

    /**
     * Get the form output information to generate a form [Packing Attached (FRT)].
     * <br/>帳票出力情報を取得し、帳票【 Packing Attached(FRT) 】を生成します。
     * <pre>
     * - The acquisition of fixed image
     *   Call the TmInvTplService.searchByKey (TmInvTplCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Get Invoice Attached data to be set to print details
     *   Call the VtRpPackAtchedForErtService.searchByCondition (VtRpPackAtchedForErtCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0, an error will occur.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 固定イメージの取得
     *       criteriaDomainを引数に{@link TmInvTplService#searchByKey(TmInvTplCriteriaDomain)}を呼び出します。
     *       
     * - 印刷明細にセットするインボイスアタッチデータの取得
     *       criteriaDomainを引数に{@link VtRpPackAtchedForErtService#searchByCondition(VtRpPackAtchedForErtCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param shipper search condition
     * @param invoiceNo search condition
     * @param invoiceIssueDt search condition
     * @param invoiceTemplateNo search condition
     * @param formatDate search condition
     * @throws ApplicationException application exception
     * @return File file
     */
    public File searchPackAtchedForErt(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String formatDate)
        throws ApplicationException;
    
}
