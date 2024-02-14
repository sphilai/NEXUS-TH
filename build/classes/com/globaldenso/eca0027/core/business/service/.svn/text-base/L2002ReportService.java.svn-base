/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpMixtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The interface of the service that provides a Mix Tag [] output function form.
 * <br/>帳票【 Mix Tag 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l2002ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L2002ReportService {

    /**
     * Get the form output information to generate a document [Mix Tag].
     * <br/>帳票出力情報を取得し、帳票【 Mix Tag 】を生成します。
     * <pre>
     * - Get (header, item) of the form data
     *   Call {@link VtRpMixtagService#searchByCondition(VtRpMixtagCriteriaDomain)} as an argument criteria.
     *   Get the number is 0, an error will occur.
     * 
     * - WEIGHT UNIT, WEIGHT notation
     *   Call {@link CommonService#searchWeightUnit(String)} in the argument shipperCd.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 帳票データ(ヘッダ、明細)の取得
     *     criteriaを引数に{@link VtRpMixtagService#searchByCondition(VtRpMixtagCriteriaDomain)}を呼び出します。
     *     取得件数が0であれば、エラーとします。
     *     
     * - 重量単位、重量表記
     *     shipperCdを引数に{@link CommonService#searchWeightUnit(String)}を呼び出します。
     *     
     * - 帳票の生成
     *     明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     *
     * @param mixTagNo searchCondition
     * @param formatDate formatDate
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchMixTag(String mixTagNo, String formatDate) throws ApplicationException;
    
}
