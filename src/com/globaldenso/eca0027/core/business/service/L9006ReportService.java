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
 * Interface of the service that provides the output function form [Sample Sales Contract Header(Comercial_Intangible)].
 * <br/>帳票【 Sample Sales Contract Header(Comercial_Intangible) 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l9006ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L9006ReportService {

    /**
     * Get the form output information to generate a form [Sample Sales Contract Header (Comercial_Intangible)] .
     * <br/>帳票出力情報を取得し、帳票【 Sample Sales Contract Header(Comercial_Intangible) 】を生成します。
     * <pre>
     * - The acquisition of fixed image
     *   Call the TmInvTplService.searchByKey (TmInvTplCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 固定イメージの取得
     *       criteriaDomainを引数に{@link TmInvTplService#searchByKey(TmInvTplCriteriaDomain)}を呼び出します。
     *       
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param company search condition
     * @param documentNo search condition
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchSmplSalesCntrctHdrForCmrclIntang(String company, String documentNo) throws ApplicationException;
    
}
