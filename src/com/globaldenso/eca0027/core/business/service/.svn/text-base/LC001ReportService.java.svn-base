/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpErtDao;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzItemByDetailErtCriteriaDomain;


/**
 * Interface of the service that provides the output function form [CML(E-RT)].
 * <br/>帳票【 CML(E-RT) 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:lc001ReportService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface LC001ReportService {

    /**
     * Get the form output information to generate a form [CML (E-RT)] .
     * <br/>帳票出力情報を取得し、帳票【 CML(E-RT) 】を生成します。
     * <pre>
     * - Get the header information
     *   Call the RpErtDao.searchTtPltzByHeader (LC001TtPltzByHeaderCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0, an error will occur.
     * 
     * - Get detailed information
     *   Call RpErtDao # searchTtPltzItemByDetail the (LC001TtPltzItemByDetailErtCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0, an error will occur.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * <pre>
     * - ヘッダー情報の取得
     *       criteriaDomainを引数に{@link RpErtDao#searchTtPltzByHeader(LC001TtPltzByHeaderCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 明細情報の取得
     *       criteriaDomainを引数に{@link RpErtDao#searchTtPltzItemByDetailErt(LC001TtPltzItemByDetailErtCriteriaDomain)}を呼び出します。
     *       取得件数が0であれば、エラーとします。
     *       
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param cmlNoFrom search condition
     * @param cmlNoTo search condition
     * @param formatDate FormatDate
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchErt(String cmlNoFrom, String cmlNoTo, String formatDate) throws ApplicationException;
    
}
