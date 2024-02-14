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
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpInvAtchedForMainService;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;


/**
 * Interface of the service that provides the output function form [Invoice Attached(MAIN)]
 * <br/>帳票【 Invoice Attached(MAIN)  】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l6004ReportService
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public interface L6004ReportService {

    /**
     * Get the form output information to generate a form [Invoice Attached (MAIN)].
     * <br/>帳票出力情報を取得し、帳票【 Invoice Attached(MAIN) 】を生成します。
     * <pre>
     * - The acquisition of fixed image
     *   Call the TmInvTplService.searchByKey (TmInvTplCriteriaDomain) as an argument criteriaDomain.
     *  
     * - Get Invoice Attached data to be set to print details
     *   Call the VtRpInvAtchedForMainService.searchByCondition (VtRpInvAtchedForMainCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0, an error will occur.
     * 
     * - Get Invoice Attached data that is set in the grand total column
     *   Call the RpDocDao.searchTtInvoiceAttachedBySumQty (L6003TtInvoiceAttachedBySumQtyCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 固定イメージの取得
     *       criteriaDomainを引数に{@link TmInvTplService#searchByKey(TmInvTplCriteriaDomain)}を呼び出します。
     *       
     * - 印刷明細にセットするインボイスアタッチデータの取得
     *       criteriaDomainを引数に{@link VtRpInvAtchedForMainService#searchByCondition(VtRpInvAtchedForMainCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 総合計欄にセットするインボイスアタッチデータの取得
     *       criteriaDomainを引数に{@link RpDocDao#searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain)}を呼び出します。
     *       
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param shipper search condition
     * @param invoiceNo search condition
     * @param invoiceIssueDt search condition
     * @param invoiceTemplateNo search condition
     * @param charCd charset
     * @throws ApplicationException application exception
     * @return File file
     */
    public File searchInvAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo, String charCd) 
        throws ApplicationException;
    
}
