/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpXtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpXtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpXtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;


/**
 * The interface of the service that provides the output function form [(X) CML].
 * <br/>帳票【 CML(X) 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l2004ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L2004ReportService {

    /**
     * Get the form output information and generate a form [CML (X)]..
     * <br/>帳票出力情報を取得し、帳票【 CML(X) 】を生成します。
     * <pre>
     * - Get the form information (header, item),
     *   Call {@link VtRpXtagService#searchByCondition(VtRpXtagCriteriaDomain)} as an argument criteria.
     *   Get the number is 0, an error will occur.
     * 
     * - Get WEIGHT UNIT, WEIGHT of notation
     *   Call {@link CommonService#searchWeightUnit(String)} as an argument {@link VtRpXtagDomain}.
     * 
     * - VOLUME UNIT acquisition of company
     *   Call {@link CommonService#searchVolumeUnit(String)} as an argument {@link VtRpXtagDomain}.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 帳票情報(ヘッダ、明細)の取得
     *     criteriaを引数に{@link VtRpXtagService#searchByCondition(VtRpXtagCriteriaDomain)}を呼び出します。
     *     取得件数が0であれば、エラーとします。
     *     
     * - 重量単位、重量表記の取得
     *     {@link VtRpXtagDomain}を引数に{@link CommonService#searchWeightUnit(String)}を呼び出します。
     *     
     * - 会社の容積単位取得
     *     {@link VtRpXtagDomain}を引数に{@link CommonService#searchVolumeUnit(String)}を呼び出します。
     *     
     * - 帳票の生成
     *     明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     *
     * @param xTagNo search condition
     * @param compCd search condition
     * @param formatDate formatDate
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchXtag(String xTagNo, String compCd, String formatDate) throws ApplicationException;
    
}
