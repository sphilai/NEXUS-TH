/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.sql.Timestamp;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpCmlMixtagErrRepService;

/**
 * The interface of the service that provides the [CML-Mix Tag Error Report] output function form.
 * <br/>帳票【 CML-Mix Tag Error Report  】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l2005ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface L2005ReportService {

    /**
     * Get the form output information and generate a document [CML-Mix Tag Error Report].
     * <br/>帳票出力情報を取得し、帳票【 CML-Mix Tag Error Report 】を生成します。
     * <pre>
     * - Get (header, item) of the form information
     *   Call the {@link VtRpCmlMixtagErrRepService#searchByCondition(VtRpCmlMixtagErrRepCriteriaDomain)} as a argument criteria .
     *   Get the number is 0, an error will occur.
     * 
     * - Get user information
     *   Call the {@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)} as a argument criteria.
     * 
     * - Generate the form
     *   Call the form generation method with some arguments such as specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - 帳票情報(ヘッダ、明細)の取得
     *     criteriaを引数に{@link VtRpCmlMixtagErrRepService#searchByCondition(VtRpCmlMixtagErrRepCriteriaDomain)}を呼び出します。
     *     取得件数が0であれば、エラーとします。
     *     
     * - ユーザ情報の取得
     *     criteriaを引数に{@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)}を呼び出します。
     *     
     * - 帳票の生成
     *     明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     *
     * @param dscId search condition
     * @param errRpDate search condition
     * @param formatDate formatDate
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchCmlMixTagErrRep(String dscId, Timestamp errRpDate, String formatDate) throws ApplicationException;
    
}
