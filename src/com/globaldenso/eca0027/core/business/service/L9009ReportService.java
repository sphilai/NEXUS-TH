/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;


/**
 * Interface of the service that provides the output function form [Sample Packing Summary].
 * <br/>帳票【Sample Packing Summary】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:L9009ReportService
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public interface L9009ReportService {

    /**
     * Get the form output information to generate a form [Sample Packing Summary].
     * <br/>帳票出力情報を取得し、帳票【 Sample Packing Summary】を生成します。
     * <pre>
     * - The acquisition of fixed image
     *   Call the TmInvTplService.searchByKey (TmInvTplCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Generation of the form
     *   Call form generation method.
     * </pre>
     * <pre>
     * - 固定イメージの取得
     *       criteriaDomainを引数に{@link TmInvTplService#searchByKey(TmInvTplCriteriaDomain)}を呼び出します。
     *       
     * - 帳票の生成
     *       帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param shipper search condition
     * @param invoiceTemplateNo search condition
     * @throws ApplicationException application exception
     * @return File file
     */
    public File searchSamplePackingSummary(String shipper, String invoiceTemplateNo) 
        throws ApplicationException;
    
}
