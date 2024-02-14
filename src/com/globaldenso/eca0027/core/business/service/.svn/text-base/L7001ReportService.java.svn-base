/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.dao.RpShippingActDao;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByImporterCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByNoOfInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingActByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingFirmByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7002TtShippingFirmByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * Interface of the service that provides the [Container Loading Plan] output function form.
 * </br>帳票【 Container Loading Plan  】出力機能を提供するサービスのインターフェースです。
* 
* <pre>
* bean id:l7001ReportService
* </pre>
* 
* @author $Author: 400616000304 $
* @version $Revision: 10963 $
*/
public interface L7001ReportService {

    /**
     * Get the form output information to generate a document [Container Loading Plan].
     * </br>帳票出力情報を取得し、帳票【 Container Loading Plan 】を生成します。
     * <pre>
     * - Get (item of common) Head form information
     *   Call the RpShippingActDao.searchTtShippingActByHeader (L7001TtShippingActByHeaderCriteriaDomain) an argument criteriaDomain,
     *    Get the number is 0 , an error will occur .
     * 
     * - Head form Exporter for information acquisition
     *   Call the RpShippingActDao.searchTtPltzByHeader (L7001TtPltzByHeaderCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Head form Importer for information acquisition
     *   Call the RpShippingActDao.searchTtPltzByImporter (L7001TtPltzByImporterCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Head form for NoOfInvoice information acquisition
     *   Call the RpShippingActDao.searchTtPltzByNoOfInvoice (L7001TtPltzByNoOfInvoiceCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Head of information acquisition forms for part list
     *   Call the RpShippingActDao.searchTtShippingFirmByHeader (L7001TtShippingFirmByHeaderCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Head of information acquisition forms for VOLUME
     *   Call the TtPltzService.searchByCondition (TtPltzCriteriaDomain) as an argument criteriaDomain.
     *   Call the CommonService.searchVolumeUnit (String) in the argument shipper.
     * 
     * - Detail form for information ( header list ) acquisition
     *   Call RpShippingActDao # searchTtShippingFirmByDetail the (L7002TtShippingFirmByDetailCriteriaDomain) as an argument criteriaDomain.
     *  
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string , string password , the pdfStream.
     * </pre>
     * <pre>
     * - Head帳票情報(共通の項目)取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtShippingActByHeader(L7001TtShippingActByHeaderCriteriaDomain)}を呼び出し、
     *        取得件数が0であれば、エラーとします。
     * 
     * - Head帳票用Exporter情報取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtPltzByHeader(L7001TtPltzByHeaderCriteriaDomain)}を呼び出します。
     * 
     * - Head帳票用Importer情報取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtPltzByImporter(L7001TtPltzByImporterCriteriaDomain)}を呼び出します。
     * 
     * - Head帳票用NoOfInvoice情報取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtPltzByNoOfInvoice(L7001TtPltzByNoOfInvoiceCriteriaDomain)}を呼び出します。
     * 
     * - Head帳票用一覧部分の情報取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtShippingFirmByHeader(L7001TtShippingFirmByHeaderCriteriaDomain)}を呼び出します。
     * 
     * - Head帳票用容積の情報取得
     *       criteriaDomainを引数に{@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}を呼び出します。
     *       shipperを引数に{@link CommonService#searchVolumeUnit(String)}を呼び出します。
     * 
     * - Detail帳票用情報(ヘッダ・一覧)取得
     *       criteriaDomainを引数に{@link RpShippingActDao#searchTtShippingFirmByDetail(L7002TtShippingFirmByDetailCriteriaDomain)}を呼び出します。
     * 
     * - 帳票の生成
     *       明細List, ヘッダHashMap, テンプレートパス文字列, パスワード文字列, pdfStreamを引数に帳票生成メソッドを呼び出します。
     * </pre>
     * 
     * @param shippingActNo search condition
     * @param shipping search condition
     * @param format date format
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchShippingAct(String shippingActNo, String shipping, String format) throws ApplicationException;
    
}
